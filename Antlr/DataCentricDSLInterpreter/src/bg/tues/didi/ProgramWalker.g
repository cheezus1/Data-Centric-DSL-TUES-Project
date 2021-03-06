tree grammar ProgramWalker;

options {
  tokenVocab=DataCentricDSL;
  ASTLabelType=CommonTree;
}
 
@header {
  package bg.tues.didi;
  import bg.tues.didi.*;
  import bg.tues.didi.tree.*;
  import bg.tues.didi.tree.functions.PrintlnNode;
  import bg.tues.didi.tree.functions.PrintNode;
  import bg.tues.didi.tree.functions.QueryNode;
  import bg.tues.didi.tree.expressions.operations.*;
  import java.util.Map; 
  import java.util.HashMap;
  import java.io.PrintStream;
  import java.util.List;
  import java.util.ArrayList;
  import java.sql.Connection;
  import java.sql.ResultSet;
  import java.sql.Statement;
  import java.sql.SQLException;
  import java.sql.ResultSetMetaData;
  import java.util.Arrays;
  import bg.tues.didi.tree.functions.UpdateNode;
}

@members {
  public Map<String, Function> functions = null;
  public Map<String, Object> context = new HashMap<String, Object>();
  Scope currentScope = null;
  Scope globalScope = null;
  private Connection dataSource;
  private PrintStream outputStream;
  
  public ProgramWalker(TreeNodeStream input, Scope scope, Map<String, Function> fns) {
    super(input, new RecognizerSharedState());
    this.globalScope = scope;
    this.functions = fns;
    outputStream = System.out;
  }
  
  public ProgramWalker(TreeNodeStream input, Map<String, Object> context, Map<String, Function> fns) {
    super(input, new RecognizerSharedState());
    this.globalScope = new Scope();
    resolveOptions(context);
    this.functions = fns;
  }
    
  public ProgramWalker(TreeNodeStream input, Scope scope, Map<String, Object> context, Map<String, Function> fns) {
    super(input, new RecognizerSharedState());
    this.globalScope = scope;
    resolveOptions(context);
    this.functions = fns;
  }
  
  public ProgramWalker(TreeNodeStream input, RecognizerSharedState state, Scope scope, Map<String, Object> context, Map<String, Function> fns) {
    super(input, state);
    this.globalScope = scope;
    resolveOptions(context);
    this.functions = fns;
  }
  
  private void resolveOptions(Map<String, Object> context) {
    dataSource = (Connection) context.get("dataSource");
    PrintStream o = (PrintStream) context.get("outputStream");
    if(o == null) {
      outputStream = System.out;
    } else {
      outputStream = o;
    }
  }
}

program returns [Value returnValue]
  :  block{
      returnValue = $block.node.evaluate(); 
    } 
  ;
 
block returns [Node node]
@init {
  BlockNode bn = new BlockNode();
  node = bn;
  if(currentScope == null) {
    currentScope = globalScope;
  } else {
    Scope scope = new Scope(currentScope);
    currentScope = scope;
  }
}
@after { 
  if(currentScope != null){
    currentScope = currentScope.parent();
  }
} 
  :  ^(BLOCK 
        ^( STATEMENTS (statement  {bn.addStatement($statement.node);})* ) 
        ^( RETURN     (expression {bn.addReturn($expression.node);  })? )
      )
  ;

statement returns [Node node]
  :  assignment     {node = $assignment.node;}
  |  functionCall   {node = $functionCall.node;}
  |  ifStatement    {node = $ifStatement.node;}
  |  forStatement   {node = $forStatement.node;} 
  |  whileStatement {node = $whileStatement.node;}
  |  incrementation {node = $incrementation.node;}
  |  query {node = $query.node;}
  |  update {node = $update.node;}
  |  println {node = $println.node;}
  |  print {node = $print.node;}
  ;

query returns [Node node]
  : ^('query' expression) {node = new QueryNode($expression.node, dataSource);}
  ;

update returns [Node node]
  : ^('update' expression) {node = new UpdateNode($expression.node, dataSource, outputStream);}
  ;

variableCall returns [String value]:
  Identifier {value=$Identifier.text;}
;

assignment returns [Node node] 
  :  ^(ASSIGNMENT i=Identifier x=indexes? (expression {node = new AssignmentNode($i.text, $x.e, $expression.node, currentScope);}))
  |  ^('global' ASSIGNMENT i=Identifier x=indexes? (expression {
        Scope globalScope = currentScope;
        
        while(!(globalScope.isGlobalScope())){
          globalScope = globalScope.parent();
        }
        node = new AssignmentNode($i.text, $x.e, $expression.node, globalScope);
        }))
  ;

functionCall returns [Node node]
  :  ^(FUNC_CALL Identifier exprList?) {
        
        int paramSize = 0;
        if($exprList.e == null){
            paramSize = 0;
        }else{
            paramSize = $exprList.e.size();
        }
      Function function = new Function(functions.get($Identifier.text + paramSize));
      function.setParameters(paramSize == 0 ? new ArrayList<Node>() : $exprList.e);
      function.setFunctions(functions);
      
      Map<String, Object> newContext = new HashMap<String, Object>();
      newContext.put("dataSource", dataSource);
      newContext.put("outputStream", outputStream);
      
      function.setContext(newContext);
      function.setScope(new Scope(currentScope));
      node = function;
      
  }
  |  ^(FUNC_CALL Assert expression) 
  |  ^(FUNC_CALL Size expression)
  ;

println returns [Node node]
  :  ^(PRINTLN expression?) {node = new PrintlnNode($expression.node, outputStream);}
  ;
  
print returns [Node node]
  : ^(PRINT expression?) {node = new PrintNode($expression.node, outputStream);}
  ;
  
ifStatement returns [Node node]
@init  {
  IfNode ifNode = new IfNode();
  node = ifNode;
}
  :  ^(IF 
       (^(EXP expression b1=block) {ifNode.addChoice($expression.node, $b1.node);  })+ 
       (^(EXP b2=block)            {ifNode.addChoice(new AtomNode(true), $b2.node);})?
     )
  ;
   
forStatement returns [Node node]
  :  ^(For a=assignment b=expression c=afterthought d=block) {node = new ForNode($a.node, $b.node, $c.node, $d.node, currentScope);}
  ;

afterthought returns [Node node]
  : ((Identifier '=' expression {node = new AssignmentNode($Identifier.text, $expression.node, currentScope);}) 
  | incrementation {node = $incrementation.node;})
;

whileStatement returns [Node node]
  :  ^(While expression block) {node = new WhileNode($expression.node, $block.node);}
  ;

idList returns [java.util.List<String> i]
  :  ^(ID_LIST Identifier+)
  ;

exprList returns [java.util.List<Node> e]
@init {
  e = new ArrayList<Node>();
}
  :  ^(EXP_LIST (a=expression {e.add($a.node);})+)
  ; 

expression returns [Node node]
  :  ^(TERNARY expression expression expression)
  |  ^(In expression expression)
  |  ^('||' a=expression b=expression) {node = new OrNode($a.node, $b.node);}
  |  ^('&&' a=expression b=expression) {node = new AndNode($a.node, $b.node);}
  |  ^('==' a=expression b=expression) {node = new EqualsNode($a.node, $b.node);}
  |  ^('!=' a=expression b=expression) {node = new NotEqualsNode($a.node, $b.node);}
  |  ^('>=' a=expression b=expression) {node = new GreaterThanAndEqualsNode($a.node, $b.node);}
  |  ^('<=' a=expression b=expression) {node = new LessThanAndEqualsNode($a.node, $b.node);}
  |  ^('>' a=expression b=expression) {node = new GreaterThanNode($a.node, $b.node);}
  |  ^('<' a=expression b=expression) {node = new LessThanNode($a.node, $b.node);}
  |  ^('+' a=expression b=expression) {node = new AddNode($a.node, $b.node);}
  |  ^('-' a=expression b=expression) {node = new SubNode($a.node, $b.node);}
  |  ^('*' a=expression b=expression) {node = new MultiplicationNode($a.node, $b.node);}
  |  ^('/' a=expression b=expression) {node = new DivisionNode($a.node, $b.node);}
  |  ^('%' a=expression b=expression) {node = new ModNode($a.node, $b.node);}
  |  ^('^' a=expression b=expression) {node = new PowerNode($a.node, $b.node);}
  |  ^(UNARY_MIN a=expression){node = new AtomNode("-" + $a.node);}
  |  ^(NEGATE a=expression) {node = new BoolNegationNode($a.node);}
  |  Number {node = new AtomNode(Double.parseDouble($Number.text));}
  |  Bool {node = new AtomNode(new Boolean($Bool.text));} 
  |  Null
  |  lookup {node = $lookup.node;}  
  |  query {node = $query.node;}
  |  functionCall {node = $functionCall.node;}
  ;

incrementation returns [Node node]
  : (variableCall ('++'{node = new IncrementationNode($variableCall.value,1,currentScope);}
  | '--' {node = new IncrementationNode($variableCall.value,-1,currentScope);})
  )
;

lookup returns [Node node]
  :  ^(LOOKUP list indexes?)
  |  ^(LOOKUP expression indexes?) 
  |  ^(LOOKUP i=Identifier x=indexes?) 
      {
        node = ($x.e != null) ? 
          new LookupNode(new IdentifierNode($i.text, currentScope), $x.e) : 
          new IdentifierNode($i.text, currentScope);
      }
  |  ^(LOOKUP String indexes?) {
        node = new AtomNode($String.text);
      }
  ;
  
list returns [Node node]
  :  ^(LIST exprList?)
  ;

indexes returns [java.util.List<Node> e]
@init {e = new java.util.ArrayList<Node>();}
  :  ^(INDEXES (expression {e.add($expression.node);})+)
  ;
  
/**
 * generated by Xtext
 */
package bg.tues.validation;

import bg.tues.didi.BooleanValue;
import bg.tues.didi.Condition;
import bg.tues.didi.ConditionElement;
import bg.tues.didi.ConditionStatement;
import bg.tues.didi.DidiModel;
import bg.tues.didi.DidiPackage;
import bg.tues.didi.ElseFragment;
import bg.tues.didi.ElseIfFragment;
import bg.tues.didi.Expression;
import bg.tues.didi.ForStatement;
import bg.tues.didi.FunctionCall;
import bg.tues.didi.FunctionDefinition;
import bg.tues.didi.IfFragment;
import bg.tues.didi.IfStatement;
import bg.tues.didi.QueryFunction;
import bg.tues.didi.ReturnStatement;
import bg.tues.didi.Statement;
import bg.tues.didi.UpdateFunction;
import bg.tues.didi.VariableCall;
import bg.tues.didi.VariableDefinition;
import bg.tues.didi.WhileStatement;
import bg.tues.validation.AbstractDidiValidator;
import bg.tues.validation.ErrorMessages;
import bg.tues.validation.ValidationUtils;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class DidiValidator extends AbstractDidiValidator {
  @Check
  public void checkQueryFunctionParameter(final QueryFunction qf) {
    ConditionStatement _queryArgument = qf.getQueryArgument();
    ConditionStatement expression = ((ConditionStatement) _queryArgument);
    EList<Condition> _conditions = expression.getConditions();
    Condition _get = _conditions.get(0);
    Condition condition = ((Condition) _get);
    boolean _and = false;
    boolean _and_1 = false;
    EList<Condition> _conditions_1 = expression.getConditions();
    int _length = ((Object[])Conversions.unwrapArray(_conditions_1, Object.class)).length;
    boolean _equals = (_length == 1);
    if (!_equals) {
      _and_1 = false;
    } else {
      EList<ConditionElement> _conditionElements = condition.getConditionElements();
      int _length_1 = ((Object[])Conversions.unwrapArray(_conditionElements, Object.class)).length;
      boolean _equals_1 = (_length_1 == 1);
      _and_1 = _equals_1;
    }
    if (!_and_1) {
      _and = false;
    } else {
      _and = (!(condition.getConditionElements().get(0) instanceof BooleanValue));
    }
    if (_and) {
      return;
    }
    this.error(ErrorMessages.QUERY_FUNCTION_PARAMETER_BOOLEAN_EXPRESSION, 
      DidiPackage.Literals.QUERY_FUNCTION__QUERY_ARGUMENT);
  }
  
  @Check
  public void checkUpdateFunctionParameter(final UpdateFunction uf) {
    ConditionStatement _updateArgument = uf.getUpdateArgument();
    ConditionStatement expression = ((ConditionStatement) _updateArgument);
    EList<Condition> _conditions = expression.getConditions();
    Condition _get = _conditions.get(0);
    Condition condition = ((Condition) _get);
    boolean _and = false;
    boolean _and_1 = false;
    EList<Condition> _conditions_1 = expression.getConditions();
    int _length = ((Object[])Conversions.unwrapArray(_conditions_1, Object.class)).length;
    boolean _equals = (_length == 1);
    if (!_equals) {
      _and_1 = false;
    } else {
      EList<ConditionElement> _conditionElements = condition.getConditionElements();
      int _length_1 = ((Object[])Conversions.unwrapArray(_conditionElements, Object.class)).length;
      boolean _equals_1 = (_length_1 == 1);
      _and_1 = _equals_1;
    }
    if (!_and_1) {
      _and = false;
    } else {
      _and = (!(condition.getConditionElements().get(0) instanceof BooleanValue));
    }
    if (_and) {
      return;
    }
    this.error(ErrorMessages.UPDATE_FUNCTION_PARAMETER_BOOLEAN_EXPRESSION, 
      DidiPackage.Literals.UPDATE_FUNCTION__UPDATE_ARGUMENT);
  }
  
  @Check
  public void validateFunctionDefinition(final FunctionDefinition fd) {
    EObject _eContainer = fd.eContainer();
    if ((!(_eContainer instanceof DidiModel))) {
      this.error(ErrorMessages.FUNCTION_WITHIN_BLOCK_STATEMENT, 
        DidiPackage.Literals.FUNCTION_DEFINITION__NAME);
      return;
    } else {
      boolean _functionIsDefinedBeforeTheCode = ValidationUtils.functionIsDefinedBeforeTheCode(fd);
      boolean _not = (!_functionIsDefinedBeforeTheCode);
      if (_not) {
        this.error(ErrorMessages.FUNCTIONS_BEGINNING_OF_CODE, 
          DidiPackage.Literals.FUNCTION_DEFINITION__NAME);
        return;
      }
      boolean _functionWithTheSameNameExists = ValidationUtils.functionWithTheSameNameExists(fd);
      if (_functionWithTheSameNameExists) {
        this.error(ErrorMessages.FUNCTION_SAME_NAME_AND_PARAMETERS, 
          DidiPackage.Literals.FUNCTION_DEFINITION__NAME);
        return;
      }
      EObject _eContainer_1 = fd.eContainer();
      EList<EObject> _eContents = _eContainer_1.eContents();
      String _name = fd.getName();
      ValidationUtils.checkIfFunctionIsUsed(_eContents, _name);
      if ((!ValidationUtils.functionIsUsed)) {
        String _name_1 = fd.getName();
        this.warning(ErrorMessages.UNUSED_FUNCTION, 
          DidiPackage.Literals.FUNCTION_DEFINITION__NAME, 
          ErrorMessages.UNUSED_FUNCTION, _name_1);
      }
      ValidationUtils.functionIsUsed = false;
    }
  }
  
  @Check
  public void checkConditionElementCompatibility(final Condition c) {
    EList<ConditionElement> _conditionElements = c.getConditionElements();
    int _length = ((Object[])Conversions.unwrapArray(_conditionElements, Object.class)).length;
    boolean _greaterThan = (_length > 1);
    if (_greaterThan) {
      EList<ConditionElement> _conditionElements_1 = c.getConditionElements();
      ConditionElement leftOperand = _conditionElements_1.get(0);
      EList<ConditionElement> _conditionElements_2 = c.getConditionElements();
      ConditionElement rightOperand = _conditionElements_2.get(1);
      String _op = c.getOp();
      String errorMessage = ValidationUtils.operandsCOmpatibilityErrorMessage(leftOperand, rightOperand, _op);
      boolean _notEquals = (!Objects.equal(errorMessage, null));
      if (_notEquals) {
        boolean _contains = errorMessage.contains("operator");
        if (_contains) {
          this.error(errorMessage, 
            DidiPackage.Literals.CONDITION__OP);
        } else {
          this.error(errorMessage, 
            DidiPackage.Literals.CONDITION__CONDITION_ELEMENTS);
        }
      }
    }
  }
  
  @Check
  public void checkIfCalledFunctionExists(final FunctionCall fc) {
    EObject container = ValidationUtils.getDidiModel(fc);
    EList<EObject> _eContents = container.eContents();
    Object[] _array = _eContents.toArray();
    final Iterable<FunctionDefinition> elements = Iterables.<FunctionDefinition>filter(((Iterable<?>)Conversions.doWrapArray(_array)), FunctionDefinition.class);
    String _calledFunctionName = fc.getCalledFunctionName();
    boolean _functionIsDefined = ValidationUtils.functionIsDefined(((FunctionDefinition[])Conversions.unwrapArray(elements, FunctionDefinition.class)), _calledFunctionName);
    if (_functionIsDefined) {
      return;
    }
    String _calledFunctionName_1 = fc.getCalledFunctionName();
    this.error(ErrorMessages.UNDEFINED_FUNCTION, 
      DidiPackage.Literals.FUNCTION_CALL__CALLED_FUNCTION_NAME, 
      ErrorMessages.UNDEFINED_FUNCTION, _calledFunctionName_1);
  }
  
  @Check
  public void checkIfCalledFunctionArgumentsCountMatches(final FunctionCall fc) {
    EObject container = ValidationUtils.getDidiModel(fc);
    EList<EObject> _eContents = container.eContents();
    Object[] _array = _eContents.toArray();
    Iterable<FunctionDefinition> elements = Iterables.<FunctionDefinition>filter(((Iterable<?>)Conversions.doWrapArray(_array)), FunctionDefinition.class);
    final Iterable<FunctionDefinition> _converted_elements = (Iterable<FunctionDefinition>)elements;
    String _calledFunctionName = fc.getCalledFunctionName();
    boolean _functionIsDefined = ValidationUtils.functionIsDefined(((FunctionDefinition[])Conversions.unwrapArray(_converted_elements, FunctionDefinition.class)), _calledFunctionName);
    if (_functionIsDefined) {
      final Iterable<FunctionDefinition> _converted_elements_1 = (Iterable<FunctionDefinition>)elements;
      int _length = ((Object[])Conversions.unwrapArray(_converted_elements_1, Object.class)).length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for (final Integer i : _doubleDotLessThan) {
        boolean _and = false;
        final Iterable<FunctionDefinition> _converted_elements_2 = (Iterable<FunctionDefinition>)elements;
        FunctionDefinition _get = ((FunctionDefinition[])Conversions.unwrapArray(_converted_elements_2, FunctionDefinition.class))[(i).intValue()];
        String _name = _get.getName();
        String _calledFunctionName_1 = fc.getCalledFunctionName();
        boolean _equals = _name.equals(_calledFunctionName_1);
        if (!_equals) {
          _and = false;
        } else {
          final Iterable<FunctionDefinition> _converted_elements_3 = (Iterable<FunctionDefinition>)elements;
          FunctionDefinition _get_1 = ((FunctionDefinition[])Conversions.unwrapArray(_converted_elements_3, FunctionDefinition.class))[(i).intValue()];
          EList<String> _parameters = _get_1.getParameters();
          int _length_1 = ((Object[])Conversions.unwrapArray(_parameters, Object.class)).length;
          EList<Expression> _arguments = fc.getArguments();
          int _length_2 = ((Object[])Conversions.unwrapArray(_arguments, Object.class)).length;
          boolean _equals_1 = (_length_1 == _length_2);
          _and = _equals_1;
        }
        if (_and) {
          final Iterable<FunctionDefinition> _converted_elements_4 = (Iterable<FunctionDefinition>)elements;
          FunctionDefinition _get_2 = ((FunctionDefinition[])Conversions.unwrapArray(_converted_elements_4, FunctionDefinition.class))[(i).intValue()];
          boolean _functionIsDefinedBeforeTheCode = ValidationUtils.functionIsDefinedBeforeTheCode(_get_2);
          boolean _not = (!_functionIsDefinedBeforeTheCode);
          if (_not) {
            String _calledFunctionName_2 = fc.getCalledFunctionName();
            this.error(ErrorMessages.UNDEFINED_FUNCTION, 
              DidiPackage.Literals.FUNCTION_CALL__CALLED_FUNCTION_NAME, 
              ErrorMessages.UNDEFINED_FUNCTION, _calledFunctionName_2);
          }
          return;
        }
      }
      this.error(ErrorMessages.FUNCTION_CALL_ARGUMENTS_MISMATCH, 
        DidiPackage.Literals.FUNCTION_CALL__ARGUMENTS);
    }
  }
  
  @Check
  public void checkIfCalledVariableExists(final VariableCall vc) {
    String _calledVariableName = vc.getCalledVariableName();
    boolean _variableIsDefinedBeforeElement = ValidationUtils.variableIsDefinedBeforeElement(vc, _calledVariableName);
    boolean _not = (!_variableIsDefinedBeforeElement);
    if (_not) {
      String _calledVariableName_1 = vc.getCalledVariableName();
      this.error(ErrorMessages.UNDEFINED_VARIABLE, 
        DidiPackage.Literals.VARIABLE_CALL__CALLED_VARIABLE_NAME, 
        ErrorMessages.UNDEFINED_VARIABLE, _calledVariableName_1);
    }
  }
  
  @Check
  public void checkIfVariableIsUsed(final VariableDefinition vd) {
    EObject _eContainer = vd.eContainer();
    if ((_eContainer instanceof ForStatement)) {
      EObject _eContainer_1 = vd.eContainer();
      EList<EObject> _eContents = _eContainer_1.eContents();
      int _indexOf = _eContents.indexOf(vd);
      boolean _equals = (_indexOf == 1);
      if (_equals) {
        return;
      }
    }
    EObject _eContainer_2 = vd.eContainer();
    EList<EObject> _eContents_1 = _eContainer_2.eContents();
    int _indexOf_1 = _eContents_1.indexOf(vd);
    int positionInContainer = (_indexOf_1 + 1);
    EObject _eContainer_3 = vd.eContainer();
    EList<EObject> _eContents_2 = _eContainer_3.eContents();
    EObject _eContainer_4 = vd.eContainer();
    EList<EObject> _eContents_3 = _eContainer_4.eContents();
    int _length = ((Object[])Conversions.unwrapArray(_eContents_3, Object.class)).length;
    List<EObject> listFromPosition = _eContents_2.subList(positionInContainer, _length);
    String _name = vd.getName();
    ValidationUtils.checkIfVariableIsUsed(listFromPosition, _name);
    if ((!ValidationUtils.variableIsUsed)) {
      boolean _isIsGlobal = vd.isIsGlobal();
      if (_isIsGlobal) {
        EObject container = null;
        EObject _eContainer_5 = vd.eContainer();
        if ((_eContainer_5 instanceof DidiModel)) {
          container = vd;
        } else {
          EObject _containerBeforeDidiModel = ValidationUtils.getContainerBeforeDidiModel(vd);
          container = _containerBeforeDidiModel;
        }
        EObject didiModelElement = container.eContainer();
        EList<EObject> _eContents_4 = didiModelElement.eContents();
        int _indexOf_2 = _eContents_4.indexOf(container);
        int _plus = (_indexOf_2 + 1);
        positionInContainer = _plus;
        EList<EObject> _eContents_5 = didiModelElement.eContents();
        EList<EObject> _eContents_6 = didiModelElement.eContents();
        int _length_1 = ((Object[])Conversions.unwrapArray(_eContents_6, Object.class)).length;
        List<EObject> elementsFromPosition = _eContents_5.subList(positionInContainer, _length_1);
        String _name_1 = vd.getName();
        ValidationUtils.checkIfVariableIsUsed(elementsFromPosition, _name_1);
        if ((!ValidationUtils.variableIsUsed)) {
          String _name_2 = vd.getName();
          this.warning(ErrorMessages.UNUSED_VARIABLE, 
            DidiPackage.Literals.VARIABLE_DEFINITION__NAME, 
            ErrorMessages.UNUSED_VARIABLE, _name_2);
        }
      } else {
        String _name_3 = vd.getName();
        boolean _variableIsDefinedBeforeElement = ValidationUtils.variableIsDefinedBeforeElement(vd, _name_3);
        boolean _not = (!_variableIsDefinedBeforeElement);
        if (_not) {
          String _name_4 = vd.getName();
          this.warning(ErrorMessages.UNUSED_VARIABLE, 
            DidiPackage.Literals.VARIABLE_DEFINITION__NAME, 
            ErrorMessages.UNUSED_VARIABLE, _name_4);
        }
      }
    }
    ValidationUtils.variableIsUsed = false;
  }
  
  @Check
  public void validateReturnStatement(final ReturnStatement rs) {
    EObject container = rs.eContainer();
    if ((((((!(container instanceof IfFragment)) && (!(container instanceof ElseIfFragment))) && (!(container instanceof ElseFragment))) && (!(container instanceof ForStatement))) && (!(container instanceof WhileStatement)))) {
      EList<EObject> _eContents = container.eContents();
      int _indexOf = _eContents.indexOf(rs);
      EList<EObject> _eContents_1 = container.eContents();
      int _length = ((Object[])Conversions.unwrapArray(_eContents_1, Object.class)).length;
      int _minus = (_length - 1);
      boolean _lessThan = (_indexOf < _minus);
      if (_lessThan) {
        this.warning(ErrorMessages.UNREACHABLE_CODE, 
          DidiPackage.Literals.RETURN_STATEMENT__RETURN_VALUE);
      }
    } else {
      EObject[] elements = null;
      if ((container instanceof IfFragment)) {
        EList<Statement> _ifStatements = ((IfFragment) container).getIfStatements();
        elements = ((EObject[])Conversions.unwrapArray(_ifStatements, EObject.class));
      } else {
        if ((container instanceof ElseIfFragment)) {
          EList<Statement> _elseIfStatements = ((ElseIfFragment) container).getElseIfStatements();
          elements = ((EObject[])Conversions.unwrapArray(_elseIfStatements, EObject.class));
        } else {
          if ((container instanceof ElseFragment)) {
            EList<Statement> _elseStatements = ((ElseFragment) container).getElseStatements();
            elements = ((EObject[])Conversions.unwrapArray(_elseStatements, EObject.class));
          } else {
            if ((container instanceof ForStatement)) {
              EList<Statement> _statements = ((ForStatement) container).getStatements();
              elements = ((EObject[])Conversions.unwrapArray(_statements, EObject.class));
            } else {
              if ((container instanceof WhileStatement)) {
                EList<Statement> _statements_1 = ((WhileStatement) container).getStatements();
                elements = ((EObject[])Conversions.unwrapArray(_statements_1, EObject.class));
              }
            }
          }
        }
      }
      final EObject[] _converted_elements = (EObject[])elements;
      int _indexOf_1 = ((List<EObject>)Conversions.doWrapArray(_converted_elements)).indexOf(rs);
      int _length_1 = elements.length;
      int _minus_1 = (_length_1 - 1);
      boolean _lessThan_1 = (_indexOf_1 < _minus_1);
      if (_lessThan_1) {
        this.warning(ErrorMessages.UNREACHABLE_CODE, 
          DidiPackage.Literals.RETURN_STATEMENT__RETURN_VALUE);
      } else {
        EObject _containerBeforeDidiModel = ValidationUtils.getContainerBeforeDidiModel(rs);
        container = _containerBeforeDidiModel;
        if ((!((container instanceof FunctionDefinition) && (!(container instanceof IfStatement))))) {
          this.error(ErrorMessages.WRONG_RETURN_STATEMENT_POSITION, 
            DidiPackage.Literals.RETURN_STATEMENT__RETURN_VALUE);
        }
      }
    }
  }
}

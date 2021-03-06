package bg.tues.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDidiLexer extends Lexer {
    public static final int RULE_HEX=5;
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int RULE_NUMBER_LITERAL=10;
    public static final int RULE_DECIMAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_IDENTIFIER=8;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalDidiLexer() {;} 
    public InternalDidiLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDidiLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:11:7: ( '+' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:11:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:12:7: ( '-' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:12:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:13:7: ( '*' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:13:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:14:7: ( '/' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:14:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:15:7: ( '%' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:15:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:16:7: ( '^' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:16:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:17:7: ( '=' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:17:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:18:7: ( '&&' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:18:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:19:7: ( '||' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:19:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:20:7: ( '!' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:20:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:21:7: ( ';' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:21:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:22:7: ( '(' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:22:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:23:7: ( ')' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:23:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:24:7: ( ',' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:24:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25:7: ( '{' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:26:7: ( '}' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:26:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:27:7: ( 'global' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:27:9: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:28:7: ( 'query' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:28:9: 'query'
            {
            match("query"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:29:7: ( 'update' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:29:9: 'update'
            {
            match("update"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:30:7: ( 'print' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:30:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:31:7: ( 'println' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:31:9: 'println'
            {
            match("println"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:32:7: ( 'func' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:32:9: 'func'
            {
            match("func"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:33:7: ( 'if' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:33:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:34:7: ( 'else' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:34:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:35:7: ( 'while' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:35:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:36:7: ( 'for' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:36:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:37:7: ( 'return' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:37:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:38:7: ( 'true' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:38:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:39:7: ( 'false' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:39:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:40:7: ( '--' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:40:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:41:7: ( '++' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:41:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:42:7: ( '>' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:42:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:43:7: ( '<' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:43:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:44:7: ( '==' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:44:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:45:7: ( '<=' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:45:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:46:7: ( '>=' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:46:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:47:7: ( '!=' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:47:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:48:7: ( '+=' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:48:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:49:7: ( '-=' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:49:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:50:7: ( '*=' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:50:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:51:7: ( '/=' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:51:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:52:7: ( '%=' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:52:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:53:7: ( '===' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:53:9: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:54:7: ( '!==' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:54:9: '!=='
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:55:7: ( '->' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:55:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:56:7: ( '..<' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:56:9: '..<'
            {
            match("..<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:57:7: ( '..' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:57:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:58:7: ( '=>' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:58:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:59:7: ( '<>' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:59:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:60:7: ( '?:' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:60:9: '?:'
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:61:7: ( '**' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:61:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:62:7: ( '.' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:62:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:63:7: ( 'val' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:63:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:64:7: ( 'extends' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:64:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:65:7: ( 'static' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:65:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:66:7: ( 'import' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:66:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:67:7: ( 'extension' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:67:9: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:68:7: ( 'super' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:68:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:69:7: ( 'instanceof' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:69:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:70:7: ( 'as' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:70:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:71:7: ( '#' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:71:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:72:7: ( '[' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:72:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:73:7: ( ']' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:73:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:74:7: ( 'switch' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:74:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:75:7: ( ':' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:75:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:76:7: ( 'default' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:76:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:77:7: ( 'case' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:77:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:78:7: ( 'do' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:78:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:79:7: ( 'new' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:79:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:80:7: ( 'null' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:80:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:81:7: ( 'typeof' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:81:9: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:82:7: ( 'throw' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:82:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:83:7: ( 'try' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:83:9: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:84:7: ( 'finally' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:84:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:85:7: ( 'synchronized' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:85:9: 'synchronized'
            {
            match("synchronized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:86:7: ( 'catch' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:86:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:87:7: ( '?' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:87:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:88:7: ( '&' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:88:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:89:7: ( '::' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:89:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:90:7: ( '?.' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:90:9: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:91:7: ( '|' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:91:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:92:7: ( 'var' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:92:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "RULE_NUMBER_LITERAL"
    public final void mRULE_NUMBER_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_NUMBER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25852:21: ( ( '-' )? ( '0' | '1' .. '9' ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? ) )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25852:23: ( '-' )? ( '0' | '1' .. '9' ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? )
            {
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25852:23: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25852:23: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25852:28: ( '0' | '1' .. '9' ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='0') ) {
                alt5=1;
            }
            else if ( ((LA5_0>='1' && LA5_0<='9')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25852:29: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25852:33: '1' .. '9' ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )?
                    {
                    matchRange('1','9'); 
                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25852:42: ( '0' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25852:43: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25852:54: ( '.' ( '0' .. '9' )+ )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25852:55: '.' ( '0' .. '9' )+
                            {
                            match('.'); 
                            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25852:59: ( '0' .. '9' )+
                            int cnt3=0;
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25852:60: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt3 >= 1 ) break loop3;
                                        EarlyExitException eee =
                                            new EarlyExitException(3, input);
                                        throw eee;
                                }
                                cnt3++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER_LITERAL"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25854:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25854:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25854:43: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25856:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25856:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25856:12: ( '0x' | '0X' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='0') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='x') ) {
                    alt7=1;
                }
                else if ( (LA7_1=='X') ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25856:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25856:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25856:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='F')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='f')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25856:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='#') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25856:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25856:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='B'||LA9_0=='b') ) {
                        alt9=1;
                    }
                    else if ( (LA9_0=='L'||LA9_0=='l') ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25856:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25856:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25858:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25858:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25858:21: ( '0' .. '9' | '_' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||LA11_0=='_') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25860:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25860:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25860:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='E'||LA13_0=='e') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25860:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25860:36: ( '+' | '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='+'||LA12_0=='-') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25860:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='B'||LA14_0=='b') ) {
                alt14=1;
            }
            else if ( (LA14_0=='D'||LA14_0=='F'||LA14_0=='L'||LA14_0=='d'||LA14_0=='f'||LA14_0=='l') ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25860:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25860:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25862:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25862:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25862:11: ( '^' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='^') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25862:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25862:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='$'||(LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25864:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? ) )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25864:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            {
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25864:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\"') ) {
                alt21=1;
            }
            else if ( (LA21_0=='\'') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25864:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )?
                    {
                    match('\"'); 
                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25864:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25864:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25864:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25864:44: ( '\"' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\"') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25864:44: '\"'
                            {
                            match('\"'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25864:49: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )?
                    {
                    match('\''); 
                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25864:54: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\\') ) {
                            alt19=1;
                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25864:55: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25864:62: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25864:79: ( '\\'' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\'') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25864:79: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25866:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25866:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25866:24: ( options {greedy=false; } : . )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='*') ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1=='/') ) {
                        alt22=2;
                    }
                    else if ( ((LA22_1>='\u0000' && LA22_1<='.')||(LA22_1>='0' && LA22_1<='\uFFFF')) ) {
                        alt22=1;
                    }


                }
                else if ( ((LA22_0>='\u0000' && LA22_0<=')')||(LA22_0>='+' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25866:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25868:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25868:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25868:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25868:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25868:40: ( ( '\\r' )? '\\n' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\n'||LA25_0=='\r') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25868:41: ( '\\r' )? '\\n'
                    {
                    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25868:41: ( '\\r' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='\r') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25868:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25870:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25870:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25870:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25872:16: ( . )
            // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:25872:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | RULE_NUMBER_LITERAL | RULE_IDENTIFIER | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt27=93;
        alt27 = dfa27.predict(input);
        switch (alt27) {
            case 1 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:292: T__62
                {
                mT__62(); 

                }
                break;
            case 49 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:298: T__63
                {
                mT__63(); 

                }
                break;
            case 50 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:304: T__64
                {
                mT__64(); 

                }
                break;
            case 51 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:310: T__65
                {
                mT__65(); 

                }
                break;
            case 52 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:316: T__66
                {
                mT__66(); 

                }
                break;
            case 53 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:322: T__67
                {
                mT__67(); 

                }
                break;
            case 54 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:328: T__68
                {
                mT__68(); 

                }
                break;
            case 55 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:334: T__69
                {
                mT__69(); 

                }
                break;
            case 56 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:340: T__70
                {
                mT__70(); 

                }
                break;
            case 57 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:346: T__71
                {
                mT__71(); 

                }
                break;
            case 58 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:352: T__72
                {
                mT__72(); 

                }
                break;
            case 59 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:358: T__73
                {
                mT__73(); 

                }
                break;
            case 60 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:364: T__74
                {
                mT__74(); 

                }
                break;
            case 61 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:370: T__75
                {
                mT__75(); 

                }
                break;
            case 62 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:376: T__76
                {
                mT__76(); 

                }
                break;
            case 63 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:382: T__77
                {
                mT__77(); 

                }
                break;
            case 64 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:388: T__78
                {
                mT__78(); 

                }
                break;
            case 65 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:394: T__79
                {
                mT__79(); 

                }
                break;
            case 66 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:400: T__80
                {
                mT__80(); 

                }
                break;
            case 67 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:406: T__81
                {
                mT__81(); 

                }
                break;
            case 68 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:412: T__82
                {
                mT__82(); 

                }
                break;
            case 69 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:418: T__83
                {
                mT__83(); 

                }
                break;
            case 70 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:424: T__84
                {
                mT__84(); 

                }
                break;
            case 71 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:430: T__85
                {
                mT__85(); 

                }
                break;
            case 72 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:436: T__86
                {
                mT__86(); 

                }
                break;
            case 73 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:442: T__87
                {
                mT__87(); 

                }
                break;
            case 74 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:448: T__88
                {
                mT__88(); 

                }
                break;
            case 75 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:454: T__89
                {
                mT__89(); 

                }
                break;
            case 76 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:460: T__90
                {
                mT__90(); 

                }
                break;
            case 77 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:466: T__91
                {
                mT__91(); 

                }
                break;
            case 78 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:472: T__92
                {
                mT__92(); 

                }
                break;
            case 79 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:478: T__93
                {
                mT__93(); 

                }
                break;
            case 80 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:484: T__94
                {
                mT__94(); 

                }
                break;
            case 81 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:490: T__95
                {
                mT__95(); 

                }
                break;
            case 82 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:496: T__96
                {
                mT__96(); 

                }
                break;
            case 83 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:502: RULE_NUMBER_LITERAL
                {
                mRULE_NUMBER_LITERAL(); 

                }
                break;
            case 84 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:522: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 85 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:538: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 86 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:547: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 87 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:556: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 88 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:569: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 89 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:577: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 90 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:589: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 91 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:605: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 92 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:621: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 93 :
                // ../bg.tues.ui/src-gen/bg/tues/ui/contentassist/antlr/internal/InternalDidi.g:1:629: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA27_eotS =
        "\1\uffff\1\63\1\67\1\73\1\77\1\101\1\102\1\106\1\110\1\112\1\114"+
        "\6\uffff\12\124\1\150\1\153\1\155\1\160\3\124\3\uffff\1\173\3\124"+
        "\2\70\1\124\30\uffff\1\u0088\6\uffff\1\u008a\7\uffff\1\124\1\uffff"+
        "\10\124\1\u0093\11\124\5\uffff\1\u009f\4\uffff\5\124\1\u00a6\5\uffff"+
        "\1\124\1\u00a8\3\124\1\uffff\1\u00ad\1\uffff\1\70\6\uffff\5\124"+
        "\1\u00b3\2\124\1\uffff\7\124\1\u00bd\2\124\2\uffff\1\u00c0\1\u00c1"+
        "\4\124\1\uffff\1\124\1\uffff\2\124\1\u00c9\1\124\1\uffff\4\124\1"+
        "\u00cf\1\uffff\4\124\1\u00d4\3\124\1\u00d8\1\uffff\2\124\2\uffff"+
        "\5\124\1\u00e0\1\124\1\uffff\1\u00e2\1\124\1\u00e4\1\124\1\u00e7"+
        "\1\uffff\1\u00e8\3\124\1\uffff\1\124\1\u00ee\1\124\1\uffff\1\124"+
        "\1\u00f1\1\124\1\u00f3\3\124\1\uffff\1\u00f7\1\uffff\1\u00f8\1\uffff"+
        "\1\u00f9\1\124\2\uffff\1\124\1\u00fc\3\124\1\uffff\1\u0100\1\u0101"+
        "\1\uffff\1\u0102\1\uffff\1\u0103\2\124\3\uffff\1\u0106\1\u0107\1"+
        "\uffff\1\124\1\u0109\1\124\4\uffff\1\124\1\u010c\2\uffff\1\124\1"+
        "\uffff\2\124\1\uffff\1\124\1\u0111\1\124\1\u0113\1\uffff\1\124\1"+
        "\uffff\1\124\1\u0116\1\uffff";
    static final String DFA27_eofS =
        "\u0117\uffff";
    static final String DFA27_minS =
        "\1\0\1\53\1\55\2\52\1\75\1\44\1\75\1\46\1\174\1\75\6\uffff\12\44"+
        "\2\75\2\56\3\44\3\uffff\1\72\3\44\2\60\1\44\30\uffff\1\75\6\uffff"+
        "\1\75\7\uffff\1\44\1\uffff\22\44\5\uffff\1\74\4\uffff\6\44\5\uffff"+
        "\5\44\1\uffff\1\60\1\uffff\1\60\6\uffff\10\44\1\uffff\12\44\2\uffff"+
        "\6\44\1\uffff\1\44\1\uffff\4\44\1\uffff\5\44\1\uffff\11\44\1\uffff"+
        "\2\44\2\uffff\7\44\1\uffff\5\44\1\uffff\4\44\1\uffff\3\44\1\uffff"+
        "\7\44\1\uffff\1\44\1\uffff\1\44\1\uffff\2\44\2\uffff\5\44\1\uffff"+
        "\2\44\1\uffff\1\44\1\uffff\3\44\3\uffff\2\44\1\uffff\3\44\4\uffff"+
        "\2\44\2\uffff\1\44\1\uffff\2\44\1\uffff\4\44\1\uffff\1\44\1\uffff"+
        "\2\44\1\uffff";
    static final String DFA27_maxS =
        "\1\uffff\1\75\1\76\3\75\1\172\1\76\1\46\1\174\1\75\6\uffff\12\172"+
        "\1\75\1\76\1\56\1\72\3\172\3\uffff\1\72\3\172\1\170\1\154\1\172"+
        "\30\uffff\1\75\6\uffff\1\75\7\uffff\1\172\1\uffff\22\172\5\uffff"+
        "\1\74\4\uffff\6\172\5\uffff\5\172\1\uffff\1\154\1\uffff\1\154\6"+
        "\uffff\10\172\1\uffff\12\172\2\uffff\6\172\1\uffff\1\172\1\uffff"+
        "\4\172\1\uffff\5\172\1\uffff\11\172\1\uffff\2\172\2\uffff\7\172"+
        "\1\uffff\5\172\1\uffff\4\172\1\uffff\3\172\1\uffff\7\172\1\uffff"+
        "\1\172\1\uffff\1\172\1\uffff\2\172\2\uffff\5\172\1\uffff\2\172\1"+
        "\uffff\1\172\1\uffff\3\172\3\uffff\2\172\1\uffff\3\172\4\uffff\2"+
        "\172\2\uffff\1\172\1\uffff\2\172\1\uffff\4\172\1\uffff\1\172\1\uffff"+
        "\2\172\1\uffff";
    static final String DFA27_acceptS =
        "\13\uffff\1\13\1\14\1\15\1\16\1\17\1\20\21\uffff\1\75\1\76\1\77"+
        "\7\uffff\1\130\2\131\1\134\1\135\1\37\1\46\1\1\1\36\1\47\1\55\1"+
        "\2\1\123\1\50\1\63\1\3\1\51\1\132\1\133\1\4\1\52\1\5\1\6\1\130\1"+
        "\uffff\1\60\1\7\1\10\1\116\1\11\1\121\1\uffff\1\12\1\13\1\14\1\15"+
        "\1\16\1\17\1\20\1\uffff\1\124\22\uffff\1\44\1\40\1\43\1\61\1\41"+
        "\1\uffff\1\64\1\62\1\120\1\115\6\uffff\1\75\1\76\1\77\1\117\1\101"+
        "\5\uffff\1\125\1\uffff\1\127\1\uffff\1\131\1\134\1\53\1\42\1\54"+
        "\1\45\10\uffff\1\27\12\uffff\1\56\1\57\6\uffff\1\74\1\uffff\1\104"+
        "\4\uffff\1\126\5\uffff\1\32\11\uffff\1\111\2\uffff\1\65\1\122\7"+
        "\uffff\1\105\5\uffff\1\26\4\uffff\1\30\3\uffff\1\34\7\uffff\1\103"+
        "\1\uffff\1\106\1\uffff\1\22\2\uffff\1\24\1\35\5\uffff\1\31\2\uffff"+
        "\1\110\1\uffff\1\72\3\uffff\1\114\1\21\1\23\2\uffff\1\70\3\uffff"+
        "\1\33\1\107\1\67\1\100\2\uffff\1\25\1\112\1\uffff\1\66\2\uffff\1"+
        "\102\4\uffff\1\71\1\uffff\1\73\2\uffff\1\113";
    static final String DFA27_specialS =
        "\1\0\u0116\uffff}>";
    static final String[] DFA27_transitionS = {
            "\11\60\2\57\2\60\1\57\22\60\1\57\1\12\1\55\1\42\1\54\1\5\1"+
            "\10\1\56\1\14\1\15\1\3\1\1\1\16\1\2\1\35\1\4\1\51\11\52\1\45"+
            "\1\13\1\34\1\7\1\33\1\36\1\60\32\53\1\43\1\60\1\44\1\6\1\53"+
            "\1\60\1\41\1\53\1\47\1\46\1\27\1\25\1\21\1\53\1\26\4\53\1\50"+
            "\1\53\1\24\1\22\1\31\1\40\1\32\1\23\1\37\1\30\3\53\1\17\1\11"+
            "\1\20\uff82\60",
            "\1\61\21\uffff\1\62",
            "\1\64\2\uffff\12\70\3\uffff\1\65\1\66",
            "\1\72\22\uffff\1\71",
            "\1\75\4\uffff\1\76\15\uffff\1\74",
            "\1\100",
            "\1\103\34\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\104\1\105",
            "\1\107",
            "\1\111",
            "\1\113",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\13\125\1\123\16\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\24\125\1\126\5\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\17\125\1\127\12\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\21\125\1\130\10\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\1\133\7\125\1\134\5\125\1\132\5\125\1\131\5\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\5\125\1\135\6\125\1\136\1\137\14\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\13\125\1\140\13\125\1\141\2\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\7\125\1\142\22\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\4\125\1\143\25\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\7\125\1\146\11\125\1\144\6\125\1\145\1\125",
            "\1\147",
            "\1\151\1\152",
            "\1\154",
            "\1\157\13\uffff\1\156",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\1\161\31\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\23\125\1\162\1\163\1\125\1\164\1\125\1\165\1\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\22\125\1\166\7\125",
            "",
            "",
            "",
            "\1\172",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\4\125\1\174\11\125\1\175\13\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\1\176\31\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\4\125\1\177\17\125\1\u0080\5\125",
            "\12\u0082\10\uffff\1\u0083\1\uffff\3\u0083\5\uffff\1\u0083"+
            "\13\uffff\1\u0081\6\uffff\1\u0082\2\uffff\1\u0083\1\uffff\3"+
            "\u0083\5\uffff\1\u0083\13\uffff\1\u0081",
            "\12\u0084\10\uffff\1\u0083\1\uffff\3\u0083\5\uffff\1\u0083"+
            "\22\uffff\1\u0082\2\uffff\1\u0083\1\uffff\3\u0083\5\uffff\1"+
            "\u0083",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0087",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0089",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\16\125\1\u008b\13\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\4\125\1\u008c\25\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\3\125\1\u008d\26\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\10\125\1\u008e\21\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\15\125\1\u008f\14\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\21\125\1\u0090\10\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\13\125\1\u0091\16\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\15\125\1\u0092\14\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\17\125\1\u0094\12\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\22\125\1\u0095\7\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\22\125\1\u0096\7\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\23\125\1\u0097\6\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\10\125\1\u0098\21\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\23\125\1\u0099\6\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\24\125\1\u009a\3\125\1\u009b\1\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\17\125\1\u009c\12\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\21\125\1\u009d\10\125",
            "",
            "",
            "",
            "",
            "",
            "\1\u009e",
            "",
            "",
            "",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\13\125\1\u00a0\5\125\1\u00a1\10\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\1\u00a2\31\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\17\125\1\u00a3\12\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\10\125\1\u00a4\21\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\15\125\1\u00a5\14\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "",
            "",
            "",
            "",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\5\125\1\u00a7\24\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\22\125\1\u00a9\1\u00aa\6\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\26\125\1\u00ab\3\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\13\125\1\u00ac\16\125",
            "",
            "\12\u0082\10\uffff\1\u0083\1\uffff\3\u0083\5\uffff\1\u0083"+
            "\22\uffff\1\u0082\2\uffff\1\u0083\1\uffff\3\u0083\5\uffff\1"+
            "\u0083",
            "",
            "\12\u0084\10\uffff\1\u0083\1\uffff\3\u0083\5\uffff\1\u0083"+
            "\22\uffff\1\u0082\2\uffff\1\u0083\1\uffff\3\u0083\5\uffff\1"+
            "\u0083",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\1\125\1\u00ae\30\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\21\125\1\u00af\10\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\1\u00b0\31\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\15\125\1\u00b1\14\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\2\125\1\u00b2\27\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\22\125\1\u00b4\7\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\1\u00b5\31\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\16\125\1\u00b6\13\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\23\125\1\u00b7\6\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\4\125\1\u00b8\25\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\4\125\1\u00b9\25\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\13\125\1\u00ba\16\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\24\125\1\u00bb\5\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\4\125\1\u00bc\25\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\4\125\1\u00be\25\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\16\125\1\u00bf\13\125",
            "",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\23\125\1\u00c2\6\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\4\125\1\u00c3\25\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\23\125\1\u00c4\6\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\2\125\1\u00c5\27\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\1\u00c6\31\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\4\125\1\u00c7\25\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\2\125\1\u00c8\27\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\13\125\1\u00ca\16\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\1\u00cb\31\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\30\125\1\u00cc\1\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\23\125\1\u00cd\6\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\23\125\1\u00ce\6\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\4\125\1\u00d0\25\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\13\125\1\u00d1\16\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\21\125\1\u00d2\10\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\1\u00d3\31\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\15\125\1\u00d5\14\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\4\125\1\u00d6\25\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\21\125\1\u00d7\10\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\16\125\1\u00d9\13\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\26\125\1\u00da\3\125",
            "",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\10\125\1\u00db\21\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\21\125\1\u00dc\10\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\2\125\1\u00dd\27\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\7\125\1\u00de\22\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\24\125\1\u00df\5\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\7\125\1\u00e1\22\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\13\125\1\u00e3\16\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\4\125\1\u00e5\25\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\13\125\1\u00e6\16\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\13\125\1\u00e9\16\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\23\125\1\u00ea\6\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\15\125\1\u00eb\14\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\3\125\1\u00ec\16\125\1\u00ed\7\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\15\125\1\u00ef\14\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\5\125\1\u00f0\24\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\2\125\1\u00f2\27\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\7\125\1\u00f4\22\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\21\125\1\u00f5\10\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\13\125\1\u00f6\16\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\15\125\1\u00fa\14\125",
            "",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\30\125\1\u00fb\1\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\2\125\1\u00fd\27\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\22\125\1\u00fe\7\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\10\125\1\u00ff\21\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\16\125\1\u0104\13\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\23\125\1\u0105\6\125",
            "",
            "",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\4\125\1\u0108\25\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\16\125\1\u010a\13\125",
            "",
            "",
            "",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\15\125\1\u010b\14\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\16\125\1\u010d\13\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\15\125\1\u010e\14\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\10\125\1\u010f\21\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\5\125\1\u0110\24\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\31\125\1\u0112",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\4\125\1\u0114\25\125",
            "",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\3\125\1\u0115\26\125",
            "\1\103\13\uffff\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff"+
            "\32\125",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | RULE_NUMBER_LITERAL | RULE_IDENTIFIER | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                        s = -1;
                        if ( (LA27_0=='+') ) {s = 1;}

                        else if ( (LA27_0=='-') ) {s = 2;}

                        else if ( (LA27_0=='*') ) {s = 3;}

                        else if ( (LA27_0=='/') ) {s = 4;}

                        else if ( (LA27_0=='%') ) {s = 5;}

                        else if ( (LA27_0=='^') ) {s = 6;}

                        else if ( (LA27_0=='=') ) {s = 7;}

                        else if ( (LA27_0=='&') ) {s = 8;}

                        else if ( (LA27_0=='|') ) {s = 9;}

                        else if ( (LA27_0=='!') ) {s = 10;}

                        else if ( (LA27_0==';') ) {s = 11;}

                        else if ( (LA27_0=='(') ) {s = 12;}

                        else if ( (LA27_0==')') ) {s = 13;}

                        else if ( (LA27_0==',') ) {s = 14;}

                        else if ( (LA27_0=='{') ) {s = 15;}

                        else if ( (LA27_0=='}') ) {s = 16;}

                        else if ( (LA27_0=='g') ) {s = 17;}

                        else if ( (LA27_0=='q') ) {s = 18;}

                        else if ( (LA27_0=='u') ) {s = 19;}

                        else if ( (LA27_0=='p') ) {s = 20;}

                        else if ( (LA27_0=='f') ) {s = 21;}

                        else if ( (LA27_0=='i') ) {s = 22;}

                        else if ( (LA27_0=='e') ) {s = 23;}

                        else if ( (LA27_0=='w') ) {s = 24;}

                        else if ( (LA27_0=='r') ) {s = 25;}

                        else if ( (LA27_0=='t') ) {s = 26;}

                        else if ( (LA27_0=='>') ) {s = 27;}

                        else if ( (LA27_0=='<') ) {s = 28;}

                        else if ( (LA27_0=='.') ) {s = 29;}

                        else if ( (LA27_0=='?') ) {s = 30;}

                        else if ( (LA27_0=='v') ) {s = 31;}

                        else if ( (LA27_0=='s') ) {s = 32;}

                        else if ( (LA27_0=='a') ) {s = 33;}

                        else if ( (LA27_0=='#') ) {s = 34;}

                        else if ( (LA27_0=='[') ) {s = 35;}

                        else if ( (LA27_0==']') ) {s = 36;}

                        else if ( (LA27_0==':') ) {s = 37;}

                        else if ( (LA27_0=='d') ) {s = 38;}

                        else if ( (LA27_0=='c') ) {s = 39;}

                        else if ( (LA27_0=='n') ) {s = 40;}

                        else if ( (LA27_0=='0') ) {s = 41;}

                        else if ( ((LA27_0>='1' && LA27_0<='9')) ) {s = 42;}

                        else if ( ((LA27_0>='A' && LA27_0<='Z')||LA27_0=='_'||LA27_0=='b'||LA27_0=='h'||(LA27_0>='j' && LA27_0<='m')||LA27_0=='o'||(LA27_0>='x' && LA27_0<='z')) ) {s = 43;}

                        else if ( (LA27_0=='$') ) {s = 44;}

                        else if ( (LA27_0=='\"') ) {s = 45;}

                        else if ( (LA27_0=='\'') ) {s = 46;}

                        else if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {s = 47;}

                        else if ( ((LA27_0>='\u0000' && LA27_0<='\b')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='\u001F')||LA27_0=='@'||LA27_0=='\\'||LA27_0=='`'||(LA27_0>='~' && LA27_0<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
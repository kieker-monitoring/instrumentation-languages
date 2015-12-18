package de.cau.cs.se.instrumentation.al.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAspectLangLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NUMBER=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=6;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalAspectLangLexer() {;} 
    public InternalAspectLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAspectLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAspectLang.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAspectLang.g:11:7: ( 'package' )
            // InternalAspectLang.g:11:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAspectLang.g:12:7: ( 'import' )
            // InternalAspectLang.g:12:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAspectLang.g:13:7: ( 'use' )
            // InternalAspectLang.g:13:9: 'use'
            {
            match("use"); 


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
            // InternalAspectLang.g:14:7: ( 'on' )
            // InternalAspectLang.g:14:9: 'on'
            {
            match("on"); 


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
            // InternalAspectLang.g:15:7: ( 'aspect' )
            // InternalAspectLang.g:15:9: 'aspect'
            {
            match("aspect"); 


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
            // InternalAspectLang.g:16:7: ( ':' )
            // InternalAspectLang.g:16:9: ':'
            {
            match(':'); 

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
            // InternalAspectLang.g:17:7: ( ',' )
            // InternalAspectLang.g:17:9: ','
            {
            match(','); 

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
            // InternalAspectLang.g:18:7: ( '(' )
            // InternalAspectLang.g:18:9: '('
            {
            match('('); 

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
            // InternalAspectLang.g:19:7: ( ')' )
            // InternalAspectLang.g:19:9: ')'
            {
            match(')'); 

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
            // InternalAspectLang.g:20:7: ( 'advice' )
            // InternalAspectLang.g:20:9: 'advice'
            {
            match("advice"); 


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
            // InternalAspectLang.g:21:7: ( '{' )
            // InternalAspectLang.g:21:9: '{'
            {
            match('{'); 

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
            // InternalAspectLang.g:22:7: ( '}' )
            // InternalAspectLang.g:22:9: '}'
            {
            match('}'); 

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
            // InternalAspectLang.g:23:7: ( 'type' )
            // InternalAspectLang.g:23:9: 'type'
            {
            match("type"); 


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
            // InternalAspectLang.g:24:7: ( '$' )
            // InternalAspectLang.g:24:9: '$'
            {
            match('$'); 

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
            // InternalAspectLang.g:25:7: ( 'pointcut' )
            // InternalAspectLang.g:25:9: 'pointcut'
            {
            match("pointcut"); 


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
            // InternalAspectLang.g:26:7: ( 'class' )
            // InternalAspectLang.g:26:9: 'class'
            {
            match("class"); 


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
            // InternalAspectLang.g:27:7: ( 'operation' )
            // InternalAspectLang.g:27:9: 'operation'
            {
            match("operation"); 


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
            // InternalAspectLang.g:28:7: ( '@' )
            // InternalAspectLang.g:28:9: '@'
            {
            match('@'); 

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
            // InternalAspectLang.g:29:7: ( '.' )
            // InternalAspectLang.g:29:9: '.'
            {
            match('.'); 

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
            // InternalAspectLang.g:30:7: ( '*' )
            // InternalAspectLang.g:30:9: '*'
            {
            match('*'); 

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
            // InternalAspectLang.g:31:7: ( '[' )
            // InternalAspectLang.g:31:9: '['
            {
            match('['); 

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
            // InternalAspectLang.g:32:7: ( ']' )
            // InternalAspectLang.g:32:9: ']'
            {
            match(']'); 

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
            // InternalAspectLang.g:33:7: ( '**' )
            // InternalAspectLang.g:33:9: '**'
            {
            match("**"); 


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
            // InternalAspectLang.g:34:7: ( 'up' )
            // InternalAspectLang.g:34:9: 'up'
            {
            match("up"); 


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
            // InternalAspectLang.g:35:7: ( '#' )
            // InternalAspectLang.g:35:9: '#'
            {
            match('#'); 

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
            // InternalAspectLang.g:36:7: ( 'istypeof' )
            // InternalAspectLang.g:36:9: 'istypeof'
            {
            match("istypeof"); 


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
            // InternalAspectLang.g:37:7: ( 'before' )
            // InternalAspectLang.g:37:9: 'before'
            {
            match("before"); 


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
            // InternalAspectLang.g:38:7: ( 'after' )
            // InternalAspectLang.g:38:9: 'after'
            {
            match("after"); 


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
            // InternalAspectLang.g:39:7: ( 'time' )
            // InternalAspectLang.g:39:9: 'time'
            {
            match("time"); 


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
            // InternalAspectLang.g:40:7: ( 'traceId' )
            // InternalAspectLang.g:40:9: 'traceId'
            {
            match("traceId"); 


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
            // InternalAspectLang.g:41:7: ( 'orderIndex' )
            // InternalAspectLang.g:41:9: 'orderIndex'
            {
            match("orderIndex"); 


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
            // InternalAspectLang.g:42:7: ( 'name' )
            // InternalAspectLang.g:42:9: 'name'
            {
            match("name"); 


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
            // InternalAspectLang.g:43:7: ( 'signature' )
            // InternalAspectLang.g:43:9: 'signature'
            {
            match("signature"); 


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
            // InternalAspectLang.g:44:7: ( 'classname' )
            // InternalAspectLang.g:44:9: 'classname'
            {
            match("classname"); 


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
            // InternalAspectLang.g:45:7: ( 'return-type' )
            // InternalAspectLang.g:45:9: 'return-type'
            {
            match("return-type"); 


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
            // InternalAspectLang.g:46:7: ( 'include' )
            // InternalAspectLang.g:46:9: 'include'
            {
            match("include"); 


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
            // InternalAspectLang.g:47:7: ( 'exclude' )
            // InternalAspectLang.g:47:9: 'exclude'
            {
            match("exclude"); 


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
            // InternalAspectLang.g:48:7: ( '&&' )
            // InternalAspectLang.g:48:9: '&&'
            {
            match("&&"); 


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
            // InternalAspectLang.g:49:7: ( '||' )
            // InternalAspectLang.g:49:9: '||'
            {
            match("||"); 


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
            // InternalAspectLang.g:50:7: ( '=' )
            // InternalAspectLang.g:50:9: '='
            {
            match('='); 

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
            // InternalAspectLang.g:51:7: ( '~' )
            // InternalAspectLang.g:51:9: '~'
            {
            match('~'); 

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
            // InternalAspectLang.g:52:7: ( '!=' )
            // InternalAspectLang.g:52:9: '!='
            {
            match("!="); 


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
            // InternalAspectLang.g:53:7: ( '>' )
            // InternalAspectLang.g:53:9: '>'
            {
            match('>'); 

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
            // InternalAspectLang.g:54:7: ( '<' )
            // InternalAspectLang.g:54:9: '<'
            {
            match('<'); 

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
            // InternalAspectLang.g:55:7: ( '>=' )
            // InternalAspectLang.g:55:9: '>='
            {
            match(">="); 


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
            // InternalAspectLang.g:56:7: ( '<=' )
            // InternalAspectLang.g:56:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAspectLang.g:2618:12: ( ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' ) )
            // InternalAspectLang.g:2618:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            {
            // InternalAspectLang.g:2618:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalAspectLang.g:2618:15: ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )?
                    {
                    // InternalAspectLang.g:2618:15: ( RULE_NUMBER )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalAspectLang.g:2618:15: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);

                    match('.'); 
                    // InternalAspectLang.g:2618:32: ( RULE_NUMBER )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalAspectLang.g:2618:32: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    // InternalAspectLang.g:2618:45: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalAspectLang.g:2618:46: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalAspectLang.g:2618:56: ( '+' | '-' )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0=='+'||LA3_0=='-') ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // InternalAspectLang.g:
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

                            // InternalAspectLang.g:2618:67: ( RULE_NUMBER )+
                            int cnt4=0;
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // InternalAspectLang.g:2618:67: RULE_NUMBER
                            	    {
                            	    mRULE_NUMBER(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt4 >= 1 ) break loop4;
                                        EarlyExitException eee =
                                            new EarlyExitException(4, input);
                                        throw eee;
                                }
                                cnt4++;
                            } while (true);


                            }
                            break;

                    }

                    // InternalAspectLang.g:2618:82: ( 'f' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='f') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalAspectLang.g:2618:82: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2618:87: ( RULE_NUMBER )+ 'f'
                    {
                    // InternalAspectLang.g:2618:87: ( RULE_NUMBER )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAspectLang.g:2618:87: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    match('f'); 

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
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            // InternalAspectLang.g:2620:22: ( '0' .. '9' )
            // InternalAspectLang.g:2620:24: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAspectLang.g:2622:10: ( ( RULE_NUMBER )+ )
            // InternalAspectLang.g:2622:12: ( RULE_NUMBER )+
            {
            // InternalAspectLang.g:2622:12: ( RULE_NUMBER )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAspectLang.g:2622:12: RULE_NUMBER
            	    {
            	    mRULE_NUMBER(); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAspectLang.g:2624:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAspectLang.g:2624:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAspectLang.g:2624:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAspectLang.g:2624:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAspectLang.g:2624:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAspectLang.g:
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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAspectLang.g:2626:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAspectLang.g:2626:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAspectLang.g:2626:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAspectLang.g:2626:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAspectLang.g:2626:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalAspectLang.g:2626:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAspectLang.g:2626:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2626:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAspectLang.g:2626:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalAspectLang.g:2626:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAspectLang.g:2626:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop13;
                        }
                    } while (true);

                    match('\''); 

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
            // InternalAspectLang.g:2628:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAspectLang.g:2628:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAspectLang.g:2628:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAspectLang.g:2628:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
            // InternalAspectLang.g:2630:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAspectLang.g:2630:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAspectLang.g:2630:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAspectLang.g:2630:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop16;
                }
            } while (true);

            // InternalAspectLang.g:2630:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAspectLang.g:2630:41: ( '\\r' )? '\\n'
                    {
                    // InternalAspectLang.g:2630:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalAspectLang.g:2630:41: '\\r'
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
            // InternalAspectLang.g:2632:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAspectLang.g:2632:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAspectLang.g:2632:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAspectLang.g:
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // InternalAspectLang.g:2634:16: ( . )
            // InternalAspectLang.g:2634:18: .
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
        // InternalAspectLang.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | RULE_FLOAT | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=54;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalAspectLang.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalAspectLang.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalAspectLang.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalAspectLang.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalAspectLang.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalAspectLang.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalAspectLang.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalAspectLang.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalAspectLang.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalAspectLang.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalAspectLang.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalAspectLang.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalAspectLang.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalAspectLang.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalAspectLang.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalAspectLang.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalAspectLang.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalAspectLang.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalAspectLang.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalAspectLang.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalAspectLang.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalAspectLang.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalAspectLang.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalAspectLang.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalAspectLang.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalAspectLang.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalAspectLang.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalAspectLang.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalAspectLang.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalAspectLang.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalAspectLang.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalAspectLang.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalAspectLang.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalAspectLang.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalAspectLang.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalAspectLang.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalAspectLang.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // InternalAspectLang.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // InternalAspectLang.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // InternalAspectLang.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // InternalAspectLang.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // InternalAspectLang.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // InternalAspectLang.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // InternalAspectLang.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // InternalAspectLang.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // InternalAspectLang.g:1:280: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // InternalAspectLang.g:1:286: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 48 :
                // InternalAspectLang.g:1:297: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 49 :
                // InternalAspectLang.g:1:306: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 50 :
                // InternalAspectLang.g:1:314: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 51 :
                // InternalAspectLang.g:1:326: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 52 :
                // InternalAspectLang.g:1:342: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 53 :
                // InternalAspectLang.g:1:358: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 54 :
                // InternalAspectLang.g:1:366: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA8_eotS =
        "\4\uffff";
    static final String DFA8_eofS =
        "\4\uffff";
    static final String DFA8_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA8_maxS =
        "\1\71\1\146\2\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA8_specialS =
        "\4\uffff}>";
    static final String[] DFA8_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1\54\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "2618:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\5\53\6\uffff\1\53\1\uffff\1\53\2\uffff\1\105\3\uffff\5\53\2\50\2\uffff\1\50\1\124\1\126\1\127\1\50\1\uffff\3\50\2\uffff\2\53\1\uffff\4\53\1\144\1\145\5\53\6\uffff\3\53\1\uffff\1\53\7\uffff\5\53\13\uffff\1\127\4\uffff\5\53\1\171\2\uffff\23\53\1\uffff\5\53\1\u0092\1\u0093\3\53\1\u0097\14\53\1\u00a4\2\uffff\1\53\1\u00a7\1\53\1\uffff\5\53\1\u00ae\4\53\1\u00b3\1\u00b4\1\uffff\2\53\1\uffff\1\u00b7\3\53\1\u00bb\1\53\1\uffff\1\53\1\u00be\2\53\2\uffff\1\u00c1\1\53\1\uffff\1\53\1\uffff\1\u00c4\1\uffff\1\u00c5\1\u00c6\1\uffff\2\53\1\uffff\2\53\3\uffff\1\u00cb\1\53\1\u00cd\1\u00ce\1\uffff\1\u00cf\3\uffff";
    static final String DFA20_eofS =
        "\u00d0\uffff";
    static final String DFA20_minS =
        "\1\0\1\141\1\155\1\160\1\156\1\144\6\uffff\1\151\1\uffff\1\154\2\uffff\1\52\3\uffff\1\145\1\141\1\151\1\145\1\170\1\46\1\174\2\uffff\3\75\1\56\1\101\1\uffff\2\0\1\52\2\uffff\1\143\1\151\1\uffff\1\160\1\164\1\143\1\145\2\60\1\145\1\144\1\160\1\166\1\164\6\uffff\1\160\1\155\1\141\1\uffff\1\141\7\uffff\1\146\1\155\1\147\1\164\1\143\13\uffff\1\56\4\uffff\1\153\1\156\1\157\1\171\1\154\1\60\2\uffff\1\162\2\145\1\151\3\145\1\143\1\163\1\157\1\145\1\156\1\165\1\154\1\141\1\164\1\162\1\160\1\165\1\uffff\1\141\1\162\2\143\1\162\2\60\1\145\1\163\1\162\1\60\1\141\1\162\1\165\1\147\1\143\1\164\1\145\1\144\1\164\1\111\1\164\1\145\1\60\2\uffff\1\111\1\60\1\145\1\uffff\1\164\1\156\1\144\1\145\1\165\1\60\1\157\1\145\1\151\1\156\2\60\1\uffff\1\144\1\141\1\uffff\1\60\1\165\1\55\1\145\1\60\1\164\1\uffff\1\146\1\60\1\157\1\144\2\uffff\1\60\1\155\1\uffff\1\162\1\uffff\1\60\1\uffff\2\60\1\uffff\1\156\1\145\1\uffff\2\145\3\uffff\1\60\1\170\2\60\1\uffff\1\60\3\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\157\2\163\1\162\1\163\6\uffff\1\171\1\uffff\1\154\2\uffff\1\52\3\uffff\1\145\1\141\1\151\1\145\1\170\1\46\1\174\2\uffff\3\75\1\146\1\172\1\uffff\2\uffff\1\57\2\uffff\1\143\1\151\1\uffff\1\160\1\164\1\143\1\145\2\172\1\145\1\144\1\160\1\166\1\164\6\uffff\1\160\1\155\1\141\1\uffff\1\141\7\uffff\1\146\1\155\1\147\1\164\1\143\13\uffff\1\146\4\uffff\1\153\1\156\1\157\1\171\1\154\1\172\2\uffff\1\162\2\145\1\151\3\145\1\143\1\163\1\157\1\145\1\156\1\165\1\154\1\141\1\164\1\162\1\160\1\165\1\uffff\1\141\1\162\2\143\1\162\2\172\1\145\1\163\1\162\1\172\1\141\1\162\1\165\1\147\1\143\1\164\1\145\1\144\1\164\1\111\1\164\1\145\1\172\2\uffff\1\111\1\172\1\145\1\uffff\1\164\1\156\1\144\1\145\1\165\1\172\1\157\1\145\1\151\1\156\2\172\1\uffff\1\144\1\141\1\uffff\1\172\1\165\1\55\1\145\1\172\1\164\1\uffff\1\146\1\172\1\157\1\144\2\uffff\1\172\1\155\1\uffff\1\162\1\uffff\1\172\1\uffff\2\172\1\uffff\1\156\1\145\1\uffff\2\145\3\uffff\1\172\1\170\2\172\1\uffff\1\172\3\uffff";
    static final String DFA20_acceptS =
        "\6\uffff\1\6\1\7\1\10\1\11\1\13\1\14\1\uffff\1\16\1\uffff\1\22\1\23\1\uffff\1\25\1\26\1\31\7\uffff\1\50\1\51\5\uffff\1\61\3\uffff\1\65\1\66\2\uffff\1\61\13\uffff\1\6\1\7\1\10\1\11\1\13\1\14\3\uffff\1\16\1\uffff\1\22\1\23\1\27\1\24\1\25\1\26\1\31\5\uffff\1\46\1\47\1\50\1\51\1\52\1\55\1\53\1\56\1\54\1\60\1\57\1\uffff\1\62\1\63\1\64\1\65\6\uffff\1\30\1\4\23\uffff\1\3\30\uffff\1\15\1\35\3\uffff\1\40\14\uffff\1\34\2\uffff\1\20\6\uffff\1\2\4\uffff\1\5\1\12\2\uffff\1\33\1\uffff\1\43\1\uffff\1\1\2\uffff\1\44\2\uffff\1\36\2\uffff\1\45\1\17\1\32\4\uffff\1\21\1\uffff\1\42\1\41\1\37";
    static final String DFA20_specialS =
        "\1\0\43\uffff\1\1\1\2\u00aa\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\50\2\47\2\50\1\47\22\50\1\47\1\36\1\44\1\24\1\15\1\50\1\32\1\45\1\10\1\11\1\21\1\50\1\7\1\50\1\20\1\46\12\41\1\6\1\50\1\40\1\34\1\37\1\50\1\17\32\43\1\22\1\50\1\23\1\42\1\43\1\50\1\5\1\25\1\16\1\43\1\31\3\43\1\2\4\43\1\26\1\4\1\1\1\43\1\30\1\27\1\14\1\3\5\43\1\12\1\33\1\13\1\35\uff81\50",
            "\1\51\15\uffff\1\52",
            "\1\54\1\56\4\uffff\1\55",
            "\1\60\2\uffff\1\57",
            "\1\61\1\uffff\1\62\1\uffff\1\63",
            "\1\65\1\uffff\1\66\14\uffff\1\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\76\10\uffff\1\77\6\uffff\1\75",
            "",
            "\1\101",
            "",
            "",
            "\1\104",
            "",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\125",
            "\1\130\1\uffff\12\131\54\uffff\1\130",
            "\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\0\132",
            "\0\132",
            "\1\133\4\uffff\1\134",
            "",
            "",
            "\1\136",
            "\1\137",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "\1\156",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
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
            "\1\130\1\uffff\12\131\54\uffff\1\130",
            "",
            "",
            "",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\u00a5",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u00a6\14\53",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00cc",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | RULE_FLOAT | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='p') ) {s = 1;}

                        else if ( (LA20_0=='i') ) {s = 2;}

                        else if ( (LA20_0=='u') ) {s = 3;}

                        else if ( (LA20_0=='o') ) {s = 4;}

                        else if ( (LA20_0=='a') ) {s = 5;}

                        else if ( (LA20_0==':') ) {s = 6;}

                        else if ( (LA20_0==',') ) {s = 7;}

                        else if ( (LA20_0=='(') ) {s = 8;}

                        else if ( (LA20_0==')') ) {s = 9;}

                        else if ( (LA20_0=='{') ) {s = 10;}

                        else if ( (LA20_0=='}') ) {s = 11;}

                        else if ( (LA20_0=='t') ) {s = 12;}

                        else if ( (LA20_0=='$') ) {s = 13;}

                        else if ( (LA20_0=='c') ) {s = 14;}

                        else if ( (LA20_0=='@') ) {s = 15;}

                        else if ( (LA20_0=='.') ) {s = 16;}

                        else if ( (LA20_0=='*') ) {s = 17;}

                        else if ( (LA20_0=='[') ) {s = 18;}

                        else if ( (LA20_0==']') ) {s = 19;}

                        else if ( (LA20_0=='#') ) {s = 20;}

                        else if ( (LA20_0=='b') ) {s = 21;}

                        else if ( (LA20_0=='n') ) {s = 22;}

                        else if ( (LA20_0=='s') ) {s = 23;}

                        else if ( (LA20_0=='r') ) {s = 24;}

                        else if ( (LA20_0=='e') ) {s = 25;}

                        else if ( (LA20_0=='&') ) {s = 26;}

                        else if ( (LA20_0=='|') ) {s = 27;}

                        else if ( (LA20_0=='=') ) {s = 28;}

                        else if ( (LA20_0=='~') ) {s = 29;}

                        else if ( (LA20_0=='!') ) {s = 30;}

                        else if ( (LA20_0=='>') ) {s = 31;}

                        else if ( (LA20_0=='<') ) {s = 32;}

                        else if ( ((LA20_0>='0' && LA20_0<='9')) ) {s = 33;}

                        else if ( (LA20_0=='^') ) {s = 34;}

                        else if ( ((LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||LA20_0=='d'||(LA20_0>='f' && LA20_0<='h')||(LA20_0>='j' && LA20_0<='m')||LA20_0=='q'||(LA20_0>='v' && LA20_0<='z')) ) {s = 35;}

                        else if ( (LA20_0=='\"') ) {s = 36;}

                        else if ( (LA20_0=='\'') ) {s = 37;}

                        else if ( (LA20_0=='/') ) {s = 38;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 39;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='%'||LA20_0=='+'||LA20_0=='-'||LA20_0==';'||LA20_0=='?'||LA20_0=='\\'||LA20_0=='`'||(LA20_0>='\u007F' && LA20_0<='\uFFFF')) ) {s = 40;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_36 = input.LA(1);

                        s = -1;
                        if ( ((LA20_36>='\u0000' && LA20_36<='\uFFFF')) ) {s = 90;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_37 = input.LA(1);

                        s = -1;
                        if ( ((LA20_37>='\u0000' && LA20_37<='\uFFFF')) ) {s = 90;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
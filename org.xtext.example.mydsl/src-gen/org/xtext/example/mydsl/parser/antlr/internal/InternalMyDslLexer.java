package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_DECIMAL_DIGIT=10;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_BINARY_OP=4;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=18;
    public static final int RULE_MUL_OP=17;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=19;
    public static final int T__29=29;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=21;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_A_F=14;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_ESCAPED_CHAR=13;
    public static final int RULE_IDENTIFIER=7;
    public static final int RULE_STRING=20;
    public static final int RULE_SL_COMMENT=22;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int RULE_OCTAL_DIGIT=12;
    public static final int RULE_ADD_OP=16;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_WS=6;
    public static final int RULE_ANY_OTHER=23;
    public static final int RULE_LETTER=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_UNARY_OP=5;
    public static final int T__45=45;
    public static final int RULE_HEX_DIGIT=11;
    public static final int RULE_REL_OP=15;
    public static final int T__46=46;
    public static final int RULE_ASSIGN_OP=8;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'import' )
            // InternalMyDsl.g:11:9: 'import'
            {
            match("import"); 


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
            // InternalMyDsl.g:12:7: ( '(' )
            // InternalMyDsl.g:12:9: '('
            {
            match('('); 

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
            // InternalMyDsl.g:13:7: ( ';' )
            // InternalMyDsl.g:13:9: ';'
            {
            match(';'); 

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
            // InternalMyDsl.g:14:7: ( '}' )
            // InternalMyDsl.g:14:9: '}'
            {
            match('}'); 

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
            // InternalMyDsl.g:15:7: ( '.' )
            // InternalMyDsl.g:15:9: '.'
            {
            match('.'); 

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
            // InternalMyDsl.g:16:7: ( 'package' )
            // InternalMyDsl.g:16:9: 'package'
            {
            match("package"); 


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
            // InternalMyDsl.g:17:7: ( '[' )
            // InternalMyDsl.g:17:9: '['
            {
            match('['); 

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
            // InternalMyDsl.g:18:7: ( ']' )
            // InternalMyDsl.g:18:9: ']'
            {
            match(']'); 

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
            // InternalMyDsl.g:19:7: ( ':' )
            // InternalMyDsl.g:19:9: ':'
            {
            match(':'); 

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
            // InternalMyDsl.g:20:7: ( ',' )
            // InternalMyDsl.g:20:9: ','
            {
            match(','); 

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
            // InternalMyDsl.g:21:7: ( ')' )
            // InternalMyDsl.g:21:9: ')'
            {
            match(')'); 

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
            // InternalMyDsl.g:22:7: ( '...' )
            // InternalMyDsl.g:22:9: '...'
            {
            match("..."); 


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
            // InternalMyDsl.g:23:7: ( '{' )
            // InternalMyDsl.g:23:9: '{'
            {
            match('{'); 

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
            // InternalMyDsl.g:24:7: ( 'func' )
            // InternalMyDsl.g:24:9: 'func'
            {
            match("func"); 


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
            // InternalMyDsl.g:25:7: ( 'var' )
            // InternalMyDsl.g:25:9: 'var'
            {
            match("var"); 


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
            // InternalMyDsl.g:26:7: ( '=' )
            // InternalMyDsl.g:26:9: '='
            {
            match('='); 

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
            // InternalMyDsl.g:27:7: ( 'type' )
            // InternalMyDsl.g:27:9: 'type'
            {
            match("type"); 


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
            // InternalMyDsl.g:28:7: ( 'const' )
            // InternalMyDsl.g:28:9: 'const'
            {
            match("const"); 


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
            // InternalMyDsl.g:29:7: ( ':=' )
            // InternalMyDsl.g:29:9: ':='
            {
            match(":="); 


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
            // InternalMyDsl.g:30:7: ( 'defer' )
            // InternalMyDsl.g:30:9: 'defer'
            {
            match("defer"); 


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
            // InternalMyDsl.g:31:7: ( 'goto' )
            // InternalMyDsl.g:31:9: 'goto'
            {
            match("goto"); 


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
            // InternalMyDsl.g:32:7: ( 'continue' )
            // InternalMyDsl.g:32:9: 'continue'
            {
            match("continue"); 


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
            // InternalMyDsl.g:33:7: ( 'break' )
            // InternalMyDsl.g:33:9: 'break'
            {
            match("break"); 


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
            // InternalMyDsl.g:34:7: ( 'return' )
            // InternalMyDsl.g:34:9: 'return'
            {
            match("return"); 


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
            // InternalMyDsl.g:35:7: ( 'select' )
            // InternalMyDsl.g:35:9: 'select'
            {
            match("select"); 


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
            // InternalMyDsl.g:36:7: ( 'case' )
            // InternalMyDsl.g:36:9: 'case'
            {
            match("case"); 


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
            // InternalMyDsl.g:37:7: ( 'default' )
            // InternalMyDsl.g:37:9: 'default'
            {
            match("default"); 


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
            // InternalMyDsl.g:38:7: ( 'go' )
            // InternalMyDsl.g:38:9: 'go'
            {
            match("go"); 


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
            // InternalMyDsl.g:39:7: ( 'for' )
            // InternalMyDsl.g:39:9: 'for'
            {
            match("for"); 


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
            // InternalMyDsl.g:40:7: ( 'range' )
            // InternalMyDsl.g:40:9: 'range'
            {
            match("range"); 


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
            // InternalMyDsl.g:41:7: ( 'switch' )
            // InternalMyDsl.g:41:9: 'switch'
            {
            match("switch"); 


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
            // InternalMyDsl.g:42:7: ( 'if' )
            // InternalMyDsl.g:42:9: 'if'
            {
            match("if"); 


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
            // InternalMyDsl.g:43:7: ( 'else' )
            // InternalMyDsl.g:43:9: 'else'
            {
            match("else"); 


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
            // InternalMyDsl.g:44:7: ( '++' )
            // InternalMyDsl.g:44:9: '++'
            {
            match("++"); 


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
            // InternalMyDsl.g:45:7: ( '--' )
            // InternalMyDsl.g:45:9: '--'
            {
            match("--"); 


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
            // InternalMyDsl.g:46:7: ( '<-' )
            // InternalMyDsl.g:46:9: '<-'
            {
            match("<-"); 


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
            // InternalMyDsl.g:47:7: ( 'fallthrough' )
            // InternalMyDsl.g:47:9: 'fallthrough'
            {
            match("fallthrough"); 


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
            // InternalMyDsl.g:48:7: ( '*' )
            // InternalMyDsl.g:48:9: '*'
            {
            match('*'); 

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
            // InternalMyDsl.g:49:7: ( 'chan' )
            // InternalMyDsl.g:49:9: 'chan'
            {
            match("chan"); 


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
            // InternalMyDsl.g:50:7: ( 'map' )
            // InternalMyDsl.g:50:9: 'map'
            {
            match("map"); 


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
            // InternalMyDsl.g:51:7: ( 'interface' )
            // InternalMyDsl.g:51:9: 'interface'
            {
            match("interface"); 


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
            // InternalMyDsl.g:52:7: ( 'struct' )
            // InternalMyDsl.g:52:9: 'struct'
            {
            match("struct"); 


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
            // InternalMyDsl.g:53:7: ( '`' )
            // InternalMyDsl.g:53:9: '`'
            {
            match('`'); 

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
            // InternalMyDsl.g:54:7: ( '\\\\n' )
            // InternalMyDsl.g:54:9: '\\\\n'
            {
            match("\\n"); 


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
            // InternalMyDsl.g:55:7: ( '\"' )
            // InternalMyDsl.g:55:9: '\"'
            {
            match('\"'); 

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
            // InternalMyDsl.g:56:7: ( '\\'' )
            // InternalMyDsl.g:56:9: '\\''
            {
            match('\''); 

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
            // InternalMyDsl.g:57:7: ( '0' )
            // InternalMyDsl.g:57:9: '0'
            {
            match('0'); 

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
            // InternalMyDsl.g:58:7: ( 'x' )
            // InternalMyDsl.g:58:9: 'x'
            {
            match('x'); 

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
            // InternalMyDsl.g:59:7: ( 'X' )
            // InternalMyDsl.g:59:9: 'X'
            {
            match('X'); 

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
            // InternalMyDsl.g:60:7: ( 'i' )
            // InternalMyDsl.g:60:9: 'i'
            {
            match('i'); 

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
            // InternalMyDsl.g:61:7: ( 'e' )
            // InternalMyDsl.g:61:9: 'e'
            {
            match('e'); 

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
            // InternalMyDsl.g:62:7: ( 'E' )
            // InternalMyDsl.g:62:9: 'E'
            {
            match('E'); 

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
            // InternalMyDsl.g:63:7: ( '+' )
            // InternalMyDsl.g:63:9: '+'
            {
            match('+'); 

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
            // InternalMyDsl.g:64:7: ( '-' )
            // InternalMyDsl.g:64:9: '-'
            {
            match('-'); 

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
            // InternalMyDsl.g:65:7: ( '\\\\' )
            // InternalMyDsl.g:65:9: '\\\\'
            {
            match('\\'); 

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
            // InternalMyDsl.g:66:7: ( 'U' )
            // InternalMyDsl.g:66:9: 'U'
            {
            match('U'); 

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
            // InternalMyDsl.g:67:7: ( 'u' )
            // InternalMyDsl.g:67:9: 'u'
            {
            match('u'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8402:17: ( RULE_LETTER ( RULE_LETTER | RULE_DECIMAL_DIGIT )* )
            // InternalMyDsl.g:8402:19: RULE_LETTER ( RULE_LETTER | RULE_DECIMAL_DIGIT )*
            {
            mRULE_LETTER(); 
            // InternalMyDsl.g:8402:31: ( RULE_LETTER | RULE_DECIMAL_DIGIT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:
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
            	    break loop1;
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

    // $ANTLR start "RULE_A_F"
    public final void mRULE_A_F() throws RecognitionException {
        try {
            // InternalMyDsl.g:8404:19: ( ( 'A' .. 'F' | 'a' .. 'f' ) )
            // InternalMyDsl.g:8404:21: ( 'A' .. 'F' | 'a' .. 'f' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_A_F"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            int _type = RULE_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8406:13: ( ( RULE_A_F | 'g' .. 'z' | 'G' .. 'Z' | '_' ) )
            // InternalMyDsl.g:8406:15: ( RULE_A_F | 'g' .. 'z' | 'G' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_HEX_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8408:16: ( ( RULE_DECIMAL_DIGIT | RULE_A_F ) )
            // InternalMyDsl.g:8408:18: ( RULE_DECIMAL_DIGIT | RULE_A_F )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_OCTAL_DIGIT"
    public final void mRULE_OCTAL_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_OCTAL_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8410:18: ( '0' .. '7' )
            // InternalMyDsl.g:8410:20: '0' .. '7'
            {
            matchRange('0','7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_DIGIT"

    // $ANTLR start "RULE_ESCAPED_CHAR"
    public final void mRULE_ESCAPED_CHAR() throws RecognitionException {
        try {
            int _type = RULE_ESCAPED_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8412:19: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' ) )
            // InternalMyDsl.g:8412:21: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||(input.LA(1)>='a' && input.LA(1)<='b')||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPED_CHAR"

    // $ANTLR start "RULE_DECIMAL_DIGIT"
    public final void mRULE_DECIMAL_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8414:20: ( ( RULE_OCTAL_DIGIT | '8' | '9' ) )
            // InternalMyDsl.g:8414:22: ( RULE_OCTAL_DIGIT | '8' | '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_DIGIT"

    // $ANTLR start "RULE_BINARY_OP"
    public final void mRULE_BINARY_OP() throws RecognitionException {
        try {
            int _type = RULE_BINARY_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8416:16: ( ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP ) )
            // InternalMyDsl.g:8416:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            {
            // InternalMyDsl.g:8416:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:8416:19: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:8416:24: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:8416:29: RULE_REL_OP
                    {
                    mRULE_REL_OP(); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:8416:41: RULE_ADD_OP
                    {
                    mRULE_ADD_OP(); 

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:8416:53: RULE_MUL_OP
                    {
                    mRULE_MUL_OP(); 

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
    // $ANTLR end "RULE_BINARY_OP"

    // $ANTLR start "RULE_REL_OP"
    public final void mRULE_REL_OP() throws RecognitionException {
        try {
            // InternalMyDsl.g:8418:22: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) )
            // InternalMyDsl.g:8418:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            {
            // InternalMyDsl.g:8418:24: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            int alt3=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt3=1;
                }
                break;
            case '!':
                {
                alt3=2;
                }
                break;
            case '<':
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3=='=') ) {
                    alt3=4;
                }
                else {
                    alt3=3;}
                }
                break;
            case '>':
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4=='=') ) {
                    alt3=6;
                }
                else {
                    alt3=5;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:8418:25: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:8418:30: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:8418:35: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:8418:39: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:8418:44: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:8418:48: '>='
                    {
                    match(">="); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_REL_OP"

    // $ANTLR start "RULE_ADD_OP"
    public final void mRULE_ADD_OP() throws RecognitionException {
        try {
            // InternalMyDsl.g:8420:22: ( ( '+' | '-' | '|' | '^' ) )
            // InternalMyDsl.g:8420:24: ( '+' | '-' | '|' | '^' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='^'||input.LA(1)=='|' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADD_OP"

    // $ANTLR start "RULE_MUL_OP"
    public final void mRULE_MUL_OP() throws RecognitionException {
        try {
            // InternalMyDsl.g:8422:22: ( ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' ) )
            // InternalMyDsl.g:8422:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            {
            // InternalMyDsl.g:8422:24: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case '*':
                {
                alt4=1;
                }
                break;
            case '/':
                {
                alt4=2;
                }
                break;
            case '%':
                {
                alt4=3;
                }
                break;
            case '<':
                {
                alt4=4;
                }
                break;
            case '>':
                {
                alt4=5;
                }
                break;
            case '&':
                {
                int LA4_6 = input.LA(2);

                if ( (LA4_6=='^') ) {
                    alt4=7;
                }
                else {
                    alt4=6;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:8422:25: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:8422:29: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:8422:33: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:8422:37: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:8422:42: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:8422:47: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:8422:51: '&^'
                    {
                    match("&^"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MUL_OP"

    // $ANTLR start "RULE_UNARY_OP"
    public final void mRULE_UNARY_OP() throws RecognitionException {
        try {
            int _type = RULE_UNARY_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8424:15: ( ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' ) )
            // InternalMyDsl.g:8424:17: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            {
            // InternalMyDsl.g:8424:17: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            int alt5=7;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt5=1;
                }
                break;
            case '-':
                {
                alt5=2;
                }
                break;
            case '!':
                {
                alt5=3;
                }
                break;
            case '^':
                {
                alt5=4;
                }
                break;
            case '*':
                {
                alt5=5;
                }
                break;
            case '&':
                {
                alt5=6;
                }
                break;
            case '<':
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:8424:18: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:8424:22: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:8424:26: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:8424:30: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:8424:34: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:8424:38: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:8424:42: '<-'
                    {
                    match("<-"); 


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
    // $ANTLR end "RULE_UNARY_OP"

    // $ANTLR start "RULE_ASSIGN_OP"
    public final void mRULE_ASSIGN_OP() throws RecognitionException {
        try {
            int _type = RULE_ASSIGN_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8426:16: ( ( RULE_ADD_OP | RULE_MUL_OP )? '=' )
            // InternalMyDsl.g:8426:18: ( RULE_ADD_OP | RULE_MUL_OP )? '='
            {
            // InternalMyDsl.g:8426:18: ( RULE_ADD_OP | RULE_MUL_OP )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-'||LA6_0=='^'||LA6_0=='|') ) {
                alt6=1;
            }
            else if ( ((LA6_0>='%' && LA6_0<='&')||LA6_0=='*'||LA6_0=='/'||LA6_0=='<'||LA6_0=='>') ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:8426:19: RULE_ADD_OP
                    {
                    mRULE_ADD_OP(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:8426:31: RULE_MUL_OP
                    {
                    mRULE_MUL_OP(); 

                    }
                    break;

            }

            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASSIGN_OP"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8428:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:8428:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:8428:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:8428:11: '^'
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

            // InternalMyDsl.g:8428:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:
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
            	    break loop8;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8430:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:8430:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:8430:12: ( '0' .. '9' )+
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
            	    // InternalMyDsl.g:8430:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8432:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:8432:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:8432:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:8432:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:8432:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:8432:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:8432:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:8432:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:8432:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:8432:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:8432:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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
            // InternalMyDsl.g:8434:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:8434:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:8434:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:8434:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // InternalMyDsl.g:8436:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:8436:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:8436:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:8436:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop14;
                }
            } while (true);

            // InternalMyDsl.g:8436:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:8436:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:8436:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMyDsl.g:8436:41: '\\r'
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
            // InternalMyDsl.g:8438:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:8438:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:8438:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // InternalMyDsl.g:8440:16: ( . )
            // InternalMyDsl.g:8440:18: .
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
        // InternalMyDsl.g:1:8: ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_IDENTIFIER | RULE_LETTER | RULE_HEX_DIGIT | RULE_OCTAL_DIGIT | RULE_ESCAPED_CHAR | RULE_DECIMAL_DIGIT | RULE_BINARY_OP | RULE_UNARY_OP | RULE_ASSIGN_OP | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=73;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalMyDsl.g:1:10: T__24
                {
                mT__24(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__25
                {
                mT__25(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__26
                {
                mT__26(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__27
                {
                mT__27(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__28
                {
                mT__28(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__29
                {
                mT__29(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__30
                {
                mT__30(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__31
                {
                mT__31(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__32
                {
                mT__32(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__33
                {
                mT__33(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__34
                {
                mT__34(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__35
                {
                mT__35(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__36
                {
                mT__36(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__37
                {
                mT__37(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__38
                {
                mT__38(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__39
                {
                mT__39(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__40
                {
                mT__40(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__41
                {
                mT__41(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__42
                {
                mT__42(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__43
                {
                mT__43(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__44
                {
                mT__44(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__45
                {
                mT__45(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__46
                {
                mT__46(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__47
                {
                mT__47(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__48
                {
                mT__48(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__49
                {
                mT__49(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__50
                {
                mT__50(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__51
                {
                mT__51(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__52
                {
                mT__52(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__53
                {
                mT__53(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: T__54
                {
                mT__54(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:196: T__55
                {
                mT__55(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:202: T__56
                {
                mT__56(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:208: T__57
                {
                mT__57(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:214: T__58
                {
                mT__58(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:220: T__59
                {
                mT__59(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:226: T__60
                {
                mT__60(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:232: T__61
                {
                mT__61(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:238: T__62
                {
                mT__62(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:244: T__63
                {
                mT__63(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:250: T__64
                {
                mT__64(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:256: T__65
                {
                mT__65(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:262: T__66
                {
                mT__66(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:268: T__67
                {
                mT__67(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:274: T__68
                {
                mT__68(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:280: T__69
                {
                mT__69(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:286: T__70
                {
                mT__70(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:292: T__71
                {
                mT__71(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:298: T__72
                {
                mT__72(); 

                }
                break;
            case 50 :
                // InternalMyDsl.g:1:304: T__73
                {
                mT__73(); 

                }
                break;
            case 51 :
                // InternalMyDsl.g:1:310: T__74
                {
                mT__74(); 

                }
                break;
            case 52 :
                // InternalMyDsl.g:1:316: T__75
                {
                mT__75(); 

                }
                break;
            case 53 :
                // InternalMyDsl.g:1:322: T__76
                {
                mT__76(); 

                }
                break;
            case 54 :
                // InternalMyDsl.g:1:328: T__77
                {
                mT__77(); 

                }
                break;
            case 55 :
                // InternalMyDsl.g:1:334: T__78
                {
                mT__78(); 

                }
                break;
            case 56 :
                // InternalMyDsl.g:1:340: T__79
                {
                mT__79(); 

                }
                break;
            case 57 :
                // InternalMyDsl.g:1:346: T__80
                {
                mT__80(); 

                }
                break;
            case 58 :
                // InternalMyDsl.g:1:352: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 59 :
                // InternalMyDsl.g:1:368: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 60 :
                // InternalMyDsl.g:1:380: RULE_HEX_DIGIT
                {
                mRULE_HEX_DIGIT(); 

                }
                break;
            case 61 :
                // InternalMyDsl.g:1:395: RULE_OCTAL_DIGIT
                {
                mRULE_OCTAL_DIGIT(); 

                }
                break;
            case 62 :
                // InternalMyDsl.g:1:412: RULE_ESCAPED_CHAR
                {
                mRULE_ESCAPED_CHAR(); 

                }
                break;
            case 63 :
                // InternalMyDsl.g:1:430: RULE_DECIMAL_DIGIT
                {
                mRULE_DECIMAL_DIGIT(); 

                }
                break;
            case 64 :
                // InternalMyDsl.g:1:449: RULE_BINARY_OP
                {
                mRULE_BINARY_OP(); 

                }
                break;
            case 65 :
                // InternalMyDsl.g:1:464: RULE_UNARY_OP
                {
                mRULE_UNARY_OP(); 

                }
                break;
            case 66 :
                // InternalMyDsl.g:1:478: RULE_ASSIGN_OP
                {
                mRULE_ASSIGN_OP(); 

                }
                break;
            case 67 :
                // InternalMyDsl.g:1:493: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 68 :
                // InternalMyDsl.g:1:501: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 69 :
                // InternalMyDsl.g:1:510: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 70 :
                // InternalMyDsl.g:1:522: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 71 :
                // InternalMyDsl.g:1:538: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 72 :
                // InternalMyDsl.g:1:554: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 73 :
                // InternalMyDsl.g:1:562: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA2_eotS =
        "\1\uffff\1\6\1\7\1\uffff\2\3\4\uffff";
    static final String DFA2_eofS =
        "\12\uffff";
    static final String DFA2_minS =
        "\1\41\1\174\1\46\1\uffff\1\74\1\76\4\uffff";
    static final String DFA2_maxS =
        "\2\174\1\46\1\uffff\1\74\1\76\4\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\3\2\uffff\1\4\1\5\1\1\1\2";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\3\3\uffff\1\7\1\2\3\uffff\1\7\1\6\1\uffff\1\6\1\uffff\1\7\14\uffff\1\4\1\3\1\5\37\uffff\1\6\35\uffff\1\1",
            "\1\10",
            "\1\11",
            "",
            "\1\7",
            "\1\7",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "8416:18: ( '||' | '&&' | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP )";
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\1\67\3\uffff\1\75\1\77\2\uffff\1\103\3\uffff\2\77\1\114\7\77\1\132\1\134\1\137\1\113\1\142\1\77\1\uffff\1\147\1\151\1\152\1\153\1\155\1\156\1\157\1\160\1\161\2\77\2\162\2\113\1\164\4\113\2\uffff\1\77\1\173\1\77\1\uffff\1\77\5\uffff\1\77\10\uffff\4\77\2\uffff\5\77\1\u0088\7\77\7\uffff\1\113\1\uffff\1\77\17\uffff\1\113\1\uffff\1\113\4\uffff\1\77\1\uffff\3\77\1\u0097\1\77\1\u0099\6\77\1\uffff\7\77\1\uffff\1\u00a9\1\uffff\3\77\1\u00ad\1\uffff\1\77\1\uffff\1\u00af\2\77\1\u00b2\1\u00b3\2\77\1\u00b6\6\77\1\u00bd\1\uffff\3\77\1\uffff\1\77\1\uffff\1\u00c2\1\77\2\uffff\1\u00c4\1\77\1\uffff\1\u00c6\1\77\1\u00c8\3\77\1\uffff\1\u00cc\3\77\1\uffff\1\77\1\uffff\1\77\1\uffff\1\u00d2\1\uffff\1\u00d3\1\u00d4\1\u00d5\1\uffff\1\77\1\u00d7\2\77\1\u00da\4\uffff\1\77\1\uffff\1\77\1\u00dd\1\uffff\1\u00de\1\77\2\uffff\1\77\1\u00e1\1\uffff";
    static final String DFA18_eofS =
        "\u00e2\uffff";
    static final String DFA18_minS =
        "\1\0\1\60\3\uffff\1\56\1\60\2\uffff\1\75\3\uffff\2\60\1\75\10\60\1\53\2\55\1\75\1\60\1\uffff\1\42\2\0\12\60\3\75\1\76\1\75\1\52\1\75\2\uffff\3\60\1\uffff\1\60\5\uffff\1\60\10\uffff\4\60\2\uffff\15\60\7\uffff\1\75\1\uffff\1\60\17\uffff\1\75\1\uffff\1\75\4\uffff\1\60\1\uffff\14\60\1\uffff\7\60\1\uffff\1\60\1\uffff\4\60\1\uffff\1\60\1\uffff\17\60\1\uffff\3\60\1\uffff\1\60\1\uffff\2\60\2\uffff\2\60\1\uffff\6\60\1\uffff\4\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\3\60\1\uffff\5\60\4\uffff\1\60\1\uffff\2\60\1\uffff\2\60\2\uffff\2\60\1\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\172\3\uffff\1\56\1\172\2\uffff\1\75\3\uffff\2\172\1\75\10\172\2\75\1\74\1\75\1\172\1\uffff\1\166\2\uffff\1\71\7\172\2\71\1\75\1\136\1\75\1\76\1\172\2\75\2\uffff\3\172\1\uffff\1\172\5\uffff\1\172\10\uffff\4\172\2\uffff\15\172\7\uffff\1\75\1\uffff\1\172\17\uffff\1\75\1\uffff\1\75\4\uffff\1\172\1\uffff\14\172\1\uffff\7\172\1\uffff\1\172\1\uffff\4\172\1\uffff\1\172\1\uffff\17\172\1\uffff\3\172\1\uffff\1\172\1\uffff\2\172\2\uffff\2\172\1\uffff\6\172\1\uffff\4\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\3\172\1\uffff\5\172\4\uffff\1\172\1\uffff\2\172\1\uffff\2\172\2\uffff\2\172\1\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\1\3\1\4\2\uffff\1\7\1\10\1\uffff\1\12\1\13\1\15\20\uffff\1\53\24\uffff\1\110\1\111\3\uffff\1\62\1\uffff\1\2\1\3\1\4\1\14\1\5\1\uffff\1\72\1\7\1\10\1\23\1\11\1\12\1\13\1\15\4\uffff\1\100\1\20\15\uffff\1\63\1\42\1\65\1\102\1\43\1\66\1\44\1\uffff\1\46\1\uffff\1\53\1\54\1\76\1\67\1\105\1\55\1\56\1\57\1\104\1\60\1\61\1\64\1\70\1\71\1\74\1\uffff\1\101\1\uffff\1\103\1\106\1\107\1\110\1\uffff\1\40\14\uffff\1\34\7\uffff\1\44\1\uffff\1\54\4\uffff\1\35\1\uffff\1\17\17\uffff\1\50\3\uffff\1\16\1\uffff\1\21\2\uffff\1\32\1\47\2\uffff\1\25\6\uffff\1\41\4\uffff\1\22\1\uffff\1\24\1\uffff\1\27\1\uffff\1\36\3\uffff\1\1\5\uffff\1\30\1\31\1\37\1\52\1\uffff\1\6\2\uffff\1\33\2\uffff\1\26\1\51\2\uffff\1\45";
    static final String DFA18_specialS =
        "\1\1\36\uffff\1\0\1\2\u00c1\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\63\2\62\2\63\1\62\22\63\1\62\1\55\1\37\2\63\1\61\1\54\1\40\1\2\1\13\1\33\1\30\1\12\1\31\1\5\1\60\1\41\7\51\2\52\1\11\1\3\1\32\1\17\1\56\2\63\4\47\1\44\1\47\16\50\1\45\2\50\1\43\2\50\1\7\1\36\1\10\1\57\1\50\1\35\1\47\1\24\1\21\1\22\1\27\1\15\1\23\1\50\1\1\3\50\1\34\2\50\1\6\1\50\1\25\1\26\1\20\1\46\1\16\1\50\1\42\2\50\1\14\1\53\1\4\uff82\63",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\5\70\1\65\6\70\1\64\1\66\14\70",
            "",
            "",
            "",
            "\1\74",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\76\31\70",
            "",
            "",
            "\1\102",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\111\15\70\1\110\5\70\1\107\5\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\112\31\70",
            "\1\113",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\30\70\1\115\1\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\117\6\70\1\120\6\70\1\116\13\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\121\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\122\13\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\123\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\125\3\70\1\124\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\126\16\70\1\130\2\70\1\127\3\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\131\16\70",
            "\1\133\21\uffff\1\135",
            "\1\136\17\uffff\1\135",
            "\1\140\16\uffff\1\141",
            "\1\135",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\143\31\70",
            "",
            "\1\146\4\uffff\1\146\64\uffff\1\146\4\uffff\2\146\3\uffff\1\146\7\uffff\1\145\3\uffff\1\146\1\uffff\1\146\1\uffff\1\146",
            "\0\150",
            "\0\150",
            "\12\154",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\154",
            "\12\154",
            "\1\135",
            "\1\135\40\uffff\1\163",
            "\1\113",
            "\1\165",
            "\1\135\3\uffff\32\166\4\uffff\1\166\1\uffff\32\166",
            "\1\167\4\uffff\1\170\15\uffff\1\135",
            "\1\135",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\17\70\1\172\12\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\174\6\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\175\27\70",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\176\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\177\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u0080\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u0081\10\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\17\70\1\u0082\12\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u0083\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\u0084\7\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u0085\31\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\5\70\1\u0086\24\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u0087\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u0089\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u008a\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u008b\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u008c\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\u008d\21\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u008e\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\u008f\7\70",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\135",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\17\70\1\u0091\12\70",
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
            "\1\135",
            "",
            "\1\135",
            "",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\u0093\13\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u0094\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\12\70\1\u0095\17\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u0096\27\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u0098\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u009a\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\u009b\1\u009c\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u009d\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u009e\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u00a0\3\70\1\u009f\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\u00a1\13\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u00a2\31\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\u00a3\5\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\6\70\1\u00a4\23\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00a5\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00a6\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\u00a7\5\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00a8\25\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u00aa\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u00ab\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u00ac\31\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00ae\6\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00b0\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\u00b1\21\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u00b4\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\u00b5\5\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\12\70\1\u00b7\17\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u00b8\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00b9\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u00ba\27\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u00bb\27\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u00bc\27\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00be\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\5\70\1\u00bf\24\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\6\70\1\u00c0\23\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\7\70\1\u00c1\22\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u00c3\14\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u00c5\16\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u00c7\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00c9\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\7\70\1\u00ca\22\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00cb\6\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u00cd\31\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00ce\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u00cf\10\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\u00d0\5\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00d1\6\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u00d6\27\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\u00d8\13\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00d9\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00db\25\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\u00dc\5\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\6\70\1\u00df\23\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\7\70\1\u00e0\22\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_IDENTIFIER | RULE_LETTER | RULE_HEX_DIGIT | RULE_OCTAL_DIGIT | RULE_ESCAPED_CHAR | RULE_DECIMAL_DIGIT | RULE_BINARY_OP | RULE_UNARY_OP | RULE_ASSIGN_OP | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_31 = input.LA(1);

                        s = -1;
                        if ( ((LA18_31>='\u0000' && LA18_31<='\uFFFF')) ) {s = 104;}

                        else s = 105;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='i') ) {s = 1;}

                        else if ( (LA18_0=='(') ) {s = 2;}

                        else if ( (LA18_0==';') ) {s = 3;}

                        else if ( (LA18_0=='}') ) {s = 4;}

                        else if ( (LA18_0=='.') ) {s = 5;}

                        else if ( (LA18_0=='p') ) {s = 6;}

                        else if ( (LA18_0=='[') ) {s = 7;}

                        else if ( (LA18_0==']') ) {s = 8;}

                        else if ( (LA18_0==':') ) {s = 9;}

                        else if ( (LA18_0==',') ) {s = 10;}

                        else if ( (LA18_0==')') ) {s = 11;}

                        else if ( (LA18_0=='{') ) {s = 12;}

                        else if ( (LA18_0=='f') ) {s = 13;}

                        else if ( (LA18_0=='v') ) {s = 14;}

                        else if ( (LA18_0=='=') ) {s = 15;}

                        else if ( (LA18_0=='t') ) {s = 16;}

                        else if ( (LA18_0=='c') ) {s = 17;}

                        else if ( (LA18_0=='d') ) {s = 18;}

                        else if ( (LA18_0=='g') ) {s = 19;}

                        else if ( (LA18_0=='b') ) {s = 20;}

                        else if ( (LA18_0=='r') ) {s = 21;}

                        else if ( (LA18_0=='s') ) {s = 22;}

                        else if ( (LA18_0=='e') ) {s = 23;}

                        else if ( (LA18_0=='+') ) {s = 24;}

                        else if ( (LA18_0=='-') ) {s = 25;}

                        else if ( (LA18_0=='<') ) {s = 26;}

                        else if ( (LA18_0=='*') ) {s = 27;}

                        else if ( (LA18_0=='m') ) {s = 28;}

                        else if ( (LA18_0=='`') ) {s = 29;}

                        else if ( (LA18_0=='\\') ) {s = 30;}

                        else if ( (LA18_0=='\"') ) {s = 31;}

                        else if ( (LA18_0=='\'') ) {s = 32;}

                        else if ( (LA18_0=='0') ) {s = 33;}

                        else if ( (LA18_0=='x') ) {s = 34;}

                        else if ( (LA18_0=='X') ) {s = 35;}

                        else if ( (LA18_0=='E') ) {s = 36;}

                        else if ( (LA18_0=='U') ) {s = 37;}

                        else if ( (LA18_0=='u') ) {s = 38;}

                        else if ( ((LA18_0>='A' && LA18_0<='D')||LA18_0=='F'||LA18_0=='a') ) {s = 39;}

                        else if ( ((LA18_0>='G' && LA18_0<='T')||(LA18_0>='V' && LA18_0<='W')||(LA18_0>='Y' && LA18_0<='Z')||LA18_0=='_'||LA18_0=='h'||(LA18_0>='j' && LA18_0<='l')||(LA18_0>='n' && LA18_0<='o')||LA18_0=='q'||LA18_0=='w'||(LA18_0>='y' && LA18_0<='z')) ) {s = 40;}

                        else if ( ((LA18_0>='1' && LA18_0<='7')) ) {s = 41;}

                        else if ( ((LA18_0>='8' && LA18_0<='9')) ) {s = 42;}

                        else if ( (LA18_0=='|') ) {s = 43;}

                        else if ( (LA18_0=='&') ) {s = 44;}

                        else if ( (LA18_0=='!') ) {s = 45;}

                        else if ( (LA18_0=='>') ) {s = 46;}

                        else if ( (LA18_0=='^') ) {s = 47;}

                        else if ( (LA18_0=='/') ) {s = 48;}

                        else if ( (LA18_0=='%') ) {s = 49;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 50;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||(LA18_0>='#' && LA18_0<='$')||(LA18_0>='?' && LA18_0<='@')||(LA18_0>='~' && LA18_0<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_32 = input.LA(1);

                        s = -1;
                        if ( ((LA18_32>='\u0000' && LA18_32<='\uFFFF')) ) {s = 104;}

                        else s = 106;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
package org.xtext.example.mydsl2.group16.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGreedySnakeLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators

    public InternalGreedySnakeLexer() {;} 
    public InternalGreedySnakeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGreedySnakeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGreedySnake.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGreedySnake.g:11:7: ( 'int' )
            // InternalGreedySnake.g:11:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGreedySnake.g:12:7: ( 'String' )
            // InternalGreedySnake.g:12:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGreedySnake.g:13:7: ( 'Behaviour' )
            // InternalGreedySnake.g:13:9: 'Behaviour'
            {
            match("Behaviour"); 


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
            // InternalGreedySnake.g:14:7: ( '+' )
            // InternalGreedySnake.g:14:9: '+'
            {
            match('+'); 

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
            // InternalGreedySnake.g:15:7: ( '-' )
            // InternalGreedySnake.g:15:9: '-'
            {
            match('-'); 

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
            // InternalGreedySnake.g:16:7: ( '*' )
            // InternalGreedySnake.g:16:9: '*'
            {
            match('*'); 

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
            // InternalGreedySnake.g:17:7: ( '/' )
            // InternalGreedySnake.g:17:9: '/'
            {
            match('/'); 

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
            // InternalGreedySnake.g:18:7: ( 'game' )
            // InternalGreedySnake.g:18:9: 'game'
            {
            match("game"); 


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
            // InternalGreedySnake.g:19:7: ( '{' )
            // InternalGreedySnake.g:19:9: '{'
            {
            match('{'); 

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
            // InternalGreedySnake.g:20:7: ( '}' )
            // InternalGreedySnake.g:20:9: '}'
            {
            match('}'); 

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
            // InternalGreedySnake.g:21:7: ( 'Filepath' )
            // InternalGreedySnake.g:21:9: 'Filepath'
            {
            match("Filepath"); 


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
            // InternalGreedySnake.g:22:7: ( '=' )
            // InternalGreedySnake.g:22:9: '='
            {
            match('='); 

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
            // InternalGreedySnake.g:23:7: ( 'field' )
            // InternalGreedySnake.g:23:9: 'field'
            {
            match("field"); 


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
            // InternalGreedySnake.g:24:7: ( 'Panel_width' )
            // InternalGreedySnake.g:24:9: 'Panel_width'
            {
            match("Panel_width"); 


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
            // InternalGreedySnake.g:25:7: ( 'Panel_Height' )
            // InternalGreedySnake.g:25:9: 'Panel_Height'
            {
            match("Panel_Height"); 


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
            // InternalGreedySnake.g:26:7: ( 'column' )
            // InternalGreedySnake.g:26:9: 'column'
            {
            match("column"); 


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
            // InternalGreedySnake.g:27:7: ( 'row' )
            // InternalGreedySnake.g:27:9: 'row'
            {
            match("row"); 


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
            // InternalGreedySnake.g:28:7: ( 'label_width' )
            // InternalGreedySnake.g:28:9: 'label_width'
            {
            match("label_width"); 


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
            // InternalGreedySnake.g:29:7: ( 'label_Height' )
            // InternalGreedySnake.g:29:9: 'label_Height'
            {
            match("label_Height"); 


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
            // InternalGreedySnake.g:30:7: ( 'init' )
            // InternalGreedySnake.g:30:9: 'init'
            {
            match("init"); 


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
            // InternalGreedySnake.g:31:7: ( '(' )
            // InternalGreedySnake.g:31:9: '('
            {
            match('('); 

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
            // InternalGreedySnake.g:32:7: ( ')' )
            // InternalGreedySnake.g:32:9: ')'
            {
            match(')'); 

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
            // InternalGreedySnake.g:33:7: ( 'Default' )
            // InternalGreedySnake.g:33:9: 'Default'
            {
            match("Default"); 


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
            // InternalGreedySnake.g:34:7: ( ':' )
            // InternalGreedySnake.g:34:9: ':'
            {
            match(':'); 

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
            // InternalGreedySnake.g:35:7: ( 'snakeLength' )
            // InternalGreedySnake.g:35:9: 'snakeLength'
            {
            match("snakeLength"); 


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
            // InternalGreedySnake.g:36:7: ( 'Score' )
            // InternalGreedySnake.g:36:9: 'Score'
            {
            match("Score"); 


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
            // InternalGreedySnake.g:37:7: ( 'Time' )
            // InternalGreedySnake.g:37:9: 'Time'
            {
            match("Time"); 


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
            // InternalGreedySnake.g:38:7: ( 'Amount' )
            // InternalGreedySnake.g:38:9: 'Amount'
            {
            match("Amount"); 


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
            // InternalGreedySnake.g:39:7: ( 'Weapon' )
            // InternalGreedySnake.g:39:9: 'Weapon'
            {
            match("Weapon"); 


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
            // InternalGreedySnake.g:40:7: ( 'snake' )
            // InternalGreedySnake.g:40:9: 'snake'
            {
            match("snake"); 


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
            // InternalGreedySnake.g:41:7: ( 'food' )
            // InternalGreedySnake.g:41:9: 'food'
            {
            match("food"); 


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
            // InternalGreedySnake.g:42:7: ( 'obstacle' )
            // InternalGreedySnake.g:42:9: 'obstacle'
            {
            match("obstacle"); 


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
            // InternalGreedySnake.g:43:7: ( 'fire' )
            // InternalGreedySnake.g:43:9: 'fire'
            {
            match("fire"); 


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
            // InternalGreedySnake.g:44:7: ( 'Speed' )
            // InternalGreedySnake.g:44:9: 'Speed'
            {
            match("Speed"); 


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
            // InternalGreedySnake.g:45:7: ( 'FireIcon' )
            // InternalGreedySnake.g:45:9: 'FireIcon'
            {
            match("FireIcon"); 


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
            // InternalGreedySnake.g:46:7: ( 'Icon_size' )
            // InternalGreedySnake.g:46:9: 'Icon_size'
            {
            match("Icon_size"); 


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
            // InternalGreedySnake.g:47:7: ( 'head' )
            // InternalGreedySnake.g:47:9: 'head'
            {
            match("head"); 


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
            // InternalGreedySnake.g:48:7: ( ',' )
            // InternalGreedySnake.g:48:9: ','
            {
            match(','); 

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
            // InternalGreedySnake.g:49:7: ( 'headIcon' )
            // InternalGreedySnake.g:49:9: 'headIcon'
            {
            match("headIcon"); 


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
            // InternalGreedySnake.g:50:7: ( 'BodyIcon' )
            // InternalGreedySnake.g:50:9: 'BodyIcon'
            {
            match("BodyIcon"); 


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
            // InternalGreedySnake.g:51:7: ( 'defaultSpeed' )
            // InternalGreedySnake.g:51:9: 'defaultSpeed'
            {
            match("defaultSpeed"); 


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
            // InternalGreedySnake.g:52:7: ( 'snakeTag' )
            // InternalGreedySnake.g:52:9: 'snakeTag'
            {
            match("snakeTag"); 


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
            // InternalGreedySnake.g:53:7: ( 'Locate' )
            // InternalGreedySnake.g:53:9: 'Locate'
            {
            match("Locate"); 


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
            // InternalGreedySnake.g:54:7: ( 'foodIcon' )
            // InternalGreedySnake.g:54:9: 'foodIcon'
            {
            match("foodIcon"); 


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
            // InternalGreedySnake.g:55:7: ( 'foodKind' )
            // InternalGreedySnake.g:55:9: 'foodKind'
            {
            match("foodKind"); 


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
            // InternalGreedySnake.g:56:7: ( 'randomFoodSize' )
            // InternalGreedySnake.g:56:9: 'randomFoodSize'
            {
            match("randomFoodSize"); 


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
            // InternalGreedySnake.g:57:7: ( 'foodTag' )
            // InternalGreedySnake.g:57:9: 'foodTag'
            {
            match("foodTag"); 


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
            // InternalGreedySnake.g:58:7: ( 'point' )
            // InternalGreedySnake.g:58:9: 'point'
            {
            match("point"); 


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
            // InternalGreedySnake.g:59:7: ( 'ObstacleIcon' )
            // InternalGreedySnake.g:59:9: 'ObstacleIcon'
            {
            match("ObstacleIcon"); 


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
            // InternalGreedySnake.g:60:7: ( 'ObstacleTag' )
            // InternalGreedySnake.g:60:9: 'ObstacleTag'
            {
            match("ObstacleTag"); 


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
            // InternalGreedySnake.g:61:7: ( 'Maxsize' )
            // InternalGreedySnake.g:61:9: 'Maxsize'
            {
            match("Maxsize"); 


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
            // InternalGreedySnake.g:62:7: ( 'Minsize' )
            // InternalGreedySnake.g:62:9: 'Minsize'
            {
            match("Minsize"); 


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
            // InternalGreedySnake.g:63:7: ( 'timeLimited' )
            // InternalGreedySnake.g:63:9: 'timeLimited'
            {
            match("timeLimited"); 


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
            // InternalGreedySnake.g:64:7: ( '.' )
            // InternalGreedySnake.g:64:9: '.'
            {
            match('.'); 

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
            // InternalGreedySnake.g:65:7: ( 'restartGame' )
            // InternalGreedySnake.g:65:9: 'restartGame'
            {
            match("restartGame"); 


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
            // InternalGreedySnake.g:66:7: ( 'start' )
            // InternalGreedySnake.g:66:9: 'start'
            {
            match("start"); 


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
            // InternalGreedySnake.g:67:7: ( 'about' )
            // InternalGreedySnake.g:67:9: 'about'
            {
            match("about"); 


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
            // InternalGreedySnake.g:68:7: ( 'Title' )
            // InternalGreedySnake.g:68:9: 'Title'
            {
            match("Title"); 


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
            // InternalGreedySnake.g:69:7: ( 'Information' )
            // InternalGreedySnake.g:69:9: 'Information'
            {
            match("Information"); 


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
            // InternalGreedySnake.g:70:7: ( 'Label_size' )
            // InternalGreedySnake.g:70:9: 'Label_size'
            {
            match("Label_size"); 


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
            // InternalGreedySnake.g:71:7: ( 'help' )
            // InternalGreedySnake.g:71:9: 'help'
            {
            match("help"); 


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
            // InternalGreedySnake.g:72:7: ( 'backGround' )
            // InternalGreedySnake.g:72:9: 'backGround'
            {
            match("backGround"); 


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
            // InternalGreedySnake.g:73:7: ( 'Icon' )
            // InternalGreedySnake.g:73:9: 'Icon'
            {
            match("Icon"); 


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
            // InternalGreedySnake.g:74:7: ( 'Height' )
            // InternalGreedySnake.g:74:9: 'Height'
            {
            match("Height"); 


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
            // InternalGreedySnake.g:75:7: ( 'Width' )
            // InternalGreedySnake.g:75:9: 'Width'
            {
            match("Width"); 


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
            // InternalGreedySnake.g:76:7: ( 'Music' )
            // InternalGreedySnake.g:76:9: 'Music'
            {
            match("Music"); 


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
            // InternalGreedySnake.g:77:7: ( 'BufferSize' )
            // InternalGreedySnake.g:77:9: 'BufferSize'
            {
            match("BufferSize"); 


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
            // InternalGreedySnake.g:78:7: ( 'path' )
            // InternalGreedySnake.g:78:9: 'path'
            {
            match("path"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGreedySnake.g:10247:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGreedySnake.g:10247:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGreedySnake.g:10247:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGreedySnake.g:10247:11: '^'
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

            // InternalGreedySnake.g:10247:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGreedySnake.g:
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
            	    break loop2;
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
            // InternalGreedySnake.g:10249:10: ( ( '0' .. '9' )+ )
            // InternalGreedySnake.g:10249:12: ( '0' .. '9' )+
            {
            // InternalGreedySnake.g:10249:12: ( '0' .. '9' )+
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
            	    // InternalGreedySnake.g:10249:13: '0' .. '9'
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
            // InternalGreedySnake.g:10251:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGreedySnake.g:10251:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGreedySnake.g:10251:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGreedySnake.g:10251:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGreedySnake.g:10251:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalGreedySnake.g:10251:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGreedySnake.g:10251:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:10251:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGreedySnake.g:10251:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGreedySnake.g:10251:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGreedySnake.g:10251:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // InternalGreedySnake.g:10253:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGreedySnake.g:10253:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGreedySnake.g:10253:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGreedySnake.g:10253:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalGreedySnake.g:10255:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGreedySnake.g:10255:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGreedySnake.g:10255:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGreedySnake.g:10255:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalGreedySnake.g:10255:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGreedySnake.g:10255:41: ( '\\r' )? '\\n'
                    {
                    // InternalGreedySnake.g:10255:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalGreedySnake.g:10255:41: '\\r'
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
            // InternalGreedySnake.g:10257:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGreedySnake.g:10257:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGreedySnake.g:10257:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGreedySnake.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalGreedySnake.g:10259:16: ( . )
            // InternalGreedySnake.g:10259:18: .
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
        // InternalGreedySnake.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=75;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalGreedySnake.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalGreedySnake.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalGreedySnake.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalGreedySnake.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalGreedySnake.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalGreedySnake.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalGreedySnake.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalGreedySnake.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalGreedySnake.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalGreedySnake.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalGreedySnake.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalGreedySnake.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalGreedySnake.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalGreedySnake.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalGreedySnake.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalGreedySnake.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalGreedySnake.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalGreedySnake.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalGreedySnake.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalGreedySnake.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalGreedySnake.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalGreedySnake.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalGreedySnake.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalGreedySnake.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalGreedySnake.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalGreedySnake.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalGreedySnake.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalGreedySnake.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalGreedySnake.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalGreedySnake.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalGreedySnake.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalGreedySnake.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalGreedySnake.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalGreedySnake.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalGreedySnake.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalGreedySnake.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalGreedySnake.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalGreedySnake.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalGreedySnake.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalGreedySnake.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalGreedySnake.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalGreedySnake.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalGreedySnake.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalGreedySnake.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalGreedySnake.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalGreedySnake.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalGreedySnake.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalGreedySnake.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalGreedySnake.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalGreedySnake.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalGreedySnake.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalGreedySnake.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalGreedySnake.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalGreedySnake.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalGreedySnake.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalGreedySnake.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalGreedySnake.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalGreedySnake.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // InternalGreedySnake.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // InternalGreedySnake.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // InternalGreedySnake.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // InternalGreedySnake.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // InternalGreedySnake.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // InternalGreedySnake.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // InternalGreedySnake.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // InternalGreedySnake.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // InternalGreedySnake.g:1:406: T__77
                {
                mT__77(); 

                }
                break;
            case 68 :
                // InternalGreedySnake.g:1:412: T__78
                {
                mT__78(); 

                }
                break;
            case 69 :
                // InternalGreedySnake.g:1:418: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 70 :
                // InternalGreedySnake.g:1:426: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 71 :
                // InternalGreedySnake.g:1:435: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 72 :
                // InternalGreedySnake.g:1:447: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 73 :
                // InternalGreedySnake.g:1:463: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 74 :
                // InternalGreedySnake.g:1:479: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 75 :
                // InternalGreedySnake.g:1:487: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\3\60\3\uffff\1\74\1\60\2\uffff\1\60\1\uffff\5\60\2\uffff\1\60\1\uffff\7\60\1\uffff\6\60\1\uffff\3\60\1\56\2\uffff\2\56\2\uffff\1\60\1\uffff\6\60\6\uffff\1\60\2\uffff\1\60\1\uffff\10\60\2\uffff\1\60\1\uffff\12\60\1\uffff\12\60\1\uffff\3\60\3\uffff\1\u0098\17\60\1\u00a8\35\60\1\uffff\1\u00c6\6\60\1\u00cd\3\60\1\u00d1\1\u00d5\2\60\1\uffff\6\60\1\u00de\5\60\1\u00e5\1\60\1\u00e8\1\u00e9\4\60\1\u00ee\10\60\1\uffff\1\60\1\u00f8\1\u00f9\3\60\1\uffff\2\60\1\u00ff\1\uffff\3\60\1\uffff\6\60\1\u010b\1\u010c\1\uffff\1\u010d\2\60\1\u0110\2\60\1\uffff\2\60\2\uffff\3\60\1\u0118\1\uffff\3\60\1\u011c\1\60\1\u011e\2\60\1\u0121\2\uffff\5\60\1\uffff\4\60\1\u012c\6\60\3\uffff\1\u0134\1\u0135\1\uffff\5\60\1\u013b\1\60\1\uffff\3\60\1\uffff\1\60\1\uffff\1\60\1\u0142\1\uffff\7\60\1\u014a\2\60\1\uffff\4\60\1\u0151\2\60\2\uffff\5\60\1\uffff\2\60\1\u015b\1\u015c\2\60\1\uffff\1\60\1\u0160\1\60\1\u0162\1\u0163\1\u0164\1\u0165\1\uffff\6\60\1\uffff\1\60\1\u016d\1\u016e\2\60\1\u0171\3\60\2\uffff\2\60\1\u0178\1\uffff\1\60\4\uffff\7\60\2\uffff\1\u0181\1\60\1\uffff\6\60\1\uffff\1\u0189\7\60\1\uffff\2\60\1\u0193\3\60\1\u0197\1\uffff\1\u0198\2\60\1\u019b\1\u019c\1\60\1\u019e\1\u019f\1\60\1\uffff\1\60\1\u01a2\1\u01a3\2\uffff\1\u01a4\1\60\2\uffff\1\u01a6\2\uffff\1\u01a7\1\u01a8\3\uffff\1\60\3\uffff\1\u01aa\1\uffff";
    static final String DFA12_eofS =
        "\u01ab\uffff";
    static final String DFA12_minS =
        "\1\0\1\156\1\143\1\145\3\uffff\1\52\1\141\2\uffff\1\151\1\uffff\1\151\1\141\1\157\2\141\2\uffff\1\145\1\uffff\1\156\1\151\1\155\1\145\1\142\1\143\1\145\1\uffff\1\145\2\141\1\142\1\141\1\151\1\uffff\1\142\1\141\1\145\1\101\2\uffff\2\0\2\uffff\1\151\1\uffff\1\162\1\157\1\145\1\150\1\144\1\146\6\uffff\1\155\2\uffff\1\154\1\uffff\1\145\1\157\1\156\1\154\1\167\1\156\1\163\1\142\2\uffff\1\146\1\uffff\2\141\1\155\1\157\1\141\1\144\1\163\1\157\1\146\1\141\1\uffff\1\146\1\143\1\142\1\151\1\164\1\163\1\170\1\156\1\163\1\155\1\uffff\1\157\1\143\1\151\3\uffff\1\60\1\164\1\151\1\162\1\145\1\141\1\171\1\146\3\145\1\154\1\145\1\144\1\145\1\165\1\60\1\144\1\164\1\145\1\141\1\153\1\162\1\145\1\154\1\165\1\160\2\164\1\156\1\157\1\144\1\160\2\141\1\145\1\156\1\150\1\164\2\163\1\151\1\145\1\165\1\153\1\147\1\uffff\1\60\1\156\1\145\1\144\1\166\1\111\1\145\1\60\1\160\1\111\1\144\2\60\1\154\1\155\1\uffff\1\157\1\141\1\154\1\165\1\145\1\164\1\60\1\145\1\156\1\157\1\150\1\141\1\60\1\162\2\60\1\165\1\164\1\154\1\164\1\60\1\141\2\151\1\143\1\114\1\164\1\107\1\150\1\uffff\1\147\2\60\1\151\1\143\1\162\1\uffff\1\141\1\143\1\60\1\uffff\1\143\1\151\1\141\1\uffff\1\137\1\156\1\155\1\162\1\137\1\154\2\60\1\uffff\1\60\1\164\1\156\1\60\1\143\1\163\1\uffff\1\155\1\143\2\uffff\1\154\1\145\1\137\1\60\1\uffff\1\143\2\172\1\60\1\151\1\60\1\162\1\164\1\60\2\uffff\2\157\1\123\1\164\1\157\1\uffff\1\157\1\156\1\147\1\110\1\60\1\106\1\164\1\110\1\164\1\145\1\141\3\uffff\2\60\1\uffff\1\154\1\151\1\141\1\157\1\164\1\60\1\163\1\uffff\1\154\2\145\1\uffff\1\155\1\uffff\1\157\1\60\1\uffff\1\165\1\156\1\151\1\150\2\156\1\144\1\60\1\151\1\145\1\uffff\1\157\1\107\1\151\1\145\1\60\1\156\1\147\2\uffff\1\145\1\172\1\164\1\156\1\123\1\uffff\1\151\1\145\2\60\1\151\1\165\1\uffff\1\162\1\60\1\172\4\60\1\uffff\1\144\1\151\1\157\1\141\1\144\1\151\1\uffff\1\147\2\60\1\145\1\151\1\60\1\160\1\172\1\111\2\uffff\1\164\1\156\1\60\1\uffff\1\145\4\uffff\1\164\1\147\1\144\1\155\1\164\1\147\1\164\2\uffff\1\60\1\157\1\uffff\2\145\1\143\1\141\1\145\1\144\1\uffff\1\60\2\150\1\123\1\145\3\150\1\uffff\1\156\1\145\1\60\1\157\1\147\1\144\1\60\1\uffff\1\60\1\164\1\151\2\60\1\164\2\60\1\144\1\uffff\1\156\2\60\2\uffff\1\60\1\172\2\uffff\1\60\2\uffff\2\60\3\uffff\1\145\3\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\156\1\164\1\165\3\uffff\1\57\1\141\2\uffff\1\151\1\uffff\1\157\1\141\2\157\1\141\2\uffff\1\145\1\uffff\1\164\1\151\1\155\1\151\1\142\1\156\1\145\1\uffff\1\145\2\157\1\142\1\165\1\151\1\uffff\1\142\1\141\1\145\1\172\2\uffff\2\uffff\2\uffff\1\164\1\uffff\1\162\1\157\1\145\1\150\1\144\1\146\6\uffff\1\155\2\uffff\1\162\1\uffff\1\162\1\157\1\156\1\154\1\167\1\156\1\163\1\142\2\uffff\1\146\1\uffff\2\141\1\164\1\157\1\141\1\144\1\163\1\157\1\146\1\154\1\uffff\1\146\1\143\1\142\1\151\1\164\1\163\1\170\1\156\1\163\1\155\1\uffff\1\157\1\143\1\151\3\uffff\1\172\1\164\1\151\1\162\1\145\1\141\1\171\1\146\3\145\1\154\1\145\1\144\1\145\1\165\1\172\1\144\1\164\1\145\1\141\1\153\1\162\1\145\1\154\1\165\1\160\2\164\1\156\1\157\1\144\1\160\2\141\1\145\1\156\1\150\1\164\2\163\1\151\1\145\1\165\1\153\1\147\1\uffff\1\172\1\156\1\145\1\144\1\166\1\111\1\145\1\172\1\160\1\111\1\144\2\172\1\154\1\155\1\uffff\1\157\1\141\1\154\1\165\1\145\1\164\1\172\1\145\1\156\1\157\1\150\1\141\1\172\1\162\2\172\1\165\1\164\1\154\1\164\1\172\1\141\2\151\1\143\1\114\1\164\1\107\1\150\1\uffff\1\147\2\172\1\151\1\143\1\162\1\uffff\1\141\1\143\1\172\1\uffff\1\143\1\151\1\141\1\uffff\1\137\1\156\1\155\1\162\1\137\1\154\2\172\1\uffff\1\172\1\164\1\156\1\172\1\143\1\163\1\uffff\1\155\1\143\2\uffff\1\154\1\145\1\137\1\172\1\uffff\1\143\3\172\1\151\1\172\1\162\1\164\1\172\2\uffff\2\157\1\123\1\164\1\157\1\uffff\1\157\1\156\1\147\1\167\1\172\1\106\1\164\1\167\1\164\1\145\1\141\3\uffff\2\172\1\uffff\1\154\1\151\1\141\1\157\1\164\1\172\1\163\1\uffff\1\154\2\145\1\uffff\1\155\1\uffff\1\157\1\172\1\uffff\1\165\1\156\1\151\1\150\2\156\1\144\1\172\1\151\1\145\1\uffff\1\157\1\107\1\151\1\145\1\172\1\156\1\147\2\uffff\1\145\1\172\1\164\1\156\1\123\1\uffff\1\151\1\145\2\172\1\151\1\165\1\uffff\1\162\6\172\1\uffff\1\144\1\151\1\157\1\141\1\144\1\151\1\uffff\1\147\2\172\1\145\1\151\1\172\1\160\1\172\1\124\2\uffff\1\164\1\156\1\172\1\uffff\1\145\4\uffff\1\164\1\147\1\144\1\155\1\164\1\147\1\164\2\uffff\1\172\1\157\1\uffff\2\145\1\143\1\141\1\145\1\144\1\uffff\1\172\2\150\1\123\1\145\3\150\1\uffff\1\156\1\145\1\172\1\157\1\147\1\144\1\172\1\uffff\1\172\1\164\1\151\2\172\1\164\2\172\1\144\1\uffff\1\156\2\172\2\uffff\2\172\2\uffff\1\172\2\uffff\2\172\3\uffff\1\145\3\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\4\1\5\1\6\2\uffff\1\11\1\12\1\uffff\1\14\5\uffff\1\25\1\26\1\uffff\1\30\7\uffff\1\46\6\uffff\1\66\4\uffff\1\105\1\106\2\uffff\1\112\1\113\1\uffff\1\105\6\uffff\1\4\1\5\1\6\1\110\1\111\1\7\1\uffff\1\11\1\12\1\uffff\1\14\10\uffff\1\25\1\26\1\uffff\1\30\12\uffff\1\46\12\uffff\1\66\3\uffff\1\106\1\107\1\112\56\uffff\1\1\17\uffff\1\21\35\uffff\1\24\6\uffff\1\10\3\uffff\1\41\3\uffff\1\37\10\uffff\1\33\6\uffff\1\77\2\uffff\1\45\1\75\4\uffff\1\104\11\uffff\1\32\1\42\5\uffff\1\15\13\uffff\1\36\1\70\1\72\2\uffff\1\101\7\uffff\1\60\3\uffff\1\102\1\uffff\1\71\2\uffff\1\2\12\uffff\1\20\7\uffff\1\34\1\35\5\uffff\1\53\6\uffff\1\100\7\uffff\1\57\6\uffff\1\27\11\uffff\1\63\1\64\3\uffff\1\50\1\uffff\1\13\1\43\1\54\1\55\7\uffff\1\52\1\40\2\uffff\1\47\6\uffff\1\3\10\uffff\1\44\7\uffff\1\103\11\uffff\1\74\3\uffff\1\76\1\16\2\uffff\1\67\1\22\1\uffff\1\31\1\73\2\uffff\1\62\1\65\1\17\1\uffff\1\23\1\51\1\61\1\uffff\1\56";
    static final String DFA12_specialS =
        "\1\0\52\uffff\1\1\1\2\u017e\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\56\2\55\2\56\1\55\22\56\1\55\1\56\1\53\4\56\1\54\1\22\1\23\1\6\1\4\1\35\1\5\1\44\1\7\12\52\1\25\2\56\1\14\3\56\1\30\1\3\1\51\1\24\1\51\1\13\1\51\1\47\1\33\2\51\1\37\1\42\1\51\1\41\1\16\2\51\1\2\1\27\2\51\1\31\3\51\3\56\1\50\1\51\1\56\1\45\1\46\1\17\1\36\1\51\1\15\1\10\1\34\1\1\2\51\1\21\2\51\1\32\1\40\1\51\1\20\1\26\1\43\6\51\1\11\1\56\1\12\uff82\56",
            "\1\57",
            "\1\62\14\uffff\1\63\3\uffff\1\61",
            "\1\64\11\uffff\1\65\5\uffff\1\66",
            "",
            "",
            "",
            "\1\72\4\uffff\1\73",
            "\1\75",
            "",
            "",
            "\1\100",
            "",
            "\1\102\5\uffff\1\103",
            "\1\104",
            "\1\105",
            "\1\107\3\uffff\1\110\11\uffff\1\106",
            "\1\111",
            "",
            "",
            "\1\114",
            "",
            "\1\116\5\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122\3\uffff\1\123",
            "\1\124",
            "\1\125\12\uffff\1\126",
            "\1\127",
            "",
            "\1\131",
            "\1\133\15\uffff\1\132",
            "\1\135\15\uffff\1\134",
            "\1\136",
            "\1\137\7\uffff\1\140\13\uffff\1\141",
            "\1\142",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\0\150",
            "\0\150",
            "",
            "",
            "\1\153\12\uffff\1\152",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\162",
            "",
            "",
            "\1\163\5\uffff\1\164",
            "",
            "\1\165\14\uffff\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081\6\uffff\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089\12\uffff\1\u008a",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
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
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\10\60\1\u00d2\1\60\1\u00d3\10\60\1\u00d4\6\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\12\60\7\uffff\32\60\4\uffff\1\u00e4\1\uffff\32\60",
            "\1\u00e6",
            "\12\60\7\uffff\10\60\1\u00e7\21\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "\1\u00f7",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\12\60\7\uffff\13\60\1\u0109\7\60\1\u010a\6\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u010e",
            "\1\u010f",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\u0113",
            "\1\u0114",
            "",
            "",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u011d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u011f",
            "\1\u0120",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012b\56\uffff\1\u012a",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u012d",
            "\1\u012e",
            "\1\u0130\56\uffff\1\u012f",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u013c",
            "",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "",
            "\1\u0140",
            "",
            "\1\u0141",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u014b",
            "\1\u014c",
            "",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0152",
            "\1\u0153",
            "",
            "",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "",
            "\1\u0159",
            "\1\u015a",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u015d",
            "\1\u015e",
            "",
            "\1\u015f",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0161",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "",
            "\1\u016c",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u016f",
            "\1\u0170",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174\12\uffff\1\u0175",
            "",
            "",
            "\1\u0176",
            "\1\u0177",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0179",
            "",
            "",
            "",
            "",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0182",
            "",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "",
            "\1\u0191",
            "\1\u0192",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0199",
            "\1\u019a",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u019d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01a0",
            "",
            "\1\u01a1",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01a5",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "\1\u01a9",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='i') ) {s = 1;}

                        else if ( (LA12_0=='S') ) {s = 2;}

                        else if ( (LA12_0=='B') ) {s = 3;}

                        else if ( (LA12_0=='+') ) {s = 4;}

                        else if ( (LA12_0=='-') ) {s = 5;}

                        else if ( (LA12_0=='*') ) {s = 6;}

                        else if ( (LA12_0=='/') ) {s = 7;}

                        else if ( (LA12_0=='g') ) {s = 8;}

                        else if ( (LA12_0=='{') ) {s = 9;}

                        else if ( (LA12_0=='}') ) {s = 10;}

                        else if ( (LA12_0=='F') ) {s = 11;}

                        else if ( (LA12_0=='=') ) {s = 12;}

                        else if ( (LA12_0=='f') ) {s = 13;}

                        else if ( (LA12_0=='P') ) {s = 14;}

                        else if ( (LA12_0=='c') ) {s = 15;}

                        else if ( (LA12_0=='r') ) {s = 16;}

                        else if ( (LA12_0=='l') ) {s = 17;}

                        else if ( (LA12_0=='(') ) {s = 18;}

                        else if ( (LA12_0==')') ) {s = 19;}

                        else if ( (LA12_0=='D') ) {s = 20;}

                        else if ( (LA12_0==':') ) {s = 21;}

                        else if ( (LA12_0=='s') ) {s = 22;}

                        else if ( (LA12_0=='T') ) {s = 23;}

                        else if ( (LA12_0=='A') ) {s = 24;}

                        else if ( (LA12_0=='W') ) {s = 25;}

                        else if ( (LA12_0=='o') ) {s = 26;}

                        else if ( (LA12_0=='I') ) {s = 27;}

                        else if ( (LA12_0=='h') ) {s = 28;}

                        else if ( (LA12_0==',') ) {s = 29;}

                        else if ( (LA12_0=='d') ) {s = 30;}

                        else if ( (LA12_0=='L') ) {s = 31;}

                        else if ( (LA12_0=='p') ) {s = 32;}

                        else if ( (LA12_0=='O') ) {s = 33;}

                        else if ( (LA12_0=='M') ) {s = 34;}

                        else if ( (LA12_0=='t') ) {s = 35;}

                        else if ( (LA12_0=='.') ) {s = 36;}

                        else if ( (LA12_0=='a') ) {s = 37;}

                        else if ( (LA12_0=='b') ) {s = 38;}

                        else if ( (LA12_0=='H') ) {s = 39;}

                        else if ( (LA12_0=='^') ) {s = 40;}

                        else if ( (LA12_0=='C'||LA12_0=='E'||LA12_0=='G'||(LA12_0>='J' && LA12_0<='K')||LA12_0=='N'||(LA12_0>='Q' && LA12_0<='R')||(LA12_0>='U' && LA12_0<='V')||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='e'||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='m' && LA12_0<='n')||LA12_0=='q'||(LA12_0>='u' && LA12_0<='z')) ) {s = 41;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 42;}

                        else if ( (LA12_0=='\"') ) {s = 43;}

                        else if ( (LA12_0=='\'') ) {s = 44;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 45;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>=';' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_43 = input.LA(1);

                        s = -1;
                        if ( ((LA12_43>='\u0000' && LA12_43<='\uFFFF')) ) {s = 104;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_44 = input.LA(1);

                        s = -1;
                        if ( ((LA12_44>='\u0000' && LA12_44<='\uFFFF')) ) {s = 104;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
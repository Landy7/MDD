package org.xtext.example.mydsl2.group16.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl2.group16.services.GreedySnakeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGreedySnakeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'String'", "'Behaviour'", "'+'", "'-'", "'*'", "'/'", "'game'", "'{'", "'}'", "'Filepath'", "'='", "'field'", "'Panel_width'", "'Panel_Height'", "'column'", "'row'", "'label_width'", "'label_Height'", "'init'", "'('", "')'", "'Default'", "':'", "'snakeLength'", "'Score'", "'Time'", "'Amount'", "'Weapon'", "'snake'", "'food'", "'obstacle'", "'fire'", "'Speed'", "'FireIcon'", "'Icon_size'", "'head'", "','", "'headIcon'", "'BodyIcon'", "'defaultSpeed'", "'snakeTag'", "'Locate'", "'foodIcon'", "'foodKind'", "'randomFoodSize'", "'foodTag'", "'point'", "'ObstacleIcon'", "'ObstacleTag'", "'Maxsize'", "'Minsize'", "'timeLimited'", "'.'", "'restartGame'", "'start'", "'about'", "'Title'", "'Information'", "'Label_size'", "'help'", "'backGround'", "'Icon'", "'Height'", "'Width'", "'Music'", "'BufferSize'", "'path'"
    };
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


        public InternalGreedySnakeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGreedySnakeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGreedySnakeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGreedySnake.g"; }


    	private GreedySnakeGrammarAccess grammarAccess;

    	public void setGrammarAccess(GreedySnakeGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGreedySnake"
    // InternalGreedySnake.g:53:1: entryRuleGreedySnake : ruleGreedySnake EOF ;
    public final void entryRuleGreedySnake() throws RecognitionException {
        try {
            // InternalGreedySnake.g:54:1: ( ruleGreedySnake EOF )
            // InternalGreedySnake.g:55:1: ruleGreedySnake EOF
            {
             before(grammarAccess.getGreedySnakeRule()); 
            pushFollow(FOLLOW_1);
            ruleGreedySnake();

            state._fsp--;

             after(grammarAccess.getGreedySnakeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGreedySnake"


    // $ANTLR start "ruleGreedySnake"
    // InternalGreedySnake.g:62:1: ruleGreedySnake : ( ( rule__GreedySnake__Group__0 ) ) ;
    public final void ruleGreedySnake() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:66:2: ( ( ( rule__GreedySnake__Group__0 ) ) )
            // InternalGreedySnake.g:67:2: ( ( rule__GreedySnake__Group__0 ) )
            {
            // InternalGreedySnake.g:67:2: ( ( rule__GreedySnake__Group__0 ) )
            // InternalGreedySnake.g:68:3: ( rule__GreedySnake__Group__0 )
            {
             before(grammarAccess.getGreedySnakeAccess().getGroup()); 
            // InternalGreedySnake.g:69:3: ( rule__GreedySnake__Group__0 )
            // InternalGreedySnake.g:69:4: rule__GreedySnake__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GreedySnake__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreedySnakeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreedySnake"


    // $ANTLR start "entryRuleGlobalMap"
    // InternalGreedySnake.g:78:1: entryRuleGlobalMap : ruleGlobalMap EOF ;
    public final void entryRuleGlobalMap() throws RecognitionException {
        try {
            // InternalGreedySnake.g:79:1: ( ruleGlobalMap EOF )
            // InternalGreedySnake.g:80:1: ruleGlobalMap EOF
            {
             before(grammarAccess.getGlobalMapRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobalMap();

            state._fsp--;

             after(grammarAccess.getGlobalMapRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobalMap"


    // $ANTLR start "ruleGlobalMap"
    // InternalGreedySnake.g:87:1: ruleGlobalMap : ( ( rule__GlobalMap__Group__0 ) ) ;
    public final void ruleGlobalMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:91:2: ( ( ( rule__GlobalMap__Group__0 ) ) )
            // InternalGreedySnake.g:92:2: ( ( rule__GlobalMap__Group__0 ) )
            {
            // InternalGreedySnake.g:92:2: ( ( rule__GlobalMap__Group__0 ) )
            // InternalGreedySnake.g:93:3: ( rule__GlobalMap__Group__0 )
            {
             before(grammarAccess.getGlobalMapAccess().getGroup()); 
            // InternalGreedySnake.g:94:3: ( rule__GlobalMap__Group__0 )
            // InternalGreedySnake.g:94:4: rule__GlobalMap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalMap__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalMapAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalMap"


    // $ANTLR start "entryRuleGlobalFieldInitialisation"
    // InternalGreedySnake.g:103:1: entryRuleGlobalFieldInitialisation : ruleGlobalFieldInitialisation EOF ;
    public final void entryRuleGlobalFieldInitialisation() throws RecognitionException {
        try {
            // InternalGreedySnake.g:104:1: ( ruleGlobalFieldInitialisation EOF )
            // InternalGreedySnake.g:105:1: ruleGlobalFieldInitialisation EOF
            {
             before(grammarAccess.getGlobalFieldInitialisationRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobalFieldInitialisation();

            state._fsp--;

             after(grammarAccess.getGlobalFieldInitialisationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobalFieldInitialisation"


    // $ANTLR start "ruleGlobalFieldInitialisation"
    // InternalGreedySnake.g:112:1: ruleGlobalFieldInitialisation : ( ( rule__GlobalFieldInitialisation__Group__0 ) ) ;
    public final void ruleGlobalFieldInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:116:2: ( ( ( rule__GlobalFieldInitialisation__Group__0 ) ) )
            // InternalGreedySnake.g:117:2: ( ( rule__GlobalFieldInitialisation__Group__0 ) )
            {
            // InternalGreedySnake.g:117:2: ( ( rule__GlobalFieldInitialisation__Group__0 ) )
            // InternalGreedySnake.g:118:3: ( rule__GlobalFieldInitialisation__Group__0 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getGroup()); 
            // InternalGreedySnake.g:119:3: ( rule__GlobalFieldInitialisation__Group__0 )
            // InternalGreedySnake.g:119:4: rule__GlobalFieldInitialisation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalFieldInitialisationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalFieldInitialisation"


    // $ANTLR start "entryRuleInitialField"
    // InternalGreedySnake.g:128:1: entryRuleInitialField : ruleInitialField EOF ;
    public final void entryRuleInitialField() throws RecognitionException {
        try {
            // InternalGreedySnake.g:129:1: ( ruleInitialField EOF )
            // InternalGreedySnake.g:130:1: ruleInitialField EOF
            {
             before(grammarAccess.getInitialFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialField();

            state._fsp--;

             after(grammarAccess.getInitialFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialField"


    // $ANTLR start "ruleInitialField"
    // InternalGreedySnake.g:137:1: ruleInitialField : ( ( rule__InitialField__Group__0 ) ) ;
    public final void ruleInitialField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:141:2: ( ( ( rule__InitialField__Group__0 ) ) )
            // InternalGreedySnake.g:142:2: ( ( rule__InitialField__Group__0 ) )
            {
            // InternalGreedySnake.g:142:2: ( ( rule__InitialField__Group__0 ) )
            // InternalGreedySnake.g:143:3: ( rule__InitialField__Group__0 )
            {
             before(grammarAccess.getInitialFieldAccess().getGroup()); 
            // InternalGreedySnake.g:144:3: ( rule__InitialField__Group__0 )
            // InternalGreedySnake.g:144:4: rule__InitialField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialField"


    // $ANTLR start "entryRuleDefault"
    // InternalGreedySnake.g:153:1: entryRuleDefault : ruleDefault EOF ;
    public final void entryRuleDefault() throws RecognitionException {
        try {
            // InternalGreedySnake.g:154:1: ( ruleDefault EOF )
            // InternalGreedySnake.g:155:1: ruleDefault EOF
            {
             before(grammarAccess.getDefaultRule()); 
            pushFollow(FOLLOW_1);
            ruleDefault();

            state._fsp--;

             after(grammarAccess.getDefaultRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // InternalGreedySnake.g:162:1: ruleDefault : ( ( rule__Default__Group__0 ) ) ;
    public final void ruleDefault() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:166:2: ( ( ( rule__Default__Group__0 ) ) )
            // InternalGreedySnake.g:167:2: ( ( rule__Default__Group__0 ) )
            {
            // InternalGreedySnake.g:167:2: ( ( rule__Default__Group__0 ) )
            // InternalGreedySnake.g:168:3: ( rule__Default__Group__0 )
            {
             before(grammarAccess.getDefaultAccess().getGroup()); 
            // InternalGreedySnake.g:169:3: ( rule__Default__Group__0 )
            // InternalGreedySnake.g:169:4: rule__Default__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Default__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRuleInitialSnakeSpecificatin"
    // InternalGreedySnake.g:178:1: entryRuleInitialSnakeSpecificatin : ruleInitialSnakeSpecificatin EOF ;
    public final void entryRuleInitialSnakeSpecificatin() throws RecognitionException {
        try {
            // InternalGreedySnake.g:179:1: ( ruleInitialSnakeSpecificatin EOF )
            // InternalGreedySnake.g:180:1: ruleInitialSnakeSpecificatin EOF
            {
             before(grammarAccess.getInitialSnakeSpecificatinRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialSnakeSpecificatin();

            state._fsp--;

             after(grammarAccess.getInitialSnakeSpecificatinRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialSnakeSpecificatin"


    // $ANTLR start "ruleInitialSnakeSpecificatin"
    // InternalGreedySnake.g:187:1: ruleInitialSnakeSpecificatin : ( ( rule__InitialSnakeSpecificatin__Group__0 ) ) ;
    public final void ruleInitialSnakeSpecificatin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:191:2: ( ( ( rule__InitialSnakeSpecificatin__Group__0 ) ) )
            // InternalGreedySnake.g:192:2: ( ( rule__InitialSnakeSpecificatin__Group__0 ) )
            {
            // InternalGreedySnake.g:192:2: ( ( rule__InitialSnakeSpecificatin__Group__0 ) )
            // InternalGreedySnake.g:193:3: ( rule__InitialSnakeSpecificatin__Group__0 )
            {
             before(grammarAccess.getInitialSnakeSpecificatinAccess().getGroup()); 
            // InternalGreedySnake.g:194:3: ( rule__InitialSnakeSpecificatin__Group__0 )
            // InternalGreedySnake.g:194:4: rule__InitialSnakeSpecificatin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialSnakeSpecificatin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialSnakeSpecificatinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialSnakeSpecificatin"


    // $ANTLR start "entryRuleInitialFoodSpecificatin"
    // InternalGreedySnake.g:203:1: entryRuleInitialFoodSpecificatin : ruleInitialFoodSpecificatin EOF ;
    public final void entryRuleInitialFoodSpecificatin() throws RecognitionException {
        try {
            // InternalGreedySnake.g:204:1: ( ruleInitialFoodSpecificatin EOF )
            // InternalGreedySnake.g:205:1: ruleInitialFoodSpecificatin EOF
            {
             before(grammarAccess.getInitialFoodSpecificatinRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialFoodSpecificatin();

            state._fsp--;

             after(grammarAccess.getInitialFoodSpecificatinRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialFoodSpecificatin"


    // $ANTLR start "ruleInitialFoodSpecificatin"
    // InternalGreedySnake.g:212:1: ruleInitialFoodSpecificatin : ( ( rule__InitialFoodSpecificatin__Group__0 ) ) ;
    public final void ruleInitialFoodSpecificatin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:216:2: ( ( ( rule__InitialFoodSpecificatin__Group__0 ) ) )
            // InternalGreedySnake.g:217:2: ( ( rule__InitialFoodSpecificatin__Group__0 ) )
            {
            // InternalGreedySnake.g:217:2: ( ( rule__InitialFoodSpecificatin__Group__0 ) )
            // InternalGreedySnake.g:218:3: ( rule__InitialFoodSpecificatin__Group__0 )
            {
             before(grammarAccess.getInitialFoodSpecificatinAccess().getGroup()); 
            // InternalGreedySnake.g:219:3: ( rule__InitialFoodSpecificatin__Group__0 )
            // InternalGreedySnake.g:219:4: rule__InitialFoodSpecificatin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialFoodSpecificatin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialFoodSpecificatinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialFoodSpecificatin"


    // $ANTLR start "entryRuleInitialObstacleSpecificatin"
    // InternalGreedySnake.g:228:1: entryRuleInitialObstacleSpecificatin : ruleInitialObstacleSpecificatin EOF ;
    public final void entryRuleInitialObstacleSpecificatin() throws RecognitionException {
        try {
            // InternalGreedySnake.g:229:1: ( ruleInitialObstacleSpecificatin EOF )
            // InternalGreedySnake.g:230:1: ruleInitialObstacleSpecificatin EOF
            {
             before(grammarAccess.getInitialObstacleSpecificatinRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialObstacleSpecificatin();

            state._fsp--;

             after(grammarAccess.getInitialObstacleSpecificatinRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialObstacleSpecificatin"


    // $ANTLR start "ruleInitialObstacleSpecificatin"
    // InternalGreedySnake.g:237:1: ruleInitialObstacleSpecificatin : ( ( rule__InitialObstacleSpecificatin__Group__0 ) ) ;
    public final void ruleInitialObstacleSpecificatin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:241:2: ( ( ( rule__InitialObstacleSpecificatin__Group__0 ) ) )
            // InternalGreedySnake.g:242:2: ( ( rule__InitialObstacleSpecificatin__Group__0 ) )
            {
            // InternalGreedySnake.g:242:2: ( ( rule__InitialObstacleSpecificatin__Group__0 ) )
            // InternalGreedySnake.g:243:3: ( rule__InitialObstacleSpecificatin__Group__0 )
            {
             before(grammarAccess.getInitialObstacleSpecificatinAccess().getGroup()); 
            // InternalGreedySnake.g:244:3: ( rule__InitialObstacleSpecificatin__Group__0 )
            // InternalGreedySnake.g:244:4: rule__InitialObstacleSpecificatin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialObstacleSpecificatin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialObstacleSpecificatinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialObstacleSpecificatin"


    // $ANTLR start "entryRuleInitialFireSpecification"
    // InternalGreedySnake.g:253:1: entryRuleInitialFireSpecification : ruleInitialFireSpecification EOF ;
    public final void entryRuleInitialFireSpecification() throws RecognitionException {
        try {
            // InternalGreedySnake.g:254:1: ( ruleInitialFireSpecification EOF )
            // InternalGreedySnake.g:255:1: ruleInitialFireSpecification EOF
            {
             before(grammarAccess.getInitialFireSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialFireSpecification();

            state._fsp--;

             after(grammarAccess.getInitialFireSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialFireSpecification"


    // $ANTLR start "ruleInitialFireSpecification"
    // InternalGreedySnake.g:262:1: ruleInitialFireSpecification : ( ( rule__InitialFireSpecification__Group__0 ) ) ;
    public final void ruleInitialFireSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:266:2: ( ( ( rule__InitialFireSpecification__Group__0 ) ) )
            // InternalGreedySnake.g:267:2: ( ( rule__InitialFireSpecification__Group__0 ) )
            {
            // InternalGreedySnake.g:267:2: ( ( rule__InitialFireSpecification__Group__0 ) )
            // InternalGreedySnake.g:268:3: ( rule__InitialFireSpecification__Group__0 )
            {
             before(grammarAccess.getInitialFireSpecificationAccess().getGroup()); 
            // InternalGreedySnake.g:269:3: ( rule__InitialFireSpecification__Group__0 )
            // InternalGreedySnake.g:269:4: rule__InitialFireSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialFireSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialFireSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialFireSpecification"


    // $ANTLR start "entryRuleInitialSpeedSpecification"
    // InternalGreedySnake.g:278:1: entryRuleInitialSpeedSpecification : ruleInitialSpeedSpecification EOF ;
    public final void entryRuleInitialSpeedSpecification() throws RecognitionException {
        try {
            // InternalGreedySnake.g:279:1: ( ruleInitialSpeedSpecification EOF )
            // InternalGreedySnake.g:280:1: ruleInitialSpeedSpecification EOF
            {
             before(grammarAccess.getInitialSpeedSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialSpeedSpecification();

            state._fsp--;

             after(grammarAccess.getInitialSpeedSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialSpeedSpecification"


    // $ANTLR start "ruleInitialSpeedSpecification"
    // InternalGreedySnake.g:287:1: ruleInitialSpeedSpecification : ( ( rule__InitialSpeedSpecification__Group__0 ) ) ;
    public final void ruleInitialSpeedSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:291:2: ( ( ( rule__InitialSpeedSpecification__Group__0 ) ) )
            // InternalGreedySnake.g:292:2: ( ( rule__InitialSpeedSpecification__Group__0 ) )
            {
            // InternalGreedySnake.g:292:2: ( ( rule__InitialSpeedSpecification__Group__0 ) )
            // InternalGreedySnake.g:293:3: ( rule__InitialSpeedSpecification__Group__0 )
            {
             before(grammarAccess.getInitialSpeedSpecificationAccess().getGroup()); 
            // InternalGreedySnake.g:294:3: ( rule__InitialSpeedSpecification__Group__0 )
            // InternalGreedySnake.g:294:4: rule__InitialSpeedSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialSpeedSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialSpeedSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialSpeedSpecification"


    // $ANTLR start "entryRuleSpeedGroup"
    // InternalGreedySnake.g:303:1: entryRuleSpeedGroup : ruleSpeedGroup EOF ;
    public final void entryRuleSpeedGroup() throws RecognitionException {
        try {
            // InternalGreedySnake.g:304:1: ( ruleSpeedGroup EOF )
            // InternalGreedySnake.g:305:1: ruleSpeedGroup EOF
            {
             before(grammarAccess.getSpeedGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleSpeedGroup();

            state._fsp--;

             after(grammarAccess.getSpeedGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpeedGroup"


    // $ANTLR start "ruleSpeedGroup"
    // InternalGreedySnake.g:312:1: ruleSpeedGroup : ( ( rule__SpeedGroup__Group__0 ) ) ;
    public final void ruleSpeedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:316:2: ( ( ( rule__SpeedGroup__Group__0 ) ) )
            // InternalGreedySnake.g:317:2: ( ( rule__SpeedGroup__Group__0 ) )
            {
            // InternalGreedySnake.g:317:2: ( ( rule__SpeedGroup__Group__0 ) )
            // InternalGreedySnake.g:318:3: ( rule__SpeedGroup__Group__0 )
            {
             before(grammarAccess.getSpeedGroupAccess().getGroup()); 
            // InternalGreedySnake.g:319:3: ( rule__SpeedGroup__Group__0 )
            // InternalGreedySnake.g:319:4: rule__SpeedGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpeedGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpeedGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpeedGroup"


    // $ANTLR start "entryRuleFireMembers"
    // InternalGreedySnake.g:328:1: entryRuleFireMembers : ruleFireMembers EOF ;
    public final void entryRuleFireMembers() throws RecognitionException {
        try {
            // InternalGreedySnake.g:329:1: ( ruleFireMembers EOF )
            // InternalGreedySnake.g:330:1: ruleFireMembers EOF
            {
             before(grammarAccess.getFireMembersRule()); 
            pushFollow(FOLLOW_1);
            ruleFireMembers();

            state._fsp--;

             after(grammarAccess.getFireMembersRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFireMembers"


    // $ANTLR start "ruleFireMembers"
    // InternalGreedySnake.g:337:1: ruleFireMembers : ( ( rule__FireMembers__FireAssignment ) ) ;
    public final void ruleFireMembers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:341:2: ( ( ( rule__FireMembers__FireAssignment ) ) )
            // InternalGreedySnake.g:342:2: ( ( rule__FireMembers__FireAssignment ) )
            {
            // InternalGreedySnake.g:342:2: ( ( rule__FireMembers__FireAssignment ) )
            // InternalGreedySnake.g:343:3: ( rule__FireMembers__FireAssignment )
            {
             before(grammarAccess.getFireMembersAccess().getFireAssignment()); 
            // InternalGreedySnake.g:344:3: ( rule__FireMembers__FireAssignment )
            // InternalGreedySnake.g:344:4: rule__FireMembers__FireAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FireMembers__FireAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFireMembersAccess().getFireAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFireMembers"


    // $ANTLR start "entryRuleSnakeMembers"
    // InternalGreedySnake.g:353:1: entryRuleSnakeMembers : ruleSnakeMembers EOF ;
    public final void entryRuleSnakeMembers() throws RecognitionException {
        try {
            // InternalGreedySnake.g:354:1: ( ruleSnakeMembers EOF )
            // InternalGreedySnake.g:355:1: ruleSnakeMembers EOF
            {
             before(grammarAccess.getSnakeMembersRule()); 
            pushFollow(FOLLOW_1);
            ruleSnakeMembers();

            state._fsp--;

             after(grammarAccess.getSnakeMembersRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSnakeMembers"


    // $ANTLR start "ruleSnakeMembers"
    // InternalGreedySnake.g:362:1: ruleSnakeMembers : ( ( rule__SnakeMembers__SnaAssignment ) ) ;
    public final void ruleSnakeMembers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:366:2: ( ( ( rule__SnakeMembers__SnaAssignment ) ) )
            // InternalGreedySnake.g:367:2: ( ( rule__SnakeMembers__SnaAssignment ) )
            {
            // InternalGreedySnake.g:367:2: ( ( rule__SnakeMembers__SnaAssignment ) )
            // InternalGreedySnake.g:368:3: ( rule__SnakeMembers__SnaAssignment )
            {
             before(grammarAccess.getSnakeMembersAccess().getSnaAssignment()); 
            // InternalGreedySnake.g:369:3: ( rule__SnakeMembers__SnaAssignment )
            // InternalGreedySnake.g:369:4: rule__SnakeMembers__SnaAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SnakeMembers__SnaAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSnakeMembersAccess().getSnaAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSnakeMembers"


    // $ANTLR start "entryRuleFoodMembers"
    // InternalGreedySnake.g:378:1: entryRuleFoodMembers : ruleFoodMembers EOF ;
    public final void entryRuleFoodMembers() throws RecognitionException {
        try {
            // InternalGreedySnake.g:379:1: ( ruleFoodMembers EOF )
            // InternalGreedySnake.g:380:1: ruleFoodMembers EOF
            {
             before(grammarAccess.getFoodMembersRule()); 
            pushFollow(FOLLOW_1);
            ruleFoodMembers();

            state._fsp--;

             after(grammarAccess.getFoodMembersRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFoodMembers"


    // $ANTLR start "ruleFoodMembers"
    // InternalGreedySnake.g:387:1: ruleFoodMembers : ( ( rule__FoodMembers__FoodAssignment ) ) ;
    public final void ruleFoodMembers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:391:2: ( ( ( rule__FoodMembers__FoodAssignment ) ) )
            // InternalGreedySnake.g:392:2: ( ( rule__FoodMembers__FoodAssignment ) )
            {
            // InternalGreedySnake.g:392:2: ( ( rule__FoodMembers__FoodAssignment ) )
            // InternalGreedySnake.g:393:3: ( rule__FoodMembers__FoodAssignment )
            {
             before(grammarAccess.getFoodMembersAccess().getFoodAssignment()); 
            // InternalGreedySnake.g:394:3: ( rule__FoodMembers__FoodAssignment )
            // InternalGreedySnake.g:394:4: rule__FoodMembers__FoodAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FoodMembers__FoodAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFoodMembersAccess().getFoodAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFoodMembers"


    // $ANTLR start "entryRuleObstacleMembers"
    // InternalGreedySnake.g:403:1: entryRuleObstacleMembers : ruleObstacleMembers EOF ;
    public final void entryRuleObstacleMembers() throws RecognitionException {
        try {
            // InternalGreedySnake.g:404:1: ( ruleObstacleMembers EOF )
            // InternalGreedySnake.g:405:1: ruleObstacleMembers EOF
            {
             before(grammarAccess.getObstacleMembersRule()); 
            pushFollow(FOLLOW_1);
            ruleObstacleMembers();

            state._fsp--;

             after(grammarAccess.getObstacleMembersRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObstacleMembers"


    // $ANTLR start "ruleObstacleMembers"
    // InternalGreedySnake.g:412:1: ruleObstacleMembers : ( ( rule__ObstacleMembers__ObstacleAssignment ) ) ;
    public final void ruleObstacleMembers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:416:2: ( ( ( rule__ObstacleMembers__ObstacleAssignment ) ) )
            // InternalGreedySnake.g:417:2: ( ( rule__ObstacleMembers__ObstacleAssignment ) )
            {
            // InternalGreedySnake.g:417:2: ( ( rule__ObstacleMembers__ObstacleAssignment ) )
            // InternalGreedySnake.g:418:3: ( rule__ObstacleMembers__ObstacleAssignment )
            {
             before(grammarAccess.getObstacleMembersAccess().getObstacleAssignment()); 
            // InternalGreedySnake.g:419:3: ( rule__ObstacleMembers__ObstacleAssignment )
            // InternalGreedySnake.g:419:4: rule__ObstacleMembers__ObstacleAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ObstacleMembers__ObstacleAssignment();

            state._fsp--;


            }

             after(grammarAccess.getObstacleMembersAccess().getObstacleAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObstacleMembers"


    // $ANTLR start "entryRuleFireInitDisplay"
    // InternalGreedySnake.g:428:1: entryRuleFireInitDisplay : ruleFireInitDisplay EOF ;
    public final void entryRuleFireInitDisplay() throws RecognitionException {
        try {
            // InternalGreedySnake.g:429:1: ( ruleFireInitDisplay EOF )
            // InternalGreedySnake.g:430:1: ruleFireInitDisplay EOF
            {
             before(grammarAccess.getFireInitDisplayRule()); 
            pushFollow(FOLLOW_1);
            ruleFireInitDisplay();

            state._fsp--;

             after(grammarAccess.getFireInitDisplayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFireInitDisplay"


    // $ANTLR start "ruleFireInitDisplay"
    // InternalGreedySnake.g:437:1: ruleFireInitDisplay : ( ( rule__FireInitDisplay__Group__0 ) ) ;
    public final void ruleFireInitDisplay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:441:2: ( ( ( rule__FireInitDisplay__Group__0 ) ) )
            // InternalGreedySnake.g:442:2: ( ( rule__FireInitDisplay__Group__0 ) )
            {
            // InternalGreedySnake.g:442:2: ( ( rule__FireInitDisplay__Group__0 ) )
            // InternalGreedySnake.g:443:3: ( rule__FireInitDisplay__Group__0 )
            {
             before(grammarAccess.getFireInitDisplayAccess().getGroup()); 
            // InternalGreedySnake.g:444:3: ( rule__FireInitDisplay__Group__0 )
            // InternalGreedySnake.g:444:4: rule__FireInitDisplay__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FireInitDisplay__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFireInitDisplayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFireInitDisplay"


    // $ANTLR start "entryRuleSnakeInitDisplay"
    // InternalGreedySnake.g:453:1: entryRuleSnakeInitDisplay : ruleSnakeInitDisplay EOF ;
    public final void entryRuleSnakeInitDisplay() throws RecognitionException {
        try {
            // InternalGreedySnake.g:454:1: ( ruleSnakeInitDisplay EOF )
            // InternalGreedySnake.g:455:1: ruleSnakeInitDisplay EOF
            {
             before(grammarAccess.getSnakeInitDisplayRule()); 
            pushFollow(FOLLOW_1);
            ruleSnakeInitDisplay();

            state._fsp--;

             after(grammarAccess.getSnakeInitDisplayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSnakeInitDisplay"


    // $ANTLR start "ruleSnakeInitDisplay"
    // InternalGreedySnake.g:462:1: ruleSnakeInitDisplay : ( ( rule__SnakeInitDisplay__Group__0 ) ) ;
    public final void ruleSnakeInitDisplay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:466:2: ( ( ( rule__SnakeInitDisplay__Group__0 ) ) )
            // InternalGreedySnake.g:467:2: ( ( rule__SnakeInitDisplay__Group__0 ) )
            {
            // InternalGreedySnake.g:467:2: ( ( rule__SnakeInitDisplay__Group__0 ) )
            // InternalGreedySnake.g:468:3: ( rule__SnakeInitDisplay__Group__0 )
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getGroup()); 
            // InternalGreedySnake.g:469:3: ( rule__SnakeInitDisplay__Group__0 )
            // InternalGreedySnake.g:469:4: rule__SnakeInitDisplay__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSnakeInitDisplayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSnakeInitDisplay"


    // $ANTLR start "entryRuleIconSize"
    // InternalGreedySnake.g:478:1: entryRuleIconSize : ruleIconSize EOF ;
    public final void entryRuleIconSize() throws RecognitionException {
        try {
            // InternalGreedySnake.g:479:1: ( ruleIconSize EOF )
            // InternalGreedySnake.g:480:1: ruleIconSize EOF
            {
             before(grammarAccess.getIconSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleIconSize();

            state._fsp--;

             after(grammarAccess.getIconSizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIconSize"


    // $ANTLR start "ruleIconSize"
    // InternalGreedySnake.g:487:1: ruleIconSize : ( RULE_INT ) ;
    public final void ruleIconSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:491:2: ( ( RULE_INT ) )
            // InternalGreedySnake.g:492:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:492:2: ( RULE_INT )
            // InternalGreedySnake.g:493:3: RULE_INT
            {
             before(grammarAccess.getIconSizeAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIconSizeAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIconSize"


    // $ANTLR start "entryRuleIconTag"
    // InternalGreedySnake.g:503:1: entryRuleIconTag : ruleIconTag EOF ;
    public final void entryRuleIconTag() throws RecognitionException {
        try {
            // InternalGreedySnake.g:504:1: ( ruleIconTag EOF )
            // InternalGreedySnake.g:505:1: ruleIconTag EOF
            {
             before(grammarAccess.getIconTagRule()); 
            pushFollow(FOLLOW_1);
            ruleIconTag();

            state._fsp--;

             after(grammarAccess.getIconTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIconTag"


    // $ANTLR start "ruleIconTag"
    // InternalGreedySnake.g:512:1: ruleIconTag : ( ( rule__IconTag__Group__0 ) ) ;
    public final void ruleIconTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:516:2: ( ( ( rule__IconTag__Group__0 ) ) )
            // InternalGreedySnake.g:517:2: ( ( rule__IconTag__Group__0 ) )
            {
            // InternalGreedySnake.g:517:2: ( ( rule__IconTag__Group__0 ) )
            // InternalGreedySnake.g:518:3: ( rule__IconTag__Group__0 )
            {
             before(grammarAccess.getIconTagAccess().getGroup()); 
            // InternalGreedySnake.g:519:3: ( rule__IconTag__Group__0 )
            // InternalGreedySnake.g:519:4: rule__IconTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IconTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIconTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIconTag"


    // $ANTLR start "entryRuleFoodInitDisplay"
    // InternalGreedySnake.g:528:1: entryRuleFoodInitDisplay : ruleFoodInitDisplay EOF ;
    public final void entryRuleFoodInitDisplay() throws RecognitionException {
        try {
            // InternalGreedySnake.g:529:1: ( ruleFoodInitDisplay EOF )
            // InternalGreedySnake.g:530:1: ruleFoodInitDisplay EOF
            {
             before(grammarAccess.getFoodInitDisplayRule()); 
            pushFollow(FOLLOW_1);
            ruleFoodInitDisplay();

            state._fsp--;

             after(grammarAccess.getFoodInitDisplayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFoodInitDisplay"


    // $ANTLR start "ruleFoodInitDisplay"
    // InternalGreedySnake.g:537:1: ruleFoodInitDisplay : ( ( rule__FoodInitDisplay__Group__0 ) ) ;
    public final void ruleFoodInitDisplay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:541:2: ( ( ( rule__FoodInitDisplay__Group__0 ) ) )
            // InternalGreedySnake.g:542:2: ( ( rule__FoodInitDisplay__Group__0 ) )
            {
            // InternalGreedySnake.g:542:2: ( ( rule__FoodInitDisplay__Group__0 ) )
            // InternalGreedySnake.g:543:3: ( rule__FoodInitDisplay__Group__0 )
            {
             before(grammarAccess.getFoodInitDisplayAccess().getGroup()); 
            // InternalGreedySnake.g:544:3: ( rule__FoodInitDisplay__Group__0 )
            // InternalGreedySnake.g:544:4: rule__FoodInitDisplay__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFoodInitDisplayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFoodInitDisplay"


    // $ANTLR start "entryRuleFoodKind"
    // InternalGreedySnake.g:553:1: entryRuleFoodKind : ruleFoodKind EOF ;
    public final void entryRuleFoodKind() throws RecognitionException {
        try {
            // InternalGreedySnake.g:554:1: ( ruleFoodKind EOF )
            // InternalGreedySnake.g:555:1: ruleFoodKind EOF
            {
             before(grammarAccess.getFoodKindRule()); 
            pushFollow(FOLLOW_1);
            ruleFoodKind();

            state._fsp--;

             after(grammarAccess.getFoodKindRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFoodKind"


    // $ANTLR start "ruleFoodKind"
    // InternalGreedySnake.g:562:1: ruleFoodKind : ( ( rule__FoodKind__Group__0 ) ) ;
    public final void ruleFoodKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:566:2: ( ( ( rule__FoodKind__Group__0 ) ) )
            // InternalGreedySnake.g:567:2: ( ( rule__FoodKind__Group__0 ) )
            {
            // InternalGreedySnake.g:567:2: ( ( rule__FoodKind__Group__0 ) )
            // InternalGreedySnake.g:568:3: ( rule__FoodKind__Group__0 )
            {
             before(grammarAccess.getFoodKindAccess().getGroup()); 
            // InternalGreedySnake.g:569:3: ( rule__FoodKind__Group__0 )
            // InternalGreedySnake.g:569:4: rule__FoodKind__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FoodKind__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFoodKindAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFoodKind"


    // $ANTLR start "entryRuleObstacleInitDisplay"
    // InternalGreedySnake.g:578:1: entryRuleObstacleInitDisplay : ruleObstacleInitDisplay EOF ;
    public final void entryRuleObstacleInitDisplay() throws RecognitionException {
        try {
            // InternalGreedySnake.g:579:1: ( ruleObstacleInitDisplay EOF )
            // InternalGreedySnake.g:580:1: ruleObstacleInitDisplay EOF
            {
             before(grammarAccess.getObstacleInitDisplayRule()); 
            pushFollow(FOLLOW_1);
            ruleObstacleInitDisplay();

            state._fsp--;

             after(grammarAccess.getObstacleInitDisplayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObstacleInitDisplay"


    // $ANTLR start "ruleObstacleInitDisplay"
    // InternalGreedySnake.g:587:1: ruleObstacleInitDisplay : ( ( rule__ObstacleInitDisplay__Group__0 ) ) ;
    public final void ruleObstacleInitDisplay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:591:2: ( ( ( rule__ObstacleInitDisplay__Group__0 ) ) )
            // InternalGreedySnake.g:592:2: ( ( rule__ObstacleInitDisplay__Group__0 ) )
            {
            // InternalGreedySnake.g:592:2: ( ( rule__ObstacleInitDisplay__Group__0 ) )
            // InternalGreedySnake.g:593:3: ( rule__ObstacleInitDisplay__Group__0 )
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getGroup()); 
            // InternalGreedySnake.g:594:3: ( rule__ObstacleInitDisplay__Group__0 )
            // InternalGreedySnake.g:594:4: rule__ObstacleInitDisplay__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObstacleInitDisplay__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObstacleInitDisplayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObstacleInitDisplay"


    // $ANTLR start "entryRuleRandomFoodSize"
    // InternalGreedySnake.g:603:1: entryRuleRandomFoodSize : ruleRandomFoodSize EOF ;
    public final void entryRuleRandomFoodSize() throws RecognitionException {
        try {
            // InternalGreedySnake.g:604:1: ( ruleRandomFoodSize EOF )
            // InternalGreedySnake.g:605:1: ruleRandomFoodSize EOF
            {
             before(grammarAccess.getRandomFoodSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleRandomFoodSize();

            state._fsp--;

             after(grammarAccess.getRandomFoodSizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRandomFoodSize"


    // $ANTLR start "ruleRandomFoodSize"
    // InternalGreedySnake.g:612:1: ruleRandomFoodSize : ( ( rule__RandomFoodSize__Group__0 ) ) ;
    public final void ruleRandomFoodSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:616:2: ( ( ( rule__RandomFoodSize__Group__0 ) ) )
            // InternalGreedySnake.g:617:2: ( ( rule__RandomFoodSize__Group__0 ) )
            {
            // InternalGreedySnake.g:617:2: ( ( rule__RandomFoodSize__Group__0 ) )
            // InternalGreedySnake.g:618:3: ( rule__RandomFoodSize__Group__0 )
            {
             before(grammarAccess.getRandomFoodSizeAccess().getGroup()); 
            // InternalGreedySnake.g:619:3: ( rule__RandomFoodSize__Group__0 )
            // InternalGreedySnake.g:619:4: rule__RandomFoodSize__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RandomFoodSize__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRandomFoodSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRandomFoodSize"


    // $ANTLR start "entryRuleTimeLimited"
    // InternalGreedySnake.g:628:1: entryRuleTimeLimited : ruleTimeLimited EOF ;
    public final void entryRuleTimeLimited() throws RecognitionException {
        try {
            // InternalGreedySnake.g:629:1: ( ruleTimeLimited EOF )
            // InternalGreedySnake.g:630:1: ruleTimeLimited EOF
            {
             before(grammarAccess.getTimeLimitedRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeLimited();

            state._fsp--;

             after(grammarAccess.getTimeLimitedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeLimited"


    // $ANTLR start "ruleTimeLimited"
    // InternalGreedySnake.g:637:1: ruleTimeLimited : ( ( rule__TimeLimited__Alternatives ) ) ;
    public final void ruleTimeLimited() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:641:2: ( ( ( rule__TimeLimited__Alternatives ) ) )
            // InternalGreedySnake.g:642:2: ( ( rule__TimeLimited__Alternatives ) )
            {
            // InternalGreedySnake.g:642:2: ( ( rule__TimeLimited__Alternatives ) )
            // InternalGreedySnake.g:643:3: ( rule__TimeLimited__Alternatives )
            {
             before(grammarAccess.getTimeLimitedAccess().getAlternatives()); 
            // InternalGreedySnake.g:644:3: ( rule__TimeLimited__Alternatives )
            // InternalGreedySnake.g:644:4: rule__TimeLimited__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeLimited__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeLimitedAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeLimited"


    // $ANTLR start "entryRuleObstacleTime"
    // InternalGreedySnake.g:653:1: entryRuleObstacleTime : ruleObstacleTime EOF ;
    public final void entryRuleObstacleTime() throws RecognitionException {
        try {
            // InternalGreedySnake.g:654:1: ( ruleObstacleTime EOF )
            // InternalGreedySnake.g:655:1: ruleObstacleTime EOF
            {
             before(grammarAccess.getObstacleTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleObstacleTime();

            state._fsp--;

             after(grammarAccess.getObstacleTimeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObstacleTime"


    // $ANTLR start "ruleObstacleTime"
    // InternalGreedySnake.g:662:1: ruleObstacleTime : ( ( rule__ObstacleTime__Group__0 ) ) ;
    public final void ruleObstacleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:666:2: ( ( ( rule__ObstacleTime__Group__0 ) ) )
            // InternalGreedySnake.g:667:2: ( ( rule__ObstacleTime__Group__0 ) )
            {
            // InternalGreedySnake.g:667:2: ( ( rule__ObstacleTime__Group__0 ) )
            // InternalGreedySnake.g:668:3: ( rule__ObstacleTime__Group__0 )
            {
             before(grammarAccess.getObstacleTimeAccess().getGroup()); 
            // InternalGreedySnake.g:669:3: ( rule__ObstacleTime__Group__0 )
            // InternalGreedySnake.g:669:4: rule__ObstacleTime__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObstacleTime__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObstacleTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObstacleTime"


    // $ANTLR start "entryRuleFoodTime"
    // InternalGreedySnake.g:678:1: entryRuleFoodTime : ruleFoodTime EOF ;
    public final void entryRuleFoodTime() throws RecognitionException {
        try {
            // InternalGreedySnake.g:679:1: ( ruleFoodTime EOF )
            // InternalGreedySnake.g:680:1: ruleFoodTime EOF
            {
             before(grammarAccess.getFoodTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleFoodTime();

            state._fsp--;

             after(grammarAccess.getFoodTimeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFoodTime"


    // $ANTLR start "ruleFoodTime"
    // InternalGreedySnake.g:687:1: ruleFoodTime : ( ( rule__FoodTime__Group__0 ) ) ;
    public final void ruleFoodTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:691:2: ( ( ( rule__FoodTime__Group__0 ) ) )
            // InternalGreedySnake.g:692:2: ( ( rule__FoodTime__Group__0 ) )
            {
            // InternalGreedySnake.g:692:2: ( ( rule__FoodTime__Group__0 ) )
            // InternalGreedySnake.g:693:3: ( rule__FoodTime__Group__0 )
            {
             before(grammarAccess.getFoodTimeAccess().getGroup()); 
            // InternalGreedySnake.g:694:3: ( rule__FoodTime__Group__0 )
            // InternalGreedySnake.g:694:4: rule__FoodTime__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FoodTime__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFoodTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFoodTime"


    // $ANTLR start "entryRuleAllItemVarSpec"
    // InternalGreedySnake.g:703:1: entryRuleAllItemVarSpec : ruleAllItemVarSpec EOF ;
    public final void entryRuleAllItemVarSpec() throws RecognitionException {
        try {
            // InternalGreedySnake.g:704:1: ( ruleAllItemVarSpec EOF )
            // InternalGreedySnake.g:705:1: ruleAllItemVarSpec EOF
            {
             before(grammarAccess.getAllItemVarSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleAllItemVarSpec();

            state._fsp--;

             after(grammarAccess.getAllItemVarSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllItemVarSpec"


    // $ANTLR start "ruleAllItemVarSpec"
    // InternalGreedySnake.g:712:1: ruleAllItemVarSpec : ( ( rule__AllItemVarSpec__Group__0 ) ) ;
    public final void ruleAllItemVarSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:716:2: ( ( ( rule__AllItemVarSpec__Group__0 ) ) )
            // InternalGreedySnake.g:717:2: ( ( rule__AllItemVarSpec__Group__0 ) )
            {
            // InternalGreedySnake.g:717:2: ( ( rule__AllItemVarSpec__Group__0 ) )
            // InternalGreedySnake.g:718:3: ( rule__AllItemVarSpec__Group__0 )
            {
             before(grammarAccess.getAllItemVarSpecAccess().getGroup()); 
            // InternalGreedySnake.g:719:3: ( rule__AllItemVarSpec__Group__0 )
            // InternalGreedySnake.g:719:4: rule__AllItemVarSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllItemVarSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllItemVarSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllItemVarSpec"


    // $ANTLR start "entryRuleParamSpec"
    // InternalGreedySnake.g:728:1: entryRuleParamSpec : ruleParamSpec EOF ;
    public final void entryRuleParamSpec() throws RecognitionException {
        try {
            // InternalGreedySnake.g:729:1: ( ruleParamSpec EOF )
            // InternalGreedySnake.g:730:1: ruleParamSpec EOF
            {
             before(grammarAccess.getParamSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleParamSpec();

            state._fsp--;

             after(grammarAccess.getParamSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParamSpec"


    // $ANTLR start "ruleParamSpec"
    // InternalGreedySnake.g:737:1: ruleParamSpec : ( ( rule__ParamSpec__Group__0 ) ) ;
    public final void ruleParamSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:741:2: ( ( ( rule__ParamSpec__Group__0 ) ) )
            // InternalGreedySnake.g:742:2: ( ( rule__ParamSpec__Group__0 ) )
            {
            // InternalGreedySnake.g:742:2: ( ( rule__ParamSpec__Group__0 ) )
            // InternalGreedySnake.g:743:3: ( rule__ParamSpec__Group__0 )
            {
             before(grammarAccess.getParamSpecAccess().getGroup()); 
            // InternalGreedySnake.g:744:3: ( rule__ParamSpec__Group__0 )
            // InternalGreedySnake.g:744:4: rule__ParamSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParamSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamSpec"


    // $ANTLR start "entryRuleAddition"
    // InternalGreedySnake.g:753:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalGreedySnake.g:754:1: ( ruleAddition EOF )
            // InternalGreedySnake.g:755:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalGreedySnake.g:762:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:766:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalGreedySnake.g:767:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalGreedySnake.g:767:2: ( ( rule__Addition__Group__0 ) )
            // InternalGreedySnake.g:768:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalGreedySnake.g:769:3: ( rule__Addition__Group__0 )
            // InternalGreedySnake.g:769:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalGreedySnake.g:778:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalGreedySnake.g:779:1: ( ruleMultiplication EOF )
            // InternalGreedySnake.g:780:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalGreedySnake.g:787:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:791:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalGreedySnake.g:792:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalGreedySnake.g:792:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalGreedySnake.g:793:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalGreedySnake.g:794:3: ( rule__Multiplication__Group__0 )
            // InternalGreedySnake.g:794:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalGreedySnake.g:803:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalGreedySnake.g:804:1: ( rulePrimary EOF )
            // InternalGreedySnake.g:805:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalGreedySnake.g:812:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:816:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalGreedySnake.g:817:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalGreedySnake.g:817:2: ( ( rule__Primary__Alternatives ) )
            // InternalGreedySnake.g:818:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalGreedySnake.g:819:3: ( rule__Primary__Alternatives )
            // InternalGreedySnake.g:819:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalGreedySnake.g:828:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalGreedySnake.g:829:1: ( ruleIntLiteral EOF )
            // InternalGreedySnake.g:830:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getIntLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalGreedySnake.g:837:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:841:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalGreedySnake.g:842:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalGreedySnake.g:842:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalGreedySnake.g:843:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalGreedySnake.g:844:3: ( rule__IntLiteral__ValAssignment )
            // InternalGreedySnake.g:844:4: rule__IntLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalGreedySnake.g:853:1: entryRuleRealLiteral : ruleRealLiteral EOF ;
    public final void entryRuleRealLiteral() throws RecognitionException {
        try {
            // InternalGreedySnake.g:854:1: ( ruleRealLiteral EOF )
            // InternalGreedySnake.g:855:1: ruleRealLiteral EOF
            {
             before(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleRealLiteral();

            state._fsp--;

             after(grammarAccess.getRealLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalGreedySnake.g:862:1: ruleRealLiteral : ( ( rule__RealLiteral__ValAssignment ) ) ;
    public final void ruleRealLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:866:2: ( ( ( rule__RealLiteral__ValAssignment ) ) )
            // InternalGreedySnake.g:867:2: ( ( rule__RealLiteral__ValAssignment ) )
            {
            // InternalGreedySnake.g:867:2: ( ( rule__RealLiteral__ValAssignment ) )
            // InternalGreedySnake.g:868:3: ( rule__RealLiteral__ValAssignment )
            {
             before(grammarAccess.getRealLiteralAccess().getValAssignment()); 
            // InternalGreedySnake.g:869:3: ( rule__RealLiteral__ValAssignment )
            // InternalGreedySnake.g:869:4: rule__RealLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RealLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRealLiteralAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleREAL"
    // InternalGreedySnake.g:878:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalGreedySnake.g:882:1: ( ruleREAL EOF )
            // InternalGreedySnake.g:883:1: ruleREAL EOF
            {
             before(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getREALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalGreedySnake.g:893:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:898:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalGreedySnake.g:899:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalGreedySnake.g:899:2: ( ( rule__REAL__Group__0 ) )
            // InternalGreedySnake.g:900:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalGreedySnake.g:901:3: ( rule__REAL__Group__0 )
            // InternalGreedySnake.g:901:4: rule__REAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleOptionSpecification"
    // InternalGreedySnake.g:911:1: entryRuleOptionSpecification : ruleOptionSpecification EOF ;
    public final void entryRuleOptionSpecification() throws RecognitionException {
        try {
            // InternalGreedySnake.g:912:1: ( ruleOptionSpecification EOF )
            // InternalGreedySnake.g:913:1: ruleOptionSpecification EOF
            {
             before(grammarAccess.getOptionSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleOptionSpecification();

            state._fsp--;

             after(grammarAccess.getOptionSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptionSpecification"


    // $ANTLR start "ruleOptionSpecification"
    // InternalGreedySnake.g:920:1: ruleOptionSpecification : ( ( rule__OptionSpecification__Alternatives ) ) ;
    public final void ruleOptionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:924:2: ( ( ( rule__OptionSpecification__Alternatives ) ) )
            // InternalGreedySnake.g:925:2: ( ( rule__OptionSpecification__Alternatives ) )
            {
            // InternalGreedySnake.g:925:2: ( ( rule__OptionSpecification__Alternatives ) )
            // InternalGreedySnake.g:926:3: ( rule__OptionSpecification__Alternatives )
            {
             before(grammarAccess.getOptionSpecificationAccess().getAlternatives()); 
            // InternalGreedySnake.g:927:3: ( rule__OptionSpecification__Alternatives )
            // InternalGreedySnake.g:927:4: rule__OptionSpecification__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OptionSpecification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionSpecificationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionSpecification"


    // $ANTLR start "entryRuleRestartMenu"
    // InternalGreedySnake.g:936:1: entryRuleRestartMenu : ruleRestartMenu EOF ;
    public final void entryRuleRestartMenu() throws RecognitionException {
        try {
            // InternalGreedySnake.g:937:1: ( ruleRestartMenu EOF )
            // InternalGreedySnake.g:938:1: ruleRestartMenu EOF
            {
             before(grammarAccess.getRestartMenuRule()); 
            pushFollow(FOLLOW_1);
            ruleRestartMenu();

            state._fsp--;

             after(grammarAccess.getRestartMenuRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRestartMenu"


    // $ANTLR start "ruleRestartMenu"
    // InternalGreedySnake.g:945:1: ruleRestartMenu : ( ( rule__RestartMenu__Group__0 ) ) ;
    public final void ruleRestartMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:949:2: ( ( ( rule__RestartMenu__Group__0 ) ) )
            // InternalGreedySnake.g:950:2: ( ( rule__RestartMenu__Group__0 ) )
            {
            // InternalGreedySnake.g:950:2: ( ( rule__RestartMenu__Group__0 ) )
            // InternalGreedySnake.g:951:3: ( rule__RestartMenu__Group__0 )
            {
             before(grammarAccess.getRestartMenuAccess().getGroup()); 
            // InternalGreedySnake.g:952:3: ( rule__RestartMenu__Group__0 )
            // InternalGreedySnake.g:952:4: rule__RestartMenu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RestartMenu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestartMenuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestartMenu"


    // $ANTLR start "entryRuleStartFieldDeclaration"
    // InternalGreedySnake.g:961:1: entryRuleStartFieldDeclaration : ruleStartFieldDeclaration EOF ;
    public final void entryRuleStartFieldDeclaration() throws RecognitionException {
        try {
            // InternalGreedySnake.g:962:1: ( ruleStartFieldDeclaration EOF )
            // InternalGreedySnake.g:963:1: ruleStartFieldDeclaration EOF
            {
             before(grammarAccess.getStartFieldDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleStartFieldDeclaration();

            state._fsp--;

             after(grammarAccess.getStartFieldDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStartFieldDeclaration"


    // $ANTLR start "ruleStartFieldDeclaration"
    // InternalGreedySnake.g:970:1: ruleStartFieldDeclaration : ( ( rule__StartFieldDeclaration__Group__0 ) ) ;
    public final void ruleStartFieldDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:974:2: ( ( ( rule__StartFieldDeclaration__Group__0 ) ) )
            // InternalGreedySnake.g:975:2: ( ( rule__StartFieldDeclaration__Group__0 ) )
            {
            // InternalGreedySnake.g:975:2: ( ( rule__StartFieldDeclaration__Group__0 ) )
            // InternalGreedySnake.g:976:3: ( rule__StartFieldDeclaration__Group__0 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getGroup()); 
            // InternalGreedySnake.g:977:3: ( rule__StartFieldDeclaration__Group__0 )
            // InternalGreedySnake.g:977:4: rule__StartFieldDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StartFieldDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartFieldDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartFieldDeclaration"


    // $ANTLR start "entryRuleAboutSpecification"
    // InternalGreedySnake.g:986:1: entryRuleAboutSpecification : ruleAboutSpecification EOF ;
    public final void entryRuleAboutSpecification() throws RecognitionException {
        try {
            // InternalGreedySnake.g:987:1: ( ruleAboutSpecification EOF )
            // InternalGreedySnake.g:988:1: ruleAboutSpecification EOF
            {
             before(grammarAccess.getAboutSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleAboutSpecification();

            state._fsp--;

             after(grammarAccess.getAboutSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAboutSpecification"


    // $ANTLR start "ruleAboutSpecification"
    // InternalGreedySnake.g:995:1: ruleAboutSpecification : ( ( rule__AboutSpecification__Group__0 ) ) ;
    public final void ruleAboutSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:999:2: ( ( ( rule__AboutSpecification__Group__0 ) ) )
            // InternalGreedySnake.g:1000:2: ( ( rule__AboutSpecification__Group__0 ) )
            {
            // InternalGreedySnake.g:1000:2: ( ( rule__AboutSpecification__Group__0 ) )
            // InternalGreedySnake.g:1001:3: ( rule__AboutSpecification__Group__0 )
            {
             before(grammarAccess.getAboutSpecificationAccess().getGroup()); 
            // InternalGreedySnake.g:1002:3: ( rule__AboutSpecification__Group__0 )
            // InternalGreedySnake.g:1002:4: rule__AboutSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AboutSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAboutSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAboutSpecification"


    // $ANTLR start "entryRuleHelpSpecification"
    // InternalGreedySnake.g:1011:1: entryRuleHelpSpecification : ruleHelpSpecification EOF ;
    public final void entryRuleHelpSpecification() throws RecognitionException {
        try {
            // InternalGreedySnake.g:1012:1: ( ruleHelpSpecification EOF )
            // InternalGreedySnake.g:1013:1: ruleHelpSpecification EOF
            {
             before(grammarAccess.getHelpSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleHelpSpecification();

            state._fsp--;

             after(grammarAccess.getHelpSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHelpSpecification"


    // $ANTLR start "ruleHelpSpecification"
    // InternalGreedySnake.g:1020:1: ruleHelpSpecification : ( ( rule__HelpSpecification__Group__0 ) ) ;
    public final void ruleHelpSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1024:2: ( ( ( rule__HelpSpecification__Group__0 ) ) )
            // InternalGreedySnake.g:1025:2: ( ( rule__HelpSpecification__Group__0 ) )
            {
            // InternalGreedySnake.g:1025:2: ( ( rule__HelpSpecification__Group__0 ) )
            // InternalGreedySnake.g:1026:3: ( rule__HelpSpecification__Group__0 )
            {
             before(grammarAccess.getHelpSpecificationAccess().getGroup()); 
            // InternalGreedySnake.g:1027:3: ( rule__HelpSpecification__Group__0 )
            // InternalGreedySnake.g:1027:4: rule__HelpSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HelpSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHelpSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHelpSpecification"


    // $ANTLR start "entryRuleBackSpecification"
    // InternalGreedySnake.g:1036:1: entryRuleBackSpecification : ruleBackSpecification EOF ;
    public final void entryRuleBackSpecification() throws RecognitionException {
        try {
            // InternalGreedySnake.g:1037:1: ( ruleBackSpecification EOF )
            // InternalGreedySnake.g:1038:1: ruleBackSpecification EOF
            {
             before(grammarAccess.getBackSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleBackSpecification();

            state._fsp--;

             after(grammarAccess.getBackSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBackSpecification"


    // $ANTLR start "ruleBackSpecification"
    // InternalGreedySnake.g:1045:1: ruleBackSpecification : ( ( rule__BackSpecification__Group__0 ) ) ;
    public final void ruleBackSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1049:2: ( ( ( rule__BackSpecification__Group__0 ) ) )
            // InternalGreedySnake.g:1050:2: ( ( rule__BackSpecification__Group__0 ) )
            {
            // InternalGreedySnake.g:1050:2: ( ( rule__BackSpecification__Group__0 ) )
            // InternalGreedySnake.g:1051:3: ( rule__BackSpecification__Group__0 )
            {
             before(grammarAccess.getBackSpecificationAccess().getGroup()); 
            // InternalGreedySnake.g:1052:3: ( rule__BackSpecification__Group__0 )
            // InternalGreedySnake.g:1052:4: rule__BackSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BackSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackSpecification"


    // $ANTLR start "entryRuleBackgroundIcon"
    // InternalGreedySnake.g:1061:1: entryRuleBackgroundIcon : ruleBackgroundIcon EOF ;
    public final void entryRuleBackgroundIcon() throws RecognitionException {
        try {
            // InternalGreedySnake.g:1062:1: ( ruleBackgroundIcon EOF )
            // InternalGreedySnake.g:1063:1: ruleBackgroundIcon EOF
            {
             before(grammarAccess.getBackgroundIconRule()); 
            pushFollow(FOLLOW_1);
            ruleBackgroundIcon();

            state._fsp--;

             after(grammarAccess.getBackgroundIconRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBackgroundIcon"


    // $ANTLR start "ruleBackgroundIcon"
    // InternalGreedySnake.g:1070:1: ruleBackgroundIcon : ( ( rule__BackgroundIcon__Group__0 ) ) ;
    public final void ruleBackgroundIcon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1074:2: ( ( ( rule__BackgroundIcon__Group__0 ) ) )
            // InternalGreedySnake.g:1075:2: ( ( rule__BackgroundIcon__Group__0 ) )
            {
            // InternalGreedySnake.g:1075:2: ( ( rule__BackgroundIcon__Group__0 ) )
            // InternalGreedySnake.g:1076:3: ( rule__BackgroundIcon__Group__0 )
            {
             before(grammarAccess.getBackgroundIconAccess().getGroup()); 
            // InternalGreedySnake.g:1077:3: ( rule__BackgroundIcon__Group__0 )
            // InternalGreedySnake.g:1077:4: rule__BackgroundIcon__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BackgroundIcon__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundIconAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackgroundIcon"


    // $ANTLR start "entryRuleBackGroundSize"
    // InternalGreedySnake.g:1086:1: entryRuleBackGroundSize : ruleBackGroundSize EOF ;
    public final void entryRuleBackGroundSize() throws RecognitionException {
        try {
            // InternalGreedySnake.g:1087:1: ( ruleBackGroundSize EOF )
            // InternalGreedySnake.g:1088:1: ruleBackGroundSize EOF
            {
             before(grammarAccess.getBackGroundSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleBackGroundSize();

            state._fsp--;

             after(grammarAccess.getBackGroundSizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBackGroundSize"


    // $ANTLR start "ruleBackGroundSize"
    // InternalGreedySnake.g:1095:1: ruleBackGroundSize : ( RULE_INT ) ;
    public final void ruleBackGroundSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1099:2: ( ( RULE_INT ) )
            // InternalGreedySnake.g:1100:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:1100:2: ( RULE_INT )
            // InternalGreedySnake.g:1101:3: RULE_INT
            {
             before(grammarAccess.getBackGroundSizeAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBackGroundSizeAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackGroundSize"


    // $ANTLR start "entryRuleBackgroundTag"
    // InternalGreedySnake.g:1111:1: entryRuleBackgroundTag : ruleBackgroundTag EOF ;
    public final void entryRuleBackgroundTag() throws RecognitionException {
        try {
            // InternalGreedySnake.g:1112:1: ( ruleBackgroundTag EOF )
            // InternalGreedySnake.g:1113:1: ruleBackgroundTag EOF
            {
             before(grammarAccess.getBackgroundTagRule()); 
            pushFollow(FOLLOW_1);
            ruleBackgroundTag();

            state._fsp--;

             after(grammarAccess.getBackgroundTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBackgroundTag"


    // $ANTLR start "ruleBackgroundTag"
    // InternalGreedySnake.g:1120:1: ruleBackgroundTag : ( ( rule__BackgroundTag__Group__0 ) ) ;
    public final void ruleBackgroundTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1124:2: ( ( ( rule__BackgroundTag__Group__0 ) ) )
            // InternalGreedySnake.g:1125:2: ( ( rule__BackgroundTag__Group__0 ) )
            {
            // InternalGreedySnake.g:1125:2: ( ( rule__BackgroundTag__Group__0 ) )
            // InternalGreedySnake.g:1126:3: ( rule__BackgroundTag__Group__0 )
            {
             before(grammarAccess.getBackgroundTagAccess().getGroup()); 
            // InternalGreedySnake.g:1127:3: ( rule__BackgroundTag__Group__0 )
            // InternalGreedySnake.g:1127:4: rule__BackgroundTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BackgroundTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackgroundTag"


    // $ANTLR start "entryRuleMusicSpecification"
    // InternalGreedySnake.g:1136:1: entryRuleMusicSpecification : ruleMusicSpecification EOF ;
    public final void entryRuleMusicSpecification() throws RecognitionException {
        try {
            // InternalGreedySnake.g:1137:1: ( ruleMusicSpecification EOF )
            // InternalGreedySnake.g:1138:1: ruleMusicSpecification EOF
            {
             before(grammarAccess.getMusicSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleMusicSpecification();

            state._fsp--;

             after(grammarAccess.getMusicSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMusicSpecification"


    // $ANTLR start "ruleMusicSpecification"
    // InternalGreedySnake.g:1145:1: ruleMusicSpecification : ( ( rule__MusicSpecification__Group__0 ) ) ;
    public final void ruleMusicSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1149:2: ( ( ( rule__MusicSpecification__Group__0 ) ) )
            // InternalGreedySnake.g:1150:2: ( ( rule__MusicSpecification__Group__0 ) )
            {
            // InternalGreedySnake.g:1150:2: ( ( rule__MusicSpecification__Group__0 ) )
            // InternalGreedySnake.g:1151:3: ( rule__MusicSpecification__Group__0 )
            {
             before(grammarAccess.getMusicSpecificationAccess().getGroup()); 
            // InternalGreedySnake.g:1152:3: ( rule__MusicSpecification__Group__0 )
            // InternalGreedySnake.g:1152:4: rule__MusicSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MusicSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMusicSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMusicSpecification"


    // $ANTLR start "entryRuleMusicPath"
    // InternalGreedySnake.g:1161:1: entryRuleMusicPath : ruleMusicPath EOF ;
    public final void entryRuleMusicPath() throws RecognitionException {
        try {
            // InternalGreedySnake.g:1162:1: ( ruleMusicPath EOF )
            // InternalGreedySnake.g:1163:1: ruleMusicPath EOF
            {
             before(grammarAccess.getMusicPathRule()); 
            pushFollow(FOLLOW_1);
            ruleMusicPath();

            state._fsp--;

             after(grammarAccess.getMusicPathRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMusicPath"


    // $ANTLR start "ruleMusicPath"
    // InternalGreedySnake.g:1170:1: ruleMusicPath : ( ( rule__MusicPath__Group__0 ) ) ;
    public final void ruleMusicPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1174:2: ( ( ( rule__MusicPath__Group__0 ) ) )
            // InternalGreedySnake.g:1175:2: ( ( rule__MusicPath__Group__0 ) )
            {
            // InternalGreedySnake.g:1175:2: ( ( rule__MusicPath__Group__0 ) )
            // InternalGreedySnake.g:1176:3: ( rule__MusicPath__Group__0 )
            {
             before(grammarAccess.getMusicPathAccess().getGroup()); 
            // InternalGreedySnake.g:1177:3: ( rule__MusicPath__Group__0 )
            // InternalGreedySnake.g:1177:4: rule__MusicPath__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MusicPath__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMusicPathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMusicPath"


    // $ANTLR start "rule__GreedySnake__Alternatives_3"
    // InternalGreedySnake.g:1185:1: rule__GreedySnake__Alternatives_3 : ( ( ( rule__GreedySnake__SnakesAssignment_3_0 ) ) | ( ( rule__GreedySnake__FoodsAssignment_3_1 ) ) | ( ( rule__GreedySnake__ObstaclesAssignment_3_2 ) ) | ( ( rule__GreedySnake__SpeedAssignment_3_3 ) ) | ( ( rule__GreedySnake__FireAssignment_3_4 ) ) | ( ( rule__GreedySnake__TimeAssignment_3_5 ) ) | ( ( rule__GreedySnake__MapAssignment_3_6 ) ) | ( ( rule__GreedySnake__AboutAssignment_3_7 ) ) | ( ( rule__GreedySnake__HelpAssignment_3_8 ) ) | ( ( rule__GreedySnake__MusicAssignment_3_9 ) ) | ( ( rule__GreedySnake__BackgroundsAssignment_3_10 ) ) | ( ( rule__GreedySnake__FieldsAssignment_3_11 ) ) | ( ( rule__GreedySnake__OptionsAssignment_3_12 ) ) );
    public final void rule__GreedySnake__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1189:1: ( ( ( rule__GreedySnake__SnakesAssignment_3_0 ) ) | ( ( rule__GreedySnake__FoodsAssignment_3_1 ) ) | ( ( rule__GreedySnake__ObstaclesAssignment_3_2 ) ) | ( ( rule__GreedySnake__SpeedAssignment_3_3 ) ) | ( ( rule__GreedySnake__FireAssignment_3_4 ) ) | ( ( rule__GreedySnake__TimeAssignment_3_5 ) ) | ( ( rule__GreedySnake__MapAssignment_3_6 ) ) | ( ( rule__GreedySnake__AboutAssignment_3_7 ) ) | ( ( rule__GreedySnake__HelpAssignment_3_8 ) ) | ( ( rule__GreedySnake__MusicAssignment_3_9 ) ) | ( ( rule__GreedySnake__BackgroundsAssignment_3_10 ) ) | ( ( rule__GreedySnake__FieldsAssignment_3_11 ) ) | ( ( rule__GreedySnake__OptionsAssignment_3_12 ) ) )
            int alt1=13;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt1=1;
                }
                break;
            case 41:
                {
                alt1=2;
                }
                break;
            case 42:
                {
                alt1=3;
                }
                break;
            case 44:
                {
                alt1=4;
                }
                break;
            case 43:
                {
                alt1=5;
                }
                break;
            case RULE_ID:
            case 63:
                {
                alt1=6;
                }
                break;
            case 21:
                {
                alt1=7;
                }
                break;
            case 67:
                {
                alt1=8;
                }
                break;
            case 71:
                {
                alt1=9;
                }
                break;
            case 76:
                {
                alt1=10;
                }
                break;
            case 72:
                {
                alt1=11;
                }
                break;
            case 23:
                {
                alt1=12;
                }
                break;
            case 65:
            case 66:
                {
                alt1=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGreedySnake.g:1190:2: ( ( rule__GreedySnake__SnakesAssignment_3_0 ) )
                    {
                    // InternalGreedySnake.g:1190:2: ( ( rule__GreedySnake__SnakesAssignment_3_0 ) )
                    // InternalGreedySnake.g:1191:3: ( rule__GreedySnake__SnakesAssignment_3_0 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getSnakesAssignment_3_0()); 
                    // InternalGreedySnake.g:1192:3: ( rule__GreedySnake__SnakesAssignment_3_0 )
                    // InternalGreedySnake.g:1192:4: rule__GreedySnake__SnakesAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__SnakesAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getSnakesAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:1196:2: ( ( rule__GreedySnake__FoodsAssignment_3_1 ) )
                    {
                    // InternalGreedySnake.g:1196:2: ( ( rule__GreedySnake__FoodsAssignment_3_1 ) )
                    // InternalGreedySnake.g:1197:3: ( rule__GreedySnake__FoodsAssignment_3_1 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getFoodsAssignment_3_1()); 
                    // InternalGreedySnake.g:1198:3: ( rule__GreedySnake__FoodsAssignment_3_1 )
                    // InternalGreedySnake.g:1198:4: rule__GreedySnake__FoodsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__FoodsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getFoodsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGreedySnake.g:1202:2: ( ( rule__GreedySnake__ObstaclesAssignment_3_2 ) )
                    {
                    // InternalGreedySnake.g:1202:2: ( ( rule__GreedySnake__ObstaclesAssignment_3_2 ) )
                    // InternalGreedySnake.g:1203:3: ( rule__GreedySnake__ObstaclesAssignment_3_2 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getObstaclesAssignment_3_2()); 
                    // InternalGreedySnake.g:1204:3: ( rule__GreedySnake__ObstaclesAssignment_3_2 )
                    // InternalGreedySnake.g:1204:4: rule__GreedySnake__ObstaclesAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__ObstaclesAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getObstaclesAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGreedySnake.g:1208:2: ( ( rule__GreedySnake__SpeedAssignment_3_3 ) )
                    {
                    // InternalGreedySnake.g:1208:2: ( ( rule__GreedySnake__SpeedAssignment_3_3 ) )
                    // InternalGreedySnake.g:1209:3: ( rule__GreedySnake__SpeedAssignment_3_3 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getSpeedAssignment_3_3()); 
                    // InternalGreedySnake.g:1210:3: ( rule__GreedySnake__SpeedAssignment_3_3 )
                    // InternalGreedySnake.g:1210:4: rule__GreedySnake__SpeedAssignment_3_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__SpeedAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getSpeedAssignment_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGreedySnake.g:1214:2: ( ( rule__GreedySnake__FireAssignment_3_4 ) )
                    {
                    // InternalGreedySnake.g:1214:2: ( ( rule__GreedySnake__FireAssignment_3_4 ) )
                    // InternalGreedySnake.g:1215:3: ( rule__GreedySnake__FireAssignment_3_4 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getFireAssignment_3_4()); 
                    // InternalGreedySnake.g:1216:3: ( rule__GreedySnake__FireAssignment_3_4 )
                    // InternalGreedySnake.g:1216:4: rule__GreedySnake__FireAssignment_3_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__FireAssignment_3_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getFireAssignment_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGreedySnake.g:1220:2: ( ( rule__GreedySnake__TimeAssignment_3_5 ) )
                    {
                    // InternalGreedySnake.g:1220:2: ( ( rule__GreedySnake__TimeAssignment_3_5 ) )
                    // InternalGreedySnake.g:1221:3: ( rule__GreedySnake__TimeAssignment_3_5 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getTimeAssignment_3_5()); 
                    // InternalGreedySnake.g:1222:3: ( rule__GreedySnake__TimeAssignment_3_5 )
                    // InternalGreedySnake.g:1222:4: rule__GreedySnake__TimeAssignment_3_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__TimeAssignment_3_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getTimeAssignment_3_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGreedySnake.g:1226:2: ( ( rule__GreedySnake__MapAssignment_3_6 ) )
                    {
                    // InternalGreedySnake.g:1226:2: ( ( rule__GreedySnake__MapAssignment_3_6 ) )
                    // InternalGreedySnake.g:1227:3: ( rule__GreedySnake__MapAssignment_3_6 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getMapAssignment_3_6()); 
                    // InternalGreedySnake.g:1228:3: ( rule__GreedySnake__MapAssignment_3_6 )
                    // InternalGreedySnake.g:1228:4: rule__GreedySnake__MapAssignment_3_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__MapAssignment_3_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getMapAssignment_3_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGreedySnake.g:1232:2: ( ( rule__GreedySnake__AboutAssignment_3_7 ) )
                    {
                    // InternalGreedySnake.g:1232:2: ( ( rule__GreedySnake__AboutAssignment_3_7 ) )
                    // InternalGreedySnake.g:1233:3: ( rule__GreedySnake__AboutAssignment_3_7 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getAboutAssignment_3_7()); 
                    // InternalGreedySnake.g:1234:3: ( rule__GreedySnake__AboutAssignment_3_7 )
                    // InternalGreedySnake.g:1234:4: rule__GreedySnake__AboutAssignment_3_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__AboutAssignment_3_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getAboutAssignment_3_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGreedySnake.g:1238:2: ( ( rule__GreedySnake__HelpAssignment_3_8 ) )
                    {
                    // InternalGreedySnake.g:1238:2: ( ( rule__GreedySnake__HelpAssignment_3_8 ) )
                    // InternalGreedySnake.g:1239:3: ( rule__GreedySnake__HelpAssignment_3_8 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getHelpAssignment_3_8()); 
                    // InternalGreedySnake.g:1240:3: ( rule__GreedySnake__HelpAssignment_3_8 )
                    // InternalGreedySnake.g:1240:4: rule__GreedySnake__HelpAssignment_3_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__HelpAssignment_3_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getHelpAssignment_3_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGreedySnake.g:1244:2: ( ( rule__GreedySnake__MusicAssignment_3_9 ) )
                    {
                    // InternalGreedySnake.g:1244:2: ( ( rule__GreedySnake__MusicAssignment_3_9 ) )
                    // InternalGreedySnake.g:1245:3: ( rule__GreedySnake__MusicAssignment_3_9 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getMusicAssignment_3_9()); 
                    // InternalGreedySnake.g:1246:3: ( rule__GreedySnake__MusicAssignment_3_9 )
                    // InternalGreedySnake.g:1246:4: rule__GreedySnake__MusicAssignment_3_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__MusicAssignment_3_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getMusicAssignment_3_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalGreedySnake.g:1250:2: ( ( rule__GreedySnake__BackgroundsAssignment_3_10 ) )
                    {
                    // InternalGreedySnake.g:1250:2: ( ( rule__GreedySnake__BackgroundsAssignment_3_10 ) )
                    // InternalGreedySnake.g:1251:3: ( rule__GreedySnake__BackgroundsAssignment_3_10 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getBackgroundsAssignment_3_10()); 
                    // InternalGreedySnake.g:1252:3: ( rule__GreedySnake__BackgroundsAssignment_3_10 )
                    // InternalGreedySnake.g:1252:4: rule__GreedySnake__BackgroundsAssignment_3_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__BackgroundsAssignment_3_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getBackgroundsAssignment_3_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalGreedySnake.g:1256:2: ( ( rule__GreedySnake__FieldsAssignment_3_11 ) )
                    {
                    // InternalGreedySnake.g:1256:2: ( ( rule__GreedySnake__FieldsAssignment_3_11 ) )
                    // InternalGreedySnake.g:1257:3: ( rule__GreedySnake__FieldsAssignment_3_11 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getFieldsAssignment_3_11()); 
                    // InternalGreedySnake.g:1258:3: ( rule__GreedySnake__FieldsAssignment_3_11 )
                    // InternalGreedySnake.g:1258:4: rule__GreedySnake__FieldsAssignment_3_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__FieldsAssignment_3_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getFieldsAssignment_3_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalGreedySnake.g:1262:2: ( ( rule__GreedySnake__OptionsAssignment_3_12 ) )
                    {
                    // InternalGreedySnake.g:1262:2: ( ( rule__GreedySnake__OptionsAssignment_3_12 ) )
                    // InternalGreedySnake.g:1263:3: ( rule__GreedySnake__OptionsAssignment_3_12 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getOptionsAssignment_3_12()); 
                    // InternalGreedySnake.g:1264:3: ( rule__GreedySnake__OptionsAssignment_3_12 )
                    // InternalGreedySnake.g:1264:4: rule__GreedySnake__OptionsAssignment_3_12
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__OptionsAssignment_3_12();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getOptionsAssignment_3_12()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__Alternatives_3"


    // $ANTLR start "rule__TimeLimited__Alternatives"
    // InternalGreedySnake.g:1272:1: rule__TimeLimited__Alternatives : ( ( ( rule__TimeLimited__Group_0__0 ) ) | ( ( rule__TimeLimited__Group_1__0 ) ) );
    public final void rule__TimeLimited__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1276:1: ( ( ( rule__TimeLimited__Group_0__0 ) ) | ( ( rule__TimeLimited__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==63) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGreedySnake.g:1277:2: ( ( rule__TimeLimited__Group_0__0 ) )
                    {
                    // InternalGreedySnake.g:1277:2: ( ( rule__TimeLimited__Group_0__0 ) )
                    // InternalGreedySnake.g:1278:3: ( rule__TimeLimited__Group_0__0 )
                    {
                     before(grammarAccess.getTimeLimitedAccess().getGroup_0()); 
                    // InternalGreedySnake.g:1279:3: ( rule__TimeLimited__Group_0__0 )
                    // InternalGreedySnake.g:1279:4: rule__TimeLimited__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TimeLimited__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeLimitedAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:1283:2: ( ( rule__TimeLimited__Group_1__0 ) )
                    {
                    // InternalGreedySnake.g:1283:2: ( ( rule__TimeLimited__Group_1__0 ) )
                    // InternalGreedySnake.g:1284:3: ( rule__TimeLimited__Group_1__0 )
                    {
                     before(grammarAccess.getTimeLimitedAccess().getGroup_1()); 
                    // InternalGreedySnake.g:1285:3: ( rule__TimeLimited__Group_1__0 )
                    // InternalGreedySnake.g:1285:4: rule__TimeLimited__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TimeLimited__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeLimitedAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimited__Alternatives"


    // $ANTLR start "rule__AllItemVarSpec__TypeAlternatives_0_0"
    // InternalGreedySnake.g:1293:1: rule__AllItemVarSpec__TypeAlternatives_0_0 : ( ( 'int' ) | ( 'String' ) );
    public final void rule__AllItemVarSpec__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1297:1: ( ( 'int' ) | ( 'String' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGreedySnake.g:1298:2: ( 'int' )
                    {
                    // InternalGreedySnake.g:1298:2: ( 'int' )
                    // InternalGreedySnake.g:1299:3: 'int'
                    {
                     before(grammarAccess.getAllItemVarSpecAccess().getTypeIntKeyword_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAllItemVarSpecAccess().getTypeIntKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:1304:2: ( 'String' )
                    {
                    // InternalGreedySnake.g:1304:2: ( 'String' )
                    // InternalGreedySnake.g:1305:3: 'String'
                    {
                     before(grammarAccess.getAllItemVarSpecAccess().getTypeStringKeyword_0_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAllItemVarSpecAccess().getTypeStringKeyword_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllItemVarSpec__TypeAlternatives_0_0"


    // $ANTLR start "rule__ParamSpec__TypeAlternatives_0_0"
    // InternalGreedySnake.g:1314:1: rule__ParamSpec__TypeAlternatives_0_0 : ( ( 'int' ) | ( 'String' ) | ( 'Behaviour' ) );
    public final void rule__ParamSpec__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1318:1: ( ( 'int' ) | ( 'String' ) | ( 'Behaviour' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGreedySnake.g:1319:2: ( 'int' )
                    {
                    // InternalGreedySnake.g:1319:2: ( 'int' )
                    // InternalGreedySnake.g:1320:3: 'int'
                    {
                     before(grammarAccess.getParamSpecAccess().getTypeIntKeyword_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getParamSpecAccess().getTypeIntKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:1325:2: ( 'String' )
                    {
                    // InternalGreedySnake.g:1325:2: ( 'String' )
                    // InternalGreedySnake.g:1326:3: 'String'
                    {
                     before(grammarAccess.getParamSpecAccess().getTypeStringKeyword_0_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getParamSpecAccess().getTypeStringKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGreedySnake.g:1331:2: ( 'Behaviour' )
                    {
                    // InternalGreedySnake.g:1331:2: ( 'Behaviour' )
                    // InternalGreedySnake.g:1332:3: 'Behaviour'
                    {
                     before(grammarAccess.getParamSpecAccess().getTypeBehaviourKeyword_0_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getParamSpecAccess().getTypeBehaviourKeyword_0_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamSpec__TypeAlternatives_0_0"


    // $ANTLR start "rule__Addition__OperatorAlternatives_1_1_0"
    // InternalGreedySnake.g:1341:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1345:1: ( ( '+' ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGreedySnake.g:1346:2: ( '+' )
                    {
                    // InternalGreedySnake.g:1346:2: ( '+' )
                    // InternalGreedySnake.g:1347:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:1352:2: ( '-' )
                    {
                    // InternalGreedySnake.g:1352:2: ( '-' )
                    // InternalGreedySnake.g:1353:3: '-'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Multiplication__OperatorAlternatives_1_1_0"
    // InternalGreedySnake.g:1362:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1366:1: ( ( '*' ) | ( '/' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGreedySnake.g:1367:2: ( '*' )
                    {
                    // InternalGreedySnake.g:1367:2: ( '*' )
                    // InternalGreedySnake.g:1368:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:1373:2: ( '/' )
                    {
                    // InternalGreedySnake.g:1373:2: ( '/' )
                    // InternalGreedySnake.g:1374:3: '/'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalGreedySnake.g:1383:1: rule__Primary__Alternatives : ( ( ruleIntLiteral ) | ( ruleRealLiteral ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1387:1: ( ( ruleIntLiteral ) | ( ruleRealLiteral ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||LA7_1==RULE_ID||(LA7_1>=14 && LA7_1<=17)||LA7_1==20||LA7_1==32) ) {
                    alt7=1;
                }
                else if ( (LA7_1==64) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 64:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGreedySnake.g:1388:2: ( ruleIntLiteral )
                    {
                    // InternalGreedySnake.g:1388:2: ( ruleIntLiteral )
                    // InternalGreedySnake.g:1389:3: ruleIntLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:1394:2: ( ruleRealLiteral )
                    {
                    // InternalGreedySnake.g:1394:2: ( ruleRealLiteral )
                    // InternalGreedySnake.g:1395:3: ruleRealLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getRealLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRealLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getRealLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGreedySnake.g:1400:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalGreedySnake.g:1400:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalGreedySnake.g:1401:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalGreedySnake.g:1402:3: ( rule__Primary__Group_2__0 )
                    // InternalGreedySnake.g:1402:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__OptionSpecification__Alternatives"
    // InternalGreedySnake.g:1410:1: rule__OptionSpecification__Alternatives : ( ( ruleStartFieldDeclaration ) | ( ruleRestartMenu ) );
    public final void rule__OptionSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1414:1: ( ( ruleStartFieldDeclaration ) | ( ruleRestartMenu ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==66) ) {
                alt8=1;
            }
            else if ( (LA8_0==65) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGreedySnake.g:1415:2: ( ruleStartFieldDeclaration )
                    {
                    // InternalGreedySnake.g:1415:2: ( ruleStartFieldDeclaration )
                    // InternalGreedySnake.g:1416:3: ruleStartFieldDeclaration
                    {
                     before(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStartFieldDeclaration();

                    state._fsp--;

                     after(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:1421:2: ( ruleRestartMenu )
                    {
                    // InternalGreedySnake.g:1421:2: ( ruleRestartMenu )
                    // InternalGreedySnake.g:1422:3: ruleRestartMenu
                    {
                     before(grammarAccess.getOptionSpecificationAccess().getRestartMenuParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRestartMenu();

                    state._fsp--;

                     after(grammarAccess.getOptionSpecificationAccess().getRestartMenuParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionSpecification__Alternatives"


    // $ANTLR start "rule__GreedySnake__Group__0"
    // InternalGreedySnake.g:1431:1: rule__GreedySnake__Group__0 : rule__GreedySnake__Group__0__Impl rule__GreedySnake__Group__1 ;
    public final void rule__GreedySnake__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1435:1: ( rule__GreedySnake__Group__0__Impl rule__GreedySnake__Group__1 )
            // InternalGreedySnake.g:1436:2: rule__GreedySnake__Group__0__Impl rule__GreedySnake__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GreedySnake__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreedySnake__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__Group__0"


    // $ANTLR start "rule__GreedySnake__Group__0__Impl"
    // InternalGreedySnake.g:1443:1: rule__GreedySnake__Group__0__Impl : ( 'game' ) ;
    public final void rule__GreedySnake__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1447:1: ( ( 'game' ) )
            // InternalGreedySnake.g:1448:1: ( 'game' )
            {
            // InternalGreedySnake.g:1448:1: ( 'game' )
            // InternalGreedySnake.g:1449:2: 'game'
            {
             before(grammarAccess.getGreedySnakeAccess().getGameKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGreedySnakeAccess().getGameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__Group__0__Impl"


    // $ANTLR start "rule__GreedySnake__Group__1"
    // InternalGreedySnake.g:1458:1: rule__GreedySnake__Group__1 : rule__GreedySnake__Group__1__Impl rule__GreedySnake__Group__2 ;
    public final void rule__GreedySnake__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1462:1: ( rule__GreedySnake__Group__1__Impl rule__GreedySnake__Group__2 )
            // InternalGreedySnake.g:1463:2: rule__GreedySnake__Group__1__Impl rule__GreedySnake__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GreedySnake__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreedySnake__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__Group__1"


    // $ANTLR start "rule__GreedySnake__Group__1__Impl"
    // InternalGreedySnake.g:1470:1: rule__GreedySnake__Group__1__Impl : ( ( rule__GreedySnake__NameAssignment_1 ) ) ;
    public final void rule__GreedySnake__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1474:1: ( ( ( rule__GreedySnake__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:1475:1: ( ( rule__GreedySnake__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:1475:1: ( ( rule__GreedySnake__NameAssignment_1 ) )
            // InternalGreedySnake.g:1476:2: ( rule__GreedySnake__NameAssignment_1 )
            {
             before(grammarAccess.getGreedySnakeAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:1477:2: ( rule__GreedySnake__NameAssignment_1 )
            // InternalGreedySnake.g:1477:3: rule__GreedySnake__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GreedySnake__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreedySnakeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__Group__1__Impl"


    // $ANTLR start "rule__GreedySnake__Group__2"
    // InternalGreedySnake.g:1485:1: rule__GreedySnake__Group__2 : rule__GreedySnake__Group__2__Impl rule__GreedySnake__Group__3 ;
    public final void rule__GreedySnake__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1489:1: ( rule__GreedySnake__Group__2__Impl rule__GreedySnake__Group__3 )
            // InternalGreedySnake.g:1490:2: rule__GreedySnake__Group__2__Impl rule__GreedySnake__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__GreedySnake__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreedySnake__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__Group__2"


    // $ANTLR start "rule__GreedySnake__Group__2__Impl"
    // InternalGreedySnake.g:1497:1: rule__GreedySnake__Group__2__Impl : ( '{' ) ;
    public final void rule__GreedySnake__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1501:1: ( ( '{' ) )
            // InternalGreedySnake.g:1502:1: ( '{' )
            {
            // InternalGreedySnake.g:1502:1: ( '{' )
            // InternalGreedySnake.g:1503:2: '{'
            {
             before(grammarAccess.getGreedySnakeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGreedySnakeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__Group__2__Impl"


    // $ANTLR start "rule__GreedySnake__Group__3"
    // InternalGreedySnake.g:1512:1: rule__GreedySnake__Group__3 : rule__GreedySnake__Group__3__Impl rule__GreedySnake__Group__4 ;
    public final void rule__GreedySnake__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1516:1: ( rule__GreedySnake__Group__3__Impl rule__GreedySnake__Group__4 )
            // InternalGreedySnake.g:1517:2: rule__GreedySnake__Group__3__Impl rule__GreedySnake__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__GreedySnake__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreedySnake__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__Group__3"


    // $ANTLR start "rule__GreedySnake__Group__3__Impl"
    // InternalGreedySnake.g:1524:1: rule__GreedySnake__Group__3__Impl : ( ( ( rule__GreedySnake__Alternatives_3 ) ) ( ( rule__GreedySnake__Alternatives_3 )* ) ) ;
    public final void rule__GreedySnake__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1528:1: ( ( ( ( rule__GreedySnake__Alternatives_3 ) ) ( ( rule__GreedySnake__Alternatives_3 )* ) ) )
            // InternalGreedySnake.g:1529:1: ( ( ( rule__GreedySnake__Alternatives_3 ) ) ( ( rule__GreedySnake__Alternatives_3 )* ) )
            {
            // InternalGreedySnake.g:1529:1: ( ( ( rule__GreedySnake__Alternatives_3 ) ) ( ( rule__GreedySnake__Alternatives_3 )* ) )
            // InternalGreedySnake.g:1530:2: ( ( rule__GreedySnake__Alternatives_3 ) ) ( ( rule__GreedySnake__Alternatives_3 )* )
            {
            // InternalGreedySnake.g:1530:2: ( ( rule__GreedySnake__Alternatives_3 ) )
            // InternalGreedySnake.g:1531:3: ( rule__GreedySnake__Alternatives_3 )
            {
             before(grammarAccess.getGreedySnakeAccess().getAlternatives_3()); 
            // InternalGreedySnake.g:1532:3: ( rule__GreedySnake__Alternatives_3 )
            // InternalGreedySnake.g:1532:4: rule__GreedySnake__Alternatives_3
            {
            pushFollow(FOLLOW_7);
            rule__GreedySnake__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getGreedySnakeAccess().getAlternatives_3()); 

            }

            // InternalGreedySnake.g:1535:2: ( ( rule__GreedySnake__Alternatives_3 )* )
            // InternalGreedySnake.g:1536:3: ( rule__GreedySnake__Alternatives_3 )*
            {
             before(grammarAccess.getGreedySnakeAccess().getAlternatives_3()); 
            // InternalGreedySnake.g:1537:3: ( rule__GreedySnake__Alternatives_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==21||LA9_0==23||(LA9_0>=40 && LA9_0<=44)||LA9_0==63||(LA9_0>=65 && LA9_0<=67)||(LA9_0>=71 && LA9_0<=72)||LA9_0==76) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGreedySnake.g:1537:4: rule__GreedySnake__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__GreedySnake__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getGreedySnakeAccess().getAlternatives_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__Group__3__Impl"


    // $ANTLR start "rule__GreedySnake__Group__4"
    // InternalGreedySnake.g:1546:1: rule__GreedySnake__Group__4 : rule__GreedySnake__Group__4__Impl ;
    public final void rule__GreedySnake__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1550:1: ( rule__GreedySnake__Group__4__Impl )
            // InternalGreedySnake.g:1551:2: rule__GreedySnake__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GreedySnake__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__Group__4"


    // $ANTLR start "rule__GreedySnake__Group__4__Impl"
    // InternalGreedySnake.g:1557:1: rule__GreedySnake__Group__4__Impl : ( '}' ) ;
    public final void rule__GreedySnake__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1561:1: ( ( '}' ) )
            // InternalGreedySnake.g:1562:1: ( '}' )
            {
            // InternalGreedySnake.g:1562:1: ( '}' )
            // InternalGreedySnake.g:1563:2: '}'
            {
             before(grammarAccess.getGreedySnakeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGreedySnakeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__Group__4__Impl"


    // $ANTLR start "rule__GlobalMap__Group__0"
    // InternalGreedySnake.g:1573:1: rule__GlobalMap__Group__0 : rule__GlobalMap__Group__0__Impl rule__GlobalMap__Group__1 ;
    public final void rule__GlobalMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1577:1: ( rule__GlobalMap__Group__0__Impl rule__GlobalMap__Group__1 )
            // InternalGreedySnake.g:1578:2: rule__GlobalMap__Group__0__Impl rule__GlobalMap__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__GlobalMap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalMap__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalMap__Group__0"


    // $ANTLR start "rule__GlobalMap__Group__0__Impl"
    // InternalGreedySnake.g:1585:1: rule__GlobalMap__Group__0__Impl : ( 'Filepath' ) ;
    public final void rule__GlobalMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1589:1: ( ( 'Filepath' ) )
            // InternalGreedySnake.g:1590:1: ( 'Filepath' )
            {
            // InternalGreedySnake.g:1590:1: ( 'Filepath' )
            // InternalGreedySnake.g:1591:2: 'Filepath'
            {
             before(grammarAccess.getGlobalMapAccess().getFilepathKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGlobalMapAccess().getFilepathKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalMap__Group__0__Impl"


    // $ANTLR start "rule__GlobalMap__Group__1"
    // InternalGreedySnake.g:1600:1: rule__GlobalMap__Group__1 : rule__GlobalMap__Group__1__Impl rule__GlobalMap__Group__2 ;
    public final void rule__GlobalMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1604:1: ( rule__GlobalMap__Group__1__Impl rule__GlobalMap__Group__2 )
            // InternalGreedySnake.g:1605:2: rule__GlobalMap__Group__1__Impl rule__GlobalMap__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GlobalMap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalMap__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalMap__Group__1"


    // $ANTLR start "rule__GlobalMap__Group__1__Impl"
    // InternalGreedySnake.g:1612:1: rule__GlobalMap__Group__1__Impl : ( '=' ) ;
    public final void rule__GlobalMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1616:1: ( ( '=' ) )
            // InternalGreedySnake.g:1617:1: ( '=' )
            {
            // InternalGreedySnake.g:1617:1: ( '=' )
            // InternalGreedySnake.g:1618:2: '='
            {
             before(grammarAccess.getGlobalMapAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGlobalMapAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalMap__Group__1__Impl"


    // $ANTLR start "rule__GlobalMap__Group__2"
    // InternalGreedySnake.g:1627:1: rule__GlobalMap__Group__2 : rule__GlobalMap__Group__2__Impl ;
    public final void rule__GlobalMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1631:1: ( rule__GlobalMap__Group__2__Impl )
            // InternalGreedySnake.g:1632:2: rule__GlobalMap__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalMap__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalMap__Group__2"


    // $ANTLR start "rule__GlobalMap__Group__2__Impl"
    // InternalGreedySnake.g:1638:1: rule__GlobalMap__Group__2__Impl : ( ( rule__GlobalMap__MapAssignment_2 ) ) ;
    public final void rule__GlobalMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1642:1: ( ( ( rule__GlobalMap__MapAssignment_2 ) ) )
            // InternalGreedySnake.g:1643:1: ( ( rule__GlobalMap__MapAssignment_2 ) )
            {
            // InternalGreedySnake.g:1643:1: ( ( rule__GlobalMap__MapAssignment_2 ) )
            // InternalGreedySnake.g:1644:2: ( rule__GlobalMap__MapAssignment_2 )
            {
             before(grammarAccess.getGlobalMapAccess().getMapAssignment_2()); 
            // InternalGreedySnake.g:1645:2: ( rule__GlobalMap__MapAssignment_2 )
            // InternalGreedySnake.g:1645:3: rule__GlobalMap__MapAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GlobalMap__MapAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobalMapAccess().getMapAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalMap__Group__2__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__0"
    // InternalGreedySnake.g:1654:1: rule__GlobalFieldInitialisation__Group__0 : rule__GlobalFieldInitialisation__Group__0__Impl rule__GlobalFieldInitialisation__Group__1 ;
    public final void rule__GlobalFieldInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1658:1: ( rule__GlobalFieldInitialisation__Group__0__Impl rule__GlobalFieldInitialisation__Group__1 )
            // InternalGreedySnake.g:1659:2: rule__GlobalFieldInitialisation__Group__0__Impl rule__GlobalFieldInitialisation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GlobalFieldInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__0"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__0__Impl"
    // InternalGreedySnake.g:1666:1: rule__GlobalFieldInitialisation__Group__0__Impl : ( 'field' ) ;
    public final void rule__GlobalFieldInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1670:1: ( ( 'field' ) )
            // InternalGreedySnake.g:1671:1: ( 'field' )
            {
            // InternalGreedySnake.g:1671:1: ( 'field' )
            // InternalGreedySnake.g:1672:2: 'field'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getFieldKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__0__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__1"
    // InternalGreedySnake.g:1681:1: rule__GlobalFieldInitialisation__Group__1 : rule__GlobalFieldInitialisation__Group__1__Impl rule__GlobalFieldInitialisation__Group__2 ;
    public final void rule__GlobalFieldInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1685:1: ( rule__GlobalFieldInitialisation__Group__1__Impl rule__GlobalFieldInitialisation__Group__2 )
            // InternalGreedySnake.g:1686:2: rule__GlobalFieldInitialisation__Group__1__Impl rule__GlobalFieldInitialisation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GlobalFieldInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__1"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__1__Impl"
    // InternalGreedySnake.g:1693:1: rule__GlobalFieldInitialisation__Group__1__Impl : ( ( rule__GlobalFieldInitialisation__NameAssignment_1 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1697:1: ( ( ( rule__GlobalFieldInitialisation__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:1698:1: ( ( rule__GlobalFieldInitialisation__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:1698:1: ( ( rule__GlobalFieldInitialisation__NameAssignment_1 ) )
            // InternalGreedySnake.g:1699:2: ( rule__GlobalFieldInitialisation__NameAssignment_1 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:1700:2: ( rule__GlobalFieldInitialisation__NameAssignment_1 )
            // InternalGreedySnake.g:1700:3: rule__GlobalFieldInitialisation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalFieldInitialisationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__1__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__2"
    // InternalGreedySnake.g:1708:1: rule__GlobalFieldInitialisation__Group__2 : rule__GlobalFieldInitialisation__Group__2__Impl rule__GlobalFieldInitialisation__Group__3 ;
    public final void rule__GlobalFieldInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1712:1: ( rule__GlobalFieldInitialisation__Group__2__Impl rule__GlobalFieldInitialisation__Group__3 )
            // InternalGreedySnake.g:1713:2: rule__GlobalFieldInitialisation__Group__2__Impl rule__GlobalFieldInitialisation__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__GlobalFieldInitialisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__2"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__2__Impl"
    // InternalGreedySnake.g:1720:1: rule__GlobalFieldInitialisation__Group__2__Impl : ( '{' ) ;
    public final void rule__GlobalFieldInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1724:1: ( ( '{' ) )
            // InternalGreedySnake.g:1725:1: ( '{' )
            {
            // InternalGreedySnake.g:1725:1: ( '{' )
            // InternalGreedySnake.g:1726:2: '{'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__2__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__3"
    // InternalGreedySnake.g:1735:1: rule__GlobalFieldInitialisation__Group__3 : rule__GlobalFieldInitialisation__Group__3__Impl rule__GlobalFieldInitialisation__Group__4 ;
    public final void rule__GlobalFieldInitialisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1739:1: ( rule__GlobalFieldInitialisation__Group__3__Impl rule__GlobalFieldInitialisation__Group__4 )
            // InternalGreedySnake.g:1740:2: rule__GlobalFieldInitialisation__Group__3__Impl rule__GlobalFieldInitialisation__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__GlobalFieldInitialisation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__3"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__3__Impl"
    // InternalGreedySnake.g:1747:1: rule__GlobalFieldInitialisation__Group__3__Impl : ( 'Panel_width' ) ;
    public final void rule__GlobalFieldInitialisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1751:1: ( ( 'Panel_width' ) )
            // InternalGreedySnake.g:1752:1: ( 'Panel_width' )
            {
            // InternalGreedySnake.g:1752:1: ( 'Panel_width' )
            // InternalGreedySnake.g:1753:2: 'Panel_width'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getPanel_widthKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getPanel_widthKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__3__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__4"
    // InternalGreedySnake.g:1762:1: rule__GlobalFieldInitialisation__Group__4 : rule__GlobalFieldInitialisation__Group__4__Impl rule__GlobalFieldInitialisation__Group__5 ;
    public final void rule__GlobalFieldInitialisation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1766:1: ( rule__GlobalFieldInitialisation__Group__4__Impl rule__GlobalFieldInitialisation__Group__5 )
            // InternalGreedySnake.g:1767:2: rule__GlobalFieldInitialisation__Group__4__Impl rule__GlobalFieldInitialisation__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__GlobalFieldInitialisation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__4"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__4__Impl"
    // InternalGreedySnake.g:1774:1: rule__GlobalFieldInitialisation__Group__4__Impl : ( '=' ) ;
    public final void rule__GlobalFieldInitialisation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1778:1: ( ( '=' ) )
            // InternalGreedySnake.g:1779:1: ( '=' )
            {
            // InternalGreedySnake.g:1779:1: ( '=' )
            // InternalGreedySnake.g:1780:2: '='
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__4__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__5"
    // InternalGreedySnake.g:1789:1: rule__GlobalFieldInitialisation__Group__5 : rule__GlobalFieldInitialisation__Group__5__Impl rule__GlobalFieldInitialisation__Group__6 ;
    public final void rule__GlobalFieldInitialisation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1793:1: ( rule__GlobalFieldInitialisation__Group__5__Impl rule__GlobalFieldInitialisation__Group__6 )
            // InternalGreedySnake.g:1794:2: rule__GlobalFieldInitialisation__Group__5__Impl rule__GlobalFieldInitialisation__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__GlobalFieldInitialisation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__5"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__5__Impl"
    // InternalGreedySnake.g:1801:1: rule__GlobalFieldInitialisation__Group__5__Impl : ( ( rule__GlobalFieldInitialisation__PanelWidthAssignment_5 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1805:1: ( ( ( rule__GlobalFieldInitialisation__PanelWidthAssignment_5 ) ) )
            // InternalGreedySnake.g:1806:1: ( ( rule__GlobalFieldInitialisation__PanelWidthAssignment_5 ) )
            {
            // InternalGreedySnake.g:1806:1: ( ( rule__GlobalFieldInitialisation__PanelWidthAssignment_5 ) )
            // InternalGreedySnake.g:1807:2: ( rule__GlobalFieldInitialisation__PanelWidthAssignment_5 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getPanelWidthAssignment_5()); 
            // InternalGreedySnake.g:1808:2: ( rule__GlobalFieldInitialisation__PanelWidthAssignment_5 )
            // InternalGreedySnake.g:1808:3: rule__GlobalFieldInitialisation__PanelWidthAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__PanelWidthAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGlobalFieldInitialisationAccess().getPanelWidthAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__5__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__6"
    // InternalGreedySnake.g:1816:1: rule__GlobalFieldInitialisation__Group__6 : rule__GlobalFieldInitialisation__Group__6__Impl rule__GlobalFieldInitialisation__Group__7 ;
    public final void rule__GlobalFieldInitialisation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1820:1: ( rule__GlobalFieldInitialisation__Group__6__Impl rule__GlobalFieldInitialisation__Group__7 )
            // InternalGreedySnake.g:1821:2: rule__GlobalFieldInitialisation__Group__6__Impl rule__GlobalFieldInitialisation__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__GlobalFieldInitialisation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__6"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__6__Impl"
    // InternalGreedySnake.g:1828:1: rule__GlobalFieldInitialisation__Group__6__Impl : ( 'Panel_Height' ) ;
    public final void rule__GlobalFieldInitialisation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1832:1: ( ( 'Panel_Height' ) )
            // InternalGreedySnake.g:1833:1: ( 'Panel_Height' )
            {
            // InternalGreedySnake.g:1833:1: ( 'Panel_Height' )
            // InternalGreedySnake.g:1834:2: 'Panel_Height'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getPanel_HeightKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getPanel_HeightKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__6__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__7"
    // InternalGreedySnake.g:1843:1: rule__GlobalFieldInitialisation__Group__7 : rule__GlobalFieldInitialisation__Group__7__Impl rule__GlobalFieldInitialisation__Group__8 ;
    public final void rule__GlobalFieldInitialisation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1847:1: ( rule__GlobalFieldInitialisation__Group__7__Impl rule__GlobalFieldInitialisation__Group__8 )
            // InternalGreedySnake.g:1848:2: rule__GlobalFieldInitialisation__Group__7__Impl rule__GlobalFieldInitialisation__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__GlobalFieldInitialisation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__7"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__7__Impl"
    // InternalGreedySnake.g:1855:1: rule__GlobalFieldInitialisation__Group__7__Impl : ( '=' ) ;
    public final void rule__GlobalFieldInitialisation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1859:1: ( ( '=' ) )
            // InternalGreedySnake.g:1860:1: ( '=' )
            {
            // InternalGreedySnake.g:1860:1: ( '=' )
            // InternalGreedySnake.g:1861:2: '='
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__7__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__8"
    // InternalGreedySnake.g:1870:1: rule__GlobalFieldInitialisation__Group__8 : rule__GlobalFieldInitialisation__Group__8__Impl rule__GlobalFieldInitialisation__Group__9 ;
    public final void rule__GlobalFieldInitialisation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1874:1: ( rule__GlobalFieldInitialisation__Group__8__Impl rule__GlobalFieldInitialisation__Group__9 )
            // InternalGreedySnake.g:1875:2: rule__GlobalFieldInitialisation__Group__8__Impl rule__GlobalFieldInitialisation__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__GlobalFieldInitialisation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__8"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__8__Impl"
    // InternalGreedySnake.g:1882:1: rule__GlobalFieldInitialisation__Group__8__Impl : ( ( rule__GlobalFieldInitialisation__PanelHeightAssignment_8 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1886:1: ( ( ( rule__GlobalFieldInitialisation__PanelHeightAssignment_8 ) ) )
            // InternalGreedySnake.g:1887:1: ( ( rule__GlobalFieldInitialisation__PanelHeightAssignment_8 ) )
            {
            // InternalGreedySnake.g:1887:1: ( ( rule__GlobalFieldInitialisation__PanelHeightAssignment_8 ) )
            // InternalGreedySnake.g:1888:2: ( rule__GlobalFieldInitialisation__PanelHeightAssignment_8 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getPanelHeightAssignment_8()); 
            // InternalGreedySnake.g:1889:2: ( rule__GlobalFieldInitialisation__PanelHeightAssignment_8 )
            // InternalGreedySnake.g:1889:3: rule__GlobalFieldInitialisation__PanelHeightAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__PanelHeightAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getGlobalFieldInitialisationAccess().getPanelHeightAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__8__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__9"
    // InternalGreedySnake.g:1897:1: rule__GlobalFieldInitialisation__Group__9 : rule__GlobalFieldInitialisation__Group__9__Impl rule__GlobalFieldInitialisation__Group__10 ;
    public final void rule__GlobalFieldInitialisation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1901:1: ( rule__GlobalFieldInitialisation__Group__9__Impl rule__GlobalFieldInitialisation__Group__10 )
            // InternalGreedySnake.g:1902:2: rule__GlobalFieldInitialisation__Group__9__Impl rule__GlobalFieldInitialisation__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__GlobalFieldInitialisation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__9"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__9__Impl"
    // InternalGreedySnake.g:1909:1: rule__GlobalFieldInitialisation__Group__9__Impl : ( 'column' ) ;
    public final void rule__GlobalFieldInitialisation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1913:1: ( ( 'column' ) )
            // InternalGreedySnake.g:1914:1: ( 'column' )
            {
            // InternalGreedySnake.g:1914:1: ( 'column' )
            // InternalGreedySnake.g:1915:2: 'column'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getColumnKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getColumnKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__9__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__10"
    // InternalGreedySnake.g:1924:1: rule__GlobalFieldInitialisation__Group__10 : rule__GlobalFieldInitialisation__Group__10__Impl rule__GlobalFieldInitialisation__Group__11 ;
    public final void rule__GlobalFieldInitialisation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1928:1: ( rule__GlobalFieldInitialisation__Group__10__Impl rule__GlobalFieldInitialisation__Group__11 )
            // InternalGreedySnake.g:1929:2: rule__GlobalFieldInitialisation__Group__10__Impl rule__GlobalFieldInitialisation__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__GlobalFieldInitialisation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__10"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__10__Impl"
    // InternalGreedySnake.g:1936:1: rule__GlobalFieldInitialisation__Group__10__Impl : ( '=' ) ;
    public final void rule__GlobalFieldInitialisation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1940:1: ( ( '=' ) )
            // InternalGreedySnake.g:1941:1: ( '=' )
            {
            // InternalGreedySnake.g:1941:1: ( '=' )
            // InternalGreedySnake.g:1942:2: '='
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__10__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__11"
    // InternalGreedySnake.g:1951:1: rule__GlobalFieldInitialisation__Group__11 : rule__GlobalFieldInitialisation__Group__11__Impl rule__GlobalFieldInitialisation__Group__12 ;
    public final void rule__GlobalFieldInitialisation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1955:1: ( rule__GlobalFieldInitialisation__Group__11__Impl rule__GlobalFieldInitialisation__Group__12 )
            // InternalGreedySnake.g:1956:2: rule__GlobalFieldInitialisation__Group__11__Impl rule__GlobalFieldInitialisation__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__GlobalFieldInitialisation__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__11"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__11__Impl"
    // InternalGreedySnake.g:1963:1: rule__GlobalFieldInitialisation__Group__11__Impl : ( ( rule__GlobalFieldInitialisation__WidthAssignment_11 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1967:1: ( ( ( rule__GlobalFieldInitialisation__WidthAssignment_11 ) ) )
            // InternalGreedySnake.g:1968:1: ( ( rule__GlobalFieldInitialisation__WidthAssignment_11 ) )
            {
            // InternalGreedySnake.g:1968:1: ( ( rule__GlobalFieldInitialisation__WidthAssignment_11 ) )
            // InternalGreedySnake.g:1969:2: ( rule__GlobalFieldInitialisation__WidthAssignment_11 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getWidthAssignment_11()); 
            // InternalGreedySnake.g:1970:2: ( rule__GlobalFieldInitialisation__WidthAssignment_11 )
            // InternalGreedySnake.g:1970:3: rule__GlobalFieldInitialisation__WidthAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__WidthAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getGlobalFieldInitialisationAccess().getWidthAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__11__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__12"
    // InternalGreedySnake.g:1978:1: rule__GlobalFieldInitialisation__Group__12 : rule__GlobalFieldInitialisation__Group__12__Impl rule__GlobalFieldInitialisation__Group__13 ;
    public final void rule__GlobalFieldInitialisation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1982:1: ( rule__GlobalFieldInitialisation__Group__12__Impl rule__GlobalFieldInitialisation__Group__13 )
            // InternalGreedySnake.g:1983:2: rule__GlobalFieldInitialisation__Group__12__Impl rule__GlobalFieldInitialisation__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__GlobalFieldInitialisation__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__12"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__12__Impl"
    // InternalGreedySnake.g:1990:1: rule__GlobalFieldInitialisation__Group__12__Impl : ( 'row' ) ;
    public final void rule__GlobalFieldInitialisation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1994:1: ( ( 'row' ) )
            // InternalGreedySnake.g:1995:1: ( 'row' )
            {
            // InternalGreedySnake.g:1995:1: ( 'row' )
            // InternalGreedySnake.g:1996:2: 'row'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getRowKeyword_12()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getRowKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__12__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__13"
    // InternalGreedySnake.g:2005:1: rule__GlobalFieldInitialisation__Group__13 : rule__GlobalFieldInitialisation__Group__13__Impl rule__GlobalFieldInitialisation__Group__14 ;
    public final void rule__GlobalFieldInitialisation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2009:1: ( rule__GlobalFieldInitialisation__Group__13__Impl rule__GlobalFieldInitialisation__Group__14 )
            // InternalGreedySnake.g:2010:2: rule__GlobalFieldInitialisation__Group__13__Impl rule__GlobalFieldInitialisation__Group__14
            {
            pushFollow(FOLLOW_11);
            rule__GlobalFieldInitialisation__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__13"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__13__Impl"
    // InternalGreedySnake.g:2017:1: rule__GlobalFieldInitialisation__Group__13__Impl : ( '=' ) ;
    public final void rule__GlobalFieldInitialisation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2021:1: ( ( '=' ) )
            // InternalGreedySnake.g:2022:1: ( '=' )
            {
            // InternalGreedySnake.g:2022:1: ( '=' )
            // InternalGreedySnake.g:2023:2: '='
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_13()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__13__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__14"
    // InternalGreedySnake.g:2032:1: rule__GlobalFieldInitialisation__Group__14 : rule__GlobalFieldInitialisation__Group__14__Impl rule__GlobalFieldInitialisation__Group__15 ;
    public final void rule__GlobalFieldInitialisation__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2036:1: ( rule__GlobalFieldInitialisation__Group__14__Impl rule__GlobalFieldInitialisation__Group__15 )
            // InternalGreedySnake.g:2037:2: rule__GlobalFieldInitialisation__Group__14__Impl rule__GlobalFieldInitialisation__Group__15
            {
            pushFollow(FOLLOW_15);
            rule__GlobalFieldInitialisation__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__14"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__14__Impl"
    // InternalGreedySnake.g:2044:1: rule__GlobalFieldInitialisation__Group__14__Impl : ( ( rule__GlobalFieldInitialisation__HeightAssignment_14 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2048:1: ( ( ( rule__GlobalFieldInitialisation__HeightAssignment_14 ) ) )
            // InternalGreedySnake.g:2049:1: ( ( rule__GlobalFieldInitialisation__HeightAssignment_14 ) )
            {
            // InternalGreedySnake.g:2049:1: ( ( rule__GlobalFieldInitialisation__HeightAssignment_14 ) )
            // InternalGreedySnake.g:2050:2: ( rule__GlobalFieldInitialisation__HeightAssignment_14 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getHeightAssignment_14()); 
            // InternalGreedySnake.g:2051:2: ( rule__GlobalFieldInitialisation__HeightAssignment_14 )
            // InternalGreedySnake.g:2051:3: rule__GlobalFieldInitialisation__HeightAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__HeightAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getGlobalFieldInitialisationAccess().getHeightAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__14__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__15"
    // InternalGreedySnake.g:2059:1: rule__GlobalFieldInitialisation__Group__15 : rule__GlobalFieldInitialisation__Group__15__Impl rule__GlobalFieldInitialisation__Group__16 ;
    public final void rule__GlobalFieldInitialisation__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2063:1: ( rule__GlobalFieldInitialisation__Group__15__Impl rule__GlobalFieldInitialisation__Group__16 )
            // InternalGreedySnake.g:2064:2: rule__GlobalFieldInitialisation__Group__15__Impl rule__GlobalFieldInitialisation__Group__16
            {
            pushFollow(FOLLOW_8);
            rule__GlobalFieldInitialisation__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__15"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__15__Impl"
    // InternalGreedySnake.g:2071:1: rule__GlobalFieldInitialisation__Group__15__Impl : ( 'label_width' ) ;
    public final void rule__GlobalFieldInitialisation__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2075:1: ( ( 'label_width' ) )
            // InternalGreedySnake.g:2076:1: ( 'label_width' )
            {
            // InternalGreedySnake.g:2076:1: ( 'label_width' )
            // InternalGreedySnake.g:2077:2: 'label_width'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getLabel_widthKeyword_15()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getLabel_widthKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__15__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__16"
    // InternalGreedySnake.g:2086:1: rule__GlobalFieldInitialisation__Group__16 : rule__GlobalFieldInitialisation__Group__16__Impl rule__GlobalFieldInitialisation__Group__17 ;
    public final void rule__GlobalFieldInitialisation__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2090:1: ( rule__GlobalFieldInitialisation__Group__16__Impl rule__GlobalFieldInitialisation__Group__17 )
            // InternalGreedySnake.g:2091:2: rule__GlobalFieldInitialisation__Group__16__Impl rule__GlobalFieldInitialisation__Group__17
            {
            pushFollow(FOLLOW_11);
            rule__GlobalFieldInitialisation__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__16"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__16__Impl"
    // InternalGreedySnake.g:2098:1: rule__GlobalFieldInitialisation__Group__16__Impl : ( '=' ) ;
    public final void rule__GlobalFieldInitialisation__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2102:1: ( ( '=' ) )
            // InternalGreedySnake.g:2103:1: ( '=' )
            {
            // InternalGreedySnake.g:2103:1: ( '=' )
            // InternalGreedySnake.g:2104:2: '='
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_16()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__16__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__17"
    // InternalGreedySnake.g:2113:1: rule__GlobalFieldInitialisation__Group__17 : rule__GlobalFieldInitialisation__Group__17__Impl rule__GlobalFieldInitialisation__Group__18 ;
    public final void rule__GlobalFieldInitialisation__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2117:1: ( rule__GlobalFieldInitialisation__Group__17__Impl rule__GlobalFieldInitialisation__Group__18 )
            // InternalGreedySnake.g:2118:2: rule__GlobalFieldInitialisation__Group__17__Impl rule__GlobalFieldInitialisation__Group__18
            {
            pushFollow(FOLLOW_16);
            rule__GlobalFieldInitialisation__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__17"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__17__Impl"
    // InternalGreedySnake.g:2125:1: rule__GlobalFieldInitialisation__Group__17__Impl : ( ( rule__GlobalFieldInitialisation__LabelWidthAssignment_17 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2129:1: ( ( ( rule__GlobalFieldInitialisation__LabelWidthAssignment_17 ) ) )
            // InternalGreedySnake.g:2130:1: ( ( rule__GlobalFieldInitialisation__LabelWidthAssignment_17 ) )
            {
            // InternalGreedySnake.g:2130:1: ( ( rule__GlobalFieldInitialisation__LabelWidthAssignment_17 ) )
            // InternalGreedySnake.g:2131:2: ( rule__GlobalFieldInitialisation__LabelWidthAssignment_17 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getLabelWidthAssignment_17()); 
            // InternalGreedySnake.g:2132:2: ( rule__GlobalFieldInitialisation__LabelWidthAssignment_17 )
            // InternalGreedySnake.g:2132:3: rule__GlobalFieldInitialisation__LabelWidthAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__LabelWidthAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getGlobalFieldInitialisationAccess().getLabelWidthAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__17__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__18"
    // InternalGreedySnake.g:2140:1: rule__GlobalFieldInitialisation__Group__18 : rule__GlobalFieldInitialisation__Group__18__Impl rule__GlobalFieldInitialisation__Group__19 ;
    public final void rule__GlobalFieldInitialisation__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2144:1: ( rule__GlobalFieldInitialisation__Group__18__Impl rule__GlobalFieldInitialisation__Group__19 )
            // InternalGreedySnake.g:2145:2: rule__GlobalFieldInitialisation__Group__18__Impl rule__GlobalFieldInitialisation__Group__19
            {
            pushFollow(FOLLOW_8);
            rule__GlobalFieldInitialisation__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__18"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__18__Impl"
    // InternalGreedySnake.g:2152:1: rule__GlobalFieldInitialisation__Group__18__Impl : ( 'label_Height' ) ;
    public final void rule__GlobalFieldInitialisation__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2156:1: ( ( 'label_Height' ) )
            // InternalGreedySnake.g:2157:1: ( 'label_Height' )
            {
            // InternalGreedySnake.g:2157:1: ( 'label_Height' )
            // InternalGreedySnake.g:2158:2: 'label_Height'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getLabel_HeightKeyword_18()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getLabel_HeightKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__18__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__19"
    // InternalGreedySnake.g:2167:1: rule__GlobalFieldInitialisation__Group__19 : rule__GlobalFieldInitialisation__Group__19__Impl rule__GlobalFieldInitialisation__Group__20 ;
    public final void rule__GlobalFieldInitialisation__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2171:1: ( rule__GlobalFieldInitialisation__Group__19__Impl rule__GlobalFieldInitialisation__Group__20 )
            // InternalGreedySnake.g:2172:2: rule__GlobalFieldInitialisation__Group__19__Impl rule__GlobalFieldInitialisation__Group__20
            {
            pushFollow(FOLLOW_11);
            rule__GlobalFieldInitialisation__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__19"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__19__Impl"
    // InternalGreedySnake.g:2179:1: rule__GlobalFieldInitialisation__Group__19__Impl : ( '=' ) ;
    public final void rule__GlobalFieldInitialisation__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2183:1: ( ( '=' ) )
            // InternalGreedySnake.g:2184:1: ( '=' )
            {
            // InternalGreedySnake.g:2184:1: ( '=' )
            // InternalGreedySnake.g:2185:2: '='
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_19()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__19__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__20"
    // InternalGreedySnake.g:2194:1: rule__GlobalFieldInitialisation__Group__20 : rule__GlobalFieldInitialisation__Group__20__Impl rule__GlobalFieldInitialisation__Group__21 ;
    public final void rule__GlobalFieldInitialisation__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2198:1: ( rule__GlobalFieldInitialisation__Group__20__Impl rule__GlobalFieldInitialisation__Group__21 )
            // InternalGreedySnake.g:2199:2: rule__GlobalFieldInitialisation__Group__20__Impl rule__GlobalFieldInitialisation__Group__21
            {
            pushFollow(FOLLOW_17);
            rule__GlobalFieldInitialisation__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__20"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__20__Impl"
    // InternalGreedySnake.g:2206:1: rule__GlobalFieldInitialisation__Group__20__Impl : ( ( rule__GlobalFieldInitialisation__LabelHeightAssignment_20 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2210:1: ( ( ( rule__GlobalFieldInitialisation__LabelHeightAssignment_20 ) ) )
            // InternalGreedySnake.g:2211:1: ( ( rule__GlobalFieldInitialisation__LabelHeightAssignment_20 ) )
            {
            // InternalGreedySnake.g:2211:1: ( ( rule__GlobalFieldInitialisation__LabelHeightAssignment_20 ) )
            // InternalGreedySnake.g:2212:2: ( rule__GlobalFieldInitialisation__LabelHeightAssignment_20 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getLabelHeightAssignment_20()); 
            // InternalGreedySnake.g:2213:2: ( rule__GlobalFieldInitialisation__LabelHeightAssignment_20 )
            // InternalGreedySnake.g:2213:3: rule__GlobalFieldInitialisation__LabelHeightAssignment_20
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__LabelHeightAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getGlobalFieldInitialisationAccess().getLabelHeightAssignment_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__20__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__21"
    // InternalGreedySnake.g:2221:1: rule__GlobalFieldInitialisation__Group__21 : rule__GlobalFieldInitialisation__Group__21__Impl rule__GlobalFieldInitialisation__Group__22 ;
    public final void rule__GlobalFieldInitialisation__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2225:1: ( rule__GlobalFieldInitialisation__Group__21__Impl rule__GlobalFieldInitialisation__Group__22 )
            // InternalGreedySnake.g:2226:2: rule__GlobalFieldInitialisation__Group__21__Impl rule__GlobalFieldInitialisation__Group__22
            {
            pushFollow(FOLLOW_6);
            rule__GlobalFieldInitialisation__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__21"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__21__Impl"
    // InternalGreedySnake.g:2233:1: rule__GlobalFieldInitialisation__Group__21__Impl : ( ( rule__GlobalFieldInitialisation__Field_initialisationAssignment_21 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2237:1: ( ( ( rule__GlobalFieldInitialisation__Field_initialisationAssignment_21 ) ) )
            // InternalGreedySnake.g:2238:1: ( ( rule__GlobalFieldInitialisation__Field_initialisationAssignment_21 ) )
            {
            // InternalGreedySnake.g:2238:1: ( ( rule__GlobalFieldInitialisation__Field_initialisationAssignment_21 ) )
            // InternalGreedySnake.g:2239:2: ( rule__GlobalFieldInitialisation__Field_initialisationAssignment_21 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getField_initialisationAssignment_21()); 
            // InternalGreedySnake.g:2240:2: ( rule__GlobalFieldInitialisation__Field_initialisationAssignment_21 )
            // InternalGreedySnake.g:2240:3: rule__GlobalFieldInitialisation__Field_initialisationAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Field_initialisationAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getGlobalFieldInitialisationAccess().getField_initialisationAssignment_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__21__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__22"
    // InternalGreedySnake.g:2248:1: rule__GlobalFieldInitialisation__Group__22 : rule__GlobalFieldInitialisation__Group__22__Impl ;
    public final void rule__GlobalFieldInitialisation__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2252:1: ( rule__GlobalFieldInitialisation__Group__22__Impl )
            // InternalGreedySnake.g:2253:2: rule__GlobalFieldInitialisation__Group__22__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__22__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__22"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__22__Impl"
    // InternalGreedySnake.g:2259:1: rule__GlobalFieldInitialisation__Group__22__Impl : ( '}' ) ;
    public final void rule__GlobalFieldInitialisation__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2263:1: ( ( '}' ) )
            // InternalGreedySnake.g:2264:1: ( '}' )
            {
            // InternalGreedySnake.g:2264:1: ( '}' )
            // InternalGreedySnake.g:2265:2: '}'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getRightCurlyBracketKeyword_22()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getRightCurlyBracketKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__22__Impl"


    // $ANTLR start "rule__InitialField__Group__0"
    // InternalGreedySnake.g:2275:1: rule__InitialField__Group__0 : rule__InitialField__Group__0__Impl rule__InitialField__Group__1 ;
    public final void rule__InitialField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2279:1: ( rule__InitialField__Group__0__Impl rule__InitialField__Group__1 )
            // InternalGreedySnake.g:2280:2: rule__InitialField__Group__0__Impl rule__InitialField__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InitialField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__Group__0"


    // $ANTLR start "rule__InitialField__Group__0__Impl"
    // InternalGreedySnake.g:2287:1: rule__InitialField__Group__0__Impl : ( 'init' ) ;
    public final void rule__InitialField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2291:1: ( ( 'init' ) )
            // InternalGreedySnake.g:2292:1: ( 'init' )
            {
            // InternalGreedySnake.g:2292:1: ( 'init' )
            // InternalGreedySnake.g:2293:2: 'init'
            {
             before(grammarAccess.getInitialFieldAccess().getInitKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInitialFieldAccess().getInitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__Group__0__Impl"


    // $ANTLR start "rule__InitialField__Group__1"
    // InternalGreedySnake.g:2302:1: rule__InitialField__Group__1 : rule__InitialField__Group__1__Impl rule__InitialField__Group__2 ;
    public final void rule__InitialField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2306:1: ( rule__InitialField__Group__1__Impl rule__InitialField__Group__2 )
            // InternalGreedySnake.g:2307:2: rule__InitialField__Group__1__Impl rule__InitialField__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__InitialField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__Group__1"


    // $ANTLR start "rule__InitialField__Group__1__Impl"
    // InternalGreedySnake.g:2314:1: rule__InitialField__Group__1__Impl : ( ( rule__InitialField__NameAssignment_1 ) ) ;
    public final void rule__InitialField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2318:1: ( ( ( rule__InitialField__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:2319:1: ( ( rule__InitialField__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:2319:1: ( ( rule__InitialField__NameAssignment_1 ) )
            // InternalGreedySnake.g:2320:2: ( rule__InitialField__NameAssignment_1 )
            {
             before(grammarAccess.getInitialFieldAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:2321:2: ( rule__InitialField__NameAssignment_1 )
            // InternalGreedySnake.g:2321:3: rule__InitialField__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialField__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialFieldAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__Group__1__Impl"


    // $ANTLR start "rule__InitialField__Group__2"
    // InternalGreedySnake.g:2329:1: rule__InitialField__Group__2 : rule__InitialField__Group__2__Impl rule__InitialField__Group__3 ;
    public final void rule__InitialField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2333:1: ( rule__InitialField__Group__2__Impl rule__InitialField__Group__3 )
            // InternalGreedySnake.g:2334:2: rule__InitialField__Group__2__Impl rule__InitialField__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__InitialField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__Group__2"


    // $ANTLR start "rule__InitialField__Group__2__Impl"
    // InternalGreedySnake.g:2341:1: rule__InitialField__Group__2__Impl : ( '(' ) ;
    public final void rule__InitialField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2345:1: ( ( '(' ) )
            // InternalGreedySnake.g:2346:1: ( '(' )
            {
            // InternalGreedySnake.g:2346:1: ( '(' )
            // InternalGreedySnake.g:2347:2: '('
            {
             before(grammarAccess.getInitialFieldAccess().getLeftParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInitialFieldAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__Group__2__Impl"


    // $ANTLR start "rule__InitialField__Group__3"
    // InternalGreedySnake.g:2356:1: rule__InitialField__Group__3 : rule__InitialField__Group__3__Impl rule__InitialField__Group__4 ;
    public final void rule__InitialField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2360:1: ( rule__InitialField__Group__3__Impl rule__InitialField__Group__4 )
            // InternalGreedySnake.g:2361:2: rule__InitialField__Group__3__Impl rule__InitialField__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__InitialField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialField__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__Group__3"


    // $ANTLR start "rule__InitialField__Group__3__Impl"
    // InternalGreedySnake.g:2368:1: rule__InitialField__Group__3__Impl : ( ')' ) ;
    public final void rule__InitialField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2372:1: ( ( ')' ) )
            // InternalGreedySnake.g:2373:1: ( ')' )
            {
            // InternalGreedySnake.g:2373:1: ( ')' )
            // InternalGreedySnake.g:2374:2: ')'
            {
             before(grammarAccess.getInitialFieldAccess().getRightParenthesisKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInitialFieldAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__Group__3__Impl"


    // $ANTLR start "rule__InitialField__Group__4"
    // InternalGreedySnake.g:2383:1: rule__InitialField__Group__4 : rule__InitialField__Group__4__Impl rule__InitialField__Group__5 ;
    public final void rule__InitialField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2387:1: ( rule__InitialField__Group__4__Impl rule__InitialField__Group__5 )
            // InternalGreedySnake.g:2388:2: rule__InitialField__Group__4__Impl rule__InitialField__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__InitialField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialField__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__Group__4"


    // $ANTLR start "rule__InitialField__Group__4__Impl"
    // InternalGreedySnake.g:2395:1: rule__InitialField__Group__4__Impl : ( '{' ) ;
    public final void rule__InitialField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2399:1: ( ( '{' ) )
            // InternalGreedySnake.g:2400:1: ( '{' )
            {
            // InternalGreedySnake.g:2400:1: ( '{' )
            // InternalGreedySnake.g:2401:2: '{'
            {
             before(grammarAccess.getInitialFieldAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInitialFieldAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__Group__4__Impl"


    // $ANTLR start "rule__InitialField__Group__5"
    // InternalGreedySnake.g:2410:1: rule__InitialField__Group__5 : rule__InitialField__Group__5__Impl rule__InitialField__Group__6 ;
    public final void rule__InitialField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2414:1: ( rule__InitialField__Group__5__Impl rule__InitialField__Group__6 )
            // InternalGreedySnake.g:2415:2: rule__InitialField__Group__5__Impl rule__InitialField__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__InitialField__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialField__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__Group__5"


    // $ANTLR start "rule__InitialField__Group__5__Impl"
    // InternalGreedySnake.g:2422:1: rule__InitialField__Group__5__Impl : ( 'Default' ) ;
    public final void rule__InitialField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2426:1: ( ( 'Default' ) )
            // InternalGreedySnake.g:2427:1: ( 'Default' )
            {
            // InternalGreedySnake.g:2427:1: ( 'Default' )
            // InternalGreedySnake.g:2428:2: 'Default'
            {
             before(grammarAccess.getInitialFieldAccess().getDefaultKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInitialFieldAccess().getDefaultKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__Group__5__Impl"


    // $ANTLR start "rule__InitialField__Group__6"
    // InternalGreedySnake.g:2437:1: rule__InitialField__Group__6 : rule__InitialField__Group__6__Impl rule__InitialField__Group__7 ;
    public final void rule__InitialField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2441:1: ( rule__InitialField__Group__6__Impl rule__InitialField__Group__7 )
            // InternalGreedySnake.g:2442:2: rule__InitialField__Group__6__Impl rule__InitialField__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__InitialField__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialField__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__Group__6"


    // $ANTLR start "rule__InitialField__Group__6__Impl"
    // InternalGreedySnake.g:2449:1: rule__InitialField__Group__6__Impl : ( ':' ) ;
    public final void rule__InitialField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2453:1: ( ( ':' ) )
            // InternalGreedySnake.g:2454:1: ( ':' )
            {
            // InternalGreedySnake.g:2454:1: ( ':' )
            // InternalGreedySnake.g:2455:2: ':'
            {
             before(grammarAccess.getInitialFieldAccess().getColonKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInitialFieldAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__Group__6__Impl"


    // $ANTLR start "rule__InitialField__Group__7"
    // InternalGreedySnake.g:2464:1: rule__InitialField__Group__7 : rule__InitialField__Group__7__Impl rule__InitialField__Group__8 ;
    public final void rule__InitialField__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2468:1: ( rule__InitialField__Group__7__Impl rule__InitialField__Group__8 )
            // InternalGreedySnake.g:2469:2: rule__InitialField__Group__7__Impl rule__InitialField__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__InitialField__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialField__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__Group__7"


    // $ANTLR start "rule__InitialField__Group__7__Impl"
    // InternalGreedySnake.g:2476:1: rule__InitialField__Group__7__Impl : ( ( rule__InitialField__DefaultAssignment_7 ) ) ;
    public final void rule__InitialField__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2480:1: ( ( ( rule__InitialField__DefaultAssignment_7 ) ) )
            // InternalGreedySnake.g:2481:1: ( ( rule__InitialField__DefaultAssignment_7 ) )
            {
            // InternalGreedySnake.g:2481:1: ( ( rule__InitialField__DefaultAssignment_7 ) )
            // InternalGreedySnake.g:2482:2: ( rule__InitialField__DefaultAssignment_7 )
            {
             before(grammarAccess.getInitialFieldAccess().getDefaultAssignment_7()); 
            // InternalGreedySnake.g:2483:2: ( rule__InitialField__DefaultAssignment_7 )
            // InternalGreedySnake.g:2483:3: rule__InitialField__DefaultAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__InitialField__DefaultAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getInitialFieldAccess().getDefaultAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__Group__7__Impl"


    // $ANTLR start "rule__InitialField__Group__8"
    // InternalGreedySnake.g:2491:1: rule__InitialField__Group__8 : rule__InitialField__Group__8__Impl ;
    public final void rule__InitialField__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2495:1: ( rule__InitialField__Group__8__Impl )
            // InternalGreedySnake.g:2496:2: rule__InitialField__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialField__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__Group__8"


    // $ANTLR start "rule__InitialField__Group__8__Impl"
    // InternalGreedySnake.g:2502:1: rule__InitialField__Group__8__Impl : ( '}' ) ;
    public final void rule__InitialField__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2506:1: ( ( '}' ) )
            // InternalGreedySnake.g:2507:1: ( '}' )
            {
            // InternalGreedySnake.g:2507:1: ( '}' )
            // InternalGreedySnake.g:2508:2: '}'
            {
             before(grammarAccess.getInitialFieldAccess().getRightCurlyBracketKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInitialFieldAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__Group__8__Impl"


    // $ANTLR start "rule__Default__Group__0"
    // InternalGreedySnake.g:2518:1: rule__Default__Group__0 : rule__Default__Group__0__Impl rule__Default__Group__1 ;
    public final void rule__Default__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2522:1: ( rule__Default__Group__0__Impl rule__Default__Group__1 )
            // InternalGreedySnake.g:2523:2: rule__Default__Group__0__Impl rule__Default__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Default__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__0"


    // $ANTLR start "rule__Default__Group__0__Impl"
    // InternalGreedySnake.g:2530:1: rule__Default__Group__0__Impl : ( 'snakeLength' ) ;
    public final void rule__Default__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2534:1: ( ( 'snakeLength' ) )
            // InternalGreedySnake.g:2535:1: ( 'snakeLength' )
            {
            // InternalGreedySnake.g:2535:1: ( 'snakeLength' )
            // InternalGreedySnake.g:2536:2: 'snakeLength'
            {
             before(grammarAccess.getDefaultAccess().getSnakeLengthKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getSnakeLengthKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__0__Impl"


    // $ANTLR start "rule__Default__Group__1"
    // InternalGreedySnake.g:2545:1: rule__Default__Group__1 : rule__Default__Group__1__Impl rule__Default__Group__2 ;
    public final void rule__Default__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2549:1: ( rule__Default__Group__1__Impl rule__Default__Group__2 )
            // InternalGreedySnake.g:2550:2: rule__Default__Group__1__Impl rule__Default__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Default__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__1"


    // $ANTLR start "rule__Default__Group__1__Impl"
    // InternalGreedySnake.g:2557:1: rule__Default__Group__1__Impl : ( '=' ) ;
    public final void rule__Default__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2561:1: ( ( '=' ) )
            // InternalGreedySnake.g:2562:1: ( '=' )
            {
            // InternalGreedySnake.g:2562:1: ( '=' )
            // InternalGreedySnake.g:2563:2: '='
            {
             before(grammarAccess.getDefaultAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__1__Impl"


    // $ANTLR start "rule__Default__Group__2"
    // InternalGreedySnake.g:2572:1: rule__Default__Group__2 : rule__Default__Group__2__Impl rule__Default__Group__3 ;
    public final void rule__Default__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2576:1: ( rule__Default__Group__2__Impl rule__Default__Group__3 )
            // InternalGreedySnake.g:2577:2: rule__Default__Group__2__Impl rule__Default__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Default__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__2"


    // $ANTLR start "rule__Default__Group__2__Impl"
    // InternalGreedySnake.g:2584:1: rule__Default__Group__2__Impl : ( ( rule__Default__LengthAssignment_2 ) ) ;
    public final void rule__Default__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2588:1: ( ( ( rule__Default__LengthAssignment_2 ) ) )
            // InternalGreedySnake.g:2589:1: ( ( rule__Default__LengthAssignment_2 ) )
            {
            // InternalGreedySnake.g:2589:1: ( ( rule__Default__LengthAssignment_2 ) )
            // InternalGreedySnake.g:2590:2: ( rule__Default__LengthAssignment_2 )
            {
             before(grammarAccess.getDefaultAccess().getLengthAssignment_2()); 
            // InternalGreedySnake.g:2591:2: ( rule__Default__LengthAssignment_2 )
            // InternalGreedySnake.g:2591:3: rule__Default__LengthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Default__LengthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefaultAccess().getLengthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__2__Impl"


    // $ANTLR start "rule__Default__Group__3"
    // InternalGreedySnake.g:2599:1: rule__Default__Group__3 : rule__Default__Group__3__Impl rule__Default__Group__4 ;
    public final void rule__Default__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2603:1: ( rule__Default__Group__3__Impl rule__Default__Group__4 )
            // InternalGreedySnake.g:2604:2: rule__Default__Group__3__Impl rule__Default__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Default__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__3"


    // $ANTLR start "rule__Default__Group__3__Impl"
    // InternalGreedySnake.g:2611:1: rule__Default__Group__3__Impl : ( 'Score' ) ;
    public final void rule__Default__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2615:1: ( ( 'Score' ) )
            // InternalGreedySnake.g:2616:1: ( 'Score' )
            {
            // InternalGreedySnake.g:2616:1: ( 'Score' )
            // InternalGreedySnake.g:2617:2: 'Score'
            {
             before(grammarAccess.getDefaultAccess().getScoreKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getScoreKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__3__Impl"


    // $ANTLR start "rule__Default__Group__4"
    // InternalGreedySnake.g:2626:1: rule__Default__Group__4 : rule__Default__Group__4__Impl rule__Default__Group__5 ;
    public final void rule__Default__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2630:1: ( rule__Default__Group__4__Impl rule__Default__Group__5 )
            // InternalGreedySnake.g:2631:2: rule__Default__Group__4__Impl rule__Default__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Default__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__4"


    // $ANTLR start "rule__Default__Group__4__Impl"
    // InternalGreedySnake.g:2638:1: rule__Default__Group__4__Impl : ( '=' ) ;
    public final void rule__Default__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2642:1: ( ( '=' ) )
            // InternalGreedySnake.g:2643:1: ( '=' )
            {
            // InternalGreedySnake.g:2643:1: ( '=' )
            // InternalGreedySnake.g:2644:2: '='
            {
             before(grammarAccess.getDefaultAccess().getEqualsSignKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__4__Impl"


    // $ANTLR start "rule__Default__Group__5"
    // InternalGreedySnake.g:2653:1: rule__Default__Group__5 : rule__Default__Group__5__Impl rule__Default__Group__6 ;
    public final void rule__Default__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2657:1: ( rule__Default__Group__5__Impl rule__Default__Group__6 )
            // InternalGreedySnake.g:2658:2: rule__Default__Group__5__Impl rule__Default__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Default__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__5"


    // $ANTLR start "rule__Default__Group__5__Impl"
    // InternalGreedySnake.g:2665:1: rule__Default__Group__5__Impl : ( ( rule__Default__ScoreAssignment_5 ) ) ;
    public final void rule__Default__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2669:1: ( ( ( rule__Default__ScoreAssignment_5 ) ) )
            // InternalGreedySnake.g:2670:1: ( ( rule__Default__ScoreAssignment_5 ) )
            {
            // InternalGreedySnake.g:2670:1: ( ( rule__Default__ScoreAssignment_5 ) )
            // InternalGreedySnake.g:2671:2: ( rule__Default__ScoreAssignment_5 )
            {
             before(grammarAccess.getDefaultAccess().getScoreAssignment_5()); 
            // InternalGreedySnake.g:2672:2: ( rule__Default__ScoreAssignment_5 )
            // InternalGreedySnake.g:2672:3: rule__Default__ScoreAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Default__ScoreAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDefaultAccess().getScoreAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__5__Impl"


    // $ANTLR start "rule__Default__Group__6"
    // InternalGreedySnake.g:2680:1: rule__Default__Group__6 : rule__Default__Group__6__Impl rule__Default__Group__7 ;
    public final void rule__Default__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2684:1: ( rule__Default__Group__6__Impl rule__Default__Group__7 )
            // InternalGreedySnake.g:2685:2: rule__Default__Group__6__Impl rule__Default__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Default__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__6"


    // $ANTLR start "rule__Default__Group__6__Impl"
    // InternalGreedySnake.g:2692:1: rule__Default__Group__6__Impl : ( 'Time' ) ;
    public final void rule__Default__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2696:1: ( ( 'Time' ) )
            // InternalGreedySnake.g:2697:1: ( 'Time' )
            {
            // InternalGreedySnake.g:2697:1: ( 'Time' )
            // InternalGreedySnake.g:2698:2: 'Time'
            {
             before(grammarAccess.getDefaultAccess().getTimeKeyword_6()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getTimeKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__6__Impl"


    // $ANTLR start "rule__Default__Group__7"
    // InternalGreedySnake.g:2707:1: rule__Default__Group__7 : rule__Default__Group__7__Impl rule__Default__Group__8 ;
    public final void rule__Default__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2711:1: ( rule__Default__Group__7__Impl rule__Default__Group__8 )
            // InternalGreedySnake.g:2712:2: rule__Default__Group__7__Impl rule__Default__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Default__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__7"


    // $ANTLR start "rule__Default__Group__7__Impl"
    // InternalGreedySnake.g:2719:1: rule__Default__Group__7__Impl : ( '=' ) ;
    public final void rule__Default__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2723:1: ( ( '=' ) )
            // InternalGreedySnake.g:2724:1: ( '=' )
            {
            // InternalGreedySnake.g:2724:1: ( '=' )
            // InternalGreedySnake.g:2725:2: '='
            {
             before(grammarAccess.getDefaultAccess().getEqualsSignKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__7__Impl"


    // $ANTLR start "rule__Default__Group__8"
    // InternalGreedySnake.g:2734:1: rule__Default__Group__8 : rule__Default__Group__8__Impl rule__Default__Group__9 ;
    public final void rule__Default__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2738:1: ( rule__Default__Group__8__Impl rule__Default__Group__9 )
            // InternalGreedySnake.g:2739:2: rule__Default__Group__8__Impl rule__Default__Group__9
            {
            pushFollow(FOLLOW_25);
            rule__Default__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__8"


    // $ANTLR start "rule__Default__Group__8__Impl"
    // InternalGreedySnake.g:2746:1: rule__Default__Group__8__Impl : ( ( rule__Default__TimeAssignment_8 ) ) ;
    public final void rule__Default__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2750:1: ( ( ( rule__Default__TimeAssignment_8 ) ) )
            // InternalGreedySnake.g:2751:1: ( ( rule__Default__TimeAssignment_8 ) )
            {
            // InternalGreedySnake.g:2751:1: ( ( rule__Default__TimeAssignment_8 ) )
            // InternalGreedySnake.g:2752:2: ( rule__Default__TimeAssignment_8 )
            {
             before(grammarAccess.getDefaultAccess().getTimeAssignment_8()); 
            // InternalGreedySnake.g:2753:2: ( rule__Default__TimeAssignment_8 )
            // InternalGreedySnake.g:2753:3: rule__Default__TimeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Default__TimeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDefaultAccess().getTimeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__8__Impl"


    // $ANTLR start "rule__Default__Group__9"
    // InternalGreedySnake.g:2761:1: rule__Default__Group__9 : rule__Default__Group__9__Impl rule__Default__Group__10 ;
    public final void rule__Default__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2765:1: ( rule__Default__Group__9__Impl rule__Default__Group__10 )
            // InternalGreedySnake.g:2766:2: rule__Default__Group__9__Impl rule__Default__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Default__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__9"


    // $ANTLR start "rule__Default__Group__9__Impl"
    // InternalGreedySnake.g:2773:1: rule__Default__Group__9__Impl : ( 'Amount' ) ;
    public final void rule__Default__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2777:1: ( ( 'Amount' ) )
            // InternalGreedySnake.g:2778:1: ( 'Amount' )
            {
            // InternalGreedySnake.g:2778:1: ( 'Amount' )
            // InternalGreedySnake.g:2779:2: 'Amount'
            {
             before(grammarAccess.getDefaultAccess().getAmountKeyword_9()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getAmountKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__9__Impl"


    // $ANTLR start "rule__Default__Group__10"
    // InternalGreedySnake.g:2788:1: rule__Default__Group__10 : rule__Default__Group__10__Impl rule__Default__Group__11 ;
    public final void rule__Default__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2792:1: ( rule__Default__Group__10__Impl rule__Default__Group__11 )
            // InternalGreedySnake.g:2793:2: rule__Default__Group__10__Impl rule__Default__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Default__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__10"


    // $ANTLR start "rule__Default__Group__10__Impl"
    // InternalGreedySnake.g:2800:1: rule__Default__Group__10__Impl : ( '=' ) ;
    public final void rule__Default__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2804:1: ( ( '=' ) )
            // InternalGreedySnake.g:2805:1: ( '=' )
            {
            // InternalGreedySnake.g:2805:1: ( '=' )
            // InternalGreedySnake.g:2806:2: '='
            {
             before(grammarAccess.getDefaultAccess().getEqualsSignKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getEqualsSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__10__Impl"


    // $ANTLR start "rule__Default__Group__11"
    // InternalGreedySnake.g:2815:1: rule__Default__Group__11 : rule__Default__Group__11__Impl rule__Default__Group__12 ;
    public final void rule__Default__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2819:1: ( rule__Default__Group__11__Impl rule__Default__Group__12 )
            // InternalGreedySnake.g:2820:2: rule__Default__Group__11__Impl rule__Default__Group__12
            {
            pushFollow(FOLLOW_26);
            rule__Default__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__11"


    // $ANTLR start "rule__Default__Group__11__Impl"
    // InternalGreedySnake.g:2827:1: rule__Default__Group__11__Impl : ( ( rule__Default__AmountAssignment_11 ) ) ;
    public final void rule__Default__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2831:1: ( ( ( rule__Default__AmountAssignment_11 ) ) )
            // InternalGreedySnake.g:2832:1: ( ( rule__Default__AmountAssignment_11 ) )
            {
            // InternalGreedySnake.g:2832:1: ( ( rule__Default__AmountAssignment_11 ) )
            // InternalGreedySnake.g:2833:2: ( rule__Default__AmountAssignment_11 )
            {
             before(grammarAccess.getDefaultAccess().getAmountAssignment_11()); 
            // InternalGreedySnake.g:2834:2: ( rule__Default__AmountAssignment_11 )
            // InternalGreedySnake.g:2834:3: rule__Default__AmountAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Default__AmountAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getDefaultAccess().getAmountAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__11__Impl"


    // $ANTLR start "rule__Default__Group__12"
    // InternalGreedySnake.g:2842:1: rule__Default__Group__12 : rule__Default__Group__12__Impl rule__Default__Group__13 ;
    public final void rule__Default__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2846:1: ( rule__Default__Group__12__Impl rule__Default__Group__13 )
            // InternalGreedySnake.g:2847:2: rule__Default__Group__12__Impl rule__Default__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__Default__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__12"


    // $ANTLR start "rule__Default__Group__12__Impl"
    // InternalGreedySnake.g:2854:1: rule__Default__Group__12__Impl : ( 'Weapon' ) ;
    public final void rule__Default__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2858:1: ( ( 'Weapon' ) )
            // InternalGreedySnake.g:2859:1: ( 'Weapon' )
            {
            // InternalGreedySnake.g:2859:1: ( 'Weapon' )
            // InternalGreedySnake.g:2860:2: 'Weapon'
            {
             before(grammarAccess.getDefaultAccess().getWeaponKeyword_12()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getWeaponKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__12__Impl"


    // $ANTLR start "rule__Default__Group__13"
    // InternalGreedySnake.g:2869:1: rule__Default__Group__13 : rule__Default__Group__13__Impl rule__Default__Group__14 ;
    public final void rule__Default__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2873:1: ( rule__Default__Group__13__Impl rule__Default__Group__14 )
            // InternalGreedySnake.g:2874:2: rule__Default__Group__13__Impl rule__Default__Group__14
            {
            pushFollow(FOLLOW_9);
            rule__Default__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__13"


    // $ANTLR start "rule__Default__Group__13__Impl"
    // InternalGreedySnake.g:2881:1: rule__Default__Group__13__Impl : ( '=' ) ;
    public final void rule__Default__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2885:1: ( ( '=' ) )
            // InternalGreedySnake.g:2886:1: ( '=' )
            {
            // InternalGreedySnake.g:2886:1: ( '=' )
            // InternalGreedySnake.g:2887:2: '='
            {
             before(grammarAccess.getDefaultAccess().getEqualsSignKeyword_13()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getEqualsSignKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__13__Impl"


    // $ANTLR start "rule__Default__Group__14"
    // InternalGreedySnake.g:2896:1: rule__Default__Group__14 : rule__Default__Group__14__Impl ;
    public final void rule__Default__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2900:1: ( rule__Default__Group__14__Impl )
            // InternalGreedySnake.g:2901:2: rule__Default__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Default__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__14"


    // $ANTLR start "rule__Default__Group__14__Impl"
    // InternalGreedySnake.g:2907:1: rule__Default__Group__14__Impl : ( ( rule__Default__WeaponAssignment_14 ) ) ;
    public final void rule__Default__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2911:1: ( ( ( rule__Default__WeaponAssignment_14 ) ) )
            // InternalGreedySnake.g:2912:1: ( ( rule__Default__WeaponAssignment_14 ) )
            {
            // InternalGreedySnake.g:2912:1: ( ( rule__Default__WeaponAssignment_14 ) )
            // InternalGreedySnake.g:2913:2: ( rule__Default__WeaponAssignment_14 )
            {
             before(grammarAccess.getDefaultAccess().getWeaponAssignment_14()); 
            // InternalGreedySnake.g:2914:2: ( rule__Default__WeaponAssignment_14 )
            // InternalGreedySnake.g:2914:3: rule__Default__WeaponAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Default__WeaponAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getDefaultAccess().getWeaponAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__14__Impl"


    // $ANTLR start "rule__InitialSnakeSpecificatin__Group__0"
    // InternalGreedySnake.g:2923:1: rule__InitialSnakeSpecificatin__Group__0 : rule__InitialSnakeSpecificatin__Group__0__Impl rule__InitialSnakeSpecificatin__Group__1 ;
    public final void rule__InitialSnakeSpecificatin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2927:1: ( rule__InitialSnakeSpecificatin__Group__0__Impl rule__InitialSnakeSpecificatin__Group__1 )
            // InternalGreedySnake.g:2928:2: rule__InitialSnakeSpecificatin__Group__0__Impl rule__InitialSnakeSpecificatin__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InitialSnakeSpecificatin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialSnakeSpecificatin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSnakeSpecificatin__Group__0"


    // $ANTLR start "rule__InitialSnakeSpecificatin__Group__0__Impl"
    // InternalGreedySnake.g:2935:1: rule__InitialSnakeSpecificatin__Group__0__Impl : ( 'snake' ) ;
    public final void rule__InitialSnakeSpecificatin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2939:1: ( ( 'snake' ) )
            // InternalGreedySnake.g:2940:1: ( 'snake' )
            {
            // InternalGreedySnake.g:2940:1: ( 'snake' )
            // InternalGreedySnake.g:2941:2: 'snake'
            {
             before(grammarAccess.getInitialSnakeSpecificatinAccess().getSnakeKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInitialSnakeSpecificatinAccess().getSnakeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSnakeSpecificatin__Group__0__Impl"


    // $ANTLR start "rule__InitialSnakeSpecificatin__Group__1"
    // InternalGreedySnake.g:2950:1: rule__InitialSnakeSpecificatin__Group__1 : rule__InitialSnakeSpecificatin__Group__1__Impl rule__InitialSnakeSpecificatin__Group__2 ;
    public final void rule__InitialSnakeSpecificatin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2954:1: ( rule__InitialSnakeSpecificatin__Group__1__Impl rule__InitialSnakeSpecificatin__Group__2 )
            // InternalGreedySnake.g:2955:2: rule__InitialSnakeSpecificatin__Group__1__Impl rule__InitialSnakeSpecificatin__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__InitialSnakeSpecificatin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialSnakeSpecificatin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSnakeSpecificatin__Group__1"


    // $ANTLR start "rule__InitialSnakeSpecificatin__Group__1__Impl"
    // InternalGreedySnake.g:2962:1: rule__InitialSnakeSpecificatin__Group__1__Impl : ( ( rule__InitialSnakeSpecificatin__NameAssignment_1 ) ) ;
    public final void rule__InitialSnakeSpecificatin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2966:1: ( ( ( rule__InitialSnakeSpecificatin__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:2967:1: ( ( rule__InitialSnakeSpecificatin__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:2967:1: ( ( rule__InitialSnakeSpecificatin__NameAssignment_1 ) )
            // InternalGreedySnake.g:2968:2: ( rule__InitialSnakeSpecificatin__NameAssignment_1 )
            {
             before(grammarAccess.getInitialSnakeSpecificatinAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:2969:2: ( rule__InitialSnakeSpecificatin__NameAssignment_1 )
            // InternalGreedySnake.g:2969:3: rule__InitialSnakeSpecificatin__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialSnakeSpecificatin__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialSnakeSpecificatinAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSnakeSpecificatin__Group__1__Impl"


    // $ANTLR start "rule__InitialSnakeSpecificatin__Group__2"
    // InternalGreedySnake.g:2977:1: rule__InitialSnakeSpecificatin__Group__2 : rule__InitialSnakeSpecificatin__Group__2__Impl rule__InitialSnakeSpecificatin__Group__3 ;
    public final void rule__InitialSnakeSpecificatin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2981:1: ( rule__InitialSnakeSpecificatin__Group__2__Impl rule__InitialSnakeSpecificatin__Group__3 )
            // InternalGreedySnake.g:2982:2: rule__InitialSnakeSpecificatin__Group__2__Impl rule__InitialSnakeSpecificatin__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__InitialSnakeSpecificatin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialSnakeSpecificatin__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSnakeSpecificatin__Group__2"


    // $ANTLR start "rule__InitialSnakeSpecificatin__Group__2__Impl"
    // InternalGreedySnake.g:2989:1: rule__InitialSnakeSpecificatin__Group__2__Impl : ( '{' ) ;
    public final void rule__InitialSnakeSpecificatin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2993:1: ( ( '{' ) )
            // InternalGreedySnake.g:2994:1: ( '{' )
            {
            // InternalGreedySnake.g:2994:1: ( '{' )
            // InternalGreedySnake.g:2995:2: '{'
            {
             before(grammarAccess.getInitialSnakeSpecificatinAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInitialSnakeSpecificatinAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSnakeSpecificatin__Group__2__Impl"


    // $ANTLR start "rule__InitialSnakeSpecificatin__Group__3"
    // InternalGreedySnake.g:3004:1: rule__InitialSnakeSpecificatin__Group__3 : rule__InitialSnakeSpecificatin__Group__3__Impl rule__InitialSnakeSpecificatin__Group__4 ;
    public final void rule__InitialSnakeSpecificatin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3008:1: ( rule__InitialSnakeSpecificatin__Group__3__Impl rule__InitialSnakeSpecificatin__Group__4 )
            // InternalGreedySnake.g:3009:2: rule__InitialSnakeSpecificatin__Group__3__Impl rule__InitialSnakeSpecificatin__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__InitialSnakeSpecificatin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialSnakeSpecificatin__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSnakeSpecificatin__Group__3"


    // $ANTLR start "rule__InitialSnakeSpecificatin__Group__3__Impl"
    // InternalGreedySnake.g:3016:1: rule__InitialSnakeSpecificatin__Group__3__Impl : ( ( rule__InitialSnakeSpecificatin__MembersAssignment_3 ) ) ;
    public final void rule__InitialSnakeSpecificatin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3020:1: ( ( ( rule__InitialSnakeSpecificatin__MembersAssignment_3 ) ) )
            // InternalGreedySnake.g:3021:1: ( ( rule__InitialSnakeSpecificatin__MembersAssignment_3 ) )
            {
            // InternalGreedySnake.g:3021:1: ( ( rule__InitialSnakeSpecificatin__MembersAssignment_3 ) )
            // InternalGreedySnake.g:3022:2: ( rule__InitialSnakeSpecificatin__MembersAssignment_3 )
            {
             before(grammarAccess.getInitialSnakeSpecificatinAccess().getMembersAssignment_3()); 
            // InternalGreedySnake.g:3023:2: ( rule__InitialSnakeSpecificatin__MembersAssignment_3 )
            // InternalGreedySnake.g:3023:3: rule__InitialSnakeSpecificatin__MembersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InitialSnakeSpecificatin__MembersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInitialSnakeSpecificatinAccess().getMembersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSnakeSpecificatin__Group__3__Impl"


    // $ANTLR start "rule__InitialSnakeSpecificatin__Group__4"
    // InternalGreedySnake.g:3031:1: rule__InitialSnakeSpecificatin__Group__4 : rule__InitialSnakeSpecificatin__Group__4__Impl rule__InitialSnakeSpecificatin__Group__5 ;
    public final void rule__InitialSnakeSpecificatin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3035:1: ( rule__InitialSnakeSpecificatin__Group__4__Impl rule__InitialSnakeSpecificatin__Group__5 )
            // InternalGreedySnake.g:3036:2: rule__InitialSnakeSpecificatin__Group__4__Impl rule__InitialSnakeSpecificatin__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__InitialSnakeSpecificatin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialSnakeSpecificatin__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSnakeSpecificatin__Group__4"


    // $ANTLR start "rule__InitialSnakeSpecificatin__Group__4__Impl"
    // InternalGreedySnake.g:3043:1: rule__InitialSnakeSpecificatin__Group__4__Impl : ( '}' ) ;
    public final void rule__InitialSnakeSpecificatin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3047:1: ( ( '}' ) )
            // InternalGreedySnake.g:3048:1: ( '}' )
            {
            // InternalGreedySnake.g:3048:1: ( '}' )
            // InternalGreedySnake.g:3049:2: '}'
            {
             before(grammarAccess.getInitialSnakeSpecificatinAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInitialSnakeSpecificatinAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSnakeSpecificatin__Group__4__Impl"


    // $ANTLR start "rule__InitialSnakeSpecificatin__Group__5"
    // InternalGreedySnake.g:3058:1: rule__InitialSnakeSpecificatin__Group__5 : rule__InitialSnakeSpecificatin__Group__5__Impl ;
    public final void rule__InitialSnakeSpecificatin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3062:1: ( rule__InitialSnakeSpecificatin__Group__5__Impl )
            // InternalGreedySnake.g:3063:2: rule__InitialSnakeSpecificatin__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialSnakeSpecificatin__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSnakeSpecificatin__Group__5"


    // $ANTLR start "rule__InitialSnakeSpecificatin__Group__5__Impl"
    // InternalGreedySnake.g:3069:1: rule__InitialSnakeSpecificatin__Group__5__Impl : ( ( rule__InitialSnakeSpecificatin__MultiplesAssignment_5 )? ) ;
    public final void rule__InitialSnakeSpecificatin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3073:1: ( ( ( rule__InitialSnakeSpecificatin__MultiplesAssignment_5 )? ) )
            // InternalGreedySnake.g:3074:1: ( ( rule__InitialSnakeSpecificatin__MultiplesAssignment_5 )? )
            {
            // InternalGreedySnake.g:3074:1: ( ( rule__InitialSnakeSpecificatin__MultiplesAssignment_5 )? )
            // InternalGreedySnake.g:3075:2: ( rule__InitialSnakeSpecificatin__MultiplesAssignment_5 )?
            {
             before(grammarAccess.getInitialSnakeSpecificatinAccess().getMultiplesAssignment_5()); 
            // InternalGreedySnake.g:3076:2: ( rule__InitialSnakeSpecificatin__MultiplesAssignment_5 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||LA10_1==RULE_ID||(LA10_1>=20 && LA10_1<=21)||LA10_1==23||(LA10_1>=40 && LA10_1<=44)||LA10_1==63||(LA10_1>=65 && LA10_1<=67)||(LA10_1>=71 && LA10_1<=72)||LA10_1==76) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalGreedySnake.g:3076:3: rule__InitialSnakeSpecificatin__MultiplesAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__InitialSnakeSpecificatin__MultiplesAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitialSnakeSpecificatinAccess().getMultiplesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSnakeSpecificatin__Group__5__Impl"


    // $ANTLR start "rule__InitialFoodSpecificatin__Group__0"
    // InternalGreedySnake.g:3085:1: rule__InitialFoodSpecificatin__Group__0 : rule__InitialFoodSpecificatin__Group__0__Impl rule__InitialFoodSpecificatin__Group__1 ;
    public final void rule__InitialFoodSpecificatin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3089:1: ( rule__InitialFoodSpecificatin__Group__0__Impl rule__InitialFoodSpecificatin__Group__1 )
            // InternalGreedySnake.g:3090:2: rule__InitialFoodSpecificatin__Group__0__Impl rule__InitialFoodSpecificatin__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InitialFoodSpecificatin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialFoodSpecificatin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFoodSpecificatin__Group__0"


    // $ANTLR start "rule__InitialFoodSpecificatin__Group__0__Impl"
    // InternalGreedySnake.g:3097:1: rule__InitialFoodSpecificatin__Group__0__Impl : ( 'food' ) ;
    public final void rule__InitialFoodSpecificatin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3101:1: ( ( 'food' ) )
            // InternalGreedySnake.g:3102:1: ( 'food' )
            {
            // InternalGreedySnake.g:3102:1: ( 'food' )
            // InternalGreedySnake.g:3103:2: 'food'
            {
             before(grammarAccess.getInitialFoodSpecificatinAccess().getFoodKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInitialFoodSpecificatinAccess().getFoodKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFoodSpecificatin__Group__0__Impl"


    // $ANTLR start "rule__InitialFoodSpecificatin__Group__1"
    // InternalGreedySnake.g:3112:1: rule__InitialFoodSpecificatin__Group__1 : rule__InitialFoodSpecificatin__Group__1__Impl rule__InitialFoodSpecificatin__Group__2 ;
    public final void rule__InitialFoodSpecificatin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3116:1: ( rule__InitialFoodSpecificatin__Group__1__Impl rule__InitialFoodSpecificatin__Group__2 )
            // InternalGreedySnake.g:3117:2: rule__InitialFoodSpecificatin__Group__1__Impl rule__InitialFoodSpecificatin__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__InitialFoodSpecificatin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialFoodSpecificatin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFoodSpecificatin__Group__1"


    // $ANTLR start "rule__InitialFoodSpecificatin__Group__1__Impl"
    // InternalGreedySnake.g:3124:1: rule__InitialFoodSpecificatin__Group__1__Impl : ( ( rule__InitialFoodSpecificatin__NameAssignment_1 ) ) ;
    public final void rule__InitialFoodSpecificatin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3128:1: ( ( ( rule__InitialFoodSpecificatin__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:3129:1: ( ( rule__InitialFoodSpecificatin__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:3129:1: ( ( rule__InitialFoodSpecificatin__NameAssignment_1 ) )
            // InternalGreedySnake.g:3130:2: ( rule__InitialFoodSpecificatin__NameAssignment_1 )
            {
             before(grammarAccess.getInitialFoodSpecificatinAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:3131:2: ( rule__InitialFoodSpecificatin__NameAssignment_1 )
            // InternalGreedySnake.g:3131:3: rule__InitialFoodSpecificatin__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialFoodSpecificatin__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialFoodSpecificatinAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFoodSpecificatin__Group__1__Impl"


    // $ANTLR start "rule__InitialFoodSpecificatin__Group__2"
    // InternalGreedySnake.g:3139:1: rule__InitialFoodSpecificatin__Group__2 : rule__InitialFoodSpecificatin__Group__2__Impl rule__InitialFoodSpecificatin__Group__3 ;
    public final void rule__InitialFoodSpecificatin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3143:1: ( rule__InitialFoodSpecificatin__Group__2__Impl rule__InitialFoodSpecificatin__Group__3 )
            // InternalGreedySnake.g:3144:2: rule__InitialFoodSpecificatin__Group__2__Impl rule__InitialFoodSpecificatin__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__InitialFoodSpecificatin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialFoodSpecificatin__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFoodSpecificatin__Group__2"


    // $ANTLR start "rule__InitialFoodSpecificatin__Group__2__Impl"
    // InternalGreedySnake.g:3151:1: rule__InitialFoodSpecificatin__Group__2__Impl : ( '{' ) ;
    public final void rule__InitialFoodSpecificatin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3155:1: ( ( '{' ) )
            // InternalGreedySnake.g:3156:1: ( '{' )
            {
            // InternalGreedySnake.g:3156:1: ( '{' )
            // InternalGreedySnake.g:3157:2: '{'
            {
             before(grammarAccess.getInitialFoodSpecificatinAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInitialFoodSpecificatinAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFoodSpecificatin__Group__2__Impl"


    // $ANTLR start "rule__InitialFoodSpecificatin__Group__3"
    // InternalGreedySnake.g:3166:1: rule__InitialFoodSpecificatin__Group__3 : rule__InitialFoodSpecificatin__Group__3__Impl rule__InitialFoodSpecificatin__Group__4 ;
    public final void rule__InitialFoodSpecificatin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3170:1: ( rule__InitialFoodSpecificatin__Group__3__Impl rule__InitialFoodSpecificatin__Group__4 )
            // InternalGreedySnake.g:3171:2: rule__InitialFoodSpecificatin__Group__3__Impl rule__InitialFoodSpecificatin__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__InitialFoodSpecificatin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialFoodSpecificatin__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFoodSpecificatin__Group__3"


    // $ANTLR start "rule__InitialFoodSpecificatin__Group__3__Impl"
    // InternalGreedySnake.g:3178:1: rule__InitialFoodSpecificatin__Group__3__Impl : ( ( rule__InitialFoodSpecificatin__MembersAssignment_3 ) ) ;
    public final void rule__InitialFoodSpecificatin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3182:1: ( ( ( rule__InitialFoodSpecificatin__MembersAssignment_3 ) ) )
            // InternalGreedySnake.g:3183:1: ( ( rule__InitialFoodSpecificatin__MembersAssignment_3 ) )
            {
            // InternalGreedySnake.g:3183:1: ( ( rule__InitialFoodSpecificatin__MembersAssignment_3 ) )
            // InternalGreedySnake.g:3184:2: ( rule__InitialFoodSpecificatin__MembersAssignment_3 )
            {
             before(grammarAccess.getInitialFoodSpecificatinAccess().getMembersAssignment_3()); 
            // InternalGreedySnake.g:3185:2: ( rule__InitialFoodSpecificatin__MembersAssignment_3 )
            // InternalGreedySnake.g:3185:3: rule__InitialFoodSpecificatin__MembersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InitialFoodSpecificatin__MembersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInitialFoodSpecificatinAccess().getMembersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFoodSpecificatin__Group__3__Impl"


    // $ANTLR start "rule__InitialFoodSpecificatin__Group__4"
    // InternalGreedySnake.g:3193:1: rule__InitialFoodSpecificatin__Group__4 : rule__InitialFoodSpecificatin__Group__4__Impl rule__InitialFoodSpecificatin__Group__5 ;
    public final void rule__InitialFoodSpecificatin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3197:1: ( rule__InitialFoodSpecificatin__Group__4__Impl rule__InitialFoodSpecificatin__Group__5 )
            // InternalGreedySnake.g:3198:2: rule__InitialFoodSpecificatin__Group__4__Impl rule__InitialFoodSpecificatin__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__InitialFoodSpecificatin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialFoodSpecificatin__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFoodSpecificatin__Group__4"


    // $ANTLR start "rule__InitialFoodSpecificatin__Group__4__Impl"
    // InternalGreedySnake.g:3205:1: rule__InitialFoodSpecificatin__Group__4__Impl : ( '}' ) ;
    public final void rule__InitialFoodSpecificatin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3209:1: ( ( '}' ) )
            // InternalGreedySnake.g:3210:1: ( '}' )
            {
            // InternalGreedySnake.g:3210:1: ( '}' )
            // InternalGreedySnake.g:3211:2: '}'
            {
             before(grammarAccess.getInitialFoodSpecificatinAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInitialFoodSpecificatinAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFoodSpecificatin__Group__4__Impl"


    // $ANTLR start "rule__InitialFoodSpecificatin__Group__5"
    // InternalGreedySnake.g:3220:1: rule__InitialFoodSpecificatin__Group__5 : rule__InitialFoodSpecificatin__Group__5__Impl ;
    public final void rule__InitialFoodSpecificatin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3224:1: ( rule__InitialFoodSpecificatin__Group__5__Impl )
            // InternalGreedySnake.g:3225:2: rule__InitialFoodSpecificatin__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialFoodSpecificatin__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFoodSpecificatin__Group__5"


    // $ANTLR start "rule__InitialFoodSpecificatin__Group__5__Impl"
    // InternalGreedySnake.g:3231:1: rule__InitialFoodSpecificatin__Group__5__Impl : ( ( rule__InitialFoodSpecificatin__MultiplesAssignment_5 )? ) ;
    public final void rule__InitialFoodSpecificatin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3235:1: ( ( ( rule__InitialFoodSpecificatin__MultiplesAssignment_5 )? ) )
            // InternalGreedySnake.g:3236:1: ( ( rule__InitialFoodSpecificatin__MultiplesAssignment_5 )? )
            {
            // InternalGreedySnake.g:3236:1: ( ( rule__InitialFoodSpecificatin__MultiplesAssignment_5 )? )
            // InternalGreedySnake.g:3237:2: ( rule__InitialFoodSpecificatin__MultiplesAssignment_5 )?
            {
             before(grammarAccess.getInitialFoodSpecificatinAccess().getMultiplesAssignment_5()); 
            // InternalGreedySnake.g:3238:2: ( rule__InitialFoodSpecificatin__MultiplesAssignment_5 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||LA11_1==RULE_ID||(LA11_1>=20 && LA11_1<=21)||LA11_1==23||(LA11_1>=40 && LA11_1<=44)||LA11_1==63||(LA11_1>=65 && LA11_1<=67)||(LA11_1>=71 && LA11_1<=72)||LA11_1==76) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalGreedySnake.g:3238:3: rule__InitialFoodSpecificatin__MultiplesAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__InitialFoodSpecificatin__MultiplesAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitialFoodSpecificatinAccess().getMultiplesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFoodSpecificatin__Group__5__Impl"


    // $ANTLR start "rule__InitialObstacleSpecificatin__Group__0"
    // InternalGreedySnake.g:3247:1: rule__InitialObstacleSpecificatin__Group__0 : rule__InitialObstacleSpecificatin__Group__0__Impl rule__InitialObstacleSpecificatin__Group__1 ;
    public final void rule__InitialObstacleSpecificatin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3251:1: ( rule__InitialObstacleSpecificatin__Group__0__Impl rule__InitialObstacleSpecificatin__Group__1 )
            // InternalGreedySnake.g:3252:2: rule__InitialObstacleSpecificatin__Group__0__Impl rule__InitialObstacleSpecificatin__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InitialObstacleSpecificatin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialObstacleSpecificatin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialObstacleSpecificatin__Group__0"


    // $ANTLR start "rule__InitialObstacleSpecificatin__Group__0__Impl"
    // InternalGreedySnake.g:3259:1: rule__InitialObstacleSpecificatin__Group__0__Impl : ( 'obstacle' ) ;
    public final void rule__InitialObstacleSpecificatin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3263:1: ( ( 'obstacle' ) )
            // InternalGreedySnake.g:3264:1: ( 'obstacle' )
            {
            // InternalGreedySnake.g:3264:1: ( 'obstacle' )
            // InternalGreedySnake.g:3265:2: 'obstacle'
            {
             before(grammarAccess.getInitialObstacleSpecificatinAccess().getObstacleKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getInitialObstacleSpecificatinAccess().getObstacleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialObstacleSpecificatin__Group__0__Impl"


    // $ANTLR start "rule__InitialObstacleSpecificatin__Group__1"
    // InternalGreedySnake.g:3274:1: rule__InitialObstacleSpecificatin__Group__1 : rule__InitialObstacleSpecificatin__Group__1__Impl rule__InitialObstacleSpecificatin__Group__2 ;
    public final void rule__InitialObstacleSpecificatin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3278:1: ( rule__InitialObstacleSpecificatin__Group__1__Impl rule__InitialObstacleSpecificatin__Group__2 )
            // InternalGreedySnake.g:3279:2: rule__InitialObstacleSpecificatin__Group__1__Impl rule__InitialObstacleSpecificatin__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__InitialObstacleSpecificatin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialObstacleSpecificatin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialObstacleSpecificatin__Group__1"


    // $ANTLR start "rule__InitialObstacleSpecificatin__Group__1__Impl"
    // InternalGreedySnake.g:3286:1: rule__InitialObstacleSpecificatin__Group__1__Impl : ( ( rule__InitialObstacleSpecificatin__NameAssignment_1 ) ) ;
    public final void rule__InitialObstacleSpecificatin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3290:1: ( ( ( rule__InitialObstacleSpecificatin__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:3291:1: ( ( rule__InitialObstacleSpecificatin__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:3291:1: ( ( rule__InitialObstacleSpecificatin__NameAssignment_1 ) )
            // InternalGreedySnake.g:3292:2: ( rule__InitialObstacleSpecificatin__NameAssignment_1 )
            {
             before(grammarAccess.getInitialObstacleSpecificatinAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:3293:2: ( rule__InitialObstacleSpecificatin__NameAssignment_1 )
            // InternalGreedySnake.g:3293:3: rule__InitialObstacleSpecificatin__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialObstacleSpecificatin__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialObstacleSpecificatinAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialObstacleSpecificatin__Group__1__Impl"


    // $ANTLR start "rule__InitialObstacleSpecificatin__Group__2"
    // InternalGreedySnake.g:3301:1: rule__InitialObstacleSpecificatin__Group__2 : rule__InitialObstacleSpecificatin__Group__2__Impl rule__InitialObstacleSpecificatin__Group__3 ;
    public final void rule__InitialObstacleSpecificatin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3305:1: ( rule__InitialObstacleSpecificatin__Group__2__Impl rule__InitialObstacleSpecificatin__Group__3 )
            // InternalGreedySnake.g:3306:2: rule__InitialObstacleSpecificatin__Group__2__Impl rule__InitialObstacleSpecificatin__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__InitialObstacleSpecificatin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialObstacleSpecificatin__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialObstacleSpecificatin__Group__2"


    // $ANTLR start "rule__InitialObstacleSpecificatin__Group__2__Impl"
    // InternalGreedySnake.g:3313:1: rule__InitialObstacleSpecificatin__Group__2__Impl : ( '{' ) ;
    public final void rule__InitialObstacleSpecificatin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3317:1: ( ( '{' ) )
            // InternalGreedySnake.g:3318:1: ( '{' )
            {
            // InternalGreedySnake.g:3318:1: ( '{' )
            // InternalGreedySnake.g:3319:2: '{'
            {
             before(grammarAccess.getInitialObstacleSpecificatinAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInitialObstacleSpecificatinAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialObstacleSpecificatin__Group__2__Impl"


    // $ANTLR start "rule__InitialObstacleSpecificatin__Group__3"
    // InternalGreedySnake.g:3328:1: rule__InitialObstacleSpecificatin__Group__3 : rule__InitialObstacleSpecificatin__Group__3__Impl rule__InitialObstacleSpecificatin__Group__4 ;
    public final void rule__InitialObstacleSpecificatin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3332:1: ( rule__InitialObstacleSpecificatin__Group__3__Impl rule__InitialObstacleSpecificatin__Group__4 )
            // InternalGreedySnake.g:3333:2: rule__InitialObstacleSpecificatin__Group__3__Impl rule__InitialObstacleSpecificatin__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__InitialObstacleSpecificatin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialObstacleSpecificatin__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialObstacleSpecificatin__Group__3"


    // $ANTLR start "rule__InitialObstacleSpecificatin__Group__3__Impl"
    // InternalGreedySnake.g:3340:1: rule__InitialObstacleSpecificatin__Group__3__Impl : ( ( rule__InitialObstacleSpecificatin__MembersAssignment_3 ) ) ;
    public final void rule__InitialObstacleSpecificatin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3344:1: ( ( ( rule__InitialObstacleSpecificatin__MembersAssignment_3 ) ) )
            // InternalGreedySnake.g:3345:1: ( ( rule__InitialObstacleSpecificatin__MembersAssignment_3 ) )
            {
            // InternalGreedySnake.g:3345:1: ( ( rule__InitialObstacleSpecificatin__MembersAssignment_3 ) )
            // InternalGreedySnake.g:3346:2: ( rule__InitialObstacleSpecificatin__MembersAssignment_3 )
            {
             before(grammarAccess.getInitialObstacleSpecificatinAccess().getMembersAssignment_3()); 
            // InternalGreedySnake.g:3347:2: ( rule__InitialObstacleSpecificatin__MembersAssignment_3 )
            // InternalGreedySnake.g:3347:3: rule__InitialObstacleSpecificatin__MembersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InitialObstacleSpecificatin__MembersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInitialObstacleSpecificatinAccess().getMembersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialObstacleSpecificatin__Group__3__Impl"


    // $ANTLR start "rule__InitialObstacleSpecificatin__Group__4"
    // InternalGreedySnake.g:3355:1: rule__InitialObstacleSpecificatin__Group__4 : rule__InitialObstacleSpecificatin__Group__4__Impl rule__InitialObstacleSpecificatin__Group__5 ;
    public final void rule__InitialObstacleSpecificatin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3359:1: ( rule__InitialObstacleSpecificatin__Group__4__Impl rule__InitialObstacleSpecificatin__Group__5 )
            // InternalGreedySnake.g:3360:2: rule__InitialObstacleSpecificatin__Group__4__Impl rule__InitialObstacleSpecificatin__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__InitialObstacleSpecificatin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialObstacleSpecificatin__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialObstacleSpecificatin__Group__4"


    // $ANTLR start "rule__InitialObstacleSpecificatin__Group__4__Impl"
    // InternalGreedySnake.g:3367:1: rule__InitialObstacleSpecificatin__Group__4__Impl : ( '}' ) ;
    public final void rule__InitialObstacleSpecificatin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3371:1: ( ( '}' ) )
            // InternalGreedySnake.g:3372:1: ( '}' )
            {
            // InternalGreedySnake.g:3372:1: ( '}' )
            // InternalGreedySnake.g:3373:2: '}'
            {
             before(grammarAccess.getInitialObstacleSpecificatinAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInitialObstacleSpecificatinAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialObstacleSpecificatin__Group__4__Impl"


    // $ANTLR start "rule__InitialObstacleSpecificatin__Group__5"
    // InternalGreedySnake.g:3382:1: rule__InitialObstacleSpecificatin__Group__5 : rule__InitialObstacleSpecificatin__Group__5__Impl ;
    public final void rule__InitialObstacleSpecificatin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3386:1: ( rule__InitialObstacleSpecificatin__Group__5__Impl )
            // InternalGreedySnake.g:3387:2: rule__InitialObstacleSpecificatin__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialObstacleSpecificatin__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialObstacleSpecificatin__Group__5"


    // $ANTLR start "rule__InitialObstacleSpecificatin__Group__5__Impl"
    // InternalGreedySnake.g:3393:1: rule__InitialObstacleSpecificatin__Group__5__Impl : ( ( rule__InitialObstacleSpecificatin__MultiplesAssignment_5 )? ) ;
    public final void rule__InitialObstacleSpecificatin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3397:1: ( ( ( rule__InitialObstacleSpecificatin__MultiplesAssignment_5 )? ) )
            // InternalGreedySnake.g:3398:1: ( ( rule__InitialObstacleSpecificatin__MultiplesAssignment_5 )? )
            {
            // InternalGreedySnake.g:3398:1: ( ( rule__InitialObstacleSpecificatin__MultiplesAssignment_5 )? )
            // InternalGreedySnake.g:3399:2: ( rule__InitialObstacleSpecificatin__MultiplesAssignment_5 )?
            {
             before(grammarAccess.getInitialObstacleSpecificatinAccess().getMultiplesAssignment_5()); 
            // InternalGreedySnake.g:3400:2: ( rule__InitialObstacleSpecificatin__MultiplesAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||LA12_1==RULE_ID||(LA12_1>=20 && LA12_1<=21)||LA12_1==23||(LA12_1>=40 && LA12_1<=44)||LA12_1==63||(LA12_1>=65 && LA12_1<=67)||(LA12_1>=71 && LA12_1<=72)||LA12_1==76) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalGreedySnake.g:3400:3: rule__InitialObstacleSpecificatin__MultiplesAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__InitialObstacleSpecificatin__MultiplesAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitialObstacleSpecificatinAccess().getMultiplesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialObstacleSpecificatin__Group__5__Impl"


    // $ANTLR start "rule__InitialFireSpecification__Group__0"
    // InternalGreedySnake.g:3409:1: rule__InitialFireSpecification__Group__0 : rule__InitialFireSpecification__Group__0__Impl rule__InitialFireSpecification__Group__1 ;
    public final void rule__InitialFireSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3413:1: ( rule__InitialFireSpecification__Group__0__Impl rule__InitialFireSpecification__Group__1 )
            // InternalGreedySnake.g:3414:2: rule__InitialFireSpecification__Group__0__Impl rule__InitialFireSpecification__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InitialFireSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialFireSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFireSpecification__Group__0"


    // $ANTLR start "rule__InitialFireSpecification__Group__0__Impl"
    // InternalGreedySnake.g:3421:1: rule__InitialFireSpecification__Group__0__Impl : ( 'fire' ) ;
    public final void rule__InitialFireSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3425:1: ( ( 'fire' ) )
            // InternalGreedySnake.g:3426:1: ( 'fire' )
            {
            // InternalGreedySnake.g:3426:1: ( 'fire' )
            // InternalGreedySnake.g:3427:2: 'fire'
            {
             before(grammarAccess.getInitialFireSpecificationAccess().getFireKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getInitialFireSpecificationAccess().getFireKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFireSpecification__Group__0__Impl"


    // $ANTLR start "rule__InitialFireSpecification__Group__1"
    // InternalGreedySnake.g:3436:1: rule__InitialFireSpecification__Group__1 : rule__InitialFireSpecification__Group__1__Impl rule__InitialFireSpecification__Group__2 ;
    public final void rule__InitialFireSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3440:1: ( rule__InitialFireSpecification__Group__1__Impl rule__InitialFireSpecification__Group__2 )
            // InternalGreedySnake.g:3441:2: rule__InitialFireSpecification__Group__1__Impl rule__InitialFireSpecification__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__InitialFireSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialFireSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFireSpecification__Group__1"


    // $ANTLR start "rule__InitialFireSpecification__Group__1__Impl"
    // InternalGreedySnake.g:3448:1: rule__InitialFireSpecification__Group__1__Impl : ( ( rule__InitialFireSpecification__NameAssignment_1 ) ) ;
    public final void rule__InitialFireSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3452:1: ( ( ( rule__InitialFireSpecification__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:3453:1: ( ( rule__InitialFireSpecification__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:3453:1: ( ( rule__InitialFireSpecification__NameAssignment_1 ) )
            // InternalGreedySnake.g:3454:2: ( rule__InitialFireSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getInitialFireSpecificationAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:3455:2: ( rule__InitialFireSpecification__NameAssignment_1 )
            // InternalGreedySnake.g:3455:3: rule__InitialFireSpecification__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialFireSpecification__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialFireSpecificationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFireSpecification__Group__1__Impl"


    // $ANTLR start "rule__InitialFireSpecification__Group__2"
    // InternalGreedySnake.g:3463:1: rule__InitialFireSpecification__Group__2 : rule__InitialFireSpecification__Group__2__Impl rule__InitialFireSpecification__Group__3 ;
    public final void rule__InitialFireSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3467:1: ( rule__InitialFireSpecification__Group__2__Impl rule__InitialFireSpecification__Group__3 )
            // InternalGreedySnake.g:3468:2: rule__InitialFireSpecification__Group__2__Impl rule__InitialFireSpecification__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__InitialFireSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialFireSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFireSpecification__Group__2"


    // $ANTLR start "rule__InitialFireSpecification__Group__2__Impl"
    // InternalGreedySnake.g:3475:1: rule__InitialFireSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__InitialFireSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3479:1: ( ( '{' ) )
            // InternalGreedySnake.g:3480:1: ( '{' )
            {
            // InternalGreedySnake.g:3480:1: ( '{' )
            // InternalGreedySnake.g:3481:2: '{'
            {
             before(grammarAccess.getInitialFireSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInitialFireSpecificationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFireSpecification__Group__2__Impl"


    // $ANTLR start "rule__InitialFireSpecification__Group__3"
    // InternalGreedySnake.g:3490:1: rule__InitialFireSpecification__Group__3 : rule__InitialFireSpecification__Group__3__Impl rule__InitialFireSpecification__Group__4 ;
    public final void rule__InitialFireSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3494:1: ( rule__InitialFireSpecification__Group__3__Impl rule__InitialFireSpecification__Group__4 )
            // InternalGreedySnake.g:3495:2: rule__InitialFireSpecification__Group__3__Impl rule__InitialFireSpecification__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__InitialFireSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialFireSpecification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFireSpecification__Group__3"


    // $ANTLR start "rule__InitialFireSpecification__Group__3__Impl"
    // InternalGreedySnake.g:3502:1: rule__InitialFireSpecification__Group__3__Impl : ( ( rule__InitialFireSpecification__MembersAssignment_3 ) ) ;
    public final void rule__InitialFireSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3506:1: ( ( ( rule__InitialFireSpecification__MembersAssignment_3 ) ) )
            // InternalGreedySnake.g:3507:1: ( ( rule__InitialFireSpecification__MembersAssignment_3 ) )
            {
            // InternalGreedySnake.g:3507:1: ( ( rule__InitialFireSpecification__MembersAssignment_3 ) )
            // InternalGreedySnake.g:3508:2: ( rule__InitialFireSpecification__MembersAssignment_3 )
            {
             before(grammarAccess.getInitialFireSpecificationAccess().getMembersAssignment_3()); 
            // InternalGreedySnake.g:3509:2: ( rule__InitialFireSpecification__MembersAssignment_3 )
            // InternalGreedySnake.g:3509:3: rule__InitialFireSpecification__MembersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InitialFireSpecification__MembersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInitialFireSpecificationAccess().getMembersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFireSpecification__Group__3__Impl"


    // $ANTLR start "rule__InitialFireSpecification__Group__4"
    // InternalGreedySnake.g:3517:1: rule__InitialFireSpecification__Group__4 : rule__InitialFireSpecification__Group__4__Impl rule__InitialFireSpecification__Group__5 ;
    public final void rule__InitialFireSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3521:1: ( rule__InitialFireSpecification__Group__4__Impl rule__InitialFireSpecification__Group__5 )
            // InternalGreedySnake.g:3522:2: rule__InitialFireSpecification__Group__4__Impl rule__InitialFireSpecification__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__InitialFireSpecification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialFireSpecification__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFireSpecification__Group__4"


    // $ANTLR start "rule__InitialFireSpecification__Group__4__Impl"
    // InternalGreedySnake.g:3529:1: rule__InitialFireSpecification__Group__4__Impl : ( '}' ) ;
    public final void rule__InitialFireSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3533:1: ( ( '}' ) )
            // InternalGreedySnake.g:3534:1: ( '}' )
            {
            // InternalGreedySnake.g:3534:1: ( '}' )
            // InternalGreedySnake.g:3535:2: '}'
            {
             before(grammarAccess.getInitialFireSpecificationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInitialFireSpecificationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFireSpecification__Group__4__Impl"


    // $ANTLR start "rule__InitialFireSpecification__Group__5"
    // InternalGreedySnake.g:3544:1: rule__InitialFireSpecification__Group__5 : rule__InitialFireSpecification__Group__5__Impl ;
    public final void rule__InitialFireSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3548:1: ( rule__InitialFireSpecification__Group__5__Impl )
            // InternalGreedySnake.g:3549:2: rule__InitialFireSpecification__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialFireSpecification__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFireSpecification__Group__5"


    // $ANTLR start "rule__InitialFireSpecification__Group__5__Impl"
    // InternalGreedySnake.g:3555:1: rule__InitialFireSpecification__Group__5__Impl : ( ( rule__InitialFireSpecification__MultiplesAssignment_5 )? ) ;
    public final void rule__InitialFireSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3559:1: ( ( ( rule__InitialFireSpecification__MultiplesAssignment_5 )? ) )
            // InternalGreedySnake.g:3560:1: ( ( rule__InitialFireSpecification__MultiplesAssignment_5 )? )
            {
            // InternalGreedySnake.g:3560:1: ( ( rule__InitialFireSpecification__MultiplesAssignment_5 )? )
            // InternalGreedySnake.g:3561:2: ( rule__InitialFireSpecification__MultiplesAssignment_5 )?
            {
             before(grammarAccess.getInitialFireSpecificationAccess().getMultiplesAssignment_5()); 
            // InternalGreedySnake.g:3562:2: ( rule__InitialFireSpecification__MultiplesAssignment_5 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||LA13_1==RULE_ID||(LA13_1>=20 && LA13_1<=21)||LA13_1==23||(LA13_1>=40 && LA13_1<=44)||LA13_1==63||(LA13_1>=65 && LA13_1<=67)||(LA13_1>=71 && LA13_1<=72)||LA13_1==76) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalGreedySnake.g:3562:3: rule__InitialFireSpecification__MultiplesAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__InitialFireSpecification__MultiplesAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitialFireSpecificationAccess().getMultiplesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFireSpecification__Group__5__Impl"


    // $ANTLR start "rule__InitialSpeedSpecification__Group__0"
    // InternalGreedySnake.g:3571:1: rule__InitialSpeedSpecification__Group__0 : rule__InitialSpeedSpecification__Group__0__Impl rule__InitialSpeedSpecification__Group__1 ;
    public final void rule__InitialSpeedSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3575:1: ( rule__InitialSpeedSpecification__Group__0__Impl rule__InitialSpeedSpecification__Group__1 )
            // InternalGreedySnake.g:3576:2: rule__InitialSpeedSpecification__Group__0__Impl rule__InitialSpeedSpecification__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__InitialSpeedSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialSpeedSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSpeedSpecification__Group__0"


    // $ANTLR start "rule__InitialSpeedSpecification__Group__0__Impl"
    // InternalGreedySnake.g:3583:1: rule__InitialSpeedSpecification__Group__0__Impl : ( () ) ;
    public final void rule__InitialSpeedSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3587:1: ( ( () ) )
            // InternalGreedySnake.g:3588:1: ( () )
            {
            // InternalGreedySnake.g:3588:1: ( () )
            // InternalGreedySnake.g:3589:2: ()
            {
             before(grammarAccess.getInitialSpeedSpecificationAccess().getInitialSpeedSpecificationAction_0()); 
            // InternalGreedySnake.g:3590:2: ()
            // InternalGreedySnake.g:3590:3: 
            {
            }

             after(grammarAccess.getInitialSpeedSpecificationAccess().getInitialSpeedSpecificationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSpeedSpecification__Group__0__Impl"


    // $ANTLR start "rule__InitialSpeedSpecification__Group__1"
    // InternalGreedySnake.g:3598:1: rule__InitialSpeedSpecification__Group__1 : rule__InitialSpeedSpecification__Group__1__Impl rule__InitialSpeedSpecification__Group__2 ;
    public final void rule__InitialSpeedSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3602:1: ( rule__InitialSpeedSpecification__Group__1__Impl rule__InitialSpeedSpecification__Group__2 )
            // InternalGreedySnake.g:3603:2: rule__InitialSpeedSpecification__Group__1__Impl rule__InitialSpeedSpecification__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__InitialSpeedSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialSpeedSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSpeedSpecification__Group__1"


    // $ANTLR start "rule__InitialSpeedSpecification__Group__1__Impl"
    // InternalGreedySnake.g:3610:1: rule__InitialSpeedSpecification__Group__1__Impl : ( 'Speed' ) ;
    public final void rule__InitialSpeedSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3614:1: ( ( 'Speed' ) )
            // InternalGreedySnake.g:3615:1: ( 'Speed' )
            {
            // InternalGreedySnake.g:3615:1: ( 'Speed' )
            // InternalGreedySnake.g:3616:2: 'Speed'
            {
             before(grammarAccess.getInitialSpeedSpecificationAccess().getSpeedKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getInitialSpeedSpecificationAccess().getSpeedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSpeedSpecification__Group__1__Impl"


    // $ANTLR start "rule__InitialSpeedSpecification__Group__2"
    // InternalGreedySnake.g:3625:1: rule__InitialSpeedSpecification__Group__2 : rule__InitialSpeedSpecification__Group__2__Impl rule__InitialSpeedSpecification__Group__3 ;
    public final void rule__InitialSpeedSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3629:1: ( rule__InitialSpeedSpecification__Group__2__Impl rule__InitialSpeedSpecification__Group__3 )
            // InternalGreedySnake.g:3630:2: rule__InitialSpeedSpecification__Group__2__Impl rule__InitialSpeedSpecification__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__InitialSpeedSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialSpeedSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSpeedSpecification__Group__2"


    // $ANTLR start "rule__InitialSpeedSpecification__Group__2__Impl"
    // InternalGreedySnake.g:3637:1: rule__InitialSpeedSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__InitialSpeedSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3641:1: ( ( '{' ) )
            // InternalGreedySnake.g:3642:1: ( '{' )
            {
            // InternalGreedySnake.g:3642:1: ( '{' )
            // InternalGreedySnake.g:3643:2: '{'
            {
             before(grammarAccess.getInitialSpeedSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInitialSpeedSpecificationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSpeedSpecification__Group__2__Impl"


    // $ANTLR start "rule__InitialSpeedSpecification__Group__3"
    // InternalGreedySnake.g:3652:1: rule__InitialSpeedSpecification__Group__3 : rule__InitialSpeedSpecification__Group__3__Impl rule__InitialSpeedSpecification__Group__4 ;
    public final void rule__InitialSpeedSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3656:1: ( rule__InitialSpeedSpecification__Group__3__Impl rule__InitialSpeedSpecification__Group__4 )
            // InternalGreedySnake.g:3657:2: rule__InitialSpeedSpecification__Group__3__Impl rule__InitialSpeedSpecification__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__InitialSpeedSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialSpeedSpecification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSpeedSpecification__Group__3"


    // $ANTLR start "rule__InitialSpeedSpecification__Group__3__Impl"
    // InternalGreedySnake.g:3664:1: rule__InitialSpeedSpecification__Group__3__Impl : ( ( rule__InitialSpeedSpecification__SpeedGroupAssignment_3 )* ) ;
    public final void rule__InitialSpeedSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3668:1: ( ( ( rule__InitialSpeedSpecification__SpeedGroupAssignment_3 )* ) )
            // InternalGreedySnake.g:3669:1: ( ( rule__InitialSpeedSpecification__SpeedGroupAssignment_3 )* )
            {
            // InternalGreedySnake.g:3669:1: ( ( rule__InitialSpeedSpecification__SpeedGroupAssignment_3 )* )
            // InternalGreedySnake.g:3670:2: ( rule__InitialSpeedSpecification__SpeedGroupAssignment_3 )*
            {
             before(grammarAccess.getInitialSpeedSpecificationAccess().getSpeedGroupAssignment_3()); 
            // InternalGreedySnake.g:3671:2: ( rule__InitialSpeedSpecification__SpeedGroupAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGreedySnake.g:3671:3: rule__InitialSpeedSpecification__SpeedGroupAssignment_3
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__InitialSpeedSpecification__SpeedGroupAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getInitialSpeedSpecificationAccess().getSpeedGroupAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSpeedSpecification__Group__3__Impl"


    // $ANTLR start "rule__InitialSpeedSpecification__Group__4"
    // InternalGreedySnake.g:3679:1: rule__InitialSpeedSpecification__Group__4 : rule__InitialSpeedSpecification__Group__4__Impl ;
    public final void rule__InitialSpeedSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3683:1: ( rule__InitialSpeedSpecification__Group__4__Impl )
            // InternalGreedySnake.g:3684:2: rule__InitialSpeedSpecification__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialSpeedSpecification__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSpeedSpecification__Group__4"


    // $ANTLR start "rule__InitialSpeedSpecification__Group__4__Impl"
    // InternalGreedySnake.g:3690:1: rule__InitialSpeedSpecification__Group__4__Impl : ( '}' ) ;
    public final void rule__InitialSpeedSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3694:1: ( ( '}' ) )
            // InternalGreedySnake.g:3695:1: ( '}' )
            {
            // InternalGreedySnake.g:3695:1: ( '}' )
            // InternalGreedySnake.g:3696:2: '}'
            {
             before(grammarAccess.getInitialSpeedSpecificationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInitialSpeedSpecificationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSpeedSpecification__Group__4__Impl"


    // $ANTLR start "rule__SpeedGroup__Group__0"
    // InternalGreedySnake.g:3706:1: rule__SpeedGroup__Group__0 : rule__SpeedGroup__Group__0__Impl rule__SpeedGroup__Group__1 ;
    public final void rule__SpeedGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3710:1: ( rule__SpeedGroup__Group__0__Impl rule__SpeedGroup__Group__1 )
            // InternalGreedySnake.g:3711:2: rule__SpeedGroup__Group__0__Impl rule__SpeedGroup__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SpeedGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpeedGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedGroup__Group__0"


    // $ANTLR start "rule__SpeedGroup__Group__0__Impl"
    // InternalGreedySnake.g:3718:1: rule__SpeedGroup__Group__0__Impl : ( ( rule__SpeedGroup__NameAssignment_0 ) ) ;
    public final void rule__SpeedGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3722:1: ( ( ( rule__SpeedGroup__NameAssignment_0 ) ) )
            // InternalGreedySnake.g:3723:1: ( ( rule__SpeedGroup__NameAssignment_0 ) )
            {
            // InternalGreedySnake.g:3723:1: ( ( rule__SpeedGroup__NameAssignment_0 ) )
            // InternalGreedySnake.g:3724:2: ( rule__SpeedGroup__NameAssignment_0 )
            {
             before(grammarAccess.getSpeedGroupAccess().getNameAssignment_0()); 
            // InternalGreedySnake.g:3725:2: ( rule__SpeedGroup__NameAssignment_0 )
            // InternalGreedySnake.g:3725:3: rule__SpeedGroup__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SpeedGroup__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSpeedGroupAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedGroup__Group__0__Impl"


    // $ANTLR start "rule__SpeedGroup__Group__1"
    // InternalGreedySnake.g:3733:1: rule__SpeedGroup__Group__1 : rule__SpeedGroup__Group__1__Impl rule__SpeedGroup__Group__2 ;
    public final void rule__SpeedGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3737:1: ( rule__SpeedGroup__Group__1__Impl rule__SpeedGroup__Group__2 )
            // InternalGreedySnake.g:3738:2: rule__SpeedGroup__Group__1__Impl rule__SpeedGroup__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__SpeedGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpeedGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedGroup__Group__1"


    // $ANTLR start "rule__SpeedGroup__Group__1__Impl"
    // InternalGreedySnake.g:3745:1: rule__SpeedGroup__Group__1__Impl : ( '=' ) ;
    public final void rule__SpeedGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3749:1: ( ( '=' ) )
            // InternalGreedySnake.g:3750:1: ( '=' )
            {
            // InternalGreedySnake.g:3750:1: ( '=' )
            // InternalGreedySnake.g:3751:2: '='
            {
             before(grammarAccess.getSpeedGroupAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSpeedGroupAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedGroup__Group__1__Impl"


    // $ANTLR start "rule__SpeedGroup__Group__2"
    // InternalGreedySnake.g:3760:1: rule__SpeedGroup__Group__2 : rule__SpeedGroup__Group__2__Impl ;
    public final void rule__SpeedGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3764:1: ( rule__SpeedGroup__Group__2__Impl )
            // InternalGreedySnake.g:3765:2: rule__SpeedGroup__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpeedGroup__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedGroup__Group__2"


    // $ANTLR start "rule__SpeedGroup__Group__2__Impl"
    // InternalGreedySnake.g:3771:1: rule__SpeedGroup__Group__2__Impl : ( ( rule__SpeedGroup__ValueAssignment_2 ) ) ;
    public final void rule__SpeedGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3775:1: ( ( ( rule__SpeedGroup__ValueAssignment_2 ) ) )
            // InternalGreedySnake.g:3776:1: ( ( rule__SpeedGroup__ValueAssignment_2 ) )
            {
            // InternalGreedySnake.g:3776:1: ( ( rule__SpeedGroup__ValueAssignment_2 ) )
            // InternalGreedySnake.g:3777:2: ( rule__SpeedGroup__ValueAssignment_2 )
            {
             before(grammarAccess.getSpeedGroupAccess().getValueAssignment_2()); 
            // InternalGreedySnake.g:3778:2: ( rule__SpeedGroup__ValueAssignment_2 )
            // InternalGreedySnake.g:3778:3: rule__SpeedGroup__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SpeedGroup__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpeedGroupAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedGroup__Group__2__Impl"


    // $ANTLR start "rule__FireInitDisplay__Group__0"
    // InternalGreedySnake.g:3787:1: rule__FireInitDisplay__Group__0 : rule__FireInitDisplay__Group__0__Impl rule__FireInitDisplay__Group__1 ;
    public final void rule__FireInitDisplay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3791:1: ( rule__FireInitDisplay__Group__0__Impl rule__FireInitDisplay__Group__1 )
            // InternalGreedySnake.g:3792:2: rule__FireInitDisplay__Group__0__Impl rule__FireInitDisplay__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FireInitDisplay__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FireInitDisplay__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireInitDisplay__Group__0"


    // $ANTLR start "rule__FireInitDisplay__Group__0__Impl"
    // InternalGreedySnake.g:3799:1: rule__FireInitDisplay__Group__0__Impl : ( 'FireIcon' ) ;
    public final void rule__FireInitDisplay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3803:1: ( ( 'FireIcon' ) )
            // InternalGreedySnake.g:3804:1: ( 'FireIcon' )
            {
            // InternalGreedySnake.g:3804:1: ( 'FireIcon' )
            // InternalGreedySnake.g:3805:2: 'FireIcon'
            {
             before(grammarAccess.getFireInitDisplayAccess().getFireIconKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFireInitDisplayAccess().getFireIconKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireInitDisplay__Group__0__Impl"


    // $ANTLR start "rule__FireInitDisplay__Group__1"
    // InternalGreedySnake.g:3814:1: rule__FireInitDisplay__Group__1 : rule__FireInitDisplay__Group__1__Impl rule__FireInitDisplay__Group__2 ;
    public final void rule__FireInitDisplay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3818:1: ( rule__FireInitDisplay__Group__1__Impl rule__FireInitDisplay__Group__2 )
            // InternalGreedySnake.g:3819:2: rule__FireInitDisplay__Group__1__Impl rule__FireInitDisplay__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__FireInitDisplay__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FireInitDisplay__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireInitDisplay__Group__1"


    // $ANTLR start "rule__FireInitDisplay__Group__1__Impl"
    // InternalGreedySnake.g:3826:1: rule__FireInitDisplay__Group__1__Impl : ( '{' ) ;
    public final void rule__FireInitDisplay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3830:1: ( ( '{' ) )
            // InternalGreedySnake.g:3831:1: ( '{' )
            {
            // InternalGreedySnake.g:3831:1: ( '{' )
            // InternalGreedySnake.g:3832:2: '{'
            {
             before(grammarAccess.getFireInitDisplayAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFireInitDisplayAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireInitDisplay__Group__1__Impl"


    // $ANTLR start "rule__FireInitDisplay__Group__2"
    // InternalGreedySnake.g:3841:1: rule__FireInitDisplay__Group__2 : rule__FireInitDisplay__Group__2__Impl rule__FireInitDisplay__Group__3 ;
    public final void rule__FireInitDisplay__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3845:1: ( rule__FireInitDisplay__Group__2__Impl rule__FireInitDisplay__Group__3 )
            // InternalGreedySnake.g:3846:2: rule__FireInitDisplay__Group__2__Impl rule__FireInitDisplay__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__FireInitDisplay__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FireInitDisplay__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireInitDisplay__Group__2"


    // $ANTLR start "rule__FireInitDisplay__Group__2__Impl"
    // InternalGreedySnake.g:3853:1: rule__FireInitDisplay__Group__2__Impl : ( ( rule__FireInitDisplay__FireIconAssignment_2 )* ) ;
    public final void rule__FireInitDisplay__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3857:1: ( ( ( rule__FireInitDisplay__FireIconAssignment_2 )* ) )
            // InternalGreedySnake.g:3858:1: ( ( rule__FireInitDisplay__FireIconAssignment_2 )* )
            {
            // InternalGreedySnake.g:3858:1: ( ( rule__FireInitDisplay__FireIconAssignment_2 )* )
            // InternalGreedySnake.g:3859:2: ( rule__FireInitDisplay__FireIconAssignment_2 )*
            {
             before(grammarAccess.getFireInitDisplayAccess().getFireIconAssignment_2()); 
            // InternalGreedySnake.g:3860:2: ( rule__FireInitDisplay__FireIconAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGreedySnake.g:3860:3: rule__FireInitDisplay__FireIconAssignment_2
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__FireInitDisplay__FireIconAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getFireInitDisplayAccess().getFireIconAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireInitDisplay__Group__2__Impl"


    // $ANTLR start "rule__FireInitDisplay__Group__3"
    // InternalGreedySnake.g:3868:1: rule__FireInitDisplay__Group__3 : rule__FireInitDisplay__Group__3__Impl rule__FireInitDisplay__Group__4 ;
    public final void rule__FireInitDisplay__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3872:1: ( rule__FireInitDisplay__Group__3__Impl rule__FireInitDisplay__Group__4 )
            // InternalGreedySnake.g:3873:2: rule__FireInitDisplay__Group__3__Impl rule__FireInitDisplay__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__FireInitDisplay__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FireInitDisplay__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireInitDisplay__Group__3"


    // $ANTLR start "rule__FireInitDisplay__Group__3__Impl"
    // InternalGreedySnake.g:3880:1: rule__FireInitDisplay__Group__3__Impl : ( '}' ) ;
    public final void rule__FireInitDisplay__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3884:1: ( ( '}' ) )
            // InternalGreedySnake.g:3885:1: ( '}' )
            {
            // InternalGreedySnake.g:3885:1: ( '}' )
            // InternalGreedySnake.g:3886:2: '}'
            {
             before(grammarAccess.getFireInitDisplayAccess().getRightCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFireInitDisplayAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireInitDisplay__Group__3__Impl"


    // $ANTLR start "rule__FireInitDisplay__Group__4"
    // InternalGreedySnake.g:3895:1: rule__FireInitDisplay__Group__4 : rule__FireInitDisplay__Group__4__Impl rule__FireInitDisplay__Group__5 ;
    public final void rule__FireInitDisplay__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3899:1: ( rule__FireInitDisplay__Group__4__Impl rule__FireInitDisplay__Group__5 )
            // InternalGreedySnake.g:3900:2: rule__FireInitDisplay__Group__4__Impl rule__FireInitDisplay__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__FireInitDisplay__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FireInitDisplay__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireInitDisplay__Group__4"


    // $ANTLR start "rule__FireInitDisplay__Group__4__Impl"
    // InternalGreedySnake.g:3907:1: rule__FireInitDisplay__Group__4__Impl : ( 'Icon_size' ) ;
    public final void rule__FireInitDisplay__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3911:1: ( ( 'Icon_size' ) )
            // InternalGreedySnake.g:3912:1: ( 'Icon_size' )
            {
            // InternalGreedySnake.g:3912:1: ( 'Icon_size' )
            // InternalGreedySnake.g:3913:2: 'Icon_size'
            {
             before(grammarAccess.getFireInitDisplayAccess().getIcon_sizeKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getFireInitDisplayAccess().getIcon_sizeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireInitDisplay__Group__4__Impl"


    // $ANTLR start "rule__FireInitDisplay__Group__5"
    // InternalGreedySnake.g:3922:1: rule__FireInitDisplay__Group__5 : rule__FireInitDisplay__Group__5__Impl rule__FireInitDisplay__Group__6 ;
    public final void rule__FireInitDisplay__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3926:1: ( rule__FireInitDisplay__Group__5__Impl rule__FireInitDisplay__Group__6 )
            // InternalGreedySnake.g:3927:2: rule__FireInitDisplay__Group__5__Impl rule__FireInitDisplay__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__FireInitDisplay__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FireInitDisplay__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireInitDisplay__Group__5"


    // $ANTLR start "rule__FireInitDisplay__Group__5__Impl"
    // InternalGreedySnake.g:3934:1: rule__FireInitDisplay__Group__5__Impl : ( '=' ) ;
    public final void rule__FireInitDisplay__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3938:1: ( ( '=' ) )
            // InternalGreedySnake.g:3939:1: ( '=' )
            {
            // InternalGreedySnake.g:3939:1: ( '=' )
            // InternalGreedySnake.g:3940:2: '='
            {
             before(grammarAccess.getFireInitDisplayAccess().getEqualsSignKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFireInitDisplayAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireInitDisplay__Group__5__Impl"


    // $ANTLR start "rule__FireInitDisplay__Group__6"
    // InternalGreedySnake.g:3949:1: rule__FireInitDisplay__Group__6 : rule__FireInitDisplay__Group__6__Impl ;
    public final void rule__FireInitDisplay__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3953:1: ( rule__FireInitDisplay__Group__6__Impl )
            // InternalGreedySnake.g:3954:2: rule__FireInitDisplay__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FireInitDisplay__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireInitDisplay__Group__6"


    // $ANTLR start "rule__FireInitDisplay__Group__6__Impl"
    // InternalGreedySnake.g:3960:1: rule__FireInitDisplay__Group__6__Impl : ( ( rule__FireInitDisplay__IconsizeAssignment_6 ) ) ;
    public final void rule__FireInitDisplay__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3964:1: ( ( ( rule__FireInitDisplay__IconsizeAssignment_6 ) ) )
            // InternalGreedySnake.g:3965:1: ( ( rule__FireInitDisplay__IconsizeAssignment_6 ) )
            {
            // InternalGreedySnake.g:3965:1: ( ( rule__FireInitDisplay__IconsizeAssignment_6 ) )
            // InternalGreedySnake.g:3966:2: ( rule__FireInitDisplay__IconsizeAssignment_6 )
            {
             before(grammarAccess.getFireInitDisplayAccess().getIconsizeAssignment_6()); 
            // InternalGreedySnake.g:3967:2: ( rule__FireInitDisplay__IconsizeAssignment_6 )
            // InternalGreedySnake.g:3967:3: rule__FireInitDisplay__IconsizeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__FireInitDisplay__IconsizeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFireInitDisplayAccess().getIconsizeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireInitDisplay__Group__6__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__0"
    // InternalGreedySnake.g:3976:1: rule__SnakeInitDisplay__Group__0 : rule__SnakeInitDisplay__Group__0__Impl rule__SnakeInitDisplay__Group__1 ;
    public final void rule__SnakeInitDisplay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3980:1: ( rule__SnakeInitDisplay__Group__0__Impl rule__SnakeInitDisplay__Group__1 )
            // InternalGreedySnake.g:3981:2: rule__SnakeInitDisplay__Group__0__Impl rule__SnakeInitDisplay__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SnakeInitDisplay__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__0"


    // $ANTLR start "rule__SnakeInitDisplay__Group__0__Impl"
    // InternalGreedySnake.g:3988:1: rule__SnakeInitDisplay__Group__0__Impl : ( 'head' ) ;
    public final void rule__SnakeInitDisplay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3992:1: ( ( 'head' ) )
            // InternalGreedySnake.g:3993:1: ( 'head' )
            {
            // InternalGreedySnake.g:3993:1: ( 'head' )
            // InternalGreedySnake.g:3994:2: 'head'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getHeadKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getHeadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__0__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__1"
    // InternalGreedySnake.g:4003:1: rule__SnakeInitDisplay__Group__1 : rule__SnakeInitDisplay__Group__1__Impl rule__SnakeInitDisplay__Group__2 ;
    public final void rule__SnakeInitDisplay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4007:1: ( rule__SnakeInitDisplay__Group__1__Impl rule__SnakeInitDisplay__Group__2 )
            // InternalGreedySnake.g:4008:2: rule__SnakeInitDisplay__Group__1__Impl rule__SnakeInitDisplay__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__SnakeInitDisplay__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__1"


    // $ANTLR start "rule__SnakeInitDisplay__Group__1__Impl"
    // InternalGreedySnake.g:4015:1: rule__SnakeInitDisplay__Group__1__Impl : ( '=' ) ;
    public final void rule__SnakeInitDisplay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4019:1: ( ( '=' ) )
            // InternalGreedySnake.g:4020:1: ( '=' )
            {
            // InternalGreedySnake.g:4020:1: ( '=' )
            // InternalGreedySnake.g:4021:2: '='
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__1__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__2"
    // InternalGreedySnake.g:4030:1: rule__SnakeInitDisplay__Group__2 : rule__SnakeInitDisplay__Group__2__Impl rule__SnakeInitDisplay__Group__3 ;
    public final void rule__SnakeInitDisplay__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4034:1: ( rule__SnakeInitDisplay__Group__2__Impl rule__SnakeInitDisplay__Group__3 )
            // InternalGreedySnake.g:4035:2: rule__SnakeInitDisplay__Group__2__Impl rule__SnakeInitDisplay__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__SnakeInitDisplay__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__2"


    // $ANTLR start "rule__SnakeInitDisplay__Group__2__Impl"
    // InternalGreedySnake.g:4042:1: rule__SnakeInitDisplay__Group__2__Impl : ( ( rule__SnakeInitDisplay__HeadAssignment_2 ) ) ;
    public final void rule__SnakeInitDisplay__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4046:1: ( ( ( rule__SnakeInitDisplay__HeadAssignment_2 ) ) )
            // InternalGreedySnake.g:4047:1: ( ( rule__SnakeInitDisplay__HeadAssignment_2 ) )
            {
            // InternalGreedySnake.g:4047:1: ( ( rule__SnakeInitDisplay__HeadAssignment_2 ) )
            // InternalGreedySnake.g:4048:2: ( rule__SnakeInitDisplay__HeadAssignment_2 )
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getHeadAssignment_2()); 
            // InternalGreedySnake.g:4049:2: ( rule__SnakeInitDisplay__HeadAssignment_2 )
            // InternalGreedySnake.g:4049:3: rule__SnakeInitDisplay__HeadAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__HeadAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSnakeInitDisplayAccess().getHeadAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__2__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__3"
    // InternalGreedySnake.g:4057:1: rule__SnakeInitDisplay__Group__3 : rule__SnakeInitDisplay__Group__3__Impl rule__SnakeInitDisplay__Group__4 ;
    public final void rule__SnakeInitDisplay__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4061:1: ( rule__SnakeInitDisplay__Group__3__Impl rule__SnakeInitDisplay__Group__4 )
            // InternalGreedySnake.g:4062:2: rule__SnakeInitDisplay__Group__3__Impl rule__SnakeInitDisplay__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__SnakeInitDisplay__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__3"


    // $ANTLR start "rule__SnakeInitDisplay__Group__3__Impl"
    // InternalGreedySnake.g:4069:1: rule__SnakeInitDisplay__Group__3__Impl : ( ( rule__SnakeInitDisplay__Initial_xAssignment_3 ) ) ;
    public final void rule__SnakeInitDisplay__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4073:1: ( ( ( rule__SnakeInitDisplay__Initial_xAssignment_3 ) ) )
            // InternalGreedySnake.g:4074:1: ( ( rule__SnakeInitDisplay__Initial_xAssignment_3 ) )
            {
            // InternalGreedySnake.g:4074:1: ( ( rule__SnakeInitDisplay__Initial_xAssignment_3 ) )
            // InternalGreedySnake.g:4075:2: ( rule__SnakeInitDisplay__Initial_xAssignment_3 )
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getInitial_xAssignment_3()); 
            // InternalGreedySnake.g:4076:2: ( rule__SnakeInitDisplay__Initial_xAssignment_3 )
            // InternalGreedySnake.g:4076:3: rule__SnakeInitDisplay__Initial_xAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Initial_xAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSnakeInitDisplayAccess().getInitial_xAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__3__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__4"
    // InternalGreedySnake.g:4084:1: rule__SnakeInitDisplay__Group__4 : rule__SnakeInitDisplay__Group__4__Impl rule__SnakeInitDisplay__Group__5 ;
    public final void rule__SnakeInitDisplay__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4088:1: ( rule__SnakeInitDisplay__Group__4__Impl rule__SnakeInitDisplay__Group__5 )
            // InternalGreedySnake.g:4089:2: rule__SnakeInitDisplay__Group__4__Impl rule__SnakeInitDisplay__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__SnakeInitDisplay__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__4"


    // $ANTLR start "rule__SnakeInitDisplay__Group__4__Impl"
    // InternalGreedySnake.g:4096:1: rule__SnakeInitDisplay__Group__4__Impl : ( ',' ) ;
    public final void rule__SnakeInitDisplay__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4100:1: ( ( ',' ) )
            // InternalGreedySnake.g:4101:1: ( ',' )
            {
            // InternalGreedySnake.g:4101:1: ( ',' )
            // InternalGreedySnake.g:4102:2: ','
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getCommaKeyword_4()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__4__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__5"
    // InternalGreedySnake.g:4111:1: rule__SnakeInitDisplay__Group__5 : rule__SnakeInitDisplay__Group__5__Impl rule__SnakeInitDisplay__Group__6 ;
    public final void rule__SnakeInitDisplay__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4115:1: ( rule__SnakeInitDisplay__Group__5__Impl rule__SnakeInitDisplay__Group__6 )
            // InternalGreedySnake.g:4116:2: rule__SnakeInitDisplay__Group__5__Impl rule__SnakeInitDisplay__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__SnakeInitDisplay__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__5"


    // $ANTLR start "rule__SnakeInitDisplay__Group__5__Impl"
    // InternalGreedySnake.g:4123:1: rule__SnakeInitDisplay__Group__5__Impl : ( ( rule__SnakeInitDisplay__Initial_yAssignment_5 ) ) ;
    public final void rule__SnakeInitDisplay__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4127:1: ( ( ( rule__SnakeInitDisplay__Initial_yAssignment_5 ) ) )
            // InternalGreedySnake.g:4128:1: ( ( rule__SnakeInitDisplay__Initial_yAssignment_5 ) )
            {
            // InternalGreedySnake.g:4128:1: ( ( rule__SnakeInitDisplay__Initial_yAssignment_5 ) )
            // InternalGreedySnake.g:4129:2: ( rule__SnakeInitDisplay__Initial_yAssignment_5 )
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getInitial_yAssignment_5()); 
            // InternalGreedySnake.g:4130:2: ( rule__SnakeInitDisplay__Initial_yAssignment_5 )
            // InternalGreedySnake.g:4130:3: rule__SnakeInitDisplay__Initial_yAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Initial_yAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSnakeInitDisplayAccess().getInitial_yAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__5__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__6"
    // InternalGreedySnake.g:4138:1: rule__SnakeInitDisplay__Group__6 : rule__SnakeInitDisplay__Group__6__Impl rule__SnakeInitDisplay__Group__7 ;
    public final void rule__SnakeInitDisplay__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4142:1: ( rule__SnakeInitDisplay__Group__6__Impl rule__SnakeInitDisplay__Group__7 )
            // InternalGreedySnake.g:4143:2: rule__SnakeInitDisplay__Group__6__Impl rule__SnakeInitDisplay__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__SnakeInitDisplay__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__6"


    // $ANTLR start "rule__SnakeInitDisplay__Group__6__Impl"
    // InternalGreedySnake.g:4150:1: rule__SnakeInitDisplay__Group__6__Impl : ( ')' ) ;
    public final void rule__SnakeInitDisplay__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4154:1: ( ( ')' ) )
            // InternalGreedySnake.g:4155:1: ( ')' )
            {
            // InternalGreedySnake.g:4155:1: ( ')' )
            // InternalGreedySnake.g:4156:2: ')'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getRightParenthesisKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__6__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__7"
    // InternalGreedySnake.g:4165:1: rule__SnakeInitDisplay__Group__7 : rule__SnakeInitDisplay__Group__7__Impl rule__SnakeInitDisplay__Group__8 ;
    public final void rule__SnakeInitDisplay__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4169:1: ( rule__SnakeInitDisplay__Group__7__Impl rule__SnakeInitDisplay__Group__8 )
            // InternalGreedySnake.g:4170:2: rule__SnakeInitDisplay__Group__7__Impl rule__SnakeInitDisplay__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__SnakeInitDisplay__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__7"


    // $ANTLR start "rule__SnakeInitDisplay__Group__7__Impl"
    // InternalGreedySnake.g:4177:1: rule__SnakeInitDisplay__Group__7__Impl : ( 'headIcon' ) ;
    public final void rule__SnakeInitDisplay__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4181:1: ( ( 'headIcon' ) )
            // InternalGreedySnake.g:4182:1: ( 'headIcon' )
            {
            // InternalGreedySnake.g:4182:1: ( 'headIcon' )
            // InternalGreedySnake.g:4183:2: 'headIcon'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getHeadIconKeyword_7()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getHeadIconKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__7__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__8"
    // InternalGreedySnake.g:4192:1: rule__SnakeInitDisplay__Group__8 : rule__SnakeInitDisplay__Group__8__Impl rule__SnakeInitDisplay__Group__9 ;
    public final void rule__SnakeInitDisplay__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4196:1: ( rule__SnakeInitDisplay__Group__8__Impl rule__SnakeInitDisplay__Group__9 )
            // InternalGreedySnake.g:4197:2: rule__SnakeInitDisplay__Group__8__Impl rule__SnakeInitDisplay__Group__9
            {
            pushFollow(FOLLOW_32);
            rule__SnakeInitDisplay__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__8"


    // $ANTLR start "rule__SnakeInitDisplay__Group__8__Impl"
    // InternalGreedySnake.g:4204:1: rule__SnakeInitDisplay__Group__8__Impl : ( '{' ) ;
    public final void rule__SnakeInitDisplay__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4208:1: ( ( '{' ) )
            // InternalGreedySnake.g:4209:1: ( '{' )
            {
            // InternalGreedySnake.g:4209:1: ( '{' )
            // InternalGreedySnake.g:4210:2: '{'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__8__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__9"
    // InternalGreedySnake.g:4219:1: rule__SnakeInitDisplay__Group__9 : rule__SnakeInitDisplay__Group__9__Impl rule__SnakeInitDisplay__Group__10 ;
    public final void rule__SnakeInitDisplay__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4223:1: ( rule__SnakeInitDisplay__Group__9__Impl rule__SnakeInitDisplay__Group__10 )
            // InternalGreedySnake.g:4224:2: rule__SnakeInitDisplay__Group__9__Impl rule__SnakeInitDisplay__Group__10
            {
            pushFollow(FOLLOW_32);
            rule__SnakeInitDisplay__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__9"


    // $ANTLR start "rule__SnakeInitDisplay__Group__9__Impl"
    // InternalGreedySnake.g:4231:1: rule__SnakeInitDisplay__Group__9__Impl : ( ( rule__SnakeInitDisplay__HeadIconAssignment_9 )* ) ;
    public final void rule__SnakeInitDisplay__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4235:1: ( ( ( rule__SnakeInitDisplay__HeadIconAssignment_9 )* ) )
            // InternalGreedySnake.g:4236:1: ( ( rule__SnakeInitDisplay__HeadIconAssignment_9 )* )
            {
            // InternalGreedySnake.g:4236:1: ( ( rule__SnakeInitDisplay__HeadIconAssignment_9 )* )
            // InternalGreedySnake.g:4237:2: ( rule__SnakeInitDisplay__HeadIconAssignment_9 )*
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getHeadIconAssignment_9()); 
            // InternalGreedySnake.g:4238:2: ( rule__SnakeInitDisplay__HeadIconAssignment_9 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGreedySnake.g:4238:3: rule__SnakeInitDisplay__HeadIconAssignment_9
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__SnakeInitDisplay__HeadIconAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSnakeInitDisplayAccess().getHeadIconAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__9__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__10"
    // InternalGreedySnake.g:4246:1: rule__SnakeInitDisplay__Group__10 : rule__SnakeInitDisplay__Group__10__Impl rule__SnakeInitDisplay__Group__11 ;
    public final void rule__SnakeInitDisplay__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4250:1: ( rule__SnakeInitDisplay__Group__10__Impl rule__SnakeInitDisplay__Group__11 )
            // InternalGreedySnake.g:4251:2: rule__SnakeInitDisplay__Group__10__Impl rule__SnakeInitDisplay__Group__11
            {
            pushFollow(FOLLOW_34);
            rule__SnakeInitDisplay__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__10"


    // $ANTLR start "rule__SnakeInitDisplay__Group__10__Impl"
    // InternalGreedySnake.g:4258:1: rule__SnakeInitDisplay__Group__10__Impl : ( '}' ) ;
    public final void rule__SnakeInitDisplay__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4262:1: ( ( '}' ) )
            // InternalGreedySnake.g:4263:1: ( '}' )
            {
            // InternalGreedySnake.g:4263:1: ( '}' )
            // InternalGreedySnake.g:4264:2: '}'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getRightCurlyBracketKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__10__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__11"
    // InternalGreedySnake.g:4273:1: rule__SnakeInitDisplay__Group__11 : rule__SnakeInitDisplay__Group__11__Impl rule__SnakeInitDisplay__Group__12 ;
    public final void rule__SnakeInitDisplay__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4277:1: ( rule__SnakeInitDisplay__Group__11__Impl rule__SnakeInitDisplay__Group__12 )
            // InternalGreedySnake.g:4278:2: rule__SnakeInitDisplay__Group__11__Impl rule__SnakeInitDisplay__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__SnakeInitDisplay__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__11"


    // $ANTLR start "rule__SnakeInitDisplay__Group__11__Impl"
    // InternalGreedySnake.g:4285:1: rule__SnakeInitDisplay__Group__11__Impl : ( 'Icon_size' ) ;
    public final void rule__SnakeInitDisplay__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4289:1: ( ( 'Icon_size' ) )
            // InternalGreedySnake.g:4290:1: ( 'Icon_size' )
            {
            // InternalGreedySnake.g:4290:1: ( 'Icon_size' )
            // InternalGreedySnake.g:4291:2: 'Icon_size'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getIcon_sizeKeyword_11()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getIcon_sizeKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__11__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__12"
    // InternalGreedySnake.g:4300:1: rule__SnakeInitDisplay__Group__12 : rule__SnakeInitDisplay__Group__12__Impl rule__SnakeInitDisplay__Group__13 ;
    public final void rule__SnakeInitDisplay__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4304:1: ( rule__SnakeInitDisplay__Group__12__Impl rule__SnakeInitDisplay__Group__13 )
            // InternalGreedySnake.g:4305:2: rule__SnakeInitDisplay__Group__12__Impl rule__SnakeInitDisplay__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__SnakeInitDisplay__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__12"


    // $ANTLR start "rule__SnakeInitDisplay__Group__12__Impl"
    // InternalGreedySnake.g:4312:1: rule__SnakeInitDisplay__Group__12__Impl : ( '=' ) ;
    public final void rule__SnakeInitDisplay__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4316:1: ( ( '=' ) )
            // InternalGreedySnake.g:4317:1: ( '=' )
            {
            // InternalGreedySnake.g:4317:1: ( '=' )
            // InternalGreedySnake.g:4318:2: '='
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_12()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__12__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__13"
    // InternalGreedySnake.g:4327:1: rule__SnakeInitDisplay__Group__13 : rule__SnakeInitDisplay__Group__13__Impl rule__SnakeInitDisplay__Group__14 ;
    public final void rule__SnakeInitDisplay__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4331:1: ( rule__SnakeInitDisplay__Group__13__Impl rule__SnakeInitDisplay__Group__14 )
            // InternalGreedySnake.g:4332:2: rule__SnakeInitDisplay__Group__13__Impl rule__SnakeInitDisplay__Group__14
            {
            pushFollow(FOLLOW_37);
            rule__SnakeInitDisplay__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__13"


    // $ANTLR start "rule__SnakeInitDisplay__Group__13__Impl"
    // InternalGreedySnake.g:4339:1: rule__SnakeInitDisplay__Group__13__Impl : ( ( rule__SnakeInitDisplay__IconsizeAssignment_13 ) ) ;
    public final void rule__SnakeInitDisplay__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4343:1: ( ( ( rule__SnakeInitDisplay__IconsizeAssignment_13 ) ) )
            // InternalGreedySnake.g:4344:1: ( ( rule__SnakeInitDisplay__IconsizeAssignment_13 ) )
            {
            // InternalGreedySnake.g:4344:1: ( ( rule__SnakeInitDisplay__IconsizeAssignment_13 ) )
            // InternalGreedySnake.g:4345:2: ( rule__SnakeInitDisplay__IconsizeAssignment_13 )
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getIconsizeAssignment_13()); 
            // InternalGreedySnake.g:4346:2: ( rule__SnakeInitDisplay__IconsizeAssignment_13 )
            // InternalGreedySnake.g:4346:3: rule__SnakeInitDisplay__IconsizeAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__IconsizeAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getSnakeInitDisplayAccess().getIconsizeAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__13__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__14"
    // InternalGreedySnake.g:4354:1: rule__SnakeInitDisplay__Group__14 : rule__SnakeInitDisplay__Group__14__Impl rule__SnakeInitDisplay__Group__15 ;
    public final void rule__SnakeInitDisplay__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4358:1: ( rule__SnakeInitDisplay__Group__14__Impl rule__SnakeInitDisplay__Group__15 )
            // InternalGreedySnake.g:4359:2: rule__SnakeInitDisplay__Group__14__Impl rule__SnakeInitDisplay__Group__15
            {
            pushFollow(FOLLOW_4);
            rule__SnakeInitDisplay__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__14"


    // $ANTLR start "rule__SnakeInitDisplay__Group__14__Impl"
    // InternalGreedySnake.g:4366:1: rule__SnakeInitDisplay__Group__14__Impl : ( 'BodyIcon' ) ;
    public final void rule__SnakeInitDisplay__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4370:1: ( ( 'BodyIcon' ) )
            // InternalGreedySnake.g:4371:1: ( 'BodyIcon' )
            {
            // InternalGreedySnake.g:4371:1: ( 'BodyIcon' )
            // InternalGreedySnake.g:4372:2: 'BodyIcon'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getBodyIconKeyword_14()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getBodyIconKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__14__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__15"
    // InternalGreedySnake.g:4381:1: rule__SnakeInitDisplay__Group__15 : rule__SnakeInitDisplay__Group__15__Impl rule__SnakeInitDisplay__Group__16 ;
    public final void rule__SnakeInitDisplay__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4385:1: ( rule__SnakeInitDisplay__Group__15__Impl rule__SnakeInitDisplay__Group__16 )
            // InternalGreedySnake.g:4386:2: rule__SnakeInitDisplay__Group__15__Impl rule__SnakeInitDisplay__Group__16
            {
            pushFollow(FOLLOW_32);
            rule__SnakeInitDisplay__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__15"


    // $ANTLR start "rule__SnakeInitDisplay__Group__15__Impl"
    // InternalGreedySnake.g:4393:1: rule__SnakeInitDisplay__Group__15__Impl : ( '{' ) ;
    public final void rule__SnakeInitDisplay__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4397:1: ( ( '{' ) )
            // InternalGreedySnake.g:4398:1: ( '{' )
            {
            // InternalGreedySnake.g:4398:1: ( '{' )
            // InternalGreedySnake.g:4399:2: '{'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getLeftCurlyBracketKeyword_15()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getLeftCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__15__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__16"
    // InternalGreedySnake.g:4408:1: rule__SnakeInitDisplay__Group__16 : rule__SnakeInitDisplay__Group__16__Impl rule__SnakeInitDisplay__Group__17 ;
    public final void rule__SnakeInitDisplay__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4412:1: ( rule__SnakeInitDisplay__Group__16__Impl rule__SnakeInitDisplay__Group__17 )
            // InternalGreedySnake.g:4413:2: rule__SnakeInitDisplay__Group__16__Impl rule__SnakeInitDisplay__Group__17
            {
            pushFollow(FOLLOW_32);
            rule__SnakeInitDisplay__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__16"


    // $ANTLR start "rule__SnakeInitDisplay__Group__16__Impl"
    // InternalGreedySnake.g:4420:1: rule__SnakeInitDisplay__Group__16__Impl : ( ( rule__SnakeInitDisplay__BodyIconAssignment_16 )* ) ;
    public final void rule__SnakeInitDisplay__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4424:1: ( ( ( rule__SnakeInitDisplay__BodyIconAssignment_16 )* ) )
            // InternalGreedySnake.g:4425:1: ( ( rule__SnakeInitDisplay__BodyIconAssignment_16 )* )
            {
            // InternalGreedySnake.g:4425:1: ( ( rule__SnakeInitDisplay__BodyIconAssignment_16 )* )
            // InternalGreedySnake.g:4426:2: ( rule__SnakeInitDisplay__BodyIconAssignment_16 )*
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getBodyIconAssignment_16()); 
            // InternalGreedySnake.g:4427:2: ( rule__SnakeInitDisplay__BodyIconAssignment_16 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGreedySnake.g:4427:3: rule__SnakeInitDisplay__BodyIconAssignment_16
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__SnakeInitDisplay__BodyIconAssignment_16();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSnakeInitDisplayAccess().getBodyIconAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__16__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__17"
    // InternalGreedySnake.g:4435:1: rule__SnakeInitDisplay__Group__17 : rule__SnakeInitDisplay__Group__17__Impl rule__SnakeInitDisplay__Group__18 ;
    public final void rule__SnakeInitDisplay__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4439:1: ( rule__SnakeInitDisplay__Group__17__Impl rule__SnakeInitDisplay__Group__18 )
            // InternalGreedySnake.g:4440:2: rule__SnakeInitDisplay__Group__17__Impl rule__SnakeInitDisplay__Group__18
            {
            pushFollow(FOLLOW_38);
            rule__SnakeInitDisplay__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__17"


    // $ANTLR start "rule__SnakeInitDisplay__Group__17__Impl"
    // InternalGreedySnake.g:4447:1: rule__SnakeInitDisplay__Group__17__Impl : ( '}' ) ;
    public final void rule__SnakeInitDisplay__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4451:1: ( ( '}' ) )
            // InternalGreedySnake.g:4452:1: ( '}' )
            {
            // InternalGreedySnake.g:4452:1: ( '}' )
            // InternalGreedySnake.g:4453:2: '}'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getRightCurlyBracketKeyword_17()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__17__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__18"
    // InternalGreedySnake.g:4462:1: rule__SnakeInitDisplay__Group__18 : rule__SnakeInitDisplay__Group__18__Impl rule__SnakeInitDisplay__Group__19 ;
    public final void rule__SnakeInitDisplay__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4466:1: ( rule__SnakeInitDisplay__Group__18__Impl rule__SnakeInitDisplay__Group__19 )
            // InternalGreedySnake.g:4467:2: rule__SnakeInitDisplay__Group__18__Impl rule__SnakeInitDisplay__Group__19
            {
            pushFollow(FOLLOW_8);
            rule__SnakeInitDisplay__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__18"


    // $ANTLR start "rule__SnakeInitDisplay__Group__18__Impl"
    // InternalGreedySnake.g:4474:1: rule__SnakeInitDisplay__Group__18__Impl : ( 'defaultSpeed' ) ;
    public final void rule__SnakeInitDisplay__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4478:1: ( ( 'defaultSpeed' ) )
            // InternalGreedySnake.g:4479:1: ( 'defaultSpeed' )
            {
            // InternalGreedySnake.g:4479:1: ( 'defaultSpeed' )
            // InternalGreedySnake.g:4480:2: 'defaultSpeed'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getDefaultSpeedKeyword_18()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getDefaultSpeedKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__18__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__19"
    // InternalGreedySnake.g:4489:1: rule__SnakeInitDisplay__Group__19 : rule__SnakeInitDisplay__Group__19__Impl rule__SnakeInitDisplay__Group__20 ;
    public final void rule__SnakeInitDisplay__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4493:1: ( rule__SnakeInitDisplay__Group__19__Impl rule__SnakeInitDisplay__Group__20 )
            // InternalGreedySnake.g:4494:2: rule__SnakeInitDisplay__Group__19__Impl rule__SnakeInitDisplay__Group__20
            {
            pushFollow(FOLLOW_11);
            rule__SnakeInitDisplay__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__19"


    // $ANTLR start "rule__SnakeInitDisplay__Group__19__Impl"
    // InternalGreedySnake.g:4501:1: rule__SnakeInitDisplay__Group__19__Impl : ( '=' ) ;
    public final void rule__SnakeInitDisplay__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4505:1: ( ( '=' ) )
            // InternalGreedySnake.g:4506:1: ( '=' )
            {
            // InternalGreedySnake.g:4506:1: ( '=' )
            // InternalGreedySnake.g:4507:2: '='
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_19()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__19__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__20"
    // InternalGreedySnake.g:4516:1: rule__SnakeInitDisplay__Group__20 : rule__SnakeInitDisplay__Group__20__Impl rule__SnakeInitDisplay__Group__21 ;
    public final void rule__SnakeInitDisplay__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4520:1: ( rule__SnakeInitDisplay__Group__20__Impl rule__SnakeInitDisplay__Group__21 )
            // InternalGreedySnake.g:4521:2: rule__SnakeInitDisplay__Group__20__Impl rule__SnakeInitDisplay__Group__21
            {
            pushFollow(FOLLOW_39);
            rule__SnakeInitDisplay__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__20"


    // $ANTLR start "rule__SnakeInitDisplay__Group__20__Impl"
    // InternalGreedySnake.g:4528:1: rule__SnakeInitDisplay__Group__20__Impl : ( ( rule__SnakeInitDisplay__DefaultSpeedAssignment_20 ) ) ;
    public final void rule__SnakeInitDisplay__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4532:1: ( ( ( rule__SnakeInitDisplay__DefaultSpeedAssignment_20 ) ) )
            // InternalGreedySnake.g:4533:1: ( ( rule__SnakeInitDisplay__DefaultSpeedAssignment_20 ) )
            {
            // InternalGreedySnake.g:4533:1: ( ( rule__SnakeInitDisplay__DefaultSpeedAssignment_20 ) )
            // InternalGreedySnake.g:4534:2: ( rule__SnakeInitDisplay__DefaultSpeedAssignment_20 )
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getDefaultSpeedAssignment_20()); 
            // InternalGreedySnake.g:4535:2: ( rule__SnakeInitDisplay__DefaultSpeedAssignment_20 )
            // InternalGreedySnake.g:4535:3: rule__SnakeInitDisplay__DefaultSpeedAssignment_20
            {
            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__DefaultSpeedAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getSnakeInitDisplayAccess().getDefaultSpeedAssignment_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__20__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__21"
    // InternalGreedySnake.g:4543:1: rule__SnakeInitDisplay__Group__21 : rule__SnakeInitDisplay__Group__21__Impl rule__SnakeInitDisplay__Group__22 ;
    public final void rule__SnakeInitDisplay__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4547:1: ( rule__SnakeInitDisplay__Group__21__Impl rule__SnakeInitDisplay__Group__22 )
            // InternalGreedySnake.g:4548:2: rule__SnakeInitDisplay__Group__21__Impl rule__SnakeInitDisplay__Group__22
            {
            pushFollow(FOLLOW_8);
            rule__SnakeInitDisplay__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__21"


    // $ANTLR start "rule__SnakeInitDisplay__Group__21__Impl"
    // InternalGreedySnake.g:4555:1: rule__SnakeInitDisplay__Group__21__Impl : ( 'snakeTag' ) ;
    public final void rule__SnakeInitDisplay__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4559:1: ( ( 'snakeTag' ) )
            // InternalGreedySnake.g:4560:1: ( 'snakeTag' )
            {
            // InternalGreedySnake.g:4560:1: ( 'snakeTag' )
            // InternalGreedySnake.g:4561:2: 'snakeTag'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getSnakeTagKeyword_21()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getSnakeTagKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__21__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__22"
    // InternalGreedySnake.g:4570:1: rule__SnakeInitDisplay__Group__22 : rule__SnakeInitDisplay__Group__22__Impl rule__SnakeInitDisplay__Group__23 ;
    public final void rule__SnakeInitDisplay__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4574:1: ( rule__SnakeInitDisplay__Group__22__Impl rule__SnakeInitDisplay__Group__23 )
            // InternalGreedySnake.g:4575:2: rule__SnakeInitDisplay__Group__22__Impl rule__SnakeInitDisplay__Group__23
            {
            pushFollow(FOLLOW_11);
            rule__SnakeInitDisplay__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__22"


    // $ANTLR start "rule__SnakeInitDisplay__Group__22__Impl"
    // InternalGreedySnake.g:4582:1: rule__SnakeInitDisplay__Group__22__Impl : ( '=' ) ;
    public final void rule__SnakeInitDisplay__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4586:1: ( ( '=' ) )
            // InternalGreedySnake.g:4587:1: ( '=' )
            {
            // InternalGreedySnake.g:4587:1: ( '=' )
            // InternalGreedySnake.g:4588:2: '='
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_22()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__22__Impl"


    // $ANTLR start "rule__SnakeInitDisplay__Group__23"
    // InternalGreedySnake.g:4597:1: rule__SnakeInitDisplay__Group__23 : rule__SnakeInitDisplay__Group__23__Impl ;
    public final void rule__SnakeInitDisplay__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4601:1: ( rule__SnakeInitDisplay__Group__23__Impl )
            // InternalGreedySnake.g:4602:2: rule__SnakeInitDisplay__Group__23__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__Group__23__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__23"


    // $ANTLR start "rule__SnakeInitDisplay__Group__23__Impl"
    // InternalGreedySnake.g:4608:1: rule__SnakeInitDisplay__Group__23__Impl : ( ( rule__SnakeInitDisplay__SnakeTagAssignment_23 ) ) ;
    public final void rule__SnakeInitDisplay__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4612:1: ( ( ( rule__SnakeInitDisplay__SnakeTagAssignment_23 ) ) )
            // InternalGreedySnake.g:4613:1: ( ( rule__SnakeInitDisplay__SnakeTagAssignment_23 ) )
            {
            // InternalGreedySnake.g:4613:1: ( ( rule__SnakeInitDisplay__SnakeTagAssignment_23 ) )
            // InternalGreedySnake.g:4614:2: ( rule__SnakeInitDisplay__SnakeTagAssignment_23 )
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getSnakeTagAssignment_23()); 
            // InternalGreedySnake.g:4615:2: ( rule__SnakeInitDisplay__SnakeTagAssignment_23 )
            // InternalGreedySnake.g:4615:3: rule__SnakeInitDisplay__SnakeTagAssignment_23
            {
            pushFollow(FOLLOW_2);
            rule__SnakeInitDisplay__SnakeTagAssignment_23();

            state._fsp--;


            }

             after(grammarAccess.getSnakeInitDisplayAccess().getSnakeTagAssignment_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Group__23__Impl"


    // $ANTLR start "rule__IconTag__Group__0"
    // InternalGreedySnake.g:4624:1: rule__IconTag__Group__0 : rule__IconTag__Group__0__Impl rule__IconTag__Group__1 ;
    public final void rule__IconTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4628:1: ( rule__IconTag__Group__0__Impl rule__IconTag__Group__1 )
            // InternalGreedySnake.g:4629:2: rule__IconTag__Group__0__Impl rule__IconTag__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__IconTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IconTag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconTag__Group__0"


    // $ANTLR start "rule__IconTag__Group__0__Impl"
    // InternalGreedySnake.g:4636:1: rule__IconTag__Group__0__Impl : ( ( rule__IconTag__NameAssignment_0 ) ) ;
    public final void rule__IconTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4640:1: ( ( ( rule__IconTag__NameAssignment_0 ) ) )
            // InternalGreedySnake.g:4641:1: ( ( rule__IconTag__NameAssignment_0 ) )
            {
            // InternalGreedySnake.g:4641:1: ( ( rule__IconTag__NameAssignment_0 ) )
            // InternalGreedySnake.g:4642:2: ( rule__IconTag__NameAssignment_0 )
            {
             before(grammarAccess.getIconTagAccess().getNameAssignment_0()); 
            // InternalGreedySnake.g:4643:2: ( rule__IconTag__NameAssignment_0 )
            // InternalGreedySnake.g:4643:3: rule__IconTag__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__IconTag__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIconTagAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconTag__Group__0__Impl"


    // $ANTLR start "rule__IconTag__Group__1"
    // InternalGreedySnake.g:4651:1: rule__IconTag__Group__1 : rule__IconTag__Group__1__Impl rule__IconTag__Group__2 ;
    public final void rule__IconTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4655:1: ( rule__IconTag__Group__1__Impl rule__IconTag__Group__2 )
            // InternalGreedySnake.g:4656:2: rule__IconTag__Group__1__Impl rule__IconTag__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__IconTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IconTag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconTag__Group__1"


    // $ANTLR start "rule__IconTag__Group__1__Impl"
    // InternalGreedySnake.g:4663:1: rule__IconTag__Group__1__Impl : ( ( rule__IconTag__ValueAssignment_1 ) ) ;
    public final void rule__IconTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4667:1: ( ( ( rule__IconTag__ValueAssignment_1 ) ) )
            // InternalGreedySnake.g:4668:1: ( ( rule__IconTag__ValueAssignment_1 ) )
            {
            // InternalGreedySnake.g:4668:1: ( ( rule__IconTag__ValueAssignment_1 ) )
            // InternalGreedySnake.g:4669:2: ( rule__IconTag__ValueAssignment_1 )
            {
             before(grammarAccess.getIconTagAccess().getValueAssignment_1()); 
            // InternalGreedySnake.g:4670:2: ( rule__IconTag__ValueAssignment_1 )
            // InternalGreedySnake.g:4670:3: rule__IconTag__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IconTag__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIconTagAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconTag__Group__1__Impl"


    // $ANTLR start "rule__IconTag__Group__2"
    // InternalGreedySnake.g:4678:1: rule__IconTag__Group__2 : rule__IconTag__Group__2__Impl rule__IconTag__Group__3 ;
    public final void rule__IconTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4682:1: ( rule__IconTag__Group__2__Impl rule__IconTag__Group__3 )
            // InternalGreedySnake.g:4683:2: rule__IconTag__Group__2__Impl rule__IconTag__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__IconTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IconTag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconTag__Group__2"


    // $ANTLR start "rule__IconTag__Group__2__Impl"
    // InternalGreedySnake.g:4690:1: rule__IconTag__Group__2__Impl : ( '=' ) ;
    public final void rule__IconTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4694:1: ( ( '=' ) )
            // InternalGreedySnake.g:4695:1: ( '=' )
            {
            // InternalGreedySnake.g:4695:1: ( '=' )
            // InternalGreedySnake.g:4696:2: '='
            {
             before(grammarAccess.getIconTagAccess().getEqualsSignKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getIconTagAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconTag__Group__2__Impl"


    // $ANTLR start "rule__IconTag__Group__3"
    // InternalGreedySnake.g:4705:1: rule__IconTag__Group__3 : rule__IconTag__Group__3__Impl rule__IconTag__Group__4 ;
    public final void rule__IconTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4709:1: ( rule__IconTag__Group__3__Impl rule__IconTag__Group__4 )
            // InternalGreedySnake.g:4710:2: rule__IconTag__Group__3__Impl rule__IconTag__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__IconTag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IconTag__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconTag__Group__3"


    // $ANTLR start "rule__IconTag__Group__3__Impl"
    // InternalGreedySnake.g:4717:1: rule__IconTag__Group__3__Impl : ( ( rule__IconTag__TagAssignment_3 ) ) ;
    public final void rule__IconTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4721:1: ( ( ( rule__IconTag__TagAssignment_3 ) ) )
            // InternalGreedySnake.g:4722:1: ( ( rule__IconTag__TagAssignment_3 ) )
            {
            // InternalGreedySnake.g:4722:1: ( ( rule__IconTag__TagAssignment_3 ) )
            // InternalGreedySnake.g:4723:2: ( rule__IconTag__TagAssignment_3 )
            {
             before(grammarAccess.getIconTagAccess().getTagAssignment_3()); 
            // InternalGreedySnake.g:4724:2: ( rule__IconTag__TagAssignment_3 )
            // InternalGreedySnake.g:4724:3: rule__IconTag__TagAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IconTag__TagAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIconTagAccess().getTagAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconTag__Group__3__Impl"


    // $ANTLR start "rule__IconTag__Group__4"
    // InternalGreedySnake.g:4732:1: rule__IconTag__Group__4 : rule__IconTag__Group__4__Impl rule__IconTag__Group__5 ;
    public final void rule__IconTag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4736:1: ( rule__IconTag__Group__4__Impl rule__IconTag__Group__5 )
            // InternalGreedySnake.g:4737:2: rule__IconTag__Group__4__Impl rule__IconTag__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__IconTag__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IconTag__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconTag__Group__4"


    // $ANTLR start "rule__IconTag__Group__4__Impl"
    // InternalGreedySnake.g:4744:1: rule__IconTag__Group__4__Impl : ( 'Locate' ) ;
    public final void rule__IconTag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4748:1: ( ( 'Locate' ) )
            // InternalGreedySnake.g:4749:1: ( 'Locate' )
            {
            // InternalGreedySnake.g:4749:1: ( 'Locate' )
            // InternalGreedySnake.g:4750:2: 'Locate'
            {
             before(grammarAccess.getIconTagAccess().getLocateKeyword_4()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getIconTagAccess().getLocateKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconTag__Group__4__Impl"


    // $ANTLR start "rule__IconTag__Group__5"
    // InternalGreedySnake.g:4759:1: rule__IconTag__Group__5 : rule__IconTag__Group__5__Impl rule__IconTag__Group__6 ;
    public final void rule__IconTag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4763:1: ( rule__IconTag__Group__5__Impl rule__IconTag__Group__6 )
            // InternalGreedySnake.g:4764:2: rule__IconTag__Group__5__Impl rule__IconTag__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__IconTag__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IconTag__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconTag__Group__5"


    // $ANTLR start "rule__IconTag__Group__5__Impl"
    // InternalGreedySnake.g:4771:1: rule__IconTag__Group__5__Impl : ( ':' ) ;
    public final void rule__IconTag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4775:1: ( ( ':' ) )
            // InternalGreedySnake.g:4776:1: ( ':' )
            {
            // InternalGreedySnake.g:4776:1: ( ':' )
            // InternalGreedySnake.g:4777:2: ':'
            {
             before(grammarAccess.getIconTagAccess().getColonKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getIconTagAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconTag__Group__5__Impl"


    // $ANTLR start "rule__IconTag__Group__6"
    // InternalGreedySnake.g:4786:1: rule__IconTag__Group__6 : rule__IconTag__Group__6__Impl ;
    public final void rule__IconTag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4790:1: ( rule__IconTag__Group__6__Impl )
            // InternalGreedySnake.g:4791:2: rule__IconTag__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IconTag__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconTag__Group__6"


    // $ANTLR start "rule__IconTag__Group__6__Impl"
    // InternalGreedySnake.g:4797:1: rule__IconTag__Group__6__Impl : ( ( rule__IconTag__LocateAssignment_6 ) ) ;
    public final void rule__IconTag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4801:1: ( ( ( rule__IconTag__LocateAssignment_6 ) ) )
            // InternalGreedySnake.g:4802:1: ( ( rule__IconTag__LocateAssignment_6 ) )
            {
            // InternalGreedySnake.g:4802:1: ( ( rule__IconTag__LocateAssignment_6 ) )
            // InternalGreedySnake.g:4803:2: ( rule__IconTag__LocateAssignment_6 )
            {
             before(grammarAccess.getIconTagAccess().getLocateAssignment_6()); 
            // InternalGreedySnake.g:4804:2: ( rule__IconTag__LocateAssignment_6 )
            // InternalGreedySnake.g:4804:3: rule__IconTag__LocateAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__IconTag__LocateAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getIconTagAccess().getLocateAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconTag__Group__6__Impl"


    // $ANTLR start "rule__FoodInitDisplay__Group__0"
    // InternalGreedySnake.g:4813:1: rule__FoodInitDisplay__Group__0 : rule__FoodInitDisplay__Group__0__Impl rule__FoodInitDisplay__Group__1 ;
    public final void rule__FoodInitDisplay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4817:1: ( rule__FoodInitDisplay__Group__0__Impl rule__FoodInitDisplay__Group__1 )
            // InternalGreedySnake.g:4818:2: rule__FoodInitDisplay__Group__0__Impl rule__FoodInitDisplay__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FoodInitDisplay__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__0"


    // $ANTLR start "rule__FoodInitDisplay__Group__0__Impl"
    // InternalGreedySnake.g:4825:1: rule__FoodInitDisplay__Group__0__Impl : ( 'foodIcon' ) ;
    public final void rule__FoodInitDisplay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4829:1: ( ( 'foodIcon' ) )
            // InternalGreedySnake.g:4830:1: ( 'foodIcon' )
            {
            // InternalGreedySnake.g:4830:1: ( 'foodIcon' )
            // InternalGreedySnake.g:4831:2: 'foodIcon'
            {
             before(grammarAccess.getFoodInitDisplayAccess().getFoodIconKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getFoodInitDisplayAccess().getFoodIconKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__0__Impl"


    // $ANTLR start "rule__FoodInitDisplay__Group__1"
    // InternalGreedySnake.g:4840:1: rule__FoodInitDisplay__Group__1 : rule__FoodInitDisplay__Group__1__Impl rule__FoodInitDisplay__Group__2 ;
    public final void rule__FoodInitDisplay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4844:1: ( rule__FoodInitDisplay__Group__1__Impl rule__FoodInitDisplay__Group__2 )
            // InternalGreedySnake.g:4845:2: rule__FoodInitDisplay__Group__1__Impl rule__FoodInitDisplay__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__FoodInitDisplay__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__1"


    // $ANTLR start "rule__FoodInitDisplay__Group__1__Impl"
    // InternalGreedySnake.g:4852:1: rule__FoodInitDisplay__Group__1__Impl : ( '{' ) ;
    public final void rule__FoodInitDisplay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4856:1: ( ( '{' ) )
            // InternalGreedySnake.g:4857:1: ( '{' )
            {
            // InternalGreedySnake.g:4857:1: ( '{' )
            // InternalGreedySnake.g:4858:2: '{'
            {
             before(grammarAccess.getFoodInitDisplayAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFoodInitDisplayAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__1__Impl"


    // $ANTLR start "rule__FoodInitDisplay__Group__2"
    // InternalGreedySnake.g:4867:1: rule__FoodInitDisplay__Group__2 : rule__FoodInitDisplay__Group__2__Impl rule__FoodInitDisplay__Group__3 ;
    public final void rule__FoodInitDisplay__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4871:1: ( rule__FoodInitDisplay__Group__2__Impl rule__FoodInitDisplay__Group__3 )
            // InternalGreedySnake.g:4872:2: rule__FoodInitDisplay__Group__2__Impl rule__FoodInitDisplay__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__FoodInitDisplay__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__2"


    // $ANTLR start "rule__FoodInitDisplay__Group__2__Impl"
    // InternalGreedySnake.g:4879:1: rule__FoodInitDisplay__Group__2__Impl : ( ( rule__FoodInitDisplay__FoodIconAssignment_2 )* ) ;
    public final void rule__FoodInitDisplay__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4883:1: ( ( ( rule__FoodInitDisplay__FoodIconAssignment_2 )* ) )
            // InternalGreedySnake.g:4884:1: ( ( rule__FoodInitDisplay__FoodIconAssignment_2 )* )
            {
            // InternalGreedySnake.g:4884:1: ( ( rule__FoodInitDisplay__FoodIconAssignment_2 )* )
            // InternalGreedySnake.g:4885:2: ( rule__FoodInitDisplay__FoodIconAssignment_2 )*
            {
             before(grammarAccess.getFoodInitDisplayAccess().getFoodIconAssignment_2()); 
            // InternalGreedySnake.g:4886:2: ( rule__FoodInitDisplay__FoodIconAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGreedySnake.g:4886:3: rule__FoodInitDisplay__FoodIconAssignment_2
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__FoodInitDisplay__FoodIconAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getFoodInitDisplayAccess().getFoodIconAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__2__Impl"


    // $ANTLR start "rule__FoodInitDisplay__Group__3"
    // InternalGreedySnake.g:4894:1: rule__FoodInitDisplay__Group__3 : rule__FoodInitDisplay__Group__3__Impl rule__FoodInitDisplay__Group__4 ;
    public final void rule__FoodInitDisplay__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4898:1: ( rule__FoodInitDisplay__Group__3__Impl rule__FoodInitDisplay__Group__4 )
            // InternalGreedySnake.g:4899:2: rule__FoodInitDisplay__Group__3__Impl rule__FoodInitDisplay__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__FoodInitDisplay__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__3"


    // $ANTLR start "rule__FoodInitDisplay__Group__3__Impl"
    // InternalGreedySnake.g:4906:1: rule__FoodInitDisplay__Group__3__Impl : ( '}' ) ;
    public final void rule__FoodInitDisplay__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4910:1: ( ( '}' ) )
            // InternalGreedySnake.g:4911:1: ( '}' )
            {
            // InternalGreedySnake.g:4911:1: ( '}' )
            // InternalGreedySnake.g:4912:2: '}'
            {
             before(grammarAccess.getFoodInitDisplayAccess().getRightCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFoodInitDisplayAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__3__Impl"


    // $ANTLR start "rule__FoodInitDisplay__Group__4"
    // InternalGreedySnake.g:4921:1: rule__FoodInitDisplay__Group__4 : rule__FoodInitDisplay__Group__4__Impl rule__FoodInitDisplay__Group__5 ;
    public final void rule__FoodInitDisplay__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4925:1: ( rule__FoodInitDisplay__Group__4__Impl rule__FoodInitDisplay__Group__5 )
            // InternalGreedySnake.g:4926:2: rule__FoodInitDisplay__Group__4__Impl rule__FoodInitDisplay__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__FoodInitDisplay__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__4"


    // $ANTLR start "rule__FoodInitDisplay__Group__4__Impl"
    // InternalGreedySnake.g:4933:1: rule__FoodInitDisplay__Group__4__Impl : ( 'Icon_size' ) ;
    public final void rule__FoodInitDisplay__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4937:1: ( ( 'Icon_size' ) )
            // InternalGreedySnake.g:4938:1: ( 'Icon_size' )
            {
            // InternalGreedySnake.g:4938:1: ( 'Icon_size' )
            // InternalGreedySnake.g:4939:2: 'Icon_size'
            {
             before(grammarAccess.getFoodInitDisplayAccess().getIcon_sizeKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getFoodInitDisplayAccess().getIcon_sizeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__4__Impl"


    // $ANTLR start "rule__FoodInitDisplay__Group__5"
    // InternalGreedySnake.g:4948:1: rule__FoodInitDisplay__Group__5 : rule__FoodInitDisplay__Group__5__Impl rule__FoodInitDisplay__Group__6 ;
    public final void rule__FoodInitDisplay__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4952:1: ( rule__FoodInitDisplay__Group__5__Impl rule__FoodInitDisplay__Group__6 )
            // InternalGreedySnake.g:4953:2: rule__FoodInitDisplay__Group__5__Impl rule__FoodInitDisplay__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__FoodInitDisplay__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__5"


    // $ANTLR start "rule__FoodInitDisplay__Group__5__Impl"
    // InternalGreedySnake.g:4960:1: rule__FoodInitDisplay__Group__5__Impl : ( '=' ) ;
    public final void rule__FoodInitDisplay__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4964:1: ( ( '=' ) )
            // InternalGreedySnake.g:4965:1: ( '=' )
            {
            // InternalGreedySnake.g:4965:1: ( '=' )
            // InternalGreedySnake.g:4966:2: '='
            {
             before(grammarAccess.getFoodInitDisplayAccess().getEqualsSignKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFoodInitDisplayAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__5__Impl"


    // $ANTLR start "rule__FoodInitDisplay__Group__6"
    // InternalGreedySnake.g:4975:1: rule__FoodInitDisplay__Group__6 : rule__FoodInitDisplay__Group__6__Impl rule__FoodInitDisplay__Group__7 ;
    public final void rule__FoodInitDisplay__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4979:1: ( rule__FoodInitDisplay__Group__6__Impl rule__FoodInitDisplay__Group__7 )
            // InternalGreedySnake.g:4980:2: rule__FoodInitDisplay__Group__6__Impl rule__FoodInitDisplay__Group__7
            {
            pushFollow(FOLLOW_41);
            rule__FoodInitDisplay__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__6"


    // $ANTLR start "rule__FoodInitDisplay__Group__6__Impl"
    // InternalGreedySnake.g:4987:1: rule__FoodInitDisplay__Group__6__Impl : ( ( rule__FoodInitDisplay__IconsizeAssignment_6 ) ) ;
    public final void rule__FoodInitDisplay__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4991:1: ( ( ( rule__FoodInitDisplay__IconsizeAssignment_6 ) ) )
            // InternalGreedySnake.g:4992:1: ( ( rule__FoodInitDisplay__IconsizeAssignment_6 ) )
            {
            // InternalGreedySnake.g:4992:1: ( ( rule__FoodInitDisplay__IconsizeAssignment_6 ) )
            // InternalGreedySnake.g:4993:2: ( rule__FoodInitDisplay__IconsizeAssignment_6 )
            {
             before(grammarAccess.getFoodInitDisplayAccess().getIconsizeAssignment_6()); 
            // InternalGreedySnake.g:4994:2: ( rule__FoodInitDisplay__IconsizeAssignment_6 )
            // InternalGreedySnake.g:4994:3: rule__FoodInitDisplay__IconsizeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__IconsizeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFoodInitDisplayAccess().getIconsizeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__6__Impl"


    // $ANTLR start "rule__FoodInitDisplay__Group__7"
    // InternalGreedySnake.g:5002:1: rule__FoodInitDisplay__Group__7 : rule__FoodInitDisplay__Group__7__Impl rule__FoodInitDisplay__Group__8 ;
    public final void rule__FoodInitDisplay__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5006:1: ( rule__FoodInitDisplay__Group__7__Impl rule__FoodInitDisplay__Group__8 )
            // InternalGreedySnake.g:5007:2: rule__FoodInitDisplay__Group__7__Impl rule__FoodInitDisplay__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__FoodInitDisplay__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__7"


    // $ANTLR start "rule__FoodInitDisplay__Group__7__Impl"
    // InternalGreedySnake.g:5014:1: rule__FoodInitDisplay__Group__7__Impl : ( 'foodKind' ) ;
    public final void rule__FoodInitDisplay__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5018:1: ( ( 'foodKind' ) )
            // InternalGreedySnake.g:5019:1: ( 'foodKind' )
            {
            // InternalGreedySnake.g:5019:1: ( 'foodKind' )
            // InternalGreedySnake.g:5020:2: 'foodKind'
            {
             before(grammarAccess.getFoodInitDisplayAccess().getFoodKindKeyword_7()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getFoodInitDisplayAccess().getFoodKindKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__7__Impl"


    // $ANTLR start "rule__FoodInitDisplay__Group__8"
    // InternalGreedySnake.g:5029:1: rule__FoodInitDisplay__Group__8 : rule__FoodInitDisplay__Group__8__Impl rule__FoodInitDisplay__Group__9 ;
    public final void rule__FoodInitDisplay__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5033:1: ( rule__FoodInitDisplay__Group__8__Impl rule__FoodInitDisplay__Group__9 )
            // InternalGreedySnake.g:5034:2: rule__FoodInitDisplay__Group__8__Impl rule__FoodInitDisplay__Group__9
            {
            pushFollow(FOLLOW_32);
            rule__FoodInitDisplay__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__8"


    // $ANTLR start "rule__FoodInitDisplay__Group__8__Impl"
    // InternalGreedySnake.g:5041:1: rule__FoodInitDisplay__Group__8__Impl : ( '{' ) ;
    public final void rule__FoodInitDisplay__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5045:1: ( ( '{' ) )
            // InternalGreedySnake.g:5046:1: ( '{' )
            {
            // InternalGreedySnake.g:5046:1: ( '{' )
            // InternalGreedySnake.g:5047:2: '{'
            {
             before(grammarAccess.getFoodInitDisplayAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFoodInitDisplayAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__8__Impl"


    // $ANTLR start "rule__FoodInitDisplay__Group__9"
    // InternalGreedySnake.g:5056:1: rule__FoodInitDisplay__Group__9 : rule__FoodInitDisplay__Group__9__Impl rule__FoodInitDisplay__Group__10 ;
    public final void rule__FoodInitDisplay__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5060:1: ( rule__FoodInitDisplay__Group__9__Impl rule__FoodInitDisplay__Group__10 )
            // InternalGreedySnake.g:5061:2: rule__FoodInitDisplay__Group__9__Impl rule__FoodInitDisplay__Group__10
            {
            pushFollow(FOLLOW_32);
            rule__FoodInitDisplay__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__9"


    // $ANTLR start "rule__FoodInitDisplay__Group__9__Impl"
    // InternalGreedySnake.g:5068:1: rule__FoodInitDisplay__Group__9__Impl : ( ( rule__FoodInitDisplay__FoodKindAssignment_9 )* ) ;
    public final void rule__FoodInitDisplay__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5072:1: ( ( ( rule__FoodInitDisplay__FoodKindAssignment_9 )* ) )
            // InternalGreedySnake.g:5073:1: ( ( rule__FoodInitDisplay__FoodKindAssignment_9 )* )
            {
            // InternalGreedySnake.g:5073:1: ( ( rule__FoodInitDisplay__FoodKindAssignment_9 )* )
            // InternalGreedySnake.g:5074:2: ( rule__FoodInitDisplay__FoodKindAssignment_9 )*
            {
             before(grammarAccess.getFoodInitDisplayAccess().getFoodKindAssignment_9()); 
            // InternalGreedySnake.g:5075:2: ( rule__FoodInitDisplay__FoodKindAssignment_9 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGreedySnake.g:5075:3: rule__FoodInitDisplay__FoodKindAssignment_9
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__FoodInitDisplay__FoodKindAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getFoodInitDisplayAccess().getFoodKindAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__9__Impl"


    // $ANTLR start "rule__FoodInitDisplay__Group__10"
    // InternalGreedySnake.g:5083:1: rule__FoodInitDisplay__Group__10 : rule__FoodInitDisplay__Group__10__Impl rule__FoodInitDisplay__Group__11 ;
    public final void rule__FoodInitDisplay__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5087:1: ( rule__FoodInitDisplay__Group__10__Impl rule__FoodInitDisplay__Group__11 )
            // InternalGreedySnake.g:5088:2: rule__FoodInitDisplay__Group__10__Impl rule__FoodInitDisplay__Group__11
            {
            pushFollow(FOLLOW_42);
            rule__FoodInitDisplay__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__10"


    // $ANTLR start "rule__FoodInitDisplay__Group__10__Impl"
    // InternalGreedySnake.g:5095:1: rule__FoodInitDisplay__Group__10__Impl : ( '}' ) ;
    public final void rule__FoodInitDisplay__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5099:1: ( ( '}' ) )
            // InternalGreedySnake.g:5100:1: ( '}' )
            {
            // InternalGreedySnake.g:5100:1: ( '}' )
            // InternalGreedySnake.g:5101:2: '}'
            {
             before(grammarAccess.getFoodInitDisplayAccess().getRightCurlyBracketKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFoodInitDisplayAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__10__Impl"


    // $ANTLR start "rule__FoodInitDisplay__Group__11"
    // InternalGreedySnake.g:5110:1: rule__FoodInitDisplay__Group__11 : rule__FoodInitDisplay__Group__11__Impl rule__FoodInitDisplay__Group__12 ;
    public final void rule__FoodInitDisplay__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5114:1: ( rule__FoodInitDisplay__Group__11__Impl rule__FoodInitDisplay__Group__12 )
            // InternalGreedySnake.g:5115:2: rule__FoodInitDisplay__Group__11__Impl rule__FoodInitDisplay__Group__12
            {
            pushFollow(FOLLOW_43);
            rule__FoodInitDisplay__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__11"


    // $ANTLR start "rule__FoodInitDisplay__Group__11__Impl"
    // InternalGreedySnake.g:5122:1: rule__FoodInitDisplay__Group__11__Impl : ( 'randomFoodSize' ) ;
    public final void rule__FoodInitDisplay__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5126:1: ( ( 'randomFoodSize' ) )
            // InternalGreedySnake.g:5127:1: ( 'randomFoodSize' )
            {
            // InternalGreedySnake.g:5127:1: ( 'randomFoodSize' )
            // InternalGreedySnake.g:5128:2: 'randomFoodSize'
            {
             before(grammarAccess.getFoodInitDisplayAccess().getRandomFoodSizeKeyword_11()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getFoodInitDisplayAccess().getRandomFoodSizeKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__11__Impl"


    // $ANTLR start "rule__FoodInitDisplay__Group__12"
    // InternalGreedySnake.g:5137:1: rule__FoodInitDisplay__Group__12 : rule__FoodInitDisplay__Group__12__Impl rule__FoodInitDisplay__Group__13 ;
    public final void rule__FoodInitDisplay__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5141:1: ( rule__FoodInitDisplay__Group__12__Impl rule__FoodInitDisplay__Group__13 )
            // InternalGreedySnake.g:5142:2: rule__FoodInitDisplay__Group__12__Impl rule__FoodInitDisplay__Group__13
            {
            pushFollow(FOLLOW_44);
            rule__FoodInitDisplay__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__12"


    // $ANTLR start "rule__FoodInitDisplay__Group__12__Impl"
    // InternalGreedySnake.g:5149:1: rule__FoodInitDisplay__Group__12__Impl : ( ( rule__FoodInitDisplay__ProduceAssignment_12 ) ) ;
    public final void rule__FoodInitDisplay__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5153:1: ( ( ( rule__FoodInitDisplay__ProduceAssignment_12 ) ) )
            // InternalGreedySnake.g:5154:1: ( ( rule__FoodInitDisplay__ProduceAssignment_12 ) )
            {
            // InternalGreedySnake.g:5154:1: ( ( rule__FoodInitDisplay__ProduceAssignment_12 ) )
            // InternalGreedySnake.g:5155:2: ( rule__FoodInitDisplay__ProduceAssignment_12 )
            {
             before(grammarAccess.getFoodInitDisplayAccess().getProduceAssignment_12()); 
            // InternalGreedySnake.g:5156:2: ( rule__FoodInitDisplay__ProduceAssignment_12 )
            // InternalGreedySnake.g:5156:3: rule__FoodInitDisplay__ProduceAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__ProduceAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getFoodInitDisplayAccess().getProduceAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__12__Impl"


    // $ANTLR start "rule__FoodInitDisplay__Group__13"
    // InternalGreedySnake.g:5164:1: rule__FoodInitDisplay__Group__13 : rule__FoodInitDisplay__Group__13__Impl rule__FoodInitDisplay__Group__14 ;
    public final void rule__FoodInitDisplay__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5168:1: ( rule__FoodInitDisplay__Group__13__Impl rule__FoodInitDisplay__Group__14 )
            // InternalGreedySnake.g:5169:2: rule__FoodInitDisplay__Group__13__Impl rule__FoodInitDisplay__Group__14
            {
            pushFollow(FOLLOW_8);
            rule__FoodInitDisplay__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__13"


    // $ANTLR start "rule__FoodInitDisplay__Group__13__Impl"
    // InternalGreedySnake.g:5176:1: rule__FoodInitDisplay__Group__13__Impl : ( 'foodTag' ) ;
    public final void rule__FoodInitDisplay__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5180:1: ( ( 'foodTag' ) )
            // InternalGreedySnake.g:5181:1: ( 'foodTag' )
            {
            // InternalGreedySnake.g:5181:1: ( 'foodTag' )
            // InternalGreedySnake.g:5182:2: 'foodTag'
            {
             before(grammarAccess.getFoodInitDisplayAccess().getFoodTagKeyword_13()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getFoodInitDisplayAccess().getFoodTagKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__13__Impl"


    // $ANTLR start "rule__FoodInitDisplay__Group__14"
    // InternalGreedySnake.g:5191:1: rule__FoodInitDisplay__Group__14 : rule__FoodInitDisplay__Group__14__Impl rule__FoodInitDisplay__Group__15 ;
    public final void rule__FoodInitDisplay__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5195:1: ( rule__FoodInitDisplay__Group__14__Impl rule__FoodInitDisplay__Group__15 )
            // InternalGreedySnake.g:5196:2: rule__FoodInitDisplay__Group__14__Impl rule__FoodInitDisplay__Group__15
            {
            pushFollow(FOLLOW_11);
            rule__FoodInitDisplay__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__14"


    // $ANTLR start "rule__FoodInitDisplay__Group__14__Impl"
    // InternalGreedySnake.g:5203:1: rule__FoodInitDisplay__Group__14__Impl : ( '=' ) ;
    public final void rule__FoodInitDisplay__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5207:1: ( ( '=' ) )
            // InternalGreedySnake.g:5208:1: ( '=' )
            {
            // InternalGreedySnake.g:5208:1: ( '=' )
            // InternalGreedySnake.g:5209:2: '='
            {
             before(grammarAccess.getFoodInitDisplayAccess().getEqualsSignKeyword_14()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFoodInitDisplayAccess().getEqualsSignKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__14__Impl"


    // $ANTLR start "rule__FoodInitDisplay__Group__15"
    // InternalGreedySnake.g:5218:1: rule__FoodInitDisplay__Group__15 : rule__FoodInitDisplay__Group__15__Impl ;
    public final void rule__FoodInitDisplay__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5222:1: ( rule__FoodInitDisplay__Group__15__Impl )
            // InternalGreedySnake.g:5223:2: rule__FoodInitDisplay__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__15"


    // $ANTLR start "rule__FoodInitDisplay__Group__15__Impl"
    // InternalGreedySnake.g:5229:1: rule__FoodInitDisplay__Group__15__Impl : ( ( rule__FoodInitDisplay__FoodTagAssignment_15 ) ) ;
    public final void rule__FoodInitDisplay__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5233:1: ( ( ( rule__FoodInitDisplay__FoodTagAssignment_15 ) ) )
            // InternalGreedySnake.g:5234:1: ( ( rule__FoodInitDisplay__FoodTagAssignment_15 ) )
            {
            // InternalGreedySnake.g:5234:1: ( ( rule__FoodInitDisplay__FoodTagAssignment_15 ) )
            // InternalGreedySnake.g:5235:2: ( rule__FoodInitDisplay__FoodTagAssignment_15 )
            {
             before(grammarAccess.getFoodInitDisplayAccess().getFoodTagAssignment_15()); 
            // InternalGreedySnake.g:5236:2: ( rule__FoodInitDisplay__FoodTagAssignment_15 )
            // InternalGreedySnake.g:5236:3: rule__FoodInitDisplay__FoodTagAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__FoodInitDisplay__FoodTagAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getFoodInitDisplayAccess().getFoodTagAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__Group__15__Impl"


    // $ANTLR start "rule__FoodKind__Group__0"
    // InternalGreedySnake.g:5245:1: rule__FoodKind__Group__0 : rule__FoodKind__Group__0__Impl rule__FoodKind__Group__1 ;
    public final void rule__FoodKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5249:1: ( rule__FoodKind__Group__0__Impl rule__FoodKind__Group__1 )
            // InternalGreedySnake.g:5250:2: rule__FoodKind__Group__0__Impl rule__FoodKind__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__FoodKind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodKind__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodKind__Group__0"


    // $ANTLR start "rule__FoodKind__Group__0__Impl"
    // InternalGreedySnake.g:5257:1: rule__FoodKind__Group__0__Impl : ( ( rule__FoodKind__KindAssignment_0 ) ) ;
    public final void rule__FoodKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5261:1: ( ( ( rule__FoodKind__KindAssignment_0 ) ) )
            // InternalGreedySnake.g:5262:1: ( ( rule__FoodKind__KindAssignment_0 ) )
            {
            // InternalGreedySnake.g:5262:1: ( ( rule__FoodKind__KindAssignment_0 ) )
            // InternalGreedySnake.g:5263:2: ( rule__FoodKind__KindAssignment_0 )
            {
             before(grammarAccess.getFoodKindAccess().getKindAssignment_0()); 
            // InternalGreedySnake.g:5264:2: ( rule__FoodKind__KindAssignment_0 )
            // InternalGreedySnake.g:5264:3: rule__FoodKind__KindAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FoodKind__KindAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFoodKindAccess().getKindAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodKind__Group__0__Impl"


    // $ANTLR start "rule__FoodKind__Group__1"
    // InternalGreedySnake.g:5272:1: rule__FoodKind__Group__1 : rule__FoodKind__Group__1__Impl rule__FoodKind__Group__2 ;
    public final void rule__FoodKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5276:1: ( rule__FoodKind__Group__1__Impl rule__FoodKind__Group__2 )
            // InternalGreedySnake.g:5277:2: rule__FoodKind__Group__1__Impl rule__FoodKind__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__FoodKind__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodKind__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodKind__Group__1"


    // $ANTLR start "rule__FoodKind__Group__1__Impl"
    // InternalGreedySnake.g:5284:1: rule__FoodKind__Group__1__Impl : ( ':' ) ;
    public final void rule__FoodKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5288:1: ( ( ':' ) )
            // InternalGreedySnake.g:5289:1: ( ':' )
            {
            // InternalGreedySnake.g:5289:1: ( ':' )
            // InternalGreedySnake.g:5290:2: ':'
            {
             before(grammarAccess.getFoodKindAccess().getColonKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFoodKindAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodKind__Group__1__Impl"


    // $ANTLR start "rule__FoodKind__Group__2"
    // InternalGreedySnake.g:5299:1: rule__FoodKind__Group__2 : rule__FoodKind__Group__2__Impl rule__FoodKind__Group__3 ;
    public final void rule__FoodKind__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5303:1: ( rule__FoodKind__Group__2__Impl rule__FoodKind__Group__3 )
            // InternalGreedySnake.g:5304:2: rule__FoodKind__Group__2__Impl rule__FoodKind__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__FoodKind__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodKind__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodKind__Group__2"


    // $ANTLR start "rule__FoodKind__Group__2__Impl"
    // InternalGreedySnake.g:5311:1: rule__FoodKind__Group__2__Impl : ( 'point' ) ;
    public final void rule__FoodKind__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5315:1: ( ( 'point' ) )
            // InternalGreedySnake.g:5316:1: ( 'point' )
            {
            // InternalGreedySnake.g:5316:1: ( 'point' )
            // InternalGreedySnake.g:5317:2: 'point'
            {
             before(grammarAccess.getFoodKindAccess().getPointKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getFoodKindAccess().getPointKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodKind__Group__2__Impl"


    // $ANTLR start "rule__FoodKind__Group__3"
    // InternalGreedySnake.g:5326:1: rule__FoodKind__Group__3 : rule__FoodKind__Group__3__Impl rule__FoodKind__Group__4 ;
    public final void rule__FoodKind__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5330:1: ( rule__FoodKind__Group__3__Impl rule__FoodKind__Group__4 )
            // InternalGreedySnake.g:5331:2: rule__FoodKind__Group__3__Impl rule__FoodKind__Group__4
            {
            pushFollow(FOLLOW_46);
            rule__FoodKind__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodKind__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodKind__Group__3"


    // $ANTLR start "rule__FoodKind__Group__3__Impl"
    // InternalGreedySnake.g:5338:1: rule__FoodKind__Group__3__Impl : ( '=' ) ;
    public final void rule__FoodKind__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5342:1: ( ( '=' ) )
            // InternalGreedySnake.g:5343:1: ( '=' )
            {
            // InternalGreedySnake.g:5343:1: ( '=' )
            // InternalGreedySnake.g:5344:2: '='
            {
             before(grammarAccess.getFoodKindAccess().getEqualsSignKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFoodKindAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodKind__Group__3__Impl"


    // $ANTLR start "rule__FoodKind__Group__4"
    // InternalGreedySnake.g:5353:1: rule__FoodKind__Group__4 : rule__FoodKind__Group__4__Impl ;
    public final void rule__FoodKind__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5357:1: ( rule__FoodKind__Group__4__Impl )
            // InternalGreedySnake.g:5358:2: rule__FoodKind__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FoodKind__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodKind__Group__4"


    // $ANTLR start "rule__FoodKind__Group__4__Impl"
    // InternalGreedySnake.g:5364:1: rule__FoodKind__Group__4__Impl : ( ( rule__FoodKind__PointAssignment_4 ) ) ;
    public final void rule__FoodKind__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5368:1: ( ( ( rule__FoodKind__PointAssignment_4 ) ) )
            // InternalGreedySnake.g:5369:1: ( ( rule__FoodKind__PointAssignment_4 ) )
            {
            // InternalGreedySnake.g:5369:1: ( ( rule__FoodKind__PointAssignment_4 ) )
            // InternalGreedySnake.g:5370:2: ( rule__FoodKind__PointAssignment_4 )
            {
             before(grammarAccess.getFoodKindAccess().getPointAssignment_4()); 
            // InternalGreedySnake.g:5371:2: ( rule__FoodKind__PointAssignment_4 )
            // InternalGreedySnake.g:5371:3: rule__FoodKind__PointAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FoodKind__PointAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFoodKindAccess().getPointAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodKind__Group__4__Impl"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__0"
    // InternalGreedySnake.g:5380:1: rule__ObstacleInitDisplay__Group__0 : rule__ObstacleInitDisplay__Group__0__Impl rule__ObstacleInitDisplay__Group__1 ;
    public final void rule__ObstacleInitDisplay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5384:1: ( rule__ObstacleInitDisplay__Group__0__Impl rule__ObstacleInitDisplay__Group__1 )
            // InternalGreedySnake.g:5385:2: rule__ObstacleInitDisplay__Group__0__Impl rule__ObstacleInitDisplay__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ObstacleInitDisplay__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObstacleInitDisplay__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__0"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__0__Impl"
    // InternalGreedySnake.g:5392:1: rule__ObstacleInitDisplay__Group__0__Impl : ( 'ObstacleIcon' ) ;
    public final void rule__ObstacleInitDisplay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5396:1: ( ( 'ObstacleIcon' ) )
            // InternalGreedySnake.g:5397:1: ( 'ObstacleIcon' )
            {
            // InternalGreedySnake.g:5397:1: ( 'ObstacleIcon' )
            // InternalGreedySnake.g:5398:2: 'ObstacleIcon'
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getObstacleIconKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getObstacleInitDisplayAccess().getObstacleIconKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__0__Impl"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__1"
    // InternalGreedySnake.g:5407:1: rule__ObstacleInitDisplay__Group__1 : rule__ObstacleInitDisplay__Group__1__Impl rule__ObstacleInitDisplay__Group__2 ;
    public final void rule__ObstacleInitDisplay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5411:1: ( rule__ObstacleInitDisplay__Group__1__Impl rule__ObstacleInitDisplay__Group__2 )
            // InternalGreedySnake.g:5412:2: rule__ObstacleInitDisplay__Group__1__Impl rule__ObstacleInitDisplay__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__ObstacleInitDisplay__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObstacleInitDisplay__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__1"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__1__Impl"
    // InternalGreedySnake.g:5419:1: rule__ObstacleInitDisplay__Group__1__Impl : ( '{' ) ;
    public final void rule__ObstacleInitDisplay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5423:1: ( ( '{' ) )
            // InternalGreedySnake.g:5424:1: ( '{' )
            {
            // InternalGreedySnake.g:5424:1: ( '{' )
            // InternalGreedySnake.g:5425:2: '{'
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getObstacleInitDisplayAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__1__Impl"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__2"
    // InternalGreedySnake.g:5434:1: rule__ObstacleInitDisplay__Group__2 : rule__ObstacleInitDisplay__Group__2__Impl rule__ObstacleInitDisplay__Group__3 ;
    public final void rule__ObstacleInitDisplay__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5438:1: ( rule__ObstacleInitDisplay__Group__2__Impl rule__ObstacleInitDisplay__Group__3 )
            // InternalGreedySnake.g:5439:2: rule__ObstacleInitDisplay__Group__2__Impl rule__ObstacleInitDisplay__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__ObstacleInitDisplay__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObstacleInitDisplay__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__2"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__2__Impl"
    // InternalGreedySnake.g:5446:1: rule__ObstacleInitDisplay__Group__2__Impl : ( ( rule__ObstacleInitDisplay__ObstacleIconAssignment_2 )* ) ;
    public final void rule__ObstacleInitDisplay__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5450:1: ( ( ( rule__ObstacleInitDisplay__ObstacleIconAssignment_2 )* ) )
            // InternalGreedySnake.g:5451:1: ( ( rule__ObstacleInitDisplay__ObstacleIconAssignment_2 )* )
            {
            // InternalGreedySnake.g:5451:1: ( ( rule__ObstacleInitDisplay__ObstacleIconAssignment_2 )* )
            // InternalGreedySnake.g:5452:2: ( rule__ObstacleInitDisplay__ObstacleIconAssignment_2 )*
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getObstacleIconAssignment_2()); 
            // InternalGreedySnake.g:5453:2: ( rule__ObstacleInitDisplay__ObstacleIconAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGreedySnake.g:5453:3: rule__ObstacleInitDisplay__ObstacleIconAssignment_2
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__ObstacleInitDisplay__ObstacleIconAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getObstacleInitDisplayAccess().getObstacleIconAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__2__Impl"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__3"
    // InternalGreedySnake.g:5461:1: rule__ObstacleInitDisplay__Group__3 : rule__ObstacleInitDisplay__Group__3__Impl rule__ObstacleInitDisplay__Group__4 ;
    public final void rule__ObstacleInitDisplay__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5465:1: ( rule__ObstacleInitDisplay__Group__3__Impl rule__ObstacleInitDisplay__Group__4 )
            // InternalGreedySnake.g:5466:2: rule__ObstacleInitDisplay__Group__3__Impl rule__ObstacleInitDisplay__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__ObstacleInitDisplay__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObstacleInitDisplay__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__3"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__3__Impl"
    // InternalGreedySnake.g:5473:1: rule__ObstacleInitDisplay__Group__3__Impl : ( '}' ) ;
    public final void rule__ObstacleInitDisplay__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5477:1: ( ( '}' ) )
            // InternalGreedySnake.g:5478:1: ( '}' )
            {
            // InternalGreedySnake.g:5478:1: ( '}' )
            // InternalGreedySnake.g:5479:2: '}'
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getRightCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getObstacleInitDisplayAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__3__Impl"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__4"
    // InternalGreedySnake.g:5488:1: rule__ObstacleInitDisplay__Group__4 : rule__ObstacleInitDisplay__Group__4__Impl rule__ObstacleInitDisplay__Group__5 ;
    public final void rule__ObstacleInitDisplay__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5492:1: ( rule__ObstacleInitDisplay__Group__4__Impl rule__ObstacleInitDisplay__Group__5 )
            // InternalGreedySnake.g:5493:2: rule__ObstacleInitDisplay__Group__4__Impl rule__ObstacleInitDisplay__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__ObstacleInitDisplay__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObstacleInitDisplay__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__4"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__4__Impl"
    // InternalGreedySnake.g:5500:1: rule__ObstacleInitDisplay__Group__4__Impl : ( 'Icon_size' ) ;
    public final void rule__ObstacleInitDisplay__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5504:1: ( ( 'Icon_size' ) )
            // InternalGreedySnake.g:5505:1: ( 'Icon_size' )
            {
            // InternalGreedySnake.g:5505:1: ( 'Icon_size' )
            // InternalGreedySnake.g:5506:2: 'Icon_size'
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getIcon_sizeKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getObstacleInitDisplayAccess().getIcon_sizeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__4__Impl"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__5"
    // InternalGreedySnake.g:5515:1: rule__ObstacleInitDisplay__Group__5 : rule__ObstacleInitDisplay__Group__5__Impl rule__ObstacleInitDisplay__Group__6 ;
    public final void rule__ObstacleInitDisplay__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5519:1: ( rule__ObstacleInitDisplay__Group__5__Impl rule__ObstacleInitDisplay__Group__6 )
            // InternalGreedySnake.g:5520:2: rule__ObstacleInitDisplay__Group__5__Impl rule__ObstacleInitDisplay__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__ObstacleInitDisplay__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObstacleInitDisplay__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__5"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__5__Impl"
    // InternalGreedySnake.g:5527:1: rule__ObstacleInitDisplay__Group__5__Impl : ( '=' ) ;
    public final void rule__ObstacleInitDisplay__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5531:1: ( ( '=' ) )
            // InternalGreedySnake.g:5532:1: ( '=' )
            {
            // InternalGreedySnake.g:5532:1: ( '=' )
            // InternalGreedySnake.g:5533:2: '='
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getEqualsSignKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getObstacleInitDisplayAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__5__Impl"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__6"
    // InternalGreedySnake.g:5542:1: rule__ObstacleInitDisplay__Group__6 : rule__ObstacleInitDisplay__Group__6__Impl rule__ObstacleInitDisplay__Group__7 ;
    public final void rule__ObstacleInitDisplay__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5546:1: ( rule__ObstacleInitDisplay__Group__6__Impl rule__ObstacleInitDisplay__Group__7 )
            // InternalGreedySnake.g:5547:2: rule__ObstacleInitDisplay__Group__6__Impl rule__ObstacleInitDisplay__Group__7
            {
            pushFollow(FOLLOW_47);
            rule__ObstacleInitDisplay__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObstacleInitDisplay__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__6"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__6__Impl"
    // InternalGreedySnake.g:5554:1: rule__ObstacleInitDisplay__Group__6__Impl : ( ( rule__ObstacleInitDisplay__IconsizeAssignment_6 ) ) ;
    public final void rule__ObstacleInitDisplay__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5558:1: ( ( ( rule__ObstacleInitDisplay__IconsizeAssignment_6 ) ) )
            // InternalGreedySnake.g:5559:1: ( ( rule__ObstacleInitDisplay__IconsizeAssignment_6 ) )
            {
            // InternalGreedySnake.g:5559:1: ( ( rule__ObstacleInitDisplay__IconsizeAssignment_6 ) )
            // InternalGreedySnake.g:5560:2: ( rule__ObstacleInitDisplay__IconsizeAssignment_6 )
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getIconsizeAssignment_6()); 
            // InternalGreedySnake.g:5561:2: ( rule__ObstacleInitDisplay__IconsizeAssignment_6 )
            // InternalGreedySnake.g:5561:3: rule__ObstacleInitDisplay__IconsizeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ObstacleInitDisplay__IconsizeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getObstacleInitDisplayAccess().getIconsizeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__6__Impl"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__7"
    // InternalGreedySnake.g:5569:1: rule__ObstacleInitDisplay__Group__7 : rule__ObstacleInitDisplay__Group__7__Impl rule__ObstacleInitDisplay__Group__8 ;
    public final void rule__ObstacleInitDisplay__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5573:1: ( rule__ObstacleInitDisplay__Group__7__Impl rule__ObstacleInitDisplay__Group__8 )
            // InternalGreedySnake.g:5574:2: rule__ObstacleInitDisplay__Group__7__Impl rule__ObstacleInitDisplay__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__ObstacleInitDisplay__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObstacleInitDisplay__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__7"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__7__Impl"
    // InternalGreedySnake.g:5581:1: rule__ObstacleInitDisplay__Group__7__Impl : ( 'ObstacleTag' ) ;
    public final void rule__ObstacleInitDisplay__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5585:1: ( ( 'ObstacleTag' ) )
            // InternalGreedySnake.g:5586:1: ( 'ObstacleTag' )
            {
            // InternalGreedySnake.g:5586:1: ( 'ObstacleTag' )
            // InternalGreedySnake.g:5587:2: 'ObstacleTag'
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getObstacleTagKeyword_7()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getObstacleInitDisplayAccess().getObstacleTagKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__7__Impl"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__8"
    // InternalGreedySnake.g:5596:1: rule__ObstacleInitDisplay__Group__8 : rule__ObstacleInitDisplay__Group__8__Impl rule__ObstacleInitDisplay__Group__9 ;
    public final void rule__ObstacleInitDisplay__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5600:1: ( rule__ObstacleInitDisplay__Group__8__Impl rule__ObstacleInitDisplay__Group__9 )
            // InternalGreedySnake.g:5601:2: rule__ObstacleInitDisplay__Group__8__Impl rule__ObstacleInitDisplay__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__ObstacleInitDisplay__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObstacleInitDisplay__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__8"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__8__Impl"
    // InternalGreedySnake.g:5608:1: rule__ObstacleInitDisplay__Group__8__Impl : ( '=' ) ;
    public final void rule__ObstacleInitDisplay__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5612:1: ( ( '=' ) )
            // InternalGreedySnake.g:5613:1: ( '=' )
            {
            // InternalGreedySnake.g:5613:1: ( '=' )
            // InternalGreedySnake.g:5614:2: '='
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getEqualsSignKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getObstacleInitDisplayAccess().getEqualsSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__8__Impl"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__9"
    // InternalGreedySnake.g:5623:1: rule__ObstacleInitDisplay__Group__9 : rule__ObstacleInitDisplay__Group__9__Impl ;
    public final void rule__ObstacleInitDisplay__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5627:1: ( rule__ObstacleInitDisplay__Group__9__Impl )
            // InternalGreedySnake.g:5628:2: rule__ObstacleInitDisplay__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObstacleInitDisplay__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__9"


    // $ANTLR start "rule__ObstacleInitDisplay__Group__9__Impl"
    // InternalGreedySnake.g:5634:1: rule__ObstacleInitDisplay__Group__9__Impl : ( ( rule__ObstacleInitDisplay__ObstacleTagAssignment_9 ) ) ;
    public final void rule__ObstacleInitDisplay__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5638:1: ( ( ( rule__ObstacleInitDisplay__ObstacleTagAssignment_9 ) ) )
            // InternalGreedySnake.g:5639:1: ( ( rule__ObstacleInitDisplay__ObstacleTagAssignment_9 ) )
            {
            // InternalGreedySnake.g:5639:1: ( ( rule__ObstacleInitDisplay__ObstacleTagAssignment_9 ) )
            // InternalGreedySnake.g:5640:2: ( rule__ObstacleInitDisplay__ObstacleTagAssignment_9 )
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getObstacleTagAssignment_9()); 
            // InternalGreedySnake.g:5641:2: ( rule__ObstacleInitDisplay__ObstacleTagAssignment_9 )
            // InternalGreedySnake.g:5641:3: rule__ObstacleInitDisplay__ObstacleTagAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ObstacleInitDisplay__ObstacleTagAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getObstacleInitDisplayAccess().getObstacleTagAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__Group__9__Impl"


    // $ANTLR start "rule__RandomFoodSize__Group__0"
    // InternalGreedySnake.g:5650:1: rule__RandomFoodSize__Group__0 : rule__RandomFoodSize__Group__0__Impl rule__RandomFoodSize__Group__1 ;
    public final void rule__RandomFoodSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5654:1: ( rule__RandomFoodSize__Group__0__Impl rule__RandomFoodSize__Group__1 )
            // InternalGreedySnake.g:5655:2: rule__RandomFoodSize__Group__0__Impl rule__RandomFoodSize__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RandomFoodSize__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RandomFoodSize__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomFoodSize__Group__0"


    // $ANTLR start "rule__RandomFoodSize__Group__0__Impl"
    // InternalGreedySnake.g:5662:1: rule__RandomFoodSize__Group__0__Impl : ( 'Maxsize' ) ;
    public final void rule__RandomFoodSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5666:1: ( ( 'Maxsize' ) )
            // InternalGreedySnake.g:5667:1: ( 'Maxsize' )
            {
            // InternalGreedySnake.g:5667:1: ( 'Maxsize' )
            // InternalGreedySnake.g:5668:2: 'Maxsize'
            {
             before(grammarAccess.getRandomFoodSizeAccess().getMaxsizeKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getRandomFoodSizeAccess().getMaxsizeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomFoodSize__Group__0__Impl"


    // $ANTLR start "rule__RandomFoodSize__Group__1"
    // InternalGreedySnake.g:5677:1: rule__RandomFoodSize__Group__1 : rule__RandomFoodSize__Group__1__Impl rule__RandomFoodSize__Group__2 ;
    public final void rule__RandomFoodSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5681:1: ( rule__RandomFoodSize__Group__1__Impl rule__RandomFoodSize__Group__2 )
            // InternalGreedySnake.g:5682:2: rule__RandomFoodSize__Group__1__Impl rule__RandomFoodSize__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__RandomFoodSize__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RandomFoodSize__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomFoodSize__Group__1"


    // $ANTLR start "rule__RandomFoodSize__Group__1__Impl"
    // InternalGreedySnake.g:5689:1: rule__RandomFoodSize__Group__1__Impl : ( ( rule__RandomFoodSize__MaxsizeAssignment_1 ) ) ;
    public final void rule__RandomFoodSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5693:1: ( ( ( rule__RandomFoodSize__MaxsizeAssignment_1 ) ) )
            // InternalGreedySnake.g:5694:1: ( ( rule__RandomFoodSize__MaxsizeAssignment_1 ) )
            {
            // InternalGreedySnake.g:5694:1: ( ( rule__RandomFoodSize__MaxsizeAssignment_1 ) )
            // InternalGreedySnake.g:5695:2: ( rule__RandomFoodSize__MaxsizeAssignment_1 )
            {
             before(grammarAccess.getRandomFoodSizeAccess().getMaxsizeAssignment_1()); 
            // InternalGreedySnake.g:5696:2: ( rule__RandomFoodSize__MaxsizeAssignment_1 )
            // InternalGreedySnake.g:5696:3: rule__RandomFoodSize__MaxsizeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RandomFoodSize__MaxsizeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRandomFoodSizeAccess().getMaxsizeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomFoodSize__Group__1__Impl"


    // $ANTLR start "rule__RandomFoodSize__Group__2"
    // InternalGreedySnake.g:5704:1: rule__RandomFoodSize__Group__2 : rule__RandomFoodSize__Group__2__Impl rule__RandomFoodSize__Group__3 ;
    public final void rule__RandomFoodSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5708:1: ( rule__RandomFoodSize__Group__2__Impl rule__RandomFoodSize__Group__3 )
            // InternalGreedySnake.g:5709:2: rule__RandomFoodSize__Group__2__Impl rule__RandomFoodSize__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__RandomFoodSize__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RandomFoodSize__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomFoodSize__Group__2"


    // $ANTLR start "rule__RandomFoodSize__Group__2__Impl"
    // InternalGreedySnake.g:5716:1: rule__RandomFoodSize__Group__2__Impl : ( 'Minsize' ) ;
    public final void rule__RandomFoodSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5720:1: ( ( 'Minsize' ) )
            // InternalGreedySnake.g:5721:1: ( 'Minsize' )
            {
            // InternalGreedySnake.g:5721:1: ( 'Minsize' )
            // InternalGreedySnake.g:5722:2: 'Minsize'
            {
             before(grammarAccess.getRandomFoodSizeAccess().getMinsizeKeyword_2()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getRandomFoodSizeAccess().getMinsizeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomFoodSize__Group__2__Impl"


    // $ANTLR start "rule__RandomFoodSize__Group__3"
    // InternalGreedySnake.g:5731:1: rule__RandomFoodSize__Group__3 : rule__RandomFoodSize__Group__3__Impl ;
    public final void rule__RandomFoodSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5735:1: ( rule__RandomFoodSize__Group__3__Impl )
            // InternalGreedySnake.g:5736:2: rule__RandomFoodSize__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RandomFoodSize__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomFoodSize__Group__3"


    // $ANTLR start "rule__RandomFoodSize__Group__3__Impl"
    // InternalGreedySnake.g:5742:1: rule__RandomFoodSize__Group__3__Impl : ( ( rule__RandomFoodSize__MinsizeAssignment_3 ) ) ;
    public final void rule__RandomFoodSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5746:1: ( ( ( rule__RandomFoodSize__MinsizeAssignment_3 ) ) )
            // InternalGreedySnake.g:5747:1: ( ( rule__RandomFoodSize__MinsizeAssignment_3 ) )
            {
            // InternalGreedySnake.g:5747:1: ( ( rule__RandomFoodSize__MinsizeAssignment_3 ) )
            // InternalGreedySnake.g:5748:2: ( rule__RandomFoodSize__MinsizeAssignment_3 )
            {
             before(grammarAccess.getRandomFoodSizeAccess().getMinsizeAssignment_3()); 
            // InternalGreedySnake.g:5749:2: ( rule__RandomFoodSize__MinsizeAssignment_3 )
            // InternalGreedySnake.g:5749:3: rule__RandomFoodSize__MinsizeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RandomFoodSize__MinsizeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRandomFoodSizeAccess().getMinsizeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomFoodSize__Group__3__Impl"


    // $ANTLR start "rule__TimeLimited__Group_0__0"
    // InternalGreedySnake.g:5758:1: rule__TimeLimited__Group_0__0 : rule__TimeLimited__Group_0__0__Impl rule__TimeLimited__Group_0__1 ;
    public final void rule__TimeLimited__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5762:1: ( rule__TimeLimited__Group_0__0__Impl rule__TimeLimited__Group_0__1 )
            // InternalGreedySnake.g:5763:2: rule__TimeLimited__Group_0__0__Impl rule__TimeLimited__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__TimeLimited__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeLimited__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimited__Group_0__0"


    // $ANTLR start "rule__TimeLimited__Group_0__0__Impl"
    // InternalGreedySnake.g:5770:1: rule__TimeLimited__Group_0__0__Impl : ( 'timeLimited' ) ;
    public final void rule__TimeLimited__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5774:1: ( ( 'timeLimited' ) )
            // InternalGreedySnake.g:5775:1: ( 'timeLimited' )
            {
            // InternalGreedySnake.g:5775:1: ( 'timeLimited' )
            // InternalGreedySnake.g:5776:2: 'timeLimited'
            {
             before(grammarAccess.getTimeLimitedAccess().getTimeLimitedKeyword_0_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getTimeLimitedAccess().getTimeLimitedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimited__Group_0__0__Impl"


    // $ANTLR start "rule__TimeLimited__Group_0__1"
    // InternalGreedySnake.g:5785:1: rule__TimeLimited__Group_0__1 : rule__TimeLimited__Group_0__1__Impl rule__TimeLimited__Group_0__2 ;
    public final void rule__TimeLimited__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5789:1: ( rule__TimeLimited__Group_0__1__Impl rule__TimeLimited__Group_0__2 )
            // InternalGreedySnake.g:5790:2: rule__TimeLimited__Group_0__1__Impl rule__TimeLimited__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__TimeLimited__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeLimited__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimited__Group_0__1"


    // $ANTLR start "rule__TimeLimited__Group_0__1__Impl"
    // InternalGreedySnake.g:5797:1: rule__TimeLimited__Group_0__1__Impl : ( '{' ) ;
    public final void rule__TimeLimited__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5801:1: ( ( '{' ) )
            // InternalGreedySnake.g:5802:1: ( '{' )
            {
            // InternalGreedySnake.g:5802:1: ( '{' )
            // InternalGreedySnake.g:5803:2: '{'
            {
             before(grammarAccess.getTimeLimitedAccess().getLeftCurlyBracketKeyword_0_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTimeLimitedAccess().getLeftCurlyBracketKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimited__Group_0__1__Impl"


    // $ANTLR start "rule__TimeLimited__Group_0__2"
    // InternalGreedySnake.g:5812:1: rule__TimeLimited__Group_0__2 : rule__TimeLimited__Group_0__2__Impl ;
    public final void rule__TimeLimited__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5816:1: ( rule__TimeLimited__Group_0__2__Impl )
            // InternalGreedySnake.g:5817:2: rule__TimeLimited__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeLimited__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimited__Group_0__2"


    // $ANTLR start "rule__TimeLimited__Group_0__2__Impl"
    // InternalGreedySnake.g:5823:1: rule__TimeLimited__Group_0__2__Impl : ( ruleFoodTime ) ;
    public final void rule__TimeLimited__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5827:1: ( ( ruleFoodTime ) )
            // InternalGreedySnake.g:5828:1: ( ruleFoodTime )
            {
            // InternalGreedySnake.g:5828:1: ( ruleFoodTime )
            // InternalGreedySnake.g:5829:2: ruleFoodTime
            {
             before(grammarAccess.getTimeLimitedAccess().getFoodTimeParserRuleCall_0_2()); 
            pushFollow(FOLLOW_2);
            ruleFoodTime();

            state._fsp--;

             after(grammarAccess.getTimeLimitedAccess().getFoodTimeParserRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimited__Group_0__2__Impl"


    // $ANTLR start "rule__TimeLimited__Group_1__0"
    // InternalGreedySnake.g:5839:1: rule__TimeLimited__Group_1__0 : rule__TimeLimited__Group_1__0__Impl rule__TimeLimited__Group_1__1 ;
    public final void rule__TimeLimited__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5843:1: ( rule__TimeLimited__Group_1__0__Impl rule__TimeLimited__Group_1__1 )
            // InternalGreedySnake.g:5844:2: rule__TimeLimited__Group_1__0__Impl rule__TimeLimited__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__TimeLimited__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeLimited__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimited__Group_1__0"


    // $ANTLR start "rule__TimeLimited__Group_1__0__Impl"
    // InternalGreedySnake.g:5851:1: rule__TimeLimited__Group_1__0__Impl : ( ruleObstacleTime ) ;
    public final void rule__TimeLimited__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5855:1: ( ( ruleObstacleTime ) )
            // InternalGreedySnake.g:5856:1: ( ruleObstacleTime )
            {
            // InternalGreedySnake.g:5856:1: ( ruleObstacleTime )
            // InternalGreedySnake.g:5857:2: ruleObstacleTime
            {
             before(grammarAccess.getTimeLimitedAccess().getObstacleTimeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObstacleTime();

            state._fsp--;

             after(grammarAccess.getTimeLimitedAccess().getObstacleTimeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimited__Group_1__0__Impl"


    // $ANTLR start "rule__TimeLimited__Group_1__1"
    // InternalGreedySnake.g:5866:1: rule__TimeLimited__Group_1__1 : rule__TimeLimited__Group_1__1__Impl ;
    public final void rule__TimeLimited__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5870:1: ( rule__TimeLimited__Group_1__1__Impl )
            // InternalGreedySnake.g:5871:2: rule__TimeLimited__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeLimited__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimited__Group_1__1"


    // $ANTLR start "rule__TimeLimited__Group_1__1__Impl"
    // InternalGreedySnake.g:5877:1: rule__TimeLimited__Group_1__1__Impl : ( '}' ) ;
    public final void rule__TimeLimited__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5881:1: ( ( '}' ) )
            // InternalGreedySnake.g:5882:1: ( '}' )
            {
            // InternalGreedySnake.g:5882:1: ( '}' )
            // InternalGreedySnake.g:5883:2: '}'
            {
             before(grammarAccess.getTimeLimitedAccess().getRightCurlyBracketKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTimeLimitedAccess().getRightCurlyBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimited__Group_1__1__Impl"


    // $ANTLR start "rule__ObstacleTime__Group__0"
    // InternalGreedySnake.g:5893:1: rule__ObstacleTime__Group__0 : rule__ObstacleTime__Group__0__Impl rule__ObstacleTime__Group__1 ;
    public final void rule__ObstacleTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5897:1: ( rule__ObstacleTime__Group__0__Impl rule__ObstacleTime__Group__1 )
            // InternalGreedySnake.g:5898:2: rule__ObstacleTime__Group__0__Impl rule__ObstacleTime__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ObstacleTime__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObstacleTime__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleTime__Group__0"


    // $ANTLR start "rule__ObstacleTime__Group__0__Impl"
    // InternalGreedySnake.g:5905:1: rule__ObstacleTime__Group__0__Impl : ( ( rule__ObstacleTime__NameAssignment_0 ) ) ;
    public final void rule__ObstacleTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5909:1: ( ( ( rule__ObstacleTime__NameAssignment_0 ) ) )
            // InternalGreedySnake.g:5910:1: ( ( rule__ObstacleTime__NameAssignment_0 ) )
            {
            // InternalGreedySnake.g:5910:1: ( ( rule__ObstacleTime__NameAssignment_0 ) )
            // InternalGreedySnake.g:5911:2: ( rule__ObstacleTime__NameAssignment_0 )
            {
             before(grammarAccess.getObstacleTimeAccess().getNameAssignment_0()); 
            // InternalGreedySnake.g:5912:2: ( rule__ObstacleTime__NameAssignment_0 )
            // InternalGreedySnake.g:5912:3: rule__ObstacleTime__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObstacleTime__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObstacleTimeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleTime__Group__0__Impl"


    // $ANTLR start "rule__ObstacleTime__Group__1"
    // InternalGreedySnake.g:5920:1: rule__ObstacleTime__Group__1 : rule__ObstacleTime__Group__1__Impl rule__ObstacleTime__Group__2 ;
    public final void rule__ObstacleTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5924:1: ( rule__ObstacleTime__Group__1__Impl rule__ObstacleTime__Group__2 )
            // InternalGreedySnake.g:5925:2: rule__ObstacleTime__Group__1__Impl rule__ObstacleTime__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ObstacleTime__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObstacleTime__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleTime__Group__1"


    // $ANTLR start "rule__ObstacleTime__Group__1__Impl"
    // InternalGreedySnake.g:5932:1: rule__ObstacleTime__Group__1__Impl : ( '=' ) ;
    public final void rule__ObstacleTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5936:1: ( ( '=' ) )
            // InternalGreedySnake.g:5937:1: ( '=' )
            {
            // InternalGreedySnake.g:5937:1: ( '=' )
            // InternalGreedySnake.g:5938:2: '='
            {
             before(grammarAccess.getObstacleTimeAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getObstacleTimeAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleTime__Group__1__Impl"


    // $ANTLR start "rule__ObstacleTime__Group__2"
    // InternalGreedySnake.g:5947:1: rule__ObstacleTime__Group__2 : rule__ObstacleTime__Group__2__Impl ;
    public final void rule__ObstacleTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5951:1: ( rule__ObstacleTime__Group__2__Impl )
            // InternalGreedySnake.g:5952:2: rule__ObstacleTime__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObstacleTime__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleTime__Group__2"


    // $ANTLR start "rule__ObstacleTime__Group__2__Impl"
    // InternalGreedySnake.g:5958:1: rule__ObstacleTime__Group__2__Impl : ( ( rule__ObstacleTime__ObstacleTimeAssignment_2 ) ) ;
    public final void rule__ObstacleTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5962:1: ( ( ( rule__ObstacleTime__ObstacleTimeAssignment_2 ) ) )
            // InternalGreedySnake.g:5963:1: ( ( rule__ObstacleTime__ObstacleTimeAssignment_2 ) )
            {
            // InternalGreedySnake.g:5963:1: ( ( rule__ObstacleTime__ObstacleTimeAssignment_2 ) )
            // InternalGreedySnake.g:5964:2: ( rule__ObstacleTime__ObstacleTimeAssignment_2 )
            {
             before(grammarAccess.getObstacleTimeAccess().getObstacleTimeAssignment_2()); 
            // InternalGreedySnake.g:5965:2: ( rule__ObstacleTime__ObstacleTimeAssignment_2 )
            // InternalGreedySnake.g:5965:3: rule__ObstacleTime__ObstacleTimeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ObstacleTime__ObstacleTimeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObstacleTimeAccess().getObstacleTimeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleTime__Group__2__Impl"


    // $ANTLR start "rule__FoodTime__Group__0"
    // InternalGreedySnake.g:5974:1: rule__FoodTime__Group__0 : rule__FoodTime__Group__0__Impl rule__FoodTime__Group__1 ;
    public final void rule__FoodTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5978:1: ( rule__FoodTime__Group__0__Impl rule__FoodTime__Group__1 )
            // InternalGreedySnake.g:5979:2: rule__FoodTime__Group__0__Impl rule__FoodTime__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__FoodTime__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodTime__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodTime__Group__0"


    // $ANTLR start "rule__FoodTime__Group__0__Impl"
    // InternalGreedySnake.g:5986:1: rule__FoodTime__Group__0__Impl : ( ( rule__FoodTime__NameAssignment_0 ) ) ;
    public final void rule__FoodTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5990:1: ( ( ( rule__FoodTime__NameAssignment_0 ) ) )
            // InternalGreedySnake.g:5991:1: ( ( rule__FoodTime__NameAssignment_0 ) )
            {
            // InternalGreedySnake.g:5991:1: ( ( rule__FoodTime__NameAssignment_0 ) )
            // InternalGreedySnake.g:5992:2: ( rule__FoodTime__NameAssignment_0 )
            {
             before(grammarAccess.getFoodTimeAccess().getNameAssignment_0()); 
            // InternalGreedySnake.g:5993:2: ( rule__FoodTime__NameAssignment_0 )
            // InternalGreedySnake.g:5993:3: rule__FoodTime__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FoodTime__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFoodTimeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodTime__Group__0__Impl"


    // $ANTLR start "rule__FoodTime__Group__1"
    // InternalGreedySnake.g:6001:1: rule__FoodTime__Group__1 : rule__FoodTime__Group__1__Impl rule__FoodTime__Group__2 ;
    public final void rule__FoodTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6005:1: ( rule__FoodTime__Group__1__Impl rule__FoodTime__Group__2 )
            // InternalGreedySnake.g:6006:2: rule__FoodTime__Group__1__Impl rule__FoodTime__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__FoodTime__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoodTime__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodTime__Group__1"


    // $ANTLR start "rule__FoodTime__Group__1__Impl"
    // InternalGreedySnake.g:6013:1: rule__FoodTime__Group__1__Impl : ( '=' ) ;
    public final void rule__FoodTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6017:1: ( ( '=' ) )
            // InternalGreedySnake.g:6018:1: ( '=' )
            {
            // InternalGreedySnake.g:6018:1: ( '=' )
            // InternalGreedySnake.g:6019:2: '='
            {
             before(grammarAccess.getFoodTimeAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFoodTimeAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodTime__Group__1__Impl"


    // $ANTLR start "rule__FoodTime__Group__2"
    // InternalGreedySnake.g:6028:1: rule__FoodTime__Group__2 : rule__FoodTime__Group__2__Impl ;
    public final void rule__FoodTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6032:1: ( rule__FoodTime__Group__2__Impl )
            // InternalGreedySnake.g:6033:2: rule__FoodTime__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FoodTime__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodTime__Group__2"


    // $ANTLR start "rule__FoodTime__Group__2__Impl"
    // InternalGreedySnake.g:6039:1: rule__FoodTime__Group__2__Impl : ( ( rule__FoodTime__FoodTimeAssignment_2 ) ) ;
    public final void rule__FoodTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6043:1: ( ( ( rule__FoodTime__FoodTimeAssignment_2 ) ) )
            // InternalGreedySnake.g:6044:1: ( ( rule__FoodTime__FoodTimeAssignment_2 ) )
            {
            // InternalGreedySnake.g:6044:1: ( ( rule__FoodTime__FoodTimeAssignment_2 ) )
            // InternalGreedySnake.g:6045:2: ( rule__FoodTime__FoodTimeAssignment_2 )
            {
             before(grammarAccess.getFoodTimeAccess().getFoodTimeAssignment_2()); 
            // InternalGreedySnake.g:6046:2: ( rule__FoodTime__FoodTimeAssignment_2 )
            // InternalGreedySnake.g:6046:3: rule__FoodTime__FoodTimeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FoodTime__FoodTimeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFoodTimeAccess().getFoodTimeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodTime__Group__2__Impl"


    // $ANTLR start "rule__AllItemVarSpec__Group__0"
    // InternalGreedySnake.g:6055:1: rule__AllItemVarSpec__Group__0 : rule__AllItemVarSpec__Group__0__Impl rule__AllItemVarSpec__Group__1 ;
    public final void rule__AllItemVarSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6059:1: ( rule__AllItemVarSpec__Group__0__Impl rule__AllItemVarSpec__Group__1 )
            // InternalGreedySnake.g:6060:2: rule__AllItemVarSpec__Group__0__Impl rule__AllItemVarSpec__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AllItemVarSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllItemVarSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllItemVarSpec__Group__0"


    // $ANTLR start "rule__AllItemVarSpec__Group__0__Impl"
    // InternalGreedySnake.g:6067:1: rule__AllItemVarSpec__Group__0__Impl : ( ( rule__AllItemVarSpec__TypeAssignment_0 ) ) ;
    public final void rule__AllItemVarSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6071:1: ( ( ( rule__AllItemVarSpec__TypeAssignment_0 ) ) )
            // InternalGreedySnake.g:6072:1: ( ( rule__AllItemVarSpec__TypeAssignment_0 ) )
            {
            // InternalGreedySnake.g:6072:1: ( ( rule__AllItemVarSpec__TypeAssignment_0 ) )
            // InternalGreedySnake.g:6073:2: ( rule__AllItemVarSpec__TypeAssignment_0 )
            {
             before(grammarAccess.getAllItemVarSpecAccess().getTypeAssignment_0()); 
            // InternalGreedySnake.g:6074:2: ( rule__AllItemVarSpec__TypeAssignment_0 )
            // InternalGreedySnake.g:6074:3: rule__AllItemVarSpec__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AllItemVarSpec__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAllItemVarSpecAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllItemVarSpec__Group__0__Impl"


    // $ANTLR start "rule__AllItemVarSpec__Group__1"
    // InternalGreedySnake.g:6082:1: rule__AllItemVarSpec__Group__1 : rule__AllItemVarSpec__Group__1__Impl ;
    public final void rule__AllItemVarSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6086:1: ( rule__AllItemVarSpec__Group__1__Impl )
            // InternalGreedySnake.g:6087:2: rule__AllItemVarSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllItemVarSpec__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllItemVarSpec__Group__1"


    // $ANTLR start "rule__AllItemVarSpec__Group__1__Impl"
    // InternalGreedySnake.g:6093:1: rule__AllItemVarSpec__Group__1__Impl : ( ( rule__AllItemVarSpec__NameAssignment_1 ) ) ;
    public final void rule__AllItemVarSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6097:1: ( ( ( rule__AllItemVarSpec__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:6098:1: ( ( rule__AllItemVarSpec__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:6098:1: ( ( rule__AllItemVarSpec__NameAssignment_1 ) )
            // InternalGreedySnake.g:6099:2: ( rule__AllItemVarSpec__NameAssignment_1 )
            {
             before(grammarAccess.getAllItemVarSpecAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:6100:2: ( rule__AllItemVarSpec__NameAssignment_1 )
            // InternalGreedySnake.g:6100:3: rule__AllItemVarSpec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AllItemVarSpec__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAllItemVarSpecAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllItemVarSpec__Group__1__Impl"


    // $ANTLR start "rule__ParamSpec__Group__0"
    // InternalGreedySnake.g:6109:1: rule__ParamSpec__Group__0 : rule__ParamSpec__Group__0__Impl rule__ParamSpec__Group__1 ;
    public final void rule__ParamSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6113:1: ( rule__ParamSpec__Group__0__Impl rule__ParamSpec__Group__1 )
            // InternalGreedySnake.g:6114:2: rule__ParamSpec__Group__0__Impl rule__ParamSpec__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ParamSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamSpec__Group__0"


    // $ANTLR start "rule__ParamSpec__Group__0__Impl"
    // InternalGreedySnake.g:6121:1: rule__ParamSpec__Group__0__Impl : ( ( rule__ParamSpec__TypeAssignment_0 ) ) ;
    public final void rule__ParamSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6125:1: ( ( ( rule__ParamSpec__TypeAssignment_0 ) ) )
            // InternalGreedySnake.g:6126:1: ( ( rule__ParamSpec__TypeAssignment_0 ) )
            {
            // InternalGreedySnake.g:6126:1: ( ( rule__ParamSpec__TypeAssignment_0 ) )
            // InternalGreedySnake.g:6127:2: ( rule__ParamSpec__TypeAssignment_0 )
            {
             before(grammarAccess.getParamSpecAccess().getTypeAssignment_0()); 
            // InternalGreedySnake.g:6128:2: ( rule__ParamSpec__TypeAssignment_0 )
            // InternalGreedySnake.g:6128:3: rule__ParamSpec__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParamSpec__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamSpecAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamSpec__Group__0__Impl"


    // $ANTLR start "rule__ParamSpec__Group__1"
    // InternalGreedySnake.g:6136:1: rule__ParamSpec__Group__1 : rule__ParamSpec__Group__1__Impl ;
    public final void rule__ParamSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6140:1: ( rule__ParamSpec__Group__1__Impl )
            // InternalGreedySnake.g:6141:2: rule__ParamSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamSpec__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamSpec__Group__1"


    // $ANTLR start "rule__ParamSpec__Group__1__Impl"
    // InternalGreedySnake.g:6147:1: rule__ParamSpec__Group__1__Impl : ( ( rule__ParamSpec__NameAssignment_1 ) ) ;
    public final void rule__ParamSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6151:1: ( ( ( rule__ParamSpec__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:6152:1: ( ( rule__ParamSpec__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:6152:1: ( ( rule__ParamSpec__NameAssignment_1 ) )
            // InternalGreedySnake.g:6153:2: ( rule__ParamSpec__NameAssignment_1 )
            {
             before(grammarAccess.getParamSpecAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:6154:2: ( rule__ParamSpec__NameAssignment_1 )
            // InternalGreedySnake.g:6154:3: rule__ParamSpec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParamSpec__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParamSpecAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamSpec__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalGreedySnake.g:6163:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6167:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalGreedySnake.g:6168:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalGreedySnake.g:6175:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6179:1: ( ( ruleMultiplication ) )
            // InternalGreedySnake.g:6180:1: ( ruleMultiplication )
            {
            // InternalGreedySnake.g:6180:1: ( ruleMultiplication )
            // InternalGreedySnake.g:6181:2: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalGreedySnake.g:6190:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6194:1: ( rule__Addition__Group__1__Impl )
            // InternalGreedySnake.g:6195:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalGreedySnake.g:6201:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6205:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalGreedySnake.g:6206:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalGreedySnake.g:6206:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalGreedySnake.g:6207:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalGreedySnake.g:6208:2: ( rule__Addition__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=14 && LA21_0<=15)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGreedySnake.g:6208:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalGreedySnake.g:6217:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6221:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalGreedySnake.g:6222:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_49);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalGreedySnake.g:6229:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6233:1: ( ( () ) )
            // InternalGreedySnake.g:6234:1: ( () )
            {
            // InternalGreedySnake.g:6234:1: ( () )
            // InternalGreedySnake.g:6235:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalGreedySnake.g:6236:2: ()
            // InternalGreedySnake.g:6236:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalGreedySnake.g:6244:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6248:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalGreedySnake.g:6249:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_46);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalGreedySnake.g:6256:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6260:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalGreedySnake.g:6261:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalGreedySnake.g:6261:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalGreedySnake.g:6262:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalGreedySnake.g:6263:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalGreedySnake.g:6263:3: rule__Addition__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // InternalGreedySnake.g:6271:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6275:1: ( rule__Addition__Group_1__2__Impl )
            // InternalGreedySnake.g:6276:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // InternalGreedySnake.g:6282:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6286:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalGreedySnake.g:6287:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalGreedySnake.g:6287:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalGreedySnake.g:6288:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalGreedySnake.g:6289:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalGreedySnake.g:6289:3: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalGreedySnake.g:6298:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6302:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalGreedySnake.g:6303:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalGreedySnake.g:6310:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6314:1: ( ( rulePrimary ) )
            // InternalGreedySnake.g:6315:1: ( rulePrimary )
            {
            // InternalGreedySnake.g:6315:1: ( rulePrimary )
            // InternalGreedySnake.g:6316:2: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalGreedySnake.g:6325:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6329:1: ( rule__Multiplication__Group__1__Impl )
            // InternalGreedySnake.g:6330:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalGreedySnake.g:6336:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6340:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalGreedySnake.g:6341:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalGreedySnake.g:6341:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalGreedySnake.g:6342:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalGreedySnake.g:6343:2: ( rule__Multiplication__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=16 && LA22_0<=17)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGreedySnake.g:6343:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalGreedySnake.g:6352:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6356:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalGreedySnake.g:6357:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_51);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalGreedySnake.g:6364:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6368:1: ( ( () ) )
            // InternalGreedySnake.g:6369:1: ( () )
            {
            // InternalGreedySnake.g:6369:1: ( () )
            // InternalGreedySnake.g:6370:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalGreedySnake.g:6371:2: ()
            // InternalGreedySnake.g:6371:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalGreedySnake.g:6379:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6383:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalGreedySnake.g:6384:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_46);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalGreedySnake.g:6391:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6395:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalGreedySnake.g:6396:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalGreedySnake.g:6396:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalGreedySnake.g:6397:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalGreedySnake.g:6398:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalGreedySnake.g:6398:3: rule__Multiplication__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // InternalGreedySnake.g:6406:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6410:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalGreedySnake.g:6411:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // InternalGreedySnake.g:6417:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6421:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalGreedySnake.g:6422:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalGreedySnake.g:6422:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalGreedySnake.g:6423:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalGreedySnake.g:6424:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalGreedySnake.g:6424:3: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalGreedySnake.g:6433:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6437:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalGreedySnake.g:6438:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_46);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalGreedySnake.g:6445:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6449:1: ( ( '(' ) )
            // InternalGreedySnake.g:6450:1: ( '(' )
            {
            // InternalGreedySnake.g:6450:1: ( '(' )
            // InternalGreedySnake.g:6451:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalGreedySnake.g:6460:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6464:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalGreedySnake.g:6465:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_19);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalGreedySnake.g:6472:1: rule__Primary__Group_2__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6476:1: ( ( ruleAddition ) )
            // InternalGreedySnake.g:6477:1: ( ruleAddition )
            {
            // InternalGreedySnake.g:6477:1: ( ruleAddition )
            // InternalGreedySnake.g:6478:2: ruleAddition
            {
             before(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalGreedySnake.g:6487:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6491:1: ( rule__Primary__Group_2__2__Impl )
            // InternalGreedySnake.g:6492:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalGreedySnake.g:6498:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6502:1: ( ( ')' ) )
            // InternalGreedySnake.g:6503:1: ( ')' )
            {
            // InternalGreedySnake.g:6503:1: ( ')' )
            // InternalGreedySnake.g:6504:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalGreedySnake.g:6514:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6518:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalGreedySnake.g:6519:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__REAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0"


    // $ANTLR start "rule__REAL__Group__0__Impl"
    // InternalGreedySnake.g:6526:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6530:1: ( ( ( RULE_INT )? ) )
            // InternalGreedySnake.g:6531:1: ( ( RULE_INT )? )
            {
            // InternalGreedySnake.g:6531:1: ( ( RULE_INT )? )
            // InternalGreedySnake.g:6532:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalGreedySnake.g:6533:2: ( RULE_INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGreedySnake.g:6533:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0__Impl"


    // $ANTLR start "rule__REAL__Group__1"
    // InternalGreedySnake.g:6541:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6545:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalGreedySnake.g:6546:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__REAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1"


    // $ANTLR start "rule__REAL__Group__1__Impl"
    // InternalGreedySnake.g:6553:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6557:1: ( ( '.' ) )
            // InternalGreedySnake.g:6558:1: ( '.' )
            {
            // InternalGreedySnake.g:6558:1: ( '.' )
            // InternalGreedySnake.g:6559:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1__Impl"


    // $ANTLR start "rule__REAL__Group__2"
    // InternalGreedySnake.g:6568:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6572:1: ( rule__REAL__Group__2__Impl )
            // InternalGreedySnake.g:6573:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2"


    // $ANTLR start "rule__REAL__Group__2__Impl"
    // InternalGreedySnake.g:6579:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6583:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:6584:1: ( RULE_INT )
            {
            // InternalGreedySnake.g:6584:1: ( RULE_INT )
            // InternalGreedySnake.g:6585:2: RULE_INT
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2__Impl"


    // $ANTLR start "rule__RestartMenu__Group__0"
    // InternalGreedySnake.g:6595:1: rule__RestartMenu__Group__0 : rule__RestartMenu__Group__0__Impl rule__RestartMenu__Group__1 ;
    public final void rule__RestartMenu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6599:1: ( rule__RestartMenu__Group__0__Impl rule__RestartMenu__Group__1 )
            // InternalGreedySnake.g:6600:2: rule__RestartMenu__Group__0__Impl rule__RestartMenu__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__RestartMenu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestartMenu__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestartMenu__Group__0"


    // $ANTLR start "rule__RestartMenu__Group__0__Impl"
    // InternalGreedySnake.g:6607:1: rule__RestartMenu__Group__0__Impl : ( 'restartGame' ) ;
    public final void rule__RestartMenu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6611:1: ( ( 'restartGame' ) )
            // InternalGreedySnake.g:6612:1: ( 'restartGame' )
            {
            // InternalGreedySnake.g:6612:1: ( 'restartGame' )
            // InternalGreedySnake.g:6613:2: 'restartGame'
            {
             before(grammarAccess.getRestartMenuAccess().getRestartGameKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getRestartMenuAccess().getRestartGameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestartMenu__Group__0__Impl"


    // $ANTLR start "rule__RestartMenu__Group__1"
    // InternalGreedySnake.g:6622:1: rule__RestartMenu__Group__1 : rule__RestartMenu__Group__1__Impl ;
    public final void rule__RestartMenu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6626:1: ( rule__RestartMenu__Group__1__Impl )
            // InternalGreedySnake.g:6627:2: rule__RestartMenu__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestartMenu__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestartMenu__Group__1"


    // $ANTLR start "rule__RestartMenu__Group__1__Impl"
    // InternalGreedySnake.g:6633:1: rule__RestartMenu__Group__1__Impl : ( () ) ;
    public final void rule__RestartMenu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6637:1: ( ( () ) )
            // InternalGreedySnake.g:6638:1: ( () )
            {
            // InternalGreedySnake.g:6638:1: ( () )
            // InternalGreedySnake.g:6639:2: ()
            {
             before(grammarAccess.getRestartMenuAccess().getRestartMenuAction_1()); 
            // InternalGreedySnake.g:6640:2: ()
            // InternalGreedySnake.g:6640:3: 
            {
            }

             after(grammarAccess.getRestartMenuAccess().getRestartMenuAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestartMenu__Group__1__Impl"


    // $ANTLR start "rule__StartFieldDeclaration__Group__0"
    // InternalGreedySnake.g:6649:1: rule__StartFieldDeclaration__Group__0 : rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 ;
    public final void rule__StartFieldDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6653:1: ( rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 )
            // InternalGreedySnake.g:6654:2: rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__StartFieldDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartFieldDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Group__0"


    // $ANTLR start "rule__StartFieldDeclaration__Group__0__Impl"
    // InternalGreedySnake.g:6661:1: rule__StartFieldDeclaration__Group__0__Impl : ( 'start' ) ;
    public final void rule__StartFieldDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6665:1: ( ( 'start' ) )
            // InternalGreedySnake.g:6666:1: ( 'start' )
            {
            // InternalGreedySnake.g:6666:1: ( 'start' )
            // InternalGreedySnake.g:6667:2: 'start'
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Group__0__Impl"


    // $ANTLR start "rule__StartFieldDeclaration__Group__1"
    // InternalGreedySnake.g:6676:1: rule__StartFieldDeclaration__Group__1 : rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 ;
    public final void rule__StartFieldDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6680:1: ( rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 )
            // InternalGreedySnake.g:6681:2: rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__StartFieldDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartFieldDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Group__1"


    // $ANTLR start "rule__StartFieldDeclaration__Group__1__Impl"
    // InternalGreedySnake.g:6688:1: rule__StartFieldDeclaration__Group__1__Impl : ( '=' ) ;
    public final void rule__StartFieldDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6692:1: ( ( '=' ) )
            // InternalGreedySnake.g:6693:1: ( '=' )
            {
            // InternalGreedySnake.g:6693:1: ( '=' )
            // InternalGreedySnake.g:6694:2: '='
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Group__1__Impl"


    // $ANTLR start "rule__StartFieldDeclaration__Group__2"
    // InternalGreedySnake.g:6703:1: rule__StartFieldDeclaration__Group__2 : rule__StartFieldDeclaration__Group__2__Impl ;
    public final void rule__StartFieldDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6707:1: ( rule__StartFieldDeclaration__Group__2__Impl )
            // InternalGreedySnake.g:6708:2: rule__StartFieldDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartFieldDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Group__2"


    // $ANTLR start "rule__StartFieldDeclaration__Group__2__Impl"
    // InternalGreedySnake.g:6714:1: rule__StartFieldDeclaration__Group__2__Impl : ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) ) ;
    public final void rule__StartFieldDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6718:1: ( ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) ) )
            // InternalGreedySnake.g:6719:1: ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) )
            {
            // InternalGreedySnake.g:6719:1: ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) )
            // InternalGreedySnake.g:6720:2: ( rule__StartFieldDeclaration__FieldAssignment_2 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldAssignment_2()); 
            // InternalGreedySnake.g:6721:2: ( rule__StartFieldDeclaration__FieldAssignment_2 )
            // InternalGreedySnake.g:6721:3: rule__StartFieldDeclaration__FieldAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StartFieldDeclaration__FieldAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStartFieldDeclarationAccess().getFieldAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Group__2__Impl"


    // $ANTLR start "rule__AboutSpecification__Group__0"
    // InternalGreedySnake.g:6730:1: rule__AboutSpecification__Group__0 : rule__AboutSpecification__Group__0__Impl rule__AboutSpecification__Group__1 ;
    public final void rule__AboutSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6734:1: ( rule__AboutSpecification__Group__0__Impl rule__AboutSpecification__Group__1 )
            // InternalGreedySnake.g:6735:2: rule__AboutSpecification__Group__0__Impl rule__AboutSpecification__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AboutSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__0"


    // $ANTLR start "rule__AboutSpecification__Group__0__Impl"
    // InternalGreedySnake.g:6742:1: rule__AboutSpecification__Group__0__Impl : ( 'about' ) ;
    public final void rule__AboutSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6746:1: ( ( 'about' ) )
            // InternalGreedySnake.g:6747:1: ( 'about' )
            {
            // InternalGreedySnake.g:6747:1: ( 'about' )
            // InternalGreedySnake.g:6748:2: 'about'
            {
             before(grammarAccess.getAboutSpecificationAccess().getAboutKeyword_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getAboutSpecificationAccess().getAboutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__0__Impl"


    // $ANTLR start "rule__AboutSpecification__Group__1"
    // InternalGreedySnake.g:6757:1: rule__AboutSpecification__Group__1 : rule__AboutSpecification__Group__1__Impl rule__AboutSpecification__Group__2 ;
    public final void rule__AboutSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6761:1: ( rule__AboutSpecification__Group__1__Impl rule__AboutSpecification__Group__2 )
            // InternalGreedySnake.g:6762:2: rule__AboutSpecification__Group__1__Impl rule__AboutSpecification__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AboutSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__1"


    // $ANTLR start "rule__AboutSpecification__Group__1__Impl"
    // InternalGreedySnake.g:6769:1: rule__AboutSpecification__Group__1__Impl : ( ( rule__AboutSpecification__NameAssignment_1 ) ) ;
    public final void rule__AboutSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6773:1: ( ( ( rule__AboutSpecification__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:6774:1: ( ( rule__AboutSpecification__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:6774:1: ( ( rule__AboutSpecification__NameAssignment_1 ) )
            // InternalGreedySnake.g:6775:2: ( rule__AboutSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getAboutSpecificationAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:6776:2: ( rule__AboutSpecification__NameAssignment_1 )
            // InternalGreedySnake.g:6776:3: rule__AboutSpecification__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AboutSpecification__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAboutSpecificationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__1__Impl"


    // $ANTLR start "rule__AboutSpecification__Group__2"
    // InternalGreedySnake.g:6784:1: rule__AboutSpecification__Group__2 : rule__AboutSpecification__Group__2__Impl rule__AboutSpecification__Group__3 ;
    public final void rule__AboutSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6788:1: ( rule__AboutSpecification__Group__2__Impl rule__AboutSpecification__Group__3 )
            // InternalGreedySnake.g:6789:2: rule__AboutSpecification__Group__2__Impl rule__AboutSpecification__Group__3
            {
            pushFollow(FOLLOW_54);
            rule__AboutSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__2"


    // $ANTLR start "rule__AboutSpecification__Group__2__Impl"
    // InternalGreedySnake.g:6796:1: rule__AboutSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__AboutSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6800:1: ( ( '{' ) )
            // InternalGreedySnake.g:6801:1: ( '{' )
            {
            // InternalGreedySnake.g:6801:1: ( '{' )
            // InternalGreedySnake.g:6802:2: '{'
            {
             before(grammarAccess.getAboutSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAboutSpecificationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__2__Impl"


    // $ANTLR start "rule__AboutSpecification__Group__3"
    // InternalGreedySnake.g:6811:1: rule__AboutSpecification__Group__3 : rule__AboutSpecification__Group__3__Impl rule__AboutSpecification__Group__4 ;
    public final void rule__AboutSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6815:1: ( rule__AboutSpecification__Group__3__Impl rule__AboutSpecification__Group__4 )
            // InternalGreedySnake.g:6816:2: rule__AboutSpecification__Group__3__Impl rule__AboutSpecification__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__AboutSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutSpecification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__3"


    // $ANTLR start "rule__AboutSpecification__Group__3__Impl"
    // InternalGreedySnake.g:6823:1: rule__AboutSpecification__Group__3__Impl : ( 'Title' ) ;
    public final void rule__AboutSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6827:1: ( ( 'Title' ) )
            // InternalGreedySnake.g:6828:1: ( 'Title' )
            {
            // InternalGreedySnake.g:6828:1: ( 'Title' )
            // InternalGreedySnake.g:6829:2: 'Title'
            {
             before(grammarAccess.getAboutSpecificationAccess().getTitleKeyword_3()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getAboutSpecificationAccess().getTitleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__3__Impl"


    // $ANTLR start "rule__AboutSpecification__Group__4"
    // InternalGreedySnake.g:6838:1: rule__AboutSpecification__Group__4 : rule__AboutSpecification__Group__4__Impl rule__AboutSpecification__Group__5 ;
    public final void rule__AboutSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6842:1: ( rule__AboutSpecification__Group__4__Impl rule__AboutSpecification__Group__5 )
            // InternalGreedySnake.g:6843:2: rule__AboutSpecification__Group__4__Impl rule__AboutSpecification__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__AboutSpecification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutSpecification__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__4"


    // $ANTLR start "rule__AboutSpecification__Group__4__Impl"
    // InternalGreedySnake.g:6850:1: rule__AboutSpecification__Group__4__Impl : ( ':' ) ;
    public final void rule__AboutSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6854:1: ( ( ':' ) )
            // InternalGreedySnake.g:6855:1: ( ':' )
            {
            // InternalGreedySnake.g:6855:1: ( ':' )
            // InternalGreedySnake.g:6856:2: ':'
            {
             before(grammarAccess.getAboutSpecificationAccess().getColonKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAboutSpecificationAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__4__Impl"


    // $ANTLR start "rule__AboutSpecification__Group__5"
    // InternalGreedySnake.g:6865:1: rule__AboutSpecification__Group__5 : rule__AboutSpecification__Group__5__Impl rule__AboutSpecification__Group__6 ;
    public final void rule__AboutSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6869:1: ( rule__AboutSpecification__Group__5__Impl rule__AboutSpecification__Group__6 )
            // InternalGreedySnake.g:6870:2: rule__AboutSpecification__Group__5__Impl rule__AboutSpecification__Group__6
            {
            pushFollow(FOLLOW_55);
            rule__AboutSpecification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutSpecification__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__5"


    // $ANTLR start "rule__AboutSpecification__Group__5__Impl"
    // InternalGreedySnake.g:6877:1: rule__AboutSpecification__Group__5__Impl : ( ( rule__AboutSpecification__AboutTitleAssignment_5 ) ) ;
    public final void rule__AboutSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6881:1: ( ( ( rule__AboutSpecification__AboutTitleAssignment_5 ) ) )
            // InternalGreedySnake.g:6882:1: ( ( rule__AboutSpecification__AboutTitleAssignment_5 ) )
            {
            // InternalGreedySnake.g:6882:1: ( ( rule__AboutSpecification__AboutTitleAssignment_5 ) )
            // InternalGreedySnake.g:6883:2: ( rule__AboutSpecification__AboutTitleAssignment_5 )
            {
             before(grammarAccess.getAboutSpecificationAccess().getAboutTitleAssignment_5()); 
            // InternalGreedySnake.g:6884:2: ( rule__AboutSpecification__AboutTitleAssignment_5 )
            // InternalGreedySnake.g:6884:3: rule__AboutSpecification__AboutTitleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AboutSpecification__AboutTitleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAboutSpecificationAccess().getAboutTitleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__5__Impl"


    // $ANTLR start "rule__AboutSpecification__Group__6"
    // InternalGreedySnake.g:6892:1: rule__AboutSpecification__Group__6 : rule__AboutSpecification__Group__6__Impl rule__AboutSpecification__Group__7 ;
    public final void rule__AboutSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6896:1: ( rule__AboutSpecification__Group__6__Impl rule__AboutSpecification__Group__7 )
            // InternalGreedySnake.g:6897:2: rule__AboutSpecification__Group__6__Impl rule__AboutSpecification__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__AboutSpecification__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutSpecification__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__6"


    // $ANTLR start "rule__AboutSpecification__Group__6__Impl"
    // InternalGreedySnake.g:6904:1: rule__AboutSpecification__Group__6__Impl : ( 'Information' ) ;
    public final void rule__AboutSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6908:1: ( ( 'Information' ) )
            // InternalGreedySnake.g:6909:1: ( 'Information' )
            {
            // InternalGreedySnake.g:6909:1: ( 'Information' )
            // InternalGreedySnake.g:6910:2: 'Information'
            {
             before(grammarAccess.getAboutSpecificationAccess().getInformationKeyword_6()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getAboutSpecificationAccess().getInformationKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__6__Impl"


    // $ANTLR start "rule__AboutSpecification__Group__7"
    // InternalGreedySnake.g:6919:1: rule__AboutSpecification__Group__7 : rule__AboutSpecification__Group__7__Impl rule__AboutSpecification__Group__8 ;
    public final void rule__AboutSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6923:1: ( rule__AboutSpecification__Group__7__Impl rule__AboutSpecification__Group__8 )
            // InternalGreedySnake.g:6924:2: rule__AboutSpecification__Group__7__Impl rule__AboutSpecification__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__AboutSpecification__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutSpecification__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__7"


    // $ANTLR start "rule__AboutSpecification__Group__7__Impl"
    // InternalGreedySnake.g:6931:1: rule__AboutSpecification__Group__7__Impl : ( ':' ) ;
    public final void rule__AboutSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6935:1: ( ( ':' ) )
            // InternalGreedySnake.g:6936:1: ( ':' )
            {
            // InternalGreedySnake.g:6936:1: ( ':' )
            // InternalGreedySnake.g:6937:2: ':'
            {
             before(grammarAccess.getAboutSpecificationAccess().getColonKeyword_7()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAboutSpecificationAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__7__Impl"


    // $ANTLR start "rule__AboutSpecification__Group__8"
    // InternalGreedySnake.g:6946:1: rule__AboutSpecification__Group__8 : rule__AboutSpecification__Group__8__Impl rule__AboutSpecification__Group__9 ;
    public final void rule__AboutSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6950:1: ( rule__AboutSpecification__Group__8__Impl rule__AboutSpecification__Group__9 )
            // InternalGreedySnake.g:6951:2: rule__AboutSpecification__Group__8__Impl rule__AboutSpecification__Group__9
            {
            pushFollow(FOLLOW_56);
            rule__AboutSpecification__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutSpecification__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__8"


    // $ANTLR start "rule__AboutSpecification__Group__8__Impl"
    // InternalGreedySnake.g:6958:1: rule__AboutSpecification__Group__8__Impl : ( ( rule__AboutSpecification__AboutInforAssignment_8 ) ) ;
    public final void rule__AboutSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6962:1: ( ( ( rule__AboutSpecification__AboutInforAssignment_8 ) ) )
            // InternalGreedySnake.g:6963:1: ( ( rule__AboutSpecification__AboutInforAssignment_8 ) )
            {
            // InternalGreedySnake.g:6963:1: ( ( rule__AboutSpecification__AboutInforAssignment_8 ) )
            // InternalGreedySnake.g:6964:2: ( rule__AboutSpecification__AboutInforAssignment_8 )
            {
             before(grammarAccess.getAboutSpecificationAccess().getAboutInforAssignment_8()); 
            // InternalGreedySnake.g:6965:2: ( rule__AboutSpecification__AboutInforAssignment_8 )
            // InternalGreedySnake.g:6965:3: rule__AboutSpecification__AboutInforAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__AboutSpecification__AboutInforAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getAboutSpecificationAccess().getAboutInforAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__8__Impl"


    // $ANTLR start "rule__AboutSpecification__Group__9"
    // InternalGreedySnake.g:6973:1: rule__AboutSpecification__Group__9 : rule__AboutSpecification__Group__9__Impl rule__AboutSpecification__Group__10 ;
    public final void rule__AboutSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6977:1: ( rule__AboutSpecification__Group__9__Impl rule__AboutSpecification__Group__10 )
            // InternalGreedySnake.g:6978:2: rule__AboutSpecification__Group__9__Impl rule__AboutSpecification__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__AboutSpecification__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutSpecification__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__9"


    // $ANTLR start "rule__AboutSpecification__Group__9__Impl"
    // InternalGreedySnake.g:6985:1: rule__AboutSpecification__Group__9__Impl : ( 'Label_size' ) ;
    public final void rule__AboutSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6989:1: ( ( 'Label_size' ) )
            // InternalGreedySnake.g:6990:1: ( 'Label_size' )
            {
            // InternalGreedySnake.g:6990:1: ( 'Label_size' )
            // InternalGreedySnake.g:6991:2: 'Label_size'
            {
             before(grammarAccess.getAboutSpecificationAccess().getLabel_sizeKeyword_9()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getAboutSpecificationAccess().getLabel_sizeKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__9__Impl"


    // $ANTLR start "rule__AboutSpecification__Group__10"
    // InternalGreedySnake.g:7000:1: rule__AboutSpecification__Group__10 : rule__AboutSpecification__Group__10__Impl rule__AboutSpecification__Group__11 ;
    public final void rule__AboutSpecification__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7004:1: ( rule__AboutSpecification__Group__10__Impl rule__AboutSpecification__Group__11 )
            // InternalGreedySnake.g:7005:2: rule__AboutSpecification__Group__10__Impl rule__AboutSpecification__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__AboutSpecification__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutSpecification__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__10"


    // $ANTLR start "rule__AboutSpecification__Group__10__Impl"
    // InternalGreedySnake.g:7012:1: rule__AboutSpecification__Group__10__Impl : ( ':' ) ;
    public final void rule__AboutSpecification__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7016:1: ( ( ':' ) )
            // InternalGreedySnake.g:7017:1: ( ':' )
            {
            // InternalGreedySnake.g:7017:1: ( ':' )
            // InternalGreedySnake.g:7018:2: ':'
            {
             before(grammarAccess.getAboutSpecificationAccess().getColonKeyword_10()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAboutSpecificationAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__10__Impl"


    // $ANTLR start "rule__AboutSpecification__Group__11"
    // InternalGreedySnake.g:7027:1: rule__AboutSpecification__Group__11 : rule__AboutSpecification__Group__11__Impl rule__AboutSpecification__Group__12 ;
    public final void rule__AboutSpecification__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7031:1: ( rule__AboutSpecification__Group__11__Impl rule__AboutSpecification__Group__12 )
            // InternalGreedySnake.g:7032:2: rule__AboutSpecification__Group__11__Impl rule__AboutSpecification__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__AboutSpecification__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutSpecification__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__11"


    // $ANTLR start "rule__AboutSpecification__Group__11__Impl"
    // InternalGreedySnake.g:7039:1: rule__AboutSpecification__Group__11__Impl : ( '(' ) ;
    public final void rule__AboutSpecification__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7043:1: ( ( '(' ) )
            // InternalGreedySnake.g:7044:1: ( '(' )
            {
            // InternalGreedySnake.g:7044:1: ( '(' )
            // InternalGreedySnake.g:7045:2: '('
            {
             before(grammarAccess.getAboutSpecificationAccess().getLeftParenthesisKeyword_11()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAboutSpecificationAccess().getLeftParenthesisKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__11__Impl"


    // $ANTLR start "rule__AboutSpecification__Group__12"
    // InternalGreedySnake.g:7054:1: rule__AboutSpecification__Group__12 : rule__AboutSpecification__Group__12__Impl rule__AboutSpecification__Group__13 ;
    public final void rule__AboutSpecification__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7058:1: ( rule__AboutSpecification__Group__12__Impl rule__AboutSpecification__Group__13 )
            // InternalGreedySnake.g:7059:2: rule__AboutSpecification__Group__12__Impl rule__AboutSpecification__Group__13
            {
            pushFollow(FOLLOW_35);
            rule__AboutSpecification__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutSpecification__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__12"


    // $ANTLR start "rule__AboutSpecification__Group__12__Impl"
    // InternalGreedySnake.g:7066:1: rule__AboutSpecification__Group__12__Impl : ( ( rule__AboutSpecification__XAssignment_12 ) ) ;
    public final void rule__AboutSpecification__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7070:1: ( ( ( rule__AboutSpecification__XAssignment_12 ) ) )
            // InternalGreedySnake.g:7071:1: ( ( rule__AboutSpecification__XAssignment_12 ) )
            {
            // InternalGreedySnake.g:7071:1: ( ( rule__AboutSpecification__XAssignment_12 ) )
            // InternalGreedySnake.g:7072:2: ( rule__AboutSpecification__XAssignment_12 )
            {
             before(grammarAccess.getAboutSpecificationAccess().getXAssignment_12()); 
            // InternalGreedySnake.g:7073:2: ( rule__AboutSpecification__XAssignment_12 )
            // InternalGreedySnake.g:7073:3: rule__AboutSpecification__XAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__AboutSpecification__XAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getAboutSpecificationAccess().getXAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__12__Impl"


    // $ANTLR start "rule__AboutSpecification__Group__13"
    // InternalGreedySnake.g:7081:1: rule__AboutSpecification__Group__13 : rule__AboutSpecification__Group__13__Impl rule__AboutSpecification__Group__14 ;
    public final void rule__AboutSpecification__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7085:1: ( rule__AboutSpecification__Group__13__Impl rule__AboutSpecification__Group__14 )
            // InternalGreedySnake.g:7086:2: rule__AboutSpecification__Group__13__Impl rule__AboutSpecification__Group__14
            {
            pushFollow(FOLLOW_11);
            rule__AboutSpecification__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutSpecification__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__13"


    // $ANTLR start "rule__AboutSpecification__Group__13__Impl"
    // InternalGreedySnake.g:7093:1: rule__AboutSpecification__Group__13__Impl : ( ',' ) ;
    public final void rule__AboutSpecification__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7097:1: ( ( ',' ) )
            // InternalGreedySnake.g:7098:1: ( ',' )
            {
            // InternalGreedySnake.g:7098:1: ( ',' )
            // InternalGreedySnake.g:7099:2: ','
            {
             before(grammarAccess.getAboutSpecificationAccess().getCommaKeyword_13()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAboutSpecificationAccess().getCommaKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__13__Impl"


    // $ANTLR start "rule__AboutSpecification__Group__14"
    // InternalGreedySnake.g:7108:1: rule__AboutSpecification__Group__14 : rule__AboutSpecification__Group__14__Impl rule__AboutSpecification__Group__15 ;
    public final void rule__AboutSpecification__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7112:1: ( rule__AboutSpecification__Group__14__Impl rule__AboutSpecification__Group__15 )
            // InternalGreedySnake.g:7113:2: rule__AboutSpecification__Group__14__Impl rule__AboutSpecification__Group__15
            {
            pushFollow(FOLLOW_19);
            rule__AboutSpecification__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutSpecification__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__14"


    // $ANTLR start "rule__AboutSpecification__Group__14__Impl"
    // InternalGreedySnake.g:7120:1: rule__AboutSpecification__Group__14__Impl : ( ( rule__AboutSpecification__YAssignment_14 ) ) ;
    public final void rule__AboutSpecification__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7124:1: ( ( ( rule__AboutSpecification__YAssignment_14 ) ) )
            // InternalGreedySnake.g:7125:1: ( ( rule__AboutSpecification__YAssignment_14 ) )
            {
            // InternalGreedySnake.g:7125:1: ( ( rule__AboutSpecification__YAssignment_14 ) )
            // InternalGreedySnake.g:7126:2: ( rule__AboutSpecification__YAssignment_14 )
            {
             before(grammarAccess.getAboutSpecificationAccess().getYAssignment_14()); 
            // InternalGreedySnake.g:7127:2: ( rule__AboutSpecification__YAssignment_14 )
            // InternalGreedySnake.g:7127:3: rule__AboutSpecification__YAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__AboutSpecification__YAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getAboutSpecificationAccess().getYAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__14__Impl"


    // $ANTLR start "rule__AboutSpecification__Group__15"
    // InternalGreedySnake.g:7135:1: rule__AboutSpecification__Group__15 : rule__AboutSpecification__Group__15__Impl rule__AboutSpecification__Group__16 ;
    public final void rule__AboutSpecification__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7139:1: ( rule__AboutSpecification__Group__15__Impl rule__AboutSpecification__Group__16 )
            // InternalGreedySnake.g:7140:2: rule__AboutSpecification__Group__15__Impl rule__AboutSpecification__Group__16
            {
            pushFollow(FOLLOW_6);
            rule__AboutSpecification__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AboutSpecification__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__15"


    // $ANTLR start "rule__AboutSpecification__Group__15__Impl"
    // InternalGreedySnake.g:7147:1: rule__AboutSpecification__Group__15__Impl : ( ')' ) ;
    public final void rule__AboutSpecification__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7151:1: ( ( ')' ) )
            // InternalGreedySnake.g:7152:1: ( ')' )
            {
            // InternalGreedySnake.g:7152:1: ( ')' )
            // InternalGreedySnake.g:7153:2: ')'
            {
             before(grammarAccess.getAboutSpecificationAccess().getRightParenthesisKeyword_15()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAboutSpecificationAccess().getRightParenthesisKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__15__Impl"


    // $ANTLR start "rule__AboutSpecification__Group__16"
    // InternalGreedySnake.g:7162:1: rule__AboutSpecification__Group__16 : rule__AboutSpecification__Group__16__Impl ;
    public final void rule__AboutSpecification__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7166:1: ( rule__AboutSpecification__Group__16__Impl )
            // InternalGreedySnake.g:7167:2: rule__AboutSpecification__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AboutSpecification__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__16"


    // $ANTLR start "rule__AboutSpecification__Group__16__Impl"
    // InternalGreedySnake.g:7173:1: rule__AboutSpecification__Group__16__Impl : ( '}' ) ;
    public final void rule__AboutSpecification__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7177:1: ( ( '}' ) )
            // InternalGreedySnake.g:7178:1: ( '}' )
            {
            // InternalGreedySnake.g:7178:1: ( '}' )
            // InternalGreedySnake.g:7179:2: '}'
            {
             before(grammarAccess.getAboutSpecificationAccess().getRightCurlyBracketKeyword_16()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAboutSpecificationAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__Group__16__Impl"


    // $ANTLR start "rule__HelpSpecification__Group__0"
    // InternalGreedySnake.g:7189:1: rule__HelpSpecification__Group__0 : rule__HelpSpecification__Group__0__Impl rule__HelpSpecification__Group__1 ;
    public final void rule__HelpSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7193:1: ( rule__HelpSpecification__Group__0__Impl rule__HelpSpecification__Group__1 )
            // InternalGreedySnake.g:7194:2: rule__HelpSpecification__Group__0__Impl rule__HelpSpecification__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__HelpSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelpSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__0"


    // $ANTLR start "rule__HelpSpecification__Group__0__Impl"
    // InternalGreedySnake.g:7201:1: rule__HelpSpecification__Group__0__Impl : ( 'help' ) ;
    public final void rule__HelpSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7205:1: ( ( 'help' ) )
            // InternalGreedySnake.g:7206:1: ( 'help' )
            {
            // InternalGreedySnake.g:7206:1: ( 'help' )
            // InternalGreedySnake.g:7207:2: 'help'
            {
             before(grammarAccess.getHelpSpecificationAccess().getHelpKeyword_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getHelpSpecificationAccess().getHelpKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__0__Impl"


    // $ANTLR start "rule__HelpSpecification__Group__1"
    // InternalGreedySnake.g:7216:1: rule__HelpSpecification__Group__1 : rule__HelpSpecification__Group__1__Impl rule__HelpSpecification__Group__2 ;
    public final void rule__HelpSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7220:1: ( rule__HelpSpecification__Group__1__Impl rule__HelpSpecification__Group__2 )
            // InternalGreedySnake.g:7221:2: rule__HelpSpecification__Group__1__Impl rule__HelpSpecification__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__HelpSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelpSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__1"


    // $ANTLR start "rule__HelpSpecification__Group__1__Impl"
    // InternalGreedySnake.g:7228:1: rule__HelpSpecification__Group__1__Impl : ( ( rule__HelpSpecification__NameAssignment_1 ) ) ;
    public final void rule__HelpSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7232:1: ( ( ( rule__HelpSpecification__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:7233:1: ( ( rule__HelpSpecification__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:7233:1: ( ( rule__HelpSpecification__NameAssignment_1 ) )
            // InternalGreedySnake.g:7234:2: ( rule__HelpSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getHelpSpecificationAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:7235:2: ( rule__HelpSpecification__NameAssignment_1 )
            // InternalGreedySnake.g:7235:3: rule__HelpSpecification__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HelpSpecification__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHelpSpecificationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__1__Impl"


    // $ANTLR start "rule__HelpSpecification__Group__2"
    // InternalGreedySnake.g:7243:1: rule__HelpSpecification__Group__2 : rule__HelpSpecification__Group__2__Impl rule__HelpSpecification__Group__3 ;
    public final void rule__HelpSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7247:1: ( rule__HelpSpecification__Group__2__Impl rule__HelpSpecification__Group__3 )
            // InternalGreedySnake.g:7248:2: rule__HelpSpecification__Group__2__Impl rule__HelpSpecification__Group__3
            {
            pushFollow(FOLLOW_54);
            rule__HelpSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelpSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__2"


    // $ANTLR start "rule__HelpSpecification__Group__2__Impl"
    // InternalGreedySnake.g:7255:1: rule__HelpSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__HelpSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7259:1: ( ( '{' ) )
            // InternalGreedySnake.g:7260:1: ( '{' )
            {
            // InternalGreedySnake.g:7260:1: ( '{' )
            // InternalGreedySnake.g:7261:2: '{'
            {
             before(grammarAccess.getHelpSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getHelpSpecificationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__2__Impl"


    // $ANTLR start "rule__HelpSpecification__Group__3"
    // InternalGreedySnake.g:7270:1: rule__HelpSpecification__Group__3 : rule__HelpSpecification__Group__3__Impl rule__HelpSpecification__Group__4 ;
    public final void rule__HelpSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7274:1: ( rule__HelpSpecification__Group__3__Impl rule__HelpSpecification__Group__4 )
            // InternalGreedySnake.g:7275:2: rule__HelpSpecification__Group__3__Impl rule__HelpSpecification__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__HelpSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelpSpecification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__3"


    // $ANTLR start "rule__HelpSpecification__Group__3__Impl"
    // InternalGreedySnake.g:7282:1: rule__HelpSpecification__Group__3__Impl : ( 'Title' ) ;
    public final void rule__HelpSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7286:1: ( ( 'Title' ) )
            // InternalGreedySnake.g:7287:1: ( 'Title' )
            {
            // InternalGreedySnake.g:7287:1: ( 'Title' )
            // InternalGreedySnake.g:7288:2: 'Title'
            {
             before(grammarAccess.getHelpSpecificationAccess().getTitleKeyword_3()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getHelpSpecificationAccess().getTitleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__3__Impl"


    // $ANTLR start "rule__HelpSpecification__Group__4"
    // InternalGreedySnake.g:7297:1: rule__HelpSpecification__Group__4 : rule__HelpSpecification__Group__4__Impl rule__HelpSpecification__Group__5 ;
    public final void rule__HelpSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7301:1: ( rule__HelpSpecification__Group__4__Impl rule__HelpSpecification__Group__5 )
            // InternalGreedySnake.g:7302:2: rule__HelpSpecification__Group__4__Impl rule__HelpSpecification__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__HelpSpecification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelpSpecification__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__4"


    // $ANTLR start "rule__HelpSpecification__Group__4__Impl"
    // InternalGreedySnake.g:7309:1: rule__HelpSpecification__Group__4__Impl : ( ':' ) ;
    public final void rule__HelpSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7313:1: ( ( ':' ) )
            // InternalGreedySnake.g:7314:1: ( ':' )
            {
            // InternalGreedySnake.g:7314:1: ( ':' )
            // InternalGreedySnake.g:7315:2: ':'
            {
             before(grammarAccess.getHelpSpecificationAccess().getColonKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHelpSpecificationAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__4__Impl"


    // $ANTLR start "rule__HelpSpecification__Group__5"
    // InternalGreedySnake.g:7324:1: rule__HelpSpecification__Group__5 : rule__HelpSpecification__Group__5__Impl rule__HelpSpecification__Group__6 ;
    public final void rule__HelpSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7328:1: ( rule__HelpSpecification__Group__5__Impl rule__HelpSpecification__Group__6 )
            // InternalGreedySnake.g:7329:2: rule__HelpSpecification__Group__5__Impl rule__HelpSpecification__Group__6
            {
            pushFollow(FOLLOW_55);
            rule__HelpSpecification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelpSpecification__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__5"


    // $ANTLR start "rule__HelpSpecification__Group__5__Impl"
    // InternalGreedySnake.g:7336:1: rule__HelpSpecification__Group__5__Impl : ( ( rule__HelpSpecification__HelpTitleAssignment_5 ) ) ;
    public final void rule__HelpSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7340:1: ( ( ( rule__HelpSpecification__HelpTitleAssignment_5 ) ) )
            // InternalGreedySnake.g:7341:1: ( ( rule__HelpSpecification__HelpTitleAssignment_5 ) )
            {
            // InternalGreedySnake.g:7341:1: ( ( rule__HelpSpecification__HelpTitleAssignment_5 ) )
            // InternalGreedySnake.g:7342:2: ( rule__HelpSpecification__HelpTitleAssignment_5 )
            {
             before(grammarAccess.getHelpSpecificationAccess().getHelpTitleAssignment_5()); 
            // InternalGreedySnake.g:7343:2: ( rule__HelpSpecification__HelpTitleAssignment_5 )
            // InternalGreedySnake.g:7343:3: rule__HelpSpecification__HelpTitleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__HelpSpecification__HelpTitleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getHelpSpecificationAccess().getHelpTitleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__5__Impl"


    // $ANTLR start "rule__HelpSpecification__Group__6"
    // InternalGreedySnake.g:7351:1: rule__HelpSpecification__Group__6 : rule__HelpSpecification__Group__6__Impl rule__HelpSpecification__Group__7 ;
    public final void rule__HelpSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7355:1: ( rule__HelpSpecification__Group__6__Impl rule__HelpSpecification__Group__7 )
            // InternalGreedySnake.g:7356:2: rule__HelpSpecification__Group__6__Impl rule__HelpSpecification__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__HelpSpecification__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelpSpecification__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__6"


    // $ANTLR start "rule__HelpSpecification__Group__6__Impl"
    // InternalGreedySnake.g:7363:1: rule__HelpSpecification__Group__6__Impl : ( 'Information' ) ;
    public final void rule__HelpSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7367:1: ( ( 'Information' ) )
            // InternalGreedySnake.g:7368:1: ( 'Information' )
            {
            // InternalGreedySnake.g:7368:1: ( 'Information' )
            // InternalGreedySnake.g:7369:2: 'Information'
            {
             before(grammarAccess.getHelpSpecificationAccess().getInformationKeyword_6()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getHelpSpecificationAccess().getInformationKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__6__Impl"


    // $ANTLR start "rule__HelpSpecification__Group__7"
    // InternalGreedySnake.g:7378:1: rule__HelpSpecification__Group__7 : rule__HelpSpecification__Group__7__Impl rule__HelpSpecification__Group__8 ;
    public final void rule__HelpSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7382:1: ( rule__HelpSpecification__Group__7__Impl rule__HelpSpecification__Group__8 )
            // InternalGreedySnake.g:7383:2: rule__HelpSpecification__Group__7__Impl rule__HelpSpecification__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__HelpSpecification__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelpSpecification__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__7"


    // $ANTLR start "rule__HelpSpecification__Group__7__Impl"
    // InternalGreedySnake.g:7390:1: rule__HelpSpecification__Group__7__Impl : ( ':' ) ;
    public final void rule__HelpSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7394:1: ( ( ':' ) )
            // InternalGreedySnake.g:7395:1: ( ':' )
            {
            // InternalGreedySnake.g:7395:1: ( ':' )
            // InternalGreedySnake.g:7396:2: ':'
            {
             before(grammarAccess.getHelpSpecificationAccess().getColonKeyword_7()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHelpSpecificationAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__7__Impl"


    // $ANTLR start "rule__HelpSpecification__Group__8"
    // InternalGreedySnake.g:7405:1: rule__HelpSpecification__Group__8 : rule__HelpSpecification__Group__8__Impl rule__HelpSpecification__Group__9 ;
    public final void rule__HelpSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7409:1: ( rule__HelpSpecification__Group__8__Impl rule__HelpSpecification__Group__9 )
            // InternalGreedySnake.g:7410:2: rule__HelpSpecification__Group__8__Impl rule__HelpSpecification__Group__9
            {
            pushFollow(FOLLOW_56);
            rule__HelpSpecification__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelpSpecification__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__8"


    // $ANTLR start "rule__HelpSpecification__Group__8__Impl"
    // InternalGreedySnake.g:7417:1: rule__HelpSpecification__Group__8__Impl : ( ( rule__HelpSpecification__HelpInforAssignment_8 ) ) ;
    public final void rule__HelpSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7421:1: ( ( ( rule__HelpSpecification__HelpInforAssignment_8 ) ) )
            // InternalGreedySnake.g:7422:1: ( ( rule__HelpSpecification__HelpInforAssignment_8 ) )
            {
            // InternalGreedySnake.g:7422:1: ( ( rule__HelpSpecification__HelpInforAssignment_8 ) )
            // InternalGreedySnake.g:7423:2: ( rule__HelpSpecification__HelpInforAssignment_8 )
            {
             before(grammarAccess.getHelpSpecificationAccess().getHelpInforAssignment_8()); 
            // InternalGreedySnake.g:7424:2: ( rule__HelpSpecification__HelpInforAssignment_8 )
            // InternalGreedySnake.g:7424:3: rule__HelpSpecification__HelpInforAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__HelpSpecification__HelpInforAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getHelpSpecificationAccess().getHelpInforAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__8__Impl"


    // $ANTLR start "rule__HelpSpecification__Group__9"
    // InternalGreedySnake.g:7432:1: rule__HelpSpecification__Group__9 : rule__HelpSpecification__Group__9__Impl rule__HelpSpecification__Group__10 ;
    public final void rule__HelpSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7436:1: ( rule__HelpSpecification__Group__9__Impl rule__HelpSpecification__Group__10 )
            // InternalGreedySnake.g:7437:2: rule__HelpSpecification__Group__9__Impl rule__HelpSpecification__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__HelpSpecification__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelpSpecification__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__9"


    // $ANTLR start "rule__HelpSpecification__Group__9__Impl"
    // InternalGreedySnake.g:7444:1: rule__HelpSpecification__Group__9__Impl : ( 'Label_size' ) ;
    public final void rule__HelpSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7448:1: ( ( 'Label_size' ) )
            // InternalGreedySnake.g:7449:1: ( 'Label_size' )
            {
            // InternalGreedySnake.g:7449:1: ( 'Label_size' )
            // InternalGreedySnake.g:7450:2: 'Label_size'
            {
             before(grammarAccess.getHelpSpecificationAccess().getLabel_sizeKeyword_9()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getHelpSpecificationAccess().getLabel_sizeKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__9__Impl"


    // $ANTLR start "rule__HelpSpecification__Group__10"
    // InternalGreedySnake.g:7459:1: rule__HelpSpecification__Group__10 : rule__HelpSpecification__Group__10__Impl rule__HelpSpecification__Group__11 ;
    public final void rule__HelpSpecification__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7463:1: ( rule__HelpSpecification__Group__10__Impl rule__HelpSpecification__Group__11 )
            // InternalGreedySnake.g:7464:2: rule__HelpSpecification__Group__10__Impl rule__HelpSpecification__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__HelpSpecification__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelpSpecification__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__10"


    // $ANTLR start "rule__HelpSpecification__Group__10__Impl"
    // InternalGreedySnake.g:7471:1: rule__HelpSpecification__Group__10__Impl : ( ':' ) ;
    public final void rule__HelpSpecification__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7475:1: ( ( ':' ) )
            // InternalGreedySnake.g:7476:1: ( ':' )
            {
            // InternalGreedySnake.g:7476:1: ( ':' )
            // InternalGreedySnake.g:7477:2: ':'
            {
             before(grammarAccess.getHelpSpecificationAccess().getColonKeyword_10()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHelpSpecificationAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__10__Impl"


    // $ANTLR start "rule__HelpSpecification__Group__11"
    // InternalGreedySnake.g:7486:1: rule__HelpSpecification__Group__11 : rule__HelpSpecification__Group__11__Impl rule__HelpSpecification__Group__12 ;
    public final void rule__HelpSpecification__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7490:1: ( rule__HelpSpecification__Group__11__Impl rule__HelpSpecification__Group__12 )
            // InternalGreedySnake.g:7491:2: rule__HelpSpecification__Group__11__Impl rule__HelpSpecification__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__HelpSpecification__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelpSpecification__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__11"


    // $ANTLR start "rule__HelpSpecification__Group__11__Impl"
    // InternalGreedySnake.g:7498:1: rule__HelpSpecification__Group__11__Impl : ( '(' ) ;
    public final void rule__HelpSpecification__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7502:1: ( ( '(' ) )
            // InternalGreedySnake.g:7503:1: ( '(' )
            {
            // InternalGreedySnake.g:7503:1: ( '(' )
            // InternalGreedySnake.g:7504:2: '('
            {
             before(grammarAccess.getHelpSpecificationAccess().getLeftParenthesisKeyword_11()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getHelpSpecificationAccess().getLeftParenthesisKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__11__Impl"


    // $ANTLR start "rule__HelpSpecification__Group__12"
    // InternalGreedySnake.g:7513:1: rule__HelpSpecification__Group__12 : rule__HelpSpecification__Group__12__Impl rule__HelpSpecification__Group__13 ;
    public final void rule__HelpSpecification__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7517:1: ( rule__HelpSpecification__Group__12__Impl rule__HelpSpecification__Group__13 )
            // InternalGreedySnake.g:7518:2: rule__HelpSpecification__Group__12__Impl rule__HelpSpecification__Group__13
            {
            pushFollow(FOLLOW_35);
            rule__HelpSpecification__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelpSpecification__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__12"


    // $ANTLR start "rule__HelpSpecification__Group__12__Impl"
    // InternalGreedySnake.g:7525:1: rule__HelpSpecification__Group__12__Impl : ( ( rule__HelpSpecification__XAssignment_12 ) ) ;
    public final void rule__HelpSpecification__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7529:1: ( ( ( rule__HelpSpecification__XAssignment_12 ) ) )
            // InternalGreedySnake.g:7530:1: ( ( rule__HelpSpecification__XAssignment_12 ) )
            {
            // InternalGreedySnake.g:7530:1: ( ( rule__HelpSpecification__XAssignment_12 ) )
            // InternalGreedySnake.g:7531:2: ( rule__HelpSpecification__XAssignment_12 )
            {
             before(grammarAccess.getHelpSpecificationAccess().getXAssignment_12()); 
            // InternalGreedySnake.g:7532:2: ( rule__HelpSpecification__XAssignment_12 )
            // InternalGreedySnake.g:7532:3: rule__HelpSpecification__XAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__HelpSpecification__XAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getHelpSpecificationAccess().getXAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__12__Impl"


    // $ANTLR start "rule__HelpSpecification__Group__13"
    // InternalGreedySnake.g:7540:1: rule__HelpSpecification__Group__13 : rule__HelpSpecification__Group__13__Impl rule__HelpSpecification__Group__14 ;
    public final void rule__HelpSpecification__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7544:1: ( rule__HelpSpecification__Group__13__Impl rule__HelpSpecification__Group__14 )
            // InternalGreedySnake.g:7545:2: rule__HelpSpecification__Group__13__Impl rule__HelpSpecification__Group__14
            {
            pushFollow(FOLLOW_11);
            rule__HelpSpecification__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelpSpecification__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__13"


    // $ANTLR start "rule__HelpSpecification__Group__13__Impl"
    // InternalGreedySnake.g:7552:1: rule__HelpSpecification__Group__13__Impl : ( ',' ) ;
    public final void rule__HelpSpecification__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7556:1: ( ( ',' ) )
            // InternalGreedySnake.g:7557:1: ( ',' )
            {
            // InternalGreedySnake.g:7557:1: ( ',' )
            // InternalGreedySnake.g:7558:2: ','
            {
             before(grammarAccess.getHelpSpecificationAccess().getCommaKeyword_13()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getHelpSpecificationAccess().getCommaKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__13__Impl"


    // $ANTLR start "rule__HelpSpecification__Group__14"
    // InternalGreedySnake.g:7567:1: rule__HelpSpecification__Group__14 : rule__HelpSpecification__Group__14__Impl rule__HelpSpecification__Group__15 ;
    public final void rule__HelpSpecification__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7571:1: ( rule__HelpSpecification__Group__14__Impl rule__HelpSpecification__Group__15 )
            // InternalGreedySnake.g:7572:2: rule__HelpSpecification__Group__14__Impl rule__HelpSpecification__Group__15
            {
            pushFollow(FOLLOW_19);
            rule__HelpSpecification__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelpSpecification__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__14"


    // $ANTLR start "rule__HelpSpecification__Group__14__Impl"
    // InternalGreedySnake.g:7579:1: rule__HelpSpecification__Group__14__Impl : ( ( rule__HelpSpecification__YAssignment_14 ) ) ;
    public final void rule__HelpSpecification__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7583:1: ( ( ( rule__HelpSpecification__YAssignment_14 ) ) )
            // InternalGreedySnake.g:7584:1: ( ( rule__HelpSpecification__YAssignment_14 ) )
            {
            // InternalGreedySnake.g:7584:1: ( ( rule__HelpSpecification__YAssignment_14 ) )
            // InternalGreedySnake.g:7585:2: ( rule__HelpSpecification__YAssignment_14 )
            {
             before(grammarAccess.getHelpSpecificationAccess().getYAssignment_14()); 
            // InternalGreedySnake.g:7586:2: ( rule__HelpSpecification__YAssignment_14 )
            // InternalGreedySnake.g:7586:3: rule__HelpSpecification__YAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__HelpSpecification__YAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getHelpSpecificationAccess().getYAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__14__Impl"


    // $ANTLR start "rule__HelpSpecification__Group__15"
    // InternalGreedySnake.g:7594:1: rule__HelpSpecification__Group__15 : rule__HelpSpecification__Group__15__Impl rule__HelpSpecification__Group__16 ;
    public final void rule__HelpSpecification__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7598:1: ( rule__HelpSpecification__Group__15__Impl rule__HelpSpecification__Group__16 )
            // InternalGreedySnake.g:7599:2: rule__HelpSpecification__Group__15__Impl rule__HelpSpecification__Group__16
            {
            pushFollow(FOLLOW_6);
            rule__HelpSpecification__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelpSpecification__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__15"


    // $ANTLR start "rule__HelpSpecification__Group__15__Impl"
    // InternalGreedySnake.g:7606:1: rule__HelpSpecification__Group__15__Impl : ( ')' ) ;
    public final void rule__HelpSpecification__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7610:1: ( ( ')' ) )
            // InternalGreedySnake.g:7611:1: ( ')' )
            {
            // InternalGreedySnake.g:7611:1: ( ')' )
            // InternalGreedySnake.g:7612:2: ')'
            {
             before(grammarAccess.getHelpSpecificationAccess().getRightParenthesisKeyword_15()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getHelpSpecificationAccess().getRightParenthesisKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__15__Impl"


    // $ANTLR start "rule__HelpSpecification__Group__16"
    // InternalGreedySnake.g:7621:1: rule__HelpSpecification__Group__16 : rule__HelpSpecification__Group__16__Impl ;
    public final void rule__HelpSpecification__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7625:1: ( rule__HelpSpecification__Group__16__Impl )
            // InternalGreedySnake.g:7626:2: rule__HelpSpecification__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HelpSpecification__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__16"


    // $ANTLR start "rule__HelpSpecification__Group__16__Impl"
    // InternalGreedySnake.g:7632:1: rule__HelpSpecification__Group__16__Impl : ( '}' ) ;
    public final void rule__HelpSpecification__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7636:1: ( ( '}' ) )
            // InternalGreedySnake.g:7637:1: ( '}' )
            {
            // InternalGreedySnake.g:7637:1: ( '}' )
            // InternalGreedySnake.g:7638:2: '}'
            {
             before(grammarAccess.getHelpSpecificationAccess().getRightCurlyBracketKeyword_16()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHelpSpecificationAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__Group__16__Impl"


    // $ANTLR start "rule__BackSpecification__Group__0"
    // InternalGreedySnake.g:7648:1: rule__BackSpecification__Group__0 : rule__BackSpecification__Group__0__Impl rule__BackSpecification__Group__1 ;
    public final void rule__BackSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7652:1: ( rule__BackSpecification__Group__0__Impl rule__BackSpecification__Group__1 )
            // InternalGreedySnake.g:7653:2: rule__BackSpecification__Group__0__Impl rule__BackSpecification__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BackSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__0"


    // $ANTLR start "rule__BackSpecification__Group__0__Impl"
    // InternalGreedySnake.g:7660:1: rule__BackSpecification__Group__0__Impl : ( 'backGround' ) ;
    public final void rule__BackSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7664:1: ( ( 'backGround' ) )
            // InternalGreedySnake.g:7665:1: ( 'backGround' )
            {
            // InternalGreedySnake.g:7665:1: ( 'backGround' )
            // InternalGreedySnake.g:7666:2: 'backGround'
            {
             before(grammarAccess.getBackSpecificationAccess().getBackGroundKeyword_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getBackSpecificationAccess().getBackGroundKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__0__Impl"


    // $ANTLR start "rule__BackSpecification__Group__1"
    // InternalGreedySnake.g:7675:1: rule__BackSpecification__Group__1 : rule__BackSpecification__Group__1__Impl rule__BackSpecification__Group__2 ;
    public final void rule__BackSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7679:1: ( rule__BackSpecification__Group__1__Impl rule__BackSpecification__Group__2 )
            // InternalGreedySnake.g:7680:2: rule__BackSpecification__Group__1__Impl rule__BackSpecification__Group__2
            {
            pushFollow(FOLLOW_57);
            rule__BackSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__1"


    // $ANTLR start "rule__BackSpecification__Group__1__Impl"
    // InternalGreedySnake.g:7687:1: rule__BackSpecification__Group__1__Impl : ( '{' ) ;
    public final void rule__BackSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7691:1: ( ( '{' ) )
            // InternalGreedySnake.g:7692:1: ( '{' )
            {
            // InternalGreedySnake.g:7692:1: ( '{' )
            // InternalGreedySnake.g:7693:2: '{'
            {
             before(grammarAccess.getBackSpecificationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBackSpecificationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__1__Impl"


    // $ANTLR start "rule__BackSpecification__Group__2"
    // InternalGreedySnake.g:7702:1: rule__BackSpecification__Group__2 : rule__BackSpecification__Group__2__Impl rule__BackSpecification__Group__3 ;
    public final void rule__BackSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7706:1: ( rule__BackSpecification__Group__2__Impl rule__BackSpecification__Group__3 )
            // InternalGreedySnake.g:7707:2: rule__BackSpecification__Group__2__Impl rule__BackSpecification__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__BackSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__2"


    // $ANTLR start "rule__BackSpecification__Group__2__Impl"
    // InternalGreedySnake.g:7714:1: rule__BackSpecification__Group__2__Impl : ( 'Icon' ) ;
    public final void rule__BackSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7718:1: ( ( 'Icon' ) )
            // InternalGreedySnake.g:7719:1: ( 'Icon' )
            {
            // InternalGreedySnake.g:7719:1: ( 'Icon' )
            // InternalGreedySnake.g:7720:2: 'Icon'
            {
             before(grammarAccess.getBackSpecificationAccess().getIconKeyword_2()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getBackSpecificationAccess().getIconKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__2__Impl"


    // $ANTLR start "rule__BackSpecification__Group__3"
    // InternalGreedySnake.g:7729:1: rule__BackSpecification__Group__3 : rule__BackSpecification__Group__3__Impl rule__BackSpecification__Group__4 ;
    public final void rule__BackSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7733:1: ( rule__BackSpecification__Group__3__Impl rule__BackSpecification__Group__4 )
            // InternalGreedySnake.g:7734:2: rule__BackSpecification__Group__3__Impl rule__BackSpecification__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__BackSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackSpecification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__3"


    // $ANTLR start "rule__BackSpecification__Group__3__Impl"
    // InternalGreedySnake.g:7741:1: rule__BackSpecification__Group__3__Impl : ( '{' ) ;
    public final void rule__BackSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7745:1: ( ( '{' ) )
            // InternalGreedySnake.g:7746:1: ( '{' )
            {
            // InternalGreedySnake.g:7746:1: ( '{' )
            // InternalGreedySnake.g:7747:2: '{'
            {
             before(grammarAccess.getBackSpecificationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBackSpecificationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__3__Impl"


    // $ANTLR start "rule__BackSpecification__Group__4"
    // InternalGreedySnake.g:7756:1: rule__BackSpecification__Group__4 : rule__BackSpecification__Group__4__Impl rule__BackSpecification__Group__5 ;
    public final void rule__BackSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7760:1: ( rule__BackSpecification__Group__4__Impl rule__BackSpecification__Group__5 )
            // InternalGreedySnake.g:7761:2: rule__BackSpecification__Group__4__Impl rule__BackSpecification__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__BackSpecification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackSpecification__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__4"


    // $ANTLR start "rule__BackSpecification__Group__4__Impl"
    // InternalGreedySnake.g:7768:1: rule__BackSpecification__Group__4__Impl : ( ( rule__BackSpecification__BackgroundIconAssignment_4 ) ) ;
    public final void rule__BackSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7772:1: ( ( ( rule__BackSpecification__BackgroundIconAssignment_4 ) ) )
            // InternalGreedySnake.g:7773:1: ( ( rule__BackSpecification__BackgroundIconAssignment_4 ) )
            {
            // InternalGreedySnake.g:7773:1: ( ( rule__BackSpecification__BackgroundIconAssignment_4 ) )
            // InternalGreedySnake.g:7774:2: ( rule__BackSpecification__BackgroundIconAssignment_4 )
            {
             before(grammarAccess.getBackSpecificationAccess().getBackgroundIconAssignment_4()); 
            // InternalGreedySnake.g:7775:2: ( rule__BackSpecification__BackgroundIconAssignment_4 )
            // InternalGreedySnake.g:7775:3: rule__BackSpecification__BackgroundIconAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BackSpecification__BackgroundIconAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBackSpecificationAccess().getBackgroundIconAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__4__Impl"


    // $ANTLR start "rule__BackSpecification__Group__5"
    // InternalGreedySnake.g:7783:1: rule__BackSpecification__Group__5 : rule__BackSpecification__Group__5__Impl rule__BackSpecification__Group__6 ;
    public final void rule__BackSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7787:1: ( rule__BackSpecification__Group__5__Impl rule__BackSpecification__Group__6 )
            // InternalGreedySnake.g:7788:2: rule__BackSpecification__Group__5__Impl rule__BackSpecification__Group__6
            {
            pushFollow(FOLLOW_58);
            rule__BackSpecification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackSpecification__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__5"


    // $ANTLR start "rule__BackSpecification__Group__5__Impl"
    // InternalGreedySnake.g:7795:1: rule__BackSpecification__Group__5__Impl : ( '}' ) ;
    public final void rule__BackSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7799:1: ( ( '}' ) )
            // InternalGreedySnake.g:7800:1: ( '}' )
            {
            // InternalGreedySnake.g:7800:1: ( '}' )
            // InternalGreedySnake.g:7801:2: '}'
            {
             before(grammarAccess.getBackSpecificationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBackSpecificationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__5__Impl"


    // $ANTLR start "rule__BackSpecification__Group__6"
    // InternalGreedySnake.g:7810:1: rule__BackSpecification__Group__6 : rule__BackSpecification__Group__6__Impl rule__BackSpecification__Group__7 ;
    public final void rule__BackSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7814:1: ( rule__BackSpecification__Group__6__Impl rule__BackSpecification__Group__7 )
            // InternalGreedySnake.g:7815:2: rule__BackSpecification__Group__6__Impl rule__BackSpecification__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__BackSpecification__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackSpecification__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__6"


    // $ANTLR start "rule__BackSpecification__Group__6__Impl"
    // InternalGreedySnake.g:7822:1: rule__BackSpecification__Group__6__Impl : ( 'Height' ) ;
    public final void rule__BackSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7826:1: ( ( 'Height' ) )
            // InternalGreedySnake.g:7827:1: ( 'Height' )
            {
            // InternalGreedySnake.g:7827:1: ( 'Height' )
            // InternalGreedySnake.g:7828:2: 'Height'
            {
             before(grammarAccess.getBackSpecificationAccess().getHeightKeyword_6()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getBackSpecificationAccess().getHeightKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__6__Impl"


    // $ANTLR start "rule__BackSpecification__Group__7"
    // InternalGreedySnake.g:7837:1: rule__BackSpecification__Group__7 : rule__BackSpecification__Group__7__Impl rule__BackSpecification__Group__8 ;
    public final void rule__BackSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7841:1: ( rule__BackSpecification__Group__7__Impl rule__BackSpecification__Group__8 )
            // InternalGreedySnake.g:7842:2: rule__BackSpecification__Group__7__Impl rule__BackSpecification__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__BackSpecification__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackSpecification__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__7"


    // $ANTLR start "rule__BackSpecification__Group__7__Impl"
    // InternalGreedySnake.g:7849:1: rule__BackSpecification__Group__7__Impl : ( '=' ) ;
    public final void rule__BackSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7853:1: ( ( '=' ) )
            // InternalGreedySnake.g:7854:1: ( '=' )
            {
            // InternalGreedySnake.g:7854:1: ( '=' )
            // InternalGreedySnake.g:7855:2: '='
            {
             before(grammarAccess.getBackSpecificationAccess().getEqualsSignKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBackSpecificationAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__7__Impl"


    // $ANTLR start "rule__BackSpecification__Group__8"
    // InternalGreedySnake.g:7864:1: rule__BackSpecification__Group__8 : rule__BackSpecification__Group__8__Impl rule__BackSpecification__Group__9 ;
    public final void rule__BackSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7868:1: ( rule__BackSpecification__Group__8__Impl rule__BackSpecification__Group__9 )
            // InternalGreedySnake.g:7869:2: rule__BackSpecification__Group__8__Impl rule__BackSpecification__Group__9
            {
            pushFollow(FOLLOW_59);
            rule__BackSpecification__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackSpecification__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__8"


    // $ANTLR start "rule__BackSpecification__Group__8__Impl"
    // InternalGreedySnake.g:7876:1: rule__BackSpecification__Group__8__Impl : ( ( rule__BackSpecification__BackGroundHeightAssignment_8 ) ) ;
    public final void rule__BackSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7880:1: ( ( ( rule__BackSpecification__BackGroundHeightAssignment_8 ) ) )
            // InternalGreedySnake.g:7881:1: ( ( rule__BackSpecification__BackGroundHeightAssignment_8 ) )
            {
            // InternalGreedySnake.g:7881:1: ( ( rule__BackSpecification__BackGroundHeightAssignment_8 ) )
            // InternalGreedySnake.g:7882:2: ( rule__BackSpecification__BackGroundHeightAssignment_8 )
            {
             before(grammarAccess.getBackSpecificationAccess().getBackGroundHeightAssignment_8()); 
            // InternalGreedySnake.g:7883:2: ( rule__BackSpecification__BackGroundHeightAssignment_8 )
            // InternalGreedySnake.g:7883:3: rule__BackSpecification__BackGroundHeightAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__BackSpecification__BackGroundHeightAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getBackSpecificationAccess().getBackGroundHeightAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__8__Impl"


    // $ANTLR start "rule__BackSpecification__Group__9"
    // InternalGreedySnake.g:7891:1: rule__BackSpecification__Group__9 : rule__BackSpecification__Group__9__Impl rule__BackSpecification__Group__10 ;
    public final void rule__BackSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7895:1: ( rule__BackSpecification__Group__9__Impl rule__BackSpecification__Group__10 )
            // InternalGreedySnake.g:7896:2: rule__BackSpecification__Group__9__Impl rule__BackSpecification__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__BackSpecification__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackSpecification__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__9"


    // $ANTLR start "rule__BackSpecification__Group__9__Impl"
    // InternalGreedySnake.g:7903:1: rule__BackSpecification__Group__9__Impl : ( 'Width' ) ;
    public final void rule__BackSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7907:1: ( ( 'Width' ) )
            // InternalGreedySnake.g:7908:1: ( 'Width' )
            {
            // InternalGreedySnake.g:7908:1: ( 'Width' )
            // InternalGreedySnake.g:7909:2: 'Width'
            {
             before(grammarAccess.getBackSpecificationAccess().getWidthKeyword_9()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getBackSpecificationAccess().getWidthKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__9__Impl"


    // $ANTLR start "rule__BackSpecification__Group__10"
    // InternalGreedySnake.g:7918:1: rule__BackSpecification__Group__10 : rule__BackSpecification__Group__10__Impl rule__BackSpecification__Group__11 ;
    public final void rule__BackSpecification__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7922:1: ( rule__BackSpecification__Group__10__Impl rule__BackSpecification__Group__11 )
            // InternalGreedySnake.g:7923:2: rule__BackSpecification__Group__10__Impl rule__BackSpecification__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__BackSpecification__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackSpecification__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__10"


    // $ANTLR start "rule__BackSpecification__Group__10__Impl"
    // InternalGreedySnake.g:7930:1: rule__BackSpecification__Group__10__Impl : ( '=' ) ;
    public final void rule__BackSpecification__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7934:1: ( ( '=' ) )
            // InternalGreedySnake.g:7935:1: ( '=' )
            {
            // InternalGreedySnake.g:7935:1: ( '=' )
            // InternalGreedySnake.g:7936:2: '='
            {
             before(grammarAccess.getBackSpecificationAccess().getEqualsSignKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBackSpecificationAccess().getEqualsSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__10__Impl"


    // $ANTLR start "rule__BackSpecification__Group__11"
    // InternalGreedySnake.g:7945:1: rule__BackSpecification__Group__11 : rule__BackSpecification__Group__11__Impl rule__BackSpecification__Group__12 ;
    public final void rule__BackSpecification__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7949:1: ( rule__BackSpecification__Group__11__Impl rule__BackSpecification__Group__12 )
            // InternalGreedySnake.g:7950:2: rule__BackSpecification__Group__11__Impl rule__BackSpecification__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__BackSpecification__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackSpecification__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__11"


    // $ANTLR start "rule__BackSpecification__Group__11__Impl"
    // InternalGreedySnake.g:7957:1: rule__BackSpecification__Group__11__Impl : ( ( rule__BackSpecification__BackGroundWidthAssignment_11 ) ) ;
    public final void rule__BackSpecification__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7961:1: ( ( ( rule__BackSpecification__BackGroundWidthAssignment_11 ) ) )
            // InternalGreedySnake.g:7962:1: ( ( rule__BackSpecification__BackGroundWidthAssignment_11 ) )
            {
            // InternalGreedySnake.g:7962:1: ( ( rule__BackSpecification__BackGroundWidthAssignment_11 ) )
            // InternalGreedySnake.g:7963:2: ( rule__BackSpecification__BackGroundWidthAssignment_11 )
            {
             before(grammarAccess.getBackSpecificationAccess().getBackGroundWidthAssignment_11()); 
            // InternalGreedySnake.g:7964:2: ( rule__BackSpecification__BackGroundWidthAssignment_11 )
            // InternalGreedySnake.g:7964:3: rule__BackSpecification__BackGroundWidthAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__BackSpecification__BackGroundWidthAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getBackSpecificationAccess().getBackGroundWidthAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__11__Impl"


    // $ANTLR start "rule__BackSpecification__Group__12"
    // InternalGreedySnake.g:7972:1: rule__BackSpecification__Group__12 : rule__BackSpecification__Group__12__Impl ;
    public final void rule__BackSpecification__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7976:1: ( rule__BackSpecification__Group__12__Impl )
            // InternalGreedySnake.g:7977:2: rule__BackSpecification__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BackSpecification__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__12"


    // $ANTLR start "rule__BackSpecification__Group__12__Impl"
    // InternalGreedySnake.g:7983:1: rule__BackSpecification__Group__12__Impl : ( '}' ) ;
    public final void rule__BackSpecification__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7987:1: ( ( '}' ) )
            // InternalGreedySnake.g:7988:1: ( '}' )
            {
            // InternalGreedySnake.g:7988:1: ( '}' )
            // InternalGreedySnake.g:7989:2: '}'
            {
             before(grammarAccess.getBackSpecificationAccess().getRightCurlyBracketKeyword_12()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBackSpecificationAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__Group__12__Impl"


    // $ANTLR start "rule__BackgroundIcon__Group__0"
    // InternalGreedySnake.g:7999:1: rule__BackgroundIcon__Group__0 : rule__BackgroundIcon__Group__0__Impl rule__BackgroundIcon__Group__1 ;
    public final void rule__BackgroundIcon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8003:1: ( rule__BackgroundIcon__Group__0__Impl rule__BackgroundIcon__Group__1 )
            // InternalGreedySnake.g:8004:2: rule__BackgroundIcon__Group__0__Impl rule__BackgroundIcon__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BackgroundIcon__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackgroundIcon__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundIcon__Group__0"


    // $ANTLR start "rule__BackgroundIcon__Group__0__Impl"
    // InternalGreedySnake.g:8011:1: rule__BackgroundIcon__Group__0__Impl : ( () ) ;
    public final void rule__BackgroundIcon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8015:1: ( ( () ) )
            // InternalGreedySnake.g:8016:1: ( () )
            {
            // InternalGreedySnake.g:8016:1: ( () )
            // InternalGreedySnake.g:8017:2: ()
            {
             before(grammarAccess.getBackgroundIconAccess().getBackgroundIconAction_0()); 
            // InternalGreedySnake.g:8018:2: ()
            // InternalGreedySnake.g:8018:3: 
            {
            }

             after(grammarAccess.getBackgroundIconAccess().getBackgroundIconAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundIcon__Group__0__Impl"


    // $ANTLR start "rule__BackgroundIcon__Group__1"
    // InternalGreedySnake.g:8026:1: rule__BackgroundIcon__Group__1 : rule__BackgroundIcon__Group__1__Impl ;
    public final void rule__BackgroundIcon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8030:1: ( rule__BackgroundIcon__Group__1__Impl )
            // InternalGreedySnake.g:8031:2: rule__BackgroundIcon__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BackgroundIcon__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundIcon__Group__1"


    // $ANTLR start "rule__BackgroundIcon__Group__1__Impl"
    // InternalGreedySnake.g:8037:1: rule__BackgroundIcon__Group__1__Impl : ( ( rule__BackgroundIcon__BackgroundTagAssignment_1 )* ) ;
    public final void rule__BackgroundIcon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8041:1: ( ( ( rule__BackgroundIcon__BackgroundTagAssignment_1 )* ) )
            // InternalGreedySnake.g:8042:1: ( ( rule__BackgroundIcon__BackgroundTagAssignment_1 )* )
            {
            // InternalGreedySnake.g:8042:1: ( ( rule__BackgroundIcon__BackgroundTagAssignment_1 )* )
            // InternalGreedySnake.g:8043:2: ( rule__BackgroundIcon__BackgroundTagAssignment_1 )*
            {
             before(grammarAccess.getBackgroundIconAccess().getBackgroundTagAssignment_1()); 
            // InternalGreedySnake.g:8044:2: ( rule__BackgroundIcon__BackgroundTagAssignment_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGreedySnake.g:8044:3: rule__BackgroundIcon__BackgroundTagAssignment_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__BackgroundIcon__BackgroundTagAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getBackgroundIconAccess().getBackgroundTagAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundIcon__Group__1__Impl"


    // $ANTLR start "rule__BackgroundTag__Group__0"
    // InternalGreedySnake.g:8053:1: rule__BackgroundTag__Group__0 : rule__BackgroundTag__Group__0__Impl rule__BackgroundTag__Group__1 ;
    public final void rule__BackgroundTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8057:1: ( rule__BackgroundTag__Group__0__Impl rule__BackgroundTag__Group__1 )
            // InternalGreedySnake.g:8058:2: rule__BackgroundTag__Group__0__Impl rule__BackgroundTag__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__BackgroundTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackgroundTag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundTag__Group__0"


    // $ANTLR start "rule__BackgroundTag__Group__0__Impl"
    // InternalGreedySnake.g:8065:1: rule__BackgroundTag__Group__0__Impl : ( ( rule__BackgroundTag__NameAssignment_0 ) ) ;
    public final void rule__BackgroundTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8069:1: ( ( ( rule__BackgroundTag__NameAssignment_0 ) ) )
            // InternalGreedySnake.g:8070:1: ( ( rule__BackgroundTag__NameAssignment_0 ) )
            {
            // InternalGreedySnake.g:8070:1: ( ( rule__BackgroundTag__NameAssignment_0 ) )
            // InternalGreedySnake.g:8071:2: ( rule__BackgroundTag__NameAssignment_0 )
            {
             before(grammarAccess.getBackgroundTagAccess().getNameAssignment_0()); 
            // InternalGreedySnake.g:8072:2: ( rule__BackgroundTag__NameAssignment_0 )
            // InternalGreedySnake.g:8072:3: rule__BackgroundTag__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BackgroundTag__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundTagAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundTag__Group__0__Impl"


    // $ANTLR start "rule__BackgroundTag__Group__1"
    // InternalGreedySnake.g:8080:1: rule__BackgroundTag__Group__1 : rule__BackgroundTag__Group__1__Impl rule__BackgroundTag__Group__2 ;
    public final void rule__BackgroundTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8084:1: ( rule__BackgroundTag__Group__1__Impl rule__BackgroundTag__Group__2 )
            // InternalGreedySnake.g:8085:2: rule__BackgroundTag__Group__1__Impl rule__BackgroundTag__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__BackgroundTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackgroundTag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundTag__Group__1"


    // $ANTLR start "rule__BackgroundTag__Group__1__Impl"
    // InternalGreedySnake.g:8092:1: rule__BackgroundTag__Group__1__Impl : ( ( rule__BackgroundTag__ValueAssignment_1 ) ) ;
    public final void rule__BackgroundTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8096:1: ( ( ( rule__BackgroundTag__ValueAssignment_1 ) ) )
            // InternalGreedySnake.g:8097:1: ( ( rule__BackgroundTag__ValueAssignment_1 ) )
            {
            // InternalGreedySnake.g:8097:1: ( ( rule__BackgroundTag__ValueAssignment_1 ) )
            // InternalGreedySnake.g:8098:2: ( rule__BackgroundTag__ValueAssignment_1 )
            {
             before(grammarAccess.getBackgroundTagAccess().getValueAssignment_1()); 
            // InternalGreedySnake.g:8099:2: ( rule__BackgroundTag__ValueAssignment_1 )
            // InternalGreedySnake.g:8099:3: rule__BackgroundTag__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BackgroundTag__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundTagAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundTag__Group__1__Impl"


    // $ANTLR start "rule__BackgroundTag__Group__2"
    // InternalGreedySnake.g:8107:1: rule__BackgroundTag__Group__2 : rule__BackgroundTag__Group__2__Impl rule__BackgroundTag__Group__3 ;
    public final void rule__BackgroundTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8111:1: ( rule__BackgroundTag__Group__2__Impl rule__BackgroundTag__Group__3 )
            // InternalGreedySnake.g:8112:2: rule__BackgroundTag__Group__2__Impl rule__BackgroundTag__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__BackgroundTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackgroundTag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundTag__Group__2"


    // $ANTLR start "rule__BackgroundTag__Group__2__Impl"
    // InternalGreedySnake.g:8119:1: rule__BackgroundTag__Group__2__Impl : ( '=' ) ;
    public final void rule__BackgroundTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8123:1: ( ( '=' ) )
            // InternalGreedySnake.g:8124:1: ( '=' )
            {
            // InternalGreedySnake.g:8124:1: ( '=' )
            // InternalGreedySnake.g:8125:2: '='
            {
             before(grammarAccess.getBackgroundTagAccess().getEqualsSignKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBackgroundTagAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundTag__Group__2__Impl"


    // $ANTLR start "rule__BackgroundTag__Group__3"
    // InternalGreedySnake.g:8134:1: rule__BackgroundTag__Group__3 : rule__BackgroundTag__Group__3__Impl rule__BackgroundTag__Group__4 ;
    public final void rule__BackgroundTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8138:1: ( rule__BackgroundTag__Group__3__Impl rule__BackgroundTag__Group__4 )
            // InternalGreedySnake.g:8139:2: rule__BackgroundTag__Group__3__Impl rule__BackgroundTag__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__BackgroundTag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackgroundTag__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundTag__Group__3"


    // $ANTLR start "rule__BackgroundTag__Group__3__Impl"
    // InternalGreedySnake.g:8146:1: rule__BackgroundTag__Group__3__Impl : ( ( rule__BackgroundTag__BKtagAssignment_3 ) ) ;
    public final void rule__BackgroundTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8150:1: ( ( ( rule__BackgroundTag__BKtagAssignment_3 ) ) )
            // InternalGreedySnake.g:8151:1: ( ( rule__BackgroundTag__BKtagAssignment_3 ) )
            {
            // InternalGreedySnake.g:8151:1: ( ( rule__BackgroundTag__BKtagAssignment_3 ) )
            // InternalGreedySnake.g:8152:2: ( rule__BackgroundTag__BKtagAssignment_3 )
            {
             before(grammarAccess.getBackgroundTagAccess().getBKtagAssignment_3()); 
            // InternalGreedySnake.g:8153:2: ( rule__BackgroundTag__BKtagAssignment_3 )
            // InternalGreedySnake.g:8153:3: rule__BackgroundTag__BKtagAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BackgroundTag__BKtagAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundTagAccess().getBKtagAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundTag__Group__3__Impl"


    // $ANTLR start "rule__BackgroundTag__Group__4"
    // InternalGreedySnake.g:8161:1: rule__BackgroundTag__Group__4 : rule__BackgroundTag__Group__4__Impl rule__BackgroundTag__Group__5 ;
    public final void rule__BackgroundTag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8165:1: ( rule__BackgroundTag__Group__4__Impl rule__BackgroundTag__Group__5 )
            // InternalGreedySnake.g:8166:2: rule__BackgroundTag__Group__4__Impl rule__BackgroundTag__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__BackgroundTag__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackgroundTag__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundTag__Group__4"


    // $ANTLR start "rule__BackgroundTag__Group__4__Impl"
    // InternalGreedySnake.g:8173:1: rule__BackgroundTag__Group__4__Impl : ( 'Locate' ) ;
    public final void rule__BackgroundTag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8177:1: ( ( 'Locate' ) )
            // InternalGreedySnake.g:8178:1: ( 'Locate' )
            {
            // InternalGreedySnake.g:8178:1: ( 'Locate' )
            // InternalGreedySnake.g:8179:2: 'Locate'
            {
             before(grammarAccess.getBackgroundTagAccess().getLocateKeyword_4()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getBackgroundTagAccess().getLocateKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundTag__Group__4__Impl"


    // $ANTLR start "rule__BackgroundTag__Group__5"
    // InternalGreedySnake.g:8188:1: rule__BackgroundTag__Group__5 : rule__BackgroundTag__Group__5__Impl rule__BackgroundTag__Group__6 ;
    public final void rule__BackgroundTag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8192:1: ( rule__BackgroundTag__Group__5__Impl rule__BackgroundTag__Group__6 )
            // InternalGreedySnake.g:8193:2: rule__BackgroundTag__Group__5__Impl rule__BackgroundTag__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__BackgroundTag__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackgroundTag__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundTag__Group__5"


    // $ANTLR start "rule__BackgroundTag__Group__5__Impl"
    // InternalGreedySnake.g:8200:1: rule__BackgroundTag__Group__5__Impl : ( ':' ) ;
    public final void rule__BackgroundTag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8204:1: ( ( ':' ) )
            // InternalGreedySnake.g:8205:1: ( ':' )
            {
            // InternalGreedySnake.g:8205:1: ( ':' )
            // InternalGreedySnake.g:8206:2: ':'
            {
             before(grammarAccess.getBackgroundTagAccess().getColonKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBackgroundTagAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundTag__Group__5__Impl"


    // $ANTLR start "rule__BackgroundTag__Group__6"
    // InternalGreedySnake.g:8215:1: rule__BackgroundTag__Group__6 : rule__BackgroundTag__Group__6__Impl ;
    public final void rule__BackgroundTag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8219:1: ( rule__BackgroundTag__Group__6__Impl )
            // InternalGreedySnake.g:8220:2: rule__BackgroundTag__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BackgroundTag__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundTag__Group__6"


    // $ANTLR start "rule__BackgroundTag__Group__6__Impl"
    // InternalGreedySnake.g:8226:1: rule__BackgroundTag__Group__6__Impl : ( ( rule__BackgroundTag__LocateAssignment_6 ) ) ;
    public final void rule__BackgroundTag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8230:1: ( ( ( rule__BackgroundTag__LocateAssignment_6 ) ) )
            // InternalGreedySnake.g:8231:1: ( ( rule__BackgroundTag__LocateAssignment_6 ) )
            {
            // InternalGreedySnake.g:8231:1: ( ( rule__BackgroundTag__LocateAssignment_6 ) )
            // InternalGreedySnake.g:8232:2: ( rule__BackgroundTag__LocateAssignment_6 )
            {
             before(grammarAccess.getBackgroundTagAccess().getLocateAssignment_6()); 
            // InternalGreedySnake.g:8233:2: ( rule__BackgroundTag__LocateAssignment_6 )
            // InternalGreedySnake.g:8233:3: rule__BackgroundTag__LocateAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__BackgroundTag__LocateAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundTagAccess().getLocateAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundTag__Group__6__Impl"


    // $ANTLR start "rule__MusicSpecification__Group__0"
    // InternalGreedySnake.g:8242:1: rule__MusicSpecification__Group__0 : rule__MusicSpecification__Group__0__Impl rule__MusicSpecification__Group__1 ;
    public final void rule__MusicSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8246:1: ( rule__MusicSpecification__Group__0__Impl rule__MusicSpecification__Group__1 )
            // InternalGreedySnake.g:8247:2: rule__MusicSpecification__Group__0__Impl rule__MusicSpecification__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MusicSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MusicSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSpecification__Group__0"


    // $ANTLR start "rule__MusicSpecification__Group__0__Impl"
    // InternalGreedySnake.g:8254:1: rule__MusicSpecification__Group__0__Impl : ( 'Music' ) ;
    public final void rule__MusicSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8258:1: ( ( 'Music' ) )
            // InternalGreedySnake.g:8259:1: ( 'Music' )
            {
            // InternalGreedySnake.g:8259:1: ( 'Music' )
            // InternalGreedySnake.g:8260:2: 'Music'
            {
             before(grammarAccess.getMusicSpecificationAccess().getMusicKeyword_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getMusicSpecificationAccess().getMusicKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSpecification__Group__0__Impl"


    // $ANTLR start "rule__MusicSpecification__Group__1"
    // InternalGreedySnake.g:8269:1: rule__MusicSpecification__Group__1 : rule__MusicSpecification__Group__1__Impl rule__MusicSpecification__Group__2 ;
    public final void rule__MusicSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8273:1: ( rule__MusicSpecification__Group__1__Impl rule__MusicSpecification__Group__2 )
            // InternalGreedySnake.g:8274:2: rule__MusicSpecification__Group__1__Impl rule__MusicSpecification__Group__2
            {
            pushFollow(FOLLOW_60);
            rule__MusicSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MusicSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSpecification__Group__1"


    // $ANTLR start "rule__MusicSpecification__Group__1__Impl"
    // InternalGreedySnake.g:8281:1: rule__MusicSpecification__Group__1__Impl : ( '{' ) ;
    public final void rule__MusicSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8285:1: ( ( '{' ) )
            // InternalGreedySnake.g:8286:1: ( '{' )
            {
            // InternalGreedySnake.g:8286:1: ( '{' )
            // InternalGreedySnake.g:8287:2: '{'
            {
             before(grammarAccess.getMusicSpecificationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMusicSpecificationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSpecification__Group__1__Impl"


    // $ANTLR start "rule__MusicSpecification__Group__2"
    // InternalGreedySnake.g:8296:1: rule__MusicSpecification__Group__2 : rule__MusicSpecification__Group__2__Impl rule__MusicSpecification__Group__3 ;
    public final void rule__MusicSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8300:1: ( rule__MusicSpecification__Group__2__Impl rule__MusicSpecification__Group__3 )
            // InternalGreedySnake.g:8301:2: rule__MusicSpecification__Group__2__Impl rule__MusicSpecification__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__MusicSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MusicSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSpecification__Group__2"


    // $ANTLR start "rule__MusicSpecification__Group__2__Impl"
    // InternalGreedySnake.g:8308:1: rule__MusicSpecification__Group__2__Impl : ( 'BufferSize' ) ;
    public final void rule__MusicSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8312:1: ( ( 'BufferSize' ) )
            // InternalGreedySnake.g:8313:1: ( 'BufferSize' )
            {
            // InternalGreedySnake.g:8313:1: ( 'BufferSize' )
            // InternalGreedySnake.g:8314:2: 'BufferSize'
            {
             before(grammarAccess.getMusicSpecificationAccess().getBufferSizeKeyword_2()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getMusicSpecificationAccess().getBufferSizeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSpecification__Group__2__Impl"


    // $ANTLR start "rule__MusicSpecification__Group__3"
    // InternalGreedySnake.g:8323:1: rule__MusicSpecification__Group__3 : rule__MusicSpecification__Group__3__Impl rule__MusicSpecification__Group__4 ;
    public final void rule__MusicSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8327:1: ( rule__MusicSpecification__Group__3__Impl rule__MusicSpecification__Group__4 )
            // InternalGreedySnake.g:8328:2: rule__MusicSpecification__Group__3__Impl rule__MusicSpecification__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__MusicSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MusicSpecification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSpecification__Group__3"


    // $ANTLR start "rule__MusicSpecification__Group__3__Impl"
    // InternalGreedySnake.g:8335:1: rule__MusicSpecification__Group__3__Impl : ( '=' ) ;
    public final void rule__MusicSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8339:1: ( ( '=' ) )
            // InternalGreedySnake.g:8340:1: ( '=' )
            {
            // InternalGreedySnake.g:8340:1: ( '=' )
            // InternalGreedySnake.g:8341:2: '='
            {
             before(grammarAccess.getMusicSpecificationAccess().getEqualsSignKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMusicSpecificationAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSpecification__Group__3__Impl"


    // $ANTLR start "rule__MusicSpecification__Group__4"
    // InternalGreedySnake.g:8350:1: rule__MusicSpecification__Group__4 : rule__MusicSpecification__Group__4__Impl rule__MusicSpecification__Group__5 ;
    public final void rule__MusicSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8354:1: ( rule__MusicSpecification__Group__4__Impl rule__MusicSpecification__Group__5 )
            // InternalGreedySnake.g:8355:2: rule__MusicSpecification__Group__4__Impl rule__MusicSpecification__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__MusicSpecification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MusicSpecification__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSpecification__Group__4"


    // $ANTLR start "rule__MusicSpecification__Group__4__Impl"
    // InternalGreedySnake.g:8362:1: rule__MusicSpecification__Group__4__Impl : ( ( rule__MusicSpecification__BuffersizeAssignment_4 ) ) ;
    public final void rule__MusicSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8366:1: ( ( ( rule__MusicSpecification__BuffersizeAssignment_4 ) ) )
            // InternalGreedySnake.g:8367:1: ( ( rule__MusicSpecification__BuffersizeAssignment_4 ) )
            {
            // InternalGreedySnake.g:8367:1: ( ( rule__MusicSpecification__BuffersizeAssignment_4 ) )
            // InternalGreedySnake.g:8368:2: ( rule__MusicSpecification__BuffersizeAssignment_4 )
            {
             before(grammarAccess.getMusicSpecificationAccess().getBuffersizeAssignment_4()); 
            // InternalGreedySnake.g:8369:2: ( rule__MusicSpecification__BuffersizeAssignment_4 )
            // InternalGreedySnake.g:8369:3: rule__MusicSpecification__BuffersizeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MusicSpecification__BuffersizeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMusicSpecificationAccess().getBuffersizeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSpecification__Group__4__Impl"


    // $ANTLR start "rule__MusicSpecification__Group__5"
    // InternalGreedySnake.g:8377:1: rule__MusicSpecification__Group__5 : rule__MusicSpecification__Group__5__Impl rule__MusicSpecification__Group__6 ;
    public final void rule__MusicSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8381:1: ( rule__MusicSpecification__Group__5__Impl rule__MusicSpecification__Group__6 )
            // InternalGreedySnake.g:8382:2: rule__MusicSpecification__Group__5__Impl rule__MusicSpecification__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__MusicSpecification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MusicSpecification__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSpecification__Group__5"


    // $ANTLR start "rule__MusicSpecification__Group__5__Impl"
    // InternalGreedySnake.g:8389:1: rule__MusicSpecification__Group__5__Impl : ( ( rule__MusicSpecification__MusicPathAssignment_5 )* ) ;
    public final void rule__MusicSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8393:1: ( ( ( rule__MusicSpecification__MusicPathAssignment_5 )* ) )
            // InternalGreedySnake.g:8394:1: ( ( rule__MusicSpecification__MusicPathAssignment_5 )* )
            {
            // InternalGreedySnake.g:8394:1: ( ( rule__MusicSpecification__MusicPathAssignment_5 )* )
            // InternalGreedySnake.g:8395:2: ( rule__MusicSpecification__MusicPathAssignment_5 )*
            {
             before(grammarAccess.getMusicSpecificationAccess().getMusicPathAssignment_5()); 
            // InternalGreedySnake.g:8396:2: ( rule__MusicSpecification__MusicPathAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGreedySnake.g:8396:3: rule__MusicSpecification__MusicPathAssignment_5
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__MusicSpecification__MusicPathAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getMusicSpecificationAccess().getMusicPathAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSpecification__Group__5__Impl"


    // $ANTLR start "rule__MusicSpecification__Group__6"
    // InternalGreedySnake.g:8404:1: rule__MusicSpecification__Group__6 : rule__MusicSpecification__Group__6__Impl ;
    public final void rule__MusicSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8408:1: ( rule__MusicSpecification__Group__6__Impl )
            // InternalGreedySnake.g:8409:2: rule__MusicSpecification__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MusicSpecification__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSpecification__Group__6"


    // $ANTLR start "rule__MusicSpecification__Group__6__Impl"
    // InternalGreedySnake.g:8415:1: rule__MusicSpecification__Group__6__Impl : ( '}' ) ;
    public final void rule__MusicSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8419:1: ( ( '}' ) )
            // InternalGreedySnake.g:8420:1: ( '}' )
            {
            // InternalGreedySnake.g:8420:1: ( '}' )
            // InternalGreedySnake.g:8421:2: '}'
            {
             before(grammarAccess.getMusicSpecificationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMusicSpecificationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSpecification__Group__6__Impl"


    // $ANTLR start "rule__MusicPath__Group__0"
    // InternalGreedySnake.g:8431:1: rule__MusicPath__Group__0 : rule__MusicPath__Group__0__Impl rule__MusicPath__Group__1 ;
    public final void rule__MusicPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8435:1: ( rule__MusicPath__Group__0__Impl rule__MusicPath__Group__1 )
            // InternalGreedySnake.g:8436:2: rule__MusicPath__Group__0__Impl rule__MusicPath__Group__1
            {
            pushFollow(FOLLOW_61);
            rule__MusicPath__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MusicPath__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicPath__Group__0"


    // $ANTLR start "rule__MusicPath__Group__0__Impl"
    // InternalGreedySnake.g:8443:1: rule__MusicPath__Group__0__Impl : ( ( rule__MusicPath__NameAssignment_0 ) ) ;
    public final void rule__MusicPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8447:1: ( ( ( rule__MusicPath__NameAssignment_0 ) ) )
            // InternalGreedySnake.g:8448:1: ( ( rule__MusicPath__NameAssignment_0 ) )
            {
            // InternalGreedySnake.g:8448:1: ( ( rule__MusicPath__NameAssignment_0 ) )
            // InternalGreedySnake.g:8449:2: ( rule__MusicPath__NameAssignment_0 )
            {
             before(grammarAccess.getMusicPathAccess().getNameAssignment_0()); 
            // InternalGreedySnake.g:8450:2: ( rule__MusicPath__NameAssignment_0 )
            // InternalGreedySnake.g:8450:3: rule__MusicPath__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MusicPath__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMusicPathAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicPath__Group__0__Impl"


    // $ANTLR start "rule__MusicPath__Group__1"
    // InternalGreedySnake.g:8458:1: rule__MusicPath__Group__1 : rule__MusicPath__Group__1__Impl rule__MusicPath__Group__2 ;
    public final void rule__MusicPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8462:1: ( rule__MusicPath__Group__1__Impl rule__MusicPath__Group__2 )
            // InternalGreedySnake.g:8463:2: rule__MusicPath__Group__1__Impl rule__MusicPath__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__MusicPath__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MusicPath__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicPath__Group__1"


    // $ANTLR start "rule__MusicPath__Group__1__Impl"
    // InternalGreedySnake.g:8470:1: rule__MusicPath__Group__1__Impl : ( 'path' ) ;
    public final void rule__MusicPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8474:1: ( ( 'path' ) )
            // InternalGreedySnake.g:8475:1: ( 'path' )
            {
            // InternalGreedySnake.g:8475:1: ( 'path' )
            // InternalGreedySnake.g:8476:2: 'path'
            {
             before(grammarAccess.getMusicPathAccess().getPathKeyword_1()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getMusicPathAccess().getPathKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicPath__Group__1__Impl"


    // $ANTLR start "rule__MusicPath__Group__2"
    // InternalGreedySnake.g:8485:1: rule__MusicPath__Group__2 : rule__MusicPath__Group__2__Impl rule__MusicPath__Group__3 ;
    public final void rule__MusicPath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8489:1: ( rule__MusicPath__Group__2__Impl rule__MusicPath__Group__3 )
            // InternalGreedySnake.g:8490:2: rule__MusicPath__Group__2__Impl rule__MusicPath__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__MusicPath__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MusicPath__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicPath__Group__2"


    // $ANTLR start "rule__MusicPath__Group__2__Impl"
    // InternalGreedySnake.g:8497:1: rule__MusicPath__Group__2__Impl : ( '=' ) ;
    public final void rule__MusicPath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8501:1: ( ( '=' ) )
            // InternalGreedySnake.g:8502:1: ( '=' )
            {
            // InternalGreedySnake.g:8502:1: ( '=' )
            // InternalGreedySnake.g:8503:2: '='
            {
             before(grammarAccess.getMusicPathAccess().getEqualsSignKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMusicPathAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicPath__Group__2__Impl"


    // $ANTLR start "rule__MusicPath__Group__3"
    // InternalGreedySnake.g:8512:1: rule__MusicPath__Group__3 : rule__MusicPath__Group__3__Impl ;
    public final void rule__MusicPath__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8516:1: ( rule__MusicPath__Group__3__Impl )
            // InternalGreedySnake.g:8517:2: rule__MusicPath__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MusicPath__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicPath__Group__3"


    // $ANTLR start "rule__MusicPath__Group__3__Impl"
    // InternalGreedySnake.g:8523:1: rule__MusicPath__Group__3__Impl : ( ( rule__MusicPath__PathAssignment_3 ) ) ;
    public final void rule__MusicPath__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8527:1: ( ( ( rule__MusicPath__PathAssignment_3 ) ) )
            // InternalGreedySnake.g:8528:1: ( ( rule__MusicPath__PathAssignment_3 ) )
            {
            // InternalGreedySnake.g:8528:1: ( ( rule__MusicPath__PathAssignment_3 ) )
            // InternalGreedySnake.g:8529:2: ( rule__MusicPath__PathAssignment_3 )
            {
             before(grammarAccess.getMusicPathAccess().getPathAssignment_3()); 
            // InternalGreedySnake.g:8530:2: ( rule__MusicPath__PathAssignment_3 )
            // InternalGreedySnake.g:8530:3: rule__MusicPath__PathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MusicPath__PathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMusicPathAccess().getPathAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicPath__Group__3__Impl"


    // $ANTLR start "rule__GreedySnake__NameAssignment_1"
    // InternalGreedySnake.g:8539:1: rule__GreedySnake__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GreedySnake__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8543:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:8544:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:8544:2: ( RULE_ID )
            // InternalGreedySnake.g:8545:3: RULE_ID
            {
             before(grammarAccess.getGreedySnakeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGreedySnakeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__NameAssignment_1"


    // $ANTLR start "rule__GreedySnake__SnakesAssignment_3_0"
    // InternalGreedySnake.g:8554:1: rule__GreedySnake__SnakesAssignment_3_0 : ( ruleInitialSnakeSpecificatin ) ;
    public final void rule__GreedySnake__SnakesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8558:1: ( ( ruleInitialSnakeSpecificatin ) )
            // InternalGreedySnake.g:8559:2: ( ruleInitialSnakeSpecificatin )
            {
            // InternalGreedySnake.g:8559:2: ( ruleInitialSnakeSpecificatin )
            // InternalGreedySnake.g:8560:3: ruleInitialSnakeSpecificatin
            {
             before(grammarAccess.getGreedySnakeAccess().getSnakesInitialSnakeSpecificatinParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialSnakeSpecificatin();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getSnakesInitialSnakeSpecificatinParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__SnakesAssignment_3_0"


    // $ANTLR start "rule__GreedySnake__FoodsAssignment_3_1"
    // InternalGreedySnake.g:8569:1: rule__GreedySnake__FoodsAssignment_3_1 : ( ruleInitialFoodSpecificatin ) ;
    public final void rule__GreedySnake__FoodsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8573:1: ( ( ruleInitialFoodSpecificatin ) )
            // InternalGreedySnake.g:8574:2: ( ruleInitialFoodSpecificatin )
            {
            // InternalGreedySnake.g:8574:2: ( ruleInitialFoodSpecificatin )
            // InternalGreedySnake.g:8575:3: ruleInitialFoodSpecificatin
            {
             before(grammarAccess.getGreedySnakeAccess().getFoodsInitialFoodSpecificatinParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialFoodSpecificatin();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getFoodsInitialFoodSpecificatinParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__FoodsAssignment_3_1"


    // $ANTLR start "rule__GreedySnake__ObstaclesAssignment_3_2"
    // InternalGreedySnake.g:8584:1: rule__GreedySnake__ObstaclesAssignment_3_2 : ( ruleInitialObstacleSpecificatin ) ;
    public final void rule__GreedySnake__ObstaclesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8588:1: ( ( ruleInitialObstacleSpecificatin ) )
            // InternalGreedySnake.g:8589:2: ( ruleInitialObstacleSpecificatin )
            {
            // InternalGreedySnake.g:8589:2: ( ruleInitialObstacleSpecificatin )
            // InternalGreedySnake.g:8590:3: ruleInitialObstacleSpecificatin
            {
             before(grammarAccess.getGreedySnakeAccess().getObstaclesInitialObstacleSpecificatinParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialObstacleSpecificatin();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getObstaclesInitialObstacleSpecificatinParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__ObstaclesAssignment_3_2"


    // $ANTLR start "rule__GreedySnake__SpeedAssignment_3_3"
    // InternalGreedySnake.g:8599:1: rule__GreedySnake__SpeedAssignment_3_3 : ( ruleInitialSpeedSpecification ) ;
    public final void rule__GreedySnake__SpeedAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8603:1: ( ( ruleInitialSpeedSpecification ) )
            // InternalGreedySnake.g:8604:2: ( ruleInitialSpeedSpecification )
            {
            // InternalGreedySnake.g:8604:2: ( ruleInitialSpeedSpecification )
            // InternalGreedySnake.g:8605:3: ruleInitialSpeedSpecification
            {
             before(grammarAccess.getGreedySnakeAccess().getSpeedInitialSpeedSpecificationParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialSpeedSpecification();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getSpeedInitialSpeedSpecificationParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__SpeedAssignment_3_3"


    // $ANTLR start "rule__GreedySnake__FireAssignment_3_4"
    // InternalGreedySnake.g:8614:1: rule__GreedySnake__FireAssignment_3_4 : ( ruleInitialFireSpecification ) ;
    public final void rule__GreedySnake__FireAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8618:1: ( ( ruleInitialFireSpecification ) )
            // InternalGreedySnake.g:8619:2: ( ruleInitialFireSpecification )
            {
            // InternalGreedySnake.g:8619:2: ( ruleInitialFireSpecification )
            // InternalGreedySnake.g:8620:3: ruleInitialFireSpecification
            {
             before(grammarAccess.getGreedySnakeAccess().getFireInitialFireSpecificationParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialFireSpecification();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getFireInitialFireSpecificationParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__FireAssignment_3_4"


    // $ANTLR start "rule__GreedySnake__TimeAssignment_3_5"
    // InternalGreedySnake.g:8629:1: rule__GreedySnake__TimeAssignment_3_5 : ( ruleTimeLimited ) ;
    public final void rule__GreedySnake__TimeAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8633:1: ( ( ruleTimeLimited ) )
            // InternalGreedySnake.g:8634:2: ( ruleTimeLimited )
            {
            // InternalGreedySnake.g:8634:2: ( ruleTimeLimited )
            // InternalGreedySnake.g:8635:3: ruleTimeLimited
            {
             before(grammarAccess.getGreedySnakeAccess().getTimeTimeLimitedParserRuleCall_3_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeLimited();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getTimeTimeLimitedParserRuleCall_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__TimeAssignment_3_5"


    // $ANTLR start "rule__GreedySnake__MapAssignment_3_6"
    // InternalGreedySnake.g:8644:1: rule__GreedySnake__MapAssignment_3_6 : ( ruleGlobalMap ) ;
    public final void rule__GreedySnake__MapAssignment_3_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8648:1: ( ( ruleGlobalMap ) )
            // InternalGreedySnake.g:8649:2: ( ruleGlobalMap )
            {
            // InternalGreedySnake.g:8649:2: ( ruleGlobalMap )
            // InternalGreedySnake.g:8650:3: ruleGlobalMap
            {
             before(grammarAccess.getGreedySnakeAccess().getMapGlobalMapParserRuleCall_3_6_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobalMap();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getMapGlobalMapParserRuleCall_3_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__MapAssignment_3_6"


    // $ANTLR start "rule__GreedySnake__AboutAssignment_3_7"
    // InternalGreedySnake.g:8659:1: rule__GreedySnake__AboutAssignment_3_7 : ( ruleAboutSpecification ) ;
    public final void rule__GreedySnake__AboutAssignment_3_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8663:1: ( ( ruleAboutSpecification ) )
            // InternalGreedySnake.g:8664:2: ( ruleAboutSpecification )
            {
            // InternalGreedySnake.g:8664:2: ( ruleAboutSpecification )
            // InternalGreedySnake.g:8665:3: ruleAboutSpecification
            {
             before(grammarAccess.getGreedySnakeAccess().getAboutAboutSpecificationParserRuleCall_3_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAboutSpecification();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getAboutAboutSpecificationParserRuleCall_3_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__AboutAssignment_3_7"


    // $ANTLR start "rule__GreedySnake__HelpAssignment_3_8"
    // InternalGreedySnake.g:8674:1: rule__GreedySnake__HelpAssignment_3_8 : ( ruleHelpSpecification ) ;
    public final void rule__GreedySnake__HelpAssignment_3_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8678:1: ( ( ruleHelpSpecification ) )
            // InternalGreedySnake.g:8679:2: ( ruleHelpSpecification )
            {
            // InternalGreedySnake.g:8679:2: ( ruleHelpSpecification )
            // InternalGreedySnake.g:8680:3: ruleHelpSpecification
            {
             before(grammarAccess.getGreedySnakeAccess().getHelpHelpSpecificationParserRuleCall_3_8_0()); 
            pushFollow(FOLLOW_2);
            ruleHelpSpecification();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getHelpHelpSpecificationParserRuleCall_3_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__HelpAssignment_3_8"


    // $ANTLR start "rule__GreedySnake__MusicAssignment_3_9"
    // InternalGreedySnake.g:8689:1: rule__GreedySnake__MusicAssignment_3_9 : ( ruleMusicSpecification ) ;
    public final void rule__GreedySnake__MusicAssignment_3_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8693:1: ( ( ruleMusicSpecification ) )
            // InternalGreedySnake.g:8694:2: ( ruleMusicSpecification )
            {
            // InternalGreedySnake.g:8694:2: ( ruleMusicSpecification )
            // InternalGreedySnake.g:8695:3: ruleMusicSpecification
            {
             before(grammarAccess.getGreedySnakeAccess().getMusicMusicSpecificationParserRuleCall_3_9_0()); 
            pushFollow(FOLLOW_2);
            ruleMusicSpecification();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getMusicMusicSpecificationParserRuleCall_3_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__MusicAssignment_3_9"


    // $ANTLR start "rule__GreedySnake__BackgroundsAssignment_3_10"
    // InternalGreedySnake.g:8704:1: rule__GreedySnake__BackgroundsAssignment_3_10 : ( ruleBackSpecification ) ;
    public final void rule__GreedySnake__BackgroundsAssignment_3_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8708:1: ( ( ruleBackSpecification ) )
            // InternalGreedySnake.g:8709:2: ( ruleBackSpecification )
            {
            // InternalGreedySnake.g:8709:2: ( ruleBackSpecification )
            // InternalGreedySnake.g:8710:3: ruleBackSpecification
            {
             before(grammarAccess.getGreedySnakeAccess().getBackgroundsBackSpecificationParserRuleCall_3_10_0()); 
            pushFollow(FOLLOW_2);
            ruleBackSpecification();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getBackgroundsBackSpecificationParserRuleCall_3_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__BackgroundsAssignment_3_10"


    // $ANTLR start "rule__GreedySnake__FieldsAssignment_3_11"
    // InternalGreedySnake.g:8719:1: rule__GreedySnake__FieldsAssignment_3_11 : ( ruleGlobalFieldInitialisation ) ;
    public final void rule__GreedySnake__FieldsAssignment_3_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8723:1: ( ( ruleGlobalFieldInitialisation ) )
            // InternalGreedySnake.g:8724:2: ( ruleGlobalFieldInitialisation )
            {
            // InternalGreedySnake.g:8724:2: ( ruleGlobalFieldInitialisation )
            // InternalGreedySnake.g:8725:3: ruleGlobalFieldInitialisation
            {
             before(grammarAccess.getGreedySnakeAccess().getFieldsGlobalFieldInitialisationParserRuleCall_3_11_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobalFieldInitialisation();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getFieldsGlobalFieldInitialisationParserRuleCall_3_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__FieldsAssignment_3_11"


    // $ANTLR start "rule__GreedySnake__OptionsAssignment_3_12"
    // InternalGreedySnake.g:8734:1: rule__GreedySnake__OptionsAssignment_3_12 : ( ruleOptionSpecification ) ;
    public final void rule__GreedySnake__OptionsAssignment_3_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8738:1: ( ( ruleOptionSpecification ) )
            // InternalGreedySnake.g:8739:2: ( ruleOptionSpecification )
            {
            // InternalGreedySnake.g:8739:2: ( ruleOptionSpecification )
            // InternalGreedySnake.g:8740:3: ruleOptionSpecification
            {
             before(grammarAccess.getGreedySnakeAccess().getOptionsOptionSpecificationParserRuleCall_3_12_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionSpecification();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getOptionsOptionSpecificationParserRuleCall_3_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__OptionsAssignment_3_12"


    // $ANTLR start "rule__GlobalMap__MapAssignment_2"
    // InternalGreedySnake.g:8749:1: rule__GlobalMap__MapAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GlobalMap__MapAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8753:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:8754:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:8754:2: ( RULE_STRING )
            // InternalGreedySnake.g:8755:3: RULE_STRING
            {
             before(grammarAccess.getGlobalMapAccess().getMapSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGlobalMapAccess().getMapSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalMap__MapAssignment_2"


    // $ANTLR start "rule__GlobalFieldInitialisation__NameAssignment_1"
    // InternalGreedySnake.g:8764:1: rule__GlobalFieldInitialisation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GlobalFieldInitialisation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8768:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:8769:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:8769:2: ( RULE_ID )
            // InternalGreedySnake.g:8770:3: RULE_ID
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__NameAssignment_1"


    // $ANTLR start "rule__GlobalFieldInitialisation__PanelWidthAssignment_5"
    // InternalGreedySnake.g:8779:1: rule__GlobalFieldInitialisation__PanelWidthAssignment_5 : ( RULE_INT ) ;
    public final void rule__GlobalFieldInitialisation__PanelWidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8783:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:8784:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:8784:2: ( RULE_INT )
            // InternalGreedySnake.g:8785:3: RULE_INT
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getPanelWidthINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getPanelWidthINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__PanelWidthAssignment_5"


    // $ANTLR start "rule__GlobalFieldInitialisation__PanelHeightAssignment_8"
    // InternalGreedySnake.g:8794:1: rule__GlobalFieldInitialisation__PanelHeightAssignment_8 : ( RULE_INT ) ;
    public final void rule__GlobalFieldInitialisation__PanelHeightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8798:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:8799:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:8799:2: ( RULE_INT )
            // InternalGreedySnake.g:8800:3: RULE_INT
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getPanelHeightINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getPanelHeightINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__PanelHeightAssignment_8"


    // $ANTLR start "rule__GlobalFieldInitialisation__WidthAssignment_11"
    // InternalGreedySnake.g:8809:1: rule__GlobalFieldInitialisation__WidthAssignment_11 : ( RULE_INT ) ;
    public final void rule__GlobalFieldInitialisation__WidthAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8813:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:8814:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:8814:2: ( RULE_INT )
            // InternalGreedySnake.g:8815:3: RULE_INT
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getWidthINTTerminalRuleCall_11_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getWidthINTTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__WidthAssignment_11"


    // $ANTLR start "rule__GlobalFieldInitialisation__HeightAssignment_14"
    // InternalGreedySnake.g:8824:1: rule__GlobalFieldInitialisation__HeightAssignment_14 : ( RULE_INT ) ;
    public final void rule__GlobalFieldInitialisation__HeightAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8828:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:8829:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:8829:2: ( RULE_INT )
            // InternalGreedySnake.g:8830:3: RULE_INT
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getHeightINTTerminalRuleCall_14_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getHeightINTTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__HeightAssignment_14"


    // $ANTLR start "rule__GlobalFieldInitialisation__LabelWidthAssignment_17"
    // InternalGreedySnake.g:8839:1: rule__GlobalFieldInitialisation__LabelWidthAssignment_17 : ( RULE_INT ) ;
    public final void rule__GlobalFieldInitialisation__LabelWidthAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8843:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:8844:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:8844:2: ( RULE_INT )
            // InternalGreedySnake.g:8845:3: RULE_INT
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getLabelWidthINTTerminalRuleCall_17_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getLabelWidthINTTerminalRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__LabelWidthAssignment_17"


    // $ANTLR start "rule__GlobalFieldInitialisation__LabelHeightAssignment_20"
    // InternalGreedySnake.g:8854:1: rule__GlobalFieldInitialisation__LabelHeightAssignment_20 : ( RULE_INT ) ;
    public final void rule__GlobalFieldInitialisation__LabelHeightAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8858:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:8859:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:8859:2: ( RULE_INT )
            // InternalGreedySnake.g:8860:3: RULE_INT
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getLabelHeightINTTerminalRuleCall_20_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getLabelHeightINTTerminalRuleCall_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__LabelHeightAssignment_20"


    // $ANTLR start "rule__GlobalFieldInitialisation__Field_initialisationAssignment_21"
    // InternalGreedySnake.g:8869:1: rule__GlobalFieldInitialisation__Field_initialisationAssignment_21 : ( ruleInitialField ) ;
    public final void rule__GlobalFieldInitialisation__Field_initialisationAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8873:1: ( ( ruleInitialField ) )
            // InternalGreedySnake.g:8874:2: ( ruleInitialField )
            {
            // InternalGreedySnake.g:8874:2: ( ruleInitialField )
            // InternalGreedySnake.g:8875:3: ruleInitialField
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getField_initialisationInitialFieldParserRuleCall_21_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialField();

            state._fsp--;

             after(grammarAccess.getGlobalFieldInitialisationAccess().getField_initialisationInitialFieldParserRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Field_initialisationAssignment_21"


    // $ANTLR start "rule__InitialField__NameAssignment_1"
    // InternalGreedySnake.g:8884:1: rule__InitialField__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialField__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8888:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:8889:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:8889:2: ( RULE_ID )
            // InternalGreedySnake.g:8890:3: RULE_ID
            {
             before(grammarAccess.getInitialFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInitialFieldAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__NameAssignment_1"


    // $ANTLR start "rule__InitialField__DefaultAssignment_7"
    // InternalGreedySnake.g:8899:1: rule__InitialField__DefaultAssignment_7 : ( ruleDefault ) ;
    public final void rule__InitialField__DefaultAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8903:1: ( ( ruleDefault ) )
            // InternalGreedySnake.g:8904:2: ( ruleDefault )
            {
            // InternalGreedySnake.g:8904:2: ( ruleDefault )
            // InternalGreedySnake.g:8905:3: ruleDefault
            {
             before(grammarAccess.getInitialFieldAccess().getDefaultDefaultParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDefault();

            state._fsp--;

             after(grammarAccess.getInitialFieldAccess().getDefaultDefaultParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialField__DefaultAssignment_7"


    // $ANTLR start "rule__Default__LengthAssignment_2"
    // InternalGreedySnake.g:8914:1: rule__Default__LengthAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Default__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8918:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:8919:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:8919:2: ( RULE_STRING )
            // InternalGreedySnake.g:8920:3: RULE_STRING
            {
             before(grammarAccess.getDefaultAccess().getLengthSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getLengthSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__LengthAssignment_2"


    // $ANTLR start "rule__Default__ScoreAssignment_5"
    // InternalGreedySnake.g:8929:1: rule__Default__ScoreAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Default__ScoreAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8933:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:8934:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:8934:2: ( RULE_STRING )
            // InternalGreedySnake.g:8935:3: RULE_STRING
            {
             before(grammarAccess.getDefaultAccess().getScoreSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getScoreSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__ScoreAssignment_5"


    // $ANTLR start "rule__Default__TimeAssignment_8"
    // InternalGreedySnake.g:8944:1: rule__Default__TimeAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Default__TimeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8948:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:8949:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:8949:2: ( RULE_STRING )
            // InternalGreedySnake.g:8950:3: RULE_STRING
            {
             before(grammarAccess.getDefaultAccess().getTimeSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getTimeSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__TimeAssignment_8"


    // $ANTLR start "rule__Default__AmountAssignment_11"
    // InternalGreedySnake.g:8959:1: rule__Default__AmountAssignment_11 : ( RULE_STRING ) ;
    public final void rule__Default__AmountAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8963:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:8964:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:8964:2: ( RULE_STRING )
            // InternalGreedySnake.g:8965:3: RULE_STRING
            {
             before(grammarAccess.getDefaultAccess().getAmountSTRINGTerminalRuleCall_11_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getAmountSTRINGTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__AmountAssignment_11"


    // $ANTLR start "rule__Default__WeaponAssignment_14"
    // InternalGreedySnake.g:8974:1: rule__Default__WeaponAssignment_14 : ( RULE_STRING ) ;
    public final void rule__Default__WeaponAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8978:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:8979:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:8979:2: ( RULE_STRING )
            // InternalGreedySnake.g:8980:3: RULE_STRING
            {
             before(grammarAccess.getDefaultAccess().getWeaponSTRINGTerminalRuleCall_14_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getWeaponSTRINGTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__WeaponAssignment_14"


    // $ANTLR start "rule__InitialSnakeSpecificatin__NameAssignment_1"
    // InternalGreedySnake.g:8989:1: rule__InitialSnakeSpecificatin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialSnakeSpecificatin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8993:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:8994:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:8994:2: ( RULE_ID )
            // InternalGreedySnake.g:8995:3: RULE_ID
            {
             before(grammarAccess.getInitialSnakeSpecificatinAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInitialSnakeSpecificatinAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSnakeSpecificatin__NameAssignment_1"


    // $ANTLR start "rule__InitialSnakeSpecificatin__MembersAssignment_3"
    // InternalGreedySnake.g:9004:1: rule__InitialSnakeSpecificatin__MembersAssignment_3 : ( ruleSnakeMembers ) ;
    public final void rule__InitialSnakeSpecificatin__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9008:1: ( ( ruleSnakeMembers ) )
            // InternalGreedySnake.g:9009:2: ( ruleSnakeMembers )
            {
            // InternalGreedySnake.g:9009:2: ( ruleSnakeMembers )
            // InternalGreedySnake.g:9010:3: ruleSnakeMembers
            {
             before(grammarAccess.getInitialSnakeSpecificatinAccess().getMembersSnakeMembersParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSnakeMembers();

            state._fsp--;

             after(grammarAccess.getInitialSnakeSpecificatinAccess().getMembersSnakeMembersParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSnakeSpecificatin__MembersAssignment_3"


    // $ANTLR start "rule__InitialSnakeSpecificatin__MultiplesAssignment_5"
    // InternalGreedySnake.g:9019:1: rule__InitialSnakeSpecificatin__MultiplesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__InitialSnakeSpecificatin__MultiplesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9023:1: ( ( ( RULE_ID ) ) )
            // InternalGreedySnake.g:9024:2: ( ( RULE_ID ) )
            {
            // InternalGreedySnake.g:9024:2: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9025:3: ( RULE_ID )
            {
             before(grammarAccess.getInitialSnakeSpecificatinAccess().getMultiplesInitialSnakeSpecificatinCrossReference_5_0()); 
            // InternalGreedySnake.g:9026:3: ( RULE_ID )
            // InternalGreedySnake.g:9027:4: RULE_ID
            {
             before(grammarAccess.getInitialSnakeSpecificatinAccess().getMultiplesInitialSnakeSpecificatinIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInitialSnakeSpecificatinAccess().getMultiplesInitialSnakeSpecificatinIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getInitialSnakeSpecificatinAccess().getMultiplesInitialSnakeSpecificatinCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSnakeSpecificatin__MultiplesAssignment_5"


    // $ANTLR start "rule__InitialFoodSpecificatin__NameAssignment_1"
    // InternalGreedySnake.g:9038:1: rule__InitialFoodSpecificatin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialFoodSpecificatin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9042:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9043:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9043:2: ( RULE_ID )
            // InternalGreedySnake.g:9044:3: RULE_ID
            {
             before(grammarAccess.getInitialFoodSpecificatinAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInitialFoodSpecificatinAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFoodSpecificatin__NameAssignment_1"


    // $ANTLR start "rule__InitialFoodSpecificatin__MembersAssignment_3"
    // InternalGreedySnake.g:9053:1: rule__InitialFoodSpecificatin__MembersAssignment_3 : ( ruleFoodMembers ) ;
    public final void rule__InitialFoodSpecificatin__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9057:1: ( ( ruleFoodMembers ) )
            // InternalGreedySnake.g:9058:2: ( ruleFoodMembers )
            {
            // InternalGreedySnake.g:9058:2: ( ruleFoodMembers )
            // InternalGreedySnake.g:9059:3: ruleFoodMembers
            {
             before(grammarAccess.getInitialFoodSpecificatinAccess().getMembersFoodMembersParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFoodMembers();

            state._fsp--;

             after(grammarAccess.getInitialFoodSpecificatinAccess().getMembersFoodMembersParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFoodSpecificatin__MembersAssignment_3"


    // $ANTLR start "rule__InitialFoodSpecificatin__MultiplesAssignment_5"
    // InternalGreedySnake.g:9068:1: rule__InitialFoodSpecificatin__MultiplesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__InitialFoodSpecificatin__MultiplesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9072:1: ( ( ( RULE_ID ) ) )
            // InternalGreedySnake.g:9073:2: ( ( RULE_ID ) )
            {
            // InternalGreedySnake.g:9073:2: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9074:3: ( RULE_ID )
            {
             before(grammarAccess.getInitialFoodSpecificatinAccess().getMultiplesInitialFoodSpecificatinCrossReference_5_0()); 
            // InternalGreedySnake.g:9075:3: ( RULE_ID )
            // InternalGreedySnake.g:9076:4: RULE_ID
            {
             before(grammarAccess.getInitialFoodSpecificatinAccess().getMultiplesInitialFoodSpecificatinIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInitialFoodSpecificatinAccess().getMultiplesInitialFoodSpecificatinIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getInitialFoodSpecificatinAccess().getMultiplesInitialFoodSpecificatinCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFoodSpecificatin__MultiplesAssignment_5"


    // $ANTLR start "rule__InitialObstacleSpecificatin__NameAssignment_1"
    // InternalGreedySnake.g:9087:1: rule__InitialObstacleSpecificatin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialObstacleSpecificatin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9091:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9092:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9092:2: ( RULE_ID )
            // InternalGreedySnake.g:9093:3: RULE_ID
            {
             before(grammarAccess.getInitialObstacleSpecificatinAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInitialObstacleSpecificatinAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialObstacleSpecificatin__NameAssignment_1"


    // $ANTLR start "rule__InitialObstacleSpecificatin__MembersAssignment_3"
    // InternalGreedySnake.g:9102:1: rule__InitialObstacleSpecificatin__MembersAssignment_3 : ( ruleObstacleMembers ) ;
    public final void rule__InitialObstacleSpecificatin__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9106:1: ( ( ruleObstacleMembers ) )
            // InternalGreedySnake.g:9107:2: ( ruleObstacleMembers )
            {
            // InternalGreedySnake.g:9107:2: ( ruleObstacleMembers )
            // InternalGreedySnake.g:9108:3: ruleObstacleMembers
            {
             before(grammarAccess.getInitialObstacleSpecificatinAccess().getMembersObstacleMembersParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleObstacleMembers();

            state._fsp--;

             after(grammarAccess.getInitialObstacleSpecificatinAccess().getMembersObstacleMembersParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialObstacleSpecificatin__MembersAssignment_3"


    // $ANTLR start "rule__InitialObstacleSpecificatin__MultiplesAssignment_5"
    // InternalGreedySnake.g:9117:1: rule__InitialObstacleSpecificatin__MultiplesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__InitialObstacleSpecificatin__MultiplesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9121:1: ( ( ( RULE_ID ) ) )
            // InternalGreedySnake.g:9122:2: ( ( RULE_ID ) )
            {
            // InternalGreedySnake.g:9122:2: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9123:3: ( RULE_ID )
            {
             before(grammarAccess.getInitialObstacleSpecificatinAccess().getMultiplesInitialObstacleSpecificatinCrossReference_5_0()); 
            // InternalGreedySnake.g:9124:3: ( RULE_ID )
            // InternalGreedySnake.g:9125:4: RULE_ID
            {
             before(grammarAccess.getInitialObstacleSpecificatinAccess().getMultiplesInitialObstacleSpecificatinIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInitialObstacleSpecificatinAccess().getMultiplesInitialObstacleSpecificatinIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getInitialObstacleSpecificatinAccess().getMultiplesInitialObstacleSpecificatinCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialObstacleSpecificatin__MultiplesAssignment_5"


    // $ANTLR start "rule__InitialFireSpecification__NameAssignment_1"
    // InternalGreedySnake.g:9136:1: rule__InitialFireSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialFireSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9140:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9141:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9141:2: ( RULE_ID )
            // InternalGreedySnake.g:9142:3: RULE_ID
            {
             before(grammarAccess.getInitialFireSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInitialFireSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFireSpecification__NameAssignment_1"


    // $ANTLR start "rule__InitialFireSpecification__MembersAssignment_3"
    // InternalGreedySnake.g:9151:1: rule__InitialFireSpecification__MembersAssignment_3 : ( ruleFireMembers ) ;
    public final void rule__InitialFireSpecification__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9155:1: ( ( ruleFireMembers ) )
            // InternalGreedySnake.g:9156:2: ( ruleFireMembers )
            {
            // InternalGreedySnake.g:9156:2: ( ruleFireMembers )
            // InternalGreedySnake.g:9157:3: ruleFireMembers
            {
             before(grammarAccess.getInitialFireSpecificationAccess().getMembersFireMembersParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFireMembers();

            state._fsp--;

             after(grammarAccess.getInitialFireSpecificationAccess().getMembersFireMembersParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFireSpecification__MembersAssignment_3"


    // $ANTLR start "rule__InitialFireSpecification__MultiplesAssignment_5"
    // InternalGreedySnake.g:9166:1: rule__InitialFireSpecification__MultiplesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__InitialFireSpecification__MultiplesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9170:1: ( ( ( RULE_ID ) ) )
            // InternalGreedySnake.g:9171:2: ( ( RULE_ID ) )
            {
            // InternalGreedySnake.g:9171:2: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9172:3: ( RULE_ID )
            {
             before(grammarAccess.getInitialFireSpecificationAccess().getMultiplesInitialSnakeSpecificatinCrossReference_5_0()); 
            // InternalGreedySnake.g:9173:3: ( RULE_ID )
            // InternalGreedySnake.g:9174:4: RULE_ID
            {
             before(grammarAccess.getInitialFireSpecificationAccess().getMultiplesInitialSnakeSpecificatinIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInitialFireSpecificationAccess().getMultiplesInitialSnakeSpecificatinIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getInitialFireSpecificationAccess().getMultiplesInitialSnakeSpecificatinCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialFireSpecification__MultiplesAssignment_5"


    // $ANTLR start "rule__InitialSpeedSpecification__SpeedGroupAssignment_3"
    // InternalGreedySnake.g:9185:1: rule__InitialSpeedSpecification__SpeedGroupAssignment_3 : ( ruleSpeedGroup ) ;
    public final void rule__InitialSpeedSpecification__SpeedGroupAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9189:1: ( ( ruleSpeedGroup ) )
            // InternalGreedySnake.g:9190:2: ( ruleSpeedGroup )
            {
            // InternalGreedySnake.g:9190:2: ( ruleSpeedGroup )
            // InternalGreedySnake.g:9191:3: ruleSpeedGroup
            {
             before(grammarAccess.getInitialSpeedSpecificationAccess().getSpeedGroupSpeedGroupParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSpeedGroup();

            state._fsp--;

             after(grammarAccess.getInitialSpeedSpecificationAccess().getSpeedGroupSpeedGroupParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialSpeedSpecification__SpeedGroupAssignment_3"


    // $ANTLR start "rule__SpeedGroup__NameAssignment_0"
    // InternalGreedySnake.g:9200:1: rule__SpeedGroup__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SpeedGroup__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9204:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9205:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9205:2: ( RULE_ID )
            // InternalGreedySnake.g:9206:3: RULE_ID
            {
             before(grammarAccess.getSpeedGroupAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpeedGroupAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedGroup__NameAssignment_0"


    // $ANTLR start "rule__SpeedGroup__ValueAssignment_2"
    // InternalGreedySnake.g:9215:1: rule__SpeedGroup__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__SpeedGroup__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9219:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9220:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9220:2: ( RULE_INT )
            // InternalGreedySnake.g:9221:3: RULE_INT
            {
             before(grammarAccess.getSpeedGroupAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSpeedGroupAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedGroup__ValueAssignment_2"


    // $ANTLR start "rule__FireMembers__FireAssignment"
    // InternalGreedySnake.g:9230:1: rule__FireMembers__FireAssignment : ( ruleFireInitDisplay ) ;
    public final void rule__FireMembers__FireAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9234:1: ( ( ruleFireInitDisplay ) )
            // InternalGreedySnake.g:9235:2: ( ruleFireInitDisplay )
            {
            // InternalGreedySnake.g:9235:2: ( ruleFireInitDisplay )
            // InternalGreedySnake.g:9236:3: ruleFireInitDisplay
            {
             before(grammarAccess.getFireMembersAccess().getFireFireInitDisplayParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFireInitDisplay();

            state._fsp--;

             after(grammarAccess.getFireMembersAccess().getFireFireInitDisplayParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireMembers__FireAssignment"


    // $ANTLR start "rule__SnakeMembers__SnaAssignment"
    // InternalGreedySnake.g:9245:1: rule__SnakeMembers__SnaAssignment : ( ruleSnakeInitDisplay ) ;
    public final void rule__SnakeMembers__SnaAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9249:1: ( ( ruleSnakeInitDisplay ) )
            // InternalGreedySnake.g:9250:2: ( ruleSnakeInitDisplay )
            {
            // InternalGreedySnake.g:9250:2: ( ruleSnakeInitDisplay )
            // InternalGreedySnake.g:9251:3: ruleSnakeInitDisplay
            {
             before(grammarAccess.getSnakeMembersAccess().getSnaSnakeInitDisplayParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSnakeInitDisplay();

            state._fsp--;

             after(grammarAccess.getSnakeMembersAccess().getSnaSnakeInitDisplayParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeMembers__SnaAssignment"


    // $ANTLR start "rule__FoodMembers__FoodAssignment"
    // InternalGreedySnake.g:9260:1: rule__FoodMembers__FoodAssignment : ( ruleFoodInitDisplay ) ;
    public final void rule__FoodMembers__FoodAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9264:1: ( ( ruleFoodInitDisplay ) )
            // InternalGreedySnake.g:9265:2: ( ruleFoodInitDisplay )
            {
            // InternalGreedySnake.g:9265:2: ( ruleFoodInitDisplay )
            // InternalGreedySnake.g:9266:3: ruleFoodInitDisplay
            {
             before(grammarAccess.getFoodMembersAccess().getFoodFoodInitDisplayParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFoodInitDisplay();

            state._fsp--;

             after(grammarAccess.getFoodMembersAccess().getFoodFoodInitDisplayParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodMembers__FoodAssignment"


    // $ANTLR start "rule__ObstacleMembers__ObstacleAssignment"
    // InternalGreedySnake.g:9275:1: rule__ObstacleMembers__ObstacleAssignment : ( ruleObstacleInitDisplay ) ;
    public final void rule__ObstacleMembers__ObstacleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9279:1: ( ( ruleObstacleInitDisplay ) )
            // InternalGreedySnake.g:9280:2: ( ruleObstacleInitDisplay )
            {
            // InternalGreedySnake.g:9280:2: ( ruleObstacleInitDisplay )
            // InternalGreedySnake.g:9281:3: ruleObstacleInitDisplay
            {
             before(grammarAccess.getObstacleMembersAccess().getObstacleObstacleInitDisplayParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleObstacleInitDisplay();

            state._fsp--;

             after(grammarAccess.getObstacleMembersAccess().getObstacleObstacleInitDisplayParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleMembers__ObstacleAssignment"


    // $ANTLR start "rule__FireInitDisplay__FireIconAssignment_2"
    // InternalGreedySnake.g:9290:1: rule__FireInitDisplay__FireIconAssignment_2 : ( ruleIconTag ) ;
    public final void rule__FireInitDisplay__FireIconAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9294:1: ( ( ruleIconTag ) )
            // InternalGreedySnake.g:9295:2: ( ruleIconTag )
            {
            // InternalGreedySnake.g:9295:2: ( ruleIconTag )
            // InternalGreedySnake.g:9296:3: ruleIconTag
            {
             before(grammarAccess.getFireInitDisplayAccess().getFireIconIconTagParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIconTag();

            state._fsp--;

             after(grammarAccess.getFireInitDisplayAccess().getFireIconIconTagParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireInitDisplay__FireIconAssignment_2"


    // $ANTLR start "rule__FireInitDisplay__IconsizeAssignment_6"
    // InternalGreedySnake.g:9305:1: rule__FireInitDisplay__IconsizeAssignment_6 : ( ruleIconSize ) ;
    public final void rule__FireInitDisplay__IconsizeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9309:1: ( ( ruleIconSize ) )
            // InternalGreedySnake.g:9310:2: ( ruleIconSize )
            {
            // InternalGreedySnake.g:9310:2: ( ruleIconSize )
            // InternalGreedySnake.g:9311:3: ruleIconSize
            {
             before(grammarAccess.getFireInitDisplayAccess().getIconsizeIconSizeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleIconSize();

            state._fsp--;

             after(grammarAccess.getFireInitDisplayAccess().getIconsizeIconSizeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireInitDisplay__IconsizeAssignment_6"


    // $ANTLR start "rule__SnakeInitDisplay__HeadAssignment_2"
    // InternalGreedySnake.g:9320:1: rule__SnakeInitDisplay__HeadAssignment_2 : ( ( '(' ) ) ;
    public final void rule__SnakeInitDisplay__HeadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9324:1: ( ( ( '(' ) ) )
            // InternalGreedySnake.g:9325:2: ( ( '(' ) )
            {
            // InternalGreedySnake.g:9325:2: ( ( '(' ) )
            // InternalGreedySnake.g:9326:3: ( '(' )
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getHeadLeftParenthesisKeyword_2_0()); 
            // InternalGreedySnake.g:9327:3: ( '(' )
            // InternalGreedySnake.g:9328:4: '('
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getHeadLeftParenthesisKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getHeadLeftParenthesisKeyword_2_0()); 

            }

             after(grammarAccess.getSnakeInitDisplayAccess().getHeadLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__HeadAssignment_2"


    // $ANTLR start "rule__SnakeInitDisplay__Initial_xAssignment_3"
    // InternalGreedySnake.g:9339:1: rule__SnakeInitDisplay__Initial_xAssignment_3 : ( RULE_INT ) ;
    public final void rule__SnakeInitDisplay__Initial_xAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9343:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9344:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9344:2: ( RULE_INT )
            // InternalGreedySnake.g:9345:3: RULE_INT
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getInitial_xINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getInitial_xINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Initial_xAssignment_3"


    // $ANTLR start "rule__SnakeInitDisplay__Initial_yAssignment_5"
    // InternalGreedySnake.g:9354:1: rule__SnakeInitDisplay__Initial_yAssignment_5 : ( RULE_INT ) ;
    public final void rule__SnakeInitDisplay__Initial_yAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9358:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9359:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9359:2: ( RULE_INT )
            // InternalGreedySnake.g:9360:3: RULE_INT
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getInitial_yINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getInitial_yINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__Initial_yAssignment_5"


    // $ANTLR start "rule__SnakeInitDisplay__HeadIconAssignment_9"
    // InternalGreedySnake.g:9369:1: rule__SnakeInitDisplay__HeadIconAssignment_9 : ( ruleIconTag ) ;
    public final void rule__SnakeInitDisplay__HeadIconAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9373:1: ( ( ruleIconTag ) )
            // InternalGreedySnake.g:9374:2: ( ruleIconTag )
            {
            // InternalGreedySnake.g:9374:2: ( ruleIconTag )
            // InternalGreedySnake.g:9375:3: ruleIconTag
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getHeadIconIconTagParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleIconTag();

            state._fsp--;

             after(grammarAccess.getSnakeInitDisplayAccess().getHeadIconIconTagParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__HeadIconAssignment_9"


    // $ANTLR start "rule__SnakeInitDisplay__IconsizeAssignment_13"
    // InternalGreedySnake.g:9384:1: rule__SnakeInitDisplay__IconsizeAssignment_13 : ( ruleIconSize ) ;
    public final void rule__SnakeInitDisplay__IconsizeAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9388:1: ( ( ruleIconSize ) )
            // InternalGreedySnake.g:9389:2: ( ruleIconSize )
            {
            // InternalGreedySnake.g:9389:2: ( ruleIconSize )
            // InternalGreedySnake.g:9390:3: ruleIconSize
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getIconsizeIconSizeParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleIconSize();

            state._fsp--;

             after(grammarAccess.getSnakeInitDisplayAccess().getIconsizeIconSizeParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__IconsizeAssignment_13"


    // $ANTLR start "rule__SnakeInitDisplay__BodyIconAssignment_16"
    // InternalGreedySnake.g:9399:1: rule__SnakeInitDisplay__BodyIconAssignment_16 : ( ruleIconTag ) ;
    public final void rule__SnakeInitDisplay__BodyIconAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9403:1: ( ( ruleIconTag ) )
            // InternalGreedySnake.g:9404:2: ( ruleIconTag )
            {
            // InternalGreedySnake.g:9404:2: ( ruleIconTag )
            // InternalGreedySnake.g:9405:3: ruleIconTag
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getBodyIconIconTagParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleIconTag();

            state._fsp--;

             after(grammarAccess.getSnakeInitDisplayAccess().getBodyIconIconTagParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__BodyIconAssignment_16"


    // $ANTLR start "rule__SnakeInitDisplay__DefaultSpeedAssignment_20"
    // InternalGreedySnake.g:9414:1: rule__SnakeInitDisplay__DefaultSpeedAssignment_20 : ( RULE_INT ) ;
    public final void rule__SnakeInitDisplay__DefaultSpeedAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9418:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9419:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9419:2: ( RULE_INT )
            // InternalGreedySnake.g:9420:3: RULE_INT
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getDefaultSpeedINTTerminalRuleCall_20_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getDefaultSpeedINTTerminalRuleCall_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__DefaultSpeedAssignment_20"


    // $ANTLR start "rule__SnakeInitDisplay__SnakeTagAssignment_23"
    // InternalGreedySnake.g:9429:1: rule__SnakeInitDisplay__SnakeTagAssignment_23 : ( RULE_INT ) ;
    public final void rule__SnakeInitDisplay__SnakeTagAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9433:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9434:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9434:2: ( RULE_INT )
            // InternalGreedySnake.g:9435:3: RULE_INT
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getSnakeTagINTTerminalRuleCall_23_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSnakeInitDisplayAccess().getSnakeTagINTTerminalRuleCall_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeInitDisplay__SnakeTagAssignment_23"


    // $ANTLR start "rule__IconTag__NameAssignment_0"
    // InternalGreedySnake.g:9444:1: rule__IconTag__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IconTag__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9448:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9449:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9449:2: ( RULE_ID )
            // InternalGreedySnake.g:9450:3: RULE_ID
            {
             before(grammarAccess.getIconTagAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIconTagAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconTag__NameAssignment_0"


    // $ANTLR start "rule__IconTag__ValueAssignment_1"
    // InternalGreedySnake.g:9459:1: rule__IconTag__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__IconTag__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9463:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:9464:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:9464:2: ( RULE_STRING )
            // InternalGreedySnake.g:9465:3: RULE_STRING
            {
             before(grammarAccess.getIconTagAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIconTagAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconTag__ValueAssignment_1"


    // $ANTLR start "rule__IconTag__TagAssignment_3"
    // InternalGreedySnake.g:9474:1: rule__IconTag__TagAssignment_3 : ( RULE_INT ) ;
    public final void rule__IconTag__TagAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9478:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9479:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9479:2: ( RULE_INT )
            // InternalGreedySnake.g:9480:3: RULE_INT
            {
             before(grammarAccess.getIconTagAccess().getTagINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIconTagAccess().getTagINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconTag__TagAssignment_3"


    // $ANTLR start "rule__IconTag__LocateAssignment_6"
    // InternalGreedySnake.g:9489:1: rule__IconTag__LocateAssignment_6 : ( RULE_STRING ) ;
    public final void rule__IconTag__LocateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9493:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:9494:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:9494:2: ( RULE_STRING )
            // InternalGreedySnake.g:9495:3: RULE_STRING
            {
             before(grammarAccess.getIconTagAccess().getLocateSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIconTagAccess().getLocateSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconTag__LocateAssignment_6"


    // $ANTLR start "rule__FoodInitDisplay__FoodIconAssignment_2"
    // InternalGreedySnake.g:9504:1: rule__FoodInitDisplay__FoodIconAssignment_2 : ( ruleIconTag ) ;
    public final void rule__FoodInitDisplay__FoodIconAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9508:1: ( ( ruleIconTag ) )
            // InternalGreedySnake.g:9509:2: ( ruleIconTag )
            {
            // InternalGreedySnake.g:9509:2: ( ruleIconTag )
            // InternalGreedySnake.g:9510:3: ruleIconTag
            {
             before(grammarAccess.getFoodInitDisplayAccess().getFoodIconIconTagParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIconTag();

            state._fsp--;

             after(grammarAccess.getFoodInitDisplayAccess().getFoodIconIconTagParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__FoodIconAssignment_2"


    // $ANTLR start "rule__FoodInitDisplay__IconsizeAssignment_6"
    // InternalGreedySnake.g:9519:1: rule__FoodInitDisplay__IconsizeAssignment_6 : ( ruleIconSize ) ;
    public final void rule__FoodInitDisplay__IconsizeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9523:1: ( ( ruleIconSize ) )
            // InternalGreedySnake.g:9524:2: ( ruleIconSize )
            {
            // InternalGreedySnake.g:9524:2: ( ruleIconSize )
            // InternalGreedySnake.g:9525:3: ruleIconSize
            {
             before(grammarAccess.getFoodInitDisplayAccess().getIconsizeIconSizeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleIconSize();

            state._fsp--;

             after(grammarAccess.getFoodInitDisplayAccess().getIconsizeIconSizeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__IconsizeAssignment_6"


    // $ANTLR start "rule__FoodInitDisplay__FoodKindAssignment_9"
    // InternalGreedySnake.g:9534:1: rule__FoodInitDisplay__FoodKindAssignment_9 : ( ruleFoodKind ) ;
    public final void rule__FoodInitDisplay__FoodKindAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9538:1: ( ( ruleFoodKind ) )
            // InternalGreedySnake.g:9539:2: ( ruleFoodKind )
            {
            // InternalGreedySnake.g:9539:2: ( ruleFoodKind )
            // InternalGreedySnake.g:9540:3: ruleFoodKind
            {
             before(grammarAccess.getFoodInitDisplayAccess().getFoodKindFoodKindParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleFoodKind();

            state._fsp--;

             after(grammarAccess.getFoodInitDisplayAccess().getFoodKindFoodKindParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__FoodKindAssignment_9"


    // $ANTLR start "rule__FoodInitDisplay__ProduceAssignment_12"
    // InternalGreedySnake.g:9549:1: rule__FoodInitDisplay__ProduceAssignment_12 : ( ruleRandomFoodSize ) ;
    public final void rule__FoodInitDisplay__ProduceAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9553:1: ( ( ruleRandomFoodSize ) )
            // InternalGreedySnake.g:9554:2: ( ruleRandomFoodSize )
            {
            // InternalGreedySnake.g:9554:2: ( ruleRandomFoodSize )
            // InternalGreedySnake.g:9555:3: ruleRandomFoodSize
            {
             before(grammarAccess.getFoodInitDisplayAccess().getProduceRandomFoodSizeParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleRandomFoodSize();

            state._fsp--;

             after(grammarAccess.getFoodInitDisplayAccess().getProduceRandomFoodSizeParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__ProduceAssignment_12"


    // $ANTLR start "rule__FoodInitDisplay__FoodTagAssignment_15"
    // InternalGreedySnake.g:9564:1: rule__FoodInitDisplay__FoodTagAssignment_15 : ( RULE_INT ) ;
    public final void rule__FoodInitDisplay__FoodTagAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9568:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9569:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9569:2: ( RULE_INT )
            // InternalGreedySnake.g:9570:3: RULE_INT
            {
             before(grammarAccess.getFoodInitDisplayAccess().getFoodTagINTTerminalRuleCall_15_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFoodInitDisplayAccess().getFoodTagINTTerminalRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodInitDisplay__FoodTagAssignment_15"


    // $ANTLR start "rule__FoodKind__KindAssignment_0"
    // InternalGreedySnake.g:9579:1: rule__FoodKind__KindAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FoodKind__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9583:1: ( ( ( RULE_ID ) ) )
            // InternalGreedySnake.g:9584:2: ( ( RULE_ID ) )
            {
            // InternalGreedySnake.g:9584:2: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9585:3: ( RULE_ID )
            {
             before(grammarAccess.getFoodKindAccess().getKindIconTagCrossReference_0_0()); 
            // InternalGreedySnake.g:9586:3: ( RULE_ID )
            // InternalGreedySnake.g:9587:4: RULE_ID
            {
             before(grammarAccess.getFoodKindAccess().getKindIconTagIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFoodKindAccess().getKindIconTagIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFoodKindAccess().getKindIconTagCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodKind__KindAssignment_0"


    // $ANTLR start "rule__FoodKind__PointAssignment_4"
    // InternalGreedySnake.g:9598:1: rule__FoodKind__PointAssignment_4 : ( ruleAddition ) ;
    public final void rule__FoodKind__PointAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9602:1: ( ( ruleAddition ) )
            // InternalGreedySnake.g:9603:2: ( ruleAddition )
            {
            // InternalGreedySnake.g:9603:2: ( ruleAddition )
            // InternalGreedySnake.g:9604:3: ruleAddition
            {
             before(grammarAccess.getFoodKindAccess().getPointAdditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getFoodKindAccess().getPointAdditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodKind__PointAssignment_4"


    // $ANTLR start "rule__ObstacleInitDisplay__ObstacleIconAssignment_2"
    // InternalGreedySnake.g:9613:1: rule__ObstacleInitDisplay__ObstacleIconAssignment_2 : ( ruleIconTag ) ;
    public final void rule__ObstacleInitDisplay__ObstacleIconAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9617:1: ( ( ruleIconTag ) )
            // InternalGreedySnake.g:9618:2: ( ruleIconTag )
            {
            // InternalGreedySnake.g:9618:2: ( ruleIconTag )
            // InternalGreedySnake.g:9619:3: ruleIconTag
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getObstacleIconIconTagParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIconTag();

            state._fsp--;

             after(grammarAccess.getObstacleInitDisplayAccess().getObstacleIconIconTagParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__ObstacleIconAssignment_2"


    // $ANTLR start "rule__ObstacleInitDisplay__IconsizeAssignment_6"
    // InternalGreedySnake.g:9628:1: rule__ObstacleInitDisplay__IconsizeAssignment_6 : ( ruleIconSize ) ;
    public final void rule__ObstacleInitDisplay__IconsizeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9632:1: ( ( ruleIconSize ) )
            // InternalGreedySnake.g:9633:2: ( ruleIconSize )
            {
            // InternalGreedySnake.g:9633:2: ( ruleIconSize )
            // InternalGreedySnake.g:9634:3: ruleIconSize
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getIconsizeIconSizeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleIconSize();

            state._fsp--;

             after(grammarAccess.getObstacleInitDisplayAccess().getIconsizeIconSizeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__IconsizeAssignment_6"


    // $ANTLR start "rule__ObstacleInitDisplay__ObstacleTagAssignment_9"
    // InternalGreedySnake.g:9643:1: rule__ObstacleInitDisplay__ObstacleTagAssignment_9 : ( RULE_INT ) ;
    public final void rule__ObstacleInitDisplay__ObstacleTagAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9647:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9648:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9648:2: ( RULE_INT )
            // InternalGreedySnake.g:9649:3: RULE_INT
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getObstacleTagINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObstacleInitDisplayAccess().getObstacleTagINTTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleInitDisplay__ObstacleTagAssignment_9"


    // $ANTLR start "rule__RandomFoodSize__MaxsizeAssignment_1"
    // InternalGreedySnake.g:9658:1: rule__RandomFoodSize__MaxsizeAssignment_1 : ( RULE_INT ) ;
    public final void rule__RandomFoodSize__MaxsizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9662:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9663:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9663:2: ( RULE_INT )
            // InternalGreedySnake.g:9664:3: RULE_INT
            {
             before(grammarAccess.getRandomFoodSizeAccess().getMaxsizeINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRandomFoodSizeAccess().getMaxsizeINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomFoodSize__MaxsizeAssignment_1"


    // $ANTLR start "rule__RandomFoodSize__MinsizeAssignment_3"
    // InternalGreedySnake.g:9673:1: rule__RandomFoodSize__MinsizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__RandomFoodSize__MinsizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9677:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9678:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9678:2: ( RULE_INT )
            // InternalGreedySnake.g:9679:3: RULE_INT
            {
             before(grammarAccess.getRandomFoodSizeAccess().getMinsizeINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRandomFoodSizeAccess().getMinsizeINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomFoodSize__MinsizeAssignment_3"


    // $ANTLR start "rule__ObstacleTime__NameAssignment_0"
    // InternalGreedySnake.g:9688:1: rule__ObstacleTime__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ObstacleTime__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9692:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9693:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9693:2: ( RULE_ID )
            // InternalGreedySnake.g:9694:3: RULE_ID
            {
             before(grammarAccess.getObstacleTimeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObstacleTimeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleTime__NameAssignment_0"


    // $ANTLR start "rule__ObstacleTime__ObstacleTimeAssignment_2"
    // InternalGreedySnake.g:9703:1: rule__ObstacleTime__ObstacleTimeAssignment_2 : ( RULE_INT ) ;
    public final void rule__ObstacleTime__ObstacleTimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9707:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9708:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9708:2: ( RULE_INT )
            // InternalGreedySnake.g:9709:3: RULE_INT
            {
             before(grammarAccess.getObstacleTimeAccess().getObstacleTimeINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObstacleTimeAccess().getObstacleTimeINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleTime__ObstacleTimeAssignment_2"


    // $ANTLR start "rule__FoodTime__NameAssignment_0"
    // InternalGreedySnake.g:9718:1: rule__FoodTime__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FoodTime__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9722:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9723:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9723:2: ( RULE_ID )
            // InternalGreedySnake.g:9724:3: RULE_ID
            {
             before(grammarAccess.getFoodTimeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFoodTimeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodTime__NameAssignment_0"


    // $ANTLR start "rule__FoodTime__FoodTimeAssignment_2"
    // InternalGreedySnake.g:9733:1: rule__FoodTime__FoodTimeAssignment_2 : ( RULE_INT ) ;
    public final void rule__FoodTime__FoodTimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9737:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9738:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9738:2: ( RULE_INT )
            // InternalGreedySnake.g:9739:3: RULE_INT
            {
             before(grammarAccess.getFoodTimeAccess().getFoodTimeINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFoodTimeAccess().getFoodTimeINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodTime__FoodTimeAssignment_2"


    // $ANTLR start "rule__AllItemVarSpec__TypeAssignment_0"
    // InternalGreedySnake.g:9748:1: rule__AllItemVarSpec__TypeAssignment_0 : ( ( rule__AllItemVarSpec__TypeAlternatives_0_0 ) ) ;
    public final void rule__AllItemVarSpec__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9752:1: ( ( ( rule__AllItemVarSpec__TypeAlternatives_0_0 ) ) )
            // InternalGreedySnake.g:9753:2: ( ( rule__AllItemVarSpec__TypeAlternatives_0_0 ) )
            {
            // InternalGreedySnake.g:9753:2: ( ( rule__AllItemVarSpec__TypeAlternatives_0_0 ) )
            // InternalGreedySnake.g:9754:3: ( rule__AllItemVarSpec__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getAllItemVarSpecAccess().getTypeAlternatives_0_0()); 
            // InternalGreedySnake.g:9755:3: ( rule__AllItemVarSpec__TypeAlternatives_0_0 )
            // InternalGreedySnake.g:9755:4: rule__AllItemVarSpec__TypeAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AllItemVarSpec__TypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAllItemVarSpecAccess().getTypeAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllItemVarSpec__TypeAssignment_0"


    // $ANTLR start "rule__AllItemVarSpec__NameAssignment_1"
    // InternalGreedySnake.g:9763:1: rule__AllItemVarSpec__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AllItemVarSpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9767:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9768:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9768:2: ( RULE_ID )
            // InternalGreedySnake.g:9769:3: RULE_ID
            {
             before(grammarAccess.getAllItemVarSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllItemVarSpecAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllItemVarSpec__NameAssignment_1"


    // $ANTLR start "rule__ParamSpec__TypeAssignment_0"
    // InternalGreedySnake.g:9778:1: rule__ParamSpec__TypeAssignment_0 : ( ( rule__ParamSpec__TypeAlternatives_0_0 ) ) ;
    public final void rule__ParamSpec__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9782:1: ( ( ( rule__ParamSpec__TypeAlternatives_0_0 ) ) )
            // InternalGreedySnake.g:9783:2: ( ( rule__ParamSpec__TypeAlternatives_0_0 ) )
            {
            // InternalGreedySnake.g:9783:2: ( ( rule__ParamSpec__TypeAlternatives_0_0 ) )
            // InternalGreedySnake.g:9784:3: ( rule__ParamSpec__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getParamSpecAccess().getTypeAlternatives_0_0()); 
            // InternalGreedySnake.g:9785:3: ( rule__ParamSpec__TypeAlternatives_0_0 )
            // InternalGreedySnake.g:9785:4: rule__ParamSpec__TypeAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ParamSpec__TypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getParamSpecAccess().getTypeAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamSpec__TypeAssignment_0"


    // $ANTLR start "rule__ParamSpec__NameAssignment_1"
    // InternalGreedySnake.g:9793:1: rule__ParamSpec__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParamSpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9797:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9798:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9798:2: ( RULE_ID )
            // InternalGreedySnake.g:9799:3: RULE_ID
            {
             before(grammarAccess.getParamSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParamSpecAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamSpec__NameAssignment_1"


    // $ANTLR start "rule__Addition__OperatorAssignment_1_1"
    // InternalGreedySnake.g:9808:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9812:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalGreedySnake.g:9813:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalGreedySnake.g:9813:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalGreedySnake.g:9814:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalGreedySnake.g:9815:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalGreedySnake.g:9815:4: rule__Addition__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OperatorAssignment_1_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // InternalGreedySnake.g:9823:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9827:1: ( ( ruleMultiplication ) )
            // InternalGreedySnake.g:9828:2: ( ruleMultiplication )
            {
            // InternalGreedySnake.g:9828:2: ( ruleMultiplication )
            // InternalGreedySnake.g:9829:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplication__OperatorAssignment_1_1"
    // InternalGreedySnake.g:9838:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9842:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalGreedySnake.g:9843:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalGreedySnake.g:9843:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalGreedySnake.g:9844:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalGreedySnake.g:9845:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalGreedySnake.g:9845:4: rule__Multiplication__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OperatorAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // InternalGreedySnake.g:9853:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9857:1: ( ( rulePrimary ) )
            // InternalGreedySnake.g:9858:2: ( rulePrimary )
            {
            // InternalGreedySnake.g:9858:2: ( rulePrimary )
            // InternalGreedySnake.g:9859:3: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__IntLiteral__ValAssignment"
    // InternalGreedySnake.g:9868:1: rule__IntLiteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9872:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9873:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9873:2: ( RULE_INT )
            // InternalGreedySnake.g:9874:3: RULE_INT
            {
             before(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__ValAssignment"


    // $ANTLR start "rule__RealLiteral__ValAssignment"
    // InternalGreedySnake.g:9883:1: rule__RealLiteral__ValAssignment : ( ruleREAL ) ;
    public final void rule__RealLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9887:1: ( ( ruleREAL ) )
            // InternalGreedySnake.g:9888:2: ( ruleREAL )
            {
            // InternalGreedySnake.g:9888:2: ( ruleREAL )
            // InternalGreedySnake.g:9889:3: ruleREAL
            {
             before(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__ValAssignment"


    // $ANTLR start "rule__StartFieldDeclaration__FieldAssignment_2"
    // InternalGreedySnake.g:9898:1: rule__StartFieldDeclaration__FieldAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StartFieldDeclaration__FieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9902:1: ( ( ( RULE_ID ) ) )
            // InternalGreedySnake.g:9903:2: ( ( RULE_ID ) )
            {
            // InternalGreedySnake.g:9903:2: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9904:3: ( RULE_ID )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldGlobalFieldInitialisationCrossReference_2_0()); 
            // InternalGreedySnake.g:9905:3: ( RULE_ID )
            // InternalGreedySnake.g:9906:4: RULE_ID
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldGlobalFieldInitialisationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStartFieldDeclarationAccess().getFieldGlobalFieldInitialisationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStartFieldDeclarationAccess().getFieldGlobalFieldInitialisationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__FieldAssignment_2"


    // $ANTLR start "rule__AboutSpecification__NameAssignment_1"
    // InternalGreedySnake.g:9917:1: rule__AboutSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AboutSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9921:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9922:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9922:2: ( RULE_ID )
            // InternalGreedySnake.g:9923:3: RULE_ID
            {
             before(grammarAccess.getAboutSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAboutSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__NameAssignment_1"


    // $ANTLR start "rule__AboutSpecification__AboutTitleAssignment_5"
    // InternalGreedySnake.g:9932:1: rule__AboutSpecification__AboutTitleAssignment_5 : ( RULE_STRING ) ;
    public final void rule__AboutSpecification__AboutTitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9936:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:9937:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:9937:2: ( RULE_STRING )
            // InternalGreedySnake.g:9938:3: RULE_STRING
            {
             before(grammarAccess.getAboutSpecificationAccess().getAboutTitleSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAboutSpecificationAccess().getAboutTitleSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__AboutTitleAssignment_5"


    // $ANTLR start "rule__AboutSpecification__AboutInforAssignment_8"
    // InternalGreedySnake.g:9947:1: rule__AboutSpecification__AboutInforAssignment_8 : ( RULE_STRING ) ;
    public final void rule__AboutSpecification__AboutInforAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9951:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:9952:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:9952:2: ( RULE_STRING )
            // InternalGreedySnake.g:9953:3: RULE_STRING
            {
             before(grammarAccess.getAboutSpecificationAccess().getAboutInforSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAboutSpecificationAccess().getAboutInforSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__AboutInforAssignment_8"


    // $ANTLR start "rule__AboutSpecification__XAssignment_12"
    // InternalGreedySnake.g:9962:1: rule__AboutSpecification__XAssignment_12 : ( RULE_INT ) ;
    public final void rule__AboutSpecification__XAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9966:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9967:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9967:2: ( RULE_INT )
            // InternalGreedySnake.g:9968:3: RULE_INT
            {
             before(grammarAccess.getAboutSpecificationAccess().getXINTTerminalRuleCall_12_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAboutSpecificationAccess().getXINTTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__XAssignment_12"


    // $ANTLR start "rule__AboutSpecification__YAssignment_14"
    // InternalGreedySnake.g:9977:1: rule__AboutSpecification__YAssignment_14 : ( RULE_INT ) ;
    public final void rule__AboutSpecification__YAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9981:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9982:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9982:2: ( RULE_INT )
            // InternalGreedySnake.g:9983:3: RULE_INT
            {
             before(grammarAccess.getAboutSpecificationAccess().getYINTTerminalRuleCall_14_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAboutSpecificationAccess().getYINTTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutSpecification__YAssignment_14"


    // $ANTLR start "rule__HelpSpecification__NameAssignment_1"
    // InternalGreedySnake.g:9992:1: rule__HelpSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HelpSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9996:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9997:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9997:2: ( RULE_ID )
            // InternalGreedySnake.g:9998:3: RULE_ID
            {
             before(grammarAccess.getHelpSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHelpSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__NameAssignment_1"


    // $ANTLR start "rule__HelpSpecification__HelpTitleAssignment_5"
    // InternalGreedySnake.g:10007:1: rule__HelpSpecification__HelpTitleAssignment_5 : ( RULE_STRING ) ;
    public final void rule__HelpSpecification__HelpTitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10011:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:10012:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:10012:2: ( RULE_STRING )
            // InternalGreedySnake.g:10013:3: RULE_STRING
            {
             before(grammarAccess.getHelpSpecificationAccess().getHelpTitleSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHelpSpecificationAccess().getHelpTitleSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__HelpTitleAssignment_5"


    // $ANTLR start "rule__HelpSpecification__HelpInforAssignment_8"
    // InternalGreedySnake.g:10022:1: rule__HelpSpecification__HelpInforAssignment_8 : ( RULE_STRING ) ;
    public final void rule__HelpSpecification__HelpInforAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10026:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:10027:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:10027:2: ( RULE_STRING )
            // InternalGreedySnake.g:10028:3: RULE_STRING
            {
             before(grammarAccess.getHelpSpecificationAccess().getHelpInforSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHelpSpecificationAccess().getHelpInforSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__HelpInforAssignment_8"


    // $ANTLR start "rule__HelpSpecification__XAssignment_12"
    // InternalGreedySnake.g:10037:1: rule__HelpSpecification__XAssignment_12 : ( RULE_INT ) ;
    public final void rule__HelpSpecification__XAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10041:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10042:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10042:2: ( RULE_INT )
            // InternalGreedySnake.g:10043:3: RULE_INT
            {
             before(grammarAccess.getHelpSpecificationAccess().getXINTTerminalRuleCall_12_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHelpSpecificationAccess().getXINTTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__XAssignment_12"


    // $ANTLR start "rule__HelpSpecification__YAssignment_14"
    // InternalGreedySnake.g:10052:1: rule__HelpSpecification__YAssignment_14 : ( RULE_INT ) ;
    public final void rule__HelpSpecification__YAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10056:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10057:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10057:2: ( RULE_INT )
            // InternalGreedySnake.g:10058:3: RULE_INT
            {
             before(grammarAccess.getHelpSpecificationAccess().getYINTTerminalRuleCall_14_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHelpSpecificationAccess().getYINTTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelpSpecification__YAssignment_14"


    // $ANTLR start "rule__BackSpecification__BackgroundIconAssignment_4"
    // InternalGreedySnake.g:10067:1: rule__BackSpecification__BackgroundIconAssignment_4 : ( ruleBackgroundIcon ) ;
    public final void rule__BackSpecification__BackgroundIconAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10071:1: ( ( ruleBackgroundIcon ) )
            // InternalGreedySnake.g:10072:2: ( ruleBackgroundIcon )
            {
            // InternalGreedySnake.g:10072:2: ( ruleBackgroundIcon )
            // InternalGreedySnake.g:10073:3: ruleBackgroundIcon
            {
             before(grammarAccess.getBackSpecificationAccess().getBackgroundIconBackgroundIconParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBackgroundIcon();

            state._fsp--;

             after(grammarAccess.getBackSpecificationAccess().getBackgroundIconBackgroundIconParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__BackgroundIconAssignment_4"


    // $ANTLR start "rule__BackSpecification__BackGroundHeightAssignment_8"
    // InternalGreedySnake.g:10082:1: rule__BackSpecification__BackGroundHeightAssignment_8 : ( ruleBackGroundSize ) ;
    public final void rule__BackSpecification__BackGroundHeightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10086:1: ( ( ruleBackGroundSize ) )
            // InternalGreedySnake.g:10087:2: ( ruleBackGroundSize )
            {
            // InternalGreedySnake.g:10087:2: ( ruleBackGroundSize )
            // InternalGreedySnake.g:10088:3: ruleBackGroundSize
            {
             before(grammarAccess.getBackSpecificationAccess().getBackGroundHeightBackGroundSizeParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleBackGroundSize();

            state._fsp--;

             after(grammarAccess.getBackSpecificationAccess().getBackGroundHeightBackGroundSizeParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__BackGroundHeightAssignment_8"


    // $ANTLR start "rule__BackSpecification__BackGroundWidthAssignment_11"
    // InternalGreedySnake.g:10097:1: rule__BackSpecification__BackGroundWidthAssignment_11 : ( ruleBackGroundSize ) ;
    public final void rule__BackSpecification__BackGroundWidthAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10101:1: ( ( ruleBackGroundSize ) )
            // InternalGreedySnake.g:10102:2: ( ruleBackGroundSize )
            {
            // InternalGreedySnake.g:10102:2: ( ruleBackGroundSize )
            // InternalGreedySnake.g:10103:3: ruleBackGroundSize
            {
             before(grammarAccess.getBackSpecificationAccess().getBackGroundWidthBackGroundSizeParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleBackGroundSize();

            state._fsp--;

             after(grammarAccess.getBackSpecificationAccess().getBackGroundWidthBackGroundSizeParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackSpecification__BackGroundWidthAssignment_11"


    // $ANTLR start "rule__BackgroundIcon__BackgroundTagAssignment_1"
    // InternalGreedySnake.g:10112:1: rule__BackgroundIcon__BackgroundTagAssignment_1 : ( ruleBackgroundTag ) ;
    public final void rule__BackgroundIcon__BackgroundTagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10116:1: ( ( ruleBackgroundTag ) )
            // InternalGreedySnake.g:10117:2: ( ruleBackgroundTag )
            {
            // InternalGreedySnake.g:10117:2: ( ruleBackgroundTag )
            // InternalGreedySnake.g:10118:3: ruleBackgroundTag
            {
             before(grammarAccess.getBackgroundIconAccess().getBackgroundTagBackgroundTagParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBackgroundTag();

            state._fsp--;

             after(grammarAccess.getBackgroundIconAccess().getBackgroundTagBackgroundTagParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundIcon__BackgroundTagAssignment_1"


    // $ANTLR start "rule__BackgroundTag__NameAssignment_0"
    // InternalGreedySnake.g:10127:1: rule__BackgroundTag__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BackgroundTag__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10131:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:10132:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:10132:2: ( RULE_ID )
            // InternalGreedySnake.g:10133:3: RULE_ID
            {
             before(grammarAccess.getBackgroundTagAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBackgroundTagAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundTag__NameAssignment_0"


    // $ANTLR start "rule__BackgroundTag__ValueAssignment_1"
    // InternalGreedySnake.g:10142:1: rule__BackgroundTag__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__BackgroundTag__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10146:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:10147:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:10147:2: ( RULE_STRING )
            // InternalGreedySnake.g:10148:3: RULE_STRING
            {
             before(grammarAccess.getBackgroundTagAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBackgroundTagAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundTag__ValueAssignment_1"


    // $ANTLR start "rule__BackgroundTag__BKtagAssignment_3"
    // InternalGreedySnake.g:10157:1: rule__BackgroundTag__BKtagAssignment_3 : ( RULE_INT ) ;
    public final void rule__BackgroundTag__BKtagAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10161:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10162:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10162:2: ( RULE_INT )
            // InternalGreedySnake.g:10163:3: RULE_INT
            {
             before(grammarAccess.getBackgroundTagAccess().getBKtagINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBackgroundTagAccess().getBKtagINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundTag__BKtagAssignment_3"


    // $ANTLR start "rule__BackgroundTag__LocateAssignment_6"
    // InternalGreedySnake.g:10172:1: rule__BackgroundTag__LocateAssignment_6 : ( RULE_STRING ) ;
    public final void rule__BackgroundTag__LocateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10176:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:10177:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:10177:2: ( RULE_STRING )
            // InternalGreedySnake.g:10178:3: RULE_STRING
            {
             before(grammarAccess.getBackgroundTagAccess().getLocateSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBackgroundTagAccess().getLocateSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackgroundTag__LocateAssignment_6"


    // $ANTLR start "rule__MusicSpecification__BuffersizeAssignment_4"
    // InternalGreedySnake.g:10187:1: rule__MusicSpecification__BuffersizeAssignment_4 : ( RULE_INT ) ;
    public final void rule__MusicSpecification__BuffersizeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10191:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10192:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10192:2: ( RULE_INT )
            // InternalGreedySnake.g:10193:3: RULE_INT
            {
             before(grammarAccess.getMusicSpecificationAccess().getBuffersizeINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMusicSpecificationAccess().getBuffersizeINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSpecification__BuffersizeAssignment_4"


    // $ANTLR start "rule__MusicSpecification__MusicPathAssignment_5"
    // InternalGreedySnake.g:10202:1: rule__MusicSpecification__MusicPathAssignment_5 : ( ruleMusicPath ) ;
    public final void rule__MusicSpecification__MusicPathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10206:1: ( ( ruleMusicPath ) )
            // InternalGreedySnake.g:10207:2: ( ruleMusicPath )
            {
            // InternalGreedySnake.g:10207:2: ( ruleMusicPath )
            // InternalGreedySnake.g:10208:3: ruleMusicPath
            {
             before(grammarAccess.getMusicSpecificationAccess().getMusicPathMusicPathParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMusicPath();

            state._fsp--;

             after(grammarAccess.getMusicSpecificationAccess().getMusicPathMusicPathParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSpecification__MusicPathAssignment_5"


    // $ANTLR start "rule__MusicPath__NameAssignment_0"
    // InternalGreedySnake.g:10217:1: rule__MusicPath__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MusicPath__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10221:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:10222:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:10222:2: ( RULE_ID )
            // InternalGreedySnake.g:10223:3: RULE_ID
            {
             before(grammarAccess.getMusicPathAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMusicPathAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicPath__NameAssignment_0"


    // $ANTLR start "rule__MusicPath__PathAssignment_3"
    // InternalGreedySnake.g:10232:1: rule__MusicPath__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__MusicPath__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10236:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:10237:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:10237:2: ( RULE_STRING )
            // InternalGreedySnake.g:10238:3: RULE_STRING
            {
             before(grammarAccess.getMusicPathAccess().getPathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMusicPathAccess().getPathSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicPath__PathAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x80001F0000A00020L,0x000000000000118EL});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x80001F0000A00022L,0x000000000000118EL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000080000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});

}
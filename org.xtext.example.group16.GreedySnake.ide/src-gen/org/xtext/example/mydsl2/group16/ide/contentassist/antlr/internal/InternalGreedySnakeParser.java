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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'x'", "'y'", "'+'", "'-'", "'*'", "'/'", "'LEFT'", "'RIGHT'", "'UP'", "'DOWN'", "'game'", "'{'", "'}'", "'Filepath'", "'='", "'field'", "'Panel_width'", "'Panel_Height'", "'column'", "'row'", "'label_width'", "'label_Height'", "'init'", "'('", "')'", "'Default'", "':'", "'snakeLength'", "'Score'", "'Time'", "'Amount'", "'Weapon'", "'snake'", "'food'", "'obstacle'", "'fire'", "'Speed'", "'move'", "'if'", "'direction'", "'.'", "'FireIcon'", "'Icon_size'", "'head'", "','", "'headIcon'", "'BodyIcon'", "'defaultSpeed'", "'snakeTag'", "'Locate'", "'foodIcon'", "'foodKind'", "'randomFoodSize'", "'foodTag'", "'point'", "'ObstacleIcon'", "'ObstacleTag'", "'Maxsize'", "'Minsize'", "'timeLimited'", "'Direction'", "'restartGame'", "'start'", "'about'", "'Title'", "'Information'", "'Label_size'", "'help'", "'backGround'", "'Icon'", "'Height'", "'Width'", "'Music'", "'BufferSize'", "'path'"
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
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
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


    // $ANTLR start "entryRuleSnakeMoveSpecification"
    // InternalGreedySnake.g:428:1: entryRuleSnakeMoveSpecification : ruleSnakeMoveSpecification EOF ;
    public final void entryRuleSnakeMoveSpecification() throws RecognitionException {
        try {
            // InternalGreedySnake.g:429:1: ( ruleSnakeMoveSpecification EOF )
            // InternalGreedySnake.g:430:1: ruleSnakeMoveSpecification EOF
            {
             before(grammarAccess.getSnakeMoveSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleSnakeMoveSpecification();

            state._fsp--;

             after(grammarAccess.getSnakeMoveSpecificationRule()); 
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
    // $ANTLR end "entryRuleSnakeMoveSpecification"


    // $ANTLR start "ruleSnakeMoveSpecification"
    // InternalGreedySnake.g:437:1: ruleSnakeMoveSpecification : ( ( rule__SnakeMoveSpecification__Group__0 ) ) ;
    public final void ruleSnakeMoveSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:441:2: ( ( ( rule__SnakeMoveSpecification__Group__0 ) ) )
            // InternalGreedySnake.g:442:2: ( ( rule__SnakeMoveSpecification__Group__0 ) )
            {
            // InternalGreedySnake.g:442:2: ( ( rule__SnakeMoveSpecification__Group__0 ) )
            // InternalGreedySnake.g:443:3: ( rule__SnakeMoveSpecification__Group__0 )
            {
             before(grammarAccess.getSnakeMoveSpecificationAccess().getGroup()); 
            // InternalGreedySnake.g:444:3: ( rule__SnakeMoveSpecification__Group__0 )
            // InternalGreedySnake.g:444:4: rule__SnakeMoveSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SnakeMoveSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSnakeMoveSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSnakeMoveSpecification"


    // $ANTLR start "entryRuleMove"
    // InternalGreedySnake.g:453:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalGreedySnake.g:454:1: ( ruleMove EOF )
            // InternalGreedySnake.g:455:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalGreedySnake.g:462:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:466:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalGreedySnake.g:467:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalGreedySnake.g:467:2: ( ( rule__Move__Group__0 ) )
            // InternalGreedySnake.g:468:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalGreedySnake.g:469:3: ( rule__Move__Group__0 )
            // InternalGreedySnake.g:469:4: rule__Move__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleFireInitDisplay"
    // InternalGreedySnake.g:478:1: entryRuleFireInitDisplay : ruleFireInitDisplay EOF ;
    public final void entryRuleFireInitDisplay() throws RecognitionException {
        try {
            // InternalGreedySnake.g:479:1: ( ruleFireInitDisplay EOF )
            // InternalGreedySnake.g:480:1: ruleFireInitDisplay EOF
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
    // InternalGreedySnake.g:487:1: ruleFireInitDisplay : ( ( rule__FireInitDisplay__Group__0 ) ) ;
    public final void ruleFireInitDisplay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:491:2: ( ( ( rule__FireInitDisplay__Group__0 ) ) )
            // InternalGreedySnake.g:492:2: ( ( rule__FireInitDisplay__Group__0 ) )
            {
            // InternalGreedySnake.g:492:2: ( ( rule__FireInitDisplay__Group__0 ) )
            // InternalGreedySnake.g:493:3: ( rule__FireInitDisplay__Group__0 )
            {
             before(grammarAccess.getFireInitDisplayAccess().getGroup()); 
            // InternalGreedySnake.g:494:3: ( rule__FireInitDisplay__Group__0 )
            // InternalGreedySnake.g:494:4: rule__FireInitDisplay__Group__0
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
    // InternalGreedySnake.g:503:1: entryRuleSnakeInitDisplay : ruleSnakeInitDisplay EOF ;
    public final void entryRuleSnakeInitDisplay() throws RecognitionException {
        try {
            // InternalGreedySnake.g:504:1: ( ruleSnakeInitDisplay EOF )
            // InternalGreedySnake.g:505:1: ruleSnakeInitDisplay EOF
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
    // InternalGreedySnake.g:512:1: ruleSnakeInitDisplay : ( ( rule__SnakeInitDisplay__Group__0 ) ) ;
    public final void ruleSnakeInitDisplay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:516:2: ( ( ( rule__SnakeInitDisplay__Group__0 ) ) )
            // InternalGreedySnake.g:517:2: ( ( rule__SnakeInitDisplay__Group__0 ) )
            {
            // InternalGreedySnake.g:517:2: ( ( rule__SnakeInitDisplay__Group__0 ) )
            // InternalGreedySnake.g:518:3: ( rule__SnakeInitDisplay__Group__0 )
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getGroup()); 
            // InternalGreedySnake.g:519:3: ( rule__SnakeInitDisplay__Group__0 )
            // InternalGreedySnake.g:519:4: rule__SnakeInitDisplay__Group__0
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
    // InternalGreedySnake.g:528:1: entryRuleIconSize : ruleIconSize EOF ;
    public final void entryRuleIconSize() throws RecognitionException {
        try {
            // InternalGreedySnake.g:529:1: ( ruleIconSize EOF )
            // InternalGreedySnake.g:530:1: ruleIconSize EOF
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
    // InternalGreedySnake.g:537:1: ruleIconSize : ( RULE_INT ) ;
    public final void ruleIconSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:541:2: ( ( RULE_INT ) )
            // InternalGreedySnake.g:542:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:542:2: ( RULE_INT )
            // InternalGreedySnake.g:543:3: RULE_INT
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
    // InternalGreedySnake.g:553:1: entryRuleIconTag : ruleIconTag EOF ;
    public final void entryRuleIconTag() throws RecognitionException {
        try {
            // InternalGreedySnake.g:554:1: ( ruleIconTag EOF )
            // InternalGreedySnake.g:555:1: ruleIconTag EOF
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
    // InternalGreedySnake.g:562:1: ruleIconTag : ( ( rule__IconTag__Group__0 ) ) ;
    public final void ruleIconTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:566:2: ( ( ( rule__IconTag__Group__0 ) ) )
            // InternalGreedySnake.g:567:2: ( ( rule__IconTag__Group__0 ) )
            {
            // InternalGreedySnake.g:567:2: ( ( rule__IconTag__Group__0 ) )
            // InternalGreedySnake.g:568:3: ( rule__IconTag__Group__0 )
            {
             before(grammarAccess.getIconTagAccess().getGroup()); 
            // InternalGreedySnake.g:569:3: ( rule__IconTag__Group__0 )
            // InternalGreedySnake.g:569:4: rule__IconTag__Group__0
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
    // InternalGreedySnake.g:578:1: entryRuleFoodInitDisplay : ruleFoodInitDisplay EOF ;
    public final void entryRuleFoodInitDisplay() throws RecognitionException {
        try {
            // InternalGreedySnake.g:579:1: ( ruleFoodInitDisplay EOF )
            // InternalGreedySnake.g:580:1: ruleFoodInitDisplay EOF
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
    // InternalGreedySnake.g:587:1: ruleFoodInitDisplay : ( ( rule__FoodInitDisplay__Group__0 ) ) ;
    public final void ruleFoodInitDisplay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:591:2: ( ( ( rule__FoodInitDisplay__Group__0 ) ) )
            // InternalGreedySnake.g:592:2: ( ( rule__FoodInitDisplay__Group__0 ) )
            {
            // InternalGreedySnake.g:592:2: ( ( rule__FoodInitDisplay__Group__0 ) )
            // InternalGreedySnake.g:593:3: ( rule__FoodInitDisplay__Group__0 )
            {
             before(grammarAccess.getFoodInitDisplayAccess().getGroup()); 
            // InternalGreedySnake.g:594:3: ( rule__FoodInitDisplay__Group__0 )
            // InternalGreedySnake.g:594:4: rule__FoodInitDisplay__Group__0
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
    // InternalGreedySnake.g:603:1: entryRuleFoodKind : ruleFoodKind EOF ;
    public final void entryRuleFoodKind() throws RecognitionException {
        try {
            // InternalGreedySnake.g:604:1: ( ruleFoodKind EOF )
            // InternalGreedySnake.g:605:1: ruleFoodKind EOF
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
    // InternalGreedySnake.g:612:1: ruleFoodKind : ( ( rule__FoodKind__Group__0 ) ) ;
    public final void ruleFoodKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:616:2: ( ( ( rule__FoodKind__Group__0 ) ) )
            // InternalGreedySnake.g:617:2: ( ( rule__FoodKind__Group__0 ) )
            {
            // InternalGreedySnake.g:617:2: ( ( rule__FoodKind__Group__0 ) )
            // InternalGreedySnake.g:618:3: ( rule__FoodKind__Group__0 )
            {
             before(grammarAccess.getFoodKindAccess().getGroup()); 
            // InternalGreedySnake.g:619:3: ( rule__FoodKind__Group__0 )
            // InternalGreedySnake.g:619:4: rule__FoodKind__Group__0
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
    // InternalGreedySnake.g:628:1: entryRuleObstacleInitDisplay : ruleObstacleInitDisplay EOF ;
    public final void entryRuleObstacleInitDisplay() throws RecognitionException {
        try {
            // InternalGreedySnake.g:629:1: ( ruleObstacleInitDisplay EOF )
            // InternalGreedySnake.g:630:1: ruleObstacleInitDisplay EOF
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
    // InternalGreedySnake.g:637:1: ruleObstacleInitDisplay : ( ( rule__ObstacleInitDisplay__Group__0 ) ) ;
    public final void ruleObstacleInitDisplay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:641:2: ( ( ( rule__ObstacleInitDisplay__Group__0 ) ) )
            // InternalGreedySnake.g:642:2: ( ( rule__ObstacleInitDisplay__Group__0 ) )
            {
            // InternalGreedySnake.g:642:2: ( ( rule__ObstacleInitDisplay__Group__0 ) )
            // InternalGreedySnake.g:643:3: ( rule__ObstacleInitDisplay__Group__0 )
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getGroup()); 
            // InternalGreedySnake.g:644:3: ( rule__ObstacleInitDisplay__Group__0 )
            // InternalGreedySnake.g:644:4: rule__ObstacleInitDisplay__Group__0
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
    // InternalGreedySnake.g:653:1: entryRuleRandomFoodSize : ruleRandomFoodSize EOF ;
    public final void entryRuleRandomFoodSize() throws RecognitionException {
        try {
            // InternalGreedySnake.g:654:1: ( ruleRandomFoodSize EOF )
            // InternalGreedySnake.g:655:1: ruleRandomFoodSize EOF
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
    // InternalGreedySnake.g:662:1: ruleRandomFoodSize : ( ( rule__RandomFoodSize__Group__0 ) ) ;
    public final void ruleRandomFoodSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:666:2: ( ( ( rule__RandomFoodSize__Group__0 ) ) )
            // InternalGreedySnake.g:667:2: ( ( rule__RandomFoodSize__Group__0 ) )
            {
            // InternalGreedySnake.g:667:2: ( ( rule__RandomFoodSize__Group__0 ) )
            // InternalGreedySnake.g:668:3: ( rule__RandomFoodSize__Group__0 )
            {
             before(grammarAccess.getRandomFoodSizeAccess().getGroup()); 
            // InternalGreedySnake.g:669:3: ( rule__RandomFoodSize__Group__0 )
            // InternalGreedySnake.g:669:4: rule__RandomFoodSize__Group__0
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
    // InternalGreedySnake.g:678:1: entryRuleTimeLimited : ruleTimeLimited EOF ;
    public final void entryRuleTimeLimited() throws RecognitionException {
        try {
            // InternalGreedySnake.g:679:1: ( ruleTimeLimited EOF )
            // InternalGreedySnake.g:680:1: ruleTimeLimited EOF
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
    // InternalGreedySnake.g:687:1: ruleTimeLimited : ( ( rule__TimeLimited__Alternatives ) ) ;
    public final void ruleTimeLimited() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:691:2: ( ( ( rule__TimeLimited__Alternatives ) ) )
            // InternalGreedySnake.g:692:2: ( ( rule__TimeLimited__Alternatives ) )
            {
            // InternalGreedySnake.g:692:2: ( ( rule__TimeLimited__Alternatives ) )
            // InternalGreedySnake.g:693:3: ( rule__TimeLimited__Alternatives )
            {
             before(grammarAccess.getTimeLimitedAccess().getAlternatives()); 
            // InternalGreedySnake.g:694:3: ( rule__TimeLimited__Alternatives )
            // InternalGreedySnake.g:694:4: rule__TimeLimited__Alternatives
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
    // InternalGreedySnake.g:703:1: entryRuleObstacleTime : ruleObstacleTime EOF ;
    public final void entryRuleObstacleTime() throws RecognitionException {
        try {
            // InternalGreedySnake.g:704:1: ( ruleObstacleTime EOF )
            // InternalGreedySnake.g:705:1: ruleObstacleTime EOF
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
    // InternalGreedySnake.g:712:1: ruleObstacleTime : ( ( rule__ObstacleTime__Group__0 ) ) ;
    public final void ruleObstacleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:716:2: ( ( ( rule__ObstacleTime__Group__0 ) ) )
            // InternalGreedySnake.g:717:2: ( ( rule__ObstacleTime__Group__0 ) )
            {
            // InternalGreedySnake.g:717:2: ( ( rule__ObstacleTime__Group__0 ) )
            // InternalGreedySnake.g:718:3: ( rule__ObstacleTime__Group__0 )
            {
             before(grammarAccess.getObstacleTimeAccess().getGroup()); 
            // InternalGreedySnake.g:719:3: ( rule__ObstacleTime__Group__0 )
            // InternalGreedySnake.g:719:4: rule__ObstacleTime__Group__0
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
    // InternalGreedySnake.g:728:1: entryRuleFoodTime : ruleFoodTime EOF ;
    public final void entryRuleFoodTime() throws RecognitionException {
        try {
            // InternalGreedySnake.g:729:1: ( ruleFoodTime EOF )
            // InternalGreedySnake.g:730:1: ruleFoodTime EOF
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
    // InternalGreedySnake.g:737:1: ruleFoodTime : ( ( rule__FoodTime__Group__0 ) ) ;
    public final void ruleFoodTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:741:2: ( ( ( rule__FoodTime__Group__0 ) ) )
            // InternalGreedySnake.g:742:2: ( ( rule__FoodTime__Group__0 ) )
            {
            // InternalGreedySnake.g:742:2: ( ( rule__FoodTime__Group__0 ) )
            // InternalGreedySnake.g:743:3: ( rule__FoodTime__Group__0 )
            {
             before(grammarAccess.getFoodTimeAccess().getGroup()); 
            // InternalGreedySnake.g:744:3: ( rule__FoodTime__Group__0 )
            // InternalGreedySnake.g:744:4: rule__FoodTime__Group__0
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


    // $ANTLR start "entryRuleDirectionSpecification"
    // InternalGreedySnake.g:753:1: entryRuleDirectionSpecification : ruleDirectionSpecification EOF ;
    public final void entryRuleDirectionSpecification() throws RecognitionException {
        try {
            // InternalGreedySnake.g:754:1: ( ruleDirectionSpecification EOF )
            // InternalGreedySnake.g:755:1: ruleDirectionSpecification EOF
            {
             before(grammarAccess.getDirectionSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleDirectionSpecification();

            state._fsp--;

             after(grammarAccess.getDirectionSpecificationRule()); 
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
    // $ANTLR end "entryRuleDirectionSpecification"


    // $ANTLR start "ruleDirectionSpecification"
    // InternalGreedySnake.g:762:1: ruleDirectionSpecification : ( ( rule__DirectionSpecification__Group__0 ) ) ;
    public final void ruleDirectionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:766:2: ( ( ( rule__DirectionSpecification__Group__0 ) ) )
            // InternalGreedySnake.g:767:2: ( ( rule__DirectionSpecification__Group__0 ) )
            {
            // InternalGreedySnake.g:767:2: ( ( rule__DirectionSpecification__Group__0 ) )
            // InternalGreedySnake.g:768:3: ( rule__DirectionSpecification__Group__0 )
            {
             before(grammarAccess.getDirectionSpecificationAccess().getGroup()); 
            // InternalGreedySnake.g:769:3: ( rule__DirectionSpecification__Group__0 )
            // InternalGreedySnake.g:769:4: rule__DirectionSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DirectionSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectionSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectionSpecification"


    // $ANTLR start "entryRuledis"
    // InternalGreedySnake.g:778:1: entryRuledis : ruledis EOF ;
    public final void entryRuledis() throws RecognitionException {
        try {
            // InternalGreedySnake.g:779:1: ( ruledis EOF )
            // InternalGreedySnake.g:780:1: ruledis EOF
            {
             before(grammarAccess.getDisRule()); 
            pushFollow(FOLLOW_1);
            ruledis();

            state._fsp--;

             after(grammarAccess.getDisRule()); 
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
    // $ANTLR end "entryRuledis"


    // $ANTLR start "ruledis"
    // InternalGreedySnake.g:787:1: ruledis : ( ( rule__Dis__Group__0 ) ) ;
    public final void ruledis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:791:2: ( ( ( rule__Dis__Group__0 ) ) )
            // InternalGreedySnake.g:792:2: ( ( rule__Dis__Group__0 ) )
            {
            // InternalGreedySnake.g:792:2: ( ( rule__Dis__Group__0 ) )
            // InternalGreedySnake.g:793:3: ( rule__Dis__Group__0 )
            {
             before(grammarAccess.getDisAccess().getGroup()); 
            // InternalGreedySnake.g:794:3: ( rule__Dis__Group__0 )
            // InternalGreedySnake.g:794:4: rule__Dis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledis"


    // $ANTLR start "entryRuleAddition"
    // InternalGreedySnake.g:803:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalGreedySnake.g:804:1: ( ruleAddition EOF )
            // InternalGreedySnake.g:805:1: ruleAddition EOF
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
    // InternalGreedySnake.g:812:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:816:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalGreedySnake.g:817:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalGreedySnake.g:817:2: ( ( rule__Addition__Group__0 ) )
            // InternalGreedySnake.g:818:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalGreedySnake.g:819:3: ( rule__Addition__Group__0 )
            // InternalGreedySnake.g:819:4: rule__Addition__Group__0
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
    // InternalGreedySnake.g:828:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalGreedySnake.g:829:1: ( ruleMultiplication EOF )
            // InternalGreedySnake.g:830:1: ruleMultiplication EOF
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
    // InternalGreedySnake.g:837:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:841:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalGreedySnake.g:842:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalGreedySnake.g:842:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalGreedySnake.g:843:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalGreedySnake.g:844:3: ( rule__Multiplication__Group__0 )
            // InternalGreedySnake.g:844:4: rule__Multiplication__Group__0
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
    // InternalGreedySnake.g:853:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalGreedySnake.g:854:1: ( rulePrimary EOF )
            // InternalGreedySnake.g:855:1: rulePrimary EOF
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
    // InternalGreedySnake.g:862:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:866:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalGreedySnake.g:867:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalGreedySnake.g:867:2: ( ( rule__Primary__Alternatives ) )
            // InternalGreedySnake.g:868:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalGreedySnake.g:869:3: ( rule__Primary__Alternatives )
            // InternalGreedySnake.g:869:4: rule__Primary__Alternatives
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
    // InternalGreedySnake.g:878:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalGreedySnake.g:879:1: ( ruleIntLiteral EOF )
            // InternalGreedySnake.g:880:1: ruleIntLiteral EOF
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
    // InternalGreedySnake.g:887:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:891:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalGreedySnake.g:892:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalGreedySnake.g:892:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalGreedySnake.g:893:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalGreedySnake.g:894:3: ( rule__IntLiteral__ValAssignment )
            // InternalGreedySnake.g:894:4: rule__IntLiteral__ValAssignment
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
    // InternalGreedySnake.g:903:1: entryRuleRealLiteral : ruleRealLiteral EOF ;
    public final void entryRuleRealLiteral() throws RecognitionException {
        try {
            // InternalGreedySnake.g:904:1: ( ruleRealLiteral EOF )
            // InternalGreedySnake.g:905:1: ruleRealLiteral EOF
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
    // InternalGreedySnake.g:912:1: ruleRealLiteral : ( ( rule__RealLiteral__ValAssignment ) ) ;
    public final void ruleRealLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:916:2: ( ( ( rule__RealLiteral__ValAssignment ) ) )
            // InternalGreedySnake.g:917:2: ( ( rule__RealLiteral__ValAssignment ) )
            {
            // InternalGreedySnake.g:917:2: ( ( rule__RealLiteral__ValAssignment ) )
            // InternalGreedySnake.g:918:3: ( rule__RealLiteral__ValAssignment )
            {
             before(grammarAccess.getRealLiteralAccess().getValAssignment()); 
            // InternalGreedySnake.g:919:3: ( rule__RealLiteral__ValAssignment )
            // InternalGreedySnake.g:919:4: rule__RealLiteral__ValAssignment
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
    // InternalGreedySnake.g:928:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalGreedySnake.g:932:1: ( ruleREAL EOF )
            // InternalGreedySnake.g:933:1: ruleREAL EOF
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
    // InternalGreedySnake.g:943:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:948:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalGreedySnake.g:949:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalGreedySnake.g:949:2: ( ( rule__REAL__Group__0 ) )
            // InternalGreedySnake.g:950:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalGreedySnake.g:951:3: ( rule__REAL__Group__0 )
            // InternalGreedySnake.g:951:4: rule__REAL__Group__0
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
    // InternalGreedySnake.g:961:1: entryRuleOptionSpecification : ruleOptionSpecification EOF ;
    public final void entryRuleOptionSpecification() throws RecognitionException {
        try {
            // InternalGreedySnake.g:962:1: ( ruleOptionSpecification EOF )
            // InternalGreedySnake.g:963:1: ruleOptionSpecification EOF
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
    // InternalGreedySnake.g:970:1: ruleOptionSpecification : ( ( rule__OptionSpecification__Alternatives ) ) ;
    public final void ruleOptionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:974:2: ( ( ( rule__OptionSpecification__Alternatives ) ) )
            // InternalGreedySnake.g:975:2: ( ( rule__OptionSpecification__Alternatives ) )
            {
            // InternalGreedySnake.g:975:2: ( ( rule__OptionSpecification__Alternatives ) )
            // InternalGreedySnake.g:976:3: ( rule__OptionSpecification__Alternatives )
            {
             before(grammarAccess.getOptionSpecificationAccess().getAlternatives()); 
            // InternalGreedySnake.g:977:3: ( rule__OptionSpecification__Alternatives )
            // InternalGreedySnake.g:977:4: rule__OptionSpecification__Alternatives
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
    // InternalGreedySnake.g:986:1: entryRuleRestartMenu : ruleRestartMenu EOF ;
    public final void entryRuleRestartMenu() throws RecognitionException {
        try {
            // InternalGreedySnake.g:987:1: ( ruleRestartMenu EOF )
            // InternalGreedySnake.g:988:1: ruleRestartMenu EOF
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
    // InternalGreedySnake.g:995:1: ruleRestartMenu : ( ( rule__RestartMenu__Group__0 ) ) ;
    public final void ruleRestartMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:999:2: ( ( ( rule__RestartMenu__Group__0 ) ) )
            // InternalGreedySnake.g:1000:2: ( ( rule__RestartMenu__Group__0 ) )
            {
            // InternalGreedySnake.g:1000:2: ( ( rule__RestartMenu__Group__0 ) )
            // InternalGreedySnake.g:1001:3: ( rule__RestartMenu__Group__0 )
            {
             before(grammarAccess.getRestartMenuAccess().getGroup()); 
            // InternalGreedySnake.g:1002:3: ( rule__RestartMenu__Group__0 )
            // InternalGreedySnake.g:1002:4: rule__RestartMenu__Group__0
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
    // InternalGreedySnake.g:1011:1: entryRuleStartFieldDeclaration : ruleStartFieldDeclaration EOF ;
    public final void entryRuleStartFieldDeclaration() throws RecognitionException {
        try {
            // InternalGreedySnake.g:1012:1: ( ruleStartFieldDeclaration EOF )
            // InternalGreedySnake.g:1013:1: ruleStartFieldDeclaration EOF
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
    // InternalGreedySnake.g:1020:1: ruleStartFieldDeclaration : ( ( rule__StartFieldDeclaration__Group__0 ) ) ;
    public final void ruleStartFieldDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1024:2: ( ( ( rule__StartFieldDeclaration__Group__0 ) ) )
            // InternalGreedySnake.g:1025:2: ( ( rule__StartFieldDeclaration__Group__0 ) )
            {
            // InternalGreedySnake.g:1025:2: ( ( rule__StartFieldDeclaration__Group__0 ) )
            // InternalGreedySnake.g:1026:3: ( rule__StartFieldDeclaration__Group__0 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getGroup()); 
            // InternalGreedySnake.g:1027:3: ( rule__StartFieldDeclaration__Group__0 )
            // InternalGreedySnake.g:1027:4: rule__StartFieldDeclaration__Group__0
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
    // InternalGreedySnake.g:1036:1: entryRuleAboutSpecification : ruleAboutSpecification EOF ;
    public final void entryRuleAboutSpecification() throws RecognitionException {
        try {
            // InternalGreedySnake.g:1037:1: ( ruleAboutSpecification EOF )
            // InternalGreedySnake.g:1038:1: ruleAboutSpecification EOF
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
    // InternalGreedySnake.g:1045:1: ruleAboutSpecification : ( ( rule__AboutSpecification__Group__0 ) ) ;
    public final void ruleAboutSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1049:2: ( ( ( rule__AboutSpecification__Group__0 ) ) )
            // InternalGreedySnake.g:1050:2: ( ( rule__AboutSpecification__Group__0 ) )
            {
            // InternalGreedySnake.g:1050:2: ( ( rule__AboutSpecification__Group__0 ) )
            // InternalGreedySnake.g:1051:3: ( rule__AboutSpecification__Group__0 )
            {
             before(grammarAccess.getAboutSpecificationAccess().getGroup()); 
            // InternalGreedySnake.g:1052:3: ( rule__AboutSpecification__Group__0 )
            // InternalGreedySnake.g:1052:4: rule__AboutSpecification__Group__0
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
    // InternalGreedySnake.g:1061:1: entryRuleHelpSpecification : ruleHelpSpecification EOF ;
    public final void entryRuleHelpSpecification() throws RecognitionException {
        try {
            // InternalGreedySnake.g:1062:1: ( ruleHelpSpecification EOF )
            // InternalGreedySnake.g:1063:1: ruleHelpSpecification EOF
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
    // InternalGreedySnake.g:1070:1: ruleHelpSpecification : ( ( rule__HelpSpecification__Group__0 ) ) ;
    public final void ruleHelpSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1074:2: ( ( ( rule__HelpSpecification__Group__0 ) ) )
            // InternalGreedySnake.g:1075:2: ( ( rule__HelpSpecification__Group__0 ) )
            {
            // InternalGreedySnake.g:1075:2: ( ( rule__HelpSpecification__Group__0 ) )
            // InternalGreedySnake.g:1076:3: ( rule__HelpSpecification__Group__0 )
            {
             before(grammarAccess.getHelpSpecificationAccess().getGroup()); 
            // InternalGreedySnake.g:1077:3: ( rule__HelpSpecification__Group__0 )
            // InternalGreedySnake.g:1077:4: rule__HelpSpecification__Group__0
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
    // InternalGreedySnake.g:1086:1: entryRuleBackSpecification : ruleBackSpecification EOF ;
    public final void entryRuleBackSpecification() throws RecognitionException {
        try {
            // InternalGreedySnake.g:1087:1: ( ruleBackSpecification EOF )
            // InternalGreedySnake.g:1088:1: ruleBackSpecification EOF
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
    // InternalGreedySnake.g:1095:1: ruleBackSpecification : ( ( rule__BackSpecification__Group__0 ) ) ;
    public final void ruleBackSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1099:2: ( ( ( rule__BackSpecification__Group__0 ) ) )
            // InternalGreedySnake.g:1100:2: ( ( rule__BackSpecification__Group__0 ) )
            {
            // InternalGreedySnake.g:1100:2: ( ( rule__BackSpecification__Group__0 ) )
            // InternalGreedySnake.g:1101:3: ( rule__BackSpecification__Group__0 )
            {
             before(grammarAccess.getBackSpecificationAccess().getGroup()); 
            // InternalGreedySnake.g:1102:3: ( rule__BackSpecification__Group__0 )
            // InternalGreedySnake.g:1102:4: rule__BackSpecification__Group__0
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
    // InternalGreedySnake.g:1111:1: entryRuleBackgroundIcon : ruleBackgroundIcon EOF ;
    public final void entryRuleBackgroundIcon() throws RecognitionException {
        try {
            // InternalGreedySnake.g:1112:1: ( ruleBackgroundIcon EOF )
            // InternalGreedySnake.g:1113:1: ruleBackgroundIcon EOF
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
    // InternalGreedySnake.g:1120:1: ruleBackgroundIcon : ( ( rule__BackgroundIcon__Group__0 ) ) ;
    public final void ruleBackgroundIcon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1124:2: ( ( ( rule__BackgroundIcon__Group__0 ) ) )
            // InternalGreedySnake.g:1125:2: ( ( rule__BackgroundIcon__Group__0 ) )
            {
            // InternalGreedySnake.g:1125:2: ( ( rule__BackgroundIcon__Group__0 ) )
            // InternalGreedySnake.g:1126:3: ( rule__BackgroundIcon__Group__0 )
            {
             before(grammarAccess.getBackgroundIconAccess().getGroup()); 
            // InternalGreedySnake.g:1127:3: ( rule__BackgroundIcon__Group__0 )
            // InternalGreedySnake.g:1127:4: rule__BackgroundIcon__Group__0
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


    // $ANTLR start "entryRuleBackgroundTag"
    // InternalGreedySnake.g:1136:1: entryRuleBackgroundTag : ruleBackgroundTag EOF ;
    public final void entryRuleBackgroundTag() throws RecognitionException {
        try {
            // InternalGreedySnake.g:1137:1: ( ruleBackgroundTag EOF )
            // InternalGreedySnake.g:1138:1: ruleBackgroundTag EOF
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
    // InternalGreedySnake.g:1145:1: ruleBackgroundTag : ( ( rule__BackgroundTag__Group__0 ) ) ;
    public final void ruleBackgroundTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1149:2: ( ( ( rule__BackgroundTag__Group__0 ) ) )
            // InternalGreedySnake.g:1150:2: ( ( rule__BackgroundTag__Group__0 ) )
            {
            // InternalGreedySnake.g:1150:2: ( ( rule__BackgroundTag__Group__0 ) )
            // InternalGreedySnake.g:1151:3: ( rule__BackgroundTag__Group__0 )
            {
             before(grammarAccess.getBackgroundTagAccess().getGroup()); 
            // InternalGreedySnake.g:1152:3: ( rule__BackgroundTag__Group__0 )
            // InternalGreedySnake.g:1152:4: rule__BackgroundTag__Group__0
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
    // InternalGreedySnake.g:1161:1: entryRuleMusicSpecification : ruleMusicSpecification EOF ;
    public final void entryRuleMusicSpecification() throws RecognitionException {
        try {
            // InternalGreedySnake.g:1162:1: ( ruleMusicSpecification EOF )
            // InternalGreedySnake.g:1163:1: ruleMusicSpecification EOF
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
    // InternalGreedySnake.g:1170:1: ruleMusicSpecification : ( ( rule__MusicSpecification__Group__0 ) ) ;
    public final void ruleMusicSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1174:2: ( ( ( rule__MusicSpecification__Group__0 ) ) )
            // InternalGreedySnake.g:1175:2: ( ( rule__MusicSpecification__Group__0 ) )
            {
            // InternalGreedySnake.g:1175:2: ( ( rule__MusicSpecification__Group__0 ) )
            // InternalGreedySnake.g:1176:3: ( rule__MusicSpecification__Group__0 )
            {
             before(grammarAccess.getMusicSpecificationAccess().getGroup()); 
            // InternalGreedySnake.g:1177:3: ( rule__MusicSpecification__Group__0 )
            // InternalGreedySnake.g:1177:4: rule__MusicSpecification__Group__0
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
    // InternalGreedySnake.g:1186:1: entryRuleMusicPath : ruleMusicPath EOF ;
    public final void entryRuleMusicPath() throws RecognitionException {
        try {
            // InternalGreedySnake.g:1187:1: ( ruleMusicPath EOF )
            // InternalGreedySnake.g:1188:1: ruleMusicPath EOF
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
    // InternalGreedySnake.g:1195:1: ruleMusicPath : ( ( rule__MusicPath__Group__0 ) ) ;
    public final void ruleMusicPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1199:2: ( ( ( rule__MusicPath__Group__0 ) ) )
            // InternalGreedySnake.g:1200:2: ( ( rule__MusicPath__Group__0 ) )
            {
            // InternalGreedySnake.g:1200:2: ( ( rule__MusicPath__Group__0 ) )
            // InternalGreedySnake.g:1201:3: ( rule__MusicPath__Group__0 )
            {
             before(grammarAccess.getMusicPathAccess().getGroup()); 
            // InternalGreedySnake.g:1202:3: ( rule__MusicPath__Group__0 )
            // InternalGreedySnake.g:1202:4: rule__MusicPath__Group__0
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


    // $ANTLR start "ruleDirection"
    // InternalGreedySnake.g:1211:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1215:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalGreedySnake.g:1216:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalGreedySnake.g:1216:2: ( ( rule__Direction__Alternatives ) )
            // InternalGreedySnake.g:1217:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalGreedySnake.g:1218:3: ( rule__Direction__Alternatives )
            // InternalGreedySnake.g:1218:4: rule__Direction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Direction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "rule__GreedySnake__Alternatives_3"
    // InternalGreedySnake.g:1226:1: rule__GreedySnake__Alternatives_3 : ( ( ( rule__GreedySnake__SnakesAssignment_3_0 ) ) | ( ( rule__GreedySnake__FoodsAssignment_3_1 ) ) | ( ( rule__GreedySnake__ObstaclesAssignment_3_2 ) ) | ( ( rule__GreedySnake__SpeedAssignment_3_3 ) ) | ( ( rule__GreedySnake__FireAssignment_3_4 ) ) | ( ( rule__GreedySnake__TimeAssignment_3_5 ) ) | ( ( rule__GreedySnake__MapAssignment_3_6 ) ) | ( ( rule__GreedySnake__SnakeMoveAssignment_3_7 ) ) | ( ( rule__GreedySnake__AboutAssignment_3_8 ) ) | ( ( rule__GreedySnake__DirectionsAssignment_3_9 ) ) | ( ( rule__GreedySnake__HelpAssignment_3_10 ) ) | ( ( rule__GreedySnake__MusicAssignment_3_11 ) ) | ( ( rule__GreedySnake__BackgroundsAssignment_3_12 ) ) | ( ( rule__GreedySnake__FieldsAssignment_3_13 ) ) | ( ( rule__GreedySnake__OptionsAssignment_3_14 ) ) );
    public final void rule__GreedySnake__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1230:1: ( ( ( rule__GreedySnake__SnakesAssignment_3_0 ) ) | ( ( rule__GreedySnake__FoodsAssignment_3_1 ) ) | ( ( rule__GreedySnake__ObstaclesAssignment_3_2 ) ) | ( ( rule__GreedySnake__SpeedAssignment_3_3 ) ) | ( ( rule__GreedySnake__FireAssignment_3_4 ) ) | ( ( rule__GreedySnake__TimeAssignment_3_5 ) ) | ( ( rule__GreedySnake__MapAssignment_3_6 ) ) | ( ( rule__GreedySnake__SnakeMoveAssignment_3_7 ) ) | ( ( rule__GreedySnake__AboutAssignment_3_8 ) ) | ( ( rule__GreedySnake__DirectionsAssignment_3_9 ) ) | ( ( rule__GreedySnake__HelpAssignment_3_10 ) ) | ( ( rule__GreedySnake__MusicAssignment_3_11 ) ) | ( ( rule__GreedySnake__BackgroundsAssignment_3_12 ) ) | ( ( rule__GreedySnake__FieldsAssignment_3_13 ) ) | ( ( rule__GreedySnake__OptionsAssignment_3_14 ) ) )
            int alt1=15;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalGreedySnake.g:1231:2: ( ( rule__GreedySnake__SnakesAssignment_3_0 ) )
                    {
                    // InternalGreedySnake.g:1231:2: ( ( rule__GreedySnake__SnakesAssignment_3_0 ) )
                    // InternalGreedySnake.g:1232:3: ( rule__GreedySnake__SnakesAssignment_3_0 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getSnakesAssignment_3_0()); 
                    // InternalGreedySnake.g:1233:3: ( rule__GreedySnake__SnakesAssignment_3_0 )
                    // InternalGreedySnake.g:1233:4: rule__GreedySnake__SnakesAssignment_3_0
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
                    // InternalGreedySnake.g:1237:2: ( ( rule__GreedySnake__FoodsAssignment_3_1 ) )
                    {
                    // InternalGreedySnake.g:1237:2: ( ( rule__GreedySnake__FoodsAssignment_3_1 ) )
                    // InternalGreedySnake.g:1238:3: ( rule__GreedySnake__FoodsAssignment_3_1 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getFoodsAssignment_3_1()); 
                    // InternalGreedySnake.g:1239:3: ( rule__GreedySnake__FoodsAssignment_3_1 )
                    // InternalGreedySnake.g:1239:4: rule__GreedySnake__FoodsAssignment_3_1
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
                    // InternalGreedySnake.g:1243:2: ( ( rule__GreedySnake__ObstaclesAssignment_3_2 ) )
                    {
                    // InternalGreedySnake.g:1243:2: ( ( rule__GreedySnake__ObstaclesAssignment_3_2 ) )
                    // InternalGreedySnake.g:1244:3: ( rule__GreedySnake__ObstaclesAssignment_3_2 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getObstaclesAssignment_3_2()); 
                    // InternalGreedySnake.g:1245:3: ( rule__GreedySnake__ObstaclesAssignment_3_2 )
                    // InternalGreedySnake.g:1245:4: rule__GreedySnake__ObstaclesAssignment_3_2
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
                    // InternalGreedySnake.g:1249:2: ( ( rule__GreedySnake__SpeedAssignment_3_3 ) )
                    {
                    // InternalGreedySnake.g:1249:2: ( ( rule__GreedySnake__SpeedAssignment_3_3 ) )
                    // InternalGreedySnake.g:1250:3: ( rule__GreedySnake__SpeedAssignment_3_3 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getSpeedAssignment_3_3()); 
                    // InternalGreedySnake.g:1251:3: ( rule__GreedySnake__SpeedAssignment_3_3 )
                    // InternalGreedySnake.g:1251:4: rule__GreedySnake__SpeedAssignment_3_3
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
                    // InternalGreedySnake.g:1255:2: ( ( rule__GreedySnake__FireAssignment_3_4 ) )
                    {
                    // InternalGreedySnake.g:1255:2: ( ( rule__GreedySnake__FireAssignment_3_4 ) )
                    // InternalGreedySnake.g:1256:3: ( rule__GreedySnake__FireAssignment_3_4 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getFireAssignment_3_4()); 
                    // InternalGreedySnake.g:1257:3: ( rule__GreedySnake__FireAssignment_3_4 )
                    // InternalGreedySnake.g:1257:4: rule__GreedySnake__FireAssignment_3_4
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
                    // InternalGreedySnake.g:1261:2: ( ( rule__GreedySnake__TimeAssignment_3_5 ) )
                    {
                    // InternalGreedySnake.g:1261:2: ( ( rule__GreedySnake__TimeAssignment_3_5 ) )
                    // InternalGreedySnake.g:1262:3: ( rule__GreedySnake__TimeAssignment_3_5 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getTimeAssignment_3_5()); 
                    // InternalGreedySnake.g:1263:3: ( rule__GreedySnake__TimeAssignment_3_5 )
                    // InternalGreedySnake.g:1263:4: rule__GreedySnake__TimeAssignment_3_5
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
                    // InternalGreedySnake.g:1267:2: ( ( rule__GreedySnake__MapAssignment_3_6 ) )
                    {
                    // InternalGreedySnake.g:1267:2: ( ( rule__GreedySnake__MapAssignment_3_6 ) )
                    // InternalGreedySnake.g:1268:3: ( rule__GreedySnake__MapAssignment_3_6 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getMapAssignment_3_6()); 
                    // InternalGreedySnake.g:1269:3: ( rule__GreedySnake__MapAssignment_3_6 )
                    // InternalGreedySnake.g:1269:4: rule__GreedySnake__MapAssignment_3_6
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
                    // InternalGreedySnake.g:1273:2: ( ( rule__GreedySnake__SnakeMoveAssignment_3_7 ) )
                    {
                    // InternalGreedySnake.g:1273:2: ( ( rule__GreedySnake__SnakeMoveAssignment_3_7 ) )
                    // InternalGreedySnake.g:1274:3: ( rule__GreedySnake__SnakeMoveAssignment_3_7 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getSnakeMoveAssignment_3_7()); 
                    // InternalGreedySnake.g:1275:3: ( rule__GreedySnake__SnakeMoveAssignment_3_7 )
                    // InternalGreedySnake.g:1275:4: rule__GreedySnake__SnakeMoveAssignment_3_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__SnakeMoveAssignment_3_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getSnakeMoveAssignment_3_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGreedySnake.g:1279:2: ( ( rule__GreedySnake__AboutAssignment_3_8 ) )
                    {
                    // InternalGreedySnake.g:1279:2: ( ( rule__GreedySnake__AboutAssignment_3_8 ) )
                    // InternalGreedySnake.g:1280:3: ( rule__GreedySnake__AboutAssignment_3_8 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getAboutAssignment_3_8()); 
                    // InternalGreedySnake.g:1281:3: ( rule__GreedySnake__AboutAssignment_3_8 )
                    // InternalGreedySnake.g:1281:4: rule__GreedySnake__AboutAssignment_3_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__AboutAssignment_3_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getAboutAssignment_3_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGreedySnake.g:1285:2: ( ( rule__GreedySnake__DirectionsAssignment_3_9 ) )
                    {
                    // InternalGreedySnake.g:1285:2: ( ( rule__GreedySnake__DirectionsAssignment_3_9 ) )
                    // InternalGreedySnake.g:1286:3: ( rule__GreedySnake__DirectionsAssignment_3_9 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getDirectionsAssignment_3_9()); 
                    // InternalGreedySnake.g:1287:3: ( rule__GreedySnake__DirectionsAssignment_3_9 )
                    // InternalGreedySnake.g:1287:4: rule__GreedySnake__DirectionsAssignment_3_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__DirectionsAssignment_3_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getDirectionsAssignment_3_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalGreedySnake.g:1291:2: ( ( rule__GreedySnake__HelpAssignment_3_10 ) )
                    {
                    // InternalGreedySnake.g:1291:2: ( ( rule__GreedySnake__HelpAssignment_3_10 ) )
                    // InternalGreedySnake.g:1292:3: ( rule__GreedySnake__HelpAssignment_3_10 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getHelpAssignment_3_10()); 
                    // InternalGreedySnake.g:1293:3: ( rule__GreedySnake__HelpAssignment_3_10 )
                    // InternalGreedySnake.g:1293:4: rule__GreedySnake__HelpAssignment_3_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__HelpAssignment_3_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getHelpAssignment_3_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalGreedySnake.g:1297:2: ( ( rule__GreedySnake__MusicAssignment_3_11 ) )
                    {
                    // InternalGreedySnake.g:1297:2: ( ( rule__GreedySnake__MusicAssignment_3_11 ) )
                    // InternalGreedySnake.g:1298:3: ( rule__GreedySnake__MusicAssignment_3_11 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getMusicAssignment_3_11()); 
                    // InternalGreedySnake.g:1299:3: ( rule__GreedySnake__MusicAssignment_3_11 )
                    // InternalGreedySnake.g:1299:4: rule__GreedySnake__MusicAssignment_3_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__MusicAssignment_3_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getMusicAssignment_3_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalGreedySnake.g:1303:2: ( ( rule__GreedySnake__BackgroundsAssignment_3_12 ) )
                    {
                    // InternalGreedySnake.g:1303:2: ( ( rule__GreedySnake__BackgroundsAssignment_3_12 ) )
                    // InternalGreedySnake.g:1304:3: ( rule__GreedySnake__BackgroundsAssignment_3_12 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getBackgroundsAssignment_3_12()); 
                    // InternalGreedySnake.g:1305:3: ( rule__GreedySnake__BackgroundsAssignment_3_12 )
                    // InternalGreedySnake.g:1305:4: rule__GreedySnake__BackgroundsAssignment_3_12
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__BackgroundsAssignment_3_12();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getBackgroundsAssignment_3_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalGreedySnake.g:1309:2: ( ( rule__GreedySnake__FieldsAssignment_3_13 ) )
                    {
                    // InternalGreedySnake.g:1309:2: ( ( rule__GreedySnake__FieldsAssignment_3_13 ) )
                    // InternalGreedySnake.g:1310:3: ( rule__GreedySnake__FieldsAssignment_3_13 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getFieldsAssignment_3_13()); 
                    // InternalGreedySnake.g:1311:3: ( rule__GreedySnake__FieldsAssignment_3_13 )
                    // InternalGreedySnake.g:1311:4: rule__GreedySnake__FieldsAssignment_3_13
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__FieldsAssignment_3_13();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getFieldsAssignment_3_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalGreedySnake.g:1315:2: ( ( rule__GreedySnake__OptionsAssignment_3_14 ) )
                    {
                    // InternalGreedySnake.g:1315:2: ( ( rule__GreedySnake__OptionsAssignment_3_14 ) )
                    // InternalGreedySnake.g:1316:3: ( rule__GreedySnake__OptionsAssignment_3_14 )
                    {
                     before(grammarAccess.getGreedySnakeAccess().getOptionsAssignment_3_14()); 
                    // InternalGreedySnake.g:1317:3: ( rule__GreedySnake__OptionsAssignment_3_14 )
                    // InternalGreedySnake.g:1317:4: rule__GreedySnake__OptionsAssignment_3_14
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreedySnake__OptionsAssignment_3_14();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreedySnakeAccess().getOptionsAssignment_3_14()); 

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


    // $ANTLR start "rule__Move__CoorAlternatives_8_0"
    // InternalGreedySnake.g:1325:1: rule__Move__CoorAlternatives_8_0 : ( ( 'x' ) | ( 'y' ) );
    public final void rule__Move__CoorAlternatives_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1329:1: ( ( 'x' ) | ( 'y' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGreedySnake.g:1330:2: ( 'x' )
                    {
                    // InternalGreedySnake.g:1330:2: ( 'x' )
                    // InternalGreedySnake.g:1331:3: 'x'
                    {
                     before(grammarAccess.getMoveAccess().getCoorXKeyword_8_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getCoorXKeyword_8_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:1336:2: ( 'y' )
                    {
                    // InternalGreedySnake.g:1336:2: ( 'y' )
                    // InternalGreedySnake.g:1337:3: 'y'
                    {
                     before(grammarAccess.getMoveAccess().getCoorYKeyword_8_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getCoorYKeyword_8_0_1()); 

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
    // $ANTLR end "rule__Move__CoorAlternatives_8_0"


    // $ANTLR start "rule__Move__OperatorAlternatives_9_0"
    // InternalGreedySnake.g:1346:1: rule__Move__OperatorAlternatives_9_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Move__OperatorAlternatives_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1350:1: ( ( '+' ) | ( '-' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGreedySnake.g:1351:2: ( '+' )
                    {
                    // InternalGreedySnake.g:1351:2: ( '+' )
                    // InternalGreedySnake.g:1352:3: '+'
                    {
                     before(grammarAccess.getMoveAccess().getOperatorPlusSignKeyword_9_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getOperatorPlusSignKeyword_9_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:1357:2: ( '-' )
                    {
                    // InternalGreedySnake.g:1357:2: ( '-' )
                    // InternalGreedySnake.g:1358:3: '-'
                    {
                     before(grammarAccess.getMoveAccess().getOperatorHyphenMinusKeyword_9_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getOperatorHyphenMinusKeyword_9_0_1()); 

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
    // $ANTLR end "rule__Move__OperatorAlternatives_9_0"


    // $ANTLR start "rule__TimeLimited__Alternatives"
    // InternalGreedySnake.g:1367:1: rule__TimeLimited__Alternatives : ( ( ( rule__TimeLimited__Group_0__0 ) ) | ( ( rule__TimeLimited__Group_1__0 ) ) );
    public final void rule__TimeLimited__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1371:1: ( ( ( rule__TimeLimited__Group_0__0 ) ) | ( ( rule__TimeLimited__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==70) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGreedySnake.g:1372:2: ( ( rule__TimeLimited__Group_0__0 ) )
                    {
                    // InternalGreedySnake.g:1372:2: ( ( rule__TimeLimited__Group_0__0 ) )
                    // InternalGreedySnake.g:1373:3: ( rule__TimeLimited__Group_0__0 )
                    {
                     before(grammarAccess.getTimeLimitedAccess().getGroup_0()); 
                    // InternalGreedySnake.g:1374:3: ( rule__TimeLimited__Group_0__0 )
                    // InternalGreedySnake.g:1374:4: rule__TimeLimited__Group_0__0
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
                    // InternalGreedySnake.g:1378:2: ( ( rule__TimeLimited__Group_1__0 ) )
                    {
                    // InternalGreedySnake.g:1378:2: ( ( rule__TimeLimited__Group_1__0 ) )
                    // InternalGreedySnake.g:1379:3: ( rule__TimeLimited__Group_1__0 )
                    {
                     before(grammarAccess.getTimeLimitedAccess().getGroup_1()); 
                    // InternalGreedySnake.g:1380:3: ( rule__TimeLimited__Group_1__0 )
                    // InternalGreedySnake.g:1380:4: rule__TimeLimited__Group_1__0
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


    // $ANTLR start "rule__Addition__OperatorAlternatives_1_1_0"
    // InternalGreedySnake.g:1388:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1392:1: ( ( '+' ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGreedySnake.g:1393:2: ( '+' )
                    {
                    // InternalGreedySnake.g:1393:2: ( '+' )
                    // InternalGreedySnake.g:1394:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:1399:2: ( '-' )
                    {
                    // InternalGreedySnake.g:1399:2: ( '-' )
                    // InternalGreedySnake.g:1400:3: '-'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalGreedySnake.g:1409:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1413:1: ( ( '*' ) | ( '/' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGreedySnake.g:1414:2: ( '*' )
                    {
                    // InternalGreedySnake.g:1414:2: ( '*' )
                    // InternalGreedySnake.g:1415:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:1420:2: ( '/' )
                    {
                    // InternalGreedySnake.g:1420:2: ( '/' )
                    // InternalGreedySnake.g:1421:3: '/'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    match(input,16,FOLLOW_2); 
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
    // InternalGreedySnake.g:1430:1: rule__Primary__Alternatives : ( ( ruleIntLiteral ) | ( ruleRealLiteral ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1434:1: ( ( ruleIntLiteral ) | ( ruleRealLiteral ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==51) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||LA7_1==RULE_ID||(LA7_1>=13 && LA7_1<=16)||LA7_1==23||LA7_1==35) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 51:
                {
                alt7=2;
                }
                break;
            case 34:
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
                    // InternalGreedySnake.g:1435:2: ( ruleIntLiteral )
                    {
                    // InternalGreedySnake.g:1435:2: ( ruleIntLiteral )
                    // InternalGreedySnake.g:1436:3: ruleIntLiteral
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
                    // InternalGreedySnake.g:1441:2: ( ruleRealLiteral )
                    {
                    // InternalGreedySnake.g:1441:2: ( ruleRealLiteral )
                    // InternalGreedySnake.g:1442:3: ruleRealLiteral
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
                    // InternalGreedySnake.g:1447:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalGreedySnake.g:1447:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalGreedySnake.g:1448:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalGreedySnake.g:1449:3: ( rule__Primary__Group_2__0 )
                    // InternalGreedySnake.g:1449:4: rule__Primary__Group_2__0
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
    // InternalGreedySnake.g:1457:1: rule__OptionSpecification__Alternatives : ( ( ruleStartFieldDeclaration ) | ( ruleRestartMenu ) );
    public final void rule__OptionSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1461:1: ( ( ruleStartFieldDeclaration ) | ( ruleRestartMenu ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==73) ) {
                alt8=1;
            }
            else if ( (LA8_0==72) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGreedySnake.g:1462:2: ( ruleStartFieldDeclaration )
                    {
                    // InternalGreedySnake.g:1462:2: ( ruleStartFieldDeclaration )
                    // InternalGreedySnake.g:1463:3: ruleStartFieldDeclaration
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
                    // InternalGreedySnake.g:1468:2: ( ruleRestartMenu )
                    {
                    // InternalGreedySnake.g:1468:2: ( ruleRestartMenu )
                    // InternalGreedySnake.g:1469:3: ruleRestartMenu
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


    // $ANTLR start "rule__Direction__Alternatives"
    // InternalGreedySnake.g:1478:1: rule__Direction__Alternatives : ( ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) | ( ( 'UP' ) ) | ( ( 'DOWN' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1482:1: ( ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) | ( ( 'UP' ) ) | ( ( 'DOWN' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 18:
                {
                alt9=2;
                }
                break;
            case 19:
                {
                alt9=3;
                }
                break;
            case 20:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalGreedySnake.g:1483:2: ( ( 'LEFT' ) )
                    {
                    // InternalGreedySnake.g:1483:2: ( ( 'LEFT' ) )
                    // InternalGreedySnake.g:1484:3: ( 'LEFT' )
                    {
                     before(grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalGreedySnake.g:1485:3: ( 'LEFT' )
                    // InternalGreedySnake.g:1485:4: 'LEFT'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:1489:2: ( ( 'RIGHT' ) )
                    {
                    // InternalGreedySnake.g:1489:2: ( ( 'RIGHT' ) )
                    // InternalGreedySnake.g:1490:3: ( 'RIGHT' )
                    {
                     before(grammarAccess.getDirectionAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalGreedySnake.g:1491:3: ( 'RIGHT' )
                    // InternalGreedySnake.g:1491:4: 'RIGHT'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getRIGHTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGreedySnake.g:1495:2: ( ( 'UP' ) )
                    {
                    // InternalGreedySnake.g:1495:2: ( ( 'UP' ) )
                    // InternalGreedySnake.g:1496:3: ( 'UP' )
                    {
                     before(grammarAccess.getDirectionAccess().getUPEnumLiteralDeclaration_2()); 
                    // InternalGreedySnake.g:1497:3: ( 'UP' )
                    // InternalGreedySnake.g:1497:4: 'UP'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getUPEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGreedySnake.g:1501:2: ( ( 'DOWN' ) )
                    {
                    // InternalGreedySnake.g:1501:2: ( ( 'DOWN' ) )
                    // InternalGreedySnake.g:1502:3: ( 'DOWN' )
                    {
                     before(grammarAccess.getDirectionAccess().getDOWNEnumLiteralDeclaration_3()); 
                    // InternalGreedySnake.g:1503:3: ( 'DOWN' )
                    // InternalGreedySnake.g:1503:4: 'DOWN'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getDOWNEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Direction__Alternatives"


    // $ANTLR start "rule__GreedySnake__Group__0"
    // InternalGreedySnake.g:1511:1: rule__GreedySnake__Group__0 : rule__GreedySnake__Group__0__Impl rule__GreedySnake__Group__1 ;
    public final void rule__GreedySnake__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1515:1: ( rule__GreedySnake__Group__0__Impl rule__GreedySnake__Group__1 )
            // InternalGreedySnake.g:1516:2: rule__GreedySnake__Group__0__Impl rule__GreedySnake__Group__1
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
    // InternalGreedySnake.g:1523:1: rule__GreedySnake__Group__0__Impl : ( 'game' ) ;
    public final void rule__GreedySnake__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1527:1: ( ( 'game' ) )
            // InternalGreedySnake.g:1528:1: ( 'game' )
            {
            // InternalGreedySnake.g:1528:1: ( 'game' )
            // InternalGreedySnake.g:1529:2: 'game'
            {
             before(grammarAccess.getGreedySnakeAccess().getGameKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGreedySnake.g:1538:1: rule__GreedySnake__Group__1 : rule__GreedySnake__Group__1__Impl rule__GreedySnake__Group__2 ;
    public final void rule__GreedySnake__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1542:1: ( rule__GreedySnake__Group__1__Impl rule__GreedySnake__Group__2 )
            // InternalGreedySnake.g:1543:2: rule__GreedySnake__Group__1__Impl rule__GreedySnake__Group__2
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
    // InternalGreedySnake.g:1550:1: rule__GreedySnake__Group__1__Impl : ( ( rule__GreedySnake__NameAssignment_1 ) ) ;
    public final void rule__GreedySnake__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1554:1: ( ( ( rule__GreedySnake__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:1555:1: ( ( rule__GreedySnake__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:1555:1: ( ( rule__GreedySnake__NameAssignment_1 ) )
            // InternalGreedySnake.g:1556:2: ( rule__GreedySnake__NameAssignment_1 )
            {
             before(grammarAccess.getGreedySnakeAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:1557:2: ( rule__GreedySnake__NameAssignment_1 )
            // InternalGreedySnake.g:1557:3: rule__GreedySnake__NameAssignment_1
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
    // InternalGreedySnake.g:1565:1: rule__GreedySnake__Group__2 : rule__GreedySnake__Group__2__Impl rule__GreedySnake__Group__3 ;
    public final void rule__GreedySnake__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1569:1: ( rule__GreedySnake__Group__2__Impl rule__GreedySnake__Group__3 )
            // InternalGreedySnake.g:1570:2: rule__GreedySnake__Group__2__Impl rule__GreedySnake__Group__3
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
    // InternalGreedySnake.g:1577:1: rule__GreedySnake__Group__2__Impl : ( '{' ) ;
    public final void rule__GreedySnake__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1581:1: ( ( '{' ) )
            // InternalGreedySnake.g:1582:1: ( '{' )
            {
            // InternalGreedySnake.g:1582:1: ( '{' )
            // InternalGreedySnake.g:1583:2: '{'
            {
             before(grammarAccess.getGreedySnakeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:1592:1: rule__GreedySnake__Group__3 : rule__GreedySnake__Group__3__Impl rule__GreedySnake__Group__4 ;
    public final void rule__GreedySnake__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1596:1: ( rule__GreedySnake__Group__3__Impl rule__GreedySnake__Group__4 )
            // InternalGreedySnake.g:1597:2: rule__GreedySnake__Group__3__Impl rule__GreedySnake__Group__4
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
    // InternalGreedySnake.g:1604:1: rule__GreedySnake__Group__3__Impl : ( ( ( rule__GreedySnake__Alternatives_3 ) ) ( ( rule__GreedySnake__Alternatives_3 )* ) ) ;
    public final void rule__GreedySnake__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1608:1: ( ( ( ( rule__GreedySnake__Alternatives_3 ) ) ( ( rule__GreedySnake__Alternatives_3 )* ) ) )
            // InternalGreedySnake.g:1609:1: ( ( ( rule__GreedySnake__Alternatives_3 ) ) ( ( rule__GreedySnake__Alternatives_3 )* ) )
            {
            // InternalGreedySnake.g:1609:1: ( ( ( rule__GreedySnake__Alternatives_3 ) ) ( ( rule__GreedySnake__Alternatives_3 )* ) )
            // InternalGreedySnake.g:1610:2: ( ( rule__GreedySnake__Alternatives_3 ) ) ( ( rule__GreedySnake__Alternatives_3 )* )
            {
            // InternalGreedySnake.g:1610:2: ( ( rule__GreedySnake__Alternatives_3 ) )
            // InternalGreedySnake.g:1611:3: ( rule__GreedySnake__Alternatives_3 )
            {
             before(grammarAccess.getGreedySnakeAccess().getAlternatives_3()); 
            // InternalGreedySnake.g:1612:3: ( rule__GreedySnake__Alternatives_3 )
            // InternalGreedySnake.g:1612:4: rule__GreedySnake__Alternatives_3
            {
            pushFollow(FOLLOW_7);
            rule__GreedySnake__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getGreedySnakeAccess().getAlternatives_3()); 

            }

            // InternalGreedySnake.g:1615:2: ( ( rule__GreedySnake__Alternatives_3 )* )
            // InternalGreedySnake.g:1616:3: ( rule__GreedySnake__Alternatives_3 )*
            {
             before(grammarAccess.getGreedySnakeAccess().getAlternatives_3()); 
            // InternalGreedySnake.g:1617:3: ( rule__GreedySnake__Alternatives_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==24||LA10_0==26||(LA10_0>=43 && LA10_0<=47)||(LA10_0>=70 && LA10_0<=74)||(LA10_0>=78 && LA10_0<=79)||LA10_0==83) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGreedySnake.g:1617:4: rule__GreedySnake__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__GreedySnake__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalGreedySnake.g:1626:1: rule__GreedySnake__Group__4 : rule__GreedySnake__Group__4__Impl ;
    public final void rule__GreedySnake__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1630:1: ( rule__GreedySnake__Group__4__Impl )
            // InternalGreedySnake.g:1631:2: rule__GreedySnake__Group__4__Impl
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
    // InternalGreedySnake.g:1637:1: rule__GreedySnake__Group__4__Impl : ( '}' ) ;
    public final void rule__GreedySnake__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1641:1: ( ( '}' ) )
            // InternalGreedySnake.g:1642:1: ( '}' )
            {
            // InternalGreedySnake.g:1642:1: ( '}' )
            // InternalGreedySnake.g:1643:2: '}'
            {
             before(grammarAccess.getGreedySnakeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:1653:1: rule__GlobalMap__Group__0 : rule__GlobalMap__Group__0__Impl rule__GlobalMap__Group__1 ;
    public final void rule__GlobalMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1657:1: ( rule__GlobalMap__Group__0__Impl rule__GlobalMap__Group__1 )
            // InternalGreedySnake.g:1658:2: rule__GlobalMap__Group__0__Impl rule__GlobalMap__Group__1
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
    // InternalGreedySnake.g:1665:1: rule__GlobalMap__Group__0__Impl : ( 'Filepath' ) ;
    public final void rule__GlobalMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1669:1: ( ( 'Filepath' ) )
            // InternalGreedySnake.g:1670:1: ( 'Filepath' )
            {
            // InternalGreedySnake.g:1670:1: ( 'Filepath' )
            // InternalGreedySnake.g:1671:2: 'Filepath'
            {
             before(grammarAccess.getGlobalMapAccess().getFilepathKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGreedySnake.g:1680:1: rule__GlobalMap__Group__1 : rule__GlobalMap__Group__1__Impl rule__GlobalMap__Group__2 ;
    public final void rule__GlobalMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1684:1: ( rule__GlobalMap__Group__1__Impl rule__GlobalMap__Group__2 )
            // InternalGreedySnake.g:1685:2: rule__GlobalMap__Group__1__Impl rule__GlobalMap__Group__2
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
    // InternalGreedySnake.g:1692:1: rule__GlobalMap__Group__1__Impl : ( '=' ) ;
    public final void rule__GlobalMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1696:1: ( ( '=' ) )
            // InternalGreedySnake.g:1697:1: ( '=' )
            {
            // InternalGreedySnake.g:1697:1: ( '=' )
            // InternalGreedySnake.g:1698:2: '='
            {
             before(grammarAccess.getGlobalMapAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:1707:1: rule__GlobalMap__Group__2 : rule__GlobalMap__Group__2__Impl ;
    public final void rule__GlobalMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1711:1: ( rule__GlobalMap__Group__2__Impl )
            // InternalGreedySnake.g:1712:2: rule__GlobalMap__Group__2__Impl
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
    // InternalGreedySnake.g:1718:1: rule__GlobalMap__Group__2__Impl : ( ( rule__GlobalMap__MapAssignment_2 ) ) ;
    public final void rule__GlobalMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1722:1: ( ( ( rule__GlobalMap__MapAssignment_2 ) ) )
            // InternalGreedySnake.g:1723:1: ( ( rule__GlobalMap__MapAssignment_2 ) )
            {
            // InternalGreedySnake.g:1723:1: ( ( rule__GlobalMap__MapAssignment_2 ) )
            // InternalGreedySnake.g:1724:2: ( rule__GlobalMap__MapAssignment_2 )
            {
             before(grammarAccess.getGlobalMapAccess().getMapAssignment_2()); 
            // InternalGreedySnake.g:1725:2: ( rule__GlobalMap__MapAssignment_2 )
            // InternalGreedySnake.g:1725:3: rule__GlobalMap__MapAssignment_2
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
    // InternalGreedySnake.g:1734:1: rule__GlobalFieldInitialisation__Group__0 : rule__GlobalFieldInitialisation__Group__0__Impl rule__GlobalFieldInitialisation__Group__1 ;
    public final void rule__GlobalFieldInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1738:1: ( rule__GlobalFieldInitialisation__Group__0__Impl rule__GlobalFieldInitialisation__Group__1 )
            // InternalGreedySnake.g:1739:2: rule__GlobalFieldInitialisation__Group__0__Impl rule__GlobalFieldInitialisation__Group__1
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
    // InternalGreedySnake.g:1746:1: rule__GlobalFieldInitialisation__Group__0__Impl : ( 'field' ) ;
    public final void rule__GlobalFieldInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1750:1: ( ( 'field' ) )
            // InternalGreedySnake.g:1751:1: ( 'field' )
            {
            // InternalGreedySnake.g:1751:1: ( 'field' )
            // InternalGreedySnake.g:1752:2: 'field'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getFieldKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGreedySnake.g:1761:1: rule__GlobalFieldInitialisation__Group__1 : rule__GlobalFieldInitialisation__Group__1__Impl rule__GlobalFieldInitialisation__Group__2 ;
    public final void rule__GlobalFieldInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1765:1: ( rule__GlobalFieldInitialisation__Group__1__Impl rule__GlobalFieldInitialisation__Group__2 )
            // InternalGreedySnake.g:1766:2: rule__GlobalFieldInitialisation__Group__1__Impl rule__GlobalFieldInitialisation__Group__2
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
    // InternalGreedySnake.g:1773:1: rule__GlobalFieldInitialisation__Group__1__Impl : ( ( rule__GlobalFieldInitialisation__NameAssignment_1 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1777:1: ( ( ( rule__GlobalFieldInitialisation__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:1778:1: ( ( rule__GlobalFieldInitialisation__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:1778:1: ( ( rule__GlobalFieldInitialisation__NameAssignment_1 ) )
            // InternalGreedySnake.g:1779:2: ( rule__GlobalFieldInitialisation__NameAssignment_1 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:1780:2: ( rule__GlobalFieldInitialisation__NameAssignment_1 )
            // InternalGreedySnake.g:1780:3: rule__GlobalFieldInitialisation__NameAssignment_1
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
    // InternalGreedySnake.g:1788:1: rule__GlobalFieldInitialisation__Group__2 : rule__GlobalFieldInitialisation__Group__2__Impl rule__GlobalFieldInitialisation__Group__3 ;
    public final void rule__GlobalFieldInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1792:1: ( rule__GlobalFieldInitialisation__Group__2__Impl rule__GlobalFieldInitialisation__Group__3 )
            // InternalGreedySnake.g:1793:2: rule__GlobalFieldInitialisation__Group__2__Impl rule__GlobalFieldInitialisation__Group__3
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
    // InternalGreedySnake.g:1800:1: rule__GlobalFieldInitialisation__Group__2__Impl : ( '{' ) ;
    public final void rule__GlobalFieldInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1804:1: ( ( '{' ) )
            // InternalGreedySnake.g:1805:1: ( '{' )
            {
            // InternalGreedySnake.g:1805:1: ( '{' )
            // InternalGreedySnake.g:1806:2: '{'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:1815:1: rule__GlobalFieldInitialisation__Group__3 : rule__GlobalFieldInitialisation__Group__3__Impl rule__GlobalFieldInitialisation__Group__4 ;
    public final void rule__GlobalFieldInitialisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1819:1: ( rule__GlobalFieldInitialisation__Group__3__Impl rule__GlobalFieldInitialisation__Group__4 )
            // InternalGreedySnake.g:1820:2: rule__GlobalFieldInitialisation__Group__3__Impl rule__GlobalFieldInitialisation__Group__4
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
    // InternalGreedySnake.g:1827:1: rule__GlobalFieldInitialisation__Group__3__Impl : ( 'Panel_width' ) ;
    public final void rule__GlobalFieldInitialisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1831:1: ( ( 'Panel_width' ) )
            // InternalGreedySnake.g:1832:1: ( 'Panel_width' )
            {
            // InternalGreedySnake.g:1832:1: ( 'Panel_width' )
            // InternalGreedySnake.g:1833:2: 'Panel_width'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getPanel_widthKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGreedySnake.g:1842:1: rule__GlobalFieldInitialisation__Group__4 : rule__GlobalFieldInitialisation__Group__4__Impl rule__GlobalFieldInitialisation__Group__5 ;
    public final void rule__GlobalFieldInitialisation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1846:1: ( rule__GlobalFieldInitialisation__Group__4__Impl rule__GlobalFieldInitialisation__Group__5 )
            // InternalGreedySnake.g:1847:2: rule__GlobalFieldInitialisation__Group__4__Impl rule__GlobalFieldInitialisation__Group__5
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
    // InternalGreedySnake.g:1854:1: rule__GlobalFieldInitialisation__Group__4__Impl : ( '=' ) ;
    public final void rule__GlobalFieldInitialisation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1858:1: ( ( '=' ) )
            // InternalGreedySnake.g:1859:1: ( '=' )
            {
            // InternalGreedySnake.g:1859:1: ( '=' )
            // InternalGreedySnake.g:1860:2: '='
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:1869:1: rule__GlobalFieldInitialisation__Group__5 : rule__GlobalFieldInitialisation__Group__5__Impl rule__GlobalFieldInitialisation__Group__6 ;
    public final void rule__GlobalFieldInitialisation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1873:1: ( rule__GlobalFieldInitialisation__Group__5__Impl rule__GlobalFieldInitialisation__Group__6 )
            // InternalGreedySnake.g:1874:2: rule__GlobalFieldInitialisation__Group__5__Impl rule__GlobalFieldInitialisation__Group__6
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
    // InternalGreedySnake.g:1881:1: rule__GlobalFieldInitialisation__Group__5__Impl : ( ( rule__GlobalFieldInitialisation__PanelWidthAssignment_5 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1885:1: ( ( ( rule__GlobalFieldInitialisation__PanelWidthAssignment_5 ) ) )
            // InternalGreedySnake.g:1886:1: ( ( rule__GlobalFieldInitialisation__PanelWidthAssignment_5 ) )
            {
            // InternalGreedySnake.g:1886:1: ( ( rule__GlobalFieldInitialisation__PanelWidthAssignment_5 ) )
            // InternalGreedySnake.g:1887:2: ( rule__GlobalFieldInitialisation__PanelWidthAssignment_5 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getPanelWidthAssignment_5()); 
            // InternalGreedySnake.g:1888:2: ( rule__GlobalFieldInitialisation__PanelWidthAssignment_5 )
            // InternalGreedySnake.g:1888:3: rule__GlobalFieldInitialisation__PanelWidthAssignment_5
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
    // InternalGreedySnake.g:1896:1: rule__GlobalFieldInitialisation__Group__6 : rule__GlobalFieldInitialisation__Group__6__Impl rule__GlobalFieldInitialisation__Group__7 ;
    public final void rule__GlobalFieldInitialisation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1900:1: ( rule__GlobalFieldInitialisation__Group__6__Impl rule__GlobalFieldInitialisation__Group__7 )
            // InternalGreedySnake.g:1901:2: rule__GlobalFieldInitialisation__Group__6__Impl rule__GlobalFieldInitialisation__Group__7
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
    // InternalGreedySnake.g:1908:1: rule__GlobalFieldInitialisation__Group__6__Impl : ( 'Panel_Height' ) ;
    public final void rule__GlobalFieldInitialisation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1912:1: ( ( 'Panel_Height' ) )
            // InternalGreedySnake.g:1913:1: ( 'Panel_Height' )
            {
            // InternalGreedySnake.g:1913:1: ( 'Panel_Height' )
            // InternalGreedySnake.g:1914:2: 'Panel_Height'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getPanel_HeightKeyword_6()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGreedySnake.g:1923:1: rule__GlobalFieldInitialisation__Group__7 : rule__GlobalFieldInitialisation__Group__7__Impl rule__GlobalFieldInitialisation__Group__8 ;
    public final void rule__GlobalFieldInitialisation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1927:1: ( rule__GlobalFieldInitialisation__Group__7__Impl rule__GlobalFieldInitialisation__Group__8 )
            // InternalGreedySnake.g:1928:2: rule__GlobalFieldInitialisation__Group__7__Impl rule__GlobalFieldInitialisation__Group__8
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
    // InternalGreedySnake.g:1935:1: rule__GlobalFieldInitialisation__Group__7__Impl : ( '=' ) ;
    public final void rule__GlobalFieldInitialisation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1939:1: ( ( '=' ) )
            // InternalGreedySnake.g:1940:1: ( '=' )
            {
            // InternalGreedySnake.g:1940:1: ( '=' )
            // InternalGreedySnake.g:1941:2: '='
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_7()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:1950:1: rule__GlobalFieldInitialisation__Group__8 : rule__GlobalFieldInitialisation__Group__8__Impl rule__GlobalFieldInitialisation__Group__9 ;
    public final void rule__GlobalFieldInitialisation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1954:1: ( rule__GlobalFieldInitialisation__Group__8__Impl rule__GlobalFieldInitialisation__Group__9 )
            // InternalGreedySnake.g:1955:2: rule__GlobalFieldInitialisation__Group__8__Impl rule__GlobalFieldInitialisation__Group__9
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
    // InternalGreedySnake.g:1962:1: rule__GlobalFieldInitialisation__Group__8__Impl : ( ( rule__GlobalFieldInitialisation__PanelHeightAssignment_8 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1966:1: ( ( ( rule__GlobalFieldInitialisation__PanelHeightAssignment_8 ) ) )
            // InternalGreedySnake.g:1967:1: ( ( rule__GlobalFieldInitialisation__PanelHeightAssignment_8 ) )
            {
            // InternalGreedySnake.g:1967:1: ( ( rule__GlobalFieldInitialisation__PanelHeightAssignment_8 ) )
            // InternalGreedySnake.g:1968:2: ( rule__GlobalFieldInitialisation__PanelHeightAssignment_8 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getPanelHeightAssignment_8()); 
            // InternalGreedySnake.g:1969:2: ( rule__GlobalFieldInitialisation__PanelHeightAssignment_8 )
            // InternalGreedySnake.g:1969:3: rule__GlobalFieldInitialisation__PanelHeightAssignment_8
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
    // InternalGreedySnake.g:1977:1: rule__GlobalFieldInitialisation__Group__9 : rule__GlobalFieldInitialisation__Group__9__Impl rule__GlobalFieldInitialisation__Group__10 ;
    public final void rule__GlobalFieldInitialisation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1981:1: ( rule__GlobalFieldInitialisation__Group__9__Impl rule__GlobalFieldInitialisation__Group__10 )
            // InternalGreedySnake.g:1982:2: rule__GlobalFieldInitialisation__Group__9__Impl rule__GlobalFieldInitialisation__Group__10
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
    // InternalGreedySnake.g:1989:1: rule__GlobalFieldInitialisation__Group__9__Impl : ( 'column' ) ;
    public final void rule__GlobalFieldInitialisation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:1993:1: ( ( 'column' ) )
            // InternalGreedySnake.g:1994:1: ( 'column' )
            {
            // InternalGreedySnake.g:1994:1: ( 'column' )
            // InternalGreedySnake.g:1995:2: 'column'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getColumnKeyword_9()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGreedySnake.g:2004:1: rule__GlobalFieldInitialisation__Group__10 : rule__GlobalFieldInitialisation__Group__10__Impl rule__GlobalFieldInitialisation__Group__11 ;
    public final void rule__GlobalFieldInitialisation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2008:1: ( rule__GlobalFieldInitialisation__Group__10__Impl rule__GlobalFieldInitialisation__Group__11 )
            // InternalGreedySnake.g:2009:2: rule__GlobalFieldInitialisation__Group__10__Impl rule__GlobalFieldInitialisation__Group__11
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
    // InternalGreedySnake.g:2016:1: rule__GlobalFieldInitialisation__Group__10__Impl : ( '=' ) ;
    public final void rule__GlobalFieldInitialisation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2020:1: ( ( '=' ) )
            // InternalGreedySnake.g:2021:1: ( '=' )
            {
            // InternalGreedySnake.g:2021:1: ( '=' )
            // InternalGreedySnake.g:2022:2: '='
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_10()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:2031:1: rule__GlobalFieldInitialisation__Group__11 : rule__GlobalFieldInitialisation__Group__11__Impl rule__GlobalFieldInitialisation__Group__12 ;
    public final void rule__GlobalFieldInitialisation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2035:1: ( rule__GlobalFieldInitialisation__Group__11__Impl rule__GlobalFieldInitialisation__Group__12 )
            // InternalGreedySnake.g:2036:2: rule__GlobalFieldInitialisation__Group__11__Impl rule__GlobalFieldInitialisation__Group__12
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
    // InternalGreedySnake.g:2043:1: rule__GlobalFieldInitialisation__Group__11__Impl : ( ( rule__GlobalFieldInitialisation__WidthAssignment_11 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2047:1: ( ( ( rule__GlobalFieldInitialisation__WidthAssignment_11 ) ) )
            // InternalGreedySnake.g:2048:1: ( ( rule__GlobalFieldInitialisation__WidthAssignment_11 ) )
            {
            // InternalGreedySnake.g:2048:1: ( ( rule__GlobalFieldInitialisation__WidthAssignment_11 ) )
            // InternalGreedySnake.g:2049:2: ( rule__GlobalFieldInitialisation__WidthAssignment_11 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getWidthAssignment_11()); 
            // InternalGreedySnake.g:2050:2: ( rule__GlobalFieldInitialisation__WidthAssignment_11 )
            // InternalGreedySnake.g:2050:3: rule__GlobalFieldInitialisation__WidthAssignment_11
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
    // InternalGreedySnake.g:2058:1: rule__GlobalFieldInitialisation__Group__12 : rule__GlobalFieldInitialisation__Group__12__Impl rule__GlobalFieldInitialisation__Group__13 ;
    public final void rule__GlobalFieldInitialisation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2062:1: ( rule__GlobalFieldInitialisation__Group__12__Impl rule__GlobalFieldInitialisation__Group__13 )
            // InternalGreedySnake.g:2063:2: rule__GlobalFieldInitialisation__Group__12__Impl rule__GlobalFieldInitialisation__Group__13
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
    // InternalGreedySnake.g:2070:1: rule__GlobalFieldInitialisation__Group__12__Impl : ( 'row' ) ;
    public final void rule__GlobalFieldInitialisation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2074:1: ( ( 'row' ) )
            // InternalGreedySnake.g:2075:1: ( 'row' )
            {
            // InternalGreedySnake.g:2075:1: ( 'row' )
            // InternalGreedySnake.g:2076:2: 'row'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getRowKeyword_12()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGreedySnake.g:2085:1: rule__GlobalFieldInitialisation__Group__13 : rule__GlobalFieldInitialisation__Group__13__Impl rule__GlobalFieldInitialisation__Group__14 ;
    public final void rule__GlobalFieldInitialisation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2089:1: ( rule__GlobalFieldInitialisation__Group__13__Impl rule__GlobalFieldInitialisation__Group__14 )
            // InternalGreedySnake.g:2090:2: rule__GlobalFieldInitialisation__Group__13__Impl rule__GlobalFieldInitialisation__Group__14
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
    // InternalGreedySnake.g:2097:1: rule__GlobalFieldInitialisation__Group__13__Impl : ( '=' ) ;
    public final void rule__GlobalFieldInitialisation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2101:1: ( ( '=' ) )
            // InternalGreedySnake.g:2102:1: ( '=' )
            {
            // InternalGreedySnake.g:2102:1: ( '=' )
            // InternalGreedySnake.g:2103:2: '='
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_13()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:2112:1: rule__GlobalFieldInitialisation__Group__14 : rule__GlobalFieldInitialisation__Group__14__Impl rule__GlobalFieldInitialisation__Group__15 ;
    public final void rule__GlobalFieldInitialisation__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2116:1: ( rule__GlobalFieldInitialisation__Group__14__Impl rule__GlobalFieldInitialisation__Group__15 )
            // InternalGreedySnake.g:2117:2: rule__GlobalFieldInitialisation__Group__14__Impl rule__GlobalFieldInitialisation__Group__15
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
    // InternalGreedySnake.g:2124:1: rule__GlobalFieldInitialisation__Group__14__Impl : ( ( rule__GlobalFieldInitialisation__HeightAssignment_14 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2128:1: ( ( ( rule__GlobalFieldInitialisation__HeightAssignment_14 ) ) )
            // InternalGreedySnake.g:2129:1: ( ( rule__GlobalFieldInitialisation__HeightAssignment_14 ) )
            {
            // InternalGreedySnake.g:2129:1: ( ( rule__GlobalFieldInitialisation__HeightAssignment_14 ) )
            // InternalGreedySnake.g:2130:2: ( rule__GlobalFieldInitialisation__HeightAssignment_14 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getHeightAssignment_14()); 
            // InternalGreedySnake.g:2131:2: ( rule__GlobalFieldInitialisation__HeightAssignment_14 )
            // InternalGreedySnake.g:2131:3: rule__GlobalFieldInitialisation__HeightAssignment_14
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
    // InternalGreedySnake.g:2139:1: rule__GlobalFieldInitialisation__Group__15 : rule__GlobalFieldInitialisation__Group__15__Impl rule__GlobalFieldInitialisation__Group__16 ;
    public final void rule__GlobalFieldInitialisation__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2143:1: ( rule__GlobalFieldInitialisation__Group__15__Impl rule__GlobalFieldInitialisation__Group__16 )
            // InternalGreedySnake.g:2144:2: rule__GlobalFieldInitialisation__Group__15__Impl rule__GlobalFieldInitialisation__Group__16
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
    // InternalGreedySnake.g:2151:1: rule__GlobalFieldInitialisation__Group__15__Impl : ( 'label_width' ) ;
    public final void rule__GlobalFieldInitialisation__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2155:1: ( ( 'label_width' ) )
            // InternalGreedySnake.g:2156:1: ( 'label_width' )
            {
            // InternalGreedySnake.g:2156:1: ( 'label_width' )
            // InternalGreedySnake.g:2157:2: 'label_width'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getLabel_widthKeyword_15()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGreedySnake.g:2166:1: rule__GlobalFieldInitialisation__Group__16 : rule__GlobalFieldInitialisation__Group__16__Impl rule__GlobalFieldInitialisation__Group__17 ;
    public final void rule__GlobalFieldInitialisation__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2170:1: ( rule__GlobalFieldInitialisation__Group__16__Impl rule__GlobalFieldInitialisation__Group__17 )
            // InternalGreedySnake.g:2171:2: rule__GlobalFieldInitialisation__Group__16__Impl rule__GlobalFieldInitialisation__Group__17
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
    // InternalGreedySnake.g:2178:1: rule__GlobalFieldInitialisation__Group__16__Impl : ( '=' ) ;
    public final void rule__GlobalFieldInitialisation__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2182:1: ( ( '=' ) )
            // InternalGreedySnake.g:2183:1: ( '=' )
            {
            // InternalGreedySnake.g:2183:1: ( '=' )
            // InternalGreedySnake.g:2184:2: '='
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_16()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:2193:1: rule__GlobalFieldInitialisation__Group__17 : rule__GlobalFieldInitialisation__Group__17__Impl rule__GlobalFieldInitialisation__Group__18 ;
    public final void rule__GlobalFieldInitialisation__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2197:1: ( rule__GlobalFieldInitialisation__Group__17__Impl rule__GlobalFieldInitialisation__Group__18 )
            // InternalGreedySnake.g:2198:2: rule__GlobalFieldInitialisation__Group__17__Impl rule__GlobalFieldInitialisation__Group__18
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
    // InternalGreedySnake.g:2205:1: rule__GlobalFieldInitialisation__Group__17__Impl : ( ( rule__GlobalFieldInitialisation__LabelWidthAssignment_17 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2209:1: ( ( ( rule__GlobalFieldInitialisation__LabelWidthAssignment_17 ) ) )
            // InternalGreedySnake.g:2210:1: ( ( rule__GlobalFieldInitialisation__LabelWidthAssignment_17 ) )
            {
            // InternalGreedySnake.g:2210:1: ( ( rule__GlobalFieldInitialisation__LabelWidthAssignment_17 ) )
            // InternalGreedySnake.g:2211:2: ( rule__GlobalFieldInitialisation__LabelWidthAssignment_17 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getLabelWidthAssignment_17()); 
            // InternalGreedySnake.g:2212:2: ( rule__GlobalFieldInitialisation__LabelWidthAssignment_17 )
            // InternalGreedySnake.g:2212:3: rule__GlobalFieldInitialisation__LabelWidthAssignment_17
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
    // InternalGreedySnake.g:2220:1: rule__GlobalFieldInitialisation__Group__18 : rule__GlobalFieldInitialisation__Group__18__Impl rule__GlobalFieldInitialisation__Group__19 ;
    public final void rule__GlobalFieldInitialisation__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2224:1: ( rule__GlobalFieldInitialisation__Group__18__Impl rule__GlobalFieldInitialisation__Group__19 )
            // InternalGreedySnake.g:2225:2: rule__GlobalFieldInitialisation__Group__18__Impl rule__GlobalFieldInitialisation__Group__19
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
    // InternalGreedySnake.g:2232:1: rule__GlobalFieldInitialisation__Group__18__Impl : ( 'label_Height' ) ;
    public final void rule__GlobalFieldInitialisation__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2236:1: ( ( 'label_Height' ) )
            // InternalGreedySnake.g:2237:1: ( 'label_Height' )
            {
            // InternalGreedySnake.g:2237:1: ( 'label_Height' )
            // InternalGreedySnake.g:2238:2: 'label_Height'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getLabel_HeightKeyword_18()); 
            match(input,32,FOLLOW_2); 
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
    // InternalGreedySnake.g:2247:1: rule__GlobalFieldInitialisation__Group__19 : rule__GlobalFieldInitialisation__Group__19__Impl rule__GlobalFieldInitialisation__Group__20 ;
    public final void rule__GlobalFieldInitialisation__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2251:1: ( rule__GlobalFieldInitialisation__Group__19__Impl rule__GlobalFieldInitialisation__Group__20 )
            // InternalGreedySnake.g:2252:2: rule__GlobalFieldInitialisation__Group__19__Impl rule__GlobalFieldInitialisation__Group__20
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
    // InternalGreedySnake.g:2259:1: rule__GlobalFieldInitialisation__Group__19__Impl : ( '=' ) ;
    public final void rule__GlobalFieldInitialisation__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2263:1: ( ( '=' ) )
            // InternalGreedySnake.g:2264:1: ( '=' )
            {
            // InternalGreedySnake.g:2264:1: ( '=' )
            // InternalGreedySnake.g:2265:2: '='
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_19()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:2274:1: rule__GlobalFieldInitialisation__Group__20 : rule__GlobalFieldInitialisation__Group__20__Impl rule__GlobalFieldInitialisation__Group__21 ;
    public final void rule__GlobalFieldInitialisation__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2278:1: ( rule__GlobalFieldInitialisation__Group__20__Impl rule__GlobalFieldInitialisation__Group__21 )
            // InternalGreedySnake.g:2279:2: rule__GlobalFieldInitialisation__Group__20__Impl rule__GlobalFieldInitialisation__Group__21
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
    // InternalGreedySnake.g:2286:1: rule__GlobalFieldInitialisation__Group__20__Impl : ( ( rule__GlobalFieldInitialisation__LabelHeightAssignment_20 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2290:1: ( ( ( rule__GlobalFieldInitialisation__LabelHeightAssignment_20 ) ) )
            // InternalGreedySnake.g:2291:1: ( ( rule__GlobalFieldInitialisation__LabelHeightAssignment_20 ) )
            {
            // InternalGreedySnake.g:2291:1: ( ( rule__GlobalFieldInitialisation__LabelHeightAssignment_20 ) )
            // InternalGreedySnake.g:2292:2: ( rule__GlobalFieldInitialisation__LabelHeightAssignment_20 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getLabelHeightAssignment_20()); 
            // InternalGreedySnake.g:2293:2: ( rule__GlobalFieldInitialisation__LabelHeightAssignment_20 )
            // InternalGreedySnake.g:2293:3: rule__GlobalFieldInitialisation__LabelHeightAssignment_20
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
    // InternalGreedySnake.g:2301:1: rule__GlobalFieldInitialisation__Group__21 : rule__GlobalFieldInitialisation__Group__21__Impl rule__GlobalFieldInitialisation__Group__22 ;
    public final void rule__GlobalFieldInitialisation__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2305:1: ( rule__GlobalFieldInitialisation__Group__21__Impl rule__GlobalFieldInitialisation__Group__22 )
            // InternalGreedySnake.g:2306:2: rule__GlobalFieldInitialisation__Group__21__Impl rule__GlobalFieldInitialisation__Group__22
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
    // InternalGreedySnake.g:2313:1: rule__GlobalFieldInitialisation__Group__21__Impl : ( ( rule__GlobalFieldInitialisation__Field_initialisationAssignment_21 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2317:1: ( ( ( rule__GlobalFieldInitialisation__Field_initialisationAssignment_21 ) ) )
            // InternalGreedySnake.g:2318:1: ( ( rule__GlobalFieldInitialisation__Field_initialisationAssignment_21 ) )
            {
            // InternalGreedySnake.g:2318:1: ( ( rule__GlobalFieldInitialisation__Field_initialisationAssignment_21 ) )
            // InternalGreedySnake.g:2319:2: ( rule__GlobalFieldInitialisation__Field_initialisationAssignment_21 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getField_initialisationAssignment_21()); 
            // InternalGreedySnake.g:2320:2: ( rule__GlobalFieldInitialisation__Field_initialisationAssignment_21 )
            // InternalGreedySnake.g:2320:3: rule__GlobalFieldInitialisation__Field_initialisationAssignment_21
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
    // InternalGreedySnake.g:2328:1: rule__GlobalFieldInitialisation__Group__22 : rule__GlobalFieldInitialisation__Group__22__Impl ;
    public final void rule__GlobalFieldInitialisation__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2332:1: ( rule__GlobalFieldInitialisation__Group__22__Impl )
            // InternalGreedySnake.g:2333:2: rule__GlobalFieldInitialisation__Group__22__Impl
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
    // InternalGreedySnake.g:2339:1: rule__GlobalFieldInitialisation__Group__22__Impl : ( '}' ) ;
    public final void rule__GlobalFieldInitialisation__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2343:1: ( ( '}' ) )
            // InternalGreedySnake.g:2344:1: ( '}' )
            {
            // InternalGreedySnake.g:2344:1: ( '}' )
            // InternalGreedySnake.g:2345:2: '}'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getRightCurlyBracketKeyword_22()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:2355:1: rule__InitialField__Group__0 : rule__InitialField__Group__0__Impl rule__InitialField__Group__1 ;
    public final void rule__InitialField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2359:1: ( rule__InitialField__Group__0__Impl rule__InitialField__Group__1 )
            // InternalGreedySnake.g:2360:2: rule__InitialField__Group__0__Impl rule__InitialField__Group__1
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
    // InternalGreedySnake.g:2367:1: rule__InitialField__Group__0__Impl : ( 'init' ) ;
    public final void rule__InitialField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2371:1: ( ( 'init' ) )
            // InternalGreedySnake.g:2372:1: ( 'init' )
            {
            // InternalGreedySnake.g:2372:1: ( 'init' )
            // InternalGreedySnake.g:2373:2: 'init'
            {
             before(grammarAccess.getInitialFieldAccess().getInitKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalGreedySnake.g:2382:1: rule__InitialField__Group__1 : rule__InitialField__Group__1__Impl rule__InitialField__Group__2 ;
    public final void rule__InitialField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2386:1: ( rule__InitialField__Group__1__Impl rule__InitialField__Group__2 )
            // InternalGreedySnake.g:2387:2: rule__InitialField__Group__1__Impl rule__InitialField__Group__2
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
    // InternalGreedySnake.g:2394:1: rule__InitialField__Group__1__Impl : ( ( rule__InitialField__NameAssignment_1 ) ) ;
    public final void rule__InitialField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2398:1: ( ( ( rule__InitialField__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:2399:1: ( ( rule__InitialField__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:2399:1: ( ( rule__InitialField__NameAssignment_1 ) )
            // InternalGreedySnake.g:2400:2: ( rule__InitialField__NameAssignment_1 )
            {
             before(grammarAccess.getInitialFieldAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:2401:2: ( rule__InitialField__NameAssignment_1 )
            // InternalGreedySnake.g:2401:3: rule__InitialField__NameAssignment_1
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
    // InternalGreedySnake.g:2409:1: rule__InitialField__Group__2 : rule__InitialField__Group__2__Impl rule__InitialField__Group__3 ;
    public final void rule__InitialField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2413:1: ( rule__InitialField__Group__2__Impl rule__InitialField__Group__3 )
            // InternalGreedySnake.g:2414:2: rule__InitialField__Group__2__Impl rule__InitialField__Group__3
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
    // InternalGreedySnake.g:2421:1: rule__InitialField__Group__2__Impl : ( '(' ) ;
    public final void rule__InitialField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2425:1: ( ( '(' ) )
            // InternalGreedySnake.g:2426:1: ( '(' )
            {
            // InternalGreedySnake.g:2426:1: ( '(' )
            // InternalGreedySnake.g:2427:2: '('
            {
             before(grammarAccess.getInitialFieldAccess().getLeftParenthesisKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGreedySnake.g:2436:1: rule__InitialField__Group__3 : rule__InitialField__Group__3__Impl rule__InitialField__Group__4 ;
    public final void rule__InitialField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2440:1: ( rule__InitialField__Group__3__Impl rule__InitialField__Group__4 )
            // InternalGreedySnake.g:2441:2: rule__InitialField__Group__3__Impl rule__InitialField__Group__4
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
    // InternalGreedySnake.g:2448:1: rule__InitialField__Group__3__Impl : ( ')' ) ;
    public final void rule__InitialField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2452:1: ( ( ')' ) )
            // InternalGreedySnake.g:2453:1: ( ')' )
            {
            // InternalGreedySnake.g:2453:1: ( ')' )
            // InternalGreedySnake.g:2454:2: ')'
            {
             before(grammarAccess.getInitialFieldAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGreedySnake.g:2463:1: rule__InitialField__Group__4 : rule__InitialField__Group__4__Impl rule__InitialField__Group__5 ;
    public final void rule__InitialField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2467:1: ( rule__InitialField__Group__4__Impl rule__InitialField__Group__5 )
            // InternalGreedySnake.g:2468:2: rule__InitialField__Group__4__Impl rule__InitialField__Group__5
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
    // InternalGreedySnake.g:2475:1: rule__InitialField__Group__4__Impl : ( '{' ) ;
    public final void rule__InitialField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2479:1: ( ( '{' ) )
            // InternalGreedySnake.g:2480:1: ( '{' )
            {
            // InternalGreedySnake.g:2480:1: ( '{' )
            // InternalGreedySnake.g:2481:2: '{'
            {
             before(grammarAccess.getInitialFieldAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:2490:1: rule__InitialField__Group__5 : rule__InitialField__Group__5__Impl rule__InitialField__Group__6 ;
    public final void rule__InitialField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2494:1: ( rule__InitialField__Group__5__Impl rule__InitialField__Group__6 )
            // InternalGreedySnake.g:2495:2: rule__InitialField__Group__5__Impl rule__InitialField__Group__6
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
    // InternalGreedySnake.g:2502:1: rule__InitialField__Group__5__Impl : ( 'Default' ) ;
    public final void rule__InitialField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2506:1: ( ( 'Default' ) )
            // InternalGreedySnake.g:2507:1: ( 'Default' )
            {
            // InternalGreedySnake.g:2507:1: ( 'Default' )
            // InternalGreedySnake.g:2508:2: 'Default'
            {
             before(grammarAccess.getInitialFieldAccess().getDefaultKeyword_5()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGreedySnake.g:2517:1: rule__InitialField__Group__6 : rule__InitialField__Group__6__Impl rule__InitialField__Group__7 ;
    public final void rule__InitialField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2521:1: ( rule__InitialField__Group__6__Impl rule__InitialField__Group__7 )
            // InternalGreedySnake.g:2522:2: rule__InitialField__Group__6__Impl rule__InitialField__Group__7
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
    // InternalGreedySnake.g:2529:1: rule__InitialField__Group__6__Impl : ( ':' ) ;
    public final void rule__InitialField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2533:1: ( ( ':' ) )
            // InternalGreedySnake.g:2534:1: ( ':' )
            {
            // InternalGreedySnake.g:2534:1: ( ':' )
            // InternalGreedySnake.g:2535:2: ':'
            {
             before(grammarAccess.getInitialFieldAccess().getColonKeyword_6()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGreedySnake.g:2544:1: rule__InitialField__Group__7 : rule__InitialField__Group__7__Impl rule__InitialField__Group__8 ;
    public final void rule__InitialField__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2548:1: ( rule__InitialField__Group__7__Impl rule__InitialField__Group__8 )
            // InternalGreedySnake.g:2549:2: rule__InitialField__Group__7__Impl rule__InitialField__Group__8
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
    // InternalGreedySnake.g:2556:1: rule__InitialField__Group__7__Impl : ( ( rule__InitialField__DefaultAssignment_7 ) ) ;
    public final void rule__InitialField__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2560:1: ( ( ( rule__InitialField__DefaultAssignment_7 ) ) )
            // InternalGreedySnake.g:2561:1: ( ( rule__InitialField__DefaultAssignment_7 ) )
            {
            // InternalGreedySnake.g:2561:1: ( ( rule__InitialField__DefaultAssignment_7 ) )
            // InternalGreedySnake.g:2562:2: ( rule__InitialField__DefaultAssignment_7 )
            {
             before(grammarAccess.getInitialFieldAccess().getDefaultAssignment_7()); 
            // InternalGreedySnake.g:2563:2: ( rule__InitialField__DefaultAssignment_7 )
            // InternalGreedySnake.g:2563:3: rule__InitialField__DefaultAssignment_7
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
    // InternalGreedySnake.g:2571:1: rule__InitialField__Group__8 : rule__InitialField__Group__8__Impl ;
    public final void rule__InitialField__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2575:1: ( rule__InitialField__Group__8__Impl )
            // InternalGreedySnake.g:2576:2: rule__InitialField__Group__8__Impl
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
    // InternalGreedySnake.g:2582:1: rule__InitialField__Group__8__Impl : ( '}' ) ;
    public final void rule__InitialField__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2586:1: ( ( '}' ) )
            // InternalGreedySnake.g:2587:1: ( '}' )
            {
            // InternalGreedySnake.g:2587:1: ( '}' )
            // InternalGreedySnake.g:2588:2: '}'
            {
             before(grammarAccess.getInitialFieldAccess().getRightCurlyBracketKeyword_8()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:2598:1: rule__Default__Group__0 : rule__Default__Group__0__Impl rule__Default__Group__1 ;
    public final void rule__Default__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2602:1: ( rule__Default__Group__0__Impl rule__Default__Group__1 )
            // InternalGreedySnake.g:2603:2: rule__Default__Group__0__Impl rule__Default__Group__1
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
    // InternalGreedySnake.g:2610:1: rule__Default__Group__0__Impl : ( 'snakeLength' ) ;
    public final void rule__Default__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2614:1: ( ( 'snakeLength' ) )
            // InternalGreedySnake.g:2615:1: ( 'snakeLength' )
            {
            // InternalGreedySnake.g:2615:1: ( 'snakeLength' )
            // InternalGreedySnake.g:2616:2: 'snakeLength'
            {
             before(grammarAccess.getDefaultAccess().getSnakeLengthKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalGreedySnake.g:2625:1: rule__Default__Group__1 : rule__Default__Group__1__Impl rule__Default__Group__2 ;
    public final void rule__Default__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2629:1: ( rule__Default__Group__1__Impl rule__Default__Group__2 )
            // InternalGreedySnake.g:2630:2: rule__Default__Group__1__Impl rule__Default__Group__2
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
    // InternalGreedySnake.g:2637:1: rule__Default__Group__1__Impl : ( '=' ) ;
    public final void rule__Default__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2641:1: ( ( '=' ) )
            // InternalGreedySnake.g:2642:1: ( '=' )
            {
            // InternalGreedySnake.g:2642:1: ( '=' )
            // InternalGreedySnake.g:2643:2: '='
            {
             before(grammarAccess.getDefaultAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:2652:1: rule__Default__Group__2 : rule__Default__Group__2__Impl rule__Default__Group__3 ;
    public final void rule__Default__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2656:1: ( rule__Default__Group__2__Impl rule__Default__Group__3 )
            // InternalGreedySnake.g:2657:2: rule__Default__Group__2__Impl rule__Default__Group__3
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
    // InternalGreedySnake.g:2664:1: rule__Default__Group__2__Impl : ( ( rule__Default__LengthAssignment_2 ) ) ;
    public final void rule__Default__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2668:1: ( ( ( rule__Default__LengthAssignment_2 ) ) )
            // InternalGreedySnake.g:2669:1: ( ( rule__Default__LengthAssignment_2 ) )
            {
            // InternalGreedySnake.g:2669:1: ( ( rule__Default__LengthAssignment_2 ) )
            // InternalGreedySnake.g:2670:2: ( rule__Default__LengthAssignment_2 )
            {
             before(grammarAccess.getDefaultAccess().getLengthAssignment_2()); 
            // InternalGreedySnake.g:2671:2: ( rule__Default__LengthAssignment_2 )
            // InternalGreedySnake.g:2671:3: rule__Default__LengthAssignment_2
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
    // InternalGreedySnake.g:2679:1: rule__Default__Group__3 : rule__Default__Group__3__Impl rule__Default__Group__4 ;
    public final void rule__Default__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2683:1: ( rule__Default__Group__3__Impl rule__Default__Group__4 )
            // InternalGreedySnake.g:2684:2: rule__Default__Group__3__Impl rule__Default__Group__4
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
    // InternalGreedySnake.g:2691:1: rule__Default__Group__3__Impl : ( 'Score' ) ;
    public final void rule__Default__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2695:1: ( ( 'Score' ) )
            // InternalGreedySnake.g:2696:1: ( 'Score' )
            {
            // InternalGreedySnake.g:2696:1: ( 'Score' )
            // InternalGreedySnake.g:2697:2: 'Score'
            {
             before(grammarAccess.getDefaultAccess().getScoreKeyword_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalGreedySnake.g:2706:1: rule__Default__Group__4 : rule__Default__Group__4__Impl rule__Default__Group__5 ;
    public final void rule__Default__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2710:1: ( rule__Default__Group__4__Impl rule__Default__Group__5 )
            // InternalGreedySnake.g:2711:2: rule__Default__Group__4__Impl rule__Default__Group__5
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
    // InternalGreedySnake.g:2718:1: rule__Default__Group__4__Impl : ( '=' ) ;
    public final void rule__Default__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2722:1: ( ( '=' ) )
            // InternalGreedySnake.g:2723:1: ( '=' )
            {
            // InternalGreedySnake.g:2723:1: ( '=' )
            // InternalGreedySnake.g:2724:2: '='
            {
             before(grammarAccess.getDefaultAccess().getEqualsSignKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:2733:1: rule__Default__Group__5 : rule__Default__Group__5__Impl rule__Default__Group__6 ;
    public final void rule__Default__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2737:1: ( rule__Default__Group__5__Impl rule__Default__Group__6 )
            // InternalGreedySnake.g:2738:2: rule__Default__Group__5__Impl rule__Default__Group__6
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
    // InternalGreedySnake.g:2745:1: rule__Default__Group__5__Impl : ( ( rule__Default__ScoreAssignment_5 ) ) ;
    public final void rule__Default__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2749:1: ( ( ( rule__Default__ScoreAssignment_5 ) ) )
            // InternalGreedySnake.g:2750:1: ( ( rule__Default__ScoreAssignment_5 ) )
            {
            // InternalGreedySnake.g:2750:1: ( ( rule__Default__ScoreAssignment_5 ) )
            // InternalGreedySnake.g:2751:2: ( rule__Default__ScoreAssignment_5 )
            {
             before(grammarAccess.getDefaultAccess().getScoreAssignment_5()); 
            // InternalGreedySnake.g:2752:2: ( rule__Default__ScoreAssignment_5 )
            // InternalGreedySnake.g:2752:3: rule__Default__ScoreAssignment_5
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
    // InternalGreedySnake.g:2760:1: rule__Default__Group__6 : rule__Default__Group__6__Impl rule__Default__Group__7 ;
    public final void rule__Default__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2764:1: ( rule__Default__Group__6__Impl rule__Default__Group__7 )
            // InternalGreedySnake.g:2765:2: rule__Default__Group__6__Impl rule__Default__Group__7
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
    // InternalGreedySnake.g:2772:1: rule__Default__Group__6__Impl : ( 'Time' ) ;
    public final void rule__Default__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2776:1: ( ( 'Time' ) )
            // InternalGreedySnake.g:2777:1: ( 'Time' )
            {
            // InternalGreedySnake.g:2777:1: ( 'Time' )
            // InternalGreedySnake.g:2778:2: 'Time'
            {
             before(grammarAccess.getDefaultAccess().getTimeKeyword_6()); 
            match(input,40,FOLLOW_2); 
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
    // InternalGreedySnake.g:2787:1: rule__Default__Group__7 : rule__Default__Group__7__Impl rule__Default__Group__8 ;
    public final void rule__Default__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2791:1: ( rule__Default__Group__7__Impl rule__Default__Group__8 )
            // InternalGreedySnake.g:2792:2: rule__Default__Group__7__Impl rule__Default__Group__8
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
    // InternalGreedySnake.g:2799:1: rule__Default__Group__7__Impl : ( '=' ) ;
    public final void rule__Default__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2803:1: ( ( '=' ) )
            // InternalGreedySnake.g:2804:1: ( '=' )
            {
            // InternalGreedySnake.g:2804:1: ( '=' )
            // InternalGreedySnake.g:2805:2: '='
            {
             before(grammarAccess.getDefaultAccess().getEqualsSignKeyword_7()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:2814:1: rule__Default__Group__8 : rule__Default__Group__8__Impl rule__Default__Group__9 ;
    public final void rule__Default__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2818:1: ( rule__Default__Group__8__Impl rule__Default__Group__9 )
            // InternalGreedySnake.g:2819:2: rule__Default__Group__8__Impl rule__Default__Group__9
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
    // InternalGreedySnake.g:2826:1: rule__Default__Group__8__Impl : ( ( rule__Default__TimeAssignment_8 ) ) ;
    public final void rule__Default__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2830:1: ( ( ( rule__Default__TimeAssignment_8 ) ) )
            // InternalGreedySnake.g:2831:1: ( ( rule__Default__TimeAssignment_8 ) )
            {
            // InternalGreedySnake.g:2831:1: ( ( rule__Default__TimeAssignment_8 ) )
            // InternalGreedySnake.g:2832:2: ( rule__Default__TimeAssignment_8 )
            {
             before(grammarAccess.getDefaultAccess().getTimeAssignment_8()); 
            // InternalGreedySnake.g:2833:2: ( rule__Default__TimeAssignment_8 )
            // InternalGreedySnake.g:2833:3: rule__Default__TimeAssignment_8
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
    // InternalGreedySnake.g:2841:1: rule__Default__Group__9 : rule__Default__Group__9__Impl rule__Default__Group__10 ;
    public final void rule__Default__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2845:1: ( rule__Default__Group__9__Impl rule__Default__Group__10 )
            // InternalGreedySnake.g:2846:2: rule__Default__Group__9__Impl rule__Default__Group__10
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
    // InternalGreedySnake.g:2853:1: rule__Default__Group__9__Impl : ( 'Amount' ) ;
    public final void rule__Default__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2857:1: ( ( 'Amount' ) )
            // InternalGreedySnake.g:2858:1: ( 'Amount' )
            {
            // InternalGreedySnake.g:2858:1: ( 'Amount' )
            // InternalGreedySnake.g:2859:2: 'Amount'
            {
             before(grammarAccess.getDefaultAccess().getAmountKeyword_9()); 
            match(input,41,FOLLOW_2); 
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
    // InternalGreedySnake.g:2868:1: rule__Default__Group__10 : rule__Default__Group__10__Impl rule__Default__Group__11 ;
    public final void rule__Default__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2872:1: ( rule__Default__Group__10__Impl rule__Default__Group__11 )
            // InternalGreedySnake.g:2873:2: rule__Default__Group__10__Impl rule__Default__Group__11
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
    // InternalGreedySnake.g:2880:1: rule__Default__Group__10__Impl : ( '=' ) ;
    public final void rule__Default__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2884:1: ( ( '=' ) )
            // InternalGreedySnake.g:2885:1: ( '=' )
            {
            // InternalGreedySnake.g:2885:1: ( '=' )
            // InternalGreedySnake.g:2886:2: '='
            {
             before(grammarAccess.getDefaultAccess().getEqualsSignKeyword_10()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:2895:1: rule__Default__Group__11 : rule__Default__Group__11__Impl rule__Default__Group__12 ;
    public final void rule__Default__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2899:1: ( rule__Default__Group__11__Impl rule__Default__Group__12 )
            // InternalGreedySnake.g:2900:2: rule__Default__Group__11__Impl rule__Default__Group__12
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
    // InternalGreedySnake.g:2907:1: rule__Default__Group__11__Impl : ( ( rule__Default__AmountAssignment_11 ) ) ;
    public final void rule__Default__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2911:1: ( ( ( rule__Default__AmountAssignment_11 ) ) )
            // InternalGreedySnake.g:2912:1: ( ( rule__Default__AmountAssignment_11 ) )
            {
            // InternalGreedySnake.g:2912:1: ( ( rule__Default__AmountAssignment_11 ) )
            // InternalGreedySnake.g:2913:2: ( rule__Default__AmountAssignment_11 )
            {
             before(grammarAccess.getDefaultAccess().getAmountAssignment_11()); 
            // InternalGreedySnake.g:2914:2: ( rule__Default__AmountAssignment_11 )
            // InternalGreedySnake.g:2914:3: rule__Default__AmountAssignment_11
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
    // InternalGreedySnake.g:2922:1: rule__Default__Group__12 : rule__Default__Group__12__Impl rule__Default__Group__13 ;
    public final void rule__Default__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2926:1: ( rule__Default__Group__12__Impl rule__Default__Group__13 )
            // InternalGreedySnake.g:2927:2: rule__Default__Group__12__Impl rule__Default__Group__13
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
    // InternalGreedySnake.g:2934:1: rule__Default__Group__12__Impl : ( 'Weapon' ) ;
    public final void rule__Default__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2938:1: ( ( 'Weapon' ) )
            // InternalGreedySnake.g:2939:1: ( 'Weapon' )
            {
            // InternalGreedySnake.g:2939:1: ( 'Weapon' )
            // InternalGreedySnake.g:2940:2: 'Weapon'
            {
             before(grammarAccess.getDefaultAccess().getWeaponKeyword_12()); 
            match(input,42,FOLLOW_2); 
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
    // InternalGreedySnake.g:2949:1: rule__Default__Group__13 : rule__Default__Group__13__Impl rule__Default__Group__14 ;
    public final void rule__Default__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2953:1: ( rule__Default__Group__13__Impl rule__Default__Group__14 )
            // InternalGreedySnake.g:2954:2: rule__Default__Group__13__Impl rule__Default__Group__14
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
    // InternalGreedySnake.g:2961:1: rule__Default__Group__13__Impl : ( '=' ) ;
    public final void rule__Default__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2965:1: ( ( '=' ) )
            // InternalGreedySnake.g:2966:1: ( '=' )
            {
            // InternalGreedySnake.g:2966:1: ( '=' )
            // InternalGreedySnake.g:2967:2: '='
            {
             before(grammarAccess.getDefaultAccess().getEqualsSignKeyword_13()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:2976:1: rule__Default__Group__14 : rule__Default__Group__14__Impl ;
    public final void rule__Default__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2980:1: ( rule__Default__Group__14__Impl )
            // InternalGreedySnake.g:2981:2: rule__Default__Group__14__Impl
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
    // InternalGreedySnake.g:2987:1: rule__Default__Group__14__Impl : ( ( rule__Default__WeaponAssignment_14 ) ) ;
    public final void rule__Default__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:2991:1: ( ( ( rule__Default__WeaponAssignment_14 ) ) )
            // InternalGreedySnake.g:2992:1: ( ( rule__Default__WeaponAssignment_14 ) )
            {
            // InternalGreedySnake.g:2992:1: ( ( rule__Default__WeaponAssignment_14 ) )
            // InternalGreedySnake.g:2993:2: ( rule__Default__WeaponAssignment_14 )
            {
             before(grammarAccess.getDefaultAccess().getWeaponAssignment_14()); 
            // InternalGreedySnake.g:2994:2: ( rule__Default__WeaponAssignment_14 )
            // InternalGreedySnake.g:2994:3: rule__Default__WeaponAssignment_14
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
    // InternalGreedySnake.g:3003:1: rule__InitialSnakeSpecificatin__Group__0 : rule__InitialSnakeSpecificatin__Group__0__Impl rule__InitialSnakeSpecificatin__Group__1 ;
    public final void rule__InitialSnakeSpecificatin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3007:1: ( rule__InitialSnakeSpecificatin__Group__0__Impl rule__InitialSnakeSpecificatin__Group__1 )
            // InternalGreedySnake.g:3008:2: rule__InitialSnakeSpecificatin__Group__0__Impl rule__InitialSnakeSpecificatin__Group__1
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
    // InternalGreedySnake.g:3015:1: rule__InitialSnakeSpecificatin__Group__0__Impl : ( 'snake' ) ;
    public final void rule__InitialSnakeSpecificatin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3019:1: ( ( 'snake' ) )
            // InternalGreedySnake.g:3020:1: ( 'snake' )
            {
            // InternalGreedySnake.g:3020:1: ( 'snake' )
            // InternalGreedySnake.g:3021:2: 'snake'
            {
             before(grammarAccess.getInitialSnakeSpecificatinAccess().getSnakeKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalGreedySnake.g:3030:1: rule__InitialSnakeSpecificatin__Group__1 : rule__InitialSnakeSpecificatin__Group__1__Impl rule__InitialSnakeSpecificatin__Group__2 ;
    public final void rule__InitialSnakeSpecificatin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3034:1: ( rule__InitialSnakeSpecificatin__Group__1__Impl rule__InitialSnakeSpecificatin__Group__2 )
            // InternalGreedySnake.g:3035:2: rule__InitialSnakeSpecificatin__Group__1__Impl rule__InitialSnakeSpecificatin__Group__2
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
    // InternalGreedySnake.g:3042:1: rule__InitialSnakeSpecificatin__Group__1__Impl : ( ( rule__InitialSnakeSpecificatin__NameAssignment_1 ) ) ;
    public final void rule__InitialSnakeSpecificatin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3046:1: ( ( ( rule__InitialSnakeSpecificatin__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:3047:1: ( ( rule__InitialSnakeSpecificatin__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:3047:1: ( ( rule__InitialSnakeSpecificatin__NameAssignment_1 ) )
            // InternalGreedySnake.g:3048:2: ( rule__InitialSnakeSpecificatin__NameAssignment_1 )
            {
             before(grammarAccess.getInitialSnakeSpecificatinAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:3049:2: ( rule__InitialSnakeSpecificatin__NameAssignment_1 )
            // InternalGreedySnake.g:3049:3: rule__InitialSnakeSpecificatin__NameAssignment_1
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
    // InternalGreedySnake.g:3057:1: rule__InitialSnakeSpecificatin__Group__2 : rule__InitialSnakeSpecificatin__Group__2__Impl rule__InitialSnakeSpecificatin__Group__3 ;
    public final void rule__InitialSnakeSpecificatin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3061:1: ( rule__InitialSnakeSpecificatin__Group__2__Impl rule__InitialSnakeSpecificatin__Group__3 )
            // InternalGreedySnake.g:3062:2: rule__InitialSnakeSpecificatin__Group__2__Impl rule__InitialSnakeSpecificatin__Group__3
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
    // InternalGreedySnake.g:3069:1: rule__InitialSnakeSpecificatin__Group__2__Impl : ( '{' ) ;
    public final void rule__InitialSnakeSpecificatin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3073:1: ( ( '{' ) )
            // InternalGreedySnake.g:3074:1: ( '{' )
            {
            // InternalGreedySnake.g:3074:1: ( '{' )
            // InternalGreedySnake.g:3075:2: '{'
            {
             before(grammarAccess.getInitialSnakeSpecificatinAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:3084:1: rule__InitialSnakeSpecificatin__Group__3 : rule__InitialSnakeSpecificatin__Group__3__Impl rule__InitialSnakeSpecificatin__Group__4 ;
    public final void rule__InitialSnakeSpecificatin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3088:1: ( rule__InitialSnakeSpecificatin__Group__3__Impl rule__InitialSnakeSpecificatin__Group__4 )
            // InternalGreedySnake.g:3089:2: rule__InitialSnakeSpecificatin__Group__3__Impl rule__InitialSnakeSpecificatin__Group__4
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
    // InternalGreedySnake.g:3096:1: rule__InitialSnakeSpecificatin__Group__3__Impl : ( ( rule__InitialSnakeSpecificatin__MembersAssignment_3 ) ) ;
    public final void rule__InitialSnakeSpecificatin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3100:1: ( ( ( rule__InitialSnakeSpecificatin__MembersAssignment_3 ) ) )
            // InternalGreedySnake.g:3101:1: ( ( rule__InitialSnakeSpecificatin__MembersAssignment_3 ) )
            {
            // InternalGreedySnake.g:3101:1: ( ( rule__InitialSnakeSpecificatin__MembersAssignment_3 ) )
            // InternalGreedySnake.g:3102:2: ( rule__InitialSnakeSpecificatin__MembersAssignment_3 )
            {
             before(grammarAccess.getInitialSnakeSpecificatinAccess().getMembersAssignment_3()); 
            // InternalGreedySnake.g:3103:2: ( rule__InitialSnakeSpecificatin__MembersAssignment_3 )
            // InternalGreedySnake.g:3103:3: rule__InitialSnakeSpecificatin__MembersAssignment_3
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
    // InternalGreedySnake.g:3111:1: rule__InitialSnakeSpecificatin__Group__4 : rule__InitialSnakeSpecificatin__Group__4__Impl rule__InitialSnakeSpecificatin__Group__5 ;
    public final void rule__InitialSnakeSpecificatin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3115:1: ( rule__InitialSnakeSpecificatin__Group__4__Impl rule__InitialSnakeSpecificatin__Group__5 )
            // InternalGreedySnake.g:3116:2: rule__InitialSnakeSpecificatin__Group__4__Impl rule__InitialSnakeSpecificatin__Group__5
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
    // InternalGreedySnake.g:3123:1: rule__InitialSnakeSpecificatin__Group__4__Impl : ( '}' ) ;
    public final void rule__InitialSnakeSpecificatin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3127:1: ( ( '}' ) )
            // InternalGreedySnake.g:3128:1: ( '}' )
            {
            // InternalGreedySnake.g:3128:1: ( '}' )
            // InternalGreedySnake.g:3129:2: '}'
            {
             before(grammarAccess.getInitialSnakeSpecificatinAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:3138:1: rule__InitialSnakeSpecificatin__Group__5 : rule__InitialSnakeSpecificatin__Group__5__Impl ;
    public final void rule__InitialSnakeSpecificatin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3142:1: ( rule__InitialSnakeSpecificatin__Group__5__Impl )
            // InternalGreedySnake.g:3143:2: rule__InitialSnakeSpecificatin__Group__5__Impl
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
    // InternalGreedySnake.g:3149:1: rule__InitialSnakeSpecificatin__Group__5__Impl : ( ( rule__InitialSnakeSpecificatin__MultiplesAssignment_5 )? ) ;
    public final void rule__InitialSnakeSpecificatin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3153:1: ( ( ( rule__InitialSnakeSpecificatin__MultiplesAssignment_5 )? ) )
            // InternalGreedySnake.g:3154:1: ( ( rule__InitialSnakeSpecificatin__MultiplesAssignment_5 )? )
            {
            // InternalGreedySnake.g:3154:1: ( ( rule__InitialSnakeSpecificatin__MultiplesAssignment_5 )? )
            // InternalGreedySnake.g:3155:2: ( rule__InitialSnakeSpecificatin__MultiplesAssignment_5 )?
            {
             before(grammarAccess.getInitialSnakeSpecificatinAccess().getMultiplesAssignment_5()); 
            // InternalGreedySnake.g:3156:2: ( rule__InitialSnakeSpecificatin__MultiplesAssignment_5 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||LA11_1==RULE_ID||(LA11_1>=23 && LA11_1<=24)||LA11_1==26||(LA11_1>=43 && LA11_1<=47)||(LA11_1>=70 && LA11_1<=74)||(LA11_1>=78 && LA11_1<=79)||LA11_1==83) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalGreedySnake.g:3156:3: rule__InitialSnakeSpecificatin__MultiplesAssignment_5
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
    // InternalGreedySnake.g:3165:1: rule__InitialFoodSpecificatin__Group__0 : rule__InitialFoodSpecificatin__Group__0__Impl rule__InitialFoodSpecificatin__Group__1 ;
    public final void rule__InitialFoodSpecificatin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3169:1: ( rule__InitialFoodSpecificatin__Group__0__Impl rule__InitialFoodSpecificatin__Group__1 )
            // InternalGreedySnake.g:3170:2: rule__InitialFoodSpecificatin__Group__0__Impl rule__InitialFoodSpecificatin__Group__1
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
    // InternalGreedySnake.g:3177:1: rule__InitialFoodSpecificatin__Group__0__Impl : ( 'food' ) ;
    public final void rule__InitialFoodSpecificatin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3181:1: ( ( 'food' ) )
            // InternalGreedySnake.g:3182:1: ( 'food' )
            {
            // InternalGreedySnake.g:3182:1: ( 'food' )
            // InternalGreedySnake.g:3183:2: 'food'
            {
             before(grammarAccess.getInitialFoodSpecificatinAccess().getFoodKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalGreedySnake.g:3192:1: rule__InitialFoodSpecificatin__Group__1 : rule__InitialFoodSpecificatin__Group__1__Impl rule__InitialFoodSpecificatin__Group__2 ;
    public final void rule__InitialFoodSpecificatin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3196:1: ( rule__InitialFoodSpecificatin__Group__1__Impl rule__InitialFoodSpecificatin__Group__2 )
            // InternalGreedySnake.g:3197:2: rule__InitialFoodSpecificatin__Group__1__Impl rule__InitialFoodSpecificatin__Group__2
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
    // InternalGreedySnake.g:3204:1: rule__InitialFoodSpecificatin__Group__1__Impl : ( ( rule__InitialFoodSpecificatin__NameAssignment_1 ) ) ;
    public final void rule__InitialFoodSpecificatin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3208:1: ( ( ( rule__InitialFoodSpecificatin__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:3209:1: ( ( rule__InitialFoodSpecificatin__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:3209:1: ( ( rule__InitialFoodSpecificatin__NameAssignment_1 ) )
            // InternalGreedySnake.g:3210:2: ( rule__InitialFoodSpecificatin__NameAssignment_1 )
            {
             before(grammarAccess.getInitialFoodSpecificatinAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:3211:2: ( rule__InitialFoodSpecificatin__NameAssignment_1 )
            // InternalGreedySnake.g:3211:3: rule__InitialFoodSpecificatin__NameAssignment_1
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
    // InternalGreedySnake.g:3219:1: rule__InitialFoodSpecificatin__Group__2 : rule__InitialFoodSpecificatin__Group__2__Impl rule__InitialFoodSpecificatin__Group__3 ;
    public final void rule__InitialFoodSpecificatin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3223:1: ( rule__InitialFoodSpecificatin__Group__2__Impl rule__InitialFoodSpecificatin__Group__3 )
            // InternalGreedySnake.g:3224:2: rule__InitialFoodSpecificatin__Group__2__Impl rule__InitialFoodSpecificatin__Group__3
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
    // InternalGreedySnake.g:3231:1: rule__InitialFoodSpecificatin__Group__2__Impl : ( '{' ) ;
    public final void rule__InitialFoodSpecificatin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3235:1: ( ( '{' ) )
            // InternalGreedySnake.g:3236:1: ( '{' )
            {
            // InternalGreedySnake.g:3236:1: ( '{' )
            // InternalGreedySnake.g:3237:2: '{'
            {
             before(grammarAccess.getInitialFoodSpecificatinAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:3246:1: rule__InitialFoodSpecificatin__Group__3 : rule__InitialFoodSpecificatin__Group__3__Impl rule__InitialFoodSpecificatin__Group__4 ;
    public final void rule__InitialFoodSpecificatin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3250:1: ( rule__InitialFoodSpecificatin__Group__3__Impl rule__InitialFoodSpecificatin__Group__4 )
            // InternalGreedySnake.g:3251:2: rule__InitialFoodSpecificatin__Group__3__Impl rule__InitialFoodSpecificatin__Group__4
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
    // InternalGreedySnake.g:3258:1: rule__InitialFoodSpecificatin__Group__3__Impl : ( ( rule__InitialFoodSpecificatin__MembersAssignment_3 ) ) ;
    public final void rule__InitialFoodSpecificatin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3262:1: ( ( ( rule__InitialFoodSpecificatin__MembersAssignment_3 ) ) )
            // InternalGreedySnake.g:3263:1: ( ( rule__InitialFoodSpecificatin__MembersAssignment_3 ) )
            {
            // InternalGreedySnake.g:3263:1: ( ( rule__InitialFoodSpecificatin__MembersAssignment_3 ) )
            // InternalGreedySnake.g:3264:2: ( rule__InitialFoodSpecificatin__MembersAssignment_3 )
            {
             before(grammarAccess.getInitialFoodSpecificatinAccess().getMembersAssignment_3()); 
            // InternalGreedySnake.g:3265:2: ( rule__InitialFoodSpecificatin__MembersAssignment_3 )
            // InternalGreedySnake.g:3265:3: rule__InitialFoodSpecificatin__MembersAssignment_3
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
    // InternalGreedySnake.g:3273:1: rule__InitialFoodSpecificatin__Group__4 : rule__InitialFoodSpecificatin__Group__4__Impl rule__InitialFoodSpecificatin__Group__5 ;
    public final void rule__InitialFoodSpecificatin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3277:1: ( rule__InitialFoodSpecificatin__Group__4__Impl rule__InitialFoodSpecificatin__Group__5 )
            // InternalGreedySnake.g:3278:2: rule__InitialFoodSpecificatin__Group__4__Impl rule__InitialFoodSpecificatin__Group__5
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
    // InternalGreedySnake.g:3285:1: rule__InitialFoodSpecificatin__Group__4__Impl : ( '}' ) ;
    public final void rule__InitialFoodSpecificatin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3289:1: ( ( '}' ) )
            // InternalGreedySnake.g:3290:1: ( '}' )
            {
            // InternalGreedySnake.g:3290:1: ( '}' )
            // InternalGreedySnake.g:3291:2: '}'
            {
             before(grammarAccess.getInitialFoodSpecificatinAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:3300:1: rule__InitialFoodSpecificatin__Group__5 : rule__InitialFoodSpecificatin__Group__5__Impl ;
    public final void rule__InitialFoodSpecificatin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3304:1: ( rule__InitialFoodSpecificatin__Group__5__Impl )
            // InternalGreedySnake.g:3305:2: rule__InitialFoodSpecificatin__Group__5__Impl
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
    // InternalGreedySnake.g:3311:1: rule__InitialFoodSpecificatin__Group__5__Impl : ( ( rule__InitialFoodSpecificatin__MultiplesAssignment_5 )? ) ;
    public final void rule__InitialFoodSpecificatin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3315:1: ( ( ( rule__InitialFoodSpecificatin__MultiplesAssignment_5 )? ) )
            // InternalGreedySnake.g:3316:1: ( ( rule__InitialFoodSpecificatin__MultiplesAssignment_5 )? )
            {
            // InternalGreedySnake.g:3316:1: ( ( rule__InitialFoodSpecificatin__MultiplesAssignment_5 )? )
            // InternalGreedySnake.g:3317:2: ( rule__InitialFoodSpecificatin__MultiplesAssignment_5 )?
            {
             before(grammarAccess.getInitialFoodSpecificatinAccess().getMultiplesAssignment_5()); 
            // InternalGreedySnake.g:3318:2: ( rule__InitialFoodSpecificatin__MultiplesAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||LA12_1==RULE_ID||(LA12_1>=23 && LA12_1<=24)||LA12_1==26||(LA12_1>=43 && LA12_1<=47)||(LA12_1>=70 && LA12_1<=74)||(LA12_1>=78 && LA12_1<=79)||LA12_1==83) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalGreedySnake.g:3318:3: rule__InitialFoodSpecificatin__MultiplesAssignment_5
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
    // InternalGreedySnake.g:3327:1: rule__InitialObstacleSpecificatin__Group__0 : rule__InitialObstacleSpecificatin__Group__0__Impl rule__InitialObstacleSpecificatin__Group__1 ;
    public final void rule__InitialObstacleSpecificatin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3331:1: ( rule__InitialObstacleSpecificatin__Group__0__Impl rule__InitialObstacleSpecificatin__Group__1 )
            // InternalGreedySnake.g:3332:2: rule__InitialObstacleSpecificatin__Group__0__Impl rule__InitialObstacleSpecificatin__Group__1
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
    // InternalGreedySnake.g:3339:1: rule__InitialObstacleSpecificatin__Group__0__Impl : ( 'obstacle' ) ;
    public final void rule__InitialObstacleSpecificatin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3343:1: ( ( 'obstacle' ) )
            // InternalGreedySnake.g:3344:1: ( 'obstacle' )
            {
            // InternalGreedySnake.g:3344:1: ( 'obstacle' )
            // InternalGreedySnake.g:3345:2: 'obstacle'
            {
             before(grammarAccess.getInitialObstacleSpecificatinAccess().getObstacleKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalGreedySnake.g:3354:1: rule__InitialObstacleSpecificatin__Group__1 : rule__InitialObstacleSpecificatin__Group__1__Impl rule__InitialObstacleSpecificatin__Group__2 ;
    public final void rule__InitialObstacleSpecificatin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3358:1: ( rule__InitialObstacleSpecificatin__Group__1__Impl rule__InitialObstacleSpecificatin__Group__2 )
            // InternalGreedySnake.g:3359:2: rule__InitialObstacleSpecificatin__Group__1__Impl rule__InitialObstacleSpecificatin__Group__2
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
    // InternalGreedySnake.g:3366:1: rule__InitialObstacleSpecificatin__Group__1__Impl : ( ( rule__InitialObstacleSpecificatin__NameAssignment_1 ) ) ;
    public final void rule__InitialObstacleSpecificatin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3370:1: ( ( ( rule__InitialObstacleSpecificatin__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:3371:1: ( ( rule__InitialObstacleSpecificatin__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:3371:1: ( ( rule__InitialObstacleSpecificatin__NameAssignment_1 ) )
            // InternalGreedySnake.g:3372:2: ( rule__InitialObstacleSpecificatin__NameAssignment_1 )
            {
             before(grammarAccess.getInitialObstacleSpecificatinAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:3373:2: ( rule__InitialObstacleSpecificatin__NameAssignment_1 )
            // InternalGreedySnake.g:3373:3: rule__InitialObstacleSpecificatin__NameAssignment_1
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
    // InternalGreedySnake.g:3381:1: rule__InitialObstacleSpecificatin__Group__2 : rule__InitialObstacleSpecificatin__Group__2__Impl rule__InitialObstacleSpecificatin__Group__3 ;
    public final void rule__InitialObstacleSpecificatin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3385:1: ( rule__InitialObstacleSpecificatin__Group__2__Impl rule__InitialObstacleSpecificatin__Group__3 )
            // InternalGreedySnake.g:3386:2: rule__InitialObstacleSpecificatin__Group__2__Impl rule__InitialObstacleSpecificatin__Group__3
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
    // InternalGreedySnake.g:3393:1: rule__InitialObstacleSpecificatin__Group__2__Impl : ( '{' ) ;
    public final void rule__InitialObstacleSpecificatin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3397:1: ( ( '{' ) )
            // InternalGreedySnake.g:3398:1: ( '{' )
            {
            // InternalGreedySnake.g:3398:1: ( '{' )
            // InternalGreedySnake.g:3399:2: '{'
            {
             before(grammarAccess.getInitialObstacleSpecificatinAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:3408:1: rule__InitialObstacleSpecificatin__Group__3 : rule__InitialObstacleSpecificatin__Group__3__Impl rule__InitialObstacleSpecificatin__Group__4 ;
    public final void rule__InitialObstacleSpecificatin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3412:1: ( rule__InitialObstacleSpecificatin__Group__3__Impl rule__InitialObstacleSpecificatin__Group__4 )
            // InternalGreedySnake.g:3413:2: rule__InitialObstacleSpecificatin__Group__3__Impl rule__InitialObstacleSpecificatin__Group__4
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
    // InternalGreedySnake.g:3420:1: rule__InitialObstacleSpecificatin__Group__3__Impl : ( ( rule__InitialObstacleSpecificatin__MembersAssignment_3 ) ) ;
    public final void rule__InitialObstacleSpecificatin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3424:1: ( ( ( rule__InitialObstacleSpecificatin__MembersAssignment_3 ) ) )
            // InternalGreedySnake.g:3425:1: ( ( rule__InitialObstacleSpecificatin__MembersAssignment_3 ) )
            {
            // InternalGreedySnake.g:3425:1: ( ( rule__InitialObstacleSpecificatin__MembersAssignment_3 ) )
            // InternalGreedySnake.g:3426:2: ( rule__InitialObstacleSpecificatin__MembersAssignment_3 )
            {
             before(grammarAccess.getInitialObstacleSpecificatinAccess().getMembersAssignment_3()); 
            // InternalGreedySnake.g:3427:2: ( rule__InitialObstacleSpecificatin__MembersAssignment_3 )
            // InternalGreedySnake.g:3427:3: rule__InitialObstacleSpecificatin__MembersAssignment_3
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
    // InternalGreedySnake.g:3435:1: rule__InitialObstacleSpecificatin__Group__4 : rule__InitialObstacleSpecificatin__Group__4__Impl rule__InitialObstacleSpecificatin__Group__5 ;
    public final void rule__InitialObstacleSpecificatin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3439:1: ( rule__InitialObstacleSpecificatin__Group__4__Impl rule__InitialObstacleSpecificatin__Group__5 )
            // InternalGreedySnake.g:3440:2: rule__InitialObstacleSpecificatin__Group__4__Impl rule__InitialObstacleSpecificatin__Group__5
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
    // InternalGreedySnake.g:3447:1: rule__InitialObstacleSpecificatin__Group__4__Impl : ( '}' ) ;
    public final void rule__InitialObstacleSpecificatin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3451:1: ( ( '}' ) )
            // InternalGreedySnake.g:3452:1: ( '}' )
            {
            // InternalGreedySnake.g:3452:1: ( '}' )
            // InternalGreedySnake.g:3453:2: '}'
            {
             before(grammarAccess.getInitialObstacleSpecificatinAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:3462:1: rule__InitialObstacleSpecificatin__Group__5 : rule__InitialObstacleSpecificatin__Group__5__Impl ;
    public final void rule__InitialObstacleSpecificatin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3466:1: ( rule__InitialObstacleSpecificatin__Group__5__Impl )
            // InternalGreedySnake.g:3467:2: rule__InitialObstacleSpecificatin__Group__5__Impl
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
    // InternalGreedySnake.g:3473:1: rule__InitialObstacleSpecificatin__Group__5__Impl : ( ( rule__InitialObstacleSpecificatin__MultiplesAssignment_5 )? ) ;
    public final void rule__InitialObstacleSpecificatin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3477:1: ( ( ( rule__InitialObstacleSpecificatin__MultiplesAssignment_5 )? ) )
            // InternalGreedySnake.g:3478:1: ( ( rule__InitialObstacleSpecificatin__MultiplesAssignment_5 )? )
            {
            // InternalGreedySnake.g:3478:1: ( ( rule__InitialObstacleSpecificatin__MultiplesAssignment_5 )? )
            // InternalGreedySnake.g:3479:2: ( rule__InitialObstacleSpecificatin__MultiplesAssignment_5 )?
            {
             before(grammarAccess.getInitialObstacleSpecificatinAccess().getMultiplesAssignment_5()); 
            // InternalGreedySnake.g:3480:2: ( rule__InitialObstacleSpecificatin__MultiplesAssignment_5 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||LA13_1==RULE_ID||(LA13_1>=23 && LA13_1<=24)||LA13_1==26||(LA13_1>=43 && LA13_1<=47)||(LA13_1>=70 && LA13_1<=74)||(LA13_1>=78 && LA13_1<=79)||LA13_1==83) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalGreedySnake.g:3480:3: rule__InitialObstacleSpecificatin__MultiplesAssignment_5
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
    // InternalGreedySnake.g:3489:1: rule__InitialFireSpecification__Group__0 : rule__InitialFireSpecification__Group__0__Impl rule__InitialFireSpecification__Group__1 ;
    public final void rule__InitialFireSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3493:1: ( rule__InitialFireSpecification__Group__0__Impl rule__InitialFireSpecification__Group__1 )
            // InternalGreedySnake.g:3494:2: rule__InitialFireSpecification__Group__0__Impl rule__InitialFireSpecification__Group__1
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
    // InternalGreedySnake.g:3501:1: rule__InitialFireSpecification__Group__0__Impl : ( 'fire' ) ;
    public final void rule__InitialFireSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3505:1: ( ( 'fire' ) )
            // InternalGreedySnake.g:3506:1: ( 'fire' )
            {
            // InternalGreedySnake.g:3506:1: ( 'fire' )
            // InternalGreedySnake.g:3507:2: 'fire'
            {
             before(grammarAccess.getInitialFireSpecificationAccess().getFireKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalGreedySnake.g:3516:1: rule__InitialFireSpecification__Group__1 : rule__InitialFireSpecification__Group__1__Impl rule__InitialFireSpecification__Group__2 ;
    public final void rule__InitialFireSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3520:1: ( rule__InitialFireSpecification__Group__1__Impl rule__InitialFireSpecification__Group__2 )
            // InternalGreedySnake.g:3521:2: rule__InitialFireSpecification__Group__1__Impl rule__InitialFireSpecification__Group__2
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
    // InternalGreedySnake.g:3528:1: rule__InitialFireSpecification__Group__1__Impl : ( ( rule__InitialFireSpecification__NameAssignment_1 ) ) ;
    public final void rule__InitialFireSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3532:1: ( ( ( rule__InitialFireSpecification__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:3533:1: ( ( rule__InitialFireSpecification__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:3533:1: ( ( rule__InitialFireSpecification__NameAssignment_1 ) )
            // InternalGreedySnake.g:3534:2: ( rule__InitialFireSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getInitialFireSpecificationAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:3535:2: ( rule__InitialFireSpecification__NameAssignment_1 )
            // InternalGreedySnake.g:3535:3: rule__InitialFireSpecification__NameAssignment_1
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
    // InternalGreedySnake.g:3543:1: rule__InitialFireSpecification__Group__2 : rule__InitialFireSpecification__Group__2__Impl rule__InitialFireSpecification__Group__3 ;
    public final void rule__InitialFireSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3547:1: ( rule__InitialFireSpecification__Group__2__Impl rule__InitialFireSpecification__Group__3 )
            // InternalGreedySnake.g:3548:2: rule__InitialFireSpecification__Group__2__Impl rule__InitialFireSpecification__Group__3
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
    // InternalGreedySnake.g:3555:1: rule__InitialFireSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__InitialFireSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3559:1: ( ( '{' ) )
            // InternalGreedySnake.g:3560:1: ( '{' )
            {
            // InternalGreedySnake.g:3560:1: ( '{' )
            // InternalGreedySnake.g:3561:2: '{'
            {
             before(grammarAccess.getInitialFireSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:3570:1: rule__InitialFireSpecification__Group__3 : rule__InitialFireSpecification__Group__3__Impl rule__InitialFireSpecification__Group__4 ;
    public final void rule__InitialFireSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3574:1: ( rule__InitialFireSpecification__Group__3__Impl rule__InitialFireSpecification__Group__4 )
            // InternalGreedySnake.g:3575:2: rule__InitialFireSpecification__Group__3__Impl rule__InitialFireSpecification__Group__4
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
    // InternalGreedySnake.g:3582:1: rule__InitialFireSpecification__Group__3__Impl : ( ( rule__InitialFireSpecification__MembersAssignment_3 ) ) ;
    public final void rule__InitialFireSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3586:1: ( ( ( rule__InitialFireSpecification__MembersAssignment_3 ) ) )
            // InternalGreedySnake.g:3587:1: ( ( rule__InitialFireSpecification__MembersAssignment_3 ) )
            {
            // InternalGreedySnake.g:3587:1: ( ( rule__InitialFireSpecification__MembersAssignment_3 ) )
            // InternalGreedySnake.g:3588:2: ( rule__InitialFireSpecification__MembersAssignment_3 )
            {
             before(grammarAccess.getInitialFireSpecificationAccess().getMembersAssignment_3()); 
            // InternalGreedySnake.g:3589:2: ( rule__InitialFireSpecification__MembersAssignment_3 )
            // InternalGreedySnake.g:3589:3: rule__InitialFireSpecification__MembersAssignment_3
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
    // InternalGreedySnake.g:3597:1: rule__InitialFireSpecification__Group__4 : rule__InitialFireSpecification__Group__4__Impl rule__InitialFireSpecification__Group__5 ;
    public final void rule__InitialFireSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3601:1: ( rule__InitialFireSpecification__Group__4__Impl rule__InitialFireSpecification__Group__5 )
            // InternalGreedySnake.g:3602:2: rule__InitialFireSpecification__Group__4__Impl rule__InitialFireSpecification__Group__5
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
    // InternalGreedySnake.g:3609:1: rule__InitialFireSpecification__Group__4__Impl : ( '}' ) ;
    public final void rule__InitialFireSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3613:1: ( ( '}' ) )
            // InternalGreedySnake.g:3614:1: ( '}' )
            {
            // InternalGreedySnake.g:3614:1: ( '}' )
            // InternalGreedySnake.g:3615:2: '}'
            {
             before(grammarAccess.getInitialFireSpecificationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:3624:1: rule__InitialFireSpecification__Group__5 : rule__InitialFireSpecification__Group__5__Impl ;
    public final void rule__InitialFireSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3628:1: ( rule__InitialFireSpecification__Group__5__Impl )
            // InternalGreedySnake.g:3629:2: rule__InitialFireSpecification__Group__5__Impl
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
    // InternalGreedySnake.g:3635:1: rule__InitialFireSpecification__Group__5__Impl : ( ( rule__InitialFireSpecification__MultiplesAssignment_5 )? ) ;
    public final void rule__InitialFireSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3639:1: ( ( ( rule__InitialFireSpecification__MultiplesAssignment_5 )? ) )
            // InternalGreedySnake.g:3640:1: ( ( rule__InitialFireSpecification__MultiplesAssignment_5 )? )
            {
            // InternalGreedySnake.g:3640:1: ( ( rule__InitialFireSpecification__MultiplesAssignment_5 )? )
            // InternalGreedySnake.g:3641:2: ( rule__InitialFireSpecification__MultiplesAssignment_5 )?
            {
             before(grammarAccess.getInitialFireSpecificationAccess().getMultiplesAssignment_5()); 
            // InternalGreedySnake.g:3642:2: ( rule__InitialFireSpecification__MultiplesAssignment_5 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==EOF||LA14_1==RULE_ID||(LA14_1>=23 && LA14_1<=24)||LA14_1==26||(LA14_1>=43 && LA14_1<=47)||(LA14_1>=70 && LA14_1<=74)||(LA14_1>=78 && LA14_1<=79)||LA14_1==83) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalGreedySnake.g:3642:3: rule__InitialFireSpecification__MultiplesAssignment_5
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
    // InternalGreedySnake.g:3651:1: rule__InitialSpeedSpecification__Group__0 : rule__InitialSpeedSpecification__Group__0__Impl rule__InitialSpeedSpecification__Group__1 ;
    public final void rule__InitialSpeedSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3655:1: ( rule__InitialSpeedSpecification__Group__0__Impl rule__InitialSpeedSpecification__Group__1 )
            // InternalGreedySnake.g:3656:2: rule__InitialSpeedSpecification__Group__0__Impl rule__InitialSpeedSpecification__Group__1
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
    // InternalGreedySnake.g:3663:1: rule__InitialSpeedSpecification__Group__0__Impl : ( () ) ;
    public final void rule__InitialSpeedSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3667:1: ( ( () ) )
            // InternalGreedySnake.g:3668:1: ( () )
            {
            // InternalGreedySnake.g:3668:1: ( () )
            // InternalGreedySnake.g:3669:2: ()
            {
             before(grammarAccess.getInitialSpeedSpecificationAccess().getInitialSpeedSpecificationAction_0()); 
            // InternalGreedySnake.g:3670:2: ()
            // InternalGreedySnake.g:3670:3: 
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
    // InternalGreedySnake.g:3678:1: rule__InitialSpeedSpecification__Group__1 : rule__InitialSpeedSpecification__Group__1__Impl rule__InitialSpeedSpecification__Group__2 ;
    public final void rule__InitialSpeedSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3682:1: ( rule__InitialSpeedSpecification__Group__1__Impl rule__InitialSpeedSpecification__Group__2 )
            // InternalGreedySnake.g:3683:2: rule__InitialSpeedSpecification__Group__1__Impl rule__InitialSpeedSpecification__Group__2
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
    // InternalGreedySnake.g:3690:1: rule__InitialSpeedSpecification__Group__1__Impl : ( 'Speed' ) ;
    public final void rule__InitialSpeedSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3694:1: ( ( 'Speed' ) )
            // InternalGreedySnake.g:3695:1: ( 'Speed' )
            {
            // InternalGreedySnake.g:3695:1: ( 'Speed' )
            // InternalGreedySnake.g:3696:2: 'Speed'
            {
             before(grammarAccess.getInitialSpeedSpecificationAccess().getSpeedKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalGreedySnake.g:3705:1: rule__InitialSpeedSpecification__Group__2 : rule__InitialSpeedSpecification__Group__2__Impl rule__InitialSpeedSpecification__Group__3 ;
    public final void rule__InitialSpeedSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3709:1: ( rule__InitialSpeedSpecification__Group__2__Impl rule__InitialSpeedSpecification__Group__3 )
            // InternalGreedySnake.g:3710:2: rule__InitialSpeedSpecification__Group__2__Impl rule__InitialSpeedSpecification__Group__3
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
    // InternalGreedySnake.g:3717:1: rule__InitialSpeedSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__InitialSpeedSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3721:1: ( ( '{' ) )
            // InternalGreedySnake.g:3722:1: ( '{' )
            {
            // InternalGreedySnake.g:3722:1: ( '{' )
            // InternalGreedySnake.g:3723:2: '{'
            {
             before(grammarAccess.getInitialSpeedSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:3732:1: rule__InitialSpeedSpecification__Group__3 : rule__InitialSpeedSpecification__Group__3__Impl rule__InitialSpeedSpecification__Group__4 ;
    public final void rule__InitialSpeedSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3736:1: ( rule__InitialSpeedSpecification__Group__3__Impl rule__InitialSpeedSpecification__Group__4 )
            // InternalGreedySnake.g:3737:2: rule__InitialSpeedSpecification__Group__3__Impl rule__InitialSpeedSpecification__Group__4
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
    // InternalGreedySnake.g:3744:1: rule__InitialSpeedSpecification__Group__3__Impl : ( ( rule__InitialSpeedSpecification__SpeedGroupAssignment_3 )* ) ;
    public final void rule__InitialSpeedSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3748:1: ( ( ( rule__InitialSpeedSpecification__SpeedGroupAssignment_3 )* ) )
            // InternalGreedySnake.g:3749:1: ( ( rule__InitialSpeedSpecification__SpeedGroupAssignment_3 )* )
            {
            // InternalGreedySnake.g:3749:1: ( ( rule__InitialSpeedSpecification__SpeedGroupAssignment_3 )* )
            // InternalGreedySnake.g:3750:2: ( rule__InitialSpeedSpecification__SpeedGroupAssignment_3 )*
            {
             before(grammarAccess.getInitialSpeedSpecificationAccess().getSpeedGroupAssignment_3()); 
            // InternalGreedySnake.g:3751:2: ( rule__InitialSpeedSpecification__SpeedGroupAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGreedySnake.g:3751:3: rule__InitialSpeedSpecification__SpeedGroupAssignment_3
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__InitialSpeedSpecification__SpeedGroupAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalGreedySnake.g:3759:1: rule__InitialSpeedSpecification__Group__4 : rule__InitialSpeedSpecification__Group__4__Impl ;
    public final void rule__InitialSpeedSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3763:1: ( rule__InitialSpeedSpecification__Group__4__Impl )
            // InternalGreedySnake.g:3764:2: rule__InitialSpeedSpecification__Group__4__Impl
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
    // InternalGreedySnake.g:3770:1: rule__InitialSpeedSpecification__Group__4__Impl : ( '}' ) ;
    public final void rule__InitialSpeedSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3774:1: ( ( '}' ) )
            // InternalGreedySnake.g:3775:1: ( '}' )
            {
            // InternalGreedySnake.g:3775:1: ( '}' )
            // InternalGreedySnake.g:3776:2: '}'
            {
             before(grammarAccess.getInitialSpeedSpecificationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:3786:1: rule__SpeedGroup__Group__0 : rule__SpeedGroup__Group__0__Impl rule__SpeedGroup__Group__1 ;
    public final void rule__SpeedGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3790:1: ( rule__SpeedGroup__Group__0__Impl rule__SpeedGroup__Group__1 )
            // InternalGreedySnake.g:3791:2: rule__SpeedGroup__Group__0__Impl rule__SpeedGroup__Group__1
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
    // InternalGreedySnake.g:3798:1: rule__SpeedGroup__Group__0__Impl : ( ( rule__SpeedGroup__NameAssignment_0 ) ) ;
    public final void rule__SpeedGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3802:1: ( ( ( rule__SpeedGroup__NameAssignment_0 ) ) )
            // InternalGreedySnake.g:3803:1: ( ( rule__SpeedGroup__NameAssignment_0 ) )
            {
            // InternalGreedySnake.g:3803:1: ( ( rule__SpeedGroup__NameAssignment_0 ) )
            // InternalGreedySnake.g:3804:2: ( rule__SpeedGroup__NameAssignment_0 )
            {
             before(grammarAccess.getSpeedGroupAccess().getNameAssignment_0()); 
            // InternalGreedySnake.g:3805:2: ( rule__SpeedGroup__NameAssignment_0 )
            // InternalGreedySnake.g:3805:3: rule__SpeedGroup__NameAssignment_0
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
    // InternalGreedySnake.g:3813:1: rule__SpeedGroup__Group__1 : rule__SpeedGroup__Group__1__Impl rule__SpeedGroup__Group__2 ;
    public final void rule__SpeedGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3817:1: ( rule__SpeedGroup__Group__1__Impl rule__SpeedGroup__Group__2 )
            // InternalGreedySnake.g:3818:2: rule__SpeedGroup__Group__1__Impl rule__SpeedGroup__Group__2
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
    // InternalGreedySnake.g:3825:1: rule__SpeedGroup__Group__1__Impl : ( '=' ) ;
    public final void rule__SpeedGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3829:1: ( ( '=' ) )
            // InternalGreedySnake.g:3830:1: ( '=' )
            {
            // InternalGreedySnake.g:3830:1: ( '=' )
            // InternalGreedySnake.g:3831:2: '='
            {
             before(grammarAccess.getSpeedGroupAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:3840:1: rule__SpeedGroup__Group__2 : rule__SpeedGroup__Group__2__Impl ;
    public final void rule__SpeedGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3844:1: ( rule__SpeedGroup__Group__2__Impl )
            // InternalGreedySnake.g:3845:2: rule__SpeedGroup__Group__2__Impl
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
    // InternalGreedySnake.g:3851:1: rule__SpeedGroup__Group__2__Impl : ( ( rule__SpeedGroup__ValueAssignment_2 ) ) ;
    public final void rule__SpeedGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3855:1: ( ( ( rule__SpeedGroup__ValueAssignment_2 ) ) )
            // InternalGreedySnake.g:3856:1: ( ( rule__SpeedGroup__ValueAssignment_2 ) )
            {
            // InternalGreedySnake.g:3856:1: ( ( rule__SpeedGroup__ValueAssignment_2 ) )
            // InternalGreedySnake.g:3857:2: ( rule__SpeedGroup__ValueAssignment_2 )
            {
             before(grammarAccess.getSpeedGroupAccess().getValueAssignment_2()); 
            // InternalGreedySnake.g:3858:2: ( rule__SpeedGroup__ValueAssignment_2 )
            // InternalGreedySnake.g:3858:3: rule__SpeedGroup__ValueAssignment_2
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


    // $ANTLR start "rule__SnakeMoveSpecification__Group__0"
    // InternalGreedySnake.g:3867:1: rule__SnakeMoveSpecification__Group__0 : rule__SnakeMoveSpecification__Group__0__Impl rule__SnakeMoveSpecification__Group__1 ;
    public final void rule__SnakeMoveSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3871:1: ( rule__SnakeMoveSpecification__Group__0__Impl rule__SnakeMoveSpecification__Group__1 )
            // InternalGreedySnake.g:3872:2: rule__SnakeMoveSpecification__Group__0__Impl rule__SnakeMoveSpecification__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__SnakeMoveSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeMoveSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeMoveSpecification__Group__0"


    // $ANTLR start "rule__SnakeMoveSpecification__Group__0__Impl"
    // InternalGreedySnake.g:3879:1: rule__SnakeMoveSpecification__Group__0__Impl : ( () ) ;
    public final void rule__SnakeMoveSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3883:1: ( ( () ) )
            // InternalGreedySnake.g:3884:1: ( () )
            {
            // InternalGreedySnake.g:3884:1: ( () )
            // InternalGreedySnake.g:3885:2: ()
            {
             before(grammarAccess.getSnakeMoveSpecificationAccess().getSnakeMoveSpecificationAction_0()); 
            // InternalGreedySnake.g:3886:2: ()
            // InternalGreedySnake.g:3886:3: 
            {
            }

             after(grammarAccess.getSnakeMoveSpecificationAccess().getSnakeMoveSpecificationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeMoveSpecification__Group__0__Impl"


    // $ANTLR start "rule__SnakeMoveSpecification__Group__1"
    // InternalGreedySnake.g:3894:1: rule__SnakeMoveSpecification__Group__1 : rule__SnakeMoveSpecification__Group__1__Impl rule__SnakeMoveSpecification__Group__2 ;
    public final void rule__SnakeMoveSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3898:1: ( rule__SnakeMoveSpecification__Group__1__Impl rule__SnakeMoveSpecification__Group__2 )
            // InternalGreedySnake.g:3899:2: rule__SnakeMoveSpecification__Group__1__Impl rule__SnakeMoveSpecification__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__SnakeMoveSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeMoveSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeMoveSpecification__Group__1"


    // $ANTLR start "rule__SnakeMoveSpecification__Group__1__Impl"
    // InternalGreedySnake.g:3906:1: rule__SnakeMoveSpecification__Group__1__Impl : ( 'snake' ) ;
    public final void rule__SnakeMoveSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3910:1: ( ( 'snake' ) )
            // InternalGreedySnake.g:3911:1: ( 'snake' )
            {
            // InternalGreedySnake.g:3911:1: ( 'snake' )
            // InternalGreedySnake.g:3912:2: 'snake'
            {
             before(grammarAccess.getSnakeMoveSpecificationAccess().getSnakeKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSnakeMoveSpecificationAccess().getSnakeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeMoveSpecification__Group__1__Impl"


    // $ANTLR start "rule__SnakeMoveSpecification__Group__2"
    // InternalGreedySnake.g:3921:1: rule__SnakeMoveSpecification__Group__2 : rule__SnakeMoveSpecification__Group__2__Impl rule__SnakeMoveSpecification__Group__3 ;
    public final void rule__SnakeMoveSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3925:1: ( rule__SnakeMoveSpecification__Group__2__Impl rule__SnakeMoveSpecification__Group__3 )
            // InternalGreedySnake.g:3926:2: rule__SnakeMoveSpecification__Group__2__Impl rule__SnakeMoveSpecification__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SnakeMoveSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeMoveSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeMoveSpecification__Group__2"


    // $ANTLR start "rule__SnakeMoveSpecification__Group__2__Impl"
    // InternalGreedySnake.g:3933:1: rule__SnakeMoveSpecification__Group__2__Impl : ( 'move' ) ;
    public final void rule__SnakeMoveSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3937:1: ( ( 'move' ) )
            // InternalGreedySnake.g:3938:1: ( 'move' )
            {
            // InternalGreedySnake.g:3938:1: ( 'move' )
            // InternalGreedySnake.g:3939:2: 'move'
            {
             before(grammarAccess.getSnakeMoveSpecificationAccess().getMoveKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSnakeMoveSpecificationAccess().getMoveKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeMoveSpecification__Group__2__Impl"


    // $ANTLR start "rule__SnakeMoveSpecification__Group__3"
    // InternalGreedySnake.g:3948:1: rule__SnakeMoveSpecification__Group__3 : rule__SnakeMoveSpecification__Group__3__Impl rule__SnakeMoveSpecification__Group__4 ;
    public final void rule__SnakeMoveSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3952:1: ( rule__SnakeMoveSpecification__Group__3__Impl rule__SnakeMoveSpecification__Group__4 )
            // InternalGreedySnake.g:3953:2: rule__SnakeMoveSpecification__Group__3__Impl rule__SnakeMoveSpecification__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__SnakeMoveSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeMoveSpecification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeMoveSpecification__Group__3"


    // $ANTLR start "rule__SnakeMoveSpecification__Group__3__Impl"
    // InternalGreedySnake.g:3960:1: rule__SnakeMoveSpecification__Group__3__Impl : ( '{' ) ;
    public final void rule__SnakeMoveSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3964:1: ( ( '{' ) )
            // InternalGreedySnake.g:3965:1: ( '{' )
            {
            // InternalGreedySnake.g:3965:1: ( '{' )
            // InternalGreedySnake.g:3966:2: '{'
            {
             before(grammarAccess.getSnakeMoveSpecificationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSnakeMoveSpecificationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeMoveSpecification__Group__3__Impl"


    // $ANTLR start "rule__SnakeMoveSpecification__Group__4"
    // InternalGreedySnake.g:3975:1: rule__SnakeMoveSpecification__Group__4 : rule__SnakeMoveSpecification__Group__4__Impl rule__SnakeMoveSpecification__Group__5 ;
    public final void rule__SnakeMoveSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3979:1: ( rule__SnakeMoveSpecification__Group__4__Impl rule__SnakeMoveSpecification__Group__5 )
            // InternalGreedySnake.g:3980:2: rule__SnakeMoveSpecification__Group__4__Impl rule__SnakeMoveSpecification__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__SnakeMoveSpecification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SnakeMoveSpecification__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeMoveSpecification__Group__4"


    // $ANTLR start "rule__SnakeMoveSpecification__Group__4__Impl"
    // InternalGreedySnake.g:3987:1: rule__SnakeMoveSpecification__Group__4__Impl : ( ( rule__SnakeMoveSpecification__IFAssignment_4 )* ) ;
    public final void rule__SnakeMoveSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:3991:1: ( ( ( rule__SnakeMoveSpecification__IFAssignment_4 )* ) )
            // InternalGreedySnake.g:3992:1: ( ( rule__SnakeMoveSpecification__IFAssignment_4 )* )
            {
            // InternalGreedySnake.g:3992:1: ( ( rule__SnakeMoveSpecification__IFAssignment_4 )* )
            // InternalGreedySnake.g:3993:2: ( rule__SnakeMoveSpecification__IFAssignment_4 )*
            {
             before(grammarAccess.getSnakeMoveSpecificationAccess().getIFAssignment_4()); 
            // InternalGreedySnake.g:3994:2: ( rule__SnakeMoveSpecification__IFAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==49) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGreedySnake.g:3994:3: rule__SnakeMoveSpecification__IFAssignment_4
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__SnakeMoveSpecification__IFAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSnakeMoveSpecificationAccess().getIFAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeMoveSpecification__Group__4__Impl"


    // $ANTLR start "rule__SnakeMoveSpecification__Group__5"
    // InternalGreedySnake.g:4002:1: rule__SnakeMoveSpecification__Group__5 : rule__SnakeMoveSpecification__Group__5__Impl ;
    public final void rule__SnakeMoveSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4006:1: ( rule__SnakeMoveSpecification__Group__5__Impl )
            // InternalGreedySnake.g:4007:2: rule__SnakeMoveSpecification__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SnakeMoveSpecification__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeMoveSpecification__Group__5"


    // $ANTLR start "rule__SnakeMoveSpecification__Group__5__Impl"
    // InternalGreedySnake.g:4013:1: rule__SnakeMoveSpecification__Group__5__Impl : ( '}' ) ;
    public final void rule__SnakeMoveSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4017:1: ( ( '}' ) )
            // InternalGreedySnake.g:4018:1: ( '}' )
            {
            // InternalGreedySnake.g:4018:1: ( '}' )
            // InternalGreedySnake.g:4019:2: '}'
            {
             before(grammarAccess.getSnakeMoveSpecificationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSnakeMoveSpecificationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeMoveSpecification__Group__5__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // InternalGreedySnake.g:4029:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4033:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalGreedySnake.g:4034:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // InternalGreedySnake.g:4041:1: rule__Move__Group__0__Impl : ( 'if' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4045:1: ( ( 'if' ) )
            // InternalGreedySnake.g:4046:1: ( 'if' )
            {
            // InternalGreedySnake.g:4046:1: ( 'if' )
            // InternalGreedySnake.g:4047:2: 'if'
            {
             before(grammarAccess.getMoveAccess().getIfKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // InternalGreedySnake.g:4056:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4060:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // InternalGreedySnake.g:4061:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // InternalGreedySnake.g:4068:1: rule__Move__Group__1__Impl : ( '(' ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4072:1: ( ( '(' ) )
            // InternalGreedySnake.g:4073:1: ( '(' )
            {
            // InternalGreedySnake.g:4073:1: ( '(' )
            // InternalGreedySnake.g:4074:2: '('
            {
             before(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__2"
    // InternalGreedySnake.g:4083:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4087:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // InternalGreedySnake.g:4088:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2"


    // $ANTLR start "rule__Move__Group__2__Impl"
    // InternalGreedySnake.g:4095:1: rule__Move__Group__2__Impl : ( 'direction' ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4099:1: ( ( 'direction' ) )
            // InternalGreedySnake.g:4100:1: ( 'direction' )
            {
            // InternalGreedySnake.g:4100:1: ( 'direction' )
            // InternalGreedySnake.g:4101:2: 'direction'
            {
             before(grammarAccess.getMoveAccess().getDirectionKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getDirectionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2__Impl"


    // $ANTLR start "rule__Move__Group__3"
    // InternalGreedySnake.g:4110:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4114:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // InternalGreedySnake.g:4115:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Move__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3"


    // $ANTLR start "rule__Move__Group__3__Impl"
    // InternalGreedySnake.g:4122:1: rule__Move__Group__3__Impl : ( '=' ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4126:1: ( ( '=' ) )
            // InternalGreedySnake.g:4127:1: ( '=' )
            {
            // InternalGreedySnake.g:4127:1: ( '=' )
            // InternalGreedySnake.g:4128:2: '='
            {
             before(grammarAccess.getMoveAccess().getEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3__Impl"


    // $ANTLR start "rule__Move__Group__4"
    // InternalGreedySnake.g:4137:1: rule__Move__Group__4 : rule__Move__Group__4__Impl rule__Move__Group__5 ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4141:1: ( rule__Move__Group__4__Impl rule__Move__Group__5 )
            // InternalGreedySnake.g:4142:2: rule__Move__Group__4__Impl rule__Move__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Move__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4"


    // $ANTLR start "rule__Move__Group__4__Impl"
    // InternalGreedySnake.g:4149:1: rule__Move__Group__4__Impl : ( ( rule__Move__DirAssignment_4 ) ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4153:1: ( ( ( rule__Move__DirAssignment_4 ) ) )
            // InternalGreedySnake.g:4154:1: ( ( rule__Move__DirAssignment_4 ) )
            {
            // InternalGreedySnake.g:4154:1: ( ( rule__Move__DirAssignment_4 ) )
            // InternalGreedySnake.g:4155:2: ( rule__Move__DirAssignment_4 )
            {
             before(grammarAccess.getMoveAccess().getDirAssignment_4()); 
            // InternalGreedySnake.g:4156:2: ( rule__Move__DirAssignment_4 )
            // InternalGreedySnake.g:4156:3: rule__Move__DirAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Move__DirAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getDirAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4__Impl"


    // $ANTLR start "rule__Move__Group__5"
    // InternalGreedySnake.g:4164:1: rule__Move__Group__5 : rule__Move__Group__5__Impl rule__Move__Group__6 ;
    public final void rule__Move__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4168:1: ( rule__Move__Group__5__Impl rule__Move__Group__6 )
            // InternalGreedySnake.g:4169:2: rule__Move__Group__5__Impl rule__Move__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Move__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__5"


    // $ANTLR start "rule__Move__Group__5__Impl"
    // InternalGreedySnake.g:4176:1: rule__Move__Group__5__Impl : ( ')' ) ;
    public final void rule__Move__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4180:1: ( ( ')' ) )
            // InternalGreedySnake.g:4181:1: ( ')' )
            {
            // InternalGreedySnake.g:4181:1: ( ')' )
            // InternalGreedySnake.g:4182:2: ')'
            {
             before(grammarAccess.getMoveAccess().getRightParenthesisKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__5__Impl"


    // $ANTLR start "rule__Move__Group__6"
    // InternalGreedySnake.g:4191:1: rule__Move__Group__6 : rule__Move__Group__6__Impl rule__Move__Group__7 ;
    public final void rule__Move__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4195:1: ( rule__Move__Group__6__Impl rule__Move__Group__7 )
            // InternalGreedySnake.g:4196:2: rule__Move__Group__6__Impl rule__Move__Group__7
            {
            pushFollow(FOLLOW_39);
            rule__Move__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__6"


    // $ANTLR start "rule__Move__Group__6__Impl"
    // InternalGreedySnake.g:4203:1: rule__Move__Group__6__Impl : ( ( rule__Move__NameAssignment_6 ) ) ;
    public final void rule__Move__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4207:1: ( ( ( rule__Move__NameAssignment_6 ) ) )
            // InternalGreedySnake.g:4208:1: ( ( rule__Move__NameAssignment_6 ) )
            {
            // InternalGreedySnake.g:4208:1: ( ( rule__Move__NameAssignment_6 ) )
            // InternalGreedySnake.g:4209:2: ( rule__Move__NameAssignment_6 )
            {
             before(grammarAccess.getMoveAccess().getNameAssignment_6()); 
            // InternalGreedySnake.g:4210:2: ( rule__Move__NameAssignment_6 )
            // InternalGreedySnake.g:4210:3: rule__Move__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Move__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__6__Impl"


    // $ANTLR start "rule__Move__Group__7"
    // InternalGreedySnake.g:4218:1: rule__Move__Group__7 : rule__Move__Group__7__Impl rule__Move__Group__8 ;
    public final void rule__Move__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4222:1: ( rule__Move__Group__7__Impl rule__Move__Group__8 )
            // InternalGreedySnake.g:4223:2: rule__Move__Group__7__Impl rule__Move__Group__8
            {
            pushFollow(FOLLOW_40);
            rule__Move__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__7"


    // $ANTLR start "rule__Move__Group__7__Impl"
    // InternalGreedySnake.g:4230:1: rule__Move__Group__7__Impl : ( '.' ) ;
    public final void rule__Move__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4234:1: ( ( '.' ) )
            // InternalGreedySnake.g:4235:1: ( '.' )
            {
            // InternalGreedySnake.g:4235:1: ( '.' )
            // InternalGreedySnake.g:4236:2: '.'
            {
             before(grammarAccess.getMoveAccess().getFullStopKeyword_7()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getFullStopKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__7__Impl"


    // $ANTLR start "rule__Move__Group__8"
    // InternalGreedySnake.g:4245:1: rule__Move__Group__8 : rule__Move__Group__8__Impl rule__Move__Group__9 ;
    public final void rule__Move__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4249:1: ( rule__Move__Group__8__Impl rule__Move__Group__9 )
            // InternalGreedySnake.g:4250:2: rule__Move__Group__8__Impl rule__Move__Group__9
            {
            pushFollow(FOLLOW_41);
            rule__Move__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__8"


    // $ANTLR start "rule__Move__Group__8__Impl"
    // InternalGreedySnake.g:4257:1: rule__Move__Group__8__Impl : ( ( rule__Move__CoorAssignment_8 ) ) ;
    public final void rule__Move__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4261:1: ( ( ( rule__Move__CoorAssignment_8 ) ) )
            // InternalGreedySnake.g:4262:1: ( ( rule__Move__CoorAssignment_8 ) )
            {
            // InternalGreedySnake.g:4262:1: ( ( rule__Move__CoorAssignment_8 ) )
            // InternalGreedySnake.g:4263:2: ( rule__Move__CoorAssignment_8 )
            {
             before(grammarAccess.getMoveAccess().getCoorAssignment_8()); 
            // InternalGreedySnake.g:4264:2: ( rule__Move__CoorAssignment_8 )
            // InternalGreedySnake.g:4264:3: rule__Move__CoorAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Move__CoorAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getCoorAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__8__Impl"


    // $ANTLR start "rule__Move__Group__9"
    // InternalGreedySnake.g:4272:1: rule__Move__Group__9 : rule__Move__Group__9__Impl rule__Move__Group__10 ;
    public final void rule__Move__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4276:1: ( rule__Move__Group__9__Impl rule__Move__Group__10 )
            // InternalGreedySnake.g:4277:2: rule__Move__Group__9__Impl rule__Move__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Move__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__9"


    // $ANTLR start "rule__Move__Group__9__Impl"
    // InternalGreedySnake.g:4284:1: rule__Move__Group__9__Impl : ( ( rule__Move__OperatorAssignment_9 ) ) ;
    public final void rule__Move__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4288:1: ( ( ( rule__Move__OperatorAssignment_9 ) ) )
            // InternalGreedySnake.g:4289:1: ( ( rule__Move__OperatorAssignment_9 ) )
            {
            // InternalGreedySnake.g:4289:1: ( ( rule__Move__OperatorAssignment_9 ) )
            // InternalGreedySnake.g:4290:2: ( rule__Move__OperatorAssignment_9 )
            {
             before(grammarAccess.getMoveAccess().getOperatorAssignment_9()); 
            // InternalGreedySnake.g:4291:2: ( rule__Move__OperatorAssignment_9 )
            // InternalGreedySnake.g:4291:3: rule__Move__OperatorAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Move__OperatorAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getOperatorAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__9__Impl"


    // $ANTLR start "rule__Move__Group__10"
    // InternalGreedySnake.g:4299:1: rule__Move__Group__10 : rule__Move__Group__10__Impl ;
    public final void rule__Move__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4303:1: ( rule__Move__Group__10__Impl )
            // InternalGreedySnake.g:4304:2: rule__Move__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__10"


    // $ANTLR start "rule__Move__Group__10__Impl"
    // InternalGreedySnake.g:4310:1: rule__Move__Group__10__Impl : ( ( rule__Move__MoveValAssignment_10 ) ) ;
    public final void rule__Move__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4314:1: ( ( ( rule__Move__MoveValAssignment_10 ) ) )
            // InternalGreedySnake.g:4315:1: ( ( rule__Move__MoveValAssignment_10 ) )
            {
            // InternalGreedySnake.g:4315:1: ( ( rule__Move__MoveValAssignment_10 ) )
            // InternalGreedySnake.g:4316:2: ( rule__Move__MoveValAssignment_10 )
            {
             before(grammarAccess.getMoveAccess().getMoveValAssignment_10()); 
            // InternalGreedySnake.g:4317:2: ( rule__Move__MoveValAssignment_10 )
            // InternalGreedySnake.g:4317:3: rule__Move__MoveValAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Move__MoveValAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getMoveValAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__10__Impl"


    // $ANTLR start "rule__FireInitDisplay__Group__0"
    // InternalGreedySnake.g:4326:1: rule__FireInitDisplay__Group__0 : rule__FireInitDisplay__Group__0__Impl rule__FireInitDisplay__Group__1 ;
    public final void rule__FireInitDisplay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4330:1: ( rule__FireInitDisplay__Group__0__Impl rule__FireInitDisplay__Group__1 )
            // InternalGreedySnake.g:4331:2: rule__FireInitDisplay__Group__0__Impl rule__FireInitDisplay__Group__1
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
    // InternalGreedySnake.g:4338:1: rule__FireInitDisplay__Group__0__Impl : ( 'FireIcon' ) ;
    public final void rule__FireInitDisplay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4342:1: ( ( 'FireIcon' ) )
            // InternalGreedySnake.g:4343:1: ( 'FireIcon' )
            {
            // InternalGreedySnake.g:4343:1: ( 'FireIcon' )
            // InternalGreedySnake.g:4344:2: 'FireIcon'
            {
             before(grammarAccess.getFireInitDisplayAccess().getFireIconKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalGreedySnake.g:4353:1: rule__FireInitDisplay__Group__1 : rule__FireInitDisplay__Group__1__Impl rule__FireInitDisplay__Group__2 ;
    public final void rule__FireInitDisplay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4357:1: ( rule__FireInitDisplay__Group__1__Impl rule__FireInitDisplay__Group__2 )
            // InternalGreedySnake.g:4358:2: rule__FireInitDisplay__Group__1__Impl rule__FireInitDisplay__Group__2
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
    // InternalGreedySnake.g:4365:1: rule__FireInitDisplay__Group__1__Impl : ( '{' ) ;
    public final void rule__FireInitDisplay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4369:1: ( ( '{' ) )
            // InternalGreedySnake.g:4370:1: ( '{' )
            {
            // InternalGreedySnake.g:4370:1: ( '{' )
            // InternalGreedySnake.g:4371:2: '{'
            {
             before(grammarAccess.getFireInitDisplayAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:4380:1: rule__FireInitDisplay__Group__2 : rule__FireInitDisplay__Group__2__Impl rule__FireInitDisplay__Group__3 ;
    public final void rule__FireInitDisplay__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4384:1: ( rule__FireInitDisplay__Group__2__Impl rule__FireInitDisplay__Group__3 )
            // InternalGreedySnake.g:4385:2: rule__FireInitDisplay__Group__2__Impl rule__FireInitDisplay__Group__3
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
    // InternalGreedySnake.g:4392:1: rule__FireInitDisplay__Group__2__Impl : ( ( rule__FireInitDisplay__FireIconAssignment_2 )* ) ;
    public final void rule__FireInitDisplay__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4396:1: ( ( ( rule__FireInitDisplay__FireIconAssignment_2 )* ) )
            // InternalGreedySnake.g:4397:1: ( ( rule__FireInitDisplay__FireIconAssignment_2 )* )
            {
            // InternalGreedySnake.g:4397:1: ( ( rule__FireInitDisplay__FireIconAssignment_2 )* )
            // InternalGreedySnake.g:4398:2: ( rule__FireInitDisplay__FireIconAssignment_2 )*
            {
             before(grammarAccess.getFireInitDisplayAccess().getFireIconAssignment_2()); 
            // InternalGreedySnake.g:4399:2: ( rule__FireInitDisplay__FireIconAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGreedySnake.g:4399:3: rule__FireInitDisplay__FireIconAssignment_2
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__FireInitDisplay__FireIconAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalGreedySnake.g:4407:1: rule__FireInitDisplay__Group__3 : rule__FireInitDisplay__Group__3__Impl rule__FireInitDisplay__Group__4 ;
    public final void rule__FireInitDisplay__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4411:1: ( rule__FireInitDisplay__Group__3__Impl rule__FireInitDisplay__Group__4 )
            // InternalGreedySnake.g:4412:2: rule__FireInitDisplay__Group__3__Impl rule__FireInitDisplay__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalGreedySnake.g:4419:1: rule__FireInitDisplay__Group__3__Impl : ( '}' ) ;
    public final void rule__FireInitDisplay__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4423:1: ( ( '}' ) )
            // InternalGreedySnake.g:4424:1: ( '}' )
            {
            // InternalGreedySnake.g:4424:1: ( '}' )
            // InternalGreedySnake.g:4425:2: '}'
            {
             before(grammarAccess.getFireInitDisplayAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:4434:1: rule__FireInitDisplay__Group__4 : rule__FireInitDisplay__Group__4__Impl rule__FireInitDisplay__Group__5 ;
    public final void rule__FireInitDisplay__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4438:1: ( rule__FireInitDisplay__Group__4__Impl rule__FireInitDisplay__Group__5 )
            // InternalGreedySnake.g:4439:2: rule__FireInitDisplay__Group__4__Impl rule__FireInitDisplay__Group__5
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
    // InternalGreedySnake.g:4446:1: rule__FireInitDisplay__Group__4__Impl : ( 'Icon_size' ) ;
    public final void rule__FireInitDisplay__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4450:1: ( ( 'Icon_size' ) )
            // InternalGreedySnake.g:4451:1: ( 'Icon_size' )
            {
            // InternalGreedySnake.g:4451:1: ( 'Icon_size' )
            // InternalGreedySnake.g:4452:2: 'Icon_size'
            {
             before(grammarAccess.getFireInitDisplayAccess().getIcon_sizeKeyword_4()); 
            match(input,53,FOLLOW_2); 
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
    // InternalGreedySnake.g:4461:1: rule__FireInitDisplay__Group__5 : rule__FireInitDisplay__Group__5__Impl rule__FireInitDisplay__Group__6 ;
    public final void rule__FireInitDisplay__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4465:1: ( rule__FireInitDisplay__Group__5__Impl rule__FireInitDisplay__Group__6 )
            // InternalGreedySnake.g:4466:2: rule__FireInitDisplay__Group__5__Impl rule__FireInitDisplay__Group__6
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
    // InternalGreedySnake.g:4473:1: rule__FireInitDisplay__Group__5__Impl : ( '=' ) ;
    public final void rule__FireInitDisplay__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4477:1: ( ( '=' ) )
            // InternalGreedySnake.g:4478:1: ( '=' )
            {
            // InternalGreedySnake.g:4478:1: ( '=' )
            // InternalGreedySnake.g:4479:2: '='
            {
             before(grammarAccess.getFireInitDisplayAccess().getEqualsSignKeyword_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:4488:1: rule__FireInitDisplay__Group__6 : rule__FireInitDisplay__Group__6__Impl ;
    public final void rule__FireInitDisplay__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4492:1: ( rule__FireInitDisplay__Group__6__Impl )
            // InternalGreedySnake.g:4493:2: rule__FireInitDisplay__Group__6__Impl
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
    // InternalGreedySnake.g:4499:1: rule__FireInitDisplay__Group__6__Impl : ( ( rule__FireInitDisplay__IconsizeAssignment_6 ) ) ;
    public final void rule__FireInitDisplay__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4503:1: ( ( ( rule__FireInitDisplay__IconsizeAssignment_6 ) ) )
            // InternalGreedySnake.g:4504:1: ( ( rule__FireInitDisplay__IconsizeAssignment_6 ) )
            {
            // InternalGreedySnake.g:4504:1: ( ( rule__FireInitDisplay__IconsizeAssignment_6 ) )
            // InternalGreedySnake.g:4505:2: ( rule__FireInitDisplay__IconsizeAssignment_6 )
            {
             before(grammarAccess.getFireInitDisplayAccess().getIconsizeAssignment_6()); 
            // InternalGreedySnake.g:4506:2: ( rule__FireInitDisplay__IconsizeAssignment_6 )
            // InternalGreedySnake.g:4506:3: rule__FireInitDisplay__IconsizeAssignment_6
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
    // InternalGreedySnake.g:4515:1: rule__SnakeInitDisplay__Group__0 : rule__SnakeInitDisplay__Group__0__Impl rule__SnakeInitDisplay__Group__1 ;
    public final void rule__SnakeInitDisplay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4519:1: ( rule__SnakeInitDisplay__Group__0__Impl rule__SnakeInitDisplay__Group__1 )
            // InternalGreedySnake.g:4520:2: rule__SnakeInitDisplay__Group__0__Impl rule__SnakeInitDisplay__Group__1
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
    // InternalGreedySnake.g:4527:1: rule__SnakeInitDisplay__Group__0__Impl : ( 'head' ) ;
    public final void rule__SnakeInitDisplay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4531:1: ( ( 'head' ) )
            // InternalGreedySnake.g:4532:1: ( 'head' )
            {
            // InternalGreedySnake.g:4532:1: ( 'head' )
            // InternalGreedySnake.g:4533:2: 'head'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getHeadKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalGreedySnake.g:4542:1: rule__SnakeInitDisplay__Group__1 : rule__SnakeInitDisplay__Group__1__Impl rule__SnakeInitDisplay__Group__2 ;
    public final void rule__SnakeInitDisplay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4546:1: ( rule__SnakeInitDisplay__Group__1__Impl rule__SnakeInitDisplay__Group__2 )
            // InternalGreedySnake.g:4547:2: rule__SnakeInitDisplay__Group__1__Impl rule__SnakeInitDisplay__Group__2
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
    // InternalGreedySnake.g:4554:1: rule__SnakeInitDisplay__Group__1__Impl : ( '=' ) ;
    public final void rule__SnakeInitDisplay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4558:1: ( ( '=' ) )
            // InternalGreedySnake.g:4559:1: ( '=' )
            {
            // InternalGreedySnake.g:4559:1: ( '=' )
            // InternalGreedySnake.g:4560:2: '='
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:4569:1: rule__SnakeInitDisplay__Group__2 : rule__SnakeInitDisplay__Group__2__Impl rule__SnakeInitDisplay__Group__3 ;
    public final void rule__SnakeInitDisplay__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4573:1: ( rule__SnakeInitDisplay__Group__2__Impl rule__SnakeInitDisplay__Group__3 )
            // InternalGreedySnake.g:4574:2: rule__SnakeInitDisplay__Group__2__Impl rule__SnakeInitDisplay__Group__3
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
    // InternalGreedySnake.g:4581:1: rule__SnakeInitDisplay__Group__2__Impl : ( ( rule__SnakeInitDisplay__HeadAssignment_2 ) ) ;
    public final void rule__SnakeInitDisplay__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4585:1: ( ( ( rule__SnakeInitDisplay__HeadAssignment_2 ) ) )
            // InternalGreedySnake.g:4586:1: ( ( rule__SnakeInitDisplay__HeadAssignment_2 ) )
            {
            // InternalGreedySnake.g:4586:1: ( ( rule__SnakeInitDisplay__HeadAssignment_2 ) )
            // InternalGreedySnake.g:4587:2: ( rule__SnakeInitDisplay__HeadAssignment_2 )
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getHeadAssignment_2()); 
            // InternalGreedySnake.g:4588:2: ( rule__SnakeInitDisplay__HeadAssignment_2 )
            // InternalGreedySnake.g:4588:3: rule__SnakeInitDisplay__HeadAssignment_2
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
    // InternalGreedySnake.g:4596:1: rule__SnakeInitDisplay__Group__3 : rule__SnakeInitDisplay__Group__3__Impl rule__SnakeInitDisplay__Group__4 ;
    public final void rule__SnakeInitDisplay__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4600:1: ( rule__SnakeInitDisplay__Group__3__Impl rule__SnakeInitDisplay__Group__4 )
            // InternalGreedySnake.g:4601:2: rule__SnakeInitDisplay__Group__3__Impl rule__SnakeInitDisplay__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalGreedySnake.g:4608:1: rule__SnakeInitDisplay__Group__3__Impl : ( ( rule__SnakeInitDisplay__Initial_xAssignment_3 ) ) ;
    public final void rule__SnakeInitDisplay__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4612:1: ( ( ( rule__SnakeInitDisplay__Initial_xAssignment_3 ) ) )
            // InternalGreedySnake.g:4613:1: ( ( rule__SnakeInitDisplay__Initial_xAssignment_3 ) )
            {
            // InternalGreedySnake.g:4613:1: ( ( rule__SnakeInitDisplay__Initial_xAssignment_3 ) )
            // InternalGreedySnake.g:4614:2: ( rule__SnakeInitDisplay__Initial_xAssignment_3 )
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getInitial_xAssignment_3()); 
            // InternalGreedySnake.g:4615:2: ( rule__SnakeInitDisplay__Initial_xAssignment_3 )
            // InternalGreedySnake.g:4615:3: rule__SnakeInitDisplay__Initial_xAssignment_3
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
    // InternalGreedySnake.g:4623:1: rule__SnakeInitDisplay__Group__4 : rule__SnakeInitDisplay__Group__4__Impl rule__SnakeInitDisplay__Group__5 ;
    public final void rule__SnakeInitDisplay__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4627:1: ( rule__SnakeInitDisplay__Group__4__Impl rule__SnakeInitDisplay__Group__5 )
            // InternalGreedySnake.g:4628:2: rule__SnakeInitDisplay__Group__4__Impl rule__SnakeInitDisplay__Group__5
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
    // InternalGreedySnake.g:4635:1: rule__SnakeInitDisplay__Group__4__Impl : ( ',' ) ;
    public final void rule__SnakeInitDisplay__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4639:1: ( ( ',' ) )
            // InternalGreedySnake.g:4640:1: ( ',' )
            {
            // InternalGreedySnake.g:4640:1: ( ',' )
            // InternalGreedySnake.g:4641:2: ','
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getCommaKeyword_4()); 
            match(input,55,FOLLOW_2); 
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
    // InternalGreedySnake.g:4650:1: rule__SnakeInitDisplay__Group__5 : rule__SnakeInitDisplay__Group__5__Impl rule__SnakeInitDisplay__Group__6 ;
    public final void rule__SnakeInitDisplay__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4654:1: ( rule__SnakeInitDisplay__Group__5__Impl rule__SnakeInitDisplay__Group__6 )
            // InternalGreedySnake.g:4655:2: rule__SnakeInitDisplay__Group__5__Impl rule__SnakeInitDisplay__Group__6
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
    // InternalGreedySnake.g:4662:1: rule__SnakeInitDisplay__Group__5__Impl : ( ( rule__SnakeInitDisplay__Initial_yAssignment_5 ) ) ;
    public final void rule__SnakeInitDisplay__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4666:1: ( ( ( rule__SnakeInitDisplay__Initial_yAssignment_5 ) ) )
            // InternalGreedySnake.g:4667:1: ( ( rule__SnakeInitDisplay__Initial_yAssignment_5 ) )
            {
            // InternalGreedySnake.g:4667:1: ( ( rule__SnakeInitDisplay__Initial_yAssignment_5 ) )
            // InternalGreedySnake.g:4668:2: ( rule__SnakeInitDisplay__Initial_yAssignment_5 )
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getInitial_yAssignment_5()); 
            // InternalGreedySnake.g:4669:2: ( rule__SnakeInitDisplay__Initial_yAssignment_5 )
            // InternalGreedySnake.g:4669:3: rule__SnakeInitDisplay__Initial_yAssignment_5
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
    // InternalGreedySnake.g:4677:1: rule__SnakeInitDisplay__Group__6 : rule__SnakeInitDisplay__Group__6__Impl rule__SnakeInitDisplay__Group__7 ;
    public final void rule__SnakeInitDisplay__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4681:1: ( rule__SnakeInitDisplay__Group__6__Impl rule__SnakeInitDisplay__Group__7 )
            // InternalGreedySnake.g:4682:2: rule__SnakeInitDisplay__Group__6__Impl rule__SnakeInitDisplay__Group__7
            {
            pushFollow(FOLLOW_44);
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
    // InternalGreedySnake.g:4689:1: rule__SnakeInitDisplay__Group__6__Impl : ( ')' ) ;
    public final void rule__SnakeInitDisplay__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4693:1: ( ( ')' ) )
            // InternalGreedySnake.g:4694:1: ( ')' )
            {
            // InternalGreedySnake.g:4694:1: ( ')' )
            // InternalGreedySnake.g:4695:2: ')'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getRightParenthesisKeyword_6()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGreedySnake.g:4704:1: rule__SnakeInitDisplay__Group__7 : rule__SnakeInitDisplay__Group__7__Impl rule__SnakeInitDisplay__Group__8 ;
    public final void rule__SnakeInitDisplay__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4708:1: ( rule__SnakeInitDisplay__Group__7__Impl rule__SnakeInitDisplay__Group__8 )
            // InternalGreedySnake.g:4709:2: rule__SnakeInitDisplay__Group__7__Impl rule__SnakeInitDisplay__Group__8
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
    // InternalGreedySnake.g:4716:1: rule__SnakeInitDisplay__Group__7__Impl : ( 'headIcon' ) ;
    public final void rule__SnakeInitDisplay__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4720:1: ( ( 'headIcon' ) )
            // InternalGreedySnake.g:4721:1: ( 'headIcon' )
            {
            // InternalGreedySnake.g:4721:1: ( 'headIcon' )
            // InternalGreedySnake.g:4722:2: 'headIcon'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getHeadIconKeyword_7()); 
            match(input,56,FOLLOW_2); 
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
    // InternalGreedySnake.g:4731:1: rule__SnakeInitDisplay__Group__8 : rule__SnakeInitDisplay__Group__8__Impl rule__SnakeInitDisplay__Group__9 ;
    public final void rule__SnakeInitDisplay__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4735:1: ( rule__SnakeInitDisplay__Group__8__Impl rule__SnakeInitDisplay__Group__9 )
            // InternalGreedySnake.g:4736:2: rule__SnakeInitDisplay__Group__8__Impl rule__SnakeInitDisplay__Group__9
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
    // InternalGreedySnake.g:4743:1: rule__SnakeInitDisplay__Group__8__Impl : ( '{' ) ;
    public final void rule__SnakeInitDisplay__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4747:1: ( ( '{' ) )
            // InternalGreedySnake.g:4748:1: ( '{' )
            {
            // InternalGreedySnake.g:4748:1: ( '{' )
            // InternalGreedySnake.g:4749:2: '{'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:4758:1: rule__SnakeInitDisplay__Group__9 : rule__SnakeInitDisplay__Group__9__Impl rule__SnakeInitDisplay__Group__10 ;
    public final void rule__SnakeInitDisplay__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4762:1: ( rule__SnakeInitDisplay__Group__9__Impl rule__SnakeInitDisplay__Group__10 )
            // InternalGreedySnake.g:4763:2: rule__SnakeInitDisplay__Group__9__Impl rule__SnakeInitDisplay__Group__10
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
    // InternalGreedySnake.g:4770:1: rule__SnakeInitDisplay__Group__9__Impl : ( ( rule__SnakeInitDisplay__HeadIconAssignment_9 )* ) ;
    public final void rule__SnakeInitDisplay__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4774:1: ( ( ( rule__SnakeInitDisplay__HeadIconAssignment_9 )* ) )
            // InternalGreedySnake.g:4775:1: ( ( rule__SnakeInitDisplay__HeadIconAssignment_9 )* )
            {
            // InternalGreedySnake.g:4775:1: ( ( rule__SnakeInitDisplay__HeadIconAssignment_9 )* )
            // InternalGreedySnake.g:4776:2: ( rule__SnakeInitDisplay__HeadIconAssignment_9 )*
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getHeadIconAssignment_9()); 
            // InternalGreedySnake.g:4777:2: ( rule__SnakeInitDisplay__HeadIconAssignment_9 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGreedySnake.g:4777:3: rule__SnakeInitDisplay__HeadIconAssignment_9
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__SnakeInitDisplay__HeadIconAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalGreedySnake.g:4785:1: rule__SnakeInitDisplay__Group__10 : rule__SnakeInitDisplay__Group__10__Impl rule__SnakeInitDisplay__Group__11 ;
    public final void rule__SnakeInitDisplay__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4789:1: ( rule__SnakeInitDisplay__Group__10__Impl rule__SnakeInitDisplay__Group__11 )
            // InternalGreedySnake.g:4790:2: rule__SnakeInitDisplay__Group__10__Impl rule__SnakeInitDisplay__Group__11
            {
            pushFollow(FOLLOW_42);
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
    // InternalGreedySnake.g:4797:1: rule__SnakeInitDisplay__Group__10__Impl : ( '}' ) ;
    public final void rule__SnakeInitDisplay__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4801:1: ( ( '}' ) )
            // InternalGreedySnake.g:4802:1: ( '}' )
            {
            // InternalGreedySnake.g:4802:1: ( '}' )
            // InternalGreedySnake.g:4803:2: '}'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getRightCurlyBracketKeyword_10()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:4812:1: rule__SnakeInitDisplay__Group__11 : rule__SnakeInitDisplay__Group__11__Impl rule__SnakeInitDisplay__Group__12 ;
    public final void rule__SnakeInitDisplay__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4816:1: ( rule__SnakeInitDisplay__Group__11__Impl rule__SnakeInitDisplay__Group__12 )
            // InternalGreedySnake.g:4817:2: rule__SnakeInitDisplay__Group__11__Impl rule__SnakeInitDisplay__Group__12
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
    // InternalGreedySnake.g:4824:1: rule__SnakeInitDisplay__Group__11__Impl : ( 'Icon_size' ) ;
    public final void rule__SnakeInitDisplay__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4828:1: ( ( 'Icon_size' ) )
            // InternalGreedySnake.g:4829:1: ( 'Icon_size' )
            {
            // InternalGreedySnake.g:4829:1: ( 'Icon_size' )
            // InternalGreedySnake.g:4830:2: 'Icon_size'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getIcon_sizeKeyword_11()); 
            match(input,53,FOLLOW_2); 
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
    // InternalGreedySnake.g:4839:1: rule__SnakeInitDisplay__Group__12 : rule__SnakeInitDisplay__Group__12__Impl rule__SnakeInitDisplay__Group__13 ;
    public final void rule__SnakeInitDisplay__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4843:1: ( rule__SnakeInitDisplay__Group__12__Impl rule__SnakeInitDisplay__Group__13 )
            // InternalGreedySnake.g:4844:2: rule__SnakeInitDisplay__Group__12__Impl rule__SnakeInitDisplay__Group__13
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
    // InternalGreedySnake.g:4851:1: rule__SnakeInitDisplay__Group__12__Impl : ( '=' ) ;
    public final void rule__SnakeInitDisplay__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4855:1: ( ( '=' ) )
            // InternalGreedySnake.g:4856:1: ( '=' )
            {
            // InternalGreedySnake.g:4856:1: ( '=' )
            // InternalGreedySnake.g:4857:2: '='
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_12()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:4866:1: rule__SnakeInitDisplay__Group__13 : rule__SnakeInitDisplay__Group__13__Impl rule__SnakeInitDisplay__Group__14 ;
    public final void rule__SnakeInitDisplay__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4870:1: ( rule__SnakeInitDisplay__Group__13__Impl rule__SnakeInitDisplay__Group__14 )
            // InternalGreedySnake.g:4871:2: rule__SnakeInitDisplay__Group__13__Impl rule__SnakeInitDisplay__Group__14
            {
            pushFollow(FOLLOW_45);
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
    // InternalGreedySnake.g:4878:1: rule__SnakeInitDisplay__Group__13__Impl : ( ( rule__SnakeInitDisplay__IconsizeAssignment_13 ) ) ;
    public final void rule__SnakeInitDisplay__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4882:1: ( ( ( rule__SnakeInitDisplay__IconsizeAssignment_13 ) ) )
            // InternalGreedySnake.g:4883:1: ( ( rule__SnakeInitDisplay__IconsizeAssignment_13 ) )
            {
            // InternalGreedySnake.g:4883:1: ( ( rule__SnakeInitDisplay__IconsizeAssignment_13 ) )
            // InternalGreedySnake.g:4884:2: ( rule__SnakeInitDisplay__IconsizeAssignment_13 )
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getIconsizeAssignment_13()); 
            // InternalGreedySnake.g:4885:2: ( rule__SnakeInitDisplay__IconsizeAssignment_13 )
            // InternalGreedySnake.g:4885:3: rule__SnakeInitDisplay__IconsizeAssignment_13
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
    // InternalGreedySnake.g:4893:1: rule__SnakeInitDisplay__Group__14 : rule__SnakeInitDisplay__Group__14__Impl rule__SnakeInitDisplay__Group__15 ;
    public final void rule__SnakeInitDisplay__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4897:1: ( rule__SnakeInitDisplay__Group__14__Impl rule__SnakeInitDisplay__Group__15 )
            // InternalGreedySnake.g:4898:2: rule__SnakeInitDisplay__Group__14__Impl rule__SnakeInitDisplay__Group__15
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
    // InternalGreedySnake.g:4905:1: rule__SnakeInitDisplay__Group__14__Impl : ( 'BodyIcon' ) ;
    public final void rule__SnakeInitDisplay__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4909:1: ( ( 'BodyIcon' ) )
            // InternalGreedySnake.g:4910:1: ( 'BodyIcon' )
            {
            // InternalGreedySnake.g:4910:1: ( 'BodyIcon' )
            // InternalGreedySnake.g:4911:2: 'BodyIcon'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getBodyIconKeyword_14()); 
            match(input,57,FOLLOW_2); 
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
    // InternalGreedySnake.g:4920:1: rule__SnakeInitDisplay__Group__15 : rule__SnakeInitDisplay__Group__15__Impl rule__SnakeInitDisplay__Group__16 ;
    public final void rule__SnakeInitDisplay__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4924:1: ( rule__SnakeInitDisplay__Group__15__Impl rule__SnakeInitDisplay__Group__16 )
            // InternalGreedySnake.g:4925:2: rule__SnakeInitDisplay__Group__15__Impl rule__SnakeInitDisplay__Group__16
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
    // InternalGreedySnake.g:4932:1: rule__SnakeInitDisplay__Group__15__Impl : ( '{' ) ;
    public final void rule__SnakeInitDisplay__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4936:1: ( ( '{' ) )
            // InternalGreedySnake.g:4937:1: ( '{' )
            {
            // InternalGreedySnake.g:4937:1: ( '{' )
            // InternalGreedySnake.g:4938:2: '{'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getLeftCurlyBracketKeyword_15()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:4947:1: rule__SnakeInitDisplay__Group__16 : rule__SnakeInitDisplay__Group__16__Impl rule__SnakeInitDisplay__Group__17 ;
    public final void rule__SnakeInitDisplay__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4951:1: ( rule__SnakeInitDisplay__Group__16__Impl rule__SnakeInitDisplay__Group__17 )
            // InternalGreedySnake.g:4952:2: rule__SnakeInitDisplay__Group__16__Impl rule__SnakeInitDisplay__Group__17
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
    // InternalGreedySnake.g:4959:1: rule__SnakeInitDisplay__Group__16__Impl : ( ( rule__SnakeInitDisplay__BodyIconAssignment_16 )* ) ;
    public final void rule__SnakeInitDisplay__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4963:1: ( ( ( rule__SnakeInitDisplay__BodyIconAssignment_16 )* ) )
            // InternalGreedySnake.g:4964:1: ( ( rule__SnakeInitDisplay__BodyIconAssignment_16 )* )
            {
            // InternalGreedySnake.g:4964:1: ( ( rule__SnakeInitDisplay__BodyIconAssignment_16 )* )
            // InternalGreedySnake.g:4965:2: ( rule__SnakeInitDisplay__BodyIconAssignment_16 )*
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getBodyIconAssignment_16()); 
            // InternalGreedySnake.g:4966:2: ( rule__SnakeInitDisplay__BodyIconAssignment_16 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGreedySnake.g:4966:3: rule__SnakeInitDisplay__BodyIconAssignment_16
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__SnakeInitDisplay__BodyIconAssignment_16();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalGreedySnake.g:4974:1: rule__SnakeInitDisplay__Group__17 : rule__SnakeInitDisplay__Group__17__Impl rule__SnakeInitDisplay__Group__18 ;
    public final void rule__SnakeInitDisplay__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4978:1: ( rule__SnakeInitDisplay__Group__17__Impl rule__SnakeInitDisplay__Group__18 )
            // InternalGreedySnake.g:4979:2: rule__SnakeInitDisplay__Group__17__Impl rule__SnakeInitDisplay__Group__18
            {
            pushFollow(FOLLOW_46);
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
    // InternalGreedySnake.g:4986:1: rule__SnakeInitDisplay__Group__17__Impl : ( '}' ) ;
    public final void rule__SnakeInitDisplay__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:4990:1: ( ( '}' ) )
            // InternalGreedySnake.g:4991:1: ( '}' )
            {
            // InternalGreedySnake.g:4991:1: ( '}' )
            // InternalGreedySnake.g:4992:2: '}'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getRightCurlyBracketKeyword_17()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:5001:1: rule__SnakeInitDisplay__Group__18 : rule__SnakeInitDisplay__Group__18__Impl rule__SnakeInitDisplay__Group__19 ;
    public final void rule__SnakeInitDisplay__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5005:1: ( rule__SnakeInitDisplay__Group__18__Impl rule__SnakeInitDisplay__Group__19 )
            // InternalGreedySnake.g:5006:2: rule__SnakeInitDisplay__Group__18__Impl rule__SnakeInitDisplay__Group__19
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
    // InternalGreedySnake.g:5013:1: rule__SnakeInitDisplay__Group__18__Impl : ( 'defaultSpeed' ) ;
    public final void rule__SnakeInitDisplay__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5017:1: ( ( 'defaultSpeed' ) )
            // InternalGreedySnake.g:5018:1: ( 'defaultSpeed' )
            {
            // InternalGreedySnake.g:5018:1: ( 'defaultSpeed' )
            // InternalGreedySnake.g:5019:2: 'defaultSpeed'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getDefaultSpeedKeyword_18()); 
            match(input,58,FOLLOW_2); 
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
    // InternalGreedySnake.g:5028:1: rule__SnakeInitDisplay__Group__19 : rule__SnakeInitDisplay__Group__19__Impl rule__SnakeInitDisplay__Group__20 ;
    public final void rule__SnakeInitDisplay__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5032:1: ( rule__SnakeInitDisplay__Group__19__Impl rule__SnakeInitDisplay__Group__20 )
            // InternalGreedySnake.g:5033:2: rule__SnakeInitDisplay__Group__19__Impl rule__SnakeInitDisplay__Group__20
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
    // InternalGreedySnake.g:5040:1: rule__SnakeInitDisplay__Group__19__Impl : ( '=' ) ;
    public final void rule__SnakeInitDisplay__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5044:1: ( ( '=' ) )
            // InternalGreedySnake.g:5045:1: ( '=' )
            {
            // InternalGreedySnake.g:5045:1: ( '=' )
            // InternalGreedySnake.g:5046:2: '='
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_19()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:5055:1: rule__SnakeInitDisplay__Group__20 : rule__SnakeInitDisplay__Group__20__Impl rule__SnakeInitDisplay__Group__21 ;
    public final void rule__SnakeInitDisplay__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5059:1: ( rule__SnakeInitDisplay__Group__20__Impl rule__SnakeInitDisplay__Group__21 )
            // InternalGreedySnake.g:5060:2: rule__SnakeInitDisplay__Group__20__Impl rule__SnakeInitDisplay__Group__21
            {
            pushFollow(FOLLOW_47);
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
    // InternalGreedySnake.g:5067:1: rule__SnakeInitDisplay__Group__20__Impl : ( ( rule__SnakeInitDisplay__DefaultSpeedAssignment_20 ) ) ;
    public final void rule__SnakeInitDisplay__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5071:1: ( ( ( rule__SnakeInitDisplay__DefaultSpeedAssignment_20 ) ) )
            // InternalGreedySnake.g:5072:1: ( ( rule__SnakeInitDisplay__DefaultSpeedAssignment_20 ) )
            {
            // InternalGreedySnake.g:5072:1: ( ( rule__SnakeInitDisplay__DefaultSpeedAssignment_20 ) )
            // InternalGreedySnake.g:5073:2: ( rule__SnakeInitDisplay__DefaultSpeedAssignment_20 )
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getDefaultSpeedAssignment_20()); 
            // InternalGreedySnake.g:5074:2: ( rule__SnakeInitDisplay__DefaultSpeedAssignment_20 )
            // InternalGreedySnake.g:5074:3: rule__SnakeInitDisplay__DefaultSpeedAssignment_20
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
    // InternalGreedySnake.g:5082:1: rule__SnakeInitDisplay__Group__21 : rule__SnakeInitDisplay__Group__21__Impl rule__SnakeInitDisplay__Group__22 ;
    public final void rule__SnakeInitDisplay__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5086:1: ( rule__SnakeInitDisplay__Group__21__Impl rule__SnakeInitDisplay__Group__22 )
            // InternalGreedySnake.g:5087:2: rule__SnakeInitDisplay__Group__21__Impl rule__SnakeInitDisplay__Group__22
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
    // InternalGreedySnake.g:5094:1: rule__SnakeInitDisplay__Group__21__Impl : ( 'snakeTag' ) ;
    public final void rule__SnakeInitDisplay__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5098:1: ( ( 'snakeTag' ) )
            // InternalGreedySnake.g:5099:1: ( 'snakeTag' )
            {
            // InternalGreedySnake.g:5099:1: ( 'snakeTag' )
            // InternalGreedySnake.g:5100:2: 'snakeTag'
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getSnakeTagKeyword_21()); 
            match(input,59,FOLLOW_2); 
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
    // InternalGreedySnake.g:5109:1: rule__SnakeInitDisplay__Group__22 : rule__SnakeInitDisplay__Group__22__Impl rule__SnakeInitDisplay__Group__23 ;
    public final void rule__SnakeInitDisplay__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5113:1: ( rule__SnakeInitDisplay__Group__22__Impl rule__SnakeInitDisplay__Group__23 )
            // InternalGreedySnake.g:5114:2: rule__SnakeInitDisplay__Group__22__Impl rule__SnakeInitDisplay__Group__23
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
    // InternalGreedySnake.g:5121:1: rule__SnakeInitDisplay__Group__22__Impl : ( '=' ) ;
    public final void rule__SnakeInitDisplay__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5125:1: ( ( '=' ) )
            // InternalGreedySnake.g:5126:1: ( '=' )
            {
            // InternalGreedySnake.g:5126:1: ( '=' )
            // InternalGreedySnake.g:5127:2: '='
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_22()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:5136:1: rule__SnakeInitDisplay__Group__23 : rule__SnakeInitDisplay__Group__23__Impl ;
    public final void rule__SnakeInitDisplay__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5140:1: ( rule__SnakeInitDisplay__Group__23__Impl )
            // InternalGreedySnake.g:5141:2: rule__SnakeInitDisplay__Group__23__Impl
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
    // InternalGreedySnake.g:5147:1: rule__SnakeInitDisplay__Group__23__Impl : ( ( rule__SnakeInitDisplay__SnakeTagAssignment_23 ) ) ;
    public final void rule__SnakeInitDisplay__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5151:1: ( ( ( rule__SnakeInitDisplay__SnakeTagAssignment_23 ) ) )
            // InternalGreedySnake.g:5152:1: ( ( rule__SnakeInitDisplay__SnakeTagAssignment_23 ) )
            {
            // InternalGreedySnake.g:5152:1: ( ( rule__SnakeInitDisplay__SnakeTagAssignment_23 ) )
            // InternalGreedySnake.g:5153:2: ( rule__SnakeInitDisplay__SnakeTagAssignment_23 )
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getSnakeTagAssignment_23()); 
            // InternalGreedySnake.g:5154:2: ( rule__SnakeInitDisplay__SnakeTagAssignment_23 )
            // InternalGreedySnake.g:5154:3: rule__SnakeInitDisplay__SnakeTagAssignment_23
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
    // InternalGreedySnake.g:5163:1: rule__IconTag__Group__0 : rule__IconTag__Group__0__Impl rule__IconTag__Group__1 ;
    public final void rule__IconTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5167:1: ( rule__IconTag__Group__0__Impl rule__IconTag__Group__1 )
            // InternalGreedySnake.g:5168:2: rule__IconTag__Group__0__Impl rule__IconTag__Group__1
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
    // InternalGreedySnake.g:5175:1: rule__IconTag__Group__0__Impl : ( ( rule__IconTag__NameAssignment_0 ) ) ;
    public final void rule__IconTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5179:1: ( ( ( rule__IconTag__NameAssignment_0 ) ) )
            // InternalGreedySnake.g:5180:1: ( ( rule__IconTag__NameAssignment_0 ) )
            {
            // InternalGreedySnake.g:5180:1: ( ( rule__IconTag__NameAssignment_0 ) )
            // InternalGreedySnake.g:5181:2: ( rule__IconTag__NameAssignment_0 )
            {
             before(grammarAccess.getIconTagAccess().getNameAssignment_0()); 
            // InternalGreedySnake.g:5182:2: ( rule__IconTag__NameAssignment_0 )
            // InternalGreedySnake.g:5182:3: rule__IconTag__NameAssignment_0
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
    // InternalGreedySnake.g:5190:1: rule__IconTag__Group__1 : rule__IconTag__Group__1__Impl rule__IconTag__Group__2 ;
    public final void rule__IconTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5194:1: ( rule__IconTag__Group__1__Impl rule__IconTag__Group__2 )
            // InternalGreedySnake.g:5195:2: rule__IconTag__Group__1__Impl rule__IconTag__Group__2
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
    // InternalGreedySnake.g:5202:1: rule__IconTag__Group__1__Impl : ( ( rule__IconTag__ValueAssignment_1 ) ) ;
    public final void rule__IconTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5206:1: ( ( ( rule__IconTag__ValueAssignment_1 ) ) )
            // InternalGreedySnake.g:5207:1: ( ( rule__IconTag__ValueAssignment_1 ) )
            {
            // InternalGreedySnake.g:5207:1: ( ( rule__IconTag__ValueAssignment_1 ) )
            // InternalGreedySnake.g:5208:2: ( rule__IconTag__ValueAssignment_1 )
            {
             before(grammarAccess.getIconTagAccess().getValueAssignment_1()); 
            // InternalGreedySnake.g:5209:2: ( rule__IconTag__ValueAssignment_1 )
            // InternalGreedySnake.g:5209:3: rule__IconTag__ValueAssignment_1
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
    // InternalGreedySnake.g:5217:1: rule__IconTag__Group__2 : rule__IconTag__Group__2__Impl rule__IconTag__Group__3 ;
    public final void rule__IconTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5221:1: ( rule__IconTag__Group__2__Impl rule__IconTag__Group__3 )
            // InternalGreedySnake.g:5222:2: rule__IconTag__Group__2__Impl rule__IconTag__Group__3
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
    // InternalGreedySnake.g:5229:1: rule__IconTag__Group__2__Impl : ( '=' ) ;
    public final void rule__IconTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5233:1: ( ( '=' ) )
            // InternalGreedySnake.g:5234:1: ( '=' )
            {
            // InternalGreedySnake.g:5234:1: ( '=' )
            // InternalGreedySnake.g:5235:2: '='
            {
             before(grammarAccess.getIconTagAccess().getEqualsSignKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:5244:1: rule__IconTag__Group__3 : rule__IconTag__Group__3__Impl rule__IconTag__Group__4 ;
    public final void rule__IconTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5248:1: ( rule__IconTag__Group__3__Impl rule__IconTag__Group__4 )
            // InternalGreedySnake.g:5249:2: rule__IconTag__Group__3__Impl rule__IconTag__Group__4
            {
            pushFollow(FOLLOW_48);
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
    // InternalGreedySnake.g:5256:1: rule__IconTag__Group__3__Impl : ( ( rule__IconTag__TagAssignment_3 ) ) ;
    public final void rule__IconTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5260:1: ( ( ( rule__IconTag__TagAssignment_3 ) ) )
            // InternalGreedySnake.g:5261:1: ( ( rule__IconTag__TagAssignment_3 ) )
            {
            // InternalGreedySnake.g:5261:1: ( ( rule__IconTag__TagAssignment_3 ) )
            // InternalGreedySnake.g:5262:2: ( rule__IconTag__TagAssignment_3 )
            {
             before(grammarAccess.getIconTagAccess().getTagAssignment_3()); 
            // InternalGreedySnake.g:5263:2: ( rule__IconTag__TagAssignment_3 )
            // InternalGreedySnake.g:5263:3: rule__IconTag__TagAssignment_3
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
    // InternalGreedySnake.g:5271:1: rule__IconTag__Group__4 : rule__IconTag__Group__4__Impl rule__IconTag__Group__5 ;
    public final void rule__IconTag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5275:1: ( rule__IconTag__Group__4__Impl rule__IconTag__Group__5 )
            // InternalGreedySnake.g:5276:2: rule__IconTag__Group__4__Impl rule__IconTag__Group__5
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
    // InternalGreedySnake.g:5283:1: rule__IconTag__Group__4__Impl : ( 'Locate' ) ;
    public final void rule__IconTag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5287:1: ( ( 'Locate' ) )
            // InternalGreedySnake.g:5288:1: ( 'Locate' )
            {
            // InternalGreedySnake.g:5288:1: ( 'Locate' )
            // InternalGreedySnake.g:5289:2: 'Locate'
            {
             before(grammarAccess.getIconTagAccess().getLocateKeyword_4()); 
            match(input,60,FOLLOW_2); 
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
    // InternalGreedySnake.g:5298:1: rule__IconTag__Group__5 : rule__IconTag__Group__5__Impl rule__IconTag__Group__6 ;
    public final void rule__IconTag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5302:1: ( rule__IconTag__Group__5__Impl rule__IconTag__Group__6 )
            // InternalGreedySnake.g:5303:2: rule__IconTag__Group__5__Impl rule__IconTag__Group__6
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
    // InternalGreedySnake.g:5310:1: rule__IconTag__Group__5__Impl : ( ':' ) ;
    public final void rule__IconTag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5314:1: ( ( ':' ) )
            // InternalGreedySnake.g:5315:1: ( ':' )
            {
            // InternalGreedySnake.g:5315:1: ( ':' )
            // InternalGreedySnake.g:5316:2: ':'
            {
             before(grammarAccess.getIconTagAccess().getColonKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGreedySnake.g:5325:1: rule__IconTag__Group__6 : rule__IconTag__Group__6__Impl ;
    public final void rule__IconTag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5329:1: ( rule__IconTag__Group__6__Impl )
            // InternalGreedySnake.g:5330:2: rule__IconTag__Group__6__Impl
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
    // InternalGreedySnake.g:5336:1: rule__IconTag__Group__6__Impl : ( ( rule__IconTag__LocateAssignment_6 ) ) ;
    public final void rule__IconTag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5340:1: ( ( ( rule__IconTag__LocateAssignment_6 ) ) )
            // InternalGreedySnake.g:5341:1: ( ( rule__IconTag__LocateAssignment_6 ) )
            {
            // InternalGreedySnake.g:5341:1: ( ( rule__IconTag__LocateAssignment_6 ) )
            // InternalGreedySnake.g:5342:2: ( rule__IconTag__LocateAssignment_6 )
            {
             before(grammarAccess.getIconTagAccess().getLocateAssignment_6()); 
            // InternalGreedySnake.g:5343:2: ( rule__IconTag__LocateAssignment_6 )
            // InternalGreedySnake.g:5343:3: rule__IconTag__LocateAssignment_6
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
    // InternalGreedySnake.g:5352:1: rule__FoodInitDisplay__Group__0 : rule__FoodInitDisplay__Group__0__Impl rule__FoodInitDisplay__Group__1 ;
    public final void rule__FoodInitDisplay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5356:1: ( rule__FoodInitDisplay__Group__0__Impl rule__FoodInitDisplay__Group__1 )
            // InternalGreedySnake.g:5357:2: rule__FoodInitDisplay__Group__0__Impl rule__FoodInitDisplay__Group__1
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
    // InternalGreedySnake.g:5364:1: rule__FoodInitDisplay__Group__0__Impl : ( 'foodIcon' ) ;
    public final void rule__FoodInitDisplay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5368:1: ( ( 'foodIcon' ) )
            // InternalGreedySnake.g:5369:1: ( 'foodIcon' )
            {
            // InternalGreedySnake.g:5369:1: ( 'foodIcon' )
            // InternalGreedySnake.g:5370:2: 'foodIcon'
            {
             before(grammarAccess.getFoodInitDisplayAccess().getFoodIconKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalGreedySnake.g:5379:1: rule__FoodInitDisplay__Group__1 : rule__FoodInitDisplay__Group__1__Impl rule__FoodInitDisplay__Group__2 ;
    public final void rule__FoodInitDisplay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5383:1: ( rule__FoodInitDisplay__Group__1__Impl rule__FoodInitDisplay__Group__2 )
            // InternalGreedySnake.g:5384:2: rule__FoodInitDisplay__Group__1__Impl rule__FoodInitDisplay__Group__2
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
    // InternalGreedySnake.g:5391:1: rule__FoodInitDisplay__Group__1__Impl : ( '{' ) ;
    public final void rule__FoodInitDisplay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5395:1: ( ( '{' ) )
            // InternalGreedySnake.g:5396:1: ( '{' )
            {
            // InternalGreedySnake.g:5396:1: ( '{' )
            // InternalGreedySnake.g:5397:2: '{'
            {
             before(grammarAccess.getFoodInitDisplayAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:5406:1: rule__FoodInitDisplay__Group__2 : rule__FoodInitDisplay__Group__2__Impl rule__FoodInitDisplay__Group__3 ;
    public final void rule__FoodInitDisplay__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5410:1: ( rule__FoodInitDisplay__Group__2__Impl rule__FoodInitDisplay__Group__3 )
            // InternalGreedySnake.g:5411:2: rule__FoodInitDisplay__Group__2__Impl rule__FoodInitDisplay__Group__3
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
    // InternalGreedySnake.g:5418:1: rule__FoodInitDisplay__Group__2__Impl : ( ( rule__FoodInitDisplay__FoodIconAssignment_2 )* ) ;
    public final void rule__FoodInitDisplay__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5422:1: ( ( ( rule__FoodInitDisplay__FoodIconAssignment_2 )* ) )
            // InternalGreedySnake.g:5423:1: ( ( rule__FoodInitDisplay__FoodIconAssignment_2 )* )
            {
            // InternalGreedySnake.g:5423:1: ( ( rule__FoodInitDisplay__FoodIconAssignment_2 )* )
            // InternalGreedySnake.g:5424:2: ( rule__FoodInitDisplay__FoodIconAssignment_2 )*
            {
             before(grammarAccess.getFoodInitDisplayAccess().getFoodIconAssignment_2()); 
            // InternalGreedySnake.g:5425:2: ( rule__FoodInitDisplay__FoodIconAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGreedySnake.g:5425:3: rule__FoodInitDisplay__FoodIconAssignment_2
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__FoodInitDisplay__FoodIconAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalGreedySnake.g:5433:1: rule__FoodInitDisplay__Group__3 : rule__FoodInitDisplay__Group__3__Impl rule__FoodInitDisplay__Group__4 ;
    public final void rule__FoodInitDisplay__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5437:1: ( rule__FoodInitDisplay__Group__3__Impl rule__FoodInitDisplay__Group__4 )
            // InternalGreedySnake.g:5438:2: rule__FoodInitDisplay__Group__3__Impl rule__FoodInitDisplay__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalGreedySnake.g:5445:1: rule__FoodInitDisplay__Group__3__Impl : ( '}' ) ;
    public final void rule__FoodInitDisplay__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5449:1: ( ( '}' ) )
            // InternalGreedySnake.g:5450:1: ( '}' )
            {
            // InternalGreedySnake.g:5450:1: ( '}' )
            // InternalGreedySnake.g:5451:2: '}'
            {
             before(grammarAccess.getFoodInitDisplayAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:5460:1: rule__FoodInitDisplay__Group__4 : rule__FoodInitDisplay__Group__4__Impl rule__FoodInitDisplay__Group__5 ;
    public final void rule__FoodInitDisplay__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5464:1: ( rule__FoodInitDisplay__Group__4__Impl rule__FoodInitDisplay__Group__5 )
            // InternalGreedySnake.g:5465:2: rule__FoodInitDisplay__Group__4__Impl rule__FoodInitDisplay__Group__5
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
    // InternalGreedySnake.g:5472:1: rule__FoodInitDisplay__Group__4__Impl : ( 'Icon_size' ) ;
    public final void rule__FoodInitDisplay__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5476:1: ( ( 'Icon_size' ) )
            // InternalGreedySnake.g:5477:1: ( 'Icon_size' )
            {
            // InternalGreedySnake.g:5477:1: ( 'Icon_size' )
            // InternalGreedySnake.g:5478:2: 'Icon_size'
            {
             before(grammarAccess.getFoodInitDisplayAccess().getIcon_sizeKeyword_4()); 
            match(input,53,FOLLOW_2); 
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
    // InternalGreedySnake.g:5487:1: rule__FoodInitDisplay__Group__5 : rule__FoodInitDisplay__Group__5__Impl rule__FoodInitDisplay__Group__6 ;
    public final void rule__FoodInitDisplay__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5491:1: ( rule__FoodInitDisplay__Group__5__Impl rule__FoodInitDisplay__Group__6 )
            // InternalGreedySnake.g:5492:2: rule__FoodInitDisplay__Group__5__Impl rule__FoodInitDisplay__Group__6
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
    // InternalGreedySnake.g:5499:1: rule__FoodInitDisplay__Group__5__Impl : ( '=' ) ;
    public final void rule__FoodInitDisplay__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5503:1: ( ( '=' ) )
            // InternalGreedySnake.g:5504:1: ( '=' )
            {
            // InternalGreedySnake.g:5504:1: ( '=' )
            // InternalGreedySnake.g:5505:2: '='
            {
             before(grammarAccess.getFoodInitDisplayAccess().getEqualsSignKeyword_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:5514:1: rule__FoodInitDisplay__Group__6 : rule__FoodInitDisplay__Group__6__Impl rule__FoodInitDisplay__Group__7 ;
    public final void rule__FoodInitDisplay__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5518:1: ( rule__FoodInitDisplay__Group__6__Impl rule__FoodInitDisplay__Group__7 )
            // InternalGreedySnake.g:5519:2: rule__FoodInitDisplay__Group__6__Impl rule__FoodInitDisplay__Group__7
            {
            pushFollow(FOLLOW_49);
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
    // InternalGreedySnake.g:5526:1: rule__FoodInitDisplay__Group__6__Impl : ( ( rule__FoodInitDisplay__IconsizeAssignment_6 ) ) ;
    public final void rule__FoodInitDisplay__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5530:1: ( ( ( rule__FoodInitDisplay__IconsizeAssignment_6 ) ) )
            // InternalGreedySnake.g:5531:1: ( ( rule__FoodInitDisplay__IconsizeAssignment_6 ) )
            {
            // InternalGreedySnake.g:5531:1: ( ( rule__FoodInitDisplay__IconsizeAssignment_6 ) )
            // InternalGreedySnake.g:5532:2: ( rule__FoodInitDisplay__IconsizeAssignment_6 )
            {
             before(grammarAccess.getFoodInitDisplayAccess().getIconsizeAssignment_6()); 
            // InternalGreedySnake.g:5533:2: ( rule__FoodInitDisplay__IconsizeAssignment_6 )
            // InternalGreedySnake.g:5533:3: rule__FoodInitDisplay__IconsizeAssignment_6
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
    // InternalGreedySnake.g:5541:1: rule__FoodInitDisplay__Group__7 : rule__FoodInitDisplay__Group__7__Impl rule__FoodInitDisplay__Group__8 ;
    public final void rule__FoodInitDisplay__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5545:1: ( rule__FoodInitDisplay__Group__7__Impl rule__FoodInitDisplay__Group__8 )
            // InternalGreedySnake.g:5546:2: rule__FoodInitDisplay__Group__7__Impl rule__FoodInitDisplay__Group__8
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
    // InternalGreedySnake.g:5553:1: rule__FoodInitDisplay__Group__7__Impl : ( 'foodKind' ) ;
    public final void rule__FoodInitDisplay__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5557:1: ( ( 'foodKind' ) )
            // InternalGreedySnake.g:5558:1: ( 'foodKind' )
            {
            // InternalGreedySnake.g:5558:1: ( 'foodKind' )
            // InternalGreedySnake.g:5559:2: 'foodKind'
            {
             before(grammarAccess.getFoodInitDisplayAccess().getFoodKindKeyword_7()); 
            match(input,62,FOLLOW_2); 
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
    // InternalGreedySnake.g:5568:1: rule__FoodInitDisplay__Group__8 : rule__FoodInitDisplay__Group__8__Impl rule__FoodInitDisplay__Group__9 ;
    public final void rule__FoodInitDisplay__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5572:1: ( rule__FoodInitDisplay__Group__8__Impl rule__FoodInitDisplay__Group__9 )
            // InternalGreedySnake.g:5573:2: rule__FoodInitDisplay__Group__8__Impl rule__FoodInitDisplay__Group__9
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
    // InternalGreedySnake.g:5580:1: rule__FoodInitDisplay__Group__8__Impl : ( '{' ) ;
    public final void rule__FoodInitDisplay__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5584:1: ( ( '{' ) )
            // InternalGreedySnake.g:5585:1: ( '{' )
            {
            // InternalGreedySnake.g:5585:1: ( '{' )
            // InternalGreedySnake.g:5586:2: '{'
            {
             before(grammarAccess.getFoodInitDisplayAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:5595:1: rule__FoodInitDisplay__Group__9 : rule__FoodInitDisplay__Group__9__Impl rule__FoodInitDisplay__Group__10 ;
    public final void rule__FoodInitDisplay__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5599:1: ( rule__FoodInitDisplay__Group__9__Impl rule__FoodInitDisplay__Group__10 )
            // InternalGreedySnake.g:5600:2: rule__FoodInitDisplay__Group__9__Impl rule__FoodInitDisplay__Group__10
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
    // InternalGreedySnake.g:5607:1: rule__FoodInitDisplay__Group__9__Impl : ( ( rule__FoodInitDisplay__FoodKindAssignment_9 )* ) ;
    public final void rule__FoodInitDisplay__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5611:1: ( ( ( rule__FoodInitDisplay__FoodKindAssignment_9 )* ) )
            // InternalGreedySnake.g:5612:1: ( ( rule__FoodInitDisplay__FoodKindAssignment_9 )* )
            {
            // InternalGreedySnake.g:5612:1: ( ( rule__FoodInitDisplay__FoodKindAssignment_9 )* )
            // InternalGreedySnake.g:5613:2: ( rule__FoodInitDisplay__FoodKindAssignment_9 )*
            {
             before(grammarAccess.getFoodInitDisplayAccess().getFoodKindAssignment_9()); 
            // InternalGreedySnake.g:5614:2: ( rule__FoodInitDisplay__FoodKindAssignment_9 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGreedySnake.g:5614:3: rule__FoodInitDisplay__FoodKindAssignment_9
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__FoodInitDisplay__FoodKindAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalGreedySnake.g:5622:1: rule__FoodInitDisplay__Group__10 : rule__FoodInitDisplay__Group__10__Impl rule__FoodInitDisplay__Group__11 ;
    public final void rule__FoodInitDisplay__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5626:1: ( rule__FoodInitDisplay__Group__10__Impl rule__FoodInitDisplay__Group__11 )
            // InternalGreedySnake.g:5627:2: rule__FoodInitDisplay__Group__10__Impl rule__FoodInitDisplay__Group__11
            {
            pushFollow(FOLLOW_50);
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
    // InternalGreedySnake.g:5634:1: rule__FoodInitDisplay__Group__10__Impl : ( '}' ) ;
    public final void rule__FoodInitDisplay__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5638:1: ( ( '}' ) )
            // InternalGreedySnake.g:5639:1: ( '}' )
            {
            // InternalGreedySnake.g:5639:1: ( '}' )
            // InternalGreedySnake.g:5640:2: '}'
            {
             before(grammarAccess.getFoodInitDisplayAccess().getRightCurlyBracketKeyword_10()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:5649:1: rule__FoodInitDisplay__Group__11 : rule__FoodInitDisplay__Group__11__Impl rule__FoodInitDisplay__Group__12 ;
    public final void rule__FoodInitDisplay__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5653:1: ( rule__FoodInitDisplay__Group__11__Impl rule__FoodInitDisplay__Group__12 )
            // InternalGreedySnake.g:5654:2: rule__FoodInitDisplay__Group__11__Impl rule__FoodInitDisplay__Group__12
            {
            pushFollow(FOLLOW_51);
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
    // InternalGreedySnake.g:5661:1: rule__FoodInitDisplay__Group__11__Impl : ( 'randomFoodSize' ) ;
    public final void rule__FoodInitDisplay__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5665:1: ( ( 'randomFoodSize' ) )
            // InternalGreedySnake.g:5666:1: ( 'randomFoodSize' )
            {
            // InternalGreedySnake.g:5666:1: ( 'randomFoodSize' )
            // InternalGreedySnake.g:5667:2: 'randomFoodSize'
            {
             before(grammarAccess.getFoodInitDisplayAccess().getRandomFoodSizeKeyword_11()); 
            match(input,63,FOLLOW_2); 
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
    // InternalGreedySnake.g:5676:1: rule__FoodInitDisplay__Group__12 : rule__FoodInitDisplay__Group__12__Impl rule__FoodInitDisplay__Group__13 ;
    public final void rule__FoodInitDisplay__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5680:1: ( rule__FoodInitDisplay__Group__12__Impl rule__FoodInitDisplay__Group__13 )
            // InternalGreedySnake.g:5681:2: rule__FoodInitDisplay__Group__12__Impl rule__FoodInitDisplay__Group__13
            {
            pushFollow(FOLLOW_52);
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
    // InternalGreedySnake.g:5688:1: rule__FoodInitDisplay__Group__12__Impl : ( ( rule__FoodInitDisplay__ProduceAssignment_12 ) ) ;
    public final void rule__FoodInitDisplay__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5692:1: ( ( ( rule__FoodInitDisplay__ProduceAssignment_12 ) ) )
            // InternalGreedySnake.g:5693:1: ( ( rule__FoodInitDisplay__ProduceAssignment_12 ) )
            {
            // InternalGreedySnake.g:5693:1: ( ( rule__FoodInitDisplay__ProduceAssignment_12 ) )
            // InternalGreedySnake.g:5694:2: ( rule__FoodInitDisplay__ProduceAssignment_12 )
            {
             before(grammarAccess.getFoodInitDisplayAccess().getProduceAssignment_12()); 
            // InternalGreedySnake.g:5695:2: ( rule__FoodInitDisplay__ProduceAssignment_12 )
            // InternalGreedySnake.g:5695:3: rule__FoodInitDisplay__ProduceAssignment_12
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
    // InternalGreedySnake.g:5703:1: rule__FoodInitDisplay__Group__13 : rule__FoodInitDisplay__Group__13__Impl rule__FoodInitDisplay__Group__14 ;
    public final void rule__FoodInitDisplay__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5707:1: ( rule__FoodInitDisplay__Group__13__Impl rule__FoodInitDisplay__Group__14 )
            // InternalGreedySnake.g:5708:2: rule__FoodInitDisplay__Group__13__Impl rule__FoodInitDisplay__Group__14
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
    // InternalGreedySnake.g:5715:1: rule__FoodInitDisplay__Group__13__Impl : ( 'foodTag' ) ;
    public final void rule__FoodInitDisplay__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5719:1: ( ( 'foodTag' ) )
            // InternalGreedySnake.g:5720:1: ( 'foodTag' )
            {
            // InternalGreedySnake.g:5720:1: ( 'foodTag' )
            // InternalGreedySnake.g:5721:2: 'foodTag'
            {
             before(grammarAccess.getFoodInitDisplayAccess().getFoodTagKeyword_13()); 
            match(input,64,FOLLOW_2); 
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
    // InternalGreedySnake.g:5730:1: rule__FoodInitDisplay__Group__14 : rule__FoodInitDisplay__Group__14__Impl rule__FoodInitDisplay__Group__15 ;
    public final void rule__FoodInitDisplay__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5734:1: ( rule__FoodInitDisplay__Group__14__Impl rule__FoodInitDisplay__Group__15 )
            // InternalGreedySnake.g:5735:2: rule__FoodInitDisplay__Group__14__Impl rule__FoodInitDisplay__Group__15
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
    // InternalGreedySnake.g:5742:1: rule__FoodInitDisplay__Group__14__Impl : ( '=' ) ;
    public final void rule__FoodInitDisplay__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5746:1: ( ( '=' ) )
            // InternalGreedySnake.g:5747:1: ( '=' )
            {
            // InternalGreedySnake.g:5747:1: ( '=' )
            // InternalGreedySnake.g:5748:2: '='
            {
             before(grammarAccess.getFoodInitDisplayAccess().getEqualsSignKeyword_14()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:5757:1: rule__FoodInitDisplay__Group__15 : rule__FoodInitDisplay__Group__15__Impl ;
    public final void rule__FoodInitDisplay__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5761:1: ( rule__FoodInitDisplay__Group__15__Impl )
            // InternalGreedySnake.g:5762:2: rule__FoodInitDisplay__Group__15__Impl
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
    // InternalGreedySnake.g:5768:1: rule__FoodInitDisplay__Group__15__Impl : ( ( rule__FoodInitDisplay__FoodTagAssignment_15 ) ) ;
    public final void rule__FoodInitDisplay__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5772:1: ( ( ( rule__FoodInitDisplay__FoodTagAssignment_15 ) ) )
            // InternalGreedySnake.g:5773:1: ( ( rule__FoodInitDisplay__FoodTagAssignment_15 ) )
            {
            // InternalGreedySnake.g:5773:1: ( ( rule__FoodInitDisplay__FoodTagAssignment_15 ) )
            // InternalGreedySnake.g:5774:2: ( rule__FoodInitDisplay__FoodTagAssignment_15 )
            {
             before(grammarAccess.getFoodInitDisplayAccess().getFoodTagAssignment_15()); 
            // InternalGreedySnake.g:5775:2: ( rule__FoodInitDisplay__FoodTagAssignment_15 )
            // InternalGreedySnake.g:5775:3: rule__FoodInitDisplay__FoodTagAssignment_15
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
    // InternalGreedySnake.g:5784:1: rule__FoodKind__Group__0 : rule__FoodKind__Group__0__Impl rule__FoodKind__Group__1 ;
    public final void rule__FoodKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5788:1: ( rule__FoodKind__Group__0__Impl rule__FoodKind__Group__1 )
            // InternalGreedySnake.g:5789:2: rule__FoodKind__Group__0__Impl rule__FoodKind__Group__1
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
    // InternalGreedySnake.g:5796:1: rule__FoodKind__Group__0__Impl : ( ( rule__FoodKind__KindAssignment_0 ) ) ;
    public final void rule__FoodKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5800:1: ( ( ( rule__FoodKind__KindAssignment_0 ) ) )
            // InternalGreedySnake.g:5801:1: ( ( rule__FoodKind__KindAssignment_0 ) )
            {
            // InternalGreedySnake.g:5801:1: ( ( rule__FoodKind__KindAssignment_0 ) )
            // InternalGreedySnake.g:5802:2: ( rule__FoodKind__KindAssignment_0 )
            {
             before(grammarAccess.getFoodKindAccess().getKindAssignment_0()); 
            // InternalGreedySnake.g:5803:2: ( rule__FoodKind__KindAssignment_0 )
            // InternalGreedySnake.g:5803:3: rule__FoodKind__KindAssignment_0
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
    // InternalGreedySnake.g:5811:1: rule__FoodKind__Group__1 : rule__FoodKind__Group__1__Impl rule__FoodKind__Group__2 ;
    public final void rule__FoodKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5815:1: ( rule__FoodKind__Group__1__Impl rule__FoodKind__Group__2 )
            // InternalGreedySnake.g:5816:2: rule__FoodKind__Group__1__Impl rule__FoodKind__Group__2
            {
            pushFollow(FOLLOW_53);
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
    // InternalGreedySnake.g:5823:1: rule__FoodKind__Group__1__Impl : ( ':' ) ;
    public final void rule__FoodKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5827:1: ( ( ':' ) )
            // InternalGreedySnake.g:5828:1: ( ':' )
            {
            // InternalGreedySnake.g:5828:1: ( ':' )
            // InternalGreedySnake.g:5829:2: ':'
            {
             before(grammarAccess.getFoodKindAccess().getColonKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGreedySnake.g:5838:1: rule__FoodKind__Group__2 : rule__FoodKind__Group__2__Impl rule__FoodKind__Group__3 ;
    public final void rule__FoodKind__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5842:1: ( rule__FoodKind__Group__2__Impl rule__FoodKind__Group__3 )
            // InternalGreedySnake.g:5843:2: rule__FoodKind__Group__2__Impl rule__FoodKind__Group__3
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
    // InternalGreedySnake.g:5850:1: rule__FoodKind__Group__2__Impl : ( 'point' ) ;
    public final void rule__FoodKind__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5854:1: ( ( 'point' ) )
            // InternalGreedySnake.g:5855:1: ( 'point' )
            {
            // InternalGreedySnake.g:5855:1: ( 'point' )
            // InternalGreedySnake.g:5856:2: 'point'
            {
             before(grammarAccess.getFoodKindAccess().getPointKeyword_2()); 
            match(input,65,FOLLOW_2); 
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
    // InternalGreedySnake.g:5865:1: rule__FoodKind__Group__3 : rule__FoodKind__Group__3__Impl rule__FoodKind__Group__4 ;
    public final void rule__FoodKind__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5869:1: ( rule__FoodKind__Group__3__Impl rule__FoodKind__Group__4 )
            // InternalGreedySnake.g:5870:2: rule__FoodKind__Group__3__Impl rule__FoodKind__Group__4
            {
            pushFollow(FOLLOW_54);
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
    // InternalGreedySnake.g:5877:1: rule__FoodKind__Group__3__Impl : ( '=' ) ;
    public final void rule__FoodKind__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5881:1: ( ( '=' ) )
            // InternalGreedySnake.g:5882:1: ( '=' )
            {
            // InternalGreedySnake.g:5882:1: ( '=' )
            // InternalGreedySnake.g:5883:2: '='
            {
             before(grammarAccess.getFoodKindAccess().getEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:5892:1: rule__FoodKind__Group__4 : rule__FoodKind__Group__4__Impl ;
    public final void rule__FoodKind__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5896:1: ( rule__FoodKind__Group__4__Impl )
            // InternalGreedySnake.g:5897:2: rule__FoodKind__Group__4__Impl
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
    // InternalGreedySnake.g:5903:1: rule__FoodKind__Group__4__Impl : ( ( rule__FoodKind__PointAssignment_4 ) ) ;
    public final void rule__FoodKind__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5907:1: ( ( ( rule__FoodKind__PointAssignment_4 ) ) )
            // InternalGreedySnake.g:5908:1: ( ( rule__FoodKind__PointAssignment_4 ) )
            {
            // InternalGreedySnake.g:5908:1: ( ( rule__FoodKind__PointAssignment_4 ) )
            // InternalGreedySnake.g:5909:2: ( rule__FoodKind__PointAssignment_4 )
            {
             before(grammarAccess.getFoodKindAccess().getPointAssignment_4()); 
            // InternalGreedySnake.g:5910:2: ( rule__FoodKind__PointAssignment_4 )
            // InternalGreedySnake.g:5910:3: rule__FoodKind__PointAssignment_4
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
    // InternalGreedySnake.g:5919:1: rule__ObstacleInitDisplay__Group__0 : rule__ObstacleInitDisplay__Group__0__Impl rule__ObstacleInitDisplay__Group__1 ;
    public final void rule__ObstacleInitDisplay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5923:1: ( rule__ObstacleInitDisplay__Group__0__Impl rule__ObstacleInitDisplay__Group__1 )
            // InternalGreedySnake.g:5924:2: rule__ObstacleInitDisplay__Group__0__Impl rule__ObstacleInitDisplay__Group__1
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
    // InternalGreedySnake.g:5931:1: rule__ObstacleInitDisplay__Group__0__Impl : ( 'ObstacleIcon' ) ;
    public final void rule__ObstacleInitDisplay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5935:1: ( ( 'ObstacleIcon' ) )
            // InternalGreedySnake.g:5936:1: ( 'ObstacleIcon' )
            {
            // InternalGreedySnake.g:5936:1: ( 'ObstacleIcon' )
            // InternalGreedySnake.g:5937:2: 'ObstacleIcon'
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getObstacleIconKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalGreedySnake.g:5946:1: rule__ObstacleInitDisplay__Group__1 : rule__ObstacleInitDisplay__Group__1__Impl rule__ObstacleInitDisplay__Group__2 ;
    public final void rule__ObstacleInitDisplay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5950:1: ( rule__ObstacleInitDisplay__Group__1__Impl rule__ObstacleInitDisplay__Group__2 )
            // InternalGreedySnake.g:5951:2: rule__ObstacleInitDisplay__Group__1__Impl rule__ObstacleInitDisplay__Group__2
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
    // InternalGreedySnake.g:5958:1: rule__ObstacleInitDisplay__Group__1__Impl : ( '{' ) ;
    public final void rule__ObstacleInitDisplay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5962:1: ( ( '{' ) )
            // InternalGreedySnake.g:5963:1: ( '{' )
            {
            // InternalGreedySnake.g:5963:1: ( '{' )
            // InternalGreedySnake.g:5964:2: '{'
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:5973:1: rule__ObstacleInitDisplay__Group__2 : rule__ObstacleInitDisplay__Group__2__Impl rule__ObstacleInitDisplay__Group__3 ;
    public final void rule__ObstacleInitDisplay__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5977:1: ( rule__ObstacleInitDisplay__Group__2__Impl rule__ObstacleInitDisplay__Group__3 )
            // InternalGreedySnake.g:5978:2: rule__ObstacleInitDisplay__Group__2__Impl rule__ObstacleInitDisplay__Group__3
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
    // InternalGreedySnake.g:5985:1: rule__ObstacleInitDisplay__Group__2__Impl : ( ( rule__ObstacleInitDisplay__ObstacleIconAssignment_2 )* ) ;
    public final void rule__ObstacleInitDisplay__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:5989:1: ( ( ( rule__ObstacleInitDisplay__ObstacleIconAssignment_2 )* ) )
            // InternalGreedySnake.g:5990:1: ( ( rule__ObstacleInitDisplay__ObstacleIconAssignment_2 )* )
            {
            // InternalGreedySnake.g:5990:1: ( ( rule__ObstacleInitDisplay__ObstacleIconAssignment_2 )* )
            // InternalGreedySnake.g:5991:2: ( rule__ObstacleInitDisplay__ObstacleIconAssignment_2 )*
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getObstacleIconAssignment_2()); 
            // InternalGreedySnake.g:5992:2: ( rule__ObstacleInitDisplay__ObstacleIconAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGreedySnake.g:5992:3: rule__ObstacleInitDisplay__ObstacleIconAssignment_2
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__ObstacleInitDisplay__ObstacleIconAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalGreedySnake.g:6000:1: rule__ObstacleInitDisplay__Group__3 : rule__ObstacleInitDisplay__Group__3__Impl rule__ObstacleInitDisplay__Group__4 ;
    public final void rule__ObstacleInitDisplay__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6004:1: ( rule__ObstacleInitDisplay__Group__3__Impl rule__ObstacleInitDisplay__Group__4 )
            // InternalGreedySnake.g:6005:2: rule__ObstacleInitDisplay__Group__3__Impl rule__ObstacleInitDisplay__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalGreedySnake.g:6012:1: rule__ObstacleInitDisplay__Group__3__Impl : ( '}' ) ;
    public final void rule__ObstacleInitDisplay__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6016:1: ( ( '}' ) )
            // InternalGreedySnake.g:6017:1: ( '}' )
            {
            // InternalGreedySnake.g:6017:1: ( '}' )
            // InternalGreedySnake.g:6018:2: '}'
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:6027:1: rule__ObstacleInitDisplay__Group__4 : rule__ObstacleInitDisplay__Group__4__Impl rule__ObstacleInitDisplay__Group__5 ;
    public final void rule__ObstacleInitDisplay__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6031:1: ( rule__ObstacleInitDisplay__Group__4__Impl rule__ObstacleInitDisplay__Group__5 )
            // InternalGreedySnake.g:6032:2: rule__ObstacleInitDisplay__Group__4__Impl rule__ObstacleInitDisplay__Group__5
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
    // InternalGreedySnake.g:6039:1: rule__ObstacleInitDisplay__Group__4__Impl : ( 'Icon_size' ) ;
    public final void rule__ObstacleInitDisplay__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6043:1: ( ( 'Icon_size' ) )
            // InternalGreedySnake.g:6044:1: ( 'Icon_size' )
            {
            // InternalGreedySnake.g:6044:1: ( 'Icon_size' )
            // InternalGreedySnake.g:6045:2: 'Icon_size'
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getIcon_sizeKeyword_4()); 
            match(input,53,FOLLOW_2); 
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
    // InternalGreedySnake.g:6054:1: rule__ObstacleInitDisplay__Group__5 : rule__ObstacleInitDisplay__Group__5__Impl rule__ObstacleInitDisplay__Group__6 ;
    public final void rule__ObstacleInitDisplay__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6058:1: ( rule__ObstacleInitDisplay__Group__5__Impl rule__ObstacleInitDisplay__Group__6 )
            // InternalGreedySnake.g:6059:2: rule__ObstacleInitDisplay__Group__5__Impl rule__ObstacleInitDisplay__Group__6
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
    // InternalGreedySnake.g:6066:1: rule__ObstacleInitDisplay__Group__5__Impl : ( '=' ) ;
    public final void rule__ObstacleInitDisplay__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6070:1: ( ( '=' ) )
            // InternalGreedySnake.g:6071:1: ( '=' )
            {
            // InternalGreedySnake.g:6071:1: ( '=' )
            // InternalGreedySnake.g:6072:2: '='
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getEqualsSignKeyword_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:6081:1: rule__ObstacleInitDisplay__Group__6 : rule__ObstacleInitDisplay__Group__6__Impl rule__ObstacleInitDisplay__Group__7 ;
    public final void rule__ObstacleInitDisplay__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6085:1: ( rule__ObstacleInitDisplay__Group__6__Impl rule__ObstacleInitDisplay__Group__7 )
            // InternalGreedySnake.g:6086:2: rule__ObstacleInitDisplay__Group__6__Impl rule__ObstacleInitDisplay__Group__7
            {
            pushFollow(FOLLOW_55);
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
    // InternalGreedySnake.g:6093:1: rule__ObstacleInitDisplay__Group__6__Impl : ( ( rule__ObstacleInitDisplay__IconsizeAssignment_6 ) ) ;
    public final void rule__ObstacleInitDisplay__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6097:1: ( ( ( rule__ObstacleInitDisplay__IconsizeAssignment_6 ) ) )
            // InternalGreedySnake.g:6098:1: ( ( rule__ObstacleInitDisplay__IconsizeAssignment_6 ) )
            {
            // InternalGreedySnake.g:6098:1: ( ( rule__ObstacleInitDisplay__IconsizeAssignment_6 ) )
            // InternalGreedySnake.g:6099:2: ( rule__ObstacleInitDisplay__IconsizeAssignment_6 )
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getIconsizeAssignment_6()); 
            // InternalGreedySnake.g:6100:2: ( rule__ObstacleInitDisplay__IconsizeAssignment_6 )
            // InternalGreedySnake.g:6100:3: rule__ObstacleInitDisplay__IconsizeAssignment_6
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
    // InternalGreedySnake.g:6108:1: rule__ObstacleInitDisplay__Group__7 : rule__ObstacleInitDisplay__Group__7__Impl rule__ObstacleInitDisplay__Group__8 ;
    public final void rule__ObstacleInitDisplay__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6112:1: ( rule__ObstacleInitDisplay__Group__7__Impl rule__ObstacleInitDisplay__Group__8 )
            // InternalGreedySnake.g:6113:2: rule__ObstacleInitDisplay__Group__7__Impl rule__ObstacleInitDisplay__Group__8
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
    // InternalGreedySnake.g:6120:1: rule__ObstacleInitDisplay__Group__7__Impl : ( 'ObstacleTag' ) ;
    public final void rule__ObstacleInitDisplay__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6124:1: ( ( 'ObstacleTag' ) )
            // InternalGreedySnake.g:6125:1: ( 'ObstacleTag' )
            {
            // InternalGreedySnake.g:6125:1: ( 'ObstacleTag' )
            // InternalGreedySnake.g:6126:2: 'ObstacleTag'
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getObstacleTagKeyword_7()); 
            match(input,67,FOLLOW_2); 
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
    // InternalGreedySnake.g:6135:1: rule__ObstacleInitDisplay__Group__8 : rule__ObstacleInitDisplay__Group__8__Impl rule__ObstacleInitDisplay__Group__9 ;
    public final void rule__ObstacleInitDisplay__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6139:1: ( rule__ObstacleInitDisplay__Group__8__Impl rule__ObstacleInitDisplay__Group__9 )
            // InternalGreedySnake.g:6140:2: rule__ObstacleInitDisplay__Group__8__Impl rule__ObstacleInitDisplay__Group__9
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
    // InternalGreedySnake.g:6147:1: rule__ObstacleInitDisplay__Group__8__Impl : ( '=' ) ;
    public final void rule__ObstacleInitDisplay__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6151:1: ( ( '=' ) )
            // InternalGreedySnake.g:6152:1: ( '=' )
            {
            // InternalGreedySnake.g:6152:1: ( '=' )
            // InternalGreedySnake.g:6153:2: '='
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getEqualsSignKeyword_8()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:6162:1: rule__ObstacleInitDisplay__Group__9 : rule__ObstacleInitDisplay__Group__9__Impl ;
    public final void rule__ObstacleInitDisplay__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6166:1: ( rule__ObstacleInitDisplay__Group__9__Impl )
            // InternalGreedySnake.g:6167:2: rule__ObstacleInitDisplay__Group__9__Impl
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
    // InternalGreedySnake.g:6173:1: rule__ObstacleInitDisplay__Group__9__Impl : ( ( rule__ObstacleInitDisplay__ObstacleTagAssignment_9 ) ) ;
    public final void rule__ObstacleInitDisplay__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6177:1: ( ( ( rule__ObstacleInitDisplay__ObstacleTagAssignment_9 ) ) )
            // InternalGreedySnake.g:6178:1: ( ( rule__ObstacleInitDisplay__ObstacleTagAssignment_9 ) )
            {
            // InternalGreedySnake.g:6178:1: ( ( rule__ObstacleInitDisplay__ObstacleTagAssignment_9 ) )
            // InternalGreedySnake.g:6179:2: ( rule__ObstacleInitDisplay__ObstacleTagAssignment_9 )
            {
             before(grammarAccess.getObstacleInitDisplayAccess().getObstacleTagAssignment_9()); 
            // InternalGreedySnake.g:6180:2: ( rule__ObstacleInitDisplay__ObstacleTagAssignment_9 )
            // InternalGreedySnake.g:6180:3: rule__ObstacleInitDisplay__ObstacleTagAssignment_9
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
    // InternalGreedySnake.g:6189:1: rule__RandomFoodSize__Group__0 : rule__RandomFoodSize__Group__0__Impl rule__RandomFoodSize__Group__1 ;
    public final void rule__RandomFoodSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6193:1: ( rule__RandomFoodSize__Group__0__Impl rule__RandomFoodSize__Group__1 )
            // InternalGreedySnake.g:6194:2: rule__RandomFoodSize__Group__0__Impl rule__RandomFoodSize__Group__1
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
    // InternalGreedySnake.g:6201:1: rule__RandomFoodSize__Group__0__Impl : ( 'Maxsize' ) ;
    public final void rule__RandomFoodSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6205:1: ( ( 'Maxsize' ) )
            // InternalGreedySnake.g:6206:1: ( 'Maxsize' )
            {
            // InternalGreedySnake.g:6206:1: ( 'Maxsize' )
            // InternalGreedySnake.g:6207:2: 'Maxsize'
            {
             before(grammarAccess.getRandomFoodSizeAccess().getMaxsizeKeyword_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalGreedySnake.g:6216:1: rule__RandomFoodSize__Group__1 : rule__RandomFoodSize__Group__1__Impl rule__RandomFoodSize__Group__2 ;
    public final void rule__RandomFoodSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6220:1: ( rule__RandomFoodSize__Group__1__Impl rule__RandomFoodSize__Group__2 )
            // InternalGreedySnake.g:6221:2: rule__RandomFoodSize__Group__1__Impl rule__RandomFoodSize__Group__2
            {
            pushFollow(FOLLOW_56);
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
    // InternalGreedySnake.g:6228:1: rule__RandomFoodSize__Group__1__Impl : ( ( rule__RandomFoodSize__MaxsizeAssignment_1 ) ) ;
    public final void rule__RandomFoodSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6232:1: ( ( ( rule__RandomFoodSize__MaxsizeAssignment_1 ) ) )
            // InternalGreedySnake.g:6233:1: ( ( rule__RandomFoodSize__MaxsizeAssignment_1 ) )
            {
            // InternalGreedySnake.g:6233:1: ( ( rule__RandomFoodSize__MaxsizeAssignment_1 ) )
            // InternalGreedySnake.g:6234:2: ( rule__RandomFoodSize__MaxsizeAssignment_1 )
            {
             before(grammarAccess.getRandomFoodSizeAccess().getMaxsizeAssignment_1()); 
            // InternalGreedySnake.g:6235:2: ( rule__RandomFoodSize__MaxsizeAssignment_1 )
            // InternalGreedySnake.g:6235:3: rule__RandomFoodSize__MaxsizeAssignment_1
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
    // InternalGreedySnake.g:6243:1: rule__RandomFoodSize__Group__2 : rule__RandomFoodSize__Group__2__Impl rule__RandomFoodSize__Group__3 ;
    public final void rule__RandomFoodSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6247:1: ( rule__RandomFoodSize__Group__2__Impl rule__RandomFoodSize__Group__3 )
            // InternalGreedySnake.g:6248:2: rule__RandomFoodSize__Group__2__Impl rule__RandomFoodSize__Group__3
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
    // InternalGreedySnake.g:6255:1: rule__RandomFoodSize__Group__2__Impl : ( 'Minsize' ) ;
    public final void rule__RandomFoodSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6259:1: ( ( 'Minsize' ) )
            // InternalGreedySnake.g:6260:1: ( 'Minsize' )
            {
            // InternalGreedySnake.g:6260:1: ( 'Minsize' )
            // InternalGreedySnake.g:6261:2: 'Minsize'
            {
             before(grammarAccess.getRandomFoodSizeAccess().getMinsizeKeyword_2()); 
            match(input,69,FOLLOW_2); 
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
    // InternalGreedySnake.g:6270:1: rule__RandomFoodSize__Group__3 : rule__RandomFoodSize__Group__3__Impl ;
    public final void rule__RandomFoodSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6274:1: ( rule__RandomFoodSize__Group__3__Impl )
            // InternalGreedySnake.g:6275:2: rule__RandomFoodSize__Group__3__Impl
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
    // InternalGreedySnake.g:6281:1: rule__RandomFoodSize__Group__3__Impl : ( ( rule__RandomFoodSize__MinsizeAssignment_3 ) ) ;
    public final void rule__RandomFoodSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6285:1: ( ( ( rule__RandomFoodSize__MinsizeAssignment_3 ) ) )
            // InternalGreedySnake.g:6286:1: ( ( rule__RandomFoodSize__MinsizeAssignment_3 ) )
            {
            // InternalGreedySnake.g:6286:1: ( ( rule__RandomFoodSize__MinsizeAssignment_3 ) )
            // InternalGreedySnake.g:6287:2: ( rule__RandomFoodSize__MinsizeAssignment_3 )
            {
             before(grammarAccess.getRandomFoodSizeAccess().getMinsizeAssignment_3()); 
            // InternalGreedySnake.g:6288:2: ( rule__RandomFoodSize__MinsizeAssignment_3 )
            // InternalGreedySnake.g:6288:3: rule__RandomFoodSize__MinsizeAssignment_3
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
    // InternalGreedySnake.g:6297:1: rule__TimeLimited__Group_0__0 : rule__TimeLimited__Group_0__0__Impl rule__TimeLimited__Group_0__1 ;
    public final void rule__TimeLimited__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6301:1: ( rule__TimeLimited__Group_0__0__Impl rule__TimeLimited__Group_0__1 )
            // InternalGreedySnake.g:6302:2: rule__TimeLimited__Group_0__0__Impl rule__TimeLimited__Group_0__1
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
    // InternalGreedySnake.g:6309:1: rule__TimeLimited__Group_0__0__Impl : ( 'timeLimited' ) ;
    public final void rule__TimeLimited__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6313:1: ( ( 'timeLimited' ) )
            // InternalGreedySnake.g:6314:1: ( 'timeLimited' )
            {
            // InternalGreedySnake.g:6314:1: ( 'timeLimited' )
            // InternalGreedySnake.g:6315:2: 'timeLimited'
            {
             before(grammarAccess.getTimeLimitedAccess().getTimeLimitedKeyword_0_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalGreedySnake.g:6324:1: rule__TimeLimited__Group_0__1 : rule__TimeLimited__Group_0__1__Impl rule__TimeLimited__Group_0__2 ;
    public final void rule__TimeLimited__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6328:1: ( rule__TimeLimited__Group_0__1__Impl rule__TimeLimited__Group_0__2 )
            // InternalGreedySnake.g:6329:2: rule__TimeLimited__Group_0__1__Impl rule__TimeLimited__Group_0__2
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
    // InternalGreedySnake.g:6336:1: rule__TimeLimited__Group_0__1__Impl : ( '{' ) ;
    public final void rule__TimeLimited__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6340:1: ( ( '{' ) )
            // InternalGreedySnake.g:6341:1: ( '{' )
            {
            // InternalGreedySnake.g:6341:1: ( '{' )
            // InternalGreedySnake.g:6342:2: '{'
            {
             before(grammarAccess.getTimeLimitedAccess().getLeftCurlyBracketKeyword_0_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:6351:1: rule__TimeLimited__Group_0__2 : rule__TimeLimited__Group_0__2__Impl ;
    public final void rule__TimeLimited__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6355:1: ( rule__TimeLimited__Group_0__2__Impl )
            // InternalGreedySnake.g:6356:2: rule__TimeLimited__Group_0__2__Impl
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
    // InternalGreedySnake.g:6362:1: rule__TimeLimited__Group_0__2__Impl : ( ruleFoodTime ) ;
    public final void rule__TimeLimited__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6366:1: ( ( ruleFoodTime ) )
            // InternalGreedySnake.g:6367:1: ( ruleFoodTime )
            {
            // InternalGreedySnake.g:6367:1: ( ruleFoodTime )
            // InternalGreedySnake.g:6368:2: ruleFoodTime
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
    // InternalGreedySnake.g:6378:1: rule__TimeLimited__Group_1__0 : rule__TimeLimited__Group_1__0__Impl rule__TimeLimited__Group_1__1 ;
    public final void rule__TimeLimited__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6382:1: ( rule__TimeLimited__Group_1__0__Impl rule__TimeLimited__Group_1__1 )
            // InternalGreedySnake.g:6383:2: rule__TimeLimited__Group_1__0__Impl rule__TimeLimited__Group_1__1
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
    // InternalGreedySnake.g:6390:1: rule__TimeLimited__Group_1__0__Impl : ( ruleObstacleTime ) ;
    public final void rule__TimeLimited__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6394:1: ( ( ruleObstacleTime ) )
            // InternalGreedySnake.g:6395:1: ( ruleObstacleTime )
            {
            // InternalGreedySnake.g:6395:1: ( ruleObstacleTime )
            // InternalGreedySnake.g:6396:2: ruleObstacleTime
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
    // InternalGreedySnake.g:6405:1: rule__TimeLimited__Group_1__1 : rule__TimeLimited__Group_1__1__Impl ;
    public final void rule__TimeLimited__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6409:1: ( rule__TimeLimited__Group_1__1__Impl )
            // InternalGreedySnake.g:6410:2: rule__TimeLimited__Group_1__1__Impl
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
    // InternalGreedySnake.g:6416:1: rule__TimeLimited__Group_1__1__Impl : ( '}' ) ;
    public final void rule__TimeLimited__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6420:1: ( ( '}' ) )
            // InternalGreedySnake.g:6421:1: ( '}' )
            {
            // InternalGreedySnake.g:6421:1: ( '}' )
            // InternalGreedySnake.g:6422:2: '}'
            {
             before(grammarAccess.getTimeLimitedAccess().getRightCurlyBracketKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:6432:1: rule__ObstacleTime__Group__0 : rule__ObstacleTime__Group__0__Impl rule__ObstacleTime__Group__1 ;
    public final void rule__ObstacleTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6436:1: ( rule__ObstacleTime__Group__0__Impl rule__ObstacleTime__Group__1 )
            // InternalGreedySnake.g:6437:2: rule__ObstacleTime__Group__0__Impl rule__ObstacleTime__Group__1
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
    // InternalGreedySnake.g:6444:1: rule__ObstacleTime__Group__0__Impl : ( ( rule__ObstacleTime__NameAssignment_0 ) ) ;
    public final void rule__ObstacleTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6448:1: ( ( ( rule__ObstacleTime__NameAssignment_0 ) ) )
            // InternalGreedySnake.g:6449:1: ( ( rule__ObstacleTime__NameAssignment_0 ) )
            {
            // InternalGreedySnake.g:6449:1: ( ( rule__ObstacleTime__NameAssignment_0 ) )
            // InternalGreedySnake.g:6450:2: ( rule__ObstacleTime__NameAssignment_0 )
            {
             before(grammarAccess.getObstacleTimeAccess().getNameAssignment_0()); 
            // InternalGreedySnake.g:6451:2: ( rule__ObstacleTime__NameAssignment_0 )
            // InternalGreedySnake.g:6451:3: rule__ObstacleTime__NameAssignment_0
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
    // InternalGreedySnake.g:6459:1: rule__ObstacleTime__Group__1 : rule__ObstacleTime__Group__1__Impl rule__ObstacleTime__Group__2 ;
    public final void rule__ObstacleTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6463:1: ( rule__ObstacleTime__Group__1__Impl rule__ObstacleTime__Group__2 )
            // InternalGreedySnake.g:6464:2: rule__ObstacleTime__Group__1__Impl rule__ObstacleTime__Group__2
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
    // InternalGreedySnake.g:6471:1: rule__ObstacleTime__Group__1__Impl : ( '=' ) ;
    public final void rule__ObstacleTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6475:1: ( ( '=' ) )
            // InternalGreedySnake.g:6476:1: ( '=' )
            {
            // InternalGreedySnake.g:6476:1: ( '=' )
            // InternalGreedySnake.g:6477:2: '='
            {
             before(grammarAccess.getObstacleTimeAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:6486:1: rule__ObstacleTime__Group__2 : rule__ObstacleTime__Group__2__Impl ;
    public final void rule__ObstacleTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6490:1: ( rule__ObstacleTime__Group__2__Impl )
            // InternalGreedySnake.g:6491:2: rule__ObstacleTime__Group__2__Impl
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
    // InternalGreedySnake.g:6497:1: rule__ObstacleTime__Group__2__Impl : ( ( rule__ObstacleTime__ObstacleTimeAssignment_2 ) ) ;
    public final void rule__ObstacleTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6501:1: ( ( ( rule__ObstacleTime__ObstacleTimeAssignment_2 ) ) )
            // InternalGreedySnake.g:6502:1: ( ( rule__ObstacleTime__ObstacleTimeAssignment_2 ) )
            {
            // InternalGreedySnake.g:6502:1: ( ( rule__ObstacleTime__ObstacleTimeAssignment_2 ) )
            // InternalGreedySnake.g:6503:2: ( rule__ObstacleTime__ObstacleTimeAssignment_2 )
            {
             before(grammarAccess.getObstacleTimeAccess().getObstacleTimeAssignment_2()); 
            // InternalGreedySnake.g:6504:2: ( rule__ObstacleTime__ObstacleTimeAssignment_2 )
            // InternalGreedySnake.g:6504:3: rule__ObstacleTime__ObstacleTimeAssignment_2
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
    // InternalGreedySnake.g:6513:1: rule__FoodTime__Group__0 : rule__FoodTime__Group__0__Impl rule__FoodTime__Group__1 ;
    public final void rule__FoodTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6517:1: ( rule__FoodTime__Group__0__Impl rule__FoodTime__Group__1 )
            // InternalGreedySnake.g:6518:2: rule__FoodTime__Group__0__Impl rule__FoodTime__Group__1
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
    // InternalGreedySnake.g:6525:1: rule__FoodTime__Group__0__Impl : ( ( rule__FoodTime__NameAssignment_0 ) ) ;
    public final void rule__FoodTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6529:1: ( ( ( rule__FoodTime__NameAssignment_0 ) ) )
            // InternalGreedySnake.g:6530:1: ( ( rule__FoodTime__NameAssignment_0 ) )
            {
            // InternalGreedySnake.g:6530:1: ( ( rule__FoodTime__NameAssignment_0 ) )
            // InternalGreedySnake.g:6531:2: ( rule__FoodTime__NameAssignment_0 )
            {
             before(grammarAccess.getFoodTimeAccess().getNameAssignment_0()); 
            // InternalGreedySnake.g:6532:2: ( rule__FoodTime__NameAssignment_0 )
            // InternalGreedySnake.g:6532:3: rule__FoodTime__NameAssignment_0
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
    // InternalGreedySnake.g:6540:1: rule__FoodTime__Group__1 : rule__FoodTime__Group__1__Impl rule__FoodTime__Group__2 ;
    public final void rule__FoodTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6544:1: ( rule__FoodTime__Group__1__Impl rule__FoodTime__Group__2 )
            // InternalGreedySnake.g:6545:2: rule__FoodTime__Group__1__Impl rule__FoodTime__Group__2
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
    // InternalGreedySnake.g:6552:1: rule__FoodTime__Group__1__Impl : ( '=' ) ;
    public final void rule__FoodTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6556:1: ( ( '=' ) )
            // InternalGreedySnake.g:6557:1: ( '=' )
            {
            // InternalGreedySnake.g:6557:1: ( '=' )
            // InternalGreedySnake.g:6558:2: '='
            {
             before(grammarAccess.getFoodTimeAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:6567:1: rule__FoodTime__Group__2 : rule__FoodTime__Group__2__Impl ;
    public final void rule__FoodTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6571:1: ( rule__FoodTime__Group__2__Impl )
            // InternalGreedySnake.g:6572:2: rule__FoodTime__Group__2__Impl
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
    // InternalGreedySnake.g:6578:1: rule__FoodTime__Group__2__Impl : ( ( rule__FoodTime__FoodTimeAssignment_2 ) ) ;
    public final void rule__FoodTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6582:1: ( ( ( rule__FoodTime__FoodTimeAssignment_2 ) ) )
            // InternalGreedySnake.g:6583:1: ( ( rule__FoodTime__FoodTimeAssignment_2 ) )
            {
            // InternalGreedySnake.g:6583:1: ( ( rule__FoodTime__FoodTimeAssignment_2 ) )
            // InternalGreedySnake.g:6584:2: ( rule__FoodTime__FoodTimeAssignment_2 )
            {
             before(grammarAccess.getFoodTimeAccess().getFoodTimeAssignment_2()); 
            // InternalGreedySnake.g:6585:2: ( rule__FoodTime__FoodTimeAssignment_2 )
            // InternalGreedySnake.g:6585:3: rule__FoodTime__FoodTimeAssignment_2
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


    // $ANTLR start "rule__DirectionSpecification__Group__0"
    // InternalGreedySnake.g:6594:1: rule__DirectionSpecification__Group__0 : rule__DirectionSpecification__Group__0__Impl rule__DirectionSpecification__Group__1 ;
    public final void rule__DirectionSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6598:1: ( rule__DirectionSpecification__Group__0__Impl rule__DirectionSpecification__Group__1 )
            // InternalGreedySnake.g:6599:2: rule__DirectionSpecification__Group__0__Impl rule__DirectionSpecification__Group__1
            {
            pushFollow(FOLLOW_57);
            rule__DirectionSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectionSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionSpecification__Group__0"


    // $ANTLR start "rule__DirectionSpecification__Group__0__Impl"
    // InternalGreedySnake.g:6606:1: rule__DirectionSpecification__Group__0__Impl : ( () ) ;
    public final void rule__DirectionSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6610:1: ( ( () ) )
            // InternalGreedySnake.g:6611:1: ( () )
            {
            // InternalGreedySnake.g:6611:1: ( () )
            // InternalGreedySnake.g:6612:2: ()
            {
             before(grammarAccess.getDirectionSpecificationAccess().getDirectionSpecificationAction_0()); 
            // InternalGreedySnake.g:6613:2: ()
            // InternalGreedySnake.g:6613:3: 
            {
            }

             after(grammarAccess.getDirectionSpecificationAccess().getDirectionSpecificationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionSpecification__Group__0__Impl"


    // $ANTLR start "rule__DirectionSpecification__Group__1"
    // InternalGreedySnake.g:6621:1: rule__DirectionSpecification__Group__1 : rule__DirectionSpecification__Group__1__Impl rule__DirectionSpecification__Group__2 ;
    public final void rule__DirectionSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6625:1: ( rule__DirectionSpecification__Group__1__Impl rule__DirectionSpecification__Group__2 )
            // InternalGreedySnake.g:6626:2: rule__DirectionSpecification__Group__1__Impl rule__DirectionSpecification__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DirectionSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectionSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionSpecification__Group__1"


    // $ANTLR start "rule__DirectionSpecification__Group__1__Impl"
    // InternalGreedySnake.g:6633:1: rule__DirectionSpecification__Group__1__Impl : ( 'Direction' ) ;
    public final void rule__DirectionSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6637:1: ( ( 'Direction' ) )
            // InternalGreedySnake.g:6638:1: ( 'Direction' )
            {
            // InternalGreedySnake.g:6638:1: ( 'Direction' )
            // InternalGreedySnake.g:6639:2: 'Direction'
            {
             before(grammarAccess.getDirectionSpecificationAccess().getDirectionKeyword_1()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getDirectionSpecificationAccess().getDirectionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionSpecification__Group__1__Impl"


    // $ANTLR start "rule__DirectionSpecification__Group__2"
    // InternalGreedySnake.g:6648:1: rule__DirectionSpecification__Group__2 : rule__DirectionSpecification__Group__2__Impl rule__DirectionSpecification__Group__3 ;
    public final void rule__DirectionSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6652:1: ( rule__DirectionSpecification__Group__2__Impl rule__DirectionSpecification__Group__3 )
            // InternalGreedySnake.g:6653:2: rule__DirectionSpecification__Group__2__Impl rule__DirectionSpecification__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__DirectionSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectionSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionSpecification__Group__2"


    // $ANTLR start "rule__DirectionSpecification__Group__2__Impl"
    // InternalGreedySnake.g:6660:1: rule__DirectionSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__DirectionSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6664:1: ( ( '{' ) )
            // InternalGreedySnake.g:6665:1: ( '{' )
            {
            // InternalGreedySnake.g:6665:1: ( '{' )
            // InternalGreedySnake.g:6666:2: '{'
            {
             before(grammarAccess.getDirectionSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDirectionSpecificationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionSpecification__Group__2__Impl"


    // $ANTLR start "rule__DirectionSpecification__Group__3"
    // InternalGreedySnake.g:6675:1: rule__DirectionSpecification__Group__3 : rule__DirectionSpecification__Group__3__Impl rule__DirectionSpecification__Group__4 ;
    public final void rule__DirectionSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6679:1: ( rule__DirectionSpecification__Group__3__Impl rule__DirectionSpecification__Group__4 )
            // InternalGreedySnake.g:6680:2: rule__DirectionSpecification__Group__3__Impl rule__DirectionSpecification__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__DirectionSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectionSpecification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionSpecification__Group__3"


    // $ANTLR start "rule__DirectionSpecification__Group__3__Impl"
    // InternalGreedySnake.g:6687:1: rule__DirectionSpecification__Group__3__Impl : ( ( rule__DirectionSpecification__DiAssignment_3 )* ) ;
    public final void rule__DirectionSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6691:1: ( ( ( rule__DirectionSpecification__DiAssignment_3 )* ) )
            // InternalGreedySnake.g:6692:1: ( ( rule__DirectionSpecification__DiAssignment_3 )* )
            {
            // InternalGreedySnake.g:6692:1: ( ( rule__DirectionSpecification__DiAssignment_3 )* )
            // InternalGreedySnake.g:6693:2: ( rule__DirectionSpecification__DiAssignment_3 )*
            {
             before(grammarAccess.getDirectionSpecificationAccess().getDiAssignment_3()); 
            // InternalGreedySnake.g:6694:2: ( rule__DirectionSpecification__DiAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGreedySnake.g:6694:3: rule__DirectionSpecification__DiAssignment_3
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__DirectionSpecification__DiAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getDirectionSpecificationAccess().getDiAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionSpecification__Group__3__Impl"


    // $ANTLR start "rule__DirectionSpecification__Group__4"
    // InternalGreedySnake.g:6702:1: rule__DirectionSpecification__Group__4 : rule__DirectionSpecification__Group__4__Impl ;
    public final void rule__DirectionSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6706:1: ( rule__DirectionSpecification__Group__4__Impl )
            // InternalGreedySnake.g:6707:2: rule__DirectionSpecification__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectionSpecification__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionSpecification__Group__4"


    // $ANTLR start "rule__DirectionSpecification__Group__4__Impl"
    // InternalGreedySnake.g:6713:1: rule__DirectionSpecification__Group__4__Impl : ( '}' ) ;
    public final void rule__DirectionSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6717:1: ( ( '}' ) )
            // InternalGreedySnake.g:6718:1: ( '}' )
            {
            // InternalGreedySnake.g:6718:1: ( '}' )
            // InternalGreedySnake.g:6719:2: '}'
            {
             before(grammarAccess.getDirectionSpecificationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDirectionSpecificationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionSpecification__Group__4__Impl"


    // $ANTLR start "rule__Dis__Group__0"
    // InternalGreedySnake.g:6729:1: rule__Dis__Group__0 : rule__Dis__Group__0__Impl rule__Dis__Group__1 ;
    public final void rule__Dis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6733:1: ( rule__Dis__Group__0__Impl rule__Dis__Group__1 )
            // InternalGreedySnake.g:6734:2: rule__Dis__Group__0__Impl rule__Dis__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Dis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dis__Group__0"


    // $ANTLR start "rule__Dis__Group__0__Impl"
    // InternalGreedySnake.g:6741:1: rule__Dis__Group__0__Impl : ( ( rule__Dis__NameAssignment_0 ) ) ;
    public final void rule__Dis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6745:1: ( ( ( rule__Dis__NameAssignment_0 ) ) )
            // InternalGreedySnake.g:6746:1: ( ( rule__Dis__NameAssignment_0 ) )
            {
            // InternalGreedySnake.g:6746:1: ( ( rule__Dis__NameAssignment_0 ) )
            // InternalGreedySnake.g:6747:2: ( rule__Dis__NameAssignment_0 )
            {
             before(grammarAccess.getDisAccess().getNameAssignment_0()); 
            // InternalGreedySnake.g:6748:2: ( rule__Dis__NameAssignment_0 )
            // InternalGreedySnake.g:6748:3: rule__Dis__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Dis__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDisAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dis__Group__0__Impl"


    // $ANTLR start "rule__Dis__Group__1"
    // InternalGreedySnake.g:6756:1: rule__Dis__Group__1 : rule__Dis__Group__1__Impl rule__Dis__Group__2 ;
    public final void rule__Dis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6760:1: ( rule__Dis__Group__1__Impl rule__Dis__Group__2 )
            // InternalGreedySnake.g:6761:2: rule__Dis__Group__1__Impl rule__Dis__Group__2
            {
            pushFollow(FOLLOW_58);
            rule__Dis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dis__Group__1"


    // $ANTLR start "rule__Dis__Group__1__Impl"
    // InternalGreedySnake.g:6768:1: rule__Dis__Group__1__Impl : ( '=' ) ;
    public final void rule__Dis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6772:1: ( ( '=' ) )
            // InternalGreedySnake.g:6773:1: ( '=' )
            {
            // InternalGreedySnake.g:6773:1: ( '=' )
            // InternalGreedySnake.g:6774:2: '='
            {
             before(grammarAccess.getDisAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDisAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dis__Group__1__Impl"


    // $ANTLR start "rule__Dis__Group__2"
    // InternalGreedySnake.g:6783:1: rule__Dis__Group__2 : rule__Dis__Group__2__Impl ;
    public final void rule__Dis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6787:1: ( rule__Dis__Group__2__Impl )
            // InternalGreedySnake.g:6788:2: rule__Dis__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dis__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dis__Group__2"


    // $ANTLR start "rule__Dis__Group__2__Impl"
    // InternalGreedySnake.g:6794:1: rule__Dis__Group__2__Impl : ( ( rule__Dis__DirectionAssignment_2 ) ) ;
    public final void rule__Dis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6798:1: ( ( ( rule__Dis__DirectionAssignment_2 ) ) )
            // InternalGreedySnake.g:6799:1: ( ( rule__Dis__DirectionAssignment_2 ) )
            {
            // InternalGreedySnake.g:6799:1: ( ( rule__Dis__DirectionAssignment_2 ) )
            // InternalGreedySnake.g:6800:2: ( rule__Dis__DirectionAssignment_2 )
            {
             before(grammarAccess.getDisAccess().getDirectionAssignment_2()); 
            // InternalGreedySnake.g:6801:2: ( rule__Dis__DirectionAssignment_2 )
            // InternalGreedySnake.g:6801:3: rule__Dis__DirectionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Dis__DirectionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDisAccess().getDirectionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dis__Group__2__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalGreedySnake.g:6810:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6814:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalGreedySnake.g:6815:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalGreedySnake.g:6822:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6826:1: ( ( ruleMultiplication ) )
            // InternalGreedySnake.g:6827:1: ( ruleMultiplication )
            {
            // InternalGreedySnake.g:6827:1: ( ruleMultiplication )
            // InternalGreedySnake.g:6828:2: ruleMultiplication
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
    // InternalGreedySnake.g:6837:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6841:1: ( rule__Addition__Group__1__Impl )
            // InternalGreedySnake.g:6842:2: rule__Addition__Group__1__Impl
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
    // InternalGreedySnake.g:6848:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6852:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalGreedySnake.g:6853:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalGreedySnake.g:6853:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalGreedySnake.g:6854:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalGreedySnake.g:6855:2: ( rule__Addition__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=13 && LA24_0<=14)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGreedySnake.g:6855:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_59);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalGreedySnake.g:6864:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6868:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalGreedySnake.g:6869:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalGreedySnake.g:6876:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6880:1: ( ( () ) )
            // InternalGreedySnake.g:6881:1: ( () )
            {
            // InternalGreedySnake.g:6881:1: ( () )
            // InternalGreedySnake.g:6882:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalGreedySnake.g:6883:2: ()
            // InternalGreedySnake.g:6883:3: 
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
    // InternalGreedySnake.g:6891:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6895:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalGreedySnake.g:6896:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalGreedySnake.g:6903:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6907:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalGreedySnake.g:6908:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalGreedySnake.g:6908:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalGreedySnake.g:6909:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalGreedySnake.g:6910:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalGreedySnake.g:6910:3: rule__Addition__OperatorAssignment_1_1
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
    // InternalGreedySnake.g:6918:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6922:1: ( rule__Addition__Group_1__2__Impl )
            // InternalGreedySnake.g:6923:2: rule__Addition__Group_1__2__Impl
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
    // InternalGreedySnake.g:6929:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6933:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalGreedySnake.g:6934:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalGreedySnake.g:6934:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalGreedySnake.g:6935:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalGreedySnake.g:6936:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalGreedySnake.g:6936:3: rule__Addition__RightAssignment_1_2
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
    // InternalGreedySnake.g:6945:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6949:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalGreedySnake.g:6950:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalGreedySnake.g:6957:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6961:1: ( ( rulePrimary ) )
            // InternalGreedySnake.g:6962:1: ( rulePrimary )
            {
            // InternalGreedySnake.g:6962:1: ( rulePrimary )
            // InternalGreedySnake.g:6963:2: rulePrimary
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
    // InternalGreedySnake.g:6972:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6976:1: ( rule__Multiplication__Group__1__Impl )
            // InternalGreedySnake.g:6977:2: rule__Multiplication__Group__1__Impl
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
    // InternalGreedySnake.g:6983:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:6987:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalGreedySnake.g:6988:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalGreedySnake.g:6988:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalGreedySnake.g:6989:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalGreedySnake.g:6990:2: ( rule__Multiplication__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=15 && LA25_0<=16)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGreedySnake.g:6990:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_61);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalGreedySnake.g:6999:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7003:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalGreedySnake.g:7004:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalGreedySnake.g:7011:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7015:1: ( ( () ) )
            // InternalGreedySnake.g:7016:1: ( () )
            {
            // InternalGreedySnake.g:7016:1: ( () )
            // InternalGreedySnake.g:7017:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalGreedySnake.g:7018:2: ()
            // InternalGreedySnake.g:7018:3: 
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
    // InternalGreedySnake.g:7026:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7030:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalGreedySnake.g:7031:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalGreedySnake.g:7038:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7042:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalGreedySnake.g:7043:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalGreedySnake.g:7043:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalGreedySnake.g:7044:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalGreedySnake.g:7045:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalGreedySnake.g:7045:3: rule__Multiplication__OperatorAssignment_1_1
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
    // InternalGreedySnake.g:7053:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7057:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalGreedySnake.g:7058:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalGreedySnake.g:7064:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7068:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalGreedySnake.g:7069:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalGreedySnake.g:7069:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalGreedySnake.g:7070:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalGreedySnake.g:7071:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalGreedySnake.g:7071:3: rule__Multiplication__RightAssignment_1_2
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
    // InternalGreedySnake.g:7080:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7084:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalGreedySnake.g:7085:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalGreedySnake.g:7092:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7096:1: ( ( '(' ) )
            // InternalGreedySnake.g:7097:1: ( '(' )
            {
            // InternalGreedySnake.g:7097:1: ( '(' )
            // InternalGreedySnake.g:7098:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGreedySnake.g:7107:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7111:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalGreedySnake.g:7112:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
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
    // InternalGreedySnake.g:7119:1: rule__Primary__Group_2__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7123:1: ( ( ruleAddition ) )
            // InternalGreedySnake.g:7124:1: ( ruleAddition )
            {
            // InternalGreedySnake.g:7124:1: ( ruleAddition )
            // InternalGreedySnake.g:7125:2: ruleAddition
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
    // InternalGreedySnake.g:7134:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7138:1: ( rule__Primary__Group_2__2__Impl )
            // InternalGreedySnake.g:7139:2: rule__Primary__Group_2__2__Impl
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
    // InternalGreedySnake.g:7145:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7149:1: ( ( ')' ) )
            // InternalGreedySnake.g:7150:1: ( ')' )
            {
            // InternalGreedySnake.g:7150:1: ( ')' )
            // InternalGreedySnake.g:7151:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGreedySnake.g:7161:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7165:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalGreedySnake.g:7166:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_62);
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
    // InternalGreedySnake.g:7173:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7177:1: ( ( ( RULE_INT )? ) )
            // InternalGreedySnake.g:7178:1: ( ( RULE_INT )? )
            {
            // InternalGreedySnake.g:7178:1: ( ( RULE_INT )? )
            // InternalGreedySnake.g:7179:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalGreedySnake.g:7180:2: ( RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGreedySnake.g:7180:3: RULE_INT
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
    // InternalGreedySnake.g:7188:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7192:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalGreedySnake.g:7193:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
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
    // InternalGreedySnake.g:7200:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7204:1: ( ( '.' ) )
            // InternalGreedySnake.g:7205:1: ( '.' )
            {
            // InternalGreedySnake.g:7205:1: ( '.' )
            // InternalGreedySnake.g:7206:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalGreedySnake.g:7215:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7219:1: ( rule__REAL__Group__2__Impl )
            // InternalGreedySnake.g:7220:2: rule__REAL__Group__2__Impl
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
    // InternalGreedySnake.g:7226:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7230:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:7231:1: ( RULE_INT )
            {
            // InternalGreedySnake.g:7231:1: ( RULE_INT )
            // InternalGreedySnake.g:7232:2: RULE_INT
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
    // InternalGreedySnake.g:7242:1: rule__RestartMenu__Group__0 : rule__RestartMenu__Group__0__Impl rule__RestartMenu__Group__1 ;
    public final void rule__RestartMenu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7246:1: ( rule__RestartMenu__Group__0__Impl rule__RestartMenu__Group__1 )
            // InternalGreedySnake.g:7247:2: rule__RestartMenu__Group__0__Impl rule__RestartMenu__Group__1
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
    // InternalGreedySnake.g:7254:1: rule__RestartMenu__Group__0__Impl : ( 'restartGame' ) ;
    public final void rule__RestartMenu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7258:1: ( ( 'restartGame' ) )
            // InternalGreedySnake.g:7259:1: ( 'restartGame' )
            {
            // InternalGreedySnake.g:7259:1: ( 'restartGame' )
            // InternalGreedySnake.g:7260:2: 'restartGame'
            {
             before(grammarAccess.getRestartMenuAccess().getRestartGameKeyword_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalGreedySnake.g:7269:1: rule__RestartMenu__Group__1 : rule__RestartMenu__Group__1__Impl ;
    public final void rule__RestartMenu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7273:1: ( rule__RestartMenu__Group__1__Impl )
            // InternalGreedySnake.g:7274:2: rule__RestartMenu__Group__1__Impl
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
    // InternalGreedySnake.g:7280:1: rule__RestartMenu__Group__1__Impl : ( () ) ;
    public final void rule__RestartMenu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7284:1: ( ( () ) )
            // InternalGreedySnake.g:7285:1: ( () )
            {
            // InternalGreedySnake.g:7285:1: ( () )
            // InternalGreedySnake.g:7286:2: ()
            {
             before(grammarAccess.getRestartMenuAccess().getRestartMenuAction_1()); 
            // InternalGreedySnake.g:7287:2: ()
            // InternalGreedySnake.g:7287:3: 
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
    // InternalGreedySnake.g:7296:1: rule__StartFieldDeclaration__Group__0 : rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 ;
    public final void rule__StartFieldDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7300:1: ( rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 )
            // InternalGreedySnake.g:7301:2: rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1
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
    // InternalGreedySnake.g:7308:1: rule__StartFieldDeclaration__Group__0__Impl : ( 'start' ) ;
    public final void rule__StartFieldDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7312:1: ( ( 'start' ) )
            // InternalGreedySnake.g:7313:1: ( 'start' )
            {
            // InternalGreedySnake.g:7313:1: ( 'start' )
            // InternalGreedySnake.g:7314:2: 'start'
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalGreedySnake.g:7323:1: rule__StartFieldDeclaration__Group__1 : rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 ;
    public final void rule__StartFieldDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7327:1: ( rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 )
            // InternalGreedySnake.g:7328:2: rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2
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
    // InternalGreedySnake.g:7335:1: rule__StartFieldDeclaration__Group__1__Impl : ( '=' ) ;
    public final void rule__StartFieldDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7339:1: ( ( '=' ) )
            // InternalGreedySnake.g:7340:1: ( '=' )
            {
            // InternalGreedySnake.g:7340:1: ( '=' )
            // InternalGreedySnake.g:7341:2: '='
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:7350:1: rule__StartFieldDeclaration__Group__2 : rule__StartFieldDeclaration__Group__2__Impl ;
    public final void rule__StartFieldDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7354:1: ( rule__StartFieldDeclaration__Group__2__Impl )
            // InternalGreedySnake.g:7355:2: rule__StartFieldDeclaration__Group__2__Impl
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
    // InternalGreedySnake.g:7361:1: rule__StartFieldDeclaration__Group__2__Impl : ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) ) ;
    public final void rule__StartFieldDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7365:1: ( ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) ) )
            // InternalGreedySnake.g:7366:1: ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) )
            {
            // InternalGreedySnake.g:7366:1: ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) )
            // InternalGreedySnake.g:7367:2: ( rule__StartFieldDeclaration__FieldAssignment_2 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldAssignment_2()); 
            // InternalGreedySnake.g:7368:2: ( rule__StartFieldDeclaration__FieldAssignment_2 )
            // InternalGreedySnake.g:7368:3: rule__StartFieldDeclaration__FieldAssignment_2
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
    // InternalGreedySnake.g:7377:1: rule__AboutSpecification__Group__0 : rule__AboutSpecification__Group__0__Impl rule__AboutSpecification__Group__1 ;
    public final void rule__AboutSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7381:1: ( rule__AboutSpecification__Group__0__Impl rule__AboutSpecification__Group__1 )
            // InternalGreedySnake.g:7382:2: rule__AboutSpecification__Group__0__Impl rule__AboutSpecification__Group__1
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
    // InternalGreedySnake.g:7389:1: rule__AboutSpecification__Group__0__Impl : ( 'about' ) ;
    public final void rule__AboutSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7393:1: ( ( 'about' ) )
            // InternalGreedySnake.g:7394:1: ( 'about' )
            {
            // InternalGreedySnake.g:7394:1: ( 'about' )
            // InternalGreedySnake.g:7395:2: 'about'
            {
             before(grammarAccess.getAboutSpecificationAccess().getAboutKeyword_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalGreedySnake.g:7404:1: rule__AboutSpecification__Group__1 : rule__AboutSpecification__Group__1__Impl rule__AboutSpecification__Group__2 ;
    public final void rule__AboutSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7408:1: ( rule__AboutSpecification__Group__1__Impl rule__AboutSpecification__Group__2 )
            // InternalGreedySnake.g:7409:2: rule__AboutSpecification__Group__1__Impl rule__AboutSpecification__Group__2
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
    // InternalGreedySnake.g:7416:1: rule__AboutSpecification__Group__1__Impl : ( ( rule__AboutSpecification__NameAssignment_1 ) ) ;
    public final void rule__AboutSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7420:1: ( ( ( rule__AboutSpecification__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:7421:1: ( ( rule__AboutSpecification__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:7421:1: ( ( rule__AboutSpecification__NameAssignment_1 ) )
            // InternalGreedySnake.g:7422:2: ( rule__AboutSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getAboutSpecificationAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:7423:2: ( rule__AboutSpecification__NameAssignment_1 )
            // InternalGreedySnake.g:7423:3: rule__AboutSpecification__NameAssignment_1
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
    // InternalGreedySnake.g:7431:1: rule__AboutSpecification__Group__2 : rule__AboutSpecification__Group__2__Impl rule__AboutSpecification__Group__3 ;
    public final void rule__AboutSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7435:1: ( rule__AboutSpecification__Group__2__Impl rule__AboutSpecification__Group__3 )
            // InternalGreedySnake.g:7436:2: rule__AboutSpecification__Group__2__Impl rule__AboutSpecification__Group__3
            {
            pushFollow(FOLLOW_63);
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
    // InternalGreedySnake.g:7443:1: rule__AboutSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__AboutSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7447:1: ( ( '{' ) )
            // InternalGreedySnake.g:7448:1: ( '{' )
            {
            // InternalGreedySnake.g:7448:1: ( '{' )
            // InternalGreedySnake.g:7449:2: '{'
            {
             before(grammarAccess.getAboutSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:7458:1: rule__AboutSpecification__Group__3 : rule__AboutSpecification__Group__3__Impl rule__AboutSpecification__Group__4 ;
    public final void rule__AboutSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7462:1: ( rule__AboutSpecification__Group__3__Impl rule__AboutSpecification__Group__4 )
            // InternalGreedySnake.g:7463:2: rule__AboutSpecification__Group__3__Impl rule__AboutSpecification__Group__4
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
    // InternalGreedySnake.g:7470:1: rule__AboutSpecification__Group__3__Impl : ( 'Title' ) ;
    public final void rule__AboutSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7474:1: ( ( 'Title' ) )
            // InternalGreedySnake.g:7475:1: ( 'Title' )
            {
            // InternalGreedySnake.g:7475:1: ( 'Title' )
            // InternalGreedySnake.g:7476:2: 'Title'
            {
             before(grammarAccess.getAboutSpecificationAccess().getTitleKeyword_3()); 
            match(input,75,FOLLOW_2); 
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
    // InternalGreedySnake.g:7485:1: rule__AboutSpecification__Group__4 : rule__AboutSpecification__Group__4__Impl rule__AboutSpecification__Group__5 ;
    public final void rule__AboutSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7489:1: ( rule__AboutSpecification__Group__4__Impl rule__AboutSpecification__Group__5 )
            // InternalGreedySnake.g:7490:2: rule__AboutSpecification__Group__4__Impl rule__AboutSpecification__Group__5
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
    // InternalGreedySnake.g:7497:1: rule__AboutSpecification__Group__4__Impl : ( ':' ) ;
    public final void rule__AboutSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7501:1: ( ( ':' ) )
            // InternalGreedySnake.g:7502:1: ( ':' )
            {
            // InternalGreedySnake.g:7502:1: ( ':' )
            // InternalGreedySnake.g:7503:2: ':'
            {
             before(grammarAccess.getAboutSpecificationAccess().getColonKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGreedySnake.g:7512:1: rule__AboutSpecification__Group__5 : rule__AboutSpecification__Group__5__Impl rule__AboutSpecification__Group__6 ;
    public final void rule__AboutSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7516:1: ( rule__AboutSpecification__Group__5__Impl rule__AboutSpecification__Group__6 )
            // InternalGreedySnake.g:7517:2: rule__AboutSpecification__Group__5__Impl rule__AboutSpecification__Group__6
            {
            pushFollow(FOLLOW_64);
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
    // InternalGreedySnake.g:7524:1: rule__AboutSpecification__Group__5__Impl : ( ( rule__AboutSpecification__AboutTitleAssignment_5 ) ) ;
    public final void rule__AboutSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7528:1: ( ( ( rule__AboutSpecification__AboutTitleAssignment_5 ) ) )
            // InternalGreedySnake.g:7529:1: ( ( rule__AboutSpecification__AboutTitleAssignment_5 ) )
            {
            // InternalGreedySnake.g:7529:1: ( ( rule__AboutSpecification__AboutTitleAssignment_5 ) )
            // InternalGreedySnake.g:7530:2: ( rule__AboutSpecification__AboutTitleAssignment_5 )
            {
             before(grammarAccess.getAboutSpecificationAccess().getAboutTitleAssignment_5()); 
            // InternalGreedySnake.g:7531:2: ( rule__AboutSpecification__AboutTitleAssignment_5 )
            // InternalGreedySnake.g:7531:3: rule__AboutSpecification__AboutTitleAssignment_5
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
    // InternalGreedySnake.g:7539:1: rule__AboutSpecification__Group__6 : rule__AboutSpecification__Group__6__Impl rule__AboutSpecification__Group__7 ;
    public final void rule__AboutSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7543:1: ( rule__AboutSpecification__Group__6__Impl rule__AboutSpecification__Group__7 )
            // InternalGreedySnake.g:7544:2: rule__AboutSpecification__Group__6__Impl rule__AboutSpecification__Group__7
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
    // InternalGreedySnake.g:7551:1: rule__AboutSpecification__Group__6__Impl : ( 'Information' ) ;
    public final void rule__AboutSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7555:1: ( ( 'Information' ) )
            // InternalGreedySnake.g:7556:1: ( 'Information' )
            {
            // InternalGreedySnake.g:7556:1: ( 'Information' )
            // InternalGreedySnake.g:7557:2: 'Information'
            {
             before(grammarAccess.getAboutSpecificationAccess().getInformationKeyword_6()); 
            match(input,76,FOLLOW_2); 
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
    // InternalGreedySnake.g:7566:1: rule__AboutSpecification__Group__7 : rule__AboutSpecification__Group__7__Impl rule__AboutSpecification__Group__8 ;
    public final void rule__AboutSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7570:1: ( rule__AboutSpecification__Group__7__Impl rule__AboutSpecification__Group__8 )
            // InternalGreedySnake.g:7571:2: rule__AboutSpecification__Group__7__Impl rule__AboutSpecification__Group__8
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
    // InternalGreedySnake.g:7578:1: rule__AboutSpecification__Group__7__Impl : ( ':' ) ;
    public final void rule__AboutSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7582:1: ( ( ':' ) )
            // InternalGreedySnake.g:7583:1: ( ':' )
            {
            // InternalGreedySnake.g:7583:1: ( ':' )
            // InternalGreedySnake.g:7584:2: ':'
            {
             before(grammarAccess.getAboutSpecificationAccess().getColonKeyword_7()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGreedySnake.g:7593:1: rule__AboutSpecification__Group__8 : rule__AboutSpecification__Group__8__Impl rule__AboutSpecification__Group__9 ;
    public final void rule__AboutSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7597:1: ( rule__AboutSpecification__Group__8__Impl rule__AboutSpecification__Group__9 )
            // InternalGreedySnake.g:7598:2: rule__AboutSpecification__Group__8__Impl rule__AboutSpecification__Group__9
            {
            pushFollow(FOLLOW_65);
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
    // InternalGreedySnake.g:7605:1: rule__AboutSpecification__Group__8__Impl : ( ( rule__AboutSpecification__AboutInforAssignment_8 ) ) ;
    public final void rule__AboutSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7609:1: ( ( ( rule__AboutSpecification__AboutInforAssignment_8 ) ) )
            // InternalGreedySnake.g:7610:1: ( ( rule__AboutSpecification__AboutInforAssignment_8 ) )
            {
            // InternalGreedySnake.g:7610:1: ( ( rule__AboutSpecification__AboutInforAssignment_8 ) )
            // InternalGreedySnake.g:7611:2: ( rule__AboutSpecification__AboutInforAssignment_8 )
            {
             before(grammarAccess.getAboutSpecificationAccess().getAboutInforAssignment_8()); 
            // InternalGreedySnake.g:7612:2: ( rule__AboutSpecification__AboutInforAssignment_8 )
            // InternalGreedySnake.g:7612:3: rule__AboutSpecification__AboutInforAssignment_8
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
    // InternalGreedySnake.g:7620:1: rule__AboutSpecification__Group__9 : rule__AboutSpecification__Group__9__Impl rule__AboutSpecification__Group__10 ;
    public final void rule__AboutSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7624:1: ( rule__AboutSpecification__Group__9__Impl rule__AboutSpecification__Group__10 )
            // InternalGreedySnake.g:7625:2: rule__AboutSpecification__Group__9__Impl rule__AboutSpecification__Group__10
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
    // InternalGreedySnake.g:7632:1: rule__AboutSpecification__Group__9__Impl : ( 'Label_size' ) ;
    public final void rule__AboutSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7636:1: ( ( 'Label_size' ) )
            // InternalGreedySnake.g:7637:1: ( 'Label_size' )
            {
            // InternalGreedySnake.g:7637:1: ( 'Label_size' )
            // InternalGreedySnake.g:7638:2: 'Label_size'
            {
             before(grammarAccess.getAboutSpecificationAccess().getLabel_sizeKeyword_9()); 
            match(input,77,FOLLOW_2); 
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
    // InternalGreedySnake.g:7647:1: rule__AboutSpecification__Group__10 : rule__AboutSpecification__Group__10__Impl rule__AboutSpecification__Group__11 ;
    public final void rule__AboutSpecification__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7651:1: ( rule__AboutSpecification__Group__10__Impl rule__AboutSpecification__Group__11 )
            // InternalGreedySnake.g:7652:2: rule__AboutSpecification__Group__10__Impl rule__AboutSpecification__Group__11
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
    // InternalGreedySnake.g:7659:1: rule__AboutSpecification__Group__10__Impl : ( ':' ) ;
    public final void rule__AboutSpecification__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7663:1: ( ( ':' ) )
            // InternalGreedySnake.g:7664:1: ( ':' )
            {
            // InternalGreedySnake.g:7664:1: ( ':' )
            // InternalGreedySnake.g:7665:2: ':'
            {
             before(grammarAccess.getAboutSpecificationAccess().getColonKeyword_10()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGreedySnake.g:7674:1: rule__AboutSpecification__Group__11 : rule__AboutSpecification__Group__11__Impl rule__AboutSpecification__Group__12 ;
    public final void rule__AboutSpecification__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7678:1: ( rule__AboutSpecification__Group__11__Impl rule__AboutSpecification__Group__12 )
            // InternalGreedySnake.g:7679:2: rule__AboutSpecification__Group__11__Impl rule__AboutSpecification__Group__12
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
    // InternalGreedySnake.g:7686:1: rule__AboutSpecification__Group__11__Impl : ( '(' ) ;
    public final void rule__AboutSpecification__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7690:1: ( ( '(' ) )
            // InternalGreedySnake.g:7691:1: ( '(' )
            {
            // InternalGreedySnake.g:7691:1: ( '(' )
            // InternalGreedySnake.g:7692:2: '('
            {
             before(grammarAccess.getAboutSpecificationAccess().getLeftParenthesisKeyword_11()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGreedySnake.g:7701:1: rule__AboutSpecification__Group__12 : rule__AboutSpecification__Group__12__Impl rule__AboutSpecification__Group__13 ;
    public final void rule__AboutSpecification__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7705:1: ( rule__AboutSpecification__Group__12__Impl rule__AboutSpecification__Group__13 )
            // InternalGreedySnake.g:7706:2: rule__AboutSpecification__Group__12__Impl rule__AboutSpecification__Group__13
            {
            pushFollow(FOLLOW_43);
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
    // InternalGreedySnake.g:7713:1: rule__AboutSpecification__Group__12__Impl : ( ( rule__AboutSpecification__XAssignment_12 ) ) ;
    public final void rule__AboutSpecification__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7717:1: ( ( ( rule__AboutSpecification__XAssignment_12 ) ) )
            // InternalGreedySnake.g:7718:1: ( ( rule__AboutSpecification__XAssignment_12 ) )
            {
            // InternalGreedySnake.g:7718:1: ( ( rule__AboutSpecification__XAssignment_12 ) )
            // InternalGreedySnake.g:7719:2: ( rule__AboutSpecification__XAssignment_12 )
            {
             before(grammarAccess.getAboutSpecificationAccess().getXAssignment_12()); 
            // InternalGreedySnake.g:7720:2: ( rule__AboutSpecification__XAssignment_12 )
            // InternalGreedySnake.g:7720:3: rule__AboutSpecification__XAssignment_12
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
    // InternalGreedySnake.g:7728:1: rule__AboutSpecification__Group__13 : rule__AboutSpecification__Group__13__Impl rule__AboutSpecification__Group__14 ;
    public final void rule__AboutSpecification__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7732:1: ( rule__AboutSpecification__Group__13__Impl rule__AboutSpecification__Group__14 )
            // InternalGreedySnake.g:7733:2: rule__AboutSpecification__Group__13__Impl rule__AboutSpecification__Group__14
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
    // InternalGreedySnake.g:7740:1: rule__AboutSpecification__Group__13__Impl : ( ',' ) ;
    public final void rule__AboutSpecification__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7744:1: ( ( ',' ) )
            // InternalGreedySnake.g:7745:1: ( ',' )
            {
            // InternalGreedySnake.g:7745:1: ( ',' )
            // InternalGreedySnake.g:7746:2: ','
            {
             before(grammarAccess.getAboutSpecificationAccess().getCommaKeyword_13()); 
            match(input,55,FOLLOW_2); 
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
    // InternalGreedySnake.g:7755:1: rule__AboutSpecification__Group__14 : rule__AboutSpecification__Group__14__Impl rule__AboutSpecification__Group__15 ;
    public final void rule__AboutSpecification__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7759:1: ( rule__AboutSpecification__Group__14__Impl rule__AboutSpecification__Group__15 )
            // InternalGreedySnake.g:7760:2: rule__AboutSpecification__Group__14__Impl rule__AboutSpecification__Group__15
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
    // InternalGreedySnake.g:7767:1: rule__AboutSpecification__Group__14__Impl : ( ( rule__AboutSpecification__YAssignment_14 ) ) ;
    public final void rule__AboutSpecification__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7771:1: ( ( ( rule__AboutSpecification__YAssignment_14 ) ) )
            // InternalGreedySnake.g:7772:1: ( ( rule__AboutSpecification__YAssignment_14 ) )
            {
            // InternalGreedySnake.g:7772:1: ( ( rule__AboutSpecification__YAssignment_14 ) )
            // InternalGreedySnake.g:7773:2: ( rule__AboutSpecification__YAssignment_14 )
            {
             before(grammarAccess.getAboutSpecificationAccess().getYAssignment_14()); 
            // InternalGreedySnake.g:7774:2: ( rule__AboutSpecification__YAssignment_14 )
            // InternalGreedySnake.g:7774:3: rule__AboutSpecification__YAssignment_14
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
    // InternalGreedySnake.g:7782:1: rule__AboutSpecification__Group__15 : rule__AboutSpecification__Group__15__Impl rule__AboutSpecification__Group__16 ;
    public final void rule__AboutSpecification__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7786:1: ( rule__AboutSpecification__Group__15__Impl rule__AboutSpecification__Group__16 )
            // InternalGreedySnake.g:7787:2: rule__AboutSpecification__Group__15__Impl rule__AboutSpecification__Group__16
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
    // InternalGreedySnake.g:7794:1: rule__AboutSpecification__Group__15__Impl : ( ')' ) ;
    public final void rule__AboutSpecification__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7798:1: ( ( ')' ) )
            // InternalGreedySnake.g:7799:1: ( ')' )
            {
            // InternalGreedySnake.g:7799:1: ( ')' )
            // InternalGreedySnake.g:7800:2: ')'
            {
             before(grammarAccess.getAboutSpecificationAccess().getRightParenthesisKeyword_15()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGreedySnake.g:7809:1: rule__AboutSpecification__Group__16 : rule__AboutSpecification__Group__16__Impl ;
    public final void rule__AboutSpecification__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7813:1: ( rule__AboutSpecification__Group__16__Impl )
            // InternalGreedySnake.g:7814:2: rule__AboutSpecification__Group__16__Impl
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
    // InternalGreedySnake.g:7820:1: rule__AboutSpecification__Group__16__Impl : ( '}' ) ;
    public final void rule__AboutSpecification__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7824:1: ( ( '}' ) )
            // InternalGreedySnake.g:7825:1: ( '}' )
            {
            // InternalGreedySnake.g:7825:1: ( '}' )
            // InternalGreedySnake.g:7826:2: '}'
            {
             before(grammarAccess.getAboutSpecificationAccess().getRightCurlyBracketKeyword_16()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:7836:1: rule__HelpSpecification__Group__0 : rule__HelpSpecification__Group__0__Impl rule__HelpSpecification__Group__1 ;
    public final void rule__HelpSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7840:1: ( rule__HelpSpecification__Group__0__Impl rule__HelpSpecification__Group__1 )
            // InternalGreedySnake.g:7841:2: rule__HelpSpecification__Group__0__Impl rule__HelpSpecification__Group__1
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
    // InternalGreedySnake.g:7848:1: rule__HelpSpecification__Group__0__Impl : ( 'help' ) ;
    public final void rule__HelpSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7852:1: ( ( 'help' ) )
            // InternalGreedySnake.g:7853:1: ( 'help' )
            {
            // InternalGreedySnake.g:7853:1: ( 'help' )
            // InternalGreedySnake.g:7854:2: 'help'
            {
             before(grammarAccess.getHelpSpecificationAccess().getHelpKeyword_0()); 
            match(input,78,FOLLOW_2); 
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
    // InternalGreedySnake.g:7863:1: rule__HelpSpecification__Group__1 : rule__HelpSpecification__Group__1__Impl rule__HelpSpecification__Group__2 ;
    public final void rule__HelpSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7867:1: ( rule__HelpSpecification__Group__1__Impl rule__HelpSpecification__Group__2 )
            // InternalGreedySnake.g:7868:2: rule__HelpSpecification__Group__1__Impl rule__HelpSpecification__Group__2
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
    // InternalGreedySnake.g:7875:1: rule__HelpSpecification__Group__1__Impl : ( ( rule__HelpSpecification__NameAssignment_1 ) ) ;
    public final void rule__HelpSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7879:1: ( ( ( rule__HelpSpecification__NameAssignment_1 ) ) )
            // InternalGreedySnake.g:7880:1: ( ( rule__HelpSpecification__NameAssignment_1 ) )
            {
            // InternalGreedySnake.g:7880:1: ( ( rule__HelpSpecification__NameAssignment_1 ) )
            // InternalGreedySnake.g:7881:2: ( rule__HelpSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getHelpSpecificationAccess().getNameAssignment_1()); 
            // InternalGreedySnake.g:7882:2: ( rule__HelpSpecification__NameAssignment_1 )
            // InternalGreedySnake.g:7882:3: rule__HelpSpecification__NameAssignment_1
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
    // InternalGreedySnake.g:7890:1: rule__HelpSpecification__Group__2 : rule__HelpSpecification__Group__2__Impl rule__HelpSpecification__Group__3 ;
    public final void rule__HelpSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7894:1: ( rule__HelpSpecification__Group__2__Impl rule__HelpSpecification__Group__3 )
            // InternalGreedySnake.g:7895:2: rule__HelpSpecification__Group__2__Impl rule__HelpSpecification__Group__3
            {
            pushFollow(FOLLOW_63);
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
    // InternalGreedySnake.g:7902:1: rule__HelpSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__HelpSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7906:1: ( ( '{' ) )
            // InternalGreedySnake.g:7907:1: ( '{' )
            {
            // InternalGreedySnake.g:7907:1: ( '{' )
            // InternalGreedySnake.g:7908:2: '{'
            {
             before(grammarAccess.getHelpSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:7917:1: rule__HelpSpecification__Group__3 : rule__HelpSpecification__Group__3__Impl rule__HelpSpecification__Group__4 ;
    public final void rule__HelpSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7921:1: ( rule__HelpSpecification__Group__3__Impl rule__HelpSpecification__Group__4 )
            // InternalGreedySnake.g:7922:2: rule__HelpSpecification__Group__3__Impl rule__HelpSpecification__Group__4
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
    // InternalGreedySnake.g:7929:1: rule__HelpSpecification__Group__3__Impl : ( 'Title' ) ;
    public final void rule__HelpSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7933:1: ( ( 'Title' ) )
            // InternalGreedySnake.g:7934:1: ( 'Title' )
            {
            // InternalGreedySnake.g:7934:1: ( 'Title' )
            // InternalGreedySnake.g:7935:2: 'Title'
            {
             before(grammarAccess.getHelpSpecificationAccess().getTitleKeyword_3()); 
            match(input,75,FOLLOW_2); 
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
    // InternalGreedySnake.g:7944:1: rule__HelpSpecification__Group__4 : rule__HelpSpecification__Group__4__Impl rule__HelpSpecification__Group__5 ;
    public final void rule__HelpSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7948:1: ( rule__HelpSpecification__Group__4__Impl rule__HelpSpecification__Group__5 )
            // InternalGreedySnake.g:7949:2: rule__HelpSpecification__Group__4__Impl rule__HelpSpecification__Group__5
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
    // InternalGreedySnake.g:7956:1: rule__HelpSpecification__Group__4__Impl : ( ':' ) ;
    public final void rule__HelpSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7960:1: ( ( ':' ) )
            // InternalGreedySnake.g:7961:1: ( ':' )
            {
            // InternalGreedySnake.g:7961:1: ( ':' )
            // InternalGreedySnake.g:7962:2: ':'
            {
             before(grammarAccess.getHelpSpecificationAccess().getColonKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGreedySnake.g:7971:1: rule__HelpSpecification__Group__5 : rule__HelpSpecification__Group__5__Impl rule__HelpSpecification__Group__6 ;
    public final void rule__HelpSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7975:1: ( rule__HelpSpecification__Group__5__Impl rule__HelpSpecification__Group__6 )
            // InternalGreedySnake.g:7976:2: rule__HelpSpecification__Group__5__Impl rule__HelpSpecification__Group__6
            {
            pushFollow(FOLLOW_64);
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
    // InternalGreedySnake.g:7983:1: rule__HelpSpecification__Group__5__Impl : ( ( rule__HelpSpecification__HelpTitleAssignment_5 ) ) ;
    public final void rule__HelpSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:7987:1: ( ( ( rule__HelpSpecification__HelpTitleAssignment_5 ) ) )
            // InternalGreedySnake.g:7988:1: ( ( rule__HelpSpecification__HelpTitleAssignment_5 ) )
            {
            // InternalGreedySnake.g:7988:1: ( ( rule__HelpSpecification__HelpTitleAssignment_5 ) )
            // InternalGreedySnake.g:7989:2: ( rule__HelpSpecification__HelpTitleAssignment_5 )
            {
             before(grammarAccess.getHelpSpecificationAccess().getHelpTitleAssignment_5()); 
            // InternalGreedySnake.g:7990:2: ( rule__HelpSpecification__HelpTitleAssignment_5 )
            // InternalGreedySnake.g:7990:3: rule__HelpSpecification__HelpTitleAssignment_5
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
    // InternalGreedySnake.g:7998:1: rule__HelpSpecification__Group__6 : rule__HelpSpecification__Group__6__Impl rule__HelpSpecification__Group__7 ;
    public final void rule__HelpSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8002:1: ( rule__HelpSpecification__Group__6__Impl rule__HelpSpecification__Group__7 )
            // InternalGreedySnake.g:8003:2: rule__HelpSpecification__Group__6__Impl rule__HelpSpecification__Group__7
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
    // InternalGreedySnake.g:8010:1: rule__HelpSpecification__Group__6__Impl : ( 'Information' ) ;
    public final void rule__HelpSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8014:1: ( ( 'Information' ) )
            // InternalGreedySnake.g:8015:1: ( 'Information' )
            {
            // InternalGreedySnake.g:8015:1: ( 'Information' )
            // InternalGreedySnake.g:8016:2: 'Information'
            {
             before(grammarAccess.getHelpSpecificationAccess().getInformationKeyword_6()); 
            match(input,76,FOLLOW_2); 
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
    // InternalGreedySnake.g:8025:1: rule__HelpSpecification__Group__7 : rule__HelpSpecification__Group__7__Impl rule__HelpSpecification__Group__8 ;
    public final void rule__HelpSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8029:1: ( rule__HelpSpecification__Group__7__Impl rule__HelpSpecification__Group__8 )
            // InternalGreedySnake.g:8030:2: rule__HelpSpecification__Group__7__Impl rule__HelpSpecification__Group__8
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
    // InternalGreedySnake.g:8037:1: rule__HelpSpecification__Group__7__Impl : ( ':' ) ;
    public final void rule__HelpSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8041:1: ( ( ':' ) )
            // InternalGreedySnake.g:8042:1: ( ':' )
            {
            // InternalGreedySnake.g:8042:1: ( ':' )
            // InternalGreedySnake.g:8043:2: ':'
            {
             before(grammarAccess.getHelpSpecificationAccess().getColonKeyword_7()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGreedySnake.g:8052:1: rule__HelpSpecification__Group__8 : rule__HelpSpecification__Group__8__Impl rule__HelpSpecification__Group__9 ;
    public final void rule__HelpSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8056:1: ( rule__HelpSpecification__Group__8__Impl rule__HelpSpecification__Group__9 )
            // InternalGreedySnake.g:8057:2: rule__HelpSpecification__Group__8__Impl rule__HelpSpecification__Group__9
            {
            pushFollow(FOLLOW_65);
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
    // InternalGreedySnake.g:8064:1: rule__HelpSpecification__Group__8__Impl : ( ( rule__HelpSpecification__HelpInforAssignment_8 ) ) ;
    public final void rule__HelpSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8068:1: ( ( ( rule__HelpSpecification__HelpInforAssignment_8 ) ) )
            // InternalGreedySnake.g:8069:1: ( ( rule__HelpSpecification__HelpInforAssignment_8 ) )
            {
            // InternalGreedySnake.g:8069:1: ( ( rule__HelpSpecification__HelpInforAssignment_8 ) )
            // InternalGreedySnake.g:8070:2: ( rule__HelpSpecification__HelpInforAssignment_8 )
            {
             before(grammarAccess.getHelpSpecificationAccess().getHelpInforAssignment_8()); 
            // InternalGreedySnake.g:8071:2: ( rule__HelpSpecification__HelpInforAssignment_8 )
            // InternalGreedySnake.g:8071:3: rule__HelpSpecification__HelpInforAssignment_8
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
    // InternalGreedySnake.g:8079:1: rule__HelpSpecification__Group__9 : rule__HelpSpecification__Group__9__Impl rule__HelpSpecification__Group__10 ;
    public final void rule__HelpSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8083:1: ( rule__HelpSpecification__Group__9__Impl rule__HelpSpecification__Group__10 )
            // InternalGreedySnake.g:8084:2: rule__HelpSpecification__Group__9__Impl rule__HelpSpecification__Group__10
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
    // InternalGreedySnake.g:8091:1: rule__HelpSpecification__Group__9__Impl : ( 'Label_size' ) ;
    public final void rule__HelpSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8095:1: ( ( 'Label_size' ) )
            // InternalGreedySnake.g:8096:1: ( 'Label_size' )
            {
            // InternalGreedySnake.g:8096:1: ( 'Label_size' )
            // InternalGreedySnake.g:8097:2: 'Label_size'
            {
             before(grammarAccess.getHelpSpecificationAccess().getLabel_sizeKeyword_9()); 
            match(input,77,FOLLOW_2); 
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
    // InternalGreedySnake.g:8106:1: rule__HelpSpecification__Group__10 : rule__HelpSpecification__Group__10__Impl rule__HelpSpecification__Group__11 ;
    public final void rule__HelpSpecification__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8110:1: ( rule__HelpSpecification__Group__10__Impl rule__HelpSpecification__Group__11 )
            // InternalGreedySnake.g:8111:2: rule__HelpSpecification__Group__10__Impl rule__HelpSpecification__Group__11
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
    // InternalGreedySnake.g:8118:1: rule__HelpSpecification__Group__10__Impl : ( ':' ) ;
    public final void rule__HelpSpecification__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8122:1: ( ( ':' ) )
            // InternalGreedySnake.g:8123:1: ( ':' )
            {
            // InternalGreedySnake.g:8123:1: ( ':' )
            // InternalGreedySnake.g:8124:2: ':'
            {
             before(grammarAccess.getHelpSpecificationAccess().getColonKeyword_10()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGreedySnake.g:8133:1: rule__HelpSpecification__Group__11 : rule__HelpSpecification__Group__11__Impl rule__HelpSpecification__Group__12 ;
    public final void rule__HelpSpecification__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8137:1: ( rule__HelpSpecification__Group__11__Impl rule__HelpSpecification__Group__12 )
            // InternalGreedySnake.g:8138:2: rule__HelpSpecification__Group__11__Impl rule__HelpSpecification__Group__12
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
    // InternalGreedySnake.g:8145:1: rule__HelpSpecification__Group__11__Impl : ( '(' ) ;
    public final void rule__HelpSpecification__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8149:1: ( ( '(' ) )
            // InternalGreedySnake.g:8150:1: ( '(' )
            {
            // InternalGreedySnake.g:8150:1: ( '(' )
            // InternalGreedySnake.g:8151:2: '('
            {
             before(grammarAccess.getHelpSpecificationAccess().getLeftParenthesisKeyword_11()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGreedySnake.g:8160:1: rule__HelpSpecification__Group__12 : rule__HelpSpecification__Group__12__Impl rule__HelpSpecification__Group__13 ;
    public final void rule__HelpSpecification__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8164:1: ( rule__HelpSpecification__Group__12__Impl rule__HelpSpecification__Group__13 )
            // InternalGreedySnake.g:8165:2: rule__HelpSpecification__Group__12__Impl rule__HelpSpecification__Group__13
            {
            pushFollow(FOLLOW_43);
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
    // InternalGreedySnake.g:8172:1: rule__HelpSpecification__Group__12__Impl : ( ( rule__HelpSpecification__XAssignment_12 ) ) ;
    public final void rule__HelpSpecification__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8176:1: ( ( ( rule__HelpSpecification__XAssignment_12 ) ) )
            // InternalGreedySnake.g:8177:1: ( ( rule__HelpSpecification__XAssignment_12 ) )
            {
            // InternalGreedySnake.g:8177:1: ( ( rule__HelpSpecification__XAssignment_12 ) )
            // InternalGreedySnake.g:8178:2: ( rule__HelpSpecification__XAssignment_12 )
            {
             before(grammarAccess.getHelpSpecificationAccess().getXAssignment_12()); 
            // InternalGreedySnake.g:8179:2: ( rule__HelpSpecification__XAssignment_12 )
            // InternalGreedySnake.g:8179:3: rule__HelpSpecification__XAssignment_12
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
    // InternalGreedySnake.g:8187:1: rule__HelpSpecification__Group__13 : rule__HelpSpecification__Group__13__Impl rule__HelpSpecification__Group__14 ;
    public final void rule__HelpSpecification__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8191:1: ( rule__HelpSpecification__Group__13__Impl rule__HelpSpecification__Group__14 )
            // InternalGreedySnake.g:8192:2: rule__HelpSpecification__Group__13__Impl rule__HelpSpecification__Group__14
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
    // InternalGreedySnake.g:8199:1: rule__HelpSpecification__Group__13__Impl : ( ',' ) ;
    public final void rule__HelpSpecification__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8203:1: ( ( ',' ) )
            // InternalGreedySnake.g:8204:1: ( ',' )
            {
            // InternalGreedySnake.g:8204:1: ( ',' )
            // InternalGreedySnake.g:8205:2: ','
            {
             before(grammarAccess.getHelpSpecificationAccess().getCommaKeyword_13()); 
            match(input,55,FOLLOW_2); 
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
    // InternalGreedySnake.g:8214:1: rule__HelpSpecification__Group__14 : rule__HelpSpecification__Group__14__Impl rule__HelpSpecification__Group__15 ;
    public final void rule__HelpSpecification__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8218:1: ( rule__HelpSpecification__Group__14__Impl rule__HelpSpecification__Group__15 )
            // InternalGreedySnake.g:8219:2: rule__HelpSpecification__Group__14__Impl rule__HelpSpecification__Group__15
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
    // InternalGreedySnake.g:8226:1: rule__HelpSpecification__Group__14__Impl : ( ( rule__HelpSpecification__YAssignment_14 ) ) ;
    public final void rule__HelpSpecification__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8230:1: ( ( ( rule__HelpSpecification__YAssignment_14 ) ) )
            // InternalGreedySnake.g:8231:1: ( ( rule__HelpSpecification__YAssignment_14 ) )
            {
            // InternalGreedySnake.g:8231:1: ( ( rule__HelpSpecification__YAssignment_14 ) )
            // InternalGreedySnake.g:8232:2: ( rule__HelpSpecification__YAssignment_14 )
            {
             before(grammarAccess.getHelpSpecificationAccess().getYAssignment_14()); 
            // InternalGreedySnake.g:8233:2: ( rule__HelpSpecification__YAssignment_14 )
            // InternalGreedySnake.g:8233:3: rule__HelpSpecification__YAssignment_14
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
    // InternalGreedySnake.g:8241:1: rule__HelpSpecification__Group__15 : rule__HelpSpecification__Group__15__Impl rule__HelpSpecification__Group__16 ;
    public final void rule__HelpSpecification__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8245:1: ( rule__HelpSpecification__Group__15__Impl rule__HelpSpecification__Group__16 )
            // InternalGreedySnake.g:8246:2: rule__HelpSpecification__Group__15__Impl rule__HelpSpecification__Group__16
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
    // InternalGreedySnake.g:8253:1: rule__HelpSpecification__Group__15__Impl : ( ')' ) ;
    public final void rule__HelpSpecification__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8257:1: ( ( ')' ) )
            // InternalGreedySnake.g:8258:1: ( ')' )
            {
            // InternalGreedySnake.g:8258:1: ( ')' )
            // InternalGreedySnake.g:8259:2: ')'
            {
             before(grammarAccess.getHelpSpecificationAccess().getRightParenthesisKeyword_15()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGreedySnake.g:8268:1: rule__HelpSpecification__Group__16 : rule__HelpSpecification__Group__16__Impl ;
    public final void rule__HelpSpecification__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8272:1: ( rule__HelpSpecification__Group__16__Impl )
            // InternalGreedySnake.g:8273:2: rule__HelpSpecification__Group__16__Impl
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
    // InternalGreedySnake.g:8279:1: rule__HelpSpecification__Group__16__Impl : ( '}' ) ;
    public final void rule__HelpSpecification__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8283:1: ( ( '}' ) )
            // InternalGreedySnake.g:8284:1: ( '}' )
            {
            // InternalGreedySnake.g:8284:1: ( '}' )
            // InternalGreedySnake.g:8285:2: '}'
            {
             before(grammarAccess.getHelpSpecificationAccess().getRightCurlyBracketKeyword_16()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:8295:1: rule__BackSpecification__Group__0 : rule__BackSpecification__Group__0__Impl rule__BackSpecification__Group__1 ;
    public final void rule__BackSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8299:1: ( rule__BackSpecification__Group__0__Impl rule__BackSpecification__Group__1 )
            // InternalGreedySnake.g:8300:2: rule__BackSpecification__Group__0__Impl rule__BackSpecification__Group__1
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
    // InternalGreedySnake.g:8307:1: rule__BackSpecification__Group__0__Impl : ( 'backGround' ) ;
    public final void rule__BackSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8311:1: ( ( 'backGround' ) )
            // InternalGreedySnake.g:8312:1: ( 'backGround' )
            {
            // InternalGreedySnake.g:8312:1: ( 'backGround' )
            // InternalGreedySnake.g:8313:2: 'backGround'
            {
             before(grammarAccess.getBackSpecificationAccess().getBackGroundKeyword_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalGreedySnake.g:8322:1: rule__BackSpecification__Group__1 : rule__BackSpecification__Group__1__Impl rule__BackSpecification__Group__2 ;
    public final void rule__BackSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8326:1: ( rule__BackSpecification__Group__1__Impl rule__BackSpecification__Group__2 )
            // InternalGreedySnake.g:8327:2: rule__BackSpecification__Group__1__Impl rule__BackSpecification__Group__2
            {
            pushFollow(FOLLOW_66);
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
    // InternalGreedySnake.g:8334:1: rule__BackSpecification__Group__1__Impl : ( '{' ) ;
    public final void rule__BackSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8338:1: ( ( '{' ) )
            // InternalGreedySnake.g:8339:1: ( '{' )
            {
            // InternalGreedySnake.g:8339:1: ( '{' )
            // InternalGreedySnake.g:8340:2: '{'
            {
             before(grammarAccess.getBackSpecificationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:8349:1: rule__BackSpecification__Group__2 : rule__BackSpecification__Group__2__Impl rule__BackSpecification__Group__3 ;
    public final void rule__BackSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8353:1: ( rule__BackSpecification__Group__2__Impl rule__BackSpecification__Group__3 )
            // InternalGreedySnake.g:8354:2: rule__BackSpecification__Group__2__Impl rule__BackSpecification__Group__3
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
    // InternalGreedySnake.g:8361:1: rule__BackSpecification__Group__2__Impl : ( 'Icon' ) ;
    public final void rule__BackSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8365:1: ( ( 'Icon' ) )
            // InternalGreedySnake.g:8366:1: ( 'Icon' )
            {
            // InternalGreedySnake.g:8366:1: ( 'Icon' )
            // InternalGreedySnake.g:8367:2: 'Icon'
            {
             before(grammarAccess.getBackSpecificationAccess().getIconKeyword_2()); 
            match(input,80,FOLLOW_2); 
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
    // InternalGreedySnake.g:8376:1: rule__BackSpecification__Group__3 : rule__BackSpecification__Group__3__Impl rule__BackSpecification__Group__4 ;
    public final void rule__BackSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8380:1: ( rule__BackSpecification__Group__3__Impl rule__BackSpecification__Group__4 )
            // InternalGreedySnake.g:8381:2: rule__BackSpecification__Group__3__Impl rule__BackSpecification__Group__4
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
    // InternalGreedySnake.g:8388:1: rule__BackSpecification__Group__3__Impl : ( '{' ) ;
    public final void rule__BackSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8392:1: ( ( '{' ) )
            // InternalGreedySnake.g:8393:1: ( '{' )
            {
            // InternalGreedySnake.g:8393:1: ( '{' )
            // InternalGreedySnake.g:8394:2: '{'
            {
             before(grammarAccess.getBackSpecificationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:8403:1: rule__BackSpecification__Group__4 : rule__BackSpecification__Group__4__Impl rule__BackSpecification__Group__5 ;
    public final void rule__BackSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8407:1: ( rule__BackSpecification__Group__4__Impl rule__BackSpecification__Group__5 )
            // InternalGreedySnake.g:8408:2: rule__BackSpecification__Group__4__Impl rule__BackSpecification__Group__5
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
    // InternalGreedySnake.g:8415:1: rule__BackSpecification__Group__4__Impl : ( ( rule__BackSpecification__BackgroundIconAssignment_4 ) ) ;
    public final void rule__BackSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8419:1: ( ( ( rule__BackSpecification__BackgroundIconAssignment_4 ) ) )
            // InternalGreedySnake.g:8420:1: ( ( rule__BackSpecification__BackgroundIconAssignment_4 ) )
            {
            // InternalGreedySnake.g:8420:1: ( ( rule__BackSpecification__BackgroundIconAssignment_4 ) )
            // InternalGreedySnake.g:8421:2: ( rule__BackSpecification__BackgroundIconAssignment_4 )
            {
             before(grammarAccess.getBackSpecificationAccess().getBackgroundIconAssignment_4()); 
            // InternalGreedySnake.g:8422:2: ( rule__BackSpecification__BackgroundIconAssignment_4 )
            // InternalGreedySnake.g:8422:3: rule__BackSpecification__BackgroundIconAssignment_4
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
    // InternalGreedySnake.g:8430:1: rule__BackSpecification__Group__5 : rule__BackSpecification__Group__5__Impl rule__BackSpecification__Group__6 ;
    public final void rule__BackSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8434:1: ( rule__BackSpecification__Group__5__Impl rule__BackSpecification__Group__6 )
            // InternalGreedySnake.g:8435:2: rule__BackSpecification__Group__5__Impl rule__BackSpecification__Group__6
            {
            pushFollow(FOLLOW_67);
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
    // InternalGreedySnake.g:8442:1: rule__BackSpecification__Group__5__Impl : ( '}' ) ;
    public final void rule__BackSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8446:1: ( ( '}' ) )
            // InternalGreedySnake.g:8447:1: ( '}' )
            {
            // InternalGreedySnake.g:8447:1: ( '}' )
            // InternalGreedySnake.g:8448:2: '}'
            {
             before(grammarAccess.getBackSpecificationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:8457:1: rule__BackSpecification__Group__6 : rule__BackSpecification__Group__6__Impl rule__BackSpecification__Group__7 ;
    public final void rule__BackSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8461:1: ( rule__BackSpecification__Group__6__Impl rule__BackSpecification__Group__7 )
            // InternalGreedySnake.g:8462:2: rule__BackSpecification__Group__6__Impl rule__BackSpecification__Group__7
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
    // InternalGreedySnake.g:8469:1: rule__BackSpecification__Group__6__Impl : ( 'Height' ) ;
    public final void rule__BackSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8473:1: ( ( 'Height' ) )
            // InternalGreedySnake.g:8474:1: ( 'Height' )
            {
            // InternalGreedySnake.g:8474:1: ( 'Height' )
            // InternalGreedySnake.g:8475:2: 'Height'
            {
             before(grammarAccess.getBackSpecificationAccess().getHeightKeyword_6()); 
            match(input,81,FOLLOW_2); 
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
    // InternalGreedySnake.g:8484:1: rule__BackSpecification__Group__7 : rule__BackSpecification__Group__7__Impl rule__BackSpecification__Group__8 ;
    public final void rule__BackSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8488:1: ( rule__BackSpecification__Group__7__Impl rule__BackSpecification__Group__8 )
            // InternalGreedySnake.g:8489:2: rule__BackSpecification__Group__7__Impl rule__BackSpecification__Group__8
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
    // InternalGreedySnake.g:8496:1: rule__BackSpecification__Group__7__Impl : ( '=' ) ;
    public final void rule__BackSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8500:1: ( ( '=' ) )
            // InternalGreedySnake.g:8501:1: ( '=' )
            {
            // InternalGreedySnake.g:8501:1: ( '=' )
            // InternalGreedySnake.g:8502:2: '='
            {
             before(grammarAccess.getBackSpecificationAccess().getEqualsSignKeyword_7()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:8511:1: rule__BackSpecification__Group__8 : rule__BackSpecification__Group__8__Impl rule__BackSpecification__Group__9 ;
    public final void rule__BackSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8515:1: ( rule__BackSpecification__Group__8__Impl rule__BackSpecification__Group__9 )
            // InternalGreedySnake.g:8516:2: rule__BackSpecification__Group__8__Impl rule__BackSpecification__Group__9
            {
            pushFollow(FOLLOW_68);
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
    // InternalGreedySnake.g:8523:1: rule__BackSpecification__Group__8__Impl : ( ( rule__BackSpecification__BackGroundHeightAssignment_8 ) ) ;
    public final void rule__BackSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8527:1: ( ( ( rule__BackSpecification__BackGroundHeightAssignment_8 ) ) )
            // InternalGreedySnake.g:8528:1: ( ( rule__BackSpecification__BackGroundHeightAssignment_8 ) )
            {
            // InternalGreedySnake.g:8528:1: ( ( rule__BackSpecification__BackGroundHeightAssignment_8 ) )
            // InternalGreedySnake.g:8529:2: ( rule__BackSpecification__BackGroundHeightAssignment_8 )
            {
             before(grammarAccess.getBackSpecificationAccess().getBackGroundHeightAssignment_8()); 
            // InternalGreedySnake.g:8530:2: ( rule__BackSpecification__BackGroundHeightAssignment_8 )
            // InternalGreedySnake.g:8530:3: rule__BackSpecification__BackGroundHeightAssignment_8
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
    // InternalGreedySnake.g:8538:1: rule__BackSpecification__Group__9 : rule__BackSpecification__Group__9__Impl rule__BackSpecification__Group__10 ;
    public final void rule__BackSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8542:1: ( rule__BackSpecification__Group__9__Impl rule__BackSpecification__Group__10 )
            // InternalGreedySnake.g:8543:2: rule__BackSpecification__Group__9__Impl rule__BackSpecification__Group__10
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
    // InternalGreedySnake.g:8550:1: rule__BackSpecification__Group__9__Impl : ( 'Width' ) ;
    public final void rule__BackSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8554:1: ( ( 'Width' ) )
            // InternalGreedySnake.g:8555:1: ( 'Width' )
            {
            // InternalGreedySnake.g:8555:1: ( 'Width' )
            // InternalGreedySnake.g:8556:2: 'Width'
            {
             before(grammarAccess.getBackSpecificationAccess().getWidthKeyword_9()); 
            match(input,82,FOLLOW_2); 
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
    // InternalGreedySnake.g:8565:1: rule__BackSpecification__Group__10 : rule__BackSpecification__Group__10__Impl rule__BackSpecification__Group__11 ;
    public final void rule__BackSpecification__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8569:1: ( rule__BackSpecification__Group__10__Impl rule__BackSpecification__Group__11 )
            // InternalGreedySnake.g:8570:2: rule__BackSpecification__Group__10__Impl rule__BackSpecification__Group__11
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
    // InternalGreedySnake.g:8577:1: rule__BackSpecification__Group__10__Impl : ( '=' ) ;
    public final void rule__BackSpecification__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8581:1: ( ( '=' ) )
            // InternalGreedySnake.g:8582:1: ( '=' )
            {
            // InternalGreedySnake.g:8582:1: ( '=' )
            // InternalGreedySnake.g:8583:2: '='
            {
             before(grammarAccess.getBackSpecificationAccess().getEqualsSignKeyword_10()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:8592:1: rule__BackSpecification__Group__11 : rule__BackSpecification__Group__11__Impl rule__BackSpecification__Group__12 ;
    public final void rule__BackSpecification__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8596:1: ( rule__BackSpecification__Group__11__Impl rule__BackSpecification__Group__12 )
            // InternalGreedySnake.g:8597:2: rule__BackSpecification__Group__11__Impl rule__BackSpecification__Group__12
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
    // InternalGreedySnake.g:8604:1: rule__BackSpecification__Group__11__Impl : ( ( rule__BackSpecification__BackGroundWidthAssignment_11 ) ) ;
    public final void rule__BackSpecification__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8608:1: ( ( ( rule__BackSpecification__BackGroundWidthAssignment_11 ) ) )
            // InternalGreedySnake.g:8609:1: ( ( rule__BackSpecification__BackGroundWidthAssignment_11 ) )
            {
            // InternalGreedySnake.g:8609:1: ( ( rule__BackSpecification__BackGroundWidthAssignment_11 ) )
            // InternalGreedySnake.g:8610:2: ( rule__BackSpecification__BackGroundWidthAssignment_11 )
            {
             before(grammarAccess.getBackSpecificationAccess().getBackGroundWidthAssignment_11()); 
            // InternalGreedySnake.g:8611:2: ( rule__BackSpecification__BackGroundWidthAssignment_11 )
            // InternalGreedySnake.g:8611:3: rule__BackSpecification__BackGroundWidthAssignment_11
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
    // InternalGreedySnake.g:8619:1: rule__BackSpecification__Group__12 : rule__BackSpecification__Group__12__Impl ;
    public final void rule__BackSpecification__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8623:1: ( rule__BackSpecification__Group__12__Impl )
            // InternalGreedySnake.g:8624:2: rule__BackSpecification__Group__12__Impl
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
    // InternalGreedySnake.g:8630:1: rule__BackSpecification__Group__12__Impl : ( '}' ) ;
    public final void rule__BackSpecification__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8634:1: ( ( '}' ) )
            // InternalGreedySnake.g:8635:1: ( '}' )
            {
            // InternalGreedySnake.g:8635:1: ( '}' )
            // InternalGreedySnake.g:8636:2: '}'
            {
             before(grammarAccess.getBackSpecificationAccess().getRightCurlyBracketKeyword_12()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:8646:1: rule__BackgroundIcon__Group__0 : rule__BackgroundIcon__Group__0__Impl rule__BackgroundIcon__Group__1 ;
    public final void rule__BackgroundIcon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8650:1: ( rule__BackgroundIcon__Group__0__Impl rule__BackgroundIcon__Group__1 )
            // InternalGreedySnake.g:8651:2: rule__BackgroundIcon__Group__0__Impl rule__BackgroundIcon__Group__1
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
    // InternalGreedySnake.g:8658:1: rule__BackgroundIcon__Group__0__Impl : ( () ) ;
    public final void rule__BackgroundIcon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8662:1: ( ( () ) )
            // InternalGreedySnake.g:8663:1: ( () )
            {
            // InternalGreedySnake.g:8663:1: ( () )
            // InternalGreedySnake.g:8664:2: ()
            {
             before(grammarAccess.getBackgroundIconAccess().getBackgroundIconAction_0()); 
            // InternalGreedySnake.g:8665:2: ()
            // InternalGreedySnake.g:8665:3: 
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
    // InternalGreedySnake.g:8673:1: rule__BackgroundIcon__Group__1 : rule__BackgroundIcon__Group__1__Impl ;
    public final void rule__BackgroundIcon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8677:1: ( rule__BackgroundIcon__Group__1__Impl )
            // InternalGreedySnake.g:8678:2: rule__BackgroundIcon__Group__1__Impl
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
    // InternalGreedySnake.g:8684:1: rule__BackgroundIcon__Group__1__Impl : ( ( rule__BackgroundIcon__BackgroundTagAssignment_1 )* ) ;
    public final void rule__BackgroundIcon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8688:1: ( ( ( rule__BackgroundIcon__BackgroundTagAssignment_1 )* ) )
            // InternalGreedySnake.g:8689:1: ( ( rule__BackgroundIcon__BackgroundTagAssignment_1 )* )
            {
            // InternalGreedySnake.g:8689:1: ( ( rule__BackgroundIcon__BackgroundTagAssignment_1 )* )
            // InternalGreedySnake.g:8690:2: ( rule__BackgroundIcon__BackgroundTagAssignment_1 )*
            {
             before(grammarAccess.getBackgroundIconAccess().getBackgroundTagAssignment_1()); 
            // InternalGreedySnake.g:8691:2: ( rule__BackgroundIcon__BackgroundTagAssignment_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGreedySnake.g:8691:3: rule__BackgroundIcon__BackgroundTagAssignment_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__BackgroundIcon__BackgroundTagAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalGreedySnake.g:8700:1: rule__BackgroundTag__Group__0 : rule__BackgroundTag__Group__0__Impl rule__BackgroundTag__Group__1 ;
    public final void rule__BackgroundTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8704:1: ( rule__BackgroundTag__Group__0__Impl rule__BackgroundTag__Group__1 )
            // InternalGreedySnake.g:8705:2: rule__BackgroundTag__Group__0__Impl rule__BackgroundTag__Group__1
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
    // InternalGreedySnake.g:8712:1: rule__BackgroundTag__Group__0__Impl : ( ( rule__BackgroundTag__NameAssignment_0 ) ) ;
    public final void rule__BackgroundTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8716:1: ( ( ( rule__BackgroundTag__NameAssignment_0 ) ) )
            // InternalGreedySnake.g:8717:1: ( ( rule__BackgroundTag__NameAssignment_0 ) )
            {
            // InternalGreedySnake.g:8717:1: ( ( rule__BackgroundTag__NameAssignment_0 ) )
            // InternalGreedySnake.g:8718:2: ( rule__BackgroundTag__NameAssignment_0 )
            {
             before(grammarAccess.getBackgroundTagAccess().getNameAssignment_0()); 
            // InternalGreedySnake.g:8719:2: ( rule__BackgroundTag__NameAssignment_0 )
            // InternalGreedySnake.g:8719:3: rule__BackgroundTag__NameAssignment_0
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
    // InternalGreedySnake.g:8727:1: rule__BackgroundTag__Group__1 : rule__BackgroundTag__Group__1__Impl rule__BackgroundTag__Group__2 ;
    public final void rule__BackgroundTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8731:1: ( rule__BackgroundTag__Group__1__Impl rule__BackgroundTag__Group__2 )
            // InternalGreedySnake.g:8732:2: rule__BackgroundTag__Group__1__Impl rule__BackgroundTag__Group__2
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
    // InternalGreedySnake.g:8739:1: rule__BackgroundTag__Group__1__Impl : ( ( rule__BackgroundTag__ValueAssignment_1 ) ) ;
    public final void rule__BackgroundTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8743:1: ( ( ( rule__BackgroundTag__ValueAssignment_1 ) ) )
            // InternalGreedySnake.g:8744:1: ( ( rule__BackgroundTag__ValueAssignment_1 ) )
            {
            // InternalGreedySnake.g:8744:1: ( ( rule__BackgroundTag__ValueAssignment_1 ) )
            // InternalGreedySnake.g:8745:2: ( rule__BackgroundTag__ValueAssignment_1 )
            {
             before(grammarAccess.getBackgroundTagAccess().getValueAssignment_1()); 
            // InternalGreedySnake.g:8746:2: ( rule__BackgroundTag__ValueAssignment_1 )
            // InternalGreedySnake.g:8746:3: rule__BackgroundTag__ValueAssignment_1
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
    // InternalGreedySnake.g:8754:1: rule__BackgroundTag__Group__2 : rule__BackgroundTag__Group__2__Impl rule__BackgroundTag__Group__3 ;
    public final void rule__BackgroundTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8758:1: ( rule__BackgroundTag__Group__2__Impl rule__BackgroundTag__Group__3 )
            // InternalGreedySnake.g:8759:2: rule__BackgroundTag__Group__2__Impl rule__BackgroundTag__Group__3
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
    // InternalGreedySnake.g:8766:1: rule__BackgroundTag__Group__2__Impl : ( '=' ) ;
    public final void rule__BackgroundTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8770:1: ( ( '=' ) )
            // InternalGreedySnake.g:8771:1: ( '=' )
            {
            // InternalGreedySnake.g:8771:1: ( '=' )
            // InternalGreedySnake.g:8772:2: '='
            {
             before(grammarAccess.getBackgroundTagAccess().getEqualsSignKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:8781:1: rule__BackgroundTag__Group__3 : rule__BackgroundTag__Group__3__Impl rule__BackgroundTag__Group__4 ;
    public final void rule__BackgroundTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8785:1: ( rule__BackgroundTag__Group__3__Impl rule__BackgroundTag__Group__4 )
            // InternalGreedySnake.g:8786:2: rule__BackgroundTag__Group__3__Impl rule__BackgroundTag__Group__4
            {
            pushFollow(FOLLOW_48);
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
    // InternalGreedySnake.g:8793:1: rule__BackgroundTag__Group__3__Impl : ( ( rule__BackgroundTag__BKtagAssignment_3 ) ) ;
    public final void rule__BackgroundTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8797:1: ( ( ( rule__BackgroundTag__BKtagAssignment_3 ) ) )
            // InternalGreedySnake.g:8798:1: ( ( rule__BackgroundTag__BKtagAssignment_3 ) )
            {
            // InternalGreedySnake.g:8798:1: ( ( rule__BackgroundTag__BKtagAssignment_3 ) )
            // InternalGreedySnake.g:8799:2: ( rule__BackgroundTag__BKtagAssignment_3 )
            {
             before(grammarAccess.getBackgroundTagAccess().getBKtagAssignment_3()); 
            // InternalGreedySnake.g:8800:2: ( rule__BackgroundTag__BKtagAssignment_3 )
            // InternalGreedySnake.g:8800:3: rule__BackgroundTag__BKtagAssignment_3
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
    // InternalGreedySnake.g:8808:1: rule__BackgroundTag__Group__4 : rule__BackgroundTag__Group__4__Impl rule__BackgroundTag__Group__5 ;
    public final void rule__BackgroundTag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8812:1: ( rule__BackgroundTag__Group__4__Impl rule__BackgroundTag__Group__5 )
            // InternalGreedySnake.g:8813:2: rule__BackgroundTag__Group__4__Impl rule__BackgroundTag__Group__5
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
    // InternalGreedySnake.g:8820:1: rule__BackgroundTag__Group__4__Impl : ( 'Locate' ) ;
    public final void rule__BackgroundTag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8824:1: ( ( 'Locate' ) )
            // InternalGreedySnake.g:8825:1: ( 'Locate' )
            {
            // InternalGreedySnake.g:8825:1: ( 'Locate' )
            // InternalGreedySnake.g:8826:2: 'Locate'
            {
             before(grammarAccess.getBackgroundTagAccess().getLocateKeyword_4()); 
            match(input,60,FOLLOW_2); 
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
    // InternalGreedySnake.g:8835:1: rule__BackgroundTag__Group__5 : rule__BackgroundTag__Group__5__Impl rule__BackgroundTag__Group__6 ;
    public final void rule__BackgroundTag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8839:1: ( rule__BackgroundTag__Group__5__Impl rule__BackgroundTag__Group__6 )
            // InternalGreedySnake.g:8840:2: rule__BackgroundTag__Group__5__Impl rule__BackgroundTag__Group__6
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
    // InternalGreedySnake.g:8847:1: rule__BackgroundTag__Group__5__Impl : ( ':' ) ;
    public final void rule__BackgroundTag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8851:1: ( ( ':' ) )
            // InternalGreedySnake.g:8852:1: ( ':' )
            {
            // InternalGreedySnake.g:8852:1: ( ':' )
            // InternalGreedySnake.g:8853:2: ':'
            {
             before(grammarAccess.getBackgroundTagAccess().getColonKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGreedySnake.g:8862:1: rule__BackgroundTag__Group__6 : rule__BackgroundTag__Group__6__Impl ;
    public final void rule__BackgroundTag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8866:1: ( rule__BackgroundTag__Group__6__Impl )
            // InternalGreedySnake.g:8867:2: rule__BackgroundTag__Group__6__Impl
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
    // InternalGreedySnake.g:8873:1: rule__BackgroundTag__Group__6__Impl : ( ( rule__BackgroundTag__LocateAssignment_6 ) ) ;
    public final void rule__BackgroundTag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8877:1: ( ( ( rule__BackgroundTag__LocateAssignment_6 ) ) )
            // InternalGreedySnake.g:8878:1: ( ( rule__BackgroundTag__LocateAssignment_6 ) )
            {
            // InternalGreedySnake.g:8878:1: ( ( rule__BackgroundTag__LocateAssignment_6 ) )
            // InternalGreedySnake.g:8879:2: ( rule__BackgroundTag__LocateAssignment_6 )
            {
             before(grammarAccess.getBackgroundTagAccess().getLocateAssignment_6()); 
            // InternalGreedySnake.g:8880:2: ( rule__BackgroundTag__LocateAssignment_6 )
            // InternalGreedySnake.g:8880:3: rule__BackgroundTag__LocateAssignment_6
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
    // InternalGreedySnake.g:8889:1: rule__MusicSpecification__Group__0 : rule__MusicSpecification__Group__0__Impl rule__MusicSpecification__Group__1 ;
    public final void rule__MusicSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8893:1: ( rule__MusicSpecification__Group__0__Impl rule__MusicSpecification__Group__1 )
            // InternalGreedySnake.g:8894:2: rule__MusicSpecification__Group__0__Impl rule__MusicSpecification__Group__1
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
    // InternalGreedySnake.g:8901:1: rule__MusicSpecification__Group__0__Impl : ( 'Music' ) ;
    public final void rule__MusicSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8905:1: ( ( 'Music' ) )
            // InternalGreedySnake.g:8906:1: ( 'Music' )
            {
            // InternalGreedySnake.g:8906:1: ( 'Music' )
            // InternalGreedySnake.g:8907:2: 'Music'
            {
             before(grammarAccess.getMusicSpecificationAccess().getMusicKeyword_0()); 
            match(input,83,FOLLOW_2); 
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
    // InternalGreedySnake.g:8916:1: rule__MusicSpecification__Group__1 : rule__MusicSpecification__Group__1__Impl rule__MusicSpecification__Group__2 ;
    public final void rule__MusicSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8920:1: ( rule__MusicSpecification__Group__1__Impl rule__MusicSpecification__Group__2 )
            // InternalGreedySnake.g:8921:2: rule__MusicSpecification__Group__1__Impl rule__MusicSpecification__Group__2
            {
            pushFollow(FOLLOW_69);
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
    // InternalGreedySnake.g:8928:1: rule__MusicSpecification__Group__1__Impl : ( '{' ) ;
    public final void rule__MusicSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8932:1: ( ( '{' ) )
            // InternalGreedySnake.g:8933:1: ( '{' )
            {
            // InternalGreedySnake.g:8933:1: ( '{' )
            // InternalGreedySnake.g:8934:2: '{'
            {
             before(grammarAccess.getMusicSpecificationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGreedySnake.g:8943:1: rule__MusicSpecification__Group__2 : rule__MusicSpecification__Group__2__Impl rule__MusicSpecification__Group__3 ;
    public final void rule__MusicSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8947:1: ( rule__MusicSpecification__Group__2__Impl rule__MusicSpecification__Group__3 )
            // InternalGreedySnake.g:8948:2: rule__MusicSpecification__Group__2__Impl rule__MusicSpecification__Group__3
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
    // InternalGreedySnake.g:8955:1: rule__MusicSpecification__Group__2__Impl : ( 'BufferSize' ) ;
    public final void rule__MusicSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8959:1: ( ( 'BufferSize' ) )
            // InternalGreedySnake.g:8960:1: ( 'BufferSize' )
            {
            // InternalGreedySnake.g:8960:1: ( 'BufferSize' )
            // InternalGreedySnake.g:8961:2: 'BufferSize'
            {
             before(grammarAccess.getMusicSpecificationAccess().getBufferSizeKeyword_2()); 
            match(input,84,FOLLOW_2); 
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
    // InternalGreedySnake.g:8970:1: rule__MusicSpecification__Group__3 : rule__MusicSpecification__Group__3__Impl rule__MusicSpecification__Group__4 ;
    public final void rule__MusicSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8974:1: ( rule__MusicSpecification__Group__3__Impl rule__MusicSpecification__Group__4 )
            // InternalGreedySnake.g:8975:2: rule__MusicSpecification__Group__3__Impl rule__MusicSpecification__Group__4
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
    // InternalGreedySnake.g:8982:1: rule__MusicSpecification__Group__3__Impl : ( '=' ) ;
    public final void rule__MusicSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:8986:1: ( ( '=' ) )
            // InternalGreedySnake.g:8987:1: ( '=' )
            {
            // InternalGreedySnake.g:8987:1: ( '=' )
            // InternalGreedySnake.g:8988:2: '='
            {
             before(grammarAccess.getMusicSpecificationAccess().getEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:8997:1: rule__MusicSpecification__Group__4 : rule__MusicSpecification__Group__4__Impl rule__MusicSpecification__Group__5 ;
    public final void rule__MusicSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9001:1: ( rule__MusicSpecification__Group__4__Impl rule__MusicSpecification__Group__5 )
            // InternalGreedySnake.g:9002:2: rule__MusicSpecification__Group__4__Impl rule__MusicSpecification__Group__5
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
    // InternalGreedySnake.g:9009:1: rule__MusicSpecification__Group__4__Impl : ( ( rule__MusicSpecification__BuffersizeAssignment_4 ) ) ;
    public final void rule__MusicSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9013:1: ( ( ( rule__MusicSpecification__BuffersizeAssignment_4 ) ) )
            // InternalGreedySnake.g:9014:1: ( ( rule__MusicSpecification__BuffersizeAssignment_4 ) )
            {
            // InternalGreedySnake.g:9014:1: ( ( rule__MusicSpecification__BuffersizeAssignment_4 ) )
            // InternalGreedySnake.g:9015:2: ( rule__MusicSpecification__BuffersizeAssignment_4 )
            {
             before(grammarAccess.getMusicSpecificationAccess().getBuffersizeAssignment_4()); 
            // InternalGreedySnake.g:9016:2: ( rule__MusicSpecification__BuffersizeAssignment_4 )
            // InternalGreedySnake.g:9016:3: rule__MusicSpecification__BuffersizeAssignment_4
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
    // InternalGreedySnake.g:9024:1: rule__MusicSpecification__Group__5 : rule__MusicSpecification__Group__5__Impl rule__MusicSpecification__Group__6 ;
    public final void rule__MusicSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9028:1: ( rule__MusicSpecification__Group__5__Impl rule__MusicSpecification__Group__6 )
            // InternalGreedySnake.g:9029:2: rule__MusicSpecification__Group__5__Impl rule__MusicSpecification__Group__6
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
    // InternalGreedySnake.g:9036:1: rule__MusicSpecification__Group__5__Impl : ( ( rule__MusicSpecification__MusicPathAssignment_5 )* ) ;
    public final void rule__MusicSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9040:1: ( ( ( rule__MusicSpecification__MusicPathAssignment_5 )* ) )
            // InternalGreedySnake.g:9041:1: ( ( rule__MusicSpecification__MusicPathAssignment_5 )* )
            {
            // InternalGreedySnake.g:9041:1: ( ( rule__MusicSpecification__MusicPathAssignment_5 )* )
            // InternalGreedySnake.g:9042:2: ( rule__MusicSpecification__MusicPathAssignment_5 )*
            {
             before(grammarAccess.getMusicSpecificationAccess().getMusicPathAssignment_5()); 
            // InternalGreedySnake.g:9043:2: ( rule__MusicSpecification__MusicPathAssignment_5 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGreedySnake.g:9043:3: rule__MusicSpecification__MusicPathAssignment_5
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__MusicSpecification__MusicPathAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalGreedySnake.g:9051:1: rule__MusicSpecification__Group__6 : rule__MusicSpecification__Group__6__Impl ;
    public final void rule__MusicSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9055:1: ( rule__MusicSpecification__Group__6__Impl )
            // InternalGreedySnake.g:9056:2: rule__MusicSpecification__Group__6__Impl
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
    // InternalGreedySnake.g:9062:1: rule__MusicSpecification__Group__6__Impl : ( '}' ) ;
    public final void rule__MusicSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9066:1: ( ( '}' ) )
            // InternalGreedySnake.g:9067:1: ( '}' )
            {
            // InternalGreedySnake.g:9067:1: ( '}' )
            // InternalGreedySnake.g:9068:2: '}'
            {
             before(grammarAccess.getMusicSpecificationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGreedySnake.g:9078:1: rule__MusicPath__Group__0 : rule__MusicPath__Group__0__Impl rule__MusicPath__Group__1 ;
    public final void rule__MusicPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9082:1: ( rule__MusicPath__Group__0__Impl rule__MusicPath__Group__1 )
            // InternalGreedySnake.g:9083:2: rule__MusicPath__Group__0__Impl rule__MusicPath__Group__1
            {
            pushFollow(FOLLOW_70);
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
    // InternalGreedySnake.g:9090:1: rule__MusicPath__Group__0__Impl : ( ( rule__MusicPath__NameAssignment_0 ) ) ;
    public final void rule__MusicPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9094:1: ( ( ( rule__MusicPath__NameAssignment_0 ) ) )
            // InternalGreedySnake.g:9095:1: ( ( rule__MusicPath__NameAssignment_0 ) )
            {
            // InternalGreedySnake.g:9095:1: ( ( rule__MusicPath__NameAssignment_0 ) )
            // InternalGreedySnake.g:9096:2: ( rule__MusicPath__NameAssignment_0 )
            {
             before(grammarAccess.getMusicPathAccess().getNameAssignment_0()); 
            // InternalGreedySnake.g:9097:2: ( rule__MusicPath__NameAssignment_0 )
            // InternalGreedySnake.g:9097:3: rule__MusicPath__NameAssignment_0
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
    // InternalGreedySnake.g:9105:1: rule__MusicPath__Group__1 : rule__MusicPath__Group__1__Impl rule__MusicPath__Group__2 ;
    public final void rule__MusicPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9109:1: ( rule__MusicPath__Group__1__Impl rule__MusicPath__Group__2 )
            // InternalGreedySnake.g:9110:2: rule__MusicPath__Group__1__Impl rule__MusicPath__Group__2
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
    // InternalGreedySnake.g:9117:1: rule__MusicPath__Group__1__Impl : ( 'path' ) ;
    public final void rule__MusicPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9121:1: ( ( 'path' ) )
            // InternalGreedySnake.g:9122:1: ( 'path' )
            {
            // InternalGreedySnake.g:9122:1: ( 'path' )
            // InternalGreedySnake.g:9123:2: 'path'
            {
             before(grammarAccess.getMusicPathAccess().getPathKeyword_1()); 
            match(input,85,FOLLOW_2); 
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
    // InternalGreedySnake.g:9132:1: rule__MusicPath__Group__2 : rule__MusicPath__Group__2__Impl rule__MusicPath__Group__3 ;
    public final void rule__MusicPath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9136:1: ( rule__MusicPath__Group__2__Impl rule__MusicPath__Group__3 )
            // InternalGreedySnake.g:9137:2: rule__MusicPath__Group__2__Impl rule__MusicPath__Group__3
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
    // InternalGreedySnake.g:9144:1: rule__MusicPath__Group__2__Impl : ( '=' ) ;
    public final void rule__MusicPath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9148:1: ( ( '=' ) )
            // InternalGreedySnake.g:9149:1: ( '=' )
            {
            // InternalGreedySnake.g:9149:1: ( '=' )
            // InternalGreedySnake.g:9150:2: '='
            {
             before(grammarAccess.getMusicPathAccess().getEqualsSignKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGreedySnake.g:9159:1: rule__MusicPath__Group__3 : rule__MusicPath__Group__3__Impl ;
    public final void rule__MusicPath__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9163:1: ( rule__MusicPath__Group__3__Impl )
            // InternalGreedySnake.g:9164:2: rule__MusicPath__Group__3__Impl
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
    // InternalGreedySnake.g:9170:1: rule__MusicPath__Group__3__Impl : ( ( rule__MusicPath__PathAssignment_3 ) ) ;
    public final void rule__MusicPath__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9174:1: ( ( ( rule__MusicPath__PathAssignment_3 ) ) )
            // InternalGreedySnake.g:9175:1: ( ( rule__MusicPath__PathAssignment_3 ) )
            {
            // InternalGreedySnake.g:9175:1: ( ( rule__MusicPath__PathAssignment_3 ) )
            // InternalGreedySnake.g:9176:2: ( rule__MusicPath__PathAssignment_3 )
            {
             before(grammarAccess.getMusicPathAccess().getPathAssignment_3()); 
            // InternalGreedySnake.g:9177:2: ( rule__MusicPath__PathAssignment_3 )
            // InternalGreedySnake.g:9177:3: rule__MusicPath__PathAssignment_3
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
    // InternalGreedySnake.g:9186:1: rule__GreedySnake__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GreedySnake__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9190:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9191:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9191:2: ( RULE_ID )
            // InternalGreedySnake.g:9192:3: RULE_ID
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
    // InternalGreedySnake.g:9201:1: rule__GreedySnake__SnakesAssignment_3_0 : ( ruleInitialSnakeSpecificatin ) ;
    public final void rule__GreedySnake__SnakesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9205:1: ( ( ruleInitialSnakeSpecificatin ) )
            // InternalGreedySnake.g:9206:2: ( ruleInitialSnakeSpecificatin )
            {
            // InternalGreedySnake.g:9206:2: ( ruleInitialSnakeSpecificatin )
            // InternalGreedySnake.g:9207:3: ruleInitialSnakeSpecificatin
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
    // InternalGreedySnake.g:9216:1: rule__GreedySnake__FoodsAssignment_3_1 : ( ruleInitialFoodSpecificatin ) ;
    public final void rule__GreedySnake__FoodsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9220:1: ( ( ruleInitialFoodSpecificatin ) )
            // InternalGreedySnake.g:9221:2: ( ruleInitialFoodSpecificatin )
            {
            // InternalGreedySnake.g:9221:2: ( ruleInitialFoodSpecificatin )
            // InternalGreedySnake.g:9222:3: ruleInitialFoodSpecificatin
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
    // InternalGreedySnake.g:9231:1: rule__GreedySnake__ObstaclesAssignment_3_2 : ( ruleInitialObstacleSpecificatin ) ;
    public final void rule__GreedySnake__ObstaclesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9235:1: ( ( ruleInitialObstacleSpecificatin ) )
            // InternalGreedySnake.g:9236:2: ( ruleInitialObstacleSpecificatin )
            {
            // InternalGreedySnake.g:9236:2: ( ruleInitialObstacleSpecificatin )
            // InternalGreedySnake.g:9237:3: ruleInitialObstacleSpecificatin
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
    // InternalGreedySnake.g:9246:1: rule__GreedySnake__SpeedAssignment_3_3 : ( ruleInitialSpeedSpecification ) ;
    public final void rule__GreedySnake__SpeedAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9250:1: ( ( ruleInitialSpeedSpecification ) )
            // InternalGreedySnake.g:9251:2: ( ruleInitialSpeedSpecification )
            {
            // InternalGreedySnake.g:9251:2: ( ruleInitialSpeedSpecification )
            // InternalGreedySnake.g:9252:3: ruleInitialSpeedSpecification
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
    // InternalGreedySnake.g:9261:1: rule__GreedySnake__FireAssignment_3_4 : ( ruleInitialFireSpecification ) ;
    public final void rule__GreedySnake__FireAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9265:1: ( ( ruleInitialFireSpecification ) )
            // InternalGreedySnake.g:9266:2: ( ruleInitialFireSpecification )
            {
            // InternalGreedySnake.g:9266:2: ( ruleInitialFireSpecification )
            // InternalGreedySnake.g:9267:3: ruleInitialFireSpecification
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
    // InternalGreedySnake.g:9276:1: rule__GreedySnake__TimeAssignment_3_5 : ( ruleTimeLimited ) ;
    public final void rule__GreedySnake__TimeAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9280:1: ( ( ruleTimeLimited ) )
            // InternalGreedySnake.g:9281:2: ( ruleTimeLimited )
            {
            // InternalGreedySnake.g:9281:2: ( ruleTimeLimited )
            // InternalGreedySnake.g:9282:3: ruleTimeLimited
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
    // InternalGreedySnake.g:9291:1: rule__GreedySnake__MapAssignment_3_6 : ( ruleGlobalMap ) ;
    public final void rule__GreedySnake__MapAssignment_3_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9295:1: ( ( ruleGlobalMap ) )
            // InternalGreedySnake.g:9296:2: ( ruleGlobalMap )
            {
            // InternalGreedySnake.g:9296:2: ( ruleGlobalMap )
            // InternalGreedySnake.g:9297:3: ruleGlobalMap
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


    // $ANTLR start "rule__GreedySnake__SnakeMoveAssignment_3_7"
    // InternalGreedySnake.g:9306:1: rule__GreedySnake__SnakeMoveAssignment_3_7 : ( ruleSnakeMoveSpecification ) ;
    public final void rule__GreedySnake__SnakeMoveAssignment_3_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9310:1: ( ( ruleSnakeMoveSpecification ) )
            // InternalGreedySnake.g:9311:2: ( ruleSnakeMoveSpecification )
            {
            // InternalGreedySnake.g:9311:2: ( ruleSnakeMoveSpecification )
            // InternalGreedySnake.g:9312:3: ruleSnakeMoveSpecification
            {
             before(grammarAccess.getGreedySnakeAccess().getSnakeMoveSnakeMoveSpecificationParserRuleCall_3_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSnakeMoveSpecification();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getSnakeMoveSnakeMoveSpecificationParserRuleCall_3_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__SnakeMoveAssignment_3_7"


    // $ANTLR start "rule__GreedySnake__AboutAssignment_3_8"
    // InternalGreedySnake.g:9321:1: rule__GreedySnake__AboutAssignment_3_8 : ( ruleAboutSpecification ) ;
    public final void rule__GreedySnake__AboutAssignment_3_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9325:1: ( ( ruleAboutSpecification ) )
            // InternalGreedySnake.g:9326:2: ( ruleAboutSpecification )
            {
            // InternalGreedySnake.g:9326:2: ( ruleAboutSpecification )
            // InternalGreedySnake.g:9327:3: ruleAboutSpecification
            {
             before(grammarAccess.getGreedySnakeAccess().getAboutAboutSpecificationParserRuleCall_3_8_0()); 
            pushFollow(FOLLOW_2);
            ruleAboutSpecification();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getAboutAboutSpecificationParserRuleCall_3_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__AboutAssignment_3_8"


    // $ANTLR start "rule__GreedySnake__DirectionsAssignment_3_9"
    // InternalGreedySnake.g:9336:1: rule__GreedySnake__DirectionsAssignment_3_9 : ( ruleDirectionSpecification ) ;
    public final void rule__GreedySnake__DirectionsAssignment_3_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9340:1: ( ( ruleDirectionSpecification ) )
            // InternalGreedySnake.g:9341:2: ( ruleDirectionSpecification )
            {
            // InternalGreedySnake.g:9341:2: ( ruleDirectionSpecification )
            // InternalGreedySnake.g:9342:3: ruleDirectionSpecification
            {
             before(grammarAccess.getGreedySnakeAccess().getDirectionsDirectionSpecificationParserRuleCall_3_9_0()); 
            pushFollow(FOLLOW_2);
            ruleDirectionSpecification();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getDirectionsDirectionSpecificationParserRuleCall_3_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__DirectionsAssignment_3_9"


    // $ANTLR start "rule__GreedySnake__HelpAssignment_3_10"
    // InternalGreedySnake.g:9351:1: rule__GreedySnake__HelpAssignment_3_10 : ( ruleHelpSpecification ) ;
    public final void rule__GreedySnake__HelpAssignment_3_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9355:1: ( ( ruleHelpSpecification ) )
            // InternalGreedySnake.g:9356:2: ( ruleHelpSpecification )
            {
            // InternalGreedySnake.g:9356:2: ( ruleHelpSpecification )
            // InternalGreedySnake.g:9357:3: ruleHelpSpecification
            {
             before(grammarAccess.getGreedySnakeAccess().getHelpHelpSpecificationParserRuleCall_3_10_0()); 
            pushFollow(FOLLOW_2);
            ruleHelpSpecification();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getHelpHelpSpecificationParserRuleCall_3_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__HelpAssignment_3_10"


    // $ANTLR start "rule__GreedySnake__MusicAssignment_3_11"
    // InternalGreedySnake.g:9366:1: rule__GreedySnake__MusicAssignment_3_11 : ( ruleMusicSpecification ) ;
    public final void rule__GreedySnake__MusicAssignment_3_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9370:1: ( ( ruleMusicSpecification ) )
            // InternalGreedySnake.g:9371:2: ( ruleMusicSpecification )
            {
            // InternalGreedySnake.g:9371:2: ( ruleMusicSpecification )
            // InternalGreedySnake.g:9372:3: ruleMusicSpecification
            {
             before(grammarAccess.getGreedySnakeAccess().getMusicMusicSpecificationParserRuleCall_3_11_0()); 
            pushFollow(FOLLOW_2);
            ruleMusicSpecification();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getMusicMusicSpecificationParserRuleCall_3_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__MusicAssignment_3_11"


    // $ANTLR start "rule__GreedySnake__BackgroundsAssignment_3_12"
    // InternalGreedySnake.g:9381:1: rule__GreedySnake__BackgroundsAssignment_3_12 : ( ruleBackSpecification ) ;
    public final void rule__GreedySnake__BackgroundsAssignment_3_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9385:1: ( ( ruleBackSpecification ) )
            // InternalGreedySnake.g:9386:2: ( ruleBackSpecification )
            {
            // InternalGreedySnake.g:9386:2: ( ruleBackSpecification )
            // InternalGreedySnake.g:9387:3: ruleBackSpecification
            {
             before(grammarAccess.getGreedySnakeAccess().getBackgroundsBackSpecificationParserRuleCall_3_12_0()); 
            pushFollow(FOLLOW_2);
            ruleBackSpecification();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getBackgroundsBackSpecificationParserRuleCall_3_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__BackgroundsAssignment_3_12"


    // $ANTLR start "rule__GreedySnake__FieldsAssignment_3_13"
    // InternalGreedySnake.g:9396:1: rule__GreedySnake__FieldsAssignment_3_13 : ( ruleGlobalFieldInitialisation ) ;
    public final void rule__GreedySnake__FieldsAssignment_3_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9400:1: ( ( ruleGlobalFieldInitialisation ) )
            // InternalGreedySnake.g:9401:2: ( ruleGlobalFieldInitialisation )
            {
            // InternalGreedySnake.g:9401:2: ( ruleGlobalFieldInitialisation )
            // InternalGreedySnake.g:9402:3: ruleGlobalFieldInitialisation
            {
             before(grammarAccess.getGreedySnakeAccess().getFieldsGlobalFieldInitialisationParserRuleCall_3_13_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobalFieldInitialisation();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getFieldsGlobalFieldInitialisationParserRuleCall_3_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__FieldsAssignment_3_13"


    // $ANTLR start "rule__GreedySnake__OptionsAssignment_3_14"
    // InternalGreedySnake.g:9411:1: rule__GreedySnake__OptionsAssignment_3_14 : ( ruleOptionSpecification ) ;
    public final void rule__GreedySnake__OptionsAssignment_3_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9415:1: ( ( ruleOptionSpecification ) )
            // InternalGreedySnake.g:9416:2: ( ruleOptionSpecification )
            {
            // InternalGreedySnake.g:9416:2: ( ruleOptionSpecification )
            // InternalGreedySnake.g:9417:3: ruleOptionSpecification
            {
             before(grammarAccess.getGreedySnakeAccess().getOptionsOptionSpecificationParserRuleCall_3_14_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionSpecification();

            state._fsp--;

             after(grammarAccess.getGreedySnakeAccess().getOptionsOptionSpecificationParserRuleCall_3_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreedySnake__OptionsAssignment_3_14"


    // $ANTLR start "rule__GlobalMap__MapAssignment_2"
    // InternalGreedySnake.g:9426:1: rule__GlobalMap__MapAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GlobalMap__MapAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9430:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:9431:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:9431:2: ( RULE_STRING )
            // InternalGreedySnake.g:9432:3: RULE_STRING
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
    // InternalGreedySnake.g:9441:1: rule__GlobalFieldInitialisation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GlobalFieldInitialisation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9445:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9446:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9446:2: ( RULE_ID )
            // InternalGreedySnake.g:9447:3: RULE_ID
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
    // InternalGreedySnake.g:9456:1: rule__GlobalFieldInitialisation__PanelWidthAssignment_5 : ( RULE_INT ) ;
    public final void rule__GlobalFieldInitialisation__PanelWidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9460:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9461:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9461:2: ( RULE_INT )
            // InternalGreedySnake.g:9462:3: RULE_INT
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
    // InternalGreedySnake.g:9471:1: rule__GlobalFieldInitialisation__PanelHeightAssignment_8 : ( RULE_INT ) ;
    public final void rule__GlobalFieldInitialisation__PanelHeightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9475:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9476:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9476:2: ( RULE_INT )
            // InternalGreedySnake.g:9477:3: RULE_INT
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
    // InternalGreedySnake.g:9486:1: rule__GlobalFieldInitialisation__WidthAssignment_11 : ( RULE_INT ) ;
    public final void rule__GlobalFieldInitialisation__WidthAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9490:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9491:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9491:2: ( RULE_INT )
            // InternalGreedySnake.g:9492:3: RULE_INT
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
    // InternalGreedySnake.g:9501:1: rule__GlobalFieldInitialisation__HeightAssignment_14 : ( RULE_INT ) ;
    public final void rule__GlobalFieldInitialisation__HeightAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9505:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9506:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9506:2: ( RULE_INT )
            // InternalGreedySnake.g:9507:3: RULE_INT
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
    // InternalGreedySnake.g:9516:1: rule__GlobalFieldInitialisation__LabelWidthAssignment_17 : ( RULE_INT ) ;
    public final void rule__GlobalFieldInitialisation__LabelWidthAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9520:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9521:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9521:2: ( RULE_INT )
            // InternalGreedySnake.g:9522:3: RULE_INT
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
    // InternalGreedySnake.g:9531:1: rule__GlobalFieldInitialisation__LabelHeightAssignment_20 : ( RULE_INT ) ;
    public final void rule__GlobalFieldInitialisation__LabelHeightAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9535:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9536:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9536:2: ( RULE_INT )
            // InternalGreedySnake.g:9537:3: RULE_INT
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
    // InternalGreedySnake.g:9546:1: rule__GlobalFieldInitialisation__Field_initialisationAssignment_21 : ( ruleInitialField ) ;
    public final void rule__GlobalFieldInitialisation__Field_initialisationAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9550:1: ( ( ruleInitialField ) )
            // InternalGreedySnake.g:9551:2: ( ruleInitialField )
            {
            // InternalGreedySnake.g:9551:2: ( ruleInitialField )
            // InternalGreedySnake.g:9552:3: ruleInitialField
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
    // InternalGreedySnake.g:9561:1: rule__InitialField__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialField__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9565:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9566:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9566:2: ( RULE_ID )
            // InternalGreedySnake.g:9567:3: RULE_ID
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
    // InternalGreedySnake.g:9576:1: rule__InitialField__DefaultAssignment_7 : ( ruleDefault ) ;
    public final void rule__InitialField__DefaultAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9580:1: ( ( ruleDefault ) )
            // InternalGreedySnake.g:9581:2: ( ruleDefault )
            {
            // InternalGreedySnake.g:9581:2: ( ruleDefault )
            // InternalGreedySnake.g:9582:3: ruleDefault
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
    // InternalGreedySnake.g:9591:1: rule__Default__LengthAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Default__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9595:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:9596:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:9596:2: ( RULE_STRING )
            // InternalGreedySnake.g:9597:3: RULE_STRING
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
    // InternalGreedySnake.g:9606:1: rule__Default__ScoreAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Default__ScoreAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9610:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:9611:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:9611:2: ( RULE_STRING )
            // InternalGreedySnake.g:9612:3: RULE_STRING
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
    // InternalGreedySnake.g:9621:1: rule__Default__TimeAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Default__TimeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9625:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:9626:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:9626:2: ( RULE_STRING )
            // InternalGreedySnake.g:9627:3: RULE_STRING
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
    // InternalGreedySnake.g:9636:1: rule__Default__AmountAssignment_11 : ( RULE_STRING ) ;
    public final void rule__Default__AmountAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9640:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:9641:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:9641:2: ( RULE_STRING )
            // InternalGreedySnake.g:9642:3: RULE_STRING
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
    // InternalGreedySnake.g:9651:1: rule__Default__WeaponAssignment_14 : ( RULE_STRING ) ;
    public final void rule__Default__WeaponAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9655:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:9656:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:9656:2: ( RULE_STRING )
            // InternalGreedySnake.g:9657:3: RULE_STRING
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
    // InternalGreedySnake.g:9666:1: rule__InitialSnakeSpecificatin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialSnakeSpecificatin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9670:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9671:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9671:2: ( RULE_ID )
            // InternalGreedySnake.g:9672:3: RULE_ID
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
    // InternalGreedySnake.g:9681:1: rule__InitialSnakeSpecificatin__MembersAssignment_3 : ( ruleSnakeMembers ) ;
    public final void rule__InitialSnakeSpecificatin__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9685:1: ( ( ruleSnakeMembers ) )
            // InternalGreedySnake.g:9686:2: ( ruleSnakeMembers )
            {
            // InternalGreedySnake.g:9686:2: ( ruleSnakeMembers )
            // InternalGreedySnake.g:9687:3: ruleSnakeMembers
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
    // InternalGreedySnake.g:9696:1: rule__InitialSnakeSpecificatin__MultiplesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__InitialSnakeSpecificatin__MultiplesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9700:1: ( ( ( RULE_ID ) ) )
            // InternalGreedySnake.g:9701:2: ( ( RULE_ID ) )
            {
            // InternalGreedySnake.g:9701:2: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9702:3: ( RULE_ID )
            {
             before(grammarAccess.getInitialSnakeSpecificatinAccess().getMultiplesInitialSnakeSpecificatinCrossReference_5_0()); 
            // InternalGreedySnake.g:9703:3: ( RULE_ID )
            // InternalGreedySnake.g:9704:4: RULE_ID
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
    // InternalGreedySnake.g:9715:1: rule__InitialFoodSpecificatin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialFoodSpecificatin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9719:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9720:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9720:2: ( RULE_ID )
            // InternalGreedySnake.g:9721:3: RULE_ID
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
    // InternalGreedySnake.g:9730:1: rule__InitialFoodSpecificatin__MembersAssignment_3 : ( ruleFoodMembers ) ;
    public final void rule__InitialFoodSpecificatin__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9734:1: ( ( ruleFoodMembers ) )
            // InternalGreedySnake.g:9735:2: ( ruleFoodMembers )
            {
            // InternalGreedySnake.g:9735:2: ( ruleFoodMembers )
            // InternalGreedySnake.g:9736:3: ruleFoodMembers
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
    // InternalGreedySnake.g:9745:1: rule__InitialFoodSpecificatin__MultiplesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__InitialFoodSpecificatin__MultiplesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9749:1: ( ( ( RULE_ID ) ) )
            // InternalGreedySnake.g:9750:2: ( ( RULE_ID ) )
            {
            // InternalGreedySnake.g:9750:2: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9751:3: ( RULE_ID )
            {
             before(grammarAccess.getInitialFoodSpecificatinAccess().getMultiplesInitialFoodSpecificatinCrossReference_5_0()); 
            // InternalGreedySnake.g:9752:3: ( RULE_ID )
            // InternalGreedySnake.g:9753:4: RULE_ID
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
    // InternalGreedySnake.g:9764:1: rule__InitialObstacleSpecificatin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialObstacleSpecificatin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9768:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9769:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9769:2: ( RULE_ID )
            // InternalGreedySnake.g:9770:3: RULE_ID
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
    // InternalGreedySnake.g:9779:1: rule__InitialObstacleSpecificatin__MembersAssignment_3 : ( ruleObstacleMembers ) ;
    public final void rule__InitialObstacleSpecificatin__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9783:1: ( ( ruleObstacleMembers ) )
            // InternalGreedySnake.g:9784:2: ( ruleObstacleMembers )
            {
            // InternalGreedySnake.g:9784:2: ( ruleObstacleMembers )
            // InternalGreedySnake.g:9785:3: ruleObstacleMembers
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
    // InternalGreedySnake.g:9794:1: rule__InitialObstacleSpecificatin__MultiplesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__InitialObstacleSpecificatin__MultiplesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9798:1: ( ( ( RULE_ID ) ) )
            // InternalGreedySnake.g:9799:2: ( ( RULE_ID ) )
            {
            // InternalGreedySnake.g:9799:2: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9800:3: ( RULE_ID )
            {
             before(grammarAccess.getInitialObstacleSpecificatinAccess().getMultiplesInitialObstacleSpecificatinCrossReference_5_0()); 
            // InternalGreedySnake.g:9801:3: ( RULE_ID )
            // InternalGreedySnake.g:9802:4: RULE_ID
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
    // InternalGreedySnake.g:9813:1: rule__InitialFireSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialFireSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9817:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9818:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9818:2: ( RULE_ID )
            // InternalGreedySnake.g:9819:3: RULE_ID
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
    // InternalGreedySnake.g:9828:1: rule__InitialFireSpecification__MembersAssignment_3 : ( ruleFireMembers ) ;
    public final void rule__InitialFireSpecification__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9832:1: ( ( ruleFireMembers ) )
            // InternalGreedySnake.g:9833:2: ( ruleFireMembers )
            {
            // InternalGreedySnake.g:9833:2: ( ruleFireMembers )
            // InternalGreedySnake.g:9834:3: ruleFireMembers
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
    // InternalGreedySnake.g:9843:1: rule__InitialFireSpecification__MultiplesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__InitialFireSpecification__MultiplesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9847:1: ( ( ( RULE_ID ) ) )
            // InternalGreedySnake.g:9848:2: ( ( RULE_ID ) )
            {
            // InternalGreedySnake.g:9848:2: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9849:3: ( RULE_ID )
            {
             before(grammarAccess.getInitialFireSpecificationAccess().getMultiplesInitialSnakeSpecificatinCrossReference_5_0()); 
            // InternalGreedySnake.g:9850:3: ( RULE_ID )
            // InternalGreedySnake.g:9851:4: RULE_ID
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
    // InternalGreedySnake.g:9862:1: rule__InitialSpeedSpecification__SpeedGroupAssignment_3 : ( ruleSpeedGroup ) ;
    public final void rule__InitialSpeedSpecification__SpeedGroupAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9866:1: ( ( ruleSpeedGroup ) )
            // InternalGreedySnake.g:9867:2: ( ruleSpeedGroup )
            {
            // InternalGreedySnake.g:9867:2: ( ruleSpeedGroup )
            // InternalGreedySnake.g:9868:3: ruleSpeedGroup
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
    // InternalGreedySnake.g:9877:1: rule__SpeedGroup__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SpeedGroup__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9881:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9882:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:9882:2: ( RULE_ID )
            // InternalGreedySnake.g:9883:3: RULE_ID
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
    // InternalGreedySnake.g:9892:1: rule__SpeedGroup__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__SpeedGroup__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9896:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:9897:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:9897:2: ( RULE_INT )
            // InternalGreedySnake.g:9898:3: RULE_INT
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
    // InternalGreedySnake.g:9907:1: rule__FireMembers__FireAssignment : ( ruleFireInitDisplay ) ;
    public final void rule__FireMembers__FireAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9911:1: ( ( ruleFireInitDisplay ) )
            // InternalGreedySnake.g:9912:2: ( ruleFireInitDisplay )
            {
            // InternalGreedySnake.g:9912:2: ( ruleFireInitDisplay )
            // InternalGreedySnake.g:9913:3: ruleFireInitDisplay
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
    // InternalGreedySnake.g:9922:1: rule__SnakeMembers__SnaAssignment : ( ruleSnakeInitDisplay ) ;
    public final void rule__SnakeMembers__SnaAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9926:1: ( ( ruleSnakeInitDisplay ) )
            // InternalGreedySnake.g:9927:2: ( ruleSnakeInitDisplay )
            {
            // InternalGreedySnake.g:9927:2: ( ruleSnakeInitDisplay )
            // InternalGreedySnake.g:9928:3: ruleSnakeInitDisplay
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
    // InternalGreedySnake.g:9937:1: rule__FoodMembers__FoodAssignment : ( ruleFoodInitDisplay ) ;
    public final void rule__FoodMembers__FoodAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9941:1: ( ( ruleFoodInitDisplay ) )
            // InternalGreedySnake.g:9942:2: ( ruleFoodInitDisplay )
            {
            // InternalGreedySnake.g:9942:2: ( ruleFoodInitDisplay )
            // InternalGreedySnake.g:9943:3: ruleFoodInitDisplay
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
    // InternalGreedySnake.g:9952:1: rule__ObstacleMembers__ObstacleAssignment : ( ruleObstacleInitDisplay ) ;
    public final void rule__ObstacleMembers__ObstacleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9956:1: ( ( ruleObstacleInitDisplay ) )
            // InternalGreedySnake.g:9957:2: ( ruleObstacleInitDisplay )
            {
            // InternalGreedySnake.g:9957:2: ( ruleObstacleInitDisplay )
            // InternalGreedySnake.g:9958:3: ruleObstacleInitDisplay
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


    // $ANTLR start "rule__SnakeMoveSpecification__IFAssignment_4"
    // InternalGreedySnake.g:9967:1: rule__SnakeMoveSpecification__IFAssignment_4 : ( ruleMove ) ;
    public final void rule__SnakeMoveSpecification__IFAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9971:1: ( ( ruleMove ) )
            // InternalGreedySnake.g:9972:2: ( ruleMove )
            {
            // InternalGreedySnake.g:9972:2: ( ruleMove )
            // InternalGreedySnake.g:9973:3: ruleMove
            {
             before(grammarAccess.getSnakeMoveSpecificationAccess().getIFMoveParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getSnakeMoveSpecificationAccess().getIFMoveParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnakeMoveSpecification__IFAssignment_4"


    // $ANTLR start "rule__Move__DirAssignment_4"
    // InternalGreedySnake.g:9982:1: rule__Move__DirAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Move__DirAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:9986:1: ( ( ( RULE_ID ) ) )
            // InternalGreedySnake.g:9987:2: ( ( RULE_ID ) )
            {
            // InternalGreedySnake.g:9987:2: ( ( RULE_ID ) )
            // InternalGreedySnake.g:9988:3: ( RULE_ID )
            {
             before(grammarAccess.getMoveAccess().getDirDisCrossReference_4_0()); 
            // InternalGreedySnake.g:9989:3: ( RULE_ID )
            // InternalGreedySnake.g:9990:4: RULE_ID
            {
             before(grammarAccess.getMoveAccess().getDirDisIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getDirDisIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMoveAccess().getDirDisCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__DirAssignment_4"


    // $ANTLR start "rule__Move__NameAssignment_6"
    // InternalGreedySnake.g:10001:1: rule__Move__NameAssignment_6 : ( RULE_ID ) ;
    public final void rule__Move__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10005:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:10006:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:10006:2: ( RULE_ID )
            // InternalGreedySnake.g:10007:3: RULE_ID
            {
             before(grammarAccess.getMoveAccess().getNameIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getNameIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__NameAssignment_6"


    // $ANTLR start "rule__Move__CoorAssignment_8"
    // InternalGreedySnake.g:10016:1: rule__Move__CoorAssignment_8 : ( ( rule__Move__CoorAlternatives_8_0 ) ) ;
    public final void rule__Move__CoorAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10020:1: ( ( ( rule__Move__CoorAlternatives_8_0 ) ) )
            // InternalGreedySnake.g:10021:2: ( ( rule__Move__CoorAlternatives_8_0 ) )
            {
            // InternalGreedySnake.g:10021:2: ( ( rule__Move__CoorAlternatives_8_0 ) )
            // InternalGreedySnake.g:10022:3: ( rule__Move__CoorAlternatives_8_0 )
            {
             before(grammarAccess.getMoveAccess().getCoorAlternatives_8_0()); 
            // InternalGreedySnake.g:10023:3: ( rule__Move__CoorAlternatives_8_0 )
            // InternalGreedySnake.g:10023:4: rule__Move__CoorAlternatives_8_0
            {
            pushFollow(FOLLOW_2);
            rule__Move__CoorAlternatives_8_0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getCoorAlternatives_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__CoorAssignment_8"


    // $ANTLR start "rule__Move__OperatorAssignment_9"
    // InternalGreedySnake.g:10031:1: rule__Move__OperatorAssignment_9 : ( ( rule__Move__OperatorAlternatives_9_0 ) ) ;
    public final void rule__Move__OperatorAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10035:1: ( ( ( rule__Move__OperatorAlternatives_9_0 ) ) )
            // InternalGreedySnake.g:10036:2: ( ( rule__Move__OperatorAlternatives_9_0 ) )
            {
            // InternalGreedySnake.g:10036:2: ( ( rule__Move__OperatorAlternatives_9_0 ) )
            // InternalGreedySnake.g:10037:3: ( rule__Move__OperatorAlternatives_9_0 )
            {
             before(grammarAccess.getMoveAccess().getOperatorAlternatives_9_0()); 
            // InternalGreedySnake.g:10038:3: ( rule__Move__OperatorAlternatives_9_0 )
            // InternalGreedySnake.g:10038:4: rule__Move__OperatorAlternatives_9_0
            {
            pushFollow(FOLLOW_2);
            rule__Move__OperatorAlternatives_9_0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getOperatorAlternatives_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__OperatorAssignment_9"


    // $ANTLR start "rule__Move__MoveValAssignment_10"
    // InternalGreedySnake.g:10046:1: rule__Move__MoveValAssignment_10 : ( RULE_INT ) ;
    public final void rule__Move__MoveValAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10050:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10051:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10051:2: ( RULE_INT )
            // InternalGreedySnake.g:10052:3: RULE_INT
            {
             before(grammarAccess.getMoveAccess().getMoveValINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getMoveValINTTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__MoveValAssignment_10"


    // $ANTLR start "rule__FireInitDisplay__FireIconAssignment_2"
    // InternalGreedySnake.g:10061:1: rule__FireInitDisplay__FireIconAssignment_2 : ( ruleIconTag ) ;
    public final void rule__FireInitDisplay__FireIconAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10065:1: ( ( ruleIconTag ) )
            // InternalGreedySnake.g:10066:2: ( ruleIconTag )
            {
            // InternalGreedySnake.g:10066:2: ( ruleIconTag )
            // InternalGreedySnake.g:10067:3: ruleIconTag
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
    // InternalGreedySnake.g:10076:1: rule__FireInitDisplay__IconsizeAssignment_6 : ( ruleIconSize ) ;
    public final void rule__FireInitDisplay__IconsizeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10080:1: ( ( ruleIconSize ) )
            // InternalGreedySnake.g:10081:2: ( ruleIconSize )
            {
            // InternalGreedySnake.g:10081:2: ( ruleIconSize )
            // InternalGreedySnake.g:10082:3: ruleIconSize
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
    // InternalGreedySnake.g:10091:1: rule__SnakeInitDisplay__HeadAssignment_2 : ( ( '(' ) ) ;
    public final void rule__SnakeInitDisplay__HeadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10095:1: ( ( ( '(' ) ) )
            // InternalGreedySnake.g:10096:2: ( ( '(' ) )
            {
            // InternalGreedySnake.g:10096:2: ( ( '(' ) )
            // InternalGreedySnake.g:10097:3: ( '(' )
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getHeadLeftParenthesisKeyword_2_0()); 
            // InternalGreedySnake.g:10098:3: ( '(' )
            // InternalGreedySnake.g:10099:4: '('
            {
             before(grammarAccess.getSnakeInitDisplayAccess().getHeadLeftParenthesisKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGreedySnake.g:10110:1: rule__SnakeInitDisplay__Initial_xAssignment_3 : ( RULE_INT ) ;
    public final void rule__SnakeInitDisplay__Initial_xAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10114:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10115:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10115:2: ( RULE_INT )
            // InternalGreedySnake.g:10116:3: RULE_INT
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
    // InternalGreedySnake.g:10125:1: rule__SnakeInitDisplay__Initial_yAssignment_5 : ( RULE_INT ) ;
    public final void rule__SnakeInitDisplay__Initial_yAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10129:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10130:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10130:2: ( RULE_INT )
            // InternalGreedySnake.g:10131:3: RULE_INT
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
    // InternalGreedySnake.g:10140:1: rule__SnakeInitDisplay__HeadIconAssignment_9 : ( ruleIconTag ) ;
    public final void rule__SnakeInitDisplay__HeadIconAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10144:1: ( ( ruleIconTag ) )
            // InternalGreedySnake.g:10145:2: ( ruleIconTag )
            {
            // InternalGreedySnake.g:10145:2: ( ruleIconTag )
            // InternalGreedySnake.g:10146:3: ruleIconTag
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
    // InternalGreedySnake.g:10155:1: rule__SnakeInitDisplay__IconsizeAssignment_13 : ( ruleIconSize ) ;
    public final void rule__SnakeInitDisplay__IconsizeAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10159:1: ( ( ruleIconSize ) )
            // InternalGreedySnake.g:10160:2: ( ruleIconSize )
            {
            // InternalGreedySnake.g:10160:2: ( ruleIconSize )
            // InternalGreedySnake.g:10161:3: ruleIconSize
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
    // InternalGreedySnake.g:10170:1: rule__SnakeInitDisplay__BodyIconAssignment_16 : ( ruleIconTag ) ;
    public final void rule__SnakeInitDisplay__BodyIconAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10174:1: ( ( ruleIconTag ) )
            // InternalGreedySnake.g:10175:2: ( ruleIconTag )
            {
            // InternalGreedySnake.g:10175:2: ( ruleIconTag )
            // InternalGreedySnake.g:10176:3: ruleIconTag
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
    // InternalGreedySnake.g:10185:1: rule__SnakeInitDisplay__DefaultSpeedAssignment_20 : ( RULE_INT ) ;
    public final void rule__SnakeInitDisplay__DefaultSpeedAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10189:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10190:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10190:2: ( RULE_INT )
            // InternalGreedySnake.g:10191:3: RULE_INT
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
    // InternalGreedySnake.g:10200:1: rule__SnakeInitDisplay__SnakeTagAssignment_23 : ( RULE_INT ) ;
    public final void rule__SnakeInitDisplay__SnakeTagAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10204:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10205:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10205:2: ( RULE_INT )
            // InternalGreedySnake.g:10206:3: RULE_INT
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
    // InternalGreedySnake.g:10215:1: rule__IconTag__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IconTag__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10219:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:10220:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:10220:2: ( RULE_ID )
            // InternalGreedySnake.g:10221:3: RULE_ID
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
    // InternalGreedySnake.g:10230:1: rule__IconTag__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__IconTag__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10234:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:10235:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:10235:2: ( RULE_STRING )
            // InternalGreedySnake.g:10236:3: RULE_STRING
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
    // InternalGreedySnake.g:10245:1: rule__IconTag__TagAssignment_3 : ( RULE_INT ) ;
    public final void rule__IconTag__TagAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10249:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10250:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10250:2: ( RULE_INT )
            // InternalGreedySnake.g:10251:3: RULE_INT
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
    // InternalGreedySnake.g:10260:1: rule__IconTag__LocateAssignment_6 : ( RULE_STRING ) ;
    public final void rule__IconTag__LocateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10264:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:10265:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:10265:2: ( RULE_STRING )
            // InternalGreedySnake.g:10266:3: RULE_STRING
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
    // InternalGreedySnake.g:10275:1: rule__FoodInitDisplay__FoodIconAssignment_2 : ( ruleIconTag ) ;
    public final void rule__FoodInitDisplay__FoodIconAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10279:1: ( ( ruleIconTag ) )
            // InternalGreedySnake.g:10280:2: ( ruleIconTag )
            {
            // InternalGreedySnake.g:10280:2: ( ruleIconTag )
            // InternalGreedySnake.g:10281:3: ruleIconTag
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
    // InternalGreedySnake.g:10290:1: rule__FoodInitDisplay__IconsizeAssignment_6 : ( ruleIconSize ) ;
    public final void rule__FoodInitDisplay__IconsizeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10294:1: ( ( ruleIconSize ) )
            // InternalGreedySnake.g:10295:2: ( ruleIconSize )
            {
            // InternalGreedySnake.g:10295:2: ( ruleIconSize )
            // InternalGreedySnake.g:10296:3: ruleIconSize
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
    // InternalGreedySnake.g:10305:1: rule__FoodInitDisplay__FoodKindAssignment_9 : ( ruleFoodKind ) ;
    public final void rule__FoodInitDisplay__FoodKindAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10309:1: ( ( ruleFoodKind ) )
            // InternalGreedySnake.g:10310:2: ( ruleFoodKind )
            {
            // InternalGreedySnake.g:10310:2: ( ruleFoodKind )
            // InternalGreedySnake.g:10311:3: ruleFoodKind
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
    // InternalGreedySnake.g:10320:1: rule__FoodInitDisplay__ProduceAssignment_12 : ( ruleRandomFoodSize ) ;
    public final void rule__FoodInitDisplay__ProduceAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10324:1: ( ( ruleRandomFoodSize ) )
            // InternalGreedySnake.g:10325:2: ( ruleRandomFoodSize )
            {
            // InternalGreedySnake.g:10325:2: ( ruleRandomFoodSize )
            // InternalGreedySnake.g:10326:3: ruleRandomFoodSize
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
    // InternalGreedySnake.g:10335:1: rule__FoodInitDisplay__FoodTagAssignment_15 : ( RULE_INT ) ;
    public final void rule__FoodInitDisplay__FoodTagAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10339:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10340:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10340:2: ( RULE_INT )
            // InternalGreedySnake.g:10341:3: RULE_INT
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
    // InternalGreedySnake.g:10350:1: rule__FoodKind__KindAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FoodKind__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10354:1: ( ( ( RULE_ID ) ) )
            // InternalGreedySnake.g:10355:2: ( ( RULE_ID ) )
            {
            // InternalGreedySnake.g:10355:2: ( ( RULE_ID ) )
            // InternalGreedySnake.g:10356:3: ( RULE_ID )
            {
             before(grammarAccess.getFoodKindAccess().getKindIconTagCrossReference_0_0()); 
            // InternalGreedySnake.g:10357:3: ( RULE_ID )
            // InternalGreedySnake.g:10358:4: RULE_ID
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
    // InternalGreedySnake.g:10369:1: rule__FoodKind__PointAssignment_4 : ( ruleAddition ) ;
    public final void rule__FoodKind__PointAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10373:1: ( ( ruleAddition ) )
            // InternalGreedySnake.g:10374:2: ( ruleAddition )
            {
            // InternalGreedySnake.g:10374:2: ( ruleAddition )
            // InternalGreedySnake.g:10375:3: ruleAddition
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
    // InternalGreedySnake.g:10384:1: rule__ObstacleInitDisplay__ObstacleIconAssignment_2 : ( ruleIconTag ) ;
    public final void rule__ObstacleInitDisplay__ObstacleIconAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10388:1: ( ( ruleIconTag ) )
            // InternalGreedySnake.g:10389:2: ( ruleIconTag )
            {
            // InternalGreedySnake.g:10389:2: ( ruleIconTag )
            // InternalGreedySnake.g:10390:3: ruleIconTag
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
    // InternalGreedySnake.g:10399:1: rule__ObstacleInitDisplay__IconsizeAssignment_6 : ( ruleIconSize ) ;
    public final void rule__ObstacleInitDisplay__IconsizeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10403:1: ( ( ruleIconSize ) )
            // InternalGreedySnake.g:10404:2: ( ruleIconSize )
            {
            // InternalGreedySnake.g:10404:2: ( ruleIconSize )
            // InternalGreedySnake.g:10405:3: ruleIconSize
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
    // InternalGreedySnake.g:10414:1: rule__ObstacleInitDisplay__ObstacleTagAssignment_9 : ( RULE_INT ) ;
    public final void rule__ObstacleInitDisplay__ObstacleTagAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10418:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10419:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10419:2: ( RULE_INT )
            // InternalGreedySnake.g:10420:3: RULE_INT
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
    // InternalGreedySnake.g:10429:1: rule__RandomFoodSize__MaxsizeAssignment_1 : ( RULE_INT ) ;
    public final void rule__RandomFoodSize__MaxsizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10433:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10434:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10434:2: ( RULE_INT )
            // InternalGreedySnake.g:10435:3: RULE_INT
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
    // InternalGreedySnake.g:10444:1: rule__RandomFoodSize__MinsizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__RandomFoodSize__MinsizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10448:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10449:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10449:2: ( RULE_INT )
            // InternalGreedySnake.g:10450:3: RULE_INT
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
    // InternalGreedySnake.g:10459:1: rule__ObstacleTime__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ObstacleTime__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10463:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:10464:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:10464:2: ( RULE_ID )
            // InternalGreedySnake.g:10465:3: RULE_ID
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
    // InternalGreedySnake.g:10474:1: rule__ObstacleTime__ObstacleTimeAssignment_2 : ( RULE_INT ) ;
    public final void rule__ObstacleTime__ObstacleTimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10478:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10479:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10479:2: ( RULE_INT )
            // InternalGreedySnake.g:10480:3: RULE_INT
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
    // InternalGreedySnake.g:10489:1: rule__FoodTime__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FoodTime__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10493:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:10494:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:10494:2: ( RULE_ID )
            // InternalGreedySnake.g:10495:3: RULE_ID
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
    // InternalGreedySnake.g:10504:1: rule__FoodTime__FoodTimeAssignment_2 : ( RULE_INT ) ;
    public final void rule__FoodTime__FoodTimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10508:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10509:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10509:2: ( RULE_INT )
            // InternalGreedySnake.g:10510:3: RULE_INT
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


    // $ANTLR start "rule__DirectionSpecification__DiAssignment_3"
    // InternalGreedySnake.g:10519:1: rule__DirectionSpecification__DiAssignment_3 : ( ruledis ) ;
    public final void rule__DirectionSpecification__DiAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10523:1: ( ( ruledis ) )
            // InternalGreedySnake.g:10524:2: ( ruledis )
            {
            // InternalGreedySnake.g:10524:2: ( ruledis )
            // InternalGreedySnake.g:10525:3: ruledis
            {
             before(grammarAccess.getDirectionSpecificationAccess().getDiDisParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruledis();

            state._fsp--;

             after(grammarAccess.getDirectionSpecificationAccess().getDiDisParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionSpecification__DiAssignment_3"


    // $ANTLR start "rule__Dis__NameAssignment_0"
    // InternalGreedySnake.g:10534:1: rule__Dis__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Dis__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10538:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:10539:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:10539:2: ( RULE_ID )
            // InternalGreedySnake.g:10540:3: RULE_ID
            {
             before(grammarAccess.getDisAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDisAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dis__NameAssignment_0"


    // $ANTLR start "rule__Dis__DirectionAssignment_2"
    // InternalGreedySnake.g:10549:1: rule__Dis__DirectionAssignment_2 : ( ruleDirection ) ;
    public final void rule__Dis__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10553:1: ( ( ruleDirection ) )
            // InternalGreedySnake.g:10554:2: ( ruleDirection )
            {
            // InternalGreedySnake.g:10554:2: ( ruleDirection )
            // InternalGreedySnake.g:10555:3: ruleDirection
            {
             before(grammarAccess.getDisAccess().getDirectionDirectionEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getDisAccess().getDirectionDirectionEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dis__DirectionAssignment_2"


    // $ANTLR start "rule__Addition__OperatorAssignment_1_1"
    // InternalGreedySnake.g:10564:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10568:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalGreedySnake.g:10569:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalGreedySnake.g:10569:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalGreedySnake.g:10570:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalGreedySnake.g:10571:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalGreedySnake.g:10571:4: rule__Addition__OperatorAlternatives_1_1_0
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
    // InternalGreedySnake.g:10579:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10583:1: ( ( ruleMultiplication ) )
            // InternalGreedySnake.g:10584:2: ( ruleMultiplication )
            {
            // InternalGreedySnake.g:10584:2: ( ruleMultiplication )
            // InternalGreedySnake.g:10585:3: ruleMultiplication
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
    // InternalGreedySnake.g:10594:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10598:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalGreedySnake.g:10599:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalGreedySnake.g:10599:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalGreedySnake.g:10600:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalGreedySnake.g:10601:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalGreedySnake.g:10601:4: rule__Multiplication__OperatorAlternatives_1_1_0
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
    // InternalGreedySnake.g:10609:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10613:1: ( ( rulePrimary ) )
            // InternalGreedySnake.g:10614:2: ( rulePrimary )
            {
            // InternalGreedySnake.g:10614:2: ( rulePrimary )
            // InternalGreedySnake.g:10615:3: rulePrimary
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
    // InternalGreedySnake.g:10624:1: rule__IntLiteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10628:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10629:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10629:2: ( RULE_INT )
            // InternalGreedySnake.g:10630:3: RULE_INT
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
    // InternalGreedySnake.g:10639:1: rule__RealLiteral__ValAssignment : ( ruleREAL ) ;
    public final void rule__RealLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10643:1: ( ( ruleREAL ) )
            // InternalGreedySnake.g:10644:2: ( ruleREAL )
            {
            // InternalGreedySnake.g:10644:2: ( ruleREAL )
            // InternalGreedySnake.g:10645:3: ruleREAL
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
    // InternalGreedySnake.g:10654:1: rule__StartFieldDeclaration__FieldAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StartFieldDeclaration__FieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10658:1: ( ( ( RULE_ID ) ) )
            // InternalGreedySnake.g:10659:2: ( ( RULE_ID ) )
            {
            // InternalGreedySnake.g:10659:2: ( ( RULE_ID ) )
            // InternalGreedySnake.g:10660:3: ( RULE_ID )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldGlobalFieldInitialisationCrossReference_2_0()); 
            // InternalGreedySnake.g:10661:3: ( RULE_ID )
            // InternalGreedySnake.g:10662:4: RULE_ID
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
    // InternalGreedySnake.g:10673:1: rule__AboutSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AboutSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10677:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:10678:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:10678:2: ( RULE_ID )
            // InternalGreedySnake.g:10679:3: RULE_ID
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
    // InternalGreedySnake.g:10688:1: rule__AboutSpecification__AboutTitleAssignment_5 : ( RULE_STRING ) ;
    public final void rule__AboutSpecification__AboutTitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10692:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:10693:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:10693:2: ( RULE_STRING )
            // InternalGreedySnake.g:10694:3: RULE_STRING
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
    // InternalGreedySnake.g:10703:1: rule__AboutSpecification__AboutInforAssignment_8 : ( RULE_STRING ) ;
    public final void rule__AboutSpecification__AboutInforAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10707:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:10708:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:10708:2: ( RULE_STRING )
            // InternalGreedySnake.g:10709:3: RULE_STRING
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
    // InternalGreedySnake.g:10718:1: rule__AboutSpecification__XAssignment_12 : ( RULE_INT ) ;
    public final void rule__AboutSpecification__XAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10722:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10723:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10723:2: ( RULE_INT )
            // InternalGreedySnake.g:10724:3: RULE_INT
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
    // InternalGreedySnake.g:10733:1: rule__AboutSpecification__YAssignment_14 : ( RULE_INT ) ;
    public final void rule__AboutSpecification__YAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10737:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10738:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10738:2: ( RULE_INT )
            // InternalGreedySnake.g:10739:3: RULE_INT
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
    // InternalGreedySnake.g:10748:1: rule__HelpSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HelpSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10752:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:10753:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:10753:2: ( RULE_ID )
            // InternalGreedySnake.g:10754:3: RULE_ID
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
    // InternalGreedySnake.g:10763:1: rule__HelpSpecification__HelpTitleAssignment_5 : ( RULE_STRING ) ;
    public final void rule__HelpSpecification__HelpTitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10767:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:10768:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:10768:2: ( RULE_STRING )
            // InternalGreedySnake.g:10769:3: RULE_STRING
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
    // InternalGreedySnake.g:10778:1: rule__HelpSpecification__HelpInforAssignment_8 : ( RULE_STRING ) ;
    public final void rule__HelpSpecification__HelpInforAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10782:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:10783:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:10783:2: ( RULE_STRING )
            // InternalGreedySnake.g:10784:3: RULE_STRING
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
    // InternalGreedySnake.g:10793:1: rule__HelpSpecification__XAssignment_12 : ( RULE_INT ) ;
    public final void rule__HelpSpecification__XAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10797:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10798:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10798:2: ( RULE_INT )
            // InternalGreedySnake.g:10799:3: RULE_INT
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
    // InternalGreedySnake.g:10808:1: rule__HelpSpecification__YAssignment_14 : ( RULE_INT ) ;
    public final void rule__HelpSpecification__YAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10812:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10813:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10813:2: ( RULE_INT )
            // InternalGreedySnake.g:10814:3: RULE_INT
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
    // InternalGreedySnake.g:10823:1: rule__BackSpecification__BackgroundIconAssignment_4 : ( ruleBackgroundIcon ) ;
    public final void rule__BackSpecification__BackgroundIconAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10827:1: ( ( ruleBackgroundIcon ) )
            // InternalGreedySnake.g:10828:2: ( ruleBackgroundIcon )
            {
            // InternalGreedySnake.g:10828:2: ( ruleBackgroundIcon )
            // InternalGreedySnake.g:10829:3: ruleBackgroundIcon
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
    // InternalGreedySnake.g:10838:1: rule__BackSpecification__BackGroundHeightAssignment_8 : ( RULE_INT ) ;
    public final void rule__BackSpecification__BackGroundHeightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10842:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10843:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10843:2: ( RULE_INT )
            // InternalGreedySnake.g:10844:3: RULE_INT
            {
             before(grammarAccess.getBackSpecificationAccess().getBackGroundHeightINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBackSpecificationAccess().getBackGroundHeightINTTerminalRuleCall_8_0()); 

            }


            }

        }
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
    // InternalGreedySnake.g:10853:1: rule__BackSpecification__BackGroundWidthAssignment_11 : ( RULE_INT ) ;
    public final void rule__BackSpecification__BackGroundWidthAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10857:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10858:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10858:2: ( RULE_INT )
            // InternalGreedySnake.g:10859:3: RULE_INT
            {
             before(grammarAccess.getBackSpecificationAccess().getBackGroundWidthINTTerminalRuleCall_11_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBackSpecificationAccess().getBackGroundWidthINTTerminalRuleCall_11_0()); 

            }


            }

        }
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
    // InternalGreedySnake.g:10868:1: rule__BackgroundIcon__BackgroundTagAssignment_1 : ( ruleBackgroundTag ) ;
    public final void rule__BackgroundIcon__BackgroundTagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10872:1: ( ( ruleBackgroundTag ) )
            // InternalGreedySnake.g:10873:2: ( ruleBackgroundTag )
            {
            // InternalGreedySnake.g:10873:2: ( ruleBackgroundTag )
            // InternalGreedySnake.g:10874:3: ruleBackgroundTag
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
    // InternalGreedySnake.g:10883:1: rule__BackgroundTag__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BackgroundTag__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10887:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:10888:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:10888:2: ( RULE_ID )
            // InternalGreedySnake.g:10889:3: RULE_ID
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
    // InternalGreedySnake.g:10898:1: rule__BackgroundTag__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__BackgroundTag__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10902:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:10903:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:10903:2: ( RULE_STRING )
            // InternalGreedySnake.g:10904:3: RULE_STRING
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
    // InternalGreedySnake.g:10913:1: rule__BackgroundTag__BKtagAssignment_3 : ( RULE_INT ) ;
    public final void rule__BackgroundTag__BKtagAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10917:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10918:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10918:2: ( RULE_INT )
            // InternalGreedySnake.g:10919:3: RULE_INT
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
    // InternalGreedySnake.g:10928:1: rule__BackgroundTag__LocateAssignment_6 : ( RULE_STRING ) ;
    public final void rule__BackgroundTag__LocateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10932:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:10933:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:10933:2: ( RULE_STRING )
            // InternalGreedySnake.g:10934:3: RULE_STRING
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
    // InternalGreedySnake.g:10943:1: rule__MusicSpecification__BuffersizeAssignment_4 : ( RULE_INT ) ;
    public final void rule__MusicSpecification__BuffersizeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10947:1: ( ( RULE_INT ) )
            // InternalGreedySnake.g:10948:2: ( RULE_INT )
            {
            // InternalGreedySnake.g:10948:2: ( RULE_INT )
            // InternalGreedySnake.g:10949:3: RULE_INT
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
    // InternalGreedySnake.g:10958:1: rule__MusicSpecification__MusicPathAssignment_5 : ( ruleMusicPath ) ;
    public final void rule__MusicSpecification__MusicPathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10962:1: ( ( ruleMusicPath ) )
            // InternalGreedySnake.g:10963:2: ( ruleMusicPath )
            {
            // InternalGreedySnake.g:10963:2: ( ruleMusicPath )
            // InternalGreedySnake.g:10964:3: ruleMusicPath
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
    // InternalGreedySnake.g:10973:1: rule__MusicPath__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MusicPath__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10977:1: ( ( RULE_ID ) )
            // InternalGreedySnake.g:10978:2: ( RULE_ID )
            {
            // InternalGreedySnake.g:10978:2: ( RULE_ID )
            // InternalGreedySnake.g:10979:3: RULE_ID
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
    // InternalGreedySnake.g:10988:1: rule__MusicPath__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__MusicPath__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGreedySnake.g:10992:1: ( ( RULE_STRING ) )
            // InternalGreedySnake.g:10993:2: ( RULE_STRING )
            {
            // InternalGreedySnake.g:10993:2: ( RULE_STRING )
            // InternalGreedySnake.g:10994:3: RULE_STRING
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


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\2\5\17\uffff";
    static final String dfa_3s = "\1\123\1\60\17\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\10\1\1";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\22\uffff\1\7\1\uffff\1\15\20\uffff\1\1\1\2\1\3\1\5\1\4\26\uffff\1\6\1\11\2\16\1\10\3\uffff\1\12\1\14\3\uffff\1\13",
            "\1\20\52\uffff\1\17",
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
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1226:1: rule__GreedySnake__Alternatives_3 : ( ( ( rule__GreedySnake__SnakesAssignment_3_0 ) ) | ( ( rule__GreedySnake__FoodsAssignment_3_1 ) ) | ( ( rule__GreedySnake__ObstaclesAssignment_3_2 ) ) | ( ( rule__GreedySnake__SpeedAssignment_3_3 ) ) | ( ( rule__GreedySnake__FireAssignment_3_4 ) ) | ( ( rule__GreedySnake__TimeAssignment_3_5 ) ) | ( ( rule__GreedySnake__MapAssignment_3_6 ) ) | ( ( rule__GreedySnake__SnakeMoveAssignment_3_7 ) ) | ( ( rule__GreedySnake__AboutAssignment_3_8 ) ) | ( ( rule__GreedySnake__DirectionsAssignment_3_9 ) ) | ( ( rule__GreedySnake__HelpAssignment_3_10 ) ) | ( ( rule__GreedySnake__MusicAssignment_3_11 ) ) | ( ( rule__GreedySnake__BackgroundsAssignment_3_12 ) ) | ( ( rule__GreedySnake__FieldsAssignment_3_13 ) ) | ( ( rule__GreedySnake__OptionsAssignment_3_14 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000F80005000020L,0x000000000008C7C0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000F80005000022L,0x000000000008C7C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0008000400000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});

}
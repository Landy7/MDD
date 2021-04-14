package org.xtext.example.mydsl2.group16.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl2.group16.services.GreedySnakeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGreedySnakeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'{'", "'}'", "'Filepath'", "'='", "'field'", "'Panel_width'", "'Panel_Height'", "'column'", "'row'", "'label_width'", "'label_Height'", "'init'", "'('", "')'", "'Default'", "':'", "'snakeLength'", "'Score'", "'Time'", "'Amount'", "'Weapon'", "'snake'", "'food'", "'obstacle'", "'fire'", "'Speed'", "'move'", "'if'", "'direction'", "'.'", "'x'", "'y'", "'+'", "'-'", "'FireIcon'", "'Icon_size'", "'head'", "','", "'headIcon'", "'BodyIcon'", "'defaultSpeed'", "'snakeTag'", "'Locate'", "'foodIcon'", "'foodKind'", "'randomFoodSize'", "'foodTag'", "'point'", "'ObstacleIcon'", "'ObstacleTag'", "'Maxsize'", "'Minsize'", "'timeLimited'", "'Direction'", "'*'", "'/'", "'restartGame'", "'start'", "'about'", "'Title'", "'Information'", "'Label_size'", "'help'", "'backGround'", "'Icon'", "'Height'", "'Width'", "'Music'", "'BufferSize'", "'path'", "'LEFT'", "'RIGHT'", "'UP'", "'DOWN'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=5;
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

        public InternalGreedySnakeParser(TokenStream input, GreedySnakeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GreedySnake";
       	}

       	@Override
       	protected GreedySnakeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGreedySnake"
    // InternalGreedySnake.g:65:1: entryRuleGreedySnake returns [EObject current=null] : iv_ruleGreedySnake= ruleGreedySnake EOF ;
    public final EObject entryRuleGreedySnake() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreedySnake = null;


        try {
            // InternalGreedySnake.g:65:52: (iv_ruleGreedySnake= ruleGreedySnake EOF )
            // InternalGreedySnake.g:66:2: iv_ruleGreedySnake= ruleGreedySnake EOF
            {
             newCompositeNode(grammarAccess.getGreedySnakeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreedySnake=ruleGreedySnake();

            state._fsp--;

             current =iv_ruleGreedySnake; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreedySnake"


    // $ANTLR start "ruleGreedySnake"
    // InternalGreedySnake.g:72:1: ruleGreedySnake returns [EObject current=null] : (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_snakes_3_0= ruleInitialSnakeSpecificatin ) ) | ( (lv_foods_4_0= ruleInitialFoodSpecificatin ) ) | ( (lv_obstacles_5_0= ruleInitialObstacleSpecificatin ) ) | ( (lv_speed_6_0= ruleInitialSpeedSpecification ) ) | ( (lv_fire_7_0= ruleInitialFireSpecification ) ) | ( (lv_time_8_0= ruleTimeLimited ) ) | ( (lv_Map_9_0= ruleGlobalMap ) ) | ( (lv_SnakeMove_10_0= ruleSnakeMoveSpecification ) ) | ( (lv_about_11_0= ruleAboutSpecification ) ) | ( (lv_directions_12_0= ruleDirectionSpecification ) ) | ( (lv_Help_13_0= ruleHelpSpecification ) ) | ( (lv_Music_14_0= ruleMusicSpecification ) ) | ( (lv_Backgrounds_15_0= ruleBackSpecification ) ) | ( (lv_fields_16_0= ruleGlobalFieldInitialisation ) ) | ( (lv_options_17_0= ruleOptionSpecification ) ) )+ otherlv_18= '}' ) ;
    public final EObject ruleGreedySnake() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_18=null;
        EObject lv_snakes_3_0 = null;

        EObject lv_foods_4_0 = null;

        EObject lv_obstacles_5_0 = null;

        EObject lv_speed_6_0 = null;

        EObject lv_fire_7_0 = null;

        EObject lv_time_8_0 = null;

        EObject lv_Map_9_0 = null;

        EObject lv_SnakeMove_10_0 = null;

        EObject lv_about_11_0 = null;

        EObject lv_directions_12_0 = null;

        EObject lv_Help_13_0 = null;

        EObject lv_Music_14_0 = null;

        EObject lv_Backgrounds_15_0 = null;

        EObject lv_fields_16_0 = null;

        EObject lv_options_17_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:78:2: ( (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_snakes_3_0= ruleInitialSnakeSpecificatin ) ) | ( (lv_foods_4_0= ruleInitialFoodSpecificatin ) ) | ( (lv_obstacles_5_0= ruleInitialObstacleSpecificatin ) ) | ( (lv_speed_6_0= ruleInitialSpeedSpecification ) ) | ( (lv_fire_7_0= ruleInitialFireSpecification ) ) | ( (lv_time_8_0= ruleTimeLimited ) ) | ( (lv_Map_9_0= ruleGlobalMap ) ) | ( (lv_SnakeMove_10_0= ruleSnakeMoveSpecification ) ) | ( (lv_about_11_0= ruleAboutSpecification ) ) | ( (lv_directions_12_0= ruleDirectionSpecification ) ) | ( (lv_Help_13_0= ruleHelpSpecification ) ) | ( (lv_Music_14_0= ruleMusicSpecification ) ) | ( (lv_Backgrounds_15_0= ruleBackSpecification ) ) | ( (lv_fields_16_0= ruleGlobalFieldInitialisation ) ) | ( (lv_options_17_0= ruleOptionSpecification ) ) )+ otherlv_18= '}' ) )
            // InternalGreedySnake.g:79:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_snakes_3_0= ruleInitialSnakeSpecificatin ) ) | ( (lv_foods_4_0= ruleInitialFoodSpecificatin ) ) | ( (lv_obstacles_5_0= ruleInitialObstacleSpecificatin ) ) | ( (lv_speed_6_0= ruleInitialSpeedSpecification ) ) | ( (lv_fire_7_0= ruleInitialFireSpecification ) ) | ( (lv_time_8_0= ruleTimeLimited ) ) | ( (lv_Map_9_0= ruleGlobalMap ) ) | ( (lv_SnakeMove_10_0= ruleSnakeMoveSpecification ) ) | ( (lv_about_11_0= ruleAboutSpecification ) ) | ( (lv_directions_12_0= ruleDirectionSpecification ) ) | ( (lv_Help_13_0= ruleHelpSpecification ) ) | ( (lv_Music_14_0= ruleMusicSpecification ) ) | ( (lv_Backgrounds_15_0= ruleBackSpecification ) ) | ( (lv_fields_16_0= ruleGlobalFieldInitialisation ) ) | ( (lv_options_17_0= ruleOptionSpecification ) ) )+ otherlv_18= '}' )
            {
            // InternalGreedySnake.g:79:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_snakes_3_0= ruleInitialSnakeSpecificatin ) ) | ( (lv_foods_4_0= ruleInitialFoodSpecificatin ) ) | ( (lv_obstacles_5_0= ruleInitialObstacleSpecificatin ) ) | ( (lv_speed_6_0= ruleInitialSpeedSpecification ) ) | ( (lv_fire_7_0= ruleInitialFireSpecification ) ) | ( (lv_time_8_0= ruleTimeLimited ) ) | ( (lv_Map_9_0= ruleGlobalMap ) ) | ( (lv_SnakeMove_10_0= ruleSnakeMoveSpecification ) ) | ( (lv_about_11_0= ruleAboutSpecification ) ) | ( (lv_directions_12_0= ruleDirectionSpecification ) ) | ( (lv_Help_13_0= ruleHelpSpecification ) ) | ( (lv_Music_14_0= ruleMusicSpecification ) ) | ( (lv_Backgrounds_15_0= ruleBackSpecification ) ) | ( (lv_fields_16_0= ruleGlobalFieldInitialisation ) ) | ( (lv_options_17_0= ruleOptionSpecification ) ) )+ otherlv_18= '}' )
            // InternalGreedySnake.g:80:3: otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_snakes_3_0= ruleInitialSnakeSpecificatin ) ) | ( (lv_foods_4_0= ruleInitialFoodSpecificatin ) ) | ( (lv_obstacles_5_0= ruleInitialObstacleSpecificatin ) ) | ( (lv_speed_6_0= ruleInitialSpeedSpecification ) ) | ( (lv_fire_7_0= ruleInitialFireSpecification ) ) | ( (lv_time_8_0= ruleTimeLimited ) ) | ( (lv_Map_9_0= ruleGlobalMap ) ) | ( (lv_SnakeMove_10_0= ruleSnakeMoveSpecification ) ) | ( (lv_about_11_0= ruleAboutSpecification ) ) | ( (lv_directions_12_0= ruleDirectionSpecification ) ) | ( (lv_Help_13_0= ruleHelpSpecification ) ) | ( (lv_Music_14_0= ruleMusicSpecification ) ) | ( (lv_Backgrounds_15_0= ruleBackSpecification ) ) | ( (lv_fields_16_0= ruleGlobalFieldInitialisation ) ) | ( (lv_options_17_0= ruleOptionSpecification ) ) )+ otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGreedySnakeAccess().getGameKeyword_0());
            		
            // InternalGreedySnake.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGreedySnakeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreedySnakeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGreedySnakeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGreedySnake.g:106:3: ( ( (lv_snakes_3_0= ruleInitialSnakeSpecificatin ) ) | ( (lv_foods_4_0= ruleInitialFoodSpecificatin ) ) | ( (lv_obstacles_5_0= ruleInitialObstacleSpecificatin ) ) | ( (lv_speed_6_0= ruleInitialSpeedSpecification ) ) | ( (lv_fire_7_0= ruleInitialFireSpecification ) ) | ( (lv_time_8_0= ruleTimeLimited ) ) | ( (lv_Map_9_0= ruleGlobalMap ) ) | ( (lv_SnakeMove_10_0= ruleSnakeMoveSpecification ) ) | ( (lv_about_11_0= ruleAboutSpecification ) ) | ( (lv_directions_12_0= ruleDirectionSpecification ) ) | ( (lv_Help_13_0= ruleHelpSpecification ) ) | ( (lv_Music_14_0= ruleMusicSpecification ) ) | ( (lv_Backgrounds_15_0= ruleBackSpecification ) ) | ( (lv_fields_16_0= ruleGlobalFieldInitialisation ) ) | ( (lv_options_17_0= ruleOptionSpecification ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=16;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalGreedySnake.g:107:4: ( (lv_snakes_3_0= ruleInitialSnakeSpecificatin ) )
            	    {
            	    // InternalGreedySnake.g:107:4: ( (lv_snakes_3_0= ruleInitialSnakeSpecificatin ) )
            	    // InternalGreedySnake.g:108:5: (lv_snakes_3_0= ruleInitialSnakeSpecificatin )
            	    {
            	    // InternalGreedySnake.g:108:5: (lv_snakes_3_0= ruleInitialSnakeSpecificatin )
            	    // InternalGreedySnake.g:109:6: lv_snakes_3_0= ruleInitialSnakeSpecificatin
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getSnakesInitialSnakeSpecificatinParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_snakes_3_0=ruleInitialSnakeSpecificatin();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"snakes",
            	    							lv_snakes_3_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.InitialSnakeSpecificatin");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGreedySnake.g:127:4: ( (lv_foods_4_0= ruleInitialFoodSpecificatin ) )
            	    {
            	    // InternalGreedySnake.g:127:4: ( (lv_foods_4_0= ruleInitialFoodSpecificatin ) )
            	    // InternalGreedySnake.g:128:5: (lv_foods_4_0= ruleInitialFoodSpecificatin )
            	    {
            	    // InternalGreedySnake.g:128:5: (lv_foods_4_0= ruleInitialFoodSpecificatin )
            	    // InternalGreedySnake.g:129:6: lv_foods_4_0= ruleInitialFoodSpecificatin
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getFoodsInitialFoodSpecificatinParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_foods_4_0=ruleInitialFoodSpecificatin();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"foods",
            	    							lv_foods_4_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.InitialFoodSpecificatin");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalGreedySnake.g:147:4: ( (lv_obstacles_5_0= ruleInitialObstacleSpecificatin ) )
            	    {
            	    // InternalGreedySnake.g:147:4: ( (lv_obstacles_5_0= ruleInitialObstacleSpecificatin ) )
            	    // InternalGreedySnake.g:148:5: (lv_obstacles_5_0= ruleInitialObstacleSpecificatin )
            	    {
            	    // InternalGreedySnake.g:148:5: (lv_obstacles_5_0= ruleInitialObstacleSpecificatin )
            	    // InternalGreedySnake.g:149:6: lv_obstacles_5_0= ruleInitialObstacleSpecificatin
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getObstaclesInitialObstacleSpecificatinParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_obstacles_5_0=ruleInitialObstacleSpecificatin();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"obstacles",
            	    							lv_obstacles_5_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.InitialObstacleSpecificatin");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalGreedySnake.g:167:4: ( (lv_speed_6_0= ruleInitialSpeedSpecification ) )
            	    {
            	    // InternalGreedySnake.g:167:4: ( (lv_speed_6_0= ruleInitialSpeedSpecification ) )
            	    // InternalGreedySnake.g:168:5: (lv_speed_6_0= ruleInitialSpeedSpecification )
            	    {
            	    // InternalGreedySnake.g:168:5: (lv_speed_6_0= ruleInitialSpeedSpecification )
            	    // InternalGreedySnake.g:169:6: lv_speed_6_0= ruleInitialSpeedSpecification
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getSpeedInitialSpeedSpecificationParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_speed_6_0=ruleInitialSpeedSpecification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"speed",
            	    							lv_speed_6_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.InitialSpeedSpecification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalGreedySnake.g:187:4: ( (lv_fire_7_0= ruleInitialFireSpecification ) )
            	    {
            	    // InternalGreedySnake.g:187:4: ( (lv_fire_7_0= ruleInitialFireSpecification ) )
            	    // InternalGreedySnake.g:188:5: (lv_fire_7_0= ruleInitialFireSpecification )
            	    {
            	    // InternalGreedySnake.g:188:5: (lv_fire_7_0= ruleInitialFireSpecification )
            	    // InternalGreedySnake.g:189:6: lv_fire_7_0= ruleInitialFireSpecification
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getFireInitialFireSpecificationParserRuleCall_3_4_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_fire_7_0=ruleInitialFireSpecification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fire",
            	    							lv_fire_7_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.InitialFireSpecification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalGreedySnake.g:207:4: ( (lv_time_8_0= ruleTimeLimited ) )
            	    {
            	    // InternalGreedySnake.g:207:4: ( (lv_time_8_0= ruleTimeLimited ) )
            	    // InternalGreedySnake.g:208:5: (lv_time_8_0= ruleTimeLimited )
            	    {
            	    // InternalGreedySnake.g:208:5: (lv_time_8_0= ruleTimeLimited )
            	    // InternalGreedySnake.g:209:6: lv_time_8_0= ruleTimeLimited
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getTimeTimeLimitedParserRuleCall_3_5_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_time_8_0=ruleTimeLimited();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"time",
            	    							lv_time_8_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.TimeLimited");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalGreedySnake.g:227:4: ( (lv_Map_9_0= ruleGlobalMap ) )
            	    {
            	    // InternalGreedySnake.g:227:4: ( (lv_Map_9_0= ruleGlobalMap ) )
            	    // InternalGreedySnake.g:228:5: (lv_Map_9_0= ruleGlobalMap )
            	    {
            	    // InternalGreedySnake.g:228:5: (lv_Map_9_0= ruleGlobalMap )
            	    // InternalGreedySnake.g:229:6: lv_Map_9_0= ruleGlobalMap
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getMapGlobalMapParserRuleCall_3_6_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_Map_9_0=ruleGlobalMap();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Map",
            	    							lv_Map_9_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.GlobalMap");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalGreedySnake.g:247:4: ( (lv_SnakeMove_10_0= ruleSnakeMoveSpecification ) )
            	    {
            	    // InternalGreedySnake.g:247:4: ( (lv_SnakeMove_10_0= ruleSnakeMoveSpecification ) )
            	    // InternalGreedySnake.g:248:5: (lv_SnakeMove_10_0= ruleSnakeMoveSpecification )
            	    {
            	    // InternalGreedySnake.g:248:5: (lv_SnakeMove_10_0= ruleSnakeMoveSpecification )
            	    // InternalGreedySnake.g:249:6: lv_SnakeMove_10_0= ruleSnakeMoveSpecification
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getSnakeMoveSnakeMoveSpecificationParserRuleCall_3_7_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_SnakeMove_10_0=ruleSnakeMoveSpecification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"SnakeMove",
            	    							lv_SnakeMove_10_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.SnakeMoveSpecification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalGreedySnake.g:267:4: ( (lv_about_11_0= ruleAboutSpecification ) )
            	    {
            	    // InternalGreedySnake.g:267:4: ( (lv_about_11_0= ruleAboutSpecification ) )
            	    // InternalGreedySnake.g:268:5: (lv_about_11_0= ruleAboutSpecification )
            	    {
            	    // InternalGreedySnake.g:268:5: (lv_about_11_0= ruleAboutSpecification )
            	    // InternalGreedySnake.g:269:6: lv_about_11_0= ruleAboutSpecification
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getAboutAboutSpecificationParserRuleCall_3_8_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_about_11_0=ruleAboutSpecification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"about",
            	    							lv_about_11_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.AboutSpecification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalGreedySnake.g:287:4: ( (lv_directions_12_0= ruleDirectionSpecification ) )
            	    {
            	    // InternalGreedySnake.g:287:4: ( (lv_directions_12_0= ruleDirectionSpecification ) )
            	    // InternalGreedySnake.g:288:5: (lv_directions_12_0= ruleDirectionSpecification )
            	    {
            	    // InternalGreedySnake.g:288:5: (lv_directions_12_0= ruleDirectionSpecification )
            	    // InternalGreedySnake.g:289:6: lv_directions_12_0= ruleDirectionSpecification
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getDirectionsDirectionSpecificationParserRuleCall_3_9_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_directions_12_0=ruleDirectionSpecification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"directions",
            	    							lv_directions_12_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.DirectionSpecification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalGreedySnake.g:307:4: ( (lv_Help_13_0= ruleHelpSpecification ) )
            	    {
            	    // InternalGreedySnake.g:307:4: ( (lv_Help_13_0= ruleHelpSpecification ) )
            	    // InternalGreedySnake.g:308:5: (lv_Help_13_0= ruleHelpSpecification )
            	    {
            	    // InternalGreedySnake.g:308:5: (lv_Help_13_0= ruleHelpSpecification )
            	    // InternalGreedySnake.g:309:6: lv_Help_13_0= ruleHelpSpecification
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getHelpHelpSpecificationParserRuleCall_3_10_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_Help_13_0=ruleHelpSpecification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Help",
            	    							lv_Help_13_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.HelpSpecification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalGreedySnake.g:327:4: ( (lv_Music_14_0= ruleMusicSpecification ) )
            	    {
            	    // InternalGreedySnake.g:327:4: ( (lv_Music_14_0= ruleMusicSpecification ) )
            	    // InternalGreedySnake.g:328:5: (lv_Music_14_0= ruleMusicSpecification )
            	    {
            	    // InternalGreedySnake.g:328:5: (lv_Music_14_0= ruleMusicSpecification )
            	    // InternalGreedySnake.g:329:6: lv_Music_14_0= ruleMusicSpecification
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getMusicMusicSpecificationParserRuleCall_3_11_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_Music_14_0=ruleMusicSpecification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Music",
            	    							lv_Music_14_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.MusicSpecification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalGreedySnake.g:347:4: ( (lv_Backgrounds_15_0= ruleBackSpecification ) )
            	    {
            	    // InternalGreedySnake.g:347:4: ( (lv_Backgrounds_15_0= ruleBackSpecification ) )
            	    // InternalGreedySnake.g:348:5: (lv_Backgrounds_15_0= ruleBackSpecification )
            	    {
            	    // InternalGreedySnake.g:348:5: (lv_Backgrounds_15_0= ruleBackSpecification )
            	    // InternalGreedySnake.g:349:6: lv_Backgrounds_15_0= ruleBackSpecification
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getBackgroundsBackSpecificationParserRuleCall_3_12_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_Backgrounds_15_0=ruleBackSpecification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Backgrounds",
            	    							lv_Backgrounds_15_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.BackSpecification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // InternalGreedySnake.g:367:4: ( (lv_fields_16_0= ruleGlobalFieldInitialisation ) )
            	    {
            	    // InternalGreedySnake.g:367:4: ( (lv_fields_16_0= ruleGlobalFieldInitialisation ) )
            	    // InternalGreedySnake.g:368:5: (lv_fields_16_0= ruleGlobalFieldInitialisation )
            	    {
            	    // InternalGreedySnake.g:368:5: (lv_fields_16_0= ruleGlobalFieldInitialisation )
            	    // InternalGreedySnake.g:369:6: lv_fields_16_0= ruleGlobalFieldInitialisation
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getFieldsGlobalFieldInitialisationParserRuleCall_3_13_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_fields_16_0=ruleGlobalFieldInitialisation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fields",
            	    							lv_fields_16_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.GlobalFieldInitialisation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // InternalGreedySnake.g:387:4: ( (lv_options_17_0= ruleOptionSpecification ) )
            	    {
            	    // InternalGreedySnake.g:387:4: ( (lv_options_17_0= ruleOptionSpecification ) )
            	    // InternalGreedySnake.g:388:5: (lv_options_17_0= ruleOptionSpecification )
            	    {
            	    // InternalGreedySnake.g:388:5: (lv_options_17_0= ruleOptionSpecification )
            	    // InternalGreedySnake.g:389:6: lv_options_17_0= ruleOptionSpecification
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getOptionsOptionSpecificationParserRuleCall_3_14_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_options_17_0=ruleOptionSpecification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"options",
            	    							lv_options_17_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.OptionSpecification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


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

            otherlv_18=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getGreedySnakeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreedySnake"


    // $ANTLR start "entryRuleGlobalMap"
    // InternalGreedySnake.g:415:1: entryRuleGlobalMap returns [EObject current=null] : iv_ruleGlobalMap= ruleGlobalMap EOF ;
    public final EObject entryRuleGlobalMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalMap = null;


        try {
            // InternalGreedySnake.g:415:50: (iv_ruleGlobalMap= ruleGlobalMap EOF )
            // InternalGreedySnake.g:416:2: iv_ruleGlobalMap= ruleGlobalMap EOF
            {
             newCompositeNode(grammarAccess.getGlobalMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalMap=ruleGlobalMap();

            state._fsp--;

             current =iv_ruleGlobalMap; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalMap"


    // $ANTLR start "ruleGlobalMap"
    // InternalGreedySnake.g:422:1: ruleGlobalMap returns [EObject current=null] : (otherlv_0= 'Filepath' otherlv_1= '=' ( (lv_map_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGlobalMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_map_2_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:428:2: ( (otherlv_0= 'Filepath' otherlv_1= '=' ( (lv_map_2_0= RULE_STRING ) ) ) )
            // InternalGreedySnake.g:429:2: (otherlv_0= 'Filepath' otherlv_1= '=' ( (lv_map_2_0= RULE_STRING ) ) )
            {
            // InternalGreedySnake.g:429:2: (otherlv_0= 'Filepath' otherlv_1= '=' ( (lv_map_2_0= RULE_STRING ) ) )
            // InternalGreedySnake.g:430:3: otherlv_0= 'Filepath' otherlv_1= '=' ( (lv_map_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalMapAccess().getFilepathKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalMapAccess().getEqualsSignKeyword_1());
            		
            // InternalGreedySnake.g:438:3: ( (lv_map_2_0= RULE_STRING ) )
            // InternalGreedySnake.g:439:4: (lv_map_2_0= RULE_STRING )
            {
            // InternalGreedySnake.g:439:4: (lv_map_2_0= RULE_STRING )
            // InternalGreedySnake.g:440:5: lv_map_2_0= RULE_STRING
            {
            lv_map_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_map_2_0, grammarAccess.getGlobalMapAccess().getMapSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalMapRule());
            					}
            					setWithLastConsumed(
            						current,
            						"map",
            						lv_map_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalMap"


    // $ANTLR start "entryRuleGlobalFieldInitialisation"
    // InternalGreedySnake.g:460:1: entryRuleGlobalFieldInitialisation returns [EObject current=null] : iv_ruleGlobalFieldInitialisation= ruleGlobalFieldInitialisation EOF ;
    public final EObject entryRuleGlobalFieldInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalFieldInitialisation = null;


        try {
            // InternalGreedySnake.g:460:66: (iv_ruleGlobalFieldInitialisation= ruleGlobalFieldInitialisation EOF )
            // InternalGreedySnake.g:461:2: iv_ruleGlobalFieldInitialisation= ruleGlobalFieldInitialisation EOF
            {
             newCompositeNode(grammarAccess.getGlobalFieldInitialisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalFieldInitialisation=ruleGlobalFieldInitialisation();

            state._fsp--;

             current =iv_ruleGlobalFieldInitialisation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalFieldInitialisation"


    // $ANTLR start "ruleGlobalFieldInitialisation"
    // InternalGreedySnake.g:467:1: ruleGlobalFieldInitialisation returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Panel_width' otherlv_4= '=' ( (lv_panelWidth_5_0= RULE_INT ) ) otherlv_6= 'Panel_Height' otherlv_7= '=' ( (lv_panelHeight_8_0= RULE_INT ) ) otherlv_9= 'column' otherlv_10= '=' ( (lv_width_11_0= RULE_INT ) ) otherlv_12= 'row' otherlv_13= '=' ( (lv_height_14_0= RULE_INT ) ) otherlv_15= 'label_width' otherlv_16= '=' ( (lv_labelWidth_17_0= RULE_INT ) ) otherlv_18= 'label_Height' otherlv_19= '=' ( (lv_labelHeight_20_0= RULE_INT ) ) ( (lv_field_initialisation_21_0= ruleInitialField ) ) otherlv_22= '}' ) ;
    public final EObject ruleGlobalFieldInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_panelWidth_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_panelHeight_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_width_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_height_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_labelWidth_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_labelHeight_20_0=null;
        Token otherlv_22=null;
        EObject lv_field_initialisation_21_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:473:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Panel_width' otherlv_4= '=' ( (lv_panelWidth_5_0= RULE_INT ) ) otherlv_6= 'Panel_Height' otherlv_7= '=' ( (lv_panelHeight_8_0= RULE_INT ) ) otherlv_9= 'column' otherlv_10= '=' ( (lv_width_11_0= RULE_INT ) ) otherlv_12= 'row' otherlv_13= '=' ( (lv_height_14_0= RULE_INT ) ) otherlv_15= 'label_width' otherlv_16= '=' ( (lv_labelWidth_17_0= RULE_INT ) ) otherlv_18= 'label_Height' otherlv_19= '=' ( (lv_labelHeight_20_0= RULE_INT ) ) ( (lv_field_initialisation_21_0= ruleInitialField ) ) otherlv_22= '}' ) )
            // InternalGreedySnake.g:474:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Panel_width' otherlv_4= '=' ( (lv_panelWidth_5_0= RULE_INT ) ) otherlv_6= 'Panel_Height' otherlv_7= '=' ( (lv_panelHeight_8_0= RULE_INT ) ) otherlv_9= 'column' otherlv_10= '=' ( (lv_width_11_0= RULE_INT ) ) otherlv_12= 'row' otherlv_13= '=' ( (lv_height_14_0= RULE_INT ) ) otherlv_15= 'label_width' otherlv_16= '=' ( (lv_labelWidth_17_0= RULE_INT ) ) otherlv_18= 'label_Height' otherlv_19= '=' ( (lv_labelHeight_20_0= RULE_INT ) ) ( (lv_field_initialisation_21_0= ruleInitialField ) ) otherlv_22= '}' )
            {
            // InternalGreedySnake.g:474:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Panel_width' otherlv_4= '=' ( (lv_panelWidth_5_0= RULE_INT ) ) otherlv_6= 'Panel_Height' otherlv_7= '=' ( (lv_panelHeight_8_0= RULE_INT ) ) otherlv_9= 'column' otherlv_10= '=' ( (lv_width_11_0= RULE_INT ) ) otherlv_12= 'row' otherlv_13= '=' ( (lv_height_14_0= RULE_INT ) ) otherlv_15= 'label_width' otherlv_16= '=' ( (lv_labelWidth_17_0= RULE_INT ) ) otherlv_18= 'label_Height' otherlv_19= '=' ( (lv_labelHeight_20_0= RULE_INT ) ) ( (lv_field_initialisation_21_0= ruleInitialField ) ) otherlv_22= '}' )
            // InternalGreedySnake.g:475:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Panel_width' otherlv_4= '=' ( (lv_panelWidth_5_0= RULE_INT ) ) otherlv_6= 'Panel_Height' otherlv_7= '=' ( (lv_panelHeight_8_0= RULE_INT ) ) otherlv_9= 'column' otherlv_10= '=' ( (lv_width_11_0= RULE_INT ) ) otherlv_12= 'row' otherlv_13= '=' ( (lv_height_14_0= RULE_INT ) ) otherlv_15= 'label_width' otherlv_16= '=' ( (lv_labelWidth_17_0= RULE_INT ) ) otherlv_18= 'label_Height' otherlv_19= '=' ( (lv_labelHeight_20_0= RULE_INT ) ) ( (lv_field_initialisation_21_0= ruleInitialField ) ) otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalFieldInitialisationAccess().getFieldKeyword_0());
            		
            // InternalGreedySnake.g:479:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:480:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:480:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:481:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGlobalFieldInitialisationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalFieldInitialisationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getGlobalFieldInitialisationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getGlobalFieldInitialisationAccess().getPanel_widthKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_4());
            		
            // InternalGreedySnake.g:509:3: ( (lv_panelWidth_5_0= RULE_INT ) )
            // InternalGreedySnake.g:510:4: (lv_panelWidth_5_0= RULE_INT )
            {
            // InternalGreedySnake.g:510:4: (lv_panelWidth_5_0= RULE_INT )
            // InternalGreedySnake.g:511:5: lv_panelWidth_5_0= RULE_INT
            {
            lv_panelWidth_5_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_panelWidth_5_0, grammarAccess.getGlobalFieldInitialisationAccess().getPanelWidthINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalFieldInitialisationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"panelWidth",
            						lv_panelWidth_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getGlobalFieldInitialisationAccess().getPanel_HeightKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_7());
            		
            // InternalGreedySnake.g:535:3: ( (lv_panelHeight_8_0= RULE_INT ) )
            // InternalGreedySnake.g:536:4: (lv_panelHeight_8_0= RULE_INT )
            {
            // InternalGreedySnake.g:536:4: (lv_panelHeight_8_0= RULE_INT )
            // InternalGreedySnake.g:537:5: lv_panelHeight_8_0= RULE_INT
            {
            lv_panelHeight_8_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_panelHeight_8_0, grammarAccess.getGlobalFieldInitialisationAccess().getPanelHeightINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalFieldInitialisationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"panelHeight",
            						lv_panelHeight_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getGlobalFieldInitialisationAccess().getColumnKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_10());
            		
            // InternalGreedySnake.g:561:3: ( (lv_width_11_0= RULE_INT ) )
            // InternalGreedySnake.g:562:4: (lv_width_11_0= RULE_INT )
            {
            // InternalGreedySnake.g:562:4: (lv_width_11_0= RULE_INT )
            // InternalGreedySnake.g:563:5: lv_width_11_0= RULE_INT
            {
            lv_width_11_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_width_11_0, grammarAccess.getGlobalFieldInitialisationAccess().getWidthINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalFieldInitialisationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getGlobalFieldInitialisationAccess().getRowKeyword_12());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_13());
            		
            // InternalGreedySnake.g:587:3: ( (lv_height_14_0= RULE_INT ) )
            // InternalGreedySnake.g:588:4: (lv_height_14_0= RULE_INT )
            {
            // InternalGreedySnake.g:588:4: (lv_height_14_0= RULE_INT )
            // InternalGreedySnake.g:589:5: lv_height_14_0= RULE_INT
            {
            lv_height_14_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_height_14_0, grammarAccess.getGlobalFieldInitialisationAccess().getHeightINTTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalFieldInitialisationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"height",
            						lv_height_14_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_15=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getGlobalFieldInitialisationAccess().getLabel_widthKeyword_15());
            		
            otherlv_16=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_16, grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_16());
            		
            // InternalGreedySnake.g:613:3: ( (lv_labelWidth_17_0= RULE_INT ) )
            // InternalGreedySnake.g:614:4: (lv_labelWidth_17_0= RULE_INT )
            {
            // InternalGreedySnake.g:614:4: (lv_labelWidth_17_0= RULE_INT )
            // InternalGreedySnake.g:615:5: lv_labelWidth_17_0= RULE_INT
            {
            lv_labelWidth_17_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_labelWidth_17_0, grammarAccess.getGlobalFieldInitialisationAccess().getLabelWidthINTTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalFieldInitialisationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"labelWidth",
            						lv_labelWidth_17_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_18=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_18, grammarAccess.getGlobalFieldInitialisationAccess().getLabel_HeightKeyword_18());
            		
            otherlv_19=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_19, grammarAccess.getGlobalFieldInitialisationAccess().getEqualsSignKeyword_19());
            		
            // InternalGreedySnake.g:639:3: ( (lv_labelHeight_20_0= RULE_INT ) )
            // InternalGreedySnake.g:640:4: (lv_labelHeight_20_0= RULE_INT )
            {
            // InternalGreedySnake.g:640:4: (lv_labelHeight_20_0= RULE_INT )
            // InternalGreedySnake.g:641:5: lv_labelHeight_20_0= RULE_INT
            {
            lv_labelHeight_20_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_labelHeight_20_0, grammarAccess.getGlobalFieldInitialisationAccess().getLabelHeightINTTerminalRuleCall_20_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalFieldInitialisationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"labelHeight",
            						lv_labelHeight_20_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGreedySnake.g:657:3: ( (lv_field_initialisation_21_0= ruleInitialField ) )
            // InternalGreedySnake.g:658:4: (lv_field_initialisation_21_0= ruleInitialField )
            {
            // InternalGreedySnake.g:658:4: (lv_field_initialisation_21_0= ruleInitialField )
            // InternalGreedySnake.g:659:5: lv_field_initialisation_21_0= ruleInitialField
            {

            					newCompositeNode(grammarAccess.getGlobalFieldInitialisationAccess().getField_initialisationInitialFieldParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_17);
            lv_field_initialisation_21_0=ruleInitialField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalFieldInitialisationRule());
            					}
            					set(
            						current,
            						"field_initialisation",
            						lv_field_initialisation_21_0,
            						"org.xtext.example.mydsl2.group16.GreedySnake.InitialField");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_22=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getGlobalFieldInitialisationAccess().getRightCurlyBracketKeyword_22());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalFieldInitialisation"


    // $ANTLR start "entryRuleInitialField"
    // InternalGreedySnake.g:684:1: entryRuleInitialField returns [EObject current=null] : iv_ruleInitialField= ruleInitialField EOF ;
    public final EObject entryRuleInitialField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialField = null;


        try {
            // InternalGreedySnake.g:684:53: (iv_ruleInitialField= ruleInitialField EOF )
            // InternalGreedySnake.g:685:2: iv_ruleInitialField= ruleInitialField EOF
            {
             newCompositeNode(grammarAccess.getInitialFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialField=ruleInitialField();

            state._fsp--;

             current =iv_ruleInitialField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialField"


    // $ANTLR start "ruleInitialField"
    // InternalGreedySnake.g:691:1: ruleInitialField returns [EObject current=null] : (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= 'Default' otherlv_6= ':' ( (lv_Default_7_0= ruleDefault ) ) otherlv_8= '}' ) ;
    public final EObject ruleInitialField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_Default_7_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:697:2: ( (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= 'Default' otherlv_6= ':' ( (lv_Default_7_0= ruleDefault ) ) otherlv_8= '}' ) )
            // InternalGreedySnake.g:698:2: (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= 'Default' otherlv_6= ':' ( (lv_Default_7_0= ruleDefault ) ) otherlv_8= '}' )
            {
            // InternalGreedySnake.g:698:2: (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= 'Default' otherlv_6= ':' ( (lv_Default_7_0= ruleDefault ) ) otherlv_8= '}' )
            // InternalGreedySnake.g:699:3: otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= 'Default' otherlv_6= ':' ( (lv_Default_7_0= ruleDefault ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialFieldAccess().getInitKeyword_0());
            		
            // InternalGreedySnake.g:703:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:704:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:704:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:705:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInitialFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getInitialFieldAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getInitialFieldAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getInitialFieldAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getInitialFieldAccess().getDefaultKeyword_5());
            		
            otherlv_6=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getInitialFieldAccess().getColonKeyword_6());
            		
            // InternalGreedySnake.g:741:3: ( (lv_Default_7_0= ruleDefault ) )
            // InternalGreedySnake.g:742:4: (lv_Default_7_0= ruleDefault )
            {
            // InternalGreedySnake.g:742:4: (lv_Default_7_0= ruleDefault )
            // InternalGreedySnake.g:743:5: lv_Default_7_0= ruleDefault
            {

            					newCompositeNode(grammarAccess.getInitialFieldAccess().getDefaultDefaultParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
            lv_Default_7_0=ruleDefault();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialFieldRule());
            					}
            					set(
            						current,
            						"Default",
            						lv_Default_7_0,
            						"org.xtext.example.mydsl2.group16.GreedySnake.Default");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getInitialFieldAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialField"


    // $ANTLR start "entryRuleDefault"
    // InternalGreedySnake.g:768:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // InternalGreedySnake.g:768:48: (iv_ruleDefault= ruleDefault EOF )
            // InternalGreedySnake.g:769:2: iv_ruleDefault= ruleDefault EOF
            {
             newCompositeNode(grammarAccess.getDefaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefault=ruleDefault();

            state._fsp--;

             current =iv_ruleDefault; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // InternalGreedySnake.g:775:1: ruleDefault returns [EObject current=null] : (otherlv_0= 'snakeLength' otherlv_1= '=' ( (lv_length_2_0= RULE_STRING ) ) otherlv_3= 'Score' otherlv_4= '=' ( (lv_score_5_0= RULE_STRING ) ) otherlv_6= 'Time' otherlv_7= '=' ( (lv_time_8_0= RULE_STRING ) ) otherlv_9= 'Amount' otherlv_10= '=' ( (lv_amount_11_0= RULE_STRING ) ) otherlv_12= 'Weapon' otherlv_13= '=' ( (lv_weapon_14_0= RULE_STRING ) ) ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_score_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_time_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_amount_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_weapon_14_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:781:2: ( (otherlv_0= 'snakeLength' otherlv_1= '=' ( (lv_length_2_0= RULE_STRING ) ) otherlv_3= 'Score' otherlv_4= '=' ( (lv_score_5_0= RULE_STRING ) ) otherlv_6= 'Time' otherlv_7= '=' ( (lv_time_8_0= RULE_STRING ) ) otherlv_9= 'Amount' otherlv_10= '=' ( (lv_amount_11_0= RULE_STRING ) ) otherlv_12= 'Weapon' otherlv_13= '=' ( (lv_weapon_14_0= RULE_STRING ) ) ) )
            // InternalGreedySnake.g:782:2: (otherlv_0= 'snakeLength' otherlv_1= '=' ( (lv_length_2_0= RULE_STRING ) ) otherlv_3= 'Score' otherlv_4= '=' ( (lv_score_5_0= RULE_STRING ) ) otherlv_6= 'Time' otherlv_7= '=' ( (lv_time_8_0= RULE_STRING ) ) otherlv_9= 'Amount' otherlv_10= '=' ( (lv_amount_11_0= RULE_STRING ) ) otherlv_12= 'Weapon' otherlv_13= '=' ( (lv_weapon_14_0= RULE_STRING ) ) )
            {
            // InternalGreedySnake.g:782:2: (otherlv_0= 'snakeLength' otherlv_1= '=' ( (lv_length_2_0= RULE_STRING ) ) otherlv_3= 'Score' otherlv_4= '=' ( (lv_score_5_0= RULE_STRING ) ) otherlv_6= 'Time' otherlv_7= '=' ( (lv_time_8_0= RULE_STRING ) ) otherlv_9= 'Amount' otherlv_10= '=' ( (lv_amount_11_0= RULE_STRING ) ) otherlv_12= 'Weapon' otherlv_13= '=' ( (lv_weapon_14_0= RULE_STRING ) ) )
            // InternalGreedySnake.g:783:3: otherlv_0= 'snakeLength' otherlv_1= '=' ( (lv_length_2_0= RULE_STRING ) ) otherlv_3= 'Score' otherlv_4= '=' ( (lv_score_5_0= RULE_STRING ) ) otherlv_6= 'Time' otherlv_7= '=' ( (lv_time_8_0= RULE_STRING ) ) otherlv_9= 'Amount' otherlv_10= '=' ( (lv_amount_11_0= RULE_STRING ) ) otherlv_12= 'Weapon' otherlv_13= '=' ( (lv_weapon_14_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultAccess().getSnakeLengthKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDefaultAccess().getEqualsSignKeyword_1());
            		
            // InternalGreedySnake.g:791:3: ( (lv_length_2_0= RULE_STRING ) )
            // InternalGreedySnake.g:792:4: (lv_length_2_0= RULE_STRING )
            {
            // InternalGreedySnake.g:792:4: (lv_length_2_0= RULE_STRING )
            // InternalGreedySnake.g:793:5: lv_length_2_0= RULE_STRING
            {
            lv_length_2_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_length_2_0, grammarAccess.getDefaultAccess().getLengthSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefaultRule());
            					}
            					setWithLastConsumed(
            						current,
            						"length",
            						lv_length_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getDefaultAccess().getScoreKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getDefaultAccess().getEqualsSignKeyword_4());
            		
            // InternalGreedySnake.g:817:3: ( (lv_score_5_0= RULE_STRING ) )
            // InternalGreedySnake.g:818:4: (lv_score_5_0= RULE_STRING )
            {
            // InternalGreedySnake.g:818:4: (lv_score_5_0= RULE_STRING )
            // InternalGreedySnake.g:819:5: lv_score_5_0= RULE_STRING
            {
            lv_score_5_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_score_5_0, grammarAccess.getDefaultAccess().getScoreSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefaultRule());
            					}
            					setWithLastConsumed(
            						current,
            						"score",
            						lv_score_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDefaultAccess().getTimeKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getDefaultAccess().getEqualsSignKeyword_7());
            		
            // InternalGreedySnake.g:843:3: ( (lv_time_8_0= RULE_STRING ) )
            // InternalGreedySnake.g:844:4: (lv_time_8_0= RULE_STRING )
            {
            // InternalGreedySnake.g:844:4: (lv_time_8_0= RULE_STRING )
            // InternalGreedySnake.g:845:5: lv_time_8_0= RULE_STRING
            {
            lv_time_8_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_time_8_0, grammarAccess.getDefaultAccess().getTimeSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefaultRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getDefaultAccess().getAmountKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getDefaultAccess().getEqualsSignKeyword_10());
            		
            // InternalGreedySnake.g:869:3: ( (lv_amount_11_0= RULE_STRING ) )
            // InternalGreedySnake.g:870:4: (lv_amount_11_0= RULE_STRING )
            {
            // InternalGreedySnake.g:870:4: (lv_amount_11_0= RULE_STRING )
            // InternalGreedySnake.g:871:5: lv_amount_11_0= RULE_STRING
            {
            lv_amount_11_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_amount_11_0, grammarAccess.getDefaultAccess().getAmountSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefaultRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getDefaultAccess().getWeaponKeyword_12());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_13, grammarAccess.getDefaultAccess().getEqualsSignKeyword_13());
            		
            // InternalGreedySnake.g:895:3: ( (lv_weapon_14_0= RULE_STRING ) )
            // InternalGreedySnake.g:896:4: (lv_weapon_14_0= RULE_STRING )
            {
            // InternalGreedySnake.g:896:4: (lv_weapon_14_0= RULE_STRING )
            // InternalGreedySnake.g:897:5: lv_weapon_14_0= RULE_STRING
            {
            lv_weapon_14_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_weapon_14_0, grammarAccess.getDefaultAccess().getWeaponSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefaultRule());
            					}
            					setWithLastConsumed(
            						current,
            						"weapon",
            						lv_weapon_14_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRuleInitialSnakeSpecificatin"
    // InternalGreedySnake.g:917:1: entryRuleInitialSnakeSpecificatin returns [EObject current=null] : iv_ruleInitialSnakeSpecificatin= ruleInitialSnakeSpecificatin EOF ;
    public final EObject entryRuleInitialSnakeSpecificatin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialSnakeSpecificatin = null;


        try {
            // InternalGreedySnake.g:917:65: (iv_ruleInitialSnakeSpecificatin= ruleInitialSnakeSpecificatin EOF )
            // InternalGreedySnake.g:918:2: iv_ruleInitialSnakeSpecificatin= ruleInitialSnakeSpecificatin EOF
            {
             newCompositeNode(grammarAccess.getInitialSnakeSpecificatinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialSnakeSpecificatin=ruleInitialSnakeSpecificatin();

            state._fsp--;

             current =iv_ruleInitialSnakeSpecificatin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialSnakeSpecificatin"


    // $ANTLR start "ruleInitialSnakeSpecificatin"
    // InternalGreedySnake.g:924:1: ruleInitialSnakeSpecificatin returns [EObject current=null] : (otherlv_0= 'snake' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleSnakeMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? ) ;
    public final EObject ruleInitialSnakeSpecificatin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_members_3_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:930:2: ( (otherlv_0= 'snake' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleSnakeMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? ) )
            // InternalGreedySnake.g:931:2: (otherlv_0= 'snake' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleSnakeMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? )
            {
            // InternalGreedySnake.g:931:2: (otherlv_0= 'snake' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleSnakeMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? )
            // InternalGreedySnake.g:932:3: otherlv_0= 'snake' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleSnakeMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialSnakeSpecificatinAccess().getSnakeKeyword_0());
            		
            // InternalGreedySnake.g:936:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:937:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:937:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:938:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInitialSnakeSpecificatinAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialSnakeSpecificatinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getInitialSnakeSpecificatinAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGreedySnake.g:958:3: ( (lv_members_3_0= ruleSnakeMembers ) )
            // InternalGreedySnake.g:959:4: (lv_members_3_0= ruleSnakeMembers )
            {
            // InternalGreedySnake.g:959:4: (lv_members_3_0= ruleSnakeMembers )
            // InternalGreedySnake.g:960:5: lv_members_3_0= ruleSnakeMembers
            {

            					newCompositeNode(grammarAccess.getInitialSnakeSpecificatinAccess().getMembersSnakeMembersParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_members_3_0=ruleSnakeMembers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialSnakeSpecificatinRule());
            					}
            					set(
            						current,
            						"members",
            						lv_members_3_0,
            						"org.xtext.example.mydsl2.group16.GreedySnake.SnakeMembers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getInitialSnakeSpecificatinAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalGreedySnake.g:981:3: ( (otherlv_5= RULE_ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==RULE_ID||(LA2_1>=13 && LA2_1<=14)||LA2_1==16||(LA2_1>=33 && LA2_1<=37)||(LA2_1>=64 && LA2_1<=65)||(LA2_1>=68 && LA2_1<=70)||(LA2_1>=74 && LA2_1<=75)||LA2_1==79) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // InternalGreedySnake.g:982:4: (otherlv_5= RULE_ID )
                    {
                    // InternalGreedySnake.g:982:4: (otherlv_5= RULE_ID )
                    // InternalGreedySnake.g:983:5: otherlv_5= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialSnakeSpecificatinRule());
                    					}
                    				
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getInitialSnakeSpecificatinAccess().getMultiplesInitialSnakeSpecificatinCrossReference_5_0());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialSnakeSpecificatin"


    // $ANTLR start "entryRuleInitialFoodSpecificatin"
    // InternalGreedySnake.g:998:1: entryRuleInitialFoodSpecificatin returns [EObject current=null] : iv_ruleInitialFoodSpecificatin= ruleInitialFoodSpecificatin EOF ;
    public final EObject entryRuleInitialFoodSpecificatin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialFoodSpecificatin = null;


        try {
            // InternalGreedySnake.g:998:64: (iv_ruleInitialFoodSpecificatin= ruleInitialFoodSpecificatin EOF )
            // InternalGreedySnake.g:999:2: iv_ruleInitialFoodSpecificatin= ruleInitialFoodSpecificatin EOF
            {
             newCompositeNode(grammarAccess.getInitialFoodSpecificatinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialFoodSpecificatin=ruleInitialFoodSpecificatin();

            state._fsp--;

             current =iv_ruleInitialFoodSpecificatin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialFoodSpecificatin"


    // $ANTLR start "ruleInitialFoodSpecificatin"
    // InternalGreedySnake.g:1005:1: ruleInitialFoodSpecificatin returns [EObject current=null] : (otherlv_0= 'food' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFoodMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? ) ;
    public final EObject ruleInitialFoodSpecificatin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_members_3_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:1011:2: ( (otherlv_0= 'food' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFoodMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? ) )
            // InternalGreedySnake.g:1012:2: (otherlv_0= 'food' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFoodMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? )
            {
            // InternalGreedySnake.g:1012:2: (otherlv_0= 'food' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFoodMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? )
            // InternalGreedySnake.g:1013:3: otherlv_0= 'food' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFoodMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialFoodSpecificatinAccess().getFoodKeyword_0());
            		
            // InternalGreedySnake.g:1017:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:1018:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:1018:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:1019:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInitialFoodSpecificatinAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialFoodSpecificatinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getInitialFoodSpecificatinAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGreedySnake.g:1039:3: ( (lv_members_3_0= ruleFoodMembers ) )
            // InternalGreedySnake.g:1040:4: (lv_members_3_0= ruleFoodMembers )
            {
            // InternalGreedySnake.g:1040:4: (lv_members_3_0= ruleFoodMembers )
            // InternalGreedySnake.g:1041:5: lv_members_3_0= ruleFoodMembers
            {

            					newCompositeNode(grammarAccess.getInitialFoodSpecificatinAccess().getMembersFoodMembersParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_members_3_0=ruleFoodMembers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialFoodSpecificatinRule());
            					}
            					set(
            						current,
            						"members",
            						lv_members_3_0,
            						"org.xtext.example.mydsl2.group16.GreedySnake.FoodMembers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getInitialFoodSpecificatinAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalGreedySnake.g:1062:3: ( (otherlv_5= RULE_ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==RULE_ID||(LA3_1>=13 && LA3_1<=14)||LA3_1==16||(LA3_1>=33 && LA3_1<=37)||(LA3_1>=64 && LA3_1<=65)||(LA3_1>=68 && LA3_1<=70)||(LA3_1>=74 && LA3_1<=75)||LA3_1==79) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // InternalGreedySnake.g:1063:4: (otherlv_5= RULE_ID )
                    {
                    // InternalGreedySnake.g:1063:4: (otherlv_5= RULE_ID )
                    // InternalGreedySnake.g:1064:5: otherlv_5= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialFoodSpecificatinRule());
                    					}
                    				
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getInitialFoodSpecificatinAccess().getMultiplesInitialFoodSpecificatinCrossReference_5_0());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialFoodSpecificatin"


    // $ANTLR start "entryRuleInitialObstacleSpecificatin"
    // InternalGreedySnake.g:1079:1: entryRuleInitialObstacleSpecificatin returns [EObject current=null] : iv_ruleInitialObstacleSpecificatin= ruleInitialObstacleSpecificatin EOF ;
    public final EObject entryRuleInitialObstacleSpecificatin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialObstacleSpecificatin = null;


        try {
            // InternalGreedySnake.g:1079:68: (iv_ruleInitialObstacleSpecificatin= ruleInitialObstacleSpecificatin EOF )
            // InternalGreedySnake.g:1080:2: iv_ruleInitialObstacleSpecificatin= ruleInitialObstacleSpecificatin EOF
            {
             newCompositeNode(grammarAccess.getInitialObstacleSpecificatinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialObstacleSpecificatin=ruleInitialObstacleSpecificatin();

            state._fsp--;

             current =iv_ruleInitialObstacleSpecificatin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialObstacleSpecificatin"


    // $ANTLR start "ruleInitialObstacleSpecificatin"
    // InternalGreedySnake.g:1086:1: ruleInitialObstacleSpecificatin returns [EObject current=null] : (otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleObstacleMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? ) ;
    public final EObject ruleInitialObstacleSpecificatin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_members_3_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:1092:2: ( (otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleObstacleMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? ) )
            // InternalGreedySnake.g:1093:2: (otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleObstacleMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? )
            {
            // InternalGreedySnake.g:1093:2: (otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleObstacleMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? )
            // InternalGreedySnake.g:1094:3: otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleObstacleMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialObstacleSpecificatinAccess().getObstacleKeyword_0());
            		
            // InternalGreedySnake.g:1098:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:1099:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:1099:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:1100:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInitialObstacleSpecificatinAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialObstacleSpecificatinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getInitialObstacleSpecificatinAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGreedySnake.g:1120:3: ( (lv_members_3_0= ruleObstacleMembers ) )
            // InternalGreedySnake.g:1121:4: (lv_members_3_0= ruleObstacleMembers )
            {
            // InternalGreedySnake.g:1121:4: (lv_members_3_0= ruleObstacleMembers )
            // InternalGreedySnake.g:1122:5: lv_members_3_0= ruleObstacleMembers
            {

            					newCompositeNode(grammarAccess.getInitialObstacleSpecificatinAccess().getMembersObstacleMembersParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_members_3_0=ruleObstacleMembers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialObstacleSpecificatinRule());
            					}
            					set(
            						current,
            						"members",
            						lv_members_3_0,
            						"org.xtext.example.mydsl2.group16.GreedySnake.ObstacleMembers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getInitialObstacleSpecificatinAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalGreedySnake.g:1143:3: ( (otherlv_5= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==RULE_ID||(LA4_1>=13 && LA4_1<=14)||LA4_1==16||(LA4_1>=33 && LA4_1<=37)||(LA4_1>=64 && LA4_1<=65)||(LA4_1>=68 && LA4_1<=70)||(LA4_1>=74 && LA4_1<=75)||LA4_1==79) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalGreedySnake.g:1144:4: (otherlv_5= RULE_ID )
                    {
                    // InternalGreedySnake.g:1144:4: (otherlv_5= RULE_ID )
                    // InternalGreedySnake.g:1145:5: otherlv_5= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialObstacleSpecificatinRule());
                    					}
                    				
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getInitialObstacleSpecificatinAccess().getMultiplesInitialObstacleSpecificatinCrossReference_5_0());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialObstacleSpecificatin"


    // $ANTLR start "entryRuleInitialFireSpecification"
    // InternalGreedySnake.g:1160:1: entryRuleInitialFireSpecification returns [EObject current=null] : iv_ruleInitialFireSpecification= ruleInitialFireSpecification EOF ;
    public final EObject entryRuleInitialFireSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialFireSpecification = null;


        try {
            // InternalGreedySnake.g:1160:65: (iv_ruleInitialFireSpecification= ruleInitialFireSpecification EOF )
            // InternalGreedySnake.g:1161:2: iv_ruleInitialFireSpecification= ruleInitialFireSpecification EOF
            {
             newCompositeNode(grammarAccess.getInitialFireSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialFireSpecification=ruleInitialFireSpecification();

            state._fsp--;

             current =iv_ruleInitialFireSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialFireSpecification"


    // $ANTLR start "ruleInitialFireSpecification"
    // InternalGreedySnake.g:1167:1: ruleInitialFireSpecification returns [EObject current=null] : (otherlv_0= 'fire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFireMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? ) ;
    public final EObject ruleInitialFireSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_members_3_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:1173:2: ( (otherlv_0= 'fire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFireMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? ) )
            // InternalGreedySnake.g:1174:2: (otherlv_0= 'fire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFireMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? )
            {
            // InternalGreedySnake.g:1174:2: (otherlv_0= 'fire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFireMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? )
            // InternalGreedySnake.g:1175:3: otherlv_0= 'fire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFireMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialFireSpecificationAccess().getFireKeyword_0());
            		
            // InternalGreedySnake.g:1179:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:1180:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:1180:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:1181:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInitialFireSpecificationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialFireSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getInitialFireSpecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGreedySnake.g:1201:3: ( (lv_members_3_0= ruleFireMembers ) )
            // InternalGreedySnake.g:1202:4: (lv_members_3_0= ruleFireMembers )
            {
            // InternalGreedySnake.g:1202:4: (lv_members_3_0= ruleFireMembers )
            // InternalGreedySnake.g:1203:5: lv_members_3_0= ruleFireMembers
            {

            					newCompositeNode(grammarAccess.getInitialFireSpecificationAccess().getMembersFireMembersParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_members_3_0=ruleFireMembers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialFireSpecificationRule());
            					}
            					set(
            						current,
            						"members",
            						lv_members_3_0,
            						"org.xtext.example.mydsl2.group16.GreedySnake.FireMembers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getInitialFireSpecificationAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalGreedySnake.g:1224:3: ( (otherlv_5= RULE_ID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==RULE_ID||(LA5_1>=13 && LA5_1<=14)||LA5_1==16||(LA5_1>=33 && LA5_1<=37)||(LA5_1>=64 && LA5_1<=65)||(LA5_1>=68 && LA5_1<=70)||(LA5_1>=74 && LA5_1<=75)||LA5_1==79) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // InternalGreedySnake.g:1225:4: (otherlv_5= RULE_ID )
                    {
                    // InternalGreedySnake.g:1225:4: (otherlv_5= RULE_ID )
                    // InternalGreedySnake.g:1226:5: otherlv_5= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialFireSpecificationRule());
                    					}
                    				
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getInitialFireSpecificationAccess().getMultiplesInitialSnakeSpecificatinCrossReference_5_0());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialFireSpecification"


    // $ANTLR start "entryRuleInitialSpeedSpecification"
    // InternalGreedySnake.g:1241:1: entryRuleInitialSpeedSpecification returns [EObject current=null] : iv_ruleInitialSpeedSpecification= ruleInitialSpeedSpecification EOF ;
    public final EObject entryRuleInitialSpeedSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialSpeedSpecification = null;


        try {
            // InternalGreedySnake.g:1241:66: (iv_ruleInitialSpeedSpecification= ruleInitialSpeedSpecification EOF )
            // InternalGreedySnake.g:1242:2: iv_ruleInitialSpeedSpecification= ruleInitialSpeedSpecification EOF
            {
             newCompositeNode(grammarAccess.getInitialSpeedSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialSpeedSpecification=ruleInitialSpeedSpecification();

            state._fsp--;

             current =iv_ruleInitialSpeedSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialSpeedSpecification"


    // $ANTLR start "ruleInitialSpeedSpecification"
    // InternalGreedySnake.g:1248:1: ruleInitialSpeedSpecification returns [EObject current=null] : ( () otherlv_1= 'Speed' otherlv_2= '{' ( (lv_speedGroup_3_0= ruleSpeedGroup ) )* otherlv_4= '}' ) ;
    public final EObject ruleInitialSpeedSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_speedGroup_3_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:1254:2: ( ( () otherlv_1= 'Speed' otherlv_2= '{' ( (lv_speedGroup_3_0= ruleSpeedGroup ) )* otherlv_4= '}' ) )
            // InternalGreedySnake.g:1255:2: ( () otherlv_1= 'Speed' otherlv_2= '{' ( (lv_speedGroup_3_0= ruleSpeedGroup ) )* otherlv_4= '}' )
            {
            // InternalGreedySnake.g:1255:2: ( () otherlv_1= 'Speed' otherlv_2= '{' ( (lv_speedGroup_3_0= ruleSpeedGroup ) )* otherlv_4= '}' )
            // InternalGreedySnake.g:1256:3: () otherlv_1= 'Speed' otherlv_2= '{' ( (lv_speedGroup_3_0= ruleSpeedGroup ) )* otherlv_4= '}'
            {
            // InternalGreedySnake.g:1256:3: ()
            // InternalGreedySnake.g:1257:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialSpeedSpecificationAccess().getInitialSpeedSpecificationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialSpeedSpecificationAccess().getSpeedKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getInitialSpeedSpecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGreedySnake.g:1271:3: ( (lv_speedGroup_3_0= ruleSpeedGroup ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGreedySnake.g:1272:4: (lv_speedGroup_3_0= ruleSpeedGroup )
            	    {
            	    // InternalGreedySnake.g:1272:4: (lv_speedGroup_3_0= ruleSpeedGroup )
            	    // InternalGreedySnake.g:1273:5: lv_speedGroup_3_0= ruleSpeedGroup
            	    {

            	    					newCompositeNode(grammarAccess.getInitialSpeedSpecificationAccess().getSpeedGroupSpeedGroupParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_speedGroup_3_0=ruleSpeedGroup();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInitialSpeedSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"speedGroup",
            	    						lv_speedGroup_3_0,
            	    						"org.xtext.example.mydsl2.group16.GreedySnake.SpeedGroup");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInitialSpeedSpecificationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialSpeedSpecification"


    // $ANTLR start "entryRuleSpeedGroup"
    // InternalGreedySnake.g:1298:1: entryRuleSpeedGroup returns [EObject current=null] : iv_ruleSpeedGroup= ruleSpeedGroup EOF ;
    public final EObject entryRuleSpeedGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeedGroup = null;


        try {
            // InternalGreedySnake.g:1298:51: (iv_ruleSpeedGroup= ruleSpeedGroup EOF )
            // InternalGreedySnake.g:1299:2: iv_ruleSpeedGroup= ruleSpeedGroup EOF
            {
             newCompositeNode(grammarAccess.getSpeedGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpeedGroup=ruleSpeedGroup();

            state._fsp--;

             current =iv_ruleSpeedGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpeedGroup"


    // $ANTLR start "ruleSpeedGroup"
    // InternalGreedySnake.g:1305:1: ruleSpeedGroup returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSpeedGroup() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:1311:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalGreedySnake.g:1312:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalGreedySnake.g:1312:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalGreedySnake.g:1313:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalGreedySnake.g:1313:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreedySnake.g:1314:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreedySnake.g:1314:4: (lv_name_0_0= RULE_ID )
            // InternalGreedySnake.g:1315:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSpeedGroupAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpeedGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getSpeedGroupAccess().getEqualsSignKeyword_1());
            		
            // InternalGreedySnake.g:1335:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalGreedySnake.g:1336:4: (lv_value_2_0= RULE_INT )
            {
            // InternalGreedySnake.g:1336:4: (lv_value_2_0= RULE_INT )
            // InternalGreedySnake.g:1337:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getSpeedGroupAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpeedGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpeedGroup"


    // $ANTLR start "entryRuleFireMembers"
    // InternalGreedySnake.g:1357:1: entryRuleFireMembers returns [EObject current=null] : iv_ruleFireMembers= ruleFireMembers EOF ;
    public final EObject entryRuleFireMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFireMembers = null;


        try {
            // InternalGreedySnake.g:1357:52: (iv_ruleFireMembers= ruleFireMembers EOF )
            // InternalGreedySnake.g:1358:2: iv_ruleFireMembers= ruleFireMembers EOF
            {
             newCompositeNode(grammarAccess.getFireMembersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFireMembers=ruleFireMembers();

            state._fsp--;

             current =iv_ruleFireMembers; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFireMembers"


    // $ANTLR start "ruleFireMembers"
    // InternalGreedySnake.g:1364:1: ruleFireMembers returns [EObject current=null] : ( (lv_fire_0_0= ruleFireInitDisplay ) ) ;
    public final EObject ruleFireMembers() throws RecognitionException {
        EObject current = null;

        EObject lv_fire_0_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:1370:2: ( ( (lv_fire_0_0= ruleFireInitDisplay ) ) )
            // InternalGreedySnake.g:1371:2: ( (lv_fire_0_0= ruleFireInitDisplay ) )
            {
            // InternalGreedySnake.g:1371:2: ( (lv_fire_0_0= ruleFireInitDisplay ) )
            // InternalGreedySnake.g:1372:3: (lv_fire_0_0= ruleFireInitDisplay )
            {
            // InternalGreedySnake.g:1372:3: (lv_fire_0_0= ruleFireInitDisplay )
            // InternalGreedySnake.g:1373:4: lv_fire_0_0= ruleFireInitDisplay
            {

            				newCompositeNode(grammarAccess.getFireMembersAccess().getFireFireInitDisplayParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_fire_0_0=ruleFireInitDisplay();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFireMembersRule());
            				}
            				set(
            					current,
            					"fire",
            					lv_fire_0_0,
            					"org.xtext.example.mydsl2.group16.GreedySnake.FireInitDisplay");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFireMembers"


    // $ANTLR start "entryRuleSnakeMembers"
    // InternalGreedySnake.g:1393:1: entryRuleSnakeMembers returns [EObject current=null] : iv_ruleSnakeMembers= ruleSnakeMembers EOF ;
    public final EObject entryRuleSnakeMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSnakeMembers = null;


        try {
            // InternalGreedySnake.g:1393:53: (iv_ruleSnakeMembers= ruleSnakeMembers EOF )
            // InternalGreedySnake.g:1394:2: iv_ruleSnakeMembers= ruleSnakeMembers EOF
            {
             newCompositeNode(grammarAccess.getSnakeMembersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSnakeMembers=ruleSnakeMembers();

            state._fsp--;

             current =iv_ruleSnakeMembers; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSnakeMembers"


    // $ANTLR start "ruleSnakeMembers"
    // InternalGreedySnake.g:1400:1: ruleSnakeMembers returns [EObject current=null] : ( (lv_sna_0_0= ruleSnakeInitDisplay ) ) ;
    public final EObject ruleSnakeMembers() throws RecognitionException {
        EObject current = null;

        EObject lv_sna_0_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:1406:2: ( ( (lv_sna_0_0= ruleSnakeInitDisplay ) ) )
            // InternalGreedySnake.g:1407:2: ( (lv_sna_0_0= ruleSnakeInitDisplay ) )
            {
            // InternalGreedySnake.g:1407:2: ( (lv_sna_0_0= ruleSnakeInitDisplay ) )
            // InternalGreedySnake.g:1408:3: (lv_sna_0_0= ruleSnakeInitDisplay )
            {
            // InternalGreedySnake.g:1408:3: (lv_sna_0_0= ruleSnakeInitDisplay )
            // InternalGreedySnake.g:1409:4: lv_sna_0_0= ruleSnakeInitDisplay
            {

            				newCompositeNode(grammarAccess.getSnakeMembersAccess().getSnaSnakeInitDisplayParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_sna_0_0=ruleSnakeInitDisplay();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSnakeMembersRule());
            				}
            				set(
            					current,
            					"sna",
            					lv_sna_0_0,
            					"org.xtext.example.mydsl2.group16.GreedySnake.SnakeInitDisplay");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSnakeMembers"


    // $ANTLR start "entryRuleFoodMembers"
    // InternalGreedySnake.g:1429:1: entryRuleFoodMembers returns [EObject current=null] : iv_ruleFoodMembers= ruleFoodMembers EOF ;
    public final EObject entryRuleFoodMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoodMembers = null;


        try {
            // InternalGreedySnake.g:1429:52: (iv_ruleFoodMembers= ruleFoodMembers EOF )
            // InternalGreedySnake.g:1430:2: iv_ruleFoodMembers= ruleFoodMembers EOF
            {
             newCompositeNode(grammarAccess.getFoodMembersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFoodMembers=ruleFoodMembers();

            state._fsp--;

             current =iv_ruleFoodMembers; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFoodMembers"


    // $ANTLR start "ruleFoodMembers"
    // InternalGreedySnake.g:1436:1: ruleFoodMembers returns [EObject current=null] : ( (lv_food_0_0= ruleFoodInitDisplay ) ) ;
    public final EObject ruleFoodMembers() throws RecognitionException {
        EObject current = null;

        EObject lv_food_0_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:1442:2: ( ( (lv_food_0_0= ruleFoodInitDisplay ) ) )
            // InternalGreedySnake.g:1443:2: ( (lv_food_0_0= ruleFoodInitDisplay ) )
            {
            // InternalGreedySnake.g:1443:2: ( (lv_food_0_0= ruleFoodInitDisplay ) )
            // InternalGreedySnake.g:1444:3: (lv_food_0_0= ruleFoodInitDisplay )
            {
            // InternalGreedySnake.g:1444:3: (lv_food_0_0= ruleFoodInitDisplay )
            // InternalGreedySnake.g:1445:4: lv_food_0_0= ruleFoodInitDisplay
            {

            				newCompositeNode(grammarAccess.getFoodMembersAccess().getFoodFoodInitDisplayParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_food_0_0=ruleFoodInitDisplay();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFoodMembersRule());
            				}
            				set(
            					current,
            					"food",
            					lv_food_0_0,
            					"org.xtext.example.mydsl2.group16.GreedySnake.FoodInitDisplay");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFoodMembers"


    // $ANTLR start "entryRuleObstacleMembers"
    // InternalGreedySnake.g:1465:1: entryRuleObstacleMembers returns [EObject current=null] : iv_ruleObstacleMembers= ruleObstacleMembers EOF ;
    public final EObject entryRuleObstacleMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacleMembers = null;


        try {
            // InternalGreedySnake.g:1465:56: (iv_ruleObstacleMembers= ruleObstacleMembers EOF )
            // InternalGreedySnake.g:1466:2: iv_ruleObstacleMembers= ruleObstacleMembers EOF
            {
             newCompositeNode(grammarAccess.getObstacleMembersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObstacleMembers=ruleObstacleMembers();

            state._fsp--;

             current =iv_ruleObstacleMembers; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObstacleMembers"


    // $ANTLR start "ruleObstacleMembers"
    // InternalGreedySnake.g:1472:1: ruleObstacleMembers returns [EObject current=null] : ( (lv_obstacle_0_0= ruleObstacleInitDisplay ) ) ;
    public final EObject ruleObstacleMembers() throws RecognitionException {
        EObject current = null;

        EObject lv_obstacle_0_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:1478:2: ( ( (lv_obstacle_0_0= ruleObstacleInitDisplay ) ) )
            // InternalGreedySnake.g:1479:2: ( (lv_obstacle_0_0= ruleObstacleInitDisplay ) )
            {
            // InternalGreedySnake.g:1479:2: ( (lv_obstacle_0_0= ruleObstacleInitDisplay ) )
            // InternalGreedySnake.g:1480:3: (lv_obstacle_0_0= ruleObstacleInitDisplay )
            {
            // InternalGreedySnake.g:1480:3: (lv_obstacle_0_0= ruleObstacleInitDisplay )
            // InternalGreedySnake.g:1481:4: lv_obstacle_0_0= ruleObstacleInitDisplay
            {

            				newCompositeNode(grammarAccess.getObstacleMembersAccess().getObstacleObstacleInitDisplayParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_obstacle_0_0=ruleObstacleInitDisplay();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getObstacleMembersRule());
            				}
            				set(
            					current,
            					"obstacle",
            					lv_obstacle_0_0,
            					"org.xtext.example.mydsl2.group16.GreedySnake.ObstacleInitDisplay");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObstacleMembers"


    // $ANTLR start "entryRuleSnakeMoveSpecification"
    // InternalGreedySnake.g:1501:1: entryRuleSnakeMoveSpecification returns [EObject current=null] : iv_ruleSnakeMoveSpecification= ruleSnakeMoveSpecification EOF ;
    public final EObject entryRuleSnakeMoveSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSnakeMoveSpecification = null;


        try {
            // InternalGreedySnake.g:1501:63: (iv_ruleSnakeMoveSpecification= ruleSnakeMoveSpecification EOF )
            // InternalGreedySnake.g:1502:2: iv_ruleSnakeMoveSpecification= ruleSnakeMoveSpecification EOF
            {
             newCompositeNode(grammarAccess.getSnakeMoveSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSnakeMoveSpecification=ruleSnakeMoveSpecification();

            state._fsp--;

             current =iv_ruleSnakeMoveSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSnakeMoveSpecification"


    // $ANTLR start "ruleSnakeMoveSpecification"
    // InternalGreedySnake.g:1508:1: ruleSnakeMoveSpecification returns [EObject current=null] : ( () otherlv_1= 'snake' otherlv_2= 'move' otherlv_3= '{' ( (lv_IF_4_0= ruleMove ) )* otherlv_5= '}' ) ;
    public final EObject ruleSnakeMoveSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_IF_4_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:1514:2: ( ( () otherlv_1= 'snake' otherlv_2= 'move' otherlv_3= '{' ( (lv_IF_4_0= ruleMove ) )* otherlv_5= '}' ) )
            // InternalGreedySnake.g:1515:2: ( () otherlv_1= 'snake' otherlv_2= 'move' otherlv_3= '{' ( (lv_IF_4_0= ruleMove ) )* otherlv_5= '}' )
            {
            // InternalGreedySnake.g:1515:2: ( () otherlv_1= 'snake' otherlv_2= 'move' otherlv_3= '{' ( (lv_IF_4_0= ruleMove ) )* otherlv_5= '}' )
            // InternalGreedySnake.g:1516:3: () otherlv_1= 'snake' otherlv_2= 'move' otherlv_3= '{' ( (lv_IF_4_0= ruleMove ) )* otherlv_5= '}'
            {
            // InternalGreedySnake.g:1516:3: ()
            // InternalGreedySnake.g:1517:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSnakeMoveSpecificationAccess().getSnakeMoveSpecificationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getSnakeMoveSpecificationAccess().getSnakeKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSnakeMoveSpecificationAccess().getMoveKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getSnakeMoveSpecificationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGreedySnake.g:1535:3: ( (lv_IF_4_0= ruleMove ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==39) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGreedySnake.g:1536:4: (lv_IF_4_0= ruleMove )
            	    {
            	    // InternalGreedySnake.g:1536:4: (lv_IF_4_0= ruleMove )
            	    // InternalGreedySnake.g:1537:5: lv_IF_4_0= ruleMove
            	    {

            	    					newCompositeNode(grammarAccess.getSnakeMoveSpecificationAccess().getIFMoveParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_IF_4_0=ruleMove();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSnakeMoveSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"IF",
            	    						lv_IF_4_0,
            	    						"org.xtext.example.mydsl2.group16.GreedySnake.Move");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSnakeMoveSpecificationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSnakeMoveSpecification"


    // $ANTLR start "entryRuleMove"
    // InternalGreedySnake.g:1562:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalGreedySnake.g:1562:45: (iv_ruleMove= ruleMove EOF )
            // InternalGreedySnake.g:1563:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalGreedySnake.g:1569:1: ruleMove returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' otherlv_2= 'direction' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '.' ( ( (lv_coor_8_1= 'x' | lv_coor_8_2= 'y' ) ) ) ( ( (lv_operator_9_1= '+' | lv_operator_9_2= '-' ) ) ) ( (lv_moveVal_10_0= RULE_INT ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token lv_coor_8_1=null;
        Token lv_coor_8_2=null;
        Token lv_operator_9_1=null;
        Token lv_operator_9_2=null;
        Token lv_moveVal_10_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:1575:2: ( (otherlv_0= 'if' otherlv_1= '(' otherlv_2= 'direction' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '.' ( ( (lv_coor_8_1= 'x' | lv_coor_8_2= 'y' ) ) ) ( ( (lv_operator_9_1= '+' | lv_operator_9_2= '-' ) ) ) ( (lv_moveVal_10_0= RULE_INT ) ) ) )
            // InternalGreedySnake.g:1576:2: (otherlv_0= 'if' otherlv_1= '(' otherlv_2= 'direction' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '.' ( ( (lv_coor_8_1= 'x' | lv_coor_8_2= 'y' ) ) ) ( ( (lv_operator_9_1= '+' | lv_operator_9_2= '-' ) ) ) ( (lv_moveVal_10_0= RULE_INT ) ) )
            {
            // InternalGreedySnake.g:1576:2: (otherlv_0= 'if' otherlv_1= '(' otherlv_2= 'direction' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '.' ( ( (lv_coor_8_1= 'x' | lv_coor_8_2= 'y' ) ) ) ( ( (lv_operator_9_1= '+' | lv_operator_9_2= '-' ) ) ) ( (lv_moveVal_10_0= RULE_INT ) ) )
            // InternalGreedySnake.g:1577:3: otherlv_0= 'if' otherlv_1= '(' otherlv_2= 'direction' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '.' ( ( (lv_coor_8_1= 'x' | lv_coor_8_2= 'y' ) ) ) ( ( (lv_operator_9_1= '+' | lv_operator_9_2= '-' ) ) ) ( (lv_moveVal_10_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getDirectionKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getEqualsSignKeyword_3());
            		
            // InternalGreedySnake.g:1593:3: ( (otherlv_4= RULE_ID ) )
            // InternalGreedySnake.g:1594:4: (otherlv_4= RULE_ID )
            {
            // InternalGreedySnake.g:1594:4: (otherlv_4= RULE_ID )
            // InternalGreedySnake.g:1595:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_4, grammarAccess.getMoveAccess().getDirDisCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getMoveAccess().getRightParenthesisKeyword_5());
            		
            // InternalGreedySnake.g:1610:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalGreedySnake.g:1611:4: (lv_name_6_0= RULE_ID )
            {
            // InternalGreedySnake.g:1611:4: (lv_name_6_0= RULE_ID )
            // InternalGreedySnake.g:1612:5: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_6_0, grammarAccess.getMoveAccess().getNameIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,41,FOLLOW_37); 

            			newLeafNode(otherlv_7, grammarAccess.getMoveAccess().getFullStopKeyword_7());
            		
            // InternalGreedySnake.g:1632:3: ( ( (lv_coor_8_1= 'x' | lv_coor_8_2= 'y' ) ) )
            // InternalGreedySnake.g:1633:4: ( (lv_coor_8_1= 'x' | lv_coor_8_2= 'y' ) )
            {
            // InternalGreedySnake.g:1633:4: ( (lv_coor_8_1= 'x' | lv_coor_8_2= 'y' ) )
            // InternalGreedySnake.g:1634:5: (lv_coor_8_1= 'x' | lv_coor_8_2= 'y' )
            {
            // InternalGreedySnake.g:1634:5: (lv_coor_8_1= 'x' | lv_coor_8_2= 'y' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==42) ) {
                alt8=1;
            }
            else if ( (LA8_0==43) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGreedySnake.g:1635:6: lv_coor_8_1= 'x'
                    {
                    lv_coor_8_1=(Token)match(input,42,FOLLOW_38); 

                    						newLeafNode(lv_coor_8_1, grammarAccess.getMoveAccess().getCoorXKeyword_8_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMoveRule());
                    						}
                    						setWithLastConsumed(current, "coor", lv_coor_8_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:1646:6: lv_coor_8_2= 'y'
                    {
                    lv_coor_8_2=(Token)match(input,43,FOLLOW_38); 

                    						newLeafNode(lv_coor_8_2, grammarAccess.getMoveAccess().getCoorYKeyword_8_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMoveRule());
                    						}
                    						setWithLastConsumed(current, "coor", lv_coor_8_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalGreedySnake.g:1659:3: ( ( (lv_operator_9_1= '+' | lv_operator_9_2= '-' ) ) )
            // InternalGreedySnake.g:1660:4: ( (lv_operator_9_1= '+' | lv_operator_9_2= '-' ) )
            {
            // InternalGreedySnake.g:1660:4: ( (lv_operator_9_1= '+' | lv_operator_9_2= '-' ) )
            // InternalGreedySnake.g:1661:5: (lv_operator_9_1= '+' | lv_operator_9_2= '-' )
            {
            // InternalGreedySnake.g:1661:5: (lv_operator_9_1= '+' | lv_operator_9_2= '-' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==44) ) {
                alt9=1;
            }
            else if ( (LA9_0==45) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGreedySnake.g:1662:6: lv_operator_9_1= '+'
                    {
                    lv_operator_9_1=(Token)match(input,44,FOLLOW_10); 

                    						newLeafNode(lv_operator_9_1, grammarAccess.getMoveAccess().getOperatorPlusSignKeyword_9_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMoveRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_9_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:1673:6: lv_operator_9_2= '-'
                    {
                    lv_operator_9_2=(Token)match(input,45,FOLLOW_10); 

                    						newLeafNode(lv_operator_9_2, grammarAccess.getMoveAccess().getOperatorHyphenMinusKeyword_9_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMoveRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_9_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalGreedySnake.g:1686:3: ( (lv_moveVal_10_0= RULE_INT ) )
            // InternalGreedySnake.g:1687:4: (lv_moveVal_10_0= RULE_INT )
            {
            // InternalGreedySnake.g:1687:4: (lv_moveVal_10_0= RULE_INT )
            // InternalGreedySnake.g:1688:5: lv_moveVal_10_0= RULE_INT
            {
            lv_moveVal_10_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_moveVal_10_0, grammarAccess.getMoveAccess().getMoveValINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"moveVal",
            						lv_moveVal_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleFireInitDisplay"
    // InternalGreedySnake.g:1708:1: entryRuleFireInitDisplay returns [EObject current=null] : iv_ruleFireInitDisplay= ruleFireInitDisplay EOF ;
    public final EObject entryRuleFireInitDisplay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFireInitDisplay = null;


        try {
            // InternalGreedySnake.g:1708:56: (iv_ruleFireInitDisplay= ruleFireInitDisplay EOF )
            // InternalGreedySnake.g:1709:2: iv_ruleFireInitDisplay= ruleFireInitDisplay EOF
            {
             newCompositeNode(grammarAccess.getFireInitDisplayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFireInitDisplay=ruleFireInitDisplay();

            state._fsp--;

             current =iv_ruleFireInitDisplay; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFireInitDisplay"


    // $ANTLR start "ruleFireInitDisplay"
    // InternalGreedySnake.g:1715:1: ruleFireInitDisplay returns [EObject current=null] : (otherlv_0= 'FireIcon' otherlv_1= '{' ( (lv_FireIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) ) ;
    public final EObject ruleFireInitDisplay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_FireIcon_2_0 = null;

        AntlrDatatypeRuleToken lv_Iconsize_6_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:1721:2: ( (otherlv_0= 'FireIcon' otherlv_1= '{' ( (lv_FireIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) ) )
            // InternalGreedySnake.g:1722:2: (otherlv_0= 'FireIcon' otherlv_1= '{' ( (lv_FireIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) )
            {
            // InternalGreedySnake.g:1722:2: (otherlv_0= 'FireIcon' otherlv_1= '{' ( (lv_FireIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) )
            // InternalGreedySnake.g:1723:3: otherlv_0= 'FireIcon' otherlv_1= '{' ( (lv_FireIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFireInitDisplayAccess().getFireIconKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getFireInitDisplayAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGreedySnake.g:1731:3: ( (lv_FireIcon_2_0= ruleIconTag ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGreedySnake.g:1732:4: (lv_FireIcon_2_0= ruleIconTag )
            	    {
            	    // InternalGreedySnake.g:1732:4: (lv_FireIcon_2_0= ruleIconTag )
            	    // InternalGreedySnake.g:1733:5: lv_FireIcon_2_0= ruleIconTag
            	    {

            	    					newCompositeNode(grammarAccess.getFireInitDisplayAccess().getFireIconIconTagParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_FireIcon_2_0=ruleIconTag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFireInitDisplayRule());
            	    					}
            	    					add(
            	    						current,
            	    						"FireIcon",
            	    						lv_FireIcon_2_0,
            	    						"org.xtext.example.mydsl2.group16.GreedySnake.IconTag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getFireInitDisplayAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getFireInitDisplayAccess().getIcon_sizeKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getFireInitDisplayAccess().getEqualsSignKeyword_5());
            		
            // InternalGreedySnake.g:1762:3: ( (lv_Iconsize_6_0= ruleIconSize ) )
            // InternalGreedySnake.g:1763:4: (lv_Iconsize_6_0= ruleIconSize )
            {
            // InternalGreedySnake.g:1763:4: (lv_Iconsize_6_0= ruleIconSize )
            // InternalGreedySnake.g:1764:5: lv_Iconsize_6_0= ruleIconSize
            {

            					newCompositeNode(grammarAccess.getFireInitDisplayAccess().getIconsizeIconSizeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_Iconsize_6_0=ruleIconSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFireInitDisplayRule());
            					}
            					set(
            						current,
            						"Iconsize",
            						lv_Iconsize_6_0,
            						"org.xtext.example.mydsl2.group16.GreedySnake.IconSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFireInitDisplay"


    // $ANTLR start "entryRuleSnakeInitDisplay"
    // InternalGreedySnake.g:1785:1: entryRuleSnakeInitDisplay returns [EObject current=null] : iv_ruleSnakeInitDisplay= ruleSnakeInitDisplay EOF ;
    public final EObject entryRuleSnakeInitDisplay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSnakeInitDisplay = null;


        try {
            // InternalGreedySnake.g:1785:57: (iv_ruleSnakeInitDisplay= ruleSnakeInitDisplay EOF )
            // InternalGreedySnake.g:1786:2: iv_ruleSnakeInitDisplay= ruleSnakeInitDisplay EOF
            {
             newCompositeNode(grammarAccess.getSnakeInitDisplayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSnakeInitDisplay=ruleSnakeInitDisplay();

            state._fsp--;

             current =iv_ruleSnakeInitDisplay; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSnakeInitDisplay"


    // $ANTLR start "ruleSnakeInitDisplay"
    // InternalGreedySnake.g:1792:1: ruleSnakeInitDisplay returns [EObject current=null] : (otherlv_0= 'head' otherlv_1= '=' ( (lv_head_2_0= '(' ) ) ( (lv_initial_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_initial_y_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= 'headIcon' otherlv_8= '{' ( (lv_headIcon_9_0= ruleIconTag ) )* otherlv_10= '}' otherlv_11= 'Icon_size' otherlv_12= '=' ( (lv_Iconsize_13_0= ruleIconSize ) ) otherlv_14= 'BodyIcon' otherlv_15= '{' ( (lv_BodyIcon_16_0= ruleIconTag ) )* otherlv_17= '}' otherlv_18= 'defaultSpeed' otherlv_19= '=' ( (lv_defaultSpeed_20_0= RULE_INT ) ) otherlv_21= 'snakeTag' otherlv_22= '=' ( (lv_snakeTag_23_0= RULE_INT ) ) ) ;
    public final EObject ruleSnakeInitDisplay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_head_2_0=null;
        Token lv_initial_x_3_0=null;
        Token otherlv_4=null;
        Token lv_initial_y_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_defaultSpeed_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_snakeTag_23_0=null;
        EObject lv_headIcon_9_0 = null;

        AntlrDatatypeRuleToken lv_Iconsize_13_0 = null;

        EObject lv_BodyIcon_16_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:1798:2: ( (otherlv_0= 'head' otherlv_1= '=' ( (lv_head_2_0= '(' ) ) ( (lv_initial_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_initial_y_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= 'headIcon' otherlv_8= '{' ( (lv_headIcon_9_0= ruleIconTag ) )* otherlv_10= '}' otherlv_11= 'Icon_size' otherlv_12= '=' ( (lv_Iconsize_13_0= ruleIconSize ) ) otherlv_14= 'BodyIcon' otherlv_15= '{' ( (lv_BodyIcon_16_0= ruleIconTag ) )* otherlv_17= '}' otherlv_18= 'defaultSpeed' otherlv_19= '=' ( (lv_defaultSpeed_20_0= RULE_INT ) ) otherlv_21= 'snakeTag' otherlv_22= '=' ( (lv_snakeTag_23_0= RULE_INT ) ) ) )
            // InternalGreedySnake.g:1799:2: (otherlv_0= 'head' otherlv_1= '=' ( (lv_head_2_0= '(' ) ) ( (lv_initial_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_initial_y_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= 'headIcon' otherlv_8= '{' ( (lv_headIcon_9_0= ruleIconTag ) )* otherlv_10= '}' otherlv_11= 'Icon_size' otherlv_12= '=' ( (lv_Iconsize_13_0= ruleIconSize ) ) otherlv_14= 'BodyIcon' otherlv_15= '{' ( (lv_BodyIcon_16_0= ruleIconTag ) )* otherlv_17= '}' otherlv_18= 'defaultSpeed' otherlv_19= '=' ( (lv_defaultSpeed_20_0= RULE_INT ) ) otherlv_21= 'snakeTag' otherlv_22= '=' ( (lv_snakeTag_23_0= RULE_INT ) ) )
            {
            // InternalGreedySnake.g:1799:2: (otherlv_0= 'head' otherlv_1= '=' ( (lv_head_2_0= '(' ) ) ( (lv_initial_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_initial_y_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= 'headIcon' otherlv_8= '{' ( (lv_headIcon_9_0= ruleIconTag ) )* otherlv_10= '}' otherlv_11= 'Icon_size' otherlv_12= '=' ( (lv_Iconsize_13_0= ruleIconSize ) ) otherlv_14= 'BodyIcon' otherlv_15= '{' ( (lv_BodyIcon_16_0= ruleIconTag ) )* otherlv_17= '}' otherlv_18= 'defaultSpeed' otherlv_19= '=' ( (lv_defaultSpeed_20_0= RULE_INT ) ) otherlv_21= 'snakeTag' otherlv_22= '=' ( (lv_snakeTag_23_0= RULE_INT ) ) )
            // InternalGreedySnake.g:1800:3: otherlv_0= 'head' otherlv_1= '=' ( (lv_head_2_0= '(' ) ) ( (lv_initial_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_initial_y_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= 'headIcon' otherlv_8= '{' ( (lv_headIcon_9_0= ruleIconTag ) )* otherlv_10= '}' otherlv_11= 'Icon_size' otherlv_12= '=' ( (lv_Iconsize_13_0= ruleIconSize ) ) otherlv_14= 'BodyIcon' otherlv_15= '{' ( (lv_BodyIcon_16_0= ruleIconTag ) )* otherlv_17= '}' otherlv_18= 'defaultSpeed' otherlv_19= '=' ( (lv_defaultSpeed_20_0= RULE_INT ) ) otherlv_21= 'snakeTag' otherlv_22= '=' ( (lv_snakeTag_23_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSnakeInitDisplayAccess().getHeadKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_1());
            		
            // InternalGreedySnake.g:1808:3: ( (lv_head_2_0= '(' ) )
            // InternalGreedySnake.g:1809:4: (lv_head_2_0= '(' )
            {
            // InternalGreedySnake.g:1809:4: (lv_head_2_0= '(' )
            // InternalGreedySnake.g:1810:5: lv_head_2_0= '('
            {
            lv_head_2_0=(Token)match(input,24,FOLLOW_10); 

            					newLeafNode(lv_head_2_0, grammarAccess.getSnakeInitDisplayAccess().getHeadLeftParenthesisKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSnakeInitDisplayRule());
            					}
            					setWithLastConsumed(current, "head", lv_head_2_0, "(");
            				

            }


            }

            // InternalGreedySnake.g:1822:3: ( (lv_initial_x_3_0= RULE_INT ) )
            // InternalGreedySnake.g:1823:4: (lv_initial_x_3_0= RULE_INT )
            {
            // InternalGreedySnake.g:1823:4: (lv_initial_x_3_0= RULE_INT )
            // InternalGreedySnake.g:1824:5: lv_initial_x_3_0= RULE_INT
            {
            lv_initial_x_3_0=(Token)match(input,RULE_INT,FOLLOW_40); 

            					newLeafNode(lv_initial_x_3_0, grammarAccess.getSnakeInitDisplayAccess().getInitial_xINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSnakeInitDisplayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"initial_x",
            						lv_initial_x_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getSnakeInitDisplayAccess().getCommaKeyword_4());
            		
            // InternalGreedySnake.g:1844:3: ( (lv_initial_y_5_0= RULE_INT ) )
            // InternalGreedySnake.g:1845:4: (lv_initial_y_5_0= RULE_INT )
            {
            // InternalGreedySnake.g:1845:4: (lv_initial_y_5_0= RULE_INT )
            // InternalGreedySnake.g:1846:5: lv_initial_y_5_0= RULE_INT
            {
            lv_initial_y_5_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_initial_y_5_0, grammarAccess.getSnakeInitDisplayAccess().getInitial_yINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSnakeInitDisplayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"initial_y",
            						lv_initial_y_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_41); 

            			newLeafNode(otherlv_6, grammarAccess.getSnakeInitDisplayAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getSnakeInitDisplayAccess().getHeadIconKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getSnakeInitDisplayAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalGreedySnake.g:1874:3: ( (lv_headIcon_9_0= ruleIconTag ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGreedySnake.g:1875:4: (lv_headIcon_9_0= ruleIconTag )
            	    {
            	    // InternalGreedySnake.g:1875:4: (lv_headIcon_9_0= ruleIconTag )
            	    // InternalGreedySnake.g:1876:5: lv_headIcon_9_0= ruleIconTag
            	    {

            	    					newCompositeNode(grammarAccess.getSnakeInitDisplayAccess().getHeadIconIconTagParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_headIcon_9_0=ruleIconTag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSnakeInitDisplayRule());
            	    					}
            	    					add(
            	    						current,
            	    						"headIcon",
            	    						lv_headIcon_9_0,
            	    						"org.xtext.example.mydsl2.group16.GreedySnake.IconTag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_10, grammarAccess.getSnakeInitDisplayAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getSnakeInitDisplayAccess().getIcon_sizeKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_12());
            		
            // InternalGreedySnake.g:1905:3: ( (lv_Iconsize_13_0= ruleIconSize ) )
            // InternalGreedySnake.g:1906:4: (lv_Iconsize_13_0= ruleIconSize )
            {
            // InternalGreedySnake.g:1906:4: (lv_Iconsize_13_0= ruleIconSize )
            // InternalGreedySnake.g:1907:5: lv_Iconsize_13_0= ruleIconSize
            {

            					newCompositeNode(grammarAccess.getSnakeInitDisplayAccess().getIconsizeIconSizeParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_42);
            lv_Iconsize_13_0=ruleIconSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSnakeInitDisplayRule());
            					}
            					set(
            						current,
            						"Iconsize",
            						lv_Iconsize_13_0,
            						"org.xtext.example.mydsl2.group16.GreedySnake.IconSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getSnakeInitDisplayAccess().getBodyIconKeyword_14());
            		
            otherlv_15=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_15, grammarAccess.getSnakeInitDisplayAccess().getLeftCurlyBracketKeyword_15());
            		
            // InternalGreedySnake.g:1932:3: ( (lv_BodyIcon_16_0= ruleIconTag ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGreedySnake.g:1933:4: (lv_BodyIcon_16_0= ruleIconTag )
            	    {
            	    // InternalGreedySnake.g:1933:4: (lv_BodyIcon_16_0= ruleIconTag )
            	    // InternalGreedySnake.g:1934:5: lv_BodyIcon_16_0= ruleIconTag
            	    {

            	    					newCompositeNode(grammarAccess.getSnakeInitDisplayAccess().getBodyIconIconTagParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_BodyIcon_16_0=ruleIconTag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSnakeInitDisplayRule());
            	    					}
            	    					add(
            	    						current,
            	    						"BodyIcon",
            	    						lv_BodyIcon_16_0,
            	    						"org.xtext.example.mydsl2.group16.GreedySnake.IconTag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_17=(Token)match(input,13,FOLLOW_43); 

            			newLeafNode(otherlv_17, grammarAccess.getSnakeInitDisplayAccess().getRightCurlyBracketKeyword_17());
            		
            otherlv_18=(Token)match(input,52,FOLLOW_7); 

            			newLeafNode(otherlv_18, grammarAccess.getSnakeInitDisplayAccess().getDefaultSpeedKeyword_18());
            		
            otherlv_19=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_19, grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_19());
            		
            // InternalGreedySnake.g:1963:3: ( (lv_defaultSpeed_20_0= RULE_INT ) )
            // InternalGreedySnake.g:1964:4: (lv_defaultSpeed_20_0= RULE_INT )
            {
            // InternalGreedySnake.g:1964:4: (lv_defaultSpeed_20_0= RULE_INT )
            // InternalGreedySnake.g:1965:5: lv_defaultSpeed_20_0= RULE_INT
            {
            lv_defaultSpeed_20_0=(Token)match(input,RULE_INT,FOLLOW_44); 

            					newLeafNode(lv_defaultSpeed_20_0, grammarAccess.getSnakeInitDisplayAccess().getDefaultSpeedINTTerminalRuleCall_20_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSnakeInitDisplayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"defaultSpeed",
            						lv_defaultSpeed_20_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_21=(Token)match(input,53,FOLLOW_7); 

            			newLeafNode(otherlv_21, grammarAccess.getSnakeInitDisplayAccess().getSnakeTagKeyword_21());
            		
            otherlv_22=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_22, grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_22());
            		
            // InternalGreedySnake.g:1989:3: ( (lv_snakeTag_23_0= RULE_INT ) )
            // InternalGreedySnake.g:1990:4: (lv_snakeTag_23_0= RULE_INT )
            {
            // InternalGreedySnake.g:1990:4: (lv_snakeTag_23_0= RULE_INT )
            // InternalGreedySnake.g:1991:5: lv_snakeTag_23_0= RULE_INT
            {
            lv_snakeTag_23_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_snakeTag_23_0, grammarAccess.getSnakeInitDisplayAccess().getSnakeTagINTTerminalRuleCall_23_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSnakeInitDisplayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"snakeTag",
            						lv_snakeTag_23_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSnakeInitDisplay"


    // $ANTLR start "entryRuleIconSize"
    // InternalGreedySnake.g:2011:1: entryRuleIconSize returns [String current=null] : iv_ruleIconSize= ruleIconSize EOF ;
    public final String entryRuleIconSize() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIconSize = null;


        try {
            // InternalGreedySnake.g:2011:48: (iv_ruleIconSize= ruleIconSize EOF )
            // InternalGreedySnake.g:2012:2: iv_ruleIconSize= ruleIconSize EOF
            {
             newCompositeNode(grammarAccess.getIconSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIconSize=ruleIconSize();

            state._fsp--;

             current =iv_ruleIconSize.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIconSize"


    // $ANTLR start "ruleIconSize"
    // InternalGreedySnake.g:2018:1: ruleIconSize returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleIconSize() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:2024:2: (this_INT_0= RULE_INT )
            // InternalGreedySnake.g:2025:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getIconSizeAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIconSize"


    // $ANTLR start "entryRuleIconTag"
    // InternalGreedySnake.g:2035:1: entryRuleIconTag returns [EObject current=null] : iv_ruleIconTag= ruleIconTag EOF ;
    public final EObject entryRuleIconTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIconTag = null;


        try {
            // InternalGreedySnake.g:2035:48: (iv_ruleIconTag= ruleIconTag EOF )
            // InternalGreedySnake.g:2036:2: iv_ruleIconTag= ruleIconTag EOF
            {
             newCompositeNode(grammarAccess.getIconTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIconTag=ruleIconTag();

            state._fsp--;

             current =iv_ruleIconTag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIconTag"


    // $ANTLR start "ruleIconTag"
    // InternalGreedySnake.g:2042:1: ruleIconTag returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_tag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_Locate_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleIconTag() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_tag_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_Locate_6_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:2048:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_tag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_Locate_6_0= RULE_STRING ) ) ) )
            // InternalGreedySnake.g:2049:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_tag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_Locate_6_0= RULE_STRING ) ) )
            {
            // InternalGreedySnake.g:2049:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_tag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_Locate_6_0= RULE_STRING ) ) )
            // InternalGreedySnake.g:2050:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_tag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_Locate_6_0= RULE_STRING ) )
            {
            // InternalGreedySnake.g:2050:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreedySnake.g:2051:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreedySnake.g:2051:4: (lv_name_0_0= RULE_ID )
            // InternalGreedySnake.g:2052:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIconTagAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIconTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGreedySnake.g:2068:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalGreedySnake.g:2069:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalGreedySnake.g:2069:4: (lv_value_1_0= RULE_STRING )
            // InternalGreedySnake.g:2070:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_value_1_0, grammarAccess.getIconTagAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIconTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getIconTagAccess().getEqualsSignKeyword_2());
            		
            // InternalGreedySnake.g:2090:3: ( (lv_tag_3_0= RULE_INT ) )
            // InternalGreedySnake.g:2091:4: (lv_tag_3_0= RULE_INT )
            {
            // InternalGreedySnake.g:2091:4: (lv_tag_3_0= RULE_INT )
            // InternalGreedySnake.g:2092:5: lv_tag_3_0= RULE_INT
            {
            lv_tag_3_0=(Token)match(input,RULE_INT,FOLLOW_45); 

            					newLeafNode(lv_tag_3_0, grammarAccess.getIconTagAccess().getTagINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIconTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tag",
            						lv_tag_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,54,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getIconTagAccess().getLocateKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getIconTagAccess().getColonKeyword_5());
            		
            // InternalGreedySnake.g:2116:3: ( (lv_Locate_6_0= RULE_STRING ) )
            // InternalGreedySnake.g:2117:4: (lv_Locate_6_0= RULE_STRING )
            {
            // InternalGreedySnake.g:2117:4: (lv_Locate_6_0= RULE_STRING )
            // InternalGreedySnake.g:2118:5: lv_Locate_6_0= RULE_STRING
            {
            lv_Locate_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_Locate_6_0, grammarAccess.getIconTagAccess().getLocateSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIconTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Locate",
            						lv_Locate_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIconTag"


    // $ANTLR start "entryRuleFoodInitDisplay"
    // InternalGreedySnake.g:2138:1: entryRuleFoodInitDisplay returns [EObject current=null] : iv_ruleFoodInitDisplay= ruleFoodInitDisplay EOF ;
    public final EObject entryRuleFoodInitDisplay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoodInitDisplay = null;


        try {
            // InternalGreedySnake.g:2138:56: (iv_ruleFoodInitDisplay= ruleFoodInitDisplay EOF )
            // InternalGreedySnake.g:2139:2: iv_ruleFoodInitDisplay= ruleFoodInitDisplay EOF
            {
             newCompositeNode(grammarAccess.getFoodInitDisplayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFoodInitDisplay=ruleFoodInitDisplay();

            state._fsp--;

             current =iv_ruleFoodInitDisplay; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFoodInitDisplay"


    // $ANTLR start "ruleFoodInitDisplay"
    // InternalGreedySnake.g:2145:1: ruleFoodInitDisplay returns [EObject current=null] : (otherlv_0= 'foodIcon' otherlv_1= '{' ( (lv_foodIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'foodKind' otherlv_8= '{' ( (lv_foodKind_9_0= ruleFoodKind ) )* otherlv_10= '}' otherlv_11= 'randomFoodSize' ( (lv_produce_12_0= ruleRandomFoodSize ) ) otherlv_13= 'foodTag' otherlv_14= '=' ( (lv_foodTag_15_0= RULE_INT ) ) ) ;
    public final EObject ruleFoodInitDisplay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_foodTag_15_0=null;
        EObject lv_foodIcon_2_0 = null;

        AntlrDatatypeRuleToken lv_Iconsize_6_0 = null;

        EObject lv_foodKind_9_0 = null;

        EObject lv_produce_12_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:2151:2: ( (otherlv_0= 'foodIcon' otherlv_1= '{' ( (lv_foodIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'foodKind' otherlv_8= '{' ( (lv_foodKind_9_0= ruleFoodKind ) )* otherlv_10= '}' otherlv_11= 'randomFoodSize' ( (lv_produce_12_0= ruleRandomFoodSize ) ) otherlv_13= 'foodTag' otherlv_14= '=' ( (lv_foodTag_15_0= RULE_INT ) ) ) )
            // InternalGreedySnake.g:2152:2: (otherlv_0= 'foodIcon' otherlv_1= '{' ( (lv_foodIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'foodKind' otherlv_8= '{' ( (lv_foodKind_9_0= ruleFoodKind ) )* otherlv_10= '}' otherlv_11= 'randomFoodSize' ( (lv_produce_12_0= ruleRandomFoodSize ) ) otherlv_13= 'foodTag' otherlv_14= '=' ( (lv_foodTag_15_0= RULE_INT ) ) )
            {
            // InternalGreedySnake.g:2152:2: (otherlv_0= 'foodIcon' otherlv_1= '{' ( (lv_foodIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'foodKind' otherlv_8= '{' ( (lv_foodKind_9_0= ruleFoodKind ) )* otherlv_10= '}' otherlv_11= 'randomFoodSize' ( (lv_produce_12_0= ruleRandomFoodSize ) ) otherlv_13= 'foodTag' otherlv_14= '=' ( (lv_foodTag_15_0= RULE_INT ) ) )
            // InternalGreedySnake.g:2153:3: otherlv_0= 'foodIcon' otherlv_1= '{' ( (lv_foodIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'foodKind' otherlv_8= '{' ( (lv_foodKind_9_0= ruleFoodKind ) )* otherlv_10= '}' otherlv_11= 'randomFoodSize' ( (lv_produce_12_0= ruleRandomFoodSize ) ) otherlv_13= 'foodTag' otherlv_14= '=' ( (lv_foodTag_15_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFoodInitDisplayAccess().getFoodIconKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getFoodInitDisplayAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGreedySnake.g:2161:3: ( (lv_foodIcon_2_0= ruleIconTag ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGreedySnake.g:2162:4: (lv_foodIcon_2_0= ruleIconTag )
            	    {
            	    // InternalGreedySnake.g:2162:4: (lv_foodIcon_2_0= ruleIconTag )
            	    // InternalGreedySnake.g:2163:5: lv_foodIcon_2_0= ruleIconTag
            	    {

            	    					newCompositeNode(grammarAccess.getFoodInitDisplayAccess().getFoodIconIconTagParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_foodIcon_2_0=ruleIconTag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFoodInitDisplayRule());
            	    					}
            	    					add(
            	    						current,
            	    						"foodIcon",
            	    						lv_foodIcon_2_0,
            	    						"org.xtext.example.mydsl2.group16.GreedySnake.IconTag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getFoodInitDisplayAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getFoodInitDisplayAccess().getIcon_sizeKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getFoodInitDisplayAccess().getEqualsSignKeyword_5());
            		
            // InternalGreedySnake.g:2192:3: ( (lv_Iconsize_6_0= ruleIconSize ) )
            // InternalGreedySnake.g:2193:4: (lv_Iconsize_6_0= ruleIconSize )
            {
            // InternalGreedySnake.g:2193:4: (lv_Iconsize_6_0= ruleIconSize )
            // InternalGreedySnake.g:2194:5: lv_Iconsize_6_0= ruleIconSize
            {

            					newCompositeNode(grammarAccess.getFoodInitDisplayAccess().getIconsizeIconSizeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_46);
            lv_Iconsize_6_0=ruleIconSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFoodInitDisplayRule());
            					}
            					set(
            						current,
            						"Iconsize",
            						lv_Iconsize_6_0,
            						"org.xtext.example.mydsl2.group16.GreedySnake.IconSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,56,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getFoodInitDisplayAccess().getFoodKindKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getFoodInitDisplayAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalGreedySnake.g:2219:3: ( (lv_foodKind_9_0= ruleFoodKind ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGreedySnake.g:2220:4: (lv_foodKind_9_0= ruleFoodKind )
            	    {
            	    // InternalGreedySnake.g:2220:4: (lv_foodKind_9_0= ruleFoodKind )
            	    // InternalGreedySnake.g:2221:5: lv_foodKind_9_0= ruleFoodKind
            	    {

            	    					newCompositeNode(grammarAccess.getFoodInitDisplayAccess().getFoodKindFoodKindParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_foodKind_9_0=ruleFoodKind();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFoodInitDisplayRule());
            	    					}
            	    					add(
            	    						current,
            	    						"foodKind",
            	    						lv_foodKind_9_0,
            	    						"org.xtext.example.mydsl2.group16.GreedySnake.FoodKind");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_47); 

            			newLeafNode(otherlv_10, grammarAccess.getFoodInitDisplayAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,57,FOLLOW_48); 

            			newLeafNode(otherlv_11, grammarAccess.getFoodInitDisplayAccess().getRandomFoodSizeKeyword_11());
            		
            // InternalGreedySnake.g:2246:3: ( (lv_produce_12_0= ruleRandomFoodSize ) )
            // InternalGreedySnake.g:2247:4: (lv_produce_12_0= ruleRandomFoodSize )
            {
            // InternalGreedySnake.g:2247:4: (lv_produce_12_0= ruleRandomFoodSize )
            // InternalGreedySnake.g:2248:5: lv_produce_12_0= ruleRandomFoodSize
            {

            					newCompositeNode(grammarAccess.getFoodInitDisplayAccess().getProduceRandomFoodSizeParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_49);
            lv_produce_12_0=ruleRandomFoodSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFoodInitDisplayRule());
            					}
            					set(
            						current,
            						"produce",
            						lv_produce_12_0,
            						"org.xtext.example.mydsl2.group16.GreedySnake.RandomFoodSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,58,FOLLOW_7); 

            			newLeafNode(otherlv_13, grammarAccess.getFoodInitDisplayAccess().getFoodTagKeyword_13());
            		
            otherlv_14=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_14, grammarAccess.getFoodInitDisplayAccess().getEqualsSignKeyword_14());
            		
            // InternalGreedySnake.g:2273:3: ( (lv_foodTag_15_0= RULE_INT ) )
            // InternalGreedySnake.g:2274:4: (lv_foodTag_15_0= RULE_INT )
            {
            // InternalGreedySnake.g:2274:4: (lv_foodTag_15_0= RULE_INT )
            // InternalGreedySnake.g:2275:5: lv_foodTag_15_0= RULE_INT
            {
            lv_foodTag_15_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_foodTag_15_0, grammarAccess.getFoodInitDisplayAccess().getFoodTagINTTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFoodInitDisplayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"foodTag",
            						lv_foodTag_15_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFoodInitDisplay"


    // $ANTLR start "entryRuleFoodKind"
    // InternalGreedySnake.g:2295:1: entryRuleFoodKind returns [EObject current=null] : iv_ruleFoodKind= ruleFoodKind EOF ;
    public final EObject entryRuleFoodKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoodKind = null;


        try {
            // InternalGreedySnake.g:2295:49: (iv_ruleFoodKind= ruleFoodKind EOF )
            // InternalGreedySnake.g:2296:2: iv_ruleFoodKind= ruleFoodKind EOF
            {
             newCompositeNode(grammarAccess.getFoodKindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFoodKind=ruleFoodKind();

            state._fsp--;

             current =iv_ruleFoodKind; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFoodKind"


    // $ANTLR start "ruleFoodKind"
    // InternalGreedySnake.g:2302:1: ruleFoodKind returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'point' otherlv_3= '=' ( (lv_point_4_0= ruleAddition ) ) ) ;
    public final EObject ruleFoodKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_point_4_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:2308:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'point' otherlv_3= '=' ( (lv_point_4_0= ruleAddition ) ) ) )
            // InternalGreedySnake.g:2309:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'point' otherlv_3= '=' ( (lv_point_4_0= ruleAddition ) ) )
            {
            // InternalGreedySnake.g:2309:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'point' otherlv_3= '=' ( (lv_point_4_0= ruleAddition ) ) )
            // InternalGreedySnake.g:2310:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'point' otherlv_3= '=' ( (lv_point_4_0= ruleAddition ) )
            {
            // InternalGreedySnake.g:2310:3: ( (otherlv_0= RULE_ID ) )
            // InternalGreedySnake.g:2311:4: (otherlv_0= RULE_ID )
            {
            // InternalGreedySnake.g:2311:4: (otherlv_0= RULE_ID )
            // InternalGreedySnake.g:2312:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFoodKindRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_0, grammarAccess.getFoodKindAccess().getKindIconTagCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getFoodKindAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,59,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFoodKindAccess().getPointKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_51); 

            			newLeafNode(otherlv_3, grammarAccess.getFoodKindAccess().getEqualsSignKeyword_3());
            		
            // InternalGreedySnake.g:2335:3: ( (lv_point_4_0= ruleAddition ) )
            // InternalGreedySnake.g:2336:4: (lv_point_4_0= ruleAddition )
            {
            // InternalGreedySnake.g:2336:4: (lv_point_4_0= ruleAddition )
            // InternalGreedySnake.g:2337:5: lv_point_4_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getFoodKindAccess().getPointAdditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_point_4_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFoodKindRule());
            					}
            					set(
            						current,
            						"point",
            						lv_point_4_0,
            						"org.xtext.example.mydsl2.group16.GreedySnake.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFoodKind"


    // $ANTLR start "entryRuleObstacleInitDisplay"
    // InternalGreedySnake.g:2358:1: entryRuleObstacleInitDisplay returns [EObject current=null] : iv_ruleObstacleInitDisplay= ruleObstacleInitDisplay EOF ;
    public final EObject entryRuleObstacleInitDisplay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacleInitDisplay = null;


        try {
            // InternalGreedySnake.g:2358:60: (iv_ruleObstacleInitDisplay= ruleObstacleInitDisplay EOF )
            // InternalGreedySnake.g:2359:2: iv_ruleObstacleInitDisplay= ruleObstacleInitDisplay EOF
            {
             newCompositeNode(grammarAccess.getObstacleInitDisplayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObstacleInitDisplay=ruleObstacleInitDisplay();

            state._fsp--;

             current =iv_ruleObstacleInitDisplay; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObstacleInitDisplay"


    // $ANTLR start "ruleObstacleInitDisplay"
    // InternalGreedySnake.g:2365:1: ruleObstacleInitDisplay returns [EObject current=null] : (otherlv_0= 'ObstacleIcon' otherlv_1= '{' ( (lv_ObstacleIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'ObstacleTag' otherlv_8= '=' ( (lv_ObstacleTag_9_0= RULE_INT ) ) ) ;
    public final EObject ruleObstacleInitDisplay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_ObstacleTag_9_0=null;
        EObject lv_ObstacleIcon_2_0 = null;

        AntlrDatatypeRuleToken lv_Iconsize_6_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:2371:2: ( (otherlv_0= 'ObstacleIcon' otherlv_1= '{' ( (lv_ObstacleIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'ObstacleTag' otherlv_8= '=' ( (lv_ObstacleTag_9_0= RULE_INT ) ) ) )
            // InternalGreedySnake.g:2372:2: (otherlv_0= 'ObstacleIcon' otherlv_1= '{' ( (lv_ObstacleIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'ObstacleTag' otherlv_8= '=' ( (lv_ObstacleTag_9_0= RULE_INT ) ) )
            {
            // InternalGreedySnake.g:2372:2: (otherlv_0= 'ObstacleIcon' otherlv_1= '{' ( (lv_ObstacleIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'ObstacleTag' otherlv_8= '=' ( (lv_ObstacleTag_9_0= RULE_INT ) ) )
            // InternalGreedySnake.g:2373:3: otherlv_0= 'ObstacleIcon' otherlv_1= '{' ( (lv_ObstacleIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'ObstacleTag' otherlv_8= '=' ( (lv_ObstacleTag_9_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObstacleInitDisplayAccess().getObstacleIconKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getObstacleInitDisplayAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGreedySnake.g:2381:3: ( (lv_ObstacleIcon_2_0= ruleIconTag ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGreedySnake.g:2382:4: (lv_ObstacleIcon_2_0= ruleIconTag )
            	    {
            	    // InternalGreedySnake.g:2382:4: (lv_ObstacleIcon_2_0= ruleIconTag )
            	    // InternalGreedySnake.g:2383:5: lv_ObstacleIcon_2_0= ruleIconTag
            	    {

            	    					newCompositeNode(grammarAccess.getObstacleInitDisplayAccess().getObstacleIconIconTagParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_ObstacleIcon_2_0=ruleIconTag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObstacleInitDisplayRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ObstacleIcon",
            	    						lv_ObstacleIcon_2_0,
            	    						"org.xtext.example.mydsl2.group16.GreedySnake.IconTag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getObstacleInitDisplayAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getObstacleInitDisplayAccess().getIcon_sizeKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getObstacleInitDisplayAccess().getEqualsSignKeyword_5());
            		
            // InternalGreedySnake.g:2412:3: ( (lv_Iconsize_6_0= ruleIconSize ) )
            // InternalGreedySnake.g:2413:4: (lv_Iconsize_6_0= ruleIconSize )
            {
            // InternalGreedySnake.g:2413:4: (lv_Iconsize_6_0= ruleIconSize )
            // InternalGreedySnake.g:2414:5: lv_Iconsize_6_0= ruleIconSize
            {

            					newCompositeNode(grammarAccess.getObstacleInitDisplayAccess().getIconsizeIconSizeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_52);
            lv_Iconsize_6_0=ruleIconSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObstacleInitDisplayRule());
            					}
            					set(
            						current,
            						"Iconsize",
            						lv_Iconsize_6_0,
            						"org.xtext.example.mydsl2.group16.GreedySnake.IconSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,61,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getObstacleInitDisplayAccess().getObstacleTagKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getObstacleInitDisplayAccess().getEqualsSignKeyword_8());
            		
            // InternalGreedySnake.g:2439:3: ( (lv_ObstacleTag_9_0= RULE_INT ) )
            // InternalGreedySnake.g:2440:4: (lv_ObstacleTag_9_0= RULE_INT )
            {
            // InternalGreedySnake.g:2440:4: (lv_ObstacleTag_9_0= RULE_INT )
            // InternalGreedySnake.g:2441:5: lv_ObstacleTag_9_0= RULE_INT
            {
            lv_ObstacleTag_9_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_ObstacleTag_9_0, grammarAccess.getObstacleInitDisplayAccess().getObstacleTagINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObstacleInitDisplayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ObstacleTag",
            						lv_ObstacleTag_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObstacleInitDisplay"


    // $ANTLR start "entryRuleRandomFoodSize"
    // InternalGreedySnake.g:2461:1: entryRuleRandomFoodSize returns [EObject current=null] : iv_ruleRandomFoodSize= ruleRandomFoodSize EOF ;
    public final EObject entryRuleRandomFoodSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomFoodSize = null;


        try {
            // InternalGreedySnake.g:2461:55: (iv_ruleRandomFoodSize= ruleRandomFoodSize EOF )
            // InternalGreedySnake.g:2462:2: iv_ruleRandomFoodSize= ruleRandomFoodSize EOF
            {
             newCompositeNode(grammarAccess.getRandomFoodSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRandomFoodSize=ruleRandomFoodSize();

            state._fsp--;

             current =iv_ruleRandomFoodSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRandomFoodSize"


    // $ANTLR start "ruleRandomFoodSize"
    // InternalGreedySnake.g:2468:1: ruleRandomFoodSize returns [EObject current=null] : (otherlv_0= 'Maxsize' ( (lv_maxsize_1_0= RULE_INT ) ) otherlv_2= 'Minsize' ( (lv_minsize_3_0= RULE_INT ) ) ) ;
    public final EObject ruleRandomFoodSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_maxsize_1_0=null;
        Token otherlv_2=null;
        Token lv_minsize_3_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:2474:2: ( (otherlv_0= 'Maxsize' ( (lv_maxsize_1_0= RULE_INT ) ) otherlv_2= 'Minsize' ( (lv_minsize_3_0= RULE_INT ) ) ) )
            // InternalGreedySnake.g:2475:2: (otherlv_0= 'Maxsize' ( (lv_maxsize_1_0= RULE_INT ) ) otherlv_2= 'Minsize' ( (lv_minsize_3_0= RULE_INT ) ) )
            {
            // InternalGreedySnake.g:2475:2: (otherlv_0= 'Maxsize' ( (lv_maxsize_1_0= RULE_INT ) ) otherlv_2= 'Minsize' ( (lv_minsize_3_0= RULE_INT ) ) )
            // InternalGreedySnake.g:2476:3: otherlv_0= 'Maxsize' ( (lv_maxsize_1_0= RULE_INT ) ) otherlv_2= 'Minsize' ( (lv_minsize_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRandomFoodSizeAccess().getMaxsizeKeyword_0());
            		
            // InternalGreedySnake.g:2480:3: ( (lv_maxsize_1_0= RULE_INT ) )
            // InternalGreedySnake.g:2481:4: (lv_maxsize_1_0= RULE_INT )
            {
            // InternalGreedySnake.g:2481:4: (lv_maxsize_1_0= RULE_INT )
            // InternalGreedySnake.g:2482:5: lv_maxsize_1_0= RULE_INT
            {
            lv_maxsize_1_0=(Token)match(input,RULE_INT,FOLLOW_53); 

            					newLeafNode(lv_maxsize_1_0, grammarAccess.getRandomFoodSizeAccess().getMaxsizeINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRandomFoodSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxsize",
            						lv_maxsize_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,63,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRandomFoodSizeAccess().getMinsizeKeyword_2());
            		
            // InternalGreedySnake.g:2502:3: ( (lv_minsize_3_0= RULE_INT ) )
            // InternalGreedySnake.g:2503:4: (lv_minsize_3_0= RULE_INT )
            {
            // InternalGreedySnake.g:2503:4: (lv_minsize_3_0= RULE_INT )
            // InternalGreedySnake.g:2504:5: lv_minsize_3_0= RULE_INT
            {
            lv_minsize_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_minsize_3_0, grammarAccess.getRandomFoodSizeAccess().getMinsizeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRandomFoodSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minsize",
            						lv_minsize_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRandomFoodSize"


    // $ANTLR start "entryRuleTimeLimited"
    // InternalGreedySnake.g:2524:1: entryRuleTimeLimited returns [EObject current=null] : iv_ruleTimeLimited= ruleTimeLimited EOF ;
    public final EObject entryRuleTimeLimited() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLimited = null;


        try {
            // InternalGreedySnake.g:2524:52: (iv_ruleTimeLimited= ruleTimeLimited EOF )
            // InternalGreedySnake.g:2525:2: iv_ruleTimeLimited= ruleTimeLimited EOF
            {
             newCompositeNode(grammarAccess.getTimeLimitedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeLimited=ruleTimeLimited();

            state._fsp--;

             current =iv_ruleTimeLimited; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeLimited"


    // $ANTLR start "ruleTimeLimited"
    // InternalGreedySnake.g:2531:1: ruleTimeLimited returns [EObject current=null] : ( (otherlv_0= 'timeLimited' otherlv_1= '{' this_FoodTime_2= ruleFoodTime ) | (this_ObstacleTime_3= ruleObstacleTime otherlv_4= '}' ) ) ;
    public final EObject ruleTimeLimited() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_FoodTime_2 = null;

        EObject this_ObstacleTime_3 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:2537:2: ( ( (otherlv_0= 'timeLimited' otherlv_1= '{' this_FoodTime_2= ruleFoodTime ) | (this_ObstacleTime_3= ruleObstacleTime otherlv_4= '}' ) ) )
            // InternalGreedySnake.g:2538:2: ( (otherlv_0= 'timeLimited' otherlv_1= '{' this_FoodTime_2= ruleFoodTime ) | (this_ObstacleTime_3= ruleObstacleTime otherlv_4= '}' ) )
            {
            // InternalGreedySnake.g:2538:2: ( (otherlv_0= 'timeLimited' otherlv_1= '{' this_FoodTime_2= ruleFoodTime ) | (this_ObstacleTime_3= ruleObstacleTime otherlv_4= '}' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==64) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalGreedySnake.g:2539:3: (otherlv_0= 'timeLimited' otherlv_1= '{' this_FoodTime_2= ruleFoodTime )
                    {
                    // InternalGreedySnake.g:2539:3: (otherlv_0= 'timeLimited' otherlv_1= '{' this_FoodTime_2= ruleFoodTime )
                    // InternalGreedySnake.g:2540:4: otherlv_0= 'timeLimited' otherlv_1= '{' this_FoodTime_2= ruleFoodTime
                    {
                    otherlv_0=(Token)match(input,64,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getTimeLimitedAccess().getTimeLimitedKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getTimeLimitedAccess().getLeftCurlyBracketKeyword_0_1());
                    			

                    				newCompositeNode(grammarAccess.getTimeLimitedAccess().getFoodTimeParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_FoodTime_2=ruleFoodTime();

                    state._fsp--;


                    				current = this_FoodTime_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:2558:3: (this_ObstacleTime_3= ruleObstacleTime otherlv_4= '}' )
                    {
                    // InternalGreedySnake.g:2558:3: (this_ObstacleTime_3= ruleObstacleTime otherlv_4= '}' )
                    // InternalGreedySnake.g:2559:4: this_ObstacleTime_3= ruleObstacleTime otherlv_4= '}'
                    {

                    				newCompositeNode(grammarAccess.getTimeLimitedAccess().getObstacleTimeParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_17);
                    this_ObstacleTime_3=ruleObstacleTime();

                    state._fsp--;


                    				current = this_ObstacleTime_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTimeLimitedAccess().getRightCurlyBracketKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeLimited"


    // $ANTLR start "entryRuleObstacleTime"
    // InternalGreedySnake.g:2576:1: entryRuleObstacleTime returns [EObject current=null] : iv_ruleObstacleTime= ruleObstacleTime EOF ;
    public final EObject entryRuleObstacleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacleTime = null;


        try {
            // InternalGreedySnake.g:2576:53: (iv_ruleObstacleTime= ruleObstacleTime EOF )
            // InternalGreedySnake.g:2577:2: iv_ruleObstacleTime= ruleObstacleTime EOF
            {
             newCompositeNode(grammarAccess.getObstacleTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObstacleTime=ruleObstacleTime();

            state._fsp--;

             current =iv_ruleObstacleTime; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObstacleTime"


    // $ANTLR start "ruleObstacleTime"
    // InternalGreedySnake.g:2583:1: ruleObstacleTime returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_ObstacleTime_2_0= RULE_INT ) ) ) ;
    public final EObject ruleObstacleTime() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_ObstacleTime_2_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:2589:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_ObstacleTime_2_0= RULE_INT ) ) ) )
            // InternalGreedySnake.g:2590:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_ObstacleTime_2_0= RULE_INT ) ) )
            {
            // InternalGreedySnake.g:2590:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_ObstacleTime_2_0= RULE_INT ) ) )
            // InternalGreedySnake.g:2591:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_ObstacleTime_2_0= RULE_INT ) )
            {
            // InternalGreedySnake.g:2591:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreedySnake.g:2592:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreedySnake.g:2592:4: (lv_name_0_0= RULE_ID )
            // InternalGreedySnake.g:2593:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getObstacleTimeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObstacleTimeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getObstacleTimeAccess().getEqualsSignKeyword_1());
            		
            // InternalGreedySnake.g:2613:3: ( (lv_ObstacleTime_2_0= RULE_INT ) )
            // InternalGreedySnake.g:2614:4: (lv_ObstacleTime_2_0= RULE_INT )
            {
            // InternalGreedySnake.g:2614:4: (lv_ObstacleTime_2_0= RULE_INT )
            // InternalGreedySnake.g:2615:5: lv_ObstacleTime_2_0= RULE_INT
            {
            lv_ObstacleTime_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_ObstacleTime_2_0, grammarAccess.getObstacleTimeAccess().getObstacleTimeINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObstacleTimeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ObstacleTime",
            						lv_ObstacleTime_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObstacleTime"


    // $ANTLR start "entryRuleFoodTime"
    // InternalGreedySnake.g:2635:1: entryRuleFoodTime returns [EObject current=null] : iv_ruleFoodTime= ruleFoodTime EOF ;
    public final EObject entryRuleFoodTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoodTime = null;


        try {
            // InternalGreedySnake.g:2635:49: (iv_ruleFoodTime= ruleFoodTime EOF )
            // InternalGreedySnake.g:2636:2: iv_ruleFoodTime= ruleFoodTime EOF
            {
             newCompositeNode(grammarAccess.getFoodTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFoodTime=ruleFoodTime();

            state._fsp--;

             current =iv_ruleFoodTime; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFoodTime"


    // $ANTLR start "ruleFoodTime"
    // InternalGreedySnake.g:2642:1: ruleFoodTime returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_FoodTime_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFoodTime() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_FoodTime_2_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:2648:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_FoodTime_2_0= RULE_INT ) ) ) )
            // InternalGreedySnake.g:2649:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_FoodTime_2_0= RULE_INT ) ) )
            {
            // InternalGreedySnake.g:2649:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_FoodTime_2_0= RULE_INT ) ) )
            // InternalGreedySnake.g:2650:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_FoodTime_2_0= RULE_INT ) )
            {
            // InternalGreedySnake.g:2650:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreedySnake.g:2651:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreedySnake.g:2651:4: (lv_name_0_0= RULE_ID )
            // InternalGreedySnake.g:2652:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFoodTimeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFoodTimeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getFoodTimeAccess().getEqualsSignKeyword_1());
            		
            // InternalGreedySnake.g:2672:3: ( (lv_FoodTime_2_0= RULE_INT ) )
            // InternalGreedySnake.g:2673:4: (lv_FoodTime_2_0= RULE_INT )
            {
            // InternalGreedySnake.g:2673:4: (lv_FoodTime_2_0= RULE_INT )
            // InternalGreedySnake.g:2674:5: lv_FoodTime_2_0= RULE_INT
            {
            lv_FoodTime_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_FoodTime_2_0, grammarAccess.getFoodTimeAccess().getFoodTimeINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFoodTimeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"FoodTime",
            						lv_FoodTime_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFoodTime"


    // $ANTLR start "entryRuleDirectionSpecification"
    // InternalGreedySnake.g:2694:1: entryRuleDirectionSpecification returns [EObject current=null] : iv_ruleDirectionSpecification= ruleDirectionSpecification EOF ;
    public final EObject entryRuleDirectionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectionSpecification = null;


        try {
            // InternalGreedySnake.g:2694:63: (iv_ruleDirectionSpecification= ruleDirectionSpecification EOF )
            // InternalGreedySnake.g:2695:2: iv_ruleDirectionSpecification= ruleDirectionSpecification EOF
            {
             newCompositeNode(grammarAccess.getDirectionSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectionSpecification=ruleDirectionSpecification();

            state._fsp--;

             current =iv_ruleDirectionSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectionSpecification"


    // $ANTLR start "ruleDirectionSpecification"
    // InternalGreedySnake.g:2701:1: ruleDirectionSpecification returns [EObject current=null] : ( () otherlv_1= 'Direction' otherlv_2= '{' ( (lv_di_3_0= ruledis ) )* otherlv_4= '}' ) ;
    public final EObject ruleDirectionSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_di_3_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:2707:2: ( ( () otherlv_1= 'Direction' otherlv_2= '{' ( (lv_di_3_0= ruledis ) )* otherlv_4= '}' ) )
            // InternalGreedySnake.g:2708:2: ( () otherlv_1= 'Direction' otherlv_2= '{' ( (lv_di_3_0= ruledis ) )* otherlv_4= '}' )
            {
            // InternalGreedySnake.g:2708:2: ( () otherlv_1= 'Direction' otherlv_2= '{' ( (lv_di_3_0= ruledis ) )* otherlv_4= '}' )
            // InternalGreedySnake.g:2709:3: () otherlv_1= 'Direction' otherlv_2= '{' ( (lv_di_3_0= ruledis ) )* otherlv_4= '}'
            {
            // InternalGreedySnake.g:2709:3: ()
            // InternalGreedySnake.g:2710:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDirectionSpecificationAccess().getDirectionSpecificationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDirectionSpecificationAccess().getDirectionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getDirectionSpecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGreedySnake.g:2724:3: ( (lv_di_3_0= ruledis ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGreedySnake.g:2725:4: (lv_di_3_0= ruledis )
            	    {
            	    // InternalGreedySnake.g:2725:4: (lv_di_3_0= ruledis )
            	    // InternalGreedySnake.g:2726:5: lv_di_3_0= ruledis
            	    {

            	    					newCompositeNode(grammarAccess.getDirectionSpecificationAccess().getDiDisParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_di_3_0=ruledis();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDirectionSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"di",
            	    						lv_di_3_0,
            	    						"org.xtext.example.mydsl2.group16.GreedySnake.dis");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDirectionSpecificationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectionSpecification"


    // $ANTLR start "entryRuledis"
    // InternalGreedySnake.g:2751:1: entryRuledis returns [EObject current=null] : iv_ruledis= ruledis EOF ;
    public final EObject entryRuledis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledis = null;


        try {
            // InternalGreedySnake.g:2751:44: (iv_ruledis= ruledis EOF )
            // InternalGreedySnake.g:2752:2: iv_ruledis= ruledis EOF
            {
             newCompositeNode(grammarAccess.getDisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledis=ruledis();

            state._fsp--;

             current =iv_ruledis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledis"


    // $ANTLR start "ruledis"
    // InternalGreedySnake.g:2758:1: ruledis returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_direction_2_0= ruleDirection ) ) ) ;
    public final EObject ruledis() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_direction_2_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:2764:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_direction_2_0= ruleDirection ) ) ) )
            // InternalGreedySnake.g:2765:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_direction_2_0= ruleDirection ) ) )
            {
            // InternalGreedySnake.g:2765:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_direction_2_0= ruleDirection ) ) )
            // InternalGreedySnake.g:2766:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_direction_2_0= ruleDirection ) )
            {
            // InternalGreedySnake.g:2766:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreedySnake.g:2767:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreedySnake.g:2767:4: (lv_name_0_0= RULE_ID )
            // InternalGreedySnake.g:2768:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDisAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDisRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getDisAccess().getEqualsSignKeyword_1());
            		
            // InternalGreedySnake.g:2788:3: ( (lv_direction_2_0= ruleDirection ) )
            // InternalGreedySnake.g:2789:4: (lv_direction_2_0= ruleDirection )
            {
            // InternalGreedySnake.g:2789:4: (lv_direction_2_0= ruleDirection )
            // InternalGreedySnake.g:2790:5: lv_direction_2_0= ruleDirection
            {

            					newCompositeNode(grammarAccess.getDisAccess().getDirectionDirectionEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_direction_2_0=ruleDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDisRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_2_0,
            						"org.xtext.example.mydsl2.group16.GreedySnake.Direction");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledis"


    // $ANTLR start "entryRuleAddition"
    // InternalGreedySnake.g:2811:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalGreedySnake.g:2811:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalGreedySnake.g:2812:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalGreedySnake.g:2818:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:2824:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalGreedySnake.g:2825:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalGreedySnake.g:2825:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalGreedySnake.g:2826:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_55);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGreedySnake.g:2834:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=44 && LA19_0<=45)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGreedySnake.g:2835:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalGreedySnake.g:2835:4: ()
            	    // InternalGreedySnake.g:2836:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalGreedySnake.g:2842:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalGreedySnake.g:2843:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalGreedySnake.g:2843:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalGreedySnake.g:2844:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalGreedySnake.g:2844:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==44) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==45) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalGreedySnake.g:2845:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,44,FOLLOW_51); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalGreedySnake.g:2856:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,45,FOLLOW_51); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalGreedySnake.g:2869:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalGreedySnake.g:2870:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalGreedySnake.g:2870:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalGreedySnake.g:2871:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_55);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalGreedySnake.g:2893:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalGreedySnake.g:2893:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalGreedySnake.g:2894:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalGreedySnake.g:2900:1: ruleMultiplication returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:2906:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalGreedySnake.g:2907:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalGreedySnake.g:2907:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalGreedySnake.g:2908:3: this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_56);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGreedySnake.g:2916:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=66 && LA21_0<=67)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGreedySnake.g:2917:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalGreedySnake.g:2917:4: ()
            	    // InternalGreedySnake.g:2918:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalGreedySnake.g:2924:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalGreedySnake.g:2925:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalGreedySnake.g:2925:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalGreedySnake.g:2926:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalGreedySnake.g:2926:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==66) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==67) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalGreedySnake.g:2927:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,66,FOLLOW_51); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalGreedySnake.g:2938:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,67,FOLLOW_51); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalGreedySnake.g:2951:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalGreedySnake.g:2952:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalGreedySnake.g:2952:5: (lv_right_3_0= rulePrimary )
            	    // InternalGreedySnake.g:2953:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_56);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalGreedySnake.g:2975:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalGreedySnake.g:2975:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalGreedySnake.g:2976:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalGreedySnake.g:2982:1: rulePrimary returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_IntLiteral_0 = null;

        EObject this_RealLiteral_1 = null;

        EObject this_Addition_3 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:2988:2: ( (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) ) )
            // InternalGreedySnake.g:2989:2: (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) )
            {
            // InternalGreedySnake.g:2989:2: (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==EOF||LA22_1==RULE_ID||LA22_1==13||LA22_1==25||(LA22_1>=44 && LA22_1<=45)||(LA22_1>=66 && LA22_1<=67)) ) {
                    alt22=1;
                }
                else if ( (LA22_1==41) ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt22=2;
                }
                break;
            case 24:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalGreedySnake.g:2990:3: this_IntLiteral_0= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:2999:3: this_RealLiteral_1= ruleRealLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getRealLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealLiteral_1=ruleRealLiteral();

                    state._fsp--;


                    			current = this_RealLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGreedySnake.g:3008:3: (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' )
                    {
                    // InternalGreedySnake.g:3008:3: (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' )
                    // InternalGreedySnake.g:3009:4: otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_51); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_19);
                    this_Addition_3=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalGreedySnake.g:3030:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalGreedySnake.g:3030:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalGreedySnake.g:3031:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalGreedySnake.g:3037:1: ruleIntLiteral returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:3043:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalGreedySnake.g:3044:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalGreedySnake.g:3044:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalGreedySnake.g:3045:3: (lv_val_0_0= RULE_INT )
            {
            // InternalGreedySnake.g:3045:3: (lv_val_0_0= RULE_INT )
            // InternalGreedySnake.g:3046:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalGreedySnake.g:3065:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalGreedySnake.g:3065:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalGreedySnake.g:3066:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
             newCompositeNode(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;

             current =iv_ruleRealLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalGreedySnake.g:3072:1: ruleRealLiteral returns [EObject current=null] : ( (lv_val_0_0= ruleREAL ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:3078:2: ( ( (lv_val_0_0= ruleREAL ) ) )
            // InternalGreedySnake.g:3079:2: ( (lv_val_0_0= ruleREAL ) )
            {
            // InternalGreedySnake.g:3079:2: ( (lv_val_0_0= ruleREAL ) )
            // InternalGreedySnake.g:3080:3: (lv_val_0_0= ruleREAL )
            {
            // InternalGreedySnake.g:3080:3: (lv_val_0_0= ruleREAL )
            // InternalGreedySnake.g:3081:4: lv_val_0_0= ruleREAL
            {

            				newCompositeNode(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_val_0_0=ruleREAL();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealLiteralRule());
            				}
            				set(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.xtext.example.mydsl2.group16.GreedySnake.REAL");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleREAL"
    // InternalGreedySnake.g:3101:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalGreedySnake.g:3103:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalGreedySnake.g:3104:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalGreedySnake.g:3113:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalGreedySnake.g:3120:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalGreedySnake.g:3121:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalGreedySnake.g:3121:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalGreedySnake.g:3122:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalGreedySnake.g:3122:3: (this_INT_0= RULE_INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGreedySnake.g:3123:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_36); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,41,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleOptionSpecification"
    // InternalGreedySnake.g:3150:1: entryRuleOptionSpecification returns [EObject current=null] : iv_ruleOptionSpecification= ruleOptionSpecification EOF ;
    public final EObject entryRuleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionSpecification = null;


        try {
            // InternalGreedySnake.g:3150:60: (iv_ruleOptionSpecification= ruleOptionSpecification EOF )
            // InternalGreedySnake.g:3151:2: iv_ruleOptionSpecification= ruleOptionSpecification EOF
            {
             newCompositeNode(grammarAccess.getOptionSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionSpecification=ruleOptionSpecification();

            state._fsp--;

             current =iv_ruleOptionSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionSpecification"


    // $ANTLR start "ruleOptionSpecification"
    // InternalGreedySnake.g:3157:1: ruleOptionSpecification returns [EObject current=null] : (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_RestartMenu_1= ruleRestartMenu ) ;
    public final EObject ruleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StartFieldDeclaration_0 = null;

        EObject this_RestartMenu_1 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:3163:2: ( (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_RestartMenu_1= ruleRestartMenu ) )
            // InternalGreedySnake.g:3164:2: (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_RestartMenu_1= ruleRestartMenu )
            {
            // InternalGreedySnake.g:3164:2: (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_RestartMenu_1= ruleRestartMenu )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==69) ) {
                alt24=1;
            }
            else if ( (LA24_0==68) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalGreedySnake.g:3165:3: this_StartFieldDeclaration_0= ruleStartFieldDeclaration
                    {

                    			newCompositeNode(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StartFieldDeclaration_0=ruleStartFieldDeclaration();

                    state._fsp--;


                    			current = this_StartFieldDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:3174:3: this_RestartMenu_1= ruleRestartMenu
                    {

                    			newCompositeNode(grammarAccess.getOptionSpecificationAccess().getRestartMenuParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RestartMenu_1=ruleRestartMenu();

                    state._fsp--;


                    			current = this_RestartMenu_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionSpecification"


    // $ANTLR start "entryRuleRestartMenu"
    // InternalGreedySnake.g:3186:1: entryRuleRestartMenu returns [EObject current=null] : iv_ruleRestartMenu= ruleRestartMenu EOF ;
    public final EObject entryRuleRestartMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestartMenu = null;


        try {
            // InternalGreedySnake.g:3186:52: (iv_ruleRestartMenu= ruleRestartMenu EOF )
            // InternalGreedySnake.g:3187:2: iv_ruleRestartMenu= ruleRestartMenu EOF
            {
             newCompositeNode(grammarAccess.getRestartMenuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestartMenu=ruleRestartMenu();

            state._fsp--;

             current =iv_ruleRestartMenu; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestartMenu"


    // $ANTLR start "ruleRestartMenu"
    // InternalGreedySnake.g:3193:1: ruleRestartMenu returns [EObject current=null] : (otherlv_0= 'restartGame' () ) ;
    public final EObject ruleRestartMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:3199:2: ( (otherlv_0= 'restartGame' () ) )
            // InternalGreedySnake.g:3200:2: (otherlv_0= 'restartGame' () )
            {
            // InternalGreedySnake.g:3200:2: (otherlv_0= 'restartGame' () )
            // InternalGreedySnake.g:3201:3: otherlv_0= 'restartGame' ()
            {
            otherlv_0=(Token)match(input,68,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getRestartMenuAccess().getRestartGameKeyword_0());
            		
            // InternalGreedySnake.g:3205:3: ()
            // InternalGreedySnake.g:3206:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRestartMenuAccess().getRestartMenuAction_1(),
            					current);
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestartMenu"


    // $ANTLR start "entryRuleStartFieldDeclaration"
    // InternalGreedySnake.g:3216:1: entryRuleStartFieldDeclaration returns [EObject current=null] : iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF ;
    public final EObject entryRuleStartFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartFieldDeclaration = null;


        try {
            // InternalGreedySnake.g:3216:62: (iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF )
            // InternalGreedySnake.g:3217:2: iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStartFieldDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartFieldDeclaration=ruleStartFieldDeclaration();

            state._fsp--;

             current =iv_ruleStartFieldDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStartFieldDeclaration"


    // $ANTLR start "ruleStartFieldDeclaration"
    // InternalGreedySnake.g:3223:1: ruleStartFieldDeclaration returns [EObject current=null] : (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleStartFieldDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:3229:2: ( (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalGreedySnake.g:3230:2: (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalGreedySnake.g:3230:2: (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // InternalGreedySnake.g:3231:3: otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1());
            		
            // InternalGreedySnake.g:3239:3: ( (otherlv_2= RULE_ID ) )
            // InternalGreedySnake.g:3240:4: (otherlv_2= RULE_ID )
            {
            // InternalGreedySnake.g:3240:4: (otherlv_2= RULE_ID )
            // InternalGreedySnake.g:3241:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartFieldDeclarationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getStartFieldDeclarationAccess().getFieldGlobalFieldInitialisationCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStartFieldDeclaration"


    // $ANTLR start "entryRuleAboutSpecification"
    // InternalGreedySnake.g:3256:1: entryRuleAboutSpecification returns [EObject current=null] : iv_ruleAboutSpecification= ruleAboutSpecification EOF ;
    public final EObject entryRuleAboutSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAboutSpecification = null;


        try {
            // InternalGreedySnake.g:3256:59: (iv_ruleAboutSpecification= ruleAboutSpecification EOF )
            // InternalGreedySnake.g:3257:2: iv_ruleAboutSpecification= ruleAboutSpecification EOF
            {
             newCompositeNode(grammarAccess.getAboutSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAboutSpecification=ruleAboutSpecification();

            state._fsp--;

             current =iv_ruleAboutSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAboutSpecification"


    // $ANTLR start "ruleAboutSpecification"
    // InternalGreedySnake.g:3263:1: ruleAboutSpecification returns [EObject current=null] : (otherlv_0= 'about' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_AboutTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_AboutInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}' ) ;
    public final EObject ruleAboutSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_AboutTitle_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_AboutInfor_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_x_12_0=null;
        Token otherlv_13=null;
        Token lv_y_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:3269:2: ( (otherlv_0= 'about' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_AboutTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_AboutInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}' ) )
            // InternalGreedySnake.g:3270:2: (otherlv_0= 'about' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_AboutTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_AboutInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}' )
            {
            // InternalGreedySnake.g:3270:2: (otherlv_0= 'about' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_AboutTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_AboutInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}' )
            // InternalGreedySnake.g:3271:3: otherlv_0= 'about' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_AboutTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_AboutInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAboutSpecificationAccess().getAboutKeyword_0());
            		
            // InternalGreedySnake.g:3275:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:3276:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:3276:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:3277:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAboutSpecificationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAboutSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getAboutSpecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,71,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getAboutSpecificationAccess().getTitleKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getAboutSpecificationAccess().getColonKeyword_4());
            		
            // InternalGreedySnake.g:3305:3: ( (lv_AboutTitle_5_0= RULE_STRING ) )
            // InternalGreedySnake.g:3306:4: (lv_AboutTitle_5_0= RULE_STRING )
            {
            // InternalGreedySnake.g:3306:4: (lv_AboutTitle_5_0= RULE_STRING )
            // InternalGreedySnake.g:3307:5: lv_AboutTitle_5_0= RULE_STRING
            {
            lv_AboutTitle_5_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

            					newLeafNode(lv_AboutTitle_5_0, grammarAccess.getAboutSpecificationAccess().getAboutTitleSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAboutSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"AboutTitle",
            						lv_AboutTitle_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,72,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getAboutSpecificationAccess().getInformationKeyword_6());
            		
            otherlv_7=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getAboutSpecificationAccess().getColonKeyword_7());
            		
            // InternalGreedySnake.g:3331:3: ( (lv_AboutInfor_8_0= RULE_STRING ) )
            // InternalGreedySnake.g:3332:4: (lv_AboutInfor_8_0= RULE_STRING )
            {
            // InternalGreedySnake.g:3332:4: (lv_AboutInfor_8_0= RULE_STRING )
            // InternalGreedySnake.g:3333:5: lv_AboutInfor_8_0= RULE_STRING
            {
            lv_AboutInfor_8_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

            					newLeafNode(lv_AboutInfor_8_0, grammarAccess.getAboutSpecificationAccess().getAboutInforSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAboutSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"AboutInfor",
            						lv_AboutInfor_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,73,FOLLOW_21); 

            			newLeafNode(otherlv_9, grammarAccess.getAboutSpecificationAccess().getLabel_sizeKeyword_9());
            		
            otherlv_10=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getAboutSpecificationAccess().getColonKeyword_10());
            		
            otherlv_11=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getAboutSpecificationAccess().getLeftParenthesisKeyword_11());
            		
            // InternalGreedySnake.g:3361:3: ( (lv_x_12_0= RULE_INT ) )
            // InternalGreedySnake.g:3362:4: (lv_x_12_0= RULE_INT )
            {
            // InternalGreedySnake.g:3362:4: (lv_x_12_0= RULE_INT )
            // InternalGreedySnake.g:3363:5: lv_x_12_0= RULE_INT
            {
            lv_x_12_0=(Token)match(input,RULE_INT,FOLLOW_40); 

            					newLeafNode(lv_x_12_0, grammarAccess.getAboutSpecificationAccess().getXINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAboutSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_12_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_13=(Token)match(input,49,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getAboutSpecificationAccess().getCommaKeyword_13());
            		
            // InternalGreedySnake.g:3383:3: ( (lv_y_14_0= RULE_INT ) )
            // InternalGreedySnake.g:3384:4: (lv_y_14_0= RULE_INT )
            {
            // InternalGreedySnake.g:3384:4: (lv_y_14_0= RULE_INT )
            // InternalGreedySnake.g:3385:5: lv_y_14_0= RULE_INT
            {
            lv_y_14_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_y_14_0, grammarAccess.getAboutSpecificationAccess().getYINTTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAboutSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_14_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_15=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_15, grammarAccess.getAboutSpecificationAccess().getRightParenthesisKeyword_15());
            		
            otherlv_16=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getAboutSpecificationAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAboutSpecification"


    // $ANTLR start "entryRuleHelpSpecification"
    // InternalGreedySnake.g:3413:1: entryRuleHelpSpecification returns [EObject current=null] : iv_ruleHelpSpecification= ruleHelpSpecification EOF ;
    public final EObject entryRuleHelpSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelpSpecification = null;


        try {
            // InternalGreedySnake.g:3413:58: (iv_ruleHelpSpecification= ruleHelpSpecification EOF )
            // InternalGreedySnake.g:3414:2: iv_ruleHelpSpecification= ruleHelpSpecification EOF
            {
             newCompositeNode(grammarAccess.getHelpSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHelpSpecification=ruleHelpSpecification();

            state._fsp--;

             current =iv_ruleHelpSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHelpSpecification"


    // $ANTLR start "ruleHelpSpecification"
    // InternalGreedySnake.g:3420:1: ruleHelpSpecification returns [EObject current=null] : (otherlv_0= 'help' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_HelpTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_HelpInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}' ) ;
    public final EObject ruleHelpSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_HelpTitle_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_HelpInfor_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_x_12_0=null;
        Token otherlv_13=null;
        Token lv_y_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:3426:2: ( (otherlv_0= 'help' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_HelpTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_HelpInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}' ) )
            // InternalGreedySnake.g:3427:2: (otherlv_0= 'help' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_HelpTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_HelpInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}' )
            {
            // InternalGreedySnake.g:3427:2: (otherlv_0= 'help' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_HelpTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_HelpInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}' )
            // InternalGreedySnake.g:3428:3: otherlv_0= 'help' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_HelpTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_HelpInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHelpSpecificationAccess().getHelpKeyword_0());
            		
            // InternalGreedySnake.g:3432:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:3433:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:3433:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:3434:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getHelpSpecificationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHelpSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getHelpSpecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,71,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getHelpSpecificationAccess().getTitleKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getHelpSpecificationAccess().getColonKeyword_4());
            		
            // InternalGreedySnake.g:3462:3: ( (lv_HelpTitle_5_0= RULE_STRING ) )
            // InternalGreedySnake.g:3463:4: (lv_HelpTitle_5_0= RULE_STRING )
            {
            // InternalGreedySnake.g:3463:4: (lv_HelpTitle_5_0= RULE_STRING )
            // InternalGreedySnake.g:3464:5: lv_HelpTitle_5_0= RULE_STRING
            {
            lv_HelpTitle_5_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

            					newLeafNode(lv_HelpTitle_5_0, grammarAccess.getHelpSpecificationAccess().getHelpTitleSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHelpSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"HelpTitle",
            						lv_HelpTitle_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,72,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getHelpSpecificationAccess().getInformationKeyword_6());
            		
            otherlv_7=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getHelpSpecificationAccess().getColonKeyword_7());
            		
            // InternalGreedySnake.g:3488:3: ( (lv_HelpInfor_8_0= RULE_STRING ) )
            // InternalGreedySnake.g:3489:4: (lv_HelpInfor_8_0= RULE_STRING )
            {
            // InternalGreedySnake.g:3489:4: (lv_HelpInfor_8_0= RULE_STRING )
            // InternalGreedySnake.g:3490:5: lv_HelpInfor_8_0= RULE_STRING
            {
            lv_HelpInfor_8_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

            					newLeafNode(lv_HelpInfor_8_0, grammarAccess.getHelpSpecificationAccess().getHelpInforSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHelpSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"HelpInfor",
            						lv_HelpInfor_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,73,FOLLOW_21); 

            			newLeafNode(otherlv_9, grammarAccess.getHelpSpecificationAccess().getLabel_sizeKeyword_9());
            		
            otherlv_10=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getHelpSpecificationAccess().getColonKeyword_10());
            		
            otherlv_11=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getHelpSpecificationAccess().getLeftParenthesisKeyword_11());
            		
            // InternalGreedySnake.g:3518:3: ( (lv_x_12_0= RULE_INT ) )
            // InternalGreedySnake.g:3519:4: (lv_x_12_0= RULE_INT )
            {
            // InternalGreedySnake.g:3519:4: (lv_x_12_0= RULE_INT )
            // InternalGreedySnake.g:3520:5: lv_x_12_0= RULE_INT
            {
            lv_x_12_0=(Token)match(input,RULE_INT,FOLLOW_40); 

            					newLeafNode(lv_x_12_0, grammarAccess.getHelpSpecificationAccess().getXINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHelpSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_12_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_13=(Token)match(input,49,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getHelpSpecificationAccess().getCommaKeyword_13());
            		
            // InternalGreedySnake.g:3540:3: ( (lv_y_14_0= RULE_INT ) )
            // InternalGreedySnake.g:3541:4: (lv_y_14_0= RULE_INT )
            {
            // InternalGreedySnake.g:3541:4: (lv_y_14_0= RULE_INT )
            // InternalGreedySnake.g:3542:5: lv_y_14_0= RULE_INT
            {
            lv_y_14_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_y_14_0, grammarAccess.getHelpSpecificationAccess().getYINTTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHelpSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_14_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_15=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_15, grammarAccess.getHelpSpecificationAccess().getRightParenthesisKeyword_15());
            		
            otherlv_16=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getHelpSpecificationAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHelpSpecification"


    // $ANTLR start "entryRuleBackSpecification"
    // InternalGreedySnake.g:3570:1: entryRuleBackSpecification returns [EObject current=null] : iv_ruleBackSpecification= ruleBackSpecification EOF ;
    public final EObject entryRuleBackSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackSpecification = null;


        try {
            // InternalGreedySnake.g:3570:58: (iv_ruleBackSpecification= ruleBackSpecification EOF )
            // InternalGreedySnake.g:3571:2: iv_ruleBackSpecification= ruleBackSpecification EOF
            {
             newCompositeNode(grammarAccess.getBackSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackSpecification=ruleBackSpecification();

            state._fsp--;

             current =iv_ruleBackSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBackSpecification"


    // $ANTLR start "ruleBackSpecification"
    // InternalGreedySnake.g:3577:1: ruleBackSpecification returns [EObject current=null] : (otherlv_0= 'backGround' otherlv_1= '{' otherlv_2= 'Icon' otherlv_3= '{' ( (lv_BackgroundIcon_4_0= ruleBackgroundIcon ) ) otherlv_5= '}' otherlv_6= 'Height' otherlv_7= '=' ( (lv_BackGroundHeight_8_0= RULE_INT ) ) otherlv_9= 'Width' otherlv_10= '=' ( (lv_BackGroundWidth_11_0= RULE_INT ) ) otherlv_12= '}' ) ;
    public final EObject ruleBackSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_BackGroundHeight_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_BackGroundWidth_11_0=null;
        Token otherlv_12=null;
        EObject lv_BackgroundIcon_4_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:3583:2: ( (otherlv_0= 'backGround' otherlv_1= '{' otherlv_2= 'Icon' otherlv_3= '{' ( (lv_BackgroundIcon_4_0= ruleBackgroundIcon ) ) otherlv_5= '}' otherlv_6= 'Height' otherlv_7= '=' ( (lv_BackGroundHeight_8_0= RULE_INT ) ) otherlv_9= 'Width' otherlv_10= '=' ( (lv_BackGroundWidth_11_0= RULE_INT ) ) otherlv_12= '}' ) )
            // InternalGreedySnake.g:3584:2: (otherlv_0= 'backGround' otherlv_1= '{' otherlv_2= 'Icon' otherlv_3= '{' ( (lv_BackgroundIcon_4_0= ruleBackgroundIcon ) ) otherlv_5= '}' otherlv_6= 'Height' otherlv_7= '=' ( (lv_BackGroundHeight_8_0= RULE_INT ) ) otherlv_9= 'Width' otherlv_10= '=' ( (lv_BackGroundWidth_11_0= RULE_INT ) ) otherlv_12= '}' )
            {
            // InternalGreedySnake.g:3584:2: (otherlv_0= 'backGround' otherlv_1= '{' otherlv_2= 'Icon' otherlv_3= '{' ( (lv_BackgroundIcon_4_0= ruleBackgroundIcon ) ) otherlv_5= '}' otherlv_6= 'Height' otherlv_7= '=' ( (lv_BackGroundHeight_8_0= RULE_INT ) ) otherlv_9= 'Width' otherlv_10= '=' ( (lv_BackGroundWidth_11_0= RULE_INT ) ) otherlv_12= '}' )
            // InternalGreedySnake.g:3585:3: otherlv_0= 'backGround' otherlv_1= '{' otherlv_2= 'Icon' otherlv_3= '{' ( (lv_BackgroundIcon_4_0= ruleBackgroundIcon ) ) otherlv_5= '}' otherlv_6= 'Height' otherlv_7= '=' ( (lv_BackGroundHeight_8_0= RULE_INT ) ) otherlv_9= 'Width' otherlv_10= '=' ( (lv_BackGroundWidth_11_0= RULE_INT ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBackSpecificationAccess().getBackGroundKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getBackSpecificationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,76,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBackSpecificationAccess().getIconKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getBackSpecificationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGreedySnake.g:3601:3: ( (lv_BackgroundIcon_4_0= ruleBackgroundIcon ) )
            // InternalGreedySnake.g:3602:4: (lv_BackgroundIcon_4_0= ruleBackgroundIcon )
            {
            // InternalGreedySnake.g:3602:4: (lv_BackgroundIcon_4_0= ruleBackgroundIcon )
            // InternalGreedySnake.g:3603:5: lv_BackgroundIcon_4_0= ruleBackgroundIcon
            {

            					newCompositeNode(grammarAccess.getBackSpecificationAccess().getBackgroundIconBackgroundIconParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_BackgroundIcon_4_0=ruleBackgroundIcon();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackSpecificationRule());
            					}
            					set(
            						current,
            						"BackgroundIcon",
            						lv_BackgroundIcon_4_0,
            						"org.xtext.example.mydsl2.group16.GreedySnake.BackgroundIcon");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_61); 

            			newLeafNode(otherlv_5, grammarAccess.getBackSpecificationAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,77,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getBackSpecificationAccess().getHeightKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getBackSpecificationAccess().getEqualsSignKeyword_7());
            		
            // InternalGreedySnake.g:3632:3: ( (lv_BackGroundHeight_8_0= RULE_INT ) )
            // InternalGreedySnake.g:3633:4: (lv_BackGroundHeight_8_0= RULE_INT )
            {
            // InternalGreedySnake.g:3633:4: (lv_BackGroundHeight_8_0= RULE_INT )
            // InternalGreedySnake.g:3634:5: lv_BackGroundHeight_8_0= RULE_INT
            {
            lv_BackGroundHeight_8_0=(Token)match(input,RULE_INT,FOLLOW_62); 

            					newLeafNode(lv_BackGroundHeight_8_0, grammarAccess.getBackSpecificationAccess().getBackGroundHeightINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBackSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"BackGroundHeight",
            						lv_BackGroundHeight_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,78,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getBackSpecificationAccess().getWidthKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getBackSpecificationAccess().getEqualsSignKeyword_10());
            		
            // InternalGreedySnake.g:3658:3: ( (lv_BackGroundWidth_11_0= RULE_INT ) )
            // InternalGreedySnake.g:3659:4: (lv_BackGroundWidth_11_0= RULE_INT )
            {
            // InternalGreedySnake.g:3659:4: (lv_BackGroundWidth_11_0= RULE_INT )
            // InternalGreedySnake.g:3660:5: lv_BackGroundWidth_11_0= RULE_INT
            {
            lv_BackGroundWidth_11_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_BackGroundWidth_11_0, grammarAccess.getBackSpecificationAccess().getBackGroundWidthINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBackSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"BackGroundWidth",
            						lv_BackGroundWidth_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getBackSpecificationAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBackSpecification"


    // $ANTLR start "entryRuleBackgroundIcon"
    // InternalGreedySnake.g:3684:1: entryRuleBackgroundIcon returns [EObject current=null] : iv_ruleBackgroundIcon= ruleBackgroundIcon EOF ;
    public final EObject entryRuleBackgroundIcon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackgroundIcon = null;


        try {
            // InternalGreedySnake.g:3684:55: (iv_ruleBackgroundIcon= ruleBackgroundIcon EOF )
            // InternalGreedySnake.g:3685:2: iv_ruleBackgroundIcon= ruleBackgroundIcon EOF
            {
             newCompositeNode(grammarAccess.getBackgroundIconRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackgroundIcon=ruleBackgroundIcon();

            state._fsp--;

             current =iv_ruleBackgroundIcon; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBackgroundIcon"


    // $ANTLR start "ruleBackgroundIcon"
    // InternalGreedySnake.g:3691:1: ruleBackgroundIcon returns [EObject current=null] : ( () ( (lv_BackgroundTag_1_0= ruleBackgroundTag ) )* ) ;
    public final EObject ruleBackgroundIcon() throws RecognitionException {
        EObject current = null;

        EObject lv_BackgroundTag_1_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:3697:2: ( ( () ( (lv_BackgroundTag_1_0= ruleBackgroundTag ) )* ) )
            // InternalGreedySnake.g:3698:2: ( () ( (lv_BackgroundTag_1_0= ruleBackgroundTag ) )* )
            {
            // InternalGreedySnake.g:3698:2: ( () ( (lv_BackgroundTag_1_0= ruleBackgroundTag ) )* )
            // InternalGreedySnake.g:3699:3: () ( (lv_BackgroundTag_1_0= ruleBackgroundTag ) )*
            {
            // InternalGreedySnake.g:3699:3: ()
            // InternalGreedySnake.g:3700:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBackgroundIconAccess().getBackgroundIconAction_0(),
            					current);
            			

            }

            // InternalGreedySnake.g:3706:3: ( (lv_BackgroundTag_1_0= ruleBackgroundTag ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGreedySnake.g:3707:4: (lv_BackgroundTag_1_0= ruleBackgroundTag )
            	    {
            	    // InternalGreedySnake.g:3707:4: (lv_BackgroundTag_1_0= ruleBackgroundTag )
            	    // InternalGreedySnake.g:3708:5: lv_BackgroundTag_1_0= ruleBackgroundTag
            	    {

            	    					newCompositeNode(grammarAccess.getBackgroundIconAccess().getBackgroundTagBackgroundTagParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_BackgroundTag_1_0=ruleBackgroundTag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBackgroundIconRule());
            	    					}
            	    					add(
            	    						current,
            	    						"BackgroundTag",
            	    						lv_BackgroundTag_1_0,
            	    						"org.xtext.example.mydsl2.group16.GreedySnake.BackgroundTag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBackgroundIcon"


    // $ANTLR start "entryRuleBackgroundTag"
    // InternalGreedySnake.g:3729:1: entryRuleBackgroundTag returns [EObject current=null] : iv_ruleBackgroundTag= ruleBackgroundTag EOF ;
    public final EObject entryRuleBackgroundTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackgroundTag = null;


        try {
            // InternalGreedySnake.g:3729:54: (iv_ruleBackgroundTag= ruleBackgroundTag EOF )
            // InternalGreedySnake.g:3730:2: iv_ruleBackgroundTag= ruleBackgroundTag EOF
            {
             newCompositeNode(grammarAccess.getBackgroundTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackgroundTag=ruleBackgroundTag();

            state._fsp--;

             current =iv_ruleBackgroundTag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBackgroundTag"


    // $ANTLR start "ruleBackgroundTag"
    // InternalGreedySnake.g:3736:1: ruleBackgroundTag returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_BKtag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_locate_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleBackgroundTag() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_BKtag_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_locate_6_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:3742:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_BKtag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_locate_6_0= RULE_STRING ) ) ) )
            // InternalGreedySnake.g:3743:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_BKtag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_locate_6_0= RULE_STRING ) ) )
            {
            // InternalGreedySnake.g:3743:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_BKtag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_locate_6_0= RULE_STRING ) ) )
            // InternalGreedySnake.g:3744:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_BKtag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_locate_6_0= RULE_STRING ) )
            {
            // InternalGreedySnake.g:3744:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreedySnake.g:3745:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreedySnake.g:3745:4: (lv_name_0_0= RULE_ID )
            // InternalGreedySnake.g:3746:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBackgroundTagAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBackgroundTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGreedySnake.g:3762:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalGreedySnake.g:3763:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalGreedySnake.g:3763:4: (lv_value_1_0= RULE_STRING )
            // InternalGreedySnake.g:3764:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_value_1_0, grammarAccess.getBackgroundTagAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBackgroundTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getBackgroundTagAccess().getEqualsSignKeyword_2());
            		
            // InternalGreedySnake.g:3784:3: ( (lv_BKtag_3_0= RULE_INT ) )
            // InternalGreedySnake.g:3785:4: (lv_BKtag_3_0= RULE_INT )
            {
            // InternalGreedySnake.g:3785:4: (lv_BKtag_3_0= RULE_INT )
            // InternalGreedySnake.g:3786:5: lv_BKtag_3_0= RULE_INT
            {
            lv_BKtag_3_0=(Token)match(input,RULE_INT,FOLLOW_45); 

            					newLeafNode(lv_BKtag_3_0, grammarAccess.getBackgroundTagAccess().getBKtagINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBackgroundTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"BKtag",
            						lv_BKtag_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,54,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getBackgroundTagAccess().getLocateKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getBackgroundTagAccess().getColonKeyword_5());
            		
            // InternalGreedySnake.g:3810:3: ( (lv_locate_6_0= RULE_STRING ) )
            // InternalGreedySnake.g:3811:4: (lv_locate_6_0= RULE_STRING )
            {
            // InternalGreedySnake.g:3811:4: (lv_locate_6_0= RULE_STRING )
            // InternalGreedySnake.g:3812:5: lv_locate_6_0= RULE_STRING
            {
            lv_locate_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_locate_6_0, grammarAccess.getBackgroundTagAccess().getLocateSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBackgroundTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"locate",
            						lv_locate_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBackgroundTag"


    // $ANTLR start "entryRuleMusicSpecification"
    // InternalGreedySnake.g:3832:1: entryRuleMusicSpecification returns [EObject current=null] : iv_ruleMusicSpecification= ruleMusicSpecification EOF ;
    public final EObject entryRuleMusicSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMusicSpecification = null;


        try {
            // InternalGreedySnake.g:3832:59: (iv_ruleMusicSpecification= ruleMusicSpecification EOF )
            // InternalGreedySnake.g:3833:2: iv_ruleMusicSpecification= ruleMusicSpecification EOF
            {
             newCompositeNode(grammarAccess.getMusicSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMusicSpecification=ruleMusicSpecification();

            state._fsp--;

             current =iv_ruleMusicSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMusicSpecification"


    // $ANTLR start "ruleMusicSpecification"
    // InternalGreedySnake.g:3839:1: ruleMusicSpecification returns [EObject current=null] : (otherlv_0= 'Music' otherlv_1= '{' otherlv_2= 'BufferSize' otherlv_3= '=' ( (lv_buffersize_4_0= RULE_INT ) ) ( (lv_MusicPath_5_0= ruleMusicPath ) )* otherlv_6= '}' ) ;
    public final EObject ruleMusicSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_buffersize_4_0=null;
        Token otherlv_6=null;
        EObject lv_MusicPath_5_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:3845:2: ( (otherlv_0= 'Music' otherlv_1= '{' otherlv_2= 'BufferSize' otherlv_3= '=' ( (lv_buffersize_4_0= RULE_INT ) ) ( (lv_MusicPath_5_0= ruleMusicPath ) )* otherlv_6= '}' ) )
            // InternalGreedySnake.g:3846:2: (otherlv_0= 'Music' otherlv_1= '{' otherlv_2= 'BufferSize' otherlv_3= '=' ( (lv_buffersize_4_0= RULE_INT ) ) ( (lv_MusicPath_5_0= ruleMusicPath ) )* otherlv_6= '}' )
            {
            // InternalGreedySnake.g:3846:2: (otherlv_0= 'Music' otherlv_1= '{' otherlv_2= 'BufferSize' otherlv_3= '=' ( (lv_buffersize_4_0= RULE_INT ) ) ( (lv_MusicPath_5_0= ruleMusicPath ) )* otherlv_6= '}' )
            // InternalGreedySnake.g:3847:3: otherlv_0= 'Music' otherlv_1= '{' otherlv_2= 'BufferSize' otherlv_3= '=' ( (lv_buffersize_4_0= RULE_INT ) ) ( (lv_MusicPath_5_0= ruleMusicPath ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMusicSpecificationAccess().getMusicKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_1, grammarAccess.getMusicSpecificationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,80,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMusicSpecificationAccess().getBufferSizeKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getMusicSpecificationAccess().getEqualsSignKeyword_3());
            		
            // InternalGreedySnake.g:3863:3: ( (lv_buffersize_4_0= RULE_INT ) )
            // InternalGreedySnake.g:3864:4: (lv_buffersize_4_0= RULE_INT )
            {
            // InternalGreedySnake.g:3864:4: (lv_buffersize_4_0= RULE_INT )
            // InternalGreedySnake.g:3865:5: lv_buffersize_4_0= RULE_INT
            {
            lv_buffersize_4_0=(Token)match(input,RULE_INT,FOLLOW_32); 

            					newLeafNode(lv_buffersize_4_0, grammarAccess.getMusicSpecificationAccess().getBuffersizeINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMusicSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"buffersize",
            						lv_buffersize_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGreedySnake.g:3881:3: ( (lv_MusicPath_5_0= ruleMusicPath ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGreedySnake.g:3882:4: (lv_MusicPath_5_0= ruleMusicPath )
            	    {
            	    // InternalGreedySnake.g:3882:4: (lv_MusicPath_5_0= ruleMusicPath )
            	    // InternalGreedySnake.g:3883:5: lv_MusicPath_5_0= ruleMusicPath
            	    {

            	    					newCompositeNode(grammarAccess.getMusicSpecificationAccess().getMusicPathMusicPathParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_MusicPath_5_0=ruleMusicPath();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMusicSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"MusicPath",
            	    						lv_MusicPath_5_0,
            	    						"org.xtext.example.mydsl2.group16.GreedySnake.MusicPath");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMusicSpecificationAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMusicSpecification"


    // $ANTLR start "entryRuleMusicPath"
    // InternalGreedySnake.g:3908:1: entryRuleMusicPath returns [EObject current=null] : iv_ruleMusicPath= ruleMusicPath EOF ;
    public final EObject entryRuleMusicPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMusicPath = null;


        try {
            // InternalGreedySnake.g:3908:50: (iv_ruleMusicPath= ruleMusicPath EOF )
            // InternalGreedySnake.g:3909:2: iv_ruleMusicPath= ruleMusicPath EOF
            {
             newCompositeNode(grammarAccess.getMusicPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMusicPath=ruleMusicPath();

            state._fsp--;

             current =iv_ruleMusicPath; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMusicPath"


    // $ANTLR start "ruleMusicPath"
    // InternalGreedySnake.g:3915:1: ruleMusicPath returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'path' otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleMusicPath() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:3921:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'path' otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) ) ) )
            // InternalGreedySnake.g:3922:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'path' otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) ) )
            {
            // InternalGreedySnake.g:3922:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'path' otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) ) )
            // InternalGreedySnake.g:3923:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'path' otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) )
            {
            // InternalGreedySnake.g:3923:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreedySnake.g:3924:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreedySnake.g:3924:4: (lv_name_0_0= RULE_ID )
            // InternalGreedySnake.g:3925:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_64); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMusicPathAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMusicPathRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,81,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMusicPathAccess().getPathKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMusicPathAccess().getEqualsSignKeyword_2());
            		
            // InternalGreedySnake.g:3949:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalGreedySnake.g:3950:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalGreedySnake.g:3950:4: (lv_path_3_0= RULE_STRING )
            // InternalGreedySnake.g:3951:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_path_3_0, grammarAccess.getMusicPathAccess().getPathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMusicPathRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMusicPath"


    // $ANTLR start "ruleDirection"
    // InternalGreedySnake.g:3971:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'UP' ) | (enumLiteral_3= 'DOWN' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:3977:2: ( ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'UP' ) | (enumLiteral_3= 'DOWN' ) ) )
            // InternalGreedySnake.g:3978:2: ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'UP' ) | (enumLiteral_3= 'DOWN' ) )
            {
            // InternalGreedySnake.g:3978:2: ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'UP' ) | (enumLiteral_3= 'DOWN' ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt27=1;
                }
                break;
            case 83:
                {
                alt27=2;
                }
                break;
            case 84:
                {
                alt27=3;
                }
                break;
            case 85:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalGreedySnake.g:3979:3: (enumLiteral_0= 'LEFT' )
                    {
                    // InternalGreedySnake.g:3979:3: (enumLiteral_0= 'LEFT' )
                    // InternalGreedySnake.g:3980:4: enumLiteral_0= 'LEFT'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:3987:3: (enumLiteral_1= 'RIGHT' )
                    {
                    // InternalGreedySnake.g:3987:3: (enumLiteral_1= 'RIGHT' )
                    // InternalGreedySnake.g:3988:4: enumLiteral_1= 'RIGHT'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getRIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGreedySnake.g:3995:3: (enumLiteral_2= 'UP' )
                    {
                    // InternalGreedySnake.g:3995:3: (enumLiteral_2= 'UP' )
                    // InternalGreedySnake.g:3996:4: enumLiteral_2= 'UP'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getUPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getUPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGreedySnake.g:4003:3: (enumLiteral_3= 'DOWN' )
                    {
                    // InternalGreedySnake.g:4003:3: (enumLiteral_3= 'DOWN' )
                    // InternalGreedySnake.g:4004:4: enumLiteral_3= 'DOWN'
                    {
                    enumLiteral_3=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getDOWNEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectionAccess().getDOWNEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirection"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\4\17\uffff";
    static final String dfa_3s = "\1\117\1\uffff\1\46\17\uffff";
    static final String dfa_4s = "\1\uffff\1\20\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\10\1\1";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\10\uffff\1\1\1\10\1\uffff\1\16\20\uffff\1\2\1\3\1\4\1\6\1\5\32\uffff\1\7\1\12\2\uffff\2\17\1\11\3\uffff\1\13\1\15\3\uffff\1\14",
            "",
            "\1\21\41\uffff\1\20",
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
            return "()+ loopback of 106:3: ( ( (lv_snakes_3_0= ruleInitialSnakeSpecificatin ) ) | ( (lv_foods_4_0= ruleInitialFoodSpecificatin ) ) | ( (lv_obstacles_5_0= ruleInitialObstacleSpecificatin ) ) | ( (lv_speed_6_0= ruleInitialSpeedSpecification ) ) | ( (lv_fire_7_0= ruleInitialFireSpecification ) ) | ( (lv_time_8_0= ruleTimeLimited ) ) | ( (lv_Map_9_0= ruleGlobalMap ) ) | ( (lv_SnakeMove_10_0= ruleSnakeMoveSpecification ) ) | ( (lv_about_11_0= ruleAboutSpecification ) ) | ( (lv_directions_12_0= ruleDirectionSpecification ) ) | ( (lv_Help_13_0= ruleHelpSpecification ) ) | ( (lv_Music_14_0= ruleMusicSpecification ) ) | ( (lv_Backgrounds_15_0= ruleBackSpecification ) ) | ( (lv_fields_16_0= ruleGlobalFieldInitialisation ) ) | ( (lv_options_17_0= ruleOptionSpecification ) ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000003E00014010L,0x0000000000008C73L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000003E00016010L,0x0000000000008C73L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000020001000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});

}
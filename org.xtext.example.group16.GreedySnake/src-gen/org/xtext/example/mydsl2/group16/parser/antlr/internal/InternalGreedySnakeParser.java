package org.xtext.example.mydsl2.group16.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'{'", "'}'", "'Filepath'", "'='", "'field'", "'Panel_width'", "'Panel_Height'", "'column'", "'row'", "'label_width'", "'label_Height'", "'init'", "'('", "')'", "'Default'", "':'", "'snakeLength'", "'Score'", "'Time'", "'Amount'", "'Weapon'", "'snake'", "'food'", "'obstacle'", "'fire'", "'Speed'", "'FireIcon'", "'Icon_size'", "'head'", "','", "'headIcon'", "'BodyIcon'", "'defaultSpeed'", "'snakeTag'", "'Locate'", "'foodIcon'", "'foodKind'", "'randomFoodSize'", "'foodTag'", "'point'", "'ObstacleIcon'", "'ObstacleTag'", "'Maxsize'", "'Minsize'", "'timeLimited'", "'int'", "'String'", "'Behaviour'", "'+'", "'-'", "'*'", "'/'", "'.'", "'restartGame'", "'start'", "'about'", "'Title'", "'Information'", "'Label_size'", "'help'", "'backGround'", "'Icon'", "'Height'", "'Width'", "'Music'", "'BufferSize'", "'path'"
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
    // InternalGreedySnake.g:64:1: entryRuleGreedySnake returns [EObject current=null] : iv_ruleGreedySnake= ruleGreedySnake EOF ;
    public final EObject entryRuleGreedySnake() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreedySnake = null;


        try {
            // InternalGreedySnake.g:64:52: (iv_ruleGreedySnake= ruleGreedySnake EOF )
            // InternalGreedySnake.g:65:2: iv_ruleGreedySnake= ruleGreedySnake EOF
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
    // InternalGreedySnake.g:71:1: ruleGreedySnake returns [EObject current=null] : (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_snakes_3_0= ruleInitialSnakeSpecificatin ) ) | ( (lv_foods_4_0= ruleInitialFoodSpecificatin ) ) | ( (lv_obstacles_5_0= ruleInitialObstacleSpecificatin ) ) | ( (lv_speed_6_0= ruleInitialSpeedSpecification ) ) | ( (lv_fire_7_0= ruleInitialFireSpecification ) ) | ( (lv_time_8_0= ruleTimeLimited ) ) | ( (lv_Map_9_0= ruleGlobalMap ) ) | ( (lv_about_10_0= ruleAboutSpecification ) ) | ( (lv_Help_11_0= ruleHelpSpecification ) ) | ( (lv_Music_12_0= ruleMusicSpecification ) ) | ( (lv_Backgrounds_13_0= ruleBackSpecification ) ) | ( (lv_fields_14_0= ruleGlobalFieldInitialisation ) ) | ( (lv_options_15_0= ruleOptionSpecification ) ) )+ otherlv_16= '}' ) ;
    public final EObject ruleGreedySnake() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_16=null;
        EObject lv_snakes_3_0 = null;

        EObject lv_foods_4_0 = null;

        EObject lv_obstacles_5_0 = null;

        EObject lv_speed_6_0 = null;

        EObject lv_fire_7_0 = null;

        EObject lv_time_8_0 = null;

        EObject lv_Map_9_0 = null;

        EObject lv_about_10_0 = null;

        EObject lv_Help_11_0 = null;

        EObject lv_Music_12_0 = null;

        EObject lv_Backgrounds_13_0 = null;

        EObject lv_fields_14_0 = null;

        EObject lv_options_15_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:77:2: ( (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_snakes_3_0= ruleInitialSnakeSpecificatin ) ) | ( (lv_foods_4_0= ruleInitialFoodSpecificatin ) ) | ( (lv_obstacles_5_0= ruleInitialObstacleSpecificatin ) ) | ( (lv_speed_6_0= ruleInitialSpeedSpecification ) ) | ( (lv_fire_7_0= ruleInitialFireSpecification ) ) | ( (lv_time_8_0= ruleTimeLimited ) ) | ( (lv_Map_9_0= ruleGlobalMap ) ) | ( (lv_about_10_0= ruleAboutSpecification ) ) | ( (lv_Help_11_0= ruleHelpSpecification ) ) | ( (lv_Music_12_0= ruleMusicSpecification ) ) | ( (lv_Backgrounds_13_0= ruleBackSpecification ) ) | ( (lv_fields_14_0= ruleGlobalFieldInitialisation ) ) | ( (lv_options_15_0= ruleOptionSpecification ) ) )+ otherlv_16= '}' ) )
            // InternalGreedySnake.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_snakes_3_0= ruleInitialSnakeSpecificatin ) ) | ( (lv_foods_4_0= ruleInitialFoodSpecificatin ) ) | ( (lv_obstacles_5_0= ruleInitialObstacleSpecificatin ) ) | ( (lv_speed_6_0= ruleInitialSpeedSpecification ) ) | ( (lv_fire_7_0= ruleInitialFireSpecification ) ) | ( (lv_time_8_0= ruleTimeLimited ) ) | ( (lv_Map_9_0= ruleGlobalMap ) ) | ( (lv_about_10_0= ruleAboutSpecification ) ) | ( (lv_Help_11_0= ruleHelpSpecification ) ) | ( (lv_Music_12_0= ruleMusicSpecification ) ) | ( (lv_Backgrounds_13_0= ruleBackSpecification ) ) | ( (lv_fields_14_0= ruleGlobalFieldInitialisation ) ) | ( (lv_options_15_0= ruleOptionSpecification ) ) )+ otherlv_16= '}' )
            {
            // InternalGreedySnake.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_snakes_3_0= ruleInitialSnakeSpecificatin ) ) | ( (lv_foods_4_0= ruleInitialFoodSpecificatin ) ) | ( (lv_obstacles_5_0= ruleInitialObstacleSpecificatin ) ) | ( (lv_speed_6_0= ruleInitialSpeedSpecification ) ) | ( (lv_fire_7_0= ruleInitialFireSpecification ) ) | ( (lv_time_8_0= ruleTimeLimited ) ) | ( (lv_Map_9_0= ruleGlobalMap ) ) | ( (lv_about_10_0= ruleAboutSpecification ) ) | ( (lv_Help_11_0= ruleHelpSpecification ) ) | ( (lv_Music_12_0= ruleMusicSpecification ) ) | ( (lv_Backgrounds_13_0= ruleBackSpecification ) ) | ( (lv_fields_14_0= ruleGlobalFieldInitialisation ) ) | ( (lv_options_15_0= ruleOptionSpecification ) ) )+ otherlv_16= '}' )
            // InternalGreedySnake.g:79:3: otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_snakes_3_0= ruleInitialSnakeSpecificatin ) ) | ( (lv_foods_4_0= ruleInitialFoodSpecificatin ) ) | ( (lv_obstacles_5_0= ruleInitialObstacleSpecificatin ) ) | ( (lv_speed_6_0= ruleInitialSpeedSpecification ) ) | ( (lv_fire_7_0= ruleInitialFireSpecification ) ) | ( (lv_time_8_0= ruleTimeLimited ) ) | ( (lv_Map_9_0= ruleGlobalMap ) ) | ( (lv_about_10_0= ruleAboutSpecification ) ) | ( (lv_Help_11_0= ruleHelpSpecification ) ) | ( (lv_Music_12_0= ruleMusicSpecification ) ) | ( (lv_Backgrounds_13_0= ruleBackSpecification ) ) | ( (lv_fields_14_0= ruleGlobalFieldInitialisation ) ) | ( (lv_options_15_0= ruleOptionSpecification ) ) )+ otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGreedySnakeAccess().getGameKeyword_0());
            		
            // InternalGreedySnake.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:85:5: lv_name_1_0= RULE_ID
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
            		
            // InternalGreedySnake.g:105:3: ( ( (lv_snakes_3_0= ruleInitialSnakeSpecificatin ) ) | ( (lv_foods_4_0= ruleInitialFoodSpecificatin ) ) | ( (lv_obstacles_5_0= ruleInitialObstacleSpecificatin ) ) | ( (lv_speed_6_0= ruleInitialSpeedSpecification ) ) | ( (lv_fire_7_0= ruleInitialFireSpecification ) ) | ( (lv_time_8_0= ruleTimeLimited ) ) | ( (lv_Map_9_0= ruleGlobalMap ) ) | ( (lv_about_10_0= ruleAboutSpecification ) ) | ( (lv_Help_11_0= ruleHelpSpecification ) ) | ( (lv_Music_12_0= ruleMusicSpecification ) ) | ( (lv_Backgrounds_13_0= ruleBackSpecification ) ) | ( (lv_fields_14_0= ruleGlobalFieldInitialisation ) ) | ( (lv_options_15_0= ruleOptionSpecification ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=14;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    alt1=1;
                    }
                    break;
                case 34:
                    {
                    alt1=2;
                    }
                    break;
                case 35:
                    {
                    alt1=3;
                    }
                    break;
                case 37:
                    {
                    alt1=4;
                    }
                    break;
                case 36:
                    {
                    alt1=5;
                    }
                    break;
                case RULE_ID:
                case 56:
                    {
                    alt1=6;
                    }
                    break;
                case 14:
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
                case 16:
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

                }

                switch (alt1) {
            	case 1 :
            	    // InternalGreedySnake.g:106:4: ( (lv_snakes_3_0= ruleInitialSnakeSpecificatin ) )
            	    {
            	    // InternalGreedySnake.g:106:4: ( (lv_snakes_3_0= ruleInitialSnakeSpecificatin ) )
            	    // InternalGreedySnake.g:107:5: (lv_snakes_3_0= ruleInitialSnakeSpecificatin )
            	    {
            	    // InternalGreedySnake.g:107:5: (lv_snakes_3_0= ruleInitialSnakeSpecificatin )
            	    // InternalGreedySnake.g:108:6: lv_snakes_3_0= ruleInitialSnakeSpecificatin
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
            	    // InternalGreedySnake.g:126:4: ( (lv_foods_4_0= ruleInitialFoodSpecificatin ) )
            	    {
            	    // InternalGreedySnake.g:126:4: ( (lv_foods_4_0= ruleInitialFoodSpecificatin ) )
            	    // InternalGreedySnake.g:127:5: (lv_foods_4_0= ruleInitialFoodSpecificatin )
            	    {
            	    // InternalGreedySnake.g:127:5: (lv_foods_4_0= ruleInitialFoodSpecificatin )
            	    // InternalGreedySnake.g:128:6: lv_foods_4_0= ruleInitialFoodSpecificatin
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
            	    // InternalGreedySnake.g:146:4: ( (lv_obstacles_5_0= ruleInitialObstacleSpecificatin ) )
            	    {
            	    // InternalGreedySnake.g:146:4: ( (lv_obstacles_5_0= ruleInitialObstacleSpecificatin ) )
            	    // InternalGreedySnake.g:147:5: (lv_obstacles_5_0= ruleInitialObstacleSpecificatin )
            	    {
            	    // InternalGreedySnake.g:147:5: (lv_obstacles_5_0= ruleInitialObstacleSpecificatin )
            	    // InternalGreedySnake.g:148:6: lv_obstacles_5_0= ruleInitialObstacleSpecificatin
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
            	    // InternalGreedySnake.g:166:4: ( (lv_speed_6_0= ruleInitialSpeedSpecification ) )
            	    {
            	    // InternalGreedySnake.g:166:4: ( (lv_speed_6_0= ruleInitialSpeedSpecification ) )
            	    // InternalGreedySnake.g:167:5: (lv_speed_6_0= ruleInitialSpeedSpecification )
            	    {
            	    // InternalGreedySnake.g:167:5: (lv_speed_6_0= ruleInitialSpeedSpecification )
            	    // InternalGreedySnake.g:168:6: lv_speed_6_0= ruleInitialSpeedSpecification
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
            	    // InternalGreedySnake.g:186:4: ( (lv_fire_7_0= ruleInitialFireSpecification ) )
            	    {
            	    // InternalGreedySnake.g:186:4: ( (lv_fire_7_0= ruleInitialFireSpecification ) )
            	    // InternalGreedySnake.g:187:5: (lv_fire_7_0= ruleInitialFireSpecification )
            	    {
            	    // InternalGreedySnake.g:187:5: (lv_fire_7_0= ruleInitialFireSpecification )
            	    // InternalGreedySnake.g:188:6: lv_fire_7_0= ruleInitialFireSpecification
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
            	    // InternalGreedySnake.g:206:4: ( (lv_time_8_0= ruleTimeLimited ) )
            	    {
            	    // InternalGreedySnake.g:206:4: ( (lv_time_8_0= ruleTimeLimited ) )
            	    // InternalGreedySnake.g:207:5: (lv_time_8_0= ruleTimeLimited )
            	    {
            	    // InternalGreedySnake.g:207:5: (lv_time_8_0= ruleTimeLimited )
            	    // InternalGreedySnake.g:208:6: lv_time_8_0= ruleTimeLimited
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
            	    // InternalGreedySnake.g:226:4: ( (lv_Map_9_0= ruleGlobalMap ) )
            	    {
            	    // InternalGreedySnake.g:226:4: ( (lv_Map_9_0= ruleGlobalMap ) )
            	    // InternalGreedySnake.g:227:5: (lv_Map_9_0= ruleGlobalMap )
            	    {
            	    // InternalGreedySnake.g:227:5: (lv_Map_9_0= ruleGlobalMap )
            	    // InternalGreedySnake.g:228:6: lv_Map_9_0= ruleGlobalMap
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
            	    // InternalGreedySnake.g:246:4: ( (lv_about_10_0= ruleAboutSpecification ) )
            	    {
            	    // InternalGreedySnake.g:246:4: ( (lv_about_10_0= ruleAboutSpecification ) )
            	    // InternalGreedySnake.g:247:5: (lv_about_10_0= ruleAboutSpecification )
            	    {
            	    // InternalGreedySnake.g:247:5: (lv_about_10_0= ruleAboutSpecification )
            	    // InternalGreedySnake.g:248:6: lv_about_10_0= ruleAboutSpecification
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getAboutAboutSpecificationParserRuleCall_3_7_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_about_10_0=ruleAboutSpecification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"about",
            	    							lv_about_10_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.AboutSpecification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalGreedySnake.g:266:4: ( (lv_Help_11_0= ruleHelpSpecification ) )
            	    {
            	    // InternalGreedySnake.g:266:4: ( (lv_Help_11_0= ruleHelpSpecification ) )
            	    // InternalGreedySnake.g:267:5: (lv_Help_11_0= ruleHelpSpecification )
            	    {
            	    // InternalGreedySnake.g:267:5: (lv_Help_11_0= ruleHelpSpecification )
            	    // InternalGreedySnake.g:268:6: lv_Help_11_0= ruleHelpSpecification
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getHelpHelpSpecificationParserRuleCall_3_8_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_Help_11_0=ruleHelpSpecification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Help",
            	    							lv_Help_11_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.HelpSpecification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalGreedySnake.g:286:4: ( (lv_Music_12_0= ruleMusicSpecification ) )
            	    {
            	    // InternalGreedySnake.g:286:4: ( (lv_Music_12_0= ruleMusicSpecification ) )
            	    // InternalGreedySnake.g:287:5: (lv_Music_12_0= ruleMusicSpecification )
            	    {
            	    // InternalGreedySnake.g:287:5: (lv_Music_12_0= ruleMusicSpecification )
            	    // InternalGreedySnake.g:288:6: lv_Music_12_0= ruleMusicSpecification
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getMusicMusicSpecificationParserRuleCall_3_9_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_Music_12_0=ruleMusicSpecification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Music",
            	    							lv_Music_12_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.MusicSpecification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalGreedySnake.g:306:4: ( (lv_Backgrounds_13_0= ruleBackSpecification ) )
            	    {
            	    // InternalGreedySnake.g:306:4: ( (lv_Backgrounds_13_0= ruleBackSpecification ) )
            	    // InternalGreedySnake.g:307:5: (lv_Backgrounds_13_0= ruleBackSpecification )
            	    {
            	    // InternalGreedySnake.g:307:5: (lv_Backgrounds_13_0= ruleBackSpecification )
            	    // InternalGreedySnake.g:308:6: lv_Backgrounds_13_0= ruleBackSpecification
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getBackgroundsBackSpecificationParserRuleCall_3_10_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_Backgrounds_13_0=ruleBackSpecification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Backgrounds",
            	    							lv_Backgrounds_13_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.BackSpecification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalGreedySnake.g:326:4: ( (lv_fields_14_0= ruleGlobalFieldInitialisation ) )
            	    {
            	    // InternalGreedySnake.g:326:4: ( (lv_fields_14_0= ruleGlobalFieldInitialisation ) )
            	    // InternalGreedySnake.g:327:5: (lv_fields_14_0= ruleGlobalFieldInitialisation )
            	    {
            	    // InternalGreedySnake.g:327:5: (lv_fields_14_0= ruleGlobalFieldInitialisation )
            	    // InternalGreedySnake.g:328:6: lv_fields_14_0= ruleGlobalFieldInitialisation
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getFieldsGlobalFieldInitialisationParserRuleCall_3_11_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_fields_14_0=ruleGlobalFieldInitialisation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fields",
            	    							lv_fields_14_0,
            	    							"org.xtext.example.mydsl2.group16.GreedySnake.GlobalFieldInitialisation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalGreedySnake.g:346:4: ( (lv_options_15_0= ruleOptionSpecification ) )
            	    {
            	    // InternalGreedySnake.g:346:4: ( (lv_options_15_0= ruleOptionSpecification ) )
            	    // InternalGreedySnake.g:347:5: (lv_options_15_0= ruleOptionSpecification )
            	    {
            	    // InternalGreedySnake.g:347:5: (lv_options_15_0= ruleOptionSpecification )
            	    // InternalGreedySnake.g:348:6: lv_options_15_0= ruleOptionSpecification
            	    {

            	    						newCompositeNode(grammarAccess.getGreedySnakeAccess().getOptionsOptionSpecificationParserRuleCall_3_12_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_options_15_0=ruleOptionSpecification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreedySnakeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"options",
            	    							lv_options_15_0,
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

            otherlv_16=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getGreedySnakeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalGreedySnake.g:374:1: entryRuleGlobalMap returns [EObject current=null] : iv_ruleGlobalMap= ruleGlobalMap EOF ;
    public final EObject entryRuleGlobalMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalMap = null;


        try {
            // InternalGreedySnake.g:374:50: (iv_ruleGlobalMap= ruleGlobalMap EOF )
            // InternalGreedySnake.g:375:2: iv_ruleGlobalMap= ruleGlobalMap EOF
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
    // InternalGreedySnake.g:381:1: ruleGlobalMap returns [EObject current=null] : (otherlv_0= 'Filepath' otherlv_1= '=' ( (lv_map_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGlobalMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_map_2_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:387:2: ( (otherlv_0= 'Filepath' otherlv_1= '=' ( (lv_map_2_0= RULE_STRING ) ) ) )
            // InternalGreedySnake.g:388:2: (otherlv_0= 'Filepath' otherlv_1= '=' ( (lv_map_2_0= RULE_STRING ) ) )
            {
            // InternalGreedySnake.g:388:2: (otherlv_0= 'Filepath' otherlv_1= '=' ( (lv_map_2_0= RULE_STRING ) ) )
            // InternalGreedySnake.g:389:3: otherlv_0= 'Filepath' otherlv_1= '=' ( (lv_map_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalMapAccess().getFilepathKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalMapAccess().getEqualsSignKeyword_1());
            		
            // InternalGreedySnake.g:397:3: ( (lv_map_2_0= RULE_STRING ) )
            // InternalGreedySnake.g:398:4: (lv_map_2_0= RULE_STRING )
            {
            // InternalGreedySnake.g:398:4: (lv_map_2_0= RULE_STRING )
            // InternalGreedySnake.g:399:5: lv_map_2_0= RULE_STRING
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
    // InternalGreedySnake.g:419:1: entryRuleGlobalFieldInitialisation returns [EObject current=null] : iv_ruleGlobalFieldInitialisation= ruleGlobalFieldInitialisation EOF ;
    public final EObject entryRuleGlobalFieldInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalFieldInitialisation = null;


        try {
            // InternalGreedySnake.g:419:66: (iv_ruleGlobalFieldInitialisation= ruleGlobalFieldInitialisation EOF )
            // InternalGreedySnake.g:420:2: iv_ruleGlobalFieldInitialisation= ruleGlobalFieldInitialisation EOF
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
    // InternalGreedySnake.g:426:1: ruleGlobalFieldInitialisation returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Panel_width' otherlv_4= '=' ( (lv_panelWidth_5_0= RULE_INT ) ) otherlv_6= 'Panel_Height' otherlv_7= '=' ( (lv_panelHeight_8_0= RULE_INT ) ) otherlv_9= 'column' otherlv_10= '=' ( (lv_width_11_0= RULE_INT ) ) otherlv_12= 'row' otherlv_13= '=' ( (lv_height_14_0= RULE_INT ) ) otherlv_15= 'label_width' otherlv_16= '=' ( (lv_labelWidth_17_0= RULE_INT ) ) otherlv_18= 'label_Height' otherlv_19= '=' ( (lv_labelHeight_20_0= RULE_INT ) ) ( (lv_field_initialisation_21_0= ruleInitialField ) ) otherlv_22= '}' ) ;
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
            // InternalGreedySnake.g:432:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Panel_width' otherlv_4= '=' ( (lv_panelWidth_5_0= RULE_INT ) ) otherlv_6= 'Panel_Height' otherlv_7= '=' ( (lv_panelHeight_8_0= RULE_INT ) ) otherlv_9= 'column' otherlv_10= '=' ( (lv_width_11_0= RULE_INT ) ) otherlv_12= 'row' otherlv_13= '=' ( (lv_height_14_0= RULE_INT ) ) otherlv_15= 'label_width' otherlv_16= '=' ( (lv_labelWidth_17_0= RULE_INT ) ) otherlv_18= 'label_Height' otherlv_19= '=' ( (lv_labelHeight_20_0= RULE_INT ) ) ( (lv_field_initialisation_21_0= ruleInitialField ) ) otherlv_22= '}' ) )
            // InternalGreedySnake.g:433:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Panel_width' otherlv_4= '=' ( (lv_panelWidth_5_0= RULE_INT ) ) otherlv_6= 'Panel_Height' otherlv_7= '=' ( (lv_panelHeight_8_0= RULE_INT ) ) otherlv_9= 'column' otherlv_10= '=' ( (lv_width_11_0= RULE_INT ) ) otherlv_12= 'row' otherlv_13= '=' ( (lv_height_14_0= RULE_INT ) ) otherlv_15= 'label_width' otherlv_16= '=' ( (lv_labelWidth_17_0= RULE_INT ) ) otherlv_18= 'label_Height' otherlv_19= '=' ( (lv_labelHeight_20_0= RULE_INT ) ) ( (lv_field_initialisation_21_0= ruleInitialField ) ) otherlv_22= '}' )
            {
            // InternalGreedySnake.g:433:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Panel_width' otherlv_4= '=' ( (lv_panelWidth_5_0= RULE_INT ) ) otherlv_6= 'Panel_Height' otherlv_7= '=' ( (lv_panelHeight_8_0= RULE_INT ) ) otherlv_9= 'column' otherlv_10= '=' ( (lv_width_11_0= RULE_INT ) ) otherlv_12= 'row' otherlv_13= '=' ( (lv_height_14_0= RULE_INT ) ) otherlv_15= 'label_width' otherlv_16= '=' ( (lv_labelWidth_17_0= RULE_INT ) ) otherlv_18= 'label_Height' otherlv_19= '=' ( (lv_labelHeight_20_0= RULE_INT ) ) ( (lv_field_initialisation_21_0= ruleInitialField ) ) otherlv_22= '}' )
            // InternalGreedySnake.g:434:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Panel_width' otherlv_4= '=' ( (lv_panelWidth_5_0= RULE_INT ) ) otherlv_6= 'Panel_Height' otherlv_7= '=' ( (lv_panelHeight_8_0= RULE_INT ) ) otherlv_9= 'column' otherlv_10= '=' ( (lv_width_11_0= RULE_INT ) ) otherlv_12= 'row' otherlv_13= '=' ( (lv_height_14_0= RULE_INT ) ) otherlv_15= 'label_width' otherlv_16= '=' ( (lv_labelWidth_17_0= RULE_INT ) ) otherlv_18= 'label_Height' otherlv_19= '=' ( (lv_labelHeight_20_0= RULE_INT ) ) ( (lv_field_initialisation_21_0= ruleInitialField ) ) otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalFieldInitialisationAccess().getFieldKeyword_0());
            		
            // InternalGreedySnake.g:438:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:439:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:439:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:440:5: lv_name_1_0= RULE_ID
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
            		
            // InternalGreedySnake.g:468:3: ( (lv_panelWidth_5_0= RULE_INT ) )
            // InternalGreedySnake.g:469:4: (lv_panelWidth_5_0= RULE_INT )
            {
            // InternalGreedySnake.g:469:4: (lv_panelWidth_5_0= RULE_INT )
            // InternalGreedySnake.g:470:5: lv_panelWidth_5_0= RULE_INT
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
            		
            // InternalGreedySnake.g:494:3: ( (lv_panelHeight_8_0= RULE_INT ) )
            // InternalGreedySnake.g:495:4: (lv_panelHeight_8_0= RULE_INT )
            {
            // InternalGreedySnake.g:495:4: (lv_panelHeight_8_0= RULE_INT )
            // InternalGreedySnake.g:496:5: lv_panelHeight_8_0= RULE_INT
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
            		
            // InternalGreedySnake.g:520:3: ( (lv_width_11_0= RULE_INT ) )
            // InternalGreedySnake.g:521:4: (lv_width_11_0= RULE_INT )
            {
            // InternalGreedySnake.g:521:4: (lv_width_11_0= RULE_INT )
            // InternalGreedySnake.g:522:5: lv_width_11_0= RULE_INT
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
            		
            // InternalGreedySnake.g:546:3: ( (lv_height_14_0= RULE_INT ) )
            // InternalGreedySnake.g:547:4: (lv_height_14_0= RULE_INT )
            {
            // InternalGreedySnake.g:547:4: (lv_height_14_0= RULE_INT )
            // InternalGreedySnake.g:548:5: lv_height_14_0= RULE_INT
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
            		
            // InternalGreedySnake.g:572:3: ( (lv_labelWidth_17_0= RULE_INT ) )
            // InternalGreedySnake.g:573:4: (lv_labelWidth_17_0= RULE_INT )
            {
            // InternalGreedySnake.g:573:4: (lv_labelWidth_17_0= RULE_INT )
            // InternalGreedySnake.g:574:5: lv_labelWidth_17_0= RULE_INT
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
            		
            // InternalGreedySnake.g:598:3: ( (lv_labelHeight_20_0= RULE_INT ) )
            // InternalGreedySnake.g:599:4: (lv_labelHeight_20_0= RULE_INT )
            {
            // InternalGreedySnake.g:599:4: (lv_labelHeight_20_0= RULE_INT )
            // InternalGreedySnake.g:600:5: lv_labelHeight_20_0= RULE_INT
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

            // InternalGreedySnake.g:616:3: ( (lv_field_initialisation_21_0= ruleInitialField ) )
            // InternalGreedySnake.g:617:4: (lv_field_initialisation_21_0= ruleInitialField )
            {
            // InternalGreedySnake.g:617:4: (lv_field_initialisation_21_0= ruleInitialField )
            // InternalGreedySnake.g:618:5: lv_field_initialisation_21_0= ruleInitialField
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
    // InternalGreedySnake.g:643:1: entryRuleInitialField returns [EObject current=null] : iv_ruleInitialField= ruleInitialField EOF ;
    public final EObject entryRuleInitialField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialField = null;


        try {
            // InternalGreedySnake.g:643:53: (iv_ruleInitialField= ruleInitialField EOF )
            // InternalGreedySnake.g:644:2: iv_ruleInitialField= ruleInitialField EOF
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
    // InternalGreedySnake.g:650:1: ruleInitialField returns [EObject current=null] : (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= 'Default' otherlv_6= ':' ( (lv_Default_7_0= ruleDefault ) ) otherlv_8= '}' ) ;
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
            // InternalGreedySnake.g:656:2: ( (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= 'Default' otherlv_6= ':' ( (lv_Default_7_0= ruleDefault ) ) otherlv_8= '}' ) )
            // InternalGreedySnake.g:657:2: (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= 'Default' otherlv_6= ':' ( (lv_Default_7_0= ruleDefault ) ) otherlv_8= '}' )
            {
            // InternalGreedySnake.g:657:2: (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= 'Default' otherlv_6= ':' ( (lv_Default_7_0= ruleDefault ) ) otherlv_8= '}' )
            // InternalGreedySnake.g:658:3: otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= 'Default' otherlv_6= ':' ( (lv_Default_7_0= ruleDefault ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialFieldAccess().getInitKeyword_0());
            		
            // InternalGreedySnake.g:662:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:663:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:663:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:664:5: lv_name_1_0= RULE_ID
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
            		
            // InternalGreedySnake.g:700:3: ( (lv_Default_7_0= ruleDefault ) )
            // InternalGreedySnake.g:701:4: (lv_Default_7_0= ruleDefault )
            {
            // InternalGreedySnake.g:701:4: (lv_Default_7_0= ruleDefault )
            // InternalGreedySnake.g:702:5: lv_Default_7_0= ruleDefault
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
    // InternalGreedySnake.g:727:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // InternalGreedySnake.g:727:48: (iv_ruleDefault= ruleDefault EOF )
            // InternalGreedySnake.g:728:2: iv_ruleDefault= ruleDefault EOF
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
    // InternalGreedySnake.g:734:1: ruleDefault returns [EObject current=null] : (otherlv_0= 'snakeLength' otherlv_1= '=' ( (lv_length_2_0= RULE_STRING ) ) otherlv_3= 'Score' otherlv_4= '=' ( (lv_score_5_0= RULE_STRING ) ) otherlv_6= 'Time' otherlv_7= '=' ( (lv_time_8_0= RULE_STRING ) ) otherlv_9= 'Amount' otherlv_10= '=' ( (lv_amount_11_0= RULE_STRING ) ) otherlv_12= 'Weapon' otherlv_13= '=' ( (lv_weapon_14_0= RULE_STRING ) ) ) ;
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
            // InternalGreedySnake.g:740:2: ( (otherlv_0= 'snakeLength' otherlv_1= '=' ( (lv_length_2_0= RULE_STRING ) ) otherlv_3= 'Score' otherlv_4= '=' ( (lv_score_5_0= RULE_STRING ) ) otherlv_6= 'Time' otherlv_7= '=' ( (lv_time_8_0= RULE_STRING ) ) otherlv_9= 'Amount' otherlv_10= '=' ( (lv_amount_11_0= RULE_STRING ) ) otherlv_12= 'Weapon' otherlv_13= '=' ( (lv_weapon_14_0= RULE_STRING ) ) ) )
            // InternalGreedySnake.g:741:2: (otherlv_0= 'snakeLength' otherlv_1= '=' ( (lv_length_2_0= RULE_STRING ) ) otherlv_3= 'Score' otherlv_4= '=' ( (lv_score_5_0= RULE_STRING ) ) otherlv_6= 'Time' otherlv_7= '=' ( (lv_time_8_0= RULE_STRING ) ) otherlv_9= 'Amount' otherlv_10= '=' ( (lv_amount_11_0= RULE_STRING ) ) otherlv_12= 'Weapon' otherlv_13= '=' ( (lv_weapon_14_0= RULE_STRING ) ) )
            {
            // InternalGreedySnake.g:741:2: (otherlv_0= 'snakeLength' otherlv_1= '=' ( (lv_length_2_0= RULE_STRING ) ) otherlv_3= 'Score' otherlv_4= '=' ( (lv_score_5_0= RULE_STRING ) ) otherlv_6= 'Time' otherlv_7= '=' ( (lv_time_8_0= RULE_STRING ) ) otherlv_9= 'Amount' otherlv_10= '=' ( (lv_amount_11_0= RULE_STRING ) ) otherlv_12= 'Weapon' otherlv_13= '=' ( (lv_weapon_14_0= RULE_STRING ) ) )
            // InternalGreedySnake.g:742:3: otherlv_0= 'snakeLength' otherlv_1= '=' ( (lv_length_2_0= RULE_STRING ) ) otherlv_3= 'Score' otherlv_4= '=' ( (lv_score_5_0= RULE_STRING ) ) otherlv_6= 'Time' otherlv_7= '=' ( (lv_time_8_0= RULE_STRING ) ) otherlv_9= 'Amount' otherlv_10= '=' ( (lv_amount_11_0= RULE_STRING ) ) otherlv_12= 'Weapon' otherlv_13= '=' ( (lv_weapon_14_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultAccess().getSnakeLengthKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDefaultAccess().getEqualsSignKeyword_1());
            		
            // InternalGreedySnake.g:750:3: ( (lv_length_2_0= RULE_STRING ) )
            // InternalGreedySnake.g:751:4: (lv_length_2_0= RULE_STRING )
            {
            // InternalGreedySnake.g:751:4: (lv_length_2_0= RULE_STRING )
            // InternalGreedySnake.g:752:5: lv_length_2_0= RULE_STRING
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
            		
            // InternalGreedySnake.g:776:3: ( (lv_score_5_0= RULE_STRING ) )
            // InternalGreedySnake.g:777:4: (lv_score_5_0= RULE_STRING )
            {
            // InternalGreedySnake.g:777:4: (lv_score_5_0= RULE_STRING )
            // InternalGreedySnake.g:778:5: lv_score_5_0= RULE_STRING
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
            		
            // InternalGreedySnake.g:802:3: ( (lv_time_8_0= RULE_STRING ) )
            // InternalGreedySnake.g:803:4: (lv_time_8_0= RULE_STRING )
            {
            // InternalGreedySnake.g:803:4: (lv_time_8_0= RULE_STRING )
            // InternalGreedySnake.g:804:5: lv_time_8_0= RULE_STRING
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
            		
            // InternalGreedySnake.g:828:3: ( (lv_amount_11_0= RULE_STRING ) )
            // InternalGreedySnake.g:829:4: (lv_amount_11_0= RULE_STRING )
            {
            // InternalGreedySnake.g:829:4: (lv_amount_11_0= RULE_STRING )
            // InternalGreedySnake.g:830:5: lv_amount_11_0= RULE_STRING
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
            		
            // InternalGreedySnake.g:854:3: ( (lv_weapon_14_0= RULE_STRING ) )
            // InternalGreedySnake.g:855:4: (lv_weapon_14_0= RULE_STRING )
            {
            // InternalGreedySnake.g:855:4: (lv_weapon_14_0= RULE_STRING )
            // InternalGreedySnake.g:856:5: lv_weapon_14_0= RULE_STRING
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
    // InternalGreedySnake.g:876:1: entryRuleInitialSnakeSpecificatin returns [EObject current=null] : iv_ruleInitialSnakeSpecificatin= ruleInitialSnakeSpecificatin EOF ;
    public final EObject entryRuleInitialSnakeSpecificatin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialSnakeSpecificatin = null;


        try {
            // InternalGreedySnake.g:876:65: (iv_ruleInitialSnakeSpecificatin= ruleInitialSnakeSpecificatin EOF )
            // InternalGreedySnake.g:877:2: iv_ruleInitialSnakeSpecificatin= ruleInitialSnakeSpecificatin EOF
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
    // InternalGreedySnake.g:883:1: ruleInitialSnakeSpecificatin returns [EObject current=null] : (otherlv_0= 'snake' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleSnakeMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? ) ;
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
            // InternalGreedySnake.g:889:2: ( (otherlv_0= 'snake' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleSnakeMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? ) )
            // InternalGreedySnake.g:890:2: (otherlv_0= 'snake' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleSnakeMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? )
            {
            // InternalGreedySnake.g:890:2: (otherlv_0= 'snake' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleSnakeMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? )
            // InternalGreedySnake.g:891:3: otherlv_0= 'snake' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleSnakeMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialSnakeSpecificatinAccess().getSnakeKeyword_0());
            		
            // InternalGreedySnake.g:895:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:896:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:896:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:897:5: lv_name_1_0= RULE_ID
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
            		
            // InternalGreedySnake.g:917:3: ( (lv_members_3_0= ruleSnakeMembers ) )
            // InternalGreedySnake.g:918:4: (lv_members_3_0= ruleSnakeMembers )
            {
            // InternalGreedySnake.g:918:4: (lv_members_3_0= ruleSnakeMembers )
            // InternalGreedySnake.g:919:5: lv_members_3_0= ruleSnakeMembers
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
            		
            // InternalGreedySnake.g:940:3: ( (otherlv_5= RULE_ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==RULE_ID||(LA2_1>=13 && LA2_1<=14)||LA2_1==16||(LA2_1>=33 && LA2_1<=37)||LA2_1==56||(LA2_1>=65 && LA2_1<=67)||(LA2_1>=71 && LA2_1<=72)||LA2_1==76) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // InternalGreedySnake.g:941:4: (otherlv_5= RULE_ID )
                    {
                    // InternalGreedySnake.g:941:4: (otherlv_5= RULE_ID )
                    // InternalGreedySnake.g:942:5: otherlv_5= RULE_ID
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
    // InternalGreedySnake.g:957:1: entryRuleInitialFoodSpecificatin returns [EObject current=null] : iv_ruleInitialFoodSpecificatin= ruleInitialFoodSpecificatin EOF ;
    public final EObject entryRuleInitialFoodSpecificatin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialFoodSpecificatin = null;


        try {
            // InternalGreedySnake.g:957:64: (iv_ruleInitialFoodSpecificatin= ruleInitialFoodSpecificatin EOF )
            // InternalGreedySnake.g:958:2: iv_ruleInitialFoodSpecificatin= ruleInitialFoodSpecificatin EOF
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
    // InternalGreedySnake.g:964:1: ruleInitialFoodSpecificatin returns [EObject current=null] : (otherlv_0= 'food' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFoodMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? ) ;
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
            // InternalGreedySnake.g:970:2: ( (otherlv_0= 'food' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFoodMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? ) )
            // InternalGreedySnake.g:971:2: (otherlv_0= 'food' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFoodMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? )
            {
            // InternalGreedySnake.g:971:2: (otherlv_0= 'food' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFoodMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? )
            // InternalGreedySnake.g:972:3: otherlv_0= 'food' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFoodMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialFoodSpecificatinAccess().getFoodKeyword_0());
            		
            // InternalGreedySnake.g:976:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:977:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:977:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:978:5: lv_name_1_0= RULE_ID
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
            		
            // InternalGreedySnake.g:998:3: ( (lv_members_3_0= ruleFoodMembers ) )
            // InternalGreedySnake.g:999:4: (lv_members_3_0= ruleFoodMembers )
            {
            // InternalGreedySnake.g:999:4: (lv_members_3_0= ruleFoodMembers )
            // InternalGreedySnake.g:1000:5: lv_members_3_0= ruleFoodMembers
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
            		
            // InternalGreedySnake.g:1021:3: ( (otherlv_5= RULE_ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==RULE_ID||(LA3_1>=13 && LA3_1<=14)||LA3_1==16||(LA3_1>=33 && LA3_1<=37)||LA3_1==56||(LA3_1>=65 && LA3_1<=67)||(LA3_1>=71 && LA3_1<=72)||LA3_1==76) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // InternalGreedySnake.g:1022:4: (otherlv_5= RULE_ID )
                    {
                    // InternalGreedySnake.g:1022:4: (otherlv_5= RULE_ID )
                    // InternalGreedySnake.g:1023:5: otherlv_5= RULE_ID
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
    // InternalGreedySnake.g:1038:1: entryRuleInitialObstacleSpecificatin returns [EObject current=null] : iv_ruleInitialObstacleSpecificatin= ruleInitialObstacleSpecificatin EOF ;
    public final EObject entryRuleInitialObstacleSpecificatin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialObstacleSpecificatin = null;


        try {
            // InternalGreedySnake.g:1038:68: (iv_ruleInitialObstacleSpecificatin= ruleInitialObstacleSpecificatin EOF )
            // InternalGreedySnake.g:1039:2: iv_ruleInitialObstacleSpecificatin= ruleInitialObstacleSpecificatin EOF
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
    // InternalGreedySnake.g:1045:1: ruleInitialObstacleSpecificatin returns [EObject current=null] : (otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleObstacleMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? ) ;
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
            // InternalGreedySnake.g:1051:2: ( (otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleObstacleMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? ) )
            // InternalGreedySnake.g:1052:2: (otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleObstacleMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? )
            {
            // InternalGreedySnake.g:1052:2: (otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleObstacleMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? )
            // InternalGreedySnake.g:1053:3: otherlv_0= 'obstacle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleObstacleMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialObstacleSpecificatinAccess().getObstacleKeyword_0());
            		
            // InternalGreedySnake.g:1057:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:1058:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:1058:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:1059:5: lv_name_1_0= RULE_ID
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
            		
            // InternalGreedySnake.g:1079:3: ( (lv_members_3_0= ruleObstacleMembers ) )
            // InternalGreedySnake.g:1080:4: (lv_members_3_0= ruleObstacleMembers )
            {
            // InternalGreedySnake.g:1080:4: (lv_members_3_0= ruleObstacleMembers )
            // InternalGreedySnake.g:1081:5: lv_members_3_0= ruleObstacleMembers
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
            		
            // InternalGreedySnake.g:1102:3: ( (otherlv_5= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==RULE_ID||(LA4_1>=13 && LA4_1<=14)||LA4_1==16||(LA4_1>=33 && LA4_1<=37)||LA4_1==56||(LA4_1>=65 && LA4_1<=67)||(LA4_1>=71 && LA4_1<=72)||LA4_1==76) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalGreedySnake.g:1103:4: (otherlv_5= RULE_ID )
                    {
                    // InternalGreedySnake.g:1103:4: (otherlv_5= RULE_ID )
                    // InternalGreedySnake.g:1104:5: otherlv_5= RULE_ID
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
    // InternalGreedySnake.g:1119:1: entryRuleInitialFireSpecification returns [EObject current=null] : iv_ruleInitialFireSpecification= ruleInitialFireSpecification EOF ;
    public final EObject entryRuleInitialFireSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialFireSpecification = null;


        try {
            // InternalGreedySnake.g:1119:65: (iv_ruleInitialFireSpecification= ruleInitialFireSpecification EOF )
            // InternalGreedySnake.g:1120:2: iv_ruleInitialFireSpecification= ruleInitialFireSpecification EOF
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
    // InternalGreedySnake.g:1126:1: ruleInitialFireSpecification returns [EObject current=null] : (otherlv_0= 'fire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFireMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? ) ;
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
            // InternalGreedySnake.g:1132:2: ( (otherlv_0= 'fire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFireMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? ) )
            // InternalGreedySnake.g:1133:2: (otherlv_0= 'fire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFireMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? )
            {
            // InternalGreedySnake.g:1133:2: (otherlv_0= 'fire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFireMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )? )
            // InternalGreedySnake.g:1134:3: otherlv_0= 'fire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleFireMembers ) ) otherlv_4= '}' ( (otherlv_5= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialFireSpecificationAccess().getFireKeyword_0());
            		
            // InternalGreedySnake.g:1138:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:1139:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:1139:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:1140:5: lv_name_1_0= RULE_ID
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
            		
            // InternalGreedySnake.g:1160:3: ( (lv_members_3_0= ruleFireMembers ) )
            // InternalGreedySnake.g:1161:4: (lv_members_3_0= ruleFireMembers )
            {
            // InternalGreedySnake.g:1161:4: (lv_members_3_0= ruleFireMembers )
            // InternalGreedySnake.g:1162:5: lv_members_3_0= ruleFireMembers
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
            		
            // InternalGreedySnake.g:1183:3: ( (otherlv_5= RULE_ID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==RULE_ID||(LA5_1>=13 && LA5_1<=14)||LA5_1==16||(LA5_1>=33 && LA5_1<=37)||LA5_1==56||(LA5_1>=65 && LA5_1<=67)||(LA5_1>=71 && LA5_1<=72)||LA5_1==76) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // InternalGreedySnake.g:1184:4: (otherlv_5= RULE_ID )
                    {
                    // InternalGreedySnake.g:1184:4: (otherlv_5= RULE_ID )
                    // InternalGreedySnake.g:1185:5: otherlv_5= RULE_ID
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
    // InternalGreedySnake.g:1200:1: entryRuleInitialSpeedSpecification returns [EObject current=null] : iv_ruleInitialSpeedSpecification= ruleInitialSpeedSpecification EOF ;
    public final EObject entryRuleInitialSpeedSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialSpeedSpecification = null;


        try {
            // InternalGreedySnake.g:1200:66: (iv_ruleInitialSpeedSpecification= ruleInitialSpeedSpecification EOF )
            // InternalGreedySnake.g:1201:2: iv_ruleInitialSpeedSpecification= ruleInitialSpeedSpecification EOF
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
    // InternalGreedySnake.g:1207:1: ruleInitialSpeedSpecification returns [EObject current=null] : ( () otherlv_1= 'Speed' otherlv_2= '{' ( (lv_speedGroup_3_0= ruleSpeedGroup ) )* otherlv_4= '}' ) ;
    public final EObject ruleInitialSpeedSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_speedGroup_3_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:1213:2: ( ( () otherlv_1= 'Speed' otherlv_2= '{' ( (lv_speedGroup_3_0= ruleSpeedGroup ) )* otherlv_4= '}' ) )
            // InternalGreedySnake.g:1214:2: ( () otherlv_1= 'Speed' otherlv_2= '{' ( (lv_speedGroup_3_0= ruleSpeedGroup ) )* otherlv_4= '}' )
            {
            // InternalGreedySnake.g:1214:2: ( () otherlv_1= 'Speed' otherlv_2= '{' ( (lv_speedGroup_3_0= ruleSpeedGroup ) )* otherlv_4= '}' )
            // InternalGreedySnake.g:1215:3: () otherlv_1= 'Speed' otherlv_2= '{' ( (lv_speedGroup_3_0= ruleSpeedGroup ) )* otherlv_4= '}'
            {
            // InternalGreedySnake.g:1215:3: ()
            // InternalGreedySnake.g:1216:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialSpeedSpecificationAccess().getInitialSpeedSpecificationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialSpeedSpecificationAccess().getSpeedKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getInitialSpeedSpecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGreedySnake.g:1230:3: ( (lv_speedGroup_3_0= ruleSpeedGroup ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGreedySnake.g:1231:4: (lv_speedGroup_3_0= ruleSpeedGroup )
            	    {
            	    // InternalGreedySnake.g:1231:4: (lv_speedGroup_3_0= ruleSpeedGroup )
            	    // InternalGreedySnake.g:1232:5: lv_speedGroup_3_0= ruleSpeedGroup
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
    // InternalGreedySnake.g:1257:1: entryRuleSpeedGroup returns [EObject current=null] : iv_ruleSpeedGroup= ruleSpeedGroup EOF ;
    public final EObject entryRuleSpeedGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeedGroup = null;


        try {
            // InternalGreedySnake.g:1257:51: (iv_ruleSpeedGroup= ruleSpeedGroup EOF )
            // InternalGreedySnake.g:1258:2: iv_ruleSpeedGroup= ruleSpeedGroup EOF
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
    // InternalGreedySnake.g:1264:1: ruleSpeedGroup returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSpeedGroup() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:1270:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalGreedySnake.g:1271:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalGreedySnake.g:1271:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalGreedySnake.g:1272:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalGreedySnake.g:1272:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreedySnake.g:1273:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreedySnake.g:1273:4: (lv_name_0_0= RULE_ID )
            // InternalGreedySnake.g:1274:5: lv_name_0_0= RULE_ID
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
            		
            // InternalGreedySnake.g:1294:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalGreedySnake.g:1295:4: (lv_value_2_0= RULE_INT )
            {
            // InternalGreedySnake.g:1295:4: (lv_value_2_0= RULE_INT )
            // InternalGreedySnake.g:1296:5: lv_value_2_0= RULE_INT
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
    // InternalGreedySnake.g:1316:1: entryRuleFireMembers returns [EObject current=null] : iv_ruleFireMembers= ruleFireMembers EOF ;
    public final EObject entryRuleFireMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFireMembers = null;


        try {
            // InternalGreedySnake.g:1316:52: (iv_ruleFireMembers= ruleFireMembers EOF )
            // InternalGreedySnake.g:1317:2: iv_ruleFireMembers= ruleFireMembers EOF
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
    // InternalGreedySnake.g:1323:1: ruleFireMembers returns [EObject current=null] : ( (lv_fire_0_0= ruleFireInitDisplay ) ) ;
    public final EObject ruleFireMembers() throws RecognitionException {
        EObject current = null;

        EObject lv_fire_0_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:1329:2: ( ( (lv_fire_0_0= ruleFireInitDisplay ) ) )
            // InternalGreedySnake.g:1330:2: ( (lv_fire_0_0= ruleFireInitDisplay ) )
            {
            // InternalGreedySnake.g:1330:2: ( (lv_fire_0_0= ruleFireInitDisplay ) )
            // InternalGreedySnake.g:1331:3: (lv_fire_0_0= ruleFireInitDisplay )
            {
            // InternalGreedySnake.g:1331:3: (lv_fire_0_0= ruleFireInitDisplay )
            // InternalGreedySnake.g:1332:4: lv_fire_0_0= ruleFireInitDisplay
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
    // InternalGreedySnake.g:1352:1: entryRuleSnakeMembers returns [EObject current=null] : iv_ruleSnakeMembers= ruleSnakeMembers EOF ;
    public final EObject entryRuleSnakeMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSnakeMembers = null;


        try {
            // InternalGreedySnake.g:1352:53: (iv_ruleSnakeMembers= ruleSnakeMembers EOF )
            // InternalGreedySnake.g:1353:2: iv_ruleSnakeMembers= ruleSnakeMembers EOF
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
    // InternalGreedySnake.g:1359:1: ruleSnakeMembers returns [EObject current=null] : ( (lv_sna_0_0= ruleSnakeInitDisplay ) ) ;
    public final EObject ruleSnakeMembers() throws RecognitionException {
        EObject current = null;

        EObject lv_sna_0_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:1365:2: ( ( (lv_sna_0_0= ruleSnakeInitDisplay ) ) )
            // InternalGreedySnake.g:1366:2: ( (lv_sna_0_0= ruleSnakeInitDisplay ) )
            {
            // InternalGreedySnake.g:1366:2: ( (lv_sna_0_0= ruleSnakeInitDisplay ) )
            // InternalGreedySnake.g:1367:3: (lv_sna_0_0= ruleSnakeInitDisplay )
            {
            // InternalGreedySnake.g:1367:3: (lv_sna_0_0= ruleSnakeInitDisplay )
            // InternalGreedySnake.g:1368:4: lv_sna_0_0= ruleSnakeInitDisplay
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
    // InternalGreedySnake.g:1388:1: entryRuleFoodMembers returns [EObject current=null] : iv_ruleFoodMembers= ruleFoodMembers EOF ;
    public final EObject entryRuleFoodMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoodMembers = null;


        try {
            // InternalGreedySnake.g:1388:52: (iv_ruleFoodMembers= ruleFoodMembers EOF )
            // InternalGreedySnake.g:1389:2: iv_ruleFoodMembers= ruleFoodMembers EOF
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
    // InternalGreedySnake.g:1395:1: ruleFoodMembers returns [EObject current=null] : ( (lv_food_0_0= ruleFoodInitDisplay ) ) ;
    public final EObject ruleFoodMembers() throws RecognitionException {
        EObject current = null;

        EObject lv_food_0_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:1401:2: ( ( (lv_food_0_0= ruleFoodInitDisplay ) ) )
            // InternalGreedySnake.g:1402:2: ( (lv_food_0_0= ruleFoodInitDisplay ) )
            {
            // InternalGreedySnake.g:1402:2: ( (lv_food_0_0= ruleFoodInitDisplay ) )
            // InternalGreedySnake.g:1403:3: (lv_food_0_0= ruleFoodInitDisplay )
            {
            // InternalGreedySnake.g:1403:3: (lv_food_0_0= ruleFoodInitDisplay )
            // InternalGreedySnake.g:1404:4: lv_food_0_0= ruleFoodInitDisplay
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
    // InternalGreedySnake.g:1424:1: entryRuleObstacleMembers returns [EObject current=null] : iv_ruleObstacleMembers= ruleObstacleMembers EOF ;
    public final EObject entryRuleObstacleMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacleMembers = null;


        try {
            // InternalGreedySnake.g:1424:56: (iv_ruleObstacleMembers= ruleObstacleMembers EOF )
            // InternalGreedySnake.g:1425:2: iv_ruleObstacleMembers= ruleObstacleMembers EOF
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
    // InternalGreedySnake.g:1431:1: ruleObstacleMembers returns [EObject current=null] : ( (lv_obstacle_0_0= ruleObstacleInitDisplay ) ) ;
    public final EObject ruleObstacleMembers() throws RecognitionException {
        EObject current = null;

        EObject lv_obstacle_0_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:1437:2: ( ( (lv_obstacle_0_0= ruleObstacleInitDisplay ) ) )
            // InternalGreedySnake.g:1438:2: ( (lv_obstacle_0_0= ruleObstacleInitDisplay ) )
            {
            // InternalGreedySnake.g:1438:2: ( (lv_obstacle_0_0= ruleObstacleInitDisplay ) )
            // InternalGreedySnake.g:1439:3: (lv_obstacle_0_0= ruleObstacleInitDisplay )
            {
            // InternalGreedySnake.g:1439:3: (lv_obstacle_0_0= ruleObstacleInitDisplay )
            // InternalGreedySnake.g:1440:4: lv_obstacle_0_0= ruleObstacleInitDisplay
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


    // $ANTLR start "entryRuleFireInitDisplay"
    // InternalGreedySnake.g:1460:1: entryRuleFireInitDisplay returns [EObject current=null] : iv_ruleFireInitDisplay= ruleFireInitDisplay EOF ;
    public final EObject entryRuleFireInitDisplay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFireInitDisplay = null;


        try {
            // InternalGreedySnake.g:1460:56: (iv_ruleFireInitDisplay= ruleFireInitDisplay EOF )
            // InternalGreedySnake.g:1461:2: iv_ruleFireInitDisplay= ruleFireInitDisplay EOF
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
    // InternalGreedySnake.g:1467:1: ruleFireInitDisplay returns [EObject current=null] : (otherlv_0= 'FireIcon' otherlv_1= '{' ( (lv_FireIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) ) ;
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
            // InternalGreedySnake.g:1473:2: ( (otherlv_0= 'FireIcon' otherlv_1= '{' ( (lv_FireIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) ) )
            // InternalGreedySnake.g:1474:2: (otherlv_0= 'FireIcon' otherlv_1= '{' ( (lv_FireIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) )
            {
            // InternalGreedySnake.g:1474:2: (otherlv_0= 'FireIcon' otherlv_1= '{' ( (lv_FireIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) )
            // InternalGreedySnake.g:1475:3: otherlv_0= 'FireIcon' otherlv_1= '{' ( (lv_FireIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFireInitDisplayAccess().getFireIconKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getFireInitDisplayAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGreedySnake.g:1483:3: ( (lv_FireIcon_2_0= ruleIconTag ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGreedySnake.g:1484:4: (lv_FireIcon_2_0= ruleIconTag )
            	    {
            	    // InternalGreedySnake.g:1484:4: (lv_FireIcon_2_0= ruleIconTag )
            	    // InternalGreedySnake.g:1485:5: lv_FireIcon_2_0= ruleIconTag
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
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getFireInitDisplayAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getFireInitDisplayAccess().getIcon_sizeKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getFireInitDisplayAccess().getEqualsSignKeyword_5());
            		
            // InternalGreedySnake.g:1514:3: ( (lv_Iconsize_6_0= ruleIconSize ) )
            // InternalGreedySnake.g:1515:4: (lv_Iconsize_6_0= ruleIconSize )
            {
            // InternalGreedySnake.g:1515:4: (lv_Iconsize_6_0= ruleIconSize )
            // InternalGreedySnake.g:1516:5: lv_Iconsize_6_0= ruleIconSize
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
    // InternalGreedySnake.g:1537:1: entryRuleSnakeInitDisplay returns [EObject current=null] : iv_ruleSnakeInitDisplay= ruleSnakeInitDisplay EOF ;
    public final EObject entryRuleSnakeInitDisplay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSnakeInitDisplay = null;


        try {
            // InternalGreedySnake.g:1537:57: (iv_ruleSnakeInitDisplay= ruleSnakeInitDisplay EOF )
            // InternalGreedySnake.g:1538:2: iv_ruleSnakeInitDisplay= ruleSnakeInitDisplay EOF
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
    // InternalGreedySnake.g:1544:1: ruleSnakeInitDisplay returns [EObject current=null] : (otherlv_0= 'head' otherlv_1= '=' ( (lv_head_2_0= '(' ) ) ( (lv_initial_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_initial_y_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= 'headIcon' otherlv_8= '{' ( (lv_headIcon_9_0= ruleIconTag ) )* otherlv_10= '}' otherlv_11= 'Icon_size' otherlv_12= '=' ( (lv_Iconsize_13_0= ruleIconSize ) ) otherlv_14= 'BodyIcon' otherlv_15= '{' ( (lv_BodyIcon_16_0= ruleIconTag ) )* otherlv_17= '}' otherlv_18= 'defaultSpeed' otherlv_19= '=' ( (lv_defaultSpeed_20_0= RULE_INT ) ) otherlv_21= 'snakeTag' otherlv_22= '=' ( (lv_snakeTag_23_0= RULE_INT ) ) ) ;
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
            // InternalGreedySnake.g:1550:2: ( (otherlv_0= 'head' otherlv_1= '=' ( (lv_head_2_0= '(' ) ) ( (lv_initial_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_initial_y_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= 'headIcon' otherlv_8= '{' ( (lv_headIcon_9_0= ruleIconTag ) )* otherlv_10= '}' otherlv_11= 'Icon_size' otherlv_12= '=' ( (lv_Iconsize_13_0= ruleIconSize ) ) otherlv_14= 'BodyIcon' otherlv_15= '{' ( (lv_BodyIcon_16_0= ruleIconTag ) )* otherlv_17= '}' otherlv_18= 'defaultSpeed' otherlv_19= '=' ( (lv_defaultSpeed_20_0= RULE_INT ) ) otherlv_21= 'snakeTag' otherlv_22= '=' ( (lv_snakeTag_23_0= RULE_INT ) ) ) )
            // InternalGreedySnake.g:1551:2: (otherlv_0= 'head' otherlv_1= '=' ( (lv_head_2_0= '(' ) ) ( (lv_initial_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_initial_y_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= 'headIcon' otherlv_8= '{' ( (lv_headIcon_9_0= ruleIconTag ) )* otherlv_10= '}' otherlv_11= 'Icon_size' otherlv_12= '=' ( (lv_Iconsize_13_0= ruleIconSize ) ) otherlv_14= 'BodyIcon' otherlv_15= '{' ( (lv_BodyIcon_16_0= ruleIconTag ) )* otherlv_17= '}' otherlv_18= 'defaultSpeed' otherlv_19= '=' ( (lv_defaultSpeed_20_0= RULE_INT ) ) otherlv_21= 'snakeTag' otherlv_22= '=' ( (lv_snakeTag_23_0= RULE_INT ) ) )
            {
            // InternalGreedySnake.g:1551:2: (otherlv_0= 'head' otherlv_1= '=' ( (lv_head_2_0= '(' ) ) ( (lv_initial_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_initial_y_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= 'headIcon' otherlv_8= '{' ( (lv_headIcon_9_0= ruleIconTag ) )* otherlv_10= '}' otherlv_11= 'Icon_size' otherlv_12= '=' ( (lv_Iconsize_13_0= ruleIconSize ) ) otherlv_14= 'BodyIcon' otherlv_15= '{' ( (lv_BodyIcon_16_0= ruleIconTag ) )* otherlv_17= '}' otherlv_18= 'defaultSpeed' otherlv_19= '=' ( (lv_defaultSpeed_20_0= RULE_INT ) ) otherlv_21= 'snakeTag' otherlv_22= '=' ( (lv_snakeTag_23_0= RULE_INT ) ) )
            // InternalGreedySnake.g:1552:3: otherlv_0= 'head' otherlv_1= '=' ( (lv_head_2_0= '(' ) ) ( (lv_initial_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_initial_y_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= 'headIcon' otherlv_8= '{' ( (lv_headIcon_9_0= ruleIconTag ) )* otherlv_10= '}' otherlv_11= 'Icon_size' otherlv_12= '=' ( (lv_Iconsize_13_0= ruleIconSize ) ) otherlv_14= 'BodyIcon' otherlv_15= '{' ( (lv_BodyIcon_16_0= ruleIconTag ) )* otherlv_17= '}' otherlv_18= 'defaultSpeed' otherlv_19= '=' ( (lv_defaultSpeed_20_0= RULE_INT ) ) otherlv_21= 'snakeTag' otherlv_22= '=' ( (lv_snakeTag_23_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSnakeInitDisplayAccess().getHeadKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_1());
            		
            // InternalGreedySnake.g:1560:3: ( (lv_head_2_0= '(' ) )
            // InternalGreedySnake.g:1561:4: (lv_head_2_0= '(' )
            {
            // InternalGreedySnake.g:1561:4: (lv_head_2_0= '(' )
            // InternalGreedySnake.g:1562:5: lv_head_2_0= '('
            {
            lv_head_2_0=(Token)match(input,24,FOLLOW_10); 

            					newLeafNode(lv_head_2_0, grammarAccess.getSnakeInitDisplayAccess().getHeadLeftParenthesisKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSnakeInitDisplayRule());
            					}
            					setWithLastConsumed(current, "head", lv_head_2_0, "(");
            				

            }


            }

            // InternalGreedySnake.g:1574:3: ( (lv_initial_x_3_0= RULE_INT ) )
            // InternalGreedySnake.g:1575:4: (lv_initial_x_3_0= RULE_INT )
            {
            // InternalGreedySnake.g:1575:4: (lv_initial_x_3_0= RULE_INT )
            // InternalGreedySnake.g:1576:5: lv_initial_x_3_0= RULE_INT
            {
            lv_initial_x_3_0=(Token)match(input,RULE_INT,FOLLOW_34); 

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

            otherlv_4=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getSnakeInitDisplayAccess().getCommaKeyword_4());
            		
            // InternalGreedySnake.g:1596:3: ( (lv_initial_y_5_0= RULE_INT ) )
            // InternalGreedySnake.g:1597:4: (lv_initial_y_5_0= RULE_INT )
            {
            // InternalGreedySnake.g:1597:4: (lv_initial_y_5_0= RULE_INT )
            // InternalGreedySnake.g:1598:5: lv_initial_y_5_0= RULE_INT
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

            otherlv_6=(Token)match(input,25,FOLLOW_35); 

            			newLeafNode(otherlv_6, grammarAccess.getSnakeInitDisplayAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getSnakeInitDisplayAccess().getHeadIconKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getSnakeInitDisplayAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalGreedySnake.g:1626:3: ( (lv_headIcon_9_0= ruleIconTag ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGreedySnake.g:1627:4: (lv_headIcon_9_0= ruleIconTag )
            	    {
            	    // InternalGreedySnake.g:1627:4: (lv_headIcon_9_0= ruleIconTag )
            	    // InternalGreedySnake.g:1628:5: lv_headIcon_9_0= ruleIconTag
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
            	    break loop8;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_10, grammarAccess.getSnakeInitDisplayAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getSnakeInitDisplayAccess().getIcon_sizeKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_12());
            		
            // InternalGreedySnake.g:1657:3: ( (lv_Iconsize_13_0= ruleIconSize ) )
            // InternalGreedySnake.g:1658:4: (lv_Iconsize_13_0= ruleIconSize )
            {
            // InternalGreedySnake.g:1658:4: (lv_Iconsize_13_0= ruleIconSize )
            // InternalGreedySnake.g:1659:5: lv_Iconsize_13_0= ruleIconSize
            {

            					newCompositeNode(grammarAccess.getSnakeInitDisplayAccess().getIconsizeIconSizeParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_14=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getSnakeInitDisplayAccess().getBodyIconKeyword_14());
            		
            otherlv_15=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_15, grammarAccess.getSnakeInitDisplayAccess().getLeftCurlyBracketKeyword_15());
            		
            // InternalGreedySnake.g:1684:3: ( (lv_BodyIcon_16_0= ruleIconTag ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGreedySnake.g:1685:4: (lv_BodyIcon_16_0= ruleIconTag )
            	    {
            	    // InternalGreedySnake.g:1685:4: (lv_BodyIcon_16_0= ruleIconTag )
            	    // InternalGreedySnake.g:1686:5: lv_BodyIcon_16_0= ruleIconTag
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
            	    break loop9;
                }
            } while (true);

            otherlv_17=(Token)match(input,13,FOLLOW_37); 

            			newLeafNode(otherlv_17, grammarAccess.getSnakeInitDisplayAccess().getRightCurlyBracketKeyword_17());
            		
            otherlv_18=(Token)match(input,44,FOLLOW_7); 

            			newLeafNode(otherlv_18, grammarAccess.getSnakeInitDisplayAccess().getDefaultSpeedKeyword_18());
            		
            otherlv_19=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_19, grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_19());
            		
            // InternalGreedySnake.g:1715:3: ( (lv_defaultSpeed_20_0= RULE_INT ) )
            // InternalGreedySnake.g:1716:4: (lv_defaultSpeed_20_0= RULE_INT )
            {
            // InternalGreedySnake.g:1716:4: (lv_defaultSpeed_20_0= RULE_INT )
            // InternalGreedySnake.g:1717:5: lv_defaultSpeed_20_0= RULE_INT
            {
            lv_defaultSpeed_20_0=(Token)match(input,RULE_INT,FOLLOW_38); 

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

            otherlv_21=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_21, grammarAccess.getSnakeInitDisplayAccess().getSnakeTagKeyword_21());
            		
            otherlv_22=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_22, grammarAccess.getSnakeInitDisplayAccess().getEqualsSignKeyword_22());
            		
            // InternalGreedySnake.g:1741:3: ( (lv_snakeTag_23_0= RULE_INT ) )
            // InternalGreedySnake.g:1742:4: (lv_snakeTag_23_0= RULE_INT )
            {
            // InternalGreedySnake.g:1742:4: (lv_snakeTag_23_0= RULE_INT )
            // InternalGreedySnake.g:1743:5: lv_snakeTag_23_0= RULE_INT
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
    // InternalGreedySnake.g:1763:1: entryRuleIconSize returns [String current=null] : iv_ruleIconSize= ruleIconSize EOF ;
    public final String entryRuleIconSize() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIconSize = null;


        try {
            // InternalGreedySnake.g:1763:48: (iv_ruleIconSize= ruleIconSize EOF )
            // InternalGreedySnake.g:1764:2: iv_ruleIconSize= ruleIconSize EOF
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
    // InternalGreedySnake.g:1770:1: ruleIconSize returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleIconSize() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:1776:2: (this_INT_0= RULE_INT )
            // InternalGreedySnake.g:1777:2: this_INT_0= RULE_INT
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
    // InternalGreedySnake.g:1787:1: entryRuleIconTag returns [EObject current=null] : iv_ruleIconTag= ruleIconTag EOF ;
    public final EObject entryRuleIconTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIconTag = null;


        try {
            // InternalGreedySnake.g:1787:48: (iv_ruleIconTag= ruleIconTag EOF )
            // InternalGreedySnake.g:1788:2: iv_ruleIconTag= ruleIconTag EOF
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
    // InternalGreedySnake.g:1794:1: ruleIconTag returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_tag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_Locate_6_0= RULE_STRING ) ) ) ;
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
            // InternalGreedySnake.g:1800:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_tag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_Locate_6_0= RULE_STRING ) ) ) )
            // InternalGreedySnake.g:1801:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_tag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_Locate_6_0= RULE_STRING ) ) )
            {
            // InternalGreedySnake.g:1801:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_tag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_Locate_6_0= RULE_STRING ) ) )
            // InternalGreedySnake.g:1802:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_tag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_Locate_6_0= RULE_STRING ) )
            {
            // InternalGreedySnake.g:1802:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreedySnake.g:1803:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreedySnake.g:1803:4: (lv_name_0_0= RULE_ID )
            // InternalGreedySnake.g:1804:5: lv_name_0_0= RULE_ID
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

            // InternalGreedySnake.g:1820:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalGreedySnake.g:1821:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalGreedySnake.g:1821:4: (lv_value_1_0= RULE_STRING )
            // InternalGreedySnake.g:1822:5: lv_value_1_0= RULE_STRING
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
            		
            // InternalGreedySnake.g:1842:3: ( (lv_tag_3_0= RULE_INT ) )
            // InternalGreedySnake.g:1843:4: (lv_tag_3_0= RULE_INT )
            {
            // InternalGreedySnake.g:1843:4: (lv_tag_3_0= RULE_INT )
            // InternalGreedySnake.g:1844:5: lv_tag_3_0= RULE_INT
            {
            lv_tag_3_0=(Token)match(input,RULE_INT,FOLLOW_39); 

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

            otherlv_4=(Token)match(input,46,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getIconTagAccess().getLocateKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getIconTagAccess().getColonKeyword_5());
            		
            // InternalGreedySnake.g:1868:3: ( (lv_Locate_6_0= RULE_STRING ) )
            // InternalGreedySnake.g:1869:4: (lv_Locate_6_0= RULE_STRING )
            {
            // InternalGreedySnake.g:1869:4: (lv_Locate_6_0= RULE_STRING )
            // InternalGreedySnake.g:1870:5: lv_Locate_6_0= RULE_STRING
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
    // InternalGreedySnake.g:1890:1: entryRuleFoodInitDisplay returns [EObject current=null] : iv_ruleFoodInitDisplay= ruleFoodInitDisplay EOF ;
    public final EObject entryRuleFoodInitDisplay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoodInitDisplay = null;


        try {
            // InternalGreedySnake.g:1890:56: (iv_ruleFoodInitDisplay= ruleFoodInitDisplay EOF )
            // InternalGreedySnake.g:1891:2: iv_ruleFoodInitDisplay= ruleFoodInitDisplay EOF
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
    // InternalGreedySnake.g:1897:1: ruleFoodInitDisplay returns [EObject current=null] : (otherlv_0= 'foodIcon' otherlv_1= '{' ( (lv_foodIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'foodKind' otherlv_8= '{' ( (lv_foodKind_9_0= ruleFoodKind ) )* otherlv_10= '}' otherlv_11= 'randomFoodSize' ( (lv_produce_12_0= ruleRandomFoodSize ) ) otherlv_13= 'foodTag' otherlv_14= '=' ( (lv_foodTag_15_0= RULE_INT ) ) ) ;
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
            // InternalGreedySnake.g:1903:2: ( (otherlv_0= 'foodIcon' otherlv_1= '{' ( (lv_foodIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'foodKind' otherlv_8= '{' ( (lv_foodKind_9_0= ruleFoodKind ) )* otherlv_10= '}' otherlv_11= 'randomFoodSize' ( (lv_produce_12_0= ruleRandomFoodSize ) ) otherlv_13= 'foodTag' otherlv_14= '=' ( (lv_foodTag_15_0= RULE_INT ) ) ) )
            // InternalGreedySnake.g:1904:2: (otherlv_0= 'foodIcon' otherlv_1= '{' ( (lv_foodIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'foodKind' otherlv_8= '{' ( (lv_foodKind_9_0= ruleFoodKind ) )* otherlv_10= '}' otherlv_11= 'randomFoodSize' ( (lv_produce_12_0= ruleRandomFoodSize ) ) otherlv_13= 'foodTag' otherlv_14= '=' ( (lv_foodTag_15_0= RULE_INT ) ) )
            {
            // InternalGreedySnake.g:1904:2: (otherlv_0= 'foodIcon' otherlv_1= '{' ( (lv_foodIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'foodKind' otherlv_8= '{' ( (lv_foodKind_9_0= ruleFoodKind ) )* otherlv_10= '}' otherlv_11= 'randomFoodSize' ( (lv_produce_12_0= ruleRandomFoodSize ) ) otherlv_13= 'foodTag' otherlv_14= '=' ( (lv_foodTag_15_0= RULE_INT ) ) )
            // InternalGreedySnake.g:1905:3: otherlv_0= 'foodIcon' otherlv_1= '{' ( (lv_foodIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'foodKind' otherlv_8= '{' ( (lv_foodKind_9_0= ruleFoodKind ) )* otherlv_10= '}' otherlv_11= 'randomFoodSize' ( (lv_produce_12_0= ruleRandomFoodSize ) ) otherlv_13= 'foodTag' otherlv_14= '=' ( (lv_foodTag_15_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFoodInitDisplayAccess().getFoodIconKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getFoodInitDisplayAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGreedySnake.g:1913:3: ( (lv_foodIcon_2_0= ruleIconTag ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGreedySnake.g:1914:4: (lv_foodIcon_2_0= ruleIconTag )
            	    {
            	    // InternalGreedySnake.g:1914:4: (lv_foodIcon_2_0= ruleIconTag )
            	    // InternalGreedySnake.g:1915:5: lv_foodIcon_2_0= ruleIconTag
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
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getFoodInitDisplayAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getFoodInitDisplayAccess().getIcon_sizeKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getFoodInitDisplayAccess().getEqualsSignKeyword_5());
            		
            // InternalGreedySnake.g:1944:3: ( (lv_Iconsize_6_0= ruleIconSize ) )
            // InternalGreedySnake.g:1945:4: (lv_Iconsize_6_0= ruleIconSize )
            {
            // InternalGreedySnake.g:1945:4: (lv_Iconsize_6_0= ruleIconSize )
            // InternalGreedySnake.g:1946:5: lv_Iconsize_6_0= ruleIconSize
            {

            					newCompositeNode(grammarAccess.getFoodInitDisplayAccess().getIconsizeIconSizeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_40);
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

            otherlv_7=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getFoodInitDisplayAccess().getFoodKindKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getFoodInitDisplayAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalGreedySnake.g:1971:3: ( (lv_foodKind_9_0= ruleFoodKind ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGreedySnake.g:1972:4: (lv_foodKind_9_0= ruleFoodKind )
            	    {
            	    // InternalGreedySnake.g:1972:4: (lv_foodKind_9_0= ruleFoodKind )
            	    // InternalGreedySnake.g:1973:5: lv_foodKind_9_0= ruleFoodKind
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
            	    break loop11;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_41); 

            			newLeafNode(otherlv_10, grammarAccess.getFoodInitDisplayAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,49,FOLLOW_42); 

            			newLeafNode(otherlv_11, grammarAccess.getFoodInitDisplayAccess().getRandomFoodSizeKeyword_11());
            		
            // InternalGreedySnake.g:1998:3: ( (lv_produce_12_0= ruleRandomFoodSize ) )
            // InternalGreedySnake.g:1999:4: (lv_produce_12_0= ruleRandomFoodSize )
            {
            // InternalGreedySnake.g:1999:4: (lv_produce_12_0= ruleRandomFoodSize )
            // InternalGreedySnake.g:2000:5: lv_produce_12_0= ruleRandomFoodSize
            {

            					newCompositeNode(grammarAccess.getFoodInitDisplayAccess().getProduceRandomFoodSizeParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_43);
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

            otherlv_13=(Token)match(input,50,FOLLOW_7); 

            			newLeafNode(otherlv_13, grammarAccess.getFoodInitDisplayAccess().getFoodTagKeyword_13());
            		
            otherlv_14=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_14, grammarAccess.getFoodInitDisplayAccess().getEqualsSignKeyword_14());
            		
            // InternalGreedySnake.g:2025:3: ( (lv_foodTag_15_0= RULE_INT ) )
            // InternalGreedySnake.g:2026:4: (lv_foodTag_15_0= RULE_INT )
            {
            // InternalGreedySnake.g:2026:4: (lv_foodTag_15_0= RULE_INT )
            // InternalGreedySnake.g:2027:5: lv_foodTag_15_0= RULE_INT
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
    // InternalGreedySnake.g:2047:1: entryRuleFoodKind returns [EObject current=null] : iv_ruleFoodKind= ruleFoodKind EOF ;
    public final EObject entryRuleFoodKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoodKind = null;


        try {
            // InternalGreedySnake.g:2047:49: (iv_ruleFoodKind= ruleFoodKind EOF )
            // InternalGreedySnake.g:2048:2: iv_ruleFoodKind= ruleFoodKind EOF
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
    // InternalGreedySnake.g:2054:1: ruleFoodKind returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'point' otherlv_3= '=' ( (lv_point_4_0= ruleAddition ) ) ) ;
    public final EObject ruleFoodKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_point_4_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:2060:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'point' otherlv_3= '=' ( (lv_point_4_0= ruleAddition ) ) ) )
            // InternalGreedySnake.g:2061:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'point' otherlv_3= '=' ( (lv_point_4_0= ruleAddition ) ) )
            {
            // InternalGreedySnake.g:2061:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'point' otherlv_3= '=' ( (lv_point_4_0= ruleAddition ) ) )
            // InternalGreedySnake.g:2062:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'point' otherlv_3= '=' ( (lv_point_4_0= ruleAddition ) )
            {
            // InternalGreedySnake.g:2062:3: ( (otherlv_0= RULE_ID ) )
            // InternalGreedySnake.g:2063:4: (otherlv_0= RULE_ID )
            {
            // InternalGreedySnake.g:2063:4: (otherlv_0= RULE_ID )
            // InternalGreedySnake.g:2064:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFoodKindRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_0, grammarAccess.getFoodKindAccess().getKindIconTagCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getFoodKindAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFoodKindAccess().getPointKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_45); 

            			newLeafNode(otherlv_3, grammarAccess.getFoodKindAccess().getEqualsSignKeyword_3());
            		
            // InternalGreedySnake.g:2087:3: ( (lv_point_4_0= ruleAddition ) )
            // InternalGreedySnake.g:2088:4: (lv_point_4_0= ruleAddition )
            {
            // InternalGreedySnake.g:2088:4: (lv_point_4_0= ruleAddition )
            // InternalGreedySnake.g:2089:5: lv_point_4_0= ruleAddition
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
    // InternalGreedySnake.g:2110:1: entryRuleObstacleInitDisplay returns [EObject current=null] : iv_ruleObstacleInitDisplay= ruleObstacleInitDisplay EOF ;
    public final EObject entryRuleObstacleInitDisplay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacleInitDisplay = null;


        try {
            // InternalGreedySnake.g:2110:60: (iv_ruleObstacleInitDisplay= ruleObstacleInitDisplay EOF )
            // InternalGreedySnake.g:2111:2: iv_ruleObstacleInitDisplay= ruleObstacleInitDisplay EOF
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
    // InternalGreedySnake.g:2117:1: ruleObstacleInitDisplay returns [EObject current=null] : (otherlv_0= 'ObstacleIcon' otherlv_1= '{' ( (lv_ObstacleIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'ObstacleTag' otherlv_8= '=' ( (lv_ObstacleTag_9_0= RULE_INT ) ) ) ;
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
            // InternalGreedySnake.g:2123:2: ( (otherlv_0= 'ObstacleIcon' otherlv_1= '{' ( (lv_ObstacleIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'ObstacleTag' otherlv_8= '=' ( (lv_ObstacleTag_9_0= RULE_INT ) ) ) )
            // InternalGreedySnake.g:2124:2: (otherlv_0= 'ObstacleIcon' otherlv_1= '{' ( (lv_ObstacleIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'ObstacleTag' otherlv_8= '=' ( (lv_ObstacleTag_9_0= RULE_INT ) ) )
            {
            // InternalGreedySnake.g:2124:2: (otherlv_0= 'ObstacleIcon' otherlv_1= '{' ( (lv_ObstacleIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'ObstacleTag' otherlv_8= '=' ( (lv_ObstacleTag_9_0= RULE_INT ) ) )
            // InternalGreedySnake.g:2125:3: otherlv_0= 'ObstacleIcon' otherlv_1= '{' ( (lv_ObstacleIcon_2_0= ruleIconTag ) )* otherlv_3= '}' otherlv_4= 'Icon_size' otherlv_5= '=' ( (lv_Iconsize_6_0= ruleIconSize ) ) otherlv_7= 'ObstacleTag' otherlv_8= '=' ( (lv_ObstacleTag_9_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObstacleInitDisplayAccess().getObstacleIconKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getObstacleInitDisplayAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGreedySnake.g:2133:3: ( (lv_ObstacleIcon_2_0= ruleIconTag ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGreedySnake.g:2134:4: (lv_ObstacleIcon_2_0= ruleIconTag )
            	    {
            	    // InternalGreedySnake.g:2134:4: (lv_ObstacleIcon_2_0= ruleIconTag )
            	    // InternalGreedySnake.g:2135:5: lv_ObstacleIcon_2_0= ruleIconTag
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
            	    break loop12;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getObstacleInitDisplayAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getObstacleInitDisplayAccess().getIcon_sizeKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getObstacleInitDisplayAccess().getEqualsSignKeyword_5());
            		
            // InternalGreedySnake.g:2164:3: ( (lv_Iconsize_6_0= ruleIconSize ) )
            // InternalGreedySnake.g:2165:4: (lv_Iconsize_6_0= ruleIconSize )
            {
            // InternalGreedySnake.g:2165:4: (lv_Iconsize_6_0= ruleIconSize )
            // InternalGreedySnake.g:2166:5: lv_Iconsize_6_0= ruleIconSize
            {

            					newCompositeNode(grammarAccess.getObstacleInitDisplayAccess().getIconsizeIconSizeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_46);
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

            otherlv_7=(Token)match(input,53,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getObstacleInitDisplayAccess().getObstacleTagKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getObstacleInitDisplayAccess().getEqualsSignKeyword_8());
            		
            // InternalGreedySnake.g:2191:3: ( (lv_ObstacleTag_9_0= RULE_INT ) )
            // InternalGreedySnake.g:2192:4: (lv_ObstacleTag_9_0= RULE_INT )
            {
            // InternalGreedySnake.g:2192:4: (lv_ObstacleTag_9_0= RULE_INT )
            // InternalGreedySnake.g:2193:5: lv_ObstacleTag_9_0= RULE_INT
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
    // InternalGreedySnake.g:2213:1: entryRuleRandomFoodSize returns [EObject current=null] : iv_ruleRandomFoodSize= ruleRandomFoodSize EOF ;
    public final EObject entryRuleRandomFoodSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomFoodSize = null;


        try {
            // InternalGreedySnake.g:2213:55: (iv_ruleRandomFoodSize= ruleRandomFoodSize EOF )
            // InternalGreedySnake.g:2214:2: iv_ruleRandomFoodSize= ruleRandomFoodSize EOF
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
    // InternalGreedySnake.g:2220:1: ruleRandomFoodSize returns [EObject current=null] : (otherlv_0= 'Maxsize' ( (lv_maxsize_1_0= RULE_INT ) ) otherlv_2= 'Minsize' ( (lv_minsize_3_0= RULE_INT ) ) ) ;
    public final EObject ruleRandomFoodSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_maxsize_1_0=null;
        Token otherlv_2=null;
        Token lv_minsize_3_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:2226:2: ( (otherlv_0= 'Maxsize' ( (lv_maxsize_1_0= RULE_INT ) ) otherlv_2= 'Minsize' ( (lv_minsize_3_0= RULE_INT ) ) ) )
            // InternalGreedySnake.g:2227:2: (otherlv_0= 'Maxsize' ( (lv_maxsize_1_0= RULE_INT ) ) otherlv_2= 'Minsize' ( (lv_minsize_3_0= RULE_INT ) ) )
            {
            // InternalGreedySnake.g:2227:2: (otherlv_0= 'Maxsize' ( (lv_maxsize_1_0= RULE_INT ) ) otherlv_2= 'Minsize' ( (lv_minsize_3_0= RULE_INT ) ) )
            // InternalGreedySnake.g:2228:3: otherlv_0= 'Maxsize' ( (lv_maxsize_1_0= RULE_INT ) ) otherlv_2= 'Minsize' ( (lv_minsize_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRandomFoodSizeAccess().getMaxsizeKeyword_0());
            		
            // InternalGreedySnake.g:2232:3: ( (lv_maxsize_1_0= RULE_INT ) )
            // InternalGreedySnake.g:2233:4: (lv_maxsize_1_0= RULE_INT )
            {
            // InternalGreedySnake.g:2233:4: (lv_maxsize_1_0= RULE_INT )
            // InternalGreedySnake.g:2234:5: lv_maxsize_1_0= RULE_INT
            {
            lv_maxsize_1_0=(Token)match(input,RULE_INT,FOLLOW_47); 

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

            otherlv_2=(Token)match(input,55,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRandomFoodSizeAccess().getMinsizeKeyword_2());
            		
            // InternalGreedySnake.g:2254:3: ( (lv_minsize_3_0= RULE_INT ) )
            // InternalGreedySnake.g:2255:4: (lv_minsize_3_0= RULE_INT )
            {
            // InternalGreedySnake.g:2255:4: (lv_minsize_3_0= RULE_INT )
            // InternalGreedySnake.g:2256:5: lv_minsize_3_0= RULE_INT
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
    // InternalGreedySnake.g:2276:1: entryRuleTimeLimited returns [EObject current=null] : iv_ruleTimeLimited= ruleTimeLimited EOF ;
    public final EObject entryRuleTimeLimited() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLimited = null;


        try {
            // InternalGreedySnake.g:2276:52: (iv_ruleTimeLimited= ruleTimeLimited EOF )
            // InternalGreedySnake.g:2277:2: iv_ruleTimeLimited= ruleTimeLimited EOF
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
    // InternalGreedySnake.g:2283:1: ruleTimeLimited returns [EObject current=null] : ( (otherlv_0= 'timeLimited' otherlv_1= '{' this_FoodTime_2= ruleFoodTime ) | (this_ObstacleTime_3= ruleObstacleTime otherlv_4= '}' ) ) ;
    public final EObject ruleTimeLimited() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_FoodTime_2 = null;

        EObject this_ObstacleTime_3 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:2289:2: ( ( (otherlv_0= 'timeLimited' otherlv_1= '{' this_FoodTime_2= ruleFoodTime ) | (this_ObstacleTime_3= ruleObstacleTime otherlv_4= '}' ) ) )
            // InternalGreedySnake.g:2290:2: ( (otherlv_0= 'timeLimited' otherlv_1= '{' this_FoodTime_2= ruleFoodTime ) | (this_ObstacleTime_3= ruleObstacleTime otherlv_4= '}' ) )
            {
            // InternalGreedySnake.g:2290:2: ( (otherlv_0= 'timeLimited' otherlv_1= '{' this_FoodTime_2= ruleFoodTime ) | (this_ObstacleTime_3= ruleObstacleTime otherlv_4= '}' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==56) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGreedySnake.g:2291:3: (otherlv_0= 'timeLimited' otherlv_1= '{' this_FoodTime_2= ruleFoodTime )
                    {
                    // InternalGreedySnake.g:2291:3: (otherlv_0= 'timeLimited' otherlv_1= '{' this_FoodTime_2= ruleFoodTime )
                    // InternalGreedySnake.g:2292:4: otherlv_0= 'timeLimited' otherlv_1= '{' this_FoodTime_2= ruleFoodTime
                    {
                    otherlv_0=(Token)match(input,56,FOLLOW_4); 

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
                    // InternalGreedySnake.g:2310:3: (this_ObstacleTime_3= ruleObstacleTime otherlv_4= '}' )
                    {
                    // InternalGreedySnake.g:2310:3: (this_ObstacleTime_3= ruleObstacleTime otherlv_4= '}' )
                    // InternalGreedySnake.g:2311:4: this_ObstacleTime_3= ruleObstacleTime otherlv_4= '}'
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
    // InternalGreedySnake.g:2328:1: entryRuleObstacleTime returns [EObject current=null] : iv_ruleObstacleTime= ruleObstacleTime EOF ;
    public final EObject entryRuleObstacleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacleTime = null;


        try {
            // InternalGreedySnake.g:2328:53: (iv_ruleObstacleTime= ruleObstacleTime EOF )
            // InternalGreedySnake.g:2329:2: iv_ruleObstacleTime= ruleObstacleTime EOF
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
    // InternalGreedySnake.g:2335:1: ruleObstacleTime returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_ObstacleTime_2_0= RULE_INT ) ) ) ;
    public final EObject ruleObstacleTime() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_ObstacleTime_2_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:2341:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_ObstacleTime_2_0= RULE_INT ) ) ) )
            // InternalGreedySnake.g:2342:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_ObstacleTime_2_0= RULE_INT ) ) )
            {
            // InternalGreedySnake.g:2342:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_ObstacleTime_2_0= RULE_INT ) ) )
            // InternalGreedySnake.g:2343:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_ObstacleTime_2_0= RULE_INT ) )
            {
            // InternalGreedySnake.g:2343:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreedySnake.g:2344:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreedySnake.g:2344:4: (lv_name_0_0= RULE_ID )
            // InternalGreedySnake.g:2345:5: lv_name_0_0= RULE_ID
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
            		
            // InternalGreedySnake.g:2365:3: ( (lv_ObstacleTime_2_0= RULE_INT ) )
            // InternalGreedySnake.g:2366:4: (lv_ObstacleTime_2_0= RULE_INT )
            {
            // InternalGreedySnake.g:2366:4: (lv_ObstacleTime_2_0= RULE_INT )
            // InternalGreedySnake.g:2367:5: lv_ObstacleTime_2_0= RULE_INT
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
    // InternalGreedySnake.g:2387:1: entryRuleFoodTime returns [EObject current=null] : iv_ruleFoodTime= ruleFoodTime EOF ;
    public final EObject entryRuleFoodTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoodTime = null;


        try {
            // InternalGreedySnake.g:2387:49: (iv_ruleFoodTime= ruleFoodTime EOF )
            // InternalGreedySnake.g:2388:2: iv_ruleFoodTime= ruleFoodTime EOF
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
    // InternalGreedySnake.g:2394:1: ruleFoodTime returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_FoodTime_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFoodTime() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_FoodTime_2_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:2400:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_FoodTime_2_0= RULE_INT ) ) ) )
            // InternalGreedySnake.g:2401:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_FoodTime_2_0= RULE_INT ) ) )
            {
            // InternalGreedySnake.g:2401:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_FoodTime_2_0= RULE_INT ) ) )
            // InternalGreedySnake.g:2402:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_FoodTime_2_0= RULE_INT ) )
            {
            // InternalGreedySnake.g:2402:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreedySnake.g:2403:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreedySnake.g:2403:4: (lv_name_0_0= RULE_ID )
            // InternalGreedySnake.g:2404:5: lv_name_0_0= RULE_ID
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
            		
            // InternalGreedySnake.g:2424:3: ( (lv_FoodTime_2_0= RULE_INT ) )
            // InternalGreedySnake.g:2425:4: (lv_FoodTime_2_0= RULE_INT )
            {
            // InternalGreedySnake.g:2425:4: (lv_FoodTime_2_0= RULE_INT )
            // InternalGreedySnake.g:2426:5: lv_FoodTime_2_0= RULE_INT
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


    // $ANTLR start "entryRuleAllItemVarSpec"
    // InternalGreedySnake.g:2446:1: entryRuleAllItemVarSpec returns [EObject current=null] : iv_ruleAllItemVarSpec= ruleAllItemVarSpec EOF ;
    public final EObject entryRuleAllItemVarSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllItemVarSpec = null;


        try {
            // InternalGreedySnake.g:2446:55: (iv_ruleAllItemVarSpec= ruleAllItemVarSpec EOF )
            // InternalGreedySnake.g:2447:2: iv_ruleAllItemVarSpec= ruleAllItemVarSpec EOF
            {
             newCompositeNode(grammarAccess.getAllItemVarSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllItemVarSpec=ruleAllItemVarSpec();

            state._fsp--;

             current =iv_ruleAllItemVarSpec; 
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
    // $ANTLR end "entryRuleAllItemVarSpec"


    // $ANTLR start "ruleAllItemVarSpec"
    // InternalGreedySnake.g:2453:1: ruleAllItemVarSpec returns [EObject current=null] : ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' ) ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAllItemVarSpec() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:2459:2: ( ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' ) ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGreedySnake.g:2460:2: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' ) ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGreedySnake.g:2460:2: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' ) ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGreedySnake.g:2461:3: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' ) ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGreedySnake.g:2461:3: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' ) ) )
            // InternalGreedySnake.g:2462:4: ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' ) )
            {
            // InternalGreedySnake.g:2462:4: ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' ) )
            // InternalGreedySnake.g:2463:5: (lv_type_0_1= 'int' | lv_type_0_2= 'String' )
            {
            // InternalGreedySnake.g:2463:5: (lv_type_0_1= 'int' | lv_type_0_2= 'String' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==57) ) {
                alt14=1;
            }
            else if ( (LA14_0==58) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalGreedySnake.g:2464:6: lv_type_0_1= 'int'
                    {
                    lv_type_0_1=(Token)match(input,57,FOLLOW_3); 

                    						newLeafNode(lv_type_0_1, grammarAccess.getAllItemVarSpecAccess().getTypeIntKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllItemVarSpecRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:2475:6: lv_type_0_2= 'String'
                    {
                    lv_type_0_2=(Token)match(input,58,FOLLOW_3); 

                    						newLeafNode(lv_type_0_2, grammarAccess.getAllItemVarSpecAccess().getTypeStringKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllItemVarSpecRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalGreedySnake.g:2488:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:2489:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:2489:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:2490:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAllItemVarSpecAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllItemVarSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleAllItemVarSpec"


    // $ANTLR start "entryRuleParamSpec"
    // InternalGreedySnake.g:2510:1: entryRuleParamSpec returns [EObject current=null] : iv_ruleParamSpec= ruleParamSpec EOF ;
    public final EObject entryRuleParamSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamSpec = null;


        try {
            // InternalGreedySnake.g:2510:50: (iv_ruleParamSpec= ruleParamSpec EOF )
            // InternalGreedySnake.g:2511:2: iv_ruleParamSpec= ruleParamSpec EOF
            {
             newCompositeNode(grammarAccess.getParamSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamSpec=ruleParamSpec();

            state._fsp--;

             current =iv_ruleParamSpec; 
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
    // $ANTLR end "entryRuleParamSpec"


    // $ANTLR start "ruleParamSpec"
    // InternalGreedySnake.g:2517:1: ruleParamSpec returns [EObject current=null] : ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' ) ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParamSpec() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:2523:2: ( ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' ) ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGreedySnake.g:2524:2: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' ) ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGreedySnake.g:2524:2: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' ) ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGreedySnake.g:2525:3: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' ) ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGreedySnake.g:2525:3: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' ) ) )
            // InternalGreedySnake.g:2526:4: ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' ) )
            {
            // InternalGreedySnake.g:2526:4: ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' ) )
            // InternalGreedySnake.g:2527:5: (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' )
            {
            // InternalGreedySnake.g:2527:5: (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt15=1;
                }
                break;
            case 58:
                {
                alt15=2;
                }
                break;
            case 59:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalGreedySnake.g:2528:6: lv_type_0_1= 'int'
                    {
                    lv_type_0_1=(Token)match(input,57,FOLLOW_3); 

                    						newLeafNode(lv_type_0_1, grammarAccess.getParamSpecAccess().getTypeIntKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamSpecRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalGreedySnake.g:2539:6: lv_type_0_2= 'String'
                    {
                    lv_type_0_2=(Token)match(input,58,FOLLOW_3); 

                    						newLeafNode(lv_type_0_2, grammarAccess.getParamSpecAccess().getTypeStringKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamSpecRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalGreedySnake.g:2550:6: lv_type_0_3= 'Behaviour'
                    {
                    lv_type_0_3=(Token)match(input,59,FOLLOW_3); 

                    						newLeafNode(lv_type_0_3, grammarAccess.getParamSpecAccess().getTypeBehaviourKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamSpecRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalGreedySnake.g:2563:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:2564:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:2564:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:2565:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParamSpecAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleParamSpec"


    // $ANTLR start "entryRuleAddition"
    // InternalGreedySnake.g:2585:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalGreedySnake.g:2585:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalGreedySnake.g:2586:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalGreedySnake.g:2592:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:2598:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalGreedySnake.g:2599:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalGreedySnake.g:2599:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalGreedySnake.g:2600:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGreedySnake.g:2608:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=60 && LA17_0<=61)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGreedySnake.g:2609:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalGreedySnake.g:2609:4: ()
            	    // InternalGreedySnake.g:2610:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalGreedySnake.g:2616:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalGreedySnake.g:2617:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalGreedySnake.g:2617:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalGreedySnake.g:2618:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalGreedySnake.g:2618:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==60) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==61) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalGreedySnake.g:2619:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,60,FOLLOW_45); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalGreedySnake.g:2630:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,61,FOLLOW_45); 

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

            	    // InternalGreedySnake.g:2643:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalGreedySnake.g:2644:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalGreedySnake.g:2644:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalGreedySnake.g:2645:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_48);
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
            	    break loop17;
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
    // InternalGreedySnake.g:2667:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalGreedySnake.g:2667:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalGreedySnake.g:2668:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalGreedySnake.g:2674:1: ruleMultiplication returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:2680:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalGreedySnake.g:2681:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalGreedySnake.g:2681:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalGreedySnake.g:2682:3: this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGreedySnake.g:2690:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=62 && LA19_0<=63)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGreedySnake.g:2691:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalGreedySnake.g:2691:4: ()
            	    // InternalGreedySnake.g:2692:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalGreedySnake.g:2698:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalGreedySnake.g:2699:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalGreedySnake.g:2699:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalGreedySnake.g:2700:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalGreedySnake.g:2700:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==62) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==63) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalGreedySnake.g:2701:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,62,FOLLOW_45); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalGreedySnake.g:2712:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,63,FOLLOW_45); 

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

            	    // InternalGreedySnake.g:2725:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalGreedySnake.g:2726:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalGreedySnake.g:2726:5: (lv_right_3_0= rulePrimary )
            	    // InternalGreedySnake.g:2727:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_49);
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalGreedySnake.g:2749:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalGreedySnake.g:2749:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalGreedySnake.g:2750:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalGreedySnake.g:2756:1: rulePrimary returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_IntLiteral_0 = null;

        EObject this_RealLiteral_1 = null;

        EObject this_Addition_3 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:2762:2: ( (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) ) )
            // InternalGreedySnake.g:2763:2: (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) )
            {
            // InternalGreedySnake.g:2763:2: (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==64) ) {
                    alt20=2;
                }
                else if ( (LA20_1==EOF||LA20_1==RULE_ID||LA20_1==13||LA20_1==25||(LA20_1>=60 && LA20_1<=63)) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case 64:
                {
                alt20=2;
                }
                break;
            case 24:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalGreedySnake.g:2764:3: this_IntLiteral_0= ruleIntLiteral
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
                    // InternalGreedySnake.g:2773:3: this_RealLiteral_1= ruleRealLiteral
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
                    // InternalGreedySnake.g:2782:3: (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' )
                    {
                    // InternalGreedySnake.g:2782:3: (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' )
                    // InternalGreedySnake.g:2783:4: otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_45); 

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
    // InternalGreedySnake.g:2804:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalGreedySnake.g:2804:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalGreedySnake.g:2805:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalGreedySnake.g:2811:1: ruleIntLiteral returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:2817:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalGreedySnake.g:2818:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalGreedySnake.g:2818:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalGreedySnake.g:2819:3: (lv_val_0_0= RULE_INT )
            {
            // InternalGreedySnake.g:2819:3: (lv_val_0_0= RULE_INT )
            // InternalGreedySnake.g:2820:4: lv_val_0_0= RULE_INT
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
    // InternalGreedySnake.g:2839:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalGreedySnake.g:2839:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalGreedySnake.g:2840:2: iv_ruleRealLiteral= ruleRealLiteral EOF
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
    // InternalGreedySnake.g:2846:1: ruleRealLiteral returns [EObject current=null] : ( (lv_val_0_0= ruleREAL ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:2852:2: ( ( (lv_val_0_0= ruleREAL ) ) )
            // InternalGreedySnake.g:2853:2: ( (lv_val_0_0= ruleREAL ) )
            {
            // InternalGreedySnake.g:2853:2: ( (lv_val_0_0= ruleREAL ) )
            // InternalGreedySnake.g:2854:3: (lv_val_0_0= ruleREAL )
            {
            // InternalGreedySnake.g:2854:3: (lv_val_0_0= ruleREAL )
            // InternalGreedySnake.g:2855:4: lv_val_0_0= ruleREAL
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
    // InternalGreedySnake.g:2875:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalGreedySnake.g:2877:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalGreedySnake.g:2878:2: iv_ruleREAL= ruleREAL EOF
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
    // InternalGreedySnake.g:2887:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalGreedySnake.g:2894:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalGreedySnake.g:2895:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalGreedySnake.g:2895:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalGreedySnake.g:2896:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalGreedySnake.g:2896:3: (this_INT_0= RULE_INT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGreedySnake.g:2897:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,64,FOLLOW_10); 

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
    // InternalGreedySnake.g:2924:1: entryRuleOptionSpecification returns [EObject current=null] : iv_ruleOptionSpecification= ruleOptionSpecification EOF ;
    public final EObject entryRuleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionSpecification = null;


        try {
            // InternalGreedySnake.g:2924:60: (iv_ruleOptionSpecification= ruleOptionSpecification EOF )
            // InternalGreedySnake.g:2925:2: iv_ruleOptionSpecification= ruleOptionSpecification EOF
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
    // InternalGreedySnake.g:2931:1: ruleOptionSpecification returns [EObject current=null] : (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_RestartMenu_1= ruleRestartMenu ) ;
    public final EObject ruleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StartFieldDeclaration_0 = null;

        EObject this_RestartMenu_1 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:2937:2: ( (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_RestartMenu_1= ruleRestartMenu ) )
            // InternalGreedySnake.g:2938:2: (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_RestartMenu_1= ruleRestartMenu )
            {
            // InternalGreedySnake.g:2938:2: (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_RestartMenu_1= ruleRestartMenu )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==66) ) {
                alt22=1;
            }
            else if ( (LA22_0==65) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalGreedySnake.g:2939:3: this_StartFieldDeclaration_0= ruleStartFieldDeclaration
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
                    // InternalGreedySnake.g:2948:3: this_RestartMenu_1= ruleRestartMenu
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
    // InternalGreedySnake.g:2960:1: entryRuleRestartMenu returns [EObject current=null] : iv_ruleRestartMenu= ruleRestartMenu EOF ;
    public final EObject entryRuleRestartMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestartMenu = null;


        try {
            // InternalGreedySnake.g:2960:52: (iv_ruleRestartMenu= ruleRestartMenu EOF )
            // InternalGreedySnake.g:2961:2: iv_ruleRestartMenu= ruleRestartMenu EOF
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
    // InternalGreedySnake.g:2967:1: ruleRestartMenu returns [EObject current=null] : (otherlv_0= 'restartGame' () ) ;
    public final EObject ruleRestartMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:2973:2: ( (otherlv_0= 'restartGame' () ) )
            // InternalGreedySnake.g:2974:2: (otherlv_0= 'restartGame' () )
            {
            // InternalGreedySnake.g:2974:2: (otherlv_0= 'restartGame' () )
            // InternalGreedySnake.g:2975:3: otherlv_0= 'restartGame' ()
            {
            otherlv_0=(Token)match(input,65,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getRestartMenuAccess().getRestartGameKeyword_0());
            		
            // InternalGreedySnake.g:2979:3: ()
            // InternalGreedySnake.g:2980:4: 
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
    // InternalGreedySnake.g:2990:1: entryRuleStartFieldDeclaration returns [EObject current=null] : iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF ;
    public final EObject entryRuleStartFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartFieldDeclaration = null;


        try {
            // InternalGreedySnake.g:2990:62: (iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF )
            // InternalGreedySnake.g:2991:2: iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF
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
    // InternalGreedySnake.g:2997:1: ruleStartFieldDeclaration returns [EObject current=null] : (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleStartFieldDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:3003:2: ( (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalGreedySnake.g:3004:2: (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalGreedySnake.g:3004:2: (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // InternalGreedySnake.g:3005:3: otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1());
            		
            // InternalGreedySnake.g:3013:3: ( (otherlv_2= RULE_ID ) )
            // InternalGreedySnake.g:3014:4: (otherlv_2= RULE_ID )
            {
            // InternalGreedySnake.g:3014:4: (otherlv_2= RULE_ID )
            // InternalGreedySnake.g:3015:5: otherlv_2= RULE_ID
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
    // InternalGreedySnake.g:3030:1: entryRuleAboutSpecification returns [EObject current=null] : iv_ruleAboutSpecification= ruleAboutSpecification EOF ;
    public final EObject entryRuleAboutSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAboutSpecification = null;


        try {
            // InternalGreedySnake.g:3030:59: (iv_ruleAboutSpecification= ruleAboutSpecification EOF )
            // InternalGreedySnake.g:3031:2: iv_ruleAboutSpecification= ruleAboutSpecification EOF
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
    // InternalGreedySnake.g:3037:1: ruleAboutSpecification returns [EObject current=null] : (otherlv_0= 'about' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_AboutTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_AboutInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}' ) ;
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
            // InternalGreedySnake.g:3043:2: ( (otherlv_0= 'about' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_AboutTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_AboutInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}' ) )
            // InternalGreedySnake.g:3044:2: (otherlv_0= 'about' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_AboutTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_AboutInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}' )
            {
            // InternalGreedySnake.g:3044:2: (otherlv_0= 'about' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_AboutTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_AboutInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}' )
            // InternalGreedySnake.g:3045:3: otherlv_0= 'about' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_AboutTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_AboutInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAboutSpecificationAccess().getAboutKeyword_0());
            		
            // InternalGreedySnake.g:3049:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:3050:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:3050:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:3051:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getAboutSpecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,68,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getAboutSpecificationAccess().getTitleKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getAboutSpecificationAccess().getColonKeyword_4());
            		
            // InternalGreedySnake.g:3079:3: ( (lv_AboutTitle_5_0= RULE_STRING ) )
            // InternalGreedySnake.g:3080:4: (lv_AboutTitle_5_0= RULE_STRING )
            {
            // InternalGreedySnake.g:3080:4: (lv_AboutTitle_5_0= RULE_STRING )
            // InternalGreedySnake.g:3081:5: lv_AboutTitle_5_0= RULE_STRING
            {
            lv_AboutTitle_5_0=(Token)match(input,RULE_STRING,FOLLOW_52); 

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

            otherlv_6=(Token)match(input,69,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getAboutSpecificationAccess().getInformationKeyword_6());
            		
            otherlv_7=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getAboutSpecificationAccess().getColonKeyword_7());
            		
            // InternalGreedySnake.g:3105:3: ( (lv_AboutInfor_8_0= RULE_STRING ) )
            // InternalGreedySnake.g:3106:4: (lv_AboutInfor_8_0= RULE_STRING )
            {
            // InternalGreedySnake.g:3106:4: (lv_AboutInfor_8_0= RULE_STRING )
            // InternalGreedySnake.g:3107:5: lv_AboutInfor_8_0= RULE_STRING
            {
            lv_AboutInfor_8_0=(Token)match(input,RULE_STRING,FOLLOW_53); 

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

            otherlv_9=(Token)match(input,70,FOLLOW_21); 

            			newLeafNode(otherlv_9, grammarAccess.getAboutSpecificationAccess().getLabel_sizeKeyword_9());
            		
            otherlv_10=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getAboutSpecificationAccess().getColonKeyword_10());
            		
            otherlv_11=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getAboutSpecificationAccess().getLeftParenthesisKeyword_11());
            		
            // InternalGreedySnake.g:3135:3: ( (lv_x_12_0= RULE_INT ) )
            // InternalGreedySnake.g:3136:4: (lv_x_12_0= RULE_INT )
            {
            // InternalGreedySnake.g:3136:4: (lv_x_12_0= RULE_INT )
            // InternalGreedySnake.g:3137:5: lv_x_12_0= RULE_INT
            {
            lv_x_12_0=(Token)match(input,RULE_INT,FOLLOW_34); 

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

            otherlv_13=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getAboutSpecificationAccess().getCommaKeyword_13());
            		
            // InternalGreedySnake.g:3157:3: ( (lv_y_14_0= RULE_INT ) )
            // InternalGreedySnake.g:3158:4: (lv_y_14_0= RULE_INT )
            {
            // InternalGreedySnake.g:3158:4: (lv_y_14_0= RULE_INT )
            // InternalGreedySnake.g:3159:5: lv_y_14_0= RULE_INT
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
    // InternalGreedySnake.g:3187:1: entryRuleHelpSpecification returns [EObject current=null] : iv_ruleHelpSpecification= ruleHelpSpecification EOF ;
    public final EObject entryRuleHelpSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelpSpecification = null;


        try {
            // InternalGreedySnake.g:3187:58: (iv_ruleHelpSpecification= ruleHelpSpecification EOF )
            // InternalGreedySnake.g:3188:2: iv_ruleHelpSpecification= ruleHelpSpecification EOF
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
    // InternalGreedySnake.g:3194:1: ruleHelpSpecification returns [EObject current=null] : (otherlv_0= 'help' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_HelpTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_HelpInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}' ) ;
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
            // InternalGreedySnake.g:3200:2: ( (otherlv_0= 'help' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_HelpTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_HelpInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}' ) )
            // InternalGreedySnake.g:3201:2: (otherlv_0= 'help' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_HelpTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_HelpInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}' )
            {
            // InternalGreedySnake.g:3201:2: (otherlv_0= 'help' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_HelpTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_HelpInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}' )
            // InternalGreedySnake.g:3202:3: otherlv_0= 'help' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' otherlv_4= ':' ( (lv_HelpTitle_5_0= RULE_STRING ) ) otherlv_6= 'Information' otherlv_7= ':' ( (lv_HelpInfor_8_0= RULE_STRING ) ) otherlv_9= 'Label_size' otherlv_10= ':' otherlv_11= '(' ( (lv_x_12_0= RULE_INT ) ) otherlv_13= ',' ( (lv_y_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHelpSpecificationAccess().getHelpKeyword_0());
            		
            // InternalGreedySnake.g:3206:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreedySnake.g:3207:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreedySnake.g:3207:4: (lv_name_1_0= RULE_ID )
            // InternalGreedySnake.g:3208:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getHelpSpecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,68,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getHelpSpecificationAccess().getTitleKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getHelpSpecificationAccess().getColonKeyword_4());
            		
            // InternalGreedySnake.g:3236:3: ( (lv_HelpTitle_5_0= RULE_STRING ) )
            // InternalGreedySnake.g:3237:4: (lv_HelpTitle_5_0= RULE_STRING )
            {
            // InternalGreedySnake.g:3237:4: (lv_HelpTitle_5_0= RULE_STRING )
            // InternalGreedySnake.g:3238:5: lv_HelpTitle_5_0= RULE_STRING
            {
            lv_HelpTitle_5_0=(Token)match(input,RULE_STRING,FOLLOW_52); 

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

            otherlv_6=(Token)match(input,69,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getHelpSpecificationAccess().getInformationKeyword_6());
            		
            otherlv_7=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getHelpSpecificationAccess().getColonKeyword_7());
            		
            // InternalGreedySnake.g:3262:3: ( (lv_HelpInfor_8_0= RULE_STRING ) )
            // InternalGreedySnake.g:3263:4: (lv_HelpInfor_8_0= RULE_STRING )
            {
            // InternalGreedySnake.g:3263:4: (lv_HelpInfor_8_0= RULE_STRING )
            // InternalGreedySnake.g:3264:5: lv_HelpInfor_8_0= RULE_STRING
            {
            lv_HelpInfor_8_0=(Token)match(input,RULE_STRING,FOLLOW_53); 

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

            otherlv_9=(Token)match(input,70,FOLLOW_21); 

            			newLeafNode(otherlv_9, grammarAccess.getHelpSpecificationAccess().getLabel_sizeKeyword_9());
            		
            otherlv_10=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getHelpSpecificationAccess().getColonKeyword_10());
            		
            otherlv_11=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getHelpSpecificationAccess().getLeftParenthesisKeyword_11());
            		
            // InternalGreedySnake.g:3292:3: ( (lv_x_12_0= RULE_INT ) )
            // InternalGreedySnake.g:3293:4: (lv_x_12_0= RULE_INT )
            {
            // InternalGreedySnake.g:3293:4: (lv_x_12_0= RULE_INT )
            // InternalGreedySnake.g:3294:5: lv_x_12_0= RULE_INT
            {
            lv_x_12_0=(Token)match(input,RULE_INT,FOLLOW_34); 

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

            otherlv_13=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getHelpSpecificationAccess().getCommaKeyword_13());
            		
            // InternalGreedySnake.g:3314:3: ( (lv_y_14_0= RULE_INT ) )
            // InternalGreedySnake.g:3315:4: (lv_y_14_0= RULE_INT )
            {
            // InternalGreedySnake.g:3315:4: (lv_y_14_0= RULE_INT )
            // InternalGreedySnake.g:3316:5: lv_y_14_0= RULE_INT
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
    // InternalGreedySnake.g:3344:1: entryRuleBackSpecification returns [EObject current=null] : iv_ruleBackSpecification= ruleBackSpecification EOF ;
    public final EObject entryRuleBackSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackSpecification = null;


        try {
            // InternalGreedySnake.g:3344:58: (iv_ruleBackSpecification= ruleBackSpecification EOF )
            // InternalGreedySnake.g:3345:2: iv_ruleBackSpecification= ruleBackSpecification EOF
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
    // InternalGreedySnake.g:3351:1: ruleBackSpecification returns [EObject current=null] : (otherlv_0= 'backGround' otherlv_1= '{' otherlv_2= 'Icon' otherlv_3= '{' ( (lv_BackgroundIcon_4_0= ruleBackgroundIcon ) ) otherlv_5= '}' otherlv_6= 'Height' otherlv_7= '=' ( (lv_BackGroundHeight_8_0= ruleBackGroundSize ) ) otherlv_9= 'Width' otherlv_10= '=' ( (lv_BackGroundWidth_11_0= ruleBackGroundSize ) ) otherlv_12= '}' ) ;
    public final EObject ruleBackSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_BackgroundIcon_4_0 = null;

        AntlrDatatypeRuleToken lv_BackGroundHeight_8_0 = null;

        AntlrDatatypeRuleToken lv_BackGroundWidth_11_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:3357:2: ( (otherlv_0= 'backGround' otherlv_1= '{' otherlv_2= 'Icon' otherlv_3= '{' ( (lv_BackgroundIcon_4_0= ruleBackgroundIcon ) ) otherlv_5= '}' otherlv_6= 'Height' otherlv_7= '=' ( (lv_BackGroundHeight_8_0= ruleBackGroundSize ) ) otherlv_9= 'Width' otherlv_10= '=' ( (lv_BackGroundWidth_11_0= ruleBackGroundSize ) ) otherlv_12= '}' ) )
            // InternalGreedySnake.g:3358:2: (otherlv_0= 'backGround' otherlv_1= '{' otherlv_2= 'Icon' otherlv_3= '{' ( (lv_BackgroundIcon_4_0= ruleBackgroundIcon ) ) otherlv_5= '}' otherlv_6= 'Height' otherlv_7= '=' ( (lv_BackGroundHeight_8_0= ruleBackGroundSize ) ) otherlv_9= 'Width' otherlv_10= '=' ( (lv_BackGroundWidth_11_0= ruleBackGroundSize ) ) otherlv_12= '}' )
            {
            // InternalGreedySnake.g:3358:2: (otherlv_0= 'backGround' otherlv_1= '{' otherlv_2= 'Icon' otherlv_3= '{' ( (lv_BackgroundIcon_4_0= ruleBackgroundIcon ) ) otherlv_5= '}' otherlv_6= 'Height' otherlv_7= '=' ( (lv_BackGroundHeight_8_0= ruleBackGroundSize ) ) otherlv_9= 'Width' otherlv_10= '=' ( (lv_BackGroundWidth_11_0= ruleBackGroundSize ) ) otherlv_12= '}' )
            // InternalGreedySnake.g:3359:3: otherlv_0= 'backGround' otherlv_1= '{' otherlv_2= 'Icon' otherlv_3= '{' ( (lv_BackgroundIcon_4_0= ruleBackgroundIcon ) ) otherlv_5= '}' otherlv_6= 'Height' otherlv_7= '=' ( (lv_BackGroundHeight_8_0= ruleBackGroundSize ) ) otherlv_9= 'Width' otherlv_10= '=' ( (lv_BackGroundWidth_11_0= ruleBackGroundSize ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBackSpecificationAccess().getBackGroundKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getBackSpecificationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,73,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBackSpecificationAccess().getIconKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getBackSpecificationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGreedySnake.g:3375:3: ( (lv_BackgroundIcon_4_0= ruleBackgroundIcon ) )
            // InternalGreedySnake.g:3376:4: (lv_BackgroundIcon_4_0= ruleBackgroundIcon )
            {
            // InternalGreedySnake.g:3376:4: (lv_BackgroundIcon_4_0= ruleBackgroundIcon )
            // InternalGreedySnake.g:3377:5: lv_BackgroundIcon_4_0= ruleBackgroundIcon
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

            otherlv_5=(Token)match(input,13,FOLLOW_55); 

            			newLeafNode(otherlv_5, grammarAccess.getBackSpecificationAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,74,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getBackSpecificationAccess().getHeightKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getBackSpecificationAccess().getEqualsSignKeyword_7());
            		
            // InternalGreedySnake.g:3406:3: ( (lv_BackGroundHeight_8_0= ruleBackGroundSize ) )
            // InternalGreedySnake.g:3407:4: (lv_BackGroundHeight_8_0= ruleBackGroundSize )
            {
            // InternalGreedySnake.g:3407:4: (lv_BackGroundHeight_8_0= ruleBackGroundSize )
            // InternalGreedySnake.g:3408:5: lv_BackGroundHeight_8_0= ruleBackGroundSize
            {

            					newCompositeNode(grammarAccess.getBackSpecificationAccess().getBackGroundHeightBackGroundSizeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_56);
            lv_BackGroundHeight_8_0=ruleBackGroundSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackSpecificationRule());
            					}
            					set(
            						current,
            						"BackGroundHeight",
            						lv_BackGroundHeight_8_0,
            						"org.xtext.example.mydsl2.group16.GreedySnake.BackGroundSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,75,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getBackSpecificationAccess().getWidthKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getBackSpecificationAccess().getEqualsSignKeyword_10());
            		
            // InternalGreedySnake.g:3433:3: ( (lv_BackGroundWidth_11_0= ruleBackGroundSize ) )
            // InternalGreedySnake.g:3434:4: (lv_BackGroundWidth_11_0= ruleBackGroundSize )
            {
            // InternalGreedySnake.g:3434:4: (lv_BackGroundWidth_11_0= ruleBackGroundSize )
            // InternalGreedySnake.g:3435:5: lv_BackGroundWidth_11_0= ruleBackGroundSize
            {

            					newCompositeNode(grammarAccess.getBackSpecificationAccess().getBackGroundWidthBackGroundSizeParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_17);
            lv_BackGroundWidth_11_0=ruleBackGroundSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackSpecificationRule());
            					}
            					set(
            						current,
            						"BackGroundWidth",
            						lv_BackGroundWidth_11_0,
            						"org.xtext.example.mydsl2.group16.GreedySnake.BackGroundSize");
            					afterParserOrEnumRuleCall();
            				

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
    // InternalGreedySnake.g:3460:1: entryRuleBackgroundIcon returns [EObject current=null] : iv_ruleBackgroundIcon= ruleBackgroundIcon EOF ;
    public final EObject entryRuleBackgroundIcon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackgroundIcon = null;


        try {
            // InternalGreedySnake.g:3460:55: (iv_ruleBackgroundIcon= ruleBackgroundIcon EOF )
            // InternalGreedySnake.g:3461:2: iv_ruleBackgroundIcon= ruleBackgroundIcon EOF
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
    // InternalGreedySnake.g:3467:1: ruleBackgroundIcon returns [EObject current=null] : ( () ( (lv_BackgroundTag_1_0= ruleBackgroundTag ) )* ) ;
    public final EObject ruleBackgroundIcon() throws RecognitionException {
        EObject current = null;

        EObject lv_BackgroundTag_1_0 = null;



        	enterRule();

        try {
            // InternalGreedySnake.g:3473:2: ( ( () ( (lv_BackgroundTag_1_0= ruleBackgroundTag ) )* ) )
            // InternalGreedySnake.g:3474:2: ( () ( (lv_BackgroundTag_1_0= ruleBackgroundTag ) )* )
            {
            // InternalGreedySnake.g:3474:2: ( () ( (lv_BackgroundTag_1_0= ruleBackgroundTag ) )* )
            // InternalGreedySnake.g:3475:3: () ( (lv_BackgroundTag_1_0= ruleBackgroundTag ) )*
            {
            // InternalGreedySnake.g:3475:3: ()
            // InternalGreedySnake.g:3476:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBackgroundIconAccess().getBackgroundIconAction_0(),
            					current);
            			

            }

            // InternalGreedySnake.g:3482:3: ( (lv_BackgroundTag_1_0= ruleBackgroundTag ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGreedySnake.g:3483:4: (lv_BackgroundTag_1_0= ruleBackgroundTag )
            	    {
            	    // InternalGreedySnake.g:3483:4: (lv_BackgroundTag_1_0= ruleBackgroundTag )
            	    // InternalGreedySnake.g:3484:5: lv_BackgroundTag_1_0= ruleBackgroundTag
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
            	    break loop23;
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


    // $ANTLR start "entryRuleBackGroundSize"
    // InternalGreedySnake.g:3505:1: entryRuleBackGroundSize returns [String current=null] : iv_ruleBackGroundSize= ruleBackGroundSize EOF ;
    public final String entryRuleBackGroundSize() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBackGroundSize = null;


        try {
            // InternalGreedySnake.g:3505:54: (iv_ruleBackGroundSize= ruleBackGroundSize EOF )
            // InternalGreedySnake.g:3506:2: iv_ruleBackGroundSize= ruleBackGroundSize EOF
            {
             newCompositeNode(grammarAccess.getBackGroundSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackGroundSize=ruleBackGroundSize();

            state._fsp--;

             current =iv_ruleBackGroundSize.getText(); 
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
    // $ANTLR end "entryRuleBackGroundSize"


    // $ANTLR start "ruleBackGroundSize"
    // InternalGreedySnake.g:3512:1: ruleBackGroundSize returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleBackGroundSize() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:3518:2: (this_INT_0= RULE_INT )
            // InternalGreedySnake.g:3519:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getBackGroundSizeAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleBackGroundSize"


    // $ANTLR start "entryRuleBackgroundTag"
    // InternalGreedySnake.g:3529:1: entryRuleBackgroundTag returns [EObject current=null] : iv_ruleBackgroundTag= ruleBackgroundTag EOF ;
    public final EObject entryRuleBackgroundTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackgroundTag = null;


        try {
            // InternalGreedySnake.g:3529:54: (iv_ruleBackgroundTag= ruleBackgroundTag EOF )
            // InternalGreedySnake.g:3530:2: iv_ruleBackgroundTag= ruleBackgroundTag EOF
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
    // InternalGreedySnake.g:3536:1: ruleBackgroundTag returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_BKtag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_locate_6_0= RULE_STRING ) ) ) ;
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
            // InternalGreedySnake.g:3542:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_BKtag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_locate_6_0= RULE_STRING ) ) ) )
            // InternalGreedySnake.g:3543:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_BKtag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_locate_6_0= RULE_STRING ) ) )
            {
            // InternalGreedySnake.g:3543:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_BKtag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_locate_6_0= RULE_STRING ) ) )
            // InternalGreedySnake.g:3544:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_BKtag_3_0= RULE_INT ) ) otherlv_4= 'Locate' otherlv_5= ':' ( (lv_locate_6_0= RULE_STRING ) )
            {
            // InternalGreedySnake.g:3544:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreedySnake.g:3545:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreedySnake.g:3545:4: (lv_name_0_0= RULE_ID )
            // InternalGreedySnake.g:3546:5: lv_name_0_0= RULE_ID
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

            // InternalGreedySnake.g:3562:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalGreedySnake.g:3563:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalGreedySnake.g:3563:4: (lv_value_1_0= RULE_STRING )
            // InternalGreedySnake.g:3564:5: lv_value_1_0= RULE_STRING
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
            		
            // InternalGreedySnake.g:3584:3: ( (lv_BKtag_3_0= RULE_INT ) )
            // InternalGreedySnake.g:3585:4: (lv_BKtag_3_0= RULE_INT )
            {
            // InternalGreedySnake.g:3585:4: (lv_BKtag_3_0= RULE_INT )
            // InternalGreedySnake.g:3586:5: lv_BKtag_3_0= RULE_INT
            {
            lv_BKtag_3_0=(Token)match(input,RULE_INT,FOLLOW_39); 

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

            otherlv_4=(Token)match(input,46,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getBackgroundTagAccess().getLocateKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getBackgroundTagAccess().getColonKeyword_5());
            		
            // InternalGreedySnake.g:3610:3: ( (lv_locate_6_0= RULE_STRING ) )
            // InternalGreedySnake.g:3611:4: (lv_locate_6_0= RULE_STRING )
            {
            // InternalGreedySnake.g:3611:4: (lv_locate_6_0= RULE_STRING )
            // InternalGreedySnake.g:3612:5: lv_locate_6_0= RULE_STRING
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
    // InternalGreedySnake.g:3632:1: entryRuleMusicSpecification returns [EObject current=null] : iv_ruleMusicSpecification= ruleMusicSpecification EOF ;
    public final EObject entryRuleMusicSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMusicSpecification = null;


        try {
            // InternalGreedySnake.g:3632:59: (iv_ruleMusicSpecification= ruleMusicSpecification EOF )
            // InternalGreedySnake.g:3633:2: iv_ruleMusicSpecification= ruleMusicSpecification EOF
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
    // InternalGreedySnake.g:3639:1: ruleMusicSpecification returns [EObject current=null] : (otherlv_0= 'Music' otherlv_1= '{' otherlv_2= 'BufferSize' otherlv_3= '=' ( (lv_buffersize_4_0= RULE_INT ) ) ( (lv_MusicPath_5_0= ruleMusicPath ) )* otherlv_6= '}' ) ;
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
            // InternalGreedySnake.g:3645:2: ( (otherlv_0= 'Music' otherlv_1= '{' otherlv_2= 'BufferSize' otherlv_3= '=' ( (lv_buffersize_4_0= RULE_INT ) ) ( (lv_MusicPath_5_0= ruleMusicPath ) )* otherlv_6= '}' ) )
            // InternalGreedySnake.g:3646:2: (otherlv_0= 'Music' otherlv_1= '{' otherlv_2= 'BufferSize' otherlv_3= '=' ( (lv_buffersize_4_0= RULE_INT ) ) ( (lv_MusicPath_5_0= ruleMusicPath ) )* otherlv_6= '}' )
            {
            // InternalGreedySnake.g:3646:2: (otherlv_0= 'Music' otherlv_1= '{' otherlv_2= 'BufferSize' otherlv_3= '=' ( (lv_buffersize_4_0= RULE_INT ) ) ( (lv_MusicPath_5_0= ruleMusicPath ) )* otherlv_6= '}' )
            // InternalGreedySnake.g:3647:3: otherlv_0= 'Music' otherlv_1= '{' otherlv_2= 'BufferSize' otherlv_3= '=' ( (lv_buffersize_4_0= RULE_INT ) ) ( (lv_MusicPath_5_0= ruleMusicPath ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMusicSpecificationAccess().getMusicKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_57); 

            			newLeafNode(otherlv_1, grammarAccess.getMusicSpecificationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,77,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMusicSpecificationAccess().getBufferSizeKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getMusicSpecificationAccess().getEqualsSignKeyword_3());
            		
            // InternalGreedySnake.g:3663:3: ( (lv_buffersize_4_0= RULE_INT ) )
            // InternalGreedySnake.g:3664:4: (lv_buffersize_4_0= RULE_INT )
            {
            // InternalGreedySnake.g:3664:4: (lv_buffersize_4_0= RULE_INT )
            // InternalGreedySnake.g:3665:5: lv_buffersize_4_0= RULE_INT
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

            // InternalGreedySnake.g:3681:3: ( (lv_MusicPath_5_0= ruleMusicPath ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGreedySnake.g:3682:4: (lv_MusicPath_5_0= ruleMusicPath )
            	    {
            	    // InternalGreedySnake.g:3682:4: (lv_MusicPath_5_0= ruleMusicPath )
            	    // InternalGreedySnake.g:3683:5: lv_MusicPath_5_0= ruleMusicPath
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
            	    break loop24;
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
    // InternalGreedySnake.g:3708:1: entryRuleMusicPath returns [EObject current=null] : iv_ruleMusicPath= ruleMusicPath EOF ;
    public final EObject entryRuleMusicPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMusicPath = null;


        try {
            // InternalGreedySnake.g:3708:50: (iv_ruleMusicPath= ruleMusicPath EOF )
            // InternalGreedySnake.g:3709:2: iv_ruleMusicPath= ruleMusicPath EOF
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
    // InternalGreedySnake.g:3715:1: ruleMusicPath returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'path' otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleMusicPath() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;


        	enterRule();

        try {
            // InternalGreedySnake.g:3721:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'path' otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) ) ) )
            // InternalGreedySnake.g:3722:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'path' otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) ) )
            {
            // InternalGreedySnake.g:3722:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'path' otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) ) )
            // InternalGreedySnake.g:3723:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'path' otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) )
            {
            // InternalGreedySnake.g:3723:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreedySnake.g:3724:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreedySnake.g:3724:4: (lv_name_0_0= RULE_ID )
            // InternalGreedySnake.g:3725:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_58); 

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

            otherlv_1=(Token)match(input,78,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMusicPathAccess().getPathKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMusicPathAccess().getEqualsSignKeyword_2());
            		
            // InternalGreedySnake.g:3749:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalGreedySnake.g:3750:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalGreedySnake.g:3750:4: (lv_path_3_0= RULE_STRING )
            // InternalGreedySnake.g:3751:5: lv_path_3_0= RULE_STRING
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0100003E00014010L,0x000000000000118EL});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0100003E00016010L,0x000000000000118EL});
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
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000001000040L,0x0000000000000001L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});

}
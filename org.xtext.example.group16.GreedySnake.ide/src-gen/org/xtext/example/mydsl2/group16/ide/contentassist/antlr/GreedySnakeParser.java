/*
 * generated by Xtext 2.25.0.M1
 */
package org.xtext.example.mydsl2.group16.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl2.group16.ide.contentassist.antlr.internal.InternalGreedySnakeParser;
import org.xtext.example.mydsl2.group16.services.GreedySnakeGrammarAccess;

public class GreedySnakeParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(GreedySnakeGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, GreedySnakeGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getGreedySnakeAccess().getAlternatives_3(), "rule__GreedySnake__Alternatives_3");
			builder.put(grammarAccess.getTimeLimitedAccess().getAlternatives(), "rule__TimeLimited__Alternatives");
			builder.put(grammarAccess.getVarSpecAccess().getAlternatives(), "rule__VarSpec__Alternatives");
			builder.put(grammarAccess.getAllItemVarSpecAccess().getTypeAlternatives_0_0(), "rule__AllItemVarSpec__TypeAlternatives_0_0");
			builder.put(grammarAccess.getParamSpecAccess().getTypeAlternatives_0_0(), "rule__ParamSpec__TypeAlternatives_0_0");
			builder.put(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0(), "rule__Addition__OperatorAlternatives_1_1_0");
			builder.put(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0(), "rule__Multiplication__OperatorAlternatives_1_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getOptionSpecificationAccess().getAlternatives(), "rule__OptionSpecification__Alternatives");
			builder.put(grammarAccess.getGreedySnakeAccess().getGroup(), "rule__GreedySnake__Group__0");
			builder.put(grammarAccess.getGlobalMapAccess().getGroup(), "rule__GlobalMap__Group__0");
			builder.put(grammarAccess.getGlobalFieldInitialisationAccess().getGroup(), "rule__GlobalFieldInitialisation__Group__0");
			builder.put(grammarAccess.getInitialFieldAccess().getGroup(), "rule__InitialField__Group__0");
			builder.put(grammarAccess.getDefaultAccess().getGroup(), "rule__Default__Group__0");
			builder.put(grammarAccess.getInitialSnakeSpecificatinAccess().getGroup(), "rule__InitialSnakeSpecificatin__Group__0");
			builder.put(grammarAccess.getInitialFoodSpecificatinAccess().getGroup(), "rule__InitialFoodSpecificatin__Group__0");
			builder.put(grammarAccess.getInitialObstacleSpecificatinAccess().getGroup(), "rule__InitialObstacleSpecificatin__Group__0");
			builder.put(grammarAccess.getInitialFireSpecificationAccess().getGroup(), "rule__InitialFireSpecification__Group__0");
			builder.put(grammarAccess.getInitialSpeedSpecificationAccess().getGroup(), "rule__InitialSpeedSpecification__Group__0");
			builder.put(grammarAccess.getSpeedGroupAccess().getGroup(), "rule__SpeedGroup__Group__0");
			builder.put(grammarAccess.getFireInitDisplayAccess().getGroup(), "rule__FireInitDisplay__Group__0");
			builder.put(grammarAccess.getSnakeInitDisplayAccess().getGroup(), "rule__SnakeInitDisplay__Group__0");
			builder.put(grammarAccess.getIconAccess().getGroup(), "rule__Icon__Group__0");
			builder.put(grammarAccess.getIconTagAccess().getGroup(), "rule__IconTag__Group__0");
			builder.put(grammarAccess.getFoodInitDisplayAccess().getGroup(), "rule__FoodInitDisplay__Group__0");
			builder.put(grammarAccess.getFoodKindAccess().getGroup(), "rule__FoodKind__Group__0");
			builder.put(grammarAccess.getObstacleInitDisplayAccess().getGroup(), "rule__ObstacleInitDisplay__Group__0");
			builder.put(grammarAccess.getRandomFoodSizeAccess().getGroup(), "rule__RandomFoodSize__Group__0");
			builder.put(grammarAccess.getMinsizeAccess().getGroup(), "rule__Minsize__Group__0");
			builder.put(grammarAccess.getMaxsizeAccess().getGroup(), "rule__Maxsize__Group__0");
			builder.put(grammarAccess.getTimeLimitedAccess().getGroup_0(), "rule__TimeLimited__Group_0__0");
			builder.put(grammarAccess.getTimeLimitedAccess().getGroup_1(), "rule__TimeLimited__Group_1__0");
			builder.put(grammarAccess.getObstacleTimeAccess().getGroup(), "rule__ObstacleTime__Group__0");
			builder.put(grammarAccess.getFoodTimeAccess().getGroup(), "rule__FoodTime__Group__0");
			builder.put(grammarAccess.getAllItemVarSpecAccess().getGroup(), "rule__AllItemVarSpec__Group__0");
			builder.put(grammarAccess.getParamSpecAccess().getGroup(), "rule__ParamSpec__Group__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_2(), "rule__Primary__Group_2__0");
			builder.put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
			builder.put(grammarAccess.getRestartMenuAccess().getGroup(), "rule__RestartMenu__Group__0");
			builder.put(grammarAccess.getStartFieldDeclarationAccess().getGroup(), "rule__StartFieldDeclaration__Group__0");
			builder.put(grammarAccess.getAboutSpecificationAccess().getGroup(), "rule__AboutSpecification__Group__0");
			builder.put(grammarAccess.getHelpSpecificationAccess().getGroup(), "rule__HelpSpecification__Group__0");
			builder.put(grammarAccess.getBackSpecificationAccess().getGroup(), "rule__BackSpecification__Group__0");
			builder.put(grammarAccess.getBackgroundIconAccess().getGroup(), "rule__BackgroundIcon__Group__0");
			builder.put(grammarAccess.getBackgroundTagAccess().getGroup(), "rule__BackgroundTag__Group__0");
			builder.put(grammarAccess.getBackgroundTagLocateAccess().getGroup(), "rule__BackgroundTagLocate__Group__0");
			builder.put(grammarAccess.getMusicSpecificationAccess().getGroup(), "rule__MusicSpecification__Group__0");
			builder.put(grammarAccess.getMusicPathAccess().getGroup(), "rule__MusicPath__Group__0");
			builder.put(grammarAccess.getGreedySnakeAccess().getNameAssignment_1(), "rule__GreedySnake__NameAssignment_1");
			builder.put(grammarAccess.getGreedySnakeAccess().getSnakesAssignment_3_0(), "rule__GreedySnake__SnakesAssignment_3_0");
			builder.put(grammarAccess.getGreedySnakeAccess().getFoodsAssignment_3_1(), "rule__GreedySnake__FoodsAssignment_3_1");
			builder.put(grammarAccess.getGreedySnakeAccess().getObstaclesAssignment_3_2(), "rule__GreedySnake__ObstaclesAssignment_3_2");
			builder.put(grammarAccess.getGreedySnakeAccess().getSpeedAssignment_3_3(), "rule__GreedySnake__SpeedAssignment_3_3");
			builder.put(grammarAccess.getGreedySnakeAccess().getFireAssignment_3_4(), "rule__GreedySnake__FireAssignment_3_4");
			builder.put(grammarAccess.getGreedySnakeAccess().getTimeAssignment_3_5(), "rule__GreedySnake__TimeAssignment_3_5");
			builder.put(grammarAccess.getGreedySnakeAccess().getMapAssignment_3_6(), "rule__GreedySnake__MapAssignment_3_6");
			builder.put(grammarAccess.getGreedySnakeAccess().getAboutAssignment_3_7(), "rule__GreedySnake__AboutAssignment_3_7");
			builder.put(grammarAccess.getGreedySnakeAccess().getHelpAssignment_3_8(), "rule__GreedySnake__HelpAssignment_3_8");
			builder.put(grammarAccess.getGreedySnakeAccess().getMusicAssignment_3_9(), "rule__GreedySnake__MusicAssignment_3_9");
			builder.put(grammarAccess.getGreedySnakeAccess().getBackgroundsAssignment_3_10(), "rule__GreedySnake__BackgroundsAssignment_3_10");
			builder.put(grammarAccess.getGreedySnakeAccess().getFieldsAssignment_3_11(), "rule__GreedySnake__FieldsAssignment_3_11");
			builder.put(grammarAccess.getGreedySnakeAccess().getOptionsAssignment_3_12(), "rule__GreedySnake__OptionsAssignment_3_12");
			builder.put(grammarAccess.getGlobalMapAccess().getMapAssignment_2(), "rule__GlobalMap__MapAssignment_2");
			builder.put(grammarAccess.getGlobalFieldInitialisationAccess().getNameAssignment_1(), "rule__GlobalFieldInitialisation__NameAssignment_1");
			builder.put(grammarAccess.getGlobalFieldInitialisationAccess().getPanelWidthAssignment_5(), "rule__GlobalFieldInitialisation__PanelWidthAssignment_5");
			builder.put(grammarAccess.getGlobalFieldInitialisationAccess().getPanelHeightAssignment_8(), "rule__GlobalFieldInitialisation__PanelHeightAssignment_8");
			builder.put(grammarAccess.getGlobalFieldInitialisationAccess().getWidthAssignment_11(), "rule__GlobalFieldInitialisation__WidthAssignment_11");
			builder.put(grammarAccess.getGlobalFieldInitialisationAccess().getHeightAssignment_14(), "rule__GlobalFieldInitialisation__HeightAssignment_14");
			builder.put(grammarAccess.getGlobalFieldInitialisationAccess().getLabelWidthAssignment_17(), "rule__GlobalFieldInitialisation__LabelWidthAssignment_17");
			builder.put(grammarAccess.getGlobalFieldInitialisationAccess().getLabelHeightAssignment_20(), "rule__GlobalFieldInitialisation__LabelHeightAssignment_20");
			builder.put(grammarAccess.getGlobalFieldInitialisationAccess().getField_initialisationAssignment_21(), "rule__GlobalFieldInitialisation__Field_initialisationAssignment_21");
			builder.put(grammarAccess.getInitialFieldAccess().getNameAssignment_1(), "rule__InitialField__NameAssignment_1");
			builder.put(grammarAccess.getInitialFieldAccess().getDefaultAssignment_7(), "rule__InitialField__DefaultAssignment_7");
			builder.put(grammarAccess.getDefaultAccess().getLengthAssignment_2(), "rule__Default__LengthAssignment_2");
			builder.put(grammarAccess.getDefaultAccess().getScoreAssignment_5(), "rule__Default__ScoreAssignment_5");
			builder.put(grammarAccess.getDefaultAccess().getTimeAssignment_8(), "rule__Default__TimeAssignment_8");
			builder.put(grammarAccess.getDefaultAccess().getAmountAssignment_11(), "rule__Default__AmountAssignment_11");
			builder.put(grammarAccess.getDefaultAccess().getWeaponAssignment_14(), "rule__Default__WeaponAssignment_14");
			builder.put(grammarAccess.getInitialSnakeSpecificatinAccess().getNameAssignment_1(), "rule__InitialSnakeSpecificatin__NameAssignment_1");
			builder.put(grammarAccess.getInitialSnakeSpecificatinAccess().getMembersAssignment_3(), "rule__InitialSnakeSpecificatin__MembersAssignment_3");
			builder.put(grammarAccess.getInitialSnakeSpecificatinAccess().getMultiplesAssignment_5(), "rule__InitialSnakeSpecificatin__MultiplesAssignment_5");
			builder.put(grammarAccess.getInitialFoodSpecificatinAccess().getNameAssignment_1(), "rule__InitialFoodSpecificatin__NameAssignment_1");
			builder.put(grammarAccess.getInitialFoodSpecificatinAccess().getMembersAssignment_3(), "rule__InitialFoodSpecificatin__MembersAssignment_3");
			builder.put(grammarAccess.getInitialFoodSpecificatinAccess().getMultiplesAssignment_5(), "rule__InitialFoodSpecificatin__MultiplesAssignment_5");
			builder.put(grammarAccess.getInitialObstacleSpecificatinAccess().getNameAssignment_1(), "rule__InitialObstacleSpecificatin__NameAssignment_1");
			builder.put(grammarAccess.getInitialObstacleSpecificatinAccess().getMembersAssignment_3(), "rule__InitialObstacleSpecificatin__MembersAssignment_3");
			builder.put(grammarAccess.getInitialObstacleSpecificatinAccess().getMultiplesAssignment_5(), "rule__InitialObstacleSpecificatin__MultiplesAssignment_5");
			builder.put(grammarAccess.getInitialFireSpecificationAccess().getNameAssignment_1(), "rule__InitialFireSpecification__NameAssignment_1");
			builder.put(grammarAccess.getInitialFireSpecificationAccess().getMembersAssignment_3(), "rule__InitialFireSpecification__MembersAssignment_3");
			builder.put(grammarAccess.getInitialFireSpecificationAccess().getMultiplesAssignment_5(), "rule__InitialFireSpecification__MultiplesAssignment_5");
			builder.put(grammarAccess.getInitialSpeedSpecificationAccess().getSpeedGroupAssignment_3(), "rule__InitialSpeedSpecification__SpeedGroupAssignment_3");
			builder.put(grammarAccess.getSpeedGroupAccess().getNameAssignment_0(), "rule__SpeedGroup__NameAssignment_0");
			builder.put(grammarAccess.getSpeedGroupAccess().getValueAssignment_2(), "rule__SpeedGroup__ValueAssignment_2");
			builder.put(grammarAccess.getFireMembersAccess().getFireAssignment(), "rule__FireMembers__FireAssignment");
			builder.put(grammarAccess.getSnakeMembersAccess().getSnaAssignment(), "rule__SnakeMembers__SnaAssignment");
			builder.put(grammarAccess.getFoodMembersAccess().getFoodAssignment(), "rule__FoodMembers__FoodAssignment");
			builder.put(grammarAccess.getObstacleMembersAccess().getObstacleAssignment(), "rule__ObstacleMembers__ObstacleAssignment");
			builder.put(grammarAccess.getFireInitDisplayAccess().getFireIconAssignment_2(), "rule__FireInitDisplay__FireIconAssignment_2");
			builder.put(grammarAccess.getFireInitDisplayAccess().getIconsizeAssignment_6(), "rule__FireInitDisplay__IconsizeAssignment_6");
			builder.put(grammarAccess.getSnakeInitDisplayAccess().getHeadAssignment_2(), "rule__SnakeInitDisplay__HeadAssignment_2");
			builder.put(grammarAccess.getSnakeInitDisplayAccess().getInitial_xAssignment_3(), "rule__SnakeInitDisplay__Initial_xAssignment_3");
			builder.put(grammarAccess.getSnakeInitDisplayAccess().getInitial_yAssignment_5(), "rule__SnakeInitDisplay__Initial_yAssignment_5");
			builder.put(grammarAccess.getSnakeInitDisplayAccess().getHeadIconAssignment_9(), "rule__SnakeInitDisplay__HeadIconAssignment_9");
			builder.put(grammarAccess.getSnakeInitDisplayAccess().getIconsizeAssignment_13(), "rule__SnakeInitDisplay__IconsizeAssignment_13");
			builder.put(grammarAccess.getSnakeInitDisplayAccess().getBodyIconAssignment_16(), "rule__SnakeInitDisplay__BodyIconAssignment_16");
			builder.put(grammarAccess.getSnakeInitDisplayAccess().getDefaultSpeedAssignment_20(), "rule__SnakeInitDisplay__DefaultSpeedAssignment_20");
			builder.put(grammarAccess.getSnakeInitDisplayAccess().getSnakeTagAssignment_23(), "rule__SnakeInitDisplay__SnakeTagAssignment_23");
			builder.put(grammarAccess.getIconAccess().getIconTagAssignment_1(), "rule__Icon__IconTagAssignment_1");
			builder.put(grammarAccess.getIconTagAccess().getNameAssignment_0(), "rule__IconTag__NameAssignment_0");
			builder.put(grammarAccess.getIconTagAccess().getValueAssignment_1(), "rule__IconTag__ValueAssignment_1");
			builder.put(grammarAccess.getIconTagAccess().getTagAssignment_3(), "rule__IconTag__TagAssignment_3");
			builder.put(grammarAccess.getIconTagAccess().getLocateAssignment_6(), "rule__IconTag__LocateAssignment_6");
			builder.put(grammarAccess.getFoodInitDisplayAccess().getFoodIconAssignment_2(), "rule__FoodInitDisplay__FoodIconAssignment_2");
			builder.put(grammarAccess.getFoodInitDisplayAccess().getIconsizeAssignment_6(), "rule__FoodInitDisplay__IconsizeAssignment_6");
			builder.put(grammarAccess.getFoodInitDisplayAccess().getFoodKindAssignment_9(), "rule__FoodInitDisplay__FoodKindAssignment_9");
			builder.put(grammarAccess.getFoodInitDisplayAccess().getProduceAssignment_12(), "rule__FoodInitDisplay__ProduceAssignment_12");
			builder.put(grammarAccess.getFoodInitDisplayAccess().getFoodTagAssignment_15(), "rule__FoodInitDisplay__FoodTagAssignment_15");
			builder.put(grammarAccess.getFoodKindAccess().getKindAssignment_0(), "rule__FoodKind__KindAssignment_0");
			builder.put(grammarAccess.getFoodKindAccess().getPointAssignment_4(), "rule__FoodKind__PointAssignment_4");
			builder.put(grammarAccess.getObstacleInitDisplayAccess().getObstacleIconAssignment_2(), "rule__ObstacleInitDisplay__ObstacleIconAssignment_2");
			builder.put(grammarAccess.getObstacleInitDisplayAccess().getIconsizeAssignment_6(), "rule__ObstacleInitDisplay__IconsizeAssignment_6");
			builder.put(grammarAccess.getObstacleInitDisplayAccess().getObstacleTagAssignment_9(), "rule__ObstacleInitDisplay__ObstacleTagAssignment_9");
			builder.put(grammarAccess.getRandomFoodSizeAccess().getMaxsizeAssignment_1(), "rule__RandomFoodSize__MaxsizeAssignment_1");
			builder.put(grammarAccess.getRandomFoodSizeAccess().getMinsizeAssignment_3(), "rule__RandomFoodSize__MinsizeAssignment_3");
			builder.put(grammarAccess.getMinsizeAccess().getMaxsizeAssignment_1(), "rule__Minsize__MaxsizeAssignment_1");
			builder.put(grammarAccess.getMaxsizeAccess().getMinsizeAssignment_1(), "rule__Maxsize__MinsizeAssignment_1");
			builder.put(grammarAccess.getObstacleTimeAccess().getNameAssignment_0(), "rule__ObstacleTime__NameAssignment_0");
			builder.put(grammarAccess.getObstacleTimeAccess().getObstacleTimeAssignment_2(), "rule__ObstacleTime__ObstacleTimeAssignment_2");
			builder.put(grammarAccess.getFoodTimeAccess().getNameAssignment_0(), "rule__FoodTime__NameAssignment_0");
			builder.put(grammarAccess.getFoodTimeAccess().getFoodTimeAssignment_2(), "rule__FoodTime__FoodTimeAssignment_2");
			builder.put(grammarAccess.getAllItemVarSpecAccess().getTypeAssignment_0(), "rule__AllItemVarSpec__TypeAssignment_0");
			builder.put(grammarAccess.getAllItemVarSpecAccess().getNameAssignment_1(), "rule__AllItemVarSpec__NameAssignment_1");
			builder.put(grammarAccess.getParamSpecAccess().getTypeAssignment_0(), "rule__ParamSpec__TypeAssignment_0");
			builder.put(grammarAccess.getParamSpecAccess().getNameAssignment_1(), "rule__ParamSpec__NameAssignment_1");
			builder.put(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1(), "rule__Addition__OperatorAssignment_1_1");
			builder.put(grammarAccess.getAdditionAccess().getRightAssignment_1_2(), "rule__Addition__RightAssignment_1_2");
			builder.put(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1(), "rule__Multiplication__OperatorAssignment_1_1");
			builder.put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2(), "rule__Multiplication__RightAssignment_1_2");
			builder.put(grammarAccess.getIntLiteralAccess().getValAssignment(), "rule__IntLiteral__ValAssignment");
			builder.put(grammarAccess.getRealLiteralAccess().getValAssignment(), "rule__RealLiteral__ValAssignment");
			builder.put(grammarAccess.getStartFieldDeclarationAccess().getFieldAssignment_2(), "rule__StartFieldDeclaration__FieldAssignment_2");
			builder.put(grammarAccess.getAboutSpecificationAccess().getNameAssignment_1(), "rule__AboutSpecification__NameAssignment_1");
			builder.put(grammarAccess.getAboutSpecificationAccess().getAboutTitleAssignment_5(), "rule__AboutSpecification__AboutTitleAssignment_5");
			builder.put(grammarAccess.getAboutSpecificationAccess().getAboutInforAssignment_8(), "rule__AboutSpecification__AboutInforAssignment_8");
			builder.put(grammarAccess.getAboutSpecificationAccess().getXAssignment_12(), "rule__AboutSpecification__XAssignment_12");
			builder.put(grammarAccess.getAboutSpecificationAccess().getYAssignment_14(), "rule__AboutSpecification__YAssignment_14");
			builder.put(grammarAccess.getStringValAccess().getValueAssignment(), "rule__StringVal__ValueAssignment");
			builder.put(grammarAccess.getHelpSpecificationAccess().getNameAssignment_1(), "rule__HelpSpecification__NameAssignment_1");
			builder.put(grammarAccess.getHelpSpecificationAccess().getHelpTitleAssignment_5(), "rule__HelpSpecification__HelpTitleAssignment_5");
			builder.put(grammarAccess.getHelpSpecificationAccess().getHelpInforAssignment_8(), "rule__HelpSpecification__HelpInforAssignment_8");
			builder.put(grammarAccess.getHelpSpecificationAccess().getXAssignment_12(), "rule__HelpSpecification__XAssignment_12");
			builder.put(grammarAccess.getHelpSpecificationAccess().getYAssignment_14(), "rule__HelpSpecification__YAssignment_14");
			builder.put(grammarAccess.getBackSpecificationAccess().getBackgroundIconAssignment_4(), "rule__BackSpecification__BackgroundIconAssignment_4");
			builder.put(grammarAccess.getBackSpecificationAccess().getBackGroundHeightAssignment_8(), "rule__BackSpecification__BackGroundHeightAssignment_8");
			builder.put(grammarAccess.getBackSpecificationAccess().getBackGroundWidthAssignment_11(), "rule__BackSpecification__BackGroundWidthAssignment_11");
			builder.put(grammarAccess.getBackgroundIconAccess().getBackgroundTagAssignment_1(), "rule__BackgroundIcon__BackgroundTagAssignment_1");
			builder.put(grammarAccess.getBackgroundTagAccess().getNameAssignment_0(), "rule__BackgroundTag__NameAssignment_0");
			builder.put(grammarAccess.getBackgroundTagAccess().getValueAssignment_1(), "rule__BackgroundTag__ValueAssignment_1");
			builder.put(grammarAccess.getBackgroundTagAccess().getBKtagAssignment_3(), "rule__BackgroundTag__BKtagAssignment_3");
			builder.put(grammarAccess.getBackgroundTagAccess().getLocateAssignment_6(), "rule__BackgroundTag__LocateAssignment_6");
			builder.put(grammarAccess.getBackgroundTagLocateAccess().getNameAssignment_1(), "rule__BackgroundTagLocate__NameAssignment_1");
			builder.put(grammarAccess.getBackgroundTagLocateAccess().getValueAssignment_3(), "rule__BackgroundTagLocate__ValueAssignment_3");
			builder.put(grammarAccess.getMusicSpecificationAccess().getBuffersizeAssignment_4(), "rule__MusicSpecification__BuffersizeAssignment_4");
			builder.put(grammarAccess.getMusicSpecificationAccess().getMusicPathAssignment_5(), "rule__MusicSpecification__MusicPathAssignment_5");
			builder.put(grammarAccess.getMusicPathAccess().getNameAssignment_0(), "rule__MusicPath__NameAssignment_0");
			builder.put(grammarAccess.getMusicPathAccess().getPathAssignment_3(), "rule__MusicPath__PathAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private GreedySnakeGrammarAccess grammarAccess;

	@Override
	protected InternalGreedySnakeParser createParser() {
		InternalGreedySnakeParser result = new InternalGreedySnakeParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GreedySnakeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GreedySnakeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
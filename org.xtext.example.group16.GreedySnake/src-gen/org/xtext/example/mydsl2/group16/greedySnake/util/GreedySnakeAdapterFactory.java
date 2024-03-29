/**
 * generated by Xtext 2.25.0.M1
 */
package org.xtext.example.mydsl2.group16.greedySnake.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.mydsl2.group16.greedySnake.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage
 * @generated
 */
public class GreedySnakeAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GreedySnakePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreedySnakeAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GreedySnakePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GreedySnakeSwitch<Adapter> modelSwitch =
    new GreedySnakeSwitch<Adapter>()
    {
      @Override
      public Adapter caseGreedySnake(GreedySnake object)
      {
        return createGreedySnakeAdapter();
      }
      @Override
      public Adapter caseGlobalMap(GlobalMap object)
      {
        return createGlobalMapAdapter();
      }
      @Override
      public Adapter caseGlobalFieldInitialisation(GlobalFieldInitialisation object)
      {
        return createGlobalFieldInitialisationAdapter();
      }
      @Override
      public Adapter caseInitialField(InitialField object)
      {
        return createInitialFieldAdapter();
      }
      @Override
      public Adapter caseDefault(Default object)
      {
        return createDefaultAdapter();
      }
      @Override
      public Adapter caseInitialSnakeSpecificatin(InitialSnakeSpecificatin object)
      {
        return createInitialSnakeSpecificatinAdapter();
      }
      @Override
      public Adapter caseInitialFoodSpecificatin(InitialFoodSpecificatin object)
      {
        return createInitialFoodSpecificatinAdapter();
      }
      @Override
      public Adapter caseInitialObstacleSpecificatin(InitialObstacleSpecificatin object)
      {
        return createInitialObstacleSpecificatinAdapter();
      }
      @Override
      public Adapter caseInitialFireSpecification(InitialFireSpecification object)
      {
        return createInitialFireSpecificationAdapter();
      }
      @Override
      public Adapter caseInitialSpeedSpecification(InitialSpeedSpecification object)
      {
        return createInitialSpeedSpecificationAdapter();
      }
      @Override
      public Adapter caseSpeedGroup(SpeedGroup object)
      {
        return createSpeedGroupAdapter();
      }
      @Override
      public Adapter caseFireMembers(FireMembers object)
      {
        return createFireMembersAdapter();
      }
      @Override
      public Adapter caseSnakeMembers(SnakeMembers object)
      {
        return createSnakeMembersAdapter();
      }
      @Override
      public Adapter caseFoodMembers(FoodMembers object)
      {
        return createFoodMembersAdapter();
      }
      @Override
      public Adapter caseObstacleMembers(ObstacleMembers object)
      {
        return createObstacleMembersAdapter();
      }
      @Override
      public Adapter caseSnakeMoveSpecification(SnakeMoveSpecification object)
      {
        return createSnakeMoveSpecificationAdapter();
      }
      @Override
      public Adapter caseMove(Move object)
      {
        return createMoveAdapter();
      }
      @Override
      public Adapter caseFireInitDisplay(FireInitDisplay object)
      {
        return createFireInitDisplayAdapter();
      }
      @Override
      public Adapter caseSnakeInitDisplay(SnakeInitDisplay object)
      {
        return createSnakeInitDisplayAdapter();
      }
      @Override
      public Adapter caseIcon(Icon object)
      {
        return createIconAdapter();
      }
      @Override
      public Adapter caseIconTag(IconTag object)
      {
        return createIconTagAdapter();
      }
      @Override
      public Adapter caseFoodInitDisplay(FoodInitDisplay object)
      {
        return createFoodInitDisplayAdapter();
      }
      @Override
      public Adapter caseFoodKind(FoodKind object)
      {
        return createFoodKindAdapter();
      }
      @Override
      public Adapter caseObstacleInitDisplay(ObstacleInitDisplay object)
      {
        return createObstacleInitDisplayAdapter();
      }
      @Override
      public Adapter caseRandomFoodSize(RandomFoodSize object)
      {
        return createRandomFoodSizeAdapter();
      }
      @Override
      public Adapter caseTimeLimited(TimeLimited object)
      {
        return createTimeLimitedAdapter();
      }
      @Override
      public Adapter caseObstacleTime(ObstacleTime object)
      {
        return createObstacleTimeAdapter();
      }
      @Override
      public Adapter caseFoodTime(FoodTime object)
      {
        return createFoodTimeAdapter();
      }
      @Override
      public Adapter caseDirectionSpecification(DirectionSpecification object)
      {
        return createDirectionSpecificationAdapter();
      }
      @Override
      public Adapter casedis(dis object)
      {
        return createdisAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseIntLiteral(IntLiteral object)
      {
        return createIntLiteralAdapter();
      }
      @Override
      public Adapter caseRealLiteral(RealLiteral object)
      {
        return createRealLiteralAdapter();
      }
      @Override
      public Adapter caseOptionSpecification(OptionSpecification object)
      {
        return createOptionSpecificationAdapter();
      }
      @Override
      public Adapter caseRestartMenu(RestartMenu object)
      {
        return createRestartMenuAdapter();
      }
      @Override
      public Adapter caseStartFieldDeclaration(StartFieldDeclaration object)
      {
        return createStartFieldDeclarationAdapter();
      }
      @Override
      public Adapter caseAboutSpecification(AboutSpecification object)
      {
        return createAboutSpecificationAdapter();
      }
      @Override
      public Adapter caseHelpSpecification(HelpSpecification object)
      {
        return createHelpSpecificationAdapter();
      }
      @Override
      public Adapter caseBackSpecification(BackSpecification object)
      {
        return createBackSpecificationAdapter();
      }
      @Override
      public Adapter caseBackgroundIcon(BackgroundIcon object)
      {
        return createBackgroundIconAdapter();
      }
      @Override
      public Adapter caseBackGroundSize(BackGroundSize object)
      {
        return createBackGroundSizeAdapter();
      }
      @Override
      public Adapter caseBackgroundTag(BackgroundTag object)
      {
        return createBackgroundTagAdapter();
      }
      @Override
      public Adapter caseBackgroundTagLocate(BackgroundTagLocate object)
      {
        return createBackgroundTagLocateAdapter();
      }
      @Override
      public Adapter caseMusicSpecification(MusicSpecification object)
      {
        return createMusicSpecificationAdapter();
      }
      @Override
      public Adapter caseMusicPath(MusicPath object)
      {
        return createMusicPathAdapter();
      }
      @Override
      public Adapter caseStringVal(StringVal object)
      {
        return createStringValAdapter();
      }
      @Override
      public Adapter caseAddition(Addition object)
      {
        return createAdditionAdapter();
      }
      @Override
      public Adapter caseMultiplication(Multiplication object)
      {
        return createMultiplicationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.GreedySnake <em>Greedy Snake</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnake
   * @generated
   */
  public Adapter createGreedySnakeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.GlobalMap <em>Global Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GlobalMap
   * @generated
   */
  public Adapter createGlobalMapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.GlobalFieldInitialisation <em>Global Field Initialisation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GlobalFieldInitialisation
   * @generated
   */
  public Adapter createGlobalFieldInitialisationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.InitialField <em>Initial Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.InitialField
   * @generated
   */
  public Adapter createInitialFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.Default <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.Default
   * @generated
   */
  public Adapter createDefaultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.InitialSnakeSpecificatin <em>Initial Snake Specificatin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.InitialSnakeSpecificatin
   * @generated
   */
  public Adapter createInitialSnakeSpecificatinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.InitialFoodSpecificatin <em>Initial Food Specificatin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.InitialFoodSpecificatin
   * @generated
   */
  public Adapter createInitialFoodSpecificatinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.InitialObstacleSpecificatin <em>Initial Obstacle Specificatin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.InitialObstacleSpecificatin
   * @generated
   */
  public Adapter createInitialObstacleSpecificatinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.InitialFireSpecification <em>Initial Fire Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.InitialFireSpecification
   * @generated
   */
  public Adapter createInitialFireSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.InitialSpeedSpecification <em>Initial Speed Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.InitialSpeedSpecification
   * @generated
   */
  public Adapter createInitialSpeedSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.SpeedGroup <em>Speed Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.SpeedGroup
   * @generated
   */
  public Adapter createSpeedGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.FireMembers <em>Fire Members</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.FireMembers
   * @generated
   */
  public Adapter createFireMembersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.SnakeMembers <em>Snake Members</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.SnakeMembers
   * @generated
   */
  public Adapter createSnakeMembersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.FoodMembers <em>Food Members</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.FoodMembers
   * @generated
   */
  public Adapter createFoodMembersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.ObstacleMembers <em>Obstacle Members</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.ObstacleMembers
   * @generated
   */
  public Adapter createObstacleMembersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.SnakeMoveSpecification <em>Snake Move Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.SnakeMoveSpecification
   * @generated
   */
  public Adapter createSnakeMoveSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.Move <em>Move</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.Move
   * @generated
   */
  public Adapter createMoveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.FireInitDisplay <em>Fire Init Display</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.FireInitDisplay
   * @generated
   */
  public Adapter createFireInitDisplayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.SnakeInitDisplay <em>Snake Init Display</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.SnakeInitDisplay
   * @generated
   */
  public Adapter createSnakeInitDisplayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.Icon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.Icon
   * @generated
   */
  public Adapter createIconAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.IconTag <em>Icon Tag</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.IconTag
   * @generated
   */
  public Adapter createIconTagAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.FoodInitDisplay <em>Food Init Display</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.FoodInitDisplay
   * @generated
   */
  public Adapter createFoodInitDisplayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.FoodKind <em>Food Kind</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.FoodKind
   * @generated
   */
  public Adapter createFoodKindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.ObstacleInitDisplay <em>Obstacle Init Display</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.ObstacleInitDisplay
   * @generated
   */
  public Adapter createObstacleInitDisplayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.RandomFoodSize <em>Random Food Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.RandomFoodSize
   * @generated
   */
  public Adapter createRandomFoodSizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.TimeLimited <em>Time Limited</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.TimeLimited
   * @generated
   */
  public Adapter createTimeLimitedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.ObstacleTime <em>Obstacle Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.ObstacleTime
   * @generated
   */
  public Adapter createObstacleTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.FoodTime <em>Food Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.FoodTime
   * @generated
   */
  public Adapter createFoodTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.DirectionSpecification <em>Direction Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.DirectionSpecification
   * @generated
   */
  public Adapter createDirectionSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.dis <em>dis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.dis
   * @generated
   */
  public Adapter createdisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.IntLiteral
   * @generated
   */
  public Adapter createIntLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.RealLiteral <em>Real Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.RealLiteral
   * @generated
   */
  public Adapter createRealLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.OptionSpecification <em>Option Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.OptionSpecification
   * @generated
   */
  public Adapter createOptionSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.RestartMenu <em>Restart Menu</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.RestartMenu
   * @generated
   */
  public Adapter createRestartMenuAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.StartFieldDeclaration <em>Start Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.StartFieldDeclaration
   * @generated
   */
  public Adapter createStartFieldDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.AboutSpecification <em>About Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.AboutSpecification
   * @generated
   */
  public Adapter createAboutSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.HelpSpecification <em>Help Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.HelpSpecification
   * @generated
   */
  public Adapter createHelpSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.BackSpecification <em>Back Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.BackSpecification
   * @generated
   */
  public Adapter createBackSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.BackgroundIcon <em>Background Icon</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.BackgroundIcon
   * @generated
   */
  public Adapter createBackgroundIconAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.BackGroundSize <em>Back Ground Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.BackGroundSize
   * @generated
   */
  public Adapter createBackGroundSizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.BackgroundTag <em>Background Tag</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.BackgroundTag
   * @generated
   */
  public Adapter createBackgroundTagAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.BackgroundTagLocate <em>Background Tag Locate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.BackgroundTagLocate
   * @generated
   */
  public Adapter createBackgroundTagLocateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.MusicSpecification <em>Music Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.MusicSpecification
   * @generated
   */
  public Adapter createMusicSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.MusicPath <em>Music Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.MusicPath
   * @generated
   */
  public Adapter createMusicPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.StringVal <em>String Val</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.StringVal
   * @generated
   */
  public Adapter createStringValAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.Addition
   * @generated
   */
  public Adapter createAdditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl2.group16.greedySnake.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl2.group16.greedySnake.Multiplication
   * @generated
   */
  public Adapter createMultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GreedySnakeAdapterFactory

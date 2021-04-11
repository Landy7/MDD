/**
 * generated by Xtext 2.25.0.M1
 */
package org.xtext.example.mydsl2.group16.greedySnake;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greedy Snake</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.GreedySnake#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.GreedySnake#getSnakes <em>Snakes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.GreedySnake#getFoods <em>Foods</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.GreedySnake#getObstacles <em>Obstacles</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.GreedySnake#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.GreedySnake#getFire <em>Fire</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.GreedySnake#getTime <em>Time</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.GreedySnake#getMap <em>Map</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.GreedySnake#getAbout <em>About</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.GreedySnake#getHelp <em>Help</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.GreedySnake#getMusic <em>Music</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.GreedySnake#getBackgrounds <em>Backgrounds</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.GreedySnake#getFields <em>Fields</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.GreedySnake#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getGreedySnake()
 * @model
 * @generated
 */
public interface GreedySnake extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getGreedySnake_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.group16.greedySnake.GreedySnake#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Snakes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.InitialSnakeSpecificatin}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Snakes</em>' containment reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getGreedySnake_Snakes()
   * @model containment="true"
   * @generated
   */
  EList<InitialSnakeSpecificatin> getSnakes();

  /**
   * Returns the value of the '<em><b>Foods</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.InitialFoodSpecificatin}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foods</em>' containment reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getGreedySnake_Foods()
   * @model containment="true"
   * @generated
   */
  EList<InitialFoodSpecificatin> getFoods();

  /**
   * Returns the value of the '<em><b>Obstacles</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.InitialObstacleSpecificatin}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obstacles</em>' containment reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getGreedySnake_Obstacles()
   * @model containment="true"
   * @generated
   */
  EList<InitialObstacleSpecificatin> getObstacles();

  /**
   * Returns the value of the '<em><b>Speed</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.InitialSpeedSpecification}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Speed</em>' containment reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getGreedySnake_Speed()
   * @model containment="true"
   * @generated
   */
  EList<InitialSpeedSpecification> getSpeed();

  /**
   * Returns the value of the '<em><b>Fire</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.InitialFireSpecification}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fire</em>' containment reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getGreedySnake_Fire()
   * @model containment="true"
   * @generated
   */
  EList<InitialFireSpecification> getFire();

  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.TimeLimited}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getGreedySnake_Time()
   * @model containment="true"
   * @generated
   */
  EList<TimeLimited> getTime();

  /**
   * Returns the value of the '<em><b>Map</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.GlobalMap}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map</em>' containment reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getGreedySnake_Map()
   * @model containment="true"
   * @generated
   */
  EList<GlobalMap> getMap();

  /**
   * Returns the value of the '<em><b>About</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.AboutSpecification}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>About</em>' containment reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getGreedySnake_About()
   * @model containment="true"
   * @generated
   */
  EList<AboutSpecification> getAbout();

  /**
   * Returns the value of the '<em><b>Help</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.HelpSpecification}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Help</em>' containment reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getGreedySnake_Help()
   * @model containment="true"
   * @generated
   */
  EList<HelpSpecification> getHelp();

  /**
   * Returns the value of the '<em><b>Music</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.MusicSpecification}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Music</em>' containment reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getGreedySnake_Music()
   * @model containment="true"
   * @generated
   */
  EList<MusicSpecification> getMusic();

  /**
   * Returns the value of the '<em><b>Backgrounds</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.BackSpecification}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Backgrounds</em>' containment reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getGreedySnake_Backgrounds()
   * @model containment="true"
   * @generated
   */
  EList<BackSpecification> getBackgrounds();

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.GlobalFieldInitialisation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getGreedySnake_Fields()
   * @model containment="true"
   * @generated
   */
  EList<GlobalFieldInitialisation> getFields();

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.OptionSpecification}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getGreedySnake_Options()
   * @model containment="true"
   * @generated
   */
  EList<OptionSpecification> getOptions();

} // GreedySnake
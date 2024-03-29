/**
 * generated by Xtext 2.25.0.M1
 */
package org.xtext.example.mydsl2.group16.greedySnake;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obstacle Init Display</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.ObstacleInitDisplay#getObstacleIcon <em>Obstacle Icon</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.ObstacleInitDisplay#getIconsize <em>Iconsize</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.ObstacleInitDisplay#getObstacleTag <em>Obstacle Tag</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getObstacleInitDisplay()
 * @model
 * @generated
 */
public interface ObstacleInitDisplay extends EObject
{
  /**
   * Returns the value of the '<em><b>Obstacle Icon</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.IconTag}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obstacle Icon</em>' containment reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getObstacleInitDisplay_ObstacleIcon()
   * @model containment="true"
   * @generated
   */
  EList<IconTag> getObstacleIcon();

  /**
   * Returns the value of the '<em><b>Iconsize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iconsize</em>' attribute.
   * @see #setIconsize(String)
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getObstacleInitDisplay_Iconsize()
   * @model
   * @generated
   */
  String getIconsize();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.group16.greedySnake.ObstacleInitDisplay#getIconsize <em>Iconsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iconsize</em>' attribute.
   * @see #getIconsize()
   * @generated
   */
  void setIconsize(String value);

  /**
   * Returns the value of the '<em><b>Obstacle Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obstacle Tag</em>' attribute.
   * @see #setObstacleTag(int)
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getObstacleInitDisplay_ObstacleTag()
   * @model
   * @generated
   */
  int getObstacleTag();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.group16.greedySnake.ObstacleInitDisplay#getObstacleTag <em>Obstacle Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obstacle Tag</em>' attribute.
   * @see #getObstacleTag()
   * @generated
   */
  void setObstacleTag(int value);

} // ObstacleInitDisplay

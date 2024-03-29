/**
 * generated by Xtext 2.25.0.M1
 */
package org.xtext.example.mydsl2.group16.greedySnake;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Snake Init Display</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.SnakeInitDisplay#getHead <em>Head</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.SnakeInitDisplay#getInitial_x <em>Initial x</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.SnakeInitDisplay#getInitial_y <em>Initial y</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.SnakeInitDisplay#getHeadIcon <em>Head Icon</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.SnakeInitDisplay#getIconsize <em>Iconsize</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.SnakeInitDisplay#getBodyIcon <em>Body Icon</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.SnakeInitDisplay#getDefaultSpeed <em>Default Speed</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.SnakeInitDisplay#getSnakeTag <em>Snake Tag</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getSnakeInitDisplay()
 * @model
 * @generated
 */
public interface SnakeInitDisplay extends EObject
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' attribute.
   * @see #setHead(String)
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getSnakeInitDisplay_Head()
   * @model
   * @generated
   */
  String getHead();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.group16.greedySnake.SnakeInitDisplay#getHead <em>Head</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' attribute.
   * @see #getHead()
   * @generated
   */
  void setHead(String value);

  /**
   * Returns the value of the '<em><b>Initial x</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial x</em>' attribute.
   * @see #setInitial_x(int)
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getSnakeInitDisplay_Initial_x()
   * @model
   * @generated
   */
  int getInitial_x();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.group16.greedySnake.SnakeInitDisplay#getInitial_x <em>Initial x</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial x</em>' attribute.
   * @see #getInitial_x()
   * @generated
   */
  void setInitial_x(int value);

  /**
   * Returns the value of the '<em><b>Initial y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial y</em>' attribute.
   * @see #setInitial_y(int)
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getSnakeInitDisplay_Initial_y()
   * @model
   * @generated
   */
  int getInitial_y();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.group16.greedySnake.SnakeInitDisplay#getInitial_y <em>Initial y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial y</em>' attribute.
   * @see #getInitial_y()
   * @generated
   */
  void setInitial_y(int value);

  /**
   * Returns the value of the '<em><b>Head Icon</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.IconTag}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head Icon</em>' containment reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getSnakeInitDisplay_HeadIcon()
   * @model containment="true"
   * @generated
   */
  EList<IconTag> getHeadIcon();

  /**
   * Returns the value of the '<em><b>Iconsize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iconsize</em>' attribute.
   * @see #setIconsize(String)
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getSnakeInitDisplay_Iconsize()
   * @model
   * @generated
   */
  String getIconsize();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.group16.greedySnake.SnakeInitDisplay#getIconsize <em>Iconsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iconsize</em>' attribute.
   * @see #getIconsize()
   * @generated
   */
  void setIconsize(String value);

  /**
   * Returns the value of the '<em><b>Body Icon</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.IconTag}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body Icon</em>' containment reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getSnakeInitDisplay_BodyIcon()
   * @model containment="true"
   * @generated
   */
  EList<IconTag> getBodyIcon();

  /**
   * Returns the value of the '<em><b>Default Speed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Speed</em>' attribute.
   * @see #setDefaultSpeed(int)
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getSnakeInitDisplay_DefaultSpeed()
   * @model
   * @generated
   */
  int getDefaultSpeed();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.group16.greedySnake.SnakeInitDisplay#getDefaultSpeed <em>Default Speed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Speed</em>' attribute.
   * @see #getDefaultSpeed()
   * @generated
   */
  void setDefaultSpeed(int value);

  /**
   * Returns the value of the '<em><b>Snake Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Snake Tag</em>' attribute.
   * @see #setSnakeTag(int)
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getSnakeInitDisplay_SnakeTag()
   * @model
   * @generated
   */
  int getSnakeTag();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.group16.greedySnake.SnakeInitDisplay#getSnakeTag <em>Snake Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Snake Tag</em>' attribute.
   * @see #getSnakeTag()
   * @generated
   */
  void setSnakeTag(int value);

} // SnakeInitDisplay

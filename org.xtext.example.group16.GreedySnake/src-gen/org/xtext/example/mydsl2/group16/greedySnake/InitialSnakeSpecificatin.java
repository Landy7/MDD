/**
 * generated by Xtext 2.25.0.M1
 */
package org.xtext.example.mydsl2.group16.greedySnake;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial Snake Specificatin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.InitialSnakeSpecificatin#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.InitialSnakeSpecificatin#getMembers <em>Members</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.InitialSnakeSpecificatin#getMultiples <em>Multiples</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getInitialSnakeSpecificatin()
 * @model
 * @generated
 */
public interface InitialSnakeSpecificatin extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getInitialSnakeSpecificatin_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.group16.greedySnake.InitialSnakeSpecificatin#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference.
   * @see #setMembers(SnakeMembers)
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getInitialSnakeSpecificatin_Members()
   * @model containment="true"
   * @generated
   */
  SnakeMembers getMembers();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.group16.greedySnake.InitialSnakeSpecificatin#getMembers <em>Members</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Members</em>' containment reference.
   * @see #getMembers()
   * @generated
   */
  void setMembers(SnakeMembers value);

  /**
   * Returns the value of the '<em><b>Multiples</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.InitialSnakeSpecificatin}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiples</em>' reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getInitialSnakeSpecificatin_Multiples()
   * @model
   * @generated
   */
  EList<InitialSnakeSpecificatin> getMultiples();

} // InitialSnakeSpecificatin
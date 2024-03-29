/**
 * generated by Xtext 2.25.0.M1
 */
package org.xtext.example.mydsl2.group16.greedySnake;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direction Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.DirectionSpecification#getDi <em>Di</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getDirectionSpecification()
 * @model
 * @generated
 */
public interface DirectionSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Di</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.dis}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Di</em>' containment reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getDirectionSpecification_Di()
   * @model containment="true"
   * @generated
   */
  EList<dis> getDi();

} // DirectionSpecification

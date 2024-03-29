/**
 * generated by Xtext 2.25.0.M1
 */
package org.xtext.example.mydsl2.group16.greedySnake;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Music Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.MusicSpecification#getBuffersize <em>Buffersize</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.MusicSpecification#getMusicPath <em>Music Path</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getMusicSpecification()
 * @model
 * @generated
 */
public interface MusicSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Buffersize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Buffersize</em>' attribute.
   * @see #setBuffersize(int)
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getMusicSpecification_Buffersize()
   * @model
   * @generated
   */
  int getBuffersize();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.group16.greedySnake.MusicSpecification#getBuffersize <em>Buffersize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Buffersize</em>' attribute.
   * @see #getBuffersize()
   * @generated
   */
  void setBuffersize(int value);

  /**
   * Returns the value of the '<em><b>Music Path</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.group16.greedySnake.MusicPath}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Music Path</em>' containment reference list.
   * @see org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage#getMusicSpecification_MusicPath()
   * @model containment="true"
   * @generated
   */
  EList<MusicPath> getMusicPath();

} // MusicSpecification

/**
 * generated by Xtext 2.25.0.M1
 */
package org.xtext.example.mydsl2.group16.greedySnake.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage;
import org.xtext.example.mydsl2.group16.greedySnake.Move;
import org.xtext.example.mydsl2.group16.greedySnake.SnakeMoveSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Snake Move Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.impl.SnakeMoveSpecificationImpl#getIF <em>IF</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SnakeMoveSpecificationImpl extends MinimalEObjectImpl.Container implements SnakeMoveSpecification
{
  /**
   * The cached value of the '{@link #getIF() <em>IF</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIF()
   * @generated
   * @ordered
   */
  protected EList<Move> if_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SnakeMoveSpecificationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GreedySnakePackage.Literals.SNAKE_MOVE_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Move> getIF()
  {
    if (if_ == null)
    {
      if_ = new EObjectContainmentEList<Move>(Move.class, this, GreedySnakePackage.SNAKE_MOVE_SPECIFICATION__IF);
    }
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GreedySnakePackage.SNAKE_MOVE_SPECIFICATION__IF:
        return ((InternalEList<?>)getIF()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GreedySnakePackage.SNAKE_MOVE_SPECIFICATION__IF:
        return getIF();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GreedySnakePackage.SNAKE_MOVE_SPECIFICATION__IF:
        getIF().clear();
        getIF().addAll((Collection<? extends Move>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GreedySnakePackage.SNAKE_MOVE_SPECIFICATION__IF:
        getIF().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GreedySnakePackage.SNAKE_MOVE_SPECIFICATION__IF:
        return if_ != null && !if_.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SnakeMoveSpecificationImpl

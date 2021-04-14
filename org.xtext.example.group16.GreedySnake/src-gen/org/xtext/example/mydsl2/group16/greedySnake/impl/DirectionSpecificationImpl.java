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

import org.xtext.example.mydsl2.group16.greedySnake.DirectionSpecification;
import org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage;
import org.xtext.example.mydsl2.group16.greedySnake.dis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direction Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.impl.DirectionSpecificationImpl#getDi <em>Di</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectionSpecificationImpl extends MinimalEObjectImpl.Container implements DirectionSpecification
{
  /**
   * The cached value of the '{@link #getDi() <em>Di</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDi()
   * @generated
   * @ordered
   */
  protected EList<dis> di;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DirectionSpecificationImpl()
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
    return GreedySnakePackage.Literals.DIRECTION_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<dis> getDi()
  {
    if (di == null)
    {
      di = new EObjectContainmentEList<dis>(dis.class, this, GreedySnakePackage.DIRECTION_SPECIFICATION__DI);
    }
    return di;
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
      case GreedySnakePackage.DIRECTION_SPECIFICATION__DI:
        return ((InternalEList<?>)getDi()).basicRemove(otherEnd, msgs);
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
      case GreedySnakePackage.DIRECTION_SPECIFICATION__DI:
        return getDi();
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
      case GreedySnakePackage.DIRECTION_SPECIFICATION__DI:
        getDi().clear();
        getDi().addAll((Collection<? extends dis>)newValue);
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
      case GreedySnakePackage.DIRECTION_SPECIFICATION__DI:
        getDi().clear();
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
      case GreedySnakePackage.DIRECTION_SPECIFICATION__DI:
        return di != null && !di.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DirectionSpecificationImpl
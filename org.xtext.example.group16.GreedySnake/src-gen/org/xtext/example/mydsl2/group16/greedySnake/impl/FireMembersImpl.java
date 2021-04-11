/**
 * generated by Xtext 2.25.0.M1
 */
package org.xtext.example.mydsl2.group16.greedySnake.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl2.group16.greedySnake.FireInitDisplay;
import org.xtext.example.mydsl2.group16.greedySnake.FireMembers;
import org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fire Members</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.impl.FireMembersImpl#getFire <em>Fire</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FireMembersImpl extends MinimalEObjectImpl.Container implements FireMembers
{
  /**
   * The cached value of the '{@link #getFire() <em>Fire</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFire()
   * @generated
   * @ordered
   */
  protected FireInitDisplay fire;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FireMembersImpl()
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
    return GreedySnakePackage.Literals.FIRE_MEMBERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FireInitDisplay getFire()
  {
    return fire;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFire(FireInitDisplay newFire, NotificationChain msgs)
  {
    FireInitDisplay oldFire = fire;
    fire = newFire;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GreedySnakePackage.FIRE_MEMBERS__FIRE, oldFire, newFire);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFire(FireInitDisplay newFire)
  {
    if (newFire != fire)
    {
      NotificationChain msgs = null;
      if (fire != null)
        msgs = ((InternalEObject)fire).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GreedySnakePackage.FIRE_MEMBERS__FIRE, null, msgs);
      if (newFire != null)
        msgs = ((InternalEObject)newFire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GreedySnakePackage.FIRE_MEMBERS__FIRE, null, msgs);
      msgs = basicSetFire(newFire, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreedySnakePackage.FIRE_MEMBERS__FIRE, newFire, newFire));
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
      case GreedySnakePackage.FIRE_MEMBERS__FIRE:
        return basicSetFire(null, msgs);
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
      case GreedySnakePackage.FIRE_MEMBERS__FIRE:
        return getFire();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GreedySnakePackage.FIRE_MEMBERS__FIRE:
        setFire((FireInitDisplay)newValue);
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
      case GreedySnakePackage.FIRE_MEMBERS__FIRE:
        setFire((FireInitDisplay)null);
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
      case GreedySnakePackage.FIRE_MEMBERS__FIRE:
        return fire != null;
    }
    return super.eIsSet(featureID);
  }

} //FireMembersImpl

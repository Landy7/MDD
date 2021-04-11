/**
 * generated by Xtext 2.25.0.M1
 */
package org.xtext.example.mydsl2.group16.greedySnake.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.example.mydsl2.group16.greedySnake.FoodMembers;
import org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage;
import org.xtext.example.mydsl2.group16.greedySnake.InitialFoodSpecificatin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Food Specificatin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.impl.InitialFoodSpecificatinImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.impl.InitialFoodSpecificatinImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.impl.InitialFoodSpecificatinImpl#getMultiples <em>Multiples</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialFoodSpecificatinImpl extends MinimalEObjectImpl.Container implements InitialFoodSpecificatin
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected FoodMembers members;

  /**
   * The cached value of the '{@link #getMultiples() <em>Multiples</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiples()
   * @generated
   * @ordered
   */
  protected EList<InitialFoodSpecificatin> multiples;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitialFoodSpecificatinImpl()
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
    return GreedySnakePackage.Literals.INITIAL_FOOD_SPECIFICATIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FoodMembers getMembers()
  {
    return members;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMembers(FoodMembers newMembers, NotificationChain msgs)
  {
    FoodMembers oldMembers = members;
    members = newMembers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__MEMBERS, oldMembers, newMembers);
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
  public void setMembers(FoodMembers newMembers)
  {
    if (newMembers != members)
    {
      NotificationChain msgs = null;
      if (members != null)
        msgs = ((InternalEObject)members).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__MEMBERS, null, msgs);
      if (newMembers != null)
        msgs = ((InternalEObject)newMembers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__MEMBERS, null, msgs);
      msgs = basicSetMembers(newMembers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__MEMBERS, newMembers, newMembers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<InitialFoodSpecificatin> getMultiples()
  {
    if (multiples == null)
    {
      multiples = new EObjectResolvingEList<InitialFoodSpecificatin>(InitialFoodSpecificatin.class, this, GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__MULTIPLES);
    }
    return multiples;
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
      case GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__MEMBERS:
        return basicSetMembers(null, msgs);
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
      case GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__NAME:
        return getName();
      case GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__MEMBERS:
        return getMembers();
      case GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__MULTIPLES:
        return getMultiples();
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
      case GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__NAME:
        setName((String)newValue);
        return;
      case GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__MEMBERS:
        setMembers((FoodMembers)newValue);
        return;
      case GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__MULTIPLES:
        getMultiples().clear();
        getMultiples().addAll((Collection<? extends InitialFoodSpecificatin>)newValue);
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
      case GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__MEMBERS:
        setMembers((FoodMembers)null);
        return;
      case GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__MULTIPLES:
        getMultiples().clear();
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
      case GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__MEMBERS:
        return members != null;
      case GreedySnakePackage.INITIAL_FOOD_SPECIFICATIN__MULTIPLES:
        return multiples != null && !multiples.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //InitialFoodSpecificatinImpl
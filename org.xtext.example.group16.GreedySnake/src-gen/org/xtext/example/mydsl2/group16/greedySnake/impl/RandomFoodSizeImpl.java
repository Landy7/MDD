/**
 * generated by Xtext 2.25.0.M1
 */
package org.xtext.example.mydsl2.group16.greedySnake.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage;
import org.xtext.example.mydsl2.group16.greedySnake.RandomFoodSize;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Random Food Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.impl.RandomFoodSizeImpl#getMaxsize <em>Maxsize</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.impl.RandomFoodSizeImpl#getMinsize <em>Minsize</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RandomFoodSizeImpl extends MinimalEObjectImpl.Container implements RandomFoodSize
{
  /**
   * The default value of the '{@link #getMaxsize() <em>Maxsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxsize()
   * @generated
   * @ordered
   */
  protected static final int MAXSIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxsize() <em>Maxsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxsize()
   * @generated
   * @ordered
   */
  protected int maxsize = MAXSIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getMinsize() <em>Minsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinsize()
   * @generated
   * @ordered
   */
  protected static final int MINSIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinsize() <em>Minsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinsize()
   * @generated
   * @ordered
   */
  protected int minsize = MINSIZE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RandomFoodSizeImpl()
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
    return GreedySnakePackage.Literals.RANDOM_FOOD_SIZE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMaxsize()
  {
    return maxsize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMaxsize(int newMaxsize)
  {
    int oldMaxsize = maxsize;
    maxsize = newMaxsize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreedySnakePackage.RANDOM_FOOD_SIZE__MAXSIZE, oldMaxsize, maxsize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMinsize()
  {
    return minsize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMinsize(int newMinsize)
  {
    int oldMinsize = minsize;
    minsize = newMinsize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreedySnakePackage.RANDOM_FOOD_SIZE__MINSIZE, oldMinsize, minsize));
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
      case GreedySnakePackage.RANDOM_FOOD_SIZE__MAXSIZE:
        return getMaxsize();
      case GreedySnakePackage.RANDOM_FOOD_SIZE__MINSIZE:
        return getMinsize();
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
      case GreedySnakePackage.RANDOM_FOOD_SIZE__MAXSIZE:
        setMaxsize((Integer)newValue);
        return;
      case GreedySnakePackage.RANDOM_FOOD_SIZE__MINSIZE:
        setMinsize((Integer)newValue);
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
      case GreedySnakePackage.RANDOM_FOOD_SIZE__MAXSIZE:
        setMaxsize(MAXSIZE_EDEFAULT);
        return;
      case GreedySnakePackage.RANDOM_FOOD_SIZE__MINSIZE:
        setMinsize(MINSIZE_EDEFAULT);
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
      case GreedySnakePackage.RANDOM_FOOD_SIZE__MAXSIZE:
        return maxsize != MAXSIZE_EDEFAULT;
      case GreedySnakePackage.RANDOM_FOOD_SIZE__MINSIZE:
        return minsize != MINSIZE_EDEFAULT;
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
    result.append(" (maxsize: ");
    result.append(maxsize);
    result.append(", minsize: ");
    result.append(minsize);
    result.append(')');
    return result.toString();
  }

} //RandomFoodSizeImpl

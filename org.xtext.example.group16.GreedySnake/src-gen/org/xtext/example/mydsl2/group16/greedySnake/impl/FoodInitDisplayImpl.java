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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl2.group16.greedySnake.FoodInitDisplay;
import org.xtext.example.mydsl2.group16.greedySnake.FoodKind;
import org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage;
import org.xtext.example.mydsl2.group16.greedySnake.IconTag;
import org.xtext.example.mydsl2.group16.greedySnake.RandomFoodSize;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Food Init Display</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.impl.FoodInitDisplayImpl#getFoodIcon <em>Food Icon</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.impl.FoodInitDisplayImpl#getIconsize <em>Iconsize</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.impl.FoodInitDisplayImpl#getFoodKind <em>Food Kind</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.impl.FoodInitDisplayImpl#getProduce <em>Produce</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.impl.FoodInitDisplayImpl#getFoodTag <em>Food Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FoodInitDisplayImpl extends MinimalEObjectImpl.Container implements FoodInitDisplay
{
  /**
   * The cached value of the '{@link #getFoodIcon() <em>Food Icon</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFoodIcon()
   * @generated
   * @ordered
   */
  protected EList<IconTag> foodIcon;

  /**
   * The default value of the '{@link #getIconsize() <em>Iconsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIconsize()
   * @generated
   * @ordered
   */
  protected static final String ICONSIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIconsize() <em>Iconsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIconsize()
   * @generated
   * @ordered
   */
  protected String iconsize = ICONSIZE_EDEFAULT;

  /**
   * The cached value of the '{@link #getFoodKind() <em>Food Kind</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFoodKind()
   * @generated
   * @ordered
   */
  protected EList<FoodKind> foodKind;

  /**
   * The cached value of the '{@link #getProduce() <em>Produce</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProduce()
   * @generated
   * @ordered
   */
  protected RandomFoodSize produce;

  /**
   * The default value of the '{@link #getFoodTag() <em>Food Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFoodTag()
   * @generated
   * @ordered
   */
  protected static final int FOOD_TAG_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFoodTag() <em>Food Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFoodTag()
   * @generated
   * @ordered
   */
  protected int foodTag = FOOD_TAG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FoodInitDisplayImpl()
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
    return GreedySnakePackage.Literals.FOOD_INIT_DISPLAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<IconTag> getFoodIcon()
  {
    if (foodIcon == null)
    {
      foodIcon = new EObjectContainmentEList<IconTag>(IconTag.class, this, GreedySnakePackage.FOOD_INIT_DISPLAY__FOOD_ICON);
    }
    return foodIcon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getIconsize()
  {
    return iconsize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIconsize(String newIconsize)
  {
    String oldIconsize = iconsize;
    iconsize = newIconsize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreedySnakePackage.FOOD_INIT_DISPLAY__ICONSIZE, oldIconsize, iconsize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FoodKind> getFoodKind()
  {
    if (foodKind == null)
    {
      foodKind = new EObjectContainmentEList<FoodKind>(FoodKind.class, this, GreedySnakePackage.FOOD_INIT_DISPLAY__FOOD_KIND);
    }
    return foodKind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RandomFoodSize getProduce()
  {
    return produce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProduce(RandomFoodSize newProduce, NotificationChain msgs)
  {
    RandomFoodSize oldProduce = produce;
    produce = newProduce;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GreedySnakePackage.FOOD_INIT_DISPLAY__PRODUCE, oldProduce, newProduce);
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
  public void setProduce(RandomFoodSize newProduce)
  {
    if (newProduce != produce)
    {
      NotificationChain msgs = null;
      if (produce != null)
        msgs = ((InternalEObject)produce).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GreedySnakePackage.FOOD_INIT_DISPLAY__PRODUCE, null, msgs);
      if (newProduce != null)
        msgs = ((InternalEObject)newProduce).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GreedySnakePackage.FOOD_INIT_DISPLAY__PRODUCE, null, msgs);
      msgs = basicSetProduce(newProduce, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreedySnakePackage.FOOD_INIT_DISPLAY__PRODUCE, newProduce, newProduce));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getFoodTag()
  {
    return foodTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFoodTag(int newFoodTag)
  {
    int oldFoodTag = foodTag;
    foodTag = newFoodTag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreedySnakePackage.FOOD_INIT_DISPLAY__FOOD_TAG, oldFoodTag, foodTag));
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
      case GreedySnakePackage.FOOD_INIT_DISPLAY__FOOD_ICON:
        return ((InternalEList<?>)getFoodIcon()).basicRemove(otherEnd, msgs);
      case GreedySnakePackage.FOOD_INIT_DISPLAY__FOOD_KIND:
        return ((InternalEList<?>)getFoodKind()).basicRemove(otherEnd, msgs);
      case GreedySnakePackage.FOOD_INIT_DISPLAY__PRODUCE:
        return basicSetProduce(null, msgs);
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
      case GreedySnakePackage.FOOD_INIT_DISPLAY__FOOD_ICON:
        return getFoodIcon();
      case GreedySnakePackage.FOOD_INIT_DISPLAY__ICONSIZE:
        return getIconsize();
      case GreedySnakePackage.FOOD_INIT_DISPLAY__FOOD_KIND:
        return getFoodKind();
      case GreedySnakePackage.FOOD_INIT_DISPLAY__PRODUCE:
        return getProduce();
      case GreedySnakePackage.FOOD_INIT_DISPLAY__FOOD_TAG:
        return getFoodTag();
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
      case GreedySnakePackage.FOOD_INIT_DISPLAY__FOOD_ICON:
        getFoodIcon().clear();
        getFoodIcon().addAll((Collection<? extends IconTag>)newValue);
        return;
      case GreedySnakePackage.FOOD_INIT_DISPLAY__ICONSIZE:
        setIconsize((String)newValue);
        return;
      case GreedySnakePackage.FOOD_INIT_DISPLAY__FOOD_KIND:
        getFoodKind().clear();
        getFoodKind().addAll((Collection<? extends FoodKind>)newValue);
        return;
      case GreedySnakePackage.FOOD_INIT_DISPLAY__PRODUCE:
        setProduce((RandomFoodSize)newValue);
        return;
      case GreedySnakePackage.FOOD_INIT_DISPLAY__FOOD_TAG:
        setFoodTag((Integer)newValue);
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
      case GreedySnakePackage.FOOD_INIT_DISPLAY__FOOD_ICON:
        getFoodIcon().clear();
        return;
      case GreedySnakePackage.FOOD_INIT_DISPLAY__ICONSIZE:
        setIconsize(ICONSIZE_EDEFAULT);
        return;
      case GreedySnakePackage.FOOD_INIT_DISPLAY__FOOD_KIND:
        getFoodKind().clear();
        return;
      case GreedySnakePackage.FOOD_INIT_DISPLAY__PRODUCE:
        setProduce((RandomFoodSize)null);
        return;
      case GreedySnakePackage.FOOD_INIT_DISPLAY__FOOD_TAG:
        setFoodTag(FOOD_TAG_EDEFAULT);
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
      case GreedySnakePackage.FOOD_INIT_DISPLAY__FOOD_ICON:
        return foodIcon != null && !foodIcon.isEmpty();
      case GreedySnakePackage.FOOD_INIT_DISPLAY__ICONSIZE:
        return ICONSIZE_EDEFAULT == null ? iconsize != null : !ICONSIZE_EDEFAULT.equals(iconsize);
      case GreedySnakePackage.FOOD_INIT_DISPLAY__FOOD_KIND:
        return foodKind != null && !foodKind.isEmpty();
      case GreedySnakePackage.FOOD_INIT_DISPLAY__PRODUCE:
        return produce != null;
      case GreedySnakePackage.FOOD_INIT_DISPLAY__FOOD_TAG:
        return foodTag != FOOD_TAG_EDEFAULT;
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
    result.append(" (Iconsize: ");
    result.append(iconsize);
    result.append(", foodTag: ");
    result.append(foodTag);
    result.append(')');
    return result.toString();
  }

} //FoodInitDisplayImpl

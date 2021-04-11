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

import org.xtext.example.mydsl2.group16.greedySnake.BackSpecification;
import org.xtext.example.mydsl2.group16.greedySnake.BackgroundIcon;
import org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Back Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.impl.BackSpecificationImpl#getBackgroundIcon <em>Background Icon</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.impl.BackSpecificationImpl#getBackGroundHeight <em>Back Ground Height</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.impl.BackSpecificationImpl#getBackGroundWidth <em>Back Ground Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BackSpecificationImpl extends MinimalEObjectImpl.Container implements BackSpecification
{
  /**
   * The cached value of the '{@link #getBackgroundIcon() <em>Background Icon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackgroundIcon()
   * @generated
   * @ordered
   */
  protected BackgroundIcon backgroundIcon;

  /**
   * The default value of the '{@link #getBackGroundHeight() <em>Back Ground Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackGroundHeight()
   * @generated
   * @ordered
   */
  protected static final String BACK_GROUND_HEIGHT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBackGroundHeight() <em>Back Ground Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackGroundHeight()
   * @generated
   * @ordered
   */
  protected String backGroundHeight = BACK_GROUND_HEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getBackGroundWidth() <em>Back Ground Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackGroundWidth()
   * @generated
   * @ordered
   */
  protected static final String BACK_GROUND_WIDTH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBackGroundWidth() <em>Back Ground Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackGroundWidth()
   * @generated
   * @ordered
   */
  protected String backGroundWidth = BACK_GROUND_WIDTH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BackSpecificationImpl()
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
    return GreedySnakePackage.Literals.BACK_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BackgroundIcon getBackgroundIcon()
  {
    return backgroundIcon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBackgroundIcon(BackgroundIcon newBackgroundIcon, NotificationChain msgs)
  {
    BackgroundIcon oldBackgroundIcon = backgroundIcon;
    backgroundIcon = newBackgroundIcon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GreedySnakePackage.BACK_SPECIFICATION__BACKGROUND_ICON, oldBackgroundIcon, newBackgroundIcon);
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
  public void setBackgroundIcon(BackgroundIcon newBackgroundIcon)
  {
    if (newBackgroundIcon != backgroundIcon)
    {
      NotificationChain msgs = null;
      if (backgroundIcon != null)
        msgs = ((InternalEObject)backgroundIcon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GreedySnakePackage.BACK_SPECIFICATION__BACKGROUND_ICON, null, msgs);
      if (newBackgroundIcon != null)
        msgs = ((InternalEObject)newBackgroundIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GreedySnakePackage.BACK_SPECIFICATION__BACKGROUND_ICON, null, msgs);
      msgs = basicSetBackgroundIcon(newBackgroundIcon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreedySnakePackage.BACK_SPECIFICATION__BACKGROUND_ICON, newBackgroundIcon, newBackgroundIcon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBackGroundHeight()
  {
    return backGroundHeight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBackGroundHeight(String newBackGroundHeight)
  {
    String oldBackGroundHeight = backGroundHeight;
    backGroundHeight = newBackGroundHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreedySnakePackage.BACK_SPECIFICATION__BACK_GROUND_HEIGHT, oldBackGroundHeight, backGroundHeight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBackGroundWidth()
  {
    return backGroundWidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBackGroundWidth(String newBackGroundWidth)
  {
    String oldBackGroundWidth = backGroundWidth;
    backGroundWidth = newBackGroundWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreedySnakePackage.BACK_SPECIFICATION__BACK_GROUND_WIDTH, oldBackGroundWidth, backGroundWidth));
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
      case GreedySnakePackage.BACK_SPECIFICATION__BACKGROUND_ICON:
        return basicSetBackgroundIcon(null, msgs);
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
      case GreedySnakePackage.BACK_SPECIFICATION__BACKGROUND_ICON:
        return getBackgroundIcon();
      case GreedySnakePackage.BACK_SPECIFICATION__BACK_GROUND_HEIGHT:
        return getBackGroundHeight();
      case GreedySnakePackage.BACK_SPECIFICATION__BACK_GROUND_WIDTH:
        return getBackGroundWidth();
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
      case GreedySnakePackage.BACK_SPECIFICATION__BACKGROUND_ICON:
        setBackgroundIcon((BackgroundIcon)newValue);
        return;
      case GreedySnakePackage.BACK_SPECIFICATION__BACK_GROUND_HEIGHT:
        setBackGroundHeight((String)newValue);
        return;
      case GreedySnakePackage.BACK_SPECIFICATION__BACK_GROUND_WIDTH:
        setBackGroundWidth((String)newValue);
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
      case GreedySnakePackage.BACK_SPECIFICATION__BACKGROUND_ICON:
        setBackgroundIcon((BackgroundIcon)null);
        return;
      case GreedySnakePackage.BACK_SPECIFICATION__BACK_GROUND_HEIGHT:
        setBackGroundHeight(BACK_GROUND_HEIGHT_EDEFAULT);
        return;
      case GreedySnakePackage.BACK_SPECIFICATION__BACK_GROUND_WIDTH:
        setBackGroundWidth(BACK_GROUND_WIDTH_EDEFAULT);
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
      case GreedySnakePackage.BACK_SPECIFICATION__BACKGROUND_ICON:
        return backgroundIcon != null;
      case GreedySnakePackage.BACK_SPECIFICATION__BACK_GROUND_HEIGHT:
        return BACK_GROUND_HEIGHT_EDEFAULT == null ? backGroundHeight != null : !BACK_GROUND_HEIGHT_EDEFAULT.equals(backGroundHeight);
      case GreedySnakePackage.BACK_SPECIFICATION__BACK_GROUND_WIDTH:
        return BACK_GROUND_WIDTH_EDEFAULT == null ? backGroundWidth != null : !BACK_GROUND_WIDTH_EDEFAULT.equals(backGroundWidth);
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
    result.append(" (BackGroundHeight: ");
    result.append(backGroundHeight);
    result.append(", BackGroundWidth: ");
    result.append(backGroundWidth);
    result.append(')');
    return result.toString();
  }

} //BackSpecificationImpl

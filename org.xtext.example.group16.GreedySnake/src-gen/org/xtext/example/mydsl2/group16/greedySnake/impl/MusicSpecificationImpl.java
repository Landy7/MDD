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

import org.xtext.example.mydsl2.group16.greedySnake.GreedySnakePackage;
import org.xtext.example.mydsl2.group16.greedySnake.MusicPath;
import org.xtext.example.mydsl2.group16.greedySnake.MusicSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Music Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.impl.MusicSpecificationImpl#getBuffersize <em>Buffersize</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.group16.greedySnake.impl.MusicSpecificationImpl#getMusicPath <em>Music Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MusicSpecificationImpl extends MinimalEObjectImpl.Container implements MusicSpecification
{
  /**
   * The default value of the '{@link #getBuffersize() <em>Buffersize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuffersize()
   * @generated
   * @ordered
   */
  protected static final int BUFFERSIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBuffersize() <em>Buffersize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuffersize()
   * @generated
   * @ordered
   */
  protected int buffersize = BUFFERSIZE_EDEFAULT;

  /**
   * The cached value of the '{@link #getMusicPath() <em>Music Path</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMusicPath()
   * @generated
   * @ordered
   */
  protected EList<MusicPath> musicPath;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MusicSpecificationImpl()
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
    return GreedySnakePackage.Literals.MUSIC_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getBuffersize()
  {
    return buffersize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBuffersize(int newBuffersize)
  {
    int oldBuffersize = buffersize;
    buffersize = newBuffersize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreedySnakePackage.MUSIC_SPECIFICATION__BUFFERSIZE, oldBuffersize, buffersize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MusicPath> getMusicPath()
  {
    if (musicPath == null)
    {
      musicPath = new EObjectContainmentEList<MusicPath>(MusicPath.class, this, GreedySnakePackage.MUSIC_SPECIFICATION__MUSIC_PATH);
    }
    return musicPath;
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
      case GreedySnakePackage.MUSIC_SPECIFICATION__MUSIC_PATH:
        return ((InternalEList<?>)getMusicPath()).basicRemove(otherEnd, msgs);
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
      case GreedySnakePackage.MUSIC_SPECIFICATION__BUFFERSIZE:
        return getBuffersize();
      case GreedySnakePackage.MUSIC_SPECIFICATION__MUSIC_PATH:
        return getMusicPath();
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
      case GreedySnakePackage.MUSIC_SPECIFICATION__BUFFERSIZE:
        setBuffersize((Integer)newValue);
        return;
      case GreedySnakePackage.MUSIC_SPECIFICATION__MUSIC_PATH:
        getMusicPath().clear();
        getMusicPath().addAll((Collection<? extends MusicPath>)newValue);
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
      case GreedySnakePackage.MUSIC_SPECIFICATION__BUFFERSIZE:
        setBuffersize(BUFFERSIZE_EDEFAULT);
        return;
      case GreedySnakePackage.MUSIC_SPECIFICATION__MUSIC_PATH:
        getMusicPath().clear();
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
      case GreedySnakePackage.MUSIC_SPECIFICATION__BUFFERSIZE:
        return buffersize != BUFFERSIZE_EDEFAULT;
      case GreedySnakePackage.MUSIC_SPECIFICATION__MUSIC_PATH:
        return musicPath != null && !musicPath.isEmpty();
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
    result.append(" (buffersize: ");
    result.append(buffersize);
    result.append(')');
    return result.toString();
  }

} //MusicSpecificationImpl
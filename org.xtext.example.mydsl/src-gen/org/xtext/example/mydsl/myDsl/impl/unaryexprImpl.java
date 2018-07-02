/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.primaryexpr;
import org.xtext.example.mydsl.myDsl.unaryexpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unaryexpr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.unaryexprImpl#getPrimaryexpr <em>Primaryexpr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class unaryexprImpl extends expressionImpl implements unaryexpr
{
  /**
   * The cached value of the '{@link #getPrimaryexpr() <em>Primaryexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryexpr()
   * @generated
   * @ordered
   */
  protected primaryexpr primaryexpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected unaryexprImpl()
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
    return MyDslPackage.Literals.UNARYEXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryexpr getPrimaryexpr()
  {
    return primaryexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryexpr(primaryexpr newPrimaryexpr, NotificationChain msgs)
  {
    primaryexpr oldPrimaryexpr = primaryexpr;
    primaryexpr = newPrimaryexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARYEXPR__PRIMARYEXPR, oldPrimaryexpr, newPrimaryexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryexpr(primaryexpr newPrimaryexpr)
  {
    if (newPrimaryexpr != primaryexpr)
    {
      NotificationChain msgs = null;
      if (primaryexpr != null)
        msgs = ((InternalEObject)primaryexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.UNARYEXPR__PRIMARYEXPR, null, msgs);
      if (newPrimaryexpr != null)
        msgs = ((InternalEObject)newPrimaryexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.UNARYEXPR__PRIMARYEXPR, null, msgs);
      msgs = basicSetPrimaryexpr(newPrimaryexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARYEXPR__PRIMARYEXPR, newPrimaryexpr, newPrimaryexpr));
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
      case MyDslPackage.UNARYEXPR__PRIMARYEXPR:
        return basicSetPrimaryexpr(null, msgs);
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
      case MyDslPackage.UNARYEXPR__PRIMARYEXPR:
        return getPrimaryexpr();
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
      case MyDslPackage.UNARYEXPR__PRIMARYEXPR:
        setPrimaryexpr((primaryexpr)newValue);
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
      case MyDslPackage.UNARYEXPR__PRIMARYEXPR:
        setPrimaryexpr((primaryexpr)null);
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
      case MyDslPackage.UNARYEXPR__PRIMARYEXPR:
        return primaryexpr != null;
    }
    return super.eIsSet(featureID);
  }

} //unaryexprImpl

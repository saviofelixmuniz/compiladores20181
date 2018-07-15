/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.primaryexpr;
import org.xtext.example.mydsl.myDsl.typeswitchguard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>typeswitchguard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.typeswitchguardImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.typeswitchguardImpl#getPrimaryexpr <em>Primaryexpr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class typeswitchguardImpl extends MinimalEObjectImpl.Container implements typeswitchguard
{
  /**
   * The default value of the '{@link #getIDENTIFIER() <em>IDENTIFIER</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIDENTIFIER()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIDENTIFIER() <em>IDENTIFIER</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIDENTIFIER()
   * @generated
   * @ordered
   */
  protected String identifier = IDENTIFIER_EDEFAULT;

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
  protected typeswitchguardImpl()
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
    return MyDslPackage.Literals.TYPESWITCHGUARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIDENTIFIER()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIDENTIFIER(String newIDENTIFIER)
  {
    String oldIDENTIFIER = identifier;
    identifier = newIDENTIFIER;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPESWITCHGUARD__IDENTIFIER, oldIDENTIFIER, identifier));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPESWITCHGUARD__PRIMARYEXPR, oldPrimaryexpr, newPrimaryexpr);
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
        msgs = ((InternalEObject)primaryexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPESWITCHGUARD__PRIMARYEXPR, null, msgs);
      if (newPrimaryexpr != null)
        msgs = ((InternalEObject)newPrimaryexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPESWITCHGUARD__PRIMARYEXPR, null, msgs);
      msgs = basicSetPrimaryexpr(newPrimaryexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPESWITCHGUARD__PRIMARYEXPR, newPrimaryexpr, newPrimaryexpr));
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
      case MyDslPackage.TYPESWITCHGUARD__PRIMARYEXPR:
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
      case MyDslPackage.TYPESWITCHGUARD__IDENTIFIER:
        return getIDENTIFIER();
      case MyDslPackage.TYPESWITCHGUARD__PRIMARYEXPR:
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
      case MyDslPackage.TYPESWITCHGUARD__IDENTIFIER:
        setIDENTIFIER((String)newValue);
        return;
      case MyDslPackage.TYPESWITCHGUARD__PRIMARYEXPR:
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
      case MyDslPackage.TYPESWITCHGUARD__IDENTIFIER:
        setIDENTIFIER(IDENTIFIER_EDEFAULT);
        return;
      case MyDslPackage.TYPESWITCHGUARD__PRIMARYEXPR:
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
      case MyDslPackage.TYPESWITCHGUARD__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case MyDslPackage.TYPESWITCHGUARD__PRIMARYEXPR:
        return primaryexpr != null;
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
    result.append(" (IDENTIFIER: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //typeswitchguardImpl

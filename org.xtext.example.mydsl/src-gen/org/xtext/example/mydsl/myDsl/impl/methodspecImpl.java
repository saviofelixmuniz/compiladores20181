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
import org.xtext.example.mydsl.myDsl.methodspec;
import org.xtext.example.mydsl.myDsl.signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>methodspec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.methodspecImpl#getMethodname <em>Methodname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.methodspecImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.methodspecImpl#getInterfacetypename <em>Interfacetypename</em>}</li>
 * </ul>
 *
 * @generated
 */
public class methodspecImpl extends MinimalEObjectImpl.Container implements methodspec
{
  /**
   * The default value of the '{@link #getMethodname() <em>Methodname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodname()
   * @generated
   * @ordered
   */
  protected static final String METHODNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethodname() <em>Methodname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodname()
   * @generated
   * @ordered
   */
  protected String methodname = METHODNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignature()
   * @generated
   * @ordered
   */
  protected signature signature;

  /**
   * The default value of the '{@link #getInterfacetypename() <em>Interfacetypename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfacetypename()
   * @generated
   * @ordered
   */
  protected static final String INTERFACETYPENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterfacetypename() <em>Interfacetypename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfacetypename()
   * @generated
   * @ordered
   */
  protected String interfacetypename = INTERFACETYPENAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected methodspecImpl()
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
    return MyDslPackage.Literals.METHODSPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMethodname()
  {
    return methodname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodname(String newMethodname)
  {
    String oldMethodname = methodname;
    methodname = newMethodname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.METHODSPEC__METHODNAME, oldMethodname, methodname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public signature getSignature()
  {
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSignature(signature newSignature, NotificationChain msgs)
  {
    signature oldSignature = signature;
    signature = newSignature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.METHODSPEC__SIGNATURE, oldSignature, newSignature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignature(signature newSignature)
  {
    if (newSignature != signature)
    {
      NotificationChain msgs = null;
      if (signature != null)
        msgs = ((InternalEObject)signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.METHODSPEC__SIGNATURE, null, msgs);
      if (newSignature != null)
        msgs = ((InternalEObject)newSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.METHODSPEC__SIGNATURE, null, msgs);
      msgs = basicSetSignature(newSignature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.METHODSPEC__SIGNATURE, newSignature, newSignature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInterfacetypename()
  {
    return interfacetypename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfacetypename(String newInterfacetypename)
  {
    String oldInterfacetypename = interfacetypename;
    interfacetypename = newInterfacetypename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.METHODSPEC__INTERFACETYPENAME, oldInterfacetypename, interfacetypename));
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
      case MyDslPackage.METHODSPEC__SIGNATURE:
        return basicSetSignature(null, msgs);
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
      case MyDslPackage.METHODSPEC__METHODNAME:
        return getMethodname();
      case MyDslPackage.METHODSPEC__SIGNATURE:
        return getSignature();
      case MyDslPackage.METHODSPEC__INTERFACETYPENAME:
        return getInterfacetypename();
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
      case MyDslPackage.METHODSPEC__METHODNAME:
        setMethodname((String)newValue);
        return;
      case MyDslPackage.METHODSPEC__SIGNATURE:
        setSignature((signature)newValue);
        return;
      case MyDslPackage.METHODSPEC__INTERFACETYPENAME:
        setInterfacetypename((String)newValue);
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
      case MyDslPackage.METHODSPEC__METHODNAME:
        setMethodname(METHODNAME_EDEFAULT);
        return;
      case MyDslPackage.METHODSPEC__SIGNATURE:
        setSignature((signature)null);
        return;
      case MyDslPackage.METHODSPEC__INTERFACETYPENAME:
        setInterfacetypename(INTERFACETYPENAME_EDEFAULT);
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
      case MyDslPackage.METHODSPEC__METHODNAME:
        return METHODNAME_EDEFAULT == null ? methodname != null : !METHODNAME_EDEFAULT.equals(methodname);
      case MyDslPackage.METHODSPEC__SIGNATURE:
        return signature != null;
      case MyDslPackage.METHODSPEC__INTERFACETYPENAME:
        return INTERFACETYPENAME_EDEFAULT == null ? interfacetypename != null : !INTERFACETYPENAME_EDEFAULT.equals(interfacetypename);
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
    result.append(" (methodname: ");
    result.append(methodname);
    result.append(", interfacetypename: ");
    result.append(interfacetypename);
    result.append(')');
    return result.toString();
  }

} //methodspecImpl

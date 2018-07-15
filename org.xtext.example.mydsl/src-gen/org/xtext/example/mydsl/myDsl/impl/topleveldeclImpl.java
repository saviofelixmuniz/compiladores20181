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
import org.xtext.example.mydsl.myDsl.functiondecl;
import org.xtext.example.mydsl.myDsl.methoddecl;
import org.xtext.example.mydsl.myDsl.topleveldecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>topleveldecl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.topleveldeclImpl#getFunctiondecl <em>Functiondecl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.topleveldeclImpl#getMethoddecl <em>Methoddecl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class topleveldeclImpl extends MinimalEObjectImpl.Container implements topleveldecl
{
  /**
   * The cached value of the '{@link #getFunctiondecl() <em>Functiondecl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctiondecl()
   * @generated
   * @ordered
   */
  protected functiondecl functiondecl;

  /**
   * The cached value of the '{@link #getMethoddecl() <em>Methoddecl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethoddecl()
   * @generated
   * @ordered
   */
  protected methoddecl methoddecl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected topleveldeclImpl()
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
    return MyDslPackage.Literals.TOPLEVELDECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functiondecl getFunctiondecl()
  {
    return functiondecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctiondecl(functiondecl newFunctiondecl, NotificationChain msgs)
  {
    functiondecl oldFunctiondecl = functiondecl;
    functiondecl = newFunctiondecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TOPLEVELDECL__FUNCTIONDECL, oldFunctiondecl, newFunctiondecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctiondecl(functiondecl newFunctiondecl)
  {
    if (newFunctiondecl != functiondecl)
    {
      NotificationChain msgs = null;
      if (functiondecl != null)
        msgs = ((InternalEObject)functiondecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TOPLEVELDECL__FUNCTIONDECL, null, msgs);
      if (newFunctiondecl != null)
        msgs = ((InternalEObject)newFunctiondecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TOPLEVELDECL__FUNCTIONDECL, null, msgs);
      msgs = basicSetFunctiondecl(newFunctiondecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TOPLEVELDECL__FUNCTIONDECL, newFunctiondecl, newFunctiondecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public methoddecl getMethoddecl()
  {
    return methoddecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethoddecl(methoddecl newMethoddecl, NotificationChain msgs)
  {
    methoddecl oldMethoddecl = methoddecl;
    methoddecl = newMethoddecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TOPLEVELDECL__METHODDECL, oldMethoddecl, newMethoddecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethoddecl(methoddecl newMethoddecl)
  {
    if (newMethoddecl != methoddecl)
    {
      NotificationChain msgs = null;
      if (methoddecl != null)
        msgs = ((InternalEObject)methoddecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TOPLEVELDECL__METHODDECL, null, msgs);
      if (newMethoddecl != null)
        msgs = ((InternalEObject)newMethoddecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TOPLEVELDECL__METHODDECL, null, msgs);
      msgs = basicSetMethoddecl(newMethoddecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TOPLEVELDECL__METHODDECL, newMethoddecl, newMethoddecl));
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
      case MyDslPackage.TOPLEVELDECL__FUNCTIONDECL:
        return basicSetFunctiondecl(null, msgs);
      case MyDslPackage.TOPLEVELDECL__METHODDECL:
        return basicSetMethoddecl(null, msgs);
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
      case MyDslPackage.TOPLEVELDECL__FUNCTIONDECL:
        return getFunctiondecl();
      case MyDslPackage.TOPLEVELDECL__METHODDECL:
        return getMethoddecl();
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
      case MyDslPackage.TOPLEVELDECL__FUNCTIONDECL:
        setFunctiondecl((functiondecl)newValue);
        return;
      case MyDslPackage.TOPLEVELDECL__METHODDECL:
        setMethoddecl((methoddecl)newValue);
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
      case MyDslPackage.TOPLEVELDECL__FUNCTIONDECL:
        setFunctiondecl((functiondecl)null);
        return;
      case MyDslPackage.TOPLEVELDECL__METHODDECL:
        setMethoddecl((methoddecl)null);
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
      case MyDslPackage.TOPLEVELDECL__FUNCTIONDECL:
        return functiondecl != null;
      case MyDslPackage.TOPLEVELDECL__METHODDECL:
        return methoddecl != null;
    }
    return super.eIsSet(featureID);
  }

} //topleveldeclImpl

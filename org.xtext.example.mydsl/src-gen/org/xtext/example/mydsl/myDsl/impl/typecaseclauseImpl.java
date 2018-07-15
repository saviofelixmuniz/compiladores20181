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
import org.xtext.example.mydsl.myDsl.statementlist;
import org.xtext.example.mydsl.myDsl.typecaseclause;
import org.xtext.example.mydsl.myDsl.typeswitchcase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>typecaseclause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.typecaseclauseImpl#getTypeswitchcase <em>Typeswitchcase</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.typecaseclauseImpl#getStatementlist <em>Statementlist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class typecaseclauseImpl extends MinimalEObjectImpl.Container implements typecaseclause
{
  /**
   * The cached value of the '{@link #getTypeswitchcase() <em>Typeswitchcase</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeswitchcase()
   * @generated
   * @ordered
   */
  protected typeswitchcase typeswitchcase;

  /**
   * The cached value of the '{@link #getStatementlist() <em>Statementlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementlist()
   * @generated
   * @ordered
   */
  protected statementlist statementlist;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected typecaseclauseImpl()
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
    return MyDslPackage.Literals.TYPECASECLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeswitchcase getTypeswitchcase()
  {
    return typeswitchcase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeswitchcase(typeswitchcase newTypeswitchcase, NotificationChain msgs)
  {
    typeswitchcase oldTypeswitchcase = typeswitchcase;
    typeswitchcase = newTypeswitchcase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPECASECLAUSE__TYPESWITCHCASE, oldTypeswitchcase, newTypeswitchcase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeswitchcase(typeswitchcase newTypeswitchcase)
  {
    if (newTypeswitchcase != typeswitchcase)
    {
      NotificationChain msgs = null;
      if (typeswitchcase != null)
        msgs = ((InternalEObject)typeswitchcase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPECASECLAUSE__TYPESWITCHCASE, null, msgs);
      if (newTypeswitchcase != null)
        msgs = ((InternalEObject)newTypeswitchcase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPECASECLAUSE__TYPESWITCHCASE, null, msgs);
      msgs = basicSetTypeswitchcase(newTypeswitchcase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPECASECLAUSE__TYPESWITCHCASE, newTypeswitchcase, newTypeswitchcase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statementlist getStatementlist()
  {
    return statementlist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatementlist(statementlist newStatementlist, NotificationChain msgs)
  {
    statementlist oldStatementlist = statementlist;
    statementlist = newStatementlist;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPECASECLAUSE__STATEMENTLIST, oldStatementlist, newStatementlist);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatementlist(statementlist newStatementlist)
  {
    if (newStatementlist != statementlist)
    {
      NotificationChain msgs = null;
      if (statementlist != null)
        msgs = ((InternalEObject)statementlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPECASECLAUSE__STATEMENTLIST, null, msgs);
      if (newStatementlist != null)
        msgs = ((InternalEObject)newStatementlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPECASECLAUSE__STATEMENTLIST, null, msgs);
      msgs = basicSetStatementlist(newStatementlist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPECASECLAUSE__STATEMENTLIST, newStatementlist, newStatementlist));
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
      case MyDslPackage.TYPECASECLAUSE__TYPESWITCHCASE:
        return basicSetTypeswitchcase(null, msgs);
      case MyDslPackage.TYPECASECLAUSE__STATEMENTLIST:
        return basicSetStatementlist(null, msgs);
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
      case MyDslPackage.TYPECASECLAUSE__TYPESWITCHCASE:
        return getTypeswitchcase();
      case MyDslPackage.TYPECASECLAUSE__STATEMENTLIST:
        return getStatementlist();
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
      case MyDslPackage.TYPECASECLAUSE__TYPESWITCHCASE:
        setTypeswitchcase((typeswitchcase)newValue);
        return;
      case MyDslPackage.TYPECASECLAUSE__STATEMENTLIST:
        setStatementlist((statementlist)newValue);
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
      case MyDslPackage.TYPECASECLAUSE__TYPESWITCHCASE:
        setTypeswitchcase((typeswitchcase)null);
        return;
      case MyDslPackage.TYPECASECLAUSE__STATEMENTLIST:
        setStatementlist((statementlist)null);
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
      case MyDslPackage.TYPECASECLAUSE__TYPESWITCHCASE:
        return typeswitchcase != null;
      case MyDslPackage.TYPECASECLAUSE__STATEMENTLIST:
        return statementlist != null;
    }
    return super.eIsSet(featureID);
  }

} //typecaseclauseImpl
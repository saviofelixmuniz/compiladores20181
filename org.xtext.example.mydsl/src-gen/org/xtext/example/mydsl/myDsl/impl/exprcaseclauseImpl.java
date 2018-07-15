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
import org.xtext.example.mydsl.myDsl.exprcaseclause;
import org.xtext.example.mydsl.myDsl.exprswitchcase;
import org.xtext.example.mydsl.myDsl.statementlist;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>exprcaseclause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.exprcaseclauseImpl#getExprswitchcase <em>Exprswitchcase</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.exprcaseclauseImpl#getStatementlist <em>Statementlist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class exprcaseclauseImpl extends MinimalEObjectImpl.Container implements exprcaseclause
{
  /**
   * The cached value of the '{@link #getExprswitchcase() <em>Exprswitchcase</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprswitchcase()
   * @generated
   * @ordered
   */
  protected exprswitchcase exprswitchcase;

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
  protected exprcaseclauseImpl()
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
    return MyDslPackage.Literals.EXPRCASECLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exprswitchcase getExprswitchcase()
  {
    return exprswitchcase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprswitchcase(exprswitchcase newExprswitchcase, NotificationChain msgs)
  {
    exprswitchcase oldExprswitchcase = exprswitchcase;
    exprswitchcase = newExprswitchcase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRCASECLAUSE__EXPRSWITCHCASE, oldExprswitchcase, newExprswitchcase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprswitchcase(exprswitchcase newExprswitchcase)
  {
    if (newExprswitchcase != exprswitchcase)
    {
      NotificationChain msgs = null;
      if (exprswitchcase != null)
        msgs = ((InternalEObject)exprswitchcase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRCASECLAUSE__EXPRSWITCHCASE, null, msgs);
      if (newExprswitchcase != null)
        msgs = ((InternalEObject)newExprswitchcase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRCASECLAUSE__EXPRSWITCHCASE, null, msgs);
      msgs = basicSetExprswitchcase(newExprswitchcase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRCASECLAUSE__EXPRSWITCHCASE, newExprswitchcase, newExprswitchcase));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRCASECLAUSE__STATEMENTLIST, oldStatementlist, newStatementlist);
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
        msgs = ((InternalEObject)statementlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRCASECLAUSE__STATEMENTLIST, null, msgs);
      if (newStatementlist != null)
        msgs = ((InternalEObject)newStatementlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRCASECLAUSE__STATEMENTLIST, null, msgs);
      msgs = basicSetStatementlist(newStatementlist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRCASECLAUSE__STATEMENTLIST, newStatementlist, newStatementlist));
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
      case MyDslPackage.EXPRCASECLAUSE__EXPRSWITCHCASE:
        return basicSetExprswitchcase(null, msgs);
      case MyDslPackage.EXPRCASECLAUSE__STATEMENTLIST:
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
      case MyDslPackage.EXPRCASECLAUSE__EXPRSWITCHCASE:
        return getExprswitchcase();
      case MyDslPackage.EXPRCASECLAUSE__STATEMENTLIST:
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
      case MyDslPackage.EXPRCASECLAUSE__EXPRSWITCHCASE:
        setExprswitchcase((exprswitchcase)newValue);
        return;
      case MyDslPackage.EXPRCASECLAUSE__STATEMENTLIST:
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
      case MyDslPackage.EXPRCASECLAUSE__EXPRSWITCHCASE:
        setExprswitchcase((exprswitchcase)null);
        return;
      case MyDslPackage.EXPRCASECLAUSE__STATEMENTLIST:
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
      case MyDslPackage.EXPRCASECLAUSE__EXPRSWITCHCASE:
        return exprswitchcase != null;
      case MyDslPackage.EXPRCASECLAUSE__STATEMENTLIST:
        return statementlist != null;
    }
    return super.eIsSet(featureID);
  }

} //exprcaseclauseImpl

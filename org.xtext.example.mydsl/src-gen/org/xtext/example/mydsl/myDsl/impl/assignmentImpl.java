/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl.impl;

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

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.assignment;
import org.xtext.example.mydsl.myDsl.expressionlist;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.assignmentImpl#getExpressionlist <em>Expressionlist</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.assignmentImpl#getASSIGN_OP <em>ASSIGN OP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class assignmentImpl extends MinimalEObjectImpl.Container implements assignment
{
  /**
   * The cached value of the '{@link #getExpressionlist() <em>Expressionlist</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionlist()
   * @generated
   * @ordered
   */
  protected EList<expressionlist> expressionlist;

  /**
   * The default value of the '{@link #getASSIGN_OP() <em>ASSIGN OP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getASSIGN_OP()
   * @generated
   * @ordered
   */
  protected static final String ASSIGN_OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getASSIGN_OP() <em>ASSIGN OP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getASSIGN_OP()
   * @generated
   * @ordered
   */
  protected String assigN_OP = ASSIGN_OP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected assignmentImpl()
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
    return MyDslPackage.Literals.ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<expressionlist> getExpressionlist()
  {
    if (expressionlist == null)
    {
      expressionlist = new EObjectContainmentEList<expressionlist>(expressionlist.class, this, MyDslPackage.ASSIGNMENT__EXPRESSIONLIST);
    }
    return expressionlist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getASSIGN_OP()
  {
    return assigN_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setASSIGN_OP(String newASSIGN_OP)
  {
    String oldASSIGN_OP = assigN_OP;
    assigN_OP = newASSIGN_OP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ASSIGNMENT__ASSIGN_OP, oldASSIGN_OP, assigN_OP));
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
      case MyDslPackage.ASSIGNMENT__EXPRESSIONLIST:
        return ((InternalEList<?>)getExpressionlist()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.ASSIGNMENT__EXPRESSIONLIST:
        return getExpressionlist();
      case MyDslPackage.ASSIGNMENT__ASSIGN_OP:
        return getASSIGN_OP();
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
      case MyDslPackage.ASSIGNMENT__EXPRESSIONLIST:
        getExpressionlist().clear();
        getExpressionlist().addAll((Collection<? extends expressionlist>)newValue);
        return;
      case MyDslPackage.ASSIGNMENT__ASSIGN_OP:
        setASSIGN_OP((String)newValue);
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
      case MyDslPackage.ASSIGNMENT__EXPRESSIONLIST:
        getExpressionlist().clear();
        return;
      case MyDslPackage.ASSIGNMENT__ASSIGN_OP:
        setASSIGN_OP(ASSIGN_OP_EDEFAULT);
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
      case MyDslPackage.ASSIGNMENT__EXPRESSIONLIST:
        return expressionlist != null && !expressionlist.isEmpty();
      case MyDslPackage.ASSIGNMENT__ASSIGN_OP:
        return ASSIGN_OP_EDEFAULT == null ? assigN_OP != null : !ASSIGN_OP_EDEFAULT.equals(assigN_OP);
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
    result.append(" (ASSIGN_OP: ");
    result.append(assigN_OP);
    result.append(')');
    return result.toString();
  }

} //assignmentImpl
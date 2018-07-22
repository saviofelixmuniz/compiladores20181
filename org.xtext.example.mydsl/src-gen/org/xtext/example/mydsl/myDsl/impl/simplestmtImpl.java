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
import org.xtext.example.mydsl.myDsl.assignmentaux;
import org.xtext.example.mydsl.myDsl.expression;
import org.xtext.example.mydsl.myDsl.sendstmtaux;
import org.xtext.example.mydsl.myDsl.shortvardecl;
import org.xtext.example.mydsl.myDsl.simplestmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simplestmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.simplestmtImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.simplestmtImpl#getSendstmt <em>Sendstmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.simplestmtImpl#getIncdecstmt <em>Incdecstmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.simplestmtImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.simplestmtImpl#getShortvardecl <em>Shortvardecl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class simplestmtImpl extends typeswitchstmtImpl implements simplestmt
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected expression expression;

  /**
   * The cached value of the '{@link #getSendstmt() <em>Sendstmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSendstmt()
   * @generated
   * @ordered
   */
  protected sendstmtaux sendstmt;

  /**
   * The default value of the '{@link #getIncdecstmt() <em>Incdecstmt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncdecstmt()
   * @generated
   * @ordered
   */
  protected static final String INCDECSTMT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIncdecstmt() <em>Incdecstmt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncdecstmt()
   * @generated
   * @ordered
   */
  protected String incdecstmt = INCDECSTMT_EDEFAULT;

  /**
   * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignment()
   * @generated
   * @ordered
   */
  protected assignmentaux assignment;

  /**
   * The cached value of the '{@link #getShortvardecl() <em>Shortvardecl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortvardecl()
   * @generated
   * @ordered
   */
  protected shortvardecl shortvardecl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected simplestmtImpl()
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
    return MyDslPackage.Literals.SIMPLESTMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(expression newExpression, NotificationChain msgs)
  {
    expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLESTMT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLESTMT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLESTMT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLESTMT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sendstmtaux getSendstmt()
  {
    return sendstmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSendstmt(sendstmtaux newSendstmt, NotificationChain msgs)
  {
    sendstmtaux oldSendstmt = sendstmt;
    sendstmt = newSendstmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLESTMT__SENDSTMT, oldSendstmt, newSendstmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSendstmt(sendstmtaux newSendstmt)
  {
    if (newSendstmt != sendstmt)
    {
      NotificationChain msgs = null;
      if (sendstmt != null)
        msgs = ((InternalEObject)sendstmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLESTMT__SENDSTMT, null, msgs);
      if (newSendstmt != null)
        msgs = ((InternalEObject)newSendstmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLESTMT__SENDSTMT, null, msgs);
      msgs = basicSetSendstmt(newSendstmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLESTMT__SENDSTMT, newSendstmt, newSendstmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIncdecstmt()
  {
    return incdecstmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncdecstmt(String newIncdecstmt)
  {
    String oldIncdecstmt = incdecstmt;
    incdecstmt = newIncdecstmt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLESTMT__INCDECSTMT, oldIncdecstmt, incdecstmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignmentaux getAssignment()
  {
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignment(assignmentaux newAssignment, NotificationChain msgs)
  {
    assignmentaux oldAssignment = assignment;
    assignment = newAssignment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLESTMT__ASSIGNMENT, oldAssignment, newAssignment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignment(assignmentaux newAssignment)
  {
    if (newAssignment != assignment)
    {
      NotificationChain msgs = null;
      if (assignment != null)
        msgs = ((InternalEObject)assignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLESTMT__ASSIGNMENT, null, msgs);
      if (newAssignment != null)
        msgs = ((InternalEObject)newAssignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLESTMT__ASSIGNMENT, null, msgs);
      msgs = basicSetAssignment(newAssignment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLESTMT__ASSIGNMENT, newAssignment, newAssignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public shortvardecl getShortvardecl()
  {
    return shortvardecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetShortvardecl(shortvardecl newShortvardecl, NotificationChain msgs)
  {
    shortvardecl oldShortvardecl = shortvardecl;
    shortvardecl = newShortvardecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLESTMT__SHORTVARDECL, oldShortvardecl, newShortvardecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShortvardecl(shortvardecl newShortvardecl)
  {
    if (newShortvardecl != shortvardecl)
    {
      NotificationChain msgs = null;
      if (shortvardecl != null)
        msgs = ((InternalEObject)shortvardecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLESTMT__SHORTVARDECL, null, msgs);
      if (newShortvardecl != null)
        msgs = ((InternalEObject)newShortvardecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLESTMT__SHORTVARDECL, null, msgs);
      msgs = basicSetShortvardecl(newShortvardecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLESTMT__SHORTVARDECL, newShortvardecl, newShortvardecl));
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
      case MyDslPackage.SIMPLESTMT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MyDslPackage.SIMPLESTMT__SENDSTMT:
        return basicSetSendstmt(null, msgs);
      case MyDslPackage.SIMPLESTMT__ASSIGNMENT:
        return basicSetAssignment(null, msgs);
      case MyDslPackage.SIMPLESTMT__SHORTVARDECL:
        return basicSetShortvardecl(null, msgs);
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
      case MyDslPackage.SIMPLESTMT__EXPRESSION:
        return getExpression();
      case MyDslPackage.SIMPLESTMT__SENDSTMT:
        return getSendstmt();
      case MyDslPackage.SIMPLESTMT__INCDECSTMT:
        return getIncdecstmt();
      case MyDslPackage.SIMPLESTMT__ASSIGNMENT:
        return getAssignment();
      case MyDslPackage.SIMPLESTMT__SHORTVARDECL:
        return getShortvardecl();
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
      case MyDslPackage.SIMPLESTMT__EXPRESSION:
        setExpression((expression)newValue);
        return;
      case MyDslPackage.SIMPLESTMT__SENDSTMT:
        setSendstmt((sendstmtaux)newValue);
        return;
      case MyDslPackage.SIMPLESTMT__INCDECSTMT:
        setIncdecstmt((String)newValue);
        return;
      case MyDslPackage.SIMPLESTMT__ASSIGNMENT:
        setAssignment((assignmentaux)newValue);
        return;
      case MyDslPackage.SIMPLESTMT__SHORTVARDECL:
        setShortvardecl((shortvardecl)newValue);
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
      case MyDslPackage.SIMPLESTMT__EXPRESSION:
        setExpression((expression)null);
        return;
      case MyDslPackage.SIMPLESTMT__SENDSTMT:
        setSendstmt((sendstmtaux)null);
        return;
      case MyDslPackage.SIMPLESTMT__INCDECSTMT:
        setIncdecstmt(INCDECSTMT_EDEFAULT);
        return;
      case MyDslPackage.SIMPLESTMT__ASSIGNMENT:
        setAssignment((assignmentaux)null);
        return;
      case MyDslPackage.SIMPLESTMT__SHORTVARDECL:
        setShortvardecl((shortvardecl)null);
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
      case MyDslPackage.SIMPLESTMT__EXPRESSION:
        return expression != null;
      case MyDslPackage.SIMPLESTMT__SENDSTMT:
        return sendstmt != null;
      case MyDslPackage.SIMPLESTMT__INCDECSTMT:
        return INCDECSTMT_EDEFAULT == null ? incdecstmt != null : !INCDECSTMT_EDEFAULT.equals(incdecstmt);
      case MyDslPackage.SIMPLESTMT__ASSIGNMENT:
        return assignment != null;
      case MyDslPackage.SIMPLESTMT__SHORTVARDECL:
        return shortvardecl != null;
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
    result.append(" (incdecstmt: ");
    result.append(incdecstmt);
    result.append(')');
    return result.toString();
  }

} //simplestmtImpl

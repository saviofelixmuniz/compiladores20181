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
import org.xtext.example.mydsl.myDsl.expression;
import org.xtext.example.mydsl.myDsl.key;
import org.xtext.example.mydsl.myDsl.literalvalue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.keyImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.keyImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.keyImpl#getLiteralvalue <em>Literalvalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class keyImpl extends keyedelementImpl implements key
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
   * The cached value of the '{@link #getLiteralvalue() <em>Literalvalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteralvalue()
   * @generated
   * @ordered
   */
  protected literalvalue literalvalue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected keyImpl()
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
    return MyDslPackage.Literals.KEY;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.KEY__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.KEY__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.KEY__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.KEY__EXPRESSION, newExpression, newExpression));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.KEY__IDENTIFIER, oldIDENTIFIER, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public literalvalue getLiteralvalue()
  {
    return literalvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLiteralvalue(literalvalue newLiteralvalue, NotificationChain msgs)
  {
    literalvalue oldLiteralvalue = literalvalue;
    literalvalue = newLiteralvalue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.KEY__LITERALVALUE, oldLiteralvalue, newLiteralvalue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteralvalue(literalvalue newLiteralvalue)
  {
    if (newLiteralvalue != literalvalue)
    {
      NotificationChain msgs = null;
      if (literalvalue != null)
        msgs = ((InternalEObject)literalvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.KEY__LITERALVALUE, null, msgs);
      if (newLiteralvalue != null)
        msgs = ((InternalEObject)newLiteralvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.KEY__LITERALVALUE, null, msgs);
      msgs = basicSetLiteralvalue(newLiteralvalue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.KEY__LITERALVALUE, newLiteralvalue, newLiteralvalue));
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
      case MyDslPackage.KEY__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MyDslPackage.KEY__LITERALVALUE:
        return basicSetLiteralvalue(null, msgs);
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
      case MyDslPackage.KEY__EXPRESSION:
        return getExpression();
      case MyDslPackage.KEY__IDENTIFIER:
        return getIDENTIFIER();
      case MyDslPackage.KEY__LITERALVALUE:
        return getLiteralvalue();
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
      case MyDslPackage.KEY__EXPRESSION:
        setExpression((expression)newValue);
        return;
      case MyDslPackage.KEY__IDENTIFIER:
        setIDENTIFIER((String)newValue);
        return;
      case MyDslPackage.KEY__LITERALVALUE:
        setLiteralvalue((literalvalue)newValue);
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
      case MyDslPackage.KEY__EXPRESSION:
        setExpression((expression)null);
        return;
      case MyDslPackage.KEY__IDENTIFIER:
        setIDENTIFIER(IDENTIFIER_EDEFAULT);
        return;
      case MyDslPackage.KEY__LITERALVALUE:
        setLiteralvalue((literalvalue)null);
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
      case MyDslPackage.KEY__EXPRESSION:
        return expression != null;
      case MyDslPackage.KEY__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case MyDslPackage.KEY__LITERALVALUE:
        return literalvalue != null;
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

} //keyImpl

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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.assignment;
import org.xtext.example.mydsl.myDsl.block;
import org.xtext.example.mydsl.myDsl.condition;
import org.xtext.example.mydsl.myDsl.deferstmt;
import org.xtext.example.mydsl.myDsl.element;
import org.xtext.example.mydsl.myDsl.expression;
import org.xtext.example.mydsl.myDsl.expressionlist;
import org.xtext.example.mydsl.myDsl.forstmt;
import org.xtext.example.mydsl.myDsl.gotstmt;
import org.xtext.example.mydsl.myDsl.initstmt;
import org.xtext.example.mydsl.myDsl.poststmt;
import org.xtext.example.mydsl.myDsl.recvexpr;
import org.xtext.example.mydsl.myDsl.sendstmt;
import org.xtext.example.mydsl.myDsl.shortvardecl;
import org.xtext.example.mydsl.myDsl.simplestmt;
import org.xtext.example.mydsl.myDsl.typecaseclause;
import org.xtext.example.mydsl.myDsl.typeswitchguard;
import org.xtext.example.mydsl.myDsl.typeswitchstmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getTypeswitchguard <em>Typeswitchguard</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getTypecaseclause <em>Typecaseclause</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getShortvardecl <em>Shortvardecl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getSendstmt <em>Sendstmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getIncdecstmt <em>Incdecstmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class expressionImpl extends primaryexprauxImpl implements expression
{
  /**
   * The cached value of the '{@link #getTypeswitchguard() <em>Typeswitchguard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeswitchguard()
   * @generated
   * @ordered
   */
  protected typeswitchguard typeswitchguard;

  /**
   * The cached value of the '{@link #getTypecaseclause() <em>Typecaseclause</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypecaseclause()
   * @generated
   * @ordered
   */
  protected EList<typecaseclause> typecaseclause;

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
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected block block;

  /**
   * The cached value of the '{@link #getSendstmt() <em>Sendstmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSendstmt()
   * @generated
   * @ordered
   */
  protected sendstmt sendstmt;

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
  protected assignment assignment;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected EList<expression> expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected expressionImpl()
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
    return MyDslPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeswitchguard getTypeswitchguard()
  {
    return typeswitchguard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeswitchguard(typeswitchguard newTypeswitchguard, NotificationChain msgs)
  {
    typeswitchguard oldTypeswitchguard = typeswitchguard;
    typeswitchguard = newTypeswitchguard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__TYPESWITCHGUARD, oldTypeswitchguard, newTypeswitchguard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeswitchguard(typeswitchguard newTypeswitchguard)
  {
    if (newTypeswitchguard != typeswitchguard)
    {
      NotificationChain msgs = null;
      if (typeswitchguard != null)
        msgs = ((InternalEObject)typeswitchguard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__TYPESWITCHGUARD, null, msgs);
      if (newTypeswitchguard != null)
        msgs = ((InternalEObject)newTypeswitchguard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__TYPESWITCHGUARD, null, msgs);
      msgs = basicSetTypeswitchguard(newTypeswitchguard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__TYPESWITCHGUARD, newTypeswitchguard, newTypeswitchguard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<typecaseclause> getTypecaseclause()
  {
    if (typecaseclause == null)
    {
      typecaseclause = new EObjectContainmentEList<typecaseclause>(typecaseclause.class, this, MyDslPackage.EXPRESSION__TYPECASECLAUSE);
    }
    return typecaseclause;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__SHORTVARDECL, oldShortvardecl, newShortvardecl);
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
        msgs = ((InternalEObject)shortvardecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__SHORTVARDECL, null, msgs);
      if (newShortvardecl != null)
        msgs = ((InternalEObject)newShortvardecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__SHORTVARDECL, null, msgs);
      msgs = basicSetShortvardecl(newShortvardecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__SHORTVARDECL, newShortvardecl, newShortvardecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(block newBlock, NotificationChain msgs)
  {
    block oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(block newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__BLOCK, newBlock, newBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sendstmt getSendstmt()
  {
    return sendstmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSendstmt(sendstmt newSendstmt, NotificationChain msgs)
  {
    sendstmt oldSendstmt = sendstmt;
    sendstmt = newSendstmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__SENDSTMT, oldSendstmt, newSendstmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSendstmt(sendstmt newSendstmt)
  {
    if (newSendstmt != sendstmt)
    {
      NotificationChain msgs = null;
      if (sendstmt != null)
        msgs = ((InternalEObject)sendstmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__SENDSTMT, null, msgs);
      if (newSendstmt != null)
        msgs = ((InternalEObject)newSendstmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__SENDSTMT, null, msgs);
      msgs = basicSetSendstmt(newSendstmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__SENDSTMT, newSendstmt, newSendstmt));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__INCDECSTMT, oldIncdecstmt, incdecstmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignment getAssignment()
  {
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignment(assignment newAssignment, NotificationChain msgs)
  {
    assignment oldAssignment = assignment;
    assignment = newAssignment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__ASSIGNMENT, oldAssignment, newAssignment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignment(assignment newAssignment)
  {
    if (newAssignment != assignment)
    {
      NotificationChain msgs = null;
      if (assignment != null)
        msgs = ((InternalEObject)assignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__ASSIGNMENT, null, msgs);
      if (newAssignment != null)
        msgs = ((InternalEObject)newAssignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__ASSIGNMENT, null, msgs);
      msgs = basicSetAssignment(newAssignment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__ASSIGNMENT, newAssignment, newAssignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<expression> getExpression()
  {
    if (expression == null)
    {
      expression = new EObjectContainmentEList<expression>(expression.class, this, MyDslPackage.EXPRESSION__EXPRESSION);
    }
    return expression;
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
      case MyDslPackage.EXPRESSION__TYPESWITCHGUARD:
        return basicSetTypeswitchguard(null, msgs);
      case MyDslPackage.EXPRESSION__TYPECASECLAUSE:
        return ((InternalEList<?>)getTypecaseclause()).basicRemove(otherEnd, msgs);
      case MyDslPackage.EXPRESSION__SHORTVARDECL:
        return basicSetShortvardecl(null, msgs);
      case MyDslPackage.EXPRESSION__BLOCK:
        return basicSetBlock(null, msgs);
      case MyDslPackage.EXPRESSION__SENDSTMT:
        return basicSetSendstmt(null, msgs);
      case MyDslPackage.EXPRESSION__ASSIGNMENT:
        return basicSetAssignment(null, msgs);
      case MyDslPackage.EXPRESSION__EXPRESSION:
        return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.EXPRESSION__TYPESWITCHGUARD:
        return getTypeswitchguard();
      case MyDslPackage.EXPRESSION__TYPECASECLAUSE:
        return getTypecaseclause();
      case MyDslPackage.EXPRESSION__SHORTVARDECL:
        return getShortvardecl();
      case MyDslPackage.EXPRESSION__BLOCK:
        return getBlock();
      case MyDslPackage.EXPRESSION__SENDSTMT:
        return getSendstmt();
      case MyDslPackage.EXPRESSION__INCDECSTMT:
        return getIncdecstmt();
      case MyDslPackage.EXPRESSION__ASSIGNMENT:
        return getAssignment();
      case MyDslPackage.EXPRESSION__EXPRESSION:
        return getExpression();
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
      case MyDslPackage.EXPRESSION__TYPESWITCHGUARD:
        setTypeswitchguard((typeswitchguard)newValue);
        return;
      case MyDslPackage.EXPRESSION__TYPECASECLAUSE:
        getTypecaseclause().clear();
        getTypecaseclause().addAll((Collection<? extends typecaseclause>)newValue);
        return;
      case MyDslPackage.EXPRESSION__SHORTVARDECL:
        setShortvardecl((shortvardecl)newValue);
        return;
      case MyDslPackage.EXPRESSION__BLOCK:
        setBlock((block)newValue);
        return;
      case MyDslPackage.EXPRESSION__SENDSTMT:
        setSendstmt((sendstmt)newValue);
        return;
      case MyDslPackage.EXPRESSION__INCDECSTMT:
        setIncdecstmt((String)newValue);
        return;
      case MyDslPackage.EXPRESSION__ASSIGNMENT:
        setAssignment((assignment)newValue);
        return;
      case MyDslPackage.EXPRESSION__EXPRESSION:
        getExpression().clear();
        getExpression().addAll((Collection<? extends expression>)newValue);
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
      case MyDslPackage.EXPRESSION__TYPESWITCHGUARD:
        setTypeswitchguard((typeswitchguard)null);
        return;
      case MyDslPackage.EXPRESSION__TYPECASECLAUSE:
        getTypecaseclause().clear();
        return;
      case MyDslPackage.EXPRESSION__SHORTVARDECL:
        setShortvardecl((shortvardecl)null);
        return;
      case MyDslPackage.EXPRESSION__BLOCK:
        setBlock((block)null);
        return;
      case MyDslPackage.EXPRESSION__SENDSTMT:
        setSendstmt((sendstmt)null);
        return;
      case MyDslPackage.EXPRESSION__INCDECSTMT:
        setIncdecstmt(INCDECSTMT_EDEFAULT);
        return;
      case MyDslPackage.EXPRESSION__ASSIGNMENT:
        setAssignment((assignment)null);
        return;
      case MyDslPackage.EXPRESSION__EXPRESSION:
        getExpression().clear();
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
      case MyDslPackage.EXPRESSION__TYPESWITCHGUARD:
        return typeswitchguard != null;
      case MyDslPackage.EXPRESSION__TYPECASECLAUSE:
        return typecaseclause != null && !typecaseclause.isEmpty();
      case MyDslPackage.EXPRESSION__SHORTVARDECL:
        return shortvardecl != null;
      case MyDslPackage.EXPRESSION__BLOCK:
        return block != null;
      case MyDslPackage.EXPRESSION__SENDSTMT:
        return sendstmt != null;
      case MyDslPackage.EXPRESSION__INCDECSTMT:
        return INCDECSTMT_EDEFAULT == null ? incdecstmt != null : !INCDECSTMT_EDEFAULT.equals(incdecstmt);
      case MyDslPackage.EXPRESSION__ASSIGNMENT:
        return assignment != null;
      case MyDslPackage.EXPRESSION__EXPRESSION:
        return expression != null && !expression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == element.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == initstmt.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == poststmt.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == typeswitchstmt.class)
    {
      switch (derivedFeatureID)
      {
        case MyDslPackage.EXPRESSION__TYPESWITCHGUARD: return MyDslPackage.TYPESWITCHSTMT__TYPESWITCHGUARD;
        case MyDslPackage.EXPRESSION__TYPECASECLAUSE: return MyDslPackage.TYPESWITCHSTMT__TYPECASECLAUSE;
        default: return -1;
      }
    }
    if (baseClass == simplestmt.class)
    {
      switch (derivedFeatureID)
      {
        case MyDslPackage.EXPRESSION__SHORTVARDECL: return MyDslPackage.SIMPLESTMT__SHORTVARDECL;
        default: return -1;
      }
    }
    if (baseClass == deferstmt.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == expressionlist.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == recvexpr.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == gotstmt.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == forstmt.class)
    {
      switch (derivedFeatureID)
      {
        case MyDslPackage.EXPRESSION__BLOCK: return MyDslPackage.FORSTMT__BLOCK;
        default: return -1;
      }
    }
    if (baseClass == condition.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == element.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == initstmt.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == poststmt.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == typeswitchstmt.class)
    {
      switch (baseFeatureID)
      {
        case MyDslPackage.TYPESWITCHSTMT__TYPESWITCHGUARD: return MyDslPackage.EXPRESSION__TYPESWITCHGUARD;
        case MyDslPackage.TYPESWITCHSTMT__TYPECASECLAUSE: return MyDslPackage.EXPRESSION__TYPECASECLAUSE;
        default: return -1;
      }
    }
    if (baseClass == simplestmt.class)
    {
      switch (baseFeatureID)
      {
        case MyDslPackage.SIMPLESTMT__SHORTVARDECL: return MyDslPackage.EXPRESSION__SHORTVARDECL;
        default: return -1;
      }
    }
    if (baseClass == deferstmt.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == expressionlist.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == recvexpr.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == gotstmt.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == forstmt.class)
    {
      switch (baseFeatureID)
      {
        case MyDslPackage.FORSTMT__BLOCK: return MyDslPackage.EXPRESSION__BLOCK;
        default: return -1;
      }
    }
    if (baseClass == condition.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //expressionImpl

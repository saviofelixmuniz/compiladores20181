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
import org.xtext.example.mydsl.myDsl.block;
import org.xtext.example.mydsl.myDsl.channel;
import org.xtext.example.mydsl.myDsl.condition;
import org.xtext.example.mydsl.myDsl.deferstmt;
import org.xtext.example.mydsl.myDsl.element;
import org.xtext.example.mydsl.myDsl.expression;
import org.xtext.example.mydsl.myDsl.expressionlist;
import org.xtext.example.mydsl.myDsl.expressionstmt;
import org.xtext.example.mydsl.myDsl.forstmt;
import org.xtext.example.mydsl.myDsl.gotstmt;
import org.xtext.example.mydsl.myDsl.incdecstmt;
import org.xtext.example.mydsl.myDsl.recvexpr;
import org.xtext.example.mydsl.myDsl.recvstmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getIdentifierlist <em>Identifierlist</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getRecvexpr <em>Recvexpr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class expressionImpl extends indexImpl implements expression
{
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
   * The default value of the '{@link #getIdentifierlist() <em>Identifierlist</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifierlist()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIERLIST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifierlist() <em>Identifierlist</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifierlist()
   * @generated
   * @ordered
   */
  protected String identifierlist = IDENTIFIERLIST_EDEFAULT;

  /**
   * The cached value of the '{@link #getRecvexpr() <em>Recvexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecvexpr()
   * @generated
   * @ordered
   */
  protected recvexpr recvexpr;

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
  public String getIdentifierlist()
  {
    return identifierlist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifierlist(String newIdentifierlist)
  {
    String oldIdentifierlist = identifierlist;
    identifierlist = newIdentifierlist;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__IDENTIFIERLIST, oldIdentifierlist, identifierlist));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public recvexpr getRecvexpr()
  {
    return recvexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecvexpr(recvexpr newRecvexpr, NotificationChain msgs)
  {
    recvexpr oldRecvexpr = recvexpr;
    recvexpr = newRecvexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__RECVEXPR, oldRecvexpr, newRecvexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecvexpr(recvexpr newRecvexpr)
  {
    if (newRecvexpr != recvexpr)
    {
      NotificationChain msgs = null;
      if (recvexpr != null)
        msgs = ((InternalEObject)recvexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__RECVEXPR, null, msgs);
      if (newRecvexpr != null)
        msgs = ((InternalEObject)newRecvexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__RECVEXPR, null, msgs);
      msgs = basicSetRecvexpr(newRecvexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__RECVEXPR, newRecvexpr, newRecvexpr));
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
      case MyDslPackage.EXPRESSION__BLOCK:
        return basicSetBlock(null, msgs);
      case MyDslPackage.EXPRESSION__RECVEXPR:
        return basicSetRecvexpr(null, msgs);
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
      case MyDslPackage.EXPRESSION__BLOCK:
        return getBlock();
      case MyDslPackage.EXPRESSION__IDENTIFIERLIST:
        return getIdentifierlist();
      case MyDslPackage.EXPRESSION__RECVEXPR:
        return getRecvexpr();
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
      case MyDslPackage.EXPRESSION__BLOCK:
        setBlock((block)newValue);
        return;
      case MyDslPackage.EXPRESSION__IDENTIFIERLIST:
        setIdentifierlist((String)newValue);
        return;
      case MyDslPackage.EXPRESSION__RECVEXPR:
        setRecvexpr((recvexpr)newValue);
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
      case MyDslPackage.EXPRESSION__BLOCK:
        setBlock((block)null);
        return;
      case MyDslPackage.EXPRESSION__IDENTIFIERLIST:
        setIdentifierlist(IDENTIFIERLIST_EDEFAULT);
        return;
      case MyDslPackage.EXPRESSION__RECVEXPR:
        setRecvexpr((recvexpr)null);
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
      case MyDslPackage.EXPRESSION__BLOCK:
        return block != null;
      case MyDslPackage.EXPRESSION__IDENTIFIERLIST:
        return IDENTIFIERLIST_EDEFAULT == null ? identifierlist != null : !IDENTIFIERLIST_EDEFAULT.equals(identifierlist);
      case MyDslPackage.EXPRESSION__RECVEXPR:
        return recvexpr != null;
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
    if (baseClass == deferstmt.class)
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
    if (baseClass == incdecstmt.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == channel.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == expressionstmt.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == recvstmt.class)
    {
      switch (derivedFeatureID)
      {
        case MyDslPackage.EXPRESSION__IDENTIFIERLIST: return MyDslPackage.RECVSTMT__IDENTIFIERLIST;
        case MyDslPackage.EXPRESSION__RECVEXPR: return MyDslPackage.RECVSTMT__RECVEXPR;
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
    if (baseClass == deferstmt.class)
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
    if (baseClass == incdecstmt.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == channel.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == expressionstmt.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == recvstmt.class)
    {
      switch (baseFeatureID)
      {
        case MyDslPackage.RECVSTMT__IDENTIFIERLIST: return MyDslPackage.EXPRESSION__IDENTIFIERLIST;
        case MyDslPackage.RECVSTMT__RECVEXPR: return MyDslPackage.EXPRESSION__RECVEXPR;
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
    result.append(" (identifierlist: ");
    result.append(identifierlist);
    result.append(')');
    return result.toString();
  }

} //expressionImpl

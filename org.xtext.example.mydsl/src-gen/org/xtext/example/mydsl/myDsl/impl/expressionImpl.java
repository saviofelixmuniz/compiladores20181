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
import org.xtext.example.mydsl.myDsl.conversion;
import org.xtext.example.mydsl.myDsl.element;
import org.xtext.example.mydsl.myDsl.elementlist;
import org.xtext.example.mydsl.myDsl.expression;
import org.xtext.example.mydsl.myDsl.expressionaux;
import org.xtext.example.mydsl.myDsl.expressionlist;
import org.xtext.example.mydsl.myDsl.index;
import org.xtext.example.mydsl.myDsl.key;
import org.xtext.example.mydsl.myDsl.keyedelement;
import org.xtext.example.mydsl.myDsl.operand;
import org.xtext.example.mydsl.myDsl.primaryexpr;
import org.xtext.example.mydsl.myDsl.primaryexpraux;
import org.xtext.example.mydsl.myDsl.slice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getPrimaryexpraux <em>Primaryexpraux</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getKeyedelement <em>Keyedelement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.expressionImpl#getExpressionaux <em>Expressionaux</em>}</li>
 * </ul>
 *
 * @generated
 */
public class expressionImpl extends expressionauxImpl implements expression
{
  /**
   * The cached value of the '{@link #getPrimaryexpraux() <em>Primaryexpraux</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryexpraux()
   * @generated
   * @ordered
   */
  protected primaryexpraux primaryexpraux;

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
   * The cached value of the '{@link #getKeyedelement() <em>Keyedelement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyedelement()
   * @generated
   * @ordered
   */
  protected EList<keyedelement> keyedelement;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected element element;

  /**
   * The cached value of the '{@link #getExpressionaux() <em>Expressionaux</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionaux()
   * @generated
   * @ordered
   */
  protected EList<expressionaux> expressionaux;

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
  public primaryexpraux getPrimaryexpraux()
  {
    return primaryexpraux;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryexpraux(primaryexpraux newPrimaryexpraux, NotificationChain msgs)
  {
    primaryexpraux oldPrimaryexpraux = primaryexpraux;
    primaryexpraux = newPrimaryexpraux;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__PRIMARYEXPRAUX, oldPrimaryexpraux, newPrimaryexpraux);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryexpraux(primaryexpraux newPrimaryexpraux)
  {
    if (newPrimaryexpraux != primaryexpraux)
    {
      NotificationChain msgs = null;
      if (primaryexpraux != null)
        msgs = ((InternalEObject)primaryexpraux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__PRIMARYEXPRAUX, null, msgs);
      if (newPrimaryexpraux != null)
        msgs = ((InternalEObject)newPrimaryexpraux).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__PRIMARYEXPRAUX, null, msgs);
      msgs = basicSetPrimaryexpraux(newPrimaryexpraux, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__PRIMARYEXPRAUX, newPrimaryexpraux, newPrimaryexpraux));
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
  public EList<keyedelement> getKeyedelement()
  {
    if (keyedelement == null)
    {
      keyedelement = new EObjectContainmentEList<keyedelement>(keyedelement.class, this, MyDslPackage.EXPRESSION__KEYEDELEMENT);
    }
    return keyedelement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public element getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElement(element newElement, NotificationChain msgs)
  {
    element oldElement = element;
    element = newElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__ELEMENT, oldElement, newElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(element newElement)
  {
    if (newElement != element)
    {
      NotificationChain msgs = null;
      if (element != null)
        msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__ELEMENT, null, msgs);
      if (newElement != null)
        msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION__ELEMENT, null, msgs);
      msgs = basicSetElement(newElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION__ELEMENT, newElement, newElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<expressionaux> getExpressionaux()
  {
    if (expressionaux == null)
    {
      expressionaux = new EObjectContainmentEList<expressionaux>(expressionaux.class, this, MyDslPackage.EXPRESSION__EXPRESSIONAUX);
    }
    return expressionaux;
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
      case MyDslPackage.EXPRESSION__PRIMARYEXPRAUX:
        return basicSetPrimaryexpraux(null, msgs);
      case MyDslPackage.EXPRESSION__EXPRESSION:
        return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
      case MyDslPackage.EXPRESSION__KEYEDELEMENT:
        return ((InternalEList<?>)getKeyedelement()).basicRemove(otherEnd, msgs);
      case MyDslPackage.EXPRESSION__ELEMENT:
        return basicSetElement(null, msgs);
      case MyDslPackage.EXPRESSION__EXPRESSIONAUX:
        return ((InternalEList<?>)getExpressionaux()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.EXPRESSION__PRIMARYEXPRAUX:
        return getPrimaryexpraux();
      case MyDslPackage.EXPRESSION__EXPRESSION:
        return getExpression();
      case MyDslPackage.EXPRESSION__KEYEDELEMENT:
        return getKeyedelement();
      case MyDslPackage.EXPRESSION__ELEMENT:
        return getElement();
      case MyDslPackage.EXPRESSION__EXPRESSIONAUX:
        return getExpressionaux();
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
      case MyDslPackage.EXPRESSION__PRIMARYEXPRAUX:
        setPrimaryexpraux((primaryexpraux)newValue);
        return;
      case MyDslPackage.EXPRESSION__EXPRESSION:
        getExpression().clear();
        getExpression().addAll((Collection<? extends expression>)newValue);
        return;
      case MyDslPackage.EXPRESSION__KEYEDELEMENT:
        getKeyedelement().clear();
        getKeyedelement().addAll((Collection<? extends keyedelement>)newValue);
        return;
      case MyDslPackage.EXPRESSION__ELEMENT:
        setElement((element)newValue);
        return;
      case MyDslPackage.EXPRESSION__EXPRESSIONAUX:
        getExpressionaux().clear();
        getExpressionaux().addAll((Collection<? extends expressionaux>)newValue);
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
      case MyDslPackage.EXPRESSION__PRIMARYEXPRAUX:
        setPrimaryexpraux((primaryexpraux)null);
        return;
      case MyDslPackage.EXPRESSION__EXPRESSION:
        getExpression().clear();
        return;
      case MyDslPackage.EXPRESSION__KEYEDELEMENT:
        getKeyedelement().clear();
        return;
      case MyDslPackage.EXPRESSION__ELEMENT:
        setElement((element)null);
        return;
      case MyDslPackage.EXPRESSION__EXPRESSIONAUX:
        getExpressionaux().clear();
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
      case MyDslPackage.EXPRESSION__PRIMARYEXPRAUX:
        return primaryexpraux != null;
      case MyDslPackage.EXPRESSION__EXPRESSION:
        return expression != null && !expression.isEmpty();
      case MyDslPackage.EXPRESSION__KEYEDELEMENT:
        return keyedelement != null && !keyedelement.isEmpty();
      case MyDslPackage.EXPRESSION__ELEMENT:
        return element != null;
      case MyDslPackage.EXPRESSION__EXPRESSIONAUX:
        return expressionaux != null && !expressionaux.isEmpty();
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
    if (baseClass == primaryexpr.class)
    {
      switch (derivedFeatureID)
      {
        case MyDslPackage.EXPRESSION__PRIMARYEXPRAUX: return MyDslPackage.PRIMARYEXPR__PRIMARYEXPRAUX;
        default: return -1;
      }
    }
    if (baseClass == primaryexpraux.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == index.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == slice.class)
    {
      switch (derivedFeatureID)
      {
        case MyDslPackage.EXPRESSION__EXPRESSION: return MyDslPackage.SLICE__EXPRESSION;
        default: return -1;
      }
    }
    if (baseClass == conversion.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == operand.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == elementlist.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == keyedelement.class)
    {
      switch (derivedFeatureID)
      {
        case MyDslPackage.EXPRESSION__KEYEDELEMENT: return MyDslPackage.KEYEDELEMENT__KEYEDELEMENT;
        case MyDslPackage.EXPRESSION__ELEMENT: return MyDslPackage.KEYEDELEMENT__ELEMENT;
        default: return -1;
      }
    }
    if (baseClass == key.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == element.class)
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
    if (baseClass == primaryexpr.class)
    {
      switch (baseFeatureID)
      {
        case MyDslPackage.PRIMARYEXPR__PRIMARYEXPRAUX: return MyDslPackage.EXPRESSION__PRIMARYEXPRAUX;
        default: return -1;
      }
    }
    if (baseClass == primaryexpraux.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == index.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == slice.class)
    {
      switch (baseFeatureID)
      {
        case MyDslPackage.SLICE__EXPRESSION: return MyDslPackage.EXPRESSION__EXPRESSION;
        default: return -1;
      }
    }
    if (baseClass == conversion.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == operand.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == elementlist.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == keyedelement.class)
    {
      switch (baseFeatureID)
      {
        case MyDslPackage.KEYEDELEMENT__KEYEDELEMENT: return MyDslPackage.EXPRESSION__KEYEDELEMENT;
        case MyDslPackage.KEYEDELEMENT__ELEMENT: return MyDslPackage.EXPRESSION__ELEMENT;
        default: return -1;
      }
    }
    if (baseClass == key.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == element.class)
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
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //expressionImpl
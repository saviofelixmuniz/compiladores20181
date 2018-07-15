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
import org.xtext.example.mydsl.myDsl.basetype;
import org.xtext.example.mydsl.myDsl.channeltype;
import org.xtext.example.mydsl.myDsl.elementtype;
import org.xtext.example.mydsl.myDsl.keytype;
import org.xtext.example.mydsl.myDsl.maptype;
import org.xtext.example.mydsl.myDsl.pointertype;
import org.xtext.example.mydsl.myDsl.result;
import org.xtext.example.mydsl.myDsl.slicetype;
import org.xtext.example.mydsl.myDsl.slicetypeaux;
import org.xtext.example.mydsl.myDsl.type;
import org.xtext.example.mydsl.myDsl.typelit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.typeImpl#getElementtype <em>Elementtype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.typeImpl#getTypename <em>Typename</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.typeImpl#getTypelit <em>Typelit</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.typeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class typeImpl extends typeassertionImpl implements type
{
  /**
   * The cached value of the '{@link #getElementtype() <em>Elementtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementtype()
   * @generated
   * @ordered
   */
  protected elementtype elementtype;

  /**
   * The default value of the '{@link #getTypename() <em>Typename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypename()
   * @generated
   * @ordered
   */
  protected static final String TYPENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypename() <em>Typename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypename()
   * @generated
   * @ordered
   */
  protected String typename = TYPENAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypelit() <em>Typelit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypelit()
   * @generated
   * @ordered
   */
  protected typelit typelit;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected type type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected typeImpl()
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
    return MyDslPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public elementtype getElementtype()
  {
    return elementtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElementtype(elementtype newElementtype, NotificationChain msgs)
  {
    elementtype oldElementtype = elementtype;
    elementtype = newElementtype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE__ELEMENTTYPE, oldElementtype, newElementtype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementtype(elementtype newElementtype)
  {
    if (newElementtype != elementtype)
    {
      NotificationChain msgs = null;
      if (elementtype != null)
        msgs = ((InternalEObject)elementtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE__ELEMENTTYPE, null, msgs);
      if (newElementtype != null)
        msgs = ((InternalEObject)newElementtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE__ELEMENTTYPE, null, msgs);
      msgs = basicSetElementtype(newElementtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE__ELEMENTTYPE, newElementtype, newElementtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTypename()
  {
    return typename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypename(String newTypename)
  {
    String oldTypename = typename;
    typename = newTypename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE__TYPENAME, oldTypename, typename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typelit getTypelit()
  {
    return typelit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypelit(typelit newTypelit, NotificationChain msgs)
  {
    typelit oldTypelit = typelit;
    typelit = newTypelit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE__TYPELIT, oldTypelit, newTypelit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypelit(typelit newTypelit)
  {
    if (newTypelit != typelit)
    {
      NotificationChain msgs = null;
      if (typelit != null)
        msgs = ((InternalEObject)typelit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE__TYPELIT, null, msgs);
      if (newTypelit != null)
        msgs = ((InternalEObject)newTypelit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE__TYPELIT, null, msgs);
      msgs = basicSetTypelit(newTypelit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE__TYPELIT, newTypelit, newTypelit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(type newType, NotificationChain msgs)
  {
    type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE__TYPE, newType, newType));
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
      case MyDslPackage.TYPE__ELEMENTTYPE:
        return basicSetElementtype(null, msgs);
      case MyDslPackage.TYPE__TYPELIT:
        return basicSetTypelit(null, msgs);
      case MyDslPackage.TYPE__TYPE:
        return basicSetType(null, msgs);
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
      case MyDslPackage.TYPE__ELEMENTTYPE:
        return getElementtype();
      case MyDslPackage.TYPE__TYPENAME:
        return getTypename();
      case MyDslPackage.TYPE__TYPELIT:
        return getTypelit();
      case MyDslPackage.TYPE__TYPE:
        return getType();
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
      case MyDslPackage.TYPE__ELEMENTTYPE:
        setElementtype((elementtype)newValue);
        return;
      case MyDslPackage.TYPE__TYPENAME:
        setTypename((String)newValue);
        return;
      case MyDslPackage.TYPE__TYPELIT:
        setTypelit((typelit)newValue);
        return;
      case MyDslPackage.TYPE__TYPE:
        setType((type)newValue);
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
      case MyDslPackage.TYPE__ELEMENTTYPE:
        setElementtype((elementtype)null);
        return;
      case MyDslPackage.TYPE__TYPENAME:
        setTypename(TYPENAME_EDEFAULT);
        return;
      case MyDslPackage.TYPE__TYPELIT:
        setTypelit((typelit)null);
        return;
      case MyDslPackage.TYPE__TYPE:
        setType((type)null);
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
      case MyDslPackage.TYPE__ELEMENTTYPE:
        return elementtype != null;
      case MyDslPackage.TYPE__TYPENAME:
        return TYPENAME_EDEFAULT == null ? typename != null : !TYPENAME_EDEFAULT.equals(typename);
      case MyDslPackage.TYPE__TYPELIT:
        return typelit != null;
      case MyDslPackage.TYPE__TYPE:
        return type != null;
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
    if (baseClass == pointertype.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == basetype.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == maptype.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == keytype.class)
    {
      switch (derivedFeatureID)
      {
        case MyDslPackage.TYPE__ELEMENTTYPE: return MyDslPackage.KEYTYPE__ELEMENTTYPE;
        default: return -1;
      }
    }
    if (baseClass == slicetype.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == slicetypeaux.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == channeltype.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == elementtype.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == result.class)
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
    if (baseClass == pointertype.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == basetype.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == maptype.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == keytype.class)
    {
      switch (baseFeatureID)
      {
        case MyDslPackage.KEYTYPE__ELEMENTTYPE: return MyDslPackage.TYPE__ELEMENTTYPE;
        default: return -1;
      }
    }
    if (baseClass == slicetype.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == slicetypeaux.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == channeltype.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == elementtype.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == result.class)
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
    result.append(" (typename: ");
    result.append(typename);
    result.append(')');
    return result.toString();
  }

} //typeImpl

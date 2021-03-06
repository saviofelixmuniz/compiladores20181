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
import org.xtext.example.mydsl.myDsl.fielddecl;
import org.xtext.example.mydsl.myDsl.type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>fielddecl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.fielddeclImpl#getIdentifierlist <em>Identifierlist</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.fielddeclImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.fielddeclImpl#getEmbeddedfield <em>Embeddedfield</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.fielddeclImpl#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class fielddeclImpl extends MinimalEObjectImpl.Container implements fielddecl
{
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
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected type type;

  /**
   * The default value of the '{@link #getEmbeddedfield() <em>Embeddedfield</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmbeddedfield()
   * @generated
   * @ordered
   */
  protected static final String EMBEDDEDFIELD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEmbeddedfield() <em>Embeddedfield</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmbeddedfield()
   * @generated
   * @ordered
   */
  protected String embeddedfield = EMBEDDEDFIELD_EDEFAULT;

  /**
   * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected static final String TAG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected String tag = TAG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected fielddeclImpl()
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
    return MyDslPackage.Literals.FIELDDECL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELDDECL__IDENTIFIERLIST, oldIdentifierlist, identifierlist));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELDDECL__TYPE, oldType, newType);
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
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIELDDECL__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIELDDECL__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELDDECL__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEmbeddedfield()
  {
    return embeddedfield;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmbeddedfield(String newEmbeddedfield)
  {
    String oldEmbeddedfield = embeddedfield;
    embeddedfield = newEmbeddedfield;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELDDECL__EMBEDDEDFIELD, oldEmbeddedfield, embeddedfield));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTag()
  {
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTag(String newTag)
  {
    String oldTag = tag;
    tag = newTag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELDDECL__TAG, oldTag, tag));
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
      case MyDslPackage.FIELDDECL__TYPE:
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
      case MyDslPackage.FIELDDECL__IDENTIFIERLIST:
        return getIdentifierlist();
      case MyDslPackage.FIELDDECL__TYPE:
        return getType();
      case MyDslPackage.FIELDDECL__EMBEDDEDFIELD:
        return getEmbeddedfield();
      case MyDslPackage.FIELDDECL__TAG:
        return getTag();
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
      case MyDslPackage.FIELDDECL__IDENTIFIERLIST:
        setIdentifierlist((String)newValue);
        return;
      case MyDslPackage.FIELDDECL__TYPE:
        setType((type)newValue);
        return;
      case MyDslPackage.FIELDDECL__EMBEDDEDFIELD:
        setEmbeddedfield((String)newValue);
        return;
      case MyDslPackage.FIELDDECL__TAG:
        setTag((String)newValue);
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
      case MyDslPackage.FIELDDECL__IDENTIFIERLIST:
        setIdentifierlist(IDENTIFIERLIST_EDEFAULT);
        return;
      case MyDslPackage.FIELDDECL__TYPE:
        setType((type)null);
        return;
      case MyDslPackage.FIELDDECL__EMBEDDEDFIELD:
        setEmbeddedfield(EMBEDDEDFIELD_EDEFAULT);
        return;
      case MyDslPackage.FIELDDECL__TAG:
        setTag(TAG_EDEFAULT);
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
      case MyDslPackage.FIELDDECL__IDENTIFIERLIST:
        return IDENTIFIERLIST_EDEFAULT == null ? identifierlist != null : !IDENTIFIERLIST_EDEFAULT.equals(identifierlist);
      case MyDslPackage.FIELDDECL__TYPE:
        return type != null;
      case MyDslPackage.FIELDDECL__EMBEDDEDFIELD:
        return EMBEDDEDFIELD_EDEFAULT == null ? embeddedfield != null : !EMBEDDEDFIELD_EDEFAULT.equals(embeddedfield);
      case MyDslPackage.FIELDDECL__TAG:
        return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
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
    result.append(" (identifierlist: ");
    result.append(identifierlist);
    result.append(", embeddedfield: ");
    result.append(embeddedfield);
    result.append(", tag: ");
    result.append(tag);
    result.append(')');
    return result.toString();
  }

} //fielddeclImpl

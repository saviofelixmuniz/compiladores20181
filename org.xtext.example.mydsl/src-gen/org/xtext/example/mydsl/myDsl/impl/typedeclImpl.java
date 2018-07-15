/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.typedecl;
import org.xtext.example.mydsl.myDsl.typespec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>typedecl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.typedeclImpl#getTypespec <em>Typespec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class typedeclImpl extends MinimalEObjectImpl.Container implements typedecl
{
  /**
   * The cached value of the '{@link #getTypespec() <em>Typespec</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypespec()
   * @generated
   * @ordered
   */
  protected EList<typespec> typespec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected typedeclImpl()
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
    return MyDslPackage.Literals.TYPEDECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<typespec> getTypespec()
  {
    if (typespec == null)
    {
      typespec = new EObjectContainmentEList<typespec>(typespec.class, this, MyDslPackage.TYPEDECL__TYPESPEC);
    }
    return typespec;
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
      case MyDslPackage.TYPEDECL__TYPESPEC:
        return ((InternalEList<?>)getTypespec()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.TYPEDECL__TYPESPEC:
        return getTypespec();
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
      case MyDslPackage.TYPEDECL__TYPESPEC:
        getTypespec().clear();
        getTypespec().addAll((Collection<? extends typespec>)newValue);
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
      case MyDslPackage.TYPEDECL__TYPESPEC:
        getTypespec().clear();
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
      case MyDslPackage.TYPEDECL__TYPESPEC:
        return typespec != null && !typespec.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //typedeclImpl

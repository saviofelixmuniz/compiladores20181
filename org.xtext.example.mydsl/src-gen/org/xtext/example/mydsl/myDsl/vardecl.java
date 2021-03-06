/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>vardecl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.vardecl#getVarspec <em>Varspec</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getvardecl()
 * @model
 * @generated
 */
public interface vardecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Varspec</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.varspec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Varspec</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Varspec</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getvardecl_Varspec()
   * @model containment="true"
   * @generated
   */
  EList<varspec> getVarspec();

} // vardecl

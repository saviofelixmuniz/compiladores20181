/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>parameterlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.parameterlist#getParameterdecl <em>Parameterdecl</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getparameterlist()
 * @model
 * @generated
 */
public interface parameterlist extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameterdecl</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.parameterdecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameterdecl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameterdecl</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getparameterlist_Parameterdecl()
   * @model containment="true"
   * @generated
   */
  EList<parameterdecl> getParameterdecl();

} // parameterlist

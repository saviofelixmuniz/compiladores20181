/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sourcefile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.sourcefile#getPackageclause <em>Packageclause</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.sourcefile#getImportdecl <em>Importdecl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.sourcefile#getTopleveldecl <em>Topleveldecl</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getsourcefile()
 * @model
 * @generated
 */
public interface sourcefile extends EObject
{
  /**
   * Returns the value of the '<em><b>Packageclause</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packageclause</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packageclause</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getsourcefile_Packageclause()
   * @model unique="false"
   * @generated
   */
  EList<String> getPackageclause();

  /**
   * Returns the value of the '<em><b>Importdecl</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Importdecl</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Importdecl</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getsourcefile_Importdecl()
   * @model unique="false"
   * @generated
   */
  EList<String> getImportdecl();

  /**
   * Returns the value of the '<em><b>Topleveldecl</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.topleveldecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Topleveldecl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Topleveldecl</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getsourcefile_Topleveldecl()
   * @model containment="true"
   * @generated
   */
  EList<topleveldecl> getTopleveldecl();

} // sourcefile

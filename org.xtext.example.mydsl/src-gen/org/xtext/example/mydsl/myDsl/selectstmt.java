/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>selectstmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.selectstmt#getCommclause <em>Commclause</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getselectstmt()
 * @model
 * @generated
 */
public interface selectstmt extends EObject
{
  /**
   * Returns the value of the '<em><b>Commclause</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.commclause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commclause</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commclause</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getselectstmt_Commclause()
   * @model containment="true"
   * @generated
   */
  EList<commclause> getCommclause();

} // selectstmt

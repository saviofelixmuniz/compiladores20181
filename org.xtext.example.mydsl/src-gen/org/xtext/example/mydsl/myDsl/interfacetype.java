/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>interfacetype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.interfacetype#getMethodspec <em>Methodspec</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getinterfacetype()
 * @model
 * @generated
 */
public interface interfacetype extends EObject
{
  /**
   * Returns the value of the '<em><b>Methodspec</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.methodspec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methodspec</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methodspec</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getinterfacetype_Methodspec()
   * @model containment="true"
   * @generated
   */
  EList<methodspec> getMethodspec();

} // interfacetype
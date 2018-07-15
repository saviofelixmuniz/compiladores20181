/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>typespec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.typespec#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.typespec#getTypespecaux <em>Typespecaux</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettypespec()
 * @model
 * @generated
 */
public interface typespec extends EObject
{
  /**
   * Returns the value of the '<em><b>IDENTIFIER</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IDENTIFIER</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>IDENTIFIER</em>' attribute.
   * @see #setIDENTIFIER(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettypespec_IDENTIFIER()
   * @model
   * @generated
   */
  String getIDENTIFIER();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.typespec#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IDENTIFIER</em>' attribute.
   * @see #getIDENTIFIER()
   * @generated
   */
  void setIDENTIFIER(String value);

  /**
   * Returns the value of the '<em><b>Typespecaux</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typespecaux</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typespecaux</em>' containment reference.
   * @see #setTypespecaux(typespecaux)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettypespec_Typespecaux()
   * @model containment="true"
   * @generated
   */
  typespecaux getTypespecaux();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.typespec#getTypespecaux <em>Typespecaux</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typespecaux</em>' containment reference.
   * @see #getTypespecaux()
   * @generated
   */
  void setTypespecaux(typespecaux value);

} // typespec

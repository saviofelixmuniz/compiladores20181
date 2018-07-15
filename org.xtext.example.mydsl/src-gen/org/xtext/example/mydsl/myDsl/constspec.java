/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>constspec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.constspec#getIdentifierlist <em>Identifierlist</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.constspec#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.constspec#getExpressionlist <em>Expressionlist</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getconstspec()
 * @model
 * @generated
 */
public interface constspec extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifierlist</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifierlist</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifierlist</em>' attribute.
   * @see #setIdentifierlist(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getconstspec_Identifierlist()
   * @model
   * @generated
   */
  String getIdentifierlist();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.constspec#getIdentifierlist <em>Identifierlist</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifierlist</em>' attribute.
   * @see #getIdentifierlist()
   * @generated
   */
  void setIdentifierlist(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(type)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getconstspec_Type()
   * @model containment="true"
   * @generated
   */
  type getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.constspec#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(type value);

  /**
   * Returns the value of the '<em><b>Expressionlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressionlist</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressionlist</em>' containment reference.
   * @see #setExpressionlist(expressionlist)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getconstspec_Expressionlist()
   * @model containment="true"
   * @generated
   */
  expressionlist getExpressionlist();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.constspec#getExpressionlist <em>Expressionlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressionlist</em>' containment reference.
   * @see #getExpressionlist()
   * @generated
   */
  void setExpressionlist(expressionlist value);

} // constspec

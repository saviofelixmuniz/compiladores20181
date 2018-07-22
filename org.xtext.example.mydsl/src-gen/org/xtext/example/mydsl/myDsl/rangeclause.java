/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>rangeclause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.rangeclause#getExpressionlist <em>Expressionlist</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.rangeclause#getIdentifierlist <em>Identifierlist</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.rangeclause#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getrangeclause()
 * @model
 * @generated
 */
public interface rangeclause extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressionlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressionlist</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressionlist</em>' containment reference.
   * @see #setExpressionlist(postexpressionlist)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getrangeclause_Expressionlist()
   * @model containment="true"
   * @generated
   */
  postexpressionlist getExpressionlist();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.rangeclause#getExpressionlist <em>Expressionlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressionlist</em>' containment reference.
   * @see #getExpressionlist()
   * @generated
   */
  void setExpressionlist(postexpressionlist value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getrangeclause_Identifierlist()
   * @model
   * @generated
   */
  String getIdentifierlist();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.rangeclause#getIdentifierlist <em>Identifierlist</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifierlist</em>' attribute.
   * @see #getIdentifierlist()
   * @generated
   */
  void setIdentifierlist(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getrangeclause_Expression()
   * @model containment="true"
   * @generated
   */
  expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.rangeclause#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(expression value);

} // rangeclause

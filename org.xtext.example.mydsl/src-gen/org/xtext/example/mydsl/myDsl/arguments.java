/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>arguments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.arguments#getExpressionlist <em>Expressionlist</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getarguments()
 * @model
 * @generated
 */
public interface arguments extends primaryexpraux
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
   * @see #setExpressionlist(expressionlist)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getarguments_Expressionlist()
   * @model containment="true"
   * @generated
   */
  expressionlist getExpressionlist();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.arguments#getExpressionlist <em>Expressionlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressionlist</em>' containment reference.
   * @see #getExpressionlist()
   * @generated
   */
  void setExpressionlist(expressionlist value);

} // arguments
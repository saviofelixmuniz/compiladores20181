/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.expression#getExpressionaux <em>Expressionaux</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getexpression()
 * @model
 * @generated
 */
public interface expression extends expressionaux, index, slice, conversion, operand, key, element, expressionlist
{
  /**
   * Returns the value of the '<em><b>Expressionaux</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.expressionaux}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressionaux</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressionaux</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getexpression_Expressionaux()
   * @model containment="true"
   * @generated
   */
  EList<expressionaux> getExpressionaux();

} // expression

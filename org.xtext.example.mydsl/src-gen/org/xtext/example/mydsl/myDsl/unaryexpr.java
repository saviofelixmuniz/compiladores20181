/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>unaryexpr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.unaryexpr#getPrimaryexpr <em>Primaryexpr</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getunaryexpr()
 * @model
 * @generated
 */
public interface unaryexpr extends expression
{
  /**
   * Returns the value of the '<em><b>Primaryexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primaryexpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primaryexpr</em>' containment reference.
   * @see #setPrimaryexpr(primaryexpr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getunaryexpr_Primaryexpr()
   * @model containment="true"
   * @generated
   */
  primaryexpr getPrimaryexpr();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.unaryexpr#getPrimaryexpr <em>Primaryexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primaryexpr</em>' containment reference.
   * @see #getPrimaryexpr()
   * @generated
   */
  void setPrimaryexpr(primaryexpr value);

} // unaryexpr

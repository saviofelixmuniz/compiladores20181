/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>keytype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.keytype#getElementtype <em>Elementtype</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getkeytype()
 * @model
 * @generated
 */
public interface keytype extends maptype
{
  /**
   * Returns the value of the '<em><b>Elementtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elementtype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elementtype</em>' containment reference.
   * @see #setElementtype(elementtype)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getkeytype_Elementtype()
   * @model containment="true"
   * @generated
   */
  elementtype getElementtype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.keytype#getElementtype <em>Elementtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elementtype</em>' containment reference.
   * @see #getElementtype()
   * @generated
   */
  void setElementtype(elementtype value);

} // keytype
/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.parameters#getParameterlist <em>Parameterlist</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getparameters()
 * @model
 * @generated
 */
public interface parameters extends receiver, result
{
  /**
   * Returns the value of the '<em><b>Parameterlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameterlist</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameterlist</em>' containment reference.
   * @see #setParameterlist(parameterlist)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getparameters_Parameterlist()
   * @model containment="true"
   * @generated
   */
  parameterlist getParameterlist();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.parameters#getParameterlist <em>Parameterlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameterlist</em>' containment reference.
   * @see #getParameterlist()
   * @generated
   */
  void setParameterlist(parameterlist value);

} // parameters

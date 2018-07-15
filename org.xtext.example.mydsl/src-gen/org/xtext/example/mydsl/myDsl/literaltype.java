/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>literaltype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.literaltype#getStructtype <em>Structtype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.literaltype#getElementtype <em>Elementtype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.literaltype#getSlicetype <em>Slicetype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.literaltype#getMaptype <em>Maptype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.literaltype#getTypename <em>Typename</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getliteraltype()
 * @model
 * @generated
 */
public interface literaltype extends EObject
{
  /**
   * Returns the value of the '<em><b>Structtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structtype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structtype</em>' containment reference.
   * @see #setStructtype(structtype)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getliteraltype_Structtype()
   * @model containment="true"
   * @generated
   */
  structtype getStructtype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.literaltype#getStructtype <em>Structtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Structtype</em>' containment reference.
   * @see #getStructtype()
   * @generated
   */
  void setStructtype(structtype value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getliteraltype_Elementtype()
   * @model containment="true"
   * @generated
   */
  elementtype getElementtype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.literaltype#getElementtype <em>Elementtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elementtype</em>' containment reference.
   * @see #getElementtype()
   * @generated
   */
  void setElementtype(elementtype value);

  /**
   * Returns the value of the '<em><b>Slicetype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Slicetype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Slicetype</em>' containment reference.
   * @see #setSlicetype(slicetype)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getliteraltype_Slicetype()
   * @model containment="true"
   * @generated
   */
  slicetype getSlicetype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.literaltype#getSlicetype <em>Slicetype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Slicetype</em>' containment reference.
   * @see #getSlicetype()
   * @generated
   */
  void setSlicetype(slicetype value);

  /**
   * Returns the value of the '<em><b>Maptype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maptype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maptype</em>' containment reference.
   * @see #setMaptype(maptype)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getliteraltype_Maptype()
   * @model containment="true"
   * @generated
   */
  maptype getMaptype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.literaltype#getMaptype <em>Maptype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maptype</em>' containment reference.
   * @see #getMaptype()
   * @generated
   */
  void setMaptype(maptype value);

  /**
   * Returns the value of the '<em><b>Typename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typename</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typename</em>' attribute.
   * @see #setTypename(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getliteraltype_Typename()
   * @model
   * @generated
   */
  String getTypename();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.literaltype#getTypename <em>Typename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typename</em>' attribute.
   * @see #getTypename()
   * @generated
   */
  void setTypename(String value);

} // literaltype
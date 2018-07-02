/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXPRESSION:
      {
        expression expression = (expression)theEObject;
        T result = caseexpression(expression);
        if (result == null) result = caseexpressionaux(expression);
        if (result == null) result = caseindex(expression);
        if (result == null) result = caseslice(expression);
        if (result == null) result = caseconversion(expression);
        if (result == null) result = caseoperand(expression);
        if (result == null) result = casekey(expression);
        if (result == null) result = caseelement(expression);
        if (result == null) result = caseexpressionlist(expression);
        if (result == null) result = caseprimaryexpraux(expression);
        if (result == null) result = casekeyedelement(expression);
        if (result == null) result = caseprimaryexpr(expression);
        if (result == null) result = caseelementlist(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXPRESSIONAUX:
      {
        expressionaux expressionaux = (expressionaux)theEObject;
        T result = caseexpressionaux(expressionaux);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.UNARYEXPR:
      {
        unaryexpr unaryexpr = (unaryexpr)theEObject;
        T result = caseunaryexpr(unaryexpr);
        if (result == null) result = caseexpression(unaryexpr);
        if (result == null) result = caseexpressionaux(unaryexpr);
        if (result == null) result = caseindex(unaryexpr);
        if (result == null) result = caseslice(unaryexpr);
        if (result == null) result = caseconversion(unaryexpr);
        if (result == null) result = caseoperand(unaryexpr);
        if (result == null) result = casekey(unaryexpr);
        if (result == null) result = caseelement(unaryexpr);
        if (result == null) result = caseexpressionlist(unaryexpr);
        if (result == null) result = caseprimaryexpraux(unaryexpr);
        if (result == null) result = casekeyedelement(unaryexpr);
        if (result == null) result = caseprimaryexpr(unaryexpr);
        if (result == null) result = caseelementlist(unaryexpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PRIMARYEXPR:
      {
        primaryexpr primaryexpr = (primaryexpr)theEObject;
        T result = caseprimaryexpr(primaryexpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PRIMARYEXPRAUX:
      {
        primaryexpraux primaryexpraux = (primaryexpraux)theEObject;
        T result = caseprimaryexpraux(primaryexpraux);
        if (result == null) result = caseprimaryexpr(primaryexpraux);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.INDEX:
      {
        index index = (index)theEObject;
        T result = caseindex(index);
        if (result == null) result = caseprimaryexpraux(index);
        if (result == null) result = caseprimaryexpr(index);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SLICE:
      {
        slice slice = (slice)theEObject;
        T result = caseslice(slice);
        if (result == null) result = caseprimaryexpraux(slice);
        if (result == null) result = caseprimaryexpr(slice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONVERSION:
      {
        conversion conversion = (conversion)theEObject;
        T result = caseconversion(conversion);
        if (result == null) result = caseprimaryexpr(conversion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.OPERAND:
      {
        operand operand = (operand)theEObject;
        T result = caseoperand(operand);
        if (result == null) result = caseprimaryexpr(operand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.COMPOSITELIT:
      {
        compositelit compositelit = (compositelit)theEObject;
        T result = casecompositelit(compositelit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LITERALVALUE:
      {
        literalvalue literalvalue = (literalvalue)theEObject;
        T result = caseliteralvalue(literalvalue);
        if (result == null) result = casecompositelit(literalvalue);
        if (result == null) result = casekey(literalvalue);
        if (result == null) result = caseelement(literalvalue);
        if (result == null) result = casekeyedelement(literalvalue);
        if (result == null) result = caseelementlist(literalvalue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ELEMENTLIST:
      {
        elementlist elementlist = (elementlist)theEObject;
        T result = caseelementlist(elementlist);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.KEYEDELEMENT:
      {
        keyedelement keyedelement = (keyedelement)theEObject;
        T result = casekeyedelement(keyedelement);
        if (result == null) result = caseelementlist(keyedelement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.KEY:
      {
        key key = (key)theEObject;
        T result = casekey(key);
        if (result == null) result = casekeyedelement(key);
        if (result == null) result = caseelementlist(key);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ELEMENT:
      {
        element element = (element)theEObject;
        T result = caseelement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ARGUMENTS:
      {
        arguments arguments = (arguments)theEObject;
        T result = casearguments(arguments);
        if (result == null) result = caseprimaryexpraux(arguments);
        if (result == null) result = caseprimaryexpr(arguments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXPRESSIONLIST:
      {
        expressionlist expressionlist = (expressionlist)theEObject;
        T result = caseexpressionlist(expressionlist);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXPERSSIONAUX:
      {
        experssionaux experssionaux = (experssionaux)theEObject;
        T result = caseexperssionaux(experssionaux);
        if (result == null) result = caseexpressionaux(experssionaux);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpression(expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expressionaux</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expressionaux</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpressionaux(expressionaux object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>unaryexpr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>unaryexpr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseunaryexpr(unaryexpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>primaryexpr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>primaryexpr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprimaryexpr(primaryexpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>primaryexpraux</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>primaryexpraux</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprimaryexpraux(primaryexpraux object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>index</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>index</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseindex(index object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>slice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>slice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseslice(slice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>conversion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>conversion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconversion(conversion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseoperand(operand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>compositelit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>compositelit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecompositelit(compositelit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>literalvalue</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>literalvalue</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseliteralvalue(literalvalue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>elementlist</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>elementlist</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseelementlist(elementlist object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>keyedelement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>keyedelement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casekeyedelement(keyedelement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casekey(key object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseelement(element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>arguments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>arguments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casearguments(arguments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expressionlist</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expressionlist</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpressionlist(expressionlist object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>experssionaux</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>experssionaux</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexperssionaux(experssionaux object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch

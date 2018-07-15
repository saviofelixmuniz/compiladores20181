/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>sourcefile</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>sourcefile</em>'.
   * @generated
   */
  sourcefile createsourcefile();

  /**
   * Returns a new object of class '<em>expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression</em>'.
   * @generated
   */
  expression createexpression();

  /**
   * Returns a new object of class '<em>expressionaux</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expressionaux</em>'.
   * @generated
   */
  expressionaux createexpressionaux();

  /**
   * Returns a new object of class '<em>unaryexpr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>unaryexpr</em>'.
   * @generated
   */
  unaryexpr createunaryexpr();

  /**
   * Returns a new object of class '<em>primaryexpr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>primaryexpr</em>'.
   * @generated
   */
  primaryexpr createprimaryexpr();

  /**
   * Returns a new object of class '<em>operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>operand</em>'.
   * @generated
   */
  operand createoperand();

  /**
   * Returns a new object of class '<em>conversion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>conversion</em>'.
   * @generated
   */
  conversion createconversion();

  /**
   * Returns a new object of class '<em>methodexpr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>methodexpr</em>'.
   * @generated
   */
  methodexpr createmethodexpr();

  /**
   * Returns a new object of class '<em>primaryexpraux</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>primaryexpraux</em>'.
   * @generated
   */
  primaryexpraux createprimaryexpraux();

  /**
   * Returns a new object of class '<em>slice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>slice</em>'.
   * @generated
   */
  slice createslice();

  /**
   * Returns a new object of class '<em>compositelit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>compositelit</em>'.
   * @generated
   */
  compositelit createcompositelit();

  /**
   * Returns a new object of class '<em>literaltype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>literaltype</em>'.
   * @generated
   */
  literaltype createliteraltype();

  /**
   * Returns a new object of class '<em>literalvalue</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>literalvalue</em>'.
   * @generated
   */
  literalvalue createliteralvalue();

  /**
   * Returns a new object of class '<em>elementlist</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>elementlist</em>'.
   * @generated
   */
  elementlist createelementlist();

  /**
   * Returns a new object of class '<em>keyedelement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>keyedelement</em>'.
   * @generated
   */
  keyedelement createkeyedelement();

  /**
   * Returns a new object of class '<em>key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>key</em>'.
   * @generated
   */
  key createkey();

  /**
   * Returns a new object of class '<em>element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>element</em>'.
   * @generated
   */
  element createelement();

  /**
   * Returns a new object of class '<em>functionlit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>functionlit</em>'.
   * @generated
   */
  functionlit createfunctionlit();

  /**
   * Returns a new object of class '<em>statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>statement</em>'.
   * @generated
   */
  statement createstatement();

  /**
   * Returns a new object of class '<em>declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>declaration</em>'.
   * @generated
   */
  declaration createdeclaration();

  /**
   * Returns a new object of class '<em>vardecl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>vardecl</em>'.
   * @generated
   */
  vardecl createvardecl();

  /**
   * Returns a new object of class '<em>varspec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>varspec</em>'.
   * @generated
   */
  varspec createvarspec();

  /**
   * Returns a new object of class '<em>typedecl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>typedecl</em>'.
   * @generated
   */
  typedecl createtypedecl();

  /**
   * Returns a new object of class '<em>typespec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>typespec</em>'.
   * @generated
   */
  typespec createtypespec();

  /**
   * Returns a new object of class '<em>typespecaux</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>typespecaux</em>'.
   * @generated
   */
  typespecaux createtypespecaux();

  /**
   * Returns a new object of class '<em>typedef</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>typedef</em>'.
   * @generated
   */
  typedef createtypedef();

  /**
   * Returns a new object of class '<em>aliasdecl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>aliasdecl</em>'.
   * @generated
   */
  aliasdecl createaliasdecl();

  /**
   * Returns a new object of class '<em>topleveldecl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>topleveldecl</em>'.
   * @generated
   */
  topleveldecl createtopleveldecl();

  /**
   * Returns a new object of class '<em>methoddecl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>methoddecl</em>'.
   * @generated
   */
  methoddecl createmethoddecl();

  /**
   * Returns a new object of class '<em>receiver</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>receiver</em>'.
   * @generated
   */
  receiver createreceiver();

  /**
   * Returns a new object of class '<em>functiondecl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>functiondecl</em>'.
   * @generated
   */
  functiondecl createfunctiondecl();

  /**
   * Returns a new object of class '<em>constdecl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constdecl</em>'.
   * @generated
   */
  constdecl createconstdecl();

  /**
   * Returns a new object of class '<em>constspec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constspec</em>'.
   * @generated
   */
  constspec createconstspec();

  /**
   * Returns a new object of class '<em>simplestmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>simplestmt</em>'.
   * @generated
   */
  simplestmt createsimplestmt();

  /**
   * Returns a new object of class '<em>shortvardecl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>shortvardecl</em>'.
   * @generated
   */
  shortvardecl createshortvardecl();

  /**
   * Returns a new object of class '<em>deferstmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>deferstmt</em>'.
   * @generated
   */
  deferstmt createdeferstmt();

  /**
   * Returns a new object of class '<em>returnstmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>returnstmt</em>'.
   * @generated
   */
  returnstmt createreturnstmt();

  /**
   * Returns a new object of class '<em>selectstmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>selectstmt</em>'.
   * @generated
   */
  selectstmt createselectstmt();

  /**
   * Returns a new object of class '<em>commclause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>commclause</em>'.
   * @generated
   */
  commclause createcommclause();

  /**
   * Returns a new object of class '<em>commcase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>commcase</em>'.
   * @generated
   */
  commcase createcommcase();

  /**
   * Returns a new object of class '<em>recvstmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>recvstmt</em>'.
   * @generated
   */
  recvstmt createrecvstmt();

  /**
   * Returns a new object of class '<em>postexpressionlist</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>postexpressionlist</em>'.
   * @generated
   */
  postexpressionlist createpostexpressionlist();

  /**
   * Returns a new object of class '<em>expressionlist</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expressionlist</em>'.
   * @generated
   */
  expressionlist createexpressionlist();

  /**
   * Returns a new object of class '<em>recvexpr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>recvexpr</em>'.
   * @generated
   */
  recvexpr createrecvexpr();

  /**
   * Returns a new object of class '<em>gotstmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>gotstmt</em>'.
   * @generated
   */
  gotstmt creategotstmt();

  /**
   * Returns a new object of class '<em>forstmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>forstmt</em>'.
   * @generated
   */
  forstmt createforstmt();

  /**
   * Returns a new object of class '<em>rangeclause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rangeclause</em>'.
   * @generated
   */
  rangeclause createrangeclause();

  /**
   * Returns a new object of class '<em>forclause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>forclause</em>'.
   * @generated
   */
  forclause createforclause();

  /**
   * Returns a new object of class '<em>initstmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>initstmt</em>'.
   * @generated
   */
  initstmt createinitstmt();

  /**
   * Returns a new object of class '<em>poststmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>poststmt</em>'.
   * @generated
   */
  poststmt createpoststmt();

  /**
   * Returns a new object of class '<em>condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>condition</em>'.
   * @generated
   */
  condition createcondition();

  /**
   * Returns a new object of class '<em>switchstmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>switchstmt</em>'.
   * @generated
   */
  switchstmt createswitchstmt();

  /**
   * Returns a new object of class '<em>exprswitchstmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>exprswitchstmt</em>'.
   * @generated
   */
  exprswitchstmt createexprswitchstmt();

  /**
   * Returns a new object of class '<em>exprcaseclause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>exprcaseclause</em>'.
   * @generated
   */
  exprcaseclause createexprcaseclause();

  /**
   * Returns a new object of class '<em>exprswitchcase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>exprswitchcase</em>'.
   * @generated
   */
  exprswitchcase createexprswitchcase();

  /**
   * Returns a new object of class '<em>typeswitchstmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>typeswitchstmt</em>'.
   * @generated
   */
  typeswitchstmt createtypeswitchstmt();

  /**
   * Returns a new object of class '<em>typeswitchguard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>typeswitchguard</em>'.
   * @generated
   */
  typeswitchguard createtypeswitchguard();

  /**
   * Returns a new object of class '<em>typecaseclause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>typecaseclause</em>'.
   * @generated
   */
  typecaseclause createtypecaseclause();

  /**
   * Returns a new object of class '<em>typeswitchcase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>typeswitchcase</em>'.
   * @generated
   */
  typeswitchcase createtypeswitchcase();

  /**
   * Returns a new object of class '<em>typelist</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>typelist</em>'.
   * @generated
   */
  typelist createtypelist();

  /**
   * Returns a new object of class '<em>ifstmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ifstmt</em>'.
   * @generated
   */
  ifstmt createifstmt();

  /**
   * Returns a new object of class '<em>assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>assignment</em>'.
   * @generated
   */
  assignment createassignment();

  /**
   * Returns a new object of class '<em>sendstmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>sendstmt</em>'.
   * @generated
   */
  sendstmt createsendstmt();

  /**
   * Returns a new object of class '<em>labeledstmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>labeledstmt</em>'.
   * @generated
   */
  labeledstmt createlabeledstmt();

  /**
   * Returns a new object of class '<em>block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>block</em>'.
   * @generated
   */
  block createblock();

  /**
   * Returns a new object of class '<em>statementlist</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>statementlist</em>'.
   * @generated
   */
  statementlist createstatementlist();

  /**
   * Returns a new object of class '<em>functionbody</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>functionbody</em>'.
   * @generated
   */
  functionbody createfunctionbody();

  /**
   * Returns a new object of class '<em>typeassertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>typeassertion</em>'.
   * @generated
   */
  typeassertion createtypeassertion();

  /**
   * Returns a new object of class '<em>arguments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>arguments</em>'.
   * @generated
   */
  arguments createarguments();

  /**
   * Returns a new object of class '<em>literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>literal</em>'.
   * @generated
   */
  literal createliteral();

  /**
   * Returns a new object of class '<em>slicetype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>slicetype</em>'.
   * @generated
   */
  slicetype createslicetype();

  /**
   * Returns a new object of class '<em>slicetypeaux</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>slicetypeaux</em>'.
   * @generated
   */
  slicetypeaux createslicetypeaux();

  /**
   * Returns a new object of class '<em>pointertype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>pointertype</em>'.
   * @generated
   */
  pointertype createpointertype();

  /**
   * Returns a new object of class '<em>basetype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>basetype</em>'.
   * @generated
   */
  basetype createbasetype();

  /**
   * Returns a new object of class '<em>channeltype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>channeltype</em>'.
   * @generated
   */
  channeltype createchanneltype();

  /**
   * Returns a new object of class '<em>maptype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>maptype</em>'.
   * @generated
   */
  maptype createmaptype();

  /**
   * Returns a new object of class '<em>keytype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>keytype</em>'.
   * @generated
   */
  keytype createkeytype();

  /**
   * Returns a new object of class '<em>elementtype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>elementtype</em>'.
   * @generated
   */
  elementtype createelementtype();

  /**
   * Returns a new object of class '<em>interfacetype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>interfacetype</em>'.
   * @generated
   */
  interfacetype createinterfacetype();

  /**
   * Returns a new object of class '<em>methodspec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>methodspec</em>'.
   * @generated
   */
  methodspec createmethodspec();

  /**
   * Returns a new object of class '<em>functiontype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>functiontype</em>'.
   * @generated
   */
  functiontype createfunctiontype();

  /**
   * Returns a new object of class '<em>signature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>signature</em>'.
   * @generated
   */
  signature createsignature();

  /**
   * Returns a new object of class '<em>type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type</em>'.
   * @generated
   */
  type createtype();

  /**
   * Returns a new object of class '<em>result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>result</em>'.
   * @generated
   */
  result createresult();

  /**
   * Returns a new object of class '<em>parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parameters</em>'.
   * @generated
   */
  parameters createparameters();

  /**
   * Returns a new object of class '<em>parameterlist</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parameterlist</em>'.
   * @generated
   */
  parameterlist createparameterlist();

  /**
   * Returns a new object of class '<em>parameterdecl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parameterdecl</em>'.
   * @generated
   */
  parameterdecl createparameterdecl();

  /**
   * Returns a new object of class '<em>structtype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>structtype</em>'.
   * @generated
   */
  structtype createstructtype();

  /**
   * Returns a new object of class '<em>fielddecl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>fielddecl</em>'.
   * @generated
   */
  fielddecl createfielddecl();

  /**
   * Returns a new object of class '<em>typelit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>typelit</em>'.
   * @generated
   */
  typelit createtypelit();

  /**
   * Returns a new object of class '<em>arraytype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>arraytype</em>'.
   * @generated
   */
  arraytype createarraytype();

  /**
   * Returns a new object of class '<em>arraytypeaux</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>arraytypeaux</em>'.
   * @generated
   */
  arraytypeaux createarraytypeaux();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory

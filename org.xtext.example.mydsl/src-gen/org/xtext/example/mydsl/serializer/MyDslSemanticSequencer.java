/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.arguments;
import org.xtext.example.mydsl.myDsl.experssionaux;
import org.xtext.example.mydsl.myDsl.key;
import org.xtext.example.mydsl.myDsl.keyedelement;
import org.xtext.example.mydsl.myDsl.literalvalue;
import org.xtext.example.mydsl.myDsl.operand;
import org.xtext.example.mydsl.myDsl.primaryexpraux;
import org.xtext.example.mydsl.myDsl.slice;
import org.xtext.example.mydsl.myDsl.unaryexpr;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MyDslPackage.ARGUMENTS:
				if (rule == grammarAccess.getArgumentsRule()) {
					sequence_arguments(context, (arguments) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPrimaryexprRule()
						|| rule == grammarAccess.getPrimaryexprauxRule()) {
					sequence_arguments_primaryexpraux(context, (arguments) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.EXPERSSIONAUX:
				sequence_expressionaux(context, (experssionaux) semanticObject); 
				return; 
			case MyDslPackage.KEY:
				if (rule == grammarAccess.getElementlistRule()) {
					sequence_elementlist_key_keyedelement(context, (key) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getKeyRule()) {
					sequence_key(context, (key) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getKeyedelementRule()) {
					sequence_key_keyedelement(context, (key) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.KEYEDELEMENT:
				if (rule == grammarAccess.getElementlistRule()) {
					sequence_elementlist_keyedelement(context, (keyedelement) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getKeyedelementRule()) {
					sequence_keyedelement(context, (keyedelement) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.LITERALVALUE:
				if (rule == grammarAccess.getElementlistRule()) {
					sequence_elementlist_keyedelement_literalvalue(context, (literalvalue) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getKeyedelementRule()) {
					sequence_keyedelement_literalvalue(context, (literalvalue) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getCompositelitRule()
						|| rule == grammarAccess.getLiteralvalueRule()
						|| rule == grammarAccess.getKeyRule()
						|| rule == grammarAccess.getElementRule()) {
					sequence_literalvalue(context, (literalvalue) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.OPERAND:
				if (rule == grammarAccess.getOperandRule()) {
					sequence_operand(context, (operand) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPrimaryexprRule()) {
					sequence_operand_primaryexpr(context, (operand) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.PRIMARYEXPRAUX:
				sequence_primaryexpraux(context, (primaryexpraux) semanticObject); 
				return; 
			case MyDslPackage.SLICE:
				if (rule == grammarAccess.getPrimaryexprRule()
						|| rule == grammarAccess.getPrimaryexprauxRule()) {
					sequence_primaryexpraux_slice(context, (slice) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSliceRule()) {
					sequence_slice(context, (slice) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.UNARYEXPR:
				if (rule == grammarAccess.getElementlistRule()) {
					sequence_elementlist_expression_keyedelement_unaryexpr(context, (unaryexpr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExpressionauxRule()) {
					sequence_expression_expressionaux_unaryexpr(context, (unaryexpr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExpressionlistRule()) {
					sequence_expression_expressionlist_unaryexpr(context, (unaryexpr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getKeyedelementRule()) {
					sequence_expression_keyedelement_unaryexpr(context, (unaryexpr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPrimaryexprRule()) {
					sequence_expression_primaryexpr_primaryexpraux_slice_unaryexpr(context, (unaryexpr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPrimaryexprauxRule()) {
					sequence_expression_primaryexpraux_slice_unaryexpr(context, (unaryexpr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSliceRule()) {
					sequence_expression_slice_unaryexpr(context, (unaryexpr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExpressionRule()
						|| rule == grammarAccess.getIndexRule()
						|| rule == grammarAccess.getConversionRule()
						|| rule == grammarAccess.getOperandRule()
						|| rule == grammarAccess.getKeyRule()
						|| rule == grammarAccess.getElementRule()) {
					sequence_expression_unaryexpr(context, (unaryexpr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getUnaryexprRule()) {
					sequence_unaryexpr(context, (unaryexpr) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     elements+=expression+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     arguments returns arguments
	 *
	 * Constraint:
	 *     (expressionlist=expressionlist | expressionlist=expressionlist)?
	 */
	protected void sequence_arguments(ISerializationContext context, arguments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     primaryexpr returns arguments
	 *     primaryexpraux returns arguments
	 *
	 * Constraint:
	 *     ((expressionlist=expressionlist | expressionlist=expressionlist)? primaryexpraux=primaryexpraux)
	 */
	protected void sequence_arguments_primaryexpraux(ISerializationContext context, arguments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     elementlist returns unaryexpr
	 *
	 * Constraint:
	 *     (primaryexpr=primaryexpr expressionaux+=expressionaux element=element keyedelement+=keyedelement*)
	 */
	protected void sequence_elementlist_expression_keyedelement_unaryexpr(ISerializationContext context, unaryexpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     elementlist returns key
	 *
	 * Constraint:
	 *     (element=element keyedelement+=keyedelement*)
	 */
	protected void sequence_elementlist_key_keyedelement(ISerializationContext context, key semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     elementlist returns keyedelement
	 *
	 * Constraint:
	 *     (element=element keyedelement+=keyedelement*)
	 */
	protected void sequence_elementlist_keyedelement(ISerializationContext context, keyedelement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     elementlist returns literalvalue
	 *
	 * Constraint:
	 *     (elementlist=elementlist? element=element keyedelement+=keyedelement*)
	 */
	protected void sequence_elementlist_keyedelement_literalvalue(ISerializationContext context, literalvalue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     expressionaux returns unaryexpr
	 *
	 * Constraint:
	 *     (primaryexpr=primaryexpr expressionaux+=expressionaux expressionaux+=expressionaux)
	 */
	protected void sequence_expression_expressionaux_unaryexpr(ISerializationContext context, unaryexpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     expressionlist returns unaryexpr
	 *
	 * Constraint:
	 *     (primaryexpr=primaryexpr expressionaux+=expressionaux expression+=expression*)
	 */
	protected void sequence_expression_expressionlist_unaryexpr(ISerializationContext context, unaryexpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     keyedelement returns unaryexpr
	 *
	 * Constraint:
	 *     (primaryexpr=primaryexpr expressionaux+=expressionaux element=element)
	 */
	protected void sequence_expression_keyedelement_unaryexpr(ISerializationContext context, unaryexpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     primaryexpr returns unaryexpr
	 *
	 * Constraint:
	 *     (
	 *         primaryexpr=primaryexpr 
	 *         expressionaux+=expressionaux 
	 *         (
	 *             primaryexpraux=primaryexpraux | 
	 *             primaryexpraux=primaryexpraux | 
	 *             primaryexpraux=primaryexpraux | 
	 *             (expression+=expression expression+=expression primaryexpraux=primaryexpraux)
	 *         )
	 *     )
	 */
	protected void sequence_expression_primaryexpr_primaryexpraux_slice_unaryexpr(ISerializationContext context, unaryexpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     primaryexpraux returns unaryexpr
	 *
	 * Constraint:
	 *     (
	 *         primaryexpr=primaryexpr 
	 *         expressionaux+=expressionaux 
	 *         (primaryexpraux=primaryexpraux | (expression+=expression expression+=expression primaryexpraux=primaryexpraux))
	 *     )
	 */
	protected void sequence_expression_primaryexpraux_slice_unaryexpr(ISerializationContext context, unaryexpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     slice returns unaryexpr
	 *
	 * Constraint:
	 *     (primaryexpr=primaryexpr expressionaux+=expressionaux expression+=expression expression+=expression)
	 */
	protected void sequence_expression_slice_unaryexpr(ISerializationContext context, unaryexpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     expression returns unaryexpr
	 *     index returns unaryexpr
	 *     conversion returns unaryexpr
	 *     operand returns unaryexpr
	 *     key returns unaryexpr
	 *     element returns unaryexpr
	 *
	 * Constraint:
	 *     (primaryexpr=primaryexpr expressionaux+=expressionaux)
	 */
	protected void sequence_expression_unaryexpr(ISerializationContext context, unaryexpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     expressionaux returns experssionaux
	 *
	 * Constraint:
	 *     {experssionaux}
	 */
	protected void sequence_expressionaux(ISerializationContext context, experssionaux semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     key returns key
	 *
	 * Constraint:
	 *     {key}
	 */
	protected void sequence_key(ISerializationContext context, key semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     keyedelement returns key
	 *
	 * Constraint:
	 *     element=element
	 */
	protected void sequence_key_keyedelement(ISerializationContext context, key semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.KEYEDELEMENT__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.KEYEDELEMENT__ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKeyedelementAccess().getElementElementParserRuleCall_1_0(), semanticObject.getElement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     keyedelement returns keyedelement
	 *
	 * Constraint:
	 *     element=element
	 */
	protected void sequence_keyedelement(ISerializationContext context, keyedelement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.KEYEDELEMENT__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.KEYEDELEMENT__ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKeyedelementAccess().getElementElementParserRuleCall_1_0(), semanticObject.getElement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     keyedelement returns literalvalue
	 *
	 * Constraint:
	 *     (elementlist=elementlist? element=element)
	 */
	protected void sequence_keyedelement_literalvalue(ISerializationContext context, literalvalue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     compositelit returns literalvalue
	 *     literalvalue returns literalvalue
	 *     key returns literalvalue
	 *     element returns literalvalue
	 *
	 * Constraint:
	 *     elementlist=elementlist?
	 */
	protected void sequence_literalvalue(ISerializationContext context, literalvalue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     operand returns operand
	 *
	 * Constraint:
	 *     {operand}
	 */
	protected void sequence_operand(ISerializationContext context, operand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     primaryexpr returns operand
	 *
	 * Constraint:
	 *     primaryexpraux=primaryexpraux
	 */
	protected void sequence_operand_primaryexpr(ISerializationContext context, operand semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PRIMARYEXPR__PRIMARYEXPRAUX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PRIMARYEXPR__PRIMARYEXPRAUX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryexprAccess().getPrimaryexprauxPrimaryexprauxParserRuleCall_0_1_0(), semanticObject.getPrimaryexpraux());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     primaryexpr returns primaryexpraux
	 *     primaryexpraux returns primaryexpraux
	 *
	 * Constraint:
	 *     {primaryexpraux}
	 */
	protected void sequence_primaryexpraux(ISerializationContext context, primaryexpraux semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     primaryexpr returns slice
	 *     primaryexpraux returns slice
	 *
	 * Constraint:
	 *     (((expression+=expression? expression+=expression?) | (expression+=expression expression+=expression)) primaryexpraux=primaryexpraux)
	 */
	protected void sequence_primaryexpraux_slice(ISerializationContext context, slice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     slice returns slice
	 *
	 * Constraint:
	 *     ((expression+=expression? expression+=expression?) | (expression+=expression expression+=expression))
	 */
	protected void sequence_slice(ISerializationContext context, slice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     unaryexpr returns unaryexpr
	 *
	 * Constraint:
	 *     primaryexpr=primaryexpr
	 */
	protected void sequence_unaryexpr(ISerializationContext context, unaryexpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.UNARYEXPR__PRIMARYEXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.UNARYEXPR__PRIMARYEXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnaryexprAccess().getPrimaryexprPrimaryexprParserRuleCall_0_0(), semanticObject.getPrimaryexpr());
		feeder.finish();
	}
	
	
}
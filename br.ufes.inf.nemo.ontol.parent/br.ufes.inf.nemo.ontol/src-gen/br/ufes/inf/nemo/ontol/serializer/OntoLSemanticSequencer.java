/*
 * generated by Xtext 2.10.0
 */
package br.ufes.inf.nemo.ontol.serializer;

import br.ufes.inf.nemo.ontol.model.BooleanValue;
import br.ufes.inf.nemo.ontol.model.FOClass;
import br.ufes.inf.nemo.ontol.model.GeneralizationSet;
import br.ufes.inf.nemo.ontol.model.HOClass;
import br.ufes.inf.nemo.ontol.model.Import;
import br.ufes.inf.nemo.ontol.model.Individual;
import br.ufes.inf.nemo.ontol.model.ListValue;
import br.ufes.inf.nemo.ontol.model.Model;
import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.model.NoneValue;
import br.ufes.inf.nemo.ontol.model.NumberValue;
import br.ufes.inf.nemo.ontol.model.Property;
import br.ufes.inf.nemo.ontol.model.PropertyAssignment;
import br.ufes.inf.nemo.ontol.model.ReferenceValue;
import br.ufes.inf.nemo.ontol.model.StringValue;
import br.ufes.inf.nemo.ontol.model.WClass;
import br.ufes.inf.nemo.ontol.services.OntoLGrammarAccess;
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

@SuppressWarnings("all")
public class OntoLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private OntoLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ModelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ModelPackage.BOOLEAN_VALUE:
				sequence_BooleanValue(context, (BooleanValue) semanticObject); 
				return; 
			case ModelPackage.FO_CLASS:
				if (rule == grammarAccess.getModelElementRule()
						|| rule == grammarAccess.getEntityDeclarationRule()
						|| rule == grammarAccess.getClassRule()) {
					sequence_Class_FOClass(context, (FOClass) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFOClassRule()) {
					sequence_FOClass(context, (FOClass) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.GENERALIZATION_SET:
				sequence_GeneralizationSet(context, (GeneralizationSet) semanticObject); 
				return; 
			case ModelPackage.HO_CLASS:
				if (rule == grammarAccess.getModelElementRule()
						|| rule == grammarAccess.getEntityDeclarationRule()
						|| rule == grammarAccess.getClassRule()) {
					sequence_Class_HOClass(context, (HOClass) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getHOClassRule()) {
					sequence_HOClass(context, (HOClass) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case ModelPackage.INDIVIDUAL:
				sequence_Individual(context, (Individual) semanticObject); 
				return; 
			case ModelPackage.LIST_VALUE:
				sequence_ListValue(context, (ListValue) semanticObject); 
				return; 
			case ModelPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ModelPackage.NONE_VALUE:
				sequence_NoneValue(context, (NoneValue) semanticObject); 
				return; 
			case ModelPackage.NUMBER_VALUE:
				sequence_NumberValue(context, (NumberValue) semanticObject); 
				return; 
			case ModelPackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case ModelPackage.PROPERTY_ASSIGNMENT:
				sequence_PropertyAssignment(context, (PropertyAssignment) semanticObject); 
				return; 
			case ModelPackage.REFERENCE_VALUE:
				sequence_ReferenceValue(context, (ReferenceValue) semanticObject); 
				return; 
			case ModelPackage.SET:
				sequence_Set(context, (br.ufes.inf.nemo.ontol.model.Set) semanticObject); 
				return; 
			case ModelPackage.STRING_VALUE:
				sequence_StringValue(context, (StringValue) semanticObject); 
				return; 
			case ModelPackage.WCLASS:
				if (rule == grammarAccess.getModelElementRule()
						|| rule == grammarAccess.getEntityDeclarationRule()
						|| rule == grammarAccess.getClassRule()) {
					sequence_Class_WClass(context, (WClass) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getWClassRule()) {
					sequence_WClass(context, (WClass) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Value returns BooleanValue
	 *     BooleanValue returns BooleanValue
	 *
	 * Constraint:
	 *     value=BOOLEAN
	 */
	protected void sequence_BooleanValue(ISerializationContext context, BooleanValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.BOOLEAN_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.BOOLEAN_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBooleanValueAccess().getValueBOOLEANParserRuleCall_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns FOClass
	 *     EntityDeclaration returns FOClass
	 *     Class returns FOClass
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (fixedTypes+=[Class|QualifiedName] fixedTypes+=[Class|QualifiedName]*)? 
	 *         (superClasses+=[Class|QualifiedName] superClasses+=[Class|QualifiedName]*)? 
	 *         (props+=Property | propAssigns+=PropertyAssignment)*
	 *     )
	 */
	protected void sequence_Class_FOClass(ISerializationContext context, FOClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns HOClass
	 *     EntityDeclaration returns HOClass
	 *     Class returns HOClass
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         order=INT 
	 *         (fixedTypes+=[Class|QualifiedName] fixedTypes+=[Class|QualifiedName]*)? 
	 *         (superClasses+=[Class|QualifiedName] superClasses+=[Class|QualifiedName]*)? 
	 *         (subordinators+=[Class|QualifiedName] subordinators+=[Class|QualifiedName]*)? 
	 *         ((catType=CategorizationType basetype=[Class|QualifiedName]) | powertypeOf=[Class|QualifiedName])? 
	 *         (props+=Property | propAssigns+=PropertyAssignment)*
	 *     )
	 */
	protected void sequence_Class_HOClass(ISerializationContext context, HOClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns WClass
	 *     EntityDeclaration returns WClass
	 *     Class returns WClass
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (fixedTypes+=[Class|QualifiedName] fixedTypes+=[Class|QualifiedName]*)? 
	 *         (superClasses+=[Class|QualifiedName] superClasses+=[Class|QualifiedName]*)? 
	 *         (subordinators+=[Class|QualifiedName] subordinators+=[Class|QualifiedName]*)? 
	 *         ((catType=CategorizationType basetype=[Class|QualifiedName]) | powertypeOf=[Class|QualifiedName])? 
	 *         (props+=Property | propAssigns+=PropertyAssignment)*
	 *     )
	 */
	protected void sequence_Class_WClass(ISerializationContext context, WClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FOClass returns FOClass
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (fixedTypes+=[Class|QualifiedName] fixedTypes+=[Class|QualifiedName]*)? 
	 *         (superClasses+=[Class|QualifiedName] superClasses+=[Class|QualifiedName]*)?
	 *     )
	 */
	protected void sequence_FOClass(ISerializationContext context, FOClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns GeneralizationSet
	 *     GeneralizationSet returns GeneralizationSet
	 *
	 * Constraint:
	 *     (
	 *         (isDisjoint?='disjoint' | isComplete?='complete' | (isDisjoint?='disjoint' isComplete?='complete') | (isComplete?='complete' isDisjoint?='disjoint'))? 
	 *         name=ID 
	 *         general=[Class|QualifiedName] 
	 *         categorizer=[Class|QualifiedName]? 
	 *         specifics+=[Class|QualifiedName] 
	 *         specifics+=[Class|QualifiedName]*
	 *     )
	 */
	protected void sequence_GeneralizationSet(ISerializationContext context, GeneralizationSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     HOClass returns HOClass
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         order=INT 
	 *         (fixedTypes+=[Class|QualifiedName] fixedTypes+=[Class|QualifiedName]*)? 
	 *         (superClasses+=[Class|QualifiedName] superClasses+=[Class|QualifiedName]*)? 
	 *         (subordinators+=[Class|QualifiedName] subordinators+=[Class|QualifiedName]*)? 
	 *         ((catType=CategorizationType basetype=[Class|QualifiedName]) | powertypeOf=[Class|QualifiedName])?
	 *     )
	 */
	protected void sequence_HOClass(ISerializationContext context, HOClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns Import
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns Individual
	 *     EntityDeclaration returns Individual
	 *     Individual returns Individual
	 *
	 * Constraint:
	 *     (name=ID (fixedTypes+=[Class|QualifiedName] fixedTypes+=[Class|QualifiedName]*)? propAssigns+=PropertyAssignment*)
	 */
	protected void sequence_Individual(ISerializationContext context, Individual semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns ListValue
	 *     ListValue returns ListValue
	 *
	 * Constraint:
	 *     (value+=Value value+=Value*)
	 */
	protected void sequence_ListValue(ISerializationContext context, ListValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=QualifiedName elements+=ModelElement*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns NoneValue
	 *     NoneValue returns NoneValue
	 *
	 * Constraint:
	 *     {NoneValue}
	 */
	protected void sequence_NoneValue(ISerializationContext context, NoneValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns NumberValue
	 *     NumberValue returns NumberValue
	 *
	 * Constraint:
	 *     value=NUMBER
	 */
	protected void sequence_NumberValue(ISerializationContext context, NumberValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.NUMBER_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.NUMBER_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberValueAccess().getValueNUMBERParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PropertyAssignment returns PropertyAssignment
	 *
	 * Constraint:
	 *     (property=[Property|QualifiedName] assignment=Value)
	 */
	protected void sequence_PropertyAssignment(ISerializationContext context, PropertyAssignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.PROPERTY_ASSIGNMENT__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.PROPERTY_ASSIGNMENT__PROPERTY));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.PROPERTY_ASSIGNMENT__ASSIGNMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.PROPERTY_ASSIGNMENT__ASSIGNMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyAssignmentAccess().getPropertyPropertyQualifiedNameParserRuleCall_0_0_1(), semanticObject.getProperty());
		feeder.accept(grammarAccess.getPropertyAssignmentAccess().getAssignmentValueParserRuleCall_2_0(), semanticObject.getAssignment());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (lowerBound=ELEMENTBOUND upperBound=ELEMENTBOUND)? 
	 *         propertyType=[Class|QualifiedName] 
	 *         (subsetOf+=[Property|QualifiedName] subsetOf+=[Property|QualifiedName]*)? 
	 *         oppositeTo=[Property|QualifiedName]?
	 *     )
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns ReferenceValue
	 *     ReferenceValue returns ReferenceValue
	 *
	 * Constraint:
	 *     value=[EntityDeclaration|QualifiedName]
	 */
	protected void sequence_ReferenceValue(ISerializationContext context, ReferenceValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.REFERENCE_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.REFERENCE_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReferenceValueAccess().getValueEntityDeclarationQualifiedNameParserRuleCall_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns Set
	 *     EntityDeclaration returns Set
	 *     Set returns Set
	 *
	 * Constraint:
	 *     (name=STRING (fixedTypes+=[Class|QualifiedName] fixedTypes+=[Class|QualifiedName]*)? propAssigns+=PropertyAssignment*)
	 */
	protected void sequence_Set(ISerializationContext context, br.ufes.inf.nemo.ontol.model.Set semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns StringValue
	 *     StringValue returns StringValue
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringValue(ISerializationContext context, StringValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.STRING_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.STRING_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WClass returns WClass
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (fixedTypes+=[Class|QualifiedName] fixedTypes+=[Class|QualifiedName]*)? 
	 *         (superClasses+=[Class|QualifiedName] superClasses+=[Class|QualifiedName]*)? 
	 *         (subordinators+=[Class|QualifiedName] subordinators+=[Class|QualifiedName]*)? 
	 *         ((catType=CategorizationType basetype=[Class|QualifiedName]) | powertypeOf=[Class|QualifiedName])?
	 *     )
	 */
	protected void sequence_WClass(ISerializationContext context, WClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

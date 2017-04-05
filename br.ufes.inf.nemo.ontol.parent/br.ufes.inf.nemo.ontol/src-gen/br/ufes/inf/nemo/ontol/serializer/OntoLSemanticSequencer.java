/*
 * generated by Xtext 2.9.1
 */
package br.ufes.inf.nemo.ontol.serializer;

import br.ufes.inf.nemo.ontol.model.Attribute;
import br.ufes.inf.nemo.ontol.model.AttributeAssignment;
import br.ufes.inf.nemo.ontol.model.BooleanValue;
import br.ufes.inf.nemo.ontol.model.ComplexDataValue;
import br.ufes.inf.nemo.ontol.model.FOClass;
import br.ufes.inf.nemo.ontol.model.GeneralizationSet;
import br.ufes.inf.nemo.ontol.model.HOClass;
import br.ufes.inf.nemo.ontol.model.Import;
import br.ufes.inf.nemo.ontol.model.Individual;
import br.ufes.inf.nemo.ontol.model.Model;
import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.model.NoneValue;
import br.ufes.inf.nemo.ontol.model.NumberValue;
import br.ufes.inf.nemo.ontol.model.OrderlessClass;
import br.ufes.inf.nemo.ontol.model.Reference;
import br.ufes.inf.nemo.ontol.model.ReferenceAssignment;
import br.ufes.inf.nemo.ontol.model.StringValue;
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
			case ModelPackage.ATTRIBUTE:
				if (rule == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getRegularityAttributeRule()) {
					sequence_RegularityAttribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.ATTRIBUTE_ASSIGNMENT:
				if (rule == grammarAccess.getAttributeAssignmentRule()) {
					sequence_AttributeAssignment(context, (AttributeAssignment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSimpleAttributeAssignmentRule()) {
					sequence_SimpleAttributeAssignment(context, (AttributeAssignment) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.BOOLEAN_VALUE:
				sequence_BooleanValue(context, (BooleanValue) semanticObject); 
				return; 
			case ModelPackage.COMPLEX_DATA_VALUE:
				sequence_ComplexDataValue(context, (ComplexDataValue) semanticObject); 
				return; 
			case ModelPackage.FO_CLASS:
				if (rule == grammarAccess.getFOClassRule()) {
					sequence_FOClass(context, (FOClass) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getModelElementRule()
						|| rule == grammarAccess.getEntityDeclarationRule()
						|| rule == grammarAccess.getOntoLClassRule()) {
					sequence_FOClass_OntoLClass(context, (FOClass) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.GENERALIZATION_SET:
				sequence_GeneralizationSet(context, (GeneralizationSet) semanticObject); 
				return; 
			case ModelPackage.HO_CLASS:
				if (rule == grammarAccess.getHOClassRule()) {
					sequence_HOClass(context, (HOClass) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getModelElementRule()
						|| rule == grammarAccess.getEntityDeclarationRule()
						|| rule == grammarAccess.getOntoLClassRule()) {
					sequence_HOClass_OntoLClass(context, (HOClass) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case ModelPackage.INDIVIDUAL:
				if (rule == grammarAccess.getModelElementRule()
						|| rule == grammarAccess.getEntityDeclarationRule()
						|| rule == grammarAccess.getIndividualRule()) {
					sequence_Individual(context, (Individual) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getUnamedIndividualRule()) {
					sequence_UnamedIndividual(context, (Individual) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ModelPackage.NONE_VALUE:
				sequence_NoneValue(context, (NoneValue) semanticObject); 
				return; 
			case ModelPackage.NUMBER_VALUE:
				sequence_NumberValue(context, (NumberValue) semanticObject); 
				return; 
			case ModelPackage.ORDERLESS_CLASS:
				if (rule == grammarAccess.getModelElementRule()
						|| rule == grammarAccess.getEntityDeclarationRule()
						|| rule == grammarAccess.getOntoLClassRule()) {
					sequence_OntoLClass_OrderlessClass(context, (OrderlessClass) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getOrderlessClassRule()) {
					sequence_OrderlessClass(context, (OrderlessClass) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.REFERENCE:
				if (rule == grammarAccess.getReferenceRule()) {
					sequence_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getRegularityReferenceRule()) {
					sequence_RegularityReference(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.REFERENCE_ASSIGNMENT:
				sequence_ReferenceAssignment(context, (ReferenceAssignment) semanticObject); 
				return; 
			case ModelPackage.STRING_VALUE:
				sequence_StringValue(context, (StringValue) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AttributeAssignment returns AttributeAssignment
	 *
	 * Constraint:
	 *     (attribute=[Attribute|QualifiedName] (assignments+=DataValue | (assignments+=DataValue assignments+=DataValue*)))
	 */
	protected void sequence_AttributeAssignment(ISerializationContext context, AttributeAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (lowerBound=ELEMENTBOUND upperBound=ELEMENTBOUND)? 
	 *         propertyType=[OntoLClass|QualifiedName] 
	 *         (subsetOf+=[Attribute|QualifiedName] subsetOf+=[Attribute|QualifiedName]*)?
	 *     )
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataValue returns BooleanValue
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
	 *     DataValue returns ComplexDataValue
	 *     ComplexDataValue returns ComplexDataValue
	 *
	 * Constraint:
	 *     (value=[Individual|QualifiedName] | unnamedValue=UnamedIndividual)
	 */
	protected void sequence_ComplexDataValue(ISerializationContext context, ComplexDataValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FOClass returns FOClass
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (instantiatedClasses+=[OntoLClass|QualifiedName] instantiatedClasses+=[OntoLClass|QualifiedName]*)? 
	 *         (superClasses+=[OntoLClass|QualifiedName] superClasses+=[OntoLClass|QualifiedName]*)?
	 *     )
	 */
	protected void sequence_FOClass(ISerializationContext context, FOClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns FOClass
	 *     EntityDeclaration returns FOClass
	 *     OntoLClass returns FOClass
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (instantiatedClasses+=[OntoLClass|QualifiedName] instantiatedClasses+=[OntoLClass|QualifiedName]*)? 
	 *         (superClasses+=[OntoLClass|QualifiedName] superClasses+=[OntoLClass|QualifiedName]*)? 
	 *         (
	 *             attributes+=Attribute | 
	 *             attributes+=RegularityAttribute | 
	 *             attAssignments+=AttributeAssignment | 
	 *             references+=Reference | 
	 *             references+=RegularityReference | 
	 *             refAssignments+=ReferenceAssignment
	 *         )*
	 *     )
	 */
	protected void sequence_FOClass_OntoLClass(ISerializationContext context, FOClass semanticObject) {
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
	 *         name=ID? 
	 *         general=[OntoLClass|QualifiedName] 
	 *         categorizer=[OntoLClass|QualifiedName]? 
	 *         specifics+=[OntoLClass|QualifiedName] 
	 *         specifics+=[OntoLClass|QualifiedName]+
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
	 *         order=INT 
	 *         name=ID 
	 *         (instantiatedClasses+=[OntoLClass|QualifiedName] instantiatedClasses+=[OntoLClass|QualifiedName]*)? 
	 *         (superClasses+=[OntoLClass|QualifiedName] superClasses+=[OntoLClass|QualifiedName]*)? 
	 *         (subordinators+=[OntoLClass|QualifiedName] subordinators+=[OntoLClass|QualifiedName]*)? 
	 *         ((categorizationType=CategorizationType basetype=[OntoLClass|QualifiedName]) | powertypeOf=[OntoLClass|QualifiedName])?
	 *     )
	 */
	protected void sequence_HOClass(ISerializationContext context, HOClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns HOClass
	 *     EntityDeclaration returns HOClass
	 *     OntoLClass returns HOClass
	 *
	 * Constraint:
	 *     (
	 *         order=INT 
	 *         name=ID 
	 *         (instantiatedClasses+=[OntoLClass|QualifiedName] instantiatedClasses+=[OntoLClass|QualifiedName]*)? 
	 *         (superClasses+=[OntoLClass|QualifiedName] superClasses+=[OntoLClass|QualifiedName]*)? 
	 *         (subordinators+=[OntoLClass|QualifiedName] subordinators+=[OntoLClass|QualifiedName]*)? 
	 *         ((categorizationType=CategorizationType basetype=[OntoLClass|QualifiedName]) | powertypeOf=[OntoLClass|QualifiedName])? 
	 *         (
	 *             attributes+=Attribute | 
	 *             attributes+=RegularityAttribute | 
	 *             attAssignments+=AttributeAssignment | 
	 *             references+=Reference | 
	 *             references+=RegularityReference | 
	 *             refAssignments+=ReferenceAssignment
	 *         )*
	 *     )
	 */
	protected void sequence_HOClass_OntoLClass(ISerializationContext context, HOClass semanticObject) {
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
	 *     (
	 *         name=ID 
	 *         (instantiatedClasses+=[OntoLClass|QualifiedName] instantiatedClasses+=[OntoLClass|QualifiedName]*)? 
	 *         (attAssignments+=AttributeAssignment | refAssignments+=ReferenceAssignment)*
	 *     )
	 */
	protected void sequence_Individual(ISerializationContext context, Individual semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=QualifiedName (includes+=[Model|QualifiedName] | elements+=ModelElement)*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataValue returns NoneValue
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
	 *     DataValue returns NumberValue
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
	 *     ModelElement returns OrderlessClass
	 *     EntityDeclaration returns OrderlessClass
	 *     OntoLClass returns OrderlessClass
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (instantiatedClasses+=[OntoLClass|QualifiedName] instantiatedClasses+=[OntoLClass|QualifiedName]*)? 
	 *         (superClasses+=[OntoLClass|QualifiedName] superClasses+=[OntoLClass|QualifiedName]*)? 
	 *         (subordinators+=[OntoLClass|QualifiedName] subordinators+=[OntoLClass|QualifiedName]*)? 
	 *         ((categorizationType=CategorizationType basetype=[OntoLClass|QualifiedName]) | powertypeOf=[OntoLClass|QualifiedName])? 
	 *         (
	 *             attributes+=Attribute | 
	 *             attributes+=RegularityAttribute | 
	 *             attAssignments+=AttributeAssignment | 
	 *             references+=Reference | 
	 *             references+=RegularityReference | 
	 *             refAssignments+=ReferenceAssignment
	 *         )*
	 *     )
	 */
	protected void sequence_OntoLClass_OrderlessClass(ISerializationContext context, OrderlessClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OrderlessClass returns OrderlessClass
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (instantiatedClasses+=[OntoLClass|QualifiedName] instantiatedClasses+=[OntoLClass|QualifiedName]*)? 
	 *         (superClasses+=[OntoLClass|QualifiedName] superClasses+=[OntoLClass|QualifiedName]*)? 
	 *         (subordinators+=[OntoLClass|QualifiedName] subordinators+=[OntoLClass|QualifiedName]*)? 
	 *         ((categorizationType=CategorizationType basetype=[OntoLClass|QualifiedName]) | powertypeOf=[OntoLClass|QualifiedName])?
	 *     )
	 */
	protected void sequence_OrderlessClass(ISerializationContext context, OrderlessClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReferenceAssignment returns ReferenceAssignment
	 *
	 * Constraint:
	 *     (
	 *         reference=[Reference|QualifiedName] 
	 *         (
	 *             assignments+=[EntityDeclaration|QualifiedName] | 
	 *             (assignments+=[EntityDeclaration|QualifiedName] assignments+=[EntityDeclaration|QualifiedName]*)
	 *         )
	 *     )
	 */
	protected void sequence_ReferenceAssignment(ISerializationContext context, ReferenceAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Reference returns Reference
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (lowerBound=ELEMENTBOUND upperBound=ELEMENTBOUND)? 
	 *         propertyType=[OntoLClass|QualifiedName] 
	 *         (subsetOf+=[Reference|QualifiedName] subsetOf+=[Reference|QualifiedName]*)? 
	 *         oppositeTo=[Reference|QualifiedName]?
	 *     )
	 */
	protected void sequence_Reference(ISerializationContext context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RegularityAttribute returns Attribute
	 *
	 * Constraint:
	 *     (
	 *         regularity?='regularity' 
	 *         name=ID 
	 *         (lowerBound=ELEMENTBOUND upperBound=ELEMENTBOUND)? 
	 *         propertyType=[OntoLClass|QualifiedName] 
	 *         (subsetOf+=[Attribute|QualifiedName] subsetOf+=[Attribute|QualifiedName]*)? 
	 *         (regularityType=RegularityAttributeType regulatedProperty=[Attribute|QualifiedName])?
	 *     )
	 */
	protected void sequence_RegularityAttribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RegularityReference returns Reference
	 *
	 * Constraint:
	 *     (
	 *         regularity?='regularity' 
	 *         name=ID 
	 *         (lowerBound=ELEMENTBOUND upperBound=ELEMENTBOUND)? 
	 *         propertyType=[OntoLClass|QualifiedName] 
	 *         (subsetOf+=[Reference|QualifiedName] subsetOf+=[Reference|QualifiedName]*)? 
	 *         oppositeTo=[Reference|QualifiedName]? 
	 *         (regularityType=RegularityReferenceType regulatedProperty=[Reference|QualifiedName])?
	 *     )
	 */
	protected void sequence_RegularityReference(ISerializationContext context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimpleAttributeAssignment returns AttributeAssignment
	 *
	 * Constraint:
	 *     (attribute=[Attribute|QualifiedName] (assignments+=DataValue | (assignments+=DataValue assignments+=DataValue*)))
	 */
	protected void sequence_SimpleAttributeAssignment(ISerializationContext context, AttributeAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataValue returns StringValue
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
	 *     UnamedIndividual returns Individual
	 *
	 * Constraint:
	 *     (attAssignments+=SimpleAttributeAssignment attAssignments+=SimpleAttributeAssignment*)
	 */
	protected void sequence_UnamedIndividual(ISerializationContext context, Individual semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

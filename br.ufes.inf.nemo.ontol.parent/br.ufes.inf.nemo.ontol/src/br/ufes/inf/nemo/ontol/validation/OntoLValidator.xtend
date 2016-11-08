/*
 * generated by Xtext 2.10.0
 */
package br.ufes.inf.nemo.ontol.validation

import br.ufes.inf.nemo.ontol.model.OntoLClass
import br.ufes.inf.nemo.ontol.model.EntityDeclaration
import br.ufes.inf.nemo.ontol.model.GeneralizationSet
import br.ufes.inf.nemo.ontol.model.HOClass
import br.ufes.inf.nemo.ontol.model.ModelPackage
import br.ufes.inf.nemo.ontol.util.OntoLUtils
import com.google.inject.Inject
import org.eclipse.xtext.validation.CheckType
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class OntoLValidator extends AbstractOntoLValidator {
	
	@Inject extension OntoLUtils
	@Inject extension LinguisticRules
	@Inject extension MLTRules
	
	public static val INSTANTIATION_OF_DISJOINT_TYPES = "br.ufes.inf.nemo.ontol.InstantiationOfDisjointTypes"
	public static val MISSING_COMPLETE_INSTANTIATION = "br.ufes.inf.nemo.ontol.MissingCompleteInstantiation"
	public static val POWERTYPE_COMPLETE_SPECIALIZATION = "br.ufes.inf.nemo.ontol.PowertypeCompleteSpecialization"
	public static val COMPLETE_CHARACTERIZATION_AND_COMPLETENESS = "br.ufes.inf.nemo.ontol.CompleteCharacterizationAndCompleteness"
	public static val DISJOINT_CHARACTERIZATION_AND_DISJOINTNESS = "br.ufes.inf.nemo.ontol.DisjointCharacterizationAndDisjointness"
	public static val MANDATORY_SPECIALIZATION_OF_ENDURANT = "br.ufes.inf.nemo.ontol.MandaorySpecializationOfEndurant"
	public static val NONSORTAL_SPECIALIZING_SORTAL = "br.ufes.inf.nemo.ontol.NonSortalSpecializingSortal"
	public static val RIGID_SPECIALIZING_ANTIRIGID = "br.ufes.inf.nemo.ontol.RigidSpecializingAntiRigid"
	public static val SEMIRIGID_SPECIALIZING_ANTIRIGID = "br.ufes.inf.nemo.ontol.SemiRigidSpecializingAntiRigid"
	public static val MULTIPLE_IDENTITIES = "br.ufes.inf.nemo.ontol.MultipleIdentities"
	public static val MISSING_IDENTITY = "br.ufes.inf.nemo.ontol.MissingIdentity"
	public static val NECESSARY_INSTANTIATION = "br.ufes.inf.nemo.ontol.NecessaryInstantiation"
	public static val MISSING_SPECIALIZATION_TO_BASETYPE = "br.ufes.inf.nemo.ontol.MissingSpecializationToBasetype"
	
	@Check(CheckType.FAST)
	def void fastChecksOnEntityDeclaration(EntityDeclaration e){
		if(!e.isNameValid)
			error('''Entity name must start with a capital letter.''',
				ModelPackage.eINSTANCE.entityDeclaration_Name,
				LinguisticRules.INVALID_ENTITY_DECLARATION_NAME)
		if(e.duplicatedEntityName)
			error('''Entity name must be unique.''',
				ModelPackage.eINSTANCE.entityDeclaration_Name,
				LinguisticRules.DUPLICATED_ENTITY_NAME)
	}
	
	@Check(CheckType.FAST)
	def void fastCheckOnClass(OntoLClass c){
		val ch = c.classHierarchy
//		val iof = c.allInstantiatedClasses
		if(!c.isValidSpecialization)
			error('''Invalid specialization.''', 
				ModelPackage.eINSTANCE.ontoLClass_SuperClasses,
				LinguisticRules.INVALID_CLASS_SPECIALIZATION)
		if(c.hasCyclicSpecialization(ch))
			error('''Invalid cyclic specialization.''',
				ModelPackage.eINSTANCE.ontoLClass_SuperClasses,
				LinguisticRules.CYCLIC_SPECIALIZATION)
		if(!c.hasValidBasetype)
			error('''Invalid basetype.''',
				ModelPackage.eINSTANCE.ontoLClass_Basetype,
				LinguisticRules.INVALID_BASETYPE)
		if(!c.hasValidPowertypeRelation)
			error('''Invalid powertype relation.''',
				ModelPackage.eINSTANCE.ontoLClass_PowertypeOf,
				LinguisticRules.INVALID_POWERTYPE_RELATION)
		if(!c.hasValidSubordinators)
			error('''Invalid subordinator.''',
				ModelPackage.eINSTANCE.ontoLClass_Subordinators,
				LinguisticRules.INVALID_SUBORDINATOR)
	}
	
	@Check(CheckType.FAST)
	def void fastChecksOnHOClass(HOClass ho){
		if(!ho.minOrder)
			error('''Order must be of �MLTRules.MIN_ORDER� or greater.''',
				ModelPackage.eINSTANCE.HOClass_Order,
				MLTRules.INVALID_HO_CLASS_ORDER)
	}
	
	@Check(CheckType.FAST)
	def void fastChecksOnGeneralizationSet(GeneralizationSet gs){
		if(!gs.hasValidMembers)
			error('''This generalization set has invalid members.''',
				ModelPackage.eINSTANCE.generalizationSet_Name,
				LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS)
	}
	
	@Check(CheckType.NORMAL)
	def void normalChecksOnEntity(EntityDeclaration e){
		val iof = e.allInstantiatedClasses
		if(e.isInstanceOfDisjointClasses(iof))
			error('''�e.name� is instance of disjoint classes.''',
				ModelPackage.eINSTANCE.entityDeclaration_InstantiatedClasses,
				LinguisticRules.INSTANCE_OF_DISJOINT_CLASSES)
		if(e.missingInstantiationByCompleteness(iof))
			error('''Missing instantion of complete generalization set.''',
				ModelPackage.eINSTANCE.entityDeclaration_InstantiatedClasses,
				LinguisticRules.MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET)
	}
	
	@Check(CheckType.NORMAL)
	def void normalChecksOnClass(OntoLClass c){
		 val ch = c.classHierarchy
		 val iof = c.allInstantiatedClasses
 		if(c.isMissingSpecializationThroughPowertype(ch))
			error('''Missing specialization through powertype relation.''',
				ModelPackage.eINSTANCE.ontoLClass_SuperClasses,
				MLTRules.MISSING_SPECIALIZATION_THROUGH_POWERTYPE)
		if(!c.obeysSubordination(ch,iof))
			error('''Missing specialization through subordination.''',
				ModelPackage.eINSTANCE.ontoLClass_SuperClasses,
				LinguisticRules.MISSING_SPECIALIZATION_THROUGH_SUBODINATION)
		if(c.hasSimpleSubordinationCycle)
			error('''�c.name� is in a subordination cycle.''',
				ModelPackage.eINSTANCE.ontoLClass_Subordinators,
				LinguisticRules.SIMPLE_SUBORDINATION_CYCLE)
		if(c.isSpecializingDisjointClasses(ch))
			error('''�c.name� is specializing disjoint classes.''',
				ModelPackage.eINSTANCE.ontoLClass_Subordinators,
				LinguisticRules.SPECILIZATION_OF_DISJOINT_CLASSES)
	}
	
}

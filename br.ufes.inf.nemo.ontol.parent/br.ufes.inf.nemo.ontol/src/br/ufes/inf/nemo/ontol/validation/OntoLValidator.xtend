/*
 * generated by Xtext 2.10.0
 */
package br.ufes.inf.nemo.ontol.validation

import br.ufes.inf.nemo.ontol.model.EntityDeclaration
import br.ufes.inf.nemo.ontol.model.OntoLClass
import br.ufes.inf.nemo.ontol.model.HOClass
import br.ufes.inf.nemo.ontol.model.GeneralizationSet
import br.ufes.inf.nemo.ontol.model.Property
import br.ufes.inf.nemo.ontol.model.ModelPackage
import br.ufes.inf.nemo.ontol.util.OntoLUtils
import com.google.inject.Inject
import org.eclipse.xtext.validation.CheckType
import org.eclipse.xtext.validation.Check
import br.ufes.inf.nemo.ontol.model.FOClass
import br.ufes.inf.nemo.ontol.lib.OntoLLib
import br.ufes.inf.nemo.ontol.model.PropertyAssignment

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class OntoLValidator extends AbstractOntoLValidator {
	
	@Inject extension OntoLUtils
	@Inject extension OntoLLib
	
	@Inject extension LinguisticRules
	@Inject extension MLTRules
	@Inject extension UFORules
	
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
	
	// TODO Update checks table
	public static val UFO_A_MISSING_MUST_INSTANTIATION = "br.ufes.inf.nemo.ontol.ufo.a.MissingMustInstantiation"
	public static val UFO_A_ILLEGAL_SORTAL_SPECIALIZATION = "br.ufes.inf.nemo.ontol.ufo.a.IllegalSortalSpecialization"
	public static val UFO_A_ILLEGAL_RIGID_SPECIALIZATION = "br.ufes.inf.nemo.ontol.ufo.a.IllegalRigidSpecialization"
	public static val NON_CONFORMANT_ASSIGNMENT = "br.ufes.inf.nemo.ontol.NonConformantAssigment"
	
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
			error('''Order must be of «MLTRules.MIN_ORDER» or greater.''',
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
	
	@Check(CheckType.FAST)
	def void fastChecksOnProperty(Property p){
		p.checkSubsettedMultiplicity?.runIssue
		p.checkRegularityAndContainer?.runIssue
	}
	
	@Check(CheckType.FAST)
	def void fastChecksOnPropertyAssignment(PropertyAssignment pa){
		pa.checkMultiplicityAndAssignment?.runIssue
	}
	
	@Check(CheckType.NORMAL)
	def void normalChecksOnPropertyAssignment(PropertyAssignment pa){
		pa.checkPropertyAssignmentType?.runIssue
	}
	
	@Check(CheckType.NORMAL)
	def void normalChecksOnEntity(EntityDeclaration e){
		val iof = e.allInstantiatedClasses
		e.isInstanceOfDisjointClasses(iof)?.runIssue
		e.missingInstantiationByCompleteness(iof)?.runIssue
	}
	
	@Check(CheckType.NORMAL)
	def void normalChecksOnClass(OntoLClass c) {
		val ch = c.classHierarchy
		val iof = c.allInstantiatedClasses
		if (c.isMissingSpecializationThroughPowertype(ch))
			error('''Missing specialization through powertype relation.''',
				ModelPackage.eINSTANCE.ontoLClass_SuperClasses, MLTRules.MISSING_SPECIALIZATION_THROUGH_POWERTYPE)
		if (!c.obeysSubordination(ch, iof))
			error('''Missing specialization through subordination.''', ModelPackage.eINSTANCE.ontoLClass_SuperClasses,
				LinguisticRules.MISSING_SPECIALIZATION_THROUGH_SUBODINATION)
		if (c.hasSimpleSubordinationCycle)
			error('''«c.name» is in a subordination cycle.''', ModelPackage.eINSTANCE.ontoLClass_Subordinators,
				LinguisticRules.SIMPLE_SUBORDINATION_CYCLE)
		c.isSpecializingDisjointClasses(ch)?.runIssue
		c.checkInstantiatedRegularities?.runIssue
	}
	
	@Check(CheckType.EXPENSIVE)
	def void expensiveChecksOnFOClass(FOClass c) {
		// TODO Insert a check for UFO models
		
		val ch = (c as OntoLClass).classHierarchy
		val iof = (c as OntoLClass).allInstantiatedClasses
		val endurant = c.UFOEndurant
		
		val mustInstantiate = c.UFOMustInstantiateClasses
		val mixinclass = c.getLibClass(OntoLLib.UFO_MIXIN_CLASS)
		val rigidclass = c.getLibClass(OntoLLib.UFO_RIGID_CLASS)
		val semirigidclass = c.getLibClass(OntoLLib.UFO_SEMI_RIGID_CLASS)

		c.mustInstantiateUFOMetaproperties(ch,iof,endurant,mustInstantiate)?.runIssue
		c.checkSpecializationAndSortality(ch,iof,mixinclass)?.runIssue
		c.checkSpecializationAndRigidity(ch,iof,rigidclass,semirigidclass)?.runIssue
	}
	
	def private dispatch runIssue(ValidationError issue){
		val it = issue
		if(source!=null && feature!=null && index!=-1 && code!=null)// && issueData!=null)
			error(message,source,feature,index,code,issueData)
		else if(source!=null && feature!=null && code!=null)// && issueData!=null)
			error(message,source,feature,code,issueData)
		else if(feature!=null && index!=-1 && code!=null)// && issueData!=null)
			error(message,feature,index,code,issueData)
		else if(source!=null && feature!=null && index!=-1)
			error(message,source,feature,index)
		else if(source!=null && feature!=null)
			error(message,source,feature)
		else if(feature!=null && code!=null)// && issueData!=null)
			error(message,feature,code,issueData)
		else if(feature!=null && index!=-1)
			error(message,feature,index)
		else if(source!=null && feature!=null)
			error(message,feature)
	}
	
	def private dispatch runIssue(ValidationWarning issue){
		val it = issue
		if(source!=null && feature!=null && index!=-1 && code!=null)// && issueData!=null)
			warning(message,source,feature,index,code,issueData)
		else if(source!=null && feature!=null && code!=null)// && issueData!=null)
			warning(message,source,feature,code,issueData)
		else if(source!=null && feature!=null && index!=-1)
			warning(message,source,feature,index)
		else if(source!=null && feature!=null)
			warning(message,source,feature)
		else if(feature!=null && index!=-1 && code!=null)// && issueData!=null)
			warning(message,feature,index,code,issueData)
		else if(feature!=null && code!=null)// && issueData!=null)
			warning(message,feature,code,issueData)
		else if(feature!=null && index!=-1)
			warning(message,feature,index)
		else if(source!=null && feature!=null)
			warning(message,feature)
	}
	
}

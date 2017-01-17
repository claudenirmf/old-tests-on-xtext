package br.ufes.inf.nemo.ontol.validation

import br.ufes.inf.nemo.ontol.model.EntityDeclaration
import br.ufes.inf.nemo.ontol.model.FOClass
import br.ufes.inf.nemo.ontol.model.GeneralizationSet
import br.ufes.inf.nemo.ontol.model.HOClass
import br.ufes.inf.nemo.ontol.model.Model
import br.ufes.inf.nemo.ontol.model.ModelPackage
import br.ufes.inf.nemo.ontol.model.OntoLClass
import br.ufes.inf.nemo.ontol.model.OrderedClass
import br.ufes.inf.nemo.ontol.model.OrderlessClass
import br.ufes.inf.nemo.ontol.util.OntoLIndex
import br.ufes.inf.nemo.ontol.util.OntoLUtils
import com.google.common.collect.Sets
import com.google.inject.Inject
import java.util.Collections
import java.util.LinkedHashSet
import java.util.Set
import br.ufes.inf.nemo.ontol.model.PropertyAssignment
import br.ufes.inf.nemo.ontol.model.ReferenceAssignment
import br.ufes.inf.nemo.ontol.model.AttributeAssignment
import br.ufes.inf.nemo.ontol.model.Reference
import br.ufes.inf.nemo.ontol.model.Attribute
import org.eclipse.xtext.resource.IEObjectDescription
import br.ufes.inf.nemo.ontol.model.Value
import br.ufes.inf.nemo.ontol.model.ComplexDataValue

class LinguisticRules {
	
	@Inject extension OntoLUtils
	@Inject extension OntoLIndex
	
	public static val INVALID_ENTITY_DECLARATION_NAME =	"br.ufes.inf.nemo.ontol.InvalidEntityDeclarationName"
	public static val INVALID_CLASS_SPECIALIZATION = "br.ufes.inf.nemo.ontol.InvalidClassSpecialization"
	public static val CYCLIC_SPECIALIZATION = "br.ufes.inf.nemo.ontol.CycliSpecialization"
	public static val INVALID_BASETYPE = "br.ufes.inf.nemo.ontol.InvalidBasetype"
	public static val INVALID_POWERTYPE_RELATION = "br.ufes.inf.nemo.ontol.InvalidPowertypeRelation"
	public static val INVALID_SUBORDINATOR = "br.ufes.inf.nemo.ontol.InvalidSubordinator"
	public static val DUPLICATED_ENTITY_NAME = "br.ufes.inf.nemo.ontol.DuplicatedEntityName"
	public static val INVALID_GENERALIZATION_SET_MEMBERS = "br.ufes.inf.nemo.ontol.InvalidGeneralizationSetMembers"
	public static val MISSING_SPECIALIZATION_THROUGH_SUBODINATION = "br.ufes.inf.nemo.ontol.MissingSpecializationThroughSubordination"
	public static val SIMPLE_SUBORDINATION_CYCLE = "br.ufes.inf.nemo.ontol.SimpleSubordinationCycle"
	public static val SPECILIZATION_OF_DISJOINT_CLASSES = "br.ufes.inf.nemo.ontol.SpecializationOfDisjointClasses"
	public static val INSTANCE_OF_DISJOINT_CLASSES = "br.ufes.inf.nemo.ontol.InstanceOfDisjointClasses"
	public static val MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET = "br.ufes.inf.nemo.ontol.MissingInstantiationOfCompleteGeneralizationSet"
	public static val INVALID_MULTIPLICITY = "br.ufes.inf.nemo.ontol.InvalidMultiplicity"
	
	// TODO Update checks table
	public static val NON_CONFORMANT_ASSIGNMENT = "br.ufes.inf.nemo.ontol.NonConformantAssigment"
	
	def isNameValid(EntityDeclaration e){
		if(!e.name.equals(e.name.toFirstLower) || e.eContainer instanceof ComplexDataValue)
			return true
		else 
			return false
	}
	
	def isValidSpecialization(OntoLClass c){
		if(c.superClasses.exists[ it==c ]){
			return false
		} else if(c instanceof OrderlessClass && c.superClasses.exists[ it instanceof OrderedClass ]){
			return false
		} else if(c instanceof FOClass && c.superClasses.exists[ it instanceof HOClass ]){
			return false
		} else if(c instanceof HOClass && c.superClasses.exists[ it instanceof FOClass ]){
			return false
		} else if(c instanceof HOClass){
			return !c.superClasses.exists[
				if(it instanceof HOClass && (it as HOClass).order!=c.order)	true
				else	false ]
		} else {
			return true
		}
	}
	
	def hasCyclicSpecialization(OntoLClass c, Set<OntoLClass> ch){
		if(ch.contains(c)) true		else false
	}
	
	def hasValidBasetype(OntoLClass c){
		// TODO Add conditions for instances of WClass
		val b = c.basetype
		if(b == null)	return true
		else if(c instanceof HOClass){
			if(b instanceof OrderlessClass)
				return false
			else if(c.order == MLTRules.MIN_ORDER){
				if(b instanceof FOClass)	return true
				else	return false
			}
			else if(c.order!=MLTRules.MIN_ORDER && b instanceof HOClass)
				return c.order == (b as HOClass).order+1
		} else {
			return true
		}
	}
	
	def hasValidPowertypeRelation(OntoLClass c){
		// TODO Add conditions for instances of WClass
		val b = c.powertypeOf
		if(b == null)	return true
		else if(c instanceof HOClass){
			if(b instanceof OrderlessClass)
				return false
			else if(c.order == MLTRules.MIN_ORDER){
				if(b instanceof FOClass)	return true
				else	return false
			}
			else if(c.order!=MLTRules.MIN_ORDER && b instanceof HOClass)
				return c.order == (b as HOClass).order+1
		} else {
			return true
		}
	}
	
	def hasValidSubordinators(OntoLClass c){
		// TODO Add conditions for instances of WClass
		if(c instanceof HOClass)
			return !c.subordinators.exists[ 
				if(it==c)	return true
				else if(it instanceof FOClass)	return true
				else if(it instanceof HOClass && (it as HOClass).order != c.order)	return true
				else 	return false
			]
		else
			return true
	}
	
	def duplicatedEntityName(EntityDeclaration e){
		if(e.eContainer instanceof ComplexDataValue)	return false
		
		val model = e.eContainer as Model
		return model.elements.exists[ 
			if(it instanceof EntityDeclaration) it.name.equals(e.name) && it!=e
			else false
		]
	}
	
	def hasValidMembers(GeneralizationSet gs){
		if(gs.specifics.exists[!superClasses.contains(gs.general)])
			return false
		else if(gs.categorizer.basetype!=null && gs.categorizer.basetype!=gs.general)
			return false
		else if(gs.categorizer.basetype!=null && gs.specifics.exists[!instantiatedClasses.contains(gs.categorizer)])
			return false
		else
			return true
	}
	
	def obeysSubordination(OntoLClass c, Set<OntoLClass> ch, Set<OntoLClass> iof){
		val subordinated = new LinkedHashSet<OntoLClass>()
		iof.forEach[if(subordinators!=null) subordinated.addAll(subordinators)]
		if(subordinated.size==0)	return true
		
		val superClassesIof = new LinkedHashSet<OntoLClass>()
		ch.forEach[superClassesIof.addAll(allInstantiatedClasses)]
		return superClassesIof.containsAll(subordinated)
	}
	
	/**
	 * Checked scenarios:
	 * <br> - C is subordinated to itself
	 * <br> - C is subordinated to X, and X is subordinated to C
	 * <br> - C is subordinated to X, but C is a super class to X
	 */
	def hasSimpleSubordinationCycle(OntoLClass c){
		if(c.subordinators==null)	return false
		else return c.subordinators.exists[ sc |
			sc == c || sc?.subordinators.contains(c) || sc.classHierarchy.contains(c)
		]
	}
	
	def ValidationIssue isSpecializingDisjointClasses(OntoLClass c, Set<OntoLClass> ch){
		for(IEObjectDescription obj : c.getVisibleEObjectDescriptions(ModelPackage.eINSTANCE.generalizationSet)){
			var gs = obj.EObjectOrProxy as GeneralizationSet
			if(gs.eIsProxy) gs = c.eResource.resourceSet.getEObject(obj.EObjectURI, true) as GeneralizationSet
			if (gs.isDisjoint && Sets.intersection(ch, gs.specifics.toSet).size > 1){
				val issue = new ValidationWarning
				issue.message = 
					'''«c.name» is specializing disjoint classes.
					«FOR disjoint : Sets.intersection(ch, gs.specifics.toSet)» «(disjoint.eContainer as Model).name».«disjoint.name»; «ENDFOR»).'''
				issue.feature = ModelPackage.eINSTANCE.entityDeclaration_Name
				issue.source = c
				issue.code = SPECILIZATION_OF_DISJOINT_CLASSES
				return issue
			}
		}
		return null
	}
	
	def ValidationIssue isInstanceOfDisjointClasses(EntityDeclaration e, LinkedHashSet<OntoLClass> iof){
		for(IEObjectDescription obj : e.getVisibleEObjectDescriptions(ModelPackage.eINSTANCE.generalizationSet)){
			var gs = obj.EObjectOrProxy as GeneralizationSet
			if(gs.eIsProxy) gs = e.eResource.resourceSet.getEObject(obj.EObjectURI, true) as GeneralizationSet
			
			if (gs.isDisjoint && Sets.intersection(iof, gs.specifics.toSet).size > 1){
				val issue = new ValidationWarning
				issue.message = 
					'''«e.name» is instance disjoint classes.
					«FOR disjoint : Sets.intersection(iof, gs.specifics.toSet)» «(disjoint.eContainer as Model).name».«disjoint.name»; «ENDFOR»).'''
				issue.feature = ModelPackage.eINSTANCE.entityDeclaration_Name
				issue.source = e
				issue.code = INSTANCE_OF_DISJOINT_CLASSES
				return issue
			}
		}
		return null
	}

	def ValidationIssue missingInstantiationByCompleteness(EntityDeclaration e, LinkedHashSet<OntoLClass> iof){
		for(IEObjectDescription obj : e.getVisibleEObjectDescriptions(ModelPackage.eINSTANCE.generalizationSet)){
			var gs = obj.EObjectOrProxy as GeneralizationSet
			if(gs.eIsProxy) gs = e.eResource.resourceSet.getEObject(obj.EObjectURI, true) as GeneralizationSet
			
			if (gs.isIsComplete && iof.contains(gs.general) && Collections.disjoint(gs.specifics.toSet,iof)){
				val issue = new ValidationWarning
				issue.message = 
					'''Missing instantions due to completeness of generalization sets.
					«FOR mustiof : gs.specifics» «(mustiof.eContainer as Model).name».«mustiof.name»; «ENDFOR»).'''
				issue.feature = ModelPackage.eINSTANCE.entityDeclaration_Name
				issue.source = e
				issue.code = MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET
				return issue
			}
		}
		return null
	}	
	
	def dispatch ValidationIssue checkSubsettedMultiplicity(Reference ref){
		if(ref.subsetOf == null)	return null
		val issue = new ValidationError
		issue.source = ref
		issue.code = INVALID_MULTIPLICITY
		for(Reference superRef : ref.subsetOf){
			if(ref.lowerBound < superRef.lowerBound){
				issue.feature = ModelPackage.eINSTANCE.property_LowerBound
				issue.message = 
					'''The cardinality must be as restrictive as the the subsetted one («superRef.name»).'''
				return issue
			} else if(ref.upperBound > superRef.upperBound && superRef.upperBound > 0){
				issue.message = 
					'''The cardinality must be as restrictive as the the subsetted one («superRef.name»).'''
				issue.feature = ModelPackage.eINSTANCE.property_UpperBound
				return issue
			} else if(ref.upperBound==-1 && ref.upperBound!=superRef.upperBound){
				issue.message = 
					'''The cardinality must be as restrictive as the the subsetted one («superRef.name»).'''
				issue.feature = ModelPackage.eINSTANCE.property_UpperBound
				return issue
			}
		}
		return null
	}
	
	def dispatch ValidationIssue checkSubsettedMultiplicity(Attribute att){
		if(att.subsetOf == null)	return null
		val issue = new ValidationError
		issue.source = att
		issue.code = INVALID_MULTIPLICITY
		for(Attribute superAtt : att.subsetOf){
			if(att.lowerBound < superAtt.lowerBound){
				issue.feature = ModelPackage.eINSTANCE.property_LowerBound
				issue.message = 
					'''The cardinality must be as restrictive as the the subsetted one («superAtt.name»).'''
				return issue
			} else if(att.upperBound > superAtt.upperBound && superAtt.upperBound > 0){
				issue.message = 
					'''The cardinality must be as restrictive as the the subsetted one («superAtt.name»).'''
				issue.feature = ModelPackage.eINSTANCE.property_UpperBound
				return issue
			} else if(att.upperBound==-1 && att.upperBound!=superAtt.upperBound){
				issue.message = 
					'''The cardinality must be as restrictive as the the subsetted one («superAtt.name»).'''
				issue.feature = ModelPackage.eINSTANCE.property_UpperBound
				return issue
			}
		}
		return null
	}
	
	def dispatch ValidationIssue checkMultiplicityAndAssignment(ReferenceAssignment ra){
		val nAssgns = ra.assignments?.size
		val ref = ra.reference
		if(nAssgns < ref.lowerBound){
			val issue = new ValidationWarning()
			issue.message = '''Number of assignments must equal or greater than «ref.lowerBound».'''
			issue.source = ra
			issue.feature = ModelPackage.eINSTANCE.referenceAssignment_Assignments
			issue.code = LinguisticRules.INVALID_MULTIPLICITY
			return issue
		}
		else if(nAssgns > ref.upperBound && ref.upperBound > 0){
			val issue = new ValidationWarning()
			issue.message = '''Number of assignments must equal or less than «ref.upperBound».'''
			issue.source = ra
			issue.feature = ModelPackage.eINSTANCE.referenceAssignment_Assignments
			issue.code = LinguisticRules.INVALID_MULTIPLICITY
			return issue
		}
		else
			return null
	}
	
	def dispatch ValidationIssue checkMultiplicityAndAssignment(AttributeAssignment aa){
		val nAssgns = aa.assignments?.size
		val att = aa.attribute

		val issue = new ValidationWarning()
		issue.source = aa
		issue.feature = ModelPackage.eINSTANCE.attributeAssignment_Assignments
		issue.code = LinguisticRules.INVALID_MULTIPLICITY

		if(nAssgns < att.lowerBound){
			issue.message = '''Number of assignments must equal or greater than «att.lowerBound».'''
			return issue
		}
		else if(nAssgns > att.upperBound && att.upperBound > 0){
			issue.message = '''Number of assignments must equal or less than «att.upperBound».'''
			return issue
		}
		else
			return null
	}
	
	def dispatch ValidationIssue checkPropertyAssignmentType(ReferenceAssignment ra){
		val ref = ra.reference
		val assigType = ref.propertyClass
		
		val issue = new ValidationError
		issue.source = ra
		issue.feature = ModelPackage.eINSTANCE.referenceAssignment_Assignments
		
		for(Value v : ra.assignments){
			if(!v.isConformantTo(assigType)){
				issue.message = '''All assignments must be instances of «assigType.name».'''
				issue.index = ra.assignments.indexOf(v)
				issue.code = NON_CONFORMANT_ASSIGNMENT
				return issue
			}
		}
		return null;
	}
	
	def dispatch ValidationIssue checkPropertyAssignmentType(AttributeAssignment aa){
		val att = aa.attribute
		val assigType = att.propertyClass
		
		val issue = new ValidationError
		issue.source = aa
		issue.feature = ModelPackage.eINSTANCE.attributeAssignment_Assignments
		
		for(Value v : aa.assignments){
			if(!v.isConformantTo(assigType)){
				issue.message = '''All assignments must be instances of «assigType.name».'''
				issue.index = aa.assignments.indexOf(v)
				issue.code = NON_CONFORMANT_ASSIGNMENT
				return issue
			}
		}
		return null;
	}
	
}
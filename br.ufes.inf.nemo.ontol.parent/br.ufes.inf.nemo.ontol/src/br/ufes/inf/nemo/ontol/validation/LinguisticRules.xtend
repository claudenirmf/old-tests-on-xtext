package br.ufes.inf.nemo.ontol.validation

import br.ufes.inf.nemo.ontol.model.EntityDeclaration
import br.ufes.inf.nemo.ontol.model.OntoLClass
import br.ufes.inf.nemo.ontol.model.FOClass
import br.ufes.inf.nemo.ontol.model.HOClass
import br.ufes.inf.nemo.ontol.model.OrderedClass
import java.util.LinkedHashSet
import br.ufes.inf.nemo.ontol.model.Model
import br.ufes.inf.nemo.ontol.model.GeneralizationSet
import br.ufes.inf.nemo.ontol.util.OntoLUtils
import com.google.inject.Inject
import br.ufes.inf.nemo.ontol.util.OntoLIndex
import br.ufes.inf.nemo.ontol.model.ModelPackage
import com.google.common.collect.Sets
import java.util.Collections
import br.ufes.inf.nemo.ontol.model.OrderlessClass

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
	
	def isNameValid(EntityDeclaration e){
		if(e.name == e.name.toFirstLower) false		else true
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
	
	def hasCyclicSpecialization(OntoLClass c, LinkedHashSet<OntoLClass> ch){
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
	
	def obeysSubordination(OntoLClass c, LinkedHashSet<OntoLClass> ch, LinkedHashSet<OntoLClass> iof){
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
	
	def isSpecializingDisjointClasses(OntoLClass c, LinkedHashSet<OntoLClass> ch){
		c.getVisibleEObjectDescriptions(ModelPackage.eINSTANCE.generalizationSet)
			.exists[
				val gs = if(it.EObjectOrProxy instanceof GeneralizationSet) it.EObjectOrProxy as GeneralizationSet else null
				if(gs==null || !gs.isDisjoint)	return false
				else if(Sets.intersection(ch,gs?.specifics.toSet).size<2)	return false
				else	return true
			]
	}
	
	def isInstanceOfDisjointClasses(EntityDeclaration e, LinkedHashSet<OntoLClass> iof){
		e.getVisibleEObjectDescriptions(ModelPackage.eINSTANCE.generalizationSet)
			.exists[
				val gs = if(it.EObjectOrProxy instanceof GeneralizationSet) it.EObjectOrProxy as GeneralizationSet else null
				if(gs==null || !gs.isDisjoint || Sets.intersection(gs.specifics.toSet,iof).size<2)
					return false
				return true
			]
	}

	def missingInstantiationByCompleteness(EntityDeclaration e, LinkedHashSet<OntoLClass> iof){
		e.getVisibleEObjectDescriptions(ModelPackage.eINSTANCE.generalizationSet)
			.exists[
				val gs = if(it.EObjectOrProxy instanceof GeneralizationSet) it.EObjectOrProxy as GeneralizationSet else null
				if(gs==null || !gs.isComplete || !iof.contains(gs.general) || !Collections.disjoint(gs.specifics.toSet,iof))
					return false
				return true
			]
	}	
}
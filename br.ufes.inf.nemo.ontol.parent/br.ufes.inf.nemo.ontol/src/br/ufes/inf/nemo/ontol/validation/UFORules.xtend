package br.ufes.inf.nemo.ontol.validation

import br.ufes.inf.nemo.ontol.model.FOClass
import br.ufes.inf.nemo.ontol.model.ModelPackage
import br.ufes.inf.nemo.ontol.model.OntoLClass
import com.google.common.collect.Sets
import java.util.Set
import com.google.inject.Inject
import br.ufes.inf.nemo.ontol.lib.OntoLLib

class UFORules {
	
	@Inject extension OntoLLib

	def ValidationIssue mustInstantiateUFOMetaproperties(FOClass c, 
		Set<OntoLClass> ch,Set<OntoLClass> iof,
		OntoLClass endurant,Set<OntoLClass> mustInstantiate
	){
		if(ch.contains(endurant) && Sets.intersection(iof,mustInstantiate).empty){
			val issue = new ValidationError
			issue.message = '''Every specilization of Endurant must instantiate one of the following classes:
				-«FOR m:mustInstantiate»«m.name» «ENDFOR»'''
			issue.source = c
			issue.feature = ModelPackage.eINSTANCE.entityDeclaration_InstantiatedClasses
			issue.code = OntoLValidator.UFO_A_MISSING_MUST_INSTANTIATION
			return issue
		}
		return null
	}
	
	def ValidationIssue checkSpecializationAndSortality(FOClass c, Set<OntoLClass> ch, Set<OntoLClass> iof,
		OntoLClass mixinclass) {
		if (iof.contains(mixinclass)) {
			val sortalclass = c.getLibClass(OntoLLib.UFO_SORTAL_CLASS)
			val dude = ch.findFirst[instantiatedClasses.contains(sortalclass)]
			if(dude == null) return null

			val issue = new ValidationError
			issue.message = '''Instances of non-soral classes may not specialize the sortal class «dude.name»'''
			issue.source = c
			issue.feature = ModelPackage.eINSTANCE.ontoLClass_SuperClasses
			issue.code = OntoLValidator.UFO_A_ILLEGAL_SORTAL_SPECIALIZATION
			return issue
		}
		return null;
	}
	
	def ValidationIssue checkSpecializationAndRigidity(FOClass c, Set<OntoLClass> ch, Set<OntoLClass> iof,
		OntoLClass rigidclass, OntoLClass semirigidclass) {
		if(iof.contains(rigidclass)){
			val antirigidclass = c.getLibClass(OntoLLib.UFO_ANTI_RIGID_CLASS)
			val dude = ch.findFirst[instantiatedClasses.contains(antirigidclass)]
			if(dude == null) return null
			
			val issue = new ValidationError
			issue.message = '''Instances of rigid classes may not specialize the anti-rigid class «dude.name»'''
			issue.source = c
			issue.feature = ModelPackage.eINSTANCE.ontoLClass_SuperClasses
			issue.code = OntoLValidator.UFO_A_ILLEGAL_RIGID_SPECIALIZATION
			return issue
		}
		else if(iof.contains(semirigidclass)){
			val antirigidclass = c.getLibClass(OntoLLib.UFO_ANTI_RIGID_CLASS)
			val dude = ch.findFirst[instantiatedClasses.contains(antirigidclass)]
			if(dude == null) return null
			
			val issue = new ValidationError
			issue.message = '''Instances of semi-rigid classes may not specialize the anti-rigid class «dude.name»'''
			issue.source = c
			issue.feature = ModelPackage.eINSTANCE.ontoLClass_SuperClasses
			issue.code = OntoLValidator.UFO_A_ILLEGAL_RIGID_SPECIALIZATION
			return issue
		}
		return null
	}
	
}
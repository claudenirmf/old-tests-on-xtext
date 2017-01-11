package br.ufes.inf.nemo.ontol.lib

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.ResourceSet
import br.ufes.inf.nemo.ontol.util.OntoLIndex
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import br.ufes.inf.nemo.ontol.model.ModelPackage
import br.ufes.inf.nemo.ontol.model.OntoLClass

class OntoLLib {
	
	@Inject Provider<ResourceSet> resourceSetProvider
	@Inject extension OntoLIndex
	
	public val static MODEL_DATATYPES = "br/ufes/inf/nemo/ontol/lib/datatypes.ontol"
	public static val DATATYPES_LIB_NAME = "br.ufes.inf.nemo.ontol.lib.datatypes"
	
	public static val DATATYPES_DATATYPE = DATATYPES_LIB_NAME+".Datatype"
	public static val DATATYPES_STRING = DATATYPES_LIB_NAME+".String"
	public static val DATATYPES_NUMBER = DATATYPES_LIB_NAME+".Number"
	public static val DATATYPES_BOOLEAN = DATATYPES_LIB_NAME+".Boolean"
	
	public val static MODEL_UFO_A = "br/ufes/inf/nemo/ontol/lib/ufo-a.ontol"
	public val static UFO_A_LIB_NAME = "br.ufes.inf.nemo.ontol.lib.ufo.a"

	public val static UFO_A_ENDURANT = UFO_A_LIB_NAME+".Endurant"
	public val static UFO_A_SUBSTANTIAL = UFO_A_LIB_NAME+".Substantial"
	public val static UFO_A_MOMENT =  UFO_A_LIB_NAME+".Moment"
	public val static UFO_A_FUNCTIONAL_COMPLEX =  UFO_A_LIB_NAME+".FunctionalComplex"
	public val static UFO_A_COLLECTIVE =  UFO_A_LIB_NAME+".Collective"
	public val static UFO_A_QUANTITY =  UFO_A_LIB_NAME+".Quantity"
	public val static UFO_A_RELATOR =  UFO_A_LIB_NAME+".Relator"
	public val static UFO_A_INTRINSIC_MOMENT =  UFO_A_LIB_NAME+".IntrinsicMoment"
	public val static UFO_A_MODE =  UFO_A_LIB_NAME+".Mode"
	public val static UFO_A_QUALITY =  UFO_A_LIB_NAME+".Quality"

	public val static UFO_A_SORTAL_CLASS =  UFO_A_LIB_NAME+".SortalClass"
	public val static UFO_A_MIXIN_CLASS =  UFO_A_LIB_NAME+".MixinClass"
	public val static UFO_A_RIGID_CLASS =  UFO_A_LIB_NAME+".RigidClass"
	public val static UFO_A_SEMI_RIGID_CLASS =  UFO_A_LIB_NAME+".SemiRigidClass"
	public val static UFO_A_ANTI_RIGID_CLASS =  UFO_A_LIB_NAME+".AntiRigidClass"
	
	public val static UFO_A_RIGID_SORTAL = UFO_A_LIB_NAME + ".RigidSortal"
	public val static UFO_A_ANTI_RIGID_SORTAL = UFO_A_LIB_NAME + ".AntiRigidSortal"
	public val static UFO_A_ANTI_RIGID_MIXIN = UFO_A_LIB_NAME + ".AntiRigidMixin"
	
	public val static UFO_A_KIND = UFO_A_LIB_NAME + ".Kind"
	public val static UFO_A_SUBKIND = UFO_A_LIB_NAME + ".Subkind"
	public val static UFO_A_SORTAL = UFO_A_LIB_NAME + ".Sortal"
	public val static UFO_A_ROLE = UFO_A_LIB_NAME + ".Role"
	public val static UFO_A_PHASE = UFO_A_LIB_NAME + ".Phase"
	public val static UFO_A_CATEGORY = UFO_A_LIB_NAME + ".Category"
	public val static UFO_A_MIXIN = UFO_A_LIB_NAME + ".Mixin"
	public val static UFO_A_ROLE_MIXIN = UFO_A_LIB_NAME + ".RoleMixin"
	public val static UFO_A_PHASE_MIXIN = UFO_A_LIB_NAME + ".PhaseMixin"
	
	def loadLib(String libname) {
		val stream = class.classLoader.getResourceAsStream(libname)
		resourceSetProvider.get => [
			resourceSet |
			val resource = resourceSet.createResource(URI.createURI(libname))
			resource.load(stream, resourceSet.loadOptions)
		]
	}
	
	def loadLib(String libname, ResourceSet rs) {
		val stream = class.classLoader.getResourceAsStream(libname)
		rs => [
			resourceSet |
			val resource = resourceSet.createResource(URI.createURI(libname))
			resource.load(stream, resourceSet.loadOptions)
		]
	}
	
	def loadUFOALib() {
		loadLib(MODEL_UFO_A)
	}
	
	def loadUFOALib(ResourceSet rs) {
		loadLib(MODEL_UFO_A,rs)
	}
	
	def loadDatatypeLib() {
		loadLib(MODEL_DATATYPES)
	}
	
	def loadDatatypeLib(ResourceSet rs) {
		loadLib(MODEL_DATATYPES,rs)
	}
	
	def getLibClass(EObject context, String name){
		return context.getModelElementFromIndex(name, ModelPackage.eINSTANCE.ontoLClass) as OntoLClass
	}

	def getUFOEndurant(EObject context) {
		return context.getModelElementFromIndex(UFO_A_ENDURANT, ModelPackage.eINSTANCE.ontoLClass) as OntoLClass
	}
	
	def getUFOMustInstantiateClasses(EObject context){
		val descs = context.visibleEObjectDescriptions.filter [
			val fqn = qualifiedName.toString
			return fqn.equals(UFO_A_KIND) || fqn.equals(UFO_A_SUBKIND) || fqn.equals(UFO_A_PHASE) ||
				fqn.equals(UFO_A_ROLE) || fqn.equals(UFO_A_CATEGORY) || fqn.equals(UFO_A_MIXIN) ||
				fqn.equals(UFO_A_PHASE_MIXIN) || fqn.equals(UFO_A_ROLE_MIXIN)
		]
		val objs = descs.map [
			var o = EObjectOrProxy
			if(o.eIsProxy)	o = context.eResource.resourceSet.getEObject(EObjectURI, true)
			return o as OntoLClass
		]
		return objs.toSet
	}
	
}

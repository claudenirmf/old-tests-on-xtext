package br.ufes.inf.nemo.ontol.lib

class OntoLLib {
	
//	@Inject Provider<ResourceSet> resourceSetProvider
//	@Inject extension OntoLIndex
	
	public val static UFO_A_LIB = "br/ufes/inf/nemo/ontol/libraries/ufo_a.ontol"
	public static val DATATYPES_LIB_NAME = "ontol.datatypes"
	public val static UFO_A_LIB_NAME = "ontol.ufo.a"
	
	public static val DATATYPES_STRING = DATATYPES_LIB_NAME+".String"
	public static val DATATYPES_INTEGER = DATATYPES_LIB_NAME+".Integer"
	public static val DATATYPES_BOOLEAN = DATATYPES_LIB_NAME+".Boolean"
	
	public val static UFO_A_ENDURANT = UFO_A_LIB_NAME+".Endurant"
	public val static UFO_A_SUBSTANTIAL = UFO_A_LIB_NAME+".Substantial"
	public val static UFO_A_MOMENT =  UFO_A_LIB_NAME+".Moment"
	public val static UFO_A_FUNCTIONAL_COMPLEX =  UFO_A_LIB_NAME+".FunctionalComplex"
	public val static UFO_A_COLLECTIVE =  UFO_A_LIB_NAME+".Collective"
	public val static UFO_A_QUANTITY =  UFO_A_LIB_NAME+".Quantity"
	public val static UFO_A_RELATOR =  UFO_A_LIB_NAME+".Relator"
	public val static UFO_A_MODE =  UFO_A_LIB_NAME+".Mode"
	public val static UFO_A_QUALITY =  UFO_A_LIB_NAME+".Quality"
	
	public val static UFO_A_SORTAL_ENDURANT =  UFO_A_LIB_NAME+".SortalEndurant"
	public val static UFO_A_NONSORTAL_ENDURANT =  UFO_A_LIB_NAME+".NonSortalEndurant"
	public val static UFO_A_RIGID_ENDURANT =  UFO_A_LIB_NAME+".RigidEndurant"
	public val static UFO_A_SEMIRIGID_ENDURANT =  UFO_A_LIB_NAME+".SemiRigidEndurant"
	public val static UFO_A_ANTIRIGID_ENDURANT =  UFO_A_LIB_NAME+".AntiRigidEndurant"
	
	public val static UFO_A_KIND =  UFO_A_LIB_NAME+".Kind"
	public val static UFO_A_SUBKIND =  UFO_A_LIB_NAME+".Subkind"
	public val static UFO_A_PHASE =  UFO_A_LIB_NAME+".Phase"
	public val static UFO_A_ROLE =  UFO_A_LIB_NAME+".Role"
	public val static UFO_A_CATEGORY =  UFO_A_LIB_NAME+".Category"
	public val static UFO_A_MIXIN =  UFO_A_LIB_NAME+".Mixin"
	public val static UFO_A_PHASE_MIXIN =  UFO_A_LIB_NAME+".PhaseMixin"
	public val static UFO_A_ROLE_MIXIN  =  UFO_A_LIB_NAME+".RoleMixin"
	
//	def loadLib() {
//		val stream = class.classLoader.getResourceAsStream(MAIN_LIB)
//		resourceSetProvider.get => [
//			resourceSet |
//			val resource = resourceSet.createResource(URI.createURI(MAIN_LIB))
//			resource.load(stream, resourceSet.loadOptions)
//		]
//	}

//	def getOntoLEndurant(EObject context){
//		val desc = context.visibleTypeDescriptions.findFirst[
//			qualifiedName.toString == UFO_A_ENDURANT
//		]
//		if(desc == null){
//			return null;
//		}
//		var o = desc.EObjectOrProxy
//		if(o.eIsProxy){
//			o = context.eResource.resourceSet
//				.getEObject(desc.EObjectURI, true)
//		}
//		o as Type
//	}
	
}

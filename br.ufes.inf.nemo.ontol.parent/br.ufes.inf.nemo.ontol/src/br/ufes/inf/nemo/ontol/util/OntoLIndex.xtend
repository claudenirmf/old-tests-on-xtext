package br.ufes.inf.nemo.ontol.util

import br.ufes.inf.nemo.ontol.model.OntoLClass
import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider

class OntoLIndex {
	
	@Inject ResourceDescriptionsProvider rdp
	@Inject IContainer.Manager cm
	
	def getVisibleContainers(EObject o){
		val index = rdp.getResourceDescriptions(o.eResource)
		val rd = index.getResourceDescription(o.eResource.URI)
		cm.getVisibleContainers(rd, index)
	}

	def getVisibleEObjectDescriptions(EObject o){
		o.visibleContainers.map[ exportedObjects ].flatten
	}
	
	def getVisibleEObjectDescriptions(EObject o, EClass type){
		o.visibleContainers.map[ getExportedObjectsByType(type)].flatten
	}
	
	def getVisibleEClassDescriptions(EObject o, EClass c){
		o.getVisibleEObjectDescriptions(c)
	}
	
	def getModelElementFromIndex(EObject context, String qualifiedName, EClass modelElementClass){
		val desc = context.getVisibleEObjectDescriptions(modelElementClass)
			.findFirst[ it.qualifiedName.toString == qualifiedName ]
		
		if(desc == null) { return null }
		
		var o = desc.EObjectOrProxy
		if(o.eIsProxy){
			o = context.eResource.resourceSet.getEObject(desc.EObjectURI, true)
		}
		o as OntoLClass
	}
	
}
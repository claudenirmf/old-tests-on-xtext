/*
 * generated by Xtext 2.10.0
 */
package br.ufes.inf.nemo.ontol.generator

import br.ufes.inf.nemo.ontol.model.Model
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.EcoreUtil2

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class OntoLGenerator extends AbstractGenerator {

	def void doGenerate(Resource xtextResource, Resource xmiResource) {
		EcoreUtil.resolveAll(xtextResource)
		xmiResource.contents.add(xtextResource.contents.get(0))
		xmiResource.save(null)
	}

	override void doGenerate(Resource xtextResource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// TODO Make use of the namespace of the modules and create a different URI for xmiResource
		val rs = new ResourceSetImpl
		val fileName = "models\\"+xtextResource.URI.segments.last.replace(".ontol","")+".xmi"
		val xmiResource = rs.createResource(URI.createURI(fileName))
		
		EcoreUtil2.resolveAll(xtextResource)
		val model = xtextResource.contents.get(0) as Model
		val includes = model.includes
		xmiResource.contents.add(model)//.get(0))
		if(includes!=null && includes.size>0)
			xmiResource.contents.addAll(model.includes)
		
		val outStream = new ByteArrayOutputStream
		xmiResource.save(outStream,null)
		fsa.generateFile(fileName,new ByteArrayInputStream(outStream.toByteArray))

//		fsa.generateFile("persisted_models/"+fileName+".xmi",in)
//		for(m : resource.allContents.toIterable.filter[it instanceof Model]){
//			fsa.generateFile("owl/"+m.fullyQualifiedName+".rdf",
//				(m as Model).compile)
//		}
	}
	
	def CharSequence compile(Model m)'''
	<?xml version="1.0"?>
	<rdf:RDF xmlns="http://www.ontol.nemo.inf.ufes.br/#"
		xml:base="http://www.ontol.nemo.inf.ufes.br/"
		xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
		xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
		xmlns:mlt="http://www.nemo.inf.ufes.br/mlt#"
		xmlns:owl="http://www.w3.org/2002/07/owl#"
		xmlns:xsd="http://www.w3.org/2001/XMLSchema#"
		xmlns:ontol="http://www.nemo.inf.ufes.br/ontol-schema#">
		
		<rdf:Description rdf:about="�m.fullyQualifiedName�"/>
	    
	</rdf:RDF>
	'''
}

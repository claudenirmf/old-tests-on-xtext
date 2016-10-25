package br.ufes.inf.nemo.ontol.tests

//import br.ufes.inf.nemo.ontol.model.Model
//import com.google.inject.Inject
//import org.eclipse.xtext.generator.IGenerator2
//import org.eclipse.xtext.generator.IGeneratorContext
//import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
//import org.eclipse.xtext.junit4.util.ParseHelper
//import org.eclipse.xtext.util.CancelIndicator
//import org.junit.Test
import org.junit.runner.RunWith
//import org.eclipse.emf.ecore.resource.ResourceSet
//import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
//import org.eclipse.emf.ecore.resource.Resource
//import org.eclipse.emf.common.util.URI
//import java.util.Collections
//import br.ufes.inf.nemo.ontol.generator.OntoLGenerator
//import java.io.FileOutputStream
//import java.io.FileInputStream
//import java.io.PipedOutputStream
//import java.io.PipedInputStream

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(OntoLInjectorProvider))
class OntoLGeneratorTest {
	
//	@Inject extension ParseHelper<Model>
//	@Inject extension LibraryTest
//	@Inject extension IGenerator2
//	@Inject IGenerator2 gen
//	
//	@Test def void testGenerator(){
//		val model = loadModelText(LibraryTest.UFO_X).parse
//		val fsa =  new InMemoryFileSystemAccess
//		doGenerate(model.eResource,fsa,new IGeneratorContext{
//				override getCancelIndicator() {
//					return CancelIndicator.NullImpl
//				}
//			})
////		val ResourceSet rs = new ResourceSetImpl
////		val Resource r = rs.getResource(URI.createURI("asd"), true);
////		r.load(System.out, Collections.EMPTY_MAP)
////		val Model m = r.contents as Model
//	}
//	
//	@Test def void testGenerator2(){
//		val model = loadModelText(LibraryTest.UFO_X).parse
//		val xmiResource = model.eResource.resourceSet.createResource(URI.createURI("asd.xmi"))
//		
//		(gen as OntoLGenerator).doGenerate(model.eResource,xmiResource)
//		
//		val file = new FileOutputStream("file.xmi")
//		xmiResource.save(file, null)
//		file.close
//
////		val out = new PipedOutputStream()
////		val in = new PipedInputStream()
////		out.connect(in)
////		val sb = new StringBuilder()
////		var int i
////		while((i=in.read)!=-1){
////			sb.append(in.read as char)
////		}
////		println(sb.toString)
//	}
	
}
package br.ufes.inf.nemo.ontol.tests

//import br.ufes.inf.nemo.ontol.model.Model
//import com.google.inject.Inject
//import com.google.inject.Provider
//import java.io.BufferedReader
//import java.io.InputStreamReader
//import org.eclipse.emf.common.util.URI
//import org.eclipse.emf.ecore.resource.ResourceSet
//import org.eclipse.xtext.junit4.util.ParseHelper
//import org.eclipse.xtext.junit4.validation.ValidationTestHelper
//import org.junit.Before
//import org.junit.Test
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(OntoLInjectorProvider))
class LibraryTest {
	
//	@Inject extension ParseHelper<Model>
//	@Inject extension ValidationTestHelper
//	
//	@Inject Provider<ResourceSet> resourceSetProvider
//	
//	protected static val path_prefix = "br/ufes/inf/nemo/ontol/lib/"
//	protected static val UFO_X = path_prefix + "UFO-X Core.ontol"
//	protected static val UFO_A = path_prefix + "UFO-A.ontol"
//	protected static val UFO_B = path_prefix + "UFO-B.ontol"
//	protected static val UFO_C = path_prefix + "UFO-C.ontol"
//	protected static val UFO_S = path_prefix + "UFO-S.ontol"
//
//	private var ResourceSet rs
//	
//	@Before def void intialize(){
//		rs = resourceSetProvider.get
//	}
//	
//	def protected loadModelText(String modelFileName){
//		val inpstr = class.classLoader.getResourceAsStream(modelFileName)
//		val br = new BufferedReader(new InputStreamReader(inpstr))
//		val sb = new StringBuilder
//		
//		try {
//			var String line = null
//			while((line = br.readLine)!=null){
//				sb.append(line+"\n")
//			}
//		} catch (Exception exception) {}
//		return sb
//	}
//	
//	def private void loadModelToResourceSet(String modelName){
//		rs.createResource(URI.createURI(modelName))
//			.load(class.classLoader.getResourceAsStream(modelName),rs.loadOptions)
//	}
//	
//	def private getResourceFromResourceSet(String modelName) {
//		rs.getResource(URI.createURI(modelName),true)
//	}
//	
//	@Test def testUFOXModel(){
//		loadModelText(UFO_X).parse.assertNoErrors
//	}
//	
//	@Test def testUFOAModel(){
//		// TODO Try to use Resource.resolve in the validation in order to get the object instead of its proxy
//		loadModelText(UFO_X).parse(rs)
//		loadModelText(UFO_A).parse(rs).assertNoErrors
//	}
//	
//	@Test def testUFOBModel(){
//		loadModelText(UFO_X).parse(rs)
//		loadModelText(UFO_A).parse(rs)
//		loadModelText(UFO_B).parse(rs).assertNoErrors
//	}
//	
//	@Test def testUFOCModel(){
//		loadModelText(UFO_X).parse(rs)
//		loadModelText(UFO_A).parse(rs)
//		loadModelText(UFO_B).parse(rs)
//		loadModelText(UFO_C).parse(rs).assertNoErrors
//	}
//	
//	@Test def testUFOSModel(){
//		loadModelText(UFO_X).parse(rs)
//		loadModelText(UFO_A).parse(rs)
//		loadModelText(UFO_B).parse(rs)
//		loadModelText(UFO_C).parse(rs)
//		loadModelText(UFO_S).parse(rs).assertNoErrors
//	}
//	
////	@Test def loadUFOCoreFile(){
//////		loadModelText(UFO_X).parse(rs)
////		loadModelToResourceSet(UFO_X)
////		getResourceFromResourceSet(UFO_X).assertNoErrors
////		
////		val m = '''module t { 
////				import nemo.lib.ufo.x.*;
////				class X:WClass specializes WClass;
////			}'''.parse(rs)
////		m.assertNoErrors
////	}
	
}
package br.ufes.inf.nemo.ontol.tests

import br.ufes.inf.nemo.ontol.lib.OntoLLib
import br.ufes.inf.nemo.ontol.model.Model
import br.ufes.inf.nemo.ontol.model.ModelPackage
import br.ufes.inf.nemo.ontol.validation.OntoLValidator
import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(OntoLInjectorProvider))
class LibraryTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	@Inject extension OntoLLib
	
	@Inject Provider<ResourceSet> resourceSetProvider

//	private var ResourceSet rs
	
//	@Before def void intialize(){
//		rs = resourceSetProvider.get
//		rs.loadDatatypeLib
//		rs.loadUFOALib
//	}
	
	def ResourceSet loadResourceSet(){
		val rs = resourceSetProvider.get
		rs.loadDatatypeLib
		rs.loadUFOALib
	}
	
	def includeStatements()'''
		include «OntoLLib.UFO_A_LIB_NAME»;
		include «OntoLLib.DATATYPES_LIB_NAME»;'''
	
	@Test def void testDefaultLibs(){
		val rs = resourceSetProvider.get
		rs.loadDatatypeLib
		rs.loadUFOALib
		rs.resources.forEach[ assertNoErrors ]
	}
	
	@Test def void testMustInstantiate(){
		val rs = loadResourceSet()
		val incorrectModel = '''module t {
				«includeStatements»
				class X specializes «OntoLLib.UFO_A_ENDURANT»;
			}'''.parse(rs)
		incorrectModel.assertError(ModelPackage.eINSTANCE.ontoLClass,OntoLValidator.UFO_A_MISSING_MUST_INSTANTIATION)
		
		val correctModel = '''module t {
				«includeStatements»
				class X : «OntoLLib.UFO_A_KIND» specializes «OntoLLib.UFO_A_ENDURANT»;
			}'''.parse(rs)
		correctModel.assertNoError(OntoLValidator.UFO_A_MISSING_MUST_INSTANTIATION)
	}
	
	@Test def void testCheckSpecializationAndSortality(){
		val rs = loadResourceSet()
		val incorrectModel = '''module t {
				«includeStatements»
				class X : «OntoLLib.UFO_A_SORTAL_CLASS»;
				class Y : «OntoLLib.UFO_A_MIXIN_CLASS» specializes X;
			}'''.parse(rs)
		incorrectModel.assertError(ModelPackage.eINSTANCE.ontoLClass,OntoLValidator.UFO_A_ILLEGAL_SORTAL_SPECIALIZATION)
		
		val correctModel = '''module t {
				«includeStatements»
				class Y : «OntoLLib.UFO_A_MIXIN_CLASS»;
				class X : «OntoLLib.UFO_A_SORTAL_CLASS» specializes Y;
			}'''.parse(rs)
		correctModel.assertNoError(OntoLValidator.UFO_A_ILLEGAL_SORTAL_SPECIALIZATION)
	}
	
	@Test def void testCheckSpecializationAndRigidity(){
		val rs = loadResourceSet()
		val incorrectModel1 = '''module t {
				«includeStatements»
				class Y : «OntoLLib.UFO_A_ANTI_RIGID_CLASS»;
				class X : «OntoLLib.UFO_A_RIGID_CLASS» specializes Y;
			}'''.parse(rs)
		incorrectModel1.assertError(ModelPackage.eINSTANCE.ontoLClass,OntoLValidator.UFO_A_ILLEGAL_RIGID_SPECIALIZATION)
		
		val incorrectModel2 = '''module t {
				«includeStatements»
				class Y : «OntoLLib.UFO_A_ANTI_RIGID_CLASS»;
				class X : «OntoLLib.UFO_A_SEMI_RIGID_CLASS» specializes Y;
			}'''.parse(rs)
		incorrectModel2.assertError(ModelPackage.eINSTANCE.ontoLClass,OntoLValidator.UFO_A_ILLEGAL_RIGID_SPECIALIZATION)
		
		val correctModel = '''module t {
				«includeStatements»
				class Y : «OntoLLib.UFO_A_RIGID_CLASS»;
				class X : «OntoLLib.UFO_A_ANTI_RIGID_CLASS» specializes Y;
			}'''.parse(rs)
		correctModel.assertNoError(OntoLValidator.UFO_A_ILLEGAL_SORTAL_SPECIALIZATION)
	}
	
}
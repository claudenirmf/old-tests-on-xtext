package br.ufes.inf.nemo.ontol.tests

import br.ufes.inf.nemo.ontol.model.Model
import br.ufes.inf.nemo.ontol.model.ModelPackage
import br.ufes.inf.nemo.ontol.model.OntoLClass
import br.ufes.inf.nemo.ontol.util.OntoLUtils
import br.ufes.inf.nemo.ontol.validation.LinguisticRules
import com.google.inject.Inject
import com.google.inject.Provider
import java.util.LinkedHashSet
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import java.util.Set
import br.ufes.inf.nemo.ontol.model.Individual

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(OntoLInjectorProvider))
class OntoLModelUtilTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	@Inject extension OntoLUtils
	@Inject Provider<ResourceSet> rsp
	
	@Test def void testClassHierarchyGetter(){
		val unparssedModel = '''
			module t{
				class A;
				class B specializes A;
				class C specializes A;
				class D specializes B,C;
			}
			'''
		val model = unparssedModel.parse
		model.assertNoErrors
		
		val classes = new BasicEList<OntoLClass>()
		model.elements.forEach[ if(it instanceof OntoLClass) classes.add(it) ]
		var Set<OntoLClass> list = classes.get(3).classHierarchy
//		list.forEach[ println(it.name) ]
		Assert.assertTrue(
			list.contains(classes.get(0))
			&& list.contains(classes.get(1))
			&& list.contains(classes.get(2))
			&& list.size == 3
		)
	}
	
	@Test def void testClassHierarchyCycle(){
		val model = '''
		module t{
			class A specializes B;
			class B specializes A;
		}
		'''.parse
		model.assertError(ModelPackage.eINSTANCE.ontoLClass,LinguisticRules.CYCLIC_SPECIALIZATION)
//		val someType = (model.elements.get(0) as Type)
//		println(someType.name + ".classHierarchy.size = " + someType.classHierarchy.size)
	}
	
	@Test def void testAllInstantiatedClasses(){
		val model = '''
		module t {
			order 2 class A ispowertypeof X;
			
			class X;
			class Y specializes X;
		}
		'''.parse
		
//		val classes = model.elements.filter[ 
//			ModelPackage.eINSTANCE.ontoLClass.isSuperTypeOf(it.eClass)
//		]
//		classes.forEach [
//			var c = it as OntoLClass
//			var iof = c.allInstantiatedClasses
//			println(iof)
//		]
	}
	
}
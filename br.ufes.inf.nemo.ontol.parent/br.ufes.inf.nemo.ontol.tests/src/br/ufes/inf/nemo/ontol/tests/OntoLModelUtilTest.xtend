package br.ufes.inf.nemo.ontol.tests

import br.ufes.inf.nemo.ontol.model.Model
import br.ufes.inf.nemo.ontol.model.ModelPackage
import br.ufes.inf.nemo.ontol.model.OntoLClass
import br.ufes.inf.nemo.ontol.util.OntoLUtils
import br.ufes.inf.nemo.ontol.validation.LinguisticRules
import com.google.inject.Inject
import java.util.Set
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(OntoLInjectorProvider))
class OntoLModelUtilTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	@Inject extension OntoLUtils
	
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
	}
	
	@Test def void testAllInstantiatedClasses(){
		'''
		module t {
			order 2 class A ispowertypeof X;
			
			class X;
			class Y specializes X;
		}
		'''.parse
	}
	
}
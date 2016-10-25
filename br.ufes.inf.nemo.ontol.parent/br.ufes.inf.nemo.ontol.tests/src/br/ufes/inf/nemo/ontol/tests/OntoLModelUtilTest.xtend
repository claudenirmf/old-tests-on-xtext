package br.ufes.inf.nemo.ontol.tests

import br.ufes.inf.nemo.ontol.model.Class
import br.ufes.inf.nemo.ontol.model.Model
import br.ufes.inf.nemo.ontol.model.ModelPackage
import br.ufes.inf.nemo.ontol.util.OntoLUtils
import br.ufes.inf.nemo.ontol.validation.LinguisticRules
import com.google.inject.Inject
import java.util.LinkedHashSet
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
		
		val classes = new BasicEList<Class>()
		model.elements.forEach[ if(it instanceof Class) classes.add(it) ]
		var LinkedHashSet<Class> list = classes.get(3).classHierarchy
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
		module batata{
			class A specializes B;
			class B specializes A;
		}
		'''.parse
		model.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.CYCLIC_SPECIALIZATION)
//		val someType = (model.elements.get(0) as Type)
//		println(someType.name + ".classHierarchy.size = " + someType.classHierarchy.size)
	}
	
//	@Test def void testGetAllReferences(){
//		val model = '''
//		module batata {
//			type A{
//				ref refToA : A
//			};
//			type B specializes A{
//				ref refToB : B
//			};
//			type C specializes A{
//				ref refToC : C
//			};
//			type D specializes B,C{
//				ref refToD : D
//			};
//			individual X iof D{
//				ref refToA = X
//				ref refToB = X
//				ref refToC = X
//				ref refToD = X
//			};
//		}
//		'''.parse
//		model.assertNoErrors()
//		val Individual x = model.elements.filter[it instanceof Individual].get(0) as Individual
//		println(x.name + " is iof " + x.fixedTypes.get(0).name)
//		x.allReferences.forEach[
//			println(it.name + " : " + (it.eContainer as EntityDeclaration).name)
//		]
//		
//	}
	
}
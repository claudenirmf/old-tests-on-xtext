package br.ufes.inf.nemo.ontol.tests

import br.ufes.inf.nemo.ontol.model.Model
import br.ufes.inf.nemo.ontol.model.ModelPackage
import br.ufes.inf.nemo.ontol.validation.LinguisticRules
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(OntoLInjectorProvider))
class LinguistcRulesTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper

	@Test def testIsNameValid(){
		val correctModel = ''' module t { class Abc; }'''.parse
		correctModel.assertNoErrors
		
		val incorrectModel = ''' module t { class abc; }'''.parse
		incorrectModel.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_ENTITY_DECLARATION_NAME)
	}
	
	@Test def testIsValidSpecialization(){
		val incorrectModelA = ''' module t{ class A specializes A; }'''.parse
		incorrectModelA.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_CLASS_SPECIALIZATION)
		
		val incorrectModelB = ''' module t{ hoclass A order 2; foclass B specializes A; }'''.parse
		incorrectModelB.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_CLASS_SPECIALIZATION)
		
		val incorrectModelC = ''' module t{ hoclass A order 2; class B specializes A; }'''.parse
		incorrectModelC.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_CLASS_SPECIALIZATION)
		
		val incorrectModelD = ''' module t{ hoclass A order 2; hoclass B order 3 specializes A; }'''.parse
		incorrectModelD.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_CLASS_SPECIALIZATION)
		
		val correctModel = '''module t {
				class WA; hoclass HA order 2; foclass FA;
				class WB specializes WA;
				hoclass HB order 2 specializes WA, HA;
				foclass FB specializes WA, FA;
			}'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testHasCyclicSpecialization(){
		val incorrectModelA = ''' module t{ class A specializes A; }'''.parse
		incorrectModelA.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.CYCLIC_SPECIALIZATION)
		
		val incorrectModelB = ''' module t{
				class A specializes B;
				class B specializes A;
			}'''.parse
		incorrectModelB.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.CYCLIC_SPECIALIZATION)
	}

	@Test def testHasValidBasetype(){
		// TODO Add tests for WClass scenarios
		val incorrectModelA = '''module t { hoclass A order 2 categorizes B; class B; }'''.parse
		incorrectModelA.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_BASETYPE)
		
		val incorrectModelB = '''module t { hoclass A order 2 categorizes B; hoclass B order 2; }'''.parse
		incorrectModelB.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_BASETYPE)
		
		val incorrectModelC = '''module t { hoclass A order 3 categorizes B; hoclass B order 3; }'''.parse
		incorrectModelC.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_BASETYPE)
		
		val correctModel = '''module t {
				hoclass A order 2 categorizes B; foclass B;
				hoclass C order 3 categorizes D; hoclass D order 2;
			}'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testHasValidPowertypeRelation(){
		// TODO Add tests for WClass scenarios
		val incorrectModelA = '''module t { hoclass A order 2 ispowertypeof B; class B; }'''.parse
		incorrectModelA.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_POWERTYPE_RELATION)
		
		val incorrectModelB = '''module t { hoclass A order 2 ispowertypeof B; hoclass B order 2; }'''.parse
		incorrectModelB.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_POWERTYPE_RELATION)
		
		val incorrectModelC = '''module t { hoclass A order 3 ispowertypeof B; hoclass B order 3; }'''.parse
		incorrectModelC.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_POWERTYPE_RELATION)
		
		val correctModel = '''module t {
				hoclass A order 2 ispowertypeof B; foclass B;
				hoclass C order 3 ispowertypeof D; hoclass D order 2;
			}'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testHasValidSubordinators(){
		// TODO Add tests for WClass scenarios
		val incorrectModelA = '''module t { hoclass A order 2 subordinatedto A; }'''.parse
		incorrectModelA.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_SUBORDINATOR)
		
		val incorrectModelB = '''module t { hoclass A order 2 subordinatedto B; foclass B; }'''.parse
		incorrectModelB.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_SUBORDINATOR)
		
		val incorrectModelC = '''module t { hoclass A order 2 subordinatedto B; hoclass B order 3; }'''.parse
		incorrectModelC.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_SUBORDINATOR)
		
		val correctModel = '''module t {
				hoclass A order 2 subordinatedto B; hoclass B order 2;
			}'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testDuplicatedNames(){
		val incorrectModel = '''module t{ class A; class A; }'''.parse
		incorrectModel.assertError(ModelPackage.eINSTANCE.entityDeclaration,LinguisticRules.DUPLICATED_ENTITY_NAME)
		
		val correctModel = '''module t{ class A; class B; }'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testHasValidMembers() {
		val incorrectModelA = '''module t {
				class A;
				class B specializes A;
				class C;
				genset gs general A specifics B,C;
			}'''.parse
		incorrectModelA.assertError(ModelPackage.eINSTANCE.generalizationSet,
			LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS)
		
		val incorrectModelB = '''module t {
				class A;
				class B specializes A;
				class C specializes A;
				class X categorizes B;
				genset gs general A categorizer X specifics B,C;
			}'''.parse
		incorrectModelB.assertError(ModelPackage.eINSTANCE.generalizationSet,
			LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS)
		
		val incorrectModelC = '''module t {
				class A;
				class B specializes A;
				class C specializes A;
				class X categorizes A;
				genset gs general A categorizer X specifics B,C;
			}'''.parse
		incorrectModelC.assertError(ModelPackage.eINSTANCE.generalizationSet,
			LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS)
		
		val correctModel = '''module t {
				class A;
				class B:X specializes A;
				class C:X specializes A;
				class X categorizes A;
				genset gs general A categorizer X specifics B,C;
			}'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testObeysSubordination(){
		val incorrectModel = '''module t{
				class XA; class XB subordinatedto XA;
				class YA:XA; class YB:XB;
			}'''.parse
		incorrectModel.assertError(ModelPackage.eINSTANCE.class_,
			LinguisticRules.MISSING_SPECIALIZATION_THROUGH_SUBODINATION)
		
		val correctModel = '''module t{
				class XA; class XB subordinatedto XA;
				class YA:XA; class YB:XB specializes YA;
			}'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testHasSimpleSubordinationCycle(){
		val incorrectModelA = '''module t{ class A subordinatedto A; }'''.parse
		incorrectModelA.assertError(ModelPackage.eINSTANCE.class_,
			LinguisticRules.SIMPLE_SUBORDINATION_CYCLE)
		
		val incorrectModelB = '''module t{
				class A subordinatedto B; class B subordinatedto A;
			}'''.parse
		incorrectModelB.assertError(ModelPackage.eINSTANCE.class_,
			LinguisticRules.SIMPLE_SUBORDINATION_CYCLE)
		
		val incorrectModelC = '''module t{
				class A subordinatedto B; class B specializes A;
			}'''.parse
		incorrectModelC.assertError(ModelPackage.eINSTANCE.class_,
			LinguisticRules.SIMPLE_SUBORDINATION_CYCLE)
		
		val correctModel = '''module t{
				class A; class B specializes A subordinatedto A;
			}'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testIsSpecializingDisjointClasses(){
		val incorrectModel = '''module t{
				class A; class B specializes A; class C specializes A;
				(disjoint) genset x general A specifics B,C;
				class D specializes B,C;
			}'''.parse
		incorrectModel.assertError(ModelPackage.eINSTANCE.class_,
			LinguisticRules.SPECILIZATION_OF_DISJOINT_CLASSES)
		
		val correctModel = '''module t{
				class A; class B specializes A; class C specializes A;
				(disjoint) genset x general A specifics B,C;
				class D specializes C;
				class E specializes B;
			}'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testIsInstanceOfDisjointClasses(){
		// TODO Investigate for errors
		val incorrectModel = '''module t{
				class A; class B specializes A; class C specializes A;
				(disjoint) genset a general A specifics B,C;
				individual X:B,C;
			}'''.parse
		incorrectModel.assertError(ModelPackage.eINSTANCE.entityDeclaration,
			LinguisticRules.INSTANCE_OF_DISJOINT_CLASSES)
		
		val correctModel = '''module t{
				class A; class B specializes A; class C specializes A;
				genset a general A specifics B,C;
				individual X:B,C;
			}'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testMissingInstantiationByCompleteness(){
		val incorrectModel = '''module t{
				class A; class B specializes A; class C specializes A;
				(complete) genset a general A specifics B,C;
				individual X:A;
			}'''.parse
		incorrectModel.assertError(ModelPackage.eINSTANCE.entityDeclaration,
			LinguisticRules.MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET)
		
		val correctModel = '''module t{
				class A; class B specializes A; class C specializes A;
				(complete) genset a general A specifics B,C;
				individual X:A,B;
			}'''.parse
		correctModel.assertNoErrors
	}
	
}
package br.ufes.inf.nemo.ontol.tests;

import br.ufes.inf.nemo.ontol.lib.OntoLLib;
import br.ufes.inf.nemo.ontol.model.Model;
import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.tests.OntoLInjectorProvider;
import br.ufes.inf.nemo.ontol.validation.LinguisticRules;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(OntoLInjectorProvider.class)
@SuppressWarnings("all")
public class LinguistcRulesTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private OntoLLib _ontoLLib;
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Test
  public void testIsNameValid() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("module t { class Abc; }");
      final Model correctModel = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(correctModel);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("module t { class abc; }");
      final Model incorrectModel = this._parseHelper.parse(_builder_1);
      EClass _ontoLClass = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModel, _ontoLClass, LinguisticRules.INVALID_ENTITY_DECLARATION_NAME);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIsValidSpecialization() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("module t{ class A specializes A; }");
      final Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _ontoLClass = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModelA, _ontoLClass, LinguisticRules.INVALID_CLASS_SPECIALIZATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("module t{ order 2 class A; class B specializes A; }");
      final Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _ontoLClass_1 = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModelB, _ontoLClass_1, LinguisticRules.INVALID_CLASS_SPECIALIZATION);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(" ");
      _builder_2.append("module t{ order 2 class A; orderless class B specializes A; }");
      final Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _ontoLClass_2 = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModelC, _ontoLClass_2, LinguisticRules.INVALID_CLASS_SPECIALIZATION);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append(" ");
      _builder_3.append("module t{ order 2 class A; order 3 class B specializes A; }");
      final Model incorrectModelD = this._parseHelper.parse(_builder_3);
      EClass _ontoLClass_3 = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModelD, _ontoLClass_3, LinguisticRules.INVALID_CLASS_SPECIALIZATION);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("module t {");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("orderless class WA; order 2 class HA; class FA;");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("orderless class WB specializes WA;");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("order 2 class HB specializes WA, HA;");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("class FB specializes WA, FA;");
      _builder_4.newLine();
      _builder_4.append("\t\t\t");
      _builder_4.append("}");
      final Model correctModel = this._parseHelper.parse(_builder_4);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasCyclicSpecialization() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("module t{ class A specializes A; }");
      final Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _ontoLClass = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModelA, _ontoLClass, LinguisticRules.CYCLIC_SPECIALIZATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A specializes B;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class B specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _ontoLClass_1 = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModelB, _ontoLClass_1, LinguisticRules.CYCLIC_SPECIALIZATION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasValidBasetype() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t { order 2 class A categorizes B; orderless class B; }");
      final Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _ontoLClass = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModelA, _ontoLClass, LinguisticRules.INVALID_BASETYPE);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t { order 2 class A categorizes B; order 2 class B ; }");
      final Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _ontoLClass_1 = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModelB, _ontoLClass_1, LinguisticRules.INVALID_BASETYPE);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t { order 3 class A categorizes B; order 3 class B; }");
      final Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _ontoLClass_2 = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModelC, _ontoLClass_2, LinguisticRules.INVALID_BASETYPE);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t {");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("order 2 class A categorizes B; class B;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("order 3 class C categorizes D; order 2 class D;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t");
      _builder_3.append("}");
      final Model correctModel = this._parseHelper.parse(_builder_3);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasValidPowertypeRelation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t { order 2 class A ispowertypeof B; orderless class B; }");
      final Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _ontoLClass = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModelA, _ontoLClass, LinguisticRules.INVALID_POWERTYPE_RELATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t { order 2 class A ispowertypeof B; order 2 class B; }");
      final Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _ontoLClass_1 = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModelB, _ontoLClass_1, LinguisticRules.INVALID_POWERTYPE_RELATION);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t { order 3 class A ispowertypeof B; order 3 class B; }");
      final Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _ontoLClass_2 = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModelC, _ontoLClass_2, LinguisticRules.INVALID_POWERTYPE_RELATION);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t {");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("order 2 class A ispowertypeof B; class B;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("order 3 class C ispowertypeof D; order 2 class D;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t");
      _builder_3.append("}");
      final Model correctModel = this._parseHelper.parse(_builder_3);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasValidSubordinators() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t { order 2 class A subordinatedto A; }");
      final Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _ontoLClass = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModelA, _ontoLClass, LinguisticRules.INVALID_SUBORDINATOR);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t { order 2 class A subordinatedto B; class B; }");
      final Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _ontoLClass_1 = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModelB, _ontoLClass_1, LinguisticRules.INVALID_SUBORDINATOR);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t { order 2 class A subordinatedto B; order 3 class B; }");
      final Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _ontoLClass_2 = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModelC, _ontoLClass_2, LinguisticRules.INVALID_SUBORDINATOR);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t { order 2 class A subordinatedto B; order 2 class B; }");
      final Model correctModel = this._parseHelper.parse(_builder_3);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicatedNames() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{ class A; class A; }");
      final Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _entityDeclaration = ModelPackage.eINSTANCE.getEntityDeclaration();
      this._validationTestHelper.assertError(incorrectModel, _entityDeclaration, LinguisticRules.DUPLICATED_ENTITY_NAME);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{ class A; class B; }");
      final Model correctModel = this._parseHelper.parse(_builder_1);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasValidMembers() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class B specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class C;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("genset gs general A specifics B,C;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _generalizationSet = ModelPackage.eINSTANCE.getGeneralizationSet();
      this._validationTestHelper.assertError(incorrectModelA, _generalizationSet, 
        LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class B specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class C specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("order 2 class X categorizes B;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("genset gs general A categorizer X specifics B,C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _generalizationSet_1 = ModelPackage.eINSTANCE.getGeneralizationSet();
      this._validationTestHelper.assertError(incorrectModelB, _generalizationSet_1, 
        LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class B specializes A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class C specializes A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("order 2 class X categorizes A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("genset gs general A categorizer X specifics B,C;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("}");
      final Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _generalizationSet_2 = ModelPackage.eINSTANCE.getGeneralizationSet();
      this._validationTestHelper.assertError(incorrectModelC, _generalizationSet_2, 
        LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t {");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("class A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("class B:X specializes A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("class C:X specializes A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("order 2 class X categorizes A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("genset gs general A categorizer X specifics B,C;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t");
      _builder_3.append("}");
      final Model correctModel = this._parseHelper.parse(_builder_3);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testObeysSubordination() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("order 2 class XA; ");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("order 2 class XB subordinatedto XA;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class YA:XA; class YB:XB;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _ontoLClass = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModel, _ontoLClass, 
        LinguisticRules.MISSING_SPECIALIZATION_THROUGH_SUBODINATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("order 2 class XA; order 2 class XB subordinatedto XA;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class YA:XA; class YB:XB specializes YA;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final Model correctModel = this._parseHelper.parse(_builder_1);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasSimpleSubordinationCycle() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{ orderless class A subordinatedto A; }");
      final Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _ontoLClass = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModelA, _ontoLClass, 
        LinguisticRules.SIMPLE_SUBORDINATION_CYCLE);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class A subordinatedto B;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class B subordinatedto A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _ontoLClass_1 = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModelB, _ontoLClass_1, 
        LinguisticRules.SIMPLE_SUBORDINATION_CYCLE);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t{");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("orderless class A subordinatedto B;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("orderless class B specializes A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("}");
      final Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _ontoLClass_2 = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModelC, _ontoLClass_2, 
        LinguisticRules.SIMPLE_SUBORDINATION_CYCLE);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t{");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("orderless class A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("orderless class B specializes A subordinatedto A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t");
      _builder_3.append("}");
      final Model correctModel = this._parseHelper.parse(_builder_3);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIsSpecializingDisjointClasses() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class B specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class C specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("disjoint genset x general A specifics B,C;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class D specializes B,C;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _ontoLClass = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertWarning(incorrectModel, _ontoLClass, 
        LinguisticRules.SPECILIZATION_OF_DISJOINT_CLASSES);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class B specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class C specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("disjoint genset x general A specifics B,C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class D specializes C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class E specializes B;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final Model correctModel = this._parseHelper.parse(_builder_1);
      EClass _ontoLClass_1 = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertNoWarnings(correctModel, _ontoLClass_1, 
        LinguisticRules.SPECILIZATION_OF_DISJOINT_CLASSES);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIsInstanceOfDisjointClasses() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class B specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class C specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("disjoint genset a general A specifics B,C;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual X:B,C;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _entityDeclaration = ModelPackage.eINSTANCE.getEntityDeclaration();
      this._validationTestHelper.assertWarning(incorrectModel, _entityDeclaration, 
        LinguisticRules.INSTANCE_OF_DISJOINT_CLASSES);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class B specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class C specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("genset a general A specifics B,C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("individual X:B,C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final Model correctModel = this._parseHelper.parse(_builder_1);
      EClass _entityDeclaration_1 = ModelPackage.eINSTANCE.getEntityDeclaration();
      this._validationTestHelper.assertNoWarnings(correctModel, _entityDeclaration_1, 
        LinguisticRules.INSTANCE_OF_DISJOINT_CLASSES);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMissingInstantiationByCompleteness() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class B specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class C specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("complete genset a general A specifics B,C;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual X:A;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _entityDeclaration = ModelPackage.eINSTANCE.getEntityDeclaration();
      this._validationTestHelper.assertWarning(incorrectModel, _entityDeclaration, 
        LinguisticRules.MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class B specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class C specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("complete genset a general A specifics B,C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("individual X:A,B;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final Model correctModel = this._parseHelper.parse(_builder_1);
      EClass _entityDeclaration_1 = ModelPackage.eINSTANCE.getEntityDeclaration();
      this._validationTestHelper.assertNoWarnings(correctModel, _entityDeclaration_1, 
        LinguisticRules.MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSubsettedMultiplicity() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("ref refToA : [2..3] A");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("att nickname : [2..3] A");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class B specializes A {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("ref refToB : [1..3] B subsets refToA");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("att nickname2 : [1..3] B subsets nickname");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _reference = ModelPackage.eINSTANCE.getReference();
      this._validationTestHelper.assertError(incorrectModelA, _reference, 
        LinguisticRules.INVALID_MULTIPLICITY);
      EClass _attribute = ModelPackage.eINSTANCE.getAttribute();
      this._validationTestHelper.assertError(incorrectModelA, _attribute, 
        LinguisticRules.INVALID_MULTIPLICITY);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("ref refToA : [2..3] A");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("att nickname : [2..3] A");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("};");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class B specializes A {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("ref refToB : [2..4] B subsets refToA");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("att nickname2 : [2..5] B subsets nickname");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("};");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _reference_1 = ModelPackage.eINSTANCE.getReference();
      this._validationTestHelper.assertError(incorrectModelB, _reference_1, 
        LinguisticRules.INVALID_MULTIPLICITY);
      EClass _attribute_1 = ModelPackage.eINSTANCE.getAttribute();
      this._validationTestHelper.assertError(incorrectModelB, _attribute_1, 
        LinguisticRules.INVALID_MULTIPLICITY);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class A {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("ref refToA : [2..3] A");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("att nickname : [2..3] A");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("};");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class B specializes A {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("ref refToB : [2..2] B subsets refToA");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("att nickname2 : [3..3] B subsets nickname");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("};");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("}");
      final Model correctModel = this._parseHelper.parse(_builder_2);
      this._validationTestHelper.assertNoError(correctModel, LinguisticRules.INVALID_MULTIPLICITY);
      this._validationTestHelper.assertNoError(correctModel, LinguisticRules.INVALID_MULTIPLICITY);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMultiplicityAndAssignment() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class A { ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("ref refToA : [2..3] A");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("att nicknames : [2..3] A\t// This is going to fire other issues not related to multiplicity");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual X : A { ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("ref refToA = X");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("att nicknames = \"John\"");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _referenceAssignment = ModelPackage.eINSTANCE.getReferenceAssignment();
      this._validationTestHelper.assertWarning(incorrectModelA, _referenceAssignment, 
        LinguisticRules.INVALID_MULTIPLICITY);
      EClass _attributeAssignment = ModelPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertWarning(incorrectModelA, _attributeAssignment, 
        LinguisticRules.INVALID_MULTIPLICITY);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A { ");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("ref refToA : [2..3] A");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("att nicknames : [2..3] A\t// This is going to fire other issues not related to multiplicity");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("};");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("individual X : A { ");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("ref refToA = {X,X,X,X}");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("att nicknames = {\"John\",\"Bob\",\"Gary\",\"Nick\"}");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("};");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _referenceAssignment_1 = ModelPackage.eINSTANCE.getReferenceAssignment();
      this._validationTestHelper.assertWarning(incorrectModelB, _referenceAssignment_1, 
        LinguisticRules.INVALID_MULTIPLICITY);
      EClass _attributeAssignment_1 = ModelPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertWarning(incorrectModelB, _attributeAssignment_1, 
        LinguisticRules.INVALID_MULTIPLICITY);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class A { ");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("ref refToA : [2..3] A");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("att nicknames : [2..3] A\t// This is going to fire other issues not related to multiplicity");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("};");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("individual X : A { ");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("ref refToA = {X,X}");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("att nicknames = {\"John\",\"Bob\",\"Gary\"}");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("};");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("}");
      final Model correctModel = this._parseHelper.parse(_builder_2);
      EClass _referenceAssignment_2 = ModelPackage.eINSTANCE.getReferenceAssignment();
      this._validationTestHelper.assertNoWarnings(correctModel, _referenceAssignment_2, 
        LinguisticRules.INVALID_MULTIPLICITY);
      EClass _attributeAssignment_2 = ModelPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertNoWarnings(correctModel, _attributeAssignment_2, 
        LinguisticRules.INVALID_MULTIPLICITY);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCheckPropertyAssignmentType() {
    try {
      final ResourceSet rs = this.resourceSetProvider.get();
      this._ontoLLib.loadDatatypeLib(rs);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("include br.ufes.inf.nemo.ontol.lib.datatypes; import br.ufes.inf.nemo.ontol.lib.datatypes.*;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class Color specializes DataType {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("att red : Number");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("att blue : Number");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("att green : Number");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual Black : Color { att red=0\tatt green=0\tatt blue=0 };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class ColoredObject { att color : [1..2] Color };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual SomeCube : ColoredObject { att color = {[ red=255, green=255, blue=255 ]} };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual OtherCube : ColoredObject { att color = Black };");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model correctModelB = this._parseHelper.parse(_builder, rs);
      EClass _attributeAssignment = ModelPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertNoErrors(correctModelB, _attributeAssignment, 
        LinguisticRules.NON_CONFORMANT_ASSIGNMENT);
      this._validationTestHelper.assertNoErrors(correctModelB);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

package br.ufes.inf.nemo.ontol.tests;

import br.ufes.inf.nemo.ontol.model.Model;
import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.tests.OntoLInjectorProvider;
import br.ufes.inf.nemo.ontol.validation.LinguisticRules;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
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
      EClass _class_ = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModel, _class_, LinguisticRules.INVALID_ENTITY_DECLARATION_NAME);
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
      EClass _class_ = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModelA, _class_, LinguisticRules.INVALID_CLASS_SPECIALIZATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("module t{ hoclass A order 2; foclass B specializes A; }");
      final Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _class__1 = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModelB, _class__1, LinguisticRules.INVALID_CLASS_SPECIALIZATION);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(" ");
      _builder_2.append("module t{ hoclass A order 2; class B specializes A; }");
      final Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _class__2 = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModelC, _class__2, LinguisticRules.INVALID_CLASS_SPECIALIZATION);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append(" ");
      _builder_3.append("module t{ hoclass A order 2; hoclass B order 3 specializes A; }");
      final Model incorrectModelD = this._parseHelper.parse(_builder_3);
      EClass _class__3 = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModelD, _class__3, LinguisticRules.INVALID_CLASS_SPECIALIZATION);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("module t {");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("class WA; hoclass HA order 2; foclass FA;");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("class WB specializes WA;");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("hoclass HB order 2 specializes WA, HA;");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("foclass FB specializes WA, FA;");
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
      EClass _class_ = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModelA, _class_, LinguisticRules.CYCLIC_SPECIALIZATION);
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
      EClass _class__1 = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModelB, _class__1, LinguisticRules.CYCLIC_SPECIALIZATION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasValidBasetype() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t { hoclass A order 2 categorizes B; class B; }");
      final Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _class_ = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModelA, _class_, LinguisticRules.INVALID_BASETYPE);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t { hoclass A order 2 categorizes B; hoclass B order 2; }");
      final Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _class__1 = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModelB, _class__1, LinguisticRules.INVALID_BASETYPE);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t { hoclass A order 3 categorizes B; hoclass B order 3; }");
      final Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _class__2 = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModelC, _class__2, LinguisticRules.INVALID_BASETYPE);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t {");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("hoclass A order 2 categorizes B; foclass B;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("hoclass C order 3 categorizes D; hoclass D order 2;");
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
      _builder.append("module t { hoclass A order 2 ispowertypeof B; class B; }");
      final Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _class_ = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModelA, _class_, LinguisticRules.INVALID_POWERTYPE_RELATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t { hoclass A order 2 ispowertypeof B; hoclass B order 2; }");
      final Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _class__1 = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModelB, _class__1, LinguisticRules.INVALID_POWERTYPE_RELATION);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t { hoclass A order 3 ispowertypeof B; hoclass B order 3; }");
      final Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _class__2 = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModelC, _class__2, LinguisticRules.INVALID_POWERTYPE_RELATION);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t {");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("hoclass A order 2 ispowertypeof B; foclass B;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("hoclass C order 3 ispowertypeof D; hoclass D order 2;");
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
      _builder.append("module t { hoclass A order 2 subordinatedto A; }");
      final Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _class_ = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModelA, _class_, LinguisticRules.INVALID_SUBORDINATOR);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t { hoclass A order 2 subordinatedto B; foclass B; }");
      final Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _class__1 = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModelB, _class__1, LinguisticRules.INVALID_SUBORDINATOR);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t { hoclass A order 2 subordinatedto B; hoclass B order 3; }");
      final Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _class__2 = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModelC, _class__2, LinguisticRules.INVALID_SUBORDINATOR);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t {");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("hoclass A order 2 subordinatedto B; hoclass B order 2;");
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
      _builder_1.append("class X categorizes B;");
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
      _builder_2.append("class X categorizes A;");
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
      _builder_3.append("class X categorizes A;");
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
      _builder.append("class XA; class XB subordinatedto XA;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class YA:XA; class YB:XB;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _class_ = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModel, _class_, 
        LinguisticRules.MISSING_SPECIALIZATION_THROUGH_SUBODINATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class XA; class XB subordinatedto XA;");
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
      _builder.append("module t{ class A subordinatedto A; }");
      final Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _class_ = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModelA, _class_, 
        LinguisticRules.SIMPLE_SUBORDINATION_CYCLE);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A subordinatedto B; class B subordinatedto A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _class__1 = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModelB, _class__1, 
        LinguisticRules.SIMPLE_SUBORDINATION_CYCLE);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t{");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class A subordinatedto B; class B specializes A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("}");
      final Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _class__2 = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModelC, _class__2, 
        LinguisticRules.SIMPLE_SUBORDINATION_CYCLE);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t{");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("class A; class B specializes A subordinatedto A;");
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
      _builder.append("class A; class B specializes A; class C specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("(disjoint) genset x general A specifics B,C;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class D specializes B,C;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _class_ = ModelPackage.eINSTANCE.getClass_();
      this._validationTestHelper.assertError(incorrectModel, _class_, 
        LinguisticRules.SPECILIZATION_OF_DISJOINT_CLASSES);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A; class B specializes A; class C specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("(disjoint) genset x general A specifics B,C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class D specializes C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class E specializes B;");
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
  public void testIsInstanceOfDisjointClasses() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class A; class B specializes A; class C specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("(disjoint) genset a general A specifics B,C;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual X:B,C;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _entityDeclaration = ModelPackage.eINSTANCE.getEntityDeclaration();
      this._validationTestHelper.assertError(incorrectModel, _entityDeclaration, 
        LinguisticRules.INSTANCE_OF_DISJOINT_CLASSES);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A; class B specializes A; class C specializes A;");
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
      this._validationTestHelper.assertNoErrors(correctModel);
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
      _builder.append("class A; class B specializes A; class C specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("(complete) genset a general A specifics B,C;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual X:A;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _entityDeclaration = ModelPackage.eINSTANCE.getEntityDeclaration();
      this._validationTestHelper.assertError(incorrectModel, _entityDeclaration, 
        LinguisticRules.MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A; class B specializes A; class C specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("(complete) genset a general A specifics B,C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("individual X:A,B;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final Model correctModel = this._parseHelper.parse(_builder_1);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

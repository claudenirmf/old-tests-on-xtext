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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field class_ is undefined for the type ModelPackage");
  }
  
  @Test
  public void testIsValidSpecialization() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field class_ is undefined for the type ModelPackage"
      + "\nThe method or field class_ is undefined for the type ModelPackage"
      + "\nThe method or field class_ is undefined for the type ModelPackage"
      + "\nThe method or field class_ is undefined for the type ModelPackage");
  }
  
  @Test
  public void testHasCyclicSpecialization() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field class_ is undefined for the type ModelPackage"
      + "\nThe method or field class_ is undefined for the type ModelPackage");
  }
  
  @Test
  public void testHasValidBasetype() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field class_ is undefined for the type ModelPackage"
      + "\nThe method or field class_ is undefined for the type ModelPackage"
      + "\nThe method or field class_ is undefined for the type ModelPackage");
  }
  
  @Test
  public void testHasValidPowertypeRelation() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field class_ is undefined for the type ModelPackage"
      + "\nThe method or field class_ is undefined for the type ModelPackage"
      + "\nThe method or field class_ is undefined for the type ModelPackage");
  }
  
  @Test
  public void testHasValidSubordinators() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field class_ is undefined for the type ModelPackage"
      + "\nThe method or field class_ is undefined for the type ModelPackage"
      + "\nThe method or field class_ is undefined for the type ModelPackage");
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field class_ is undefined for the type ModelPackage");
  }
  
  @Test
  public void testHasSimpleSubordinationCycle() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field class_ is undefined for the type ModelPackage"
      + "\nThe method or field class_ is undefined for the type ModelPackage"
      + "\nThe method or field class_ is undefined for the type ModelPackage");
  }
  
  @Test
  public void testIsSpecializingDisjointClasses() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field class_ is undefined for the type ModelPackage");
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

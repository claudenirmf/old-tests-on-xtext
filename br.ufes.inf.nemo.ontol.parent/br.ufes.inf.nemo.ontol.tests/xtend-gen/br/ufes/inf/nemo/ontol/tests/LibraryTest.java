package br.ufes.inf.nemo.ontol.tests;

import br.ufes.inf.nemo.ontol.lib.OntoLLib;
import br.ufes.inf.nemo.ontol.model.Model;
import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.tests.OntoLInjectorProvider;
import br.ufes.inf.nemo.ontol.validation.OntoLValidator;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
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
public class LibraryTest {
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
  
  public ResourceSet loadResourceSet() {
    ResourceSet _xblockexpression = null;
    {
      final ResourceSet rs = this.resourceSetProvider.get();
      this._ontoLLib.loadDatatypeLib(rs);
      _xblockexpression = this._ontoLLib.loadUFOALib(rs);
    }
    return _xblockexpression;
  }
  
  public CharSequence includeStatements() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("include ");
    _builder.append(OntoLLib.UFO_A_LIB_NAME, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("include ");
    _builder.append(OntoLLib.DATATYPES_LIB_NAME, "");
    _builder.append(";");
    return _builder;
  }
  
  @Test
  public void testDefaultLibs() {
    final ResourceSet rs = this.resourceSetProvider.get();
    this._ontoLLib.loadDatatypeLib(rs);
    this._ontoLLib.loadUFOALib(rs);
    EList<Resource> _resources = rs.getResources();
    final Consumer<Resource> _function = (Resource it) -> {
      this._validationTestHelper.assertNoErrors(it);
    };
    _resources.forEach(_function);
  }
  
  @Test
  public void testMustInstantiate() {
    try {
      final ResourceSet rs = this.loadResourceSet();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      CharSequence _includeStatements = this.includeStatements();
      _builder.append(_includeStatements, "\t\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      _builder.append("class X specializes ");
      _builder.append(OntoLLib.UFO_A_ENDURANT, "\t\t\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model incorrectModel = this._parseHelper.parse(_builder, rs);
      EClass _ontoLClass = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModel, _ontoLClass, OntoLValidator.UFO_A_MISSING_MUST_INSTANTIATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      CharSequence _includeStatements_1 = this.includeStatements();
      _builder_1.append(_includeStatements_1, "\t\t\t\t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class X : ");
      _builder_1.append(OntoLLib.UFO_A_KIND, "\t\t\t\t");
      _builder_1.append(" specializes ");
      _builder_1.append(OntoLLib.UFO_A_ENDURANT, "\t\t\t\t");
      _builder_1.append(";");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final Model correctModel = this._parseHelper.parse(_builder_1, rs);
      this._validationTestHelper.assertNoError(correctModel, OntoLValidator.UFO_A_MISSING_MUST_INSTANTIATION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCheckSpecializationAndSortality() {
    try {
      final ResourceSet rs = this.loadResourceSet();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      CharSequence _includeStatements = this.includeStatements();
      _builder.append(_includeStatements, "\t\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      _builder.append("class X : ");
      _builder.append(OntoLLib.UFO_A_SORTAL_CLASS, "\t\t\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      _builder.append("class Y : ");
      _builder.append(OntoLLib.UFO_A_MIXIN_CLASS, "\t\t\t\t");
      _builder.append(" specializes X;");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model incorrectModel = this._parseHelper.parse(_builder, rs);
      EClass _ontoLClass = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModel, _ontoLClass, OntoLValidator.UFO_A_ILLEGAL_SORTAL_SPECIALIZATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      CharSequence _includeStatements_1 = this.includeStatements();
      _builder_1.append(_includeStatements_1, "\t\t\t\t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class Y : ");
      _builder_1.append(OntoLLib.UFO_A_MIXIN_CLASS, "\t\t\t\t");
      _builder_1.append(";");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class X : ");
      _builder_1.append(OntoLLib.UFO_A_SORTAL_CLASS, "\t\t\t\t");
      _builder_1.append(" specializes Y;");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final Model correctModel = this._parseHelper.parse(_builder_1, rs);
      this._validationTestHelper.assertNoError(correctModel, OntoLValidator.UFO_A_ILLEGAL_SORTAL_SPECIALIZATION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCheckSpecializationAndRigidity() {
    try {
      final ResourceSet rs = this.loadResourceSet();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      CharSequence _includeStatements = this.includeStatements();
      _builder.append(_includeStatements, "\t\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      _builder.append("class Y : ");
      _builder.append(OntoLLib.UFO_A_ANTI_RIGID_CLASS, "\t\t\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      _builder.append("class X : ");
      _builder.append(OntoLLib.UFO_A_RIGID_CLASS, "\t\t\t\t");
      _builder.append(" specializes Y;");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model incorrectModel1 = this._parseHelper.parse(_builder, rs);
      EClass _ontoLClass = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModel1, _ontoLClass, OntoLValidator.UFO_A_ILLEGAL_RIGID_SPECIALIZATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      CharSequence _includeStatements_1 = this.includeStatements();
      _builder_1.append(_includeStatements_1, "\t\t\t\t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class Y : ");
      _builder_1.append(OntoLLib.UFO_A_ANTI_RIGID_CLASS, "\t\t\t\t");
      _builder_1.append(";");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class X : ");
      _builder_1.append(OntoLLib.UFO_A_SEMI_RIGID_CLASS, "\t\t\t\t");
      _builder_1.append(" specializes Y;");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final Model incorrectModel2 = this._parseHelper.parse(_builder_1, rs);
      EClass _ontoLClass_1 = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModel2, _ontoLClass_1, OntoLValidator.UFO_A_ILLEGAL_RIGID_SPECIALIZATION);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      CharSequence _includeStatements_2 = this.includeStatements();
      _builder_2.append(_includeStatements_2, "\t\t\t\t");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class Y : ");
      _builder_2.append(OntoLLib.UFO_A_RIGID_CLASS, "\t\t\t\t");
      _builder_2.append(";");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class X : ");
      _builder_2.append(OntoLLib.UFO_A_ANTI_RIGID_CLASS, "\t\t\t\t");
      _builder_2.append(" specializes Y;");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t");
      _builder_2.append("}");
      final Model correctModel = this._parseHelper.parse(_builder_2, rs);
      this._validationTestHelper.assertNoError(correctModel, OntoLValidator.UFO_A_ILLEGAL_SORTAL_SPECIALIZATION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

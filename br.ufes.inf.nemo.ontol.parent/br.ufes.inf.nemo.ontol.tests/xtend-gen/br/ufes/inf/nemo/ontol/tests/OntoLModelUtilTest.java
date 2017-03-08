package br.ufes.inf.nemo.ontol.tests;

import br.ufes.inf.nemo.ontol.model.Model;
import br.ufes.inf.nemo.ontol.model.ModelElement;
import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.model.OntoLClass;
import br.ufes.inf.nemo.ontol.tests.OntoLInjectorProvider;
import br.ufes.inf.nemo.ontol.util.OntoLUtils;
import br.ufes.inf.nemo.ontol.validation.LinguisticRules;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(OntoLInjectorProvider.class)
@SuppressWarnings("all")
public class OntoLModelUtilTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private OntoLUtils _ontoLUtils;
  
  @Inject
  private Provider<ResourceSet> rsp;
  
  @Test
  public void testClassHierarchyGetter() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class A;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class B specializes A;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class C specializes A;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class D specializes B,C;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String unparssedModel = _builder.toString();
      final Model model = this._parseHelper.parse(unparssedModel);
      this._validationTestHelper.assertNoErrors(model);
      final BasicEList<OntoLClass> classes = new BasicEList<OntoLClass>();
      EList<ModelElement> _elements = model.getElements();
      final Consumer<ModelElement> _function = (ModelElement it) -> {
        if ((it instanceof OntoLClass)) {
          classes.add(((OntoLClass)it));
        }
      };
      _elements.forEach(_function);
      OntoLClass _get = classes.get(3);
      Set<OntoLClass> list = this._ontoLUtils.classHierarchy(_get);
      boolean _and = false;
      boolean _and_1 = false;
      boolean _and_2 = false;
      OntoLClass _get_1 = classes.get(0);
      boolean _contains = list.contains(_get_1);
      if (!_contains) {
        _and_2 = false;
      } else {
        OntoLClass _get_2 = classes.get(1);
        boolean _contains_1 = list.contains(_get_2);
        _and_2 = _contains_1;
      }
      if (!_and_2) {
        _and_1 = false;
      } else {
        OntoLClass _get_3 = classes.get(2);
        boolean _contains_2 = list.contains(_get_3);
        _and_1 = _contains_2;
      }
      if (!_and_1) {
        _and = false;
      } else {
        int _size = list.size();
        boolean _equals = (_size == 3);
        _and = _equals;
      }
      Assert.assertTrue(_and);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testClassHierarchyCycle() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class A specializes B;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class B specializes A;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model model = this._parseHelper.parse(_builder);
      EClass _ontoLClass = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(model, _ontoLClass, LinguisticRules.CYCLIC_SPECIALIZATION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAllInstantiatedClasses() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("order 2 class A ispowertypeof X;");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class X;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class Y specializes X;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model model = this._parseHelper.parse(_builder);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

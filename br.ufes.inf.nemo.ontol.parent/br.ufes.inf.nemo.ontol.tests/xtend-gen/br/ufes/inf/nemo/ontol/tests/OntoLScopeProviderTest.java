package br.ufes.inf.nemo.ontol.tests;

import br.ufes.inf.nemo.ontol.model.Model;
import br.ufes.inf.nemo.ontol.tests.OntoLInjectorProvider;
import com.google.inject.Inject;
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
public class OntoLScopeProviderTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testPropertyAssigmentScopeForProperty() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("foclass A { a : A };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("foclass B specializes A { a : A };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual Y : B { A.a = Y };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual Z : A { a = Z };");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPropertyScopeForSubesetOf() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("foclass A { a1:A\ta2:A };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("foclass B specializes A { a1:C };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("foclass C specializes B {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("b1:B subsets B.a1");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("b2:B subsets a2");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPropertyScopeForOppositeTo() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("foclass A { ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("a1:A isoppositeto a2");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("a2:A isoppositeto a1");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("c:C isoppositeto a");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("foclass B { c:C };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("foclass C {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("a:A isoppositeto c");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

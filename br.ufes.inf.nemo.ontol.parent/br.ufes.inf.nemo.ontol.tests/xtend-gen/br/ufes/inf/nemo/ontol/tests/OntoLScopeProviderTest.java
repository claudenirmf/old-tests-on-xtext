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
  public void testRefreneceAssigmentScopeForRefrenece() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class A { ref a : A };");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class B specializes A { ref a : A };");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("individual Y : B { ref A.a = Y };");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("individual Z : A { ref a = Z };");
      _builder.newLine();
      _builder.append("}");
      final Model model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRefreneceScopeForSubesetOf() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class A { ref a1:A\tref a2:A };");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class B specializes A { ref a1:C };");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class C specializes B {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ref b1:B subsets B.a1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ref b2:B subsets a2");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("}");
      final Model model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRefreneceScopeForOppositeTo() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class A { ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ref a1:A isOppositeTo a2");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ref a2:A isOppositeTo a1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ref c:C isOppositeTo a");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class B { ref c:C };");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class C { ref a:A isOppositeTo c };");
      _builder.newLine();
      _builder.append("}");
      final Model model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

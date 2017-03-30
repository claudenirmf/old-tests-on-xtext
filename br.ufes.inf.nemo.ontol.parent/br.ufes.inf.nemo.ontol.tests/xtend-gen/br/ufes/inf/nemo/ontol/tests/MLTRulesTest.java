package br.ufes.inf.nemo.ontol.tests;

import br.ufes.inf.nemo.ontol.model.Model;
import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.tests.OntoLInjectorProvider;
import br.ufes.inf.nemo.ontol.validation.MLTRules;
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
public class MLTRulesTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testIsMissingSpecializationThroughPowertype() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("order 2 class HA isPowertypeOf FA;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class FA;\tclass FB : HA;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _ontoLClass = ModelPackage.eINSTANCE.getOntoLClass();
      this._validationTestHelper.assertError(incorrectModel, _ontoLClass, MLTRules.MISSING_SPECIALIZATION_THROUGH_POWERTYPE);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("order 2 class HA isPowertypeOf FA;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class FA;\t\tclass FB : HA specializes FA;");
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

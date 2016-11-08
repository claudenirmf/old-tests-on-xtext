package br.ufes.inf.nemo.ontol.tests;

import br.ufes.inf.nemo.ontol.model.Model;
import br.ufes.inf.nemo.ontol.tests.OntoLInjectorProvider;
import com.google.inject.Inject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field class_ is undefined for the type ModelPackage");
  }
}

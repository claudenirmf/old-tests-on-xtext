package br.ufes.inf.nemo.ontol.tests;

import br.ufes.inf.nemo.ontol.model.Model;
import br.ufes.inf.nemo.ontol.tests.OntoLInjectorProvider;
import br.ufes.inf.nemo.ontol.util.OntoLUtils;
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
  
  @Test
  public void testClassHierarchyGetter() {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Class to OntoLClass"
      + "\nType mismatch: cannot convert from LinkedHashSet<OntoLClass> to LinkedHashSet<Class>"
      + "\nIncompatible conditional operand types ModelElement and Class");
  }
  
  @Test
  public void testClassHierarchyCycle() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field class_ is undefined for the type ModelPackage");
  }
}

/**
 * generated by Xtext 2.10.0
 */
package br.ufes.inf.nemo.ontol;

import br.ufes.inf.nemo.ontol.AbstractOntoLRuntimeModule;
import br.ufes.inf.nemo.ontol.util.OntoLValueConverter;
import org.eclipse.xtext.conversion.IValueConverterService;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class OntoLRuntimeModule extends AbstractOntoLRuntimeModule {
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return OntoLValueConverter.class;
  }
}

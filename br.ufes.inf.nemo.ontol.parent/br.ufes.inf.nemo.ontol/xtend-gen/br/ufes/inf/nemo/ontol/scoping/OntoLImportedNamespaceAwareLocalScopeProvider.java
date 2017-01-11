package br.ufes.inf.nemo.ontol.scoping;

import br.ufes.inf.nemo.ontol.lib.OntoLLib;
import java.util.List;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class OntoLImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  @Override
  protected List<ImportNormalizer> getImplicitImports(final boolean ignoreCase) {
    QualifiedName _create = QualifiedName.create(OntoLLib.UFO_A_LIB_NAME, "ontol");
    ImportNormalizer _importNormalizer = new ImportNormalizer(_create, true, ignoreCase);
    QualifiedName _create_1 = QualifiedName.create(OntoLLib.DATATYPES_LIB_NAME, "ontol");
    ImportNormalizer _importNormalizer_1 = new ImportNormalizer(_create_1, true, ignoreCase);
    return CollectionLiterals.<ImportNormalizer>newArrayList(_importNormalizer, _importNormalizer_1);
  }
}

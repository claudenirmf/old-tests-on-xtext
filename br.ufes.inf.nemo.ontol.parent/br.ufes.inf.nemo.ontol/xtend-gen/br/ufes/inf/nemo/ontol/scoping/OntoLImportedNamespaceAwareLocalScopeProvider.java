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
    QualifiedName _create = QualifiedName.create(OntoLLib.UFO_BASE_LIB, "ontol");
    ImportNormalizer _importNormalizer = new ImportNormalizer(_create, true, ignoreCase);
    QualifiedName _create_1 = QualifiedName.create(OntoLLib.UFO_ENDURANT_LIB, "ontol");
    ImportNormalizer _importNormalizer_1 = new ImportNormalizer(_create_1, true, ignoreCase);
    QualifiedName _create_2 = QualifiedName.create(OntoLLib.UFO_META_LIB, "ontol");
    ImportNormalizer _importNormalizer_2 = new ImportNormalizer(_create_2, true, ignoreCase);
    QualifiedName _create_3 = QualifiedName.create(OntoLLib.DATATYPES_LIB, "ontol");
    ImportNormalizer _importNormalizer_3 = new ImportNormalizer(_create_3, true, ignoreCase);
    return CollectionLiterals.<ImportNormalizer>newArrayList(_importNormalizer, _importNormalizer_1, _importNormalizer_2, _importNormalizer_3);
  }
}

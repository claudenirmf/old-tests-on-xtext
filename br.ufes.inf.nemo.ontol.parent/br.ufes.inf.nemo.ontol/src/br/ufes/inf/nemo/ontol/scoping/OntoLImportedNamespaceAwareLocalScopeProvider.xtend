package br.ufes.inf.nemo.ontol.scoping

import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.naming.QualifiedName
import br.ufes.inf.nemo.ontol.lib.OntoLLib

class OntoLImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
	
	
	// TODO Implement automated library import
	override protected getImplicitImports(boolean ignoreCase) {
		return newArrayList(
			new ImportNormalizer(QualifiedName.create(OntoLLib.UFO_BASE_LIB,"ontol"), true, ignoreCase),
			new ImportNormalizer(QualifiedName.create(OntoLLib.UFO_ENDURANT_LIB,"ontol"), true, ignoreCase),
			new ImportNormalizer(QualifiedName.create(OntoLLib.UFO_META_LIB,"ontol"), true, ignoreCase),
			new ImportNormalizer(QualifiedName.create(OntoLLib.DATATYPES_LIB,"ontol"), true, ignoreCase))}
	
}
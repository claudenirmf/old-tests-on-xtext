package br.ufes.inf.nemo.ontol.scoping

import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

class OntoLImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
	
	
	// TODO Implement automated library import
//	override protected getImplicitImports(boolean ignoreCase) {
//		val List<ImportNormalizer> list = newArrayList()
//		list.add(new ImportNormalizer(QualifiedName.create(OntoLLib.UFO_A_LIB_NAME),true,ignoreCase))
//		list.add(new ImportNormalizer(QualifiedName.create(OntoLLib.DATATYPES_LIB_NAME),true,ignoreCase))
//		return list
//	}
	
}
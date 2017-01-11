package br.ufes.inf.nemo.ontol.scoping

import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.naming.QualifiedName
import br.ufes.inf.nemo.ontol.lib.OntoLLib

class OntoLImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
	
	
	// TODO Implement automated library import
	override protected getImplicitImports(boolean ignoreCase) {
//		val List<ImportNormalizer> list = newArrayList()
//		list.add(new ImportNormalizer(QualifiedName.create(OntoLLib.UFO_A_LIB_NAME),true,ignoreCase))
//		list.add(new ImportNormalizer(QualifiedName.create(OntoLLib.DATATYPES_LIB_NAME),true,ignoreCase))
//		return list
		return newArrayList(
			new ImportNormalizer(QualifiedName.create(OntoLLib.UFO_A_LIB_NAME,"ontol"), true, ignoreCase),
			new ImportNormalizer(QualifiedName.create(OntoLLib.DATATYPES_LIB_NAME,"ontol"), true, ignoreCase))
	}
	
}
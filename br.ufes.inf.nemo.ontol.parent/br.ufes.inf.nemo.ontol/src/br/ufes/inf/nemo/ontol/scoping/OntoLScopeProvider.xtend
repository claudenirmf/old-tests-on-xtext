/*
 * generated by Xtext 2.10.0
 */
package br.ufes.inf.nemo.ontol.scoping

import br.ufes.inf.nemo.ontol.model.Attribute
import br.ufes.inf.nemo.ontol.model.AttributeAssignment
import br.ufes.inf.nemo.ontol.model.EntityDeclaration
import br.ufes.inf.nemo.ontol.model.ModelPackage
import br.ufes.inf.nemo.ontol.model.OntoLClass
import br.ufes.inf.nemo.ontol.model.Reference
import br.ufes.inf.nemo.ontol.model.ReferenceAssignment
import br.ufes.inf.nemo.ontol.util.OntoLUtils
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class OntoLScopeProvider extends AbstractOntoLScopeProvider {

	@Inject extension OntoLUtils
	
	override getScope(EObject context, EReference reference){
		if(context instanceof AttributeAssignment && reference == ModelPackage.eINSTANCE.attributeAssignment_Attribute){
			return getScopeForAttributeAssignmentOnAttributeAssignment_Attribute(context,reference)
		} 
		else if(context instanceof ReferenceAssignment && reference == ModelPackage.eINSTANCE.referenceAssignment_Reference){
			return getScopeForReferenceAssignmentOnReferenceAssignment_Reference(context,reference)
		} 
		else if(context instanceof Attribute && reference == ModelPackage.eINSTANCE.attribute_SubsetOf){
			return getScopeForAttributeOnAttribute_SubsetOf(context,reference)
		} 
		else if(context instanceof Reference && reference == ModelPackage.eINSTANCE.reference_SubsetOf){
			return getScopeForReferenceOnReference_SubsetOf(context,reference)
		}
		else if(context instanceof Reference && reference==ModelPackage.eINSTANCE.reference_OppositeTo){
			return getScopeForReferenceOnReference_OppositeTo(context,reference)
		}
		else return super.getScope(context, reference)
	}
	
	def private IScope getScopeForAttributeAssignmentOnAttributeAssignment_Attribute(EObject context, EReference reference){
		// TODO Add options to scope
		val entity = context.eContainer as EntityDeclaration
		val attributes = entity.allAttributes
		return Scopes.scopeFor(attributes, [ att |
			if (attributes.exists[it.name.equals(att.name) && it != att])
				return QualifiedName.create((att.eContainer as EntityDeclaration).name, att.name)
			else
				return QualifiedName.create(att.name)
		], Scopes.scopeFor(entity.attAssignments))
	}
	
	def private IScope getScopeForReferenceAssignmentOnReferenceAssignment_Reference(EObject context, EReference reference){
		// TODO Add options to scope
		val entity = context.eContainer as EntityDeclaration
		val references = entity.allReferences
		return Scopes.scopeFor(references, [ ref |
			if (references.exists[it.name.equals(ref.name) && it != ref])
				return QualifiedName.create((ref.eContainer as EntityDeclaration).name, ref.name)
			else
				return QualifiedName.create(ref.name)
		], Scopes.scopeFor(entity.refAssignments))
	}
	
	def private IScope getScopeForAttributeOnAttribute_SubsetOf(EObject context, EReference reference){
		val c = context.eContainer as OntoLClass
		val inheritedAtts = c.allInheritedAttributes
		return Scopes.scopeFor(inheritedAtts, [ att |
			if (inheritedAtts.exists[it.name.equals(att.name) && it != att])
				return QualifiedName.create((att.eContainer as EntityDeclaration).name, att.name)
			else
				return QualifiedName.create(att.name)
		], Scopes.scopeFor(c.attributes))
	}
	
	def private IScope getScopeForReferenceOnReference_SubsetOf(EObject context, EReference reference){
		val c = context.eContainer as OntoLClass
		val inheritedRefs = c.allInheritedReferences
		return Scopes.scopeFor(inheritedRefs, [ ref |
			if (inheritedRefs.exists[it.name.equals(ref.name) && it != ref])
				return QualifiedName.create((ref.eContainer as EntityDeclaration).name, ref.name)
			else
				return QualifiedName.create(ref.name)
		], Scopes.scopeFor(c.references))
	}
	
	def getScopeForReferenceOnReference_OppositeTo(EObject context, EReference reference) {
		val c = context.eContainer as OntoLClass
		val ref = context as Reference
		return Scopes.scopeFor(ref.propertyClass.references.filter[it.propertyClass==c],
			[ QualifiedName.create(it.name) ], Scopes.scopeFor(c.references))
	}
	
}

/**
 * Auxiliary methods for enable navigation and checking through OntoL Models.
 * 
 * @author Claudenir Fonseca
 */
package br.ufes.inf.nemo.ontol.util

import br.ufes.inf.nemo.ontol.model.OntoLClass
import br.ufes.inf.nemo.ontol.model.EntityDeclaration
import br.ufes.inf.nemo.ontol.model.Property
import br.ufes.inf.nemo.ontol.model.Attribute
import java.util.LinkedHashSet
import br.ufes.inf.nemo.ontol.model.Model
import br.ufes.inf.nemo.ontol.model.Include
import br.ufes.inf.nemo.ontol.model.ModelElement
import java.util.Set
import br.ufes.inf.nemo.ontol.model.Reference

class OntoLUtils {

	def getRechableModels(ModelElement elem){
		(elem.eContainer as Model).elements.filter[it instanceof Include].map [(it as Include).include]
	}

	/** 
	 * Returns a set of all super types of the given <b>type</b>. The set does not
	 * include the <b>type</b> unless it is in a specialization cycle.
	 * 
	 * @author Claudenir Fonseca
	 */
	def LinkedHashSet<OntoLClass> classHierarchy(OntoLClass c) {
		val visited = new LinkedHashSet<OntoLClass>()
		c.classHierarchy(visited)
	}

	def private LinkedHashSet<OntoLClass> classHierarchy(OntoLClass c, LinkedHashSet<OntoLClass> visited) {
		for (current : c.superClasses) {
			if (!visited.contains(current)) {
				visited.add(current)
				visited.addAll(current.classHierarchy(visited))
			}
		}
		visited
	}

	/**
	 * Returns a set containing the basic instantiated types of a given <b>entity</b>. It includes 
	 * direct declared fixed instantiations and indirectly instantiated powertypes.
	 * <br><br>
	 * ALERT: This method is SLOW, because it searches powertypes through the index.
	 * 
	 * @author Claudenir Fonseca
	 */
	def getBasicInstantiatedClasses(EntityDeclaration e) {
		val basicInstantiatedClasses = new LinkedHashSet<OntoLClass>()
		basicInstantiatedClasses.addAll(e.instantiatedClasses)
		
		if(e instanceof OntoLClass) {
			val includedModels = e.rechableModels
			val possiblePowertypes = includedModels.map[
				elements.filter [
					if(it instanceof OntoLClass) powertypeOf != null else false
				]
			]
			val ch = e.classHierarchy
			possiblePowertypes.forEach [
				val pwt = it as OntoLClass
				if (ch.contains(pwt.powertypeOf))
					basicInstantiatedClasses.add(pwt)
			]
		} else {
			return basicInstantiatedClasses
		} 
//
//		if (e instanceof OntoLClass) {
//			val ch = e.classHierarchy
//			// TODO check every use of EObjectDescription
//			e.visibleEObjectDescriptions.forEach [
//				val c = if(it.getEClass instanceof OntoLClass) it.getEClass as OntoLClass else null
//				if (c!=null && c.powertypeOf != null && ch.contains(c.powertypeOf))
//					basicFixedTypes.add(c as OntoLClass)
//			]
//			return basicFixedTypes
//		} else if(e instanceof Individual) return basicFixedTypes
	}

	/**
	 * Returns a set containing all types instantiated by a given <b>entity</b>.
	 * <br><br>
	 * ALERT: This method is SLOW, because it searches powertypes through the index.
	 * 
	 * @author Claudenir Fonseca
	 */
	def getAllInstantiatedClasses(EntityDeclaration e) {
		val visited = new LinkedHashSet<OntoLClass>()
		e.basicInstantiatedClasses.forEach [
			visited.add(it)
			visited.addAll(it.classHierarchy)
		]
		visited
	}

	/**
	 * Returns a set containing all properties of a given <b>entity</b>.
	 * <br><br>
	 * ALERT: This method is SLOW, because it searches powertypes through the index.
	 * 
	 * @author Claudenir Fonseca
	 */
	def Set<Property> getAllProperties(EntityDeclaration e) {
		throw new Exception("Stop using getAllProperties()")
//		val properties = new LinkedHashSet<Property>()
//		e.allFixedTypes.forEach [ properties.addAll(it.props) ]
//		return properties
	}
	
	def getAllAttributes(EntityDeclaration e) {
		val attributes = new LinkedHashSet<Attribute>()
		e.allInstantiatedClasses.forEach [ attributes.addAll(it.attributes) ]
		return attributes
	}
	
	def getAllReferences(EntityDeclaration e) {
		val references = new LinkedHashSet<Reference>()
		e.allInstantiatedClasses.forEach [ references.addAll(it.references) ]
		return references
	}

	/**
	 * Returns a set containing all inherited properties of a given <b>type<b>.
	 * 
	 * @author Claudenir Fonseca
	 */
	def Set<Property> getAllInheritedProperties(OntoLClass c) {
		throw new Exception("Stop using getAllProperties()")
//		c.classHierarchy.map[props].flatten.toSet
	}
	
	def getAllInheritedAttributes(OntoLClass c) {
		c.classHierarchy.map[attributes].flatten.toSet
	}
	
	def getAllInheritedReferences(OntoLClass c) {
		c.classHierarchy.map[references].flatten.toSet
	}

	/**
	 * Checks if an <b>assignment</b> conforms to a given <b>type</b>.
	 * 
	 * @author Claudenir Fonseca
	 */
//	def boolean isConformantTo(Value assignment, Type type) {
//		if (assignment instanceof ReferenceValue) {
//			if (assignment.value == null || !assignment.value.allFixedTypesList.contains(type)) {
//				return false
//			} else {
//				return true
//			}
//		} else if (assignment instanceof ListValue) {
//			return !assignment.value.exists[!it.isConformantTo(type)]
//		} else if (assignment instanceof StringValue && type.getTypeFromIndex(OntoLLib.DATATYPES_STRING) == type) {
//			return true
//		} else if (assignment instanceof NumberValue && type.getTypeFromIndex(OntoLLib.DATATYPES_INTEGER) == type) {
//			return true
//		} else if (assignment instanceof BooleanValue && type.getTypeFromIndex(OntoLLib.DATATYPES_BOOLEAN) == type) {
//			return true
//		} else if (assignment instanceof NoneValue) {
//			return true
//		} else {
//			return false
//		}
//	}

}

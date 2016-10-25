/**
 * Auxiliary methods for enable navigation and checking through OntoL Models.
 * 
 * @author Claudenir Fonseca
 */
package br.ufes.inf.nemo.ontol.util

import br.ufes.inf.nemo.ontol.model.Class
import br.ufes.inf.nemo.ontol.model.EntityDeclaration
import br.ufes.inf.nemo.ontol.model.Individual
import br.ufes.inf.nemo.ontol.model.Property
import com.google.inject.Inject
import java.util.LinkedHashSet

class OntoLUtils {

	@Inject extension OntoLIndex

	/**
	 * Minimum order of a high-order type.
	 * 
	 * @author Claudenir Fonseca
	 */
	public static val HO_TYPE_MIN_ORDER = 2

	/** 
	 * Returns a set of all super types of the given <b>type</b>. The set does not
	 * include the <b>type</b> unless it is in a specialization cycle.
	 * 
	 * @author Claudenir Fonseca
	 */
	def LinkedHashSet<Class> classHierarchy(Class c) {
		val visited = new LinkedHashSet<Class>()
		c.classHierarchy(visited)
	}

	def private LinkedHashSet<Class> classHierarchy(Class c, LinkedHashSet<Class> visited) {
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
	def getBasicFixedTypes(EntityDeclaration e) {
		val basicFixedTypes = new LinkedHashSet<Class>()
		basicFixedTypes.addAll(e.fixedTypes)

		if (e instanceof Class) {
			val ch = e.classHierarchy
			// TODO check every use of EObjectDescription
			e.visibleEObjectDescriptions.forEach [
				val c = if(it.getEClass instanceof Class) it.getEClass as Class else null
				if (c!=null && c.powertypeOf != null && ch.contains(c.powertypeOf))
					basicFixedTypes.add(c as Class)
			]
			return basicFixedTypes
		} else if(e instanceof Individual) return basicFixedTypes
	}

	/**
	 * Returns a set containing all types instantiated by a given <b>entity</b>.
	 * <br><br>
	 * ALERT: This method is SLOW, because it searches powertypes through the index.
	 * 
	 * @author Claudenir Fonseca
	 */
	def getAllFixedTypes(EntityDeclaration e) {
		val visited = new LinkedHashSet<Class>()
		e.basicFixedTypes.forEach [
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
	def getAllProperties(EntityDeclaration e) {
		val properties = new LinkedHashSet<Property>()
		e.allFixedTypes.forEach [ properties.addAll(it.props) ]
		return properties
	}

	/**
	 * Returns a set containing all inherited properties of a given <b>type<b>.
	 * 
	 * @author Claudenir Fonseca
	 */
	def getAllInheritedProperties(Class c) {
		c.classHierarchy.map[props].flatten.toSet
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

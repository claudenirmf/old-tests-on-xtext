/**
 */
package br.ufes.inf.nemo.ontol.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Categorization Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getCategorizationType()
 * @model
 * @generated
 */
public enum CategorizationType implements Enumerator {
	/**
	 * The '<em><b>CATEGORIZER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATEGORIZER_VALUE
	 * @generated
	 * @ordered
	 */
	CATEGORIZER(0, "CATEGORIZER", "categorizes"),

	/**
	 * The '<em><b>DISJOINT CATEGORIZER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISJOINT_CATEGORIZER_VALUE
	 * @generated
	 * @ordered
	 */
	DISJOINT_CATEGORIZER(0, "DISJOINT_CATEGORIZER", "disjointCategorizes"),

	/**
	 * The '<em><b>COMPLETE CATEGORIZER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_CATEGORIZER_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETE_CATEGORIZER(0, "COMPLETE_CATEGORIZER", "completeCategorizes"),

	/**
	 * The '<em><b>PARTITIONER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTITIONER_VALUE
	 * @generated
	 * @ordered
	 */
	PARTITIONER(0, "PARTITIONER", "partitions");

	/**
	 * The '<em><b>CATEGORIZER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CATEGORIZER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CATEGORIZER
	 * @model literal="categorizes"
	 * @generated
	 * @ordered
	 */
	public static final int CATEGORIZER_VALUE = 0;

	/**
	 * The '<em><b>DISJOINT CATEGORIZER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISJOINT CATEGORIZER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISJOINT_CATEGORIZER
	 * @model literal="disjointCategorizes"
	 * @generated
	 * @ordered
	 */
	public static final int DISJOINT_CATEGORIZER_VALUE = 0;

	/**
	 * The '<em><b>COMPLETE CATEGORIZER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPLETE CATEGORIZER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_CATEGORIZER
	 * @model literal="completeCategorizes"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE_CATEGORIZER_VALUE = 0;

	/**
	 * The '<em><b>PARTITIONER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARTITIONER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTITIONER
	 * @model literal="partitions"
	 * @generated
	 * @ordered
	 */
	public static final int PARTITIONER_VALUE = 0;

	/**
	 * An array of all the '<em><b>Categorization Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CategorizationType[] VALUES_ARRAY =
		new CategorizationType[] {
			CATEGORIZER,
			DISJOINT_CATEGORIZER,
			COMPLETE_CATEGORIZER,
			PARTITIONER,
		};

	/**
	 * A public read-only list of all the '<em><b>Categorization Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CategorizationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Categorization Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CategorizationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CategorizationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Categorization Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CategorizationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CategorizationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Categorization Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CategorizationType get(int value) {
		switch (value) {
			case CATEGORIZER_VALUE: return CATEGORIZER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CategorizationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CategorizationType

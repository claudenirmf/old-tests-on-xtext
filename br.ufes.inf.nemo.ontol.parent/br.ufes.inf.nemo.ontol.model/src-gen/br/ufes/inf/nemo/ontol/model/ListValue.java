/**
 */
package br.ufes.inf.nemo.ontol.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.ListValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getListValue()
 * @model
 * @generated
 */
public interface ListValue extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ontol.model.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getListValue_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%br.ufes.inf.nemo.ontol.model.Value%>> _value = this.getValue();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_value, null);\nif (_equals)\n{\n\treturn 0;\n}\nelse\n{\n\t<%org.eclipse.emf.common.util.EList%><<%br.ufes.inf.nemo.ontol.model.Value%>> _value_1 = this.getValue();\n\treturn _value_1.size();\n}'"
	 * @generated
	 */
	int getNumber();

} // ListValue

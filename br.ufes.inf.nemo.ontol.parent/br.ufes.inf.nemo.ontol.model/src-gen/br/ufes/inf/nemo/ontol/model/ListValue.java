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
 *   <li>{@link br.ufes.inf.nemo.ontol.model.ListValue#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getListValue()
 * @model
 * @generated
 */
public interface ListValue extends Value {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ontol.model.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getListValue_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%br.ufes.inf.nemo.ontol.model.Value%>> _values = this.getValues();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_values, null);\nif (_equals)\n{\n\treturn 0;\n}\n<%org.eclipse.emf.common.util.EList%><<%br.ufes.inf.nemo.ontol.model.Value%>> _values_1 = this.getValues();\nint count = _values_1.size();\n<%org.eclipse.emf.common.util.EList%><<%br.ufes.inf.nemo.ontol.model.Value%>> _values_2 = this.getValues();\nfor (final <%br.ufes.inf.nemo.ontol.model.Value%> v : _values_2)\n{\n\tint _count = count;\n\tint _nAssignments = v.getNAssignments();\n\tcount = (_count + _nAssignments);\n}\nreturn count;'"
	 * @generated
	 */
	int getNAssignments();

} // ListValue

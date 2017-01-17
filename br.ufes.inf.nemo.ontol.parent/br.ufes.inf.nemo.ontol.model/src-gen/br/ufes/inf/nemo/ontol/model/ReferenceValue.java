/**
 */
package br.ufes.inf.nemo.ontol.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.ReferenceValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getReferenceValue()
 * @model
 * @generated
 */
public interface ReferenceValue extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(EntityDeclaration)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getReferenceValue_Value()
	 * @model
	 * @generated
	 */
	EntityDeclaration getValue();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.ReferenceValue#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EntityDeclaration value);

} // ReferenceValue

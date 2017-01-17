/**
 */
package br.ufes.inf.nemo.ontol.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Data Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.ComplexDataValue#getValue <em>Value</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.ComplexDataValue#getUnnamedValue <em>Unnamed Value</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getComplexDataValue()
 * @model
 * @generated
 */
public interface ComplexDataValue extends DataValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Individual)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getComplexDataValue_Value()
	 * @model
	 * @generated
	 */
	Individual getValue();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.ComplexDataValue#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Individual value);

	/**
	 * Returns the value of the '<em><b>Unnamed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unnamed Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unnamed Value</em>' containment reference.
	 * @see #setUnnamedValue(Individual)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getComplexDataValue_UnnamedValue()
	 * @model containment="true"
	 * @generated
	 */
	Individual getUnnamedValue();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.ComplexDataValue#getUnnamedValue <em>Unnamed Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unnamed Value</em>' containment reference.
	 * @see #getUnnamedValue()
	 * @generated
	 */
	void setUnnamedValue(Individual value);

} // ComplexDataValue

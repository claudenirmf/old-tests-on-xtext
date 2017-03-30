/**
 */
package br.ufes.inf.nemo.ontol.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.Property#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.Property#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.Property#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.Property#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.Property#getRegularity <em>Regularity</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.Property#getRegularityType <em>Regularity Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.Property#getRegulatedProperty <em>Regulated Property</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getProperty_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(Integer)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getProperty_LowerBound()
	 * @model default="1" unique="false"
	 * @generated
	 */
	Integer getLowerBound();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.Property#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(Integer value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(Integer)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getProperty_UpperBound()
	 * @model default="1" unique="false"
	 * @generated
	 */
	Integer getUpperBound();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.Property#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Integer value);

	/**
	 * Returns the value of the '<em><b>Property Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Type</em>' reference.
	 * @see #setPropertyType(OntoLClass)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getProperty_PropertyType()
	 * @model
	 * @generated
	 */
	OntoLClass getPropertyType();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.Property#getPropertyType <em>Property Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Type</em>' reference.
	 * @see #getPropertyType()
	 * @generated
	 */
	void setPropertyType(OntoLClass value);

	/**
	 * Returns the value of the '<em><b>Regularity</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regularity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regularity</em>' attribute.
	 * @see #setRegularity(Boolean)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getProperty_Regularity()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getRegularity();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.Property#getRegularity <em>Regularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regularity</em>' attribute.
	 * @see #getRegularity()
	 * @generated
	 */
	void setRegularity(Boolean value);

	/**
	 * Returns the value of the '<em><b>Regularity Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.ontol.model.RegularityPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regularity Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regularity Type</em>' attribute.
	 * @see br.ufes.inf.nemo.ontol.model.RegularityPropertyType
	 * @see #setRegularityType(RegularityPropertyType)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getProperty_RegularityType()
	 * @model unique="false"
	 * @generated
	 */
	RegularityPropertyType getRegularityType();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.Property#getRegularityType <em>Regularity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regularity Type</em>' attribute.
	 * @see br.ufes.inf.nemo.ontol.model.RegularityPropertyType
	 * @see #getRegularityType()
	 * @generated
	 */
	void setRegularityType(RegularityPropertyType value);

	/**
	 * Returns the value of the '<em><b>Regulated Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulated Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulated Property</em>' reference.
	 * @see #setRegulatedProperty(Property)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getProperty_RegulatedProperty()
	 * @model
	 * @generated
	 */
	Property getRegulatedProperty();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.Property#getRegulatedProperty <em>Regulated Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulated Property</em>' reference.
	 * @see #getRegulatedProperty()
	 * @generated
	 */
	void setRegulatedProperty(Property value);

} // Property

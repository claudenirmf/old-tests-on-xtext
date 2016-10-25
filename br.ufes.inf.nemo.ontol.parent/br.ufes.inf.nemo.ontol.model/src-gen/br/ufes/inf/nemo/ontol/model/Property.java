/**
 */
package br.ufes.inf.nemo.ontol.model;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link br.ufes.inf.nemo.ontol.model.Property#getSubsetOf <em>Subset Of</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.Property#getOppositeTo <em>Opposite To</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.Property#getClassContainer <em>Class Container</em>}</li>
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
	 * @see #setPropertyType(br.ufes.inf.nemo.ontol.model.Class)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getProperty_PropertyType()
	 * @model
	 * @generated
	 */
	br.ufes.inf.nemo.ontol.model.Class getPropertyType();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.Property#getPropertyType <em>Property Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Type</em>' reference.
	 * @see #getPropertyType()
	 * @generated
	 */
	void setPropertyType(br.ufes.inf.nemo.ontol.model.Class value);

	/**
	 * Returns the value of the '<em><b>Subset Of</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ontol.model.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subset Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subset Of</em>' reference list.
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getProperty_SubsetOf()
	 * @model
	 * @generated
	 */
	EList<Property> getSubsetOf();

	/**
	 * Returns the value of the '<em><b>Opposite To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite To</em>' reference.
	 * @see #setOppositeTo(Property)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getProperty_OppositeTo()
	 * @model
	 * @generated
	 */
	Property getOppositeTo();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.Property#getOppositeTo <em>Opposite To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite To</em>' reference.
	 * @see #getOppositeTo()
	 * @generated
	 */
	void setOppositeTo(Property value);

	/**
	 * Returns the value of the '<em><b>Class Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.ontol.model.Class#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Container</em>' container reference.
	 * @see #setClassContainer(br.ufes.inf.nemo.ontol.model.Class)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getProperty_ClassContainer()
	 * @see br.ufes.inf.nemo.ontol.model.Class#getProps
	 * @model opposite="props" transient="false"
	 * @generated
	 */
	br.ufes.inf.nemo.ontol.model.Class getClassContainer();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.Property#getClassContainer <em>Class Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Container</em>' container reference.
	 * @see #getClassContainer()
	 * @generated
	 */
	void setClassContainer(br.ufes.inf.nemo.ontol.model.Class value);

} // Property

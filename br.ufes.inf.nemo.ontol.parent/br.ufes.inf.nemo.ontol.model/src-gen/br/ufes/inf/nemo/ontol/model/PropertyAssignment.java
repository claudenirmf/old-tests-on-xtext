/**
 */
package br.ufes.inf.nemo.ontol.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.PropertyAssignment#getProperty <em>Property</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.PropertyAssignment#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.PropertyAssignment#getClassContainer <em>Class Container</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getPropertyAssignment()
 * @model
 * @generated
 */
public interface PropertyAssignment extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getPropertyAssignment_Property()
	 * @model
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.PropertyAssignment#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' containment reference.
	 * @see #setAssignment(Value)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getPropertyAssignment_Assignment()
	 * @model containment="true"
	 * @generated
	 */
	Value getAssignment();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.PropertyAssignment#getAssignment <em>Assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment</em>' containment reference.
	 * @see #getAssignment()
	 * @generated
	 */
	void setAssignment(Value value);

	/**
	 * Returns the value of the '<em><b>Class Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.ontol.model.EntityDeclaration#getPropAssigns <em>Prop Assigns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Container</em>' container reference.
	 * @see #setClassContainer(EntityDeclaration)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getPropertyAssignment_ClassContainer()
	 * @see br.ufes.inf.nemo.ontol.model.EntityDeclaration#getPropAssigns
	 * @model opposite="propAssigns" transient="false"
	 * @generated
	 */
	EntityDeclaration getClassContainer();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.PropertyAssignment#getClassContainer <em>Class Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Container</em>' container reference.
	 * @see #getClassContainer()
	 * @generated
	 */
	void setClassContainer(EntityDeclaration value);

} // PropertyAssignment

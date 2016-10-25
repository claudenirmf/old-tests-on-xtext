/**
 */
package br.ufes.inf.nemo.ontol.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.EntityDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.EntityDeclaration#getFixedTypes <em>Fixed Types</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.EntityDeclaration#getPropAssigns <em>Prop Assigns</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getEntityDeclaration()
 * @model
 * @generated
 */
public interface EntityDeclaration extends ModelElement {
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
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getEntityDeclaration_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.EntityDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fixed Types</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ontol.model.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Types</em>' reference list.
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getEntityDeclaration_FixedTypes()
	 * @model
	 * @generated
	 */
	EList<br.ufes.inf.nemo.ontol.model.Class> getFixedTypes();

	/**
	 * Returns the value of the '<em><b>Prop Assigns</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ontol.model.PropertyAssignment}.
	 * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.ontol.model.PropertyAssignment#getClassContainer <em>Class Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prop Assigns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop Assigns</em>' containment reference list.
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getEntityDeclaration_PropAssigns()
	 * @see br.ufes.inf.nemo.ontol.model.PropertyAssignment#getClassContainer
	 * @model opposite="classContainer" containment="true"
	 * @generated
	 */
	EList<PropertyAssignment> getPropAssigns();

} // EntityDeclaration

/**
 */
package br.ufes.inf.nemo.ontol.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Onto LClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.OntoLClass#getSuperClasses <em>Super Classes</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.OntoLClass#getPowertypeOf <em>Powertype Of</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.OntoLClass#getBasetype <em>Basetype</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.OntoLClass#getSubordinators <em>Subordinators</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.OntoLClass#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.OntoLClass#getReferences <em>References</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.OntoLClass#getCategorizationType <em>Categorization Type</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getOntoLClass()
 * @model abstract="true"
 * @generated
 */
public interface OntoLClass extends EntityDeclaration {
	/**
	 * Returns the value of the '<em><b>Super Classes</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ontol.model.OntoLClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Classes</em>' reference list.
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getOntoLClass_SuperClasses()
	 * @model
	 * @generated
	 */
	EList<OntoLClass> getSuperClasses();

	/**
	 * Returns the value of the '<em><b>Powertype Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powertype Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powertype Of</em>' reference.
	 * @see #setPowertypeOf(OntoLClass)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getOntoLClass_PowertypeOf()
	 * @model
	 * @generated
	 */
	OntoLClass getPowertypeOf();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.OntoLClass#getPowertypeOf <em>Powertype Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powertype Of</em>' reference.
	 * @see #getPowertypeOf()
	 * @generated
	 */
	void setPowertypeOf(OntoLClass value);

	/**
	 * Returns the value of the '<em><b>Basetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basetype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basetype</em>' reference.
	 * @see #setBasetype(OntoLClass)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getOntoLClass_Basetype()
	 * @model
	 * @generated
	 */
	OntoLClass getBasetype();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.OntoLClass#getBasetype <em>Basetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basetype</em>' reference.
	 * @see #getBasetype()
	 * @generated
	 */
	void setBasetype(OntoLClass value);

	/**
	 * Returns the value of the '<em><b>Subordinators</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ontol.model.OntoLClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subordinators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subordinators</em>' reference list.
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getOntoLClass_Subordinators()
	 * @model
	 * @generated
	 */
	EList<OntoLClass> getSubordinators();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ontol.model.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getOntoLClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ontol.model.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getOntoLClass_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Categorization Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.ontol.model.CategorizationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorization Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorization Type</em>' attribute.
	 * @see br.ufes.inf.nemo.ontol.model.CategorizationType
	 * @see #setCategorizationType(CategorizationType)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getOntoLClass_CategorizationType()
	 * @model unique="false"
	 * @generated
	 */
	CategorizationType getCategorizationType();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.OntoLClass#getCategorizationType <em>Categorization Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorization Type</em>' attribute.
	 * @see br.ufes.inf.nemo.ontol.model.CategorizationType
	 * @see #getCategorizationType()
	 * @generated
	 */
	void setCategorizationType(CategorizationType value);

} // OntoLClass

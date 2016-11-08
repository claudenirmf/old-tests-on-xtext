/**
 */
package br.ufes.inf.nemo.ontol.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.Class#getSuperClasses <em>Super Classes</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.Class#getPowertypeOf <em>Powertype Of</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.Class#getBasetype <em>Basetype</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.Class#getSubordinators <em>Subordinators</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.Class#getCatType <em>Cat Type</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getClass_()
 * @model abstract="true"
 * @generated
 */
public interface Class extends EntityDeclaration {
	/**
	 * Returns the value of the '<em><b>Super Classes</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ontol.model.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Classes</em>' reference list.
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getClass_SuperClasses()
	 * @model
	 * @generated
	 */
	EList<Class> getSuperClasses();

	/**
	 * Returns the value of the '<em><b>Powertype Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powertype Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powertype Of</em>' reference.
	 * @see #setPowertypeOf(Class)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getClass_PowertypeOf()
	 * @model
	 * @generated
	 */
	Class getPowertypeOf();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.Class#getPowertypeOf <em>Powertype Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powertype Of</em>' reference.
	 * @see #getPowertypeOf()
	 * @generated
	 */
	void setPowertypeOf(Class value);

	/**
	 * Returns the value of the '<em><b>Basetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basetype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basetype</em>' reference.
	 * @see #setBasetype(Class)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getClass_Basetype()
	 * @model
	 * @generated
	 */
	Class getBasetype();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.Class#getBasetype <em>Basetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basetype</em>' reference.
	 * @see #getBasetype()
	 * @generated
	 */
	void setBasetype(Class value);

	/**
	 * Returns the value of the '<em><b>Subordinators</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ontol.model.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subordinators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subordinators</em>' reference list.
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getClass_Subordinators()
	 * @model
	 * @generated
	 */
	EList<Class> getSubordinators();

	/**
	 * Returns the value of the '<em><b>Cat Type</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.ontol.model.CategorizationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cat Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cat Type</em>' attribute.
	 * @see br.ufes.inf.nemo.ontol.model.CategorizationType
	 * @see #setCatType(CategorizationType)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getClass_CatType()
	 * @model default="none" unique="false"
	 * @generated
	 */
	CategorizationType getCatType();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.Class#getCatType <em>Cat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cat Type</em>' attribute.
	 * @see br.ufes.inf.nemo.ontol.model.CategorizationType
	 * @see #getCatType()
	 * @generated
	 */
	void setCatType(CategorizationType value);

} // Class

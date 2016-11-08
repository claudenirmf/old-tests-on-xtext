/**
 */
package br.ufes.inf.nemo.ontol.model;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.Attribute#getSubsetOf <em>Subset Of</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.Attribute#getOppositeTo <em>Opposite To</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Property {

	/**
	 * Returns the value of the '<em><b>Subset Of</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ontol.model.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subset Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subset Of</em>' reference list.
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getAttribute_SubsetOf()
	 * @model
	 * @generated
	 */
	EList<Attribute> getSubsetOf();

	/**
	 * Returns the value of the '<em><b>Opposite To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite To</em>' reference.
	 * @see #setOppositeTo(Attribute)
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#getAttribute_OppositeTo()
	 * @model
	 * @generated
	 */
	Attribute getOppositeTo();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ontol.model.Attribute#getOppositeTo <em>Opposite To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite To</em>' reference.
	 * @see #getOppositeTo()
	 * @generated
	 */
	void setOppositeTo(Attribute value);
} // Attribute

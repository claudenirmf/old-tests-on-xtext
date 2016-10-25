/**
 */
package br.ufes.inf.nemo.ontol.model.impl;

import br.ufes.inf.nemo.ontol.model.EntityDeclaration;
import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.model.PropertyAssignment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.EntityDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.EntityDeclarationImpl#getFixedTypes <em>Fixed Types</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.EntityDeclarationImpl#getPropAssigns <em>Prop Assigns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityDeclarationImpl extends ModelElementImpl implements EntityDeclaration {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFixedTypes() <em>Fixed Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<br.ufes.inf.nemo.ontol.model.Class> fixedTypes;

	/**
	 * The cached value of the '{@link #getPropAssigns() <em>Prop Assigns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropAssigns()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyAssignment> propAssigns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ENTITY_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY_DECLARATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<br.ufes.inf.nemo.ontol.model.Class> getFixedTypes() {
		if (fixedTypes == null) {
			fixedTypes = new EObjectResolvingEList<br.ufes.inf.nemo.ontol.model.Class>(br.ufes.inf.nemo.ontol.model.Class.class, this, ModelPackage.ENTITY_DECLARATION__FIXED_TYPES);
		}
		return fixedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyAssignment> getPropAssigns() {
		if (propAssigns == null) {
			propAssigns = new EObjectContainmentWithInverseEList<PropertyAssignment>(PropertyAssignment.class, this, ModelPackage.ENTITY_DECLARATION__PROP_ASSIGNS, ModelPackage.PROPERTY_ASSIGNMENT__CLASS_CONTAINER);
		}
		return propAssigns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ENTITY_DECLARATION__PROP_ASSIGNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPropAssigns()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ENTITY_DECLARATION__PROP_ASSIGNS:
				return ((InternalEList<?>)getPropAssigns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ENTITY_DECLARATION__NAME:
				return getName();
			case ModelPackage.ENTITY_DECLARATION__FIXED_TYPES:
				return getFixedTypes();
			case ModelPackage.ENTITY_DECLARATION__PROP_ASSIGNS:
				return getPropAssigns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ENTITY_DECLARATION__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.ENTITY_DECLARATION__FIXED_TYPES:
				getFixedTypes().clear();
				getFixedTypes().addAll((Collection<? extends br.ufes.inf.nemo.ontol.model.Class>)newValue);
				return;
			case ModelPackage.ENTITY_DECLARATION__PROP_ASSIGNS:
				getPropAssigns().clear();
				getPropAssigns().addAll((Collection<? extends PropertyAssignment>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.ENTITY_DECLARATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.ENTITY_DECLARATION__FIXED_TYPES:
				getFixedTypes().clear();
				return;
			case ModelPackage.ENTITY_DECLARATION__PROP_ASSIGNS:
				getPropAssigns().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.ENTITY_DECLARATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.ENTITY_DECLARATION__FIXED_TYPES:
				return fixedTypes != null && !fixedTypes.isEmpty();
			case ModelPackage.ENTITY_DECLARATION__PROP_ASSIGNS:
				return propAssigns != null && !propAssigns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EntityDeclarationImpl

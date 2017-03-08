/**
 */
package br.ufes.inf.nemo.ontol.model.impl;

import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.model.OntoLClass;
import br.ufes.inf.nemo.ontol.model.Property;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.PropertyImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.PropertyImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.PropertyImpl#getRegularity <em>Regularity</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.PropertyImpl#getPropertyClass <em>Property Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends ModelElementImpl implements Property {
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
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_BOUND_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Integer lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPPER_BOUND_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Integer upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegularity() <em>Regularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegularity()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REGULARITY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getRegularity() <em>Regularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegularity()
	 * @generated
	 * @ordered
	 */
	protected Boolean regularity = REGULARITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPropertyClass() <em>Property Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyClass()
	 * @generated
	 * @ordered
	 */
	protected OntoLClass propertyClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(Integer newLowerBound) {
		Integer oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(Integer newUpperBound) {
		Integer oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRegularity() {
		return regularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegularity(Boolean newRegularity) {
		Boolean oldRegularity = regularity;
		regularity = newRegularity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY__REGULARITY, oldRegularity, regularity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoLClass getPropertyClass() {
		if (propertyClass != null && propertyClass.eIsProxy()) {
			InternalEObject oldPropertyClass = (InternalEObject)propertyClass;
			propertyClass = (OntoLClass)eResolveProxy(oldPropertyClass);
			if (propertyClass != oldPropertyClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PROPERTY__PROPERTY_CLASS, oldPropertyClass, propertyClass));
			}
		}
		return propertyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoLClass basicGetPropertyClass() {
		return propertyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyClass(OntoLClass newPropertyClass) {
		OntoLClass oldPropertyClass = propertyClass;
		propertyClass = newPropertyClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY__PROPERTY_CLASS, oldPropertyClass, propertyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PROPERTY__NAME:
				return getName();
			case ModelPackage.PROPERTY__LOWER_BOUND:
				return getLowerBound();
			case ModelPackage.PROPERTY__UPPER_BOUND:
				return getUpperBound();
			case ModelPackage.PROPERTY__REGULARITY:
				return getRegularity();
			case ModelPackage.PROPERTY__PROPERTY_CLASS:
				if (resolve) return getPropertyClass();
				return basicGetPropertyClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.PROPERTY__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.PROPERTY__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case ModelPackage.PROPERTY__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case ModelPackage.PROPERTY__REGULARITY:
				setRegularity((Boolean)newValue);
				return;
			case ModelPackage.PROPERTY__PROPERTY_CLASS:
				setPropertyClass((OntoLClass)newValue);
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
			case ModelPackage.PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.PROPERTY__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case ModelPackage.PROPERTY__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case ModelPackage.PROPERTY__REGULARITY:
				setRegularity(REGULARITY_EDEFAULT);
				return;
			case ModelPackage.PROPERTY__PROPERTY_CLASS:
				setPropertyClass((OntoLClass)null);
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
			case ModelPackage.PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.PROPERTY__LOWER_BOUND:
				return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
			case ModelPackage.PROPERTY__UPPER_BOUND:
				return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
			case ModelPackage.PROPERTY__REGULARITY:
				return REGULARITY_EDEFAULT == null ? regularity != null : !REGULARITY_EDEFAULT.equals(regularity);
			case ModelPackage.PROPERTY__PROPERTY_CLASS:
				return propertyClass != null;
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
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(", regularity: ");
		result.append(regularity);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl

/**
 */
package br.ufes.inf.nemo.ontol.model.impl;

import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.model.OntoLClass;
import br.ufes.inf.nemo.ontol.model.Property;
import br.ufes.inf.nemo.ontol.model.RegularityPropertyType;

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
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.PropertyImpl#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.PropertyImpl#getRegularity <em>Regularity</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.PropertyImpl#getRegularityType <em>Regularity Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.PropertyImpl#getRegulatedProperty <em>Regulated Property</em>}</li>
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
	 * The cached value of the '{@link #getPropertyType() <em>Property Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyType()
	 * @generated
	 * @ordered
	 */
	protected OntoLClass propertyType;

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
	 * The default value of the '{@link #getRegularityType() <em>Regularity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegularityType()
	 * @generated
	 * @ordered
	 */
	protected static final RegularityPropertyType REGULARITY_TYPE_EDEFAULT = RegularityPropertyType.DETERMINES_MAX_VALUE;

	/**
	 * The cached value of the '{@link #getRegularityType() <em>Regularity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegularityType()
	 * @generated
	 * @ordered
	 */
	protected RegularityPropertyType regularityType = REGULARITY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegulatedProperty() <em>Regulated Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatedProperty()
	 * @generated
	 * @ordered
	 */
	protected Property regulatedProperty;

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
	public OntoLClass getPropertyType() {
		if (propertyType != null && propertyType.eIsProxy()) {
			InternalEObject oldPropertyType = (InternalEObject)propertyType;
			propertyType = (OntoLClass)eResolveProxy(oldPropertyType);
			if (propertyType != oldPropertyType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PROPERTY__PROPERTY_TYPE, oldPropertyType, propertyType));
			}
		}
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoLClass basicGetPropertyType() {
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyType(OntoLClass newPropertyType) {
		OntoLClass oldPropertyType = propertyType;
		propertyType = newPropertyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY__PROPERTY_TYPE, oldPropertyType, propertyType));
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
	public RegularityPropertyType getRegularityType() {
		return regularityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegularityType(RegularityPropertyType newRegularityType) {
		RegularityPropertyType oldRegularityType = regularityType;
		regularityType = newRegularityType == null ? REGULARITY_TYPE_EDEFAULT : newRegularityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY__REGULARITY_TYPE, oldRegularityType, regularityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getRegulatedProperty() {
		if (regulatedProperty != null && regulatedProperty.eIsProxy()) {
			InternalEObject oldRegulatedProperty = (InternalEObject)regulatedProperty;
			regulatedProperty = (Property)eResolveProxy(oldRegulatedProperty);
			if (regulatedProperty != oldRegulatedProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PROPERTY__REGULATED_PROPERTY, oldRegulatedProperty, regulatedProperty));
			}
		}
		return regulatedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetRegulatedProperty() {
		return regulatedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegulatedProperty(Property newRegulatedProperty) {
		Property oldRegulatedProperty = regulatedProperty;
		regulatedProperty = newRegulatedProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY__REGULATED_PROPERTY, oldRegulatedProperty, regulatedProperty));
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
			case ModelPackage.PROPERTY__PROPERTY_TYPE:
				if (resolve) return getPropertyType();
				return basicGetPropertyType();
			case ModelPackage.PROPERTY__REGULARITY:
				return getRegularity();
			case ModelPackage.PROPERTY__REGULARITY_TYPE:
				return getRegularityType();
			case ModelPackage.PROPERTY__REGULATED_PROPERTY:
				if (resolve) return getRegulatedProperty();
				return basicGetRegulatedProperty();
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
			case ModelPackage.PROPERTY__PROPERTY_TYPE:
				setPropertyType((OntoLClass)newValue);
				return;
			case ModelPackage.PROPERTY__REGULARITY:
				setRegularity((Boolean)newValue);
				return;
			case ModelPackage.PROPERTY__REGULARITY_TYPE:
				setRegularityType((RegularityPropertyType)newValue);
				return;
			case ModelPackage.PROPERTY__REGULATED_PROPERTY:
				setRegulatedProperty((Property)newValue);
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
			case ModelPackage.PROPERTY__PROPERTY_TYPE:
				setPropertyType((OntoLClass)null);
				return;
			case ModelPackage.PROPERTY__REGULARITY:
				setRegularity(REGULARITY_EDEFAULT);
				return;
			case ModelPackage.PROPERTY__REGULARITY_TYPE:
				setRegularityType(REGULARITY_TYPE_EDEFAULT);
				return;
			case ModelPackage.PROPERTY__REGULATED_PROPERTY:
				setRegulatedProperty((Property)null);
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
			case ModelPackage.PROPERTY__PROPERTY_TYPE:
				return propertyType != null;
			case ModelPackage.PROPERTY__REGULARITY:
				return REGULARITY_EDEFAULT == null ? regularity != null : !REGULARITY_EDEFAULT.equals(regularity);
			case ModelPackage.PROPERTY__REGULARITY_TYPE:
				return regularityType != REGULARITY_TYPE_EDEFAULT;
			case ModelPackage.PROPERTY__REGULATED_PROPERTY:
				return regulatedProperty != null;
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
		result.append(", regularityType: ");
		result.append(regularityType);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl

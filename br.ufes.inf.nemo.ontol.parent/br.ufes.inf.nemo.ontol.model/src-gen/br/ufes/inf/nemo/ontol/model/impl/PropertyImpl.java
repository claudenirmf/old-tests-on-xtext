/**
 */
package br.ufes.inf.nemo.ontol.model.impl;

import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.model.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.PropertyImpl#getSubsetOf <em>Subset Of</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.PropertyImpl#getOppositeTo <em>Opposite To</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.PropertyImpl#getClassContainer <em>Class Container</em>}</li>
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
	protected br.ufes.inf.nemo.ontol.model.Class propertyType;

	/**
	 * The cached value of the '{@link #getSubsetOf() <em>Subset Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsetOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> subsetOf;

	/**
	 * The cached value of the '{@link #getOppositeTo() <em>Opposite To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppositeTo()
	 * @generated
	 * @ordered
	 */
	protected Property oppositeTo;

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
	public br.ufes.inf.nemo.ontol.model.Class getPropertyType() {
		if (propertyType != null && propertyType.eIsProxy()) {
			InternalEObject oldPropertyType = (InternalEObject)propertyType;
			propertyType = (br.ufes.inf.nemo.ontol.model.Class)eResolveProxy(oldPropertyType);
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
	public br.ufes.inf.nemo.ontol.model.Class basicGetPropertyType() {
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyType(br.ufes.inf.nemo.ontol.model.Class newPropertyType) {
		br.ufes.inf.nemo.ontol.model.Class oldPropertyType = propertyType;
		propertyType = newPropertyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY__PROPERTY_TYPE, oldPropertyType, propertyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getSubsetOf() {
		if (subsetOf == null) {
			subsetOf = new EObjectResolvingEList<Property>(Property.class, this, ModelPackage.PROPERTY__SUBSET_OF);
		}
		return subsetOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOppositeTo() {
		if (oppositeTo != null && oppositeTo.eIsProxy()) {
			InternalEObject oldOppositeTo = (InternalEObject)oppositeTo;
			oppositeTo = (Property)eResolveProxy(oldOppositeTo);
			if (oppositeTo != oldOppositeTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PROPERTY__OPPOSITE_TO, oldOppositeTo, oppositeTo));
			}
		}
		return oppositeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetOppositeTo() {
		return oppositeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOppositeTo(Property newOppositeTo) {
		Property oldOppositeTo = oppositeTo;
		oppositeTo = newOppositeTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY__OPPOSITE_TO, oldOppositeTo, oppositeTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public br.ufes.inf.nemo.ontol.model.Class getClassContainer() {
		if (eContainerFeatureID() != ModelPackage.PROPERTY__CLASS_CONTAINER) return null;
		return (br.ufes.inf.nemo.ontol.model.Class)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public br.ufes.inf.nemo.ontol.model.Class basicGetClassContainer() {
		if (eContainerFeatureID() != ModelPackage.PROPERTY__CLASS_CONTAINER) return null;
		return (br.ufes.inf.nemo.ontol.model.Class)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassContainer(br.ufes.inf.nemo.ontol.model.Class newClassContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClassContainer, ModelPackage.PROPERTY__CLASS_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassContainer(br.ufes.inf.nemo.ontol.model.Class newClassContainer) {
		if (newClassContainer != eInternalContainer() || (eContainerFeatureID() != ModelPackage.PROPERTY__CLASS_CONTAINER && newClassContainer != null)) {
			if (EcoreUtil.isAncestor(this, newClassContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClassContainer != null)
				msgs = ((InternalEObject)newClassContainer).eInverseAdd(this, ModelPackage.CLASS__PROPS, br.ufes.inf.nemo.ontol.model.Class.class, msgs);
			msgs = basicSetClassContainer(newClassContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY__CLASS_CONTAINER, newClassContainer, newClassContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PROPERTY__CLASS_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClassContainer((br.ufes.inf.nemo.ontol.model.Class)otherEnd, msgs);
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
			case ModelPackage.PROPERTY__CLASS_CONTAINER:
				return basicSetClassContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.PROPERTY__CLASS_CONTAINER:
				return eInternalContainer().eInverseRemove(this, ModelPackage.CLASS__PROPS, br.ufes.inf.nemo.ontol.model.Class.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case ModelPackage.PROPERTY__SUBSET_OF:
				return getSubsetOf();
			case ModelPackage.PROPERTY__OPPOSITE_TO:
				if (resolve) return getOppositeTo();
				return basicGetOppositeTo();
			case ModelPackage.PROPERTY__CLASS_CONTAINER:
				if (resolve) return getClassContainer();
				return basicGetClassContainer();
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
				setPropertyType((br.ufes.inf.nemo.ontol.model.Class)newValue);
				return;
			case ModelPackage.PROPERTY__SUBSET_OF:
				getSubsetOf().clear();
				getSubsetOf().addAll((Collection<? extends Property>)newValue);
				return;
			case ModelPackage.PROPERTY__OPPOSITE_TO:
				setOppositeTo((Property)newValue);
				return;
			case ModelPackage.PROPERTY__CLASS_CONTAINER:
				setClassContainer((br.ufes.inf.nemo.ontol.model.Class)newValue);
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
				setPropertyType((br.ufes.inf.nemo.ontol.model.Class)null);
				return;
			case ModelPackage.PROPERTY__SUBSET_OF:
				getSubsetOf().clear();
				return;
			case ModelPackage.PROPERTY__OPPOSITE_TO:
				setOppositeTo((Property)null);
				return;
			case ModelPackage.PROPERTY__CLASS_CONTAINER:
				setClassContainer((br.ufes.inf.nemo.ontol.model.Class)null);
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
			case ModelPackage.PROPERTY__SUBSET_OF:
				return subsetOf != null && !subsetOf.isEmpty();
			case ModelPackage.PROPERTY__OPPOSITE_TO:
				return oppositeTo != null;
			case ModelPackage.PROPERTY__CLASS_CONTAINER:
				return basicGetClassContainer() != null;
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
		result.append(')');
		return result.toString();
	}

} //PropertyImpl

/**
 */
package br.ufes.inf.nemo.ontol.model.impl;

import br.ufes.inf.nemo.ontol.model.EntityDeclaration;
import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.model.Property;
import br.ufes.inf.nemo.ontol.model.PropertyAssignment;
import br.ufes.inf.nemo.ontol.model.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.PropertyAssignmentImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.PropertyAssignmentImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.PropertyAssignmentImpl#getClassContainer <em>Class Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyAssignmentImpl extends ModelElementImpl implements PropertyAssignment {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected Property property;

	/**
	 * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected Value assignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PROPERTY_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (Property)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PROPERTY_ASSIGNMENT__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(Property newProperty) {
		Property oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY_ASSIGNMENT__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getAssignment() {
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignment(Value newAssignment, NotificationChain msgs) {
		Value oldAssignment = assignment;
		assignment = newAssignment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY_ASSIGNMENT__ASSIGNMENT, oldAssignment, newAssignment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignment(Value newAssignment) {
		if (newAssignment != assignment) {
			NotificationChain msgs = null;
			if (assignment != null)
				msgs = ((InternalEObject)assignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PROPERTY_ASSIGNMENT__ASSIGNMENT, null, msgs);
			if (newAssignment != null)
				msgs = ((InternalEObject)newAssignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PROPERTY_ASSIGNMENT__ASSIGNMENT, null, msgs);
			msgs = basicSetAssignment(newAssignment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY_ASSIGNMENT__ASSIGNMENT, newAssignment, newAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityDeclaration getClassContainer() {
		if (eContainerFeatureID() != ModelPackage.PROPERTY_ASSIGNMENT__CLASS_CONTAINER) return null;
		return (EntityDeclaration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityDeclaration basicGetClassContainer() {
		if (eContainerFeatureID() != ModelPackage.PROPERTY_ASSIGNMENT__CLASS_CONTAINER) return null;
		return (EntityDeclaration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassContainer(EntityDeclaration newClassContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClassContainer, ModelPackage.PROPERTY_ASSIGNMENT__CLASS_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassContainer(EntityDeclaration newClassContainer) {
		if (newClassContainer != eInternalContainer() || (eContainerFeatureID() != ModelPackage.PROPERTY_ASSIGNMENT__CLASS_CONTAINER && newClassContainer != null)) {
			if (EcoreUtil.isAncestor(this, newClassContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClassContainer != null)
				msgs = ((InternalEObject)newClassContainer).eInverseAdd(this, ModelPackage.ENTITY_DECLARATION__PROP_ASSIGNS, EntityDeclaration.class, msgs);
			msgs = basicSetClassContainer(newClassContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTY_ASSIGNMENT__CLASS_CONTAINER, newClassContainer, newClassContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PROPERTY_ASSIGNMENT__CLASS_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClassContainer((EntityDeclaration)otherEnd, msgs);
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
			case ModelPackage.PROPERTY_ASSIGNMENT__ASSIGNMENT:
				return basicSetAssignment(null, msgs);
			case ModelPackage.PROPERTY_ASSIGNMENT__CLASS_CONTAINER:
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
			case ModelPackage.PROPERTY_ASSIGNMENT__CLASS_CONTAINER:
				return eInternalContainer().eInverseRemove(this, ModelPackage.ENTITY_DECLARATION__PROP_ASSIGNS, EntityDeclaration.class, msgs);
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
			case ModelPackage.PROPERTY_ASSIGNMENT__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case ModelPackage.PROPERTY_ASSIGNMENT__ASSIGNMENT:
				return getAssignment();
			case ModelPackage.PROPERTY_ASSIGNMENT__CLASS_CONTAINER:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.PROPERTY_ASSIGNMENT__PROPERTY:
				setProperty((Property)newValue);
				return;
			case ModelPackage.PROPERTY_ASSIGNMENT__ASSIGNMENT:
				setAssignment((Value)newValue);
				return;
			case ModelPackage.PROPERTY_ASSIGNMENT__CLASS_CONTAINER:
				setClassContainer((EntityDeclaration)newValue);
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
			case ModelPackage.PROPERTY_ASSIGNMENT__PROPERTY:
				setProperty((Property)null);
				return;
			case ModelPackage.PROPERTY_ASSIGNMENT__ASSIGNMENT:
				setAssignment((Value)null);
				return;
			case ModelPackage.PROPERTY_ASSIGNMENT__CLASS_CONTAINER:
				setClassContainer((EntityDeclaration)null);
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
			case ModelPackage.PROPERTY_ASSIGNMENT__PROPERTY:
				return property != null;
			case ModelPackage.PROPERTY_ASSIGNMENT__ASSIGNMENT:
				return assignment != null;
			case ModelPackage.PROPERTY_ASSIGNMENT__CLASS_CONTAINER:
				return basicGetClassContainer() != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyAssignmentImpl

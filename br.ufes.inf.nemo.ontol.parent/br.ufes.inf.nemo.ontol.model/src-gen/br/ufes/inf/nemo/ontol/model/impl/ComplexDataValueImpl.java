/**
 */
package br.ufes.inf.nemo.ontol.model.impl;

import br.ufes.inf.nemo.ontol.model.ComplexDataValue;
import br.ufes.inf.nemo.ontol.model.Individual;
import br.ufes.inf.nemo.ontol.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Data Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.ComplexDataValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.ComplexDataValueImpl#getUnnamedValue <em>Unnamed Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexDataValueImpl extends DataValueImpl implements ComplexDataValue {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Individual value;

	/**
	 * The cached value of the '{@link #getUnnamedValue() <em>Unnamed Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnnamedValue()
	 * @generated
	 * @ordered
	 */
	protected Individual unnamedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexDataValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COMPLEX_DATA_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (Individual)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.COMPLEX_DATA_VALUE__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Individual newValue) {
		Individual oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPLEX_DATA_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual getUnnamedValue() {
		return unnamedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnnamedValue(Individual newUnnamedValue, NotificationChain msgs) {
		Individual oldUnnamedValue = unnamedValue;
		unnamedValue = newUnnamedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.COMPLEX_DATA_VALUE__UNNAMED_VALUE, oldUnnamedValue, newUnnamedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnnamedValue(Individual newUnnamedValue) {
		if (newUnnamedValue != unnamedValue) {
			NotificationChain msgs = null;
			if (unnamedValue != null)
				msgs = ((InternalEObject)unnamedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.COMPLEX_DATA_VALUE__UNNAMED_VALUE, null, msgs);
			if (newUnnamedValue != null)
				msgs = ((InternalEObject)newUnnamedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.COMPLEX_DATA_VALUE__UNNAMED_VALUE, null, msgs);
			msgs = basicSetUnnamedValue(newUnnamedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPLEX_DATA_VALUE__UNNAMED_VALUE, newUnnamedValue, newUnnamedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.COMPLEX_DATA_VALUE__UNNAMED_VALUE:
				return basicSetUnnamedValue(null, msgs);
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
			case ModelPackage.COMPLEX_DATA_VALUE__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case ModelPackage.COMPLEX_DATA_VALUE__UNNAMED_VALUE:
				return getUnnamedValue();
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
			case ModelPackage.COMPLEX_DATA_VALUE__VALUE:
				setValue((Individual)newValue);
				return;
			case ModelPackage.COMPLEX_DATA_VALUE__UNNAMED_VALUE:
				setUnnamedValue((Individual)newValue);
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
			case ModelPackage.COMPLEX_DATA_VALUE__VALUE:
				setValue((Individual)null);
				return;
			case ModelPackage.COMPLEX_DATA_VALUE__UNNAMED_VALUE:
				setUnnamedValue((Individual)null);
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
			case ModelPackage.COMPLEX_DATA_VALUE__VALUE:
				return value != null;
			case ModelPackage.COMPLEX_DATA_VALUE__UNNAMED_VALUE:
				return unnamedValue != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplexDataValueImpl

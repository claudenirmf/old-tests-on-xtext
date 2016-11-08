/**
 */
package br.ufes.inf.nemo.ontol.model.impl;

import br.ufes.inf.nemo.ontol.model.ListValue;
import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.model.Value;

import com.google.common.base.Objects;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.ListValueImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListValueImpl extends ValueImpl implements ListValue {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> values;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.LIST_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<Value>(Value.class, this, ModelPackage.LIST_VALUE__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNAssignments() {
		EList<Value> _values = this.getValues();
		boolean _equals = Objects.equal(_values, null);
		if (_equals) {
			return 0;
		}
		EList<Value> _values_1 = this.getValues();
		int count = _values_1.size();
		EList<Value> _values_2 = this.getValues();
		for (final Value v : _values_2) {
			int _count = count;
			int _nAssignments = v.getNAssignments();
			count = (_count + _nAssignments);
		}
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.LIST_VALUE__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.LIST_VALUE__VALUES:
				return getValues();
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
			case ModelPackage.LIST_VALUE__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends Value>)newValue);
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
			case ModelPackage.LIST_VALUE__VALUES:
				getValues().clear();
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
			case ModelPackage.LIST_VALUE__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Value.class) {
			switch (baseOperationID) {
				case ModelPackage.VALUE___GET_NASSIGNMENTS: return ModelPackage.LIST_VALUE___GET_NASSIGNMENTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.LIST_VALUE___GET_NASSIGNMENTS:
				return getNAssignments();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ListValueImpl

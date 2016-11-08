/**
 */
package br.ufes.inf.nemo.ontol.model.impl;

import br.ufes.inf.nemo.ontol.model.DataValue;
import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.model.Value;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DataValueImpl extends ValueImpl implements DataValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DATA_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNAssignments() {
		return 1;
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
				case ModelPackage.VALUE___GET_NASSIGNMENTS: return ModelPackage.DATA_VALUE___GET_NASSIGNMENTS;
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
			case ModelPackage.DATA_VALUE___GET_NASSIGNMENTS:
				return getNAssignments();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataValueImpl

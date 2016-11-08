/**
 */
package br.ufes.inf.nemo.ontol.model.impl;

import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.model.Reference;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.ReferenceImpl#getSubsetOf <em>Subset Of</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.ReferenceImpl#getOppositeTo <em>Opposite To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends PropertyImpl implements Reference {
	/**
	 * The cached value of the '{@link #getSubsetOf() <em>Subset Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsetOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subsetOf;
	/**
	 * The cached value of the '{@link #getOppositeTo() <em>Opposite To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppositeTo()
	 * @generated
	 * @ordered
	 */
	protected Reference oppositeTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSubsetOf() {
		if (subsetOf == null) {
			subsetOf = new EObjectResolvingEList<Reference>(Reference.class, this, ModelPackage.REFERENCE__SUBSET_OF);
		}
		return subsetOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOppositeTo() {
		if (oppositeTo != null && oppositeTo.eIsProxy()) {
			InternalEObject oldOppositeTo = (InternalEObject)oppositeTo;
			oppositeTo = (Reference)eResolveProxy(oldOppositeTo);
			if (oppositeTo != oldOppositeTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.REFERENCE__OPPOSITE_TO, oldOppositeTo, oppositeTo));
			}
		}
		return oppositeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetOppositeTo() {
		return oppositeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOppositeTo(Reference newOppositeTo) {
		Reference oldOppositeTo = oppositeTo;
		oppositeTo = newOppositeTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REFERENCE__OPPOSITE_TO, oldOppositeTo, oppositeTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.REFERENCE__SUBSET_OF:
				return getSubsetOf();
			case ModelPackage.REFERENCE__OPPOSITE_TO:
				if (resolve) return getOppositeTo();
				return basicGetOppositeTo();
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
			case ModelPackage.REFERENCE__SUBSET_OF:
				getSubsetOf().clear();
				getSubsetOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case ModelPackage.REFERENCE__OPPOSITE_TO:
				setOppositeTo((Reference)newValue);
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
			case ModelPackage.REFERENCE__SUBSET_OF:
				getSubsetOf().clear();
				return;
			case ModelPackage.REFERENCE__OPPOSITE_TO:
				setOppositeTo((Reference)null);
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
			case ModelPackage.REFERENCE__SUBSET_OF:
				return subsetOf != null && !subsetOf.isEmpty();
			case ModelPackage.REFERENCE__OPPOSITE_TO:
				return oppositeTo != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl

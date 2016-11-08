/**
 */
package br.ufes.inf.nemo.ontol.model.impl;

import br.ufes.inf.nemo.ontol.model.Attribute;
import br.ufes.inf.nemo.ontol.model.ModelPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.AttributeImpl#getSubsetOf <em>Subset Of</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.AttributeImpl#getOppositeTo <em>Opposite To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends PropertyImpl implements Attribute {
	/**
	 * The cached value of the '{@link #getSubsetOf() <em>Subset Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsetOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> subsetOf;
	/**
	 * The cached value of the '{@link #getOppositeTo() <em>Opposite To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppositeTo()
	 * @generated
	 * @ordered
	 */
	protected Attribute oppositeTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getSubsetOf() {
		if (subsetOf == null) {
			subsetOf = new EObjectResolvingEList<Attribute>(Attribute.class, this, ModelPackage.ATTRIBUTE__SUBSET_OF);
		}
		return subsetOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getOppositeTo() {
		if (oppositeTo != null && oppositeTo.eIsProxy()) {
			InternalEObject oldOppositeTo = (InternalEObject)oppositeTo;
			oppositeTo = (Attribute)eResolveProxy(oldOppositeTo);
			if (oppositeTo != oldOppositeTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ATTRIBUTE__OPPOSITE_TO, oldOppositeTo, oppositeTo));
			}
		}
		return oppositeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetOppositeTo() {
		return oppositeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOppositeTo(Attribute newOppositeTo) {
		Attribute oldOppositeTo = oppositeTo;
		oppositeTo = newOppositeTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTRIBUTE__OPPOSITE_TO, oldOppositeTo, oppositeTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ATTRIBUTE__SUBSET_OF:
				return getSubsetOf();
			case ModelPackage.ATTRIBUTE__OPPOSITE_TO:
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
			case ModelPackage.ATTRIBUTE__SUBSET_OF:
				getSubsetOf().clear();
				getSubsetOf().addAll((Collection<? extends Attribute>)newValue);
				return;
			case ModelPackage.ATTRIBUTE__OPPOSITE_TO:
				setOppositeTo((Attribute)newValue);
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
			case ModelPackage.ATTRIBUTE__SUBSET_OF:
				getSubsetOf().clear();
				return;
			case ModelPackage.ATTRIBUTE__OPPOSITE_TO:
				setOppositeTo((Attribute)null);
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
			case ModelPackage.ATTRIBUTE__SUBSET_OF:
				return subsetOf != null && !subsetOf.isEmpty();
			case ModelPackage.ATTRIBUTE__OPPOSITE_TO:
				return oppositeTo != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeImpl

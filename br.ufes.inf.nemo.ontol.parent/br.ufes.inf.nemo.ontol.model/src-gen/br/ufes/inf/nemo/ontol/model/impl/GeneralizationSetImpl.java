/**
 */
package br.ufes.inf.nemo.ontol.model.impl;

import br.ufes.inf.nemo.ontol.model.GeneralizationSet;
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
 * An implementation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.GeneralizationSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.GeneralizationSetImpl#isIsDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.GeneralizationSetImpl#isIsComplete <em>Is Complete</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.GeneralizationSetImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.GeneralizationSetImpl#getCategorizer <em>Categorizer</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.GeneralizationSetImpl#getSpecifics <em>Specifics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationSetImpl extends ModelElementImpl implements GeneralizationSet {
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
	 * The default value of the '{@link #isIsDisjoint() <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisjoint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISJOINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDisjoint() <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisjoint()
	 * @generated
	 * @ordered
	 */
	protected boolean isDisjoint = IS_DISJOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsComplete() <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComplete() <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean isComplete = IS_COMPLETE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected br.ufes.inf.nemo.ontol.model.Class general;

	/**
	 * The cached value of the '{@link #getCategorizer() <em>Categorizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorizer()
	 * @generated
	 * @ordered
	 */
	protected br.ufes.inf.nemo.ontol.model.Class categorizer;

	/**
	 * The cached value of the '{@link #getSpecifics() <em>Specifics</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifics()
	 * @generated
	 * @ordered
	 */
	protected EList<br.ufes.inf.nemo.ontol.model.Class> specifics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.GENERALIZATION_SET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GENERALIZATION_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDisjoint() {
		return isDisjoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisjoint(boolean newIsDisjoint) {
		boolean oldIsDisjoint = isDisjoint;
		isDisjoint = newIsDisjoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GENERALIZATION_SET__IS_DISJOINT, oldIsDisjoint, isDisjoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComplete() {
		return isComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComplete(boolean newIsComplete) {
		boolean oldIsComplete = isComplete;
		isComplete = newIsComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GENERALIZATION_SET__IS_COMPLETE, oldIsComplete, isComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public br.ufes.inf.nemo.ontol.model.Class getGeneral() {
		if (general != null && general.eIsProxy()) {
			InternalEObject oldGeneral = (InternalEObject)general;
			general = (br.ufes.inf.nemo.ontol.model.Class)eResolveProxy(oldGeneral);
			if (general != oldGeneral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.GENERALIZATION_SET__GENERAL, oldGeneral, general));
			}
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public br.ufes.inf.nemo.ontol.model.Class basicGetGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(br.ufes.inf.nemo.ontol.model.Class newGeneral) {
		br.ufes.inf.nemo.ontol.model.Class oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GENERALIZATION_SET__GENERAL, oldGeneral, general));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public br.ufes.inf.nemo.ontol.model.Class getCategorizer() {
		if (categorizer != null && categorizer.eIsProxy()) {
			InternalEObject oldCategorizer = (InternalEObject)categorizer;
			categorizer = (br.ufes.inf.nemo.ontol.model.Class)eResolveProxy(oldCategorizer);
			if (categorizer != oldCategorizer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.GENERALIZATION_SET__CATEGORIZER, oldCategorizer, categorizer));
			}
		}
		return categorizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public br.ufes.inf.nemo.ontol.model.Class basicGetCategorizer() {
		return categorizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorizer(br.ufes.inf.nemo.ontol.model.Class newCategorizer) {
		br.ufes.inf.nemo.ontol.model.Class oldCategorizer = categorizer;
		categorizer = newCategorizer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GENERALIZATION_SET__CATEGORIZER, oldCategorizer, categorizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<br.ufes.inf.nemo.ontol.model.Class> getSpecifics() {
		if (specifics == null) {
			specifics = new EObjectResolvingEList<br.ufes.inf.nemo.ontol.model.Class>(br.ufes.inf.nemo.ontol.model.Class.class, this, ModelPackage.GENERALIZATION_SET__SPECIFICS);
		}
		return specifics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.GENERALIZATION_SET__NAME:
				return getName();
			case ModelPackage.GENERALIZATION_SET__IS_DISJOINT:
				return isIsDisjoint();
			case ModelPackage.GENERALIZATION_SET__IS_COMPLETE:
				return isIsComplete();
			case ModelPackage.GENERALIZATION_SET__GENERAL:
				if (resolve) return getGeneral();
				return basicGetGeneral();
			case ModelPackage.GENERALIZATION_SET__CATEGORIZER:
				if (resolve) return getCategorizer();
				return basicGetCategorizer();
			case ModelPackage.GENERALIZATION_SET__SPECIFICS:
				return getSpecifics();
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
			case ModelPackage.GENERALIZATION_SET__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.GENERALIZATION_SET__IS_DISJOINT:
				setIsDisjoint((Boolean)newValue);
				return;
			case ModelPackage.GENERALIZATION_SET__IS_COMPLETE:
				setIsComplete((Boolean)newValue);
				return;
			case ModelPackage.GENERALIZATION_SET__GENERAL:
				setGeneral((br.ufes.inf.nemo.ontol.model.Class)newValue);
				return;
			case ModelPackage.GENERALIZATION_SET__CATEGORIZER:
				setCategorizer((br.ufes.inf.nemo.ontol.model.Class)newValue);
				return;
			case ModelPackage.GENERALIZATION_SET__SPECIFICS:
				getSpecifics().clear();
				getSpecifics().addAll((Collection<? extends br.ufes.inf.nemo.ontol.model.Class>)newValue);
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
			case ModelPackage.GENERALIZATION_SET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.GENERALIZATION_SET__IS_DISJOINT:
				setIsDisjoint(IS_DISJOINT_EDEFAULT);
				return;
			case ModelPackage.GENERALIZATION_SET__IS_COMPLETE:
				setIsComplete(IS_COMPLETE_EDEFAULT);
				return;
			case ModelPackage.GENERALIZATION_SET__GENERAL:
				setGeneral((br.ufes.inf.nemo.ontol.model.Class)null);
				return;
			case ModelPackage.GENERALIZATION_SET__CATEGORIZER:
				setCategorizer((br.ufes.inf.nemo.ontol.model.Class)null);
				return;
			case ModelPackage.GENERALIZATION_SET__SPECIFICS:
				getSpecifics().clear();
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
			case ModelPackage.GENERALIZATION_SET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.GENERALIZATION_SET__IS_DISJOINT:
				return isDisjoint != IS_DISJOINT_EDEFAULT;
			case ModelPackage.GENERALIZATION_SET__IS_COMPLETE:
				return isComplete != IS_COMPLETE_EDEFAULT;
			case ModelPackage.GENERALIZATION_SET__GENERAL:
				return general != null;
			case ModelPackage.GENERALIZATION_SET__CATEGORIZER:
				return categorizer != null;
			case ModelPackage.GENERALIZATION_SET__SPECIFICS:
				return specifics != null && !specifics.isEmpty();
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
		result.append(", isDisjoint: ");
		result.append(isDisjoint);
		result.append(", isComplete: ");
		result.append(isComplete);
		result.append(')');
		return result.toString();
	}

} //GeneralizationSetImpl

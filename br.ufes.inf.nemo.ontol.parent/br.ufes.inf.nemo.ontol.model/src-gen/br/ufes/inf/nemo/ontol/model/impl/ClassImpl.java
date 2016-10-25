/**
 */
package br.ufes.inf.nemo.ontol.model.impl;

import br.ufes.inf.nemo.ontol.model.CategorizationType;
import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.model.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.ClassImpl#getSuperClasses <em>Super Classes</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.ClassImpl#getPowertypeOf <em>Powertype Of</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.ClassImpl#getBasetype <em>Basetype</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.ClassImpl#getSubordinators <em>Subordinators</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.ClassImpl#getProps <em>Props</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.ClassImpl#getCatType <em>Cat Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends EntityDeclarationImpl implements br.ufes.inf.nemo.ontol.model.Class {
	/**
	 * The cached value of the '{@link #getSuperClasses() <em>Super Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<br.ufes.inf.nemo.ontol.model.Class> superClasses;

	/**
	 * The cached value of the '{@link #getPowertypeOf() <em>Powertype Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertypeOf()
	 * @generated
	 * @ordered
	 */
	protected br.ufes.inf.nemo.ontol.model.Class powertypeOf;

	/**
	 * The cached value of the '{@link #getBasetype() <em>Basetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasetype()
	 * @generated
	 * @ordered
	 */
	protected br.ufes.inf.nemo.ontol.model.Class basetype;

	/**
	 * The cached value of the '{@link #getSubordinators() <em>Subordinators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubordinators()
	 * @generated
	 * @ordered
	 */
	protected EList<br.ufes.inf.nemo.ontol.model.Class> subordinators;

	/**
	 * The cached value of the '{@link #getProps() <em>Props</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProps()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> props;

	/**
	 * The default value of the '{@link #getCatType() <em>Cat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatType()
	 * @generated
	 * @ordered
	 */
	protected static final CategorizationType CAT_TYPE_EDEFAULT = CategorizationType.NONE;

	/**
	 * The cached value of the '{@link #getCatType() <em>Cat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatType()
	 * @generated
	 * @ordered
	 */
	protected CategorizationType catType = CAT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<br.ufes.inf.nemo.ontol.model.Class> getSuperClasses() {
		if (superClasses == null) {
			superClasses = new EObjectResolvingEList<br.ufes.inf.nemo.ontol.model.Class>(br.ufes.inf.nemo.ontol.model.Class.class, this, ModelPackage.CLASS__SUPER_CLASSES);
		}
		return superClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public br.ufes.inf.nemo.ontol.model.Class getPowertypeOf() {
		if (powertypeOf != null && powertypeOf.eIsProxy()) {
			InternalEObject oldPowertypeOf = (InternalEObject)powertypeOf;
			powertypeOf = (br.ufes.inf.nemo.ontol.model.Class)eResolveProxy(oldPowertypeOf);
			if (powertypeOf != oldPowertypeOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CLASS__POWERTYPE_OF, oldPowertypeOf, powertypeOf));
			}
		}
		return powertypeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public br.ufes.inf.nemo.ontol.model.Class basicGetPowertypeOf() {
		return powertypeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowertypeOf(br.ufes.inf.nemo.ontol.model.Class newPowertypeOf) {
		br.ufes.inf.nemo.ontol.model.Class oldPowertypeOf = powertypeOf;
		powertypeOf = newPowertypeOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CLASS__POWERTYPE_OF, oldPowertypeOf, powertypeOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public br.ufes.inf.nemo.ontol.model.Class getBasetype() {
		if (basetype != null && basetype.eIsProxy()) {
			InternalEObject oldBasetype = (InternalEObject)basetype;
			basetype = (br.ufes.inf.nemo.ontol.model.Class)eResolveProxy(oldBasetype);
			if (basetype != oldBasetype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CLASS__BASETYPE, oldBasetype, basetype));
			}
		}
		return basetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public br.ufes.inf.nemo.ontol.model.Class basicGetBasetype() {
		return basetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasetype(br.ufes.inf.nemo.ontol.model.Class newBasetype) {
		br.ufes.inf.nemo.ontol.model.Class oldBasetype = basetype;
		basetype = newBasetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CLASS__BASETYPE, oldBasetype, basetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<br.ufes.inf.nemo.ontol.model.Class> getSubordinators() {
		if (subordinators == null) {
			subordinators = new EObjectResolvingEList<br.ufes.inf.nemo.ontol.model.Class>(br.ufes.inf.nemo.ontol.model.Class.class, this, ModelPackage.CLASS__SUBORDINATORS);
		}
		return subordinators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProps() {
		if (props == null) {
			props = new EObjectContainmentWithInverseEList<Property>(Property.class, this, ModelPackage.CLASS__PROPS, ModelPackage.PROPERTY__CLASS_CONTAINER);
		}
		return props;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategorizationType getCatType() {
		return catType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatType(CategorizationType newCatType) {
		CategorizationType oldCatType = catType;
		catType = newCatType == null ? CAT_TYPE_EDEFAULT : newCatType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CLASS__CAT_TYPE, oldCatType, catType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.CLASS__PROPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProps()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.CLASS__PROPS:
				return ((InternalEList<?>)getProps()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.CLASS__SUPER_CLASSES:
				return getSuperClasses();
			case ModelPackage.CLASS__POWERTYPE_OF:
				if (resolve) return getPowertypeOf();
				return basicGetPowertypeOf();
			case ModelPackage.CLASS__BASETYPE:
				if (resolve) return getBasetype();
				return basicGetBasetype();
			case ModelPackage.CLASS__SUBORDINATORS:
				return getSubordinators();
			case ModelPackage.CLASS__PROPS:
				return getProps();
			case ModelPackage.CLASS__CAT_TYPE:
				return getCatType();
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
			case ModelPackage.CLASS__SUPER_CLASSES:
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection<? extends br.ufes.inf.nemo.ontol.model.Class>)newValue);
				return;
			case ModelPackage.CLASS__POWERTYPE_OF:
				setPowertypeOf((br.ufes.inf.nemo.ontol.model.Class)newValue);
				return;
			case ModelPackage.CLASS__BASETYPE:
				setBasetype((br.ufes.inf.nemo.ontol.model.Class)newValue);
				return;
			case ModelPackage.CLASS__SUBORDINATORS:
				getSubordinators().clear();
				getSubordinators().addAll((Collection<? extends br.ufes.inf.nemo.ontol.model.Class>)newValue);
				return;
			case ModelPackage.CLASS__PROPS:
				getProps().clear();
				getProps().addAll((Collection<? extends Property>)newValue);
				return;
			case ModelPackage.CLASS__CAT_TYPE:
				setCatType((CategorizationType)newValue);
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
			case ModelPackage.CLASS__SUPER_CLASSES:
				getSuperClasses().clear();
				return;
			case ModelPackage.CLASS__POWERTYPE_OF:
				setPowertypeOf((br.ufes.inf.nemo.ontol.model.Class)null);
				return;
			case ModelPackage.CLASS__BASETYPE:
				setBasetype((br.ufes.inf.nemo.ontol.model.Class)null);
				return;
			case ModelPackage.CLASS__SUBORDINATORS:
				getSubordinators().clear();
				return;
			case ModelPackage.CLASS__PROPS:
				getProps().clear();
				return;
			case ModelPackage.CLASS__CAT_TYPE:
				setCatType(CAT_TYPE_EDEFAULT);
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
			case ModelPackage.CLASS__SUPER_CLASSES:
				return superClasses != null && !superClasses.isEmpty();
			case ModelPackage.CLASS__POWERTYPE_OF:
				return powertypeOf != null;
			case ModelPackage.CLASS__BASETYPE:
				return basetype != null;
			case ModelPackage.CLASS__SUBORDINATORS:
				return subordinators != null && !subordinators.isEmpty();
			case ModelPackage.CLASS__PROPS:
				return props != null && !props.isEmpty();
			case ModelPackage.CLASS__CAT_TYPE:
				return catType != CAT_TYPE_EDEFAULT;
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
		result.append(" (catType: ");
		result.append(catType);
		result.append(')');
		return result.toString();
	}

} //ClassImpl

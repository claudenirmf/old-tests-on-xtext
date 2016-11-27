/**
 */
package br.ufes.inf.nemo.ontol.model.impl;

import br.ufes.inf.nemo.ontol.model.Attribute;
import br.ufes.inf.nemo.ontol.model.CategorizationType;
import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.model.OntoLClass;
import br.ufes.inf.nemo.ontol.model.Reference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Onto LClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.OntoLClassImpl#getSuperClasses <em>Super Classes</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.OntoLClassImpl#getPowertypeOf <em>Powertype Of</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.OntoLClassImpl#getBasetype <em>Basetype</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.OntoLClassImpl#getSubordinators <em>Subordinators</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.OntoLClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.OntoLClassImpl#getReferences <em>References</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.OntoLClassImpl#getCategorizationType <em>Categorization Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OntoLClassImpl extends EntityDeclarationImpl implements OntoLClass {
	/**
	 * The cached value of the '{@link #getSuperClasses() <em>Super Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<OntoLClass> superClasses;

	/**
	 * The cached value of the '{@link #getPowertypeOf() <em>Powertype Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertypeOf()
	 * @generated
	 * @ordered
	 */
	protected OntoLClass powertypeOf;

	/**
	 * The cached value of the '{@link #getBasetype() <em>Basetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasetype()
	 * @generated
	 * @ordered
	 */
	protected OntoLClass basetype;

	/**
	 * The cached value of the '{@link #getSubordinators() <em>Subordinators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubordinators()
	 * @generated
	 * @ordered
	 */
	protected EList<OntoLClass> subordinators;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> references;

	/**
	 * The default value of the '{@link #getCategorizationType() <em>Categorization Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorizationType()
	 * @generated
	 * @ordered
	 */
	protected static final CategorizationType CATEGORIZATION_TYPE_EDEFAULT = CategorizationType.NONE;

	/**
	 * The cached value of the '{@link #getCategorizationType() <em>Categorization Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorizationType()
	 * @generated
	 * @ordered
	 */
	protected CategorizationType categorizationType = CATEGORIZATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntoLClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ONTO_LCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OntoLClass> getSuperClasses() {
		if (superClasses == null) {
			superClasses = new EObjectResolvingEList<OntoLClass>(OntoLClass.class, this, ModelPackage.ONTO_LCLASS__SUPER_CLASSES);
		}
		return superClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoLClass getPowertypeOf() {
		if (powertypeOf != null && powertypeOf.eIsProxy()) {
			InternalEObject oldPowertypeOf = (InternalEObject)powertypeOf;
			powertypeOf = (OntoLClass)eResolveProxy(oldPowertypeOf);
			if (powertypeOf != oldPowertypeOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ONTO_LCLASS__POWERTYPE_OF, oldPowertypeOf, powertypeOf));
			}
		}
		return powertypeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoLClass basicGetPowertypeOf() {
		return powertypeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowertypeOf(OntoLClass newPowertypeOf) {
		OntoLClass oldPowertypeOf = powertypeOf;
		powertypeOf = newPowertypeOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ONTO_LCLASS__POWERTYPE_OF, oldPowertypeOf, powertypeOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoLClass getBasetype() {
		if (basetype != null && basetype.eIsProxy()) {
			InternalEObject oldBasetype = (InternalEObject)basetype;
			basetype = (OntoLClass)eResolveProxy(oldBasetype);
			if (basetype != oldBasetype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ONTO_LCLASS__BASETYPE, oldBasetype, basetype));
			}
		}
		return basetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoLClass basicGetBasetype() {
		return basetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasetype(OntoLClass newBasetype) {
		OntoLClass oldBasetype = basetype;
		basetype = newBasetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ONTO_LCLASS__BASETYPE, oldBasetype, basetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OntoLClass> getSubordinators() {
		if (subordinators == null) {
			subordinators = new EObjectResolvingEList<OntoLClass>(OntoLClass.class, this, ModelPackage.ONTO_LCLASS__SUBORDINATORS);
		}
		return subordinators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, ModelPackage.ONTO_LCLASS__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<Reference>(Reference.class, this, ModelPackage.ONTO_LCLASS__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategorizationType getCategorizationType() {
		return categorizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorizationType(CategorizationType newCategorizationType) {
		CategorizationType oldCategorizationType = categorizationType;
		categorizationType = newCategorizationType == null ? CATEGORIZATION_TYPE_EDEFAULT : newCategorizationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ONTO_LCLASS__CATEGORIZATION_TYPE, oldCategorizationType, categorizationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ONTO_LCLASS__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case ModelPackage.ONTO_LCLASS__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ONTO_LCLASS__SUPER_CLASSES:
				return getSuperClasses();
			case ModelPackage.ONTO_LCLASS__POWERTYPE_OF:
				if (resolve) return getPowertypeOf();
				return basicGetPowertypeOf();
			case ModelPackage.ONTO_LCLASS__BASETYPE:
				if (resolve) return getBasetype();
				return basicGetBasetype();
			case ModelPackage.ONTO_LCLASS__SUBORDINATORS:
				return getSubordinators();
			case ModelPackage.ONTO_LCLASS__ATTRIBUTES:
				return getAttributes();
			case ModelPackage.ONTO_LCLASS__REFERENCES:
				return getReferences();
			case ModelPackage.ONTO_LCLASS__CATEGORIZATION_TYPE:
				return getCategorizationType();
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
			case ModelPackage.ONTO_LCLASS__SUPER_CLASSES:
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection<? extends OntoLClass>)newValue);
				return;
			case ModelPackage.ONTO_LCLASS__POWERTYPE_OF:
				setPowertypeOf((OntoLClass)newValue);
				return;
			case ModelPackage.ONTO_LCLASS__BASETYPE:
				setBasetype((OntoLClass)newValue);
				return;
			case ModelPackage.ONTO_LCLASS__SUBORDINATORS:
				getSubordinators().clear();
				getSubordinators().addAll((Collection<? extends OntoLClass>)newValue);
				return;
			case ModelPackage.ONTO_LCLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case ModelPackage.ONTO_LCLASS__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ModelPackage.ONTO_LCLASS__CATEGORIZATION_TYPE:
				setCategorizationType((CategorizationType)newValue);
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
			case ModelPackage.ONTO_LCLASS__SUPER_CLASSES:
				getSuperClasses().clear();
				return;
			case ModelPackage.ONTO_LCLASS__POWERTYPE_OF:
				setPowertypeOf((OntoLClass)null);
				return;
			case ModelPackage.ONTO_LCLASS__BASETYPE:
				setBasetype((OntoLClass)null);
				return;
			case ModelPackage.ONTO_LCLASS__SUBORDINATORS:
				getSubordinators().clear();
				return;
			case ModelPackage.ONTO_LCLASS__ATTRIBUTES:
				getAttributes().clear();
				return;
			case ModelPackage.ONTO_LCLASS__REFERENCES:
				getReferences().clear();
				return;
			case ModelPackage.ONTO_LCLASS__CATEGORIZATION_TYPE:
				setCategorizationType(CATEGORIZATION_TYPE_EDEFAULT);
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
			case ModelPackage.ONTO_LCLASS__SUPER_CLASSES:
				return superClasses != null && !superClasses.isEmpty();
			case ModelPackage.ONTO_LCLASS__POWERTYPE_OF:
				return powertypeOf != null;
			case ModelPackage.ONTO_LCLASS__BASETYPE:
				return basetype != null;
			case ModelPackage.ONTO_LCLASS__SUBORDINATORS:
				return subordinators != null && !subordinators.isEmpty();
			case ModelPackage.ONTO_LCLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case ModelPackage.ONTO_LCLASS__REFERENCES:
				return references != null && !references.isEmpty();
			case ModelPackage.ONTO_LCLASS__CATEGORIZATION_TYPE:
				return categorizationType != CATEGORIZATION_TYPE_EDEFAULT;
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
		result.append(" (categorizationType: ");
		result.append(categorizationType);
		result.append(')');
		return result.toString();
	}

} //OntoLClassImpl

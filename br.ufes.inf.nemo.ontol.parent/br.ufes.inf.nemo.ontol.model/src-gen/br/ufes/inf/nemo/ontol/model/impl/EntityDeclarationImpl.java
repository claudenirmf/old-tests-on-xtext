/**
 */
package br.ufes.inf.nemo.ontol.model.impl;

import br.ufes.inf.nemo.ontol.model.AttributeAssignment;
import br.ufes.inf.nemo.ontol.model.EntityDeclaration;
import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.model.OntoLClass;
import br.ufes.inf.nemo.ontol.model.ReferenceAssignment;
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
 * An implementation of the model object '<em><b>Entity Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.EntityDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.EntityDeclarationImpl#getInstantiatedClasses <em>Instantiated Classes</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.EntityDeclarationImpl#getAttAssignments <em>Att Assignments</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontol.model.impl.EntityDeclarationImpl#getRefAssignments <em>Ref Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityDeclarationImpl extends ModelElementImpl implements EntityDeclaration {
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
	 * The cached value of the '{@link #getInstantiatedClasses() <em>Instantiated Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatedClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<OntoLClass> instantiatedClasses;

	/**
	 * The cached value of the '{@link #getAttAssignments() <em>Att Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeAssignment> attAssignments;

	/**
	 * The cached value of the '{@link #getRefAssignments() <em>Ref Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceAssignment> refAssignments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ENTITY_DECLARATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY_DECLARATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OntoLClass> getInstantiatedClasses() {
		if (instantiatedClasses == null) {
			instantiatedClasses = new EObjectResolvingEList<OntoLClass>(OntoLClass.class, this, ModelPackage.ENTITY_DECLARATION__INSTANTIATED_CLASSES);
		}
		return instantiatedClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeAssignment> getAttAssignments() {
		if (attAssignments == null) {
			attAssignments = new EObjectContainmentEList<AttributeAssignment>(AttributeAssignment.class, this, ModelPackage.ENTITY_DECLARATION__ATT_ASSIGNMENTS);
		}
		return attAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceAssignment> getRefAssignments() {
		if (refAssignments == null) {
			refAssignments = new EObjectContainmentEList<ReferenceAssignment>(ReferenceAssignment.class, this, ModelPackage.ENTITY_DECLARATION__REF_ASSIGNMENTS);
		}
		return refAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ENTITY_DECLARATION__ATT_ASSIGNMENTS:
				return ((InternalEList<?>)getAttAssignments()).basicRemove(otherEnd, msgs);
			case ModelPackage.ENTITY_DECLARATION__REF_ASSIGNMENTS:
				return ((InternalEList<?>)getRefAssignments()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ENTITY_DECLARATION__NAME:
				return getName();
			case ModelPackage.ENTITY_DECLARATION__INSTANTIATED_CLASSES:
				return getInstantiatedClasses();
			case ModelPackage.ENTITY_DECLARATION__ATT_ASSIGNMENTS:
				return getAttAssignments();
			case ModelPackage.ENTITY_DECLARATION__REF_ASSIGNMENTS:
				return getRefAssignments();
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
			case ModelPackage.ENTITY_DECLARATION__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.ENTITY_DECLARATION__INSTANTIATED_CLASSES:
				getInstantiatedClasses().clear();
				getInstantiatedClasses().addAll((Collection<? extends OntoLClass>)newValue);
				return;
			case ModelPackage.ENTITY_DECLARATION__ATT_ASSIGNMENTS:
				getAttAssignments().clear();
				getAttAssignments().addAll((Collection<? extends AttributeAssignment>)newValue);
				return;
			case ModelPackage.ENTITY_DECLARATION__REF_ASSIGNMENTS:
				getRefAssignments().clear();
				getRefAssignments().addAll((Collection<? extends ReferenceAssignment>)newValue);
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
			case ModelPackage.ENTITY_DECLARATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.ENTITY_DECLARATION__INSTANTIATED_CLASSES:
				getInstantiatedClasses().clear();
				return;
			case ModelPackage.ENTITY_DECLARATION__ATT_ASSIGNMENTS:
				getAttAssignments().clear();
				return;
			case ModelPackage.ENTITY_DECLARATION__REF_ASSIGNMENTS:
				getRefAssignments().clear();
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
			case ModelPackage.ENTITY_DECLARATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.ENTITY_DECLARATION__INSTANTIATED_CLASSES:
				return instantiatedClasses != null && !instantiatedClasses.isEmpty();
			case ModelPackage.ENTITY_DECLARATION__ATT_ASSIGNMENTS:
				return attAssignments != null && !attAssignments.isEmpty();
			case ModelPackage.ENTITY_DECLARATION__REF_ASSIGNMENTS:
				return refAssignments != null && !refAssignments.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //EntityDeclarationImpl

/**
 */
package br.ufes.inf.nemo.ontol.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.ufes.inf.nemo.ontol.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='br.ufes.inf.nemo.ontol.model/src-gen' basePackage='br.ufes.inf.nemo.ontol'"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.nemo.inf.ufes.br/ontol/OntoL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__INCLUDES = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.ModelElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelElementImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.ImportImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 2;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED_NAMESPACE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.EntityDeclarationImpl <em>Entity Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.EntityDeclarationImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getEntityDeclaration()
	 * @generated
	 */
	int ENTITY_DECLARATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instantiated Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION__INSTANTIATED_CLASSES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Att Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION__ATT_ASSIGNMENTS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ref Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION__REF_ASSIGNMENTS = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Entity Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Entity Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.IndividualImpl <em>Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.IndividualImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getIndividual()
	 * @generated
	 */
	int INDIVIDUAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__NAME = ENTITY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Instantiated Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__INSTANTIATED_CLASSES = ENTITY_DECLARATION__INSTANTIATED_CLASSES;

	/**
	 * The feature id for the '<em><b>Att Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__ATT_ASSIGNMENTS = ENTITY_DECLARATION__ATT_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Ref Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__REF_ASSIGNMENTS = ENTITY_DECLARATION__REF_ASSIGNMENTS;

	/**
	 * The number of structural features of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_FEATURE_COUNT = ENTITY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OPERATION_COUNT = ENTITY_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.OntoLClassImpl <em>Onto LClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.OntoLClassImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getOntoLClass()
	 * @generated
	 */
	int ONTO_LCLASS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_LCLASS__NAME = ENTITY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Instantiated Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_LCLASS__INSTANTIATED_CLASSES = ENTITY_DECLARATION__INSTANTIATED_CLASSES;

	/**
	 * The feature id for the '<em><b>Att Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_LCLASS__ATT_ASSIGNMENTS = ENTITY_DECLARATION__ATT_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Ref Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_LCLASS__REF_ASSIGNMENTS = ENTITY_DECLARATION__REF_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_LCLASS__SUPER_CLASSES = ENTITY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Powertype Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_LCLASS__POWERTYPE_OF = ENTITY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Basetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_LCLASS__BASETYPE = ENTITY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subordinators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_LCLASS__SUBORDINATORS = ENTITY_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_LCLASS__ATTRIBUTES = ENTITY_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_LCLASS__REFERENCES = ENTITY_DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Categorization Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_LCLASS__CATEGORIZATION_TYPE = ENTITY_DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Onto LClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_LCLASS_FEATURE_COUNT = ENTITY_DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Onto LClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_LCLASS_OPERATION_COUNT = ENTITY_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.OrderlessClassImpl <em>Orderless Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.OrderlessClassImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getOrderlessClass()
	 * @generated
	 */
	int ORDERLESS_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__NAME = ONTO_LCLASS__NAME;

	/**
	 * The feature id for the '<em><b>Instantiated Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__INSTANTIATED_CLASSES = ONTO_LCLASS__INSTANTIATED_CLASSES;

	/**
	 * The feature id for the '<em><b>Att Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__ATT_ASSIGNMENTS = ONTO_LCLASS__ATT_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Ref Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__REF_ASSIGNMENTS = ONTO_LCLASS__REF_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__SUPER_CLASSES = ONTO_LCLASS__SUPER_CLASSES;

	/**
	 * The feature id for the '<em><b>Powertype Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__POWERTYPE_OF = ONTO_LCLASS__POWERTYPE_OF;

	/**
	 * The feature id for the '<em><b>Basetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__BASETYPE = ONTO_LCLASS__BASETYPE;

	/**
	 * The feature id for the '<em><b>Subordinators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__SUBORDINATORS = ONTO_LCLASS__SUBORDINATORS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__ATTRIBUTES = ONTO_LCLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__REFERENCES = ONTO_LCLASS__REFERENCES;

	/**
	 * The feature id for the '<em><b>Categorization Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__CATEGORIZATION_TYPE = ONTO_LCLASS__CATEGORIZATION_TYPE;

	/**
	 * The number of structural features of the '<em>Orderless Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS_FEATURE_COUNT = ONTO_LCLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Orderless Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS_OPERATION_COUNT = ONTO_LCLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.OrderedClassImpl <em>Ordered Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.OrderedClassImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getOrderedClass()
	 * @generated
	 */
	int ORDERED_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__NAME = ONTO_LCLASS__NAME;

	/**
	 * The feature id for the '<em><b>Instantiated Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__INSTANTIATED_CLASSES = ONTO_LCLASS__INSTANTIATED_CLASSES;

	/**
	 * The feature id for the '<em><b>Att Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__ATT_ASSIGNMENTS = ONTO_LCLASS__ATT_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Ref Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__REF_ASSIGNMENTS = ONTO_LCLASS__REF_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__SUPER_CLASSES = ONTO_LCLASS__SUPER_CLASSES;

	/**
	 * The feature id for the '<em><b>Powertype Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__POWERTYPE_OF = ONTO_LCLASS__POWERTYPE_OF;

	/**
	 * The feature id for the '<em><b>Basetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__BASETYPE = ONTO_LCLASS__BASETYPE;

	/**
	 * The feature id for the '<em><b>Subordinators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__SUBORDINATORS = ONTO_LCLASS__SUBORDINATORS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__ATTRIBUTES = ONTO_LCLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__REFERENCES = ONTO_LCLASS__REFERENCES;

	/**
	 * The feature id for the '<em><b>Categorization Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__CATEGORIZATION_TYPE = ONTO_LCLASS__CATEGORIZATION_TYPE;

	/**
	 * The number of structural features of the '<em>Ordered Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS_FEATURE_COUNT = ONTO_LCLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS_OPERATION_COUNT = ONTO_LCLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.HOClassImpl <em>HO Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.HOClassImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getHOClass()
	 * @generated
	 */
	int HO_CLASS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__NAME = ORDERED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Instantiated Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__INSTANTIATED_CLASSES = ORDERED_CLASS__INSTANTIATED_CLASSES;

	/**
	 * The feature id for the '<em><b>Att Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__ATT_ASSIGNMENTS = ORDERED_CLASS__ATT_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Ref Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__REF_ASSIGNMENTS = ORDERED_CLASS__REF_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__SUPER_CLASSES = ORDERED_CLASS__SUPER_CLASSES;

	/**
	 * The feature id for the '<em><b>Powertype Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__POWERTYPE_OF = ORDERED_CLASS__POWERTYPE_OF;

	/**
	 * The feature id for the '<em><b>Basetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__BASETYPE = ORDERED_CLASS__BASETYPE;

	/**
	 * The feature id for the '<em><b>Subordinators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__SUBORDINATORS = ORDERED_CLASS__SUBORDINATORS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__ATTRIBUTES = ORDERED_CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__REFERENCES = ORDERED_CLASS__REFERENCES;

	/**
	 * The feature id for the '<em><b>Categorization Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__CATEGORIZATION_TYPE = ORDERED_CLASS__CATEGORIZATION_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__ORDER = ORDERED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HO Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS_FEATURE_COUNT = ORDERED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HO Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS_OPERATION_COUNT = ORDERED_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.FOClassImpl <em>FO Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.FOClassImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getFOClass()
	 * @generated
	 */
	int FO_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__NAME = ORDERED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Instantiated Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__INSTANTIATED_CLASSES = ORDERED_CLASS__INSTANTIATED_CLASSES;

	/**
	 * The feature id for the '<em><b>Att Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__ATT_ASSIGNMENTS = ORDERED_CLASS__ATT_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Ref Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__REF_ASSIGNMENTS = ORDERED_CLASS__REF_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__SUPER_CLASSES = ORDERED_CLASS__SUPER_CLASSES;

	/**
	 * The feature id for the '<em><b>Powertype Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__POWERTYPE_OF = ORDERED_CLASS__POWERTYPE_OF;

	/**
	 * The feature id for the '<em><b>Basetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__BASETYPE = ORDERED_CLASS__BASETYPE;

	/**
	 * The feature id for the '<em><b>Subordinators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__SUBORDINATORS = ORDERED_CLASS__SUBORDINATORS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__ATTRIBUTES = ORDERED_CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__REFERENCES = ORDERED_CLASS__REFERENCES;

	/**
	 * The feature id for the '<em><b>Categorization Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__CATEGORIZATION_TYPE = ORDERED_CLASS__CATEGORIZATION_TYPE;

	/**
	 * The number of structural features of the '<em>FO Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS_FEATURE_COUNT = ORDERED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FO Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS_OPERATION_COUNT = ORDERED_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.GeneralizationSetImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getGeneralizationSet()
	 * @generated
	 */
	int GENERALIZATION_SET = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Disjoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__IS_DISJOINT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__IS_COMPLETE = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__GENERAL = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Categorizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__CATEGORIZER = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Specifics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__SPECIFICS = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Generalization Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Generalization Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.PropertyImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER_BOUND = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER_BOUND = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Regularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REGULARITY = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROPERTY_CLASS = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.AttributeImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LOWER_BOUND = PROPERTY__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UPPER_BOUND = PROPERTY__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Regularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REGULARITY = PROPERTY__REGULARITY;

	/**
	 * The feature id for the '<em><b>Property Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PROPERTY_CLASS = PROPERTY__PROPERTY_CLASS;

	/**
	 * The feature id for the '<em><b>Subset Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SUBSET_OF = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.ReferenceImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__LOWER_BOUND = PROPERTY__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__UPPER_BOUND = PROPERTY__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Regularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REGULARITY = PROPERTY__REGULARITY;

	/**
	 * The feature id for the '<em><b>Property Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__PROPERTY_CLASS = PROPERTY__PROPERTY_CLASS;

	/**
	 * The feature id for the '<em><b>Subset Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SUBSET_OF = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opposite To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__OPPOSITE_TO = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.PropertyAssignmentImpl <em>Property Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.PropertyAssignmentImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getPropertyAssignment()
	 * @generated
	 */
	int PROPERTY_ASSIGNMENT = 14;

	/**
	 * The number of structural features of the '<em>Property Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Property Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.AttributeAssignmentImpl <em>Attribute Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.AttributeAssignmentImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getAttributeAssignment()
	 * @generated
	 */
	int ATTRIBUTE_ASSIGNMENT = 15;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__ATTRIBUTE = PROPERTY_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__ASSIGNMENTS = PROPERTY_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT = PROPERTY_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_OPERATION_COUNT = PROPERTY_ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.ReferenceAssignmentImpl <em>Reference Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.ReferenceAssignmentImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getReferenceAssignment()
	 * @generated
	 */
	int REFERENCE_ASSIGNMENT = 16;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ASSIGNMENT__REFERENCE = PROPERTY_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ASSIGNMENT__ASSIGNMENTS = PROPERTY_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ASSIGNMENT_FEATURE_COUNT = PROPERTY_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reference Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ASSIGNMENT_OPERATION_COUNT = PROPERTY_ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.ValueImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 17;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.ReferenceValueImpl <em>Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.ReferenceValueImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getReferenceValue()
	 * @generated
	 */
	int REFERENCE_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.DataValueImpl <em>Data Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.DataValueImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getDataValue()
	 * @generated
	 */
	int DATA_VALUE = 19;

	/**
	 * The number of structural features of the '<em>Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.StringValueImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = DATA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = DATA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_OPERATION_COUNT = DATA_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.NumberValueImpl <em>Number Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.NumberValueImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getNumberValue()
	 * @generated
	 */
	int NUMBER_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__VALUE = DATA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_FEATURE_COUNT = DATA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_OPERATION_COUNT = DATA_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.BooleanValueImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = DATA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = DATA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_OPERATION_COUNT = DATA_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.NoneValueImpl <em>None Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.NoneValueImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getNoneValue()
	 * @generated
	 */
	int NONE_VALUE = 23;

	/**
	 * The number of structural features of the '<em>None Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_VALUE_FEATURE_COUNT = DATA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_VALUE___GET_VALUE = DATA_VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>None Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_VALUE_OPERATION_COUNT = DATA_VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.ComplexDataValueImpl <em>Complex Data Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.ComplexDataValueImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getComplexDataValue()
	 * @generated
	 */
	int COMPLEX_DATA_VALUE = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_VALUE__VALUE = DATA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unnamed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_VALUE__UNNAMED_VALUE = DATA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complex Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_VALUE_FEATURE_COUNT = DATA_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Complex Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_VALUE_OPERATION_COUNT = DATA_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.CategorizationType <em>Categorization Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.CategorizationType
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getCategorizationType()
	 * @generated
	 */
	int CATEGORIZATION_TYPE = 25;


	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontol.model.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ontol.model.Model#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Model#getIncludes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Includes();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ontol.model.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Elements();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.ModelElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontol.model.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.EntityDeclaration <em>Entity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Declaration</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.EntityDeclaration
	 * @generated
	 */
	EClass getEntityDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontol.model.EntityDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.EntityDeclaration#getName()
	 * @see #getEntityDeclaration()
	 * @generated
	 */
	EAttribute getEntityDeclaration_Name();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ontol.model.EntityDeclaration#getInstantiatedClasses <em>Instantiated Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instantiated Classes</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.EntityDeclaration#getInstantiatedClasses()
	 * @see #getEntityDeclaration()
	 * @generated
	 */
	EReference getEntityDeclaration_InstantiatedClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ontol.model.EntityDeclaration#getAttAssignments <em>Att Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Att Assignments</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.EntityDeclaration#getAttAssignments()
	 * @see #getEntityDeclaration()
	 * @generated
	 */
	EReference getEntityDeclaration_AttAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ontol.model.EntityDeclaration#getRefAssignments <em>Ref Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref Assignments</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.EntityDeclaration#getRefAssignments()
	 * @see #getEntityDeclaration()
	 * @generated
	 */
	EReference getEntityDeclaration_RefAssignments();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Individual
	 * @generated
	 */
	EClass getIndividual();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.OntoLClass <em>Onto LClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Onto LClass</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.OntoLClass
	 * @generated
	 */
	EClass getOntoLClass();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ontol.model.OntoLClass#getSuperClasses <em>Super Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Classes</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.OntoLClass#getSuperClasses()
	 * @see #getOntoLClass()
	 * @generated
	 */
	EReference getOntoLClass_SuperClasses();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontol.model.OntoLClass#getPowertypeOf <em>Powertype Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powertype Of</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.OntoLClass#getPowertypeOf()
	 * @see #getOntoLClass()
	 * @generated
	 */
	EReference getOntoLClass_PowertypeOf();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontol.model.OntoLClass#getBasetype <em>Basetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Basetype</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.OntoLClass#getBasetype()
	 * @see #getOntoLClass()
	 * @generated
	 */
	EReference getOntoLClass_Basetype();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ontol.model.OntoLClass#getSubordinators <em>Subordinators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subordinators</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.OntoLClass#getSubordinators()
	 * @see #getOntoLClass()
	 * @generated
	 */
	EReference getOntoLClass_Subordinators();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ontol.model.OntoLClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.OntoLClass#getAttributes()
	 * @see #getOntoLClass()
	 * @generated
	 */
	EReference getOntoLClass_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ontol.model.OntoLClass#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.OntoLClass#getReferences()
	 * @see #getOntoLClass()
	 * @generated
	 */
	EReference getOntoLClass_References();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontol.model.OntoLClass#getCategorizationType <em>Categorization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categorization Type</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.OntoLClass#getCategorizationType()
	 * @see #getOntoLClass()
	 * @generated
	 */
	EAttribute getOntoLClass_CategorizationType();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.OrderlessClass <em>Orderless Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orderless Class</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.OrderlessClass
	 * @generated
	 */
	EClass getOrderlessClass();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.OrderedClass <em>Ordered Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Class</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.OrderedClass
	 * @generated
	 */
	EClass getOrderedClass();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.HOClass <em>HO Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HO Class</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.HOClass
	 * @generated
	 */
	EClass getHOClass();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontol.model.HOClass#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.HOClass#getOrder()
	 * @see #getHOClass()
	 * @generated
	 */
	EAttribute getHOClass_Order();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.FOClass <em>FO Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FO Class</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.FOClass
	 * @generated
	 */
	EClass getFOClass();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.GeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization Set</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.GeneralizationSet
	 * @generated
	 */
	EClass getGeneralizationSet();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontol.model.GeneralizationSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.GeneralizationSet#getName()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EAttribute getGeneralizationSet_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontol.model.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Disjoint</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.GeneralizationSet#isIsDisjoint()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EAttribute getGeneralizationSet_IsDisjoint();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontol.model.GeneralizationSet#isIsComplete <em>Is Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Complete</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.GeneralizationSet#isIsComplete()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EAttribute getGeneralizationSet_IsComplete();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontol.model.GeneralizationSet#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>General</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.GeneralizationSet#getGeneral()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EReference getGeneralizationSet_General();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontol.model.GeneralizationSet#getCategorizer <em>Categorizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Categorizer</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.GeneralizationSet#getCategorizer()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EReference getGeneralizationSet_Categorizer();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ontol.model.GeneralizationSet#getSpecifics <em>Specifics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specifics</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.GeneralizationSet#getSpecifics()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EReference getGeneralizationSet_Specifics();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontol.model.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontol.model.Property#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Property#getLowerBound()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontol.model.Property#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Property#getUpperBound()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontol.model.Property#getRegularity <em>Regularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regularity</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Property#getRegularity()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Regularity();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontol.model.Property#getPropertyClass <em>Property Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Class</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Property#getPropertyClass()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_PropertyClass();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ontol.model.Attribute#getSubsetOf <em>Subset Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subset Of</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Attribute#getSubsetOf()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_SubsetOf();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ontol.model.Reference#getSubsetOf <em>Subset Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subset Of</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Reference#getSubsetOf()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_SubsetOf();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontol.model.Reference#getOppositeTo <em>Opposite To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite To</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Reference#getOppositeTo()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_OppositeTo();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.PropertyAssignment <em>Property Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Assignment</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.PropertyAssignment
	 * @generated
	 */
	EClass getPropertyAssignment();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.AttributeAssignment <em>Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Assignment</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.AttributeAssignment
	 * @generated
	 */
	EClass getAttributeAssignment();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontol.model.AttributeAssignment#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.AttributeAssignment#getAttribute()
	 * @see #getAttributeAssignment()
	 * @generated
	 */
	EReference getAttributeAssignment_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ontol.model.AttributeAssignment#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.AttributeAssignment#getAssignments()
	 * @see #getAttributeAssignment()
	 * @generated
	 */
	EReference getAttributeAssignment_Assignments();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.ReferenceAssignment <em>Reference Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Assignment</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.ReferenceAssignment
	 * @generated
	 */
	EClass getReferenceAssignment();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontol.model.ReferenceAssignment#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.ReferenceAssignment#getReference()
	 * @see #getReferenceAssignment()
	 * @generated
	 */
	EReference getReferenceAssignment_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ontol.model.ReferenceAssignment#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.ReferenceAssignment#getAssignments()
	 * @see #getReferenceAssignment()
	 * @generated
	 */
	EReference getReferenceAssignment_Assignments();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.ReferenceValue <em>Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Value</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.ReferenceValue
	 * @generated
	 */
	EClass getReferenceValue();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontol.model.ReferenceValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.ReferenceValue#getValue()
	 * @see #getReferenceValue()
	 * @generated
	 */
	EReference getReferenceValue_Value();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.DataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Value</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.DataValue
	 * @generated
	 */
	EClass getDataValue();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontol.model.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.NumberValue <em>Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Value</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.NumberValue
	 * @generated
	 */
	EClass getNumberValue();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontol.model.NumberValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.NumberValue#getValue()
	 * @see #getNumberValue()
	 * @generated
	 */
	EAttribute getNumberValue_Value();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontol.model.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.NoneValue <em>None Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>None Value</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.NoneValue
	 * @generated
	 */
	EClass getNoneValue();

	/**
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ontol.model.NoneValue#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see br.ufes.inf.nemo.ontol.model.NoneValue#getValue()
	 * @generated
	 */
	EOperation getNoneValue__GetValue();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.ComplexDataValue <em>Complex Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Data Value</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.ComplexDataValue
	 * @generated
	 */
	EClass getComplexDataValue();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontol.model.ComplexDataValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.ComplexDataValue#getValue()
	 * @see #getComplexDataValue()
	 * @generated
	 */
	EReference getComplexDataValue_Value();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufes.inf.nemo.ontol.model.ComplexDataValue#getUnnamedValue <em>Unnamed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unnamed Value</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.ComplexDataValue#getUnnamedValue()
	 * @see #getComplexDataValue()
	 * @generated
	 */
	EReference getComplexDataValue_UnnamedValue();

	/**
	 * Returns the meta object for enum '{@link br.ufes.inf.nemo.ontol.model.CategorizationType <em>Categorization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Categorization Type</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.CategorizationType
	 * @generated
	 */
	EEnum getCategorizationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__INCLUDES = eINSTANCE.getModel_Includes();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.ModelElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelElementImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.ImportImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.EntityDeclarationImpl <em>Entity Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.EntityDeclarationImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getEntityDeclaration()
		 * @generated
		 */
		EClass ENTITY_DECLARATION = eINSTANCE.getEntityDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_DECLARATION__NAME = eINSTANCE.getEntityDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Instantiated Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_DECLARATION__INSTANTIATED_CLASSES = eINSTANCE.getEntityDeclaration_InstantiatedClasses();

		/**
		 * The meta object literal for the '<em><b>Att Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_DECLARATION__ATT_ASSIGNMENTS = eINSTANCE.getEntityDeclaration_AttAssignments();

		/**
		 * The meta object literal for the '<em><b>Ref Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_DECLARATION__REF_ASSIGNMENTS = eINSTANCE.getEntityDeclaration_RefAssignments();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.IndividualImpl <em>Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.IndividualImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getIndividual()
		 * @generated
		 */
		EClass INDIVIDUAL = eINSTANCE.getIndividual();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.OntoLClassImpl <em>Onto LClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.OntoLClassImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getOntoLClass()
		 * @generated
		 */
		EClass ONTO_LCLASS = eINSTANCE.getOntoLClass();

		/**
		 * The meta object literal for the '<em><b>Super Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTO_LCLASS__SUPER_CLASSES = eINSTANCE.getOntoLClass_SuperClasses();

		/**
		 * The meta object literal for the '<em><b>Powertype Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTO_LCLASS__POWERTYPE_OF = eINSTANCE.getOntoLClass_PowertypeOf();

		/**
		 * The meta object literal for the '<em><b>Basetype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTO_LCLASS__BASETYPE = eINSTANCE.getOntoLClass_Basetype();

		/**
		 * The meta object literal for the '<em><b>Subordinators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTO_LCLASS__SUBORDINATORS = eINSTANCE.getOntoLClass_Subordinators();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTO_LCLASS__ATTRIBUTES = eINSTANCE.getOntoLClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTO_LCLASS__REFERENCES = eINSTANCE.getOntoLClass_References();

		/**
		 * The meta object literal for the '<em><b>Categorization Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTO_LCLASS__CATEGORIZATION_TYPE = eINSTANCE.getOntoLClass_CategorizationType();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.OrderlessClassImpl <em>Orderless Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.OrderlessClassImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getOrderlessClass()
		 * @generated
		 */
		EClass ORDERLESS_CLASS = eINSTANCE.getOrderlessClass();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.OrderedClassImpl <em>Ordered Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.OrderedClassImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getOrderedClass()
		 * @generated
		 */
		EClass ORDERED_CLASS = eINSTANCE.getOrderedClass();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.HOClassImpl <em>HO Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.HOClassImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getHOClass()
		 * @generated
		 */
		EClass HO_CLASS = eINSTANCE.getHOClass();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HO_CLASS__ORDER = eINSTANCE.getHOClass_Order();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.FOClassImpl <em>FO Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.FOClassImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getFOClass()
		 * @generated
		 */
		EClass FO_CLASS = eINSTANCE.getFOClass();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.GeneralizationSetImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getGeneralizationSet()
		 * @generated
		 */
		EClass GENERALIZATION_SET = eINSTANCE.getGeneralizationSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_SET__NAME = eINSTANCE.getGeneralizationSet_Name();

		/**
		 * The meta object literal for the '<em><b>Is Disjoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_SET__IS_DISJOINT = eINSTANCE.getGeneralizationSet_IsDisjoint();

		/**
		 * The meta object literal for the '<em><b>Is Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_SET__IS_COMPLETE = eINSTANCE.getGeneralizationSet_IsComplete();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_SET__GENERAL = eINSTANCE.getGeneralizationSet_General();

		/**
		 * The meta object literal for the '<em><b>Categorizer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_SET__CATEGORIZER = eINSTANCE.getGeneralizationSet_Categorizer();

		/**
		 * The meta object literal for the '<em><b>Specifics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_SET__SPECIFICS = eINSTANCE.getGeneralizationSet_Specifics();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.PropertyImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__LOWER_BOUND = eINSTANCE.getProperty_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__UPPER_BOUND = eINSTANCE.getProperty_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Regularity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__REGULARITY = eINSTANCE.getProperty_Regularity();

		/**
		 * The meta object literal for the '<em><b>Property Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__PROPERTY_CLASS = eINSTANCE.getProperty_PropertyClass();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.AttributeImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Subset Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__SUBSET_OF = eINSTANCE.getAttribute_SubsetOf();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.ReferenceImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Subset Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__SUBSET_OF = eINSTANCE.getReference_SubsetOf();

		/**
		 * The meta object literal for the '<em><b>Opposite To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__OPPOSITE_TO = eINSTANCE.getReference_OppositeTo();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.PropertyAssignmentImpl <em>Property Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.PropertyAssignmentImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getPropertyAssignment()
		 * @generated
		 */
		EClass PROPERTY_ASSIGNMENT = eINSTANCE.getPropertyAssignment();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.AttributeAssignmentImpl <em>Attribute Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.AttributeAssignmentImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getAttributeAssignment()
		 * @generated
		 */
		EClass ATTRIBUTE_ASSIGNMENT = eINSTANCE.getAttributeAssignment();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT__ATTRIBUTE = eINSTANCE.getAttributeAssignment_Attribute();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT__ASSIGNMENTS = eINSTANCE.getAttributeAssignment_Assignments();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.ReferenceAssignmentImpl <em>Reference Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.ReferenceAssignmentImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getReferenceAssignment()
		 * @generated
		 */
		EClass REFERENCE_ASSIGNMENT = eINSTANCE.getReferenceAssignment();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_ASSIGNMENT__REFERENCE = eINSTANCE.getReferenceAssignment_Reference();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_ASSIGNMENT__ASSIGNMENTS = eINSTANCE.getReferenceAssignment_Assignments();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.ValueImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.ReferenceValueImpl <em>Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.ReferenceValueImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getReferenceValue()
		 * @generated
		 */
		EClass REFERENCE_VALUE = eINSTANCE.getReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_VALUE__VALUE = eINSTANCE.getReferenceValue_Value();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.DataValueImpl <em>Data Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.DataValueImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getDataValue()
		 * @generated
		 */
		EClass DATA_VALUE = eINSTANCE.getDataValue();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.StringValueImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.NumberValueImpl <em>Number Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.NumberValueImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getNumberValue()
		 * @generated
		 */
		EClass NUMBER_VALUE = eINSTANCE.getNumberValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_VALUE__VALUE = eINSTANCE.getNumberValue_Value();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.BooleanValueImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.NoneValueImpl <em>None Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.NoneValueImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getNoneValue()
		 * @generated
		 */
		EClass NONE_VALUE = eINSTANCE.getNoneValue();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NONE_VALUE___GET_VALUE = eINSTANCE.getNoneValue__GetValue();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.ComplexDataValueImpl <em>Complex Data Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.ComplexDataValueImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getComplexDataValue()
		 * @generated
		 */
		EClass COMPLEX_DATA_VALUE = eINSTANCE.getComplexDataValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_DATA_VALUE__VALUE = eINSTANCE.getComplexDataValue_Value();

		/**
		 * The meta object literal for the '<em><b>Unnamed Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_DATA_VALUE__UNNAMED_VALUE = eINSTANCE.getComplexDataValue_UnnamedValue();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.CategorizationType <em>Categorization Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.CategorizationType
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getCategorizationType()
		 * @generated
		 */
		EEnum CATEGORIZATION_TYPE = eINSTANCE.getCategorizationType();

	}

} //ModelPackage

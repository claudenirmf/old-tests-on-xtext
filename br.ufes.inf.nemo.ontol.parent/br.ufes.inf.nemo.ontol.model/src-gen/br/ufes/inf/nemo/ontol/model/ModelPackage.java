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
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Fixed Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION__FIXED_TYPES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prop Assigns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION__PROP_ASSIGNS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Fixed Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__FIXED_TYPES = ENTITY_DECLARATION__FIXED_TYPES;

	/**
	 * The feature id for the '<em><b>Prop Assigns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__PROP_ASSIGNS = ENTITY_DECLARATION__PROP_ASSIGNS;

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
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.SetImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getSet()
	 * @generated
	 */
	int SET = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__NAME = INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Fixed Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__FIXED_TYPES = INDIVIDUAL__FIXED_TYPES;

	/**
	 * The feature id for the '<em><b>Prop Assigns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__PROP_ASSIGNS = INDIVIDUAL__PROP_ASSIGNS;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATION_COUNT = INDIVIDUAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.ClassImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = ENTITY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Fixed Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FIXED_TYPES = ENTITY_DECLARATION__FIXED_TYPES;

	/**
	 * The feature id for the '<em><b>Prop Assigns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PROP_ASSIGNS = ENTITY_DECLARATION__PROP_ASSIGNS;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPER_CLASSES = ENTITY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Powertype Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__POWERTYPE_OF = ENTITY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Basetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__BASETYPE = ENTITY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subordinators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUBORDINATORS = ENTITY_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PROPS = ENTITY_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CAT_TYPE = ENTITY_DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = ENTITY_DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = ENTITY_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.WClassImpl <em>WClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.WClassImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getWClass()
	 * @generated
	 */
	int WCLASS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLASS__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Fixed Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLASS__FIXED_TYPES = CLASS__FIXED_TYPES;

	/**
	 * The feature id for the '<em><b>Prop Assigns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLASS__PROP_ASSIGNS = CLASS__PROP_ASSIGNS;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLASS__SUPER_CLASSES = CLASS__SUPER_CLASSES;

	/**
	 * The feature id for the '<em><b>Powertype Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLASS__POWERTYPE_OF = CLASS__POWERTYPE_OF;

	/**
	 * The feature id for the '<em><b>Basetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLASS__BASETYPE = CLASS__BASETYPE;

	/**
	 * The feature id for the '<em><b>Subordinators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLASS__SUBORDINATORS = CLASS__SUBORDINATORS;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLASS__PROPS = CLASS__PROPS;

	/**
	 * The feature id for the '<em><b>Cat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLASS__CAT_TYPE = CLASS__CAT_TYPE;

	/**
	 * The number of structural features of the '<em>WClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLASS_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCLASS_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.OrderedClassImpl <em>Ordered Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.OrderedClassImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getOrderedClass()
	 * @generated
	 */
	int ORDERED_CLASS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Fixed Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__FIXED_TYPES = CLASS__FIXED_TYPES;

	/**
	 * The feature id for the '<em><b>Prop Assigns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__PROP_ASSIGNS = CLASS__PROP_ASSIGNS;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__SUPER_CLASSES = CLASS__SUPER_CLASSES;

	/**
	 * The feature id for the '<em><b>Powertype Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__POWERTYPE_OF = CLASS__POWERTYPE_OF;

	/**
	 * The feature id for the '<em><b>Basetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__BASETYPE = CLASS__BASETYPE;

	/**
	 * The feature id for the '<em><b>Subordinators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__SUBORDINATORS = CLASS__SUBORDINATORS;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__PROPS = CLASS__PROPS;

	/**
	 * The feature id for the '<em><b>Cat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__CAT_TYPE = CLASS__CAT_TYPE;

	/**
	 * The number of structural features of the '<em>Ordered Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.HOClassImpl <em>HO Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.HOClassImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getHOClass()
	 * @generated
	 */
	int HO_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__NAME = ORDERED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Fixed Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__FIXED_TYPES = ORDERED_CLASS__FIXED_TYPES;

	/**
	 * The feature id for the '<em><b>Prop Assigns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__PROP_ASSIGNS = ORDERED_CLASS__PROP_ASSIGNS;

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
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__PROPS = ORDERED_CLASS__PROPS;

	/**
	 * The feature id for the '<em><b>Cat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__CAT_TYPE = ORDERED_CLASS__CAT_TYPE;

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
	int FO_CLASS = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__NAME = ORDERED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Fixed Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__FIXED_TYPES = ORDERED_CLASS__FIXED_TYPES;

	/**
	 * The feature id for the '<em><b>Prop Assigns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__PROP_ASSIGNS = ORDERED_CLASS__PROP_ASSIGNS;

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
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__PROPS = ORDERED_CLASS__PROPS;

	/**
	 * The feature id for the '<em><b>Cat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__CAT_TYPE = ORDERED_CLASS__CAT_TYPE;

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
	int GENERALIZATION_SET = 11;

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
	int PROPERTY = 12;

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
	 * The feature id for the '<em><b>Property Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROPERTY_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subset Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SUBSET_OF = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Opposite To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OPPOSITE_TO = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Class Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CLASS_CONTAINER = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.PropertyAssignmentImpl <em>Property Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.PropertyAssignmentImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getPropertyAssignment()
	 * @generated
	 */
	int PROPERTY_ASSIGNMENT = 13;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT__PROPERTY = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT__ASSIGNMENT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT__CLASS_CONTAINER = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Property Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.ValueImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 14;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE___GET_NUMBER = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.ReferenceValueImpl <em>Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.ReferenceValueImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getReferenceValue()
	 * @generated
	 */
	int REFERENCE_VALUE = 15;

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
	 * The operation id for the '<em>Get Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VALUE___GET_NUMBER = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.ListValueImpl <em>List Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.ListValueImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getListValue()
	 * @generated
	 */
	int LIST_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE___GET_NUMBER = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.StringValueImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE___GET_NUMBER = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.NumberValueImpl <em>Number Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.NumberValueImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getNumberValue()
	 * @generated
	 */
	int NUMBER_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE___GET_NUMBER = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.BooleanValueImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE___GET_NUMBER = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.impl.NoneValueImpl <em>None Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.impl.NoneValueImpl
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getNoneValue()
	 * @generated
	 */
	int NONE_VALUE = 20;

	/**
	 * The number of structural features of the '<em>None Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_VALUE___GET_NUMBER = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>None Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ontol.model.CategorizationType <em>Categorization Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ontol.model.CategorizationType
	 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getCategorizationType()
	 * @generated
	 */
	int CATEGORIZATION_TYPE = 21;


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
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ontol.model.EntityDeclaration#getFixedTypes <em>Fixed Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fixed Types</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.EntityDeclaration#getFixedTypes()
	 * @see #getEntityDeclaration()
	 * @generated
	 */
	EReference getEntityDeclaration_FixedTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ontol.model.EntityDeclaration#getPropAssigns <em>Prop Assigns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop Assigns</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.EntityDeclaration#getPropAssigns()
	 * @see #getEntityDeclaration()
	 * @generated
	 */
	EReference getEntityDeclaration_PropAssigns();

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
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ontol.model.Class#getSuperClasses <em>Super Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Classes</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Class#getSuperClasses()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_SuperClasses();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontol.model.Class#getPowertypeOf <em>Powertype Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powertype Of</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Class#getPowertypeOf()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_PowertypeOf();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontol.model.Class#getBasetype <em>Basetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Basetype</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Class#getBasetype()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Basetype();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ontol.model.Class#getSubordinators <em>Subordinators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subordinators</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Class#getSubordinators()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Subordinators();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ontol.model.Class#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Props</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Class#getProps()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Props();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontol.model.Class#getCatType <em>Cat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cat Type</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Class#getCatType()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_CatType();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.WClass <em>WClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WClass</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.WClass
	 * @generated
	 */
	EClass getWClass();

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
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontol.model.Property#getPropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Type</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Property#getPropertyType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_PropertyType();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ontol.model.Property#getSubsetOf <em>Subset Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subset Of</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Property#getSubsetOf()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_SubsetOf();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontol.model.Property#getOppositeTo <em>Opposite To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite To</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Property#getOppositeTo()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_OppositeTo();

	/**
	 * Returns the meta object for the container reference '{@link br.ufes.inf.nemo.ontol.model.Property#getClassContainer <em>Class Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Class Container</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.Property#getClassContainer()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_ClassContainer();

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
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontol.model.PropertyAssignment#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.PropertyAssignment#getProperty()
	 * @see #getPropertyAssignment()
	 * @generated
	 */
	EReference getPropertyAssignment_Property();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufes.inf.nemo.ontol.model.PropertyAssignment#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignment</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.PropertyAssignment#getAssignment()
	 * @see #getPropertyAssignment()
	 * @generated
	 */
	EReference getPropertyAssignment_Assignment();

	/**
	 * Returns the meta object for the container reference '{@link br.ufes.inf.nemo.ontol.model.PropertyAssignment#getClassContainer <em>Class Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Class Container</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.PropertyAssignment#getClassContainer()
	 * @see #getPropertyAssignment()
	 * @generated
	 */
	EReference getPropertyAssignment_ClassContainer();

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
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ontol.model.Value#getNumber() <em>Get Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number</em>' operation.
	 * @see br.ufes.inf.nemo.ontol.model.Value#getNumber()
	 * @generated
	 */
	EOperation getValue__GetNumber();

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
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ontol.model.ReferenceValue#getNumber() <em>Get Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number</em>' operation.
	 * @see br.ufes.inf.nemo.ontol.model.ReferenceValue#getNumber()
	 * @generated
	 */
	EOperation getReferenceValue__GetNumber();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ontol.model.ListValue <em>List Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Value</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.ListValue
	 * @generated
	 */
	EClass getListValue();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ontol.model.ListValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see br.ufes.inf.nemo.ontol.model.ListValue#getValue()
	 * @see #getListValue()
	 * @generated
	 */
	EReference getListValue_Value();

	/**
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ontol.model.ListValue#getNumber() <em>Get Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number</em>' operation.
	 * @see br.ufes.inf.nemo.ontol.model.ListValue#getNumber()
	 * @generated
	 */
	EOperation getListValue__GetNumber();

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
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ontol.model.StringValue#getNumber() <em>Get Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number</em>' operation.
	 * @see br.ufes.inf.nemo.ontol.model.StringValue#getNumber()
	 * @generated
	 */
	EOperation getStringValue__GetNumber();

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
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ontol.model.NumberValue#getNumber() <em>Get Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number</em>' operation.
	 * @see br.ufes.inf.nemo.ontol.model.NumberValue#getNumber()
	 * @generated
	 */
	EOperation getNumberValue__GetNumber();

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
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ontol.model.BooleanValue#getNumber() <em>Get Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number</em>' operation.
	 * @see br.ufes.inf.nemo.ontol.model.BooleanValue#getNumber()
	 * @generated
	 */
	EOperation getBooleanValue__GetNumber();

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
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ontol.model.NoneValue#getNumber() <em>Get Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number</em>' operation.
	 * @see br.ufes.inf.nemo.ontol.model.NoneValue#getNumber()
	 * @generated
	 */
	EOperation getNoneValue__GetNumber();

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
		 * The meta object literal for the '<em><b>Fixed Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_DECLARATION__FIXED_TYPES = eINSTANCE.getEntityDeclaration_FixedTypes();

		/**
		 * The meta object literal for the '<em><b>Prop Assigns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_DECLARATION__PROP_ASSIGNS = eINSTANCE.getEntityDeclaration_PropAssigns();

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
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.SetImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.ClassImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Super Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SUPER_CLASSES = eINSTANCE.getClass_SuperClasses();

		/**
		 * The meta object literal for the '<em><b>Powertype Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__POWERTYPE_OF = eINSTANCE.getClass_PowertypeOf();

		/**
		 * The meta object literal for the '<em><b>Basetype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__BASETYPE = eINSTANCE.getClass_Basetype();

		/**
		 * The meta object literal for the '<em><b>Subordinators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SUBORDINATORS = eINSTANCE.getClass_Subordinators();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__PROPS = eINSTANCE.getClass_Props();

		/**
		 * The meta object literal for the '<em><b>Cat Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__CAT_TYPE = eINSTANCE.getClass_CatType();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.WClassImpl <em>WClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.WClassImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getWClass()
		 * @generated
		 */
		EClass WCLASS = eINSTANCE.getWClass();

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
		 * The meta object literal for the '<em><b>Property Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__PROPERTY_TYPE = eINSTANCE.getProperty_PropertyType();

		/**
		 * The meta object literal for the '<em><b>Subset Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__SUBSET_OF = eINSTANCE.getProperty_SubsetOf();

		/**
		 * The meta object literal for the '<em><b>Opposite To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__OPPOSITE_TO = eINSTANCE.getProperty_OppositeTo();

		/**
		 * The meta object literal for the '<em><b>Class Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__CLASS_CONTAINER = eINSTANCE.getProperty_ClassContainer();

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
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ASSIGNMENT__PROPERTY = eINSTANCE.getPropertyAssignment_Property();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ASSIGNMENT__ASSIGNMENT = eINSTANCE.getPropertyAssignment_Assignment();

		/**
		 * The meta object literal for the '<em><b>Class Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ASSIGNMENT__CLASS_CONTAINER = eINSTANCE.getPropertyAssignment_ClassContainer();

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
		 * The meta object literal for the '<em><b>Get Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE___GET_NUMBER = eINSTANCE.getValue__GetNumber();

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
		 * The meta object literal for the '<em><b>Get Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFERENCE_VALUE___GET_NUMBER = eINSTANCE.getReferenceValue__GetNumber();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ontol.model.impl.ListValueImpl <em>List Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ontol.model.impl.ListValueImpl
		 * @see br.ufes.inf.nemo.ontol.model.impl.ModelPackageImpl#getListValue()
		 * @generated
		 */
		EClass LIST_VALUE = eINSTANCE.getListValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_VALUE__VALUE = eINSTANCE.getListValue_Value();

		/**
		 * The meta object literal for the '<em><b>Get Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST_VALUE___GET_NUMBER = eINSTANCE.getListValue__GetNumber();

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
		 * The meta object literal for the '<em><b>Get Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRING_VALUE___GET_NUMBER = eINSTANCE.getStringValue__GetNumber();

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
		 * The meta object literal for the '<em><b>Get Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NUMBER_VALUE___GET_NUMBER = eINSTANCE.getNumberValue__GetNumber();

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
		 * The meta object literal for the '<em><b>Get Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOLEAN_VALUE___GET_NUMBER = eINSTANCE.getBooleanValue__GetNumber();

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
		 * The meta object literal for the '<em><b>Get Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NONE_VALUE___GET_NUMBER = eINSTANCE.getNoneValue__GetNumber();

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

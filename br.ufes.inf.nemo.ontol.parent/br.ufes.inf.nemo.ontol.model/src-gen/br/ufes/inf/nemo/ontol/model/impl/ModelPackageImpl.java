/**
 */
package br.ufes.inf.nemo.ontol.model.impl;

import br.ufes.inf.nemo.ontol.model.BooleanValue;
import br.ufes.inf.nemo.ontol.model.CategorizationType;
import br.ufes.inf.nemo.ontol.model.EntityDeclaration;
import br.ufes.inf.nemo.ontol.model.FOClass;
import br.ufes.inf.nemo.ontol.model.GeneralizationSet;
import br.ufes.inf.nemo.ontol.model.HOClass;
import br.ufes.inf.nemo.ontol.model.Import;
import br.ufes.inf.nemo.ontol.model.Individual;
import br.ufes.inf.nemo.ontol.model.ListValue;
import br.ufes.inf.nemo.ontol.model.Model;
import br.ufes.inf.nemo.ontol.model.ModelElement;
import br.ufes.inf.nemo.ontol.model.ModelFactory;
import br.ufes.inf.nemo.ontol.model.ModelPackage;

import br.ufes.inf.nemo.ontol.model.NoneValue;
import br.ufes.inf.nemo.ontol.model.NumberValue;
import br.ufes.inf.nemo.ontol.model.OrderedClass;
import br.ufes.inf.nemo.ontol.model.Property;
import br.ufes.inf.nemo.ontol.model.PropertyAssignment;
import br.ufes.inf.nemo.ontol.model.ReferenceValue;
import br.ufes.inf.nemo.ontol.model.Set;
import br.ufes.inf.nemo.ontol.model.StringValue;
import br.ufes.inf.nemo.ontol.model.Value;
import br.ufes.inf.nemo.ontol.model.WClass;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityDeclarationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wClassEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedClassEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hoClassEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foClassEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationSetEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyAssignmentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceValueEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listValueEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberValueEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noneValueEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum categorizationTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see br.ufes.inf.nemo.ontol.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Name() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Elements() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_ImportedNamespace() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityDeclaration() {
		return entityDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityDeclaration_Name() {
		return (EAttribute)entityDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityDeclaration_FixedTypes() {
		return (EReference)entityDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityDeclaration_PropAssigns() {
		return (EReference)entityDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividual() {
		return individualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSet() {
		return setEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_SuperClasses() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_PowertypeOf() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Basetype() {
		return (EReference)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Subordinators() {
		return (EReference)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Props() {
		return (EReference)classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_CatType() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWClass() {
		return wClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderedClass() {
		return orderedClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHOClass() {
		return hoClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHOClass_Order() {
		return (EAttribute)hoClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFOClass() {
		return foClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationSet() {
		return generalizationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_Name() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsDisjoint() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsComplete() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_General() {
		return (EReference)generalizationSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_Categorizer() {
		return (EReference)generalizationSetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_Specifics() {
		return (EReference)generalizationSetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_LowerBound() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_UpperBound() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_PropertyType() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_SubsetOf() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_OppositeTo() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_ClassContainer() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyAssignment() {
		return propertyAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyAssignment_Property() {
		return (EReference)propertyAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyAssignment_Assignment() {
		return (EReference)propertyAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyAssignment_ClassContainer() {
		return (EReference)propertyAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValue__GetNumber() {
		return valueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceValue() {
		return referenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceValue_Value() {
		return (EReference)referenceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReferenceValue__GetNumber() {
		return referenceValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListValue() {
		return listValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListValue_Value() {
		return (EReference)listValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getListValue__GetNumber() {
		return listValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValue_Value() {
		return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStringValue__GetNumber() {
		return stringValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberValue() {
		return numberValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberValue_Value() {
		return (EAttribute)numberValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumberValue__GetNumber() {
		return numberValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_Value() {
		return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooleanValue__GetNumber() {
		return booleanValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoneValue() {
		return noneValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNoneValue__GetNumber() {
		return noneValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCategorizationType() {
		return categorizationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__NAME);
		createEReference(modelEClass, MODEL__ELEMENTS);

		modelElementEClass = createEClass(MODEL_ELEMENT);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

		entityDeclarationEClass = createEClass(ENTITY_DECLARATION);
		createEAttribute(entityDeclarationEClass, ENTITY_DECLARATION__NAME);
		createEReference(entityDeclarationEClass, ENTITY_DECLARATION__FIXED_TYPES);
		createEReference(entityDeclarationEClass, ENTITY_DECLARATION__PROP_ASSIGNS);

		individualEClass = createEClass(INDIVIDUAL);

		setEClass = createEClass(SET);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__SUPER_CLASSES);
		createEReference(classEClass, CLASS__POWERTYPE_OF);
		createEReference(classEClass, CLASS__BASETYPE);
		createEReference(classEClass, CLASS__SUBORDINATORS);
		createEReference(classEClass, CLASS__PROPS);
		createEAttribute(classEClass, CLASS__CAT_TYPE);

		wClassEClass = createEClass(WCLASS);

		orderedClassEClass = createEClass(ORDERED_CLASS);

		hoClassEClass = createEClass(HO_CLASS);
		createEAttribute(hoClassEClass, HO_CLASS__ORDER);

		foClassEClass = createEClass(FO_CLASS);

		generalizationSetEClass = createEClass(GENERALIZATION_SET);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__NAME);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_DISJOINT);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_COMPLETE);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__GENERAL);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__CATEGORIZER);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__SPECIFICS);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__LOWER_BOUND);
		createEAttribute(propertyEClass, PROPERTY__UPPER_BOUND);
		createEReference(propertyEClass, PROPERTY__PROPERTY_TYPE);
		createEReference(propertyEClass, PROPERTY__SUBSET_OF);
		createEReference(propertyEClass, PROPERTY__OPPOSITE_TO);
		createEReference(propertyEClass, PROPERTY__CLASS_CONTAINER);

		propertyAssignmentEClass = createEClass(PROPERTY_ASSIGNMENT);
		createEReference(propertyAssignmentEClass, PROPERTY_ASSIGNMENT__PROPERTY);
		createEReference(propertyAssignmentEClass, PROPERTY_ASSIGNMENT__ASSIGNMENT);
		createEReference(propertyAssignmentEClass, PROPERTY_ASSIGNMENT__CLASS_CONTAINER);

		valueEClass = createEClass(VALUE);
		createEOperation(valueEClass, VALUE___GET_NUMBER);

		referenceValueEClass = createEClass(REFERENCE_VALUE);
		createEReference(referenceValueEClass, REFERENCE_VALUE__VALUE);
		createEOperation(referenceValueEClass, REFERENCE_VALUE___GET_NUMBER);

		listValueEClass = createEClass(LIST_VALUE);
		createEReference(listValueEClass, LIST_VALUE__VALUE);
		createEOperation(listValueEClass, LIST_VALUE___GET_NUMBER);

		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__VALUE);
		createEOperation(stringValueEClass, STRING_VALUE___GET_NUMBER);

		numberValueEClass = createEClass(NUMBER_VALUE);
		createEAttribute(numberValueEClass, NUMBER_VALUE__VALUE);
		createEOperation(numberValueEClass, NUMBER_VALUE___GET_NUMBER);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);
		createEOperation(booleanValueEClass, BOOLEAN_VALUE___GET_NUMBER);

		noneValueEClass = createEClass(NONE_VALUE);
		createEOperation(noneValueEClass, NONE_VALUE___GET_NUMBER);

		// Create enums
		categorizationTypeEEnum = createEEnum(CATEGORIZATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		importEClass.getESuperTypes().add(this.getModelElement());
		entityDeclarationEClass.getESuperTypes().add(this.getModelElement());
		individualEClass.getESuperTypes().add(this.getEntityDeclaration());
		setEClass.getESuperTypes().add(this.getIndividual());
		classEClass.getESuperTypes().add(this.getEntityDeclaration());
		wClassEClass.getESuperTypes().add(this.getClass_());
		orderedClassEClass.getESuperTypes().add(this.getClass_());
		hoClassEClass.getESuperTypes().add(this.getOrderedClass());
		foClassEClass.getESuperTypes().add(this.getOrderedClass());
		generalizationSetEClass.getESuperTypes().add(this.getModelElement());
		propertyEClass.getESuperTypes().add(this.getModelElement());
		propertyAssignmentEClass.getESuperTypes().add(this.getModelElement());
		valueEClass.getESuperTypes().add(this.getModelElement());
		referenceValueEClass.getESuperTypes().add(this.getValue());
		listValueEClass.getESuperTypes().add(this.getValue());
		stringValueEClass.getESuperTypes().add(this.getValue());
		numberValueEClass.getESuperTypes().add(this.getValue());
		booleanValueEClass.getESuperTypes().add(this.getValue());
		noneValueEClass.getESuperTypes().add(this.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Elements(), this.getModelElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportedNamespace(), theEcorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityDeclarationEClass, EntityDeclaration.class, "EntityDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityDeclaration_Name(), theEcorePackage.getEString(), "name", null, 0, 1, EntityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityDeclaration_FixedTypes(), this.getClass_(), null, "fixedTypes", null, 0, -1, EntityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityDeclaration_PropAssigns(), this.getPropertyAssignment(), this.getPropertyAssignment_ClassContainer(), "propAssigns", null, 0, -1, EntityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualEClass, Individual.class, "Individual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classEClass, br.ufes.inf.nemo.ontol.model.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_SuperClasses(), this.getClass_(), null, "superClasses", null, 0, -1, br.ufes.inf.nemo.ontol.model.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_PowertypeOf(), this.getClass_(), null, "powertypeOf", null, 0, 1, br.ufes.inf.nemo.ontol.model.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Basetype(), this.getClass_(), null, "basetype", null, 0, 1, br.ufes.inf.nemo.ontol.model.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Subordinators(), this.getClass_(), null, "subordinators", null, 0, -1, br.ufes.inf.nemo.ontol.model.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Props(), this.getProperty(), this.getProperty_ClassContainer(), "props", null, 0, -1, br.ufes.inf.nemo.ontol.model.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_CatType(), this.getCategorizationType(), "catType", "none", 0, 1, br.ufes.inf.nemo.ontol.model.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wClassEClass, WClass.class, "WClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderedClassEClass, OrderedClass.class, "OrderedClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hoClassEClass, HOClass.class, "HOClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHOClass_Order(), theEcorePackage.getEIntegerObject(), "order", null, 0, 1, HOClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foClassEClass, FOClass.class, "FOClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalizationSetEClass, GeneralizationSet.class, "GeneralizationSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralizationSet_Name(), theEcorePackage.getEString(), "name", null, 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationSet_IsDisjoint(), theEcorePackage.getEBoolean(), "isDisjoint", "false", 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationSet_IsComplete(), theEcorePackage.getEBoolean(), "isComplete", "false", 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralizationSet_General(), this.getClass_(), null, "general", null, 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralizationSet_Categorizer(), this.getClass_(), null, "categorizer", null, 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralizationSet_Specifics(), this.getClass_(), null, "specifics", null, 0, -1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_LowerBound(), theEcorePackage.getEIntegerObject(), "lowerBound", "1", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_UpperBound(), theEcorePackage.getEIntegerObject(), "upperBound", "1", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_PropertyType(), this.getClass_(), null, "propertyType", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_SubsetOf(), this.getProperty(), null, "subsetOf", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_OppositeTo(), this.getProperty(), null, "oppositeTo", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_ClassContainer(), this.getClass_(), this.getClass_Props(), "classContainer", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyAssignmentEClass, PropertyAssignment.class, "PropertyAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyAssignment_Property(), this.getProperty(), null, "property", null, 0, 1, PropertyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyAssignment_Assignment(), this.getValue(), null, "assignment", null, 0, 1, PropertyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyAssignment_ClassContainer(), this.getEntityDeclaration(), this.getEntityDeclaration_PropAssigns(), "classContainer", null, 0, 1, PropertyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getValue__GetNumber(), theEcorePackage.getEInt(), "getNumber", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(referenceValueEClass, ReferenceValue.class, "ReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceValue_Value(), this.getEntityDeclaration(), null, "value", null, 0, 1, ReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getReferenceValue__GetNumber(), theEcorePackage.getEInt(), "getNumber", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(listValueEClass, ListValue.class, "ListValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListValue_Value(), this.getValue(), null, "value", null, 0, -1, ListValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getListValue__GetNumber(), theEcorePackage.getEInt(), "getNumber", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_Value(), theEcorePackage.getEString(), "value", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStringValue__GetNumber(), theEcorePackage.getEInt(), "getNumber", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(numberValueEClass, NumberValue.class, "NumberValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberValue_Value(), theEcorePackage.getEDouble(), "value", null, 0, 1, NumberValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNumberValue__GetNumber(), theEcorePackage.getEInt(), "getNumber", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_Value(), theEcorePackage.getEBoolean(), "value", null, 0, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBooleanValue__GetNumber(), theEcorePackage.getEInt(), "getNumber", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(noneValueEClass, NoneValue.class, "NoneValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getNoneValue__GetNumber(), theEcorePackage.getEInt(), "getNumber", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(categorizationTypeEEnum, CategorizationType.class, "CategorizationType");
		addEEnumLiteral(categorizationTypeEEnum, CategorizationType.NONE);
		addEEnumLiteral(categorizationTypeEEnum, CategorizationType.CATEGORIZER);
		addEEnumLiteral(categorizationTypeEEnum, CategorizationType.DISJOINT_CATEGORIZER);
		addEEnumLiteral(categorizationTypeEEnum, CategorizationType.COMPLETE_CATEGORIZER);
		addEEnumLiteral(categorizationTypeEEnum, CategorizationType.PARTITIONER);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl

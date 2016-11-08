/**
 * generated by Xtext 2.10.0
 */
package br.ufes.inf.nemo.ontol.validation;

import br.ufes.inf.nemo.ontol.model.EntityDeclaration;
import br.ufes.inf.nemo.ontol.model.GeneralizationSet;
import br.ufes.inf.nemo.ontol.model.HOClass;
import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.model.OntoLClass;
import br.ufes.inf.nemo.ontol.util.OntoLUtils;
import br.ufes.inf.nemo.ontol.validation.AbstractOntoLValidator;
import br.ufes.inf.nemo.ontol.validation.LinguisticRules;
import br.ufes.inf.nemo.ontol.validation.MLTRules;
import com.google.inject.Inject;
import java.util.LinkedHashSet;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class OntoLValidator extends AbstractOntoLValidator {
  @Inject
  @Extension
  private OntoLUtils _ontoLUtils;
  
  @Inject
  @Extension
  private LinguisticRules _linguisticRules;
  
  @Inject
  @Extension
  private MLTRules _mLTRules;
  
  public final static String INSTANTIATION_OF_DISJOINT_TYPES = "br.ufes.inf.nemo.ontol.InstantiationOfDisjointTypes";
  
  public final static String MISSING_COMPLETE_INSTANTIATION = "br.ufes.inf.nemo.ontol.MissingCompleteInstantiation";
  
  public final static String POWERTYPE_COMPLETE_SPECIALIZATION = "br.ufes.inf.nemo.ontol.PowertypeCompleteSpecialization";
  
  public final static String COMPLETE_CHARACTERIZATION_AND_COMPLETENESS = "br.ufes.inf.nemo.ontol.CompleteCharacterizationAndCompleteness";
  
  public final static String DISJOINT_CHARACTERIZATION_AND_DISJOINTNESS = "br.ufes.inf.nemo.ontol.DisjointCharacterizationAndDisjointness";
  
  public final static String MANDATORY_SPECIALIZATION_OF_ENDURANT = "br.ufes.inf.nemo.ontol.MandaorySpecializationOfEndurant";
  
  public final static String NONSORTAL_SPECIALIZING_SORTAL = "br.ufes.inf.nemo.ontol.NonSortalSpecializingSortal";
  
  public final static String RIGID_SPECIALIZING_ANTIRIGID = "br.ufes.inf.nemo.ontol.RigidSpecializingAntiRigid";
  
  public final static String SEMIRIGID_SPECIALIZING_ANTIRIGID = "br.ufes.inf.nemo.ontol.SemiRigidSpecializingAntiRigid";
  
  public final static String MULTIPLE_IDENTITIES = "br.ufes.inf.nemo.ontol.MultipleIdentities";
  
  public final static String MISSING_IDENTITY = "br.ufes.inf.nemo.ontol.MissingIdentity";
  
  public final static String NECESSARY_INSTANTIATION = "br.ufes.inf.nemo.ontol.NecessaryInstantiation";
  
  public final static String MISSING_SPECIALIZATION_TO_BASETYPE = "br.ufes.inf.nemo.ontol.MissingSpecializationToBasetype";
  
  @Check(CheckType.FAST)
  public void fastChecksOnEntityDeclaration(final EntityDeclaration e) {
    boolean _isNameValid = this._linguisticRules.isNameValid(e);
    boolean _not = (!_isNameValid);
    if (_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Entity name must start with a capital letter.");
      EAttribute _entityDeclaration_Name = ModelPackage.eINSTANCE.getEntityDeclaration_Name();
      this.error(_builder.toString(), _entityDeclaration_Name, 
        LinguisticRules.INVALID_ENTITY_DECLARATION_NAME);
    }
    boolean _duplicatedEntityName = this._linguisticRules.duplicatedEntityName(e);
    if (_duplicatedEntityName) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Entity name must be unique.");
      EAttribute _entityDeclaration_Name_1 = ModelPackage.eINSTANCE.getEntityDeclaration_Name();
      this.error(_builder_1.toString(), _entityDeclaration_Name_1, 
        LinguisticRules.DUPLICATED_ENTITY_NAME);
    }
  }
  
  @Check(CheckType.FAST)
  public void fastCheckOnClass(final OntoLClass c) {
    final LinkedHashSet<OntoLClass> ch = this._ontoLUtils.classHierarchy(c);
    boolean _isValidSpecialization = this._linguisticRules.isValidSpecialization(c);
    boolean _not = (!_isValidSpecialization);
    if (_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Invalid specialization.");
      EReference _ontoLClass_SuperClasses = ModelPackage.eINSTANCE.getOntoLClass_SuperClasses();
      this.error(_builder.toString(), _ontoLClass_SuperClasses, 
        LinguisticRules.INVALID_CLASS_SPECIALIZATION);
    }
    boolean _hasCyclicSpecialization = this._linguisticRules.hasCyclicSpecialization(c, ch);
    if (_hasCyclicSpecialization) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Invalid cyclic specialization.");
      EReference _ontoLClass_SuperClasses_1 = ModelPackage.eINSTANCE.getOntoLClass_SuperClasses();
      this.error(_builder_1.toString(), _ontoLClass_SuperClasses_1, 
        LinguisticRules.CYCLIC_SPECIALIZATION);
    }
    boolean _hasValidBasetype = this._linguisticRules.hasValidBasetype(c);
    boolean _not_1 = (!_hasValidBasetype);
    if (_not_1) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("Invalid basetype.");
      EReference _ontoLClass_Basetype = ModelPackage.eINSTANCE.getOntoLClass_Basetype();
      this.error(_builder_2.toString(), _ontoLClass_Basetype, 
        LinguisticRules.INVALID_BASETYPE);
    }
    boolean _hasValidPowertypeRelation = this._linguisticRules.hasValidPowertypeRelation(c);
    boolean _not_2 = (!_hasValidPowertypeRelation);
    if (_not_2) {
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("Invalid powertype relation.");
      EReference _ontoLClass_PowertypeOf = ModelPackage.eINSTANCE.getOntoLClass_PowertypeOf();
      this.error(_builder_3.toString(), _ontoLClass_PowertypeOf, 
        LinguisticRules.INVALID_POWERTYPE_RELATION);
    }
    boolean _hasValidSubordinators = this._linguisticRules.hasValidSubordinators(c);
    boolean _not_3 = (!_hasValidSubordinators);
    if (_not_3) {
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("Invalid subordinator.");
      EReference _ontoLClass_Subordinators = ModelPackage.eINSTANCE.getOntoLClass_Subordinators();
      this.error(_builder_4.toString(), _ontoLClass_Subordinators, 
        LinguisticRules.INVALID_SUBORDINATOR);
    }
  }
  
  @Check(CheckType.FAST)
  public void fastChecksOnHOClass(final HOClass ho) {
    boolean _minOrder = this._mLTRules.minOrder(ho);
    boolean _not = (!_minOrder);
    if (_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Order must be of ");
      _builder.append(MLTRules.MIN_ORDER, "");
      _builder.append(" or greater.");
      EAttribute _hOClass_Order = ModelPackage.eINSTANCE.getHOClass_Order();
      this.error(_builder.toString(), _hOClass_Order, 
        MLTRules.INVALID_HO_CLASS_ORDER);
    }
  }
  
  @Check(CheckType.FAST)
  public void fastChecksOnGeneralizationSet(final GeneralizationSet gs) {
    boolean _hasValidMembers = this._linguisticRules.hasValidMembers(gs);
    boolean _not = (!_hasValidMembers);
    if (_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("This generalization set has invalid members.");
      EAttribute _generalizationSet_Name = ModelPackage.eINSTANCE.getGeneralizationSet_Name();
      this.error(_builder.toString(), _generalizationSet_Name, 
        LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS);
    }
  }
  
  @Check(CheckType.NORMAL)
  public void normalChecksOnEntity(final EntityDeclaration e) {
    final LinkedHashSet<OntoLClass> iof = this._ontoLUtils.getAllInstantiatedClasses(e);
    boolean _isInstanceOfDisjointClasses = this._linguisticRules.isInstanceOfDisjointClasses(e, iof);
    if (_isInstanceOfDisjointClasses) {
      StringConcatenation _builder = new StringConcatenation();
      String _name = e.getName();
      _builder.append(_name, "");
      _builder.append(" is instance of disjoint classes.");
      EReference _entityDeclaration_InstantiatedClasses = ModelPackage.eINSTANCE.getEntityDeclaration_InstantiatedClasses();
      this.error(_builder.toString(), _entityDeclaration_InstantiatedClasses, 
        LinguisticRules.INSTANCE_OF_DISJOINT_CLASSES);
    }
    boolean _missingInstantiationByCompleteness = this._linguisticRules.missingInstantiationByCompleteness(e, iof);
    if (_missingInstantiationByCompleteness) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Missing instantion of complete generalization set.");
      EReference _entityDeclaration_InstantiatedClasses_1 = ModelPackage.eINSTANCE.getEntityDeclaration_InstantiatedClasses();
      this.error(_builder_1.toString(), _entityDeclaration_InstantiatedClasses_1, 
        LinguisticRules.MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET);
    }
  }
  
  @Check(CheckType.NORMAL)
  public void normalChecksOnClass(final OntoLClass c) {
    final LinkedHashSet<OntoLClass> ch = this._ontoLUtils.classHierarchy(c);
    final LinkedHashSet<OntoLClass> iof = this._ontoLUtils.getAllInstantiatedClasses(c);
    boolean _isMissingSpecializationThroughPowertype = this._mLTRules.isMissingSpecializationThroughPowertype(c, ch);
    if (_isMissingSpecializationThroughPowertype) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Missing specialization through powertype relation.");
      EReference _ontoLClass_SuperClasses = ModelPackage.eINSTANCE.getOntoLClass_SuperClasses();
      this.error(_builder.toString(), _ontoLClass_SuperClasses, 
        MLTRules.MISSING_SPECIALIZATION_THROUGH_POWERTYPE);
    }
    boolean _obeysSubordination = this._linguisticRules.obeysSubordination(c, ch, iof);
    boolean _not = (!_obeysSubordination);
    if (_not) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Missing specialization through subordination.");
      EReference _ontoLClass_SuperClasses_1 = ModelPackage.eINSTANCE.getOntoLClass_SuperClasses();
      this.error(_builder_1.toString(), _ontoLClass_SuperClasses_1, 
        LinguisticRules.MISSING_SPECIALIZATION_THROUGH_SUBODINATION);
    }
    boolean _hasSimpleSubordinationCycle = this._linguisticRules.hasSimpleSubordinationCycle(c);
    if (_hasSimpleSubordinationCycle) {
      StringConcatenation _builder_2 = new StringConcatenation();
      String _name = c.getName();
      _builder_2.append(_name, "");
      _builder_2.append(" is in a subordination cycle.");
      EReference _ontoLClass_Subordinators = ModelPackage.eINSTANCE.getOntoLClass_Subordinators();
      this.error(_builder_2.toString(), _ontoLClass_Subordinators, 
        LinguisticRules.SIMPLE_SUBORDINATION_CYCLE);
    }
    boolean _isSpecializingDisjointClasses = this._linguisticRules.isSpecializingDisjointClasses(c, ch);
    if (_isSpecializingDisjointClasses) {
      StringConcatenation _builder_3 = new StringConcatenation();
      String _name_1 = c.getName();
      _builder_3.append(_name_1, "");
      _builder_3.append(" is specializing disjoint classes.");
      EReference _ontoLClass_Subordinators_1 = ModelPackage.eINSTANCE.getOntoLClass_Subordinators();
      this.error(_builder_3.toString(), _ontoLClass_Subordinators_1, 
        LinguisticRules.SPECILIZATION_OF_DISJOINT_CLASSES);
    }
  }
}

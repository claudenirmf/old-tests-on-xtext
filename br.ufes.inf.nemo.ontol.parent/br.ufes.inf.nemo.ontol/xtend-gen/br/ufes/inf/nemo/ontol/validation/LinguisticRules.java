package br.ufes.inf.nemo.ontol.validation;

import br.ufes.inf.nemo.ontol.model.Attribute;
import br.ufes.inf.nemo.ontol.model.AttributeAssignment;
import br.ufes.inf.nemo.ontol.model.ComplexDataValue;
import br.ufes.inf.nemo.ontol.model.DataValue;
import br.ufes.inf.nemo.ontol.model.EntityDeclaration;
import br.ufes.inf.nemo.ontol.model.FOClass;
import br.ufes.inf.nemo.ontol.model.GeneralizationSet;
import br.ufes.inf.nemo.ontol.model.HOClass;
import br.ufes.inf.nemo.ontol.model.Model;
import br.ufes.inf.nemo.ontol.model.ModelElement;
import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.model.OntoLClass;
import br.ufes.inf.nemo.ontol.model.OrderedClass;
import br.ufes.inf.nemo.ontol.model.OrderlessClass;
import br.ufes.inf.nemo.ontol.model.Property;
import br.ufes.inf.nemo.ontol.model.PropertyAssignment;
import br.ufes.inf.nemo.ontol.model.Reference;
import br.ufes.inf.nemo.ontol.model.ReferenceAssignment;
import br.ufes.inf.nemo.ontol.model.ReferenceValue;
import br.ufes.inf.nemo.ontol.model.Value;
import br.ufes.inf.nemo.ontol.util.OntoLIndex;
import br.ufes.inf.nemo.ontol.util.OntoLUtils;
import br.ufes.inf.nemo.ontol.validation.MLTRules;
import br.ufes.inf.nemo.ontol.validation.ValidationError;
import br.ufes.inf.nemo.ontol.validation.ValidationIssue;
import br.ufes.inf.nemo.ontol.validation.ValidationWarning;
import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class LinguisticRules {
  @Inject
  @Extension
  private OntoLUtils _ontoLUtils;
  
  @Inject
  @Extension
  private OntoLIndex _ontoLIndex;
  
  public final static String INVALID_ENTITY_DECLARATION_NAME = "br.ufes.inf.nemo.ontol.InvalidEntityDeclarationName";
  
  public final static String INVALID_CLASS_SPECIALIZATION = "br.ufes.inf.nemo.ontol.InvalidClassSpecialization";
  
  public final static String CYCLIC_SPECIALIZATION = "br.ufes.inf.nemo.ontol.CycliSpecialization";
  
  public final static String INVALID_BASETYPE = "br.ufes.inf.nemo.ontol.InvalidBasetype";
  
  public final static String INVALID_POWERTYPE_RELATION = "br.ufes.inf.nemo.ontol.InvalidPowertypeRelation";
  
  public final static String INVALID_SUBORDINATOR = "br.ufes.inf.nemo.ontol.InvalidSubordinator";
  
  public final static String DUPLICATED_ENTITY_NAME = "br.ufes.inf.nemo.ontol.DuplicatedEntityName";
  
  public final static String INVALID_GENERALIZATION_SET_MEMBERS = "br.ufes.inf.nemo.ontol.InvalidGeneralizationSetMembers";
  
  public final static String MISSING_SPECIALIZATION_THROUGH_SUBODINATION = "br.ufes.inf.nemo.ontol.MissingSpecializationThroughSubordination";
  
  public final static String SIMPLE_SUBORDINATION_CYCLE = "br.ufes.inf.nemo.ontol.SimpleSubordinationCycle";
  
  public final static String SPECILIZATION_OF_DISJOINT_CLASSES = "br.ufes.inf.nemo.ontol.SpecializationOfDisjointClasses";
  
  public final static String INSTANCE_OF_DISJOINT_CLASSES = "br.ufes.inf.nemo.ontol.InstanceOfDisjointClasses";
  
  public final static String MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET = "br.ufes.inf.nemo.ontol.MissingInstantiationOfCompleteGeneralizationSet";
  
  public final static String INVALID_MULTIPLICITY = "br.ufes.inf.nemo.ontol.InvalidMultiplicity";
  
  public final static String NON_CONFORMANT_ASSIGNMENT = "br.ufes.inf.nemo.ontol.NonConformantAssigment";
  
  public final static String FIRST_ORDER_REGULARITY = "br.ufes.inf.nemo.ontol.FirstOrderRegularity";
  
  public final static String MISSING_ASSIGNMENT_BY_REGULARITY = "br.ufes.inf.nemo.ontol.MissingAssignmentByRegularity";
  
  public boolean isNameValid(final EntityDeclaration e) {
    if (((!e.getName().equals(StringExtensions.toFirstLower(e.getName()))) || (e.eContainer() instanceof ComplexDataValue))) {
      return true;
    } else {
      return false;
    }
  }
  
  public boolean isValidSpecialization(final OntoLClass c) {
    EList<OntoLClass> _superClasses = c.getSuperClasses();
    final Function1<OntoLClass, Boolean> _function = (OntoLClass it) -> {
      return Boolean.valueOf(Objects.equal(it, c));
    };
    boolean _exists = IterableExtensions.<OntoLClass>exists(_superClasses, _function);
    if (_exists) {
      return false;
    } else {
      boolean _and = false;
      if (!(c instanceof OrderlessClass)) {
        _and = false;
      } else {
        EList<OntoLClass> _superClasses_1 = c.getSuperClasses();
        final Function1<OntoLClass, Boolean> _function_1 = (OntoLClass it) -> {
          return Boolean.valueOf((it instanceof OrderedClass));
        };
        boolean _exists_1 = IterableExtensions.<OntoLClass>exists(_superClasses_1, _function_1);
        _and = _exists_1;
      }
      if (_and) {
        return false;
      } else {
        boolean _and_1 = false;
        if (!(c instanceof FOClass)) {
          _and_1 = false;
        } else {
          EList<OntoLClass> _superClasses_2 = c.getSuperClasses();
          final Function1<OntoLClass, Boolean> _function_2 = (OntoLClass it) -> {
            return Boolean.valueOf((it instanceof HOClass));
          };
          boolean _exists_2 = IterableExtensions.<OntoLClass>exists(_superClasses_2, _function_2);
          _and_1 = _exists_2;
        }
        if (_and_1) {
          return false;
        } else {
          boolean _and_2 = false;
          if (!(c instanceof HOClass)) {
            _and_2 = false;
          } else {
            EList<OntoLClass> _superClasses_3 = c.getSuperClasses();
            final Function1<OntoLClass, Boolean> _function_3 = (OntoLClass it) -> {
              return Boolean.valueOf((it instanceof FOClass));
            };
            boolean _exists_3 = IterableExtensions.<OntoLClass>exists(_superClasses_3, _function_3);
            _and_2 = _exists_3;
          }
          if (_and_2) {
            return false;
          } else {
            if ((c instanceof HOClass)) {
              EList<OntoLClass> _superClasses_4 = ((HOClass)c).getSuperClasses();
              final Function1<OntoLClass, Boolean> _function_4 = (OntoLClass it) -> {
                boolean _xifexpression = false;
                boolean _and_3 = false;
                if (!(it instanceof HOClass)) {
                  _and_3 = false;
                } else {
                  Integer _order = ((HOClass) it).getOrder();
                  Integer _order_1 = ((HOClass)c).getOrder();
                  boolean _notEquals = (!Objects.equal(_order, _order_1));
                  _and_3 = _notEquals;
                }
                if (_and_3) {
                  _xifexpression = true;
                } else {
                  _xifexpression = false;
                }
                return Boolean.valueOf(_xifexpression);
              };
              boolean _exists_4 = IterableExtensions.<OntoLClass>exists(_superClasses_4, _function_4);
              return (!_exists_4);
            } else {
              return true;
            }
          }
        }
      }
    }
  }
  
  public boolean hasCyclicSpecialization(final OntoLClass c, final Set<OntoLClass> ch) {
    boolean _xifexpression = false;
    boolean _contains = ch.contains(c);
    if (_contains) {
      _xifexpression = true;
    } else {
      _xifexpression = false;
    }
    return _xifexpression;
  }
  
  public boolean hasValidBasetype(final OntoLClass c) {
    final OntoLClass b = c.getBasetype();
    boolean _equals = Objects.equal(b, null);
    if (_equals) {
      return true;
    } else {
      if ((c instanceof HOClass)) {
        if ((b instanceof OrderlessClass)) {
          return false;
        } else {
          Integer _order = ((HOClass)c).getOrder();
          boolean _equals_1 = ((_order).intValue() == MLTRules.MIN_ORDER);
          if (_equals_1) {
            if ((b instanceof FOClass)) {
              return true;
            } else {
              return false;
            }
          } else {
            boolean _and = false;
            Integer _order_1 = ((HOClass)c).getOrder();
            boolean _notEquals = ((_order_1).intValue() != MLTRules.MIN_ORDER);
            if (!_notEquals) {
              _and = false;
            } else {
              _and = (b instanceof HOClass);
            }
            if (_and) {
              Integer _order_2 = ((HOClass)c).getOrder();
              Integer _order_3 = ((HOClass) b).getOrder();
              int _plus = ((_order_3).intValue() + 1);
              return ((_order_2).intValue() == _plus);
            }
          }
        }
      } else {
        return true;
      }
    }
    return false;
  }
  
  public boolean hasValidPowertypeRelation(final OntoLClass c) {
    final OntoLClass b = c.getPowertypeOf();
    boolean _equals = Objects.equal(b, null);
    if (_equals) {
      return true;
    } else {
      if ((c instanceof HOClass)) {
        if ((b instanceof OrderlessClass)) {
          return false;
        } else {
          Integer _order = ((HOClass)c).getOrder();
          boolean _equals_1 = ((_order).intValue() == MLTRules.MIN_ORDER);
          if (_equals_1) {
            if ((b instanceof FOClass)) {
              return true;
            } else {
              return false;
            }
          } else {
            boolean _and = false;
            Integer _order_1 = ((HOClass)c).getOrder();
            boolean _notEquals = ((_order_1).intValue() != MLTRules.MIN_ORDER);
            if (!_notEquals) {
              _and = false;
            } else {
              _and = (b instanceof HOClass);
            }
            if (_and) {
              Integer _order_2 = ((HOClass)c).getOrder();
              Integer _order_3 = ((HOClass) b).getOrder();
              int _plus = ((_order_3).intValue() + 1);
              return ((_order_2).intValue() == _plus);
            }
          }
        }
      } else {
        return true;
      }
    }
    return false;
  }
  
  public boolean hasValidSubordinators(final OntoLClass c) {
    if ((c instanceof HOClass)) {
      EList<OntoLClass> _subordinators = ((HOClass)c).getSubordinators();
      final Function1<OntoLClass, Boolean> _function = (OntoLClass it) -> {
        boolean _equals = Objects.equal(it, c);
        if (_equals) {
          return Boolean.valueOf(true);
        } else {
          if ((it instanceof FOClass)) {
            return Boolean.valueOf(true);
          } else {
            boolean _and = false;
            if (!(it instanceof HOClass)) {
              _and = false;
            } else {
              Integer _order = ((HOClass) it).getOrder();
              Integer _order_1 = ((HOClass)c).getOrder();
              boolean _notEquals = (!Objects.equal(_order, _order_1));
              _and = _notEquals;
            }
            if (_and) {
              return Boolean.valueOf(true);
            } else {
              return Boolean.valueOf(false);
            }
          }
        }
      };
      boolean _exists = IterableExtensions.<OntoLClass>exists(_subordinators, _function);
      return (!_exists);
    } else {
      return true;
    }
  }
  
  public boolean duplicatedEntityName(final EntityDeclaration e) {
    EObject _eContainer = e.eContainer();
    if ((_eContainer instanceof ComplexDataValue)) {
      return false;
    }
    EObject _eContainer_1 = e.eContainer();
    final Model model = ((Model) _eContainer_1);
    EList<ModelElement> _elements = model.getElements();
    final Function1<ModelElement, Boolean> _function = (ModelElement it) -> {
      boolean _xifexpression = false;
      if ((it instanceof EntityDeclaration)) {
        boolean _and = false;
        String _name = ((EntityDeclaration)it).getName();
        String _name_1 = e.getName();
        boolean _equals = _name.equals(_name_1);
        if (!_equals) {
          _and = false;
        } else {
          boolean _notEquals = (!Objects.equal(it, e));
          _and = _notEquals;
        }
        _xifexpression = _and;
      } else {
        _xifexpression = false;
      }
      return Boolean.valueOf(_xifexpression);
    };
    return IterableExtensions.<ModelElement>exists(_elements, _function);
  }
  
  public boolean hasValidMembers(final GeneralizationSet gs) {
    EList<OntoLClass> _specifics = gs.getSpecifics();
    final Function1<OntoLClass, Boolean> _function = (OntoLClass it) -> {
      EList<OntoLClass> _superClasses = it.getSuperClasses();
      OntoLClass _general = gs.getGeneral();
      boolean _contains = _superClasses.contains(_general);
      return Boolean.valueOf((!_contains));
    };
    boolean _exists = IterableExtensions.<OntoLClass>exists(_specifics, _function);
    if (_exists) {
      return false;
    } else {
      boolean _and = false;
      OntoLClass _categorizer = gs.getCategorizer();
      OntoLClass _basetype = _categorizer.getBasetype();
      boolean _notEquals = (!Objects.equal(_basetype, null));
      if (!_notEquals) {
        _and = false;
      } else {
        OntoLClass _categorizer_1 = gs.getCategorizer();
        OntoLClass _basetype_1 = _categorizer_1.getBasetype();
        OntoLClass _general = gs.getGeneral();
        boolean _notEquals_1 = (!Objects.equal(_basetype_1, _general));
        _and = _notEquals_1;
      }
      if (_and) {
        return false;
      } else {
        boolean _and_1 = false;
        OntoLClass _categorizer_2 = gs.getCategorizer();
        OntoLClass _basetype_2 = _categorizer_2.getBasetype();
        boolean _notEquals_2 = (!Objects.equal(_basetype_2, null));
        if (!_notEquals_2) {
          _and_1 = false;
        } else {
          EList<OntoLClass> _specifics_1 = gs.getSpecifics();
          final Function1<OntoLClass, Boolean> _function_1 = (OntoLClass it) -> {
            EList<OntoLClass> _instantiatedClasses = it.getInstantiatedClasses();
            OntoLClass _categorizer_3 = gs.getCategorizer();
            boolean _contains = _instantiatedClasses.contains(_categorizer_3);
            return Boolean.valueOf((!_contains));
          };
          boolean _exists_1 = IterableExtensions.<OntoLClass>exists(_specifics_1, _function_1);
          _and_1 = _exists_1;
        }
        if (_and_1) {
          return false;
        } else {
          return true;
        }
      }
    }
  }
  
  public boolean obeysSubordination(final OntoLClass c, final Set<OntoLClass> ch, final Set<OntoLClass> iof) {
    final LinkedHashSet<OntoLClass> subordinated = new LinkedHashSet<OntoLClass>();
    final Consumer<OntoLClass> _function = (OntoLClass it) -> {
      EList<OntoLClass> _subordinators = it.getSubordinators();
      boolean _notEquals = (!Objects.equal(_subordinators, null));
      if (_notEquals) {
        EList<OntoLClass> _subordinators_1 = it.getSubordinators();
        subordinated.addAll(_subordinators_1);
      }
    };
    iof.forEach(_function);
    int _size = subordinated.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return true;
    }
    final LinkedHashSet<OntoLClass> superClassesIof = new LinkedHashSet<OntoLClass>();
    final Consumer<OntoLClass> _function_1 = (OntoLClass it) -> {
      LinkedHashSet<OntoLClass> _allInstantiatedClasses = this._ontoLUtils.getAllInstantiatedClasses(it);
      superClassesIof.addAll(_allInstantiatedClasses);
    };
    ch.forEach(_function_1);
    return superClassesIof.containsAll(subordinated);
  }
  
  /**
   * Checked scenarios:
   * <br> - C is subordinated to itself
   * <br> - C is subordinated to X, and X is subordinated to C
   * <br> - C is subordinated to X, but C is a super class to X
   */
  public boolean hasSimpleSubordinationCycle(final OntoLClass c) {
    EList<OntoLClass> _subordinators = c.getSubordinators();
    boolean _equals = Objects.equal(_subordinators, null);
    if (_equals) {
      return false;
    } else {
      EList<OntoLClass> _subordinators_1 = c.getSubordinators();
      final Function1<OntoLClass, Boolean> _function = (OntoLClass sc) -> {
        boolean _or = false;
        boolean _or_1 = false;
        boolean _equals_1 = Objects.equal(sc, c);
        if (_equals_1) {
          _or_1 = true;
        } else {
          EList<OntoLClass> _subordinators_2 = null;
          if (sc!=null) {
            _subordinators_2=sc.getSubordinators();
          }
          boolean _contains = _subordinators_2.contains(c);
          _or_1 = _contains;
        }
        if (_or_1) {
          _or = true;
        } else {
          Set<OntoLClass> _classHierarchy = this._ontoLUtils.classHierarchy(sc);
          boolean _contains_1 = _classHierarchy.contains(c);
          _or = _contains_1;
        }
        return Boolean.valueOf(_or);
      };
      return IterableExtensions.<OntoLClass>exists(_subordinators_1, _function);
    }
  }
  
  public ValidationIssue isSpecializingDisjointClasses(final OntoLClass c, final Set<OntoLClass> ch) {
    EClass _generalizationSet = ModelPackage.eINSTANCE.getGeneralizationSet();
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._ontoLIndex.getVisibleEObjectDescriptions(c, _generalizationSet);
    for (final IEObjectDescription obj : _visibleEObjectDescriptions) {
      {
        EObject _eObjectOrProxy = obj.getEObjectOrProxy();
        GeneralizationSet gs = ((GeneralizationSet) _eObjectOrProxy);
        boolean _eIsProxy = gs.eIsProxy();
        if (_eIsProxy) {
          Resource _eResource = c.eResource();
          ResourceSet _resourceSet = _eResource.getResourceSet();
          URI _eObjectURI = obj.getEObjectURI();
          EObject _eObject = _resourceSet.getEObject(_eObjectURI, true);
          gs = ((GeneralizationSet) _eObject);
        }
        boolean _and = false;
        boolean _isIsDisjoint = gs.isIsDisjoint();
        if (!_isIsDisjoint) {
          _and = false;
        } else {
          EList<OntoLClass> _specifics = gs.getSpecifics();
          Set<OntoLClass> _set = IterableExtensions.<OntoLClass>toSet(_specifics);
          Sets.SetView<OntoLClass> _intersection = Sets.<OntoLClass>intersection(ch, _set);
          int _size = _intersection.size();
          boolean _greaterThan = (_size > 1);
          _and = _greaterThan;
        }
        if (_and) {
          final ValidationWarning issue = new ValidationWarning();
          StringConcatenation _builder = new StringConcatenation();
          String _name = c.getName();
          _builder.append(_name, "");
          _builder.append(" is specializing disjoint classes.");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t");
          {
            EList<OntoLClass> _specifics_1 = gs.getSpecifics();
            Set<OntoLClass> _set_1 = IterableExtensions.<OntoLClass>toSet(_specifics_1);
            Sets.SetView<OntoLClass> _intersection_1 = Sets.<OntoLClass>intersection(ch, _set_1);
            for(final OntoLClass disjoint : _intersection_1) {
              _builder.append(" ");
              EObject _eContainer = disjoint.eContainer();
              String _name_1 = ((Model) _eContainer).getName();
              _builder.append(_name_1, "\t\t\t\t\t");
              _builder.append(".");
              String _name_2 = disjoint.getName();
              _builder.append(_name_2, "\t\t\t\t\t");
              _builder.append("; ");
            }
          }
          _builder.append(").");
          issue.setMessage(_builder.toString());
          EAttribute _entityDeclaration_Name = ModelPackage.eINSTANCE.getEntityDeclaration_Name();
          issue.setFeature(_entityDeclaration_Name);
          issue.setSource(c);
          issue.setCode(LinguisticRules.SPECILIZATION_OF_DISJOINT_CLASSES);
          return issue;
        }
      }
    }
    return null;
  }
  
  public ValidationIssue isInstanceOfDisjointClasses(final EntityDeclaration e, final LinkedHashSet<OntoLClass> iof) {
    EClass _generalizationSet = ModelPackage.eINSTANCE.getGeneralizationSet();
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._ontoLIndex.getVisibleEObjectDescriptions(e, _generalizationSet);
    for (final IEObjectDescription obj : _visibleEObjectDescriptions) {
      {
        EObject _eObjectOrProxy = obj.getEObjectOrProxy();
        GeneralizationSet gs = ((GeneralizationSet) _eObjectOrProxy);
        boolean _eIsProxy = gs.eIsProxy();
        if (_eIsProxy) {
          Resource _eResource = e.eResource();
          ResourceSet _resourceSet = _eResource.getResourceSet();
          URI _eObjectURI = obj.getEObjectURI();
          EObject _eObject = _resourceSet.getEObject(_eObjectURI, true);
          gs = ((GeneralizationSet) _eObject);
        }
        boolean _and = false;
        boolean _isIsDisjoint = gs.isIsDisjoint();
        if (!_isIsDisjoint) {
          _and = false;
        } else {
          EList<OntoLClass> _specifics = gs.getSpecifics();
          Set<OntoLClass> _set = IterableExtensions.<OntoLClass>toSet(_specifics);
          Sets.SetView<OntoLClass> _intersection = Sets.<OntoLClass>intersection(iof, _set);
          int _size = _intersection.size();
          boolean _greaterThan = (_size > 1);
          _and = _greaterThan;
        }
        if (_and) {
          final ValidationWarning issue = new ValidationWarning();
          StringConcatenation _builder = new StringConcatenation();
          String _name = e.getName();
          _builder.append(_name, "");
          _builder.append(" is instance disjoint classes.");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t");
          {
            EList<OntoLClass> _specifics_1 = gs.getSpecifics();
            Set<OntoLClass> _set_1 = IterableExtensions.<OntoLClass>toSet(_specifics_1);
            Sets.SetView<OntoLClass> _intersection_1 = Sets.<OntoLClass>intersection(iof, _set_1);
            for(final OntoLClass disjoint : _intersection_1) {
              _builder.append(" ");
              EObject _eContainer = disjoint.eContainer();
              String _name_1 = ((Model) _eContainer).getName();
              _builder.append(_name_1, "\t\t\t\t\t");
              _builder.append(".");
              String _name_2 = disjoint.getName();
              _builder.append(_name_2, "\t\t\t\t\t");
              _builder.append("; ");
            }
          }
          _builder.append(").");
          issue.setMessage(_builder.toString());
          EAttribute _entityDeclaration_Name = ModelPackage.eINSTANCE.getEntityDeclaration_Name();
          issue.setFeature(_entityDeclaration_Name);
          issue.setSource(e);
          issue.setCode(LinguisticRules.INSTANCE_OF_DISJOINT_CLASSES);
          return issue;
        }
      }
    }
    return null;
  }
  
  public ValidationIssue missingInstantiationByCompleteness(final EntityDeclaration e, final LinkedHashSet<OntoLClass> iof) {
    EClass _generalizationSet = ModelPackage.eINSTANCE.getGeneralizationSet();
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._ontoLIndex.getVisibleEObjectDescriptions(e, _generalizationSet);
    for (final IEObjectDescription obj : _visibleEObjectDescriptions) {
      {
        EObject _eObjectOrProxy = obj.getEObjectOrProxy();
        GeneralizationSet gs = ((GeneralizationSet) _eObjectOrProxy);
        boolean _eIsProxy = gs.eIsProxy();
        if (_eIsProxy) {
          Resource _eResource = e.eResource();
          ResourceSet _resourceSet = _eResource.getResourceSet();
          URI _eObjectURI = obj.getEObjectURI();
          EObject _eObject = _resourceSet.getEObject(_eObjectURI, true);
          gs = ((GeneralizationSet) _eObject);
        }
        boolean _and = false;
        boolean _and_1 = false;
        boolean _isIsComplete = gs.isIsComplete();
        if (!_isIsComplete) {
          _and_1 = false;
        } else {
          OntoLClass _general = gs.getGeneral();
          boolean _contains = iof.contains(_general);
          _and_1 = _contains;
        }
        if (!_and_1) {
          _and = false;
        } else {
          EList<OntoLClass> _specifics = gs.getSpecifics();
          Set<OntoLClass> _set = IterableExtensions.<OntoLClass>toSet(_specifics);
          boolean _disjoint = Collections.disjoint(_set, iof);
          _and = _disjoint;
        }
        if (_and) {
          final ValidationWarning issue = new ValidationWarning();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Missing instantions due to completeness of generalization sets.");
          _builder.newLine();
          _builder.append("\t\t\t\t\t");
          {
            EList<OntoLClass> _specifics_1 = gs.getSpecifics();
            for(final OntoLClass mustiof : _specifics_1) {
              _builder.append(" ");
              EObject _eContainer = mustiof.eContainer();
              String _name = ((Model) _eContainer).getName();
              _builder.append(_name, "\t\t\t\t\t");
              _builder.append(".");
              String _name_1 = mustiof.getName();
              _builder.append(_name_1, "\t\t\t\t\t");
              _builder.append("; ");
            }
          }
          _builder.append(").");
          issue.setMessage(_builder.toString());
          EAttribute _entityDeclaration_Name = ModelPackage.eINSTANCE.getEntityDeclaration_Name();
          issue.setFeature(_entityDeclaration_Name);
          issue.setSource(e);
          issue.setCode(LinguisticRules.MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET);
          return issue;
        }
      }
    }
    return null;
  }
  
  protected ValidationIssue _checkSubsettedMultiplicity(final Reference ref) {
    EList<Reference> _subsetOf = ref.getSubsetOf();
    boolean _equals = Objects.equal(_subsetOf, null);
    if (_equals) {
      return null;
    }
    final ValidationError issue = new ValidationError();
    issue.setSource(ref);
    issue.setCode(LinguisticRules.INVALID_MULTIPLICITY);
    EList<Reference> _subsetOf_1 = ref.getSubsetOf();
    for (final Reference superRef : _subsetOf_1) {
      Integer _lowerBound = ref.getLowerBound();
      Integer _lowerBound_1 = superRef.getLowerBound();
      boolean _lessThan = (_lowerBound.compareTo(_lowerBound_1) < 0);
      if (_lessThan) {
        EAttribute _property_LowerBound = ModelPackage.eINSTANCE.getProperty_LowerBound();
        issue.setFeature(_property_LowerBound);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("The cardinality must be as restrictive as the the subsetted one (");
        String _name = superRef.getName();
        _builder.append(_name, "");
        _builder.append(").");
        issue.setMessage(_builder.toString());
        return issue;
      } else {
        boolean _and = false;
        Integer _upperBound = ref.getUpperBound();
        Integer _upperBound_1 = superRef.getUpperBound();
        boolean _greaterThan = (_upperBound.compareTo(_upperBound_1) > 0);
        if (!_greaterThan) {
          _and = false;
        } else {
          Integer _upperBound_2 = superRef.getUpperBound();
          boolean _greaterThan_1 = ((_upperBound_2).intValue() > 0);
          _and = _greaterThan_1;
        }
        if (_and) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("The cardinality must be as restrictive as the the subsetted one (");
          String _name_1 = superRef.getName();
          _builder_1.append(_name_1, "");
          _builder_1.append(").");
          issue.setMessage(_builder_1.toString());
          EAttribute _property_UpperBound = ModelPackage.eINSTANCE.getProperty_UpperBound();
          issue.setFeature(_property_UpperBound);
          return issue;
        } else {
          boolean _and_1 = false;
          Integer _upperBound_3 = ref.getUpperBound();
          boolean _equals_1 = ((_upperBound_3).intValue() == (-1));
          if (!_equals_1) {
            _and_1 = false;
          } else {
            Integer _upperBound_4 = ref.getUpperBound();
            Integer _upperBound_5 = superRef.getUpperBound();
            boolean _notEquals = (!Objects.equal(_upperBound_4, _upperBound_5));
            _and_1 = _notEquals;
          }
          if (_and_1) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("The cardinality must be as restrictive as the the subsetted one (");
            String _name_2 = superRef.getName();
            _builder_2.append(_name_2, "");
            _builder_2.append(").");
            issue.setMessage(_builder_2.toString());
            EAttribute _property_UpperBound_1 = ModelPackage.eINSTANCE.getProperty_UpperBound();
            issue.setFeature(_property_UpperBound_1);
            return issue;
          }
        }
      }
    }
    return null;
  }
  
  protected ValidationIssue _checkSubsettedMultiplicity(final Attribute att) {
    EList<Attribute> _subsetOf = att.getSubsetOf();
    boolean _equals = Objects.equal(_subsetOf, null);
    if (_equals) {
      return null;
    }
    final ValidationError issue = new ValidationError();
    issue.setSource(att);
    issue.setCode(LinguisticRules.INVALID_MULTIPLICITY);
    EList<Attribute> _subsetOf_1 = att.getSubsetOf();
    for (final Attribute superAtt : _subsetOf_1) {
      Integer _lowerBound = att.getLowerBound();
      Integer _lowerBound_1 = superAtt.getLowerBound();
      boolean _lessThan = (_lowerBound.compareTo(_lowerBound_1) < 0);
      if (_lessThan) {
        EAttribute _property_LowerBound = ModelPackage.eINSTANCE.getProperty_LowerBound();
        issue.setFeature(_property_LowerBound);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("The cardinality must be as restrictive as the the subsetted one (");
        String _name = superAtt.getName();
        _builder.append(_name, "");
        _builder.append(").");
        issue.setMessage(_builder.toString());
        return issue;
      } else {
        boolean _and = false;
        Integer _upperBound = att.getUpperBound();
        Integer _upperBound_1 = superAtt.getUpperBound();
        boolean _greaterThan = (_upperBound.compareTo(_upperBound_1) > 0);
        if (!_greaterThan) {
          _and = false;
        } else {
          Integer _upperBound_2 = superAtt.getUpperBound();
          boolean _greaterThan_1 = ((_upperBound_2).intValue() > 0);
          _and = _greaterThan_1;
        }
        if (_and) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("The cardinality must be as restrictive as the the subsetted one (");
          String _name_1 = superAtt.getName();
          _builder_1.append(_name_1, "");
          _builder_1.append(").");
          issue.setMessage(_builder_1.toString());
          EAttribute _property_UpperBound = ModelPackage.eINSTANCE.getProperty_UpperBound();
          issue.setFeature(_property_UpperBound);
          return issue;
        } else {
          boolean _and_1 = false;
          Integer _upperBound_3 = att.getUpperBound();
          boolean _equals_1 = ((_upperBound_3).intValue() == (-1));
          if (!_equals_1) {
            _and_1 = false;
          } else {
            Integer _upperBound_4 = att.getUpperBound();
            Integer _upperBound_5 = superAtt.getUpperBound();
            boolean _notEquals = (!Objects.equal(_upperBound_4, _upperBound_5));
            _and_1 = _notEquals;
          }
          if (_and_1) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("The cardinality must be as restrictive as the the subsetted one (");
            String _name_2 = superAtt.getName();
            _builder_2.append(_name_2, "");
            _builder_2.append(").");
            issue.setMessage(_builder_2.toString());
            EAttribute _property_UpperBound_1 = ModelPackage.eINSTANCE.getProperty_UpperBound();
            issue.setFeature(_property_UpperBound_1);
            return issue;
          }
        }
      }
    }
    return null;
  }
  
  protected ValidationIssue _checkMultiplicityAndAssignment(final ReferenceAssignment ra) {
    EList<ReferenceValue> _assignments = ra.getAssignments();
    int _size = 0;
    if (_assignments!=null) {
      _size=_assignments.size();
    }
    final int nAssgns = _size;
    final Reference ref = ra.getReference();
    Integer _lowerBound = ref.getLowerBound();
    boolean _lessThan = (nAssgns < (_lowerBound).intValue());
    if (_lessThan) {
      final ValidationWarning issue = new ValidationWarning();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Number of assignments must equal or greater than ");
      Integer _lowerBound_1 = ref.getLowerBound();
      _builder.append(_lowerBound_1, "");
      _builder.append(".");
      issue.setMessage(_builder.toString());
      issue.setSource(ra);
      EReference _referenceAssignment_Assignments = ModelPackage.eINSTANCE.getReferenceAssignment_Assignments();
      issue.setFeature(_referenceAssignment_Assignments);
      issue.setCode(LinguisticRules.INVALID_MULTIPLICITY);
      return issue;
    } else {
      boolean _and = false;
      Integer _upperBound = ref.getUpperBound();
      boolean _greaterThan = (nAssgns > (_upperBound).intValue());
      if (!_greaterThan) {
        _and = false;
      } else {
        Integer _upperBound_1 = ref.getUpperBound();
        boolean _greaterThan_1 = ((_upperBound_1).intValue() > 0);
        _and = _greaterThan_1;
      }
      if (_and) {
        final ValidationWarning issue_1 = new ValidationWarning();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Number of assignments must equal or less than ");
        Integer _upperBound_2 = ref.getUpperBound();
        _builder_1.append(_upperBound_2, "");
        _builder_1.append(".");
        issue_1.setMessage(_builder_1.toString());
        issue_1.setSource(ra);
        EReference _referenceAssignment_Assignments_1 = ModelPackage.eINSTANCE.getReferenceAssignment_Assignments();
        issue_1.setFeature(_referenceAssignment_Assignments_1);
        issue_1.setCode(LinguisticRules.INVALID_MULTIPLICITY);
        return issue_1;
      } else {
        return null;
      }
    }
  }
  
  protected ValidationIssue _checkMultiplicityAndAssignment(final AttributeAssignment aa) {
    EList<DataValue> _assignments = aa.getAssignments();
    int _size = 0;
    if (_assignments!=null) {
      _size=_assignments.size();
    }
    final int nAssgns = _size;
    final Attribute att = aa.getAttribute();
    final ValidationWarning issue = new ValidationWarning();
    issue.setSource(aa);
    EReference _attributeAssignment_Assignments = ModelPackage.eINSTANCE.getAttributeAssignment_Assignments();
    issue.setFeature(_attributeAssignment_Assignments);
    issue.setCode(LinguisticRules.INVALID_MULTIPLICITY);
    Integer _lowerBound = att.getLowerBound();
    boolean _lessThan = (nAssgns < (_lowerBound).intValue());
    if (_lessThan) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Number of assignments must equal or greater than ");
      Integer _lowerBound_1 = att.getLowerBound();
      _builder.append(_lowerBound_1, "");
      _builder.append(".");
      issue.setMessage(_builder.toString());
      return issue;
    } else {
      boolean _and = false;
      Integer _upperBound = att.getUpperBound();
      boolean _greaterThan = (nAssgns > (_upperBound).intValue());
      if (!_greaterThan) {
        _and = false;
      } else {
        Integer _upperBound_1 = att.getUpperBound();
        boolean _greaterThan_1 = ((_upperBound_1).intValue() > 0);
        _and = _greaterThan_1;
      }
      if (_and) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Number of assignments must equal or less than ");
        Integer _upperBound_2 = att.getUpperBound();
        _builder_1.append(_upperBound_2, "");
        _builder_1.append(".");
        issue.setMessage(_builder_1.toString());
        return issue;
      } else {
        return null;
      }
    }
  }
  
  protected ValidationIssue _checkPropertyAssignmentType(final ReferenceAssignment ra) {
    final Reference ref = ra.getReference();
    final OntoLClass assigType = ref.getPropertyClass();
    final ValidationError issue = new ValidationError();
    issue.setSource(ra);
    EReference _referenceAssignment_Assignments = ModelPackage.eINSTANCE.getReferenceAssignment_Assignments();
    issue.setFeature(_referenceAssignment_Assignments);
    EList<ReferenceValue> _assignments = ra.getAssignments();
    for (final Value v : _assignments) {
      boolean _isConformantTo = this._ontoLUtils.isConformantTo(v, assigType);
      boolean _not = (!_isConformantTo);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("All assignments must be instances of ");
        String _name = assigType.getName();
        _builder.append(_name, "");
        _builder.append(".");
        issue.setMessage(_builder.toString());
        EList<ReferenceValue> _assignments_1 = ra.getAssignments();
        int _indexOf = _assignments_1.indexOf(v);
        issue.setIndex(_indexOf);
        issue.setCode(LinguisticRules.NON_CONFORMANT_ASSIGNMENT);
        return issue;
      }
    }
    return null;
  }
  
  protected ValidationIssue _checkPropertyAssignmentType(final AttributeAssignment aa) {
    final Attribute att = aa.getAttribute();
    final OntoLClass assigType = att.getPropertyClass();
    final ValidationError issue = new ValidationError();
    issue.setSource(aa);
    EReference _attributeAssignment_Assignments = ModelPackage.eINSTANCE.getAttributeAssignment_Assignments();
    issue.setFeature(_attributeAssignment_Assignments);
    EList<DataValue> _assignments = aa.getAssignments();
    for (final Value v : _assignments) {
      boolean _isConformantTo = this._ontoLUtils.isConformantTo(v, assigType);
      boolean _not = (!_isConformantTo);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("All assignments must be instances of ");
        String _name = assigType.getName();
        _builder.append(_name, "");
        _builder.append(".");
        issue.setMessage(_builder.toString());
        EList<DataValue> _assignments_1 = aa.getAssignments();
        int _indexOf = _assignments_1.indexOf(v);
        issue.setIndex(_indexOf);
        issue.setCode(LinguisticRules.NON_CONFORMANT_ASSIGNMENT);
        return issue;
      }
    }
    return null;
  }
  
  public ValidationIssue checkRegularityAndContainer(final Property p) {
    boolean _and = false;
    Boolean _regularity = p.getRegularity();
    if (!(_regularity).booleanValue()) {
      _and = false;
    } else {
      EObject _eContainer = p.eContainer();
      _and = (_eContainer instanceof FOClass);
    }
    if (_and) {
      final ValidationError issue = new ValidationError();
      issue.setSource(p);
      EAttribute _property_Regularity = ModelPackage.eINSTANCE.getProperty_Regularity();
      issue.setFeature(_property_Regularity);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Regularity attributes do not apply to first-order classes.");
      issue.setMessage(_builder.toString());
      issue.setCode(LinguisticRules.FIRST_ORDER_REGULARITY);
      return issue;
    }
    return null;
  }
  
  public ValidationIssue checkInstantiatedRegularities(final OntoLClass c) {
    Set<Property> _allProperties = this._ontoLUtils.getAllProperties(c);
    final Function1<Property, Boolean> _function = (Property it) -> {
      return it.getRegularity();
    };
    Iterable<Property> _filter = IterableExtensions.<Property>filter(_allProperties, _function);
    final Set<Property> props = IterableExtensions.<Property>toSet(_filter);
    EList<AttributeAssignment> _attAssignments = c.getAttAssignments();
    final Consumer<AttributeAssignment> _function_1 = (AttributeAssignment it) -> {
      Attribute _attribute = it.getAttribute();
      props.remove(_attribute);
    };
    _attAssignments.forEach(_function_1);
    EList<ReferenceAssignment> _refAssignments = c.getRefAssignments();
    final Consumer<ReferenceAssignment> _function_2 = (ReferenceAssignment it) -> {
      Reference _reference = it.getReference();
      props.remove(_reference);
    };
    _refAssignments.forEach(_function_2);
    boolean _isEmpty = props.isEmpty();
    if (_isEmpty) {
      return null;
    }
    final ValidationWarning issue = new ValidationWarning();
    issue.setSource(c);
    EAttribute _entityDeclaration_Name = ModelPackage.eINSTANCE.getEntityDeclaration_Name();
    issue.setFeature(_entityDeclaration_Name);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("The regularity property ");
    Property _head = IterableExtensions.<Property>head(props);
    String _name = _head.getName();
    _builder.append(_name, "");
    _builder.append(" should hava an assigned value.");
    issue.setMessage(_builder.toString());
    issue.setCode(LinguisticRules.MISSING_ASSIGNMENT_BY_REGULARITY);
    return issue;
  }
  
  public ValidationIssue checkSubsettedMultiplicity(final Property att) {
    if (att instanceof Attribute) {
      return _checkSubsettedMultiplicity((Attribute)att);
    } else if (att instanceof Reference) {
      return _checkSubsettedMultiplicity((Reference)att);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(att).toString());
    }
  }
  
  public ValidationIssue checkMultiplicityAndAssignment(final PropertyAssignment aa) {
    if (aa instanceof AttributeAssignment) {
      return _checkMultiplicityAndAssignment((AttributeAssignment)aa);
    } else if (aa instanceof ReferenceAssignment) {
      return _checkMultiplicityAndAssignment((ReferenceAssignment)aa);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(aa).toString());
    }
  }
  
  public ValidationIssue checkPropertyAssignmentType(final PropertyAssignment aa) {
    if (aa instanceof AttributeAssignment) {
      return _checkPropertyAssignmentType((AttributeAssignment)aa);
    } else if (aa instanceof ReferenceAssignment) {
      return _checkPropertyAssignmentType((ReferenceAssignment)aa);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(aa).toString());
    }
  }
}

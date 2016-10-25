package br.ufes.inf.nemo.ontol.validation;

import br.ufes.inf.nemo.ontol.model.EntityDeclaration;
import br.ufes.inf.nemo.ontol.model.FOClass;
import br.ufes.inf.nemo.ontol.model.GeneralizationSet;
import br.ufes.inf.nemo.ontol.model.HOClass;
import br.ufes.inf.nemo.ontol.model.Model;
import br.ufes.inf.nemo.ontol.model.ModelElement;
import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.model.OrderedClass;
import br.ufes.inf.nemo.ontol.model.WClass;
import br.ufes.inf.nemo.ontol.util.OntoLIndex;
import br.ufes.inf.nemo.ontol.util.OntoLUtils;
import br.ufes.inf.nemo.ontol.validation.MLTRules;
import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
  
  public boolean isNameValid(final EntityDeclaration e) {
    boolean _xifexpression = false;
    String _name = e.getName();
    String _name_1 = e.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_1);
    boolean _equals = Objects.equal(_name, _firstLower);
    if (_equals) {
      _xifexpression = false;
    } else {
      _xifexpression = true;
    }
    return _xifexpression;
  }
  
  public boolean isValidSpecialization(final br.ufes.inf.nemo.ontol.model.Class c) {
    EList<br.ufes.inf.nemo.ontol.model.Class> _superClasses = c.getSuperClasses();
    final Function1<br.ufes.inf.nemo.ontol.model.Class, Boolean> _function = (br.ufes.inf.nemo.ontol.model.Class it) -> {
      return Boolean.valueOf(Objects.equal(it, c));
    };
    boolean _exists = IterableExtensions.<br.ufes.inf.nemo.ontol.model.Class>exists(_superClasses, _function);
    if (_exists) {
      return false;
    } else {
      if (((c instanceof WClass) && IterableExtensions.<br.ufes.inf.nemo.ontol.model.Class>exists(c.getSuperClasses(), ((Function1<br.ufes.inf.nemo.ontol.model.Class, Boolean>) (br.ufes.inf.nemo.ontol.model.Class it) -> {
        return Boolean.valueOf((it instanceof OrderedClass));
      })))) {
        return false;
      } else {
        if (((c instanceof FOClass) && IterableExtensions.<br.ufes.inf.nemo.ontol.model.Class>exists(c.getSuperClasses(), ((Function1<br.ufes.inf.nemo.ontol.model.Class, Boolean>) (br.ufes.inf.nemo.ontol.model.Class it) -> {
          return Boolean.valueOf((it instanceof HOClass));
        })))) {
          return false;
        } else {
          if (((c instanceof HOClass) && IterableExtensions.<br.ufes.inf.nemo.ontol.model.Class>exists(c.getSuperClasses(), ((Function1<br.ufes.inf.nemo.ontol.model.Class, Boolean>) (br.ufes.inf.nemo.ontol.model.Class it) -> {
            return Boolean.valueOf((it instanceof FOClass));
          })))) {
            return false;
          } else {
            if ((c instanceof HOClass)) {
              EList<br.ufes.inf.nemo.ontol.model.Class> _superClasses_1 = ((HOClass)c).getSuperClasses();
              final Function1<br.ufes.inf.nemo.ontol.model.Class, Boolean> _function_1 = (br.ufes.inf.nemo.ontol.model.Class it) -> {
                boolean _xifexpression = false;
                if (((it instanceof HOClass) && (!Objects.equal(((HOClass) it).getOrder(), ((HOClass)c).getOrder())))) {
                  _xifexpression = true;
                } else {
                  _xifexpression = false;
                }
                return Boolean.valueOf(_xifexpression);
              };
              boolean _exists_1 = IterableExtensions.<br.ufes.inf.nemo.ontol.model.Class>exists(_superClasses_1, _function_1);
              return (!_exists_1);
            } else {
              return true;
            }
          }
        }
      }
    }
  }
  
  public boolean hasCyclicSpecialization(final br.ufes.inf.nemo.ontol.model.Class c, final LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> ch) {
    boolean _xifexpression = false;
    boolean _contains = ch.contains(c);
    if (_contains) {
      _xifexpression = true;
    } else {
      _xifexpression = false;
    }
    return _xifexpression;
  }
  
  public boolean hasValidBasetype(final br.ufes.inf.nemo.ontol.model.Class c) {
    final br.ufes.inf.nemo.ontol.model.Class b = c.getBasetype();
    boolean _equals = Objects.equal(b, null);
    if (_equals) {
      return true;
    } else {
      if ((c instanceof HOClass)) {
        if ((b instanceof WClass)) {
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
            if ((((((HOClass)c).getOrder()).intValue() != MLTRules.MIN_ORDER) && (b instanceof HOClass))) {
              Integer _order_1 = ((HOClass)c).getOrder();
              Integer _order_2 = ((HOClass) b).getOrder();
              int _plus = ((_order_2).intValue() + 1);
              return ((_order_1).intValue() == _plus);
            }
          }
        }
      } else {
        return true;
      }
    }
    return false;
  }
  
  public boolean hasValidPowertypeRelation(final br.ufes.inf.nemo.ontol.model.Class c) {
    final br.ufes.inf.nemo.ontol.model.Class b = c.getPowertypeOf();
    boolean _equals = Objects.equal(b, null);
    if (_equals) {
      return true;
    } else {
      if ((c instanceof HOClass)) {
        if ((b instanceof WClass)) {
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
            if ((((((HOClass)c).getOrder()).intValue() != MLTRules.MIN_ORDER) && (b instanceof HOClass))) {
              Integer _order_1 = ((HOClass)c).getOrder();
              Integer _order_2 = ((HOClass) b).getOrder();
              int _plus = ((_order_2).intValue() + 1);
              return ((_order_1).intValue() == _plus);
            }
          }
        }
      } else {
        return true;
      }
    }
    return false;
  }
  
  public boolean hasValidSubordinators(final br.ufes.inf.nemo.ontol.model.Class c) {
    if ((c instanceof HOClass)) {
      EList<br.ufes.inf.nemo.ontol.model.Class> _subordinators = ((HOClass)c).getSubordinators();
      final Function1<br.ufes.inf.nemo.ontol.model.Class, Boolean> _function = (br.ufes.inf.nemo.ontol.model.Class it) -> {
        boolean _equals = Objects.equal(it, c);
        if (_equals) {
          return Boolean.valueOf(true);
        } else {
          if ((it instanceof FOClass)) {
            return Boolean.valueOf(true);
          } else {
            if (((it instanceof HOClass) && (!Objects.equal(((HOClass) it).getOrder(), ((HOClass)c).getOrder())))) {
              return Boolean.valueOf(true);
            } else {
              return Boolean.valueOf(false);
            }
          }
        }
      };
      boolean _exists = IterableExtensions.<br.ufes.inf.nemo.ontol.model.Class>exists(_subordinators, _function);
      return (!_exists);
    } else {
      return true;
    }
  }
  
  public boolean duplicatedEntityName(final EntityDeclaration e) {
    EObject _eContainer = e.eContainer();
    final Model model = ((Model) _eContainer);
    EList<ModelElement> _elements = model.getElements();
    final Function1<ModelElement, Boolean> _function = (ModelElement it) -> {
      boolean _xifexpression = false;
      if ((it instanceof EntityDeclaration)) {
        _xifexpression = (((EntityDeclaration)it).getName().equals(e.getName()) && (!Objects.equal(it, e)));
      } else {
        _xifexpression = false;
      }
      return Boolean.valueOf(_xifexpression);
    };
    return IterableExtensions.<ModelElement>exists(_elements, _function);
  }
  
  public boolean hasValidMembers(final GeneralizationSet gs) {
    EList<br.ufes.inf.nemo.ontol.model.Class> _specifics = gs.getSpecifics();
    final Function1<br.ufes.inf.nemo.ontol.model.Class, Boolean> _function = (br.ufes.inf.nemo.ontol.model.Class it) -> {
      EList<br.ufes.inf.nemo.ontol.model.Class> _superClasses = it.getSuperClasses();
      br.ufes.inf.nemo.ontol.model.Class _general = gs.getGeneral();
      boolean _contains = _superClasses.contains(_general);
      return Boolean.valueOf((!_contains));
    };
    boolean _exists = IterableExtensions.<br.ufes.inf.nemo.ontol.model.Class>exists(_specifics, _function);
    if (_exists) {
      return false;
    } else {
      if (((!Objects.equal(gs.getCategorizer().getBasetype(), null)) && (!Objects.equal(gs.getCategorizer().getBasetype(), gs.getGeneral())))) {
        return false;
      } else {
        if (((!Objects.equal(gs.getCategorizer().getBasetype(), null)) && IterableExtensions.<br.ufes.inf.nemo.ontol.model.Class>exists(gs.getSpecifics(), ((Function1<br.ufes.inf.nemo.ontol.model.Class, Boolean>) (br.ufes.inf.nemo.ontol.model.Class it) -> {
          EList<br.ufes.inf.nemo.ontol.model.Class> _fixedTypes = it.getFixedTypes();
          br.ufes.inf.nemo.ontol.model.Class _categorizer = gs.getCategorizer();
          boolean _contains = _fixedTypes.contains(_categorizer);
          return Boolean.valueOf((!_contains));
        })))) {
          return false;
        } else {
          return true;
        }
      }
    }
  }
  
  public boolean obeysSubordination(final br.ufes.inf.nemo.ontol.model.Class c, final LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> ch, final LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> iof) {
    final LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> subordinated = new LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class>();
    final Consumer<br.ufes.inf.nemo.ontol.model.Class> _function = (br.ufes.inf.nemo.ontol.model.Class it) -> {
      EList<br.ufes.inf.nemo.ontol.model.Class> _subordinators = it.getSubordinators();
      boolean _notEquals = (!Objects.equal(_subordinators, null));
      if (_notEquals) {
        EList<br.ufes.inf.nemo.ontol.model.Class> _subordinators_1 = it.getSubordinators();
        subordinated.addAll(_subordinators_1);
      }
    };
    iof.forEach(_function);
    int _size = subordinated.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return true;
    }
    final LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> superClassesIof = new LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class>();
    final Consumer<br.ufes.inf.nemo.ontol.model.Class> _function_1 = (br.ufes.inf.nemo.ontol.model.Class it) -> {
      LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> _allFixedTypes = this._ontoLUtils.getAllFixedTypes(it);
      superClassesIof.addAll(_allFixedTypes);
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
  public boolean hasSimpleSubordinationCycle(final br.ufes.inf.nemo.ontol.model.Class c) {
    EList<br.ufes.inf.nemo.ontol.model.Class> _subordinators = c.getSubordinators();
    boolean _equals = Objects.equal(_subordinators, null);
    if (_equals) {
      return false;
    } else {
      EList<br.ufes.inf.nemo.ontol.model.Class> _subordinators_1 = c.getSubordinators();
      final Function1<br.ufes.inf.nemo.ontol.model.Class, Boolean> _function = (br.ufes.inf.nemo.ontol.model.Class sc) -> {
        boolean _or = false;
        boolean _or_1 = false;
        boolean _equals_1 = Objects.equal(sc, c);
        if (_equals_1) {
          _or_1 = true;
        } else {
          EList<br.ufes.inf.nemo.ontol.model.Class> _subordinators_2 = null;
          if (sc!=null) {
            _subordinators_2=sc.getSubordinators();
          }
          boolean _contains = _subordinators_2.contains(c);
          _or_1 = _contains;
        }
        if (_or_1) {
          _or = true;
        } else {
          LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> _classHierarchy = this._ontoLUtils.classHierarchy(sc);
          boolean _contains_1 = _classHierarchy.contains(c);
          _or = _contains_1;
        }
        return Boolean.valueOf(_or);
      };
      return IterableExtensions.<br.ufes.inf.nemo.ontol.model.Class>exists(_subordinators_1, _function);
    }
  }
  
  public boolean isSpecializingDisjointClasses(final br.ufes.inf.nemo.ontol.model.Class c, final LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> ch) {
    EClass _generalizationSet = ModelPackage.eINSTANCE.getGeneralizationSet();
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._ontoLIndex.getVisibleEObjectDescriptions(c, _generalizationSet);
    final Function1<IEObjectDescription, Boolean> _function = (IEObjectDescription it) -> {
      GeneralizationSet _xifexpression = null;
      EObject _eObjectOrProxy = it.getEObjectOrProxy();
      if ((_eObjectOrProxy instanceof GeneralizationSet)) {
        EObject _eObjectOrProxy_1 = it.getEObjectOrProxy();
        _xifexpression = ((GeneralizationSet) _eObjectOrProxy_1);
      } else {
        _xifexpression = null;
      }
      final GeneralizationSet gs = _xifexpression;
      if ((Objects.equal(gs, null) || (!gs.isIsDisjoint()))) {
        return Boolean.valueOf(false);
      } else {
        EList<br.ufes.inf.nemo.ontol.model.Class> _specifics = null;
        if (gs!=null) {
          _specifics=gs.getSpecifics();
        }
        Set<br.ufes.inf.nemo.ontol.model.Class> _set = IterableExtensions.<br.ufes.inf.nemo.ontol.model.Class>toSet(_specifics);
        Sets.SetView<br.ufes.inf.nemo.ontol.model.Class> _intersection = Sets.<br.ufes.inf.nemo.ontol.model.Class>intersection(ch, _set);
        int _size = _intersection.size();
        boolean _lessThan = (_size < 2);
        if (_lessThan) {
          return Boolean.valueOf(false);
        } else {
          return Boolean.valueOf(true);
        }
      }
    };
    return IterableExtensions.<IEObjectDescription>exists(_visibleEObjectDescriptions, _function);
  }
  
  public boolean isInstanceOfDisjointClasses(final EntityDeclaration e, final LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> iof) {
    EClass _generalizationSet = ModelPackage.eINSTANCE.getGeneralizationSet();
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._ontoLIndex.getVisibleEObjectDescriptions(e, _generalizationSet);
    final Function1<IEObjectDescription, Boolean> _function = (IEObjectDescription it) -> {
      GeneralizationSet _xifexpression = null;
      EObject _eObjectOrProxy = it.getEObjectOrProxy();
      if ((_eObjectOrProxy instanceof GeneralizationSet)) {
        EObject _eObjectOrProxy_1 = it.getEObjectOrProxy();
        _xifexpression = ((GeneralizationSet) _eObjectOrProxy_1);
      } else {
        _xifexpression = null;
      }
      final GeneralizationSet gs = _xifexpression;
      if (((Objects.equal(gs, null) || (!gs.isIsDisjoint())) || (Sets.<br.ufes.inf.nemo.ontol.model.Class>intersection(IterableExtensions.<br.ufes.inf.nemo.ontol.model.Class>toSet(gs.getSpecifics()), iof).size() < 2))) {
        return Boolean.valueOf(false);
      }
      return Boolean.valueOf(true);
    };
    return IterableExtensions.<IEObjectDescription>exists(_visibleEObjectDescriptions, _function);
  }
  
  public boolean missingInstantiationByCompleteness(final EntityDeclaration e, final LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> iof) {
    EClass _generalizationSet = ModelPackage.eINSTANCE.getGeneralizationSet();
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._ontoLIndex.getVisibleEObjectDescriptions(e, _generalizationSet);
    final Function1<IEObjectDescription, Boolean> _function = (IEObjectDescription it) -> {
      GeneralizationSet _xifexpression = null;
      EObject _eObjectOrProxy = it.getEObjectOrProxy();
      if ((_eObjectOrProxy instanceof GeneralizationSet)) {
        EObject _eObjectOrProxy_1 = it.getEObjectOrProxy();
        _xifexpression = ((GeneralizationSet) _eObjectOrProxy_1);
      } else {
        _xifexpression = null;
      }
      final GeneralizationSet gs = _xifexpression;
      if ((((Objects.equal(gs, null) || (!gs.isIsComplete())) || (!iof.contains(gs.getGeneral()))) || (!Collections.disjoint(IterableExtensions.<br.ufes.inf.nemo.ontol.model.Class>toSet(gs.getSpecifics()), iof)))) {
        return Boolean.valueOf(false);
      }
      return Boolean.valueOf(true);
    };
    return IterableExtensions.<IEObjectDescription>exists(_visibleEObjectDescriptions, _function);
  }
}

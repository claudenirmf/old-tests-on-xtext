/**
 * Auxiliary methods for enable navigation and checking through OntoL Models.
 * 
 * @author Claudenir Fonseca
 */
package br.ufes.inf.nemo.ontol.util;

import br.ufes.inf.nemo.ontol.lib.OntoLLib;
import br.ufes.inf.nemo.ontol.model.Attribute;
import br.ufes.inf.nemo.ontol.model.BooleanValue;
import br.ufes.inf.nemo.ontol.model.DataValue;
import br.ufes.inf.nemo.ontol.model.EntityDeclaration;
import br.ufes.inf.nemo.ontol.model.Model;
import br.ufes.inf.nemo.ontol.model.ModelElement;
import br.ufes.inf.nemo.ontol.model.NoneValue;
import br.ufes.inf.nemo.ontol.model.NumberValue;
import br.ufes.inf.nemo.ontol.model.OntoLClass;
import br.ufes.inf.nemo.ontol.model.Property;
import br.ufes.inf.nemo.ontol.model.Reference;
import br.ufes.inf.nemo.ontol.model.ReferenceValue;
import br.ufes.inf.nemo.ontol.model.StringValue;
import br.ufes.inf.nemo.ontol.model.Value;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class OntoLUtils {
  @Inject
  @Extension
  private OntoLLib _ontoLLib;
  
  private Set<Model> getRechableModels(final ModelElement elem) {
    final LinkedHashSet<Model> set = new LinkedHashSet<Model>();
    EObject _eContainer = elem.eContainer();
    set.add(((Model) _eContainer));
    EObject _eContainer_1 = elem.eContainer();
    EList<Model> _includes = ((Model) _eContainer_1).getIncludes();
    set.addAll(_includes);
    return set;
  }
  
  /**
   * Returns a set of all super types of the given <b>type</b>. The set does not
   * include the <b>type</b> unless it is in a specialization cycle.
   * 
   * @author Claudenir Fonseca
   */
  public Set<OntoLClass> classHierarchy(final OntoLClass c) {
    Set<OntoLClass> _xblockexpression = null;
    {
      final LinkedHashSet<OntoLClass> visited = new LinkedHashSet<OntoLClass>();
      _xblockexpression = this.classHierarchy(c, visited);
    }
    return _xblockexpression;
  }
  
  private Set<OntoLClass> classHierarchy(final OntoLClass c, final LinkedHashSet<OntoLClass> visited) {
    LinkedHashSet<OntoLClass> _xblockexpression = null;
    {
      EList<OntoLClass> _superClasses = c.getSuperClasses();
      for (final OntoLClass current : _superClasses) {
        boolean _contains = visited.contains(current);
        boolean _not = (!_contains);
        if (_not) {
          visited.add(current);
          Set<OntoLClass> _classHierarchy = this.classHierarchy(current, visited);
          visited.addAll(_classHierarchy);
        }
      }
      _xblockexpression = visited;
    }
    return _xblockexpression;
  }
  
  /**
   * Returns a set containing the basic instantiated types of a given <b>entity</b>. It includes
   * direct declared fixed instantiations and indirectly instantiated powertypes.
   * <br><br>
   * ALERT: This method is SLOW, because it searches powertypes through the index.
   * 
   * @author Claudenir Fonseca
   */
  public LinkedHashSet<OntoLClass> getBasicInstantiatedClasses(final EntityDeclaration e) {
    final LinkedHashSet<OntoLClass> basicInstantiatedClasses = new LinkedHashSet<OntoLClass>();
    EList<OntoLClass> _instantiatedClasses = e.getInstantiatedClasses();
    basicInstantiatedClasses.addAll(_instantiatedClasses);
    if ((e instanceof OntoLClass)) {
      final Set<OntoLClass> ch = this.classHierarchy(((OntoLClass)e));
      Set<Model> _rechableModels = this.getRechableModels(e);
      final Function1<Model, EList<ModelElement>> _function = (Model it) -> {
        return it.getElements();
      };
      Iterable<EList<ModelElement>> _map = IterableExtensions.<Model, EList<ModelElement>>map(_rechableModels, _function);
      Iterable<ModelElement> _flatten = Iterables.<ModelElement>concat(_map);
      final Consumer<ModelElement> _function_1 = (ModelElement it) -> {
        if ((it instanceof OntoLClass)) {
          final OntoLClass aux = ((OntoLClass)it).getPowertypeOf();
          boolean _and = false;
          boolean _notEquals = (!Objects.equal(aux, null));
          if (!_notEquals) {
            _and = false;
          } else {
            boolean _or = false;
            boolean _equals = Objects.equal(aux, e);
            if (_equals) {
              _or = true;
            } else {
              boolean _contains = ch.contains(aux);
              _or = _contains;
            }
            _and = _or;
          }
          if (_and) {
            basicInstantiatedClasses.add(((OntoLClass)it));
          }
        }
      };
      _flatten.forEach(_function_1);
      return basicInstantiatedClasses;
    } else {
      return basicInstantiatedClasses;
    }
  }
  
  /**
   * Returns a set containing all types instantiated by a given <b>entity</b>.
   * <br><br>
   * ALERT: This method is SLOW, because it searches powertypes through the index.
   * 
   * @author Claudenir Fonseca
   */
  public LinkedHashSet<OntoLClass> getAllInstantiatedClasses(final EntityDeclaration e) {
    LinkedHashSet<OntoLClass> _xblockexpression = null;
    {
      final LinkedHashSet<OntoLClass> visited = new LinkedHashSet<OntoLClass>();
      LinkedHashSet<OntoLClass> _basicInstantiatedClasses = this.getBasicInstantiatedClasses(e);
      final Consumer<OntoLClass> _function = (OntoLClass it) -> {
        visited.add(it);
        Set<OntoLClass> _classHierarchy = this.classHierarchy(it);
        visited.addAll(_classHierarchy);
      };
      _basicInstantiatedClasses.forEach(_function);
      _xblockexpression = visited;
    }
    return _xblockexpression;
  }
  
  /**
   * Returns a set containing all properties of a given <b>entity</b>.
   * <br><br>
   * ALERT: This method is SLOW, because it searches powertypes through the index.
   * 
   * @author Claudenir Fonseca
   */
  public Set<Property> getAllProperties(final EntityDeclaration e) {
    final LinkedHashSet<Property> properties = new LinkedHashSet<Property>();
    LinkedHashSet<OntoLClass> _allInstantiatedClasses = this.getAllInstantiatedClasses(e);
    final Consumer<OntoLClass> _function = (OntoLClass it) -> {
      EList<Attribute> _attributes = it.getAttributes();
      properties.addAll(_attributes);
      EList<Reference> _references = it.getReferences();
      properties.addAll(_references);
    };
    _allInstantiatedClasses.forEach(_function);
    return properties;
  }
  
  public LinkedHashSet<Attribute> getAllAttributes(final EntityDeclaration e) {
    final LinkedHashSet<Attribute> attributes = new LinkedHashSet<Attribute>();
    LinkedHashSet<OntoLClass> _allInstantiatedClasses = this.getAllInstantiatedClasses(e);
    final Consumer<OntoLClass> _function = (OntoLClass it) -> {
      EList<Attribute> _attributes = it.getAttributes();
      attributes.addAll(_attributes);
    };
    _allInstantiatedClasses.forEach(_function);
    return attributes;
  }
  
  public LinkedHashSet<Reference> getAllReferences(final EntityDeclaration e) {
    final LinkedHashSet<Reference> references = new LinkedHashSet<Reference>();
    LinkedHashSet<OntoLClass> _allInstantiatedClasses = this.getAllInstantiatedClasses(e);
    final Consumer<OntoLClass> _function = (OntoLClass it) -> {
      EList<Reference> _references = it.getReferences();
      references.addAll(_references);
    };
    _allInstantiatedClasses.forEach(_function);
    return references;
  }
  
  /**
   * Returns a set containing all inherited properties of a given <b>type<b>.
   * 
   * @author Claudenir Fonseca
   */
  public Set<Property> getAllInheritedProperties(final OntoLClass c) {
    try {
      throw new Exception("Stop using getAllProperties()");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Set<Attribute> getAllInheritedAttributes(final OntoLClass c) {
    Set<OntoLClass> _classHierarchy = this.classHierarchy(c);
    final Function1<OntoLClass, EList<Attribute>> _function = (OntoLClass it) -> {
      return it.getAttributes();
    };
    Iterable<EList<Attribute>> _map = IterableExtensions.<OntoLClass, EList<Attribute>>map(_classHierarchy, _function);
    Iterable<Attribute> _flatten = Iterables.<Attribute>concat(_map);
    return IterableExtensions.<Attribute>toSet(_flatten);
  }
  
  public Set<Reference> getAllInheritedReferences(final OntoLClass c) {
    Set<OntoLClass> _classHierarchy = this.classHierarchy(c);
    final Function1<OntoLClass, EList<Reference>> _function = (OntoLClass it) -> {
      return it.getReferences();
    };
    Iterable<EList<Reference>> _map = IterableExtensions.<OntoLClass, EList<Reference>>map(_classHierarchy, _function);
    Iterable<Reference> _flatten = Iterables.<Reference>concat(_map);
    return IterableExtensions.<Reference>toSet(_flatten);
  }
  
  /**
   * Checks if an <b>assignment</b> conforms to a given <b>type</b>.
   * 
   * @author Claudenir Fonseca
   */
  public boolean isConformantTo(final Value assignment, final OntoLClass assigType) {
    if ((assignment instanceof StringValue)) {
      return true;
    } else {
      if ((assignment instanceof NumberValue)) {
        return true;
      } else {
        if ((assignment instanceof BooleanValue)) {
          return true;
        } else {
          if ((assignment instanceof NoneValue)) {
            return true;
          } else {
            if ((assignment instanceof ReferenceValue)) {
              final EntityDeclaration actualValue = ((ReferenceValue)assignment).getValue();
              LinkedHashSet<OntoLClass> _allInstantiatedClasses = this.getAllInstantiatedClasses(actualValue);
              boolean _contains = _allInstantiatedClasses.contains(assigType);
              if (_contains) {
                return true;
              }
            } else {
              if ((assignment instanceof DataValue)) {
                final OntoLClass datatype = this._ontoLLib.getLibClass(assigType, OntoLLib.DATATYPES_DATATYPE);
                Set<OntoLClass> _classHierarchy = this.classHierarchy(assigType);
                boolean _contains_1 = _classHierarchy.contains(datatype);
                boolean _not = (!_contains_1);
                if (_not) {
                  return false;
                }
              }
            }
          }
        }
      }
    }
    return false;
  }
}

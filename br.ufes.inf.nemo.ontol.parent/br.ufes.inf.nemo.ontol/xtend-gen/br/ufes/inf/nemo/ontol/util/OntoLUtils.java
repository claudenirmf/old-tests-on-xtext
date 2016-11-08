/**
 * Auxiliary methods for enable navigation and checking through OntoL Models.
 * 
 * @author Claudenir Fonseca
 */
package br.ufes.inf.nemo.ontol.util;

import br.ufes.inf.nemo.ontol.model.Attribute;
import br.ufes.inf.nemo.ontol.model.EntityDeclaration;
import br.ufes.inf.nemo.ontol.model.Include;
import br.ufes.inf.nemo.ontol.model.Model;
import br.ufes.inf.nemo.ontol.model.ModelElement;
import br.ufes.inf.nemo.ontol.model.OntoLClass;
import br.ufes.inf.nemo.ontol.model.Property;
import br.ufes.inf.nemo.ontol.model.Reference;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class OntoLUtils {
  public Iterable<Model> getRechableModels(final ModelElement elem) {
    EObject _eContainer = elem.eContainer();
    EList<ModelElement> _elements = ((Model) _eContainer).getElements();
    final Function1<ModelElement, Boolean> _function = (ModelElement it) -> {
      return Boolean.valueOf((it instanceof Include));
    };
    Iterable<ModelElement> _filter = IterableExtensions.<ModelElement>filter(_elements, _function);
    final Function1<ModelElement, Model> _function_1 = (ModelElement it) -> {
      return ((Include) it).getInclude();
    };
    return IterableExtensions.<ModelElement, Model>map(_filter, _function_1);
  }
  
  /**
   * Returns a set of all super types of the given <b>type</b>. The set does not
   * include the <b>type</b> unless it is in a specialization cycle.
   * 
   * @author Claudenir Fonseca
   */
  public LinkedHashSet<OntoLClass> classHierarchy(final OntoLClass c) {
    LinkedHashSet<OntoLClass> _xblockexpression = null;
    {
      final LinkedHashSet<OntoLClass> visited = new LinkedHashSet<OntoLClass>();
      _xblockexpression = this.classHierarchy(c, visited);
    }
    return _xblockexpression;
  }
  
  private LinkedHashSet<OntoLClass> classHierarchy(final OntoLClass c, final LinkedHashSet<OntoLClass> visited) {
    LinkedHashSet<OntoLClass> _xblockexpression = null;
    {
      EList<OntoLClass> _superClasses = c.getSuperClasses();
      for (final OntoLClass current : _superClasses) {
        boolean _contains = visited.contains(current);
        boolean _not = (!_contains);
        if (_not) {
          visited.add(current);
          LinkedHashSet<OntoLClass> _classHierarchy = this.classHierarchy(current, visited);
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
      final Iterable<Model> includedModels = this.getRechableModels(e);
      final Function1<Model, Iterable<ModelElement>> _function = (Model it) -> {
        EList<ModelElement> _elements = it.getElements();
        final Function1<ModelElement, Boolean> _function_1 = (ModelElement it_1) -> {
          boolean _xifexpression = false;
          if ((it_1 instanceof OntoLClass)) {
            OntoLClass _powertypeOf = ((OntoLClass)it_1).getPowertypeOf();
            _xifexpression = (!Objects.equal(_powertypeOf, null));
          } else {
            _xifexpression = false;
          }
          return Boolean.valueOf(_xifexpression);
        };
        return IterableExtensions.<ModelElement>filter(_elements, _function_1);
      };
      final Iterable<Iterable<ModelElement>> possiblePowertypes = IterableExtensions.<Model, Iterable<ModelElement>>map(includedModels, _function);
      final LinkedHashSet<OntoLClass> ch = this.classHierarchy(((OntoLClass)e));
      final Consumer<Iterable<ModelElement>> _function_1 = (Iterable<ModelElement> it) -> {
        final OntoLClass pwt = ((OntoLClass) it);
        OntoLClass _powertypeOf = pwt.getPowertypeOf();
        boolean _contains = ch.contains(_powertypeOf);
        if (_contains) {
          basicInstantiatedClasses.add(pwt);
        }
      };
      possiblePowertypes.forEach(_function_1);
    } else {
      return basicInstantiatedClasses;
    }
    return null;
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
        LinkedHashSet<OntoLClass> _classHierarchy = this.classHierarchy(it);
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
    try {
      throw new Exception("Stop using getAllProperties()");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
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
    LinkedHashSet<OntoLClass> _classHierarchy = this.classHierarchy(c);
    final Function1<OntoLClass, EList<Attribute>> _function = (OntoLClass it) -> {
      return it.getAttributes();
    };
    Iterable<EList<Attribute>> _map = IterableExtensions.<OntoLClass, EList<Attribute>>map(_classHierarchy, _function);
    Iterable<Attribute> _flatten = Iterables.<Attribute>concat(_map);
    return IterableExtensions.<Attribute>toSet(_flatten);
  }
  
  public Set<Reference> getAllInheritedReferences(final OntoLClass c) {
    LinkedHashSet<OntoLClass> _classHierarchy = this.classHierarchy(c);
    final Function1<OntoLClass, EList<Reference>> _function = (OntoLClass it) -> {
      return it.getReferences();
    };
    Iterable<EList<Reference>> _map = IterableExtensions.<OntoLClass, EList<Reference>>map(_classHierarchy, _function);
    Iterable<Reference> _flatten = Iterables.<Reference>concat(_map);
    return IterableExtensions.<Reference>toSet(_flatten);
  }
}

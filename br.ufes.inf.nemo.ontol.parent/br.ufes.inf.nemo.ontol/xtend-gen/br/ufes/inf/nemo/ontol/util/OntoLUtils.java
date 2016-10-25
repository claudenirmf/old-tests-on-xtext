/**
 * Auxiliary methods for enable navigation and checking through OntoL Models.
 * 
 * @author Claudenir Fonseca
 */
package br.ufes.inf.nemo.ontol.util;

import br.ufes.inf.nemo.ontol.model.EntityDeclaration;
import br.ufes.inf.nemo.ontol.model.Individual;
import br.ufes.inf.nemo.ontol.model.Property;
import br.ufes.inf.nemo.ontol.util.OntoLIndex;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class OntoLUtils {
  @Inject
  @Extension
  private OntoLIndex _ontoLIndex;
  
  /**
   * Minimum order of a high-order type.
   * 
   * @author Claudenir Fonseca
   */
  public final static int HO_TYPE_MIN_ORDER = 2;
  
  /**
   * Returns a set of all super types of the given <b>type</b>. The set does not
   * include the <b>type</b> unless it is in a specialization cycle.
   * 
   * @author Claudenir Fonseca
   */
  public LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> classHierarchy(final br.ufes.inf.nemo.ontol.model.Class c) {
    LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> _xblockexpression = null;
    {
      final LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> visited = new LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class>();
      _xblockexpression = this.classHierarchy(c, visited);
    }
    return _xblockexpression;
  }
  
  private LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> classHierarchy(final br.ufes.inf.nemo.ontol.model.Class c, final LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> visited) {
    LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> _xblockexpression = null;
    {
      EList<br.ufes.inf.nemo.ontol.model.Class> _superClasses = c.getSuperClasses();
      for (final br.ufes.inf.nemo.ontol.model.Class current : _superClasses) {
        boolean _contains = visited.contains(current);
        boolean _not = (!_contains);
        if (_not) {
          visited.add(current);
          LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> _classHierarchy = this.classHierarchy(current, visited);
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
  public LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> getBasicFixedTypes(final EntityDeclaration e) {
    final LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> basicFixedTypes = new LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class>();
    EList<br.ufes.inf.nemo.ontol.model.Class> _fixedTypes = e.getFixedTypes();
    basicFixedTypes.addAll(_fixedTypes);
    if ((e instanceof br.ufes.inf.nemo.ontol.model.Class)) {
      final LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> ch = this.classHierarchy(((br.ufes.inf.nemo.ontol.model.Class)e));
      Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._ontoLIndex.getVisibleEObjectDescriptions(e);
      final Consumer<IEObjectDescription> _function = (IEObjectDescription it) -> {
        br.ufes.inf.nemo.ontol.model.Class _xifexpression = null;
        EClass _eClass = it.getEClass();
        if ((_eClass instanceof br.ufes.inf.nemo.ontol.model.Class)) {
          EClass _eClass_1 = it.getEClass();
          _xifexpression = ((br.ufes.inf.nemo.ontol.model.Class) _eClass_1);
        } else {
          _xifexpression = null;
        }
        final br.ufes.inf.nemo.ontol.model.Class c = _xifexpression;
        if ((((!Objects.equal(c, null)) && (!Objects.equal(c.getPowertypeOf(), null))) && ch.contains(c.getPowertypeOf()))) {
          basicFixedTypes.add(((br.ufes.inf.nemo.ontol.model.Class) c));
        }
      };
      _visibleEObjectDescriptions.forEach(_function);
      return basicFixedTypes;
    } else {
      if ((e instanceof Individual)) {
        return basicFixedTypes;
      }
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
  public LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> getAllFixedTypes(final EntityDeclaration e) {
    LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> _xblockexpression = null;
    {
      final LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> visited = new LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class>();
      LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> _basicFixedTypes = this.getBasicFixedTypes(e);
      final Consumer<br.ufes.inf.nemo.ontol.model.Class> _function = (br.ufes.inf.nemo.ontol.model.Class it) -> {
        visited.add(it);
        LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> _classHierarchy = this.classHierarchy(it);
        visited.addAll(_classHierarchy);
      };
      _basicFixedTypes.forEach(_function);
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
  public LinkedHashSet<Property> getAllProperties(final EntityDeclaration e) {
    final LinkedHashSet<Property> properties = new LinkedHashSet<Property>();
    LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> _allFixedTypes = this.getAllFixedTypes(e);
    final Consumer<br.ufes.inf.nemo.ontol.model.Class> _function = (br.ufes.inf.nemo.ontol.model.Class it) -> {
      EList<Property> _props = it.getProps();
      properties.addAll(_props);
    };
    _allFixedTypes.forEach(_function);
    return properties;
  }
  
  /**
   * Returns a set containing all inherited properties of a given <b>type<b>.
   * 
   * @author Claudenir Fonseca
   */
  public Set<Property> getAllInheritedProperties(final br.ufes.inf.nemo.ontol.model.Class c) {
    LinkedHashSet<br.ufes.inf.nemo.ontol.model.Class> _classHierarchy = this.classHierarchy(c);
    final Function1<br.ufes.inf.nemo.ontol.model.Class, EList<Property>> _function = (br.ufes.inf.nemo.ontol.model.Class it) -> {
      return it.getProps();
    };
    Iterable<EList<Property>> _map = IterableExtensions.<br.ufes.inf.nemo.ontol.model.Class, EList<Property>>map(_classHierarchy, _function);
    Iterable<Property> _flatten = Iterables.<Property>concat(_map);
    return IterableExtensions.<Property>toSet(_flatten);
  }
}

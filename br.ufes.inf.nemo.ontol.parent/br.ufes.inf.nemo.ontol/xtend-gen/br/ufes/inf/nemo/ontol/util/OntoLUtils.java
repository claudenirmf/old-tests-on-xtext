/**
 * Auxiliary methods for enable navigation and checking through OntoL Models.
 * 
 * @author Claudenir Fonseca
 */
package br.ufes.inf.nemo.ontol.util;

import br.ufes.inf.nemo.ontol.model.EntityDeclaration;
import br.ufes.inf.nemo.ontol.model.Property;
import br.ufes.inf.nemo.ontol.util.OntoLIndex;
import com.google.inject.Inject;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;

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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field fixedTypes is undefined for the type EntityDeclaration");
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field props is undefined for the type Class");
  }
  
  /**
   * Returns a set containing all inherited properties of a given <b>type<b>.
   * 
   * @author Claudenir Fonseca
   */
  public Set<Object> getAllInheritedProperties(final br.ufes.inf.nemo.ontol.model.Class c) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field props is undefined");
  }
}

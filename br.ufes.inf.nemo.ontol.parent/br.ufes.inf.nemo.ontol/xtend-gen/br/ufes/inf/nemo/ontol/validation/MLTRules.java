package br.ufes.inf.nemo.ontol.validation;

import br.ufes.inf.nemo.ontol.model.HOClass;
import br.ufes.inf.nemo.ontol.model.OntoLClass;
import br.ufes.inf.nemo.ontol.util.OntoLUtils;
import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class MLTRules {
  @Inject
  @Extension
  private OntoLUtils _ontoLUtils;
  
  public final static int MIN_ORDER = 2;
  
  public final static String INVALID_HO_CLASS_ORDER = "br.ufes.inf.nemo.ontol.InvalidHOClassOrder";
  
  public final static String MISSING_SPECIALIZATION_THROUGH_POWERTYPE = "br.ufes.inf.nemo.ontol.MissingSpecializationThroughPowertype";
  
  public boolean minOrder(final HOClass ho) {
    boolean _xifexpression = false;
    Integer _order = ho.getOrder();
    boolean _lessThan = ((_order).intValue() < MLTRules.MIN_ORDER);
    if (_lessThan) {
      _xifexpression = false;
    } else {
      _xifexpression = true;
    }
    return _xifexpression;
  }
  
  public boolean isMissingSpecializationThroughPowertype(final OntoLClass c, final Set<OntoLClass> cHierarchy) {
    LinkedHashSet<OntoLClass> _allInstantiatedClasses = this._ontoLUtils.getAllInstantiatedClasses(c);
    final Function1<OntoLClass, Boolean> _function = (OntoLClass ho) -> {
      OntoLClass _powertypeOf = ho.getPowertypeOf();
      boolean _notEquals = (!Objects.equal(_powertypeOf, null));
      if (_notEquals) {
        boolean _and = false;
        OntoLClass _powertypeOf_1 = ho.getPowertypeOf();
        boolean _contains = cHierarchy.contains(_powertypeOf_1);
        boolean _not = (!_contains);
        if (!_not) {
          _and = false;
        } else {
          OntoLClass _powertypeOf_2 = ho.getPowertypeOf();
          boolean _notEquals_1 = (!Objects.equal(_powertypeOf_2, c));
          _and = _notEquals_1;
        }
        if (_and) {
          return Boolean.valueOf(true);
        }
      }
      return Boolean.valueOf(false);
    };
    return IterableExtensions.<OntoLClass>exists(_allInstantiatedClasses, _function);
  }
}

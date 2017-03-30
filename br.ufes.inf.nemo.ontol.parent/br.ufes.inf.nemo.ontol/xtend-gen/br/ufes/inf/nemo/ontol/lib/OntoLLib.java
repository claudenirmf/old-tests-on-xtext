package br.ufes.inf.nemo.ontol.lib;

import br.ufes.inf.nemo.ontol.model.ModelPackage;
import br.ufes.inf.nemo.ontol.model.OntoLClass;
import br.ufes.inf.nemo.ontol.util.OntoLIndex;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class OntoLLib {
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Inject
  @Extension
  private OntoLIndex _ontoLIndex;
  
  public final static String MODEL_DATATYPES = "br/ufes/inf/nemo/ontol/lib/datatype.ontol";
  
  public final static String DATATYPES_LIB = "ontol.core.datatype";
  
  public final static String DATATYPES_DATATYPE = (OntoLLib.DATATYPES_LIB + ".DataType");
  
  public final static String DATATYPES_STRING = (OntoLLib.DATATYPES_LIB + ".String");
  
  public final static String DATATYPES_NUMBER = (OntoLLib.DATATYPES_LIB + ".Number");
  
  public final static String DATATYPES_BOOLEAN = (OntoLLib.DATATYPES_LIB + ".Boolean");
  
  public final static String MODEL_UFO_BASE = "br/ufes/inf/nemo/ontol/lib/ufo_base.ontol";
  
  public final static String MODEL_UFO_ENDURANT = "br/ufes/inf/nemo/ontol/lib/ufo_endurant.ontol";
  
  public final static String MODEL_UFO_META = "br/ufes/inf/nemo/ontol/lib/ufo_meta.ontol";
  
  public final static String UFO_BASE_LIB = "ontol.core.base";
  
  public final static String UFO_ENDURANT_LIB = "ontol.core.endurant";
  
  public final static String UFO_META_LIB = "ontol.core.meta";
  
  public final static String UFO_ENDURANT = (OntoLLib.UFO_ENDURANT_LIB + ".Endurant");
  
  public final static String UFO_SUBSTANTIAL = (OntoLLib.UFO_ENDURANT_LIB + ".Substantial");
  
  public final static String UFO_MOMENT = (OntoLLib.UFO_ENDURANT_LIB + ".Moment");
  
  public final static String UFO_FUNCTIONAL_COMPLEX = (OntoLLib.UFO_ENDURANT_LIB + ".FunctionalComplex");
  
  public final static String UFO_COLLECTIVE = (OntoLLib.UFO_ENDURANT_LIB + ".Collective");
  
  public final static String UFO_QUANTITY = (OntoLLib.UFO_ENDURANT_LIB + ".Quantity");
  
  public final static String UFO_RELATOR = (OntoLLib.UFO_ENDURANT_LIB + ".Relator");
  
  public final static String UFO_CONCRETE_RELATOR_TYPE = (OntoLLib.UFO_ENDURANT_LIB + ".ConcreteRelatorType");
  
  public final static String UFO_INTRINSIC_MOMENT = (OntoLLib.UFO_ENDURANT_LIB + ".IntrinsicMoment");
  
  public final static String UFO_QUALITY = (OntoLLib.UFO_ENDURANT_LIB + ".Quality");
  
  public final static String UFO_MODE = (OntoLLib.UFO_ENDURANT_LIB + ".Mode");
  
  public final static String UFO_EXTERNALLY_DEPENDENT_MODE = (OntoLLib.UFO_ENDURANT_LIB + ".ExternallyDependentMode");
  
  public final static String UFO_QUA_INDIVIDUAL = (OntoLLib.UFO_ENDURANT_LIB + ".QuaIndividual");
  
  public final static String UFO_SORTAL_CLASS = (OntoLLib.UFO_META_LIB + ".SortalClass");
  
  public final static String UFO_MIXIN_CLASS = (OntoLLib.UFO_META_LIB + ".MixinClass");
  
  public final static String UFO_RIGID_CLASS = (OntoLLib.UFO_META_LIB + ".RigidClass");
  
  public final static String UFO_SEMI_RIGID_CLASS = (OntoLLib.UFO_META_LIB + ".SemiRigidClass");
  
  public final static String UFO_ANTI_RIGID_CLASS = (OntoLLib.UFO_META_LIB + ".AntiRigidClass");
  
  public final static String UFO_KIND = (OntoLLib.UFO_META_LIB + ".Kind");
  
  public final static String UFO_SUBKIND = (OntoLLib.UFO_META_LIB + ".Subkind");
  
  public final static String UFO_SORTAL = (OntoLLib.UFO_META_LIB + ".Sortal");
  
  public final static String UFO_ROLE = (OntoLLib.UFO_META_LIB + ".Role");
  
  public final static String UFO_PHASE = (OntoLLib.UFO_META_LIB + ".Phase");
  
  public final static String UFO_PHASE_PARTITION = (OntoLLib.UFO_META_LIB + ".PhasePartition");
  
  public final static String UFO_CATEGORY = (OntoLLib.UFO_META_LIB + ".Category");
  
  public final static String UFO_MIXIN = (OntoLLib.UFO_META_LIB + ".Mixin");
  
  public final static String UFO_ROLE_MIXIN = (OntoLLib.UFO_META_LIB + ".RoleMixin");
  
  public final static String UFO_PHASE_MIXIN = (OntoLLib.UFO_META_LIB + ".PhaseMixin");
  
  public final static String UFO_PHASE_MIXIN_PARTITION = (OntoLLib.UFO_META_LIB + ".PhaseMixinPartition");
  
  public ResourceSet loadLib(final String libname) {
    ResourceSet _xblockexpression = null;
    {
      Class<? extends OntoLLib> _class = this.getClass();
      ClassLoader _classLoader = _class.getClassLoader();
      final InputStream stream = _classLoader.getResourceAsStream(libname);
      ResourceSet _get = this.resourceSetProvider.get();
      final Procedure1<ResourceSet> _function = (ResourceSet resourceSet) -> {
        try {
          URI _createURI = URI.createURI(libname);
          final Resource resource = resourceSet.createResource(_createURI);
          Map<Object, Object> _loadOptions = resourceSet.getLoadOptions();
          resource.load(stream, _loadOptions);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      _xblockexpression = ObjectExtensions.<ResourceSet>operator_doubleArrow(_get, _function);
    }
    return _xblockexpression;
  }
  
  public ResourceSet loadLib(final String libname, final ResourceSet rs) {
    ResourceSet _xblockexpression = null;
    {
      Class<? extends OntoLLib> _class = this.getClass();
      ClassLoader _classLoader = _class.getClassLoader();
      final InputStream stream = _classLoader.getResourceAsStream(libname);
      final Procedure1<ResourceSet> _function = (ResourceSet resourceSet) -> {
        try {
          URI _createURI = URI.createURI(libname);
          final Resource resource = resourceSet.createResource(_createURI);
          Map<Object, Object> _loadOptions = resourceSet.getLoadOptions();
          resource.load(stream, _loadOptions);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      _xblockexpression = ObjectExtensions.<ResourceSet>operator_doubleArrow(rs, _function);
    }
    return _xblockexpression;
  }
  
  public ResourceSet loadUFOLib() {
    ResourceSet _loadLib = this.loadLib(OntoLLib.MODEL_UFO_META);
    ResourceSet _loadLib_1 = this.loadLib(OntoLLib.MODEL_UFO_ENDURANT, _loadLib);
    return this.loadLib(OntoLLib.MODEL_UFO_BASE, _loadLib_1);
  }
  
  public ResourceSet loadUFOLib(final ResourceSet rs) {
    ResourceSet _xblockexpression = null;
    {
      this.loadLib(OntoLLib.MODEL_UFO_BASE, rs);
      this.loadLib(OntoLLib.MODEL_UFO_ENDURANT, rs);
      _xblockexpression = this.loadLib(OntoLLib.MODEL_UFO_META, rs);
    }
    return _xblockexpression;
  }
  
  public ResourceSet loadDatatypeLib() {
    return this.loadLib(OntoLLib.MODEL_DATATYPES);
  }
  
  public ResourceSet loadDatatypeLib(final ResourceSet rs) {
    return this.loadLib(OntoLLib.MODEL_DATATYPES, rs);
  }
  
  public OntoLClass getLibClass(final EObject context, final String name) {
    EClass _ontoLClass = ModelPackage.eINSTANCE.getOntoLClass();
    EObject _modelElementFromIndex = this._ontoLIndex.getModelElementFromIndex(context, name, _ontoLClass);
    return ((OntoLClass) _modelElementFromIndex);
  }
  
  public OntoLClass getUFOEndurant(final EObject context) {
    EClass _ontoLClass = ModelPackage.eINSTANCE.getOntoLClass();
    EObject _modelElementFromIndex = this._ontoLIndex.getModelElementFromIndex(context, OntoLLib.UFO_ENDURANT, _ontoLClass);
    return ((OntoLClass) _modelElementFromIndex);
  }
  
  public Set<OntoLClass> getUFOMustInstantiateClasses(final EObject context) {
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._ontoLIndex.getVisibleEObjectDescriptions(context);
    final Function1<IEObjectDescription, Boolean> _function = (IEObjectDescription it) -> {
      QualifiedName _qualifiedName = it.getQualifiedName();
      final String fqn = _qualifiedName.toString();
      return Boolean.valueOf((((((((fqn.equals(OntoLLib.UFO_KIND) || fqn.equals(OntoLLib.UFO_SUBKIND)) || fqn.equals(OntoLLib.UFO_PHASE)) || 
        fqn.equals(OntoLLib.UFO_ROLE)) || fqn.equals(OntoLLib.UFO_CATEGORY)) || fqn.equals(OntoLLib.UFO_MIXIN)) || 
        fqn.equals(OntoLLib.UFO_PHASE_MIXIN)) || fqn.equals(OntoLLib.UFO_ROLE_MIXIN)));
    };
    final Iterable<IEObjectDescription> descs = IterableExtensions.<IEObjectDescription>filter(_visibleEObjectDescriptions, _function);
    final Function1<IEObjectDescription, OntoLClass> _function_1 = (IEObjectDescription it) -> {
      EObject o = it.getEObjectOrProxy();
      boolean _eIsProxy = o.eIsProxy();
      if (_eIsProxy) {
        Resource _eResource = context.eResource();
        ResourceSet _resourceSet = _eResource.getResourceSet();
        URI _eObjectURI = it.getEObjectURI();
        EObject _eObject = _resourceSet.getEObject(_eObjectURI, true);
        o = _eObject;
      }
      return ((OntoLClass) o);
    };
    final Iterable<OntoLClass> objs = IterableExtensions.<IEObjectDescription, OntoLClass>map(descs, _function_1);
    return IterableExtensions.<OntoLClass>toSet(objs);
  }
}

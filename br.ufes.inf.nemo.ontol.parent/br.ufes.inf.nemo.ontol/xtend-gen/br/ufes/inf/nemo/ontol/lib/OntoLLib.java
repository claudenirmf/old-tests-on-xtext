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
  
  public final static String MODEL_DATATYPES = "br/ufes/inf/nemo/ontol/lib/datatypes.ontol";
  
  public final static String DATATYPES_LIB_NAME = "br.ufes.inf.nemo.ontol.lib.datatypes";
  
  public final static String DATATYPES_DATATYPE = (OntoLLib.DATATYPES_LIB_NAME + ".Datatype");
  
  public final static String DATATYPES_STRING = (OntoLLib.DATATYPES_LIB_NAME + ".String");
  
  public final static String DATATYPES_NUMBER = (OntoLLib.DATATYPES_LIB_NAME + ".Number");
  
  public final static String DATATYPES_BOOLEAN = (OntoLLib.DATATYPES_LIB_NAME + ".Boolean");
  
  public final static String MODEL_UFO_A = "br/ufes/inf/nemo/ontol/lib/ufo-a.ontol";
  
  public final static String UFO_A_LIB_NAME = "br.ufes.inf.nemo.ontol.lib.ufo.a";
  
  public final static String UFO_A_ENDURANT = (OntoLLib.UFO_A_LIB_NAME + ".Endurant");
  
  public final static String UFO_A_SUBSTANTIAL = (OntoLLib.UFO_A_LIB_NAME + ".Substantial");
  
  public final static String UFO_A_MOMENT = (OntoLLib.UFO_A_LIB_NAME + ".Moment");
  
  public final static String UFO_A_FUNCTIONAL_COMPLEX = (OntoLLib.UFO_A_LIB_NAME + ".FunctionalComplex");
  
  public final static String UFO_A_COLLECTIVE = (OntoLLib.UFO_A_LIB_NAME + ".Collective");
  
  public final static String UFO_A_QUANTITY = (OntoLLib.UFO_A_LIB_NAME + ".Quantity");
  
  public final static String UFO_A_RELATOR = (OntoLLib.UFO_A_LIB_NAME + ".Relator");
  
  public final static String UFO_A_INTRINSIC_MOMENT = (OntoLLib.UFO_A_LIB_NAME + ".IntrinsicMoment");
  
  public final static String UFO_A_MODE = (OntoLLib.UFO_A_LIB_NAME + ".Mode");
  
  public final static String UFO_A_QUALITY = (OntoLLib.UFO_A_LIB_NAME + ".Quality");
  
  public final static String UFO_A_SORTAL_CLASS = (OntoLLib.UFO_A_LIB_NAME + ".SortalClass");
  
  public final static String UFO_A_MIXIN_CLASS = (OntoLLib.UFO_A_LIB_NAME + ".MixinClass");
  
  public final static String UFO_A_RIGID_CLASS = (OntoLLib.UFO_A_LIB_NAME + ".RigidClass");
  
  public final static String UFO_A_SEMI_RIGID_CLASS = (OntoLLib.UFO_A_LIB_NAME + ".SemiRigidClass");
  
  public final static String UFO_A_ANTI_RIGID_CLASS = (OntoLLib.UFO_A_LIB_NAME + ".AntiRigidClass");
  
  public final static String UFO_A_RIGID_SORTAL = (OntoLLib.UFO_A_LIB_NAME + ".RigidSortal");
  
  public final static String UFO_A_ANTI_RIGID_SORTAL = (OntoLLib.UFO_A_LIB_NAME + ".AntiRigidSortal");
  
  public final static String UFO_A_ANTI_RIGID_MIXIN = (OntoLLib.UFO_A_LIB_NAME + ".AntiRigidMixin");
  
  public final static String UFO_A_KIND = (OntoLLib.UFO_A_LIB_NAME + ".Kind");
  
  public final static String UFO_A_SUBKIND = (OntoLLib.UFO_A_LIB_NAME + ".Subkind");
  
  public final static String UFO_A_SORTAL = (OntoLLib.UFO_A_LIB_NAME + ".Sortal");
  
  public final static String UFO_A_ROLE = (OntoLLib.UFO_A_LIB_NAME + ".Role");
  
  public final static String UFO_A_PHASE = (OntoLLib.UFO_A_LIB_NAME + ".Phase");
  
  public final static String UFO_A_CATEGORY = (OntoLLib.UFO_A_LIB_NAME + ".Category");
  
  public final static String UFO_A_MIXIN = (OntoLLib.UFO_A_LIB_NAME + ".Mixin");
  
  public final static String UFO_A_ROLE_MIXIN = (OntoLLib.UFO_A_LIB_NAME + ".RoleMixin");
  
  public final static String UFO_A_PHASE_MIXIN = (OntoLLib.UFO_A_LIB_NAME + ".PhaseMixin");
  
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
  
  public ResourceSet loadUFOALib() {
    return this.loadLib(OntoLLib.MODEL_UFO_A);
  }
  
  public ResourceSet loadUFOALib(final ResourceSet rs) {
    return this.loadLib(OntoLLib.MODEL_UFO_A, rs);
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
    EObject _modelElementFromIndex = this._ontoLIndex.getModelElementFromIndex(context, OntoLLib.UFO_A_ENDURANT, _ontoLClass);
    return ((OntoLClass) _modelElementFromIndex);
  }
  
  public Set<OntoLClass> getUFOMustInstantiateClasses(final EObject context) {
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._ontoLIndex.getVisibleEObjectDescriptions(context);
    final Function1<IEObjectDescription, Boolean> _function = (IEObjectDescription it) -> {
      QualifiedName _qualifiedName = it.getQualifiedName();
      final String fqn = _qualifiedName.toString();
      return Boolean.valueOf((((((((fqn.equals(OntoLLib.UFO_A_KIND) || fqn.equals(OntoLLib.UFO_A_SUBKIND)) || fqn.equals(OntoLLib.UFO_A_PHASE)) || 
        fqn.equals(OntoLLib.UFO_A_ROLE)) || fqn.equals(OntoLLib.UFO_A_CATEGORY)) || fqn.equals(OntoLLib.UFO_A_MIXIN)) || 
        fqn.equals(OntoLLib.UFO_A_PHASE_MIXIN)) || fqn.equals(OntoLLib.UFO_A_ROLE_MIXIN)));
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

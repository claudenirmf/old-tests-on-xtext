package br.ufes.inf.nemo.ontol.validation

import br.ufes.inf.nemo.ontol.model.Class
import br.ufes.inf.nemo.ontol.model.HOClass
import java.util.LinkedHashSet
import com.google.inject.Inject
import br.ufes.inf.nemo.ontol.util.OntoLUtils

class MLTRules {
	
	@Inject extension OntoLUtils
	
	public static val MIN_ORDER = 2
	
	public static val INVALID_HO_CLASS_ORDER = "br.ufes.inf.nemo.ontol.InvalidHOClassOrder"
	public static val MISSING_SPECIALIZATION_THROUGH_POWERTYPE = "br.ufes.inf.nemo.ontol.MissingSpecializationThroughPowertype"
	
	def minOrder(HOClass ho){
		if(ho.order < MIN_ORDER) false		else true
	}
	
	def isMissingSpecializationThroughPowertype(Class c, LinkedHashSet<Class> cHierarchy){
		return c.allFixedTypes.exists[ ho |
				if(ho.powertypeOf != null)
					if(!cHierarchy.contains(ho.powertypeOf) && ho.powertypeOf!=c)
						return true
				return false
			]
		// TODO Update to return missing specializations.
	}
	
}
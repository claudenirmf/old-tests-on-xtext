package br.ufes.inf.nemo.ontol.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import br.ufes.inf.nemo.ontol.model.Model
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import com.google.inject.Inject
import org.junit.Test
import br.ufes.inf.nemo.ontol.model.ModelPackage
import br.ufes.inf.nemo.ontol.validation.MLTRules

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(OntoLInjectorProvider))
class MLTRulesTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Test def testIsMissingSpecializationThroughPowertype(){
		val incorrectModel = ''' module t{
				hoclass HA order 2 ispowertypeof FA;
				foclass FA;		foclass FB : HA;
			}'''.parse
		incorrectModel.assertError(ModelPackage.eINSTANCE.class_,MLTRules.MISSING_SPECIALIZATION_THROUGH_POWERTYPE)
		
		val correctModel = ''' module t{
				hoclass HA order 2 ispowertypeof FA;
				foclass FA;		foclass FB : HA specializes FA;
			}'''.parse
		correctModel.assertNoErrors
	}
	
}
package br.ufes.inf.nemo.ontol.tests

import br.ufes.inf.nemo.ontol.model.Model
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(OntoLInjectorProvider))
class OntoLScopeProviderTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Test def void testPropertyAssigmentScopeForProperty(){
		val model = '''module t {
				
				foclass A { a : A };
				foclass B specializes A { a : A };
				individual Y : B { A.a = Y };
				individual Z : A { a = Z };
			}'''.parse
		model.assertNoErrors
	}
	
	@Test def void testPropertyScopeForSubesetOf(){
		val model = '''module t {
				foclass A { a1:A	a2:A };
				foclass B specializes A { a1:C };
				foclass C specializes B {
					b1:B subsets B.a1
					b2:B subsets a2
				};
			}'''.parse
		model.assertNoErrors
	}
	
	@Test def void testPropertyScopeForOppositeTo(){
		val model = '''module t {
				foclass A { 
					a1:A isoppositeto a2
					a2:A isoppositeto a1
					c:C isoppositeto a
				};
				foclass B { c:C };
				foclass C {
					a:A isoppositeto c
				};
			}'''.parse
		model.assertNoErrors
	}
	
	
		
}
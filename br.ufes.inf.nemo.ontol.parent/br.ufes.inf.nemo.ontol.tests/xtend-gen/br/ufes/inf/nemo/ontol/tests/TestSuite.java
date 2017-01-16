package br.ufes.inf.nemo.ontol.tests;

import br.ufes.inf.nemo.ontol.tests.LibraryTest;
import br.ufes.inf.nemo.ontol.tests.LinguistcRulesTest;
import br.ufes.inf.nemo.ontol.tests.MLTRulesTest;
import br.ufes.inf.nemo.ontol.tests.OntoLModelUtilTest;
import br.ufes.inf.nemo.ontol.tests.OntoLParsingTest;
import br.ufes.inf.nemo.ontol.tests.OntoLScopeProviderTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ LibraryTest.class, LinguistcRulesTest.class, MLTRulesTest.class, OntoLParsingTest.class, OntoLModelUtilTest.class, OntoLParsingTest.class, OntoLScopeProviderTest.class })
@SuppressWarnings("all")
public class TestSuite {
}

package br.ufes.inf.nemo.ontol.tests

import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses

@RunWith(Suite)
@SuiteClasses(
	LibraryTest,
	LinguistcRulesTest,
	MLTRulesTest,
	OntoLParsingTest,
	OntoLModelUtilTest,
	OntoLParsingTest,
	OntoLScopeProviderTest
)
class TestSuite {
	
}
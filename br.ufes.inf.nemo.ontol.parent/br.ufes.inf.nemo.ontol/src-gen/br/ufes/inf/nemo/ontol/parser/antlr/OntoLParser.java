/*
 * generated by Xtext 2.9.1
 */
package br.ufes.inf.nemo.ontol.parser.antlr;

import br.ufes.inf.nemo.ontol.parser.antlr.internal.InternalOntoLParser;
import br.ufes.inf.nemo.ontol.services.OntoLGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class OntoLParser extends AbstractAntlrParser {

	@Inject
	private OntoLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalOntoLParser createParser(XtextTokenStream stream) {
		return new InternalOntoLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public OntoLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OntoLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

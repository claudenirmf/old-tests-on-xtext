/*
 * generated by Xtext 2.9.1
 */
package br.ufes.inf.nemo.ontol.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class OntoLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("br/ufes/inf/nemo/ontol/parser/antlr/internal/InternalOntoL.tokens");
	}
}

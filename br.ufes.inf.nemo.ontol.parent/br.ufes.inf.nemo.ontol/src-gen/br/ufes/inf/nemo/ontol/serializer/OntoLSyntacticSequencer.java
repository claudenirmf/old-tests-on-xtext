/*
 * generated by Xtext 2.10.0
 */
package br.ufes.inf.nemo.ontol.serializer;

import br.ufes.inf.nemo.ontol.services.OntoLGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class OntoLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected OntoLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_FOClass_FirstOrderKeyword_0_q;
	protected AbstractElementAlias match_Individual___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_OntoLClass___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (OntoLGrammarAccess) access;
		match_FOClass_FirstOrderKeyword_0_q = new TokenAlias(false, true, grammarAccess.getFOClassAccess().getFirstOrderKeyword_0());
		match_Individual___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getIndividualAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getIndividualAccess().getRightCurlyBracketKeyword_3_2()));
		match_OntoLClass___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getOntoLClassAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getOntoLClassAccess().getRightCurlyBracketKeyword_1_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_FOClass_FirstOrderKeyword_0_q.equals(syntax))
				emit_FOClass_FirstOrderKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Individual___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Individual___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OntoLClass___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q.equals(syntax))
				emit_OntoLClass___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'first-order'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'class' name=ID
	 */
	protected void emit_FOClass_FirstOrderKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     instantiatedClasses+=[OntoLClass|QualifiedName] (ambiguity) ';' (rule end)
	 *     instantiatedClasses+=[OntoLClass|QualifiedName] (ambiguity) (rule end)
	 *     name=ID (ambiguity) ';' (rule end)
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_Individual___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     basetype=[OntoLClass|QualifiedName] (ambiguity) ';' (rule end)
	 *     basetype=[OntoLClass|QualifiedName] (ambiguity) (rule end)
	 *     instantiatedClasses+=[OntoLClass|QualifiedName] (ambiguity) ';' (rule end)
	 *     instantiatedClasses+=[OntoLClass|QualifiedName] (ambiguity) (rule end)
	 *     name=ID (ambiguity) ';' (rule end)
	 *     name=ID (ambiguity) (rule end)
	 *     powertypeOf=[OntoLClass|QualifiedName] (ambiguity) ';' (rule end)
	 *     powertypeOf=[OntoLClass|QualifiedName] (ambiguity) (rule end)
	 *     subordinators+=[OntoLClass|QualifiedName] (ambiguity) ';' (rule end)
	 *     subordinators+=[OntoLClass|QualifiedName] (ambiguity) (rule end)
	 *     superClasses+=[OntoLClass|QualifiedName] (ambiguity) ';' (rule end)
	 *     superClasses+=[OntoLClass|QualifiedName] (ambiguity) (rule end)
	 */
	protected void emit_OntoLClass___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

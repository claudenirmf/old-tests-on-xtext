package br.ufes.inf.nemo.ontol.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import br.ufes.inf.nemo.ontol.services.OntoLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntoLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'true'", "'false'", "'categorizes'", "'completeCategorizes'", "'disjointCategorizes'", "'partitions'", "'determinesMaxValue'", "'determinesMinValue'", "'determinesValue'", "'determinesPossibleValues'", "'determinesType'", "'determinesPossibleTypes'", "'module'", "'{'", "'}'", "'include'", "';'", "'.'", "'.*'", "'import'", "'individual'", "':'", "','", "'orderless'", "'class'", "'specializes'", "'subordinatedTo'", "'isPowertypeOf'", "'first-order'", "'order'", "'att'", "'['", "'..'", "']'", "'subsets'", "'ref'", "'isOppositeTo'", "'='", "'-'", "'none'", "'genset'", "'general'", "'specifics'", "'categorizer'", "'regularity'", "'disjoint'", "'complete'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalOntoLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOntoLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOntoLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOntoL.g"; }


    	private OntoLGrammarAccess grammarAccess;

    	public void setGrammarAccess(OntoLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalOntoL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalOntoL.g:54:1: ( ruleModel EOF )
            // InternalOntoL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOntoL.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalOntoL.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalOntoL.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalOntoL.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalOntoL.g:69:3: ( rule__Model__Group__0 )
            // InternalOntoL.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModelElement"
    // InternalOntoL.g:78:1: entryRuleModelElement : ruleModelElement EOF ;
    public final void entryRuleModelElement() throws RecognitionException {
        try {
            // InternalOntoL.g:79:1: ( ruleModelElement EOF )
            // InternalOntoL.g:80:1: ruleModelElement EOF
            {
             before(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_1);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // InternalOntoL.g:87:1: ruleModelElement : ( ( rule__ModelElement__Group__0 ) ) ;
    public final void ruleModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:91:2: ( ( ( rule__ModelElement__Group__0 ) ) )
            // InternalOntoL.g:92:2: ( ( rule__ModelElement__Group__0 ) )
            {
            // InternalOntoL.g:92:2: ( ( rule__ModelElement__Group__0 ) )
            // InternalOntoL.g:93:3: ( rule__ModelElement__Group__0 )
            {
             before(grammarAccess.getModelElementAccess().getGroup()); 
            // InternalOntoL.g:94:3: ( rule__ModelElement__Group__0 )
            // InternalOntoL.g:94:4: rule__ModelElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalOntoL.g:103:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalOntoL.g:104:1: ( ruleQualifiedName EOF )
            // InternalOntoL.g:105:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalOntoL.g:112:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:116:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalOntoL.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalOntoL.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalOntoL.g:118:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalOntoL.g:119:3: ( rule__QualifiedName__Group__0 )
            // InternalOntoL.g:119:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalOntoL.g:128:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalOntoL.g:129:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalOntoL.g:130:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalOntoL.g:137:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:141:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalOntoL.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalOntoL.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalOntoL.g:143:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalOntoL.g:144:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalOntoL.g:144:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleImport"
    // InternalOntoL.g:153:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalOntoL.g:154:1: ( ruleImport EOF )
            // InternalOntoL.g:155:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalOntoL.g:162:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:166:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalOntoL.g:167:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalOntoL.g:167:2: ( ( rule__Import__Group__0 ) )
            // InternalOntoL.g:168:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalOntoL.g:169:3: ( rule__Import__Group__0 )
            // InternalOntoL.g:169:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleEntityDeclaration"
    // InternalOntoL.g:178:1: entryRuleEntityDeclaration : ruleEntityDeclaration EOF ;
    public final void entryRuleEntityDeclaration() throws RecognitionException {
        try {
            // InternalOntoL.g:179:1: ( ruleEntityDeclaration EOF )
            // InternalOntoL.g:180:1: ruleEntityDeclaration EOF
            {
             before(grammarAccess.getEntityDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityDeclaration();

            state._fsp--;

             after(grammarAccess.getEntityDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityDeclaration"


    // $ANTLR start "ruleEntityDeclaration"
    // InternalOntoL.g:187:1: ruleEntityDeclaration : ( ( rule__EntityDeclaration__Alternatives ) ) ;
    public final void ruleEntityDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:191:2: ( ( ( rule__EntityDeclaration__Alternatives ) ) )
            // InternalOntoL.g:192:2: ( ( rule__EntityDeclaration__Alternatives ) )
            {
            // InternalOntoL.g:192:2: ( ( rule__EntityDeclaration__Alternatives ) )
            // InternalOntoL.g:193:3: ( rule__EntityDeclaration__Alternatives )
            {
             before(grammarAccess.getEntityDeclarationAccess().getAlternatives()); 
            // InternalOntoL.g:194:3: ( rule__EntityDeclaration__Alternatives )
            // InternalOntoL.g:194:4: rule__EntityDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EntityDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityDeclaration"


    // $ANTLR start "entryRuleIndividual"
    // InternalOntoL.g:203:1: entryRuleIndividual : ruleIndividual EOF ;
    public final void entryRuleIndividual() throws RecognitionException {
        try {
            // InternalOntoL.g:204:1: ( ruleIndividual EOF )
            // InternalOntoL.g:205:1: ruleIndividual EOF
            {
             before(grammarAccess.getIndividualRule()); 
            pushFollow(FOLLOW_1);
            ruleIndividual();

            state._fsp--;

             after(grammarAccess.getIndividualRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIndividual"


    // $ANTLR start "ruleIndividual"
    // InternalOntoL.g:212:1: ruleIndividual : ( ( rule__Individual__Group__0 ) ) ;
    public final void ruleIndividual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:216:2: ( ( ( rule__Individual__Group__0 ) ) )
            // InternalOntoL.g:217:2: ( ( rule__Individual__Group__0 ) )
            {
            // InternalOntoL.g:217:2: ( ( rule__Individual__Group__0 ) )
            // InternalOntoL.g:218:3: ( rule__Individual__Group__0 )
            {
             before(grammarAccess.getIndividualAccess().getGroup()); 
            // InternalOntoL.g:219:3: ( rule__Individual__Group__0 )
            // InternalOntoL.g:219:4: rule__Individual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Individual__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndividualAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIndividual"


    // $ANTLR start "entryRuleOntoLClass"
    // InternalOntoL.g:228:1: entryRuleOntoLClass : ruleOntoLClass EOF ;
    public final void entryRuleOntoLClass() throws RecognitionException {
        try {
            // InternalOntoL.g:229:1: ( ruleOntoLClass EOF )
            // InternalOntoL.g:230:1: ruleOntoLClass EOF
            {
             before(grammarAccess.getOntoLClassRule()); 
            pushFollow(FOLLOW_1);
            ruleOntoLClass();

            state._fsp--;

             after(grammarAccess.getOntoLClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOntoLClass"


    // $ANTLR start "ruleOntoLClass"
    // InternalOntoL.g:237:1: ruleOntoLClass : ( ( rule__OntoLClass__Group__0 ) ) ;
    public final void ruleOntoLClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:241:2: ( ( ( rule__OntoLClass__Group__0 ) ) )
            // InternalOntoL.g:242:2: ( ( rule__OntoLClass__Group__0 ) )
            {
            // InternalOntoL.g:242:2: ( ( rule__OntoLClass__Group__0 ) )
            // InternalOntoL.g:243:3: ( rule__OntoLClass__Group__0 )
            {
             before(grammarAccess.getOntoLClassAccess().getGroup()); 
            // InternalOntoL.g:244:3: ( rule__OntoLClass__Group__0 )
            // InternalOntoL.g:244:4: rule__OntoLClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntoLClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntoLClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntoLClass"


    // $ANTLR start "entryRuleOrderlessClass"
    // InternalOntoL.g:253:1: entryRuleOrderlessClass : ruleOrderlessClass EOF ;
    public final void entryRuleOrderlessClass() throws RecognitionException {
        try {
            // InternalOntoL.g:254:1: ( ruleOrderlessClass EOF )
            // InternalOntoL.g:255:1: ruleOrderlessClass EOF
            {
             before(grammarAccess.getOrderlessClassRule()); 
            pushFollow(FOLLOW_1);
            ruleOrderlessClass();

            state._fsp--;

             after(grammarAccess.getOrderlessClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrderlessClass"


    // $ANTLR start "ruleOrderlessClass"
    // InternalOntoL.g:262:1: ruleOrderlessClass : ( ( rule__OrderlessClass__Group__0 ) ) ;
    public final void ruleOrderlessClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:266:2: ( ( ( rule__OrderlessClass__Group__0 ) ) )
            // InternalOntoL.g:267:2: ( ( rule__OrderlessClass__Group__0 ) )
            {
            // InternalOntoL.g:267:2: ( ( rule__OrderlessClass__Group__0 ) )
            // InternalOntoL.g:268:3: ( rule__OrderlessClass__Group__0 )
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup()); 
            // InternalOntoL.g:269:3: ( rule__OrderlessClass__Group__0 )
            // InternalOntoL.g:269:4: rule__OrderlessClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderlessClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderlessClass"


    // $ANTLR start "entryRuleFOClass"
    // InternalOntoL.g:278:1: entryRuleFOClass : ruleFOClass EOF ;
    public final void entryRuleFOClass() throws RecognitionException {
        try {
            // InternalOntoL.g:279:1: ( ruleFOClass EOF )
            // InternalOntoL.g:280:1: ruleFOClass EOF
            {
             before(grammarAccess.getFOClassRule()); 
            pushFollow(FOLLOW_1);
            ruleFOClass();

            state._fsp--;

             after(grammarAccess.getFOClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFOClass"


    // $ANTLR start "ruleFOClass"
    // InternalOntoL.g:287:1: ruleFOClass : ( ( rule__FOClass__Group__0 ) ) ;
    public final void ruleFOClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:291:2: ( ( ( rule__FOClass__Group__0 ) ) )
            // InternalOntoL.g:292:2: ( ( rule__FOClass__Group__0 ) )
            {
            // InternalOntoL.g:292:2: ( ( rule__FOClass__Group__0 ) )
            // InternalOntoL.g:293:3: ( rule__FOClass__Group__0 )
            {
             before(grammarAccess.getFOClassAccess().getGroup()); 
            // InternalOntoL.g:294:3: ( rule__FOClass__Group__0 )
            // InternalOntoL.g:294:4: rule__FOClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFOClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFOClass"


    // $ANTLR start "entryRuleHOClass"
    // InternalOntoL.g:303:1: entryRuleHOClass : ruleHOClass EOF ;
    public final void entryRuleHOClass() throws RecognitionException {
        try {
            // InternalOntoL.g:304:1: ( ruleHOClass EOF )
            // InternalOntoL.g:305:1: ruleHOClass EOF
            {
             before(grammarAccess.getHOClassRule()); 
            pushFollow(FOLLOW_1);
            ruleHOClass();

            state._fsp--;

             after(grammarAccess.getHOClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHOClass"


    // $ANTLR start "ruleHOClass"
    // InternalOntoL.g:312:1: ruleHOClass : ( ( rule__HOClass__Group__0 ) ) ;
    public final void ruleHOClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:316:2: ( ( ( rule__HOClass__Group__0 ) ) )
            // InternalOntoL.g:317:2: ( ( rule__HOClass__Group__0 ) )
            {
            // InternalOntoL.g:317:2: ( ( rule__HOClass__Group__0 ) )
            // InternalOntoL.g:318:3: ( rule__HOClass__Group__0 )
            {
             before(grammarAccess.getHOClassAccess().getGroup()); 
            // InternalOntoL.g:319:3: ( rule__HOClass__Group__0 )
            // InternalOntoL.g:319:4: rule__HOClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHOClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalOntoL.g:328:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalOntoL.g:329:1: ( ruleAttribute EOF )
            // InternalOntoL.g:330:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalOntoL.g:337:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:341:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalOntoL.g:342:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalOntoL.g:342:2: ( ( rule__Attribute__Group__0 ) )
            // InternalOntoL.g:343:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalOntoL.g:344:3: ( rule__Attribute__Group__0 )
            // InternalOntoL.g:344:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRegularityAttribute"
    // InternalOntoL.g:353:1: entryRuleRegularityAttribute : ruleRegularityAttribute EOF ;
    public final void entryRuleRegularityAttribute() throws RecognitionException {
        try {
            // InternalOntoL.g:354:1: ( ruleRegularityAttribute EOF )
            // InternalOntoL.g:355:1: ruleRegularityAttribute EOF
            {
             before(grammarAccess.getRegularityAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleRegularityAttribute();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegularityAttribute"


    // $ANTLR start "ruleRegularityAttribute"
    // InternalOntoL.g:362:1: ruleRegularityAttribute : ( ( rule__RegularityAttribute__Group__0 ) ) ;
    public final void ruleRegularityAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:366:2: ( ( ( rule__RegularityAttribute__Group__0 ) ) )
            // InternalOntoL.g:367:2: ( ( rule__RegularityAttribute__Group__0 ) )
            {
            // InternalOntoL.g:367:2: ( ( rule__RegularityAttribute__Group__0 ) )
            // InternalOntoL.g:368:3: ( rule__RegularityAttribute__Group__0 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getGroup()); 
            // InternalOntoL.g:369:3: ( rule__RegularityAttribute__Group__0 )
            // InternalOntoL.g:369:4: rule__RegularityAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularityAttribute"


    // $ANTLR start "entryRuleReference"
    // InternalOntoL.g:378:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalOntoL.g:379:1: ( ruleReference EOF )
            // InternalOntoL.g:380:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalOntoL.g:387:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:391:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalOntoL.g:392:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalOntoL.g:392:2: ( ( rule__Reference__Group__0 ) )
            // InternalOntoL.g:393:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalOntoL.g:394:3: ( rule__Reference__Group__0 )
            // InternalOntoL.g:394:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleRegularityReference"
    // InternalOntoL.g:403:1: entryRuleRegularityReference : ruleRegularityReference EOF ;
    public final void entryRuleRegularityReference() throws RecognitionException {
        try {
            // InternalOntoL.g:404:1: ( ruleRegularityReference EOF )
            // InternalOntoL.g:405:1: ruleRegularityReference EOF
            {
             before(grammarAccess.getRegularityReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleRegularityReference();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegularityReference"


    // $ANTLR start "ruleRegularityReference"
    // InternalOntoL.g:412:1: ruleRegularityReference : ( ( rule__RegularityReference__Group__0 ) ) ;
    public final void ruleRegularityReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:416:2: ( ( ( rule__RegularityReference__Group__0 ) ) )
            // InternalOntoL.g:417:2: ( ( rule__RegularityReference__Group__0 ) )
            {
            // InternalOntoL.g:417:2: ( ( rule__RegularityReference__Group__0 ) )
            // InternalOntoL.g:418:3: ( rule__RegularityReference__Group__0 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getGroup()); 
            // InternalOntoL.g:419:3: ( rule__RegularityReference__Group__0 )
            // InternalOntoL.g:419:4: rule__RegularityReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularityReference"


    // $ANTLR start "entryRuleELEMENTBOUND"
    // InternalOntoL.g:428:1: entryRuleELEMENTBOUND : ruleELEMENTBOUND EOF ;
    public final void entryRuleELEMENTBOUND() throws RecognitionException {
        try {
            // InternalOntoL.g:429:1: ( ruleELEMENTBOUND EOF )
            // InternalOntoL.g:430:1: ruleELEMENTBOUND EOF
            {
             before(grammarAccess.getELEMENTBOUNDRule()); 
            pushFollow(FOLLOW_1);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getELEMENTBOUNDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleELEMENTBOUND"


    // $ANTLR start "ruleELEMENTBOUND"
    // InternalOntoL.g:437:1: ruleELEMENTBOUND : ( ( rule__ELEMENTBOUND__Alternatives ) ) ;
    public final void ruleELEMENTBOUND() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:441:2: ( ( ( rule__ELEMENTBOUND__Alternatives ) ) )
            // InternalOntoL.g:442:2: ( ( rule__ELEMENTBOUND__Alternatives ) )
            {
            // InternalOntoL.g:442:2: ( ( rule__ELEMENTBOUND__Alternatives ) )
            // InternalOntoL.g:443:3: ( rule__ELEMENTBOUND__Alternatives )
            {
             before(grammarAccess.getELEMENTBOUNDAccess().getAlternatives()); 
            // InternalOntoL.g:444:3: ( rule__ELEMENTBOUND__Alternatives )
            // InternalOntoL.g:444:4: rule__ELEMENTBOUND__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ELEMENTBOUND__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getELEMENTBOUNDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleELEMENTBOUND"


    // $ANTLR start "entryRuleAttributeAssignment"
    // InternalOntoL.g:453:1: entryRuleAttributeAssignment : ruleAttributeAssignment EOF ;
    public final void entryRuleAttributeAssignment() throws RecognitionException {
        try {
            // InternalOntoL.g:454:1: ( ruleAttributeAssignment EOF )
            // InternalOntoL.g:455:1: ruleAttributeAssignment EOF
            {
             before(grammarAccess.getAttributeAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeAssignment();

            state._fsp--;

             after(grammarAccess.getAttributeAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeAssignment"


    // $ANTLR start "ruleAttributeAssignment"
    // InternalOntoL.g:462:1: ruleAttributeAssignment : ( ( rule__AttributeAssignment__Group__0 ) ) ;
    public final void ruleAttributeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:466:2: ( ( ( rule__AttributeAssignment__Group__0 ) ) )
            // InternalOntoL.g:467:2: ( ( rule__AttributeAssignment__Group__0 ) )
            {
            // InternalOntoL.g:467:2: ( ( rule__AttributeAssignment__Group__0 ) )
            // InternalOntoL.g:468:3: ( rule__AttributeAssignment__Group__0 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getGroup()); 
            // InternalOntoL.g:469:3: ( rule__AttributeAssignment__Group__0 )
            // InternalOntoL.g:469:4: rule__AttributeAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeAssignment"


    // $ANTLR start "entryRuleSimpleAttributeAssignment"
    // InternalOntoL.g:478:1: entryRuleSimpleAttributeAssignment : ruleSimpleAttributeAssignment EOF ;
    public final void entryRuleSimpleAttributeAssignment() throws RecognitionException {
        try {
            // InternalOntoL.g:479:1: ( ruleSimpleAttributeAssignment EOF )
            // InternalOntoL.g:480:1: ruleSimpleAttributeAssignment EOF
            {
             before(grammarAccess.getSimpleAttributeAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleAttributeAssignment();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleAttributeAssignment"


    // $ANTLR start "ruleSimpleAttributeAssignment"
    // InternalOntoL.g:487:1: ruleSimpleAttributeAssignment : ( ( rule__SimpleAttributeAssignment__Group__0 ) ) ;
    public final void ruleSimpleAttributeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:491:2: ( ( ( rule__SimpleAttributeAssignment__Group__0 ) ) )
            // InternalOntoL.g:492:2: ( ( rule__SimpleAttributeAssignment__Group__0 ) )
            {
            // InternalOntoL.g:492:2: ( ( rule__SimpleAttributeAssignment__Group__0 ) )
            // InternalOntoL.g:493:3: ( rule__SimpleAttributeAssignment__Group__0 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup()); 
            // InternalOntoL.g:494:3: ( rule__SimpleAttributeAssignment__Group__0 )
            // InternalOntoL.g:494:4: rule__SimpleAttributeAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleAttributeAssignment"


    // $ANTLR start "entryRuleReferenceAssignment"
    // InternalOntoL.g:503:1: entryRuleReferenceAssignment : ruleReferenceAssignment EOF ;
    public final void entryRuleReferenceAssignment() throws RecognitionException {
        try {
            // InternalOntoL.g:504:1: ( ruleReferenceAssignment EOF )
            // InternalOntoL.g:505:1: ruleReferenceAssignment EOF
            {
             before(grammarAccess.getReferenceAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleReferenceAssignment();

            state._fsp--;

             after(grammarAccess.getReferenceAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReferenceAssignment"


    // $ANTLR start "ruleReferenceAssignment"
    // InternalOntoL.g:512:1: ruleReferenceAssignment : ( ( rule__ReferenceAssignment__Group__0 ) ) ;
    public final void ruleReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:516:2: ( ( ( rule__ReferenceAssignment__Group__0 ) ) )
            // InternalOntoL.g:517:2: ( ( rule__ReferenceAssignment__Group__0 ) )
            {
            // InternalOntoL.g:517:2: ( ( rule__ReferenceAssignment__Group__0 ) )
            // InternalOntoL.g:518:3: ( rule__ReferenceAssignment__Group__0 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getGroup()); 
            // InternalOntoL.g:519:3: ( rule__ReferenceAssignment__Group__0 )
            // InternalOntoL.g:519:4: rule__ReferenceAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferenceAssignment"


    // $ANTLR start "entryRuleDataValue"
    // InternalOntoL.g:528:1: entryRuleDataValue : ruleDataValue EOF ;
    public final void entryRuleDataValue() throws RecognitionException {
        try {
            // InternalOntoL.g:529:1: ( ruleDataValue EOF )
            // InternalOntoL.g:530:1: ruleDataValue EOF
            {
             before(grammarAccess.getDataValueRule()); 
            pushFollow(FOLLOW_1);
            ruleDataValue();

            state._fsp--;

             after(grammarAccess.getDataValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataValue"


    // $ANTLR start "ruleDataValue"
    // InternalOntoL.g:537:1: ruleDataValue : ( ( rule__DataValue__Alternatives ) ) ;
    public final void ruleDataValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:541:2: ( ( ( rule__DataValue__Alternatives ) ) )
            // InternalOntoL.g:542:2: ( ( rule__DataValue__Alternatives ) )
            {
            // InternalOntoL.g:542:2: ( ( rule__DataValue__Alternatives ) )
            // InternalOntoL.g:543:3: ( rule__DataValue__Alternatives )
            {
             before(grammarAccess.getDataValueAccess().getAlternatives()); 
            // InternalOntoL.g:544:3: ( rule__DataValue__Alternatives )
            // InternalOntoL.g:544:4: rule__DataValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalOntoL.g:553:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalOntoL.g:554:1: ( ruleStringValue EOF )
            // InternalOntoL.g:555:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalOntoL.g:562:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:566:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalOntoL.g:567:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalOntoL.g:567:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalOntoL.g:568:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalOntoL.g:569:3: ( rule__StringValue__ValueAssignment )
            // InternalOntoL.g:569:4: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleNumberValue"
    // InternalOntoL.g:578:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalOntoL.g:579:1: ( ruleNumberValue EOF )
            // InternalOntoL.g:580:1: ruleNumberValue EOF
            {
             before(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getNumberValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalOntoL.g:587:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:591:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalOntoL.g:592:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalOntoL.g:592:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalOntoL.g:593:3: ( rule__NumberValue__ValueAssignment )
            {
             before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            // InternalOntoL.g:594:3: ( rule__NumberValue__ValueAssignment )
            // InternalOntoL.g:594:4: rule__NumberValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleNUMBER"
    // InternalOntoL.g:603:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // InternalOntoL.g:604:1: ( ruleNUMBER EOF )
            // InternalOntoL.g:605:1: ruleNUMBER EOF
            {
             before(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_1);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNUMBERRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalOntoL.g:612:1: ruleNUMBER : ( ( rule__NUMBER__Group__0 ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:616:2: ( ( ( rule__NUMBER__Group__0 ) ) )
            // InternalOntoL.g:617:2: ( ( rule__NUMBER__Group__0 ) )
            {
            // InternalOntoL.g:617:2: ( ( rule__NUMBER__Group__0 ) )
            // InternalOntoL.g:618:3: ( rule__NUMBER__Group__0 )
            {
             before(grammarAccess.getNUMBERAccess().getGroup()); 
            // InternalOntoL.g:619:3: ( rule__NUMBER__Group__0 )
            // InternalOntoL.g:619:4: rule__NUMBER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNUMBERAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalOntoL.g:628:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalOntoL.g:629:1: ( ruleBooleanValue EOF )
            // InternalOntoL.g:630:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalOntoL.g:637:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:641:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalOntoL.g:642:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalOntoL.g:642:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalOntoL.g:643:3: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // InternalOntoL.g:644:3: ( rule__BooleanValue__ValueAssignment )
            // InternalOntoL.g:644:4: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalOntoL.g:653:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // InternalOntoL.g:654:1: ( ruleBOOLEAN EOF )
            // InternalOntoL.g:655:1: ruleBOOLEAN EOF
            {
             before(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_1);
            ruleBOOLEAN();

            state._fsp--;

             after(grammarAccess.getBOOLEANRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // InternalOntoL.g:662:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:666:2: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // InternalOntoL.g:667:2: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // InternalOntoL.g:667:2: ( ( rule__BOOLEAN__Alternatives ) )
            // InternalOntoL.g:668:3: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // InternalOntoL.g:669:3: ( rule__BOOLEAN__Alternatives )
            // InternalOntoL.g:669:4: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BOOLEAN__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBOOLEANAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleNoneValue"
    // InternalOntoL.g:678:1: entryRuleNoneValue : ruleNoneValue EOF ;
    public final void entryRuleNoneValue() throws RecognitionException {
        try {
            // InternalOntoL.g:679:1: ( ruleNoneValue EOF )
            // InternalOntoL.g:680:1: ruleNoneValue EOF
            {
             before(grammarAccess.getNoneValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNoneValue();

            state._fsp--;

             after(grammarAccess.getNoneValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoneValue"


    // $ANTLR start "ruleNoneValue"
    // InternalOntoL.g:687:1: ruleNoneValue : ( ( rule__NoneValue__Group__0 ) ) ;
    public final void ruleNoneValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:691:2: ( ( ( rule__NoneValue__Group__0 ) ) )
            // InternalOntoL.g:692:2: ( ( rule__NoneValue__Group__0 ) )
            {
            // InternalOntoL.g:692:2: ( ( rule__NoneValue__Group__0 ) )
            // InternalOntoL.g:693:3: ( rule__NoneValue__Group__0 )
            {
             before(grammarAccess.getNoneValueAccess().getGroup()); 
            // InternalOntoL.g:694:3: ( rule__NoneValue__Group__0 )
            // InternalOntoL.g:694:4: rule__NoneValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NoneValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoneValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoneValue"


    // $ANTLR start "entryRuleComplexDataValue"
    // InternalOntoL.g:703:1: entryRuleComplexDataValue : ruleComplexDataValue EOF ;
    public final void entryRuleComplexDataValue() throws RecognitionException {
        try {
            // InternalOntoL.g:704:1: ( ruleComplexDataValue EOF )
            // InternalOntoL.g:705:1: ruleComplexDataValue EOF
            {
             before(grammarAccess.getComplexDataValueRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexDataValue();

            state._fsp--;

             after(grammarAccess.getComplexDataValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexDataValue"


    // $ANTLR start "ruleComplexDataValue"
    // InternalOntoL.g:712:1: ruleComplexDataValue : ( ( rule__ComplexDataValue__Alternatives ) ) ;
    public final void ruleComplexDataValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:716:2: ( ( ( rule__ComplexDataValue__Alternatives ) ) )
            // InternalOntoL.g:717:2: ( ( rule__ComplexDataValue__Alternatives ) )
            {
            // InternalOntoL.g:717:2: ( ( rule__ComplexDataValue__Alternatives ) )
            // InternalOntoL.g:718:3: ( rule__ComplexDataValue__Alternatives )
            {
             before(grammarAccess.getComplexDataValueAccess().getAlternatives()); 
            // InternalOntoL.g:719:3: ( rule__ComplexDataValue__Alternatives )
            // InternalOntoL.g:719:4: rule__ComplexDataValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComplexDataValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComplexDataValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexDataValue"


    // $ANTLR start "entryRuleUnamedIndividual"
    // InternalOntoL.g:728:1: entryRuleUnamedIndividual : ruleUnamedIndividual EOF ;
    public final void entryRuleUnamedIndividual() throws RecognitionException {
        try {
            // InternalOntoL.g:729:1: ( ruleUnamedIndividual EOF )
            // InternalOntoL.g:730:1: ruleUnamedIndividual EOF
            {
             before(grammarAccess.getUnamedIndividualRule()); 
            pushFollow(FOLLOW_1);
            ruleUnamedIndividual();

            state._fsp--;

             after(grammarAccess.getUnamedIndividualRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnamedIndividual"


    // $ANTLR start "ruleUnamedIndividual"
    // InternalOntoL.g:737:1: ruleUnamedIndividual : ( ( rule__UnamedIndividual__Group__0 ) ) ;
    public final void ruleUnamedIndividual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:741:2: ( ( ( rule__UnamedIndividual__Group__0 ) ) )
            // InternalOntoL.g:742:2: ( ( rule__UnamedIndividual__Group__0 ) )
            {
            // InternalOntoL.g:742:2: ( ( rule__UnamedIndividual__Group__0 ) )
            // InternalOntoL.g:743:3: ( rule__UnamedIndividual__Group__0 )
            {
             before(grammarAccess.getUnamedIndividualAccess().getGroup()); 
            // InternalOntoL.g:744:3: ( rule__UnamedIndividual__Group__0 )
            // InternalOntoL.g:744:4: rule__UnamedIndividual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnamedIndividual__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnamedIndividualAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnamedIndividual"


    // $ANTLR start "entryRuleGeneralizationSet"
    // InternalOntoL.g:753:1: entryRuleGeneralizationSet : ruleGeneralizationSet EOF ;
    public final void entryRuleGeneralizationSet() throws RecognitionException {
        try {
            // InternalOntoL.g:754:1: ( ruleGeneralizationSet EOF )
            // InternalOntoL.g:755:1: ruleGeneralizationSet EOF
            {
             before(grammarAccess.getGeneralizationSetRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneralizationSet();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneralizationSet"


    // $ANTLR start "ruleGeneralizationSet"
    // InternalOntoL.g:762:1: ruleGeneralizationSet : ( ( rule__GeneralizationSet__Group__0 ) ) ;
    public final void ruleGeneralizationSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:766:2: ( ( ( rule__GeneralizationSet__Group__0 ) ) )
            // InternalOntoL.g:767:2: ( ( rule__GeneralizationSet__Group__0 ) )
            {
            // InternalOntoL.g:767:2: ( ( rule__GeneralizationSet__Group__0 ) )
            // InternalOntoL.g:768:3: ( rule__GeneralizationSet__Group__0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup()); 
            // InternalOntoL.g:769:3: ( rule__GeneralizationSet__Group__0 )
            // InternalOntoL.g:769:4: rule__GeneralizationSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneralizationSet"


    // $ANTLR start "ruleCategorizationType"
    // InternalOntoL.g:778:1: ruleCategorizationType : ( ( rule__CategorizationType__Alternatives ) ) ;
    public final void ruleCategorizationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:782:1: ( ( ( rule__CategorizationType__Alternatives ) ) )
            // InternalOntoL.g:783:2: ( ( rule__CategorizationType__Alternatives ) )
            {
            // InternalOntoL.g:783:2: ( ( rule__CategorizationType__Alternatives ) )
            // InternalOntoL.g:784:3: ( rule__CategorizationType__Alternatives )
            {
             before(grammarAccess.getCategorizationTypeAccess().getAlternatives()); 
            // InternalOntoL.g:785:3: ( rule__CategorizationType__Alternatives )
            // InternalOntoL.g:785:4: rule__CategorizationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CategorizationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCategorizationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCategorizationType"


    // $ANTLR start "ruleRegularityAttributeType"
    // InternalOntoL.g:794:1: ruleRegularityAttributeType : ( ( rule__RegularityAttributeType__Alternatives ) ) ;
    public final void ruleRegularityAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:798:1: ( ( ( rule__RegularityAttributeType__Alternatives ) ) )
            // InternalOntoL.g:799:2: ( ( rule__RegularityAttributeType__Alternatives ) )
            {
            // InternalOntoL.g:799:2: ( ( rule__RegularityAttributeType__Alternatives ) )
            // InternalOntoL.g:800:3: ( rule__RegularityAttributeType__Alternatives )
            {
             before(grammarAccess.getRegularityAttributeTypeAccess().getAlternatives()); 
            // InternalOntoL.g:801:3: ( rule__RegularityAttributeType__Alternatives )
            // InternalOntoL.g:801:4: rule__RegularityAttributeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttributeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularityAttributeType"


    // $ANTLR start "ruleRegularityReferenceType"
    // InternalOntoL.g:810:1: ruleRegularityReferenceType : ( ( rule__RegularityReferenceType__Alternatives ) ) ;
    public final void ruleRegularityReferenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:814:1: ( ( ( rule__RegularityReferenceType__Alternatives ) ) )
            // InternalOntoL.g:815:2: ( ( rule__RegularityReferenceType__Alternatives ) )
            {
            // InternalOntoL.g:815:2: ( ( rule__RegularityReferenceType__Alternatives ) )
            // InternalOntoL.g:816:3: ( rule__RegularityReferenceType__Alternatives )
            {
             before(grammarAccess.getRegularityReferenceTypeAccess().getAlternatives()); 
            // InternalOntoL.g:817:3: ( rule__RegularityReferenceType__Alternatives )
            // InternalOntoL.g:817:4: rule__RegularityReferenceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReferenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularityReferenceType"


    // $ANTLR start "rule__Model__Alternatives_3"
    // InternalOntoL.g:825:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__Group_3_0__0 ) ) | ( ( rule__Model__ElementsAssignment_3_1 ) ) );
    public final void rule__Model__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:829:1: ( ( ( rule__Model__Group_3_0__0 ) ) | ( ( rule__Model__ElementsAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=31 && LA1_0<=32)||(LA1_0>=35 && LA1_0<=36)||(LA1_0>=40 && LA1_0<=41)||LA1_0==52||(LA1_0>=57 && LA1_0<=58)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalOntoL.g:830:2: ( ( rule__Model__Group_3_0__0 ) )
                    {
                    // InternalOntoL.g:830:2: ( ( rule__Model__Group_3_0__0 ) )
                    // InternalOntoL.g:831:3: ( rule__Model__Group_3_0__0 )
                    {
                     before(grammarAccess.getModelAccess().getGroup_3_0()); 
                    // InternalOntoL.g:832:3: ( rule__Model__Group_3_0__0 )
                    // InternalOntoL.g:832:4: rule__Model__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:836:2: ( ( rule__Model__ElementsAssignment_3_1 ) )
                    {
                    // InternalOntoL.g:836:2: ( ( rule__Model__ElementsAssignment_3_1 ) )
                    // InternalOntoL.g:837:3: ( rule__Model__ElementsAssignment_3_1 )
                    {
                     before(grammarAccess.getModelAccess().getElementsAssignment_3_1()); 
                    // InternalOntoL.g:838:3: ( rule__Model__ElementsAssignment_3_1 )
                    // InternalOntoL.g:838:4: rule__Model__ElementsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ElementsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getElementsAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives_3"


    // $ANTLR start "rule__ModelElement__Alternatives_0"
    // InternalOntoL.g:846:1: rule__ModelElement__Alternatives_0 : ( ( ruleImport ) | ( ruleEntityDeclaration ) | ( ruleGeneralizationSet ) );
    public final void rule__ModelElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:850:1: ( ( ruleImport ) | ( ruleEntityDeclaration ) | ( ruleGeneralizationSet ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 32:
            case 35:
            case 36:
            case 40:
            case 41:
                {
                alt2=2;
                }
                break;
            case 52:
            case 57:
            case 58:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalOntoL.g:851:2: ( ruleImport )
                    {
                    // InternalOntoL.g:851:2: ( ruleImport )
                    // InternalOntoL.g:852:3: ruleImport
                    {
                     before(grammarAccess.getModelElementAccess().getImportParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getImportParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:857:2: ( ruleEntityDeclaration )
                    {
                    // InternalOntoL.g:857:2: ( ruleEntityDeclaration )
                    // InternalOntoL.g:858:3: ruleEntityDeclaration
                    {
                     before(grammarAccess.getModelElementAccess().getEntityDeclarationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntityDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getEntityDeclarationParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:863:2: ( ruleGeneralizationSet )
                    {
                    // InternalOntoL.g:863:2: ( ruleGeneralizationSet )
                    // InternalOntoL.g:864:3: ruleGeneralizationSet
                    {
                     before(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralizationSet();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement__Alternatives_0"


    // $ANTLR start "rule__EntityDeclaration__Alternatives"
    // InternalOntoL.g:873:1: rule__EntityDeclaration__Alternatives : ( ( ruleOntoLClass ) | ( ruleIndividual ) );
    public final void rule__EntityDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:877:1: ( ( ruleOntoLClass ) | ( ruleIndividual ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=35 && LA3_0<=36)||(LA3_0>=40 && LA3_0<=41)) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalOntoL.g:878:2: ( ruleOntoLClass )
                    {
                    // InternalOntoL.g:878:2: ( ruleOntoLClass )
                    // InternalOntoL.g:879:3: ruleOntoLClass
                    {
                     before(grammarAccess.getEntityDeclarationAccess().getOntoLClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOntoLClass();

                    state._fsp--;

                     after(grammarAccess.getEntityDeclarationAccess().getOntoLClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:884:2: ( ruleIndividual )
                    {
                    // InternalOntoL.g:884:2: ( ruleIndividual )
                    // InternalOntoL.g:885:3: ruleIndividual
                    {
                     before(grammarAccess.getEntityDeclarationAccess().getIndividualParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIndividual();

                    state._fsp--;

                     after(grammarAccess.getEntityDeclarationAccess().getIndividualParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityDeclaration__Alternatives"


    // $ANTLR start "rule__Individual__Alternatives_3_1"
    // InternalOntoL.g:894:1: rule__Individual__Alternatives_3_1 : ( ( ( rule__Individual__AttAssignmentsAssignment_3_1_0 ) ) | ( ( rule__Individual__RefAssignmentsAssignment_3_1_1 ) ) );
    public final void rule__Individual__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:898:1: ( ( ( rule__Individual__AttAssignmentsAssignment_3_1_0 ) ) | ( ( rule__Individual__RefAssignmentsAssignment_3_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==42) ) {
                alt4=1;
            }
            else if ( (LA4_0==47) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalOntoL.g:899:2: ( ( rule__Individual__AttAssignmentsAssignment_3_1_0 ) )
                    {
                    // InternalOntoL.g:899:2: ( ( rule__Individual__AttAssignmentsAssignment_3_1_0 ) )
                    // InternalOntoL.g:900:3: ( rule__Individual__AttAssignmentsAssignment_3_1_0 )
                    {
                     before(grammarAccess.getIndividualAccess().getAttAssignmentsAssignment_3_1_0()); 
                    // InternalOntoL.g:901:3: ( rule__Individual__AttAssignmentsAssignment_3_1_0 )
                    // InternalOntoL.g:901:4: rule__Individual__AttAssignmentsAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Individual__AttAssignmentsAssignment_3_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIndividualAccess().getAttAssignmentsAssignment_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:905:2: ( ( rule__Individual__RefAssignmentsAssignment_3_1_1 ) )
                    {
                    // InternalOntoL.g:905:2: ( ( rule__Individual__RefAssignmentsAssignment_3_1_1 ) )
                    // InternalOntoL.g:906:3: ( rule__Individual__RefAssignmentsAssignment_3_1_1 )
                    {
                     before(grammarAccess.getIndividualAccess().getRefAssignmentsAssignment_3_1_1()); 
                    // InternalOntoL.g:907:3: ( rule__Individual__RefAssignmentsAssignment_3_1_1 )
                    // InternalOntoL.g:907:4: rule__Individual__RefAssignmentsAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Individual__RefAssignmentsAssignment_3_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getIndividualAccess().getRefAssignmentsAssignment_3_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Alternatives_3_1"


    // $ANTLR start "rule__OntoLClass__Alternatives_0"
    // InternalOntoL.g:915:1: rule__OntoLClass__Alternatives_0 : ( ( ruleOrderlessClass ) | ( ruleHOClass ) | ( ruleFOClass ) );
    public final void rule__OntoLClass__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:919:1: ( ( ruleOrderlessClass ) | ( ruleHOClass ) | ( ruleFOClass ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt5=1;
                }
                break;
            case 41:
                {
                alt5=2;
                }
                break;
            case 36:
            case 40:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalOntoL.g:920:2: ( ruleOrderlessClass )
                    {
                    // InternalOntoL.g:920:2: ( ruleOrderlessClass )
                    // InternalOntoL.g:921:3: ruleOrderlessClass
                    {
                     before(grammarAccess.getOntoLClassAccess().getOrderlessClassParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOrderlessClass();

                    state._fsp--;

                     after(grammarAccess.getOntoLClassAccess().getOrderlessClassParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:926:2: ( ruleHOClass )
                    {
                    // InternalOntoL.g:926:2: ( ruleHOClass )
                    // InternalOntoL.g:927:3: ruleHOClass
                    {
                     before(grammarAccess.getOntoLClassAccess().getHOClassParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleHOClass();

                    state._fsp--;

                     after(grammarAccess.getOntoLClassAccess().getHOClassParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:932:2: ( ruleFOClass )
                    {
                    // InternalOntoL.g:932:2: ( ruleFOClass )
                    // InternalOntoL.g:933:3: ruleFOClass
                    {
                     before(grammarAccess.getOntoLClassAccess().getFOClassParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFOClass();

                    state._fsp--;

                     after(grammarAccess.getOntoLClassAccess().getFOClassParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__Alternatives_0"


    // $ANTLR start "rule__OntoLClass__Alternatives_1_1"
    // InternalOntoL.g:942:1: rule__OntoLClass__Alternatives_1_1 : ( ( ( rule__OntoLClass__AttributesAssignment_1_1_0 ) ) | ( ( rule__OntoLClass__AttributesAssignment_1_1_1 ) ) | ( ( rule__OntoLClass__AttAssignmentsAssignment_1_1_2 ) ) | ( ( rule__OntoLClass__ReferencesAssignment_1_1_3 ) ) | ( ( rule__OntoLClass__ReferencesAssignment_1_1_4 ) ) | ( ( rule__OntoLClass__RefAssignmentsAssignment_1_1_5 ) ) );
    public final void rule__OntoLClass__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:946:1: ( ( ( rule__OntoLClass__AttributesAssignment_1_1_0 ) ) | ( ( rule__OntoLClass__AttributesAssignment_1_1_1 ) ) | ( ( rule__OntoLClass__AttAssignmentsAssignment_1_1_2 ) ) | ( ( rule__OntoLClass__ReferencesAssignment_1_1_3 ) ) | ( ( rule__OntoLClass__ReferencesAssignment_1_1_4 ) ) | ( ( rule__OntoLClass__RefAssignmentsAssignment_1_1_5 ) ) )
            int alt6=6;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalOntoL.g:947:2: ( ( rule__OntoLClass__AttributesAssignment_1_1_0 ) )
                    {
                    // InternalOntoL.g:947:2: ( ( rule__OntoLClass__AttributesAssignment_1_1_0 ) )
                    // InternalOntoL.g:948:3: ( rule__OntoLClass__AttributesAssignment_1_1_0 )
                    {
                     before(grammarAccess.getOntoLClassAccess().getAttributesAssignment_1_1_0()); 
                    // InternalOntoL.g:949:3: ( rule__OntoLClass__AttributesAssignment_1_1_0 )
                    // InternalOntoL.g:949:4: rule__OntoLClass__AttributesAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntoLClass__AttributesAssignment_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOntoLClassAccess().getAttributesAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:953:2: ( ( rule__OntoLClass__AttributesAssignment_1_1_1 ) )
                    {
                    // InternalOntoL.g:953:2: ( ( rule__OntoLClass__AttributesAssignment_1_1_1 ) )
                    // InternalOntoL.g:954:3: ( rule__OntoLClass__AttributesAssignment_1_1_1 )
                    {
                     before(grammarAccess.getOntoLClassAccess().getAttributesAssignment_1_1_1()); 
                    // InternalOntoL.g:955:3: ( rule__OntoLClass__AttributesAssignment_1_1_1 )
                    // InternalOntoL.g:955:4: rule__OntoLClass__AttributesAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntoLClass__AttributesAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOntoLClassAccess().getAttributesAssignment_1_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:959:2: ( ( rule__OntoLClass__AttAssignmentsAssignment_1_1_2 ) )
                    {
                    // InternalOntoL.g:959:2: ( ( rule__OntoLClass__AttAssignmentsAssignment_1_1_2 ) )
                    // InternalOntoL.g:960:3: ( rule__OntoLClass__AttAssignmentsAssignment_1_1_2 )
                    {
                     before(grammarAccess.getOntoLClassAccess().getAttAssignmentsAssignment_1_1_2()); 
                    // InternalOntoL.g:961:3: ( rule__OntoLClass__AttAssignmentsAssignment_1_1_2 )
                    // InternalOntoL.g:961:4: rule__OntoLClass__AttAssignmentsAssignment_1_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntoLClass__AttAssignmentsAssignment_1_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getOntoLClassAccess().getAttAssignmentsAssignment_1_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:965:2: ( ( rule__OntoLClass__ReferencesAssignment_1_1_3 ) )
                    {
                    // InternalOntoL.g:965:2: ( ( rule__OntoLClass__ReferencesAssignment_1_1_3 ) )
                    // InternalOntoL.g:966:3: ( rule__OntoLClass__ReferencesAssignment_1_1_3 )
                    {
                     before(grammarAccess.getOntoLClassAccess().getReferencesAssignment_1_1_3()); 
                    // InternalOntoL.g:967:3: ( rule__OntoLClass__ReferencesAssignment_1_1_3 )
                    // InternalOntoL.g:967:4: rule__OntoLClass__ReferencesAssignment_1_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntoLClass__ReferencesAssignment_1_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getOntoLClassAccess().getReferencesAssignment_1_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOntoL.g:971:2: ( ( rule__OntoLClass__ReferencesAssignment_1_1_4 ) )
                    {
                    // InternalOntoL.g:971:2: ( ( rule__OntoLClass__ReferencesAssignment_1_1_4 ) )
                    // InternalOntoL.g:972:3: ( rule__OntoLClass__ReferencesAssignment_1_1_4 )
                    {
                     before(grammarAccess.getOntoLClassAccess().getReferencesAssignment_1_1_4()); 
                    // InternalOntoL.g:973:3: ( rule__OntoLClass__ReferencesAssignment_1_1_4 )
                    // InternalOntoL.g:973:4: rule__OntoLClass__ReferencesAssignment_1_1_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntoLClass__ReferencesAssignment_1_1_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getOntoLClassAccess().getReferencesAssignment_1_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOntoL.g:977:2: ( ( rule__OntoLClass__RefAssignmentsAssignment_1_1_5 ) )
                    {
                    // InternalOntoL.g:977:2: ( ( rule__OntoLClass__RefAssignmentsAssignment_1_1_5 ) )
                    // InternalOntoL.g:978:3: ( rule__OntoLClass__RefAssignmentsAssignment_1_1_5 )
                    {
                     before(grammarAccess.getOntoLClassAccess().getRefAssignmentsAssignment_1_1_5()); 
                    // InternalOntoL.g:979:3: ( rule__OntoLClass__RefAssignmentsAssignment_1_1_5 )
                    // InternalOntoL.g:979:4: rule__OntoLClass__RefAssignmentsAssignment_1_1_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntoLClass__RefAssignmentsAssignment_1_1_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getOntoLClassAccess().getRefAssignmentsAssignment_1_1_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__Alternatives_1_1"


    // $ANTLR start "rule__OrderlessClass__Alternatives_6"
    // InternalOntoL.g:987:1: rule__OrderlessClass__Alternatives_6 : ( ( ( rule__OrderlessClass__Group_6_0__0 ) ) | ( ( rule__OrderlessClass__Group_6_1__0 ) ) );
    public final void rule__OrderlessClass__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:991:1: ( ( ( rule__OrderlessClass__Group_6_0__0 ) ) | ( ( rule__OrderlessClass__Group_6_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=14 && LA7_0<=17)) ) {
                alt7=1;
            }
            else if ( (LA7_0==39) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntoL.g:992:2: ( ( rule__OrderlessClass__Group_6_0__0 ) )
                    {
                    // InternalOntoL.g:992:2: ( ( rule__OrderlessClass__Group_6_0__0 ) )
                    // InternalOntoL.g:993:3: ( rule__OrderlessClass__Group_6_0__0 )
                    {
                     before(grammarAccess.getOrderlessClassAccess().getGroup_6_0()); 
                    // InternalOntoL.g:994:3: ( rule__OrderlessClass__Group_6_0__0 )
                    // InternalOntoL.g:994:4: rule__OrderlessClass__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrderlessClass__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOrderlessClassAccess().getGroup_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:998:2: ( ( rule__OrderlessClass__Group_6_1__0 ) )
                    {
                    // InternalOntoL.g:998:2: ( ( rule__OrderlessClass__Group_6_1__0 ) )
                    // InternalOntoL.g:999:3: ( rule__OrderlessClass__Group_6_1__0 )
                    {
                     before(grammarAccess.getOrderlessClassAccess().getGroup_6_1()); 
                    // InternalOntoL.g:1000:3: ( rule__OrderlessClass__Group_6_1__0 )
                    // InternalOntoL.g:1000:4: rule__OrderlessClass__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrderlessClass__Group_6_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOrderlessClassAccess().getGroup_6_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Alternatives_6"


    // $ANTLR start "rule__HOClass__Alternatives_7"
    // InternalOntoL.g:1008:1: rule__HOClass__Alternatives_7 : ( ( ( rule__HOClass__Group_7_0__0 ) ) | ( ( rule__HOClass__Group_7_1__0 ) ) );
    public final void rule__HOClass__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1012:1: ( ( ( rule__HOClass__Group_7_0__0 ) ) | ( ( rule__HOClass__Group_7_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=14 && LA8_0<=17)) ) {
                alt8=1;
            }
            else if ( (LA8_0==39) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOntoL.g:1013:2: ( ( rule__HOClass__Group_7_0__0 ) )
                    {
                    // InternalOntoL.g:1013:2: ( ( rule__HOClass__Group_7_0__0 ) )
                    // InternalOntoL.g:1014:3: ( rule__HOClass__Group_7_0__0 )
                    {
                     before(grammarAccess.getHOClassAccess().getGroup_7_0()); 
                    // InternalOntoL.g:1015:3: ( rule__HOClass__Group_7_0__0 )
                    // InternalOntoL.g:1015:4: rule__HOClass__Group_7_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HOClass__Group_7_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHOClassAccess().getGroup_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1019:2: ( ( rule__HOClass__Group_7_1__0 ) )
                    {
                    // InternalOntoL.g:1019:2: ( ( rule__HOClass__Group_7_1__0 ) )
                    // InternalOntoL.g:1020:3: ( rule__HOClass__Group_7_1__0 )
                    {
                     before(grammarAccess.getHOClassAccess().getGroup_7_1()); 
                    // InternalOntoL.g:1021:3: ( rule__HOClass__Group_7_1__0 )
                    // InternalOntoL.g:1021:4: rule__HOClass__Group_7_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HOClass__Group_7_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHOClassAccess().getGroup_7_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Alternatives_7"


    // $ANTLR start "rule__ELEMENTBOUND__Alternatives"
    // InternalOntoL.g:1029:1: rule__ELEMENTBOUND__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__ELEMENTBOUND__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1033:1: ( ( '*' ) | ( RULE_INT ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntoL.g:1034:2: ( '*' )
                    {
                    // InternalOntoL.g:1034:2: ( '*' )
                    // InternalOntoL.g:1035:3: '*'
                    {
                     before(grammarAccess.getELEMENTBOUNDAccess().getAsteriskKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getELEMENTBOUNDAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1040:2: ( RULE_INT )
                    {
                    // InternalOntoL.g:1040:2: ( RULE_INT )
                    // InternalOntoL.g:1041:3: RULE_INT
                    {
                     before(grammarAccess.getELEMENTBOUNDAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getELEMENTBOUNDAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ELEMENTBOUND__Alternatives"


    // $ANTLR start "rule__AttributeAssignment__Alternatives_3"
    // InternalOntoL.g:1050:1: rule__AttributeAssignment__Alternatives_3 : ( ( ( rule__AttributeAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__AttributeAssignment__Group_3_1__0 ) ) );
    public final void rule__AttributeAssignment__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1054:1: ( ( ( rule__AttributeAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__AttributeAssignment__Group_3_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_STRING)||(LA10_0>=12 && LA10_0<=13)||LA10_0==43||(LA10_0>=50 && LA10_0<=51)) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntoL.g:1055:2: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_0 ) )
                    {
                    // InternalOntoL.g:1055:2: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_0 ) )
                    // InternalOntoL.g:1056:3: ( rule__AttributeAssignment__AssignmentsAssignment_3_0 )
                    {
                     before(grammarAccess.getAttributeAssignmentAccess().getAssignmentsAssignment_3_0()); 
                    // InternalOntoL.g:1057:3: ( rule__AttributeAssignment__AssignmentsAssignment_3_0 )
                    // InternalOntoL.g:1057:4: rule__AttributeAssignment__AssignmentsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeAssignment__AssignmentsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAssignmentAccess().getAssignmentsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1061:2: ( ( rule__AttributeAssignment__Group_3_1__0 ) )
                    {
                    // InternalOntoL.g:1061:2: ( ( rule__AttributeAssignment__Group_3_1__0 ) )
                    // InternalOntoL.g:1062:3: ( rule__AttributeAssignment__Group_3_1__0 )
                    {
                     before(grammarAccess.getAttributeAssignmentAccess().getGroup_3_1()); 
                    // InternalOntoL.g:1063:3: ( rule__AttributeAssignment__Group_3_1__0 )
                    // InternalOntoL.g:1063:4: rule__AttributeAssignment__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeAssignment__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAssignmentAccess().getGroup_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Alternatives_3"


    // $ANTLR start "rule__SimpleAttributeAssignment__Alternatives_2"
    // InternalOntoL.g:1071:1: rule__SimpleAttributeAssignment__Alternatives_2 : ( ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0 ) ) | ( ( rule__SimpleAttributeAssignment__Group_2_1__0 ) ) );
    public final void rule__SimpleAttributeAssignment__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1075:1: ( ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0 ) ) | ( ( rule__SimpleAttributeAssignment__Group_2_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_STRING)||(LA11_0>=12 && LA11_0<=13)||LA11_0==43||(LA11_0>=50 && LA11_0<=51)) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalOntoL.g:1076:2: ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0 ) )
                    {
                    // InternalOntoL.g:1076:2: ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0 ) )
                    // InternalOntoL.g:1077:3: ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getAssignmentsAssignment_2_0()); 
                    // InternalOntoL.g:1078:3: ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0 )
                    // InternalOntoL.g:1078:4: rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAttributeAssignmentAccess().getAssignmentsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1082:2: ( ( rule__SimpleAttributeAssignment__Group_2_1__0 ) )
                    {
                    // InternalOntoL.g:1082:2: ( ( rule__SimpleAttributeAssignment__Group_2_1__0 ) )
                    // InternalOntoL.g:1083:3: ( rule__SimpleAttributeAssignment__Group_2_1__0 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_1()); 
                    // InternalOntoL.g:1084:3: ( rule__SimpleAttributeAssignment__Group_2_1__0 )
                    // InternalOntoL.g:1084:4: rule__SimpleAttributeAssignment__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleAttributeAssignment__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Alternatives_2"


    // $ANTLR start "rule__ReferenceAssignment__Alternatives_3"
    // InternalOntoL.g:1092:1: rule__ReferenceAssignment__Alternatives_3 : ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__ReferenceAssignment__Group_3_1__0 ) ) );
    public final void rule__ReferenceAssignment__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1096:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__ReferenceAssignment__Group_3_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalOntoL.g:1097:2: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) )
                    {
                    // InternalOntoL.g:1097:2: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) )
                    // InternalOntoL.g:1098:3: ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 )
                    {
                     before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_0()); 
                    // InternalOntoL.g:1099:3: ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 )
                    // InternalOntoL.g:1099:4: rule__ReferenceAssignment__AssignmentsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceAssignment__AssignmentsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1103:2: ( ( rule__ReferenceAssignment__Group_3_1__0 ) )
                    {
                    // InternalOntoL.g:1103:2: ( ( rule__ReferenceAssignment__Group_3_1__0 ) )
                    // InternalOntoL.g:1104:3: ( rule__ReferenceAssignment__Group_3_1__0 )
                    {
                     before(grammarAccess.getReferenceAssignmentAccess().getGroup_3_1()); 
                    // InternalOntoL.g:1105:3: ( rule__ReferenceAssignment__Group_3_1__0 )
                    // InternalOntoL.g:1105:4: rule__ReferenceAssignment__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceAssignment__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAssignmentAccess().getGroup_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Alternatives_3"


    // $ANTLR start "rule__DataValue__Alternatives"
    // InternalOntoL.g:1113:1: rule__DataValue__Alternatives : ( ( ruleStringValue ) | ( ruleNumberValue ) | ( ruleBooleanValue ) | ( ruleNoneValue ) | ( ruleComplexDataValue ) );
    public final void rule__DataValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1117:1: ( ( ruleStringValue ) | ( ruleNumberValue ) | ( ruleBooleanValue ) | ( ruleNoneValue ) | ( ruleComplexDataValue ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt13=1;
                }
                break;
            case RULE_INT:
            case 50:
                {
                alt13=2;
                }
                break;
            case 12:
            case 13:
                {
                alt13=3;
                }
                break;
            case 51:
                {
                alt13=4;
                }
                break;
            case RULE_ID:
            case 43:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalOntoL.g:1118:2: ( ruleStringValue )
                    {
                    // InternalOntoL.g:1118:2: ( ruleStringValue )
                    // InternalOntoL.g:1119:3: ruleStringValue
                    {
                     before(grammarAccess.getDataValueAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getDataValueAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1124:2: ( ruleNumberValue )
                    {
                    // InternalOntoL.g:1124:2: ( ruleNumberValue )
                    // InternalOntoL.g:1125:3: ruleNumberValue
                    {
                     before(grammarAccess.getDataValueAccess().getNumberValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberValue();

                    state._fsp--;

                     after(grammarAccess.getDataValueAccess().getNumberValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:1130:2: ( ruleBooleanValue )
                    {
                    // InternalOntoL.g:1130:2: ( ruleBooleanValue )
                    // InternalOntoL.g:1131:3: ruleBooleanValue
                    {
                     before(grammarAccess.getDataValueAccess().getBooleanValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getDataValueAccess().getBooleanValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:1136:2: ( ruleNoneValue )
                    {
                    // InternalOntoL.g:1136:2: ( ruleNoneValue )
                    // InternalOntoL.g:1137:3: ruleNoneValue
                    {
                     before(grammarAccess.getDataValueAccess().getNoneValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNoneValue();

                    state._fsp--;

                     after(grammarAccess.getDataValueAccess().getNoneValueParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOntoL.g:1142:2: ( ruleComplexDataValue )
                    {
                    // InternalOntoL.g:1142:2: ( ruleComplexDataValue )
                    // InternalOntoL.g:1143:3: ruleComplexDataValue
                    {
                     before(grammarAccess.getDataValueAccess().getComplexDataValueParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleComplexDataValue();

                    state._fsp--;

                     after(grammarAccess.getDataValueAccess().getComplexDataValueParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataValue__Alternatives"


    // $ANTLR start "rule__BOOLEAN__Alternatives"
    // InternalOntoL.g:1152:1: rule__BOOLEAN__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1156:1: ( ( 'true' ) | ( 'false' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            else if ( (LA14_0==13) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalOntoL.g:1157:2: ( 'true' )
                    {
                    // InternalOntoL.g:1157:2: ( 'true' )
                    // InternalOntoL.g:1158:3: 'true'
                    {
                     before(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1163:2: ( 'false' )
                    {
                    // InternalOntoL.g:1163:2: ( 'false' )
                    // InternalOntoL.g:1164:3: 'false'
                    {
                     before(grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOLEAN__Alternatives"


    // $ANTLR start "rule__ComplexDataValue__Alternatives"
    // InternalOntoL.g:1173:1: rule__ComplexDataValue__Alternatives : ( ( ( rule__ComplexDataValue__ValueAssignment_0 ) ) | ( ( rule__ComplexDataValue__UnnamedValueAssignment_1 ) ) );
    public final void rule__ComplexDataValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1177:1: ( ( ( rule__ComplexDataValue__ValueAssignment_0 ) ) | ( ( rule__ComplexDataValue__UnnamedValueAssignment_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==43) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalOntoL.g:1178:2: ( ( rule__ComplexDataValue__ValueAssignment_0 ) )
                    {
                    // InternalOntoL.g:1178:2: ( ( rule__ComplexDataValue__ValueAssignment_0 ) )
                    // InternalOntoL.g:1179:3: ( rule__ComplexDataValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getComplexDataValueAccess().getValueAssignment_0()); 
                    // InternalOntoL.g:1180:3: ( rule__ComplexDataValue__ValueAssignment_0 )
                    // InternalOntoL.g:1180:4: rule__ComplexDataValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexDataValue__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplexDataValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1184:2: ( ( rule__ComplexDataValue__UnnamedValueAssignment_1 ) )
                    {
                    // InternalOntoL.g:1184:2: ( ( rule__ComplexDataValue__UnnamedValueAssignment_1 ) )
                    // InternalOntoL.g:1185:3: ( rule__ComplexDataValue__UnnamedValueAssignment_1 )
                    {
                     before(grammarAccess.getComplexDataValueAccess().getUnnamedValueAssignment_1()); 
                    // InternalOntoL.g:1186:3: ( rule__ComplexDataValue__UnnamedValueAssignment_1 )
                    // InternalOntoL.g:1186:4: rule__ComplexDataValue__UnnamedValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexDataValue__UnnamedValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplexDataValueAccess().getUnnamedValueAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexDataValue__Alternatives"


    // $ANTLR start "rule__GeneralizationSet__Alternatives_0"
    // InternalOntoL.g:1194:1: rule__GeneralizationSet__Alternatives_0 : ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) | ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) | ( ( rule__GeneralizationSet__Group_0_2__0 ) ) | ( ( rule__GeneralizationSet__Group_0_3__0 ) ) );
    public final void rule__GeneralizationSet__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1198:1: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) | ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) | ( ( rule__GeneralizationSet__Group_0_2__0 ) ) | ( ( rule__GeneralizationSet__Group_0_3__0 ) ) )
            int alt16=4;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==57) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==58) ) {
                    alt16=3;
                }
                else if ( (LA16_1==52) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA16_0==58) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==52) ) {
                    alt16=2;
                }
                else if ( (LA16_2==57) ) {
                    alt16=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalOntoL.g:1199:2: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) )
                    {
                    // InternalOntoL.g:1199:2: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) )
                    // InternalOntoL.g:1200:3: ( rule__GeneralizationSet__IsDisjointAssignment_0_0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_0()); 
                    // InternalOntoL.g:1201:3: ( rule__GeneralizationSet__IsDisjointAssignment_0_0 )
                    // InternalOntoL.g:1201:4: rule__GeneralizationSet__IsDisjointAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__IsDisjointAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1205:2: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) )
                    {
                    // InternalOntoL.g:1205:2: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) )
                    // InternalOntoL.g:1206:3: ( rule__GeneralizationSet__IsCompleteAssignment_0_1 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_1()); 
                    // InternalOntoL.g:1207:3: ( rule__GeneralizationSet__IsCompleteAssignment_0_1 )
                    // InternalOntoL.g:1207:4: rule__GeneralizationSet__IsCompleteAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__IsCompleteAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:1211:2: ( ( rule__GeneralizationSet__Group_0_2__0 ) )
                    {
                    // InternalOntoL.g:1211:2: ( ( rule__GeneralizationSet__Group_0_2__0 ) )
                    // InternalOntoL.g:1212:3: ( rule__GeneralizationSet__Group_0_2__0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getGroup_0_2()); 
                    // InternalOntoL.g:1213:3: ( rule__GeneralizationSet__Group_0_2__0 )
                    // InternalOntoL.g:1213:4: rule__GeneralizationSet__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__Group_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGeneralizationSetAccess().getGroup_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:1217:2: ( ( rule__GeneralizationSet__Group_0_3__0 ) )
                    {
                    // InternalOntoL.g:1217:2: ( ( rule__GeneralizationSet__Group_0_3__0 ) )
                    // InternalOntoL.g:1218:3: ( rule__GeneralizationSet__Group_0_3__0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getGroup_0_3()); 
                    // InternalOntoL.g:1219:3: ( rule__GeneralizationSet__Group_0_3__0 )
                    // InternalOntoL.g:1219:4: rule__GeneralizationSet__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__Group_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGeneralizationSetAccess().getGroup_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Alternatives_0"


    // $ANTLR start "rule__CategorizationType__Alternatives"
    // InternalOntoL.g:1227:1: rule__CategorizationType__Alternatives : ( ( ( 'categorizes' ) ) | ( ( 'completeCategorizes' ) ) | ( ( 'disjointCategorizes' ) ) | ( ( 'partitions' ) ) );
    public final void rule__CategorizationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1231:1: ( ( ( 'categorizes' ) ) | ( ( 'completeCategorizes' ) ) | ( ( 'disjointCategorizes' ) ) | ( ( 'partitions' ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt17=1;
                }
                break;
            case 15:
                {
                alt17=2;
                }
                break;
            case 16:
                {
                alt17=3;
                }
                break;
            case 17:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalOntoL.g:1232:2: ( ( 'categorizes' ) )
                    {
                    // InternalOntoL.g:1232:2: ( ( 'categorizes' ) )
                    // InternalOntoL.g:1233:3: ( 'categorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0()); 
                    // InternalOntoL.g:1234:3: ( 'categorizes' )
                    // InternalOntoL.g:1234:4: 'categorizes'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1238:2: ( ( 'completeCategorizes' ) )
                    {
                    // InternalOntoL.g:1238:2: ( ( 'completeCategorizes' ) )
                    // InternalOntoL.g:1239:3: ( 'completeCategorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1()); 
                    // InternalOntoL.g:1240:3: ( 'completeCategorizes' )
                    // InternalOntoL.g:1240:4: 'completeCategorizes'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:1244:2: ( ( 'disjointCategorizes' ) )
                    {
                    // InternalOntoL.g:1244:2: ( ( 'disjointCategorizes' ) )
                    // InternalOntoL.g:1245:3: ( 'disjointCategorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2()); 
                    // InternalOntoL.g:1246:3: ( 'disjointCategorizes' )
                    // InternalOntoL.g:1246:4: 'disjointCategorizes'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:1250:2: ( ( 'partitions' ) )
                    {
                    // InternalOntoL.g:1250:2: ( ( 'partitions' ) )
                    // InternalOntoL.g:1251:3: ( 'partitions' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getPARTITIONEREnumLiteralDeclaration_3()); 
                    // InternalOntoL.g:1252:3: ( 'partitions' )
                    // InternalOntoL.g:1252:4: 'partitions'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getPARTITIONEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CategorizationType__Alternatives"


    // $ANTLR start "rule__RegularityAttributeType__Alternatives"
    // InternalOntoL.g:1260:1: rule__RegularityAttributeType__Alternatives : ( ( ( 'determinesMaxValue' ) ) | ( ( 'determinesMinValue' ) ) | ( ( 'determinesValue' ) ) | ( ( 'determinesPossibleValues' ) ) | ( ( 'determinesType' ) ) | ( ( 'determinesPossibleTypes' ) ) );
    public final void rule__RegularityAttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1264:1: ( ( ( 'determinesMaxValue' ) ) | ( ( 'determinesMinValue' ) ) | ( ( 'determinesValue' ) ) | ( ( 'determinesPossibleValues' ) ) | ( ( 'determinesType' ) ) | ( ( 'determinesPossibleTypes' ) ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt18=1;
                }
                break;
            case 19:
                {
                alt18=2;
                }
                break;
            case 20:
                {
                alt18=3;
                }
                break;
            case 21:
                {
                alt18=4;
                }
                break;
            case 22:
                {
                alt18=5;
                }
                break;
            case 23:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalOntoL.g:1265:2: ( ( 'determinesMaxValue' ) )
                    {
                    // InternalOntoL.g:1265:2: ( ( 'determinesMaxValue' ) )
                    // InternalOntoL.g:1266:3: ( 'determinesMaxValue' )
                    {
                     before(grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_MAX_VALUEEnumLiteralDeclaration_0()); 
                    // InternalOntoL.g:1267:3: ( 'determinesMaxValue' )
                    // InternalOntoL.g:1267:4: 'determinesMaxValue'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_MAX_VALUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1271:2: ( ( 'determinesMinValue' ) )
                    {
                    // InternalOntoL.g:1271:2: ( ( 'determinesMinValue' ) )
                    // InternalOntoL.g:1272:3: ( 'determinesMinValue' )
                    {
                     before(grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_1()); 
                    // InternalOntoL.g:1273:3: ( 'determinesMinValue' )
                    // InternalOntoL.g:1273:4: 'determinesMinValue'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:1277:2: ( ( 'determinesValue' ) )
                    {
                    // InternalOntoL.g:1277:2: ( ( 'determinesValue' ) )
                    // InternalOntoL.g:1278:3: ( 'determinesValue' )
                    {
                     before(grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_2()); 
                    // InternalOntoL.g:1279:3: ( 'determinesValue' )
                    // InternalOntoL.g:1279:4: 'determinesValue'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:1283:2: ( ( 'determinesPossibleValues' ) )
                    {
                    // InternalOntoL.g:1283:2: ( ( 'determinesPossibleValues' ) )
                    // InternalOntoL.g:1284:3: ( 'determinesPossibleValues' )
                    {
                     before(grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_POSSIBLE_VALUESEnumLiteralDeclaration_3()); 
                    // InternalOntoL.g:1285:3: ( 'determinesPossibleValues' )
                    // InternalOntoL.g:1285:4: 'determinesPossibleValues'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_POSSIBLE_VALUESEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOntoL.g:1289:2: ( ( 'determinesType' ) )
                    {
                    // InternalOntoL.g:1289:2: ( ( 'determinesType' ) )
                    // InternalOntoL.g:1290:3: ( 'determinesType' )
                    {
                     before(grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_4()); 
                    // InternalOntoL.g:1291:3: ( 'determinesType' )
                    // InternalOntoL.g:1291:4: 'determinesType'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOntoL.g:1295:2: ( ( 'determinesPossibleTypes' ) )
                    {
                    // InternalOntoL.g:1295:2: ( ( 'determinesPossibleTypes' ) )
                    // InternalOntoL.g:1296:3: ( 'determinesPossibleTypes' )
                    {
                     before(grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_POSSIBLE_TYPESEnumLiteralDeclaration_5()); 
                    // InternalOntoL.g:1297:3: ( 'determinesPossibleTypes' )
                    // InternalOntoL.g:1297:4: 'determinesPossibleTypes'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_POSSIBLE_TYPESEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttributeType__Alternatives"


    // $ANTLR start "rule__RegularityReferenceType__Alternatives"
    // InternalOntoL.g:1305:1: rule__RegularityReferenceType__Alternatives : ( ( ( 'determinesValue' ) ) | ( ( 'determinesPossibleValues' ) ) | ( ( 'determinesType' ) ) | ( ( 'determinesPossibleTypes' ) ) );
    public final void rule__RegularityReferenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1309:1: ( ( ( 'determinesValue' ) ) | ( ( 'determinesPossibleValues' ) ) | ( ( 'determinesType' ) ) | ( ( 'determinesPossibleTypes' ) ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt19=1;
                }
                break;
            case 21:
                {
                alt19=2;
                }
                break;
            case 22:
                {
                alt19=3;
                }
                break;
            case 23:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalOntoL.g:1310:2: ( ( 'determinesValue' ) )
                    {
                    // InternalOntoL.g:1310:2: ( ( 'determinesValue' ) )
                    // InternalOntoL.g:1311:3: ( 'determinesValue' )
                    {
                     before(grammarAccess.getRegularityReferenceTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_0()); 
                    // InternalOntoL.g:1312:3: ( 'determinesValue' )
                    // InternalOntoL.g:1312:4: 'determinesValue'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityReferenceTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1316:2: ( ( 'determinesPossibleValues' ) )
                    {
                    // InternalOntoL.g:1316:2: ( ( 'determinesPossibleValues' ) )
                    // InternalOntoL.g:1317:3: ( 'determinesPossibleValues' )
                    {
                     before(grammarAccess.getRegularityReferenceTypeAccess().getDETERMINES_POSSIBLE_VALUESEnumLiteralDeclaration_1()); 
                    // InternalOntoL.g:1318:3: ( 'determinesPossibleValues' )
                    // InternalOntoL.g:1318:4: 'determinesPossibleValues'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityReferenceTypeAccess().getDETERMINES_POSSIBLE_VALUESEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:1322:2: ( ( 'determinesType' ) )
                    {
                    // InternalOntoL.g:1322:2: ( ( 'determinesType' ) )
                    // InternalOntoL.g:1323:3: ( 'determinesType' )
                    {
                     before(grammarAccess.getRegularityReferenceTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_2()); 
                    // InternalOntoL.g:1324:3: ( 'determinesType' )
                    // InternalOntoL.g:1324:4: 'determinesType'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityReferenceTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:1328:2: ( ( 'determinesPossibleTypes' ) )
                    {
                    // InternalOntoL.g:1328:2: ( ( 'determinesPossibleTypes' ) )
                    // InternalOntoL.g:1329:3: ( 'determinesPossibleTypes' )
                    {
                     before(grammarAccess.getRegularityReferenceTypeAccess().getDETERMINES_POSSIBLE_TYPESEnumLiteralDeclaration_3()); 
                    // InternalOntoL.g:1330:3: ( 'determinesPossibleTypes' )
                    // InternalOntoL.g:1330:4: 'determinesPossibleTypes'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityReferenceTypeAccess().getDETERMINES_POSSIBLE_TYPESEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReferenceType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalOntoL.g:1338:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1342:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalOntoL.g:1343:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalOntoL.g:1350:1: rule__Model__Group__0__Impl : ( 'module' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1354:1: ( ( 'module' ) )
            // InternalOntoL.g:1355:1: ( 'module' )
            {
            // InternalOntoL.g:1355:1: ( 'module' )
            // InternalOntoL.g:1356:2: 'module'
            {
             before(grammarAccess.getModelAccess().getModuleKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalOntoL.g:1365:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1369:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalOntoL.g:1370:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalOntoL.g:1377:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1381:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalOntoL.g:1382:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalOntoL.g:1382:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalOntoL.g:1383:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalOntoL.g:1384:2: ( rule__Model__NameAssignment_1 )
            // InternalOntoL.g:1384:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalOntoL.g:1392:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1396:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalOntoL.g:1397:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalOntoL.g:1404:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1408:1: ( ( '{' ) )
            // InternalOntoL.g:1409:1: ( '{' )
            {
            // InternalOntoL.g:1409:1: ( '{' )
            // InternalOntoL.g:1410:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalOntoL.g:1419:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1423:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalOntoL.g:1424:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalOntoL.g:1431:1: rule__Model__Group__3__Impl : ( ( rule__Model__Alternatives_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1435:1: ( ( ( rule__Model__Alternatives_3 )* ) )
            // InternalOntoL.g:1436:1: ( ( rule__Model__Alternatives_3 )* )
            {
            // InternalOntoL.g:1436:1: ( ( rule__Model__Alternatives_3 )* )
            // InternalOntoL.g:1437:2: ( rule__Model__Alternatives_3 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_3()); 
            // InternalOntoL.g:1438:2: ( rule__Model__Alternatives_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27||(LA20_0>=31 && LA20_0<=32)||(LA20_0>=35 && LA20_0<=36)||(LA20_0>=40 && LA20_0<=41)||LA20_0==52||(LA20_0>=57 && LA20_0<=58)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOntoL.g:1438:3: rule__Model__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalOntoL.g:1446:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1450:1: ( rule__Model__Group__4__Impl )
            // InternalOntoL.g:1451:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalOntoL.g:1457:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1461:1: ( ( '}' ) )
            // InternalOntoL.g:1462:1: ( '}' )
            {
            // InternalOntoL.g:1462:1: ( '}' )
            // InternalOntoL.g:1463:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group_3_0__0"
    // InternalOntoL.g:1473:1: rule__Model__Group_3_0__0 : rule__Model__Group_3_0__0__Impl rule__Model__Group_3_0__1 ;
    public final void rule__Model__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1477:1: ( rule__Model__Group_3_0__0__Impl rule__Model__Group_3_0__1 )
            // InternalOntoL.g:1478:2: rule__Model__Group_3_0__0__Impl rule__Model__Group_3_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_0__0"


    // $ANTLR start "rule__Model__Group_3_0__0__Impl"
    // InternalOntoL.g:1485:1: rule__Model__Group_3_0__0__Impl : ( 'include' ) ;
    public final void rule__Model__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1489:1: ( ( 'include' ) )
            // InternalOntoL.g:1490:1: ( 'include' )
            {
            // InternalOntoL.g:1490:1: ( 'include' )
            // InternalOntoL.g:1491:2: 'include'
            {
             before(grammarAccess.getModelAccess().getIncludeKeyword_3_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getIncludeKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_0__0__Impl"


    // $ANTLR start "rule__Model__Group_3_0__1"
    // InternalOntoL.g:1500:1: rule__Model__Group_3_0__1 : rule__Model__Group_3_0__1__Impl rule__Model__Group_3_0__2 ;
    public final void rule__Model__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1504:1: ( rule__Model__Group_3_0__1__Impl rule__Model__Group_3_0__2 )
            // InternalOntoL.g:1505:2: rule__Model__Group_3_0__1__Impl rule__Model__Group_3_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_0__1"


    // $ANTLR start "rule__Model__Group_3_0__1__Impl"
    // InternalOntoL.g:1512:1: rule__Model__Group_3_0__1__Impl : ( ( rule__Model__IncludesAssignment_3_0_1 ) ) ;
    public final void rule__Model__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1516:1: ( ( ( rule__Model__IncludesAssignment_3_0_1 ) ) )
            // InternalOntoL.g:1517:1: ( ( rule__Model__IncludesAssignment_3_0_1 ) )
            {
            // InternalOntoL.g:1517:1: ( ( rule__Model__IncludesAssignment_3_0_1 ) )
            // InternalOntoL.g:1518:2: ( rule__Model__IncludesAssignment_3_0_1 )
            {
             before(grammarAccess.getModelAccess().getIncludesAssignment_3_0_1()); 
            // InternalOntoL.g:1519:2: ( rule__Model__IncludesAssignment_3_0_1 )
            // InternalOntoL.g:1519:3: rule__Model__IncludesAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__IncludesAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getIncludesAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_0__1__Impl"


    // $ANTLR start "rule__Model__Group_3_0__2"
    // InternalOntoL.g:1527:1: rule__Model__Group_3_0__2 : rule__Model__Group_3_0__2__Impl ;
    public final void rule__Model__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1531:1: ( rule__Model__Group_3_0__2__Impl )
            // InternalOntoL.g:1532:2: rule__Model__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_0__2"


    // $ANTLR start "rule__Model__Group_3_0__2__Impl"
    // InternalOntoL.g:1538:1: rule__Model__Group_3_0__2__Impl : ( ';' ) ;
    public final void rule__Model__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1542:1: ( ( ';' ) )
            // InternalOntoL.g:1543:1: ( ';' )
            {
            // InternalOntoL.g:1543:1: ( ';' )
            // InternalOntoL.g:1544:2: ';'
            {
             before(grammarAccess.getModelAccess().getSemicolonKeyword_3_0_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getSemicolonKeyword_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_0__2__Impl"


    // $ANTLR start "rule__ModelElement__Group__0"
    // InternalOntoL.g:1554:1: rule__ModelElement__Group__0 : rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 ;
    public final void rule__ModelElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1558:1: ( rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 )
            // InternalOntoL.g:1559:2: rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ModelElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement__Group__0"


    // $ANTLR start "rule__ModelElement__Group__0__Impl"
    // InternalOntoL.g:1566:1: rule__ModelElement__Group__0__Impl : ( ( rule__ModelElement__Alternatives_0 ) ) ;
    public final void rule__ModelElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1570:1: ( ( ( rule__ModelElement__Alternatives_0 ) ) )
            // InternalOntoL.g:1571:1: ( ( rule__ModelElement__Alternatives_0 ) )
            {
            // InternalOntoL.g:1571:1: ( ( rule__ModelElement__Alternatives_0 ) )
            // InternalOntoL.g:1572:2: ( rule__ModelElement__Alternatives_0 )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives_0()); 
            // InternalOntoL.g:1573:2: ( rule__ModelElement__Alternatives_0 )
            // InternalOntoL.g:1573:3: rule__ModelElement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ModelElement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getModelElementAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement__Group__0__Impl"


    // $ANTLR start "rule__ModelElement__Group__1"
    // InternalOntoL.g:1581:1: rule__ModelElement__Group__1 : rule__ModelElement__Group__1__Impl ;
    public final void rule__ModelElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1585:1: ( rule__ModelElement__Group__1__Impl )
            // InternalOntoL.g:1586:2: rule__ModelElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement__Group__1"


    // $ANTLR start "rule__ModelElement__Group__1__Impl"
    // InternalOntoL.g:1592:1: rule__ModelElement__Group__1__Impl : ( ';' ) ;
    public final void rule__ModelElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1596:1: ( ( ';' ) )
            // InternalOntoL.g:1597:1: ( ';' )
            {
            // InternalOntoL.g:1597:1: ( ';' )
            // InternalOntoL.g:1598:2: ';'
            {
             before(grammarAccess.getModelElementAccess().getSemicolonKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getModelElementAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalOntoL.g:1608:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1612:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalOntoL.g:1613:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalOntoL.g:1620:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1624:1: ( ( RULE_ID ) )
            // InternalOntoL.g:1625:1: ( RULE_ID )
            {
            // InternalOntoL.g:1625:1: ( RULE_ID )
            // InternalOntoL.g:1626:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalOntoL.g:1635:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1639:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalOntoL.g:1640:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalOntoL.g:1646:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1650:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalOntoL.g:1651:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalOntoL.g:1651:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalOntoL.g:1652:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalOntoL.g:1653:2: ( rule__QualifiedName__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOntoL.g:1653:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalOntoL.g:1662:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1666:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalOntoL.g:1667:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalOntoL.g:1674:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1678:1: ( ( '.' ) )
            // InternalOntoL.g:1679:1: ( '.' )
            {
            // InternalOntoL.g:1679:1: ( '.' )
            // InternalOntoL.g:1680:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalOntoL.g:1689:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1693:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalOntoL.g:1694:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalOntoL.g:1700:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1704:1: ( ( RULE_ID ) )
            // InternalOntoL.g:1705:1: ( RULE_ID )
            {
            // InternalOntoL.g:1705:1: ( RULE_ID )
            // InternalOntoL.g:1706:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalOntoL.g:1716:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1720:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalOntoL.g:1721:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalOntoL.g:1728:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1732:1: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:1733:1: ( ruleQualifiedName )
            {
            // InternalOntoL.g:1733:1: ( ruleQualifiedName )
            // InternalOntoL.g:1734:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalOntoL.g:1743:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1747:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalOntoL.g:1748:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalOntoL.g:1754:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1758:1: ( ( ( '.*' )? ) )
            // InternalOntoL.g:1759:1: ( ( '.*' )? )
            {
            // InternalOntoL.g:1759:1: ( ( '.*' )? )
            // InternalOntoL.g:1760:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalOntoL.g:1761:2: ( '.*' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOntoL.g:1761:3: '.*'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalOntoL.g:1770:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1774:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalOntoL.g:1775:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalOntoL.g:1782:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1786:1: ( ( 'import' ) )
            // InternalOntoL.g:1787:1: ( 'import' )
            {
            // InternalOntoL.g:1787:1: ( 'import' )
            // InternalOntoL.g:1788:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalOntoL.g:1797:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1801:1: ( rule__Import__Group__1__Impl )
            // InternalOntoL.g:1802:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalOntoL.g:1808:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1812:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalOntoL.g:1813:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalOntoL.g:1813:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalOntoL.g:1814:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalOntoL.g:1815:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalOntoL.g:1815:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Individual__Group__0"
    // InternalOntoL.g:1824:1: rule__Individual__Group__0 : rule__Individual__Group__0__Impl rule__Individual__Group__1 ;
    public final void rule__Individual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1828:1: ( rule__Individual__Group__0__Impl rule__Individual__Group__1 )
            // InternalOntoL.g:1829:2: rule__Individual__Group__0__Impl rule__Individual__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Individual__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Individual__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__0"


    // $ANTLR start "rule__Individual__Group__0__Impl"
    // InternalOntoL.g:1836:1: rule__Individual__Group__0__Impl : ( 'individual' ) ;
    public final void rule__Individual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1840:1: ( ( 'individual' ) )
            // InternalOntoL.g:1841:1: ( 'individual' )
            {
            // InternalOntoL.g:1841:1: ( 'individual' )
            // InternalOntoL.g:1842:2: 'individual'
            {
             before(grammarAccess.getIndividualAccess().getIndividualKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getIndividualAccess().getIndividualKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__0__Impl"


    // $ANTLR start "rule__Individual__Group__1"
    // InternalOntoL.g:1851:1: rule__Individual__Group__1 : rule__Individual__Group__1__Impl rule__Individual__Group__2 ;
    public final void rule__Individual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1855:1: ( rule__Individual__Group__1__Impl rule__Individual__Group__2 )
            // InternalOntoL.g:1856:2: rule__Individual__Group__1__Impl rule__Individual__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Individual__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Individual__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__1"


    // $ANTLR start "rule__Individual__Group__1__Impl"
    // InternalOntoL.g:1863:1: rule__Individual__Group__1__Impl : ( ( rule__Individual__NameAssignment_1 ) ) ;
    public final void rule__Individual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1867:1: ( ( ( rule__Individual__NameAssignment_1 ) ) )
            // InternalOntoL.g:1868:1: ( ( rule__Individual__NameAssignment_1 ) )
            {
            // InternalOntoL.g:1868:1: ( ( rule__Individual__NameAssignment_1 ) )
            // InternalOntoL.g:1869:2: ( rule__Individual__NameAssignment_1 )
            {
             before(grammarAccess.getIndividualAccess().getNameAssignment_1()); 
            // InternalOntoL.g:1870:2: ( rule__Individual__NameAssignment_1 )
            // InternalOntoL.g:1870:3: rule__Individual__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Individual__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIndividualAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__1__Impl"


    // $ANTLR start "rule__Individual__Group__2"
    // InternalOntoL.g:1878:1: rule__Individual__Group__2 : rule__Individual__Group__2__Impl rule__Individual__Group__3 ;
    public final void rule__Individual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1882:1: ( rule__Individual__Group__2__Impl rule__Individual__Group__3 )
            // InternalOntoL.g:1883:2: rule__Individual__Group__2__Impl rule__Individual__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Individual__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Individual__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__2"


    // $ANTLR start "rule__Individual__Group__2__Impl"
    // InternalOntoL.g:1890:1: rule__Individual__Group__2__Impl : ( ( rule__Individual__Group_2__0 )? ) ;
    public final void rule__Individual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1894:1: ( ( ( rule__Individual__Group_2__0 )? ) )
            // InternalOntoL.g:1895:1: ( ( rule__Individual__Group_2__0 )? )
            {
            // InternalOntoL.g:1895:1: ( ( rule__Individual__Group_2__0 )? )
            // InternalOntoL.g:1896:2: ( rule__Individual__Group_2__0 )?
            {
             before(grammarAccess.getIndividualAccess().getGroup_2()); 
            // InternalOntoL.g:1897:2: ( rule__Individual__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOntoL.g:1897:3: rule__Individual__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Individual__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIndividualAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__2__Impl"


    // $ANTLR start "rule__Individual__Group__3"
    // InternalOntoL.g:1905:1: rule__Individual__Group__3 : rule__Individual__Group__3__Impl ;
    public final void rule__Individual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1909:1: ( rule__Individual__Group__3__Impl )
            // InternalOntoL.g:1910:2: rule__Individual__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Individual__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__3"


    // $ANTLR start "rule__Individual__Group__3__Impl"
    // InternalOntoL.g:1916:1: rule__Individual__Group__3__Impl : ( ( rule__Individual__Group_3__0 )? ) ;
    public final void rule__Individual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1920:1: ( ( ( rule__Individual__Group_3__0 )? ) )
            // InternalOntoL.g:1921:1: ( ( rule__Individual__Group_3__0 )? )
            {
            // InternalOntoL.g:1921:1: ( ( rule__Individual__Group_3__0 )? )
            // InternalOntoL.g:1922:2: ( rule__Individual__Group_3__0 )?
            {
             before(grammarAccess.getIndividualAccess().getGroup_3()); 
            // InternalOntoL.g:1923:2: ( rule__Individual__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOntoL.g:1923:3: rule__Individual__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Individual__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIndividualAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__3__Impl"


    // $ANTLR start "rule__Individual__Group_2__0"
    // InternalOntoL.g:1932:1: rule__Individual__Group_2__0 : rule__Individual__Group_2__0__Impl rule__Individual__Group_2__1 ;
    public final void rule__Individual__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1936:1: ( rule__Individual__Group_2__0__Impl rule__Individual__Group_2__1 )
            // InternalOntoL.g:1937:2: rule__Individual__Group_2__0__Impl rule__Individual__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Individual__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Individual__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_2__0"


    // $ANTLR start "rule__Individual__Group_2__0__Impl"
    // InternalOntoL.g:1944:1: rule__Individual__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Individual__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1948:1: ( ( ':' ) )
            // InternalOntoL.g:1949:1: ( ':' )
            {
            // InternalOntoL.g:1949:1: ( ':' )
            // InternalOntoL.g:1950:2: ':'
            {
             before(grammarAccess.getIndividualAccess().getColonKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getIndividualAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_2__0__Impl"


    // $ANTLR start "rule__Individual__Group_2__1"
    // InternalOntoL.g:1959:1: rule__Individual__Group_2__1 : rule__Individual__Group_2__1__Impl rule__Individual__Group_2__2 ;
    public final void rule__Individual__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1963:1: ( rule__Individual__Group_2__1__Impl rule__Individual__Group_2__2 )
            // InternalOntoL.g:1964:2: rule__Individual__Group_2__1__Impl rule__Individual__Group_2__2
            {
            pushFollow(FOLLOW_12);
            rule__Individual__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Individual__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_2__1"


    // $ANTLR start "rule__Individual__Group_2__1__Impl"
    // InternalOntoL.g:1971:1: rule__Individual__Group_2__1__Impl : ( ( rule__Individual__InstantiatedClassesAssignment_2_1 ) ) ;
    public final void rule__Individual__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1975:1: ( ( ( rule__Individual__InstantiatedClassesAssignment_2_1 ) ) )
            // InternalOntoL.g:1976:1: ( ( rule__Individual__InstantiatedClassesAssignment_2_1 ) )
            {
            // InternalOntoL.g:1976:1: ( ( rule__Individual__InstantiatedClassesAssignment_2_1 ) )
            // InternalOntoL.g:1977:2: ( rule__Individual__InstantiatedClassesAssignment_2_1 )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesAssignment_2_1()); 
            // InternalOntoL.g:1978:2: ( rule__Individual__InstantiatedClassesAssignment_2_1 )
            // InternalOntoL.g:1978:3: rule__Individual__InstantiatedClassesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Individual__InstantiatedClassesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIndividualAccess().getInstantiatedClassesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_2__1__Impl"


    // $ANTLR start "rule__Individual__Group_2__2"
    // InternalOntoL.g:1986:1: rule__Individual__Group_2__2 : rule__Individual__Group_2__2__Impl ;
    public final void rule__Individual__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1990:1: ( rule__Individual__Group_2__2__Impl )
            // InternalOntoL.g:1991:2: rule__Individual__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Individual__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_2__2"


    // $ANTLR start "rule__Individual__Group_2__2__Impl"
    // InternalOntoL.g:1997:1: rule__Individual__Group_2__2__Impl : ( ( rule__Individual__Group_2_2__0 )* ) ;
    public final void rule__Individual__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2001:1: ( ( ( rule__Individual__Group_2_2__0 )* ) )
            // InternalOntoL.g:2002:1: ( ( rule__Individual__Group_2_2__0 )* )
            {
            // InternalOntoL.g:2002:1: ( ( rule__Individual__Group_2_2__0 )* )
            // InternalOntoL.g:2003:2: ( rule__Individual__Group_2_2__0 )*
            {
             before(grammarAccess.getIndividualAccess().getGroup_2_2()); 
            // InternalOntoL.g:2004:2: ( rule__Individual__Group_2_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==34) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalOntoL.g:2004:3: rule__Individual__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Individual__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getIndividualAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_2__2__Impl"


    // $ANTLR start "rule__Individual__Group_2_2__0"
    // InternalOntoL.g:2013:1: rule__Individual__Group_2_2__0 : rule__Individual__Group_2_2__0__Impl rule__Individual__Group_2_2__1 ;
    public final void rule__Individual__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2017:1: ( rule__Individual__Group_2_2__0__Impl rule__Individual__Group_2_2__1 )
            // InternalOntoL.g:2018:2: rule__Individual__Group_2_2__0__Impl rule__Individual__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Individual__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Individual__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_2_2__0"


    // $ANTLR start "rule__Individual__Group_2_2__0__Impl"
    // InternalOntoL.g:2025:1: rule__Individual__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Individual__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2029:1: ( ( ',' ) )
            // InternalOntoL.g:2030:1: ( ',' )
            {
            // InternalOntoL.g:2030:1: ( ',' )
            // InternalOntoL.g:2031:2: ','
            {
             before(grammarAccess.getIndividualAccess().getCommaKeyword_2_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getIndividualAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_2_2__0__Impl"


    // $ANTLR start "rule__Individual__Group_2_2__1"
    // InternalOntoL.g:2040:1: rule__Individual__Group_2_2__1 : rule__Individual__Group_2_2__1__Impl ;
    public final void rule__Individual__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2044:1: ( rule__Individual__Group_2_2__1__Impl )
            // InternalOntoL.g:2045:2: rule__Individual__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Individual__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_2_2__1"


    // $ANTLR start "rule__Individual__Group_2_2__1__Impl"
    // InternalOntoL.g:2051:1: rule__Individual__Group_2_2__1__Impl : ( ( rule__Individual__InstantiatedClassesAssignment_2_2_1 ) ) ;
    public final void rule__Individual__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2055:1: ( ( ( rule__Individual__InstantiatedClassesAssignment_2_2_1 ) ) )
            // InternalOntoL.g:2056:1: ( ( rule__Individual__InstantiatedClassesAssignment_2_2_1 ) )
            {
            // InternalOntoL.g:2056:1: ( ( rule__Individual__InstantiatedClassesAssignment_2_2_1 ) )
            // InternalOntoL.g:2057:2: ( rule__Individual__InstantiatedClassesAssignment_2_2_1 )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesAssignment_2_2_1()); 
            // InternalOntoL.g:2058:2: ( rule__Individual__InstantiatedClassesAssignment_2_2_1 )
            // InternalOntoL.g:2058:3: rule__Individual__InstantiatedClassesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Individual__InstantiatedClassesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIndividualAccess().getInstantiatedClassesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_2_2__1__Impl"


    // $ANTLR start "rule__Individual__Group_3__0"
    // InternalOntoL.g:2067:1: rule__Individual__Group_3__0 : rule__Individual__Group_3__0__Impl rule__Individual__Group_3__1 ;
    public final void rule__Individual__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2071:1: ( rule__Individual__Group_3__0__Impl rule__Individual__Group_3__1 )
            // InternalOntoL.g:2072:2: rule__Individual__Group_3__0__Impl rule__Individual__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Individual__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Individual__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_3__0"


    // $ANTLR start "rule__Individual__Group_3__0__Impl"
    // InternalOntoL.g:2079:1: rule__Individual__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Individual__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2083:1: ( ( '{' ) )
            // InternalOntoL.g:2084:1: ( '{' )
            {
            // InternalOntoL.g:2084:1: ( '{' )
            // InternalOntoL.g:2085:2: '{'
            {
             before(grammarAccess.getIndividualAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIndividualAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_3__0__Impl"


    // $ANTLR start "rule__Individual__Group_3__1"
    // InternalOntoL.g:2094:1: rule__Individual__Group_3__1 : rule__Individual__Group_3__1__Impl rule__Individual__Group_3__2 ;
    public final void rule__Individual__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2098:1: ( rule__Individual__Group_3__1__Impl rule__Individual__Group_3__2 )
            // InternalOntoL.g:2099:2: rule__Individual__Group_3__1__Impl rule__Individual__Group_3__2
            {
            pushFollow(FOLLOW_14);
            rule__Individual__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Individual__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_3__1"


    // $ANTLR start "rule__Individual__Group_3__1__Impl"
    // InternalOntoL.g:2106:1: rule__Individual__Group_3__1__Impl : ( ( rule__Individual__Alternatives_3_1 )* ) ;
    public final void rule__Individual__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2110:1: ( ( ( rule__Individual__Alternatives_3_1 )* ) )
            // InternalOntoL.g:2111:1: ( ( rule__Individual__Alternatives_3_1 )* )
            {
            // InternalOntoL.g:2111:1: ( ( rule__Individual__Alternatives_3_1 )* )
            // InternalOntoL.g:2112:2: ( rule__Individual__Alternatives_3_1 )*
            {
             before(grammarAccess.getIndividualAccess().getAlternatives_3_1()); 
            // InternalOntoL.g:2113:2: ( rule__Individual__Alternatives_3_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==42||LA26_0==47) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalOntoL.g:2113:3: rule__Individual__Alternatives_3_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Individual__Alternatives_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getIndividualAccess().getAlternatives_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_3__1__Impl"


    // $ANTLR start "rule__Individual__Group_3__2"
    // InternalOntoL.g:2121:1: rule__Individual__Group_3__2 : rule__Individual__Group_3__2__Impl ;
    public final void rule__Individual__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2125:1: ( rule__Individual__Group_3__2__Impl )
            // InternalOntoL.g:2126:2: rule__Individual__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Individual__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_3__2"


    // $ANTLR start "rule__Individual__Group_3__2__Impl"
    // InternalOntoL.g:2132:1: rule__Individual__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Individual__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2136:1: ( ( '}' ) )
            // InternalOntoL.g:2137:1: ( '}' )
            {
            // InternalOntoL.g:2137:1: ( '}' )
            // InternalOntoL.g:2138:2: '}'
            {
             before(grammarAccess.getIndividualAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIndividualAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_3__2__Impl"


    // $ANTLR start "rule__OntoLClass__Group__0"
    // InternalOntoL.g:2148:1: rule__OntoLClass__Group__0 : rule__OntoLClass__Group__0__Impl rule__OntoLClass__Group__1 ;
    public final void rule__OntoLClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2152:1: ( rule__OntoLClass__Group__0__Impl rule__OntoLClass__Group__1 )
            // InternalOntoL.g:2153:2: rule__OntoLClass__Group__0__Impl rule__OntoLClass__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OntoLClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoLClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__Group__0"


    // $ANTLR start "rule__OntoLClass__Group__0__Impl"
    // InternalOntoL.g:2160:1: rule__OntoLClass__Group__0__Impl : ( ( rule__OntoLClass__Alternatives_0 ) ) ;
    public final void rule__OntoLClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2164:1: ( ( ( rule__OntoLClass__Alternatives_0 ) ) )
            // InternalOntoL.g:2165:1: ( ( rule__OntoLClass__Alternatives_0 ) )
            {
            // InternalOntoL.g:2165:1: ( ( rule__OntoLClass__Alternatives_0 ) )
            // InternalOntoL.g:2166:2: ( rule__OntoLClass__Alternatives_0 )
            {
             before(grammarAccess.getOntoLClassAccess().getAlternatives_0()); 
            // InternalOntoL.g:2167:2: ( rule__OntoLClass__Alternatives_0 )
            // InternalOntoL.g:2167:3: rule__OntoLClass__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__OntoLClass__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOntoLClassAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__Group__0__Impl"


    // $ANTLR start "rule__OntoLClass__Group__1"
    // InternalOntoL.g:2175:1: rule__OntoLClass__Group__1 : rule__OntoLClass__Group__1__Impl ;
    public final void rule__OntoLClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2179:1: ( rule__OntoLClass__Group__1__Impl )
            // InternalOntoL.g:2180:2: rule__OntoLClass__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntoLClass__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__Group__1"


    // $ANTLR start "rule__OntoLClass__Group__1__Impl"
    // InternalOntoL.g:2186:1: rule__OntoLClass__Group__1__Impl : ( ( rule__OntoLClass__Group_1__0 )? ) ;
    public final void rule__OntoLClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2190:1: ( ( ( rule__OntoLClass__Group_1__0 )? ) )
            // InternalOntoL.g:2191:1: ( ( rule__OntoLClass__Group_1__0 )? )
            {
            // InternalOntoL.g:2191:1: ( ( rule__OntoLClass__Group_1__0 )? )
            // InternalOntoL.g:2192:2: ( rule__OntoLClass__Group_1__0 )?
            {
             before(grammarAccess.getOntoLClassAccess().getGroup_1()); 
            // InternalOntoL.g:2193:2: ( rule__OntoLClass__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==25) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOntoL.g:2193:3: rule__OntoLClass__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntoLClass__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOntoLClassAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__Group__1__Impl"


    // $ANTLR start "rule__OntoLClass__Group_1__0"
    // InternalOntoL.g:2202:1: rule__OntoLClass__Group_1__0 : rule__OntoLClass__Group_1__0__Impl rule__OntoLClass__Group_1__1 ;
    public final void rule__OntoLClass__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2206:1: ( rule__OntoLClass__Group_1__0__Impl rule__OntoLClass__Group_1__1 )
            // InternalOntoL.g:2207:2: rule__OntoLClass__Group_1__0__Impl rule__OntoLClass__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__OntoLClass__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoLClass__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__Group_1__0"


    // $ANTLR start "rule__OntoLClass__Group_1__0__Impl"
    // InternalOntoL.g:2214:1: rule__OntoLClass__Group_1__0__Impl : ( '{' ) ;
    public final void rule__OntoLClass__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2218:1: ( ( '{' ) )
            // InternalOntoL.g:2219:1: ( '{' )
            {
            // InternalOntoL.g:2219:1: ( '{' )
            // InternalOntoL.g:2220:2: '{'
            {
             before(grammarAccess.getOntoLClassAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOntoLClassAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__Group_1__0__Impl"


    // $ANTLR start "rule__OntoLClass__Group_1__1"
    // InternalOntoL.g:2229:1: rule__OntoLClass__Group_1__1 : rule__OntoLClass__Group_1__1__Impl rule__OntoLClass__Group_1__2 ;
    public final void rule__OntoLClass__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2233:1: ( rule__OntoLClass__Group_1__1__Impl rule__OntoLClass__Group_1__2 )
            // InternalOntoL.g:2234:2: rule__OntoLClass__Group_1__1__Impl rule__OntoLClass__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__OntoLClass__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoLClass__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__Group_1__1"


    // $ANTLR start "rule__OntoLClass__Group_1__1__Impl"
    // InternalOntoL.g:2241:1: rule__OntoLClass__Group_1__1__Impl : ( ( rule__OntoLClass__Alternatives_1_1 )* ) ;
    public final void rule__OntoLClass__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2245:1: ( ( ( rule__OntoLClass__Alternatives_1_1 )* ) )
            // InternalOntoL.g:2246:1: ( ( rule__OntoLClass__Alternatives_1_1 )* )
            {
            // InternalOntoL.g:2246:1: ( ( rule__OntoLClass__Alternatives_1_1 )* )
            // InternalOntoL.g:2247:2: ( rule__OntoLClass__Alternatives_1_1 )*
            {
             before(grammarAccess.getOntoLClassAccess().getAlternatives_1_1()); 
            // InternalOntoL.g:2248:2: ( rule__OntoLClass__Alternatives_1_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==42||LA28_0==47||LA28_0==56) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalOntoL.g:2248:3: rule__OntoLClass__Alternatives_1_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__OntoLClass__Alternatives_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getOntoLClassAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__Group_1__1__Impl"


    // $ANTLR start "rule__OntoLClass__Group_1__2"
    // InternalOntoL.g:2256:1: rule__OntoLClass__Group_1__2 : rule__OntoLClass__Group_1__2__Impl ;
    public final void rule__OntoLClass__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2260:1: ( rule__OntoLClass__Group_1__2__Impl )
            // InternalOntoL.g:2261:2: rule__OntoLClass__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntoLClass__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__Group_1__2"


    // $ANTLR start "rule__OntoLClass__Group_1__2__Impl"
    // InternalOntoL.g:2267:1: rule__OntoLClass__Group_1__2__Impl : ( '}' ) ;
    public final void rule__OntoLClass__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2271:1: ( ( '}' ) )
            // InternalOntoL.g:2272:1: ( '}' )
            {
            // InternalOntoL.g:2272:1: ( '}' )
            // InternalOntoL.g:2273:2: '}'
            {
             before(grammarAccess.getOntoLClassAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOntoLClassAccess().getRightCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__Group_1__2__Impl"


    // $ANTLR start "rule__OrderlessClass__Group__0"
    // InternalOntoL.g:2283:1: rule__OrderlessClass__Group__0 : rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1 ;
    public final void rule__OrderlessClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2287:1: ( rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1 )
            // InternalOntoL.g:2288:2: rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__OrderlessClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__0"


    // $ANTLR start "rule__OrderlessClass__Group__0__Impl"
    // InternalOntoL.g:2295:1: rule__OrderlessClass__Group__0__Impl : ( 'orderless' ) ;
    public final void rule__OrderlessClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2299:1: ( ( 'orderless' ) )
            // InternalOntoL.g:2300:1: ( 'orderless' )
            {
            // InternalOntoL.g:2300:1: ( 'orderless' )
            // InternalOntoL.g:2301:2: 'orderless'
            {
             before(grammarAccess.getOrderlessClassAccess().getOrderlessKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOrderlessClassAccess().getOrderlessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__0__Impl"


    // $ANTLR start "rule__OrderlessClass__Group__1"
    // InternalOntoL.g:2310:1: rule__OrderlessClass__Group__1 : rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2 ;
    public final void rule__OrderlessClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2314:1: ( rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2 )
            // InternalOntoL.g:2315:2: rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__OrderlessClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__1"


    // $ANTLR start "rule__OrderlessClass__Group__1__Impl"
    // InternalOntoL.g:2322:1: rule__OrderlessClass__Group__1__Impl : ( 'class' ) ;
    public final void rule__OrderlessClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2326:1: ( ( 'class' ) )
            // InternalOntoL.g:2327:1: ( 'class' )
            {
            // InternalOntoL.g:2327:1: ( 'class' )
            // InternalOntoL.g:2328:2: 'class'
            {
             before(grammarAccess.getOrderlessClassAccess().getClassKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOrderlessClassAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__1__Impl"


    // $ANTLR start "rule__OrderlessClass__Group__2"
    // InternalOntoL.g:2337:1: rule__OrderlessClass__Group__2 : rule__OrderlessClass__Group__2__Impl rule__OrderlessClass__Group__3 ;
    public final void rule__OrderlessClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2341:1: ( rule__OrderlessClass__Group__2__Impl rule__OrderlessClass__Group__3 )
            // InternalOntoL.g:2342:2: rule__OrderlessClass__Group__2__Impl rule__OrderlessClass__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__OrderlessClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__2"


    // $ANTLR start "rule__OrderlessClass__Group__2__Impl"
    // InternalOntoL.g:2349:1: rule__OrderlessClass__Group__2__Impl : ( ( rule__OrderlessClass__NameAssignment_2 ) ) ;
    public final void rule__OrderlessClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2353:1: ( ( ( rule__OrderlessClass__NameAssignment_2 ) ) )
            // InternalOntoL.g:2354:1: ( ( rule__OrderlessClass__NameAssignment_2 ) )
            {
            // InternalOntoL.g:2354:1: ( ( rule__OrderlessClass__NameAssignment_2 ) )
            // InternalOntoL.g:2355:2: ( rule__OrderlessClass__NameAssignment_2 )
            {
             before(grammarAccess.getOrderlessClassAccess().getNameAssignment_2()); 
            // InternalOntoL.g:2356:2: ( rule__OrderlessClass__NameAssignment_2 )
            // InternalOntoL.g:2356:3: rule__OrderlessClass__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrderlessClassAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__2__Impl"


    // $ANTLR start "rule__OrderlessClass__Group__3"
    // InternalOntoL.g:2364:1: rule__OrderlessClass__Group__3 : rule__OrderlessClass__Group__3__Impl rule__OrderlessClass__Group__4 ;
    public final void rule__OrderlessClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2368:1: ( rule__OrderlessClass__Group__3__Impl rule__OrderlessClass__Group__4 )
            // InternalOntoL.g:2369:2: rule__OrderlessClass__Group__3__Impl rule__OrderlessClass__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__OrderlessClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__3"


    // $ANTLR start "rule__OrderlessClass__Group__3__Impl"
    // InternalOntoL.g:2376:1: rule__OrderlessClass__Group__3__Impl : ( ( rule__OrderlessClass__Group_3__0 )? ) ;
    public final void rule__OrderlessClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2380:1: ( ( ( rule__OrderlessClass__Group_3__0 )? ) )
            // InternalOntoL.g:2381:1: ( ( rule__OrderlessClass__Group_3__0 )? )
            {
            // InternalOntoL.g:2381:1: ( ( rule__OrderlessClass__Group_3__0 )? )
            // InternalOntoL.g:2382:2: ( rule__OrderlessClass__Group_3__0 )?
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_3()); 
            // InternalOntoL.g:2383:2: ( rule__OrderlessClass__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOntoL.g:2383:3: rule__OrderlessClass__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrderlessClass__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderlessClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__3__Impl"


    // $ANTLR start "rule__OrderlessClass__Group__4"
    // InternalOntoL.g:2391:1: rule__OrderlessClass__Group__4 : rule__OrderlessClass__Group__4__Impl rule__OrderlessClass__Group__5 ;
    public final void rule__OrderlessClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2395:1: ( rule__OrderlessClass__Group__4__Impl rule__OrderlessClass__Group__5 )
            // InternalOntoL.g:2396:2: rule__OrderlessClass__Group__4__Impl rule__OrderlessClass__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__OrderlessClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__4"


    // $ANTLR start "rule__OrderlessClass__Group__4__Impl"
    // InternalOntoL.g:2403:1: rule__OrderlessClass__Group__4__Impl : ( ( rule__OrderlessClass__Group_4__0 )? ) ;
    public final void rule__OrderlessClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2407:1: ( ( ( rule__OrderlessClass__Group_4__0 )? ) )
            // InternalOntoL.g:2408:1: ( ( rule__OrderlessClass__Group_4__0 )? )
            {
            // InternalOntoL.g:2408:1: ( ( rule__OrderlessClass__Group_4__0 )? )
            // InternalOntoL.g:2409:2: ( rule__OrderlessClass__Group_4__0 )?
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_4()); 
            // InternalOntoL.g:2410:2: ( rule__OrderlessClass__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOntoL.g:2410:3: rule__OrderlessClass__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrderlessClass__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderlessClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__4__Impl"


    // $ANTLR start "rule__OrderlessClass__Group__5"
    // InternalOntoL.g:2418:1: rule__OrderlessClass__Group__5 : rule__OrderlessClass__Group__5__Impl rule__OrderlessClass__Group__6 ;
    public final void rule__OrderlessClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2422:1: ( rule__OrderlessClass__Group__5__Impl rule__OrderlessClass__Group__6 )
            // InternalOntoL.g:2423:2: rule__OrderlessClass__Group__5__Impl rule__OrderlessClass__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__OrderlessClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__5"


    // $ANTLR start "rule__OrderlessClass__Group__5__Impl"
    // InternalOntoL.g:2430:1: rule__OrderlessClass__Group__5__Impl : ( ( rule__OrderlessClass__Group_5__0 )? ) ;
    public final void rule__OrderlessClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2434:1: ( ( ( rule__OrderlessClass__Group_5__0 )? ) )
            // InternalOntoL.g:2435:1: ( ( rule__OrderlessClass__Group_5__0 )? )
            {
            // InternalOntoL.g:2435:1: ( ( rule__OrderlessClass__Group_5__0 )? )
            // InternalOntoL.g:2436:2: ( rule__OrderlessClass__Group_5__0 )?
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_5()); 
            // InternalOntoL.g:2437:2: ( rule__OrderlessClass__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOntoL.g:2437:3: rule__OrderlessClass__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrderlessClass__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderlessClassAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__5__Impl"


    // $ANTLR start "rule__OrderlessClass__Group__6"
    // InternalOntoL.g:2445:1: rule__OrderlessClass__Group__6 : rule__OrderlessClass__Group__6__Impl ;
    public final void rule__OrderlessClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2449:1: ( rule__OrderlessClass__Group__6__Impl )
            // InternalOntoL.g:2450:2: rule__OrderlessClass__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__6"


    // $ANTLR start "rule__OrderlessClass__Group__6__Impl"
    // InternalOntoL.g:2456:1: rule__OrderlessClass__Group__6__Impl : ( ( rule__OrderlessClass__Alternatives_6 )? ) ;
    public final void rule__OrderlessClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2460:1: ( ( ( rule__OrderlessClass__Alternatives_6 )? ) )
            // InternalOntoL.g:2461:1: ( ( rule__OrderlessClass__Alternatives_6 )? )
            {
            // InternalOntoL.g:2461:1: ( ( rule__OrderlessClass__Alternatives_6 )? )
            // InternalOntoL.g:2462:2: ( rule__OrderlessClass__Alternatives_6 )?
            {
             before(grammarAccess.getOrderlessClassAccess().getAlternatives_6()); 
            // InternalOntoL.g:2463:2: ( rule__OrderlessClass__Alternatives_6 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=14 && LA32_0<=17)||LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOntoL.g:2463:3: rule__OrderlessClass__Alternatives_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrderlessClass__Alternatives_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderlessClassAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__6__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_3__0"
    // InternalOntoL.g:2472:1: rule__OrderlessClass__Group_3__0 : rule__OrderlessClass__Group_3__0__Impl rule__OrderlessClass__Group_3__1 ;
    public final void rule__OrderlessClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2476:1: ( rule__OrderlessClass__Group_3__0__Impl rule__OrderlessClass__Group_3__1 )
            // InternalOntoL.g:2477:2: rule__OrderlessClass__Group_3__0__Impl rule__OrderlessClass__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__OrderlessClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_3__0"


    // $ANTLR start "rule__OrderlessClass__Group_3__0__Impl"
    // InternalOntoL.g:2484:1: rule__OrderlessClass__Group_3__0__Impl : ( ':' ) ;
    public final void rule__OrderlessClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2488:1: ( ( ':' ) )
            // InternalOntoL.g:2489:1: ( ':' )
            {
            // InternalOntoL.g:2489:1: ( ':' )
            // InternalOntoL.g:2490:2: ':'
            {
             before(grammarAccess.getOrderlessClassAccess().getColonKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOrderlessClassAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_3__0__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_3__1"
    // InternalOntoL.g:2499:1: rule__OrderlessClass__Group_3__1 : rule__OrderlessClass__Group_3__1__Impl rule__OrderlessClass__Group_3__2 ;
    public final void rule__OrderlessClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2503:1: ( rule__OrderlessClass__Group_3__1__Impl rule__OrderlessClass__Group_3__2 )
            // InternalOntoL.g:2504:2: rule__OrderlessClass__Group_3__1__Impl rule__OrderlessClass__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__OrderlessClass__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_3__1"


    // $ANTLR start "rule__OrderlessClass__Group_3__1__Impl"
    // InternalOntoL.g:2511:1: rule__OrderlessClass__Group_3__1__Impl : ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 ) ) ;
    public final void rule__OrderlessClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2515:1: ( ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 ) ) )
            // InternalOntoL.g:2516:1: ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 ) )
            {
            // InternalOntoL.g:2516:1: ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 ) )
            // InternalOntoL.g:2517:2: ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesAssignment_3_1()); 
            // InternalOntoL.g:2518:2: ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 )
            // InternalOntoL.g:2518:3: rule__OrderlessClass__InstantiatedClassesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__InstantiatedClassesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_3__1__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_3__2"
    // InternalOntoL.g:2526:1: rule__OrderlessClass__Group_3__2 : rule__OrderlessClass__Group_3__2__Impl ;
    public final void rule__OrderlessClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2530:1: ( rule__OrderlessClass__Group_3__2__Impl )
            // InternalOntoL.g:2531:2: rule__OrderlessClass__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_3__2"


    // $ANTLR start "rule__OrderlessClass__Group_3__2__Impl"
    // InternalOntoL.g:2537:1: rule__OrderlessClass__Group_3__2__Impl : ( ( rule__OrderlessClass__Group_3_2__0 )* ) ;
    public final void rule__OrderlessClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2541:1: ( ( ( rule__OrderlessClass__Group_3_2__0 )* ) )
            // InternalOntoL.g:2542:1: ( ( rule__OrderlessClass__Group_3_2__0 )* )
            {
            // InternalOntoL.g:2542:1: ( ( rule__OrderlessClass__Group_3_2__0 )* )
            // InternalOntoL.g:2543:2: ( rule__OrderlessClass__Group_3_2__0 )*
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_3_2()); 
            // InternalOntoL.g:2544:2: ( rule__OrderlessClass__Group_3_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==34) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalOntoL.g:2544:3: rule__OrderlessClass__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OrderlessClass__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getOrderlessClassAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_3__2__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_3_2__0"
    // InternalOntoL.g:2553:1: rule__OrderlessClass__Group_3_2__0 : rule__OrderlessClass__Group_3_2__0__Impl rule__OrderlessClass__Group_3_2__1 ;
    public final void rule__OrderlessClass__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2557:1: ( rule__OrderlessClass__Group_3_2__0__Impl rule__OrderlessClass__Group_3_2__1 )
            // InternalOntoL.g:2558:2: rule__OrderlessClass__Group_3_2__0__Impl rule__OrderlessClass__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__OrderlessClass__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_3_2__0"


    // $ANTLR start "rule__OrderlessClass__Group_3_2__0__Impl"
    // InternalOntoL.g:2565:1: rule__OrderlessClass__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__OrderlessClass__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2569:1: ( ( ',' ) )
            // InternalOntoL.g:2570:1: ( ',' )
            {
            // InternalOntoL.g:2570:1: ( ',' )
            // InternalOntoL.g:2571:2: ','
            {
             before(grammarAccess.getOrderlessClassAccess().getCommaKeyword_3_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getOrderlessClassAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_3_2__0__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_3_2__1"
    // InternalOntoL.g:2580:1: rule__OrderlessClass__Group_3_2__1 : rule__OrderlessClass__Group_3_2__1__Impl ;
    public final void rule__OrderlessClass__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2584:1: ( rule__OrderlessClass__Group_3_2__1__Impl )
            // InternalOntoL.g:2585:2: rule__OrderlessClass__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_3_2__1"


    // $ANTLR start "rule__OrderlessClass__Group_3_2__1__Impl"
    // InternalOntoL.g:2591:1: rule__OrderlessClass__Group_3_2__1__Impl : ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 ) ) ;
    public final void rule__OrderlessClass__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2595:1: ( ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 ) ) )
            // InternalOntoL.g:2596:1: ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 ) )
            {
            // InternalOntoL.g:2596:1: ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 ) )
            // InternalOntoL.g:2597:2: ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesAssignment_3_2_1()); 
            // InternalOntoL.g:2598:2: ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 )
            // InternalOntoL.g:2598:3: rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_3_2__1__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_4__0"
    // InternalOntoL.g:2607:1: rule__OrderlessClass__Group_4__0 : rule__OrderlessClass__Group_4__0__Impl rule__OrderlessClass__Group_4__1 ;
    public final void rule__OrderlessClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2611:1: ( rule__OrderlessClass__Group_4__0__Impl rule__OrderlessClass__Group_4__1 )
            // InternalOntoL.g:2612:2: rule__OrderlessClass__Group_4__0__Impl rule__OrderlessClass__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__OrderlessClass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_4__0"


    // $ANTLR start "rule__OrderlessClass__Group_4__0__Impl"
    // InternalOntoL.g:2619:1: rule__OrderlessClass__Group_4__0__Impl : ( 'specializes' ) ;
    public final void rule__OrderlessClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2623:1: ( ( 'specializes' ) )
            // InternalOntoL.g:2624:1: ( 'specializes' )
            {
            // InternalOntoL.g:2624:1: ( 'specializes' )
            // InternalOntoL.g:2625:2: 'specializes'
            {
             before(grammarAccess.getOrderlessClassAccess().getSpecializesKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOrderlessClassAccess().getSpecializesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_4__0__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_4__1"
    // InternalOntoL.g:2634:1: rule__OrderlessClass__Group_4__1 : rule__OrderlessClass__Group_4__1__Impl rule__OrderlessClass__Group_4__2 ;
    public final void rule__OrderlessClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2638:1: ( rule__OrderlessClass__Group_4__1__Impl rule__OrderlessClass__Group_4__2 )
            // InternalOntoL.g:2639:2: rule__OrderlessClass__Group_4__1__Impl rule__OrderlessClass__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__OrderlessClass__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_4__1"


    // $ANTLR start "rule__OrderlessClass__Group_4__1__Impl"
    // InternalOntoL.g:2646:1: rule__OrderlessClass__Group_4__1__Impl : ( ( rule__OrderlessClass__SuperClassesAssignment_4_1 ) ) ;
    public final void rule__OrderlessClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2650:1: ( ( ( rule__OrderlessClass__SuperClassesAssignment_4_1 ) ) )
            // InternalOntoL.g:2651:1: ( ( rule__OrderlessClass__SuperClassesAssignment_4_1 ) )
            {
            // InternalOntoL.g:2651:1: ( ( rule__OrderlessClass__SuperClassesAssignment_4_1 ) )
            // InternalOntoL.g:2652:2: ( rule__OrderlessClass__SuperClassesAssignment_4_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getSuperClassesAssignment_4_1()); 
            // InternalOntoL.g:2653:2: ( rule__OrderlessClass__SuperClassesAssignment_4_1 )
            // InternalOntoL.g:2653:3: rule__OrderlessClass__SuperClassesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__SuperClassesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderlessClassAccess().getSuperClassesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_4__1__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_4__2"
    // InternalOntoL.g:2661:1: rule__OrderlessClass__Group_4__2 : rule__OrderlessClass__Group_4__2__Impl ;
    public final void rule__OrderlessClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2665:1: ( rule__OrderlessClass__Group_4__2__Impl )
            // InternalOntoL.g:2666:2: rule__OrderlessClass__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_4__2"


    // $ANTLR start "rule__OrderlessClass__Group_4__2__Impl"
    // InternalOntoL.g:2672:1: rule__OrderlessClass__Group_4__2__Impl : ( ( rule__OrderlessClass__Group_4_2__0 )* ) ;
    public final void rule__OrderlessClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2676:1: ( ( ( rule__OrderlessClass__Group_4_2__0 )* ) )
            // InternalOntoL.g:2677:1: ( ( rule__OrderlessClass__Group_4_2__0 )* )
            {
            // InternalOntoL.g:2677:1: ( ( rule__OrderlessClass__Group_4_2__0 )* )
            // InternalOntoL.g:2678:2: ( rule__OrderlessClass__Group_4_2__0 )*
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_4_2()); 
            // InternalOntoL.g:2679:2: ( rule__OrderlessClass__Group_4_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==34) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalOntoL.g:2679:3: rule__OrderlessClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OrderlessClass__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getOrderlessClassAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_4__2__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_4_2__0"
    // InternalOntoL.g:2688:1: rule__OrderlessClass__Group_4_2__0 : rule__OrderlessClass__Group_4_2__0__Impl rule__OrderlessClass__Group_4_2__1 ;
    public final void rule__OrderlessClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2692:1: ( rule__OrderlessClass__Group_4_2__0__Impl rule__OrderlessClass__Group_4_2__1 )
            // InternalOntoL.g:2693:2: rule__OrderlessClass__Group_4_2__0__Impl rule__OrderlessClass__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__OrderlessClass__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_4_2__0"


    // $ANTLR start "rule__OrderlessClass__Group_4_2__0__Impl"
    // InternalOntoL.g:2700:1: rule__OrderlessClass__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__OrderlessClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2704:1: ( ( ',' ) )
            // InternalOntoL.g:2705:1: ( ',' )
            {
            // InternalOntoL.g:2705:1: ( ',' )
            // InternalOntoL.g:2706:2: ','
            {
             before(grammarAccess.getOrderlessClassAccess().getCommaKeyword_4_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getOrderlessClassAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_4_2__0__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_4_2__1"
    // InternalOntoL.g:2715:1: rule__OrderlessClass__Group_4_2__1 : rule__OrderlessClass__Group_4_2__1__Impl ;
    public final void rule__OrderlessClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2719:1: ( rule__OrderlessClass__Group_4_2__1__Impl )
            // InternalOntoL.g:2720:2: rule__OrderlessClass__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_4_2__1"


    // $ANTLR start "rule__OrderlessClass__Group_4_2__1__Impl"
    // InternalOntoL.g:2726:1: rule__OrderlessClass__Group_4_2__1__Impl : ( ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 ) ) ;
    public final void rule__OrderlessClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2730:1: ( ( ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 ) ) )
            // InternalOntoL.g:2731:1: ( ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 ) )
            {
            // InternalOntoL.g:2731:1: ( ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 ) )
            // InternalOntoL.g:2732:2: ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getSuperClassesAssignment_4_2_1()); 
            // InternalOntoL.g:2733:2: ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 )
            // InternalOntoL.g:2733:3: rule__OrderlessClass__SuperClassesAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__SuperClassesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderlessClassAccess().getSuperClassesAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_4_2__1__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_5__0"
    // InternalOntoL.g:2742:1: rule__OrderlessClass__Group_5__0 : rule__OrderlessClass__Group_5__0__Impl rule__OrderlessClass__Group_5__1 ;
    public final void rule__OrderlessClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2746:1: ( rule__OrderlessClass__Group_5__0__Impl rule__OrderlessClass__Group_5__1 )
            // InternalOntoL.g:2747:2: rule__OrderlessClass__Group_5__0__Impl rule__OrderlessClass__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__OrderlessClass__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_5__0"


    // $ANTLR start "rule__OrderlessClass__Group_5__0__Impl"
    // InternalOntoL.g:2754:1: rule__OrderlessClass__Group_5__0__Impl : ( 'subordinatedTo' ) ;
    public final void rule__OrderlessClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2758:1: ( ( 'subordinatedTo' ) )
            // InternalOntoL.g:2759:1: ( 'subordinatedTo' )
            {
            // InternalOntoL.g:2759:1: ( 'subordinatedTo' )
            // InternalOntoL.g:2760:2: 'subordinatedTo'
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatedToKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOrderlessClassAccess().getSubordinatedToKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_5__0__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_5__1"
    // InternalOntoL.g:2769:1: rule__OrderlessClass__Group_5__1 : rule__OrderlessClass__Group_5__1__Impl rule__OrderlessClass__Group_5__2 ;
    public final void rule__OrderlessClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2773:1: ( rule__OrderlessClass__Group_5__1__Impl rule__OrderlessClass__Group_5__2 )
            // InternalOntoL.g:2774:2: rule__OrderlessClass__Group_5__1__Impl rule__OrderlessClass__Group_5__2
            {
            pushFollow(FOLLOW_12);
            rule__OrderlessClass__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_5__1"


    // $ANTLR start "rule__OrderlessClass__Group_5__1__Impl"
    // InternalOntoL.g:2781:1: rule__OrderlessClass__Group_5__1__Impl : ( ( rule__OrderlessClass__SubordinatorsAssignment_5_1 ) ) ;
    public final void rule__OrderlessClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2785:1: ( ( ( rule__OrderlessClass__SubordinatorsAssignment_5_1 ) ) )
            // InternalOntoL.g:2786:1: ( ( rule__OrderlessClass__SubordinatorsAssignment_5_1 ) )
            {
            // InternalOntoL.g:2786:1: ( ( rule__OrderlessClass__SubordinatorsAssignment_5_1 ) )
            // InternalOntoL.g:2787:2: ( rule__OrderlessClass__SubordinatorsAssignment_5_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatorsAssignment_5_1()); 
            // InternalOntoL.g:2788:2: ( rule__OrderlessClass__SubordinatorsAssignment_5_1 )
            // InternalOntoL.g:2788:3: rule__OrderlessClass__SubordinatorsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__SubordinatorsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderlessClassAccess().getSubordinatorsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_5__1__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_5__2"
    // InternalOntoL.g:2796:1: rule__OrderlessClass__Group_5__2 : rule__OrderlessClass__Group_5__2__Impl ;
    public final void rule__OrderlessClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2800:1: ( rule__OrderlessClass__Group_5__2__Impl )
            // InternalOntoL.g:2801:2: rule__OrderlessClass__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_5__2"


    // $ANTLR start "rule__OrderlessClass__Group_5__2__Impl"
    // InternalOntoL.g:2807:1: rule__OrderlessClass__Group_5__2__Impl : ( ( rule__OrderlessClass__Group_5_2__0 )* ) ;
    public final void rule__OrderlessClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2811:1: ( ( ( rule__OrderlessClass__Group_5_2__0 )* ) )
            // InternalOntoL.g:2812:1: ( ( rule__OrderlessClass__Group_5_2__0 )* )
            {
            // InternalOntoL.g:2812:1: ( ( rule__OrderlessClass__Group_5_2__0 )* )
            // InternalOntoL.g:2813:2: ( rule__OrderlessClass__Group_5_2__0 )*
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_5_2()); 
            // InternalOntoL.g:2814:2: ( rule__OrderlessClass__Group_5_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==34) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalOntoL.g:2814:3: rule__OrderlessClass__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OrderlessClass__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getOrderlessClassAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_5__2__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_5_2__0"
    // InternalOntoL.g:2823:1: rule__OrderlessClass__Group_5_2__0 : rule__OrderlessClass__Group_5_2__0__Impl rule__OrderlessClass__Group_5_2__1 ;
    public final void rule__OrderlessClass__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2827:1: ( rule__OrderlessClass__Group_5_2__0__Impl rule__OrderlessClass__Group_5_2__1 )
            // InternalOntoL.g:2828:2: rule__OrderlessClass__Group_5_2__0__Impl rule__OrderlessClass__Group_5_2__1
            {
            pushFollow(FOLLOW_3);
            rule__OrderlessClass__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_5_2__0"


    // $ANTLR start "rule__OrderlessClass__Group_5_2__0__Impl"
    // InternalOntoL.g:2835:1: rule__OrderlessClass__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__OrderlessClass__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2839:1: ( ( ',' ) )
            // InternalOntoL.g:2840:1: ( ',' )
            {
            // InternalOntoL.g:2840:1: ( ',' )
            // InternalOntoL.g:2841:2: ','
            {
             before(grammarAccess.getOrderlessClassAccess().getCommaKeyword_5_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getOrderlessClassAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_5_2__0__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_5_2__1"
    // InternalOntoL.g:2850:1: rule__OrderlessClass__Group_5_2__1 : rule__OrderlessClass__Group_5_2__1__Impl ;
    public final void rule__OrderlessClass__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2854:1: ( rule__OrderlessClass__Group_5_2__1__Impl )
            // InternalOntoL.g:2855:2: rule__OrderlessClass__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_5_2__1"


    // $ANTLR start "rule__OrderlessClass__Group_5_2__1__Impl"
    // InternalOntoL.g:2861:1: rule__OrderlessClass__Group_5_2__1__Impl : ( ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 ) ) ;
    public final void rule__OrderlessClass__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2865:1: ( ( ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 ) ) )
            // InternalOntoL.g:2866:1: ( ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 ) )
            {
            // InternalOntoL.g:2866:1: ( ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 ) )
            // InternalOntoL.g:2867:2: ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatorsAssignment_5_2_1()); 
            // InternalOntoL.g:2868:2: ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 )
            // InternalOntoL.g:2868:3: rule__OrderlessClass__SubordinatorsAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__SubordinatorsAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderlessClassAccess().getSubordinatorsAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_5_2__1__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_6_0__0"
    // InternalOntoL.g:2877:1: rule__OrderlessClass__Group_6_0__0 : rule__OrderlessClass__Group_6_0__0__Impl rule__OrderlessClass__Group_6_0__1 ;
    public final void rule__OrderlessClass__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2881:1: ( rule__OrderlessClass__Group_6_0__0__Impl rule__OrderlessClass__Group_6_0__1 )
            // InternalOntoL.g:2882:2: rule__OrderlessClass__Group_6_0__0__Impl rule__OrderlessClass__Group_6_0__1
            {
            pushFollow(FOLLOW_3);
            rule__OrderlessClass__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_6_0__0"


    // $ANTLR start "rule__OrderlessClass__Group_6_0__0__Impl"
    // InternalOntoL.g:2889:1: rule__OrderlessClass__Group_6_0__0__Impl : ( ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 ) ) ;
    public final void rule__OrderlessClass__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2893:1: ( ( ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 ) ) )
            // InternalOntoL.g:2894:1: ( ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 ) )
            {
            // InternalOntoL.g:2894:1: ( ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 ) )
            // InternalOntoL.g:2895:2: ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 )
            {
             before(grammarAccess.getOrderlessClassAccess().getCategorizationTypeAssignment_6_0_0()); 
            // InternalOntoL.g:2896:2: ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 )
            // InternalOntoL.g:2896:3: rule__OrderlessClass__CategorizationTypeAssignment_6_0_0
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__CategorizationTypeAssignment_6_0_0();

            state._fsp--;


            }

             after(grammarAccess.getOrderlessClassAccess().getCategorizationTypeAssignment_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_6_0__0__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_6_0__1"
    // InternalOntoL.g:2904:1: rule__OrderlessClass__Group_6_0__1 : rule__OrderlessClass__Group_6_0__1__Impl ;
    public final void rule__OrderlessClass__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2908:1: ( rule__OrderlessClass__Group_6_0__1__Impl )
            // InternalOntoL.g:2909:2: rule__OrderlessClass__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_6_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_6_0__1"


    // $ANTLR start "rule__OrderlessClass__Group_6_0__1__Impl"
    // InternalOntoL.g:2915:1: rule__OrderlessClass__Group_6_0__1__Impl : ( ( rule__OrderlessClass__BasetypeAssignment_6_0_1 ) ) ;
    public final void rule__OrderlessClass__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2919:1: ( ( ( rule__OrderlessClass__BasetypeAssignment_6_0_1 ) ) )
            // InternalOntoL.g:2920:1: ( ( rule__OrderlessClass__BasetypeAssignment_6_0_1 ) )
            {
            // InternalOntoL.g:2920:1: ( ( rule__OrderlessClass__BasetypeAssignment_6_0_1 ) )
            // InternalOntoL.g:2921:2: ( rule__OrderlessClass__BasetypeAssignment_6_0_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getBasetypeAssignment_6_0_1()); 
            // InternalOntoL.g:2922:2: ( rule__OrderlessClass__BasetypeAssignment_6_0_1 )
            // InternalOntoL.g:2922:3: rule__OrderlessClass__BasetypeAssignment_6_0_1
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__BasetypeAssignment_6_0_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderlessClassAccess().getBasetypeAssignment_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_6_0__1__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_6_1__0"
    // InternalOntoL.g:2931:1: rule__OrderlessClass__Group_6_1__0 : rule__OrderlessClass__Group_6_1__0__Impl rule__OrderlessClass__Group_6_1__1 ;
    public final void rule__OrderlessClass__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2935:1: ( rule__OrderlessClass__Group_6_1__0__Impl rule__OrderlessClass__Group_6_1__1 )
            // InternalOntoL.g:2936:2: rule__OrderlessClass__Group_6_1__0__Impl rule__OrderlessClass__Group_6_1__1
            {
            pushFollow(FOLLOW_3);
            rule__OrderlessClass__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_6_1__0"


    // $ANTLR start "rule__OrderlessClass__Group_6_1__0__Impl"
    // InternalOntoL.g:2943:1: rule__OrderlessClass__Group_6_1__0__Impl : ( 'isPowertypeOf' ) ;
    public final void rule__OrderlessClass__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2947:1: ( ( 'isPowertypeOf' ) )
            // InternalOntoL.g:2948:1: ( 'isPowertypeOf' )
            {
            // InternalOntoL.g:2948:1: ( 'isPowertypeOf' )
            // InternalOntoL.g:2949:2: 'isPowertypeOf'
            {
             before(grammarAccess.getOrderlessClassAccess().getIsPowertypeOfKeyword_6_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOrderlessClassAccess().getIsPowertypeOfKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_6_1__0__Impl"


    // $ANTLR start "rule__OrderlessClass__Group_6_1__1"
    // InternalOntoL.g:2958:1: rule__OrderlessClass__Group_6_1__1 : rule__OrderlessClass__Group_6_1__1__Impl ;
    public final void rule__OrderlessClass__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2962:1: ( rule__OrderlessClass__Group_6_1__1__Impl )
            // InternalOntoL.g:2963:2: rule__OrderlessClass__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_6_1__1"


    // $ANTLR start "rule__OrderlessClass__Group_6_1__1__Impl"
    // InternalOntoL.g:2969:1: rule__OrderlessClass__Group_6_1__1__Impl : ( ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 ) ) ;
    public final void rule__OrderlessClass__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2973:1: ( ( ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 ) ) )
            // InternalOntoL.g:2974:1: ( ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 ) )
            {
            // InternalOntoL.g:2974:1: ( ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 ) )
            // InternalOntoL.g:2975:2: ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getPowertypeOfAssignment_6_1_1()); 
            // InternalOntoL.g:2976:2: ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 )
            // InternalOntoL.g:2976:3: rule__OrderlessClass__PowertypeOfAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__PowertypeOfAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderlessClassAccess().getPowertypeOfAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group_6_1__1__Impl"


    // $ANTLR start "rule__FOClass__Group__0"
    // InternalOntoL.g:2985:1: rule__FOClass__Group__0 : rule__FOClass__Group__0__Impl rule__FOClass__Group__1 ;
    public final void rule__FOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2989:1: ( rule__FOClass__Group__0__Impl rule__FOClass__Group__1 )
            // InternalOntoL.g:2990:2: rule__FOClass__Group__0__Impl rule__FOClass__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__FOClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group__0"


    // $ANTLR start "rule__FOClass__Group__0__Impl"
    // InternalOntoL.g:2997:1: rule__FOClass__Group__0__Impl : ( ( 'first-order' )? ) ;
    public final void rule__FOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3001:1: ( ( ( 'first-order' )? ) )
            // InternalOntoL.g:3002:1: ( ( 'first-order' )? )
            {
            // InternalOntoL.g:3002:1: ( ( 'first-order' )? )
            // InternalOntoL.g:3003:2: ( 'first-order' )?
            {
             before(grammarAccess.getFOClassAccess().getFirstOrderKeyword_0()); 
            // InternalOntoL.g:3004:2: ( 'first-order' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOntoL.g:3004:3: 'first-order'
                    {
                    match(input,40,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFOClassAccess().getFirstOrderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group__0__Impl"


    // $ANTLR start "rule__FOClass__Group__1"
    // InternalOntoL.g:3012:1: rule__FOClass__Group__1 : rule__FOClass__Group__1__Impl rule__FOClass__Group__2 ;
    public final void rule__FOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3016:1: ( rule__FOClass__Group__1__Impl rule__FOClass__Group__2 )
            // InternalOntoL.g:3017:2: rule__FOClass__Group__1__Impl rule__FOClass__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__FOClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group__1"


    // $ANTLR start "rule__FOClass__Group__1__Impl"
    // InternalOntoL.g:3024:1: rule__FOClass__Group__1__Impl : ( 'class' ) ;
    public final void rule__FOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3028:1: ( ( 'class' ) )
            // InternalOntoL.g:3029:1: ( 'class' )
            {
            // InternalOntoL.g:3029:1: ( 'class' )
            // InternalOntoL.g:3030:2: 'class'
            {
             before(grammarAccess.getFOClassAccess().getClassKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFOClassAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group__1__Impl"


    // $ANTLR start "rule__FOClass__Group__2"
    // InternalOntoL.g:3039:1: rule__FOClass__Group__2 : rule__FOClass__Group__2__Impl rule__FOClass__Group__3 ;
    public final void rule__FOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3043:1: ( rule__FOClass__Group__2__Impl rule__FOClass__Group__3 )
            // InternalOntoL.g:3044:2: rule__FOClass__Group__2__Impl rule__FOClass__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__FOClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group__2"


    // $ANTLR start "rule__FOClass__Group__2__Impl"
    // InternalOntoL.g:3051:1: rule__FOClass__Group__2__Impl : ( ( rule__FOClass__NameAssignment_2 ) ) ;
    public final void rule__FOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3055:1: ( ( ( rule__FOClass__NameAssignment_2 ) ) )
            // InternalOntoL.g:3056:1: ( ( rule__FOClass__NameAssignment_2 ) )
            {
            // InternalOntoL.g:3056:1: ( ( rule__FOClass__NameAssignment_2 ) )
            // InternalOntoL.g:3057:2: ( rule__FOClass__NameAssignment_2 )
            {
             before(grammarAccess.getFOClassAccess().getNameAssignment_2()); 
            // InternalOntoL.g:3058:2: ( rule__FOClass__NameAssignment_2 )
            // InternalOntoL.g:3058:3: rule__FOClass__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFOClassAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group__2__Impl"


    // $ANTLR start "rule__FOClass__Group__3"
    // InternalOntoL.g:3066:1: rule__FOClass__Group__3 : rule__FOClass__Group__3__Impl rule__FOClass__Group__4 ;
    public final void rule__FOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3070:1: ( rule__FOClass__Group__3__Impl rule__FOClass__Group__4 )
            // InternalOntoL.g:3071:2: rule__FOClass__Group__3__Impl rule__FOClass__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__FOClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group__3"


    // $ANTLR start "rule__FOClass__Group__3__Impl"
    // InternalOntoL.g:3078:1: rule__FOClass__Group__3__Impl : ( ( rule__FOClass__Group_3__0 )? ) ;
    public final void rule__FOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3082:1: ( ( ( rule__FOClass__Group_3__0 )? ) )
            // InternalOntoL.g:3083:1: ( ( rule__FOClass__Group_3__0 )? )
            {
            // InternalOntoL.g:3083:1: ( ( rule__FOClass__Group_3__0 )? )
            // InternalOntoL.g:3084:2: ( rule__FOClass__Group_3__0 )?
            {
             before(grammarAccess.getFOClassAccess().getGroup_3()); 
            // InternalOntoL.g:3085:2: ( rule__FOClass__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOntoL.g:3085:3: rule__FOClass__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FOClass__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFOClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group__3__Impl"


    // $ANTLR start "rule__FOClass__Group__4"
    // InternalOntoL.g:3093:1: rule__FOClass__Group__4 : rule__FOClass__Group__4__Impl ;
    public final void rule__FOClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3097:1: ( rule__FOClass__Group__4__Impl )
            // InternalOntoL.g:3098:2: rule__FOClass__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group__4"


    // $ANTLR start "rule__FOClass__Group__4__Impl"
    // InternalOntoL.g:3104:1: rule__FOClass__Group__4__Impl : ( ( rule__FOClass__Group_4__0 )? ) ;
    public final void rule__FOClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3108:1: ( ( ( rule__FOClass__Group_4__0 )? ) )
            // InternalOntoL.g:3109:1: ( ( rule__FOClass__Group_4__0 )? )
            {
            // InternalOntoL.g:3109:1: ( ( rule__FOClass__Group_4__0 )? )
            // InternalOntoL.g:3110:2: ( rule__FOClass__Group_4__0 )?
            {
             before(grammarAccess.getFOClassAccess().getGroup_4()); 
            // InternalOntoL.g:3111:2: ( rule__FOClass__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==37) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOntoL.g:3111:3: rule__FOClass__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FOClass__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFOClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group__4__Impl"


    // $ANTLR start "rule__FOClass__Group_3__0"
    // InternalOntoL.g:3120:1: rule__FOClass__Group_3__0 : rule__FOClass__Group_3__0__Impl rule__FOClass__Group_3__1 ;
    public final void rule__FOClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3124:1: ( rule__FOClass__Group_3__0__Impl rule__FOClass__Group_3__1 )
            // InternalOntoL.g:3125:2: rule__FOClass__Group_3__0__Impl rule__FOClass__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__FOClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClass__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_3__0"


    // $ANTLR start "rule__FOClass__Group_3__0__Impl"
    // InternalOntoL.g:3132:1: rule__FOClass__Group_3__0__Impl : ( ':' ) ;
    public final void rule__FOClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3136:1: ( ( ':' ) )
            // InternalOntoL.g:3137:1: ( ':' )
            {
            // InternalOntoL.g:3137:1: ( ':' )
            // InternalOntoL.g:3138:2: ':'
            {
             before(grammarAccess.getFOClassAccess().getColonKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFOClassAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_3__0__Impl"


    // $ANTLR start "rule__FOClass__Group_3__1"
    // InternalOntoL.g:3147:1: rule__FOClass__Group_3__1 : rule__FOClass__Group_3__1__Impl rule__FOClass__Group_3__2 ;
    public final void rule__FOClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3151:1: ( rule__FOClass__Group_3__1__Impl rule__FOClass__Group_3__2 )
            // InternalOntoL.g:3152:2: rule__FOClass__Group_3__1__Impl rule__FOClass__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__FOClass__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClass__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_3__1"


    // $ANTLR start "rule__FOClass__Group_3__1__Impl"
    // InternalOntoL.g:3159:1: rule__FOClass__Group_3__1__Impl : ( ( rule__FOClass__InstantiatedClassesAssignment_3_1 ) ) ;
    public final void rule__FOClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3163:1: ( ( ( rule__FOClass__InstantiatedClassesAssignment_3_1 ) ) )
            // InternalOntoL.g:3164:1: ( ( rule__FOClass__InstantiatedClassesAssignment_3_1 ) )
            {
            // InternalOntoL.g:3164:1: ( ( rule__FOClass__InstantiatedClassesAssignment_3_1 ) )
            // InternalOntoL.g:3165:2: ( rule__FOClass__InstantiatedClassesAssignment_3_1 )
            {
             before(grammarAccess.getFOClassAccess().getInstantiatedClassesAssignment_3_1()); 
            // InternalOntoL.g:3166:2: ( rule__FOClass__InstantiatedClassesAssignment_3_1 )
            // InternalOntoL.g:3166:3: rule__FOClass__InstantiatedClassesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__InstantiatedClassesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFOClassAccess().getInstantiatedClassesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_3__1__Impl"


    // $ANTLR start "rule__FOClass__Group_3__2"
    // InternalOntoL.g:3174:1: rule__FOClass__Group_3__2 : rule__FOClass__Group_3__2__Impl ;
    public final void rule__FOClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3178:1: ( rule__FOClass__Group_3__2__Impl )
            // InternalOntoL.g:3179:2: rule__FOClass__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_3__2"


    // $ANTLR start "rule__FOClass__Group_3__2__Impl"
    // InternalOntoL.g:3185:1: rule__FOClass__Group_3__2__Impl : ( ( rule__FOClass__Group_3_2__0 )* ) ;
    public final void rule__FOClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3189:1: ( ( ( rule__FOClass__Group_3_2__0 )* ) )
            // InternalOntoL.g:3190:1: ( ( rule__FOClass__Group_3_2__0 )* )
            {
            // InternalOntoL.g:3190:1: ( ( rule__FOClass__Group_3_2__0 )* )
            // InternalOntoL.g:3191:2: ( rule__FOClass__Group_3_2__0 )*
            {
             before(grammarAccess.getFOClassAccess().getGroup_3_2()); 
            // InternalOntoL.g:3192:2: ( rule__FOClass__Group_3_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==34) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalOntoL.g:3192:3: rule__FOClass__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__FOClass__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getFOClassAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_3__2__Impl"


    // $ANTLR start "rule__FOClass__Group_3_2__0"
    // InternalOntoL.g:3201:1: rule__FOClass__Group_3_2__0 : rule__FOClass__Group_3_2__0__Impl rule__FOClass__Group_3_2__1 ;
    public final void rule__FOClass__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3205:1: ( rule__FOClass__Group_3_2__0__Impl rule__FOClass__Group_3_2__1 )
            // InternalOntoL.g:3206:2: rule__FOClass__Group_3_2__0__Impl rule__FOClass__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__FOClass__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClass__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_3_2__0"


    // $ANTLR start "rule__FOClass__Group_3_2__0__Impl"
    // InternalOntoL.g:3213:1: rule__FOClass__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__FOClass__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3217:1: ( ( ',' ) )
            // InternalOntoL.g:3218:1: ( ',' )
            {
            // InternalOntoL.g:3218:1: ( ',' )
            // InternalOntoL.g:3219:2: ','
            {
             before(grammarAccess.getFOClassAccess().getCommaKeyword_3_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFOClassAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_3_2__0__Impl"


    // $ANTLR start "rule__FOClass__Group_3_2__1"
    // InternalOntoL.g:3228:1: rule__FOClass__Group_3_2__1 : rule__FOClass__Group_3_2__1__Impl ;
    public final void rule__FOClass__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3232:1: ( rule__FOClass__Group_3_2__1__Impl )
            // InternalOntoL.g:3233:2: rule__FOClass__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_3_2__1"


    // $ANTLR start "rule__FOClass__Group_3_2__1__Impl"
    // InternalOntoL.g:3239:1: rule__FOClass__Group_3_2__1__Impl : ( ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 ) ) ;
    public final void rule__FOClass__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3243:1: ( ( ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 ) ) )
            // InternalOntoL.g:3244:1: ( ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 ) )
            {
            // InternalOntoL.g:3244:1: ( ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 ) )
            // InternalOntoL.g:3245:2: ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 )
            {
             before(grammarAccess.getFOClassAccess().getInstantiatedClassesAssignment_3_2_1()); 
            // InternalOntoL.g:3246:2: ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 )
            // InternalOntoL.g:3246:3: rule__FOClass__InstantiatedClassesAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__InstantiatedClassesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFOClassAccess().getInstantiatedClassesAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_3_2__1__Impl"


    // $ANTLR start "rule__FOClass__Group_4__0"
    // InternalOntoL.g:3255:1: rule__FOClass__Group_4__0 : rule__FOClass__Group_4__0__Impl rule__FOClass__Group_4__1 ;
    public final void rule__FOClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3259:1: ( rule__FOClass__Group_4__0__Impl rule__FOClass__Group_4__1 )
            // InternalOntoL.g:3260:2: rule__FOClass__Group_4__0__Impl rule__FOClass__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__FOClass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClass__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_4__0"


    // $ANTLR start "rule__FOClass__Group_4__0__Impl"
    // InternalOntoL.g:3267:1: rule__FOClass__Group_4__0__Impl : ( 'specializes' ) ;
    public final void rule__FOClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3271:1: ( ( 'specializes' ) )
            // InternalOntoL.g:3272:1: ( 'specializes' )
            {
            // InternalOntoL.g:3272:1: ( 'specializes' )
            // InternalOntoL.g:3273:2: 'specializes'
            {
             before(grammarAccess.getFOClassAccess().getSpecializesKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFOClassAccess().getSpecializesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_4__0__Impl"


    // $ANTLR start "rule__FOClass__Group_4__1"
    // InternalOntoL.g:3282:1: rule__FOClass__Group_4__1 : rule__FOClass__Group_4__1__Impl rule__FOClass__Group_4__2 ;
    public final void rule__FOClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3286:1: ( rule__FOClass__Group_4__1__Impl rule__FOClass__Group_4__2 )
            // InternalOntoL.g:3287:2: rule__FOClass__Group_4__1__Impl rule__FOClass__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__FOClass__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClass__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_4__1"


    // $ANTLR start "rule__FOClass__Group_4__1__Impl"
    // InternalOntoL.g:3294:1: rule__FOClass__Group_4__1__Impl : ( ( rule__FOClass__SuperClassesAssignment_4_1 ) ) ;
    public final void rule__FOClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3298:1: ( ( ( rule__FOClass__SuperClassesAssignment_4_1 ) ) )
            // InternalOntoL.g:3299:1: ( ( rule__FOClass__SuperClassesAssignment_4_1 ) )
            {
            // InternalOntoL.g:3299:1: ( ( rule__FOClass__SuperClassesAssignment_4_1 ) )
            // InternalOntoL.g:3300:2: ( rule__FOClass__SuperClassesAssignment_4_1 )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesAssignment_4_1()); 
            // InternalOntoL.g:3301:2: ( rule__FOClass__SuperClassesAssignment_4_1 )
            // InternalOntoL.g:3301:3: rule__FOClass__SuperClassesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__SuperClassesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFOClassAccess().getSuperClassesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_4__1__Impl"


    // $ANTLR start "rule__FOClass__Group_4__2"
    // InternalOntoL.g:3309:1: rule__FOClass__Group_4__2 : rule__FOClass__Group_4__2__Impl ;
    public final void rule__FOClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3313:1: ( rule__FOClass__Group_4__2__Impl )
            // InternalOntoL.g:3314:2: rule__FOClass__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_4__2"


    // $ANTLR start "rule__FOClass__Group_4__2__Impl"
    // InternalOntoL.g:3320:1: rule__FOClass__Group_4__2__Impl : ( ( rule__FOClass__Group_4_2__0 )* ) ;
    public final void rule__FOClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3324:1: ( ( ( rule__FOClass__Group_4_2__0 )* ) )
            // InternalOntoL.g:3325:1: ( ( rule__FOClass__Group_4_2__0 )* )
            {
            // InternalOntoL.g:3325:1: ( ( rule__FOClass__Group_4_2__0 )* )
            // InternalOntoL.g:3326:2: ( rule__FOClass__Group_4_2__0 )*
            {
             before(grammarAccess.getFOClassAccess().getGroup_4_2()); 
            // InternalOntoL.g:3327:2: ( rule__FOClass__Group_4_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==34) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalOntoL.g:3327:3: rule__FOClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__FOClass__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getFOClassAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_4__2__Impl"


    // $ANTLR start "rule__FOClass__Group_4_2__0"
    // InternalOntoL.g:3336:1: rule__FOClass__Group_4_2__0 : rule__FOClass__Group_4_2__0__Impl rule__FOClass__Group_4_2__1 ;
    public final void rule__FOClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3340:1: ( rule__FOClass__Group_4_2__0__Impl rule__FOClass__Group_4_2__1 )
            // InternalOntoL.g:3341:2: rule__FOClass__Group_4_2__0__Impl rule__FOClass__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__FOClass__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClass__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_4_2__0"


    // $ANTLR start "rule__FOClass__Group_4_2__0__Impl"
    // InternalOntoL.g:3348:1: rule__FOClass__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__FOClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3352:1: ( ( ',' ) )
            // InternalOntoL.g:3353:1: ( ',' )
            {
            // InternalOntoL.g:3353:1: ( ',' )
            // InternalOntoL.g:3354:2: ','
            {
             before(grammarAccess.getFOClassAccess().getCommaKeyword_4_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFOClassAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_4_2__0__Impl"


    // $ANTLR start "rule__FOClass__Group_4_2__1"
    // InternalOntoL.g:3363:1: rule__FOClass__Group_4_2__1 : rule__FOClass__Group_4_2__1__Impl ;
    public final void rule__FOClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3367:1: ( rule__FOClass__Group_4_2__1__Impl )
            // InternalOntoL.g:3368:2: rule__FOClass__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_4_2__1"


    // $ANTLR start "rule__FOClass__Group_4_2__1__Impl"
    // InternalOntoL.g:3374:1: rule__FOClass__Group_4_2__1__Impl : ( ( rule__FOClass__SuperClassesAssignment_4_2_1 ) ) ;
    public final void rule__FOClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3378:1: ( ( ( rule__FOClass__SuperClassesAssignment_4_2_1 ) ) )
            // InternalOntoL.g:3379:1: ( ( rule__FOClass__SuperClassesAssignment_4_2_1 ) )
            {
            // InternalOntoL.g:3379:1: ( ( rule__FOClass__SuperClassesAssignment_4_2_1 ) )
            // InternalOntoL.g:3380:2: ( rule__FOClass__SuperClassesAssignment_4_2_1 )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesAssignment_4_2_1()); 
            // InternalOntoL.g:3381:2: ( rule__FOClass__SuperClassesAssignment_4_2_1 )
            // InternalOntoL.g:3381:3: rule__FOClass__SuperClassesAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__SuperClassesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFOClassAccess().getSuperClassesAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_4_2__1__Impl"


    // $ANTLR start "rule__HOClass__Group__0"
    // InternalOntoL.g:3390:1: rule__HOClass__Group__0 : rule__HOClass__Group__0__Impl rule__HOClass__Group__1 ;
    public final void rule__HOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3394:1: ( rule__HOClass__Group__0__Impl rule__HOClass__Group__1 )
            // InternalOntoL.g:3395:2: rule__HOClass__Group__0__Impl rule__HOClass__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__HOClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__0"


    // $ANTLR start "rule__HOClass__Group__0__Impl"
    // InternalOntoL.g:3402:1: rule__HOClass__Group__0__Impl : ( 'order' ) ;
    public final void rule__HOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3406:1: ( ( 'order' ) )
            // InternalOntoL.g:3407:1: ( 'order' )
            {
            // InternalOntoL.g:3407:1: ( 'order' )
            // InternalOntoL.g:3408:2: 'order'
            {
             before(grammarAccess.getHOClassAccess().getOrderKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getOrderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__0__Impl"


    // $ANTLR start "rule__HOClass__Group__1"
    // InternalOntoL.g:3417:1: rule__HOClass__Group__1 : rule__HOClass__Group__1__Impl rule__HOClass__Group__2 ;
    public final void rule__HOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3421:1: ( rule__HOClass__Group__1__Impl rule__HOClass__Group__2 )
            // InternalOntoL.g:3422:2: rule__HOClass__Group__1__Impl rule__HOClass__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__HOClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__1"


    // $ANTLR start "rule__HOClass__Group__1__Impl"
    // InternalOntoL.g:3429:1: rule__HOClass__Group__1__Impl : ( ( rule__HOClass__OrderAssignment_1 ) ) ;
    public final void rule__HOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3433:1: ( ( ( rule__HOClass__OrderAssignment_1 ) ) )
            // InternalOntoL.g:3434:1: ( ( rule__HOClass__OrderAssignment_1 ) )
            {
            // InternalOntoL.g:3434:1: ( ( rule__HOClass__OrderAssignment_1 ) )
            // InternalOntoL.g:3435:2: ( rule__HOClass__OrderAssignment_1 )
            {
             before(grammarAccess.getHOClassAccess().getOrderAssignment_1()); 
            // InternalOntoL.g:3436:2: ( rule__HOClass__OrderAssignment_1 )
            // InternalOntoL.g:3436:3: rule__HOClass__OrderAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__OrderAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getOrderAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__1__Impl"


    // $ANTLR start "rule__HOClass__Group__2"
    // InternalOntoL.g:3444:1: rule__HOClass__Group__2 : rule__HOClass__Group__2__Impl rule__HOClass__Group__3 ;
    public final void rule__HOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3448:1: ( rule__HOClass__Group__2__Impl rule__HOClass__Group__3 )
            // InternalOntoL.g:3449:2: rule__HOClass__Group__2__Impl rule__HOClass__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__HOClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__2"


    // $ANTLR start "rule__HOClass__Group__2__Impl"
    // InternalOntoL.g:3456:1: rule__HOClass__Group__2__Impl : ( 'class' ) ;
    public final void rule__HOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3460:1: ( ( 'class' ) )
            // InternalOntoL.g:3461:1: ( 'class' )
            {
            // InternalOntoL.g:3461:1: ( 'class' )
            // InternalOntoL.g:3462:2: 'class'
            {
             before(grammarAccess.getHOClassAccess().getClassKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getClassKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__2__Impl"


    // $ANTLR start "rule__HOClass__Group__3"
    // InternalOntoL.g:3471:1: rule__HOClass__Group__3 : rule__HOClass__Group__3__Impl rule__HOClass__Group__4 ;
    public final void rule__HOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3475:1: ( rule__HOClass__Group__3__Impl rule__HOClass__Group__4 )
            // InternalOntoL.g:3476:2: rule__HOClass__Group__3__Impl rule__HOClass__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__HOClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__3"


    // $ANTLR start "rule__HOClass__Group__3__Impl"
    // InternalOntoL.g:3483:1: rule__HOClass__Group__3__Impl : ( ( rule__HOClass__NameAssignment_3 ) ) ;
    public final void rule__HOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3487:1: ( ( ( rule__HOClass__NameAssignment_3 ) ) )
            // InternalOntoL.g:3488:1: ( ( rule__HOClass__NameAssignment_3 ) )
            {
            // InternalOntoL.g:3488:1: ( ( rule__HOClass__NameAssignment_3 ) )
            // InternalOntoL.g:3489:2: ( rule__HOClass__NameAssignment_3 )
            {
             before(grammarAccess.getHOClassAccess().getNameAssignment_3()); 
            // InternalOntoL.g:3490:2: ( rule__HOClass__NameAssignment_3 )
            // InternalOntoL.g:3490:3: rule__HOClass__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__3__Impl"


    // $ANTLR start "rule__HOClass__Group__4"
    // InternalOntoL.g:3498:1: rule__HOClass__Group__4 : rule__HOClass__Group__4__Impl rule__HOClass__Group__5 ;
    public final void rule__HOClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3502:1: ( rule__HOClass__Group__4__Impl rule__HOClass__Group__5 )
            // InternalOntoL.g:3503:2: rule__HOClass__Group__4__Impl rule__HOClass__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__HOClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__4"


    // $ANTLR start "rule__HOClass__Group__4__Impl"
    // InternalOntoL.g:3510:1: rule__HOClass__Group__4__Impl : ( ( rule__HOClass__Group_4__0 )? ) ;
    public final void rule__HOClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3514:1: ( ( ( rule__HOClass__Group_4__0 )? ) )
            // InternalOntoL.g:3515:1: ( ( rule__HOClass__Group_4__0 )? )
            {
            // InternalOntoL.g:3515:1: ( ( rule__HOClass__Group_4__0 )? )
            // InternalOntoL.g:3516:2: ( rule__HOClass__Group_4__0 )?
            {
             before(grammarAccess.getHOClassAccess().getGroup_4()); 
            // InternalOntoL.g:3517:2: ( rule__HOClass__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==33) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalOntoL.g:3517:3: rule__HOClass__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HOClass__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHOClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__4__Impl"


    // $ANTLR start "rule__HOClass__Group__5"
    // InternalOntoL.g:3525:1: rule__HOClass__Group__5 : rule__HOClass__Group__5__Impl rule__HOClass__Group__6 ;
    public final void rule__HOClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3529:1: ( rule__HOClass__Group__5__Impl rule__HOClass__Group__6 )
            // InternalOntoL.g:3530:2: rule__HOClass__Group__5__Impl rule__HOClass__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__HOClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__5"


    // $ANTLR start "rule__HOClass__Group__5__Impl"
    // InternalOntoL.g:3537:1: rule__HOClass__Group__5__Impl : ( ( rule__HOClass__Group_5__0 )? ) ;
    public final void rule__HOClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3541:1: ( ( ( rule__HOClass__Group_5__0 )? ) )
            // InternalOntoL.g:3542:1: ( ( rule__HOClass__Group_5__0 )? )
            {
            // InternalOntoL.g:3542:1: ( ( rule__HOClass__Group_5__0 )? )
            // InternalOntoL.g:3543:2: ( rule__HOClass__Group_5__0 )?
            {
             before(grammarAccess.getHOClassAccess().getGroup_5()); 
            // InternalOntoL.g:3544:2: ( rule__HOClass__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==37) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOntoL.g:3544:3: rule__HOClass__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HOClass__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHOClassAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__5__Impl"


    // $ANTLR start "rule__HOClass__Group__6"
    // InternalOntoL.g:3552:1: rule__HOClass__Group__6 : rule__HOClass__Group__6__Impl rule__HOClass__Group__7 ;
    public final void rule__HOClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3556:1: ( rule__HOClass__Group__6__Impl rule__HOClass__Group__7 )
            // InternalOntoL.g:3557:2: rule__HOClass__Group__6__Impl rule__HOClass__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__HOClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__6"


    // $ANTLR start "rule__HOClass__Group__6__Impl"
    // InternalOntoL.g:3564:1: rule__HOClass__Group__6__Impl : ( ( rule__HOClass__Group_6__0 )? ) ;
    public final void rule__HOClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3568:1: ( ( ( rule__HOClass__Group_6__0 )? ) )
            // InternalOntoL.g:3569:1: ( ( rule__HOClass__Group_6__0 )? )
            {
            // InternalOntoL.g:3569:1: ( ( rule__HOClass__Group_6__0 )? )
            // InternalOntoL.g:3570:2: ( rule__HOClass__Group_6__0 )?
            {
             before(grammarAccess.getHOClassAccess().getGroup_6()); 
            // InternalOntoL.g:3571:2: ( rule__HOClass__Group_6__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==38) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalOntoL.g:3571:3: rule__HOClass__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HOClass__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHOClassAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__6__Impl"


    // $ANTLR start "rule__HOClass__Group__7"
    // InternalOntoL.g:3579:1: rule__HOClass__Group__7 : rule__HOClass__Group__7__Impl ;
    public final void rule__HOClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3583:1: ( rule__HOClass__Group__7__Impl )
            // InternalOntoL.g:3584:2: rule__HOClass__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__7"


    // $ANTLR start "rule__HOClass__Group__7__Impl"
    // InternalOntoL.g:3590:1: rule__HOClass__Group__7__Impl : ( ( rule__HOClass__Alternatives_7 )? ) ;
    public final void rule__HOClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3594:1: ( ( ( rule__HOClass__Alternatives_7 )? ) )
            // InternalOntoL.g:3595:1: ( ( rule__HOClass__Alternatives_7 )? )
            {
            // InternalOntoL.g:3595:1: ( ( rule__HOClass__Alternatives_7 )? )
            // InternalOntoL.g:3596:2: ( rule__HOClass__Alternatives_7 )?
            {
             before(grammarAccess.getHOClassAccess().getAlternatives_7()); 
            // InternalOntoL.g:3597:2: ( rule__HOClass__Alternatives_7 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=14 && LA44_0<=17)||LA44_0==39) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOntoL.g:3597:3: rule__HOClass__Alternatives_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__HOClass__Alternatives_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHOClassAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__7__Impl"


    // $ANTLR start "rule__HOClass__Group_4__0"
    // InternalOntoL.g:3606:1: rule__HOClass__Group_4__0 : rule__HOClass__Group_4__0__Impl rule__HOClass__Group_4__1 ;
    public final void rule__HOClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3610:1: ( rule__HOClass__Group_4__0__Impl rule__HOClass__Group_4__1 )
            // InternalOntoL.g:3611:2: rule__HOClass__Group_4__0__Impl rule__HOClass__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__HOClass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_4__0"


    // $ANTLR start "rule__HOClass__Group_4__0__Impl"
    // InternalOntoL.g:3618:1: rule__HOClass__Group_4__0__Impl : ( ':' ) ;
    public final void rule__HOClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3622:1: ( ( ':' ) )
            // InternalOntoL.g:3623:1: ( ':' )
            {
            // InternalOntoL.g:3623:1: ( ':' )
            // InternalOntoL.g:3624:2: ':'
            {
             before(grammarAccess.getHOClassAccess().getColonKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getColonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_4__0__Impl"


    // $ANTLR start "rule__HOClass__Group_4__1"
    // InternalOntoL.g:3633:1: rule__HOClass__Group_4__1 : rule__HOClass__Group_4__1__Impl rule__HOClass__Group_4__2 ;
    public final void rule__HOClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3637:1: ( rule__HOClass__Group_4__1__Impl rule__HOClass__Group_4__2 )
            // InternalOntoL.g:3638:2: rule__HOClass__Group_4__1__Impl rule__HOClass__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__HOClass__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_4__1"


    // $ANTLR start "rule__HOClass__Group_4__1__Impl"
    // InternalOntoL.g:3645:1: rule__HOClass__Group_4__1__Impl : ( ( rule__HOClass__InstantiatedClassesAssignment_4_1 ) ) ;
    public final void rule__HOClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3649:1: ( ( ( rule__HOClass__InstantiatedClassesAssignment_4_1 ) ) )
            // InternalOntoL.g:3650:1: ( ( rule__HOClass__InstantiatedClassesAssignment_4_1 ) )
            {
            // InternalOntoL.g:3650:1: ( ( rule__HOClass__InstantiatedClassesAssignment_4_1 ) )
            // InternalOntoL.g:3651:2: ( rule__HOClass__InstantiatedClassesAssignment_4_1 )
            {
             before(grammarAccess.getHOClassAccess().getInstantiatedClassesAssignment_4_1()); 
            // InternalOntoL.g:3652:2: ( rule__HOClass__InstantiatedClassesAssignment_4_1 )
            // InternalOntoL.g:3652:3: rule__HOClass__InstantiatedClassesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__InstantiatedClassesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getInstantiatedClassesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_4__1__Impl"


    // $ANTLR start "rule__HOClass__Group_4__2"
    // InternalOntoL.g:3660:1: rule__HOClass__Group_4__2 : rule__HOClass__Group_4__2__Impl ;
    public final void rule__HOClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3664:1: ( rule__HOClass__Group_4__2__Impl )
            // InternalOntoL.g:3665:2: rule__HOClass__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_4__2"


    // $ANTLR start "rule__HOClass__Group_4__2__Impl"
    // InternalOntoL.g:3671:1: rule__HOClass__Group_4__2__Impl : ( ( rule__HOClass__Group_4_2__0 )* ) ;
    public final void rule__HOClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3675:1: ( ( ( rule__HOClass__Group_4_2__0 )* ) )
            // InternalOntoL.g:3676:1: ( ( rule__HOClass__Group_4_2__0 )* )
            {
            // InternalOntoL.g:3676:1: ( ( rule__HOClass__Group_4_2__0 )* )
            // InternalOntoL.g:3677:2: ( rule__HOClass__Group_4_2__0 )*
            {
             before(grammarAccess.getHOClassAccess().getGroup_4_2()); 
            // InternalOntoL.g:3678:2: ( rule__HOClass__Group_4_2__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==34) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalOntoL.g:3678:3: rule__HOClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__HOClass__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getHOClassAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_4__2__Impl"


    // $ANTLR start "rule__HOClass__Group_4_2__0"
    // InternalOntoL.g:3687:1: rule__HOClass__Group_4_2__0 : rule__HOClass__Group_4_2__0__Impl rule__HOClass__Group_4_2__1 ;
    public final void rule__HOClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3691:1: ( rule__HOClass__Group_4_2__0__Impl rule__HOClass__Group_4_2__1 )
            // InternalOntoL.g:3692:2: rule__HOClass__Group_4_2__0__Impl rule__HOClass__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__HOClass__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_4_2__0"


    // $ANTLR start "rule__HOClass__Group_4_2__0__Impl"
    // InternalOntoL.g:3699:1: rule__HOClass__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__HOClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3703:1: ( ( ',' ) )
            // InternalOntoL.g:3704:1: ( ',' )
            {
            // InternalOntoL.g:3704:1: ( ',' )
            // InternalOntoL.g:3705:2: ','
            {
             before(grammarAccess.getHOClassAccess().getCommaKeyword_4_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_4_2__0__Impl"


    // $ANTLR start "rule__HOClass__Group_4_2__1"
    // InternalOntoL.g:3714:1: rule__HOClass__Group_4_2__1 : rule__HOClass__Group_4_2__1__Impl ;
    public final void rule__HOClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3718:1: ( rule__HOClass__Group_4_2__1__Impl )
            // InternalOntoL.g:3719:2: rule__HOClass__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_4_2__1"


    // $ANTLR start "rule__HOClass__Group_4_2__1__Impl"
    // InternalOntoL.g:3725:1: rule__HOClass__Group_4_2__1__Impl : ( ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 ) ) ;
    public final void rule__HOClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3729:1: ( ( ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 ) ) )
            // InternalOntoL.g:3730:1: ( ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 ) )
            {
            // InternalOntoL.g:3730:1: ( ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 ) )
            // InternalOntoL.g:3731:2: ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 )
            {
             before(grammarAccess.getHOClassAccess().getInstantiatedClassesAssignment_4_2_1()); 
            // InternalOntoL.g:3732:2: ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 )
            // InternalOntoL.g:3732:3: rule__HOClass__InstantiatedClassesAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__InstantiatedClassesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getInstantiatedClassesAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_4_2__1__Impl"


    // $ANTLR start "rule__HOClass__Group_5__0"
    // InternalOntoL.g:3741:1: rule__HOClass__Group_5__0 : rule__HOClass__Group_5__0__Impl rule__HOClass__Group_5__1 ;
    public final void rule__HOClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3745:1: ( rule__HOClass__Group_5__0__Impl rule__HOClass__Group_5__1 )
            // InternalOntoL.g:3746:2: rule__HOClass__Group_5__0__Impl rule__HOClass__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__HOClass__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_5__0"


    // $ANTLR start "rule__HOClass__Group_5__0__Impl"
    // InternalOntoL.g:3753:1: rule__HOClass__Group_5__0__Impl : ( 'specializes' ) ;
    public final void rule__HOClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3757:1: ( ( 'specializes' ) )
            // InternalOntoL.g:3758:1: ( 'specializes' )
            {
            // InternalOntoL.g:3758:1: ( 'specializes' )
            // InternalOntoL.g:3759:2: 'specializes'
            {
             before(grammarAccess.getHOClassAccess().getSpecializesKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getSpecializesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_5__0__Impl"


    // $ANTLR start "rule__HOClass__Group_5__1"
    // InternalOntoL.g:3768:1: rule__HOClass__Group_5__1 : rule__HOClass__Group_5__1__Impl rule__HOClass__Group_5__2 ;
    public final void rule__HOClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3772:1: ( rule__HOClass__Group_5__1__Impl rule__HOClass__Group_5__2 )
            // InternalOntoL.g:3773:2: rule__HOClass__Group_5__1__Impl rule__HOClass__Group_5__2
            {
            pushFollow(FOLLOW_12);
            rule__HOClass__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_5__1"


    // $ANTLR start "rule__HOClass__Group_5__1__Impl"
    // InternalOntoL.g:3780:1: rule__HOClass__Group_5__1__Impl : ( ( rule__HOClass__SuperClassesAssignment_5_1 ) ) ;
    public final void rule__HOClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3784:1: ( ( ( rule__HOClass__SuperClassesAssignment_5_1 ) ) )
            // InternalOntoL.g:3785:1: ( ( rule__HOClass__SuperClassesAssignment_5_1 ) )
            {
            // InternalOntoL.g:3785:1: ( ( rule__HOClass__SuperClassesAssignment_5_1 ) )
            // InternalOntoL.g:3786:2: ( rule__HOClass__SuperClassesAssignment_5_1 )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesAssignment_5_1()); 
            // InternalOntoL.g:3787:2: ( rule__HOClass__SuperClassesAssignment_5_1 )
            // InternalOntoL.g:3787:3: rule__HOClass__SuperClassesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__SuperClassesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getSuperClassesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_5__1__Impl"


    // $ANTLR start "rule__HOClass__Group_5__2"
    // InternalOntoL.g:3795:1: rule__HOClass__Group_5__2 : rule__HOClass__Group_5__2__Impl ;
    public final void rule__HOClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3799:1: ( rule__HOClass__Group_5__2__Impl )
            // InternalOntoL.g:3800:2: rule__HOClass__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_5__2"


    // $ANTLR start "rule__HOClass__Group_5__2__Impl"
    // InternalOntoL.g:3806:1: rule__HOClass__Group_5__2__Impl : ( ( rule__HOClass__Group_5_2__0 )* ) ;
    public final void rule__HOClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3810:1: ( ( ( rule__HOClass__Group_5_2__0 )* ) )
            // InternalOntoL.g:3811:1: ( ( rule__HOClass__Group_5_2__0 )* )
            {
            // InternalOntoL.g:3811:1: ( ( rule__HOClass__Group_5_2__0 )* )
            // InternalOntoL.g:3812:2: ( rule__HOClass__Group_5_2__0 )*
            {
             before(grammarAccess.getHOClassAccess().getGroup_5_2()); 
            // InternalOntoL.g:3813:2: ( rule__HOClass__Group_5_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==34) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalOntoL.g:3813:3: rule__HOClass__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__HOClass__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getHOClassAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_5__2__Impl"


    // $ANTLR start "rule__HOClass__Group_5_2__0"
    // InternalOntoL.g:3822:1: rule__HOClass__Group_5_2__0 : rule__HOClass__Group_5_2__0__Impl rule__HOClass__Group_5_2__1 ;
    public final void rule__HOClass__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3826:1: ( rule__HOClass__Group_5_2__0__Impl rule__HOClass__Group_5_2__1 )
            // InternalOntoL.g:3827:2: rule__HOClass__Group_5_2__0__Impl rule__HOClass__Group_5_2__1
            {
            pushFollow(FOLLOW_3);
            rule__HOClass__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_5_2__0"


    // $ANTLR start "rule__HOClass__Group_5_2__0__Impl"
    // InternalOntoL.g:3834:1: rule__HOClass__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__HOClass__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3838:1: ( ( ',' ) )
            // InternalOntoL.g:3839:1: ( ',' )
            {
            // InternalOntoL.g:3839:1: ( ',' )
            // InternalOntoL.g:3840:2: ','
            {
             before(grammarAccess.getHOClassAccess().getCommaKeyword_5_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_5_2__0__Impl"


    // $ANTLR start "rule__HOClass__Group_5_2__1"
    // InternalOntoL.g:3849:1: rule__HOClass__Group_5_2__1 : rule__HOClass__Group_5_2__1__Impl ;
    public final void rule__HOClass__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3853:1: ( rule__HOClass__Group_5_2__1__Impl )
            // InternalOntoL.g:3854:2: rule__HOClass__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_5_2__1"


    // $ANTLR start "rule__HOClass__Group_5_2__1__Impl"
    // InternalOntoL.g:3860:1: rule__HOClass__Group_5_2__1__Impl : ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) ) ;
    public final void rule__HOClass__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3864:1: ( ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) ) )
            // InternalOntoL.g:3865:1: ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) )
            {
            // InternalOntoL.g:3865:1: ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) )
            // InternalOntoL.g:3866:2: ( rule__HOClass__SuperClassesAssignment_5_2_1 )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesAssignment_5_2_1()); 
            // InternalOntoL.g:3867:2: ( rule__HOClass__SuperClassesAssignment_5_2_1 )
            // InternalOntoL.g:3867:3: rule__HOClass__SuperClassesAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__SuperClassesAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getSuperClassesAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_5_2__1__Impl"


    // $ANTLR start "rule__HOClass__Group_6__0"
    // InternalOntoL.g:3876:1: rule__HOClass__Group_6__0 : rule__HOClass__Group_6__0__Impl rule__HOClass__Group_6__1 ;
    public final void rule__HOClass__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3880:1: ( rule__HOClass__Group_6__0__Impl rule__HOClass__Group_6__1 )
            // InternalOntoL.g:3881:2: rule__HOClass__Group_6__0__Impl rule__HOClass__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__HOClass__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_6__0"


    // $ANTLR start "rule__HOClass__Group_6__0__Impl"
    // InternalOntoL.g:3888:1: rule__HOClass__Group_6__0__Impl : ( 'subordinatedTo' ) ;
    public final void rule__HOClass__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3892:1: ( ( 'subordinatedTo' ) )
            // InternalOntoL.g:3893:1: ( 'subordinatedTo' )
            {
            // InternalOntoL.g:3893:1: ( 'subordinatedTo' )
            // InternalOntoL.g:3894:2: 'subordinatedTo'
            {
             before(grammarAccess.getHOClassAccess().getSubordinatedToKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getSubordinatedToKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_6__0__Impl"


    // $ANTLR start "rule__HOClass__Group_6__1"
    // InternalOntoL.g:3903:1: rule__HOClass__Group_6__1 : rule__HOClass__Group_6__1__Impl rule__HOClass__Group_6__2 ;
    public final void rule__HOClass__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3907:1: ( rule__HOClass__Group_6__1__Impl rule__HOClass__Group_6__2 )
            // InternalOntoL.g:3908:2: rule__HOClass__Group_6__1__Impl rule__HOClass__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__HOClass__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_6__1"


    // $ANTLR start "rule__HOClass__Group_6__1__Impl"
    // InternalOntoL.g:3915:1: rule__HOClass__Group_6__1__Impl : ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) ) ;
    public final void rule__HOClass__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3919:1: ( ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) ) )
            // InternalOntoL.g:3920:1: ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) )
            {
            // InternalOntoL.g:3920:1: ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) )
            // InternalOntoL.g:3921:2: ( rule__HOClass__SubordinatorsAssignment_6_1 )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsAssignment_6_1()); 
            // InternalOntoL.g:3922:2: ( rule__HOClass__SubordinatorsAssignment_6_1 )
            // InternalOntoL.g:3922:3: rule__HOClass__SubordinatorsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__SubordinatorsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getSubordinatorsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_6__1__Impl"


    // $ANTLR start "rule__HOClass__Group_6__2"
    // InternalOntoL.g:3930:1: rule__HOClass__Group_6__2 : rule__HOClass__Group_6__2__Impl ;
    public final void rule__HOClass__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3934:1: ( rule__HOClass__Group_6__2__Impl )
            // InternalOntoL.g:3935:2: rule__HOClass__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_6__2"


    // $ANTLR start "rule__HOClass__Group_6__2__Impl"
    // InternalOntoL.g:3941:1: rule__HOClass__Group_6__2__Impl : ( ( rule__HOClass__Group_6_2__0 )* ) ;
    public final void rule__HOClass__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3945:1: ( ( ( rule__HOClass__Group_6_2__0 )* ) )
            // InternalOntoL.g:3946:1: ( ( rule__HOClass__Group_6_2__0 )* )
            {
            // InternalOntoL.g:3946:1: ( ( rule__HOClass__Group_6_2__0 )* )
            // InternalOntoL.g:3947:2: ( rule__HOClass__Group_6_2__0 )*
            {
             before(grammarAccess.getHOClassAccess().getGroup_6_2()); 
            // InternalOntoL.g:3948:2: ( rule__HOClass__Group_6_2__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==34) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalOntoL.g:3948:3: rule__HOClass__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__HOClass__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getHOClassAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_6__2__Impl"


    // $ANTLR start "rule__HOClass__Group_6_2__0"
    // InternalOntoL.g:3957:1: rule__HOClass__Group_6_2__0 : rule__HOClass__Group_6_2__0__Impl rule__HOClass__Group_6_2__1 ;
    public final void rule__HOClass__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3961:1: ( rule__HOClass__Group_6_2__0__Impl rule__HOClass__Group_6_2__1 )
            // InternalOntoL.g:3962:2: rule__HOClass__Group_6_2__0__Impl rule__HOClass__Group_6_2__1
            {
            pushFollow(FOLLOW_3);
            rule__HOClass__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_6_2__0"


    // $ANTLR start "rule__HOClass__Group_6_2__0__Impl"
    // InternalOntoL.g:3969:1: rule__HOClass__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__HOClass__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3973:1: ( ( ',' ) )
            // InternalOntoL.g:3974:1: ( ',' )
            {
            // InternalOntoL.g:3974:1: ( ',' )
            // InternalOntoL.g:3975:2: ','
            {
             before(grammarAccess.getHOClassAccess().getCommaKeyword_6_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_6_2__0__Impl"


    // $ANTLR start "rule__HOClass__Group_6_2__1"
    // InternalOntoL.g:3984:1: rule__HOClass__Group_6_2__1 : rule__HOClass__Group_6_2__1__Impl ;
    public final void rule__HOClass__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3988:1: ( rule__HOClass__Group_6_2__1__Impl )
            // InternalOntoL.g:3989:2: rule__HOClass__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_6_2__1"


    // $ANTLR start "rule__HOClass__Group_6_2__1__Impl"
    // InternalOntoL.g:3995:1: rule__HOClass__Group_6_2__1__Impl : ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) ) ;
    public final void rule__HOClass__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3999:1: ( ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) ) )
            // InternalOntoL.g:4000:1: ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) )
            {
            // InternalOntoL.g:4000:1: ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) )
            // InternalOntoL.g:4001:2: ( rule__HOClass__SubordinatorsAssignment_6_2_1 )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsAssignment_6_2_1()); 
            // InternalOntoL.g:4002:2: ( rule__HOClass__SubordinatorsAssignment_6_2_1 )
            // InternalOntoL.g:4002:3: rule__HOClass__SubordinatorsAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__SubordinatorsAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getSubordinatorsAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_6_2__1__Impl"


    // $ANTLR start "rule__HOClass__Group_7_0__0"
    // InternalOntoL.g:4011:1: rule__HOClass__Group_7_0__0 : rule__HOClass__Group_7_0__0__Impl rule__HOClass__Group_7_0__1 ;
    public final void rule__HOClass__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4015:1: ( rule__HOClass__Group_7_0__0__Impl rule__HOClass__Group_7_0__1 )
            // InternalOntoL.g:4016:2: rule__HOClass__Group_7_0__0__Impl rule__HOClass__Group_7_0__1
            {
            pushFollow(FOLLOW_3);
            rule__HOClass__Group_7_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group_7_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_7_0__0"


    // $ANTLR start "rule__HOClass__Group_7_0__0__Impl"
    // InternalOntoL.g:4023:1: rule__HOClass__Group_7_0__0__Impl : ( ( rule__HOClass__CategorizationTypeAssignment_7_0_0 ) ) ;
    public final void rule__HOClass__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4027:1: ( ( ( rule__HOClass__CategorizationTypeAssignment_7_0_0 ) ) )
            // InternalOntoL.g:4028:1: ( ( rule__HOClass__CategorizationTypeAssignment_7_0_0 ) )
            {
            // InternalOntoL.g:4028:1: ( ( rule__HOClass__CategorizationTypeAssignment_7_0_0 ) )
            // InternalOntoL.g:4029:2: ( rule__HOClass__CategorizationTypeAssignment_7_0_0 )
            {
             before(grammarAccess.getHOClassAccess().getCategorizationTypeAssignment_7_0_0()); 
            // InternalOntoL.g:4030:2: ( rule__HOClass__CategorizationTypeAssignment_7_0_0 )
            // InternalOntoL.g:4030:3: rule__HOClass__CategorizationTypeAssignment_7_0_0
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__CategorizationTypeAssignment_7_0_0();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getCategorizationTypeAssignment_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_7_0__0__Impl"


    // $ANTLR start "rule__HOClass__Group_7_0__1"
    // InternalOntoL.g:4038:1: rule__HOClass__Group_7_0__1 : rule__HOClass__Group_7_0__1__Impl ;
    public final void rule__HOClass__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4042:1: ( rule__HOClass__Group_7_0__1__Impl )
            // InternalOntoL.g:4043:2: rule__HOClass__Group_7_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__Group_7_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_7_0__1"


    // $ANTLR start "rule__HOClass__Group_7_0__1__Impl"
    // InternalOntoL.g:4049:1: rule__HOClass__Group_7_0__1__Impl : ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) ) ;
    public final void rule__HOClass__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4053:1: ( ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) ) )
            // InternalOntoL.g:4054:1: ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) )
            {
            // InternalOntoL.g:4054:1: ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) )
            // InternalOntoL.g:4055:2: ( rule__HOClass__BasetypeAssignment_7_0_1 )
            {
             before(grammarAccess.getHOClassAccess().getBasetypeAssignment_7_0_1()); 
            // InternalOntoL.g:4056:2: ( rule__HOClass__BasetypeAssignment_7_0_1 )
            // InternalOntoL.g:4056:3: rule__HOClass__BasetypeAssignment_7_0_1
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__BasetypeAssignment_7_0_1();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getBasetypeAssignment_7_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_7_0__1__Impl"


    // $ANTLR start "rule__HOClass__Group_7_1__0"
    // InternalOntoL.g:4065:1: rule__HOClass__Group_7_1__0 : rule__HOClass__Group_7_1__0__Impl rule__HOClass__Group_7_1__1 ;
    public final void rule__HOClass__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4069:1: ( rule__HOClass__Group_7_1__0__Impl rule__HOClass__Group_7_1__1 )
            // InternalOntoL.g:4070:2: rule__HOClass__Group_7_1__0__Impl rule__HOClass__Group_7_1__1
            {
            pushFollow(FOLLOW_3);
            rule__HOClass__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_7_1__0"


    // $ANTLR start "rule__HOClass__Group_7_1__0__Impl"
    // InternalOntoL.g:4077:1: rule__HOClass__Group_7_1__0__Impl : ( 'isPowertypeOf' ) ;
    public final void rule__HOClass__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4081:1: ( ( 'isPowertypeOf' ) )
            // InternalOntoL.g:4082:1: ( 'isPowertypeOf' )
            {
            // InternalOntoL.g:4082:1: ( 'isPowertypeOf' )
            // InternalOntoL.g:4083:2: 'isPowertypeOf'
            {
             before(grammarAccess.getHOClassAccess().getIsPowertypeOfKeyword_7_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getIsPowertypeOfKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_7_1__0__Impl"


    // $ANTLR start "rule__HOClass__Group_7_1__1"
    // InternalOntoL.g:4092:1: rule__HOClass__Group_7_1__1 : rule__HOClass__Group_7_1__1__Impl ;
    public final void rule__HOClass__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4096:1: ( rule__HOClass__Group_7_1__1__Impl )
            // InternalOntoL.g:4097:2: rule__HOClass__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__Group_7_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_7_1__1"


    // $ANTLR start "rule__HOClass__Group_7_1__1__Impl"
    // InternalOntoL.g:4103:1: rule__HOClass__Group_7_1__1__Impl : ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) ) ;
    public final void rule__HOClass__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4107:1: ( ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) ) )
            // InternalOntoL.g:4108:1: ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) )
            {
            // InternalOntoL.g:4108:1: ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) )
            // InternalOntoL.g:4109:2: ( rule__HOClass__PowertypeOfAssignment_7_1_1 )
            {
             before(grammarAccess.getHOClassAccess().getPowertypeOfAssignment_7_1_1()); 
            // InternalOntoL.g:4110:2: ( rule__HOClass__PowertypeOfAssignment_7_1_1 )
            // InternalOntoL.g:4110:3: rule__HOClass__PowertypeOfAssignment_7_1_1
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__PowertypeOfAssignment_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getPowertypeOfAssignment_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group_7_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalOntoL.g:4119:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4123:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalOntoL.g:4124:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalOntoL.g:4131:1: rule__Attribute__Group__0__Impl : ( 'att' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4135:1: ( ( 'att' ) )
            // InternalOntoL.g:4136:1: ( 'att' )
            {
            // InternalOntoL.g:4136:1: ( 'att' )
            // InternalOntoL.g:4137:2: 'att'
            {
             before(grammarAccess.getAttributeAccess().getAttKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalOntoL.g:4146:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4150:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalOntoL.g:4151:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalOntoL.g:4158:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4162:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalOntoL.g:4163:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalOntoL.g:4163:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalOntoL.g:4164:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalOntoL.g:4165:2: ( rule__Attribute__NameAssignment_1 )
            // InternalOntoL.g:4165:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalOntoL.g:4173:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4177:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalOntoL.g:4178:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalOntoL.g:4185:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4189:1: ( ( ':' ) )
            // InternalOntoL.g:4190:1: ( ':' )
            {
            // InternalOntoL.g:4190:1: ( ':' )
            // InternalOntoL.g:4191:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalOntoL.g:4200:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4204:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalOntoL.g:4205:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalOntoL.g:4212:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__Group_3__0 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4216:1: ( ( ( rule__Attribute__Group_3__0 )? ) )
            // InternalOntoL.g:4217:1: ( ( rule__Attribute__Group_3__0 )? )
            {
            // InternalOntoL.g:4217:1: ( ( rule__Attribute__Group_3__0 )? )
            // InternalOntoL.g:4218:2: ( rule__Attribute__Group_3__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_3()); 
            // InternalOntoL.g:4219:2: ( rule__Attribute__Group_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==43) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalOntoL.g:4219:3: rule__Attribute__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalOntoL.g:4227:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4231:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalOntoL.g:4232:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalOntoL.g:4239:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__PropertyTypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4243:1: ( ( ( rule__Attribute__PropertyTypeAssignment_4 ) ) )
            // InternalOntoL.g:4244:1: ( ( rule__Attribute__PropertyTypeAssignment_4 ) )
            {
            // InternalOntoL.g:4244:1: ( ( rule__Attribute__PropertyTypeAssignment_4 ) )
            // InternalOntoL.g:4245:2: ( rule__Attribute__PropertyTypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getPropertyTypeAssignment_4()); 
            // InternalOntoL.g:4246:2: ( rule__Attribute__PropertyTypeAssignment_4 )
            // InternalOntoL.g:4246:3: rule__Attribute__PropertyTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__PropertyTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getPropertyTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalOntoL.g:4254:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4258:1: ( rule__Attribute__Group__5__Impl )
            // InternalOntoL.g:4259:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalOntoL.g:4265:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4269:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalOntoL.g:4270:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalOntoL.g:4270:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalOntoL.g:4271:2: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // InternalOntoL.g:4272:2: ( rule__Attribute__Group_5__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==46) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOntoL.g:4272:3: rule__Attribute__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group_3__0"
    // InternalOntoL.g:4281:1: rule__Attribute__Group_3__0 : rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 ;
    public final void rule__Attribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4285:1: ( rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 )
            // InternalOntoL.g:4286:2: rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1
            {
            pushFollow(FOLLOW_26);
            rule__Attribute__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__0"


    // $ANTLR start "rule__Attribute__Group_3__0__Impl"
    // InternalOntoL.g:4293:1: rule__Attribute__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4297:1: ( ( '[' ) )
            // InternalOntoL.g:4298:1: ( '[' )
            {
            // InternalOntoL.g:4298:1: ( '[' )
            // InternalOntoL.g:4299:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__0__Impl"


    // $ANTLR start "rule__Attribute__Group_3__1"
    // InternalOntoL.g:4308:1: rule__Attribute__Group_3__1 : rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2 ;
    public final void rule__Attribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4312:1: ( rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2 )
            // InternalOntoL.g:4313:2: rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2
            {
            pushFollow(FOLLOW_27);
            rule__Attribute__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__1"


    // $ANTLR start "rule__Attribute__Group_3__1__Impl"
    // InternalOntoL.g:4320:1: rule__Attribute__Group_3__1__Impl : ( ( rule__Attribute__LowerBoundAssignment_3_1 ) ) ;
    public final void rule__Attribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4324:1: ( ( ( rule__Attribute__LowerBoundAssignment_3_1 ) ) )
            // InternalOntoL.g:4325:1: ( ( rule__Attribute__LowerBoundAssignment_3_1 ) )
            {
            // InternalOntoL.g:4325:1: ( ( rule__Attribute__LowerBoundAssignment_3_1 ) )
            // InternalOntoL.g:4326:2: ( rule__Attribute__LowerBoundAssignment_3_1 )
            {
             before(grammarAccess.getAttributeAccess().getLowerBoundAssignment_3_1()); 
            // InternalOntoL.g:4327:2: ( rule__Attribute__LowerBoundAssignment_3_1 )
            // InternalOntoL.g:4327:3: rule__Attribute__LowerBoundAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__LowerBoundAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getLowerBoundAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__1__Impl"


    // $ANTLR start "rule__Attribute__Group_3__2"
    // InternalOntoL.g:4335:1: rule__Attribute__Group_3__2 : rule__Attribute__Group_3__2__Impl rule__Attribute__Group_3__3 ;
    public final void rule__Attribute__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4339:1: ( rule__Attribute__Group_3__2__Impl rule__Attribute__Group_3__3 )
            // InternalOntoL.g:4340:2: rule__Attribute__Group_3__2__Impl rule__Attribute__Group_3__3
            {
            pushFollow(FOLLOW_26);
            rule__Attribute__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__2"


    // $ANTLR start "rule__Attribute__Group_3__2__Impl"
    // InternalOntoL.g:4347:1: rule__Attribute__Group_3__2__Impl : ( '..' ) ;
    public final void rule__Attribute__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4351:1: ( ( '..' ) )
            // InternalOntoL.g:4352:1: ( '..' )
            {
            // InternalOntoL.g:4352:1: ( '..' )
            // InternalOntoL.g:4353:2: '..'
            {
             before(grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_3_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__2__Impl"


    // $ANTLR start "rule__Attribute__Group_3__3"
    // InternalOntoL.g:4362:1: rule__Attribute__Group_3__3 : rule__Attribute__Group_3__3__Impl rule__Attribute__Group_3__4 ;
    public final void rule__Attribute__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4366:1: ( rule__Attribute__Group_3__3__Impl rule__Attribute__Group_3__4 )
            // InternalOntoL.g:4367:2: rule__Attribute__Group_3__3__Impl rule__Attribute__Group_3__4
            {
            pushFollow(FOLLOW_28);
            rule__Attribute__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__3"


    // $ANTLR start "rule__Attribute__Group_3__3__Impl"
    // InternalOntoL.g:4374:1: rule__Attribute__Group_3__3__Impl : ( ( rule__Attribute__UpperBoundAssignment_3_3 ) ) ;
    public final void rule__Attribute__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4378:1: ( ( ( rule__Attribute__UpperBoundAssignment_3_3 ) ) )
            // InternalOntoL.g:4379:1: ( ( rule__Attribute__UpperBoundAssignment_3_3 ) )
            {
            // InternalOntoL.g:4379:1: ( ( rule__Attribute__UpperBoundAssignment_3_3 ) )
            // InternalOntoL.g:4380:2: ( rule__Attribute__UpperBoundAssignment_3_3 )
            {
             before(grammarAccess.getAttributeAccess().getUpperBoundAssignment_3_3()); 
            // InternalOntoL.g:4381:2: ( rule__Attribute__UpperBoundAssignment_3_3 )
            // InternalOntoL.g:4381:3: rule__Attribute__UpperBoundAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__UpperBoundAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getUpperBoundAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__3__Impl"


    // $ANTLR start "rule__Attribute__Group_3__4"
    // InternalOntoL.g:4389:1: rule__Attribute__Group_3__4 : rule__Attribute__Group_3__4__Impl ;
    public final void rule__Attribute__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4393:1: ( rule__Attribute__Group_3__4__Impl )
            // InternalOntoL.g:4394:2: rule__Attribute__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__4"


    // $ANTLR start "rule__Attribute__Group_3__4__Impl"
    // InternalOntoL.g:4400:1: rule__Attribute__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4404:1: ( ( ']' ) )
            // InternalOntoL.g:4405:1: ( ']' )
            {
            // InternalOntoL.g:4405:1: ( ']' )
            // InternalOntoL.g:4406:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__4__Impl"


    // $ANTLR start "rule__Attribute__Group_5__0"
    // InternalOntoL.g:4416:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4420:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalOntoL.g:4421:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__0"


    // $ANTLR start "rule__Attribute__Group_5__0__Impl"
    // InternalOntoL.g:4428:1: rule__Attribute__Group_5__0__Impl : ( 'subsets' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4432:1: ( ( 'subsets' ) )
            // InternalOntoL.g:4433:1: ( 'subsets' )
            {
            // InternalOntoL.g:4433:1: ( 'subsets' )
            // InternalOntoL.g:4434:2: 'subsets'
            {
             before(grammarAccess.getAttributeAccess().getSubsetsKeyword_5_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSubsetsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5__1"
    // InternalOntoL.g:4443:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4447:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // InternalOntoL.g:4448:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__1"


    // $ANTLR start "rule__Attribute__Group_5__1__Impl"
    // InternalOntoL.g:4455:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__SubsetOfAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4459:1: ( ( ( rule__Attribute__SubsetOfAssignment_5_1 ) ) )
            // InternalOntoL.g:4460:1: ( ( rule__Attribute__SubsetOfAssignment_5_1 ) )
            {
            // InternalOntoL.g:4460:1: ( ( rule__Attribute__SubsetOfAssignment_5_1 ) )
            // InternalOntoL.g:4461:2: ( rule__Attribute__SubsetOfAssignment_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAssignment_5_1()); 
            // InternalOntoL.g:4462:2: ( rule__Attribute__SubsetOfAssignment_5_1 )
            // InternalOntoL.g:4462:3: rule__Attribute__SubsetOfAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__SubsetOfAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getSubsetOfAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5__2"
    // InternalOntoL.g:4470:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4474:1: ( rule__Attribute__Group_5__2__Impl )
            // InternalOntoL.g:4475:2: rule__Attribute__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__2"


    // $ANTLR start "rule__Attribute__Group_5__2__Impl"
    // InternalOntoL.g:4481:1: rule__Attribute__Group_5__2__Impl : ( ( rule__Attribute__Group_5_2__0 )* ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4485:1: ( ( ( rule__Attribute__Group_5_2__0 )* ) )
            // InternalOntoL.g:4486:1: ( ( rule__Attribute__Group_5_2__0 )* )
            {
            // InternalOntoL.g:4486:1: ( ( rule__Attribute__Group_5_2__0 )* )
            // InternalOntoL.g:4487:2: ( rule__Attribute__Group_5_2__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_5_2()); 
            // InternalOntoL.g:4488:2: ( rule__Attribute__Group_5_2__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==34) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalOntoL.g:4488:3: rule__Attribute__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Attribute__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__2__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2__0"
    // InternalOntoL.g:4497:1: rule__Attribute__Group_5_2__0 : rule__Attribute__Group_5_2__0__Impl rule__Attribute__Group_5_2__1 ;
    public final void rule__Attribute__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4501:1: ( rule__Attribute__Group_5_2__0__Impl rule__Attribute__Group_5_2__1 )
            // InternalOntoL.g:4502:2: rule__Attribute__Group_5_2__0__Impl rule__Attribute__Group_5_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2__0"


    // $ANTLR start "rule__Attribute__Group_5_2__0__Impl"
    // InternalOntoL.g:4509:1: rule__Attribute__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4513:1: ( ( ',' ) )
            // InternalOntoL.g:4514:1: ( ',' )
            {
            // InternalOntoL.g:4514:1: ( ',' )
            // InternalOntoL.g:4515:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_5_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2__1"
    // InternalOntoL.g:4524:1: rule__Attribute__Group_5_2__1 : rule__Attribute__Group_5_2__1__Impl ;
    public final void rule__Attribute__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4528:1: ( rule__Attribute__Group_5_2__1__Impl )
            // InternalOntoL.g:4529:2: rule__Attribute__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2__1"


    // $ANTLR start "rule__Attribute__Group_5_2__1__Impl"
    // InternalOntoL.g:4535:1: rule__Attribute__Group_5_2__1__Impl : ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) ) ;
    public final void rule__Attribute__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4539:1: ( ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) ) )
            // InternalOntoL.g:4540:1: ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) )
            {
            // InternalOntoL.g:4540:1: ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) )
            // InternalOntoL.g:4541:2: ( rule__Attribute__SubsetOfAssignment_5_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAssignment_5_2_1()); 
            // InternalOntoL.g:4542:2: ( rule__Attribute__SubsetOfAssignment_5_2_1 )
            // InternalOntoL.g:4542:3: rule__Attribute__SubsetOfAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__SubsetOfAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getSubsetOfAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5_2__1__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group__0"
    // InternalOntoL.g:4551:1: rule__RegularityAttribute__Group__0 : rule__RegularityAttribute__Group__0__Impl rule__RegularityAttribute__Group__1 ;
    public final void rule__RegularityAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4555:1: ( rule__RegularityAttribute__Group__0__Impl rule__RegularityAttribute__Group__1 )
            // InternalOntoL.g:4556:2: rule__RegularityAttribute__Group__0__Impl rule__RegularityAttribute__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__RegularityAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__0"


    // $ANTLR start "rule__RegularityAttribute__Group__0__Impl"
    // InternalOntoL.g:4563:1: rule__RegularityAttribute__Group__0__Impl : ( ( rule__RegularityAttribute__RegularityAssignment_0 ) ) ;
    public final void rule__RegularityAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4567:1: ( ( ( rule__RegularityAttribute__RegularityAssignment_0 ) ) )
            // InternalOntoL.g:4568:1: ( ( rule__RegularityAttribute__RegularityAssignment_0 ) )
            {
            // InternalOntoL.g:4568:1: ( ( rule__RegularityAttribute__RegularityAssignment_0 ) )
            // InternalOntoL.g:4569:2: ( rule__RegularityAttribute__RegularityAssignment_0 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegularityAssignment_0()); 
            // InternalOntoL.g:4570:2: ( rule__RegularityAttribute__RegularityAssignment_0 )
            // InternalOntoL.g:4570:3: rule__RegularityAttribute__RegularityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__RegularityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getRegularityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__0__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group__1"
    // InternalOntoL.g:4578:1: rule__RegularityAttribute__Group__1 : rule__RegularityAttribute__Group__1__Impl rule__RegularityAttribute__Group__2 ;
    public final void rule__RegularityAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4582:1: ( rule__RegularityAttribute__Group__1__Impl rule__RegularityAttribute__Group__2 )
            // InternalOntoL.g:4583:2: rule__RegularityAttribute__Group__1__Impl rule__RegularityAttribute__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RegularityAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__1"


    // $ANTLR start "rule__RegularityAttribute__Group__1__Impl"
    // InternalOntoL.g:4590:1: rule__RegularityAttribute__Group__1__Impl : ( 'att' ) ;
    public final void rule__RegularityAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4594:1: ( ( 'att' ) )
            // InternalOntoL.g:4595:1: ( 'att' )
            {
            // InternalOntoL.g:4595:1: ( 'att' )
            // InternalOntoL.g:4596:2: 'att'
            {
             before(grammarAccess.getRegularityAttributeAccess().getAttKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getAttKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__1__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group__2"
    // InternalOntoL.g:4605:1: rule__RegularityAttribute__Group__2 : rule__RegularityAttribute__Group__2__Impl rule__RegularityAttribute__Group__3 ;
    public final void rule__RegularityAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4609:1: ( rule__RegularityAttribute__Group__2__Impl rule__RegularityAttribute__Group__3 )
            // InternalOntoL.g:4610:2: rule__RegularityAttribute__Group__2__Impl rule__RegularityAttribute__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__RegularityAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__2"


    // $ANTLR start "rule__RegularityAttribute__Group__2__Impl"
    // InternalOntoL.g:4617:1: rule__RegularityAttribute__Group__2__Impl : ( ( rule__RegularityAttribute__NameAssignment_2 ) ) ;
    public final void rule__RegularityAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4621:1: ( ( ( rule__RegularityAttribute__NameAssignment_2 ) ) )
            // InternalOntoL.g:4622:1: ( ( rule__RegularityAttribute__NameAssignment_2 ) )
            {
            // InternalOntoL.g:4622:1: ( ( rule__RegularityAttribute__NameAssignment_2 ) )
            // InternalOntoL.g:4623:2: ( rule__RegularityAttribute__NameAssignment_2 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getNameAssignment_2()); 
            // InternalOntoL.g:4624:2: ( rule__RegularityAttribute__NameAssignment_2 )
            // InternalOntoL.g:4624:3: rule__RegularityAttribute__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__2__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group__3"
    // InternalOntoL.g:4632:1: rule__RegularityAttribute__Group__3 : rule__RegularityAttribute__Group__3__Impl rule__RegularityAttribute__Group__4 ;
    public final void rule__RegularityAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4636:1: ( rule__RegularityAttribute__Group__3__Impl rule__RegularityAttribute__Group__4 )
            // InternalOntoL.g:4637:2: rule__RegularityAttribute__Group__3__Impl rule__RegularityAttribute__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__RegularityAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__3"


    // $ANTLR start "rule__RegularityAttribute__Group__3__Impl"
    // InternalOntoL.g:4644:1: rule__RegularityAttribute__Group__3__Impl : ( ':' ) ;
    public final void rule__RegularityAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4648:1: ( ( ':' ) )
            // InternalOntoL.g:4649:1: ( ':' )
            {
            // InternalOntoL.g:4649:1: ( ':' )
            // InternalOntoL.g:4650:2: ':'
            {
             before(grammarAccess.getRegularityAttributeAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__3__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group__4"
    // InternalOntoL.g:4659:1: rule__RegularityAttribute__Group__4 : rule__RegularityAttribute__Group__4__Impl rule__RegularityAttribute__Group__5 ;
    public final void rule__RegularityAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4663:1: ( rule__RegularityAttribute__Group__4__Impl rule__RegularityAttribute__Group__5 )
            // InternalOntoL.g:4664:2: rule__RegularityAttribute__Group__4__Impl rule__RegularityAttribute__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__RegularityAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__4"


    // $ANTLR start "rule__RegularityAttribute__Group__4__Impl"
    // InternalOntoL.g:4671:1: rule__RegularityAttribute__Group__4__Impl : ( ( rule__RegularityAttribute__Group_4__0 )? ) ;
    public final void rule__RegularityAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4675:1: ( ( ( rule__RegularityAttribute__Group_4__0 )? ) )
            // InternalOntoL.g:4676:1: ( ( rule__RegularityAttribute__Group_4__0 )? )
            {
            // InternalOntoL.g:4676:1: ( ( rule__RegularityAttribute__Group_4__0 )? )
            // InternalOntoL.g:4677:2: ( rule__RegularityAttribute__Group_4__0 )?
            {
             before(grammarAccess.getRegularityAttributeAccess().getGroup_4()); 
            // InternalOntoL.g:4678:2: ( rule__RegularityAttribute__Group_4__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==43) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOntoL.g:4678:3: rule__RegularityAttribute__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularityAttribute__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularityAttributeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__4__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group__5"
    // InternalOntoL.g:4686:1: rule__RegularityAttribute__Group__5 : rule__RegularityAttribute__Group__5__Impl rule__RegularityAttribute__Group__6 ;
    public final void rule__RegularityAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4690:1: ( rule__RegularityAttribute__Group__5__Impl rule__RegularityAttribute__Group__6 )
            // InternalOntoL.g:4691:2: rule__RegularityAttribute__Group__5__Impl rule__RegularityAttribute__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__RegularityAttribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__5"


    // $ANTLR start "rule__RegularityAttribute__Group__5__Impl"
    // InternalOntoL.g:4698:1: rule__RegularityAttribute__Group__5__Impl : ( ( rule__RegularityAttribute__PropertyTypeAssignment_5 ) ) ;
    public final void rule__RegularityAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4702:1: ( ( ( rule__RegularityAttribute__PropertyTypeAssignment_5 ) ) )
            // InternalOntoL.g:4703:1: ( ( rule__RegularityAttribute__PropertyTypeAssignment_5 ) )
            {
            // InternalOntoL.g:4703:1: ( ( rule__RegularityAttribute__PropertyTypeAssignment_5 ) )
            // InternalOntoL.g:4704:2: ( rule__RegularityAttribute__PropertyTypeAssignment_5 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getPropertyTypeAssignment_5()); 
            // InternalOntoL.g:4705:2: ( rule__RegularityAttribute__PropertyTypeAssignment_5 )
            // InternalOntoL.g:4705:3: rule__RegularityAttribute__PropertyTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__PropertyTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getPropertyTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__5__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group__6"
    // InternalOntoL.g:4713:1: rule__RegularityAttribute__Group__6 : rule__RegularityAttribute__Group__6__Impl rule__RegularityAttribute__Group__7 ;
    public final void rule__RegularityAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4717:1: ( rule__RegularityAttribute__Group__6__Impl rule__RegularityAttribute__Group__7 )
            // InternalOntoL.g:4718:2: rule__RegularityAttribute__Group__6__Impl rule__RegularityAttribute__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__RegularityAttribute__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__6"


    // $ANTLR start "rule__RegularityAttribute__Group__6__Impl"
    // InternalOntoL.g:4725:1: rule__RegularityAttribute__Group__6__Impl : ( ( rule__RegularityAttribute__Group_6__0 )? ) ;
    public final void rule__RegularityAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4729:1: ( ( ( rule__RegularityAttribute__Group_6__0 )? ) )
            // InternalOntoL.g:4730:1: ( ( rule__RegularityAttribute__Group_6__0 )? )
            {
            // InternalOntoL.g:4730:1: ( ( rule__RegularityAttribute__Group_6__0 )? )
            // InternalOntoL.g:4731:2: ( rule__RegularityAttribute__Group_6__0 )?
            {
             before(grammarAccess.getRegularityAttributeAccess().getGroup_6()); 
            // InternalOntoL.g:4732:2: ( rule__RegularityAttribute__Group_6__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==46) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalOntoL.g:4732:3: rule__RegularityAttribute__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularityAttribute__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularityAttributeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__6__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group__7"
    // InternalOntoL.g:4740:1: rule__RegularityAttribute__Group__7 : rule__RegularityAttribute__Group__7__Impl ;
    public final void rule__RegularityAttribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4744:1: ( rule__RegularityAttribute__Group__7__Impl )
            // InternalOntoL.g:4745:2: rule__RegularityAttribute__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__7"


    // $ANTLR start "rule__RegularityAttribute__Group__7__Impl"
    // InternalOntoL.g:4751:1: rule__RegularityAttribute__Group__7__Impl : ( ( rule__RegularityAttribute__Group_7__0 )? ) ;
    public final void rule__RegularityAttribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4755:1: ( ( ( rule__RegularityAttribute__Group_7__0 )? ) )
            // InternalOntoL.g:4756:1: ( ( rule__RegularityAttribute__Group_7__0 )? )
            {
            // InternalOntoL.g:4756:1: ( ( rule__RegularityAttribute__Group_7__0 )? )
            // InternalOntoL.g:4757:2: ( rule__RegularityAttribute__Group_7__0 )?
            {
             before(grammarAccess.getRegularityAttributeAccess().getGroup_7()); 
            // InternalOntoL.g:4758:2: ( rule__RegularityAttribute__Group_7__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=18 && LA53_0<=23)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalOntoL.g:4758:3: rule__RegularityAttribute__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularityAttribute__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularityAttributeAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__7__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_4__0"
    // InternalOntoL.g:4767:1: rule__RegularityAttribute__Group_4__0 : rule__RegularityAttribute__Group_4__0__Impl rule__RegularityAttribute__Group_4__1 ;
    public final void rule__RegularityAttribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4771:1: ( rule__RegularityAttribute__Group_4__0__Impl rule__RegularityAttribute__Group_4__1 )
            // InternalOntoL.g:4772:2: rule__RegularityAttribute__Group_4__0__Impl rule__RegularityAttribute__Group_4__1
            {
            pushFollow(FOLLOW_26);
            rule__RegularityAttribute__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_4__0"


    // $ANTLR start "rule__RegularityAttribute__Group_4__0__Impl"
    // InternalOntoL.g:4779:1: rule__RegularityAttribute__Group_4__0__Impl : ( '[' ) ;
    public final void rule__RegularityAttribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4783:1: ( ( '[' ) )
            // InternalOntoL.g:4784:1: ( '[' )
            {
            // InternalOntoL.g:4784:1: ( '[' )
            // InternalOntoL.g:4785:2: '['
            {
             before(grammarAccess.getRegularityAttributeAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_4__0__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_4__1"
    // InternalOntoL.g:4794:1: rule__RegularityAttribute__Group_4__1 : rule__RegularityAttribute__Group_4__1__Impl rule__RegularityAttribute__Group_4__2 ;
    public final void rule__RegularityAttribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4798:1: ( rule__RegularityAttribute__Group_4__1__Impl rule__RegularityAttribute__Group_4__2 )
            // InternalOntoL.g:4799:2: rule__RegularityAttribute__Group_4__1__Impl rule__RegularityAttribute__Group_4__2
            {
            pushFollow(FOLLOW_27);
            rule__RegularityAttribute__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_4__1"


    // $ANTLR start "rule__RegularityAttribute__Group_4__1__Impl"
    // InternalOntoL.g:4806:1: rule__RegularityAttribute__Group_4__1__Impl : ( ( rule__RegularityAttribute__LowerBoundAssignment_4_1 ) ) ;
    public final void rule__RegularityAttribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4810:1: ( ( ( rule__RegularityAttribute__LowerBoundAssignment_4_1 ) ) )
            // InternalOntoL.g:4811:1: ( ( rule__RegularityAttribute__LowerBoundAssignment_4_1 ) )
            {
            // InternalOntoL.g:4811:1: ( ( rule__RegularityAttribute__LowerBoundAssignment_4_1 ) )
            // InternalOntoL.g:4812:2: ( rule__RegularityAttribute__LowerBoundAssignment_4_1 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getLowerBoundAssignment_4_1()); 
            // InternalOntoL.g:4813:2: ( rule__RegularityAttribute__LowerBoundAssignment_4_1 )
            // InternalOntoL.g:4813:3: rule__RegularityAttribute__LowerBoundAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__LowerBoundAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getLowerBoundAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_4__1__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_4__2"
    // InternalOntoL.g:4821:1: rule__RegularityAttribute__Group_4__2 : rule__RegularityAttribute__Group_4__2__Impl rule__RegularityAttribute__Group_4__3 ;
    public final void rule__RegularityAttribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4825:1: ( rule__RegularityAttribute__Group_4__2__Impl rule__RegularityAttribute__Group_4__3 )
            // InternalOntoL.g:4826:2: rule__RegularityAttribute__Group_4__2__Impl rule__RegularityAttribute__Group_4__3
            {
            pushFollow(FOLLOW_26);
            rule__RegularityAttribute__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_4__2"


    // $ANTLR start "rule__RegularityAttribute__Group_4__2__Impl"
    // InternalOntoL.g:4833:1: rule__RegularityAttribute__Group_4__2__Impl : ( '..' ) ;
    public final void rule__RegularityAttribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4837:1: ( ( '..' ) )
            // InternalOntoL.g:4838:1: ( '..' )
            {
            // InternalOntoL.g:4838:1: ( '..' )
            // InternalOntoL.g:4839:2: '..'
            {
             before(grammarAccess.getRegularityAttributeAccess().getFullStopFullStopKeyword_4_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getFullStopFullStopKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_4__2__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_4__3"
    // InternalOntoL.g:4848:1: rule__RegularityAttribute__Group_4__3 : rule__RegularityAttribute__Group_4__3__Impl rule__RegularityAttribute__Group_4__4 ;
    public final void rule__RegularityAttribute__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4852:1: ( rule__RegularityAttribute__Group_4__3__Impl rule__RegularityAttribute__Group_4__4 )
            // InternalOntoL.g:4853:2: rule__RegularityAttribute__Group_4__3__Impl rule__RegularityAttribute__Group_4__4
            {
            pushFollow(FOLLOW_28);
            rule__RegularityAttribute__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_4__3"


    // $ANTLR start "rule__RegularityAttribute__Group_4__3__Impl"
    // InternalOntoL.g:4860:1: rule__RegularityAttribute__Group_4__3__Impl : ( ( rule__RegularityAttribute__UpperBoundAssignment_4_3 ) ) ;
    public final void rule__RegularityAttribute__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4864:1: ( ( ( rule__RegularityAttribute__UpperBoundAssignment_4_3 ) ) )
            // InternalOntoL.g:4865:1: ( ( rule__RegularityAttribute__UpperBoundAssignment_4_3 ) )
            {
            // InternalOntoL.g:4865:1: ( ( rule__RegularityAttribute__UpperBoundAssignment_4_3 ) )
            // InternalOntoL.g:4866:2: ( rule__RegularityAttribute__UpperBoundAssignment_4_3 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getUpperBoundAssignment_4_3()); 
            // InternalOntoL.g:4867:2: ( rule__RegularityAttribute__UpperBoundAssignment_4_3 )
            // InternalOntoL.g:4867:3: rule__RegularityAttribute__UpperBoundAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__UpperBoundAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getUpperBoundAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_4__3__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_4__4"
    // InternalOntoL.g:4875:1: rule__RegularityAttribute__Group_4__4 : rule__RegularityAttribute__Group_4__4__Impl ;
    public final void rule__RegularityAttribute__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4879:1: ( rule__RegularityAttribute__Group_4__4__Impl )
            // InternalOntoL.g:4880:2: rule__RegularityAttribute__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_4__4"


    // $ANTLR start "rule__RegularityAttribute__Group_4__4__Impl"
    // InternalOntoL.g:4886:1: rule__RegularityAttribute__Group_4__4__Impl : ( ']' ) ;
    public final void rule__RegularityAttribute__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4890:1: ( ( ']' ) )
            // InternalOntoL.g:4891:1: ( ']' )
            {
            // InternalOntoL.g:4891:1: ( ']' )
            // InternalOntoL.g:4892:2: ']'
            {
             before(grammarAccess.getRegularityAttributeAccess().getRightSquareBracketKeyword_4_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getRightSquareBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_4__4__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_6__0"
    // InternalOntoL.g:4902:1: rule__RegularityAttribute__Group_6__0 : rule__RegularityAttribute__Group_6__0__Impl rule__RegularityAttribute__Group_6__1 ;
    public final void rule__RegularityAttribute__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4906:1: ( rule__RegularityAttribute__Group_6__0__Impl rule__RegularityAttribute__Group_6__1 )
            // InternalOntoL.g:4907:2: rule__RegularityAttribute__Group_6__0__Impl rule__RegularityAttribute__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__RegularityAttribute__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_6__0"


    // $ANTLR start "rule__RegularityAttribute__Group_6__0__Impl"
    // InternalOntoL.g:4914:1: rule__RegularityAttribute__Group_6__0__Impl : ( 'subsets' ) ;
    public final void rule__RegularityAttribute__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4918:1: ( ( 'subsets' ) )
            // InternalOntoL.g:4919:1: ( 'subsets' )
            {
            // InternalOntoL.g:4919:1: ( 'subsets' )
            // InternalOntoL.g:4920:2: 'subsets'
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetsKeyword_6_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getSubsetsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_6__0__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_6__1"
    // InternalOntoL.g:4929:1: rule__RegularityAttribute__Group_6__1 : rule__RegularityAttribute__Group_6__1__Impl rule__RegularityAttribute__Group_6__2 ;
    public final void rule__RegularityAttribute__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4933:1: ( rule__RegularityAttribute__Group_6__1__Impl rule__RegularityAttribute__Group_6__2 )
            // InternalOntoL.g:4934:2: rule__RegularityAttribute__Group_6__1__Impl rule__RegularityAttribute__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__RegularityAttribute__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_6__1"


    // $ANTLR start "rule__RegularityAttribute__Group_6__1__Impl"
    // InternalOntoL.g:4941:1: rule__RegularityAttribute__Group_6__1__Impl : ( ( rule__RegularityAttribute__SubsetOfAssignment_6_1 ) ) ;
    public final void rule__RegularityAttribute__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4945:1: ( ( ( rule__RegularityAttribute__SubsetOfAssignment_6_1 ) ) )
            // InternalOntoL.g:4946:1: ( ( rule__RegularityAttribute__SubsetOfAssignment_6_1 ) )
            {
            // InternalOntoL.g:4946:1: ( ( rule__RegularityAttribute__SubsetOfAssignment_6_1 ) )
            // InternalOntoL.g:4947:2: ( rule__RegularityAttribute__SubsetOfAssignment_6_1 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAssignment_6_1()); 
            // InternalOntoL.g:4948:2: ( rule__RegularityAttribute__SubsetOfAssignment_6_1 )
            // InternalOntoL.g:4948:3: rule__RegularityAttribute__SubsetOfAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__SubsetOfAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getSubsetOfAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_6__1__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_6__2"
    // InternalOntoL.g:4956:1: rule__RegularityAttribute__Group_6__2 : rule__RegularityAttribute__Group_6__2__Impl ;
    public final void rule__RegularityAttribute__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4960:1: ( rule__RegularityAttribute__Group_6__2__Impl )
            // InternalOntoL.g:4961:2: rule__RegularityAttribute__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_6__2"


    // $ANTLR start "rule__RegularityAttribute__Group_6__2__Impl"
    // InternalOntoL.g:4967:1: rule__RegularityAttribute__Group_6__2__Impl : ( ( rule__RegularityAttribute__Group_6_2__0 )* ) ;
    public final void rule__RegularityAttribute__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4971:1: ( ( ( rule__RegularityAttribute__Group_6_2__0 )* ) )
            // InternalOntoL.g:4972:1: ( ( rule__RegularityAttribute__Group_6_2__0 )* )
            {
            // InternalOntoL.g:4972:1: ( ( rule__RegularityAttribute__Group_6_2__0 )* )
            // InternalOntoL.g:4973:2: ( rule__RegularityAttribute__Group_6_2__0 )*
            {
             before(grammarAccess.getRegularityAttributeAccess().getGroup_6_2()); 
            // InternalOntoL.g:4974:2: ( rule__RegularityAttribute__Group_6_2__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==34) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalOntoL.g:4974:3: rule__RegularityAttribute__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__RegularityAttribute__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getRegularityAttributeAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_6__2__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_6_2__0"
    // InternalOntoL.g:4983:1: rule__RegularityAttribute__Group_6_2__0 : rule__RegularityAttribute__Group_6_2__0__Impl rule__RegularityAttribute__Group_6_2__1 ;
    public final void rule__RegularityAttribute__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4987:1: ( rule__RegularityAttribute__Group_6_2__0__Impl rule__RegularityAttribute__Group_6_2__1 )
            // InternalOntoL.g:4988:2: rule__RegularityAttribute__Group_6_2__0__Impl rule__RegularityAttribute__Group_6_2__1
            {
            pushFollow(FOLLOW_3);
            rule__RegularityAttribute__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_6_2__0"


    // $ANTLR start "rule__RegularityAttribute__Group_6_2__0__Impl"
    // InternalOntoL.g:4995:1: rule__RegularityAttribute__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__RegularityAttribute__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4999:1: ( ( ',' ) )
            // InternalOntoL.g:5000:1: ( ',' )
            {
            // InternalOntoL.g:5000:1: ( ',' )
            // InternalOntoL.g:5001:2: ','
            {
             before(grammarAccess.getRegularityAttributeAccess().getCommaKeyword_6_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_6_2__0__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_6_2__1"
    // InternalOntoL.g:5010:1: rule__RegularityAttribute__Group_6_2__1 : rule__RegularityAttribute__Group_6_2__1__Impl ;
    public final void rule__RegularityAttribute__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5014:1: ( rule__RegularityAttribute__Group_6_2__1__Impl )
            // InternalOntoL.g:5015:2: rule__RegularityAttribute__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_6_2__1"


    // $ANTLR start "rule__RegularityAttribute__Group_6_2__1__Impl"
    // InternalOntoL.g:5021:1: rule__RegularityAttribute__Group_6_2__1__Impl : ( ( rule__RegularityAttribute__SubsetOfAssignment_6_2_1 ) ) ;
    public final void rule__RegularityAttribute__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5025:1: ( ( ( rule__RegularityAttribute__SubsetOfAssignment_6_2_1 ) ) )
            // InternalOntoL.g:5026:1: ( ( rule__RegularityAttribute__SubsetOfAssignment_6_2_1 ) )
            {
            // InternalOntoL.g:5026:1: ( ( rule__RegularityAttribute__SubsetOfAssignment_6_2_1 ) )
            // InternalOntoL.g:5027:2: ( rule__RegularityAttribute__SubsetOfAssignment_6_2_1 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAssignment_6_2_1()); 
            // InternalOntoL.g:5028:2: ( rule__RegularityAttribute__SubsetOfAssignment_6_2_1 )
            // InternalOntoL.g:5028:3: rule__RegularityAttribute__SubsetOfAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__SubsetOfAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getSubsetOfAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_6_2__1__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_7__0"
    // InternalOntoL.g:5037:1: rule__RegularityAttribute__Group_7__0 : rule__RegularityAttribute__Group_7__0__Impl rule__RegularityAttribute__Group_7__1 ;
    public final void rule__RegularityAttribute__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5041:1: ( rule__RegularityAttribute__Group_7__0__Impl rule__RegularityAttribute__Group_7__1 )
            // InternalOntoL.g:5042:2: rule__RegularityAttribute__Group_7__0__Impl rule__RegularityAttribute__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__RegularityAttribute__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_7__0"


    // $ANTLR start "rule__RegularityAttribute__Group_7__0__Impl"
    // InternalOntoL.g:5049:1: rule__RegularityAttribute__Group_7__0__Impl : ( ( rule__RegularityAttribute__RegularityTypeAssignment_7_0 ) ) ;
    public final void rule__RegularityAttribute__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5053:1: ( ( ( rule__RegularityAttribute__RegularityTypeAssignment_7_0 ) ) )
            // InternalOntoL.g:5054:1: ( ( rule__RegularityAttribute__RegularityTypeAssignment_7_0 ) )
            {
            // InternalOntoL.g:5054:1: ( ( rule__RegularityAttribute__RegularityTypeAssignment_7_0 ) )
            // InternalOntoL.g:5055:2: ( rule__RegularityAttribute__RegularityTypeAssignment_7_0 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegularityTypeAssignment_7_0()); 
            // InternalOntoL.g:5056:2: ( rule__RegularityAttribute__RegularityTypeAssignment_7_0 )
            // InternalOntoL.g:5056:3: rule__RegularityAttribute__RegularityTypeAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__RegularityTypeAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getRegularityTypeAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_7__0__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_7__1"
    // InternalOntoL.g:5064:1: rule__RegularityAttribute__Group_7__1 : rule__RegularityAttribute__Group_7__1__Impl ;
    public final void rule__RegularityAttribute__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5068:1: ( rule__RegularityAttribute__Group_7__1__Impl )
            // InternalOntoL.g:5069:2: rule__RegularityAttribute__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_7__1"


    // $ANTLR start "rule__RegularityAttribute__Group_7__1__Impl"
    // InternalOntoL.g:5075:1: rule__RegularityAttribute__Group_7__1__Impl : ( ( rule__RegularityAttribute__RegulatedPropertyAssignment_7_1 ) ) ;
    public final void rule__RegularityAttribute__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5079:1: ( ( ( rule__RegularityAttribute__RegulatedPropertyAssignment_7_1 ) ) )
            // InternalOntoL.g:5080:1: ( ( rule__RegularityAttribute__RegulatedPropertyAssignment_7_1 ) )
            {
            // InternalOntoL.g:5080:1: ( ( rule__RegularityAttribute__RegulatedPropertyAssignment_7_1 ) )
            // InternalOntoL.g:5081:2: ( rule__RegularityAttribute__RegulatedPropertyAssignment_7_1 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegulatedPropertyAssignment_7_1()); 
            // InternalOntoL.g:5082:2: ( rule__RegularityAttribute__RegulatedPropertyAssignment_7_1 )
            // InternalOntoL.g:5082:3: rule__RegularityAttribute__RegulatedPropertyAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__RegulatedPropertyAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getRegulatedPropertyAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_7__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalOntoL.g:5091:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5095:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalOntoL.g:5096:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalOntoL.g:5103:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5107:1: ( ( 'ref' ) )
            // InternalOntoL.g:5108:1: ( 'ref' )
            {
            // InternalOntoL.g:5108:1: ( 'ref' )
            // InternalOntoL.g:5109:2: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalOntoL.g:5118:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5122:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalOntoL.g:5123:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalOntoL.g:5130:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5134:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // InternalOntoL.g:5135:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // InternalOntoL.g:5135:1: ( ( rule__Reference__NameAssignment_1 ) )
            // InternalOntoL.g:5136:2: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // InternalOntoL.g:5137:2: ( rule__Reference__NameAssignment_1 )
            // InternalOntoL.g:5137:3: rule__Reference__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // InternalOntoL.g:5145:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5149:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalOntoL.g:5150:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // InternalOntoL.g:5157:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5161:1: ( ( ':' ) )
            // InternalOntoL.g:5162:1: ( ':' )
            {
            // InternalOntoL.g:5162:1: ( ':' )
            // InternalOntoL.g:5163:2: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // InternalOntoL.g:5172:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5176:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // InternalOntoL.g:5177:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // InternalOntoL.g:5184:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__Group_3__0 )? ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5188:1: ( ( ( rule__Reference__Group_3__0 )? ) )
            // InternalOntoL.g:5189:1: ( ( rule__Reference__Group_3__0 )? )
            {
            // InternalOntoL.g:5189:1: ( ( rule__Reference__Group_3__0 )? )
            // InternalOntoL.g:5190:2: ( rule__Reference__Group_3__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_3()); 
            // InternalOntoL.g:5191:2: ( rule__Reference__Group_3__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==43) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalOntoL.g:5191:3: rule__Reference__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // InternalOntoL.g:5199:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5203:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // InternalOntoL.g:5204:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__Reference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // InternalOntoL.g:5211:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__PropertyTypeAssignment_4 ) ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5215:1: ( ( ( rule__Reference__PropertyTypeAssignment_4 ) ) )
            // InternalOntoL.g:5216:1: ( ( rule__Reference__PropertyTypeAssignment_4 ) )
            {
            // InternalOntoL.g:5216:1: ( ( rule__Reference__PropertyTypeAssignment_4 ) )
            // InternalOntoL.g:5217:2: ( rule__Reference__PropertyTypeAssignment_4 )
            {
             before(grammarAccess.getReferenceAccess().getPropertyTypeAssignment_4()); 
            // InternalOntoL.g:5218:2: ( rule__Reference__PropertyTypeAssignment_4 )
            // InternalOntoL.g:5218:3: rule__Reference__PropertyTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Reference__PropertyTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getPropertyTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group__5"
    // InternalOntoL.g:5226:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl rule__Reference__Group__6 ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5230:1: ( rule__Reference__Group__5__Impl rule__Reference__Group__6 )
            // InternalOntoL.g:5231:2: rule__Reference__Group__5__Impl rule__Reference__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Reference__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__5"


    // $ANTLR start "rule__Reference__Group__5__Impl"
    // InternalOntoL.g:5238:1: rule__Reference__Group__5__Impl : ( ( rule__Reference__Group_5__0 )? ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5242:1: ( ( ( rule__Reference__Group_5__0 )? ) )
            // InternalOntoL.g:5243:1: ( ( rule__Reference__Group_5__0 )? )
            {
            // InternalOntoL.g:5243:1: ( ( rule__Reference__Group_5__0 )? )
            // InternalOntoL.g:5244:2: ( rule__Reference__Group_5__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_5()); 
            // InternalOntoL.g:5245:2: ( rule__Reference__Group_5__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==46) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalOntoL.g:5245:3: rule__Reference__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__5__Impl"


    // $ANTLR start "rule__Reference__Group__6"
    // InternalOntoL.g:5253:1: rule__Reference__Group__6 : rule__Reference__Group__6__Impl ;
    public final void rule__Reference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5257:1: ( rule__Reference__Group__6__Impl )
            // InternalOntoL.g:5258:2: rule__Reference__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__6"


    // $ANTLR start "rule__Reference__Group__6__Impl"
    // InternalOntoL.g:5264:1: rule__Reference__Group__6__Impl : ( ( rule__Reference__Group_6__0 )? ) ;
    public final void rule__Reference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5268:1: ( ( ( rule__Reference__Group_6__0 )? ) )
            // InternalOntoL.g:5269:1: ( ( rule__Reference__Group_6__0 )? )
            {
            // InternalOntoL.g:5269:1: ( ( rule__Reference__Group_6__0 )? )
            // InternalOntoL.g:5270:2: ( rule__Reference__Group_6__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_6()); 
            // InternalOntoL.g:5271:2: ( rule__Reference__Group_6__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==48) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalOntoL.g:5271:3: rule__Reference__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__6__Impl"


    // $ANTLR start "rule__Reference__Group_3__0"
    // InternalOntoL.g:5280:1: rule__Reference__Group_3__0 : rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1 ;
    public final void rule__Reference__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5284:1: ( rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1 )
            // InternalOntoL.g:5285:2: rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1
            {
            pushFollow(FOLLOW_26);
            rule__Reference__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__0"


    // $ANTLR start "rule__Reference__Group_3__0__Impl"
    // InternalOntoL.g:5292:1: rule__Reference__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Reference__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5296:1: ( ( '[' ) )
            // InternalOntoL.g:5297:1: ( '[' )
            {
            // InternalOntoL.g:5297:1: ( '[' )
            // InternalOntoL.g:5298:2: '['
            {
             before(grammarAccess.getReferenceAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__0__Impl"


    // $ANTLR start "rule__Reference__Group_3__1"
    // InternalOntoL.g:5307:1: rule__Reference__Group_3__1 : rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2 ;
    public final void rule__Reference__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5311:1: ( rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2 )
            // InternalOntoL.g:5312:2: rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2
            {
            pushFollow(FOLLOW_27);
            rule__Reference__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__1"


    // $ANTLR start "rule__Reference__Group_3__1__Impl"
    // InternalOntoL.g:5319:1: rule__Reference__Group_3__1__Impl : ( ( rule__Reference__LowerBoundAssignment_3_1 ) ) ;
    public final void rule__Reference__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5323:1: ( ( ( rule__Reference__LowerBoundAssignment_3_1 ) ) )
            // InternalOntoL.g:5324:1: ( ( rule__Reference__LowerBoundAssignment_3_1 ) )
            {
            // InternalOntoL.g:5324:1: ( ( rule__Reference__LowerBoundAssignment_3_1 ) )
            // InternalOntoL.g:5325:2: ( rule__Reference__LowerBoundAssignment_3_1 )
            {
             before(grammarAccess.getReferenceAccess().getLowerBoundAssignment_3_1()); 
            // InternalOntoL.g:5326:2: ( rule__Reference__LowerBoundAssignment_3_1 )
            // InternalOntoL.g:5326:3: rule__Reference__LowerBoundAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__LowerBoundAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getLowerBoundAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__1__Impl"


    // $ANTLR start "rule__Reference__Group_3__2"
    // InternalOntoL.g:5334:1: rule__Reference__Group_3__2 : rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3 ;
    public final void rule__Reference__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5338:1: ( rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3 )
            // InternalOntoL.g:5339:2: rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3
            {
            pushFollow(FOLLOW_26);
            rule__Reference__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__2"


    // $ANTLR start "rule__Reference__Group_3__2__Impl"
    // InternalOntoL.g:5346:1: rule__Reference__Group_3__2__Impl : ( '..' ) ;
    public final void rule__Reference__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5350:1: ( ( '..' ) )
            // InternalOntoL.g:5351:1: ( '..' )
            {
            // InternalOntoL.g:5351:1: ( '..' )
            // InternalOntoL.g:5352:2: '..'
            {
             before(grammarAccess.getReferenceAccess().getFullStopFullStopKeyword_3_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getFullStopFullStopKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__2__Impl"


    // $ANTLR start "rule__Reference__Group_3__3"
    // InternalOntoL.g:5361:1: rule__Reference__Group_3__3 : rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4 ;
    public final void rule__Reference__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5365:1: ( rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4 )
            // InternalOntoL.g:5366:2: rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4
            {
            pushFollow(FOLLOW_28);
            rule__Reference__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__3"


    // $ANTLR start "rule__Reference__Group_3__3__Impl"
    // InternalOntoL.g:5373:1: rule__Reference__Group_3__3__Impl : ( ( rule__Reference__UpperBoundAssignment_3_3 ) ) ;
    public final void rule__Reference__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5377:1: ( ( ( rule__Reference__UpperBoundAssignment_3_3 ) ) )
            // InternalOntoL.g:5378:1: ( ( rule__Reference__UpperBoundAssignment_3_3 ) )
            {
            // InternalOntoL.g:5378:1: ( ( rule__Reference__UpperBoundAssignment_3_3 ) )
            // InternalOntoL.g:5379:2: ( rule__Reference__UpperBoundAssignment_3_3 )
            {
             before(grammarAccess.getReferenceAccess().getUpperBoundAssignment_3_3()); 
            // InternalOntoL.g:5380:2: ( rule__Reference__UpperBoundAssignment_3_3 )
            // InternalOntoL.g:5380:3: rule__Reference__UpperBoundAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Reference__UpperBoundAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getUpperBoundAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__3__Impl"


    // $ANTLR start "rule__Reference__Group_3__4"
    // InternalOntoL.g:5388:1: rule__Reference__Group_3__4 : rule__Reference__Group_3__4__Impl ;
    public final void rule__Reference__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5392:1: ( rule__Reference__Group_3__4__Impl )
            // InternalOntoL.g:5393:2: rule__Reference__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__4"


    // $ANTLR start "rule__Reference__Group_3__4__Impl"
    // InternalOntoL.g:5399:1: rule__Reference__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Reference__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5403:1: ( ( ']' ) )
            // InternalOntoL.g:5404:1: ( ']' )
            {
            // InternalOntoL.g:5404:1: ( ']' )
            // InternalOntoL.g:5405:2: ']'
            {
             before(grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__4__Impl"


    // $ANTLR start "rule__Reference__Group_5__0"
    // InternalOntoL.g:5415:1: rule__Reference__Group_5__0 : rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 ;
    public final void rule__Reference__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5419:1: ( rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 )
            // InternalOntoL.g:5420:2: rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_5__0"


    // $ANTLR start "rule__Reference__Group_5__0__Impl"
    // InternalOntoL.g:5427:1: rule__Reference__Group_5__0__Impl : ( 'subsets' ) ;
    public final void rule__Reference__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5431:1: ( ( 'subsets' ) )
            // InternalOntoL.g:5432:1: ( 'subsets' )
            {
            // InternalOntoL.g:5432:1: ( 'subsets' )
            // InternalOntoL.g:5433:2: 'subsets'
            {
             before(grammarAccess.getReferenceAccess().getSubsetsKeyword_5_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getSubsetsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_5__0__Impl"


    // $ANTLR start "rule__Reference__Group_5__1"
    // InternalOntoL.g:5442:1: rule__Reference__Group_5__1 : rule__Reference__Group_5__1__Impl rule__Reference__Group_5__2 ;
    public final void rule__Reference__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5446:1: ( rule__Reference__Group_5__1__Impl rule__Reference__Group_5__2 )
            // InternalOntoL.g:5447:2: rule__Reference__Group_5__1__Impl rule__Reference__Group_5__2
            {
            pushFollow(FOLLOW_12);
            rule__Reference__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_5__1"


    // $ANTLR start "rule__Reference__Group_5__1__Impl"
    // InternalOntoL.g:5454:1: rule__Reference__Group_5__1__Impl : ( ( rule__Reference__SubsetOfAssignment_5_1 ) ) ;
    public final void rule__Reference__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5458:1: ( ( ( rule__Reference__SubsetOfAssignment_5_1 ) ) )
            // InternalOntoL.g:5459:1: ( ( rule__Reference__SubsetOfAssignment_5_1 ) )
            {
            // InternalOntoL.g:5459:1: ( ( rule__Reference__SubsetOfAssignment_5_1 ) )
            // InternalOntoL.g:5460:2: ( rule__Reference__SubsetOfAssignment_5_1 )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfAssignment_5_1()); 
            // InternalOntoL.g:5461:2: ( rule__Reference__SubsetOfAssignment_5_1 )
            // InternalOntoL.g:5461:3: rule__Reference__SubsetOfAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__SubsetOfAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getSubsetOfAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_5__1__Impl"


    // $ANTLR start "rule__Reference__Group_5__2"
    // InternalOntoL.g:5469:1: rule__Reference__Group_5__2 : rule__Reference__Group_5__2__Impl ;
    public final void rule__Reference__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5473:1: ( rule__Reference__Group_5__2__Impl )
            // InternalOntoL.g:5474:2: rule__Reference__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_5__2"


    // $ANTLR start "rule__Reference__Group_5__2__Impl"
    // InternalOntoL.g:5480:1: rule__Reference__Group_5__2__Impl : ( ( rule__Reference__Group_5_2__0 )* ) ;
    public final void rule__Reference__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5484:1: ( ( ( rule__Reference__Group_5_2__0 )* ) )
            // InternalOntoL.g:5485:1: ( ( rule__Reference__Group_5_2__0 )* )
            {
            // InternalOntoL.g:5485:1: ( ( rule__Reference__Group_5_2__0 )* )
            // InternalOntoL.g:5486:2: ( rule__Reference__Group_5_2__0 )*
            {
             before(grammarAccess.getReferenceAccess().getGroup_5_2()); 
            // InternalOntoL.g:5487:2: ( rule__Reference__Group_5_2__0 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==34) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalOntoL.g:5487:3: rule__Reference__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Reference__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

             after(grammarAccess.getReferenceAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_5__2__Impl"


    // $ANTLR start "rule__Reference__Group_5_2__0"
    // InternalOntoL.g:5496:1: rule__Reference__Group_5_2__0 : rule__Reference__Group_5_2__0__Impl rule__Reference__Group_5_2__1 ;
    public final void rule__Reference__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5500:1: ( rule__Reference__Group_5_2__0__Impl rule__Reference__Group_5_2__1 )
            // InternalOntoL.g:5501:2: rule__Reference__Group_5_2__0__Impl rule__Reference__Group_5_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_5_2__0"


    // $ANTLR start "rule__Reference__Group_5_2__0__Impl"
    // InternalOntoL.g:5508:1: rule__Reference__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Reference__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5512:1: ( ( ',' ) )
            // InternalOntoL.g:5513:1: ( ',' )
            {
            // InternalOntoL.g:5513:1: ( ',' )
            // InternalOntoL.g:5514:2: ','
            {
             before(grammarAccess.getReferenceAccess().getCommaKeyword_5_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_5_2__0__Impl"


    // $ANTLR start "rule__Reference__Group_5_2__1"
    // InternalOntoL.g:5523:1: rule__Reference__Group_5_2__1 : rule__Reference__Group_5_2__1__Impl ;
    public final void rule__Reference__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5527:1: ( rule__Reference__Group_5_2__1__Impl )
            // InternalOntoL.g:5528:2: rule__Reference__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_5_2__1"


    // $ANTLR start "rule__Reference__Group_5_2__1__Impl"
    // InternalOntoL.g:5534:1: rule__Reference__Group_5_2__1__Impl : ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) ) ;
    public final void rule__Reference__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5538:1: ( ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) ) )
            // InternalOntoL.g:5539:1: ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) )
            {
            // InternalOntoL.g:5539:1: ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) )
            // InternalOntoL.g:5540:2: ( rule__Reference__SubsetOfAssignment_5_2_1 )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfAssignment_5_2_1()); 
            // InternalOntoL.g:5541:2: ( rule__Reference__SubsetOfAssignment_5_2_1 )
            // InternalOntoL.g:5541:3: rule__Reference__SubsetOfAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__SubsetOfAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getSubsetOfAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_5_2__1__Impl"


    // $ANTLR start "rule__Reference__Group_6__0"
    // InternalOntoL.g:5550:1: rule__Reference__Group_6__0 : rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1 ;
    public final void rule__Reference__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5554:1: ( rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1 )
            // InternalOntoL.g:5555:2: rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_6__0"


    // $ANTLR start "rule__Reference__Group_6__0__Impl"
    // InternalOntoL.g:5562:1: rule__Reference__Group_6__0__Impl : ( 'isOppositeTo' ) ;
    public final void rule__Reference__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5566:1: ( ( 'isOppositeTo' ) )
            // InternalOntoL.g:5567:1: ( 'isOppositeTo' )
            {
            // InternalOntoL.g:5567:1: ( 'isOppositeTo' )
            // InternalOntoL.g:5568:2: 'isOppositeTo'
            {
             before(grammarAccess.getReferenceAccess().getIsOppositeToKeyword_6_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getIsOppositeToKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_6__0__Impl"


    // $ANTLR start "rule__Reference__Group_6__1"
    // InternalOntoL.g:5577:1: rule__Reference__Group_6__1 : rule__Reference__Group_6__1__Impl ;
    public final void rule__Reference__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5581:1: ( rule__Reference__Group_6__1__Impl )
            // InternalOntoL.g:5582:2: rule__Reference__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_6__1"


    // $ANTLR start "rule__Reference__Group_6__1__Impl"
    // InternalOntoL.g:5588:1: rule__Reference__Group_6__1__Impl : ( ( rule__Reference__OppositeToAssignment_6_1 ) ) ;
    public final void rule__Reference__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5592:1: ( ( ( rule__Reference__OppositeToAssignment_6_1 ) ) )
            // InternalOntoL.g:5593:1: ( ( rule__Reference__OppositeToAssignment_6_1 ) )
            {
            // InternalOntoL.g:5593:1: ( ( rule__Reference__OppositeToAssignment_6_1 ) )
            // InternalOntoL.g:5594:2: ( rule__Reference__OppositeToAssignment_6_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeToAssignment_6_1()); 
            // InternalOntoL.g:5595:2: ( rule__Reference__OppositeToAssignment_6_1 )
            // InternalOntoL.g:5595:3: rule__Reference__OppositeToAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__OppositeToAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getOppositeToAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_6__1__Impl"


    // $ANTLR start "rule__RegularityReference__Group__0"
    // InternalOntoL.g:5604:1: rule__RegularityReference__Group__0 : rule__RegularityReference__Group__0__Impl rule__RegularityReference__Group__1 ;
    public final void rule__RegularityReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5608:1: ( rule__RegularityReference__Group__0__Impl rule__RegularityReference__Group__1 )
            // InternalOntoL.g:5609:2: rule__RegularityReference__Group__0__Impl rule__RegularityReference__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__RegularityReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__0"


    // $ANTLR start "rule__RegularityReference__Group__0__Impl"
    // InternalOntoL.g:5616:1: rule__RegularityReference__Group__0__Impl : ( ( rule__RegularityReference__RegularityAssignment_0 ) ) ;
    public final void rule__RegularityReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5620:1: ( ( ( rule__RegularityReference__RegularityAssignment_0 ) ) )
            // InternalOntoL.g:5621:1: ( ( rule__RegularityReference__RegularityAssignment_0 ) )
            {
            // InternalOntoL.g:5621:1: ( ( rule__RegularityReference__RegularityAssignment_0 ) )
            // InternalOntoL.g:5622:2: ( rule__RegularityReference__RegularityAssignment_0 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegularityAssignment_0()); 
            // InternalOntoL.g:5623:2: ( rule__RegularityReference__RegularityAssignment_0 )
            // InternalOntoL.g:5623:3: rule__RegularityReference__RegularityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__RegularityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getRegularityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__0__Impl"


    // $ANTLR start "rule__RegularityReference__Group__1"
    // InternalOntoL.g:5631:1: rule__RegularityReference__Group__1 : rule__RegularityReference__Group__1__Impl rule__RegularityReference__Group__2 ;
    public final void rule__RegularityReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5635:1: ( rule__RegularityReference__Group__1__Impl rule__RegularityReference__Group__2 )
            // InternalOntoL.g:5636:2: rule__RegularityReference__Group__1__Impl rule__RegularityReference__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RegularityReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__1"


    // $ANTLR start "rule__RegularityReference__Group__1__Impl"
    // InternalOntoL.g:5643:1: rule__RegularityReference__Group__1__Impl : ( 'ref' ) ;
    public final void rule__RegularityReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5647:1: ( ( 'ref' ) )
            // InternalOntoL.g:5648:1: ( 'ref' )
            {
            // InternalOntoL.g:5648:1: ( 'ref' )
            // InternalOntoL.g:5649:2: 'ref'
            {
             before(grammarAccess.getRegularityReferenceAccess().getRefKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getRefKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__1__Impl"


    // $ANTLR start "rule__RegularityReference__Group__2"
    // InternalOntoL.g:5658:1: rule__RegularityReference__Group__2 : rule__RegularityReference__Group__2__Impl rule__RegularityReference__Group__3 ;
    public final void rule__RegularityReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5662:1: ( rule__RegularityReference__Group__2__Impl rule__RegularityReference__Group__3 )
            // InternalOntoL.g:5663:2: rule__RegularityReference__Group__2__Impl rule__RegularityReference__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__RegularityReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__2"


    // $ANTLR start "rule__RegularityReference__Group__2__Impl"
    // InternalOntoL.g:5670:1: rule__RegularityReference__Group__2__Impl : ( ( rule__RegularityReference__NameAssignment_2 ) ) ;
    public final void rule__RegularityReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5674:1: ( ( ( rule__RegularityReference__NameAssignment_2 ) ) )
            // InternalOntoL.g:5675:1: ( ( rule__RegularityReference__NameAssignment_2 ) )
            {
            // InternalOntoL.g:5675:1: ( ( rule__RegularityReference__NameAssignment_2 ) )
            // InternalOntoL.g:5676:2: ( rule__RegularityReference__NameAssignment_2 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getNameAssignment_2()); 
            // InternalOntoL.g:5677:2: ( rule__RegularityReference__NameAssignment_2 )
            // InternalOntoL.g:5677:3: rule__RegularityReference__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__2__Impl"


    // $ANTLR start "rule__RegularityReference__Group__3"
    // InternalOntoL.g:5685:1: rule__RegularityReference__Group__3 : rule__RegularityReference__Group__3__Impl rule__RegularityReference__Group__4 ;
    public final void rule__RegularityReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5689:1: ( rule__RegularityReference__Group__3__Impl rule__RegularityReference__Group__4 )
            // InternalOntoL.g:5690:2: rule__RegularityReference__Group__3__Impl rule__RegularityReference__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__RegularityReference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__3"


    // $ANTLR start "rule__RegularityReference__Group__3__Impl"
    // InternalOntoL.g:5697:1: rule__RegularityReference__Group__3__Impl : ( ':' ) ;
    public final void rule__RegularityReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5701:1: ( ( ':' ) )
            // InternalOntoL.g:5702:1: ( ':' )
            {
            // InternalOntoL.g:5702:1: ( ':' )
            // InternalOntoL.g:5703:2: ':'
            {
             before(grammarAccess.getRegularityReferenceAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__3__Impl"


    // $ANTLR start "rule__RegularityReference__Group__4"
    // InternalOntoL.g:5712:1: rule__RegularityReference__Group__4 : rule__RegularityReference__Group__4__Impl rule__RegularityReference__Group__5 ;
    public final void rule__RegularityReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5716:1: ( rule__RegularityReference__Group__4__Impl rule__RegularityReference__Group__5 )
            // InternalOntoL.g:5717:2: rule__RegularityReference__Group__4__Impl rule__RegularityReference__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__RegularityReference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__4"


    // $ANTLR start "rule__RegularityReference__Group__4__Impl"
    // InternalOntoL.g:5724:1: rule__RegularityReference__Group__4__Impl : ( ( rule__RegularityReference__Group_4__0 )? ) ;
    public final void rule__RegularityReference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5728:1: ( ( ( rule__RegularityReference__Group_4__0 )? ) )
            // InternalOntoL.g:5729:1: ( ( rule__RegularityReference__Group_4__0 )? )
            {
            // InternalOntoL.g:5729:1: ( ( rule__RegularityReference__Group_4__0 )? )
            // InternalOntoL.g:5730:2: ( rule__RegularityReference__Group_4__0 )?
            {
             before(grammarAccess.getRegularityReferenceAccess().getGroup_4()); 
            // InternalOntoL.g:5731:2: ( rule__RegularityReference__Group_4__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==43) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalOntoL.g:5731:3: rule__RegularityReference__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularityReference__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularityReferenceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__4__Impl"


    // $ANTLR start "rule__RegularityReference__Group__5"
    // InternalOntoL.g:5739:1: rule__RegularityReference__Group__5 : rule__RegularityReference__Group__5__Impl rule__RegularityReference__Group__6 ;
    public final void rule__RegularityReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5743:1: ( rule__RegularityReference__Group__5__Impl rule__RegularityReference__Group__6 )
            // InternalOntoL.g:5744:2: rule__RegularityReference__Group__5__Impl rule__RegularityReference__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__RegularityReference__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__5"


    // $ANTLR start "rule__RegularityReference__Group__5__Impl"
    // InternalOntoL.g:5751:1: rule__RegularityReference__Group__5__Impl : ( ( rule__RegularityReference__PropertyTypeAssignment_5 ) ) ;
    public final void rule__RegularityReference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5755:1: ( ( ( rule__RegularityReference__PropertyTypeAssignment_5 ) ) )
            // InternalOntoL.g:5756:1: ( ( rule__RegularityReference__PropertyTypeAssignment_5 ) )
            {
            // InternalOntoL.g:5756:1: ( ( rule__RegularityReference__PropertyTypeAssignment_5 ) )
            // InternalOntoL.g:5757:2: ( rule__RegularityReference__PropertyTypeAssignment_5 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getPropertyTypeAssignment_5()); 
            // InternalOntoL.g:5758:2: ( rule__RegularityReference__PropertyTypeAssignment_5 )
            // InternalOntoL.g:5758:3: rule__RegularityReference__PropertyTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__PropertyTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getPropertyTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__5__Impl"


    // $ANTLR start "rule__RegularityReference__Group__6"
    // InternalOntoL.g:5766:1: rule__RegularityReference__Group__6 : rule__RegularityReference__Group__6__Impl rule__RegularityReference__Group__7 ;
    public final void rule__RegularityReference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5770:1: ( rule__RegularityReference__Group__6__Impl rule__RegularityReference__Group__7 )
            // InternalOntoL.g:5771:2: rule__RegularityReference__Group__6__Impl rule__RegularityReference__Group__7
            {
            pushFollow(FOLLOW_33);
            rule__RegularityReference__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__6"


    // $ANTLR start "rule__RegularityReference__Group__6__Impl"
    // InternalOntoL.g:5778:1: rule__RegularityReference__Group__6__Impl : ( ( rule__RegularityReference__Group_6__0 )? ) ;
    public final void rule__RegularityReference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5782:1: ( ( ( rule__RegularityReference__Group_6__0 )? ) )
            // InternalOntoL.g:5783:1: ( ( rule__RegularityReference__Group_6__0 )? )
            {
            // InternalOntoL.g:5783:1: ( ( rule__RegularityReference__Group_6__0 )? )
            // InternalOntoL.g:5784:2: ( rule__RegularityReference__Group_6__0 )?
            {
             before(grammarAccess.getRegularityReferenceAccess().getGroup_6()); 
            // InternalOntoL.g:5785:2: ( rule__RegularityReference__Group_6__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==46) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalOntoL.g:5785:3: rule__RegularityReference__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularityReference__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularityReferenceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__6__Impl"


    // $ANTLR start "rule__RegularityReference__Group__7"
    // InternalOntoL.g:5793:1: rule__RegularityReference__Group__7 : rule__RegularityReference__Group__7__Impl rule__RegularityReference__Group__8 ;
    public final void rule__RegularityReference__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5797:1: ( rule__RegularityReference__Group__7__Impl rule__RegularityReference__Group__8 )
            // InternalOntoL.g:5798:2: rule__RegularityReference__Group__7__Impl rule__RegularityReference__Group__8
            {
            pushFollow(FOLLOW_33);
            rule__RegularityReference__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__7"


    // $ANTLR start "rule__RegularityReference__Group__7__Impl"
    // InternalOntoL.g:5805:1: rule__RegularityReference__Group__7__Impl : ( ( rule__RegularityReference__Group_7__0 )? ) ;
    public final void rule__RegularityReference__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5809:1: ( ( ( rule__RegularityReference__Group_7__0 )? ) )
            // InternalOntoL.g:5810:1: ( ( rule__RegularityReference__Group_7__0 )? )
            {
            // InternalOntoL.g:5810:1: ( ( rule__RegularityReference__Group_7__0 )? )
            // InternalOntoL.g:5811:2: ( rule__RegularityReference__Group_7__0 )?
            {
             before(grammarAccess.getRegularityReferenceAccess().getGroup_7()); 
            // InternalOntoL.g:5812:2: ( rule__RegularityReference__Group_7__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==48) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalOntoL.g:5812:3: rule__RegularityReference__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularityReference__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularityReferenceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__7__Impl"


    // $ANTLR start "rule__RegularityReference__Group__8"
    // InternalOntoL.g:5820:1: rule__RegularityReference__Group__8 : rule__RegularityReference__Group__8__Impl ;
    public final void rule__RegularityReference__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5824:1: ( rule__RegularityReference__Group__8__Impl )
            // InternalOntoL.g:5825:2: rule__RegularityReference__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__8"


    // $ANTLR start "rule__RegularityReference__Group__8__Impl"
    // InternalOntoL.g:5831:1: rule__RegularityReference__Group__8__Impl : ( ( rule__RegularityReference__Group_8__0 )? ) ;
    public final void rule__RegularityReference__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5835:1: ( ( ( rule__RegularityReference__Group_8__0 )? ) )
            // InternalOntoL.g:5836:1: ( ( rule__RegularityReference__Group_8__0 )? )
            {
            // InternalOntoL.g:5836:1: ( ( rule__RegularityReference__Group_8__0 )? )
            // InternalOntoL.g:5837:2: ( rule__RegularityReference__Group_8__0 )?
            {
             before(grammarAccess.getRegularityReferenceAccess().getGroup_8()); 
            // InternalOntoL.g:5838:2: ( rule__RegularityReference__Group_8__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=20 && LA62_0<=23)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalOntoL.g:5838:3: rule__RegularityReference__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularityReference__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularityReferenceAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__8__Impl"


    // $ANTLR start "rule__RegularityReference__Group_4__0"
    // InternalOntoL.g:5847:1: rule__RegularityReference__Group_4__0 : rule__RegularityReference__Group_4__0__Impl rule__RegularityReference__Group_4__1 ;
    public final void rule__RegularityReference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5851:1: ( rule__RegularityReference__Group_4__0__Impl rule__RegularityReference__Group_4__1 )
            // InternalOntoL.g:5852:2: rule__RegularityReference__Group_4__0__Impl rule__RegularityReference__Group_4__1
            {
            pushFollow(FOLLOW_26);
            rule__RegularityReference__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4__0"


    // $ANTLR start "rule__RegularityReference__Group_4__0__Impl"
    // InternalOntoL.g:5859:1: rule__RegularityReference__Group_4__0__Impl : ( '[' ) ;
    public final void rule__RegularityReference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5863:1: ( ( '[' ) )
            // InternalOntoL.g:5864:1: ( '[' )
            {
            // InternalOntoL.g:5864:1: ( '[' )
            // InternalOntoL.g:5865:2: '['
            {
             before(grammarAccess.getRegularityReferenceAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4__0__Impl"


    // $ANTLR start "rule__RegularityReference__Group_4__1"
    // InternalOntoL.g:5874:1: rule__RegularityReference__Group_4__1 : rule__RegularityReference__Group_4__1__Impl rule__RegularityReference__Group_4__2 ;
    public final void rule__RegularityReference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5878:1: ( rule__RegularityReference__Group_4__1__Impl rule__RegularityReference__Group_4__2 )
            // InternalOntoL.g:5879:2: rule__RegularityReference__Group_4__1__Impl rule__RegularityReference__Group_4__2
            {
            pushFollow(FOLLOW_27);
            rule__RegularityReference__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4__1"


    // $ANTLR start "rule__RegularityReference__Group_4__1__Impl"
    // InternalOntoL.g:5886:1: rule__RegularityReference__Group_4__1__Impl : ( ( rule__RegularityReference__LowerBoundAssignment_4_1 ) ) ;
    public final void rule__RegularityReference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5890:1: ( ( ( rule__RegularityReference__LowerBoundAssignment_4_1 ) ) )
            // InternalOntoL.g:5891:1: ( ( rule__RegularityReference__LowerBoundAssignment_4_1 ) )
            {
            // InternalOntoL.g:5891:1: ( ( rule__RegularityReference__LowerBoundAssignment_4_1 ) )
            // InternalOntoL.g:5892:2: ( rule__RegularityReference__LowerBoundAssignment_4_1 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getLowerBoundAssignment_4_1()); 
            // InternalOntoL.g:5893:2: ( rule__RegularityReference__LowerBoundAssignment_4_1 )
            // InternalOntoL.g:5893:3: rule__RegularityReference__LowerBoundAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__LowerBoundAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getLowerBoundAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4__1__Impl"


    // $ANTLR start "rule__RegularityReference__Group_4__2"
    // InternalOntoL.g:5901:1: rule__RegularityReference__Group_4__2 : rule__RegularityReference__Group_4__2__Impl rule__RegularityReference__Group_4__3 ;
    public final void rule__RegularityReference__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5905:1: ( rule__RegularityReference__Group_4__2__Impl rule__RegularityReference__Group_4__3 )
            // InternalOntoL.g:5906:2: rule__RegularityReference__Group_4__2__Impl rule__RegularityReference__Group_4__3
            {
            pushFollow(FOLLOW_26);
            rule__RegularityReference__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4__2"


    // $ANTLR start "rule__RegularityReference__Group_4__2__Impl"
    // InternalOntoL.g:5913:1: rule__RegularityReference__Group_4__2__Impl : ( '..' ) ;
    public final void rule__RegularityReference__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5917:1: ( ( '..' ) )
            // InternalOntoL.g:5918:1: ( '..' )
            {
            // InternalOntoL.g:5918:1: ( '..' )
            // InternalOntoL.g:5919:2: '..'
            {
             before(grammarAccess.getRegularityReferenceAccess().getFullStopFullStopKeyword_4_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getFullStopFullStopKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4__2__Impl"


    // $ANTLR start "rule__RegularityReference__Group_4__3"
    // InternalOntoL.g:5928:1: rule__RegularityReference__Group_4__3 : rule__RegularityReference__Group_4__3__Impl rule__RegularityReference__Group_4__4 ;
    public final void rule__RegularityReference__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5932:1: ( rule__RegularityReference__Group_4__3__Impl rule__RegularityReference__Group_4__4 )
            // InternalOntoL.g:5933:2: rule__RegularityReference__Group_4__3__Impl rule__RegularityReference__Group_4__4
            {
            pushFollow(FOLLOW_28);
            rule__RegularityReference__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4__3"


    // $ANTLR start "rule__RegularityReference__Group_4__3__Impl"
    // InternalOntoL.g:5940:1: rule__RegularityReference__Group_4__3__Impl : ( ( rule__RegularityReference__UpperBoundAssignment_4_3 ) ) ;
    public final void rule__RegularityReference__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5944:1: ( ( ( rule__RegularityReference__UpperBoundAssignment_4_3 ) ) )
            // InternalOntoL.g:5945:1: ( ( rule__RegularityReference__UpperBoundAssignment_4_3 ) )
            {
            // InternalOntoL.g:5945:1: ( ( rule__RegularityReference__UpperBoundAssignment_4_3 ) )
            // InternalOntoL.g:5946:2: ( rule__RegularityReference__UpperBoundAssignment_4_3 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getUpperBoundAssignment_4_3()); 
            // InternalOntoL.g:5947:2: ( rule__RegularityReference__UpperBoundAssignment_4_3 )
            // InternalOntoL.g:5947:3: rule__RegularityReference__UpperBoundAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__UpperBoundAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getUpperBoundAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4__3__Impl"


    // $ANTLR start "rule__RegularityReference__Group_4__4"
    // InternalOntoL.g:5955:1: rule__RegularityReference__Group_4__4 : rule__RegularityReference__Group_4__4__Impl ;
    public final void rule__RegularityReference__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5959:1: ( rule__RegularityReference__Group_4__4__Impl )
            // InternalOntoL.g:5960:2: rule__RegularityReference__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4__4"


    // $ANTLR start "rule__RegularityReference__Group_4__4__Impl"
    // InternalOntoL.g:5966:1: rule__RegularityReference__Group_4__4__Impl : ( ']' ) ;
    public final void rule__RegularityReference__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5970:1: ( ( ']' ) )
            // InternalOntoL.g:5971:1: ( ']' )
            {
            // InternalOntoL.g:5971:1: ( ']' )
            // InternalOntoL.g:5972:2: ']'
            {
             before(grammarAccess.getRegularityReferenceAccess().getRightSquareBracketKeyword_4_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getRightSquareBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4__4__Impl"


    // $ANTLR start "rule__RegularityReference__Group_6__0"
    // InternalOntoL.g:5982:1: rule__RegularityReference__Group_6__0 : rule__RegularityReference__Group_6__0__Impl rule__RegularityReference__Group_6__1 ;
    public final void rule__RegularityReference__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5986:1: ( rule__RegularityReference__Group_6__0__Impl rule__RegularityReference__Group_6__1 )
            // InternalOntoL.g:5987:2: rule__RegularityReference__Group_6__0__Impl rule__RegularityReference__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__RegularityReference__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_6__0"


    // $ANTLR start "rule__RegularityReference__Group_6__0__Impl"
    // InternalOntoL.g:5994:1: rule__RegularityReference__Group_6__0__Impl : ( 'subsets' ) ;
    public final void rule__RegularityReference__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5998:1: ( ( 'subsets' ) )
            // InternalOntoL.g:5999:1: ( 'subsets' )
            {
            // InternalOntoL.g:5999:1: ( 'subsets' )
            // InternalOntoL.g:6000:2: 'subsets'
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetsKeyword_6_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getSubsetsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_6__0__Impl"


    // $ANTLR start "rule__RegularityReference__Group_6__1"
    // InternalOntoL.g:6009:1: rule__RegularityReference__Group_6__1 : rule__RegularityReference__Group_6__1__Impl rule__RegularityReference__Group_6__2 ;
    public final void rule__RegularityReference__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6013:1: ( rule__RegularityReference__Group_6__1__Impl rule__RegularityReference__Group_6__2 )
            // InternalOntoL.g:6014:2: rule__RegularityReference__Group_6__1__Impl rule__RegularityReference__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__RegularityReference__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_6__1"


    // $ANTLR start "rule__RegularityReference__Group_6__1__Impl"
    // InternalOntoL.g:6021:1: rule__RegularityReference__Group_6__1__Impl : ( ( rule__RegularityReference__SubsetOfAssignment_6_1 ) ) ;
    public final void rule__RegularityReference__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6025:1: ( ( ( rule__RegularityReference__SubsetOfAssignment_6_1 ) ) )
            // InternalOntoL.g:6026:1: ( ( rule__RegularityReference__SubsetOfAssignment_6_1 ) )
            {
            // InternalOntoL.g:6026:1: ( ( rule__RegularityReference__SubsetOfAssignment_6_1 ) )
            // InternalOntoL.g:6027:2: ( rule__RegularityReference__SubsetOfAssignment_6_1 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfAssignment_6_1()); 
            // InternalOntoL.g:6028:2: ( rule__RegularityReference__SubsetOfAssignment_6_1 )
            // InternalOntoL.g:6028:3: rule__RegularityReference__SubsetOfAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__SubsetOfAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getSubsetOfAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_6__1__Impl"


    // $ANTLR start "rule__RegularityReference__Group_6__2"
    // InternalOntoL.g:6036:1: rule__RegularityReference__Group_6__2 : rule__RegularityReference__Group_6__2__Impl ;
    public final void rule__RegularityReference__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6040:1: ( rule__RegularityReference__Group_6__2__Impl )
            // InternalOntoL.g:6041:2: rule__RegularityReference__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_6__2"


    // $ANTLR start "rule__RegularityReference__Group_6__2__Impl"
    // InternalOntoL.g:6047:1: rule__RegularityReference__Group_6__2__Impl : ( ( rule__RegularityReference__Group_6_2__0 )* ) ;
    public final void rule__RegularityReference__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6051:1: ( ( ( rule__RegularityReference__Group_6_2__0 )* ) )
            // InternalOntoL.g:6052:1: ( ( rule__RegularityReference__Group_6_2__0 )* )
            {
            // InternalOntoL.g:6052:1: ( ( rule__RegularityReference__Group_6_2__0 )* )
            // InternalOntoL.g:6053:2: ( rule__RegularityReference__Group_6_2__0 )*
            {
             before(grammarAccess.getRegularityReferenceAccess().getGroup_6_2()); 
            // InternalOntoL.g:6054:2: ( rule__RegularityReference__Group_6_2__0 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==34) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalOntoL.g:6054:3: rule__RegularityReference__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__RegularityReference__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

             after(grammarAccess.getRegularityReferenceAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_6__2__Impl"


    // $ANTLR start "rule__RegularityReference__Group_6_2__0"
    // InternalOntoL.g:6063:1: rule__RegularityReference__Group_6_2__0 : rule__RegularityReference__Group_6_2__0__Impl rule__RegularityReference__Group_6_2__1 ;
    public final void rule__RegularityReference__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6067:1: ( rule__RegularityReference__Group_6_2__0__Impl rule__RegularityReference__Group_6_2__1 )
            // InternalOntoL.g:6068:2: rule__RegularityReference__Group_6_2__0__Impl rule__RegularityReference__Group_6_2__1
            {
            pushFollow(FOLLOW_3);
            rule__RegularityReference__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_6_2__0"


    // $ANTLR start "rule__RegularityReference__Group_6_2__0__Impl"
    // InternalOntoL.g:6075:1: rule__RegularityReference__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__RegularityReference__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6079:1: ( ( ',' ) )
            // InternalOntoL.g:6080:1: ( ',' )
            {
            // InternalOntoL.g:6080:1: ( ',' )
            // InternalOntoL.g:6081:2: ','
            {
             before(grammarAccess.getRegularityReferenceAccess().getCommaKeyword_6_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_6_2__0__Impl"


    // $ANTLR start "rule__RegularityReference__Group_6_2__1"
    // InternalOntoL.g:6090:1: rule__RegularityReference__Group_6_2__1 : rule__RegularityReference__Group_6_2__1__Impl ;
    public final void rule__RegularityReference__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6094:1: ( rule__RegularityReference__Group_6_2__1__Impl )
            // InternalOntoL.g:6095:2: rule__RegularityReference__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_6_2__1"


    // $ANTLR start "rule__RegularityReference__Group_6_2__1__Impl"
    // InternalOntoL.g:6101:1: rule__RegularityReference__Group_6_2__1__Impl : ( ( rule__RegularityReference__SubsetOfAssignment_6_2_1 ) ) ;
    public final void rule__RegularityReference__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6105:1: ( ( ( rule__RegularityReference__SubsetOfAssignment_6_2_1 ) ) )
            // InternalOntoL.g:6106:1: ( ( rule__RegularityReference__SubsetOfAssignment_6_2_1 ) )
            {
            // InternalOntoL.g:6106:1: ( ( rule__RegularityReference__SubsetOfAssignment_6_2_1 ) )
            // InternalOntoL.g:6107:2: ( rule__RegularityReference__SubsetOfAssignment_6_2_1 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfAssignment_6_2_1()); 
            // InternalOntoL.g:6108:2: ( rule__RegularityReference__SubsetOfAssignment_6_2_1 )
            // InternalOntoL.g:6108:3: rule__RegularityReference__SubsetOfAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__SubsetOfAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getSubsetOfAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_6_2__1__Impl"


    // $ANTLR start "rule__RegularityReference__Group_7__0"
    // InternalOntoL.g:6117:1: rule__RegularityReference__Group_7__0 : rule__RegularityReference__Group_7__0__Impl rule__RegularityReference__Group_7__1 ;
    public final void rule__RegularityReference__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6121:1: ( rule__RegularityReference__Group_7__0__Impl rule__RegularityReference__Group_7__1 )
            // InternalOntoL.g:6122:2: rule__RegularityReference__Group_7__0__Impl rule__RegularityReference__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__RegularityReference__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_7__0"


    // $ANTLR start "rule__RegularityReference__Group_7__0__Impl"
    // InternalOntoL.g:6129:1: rule__RegularityReference__Group_7__0__Impl : ( 'isOppositeTo' ) ;
    public final void rule__RegularityReference__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6133:1: ( ( 'isOppositeTo' ) )
            // InternalOntoL.g:6134:1: ( 'isOppositeTo' )
            {
            // InternalOntoL.g:6134:1: ( 'isOppositeTo' )
            // InternalOntoL.g:6135:2: 'isOppositeTo'
            {
             before(grammarAccess.getRegularityReferenceAccess().getIsOppositeToKeyword_7_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getIsOppositeToKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_7__0__Impl"


    // $ANTLR start "rule__RegularityReference__Group_7__1"
    // InternalOntoL.g:6144:1: rule__RegularityReference__Group_7__1 : rule__RegularityReference__Group_7__1__Impl ;
    public final void rule__RegularityReference__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6148:1: ( rule__RegularityReference__Group_7__1__Impl )
            // InternalOntoL.g:6149:2: rule__RegularityReference__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_7__1"


    // $ANTLR start "rule__RegularityReference__Group_7__1__Impl"
    // InternalOntoL.g:6155:1: rule__RegularityReference__Group_7__1__Impl : ( ( rule__RegularityReference__OppositeToAssignment_7_1 ) ) ;
    public final void rule__RegularityReference__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6159:1: ( ( ( rule__RegularityReference__OppositeToAssignment_7_1 ) ) )
            // InternalOntoL.g:6160:1: ( ( rule__RegularityReference__OppositeToAssignment_7_1 ) )
            {
            // InternalOntoL.g:6160:1: ( ( rule__RegularityReference__OppositeToAssignment_7_1 ) )
            // InternalOntoL.g:6161:2: ( rule__RegularityReference__OppositeToAssignment_7_1 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getOppositeToAssignment_7_1()); 
            // InternalOntoL.g:6162:2: ( rule__RegularityReference__OppositeToAssignment_7_1 )
            // InternalOntoL.g:6162:3: rule__RegularityReference__OppositeToAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__OppositeToAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getOppositeToAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_7__1__Impl"


    // $ANTLR start "rule__RegularityReference__Group_8__0"
    // InternalOntoL.g:6171:1: rule__RegularityReference__Group_8__0 : rule__RegularityReference__Group_8__0__Impl rule__RegularityReference__Group_8__1 ;
    public final void rule__RegularityReference__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6175:1: ( rule__RegularityReference__Group_8__0__Impl rule__RegularityReference__Group_8__1 )
            // InternalOntoL.g:6176:2: rule__RegularityReference__Group_8__0__Impl rule__RegularityReference__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__RegularityReference__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_8__0"


    // $ANTLR start "rule__RegularityReference__Group_8__0__Impl"
    // InternalOntoL.g:6183:1: rule__RegularityReference__Group_8__0__Impl : ( ( rule__RegularityReference__RegularityTypeAssignment_8_0 ) ) ;
    public final void rule__RegularityReference__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6187:1: ( ( ( rule__RegularityReference__RegularityTypeAssignment_8_0 ) ) )
            // InternalOntoL.g:6188:1: ( ( rule__RegularityReference__RegularityTypeAssignment_8_0 ) )
            {
            // InternalOntoL.g:6188:1: ( ( rule__RegularityReference__RegularityTypeAssignment_8_0 ) )
            // InternalOntoL.g:6189:2: ( rule__RegularityReference__RegularityTypeAssignment_8_0 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegularityTypeAssignment_8_0()); 
            // InternalOntoL.g:6190:2: ( rule__RegularityReference__RegularityTypeAssignment_8_0 )
            // InternalOntoL.g:6190:3: rule__RegularityReference__RegularityTypeAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__RegularityTypeAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getRegularityTypeAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_8__0__Impl"


    // $ANTLR start "rule__RegularityReference__Group_8__1"
    // InternalOntoL.g:6198:1: rule__RegularityReference__Group_8__1 : rule__RegularityReference__Group_8__1__Impl ;
    public final void rule__RegularityReference__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6202:1: ( rule__RegularityReference__Group_8__1__Impl )
            // InternalOntoL.g:6203:2: rule__RegularityReference__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_8__1"


    // $ANTLR start "rule__RegularityReference__Group_8__1__Impl"
    // InternalOntoL.g:6209:1: rule__RegularityReference__Group_8__1__Impl : ( ( rule__RegularityReference__RegulatedPropertyAssignment_8_1 ) ) ;
    public final void rule__RegularityReference__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6213:1: ( ( ( rule__RegularityReference__RegulatedPropertyAssignment_8_1 ) ) )
            // InternalOntoL.g:6214:1: ( ( rule__RegularityReference__RegulatedPropertyAssignment_8_1 ) )
            {
            // InternalOntoL.g:6214:1: ( ( rule__RegularityReference__RegulatedPropertyAssignment_8_1 ) )
            // InternalOntoL.g:6215:2: ( rule__RegularityReference__RegulatedPropertyAssignment_8_1 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegulatedPropertyAssignment_8_1()); 
            // InternalOntoL.g:6216:2: ( rule__RegularityReference__RegulatedPropertyAssignment_8_1 )
            // InternalOntoL.g:6216:3: rule__RegularityReference__RegulatedPropertyAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__RegulatedPropertyAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getRegulatedPropertyAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_8__1__Impl"


    // $ANTLR start "rule__AttributeAssignment__Group__0"
    // InternalOntoL.g:6225:1: rule__AttributeAssignment__Group__0 : rule__AttributeAssignment__Group__0__Impl rule__AttributeAssignment__Group__1 ;
    public final void rule__AttributeAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6229:1: ( rule__AttributeAssignment__Group__0__Impl rule__AttributeAssignment__Group__1 )
            // InternalOntoL.g:6230:2: rule__AttributeAssignment__Group__0__Impl rule__AttributeAssignment__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AttributeAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group__0"


    // $ANTLR start "rule__AttributeAssignment__Group__0__Impl"
    // InternalOntoL.g:6237:1: rule__AttributeAssignment__Group__0__Impl : ( 'att' ) ;
    public final void rule__AttributeAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6241:1: ( ( 'att' ) )
            // InternalOntoL.g:6242:1: ( 'att' )
            {
            // InternalOntoL.g:6242:1: ( 'att' )
            // InternalOntoL.g:6243:2: 'att'
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAttKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAttributeAssignmentAccess().getAttKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group__0__Impl"


    // $ANTLR start "rule__AttributeAssignment__Group__1"
    // InternalOntoL.g:6252:1: rule__AttributeAssignment__Group__1 : rule__AttributeAssignment__Group__1__Impl rule__AttributeAssignment__Group__2 ;
    public final void rule__AttributeAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6256:1: ( rule__AttributeAssignment__Group__1__Impl rule__AttributeAssignment__Group__2 )
            // InternalOntoL.g:6257:2: rule__AttributeAssignment__Group__1__Impl rule__AttributeAssignment__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__AttributeAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group__1"


    // $ANTLR start "rule__AttributeAssignment__Group__1__Impl"
    // InternalOntoL.g:6264:1: rule__AttributeAssignment__Group__1__Impl : ( ( rule__AttributeAssignment__AttributeAssignment_1 ) ) ;
    public final void rule__AttributeAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6268:1: ( ( ( rule__AttributeAssignment__AttributeAssignment_1 ) ) )
            // InternalOntoL.g:6269:1: ( ( rule__AttributeAssignment__AttributeAssignment_1 ) )
            {
            // InternalOntoL.g:6269:1: ( ( rule__AttributeAssignment__AttributeAssignment_1 ) )
            // InternalOntoL.g:6270:2: ( rule__AttributeAssignment__AttributeAssignment_1 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAttributeAssignment_1()); 
            // InternalOntoL.g:6271:2: ( rule__AttributeAssignment__AttributeAssignment_1 )
            // InternalOntoL.g:6271:3: rule__AttributeAssignment__AttributeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAssignmentAccess().getAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group__1__Impl"


    // $ANTLR start "rule__AttributeAssignment__Group__2"
    // InternalOntoL.g:6279:1: rule__AttributeAssignment__Group__2 : rule__AttributeAssignment__Group__2__Impl rule__AttributeAssignment__Group__3 ;
    public final void rule__AttributeAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6283:1: ( rule__AttributeAssignment__Group__2__Impl rule__AttributeAssignment__Group__3 )
            // InternalOntoL.g:6284:2: rule__AttributeAssignment__Group__2__Impl rule__AttributeAssignment__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__AttributeAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group__2"


    // $ANTLR start "rule__AttributeAssignment__Group__2__Impl"
    // InternalOntoL.g:6291:1: rule__AttributeAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__AttributeAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6295:1: ( ( '=' ) )
            // InternalOntoL.g:6296:1: ( '=' )
            {
            // InternalOntoL.g:6296:1: ( '=' )
            // InternalOntoL.g:6297:2: '='
            {
             before(grammarAccess.getAttributeAssignmentAccess().getEqualsSignKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAttributeAssignmentAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group__2__Impl"


    // $ANTLR start "rule__AttributeAssignment__Group__3"
    // InternalOntoL.g:6306:1: rule__AttributeAssignment__Group__3 : rule__AttributeAssignment__Group__3__Impl ;
    public final void rule__AttributeAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6310:1: ( rule__AttributeAssignment__Group__3__Impl )
            // InternalOntoL.g:6311:2: rule__AttributeAssignment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group__3"


    // $ANTLR start "rule__AttributeAssignment__Group__3__Impl"
    // InternalOntoL.g:6317:1: rule__AttributeAssignment__Group__3__Impl : ( ( rule__AttributeAssignment__Alternatives_3 ) ) ;
    public final void rule__AttributeAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6321:1: ( ( ( rule__AttributeAssignment__Alternatives_3 ) ) )
            // InternalOntoL.g:6322:1: ( ( rule__AttributeAssignment__Alternatives_3 ) )
            {
            // InternalOntoL.g:6322:1: ( ( rule__AttributeAssignment__Alternatives_3 ) )
            // InternalOntoL.g:6323:2: ( rule__AttributeAssignment__Alternatives_3 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAlternatives_3()); 
            // InternalOntoL.g:6324:2: ( rule__AttributeAssignment__Alternatives_3 )
            // InternalOntoL.g:6324:3: rule__AttributeAssignment__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAssignmentAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group__3__Impl"


    // $ANTLR start "rule__AttributeAssignment__Group_3_1__0"
    // InternalOntoL.g:6333:1: rule__AttributeAssignment__Group_3_1__0 : rule__AttributeAssignment__Group_3_1__0__Impl rule__AttributeAssignment__Group_3_1__1 ;
    public final void rule__AttributeAssignment__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6337:1: ( rule__AttributeAssignment__Group_3_1__0__Impl rule__AttributeAssignment__Group_3_1__1 )
            // InternalOntoL.g:6338:2: rule__AttributeAssignment__Group_3_1__0__Impl rule__AttributeAssignment__Group_3_1__1
            {
            pushFollow(FOLLOW_36);
            rule__AttributeAssignment__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group_3_1__0"


    // $ANTLR start "rule__AttributeAssignment__Group_3_1__0__Impl"
    // InternalOntoL.g:6345:1: rule__AttributeAssignment__Group_3_1__0__Impl : ( '{' ) ;
    public final void rule__AttributeAssignment__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6349:1: ( ( '{' ) )
            // InternalOntoL.g:6350:1: ( '{' )
            {
            // InternalOntoL.g:6350:1: ( '{' )
            // InternalOntoL.g:6351:2: '{'
            {
             before(grammarAccess.getAttributeAssignmentAccess().getLeftCurlyBracketKeyword_3_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAttributeAssignmentAccess().getLeftCurlyBracketKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group_3_1__0__Impl"


    // $ANTLR start "rule__AttributeAssignment__Group_3_1__1"
    // InternalOntoL.g:6360:1: rule__AttributeAssignment__Group_3_1__1 : rule__AttributeAssignment__Group_3_1__1__Impl rule__AttributeAssignment__Group_3_1__2 ;
    public final void rule__AttributeAssignment__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6364:1: ( rule__AttributeAssignment__Group_3_1__1__Impl rule__AttributeAssignment__Group_3_1__2 )
            // InternalOntoL.g:6365:2: rule__AttributeAssignment__Group_3_1__1__Impl rule__AttributeAssignment__Group_3_1__2
            {
            pushFollow(FOLLOW_37);
            rule__AttributeAssignment__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group_3_1__1"


    // $ANTLR start "rule__AttributeAssignment__Group_3_1__1__Impl"
    // InternalOntoL.g:6372:1: rule__AttributeAssignment__Group_3_1__1__Impl : ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 ) ) ;
    public final void rule__AttributeAssignment__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6376:1: ( ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 ) ) )
            // InternalOntoL.g:6377:1: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 ) )
            {
            // InternalOntoL.g:6377:1: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 ) )
            // InternalOntoL.g:6378:2: ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAssignmentsAssignment_3_1_1()); 
            // InternalOntoL.g:6379:2: ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 )
            // InternalOntoL.g:6379:3: rule__AttributeAssignment__AssignmentsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__AssignmentsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAssignmentAccess().getAssignmentsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group_3_1__1__Impl"


    // $ANTLR start "rule__AttributeAssignment__Group_3_1__2"
    // InternalOntoL.g:6387:1: rule__AttributeAssignment__Group_3_1__2 : rule__AttributeAssignment__Group_3_1__2__Impl rule__AttributeAssignment__Group_3_1__3 ;
    public final void rule__AttributeAssignment__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6391:1: ( rule__AttributeAssignment__Group_3_1__2__Impl rule__AttributeAssignment__Group_3_1__3 )
            // InternalOntoL.g:6392:2: rule__AttributeAssignment__Group_3_1__2__Impl rule__AttributeAssignment__Group_3_1__3
            {
            pushFollow(FOLLOW_37);
            rule__AttributeAssignment__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__Group_3_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group_3_1__2"


    // $ANTLR start "rule__AttributeAssignment__Group_3_1__2__Impl"
    // InternalOntoL.g:6399:1: rule__AttributeAssignment__Group_3_1__2__Impl : ( ( rule__AttributeAssignment__Group_3_1_2__0 )* ) ;
    public final void rule__AttributeAssignment__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6403:1: ( ( ( rule__AttributeAssignment__Group_3_1_2__0 )* ) )
            // InternalOntoL.g:6404:1: ( ( rule__AttributeAssignment__Group_3_1_2__0 )* )
            {
            // InternalOntoL.g:6404:1: ( ( rule__AttributeAssignment__Group_3_1_2__0 )* )
            // InternalOntoL.g:6405:2: ( rule__AttributeAssignment__Group_3_1_2__0 )*
            {
             before(grammarAccess.getAttributeAssignmentAccess().getGroup_3_1_2()); 
            // InternalOntoL.g:6406:2: ( rule__AttributeAssignment__Group_3_1_2__0 )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==34) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalOntoL.g:6406:3: rule__AttributeAssignment__Group_3_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AttributeAssignment__Group_3_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

             after(grammarAccess.getAttributeAssignmentAccess().getGroup_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group_3_1__2__Impl"


    // $ANTLR start "rule__AttributeAssignment__Group_3_1__3"
    // InternalOntoL.g:6414:1: rule__AttributeAssignment__Group_3_1__3 : rule__AttributeAssignment__Group_3_1__3__Impl ;
    public final void rule__AttributeAssignment__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6418:1: ( rule__AttributeAssignment__Group_3_1__3__Impl )
            // InternalOntoL.g:6419:2: rule__AttributeAssignment__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__Group_3_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group_3_1__3"


    // $ANTLR start "rule__AttributeAssignment__Group_3_1__3__Impl"
    // InternalOntoL.g:6425:1: rule__AttributeAssignment__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__AttributeAssignment__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6429:1: ( ( '}' ) )
            // InternalOntoL.g:6430:1: ( '}' )
            {
            // InternalOntoL.g:6430:1: ( '}' )
            // InternalOntoL.g:6431:2: '}'
            {
             before(grammarAccess.getAttributeAssignmentAccess().getRightCurlyBracketKeyword_3_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttributeAssignmentAccess().getRightCurlyBracketKeyword_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group_3_1__3__Impl"


    // $ANTLR start "rule__AttributeAssignment__Group_3_1_2__0"
    // InternalOntoL.g:6441:1: rule__AttributeAssignment__Group_3_1_2__0 : rule__AttributeAssignment__Group_3_1_2__0__Impl rule__AttributeAssignment__Group_3_1_2__1 ;
    public final void rule__AttributeAssignment__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6445:1: ( rule__AttributeAssignment__Group_3_1_2__0__Impl rule__AttributeAssignment__Group_3_1_2__1 )
            // InternalOntoL.g:6446:2: rule__AttributeAssignment__Group_3_1_2__0__Impl rule__AttributeAssignment__Group_3_1_2__1
            {
            pushFollow(FOLLOW_36);
            rule__AttributeAssignment__Group_3_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__Group_3_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group_3_1_2__0"


    // $ANTLR start "rule__AttributeAssignment__Group_3_1_2__0__Impl"
    // InternalOntoL.g:6453:1: rule__AttributeAssignment__Group_3_1_2__0__Impl : ( ',' ) ;
    public final void rule__AttributeAssignment__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6457:1: ( ( ',' ) )
            // InternalOntoL.g:6458:1: ( ',' )
            {
            // InternalOntoL.g:6458:1: ( ',' )
            // InternalOntoL.g:6459:2: ','
            {
             before(grammarAccess.getAttributeAssignmentAccess().getCommaKeyword_3_1_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAttributeAssignmentAccess().getCommaKeyword_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group_3_1_2__0__Impl"


    // $ANTLR start "rule__AttributeAssignment__Group_3_1_2__1"
    // InternalOntoL.g:6468:1: rule__AttributeAssignment__Group_3_1_2__1 : rule__AttributeAssignment__Group_3_1_2__1__Impl ;
    public final void rule__AttributeAssignment__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6472:1: ( rule__AttributeAssignment__Group_3_1_2__1__Impl )
            // InternalOntoL.g:6473:2: rule__AttributeAssignment__Group_3_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__Group_3_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group_3_1_2__1"


    // $ANTLR start "rule__AttributeAssignment__Group_3_1_2__1__Impl"
    // InternalOntoL.g:6479:1: rule__AttributeAssignment__Group_3_1_2__1__Impl : ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 ) ) ;
    public final void rule__AttributeAssignment__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6483:1: ( ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 ) ) )
            // InternalOntoL.g:6484:1: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 ) )
            {
            // InternalOntoL.g:6484:1: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 ) )
            // InternalOntoL.g:6485:2: ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAssignmentsAssignment_3_1_2_1()); 
            // InternalOntoL.g:6486:2: ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 )
            // InternalOntoL.g:6486:3: rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAssignmentAccess().getAssignmentsAssignment_3_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__Group_3_1_2__1__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group__0"
    // InternalOntoL.g:6495:1: rule__SimpleAttributeAssignment__Group__0 : rule__SimpleAttributeAssignment__Group__0__Impl rule__SimpleAttributeAssignment__Group__1 ;
    public final void rule__SimpleAttributeAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6499:1: ( rule__SimpleAttributeAssignment__Group__0__Impl rule__SimpleAttributeAssignment__Group__1 )
            // InternalOntoL.g:6500:2: rule__SimpleAttributeAssignment__Group__0__Impl rule__SimpleAttributeAssignment__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__SimpleAttributeAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Group__0"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group__0__Impl"
    // InternalOntoL.g:6507:1: rule__SimpleAttributeAssignment__Group__0__Impl : ( ( rule__SimpleAttributeAssignment__AttributeAssignment_0 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6511:1: ( ( ( rule__SimpleAttributeAssignment__AttributeAssignment_0 ) ) )
            // InternalOntoL.g:6512:1: ( ( rule__SimpleAttributeAssignment__AttributeAssignment_0 ) )
            {
            // InternalOntoL.g:6512:1: ( ( rule__SimpleAttributeAssignment__AttributeAssignment_0 ) )
            // InternalOntoL.g:6513:2: ( rule__SimpleAttributeAssignment__AttributeAssignment_0 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAttributeAssignment_0()); 
            // InternalOntoL.g:6514:2: ( rule__SimpleAttributeAssignment__AttributeAssignment_0 )
            // InternalOntoL.g:6514:3: rule__SimpleAttributeAssignment__AttributeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getAttributeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Group__0__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group__1"
    // InternalOntoL.g:6522:1: rule__SimpleAttributeAssignment__Group__1 : rule__SimpleAttributeAssignment__Group__1__Impl rule__SimpleAttributeAssignment__Group__2 ;
    public final void rule__SimpleAttributeAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6526:1: ( rule__SimpleAttributeAssignment__Group__1__Impl rule__SimpleAttributeAssignment__Group__2 )
            // InternalOntoL.g:6527:2: rule__SimpleAttributeAssignment__Group__1__Impl rule__SimpleAttributeAssignment__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__SimpleAttributeAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Group__1"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group__1__Impl"
    // InternalOntoL.g:6534:1: rule__SimpleAttributeAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__SimpleAttributeAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6538:1: ( ( '=' ) )
            // InternalOntoL.g:6539:1: ( '=' )
            {
            // InternalOntoL.g:6539:1: ( '=' )
            // InternalOntoL.g:6540:2: '='
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSimpleAttributeAssignmentAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Group__1__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group__2"
    // InternalOntoL.g:6549:1: rule__SimpleAttributeAssignment__Group__2 : rule__SimpleAttributeAssignment__Group__2__Impl ;
    public final void rule__SimpleAttributeAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6553:1: ( rule__SimpleAttributeAssignment__Group__2__Impl )
            // InternalOntoL.g:6554:2: rule__SimpleAttributeAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Group__2"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group__2__Impl"
    // InternalOntoL.g:6560:1: rule__SimpleAttributeAssignment__Group__2__Impl : ( ( rule__SimpleAttributeAssignment__Alternatives_2 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6564:1: ( ( ( rule__SimpleAttributeAssignment__Alternatives_2 ) ) )
            // InternalOntoL.g:6565:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2 ) )
            {
            // InternalOntoL.g:6565:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2 ) )
            // InternalOntoL.g:6566:2: ( rule__SimpleAttributeAssignment__Alternatives_2 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAlternatives_2()); 
            // InternalOntoL.g:6567:2: ( rule__SimpleAttributeAssignment__Alternatives_2 )
            // InternalOntoL.g:6567:3: rule__SimpleAttributeAssignment__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Group__2__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_1__0"
    // InternalOntoL.g:6576:1: rule__SimpleAttributeAssignment__Group_2_1__0 : rule__SimpleAttributeAssignment__Group_2_1__0__Impl rule__SimpleAttributeAssignment__Group_2_1__1 ;
    public final void rule__SimpleAttributeAssignment__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6580:1: ( rule__SimpleAttributeAssignment__Group_2_1__0__Impl rule__SimpleAttributeAssignment__Group_2_1__1 )
            // InternalOntoL.g:6581:2: rule__SimpleAttributeAssignment__Group_2_1__0__Impl rule__SimpleAttributeAssignment__Group_2_1__1
            {
            pushFollow(FOLLOW_36);
            rule__SimpleAttributeAssignment__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_1__0"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_1__0__Impl"
    // InternalOntoL.g:6588:1: rule__SimpleAttributeAssignment__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6592:1: ( ( '{' ) )
            // InternalOntoL.g:6593:1: ( '{' )
            {
            // InternalOntoL.g:6593:1: ( '{' )
            // InternalOntoL.g:6594:2: '{'
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSimpleAttributeAssignmentAccess().getLeftCurlyBracketKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_1__0__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_1__1"
    // InternalOntoL.g:6603:1: rule__SimpleAttributeAssignment__Group_2_1__1 : rule__SimpleAttributeAssignment__Group_2_1__1__Impl rule__SimpleAttributeAssignment__Group_2_1__2 ;
    public final void rule__SimpleAttributeAssignment__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6607:1: ( rule__SimpleAttributeAssignment__Group_2_1__1__Impl rule__SimpleAttributeAssignment__Group_2_1__2 )
            // InternalOntoL.g:6608:2: rule__SimpleAttributeAssignment__Group_2_1__1__Impl rule__SimpleAttributeAssignment__Group_2_1__2
            {
            pushFollow(FOLLOW_37);
            rule__SimpleAttributeAssignment__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_1__1"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_1__1__Impl"
    // InternalOntoL.g:6615:1: rule__SimpleAttributeAssignment__Group_2_1__1__Impl : ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6619:1: ( ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1 ) ) )
            // InternalOntoL.g:6620:1: ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1 ) )
            {
            // InternalOntoL.g:6620:1: ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1 ) )
            // InternalOntoL.g:6621:2: ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAssignmentsAssignment_2_1_1()); 
            // InternalOntoL.g:6622:2: ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1 )
            // InternalOntoL.g:6622:3: rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getAssignmentsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_1__1__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_1__2"
    // InternalOntoL.g:6630:1: rule__SimpleAttributeAssignment__Group_2_1__2 : rule__SimpleAttributeAssignment__Group_2_1__2__Impl rule__SimpleAttributeAssignment__Group_2_1__3 ;
    public final void rule__SimpleAttributeAssignment__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6634:1: ( rule__SimpleAttributeAssignment__Group_2_1__2__Impl rule__SimpleAttributeAssignment__Group_2_1__3 )
            // InternalOntoL.g:6635:2: rule__SimpleAttributeAssignment__Group_2_1__2__Impl rule__SimpleAttributeAssignment__Group_2_1__3
            {
            pushFollow(FOLLOW_37);
            rule__SimpleAttributeAssignment__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_1__2"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_1__2__Impl"
    // InternalOntoL.g:6642:1: rule__SimpleAttributeAssignment__Group_2_1__2__Impl : ( ( rule__SimpleAttributeAssignment__Group_2_1_2__0 )* ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6646:1: ( ( ( rule__SimpleAttributeAssignment__Group_2_1_2__0 )* ) )
            // InternalOntoL.g:6647:1: ( ( rule__SimpleAttributeAssignment__Group_2_1_2__0 )* )
            {
            // InternalOntoL.g:6647:1: ( ( rule__SimpleAttributeAssignment__Group_2_1_2__0 )* )
            // InternalOntoL.g:6648:2: ( rule__SimpleAttributeAssignment__Group_2_1_2__0 )*
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_1_2()); 
            // InternalOntoL.g:6649:2: ( rule__SimpleAttributeAssignment__Group_2_1_2__0 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==34) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalOntoL.g:6649:3: rule__SimpleAttributeAssignment__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SimpleAttributeAssignment__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_1__2__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_1__3"
    // InternalOntoL.g:6657:1: rule__SimpleAttributeAssignment__Group_2_1__3 : rule__SimpleAttributeAssignment__Group_2_1__3__Impl ;
    public final void rule__SimpleAttributeAssignment__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6661:1: ( rule__SimpleAttributeAssignment__Group_2_1__3__Impl )
            // InternalOntoL.g:6662:2: rule__SimpleAttributeAssignment__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group_2_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_1__3"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_1__3__Impl"
    // InternalOntoL.g:6668:1: rule__SimpleAttributeAssignment__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6672:1: ( ( '}' ) )
            // InternalOntoL.g:6673:1: ( '}' )
            {
            // InternalOntoL.g:6673:1: ( '}' )
            // InternalOntoL.g:6674:2: '}'
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getRightCurlyBracketKeyword_2_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSimpleAttributeAssignmentAccess().getRightCurlyBracketKeyword_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_1__3__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_1_2__0"
    // InternalOntoL.g:6684:1: rule__SimpleAttributeAssignment__Group_2_1_2__0 : rule__SimpleAttributeAssignment__Group_2_1_2__0__Impl rule__SimpleAttributeAssignment__Group_2_1_2__1 ;
    public final void rule__SimpleAttributeAssignment__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6688:1: ( rule__SimpleAttributeAssignment__Group_2_1_2__0__Impl rule__SimpleAttributeAssignment__Group_2_1_2__1 )
            // InternalOntoL.g:6689:2: rule__SimpleAttributeAssignment__Group_2_1_2__0__Impl rule__SimpleAttributeAssignment__Group_2_1_2__1
            {
            pushFollow(FOLLOW_36);
            rule__SimpleAttributeAssignment__Group_2_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group_2_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_1_2__0"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_1_2__0__Impl"
    // InternalOntoL.g:6696:1: rule__SimpleAttributeAssignment__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6700:1: ( ( ',' ) )
            // InternalOntoL.g:6701:1: ( ',' )
            {
            // InternalOntoL.g:6701:1: ( ',' )
            // InternalOntoL.g:6702:2: ','
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getCommaKeyword_2_1_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSimpleAttributeAssignmentAccess().getCommaKeyword_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_1_2__1"
    // InternalOntoL.g:6711:1: rule__SimpleAttributeAssignment__Group_2_1_2__1 : rule__SimpleAttributeAssignment__Group_2_1_2__1__Impl ;
    public final void rule__SimpleAttributeAssignment__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6715:1: ( rule__SimpleAttributeAssignment__Group_2_1_2__1__Impl )
            // InternalOntoL.g:6716:2: rule__SimpleAttributeAssignment__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group_2_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_1_2__1"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_1_2__1__Impl"
    // InternalOntoL.g:6722:1: rule__SimpleAttributeAssignment__Group_2_1_2__1__Impl : ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6726:1: ( ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1 ) ) )
            // InternalOntoL.g:6727:1: ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1 ) )
            {
            // InternalOntoL.g:6727:1: ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1 ) )
            // InternalOntoL.g:6728:2: ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAssignmentsAssignment_2_1_2_1()); 
            // InternalOntoL.g:6729:2: ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1 )
            // InternalOntoL.g:6729:3: rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getAssignmentsAssignment_2_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group__0"
    // InternalOntoL.g:6738:1: rule__ReferenceAssignment__Group__0 : rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1 ;
    public final void rule__ReferenceAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6742:1: ( rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1 )
            // InternalOntoL.g:6743:2: rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ReferenceAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group__0"


    // $ANTLR start "rule__ReferenceAssignment__Group__0__Impl"
    // InternalOntoL.g:6750:1: rule__ReferenceAssignment__Group__0__Impl : ( 'ref' ) ;
    public final void rule__ReferenceAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6754:1: ( ( 'ref' ) )
            // InternalOntoL.g:6755:1: ( 'ref' )
            {
            // InternalOntoL.g:6755:1: ( 'ref' )
            // InternalOntoL.g:6756:2: 'ref'
            {
             before(grammarAccess.getReferenceAssignmentAccess().getRefKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getReferenceAssignmentAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group__0__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group__1"
    // InternalOntoL.g:6765:1: rule__ReferenceAssignment__Group__1 : rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2 ;
    public final void rule__ReferenceAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6769:1: ( rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2 )
            // InternalOntoL.g:6770:2: rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__ReferenceAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group__1"


    // $ANTLR start "rule__ReferenceAssignment__Group__1__Impl"
    // InternalOntoL.g:6777:1: rule__ReferenceAssignment__Group__1__Impl : ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) ) ;
    public final void rule__ReferenceAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6781:1: ( ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) ) )
            // InternalOntoL.g:6782:1: ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) )
            {
            // InternalOntoL.g:6782:1: ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) )
            // InternalOntoL.g:6783:2: ( rule__ReferenceAssignment__ReferenceAssignment_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getReferenceAssignment_1()); 
            // InternalOntoL.g:6784:2: ( rule__ReferenceAssignment__ReferenceAssignment_1 )
            // InternalOntoL.g:6784:3: rule__ReferenceAssignment__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__ReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAssignmentAccess().getReferenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group__1__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group__2"
    // InternalOntoL.g:6792:1: rule__ReferenceAssignment__Group__2 : rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3 ;
    public final void rule__ReferenceAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6796:1: ( rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3 )
            // InternalOntoL.g:6797:2: rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__ReferenceAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group__2"


    // $ANTLR start "rule__ReferenceAssignment__Group__2__Impl"
    // InternalOntoL.g:6804:1: rule__ReferenceAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__ReferenceAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6808:1: ( ( '=' ) )
            // InternalOntoL.g:6809:1: ( '=' )
            {
            // InternalOntoL.g:6809:1: ( '=' )
            // InternalOntoL.g:6810:2: '='
            {
             before(grammarAccess.getReferenceAssignmentAccess().getEqualsSignKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getReferenceAssignmentAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group__2__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group__3"
    // InternalOntoL.g:6819:1: rule__ReferenceAssignment__Group__3 : rule__ReferenceAssignment__Group__3__Impl ;
    public final void rule__ReferenceAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6823:1: ( rule__ReferenceAssignment__Group__3__Impl )
            // InternalOntoL.g:6824:2: rule__ReferenceAssignment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group__3"


    // $ANTLR start "rule__ReferenceAssignment__Group__3__Impl"
    // InternalOntoL.g:6830:1: rule__ReferenceAssignment__Group__3__Impl : ( ( rule__ReferenceAssignment__Alternatives_3 ) ) ;
    public final void rule__ReferenceAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6834:1: ( ( ( rule__ReferenceAssignment__Alternatives_3 ) ) )
            // InternalOntoL.g:6835:1: ( ( rule__ReferenceAssignment__Alternatives_3 ) )
            {
            // InternalOntoL.g:6835:1: ( ( rule__ReferenceAssignment__Alternatives_3 ) )
            // InternalOntoL.g:6836:2: ( rule__ReferenceAssignment__Alternatives_3 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAlternatives_3()); 
            // InternalOntoL.g:6837:2: ( rule__ReferenceAssignment__Alternatives_3 )
            // InternalOntoL.g:6837:3: rule__ReferenceAssignment__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAssignmentAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group__3__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1__0"
    // InternalOntoL.g:6846:1: rule__ReferenceAssignment__Group_3_1__0 : rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1 ;
    public final void rule__ReferenceAssignment__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6850:1: ( rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1 )
            // InternalOntoL.g:6851:2: rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ReferenceAssignment__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1__0"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1__0__Impl"
    // InternalOntoL.g:6858:1: rule__ReferenceAssignment__Group_3_1__0__Impl : ( '{' ) ;
    public final void rule__ReferenceAssignment__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6862:1: ( ( '{' ) )
            // InternalOntoL.g:6863:1: ( '{' )
            {
            // InternalOntoL.g:6863:1: ( '{' )
            // InternalOntoL.g:6864:2: '{'
            {
             before(grammarAccess.getReferenceAssignmentAccess().getLeftCurlyBracketKeyword_3_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getReferenceAssignmentAccess().getLeftCurlyBracketKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1__0__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1__1"
    // InternalOntoL.g:6873:1: rule__ReferenceAssignment__Group_3_1__1 : rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2 ;
    public final void rule__ReferenceAssignment__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6877:1: ( rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2 )
            // InternalOntoL.g:6878:2: rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2
            {
            pushFollow(FOLLOW_37);
            rule__ReferenceAssignment__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1__1"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1__1__Impl"
    // InternalOntoL.g:6885:1: rule__ReferenceAssignment__Group_3_1__1__Impl : ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) ) ;
    public final void rule__ReferenceAssignment__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6889:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) ) )
            // InternalOntoL.g:6890:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) )
            {
            // InternalOntoL.g:6890:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) )
            // InternalOntoL.g:6891:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_1_1()); 
            // InternalOntoL.g:6892:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 )
            // InternalOntoL.g:6892:3: rule__ReferenceAssignment__AssignmentsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__AssignmentsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1__1__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1__2"
    // InternalOntoL.g:6900:1: rule__ReferenceAssignment__Group_3_1__2 : rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3 ;
    public final void rule__ReferenceAssignment__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6904:1: ( rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3 )
            // InternalOntoL.g:6905:2: rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3
            {
            pushFollow(FOLLOW_37);
            rule__ReferenceAssignment__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group_3_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1__2"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1__2__Impl"
    // InternalOntoL.g:6912:1: rule__ReferenceAssignment__Group_3_1__2__Impl : ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* ) ;
    public final void rule__ReferenceAssignment__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6916:1: ( ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* ) )
            // InternalOntoL.g:6917:1: ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* )
            {
            // InternalOntoL.g:6917:1: ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* )
            // InternalOntoL.g:6918:2: ( rule__ReferenceAssignment__Group_3_1_2__0 )*
            {
             before(grammarAccess.getReferenceAssignmentAccess().getGroup_3_1_2()); 
            // InternalOntoL.g:6919:2: ( rule__ReferenceAssignment__Group_3_1_2__0 )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==34) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalOntoL.g:6919:3: rule__ReferenceAssignment__Group_3_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ReferenceAssignment__Group_3_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

             after(grammarAccess.getReferenceAssignmentAccess().getGroup_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1__2__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1__3"
    // InternalOntoL.g:6927:1: rule__ReferenceAssignment__Group_3_1__3 : rule__ReferenceAssignment__Group_3_1__3__Impl ;
    public final void rule__ReferenceAssignment__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6931:1: ( rule__ReferenceAssignment__Group_3_1__3__Impl )
            // InternalOntoL.g:6932:2: rule__ReferenceAssignment__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group_3_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1__3"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1__3__Impl"
    // InternalOntoL.g:6938:1: rule__ReferenceAssignment__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__ReferenceAssignment__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6942:1: ( ( '}' ) )
            // InternalOntoL.g:6943:1: ( '}' )
            {
            // InternalOntoL.g:6943:1: ( '}' )
            // InternalOntoL.g:6944:2: '}'
            {
             before(grammarAccess.getReferenceAssignmentAccess().getRightCurlyBracketKeyword_3_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getReferenceAssignmentAccess().getRightCurlyBracketKeyword_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1__3__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1_2__0"
    // InternalOntoL.g:6954:1: rule__ReferenceAssignment__Group_3_1_2__0 : rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1 ;
    public final void rule__ReferenceAssignment__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6958:1: ( rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1 )
            // InternalOntoL.g:6959:2: rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ReferenceAssignment__Group_3_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group_3_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1_2__0"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1_2__0__Impl"
    // InternalOntoL.g:6966:1: rule__ReferenceAssignment__Group_3_1_2__0__Impl : ( ',' ) ;
    public final void rule__ReferenceAssignment__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6970:1: ( ( ',' ) )
            // InternalOntoL.g:6971:1: ( ',' )
            {
            // InternalOntoL.g:6971:1: ( ',' )
            // InternalOntoL.g:6972:2: ','
            {
             before(grammarAccess.getReferenceAssignmentAccess().getCommaKeyword_3_1_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getReferenceAssignmentAccess().getCommaKeyword_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1_2__0__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1_2__1"
    // InternalOntoL.g:6981:1: rule__ReferenceAssignment__Group_3_1_2__1 : rule__ReferenceAssignment__Group_3_1_2__1__Impl ;
    public final void rule__ReferenceAssignment__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6985:1: ( rule__ReferenceAssignment__Group_3_1_2__1__Impl )
            // InternalOntoL.g:6986:2: rule__ReferenceAssignment__Group_3_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group_3_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1_2__1"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1_2__1__Impl"
    // InternalOntoL.g:6992:1: rule__ReferenceAssignment__Group_3_1_2__1__Impl : ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) ) ;
    public final void rule__ReferenceAssignment__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6996:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) ) )
            // InternalOntoL.g:6997:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) )
            {
            // InternalOntoL.g:6997:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) )
            // InternalOntoL.g:6998:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_1_2_1()); 
            // InternalOntoL.g:6999:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 )
            // InternalOntoL.g:6999:3: rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1_2__1__Impl"


    // $ANTLR start "rule__NUMBER__Group__0"
    // InternalOntoL.g:7008:1: rule__NUMBER__Group__0 : rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 ;
    public final void rule__NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7012:1: ( rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 )
            // InternalOntoL.g:7013:2: rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__NUMBER__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__0"


    // $ANTLR start "rule__NUMBER__Group__0__Impl"
    // InternalOntoL.g:7020:1: rule__NUMBER__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7024:1: ( ( ( '-' )? ) )
            // InternalOntoL.g:7025:1: ( ( '-' )? )
            {
            // InternalOntoL.g:7025:1: ( ( '-' )? )
            // InternalOntoL.g:7026:2: ( '-' )?
            {
             before(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0()); 
            // InternalOntoL.g:7027:2: ( '-' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==50) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalOntoL.g:7027:3: '-'
                    {
                    match(input,50,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__0__Impl"


    // $ANTLR start "rule__NUMBER__Group__1"
    // InternalOntoL.g:7035:1: rule__NUMBER__Group__1 : rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2 ;
    public final void rule__NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7039:1: ( rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2 )
            // InternalOntoL.g:7040:2: rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__NUMBER__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__1"


    // $ANTLR start "rule__NUMBER__Group__1__Impl"
    // InternalOntoL.g:7047:1: rule__NUMBER__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7051:1: ( ( RULE_INT ) )
            // InternalOntoL.g:7052:1: ( RULE_INT )
            {
            // InternalOntoL.g:7052:1: ( RULE_INT )
            // InternalOntoL.g:7053:2: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__1__Impl"


    // $ANTLR start "rule__NUMBER__Group__2"
    // InternalOntoL.g:7062:1: rule__NUMBER__Group__2 : rule__NUMBER__Group__2__Impl ;
    public final void rule__NUMBER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7066:1: ( rule__NUMBER__Group__2__Impl )
            // InternalOntoL.g:7067:2: rule__NUMBER__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__2"


    // $ANTLR start "rule__NUMBER__Group__2__Impl"
    // InternalOntoL.g:7073:1: rule__NUMBER__Group__2__Impl : ( ( rule__NUMBER__Group_2__0 )? ) ;
    public final void rule__NUMBER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7077:1: ( ( ( rule__NUMBER__Group_2__0 )? ) )
            // InternalOntoL.g:7078:1: ( ( rule__NUMBER__Group_2__0 )? )
            {
            // InternalOntoL.g:7078:1: ( ( rule__NUMBER__Group_2__0 )? )
            // InternalOntoL.g:7079:2: ( rule__NUMBER__Group_2__0 )?
            {
             before(grammarAccess.getNUMBERAccess().getGroup_2()); 
            // InternalOntoL.g:7080:2: ( rule__NUMBER__Group_2__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==29) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalOntoL.g:7080:3: rule__NUMBER__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NUMBER__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNUMBERAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__2__Impl"


    // $ANTLR start "rule__NUMBER__Group_2__0"
    // InternalOntoL.g:7089:1: rule__NUMBER__Group_2__0 : rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1 ;
    public final void rule__NUMBER__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7093:1: ( rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1 )
            // InternalOntoL.g:7094:2: rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__NUMBER__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_2__0"


    // $ANTLR start "rule__NUMBER__Group_2__0__Impl"
    // InternalOntoL.g:7101:1: rule__NUMBER__Group_2__0__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7105:1: ( ( '.' ) )
            // InternalOntoL.g:7106:1: ( '.' )
            {
            // InternalOntoL.g:7106:1: ( '.' )
            // InternalOntoL.g:7107:2: '.'
            {
             before(grammarAccess.getNUMBERAccess().getFullStopKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_2__0__Impl"


    // $ANTLR start "rule__NUMBER__Group_2__1"
    // InternalOntoL.g:7116:1: rule__NUMBER__Group_2__1 : rule__NUMBER__Group_2__1__Impl ;
    public final void rule__NUMBER__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7120:1: ( rule__NUMBER__Group_2__1__Impl )
            // InternalOntoL.g:7121:2: rule__NUMBER__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_2__1"


    // $ANTLR start "rule__NUMBER__Group_2__1__Impl"
    // InternalOntoL.g:7127:1: rule__NUMBER__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7131:1: ( ( RULE_INT ) )
            // InternalOntoL.g:7132:1: ( RULE_INT )
            {
            // InternalOntoL.g:7132:1: ( RULE_INT )
            // InternalOntoL.g:7133:2: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_2__1__Impl"


    // $ANTLR start "rule__NoneValue__Group__0"
    // InternalOntoL.g:7143:1: rule__NoneValue__Group__0 : rule__NoneValue__Group__0__Impl rule__NoneValue__Group__1 ;
    public final void rule__NoneValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7147:1: ( rule__NoneValue__Group__0__Impl rule__NoneValue__Group__1 )
            // InternalOntoL.g:7148:2: rule__NoneValue__Group__0__Impl rule__NoneValue__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__NoneValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoneValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoneValue__Group__0"


    // $ANTLR start "rule__NoneValue__Group__0__Impl"
    // InternalOntoL.g:7155:1: rule__NoneValue__Group__0__Impl : ( () ) ;
    public final void rule__NoneValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7159:1: ( ( () ) )
            // InternalOntoL.g:7160:1: ( () )
            {
            // InternalOntoL.g:7160:1: ( () )
            // InternalOntoL.g:7161:2: ()
            {
             before(grammarAccess.getNoneValueAccess().getNoneValueAction_0()); 
            // InternalOntoL.g:7162:2: ()
            // InternalOntoL.g:7162:3: 
            {
            }

             after(grammarAccess.getNoneValueAccess().getNoneValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoneValue__Group__0__Impl"


    // $ANTLR start "rule__NoneValue__Group__1"
    // InternalOntoL.g:7170:1: rule__NoneValue__Group__1 : rule__NoneValue__Group__1__Impl ;
    public final void rule__NoneValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7174:1: ( rule__NoneValue__Group__1__Impl )
            // InternalOntoL.g:7175:2: rule__NoneValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NoneValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoneValue__Group__1"


    // $ANTLR start "rule__NoneValue__Group__1__Impl"
    // InternalOntoL.g:7181:1: rule__NoneValue__Group__1__Impl : ( 'none' ) ;
    public final void rule__NoneValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7185:1: ( ( 'none' ) )
            // InternalOntoL.g:7186:1: ( 'none' )
            {
            // InternalOntoL.g:7186:1: ( 'none' )
            // InternalOntoL.g:7187:2: 'none'
            {
             before(grammarAccess.getNoneValueAccess().getNoneKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getNoneValueAccess().getNoneKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoneValue__Group__1__Impl"


    // $ANTLR start "rule__UnamedIndividual__Group__0"
    // InternalOntoL.g:7197:1: rule__UnamedIndividual__Group__0 : rule__UnamedIndividual__Group__0__Impl rule__UnamedIndividual__Group__1 ;
    public final void rule__UnamedIndividual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7201:1: ( rule__UnamedIndividual__Group__0__Impl rule__UnamedIndividual__Group__1 )
            // InternalOntoL.g:7202:2: rule__UnamedIndividual__Group__0__Impl rule__UnamedIndividual__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UnamedIndividual__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnamedIndividual__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnamedIndividual__Group__0"


    // $ANTLR start "rule__UnamedIndividual__Group__0__Impl"
    // InternalOntoL.g:7209:1: rule__UnamedIndividual__Group__0__Impl : ( '[' ) ;
    public final void rule__UnamedIndividual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7213:1: ( ( '[' ) )
            // InternalOntoL.g:7214:1: ( '[' )
            {
            // InternalOntoL.g:7214:1: ( '[' )
            // InternalOntoL.g:7215:2: '['
            {
             before(grammarAccess.getUnamedIndividualAccess().getLeftSquareBracketKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getUnamedIndividualAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnamedIndividual__Group__0__Impl"


    // $ANTLR start "rule__UnamedIndividual__Group__1"
    // InternalOntoL.g:7224:1: rule__UnamedIndividual__Group__1 : rule__UnamedIndividual__Group__1__Impl rule__UnamedIndividual__Group__2 ;
    public final void rule__UnamedIndividual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7228:1: ( rule__UnamedIndividual__Group__1__Impl rule__UnamedIndividual__Group__2 )
            // InternalOntoL.g:7229:2: rule__UnamedIndividual__Group__1__Impl rule__UnamedIndividual__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__UnamedIndividual__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnamedIndividual__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnamedIndividual__Group__1"


    // $ANTLR start "rule__UnamedIndividual__Group__1__Impl"
    // InternalOntoL.g:7236:1: rule__UnamedIndividual__Group__1__Impl : ( ( rule__UnamedIndividual__AttAssignmentsAssignment_1 ) ) ;
    public final void rule__UnamedIndividual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7240:1: ( ( ( rule__UnamedIndividual__AttAssignmentsAssignment_1 ) ) )
            // InternalOntoL.g:7241:1: ( ( rule__UnamedIndividual__AttAssignmentsAssignment_1 ) )
            {
            // InternalOntoL.g:7241:1: ( ( rule__UnamedIndividual__AttAssignmentsAssignment_1 ) )
            // InternalOntoL.g:7242:2: ( rule__UnamedIndividual__AttAssignmentsAssignment_1 )
            {
             before(grammarAccess.getUnamedIndividualAccess().getAttAssignmentsAssignment_1()); 
            // InternalOntoL.g:7243:2: ( rule__UnamedIndividual__AttAssignmentsAssignment_1 )
            // InternalOntoL.g:7243:3: rule__UnamedIndividual__AttAssignmentsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UnamedIndividual__AttAssignmentsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnamedIndividualAccess().getAttAssignmentsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnamedIndividual__Group__1__Impl"


    // $ANTLR start "rule__UnamedIndividual__Group__2"
    // InternalOntoL.g:7251:1: rule__UnamedIndividual__Group__2 : rule__UnamedIndividual__Group__2__Impl rule__UnamedIndividual__Group__3 ;
    public final void rule__UnamedIndividual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7255:1: ( rule__UnamedIndividual__Group__2__Impl rule__UnamedIndividual__Group__3 )
            // InternalOntoL.g:7256:2: rule__UnamedIndividual__Group__2__Impl rule__UnamedIndividual__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__UnamedIndividual__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnamedIndividual__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnamedIndividual__Group__2"


    // $ANTLR start "rule__UnamedIndividual__Group__2__Impl"
    // InternalOntoL.g:7263:1: rule__UnamedIndividual__Group__2__Impl : ( ( rule__UnamedIndividual__Group_2__0 )* ) ;
    public final void rule__UnamedIndividual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7267:1: ( ( ( rule__UnamedIndividual__Group_2__0 )* ) )
            // InternalOntoL.g:7268:1: ( ( rule__UnamedIndividual__Group_2__0 )* )
            {
            // InternalOntoL.g:7268:1: ( ( rule__UnamedIndividual__Group_2__0 )* )
            // InternalOntoL.g:7269:2: ( rule__UnamedIndividual__Group_2__0 )*
            {
             before(grammarAccess.getUnamedIndividualAccess().getGroup_2()); 
            // InternalOntoL.g:7270:2: ( rule__UnamedIndividual__Group_2__0 )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==34) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalOntoL.g:7270:3: rule__UnamedIndividual__Group_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__UnamedIndividual__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

             after(grammarAccess.getUnamedIndividualAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnamedIndividual__Group__2__Impl"


    // $ANTLR start "rule__UnamedIndividual__Group__3"
    // InternalOntoL.g:7278:1: rule__UnamedIndividual__Group__3 : rule__UnamedIndividual__Group__3__Impl ;
    public final void rule__UnamedIndividual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7282:1: ( rule__UnamedIndividual__Group__3__Impl )
            // InternalOntoL.g:7283:2: rule__UnamedIndividual__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnamedIndividual__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnamedIndividual__Group__3"


    // $ANTLR start "rule__UnamedIndividual__Group__3__Impl"
    // InternalOntoL.g:7289:1: rule__UnamedIndividual__Group__3__Impl : ( ']' ) ;
    public final void rule__UnamedIndividual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7293:1: ( ( ']' ) )
            // InternalOntoL.g:7294:1: ( ']' )
            {
            // InternalOntoL.g:7294:1: ( ']' )
            // InternalOntoL.g:7295:2: ']'
            {
             before(grammarAccess.getUnamedIndividualAccess().getRightSquareBracketKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getUnamedIndividualAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnamedIndividual__Group__3__Impl"


    // $ANTLR start "rule__UnamedIndividual__Group_2__0"
    // InternalOntoL.g:7305:1: rule__UnamedIndividual__Group_2__0 : rule__UnamedIndividual__Group_2__0__Impl rule__UnamedIndividual__Group_2__1 ;
    public final void rule__UnamedIndividual__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7309:1: ( rule__UnamedIndividual__Group_2__0__Impl rule__UnamedIndividual__Group_2__1 )
            // InternalOntoL.g:7310:2: rule__UnamedIndividual__Group_2__0__Impl rule__UnamedIndividual__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__UnamedIndividual__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnamedIndividual__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnamedIndividual__Group_2__0"


    // $ANTLR start "rule__UnamedIndividual__Group_2__0__Impl"
    // InternalOntoL.g:7317:1: rule__UnamedIndividual__Group_2__0__Impl : ( ',' ) ;
    public final void rule__UnamedIndividual__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7321:1: ( ( ',' ) )
            // InternalOntoL.g:7322:1: ( ',' )
            {
            // InternalOntoL.g:7322:1: ( ',' )
            // InternalOntoL.g:7323:2: ','
            {
             before(grammarAccess.getUnamedIndividualAccess().getCommaKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getUnamedIndividualAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnamedIndividual__Group_2__0__Impl"


    // $ANTLR start "rule__UnamedIndividual__Group_2__1"
    // InternalOntoL.g:7332:1: rule__UnamedIndividual__Group_2__1 : rule__UnamedIndividual__Group_2__1__Impl ;
    public final void rule__UnamedIndividual__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7336:1: ( rule__UnamedIndividual__Group_2__1__Impl )
            // InternalOntoL.g:7337:2: rule__UnamedIndividual__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnamedIndividual__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnamedIndividual__Group_2__1"


    // $ANTLR start "rule__UnamedIndividual__Group_2__1__Impl"
    // InternalOntoL.g:7343:1: rule__UnamedIndividual__Group_2__1__Impl : ( ( rule__UnamedIndividual__AttAssignmentsAssignment_2_1 ) ) ;
    public final void rule__UnamedIndividual__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7347:1: ( ( ( rule__UnamedIndividual__AttAssignmentsAssignment_2_1 ) ) )
            // InternalOntoL.g:7348:1: ( ( rule__UnamedIndividual__AttAssignmentsAssignment_2_1 ) )
            {
            // InternalOntoL.g:7348:1: ( ( rule__UnamedIndividual__AttAssignmentsAssignment_2_1 ) )
            // InternalOntoL.g:7349:2: ( rule__UnamedIndividual__AttAssignmentsAssignment_2_1 )
            {
             before(grammarAccess.getUnamedIndividualAccess().getAttAssignmentsAssignment_2_1()); 
            // InternalOntoL.g:7350:2: ( rule__UnamedIndividual__AttAssignmentsAssignment_2_1 )
            // InternalOntoL.g:7350:3: rule__UnamedIndividual__AttAssignmentsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UnamedIndividual__AttAssignmentsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUnamedIndividualAccess().getAttAssignmentsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnamedIndividual__Group_2__1__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__0"
    // InternalOntoL.g:7359:1: rule__GeneralizationSet__Group__0 : rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 ;
    public final void rule__GeneralizationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7363:1: ( rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 )
            // InternalOntoL.g:7364:2: rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__GeneralizationSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__0"


    // $ANTLR start "rule__GeneralizationSet__Group__0__Impl"
    // InternalOntoL.g:7371:1: rule__GeneralizationSet__Group__0__Impl : ( ( rule__GeneralizationSet__Alternatives_0 )? ) ;
    public final void rule__GeneralizationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7375:1: ( ( ( rule__GeneralizationSet__Alternatives_0 )? ) )
            // InternalOntoL.g:7376:1: ( ( rule__GeneralizationSet__Alternatives_0 )? )
            {
            // InternalOntoL.g:7376:1: ( ( rule__GeneralizationSet__Alternatives_0 )? )
            // InternalOntoL.g:7377:2: ( rule__GeneralizationSet__Alternatives_0 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getAlternatives_0()); 
            // InternalOntoL.g:7378:2: ( rule__GeneralizationSet__Alternatives_0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=57 && LA70_0<=58)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalOntoL.g:7378:3: rule__GeneralizationSet__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeneralizationSetAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__0__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__1"
    // InternalOntoL.g:7386:1: rule__GeneralizationSet__Group__1 : rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 ;
    public final void rule__GeneralizationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7390:1: ( rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 )
            // InternalOntoL.g:7391:2: rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__GeneralizationSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__1"


    // $ANTLR start "rule__GeneralizationSet__Group__1__Impl"
    // InternalOntoL.g:7398:1: rule__GeneralizationSet__Group__1__Impl : ( 'genset' ) ;
    public final void rule__GeneralizationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7402:1: ( ( 'genset' ) )
            // InternalOntoL.g:7403:1: ( 'genset' )
            {
            // InternalOntoL.g:7403:1: ( 'genset' )
            // InternalOntoL.g:7404:2: 'genset'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGensetKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getGensetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__1__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__2"
    // InternalOntoL.g:7413:1: rule__GeneralizationSet__Group__2 : rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 ;
    public final void rule__GeneralizationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7417:1: ( rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 )
            // InternalOntoL.g:7418:2: rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__GeneralizationSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__2"


    // $ANTLR start "rule__GeneralizationSet__Group__2__Impl"
    // InternalOntoL.g:7425:1: rule__GeneralizationSet__Group__2__Impl : ( ( rule__GeneralizationSet__NameAssignment_2 )? ) ;
    public final void rule__GeneralizationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7429:1: ( ( ( rule__GeneralizationSet__NameAssignment_2 )? ) )
            // InternalOntoL.g:7430:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            {
            // InternalOntoL.g:7430:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            // InternalOntoL.g:7431:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 
            // InternalOntoL.g:7432:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalOntoL.g:7432:3: rule__GeneralizationSet__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__2__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__3"
    // InternalOntoL.g:7440:1: rule__GeneralizationSet__Group__3 : rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 ;
    public final void rule__GeneralizationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7444:1: ( rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 )
            // InternalOntoL.g:7445:2: rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__GeneralizationSet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__3"


    // $ANTLR start "rule__GeneralizationSet__Group__3__Impl"
    // InternalOntoL.g:7452:1: rule__GeneralizationSet__Group__3__Impl : ( 'general' ) ;
    public final void rule__GeneralizationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7456:1: ( ( 'general' ) )
            // InternalOntoL.g:7457:1: ( 'general' )
            {
            // InternalOntoL.g:7457:1: ( 'general' )
            // InternalOntoL.g:7458:2: 'general'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralKeyword_3()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getGeneralKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__3__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__4"
    // InternalOntoL.g:7467:1: rule__GeneralizationSet__Group__4 : rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 ;
    public final void rule__GeneralizationSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7471:1: ( rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 )
            // InternalOntoL.g:7472:2: rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5
            {
            pushFollow(FOLLOW_44);
            rule__GeneralizationSet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__4"


    // $ANTLR start "rule__GeneralizationSet__Group__4__Impl"
    // InternalOntoL.g:7479:1: rule__GeneralizationSet__Group__4__Impl : ( ( rule__GeneralizationSet__GeneralAssignment_4 ) ) ;
    public final void rule__GeneralizationSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7483:1: ( ( ( rule__GeneralizationSet__GeneralAssignment_4 ) ) )
            // InternalOntoL.g:7484:1: ( ( rule__GeneralizationSet__GeneralAssignment_4 ) )
            {
            // InternalOntoL.g:7484:1: ( ( rule__GeneralizationSet__GeneralAssignment_4 ) )
            // InternalOntoL.g:7485:2: ( rule__GeneralizationSet__GeneralAssignment_4 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralAssignment_4()); 
            // InternalOntoL.g:7486:2: ( rule__GeneralizationSet__GeneralAssignment_4 )
            // InternalOntoL.g:7486:3: rule__GeneralizationSet__GeneralAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__GeneralAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__4__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__5"
    // InternalOntoL.g:7494:1: rule__GeneralizationSet__Group__5 : rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 ;
    public final void rule__GeneralizationSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7498:1: ( rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 )
            // InternalOntoL.g:7499:2: rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6
            {
            pushFollow(FOLLOW_44);
            rule__GeneralizationSet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__5"


    // $ANTLR start "rule__GeneralizationSet__Group__5__Impl"
    // InternalOntoL.g:7506:1: rule__GeneralizationSet__Group__5__Impl : ( ( rule__GeneralizationSet__Group_5__0 )? ) ;
    public final void rule__GeneralizationSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7510:1: ( ( ( rule__GeneralizationSet__Group_5__0 )? ) )
            // InternalOntoL.g:7511:1: ( ( rule__GeneralizationSet__Group_5__0 )? )
            {
            // InternalOntoL.g:7511:1: ( ( rule__GeneralizationSet__Group_5__0 )? )
            // InternalOntoL.g:7512:2: ( rule__GeneralizationSet__Group_5__0 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_5()); 
            // InternalOntoL.g:7513:2: ( rule__GeneralizationSet__Group_5__0 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==55) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalOntoL.g:7513:3: rule__GeneralizationSet__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeneralizationSetAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__5__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__6"
    // InternalOntoL.g:7521:1: rule__GeneralizationSet__Group__6 : rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 ;
    public final void rule__GeneralizationSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7525:1: ( rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 )
            // InternalOntoL.g:7526:2: rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__GeneralizationSet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__6"


    // $ANTLR start "rule__GeneralizationSet__Group__6__Impl"
    // InternalOntoL.g:7533:1: rule__GeneralizationSet__Group__6__Impl : ( 'specifics' ) ;
    public final void rule__GeneralizationSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7537:1: ( ( 'specifics' ) )
            // InternalOntoL.g:7538:1: ( 'specifics' )
            {
            // InternalOntoL.g:7538:1: ( 'specifics' )
            // InternalOntoL.g:7539:2: 'specifics'
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsKeyword_6()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getSpecificsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__6__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__7"
    // InternalOntoL.g:7548:1: rule__GeneralizationSet__Group__7 : rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8 ;
    public final void rule__GeneralizationSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7552:1: ( rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8 )
            // InternalOntoL.g:7553:2: rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__GeneralizationSet__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__7"


    // $ANTLR start "rule__GeneralizationSet__Group__7__Impl"
    // InternalOntoL.g:7560:1: rule__GeneralizationSet__Group__7__Impl : ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) ) ;
    public final void rule__GeneralizationSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7564:1: ( ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) ) )
            // InternalOntoL.g:7565:1: ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) )
            {
            // InternalOntoL.g:7565:1: ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) )
            // InternalOntoL.g:7566:2: ( rule__GeneralizationSet__SpecificsAssignment_7 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_7()); 
            // InternalOntoL.g:7567:2: ( rule__GeneralizationSet__SpecificsAssignment_7 )
            // InternalOntoL.g:7567:3: rule__GeneralizationSet__SpecificsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__SpecificsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__7__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__8"
    // InternalOntoL.g:7575:1: rule__GeneralizationSet__Group__8 : rule__GeneralizationSet__Group__8__Impl ;
    public final void rule__GeneralizationSet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7579:1: ( rule__GeneralizationSet__Group__8__Impl )
            // InternalOntoL.g:7580:2: rule__GeneralizationSet__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__8"


    // $ANTLR start "rule__GeneralizationSet__Group__8__Impl"
    // InternalOntoL.g:7586:1: rule__GeneralizationSet__Group__8__Impl : ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) ) ;
    public final void rule__GeneralizationSet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7590:1: ( ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) ) )
            // InternalOntoL.g:7591:1: ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) )
            {
            // InternalOntoL.g:7591:1: ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) )
            // InternalOntoL.g:7592:2: ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* )
            {
            // InternalOntoL.g:7592:2: ( ( rule__GeneralizationSet__Group_8__0 ) )
            // InternalOntoL.g:7593:3: ( rule__GeneralizationSet__Group_8__0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 
            // InternalOntoL.g:7594:3: ( rule__GeneralizationSet__Group_8__0 )
            // InternalOntoL.g:7594:4: rule__GeneralizationSet__Group_8__0
            {
            pushFollow(FOLLOW_13);
            rule__GeneralizationSet__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 

            }

            // InternalOntoL.g:7597:2: ( ( rule__GeneralizationSet__Group_8__0 )* )
            // InternalOntoL.g:7598:3: ( rule__GeneralizationSet__Group_8__0 )*
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 
            // InternalOntoL.g:7599:3: ( rule__GeneralizationSet__Group_8__0 )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==34) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalOntoL.g:7599:4: rule__GeneralizationSet__Group_8__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GeneralizationSet__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

             after(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__8__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_0_2__0"
    // InternalOntoL.g:7609:1: rule__GeneralizationSet__Group_0_2__0 : rule__GeneralizationSet__Group_0_2__0__Impl rule__GeneralizationSet__Group_0_2__1 ;
    public final void rule__GeneralizationSet__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7613:1: ( rule__GeneralizationSet__Group_0_2__0__Impl rule__GeneralizationSet__Group_0_2__1 )
            // InternalOntoL.g:7614:2: rule__GeneralizationSet__Group_0_2__0__Impl rule__GeneralizationSet__Group_0_2__1
            {
            pushFollow(FOLLOW_45);
            rule__GeneralizationSet__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_2__0"


    // $ANTLR start "rule__GeneralizationSet__Group_0_2__0__Impl"
    // InternalOntoL.g:7621:1: rule__GeneralizationSet__Group_0_2__0__Impl : ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_0 ) ) ;
    public final void rule__GeneralizationSet__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7625:1: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_0 ) ) )
            // InternalOntoL.g:7626:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_0 ) )
            {
            // InternalOntoL.g:7626:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_0 ) )
            // InternalOntoL.g:7627:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_2_0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_2_0()); 
            // InternalOntoL.g:7628:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_2_0 )
            // InternalOntoL.g:7628:3: rule__GeneralizationSet__IsDisjointAssignment_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__IsDisjointAssignment_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_2__0__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_0_2__1"
    // InternalOntoL.g:7636:1: rule__GeneralizationSet__Group_0_2__1 : rule__GeneralizationSet__Group_0_2__1__Impl ;
    public final void rule__GeneralizationSet__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7640:1: ( rule__GeneralizationSet__Group_0_2__1__Impl )
            // InternalOntoL.g:7641:2: rule__GeneralizationSet__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_2__1"


    // $ANTLR start "rule__GeneralizationSet__Group_0_2__1__Impl"
    // InternalOntoL.g:7647:1: rule__GeneralizationSet__Group_0_2__1__Impl : ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_1 ) ) ;
    public final void rule__GeneralizationSet__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7651:1: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_1 ) ) )
            // InternalOntoL.g:7652:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_1 ) )
            {
            // InternalOntoL.g:7652:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_1 ) )
            // InternalOntoL.g:7653:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_2_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_2_1()); 
            // InternalOntoL.g:7654:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_2_1 )
            // InternalOntoL.g:7654:3: rule__GeneralizationSet__IsCompleteAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__IsCompleteAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_2__1__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_0_3__0"
    // InternalOntoL.g:7663:1: rule__GeneralizationSet__Group_0_3__0 : rule__GeneralizationSet__Group_0_3__0__Impl rule__GeneralizationSet__Group_0_3__1 ;
    public final void rule__GeneralizationSet__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7667:1: ( rule__GeneralizationSet__Group_0_3__0__Impl rule__GeneralizationSet__Group_0_3__1 )
            // InternalOntoL.g:7668:2: rule__GeneralizationSet__Group_0_3__0__Impl rule__GeneralizationSet__Group_0_3__1
            {
            pushFollow(FOLLOW_46);
            rule__GeneralizationSet__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_3__0"


    // $ANTLR start "rule__GeneralizationSet__Group_0_3__0__Impl"
    // InternalOntoL.g:7675:1: rule__GeneralizationSet__Group_0_3__0__Impl : ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_0 ) ) ;
    public final void rule__GeneralizationSet__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7679:1: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_0 ) ) )
            // InternalOntoL.g:7680:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_0 ) )
            {
            // InternalOntoL.g:7680:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_0 ) )
            // InternalOntoL.g:7681:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_3_0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_3_0()); 
            // InternalOntoL.g:7682:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_3_0 )
            // InternalOntoL.g:7682:3: rule__GeneralizationSet__IsCompleteAssignment_0_3_0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__IsCompleteAssignment_0_3_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_3__0__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_0_3__1"
    // InternalOntoL.g:7690:1: rule__GeneralizationSet__Group_0_3__1 : rule__GeneralizationSet__Group_0_3__1__Impl ;
    public final void rule__GeneralizationSet__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7694:1: ( rule__GeneralizationSet__Group_0_3__1__Impl )
            // InternalOntoL.g:7695:2: rule__GeneralizationSet__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_3__1"


    // $ANTLR start "rule__GeneralizationSet__Group_0_3__1__Impl"
    // InternalOntoL.g:7701:1: rule__GeneralizationSet__Group_0_3__1__Impl : ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_1 ) ) ;
    public final void rule__GeneralizationSet__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7705:1: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_1 ) ) )
            // InternalOntoL.g:7706:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_1 ) )
            {
            // InternalOntoL.g:7706:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_1 ) )
            // InternalOntoL.g:7707:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_3_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_3_1()); 
            // InternalOntoL.g:7708:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_3_1 )
            // InternalOntoL.g:7708:3: rule__GeneralizationSet__IsDisjointAssignment_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__IsDisjointAssignment_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_3__1__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_5__0"
    // InternalOntoL.g:7717:1: rule__GeneralizationSet__Group_5__0 : rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1 ;
    public final void rule__GeneralizationSet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7721:1: ( rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1 )
            // InternalOntoL.g:7722:2: rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__GeneralizationSet__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_5__0"


    // $ANTLR start "rule__GeneralizationSet__Group_5__0__Impl"
    // InternalOntoL.g:7729:1: rule__GeneralizationSet__Group_5__0__Impl : ( 'categorizer' ) ;
    public final void rule__GeneralizationSet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7733:1: ( ( 'categorizer' ) )
            // InternalOntoL.g:7734:1: ( 'categorizer' )
            {
            // InternalOntoL.g:7734:1: ( 'categorizer' )
            // InternalOntoL.g:7735:2: 'categorizer'
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerKeyword_5_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getCategorizerKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_5__0__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_5__1"
    // InternalOntoL.g:7744:1: rule__GeneralizationSet__Group_5__1 : rule__GeneralizationSet__Group_5__1__Impl ;
    public final void rule__GeneralizationSet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7748:1: ( rule__GeneralizationSet__Group_5__1__Impl )
            // InternalOntoL.g:7749:2: rule__GeneralizationSet__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_5__1"


    // $ANTLR start "rule__GeneralizationSet__Group_5__1__Impl"
    // InternalOntoL.g:7755:1: rule__GeneralizationSet__Group_5__1__Impl : ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) ) ;
    public final void rule__GeneralizationSet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7759:1: ( ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) ) )
            // InternalOntoL.g:7760:1: ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) )
            {
            // InternalOntoL.g:7760:1: ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) )
            // InternalOntoL.g:7761:2: ( rule__GeneralizationSet__CategorizerAssignment_5_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerAssignment_5_1()); 
            // InternalOntoL.g:7762:2: ( rule__GeneralizationSet__CategorizerAssignment_5_1 )
            // InternalOntoL.g:7762:3: rule__GeneralizationSet__CategorizerAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__CategorizerAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getCategorizerAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_5__1__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_8__0"
    // InternalOntoL.g:7771:1: rule__GeneralizationSet__Group_8__0 : rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1 ;
    public final void rule__GeneralizationSet__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7775:1: ( rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1 )
            // InternalOntoL.g:7776:2: rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__GeneralizationSet__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_8__0"


    // $ANTLR start "rule__GeneralizationSet__Group_8__0__Impl"
    // InternalOntoL.g:7783:1: rule__GeneralizationSet__Group_8__0__Impl : ( ',' ) ;
    public final void rule__GeneralizationSet__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7787:1: ( ( ',' ) )
            // InternalOntoL.g:7788:1: ( ',' )
            {
            // InternalOntoL.g:7788:1: ( ',' )
            // InternalOntoL.g:7789:2: ','
            {
             before(grammarAccess.getGeneralizationSetAccess().getCommaKeyword_8_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_8__0__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_8__1"
    // InternalOntoL.g:7798:1: rule__GeneralizationSet__Group_8__1 : rule__GeneralizationSet__Group_8__1__Impl ;
    public final void rule__GeneralizationSet__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7802:1: ( rule__GeneralizationSet__Group_8__1__Impl )
            // InternalOntoL.g:7803:2: rule__GeneralizationSet__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_8__1"


    // $ANTLR start "rule__GeneralizationSet__Group_8__1__Impl"
    // InternalOntoL.g:7809:1: rule__GeneralizationSet__Group_8__1__Impl : ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) ) ;
    public final void rule__GeneralizationSet__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7813:1: ( ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) ) )
            // InternalOntoL.g:7814:1: ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) )
            {
            // InternalOntoL.g:7814:1: ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) )
            // InternalOntoL.g:7815:2: ( rule__GeneralizationSet__SpecificsAssignment_8_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_8_1()); 
            // InternalOntoL.g:7816:2: ( rule__GeneralizationSet__SpecificsAssignment_8_1 )
            // InternalOntoL.g:7816:3: rule__GeneralizationSet__SpecificsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__SpecificsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_8__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalOntoL.g:7825:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7829:1: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7830:2: ( ruleQualifiedName )
            {
            // InternalOntoL.g:7830:2: ( ruleQualifiedName )
            // InternalOntoL.g:7831:3: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__IncludesAssignment_3_0_1"
    // InternalOntoL.g:7840:1: rule__Model__IncludesAssignment_3_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Model__IncludesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7844:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7845:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7845:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7846:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getModelAccess().getIncludesModelCrossReference_3_0_1_0()); 
            // InternalOntoL.g:7847:3: ( ruleQualifiedName )
            // InternalOntoL.g:7848:4: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getIncludesModelQualifiedNameParserRuleCall_3_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getIncludesModelQualifiedNameParserRuleCall_3_0_1_0_1()); 

            }

             after(grammarAccess.getModelAccess().getIncludesModelCrossReference_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__IncludesAssignment_3_0_1"


    // $ANTLR start "rule__Model__ElementsAssignment_3_1"
    // InternalOntoL.g:7859:1: rule__Model__ElementsAssignment_3_1 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7863:1: ( ( ruleModelElement ) )
            // InternalOntoL.g:7864:2: ( ruleModelElement )
            {
            // InternalOntoL.g:7864:2: ( ruleModelElement )
            // InternalOntoL.g:7865:3: ruleModelElement
            {
             before(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_3_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalOntoL.g:7874:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7878:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalOntoL.g:7879:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalOntoL.g:7879:2: ( ruleQualifiedNameWithWildcard )
            // InternalOntoL.g:7880:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Individual__NameAssignment_1"
    // InternalOntoL.g:7889:1: rule__Individual__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Individual__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7893:1: ( ( RULE_ID ) )
            // InternalOntoL.g:7894:2: ( RULE_ID )
            {
            // InternalOntoL.g:7894:2: ( RULE_ID )
            // InternalOntoL.g:7895:3: RULE_ID
            {
             before(grammarAccess.getIndividualAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIndividualAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__NameAssignment_1"


    // $ANTLR start "rule__Individual__InstantiatedClassesAssignment_2_1"
    // InternalOntoL.g:7904:1: rule__Individual__InstantiatedClassesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Individual__InstantiatedClassesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7908:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7909:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7909:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7910:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesOntoLClassCrossReference_2_1_0()); 
            // InternalOntoL.g:7911:3: ( ruleQualifiedName )
            // InternalOntoL.g:7912:4: ruleQualifiedName
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesOntoLClassQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getIndividualAccess().getInstantiatedClassesOntoLClassQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getIndividualAccess().getInstantiatedClassesOntoLClassCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__InstantiatedClassesAssignment_2_1"


    // $ANTLR start "rule__Individual__InstantiatedClassesAssignment_2_2_1"
    // InternalOntoL.g:7923:1: rule__Individual__InstantiatedClassesAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Individual__InstantiatedClassesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7927:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7928:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7928:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7929:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesOntoLClassCrossReference_2_2_1_0()); 
            // InternalOntoL.g:7930:3: ( ruleQualifiedName )
            // InternalOntoL.g:7931:4: ruleQualifiedName
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesOntoLClassQualifiedNameParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getIndividualAccess().getInstantiatedClassesOntoLClassQualifiedNameParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getIndividualAccess().getInstantiatedClassesOntoLClassCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__InstantiatedClassesAssignment_2_2_1"


    // $ANTLR start "rule__Individual__AttAssignmentsAssignment_3_1_0"
    // InternalOntoL.g:7942:1: rule__Individual__AttAssignmentsAssignment_3_1_0 : ( ruleAttributeAssignment ) ;
    public final void rule__Individual__AttAssignmentsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7946:1: ( ( ruleAttributeAssignment ) )
            // InternalOntoL.g:7947:2: ( ruleAttributeAssignment )
            {
            // InternalOntoL.g:7947:2: ( ruleAttributeAssignment )
            // InternalOntoL.g:7948:3: ruleAttributeAssignment
            {
             before(grammarAccess.getIndividualAccess().getAttAssignmentsAttributeAssignmentParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeAssignment();

            state._fsp--;

             after(grammarAccess.getIndividualAccess().getAttAssignmentsAttributeAssignmentParserRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__AttAssignmentsAssignment_3_1_0"


    // $ANTLR start "rule__Individual__RefAssignmentsAssignment_3_1_1"
    // InternalOntoL.g:7957:1: rule__Individual__RefAssignmentsAssignment_3_1_1 : ( ruleReferenceAssignment ) ;
    public final void rule__Individual__RefAssignmentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7961:1: ( ( ruleReferenceAssignment ) )
            // InternalOntoL.g:7962:2: ( ruleReferenceAssignment )
            {
            // InternalOntoL.g:7962:2: ( ruleReferenceAssignment )
            // InternalOntoL.g:7963:3: ruleReferenceAssignment
            {
             before(grammarAccess.getIndividualAccess().getRefAssignmentsReferenceAssignmentParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReferenceAssignment();

            state._fsp--;

             after(grammarAccess.getIndividualAccess().getRefAssignmentsReferenceAssignmentParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__RefAssignmentsAssignment_3_1_1"


    // $ANTLR start "rule__OntoLClass__AttributesAssignment_1_1_0"
    // InternalOntoL.g:7972:1: rule__OntoLClass__AttributesAssignment_1_1_0 : ( ruleAttribute ) ;
    public final void rule__OntoLClass__AttributesAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7976:1: ( ( ruleAttribute ) )
            // InternalOntoL.g:7977:2: ( ruleAttribute )
            {
            // InternalOntoL.g:7977:2: ( ruleAttribute )
            // InternalOntoL.g:7978:3: ruleAttribute
            {
             before(grammarAccess.getOntoLClassAccess().getAttributesAttributeParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getOntoLClassAccess().getAttributesAttributeParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__AttributesAssignment_1_1_0"


    // $ANTLR start "rule__OntoLClass__AttributesAssignment_1_1_1"
    // InternalOntoL.g:7987:1: rule__OntoLClass__AttributesAssignment_1_1_1 : ( ruleRegularityAttribute ) ;
    public final void rule__OntoLClass__AttributesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7991:1: ( ( ruleRegularityAttribute ) )
            // InternalOntoL.g:7992:2: ( ruleRegularityAttribute )
            {
            // InternalOntoL.g:7992:2: ( ruleRegularityAttribute )
            // InternalOntoL.g:7993:3: ruleRegularityAttribute
            {
             before(grammarAccess.getOntoLClassAccess().getAttributesRegularityAttributeParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegularityAttribute();

            state._fsp--;

             after(grammarAccess.getOntoLClassAccess().getAttributesRegularityAttributeParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__AttributesAssignment_1_1_1"


    // $ANTLR start "rule__OntoLClass__AttAssignmentsAssignment_1_1_2"
    // InternalOntoL.g:8002:1: rule__OntoLClass__AttAssignmentsAssignment_1_1_2 : ( ruleAttributeAssignment ) ;
    public final void rule__OntoLClass__AttAssignmentsAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8006:1: ( ( ruleAttributeAssignment ) )
            // InternalOntoL.g:8007:2: ( ruleAttributeAssignment )
            {
            // InternalOntoL.g:8007:2: ( ruleAttributeAssignment )
            // InternalOntoL.g:8008:3: ruleAttributeAssignment
            {
             before(grammarAccess.getOntoLClassAccess().getAttAssignmentsAttributeAssignmentParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeAssignment();

            state._fsp--;

             after(grammarAccess.getOntoLClassAccess().getAttAssignmentsAttributeAssignmentParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__AttAssignmentsAssignment_1_1_2"


    // $ANTLR start "rule__OntoLClass__ReferencesAssignment_1_1_3"
    // InternalOntoL.g:8017:1: rule__OntoLClass__ReferencesAssignment_1_1_3 : ( ruleReference ) ;
    public final void rule__OntoLClass__ReferencesAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8021:1: ( ( ruleReference ) )
            // InternalOntoL.g:8022:2: ( ruleReference )
            {
            // InternalOntoL.g:8022:2: ( ruleReference )
            // InternalOntoL.g:8023:3: ruleReference
            {
             before(grammarAccess.getOntoLClassAccess().getReferencesReferenceParserRuleCall_1_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getOntoLClassAccess().getReferencesReferenceParserRuleCall_1_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__ReferencesAssignment_1_1_3"


    // $ANTLR start "rule__OntoLClass__ReferencesAssignment_1_1_4"
    // InternalOntoL.g:8032:1: rule__OntoLClass__ReferencesAssignment_1_1_4 : ( ruleRegularityReference ) ;
    public final void rule__OntoLClass__ReferencesAssignment_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8036:1: ( ( ruleRegularityReference ) )
            // InternalOntoL.g:8037:2: ( ruleRegularityReference )
            {
            // InternalOntoL.g:8037:2: ( ruleRegularityReference )
            // InternalOntoL.g:8038:3: ruleRegularityReference
            {
             before(grammarAccess.getOntoLClassAccess().getReferencesRegularityReferenceParserRuleCall_1_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRegularityReference();

            state._fsp--;

             after(grammarAccess.getOntoLClassAccess().getReferencesRegularityReferenceParserRuleCall_1_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__ReferencesAssignment_1_1_4"


    // $ANTLR start "rule__OntoLClass__RefAssignmentsAssignment_1_1_5"
    // InternalOntoL.g:8047:1: rule__OntoLClass__RefAssignmentsAssignment_1_1_5 : ( ruleReferenceAssignment ) ;
    public final void rule__OntoLClass__RefAssignmentsAssignment_1_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8051:1: ( ( ruleReferenceAssignment ) )
            // InternalOntoL.g:8052:2: ( ruleReferenceAssignment )
            {
            // InternalOntoL.g:8052:2: ( ruleReferenceAssignment )
            // InternalOntoL.g:8053:3: ruleReferenceAssignment
            {
             before(grammarAccess.getOntoLClassAccess().getRefAssignmentsReferenceAssignmentParserRuleCall_1_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleReferenceAssignment();

            state._fsp--;

             after(grammarAccess.getOntoLClassAccess().getRefAssignmentsReferenceAssignmentParserRuleCall_1_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__RefAssignmentsAssignment_1_1_5"


    // $ANTLR start "rule__OrderlessClass__NameAssignment_2"
    // InternalOntoL.g:8062:1: rule__OrderlessClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OrderlessClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8066:1: ( ( RULE_ID ) )
            // InternalOntoL.g:8067:2: ( RULE_ID )
            {
            // InternalOntoL.g:8067:2: ( RULE_ID )
            // InternalOntoL.g:8068:3: RULE_ID
            {
             before(grammarAccess.getOrderlessClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOrderlessClassAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__NameAssignment_2"


    // $ANTLR start "rule__OrderlessClass__InstantiatedClassesAssignment_3_1"
    // InternalOntoL.g:8077:1: rule__OrderlessClass__InstantiatedClassesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__InstantiatedClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8081:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8082:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8082:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8083:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_1_0()); 
            // InternalOntoL.g:8084:3: ( ruleQualifiedName )
            // InternalOntoL.g:8085:4: ruleQualifiedName
            {
             before(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesOntoLClassQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesOntoLClassQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__InstantiatedClassesAssignment_3_1"


    // $ANTLR start "rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1"
    // InternalOntoL.g:8096:1: rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8100:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8101:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8101:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8102:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_2_1_0()); 
            // InternalOntoL.g:8103:3: ( ruleQualifiedName )
            // InternalOntoL.g:8104:4: ruleQualifiedName
            {
             before(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesOntoLClassQualifiedNameParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesOntoLClassQualifiedNameParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1"


    // $ANTLR start "rule__OrderlessClass__SuperClassesAssignment_4_1"
    // InternalOntoL.g:8115:1: rule__OrderlessClass__SuperClassesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__SuperClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8119:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8120:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8120:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8121:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getSuperClassesOntoLClassCrossReference_4_1_0()); 
            // InternalOntoL.g:8122:3: ( ruleQualifiedName )
            // InternalOntoL.g:8123:4: ruleQualifiedName
            {
             before(grammarAccess.getOrderlessClassAccess().getSuperClassesOntoLClassQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getOrderlessClassAccess().getSuperClassesOntoLClassQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getOrderlessClassAccess().getSuperClassesOntoLClassCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__SuperClassesAssignment_4_1"


    // $ANTLR start "rule__OrderlessClass__SuperClassesAssignment_4_2_1"
    // InternalOntoL.g:8134:1: rule__OrderlessClass__SuperClassesAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__SuperClassesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8138:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8139:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8139:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8140:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getSuperClassesOntoLClassCrossReference_4_2_1_0()); 
            // InternalOntoL.g:8141:3: ( ruleQualifiedName )
            // InternalOntoL.g:8142:4: ruleQualifiedName
            {
             before(grammarAccess.getOrderlessClassAccess().getSuperClassesOntoLClassQualifiedNameParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getOrderlessClassAccess().getSuperClassesOntoLClassQualifiedNameParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getOrderlessClassAccess().getSuperClassesOntoLClassCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__SuperClassesAssignment_4_2_1"


    // $ANTLR start "rule__OrderlessClass__SubordinatorsAssignment_5_1"
    // InternalOntoL.g:8153:1: rule__OrderlessClass__SubordinatorsAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__SubordinatorsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8157:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8158:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8158:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8159:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatorsOntoLClassCrossReference_5_1_0()); 
            // InternalOntoL.g:8160:3: ( ruleQualifiedName )
            // InternalOntoL.g:8161:4: ruleQualifiedName
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatorsOntoLClassQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getOrderlessClassAccess().getSubordinatorsOntoLClassQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getOrderlessClassAccess().getSubordinatorsOntoLClassCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__SubordinatorsAssignment_5_1"


    // $ANTLR start "rule__OrderlessClass__SubordinatorsAssignment_5_2_1"
    // InternalOntoL.g:8172:1: rule__OrderlessClass__SubordinatorsAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__SubordinatorsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8176:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8177:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8177:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8178:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatorsOntoLClassCrossReference_5_2_1_0()); 
            // InternalOntoL.g:8179:3: ( ruleQualifiedName )
            // InternalOntoL.g:8180:4: ruleQualifiedName
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatorsOntoLClassQualifiedNameParserRuleCall_5_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getOrderlessClassAccess().getSubordinatorsOntoLClassQualifiedNameParserRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getOrderlessClassAccess().getSubordinatorsOntoLClassCrossReference_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__SubordinatorsAssignment_5_2_1"


    // $ANTLR start "rule__OrderlessClass__CategorizationTypeAssignment_6_0_0"
    // InternalOntoL.g:8191:1: rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 : ( ruleCategorizationType ) ;
    public final void rule__OrderlessClass__CategorizationTypeAssignment_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8195:1: ( ( ruleCategorizationType ) )
            // InternalOntoL.g:8196:2: ( ruleCategorizationType )
            {
            // InternalOntoL.g:8196:2: ( ruleCategorizationType )
            // InternalOntoL.g:8197:3: ruleCategorizationType
            {
             before(grammarAccess.getOrderlessClassAccess().getCategorizationTypeCategorizationTypeEnumRuleCall_6_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCategorizationType();

            state._fsp--;

             after(grammarAccess.getOrderlessClassAccess().getCategorizationTypeCategorizationTypeEnumRuleCall_6_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__CategorizationTypeAssignment_6_0_0"


    // $ANTLR start "rule__OrderlessClass__BasetypeAssignment_6_0_1"
    // InternalOntoL.g:8206:1: rule__OrderlessClass__BasetypeAssignment_6_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__BasetypeAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8210:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8211:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8211:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8212:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getBasetypeOntoLClassCrossReference_6_0_1_0()); 
            // InternalOntoL.g:8213:3: ( ruleQualifiedName )
            // InternalOntoL.g:8214:4: ruleQualifiedName
            {
             before(grammarAccess.getOrderlessClassAccess().getBasetypeOntoLClassQualifiedNameParserRuleCall_6_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getOrderlessClassAccess().getBasetypeOntoLClassQualifiedNameParserRuleCall_6_0_1_0_1()); 

            }

             after(grammarAccess.getOrderlessClassAccess().getBasetypeOntoLClassCrossReference_6_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__BasetypeAssignment_6_0_1"


    // $ANTLR start "rule__OrderlessClass__PowertypeOfAssignment_6_1_1"
    // InternalOntoL.g:8225:1: rule__OrderlessClass__PowertypeOfAssignment_6_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__PowertypeOfAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8229:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8230:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8230:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8231:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getPowertypeOfOntoLClassCrossReference_6_1_1_0()); 
            // InternalOntoL.g:8232:3: ( ruleQualifiedName )
            // InternalOntoL.g:8233:4: ruleQualifiedName
            {
             before(grammarAccess.getOrderlessClassAccess().getPowertypeOfOntoLClassQualifiedNameParserRuleCall_6_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getOrderlessClassAccess().getPowertypeOfOntoLClassQualifiedNameParserRuleCall_6_1_1_0_1()); 

            }

             after(grammarAccess.getOrderlessClassAccess().getPowertypeOfOntoLClassCrossReference_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__PowertypeOfAssignment_6_1_1"


    // $ANTLR start "rule__FOClass__NameAssignment_2"
    // InternalOntoL.g:8244:1: rule__FOClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FOClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8248:1: ( ( RULE_ID ) )
            // InternalOntoL.g:8249:2: ( RULE_ID )
            {
            // InternalOntoL.g:8249:2: ( RULE_ID )
            // InternalOntoL.g:8250:3: RULE_ID
            {
             before(grammarAccess.getFOClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFOClassAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__NameAssignment_2"


    // $ANTLR start "rule__FOClass__InstantiatedClassesAssignment_3_1"
    // InternalOntoL.g:8259:1: rule__FOClass__InstantiatedClassesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__InstantiatedClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8263:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8264:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8264:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8265:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_1_0()); 
            // InternalOntoL.g:8266:3: ( ruleQualifiedName )
            // InternalOntoL.g:8267:4: ruleQualifiedName
            {
             before(grammarAccess.getFOClassAccess().getInstantiatedClassesOntoLClassQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFOClassAccess().getInstantiatedClassesOntoLClassQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getFOClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__InstantiatedClassesAssignment_3_1"


    // $ANTLR start "rule__FOClass__InstantiatedClassesAssignment_3_2_1"
    // InternalOntoL.g:8278:1: rule__FOClass__InstantiatedClassesAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__InstantiatedClassesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8282:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8283:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8283:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8284:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_2_1_0()); 
            // InternalOntoL.g:8285:3: ( ruleQualifiedName )
            // InternalOntoL.g:8286:4: ruleQualifiedName
            {
             before(grammarAccess.getFOClassAccess().getInstantiatedClassesOntoLClassQualifiedNameParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFOClassAccess().getInstantiatedClassesOntoLClassQualifiedNameParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getFOClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__InstantiatedClassesAssignment_3_2_1"


    // $ANTLR start "rule__FOClass__SuperClassesAssignment_4_1"
    // InternalOntoL.g:8297:1: rule__FOClass__SuperClassesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__SuperClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8301:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8302:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8302:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8303:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesOntoLClassCrossReference_4_1_0()); 
            // InternalOntoL.g:8304:3: ( ruleQualifiedName )
            // InternalOntoL.g:8305:4: ruleQualifiedName
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesOntoLClassQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFOClassAccess().getSuperClassesOntoLClassQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getFOClassAccess().getSuperClassesOntoLClassCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__SuperClassesAssignment_4_1"


    // $ANTLR start "rule__FOClass__SuperClassesAssignment_4_2_1"
    // InternalOntoL.g:8316:1: rule__FOClass__SuperClassesAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__SuperClassesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8320:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8321:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8321:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8322:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesOntoLClassCrossReference_4_2_1_0()); 
            // InternalOntoL.g:8323:3: ( ruleQualifiedName )
            // InternalOntoL.g:8324:4: ruleQualifiedName
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesOntoLClassQualifiedNameParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFOClassAccess().getSuperClassesOntoLClassQualifiedNameParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getFOClassAccess().getSuperClassesOntoLClassCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__SuperClassesAssignment_4_2_1"


    // $ANTLR start "rule__HOClass__OrderAssignment_1"
    // InternalOntoL.g:8335:1: rule__HOClass__OrderAssignment_1 : ( RULE_INT ) ;
    public final void rule__HOClass__OrderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8339:1: ( ( RULE_INT ) )
            // InternalOntoL.g:8340:2: ( RULE_INT )
            {
            // InternalOntoL.g:8340:2: ( RULE_INT )
            // InternalOntoL.g:8341:3: RULE_INT
            {
             before(grammarAccess.getHOClassAccess().getOrderINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getOrderINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__OrderAssignment_1"


    // $ANTLR start "rule__HOClass__NameAssignment_3"
    // InternalOntoL.g:8350:1: rule__HOClass__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__HOClass__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8354:1: ( ( RULE_ID ) )
            // InternalOntoL.g:8355:2: ( RULE_ID )
            {
            // InternalOntoL.g:8355:2: ( RULE_ID )
            // InternalOntoL.g:8356:3: RULE_ID
            {
             before(grammarAccess.getHOClassAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__NameAssignment_3"


    // $ANTLR start "rule__HOClass__InstantiatedClassesAssignment_4_1"
    // InternalOntoL.g:8365:1: rule__HOClass__InstantiatedClassesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__InstantiatedClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8369:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8370:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8370:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8371:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getInstantiatedClassesOntoLClassCrossReference_4_1_0()); 
            // InternalOntoL.g:8372:3: ( ruleQualifiedName )
            // InternalOntoL.g:8373:4: ruleQualifiedName
            {
             before(grammarAccess.getHOClassAccess().getInstantiatedClassesOntoLClassQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHOClassAccess().getInstantiatedClassesOntoLClassQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getHOClassAccess().getInstantiatedClassesOntoLClassCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__InstantiatedClassesAssignment_4_1"


    // $ANTLR start "rule__HOClass__InstantiatedClassesAssignment_4_2_1"
    // InternalOntoL.g:8384:1: rule__HOClass__InstantiatedClassesAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__InstantiatedClassesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8388:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8389:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8389:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8390:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getInstantiatedClassesOntoLClassCrossReference_4_2_1_0()); 
            // InternalOntoL.g:8391:3: ( ruleQualifiedName )
            // InternalOntoL.g:8392:4: ruleQualifiedName
            {
             before(grammarAccess.getHOClassAccess().getInstantiatedClassesOntoLClassQualifiedNameParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHOClassAccess().getInstantiatedClassesOntoLClassQualifiedNameParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getHOClassAccess().getInstantiatedClassesOntoLClassCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__InstantiatedClassesAssignment_4_2_1"


    // $ANTLR start "rule__HOClass__SuperClassesAssignment_5_1"
    // InternalOntoL.g:8403:1: rule__HOClass__SuperClassesAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SuperClassesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8407:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8408:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8408:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8409:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesOntoLClassCrossReference_5_1_0()); 
            // InternalOntoL.g:8410:3: ( ruleQualifiedName )
            // InternalOntoL.g:8411:4: ruleQualifiedName
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesOntoLClassQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHOClassAccess().getSuperClassesOntoLClassQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getHOClassAccess().getSuperClassesOntoLClassCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__SuperClassesAssignment_5_1"


    // $ANTLR start "rule__HOClass__SuperClassesAssignment_5_2_1"
    // InternalOntoL.g:8422:1: rule__HOClass__SuperClassesAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SuperClassesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8426:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8427:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8427:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8428:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesOntoLClassCrossReference_5_2_1_0()); 
            // InternalOntoL.g:8429:3: ( ruleQualifiedName )
            // InternalOntoL.g:8430:4: ruleQualifiedName
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesOntoLClassQualifiedNameParserRuleCall_5_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHOClassAccess().getSuperClassesOntoLClassQualifiedNameParserRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getHOClassAccess().getSuperClassesOntoLClassCrossReference_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__SuperClassesAssignment_5_2_1"


    // $ANTLR start "rule__HOClass__SubordinatorsAssignment_6_1"
    // InternalOntoL.g:8441:1: rule__HOClass__SubordinatorsAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SubordinatorsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8445:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8446:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8446:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8447:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsOntoLClassCrossReference_6_1_0()); 
            // InternalOntoL.g:8448:3: ( ruleQualifiedName )
            // InternalOntoL.g:8449:4: ruleQualifiedName
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsOntoLClassQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHOClassAccess().getSubordinatorsOntoLClassQualifiedNameParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getHOClassAccess().getSubordinatorsOntoLClassCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__SubordinatorsAssignment_6_1"


    // $ANTLR start "rule__HOClass__SubordinatorsAssignment_6_2_1"
    // InternalOntoL.g:8460:1: rule__HOClass__SubordinatorsAssignment_6_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SubordinatorsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8464:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8465:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8465:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8466:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsOntoLClassCrossReference_6_2_1_0()); 
            // InternalOntoL.g:8467:3: ( ruleQualifiedName )
            // InternalOntoL.g:8468:4: ruleQualifiedName
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsOntoLClassQualifiedNameParserRuleCall_6_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHOClassAccess().getSubordinatorsOntoLClassQualifiedNameParserRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getHOClassAccess().getSubordinatorsOntoLClassCrossReference_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__SubordinatorsAssignment_6_2_1"


    // $ANTLR start "rule__HOClass__CategorizationTypeAssignment_7_0_0"
    // InternalOntoL.g:8479:1: rule__HOClass__CategorizationTypeAssignment_7_0_0 : ( ruleCategorizationType ) ;
    public final void rule__HOClass__CategorizationTypeAssignment_7_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8483:1: ( ( ruleCategorizationType ) )
            // InternalOntoL.g:8484:2: ( ruleCategorizationType )
            {
            // InternalOntoL.g:8484:2: ( ruleCategorizationType )
            // InternalOntoL.g:8485:3: ruleCategorizationType
            {
             before(grammarAccess.getHOClassAccess().getCategorizationTypeCategorizationTypeEnumRuleCall_7_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCategorizationType();

            state._fsp--;

             after(grammarAccess.getHOClassAccess().getCategorizationTypeCategorizationTypeEnumRuleCall_7_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__CategorizationTypeAssignment_7_0_0"


    // $ANTLR start "rule__HOClass__BasetypeAssignment_7_0_1"
    // InternalOntoL.g:8494:1: rule__HOClass__BasetypeAssignment_7_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__BasetypeAssignment_7_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8498:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8499:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8499:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8500:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getBasetypeOntoLClassCrossReference_7_0_1_0()); 
            // InternalOntoL.g:8501:3: ( ruleQualifiedName )
            // InternalOntoL.g:8502:4: ruleQualifiedName
            {
             before(grammarAccess.getHOClassAccess().getBasetypeOntoLClassQualifiedNameParserRuleCall_7_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHOClassAccess().getBasetypeOntoLClassQualifiedNameParserRuleCall_7_0_1_0_1()); 

            }

             after(grammarAccess.getHOClassAccess().getBasetypeOntoLClassCrossReference_7_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__BasetypeAssignment_7_0_1"


    // $ANTLR start "rule__HOClass__PowertypeOfAssignment_7_1_1"
    // InternalOntoL.g:8513:1: rule__HOClass__PowertypeOfAssignment_7_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__PowertypeOfAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8517:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8518:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8518:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8519:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getPowertypeOfOntoLClassCrossReference_7_1_1_0()); 
            // InternalOntoL.g:8520:3: ( ruleQualifiedName )
            // InternalOntoL.g:8521:4: ruleQualifiedName
            {
             before(grammarAccess.getHOClassAccess().getPowertypeOfOntoLClassQualifiedNameParserRuleCall_7_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHOClassAccess().getPowertypeOfOntoLClassQualifiedNameParserRuleCall_7_1_1_0_1()); 

            }

             after(grammarAccess.getHOClassAccess().getPowertypeOfOntoLClassCrossReference_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__PowertypeOfAssignment_7_1_1"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalOntoL.g:8532:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8536:1: ( ( RULE_ID ) )
            // InternalOntoL.g:8537:2: ( RULE_ID )
            {
            // InternalOntoL.g:8537:2: ( RULE_ID )
            // InternalOntoL.g:8538:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__LowerBoundAssignment_3_1"
    // InternalOntoL.g:8547:1: rule__Attribute__LowerBoundAssignment_3_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__Attribute__LowerBoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8551:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:8552:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:8552:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:8553:3: ruleELEMENTBOUND
            {
             before(grammarAccess.getAttributeAccess().getLowerBoundELEMENTBOUNDParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getLowerBoundELEMENTBOUNDParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__LowerBoundAssignment_3_1"


    // $ANTLR start "rule__Attribute__UpperBoundAssignment_3_3"
    // InternalOntoL.g:8562:1: rule__Attribute__UpperBoundAssignment_3_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__Attribute__UpperBoundAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8566:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:8567:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:8567:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:8568:3: ruleELEMENTBOUND
            {
             before(grammarAccess.getAttributeAccess().getUpperBoundELEMENTBOUNDParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getUpperBoundELEMENTBOUNDParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__UpperBoundAssignment_3_3"


    // $ANTLR start "rule__Attribute__PropertyTypeAssignment_4"
    // InternalOntoL.g:8577:1: rule__Attribute__PropertyTypeAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__PropertyTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8581:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8582:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8582:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8583:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getPropertyTypeOntoLClassCrossReference_4_0()); 
            // InternalOntoL.g:8584:3: ( ruleQualifiedName )
            // InternalOntoL.g:8585:4: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAccess().getPropertyTypeOntoLClassQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getPropertyTypeOntoLClassQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getPropertyTypeOntoLClassCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__PropertyTypeAssignment_4"


    // $ANTLR start "rule__Attribute__SubsetOfAssignment_5_1"
    // InternalOntoL.g:8596:1: rule__Attribute__SubsetOfAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__SubsetOfAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8600:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8601:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8601:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8602:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_1_0()); 
            // InternalOntoL.g:8603:3: ( ruleQualifiedName )
            // InternalOntoL.g:8604:4: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__SubsetOfAssignment_5_1"


    // $ANTLR start "rule__Attribute__SubsetOfAssignment_5_2_1"
    // InternalOntoL.g:8615:1: rule__Attribute__SubsetOfAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__SubsetOfAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8619:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8620:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8620:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8621:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_2_1_0()); 
            // InternalOntoL.g:8622:3: ( ruleQualifiedName )
            // InternalOntoL.g:8623:4: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_5_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__SubsetOfAssignment_5_2_1"


    // $ANTLR start "rule__RegularityAttribute__RegularityAssignment_0"
    // InternalOntoL.g:8634:1: rule__RegularityAttribute__RegularityAssignment_0 : ( ( 'regularity' ) ) ;
    public final void rule__RegularityAttribute__RegularityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8638:1: ( ( ( 'regularity' ) ) )
            // InternalOntoL.g:8639:2: ( ( 'regularity' ) )
            {
            // InternalOntoL.g:8639:2: ( ( 'regularity' ) )
            // InternalOntoL.g:8640:3: ( 'regularity' )
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegularityRegularityKeyword_0_0()); 
            // InternalOntoL.g:8641:3: ( 'regularity' )
            // InternalOntoL.g:8642:4: 'regularity'
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegularityRegularityKeyword_0_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getRegularityRegularityKeyword_0_0()); 

            }

             after(grammarAccess.getRegularityAttributeAccess().getRegularityRegularityKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__RegularityAssignment_0"


    // $ANTLR start "rule__RegularityAttribute__NameAssignment_2"
    // InternalOntoL.g:8653:1: rule__RegularityAttribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RegularityAttribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8657:1: ( ( RULE_ID ) )
            // InternalOntoL.g:8658:2: ( RULE_ID )
            {
            // InternalOntoL.g:8658:2: ( RULE_ID )
            // InternalOntoL.g:8659:3: RULE_ID
            {
             before(grammarAccess.getRegularityAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__NameAssignment_2"


    // $ANTLR start "rule__RegularityAttribute__LowerBoundAssignment_4_1"
    // InternalOntoL.g:8668:1: rule__RegularityAttribute__LowerBoundAssignment_4_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__RegularityAttribute__LowerBoundAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8672:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:8673:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:8673:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:8674:3: ruleELEMENTBOUND
            {
             before(grammarAccess.getRegularityAttributeAccess().getLowerBoundELEMENTBOUNDParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getLowerBoundELEMENTBOUNDParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__LowerBoundAssignment_4_1"


    // $ANTLR start "rule__RegularityAttribute__UpperBoundAssignment_4_3"
    // InternalOntoL.g:8683:1: rule__RegularityAttribute__UpperBoundAssignment_4_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__RegularityAttribute__UpperBoundAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8687:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:8688:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:8688:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:8689:3: ruleELEMENTBOUND
            {
             before(grammarAccess.getRegularityAttributeAccess().getUpperBoundELEMENTBOUNDParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getUpperBoundELEMENTBOUNDParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__UpperBoundAssignment_4_3"


    // $ANTLR start "rule__RegularityAttribute__PropertyTypeAssignment_5"
    // InternalOntoL.g:8698:1: rule__RegularityAttribute__PropertyTypeAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityAttribute__PropertyTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8702:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8703:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8703:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8704:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityAttributeAccess().getPropertyTypeOntoLClassCrossReference_5_0()); 
            // InternalOntoL.g:8705:3: ( ruleQualifiedName )
            // InternalOntoL.g:8706:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityAttributeAccess().getPropertyTypeOntoLClassQualifiedNameParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getPropertyTypeOntoLClassQualifiedNameParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRegularityAttributeAccess().getPropertyTypeOntoLClassCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__PropertyTypeAssignment_5"


    // $ANTLR start "rule__RegularityAttribute__SubsetOfAssignment_6_1"
    // InternalOntoL.g:8717:1: rule__RegularityAttribute__SubsetOfAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityAttribute__SubsetOfAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8721:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8722:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8722:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8723:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_6_1_0()); 
            // InternalOntoL.g:8724:3: ( ruleQualifiedName )
            // InternalOntoL.g:8725:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__SubsetOfAssignment_6_1"


    // $ANTLR start "rule__RegularityAttribute__SubsetOfAssignment_6_2_1"
    // InternalOntoL.g:8736:1: rule__RegularityAttribute__SubsetOfAssignment_6_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityAttribute__SubsetOfAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8740:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8741:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8741:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8742:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_6_2_1_0()); 
            // InternalOntoL.g:8743:3: ( ruleQualifiedName )
            // InternalOntoL.g:8744:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_6_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__SubsetOfAssignment_6_2_1"


    // $ANTLR start "rule__RegularityAttribute__RegularityTypeAssignment_7_0"
    // InternalOntoL.g:8755:1: rule__RegularityAttribute__RegularityTypeAssignment_7_0 : ( ruleRegularityAttributeType ) ;
    public final void rule__RegularityAttribute__RegularityTypeAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8759:1: ( ( ruleRegularityAttributeType ) )
            // InternalOntoL.g:8760:2: ( ruleRegularityAttributeType )
            {
            // InternalOntoL.g:8760:2: ( ruleRegularityAttributeType )
            // InternalOntoL.g:8761:3: ruleRegularityAttributeType
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegularityTypeRegularityAttributeTypeEnumRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRegularityAttributeType();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getRegularityTypeRegularityAttributeTypeEnumRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__RegularityTypeAssignment_7_0"


    // $ANTLR start "rule__RegularityAttribute__RegulatedPropertyAssignment_7_1"
    // InternalOntoL.g:8770:1: rule__RegularityAttribute__RegulatedPropertyAssignment_7_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityAttribute__RegulatedPropertyAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8774:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8775:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8775:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8776:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegulatedPropertyAttributeCrossReference_7_1_0()); 
            // InternalOntoL.g:8777:3: ( ruleQualifiedName )
            // InternalOntoL.g:8778:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegulatedPropertyAttributeQualifiedNameParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getRegulatedPropertyAttributeQualifiedNameParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getRegularityAttributeAccess().getRegulatedPropertyAttributeCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__RegulatedPropertyAssignment_7_1"


    // $ANTLR start "rule__Reference__NameAssignment_1"
    // InternalOntoL.g:8789:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8793:1: ( ( RULE_ID ) )
            // InternalOntoL.g:8794:2: ( RULE_ID )
            {
            // InternalOntoL.g:8794:2: ( RULE_ID )
            // InternalOntoL.g:8795:3: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__NameAssignment_1"


    // $ANTLR start "rule__Reference__LowerBoundAssignment_3_1"
    // InternalOntoL.g:8804:1: rule__Reference__LowerBoundAssignment_3_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__Reference__LowerBoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8808:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:8809:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:8809:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:8810:3: ruleELEMENTBOUND
            {
             before(grammarAccess.getReferenceAccess().getLowerBoundELEMENTBOUNDParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getLowerBoundELEMENTBOUNDParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__LowerBoundAssignment_3_1"


    // $ANTLR start "rule__Reference__UpperBoundAssignment_3_3"
    // InternalOntoL.g:8819:1: rule__Reference__UpperBoundAssignment_3_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__Reference__UpperBoundAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8823:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:8824:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:8824:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:8825:3: ruleELEMENTBOUND
            {
             before(grammarAccess.getReferenceAccess().getUpperBoundELEMENTBOUNDParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getUpperBoundELEMENTBOUNDParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__UpperBoundAssignment_3_3"


    // $ANTLR start "rule__Reference__PropertyTypeAssignment_4"
    // InternalOntoL.g:8834:1: rule__Reference__PropertyTypeAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__PropertyTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8838:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8839:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8839:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8840:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getPropertyTypeOntoLClassCrossReference_4_0()); 
            // InternalOntoL.g:8841:3: ( ruleQualifiedName )
            // InternalOntoL.g:8842:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAccess().getPropertyTypeOntoLClassQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getPropertyTypeOntoLClassQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getPropertyTypeOntoLClassCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__PropertyTypeAssignment_4"


    // $ANTLR start "rule__Reference__SubsetOfAssignment_5_1"
    // InternalOntoL.g:8853:1: rule__Reference__SubsetOfAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__SubsetOfAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8857:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8858:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8858:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8859:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_1_0()); 
            // InternalOntoL.g:8860:3: ( ruleQualifiedName )
            // InternalOntoL.g:8861:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__SubsetOfAssignment_5_1"


    // $ANTLR start "rule__Reference__SubsetOfAssignment_5_2_1"
    // InternalOntoL.g:8872:1: rule__Reference__SubsetOfAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__SubsetOfAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8876:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8877:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8877:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8878:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_2_1_0()); 
            // InternalOntoL.g:8879:3: ( ruleQualifiedName )
            // InternalOntoL.g:8880:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_5_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__SubsetOfAssignment_5_2_1"


    // $ANTLR start "rule__Reference__OppositeToAssignment_6_1"
    // InternalOntoL.g:8891:1: rule__Reference__OppositeToAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__OppositeToAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8895:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8896:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8896:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8897:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getOppositeToReferenceCrossReference_6_1_0()); 
            // InternalOntoL.g:8898:3: ( ruleQualifiedName )
            // InternalOntoL.g:8899:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAccess().getOppositeToReferenceQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getOppositeToReferenceQualifiedNameParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getOppositeToReferenceCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__OppositeToAssignment_6_1"


    // $ANTLR start "rule__RegularityReference__RegularityAssignment_0"
    // InternalOntoL.g:8910:1: rule__RegularityReference__RegularityAssignment_0 : ( ( 'regularity' ) ) ;
    public final void rule__RegularityReference__RegularityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8914:1: ( ( ( 'regularity' ) ) )
            // InternalOntoL.g:8915:2: ( ( 'regularity' ) )
            {
            // InternalOntoL.g:8915:2: ( ( 'regularity' ) )
            // InternalOntoL.g:8916:3: ( 'regularity' )
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegularityRegularityKeyword_0_0()); 
            // InternalOntoL.g:8917:3: ( 'regularity' )
            // InternalOntoL.g:8918:4: 'regularity'
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegularityRegularityKeyword_0_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getRegularityRegularityKeyword_0_0()); 

            }

             after(grammarAccess.getRegularityReferenceAccess().getRegularityRegularityKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__RegularityAssignment_0"


    // $ANTLR start "rule__RegularityReference__NameAssignment_2"
    // InternalOntoL.g:8929:1: rule__RegularityReference__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RegularityReference__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8933:1: ( ( RULE_ID ) )
            // InternalOntoL.g:8934:2: ( RULE_ID )
            {
            // InternalOntoL.g:8934:2: ( RULE_ID )
            // InternalOntoL.g:8935:3: RULE_ID
            {
             before(grammarAccess.getRegularityReferenceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__NameAssignment_2"


    // $ANTLR start "rule__RegularityReference__LowerBoundAssignment_4_1"
    // InternalOntoL.g:8944:1: rule__RegularityReference__LowerBoundAssignment_4_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__RegularityReference__LowerBoundAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8948:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:8949:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:8949:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:8950:3: ruleELEMENTBOUND
            {
             before(grammarAccess.getRegularityReferenceAccess().getLowerBoundELEMENTBOUNDParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getLowerBoundELEMENTBOUNDParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__LowerBoundAssignment_4_1"


    // $ANTLR start "rule__RegularityReference__UpperBoundAssignment_4_3"
    // InternalOntoL.g:8959:1: rule__RegularityReference__UpperBoundAssignment_4_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__RegularityReference__UpperBoundAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8963:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:8964:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:8964:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:8965:3: ruleELEMENTBOUND
            {
             before(grammarAccess.getRegularityReferenceAccess().getUpperBoundELEMENTBOUNDParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getUpperBoundELEMENTBOUNDParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__UpperBoundAssignment_4_3"


    // $ANTLR start "rule__RegularityReference__PropertyTypeAssignment_5"
    // InternalOntoL.g:8974:1: rule__RegularityReference__PropertyTypeAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference__PropertyTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8978:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8979:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8979:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8980:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().getPropertyTypeOntoLClassCrossReference_5_0()); 
            // InternalOntoL.g:8981:3: ( ruleQualifiedName )
            // InternalOntoL.g:8982:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityReferenceAccess().getPropertyTypeOntoLClassQualifiedNameParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getPropertyTypeOntoLClassQualifiedNameParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRegularityReferenceAccess().getPropertyTypeOntoLClassCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__PropertyTypeAssignment_5"


    // $ANTLR start "rule__RegularityReference__SubsetOfAssignment_6_1"
    // InternalOntoL.g:8993:1: rule__RegularityReference__SubsetOfAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference__SubsetOfAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:8997:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:8998:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:8998:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:8999:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_6_1_0()); 
            // InternalOntoL.g:9000:3: ( ruleQualifiedName )
            // InternalOntoL.g:9001:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__SubsetOfAssignment_6_1"


    // $ANTLR start "rule__RegularityReference__SubsetOfAssignment_6_2_1"
    // InternalOntoL.g:9012:1: rule__RegularityReference__SubsetOfAssignment_6_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference__SubsetOfAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9016:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:9017:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:9017:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:9018:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_6_2_1_0()); 
            // InternalOntoL.g:9019:3: ( ruleQualifiedName )
            // InternalOntoL.g:9020:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_6_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__SubsetOfAssignment_6_2_1"


    // $ANTLR start "rule__RegularityReference__OppositeToAssignment_7_1"
    // InternalOntoL.g:9031:1: rule__RegularityReference__OppositeToAssignment_7_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference__OppositeToAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9035:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:9036:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:9036:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:9037:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().getOppositeToReferenceCrossReference_7_1_0()); 
            // InternalOntoL.g:9038:3: ( ruleQualifiedName )
            // InternalOntoL.g:9039:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityReferenceAccess().getOppositeToReferenceQualifiedNameParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getOppositeToReferenceQualifiedNameParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getRegularityReferenceAccess().getOppositeToReferenceCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__OppositeToAssignment_7_1"


    // $ANTLR start "rule__RegularityReference__RegularityTypeAssignment_8_0"
    // InternalOntoL.g:9050:1: rule__RegularityReference__RegularityTypeAssignment_8_0 : ( ruleRegularityReferenceType ) ;
    public final void rule__RegularityReference__RegularityTypeAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9054:1: ( ( ruleRegularityReferenceType ) )
            // InternalOntoL.g:9055:2: ( ruleRegularityReferenceType )
            {
            // InternalOntoL.g:9055:2: ( ruleRegularityReferenceType )
            // InternalOntoL.g:9056:3: ruleRegularityReferenceType
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegularityTypeRegularityReferenceTypeEnumRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRegularityReferenceType();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getRegularityTypeRegularityReferenceTypeEnumRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__RegularityTypeAssignment_8_0"


    // $ANTLR start "rule__RegularityReference__RegulatedPropertyAssignment_8_1"
    // InternalOntoL.g:9065:1: rule__RegularityReference__RegulatedPropertyAssignment_8_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference__RegulatedPropertyAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9069:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:9070:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:9070:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:9071:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegulatedPropertyReferenceCrossReference_8_1_0()); 
            // InternalOntoL.g:9072:3: ( ruleQualifiedName )
            // InternalOntoL.g:9073:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegulatedPropertyReferenceQualifiedNameParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getRegulatedPropertyReferenceQualifiedNameParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getRegularityReferenceAccess().getRegulatedPropertyReferenceCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__RegulatedPropertyAssignment_8_1"


    // $ANTLR start "rule__AttributeAssignment__AttributeAssignment_1"
    // InternalOntoL.g:9084:1: rule__AttributeAssignment__AttributeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AttributeAssignment__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9088:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:9089:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:9089:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:9090:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalOntoL.g:9091:3: ( ruleQualifiedName )
            // InternalOntoL.g:9092:4: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAttributeAttributeQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeAssignmentAccess().getAttributeAttributeQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__AttributeAssignment_1"


    // $ANTLR start "rule__AttributeAssignment__AssignmentsAssignment_3_0"
    // InternalOntoL.g:9103:1: rule__AttributeAssignment__AssignmentsAssignment_3_0 : ( ruleDataValue ) ;
    public final void rule__AttributeAssignment__AssignmentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9107:1: ( ( ruleDataValue ) )
            // InternalOntoL.g:9108:2: ( ruleDataValue )
            {
            // InternalOntoL.g:9108:2: ( ruleDataValue )
            // InternalOntoL.g:9109:3: ruleDataValue
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataValue();

            state._fsp--;

             after(grammarAccess.getAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__AssignmentsAssignment_3_0"


    // $ANTLR start "rule__AttributeAssignment__AssignmentsAssignment_3_1_1"
    // InternalOntoL.g:9118:1: rule__AttributeAssignment__AssignmentsAssignment_3_1_1 : ( ruleDataValue ) ;
    public final void rule__AttributeAssignment__AssignmentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9122:1: ( ( ruleDataValue ) )
            // InternalOntoL.g:9123:2: ( ruleDataValue )
            {
            // InternalOntoL.g:9123:2: ( ruleDataValue )
            // InternalOntoL.g:9124:3: ruleDataValue
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataValue();

            state._fsp--;

             after(grammarAccess.getAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__AssignmentsAssignment_3_1_1"


    // $ANTLR start "rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1"
    // InternalOntoL.g:9133:1: rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 : ( ruleDataValue ) ;
    public final void rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9137:1: ( ( ruleDataValue ) )
            // InternalOntoL.g:9138:2: ( ruleDataValue )
            {
            // InternalOntoL.g:9138:2: ( ruleDataValue )
            // InternalOntoL.g:9139:3: ruleDataValue
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_3_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataValue();

            state._fsp--;

             after(grammarAccess.getAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_3_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1"


    // $ANTLR start "rule__SimpleAttributeAssignment__AttributeAssignment_0"
    // InternalOntoL.g:9148:1: rule__SimpleAttributeAssignment__AttributeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SimpleAttributeAssignment__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9152:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:9153:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:9153:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:9154:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAttributeAttributeCrossReference_0_0()); 
            // InternalOntoL.g:9155:3: ( ruleQualifiedName )
            // InternalOntoL.g:9156:4: ruleQualifiedName
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAttributeAttributeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getAttributeAttributeQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getAttributeAttributeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__AttributeAssignment_0"


    // $ANTLR start "rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0"
    // InternalOntoL.g:9167:1: rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0 : ( ruleDataValue ) ;
    public final void rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9171:1: ( ( ruleDataValue ) )
            // InternalOntoL.g:9172:2: ( ruleDataValue )
            {
            // InternalOntoL.g:9172:2: ( ruleDataValue )
            // InternalOntoL.g:9173:3: ruleDataValue
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataValue();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0"


    // $ANTLR start "rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1"
    // InternalOntoL.g:9182:1: rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1 : ( ruleDataValue ) ;
    public final void rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9186:1: ( ( ruleDataValue ) )
            // InternalOntoL.g:9187:2: ( ruleDataValue )
            {
            // InternalOntoL.g:9187:2: ( ruleDataValue )
            // InternalOntoL.g:9188:3: ruleDataValue
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataValue();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1"


    // $ANTLR start "rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1"
    // InternalOntoL.g:9197:1: rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1 : ( ruleDataValue ) ;
    public final void rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9201:1: ( ( ruleDataValue ) )
            // InternalOntoL.g:9202:2: ( ruleDataValue )
            {
            // InternalOntoL.g:9202:2: ( ruleDataValue )
            // InternalOntoL.g:9203:3: ruleDataValue
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_2_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataValue();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_2_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1"


    // $ANTLR start "rule__ReferenceAssignment__ReferenceAssignment_1"
    // InternalOntoL.g:9212:1: rule__ReferenceAssignment__ReferenceAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9216:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:9217:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:9217:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:9218:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getReferenceReferenceCrossReference_1_0()); 
            // InternalOntoL.g:9219:3: ( ruleQualifiedName )
            // InternalOntoL.g:9220:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAssignmentAccess().getReferenceReferenceQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAssignmentAccess().getReferenceReferenceQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReferenceAssignmentAccess().getReferenceReferenceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__ReferenceAssignment_1"


    // $ANTLR start "rule__ReferenceAssignment__AssignmentsAssignment_3_0"
    // InternalOntoL.g:9231:1: rule__ReferenceAssignment__AssignmentsAssignment_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9235:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:9236:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:9236:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:9237:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_0_0()); 
            // InternalOntoL.g:9238:3: ( ruleQualifiedName )
            // InternalOntoL.g:9239:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationQualifiedNameParserRuleCall_3_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationQualifiedNameParserRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__AssignmentsAssignment_3_0"


    // $ANTLR start "rule__ReferenceAssignment__AssignmentsAssignment_3_1_1"
    // InternalOntoL.g:9250:1: rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9254:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:9255:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:9255:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:9256:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_1_1_0()); 
            // InternalOntoL.g:9257:3: ( ruleQualifiedName )
            // InternalOntoL.g:9258:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationQualifiedNameParserRuleCall_3_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationQualifiedNameParserRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__AssignmentsAssignment_3_1_1"


    // $ANTLR start "rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1"
    // InternalOntoL.g:9269:1: rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9273:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:9274:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:9274:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:9275:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_1_2_1_0()); 
            // InternalOntoL.g:9276:3: ( ruleQualifiedName )
            // InternalOntoL.g:9277:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationQualifiedNameParserRuleCall_3_1_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationQualifiedNameParserRuleCall_3_1_2_1_0_1()); 

            }

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalOntoL.g:9288:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9292:1: ( ( RULE_STRING ) )
            // InternalOntoL.g:9293:2: ( RULE_STRING )
            {
            // InternalOntoL.g:9293:2: ( RULE_STRING )
            // InternalOntoL.g:9294:3: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__NumberValue__ValueAssignment"
    // InternalOntoL.g:9303:1: rule__NumberValue__ValueAssignment : ( ruleNUMBER ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9307:1: ( ( ruleNUMBER ) )
            // InternalOntoL.g:9308:2: ( ruleNUMBER )
            {
            // InternalOntoL.g:9308:2: ( ruleNUMBER )
            // InternalOntoL.g:9309:3: ruleNUMBER
            {
             before(grammarAccess.getNumberValueAccess().getValueNUMBERParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNumberValueAccess().getValueNUMBERParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__ValueAssignment"


    // $ANTLR start "rule__BooleanValue__ValueAssignment"
    // InternalOntoL.g:9318:1: rule__BooleanValue__ValueAssignment : ( ruleBOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9322:1: ( ( ruleBOOLEAN ) )
            // InternalOntoL.g:9323:2: ( ruleBOOLEAN )
            {
            // InternalOntoL.g:9323:2: ( ruleBOOLEAN )
            // InternalOntoL.g:9324:3: ruleBOOLEAN
            {
             before(grammarAccess.getBooleanValueAccess().getValueBOOLEANParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOLEAN();

            state._fsp--;

             after(grammarAccess.getBooleanValueAccess().getValueBOOLEANParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__ValueAssignment"


    // $ANTLR start "rule__ComplexDataValue__ValueAssignment_0"
    // InternalOntoL.g:9333:1: rule__ComplexDataValue__ValueAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ComplexDataValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9337:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:9338:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:9338:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:9339:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getComplexDataValueAccess().getValueIndividualCrossReference_0_0()); 
            // InternalOntoL.g:9340:3: ( ruleQualifiedName )
            // InternalOntoL.g:9341:4: ruleQualifiedName
            {
             before(grammarAccess.getComplexDataValueAccess().getValueIndividualQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComplexDataValueAccess().getValueIndividualQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getComplexDataValueAccess().getValueIndividualCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexDataValue__ValueAssignment_0"


    // $ANTLR start "rule__ComplexDataValue__UnnamedValueAssignment_1"
    // InternalOntoL.g:9352:1: rule__ComplexDataValue__UnnamedValueAssignment_1 : ( ruleUnamedIndividual ) ;
    public final void rule__ComplexDataValue__UnnamedValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9356:1: ( ( ruleUnamedIndividual ) )
            // InternalOntoL.g:9357:2: ( ruleUnamedIndividual )
            {
            // InternalOntoL.g:9357:2: ( ruleUnamedIndividual )
            // InternalOntoL.g:9358:3: ruleUnamedIndividual
            {
             before(grammarAccess.getComplexDataValueAccess().getUnnamedValueUnamedIndividualParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnamedIndividual();

            state._fsp--;

             after(grammarAccess.getComplexDataValueAccess().getUnnamedValueUnamedIndividualParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexDataValue__UnnamedValueAssignment_1"


    // $ANTLR start "rule__UnamedIndividual__AttAssignmentsAssignment_1"
    // InternalOntoL.g:9367:1: rule__UnamedIndividual__AttAssignmentsAssignment_1 : ( ruleSimpleAttributeAssignment ) ;
    public final void rule__UnamedIndividual__AttAssignmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9371:1: ( ( ruleSimpleAttributeAssignment ) )
            // InternalOntoL.g:9372:2: ( ruleSimpleAttributeAssignment )
            {
            // InternalOntoL.g:9372:2: ( ruleSimpleAttributeAssignment )
            // InternalOntoL.g:9373:3: ruleSimpleAttributeAssignment
            {
             before(grammarAccess.getUnamedIndividualAccess().getAttAssignmentsSimpleAttributeAssignmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleAttributeAssignment();

            state._fsp--;

             after(grammarAccess.getUnamedIndividualAccess().getAttAssignmentsSimpleAttributeAssignmentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnamedIndividual__AttAssignmentsAssignment_1"


    // $ANTLR start "rule__UnamedIndividual__AttAssignmentsAssignment_2_1"
    // InternalOntoL.g:9382:1: rule__UnamedIndividual__AttAssignmentsAssignment_2_1 : ( ruleSimpleAttributeAssignment ) ;
    public final void rule__UnamedIndividual__AttAssignmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9386:1: ( ( ruleSimpleAttributeAssignment ) )
            // InternalOntoL.g:9387:2: ( ruleSimpleAttributeAssignment )
            {
            // InternalOntoL.g:9387:2: ( ruleSimpleAttributeAssignment )
            // InternalOntoL.g:9388:3: ruleSimpleAttributeAssignment
            {
             before(grammarAccess.getUnamedIndividualAccess().getAttAssignmentsSimpleAttributeAssignmentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleAttributeAssignment();

            state._fsp--;

             after(grammarAccess.getUnamedIndividualAccess().getAttAssignmentsSimpleAttributeAssignmentParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnamedIndividual__AttAssignmentsAssignment_2_1"


    // $ANTLR start "rule__GeneralizationSet__IsDisjointAssignment_0_0"
    // InternalOntoL.g:9397:1: rule__GeneralizationSet__IsDisjointAssignment_0_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9401:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoL.g:9402:2: ( ( 'disjoint' ) )
            {
            // InternalOntoL.g:9402:2: ( ( 'disjoint' ) )
            // InternalOntoL.g:9403:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 
            // InternalOntoL.g:9404:3: ( 'disjoint' )
            // InternalOntoL.g:9405:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__IsDisjointAssignment_0_0"


    // $ANTLR start "rule__GeneralizationSet__IsCompleteAssignment_0_1"
    // InternalOntoL.g:9416:1: rule__GeneralizationSet__IsCompleteAssignment_0_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9420:1: ( ( ( 'complete' ) ) )
            // InternalOntoL.g:9421:2: ( ( 'complete' ) )
            {
            // InternalOntoL.g:9421:2: ( ( 'complete' ) )
            // InternalOntoL.g:9422:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 
            // InternalOntoL.g:9423:3: ( 'complete' )
            // InternalOntoL.g:9424:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__IsCompleteAssignment_0_1"


    // $ANTLR start "rule__GeneralizationSet__IsDisjointAssignment_0_2_0"
    // InternalOntoL.g:9435:1: rule__GeneralizationSet__IsDisjointAssignment_0_2_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9439:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoL.g:9440:2: ( ( 'disjoint' ) )
            {
            // InternalOntoL.g:9440:2: ( ( 'disjoint' ) )
            // InternalOntoL.g:9441:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_2_0_0()); 
            // InternalOntoL.g:9442:3: ( 'disjoint' )
            // InternalOntoL.g:9443:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_2_0_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_2_0_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__IsDisjointAssignment_0_2_0"


    // $ANTLR start "rule__GeneralizationSet__IsCompleteAssignment_0_2_1"
    // InternalOntoL.g:9454:1: rule__GeneralizationSet__IsCompleteAssignment_0_2_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9458:1: ( ( ( 'complete' ) ) )
            // InternalOntoL.g:9459:2: ( ( 'complete' ) )
            {
            // InternalOntoL.g:9459:2: ( ( 'complete' ) )
            // InternalOntoL.g:9460:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_2_1_0()); 
            // InternalOntoL.g:9461:3: ( 'complete' )
            // InternalOntoL.g:9462:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_2_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_2_1_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__IsCompleteAssignment_0_2_1"


    // $ANTLR start "rule__GeneralizationSet__IsCompleteAssignment_0_3_0"
    // InternalOntoL.g:9473:1: rule__GeneralizationSet__IsCompleteAssignment_0_3_0 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9477:1: ( ( ( 'complete' ) ) )
            // InternalOntoL.g:9478:2: ( ( 'complete' ) )
            {
            // InternalOntoL.g:9478:2: ( ( 'complete' ) )
            // InternalOntoL.g:9479:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_3_0_0()); 
            // InternalOntoL.g:9480:3: ( 'complete' )
            // InternalOntoL.g:9481:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_3_0_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_3_0_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__IsCompleteAssignment_0_3_0"


    // $ANTLR start "rule__GeneralizationSet__IsDisjointAssignment_0_3_1"
    // InternalOntoL.g:9492:1: rule__GeneralizationSet__IsDisjointAssignment_0_3_1 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9496:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoL.g:9497:2: ( ( 'disjoint' ) )
            {
            // InternalOntoL.g:9497:2: ( ( 'disjoint' ) )
            // InternalOntoL.g:9498:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_3_1_0()); 
            // InternalOntoL.g:9499:3: ( 'disjoint' )
            // InternalOntoL.g:9500:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_3_1_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_3_1_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__IsDisjointAssignment_0_3_1"


    // $ANTLR start "rule__GeneralizationSet__NameAssignment_2"
    // InternalOntoL.g:9511:1: rule__GeneralizationSet__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GeneralizationSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9515:1: ( ( RULE_ID ) )
            // InternalOntoL.g:9516:2: ( RULE_ID )
            {
            // InternalOntoL.g:9516:2: ( RULE_ID )
            // InternalOntoL.g:9517:3: RULE_ID
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__NameAssignment_2"


    // $ANTLR start "rule__GeneralizationSet__GeneralAssignment_4"
    // InternalOntoL.g:9526:1: rule__GeneralizationSet__GeneralAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__GeneralAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9530:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:9531:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:9531:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:9532:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralOntoLClassCrossReference_4_0()); 
            // InternalOntoL.g:9533:3: ( ruleQualifiedName )
            // InternalOntoL.g:9534:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralOntoLClassQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getGeneralOntoLClassQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralOntoLClassCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__GeneralAssignment_4"


    // $ANTLR start "rule__GeneralizationSet__CategorizerAssignment_5_1"
    // InternalOntoL.g:9545:1: rule__GeneralizationSet__CategorizerAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__CategorizerAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9549:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:9550:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:9550:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:9551:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerOntoLClassCrossReference_5_1_0()); 
            // InternalOntoL.g:9552:3: ( ruleQualifiedName )
            // InternalOntoL.g:9553:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerOntoLClassQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getCategorizerOntoLClassQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getCategorizerOntoLClassCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__CategorizerAssignment_5_1"


    // $ANTLR start "rule__GeneralizationSet__SpecificsAssignment_7"
    // InternalOntoL.g:9564:1: rule__GeneralizationSet__SpecificsAssignment_7 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__SpecificsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9568:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:9569:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:9569:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:9570:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsOntoLClassCrossReference_7_0()); 
            // InternalOntoL.g:9571:3: ( ruleQualifiedName )
            // InternalOntoL.g:9572:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsOntoLClassQualifiedNameParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsOntoLClassQualifiedNameParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsOntoLClassCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__SpecificsAssignment_7"


    // $ANTLR start "rule__GeneralizationSet__SpecificsAssignment_8_1"
    // InternalOntoL.g:9583:1: rule__GeneralizationSet__SpecificsAssignment_8_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__SpecificsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:9587:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:9588:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:9588:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:9589:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsOntoLClassCrossReference_8_1_0()); 
            // InternalOntoL.g:9590:3: ( ruleQualifiedName )
            // InternalOntoL.g:9591:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsOntoLClassQualifiedNameParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsOntoLClassQualifiedNameParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsOntoLClassCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__SpecificsAssignment_8_1"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\52\1\5\1\52\1\5\1\35\2\uffff\1\35\4\uffff";
    static final String dfa_3s = "\1\70\1\5\1\57\1\5\1\61\2\uffff\1\61\4\uffff";
    static final String dfa_4s = "\5\uffff\1\5\1\2\1\uffff\1\1\1\3\1\4\1\6";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\4\uffff\1\3\10\uffff\1\2",
            "\1\4",
            "\1\6\4\uffff\1\5",
            "\1\7",
            "\1\11\3\uffff\1\10\17\uffff\1\11",
            "",
            "",
            "\1\13\3\uffff\1\12\17\uffff\1\13",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "942:1: rule__OntoLClass__Alternatives_1_1 : ( ( ( rule__OntoLClass__AttributesAssignment_1_1_0 ) ) | ( ( rule__OntoLClass__AttributesAssignment_1_1_1 ) ) | ( ( rule__OntoLClass__AttAssignmentsAssignment_1_1_2 ) ) | ( ( rule__OntoLClass__ReferencesAssignment_1_1_3 ) ) | ( ( rule__OntoLClass__ReferencesAssignment_1_1_4 ) ) | ( ( rule__OntoLClass__RefAssignmentsAssignment_1_1_5 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x061003198C000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0610031988000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000840004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000840000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0100840004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0100840000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000E20003C000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000031800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000FC0000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001400000F00000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000C080002003070L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000C080000003070L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200400000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0610031988000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000000L});

}
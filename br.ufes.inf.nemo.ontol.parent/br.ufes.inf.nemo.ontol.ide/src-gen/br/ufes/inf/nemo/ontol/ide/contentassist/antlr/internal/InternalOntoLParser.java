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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'true'", "'false'", "'categorizes'", "'completecategorizes'", "'disjointcategorizes'", "'partitions'", "'module'", "'{'", "'}'", "'include'", "';'", "'.'", "'.*'", "'import'", "'individual'", "':'", "','", "'orderless'", "'class'", "'specializes'", "'subordinatedto'", "'ispowertypeof'", "'first-order'", "'order'", "'att'", "'['", "'..'", "']'", "'subsets'", "'ref'", "'isoppositeto'", "'='", "'-'", "'none'", "'genset'", "'general'", "'specifics'", "'categorizer'", "'disjoint'", "'complete'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
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


    // $ANTLR start "entryRuleReference"
    // InternalOntoL.g:353:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalOntoL.g:354:1: ( ruleReference EOF )
            // InternalOntoL.g:355:1: ruleReference EOF
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
    // InternalOntoL.g:362:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:366:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalOntoL.g:367:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalOntoL.g:367:2: ( ( rule__Reference__Group__0 ) )
            // InternalOntoL.g:368:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalOntoL.g:369:3: ( rule__Reference__Group__0 )
            // InternalOntoL.g:369:4: rule__Reference__Group__0
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


    // $ANTLR start "entryRuleELEMENTBOUND"
    // InternalOntoL.g:378:1: entryRuleELEMENTBOUND : ruleELEMENTBOUND EOF ;
    public final void entryRuleELEMENTBOUND() throws RecognitionException {
        try {
            // InternalOntoL.g:379:1: ( ruleELEMENTBOUND EOF )
            // InternalOntoL.g:380:1: ruleELEMENTBOUND EOF
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
    // InternalOntoL.g:387:1: ruleELEMENTBOUND : ( ( rule__ELEMENTBOUND__Alternatives ) ) ;
    public final void ruleELEMENTBOUND() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:391:2: ( ( ( rule__ELEMENTBOUND__Alternatives ) ) )
            // InternalOntoL.g:392:2: ( ( rule__ELEMENTBOUND__Alternatives ) )
            {
            // InternalOntoL.g:392:2: ( ( rule__ELEMENTBOUND__Alternatives ) )
            // InternalOntoL.g:393:3: ( rule__ELEMENTBOUND__Alternatives )
            {
             before(grammarAccess.getELEMENTBOUNDAccess().getAlternatives()); 
            // InternalOntoL.g:394:3: ( rule__ELEMENTBOUND__Alternatives )
            // InternalOntoL.g:394:4: rule__ELEMENTBOUND__Alternatives
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
    // InternalOntoL.g:403:1: entryRuleAttributeAssignment : ruleAttributeAssignment EOF ;
    public final void entryRuleAttributeAssignment() throws RecognitionException {
        try {
            // InternalOntoL.g:404:1: ( ruleAttributeAssignment EOF )
            // InternalOntoL.g:405:1: ruleAttributeAssignment EOF
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
    // InternalOntoL.g:412:1: ruleAttributeAssignment : ( ( rule__AttributeAssignment__Group__0 ) ) ;
    public final void ruleAttributeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:416:2: ( ( ( rule__AttributeAssignment__Group__0 ) ) )
            // InternalOntoL.g:417:2: ( ( rule__AttributeAssignment__Group__0 ) )
            {
            // InternalOntoL.g:417:2: ( ( rule__AttributeAssignment__Group__0 ) )
            // InternalOntoL.g:418:3: ( rule__AttributeAssignment__Group__0 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getGroup()); 
            // InternalOntoL.g:419:3: ( rule__AttributeAssignment__Group__0 )
            // InternalOntoL.g:419:4: rule__AttributeAssignment__Group__0
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
    // InternalOntoL.g:428:1: entryRuleSimpleAttributeAssignment : ruleSimpleAttributeAssignment EOF ;
    public final void entryRuleSimpleAttributeAssignment() throws RecognitionException {
        try {
            // InternalOntoL.g:429:1: ( ruleSimpleAttributeAssignment EOF )
            // InternalOntoL.g:430:1: ruleSimpleAttributeAssignment EOF
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
    // InternalOntoL.g:437:1: ruleSimpleAttributeAssignment : ( ( rule__SimpleAttributeAssignment__Group__0 ) ) ;
    public final void ruleSimpleAttributeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:441:2: ( ( ( rule__SimpleAttributeAssignment__Group__0 ) ) )
            // InternalOntoL.g:442:2: ( ( rule__SimpleAttributeAssignment__Group__0 ) )
            {
            // InternalOntoL.g:442:2: ( ( rule__SimpleAttributeAssignment__Group__0 ) )
            // InternalOntoL.g:443:3: ( rule__SimpleAttributeAssignment__Group__0 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup()); 
            // InternalOntoL.g:444:3: ( rule__SimpleAttributeAssignment__Group__0 )
            // InternalOntoL.g:444:4: rule__SimpleAttributeAssignment__Group__0
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
    // InternalOntoL.g:453:1: entryRuleReferenceAssignment : ruleReferenceAssignment EOF ;
    public final void entryRuleReferenceAssignment() throws RecognitionException {
        try {
            // InternalOntoL.g:454:1: ( ruleReferenceAssignment EOF )
            // InternalOntoL.g:455:1: ruleReferenceAssignment EOF
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
    // InternalOntoL.g:462:1: ruleReferenceAssignment : ( ( rule__ReferenceAssignment__Group__0 ) ) ;
    public final void ruleReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:466:2: ( ( ( rule__ReferenceAssignment__Group__0 ) ) )
            // InternalOntoL.g:467:2: ( ( rule__ReferenceAssignment__Group__0 ) )
            {
            // InternalOntoL.g:467:2: ( ( rule__ReferenceAssignment__Group__0 ) )
            // InternalOntoL.g:468:3: ( rule__ReferenceAssignment__Group__0 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getGroup()); 
            // InternalOntoL.g:469:3: ( rule__ReferenceAssignment__Group__0 )
            // InternalOntoL.g:469:4: rule__ReferenceAssignment__Group__0
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
    // InternalOntoL.g:478:1: entryRuleDataValue : ruleDataValue EOF ;
    public final void entryRuleDataValue() throws RecognitionException {
        try {
            // InternalOntoL.g:479:1: ( ruleDataValue EOF )
            // InternalOntoL.g:480:1: ruleDataValue EOF
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
    // InternalOntoL.g:487:1: ruleDataValue : ( ( rule__DataValue__Alternatives ) ) ;
    public final void ruleDataValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:491:2: ( ( ( rule__DataValue__Alternatives ) ) )
            // InternalOntoL.g:492:2: ( ( rule__DataValue__Alternatives ) )
            {
            // InternalOntoL.g:492:2: ( ( rule__DataValue__Alternatives ) )
            // InternalOntoL.g:493:3: ( rule__DataValue__Alternatives )
            {
             before(grammarAccess.getDataValueAccess().getAlternatives()); 
            // InternalOntoL.g:494:3: ( rule__DataValue__Alternatives )
            // InternalOntoL.g:494:4: rule__DataValue__Alternatives
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


    // $ANTLR start "entryRuleReferenceValue"
    // InternalOntoL.g:503:1: entryRuleReferenceValue : ruleReferenceValue EOF ;
    public final void entryRuleReferenceValue() throws RecognitionException {
        try {
            // InternalOntoL.g:504:1: ( ruleReferenceValue EOF )
            // InternalOntoL.g:505:1: ruleReferenceValue EOF
            {
             before(grammarAccess.getReferenceValueRule()); 
            pushFollow(FOLLOW_1);
            ruleReferenceValue();

            state._fsp--;

             after(grammarAccess.getReferenceValueRule()); 
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
    // $ANTLR end "entryRuleReferenceValue"


    // $ANTLR start "ruleReferenceValue"
    // InternalOntoL.g:512:1: ruleReferenceValue : ( ( rule__ReferenceValue__ValueAssignment ) ) ;
    public final void ruleReferenceValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:516:2: ( ( ( rule__ReferenceValue__ValueAssignment ) ) )
            // InternalOntoL.g:517:2: ( ( rule__ReferenceValue__ValueAssignment ) )
            {
            // InternalOntoL.g:517:2: ( ( rule__ReferenceValue__ValueAssignment ) )
            // InternalOntoL.g:518:3: ( rule__ReferenceValue__ValueAssignment )
            {
             before(grammarAccess.getReferenceValueAccess().getValueAssignment()); 
            // InternalOntoL.g:519:3: ( rule__ReferenceValue__ValueAssignment )
            // InternalOntoL.g:519:4: rule__ReferenceValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getReferenceValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferenceValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalOntoL.g:528:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalOntoL.g:529:1: ( ruleStringValue EOF )
            // InternalOntoL.g:530:1: ruleStringValue EOF
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
    // InternalOntoL.g:537:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:541:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalOntoL.g:542:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalOntoL.g:542:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalOntoL.g:543:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalOntoL.g:544:3: ( rule__StringValue__ValueAssignment )
            // InternalOntoL.g:544:4: rule__StringValue__ValueAssignment
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
    // InternalOntoL.g:553:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalOntoL.g:554:1: ( ruleNumberValue EOF )
            // InternalOntoL.g:555:1: ruleNumberValue EOF
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
    // InternalOntoL.g:562:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:566:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalOntoL.g:567:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalOntoL.g:567:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalOntoL.g:568:3: ( rule__NumberValue__ValueAssignment )
            {
             before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            // InternalOntoL.g:569:3: ( rule__NumberValue__ValueAssignment )
            // InternalOntoL.g:569:4: rule__NumberValue__ValueAssignment
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
    // InternalOntoL.g:578:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // InternalOntoL.g:579:1: ( ruleNUMBER EOF )
            // InternalOntoL.g:580:1: ruleNUMBER EOF
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
    // InternalOntoL.g:587:1: ruleNUMBER : ( ( rule__NUMBER__Group__0 ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:591:2: ( ( ( rule__NUMBER__Group__0 ) ) )
            // InternalOntoL.g:592:2: ( ( rule__NUMBER__Group__0 ) )
            {
            // InternalOntoL.g:592:2: ( ( rule__NUMBER__Group__0 ) )
            // InternalOntoL.g:593:3: ( rule__NUMBER__Group__0 )
            {
             before(grammarAccess.getNUMBERAccess().getGroup()); 
            // InternalOntoL.g:594:3: ( rule__NUMBER__Group__0 )
            // InternalOntoL.g:594:4: rule__NUMBER__Group__0
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
    // InternalOntoL.g:603:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalOntoL.g:604:1: ( ruleBooleanValue EOF )
            // InternalOntoL.g:605:1: ruleBooleanValue EOF
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
    // InternalOntoL.g:612:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:616:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalOntoL.g:617:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalOntoL.g:617:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalOntoL.g:618:3: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // InternalOntoL.g:619:3: ( rule__BooleanValue__ValueAssignment )
            // InternalOntoL.g:619:4: rule__BooleanValue__ValueAssignment
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
    // InternalOntoL.g:628:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // InternalOntoL.g:629:1: ( ruleBOOLEAN EOF )
            // InternalOntoL.g:630:1: ruleBOOLEAN EOF
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
    // InternalOntoL.g:637:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:641:2: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // InternalOntoL.g:642:2: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // InternalOntoL.g:642:2: ( ( rule__BOOLEAN__Alternatives ) )
            // InternalOntoL.g:643:3: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // InternalOntoL.g:644:3: ( rule__BOOLEAN__Alternatives )
            // InternalOntoL.g:644:4: rule__BOOLEAN__Alternatives
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
    // InternalOntoL.g:653:1: entryRuleNoneValue : ruleNoneValue EOF ;
    public final void entryRuleNoneValue() throws RecognitionException {
        try {
            // InternalOntoL.g:654:1: ( ruleNoneValue EOF )
            // InternalOntoL.g:655:1: ruleNoneValue EOF
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
    // InternalOntoL.g:662:1: ruleNoneValue : ( ( rule__NoneValue__Group__0 ) ) ;
    public final void ruleNoneValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:666:2: ( ( ( rule__NoneValue__Group__0 ) ) )
            // InternalOntoL.g:667:2: ( ( rule__NoneValue__Group__0 ) )
            {
            // InternalOntoL.g:667:2: ( ( rule__NoneValue__Group__0 ) )
            // InternalOntoL.g:668:3: ( rule__NoneValue__Group__0 )
            {
             before(grammarAccess.getNoneValueAccess().getGroup()); 
            // InternalOntoL.g:669:3: ( rule__NoneValue__Group__0 )
            // InternalOntoL.g:669:4: rule__NoneValue__Group__0
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
    // InternalOntoL.g:678:1: entryRuleComplexDataValue : ruleComplexDataValue EOF ;
    public final void entryRuleComplexDataValue() throws RecognitionException {
        try {
            // InternalOntoL.g:679:1: ( ruleComplexDataValue EOF )
            // InternalOntoL.g:680:1: ruleComplexDataValue EOF
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
    // InternalOntoL.g:687:1: ruleComplexDataValue : ( ( rule__ComplexDataValue__Alternatives ) ) ;
    public final void ruleComplexDataValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:691:2: ( ( ( rule__ComplexDataValue__Alternatives ) ) )
            // InternalOntoL.g:692:2: ( ( rule__ComplexDataValue__Alternatives ) )
            {
            // InternalOntoL.g:692:2: ( ( rule__ComplexDataValue__Alternatives ) )
            // InternalOntoL.g:693:3: ( rule__ComplexDataValue__Alternatives )
            {
             before(grammarAccess.getComplexDataValueAccess().getAlternatives()); 
            // InternalOntoL.g:694:3: ( rule__ComplexDataValue__Alternatives )
            // InternalOntoL.g:694:4: rule__ComplexDataValue__Alternatives
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
    // InternalOntoL.g:703:1: entryRuleUnamedIndividual : ruleUnamedIndividual EOF ;
    public final void entryRuleUnamedIndividual() throws RecognitionException {
        try {
            // InternalOntoL.g:704:1: ( ruleUnamedIndividual EOF )
            // InternalOntoL.g:705:1: ruleUnamedIndividual EOF
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
    // InternalOntoL.g:712:1: ruleUnamedIndividual : ( ( rule__UnamedIndividual__Group__0 ) ) ;
    public final void ruleUnamedIndividual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:716:2: ( ( ( rule__UnamedIndividual__Group__0 ) ) )
            // InternalOntoL.g:717:2: ( ( rule__UnamedIndividual__Group__0 ) )
            {
            // InternalOntoL.g:717:2: ( ( rule__UnamedIndividual__Group__0 ) )
            // InternalOntoL.g:718:3: ( rule__UnamedIndividual__Group__0 )
            {
             before(grammarAccess.getUnamedIndividualAccess().getGroup()); 
            // InternalOntoL.g:719:3: ( rule__UnamedIndividual__Group__0 )
            // InternalOntoL.g:719:4: rule__UnamedIndividual__Group__0
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
    // InternalOntoL.g:728:1: entryRuleGeneralizationSet : ruleGeneralizationSet EOF ;
    public final void entryRuleGeneralizationSet() throws RecognitionException {
        try {
            // InternalOntoL.g:729:1: ( ruleGeneralizationSet EOF )
            // InternalOntoL.g:730:1: ruleGeneralizationSet EOF
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
    // InternalOntoL.g:737:1: ruleGeneralizationSet : ( ( rule__GeneralizationSet__Group__0 ) ) ;
    public final void ruleGeneralizationSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:741:2: ( ( ( rule__GeneralizationSet__Group__0 ) ) )
            // InternalOntoL.g:742:2: ( ( rule__GeneralizationSet__Group__0 ) )
            {
            // InternalOntoL.g:742:2: ( ( rule__GeneralizationSet__Group__0 ) )
            // InternalOntoL.g:743:3: ( rule__GeneralizationSet__Group__0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup()); 
            // InternalOntoL.g:744:3: ( rule__GeneralizationSet__Group__0 )
            // InternalOntoL.g:744:4: rule__GeneralizationSet__Group__0
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
    // InternalOntoL.g:753:1: ruleCategorizationType : ( ( rule__CategorizationType__Alternatives ) ) ;
    public final void ruleCategorizationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:757:1: ( ( ( rule__CategorizationType__Alternatives ) ) )
            // InternalOntoL.g:758:2: ( ( rule__CategorizationType__Alternatives ) )
            {
            // InternalOntoL.g:758:2: ( ( rule__CategorizationType__Alternatives ) )
            // InternalOntoL.g:759:3: ( rule__CategorizationType__Alternatives )
            {
             before(grammarAccess.getCategorizationTypeAccess().getAlternatives()); 
            // InternalOntoL.g:760:3: ( rule__CategorizationType__Alternatives )
            // InternalOntoL.g:760:4: rule__CategorizationType__Alternatives
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


    // $ANTLR start "rule__Model__Alternatives_3"
    // InternalOntoL.g:768:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__Group_3_0__0 ) ) | ( ( rule__Model__ElementsAssignment_3_1 ) ) );
    public final void rule__Model__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:772:1: ( ( ( rule__Model__Group_3_0__0 ) ) | ( ( rule__Model__ElementsAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=25 && LA1_0<=26)||(LA1_0>=29 && LA1_0<=30)||(LA1_0>=34 && LA1_0<=35)||LA1_0==46||(LA1_0>=50 && LA1_0<=51)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalOntoL.g:773:2: ( ( rule__Model__Group_3_0__0 ) )
                    {
                    // InternalOntoL.g:773:2: ( ( rule__Model__Group_3_0__0 ) )
                    // InternalOntoL.g:774:3: ( rule__Model__Group_3_0__0 )
                    {
                     before(grammarAccess.getModelAccess().getGroup_3_0()); 
                    // InternalOntoL.g:775:3: ( rule__Model__Group_3_0__0 )
                    // InternalOntoL.g:775:4: rule__Model__Group_3_0__0
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
                    // InternalOntoL.g:779:2: ( ( rule__Model__ElementsAssignment_3_1 ) )
                    {
                    // InternalOntoL.g:779:2: ( ( rule__Model__ElementsAssignment_3_1 ) )
                    // InternalOntoL.g:780:3: ( rule__Model__ElementsAssignment_3_1 )
                    {
                     before(grammarAccess.getModelAccess().getElementsAssignment_3_1()); 
                    // InternalOntoL.g:781:3: ( rule__Model__ElementsAssignment_3_1 )
                    // InternalOntoL.g:781:4: rule__Model__ElementsAssignment_3_1
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
    // InternalOntoL.g:789:1: rule__ModelElement__Alternatives_0 : ( ( ruleImport ) | ( ruleEntityDeclaration ) | ( ruleGeneralizationSet ) );
    public final void rule__ModelElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:793:1: ( ( ruleImport ) | ( ruleEntityDeclaration ) | ( ruleGeneralizationSet ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 26:
            case 29:
            case 30:
            case 34:
            case 35:
                {
                alt2=2;
                }
                break;
            case 46:
            case 50:
            case 51:
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
                    // InternalOntoL.g:794:2: ( ruleImport )
                    {
                    // InternalOntoL.g:794:2: ( ruleImport )
                    // InternalOntoL.g:795:3: ruleImport
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
                    // InternalOntoL.g:800:2: ( ruleEntityDeclaration )
                    {
                    // InternalOntoL.g:800:2: ( ruleEntityDeclaration )
                    // InternalOntoL.g:801:3: ruleEntityDeclaration
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
                    // InternalOntoL.g:806:2: ( ruleGeneralizationSet )
                    {
                    // InternalOntoL.g:806:2: ( ruleGeneralizationSet )
                    // InternalOntoL.g:807:3: ruleGeneralizationSet
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
    // InternalOntoL.g:816:1: rule__EntityDeclaration__Alternatives : ( ( ruleOntoLClass ) | ( ruleIndividual ) );
    public final void rule__EntityDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:820:1: ( ( ruleOntoLClass ) | ( ruleIndividual ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=29 && LA3_0<=30)||(LA3_0>=34 && LA3_0<=35)) ) {
                alt3=1;
            }
            else if ( (LA3_0==26) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalOntoL.g:821:2: ( ruleOntoLClass )
                    {
                    // InternalOntoL.g:821:2: ( ruleOntoLClass )
                    // InternalOntoL.g:822:3: ruleOntoLClass
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
                    // InternalOntoL.g:827:2: ( ruleIndividual )
                    {
                    // InternalOntoL.g:827:2: ( ruleIndividual )
                    // InternalOntoL.g:828:3: ruleIndividual
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
    // InternalOntoL.g:837:1: rule__Individual__Alternatives_3_1 : ( ( ( rule__Individual__AttAssignmentsAssignment_3_1_0 ) ) | ( ( rule__Individual__RefAssignmentsAssignment_3_1_1 ) ) );
    public final void rule__Individual__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:841:1: ( ( ( rule__Individual__AttAssignmentsAssignment_3_1_0 ) ) | ( ( rule__Individual__RefAssignmentsAssignment_3_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            else if ( (LA4_0==41) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalOntoL.g:842:2: ( ( rule__Individual__AttAssignmentsAssignment_3_1_0 ) )
                    {
                    // InternalOntoL.g:842:2: ( ( rule__Individual__AttAssignmentsAssignment_3_1_0 ) )
                    // InternalOntoL.g:843:3: ( rule__Individual__AttAssignmentsAssignment_3_1_0 )
                    {
                     before(grammarAccess.getIndividualAccess().getAttAssignmentsAssignment_3_1_0()); 
                    // InternalOntoL.g:844:3: ( rule__Individual__AttAssignmentsAssignment_3_1_0 )
                    // InternalOntoL.g:844:4: rule__Individual__AttAssignmentsAssignment_3_1_0
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
                    // InternalOntoL.g:848:2: ( ( rule__Individual__RefAssignmentsAssignment_3_1_1 ) )
                    {
                    // InternalOntoL.g:848:2: ( ( rule__Individual__RefAssignmentsAssignment_3_1_1 ) )
                    // InternalOntoL.g:849:3: ( rule__Individual__RefAssignmentsAssignment_3_1_1 )
                    {
                     before(grammarAccess.getIndividualAccess().getRefAssignmentsAssignment_3_1_1()); 
                    // InternalOntoL.g:850:3: ( rule__Individual__RefAssignmentsAssignment_3_1_1 )
                    // InternalOntoL.g:850:4: rule__Individual__RefAssignmentsAssignment_3_1_1
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
    // InternalOntoL.g:858:1: rule__OntoLClass__Alternatives_0 : ( ( ruleOrderlessClass ) | ( ruleHOClass ) | ( ruleFOClass ) );
    public final void rule__OntoLClass__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:862:1: ( ( ruleOrderlessClass ) | ( ruleHOClass ) | ( ruleFOClass ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt5=1;
                }
                break;
            case 35:
                {
                alt5=2;
                }
                break;
            case 30:
            case 34:
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
                    // InternalOntoL.g:863:2: ( ruleOrderlessClass )
                    {
                    // InternalOntoL.g:863:2: ( ruleOrderlessClass )
                    // InternalOntoL.g:864:3: ruleOrderlessClass
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
                    // InternalOntoL.g:869:2: ( ruleHOClass )
                    {
                    // InternalOntoL.g:869:2: ( ruleHOClass )
                    // InternalOntoL.g:870:3: ruleHOClass
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
                    // InternalOntoL.g:875:2: ( ruleFOClass )
                    {
                    // InternalOntoL.g:875:2: ( ruleFOClass )
                    // InternalOntoL.g:876:3: ruleFOClass
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
    // InternalOntoL.g:885:1: rule__OntoLClass__Alternatives_1_1 : ( ( ( rule__OntoLClass__AttributesAssignment_1_1_0 ) ) | ( ( rule__OntoLClass__AttAssignmentsAssignment_1_1_1 ) ) | ( ( rule__OntoLClass__ReferencesAssignment_1_1_2 ) ) | ( ( rule__OntoLClass__RefAssignmentsAssignment_1_1_3 ) ) );
    public final void rule__OntoLClass__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:889:1: ( ( ( rule__OntoLClass__AttributesAssignment_1_1_0 ) ) | ( ( rule__OntoLClass__AttAssignmentsAssignment_1_1_1 ) ) | ( ( rule__OntoLClass__ReferencesAssignment_1_1_2 ) ) | ( ( rule__OntoLClass__RefAssignmentsAssignment_1_1_3 ) ) )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==36) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==27) ) {
                        alt6=1;
                    }
                    else if ( (LA6_3==23||LA6_3==43) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==41) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_ID) ) {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==23||LA6_4==43) ) {
                        alt6=4;
                    }
                    else if ( (LA6_4==27) ) {
                        alt6=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOntoL.g:890:2: ( ( rule__OntoLClass__AttributesAssignment_1_1_0 ) )
                    {
                    // InternalOntoL.g:890:2: ( ( rule__OntoLClass__AttributesAssignment_1_1_0 ) )
                    // InternalOntoL.g:891:3: ( rule__OntoLClass__AttributesAssignment_1_1_0 )
                    {
                     before(grammarAccess.getOntoLClassAccess().getAttributesAssignment_1_1_0()); 
                    // InternalOntoL.g:892:3: ( rule__OntoLClass__AttributesAssignment_1_1_0 )
                    // InternalOntoL.g:892:4: rule__OntoLClass__AttributesAssignment_1_1_0
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
                    // InternalOntoL.g:896:2: ( ( rule__OntoLClass__AttAssignmentsAssignment_1_1_1 ) )
                    {
                    // InternalOntoL.g:896:2: ( ( rule__OntoLClass__AttAssignmentsAssignment_1_1_1 ) )
                    // InternalOntoL.g:897:3: ( rule__OntoLClass__AttAssignmentsAssignment_1_1_1 )
                    {
                     before(grammarAccess.getOntoLClassAccess().getAttAssignmentsAssignment_1_1_1()); 
                    // InternalOntoL.g:898:3: ( rule__OntoLClass__AttAssignmentsAssignment_1_1_1 )
                    // InternalOntoL.g:898:4: rule__OntoLClass__AttAssignmentsAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntoLClass__AttAssignmentsAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOntoLClassAccess().getAttAssignmentsAssignment_1_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:902:2: ( ( rule__OntoLClass__ReferencesAssignment_1_1_2 ) )
                    {
                    // InternalOntoL.g:902:2: ( ( rule__OntoLClass__ReferencesAssignment_1_1_2 ) )
                    // InternalOntoL.g:903:3: ( rule__OntoLClass__ReferencesAssignment_1_1_2 )
                    {
                     before(grammarAccess.getOntoLClassAccess().getReferencesAssignment_1_1_2()); 
                    // InternalOntoL.g:904:3: ( rule__OntoLClass__ReferencesAssignment_1_1_2 )
                    // InternalOntoL.g:904:4: rule__OntoLClass__ReferencesAssignment_1_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntoLClass__ReferencesAssignment_1_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getOntoLClassAccess().getReferencesAssignment_1_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:908:2: ( ( rule__OntoLClass__RefAssignmentsAssignment_1_1_3 ) )
                    {
                    // InternalOntoL.g:908:2: ( ( rule__OntoLClass__RefAssignmentsAssignment_1_1_3 ) )
                    // InternalOntoL.g:909:3: ( rule__OntoLClass__RefAssignmentsAssignment_1_1_3 )
                    {
                     before(grammarAccess.getOntoLClassAccess().getRefAssignmentsAssignment_1_1_3()); 
                    // InternalOntoL.g:910:3: ( rule__OntoLClass__RefAssignmentsAssignment_1_1_3 )
                    // InternalOntoL.g:910:4: rule__OntoLClass__RefAssignmentsAssignment_1_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntoLClass__RefAssignmentsAssignment_1_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getOntoLClassAccess().getRefAssignmentsAssignment_1_1_3()); 

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
    // InternalOntoL.g:918:1: rule__OrderlessClass__Alternatives_6 : ( ( ( rule__OrderlessClass__Group_6_0__0 ) ) | ( ( rule__OrderlessClass__Group_6_1__0 ) ) );
    public final void rule__OrderlessClass__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:922:1: ( ( ( rule__OrderlessClass__Group_6_0__0 ) ) | ( ( rule__OrderlessClass__Group_6_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=14 && LA7_0<=17)) ) {
                alt7=1;
            }
            else if ( (LA7_0==33) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntoL.g:923:2: ( ( rule__OrderlessClass__Group_6_0__0 ) )
                    {
                    // InternalOntoL.g:923:2: ( ( rule__OrderlessClass__Group_6_0__0 ) )
                    // InternalOntoL.g:924:3: ( rule__OrderlessClass__Group_6_0__0 )
                    {
                     before(grammarAccess.getOrderlessClassAccess().getGroup_6_0()); 
                    // InternalOntoL.g:925:3: ( rule__OrderlessClass__Group_6_0__0 )
                    // InternalOntoL.g:925:4: rule__OrderlessClass__Group_6_0__0
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
                    // InternalOntoL.g:929:2: ( ( rule__OrderlessClass__Group_6_1__0 ) )
                    {
                    // InternalOntoL.g:929:2: ( ( rule__OrderlessClass__Group_6_1__0 ) )
                    // InternalOntoL.g:930:3: ( rule__OrderlessClass__Group_6_1__0 )
                    {
                     before(grammarAccess.getOrderlessClassAccess().getGroup_6_1()); 
                    // InternalOntoL.g:931:3: ( rule__OrderlessClass__Group_6_1__0 )
                    // InternalOntoL.g:931:4: rule__OrderlessClass__Group_6_1__0
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
    // InternalOntoL.g:939:1: rule__HOClass__Alternatives_7 : ( ( ( rule__HOClass__Group_7_0__0 ) ) | ( ( rule__HOClass__Group_7_1__0 ) ) );
    public final void rule__HOClass__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:943:1: ( ( ( rule__HOClass__Group_7_0__0 ) ) | ( ( rule__HOClass__Group_7_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=14 && LA8_0<=17)) ) {
                alt8=1;
            }
            else if ( (LA8_0==33) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOntoL.g:944:2: ( ( rule__HOClass__Group_7_0__0 ) )
                    {
                    // InternalOntoL.g:944:2: ( ( rule__HOClass__Group_7_0__0 ) )
                    // InternalOntoL.g:945:3: ( rule__HOClass__Group_7_0__0 )
                    {
                     before(grammarAccess.getHOClassAccess().getGroup_7_0()); 
                    // InternalOntoL.g:946:3: ( rule__HOClass__Group_7_0__0 )
                    // InternalOntoL.g:946:4: rule__HOClass__Group_7_0__0
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
                    // InternalOntoL.g:950:2: ( ( rule__HOClass__Group_7_1__0 ) )
                    {
                    // InternalOntoL.g:950:2: ( ( rule__HOClass__Group_7_1__0 ) )
                    // InternalOntoL.g:951:3: ( rule__HOClass__Group_7_1__0 )
                    {
                     before(grammarAccess.getHOClassAccess().getGroup_7_1()); 
                    // InternalOntoL.g:952:3: ( rule__HOClass__Group_7_1__0 )
                    // InternalOntoL.g:952:4: rule__HOClass__Group_7_1__0
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
    // InternalOntoL.g:960:1: rule__ELEMENTBOUND__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__ELEMENTBOUND__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:964:1: ( ( '*' ) | ( RULE_INT ) )
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
                    // InternalOntoL.g:965:2: ( '*' )
                    {
                    // InternalOntoL.g:965:2: ( '*' )
                    // InternalOntoL.g:966:3: '*'
                    {
                     before(grammarAccess.getELEMENTBOUNDAccess().getAsteriskKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getELEMENTBOUNDAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:971:2: ( RULE_INT )
                    {
                    // InternalOntoL.g:971:2: ( RULE_INT )
                    // InternalOntoL.g:972:3: RULE_INT
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
    // InternalOntoL.g:981:1: rule__AttributeAssignment__Alternatives_3 : ( ( ( rule__AttributeAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__AttributeAssignment__Group_3_1__0 ) ) );
    public final void rule__AttributeAssignment__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:985:1: ( ( ( rule__AttributeAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__AttributeAssignment__Group_3_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_STRING)||(LA10_0>=12 && LA10_0<=13)||LA10_0==37||(LA10_0>=44 && LA10_0<=45)) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntoL.g:986:2: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_0 ) )
                    {
                    // InternalOntoL.g:986:2: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_0 ) )
                    // InternalOntoL.g:987:3: ( rule__AttributeAssignment__AssignmentsAssignment_3_0 )
                    {
                     before(grammarAccess.getAttributeAssignmentAccess().getAssignmentsAssignment_3_0()); 
                    // InternalOntoL.g:988:3: ( rule__AttributeAssignment__AssignmentsAssignment_3_0 )
                    // InternalOntoL.g:988:4: rule__AttributeAssignment__AssignmentsAssignment_3_0
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
                    // InternalOntoL.g:992:2: ( ( rule__AttributeAssignment__Group_3_1__0 ) )
                    {
                    // InternalOntoL.g:992:2: ( ( rule__AttributeAssignment__Group_3_1__0 ) )
                    // InternalOntoL.g:993:3: ( rule__AttributeAssignment__Group_3_1__0 )
                    {
                     before(grammarAccess.getAttributeAssignmentAccess().getGroup_3_1()); 
                    // InternalOntoL.g:994:3: ( rule__AttributeAssignment__Group_3_1__0 )
                    // InternalOntoL.g:994:4: rule__AttributeAssignment__Group_3_1__0
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
    // InternalOntoL.g:1002:1: rule__SimpleAttributeAssignment__Alternatives_2 : ( ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0 ) ) | ( ( rule__SimpleAttributeAssignment__Group_2_1__0 ) ) );
    public final void rule__SimpleAttributeAssignment__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1006:1: ( ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0 ) ) | ( ( rule__SimpleAttributeAssignment__Group_2_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_STRING)||(LA11_0>=12 && LA11_0<=13)||LA11_0==37||(LA11_0>=44 && LA11_0<=45)) ) {
                alt11=1;
            }
            else if ( (LA11_0==19) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalOntoL.g:1007:2: ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0 ) )
                    {
                    // InternalOntoL.g:1007:2: ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0 ) )
                    // InternalOntoL.g:1008:3: ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getAssignmentsAssignment_2_0()); 
                    // InternalOntoL.g:1009:3: ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0 )
                    // InternalOntoL.g:1009:4: rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0
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
                    // InternalOntoL.g:1013:2: ( ( rule__SimpleAttributeAssignment__Group_2_1__0 ) )
                    {
                    // InternalOntoL.g:1013:2: ( ( rule__SimpleAttributeAssignment__Group_2_1__0 ) )
                    // InternalOntoL.g:1014:3: ( rule__SimpleAttributeAssignment__Group_2_1__0 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_1()); 
                    // InternalOntoL.g:1015:3: ( rule__SimpleAttributeAssignment__Group_2_1__0 )
                    // InternalOntoL.g:1015:4: rule__SimpleAttributeAssignment__Group_2_1__0
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
    // InternalOntoL.g:1023:1: rule__ReferenceAssignment__Alternatives_3 : ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__ReferenceAssignment__Group_3_1__0 ) ) );
    public final void rule__ReferenceAssignment__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1027:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__ReferenceAssignment__Group_3_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalOntoL.g:1028:2: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) )
                    {
                    // InternalOntoL.g:1028:2: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) )
                    // InternalOntoL.g:1029:3: ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 )
                    {
                     before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_0()); 
                    // InternalOntoL.g:1030:3: ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 )
                    // InternalOntoL.g:1030:4: rule__ReferenceAssignment__AssignmentsAssignment_3_0
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
                    // InternalOntoL.g:1034:2: ( ( rule__ReferenceAssignment__Group_3_1__0 ) )
                    {
                    // InternalOntoL.g:1034:2: ( ( rule__ReferenceAssignment__Group_3_1__0 ) )
                    // InternalOntoL.g:1035:3: ( rule__ReferenceAssignment__Group_3_1__0 )
                    {
                     before(grammarAccess.getReferenceAssignmentAccess().getGroup_3_1()); 
                    // InternalOntoL.g:1036:3: ( rule__ReferenceAssignment__Group_3_1__0 )
                    // InternalOntoL.g:1036:4: rule__ReferenceAssignment__Group_3_1__0
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
    // InternalOntoL.g:1044:1: rule__DataValue__Alternatives : ( ( ruleStringValue ) | ( ruleNumberValue ) | ( ruleBooleanValue ) | ( ruleNoneValue ) | ( ruleComplexDataValue ) );
    public final void rule__DataValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1048:1: ( ( ruleStringValue ) | ( ruleNumberValue ) | ( ruleBooleanValue ) | ( ruleNoneValue ) | ( ruleComplexDataValue ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt13=1;
                }
                break;
            case RULE_INT:
            case 44:
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
            case 45:
                {
                alt13=4;
                }
                break;
            case RULE_ID:
            case 37:
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
                    // InternalOntoL.g:1049:2: ( ruleStringValue )
                    {
                    // InternalOntoL.g:1049:2: ( ruleStringValue )
                    // InternalOntoL.g:1050:3: ruleStringValue
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
                    // InternalOntoL.g:1055:2: ( ruleNumberValue )
                    {
                    // InternalOntoL.g:1055:2: ( ruleNumberValue )
                    // InternalOntoL.g:1056:3: ruleNumberValue
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
                    // InternalOntoL.g:1061:2: ( ruleBooleanValue )
                    {
                    // InternalOntoL.g:1061:2: ( ruleBooleanValue )
                    // InternalOntoL.g:1062:3: ruleBooleanValue
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
                    // InternalOntoL.g:1067:2: ( ruleNoneValue )
                    {
                    // InternalOntoL.g:1067:2: ( ruleNoneValue )
                    // InternalOntoL.g:1068:3: ruleNoneValue
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
                    // InternalOntoL.g:1073:2: ( ruleComplexDataValue )
                    {
                    // InternalOntoL.g:1073:2: ( ruleComplexDataValue )
                    // InternalOntoL.g:1074:3: ruleComplexDataValue
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
    // InternalOntoL.g:1083:1: rule__BOOLEAN__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1087:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalOntoL.g:1088:2: ( 'true' )
                    {
                    // InternalOntoL.g:1088:2: ( 'true' )
                    // InternalOntoL.g:1089:3: 'true'
                    {
                     before(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1094:2: ( 'false' )
                    {
                    // InternalOntoL.g:1094:2: ( 'false' )
                    // InternalOntoL.g:1095:3: 'false'
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
    // InternalOntoL.g:1104:1: rule__ComplexDataValue__Alternatives : ( ( ( rule__ComplexDataValue__ValueAssignment_0 ) ) | ( ( rule__ComplexDataValue__UnnamedValueAssignment_1 ) ) );
    public final void rule__ComplexDataValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1108:1: ( ( ( rule__ComplexDataValue__ValueAssignment_0 ) ) | ( ( rule__ComplexDataValue__UnnamedValueAssignment_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==37) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalOntoL.g:1109:2: ( ( rule__ComplexDataValue__ValueAssignment_0 ) )
                    {
                    // InternalOntoL.g:1109:2: ( ( rule__ComplexDataValue__ValueAssignment_0 ) )
                    // InternalOntoL.g:1110:3: ( rule__ComplexDataValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getComplexDataValueAccess().getValueAssignment_0()); 
                    // InternalOntoL.g:1111:3: ( rule__ComplexDataValue__ValueAssignment_0 )
                    // InternalOntoL.g:1111:4: rule__ComplexDataValue__ValueAssignment_0
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
                    // InternalOntoL.g:1115:2: ( ( rule__ComplexDataValue__UnnamedValueAssignment_1 ) )
                    {
                    // InternalOntoL.g:1115:2: ( ( rule__ComplexDataValue__UnnamedValueAssignment_1 ) )
                    // InternalOntoL.g:1116:3: ( rule__ComplexDataValue__UnnamedValueAssignment_1 )
                    {
                     before(grammarAccess.getComplexDataValueAccess().getUnnamedValueAssignment_1()); 
                    // InternalOntoL.g:1117:3: ( rule__ComplexDataValue__UnnamedValueAssignment_1 )
                    // InternalOntoL.g:1117:4: rule__ComplexDataValue__UnnamedValueAssignment_1
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
    // InternalOntoL.g:1125:1: rule__GeneralizationSet__Alternatives_0 : ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) | ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) | ( ( rule__GeneralizationSet__Group_0_2__0 ) ) | ( ( rule__GeneralizationSet__Group_0_3__0 ) ) );
    public final void rule__GeneralizationSet__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1129:1: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) | ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) | ( ( rule__GeneralizationSet__Group_0_2__0 ) ) | ( ( rule__GeneralizationSet__Group_0_3__0 ) ) )
            int alt16=4;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==50) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==46) ) {
                    alt16=1;
                }
                else if ( (LA16_1==51) ) {
                    alt16=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA16_0==51) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==46) ) {
                    alt16=2;
                }
                else if ( (LA16_2==50) ) {
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
                    // InternalOntoL.g:1130:2: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) )
                    {
                    // InternalOntoL.g:1130:2: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) )
                    // InternalOntoL.g:1131:3: ( rule__GeneralizationSet__IsDisjointAssignment_0_0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_0()); 
                    // InternalOntoL.g:1132:3: ( rule__GeneralizationSet__IsDisjointAssignment_0_0 )
                    // InternalOntoL.g:1132:4: rule__GeneralizationSet__IsDisjointAssignment_0_0
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
                    // InternalOntoL.g:1136:2: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) )
                    {
                    // InternalOntoL.g:1136:2: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) )
                    // InternalOntoL.g:1137:3: ( rule__GeneralizationSet__IsCompleteAssignment_0_1 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_1()); 
                    // InternalOntoL.g:1138:3: ( rule__GeneralizationSet__IsCompleteAssignment_0_1 )
                    // InternalOntoL.g:1138:4: rule__GeneralizationSet__IsCompleteAssignment_0_1
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
                    // InternalOntoL.g:1142:2: ( ( rule__GeneralizationSet__Group_0_2__0 ) )
                    {
                    // InternalOntoL.g:1142:2: ( ( rule__GeneralizationSet__Group_0_2__0 ) )
                    // InternalOntoL.g:1143:3: ( rule__GeneralizationSet__Group_0_2__0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getGroup_0_2()); 
                    // InternalOntoL.g:1144:3: ( rule__GeneralizationSet__Group_0_2__0 )
                    // InternalOntoL.g:1144:4: rule__GeneralizationSet__Group_0_2__0
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
                    // InternalOntoL.g:1148:2: ( ( rule__GeneralizationSet__Group_0_3__0 ) )
                    {
                    // InternalOntoL.g:1148:2: ( ( rule__GeneralizationSet__Group_0_3__0 ) )
                    // InternalOntoL.g:1149:3: ( rule__GeneralizationSet__Group_0_3__0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getGroup_0_3()); 
                    // InternalOntoL.g:1150:3: ( rule__GeneralizationSet__Group_0_3__0 )
                    // InternalOntoL.g:1150:4: rule__GeneralizationSet__Group_0_3__0
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
    // InternalOntoL.g:1158:1: rule__CategorizationType__Alternatives : ( ( ( 'categorizes' ) ) | ( ( 'completecategorizes' ) ) | ( ( 'disjointcategorizes' ) ) | ( ( 'partitions' ) ) );
    public final void rule__CategorizationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1162:1: ( ( ( 'categorizes' ) ) | ( ( 'completecategorizes' ) ) | ( ( 'disjointcategorizes' ) ) | ( ( 'partitions' ) ) )
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
                    // InternalOntoL.g:1163:2: ( ( 'categorizes' ) )
                    {
                    // InternalOntoL.g:1163:2: ( ( 'categorizes' ) )
                    // InternalOntoL.g:1164:3: ( 'categorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0()); 
                    // InternalOntoL.g:1165:3: ( 'categorizes' )
                    // InternalOntoL.g:1165:4: 'categorizes'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1169:2: ( ( 'completecategorizes' ) )
                    {
                    // InternalOntoL.g:1169:2: ( ( 'completecategorizes' ) )
                    // InternalOntoL.g:1170:3: ( 'completecategorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1()); 
                    // InternalOntoL.g:1171:3: ( 'completecategorizes' )
                    // InternalOntoL.g:1171:4: 'completecategorizes'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:1175:2: ( ( 'disjointcategorizes' ) )
                    {
                    // InternalOntoL.g:1175:2: ( ( 'disjointcategorizes' ) )
                    // InternalOntoL.g:1176:3: ( 'disjointcategorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2()); 
                    // InternalOntoL.g:1177:3: ( 'disjointcategorizes' )
                    // InternalOntoL.g:1177:4: 'disjointcategorizes'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:1181:2: ( ( 'partitions' ) )
                    {
                    // InternalOntoL.g:1181:2: ( ( 'partitions' ) )
                    // InternalOntoL.g:1182:3: ( 'partitions' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getPARTITIONEREnumLiteralDeclaration_3()); 
                    // InternalOntoL.g:1183:3: ( 'partitions' )
                    // InternalOntoL.g:1183:4: 'partitions'
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalOntoL.g:1191:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1195:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalOntoL.g:1196:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalOntoL.g:1203:1: rule__Model__Group__0__Impl : ( 'module' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1207:1: ( ( 'module' ) )
            // InternalOntoL.g:1208:1: ( 'module' )
            {
            // InternalOntoL.g:1208:1: ( 'module' )
            // InternalOntoL.g:1209:2: 'module'
            {
             before(grammarAccess.getModelAccess().getModuleKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalOntoL.g:1218:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1222:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalOntoL.g:1223:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalOntoL.g:1230:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1234:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalOntoL.g:1235:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalOntoL.g:1235:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalOntoL.g:1236:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalOntoL.g:1237:2: ( rule__Model__NameAssignment_1 )
            // InternalOntoL.g:1237:3: rule__Model__NameAssignment_1
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
    // InternalOntoL.g:1245:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1249:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalOntoL.g:1250:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalOntoL.g:1257:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1261:1: ( ( '{' ) )
            // InternalOntoL.g:1262:1: ( '{' )
            {
            // InternalOntoL.g:1262:1: ( '{' )
            // InternalOntoL.g:1263:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalOntoL.g:1272:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1276:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalOntoL.g:1277:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalOntoL.g:1284:1: rule__Model__Group__3__Impl : ( ( rule__Model__Alternatives_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1288:1: ( ( ( rule__Model__Alternatives_3 )* ) )
            // InternalOntoL.g:1289:1: ( ( rule__Model__Alternatives_3 )* )
            {
            // InternalOntoL.g:1289:1: ( ( rule__Model__Alternatives_3 )* )
            // InternalOntoL.g:1290:2: ( rule__Model__Alternatives_3 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_3()); 
            // InternalOntoL.g:1291:2: ( rule__Model__Alternatives_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21||(LA18_0>=25 && LA18_0<=26)||(LA18_0>=29 && LA18_0<=30)||(LA18_0>=34 && LA18_0<=35)||LA18_0==46||(LA18_0>=50 && LA18_0<=51)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalOntoL.g:1291:3: rule__Model__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalOntoL.g:1299:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1303:1: ( rule__Model__Group__4__Impl )
            // InternalOntoL.g:1304:2: rule__Model__Group__4__Impl
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
    // InternalOntoL.g:1310:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1314:1: ( ( '}' ) )
            // InternalOntoL.g:1315:1: ( '}' )
            {
            // InternalOntoL.g:1315:1: ( '}' )
            // InternalOntoL.g:1316:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalOntoL.g:1326:1: rule__Model__Group_3_0__0 : rule__Model__Group_3_0__0__Impl rule__Model__Group_3_0__1 ;
    public final void rule__Model__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1330:1: ( rule__Model__Group_3_0__0__Impl rule__Model__Group_3_0__1 )
            // InternalOntoL.g:1331:2: rule__Model__Group_3_0__0__Impl rule__Model__Group_3_0__1
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
    // InternalOntoL.g:1338:1: rule__Model__Group_3_0__0__Impl : ( 'include' ) ;
    public final void rule__Model__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1342:1: ( ( 'include' ) )
            // InternalOntoL.g:1343:1: ( 'include' )
            {
            // InternalOntoL.g:1343:1: ( 'include' )
            // InternalOntoL.g:1344:2: 'include'
            {
             before(grammarAccess.getModelAccess().getIncludeKeyword_3_0_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalOntoL.g:1353:1: rule__Model__Group_3_0__1 : rule__Model__Group_3_0__1__Impl rule__Model__Group_3_0__2 ;
    public final void rule__Model__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1357:1: ( rule__Model__Group_3_0__1__Impl rule__Model__Group_3_0__2 )
            // InternalOntoL.g:1358:2: rule__Model__Group_3_0__1__Impl rule__Model__Group_3_0__2
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
    // InternalOntoL.g:1365:1: rule__Model__Group_3_0__1__Impl : ( ( rule__Model__IncludesAssignment_3_0_1 ) ) ;
    public final void rule__Model__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1369:1: ( ( ( rule__Model__IncludesAssignment_3_0_1 ) ) )
            // InternalOntoL.g:1370:1: ( ( rule__Model__IncludesAssignment_3_0_1 ) )
            {
            // InternalOntoL.g:1370:1: ( ( rule__Model__IncludesAssignment_3_0_1 ) )
            // InternalOntoL.g:1371:2: ( rule__Model__IncludesAssignment_3_0_1 )
            {
             before(grammarAccess.getModelAccess().getIncludesAssignment_3_0_1()); 
            // InternalOntoL.g:1372:2: ( rule__Model__IncludesAssignment_3_0_1 )
            // InternalOntoL.g:1372:3: rule__Model__IncludesAssignment_3_0_1
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
    // InternalOntoL.g:1380:1: rule__Model__Group_3_0__2 : rule__Model__Group_3_0__2__Impl ;
    public final void rule__Model__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1384:1: ( rule__Model__Group_3_0__2__Impl )
            // InternalOntoL.g:1385:2: rule__Model__Group_3_0__2__Impl
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
    // InternalOntoL.g:1391:1: rule__Model__Group_3_0__2__Impl : ( ';' ) ;
    public final void rule__Model__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1395:1: ( ( ';' ) )
            // InternalOntoL.g:1396:1: ( ';' )
            {
            // InternalOntoL.g:1396:1: ( ';' )
            // InternalOntoL.g:1397:2: ';'
            {
             before(grammarAccess.getModelAccess().getSemicolonKeyword_3_0_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalOntoL.g:1407:1: rule__ModelElement__Group__0 : rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 ;
    public final void rule__ModelElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1411:1: ( rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 )
            // InternalOntoL.g:1412:2: rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1
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
    // InternalOntoL.g:1419:1: rule__ModelElement__Group__0__Impl : ( ( rule__ModelElement__Alternatives_0 ) ) ;
    public final void rule__ModelElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1423:1: ( ( ( rule__ModelElement__Alternatives_0 ) ) )
            // InternalOntoL.g:1424:1: ( ( rule__ModelElement__Alternatives_0 ) )
            {
            // InternalOntoL.g:1424:1: ( ( rule__ModelElement__Alternatives_0 ) )
            // InternalOntoL.g:1425:2: ( rule__ModelElement__Alternatives_0 )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives_0()); 
            // InternalOntoL.g:1426:2: ( rule__ModelElement__Alternatives_0 )
            // InternalOntoL.g:1426:3: rule__ModelElement__Alternatives_0
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
    // InternalOntoL.g:1434:1: rule__ModelElement__Group__1 : rule__ModelElement__Group__1__Impl ;
    public final void rule__ModelElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1438:1: ( rule__ModelElement__Group__1__Impl )
            // InternalOntoL.g:1439:2: rule__ModelElement__Group__1__Impl
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
    // InternalOntoL.g:1445:1: rule__ModelElement__Group__1__Impl : ( ';' ) ;
    public final void rule__ModelElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1449:1: ( ( ';' ) )
            // InternalOntoL.g:1450:1: ( ';' )
            {
            // InternalOntoL.g:1450:1: ( ';' )
            // InternalOntoL.g:1451:2: ';'
            {
             before(grammarAccess.getModelElementAccess().getSemicolonKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalOntoL.g:1461:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1465:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalOntoL.g:1466:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalOntoL.g:1473:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1477:1: ( ( RULE_ID ) )
            // InternalOntoL.g:1478:1: ( RULE_ID )
            {
            // InternalOntoL.g:1478:1: ( RULE_ID )
            // InternalOntoL.g:1479:2: RULE_ID
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
    // InternalOntoL.g:1488:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1492:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalOntoL.g:1493:2: rule__QualifiedName__Group__1__Impl
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
    // InternalOntoL.g:1499:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1503:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalOntoL.g:1504:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalOntoL.g:1504:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalOntoL.g:1505:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalOntoL.g:1506:2: ( rule__QualifiedName__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOntoL.g:1506:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalOntoL.g:1515:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1519:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalOntoL.g:1520:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalOntoL.g:1527:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1531:1: ( ( '.' ) )
            // InternalOntoL.g:1532:1: ( '.' )
            {
            // InternalOntoL.g:1532:1: ( '.' )
            // InternalOntoL.g:1533:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalOntoL.g:1542:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1546:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalOntoL.g:1547:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalOntoL.g:1553:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1557:1: ( ( RULE_ID ) )
            // InternalOntoL.g:1558:1: ( RULE_ID )
            {
            // InternalOntoL.g:1558:1: ( RULE_ID )
            // InternalOntoL.g:1559:2: RULE_ID
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
    // InternalOntoL.g:1569:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1573:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalOntoL.g:1574:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalOntoL.g:1581:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1585:1: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:1586:1: ( ruleQualifiedName )
            {
            // InternalOntoL.g:1586:1: ( ruleQualifiedName )
            // InternalOntoL.g:1587:2: ruleQualifiedName
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
    // InternalOntoL.g:1596:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1600:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalOntoL.g:1601:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalOntoL.g:1607:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1611:1: ( ( ( '.*' )? ) )
            // InternalOntoL.g:1612:1: ( ( '.*' )? )
            {
            // InternalOntoL.g:1612:1: ( ( '.*' )? )
            // InternalOntoL.g:1613:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalOntoL.g:1614:2: ( '.*' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntoL.g:1614:3: '.*'
                    {
                    match(input,24,FOLLOW_2); 

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
    // InternalOntoL.g:1623:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1627:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalOntoL.g:1628:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalOntoL.g:1635:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1639:1: ( ( 'import' ) )
            // InternalOntoL.g:1640:1: ( 'import' )
            {
            // InternalOntoL.g:1640:1: ( 'import' )
            // InternalOntoL.g:1641:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalOntoL.g:1650:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1654:1: ( rule__Import__Group__1__Impl )
            // InternalOntoL.g:1655:2: rule__Import__Group__1__Impl
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
    // InternalOntoL.g:1661:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1665:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalOntoL.g:1666:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalOntoL.g:1666:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalOntoL.g:1667:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalOntoL.g:1668:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalOntoL.g:1668:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalOntoL.g:1677:1: rule__Individual__Group__0 : rule__Individual__Group__0__Impl rule__Individual__Group__1 ;
    public final void rule__Individual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1681:1: ( rule__Individual__Group__0__Impl rule__Individual__Group__1 )
            // InternalOntoL.g:1682:2: rule__Individual__Group__0__Impl rule__Individual__Group__1
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
    // InternalOntoL.g:1689:1: rule__Individual__Group__0__Impl : ( 'individual' ) ;
    public final void rule__Individual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1693:1: ( ( 'individual' ) )
            // InternalOntoL.g:1694:1: ( 'individual' )
            {
            // InternalOntoL.g:1694:1: ( 'individual' )
            // InternalOntoL.g:1695:2: 'individual'
            {
             before(grammarAccess.getIndividualAccess().getIndividualKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalOntoL.g:1704:1: rule__Individual__Group__1 : rule__Individual__Group__1__Impl rule__Individual__Group__2 ;
    public final void rule__Individual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1708:1: ( rule__Individual__Group__1__Impl rule__Individual__Group__2 )
            // InternalOntoL.g:1709:2: rule__Individual__Group__1__Impl rule__Individual__Group__2
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
    // InternalOntoL.g:1716:1: rule__Individual__Group__1__Impl : ( ( rule__Individual__NameAssignment_1 ) ) ;
    public final void rule__Individual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1720:1: ( ( ( rule__Individual__NameAssignment_1 ) ) )
            // InternalOntoL.g:1721:1: ( ( rule__Individual__NameAssignment_1 ) )
            {
            // InternalOntoL.g:1721:1: ( ( rule__Individual__NameAssignment_1 ) )
            // InternalOntoL.g:1722:2: ( rule__Individual__NameAssignment_1 )
            {
             before(grammarAccess.getIndividualAccess().getNameAssignment_1()); 
            // InternalOntoL.g:1723:2: ( rule__Individual__NameAssignment_1 )
            // InternalOntoL.g:1723:3: rule__Individual__NameAssignment_1
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
    // InternalOntoL.g:1731:1: rule__Individual__Group__2 : rule__Individual__Group__2__Impl rule__Individual__Group__3 ;
    public final void rule__Individual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1735:1: ( rule__Individual__Group__2__Impl rule__Individual__Group__3 )
            // InternalOntoL.g:1736:2: rule__Individual__Group__2__Impl rule__Individual__Group__3
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
    // InternalOntoL.g:1743:1: rule__Individual__Group__2__Impl : ( ( rule__Individual__Group_2__0 )? ) ;
    public final void rule__Individual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1747:1: ( ( ( rule__Individual__Group_2__0 )? ) )
            // InternalOntoL.g:1748:1: ( ( rule__Individual__Group_2__0 )? )
            {
            // InternalOntoL.g:1748:1: ( ( rule__Individual__Group_2__0 )? )
            // InternalOntoL.g:1749:2: ( rule__Individual__Group_2__0 )?
            {
             before(grammarAccess.getIndividualAccess().getGroup_2()); 
            // InternalOntoL.g:1750:2: ( rule__Individual__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOntoL.g:1750:3: rule__Individual__Group_2__0
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
    // InternalOntoL.g:1758:1: rule__Individual__Group__3 : rule__Individual__Group__3__Impl ;
    public final void rule__Individual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1762:1: ( rule__Individual__Group__3__Impl )
            // InternalOntoL.g:1763:2: rule__Individual__Group__3__Impl
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
    // InternalOntoL.g:1769:1: rule__Individual__Group__3__Impl : ( ( rule__Individual__Group_3__0 )? ) ;
    public final void rule__Individual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1773:1: ( ( ( rule__Individual__Group_3__0 )? ) )
            // InternalOntoL.g:1774:1: ( ( rule__Individual__Group_3__0 )? )
            {
            // InternalOntoL.g:1774:1: ( ( rule__Individual__Group_3__0 )? )
            // InternalOntoL.g:1775:2: ( rule__Individual__Group_3__0 )?
            {
             before(grammarAccess.getIndividualAccess().getGroup_3()); 
            // InternalOntoL.g:1776:2: ( rule__Individual__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOntoL.g:1776:3: rule__Individual__Group_3__0
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
    // InternalOntoL.g:1785:1: rule__Individual__Group_2__0 : rule__Individual__Group_2__0__Impl rule__Individual__Group_2__1 ;
    public final void rule__Individual__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1789:1: ( rule__Individual__Group_2__0__Impl rule__Individual__Group_2__1 )
            // InternalOntoL.g:1790:2: rule__Individual__Group_2__0__Impl rule__Individual__Group_2__1
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
    // InternalOntoL.g:1797:1: rule__Individual__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Individual__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1801:1: ( ( ':' ) )
            // InternalOntoL.g:1802:1: ( ':' )
            {
            // InternalOntoL.g:1802:1: ( ':' )
            // InternalOntoL.g:1803:2: ':'
            {
             before(grammarAccess.getIndividualAccess().getColonKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoL.g:1812:1: rule__Individual__Group_2__1 : rule__Individual__Group_2__1__Impl rule__Individual__Group_2__2 ;
    public final void rule__Individual__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1816:1: ( rule__Individual__Group_2__1__Impl rule__Individual__Group_2__2 )
            // InternalOntoL.g:1817:2: rule__Individual__Group_2__1__Impl rule__Individual__Group_2__2
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
    // InternalOntoL.g:1824:1: rule__Individual__Group_2__1__Impl : ( ( rule__Individual__InstantiatedClassesAssignment_2_1 ) ) ;
    public final void rule__Individual__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1828:1: ( ( ( rule__Individual__InstantiatedClassesAssignment_2_1 ) ) )
            // InternalOntoL.g:1829:1: ( ( rule__Individual__InstantiatedClassesAssignment_2_1 ) )
            {
            // InternalOntoL.g:1829:1: ( ( rule__Individual__InstantiatedClassesAssignment_2_1 ) )
            // InternalOntoL.g:1830:2: ( rule__Individual__InstantiatedClassesAssignment_2_1 )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesAssignment_2_1()); 
            // InternalOntoL.g:1831:2: ( rule__Individual__InstantiatedClassesAssignment_2_1 )
            // InternalOntoL.g:1831:3: rule__Individual__InstantiatedClassesAssignment_2_1
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
    // InternalOntoL.g:1839:1: rule__Individual__Group_2__2 : rule__Individual__Group_2__2__Impl ;
    public final void rule__Individual__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1843:1: ( rule__Individual__Group_2__2__Impl )
            // InternalOntoL.g:1844:2: rule__Individual__Group_2__2__Impl
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
    // InternalOntoL.g:1850:1: rule__Individual__Group_2__2__Impl : ( ( rule__Individual__Group_2_2__0 )* ) ;
    public final void rule__Individual__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1854:1: ( ( ( rule__Individual__Group_2_2__0 )* ) )
            // InternalOntoL.g:1855:1: ( ( rule__Individual__Group_2_2__0 )* )
            {
            // InternalOntoL.g:1855:1: ( ( rule__Individual__Group_2_2__0 )* )
            // InternalOntoL.g:1856:2: ( rule__Individual__Group_2_2__0 )*
            {
             before(grammarAccess.getIndividualAccess().getGroup_2_2()); 
            // InternalOntoL.g:1857:2: ( rule__Individual__Group_2_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==28) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalOntoL.g:1857:3: rule__Individual__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Individual__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalOntoL.g:1866:1: rule__Individual__Group_2_2__0 : rule__Individual__Group_2_2__0__Impl rule__Individual__Group_2_2__1 ;
    public final void rule__Individual__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1870:1: ( rule__Individual__Group_2_2__0__Impl rule__Individual__Group_2_2__1 )
            // InternalOntoL.g:1871:2: rule__Individual__Group_2_2__0__Impl rule__Individual__Group_2_2__1
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
    // InternalOntoL.g:1878:1: rule__Individual__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Individual__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1882:1: ( ( ',' ) )
            // InternalOntoL.g:1883:1: ( ',' )
            {
            // InternalOntoL.g:1883:1: ( ',' )
            // InternalOntoL.g:1884:2: ','
            {
             before(grammarAccess.getIndividualAccess().getCommaKeyword_2_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoL.g:1893:1: rule__Individual__Group_2_2__1 : rule__Individual__Group_2_2__1__Impl ;
    public final void rule__Individual__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1897:1: ( rule__Individual__Group_2_2__1__Impl )
            // InternalOntoL.g:1898:2: rule__Individual__Group_2_2__1__Impl
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
    // InternalOntoL.g:1904:1: rule__Individual__Group_2_2__1__Impl : ( ( rule__Individual__InstantiatedClassesAssignment_2_2_1 ) ) ;
    public final void rule__Individual__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1908:1: ( ( ( rule__Individual__InstantiatedClassesAssignment_2_2_1 ) ) )
            // InternalOntoL.g:1909:1: ( ( rule__Individual__InstantiatedClassesAssignment_2_2_1 ) )
            {
            // InternalOntoL.g:1909:1: ( ( rule__Individual__InstantiatedClassesAssignment_2_2_1 ) )
            // InternalOntoL.g:1910:2: ( rule__Individual__InstantiatedClassesAssignment_2_2_1 )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesAssignment_2_2_1()); 
            // InternalOntoL.g:1911:2: ( rule__Individual__InstantiatedClassesAssignment_2_2_1 )
            // InternalOntoL.g:1911:3: rule__Individual__InstantiatedClassesAssignment_2_2_1
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
    // InternalOntoL.g:1920:1: rule__Individual__Group_3__0 : rule__Individual__Group_3__0__Impl rule__Individual__Group_3__1 ;
    public final void rule__Individual__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1924:1: ( rule__Individual__Group_3__0__Impl rule__Individual__Group_3__1 )
            // InternalOntoL.g:1925:2: rule__Individual__Group_3__0__Impl rule__Individual__Group_3__1
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
    // InternalOntoL.g:1932:1: rule__Individual__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Individual__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1936:1: ( ( '{' ) )
            // InternalOntoL.g:1937:1: ( '{' )
            {
            // InternalOntoL.g:1937:1: ( '{' )
            // InternalOntoL.g:1938:2: '{'
            {
             before(grammarAccess.getIndividualAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalOntoL.g:1947:1: rule__Individual__Group_3__1 : rule__Individual__Group_3__1__Impl rule__Individual__Group_3__2 ;
    public final void rule__Individual__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1951:1: ( rule__Individual__Group_3__1__Impl rule__Individual__Group_3__2 )
            // InternalOntoL.g:1952:2: rule__Individual__Group_3__1__Impl rule__Individual__Group_3__2
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
    // InternalOntoL.g:1959:1: rule__Individual__Group_3__1__Impl : ( ( rule__Individual__Alternatives_3_1 )* ) ;
    public final void rule__Individual__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1963:1: ( ( ( rule__Individual__Alternatives_3_1 )* ) )
            // InternalOntoL.g:1964:1: ( ( rule__Individual__Alternatives_3_1 )* )
            {
            // InternalOntoL.g:1964:1: ( ( rule__Individual__Alternatives_3_1 )* )
            // InternalOntoL.g:1965:2: ( rule__Individual__Alternatives_3_1 )*
            {
             before(grammarAccess.getIndividualAccess().getAlternatives_3_1()); 
            // InternalOntoL.g:1966:2: ( rule__Individual__Alternatives_3_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==36||LA24_0==41) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalOntoL.g:1966:3: rule__Individual__Alternatives_3_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Individual__Alternatives_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalOntoL.g:1974:1: rule__Individual__Group_3__2 : rule__Individual__Group_3__2__Impl ;
    public final void rule__Individual__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1978:1: ( rule__Individual__Group_3__2__Impl )
            // InternalOntoL.g:1979:2: rule__Individual__Group_3__2__Impl
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
    // InternalOntoL.g:1985:1: rule__Individual__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Individual__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1989:1: ( ( '}' ) )
            // InternalOntoL.g:1990:1: ( '}' )
            {
            // InternalOntoL.g:1990:1: ( '}' )
            // InternalOntoL.g:1991:2: '}'
            {
             before(grammarAccess.getIndividualAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalOntoL.g:2001:1: rule__OntoLClass__Group__0 : rule__OntoLClass__Group__0__Impl rule__OntoLClass__Group__1 ;
    public final void rule__OntoLClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2005:1: ( rule__OntoLClass__Group__0__Impl rule__OntoLClass__Group__1 )
            // InternalOntoL.g:2006:2: rule__OntoLClass__Group__0__Impl rule__OntoLClass__Group__1
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
    // InternalOntoL.g:2013:1: rule__OntoLClass__Group__0__Impl : ( ( rule__OntoLClass__Alternatives_0 ) ) ;
    public final void rule__OntoLClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2017:1: ( ( ( rule__OntoLClass__Alternatives_0 ) ) )
            // InternalOntoL.g:2018:1: ( ( rule__OntoLClass__Alternatives_0 ) )
            {
            // InternalOntoL.g:2018:1: ( ( rule__OntoLClass__Alternatives_0 ) )
            // InternalOntoL.g:2019:2: ( rule__OntoLClass__Alternatives_0 )
            {
             before(grammarAccess.getOntoLClassAccess().getAlternatives_0()); 
            // InternalOntoL.g:2020:2: ( rule__OntoLClass__Alternatives_0 )
            // InternalOntoL.g:2020:3: rule__OntoLClass__Alternatives_0
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
    // InternalOntoL.g:2028:1: rule__OntoLClass__Group__1 : rule__OntoLClass__Group__1__Impl ;
    public final void rule__OntoLClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2032:1: ( rule__OntoLClass__Group__1__Impl )
            // InternalOntoL.g:2033:2: rule__OntoLClass__Group__1__Impl
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
    // InternalOntoL.g:2039:1: rule__OntoLClass__Group__1__Impl : ( ( rule__OntoLClass__Group_1__0 )? ) ;
    public final void rule__OntoLClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2043:1: ( ( ( rule__OntoLClass__Group_1__0 )? ) )
            // InternalOntoL.g:2044:1: ( ( rule__OntoLClass__Group_1__0 )? )
            {
            // InternalOntoL.g:2044:1: ( ( rule__OntoLClass__Group_1__0 )? )
            // InternalOntoL.g:2045:2: ( rule__OntoLClass__Group_1__0 )?
            {
             before(grammarAccess.getOntoLClassAccess().getGroup_1()); 
            // InternalOntoL.g:2046:2: ( rule__OntoLClass__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOntoL.g:2046:3: rule__OntoLClass__Group_1__0
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
    // InternalOntoL.g:2055:1: rule__OntoLClass__Group_1__0 : rule__OntoLClass__Group_1__0__Impl rule__OntoLClass__Group_1__1 ;
    public final void rule__OntoLClass__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2059:1: ( rule__OntoLClass__Group_1__0__Impl rule__OntoLClass__Group_1__1 )
            // InternalOntoL.g:2060:2: rule__OntoLClass__Group_1__0__Impl rule__OntoLClass__Group_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalOntoL.g:2067:1: rule__OntoLClass__Group_1__0__Impl : ( '{' ) ;
    public final void rule__OntoLClass__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2071:1: ( ( '{' ) )
            // InternalOntoL.g:2072:1: ( '{' )
            {
            // InternalOntoL.g:2072:1: ( '{' )
            // InternalOntoL.g:2073:2: '{'
            {
             before(grammarAccess.getOntoLClassAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalOntoL.g:2082:1: rule__OntoLClass__Group_1__1 : rule__OntoLClass__Group_1__1__Impl rule__OntoLClass__Group_1__2 ;
    public final void rule__OntoLClass__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2086:1: ( rule__OntoLClass__Group_1__1__Impl rule__OntoLClass__Group_1__2 )
            // InternalOntoL.g:2087:2: rule__OntoLClass__Group_1__1__Impl rule__OntoLClass__Group_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalOntoL.g:2094:1: rule__OntoLClass__Group_1__1__Impl : ( ( rule__OntoLClass__Alternatives_1_1 )* ) ;
    public final void rule__OntoLClass__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2098:1: ( ( ( rule__OntoLClass__Alternatives_1_1 )* ) )
            // InternalOntoL.g:2099:1: ( ( rule__OntoLClass__Alternatives_1_1 )* )
            {
            // InternalOntoL.g:2099:1: ( ( rule__OntoLClass__Alternatives_1_1 )* )
            // InternalOntoL.g:2100:2: ( rule__OntoLClass__Alternatives_1_1 )*
            {
             before(grammarAccess.getOntoLClassAccess().getAlternatives_1_1()); 
            // InternalOntoL.g:2101:2: ( rule__OntoLClass__Alternatives_1_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==36||LA26_0==41) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalOntoL.g:2101:3: rule__OntoLClass__Alternatives_1_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__OntoLClass__Alternatives_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalOntoL.g:2109:1: rule__OntoLClass__Group_1__2 : rule__OntoLClass__Group_1__2__Impl ;
    public final void rule__OntoLClass__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2113:1: ( rule__OntoLClass__Group_1__2__Impl )
            // InternalOntoL.g:2114:2: rule__OntoLClass__Group_1__2__Impl
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
    // InternalOntoL.g:2120:1: rule__OntoLClass__Group_1__2__Impl : ( '}' ) ;
    public final void rule__OntoLClass__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2124:1: ( ( '}' ) )
            // InternalOntoL.g:2125:1: ( '}' )
            {
            // InternalOntoL.g:2125:1: ( '}' )
            // InternalOntoL.g:2126:2: '}'
            {
             before(grammarAccess.getOntoLClassAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalOntoL.g:2136:1: rule__OrderlessClass__Group__0 : rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1 ;
    public final void rule__OrderlessClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2140:1: ( rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1 )
            // InternalOntoL.g:2141:2: rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalOntoL.g:2148:1: rule__OrderlessClass__Group__0__Impl : ( 'orderless' ) ;
    public final void rule__OrderlessClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2152:1: ( ( 'orderless' ) )
            // InternalOntoL.g:2153:1: ( 'orderless' )
            {
            // InternalOntoL.g:2153:1: ( 'orderless' )
            // InternalOntoL.g:2154:2: 'orderless'
            {
             before(grammarAccess.getOrderlessClassAccess().getOrderlessKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalOntoL.g:2163:1: rule__OrderlessClass__Group__1 : rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2 ;
    public final void rule__OrderlessClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2167:1: ( rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2 )
            // InternalOntoL.g:2168:2: rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2
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
    // InternalOntoL.g:2175:1: rule__OrderlessClass__Group__1__Impl : ( 'class' ) ;
    public final void rule__OrderlessClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2179:1: ( ( 'class' ) )
            // InternalOntoL.g:2180:1: ( 'class' )
            {
            // InternalOntoL.g:2180:1: ( 'class' )
            // InternalOntoL.g:2181:2: 'class'
            {
             before(grammarAccess.getOrderlessClassAccess().getClassKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalOntoL.g:2190:1: rule__OrderlessClass__Group__2 : rule__OrderlessClass__Group__2__Impl rule__OrderlessClass__Group__3 ;
    public final void rule__OrderlessClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2194:1: ( rule__OrderlessClass__Group__2__Impl rule__OrderlessClass__Group__3 )
            // InternalOntoL.g:2195:2: rule__OrderlessClass__Group__2__Impl rule__OrderlessClass__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalOntoL.g:2202:1: rule__OrderlessClass__Group__2__Impl : ( ( rule__OrderlessClass__NameAssignment_2 ) ) ;
    public final void rule__OrderlessClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2206:1: ( ( ( rule__OrderlessClass__NameAssignment_2 ) ) )
            // InternalOntoL.g:2207:1: ( ( rule__OrderlessClass__NameAssignment_2 ) )
            {
            // InternalOntoL.g:2207:1: ( ( rule__OrderlessClass__NameAssignment_2 ) )
            // InternalOntoL.g:2208:2: ( rule__OrderlessClass__NameAssignment_2 )
            {
             before(grammarAccess.getOrderlessClassAccess().getNameAssignment_2()); 
            // InternalOntoL.g:2209:2: ( rule__OrderlessClass__NameAssignment_2 )
            // InternalOntoL.g:2209:3: rule__OrderlessClass__NameAssignment_2
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
    // InternalOntoL.g:2217:1: rule__OrderlessClass__Group__3 : rule__OrderlessClass__Group__3__Impl rule__OrderlessClass__Group__4 ;
    public final void rule__OrderlessClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2221:1: ( rule__OrderlessClass__Group__3__Impl rule__OrderlessClass__Group__4 )
            // InternalOntoL.g:2222:2: rule__OrderlessClass__Group__3__Impl rule__OrderlessClass__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalOntoL.g:2229:1: rule__OrderlessClass__Group__3__Impl : ( ( rule__OrderlessClass__Group_3__0 )? ) ;
    public final void rule__OrderlessClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2233:1: ( ( ( rule__OrderlessClass__Group_3__0 )? ) )
            // InternalOntoL.g:2234:1: ( ( rule__OrderlessClass__Group_3__0 )? )
            {
            // InternalOntoL.g:2234:1: ( ( rule__OrderlessClass__Group_3__0 )? )
            // InternalOntoL.g:2235:2: ( rule__OrderlessClass__Group_3__0 )?
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_3()); 
            // InternalOntoL.g:2236:2: ( rule__OrderlessClass__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOntoL.g:2236:3: rule__OrderlessClass__Group_3__0
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
    // InternalOntoL.g:2244:1: rule__OrderlessClass__Group__4 : rule__OrderlessClass__Group__4__Impl rule__OrderlessClass__Group__5 ;
    public final void rule__OrderlessClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2248:1: ( rule__OrderlessClass__Group__4__Impl rule__OrderlessClass__Group__5 )
            // InternalOntoL.g:2249:2: rule__OrderlessClass__Group__4__Impl rule__OrderlessClass__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalOntoL.g:2256:1: rule__OrderlessClass__Group__4__Impl : ( ( rule__OrderlessClass__Group_4__0 )? ) ;
    public final void rule__OrderlessClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2260:1: ( ( ( rule__OrderlessClass__Group_4__0 )? ) )
            // InternalOntoL.g:2261:1: ( ( rule__OrderlessClass__Group_4__0 )? )
            {
            // InternalOntoL.g:2261:1: ( ( rule__OrderlessClass__Group_4__0 )? )
            // InternalOntoL.g:2262:2: ( rule__OrderlessClass__Group_4__0 )?
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_4()); 
            // InternalOntoL.g:2263:2: ( rule__OrderlessClass__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOntoL.g:2263:3: rule__OrderlessClass__Group_4__0
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
    // InternalOntoL.g:2271:1: rule__OrderlessClass__Group__5 : rule__OrderlessClass__Group__5__Impl rule__OrderlessClass__Group__6 ;
    public final void rule__OrderlessClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2275:1: ( rule__OrderlessClass__Group__5__Impl rule__OrderlessClass__Group__6 )
            // InternalOntoL.g:2276:2: rule__OrderlessClass__Group__5__Impl rule__OrderlessClass__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalOntoL.g:2283:1: rule__OrderlessClass__Group__5__Impl : ( ( rule__OrderlessClass__Group_5__0 )? ) ;
    public final void rule__OrderlessClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2287:1: ( ( ( rule__OrderlessClass__Group_5__0 )? ) )
            // InternalOntoL.g:2288:1: ( ( rule__OrderlessClass__Group_5__0 )? )
            {
            // InternalOntoL.g:2288:1: ( ( rule__OrderlessClass__Group_5__0 )? )
            // InternalOntoL.g:2289:2: ( rule__OrderlessClass__Group_5__0 )?
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_5()); 
            // InternalOntoL.g:2290:2: ( rule__OrderlessClass__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOntoL.g:2290:3: rule__OrderlessClass__Group_5__0
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
    // InternalOntoL.g:2298:1: rule__OrderlessClass__Group__6 : rule__OrderlessClass__Group__6__Impl ;
    public final void rule__OrderlessClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2302:1: ( rule__OrderlessClass__Group__6__Impl )
            // InternalOntoL.g:2303:2: rule__OrderlessClass__Group__6__Impl
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
    // InternalOntoL.g:2309:1: rule__OrderlessClass__Group__6__Impl : ( ( rule__OrderlessClass__Alternatives_6 )? ) ;
    public final void rule__OrderlessClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2313:1: ( ( ( rule__OrderlessClass__Alternatives_6 )? ) )
            // InternalOntoL.g:2314:1: ( ( rule__OrderlessClass__Alternatives_6 )? )
            {
            // InternalOntoL.g:2314:1: ( ( rule__OrderlessClass__Alternatives_6 )? )
            // InternalOntoL.g:2315:2: ( rule__OrderlessClass__Alternatives_6 )?
            {
             before(grammarAccess.getOrderlessClassAccess().getAlternatives_6()); 
            // InternalOntoL.g:2316:2: ( rule__OrderlessClass__Alternatives_6 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=14 && LA30_0<=17)||LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOntoL.g:2316:3: rule__OrderlessClass__Alternatives_6
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
    // InternalOntoL.g:2325:1: rule__OrderlessClass__Group_3__0 : rule__OrderlessClass__Group_3__0__Impl rule__OrderlessClass__Group_3__1 ;
    public final void rule__OrderlessClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2329:1: ( rule__OrderlessClass__Group_3__0__Impl rule__OrderlessClass__Group_3__1 )
            // InternalOntoL.g:2330:2: rule__OrderlessClass__Group_3__0__Impl rule__OrderlessClass__Group_3__1
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
    // InternalOntoL.g:2337:1: rule__OrderlessClass__Group_3__0__Impl : ( ':' ) ;
    public final void rule__OrderlessClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2341:1: ( ( ':' ) )
            // InternalOntoL.g:2342:1: ( ':' )
            {
            // InternalOntoL.g:2342:1: ( ':' )
            // InternalOntoL.g:2343:2: ':'
            {
             before(grammarAccess.getOrderlessClassAccess().getColonKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoL.g:2352:1: rule__OrderlessClass__Group_3__1 : rule__OrderlessClass__Group_3__1__Impl rule__OrderlessClass__Group_3__2 ;
    public final void rule__OrderlessClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2356:1: ( rule__OrderlessClass__Group_3__1__Impl rule__OrderlessClass__Group_3__2 )
            // InternalOntoL.g:2357:2: rule__OrderlessClass__Group_3__1__Impl rule__OrderlessClass__Group_3__2
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
    // InternalOntoL.g:2364:1: rule__OrderlessClass__Group_3__1__Impl : ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 ) ) ;
    public final void rule__OrderlessClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2368:1: ( ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 ) ) )
            // InternalOntoL.g:2369:1: ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 ) )
            {
            // InternalOntoL.g:2369:1: ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 ) )
            // InternalOntoL.g:2370:2: ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesAssignment_3_1()); 
            // InternalOntoL.g:2371:2: ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 )
            // InternalOntoL.g:2371:3: rule__OrderlessClass__InstantiatedClassesAssignment_3_1
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
    // InternalOntoL.g:2379:1: rule__OrderlessClass__Group_3__2 : rule__OrderlessClass__Group_3__2__Impl ;
    public final void rule__OrderlessClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2383:1: ( rule__OrderlessClass__Group_3__2__Impl )
            // InternalOntoL.g:2384:2: rule__OrderlessClass__Group_3__2__Impl
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
    // InternalOntoL.g:2390:1: rule__OrderlessClass__Group_3__2__Impl : ( ( rule__OrderlessClass__Group_3_2__0 )* ) ;
    public final void rule__OrderlessClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2394:1: ( ( ( rule__OrderlessClass__Group_3_2__0 )* ) )
            // InternalOntoL.g:2395:1: ( ( rule__OrderlessClass__Group_3_2__0 )* )
            {
            // InternalOntoL.g:2395:1: ( ( rule__OrderlessClass__Group_3_2__0 )* )
            // InternalOntoL.g:2396:2: ( rule__OrderlessClass__Group_3_2__0 )*
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_3_2()); 
            // InternalOntoL.g:2397:2: ( rule__OrderlessClass__Group_3_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==28) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalOntoL.g:2397:3: rule__OrderlessClass__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OrderlessClass__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalOntoL.g:2406:1: rule__OrderlessClass__Group_3_2__0 : rule__OrderlessClass__Group_3_2__0__Impl rule__OrderlessClass__Group_3_2__1 ;
    public final void rule__OrderlessClass__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2410:1: ( rule__OrderlessClass__Group_3_2__0__Impl rule__OrderlessClass__Group_3_2__1 )
            // InternalOntoL.g:2411:2: rule__OrderlessClass__Group_3_2__0__Impl rule__OrderlessClass__Group_3_2__1
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
    // InternalOntoL.g:2418:1: rule__OrderlessClass__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__OrderlessClass__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2422:1: ( ( ',' ) )
            // InternalOntoL.g:2423:1: ( ',' )
            {
            // InternalOntoL.g:2423:1: ( ',' )
            // InternalOntoL.g:2424:2: ','
            {
             before(grammarAccess.getOrderlessClassAccess().getCommaKeyword_3_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoL.g:2433:1: rule__OrderlessClass__Group_3_2__1 : rule__OrderlessClass__Group_3_2__1__Impl ;
    public final void rule__OrderlessClass__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2437:1: ( rule__OrderlessClass__Group_3_2__1__Impl )
            // InternalOntoL.g:2438:2: rule__OrderlessClass__Group_3_2__1__Impl
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
    // InternalOntoL.g:2444:1: rule__OrderlessClass__Group_3_2__1__Impl : ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 ) ) ;
    public final void rule__OrderlessClass__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2448:1: ( ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 ) ) )
            // InternalOntoL.g:2449:1: ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 ) )
            {
            // InternalOntoL.g:2449:1: ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 ) )
            // InternalOntoL.g:2450:2: ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesAssignment_3_2_1()); 
            // InternalOntoL.g:2451:2: ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 )
            // InternalOntoL.g:2451:3: rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1
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
    // InternalOntoL.g:2460:1: rule__OrderlessClass__Group_4__0 : rule__OrderlessClass__Group_4__0__Impl rule__OrderlessClass__Group_4__1 ;
    public final void rule__OrderlessClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2464:1: ( rule__OrderlessClass__Group_4__0__Impl rule__OrderlessClass__Group_4__1 )
            // InternalOntoL.g:2465:2: rule__OrderlessClass__Group_4__0__Impl rule__OrderlessClass__Group_4__1
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
    // InternalOntoL.g:2472:1: rule__OrderlessClass__Group_4__0__Impl : ( 'specializes' ) ;
    public final void rule__OrderlessClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2476:1: ( ( 'specializes' ) )
            // InternalOntoL.g:2477:1: ( 'specializes' )
            {
            // InternalOntoL.g:2477:1: ( 'specializes' )
            // InternalOntoL.g:2478:2: 'specializes'
            {
             before(grammarAccess.getOrderlessClassAccess().getSpecializesKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalOntoL.g:2487:1: rule__OrderlessClass__Group_4__1 : rule__OrderlessClass__Group_4__1__Impl rule__OrderlessClass__Group_4__2 ;
    public final void rule__OrderlessClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2491:1: ( rule__OrderlessClass__Group_4__1__Impl rule__OrderlessClass__Group_4__2 )
            // InternalOntoL.g:2492:2: rule__OrderlessClass__Group_4__1__Impl rule__OrderlessClass__Group_4__2
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
    // InternalOntoL.g:2499:1: rule__OrderlessClass__Group_4__1__Impl : ( ( rule__OrderlessClass__SuperClassesAssignment_4_1 ) ) ;
    public final void rule__OrderlessClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2503:1: ( ( ( rule__OrderlessClass__SuperClassesAssignment_4_1 ) ) )
            // InternalOntoL.g:2504:1: ( ( rule__OrderlessClass__SuperClassesAssignment_4_1 ) )
            {
            // InternalOntoL.g:2504:1: ( ( rule__OrderlessClass__SuperClassesAssignment_4_1 ) )
            // InternalOntoL.g:2505:2: ( rule__OrderlessClass__SuperClassesAssignment_4_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getSuperClassesAssignment_4_1()); 
            // InternalOntoL.g:2506:2: ( rule__OrderlessClass__SuperClassesAssignment_4_1 )
            // InternalOntoL.g:2506:3: rule__OrderlessClass__SuperClassesAssignment_4_1
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
    // InternalOntoL.g:2514:1: rule__OrderlessClass__Group_4__2 : rule__OrderlessClass__Group_4__2__Impl ;
    public final void rule__OrderlessClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2518:1: ( rule__OrderlessClass__Group_4__2__Impl )
            // InternalOntoL.g:2519:2: rule__OrderlessClass__Group_4__2__Impl
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
    // InternalOntoL.g:2525:1: rule__OrderlessClass__Group_4__2__Impl : ( ( rule__OrderlessClass__Group_4_2__0 )* ) ;
    public final void rule__OrderlessClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2529:1: ( ( ( rule__OrderlessClass__Group_4_2__0 )* ) )
            // InternalOntoL.g:2530:1: ( ( rule__OrderlessClass__Group_4_2__0 )* )
            {
            // InternalOntoL.g:2530:1: ( ( rule__OrderlessClass__Group_4_2__0 )* )
            // InternalOntoL.g:2531:2: ( rule__OrderlessClass__Group_4_2__0 )*
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_4_2()); 
            // InternalOntoL.g:2532:2: ( rule__OrderlessClass__Group_4_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==28) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalOntoL.g:2532:3: rule__OrderlessClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OrderlessClass__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalOntoL.g:2541:1: rule__OrderlessClass__Group_4_2__0 : rule__OrderlessClass__Group_4_2__0__Impl rule__OrderlessClass__Group_4_2__1 ;
    public final void rule__OrderlessClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2545:1: ( rule__OrderlessClass__Group_4_2__0__Impl rule__OrderlessClass__Group_4_2__1 )
            // InternalOntoL.g:2546:2: rule__OrderlessClass__Group_4_2__0__Impl rule__OrderlessClass__Group_4_2__1
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
    // InternalOntoL.g:2553:1: rule__OrderlessClass__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__OrderlessClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2557:1: ( ( ',' ) )
            // InternalOntoL.g:2558:1: ( ',' )
            {
            // InternalOntoL.g:2558:1: ( ',' )
            // InternalOntoL.g:2559:2: ','
            {
             before(grammarAccess.getOrderlessClassAccess().getCommaKeyword_4_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoL.g:2568:1: rule__OrderlessClass__Group_4_2__1 : rule__OrderlessClass__Group_4_2__1__Impl ;
    public final void rule__OrderlessClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2572:1: ( rule__OrderlessClass__Group_4_2__1__Impl )
            // InternalOntoL.g:2573:2: rule__OrderlessClass__Group_4_2__1__Impl
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
    // InternalOntoL.g:2579:1: rule__OrderlessClass__Group_4_2__1__Impl : ( ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 ) ) ;
    public final void rule__OrderlessClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2583:1: ( ( ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 ) ) )
            // InternalOntoL.g:2584:1: ( ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 ) )
            {
            // InternalOntoL.g:2584:1: ( ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 ) )
            // InternalOntoL.g:2585:2: ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getSuperClassesAssignment_4_2_1()); 
            // InternalOntoL.g:2586:2: ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 )
            // InternalOntoL.g:2586:3: rule__OrderlessClass__SuperClassesAssignment_4_2_1
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
    // InternalOntoL.g:2595:1: rule__OrderlessClass__Group_5__0 : rule__OrderlessClass__Group_5__0__Impl rule__OrderlessClass__Group_5__1 ;
    public final void rule__OrderlessClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2599:1: ( rule__OrderlessClass__Group_5__0__Impl rule__OrderlessClass__Group_5__1 )
            // InternalOntoL.g:2600:2: rule__OrderlessClass__Group_5__0__Impl rule__OrderlessClass__Group_5__1
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
    // InternalOntoL.g:2607:1: rule__OrderlessClass__Group_5__0__Impl : ( 'subordinatedto' ) ;
    public final void rule__OrderlessClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2611:1: ( ( 'subordinatedto' ) )
            // InternalOntoL.g:2612:1: ( 'subordinatedto' )
            {
            // InternalOntoL.g:2612:1: ( 'subordinatedto' )
            // InternalOntoL.g:2613:2: 'subordinatedto'
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatedtoKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getOrderlessClassAccess().getSubordinatedtoKeyword_5_0()); 

            }


            }

        }
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
    // InternalOntoL.g:2622:1: rule__OrderlessClass__Group_5__1 : rule__OrderlessClass__Group_5__1__Impl rule__OrderlessClass__Group_5__2 ;
    public final void rule__OrderlessClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2626:1: ( rule__OrderlessClass__Group_5__1__Impl rule__OrderlessClass__Group_5__2 )
            // InternalOntoL.g:2627:2: rule__OrderlessClass__Group_5__1__Impl rule__OrderlessClass__Group_5__2
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
    // InternalOntoL.g:2634:1: rule__OrderlessClass__Group_5__1__Impl : ( ( rule__OrderlessClass__SubordinatorsAssignment_5_1 ) ) ;
    public final void rule__OrderlessClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2638:1: ( ( ( rule__OrderlessClass__SubordinatorsAssignment_5_1 ) ) )
            // InternalOntoL.g:2639:1: ( ( rule__OrderlessClass__SubordinatorsAssignment_5_1 ) )
            {
            // InternalOntoL.g:2639:1: ( ( rule__OrderlessClass__SubordinatorsAssignment_5_1 ) )
            // InternalOntoL.g:2640:2: ( rule__OrderlessClass__SubordinatorsAssignment_5_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatorsAssignment_5_1()); 
            // InternalOntoL.g:2641:2: ( rule__OrderlessClass__SubordinatorsAssignment_5_1 )
            // InternalOntoL.g:2641:3: rule__OrderlessClass__SubordinatorsAssignment_5_1
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
    // InternalOntoL.g:2649:1: rule__OrderlessClass__Group_5__2 : rule__OrderlessClass__Group_5__2__Impl ;
    public final void rule__OrderlessClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2653:1: ( rule__OrderlessClass__Group_5__2__Impl )
            // InternalOntoL.g:2654:2: rule__OrderlessClass__Group_5__2__Impl
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
    // InternalOntoL.g:2660:1: rule__OrderlessClass__Group_5__2__Impl : ( ( rule__OrderlessClass__Group_5_2__0 )* ) ;
    public final void rule__OrderlessClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2664:1: ( ( ( rule__OrderlessClass__Group_5_2__0 )* ) )
            // InternalOntoL.g:2665:1: ( ( rule__OrderlessClass__Group_5_2__0 )* )
            {
            // InternalOntoL.g:2665:1: ( ( rule__OrderlessClass__Group_5_2__0 )* )
            // InternalOntoL.g:2666:2: ( rule__OrderlessClass__Group_5_2__0 )*
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_5_2()); 
            // InternalOntoL.g:2667:2: ( rule__OrderlessClass__Group_5_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==28) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalOntoL.g:2667:3: rule__OrderlessClass__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OrderlessClass__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalOntoL.g:2676:1: rule__OrderlessClass__Group_5_2__0 : rule__OrderlessClass__Group_5_2__0__Impl rule__OrderlessClass__Group_5_2__1 ;
    public final void rule__OrderlessClass__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2680:1: ( rule__OrderlessClass__Group_5_2__0__Impl rule__OrderlessClass__Group_5_2__1 )
            // InternalOntoL.g:2681:2: rule__OrderlessClass__Group_5_2__0__Impl rule__OrderlessClass__Group_5_2__1
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
    // InternalOntoL.g:2688:1: rule__OrderlessClass__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__OrderlessClass__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2692:1: ( ( ',' ) )
            // InternalOntoL.g:2693:1: ( ',' )
            {
            // InternalOntoL.g:2693:1: ( ',' )
            // InternalOntoL.g:2694:2: ','
            {
             before(grammarAccess.getOrderlessClassAccess().getCommaKeyword_5_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoL.g:2703:1: rule__OrderlessClass__Group_5_2__1 : rule__OrderlessClass__Group_5_2__1__Impl ;
    public final void rule__OrderlessClass__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2707:1: ( rule__OrderlessClass__Group_5_2__1__Impl )
            // InternalOntoL.g:2708:2: rule__OrderlessClass__Group_5_2__1__Impl
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
    // InternalOntoL.g:2714:1: rule__OrderlessClass__Group_5_2__1__Impl : ( ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 ) ) ;
    public final void rule__OrderlessClass__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2718:1: ( ( ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 ) ) )
            // InternalOntoL.g:2719:1: ( ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 ) )
            {
            // InternalOntoL.g:2719:1: ( ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 ) )
            // InternalOntoL.g:2720:2: ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatorsAssignment_5_2_1()); 
            // InternalOntoL.g:2721:2: ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 )
            // InternalOntoL.g:2721:3: rule__OrderlessClass__SubordinatorsAssignment_5_2_1
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
    // InternalOntoL.g:2730:1: rule__OrderlessClass__Group_6_0__0 : rule__OrderlessClass__Group_6_0__0__Impl rule__OrderlessClass__Group_6_0__1 ;
    public final void rule__OrderlessClass__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2734:1: ( rule__OrderlessClass__Group_6_0__0__Impl rule__OrderlessClass__Group_6_0__1 )
            // InternalOntoL.g:2735:2: rule__OrderlessClass__Group_6_0__0__Impl rule__OrderlessClass__Group_6_0__1
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
    // InternalOntoL.g:2742:1: rule__OrderlessClass__Group_6_0__0__Impl : ( ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 ) ) ;
    public final void rule__OrderlessClass__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2746:1: ( ( ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 ) ) )
            // InternalOntoL.g:2747:1: ( ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 ) )
            {
            // InternalOntoL.g:2747:1: ( ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 ) )
            // InternalOntoL.g:2748:2: ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 )
            {
             before(grammarAccess.getOrderlessClassAccess().getCategorizationTypeAssignment_6_0_0()); 
            // InternalOntoL.g:2749:2: ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 )
            // InternalOntoL.g:2749:3: rule__OrderlessClass__CategorizationTypeAssignment_6_0_0
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
    // InternalOntoL.g:2757:1: rule__OrderlessClass__Group_6_0__1 : rule__OrderlessClass__Group_6_0__1__Impl ;
    public final void rule__OrderlessClass__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2761:1: ( rule__OrderlessClass__Group_6_0__1__Impl )
            // InternalOntoL.g:2762:2: rule__OrderlessClass__Group_6_0__1__Impl
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
    // InternalOntoL.g:2768:1: rule__OrderlessClass__Group_6_0__1__Impl : ( ( rule__OrderlessClass__BasetypeAssignment_6_0_1 ) ) ;
    public final void rule__OrderlessClass__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2772:1: ( ( ( rule__OrderlessClass__BasetypeAssignment_6_0_1 ) ) )
            // InternalOntoL.g:2773:1: ( ( rule__OrderlessClass__BasetypeAssignment_6_0_1 ) )
            {
            // InternalOntoL.g:2773:1: ( ( rule__OrderlessClass__BasetypeAssignment_6_0_1 ) )
            // InternalOntoL.g:2774:2: ( rule__OrderlessClass__BasetypeAssignment_6_0_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getBasetypeAssignment_6_0_1()); 
            // InternalOntoL.g:2775:2: ( rule__OrderlessClass__BasetypeAssignment_6_0_1 )
            // InternalOntoL.g:2775:3: rule__OrderlessClass__BasetypeAssignment_6_0_1
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
    // InternalOntoL.g:2784:1: rule__OrderlessClass__Group_6_1__0 : rule__OrderlessClass__Group_6_1__0__Impl rule__OrderlessClass__Group_6_1__1 ;
    public final void rule__OrderlessClass__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2788:1: ( rule__OrderlessClass__Group_6_1__0__Impl rule__OrderlessClass__Group_6_1__1 )
            // InternalOntoL.g:2789:2: rule__OrderlessClass__Group_6_1__0__Impl rule__OrderlessClass__Group_6_1__1
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
    // InternalOntoL.g:2796:1: rule__OrderlessClass__Group_6_1__0__Impl : ( 'ispowertypeof' ) ;
    public final void rule__OrderlessClass__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2800:1: ( ( 'ispowertypeof' ) )
            // InternalOntoL.g:2801:1: ( 'ispowertypeof' )
            {
            // InternalOntoL.g:2801:1: ( 'ispowertypeof' )
            // InternalOntoL.g:2802:2: 'ispowertypeof'
            {
             before(grammarAccess.getOrderlessClassAccess().getIspowertypeofKeyword_6_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOrderlessClassAccess().getIspowertypeofKeyword_6_1_0()); 

            }


            }

        }
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
    // InternalOntoL.g:2811:1: rule__OrderlessClass__Group_6_1__1 : rule__OrderlessClass__Group_6_1__1__Impl ;
    public final void rule__OrderlessClass__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2815:1: ( rule__OrderlessClass__Group_6_1__1__Impl )
            // InternalOntoL.g:2816:2: rule__OrderlessClass__Group_6_1__1__Impl
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
    // InternalOntoL.g:2822:1: rule__OrderlessClass__Group_6_1__1__Impl : ( ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 ) ) ;
    public final void rule__OrderlessClass__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2826:1: ( ( ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 ) ) )
            // InternalOntoL.g:2827:1: ( ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 ) )
            {
            // InternalOntoL.g:2827:1: ( ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 ) )
            // InternalOntoL.g:2828:2: ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getPowertypeOfAssignment_6_1_1()); 
            // InternalOntoL.g:2829:2: ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 )
            // InternalOntoL.g:2829:3: rule__OrderlessClass__PowertypeOfAssignment_6_1_1
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
    // InternalOntoL.g:2838:1: rule__FOClass__Group__0 : rule__FOClass__Group__0__Impl rule__FOClass__Group__1 ;
    public final void rule__FOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2842:1: ( rule__FOClass__Group__0__Impl rule__FOClass__Group__1 )
            // InternalOntoL.g:2843:2: rule__FOClass__Group__0__Impl rule__FOClass__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalOntoL.g:2850:1: rule__FOClass__Group__0__Impl : ( ( 'first-order' )? ) ;
    public final void rule__FOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2854:1: ( ( ( 'first-order' )? ) )
            // InternalOntoL.g:2855:1: ( ( 'first-order' )? )
            {
            // InternalOntoL.g:2855:1: ( ( 'first-order' )? )
            // InternalOntoL.g:2856:2: ( 'first-order' )?
            {
             before(grammarAccess.getFOClassAccess().getFirstOrderKeyword_0()); 
            // InternalOntoL.g:2857:2: ( 'first-order' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOntoL.g:2857:3: 'first-order'
                    {
                    match(input,34,FOLLOW_2); 

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
    // InternalOntoL.g:2865:1: rule__FOClass__Group__1 : rule__FOClass__Group__1__Impl rule__FOClass__Group__2 ;
    public final void rule__FOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2869:1: ( rule__FOClass__Group__1__Impl rule__FOClass__Group__2 )
            // InternalOntoL.g:2870:2: rule__FOClass__Group__1__Impl rule__FOClass__Group__2
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
    // InternalOntoL.g:2877:1: rule__FOClass__Group__1__Impl : ( 'class' ) ;
    public final void rule__FOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2881:1: ( ( 'class' ) )
            // InternalOntoL.g:2882:1: ( 'class' )
            {
            // InternalOntoL.g:2882:1: ( 'class' )
            // InternalOntoL.g:2883:2: 'class'
            {
             before(grammarAccess.getFOClassAccess().getClassKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalOntoL.g:2892:1: rule__FOClass__Group__2 : rule__FOClass__Group__2__Impl rule__FOClass__Group__3 ;
    public final void rule__FOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2896:1: ( rule__FOClass__Group__2__Impl rule__FOClass__Group__3 )
            // InternalOntoL.g:2897:2: rule__FOClass__Group__2__Impl rule__FOClass__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalOntoL.g:2904:1: rule__FOClass__Group__2__Impl : ( ( rule__FOClass__NameAssignment_2 ) ) ;
    public final void rule__FOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2908:1: ( ( ( rule__FOClass__NameAssignment_2 ) ) )
            // InternalOntoL.g:2909:1: ( ( rule__FOClass__NameAssignment_2 ) )
            {
            // InternalOntoL.g:2909:1: ( ( rule__FOClass__NameAssignment_2 ) )
            // InternalOntoL.g:2910:2: ( rule__FOClass__NameAssignment_2 )
            {
             before(grammarAccess.getFOClassAccess().getNameAssignment_2()); 
            // InternalOntoL.g:2911:2: ( rule__FOClass__NameAssignment_2 )
            // InternalOntoL.g:2911:3: rule__FOClass__NameAssignment_2
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
    // InternalOntoL.g:2919:1: rule__FOClass__Group__3 : rule__FOClass__Group__3__Impl rule__FOClass__Group__4 ;
    public final void rule__FOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2923:1: ( rule__FOClass__Group__3__Impl rule__FOClass__Group__4 )
            // InternalOntoL.g:2924:2: rule__FOClass__Group__3__Impl rule__FOClass__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalOntoL.g:2931:1: rule__FOClass__Group__3__Impl : ( ( rule__FOClass__Group_3__0 )? ) ;
    public final void rule__FOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2935:1: ( ( ( rule__FOClass__Group_3__0 )? ) )
            // InternalOntoL.g:2936:1: ( ( rule__FOClass__Group_3__0 )? )
            {
            // InternalOntoL.g:2936:1: ( ( rule__FOClass__Group_3__0 )? )
            // InternalOntoL.g:2937:2: ( rule__FOClass__Group_3__0 )?
            {
             before(grammarAccess.getFOClassAccess().getGroup_3()); 
            // InternalOntoL.g:2938:2: ( rule__FOClass__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==27) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOntoL.g:2938:3: rule__FOClass__Group_3__0
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
    // InternalOntoL.g:2946:1: rule__FOClass__Group__4 : rule__FOClass__Group__4__Impl ;
    public final void rule__FOClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2950:1: ( rule__FOClass__Group__4__Impl )
            // InternalOntoL.g:2951:2: rule__FOClass__Group__4__Impl
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
    // InternalOntoL.g:2957:1: rule__FOClass__Group__4__Impl : ( ( rule__FOClass__Group_4__0 )? ) ;
    public final void rule__FOClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2961:1: ( ( ( rule__FOClass__Group_4__0 )? ) )
            // InternalOntoL.g:2962:1: ( ( rule__FOClass__Group_4__0 )? )
            {
            // InternalOntoL.g:2962:1: ( ( rule__FOClass__Group_4__0 )? )
            // InternalOntoL.g:2963:2: ( rule__FOClass__Group_4__0 )?
            {
             before(grammarAccess.getFOClassAccess().getGroup_4()); 
            // InternalOntoL.g:2964:2: ( rule__FOClass__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==31) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOntoL.g:2964:3: rule__FOClass__Group_4__0
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
    // InternalOntoL.g:2973:1: rule__FOClass__Group_3__0 : rule__FOClass__Group_3__0__Impl rule__FOClass__Group_3__1 ;
    public final void rule__FOClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2977:1: ( rule__FOClass__Group_3__0__Impl rule__FOClass__Group_3__1 )
            // InternalOntoL.g:2978:2: rule__FOClass__Group_3__0__Impl rule__FOClass__Group_3__1
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
    // InternalOntoL.g:2985:1: rule__FOClass__Group_3__0__Impl : ( ':' ) ;
    public final void rule__FOClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2989:1: ( ( ':' ) )
            // InternalOntoL.g:2990:1: ( ':' )
            {
            // InternalOntoL.g:2990:1: ( ':' )
            // InternalOntoL.g:2991:2: ':'
            {
             before(grammarAccess.getFOClassAccess().getColonKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoL.g:3000:1: rule__FOClass__Group_3__1 : rule__FOClass__Group_3__1__Impl rule__FOClass__Group_3__2 ;
    public final void rule__FOClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3004:1: ( rule__FOClass__Group_3__1__Impl rule__FOClass__Group_3__2 )
            // InternalOntoL.g:3005:2: rule__FOClass__Group_3__1__Impl rule__FOClass__Group_3__2
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
    // InternalOntoL.g:3012:1: rule__FOClass__Group_3__1__Impl : ( ( rule__FOClass__InstantiatedClassesAssignment_3_1 ) ) ;
    public final void rule__FOClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3016:1: ( ( ( rule__FOClass__InstantiatedClassesAssignment_3_1 ) ) )
            // InternalOntoL.g:3017:1: ( ( rule__FOClass__InstantiatedClassesAssignment_3_1 ) )
            {
            // InternalOntoL.g:3017:1: ( ( rule__FOClass__InstantiatedClassesAssignment_3_1 ) )
            // InternalOntoL.g:3018:2: ( rule__FOClass__InstantiatedClassesAssignment_3_1 )
            {
             before(grammarAccess.getFOClassAccess().getInstantiatedClassesAssignment_3_1()); 
            // InternalOntoL.g:3019:2: ( rule__FOClass__InstantiatedClassesAssignment_3_1 )
            // InternalOntoL.g:3019:3: rule__FOClass__InstantiatedClassesAssignment_3_1
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
    // InternalOntoL.g:3027:1: rule__FOClass__Group_3__2 : rule__FOClass__Group_3__2__Impl ;
    public final void rule__FOClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3031:1: ( rule__FOClass__Group_3__2__Impl )
            // InternalOntoL.g:3032:2: rule__FOClass__Group_3__2__Impl
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
    // InternalOntoL.g:3038:1: rule__FOClass__Group_3__2__Impl : ( ( rule__FOClass__Group_3_2__0 )* ) ;
    public final void rule__FOClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3042:1: ( ( ( rule__FOClass__Group_3_2__0 )* ) )
            // InternalOntoL.g:3043:1: ( ( rule__FOClass__Group_3_2__0 )* )
            {
            // InternalOntoL.g:3043:1: ( ( rule__FOClass__Group_3_2__0 )* )
            // InternalOntoL.g:3044:2: ( rule__FOClass__Group_3_2__0 )*
            {
             before(grammarAccess.getFOClassAccess().getGroup_3_2()); 
            // InternalOntoL.g:3045:2: ( rule__FOClass__Group_3_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==28) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalOntoL.g:3045:3: rule__FOClass__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__FOClass__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalOntoL.g:3054:1: rule__FOClass__Group_3_2__0 : rule__FOClass__Group_3_2__0__Impl rule__FOClass__Group_3_2__1 ;
    public final void rule__FOClass__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3058:1: ( rule__FOClass__Group_3_2__0__Impl rule__FOClass__Group_3_2__1 )
            // InternalOntoL.g:3059:2: rule__FOClass__Group_3_2__0__Impl rule__FOClass__Group_3_2__1
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
    // InternalOntoL.g:3066:1: rule__FOClass__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__FOClass__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3070:1: ( ( ',' ) )
            // InternalOntoL.g:3071:1: ( ',' )
            {
            // InternalOntoL.g:3071:1: ( ',' )
            // InternalOntoL.g:3072:2: ','
            {
             before(grammarAccess.getFOClassAccess().getCommaKeyword_3_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoL.g:3081:1: rule__FOClass__Group_3_2__1 : rule__FOClass__Group_3_2__1__Impl ;
    public final void rule__FOClass__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3085:1: ( rule__FOClass__Group_3_2__1__Impl )
            // InternalOntoL.g:3086:2: rule__FOClass__Group_3_2__1__Impl
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
    // InternalOntoL.g:3092:1: rule__FOClass__Group_3_2__1__Impl : ( ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 ) ) ;
    public final void rule__FOClass__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3096:1: ( ( ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 ) ) )
            // InternalOntoL.g:3097:1: ( ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 ) )
            {
            // InternalOntoL.g:3097:1: ( ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 ) )
            // InternalOntoL.g:3098:2: ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 )
            {
             before(grammarAccess.getFOClassAccess().getInstantiatedClassesAssignment_3_2_1()); 
            // InternalOntoL.g:3099:2: ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 )
            // InternalOntoL.g:3099:3: rule__FOClass__InstantiatedClassesAssignment_3_2_1
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
    // InternalOntoL.g:3108:1: rule__FOClass__Group_4__0 : rule__FOClass__Group_4__0__Impl rule__FOClass__Group_4__1 ;
    public final void rule__FOClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3112:1: ( rule__FOClass__Group_4__0__Impl rule__FOClass__Group_4__1 )
            // InternalOntoL.g:3113:2: rule__FOClass__Group_4__0__Impl rule__FOClass__Group_4__1
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
    // InternalOntoL.g:3120:1: rule__FOClass__Group_4__0__Impl : ( 'specializes' ) ;
    public final void rule__FOClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3124:1: ( ( 'specializes' ) )
            // InternalOntoL.g:3125:1: ( 'specializes' )
            {
            // InternalOntoL.g:3125:1: ( 'specializes' )
            // InternalOntoL.g:3126:2: 'specializes'
            {
             before(grammarAccess.getFOClassAccess().getSpecializesKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalOntoL.g:3135:1: rule__FOClass__Group_4__1 : rule__FOClass__Group_4__1__Impl rule__FOClass__Group_4__2 ;
    public final void rule__FOClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3139:1: ( rule__FOClass__Group_4__1__Impl rule__FOClass__Group_4__2 )
            // InternalOntoL.g:3140:2: rule__FOClass__Group_4__1__Impl rule__FOClass__Group_4__2
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
    // InternalOntoL.g:3147:1: rule__FOClass__Group_4__1__Impl : ( ( rule__FOClass__SuperClassesAssignment_4_1 ) ) ;
    public final void rule__FOClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3151:1: ( ( ( rule__FOClass__SuperClassesAssignment_4_1 ) ) )
            // InternalOntoL.g:3152:1: ( ( rule__FOClass__SuperClassesAssignment_4_1 ) )
            {
            // InternalOntoL.g:3152:1: ( ( rule__FOClass__SuperClassesAssignment_4_1 ) )
            // InternalOntoL.g:3153:2: ( rule__FOClass__SuperClassesAssignment_4_1 )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesAssignment_4_1()); 
            // InternalOntoL.g:3154:2: ( rule__FOClass__SuperClassesAssignment_4_1 )
            // InternalOntoL.g:3154:3: rule__FOClass__SuperClassesAssignment_4_1
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
    // InternalOntoL.g:3162:1: rule__FOClass__Group_4__2 : rule__FOClass__Group_4__2__Impl ;
    public final void rule__FOClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3166:1: ( rule__FOClass__Group_4__2__Impl )
            // InternalOntoL.g:3167:2: rule__FOClass__Group_4__2__Impl
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
    // InternalOntoL.g:3173:1: rule__FOClass__Group_4__2__Impl : ( ( rule__FOClass__Group_4_2__0 )* ) ;
    public final void rule__FOClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3177:1: ( ( ( rule__FOClass__Group_4_2__0 )* ) )
            // InternalOntoL.g:3178:1: ( ( rule__FOClass__Group_4_2__0 )* )
            {
            // InternalOntoL.g:3178:1: ( ( rule__FOClass__Group_4_2__0 )* )
            // InternalOntoL.g:3179:2: ( rule__FOClass__Group_4_2__0 )*
            {
             before(grammarAccess.getFOClassAccess().getGroup_4_2()); 
            // InternalOntoL.g:3180:2: ( rule__FOClass__Group_4_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==28) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalOntoL.g:3180:3: rule__FOClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__FOClass__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalOntoL.g:3189:1: rule__FOClass__Group_4_2__0 : rule__FOClass__Group_4_2__0__Impl rule__FOClass__Group_4_2__1 ;
    public final void rule__FOClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3193:1: ( rule__FOClass__Group_4_2__0__Impl rule__FOClass__Group_4_2__1 )
            // InternalOntoL.g:3194:2: rule__FOClass__Group_4_2__0__Impl rule__FOClass__Group_4_2__1
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
    // InternalOntoL.g:3201:1: rule__FOClass__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__FOClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3205:1: ( ( ',' ) )
            // InternalOntoL.g:3206:1: ( ',' )
            {
            // InternalOntoL.g:3206:1: ( ',' )
            // InternalOntoL.g:3207:2: ','
            {
             before(grammarAccess.getFOClassAccess().getCommaKeyword_4_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoL.g:3216:1: rule__FOClass__Group_4_2__1 : rule__FOClass__Group_4_2__1__Impl ;
    public final void rule__FOClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3220:1: ( rule__FOClass__Group_4_2__1__Impl )
            // InternalOntoL.g:3221:2: rule__FOClass__Group_4_2__1__Impl
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
    // InternalOntoL.g:3227:1: rule__FOClass__Group_4_2__1__Impl : ( ( rule__FOClass__SuperClassesAssignment_4_2_1 ) ) ;
    public final void rule__FOClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3231:1: ( ( ( rule__FOClass__SuperClassesAssignment_4_2_1 ) ) )
            // InternalOntoL.g:3232:1: ( ( rule__FOClass__SuperClassesAssignment_4_2_1 ) )
            {
            // InternalOntoL.g:3232:1: ( ( rule__FOClass__SuperClassesAssignment_4_2_1 ) )
            // InternalOntoL.g:3233:2: ( rule__FOClass__SuperClassesAssignment_4_2_1 )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesAssignment_4_2_1()); 
            // InternalOntoL.g:3234:2: ( rule__FOClass__SuperClassesAssignment_4_2_1 )
            // InternalOntoL.g:3234:3: rule__FOClass__SuperClassesAssignment_4_2_1
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
    // InternalOntoL.g:3243:1: rule__HOClass__Group__0 : rule__HOClass__Group__0__Impl rule__HOClass__Group__1 ;
    public final void rule__HOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3247:1: ( rule__HOClass__Group__0__Impl rule__HOClass__Group__1 )
            // InternalOntoL.g:3248:2: rule__HOClass__Group__0__Impl rule__HOClass__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalOntoL.g:3255:1: rule__HOClass__Group__0__Impl : ( 'order' ) ;
    public final void rule__HOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3259:1: ( ( 'order' ) )
            // InternalOntoL.g:3260:1: ( 'order' )
            {
            // InternalOntoL.g:3260:1: ( 'order' )
            // InternalOntoL.g:3261:2: 'order'
            {
             before(grammarAccess.getHOClassAccess().getOrderKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalOntoL.g:3270:1: rule__HOClass__Group__1 : rule__HOClass__Group__1__Impl rule__HOClass__Group__2 ;
    public final void rule__HOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3274:1: ( rule__HOClass__Group__1__Impl rule__HOClass__Group__2 )
            // InternalOntoL.g:3275:2: rule__HOClass__Group__1__Impl rule__HOClass__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalOntoL.g:3282:1: rule__HOClass__Group__1__Impl : ( ( rule__HOClass__OrderAssignment_1 ) ) ;
    public final void rule__HOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3286:1: ( ( ( rule__HOClass__OrderAssignment_1 ) ) )
            // InternalOntoL.g:3287:1: ( ( rule__HOClass__OrderAssignment_1 ) )
            {
            // InternalOntoL.g:3287:1: ( ( rule__HOClass__OrderAssignment_1 ) )
            // InternalOntoL.g:3288:2: ( rule__HOClass__OrderAssignment_1 )
            {
             before(grammarAccess.getHOClassAccess().getOrderAssignment_1()); 
            // InternalOntoL.g:3289:2: ( rule__HOClass__OrderAssignment_1 )
            // InternalOntoL.g:3289:3: rule__HOClass__OrderAssignment_1
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
    // InternalOntoL.g:3297:1: rule__HOClass__Group__2 : rule__HOClass__Group__2__Impl rule__HOClass__Group__3 ;
    public final void rule__HOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3301:1: ( rule__HOClass__Group__2__Impl rule__HOClass__Group__3 )
            // InternalOntoL.g:3302:2: rule__HOClass__Group__2__Impl rule__HOClass__Group__3
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
    // InternalOntoL.g:3309:1: rule__HOClass__Group__2__Impl : ( 'class' ) ;
    public final void rule__HOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3313:1: ( ( 'class' ) )
            // InternalOntoL.g:3314:1: ( 'class' )
            {
            // InternalOntoL.g:3314:1: ( 'class' )
            // InternalOntoL.g:3315:2: 'class'
            {
             before(grammarAccess.getHOClassAccess().getClassKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalOntoL.g:3324:1: rule__HOClass__Group__3 : rule__HOClass__Group__3__Impl rule__HOClass__Group__4 ;
    public final void rule__HOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3328:1: ( rule__HOClass__Group__3__Impl rule__HOClass__Group__4 )
            // InternalOntoL.g:3329:2: rule__HOClass__Group__3__Impl rule__HOClass__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalOntoL.g:3336:1: rule__HOClass__Group__3__Impl : ( ( rule__HOClass__NameAssignment_3 ) ) ;
    public final void rule__HOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3340:1: ( ( ( rule__HOClass__NameAssignment_3 ) ) )
            // InternalOntoL.g:3341:1: ( ( rule__HOClass__NameAssignment_3 ) )
            {
            // InternalOntoL.g:3341:1: ( ( rule__HOClass__NameAssignment_3 ) )
            // InternalOntoL.g:3342:2: ( rule__HOClass__NameAssignment_3 )
            {
             before(grammarAccess.getHOClassAccess().getNameAssignment_3()); 
            // InternalOntoL.g:3343:2: ( rule__HOClass__NameAssignment_3 )
            // InternalOntoL.g:3343:3: rule__HOClass__NameAssignment_3
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
    // InternalOntoL.g:3351:1: rule__HOClass__Group__4 : rule__HOClass__Group__4__Impl rule__HOClass__Group__5 ;
    public final void rule__HOClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3355:1: ( rule__HOClass__Group__4__Impl rule__HOClass__Group__5 )
            // InternalOntoL.g:3356:2: rule__HOClass__Group__4__Impl rule__HOClass__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalOntoL.g:3363:1: rule__HOClass__Group__4__Impl : ( ( rule__HOClass__Group_4__0 )? ) ;
    public final void rule__HOClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3367:1: ( ( ( rule__HOClass__Group_4__0 )? ) )
            // InternalOntoL.g:3368:1: ( ( rule__HOClass__Group_4__0 )? )
            {
            // InternalOntoL.g:3368:1: ( ( rule__HOClass__Group_4__0 )? )
            // InternalOntoL.g:3369:2: ( rule__HOClass__Group_4__0 )?
            {
             before(grammarAccess.getHOClassAccess().getGroup_4()); 
            // InternalOntoL.g:3370:2: ( rule__HOClass__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==27) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOntoL.g:3370:3: rule__HOClass__Group_4__0
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
    // InternalOntoL.g:3378:1: rule__HOClass__Group__5 : rule__HOClass__Group__5__Impl rule__HOClass__Group__6 ;
    public final void rule__HOClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3382:1: ( rule__HOClass__Group__5__Impl rule__HOClass__Group__6 )
            // InternalOntoL.g:3383:2: rule__HOClass__Group__5__Impl rule__HOClass__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalOntoL.g:3390:1: rule__HOClass__Group__5__Impl : ( ( rule__HOClass__Group_5__0 )? ) ;
    public final void rule__HOClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3394:1: ( ( ( rule__HOClass__Group_5__0 )? ) )
            // InternalOntoL.g:3395:1: ( ( rule__HOClass__Group_5__0 )? )
            {
            // InternalOntoL.g:3395:1: ( ( rule__HOClass__Group_5__0 )? )
            // InternalOntoL.g:3396:2: ( rule__HOClass__Group_5__0 )?
            {
             before(grammarAccess.getHOClassAccess().getGroup_5()); 
            // InternalOntoL.g:3397:2: ( rule__HOClass__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==31) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOntoL.g:3397:3: rule__HOClass__Group_5__0
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
    // InternalOntoL.g:3405:1: rule__HOClass__Group__6 : rule__HOClass__Group__6__Impl rule__HOClass__Group__7 ;
    public final void rule__HOClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3409:1: ( rule__HOClass__Group__6__Impl rule__HOClass__Group__7 )
            // InternalOntoL.g:3410:2: rule__HOClass__Group__6__Impl rule__HOClass__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalOntoL.g:3417:1: rule__HOClass__Group__6__Impl : ( ( rule__HOClass__Group_6__0 )? ) ;
    public final void rule__HOClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3421:1: ( ( ( rule__HOClass__Group_6__0 )? ) )
            // InternalOntoL.g:3422:1: ( ( rule__HOClass__Group_6__0 )? )
            {
            // InternalOntoL.g:3422:1: ( ( rule__HOClass__Group_6__0 )? )
            // InternalOntoL.g:3423:2: ( rule__HOClass__Group_6__0 )?
            {
             before(grammarAccess.getHOClassAccess().getGroup_6()); 
            // InternalOntoL.g:3424:2: ( rule__HOClass__Group_6__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==32) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalOntoL.g:3424:3: rule__HOClass__Group_6__0
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
    // InternalOntoL.g:3432:1: rule__HOClass__Group__7 : rule__HOClass__Group__7__Impl ;
    public final void rule__HOClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3436:1: ( rule__HOClass__Group__7__Impl )
            // InternalOntoL.g:3437:2: rule__HOClass__Group__7__Impl
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
    // InternalOntoL.g:3443:1: rule__HOClass__Group__7__Impl : ( ( rule__HOClass__Alternatives_7 )? ) ;
    public final void rule__HOClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3447:1: ( ( ( rule__HOClass__Alternatives_7 )? ) )
            // InternalOntoL.g:3448:1: ( ( rule__HOClass__Alternatives_7 )? )
            {
            // InternalOntoL.g:3448:1: ( ( rule__HOClass__Alternatives_7 )? )
            // InternalOntoL.g:3449:2: ( rule__HOClass__Alternatives_7 )?
            {
             before(grammarAccess.getHOClassAccess().getAlternatives_7()); 
            // InternalOntoL.g:3450:2: ( rule__HOClass__Alternatives_7 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=14 && LA42_0<=17)||LA42_0==33) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOntoL.g:3450:3: rule__HOClass__Alternatives_7
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
    // InternalOntoL.g:3459:1: rule__HOClass__Group_4__0 : rule__HOClass__Group_4__0__Impl rule__HOClass__Group_4__1 ;
    public final void rule__HOClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3463:1: ( rule__HOClass__Group_4__0__Impl rule__HOClass__Group_4__1 )
            // InternalOntoL.g:3464:2: rule__HOClass__Group_4__0__Impl rule__HOClass__Group_4__1
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
    // InternalOntoL.g:3471:1: rule__HOClass__Group_4__0__Impl : ( ':' ) ;
    public final void rule__HOClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3475:1: ( ( ':' ) )
            // InternalOntoL.g:3476:1: ( ':' )
            {
            // InternalOntoL.g:3476:1: ( ':' )
            // InternalOntoL.g:3477:2: ':'
            {
             before(grammarAccess.getHOClassAccess().getColonKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoL.g:3486:1: rule__HOClass__Group_4__1 : rule__HOClass__Group_4__1__Impl rule__HOClass__Group_4__2 ;
    public final void rule__HOClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3490:1: ( rule__HOClass__Group_4__1__Impl rule__HOClass__Group_4__2 )
            // InternalOntoL.g:3491:2: rule__HOClass__Group_4__1__Impl rule__HOClass__Group_4__2
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
    // InternalOntoL.g:3498:1: rule__HOClass__Group_4__1__Impl : ( ( rule__HOClass__InstantiatedClassesAssignment_4_1 ) ) ;
    public final void rule__HOClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3502:1: ( ( ( rule__HOClass__InstantiatedClassesAssignment_4_1 ) ) )
            // InternalOntoL.g:3503:1: ( ( rule__HOClass__InstantiatedClassesAssignment_4_1 ) )
            {
            // InternalOntoL.g:3503:1: ( ( rule__HOClass__InstantiatedClassesAssignment_4_1 ) )
            // InternalOntoL.g:3504:2: ( rule__HOClass__InstantiatedClassesAssignment_4_1 )
            {
             before(grammarAccess.getHOClassAccess().getInstantiatedClassesAssignment_4_1()); 
            // InternalOntoL.g:3505:2: ( rule__HOClass__InstantiatedClassesAssignment_4_1 )
            // InternalOntoL.g:3505:3: rule__HOClass__InstantiatedClassesAssignment_4_1
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
    // InternalOntoL.g:3513:1: rule__HOClass__Group_4__2 : rule__HOClass__Group_4__2__Impl ;
    public final void rule__HOClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3517:1: ( rule__HOClass__Group_4__2__Impl )
            // InternalOntoL.g:3518:2: rule__HOClass__Group_4__2__Impl
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
    // InternalOntoL.g:3524:1: rule__HOClass__Group_4__2__Impl : ( ( rule__HOClass__Group_4_2__0 )* ) ;
    public final void rule__HOClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3528:1: ( ( ( rule__HOClass__Group_4_2__0 )* ) )
            // InternalOntoL.g:3529:1: ( ( rule__HOClass__Group_4_2__0 )* )
            {
            // InternalOntoL.g:3529:1: ( ( rule__HOClass__Group_4_2__0 )* )
            // InternalOntoL.g:3530:2: ( rule__HOClass__Group_4_2__0 )*
            {
             before(grammarAccess.getHOClassAccess().getGroup_4_2()); 
            // InternalOntoL.g:3531:2: ( rule__HOClass__Group_4_2__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==28) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalOntoL.g:3531:3: rule__HOClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__HOClass__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalOntoL.g:3540:1: rule__HOClass__Group_4_2__0 : rule__HOClass__Group_4_2__0__Impl rule__HOClass__Group_4_2__1 ;
    public final void rule__HOClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3544:1: ( rule__HOClass__Group_4_2__0__Impl rule__HOClass__Group_4_2__1 )
            // InternalOntoL.g:3545:2: rule__HOClass__Group_4_2__0__Impl rule__HOClass__Group_4_2__1
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
    // InternalOntoL.g:3552:1: rule__HOClass__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__HOClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3556:1: ( ( ',' ) )
            // InternalOntoL.g:3557:1: ( ',' )
            {
            // InternalOntoL.g:3557:1: ( ',' )
            // InternalOntoL.g:3558:2: ','
            {
             before(grammarAccess.getHOClassAccess().getCommaKeyword_4_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoL.g:3567:1: rule__HOClass__Group_4_2__1 : rule__HOClass__Group_4_2__1__Impl ;
    public final void rule__HOClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3571:1: ( rule__HOClass__Group_4_2__1__Impl )
            // InternalOntoL.g:3572:2: rule__HOClass__Group_4_2__1__Impl
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
    // InternalOntoL.g:3578:1: rule__HOClass__Group_4_2__1__Impl : ( ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 ) ) ;
    public final void rule__HOClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3582:1: ( ( ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 ) ) )
            // InternalOntoL.g:3583:1: ( ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 ) )
            {
            // InternalOntoL.g:3583:1: ( ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 ) )
            // InternalOntoL.g:3584:2: ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 )
            {
             before(grammarAccess.getHOClassAccess().getInstantiatedClassesAssignment_4_2_1()); 
            // InternalOntoL.g:3585:2: ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 )
            // InternalOntoL.g:3585:3: rule__HOClass__InstantiatedClassesAssignment_4_2_1
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
    // InternalOntoL.g:3594:1: rule__HOClass__Group_5__0 : rule__HOClass__Group_5__0__Impl rule__HOClass__Group_5__1 ;
    public final void rule__HOClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3598:1: ( rule__HOClass__Group_5__0__Impl rule__HOClass__Group_5__1 )
            // InternalOntoL.g:3599:2: rule__HOClass__Group_5__0__Impl rule__HOClass__Group_5__1
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
    // InternalOntoL.g:3606:1: rule__HOClass__Group_5__0__Impl : ( 'specializes' ) ;
    public final void rule__HOClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3610:1: ( ( 'specializes' ) )
            // InternalOntoL.g:3611:1: ( 'specializes' )
            {
            // InternalOntoL.g:3611:1: ( 'specializes' )
            // InternalOntoL.g:3612:2: 'specializes'
            {
             before(grammarAccess.getHOClassAccess().getSpecializesKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalOntoL.g:3621:1: rule__HOClass__Group_5__1 : rule__HOClass__Group_5__1__Impl rule__HOClass__Group_5__2 ;
    public final void rule__HOClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3625:1: ( rule__HOClass__Group_5__1__Impl rule__HOClass__Group_5__2 )
            // InternalOntoL.g:3626:2: rule__HOClass__Group_5__1__Impl rule__HOClass__Group_5__2
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
    // InternalOntoL.g:3633:1: rule__HOClass__Group_5__1__Impl : ( ( rule__HOClass__SuperClassesAssignment_5_1 ) ) ;
    public final void rule__HOClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3637:1: ( ( ( rule__HOClass__SuperClassesAssignment_5_1 ) ) )
            // InternalOntoL.g:3638:1: ( ( rule__HOClass__SuperClassesAssignment_5_1 ) )
            {
            // InternalOntoL.g:3638:1: ( ( rule__HOClass__SuperClassesAssignment_5_1 ) )
            // InternalOntoL.g:3639:2: ( rule__HOClass__SuperClassesAssignment_5_1 )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesAssignment_5_1()); 
            // InternalOntoL.g:3640:2: ( rule__HOClass__SuperClassesAssignment_5_1 )
            // InternalOntoL.g:3640:3: rule__HOClass__SuperClassesAssignment_5_1
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
    // InternalOntoL.g:3648:1: rule__HOClass__Group_5__2 : rule__HOClass__Group_5__2__Impl ;
    public final void rule__HOClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3652:1: ( rule__HOClass__Group_5__2__Impl )
            // InternalOntoL.g:3653:2: rule__HOClass__Group_5__2__Impl
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
    // InternalOntoL.g:3659:1: rule__HOClass__Group_5__2__Impl : ( ( rule__HOClass__Group_5_2__0 )* ) ;
    public final void rule__HOClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3663:1: ( ( ( rule__HOClass__Group_5_2__0 )* ) )
            // InternalOntoL.g:3664:1: ( ( rule__HOClass__Group_5_2__0 )* )
            {
            // InternalOntoL.g:3664:1: ( ( rule__HOClass__Group_5_2__0 )* )
            // InternalOntoL.g:3665:2: ( rule__HOClass__Group_5_2__0 )*
            {
             before(grammarAccess.getHOClassAccess().getGroup_5_2()); 
            // InternalOntoL.g:3666:2: ( rule__HOClass__Group_5_2__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==28) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalOntoL.g:3666:3: rule__HOClass__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__HOClass__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalOntoL.g:3675:1: rule__HOClass__Group_5_2__0 : rule__HOClass__Group_5_2__0__Impl rule__HOClass__Group_5_2__1 ;
    public final void rule__HOClass__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3679:1: ( rule__HOClass__Group_5_2__0__Impl rule__HOClass__Group_5_2__1 )
            // InternalOntoL.g:3680:2: rule__HOClass__Group_5_2__0__Impl rule__HOClass__Group_5_2__1
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
    // InternalOntoL.g:3687:1: rule__HOClass__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__HOClass__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3691:1: ( ( ',' ) )
            // InternalOntoL.g:3692:1: ( ',' )
            {
            // InternalOntoL.g:3692:1: ( ',' )
            // InternalOntoL.g:3693:2: ','
            {
             before(grammarAccess.getHOClassAccess().getCommaKeyword_5_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoL.g:3702:1: rule__HOClass__Group_5_2__1 : rule__HOClass__Group_5_2__1__Impl ;
    public final void rule__HOClass__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3706:1: ( rule__HOClass__Group_5_2__1__Impl )
            // InternalOntoL.g:3707:2: rule__HOClass__Group_5_2__1__Impl
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
    // InternalOntoL.g:3713:1: rule__HOClass__Group_5_2__1__Impl : ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) ) ;
    public final void rule__HOClass__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3717:1: ( ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) ) )
            // InternalOntoL.g:3718:1: ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) )
            {
            // InternalOntoL.g:3718:1: ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) )
            // InternalOntoL.g:3719:2: ( rule__HOClass__SuperClassesAssignment_5_2_1 )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesAssignment_5_2_1()); 
            // InternalOntoL.g:3720:2: ( rule__HOClass__SuperClassesAssignment_5_2_1 )
            // InternalOntoL.g:3720:3: rule__HOClass__SuperClassesAssignment_5_2_1
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
    // InternalOntoL.g:3729:1: rule__HOClass__Group_6__0 : rule__HOClass__Group_6__0__Impl rule__HOClass__Group_6__1 ;
    public final void rule__HOClass__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3733:1: ( rule__HOClass__Group_6__0__Impl rule__HOClass__Group_6__1 )
            // InternalOntoL.g:3734:2: rule__HOClass__Group_6__0__Impl rule__HOClass__Group_6__1
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
    // InternalOntoL.g:3741:1: rule__HOClass__Group_6__0__Impl : ( 'subordinatedto' ) ;
    public final void rule__HOClass__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3745:1: ( ( 'subordinatedto' ) )
            // InternalOntoL.g:3746:1: ( 'subordinatedto' )
            {
            // InternalOntoL.g:3746:1: ( 'subordinatedto' )
            // InternalOntoL.g:3747:2: 'subordinatedto'
            {
             before(grammarAccess.getHOClassAccess().getSubordinatedtoKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getSubordinatedtoKeyword_6_0()); 

            }


            }

        }
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
    // InternalOntoL.g:3756:1: rule__HOClass__Group_6__1 : rule__HOClass__Group_6__1__Impl rule__HOClass__Group_6__2 ;
    public final void rule__HOClass__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3760:1: ( rule__HOClass__Group_6__1__Impl rule__HOClass__Group_6__2 )
            // InternalOntoL.g:3761:2: rule__HOClass__Group_6__1__Impl rule__HOClass__Group_6__2
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
    // InternalOntoL.g:3768:1: rule__HOClass__Group_6__1__Impl : ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) ) ;
    public final void rule__HOClass__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3772:1: ( ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) ) )
            // InternalOntoL.g:3773:1: ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) )
            {
            // InternalOntoL.g:3773:1: ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) )
            // InternalOntoL.g:3774:2: ( rule__HOClass__SubordinatorsAssignment_6_1 )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsAssignment_6_1()); 
            // InternalOntoL.g:3775:2: ( rule__HOClass__SubordinatorsAssignment_6_1 )
            // InternalOntoL.g:3775:3: rule__HOClass__SubordinatorsAssignment_6_1
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
    // InternalOntoL.g:3783:1: rule__HOClass__Group_6__2 : rule__HOClass__Group_6__2__Impl ;
    public final void rule__HOClass__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3787:1: ( rule__HOClass__Group_6__2__Impl )
            // InternalOntoL.g:3788:2: rule__HOClass__Group_6__2__Impl
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
    // InternalOntoL.g:3794:1: rule__HOClass__Group_6__2__Impl : ( ( rule__HOClass__Group_6_2__0 )* ) ;
    public final void rule__HOClass__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3798:1: ( ( ( rule__HOClass__Group_6_2__0 )* ) )
            // InternalOntoL.g:3799:1: ( ( rule__HOClass__Group_6_2__0 )* )
            {
            // InternalOntoL.g:3799:1: ( ( rule__HOClass__Group_6_2__0 )* )
            // InternalOntoL.g:3800:2: ( rule__HOClass__Group_6_2__0 )*
            {
             before(grammarAccess.getHOClassAccess().getGroup_6_2()); 
            // InternalOntoL.g:3801:2: ( rule__HOClass__Group_6_2__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==28) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalOntoL.g:3801:3: rule__HOClass__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__HOClass__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalOntoL.g:3810:1: rule__HOClass__Group_6_2__0 : rule__HOClass__Group_6_2__0__Impl rule__HOClass__Group_6_2__1 ;
    public final void rule__HOClass__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3814:1: ( rule__HOClass__Group_6_2__0__Impl rule__HOClass__Group_6_2__1 )
            // InternalOntoL.g:3815:2: rule__HOClass__Group_6_2__0__Impl rule__HOClass__Group_6_2__1
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
    // InternalOntoL.g:3822:1: rule__HOClass__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__HOClass__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3826:1: ( ( ',' ) )
            // InternalOntoL.g:3827:1: ( ',' )
            {
            // InternalOntoL.g:3827:1: ( ',' )
            // InternalOntoL.g:3828:2: ','
            {
             before(grammarAccess.getHOClassAccess().getCommaKeyword_6_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoL.g:3837:1: rule__HOClass__Group_6_2__1 : rule__HOClass__Group_6_2__1__Impl ;
    public final void rule__HOClass__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3841:1: ( rule__HOClass__Group_6_2__1__Impl )
            // InternalOntoL.g:3842:2: rule__HOClass__Group_6_2__1__Impl
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
    // InternalOntoL.g:3848:1: rule__HOClass__Group_6_2__1__Impl : ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) ) ;
    public final void rule__HOClass__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3852:1: ( ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) ) )
            // InternalOntoL.g:3853:1: ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) )
            {
            // InternalOntoL.g:3853:1: ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) )
            // InternalOntoL.g:3854:2: ( rule__HOClass__SubordinatorsAssignment_6_2_1 )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsAssignment_6_2_1()); 
            // InternalOntoL.g:3855:2: ( rule__HOClass__SubordinatorsAssignment_6_2_1 )
            // InternalOntoL.g:3855:3: rule__HOClass__SubordinatorsAssignment_6_2_1
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
    // InternalOntoL.g:3864:1: rule__HOClass__Group_7_0__0 : rule__HOClass__Group_7_0__0__Impl rule__HOClass__Group_7_0__1 ;
    public final void rule__HOClass__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3868:1: ( rule__HOClass__Group_7_0__0__Impl rule__HOClass__Group_7_0__1 )
            // InternalOntoL.g:3869:2: rule__HOClass__Group_7_0__0__Impl rule__HOClass__Group_7_0__1
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
    // InternalOntoL.g:3876:1: rule__HOClass__Group_7_0__0__Impl : ( ( rule__HOClass__CategorizationTypeAssignment_7_0_0 ) ) ;
    public final void rule__HOClass__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3880:1: ( ( ( rule__HOClass__CategorizationTypeAssignment_7_0_0 ) ) )
            // InternalOntoL.g:3881:1: ( ( rule__HOClass__CategorizationTypeAssignment_7_0_0 ) )
            {
            // InternalOntoL.g:3881:1: ( ( rule__HOClass__CategorizationTypeAssignment_7_0_0 ) )
            // InternalOntoL.g:3882:2: ( rule__HOClass__CategorizationTypeAssignment_7_0_0 )
            {
             before(grammarAccess.getHOClassAccess().getCategorizationTypeAssignment_7_0_0()); 
            // InternalOntoL.g:3883:2: ( rule__HOClass__CategorizationTypeAssignment_7_0_0 )
            // InternalOntoL.g:3883:3: rule__HOClass__CategorizationTypeAssignment_7_0_0
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
    // InternalOntoL.g:3891:1: rule__HOClass__Group_7_0__1 : rule__HOClass__Group_7_0__1__Impl ;
    public final void rule__HOClass__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3895:1: ( rule__HOClass__Group_7_0__1__Impl )
            // InternalOntoL.g:3896:2: rule__HOClass__Group_7_0__1__Impl
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
    // InternalOntoL.g:3902:1: rule__HOClass__Group_7_0__1__Impl : ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) ) ;
    public final void rule__HOClass__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3906:1: ( ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) ) )
            // InternalOntoL.g:3907:1: ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) )
            {
            // InternalOntoL.g:3907:1: ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) )
            // InternalOntoL.g:3908:2: ( rule__HOClass__BasetypeAssignment_7_0_1 )
            {
             before(grammarAccess.getHOClassAccess().getBasetypeAssignment_7_0_1()); 
            // InternalOntoL.g:3909:2: ( rule__HOClass__BasetypeAssignment_7_0_1 )
            // InternalOntoL.g:3909:3: rule__HOClass__BasetypeAssignment_7_0_1
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
    // InternalOntoL.g:3918:1: rule__HOClass__Group_7_1__0 : rule__HOClass__Group_7_1__0__Impl rule__HOClass__Group_7_1__1 ;
    public final void rule__HOClass__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3922:1: ( rule__HOClass__Group_7_1__0__Impl rule__HOClass__Group_7_1__1 )
            // InternalOntoL.g:3923:2: rule__HOClass__Group_7_1__0__Impl rule__HOClass__Group_7_1__1
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
    // InternalOntoL.g:3930:1: rule__HOClass__Group_7_1__0__Impl : ( 'ispowertypeof' ) ;
    public final void rule__HOClass__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3934:1: ( ( 'ispowertypeof' ) )
            // InternalOntoL.g:3935:1: ( 'ispowertypeof' )
            {
            // InternalOntoL.g:3935:1: ( 'ispowertypeof' )
            // InternalOntoL.g:3936:2: 'ispowertypeof'
            {
             before(grammarAccess.getHOClassAccess().getIspowertypeofKeyword_7_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getIspowertypeofKeyword_7_1_0()); 

            }


            }

        }
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
    // InternalOntoL.g:3945:1: rule__HOClass__Group_7_1__1 : rule__HOClass__Group_7_1__1__Impl ;
    public final void rule__HOClass__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3949:1: ( rule__HOClass__Group_7_1__1__Impl )
            // InternalOntoL.g:3950:2: rule__HOClass__Group_7_1__1__Impl
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
    // InternalOntoL.g:3956:1: rule__HOClass__Group_7_1__1__Impl : ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) ) ;
    public final void rule__HOClass__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3960:1: ( ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) ) )
            // InternalOntoL.g:3961:1: ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) )
            {
            // InternalOntoL.g:3961:1: ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) )
            // InternalOntoL.g:3962:2: ( rule__HOClass__PowertypeOfAssignment_7_1_1 )
            {
             before(grammarAccess.getHOClassAccess().getPowertypeOfAssignment_7_1_1()); 
            // InternalOntoL.g:3963:2: ( rule__HOClass__PowertypeOfAssignment_7_1_1 )
            // InternalOntoL.g:3963:3: rule__HOClass__PowertypeOfAssignment_7_1_1
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
    // InternalOntoL.g:3972:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3976:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalOntoL.g:3977:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalOntoL.g:3984:1: rule__Attribute__Group__0__Impl : ( 'att' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3988:1: ( ( 'att' ) )
            // InternalOntoL.g:3989:1: ( 'att' )
            {
            // InternalOntoL.g:3989:1: ( 'att' )
            // InternalOntoL.g:3990:2: 'att'
            {
             before(grammarAccess.getAttributeAccess().getAttKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalOntoL.g:3999:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4003:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalOntoL.g:4004:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalOntoL.g:4011:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4015:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalOntoL.g:4016:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalOntoL.g:4016:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalOntoL.g:4017:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalOntoL.g:4018:2: ( rule__Attribute__NameAssignment_1 )
            // InternalOntoL.g:4018:3: rule__Attribute__NameAssignment_1
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
    // InternalOntoL.g:4026:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4030:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalOntoL.g:4031:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalOntoL.g:4038:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4042:1: ( ( ':' ) )
            // InternalOntoL.g:4043:1: ( ':' )
            {
            // InternalOntoL.g:4043:1: ( ':' )
            // InternalOntoL.g:4044:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoL.g:4053:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4057:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalOntoL.g:4058:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalOntoL.g:4065:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__Group_3__0 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4069:1: ( ( ( rule__Attribute__Group_3__0 )? ) )
            // InternalOntoL.g:4070:1: ( ( rule__Attribute__Group_3__0 )? )
            {
            // InternalOntoL.g:4070:1: ( ( rule__Attribute__Group_3__0 )? )
            // InternalOntoL.g:4071:2: ( rule__Attribute__Group_3__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_3()); 
            // InternalOntoL.g:4072:2: ( rule__Attribute__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==37) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalOntoL.g:4072:3: rule__Attribute__Group_3__0
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
    // InternalOntoL.g:4080:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4084:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalOntoL.g:4085:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalOntoL.g:4092:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__PropertyClassAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4096:1: ( ( ( rule__Attribute__PropertyClassAssignment_4 ) ) )
            // InternalOntoL.g:4097:1: ( ( rule__Attribute__PropertyClassAssignment_4 ) )
            {
            // InternalOntoL.g:4097:1: ( ( rule__Attribute__PropertyClassAssignment_4 ) )
            // InternalOntoL.g:4098:2: ( rule__Attribute__PropertyClassAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getPropertyClassAssignment_4()); 
            // InternalOntoL.g:4099:2: ( rule__Attribute__PropertyClassAssignment_4 )
            // InternalOntoL.g:4099:3: rule__Attribute__PropertyClassAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__PropertyClassAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getPropertyClassAssignment_4()); 

            }


            }

        }
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
    // InternalOntoL.g:4107:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4111:1: ( rule__Attribute__Group__5__Impl )
            // InternalOntoL.g:4112:2: rule__Attribute__Group__5__Impl
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
    // InternalOntoL.g:4118:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4122:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalOntoL.g:4123:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalOntoL.g:4123:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalOntoL.g:4124:2: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // InternalOntoL.g:4125:2: ( rule__Attribute__Group_5__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==40) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalOntoL.g:4125:3: rule__Attribute__Group_5__0
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
    // InternalOntoL.g:4134:1: rule__Attribute__Group_3__0 : rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 ;
    public final void rule__Attribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4138:1: ( rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 )
            // InternalOntoL.g:4139:2: rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalOntoL.g:4146:1: rule__Attribute__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4150:1: ( ( '[' ) )
            // InternalOntoL.g:4151:1: ( '[' )
            {
            // InternalOntoL.g:4151:1: ( '[' )
            // InternalOntoL.g:4152:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalOntoL.g:4161:1: rule__Attribute__Group_3__1 : rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2 ;
    public final void rule__Attribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4165:1: ( rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2 )
            // InternalOntoL.g:4166:2: rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalOntoL.g:4173:1: rule__Attribute__Group_3__1__Impl : ( ( rule__Attribute__LowerBoundAssignment_3_1 ) ) ;
    public final void rule__Attribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4177:1: ( ( ( rule__Attribute__LowerBoundAssignment_3_1 ) ) )
            // InternalOntoL.g:4178:1: ( ( rule__Attribute__LowerBoundAssignment_3_1 ) )
            {
            // InternalOntoL.g:4178:1: ( ( rule__Attribute__LowerBoundAssignment_3_1 ) )
            // InternalOntoL.g:4179:2: ( rule__Attribute__LowerBoundAssignment_3_1 )
            {
             before(grammarAccess.getAttributeAccess().getLowerBoundAssignment_3_1()); 
            // InternalOntoL.g:4180:2: ( rule__Attribute__LowerBoundAssignment_3_1 )
            // InternalOntoL.g:4180:3: rule__Attribute__LowerBoundAssignment_3_1
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
    // InternalOntoL.g:4188:1: rule__Attribute__Group_3__2 : rule__Attribute__Group_3__2__Impl rule__Attribute__Group_3__3 ;
    public final void rule__Attribute__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4192:1: ( rule__Attribute__Group_3__2__Impl rule__Attribute__Group_3__3 )
            // InternalOntoL.g:4193:2: rule__Attribute__Group_3__2__Impl rule__Attribute__Group_3__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalOntoL.g:4200:1: rule__Attribute__Group_3__2__Impl : ( '..' ) ;
    public final void rule__Attribute__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4204:1: ( ( '..' ) )
            // InternalOntoL.g:4205:1: ( '..' )
            {
            // InternalOntoL.g:4205:1: ( '..' )
            // InternalOntoL.g:4206:2: '..'
            {
             before(grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_3_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalOntoL.g:4215:1: rule__Attribute__Group_3__3 : rule__Attribute__Group_3__3__Impl rule__Attribute__Group_3__4 ;
    public final void rule__Attribute__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4219:1: ( rule__Attribute__Group_3__3__Impl rule__Attribute__Group_3__4 )
            // InternalOntoL.g:4220:2: rule__Attribute__Group_3__3__Impl rule__Attribute__Group_3__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalOntoL.g:4227:1: rule__Attribute__Group_3__3__Impl : ( ( rule__Attribute__UpperBoundAssignment_3_3 ) ) ;
    public final void rule__Attribute__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4231:1: ( ( ( rule__Attribute__UpperBoundAssignment_3_3 ) ) )
            // InternalOntoL.g:4232:1: ( ( rule__Attribute__UpperBoundAssignment_3_3 ) )
            {
            // InternalOntoL.g:4232:1: ( ( rule__Attribute__UpperBoundAssignment_3_3 ) )
            // InternalOntoL.g:4233:2: ( rule__Attribute__UpperBoundAssignment_3_3 )
            {
             before(grammarAccess.getAttributeAccess().getUpperBoundAssignment_3_3()); 
            // InternalOntoL.g:4234:2: ( rule__Attribute__UpperBoundAssignment_3_3 )
            // InternalOntoL.g:4234:3: rule__Attribute__UpperBoundAssignment_3_3
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
    // InternalOntoL.g:4242:1: rule__Attribute__Group_3__4 : rule__Attribute__Group_3__4__Impl ;
    public final void rule__Attribute__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4246:1: ( rule__Attribute__Group_3__4__Impl )
            // InternalOntoL.g:4247:2: rule__Attribute__Group_3__4__Impl
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
    // InternalOntoL.g:4253:1: rule__Attribute__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4257:1: ( ( ']' ) )
            // InternalOntoL.g:4258:1: ( ']' )
            {
            // InternalOntoL.g:4258:1: ( ']' )
            // InternalOntoL.g:4259:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalOntoL.g:4269:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4273:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalOntoL.g:4274:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
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
    // InternalOntoL.g:4281:1: rule__Attribute__Group_5__0__Impl : ( 'subsets' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4285:1: ( ( 'subsets' ) )
            // InternalOntoL.g:4286:1: ( 'subsets' )
            {
            // InternalOntoL.g:4286:1: ( 'subsets' )
            // InternalOntoL.g:4287:2: 'subsets'
            {
             before(grammarAccess.getAttributeAccess().getSubsetsKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalOntoL.g:4296:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4300:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // InternalOntoL.g:4301:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
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
    // InternalOntoL.g:4308:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__SubsetOfAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4312:1: ( ( ( rule__Attribute__SubsetOfAssignment_5_1 ) ) )
            // InternalOntoL.g:4313:1: ( ( rule__Attribute__SubsetOfAssignment_5_1 ) )
            {
            // InternalOntoL.g:4313:1: ( ( rule__Attribute__SubsetOfAssignment_5_1 ) )
            // InternalOntoL.g:4314:2: ( rule__Attribute__SubsetOfAssignment_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAssignment_5_1()); 
            // InternalOntoL.g:4315:2: ( rule__Attribute__SubsetOfAssignment_5_1 )
            // InternalOntoL.g:4315:3: rule__Attribute__SubsetOfAssignment_5_1
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
    // InternalOntoL.g:4323:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4327:1: ( rule__Attribute__Group_5__2__Impl )
            // InternalOntoL.g:4328:2: rule__Attribute__Group_5__2__Impl
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
    // InternalOntoL.g:4334:1: rule__Attribute__Group_5__2__Impl : ( ( rule__Attribute__Group_5_2__0 )* ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4338:1: ( ( ( rule__Attribute__Group_5_2__0 )* ) )
            // InternalOntoL.g:4339:1: ( ( rule__Attribute__Group_5_2__0 )* )
            {
            // InternalOntoL.g:4339:1: ( ( rule__Attribute__Group_5_2__0 )* )
            // InternalOntoL.g:4340:2: ( rule__Attribute__Group_5_2__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_5_2()); 
            // InternalOntoL.g:4341:2: ( rule__Attribute__Group_5_2__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==28) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalOntoL.g:4341:3: rule__Attribute__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Attribute__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalOntoL.g:4350:1: rule__Attribute__Group_5_2__0 : rule__Attribute__Group_5_2__0__Impl rule__Attribute__Group_5_2__1 ;
    public final void rule__Attribute__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4354:1: ( rule__Attribute__Group_5_2__0__Impl rule__Attribute__Group_5_2__1 )
            // InternalOntoL.g:4355:2: rule__Attribute__Group_5_2__0__Impl rule__Attribute__Group_5_2__1
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
    // InternalOntoL.g:4362:1: rule__Attribute__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4366:1: ( ( ',' ) )
            // InternalOntoL.g:4367:1: ( ',' )
            {
            // InternalOntoL.g:4367:1: ( ',' )
            // InternalOntoL.g:4368:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_5_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoL.g:4377:1: rule__Attribute__Group_5_2__1 : rule__Attribute__Group_5_2__1__Impl ;
    public final void rule__Attribute__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4381:1: ( rule__Attribute__Group_5_2__1__Impl )
            // InternalOntoL.g:4382:2: rule__Attribute__Group_5_2__1__Impl
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
    // InternalOntoL.g:4388:1: rule__Attribute__Group_5_2__1__Impl : ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) ) ;
    public final void rule__Attribute__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4392:1: ( ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) ) )
            // InternalOntoL.g:4393:1: ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) )
            {
            // InternalOntoL.g:4393:1: ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) )
            // InternalOntoL.g:4394:2: ( rule__Attribute__SubsetOfAssignment_5_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAssignment_5_2_1()); 
            // InternalOntoL.g:4395:2: ( rule__Attribute__SubsetOfAssignment_5_2_1 )
            // InternalOntoL.g:4395:3: rule__Attribute__SubsetOfAssignment_5_2_1
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


    // $ANTLR start "rule__Reference__Group__0"
    // InternalOntoL.g:4404:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4408:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalOntoL.g:4409:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
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
    // InternalOntoL.g:4416:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4420:1: ( ( 'ref' ) )
            // InternalOntoL.g:4421:1: ( 'ref' )
            {
            // InternalOntoL.g:4421:1: ( 'ref' )
            // InternalOntoL.g:4422:2: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalOntoL.g:4431:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4435:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalOntoL.g:4436:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalOntoL.g:4443:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4447:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // InternalOntoL.g:4448:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // InternalOntoL.g:4448:1: ( ( rule__Reference__NameAssignment_1 ) )
            // InternalOntoL.g:4449:2: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // InternalOntoL.g:4450:2: ( rule__Reference__NameAssignment_1 )
            // InternalOntoL.g:4450:3: rule__Reference__NameAssignment_1
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
    // InternalOntoL.g:4458:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4462:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalOntoL.g:4463:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalOntoL.g:4470:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4474:1: ( ( ':' ) )
            // InternalOntoL.g:4475:1: ( ':' )
            {
            // InternalOntoL.g:4475:1: ( ':' )
            // InternalOntoL.g:4476:2: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoL.g:4485:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4489:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // InternalOntoL.g:4490:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalOntoL.g:4497:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__Group_3__0 )? ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4501:1: ( ( ( rule__Reference__Group_3__0 )? ) )
            // InternalOntoL.g:4502:1: ( ( rule__Reference__Group_3__0 )? )
            {
            // InternalOntoL.g:4502:1: ( ( rule__Reference__Group_3__0 )? )
            // InternalOntoL.g:4503:2: ( rule__Reference__Group_3__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_3()); 
            // InternalOntoL.g:4504:2: ( rule__Reference__Group_3__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==37) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOntoL.g:4504:3: rule__Reference__Group_3__0
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
    // InternalOntoL.g:4512:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4516:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // InternalOntoL.g:4517:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalOntoL.g:4524:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__PropertyClassAssignment_4 ) ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4528:1: ( ( ( rule__Reference__PropertyClassAssignment_4 ) ) )
            // InternalOntoL.g:4529:1: ( ( rule__Reference__PropertyClassAssignment_4 ) )
            {
            // InternalOntoL.g:4529:1: ( ( rule__Reference__PropertyClassAssignment_4 ) )
            // InternalOntoL.g:4530:2: ( rule__Reference__PropertyClassAssignment_4 )
            {
             before(grammarAccess.getReferenceAccess().getPropertyClassAssignment_4()); 
            // InternalOntoL.g:4531:2: ( rule__Reference__PropertyClassAssignment_4 )
            // InternalOntoL.g:4531:3: rule__Reference__PropertyClassAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Reference__PropertyClassAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getPropertyClassAssignment_4()); 

            }


            }

        }
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
    // InternalOntoL.g:4539:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl rule__Reference__Group__6 ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4543:1: ( rule__Reference__Group__5__Impl rule__Reference__Group__6 )
            // InternalOntoL.g:4544:2: rule__Reference__Group__5__Impl rule__Reference__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalOntoL.g:4551:1: rule__Reference__Group__5__Impl : ( ( rule__Reference__Group_5__0 )? ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4555:1: ( ( ( rule__Reference__Group_5__0 )? ) )
            // InternalOntoL.g:4556:1: ( ( rule__Reference__Group_5__0 )? )
            {
            // InternalOntoL.g:4556:1: ( ( rule__Reference__Group_5__0 )? )
            // InternalOntoL.g:4557:2: ( rule__Reference__Group_5__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_5()); 
            // InternalOntoL.g:4558:2: ( rule__Reference__Group_5__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==40) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalOntoL.g:4558:3: rule__Reference__Group_5__0
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
    // InternalOntoL.g:4566:1: rule__Reference__Group__6 : rule__Reference__Group__6__Impl ;
    public final void rule__Reference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4570:1: ( rule__Reference__Group__6__Impl )
            // InternalOntoL.g:4571:2: rule__Reference__Group__6__Impl
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
    // InternalOntoL.g:4577:1: rule__Reference__Group__6__Impl : ( ( rule__Reference__Group_6__0 )? ) ;
    public final void rule__Reference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4581:1: ( ( ( rule__Reference__Group_6__0 )? ) )
            // InternalOntoL.g:4582:1: ( ( rule__Reference__Group_6__0 )? )
            {
            // InternalOntoL.g:4582:1: ( ( rule__Reference__Group_6__0 )? )
            // InternalOntoL.g:4583:2: ( rule__Reference__Group_6__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_6()); 
            // InternalOntoL.g:4584:2: ( rule__Reference__Group_6__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==42) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOntoL.g:4584:3: rule__Reference__Group_6__0
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
    // InternalOntoL.g:4593:1: rule__Reference__Group_3__0 : rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1 ;
    public final void rule__Reference__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4597:1: ( rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1 )
            // InternalOntoL.g:4598:2: rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalOntoL.g:4605:1: rule__Reference__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Reference__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4609:1: ( ( '[' ) )
            // InternalOntoL.g:4610:1: ( '[' )
            {
            // InternalOntoL.g:4610:1: ( '[' )
            // InternalOntoL.g:4611:2: '['
            {
             before(grammarAccess.getReferenceAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalOntoL.g:4620:1: rule__Reference__Group_3__1 : rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2 ;
    public final void rule__Reference__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4624:1: ( rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2 )
            // InternalOntoL.g:4625:2: rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalOntoL.g:4632:1: rule__Reference__Group_3__1__Impl : ( ( rule__Reference__LowerBoundAssignment_3_1 ) ) ;
    public final void rule__Reference__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4636:1: ( ( ( rule__Reference__LowerBoundAssignment_3_1 ) ) )
            // InternalOntoL.g:4637:1: ( ( rule__Reference__LowerBoundAssignment_3_1 ) )
            {
            // InternalOntoL.g:4637:1: ( ( rule__Reference__LowerBoundAssignment_3_1 ) )
            // InternalOntoL.g:4638:2: ( rule__Reference__LowerBoundAssignment_3_1 )
            {
             before(grammarAccess.getReferenceAccess().getLowerBoundAssignment_3_1()); 
            // InternalOntoL.g:4639:2: ( rule__Reference__LowerBoundAssignment_3_1 )
            // InternalOntoL.g:4639:3: rule__Reference__LowerBoundAssignment_3_1
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
    // InternalOntoL.g:4647:1: rule__Reference__Group_3__2 : rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3 ;
    public final void rule__Reference__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4651:1: ( rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3 )
            // InternalOntoL.g:4652:2: rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalOntoL.g:4659:1: rule__Reference__Group_3__2__Impl : ( '..' ) ;
    public final void rule__Reference__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4663:1: ( ( '..' ) )
            // InternalOntoL.g:4664:1: ( '..' )
            {
            // InternalOntoL.g:4664:1: ( '..' )
            // InternalOntoL.g:4665:2: '..'
            {
             before(grammarAccess.getReferenceAccess().getFullStopFullStopKeyword_3_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalOntoL.g:4674:1: rule__Reference__Group_3__3 : rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4 ;
    public final void rule__Reference__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4678:1: ( rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4 )
            // InternalOntoL.g:4679:2: rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalOntoL.g:4686:1: rule__Reference__Group_3__3__Impl : ( ( rule__Reference__UpperBoundAssignment_3_3 ) ) ;
    public final void rule__Reference__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4690:1: ( ( ( rule__Reference__UpperBoundAssignment_3_3 ) ) )
            // InternalOntoL.g:4691:1: ( ( rule__Reference__UpperBoundAssignment_3_3 ) )
            {
            // InternalOntoL.g:4691:1: ( ( rule__Reference__UpperBoundAssignment_3_3 ) )
            // InternalOntoL.g:4692:2: ( rule__Reference__UpperBoundAssignment_3_3 )
            {
             before(grammarAccess.getReferenceAccess().getUpperBoundAssignment_3_3()); 
            // InternalOntoL.g:4693:2: ( rule__Reference__UpperBoundAssignment_3_3 )
            // InternalOntoL.g:4693:3: rule__Reference__UpperBoundAssignment_3_3
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
    // InternalOntoL.g:4701:1: rule__Reference__Group_3__4 : rule__Reference__Group_3__4__Impl ;
    public final void rule__Reference__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4705:1: ( rule__Reference__Group_3__4__Impl )
            // InternalOntoL.g:4706:2: rule__Reference__Group_3__4__Impl
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
    // InternalOntoL.g:4712:1: rule__Reference__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Reference__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4716:1: ( ( ']' ) )
            // InternalOntoL.g:4717:1: ( ']' )
            {
            // InternalOntoL.g:4717:1: ( ']' )
            // InternalOntoL.g:4718:2: ']'
            {
             before(grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalOntoL.g:4728:1: rule__Reference__Group_5__0 : rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 ;
    public final void rule__Reference__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4732:1: ( rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 )
            // InternalOntoL.g:4733:2: rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1
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
    // InternalOntoL.g:4740:1: rule__Reference__Group_5__0__Impl : ( 'subsets' ) ;
    public final void rule__Reference__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4744:1: ( ( 'subsets' ) )
            // InternalOntoL.g:4745:1: ( 'subsets' )
            {
            // InternalOntoL.g:4745:1: ( 'subsets' )
            // InternalOntoL.g:4746:2: 'subsets'
            {
             before(grammarAccess.getReferenceAccess().getSubsetsKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalOntoL.g:4755:1: rule__Reference__Group_5__1 : rule__Reference__Group_5__1__Impl rule__Reference__Group_5__2 ;
    public final void rule__Reference__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4759:1: ( rule__Reference__Group_5__1__Impl rule__Reference__Group_5__2 )
            // InternalOntoL.g:4760:2: rule__Reference__Group_5__1__Impl rule__Reference__Group_5__2
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
    // InternalOntoL.g:4767:1: rule__Reference__Group_5__1__Impl : ( ( rule__Reference__SubsetOfAssignment_5_1 ) ) ;
    public final void rule__Reference__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4771:1: ( ( ( rule__Reference__SubsetOfAssignment_5_1 ) ) )
            // InternalOntoL.g:4772:1: ( ( rule__Reference__SubsetOfAssignment_5_1 ) )
            {
            // InternalOntoL.g:4772:1: ( ( rule__Reference__SubsetOfAssignment_5_1 ) )
            // InternalOntoL.g:4773:2: ( rule__Reference__SubsetOfAssignment_5_1 )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfAssignment_5_1()); 
            // InternalOntoL.g:4774:2: ( rule__Reference__SubsetOfAssignment_5_1 )
            // InternalOntoL.g:4774:3: rule__Reference__SubsetOfAssignment_5_1
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
    // InternalOntoL.g:4782:1: rule__Reference__Group_5__2 : rule__Reference__Group_5__2__Impl ;
    public final void rule__Reference__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4786:1: ( rule__Reference__Group_5__2__Impl )
            // InternalOntoL.g:4787:2: rule__Reference__Group_5__2__Impl
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
    // InternalOntoL.g:4793:1: rule__Reference__Group_5__2__Impl : ( ( rule__Reference__Group_5_2__0 )* ) ;
    public final void rule__Reference__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4797:1: ( ( ( rule__Reference__Group_5_2__0 )* ) )
            // InternalOntoL.g:4798:1: ( ( rule__Reference__Group_5_2__0 )* )
            {
            // InternalOntoL.g:4798:1: ( ( rule__Reference__Group_5_2__0 )* )
            // InternalOntoL.g:4799:2: ( rule__Reference__Group_5_2__0 )*
            {
             before(grammarAccess.getReferenceAccess().getGroup_5_2()); 
            // InternalOntoL.g:4800:2: ( rule__Reference__Group_5_2__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==28) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalOntoL.g:4800:3: rule__Reference__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Reference__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalOntoL.g:4809:1: rule__Reference__Group_5_2__0 : rule__Reference__Group_5_2__0__Impl rule__Reference__Group_5_2__1 ;
    public final void rule__Reference__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4813:1: ( rule__Reference__Group_5_2__0__Impl rule__Reference__Group_5_2__1 )
            // InternalOntoL.g:4814:2: rule__Reference__Group_5_2__0__Impl rule__Reference__Group_5_2__1
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
    // InternalOntoL.g:4821:1: rule__Reference__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Reference__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4825:1: ( ( ',' ) )
            // InternalOntoL.g:4826:1: ( ',' )
            {
            // InternalOntoL.g:4826:1: ( ',' )
            // InternalOntoL.g:4827:2: ','
            {
             before(grammarAccess.getReferenceAccess().getCommaKeyword_5_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoL.g:4836:1: rule__Reference__Group_5_2__1 : rule__Reference__Group_5_2__1__Impl ;
    public final void rule__Reference__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4840:1: ( rule__Reference__Group_5_2__1__Impl )
            // InternalOntoL.g:4841:2: rule__Reference__Group_5_2__1__Impl
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
    // InternalOntoL.g:4847:1: rule__Reference__Group_5_2__1__Impl : ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) ) ;
    public final void rule__Reference__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4851:1: ( ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) ) )
            // InternalOntoL.g:4852:1: ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) )
            {
            // InternalOntoL.g:4852:1: ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) )
            // InternalOntoL.g:4853:2: ( rule__Reference__SubsetOfAssignment_5_2_1 )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfAssignment_5_2_1()); 
            // InternalOntoL.g:4854:2: ( rule__Reference__SubsetOfAssignment_5_2_1 )
            // InternalOntoL.g:4854:3: rule__Reference__SubsetOfAssignment_5_2_1
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
    // InternalOntoL.g:4863:1: rule__Reference__Group_6__0 : rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1 ;
    public final void rule__Reference__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4867:1: ( rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1 )
            // InternalOntoL.g:4868:2: rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1
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
    // InternalOntoL.g:4875:1: rule__Reference__Group_6__0__Impl : ( 'isoppositeto' ) ;
    public final void rule__Reference__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4879:1: ( ( 'isoppositeto' ) )
            // InternalOntoL.g:4880:1: ( 'isoppositeto' )
            {
            // InternalOntoL.g:4880:1: ( 'isoppositeto' )
            // InternalOntoL.g:4881:2: 'isoppositeto'
            {
             before(grammarAccess.getReferenceAccess().getIsoppositetoKeyword_6_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getIsoppositetoKeyword_6_0()); 

            }


            }

        }
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
    // InternalOntoL.g:4890:1: rule__Reference__Group_6__1 : rule__Reference__Group_6__1__Impl ;
    public final void rule__Reference__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4894:1: ( rule__Reference__Group_6__1__Impl )
            // InternalOntoL.g:4895:2: rule__Reference__Group_6__1__Impl
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
    // InternalOntoL.g:4901:1: rule__Reference__Group_6__1__Impl : ( ( rule__Reference__OppositeToAssignment_6_1 ) ) ;
    public final void rule__Reference__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4905:1: ( ( ( rule__Reference__OppositeToAssignment_6_1 ) ) )
            // InternalOntoL.g:4906:1: ( ( rule__Reference__OppositeToAssignment_6_1 ) )
            {
            // InternalOntoL.g:4906:1: ( ( rule__Reference__OppositeToAssignment_6_1 ) )
            // InternalOntoL.g:4907:2: ( rule__Reference__OppositeToAssignment_6_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeToAssignment_6_1()); 
            // InternalOntoL.g:4908:2: ( rule__Reference__OppositeToAssignment_6_1 )
            // InternalOntoL.g:4908:3: rule__Reference__OppositeToAssignment_6_1
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


    // $ANTLR start "rule__AttributeAssignment__Group__0"
    // InternalOntoL.g:4917:1: rule__AttributeAssignment__Group__0 : rule__AttributeAssignment__Group__0__Impl rule__AttributeAssignment__Group__1 ;
    public final void rule__AttributeAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4921:1: ( rule__AttributeAssignment__Group__0__Impl rule__AttributeAssignment__Group__1 )
            // InternalOntoL.g:4922:2: rule__AttributeAssignment__Group__0__Impl rule__AttributeAssignment__Group__1
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
    // InternalOntoL.g:4929:1: rule__AttributeAssignment__Group__0__Impl : ( 'att' ) ;
    public final void rule__AttributeAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4933:1: ( ( 'att' ) )
            // InternalOntoL.g:4934:1: ( 'att' )
            {
            // InternalOntoL.g:4934:1: ( 'att' )
            // InternalOntoL.g:4935:2: 'att'
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAttKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalOntoL.g:4944:1: rule__AttributeAssignment__Group__1 : rule__AttributeAssignment__Group__1__Impl rule__AttributeAssignment__Group__2 ;
    public final void rule__AttributeAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4948:1: ( rule__AttributeAssignment__Group__1__Impl rule__AttributeAssignment__Group__2 )
            // InternalOntoL.g:4949:2: rule__AttributeAssignment__Group__1__Impl rule__AttributeAssignment__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalOntoL.g:4956:1: rule__AttributeAssignment__Group__1__Impl : ( ( rule__AttributeAssignment__AttributeAssignment_1 ) ) ;
    public final void rule__AttributeAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4960:1: ( ( ( rule__AttributeAssignment__AttributeAssignment_1 ) ) )
            // InternalOntoL.g:4961:1: ( ( rule__AttributeAssignment__AttributeAssignment_1 ) )
            {
            // InternalOntoL.g:4961:1: ( ( rule__AttributeAssignment__AttributeAssignment_1 ) )
            // InternalOntoL.g:4962:2: ( rule__AttributeAssignment__AttributeAssignment_1 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAttributeAssignment_1()); 
            // InternalOntoL.g:4963:2: ( rule__AttributeAssignment__AttributeAssignment_1 )
            // InternalOntoL.g:4963:3: rule__AttributeAssignment__AttributeAssignment_1
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
    // InternalOntoL.g:4971:1: rule__AttributeAssignment__Group__2 : rule__AttributeAssignment__Group__2__Impl rule__AttributeAssignment__Group__3 ;
    public final void rule__AttributeAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4975:1: ( rule__AttributeAssignment__Group__2__Impl rule__AttributeAssignment__Group__3 )
            // InternalOntoL.g:4976:2: rule__AttributeAssignment__Group__2__Impl rule__AttributeAssignment__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalOntoL.g:4983:1: rule__AttributeAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__AttributeAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4987:1: ( ( '=' ) )
            // InternalOntoL.g:4988:1: ( '=' )
            {
            // InternalOntoL.g:4988:1: ( '=' )
            // InternalOntoL.g:4989:2: '='
            {
             before(grammarAccess.getAttributeAssignmentAccess().getEqualsSignKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalOntoL.g:4998:1: rule__AttributeAssignment__Group__3 : rule__AttributeAssignment__Group__3__Impl ;
    public final void rule__AttributeAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5002:1: ( rule__AttributeAssignment__Group__3__Impl )
            // InternalOntoL.g:5003:2: rule__AttributeAssignment__Group__3__Impl
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
    // InternalOntoL.g:5009:1: rule__AttributeAssignment__Group__3__Impl : ( ( rule__AttributeAssignment__Alternatives_3 ) ) ;
    public final void rule__AttributeAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5013:1: ( ( ( rule__AttributeAssignment__Alternatives_3 ) ) )
            // InternalOntoL.g:5014:1: ( ( rule__AttributeAssignment__Alternatives_3 ) )
            {
            // InternalOntoL.g:5014:1: ( ( rule__AttributeAssignment__Alternatives_3 ) )
            // InternalOntoL.g:5015:2: ( rule__AttributeAssignment__Alternatives_3 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAlternatives_3()); 
            // InternalOntoL.g:5016:2: ( rule__AttributeAssignment__Alternatives_3 )
            // InternalOntoL.g:5016:3: rule__AttributeAssignment__Alternatives_3
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
    // InternalOntoL.g:5025:1: rule__AttributeAssignment__Group_3_1__0 : rule__AttributeAssignment__Group_3_1__0__Impl rule__AttributeAssignment__Group_3_1__1 ;
    public final void rule__AttributeAssignment__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5029:1: ( rule__AttributeAssignment__Group_3_1__0__Impl rule__AttributeAssignment__Group_3_1__1 )
            // InternalOntoL.g:5030:2: rule__AttributeAssignment__Group_3_1__0__Impl rule__AttributeAssignment__Group_3_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalOntoL.g:5037:1: rule__AttributeAssignment__Group_3_1__0__Impl : ( '{' ) ;
    public final void rule__AttributeAssignment__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5041:1: ( ( '{' ) )
            // InternalOntoL.g:5042:1: ( '{' )
            {
            // InternalOntoL.g:5042:1: ( '{' )
            // InternalOntoL.g:5043:2: '{'
            {
             before(grammarAccess.getAttributeAssignmentAccess().getLeftCurlyBracketKeyword_3_1_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalOntoL.g:5052:1: rule__AttributeAssignment__Group_3_1__1 : rule__AttributeAssignment__Group_3_1__1__Impl rule__AttributeAssignment__Group_3_1__2 ;
    public final void rule__AttributeAssignment__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5056:1: ( rule__AttributeAssignment__Group_3_1__1__Impl rule__AttributeAssignment__Group_3_1__2 )
            // InternalOntoL.g:5057:2: rule__AttributeAssignment__Group_3_1__1__Impl rule__AttributeAssignment__Group_3_1__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalOntoL.g:5064:1: rule__AttributeAssignment__Group_3_1__1__Impl : ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 ) ) ;
    public final void rule__AttributeAssignment__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5068:1: ( ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 ) ) )
            // InternalOntoL.g:5069:1: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 ) )
            {
            // InternalOntoL.g:5069:1: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 ) )
            // InternalOntoL.g:5070:2: ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAssignmentsAssignment_3_1_1()); 
            // InternalOntoL.g:5071:2: ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 )
            // InternalOntoL.g:5071:3: rule__AttributeAssignment__AssignmentsAssignment_3_1_1
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
    // InternalOntoL.g:5079:1: rule__AttributeAssignment__Group_3_1__2 : rule__AttributeAssignment__Group_3_1__2__Impl rule__AttributeAssignment__Group_3_1__3 ;
    public final void rule__AttributeAssignment__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5083:1: ( rule__AttributeAssignment__Group_3_1__2__Impl rule__AttributeAssignment__Group_3_1__3 )
            // InternalOntoL.g:5084:2: rule__AttributeAssignment__Group_3_1__2__Impl rule__AttributeAssignment__Group_3_1__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalOntoL.g:5091:1: rule__AttributeAssignment__Group_3_1__2__Impl : ( ( rule__AttributeAssignment__Group_3_1_2__0 )* ) ;
    public final void rule__AttributeAssignment__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5095:1: ( ( ( rule__AttributeAssignment__Group_3_1_2__0 )* ) )
            // InternalOntoL.g:5096:1: ( ( rule__AttributeAssignment__Group_3_1_2__0 )* )
            {
            // InternalOntoL.g:5096:1: ( ( rule__AttributeAssignment__Group_3_1_2__0 )* )
            // InternalOntoL.g:5097:2: ( rule__AttributeAssignment__Group_3_1_2__0 )*
            {
             before(grammarAccess.getAttributeAssignmentAccess().getGroup_3_1_2()); 
            // InternalOntoL.g:5098:2: ( rule__AttributeAssignment__Group_3_1_2__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==28) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalOntoL.g:5098:3: rule__AttributeAssignment__Group_3_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AttributeAssignment__Group_3_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalOntoL.g:5106:1: rule__AttributeAssignment__Group_3_1__3 : rule__AttributeAssignment__Group_3_1__3__Impl ;
    public final void rule__AttributeAssignment__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5110:1: ( rule__AttributeAssignment__Group_3_1__3__Impl )
            // InternalOntoL.g:5111:2: rule__AttributeAssignment__Group_3_1__3__Impl
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
    // InternalOntoL.g:5117:1: rule__AttributeAssignment__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__AttributeAssignment__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5121:1: ( ( '}' ) )
            // InternalOntoL.g:5122:1: ( '}' )
            {
            // InternalOntoL.g:5122:1: ( '}' )
            // InternalOntoL.g:5123:2: '}'
            {
             before(grammarAccess.getAttributeAssignmentAccess().getRightCurlyBracketKeyword_3_1_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalOntoL.g:5133:1: rule__AttributeAssignment__Group_3_1_2__0 : rule__AttributeAssignment__Group_3_1_2__0__Impl rule__AttributeAssignment__Group_3_1_2__1 ;
    public final void rule__AttributeAssignment__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5137:1: ( rule__AttributeAssignment__Group_3_1_2__0__Impl rule__AttributeAssignment__Group_3_1_2__1 )
            // InternalOntoL.g:5138:2: rule__AttributeAssignment__Group_3_1_2__0__Impl rule__AttributeAssignment__Group_3_1_2__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalOntoL.g:5145:1: rule__AttributeAssignment__Group_3_1_2__0__Impl : ( ',' ) ;
    public final void rule__AttributeAssignment__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5149:1: ( ( ',' ) )
            // InternalOntoL.g:5150:1: ( ',' )
            {
            // InternalOntoL.g:5150:1: ( ',' )
            // InternalOntoL.g:5151:2: ','
            {
             before(grammarAccess.getAttributeAssignmentAccess().getCommaKeyword_3_1_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoL.g:5160:1: rule__AttributeAssignment__Group_3_1_2__1 : rule__AttributeAssignment__Group_3_1_2__1__Impl ;
    public final void rule__AttributeAssignment__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5164:1: ( rule__AttributeAssignment__Group_3_1_2__1__Impl )
            // InternalOntoL.g:5165:2: rule__AttributeAssignment__Group_3_1_2__1__Impl
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
    // InternalOntoL.g:5171:1: rule__AttributeAssignment__Group_3_1_2__1__Impl : ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 ) ) ;
    public final void rule__AttributeAssignment__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5175:1: ( ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 ) ) )
            // InternalOntoL.g:5176:1: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 ) )
            {
            // InternalOntoL.g:5176:1: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 ) )
            // InternalOntoL.g:5177:2: ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAssignmentsAssignment_3_1_2_1()); 
            // InternalOntoL.g:5178:2: ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 )
            // InternalOntoL.g:5178:3: rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1
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
    // InternalOntoL.g:5187:1: rule__SimpleAttributeAssignment__Group__0 : rule__SimpleAttributeAssignment__Group__0__Impl rule__SimpleAttributeAssignment__Group__1 ;
    public final void rule__SimpleAttributeAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5191:1: ( rule__SimpleAttributeAssignment__Group__0__Impl rule__SimpleAttributeAssignment__Group__1 )
            // InternalOntoL.g:5192:2: rule__SimpleAttributeAssignment__Group__0__Impl rule__SimpleAttributeAssignment__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalOntoL.g:5199:1: rule__SimpleAttributeAssignment__Group__0__Impl : ( ( rule__SimpleAttributeAssignment__AttributeAssignment_0 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5203:1: ( ( ( rule__SimpleAttributeAssignment__AttributeAssignment_0 ) ) )
            // InternalOntoL.g:5204:1: ( ( rule__SimpleAttributeAssignment__AttributeAssignment_0 ) )
            {
            // InternalOntoL.g:5204:1: ( ( rule__SimpleAttributeAssignment__AttributeAssignment_0 ) )
            // InternalOntoL.g:5205:2: ( rule__SimpleAttributeAssignment__AttributeAssignment_0 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAttributeAssignment_0()); 
            // InternalOntoL.g:5206:2: ( rule__SimpleAttributeAssignment__AttributeAssignment_0 )
            // InternalOntoL.g:5206:3: rule__SimpleAttributeAssignment__AttributeAssignment_0
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
    // InternalOntoL.g:5214:1: rule__SimpleAttributeAssignment__Group__1 : rule__SimpleAttributeAssignment__Group__1__Impl rule__SimpleAttributeAssignment__Group__2 ;
    public final void rule__SimpleAttributeAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5218:1: ( rule__SimpleAttributeAssignment__Group__1__Impl rule__SimpleAttributeAssignment__Group__2 )
            // InternalOntoL.g:5219:2: rule__SimpleAttributeAssignment__Group__1__Impl rule__SimpleAttributeAssignment__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalOntoL.g:5226:1: rule__SimpleAttributeAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__SimpleAttributeAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5230:1: ( ( '=' ) )
            // InternalOntoL.g:5231:1: ( '=' )
            {
            // InternalOntoL.g:5231:1: ( '=' )
            // InternalOntoL.g:5232:2: '='
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalOntoL.g:5241:1: rule__SimpleAttributeAssignment__Group__2 : rule__SimpleAttributeAssignment__Group__2__Impl ;
    public final void rule__SimpleAttributeAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5245:1: ( rule__SimpleAttributeAssignment__Group__2__Impl )
            // InternalOntoL.g:5246:2: rule__SimpleAttributeAssignment__Group__2__Impl
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
    // InternalOntoL.g:5252:1: rule__SimpleAttributeAssignment__Group__2__Impl : ( ( rule__SimpleAttributeAssignment__Alternatives_2 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5256:1: ( ( ( rule__SimpleAttributeAssignment__Alternatives_2 ) ) )
            // InternalOntoL.g:5257:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2 ) )
            {
            // InternalOntoL.g:5257:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2 ) )
            // InternalOntoL.g:5258:2: ( rule__SimpleAttributeAssignment__Alternatives_2 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAlternatives_2()); 
            // InternalOntoL.g:5259:2: ( rule__SimpleAttributeAssignment__Alternatives_2 )
            // InternalOntoL.g:5259:3: rule__SimpleAttributeAssignment__Alternatives_2
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
    // InternalOntoL.g:5268:1: rule__SimpleAttributeAssignment__Group_2_1__0 : rule__SimpleAttributeAssignment__Group_2_1__0__Impl rule__SimpleAttributeAssignment__Group_2_1__1 ;
    public final void rule__SimpleAttributeAssignment__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5272:1: ( rule__SimpleAttributeAssignment__Group_2_1__0__Impl rule__SimpleAttributeAssignment__Group_2_1__1 )
            // InternalOntoL.g:5273:2: rule__SimpleAttributeAssignment__Group_2_1__0__Impl rule__SimpleAttributeAssignment__Group_2_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalOntoL.g:5280:1: rule__SimpleAttributeAssignment__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5284:1: ( ( '{' ) )
            // InternalOntoL.g:5285:1: ( '{' )
            {
            // InternalOntoL.g:5285:1: ( '{' )
            // InternalOntoL.g:5286:2: '{'
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalOntoL.g:5295:1: rule__SimpleAttributeAssignment__Group_2_1__1 : rule__SimpleAttributeAssignment__Group_2_1__1__Impl rule__SimpleAttributeAssignment__Group_2_1__2 ;
    public final void rule__SimpleAttributeAssignment__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5299:1: ( rule__SimpleAttributeAssignment__Group_2_1__1__Impl rule__SimpleAttributeAssignment__Group_2_1__2 )
            // InternalOntoL.g:5300:2: rule__SimpleAttributeAssignment__Group_2_1__1__Impl rule__SimpleAttributeAssignment__Group_2_1__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalOntoL.g:5307:1: rule__SimpleAttributeAssignment__Group_2_1__1__Impl : ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5311:1: ( ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1 ) ) )
            // InternalOntoL.g:5312:1: ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1 ) )
            {
            // InternalOntoL.g:5312:1: ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1 ) )
            // InternalOntoL.g:5313:2: ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAssignmentsAssignment_2_1_1()); 
            // InternalOntoL.g:5314:2: ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1 )
            // InternalOntoL.g:5314:3: rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1
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
    // InternalOntoL.g:5322:1: rule__SimpleAttributeAssignment__Group_2_1__2 : rule__SimpleAttributeAssignment__Group_2_1__2__Impl rule__SimpleAttributeAssignment__Group_2_1__3 ;
    public final void rule__SimpleAttributeAssignment__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5326:1: ( rule__SimpleAttributeAssignment__Group_2_1__2__Impl rule__SimpleAttributeAssignment__Group_2_1__3 )
            // InternalOntoL.g:5327:2: rule__SimpleAttributeAssignment__Group_2_1__2__Impl rule__SimpleAttributeAssignment__Group_2_1__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalOntoL.g:5334:1: rule__SimpleAttributeAssignment__Group_2_1__2__Impl : ( ( rule__SimpleAttributeAssignment__Group_2_1_2__0 )* ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5338:1: ( ( ( rule__SimpleAttributeAssignment__Group_2_1_2__0 )* ) )
            // InternalOntoL.g:5339:1: ( ( rule__SimpleAttributeAssignment__Group_2_1_2__0 )* )
            {
            // InternalOntoL.g:5339:1: ( ( rule__SimpleAttributeAssignment__Group_2_1_2__0 )* )
            // InternalOntoL.g:5340:2: ( rule__SimpleAttributeAssignment__Group_2_1_2__0 )*
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_1_2()); 
            // InternalOntoL.g:5341:2: ( rule__SimpleAttributeAssignment__Group_2_1_2__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==28) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalOntoL.g:5341:3: rule__SimpleAttributeAssignment__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SimpleAttributeAssignment__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalOntoL.g:5349:1: rule__SimpleAttributeAssignment__Group_2_1__3 : rule__SimpleAttributeAssignment__Group_2_1__3__Impl ;
    public final void rule__SimpleAttributeAssignment__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5353:1: ( rule__SimpleAttributeAssignment__Group_2_1__3__Impl )
            // InternalOntoL.g:5354:2: rule__SimpleAttributeAssignment__Group_2_1__3__Impl
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
    // InternalOntoL.g:5360:1: rule__SimpleAttributeAssignment__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5364:1: ( ( '}' ) )
            // InternalOntoL.g:5365:1: ( '}' )
            {
            // InternalOntoL.g:5365:1: ( '}' )
            // InternalOntoL.g:5366:2: '}'
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getRightCurlyBracketKeyword_2_1_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalOntoL.g:5376:1: rule__SimpleAttributeAssignment__Group_2_1_2__0 : rule__SimpleAttributeAssignment__Group_2_1_2__0__Impl rule__SimpleAttributeAssignment__Group_2_1_2__1 ;
    public final void rule__SimpleAttributeAssignment__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5380:1: ( rule__SimpleAttributeAssignment__Group_2_1_2__0__Impl rule__SimpleAttributeAssignment__Group_2_1_2__1 )
            // InternalOntoL.g:5381:2: rule__SimpleAttributeAssignment__Group_2_1_2__0__Impl rule__SimpleAttributeAssignment__Group_2_1_2__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalOntoL.g:5388:1: rule__SimpleAttributeAssignment__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5392:1: ( ( ',' ) )
            // InternalOntoL.g:5393:1: ( ',' )
            {
            // InternalOntoL.g:5393:1: ( ',' )
            // InternalOntoL.g:5394:2: ','
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getCommaKeyword_2_1_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoL.g:5403:1: rule__SimpleAttributeAssignment__Group_2_1_2__1 : rule__SimpleAttributeAssignment__Group_2_1_2__1__Impl ;
    public final void rule__SimpleAttributeAssignment__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5407:1: ( rule__SimpleAttributeAssignment__Group_2_1_2__1__Impl )
            // InternalOntoL.g:5408:2: rule__SimpleAttributeAssignment__Group_2_1_2__1__Impl
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
    // InternalOntoL.g:5414:1: rule__SimpleAttributeAssignment__Group_2_1_2__1__Impl : ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5418:1: ( ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1 ) ) )
            // InternalOntoL.g:5419:1: ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1 ) )
            {
            // InternalOntoL.g:5419:1: ( ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1 ) )
            // InternalOntoL.g:5420:2: ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAssignmentsAssignment_2_1_2_1()); 
            // InternalOntoL.g:5421:2: ( rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1 )
            // InternalOntoL.g:5421:3: rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1
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
    // InternalOntoL.g:5430:1: rule__ReferenceAssignment__Group__0 : rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1 ;
    public final void rule__ReferenceAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5434:1: ( rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1 )
            // InternalOntoL.g:5435:2: rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1
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
    // InternalOntoL.g:5442:1: rule__ReferenceAssignment__Group__0__Impl : ( 'ref' ) ;
    public final void rule__ReferenceAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5446:1: ( ( 'ref' ) )
            // InternalOntoL.g:5447:1: ( 'ref' )
            {
            // InternalOntoL.g:5447:1: ( 'ref' )
            // InternalOntoL.g:5448:2: 'ref'
            {
             before(grammarAccess.getReferenceAssignmentAccess().getRefKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalOntoL.g:5457:1: rule__ReferenceAssignment__Group__1 : rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2 ;
    public final void rule__ReferenceAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5461:1: ( rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2 )
            // InternalOntoL.g:5462:2: rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalOntoL.g:5469:1: rule__ReferenceAssignment__Group__1__Impl : ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) ) ;
    public final void rule__ReferenceAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5473:1: ( ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) ) )
            // InternalOntoL.g:5474:1: ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) )
            {
            // InternalOntoL.g:5474:1: ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) )
            // InternalOntoL.g:5475:2: ( rule__ReferenceAssignment__ReferenceAssignment_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getReferenceAssignment_1()); 
            // InternalOntoL.g:5476:2: ( rule__ReferenceAssignment__ReferenceAssignment_1 )
            // InternalOntoL.g:5476:3: rule__ReferenceAssignment__ReferenceAssignment_1
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
    // InternalOntoL.g:5484:1: rule__ReferenceAssignment__Group__2 : rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3 ;
    public final void rule__ReferenceAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5488:1: ( rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3 )
            // InternalOntoL.g:5489:2: rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalOntoL.g:5496:1: rule__ReferenceAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__ReferenceAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5500:1: ( ( '=' ) )
            // InternalOntoL.g:5501:1: ( '=' )
            {
            // InternalOntoL.g:5501:1: ( '=' )
            // InternalOntoL.g:5502:2: '='
            {
             before(grammarAccess.getReferenceAssignmentAccess().getEqualsSignKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalOntoL.g:5511:1: rule__ReferenceAssignment__Group__3 : rule__ReferenceAssignment__Group__3__Impl ;
    public final void rule__ReferenceAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5515:1: ( rule__ReferenceAssignment__Group__3__Impl )
            // InternalOntoL.g:5516:2: rule__ReferenceAssignment__Group__3__Impl
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
    // InternalOntoL.g:5522:1: rule__ReferenceAssignment__Group__3__Impl : ( ( rule__ReferenceAssignment__Alternatives_3 ) ) ;
    public final void rule__ReferenceAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5526:1: ( ( ( rule__ReferenceAssignment__Alternatives_3 ) ) )
            // InternalOntoL.g:5527:1: ( ( rule__ReferenceAssignment__Alternatives_3 ) )
            {
            // InternalOntoL.g:5527:1: ( ( rule__ReferenceAssignment__Alternatives_3 ) )
            // InternalOntoL.g:5528:2: ( rule__ReferenceAssignment__Alternatives_3 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAlternatives_3()); 
            // InternalOntoL.g:5529:2: ( rule__ReferenceAssignment__Alternatives_3 )
            // InternalOntoL.g:5529:3: rule__ReferenceAssignment__Alternatives_3
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
    // InternalOntoL.g:5538:1: rule__ReferenceAssignment__Group_3_1__0 : rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1 ;
    public final void rule__ReferenceAssignment__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5542:1: ( rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1 )
            // InternalOntoL.g:5543:2: rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1
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
    // InternalOntoL.g:5550:1: rule__ReferenceAssignment__Group_3_1__0__Impl : ( '{' ) ;
    public final void rule__ReferenceAssignment__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5554:1: ( ( '{' ) )
            // InternalOntoL.g:5555:1: ( '{' )
            {
            // InternalOntoL.g:5555:1: ( '{' )
            // InternalOntoL.g:5556:2: '{'
            {
             before(grammarAccess.getReferenceAssignmentAccess().getLeftCurlyBracketKeyword_3_1_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalOntoL.g:5565:1: rule__ReferenceAssignment__Group_3_1__1 : rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2 ;
    public final void rule__ReferenceAssignment__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5569:1: ( rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2 )
            // InternalOntoL.g:5570:2: rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalOntoL.g:5577:1: rule__ReferenceAssignment__Group_3_1__1__Impl : ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) ) ;
    public final void rule__ReferenceAssignment__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5581:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) ) )
            // InternalOntoL.g:5582:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) )
            {
            // InternalOntoL.g:5582:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) )
            // InternalOntoL.g:5583:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_1_1()); 
            // InternalOntoL.g:5584:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 )
            // InternalOntoL.g:5584:3: rule__ReferenceAssignment__AssignmentsAssignment_3_1_1
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
    // InternalOntoL.g:5592:1: rule__ReferenceAssignment__Group_3_1__2 : rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3 ;
    public final void rule__ReferenceAssignment__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5596:1: ( rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3 )
            // InternalOntoL.g:5597:2: rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalOntoL.g:5604:1: rule__ReferenceAssignment__Group_3_1__2__Impl : ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* ) ;
    public final void rule__ReferenceAssignment__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5608:1: ( ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* ) )
            // InternalOntoL.g:5609:1: ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* )
            {
            // InternalOntoL.g:5609:1: ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* )
            // InternalOntoL.g:5610:2: ( rule__ReferenceAssignment__Group_3_1_2__0 )*
            {
             before(grammarAccess.getReferenceAssignmentAccess().getGroup_3_1_2()); 
            // InternalOntoL.g:5611:2: ( rule__ReferenceAssignment__Group_3_1_2__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==28) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalOntoL.g:5611:3: rule__ReferenceAssignment__Group_3_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ReferenceAssignment__Group_3_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalOntoL.g:5619:1: rule__ReferenceAssignment__Group_3_1__3 : rule__ReferenceAssignment__Group_3_1__3__Impl ;
    public final void rule__ReferenceAssignment__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5623:1: ( rule__ReferenceAssignment__Group_3_1__3__Impl )
            // InternalOntoL.g:5624:2: rule__ReferenceAssignment__Group_3_1__3__Impl
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
    // InternalOntoL.g:5630:1: rule__ReferenceAssignment__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__ReferenceAssignment__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5634:1: ( ( '}' ) )
            // InternalOntoL.g:5635:1: ( '}' )
            {
            // InternalOntoL.g:5635:1: ( '}' )
            // InternalOntoL.g:5636:2: '}'
            {
             before(grammarAccess.getReferenceAssignmentAccess().getRightCurlyBracketKeyword_3_1_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalOntoL.g:5646:1: rule__ReferenceAssignment__Group_3_1_2__0 : rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1 ;
    public final void rule__ReferenceAssignment__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5650:1: ( rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1 )
            // InternalOntoL.g:5651:2: rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1
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
    // InternalOntoL.g:5658:1: rule__ReferenceAssignment__Group_3_1_2__0__Impl : ( ',' ) ;
    public final void rule__ReferenceAssignment__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5662:1: ( ( ',' ) )
            // InternalOntoL.g:5663:1: ( ',' )
            {
            // InternalOntoL.g:5663:1: ( ',' )
            // InternalOntoL.g:5664:2: ','
            {
             before(grammarAccess.getReferenceAssignmentAccess().getCommaKeyword_3_1_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoL.g:5673:1: rule__ReferenceAssignment__Group_3_1_2__1 : rule__ReferenceAssignment__Group_3_1_2__1__Impl ;
    public final void rule__ReferenceAssignment__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5677:1: ( rule__ReferenceAssignment__Group_3_1_2__1__Impl )
            // InternalOntoL.g:5678:2: rule__ReferenceAssignment__Group_3_1_2__1__Impl
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
    // InternalOntoL.g:5684:1: rule__ReferenceAssignment__Group_3_1_2__1__Impl : ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) ) ;
    public final void rule__ReferenceAssignment__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5688:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) ) )
            // InternalOntoL.g:5689:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) )
            {
            // InternalOntoL.g:5689:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) )
            // InternalOntoL.g:5690:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_1_2_1()); 
            // InternalOntoL.g:5691:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 )
            // InternalOntoL.g:5691:3: rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1
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
    // InternalOntoL.g:5700:1: rule__NUMBER__Group__0 : rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 ;
    public final void rule__NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5704:1: ( rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 )
            // InternalOntoL.g:5705:2: rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalOntoL.g:5712:1: rule__NUMBER__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5716:1: ( ( ( '-' )? ) )
            // InternalOntoL.g:5717:1: ( ( '-' )? )
            {
            // InternalOntoL.g:5717:1: ( ( '-' )? )
            // InternalOntoL.g:5718:2: ( '-' )?
            {
             before(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0()); 
            // InternalOntoL.g:5719:2: ( '-' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==44) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalOntoL.g:5719:3: '-'
                    {
                    match(input,44,FOLLOW_2); 

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
    // InternalOntoL.g:5727:1: rule__NUMBER__Group__1 : rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2 ;
    public final void rule__NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5731:1: ( rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2 )
            // InternalOntoL.g:5732:2: rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2
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
    // InternalOntoL.g:5739:1: rule__NUMBER__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5743:1: ( ( RULE_INT ) )
            // InternalOntoL.g:5744:1: ( RULE_INT )
            {
            // InternalOntoL.g:5744:1: ( RULE_INT )
            // InternalOntoL.g:5745:2: RULE_INT
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
    // InternalOntoL.g:5754:1: rule__NUMBER__Group__2 : rule__NUMBER__Group__2__Impl ;
    public final void rule__NUMBER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5758:1: ( rule__NUMBER__Group__2__Impl )
            // InternalOntoL.g:5759:2: rule__NUMBER__Group__2__Impl
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
    // InternalOntoL.g:5765:1: rule__NUMBER__Group__2__Impl : ( ( rule__NUMBER__Group_2__0 )? ) ;
    public final void rule__NUMBER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5769:1: ( ( ( rule__NUMBER__Group_2__0 )? ) )
            // InternalOntoL.g:5770:1: ( ( rule__NUMBER__Group_2__0 )? )
            {
            // InternalOntoL.g:5770:1: ( ( rule__NUMBER__Group_2__0 )? )
            // InternalOntoL.g:5771:2: ( rule__NUMBER__Group_2__0 )?
            {
             before(grammarAccess.getNUMBERAccess().getGroup_2()); 
            // InternalOntoL.g:5772:2: ( rule__NUMBER__Group_2__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==23) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalOntoL.g:5772:3: rule__NUMBER__Group_2__0
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
    // InternalOntoL.g:5781:1: rule__NUMBER__Group_2__0 : rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1 ;
    public final void rule__NUMBER__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5785:1: ( rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1 )
            // InternalOntoL.g:5786:2: rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalOntoL.g:5793:1: rule__NUMBER__Group_2__0__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5797:1: ( ( '.' ) )
            // InternalOntoL.g:5798:1: ( '.' )
            {
            // InternalOntoL.g:5798:1: ( '.' )
            // InternalOntoL.g:5799:2: '.'
            {
             before(grammarAccess.getNUMBERAccess().getFullStopKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalOntoL.g:5808:1: rule__NUMBER__Group_2__1 : rule__NUMBER__Group_2__1__Impl ;
    public final void rule__NUMBER__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5812:1: ( rule__NUMBER__Group_2__1__Impl )
            // InternalOntoL.g:5813:2: rule__NUMBER__Group_2__1__Impl
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
    // InternalOntoL.g:5819:1: rule__NUMBER__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5823:1: ( ( RULE_INT ) )
            // InternalOntoL.g:5824:1: ( RULE_INT )
            {
            // InternalOntoL.g:5824:1: ( RULE_INT )
            // InternalOntoL.g:5825:2: RULE_INT
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
    // InternalOntoL.g:5835:1: rule__NoneValue__Group__0 : rule__NoneValue__Group__0__Impl rule__NoneValue__Group__1 ;
    public final void rule__NoneValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5839:1: ( rule__NoneValue__Group__0__Impl rule__NoneValue__Group__1 )
            // InternalOntoL.g:5840:2: rule__NoneValue__Group__0__Impl rule__NoneValue__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalOntoL.g:5847:1: rule__NoneValue__Group__0__Impl : ( () ) ;
    public final void rule__NoneValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5851:1: ( ( () ) )
            // InternalOntoL.g:5852:1: ( () )
            {
            // InternalOntoL.g:5852:1: ( () )
            // InternalOntoL.g:5853:2: ()
            {
             before(grammarAccess.getNoneValueAccess().getNoneValueAction_0()); 
            // InternalOntoL.g:5854:2: ()
            // InternalOntoL.g:5854:3: 
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
    // InternalOntoL.g:5862:1: rule__NoneValue__Group__1 : rule__NoneValue__Group__1__Impl ;
    public final void rule__NoneValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5866:1: ( rule__NoneValue__Group__1__Impl )
            // InternalOntoL.g:5867:2: rule__NoneValue__Group__1__Impl
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
    // InternalOntoL.g:5873:1: rule__NoneValue__Group__1__Impl : ( 'none' ) ;
    public final void rule__NoneValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5877:1: ( ( 'none' ) )
            // InternalOntoL.g:5878:1: ( 'none' )
            {
            // InternalOntoL.g:5878:1: ( 'none' )
            // InternalOntoL.g:5879:2: 'none'
            {
             before(grammarAccess.getNoneValueAccess().getNoneKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalOntoL.g:5889:1: rule__UnamedIndividual__Group__0 : rule__UnamedIndividual__Group__0__Impl rule__UnamedIndividual__Group__1 ;
    public final void rule__UnamedIndividual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5893:1: ( rule__UnamedIndividual__Group__0__Impl rule__UnamedIndividual__Group__1 )
            // InternalOntoL.g:5894:2: rule__UnamedIndividual__Group__0__Impl rule__UnamedIndividual__Group__1
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
    // InternalOntoL.g:5901:1: rule__UnamedIndividual__Group__0__Impl : ( '[' ) ;
    public final void rule__UnamedIndividual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5905:1: ( ( '[' ) )
            // InternalOntoL.g:5906:1: ( '[' )
            {
            // InternalOntoL.g:5906:1: ( '[' )
            // InternalOntoL.g:5907:2: '['
            {
             before(grammarAccess.getUnamedIndividualAccess().getLeftSquareBracketKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalOntoL.g:5916:1: rule__UnamedIndividual__Group__1 : rule__UnamedIndividual__Group__1__Impl rule__UnamedIndividual__Group__2 ;
    public final void rule__UnamedIndividual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5920:1: ( rule__UnamedIndividual__Group__1__Impl rule__UnamedIndividual__Group__2 )
            // InternalOntoL.g:5921:2: rule__UnamedIndividual__Group__1__Impl rule__UnamedIndividual__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalOntoL.g:5928:1: rule__UnamedIndividual__Group__1__Impl : ( ( rule__UnamedIndividual__AttAssignmentsAssignment_1 ) ) ;
    public final void rule__UnamedIndividual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5932:1: ( ( ( rule__UnamedIndividual__AttAssignmentsAssignment_1 ) ) )
            // InternalOntoL.g:5933:1: ( ( rule__UnamedIndividual__AttAssignmentsAssignment_1 ) )
            {
            // InternalOntoL.g:5933:1: ( ( rule__UnamedIndividual__AttAssignmentsAssignment_1 ) )
            // InternalOntoL.g:5934:2: ( rule__UnamedIndividual__AttAssignmentsAssignment_1 )
            {
             before(grammarAccess.getUnamedIndividualAccess().getAttAssignmentsAssignment_1()); 
            // InternalOntoL.g:5935:2: ( rule__UnamedIndividual__AttAssignmentsAssignment_1 )
            // InternalOntoL.g:5935:3: rule__UnamedIndividual__AttAssignmentsAssignment_1
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
    // InternalOntoL.g:5943:1: rule__UnamedIndividual__Group__2 : rule__UnamedIndividual__Group__2__Impl rule__UnamedIndividual__Group__3 ;
    public final void rule__UnamedIndividual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5947:1: ( rule__UnamedIndividual__Group__2__Impl rule__UnamedIndividual__Group__3 )
            // InternalOntoL.g:5948:2: rule__UnamedIndividual__Group__2__Impl rule__UnamedIndividual__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalOntoL.g:5955:1: rule__UnamedIndividual__Group__2__Impl : ( ( rule__UnamedIndividual__Group_2__0 )* ) ;
    public final void rule__UnamedIndividual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5959:1: ( ( ( rule__UnamedIndividual__Group_2__0 )* ) )
            // InternalOntoL.g:5960:1: ( ( rule__UnamedIndividual__Group_2__0 )* )
            {
            // InternalOntoL.g:5960:1: ( ( rule__UnamedIndividual__Group_2__0 )* )
            // InternalOntoL.g:5961:2: ( rule__UnamedIndividual__Group_2__0 )*
            {
             before(grammarAccess.getUnamedIndividualAccess().getGroup_2()); 
            // InternalOntoL.g:5962:2: ( rule__UnamedIndividual__Group_2__0 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==28) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalOntoL.g:5962:3: rule__UnamedIndividual__Group_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__UnamedIndividual__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // InternalOntoL.g:5970:1: rule__UnamedIndividual__Group__3 : rule__UnamedIndividual__Group__3__Impl ;
    public final void rule__UnamedIndividual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5974:1: ( rule__UnamedIndividual__Group__3__Impl )
            // InternalOntoL.g:5975:2: rule__UnamedIndividual__Group__3__Impl
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
    // InternalOntoL.g:5981:1: rule__UnamedIndividual__Group__3__Impl : ( ']' ) ;
    public final void rule__UnamedIndividual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5985:1: ( ( ']' ) )
            // InternalOntoL.g:5986:1: ( ']' )
            {
            // InternalOntoL.g:5986:1: ( ']' )
            // InternalOntoL.g:5987:2: ']'
            {
             before(grammarAccess.getUnamedIndividualAccess().getRightSquareBracketKeyword_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalOntoL.g:5997:1: rule__UnamedIndividual__Group_2__0 : rule__UnamedIndividual__Group_2__0__Impl rule__UnamedIndividual__Group_2__1 ;
    public final void rule__UnamedIndividual__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6001:1: ( rule__UnamedIndividual__Group_2__0__Impl rule__UnamedIndividual__Group_2__1 )
            // InternalOntoL.g:6002:2: rule__UnamedIndividual__Group_2__0__Impl rule__UnamedIndividual__Group_2__1
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
    // InternalOntoL.g:6009:1: rule__UnamedIndividual__Group_2__0__Impl : ( ',' ) ;
    public final void rule__UnamedIndividual__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6013:1: ( ( ',' ) )
            // InternalOntoL.g:6014:1: ( ',' )
            {
            // InternalOntoL.g:6014:1: ( ',' )
            // InternalOntoL.g:6015:2: ','
            {
             before(grammarAccess.getUnamedIndividualAccess().getCommaKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoL.g:6024:1: rule__UnamedIndividual__Group_2__1 : rule__UnamedIndividual__Group_2__1__Impl ;
    public final void rule__UnamedIndividual__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6028:1: ( rule__UnamedIndividual__Group_2__1__Impl )
            // InternalOntoL.g:6029:2: rule__UnamedIndividual__Group_2__1__Impl
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
    // InternalOntoL.g:6035:1: rule__UnamedIndividual__Group_2__1__Impl : ( ( rule__UnamedIndividual__AttAssignmentsAssignment_2_1 ) ) ;
    public final void rule__UnamedIndividual__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6039:1: ( ( ( rule__UnamedIndividual__AttAssignmentsAssignment_2_1 ) ) )
            // InternalOntoL.g:6040:1: ( ( rule__UnamedIndividual__AttAssignmentsAssignment_2_1 ) )
            {
            // InternalOntoL.g:6040:1: ( ( rule__UnamedIndividual__AttAssignmentsAssignment_2_1 ) )
            // InternalOntoL.g:6041:2: ( rule__UnamedIndividual__AttAssignmentsAssignment_2_1 )
            {
             before(grammarAccess.getUnamedIndividualAccess().getAttAssignmentsAssignment_2_1()); 
            // InternalOntoL.g:6042:2: ( rule__UnamedIndividual__AttAssignmentsAssignment_2_1 )
            // InternalOntoL.g:6042:3: rule__UnamedIndividual__AttAssignmentsAssignment_2_1
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
    // InternalOntoL.g:6051:1: rule__GeneralizationSet__Group__0 : rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 ;
    public final void rule__GeneralizationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6055:1: ( rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 )
            // InternalOntoL.g:6056:2: rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalOntoL.g:6063:1: rule__GeneralizationSet__Group__0__Impl : ( ( rule__GeneralizationSet__Alternatives_0 )? ) ;
    public final void rule__GeneralizationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6067:1: ( ( ( rule__GeneralizationSet__Alternatives_0 )? ) )
            // InternalOntoL.g:6068:1: ( ( rule__GeneralizationSet__Alternatives_0 )? )
            {
            // InternalOntoL.g:6068:1: ( ( rule__GeneralizationSet__Alternatives_0 )? )
            // InternalOntoL.g:6069:2: ( rule__GeneralizationSet__Alternatives_0 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getAlternatives_0()); 
            // InternalOntoL.g:6070:2: ( rule__GeneralizationSet__Alternatives_0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=50 && LA59_0<=51)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalOntoL.g:6070:3: rule__GeneralizationSet__Alternatives_0
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
    // InternalOntoL.g:6078:1: rule__GeneralizationSet__Group__1 : rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 ;
    public final void rule__GeneralizationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6082:1: ( rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 )
            // InternalOntoL.g:6083:2: rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalOntoL.g:6090:1: rule__GeneralizationSet__Group__1__Impl : ( 'genset' ) ;
    public final void rule__GeneralizationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6094:1: ( ( 'genset' ) )
            // InternalOntoL.g:6095:1: ( 'genset' )
            {
            // InternalOntoL.g:6095:1: ( 'genset' )
            // InternalOntoL.g:6096:2: 'genset'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGensetKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalOntoL.g:6105:1: rule__GeneralizationSet__Group__2 : rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 ;
    public final void rule__GeneralizationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6109:1: ( rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 )
            // InternalOntoL.g:6110:2: rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalOntoL.g:6117:1: rule__GeneralizationSet__Group__2__Impl : ( ( rule__GeneralizationSet__NameAssignment_2 )? ) ;
    public final void rule__GeneralizationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6121:1: ( ( ( rule__GeneralizationSet__NameAssignment_2 )? ) )
            // InternalOntoL.g:6122:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            {
            // InternalOntoL.g:6122:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            // InternalOntoL.g:6123:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 
            // InternalOntoL.g:6124:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalOntoL.g:6124:3: rule__GeneralizationSet__NameAssignment_2
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
    // InternalOntoL.g:6132:1: rule__GeneralizationSet__Group__3 : rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 ;
    public final void rule__GeneralizationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6136:1: ( rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 )
            // InternalOntoL.g:6137:2: rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4
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
    // InternalOntoL.g:6144:1: rule__GeneralizationSet__Group__3__Impl : ( 'general' ) ;
    public final void rule__GeneralizationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6148:1: ( ( 'general' ) )
            // InternalOntoL.g:6149:1: ( 'general' )
            {
            // InternalOntoL.g:6149:1: ( 'general' )
            // InternalOntoL.g:6150:2: 'general'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalOntoL.g:6159:1: rule__GeneralizationSet__Group__4 : rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 ;
    public final void rule__GeneralizationSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6163:1: ( rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 )
            // InternalOntoL.g:6164:2: rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalOntoL.g:6171:1: rule__GeneralizationSet__Group__4__Impl : ( ( rule__GeneralizationSet__GeneralAssignment_4 ) ) ;
    public final void rule__GeneralizationSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6175:1: ( ( ( rule__GeneralizationSet__GeneralAssignment_4 ) ) )
            // InternalOntoL.g:6176:1: ( ( rule__GeneralizationSet__GeneralAssignment_4 ) )
            {
            // InternalOntoL.g:6176:1: ( ( rule__GeneralizationSet__GeneralAssignment_4 ) )
            // InternalOntoL.g:6177:2: ( rule__GeneralizationSet__GeneralAssignment_4 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralAssignment_4()); 
            // InternalOntoL.g:6178:2: ( rule__GeneralizationSet__GeneralAssignment_4 )
            // InternalOntoL.g:6178:3: rule__GeneralizationSet__GeneralAssignment_4
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
    // InternalOntoL.g:6186:1: rule__GeneralizationSet__Group__5 : rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 ;
    public final void rule__GeneralizationSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6190:1: ( rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 )
            // InternalOntoL.g:6191:2: rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6
            {
            pushFollow(FOLLOW_38);
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
    // InternalOntoL.g:6198:1: rule__GeneralizationSet__Group__5__Impl : ( ( rule__GeneralizationSet__Group_5__0 )? ) ;
    public final void rule__GeneralizationSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6202:1: ( ( ( rule__GeneralizationSet__Group_5__0 )? ) )
            // InternalOntoL.g:6203:1: ( ( rule__GeneralizationSet__Group_5__0 )? )
            {
            // InternalOntoL.g:6203:1: ( ( rule__GeneralizationSet__Group_5__0 )? )
            // InternalOntoL.g:6204:2: ( rule__GeneralizationSet__Group_5__0 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_5()); 
            // InternalOntoL.g:6205:2: ( rule__GeneralizationSet__Group_5__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==49) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalOntoL.g:6205:3: rule__GeneralizationSet__Group_5__0
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
    // InternalOntoL.g:6213:1: rule__GeneralizationSet__Group__6 : rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 ;
    public final void rule__GeneralizationSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6217:1: ( rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 )
            // InternalOntoL.g:6218:2: rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7
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
    // InternalOntoL.g:6225:1: rule__GeneralizationSet__Group__6__Impl : ( 'specifics' ) ;
    public final void rule__GeneralizationSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6229:1: ( ( 'specifics' ) )
            // InternalOntoL.g:6230:1: ( 'specifics' )
            {
            // InternalOntoL.g:6230:1: ( 'specifics' )
            // InternalOntoL.g:6231:2: 'specifics'
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsKeyword_6()); 
            match(input,48,FOLLOW_2); 
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
    // InternalOntoL.g:6240:1: rule__GeneralizationSet__Group__7 : rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8 ;
    public final void rule__GeneralizationSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6244:1: ( rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8 )
            // InternalOntoL.g:6245:2: rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8
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
    // InternalOntoL.g:6252:1: rule__GeneralizationSet__Group__7__Impl : ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) ) ;
    public final void rule__GeneralizationSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6256:1: ( ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) ) )
            // InternalOntoL.g:6257:1: ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) )
            {
            // InternalOntoL.g:6257:1: ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) )
            // InternalOntoL.g:6258:2: ( rule__GeneralizationSet__SpecificsAssignment_7 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_7()); 
            // InternalOntoL.g:6259:2: ( rule__GeneralizationSet__SpecificsAssignment_7 )
            // InternalOntoL.g:6259:3: rule__GeneralizationSet__SpecificsAssignment_7
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
    // InternalOntoL.g:6267:1: rule__GeneralizationSet__Group__8 : rule__GeneralizationSet__Group__8__Impl ;
    public final void rule__GeneralizationSet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6271:1: ( rule__GeneralizationSet__Group__8__Impl )
            // InternalOntoL.g:6272:2: rule__GeneralizationSet__Group__8__Impl
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
    // InternalOntoL.g:6278:1: rule__GeneralizationSet__Group__8__Impl : ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) ) ;
    public final void rule__GeneralizationSet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6282:1: ( ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) ) )
            // InternalOntoL.g:6283:1: ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) )
            {
            // InternalOntoL.g:6283:1: ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) )
            // InternalOntoL.g:6284:2: ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* )
            {
            // InternalOntoL.g:6284:2: ( ( rule__GeneralizationSet__Group_8__0 ) )
            // InternalOntoL.g:6285:3: ( rule__GeneralizationSet__Group_8__0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 
            // InternalOntoL.g:6286:3: ( rule__GeneralizationSet__Group_8__0 )
            // InternalOntoL.g:6286:4: rule__GeneralizationSet__Group_8__0
            {
            pushFollow(FOLLOW_13);
            rule__GeneralizationSet__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 

            }

            // InternalOntoL.g:6289:2: ( ( rule__GeneralizationSet__Group_8__0 )* )
            // InternalOntoL.g:6290:3: ( rule__GeneralizationSet__Group_8__0 )*
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 
            // InternalOntoL.g:6291:3: ( rule__GeneralizationSet__Group_8__0 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==28) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalOntoL.g:6291:4: rule__GeneralizationSet__Group_8__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GeneralizationSet__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
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
    // InternalOntoL.g:6301:1: rule__GeneralizationSet__Group_0_2__0 : rule__GeneralizationSet__Group_0_2__0__Impl rule__GeneralizationSet__Group_0_2__1 ;
    public final void rule__GeneralizationSet__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6305:1: ( rule__GeneralizationSet__Group_0_2__0__Impl rule__GeneralizationSet__Group_0_2__1 )
            // InternalOntoL.g:6306:2: rule__GeneralizationSet__Group_0_2__0__Impl rule__GeneralizationSet__Group_0_2__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalOntoL.g:6313:1: rule__GeneralizationSet__Group_0_2__0__Impl : ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_0 ) ) ;
    public final void rule__GeneralizationSet__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6317:1: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_0 ) ) )
            // InternalOntoL.g:6318:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_0 ) )
            {
            // InternalOntoL.g:6318:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_0 ) )
            // InternalOntoL.g:6319:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_2_0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_2_0()); 
            // InternalOntoL.g:6320:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_2_0 )
            // InternalOntoL.g:6320:3: rule__GeneralizationSet__IsDisjointAssignment_0_2_0
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
    // InternalOntoL.g:6328:1: rule__GeneralizationSet__Group_0_2__1 : rule__GeneralizationSet__Group_0_2__1__Impl ;
    public final void rule__GeneralizationSet__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6332:1: ( rule__GeneralizationSet__Group_0_2__1__Impl )
            // InternalOntoL.g:6333:2: rule__GeneralizationSet__Group_0_2__1__Impl
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
    // InternalOntoL.g:6339:1: rule__GeneralizationSet__Group_0_2__1__Impl : ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_1 ) ) ;
    public final void rule__GeneralizationSet__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6343:1: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_1 ) ) )
            // InternalOntoL.g:6344:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_1 ) )
            {
            // InternalOntoL.g:6344:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_1 ) )
            // InternalOntoL.g:6345:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_2_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_2_1()); 
            // InternalOntoL.g:6346:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_2_1 )
            // InternalOntoL.g:6346:3: rule__GeneralizationSet__IsCompleteAssignment_0_2_1
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
    // InternalOntoL.g:6355:1: rule__GeneralizationSet__Group_0_3__0 : rule__GeneralizationSet__Group_0_3__0__Impl rule__GeneralizationSet__Group_0_3__1 ;
    public final void rule__GeneralizationSet__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6359:1: ( rule__GeneralizationSet__Group_0_3__0__Impl rule__GeneralizationSet__Group_0_3__1 )
            // InternalOntoL.g:6360:2: rule__GeneralizationSet__Group_0_3__0__Impl rule__GeneralizationSet__Group_0_3__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalOntoL.g:6367:1: rule__GeneralizationSet__Group_0_3__0__Impl : ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_0 ) ) ;
    public final void rule__GeneralizationSet__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6371:1: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_0 ) ) )
            // InternalOntoL.g:6372:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_0 ) )
            {
            // InternalOntoL.g:6372:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_0 ) )
            // InternalOntoL.g:6373:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_3_0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_3_0()); 
            // InternalOntoL.g:6374:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_3_0 )
            // InternalOntoL.g:6374:3: rule__GeneralizationSet__IsCompleteAssignment_0_3_0
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
    // InternalOntoL.g:6382:1: rule__GeneralizationSet__Group_0_3__1 : rule__GeneralizationSet__Group_0_3__1__Impl ;
    public final void rule__GeneralizationSet__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6386:1: ( rule__GeneralizationSet__Group_0_3__1__Impl )
            // InternalOntoL.g:6387:2: rule__GeneralizationSet__Group_0_3__1__Impl
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
    // InternalOntoL.g:6393:1: rule__GeneralizationSet__Group_0_3__1__Impl : ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_1 ) ) ;
    public final void rule__GeneralizationSet__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6397:1: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_1 ) ) )
            // InternalOntoL.g:6398:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_1 ) )
            {
            // InternalOntoL.g:6398:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_1 ) )
            // InternalOntoL.g:6399:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_3_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_3_1()); 
            // InternalOntoL.g:6400:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_3_1 )
            // InternalOntoL.g:6400:3: rule__GeneralizationSet__IsDisjointAssignment_0_3_1
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
    // InternalOntoL.g:6409:1: rule__GeneralizationSet__Group_5__0 : rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1 ;
    public final void rule__GeneralizationSet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6413:1: ( rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1 )
            // InternalOntoL.g:6414:2: rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1
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
    // InternalOntoL.g:6421:1: rule__GeneralizationSet__Group_5__0__Impl : ( 'categorizer' ) ;
    public final void rule__GeneralizationSet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6425:1: ( ( 'categorizer' ) )
            // InternalOntoL.g:6426:1: ( 'categorizer' )
            {
            // InternalOntoL.g:6426:1: ( 'categorizer' )
            // InternalOntoL.g:6427:2: 'categorizer'
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerKeyword_5_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalOntoL.g:6436:1: rule__GeneralizationSet__Group_5__1 : rule__GeneralizationSet__Group_5__1__Impl ;
    public final void rule__GeneralizationSet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6440:1: ( rule__GeneralizationSet__Group_5__1__Impl )
            // InternalOntoL.g:6441:2: rule__GeneralizationSet__Group_5__1__Impl
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
    // InternalOntoL.g:6447:1: rule__GeneralizationSet__Group_5__1__Impl : ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) ) ;
    public final void rule__GeneralizationSet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6451:1: ( ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) ) )
            // InternalOntoL.g:6452:1: ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) )
            {
            // InternalOntoL.g:6452:1: ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) )
            // InternalOntoL.g:6453:2: ( rule__GeneralizationSet__CategorizerAssignment_5_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerAssignment_5_1()); 
            // InternalOntoL.g:6454:2: ( rule__GeneralizationSet__CategorizerAssignment_5_1 )
            // InternalOntoL.g:6454:3: rule__GeneralizationSet__CategorizerAssignment_5_1
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
    // InternalOntoL.g:6463:1: rule__GeneralizationSet__Group_8__0 : rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1 ;
    public final void rule__GeneralizationSet__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6467:1: ( rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1 )
            // InternalOntoL.g:6468:2: rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1
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
    // InternalOntoL.g:6475:1: rule__GeneralizationSet__Group_8__0__Impl : ( ',' ) ;
    public final void rule__GeneralizationSet__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6479:1: ( ( ',' ) )
            // InternalOntoL.g:6480:1: ( ',' )
            {
            // InternalOntoL.g:6480:1: ( ',' )
            // InternalOntoL.g:6481:2: ','
            {
             before(grammarAccess.getGeneralizationSetAccess().getCommaKeyword_8_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoL.g:6490:1: rule__GeneralizationSet__Group_8__1 : rule__GeneralizationSet__Group_8__1__Impl ;
    public final void rule__GeneralizationSet__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6494:1: ( rule__GeneralizationSet__Group_8__1__Impl )
            // InternalOntoL.g:6495:2: rule__GeneralizationSet__Group_8__1__Impl
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
    // InternalOntoL.g:6501:1: rule__GeneralizationSet__Group_8__1__Impl : ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) ) ;
    public final void rule__GeneralizationSet__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6505:1: ( ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) ) )
            // InternalOntoL.g:6506:1: ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) )
            {
            // InternalOntoL.g:6506:1: ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) )
            // InternalOntoL.g:6507:2: ( rule__GeneralizationSet__SpecificsAssignment_8_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_8_1()); 
            // InternalOntoL.g:6508:2: ( rule__GeneralizationSet__SpecificsAssignment_8_1 )
            // InternalOntoL.g:6508:3: rule__GeneralizationSet__SpecificsAssignment_8_1
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
    // InternalOntoL.g:6517:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6521:1: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6522:2: ( ruleQualifiedName )
            {
            // InternalOntoL.g:6522:2: ( ruleQualifiedName )
            // InternalOntoL.g:6523:3: ruleQualifiedName
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
    // InternalOntoL.g:6532:1: rule__Model__IncludesAssignment_3_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Model__IncludesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6536:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6537:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6537:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6538:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getModelAccess().getIncludesModelCrossReference_3_0_1_0()); 
            // InternalOntoL.g:6539:3: ( ruleQualifiedName )
            // InternalOntoL.g:6540:4: ruleQualifiedName
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
    // InternalOntoL.g:6551:1: rule__Model__ElementsAssignment_3_1 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6555:1: ( ( ruleModelElement ) )
            // InternalOntoL.g:6556:2: ( ruleModelElement )
            {
            // InternalOntoL.g:6556:2: ( ruleModelElement )
            // InternalOntoL.g:6557:3: ruleModelElement
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
    // InternalOntoL.g:6566:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6570:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalOntoL.g:6571:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalOntoL.g:6571:2: ( ruleQualifiedNameWithWildcard )
            // InternalOntoL.g:6572:3: ruleQualifiedNameWithWildcard
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
    // InternalOntoL.g:6581:1: rule__Individual__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Individual__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6585:1: ( ( RULE_ID ) )
            // InternalOntoL.g:6586:2: ( RULE_ID )
            {
            // InternalOntoL.g:6586:2: ( RULE_ID )
            // InternalOntoL.g:6587:3: RULE_ID
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
    // InternalOntoL.g:6596:1: rule__Individual__InstantiatedClassesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Individual__InstantiatedClassesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6600:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6601:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6601:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6602:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesOntoLClassCrossReference_2_1_0()); 
            // InternalOntoL.g:6603:3: ( ruleQualifiedName )
            // InternalOntoL.g:6604:4: ruleQualifiedName
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
    // InternalOntoL.g:6615:1: rule__Individual__InstantiatedClassesAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Individual__InstantiatedClassesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6619:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6620:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6620:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6621:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesOntoLClassCrossReference_2_2_1_0()); 
            // InternalOntoL.g:6622:3: ( ruleQualifiedName )
            // InternalOntoL.g:6623:4: ruleQualifiedName
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
    // InternalOntoL.g:6634:1: rule__Individual__AttAssignmentsAssignment_3_1_0 : ( ruleAttributeAssignment ) ;
    public final void rule__Individual__AttAssignmentsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6638:1: ( ( ruleAttributeAssignment ) )
            // InternalOntoL.g:6639:2: ( ruleAttributeAssignment )
            {
            // InternalOntoL.g:6639:2: ( ruleAttributeAssignment )
            // InternalOntoL.g:6640:3: ruleAttributeAssignment
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
    // InternalOntoL.g:6649:1: rule__Individual__RefAssignmentsAssignment_3_1_1 : ( ruleReferenceAssignment ) ;
    public final void rule__Individual__RefAssignmentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6653:1: ( ( ruleReferenceAssignment ) )
            // InternalOntoL.g:6654:2: ( ruleReferenceAssignment )
            {
            // InternalOntoL.g:6654:2: ( ruleReferenceAssignment )
            // InternalOntoL.g:6655:3: ruleReferenceAssignment
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
    // InternalOntoL.g:6664:1: rule__OntoLClass__AttributesAssignment_1_1_0 : ( ruleAttribute ) ;
    public final void rule__OntoLClass__AttributesAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6668:1: ( ( ruleAttribute ) )
            // InternalOntoL.g:6669:2: ( ruleAttribute )
            {
            // InternalOntoL.g:6669:2: ( ruleAttribute )
            // InternalOntoL.g:6670:3: ruleAttribute
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


    // $ANTLR start "rule__OntoLClass__AttAssignmentsAssignment_1_1_1"
    // InternalOntoL.g:6679:1: rule__OntoLClass__AttAssignmentsAssignment_1_1_1 : ( ruleAttributeAssignment ) ;
    public final void rule__OntoLClass__AttAssignmentsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6683:1: ( ( ruleAttributeAssignment ) )
            // InternalOntoL.g:6684:2: ( ruleAttributeAssignment )
            {
            // InternalOntoL.g:6684:2: ( ruleAttributeAssignment )
            // InternalOntoL.g:6685:3: ruleAttributeAssignment
            {
             before(grammarAccess.getOntoLClassAccess().getAttAssignmentsAttributeAssignmentParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeAssignment();

            state._fsp--;

             after(grammarAccess.getOntoLClassAccess().getAttAssignmentsAttributeAssignmentParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__AttAssignmentsAssignment_1_1_1"


    // $ANTLR start "rule__OntoLClass__ReferencesAssignment_1_1_2"
    // InternalOntoL.g:6694:1: rule__OntoLClass__ReferencesAssignment_1_1_2 : ( ruleReference ) ;
    public final void rule__OntoLClass__ReferencesAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6698:1: ( ( ruleReference ) )
            // InternalOntoL.g:6699:2: ( ruleReference )
            {
            // InternalOntoL.g:6699:2: ( ruleReference )
            // InternalOntoL.g:6700:3: ruleReference
            {
             before(grammarAccess.getOntoLClassAccess().getReferencesReferenceParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getOntoLClassAccess().getReferencesReferenceParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__ReferencesAssignment_1_1_2"


    // $ANTLR start "rule__OntoLClass__RefAssignmentsAssignment_1_1_3"
    // InternalOntoL.g:6709:1: rule__OntoLClass__RefAssignmentsAssignment_1_1_3 : ( ruleReferenceAssignment ) ;
    public final void rule__OntoLClass__RefAssignmentsAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6713:1: ( ( ruleReferenceAssignment ) )
            // InternalOntoL.g:6714:2: ( ruleReferenceAssignment )
            {
            // InternalOntoL.g:6714:2: ( ruleReferenceAssignment )
            // InternalOntoL.g:6715:3: ruleReferenceAssignment
            {
             before(grammarAccess.getOntoLClassAccess().getRefAssignmentsReferenceAssignmentParserRuleCall_1_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReferenceAssignment();

            state._fsp--;

             after(grammarAccess.getOntoLClassAccess().getRefAssignmentsReferenceAssignmentParserRuleCall_1_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoLClass__RefAssignmentsAssignment_1_1_3"


    // $ANTLR start "rule__OrderlessClass__NameAssignment_2"
    // InternalOntoL.g:6724:1: rule__OrderlessClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OrderlessClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6728:1: ( ( RULE_ID ) )
            // InternalOntoL.g:6729:2: ( RULE_ID )
            {
            // InternalOntoL.g:6729:2: ( RULE_ID )
            // InternalOntoL.g:6730:3: RULE_ID
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
    // InternalOntoL.g:6739:1: rule__OrderlessClass__InstantiatedClassesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__InstantiatedClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6743:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6744:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6744:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6745:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_1_0()); 
            // InternalOntoL.g:6746:3: ( ruleQualifiedName )
            // InternalOntoL.g:6747:4: ruleQualifiedName
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
    // InternalOntoL.g:6758:1: rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6762:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6763:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6763:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6764:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_2_1_0()); 
            // InternalOntoL.g:6765:3: ( ruleQualifiedName )
            // InternalOntoL.g:6766:4: ruleQualifiedName
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
    // InternalOntoL.g:6777:1: rule__OrderlessClass__SuperClassesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__SuperClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6781:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6782:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6782:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6783:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getSuperClassesOntoLClassCrossReference_4_1_0()); 
            // InternalOntoL.g:6784:3: ( ruleQualifiedName )
            // InternalOntoL.g:6785:4: ruleQualifiedName
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
    // InternalOntoL.g:6796:1: rule__OrderlessClass__SuperClassesAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__SuperClassesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6800:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6801:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6801:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6802:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getSuperClassesOntoLClassCrossReference_4_2_1_0()); 
            // InternalOntoL.g:6803:3: ( ruleQualifiedName )
            // InternalOntoL.g:6804:4: ruleQualifiedName
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
    // InternalOntoL.g:6815:1: rule__OrderlessClass__SubordinatorsAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__SubordinatorsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6819:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6820:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6820:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6821:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatorsOntoLClassCrossReference_5_1_0()); 
            // InternalOntoL.g:6822:3: ( ruleQualifiedName )
            // InternalOntoL.g:6823:4: ruleQualifiedName
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
    // InternalOntoL.g:6834:1: rule__OrderlessClass__SubordinatorsAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__SubordinatorsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6838:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6839:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6839:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6840:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatorsOntoLClassCrossReference_5_2_1_0()); 
            // InternalOntoL.g:6841:3: ( ruleQualifiedName )
            // InternalOntoL.g:6842:4: ruleQualifiedName
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
    // InternalOntoL.g:6853:1: rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 : ( ruleCategorizationType ) ;
    public final void rule__OrderlessClass__CategorizationTypeAssignment_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6857:1: ( ( ruleCategorizationType ) )
            // InternalOntoL.g:6858:2: ( ruleCategorizationType )
            {
            // InternalOntoL.g:6858:2: ( ruleCategorizationType )
            // InternalOntoL.g:6859:3: ruleCategorizationType
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
    // InternalOntoL.g:6868:1: rule__OrderlessClass__BasetypeAssignment_6_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__BasetypeAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6872:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6873:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6873:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6874:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getBasetypeOntoLClassCrossReference_6_0_1_0()); 
            // InternalOntoL.g:6875:3: ( ruleQualifiedName )
            // InternalOntoL.g:6876:4: ruleQualifiedName
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
    // InternalOntoL.g:6887:1: rule__OrderlessClass__PowertypeOfAssignment_6_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__PowertypeOfAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6891:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6892:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6892:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6893:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getPowertypeOfOntoLClassCrossReference_6_1_1_0()); 
            // InternalOntoL.g:6894:3: ( ruleQualifiedName )
            // InternalOntoL.g:6895:4: ruleQualifiedName
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
    // InternalOntoL.g:6906:1: rule__FOClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FOClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6910:1: ( ( RULE_ID ) )
            // InternalOntoL.g:6911:2: ( RULE_ID )
            {
            // InternalOntoL.g:6911:2: ( RULE_ID )
            // InternalOntoL.g:6912:3: RULE_ID
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
    // InternalOntoL.g:6921:1: rule__FOClass__InstantiatedClassesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__InstantiatedClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6925:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6926:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6926:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6927:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_1_0()); 
            // InternalOntoL.g:6928:3: ( ruleQualifiedName )
            // InternalOntoL.g:6929:4: ruleQualifiedName
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
    // InternalOntoL.g:6940:1: rule__FOClass__InstantiatedClassesAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__InstantiatedClassesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6944:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6945:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6945:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6946:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_2_1_0()); 
            // InternalOntoL.g:6947:3: ( ruleQualifiedName )
            // InternalOntoL.g:6948:4: ruleQualifiedName
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
    // InternalOntoL.g:6959:1: rule__FOClass__SuperClassesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__SuperClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6963:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6964:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6964:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6965:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesOntoLClassCrossReference_4_1_0()); 
            // InternalOntoL.g:6966:3: ( ruleQualifiedName )
            // InternalOntoL.g:6967:4: ruleQualifiedName
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
    // InternalOntoL.g:6978:1: rule__FOClass__SuperClassesAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__SuperClassesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6982:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6983:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6983:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6984:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesOntoLClassCrossReference_4_2_1_0()); 
            // InternalOntoL.g:6985:3: ( ruleQualifiedName )
            // InternalOntoL.g:6986:4: ruleQualifiedName
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
    // InternalOntoL.g:6997:1: rule__HOClass__OrderAssignment_1 : ( RULE_INT ) ;
    public final void rule__HOClass__OrderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7001:1: ( ( RULE_INT ) )
            // InternalOntoL.g:7002:2: ( RULE_INT )
            {
            // InternalOntoL.g:7002:2: ( RULE_INT )
            // InternalOntoL.g:7003:3: RULE_INT
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
    // InternalOntoL.g:7012:1: rule__HOClass__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__HOClass__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7016:1: ( ( RULE_ID ) )
            // InternalOntoL.g:7017:2: ( RULE_ID )
            {
            // InternalOntoL.g:7017:2: ( RULE_ID )
            // InternalOntoL.g:7018:3: RULE_ID
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
    // InternalOntoL.g:7027:1: rule__HOClass__InstantiatedClassesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__InstantiatedClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7031:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7032:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7032:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7033:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getInstantiatedClassesOntoLClassCrossReference_4_1_0()); 
            // InternalOntoL.g:7034:3: ( ruleQualifiedName )
            // InternalOntoL.g:7035:4: ruleQualifiedName
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
    // InternalOntoL.g:7046:1: rule__HOClass__InstantiatedClassesAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__InstantiatedClassesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7050:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7051:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7051:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7052:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getInstantiatedClassesOntoLClassCrossReference_4_2_1_0()); 
            // InternalOntoL.g:7053:3: ( ruleQualifiedName )
            // InternalOntoL.g:7054:4: ruleQualifiedName
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
    // InternalOntoL.g:7065:1: rule__HOClass__SuperClassesAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SuperClassesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7069:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7070:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7070:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7071:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesOntoLClassCrossReference_5_1_0()); 
            // InternalOntoL.g:7072:3: ( ruleQualifiedName )
            // InternalOntoL.g:7073:4: ruleQualifiedName
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
    // InternalOntoL.g:7084:1: rule__HOClass__SuperClassesAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SuperClassesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7088:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7089:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7089:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7090:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesOntoLClassCrossReference_5_2_1_0()); 
            // InternalOntoL.g:7091:3: ( ruleQualifiedName )
            // InternalOntoL.g:7092:4: ruleQualifiedName
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
    // InternalOntoL.g:7103:1: rule__HOClass__SubordinatorsAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SubordinatorsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7107:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7108:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7108:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7109:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsOntoLClassCrossReference_6_1_0()); 
            // InternalOntoL.g:7110:3: ( ruleQualifiedName )
            // InternalOntoL.g:7111:4: ruleQualifiedName
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
    // InternalOntoL.g:7122:1: rule__HOClass__SubordinatorsAssignment_6_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SubordinatorsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7126:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7127:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7127:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7128:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsOntoLClassCrossReference_6_2_1_0()); 
            // InternalOntoL.g:7129:3: ( ruleQualifiedName )
            // InternalOntoL.g:7130:4: ruleQualifiedName
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
    // InternalOntoL.g:7141:1: rule__HOClass__CategorizationTypeAssignment_7_0_0 : ( ruleCategorizationType ) ;
    public final void rule__HOClass__CategorizationTypeAssignment_7_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7145:1: ( ( ruleCategorizationType ) )
            // InternalOntoL.g:7146:2: ( ruleCategorizationType )
            {
            // InternalOntoL.g:7146:2: ( ruleCategorizationType )
            // InternalOntoL.g:7147:3: ruleCategorizationType
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
    // InternalOntoL.g:7156:1: rule__HOClass__BasetypeAssignment_7_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__BasetypeAssignment_7_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7160:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7161:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7161:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7162:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getBasetypeOntoLClassCrossReference_7_0_1_0()); 
            // InternalOntoL.g:7163:3: ( ruleQualifiedName )
            // InternalOntoL.g:7164:4: ruleQualifiedName
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
    // InternalOntoL.g:7175:1: rule__HOClass__PowertypeOfAssignment_7_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__PowertypeOfAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7179:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7180:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7180:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7181:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getPowertypeOfOntoLClassCrossReference_7_1_1_0()); 
            // InternalOntoL.g:7182:3: ( ruleQualifiedName )
            // InternalOntoL.g:7183:4: ruleQualifiedName
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
    // InternalOntoL.g:7194:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7198:1: ( ( RULE_ID ) )
            // InternalOntoL.g:7199:2: ( RULE_ID )
            {
            // InternalOntoL.g:7199:2: ( RULE_ID )
            // InternalOntoL.g:7200:3: RULE_ID
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
    // InternalOntoL.g:7209:1: rule__Attribute__LowerBoundAssignment_3_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__Attribute__LowerBoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7213:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:7214:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:7214:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:7215:3: ruleELEMENTBOUND
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
    // InternalOntoL.g:7224:1: rule__Attribute__UpperBoundAssignment_3_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__Attribute__UpperBoundAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7228:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:7229:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:7229:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:7230:3: ruleELEMENTBOUND
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


    // $ANTLR start "rule__Attribute__PropertyClassAssignment_4"
    // InternalOntoL.g:7239:1: rule__Attribute__PropertyClassAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__PropertyClassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7243:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7244:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7244:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7245:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getPropertyClassOntoLClassCrossReference_4_0()); 
            // InternalOntoL.g:7246:3: ( ruleQualifiedName )
            // InternalOntoL.g:7247:4: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAccess().getPropertyClassOntoLClassQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getPropertyClassOntoLClassQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getPropertyClassOntoLClassCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__PropertyClassAssignment_4"


    // $ANTLR start "rule__Attribute__SubsetOfAssignment_5_1"
    // InternalOntoL.g:7258:1: rule__Attribute__SubsetOfAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__SubsetOfAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7262:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7263:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7263:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7264:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_1_0()); 
            // InternalOntoL.g:7265:3: ( ruleQualifiedName )
            // InternalOntoL.g:7266:4: ruleQualifiedName
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
    // InternalOntoL.g:7277:1: rule__Attribute__SubsetOfAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__SubsetOfAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7281:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7282:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7282:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7283:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_2_1_0()); 
            // InternalOntoL.g:7284:3: ( ruleQualifiedName )
            // InternalOntoL.g:7285:4: ruleQualifiedName
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


    // $ANTLR start "rule__Reference__NameAssignment_1"
    // InternalOntoL.g:7296:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7300:1: ( ( RULE_ID ) )
            // InternalOntoL.g:7301:2: ( RULE_ID )
            {
            // InternalOntoL.g:7301:2: ( RULE_ID )
            // InternalOntoL.g:7302:3: RULE_ID
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
    // InternalOntoL.g:7311:1: rule__Reference__LowerBoundAssignment_3_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__Reference__LowerBoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7315:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:7316:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:7316:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:7317:3: ruleELEMENTBOUND
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
    // InternalOntoL.g:7326:1: rule__Reference__UpperBoundAssignment_3_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__Reference__UpperBoundAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7330:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:7331:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:7331:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:7332:3: ruleELEMENTBOUND
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


    // $ANTLR start "rule__Reference__PropertyClassAssignment_4"
    // InternalOntoL.g:7341:1: rule__Reference__PropertyClassAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__PropertyClassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7345:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7346:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7346:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7347:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getPropertyClassOntoLClassCrossReference_4_0()); 
            // InternalOntoL.g:7348:3: ( ruleQualifiedName )
            // InternalOntoL.g:7349:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAccess().getPropertyClassOntoLClassQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getPropertyClassOntoLClassQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getPropertyClassOntoLClassCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__PropertyClassAssignment_4"


    // $ANTLR start "rule__Reference__SubsetOfAssignment_5_1"
    // InternalOntoL.g:7360:1: rule__Reference__SubsetOfAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__SubsetOfAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7364:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7365:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7365:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7366:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_1_0()); 
            // InternalOntoL.g:7367:3: ( ruleQualifiedName )
            // InternalOntoL.g:7368:4: ruleQualifiedName
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
    // InternalOntoL.g:7379:1: rule__Reference__SubsetOfAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__SubsetOfAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7383:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7384:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7384:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7385:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_2_1_0()); 
            // InternalOntoL.g:7386:3: ( ruleQualifiedName )
            // InternalOntoL.g:7387:4: ruleQualifiedName
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
    // InternalOntoL.g:7398:1: rule__Reference__OppositeToAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__OppositeToAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7402:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7403:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7403:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7404:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getOppositeToReferenceCrossReference_6_1_0()); 
            // InternalOntoL.g:7405:3: ( ruleQualifiedName )
            // InternalOntoL.g:7406:4: ruleQualifiedName
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


    // $ANTLR start "rule__AttributeAssignment__AttributeAssignment_1"
    // InternalOntoL.g:7417:1: rule__AttributeAssignment__AttributeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AttributeAssignment__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7421:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7422:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7422:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7423:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalOntoL.g:7424:3: ( ruleQualifiedName )
            // InternalOntoL.g:7425:4: ruleQualifiedName
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
    // InternalOntoL.g:7436:1: rule__AttributeAssignment__AssignmentsAssignment_3_0 : ( ruleDataValue ) ;
    public final void rule__AttributeAssignment__AssignmentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7440:1: ( ( ruleDataValue ) )
            // InternalOntoL.g:7441:2: ( ruleDataValue )
            {
            // InternalOntoL.g:7441:2: ( ruleDataValue )
            // InternalOntoL.g:7442:3: ruleDataValue
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
    // InternalOntoL.g:7451:1: rule__AttributeAssignment__AssignmentsAssignment_3_1_1 : ( ruleDataValue ) ;
    public final void rule__AttributeAssignment__AssignmentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7455:1: ( ( ruleDataValue ) )
            // InternalOntoL.g:7456:2: ( ruleDataValue )
            {
            // InternalOntoL.g:7456:2: ( ruleDataValue )
            // InternalOntoL.g:7457:3: ruleDataValue
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
    // InternalOntoL.g:7466:1: rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 : ( ruleDataValue ) ;
    public final void rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7470:1: ( ( ruleDataValue ) )
            // InternalOntoL.g:7471:2: ( ruleDataValue )
            {
            // InternalOntoL.g:7471:2: ( ruleDataValue )
            // InternalOntoL.g:7472:3: ruleDataValue
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
    // InternalOntoL.g:7481:1: rule__SimpleAttributeAssignment__AttributeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SimpleAttributeAssignment__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7485:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7486:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7486:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7487:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAttributeAttributeCrossReference_0_0()); 
            // InternalOntoL.g:7488:3: ( ruleQualifiedName )
            // InternalOntoL.g:7489:4: ruleQualifiedName
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
    // InternalOntoL.g:7500:1: rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0 : ( ruleDataValue ) ;
    public final void rule__SimpleAttributeAssignment__AssignmentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7504:1: ( ( ruleDataValue ) )
            // InternalOntoL.g:7505:2: ( ruleDataValue )
            {
            // InternalOntoL.g:7505:2: ( ruleDataValue )
            // InternalOntoL.g:7506:3: ruleDataValue
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
    // InternalOntoL.g:7515:1: rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1 : ( ruleDataValue ) ;
    public final void rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7519:1: ( ( ruleDataValue ) )
            // InternalOntoL.g:7520:2: ( ruleDataValue )
            {
            // InternalOntoL.g:7520:2: ( ruleDataValue )
            // InternalOntoL.g:7521:3: ruleDataValue
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
    // InternalOntoL.g:7530:1: rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1 : ( ruleDataValue ) ;
    public final void rule__SimpleAttributeAssignment__AssignmentsAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7534:1: ( ( ruleDataValue ) )
            // InternalOntoL.g:7535:2: ( ruleDataValue )
            {
            // InternalOntoL.g:7535:2: ( ruleDataValue )
            // InternalOntoL.g:7536:3: ruleDataValue
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
    // InternalOntoL.g:7545:1: rule__ReferenceAssignment__ReferenceAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7549:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7550:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7550:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7551:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getReferenceReferenceCrossReference_1_0()); 
            // InternalOntoL.g:7552:3: ( ruleQualifiedName )
            // InternalOntoL.g:7553:4: ruleQualifiedName
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
    // InternalOntoL.g:7564:1: rule__ReferenceAssignment__AssignmentsAssignment_3_0 : ( ruleReferenceValue ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7568:1: ( ( ruleReferenceValue ) )
            // InternalOntoL.g:7569:2: ( ruleReferenceValue )
            {
            // InternalOntoL.g:7569:2: ( ruleReferenceValue )
            // InternalOntoL.g:7570:3: ruleReferenceValue
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsReferenceValueParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleReferenceValue();

            state._fsp--;

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsReferenceValueParserRuleCall_3_0_0()); 

            }


            }

        }
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
    // InternalOntoL.g:7579:1: rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 : ( ruleReferenceValue ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7583:1: ( ( ruleReferenceValue ) )
            // InternalOntoL.g:7584:2: ( ruleReferenceValue )
            {
            // InternalOntoL.g:7584:2: ( ruleReferenceValue )
            // InternalOntoL.g:7585:3: ruleReferenceValue
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsReferenceValueParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReferenceValue();

            state._fsp--;

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsReferenceValueParserRuleCall_3_1_1_0()); 

            }


            }

        }
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
    // InternalOntoL.g:7594:1: rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 : ( ruleReferenceValue ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7598:1: ( ( ruleReferenceValue ) )
            // InternalOntoL.g:7599:2: ( ruleReferenceValue )
            {
            // InternalOntoL.g:7599:2: ( ruleReferenceValue )
            // InternalOntoL.g:7600:3: ruleReferenceValue
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsReferenceValueParserRuleCall_3_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReferenceValue();

            state._fsp--;

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsReferenceValueParserRuleCall_3_1_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ReferenceValue__ValueAssignment"
    // InternalOntoL.g:7609:1: rule__ReferenceValue__ValueAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7613:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7614:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7614:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7615:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceValueAccess().getValueEntityDeclarationCrossReference_0()); 
            // InternalOntoL.g:7616:3: ( ruleQualifiedName )
            // InternalOntoL.g:7617:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceValueAccess().getValueEntityDeclarationQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceValueAccess().getValueEntityDeclarationQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getReferenceValueAccess().getValueEntityDeclarationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceValue__ValueAssignment"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalOntoL.g:7628:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7632:1: ( ( RULE_STRING ) )
            // InternalOntoL.g:7633:2: ( RULE_STRING )
            {
            // InternalOntoL.g:7633:2: ( RULE_STRING )
            // InternalOntoL.g:7634:3: RULE_STRING
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
    // InternalOntoL.g:7643:1: rule__NumberValue__ValueAssignment : ( ruleNUMBER ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7647:1: ( ( ruleNUMBER ) )
            // InternalOntoL.g:7648:2: ( ruleNUMBER )
            {
            // InternalOntoL.g:7648:2: ( ruleNUMBER )
            // InternalOntoL.g:7649:3: ruleNUMBER
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
    // InternalOntoL.g:7658:1: rule__BooleanValue__ValueAssignment : ( ruleBOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7662:1: ( ( ruleBOOLEAN ) )
            // InternalOntoL.g:7663:2: ( ruleBOOLEAN )
            {
            // InternalOntoL.g:7663:2: ( ruleBOOLEAN )
            // InternalOntoL.g:7664:3: ruleBOOLEAN
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
    // InternalOntoL.g:7673:1: rule__ComplexDataValue__ValueAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ComplexDataValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7677:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7678:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7678:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7679:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getComplexDataValueAccess().getValueIndividualCrossReference_0_0()); 
            // InternalOntoL.g:7680:3: ( ruleQualifiedName )
            // InternalOntoL.g:7681:4: ruleQualifiedName
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
    // InternalOntoL.g:7692:1: rule__ComplexDataValue__UnnamedValueAssignment_1 : ( ruleUnamedIndividual ) ;
    public final void rule__ComplexDataValue__UnnamedValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7696:1: ( ( ruleUnamedIndividual ) )
            // InternalOntoL.g:7697:2: ( ruleUnamedIndividual )
            {
            // InternalOntoL.g:7697:2: ( ruleUnamedIndividual )
            // InternalOntoL.g:7698:3: ruleUnamedIndividual
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
    // InternalOntoL.g:7707:1: rule__UnamedIndividual__AttAssignmentsAssignment_1 : ( ruleSimpleAttributeAssignment ) ;
    public final void rule__UnamedIndividual__AttAssignmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7711:1: ( ( ruleSimpleAttributeAssignment ) )
            // InternalOntoL.g:7712:2: ( ruleSimpleAttributeAssignment )
            {
            // InternalOntoL.g:7712:2: ( ruleSimpleAttributeAssignment )
            // InternalOntoL.g:7713:3: ruleSimpleAttributeAssignment
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
    // InternalOntoL.g:7722:1: rule__UnamedIndividual__AttAssignmentsAssignment_2_1 : ( ruleSimpleAttributeAssignment ) ;
    public final void rule__UnamedIndividual__AttAssignmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7726:1: ( ( ruleSimpleAttributeAssignment ) )
            // InternalOntoL.g:7727:2: ( ruleSimpleAttributeAssignment )
            {
            // InternalOntoL.g:7727:2: ( ruleSimpleAttributeAssignment )
            // InternalOntoL.g:7728:3: ruleSimpleAttributeAssignment
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
    // InternalOntoL.g:7737:1: rule__GeneralizationSet__IsDisjointAssignment_0_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7741:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoL.g:7742:2: ( ( 'disjoint' ) )
            {
            // InternalOntoL.g:7742:2: ( ( 'disjoint' ) )
            // InternalOntoL.g:7743:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 
            // InternalOntoL.g:7744:3: ( 'disjoint' )
            // InternalOntoL.g:7745:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalOntoL.g:7756:1: rule__GeneralizationSet__IsCompleteAssignment_0_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7760:1: ( ( ( 'complete' ) ) )
            // InternalOntoL.g:7761:2: ( ( 'complete' ) )
            {
            // InternalOntoL.g:7761:2: ( ( 'complete' ) )
            // InternalOntoL.g:7762:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 
            // InternalOntoL.g:7763:3: ( 'complete' )
            // InternalOntoL.g:7764:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalOntoL.g:7775:1: rule__GeneralizationSet__IsDisjointAssignment_0_2_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7779:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoL.g:7780:2: ( ( 'disjoint' ) )
            {
            // InternalOntoL.g:7780:2: ( ( 'disjoint' ) )
            // InternalOntoL.g:7781:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_2_0_0()); 
            // InternalOntoL.g:7782:3: ( 'disjoint' )
            // InternalOntoL.g:7783:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_2_0_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalOntoL.g:7794:1: rule__GeneralizationSet__IsCompleteAssignment_0_2_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7798:1: ( ( ( 'complete' ) ) )
            // InternalOntoL.g:7799:2: ( ( 'complete' ) )
            {
            // InternalOntoL.g:7799:2: ( ( 'complete' ) )
            // InternalOntoL.g:7800:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_2_1_0()); 
            // InternalOntoL.g:7801:3: ( 'complete' )
            // InternalOntoL.g:7802:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_2_1_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalOntoL.g:7813:1: rule__GeneralizationSet__IsCompleteAssignment_0_3_0 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7817:1: ( ( ( 'complete' ) ) )
            // InternalOntoL.g:7818:2: ( ( 'complete' ) )
            {
            // InternalOntoL.g:7818:2: ( ( 'complete' ) )
            // InternalOntoL.g:7819:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_3_0_0()); 
            // InternalOntoL.g:7820:3: ( 'complete' )
            // InternalOntoL.g:7821:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_3_0_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalOntoL.g:7832:1: rule__GeneralizationSet__IsDisjointAssignment_0_3_1 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7836:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoL.g:7837:2: ( ( 'disjoint' ) )
            {
            // InternalOntoL.g:7837:2: ( ( 'disjoint' ) )
            // InternalOntoL.g:7838:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_3_1_0()); 
            // InternalOntoL.g:7839:3: ( 'disjoint' )
            // InternalOntoL.g:7840:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_3_1_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalOntoL.g:7851:1: rule__GeneralizationSet__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GeneralizationSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7855:1: ( ( RULE_ID ) )
            // InternalOntoL.g:7856:2: ( RULE_ID )
            {
            // InternalOntoL.g:7856:2: ( RULE_ID )
            // InternalOntoL.g:7857:3: RULE_ID
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
    // InternalOntoL.g:7866:1: rule__GeneralizationSet__GeneralAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__GeneralAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7870:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7871:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7871:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7872:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralOntoLClassCrossReference_4_0()); 
            // InternalOntoL.g:7873:3: ( ruleQualifiedName )
            // InternalOntoL.g:7874:4: ruleQualifiedName
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
    // InternalOntoL.g:7885:1: rule__GeneralizationSet__CategorizerAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__CategorizerAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7889:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7890:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7890:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7891:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerOntoLClassCrossReference_5_1_0()); 
            // InternalOntoL.g:7892:3: ( ruleQualifiedName )
            // InternalOntoL.g:7893:4: ruleQualifiedName
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
    // InternalOntoL.g:7904:1: rule__GeneralizationSet__SpecificsAssignment_7 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__SpecificsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7908:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7909:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7909:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7910:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsOntoLClassCrossReference_7_0()); 
            // InternalOntoL.g:7911:3: ( ruleQualifiedName )
            // InternalOntoL.g:7912:4: ruleQualifiedName
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
    // InternalOntoL.g:7923:1: rule__GeneralizationSet__SpecificsAssignment_8_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__SpecificsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7927:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7928:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7928:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7929:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsOntoLClassCrossReference_8_1_0()); 
            // InternalOntoL.g:7930:3: ( ruleQualifiedName )
            // InternalOntoL.g:7931:4: ruleQualifiedName
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000C400C66300000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000C400C66200002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000021000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000021000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000038803C000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000C60000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000302000083070L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000302000003070L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008010000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000C400C66200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});

}
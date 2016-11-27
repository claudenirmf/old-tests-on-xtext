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


    // $ANTLR start "entryRuleReferenceAssignment"
    // InternalOntoL.g:428:1: entryRuleReferenceAssignment : ruleReferenceAssignment EOF ;
    public final void entryRuleReferenceAssignment() throws RecognitionException {
        try {
            // InternalOntoL.g:429:1: ( ruleReferenceAssignment EOF )
            // InternalOntoL.g:430:1: ruleReferenceAssignment EOF
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
    // InternalOntoL.g:437:1: ruleReferenceAssignment : ( ( rule__ReferenceAssignment__Group__0 ) ) ;
    public final void ruleReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:441:2: ( ( ( rule__ReferenceAssignment__Group__0 ) ) )
            // InternalOntoL.g:442:2: ( ( rule__ReferenceAssignment__Group__0 ) )
            {
            // InternalOntoL.g:442:2: ( ( rule__ReferenceAssignment__Group__0 ) )
            // InternalOntoL.g:443:3: ( rule__ReferenceAssignment__Group__0 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getGroup()); 
            // InternalOntoL.g:444:3: ( rule__ReferenceAssignment__Group__0 )
            // InternalOntoL.g:444:4: rule__ReferenceAssignment__Group__0
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
    // InternalOntoL.g:453:1: entryRuleDataValue : ruleDataValue EOF ;
    public final void entryRuleDataValue() throws RecognitionException {
        try {
            // InternalOntoL.g:454:1: ( ruleDataValue EOF )
            // InternalOntoL.g:455:1: ruleDataValue EOF
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
    // InternalOntoL.g:462:1: ruleDataValue : ( ( rule__DataValue__Alternatives ) ) ;
    public final void ruleDataValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:466:2: ( ( ( rule__DataValue__Alternatives ) ) )
            // InternalOntoL.g:467:2: ( ( rule__DataValue__Alternatives ) )
            {
            // InternalOntoL.g:467:2: ( ( rule__DataValue__Alternatives ) )
            // InternalOntoL.g:468:3: ( rule__DataValue__Alternatives )
            {
             before(grammarAccess.getDataValueAccess().getAlternatives()); 
            // InternalOntoL.g:469:3: ( rule__DataValue__Alternatives )
            // InternalOntoL.g:469:4: rule__DataValue__Alternatives
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
    // InternalOntoL.g:478:1: entryRuleReferenceValue : ruleReferenceValue EOF ;
    public final void entryRuleReferenceValue() throws RecognitionException {
        try {
            // InternalOntoL.g:479:1: ( ruleReferenceValue EOF )
            // InternalOntoL.g:480:1: ruleReferenceValue EOF
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
    // InternalOntoL.g:487:1: ruleReferenceValue : ( ( rule__ReferenceValue__ValueAssignment ) ) ;
    public final void ruleReferenceValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:491:2: ( ( ( rule__ReferenceValue__ValueAssignment ) ) )
            // InternalOntoL.g:492:2: ( ( rule__ReferenceValue__ValueAssignment ) )
            {
            // InternalOntoL.g:492:2: ( ( rule__ReferenceValue__ValueAssignment ) )
            // InternalOntoL.g:493:3: ( rule__ReferenceValue__ValueAssignment )
            {
             before(grammarAccess.getReferenceValueAccess().getValueAssignment()); 
            // InternalOntoL.g:494:3: ( rule__ReferenceValue__ValueAssignment )
            // InternalOntoL.g:494:4: rule__ReferenceValue__ValueAssignment
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
    // InternalOntoL.g:503:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalOntoL.g:504:1: ( ruleStringValue EOF )
            // InternalOntoL.g:505:1: ruleStringValue EOF
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
    // InternalOntoL.g:512:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:516:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalOntoL.g:517:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalOntoL.g:517:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalOntoL.g:518:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalOntoL.g:519:3: ( rule__StringValue__ValueAssignment )
            // InternalOntoL.g:519:4: rule__StringValue__ValueAssignment
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
    // InternalOntoL.g:528:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalOntoL.g:529:1: ( ruleNumberValue EOF )
            // InternalOntoL.g:530:1: ruleNumberValue EOF
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
    // InternalOntoL.g:537:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:541:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalOntoL.g:542:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalOntoL.g:542:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalOntoL.g:543:3: ( rule__NumberValue__ValueAssignment )
            {
             before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            // InternalOntoL.g:544:3: ( rule__NumberValue__ValueAssignment )
            // InternalOntoL.g:544:4: rule__NumberValue__ValueAssignment
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
    // InternalOntoL.g:553:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // InternalOntoL.g:554:1: ( ruleNUMBER EOF )
            // InternalOntoL.g:555:1: ruleNUMBER EOF
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
    // InternalOntoL.g:562:1: ruleNUMBER : ( ( rule__NUMBER__Group__0 ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:566:2: ( ( ( rule__NUMBER__Group__0 ) ) )
            // InternalOntoL.g:567:2: ( ( rule__NUMBER__Group__0 ) )
            {
            // InternalOntoL.g:567:2: ( ( rule__NUMBER__Group__0 ) )
            // InternalOntoL.g:568:3: ( rule__NUMBER__Group__0 )
            {
             before(grammarAccess.getNUMBERAccess().getGroup()); 
            // InternalOntoL.g:569:3: ( rule__NUMBER__Group__0 )
            // InternalOntoL.g:569:4: rule__NUMBER__Group__0
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
    // InternalOntoL.g:578:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalOntoL.g:579:1: ( ruleBooleanValue EOF )
            // InternalOntoL.g:580:1: ruleBooleanValue EOF
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
    // InternalOntoL.g:587:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:591:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalOntoL.g:592:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalOntoL.g:592:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalOntoL.g:593:3: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // InternalOntoL.g:594:3: ( rule__BooleanValue__ValueAssignment )
            // InternalOntoL.g:594:4: rule__BooleanValue__ValueAssignment
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
    // InternalOntoL.g:603:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // InternalOntoL.g:604:1: ( ruleBOOLEAN EOF )
            // InternalOntoL.g:605:1: ruleBOOLEAN EOF
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
    // InternalOntoL.g:612:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:616:2: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // InternalOntoL.g:617:2: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // InternalOntoL.g:617:2: ( ( rule__BOOLEAN__Alternatives ) )
            // InternalOntoL.g:618:3: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // InternalOntoL.g:619:3: ( rule__BOOLEAN__Alternatives )
            // InternalOntoL.g:619:4: rule__BOOLEAN__Alternatives
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
    // InternalOntoL.g:628:1: entryRuleNoneValue : ruleNoneValue EOF ;
    public final void entryRuleNoneValue() throws RecognitionException {
        try {
            // InternalOntoL.g:629:1: ( ruleNoneValue EOF )
            // InternalOntoL.g:630:1: ruleNoneValue EOF
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
    // InternalOntoL.g:637:1: ruleNoneValue : ( ( rule__NoneValue__Group__0 ) ) ;
    public final void ruleNoneValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:641:2: ( ( ( rule__NoneValue__Group__0 ) ) )
            // InternalOntoL.g:642:2: ( ( rule__NoneValue__Group__0 ) )
            {
            // InternalOntoL.g:642:2: ( ( rule__NoneValue__Group__0 ) )
            // InternalOntoL.g:643:3: ( rule__NoneValue__Group__0 )
            {
             before(grammarAccess.getNoneValueAccess().getGroup()); 
            // InternalOntoL.g:644:3: ( rule__NoneValue__Group__0 )
            // InternalOntoL.g:644:4: rule__NoneValue__Group__0
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


    // $ANTLR start "entryRuleGeneralizationSet"
    // InternalOntoL.g:653:1: entryRuleGeneralizationSet : ruleGeneralizationSet EOF ;
    public final void entryRuleGeneralizationSet() throws RecognitionException {
        try {
            // InternalOntoL.g:654:1: ( ruleGeneralizationSet EOF )
            // InternalOntoL.g:655:1: ruleGeneralizationSet EOF
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
    // InternalOntoL.g:662:1: ruleGeneralizationSet : ( ( rule__GeneralizationSet__Group__0 ) ) ;
    public final void ruleGeneralizationSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:666:2: ( ( ( rule__GeneralizationSet__Group__0 ) ) )
            // InternalOntoL.g:667:2: ( ( rule__GeneralizationSet__Group__0 ) )
            {
            // InternalOntoL.g:667:2: ( ( rule__GeneralizationSet__Group__0 ) )
            // InternalOntoL.g:668:3: ( rule__GeneralizationSet__Group__0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup()); 
            // InternalOntoL.g:669:3: ( rule__GeneralizationSet__Group__0 )
            // InternalOntoL.g:669:4: rule__GeneralizationSet__Group__0
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
    // InternalOntoL.g:678:1: ruleCategorizationType : ( ( rule__CategorizationType__Alternatives ) ) ;
    public final void ruleCategorizationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:682:1: ( ( ( rule__CategorizationType__Alternatives ) ) )
            // InternalOntoL.g:683:2: ( ( rule__CategorizationType__Alternatives ) )
            {
            // InternalOntoL.g:683:2: ( ( rule__CategorizationType__Alternatives ) )
            // InternalOntoL.g:684:3: ( rule__CategorizationType__Alternatives )
            {
             before(grammarAccess.getCategorizationTypeAccess().getAlternatives()); 
            // InternalOntoL.g:685:3: ( rule__CategorizationType__Alternatives )
            // InternalOntoL.g:685:4: rule__CategorizationType__Alternatives
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
    // InternalOntoL.g:693:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__Group_3_0__0 ) ) | ( ( rule__Model__ElementsAssignment_3_1 ) ) );
    public final void rule__Model__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:697:1: ( ( ( rule__Model__Group_3_0__0 ) ) | ( ( rule__Model__ElementsAssignment_3_1 ) ) )
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
                    // InternalOntoL.g:698:2: ( ( rule__Model__Group_3_0__0 ) )
                    {
                    // InternalOntoL.g:698:2: ( ( rule__Model__Group_3_0__0 ) )
                    // InternalOntoL.g:699:3: ( rule__Model__Group_3_0__0 )
                    {
                     before(grammarAccess.getModelAccess().getGroup_3_0()); 
                    // InternalOntoL.g:700:3: ( rule__Model__Group_3_0__0 )
                    // InternalOntoL.g:700:4: rule__Model__Group_3_0__0
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
                    // InternalOntoL.g:704:2: ( ( rule__Model__ElementsAssignment_3_1 ) )
                    {
                    // InternalOntoL.g:704:2: ( ( rule__Model__ElementsAssignment_3_1 ) )
                    // InternalOntoL.g:705:3: ( rule__Model__ElementsAssignment_3_1 )
                    {
                     before(grammarAccess.getModelAccess().getElementsAssignment_3_1()); 
                    // InternalOntoL.g:706:3: ( rule__Model__ElementsAssignment_3_1 )
                    // InternalOntoL.g:706:4: rule__Model__ElementsAssignment_3_1
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
    // InternalOntoL.g:714:1: rule__ModelElement__Alternatives_0 : ( ( ruleImport ) | ( ruleEntityDeclaration ) | ( ruleGeneralizationSet ) );
    public final void rule__ModelElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:718:1: ( ( ruleImport ) | ( ruleEntityDeclaration ) | ( ruleGeneralizationSet ) )
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
                    // InternalOntoL.g:719:2: ( ruleImport )
                    {
                    // InternalOntoL.g:719:2: ( ruleImport )
                    // InternalOntoL.g:720:3: ruleImport
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
                    // InternalOntoL.g:725:2: ( ruleEntityDeclaration )
                    {
                    // InternalOntoL.g:725:2: ( ruleEntityDeclaration )
                    // InternalOntoL.g:726:3: ruleEntityDeclaration
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
                    // InternalOntoL.g:731:2: ( ruleGeneralizationSet )
                    {
                    // InternalOntoL.g:731:2: ( ruleGeneralizationSet )
                    // InternalOntoL.g:732:3: ruleGeneralizationSet
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
    // InternalOntoL.g:741:1: rule__EntityDeclaration__Alternatives : ( ( ruleOntoLClass ) | ( ruleIndividual ) );
    public final void rule__EntityDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:745:1: ( ( ruleOntoLClass ) | ( ruleIndividual ) )
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
                    // InternalOntoL.g:746:2: ( ruleOntoLClass )
                    {
                    // InternalOntoL.g:746:2: ( ruleOntoLClass )
                    // InternalOntoL.g:747:3: ruleOntoLClass
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
                    // InternalOntoL.g:752:2: ( ruleIndividual )
                    {
                    // InternalOntoL.g:752:2: ( ruleIndividual )
                    // InternalOntoL.g:753:3: ruleIndividual
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
    // InternalOntoL.g:762:1: rule__Individual__Alternatives_3_1 : ( ( ( rule__Individual__AttAssignmentsAssignment_3_1_0 ) ) | ( ( rule__Individual__RefAssignmentsAssignment_3_1_1 ) ) );
    public final void rule__Individual__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:766:1: ( ( ( rule__Individual__AttAssignmentsAssignment_3_1_0 ) ) | ( ( rule__Individual__RefAssignmentsAssignment_3_1_1 ) ) )
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
                    // InternalOntoL.g:767:2: ( ( rule__Individual__AttAssignmentsAssignment_3_1_0 ) )
                    {
                    // InternalOntoL.g:767:2: ( ( rule__Individual__AttAssignmentsAssignment_3_1_0 ) )
                    // InternalOntoL.g:768:3: ( rule__Individual__AttAssignmentsAssignment_3_1_0 )
                    {
                     before(grammarAccess.getIndividualAccess().getAttAssignmentsAssignment_3_1_0()); 
                    // InternalOntoL.g:769:3: ( rule__Individual__AttAssignmentsAssignment_3_1_0 )
                    // InternalOntoL.g:769:4: rule__Individual__AttAssignmentsAssignment_3_1_0
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
                    // InternalOntoL.g:773:2: ( ( rule__Individual__RefAssignmentsAssignment_3_1_1 ) )
                    {
                    // InternalOntoL.g:773:2: ( ( rule__Individual__RefAssignmentsAssignment_3_1_1 ) )
                    // InternalOntoL.g:774:3: ( rule__Individual__RefAssignmentsAssignment_3_1_1 )
                    {
                     before(grammarAccess.getIndividualAccess().getRefAssignmentsAssignment_3_1_1()); 
                    // InternalOntoL.g:775:3: ( rule__Individual__RefAssignmentsAssignment_3_1_1 )
                    // InternalOntoL.g:775:4: rule__Individual__RefAssignmentsAssignment_3_1_1
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
    // InternalOntoL.g:783:1: rule__OntoLClass__Alternatives_0 : ( ( ruleOrderlessClass ) | ( ruleHOClass ) | ( ruleFOClass ) );
    public final void rule__OntoLClass__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:787:1: ( ( ruleOrderlessClass ) | ( ruleHOClass ) | ( ruleFOClass ) )
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
                    // InternalOntoL.g:788:2: ( ruleOrderlessClass )
                    {
                    // InternalOntoL.g:788:2: ( ruleOrderlessClass )
                    // InternalOntoL.g:789:3: ruleOrderlessClass
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
                    // InternalOntoL.g:794:2: ( ruleHOClass )
                    {
                    // InternalOntoL.g:794:2: ( ruleHOClass )
                    // InternalOntoL.g:795:3: ruleHOClass
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
                    // InternalOntoL.g:800:2: ( ruleFOClass )
                    {
                    // InternalOntoL.g:800:2: ( ruleFOClass )
                    // InternalOntoL.g:801:3: ruleFOClass
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
    // InternalOntoL.g:810:1: rule__OntoLClass__Alternatives_1_1 : ( ( ( rule__OntoLClass__AttributesAssignment_1_1_0 ) ) | ( ( rule__OntoLClass__AttAssignmentsAssignment_1_1_1 ) ) | ( ( rule__OntoLClass__ReferencesAssignment_1_1_2 ) ) | ( ( rule__OntoLClass__RefAssignmentsAssignment_1_1_3 ) ) );
    public final void rule__OntoLClass__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:814:1: ( ( ( rule__OntoLClass__AttributesAssignment_1_1_0 ) ) | ( ( rule__OntoLClass__AttAssignmentsAssignment_1_1_1 ) ) | ( ( rule__OntoLClass__ReferencesAssignment_1_1_2 ) ) | ( ( rule__OntoLClass__RefAssignmentsAssignment_1_1_3 ) ) )
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

                    if ( (LA6_4==27) ) {
                        alt6=3;
                    }
                    else if ( (LA6_4==23||LA6_4==43) ) {
                        alt6=4;
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
                    // InternalOntoL.g:815:2: ( ( rule__OntoLClass__AttributesAssignment_1_1_0 ) )
                    {
                    // InternalOntoL.g:815:2: ( ( rule__OntoLClass__AttributesAssignment_1_1_0 ) )
                    // InternalOntoL.g:816:3: ( rule__OntoLClass__AttributesAssignment_1_1_0 )
                    {
                     before(grammarAccess.getOntoLClassAccess().getAttributesAssignment_1_1_0()); 
                    // InternalOntoL.g:817:3: ( rule__OntoLClass__AttributesAssignment_1_1_0 )
                    // InternalOntoL.g:817:4: rule__OntoLClass__AttributesAssignment_1_1_0
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
                    // InternalOntoL.g:821:2: ( ( rule__OntoLClass__AttAssignmentsAssignment_1_1_1 ) )
                    {
                    // InternalOntoL.g:821:2: ( ( rule__OntoLClass__AttAssignmentsAssignment_1_1_1 ) )
                    // InternalOntoL.g:822:3: ( rule__OntoLClass__AttAssignmentsAssignment_1_1_1 )
                    {
                     before(grammarAccess.getOntoLClassAccess().getAttAssignmentsAssignment_1_1_1()); 
                    // InternalOntoL.g:823:3: ( rule__OntoLClass__AttAssignmentsAssignment_1_1_1 )
                    // InternalOntoL.g:823:4: rule__OntoLClass__AttAssignmentsAssignment_1_1_1
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
                    // InternalOntoL.g:827:2: ( ( rule__OntoLClass__ReferencesAssignment_1_1_2 ) )
                    {
                    // InternalOntoL.g:827:2: ( ( rule__OntoLClass__ReferencesAssignment_1_1_2 ) )
                    // InternalOntoL.g:828:3: ( rule__OntoLClass__ReferencesAssignment_1_1_2 )
                    {
                     before(grammarAccess.getOntoLClassAccess().getReferencesAssignment_1_1_2()); 
                    // InternalOntoL.g:829:3: ( rule__OntoLClass__ReferencesAssignment_1_1_2 )
                    // InternalOntoL.g:829:4: rule__OntoLClass__ReferencesAssignment_1_1_2
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
                    // InternalOntoL.g:833:2: ( ( rule__OntoLClass__RefAssignmentsAssignment_1_1_3 ) )
                    {
                    // InternalOntoL.g:833:2: ( ( rule__OntoLClass__RefAssignmentsAssignment_1_1_3 ) )
                    // InternalOntoL.g:834:3: ( rule__OntoLClass__RefAssignmentsAssignment_1_1_3 )
                    {
                     before(grammarAccess.getOntoLClassAccess().getRefAssignmentsAssignment_1_1_3()); 
                    // InternalOntoL.g:835:3: ( rule__OntoLClass__RefAssignmentsAssignment_1_1_3 )
                    // InternalOntoL.g:835:4: rule__OntoLClass__RefAssignmentsAssignment_1_1_3
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
    // InternalOntoL.g:843:1: rule__OrderlessClass__Alternatives_6 : ( ( ( rule__OrderlessClass__Group_6_0__0 ) ) | ( ( rule__OrderlessClass__Group_6_1__0 ) ) );
    public final void rule__OrderlessClass__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:847:1: ( ( ( rule__OrderlessClass__Group_6_0__0 ) ) | ( ( rule__OrderlessClass__Group_6_1__0 ) ) )
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
                    // InternalOntoL.g:848:2: ( ( rule__OrderlessClass__Group_6_0__0 ) )
                    {
                    // InternalOntoL.g:848:2: ( ( rule__OrderlessClass__Group_6_0__0 ) )
                    // InternalOntoL.g:849:3: ( rule__OrderlessClass__Group_6_0__0 )
                    {
                     before(grammarAccess.getOrderlessClassAccess().getGroup_6_0()); 
                    // InternalOntoL.g:850:3: ( rule__OrderlessClass__Group_6_0__0 )
                    // InternalOntoL.g:850:4: rule__OrderlessClass__Group_6_0__0
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
                    // InternalOntoL.g:854:2: ( ( rule__OrderlessClass__Group_6_1__0 ) )
                    {
                    // InternalOntoL.g:854:2: ( ( rule__OrderlessClass__Group_6_1__0 ) )
                    // InternalOntoL.g:855:3: ( rule__OrderlessClass__Group_6_1__0 )
                    {
                     before(grammarAccess.getOrderlessClassAccess().getGroup_6_1()); 
                    // InternalOntoL.g:856:3: ( rule__OrderlessClass__Group_6_1__0 )
                    // InternalOntoL.g:856:4: rule__OrderlessClass__Group_6_1__0
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
    // InternalOntoL.g:864:1: rule__HOClass__Alternatives_7 : ( ( ( rule__HOClass__Group_7_0__0 ) ) | ( ( rule__HOClass__Group_7_1__0 ) ) );
    public final void rule__HOClass__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:868:1: ( ( ( rule__HOClass__Group_7_0__0 ) ) | ( ( rule__HOClass__Group_7_1__0 ) ) )
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
                    // InternalOntoL.g:869:2: ( ( rule__HOClass__Group_7_0__0 ) )
                    {
                    // InternalOntoL.g:869:2: ( ( rule__HOClass__Group_7_0__0 ) )
                    // InternalOntoL.g:870:3: ( rule__HOClass__Group_7_0__0 )
                    {
                     before(grammarAccess.getHOClassAccess().getGroup_7_0()); 
                    // InternalOntoL.g:871:3: ( rule__HOClass__Group_7_0__0 )
                    // InternalOntoL.g:871:4: rule__HOClass__Group_7_0__0
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
                    // InternalOntoL.g:875:2: ( ( rule__HOClass__Group_7_1__0 ) )
                    {
                    // InternalOntoL.g:875:2: ( ( rule__HOClass__Group_7_1__0 ) )
                    // InternalOntoL.g:876:3: ( rule__HOClass__Group_7_1__0 )
                    {
                     before(grammarAccess.getHOClassAccess().getGroup_7_1()); 
                    // InternalOntoL.g:877:3: ( rule__HOClass__Group_7_1__0 )
                    // InternalOntoL.g:877:4: rule__HOClass__Group_7_1__0
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
    // InternalOntoL.g:885:1: rule__ELEMENTBOUND__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__ELEMENTBOUND__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:889:1: ( ( '*' ) | ( RULE_INT ) )
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
                    // InternalOntoL.g:890:2: ( '*' )
                    {
                    // InternalOntoL.g:890:2: ( '*' )
                    // InternalOntoL.g:891:3: '*'
                    {
                     before(grammarAccess.getELEMENTBOUNDAccess().getAsteriskKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getELEMENTBOUNDAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:896:2: ( RULE_INT )
                    {
                    // InternalOntoL.g:896:2: ( RULE_INT )
                    // InternalOntoL.g:897:3: RULE_INT
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
    // InternalOntoL.g:906:1: rule__AttributeAssignment__Alternatives_3 : ( ( ( rule__AttributeAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__AttributeAssignment__Group_3_1__0 ) ) );
    public final void rule__AttributeAssignment__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:910:1: ( ( ( rule__AttributeAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__AttributeAssignment__Group_3_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||LA10_0==RULE_STRING||(LA10_0>=12 && LA10_0<=13)||(LA10_0>=44 && LA10_0<=45)) ) {
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
                    // InternalOntoL.g:911:2: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_0 ) )
                    {
                    // InternalOntoL.g:911:2: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_0 ) )
                    // InternalOntoL.g:912:3: ( rule__AttributeAssignment__AssignmentsAssignment_3_0 )
                    {
                     before(grammarAccess.getAttributeAssignmentAccess().getAssignmentsAssignment_3_0()); 
                    // InternalOntoL.g:913:3: ( rule__AttributeAssignment__AssignmentsAssignment_3_0 )
                    // InternalOntoL.g:913:4: rule__AttributeAssignment__AssignmentsAssignment_3_0
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
                    // InternalOntoL.g:917:2: ( ( rule__AttributeAssignment__Group_3_1__0 ) )
                    {
                    // InternalOntoL.g:917:2: ( ( rule__AttributeAssignment__Group_3_1__0 ) )
                    // InternalOntoL.g:918:3: ( rule__AttributeAssignment__Group_3_1__0 )
                    {
                     before(grammarAccess.getAttributeAssignmentAccess().getGroup_3_1()); 
                    // InternalOntoL.g:919:3: ( rule__AttributeAssignment__Group_3_1__0 )
                    // InternalOntoL.g:919:4: rule__AttributeAssignment__Group_3_1__0
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


    // $ANTLR start "rule__ReferenceAssignment__Alternatives_3"
    // InternalOntoL.g:927:1: rule__ReferenceAssignment__Alternatives_3 : ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__ReferenceAssignment__Group_3_1__0 ) ) );
    public final void rule__ReferenceAssignment__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:931:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__ReferenceAssignment__Group_3_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
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
                    // InternalOntoL.g:932:2: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) )
                    {
                    // InternalOntoL.g:932:2: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) )
                    // InternalOntoL.g:933:3: ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 )
                    {
                     before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_0()); 
                    // InternalOntoL.g:934:3: ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 )
                    // InternalOntoL.g:934:4: rule__ReferenceAssignment__AssignmentsAssignment_3_0
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
                    // InternalOntoL.g:938:2: ( ( rule__ReferenceAssignment__Group_3_1__0 ) )
                    {
                    // InternalOntoL.g:938:2: ( ( rule__ReferenceAssignment__Group_3_1__0 ) )
                    // InternalOntoL.g:939:3: ( rule__ReferenceAssignment__Group_3_1__0 )
                    {
                     before(grammarAccess.getReferenceAssignmentAccess().getGroup_3_1()); 
                    // InternalOntoL.g:940:3: ( rule__ReferenceAssignment__Group_3_1__0 )
                    // InternalOntoL.g:940:4: rule__ReferenceAssignment__Group_3_1__0
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
    // InternalOntoL.g:948:1: rule__DataValue__Alternatives : ( ( ruleStringValue ) | ( ruleNumberValue ) | ( ruleBooleanValue ) | ( ruleNoneValue ) );
    public final void rule__DataValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:952:1: ( ( ruleStringValue ) | ( ruleNumberValue ) | ( ruleBooleanValue ) | ( ruleNoneValue ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt12=1;
                }
                break;
            case RULE_INT:
            case 44:
                {
                alt12=2;
                }
                break;
            case 12:
            case 13:
                {
                alt12=3;
                }
                break;
            case 45:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalOntoL.g:953:2: ( ruleStringValue )
                    {
                    // InternalOntoL.g:953:2: ( ruleStringValue )
                    // InternalOntoL.g:954:3: ruleStringValue
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
                    // InternalOntoL.g:959:2: ( ruleNumberValue )
                    {
                    // InternalOntoL.g:959:2: ( ruleNumberValue )
                    // InternalOntoL.g:960:3: ruleNumberValue
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
                    // InternalOntoL.g:965:2: ( ruleBooleanValue )
                    {
                    // InternalOntoL.g:965:2: ( ruleBooleanValue )
                    // InternalOntoL.g:966:3: ruleBooleanValue
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
                    // InternalOntoL.g:971:2: ( ruleNoneValue )
                    {
                    // InternalOntoL.g:971:2: ( ruleNoneValue )
                    // InternalOntoL.g:972:3: ruleNoneValue
                    {
                     before(grammarAccess.getDataValueAccess().getNoneValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNoneValue();

                    state._fsp--;

                     after(grammarAccess.getDataValueAccess().getNoneValueParserRuleCall_3()); 

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
    // InternalOntoL.g:981:1: rule__BOOLEAN__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:985:1: ( ( 'true' ) | ( 'false' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            else if ( (LA13_0==13) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalOntoL.g:986:2: ( 'true' )
                    {
                    // InternalOntoL.g:986:2: ( 'true' )
                    // InternalOntoL.g:987:3: 'true'
                    {
                     before(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:992:2: ( 'false' )
                    {
                    // InternalOntoL.g:992:2: ( 'false' )
                    // InternalOntoL.g:993:3: 'false'
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


    // $ANTLR start "rule__GeneralizationSet__Alternatives_0"
    // InternalOntoL.g:1002:1: rule__GeneralizationSet__Alternatives_0 : ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) | ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) | ( ( rule__GeneralizationSet__Group_0_2__0 ) ) | ( ( rule__GeneralizationSet__Group_0_3__0 ) ) );
    public final void rule__GeneralizationSet__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1006:1: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) | ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) | ( ( rule__GeneralizationSet__Group_0_2__0 ) ) | ( ( rule__GeneralizationSet__Group_0_3__0 ) ) )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==50) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==51) ) {
                    alt14=3;
                }
                else if ( (LA14_1==46) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA14_0==51) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==46) ) {
                    alt14=2;
                }
                else if ( (LA14_2==50) ) {
                    alt14=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalOntoL.g:1007:2: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) )
                    {
                    // InternalOntoL.g:1007:2: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) )
                    // InternalOntoL.g:1008:3: ( rule__GeneralizationSet__IsDisjointAssignment_0_0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_0()); 
                    // InternalOntoL.g:1009:3: ( rule__GeneralizationSet__IsDisjointAssignment_0_0 )
                    // InternalOntoL.g:1009:4: rule__GeneralizationSet__IsDisjointAssignment_0_0
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
                    // InternalOntoL.g:1013:2: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) )
                    {
                    // InternalOntoL.g:1013:2: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) )
                    // InternalOntoL.g:1014:3: ( rule__GeneralizationSet__IsCompleteAssignment_0_1 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_1()); 
                    // InternalOntoL.g:1015:3: ( rule__GeneralizationSet__IsCompleteAssignment_0_1 )
                    // InternalOntoL.g:1015:4: rule__GeneralizationSet__IsCompleteAssignment_0_1
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
                    // InternalOntoL.g:1019:2: ( ( rule__GeneralizationSet__Group_0_2__0 ) )
                    {
                    // InternalOntoL.g:1019:2: ( ( rule__GeneralizationSet__Group_0_2__0 ) )
                    // InternalOntoL.g:1020:3: ( rule__GeneralizationSet__Group_0_2__0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getGroup_0_2()); 
                    // InternalOntoL.g:1021:3: ( rule__GeneralizationSet__Group_0_2__0 )
                    // InternalOntoL.g:1021:4: rule__GeneralizationSet__Group_0_2__0
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
                    // InternalOntoL.g:1025:2: ( ( rule__GeneralizationSet__Group_0_3__0 ) )
                    {
                    // InternalOntoL.g:1025:2: ( ( rule__GeneralizationSet__Group_0_3__0 ) )
                    // InternalOntoL.g:1026:3: ( rule__GeneralizationSet__Group_0_3__0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getGroup_0_3()); 
                    // InternalOntoL.g:1027:3: ( rule__GeneralizationSet__Group_0_3__0 )
                    // InternalOntoL.g:1027:4: rule__GeneralizationSet__Group_0_3__0
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
    // InternalOntoL.g:1035:1: rule__CategorizationType__Alternatives : ( ( ( 'categorizes' ) ) | ( ( 'completecategorizes' ) ) | ( ( 'disjointcategorizes' ) ) | ( ( 'partitions' ) ) );
    public final void rule__CategorizationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1039:1: ( ( ( 'categorizes' ) ) | ( ( 'completecategorizes' ) ) | ( ( 'disjointcategorizes' ) ) | ( ( 'partitions' ) ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt15=1;
                }
                break;
            case 15:
                {
                alt15=2;
                }
                break;
            case 16:
                {
                alt15=3;
                }
                break;
            case 17:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalOntoL.g:1040:2: ( ( 'categorizes' ) )
                    {
                    // InternalOntoL.g:1040:2: ( ( 'categorizes' ) )
                    // InternalOntoL.g:1041:3: ( 'categorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0()); 
                    // InternalOntoL.g:1042:3: ( 'categorizes' )
                    // InternalOntoL.g:1042:4: 'categorizes'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1046:2: ( ( 'completecategorizes' ) )
                    {
                    // InternalOntoL.g:1046:2: ( ( 'completecategorizes' ) )
                    // InternalOntoL.g:1047:3: ( 'completecategorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1()); 
                    // InternalOntoL.g:1048:3: ( 'completecategorizes' )
                    // InternalOntoL.g:1048:4: 'completecategorizes'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:1052:2: ( ( 'disjointcategorizes' ) )
                    {
                    // InternalOntoL.g:1052:2: ( ( 'disjointcategorizes' ) )
                    // InternalOntoL.g:1053:3: ( 'disjointcategorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2()); 
                    // InternalOntoL.g:1054:3: ( 'disjointcategorizes' )
                    // InternalOntoL.g:1054:4: 'disjointcategorizes'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:1058:2: ( ( 'partitions' ) )
                    {
                    // InternalOntoL.g:1058:2: ( ( 'partitions' ) )
                    // InternalOntoL.g:1059:3: ( 'partitions' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getPARTITIONEREnumLiteralDeclaration_3()); 
                    // InternalOntoL.g:1060:3: ( 'partitions' )
                    // InternalOntoL.g:1060:4: 'partitions'
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
    // InternalOntoL.g:1068:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1072:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalOntoL.g:1073:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalOntoL.g:1080:1: rule__Model__Group__0__Impl : ( 'module' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1084:1: ( ( 'module' ) )
            // InternalOntoL.g:1085:1: ( 'module' )
            {
            // InternalOntoL.g:1085:1: ( 'module' )
            // InternalOntoL.g:1086:2: 'module'
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
    // InternalOntoL.g:1095:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1099:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalOntoL.g:1100:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalOntoL.g:1107:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1111:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalOntoL.g:1112:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalOntoL.g:1112:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalOntoL.g:1113:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalOntoL.g:1114:2: ( rule__Model__NameAssignment_1 )
            // InternalOntoL.g:1114:3: rule__Model__NameAssignment_1
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
    // InternalOntoL.g:1122:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1126:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalOntoL.g:1127:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalOntoL.g:1134:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1138:1: ( ( '{' ) )
            // InternalOntoL.g:1139:1: ( '{' )
            {
            // InternalOntoL.g:1139:1: ( '{' )
            // InternalOntoL.g:1140:2: '{'
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
    // InternalOntoL.g:1149:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1153:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalOntoL.g:1154:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalOntoL.g:1161:1: rule__Model__Group__3__Impl : ( ( rule__Model__Alternatives_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1165:1: ( ( ( rule__Model__Alternatives_3 )* ) )
            // InternalOntoL.g:1166:1: ( ( rule__Model__Alternatives_3 )* )
            {
            // InternalOntoL.g:1166:1: ( ( rule__Model__Alternatives_3 )* )
            // InternalOntoL.g:1167:2: ( rule__Model__Alternatives_3 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_3()); 
            // InternalOntoL.g:1168:2: ( rule__Model__Alternatives_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21||(LA16_0>=25 && LA16_0<=26)||(LA16_0>=29 && LA16_0<=30)||(LA16_0>=34 && LA16_0<=35)||LA16_0==46||(LA16_0>=50 && LA16_0<=51)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOntoL.g:1168:3: rule__Model__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalOntoL.g:1176:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1180:1: ( rule__Model__Group__4__Impl )
            // InternalOntoL.g:1181:2: rule__Model__Group__4__Impl
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
    // InternalOntoL.g:1187:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1191:1: ( ( '}' ) )
            // InternalOntoL.g:1192:1: ( '}' )
            {
            // InternalOntoL.g:1192:1: ( '}' )
            // InternalOntoL.g:1193:2: '}'
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
    // InternalOntoL.g:1203:1: rule__Model__Group_3_0__0 : rule__Model__Group_3_0__0__Impl rule__Model__Group_3_0__1 ;
    public final void rule__Model__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1207:1: ( rule__Model__Group_3_0__0__Impl rule__Model__Group_3_0__1 )
            // InternalOntoL.g:1208:2: rule__Model__Group_3_0__0__Impl rule__Model__Group_3_0__1
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
    // InternalOntoL.g:1215:1: rule__Model__Group_3_0__0__Impl : ( 'include' ) ;
    public final void rule__Model__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1219:1: ( ( 'include' ) )
            // InternalOntoL.g:1220:1: ( 'include' )
            {
            // InternalOntoL.g:1220:1: ( 'include' )
            // InternalOntoL.g:1221:2: 'include'
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
    // InternalOntoL.g:1230:1: rule__Model__Group_3_0__1 : rule__Model__Group_3_0__1__Impl rule__Model__Group_3_0__2 ;
    public final void rule__Model__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1234:1: ( rule__Model__Group_3_0__1__Impl rule__Model__Group_3_0__2 )
            // InternalOntoL.g:1235:2: rule__Model__Group_3_0__1__Impl rule__Model__Group_3_0__2
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
    // InternalOntoL.g:1242:1: rule__Model__Group_3_0__1__Impl : ( ( rule__Model__IncludesAssignment_3_0_1 ) ) ;
    public final void rule__Model__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1246:1: ( ( ( rule__Model__IncludesAssignment_3_0_1 ) ) )
            // InternalOntoL.g:1247:1: ( ( rule__Model__IncludesAssignment_3_0_1 ) )
            {
            // InternalOntoL.g:1247:1: ( ( rule__Model__IncludesAssignment_3_0_1 ) )
            // InternalOntoL.g:1248:2: ( rule__Model__IncludesAssignment_3_0_1 )
            {
             before(grammarAccess.getModelAccess().getIncludesAssignment_3_0_1()); 
            // InternalOntoL.g:1249:2: ( rule__Model__IncludesAssignment_3_0_1 )
            // InternalOntoL.g:1249:3: rule__Model__IncludesAssignment_3_0_1
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
    // InternalOntoL.g:1257:1: rule__Model__Group_3_0__2 : rule__Model__Group_3_0__2__Impl ;
    public final void rule__Model__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1261:1: ( rule__Model__Group_3_0__2__Impl )
            // InternalOntoL.g:1262:2: rule__Model__Group_3_0__2__Impl
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
    // InternalOntoL.g:1268:1: rule__Model__Group_3_0__2__Impl : ( ';' ) ;
    public final void rule__Model__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1272:1: ( ( ';' ) )
            // InternalOntoL.g:1273:1: ( ';' )
            {
            // InternalOntoL.g:1273:1: ( ';' )
            // InternalOntoL.g:1274:2: ';'
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
    // InternalOntoL.g:1284:1: rule__ModelElement__Group__0 : rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 ;
    public final void rule__ModelElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1288:1: ( rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 )
            // InternalOntoL.g:1289:2: rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1
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
    // InternalOntoL.g:1296:1: rule__ModelElement__Group__0__Impl : ( ( rule__ModelElement__Alternatives_0 ) ) ;
    public final void rule__ModelElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1300:1: ( ( ( rule__ModelElement__Alternatives_0 ) ) )
            // InternalOntoL.g:1301:1: ( ( rule__ModelElement__Alternatives_0 ) )
            {
            // InternalOntoL.g:1301:1: ( ( rule__ModelElement__Alternatives_0 ) )
            // InternalOntoL.g:1302:2: ( rule__ModelElement__Alternatives_0 )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives_0()); 
            // InternalOntoL.g:1303:2: ( rule__ModelElement__Alternatives_0 )
            // InternalOntoL.g:1303:3: rule__ModelElement__Alternatives_0
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
    // InternalOntoL.g:1311:1: rule__ModelElement__Group__1 : rule__ModelElement__Group__1__Impl ;
    public final void rule__ModelElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1315:1: ( rule__ModelElement__Group__1__Impl )
            // InternalOntoL.g:1316:2: rule__ModelElement__Group__1__Impl
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
    // InternalOntoL.g:1322:1: rule__ModelElement__Group__1__Impl : ( ';' ) ;
    public final void rule__ModelElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1326:1: ( ( ';' ) )
            // InternalOntoL.g:1327:1: ( ';' )
            {
            // InternalOntoL.g:1327:1: ( ';' )
            // InternalOntoL.g:1328:2: ';'
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
    // InternalOntoL.g:1338:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1342:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalOntoL.g:1343:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalOntoL.g:1350:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1354:1: ( ( RULE_ID ) )
            // InternalOntoL.g:1355:1: ( RULE_ID )
            {
            // InternalOntoL.g:1355:1: ( RULE_ID )
            // InternalOntoL.g:1356:2: RULE_ID
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
    // InternalOntoL.g:1365:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1369:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalOntoL.g:1370:2: rule__QualifiedName__Group__1__Impl
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
    // InternalOntoL.g:1376:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1380:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalOntoL.g:1381:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalOntoL.g:1381:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalOntoL.g:1382:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalOntoL.g:1383:2: ( rule__QualifiedName__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOntoL.g:1383:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalOntoL.g:1392:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1396:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalOntoL.g:1397:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalOntoL.g:1404:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1408:1: ( ( '.' ) )
            // InternalOntoL.g:1409:1: ( '.' )
            {
            // InternalOntoL.g:1409:1: ( '.' )
            // InternalOntoL.g:1410:2: '.'
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
    // InternalOntoL.g:1419:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1423:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalOntoL.g:1424:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalOntoL.g:1430:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1434:1: ( ( RULE_ID ) )
            // InternalOntoL.g:1435:1: ( RULE_ID )
            {
            // InternalOntoL.g:1435:1: ( RULE_ID )
            // InternalOntoL.g:1436:2: RULE_ID
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
    // InternalOntoL.g:1446:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1450:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalOntoL.g:1451:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalOntoL.g:1458:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1462:1: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:1463:1: ( ruleQualifiedName )
            {
            // InternalOntoL.g:1463:1: ( ruleQualifiedName )
            // InternalOntoL.g:1464:2: ruleQualifiedName
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
    // InternalOntoL.g:1473:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1477:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalOntoL.g:1478:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalOntoL.g:1484:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1488:1: ( ( ( '.*' )? ) )
            // InternalOntoL.g:1489:1: ( ( '.*' )? )
            {
            // InternalOntoL.g:1489:1: ( ( '.*' )? )
            // InternalOntoL.g:1490:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalOntoL.g:1491:2: ( '.*' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOntoL.g:1491:3: '.*'
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
    // InternalOntoL.g:1500:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1504:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalOntoL.g:1505:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalOntoL.g:1512:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1516:1: ( ( 'import' ) )
            // InternalOntoL.g:1517:1: ( 'import' )
            {
            // InternalOntoL.g:1517:1: ( 'import' )
            // InternalOntoL.g:1518:2: 'import'
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
    // InternalOntoL.g:1527:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1531:1: ( rule__Import__Group__1__Impl )
            // InternalOntoL.g:1532:2: rule__Import__Group__1__Impl
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
    // InternalOntoL.g:1538:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1542:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalOntoL.g:1543:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalOntoL.g:1543:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalOntoL.g:1544:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalOntoL.g:1545:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalOntoL.g:1545:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalOntoL.g:1554:1: rule__Individual__Group__0 : rule__Individual__Group__0__Impl rule__Individual__Group__1 ;
    public final void rule__Individual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1558:1: ( rule__Individual__Group__0__Impl rule__Individual__Group__1 )
            // InternalOntoL.g:1559:2: rule__Individual__Group__0__Impl rule__Individual__Group__1
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
    // InternalOntoL.g:1566:1: rule__Individual__Group__0__Impl : ( 'individual' ) ;
    public final void rule__Individual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1570:1: ( ( 'individual' ) )
            // InternalOntoL.g:1571:1: ( 'individual' )
            {
            // InternalOntoL.g:1571:1: ( 'individual' )
            // InternalOntoL.g:1572:2: 'individual'
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
    // InternalOntoL.g:1581:1: rule__Individual__Group__1 : rule__Individual__Group__1__Impl rule__Individual__Group__2 ;
    public final void rule__Individual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1585:1: ( rule__Individual__Group__1__Impl rule__Individual__Group__2 )
            // InternalOntoL.g:1586:2: rule__Individual__Group__1__Impl rule__Individual__Group__2
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
    // InternalOntoL.g:1593:1: rule__Individual__Group__1__Impl : ( ( rule__Individual__NameAssignment_1 ) ) ;
    public final void rule__Individual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1597:1: ( ( ( rule__Individual__NameAssignment_1 ) ) )
            // InternalOntoL.g:1598:1: ( ( rule__Individual__NameAssignment_1 ) )
            {
            // InternalOntoL.g:1598:1: ( ( rule__Individual__NameAssignment_1 ) )
            // InternalOntoL.g:1599:2: ( rule__Individual__NameAssignment_1 )
            {
             before(grammarAccess.getIndividualAccess().getNameAssignment_1()); 
            // InternalOntoL.g:1600:2: ( rule__Individual__NameAssignment_1 )
            // InternalOntoL.g:1600:3: rule__Individual__NameAssignment_1
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
    // InternalOntoL.g:1608:1: rule__Individual__Group__2 : rule__Individual__Group__2__Impl rule__Individual__Group__3 ;
    public final void rule__Individual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1612:1: ( rule__Individual__Group__2__Impl rule__Individual__Group__3 )
            // InternalOntoL.g:1613:2: rule__Individual__Group__2__Impl rule__Individual__Group__3
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
    // InternalOntoL.g:1620:1: rule__Individual__Group__2__Impl : ( ( rule__Individual__Group_2__0 )? ) ;
    public final void rule__Individual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1624:1: ( ( ( rule__Individual__Group_2__0 )? ) )
            // InternalOntoL.g:1625:1: ( ( rule__Individual__Group_2__0 )? )
            {
            // InternalOntoL.g:1625:1: ( ( rule__Individual__Group_2__0 )? )
            // InternalOntoL.g:1626:2: ( rule__Individual__Group_2__0 )?
            {
             before(grammarAccess.getIndividualAccess().getGroup_2()); 
            // InternalOntoL.g:1627:2: ( rule__Individual__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOntoL.g:1627:3: rule__Individual__Group_2__0
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
    // InternalOntoL.g:1635:1: rule__Individual__Group__3 : rule__Individual__Group__3__Impl ;
    public final void rule__Individual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1639:1: ( rule__Individual__Group__3__Impl )
            // InternalOntoL.g:1640:2: rule__Individual__Group__3__Impl
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
    // InternalOntoL.g:1646:1: rule__Individual__Group__3__Impl : ( ( rule__Individual__Group_3__0 )? ) ;
    public final void rule__Individual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1650:1: ( ( ( rule__Individual__Group_3__0 )? ) )
            // InternalOntoL.g:1651:1: ( ( rule__Individual__Group_3__0 )? )
            {
            // InternalOntoL.g:1651:1: ( ( rule__Individual__Group_3__0 )? )
            // InternalOntoL.g:1652:2: ( rule__Individual__Group_3__0 )?
            {
             before(grammarAccess.getIndividualAccess().getGroup_3()); 
            // InternalOntoL.g:1653:2: ( rule__Individual__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntoL.g:1653:3: rule__Individual__Group_3__0
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
    // InternalOntoL.g:1662:1: rule__Individual__Group_2__0 : rule__Individual__Group_2__0__Impl rule__Individual__Group_2__1 ;
    public final void rule__Individual__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1666:1: ( rule__Individual__Group_2__0__Impl rule__Individual__Group_2__1 )
            // InternalOntoL.g:1667:2: rule__Individual__Group_2__0__Impl rule__Individual__Group_2__1
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
    // InternalOntoL.g:1674:1: rule__Individual__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Individual__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1678:1: ( ( ':' ) )
            // InternalOntoL.g:1679:1: ( ':' )
            {
            // InternalOntoL.g:1679:1: ( ':' )
            // InternalOntoL.g:1680:2: ':'
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
    // InternalOntoL.g:1689:1: rule__Individual__Group_2__1 : rule__Individual__Group_2__1__Impl rule__Individual__Group_2__2 ;
    public final void rule__Individual__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1693:1: ( rule__Individual__Group_2__1__Impl rule__Individual__Group_2__2 )
            // InternalOntoL.g:1694:2: rule__Individual__Group_2__1__Impl rule__Individual__Group_2__2
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
    // InternalOntoL.g:1701:1: rule__Individual__Group_2__1__Impl : ( ( rule__Individual__InstantiatedClassesAssignment_2_1 ) ) ;
    public final void rule__Individual__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1705:1: ( ( ( rule__Individual__InstantiatedClassesAssignment_2_1 ) ) )
            // InternalOntoL.g:1706:1: ( ( rule__Individual__InstantiatedClassesAssignment_2_1 ) )
            {
            // InternalOntoL.g:1706:1: ( ( rule__Individual__InstantiatedClassesAssignment_2_1 ) )
            // InternalOntoL.g:1707:2: ( rule__Individual__InstantiatedClassesAssignment_2_1 )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesAssignment_2_1()); 
            // InternalOntoL.g:1708:2: ( rule__Individual__InstantiatedClassesAssignment_2_1 )
            // InternalOntoL.g:1708:3: rule__Individual__InstantiatedClassesAssignment_2_1
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
    // InternalOntoL.g:1716:1: rule__Individual__Group_2__2 : rule__Individual__Group_2__2__Impl ;
    public final void rule__Individual__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1720:1: ( rule__Individual__Group_2__2__Impl )
            // InternalOntoL.g:1721:2: rule__Individual__Group_2__2__Impl
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
    // InternalOntoL.g:1727:1: rule__Individual__Group_2__2__Impl : ( ( rule__Individual__Group_2_2__0 )* ) ;
    public final void rule__Individual__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1731:1: ( ( ( rule__Individual__Group_2_2__0 )* ) )
            // InternalOntoL.g:1732:1: ( ( rule__Individual__Group_2_2__0 )* )
            {
            // InternalOntoL.g:1732:1: ( ( rule__Individual__Group_2_2__0 )* )
            // InternalOntoL.g:1733:2: ( rule__Individual__Group_2_2__0 )*
            {
             before(grammarAccess.getIndividualAccess().getGroup_2_2()); 
            // InternalOntoL.g:1734:2: ( rule__Individual__Group_2_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOntoL.g:1734:3: rule__Individual__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Individual__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalOntoL.g:1743:1: rule__Individual__Group_2_2__0 : rule__Individual__Group_2_2__0__Impl rule__Individual__Group_2_2__1 ;
    public final void rule__Individual__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1747:1: ( rule__Individual__Group_2_2__0__Impl rule__Individual__Group_2_2__1 )
            // InternalOntoL.g:1748:2: rule__Individual__Group_2_2__0__Impl rule__Individual__Group_2_2__1
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
    // InternalOntoL.g:1755:1: rule__Individual__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Individual__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1759:1: ( ( ',' ) )
            // InternalOntoL.g:1760:1: ( ',' )
            {
            // InternalOntoL.g:1760:1: ( ',' )
            // InternalOntoL.g:1761:2: ','
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
    // InternalOntoL.g:1770:1: rule__Individual__Group_2_2__1 : rule__Individual__Group_2_2__1__Impl ;
    public final void rule__Individual__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1774:1: ( rule__Individual__Group_2_2__1__Impl )
            // InternalOntoL.g:1775:2: rule__Individual__Group_2_2__1__Impl
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
    // InternalOntoL.g:1781:1: rule__Individual__Group_2_2__1__Impl : ( ( rule__Individual__InstantiatedClassesAssignment_2_2_1 ) ) ;
    public final void rule__Individual__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1785:1: ( ( ( rule__Individual__InstantiatedClassesAssignment_2_2_1 ) ) )
            // InternalOntoL.g:1786:1: ( ( rule__Individual__InstantiatedClassesAssignment_2_2_1 ) )
            {
            // InternalOntoL.g:1786:1: ( ( rule__Individual__InstantiatedClassesAssignment_2_2_1 ) )
            // InternalOntoL.g:1787:2: ( rule__Individual__InstantiatedClassesAssignment_2_2_1 )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesAssignment_2_2_1()); 
            // InternalOntoL.g:1788:2: ( rule__Individual__InstantiatedClassesAssignment_2_2_1 )
            // InternalOntoL.g:1788:3: rule__Individual__InstantiatedClassesAssignment_2_2_1
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
    // InternalOntoL.g:1797:1: rule__Individual__Group_3__0 : rule__Individual__Group_3__0__Impl rule__Individual__Group_3__1 ;
    public final void rule__Individual__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1801:1: ( rule__Individual__Group_3__0__Impl rule__Individual__Group_3__1 )
            // InternalOntoL.g:1802:2: rule__Individual__Group_3__0__Impl rule__Individual__Group_3__1
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
    // InternalOntoL.g:1809:1: rule__Individual__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Individual__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1813:1: ( ( '{' ) )
            // InternalOntoL.g:1814:1: ( '{' )
            {
            // InternalOntoL.g:1814:1: ( '{' )
            // InternalOntoL.g:1815:2: '{'
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
    // InternalOntoL.g:1824:1: rule__Individual__Group_3__1 : rule__Individual__Group_3__1__Impl rule__Individual__Group_3__2 ;
    public final void rule__Individual__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1828:1: ( rule__Individual__Group_3__1__Impl rule__Individual__Group_3__2 )
            // InternalOntoL.g:1829:2: rule__Individual__Group_3__1__Impl rule__Individual__Group_3__2
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
    // InternalOntoL.g:1836:1: rule__Individual__Group_3__1__Impl : ( ( rule__Individual__Alternatives_3_1 )* ) ;
    public final void rule__Individual__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1840:1: ( ( ( rule__Individual__Alternatives_3_1 )* ) )
            // InternalOntoL.g:1841:1: ( ( rule__Individual__Alternatives_3_1 )* )
            {
            // InternalOntoL.g:1841:1: ( ( rule__Individual__Alternatives_3_1 )* )
            // InternalOntoL.g:1842:2: ( rule__Individual__Alternatives_3_1 )*
            {
             before(grammarAccess.getIndividualAccess().getAlternatives_3_1()); 
            // InternalOntoL.g:1843:2: ( rule__Individual__Alternatives_3_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36||LA22_0==41) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalOntoL.g:1843:3: rule__Individual__Alternatives_3_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Individual__Alternatives_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalOntoL.g:1851:1: rule__Individual__Group_3__2 : rule__Individual__Group_3__2__Impl ;
    public final void rule__Individual__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1855:1: ( rule__Individual__Group_3__2__Impl )
            // InternalOntoL.g:1856:2: rule__Individual__Group_3__2__Impl
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
    // InternalOntoL.g:1862:1: rule__Individual__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Individual__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1866:1: ( ( '}' ) )
            // InternalOntoL.g:1867:1: ( '}' )
            {
            // InternalOntoL.g:1867:1: ( '}' )
            // InternalOntoL.g:1868:2: '}'
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
    // InternalOntoL.g:1878:1: rule__OntoLClass__Group__0 : rule__OntoLClass__Group__0__Impl rule__OntoLClass__Group__1 ;
    public final void rule__OntoLClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1882:1: ( rule__OntoLClass__Group__0__Impl rule__OntoLClass__Group__1 )
            // InternalOntoL.g:1883:2: rule__OntoLClass__Group__0__Impl rule__OntoLClass__Group__1
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
    // InternalOntoL.g:1890:1: rule__OntoLClass__Group__0__Impl : ( ( rule__OntoLClass__Alternatives_0 ) ) ;
    public final void rule__OntoLClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1894:1: ( ( ( rule__OntoLClass__Alternatives_0 ) ) )
            // InternalOntoL.g:1895:1: ( ( rule__OntoLClass__Alternatives_0 ) )
            {
            // InternalOntoL.g:1895:1: ( ( rule__OntoLClass__Alternatives_0 ) )
            // InternalOntoL.g:1896:2: ( rule__OntoLClass__Alternatives_0 )
            {
             before(grammarAccess.getOntoLClassAccess().getAlternatives_0()); 
            // InternalOntoL.g:1897:2: ( rule__OntoLClass__Alternatives_0 )
            // InternalOntoL.g:1897:3: rule__OntoLClass__Alternatives_0
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
    // InternalOntoL.g:1905:1: rule__OntoLClass__Group__1 : rule__OntoLClass__Group__1__Impl ;
    public final void rule__OntoLClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1909:1: ( rule__OntoLClass__Group__1__Impl )
            // InternalOntoL.g:1910:2: rule__OntoLClass__Group__1__Impl
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
    // InternalOntoL.g:1916:1: rule__OntoLClass__Group__1__Impl : ( ( rule__OntoLClass__Group_1__0 )? ) ;
    public final void rule__OntoLClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1920:1: ( ( ( rule__OntoLClass__Group_1__0 )? ) )
            // InternalOntoL.g:1921:1: ( ( rule__OntoLClass__Group_1__0 )? )
            {
            // InternalOntoL.g:1921:1: ( ( rule__OntoLClass__Group_1__0 )? )
            // InternalOntoL.g:1922:2: ( rule__OntoLClass__Group_1__0 )?
            {
             before(grammarAccess.getOntoLClassAccess().getGroup_1()); 
            // InternalOntoL.g:1923:2: ( rule__OntoLClass__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOntoL.g:1923:3: rule__OntoLClass__Group_1__0
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
    // InternalOntoL.g:1932:1: rule__OntoLClass__Group_1__0 : rule__OntoLClass__Group_1__0__Impl rule__OntoLClass__Group_1__1 ;
    public final void rule__OntoLClass__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1936:1: ( rule__OntoLClass__Group_1__0__Impl rule__OntoLClass__Group_1__1 )
            // InternalOntoL.g:1937:2: rule__OntoLClass__Group_1__0__Impl rule__OntoLClass__Group_1__1
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
    // InternalOntoL.g:1944:1: rule__OntoLClass__Group_1__0__Impl : ( '{' ) ;
    public final void rule__OntoLClass__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1948:1: ( ( '{' ) )
            // InternalOntoL.g:1949:1: ( '{' )
            {
            // InternalOntoL.g:1949:1: ( '{' )
            // InternalOntoL.g:1950:2: '{'
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
    // InternalOntoL.g:1959:1: rule__OntoLClass__Group_1__1 : rule__OntoLClass__Group_1__1__Impl rule__OntoLClass__Group_1__2 ;
    public final void rule__OntoLClass__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1963:1: ( rule__OntoLClass__Group_1__1__Impl rule__OntoLClass__Group_1__2 )
            // InternalOntoL.g:1964:2: rule__OntoLClass__Group_1__1__Impl rule__OntoLClass__Group_1__2
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
    // InternalOntoL.g:1971:1: rule__OntoLClass__Group_1__1__Impl : ( ( rule__OntoLClass__Alternatives_1_1 )* ) ;
    public final void rule__OntoLClass__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1975:1: ( ( ( rule__OntoLClass__Alternatives_1_1 )* ) )
            // InternalOntoL.g:1976:1: ( ( rule__OntoLClass__Alternatives_1_1 )* )
            {
            // InternalOntoL.g:1976:1: ( ( rule__OntoLClass__Alternatives_1_1 )* )
            // InternalOntoL.g:1977:2: ( rule__OntoLClass__Alternatives_1_1 )*
            {
             before(grammarAccess.getOntoLClassAccess().getAlternatives_1_1()); 
            // InternalOntoL.g:1978:2: ( rule__OntoLClass__Alternatives_1_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==36||LA24_0==41) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalOntoL.g:1978:3: rule__OntoLClass__Alternatives_1_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__OntoLClass__Alternatives_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalOntoL.g:1986:1: rule__OntoLClass__Group_1__2 : rule__OntoLClass__Group_1__2__Impl ;
    public final void rule__OntoLClass__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1990:1: ( rule__OntoLClass__Group_1__2__Impl )
            // InternalOntoL.g:1991:2: rule__OntoLClass__Group_1__2__Impl
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
    // InternalOntoL.g:1997:1: rule__OntoLClass__Group_1__2__Impl : ( '}' ) ;
    public final void rule__OntoLClass__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2001:1: ( ( '}' ) )
            // InternalOntoL.g:2002:1: ( '}' )
            {
            // InternalOntoL.g:2002:1: ( '}' )
            // InternalOntoL.g:2003:2: '}'
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
    // InternalOntoL.g:2013:1: rule__OrderlessClass__Group__0 : rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1 ;
    public final void rule__OrderlessClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2017:1: ( rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1 )
            // InternalOntoL.g:2018:2: rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1
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
    // InternalOntoL.g:2025:1: rule__OrderlessClass__Group__0__Impl : ( 'orderless' ) ;
    public final void rule__OrderlessClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2029:1: ( ( 'orderless' ) )
            // InternalOntoL.g:2030:1: ( 'orderless' )
            {
            // InternalOntoL.g:2030:1: ( 'orderless' )
            // InternalOntoL.g:2031:2: 'orderless'
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
    // InternalOntoL.g:2040:1: rule__OrderlessClass__Group__1 : rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2 ;
    public final void rule__OrderlessClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2044:1: ( rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2 )
            // InternalOntoL.g:2045:2: rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2
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
    // InternalOntoL.g:2052:1: rule__OrderlessClass__Group__1__Impl : ( 'class' ) ;
    public final void rule__OrderlessClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2056:1: ( ( 'class' ) )
            // InternalOntoL.g:2057:1: ( 'class' )
            {
            // InternalOntoL.g:2057:1: ( 'class' )
            // InternalOntoL.g:2058:2: 'class'
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
    // InternalOntoL.g:2067:1: rule__OrderlessClass__Group__2 : rule__OrderlessClass__Group__2__Impl rule__OrderlessClass__Group__3 ;
    public final void rule__OrderlessClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2071:1: ( rule__OrderlessClass__Group__2__Impl rule__OrderlessClass__Group__3 )
            // InternalOntoL.g:2072:2: rule__OrderlessClass__Group__2__Impl rule__OrderlessClass__Group__3
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
    // InternalOntoL.g:2079:1: rule__OrderlessClass__Group__2__Impl : ( ( rule__OrderlessClass__NameAssignment_2 ) ) ;
    public final void rule__OrderlessClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2083:1: ( ( ( rule__OrderlessClass__NameAssignment_2 ) ) )
            // InternalOntoL.g:2084:1: ( ( rule__OrderlessClass__NameAssignment_2 ) )
            {
            // InternalOntoL.g:2084:1: ( ( rule__OrderlessClass__NameAssignment_2 ) )
            // InternalOntoL.g:2085:2: ( rule__OrderlessClass__NameAssignment_2 )
            {
             before(grammarAccess.getOrderlessClassAccess().getNameAssignment_2()); 
            // InternalOntoL.g:2086:2: ( rule__OrderlessClass__NameAssignment_2 )
            // InternalOntoL.g:2086:3: rule__OrderlessClass__NameAssignment_2
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
    // InternalOntoL.g:2094:1: rule__OrderlessClass__Group__3 : rule__OrderlessClass__Group__3__Impl rule__OrderlessClass__Group__4 ;
    public final void rule__OrderlessClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2098:1: ( rule__OrderlessClass__Group__3__Impl rule__OrderlessClass__Group__4 )
            // InternalOntoL.g:2099:2: rule__OrderlessClass__Group__3__Impl rule__OrderlessClass__Group__4
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
    // InternalOntoL.g:2106:1: rule__OrderlessClass__Group__3__Impl : ( ( rule__OrderlessClass__Group_3__0 )? ) ;
    public final void rule__OrderlessClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2110:1: ( ( ( rule__OrderlessClass__Group_3__0 )? ) )
            // InternalOntoL.g:2111:1: ( ( rule__OrderlessClass__Group_3__0 )? )
            {
            // InternalOntoL.g:2111:1: ( ( rule__OrderlessClass__Group_3__0 )? )
            // InternalOntoL.g:2112:2: ( rule__OrderlessClass__Group_3__0 )?
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_3()); 
            // InternalOntoL.g:2113:2: ( rule__OrderlessClass__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOntoL.g:2113:3: rule__OrderlessClass__Group_3__0
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
    // InternalOntoL.g:2121:1: rule__OrderlessClass__Group__4 : rule__OrderlessClass__Group__4__Impl rule__OrderlessClass__Group__5 ;
    public final void rule__OrderlessClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2125:1: ( rule__OrderlessClass__Group__4__Impl rule__OrderlessClass__Group__5 )
            // InternalOntoL.g:2126:2: rule__OrderlessClass__Group__4__Impl rule__OrderlessClass__Group__5
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
    // InternalOntoL.g:2133:1: rule__OrderlessClass__Group__4__Impl : ( ( rule__OrderlessClass__Group_4__0 )? ) ;
    public final void rule__OrderlessClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2137:1: ( ( ( rule__OrderlessClass__Group_4__0 )? ) )
            // InternalOntoL.g:2138:1: ( ( rule__OrderlessClass__Group_4__0 )? )
            {
            // InternalOntoL.g:2138:1: ( ( rule__OrderlessClass__Group_4__0 )? )
            // InternalOntoL.g:2139:2: ( rule__OrderlessClass__Group_4__0 )?
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_4()); 
            // InternalOntoL.g:2140:2: ( rule__OrderlessClass__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOntoL.g:2140:3: rule__OrderlessClass__Group_4__0
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
    // InternalOntoL.g:2148:1: rule__OrderlessClass__Group__5 : rule__OrderlessClass__Group__5__Impl rule__OrderlessClass__Group__6 ;
    public final void rule__OrderlessClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2152:1: ( rule__OrderlessClass__Group__5__Impl rule__OrderlessClass__Group__6 )
            // InternalOntoL.g:2153:2: rule__OrderlessClass__Group__5__Impl rule__OrderlessClass__Group__6
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
    // InternalOntoL.g:2160:1: rule__OrderlessClass__Group__5__Impl : ( ( rule__OrderlessClass__Group_5__0 )? ) ;
    public final void rule__OrderlessClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2164:1: ( ( ( rule__OrderlessClass__Group_5__0 )? ) )
            // InternalOntoL.g:2165:1: ( ( rule__OrderlessClass__Group_5__0 )? )
            {
            // InternalOntoL.g:2165:1: ( ( rule__OrderlessClass__Group_5__0 )? )
            // InternalOntoL.g:2166:2: ( rule__OrderlessClass__Group_5__0 )?
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_5()); 
            // InternalOntoL.g:2167:2: ( rule__OrderlessClass__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOntoL.g:2167:3: rule__OrderlessClass__Group_5__0
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
    // InternalOntoL.g:2175:1: rule__OrderlessClass__Group__6 : rule__OrderlessClass__Group__6__Impl ;
    public final void rule__OrderlessClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2179:1: ( rule__OrderlessClass__Group__6__Impl )
            // InternalOntoL.g:2180:2: rule__OrderlessClass__Group__6__Impl
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
    // InternalOntoL.g:2186:1: rule__OrderlessClass__Group__6__Impl : ( ( rule__OrderlessClass__Alternatives_6 )? ) ;
    public final void rule__OrderlessClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2190:1: ( ( ( rule__OrderlessClass__Alternatives_6 )? ) )
            // InternalOntoL.g:2191:1: ( ( rule__OrderlessClass__Alternatives_6 )? )
            {
            // InternalOntoL.g:2191:1: ( ( rule__OrderlessClass__Alternatives_6 )? )
            // InternalOntoL.g:2192:2: ( rule__OrderlessClass__Alternatives_6 )?
            {
             before(grammarAccess.getOrderlessClassAccess().getAlternatives_6()); 
            // InternalOntoL.g:2193:2: ( rule__OrderlessClass__Alternatives_6 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=14 && LA28_0<=17)||LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOntoL.g:2193:3: rule__OrderlessClass__Alternatives_6
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
    // InternalOntoL.g:2202:1: rule__OrderlessClass__Group_3__0 : rule__OrderlessClass__Group_3__0__Impl rule__OrderlessClass__Group_3__1 ;
    public final void rule__OrderlessClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2206:1: ( rule__OrderlessClass__Group_3__0__Impl rule__OrderlessClass__Group_3__1 )
            // InternalOntoL.g:2207:2: rule__OrderlessClass__Group_3__0__Impl rule__OrderlessClass__Group_3__1
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
    // InternalOntoL.g:2214:1: rule__OrderlessClass__Group_3__0__Impl : ( ':' ) ;
    public final void rule__OrderlessClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2218:1: ( ( ':' ) )
            // InternalOntoL.g:2219:1: ( ':' )
            {
            // InternalOntoL.g:2219:1: ( ':' )
            // InternalOntoL.g:2220:2: ':'
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
    // InternalOntoL.g:2229:1: rule__OrderlessClass__Group_3__1 : rule__OrderlessClass__Group_3__1__Impl rule__OrderlessClass__Group_3__2 ;
    public final void rule__OrderlessClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2233:1: ( rule__OrderlessClass__Group_3__1__Impl rule__OrderlessClass__Group_3__2 )
            // InternalOntoL.g:2234:2: rule__OrderlessClass__Group_3__1__Impl rule__OrderlessClass__Group_3__2
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
    // InternalOntoL.g:2241:1: rule__OrderlessClass__Group_3__1__Impl : ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 ) ) ;
    public final void rule__OrderlessClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2245:1: ( ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 ) ) )
            // InternalOntoL.g:2246:1: ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 ) )
            {
            // InternalOntoL.g:2246:1: ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 ) )
            // InternalOntoL.g:2247:2: ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesAssignment_3_1()); 
            // InternalOntoL.g:2248:2: ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 )
            // InternalOntoL.g:2248:3: rule__OrderlessClass__InstantiatedClassesAssignment_3_1
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
    // InternalOntoL.g:2256:1: rule__OrderlessClass__Group_3__2 : rule__OrderlessClass__Group_3__2__Impl ;
    public final void rule__OrderlessClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2260:1: ( rule__OrderlessClass__Group_3__2__Impl )
            // InternalOntoL.g:2261:2: rule__OrderlessClass__Group_3__2__Impl
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
    // InternalOntoL.g:2267:1: rule__OrderlessClass__Group_3__2__Impl : ( ( rule__OrderlessClass__Group_3_2__0 )* ) ;
    public final void rule__OrderlessClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2271:1: ( ( ( rule__OrderlessClass__Group_3_2__0 )* ) )
            // InternalOntoL.g:2272:1: ( ( rule__OrderlessClass__Group_3_2__0 )* )
            {
            // InternalOntoL.g:2272:1: ( ( rule__OrderlessClass__Group_3_2__0 )* )
            // InternalOntoL.g:2273:2: ( rule__OrderlessClass__Group_3_2__0 )*
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_3_2()); 
            // InternalOntoL.g:2274:2: ( rule__OrderlessClass__Group_3_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==28) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalOntoL.g:2274:3: rule__OrderlessClass__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OrderlessClass__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalOntoL.g:2283:1: rule__OrderlessClass__Group_3_2__0 : rule__OrderlessClass__Group_3_2__0__Impl rule__OrderlessClass__Group_3_2__1 ;
    public final void rule__OrderlessClass__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2287:1: ( rule__OrderlessClass__Group_3_2__0__Impl rule__OrderlessClass__Group_3_2__1 )
            // InternalOntoL.g:2288:2: rule__OrderlessClass__Group_3_2__0__Impl rule__OrderlessClass__Group_3_2__1
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
    // InternalOntoL.g:2295:1: rule__OrderlessClass__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__OrderlessClass__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2299:1: ( ( ',' ) )
            // InternalOntoL.g:2300:1: ( ',' )
            {
            // InternalOntoL.g:2300:1: ( ',' )
            // InternalOntoL.g:2301:2: ','
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
    // InternalOntoL.g:2310:1: rule__OrderlessClass__Group_3_2__1 : rule__OrderlessClass__Group_3_2__1__Impl ;
    public final void rule__OrderlessClass__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2314:1: ( rule__OrderlessClass__Group_3_2__1__Impl )
            // InternalOntoL.g:2315:2: rule__OrderlessClass__Group_3_2__1__Impl
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
    // InternalOntoL.g:2321:1: rule__OrderlessClass__Group_3_2__1__Impl : ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 ) ) ;
    public final void rule__OrderlessClass__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2325:1: ( ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 ) ) )
            // InternalOntoL.g:2326:1: ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 ) )
            {
            // InternalOntoL.g:2326:1: ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 ) )
            // InternalOntoL.g:2327:2: ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesAssignment_3_2_1()); 
            // InternalOntoL.g:2328:2: ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 )
            // InternalOntoL.g:2328:3: rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1
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
    // InternalOntoL.g:2337:1: rule__OrderlessClass__Group_4__0 : rule__OrderlessClass__Group_4__0__Impl rule__OrderlessClass__Group_4__1 ;
    public final void rule__OrderlessClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2341:1: ( rule__OrderlessClass__Group_4__0__Impl rule__OrderlessClass__Group_4__1 )
            // InternalOntoL.g:2342:2: rule__OrderlessClass__Group_4__0__Impl rule__OrderlessClass__Group_4__1
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
    // InternalOntoL.g:2349:1: rule__OrderlessClass__Group_4__0__Impl : ( 'specializes' ) ;
    public final void rule__OrderlessClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2353:1: ( ( 'specializes' ) )
            // InternalOntoL.g:2354:1: ( 'specializes' )
            {
            // InternalOntoL.g:2354:1: ( 'specializes' )
            // InternalOntoL.g:2355:2: 'specializes'
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
    // InternalOntoL.g:2364:1: rule__OrderlessClass__Group_4__1 : rule__OrderlessClass__Group_4__1__Impl rule__OrderlessClass__Group_4__2 ;
    public final void rule__OrderlessClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2368:1: ( rule__OrderlessClass__Group_4__1__Impl rule__OrderlessClass__Group_4__2 )
            // InternalOntoL.g:2369:2: rule__OrderlessClass__Group_4__1__Impl rule__OrderlessClass__Group_4__2
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
    // InternalOntoL.g:2376:1: rule__OrderlessClass__Group_4__1__Impl : ( ( rule__OrderlessClass__SuperClassesAssignment_4_1 ) ) ;
    public final void rule__OrderlessClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2380:1: ( ( ( rule__OrderlessClass__SuperClassesAssignment_4_1 ) ) )
            // InternalOntoL.g:2381:1: ( ( rule__OrderlessClass__SuperClassesAssignment_4_1 ) )
            {
            // InternalOntoL.g:2381:1: ( ( rule__OrderlessClass__SuperClassesAssignment_4_1 ) )
            // InternalOntoL.g:2382:2: ( rule__OrderlessClass__SuperClassesAssignment_4_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getSuperClassesAssignment_4_1()); 
            // InternalOntoL.g:2383:2: ( rule__OrderlessClass__SuperClassesAssignment_4_1 )
            // InternalOntoL.g:2383:3: rule__OrderlessClass__SuperClassesAssignment_4_1
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
    // InternalOntoL.g:2391:1: rule__OrderlessClass__Group_4__2 : rule__OrderlessClass__Group_4__2__Impl ;
    public final void rule__OrderlessClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2395:1: ( rule__OrderlessClass__Group_4__2__Impl )
            // InternalOntoL.g:2396:2: rule__OrderlessClass__Group_4__2__Impl
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
    // InternalOntoL.g:2402:1: rule__OrderlessClass__Group_4__2__Impl : ( ( rule__OrderlessClass__Group_4_2__0 )* ) ;
    public final void rule__OrderlessClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2406:1: ( ( ( rule__OrderlessClass__Group_4_2__0 )* ) )
            // InternalOntoL.g:2407:1: ( ( rule__OrderlessClass__Group_4_2__0 )* )
            {
            // InternalOntoL.g:2407:1: ( ( rule__OrderlessClass__Group_4_2__0 )* )
            // InternalOntoL.g:2408:2: ( rule__OrderlessClass__Group_4_2__0 )*
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_4_2()); 
            // InternalOntoL.g:2409:2: ( rule__OrderlessClass__Group_4_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==28) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalOntoL.g:2409:3: rule__OrderlessClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OrderlessClass__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalOntoL.g:2418:1: rule__OrderlessClass__Group_4_2__0 : rule__OrderlessClass__Group_4_2__0__Impl rule__OrderlessClass__Group_4_2__1 ;
    public final void rule__OrderlessClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2422:1: ( rule__OrderlessClass__Group_4_2__0__Impl rule__OrderlessClass__Group_4_2__1 )
            // InternalOntoL.g:2423:2: rule__OrderlessClass__Group_4_2__0__Impl rule__OrderlessClass__Group_4_2__1
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
    // InternalOntoL.g:2430:1: rule__OrderlessClass__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__OrderlessClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2434:1: ( ( ',' ) )
            // InternalOntoL.g:2435:1: ( ',' )
            {
            // InternalOntoL.g:2435:1: ( ',' )
            // InternalOntoL.g:2436:2: ','
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
    // InternalOntoL.g:2445:1: rule__OrderlessClass__Group_4_2__1 : rule__OrderlessClass__Group_4_2__1__Impl ;
    public final void rule__OrderlessClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2449:1: ( rule__OrderlessClass__Group_4_2__1__Impl )
            // InternalOntoL.g:2450:2: rule__OrderlessClass__Group_4_2__1__Impl
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
    // InternalOntoL.g:2456:1: rule__OrderlessClass__Group_4_2__1__Impl : ( ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 ) ) ;
    public final void rule__OrderlessClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2460:1: ( ( ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 ) ) )
            // InternalOntoL.g:2461:1: ( ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 ) )
            {
            // InternalOntoL.g:2461:1: ( ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 ) )
            // InternalOntoL.g:2462:2: ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getSuperClassesAssignment_4_2_1()); 
            // InternalOntoL.g:2463:2: ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 )
            // InternalOntoL.g:2463:3: rule__OrderlessClass__SuperClassesAssignment_4_2_1
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
    // InternalOntoL.g:2472:1: rule__OrderlessClass__Group_5__0 : rule__OrderlessClass__Group_5__0__Impl rule__OrderlessClass__Group_5__1 ;
    public final void rule__OrderlessClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2476:1: ( rule__OrderlessClass__Group_5__0__Impl rule__OrderlessClass__Group_5__1 )
            // InternalOntoL.g:2477:2: rule__OrderlessClass__Group_5__0__Impl rule__OrderlessClass__Group_5__1
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
    // InternalOntoL.g:2484:1: rule__OrderlessClass__Group_5__0__Impl : ( 'subordinatedto' ) ;
    public final void rule__OrderlessClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2488:1: ( ( 'subordinatedto' ) )
            // InternalOntoL.g:2489:1: ( 'subordinatedto' )
            {
            // InternalOntoL.g:2489:1: ( 'subordinatedto' )
            // InternalOntoL.g:2490:2: 'subordinatedto'
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
    // InternalOntoL.g:2499:1: rule__OrderlessClass__Group_5__1 : rule__OrderlessClass__Group_5__1__Impl rule__OrderlessClass__Group_5__2 ;
    public final void rule__OrderlessClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2503:1: ( rule__OrderlessClass__Group_5__1__Impl rule__OrderlessClass__Group_5__2 )
            // InternalOntoL.g:2504:2: rule__OrderlessClass__Group_5__1__Impl rule__OrderlessClass__Group_5__2
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
    // InternalOntoL.g:2511:1: rule__OrderlessClass__Group_5__1__Impl : ( ( rule__OrderlessClass__SubordinatorsAssignment_5_1 ) ) ;
    public final void rule__OrderlessClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2515:1: ( ( ( rule__OrderlessClass__SubordinatorsAssignment_5_1 ) ) )
            // InternalOntoL.g:2516:1: ( ( rule__OrderlessClass__SubordinatorsAssignment_5_1 ) )
            {
            // InternalOntoL.g:2516:1: ( ( rule__OrderlessClass__SubordinatorsAssignment_5_1 ) )
            // InternalOntoL.g:2517:2: ( rule__OrderlessClass__SubordinatorsAssignment_5_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatorsAssignment_5_1()); 
            // InternalOntoL.g:2518:2: ( rule__OrderlessClass__SubordinatorsAssignment_5_1 )
            // InternalOntoL.g:2518:3: rule__OrderlessClass__SubordinatorsAssignment_5_1
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
    // InternalOntoL.g:2526:1: rule__OrderlessClass__Group_5__2 : rule__OrderlessClass__Group_5__2__Impl ;
    public final void rule__OrderlessClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2530:1: ( rule__OrderlessClass__Group_5__2__Impl )
            // InternalOntoL.g:2531:2: rule__OrderlessClass__Group_5__2__Impl
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
    // InternalOntoL.g:2537:1: rule__OrderlessClass__Group_5__2__Impl : ( ( rule__OrderlessClass__Group_5_2__0 )* ) ;
    public final void rule__OrderlessClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2541:1: ( ( ( rule__OrderlessClass__Group_5_2__0 )* ) )
            // InternalOntoL.g:2542:1: ( ( rule__OrderlessClass__Group_5_2__0 )* )
            {
            // InternalOntoL.g:2542:1: ( ( rule__OrderlessClass__Group_5_2__0 )* )
            // InternalOntoL.g:2543:2: ( rule__OrderlessClass__Group_5_2__0 )*
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_5_2()); 
            // InternalOntoL.g:2544:2: ( rule__OrderlessClass__Group_5_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==28) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalOntoL.g:2544:3: rule__OrderlessClass__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OrderlessClass__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalOntoL.g:2553:1: rule__OrderlessClass__Group_5_2__0 : rule__OrderlessClass__Group_5_2__0__Impl rule__OrderlessClass__Group_5_2__1 ;
    public final void rule__OrderlessClass__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2557:1: ( rule__OrderlessClass__Group_5_2__0__Impl rule__OrderlessClass__Group_5_2__1 )
            // InternalOntoL.g:2558:2: rule__OrderlessClass__Group_5_2__0__Impl rule__OrderlessClass__Group_5_2__1
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
    // InternalOntoL.g:2565:1: rule__OrderlessClass__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__OrderlessClass__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2569:1: ( ( ',' ) )
            // InternalOntoL.g:2570:1: ( ',' )
            {
            // InternalOntoL.g:2570:1: ( ',' )
            // InternalOntoL.g:2571:2: ','
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
    // InternalOntoL.g:2580:1: rule__OrderlessClass__Group_5_2__1 : rule__OrderlessClass__Group_5_2__1__Impl ;
    public final void rule__OrderlessClass__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2584:1: ( rule__OrderlessClass__Group_5_2__1__Impl )
            // InternalOntoL.g:2585:2: rule__OrderlessClass__Group_5_2__1__Impl
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
    // InternalOntoL.g:2591:1: rule__OrderlessClass__Group_5_2__1__Impl : ( ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 ) ) ;
    public final void rule__OrderlessClass__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2595:1: ( ( ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 ) ) )
            // InternalOntoL.g:2596:1: ( ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 ) )
            {
            // InternalOntoL.g:2596:1: ( ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 ) )
            // InternalOntoL.g:2597:2: ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatorsAssignment_5_2_1()); 
            // InternalOntoL.g:2598:2: ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 )
            // InternalOntoL.g:2598:3: rule__OrderlessClass__SubordinatorsAssignment_5_2_1
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
    // InternalOntoL.g:2607:1: rule__OrderlessClass__Group_6_0__0 : rule__OrderlessClass__Group_6_0__0__Impl rule__OrderlessClass__Group_6_0__1 ;
    public final void rule__OrderlessClass__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2611:1: ( rule__OrderlessClass__Group_6_0__0__Impl rule__OrderlessClass__Group_6_0__1 )
            // InternalOntoL.g:2612:2: rule__OrderlessClass__Group_6_0__0__Impl rule__OrderlessClass__Group_6_0__1
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
    // InternalOntoL.g:2619:1: rule__OrderlessClass__Group_6_0__0__Impl : ( ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 ) ) ;
    public final void rule__OrderlessClass__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2623:1: ( ( ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 ) ) )
            // InternalOntoL.g:2624:1: ( ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 ) )
            {
            // InternalOntoL.g:2624:1: ( ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 ) )
            // InternalOntoL.g:2625:2: ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 )
            {
             before(grammarAccess.getOrderlessClassAccess().getCategorizationTypeAssignment_6_0_0()); 
            // InternalOntoL.g:2626:2: ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 )
            // InternalOntoL.g:2626:3: rule__OrderlessClass__CategorizationTypeAssignment_6_0_0
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
    // InternalOntoL.g:2634:1: rule__OrderlessClass__Group_6_0__1 : rule__OrderlessClass__Group_6_0__1__Impl ;
    public final void rule__OrderlessClass__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2638:1: ( rule__OrderlessClass__Group_6_0__1__Impl )
            // InternalOntoL.g:2639:2: rule__OrderlessClass__Group_6_0__1__Impl
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
    // InternalOntoL.g:2645:1: rule__OrderlessClass__Group_6_0__1__Impl : ( ( rule__OrderlessClass__BasetypeAssignment_6_0_1 ) ) ;
    public final void rule__OrderlessClass__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2649:1: ( ( ( rule__OrderlessClass__BasetypeAssignment_6_0_1 ) ) )
            // InternalOntoL.g:2650:1: ( ( rule__OrderlessClass__BasetypeAssignment_6_0_1 ) )
            {
            // InternalOntoL.g:2650:1: ( ( rule__OrderlessClass__BasetypeAssignment_6_0_1 ) )
            // InternalOntoL.g:2651:2: ( rule__OrderlessClass__BasetypeAssignment_6_0_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getBasetypeAssignment_6_0_1()); 
            // InternalOntoL.g:2652:2: ( rule__OrderlessClass__BasetypeAssignment_6_0_1 )
            // InternalOntoL.g:2652:3: rule__OrderlessClass__BasetypeAssignment_6_0_1
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
    // InternalOntoL.g:2661:1: rule__OrderlessClass__Group_6_1__0 : rule__OrderlessClass__Group_6_1__0__Impl rule__OrderlessClass__Group_6_1__1 ;
    public final void rule__OrderlessClass__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2665:1: ( rule__OrderlessClass__Group_6_1__0__Impl rule__OrderlessClass__Group_6_1__1 )
            // InternalOntoL.g:2666:2: rule__OrderlessClass__Group_6_1__0__Impl rule__OrderlessClass__Group_6_1__1
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
    // InternalOntoL.g:2673:1: rule__OrderlessClass__Group_6_1__0__Impl : ( 'ispowertypeof' ) ;
    public final void rule__OrderlessClass__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2677:1: ( ( 'ispowertypeof' ) )
            // InternalOntoL.g:2678:1: ( 'ispowertypeof' )
            {
            // InternalOntoL.g:2678:1: ( 'ispowertypeof' )
            // InternalOntoL.g:2679:2: 'ispowertypeof'
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
    // InternalOntoL.g:2688:1: rule__OrderlessClass__Group_6_1__1 : rule__OrderlessClass__Group_6_1__1__Impl ;
    public final void rule__OrderlessClass__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2692:1: ( rule__OrderlessClass__Group_6_1__1__Impl )
            // InternalOntoL.g:2693:2: rule__OrderlessClass__Group_6_1__1__Impl
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
    // InternalOntoL.g:2699:1: rule__OrderlessClass__Group_6_1__1__Impl : ( ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 ) ) ;
    public final void rule__OrderlessClass__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2703:1: ( ( ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 ) ) )
            // InternalOntoL.g:2704:1: ( ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 ) )
            {
            // InternalOntoL.g:2704:1: ( ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 ) )
            // InternalOntoL.g:2705:2: ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getPowertypeOfAssignment_6_1_1()); 
            // InternalOntoL.g:2706:2: ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 )
            // InternalOntoL.g:2706:3: rule__OrderlessClass__PowertypeOfAssignment_6_1_1
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
    // InternalOntoL.g:2715:1: rule__FOClass__Group__0 : rule__FOClass__Group__0__Impl rule__FOClass__Group__1 ;
    public final void rule__FOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2719:1: ( rule__FOClass__Group__0__Impl rule__FOClass__Group__1 )
            // InternalOntoL.g:2720:2: rule__FOClass__Group__0__Impl rule__FOClass__Group__1
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
    // InternalOntoL.g:2727:1: rule__FOClass__Group__0__Impl : ( ( 'first-order' )? ) ;
    public final void rule__FOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2731:1: ( ( ( 'first-order' )? ) )
            // InternalOntoL.g:2732:1: ( ( 'first-order' )? )
            {
            // InternalOntoL.g:2732:1: ( ( 'first-order' )? )
            // InternalOntoL.g:2733:2: ( 'first-order' )?
            {
             before(grammarAccess.getFOClassAccess().getFirstOrderKeyword_0()); 
            // InternalOntoL.g:2734:2: ( 'first-order' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOntoL.g:2734:3: 'first-order'
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
    // InternalOntoL.g:2742:1: rule__FOClass__Group__1 : rule__FOClass__Group__1__Impl rule__FOClass__Group__2 ;
    public final void rule__FOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2746:1: ( rule__FOClass__Group__1__Impl rule__FOClass__Group__2 )
            // InternalOntoL.g:2747:2: rule__FOClass__Group__1__Impl rule__FOClass__Group__2
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
    // InternalOntoL.g:2754:1: rule__FOClass__Group__1__Impl : ( 'class' ) ;
    public final void rule__FOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2758:1: ( ( 'class' ) )
            // InternalOntoL.g:2759:1: ( 'class' )
            {
            // InternalOntoL.g:2759:1: ( 'class' )
            // InternalOntoL.g:2760:2: 'class'
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
    // InternalOntoL.g:2769:1: rule__FOClass__Group__2 : rule__FOClass__Group__2__Impl rule__FOClass__Group__3 ;
    public final void rule__FOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2773:1: ( rule__FOClass__Group__2__Impl rule__FOClass__Group__3 )
            // InternalOntoL.g:2774:2: rule__FOClass__Group__2__Impl rule__FOClass__Group__3
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
    // InternalOntoL.g:2781:1: rule__FOClass__Group__2__Impl : ( ( rule__FOClass__NameAssignment_2 ) ) ;
    public final void rule__FOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2785:1: ( ( ( rule__FOClass__NameAssignment_2 ) ) )
            // InternalOntoL.g:2786:1: ( ( rule__FOClass__NameAssignment_2 ) )
            {
            // InternalOntoL.g:2786:1: ( ( rule__FOClass__NameAssignment_2 ) )
            // InternalOntoL.g:2787:2: ( rule__FOClass__NameAssignment_2 )
            {
             before(grammarAccess.getFOClassAccess().getNameAssignment_2()); 
            // InternalOntoL.g:2788:2: ( rule__FOClass__NameAssignment_2 )
            // InternalOntoL.g:2788:3: rule__FOClass__NameAssignment_2
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
    // InternalOntoL.g:2796:1: rule__FOClass__Group__3 : rule__FOClass__Group__3__Impl rule__FOClass__Group__4 ;
    public final void rule__FOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2800:1: ( rule__FOClass__Group__3__Impl rule__FOClass__Group__4 )
            // InternalOntoL.g:2801:2: rule__FOClass__Group__3__Impl rule__FOClass__Group__4
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
    // InternalOntoL.g:2808:1: rule__FOClass__Group__3__Impl : ( ( rule__FOClass__Group_3__0 )? ) ;
    public final void rule__FOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2812:1: ( ( ( rule__FOClass__Group_3__0 )? ) )
            // InternalOntoL.g:2813:1: ( ( rule__FOClass__Group_3__0 )? )
            {
            // InternalOntoL.g:2813:1: ( ( rule__FOClass__Group_3__0 )? )
            // InternalOntoL.g:2814:2: ( rule__FOClass__Group_3__0 )?
            {
             before(grammarAccess.getFOClassAccess().getGroup_3()); 
            // InternalOntoL.g:2815:2: ( rule__FOClass__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOntoL.g:2815:3: rule__FOClass__Group_3__0
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
    // InternalOntoL.g:2823:1: rule__FOClass__Group__4 : rule__FOClass__Group__4__Impl ;
    public final void rule__FOClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2827:1: ( rule__FOClass__Group__4__Impl )
            // InternalOntoL.g:2828:2: rule__FOClass__Group__4__Impl
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
    // InternalOntoL.g:2834:1: rule__FOClass__Group__4__Impl : ( ( rule__FOClass__Group_4__0 )? ) ;
    public final void rule__FOClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2838:1: ( ( ( rule__FOClass__Group_4__0 )? ) )
            // InternalOntoL.g:2839:1: ( ( rule__FOClass__Group_4__0 )? )
            {
            // InternalOntoL.g:2839:1: ( ( rule__FOClass__Group_4__0 )? )
            // InternalOntoL.g:2840:2: ( rule__FOClass__Group_4__0 )?
            {
             before(grammarAccess.getFOClassAccess().getGroup_4()); 
            // InternalOntoL.g:2841:2: ( rule__FOClass__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOntoL.g:2841:3: rule__FOClass__Group_4__0
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
    // InternalOntoL.g:2850:1: rule__FOClass__Group_3__0 : rule__FOClass__Group_3__0__Impl rule__FOClass__Group_3__1 ;
    public final void rule__FOClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2854:1: ( rule__FOClass__Group_3__0__Impl rule__FOClass__Group_3__1 )
            // InternalOntoL.g:2855:2: rule__FOClass__Group_3__0__Impl rule__FOClass__Group_3__1
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
    // InternalOntoL.g:2862:1: rule__FOClass__Group_3__0__Impl : ( ':' ) ;
    public final void rule__FOClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2866:1: ( ( ':' ) )
            // InternalOntoL.g:2867:1: ( ':' )
            {
            // InternalOntoL.g:2867:1: ( ':' )
            // InternalOntoL.g:2868:2: ':'
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
    // InternalOntoL.g:2877:1: rule__FOClass__Group_3__1 : rule__FOClass__Group_3__1__Impl rule__FOClass__Group_3__2 ;
    public final void rule__FOClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2881:1: ( rule__FOClass__Group_3__1__Impl rule__FOClass__Group_3__2 )
            // InternalOntoL.g:2882:2: rule__FOClass__Group_3__1__Impl rule__FOClass__Group_3__2
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
    // InternalOntoL.g:2889:1: rule__FOClass__Group_3__1__Impl : ( ( rule__FOClass__InstantiatedClassesAssignment_3_1 ) ) ;
    public final void rule__FOClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2893:1: ( ( ( rule__FOClass__InstantiatedClassesAssignment_3_1 ) ) )
            // InternalOntoL.g:2894:1: ( ( rule__FOClass__InstantiatedClassesAssignment_3_1 ) )
            {
            // InternalOntoL.g:2894:1: ( ( rule__FOClass__InstantiatedClassesAssignment_3_1 ) )
            // InternalOntoL.g:2895:2: ( rule__FOClass__InstantiatedClassesAssignment_3_1 )
            {
             before(grammarAccess.getFOClassAccess().getInstantiatedClassesAssignment_3_1()); 
            // InternalOntoL.g:2896:2: ( rule__FOClass__InstantiatedClassesAssignment_3_1 )
            // InternalOntoL.g:2896:3: rule__FOClass__InstantiatedClassesAssignment_3_1
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
    // InternalOntoL.g:2904:1: rule__FOClass__Group_3__2 : rule__FOClass__Group_3__2__Impl ;
    public final void rule__FOClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2908:1: ( rule__FOClass__Group_3__2__Impl )
            // InternalOntoL.g:2909:2: rule__FOClass__Group_3__2__Impl
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
    // InternalOntoL.g:2915:1: rule__FOClass__Group_3__2__Impl : ( ( rule__FOClass__Group_3_2__0 )* ) ;
    public final void rule__FOClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2919:1: ( ( ( rule__FOClass__Group_3_2__0 )* ) )
            // InternalOntoL.g:2920:1: ( ( rule__FOClass__Group_3_2__0 )* )
            {
            // InternalOntoL.g:2920:1: ( ( rule__FOClass__Group_3_2__0 )* )
            // InternalOntoL.g:2921:2: ( rule__FOClass__Group_3_2__0 )*
            {
             before(grammarAccess.getFOClassAccess().getGroup_3_2()); 
            // InternalOntoL.g:2922:2: ( rule__FOClass__Group_3_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==28) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalOntoL.g:2922:3: rule__FOClass__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__FOClass__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalOntoL.g:2931:1: rule__FOClass__Group_3_2__0 : rule__FOClass__Group_3_2__0__Impl rule__FOClass__Group_3_2__1 ;
    public final void rule__FOClass__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2935:1: ( rule__FOClass__Group_3_2__0__Impl rule__FOClass__Group_3_2__1 )
            // InternalOntoL.g:2936:2: rule__FOClass__Group_3_2__0__Impl rule__FOClass__Group_3_2__1
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
    // InternalOntoL.g:2943:1: rule__FOClass__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__FOClass__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2947:1: ( ( ',' ) )
            // InternalOntoL.g:2948:1: ( ',' )
            {
            // InternalOntoL.g:2948:1: ( ',' )
            // InternalOntoL.g:2949:2: ','
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
    // InternalOntoL.g:2958:1: rule__FOClass__Group_3_2__1 : rule__FOClass__Group_3_2__1__Impl ;
    public final void rule__FOClass__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2962:1: ( rule__FOClass__Group_3_2__1__Impl )
            // InternalOntoL.g:2963:2: rule__FOClass__Group_3_2__1__Impl
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
    // InternalOntoL.g:2969:1: rule__FOClass__Group_3_2__1__Impl : ( ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 ) ) ;
    public final void rule__FOClass__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2973:1: ( ( ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 ) ) )
            // InternalOntoL.g:2974:1: ( ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 ) )
            {
            // InternalOntoL.g:2974:1: ( ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 ) )
            // InternalOntoL.g:2975:2: ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 )
            {
             before(grammarAccess.getFOClassAccess().getInstantiatedClassesAssignment_3_2_1()); 
            // InternalOntoL.g:2976:2: ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 )
            // InternalOntoL.g:2976:3: rule__FOClass__InstantiatedClassesAssignment_3_2_1
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
    // InternalOntoL.g:2985:1: rule__FOClass__Group_4__0 : rule__FOClass__Group_4__0__Impl rule__FOClass__Group_4__1 ;
    public final void rule__FOClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2989:1: ( rule__FOClass__Group_4__0__Impl rule__FOClass__Group_4__1 )
            // InternalOntoL.g:2990:2: rule__FOClass__Group_4__0__Impl rule__FOClass__Group_4__1
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
    // InternalOntoL.g:2997:1: rule__FOClass__Group_4__0__Impl : ( 'specializes' ) ;
    public final void rule__FOClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3001:1: ( ( 'specializes' ) )
            // InternalOntoL.g:3002:1: ( 'specializes' )
            {
            // InternalOntoL.g:3002:1: ( 'specializes' )
            // InternalOntoL.g:3003:2: 'specializes'
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
    // InternalOntoL.g:3012:1: rule__FOClass__Group_4__1 : rule__FOClass__Group_4__1__Impl rule__FOClass__Group_4__2 ;
    public final void rule__FOClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3016:1: ( rule__FOClass__Group_4__1__Impl rule__FOClass__Group_4__2 )
            // InternalOntoL.g:3017:2: rule__FOClass__Group_4__1__Impl rule__FOClass__Group_4__2
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
    // InternalOntoL.g:3024:1: rule__FOClass__Group_4__1__Impl : ( ( rule__FOClass__SuperClassesAssignment_4_1 ) ) ;
    public final void rule__FOClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3028:1: ( ( ( rule__FOClass__SuperClassesAssignment_4_1 ) ) )
            // InternalOntoL.g:3029:1: ( ( rule__FOClass__SuperClassesAssignment_4_1 ) )
            {
            // InternalOntoL.g:3029:1: ( ( rule__FOClass__SuperClassesAssignment_4_1 ) )
            // InternalOntoL.g:3030:2: ( rule__FOClass__SuperClassesAssignment_4_1 )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesAssignment_4_1()); 
            // InternalOntoL.g:3031:2: ( rule__FOClass__SuperClassesAssignment_4_1 )
            // InternalOntoL.g:3031:3: rule__FOClass__SuperClassesAssignment_4_1
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
    // InternalOntoL.g:3039:1: rule__FOClass__Group_4__2 : rule__FOClass__Group_4__2__Impl ;
    public final void rule__FOClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3043:1: ( rule__FOClass__Group_4__2__Impl )
            // InternalOntoL.g:3044:2: rule__FOClass__Group_4__2__Impl
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
    // InternalOntoL.g:3050:1: rule__FOClass__Group_4__2__Impl : ( ( rule__FOClass__Group_4_2__0 )* ) ;
    public final void rule__FOClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3054:1: ( ( ( rule__FOClass__Group_4_2__0 )* ) )
            // InternalOntoL.g:3055:1: ( ( rule__FOClass__Group_4_2__0 )* )
            {
            // InternalOntoL.g:3055:1: ( ( rule__FOClass__Group_4_2__0 )* )
            // InternalOntoL.g:3056:2: ( rule__FOClass__Group_4_2__0 )*
            {
             before(grammarAccess.getFOClassAccess().getGroup_4_2()); 
            // InternalOntoL.g:3057:2: ( rule__FOClass__Group_4_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==28) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalOntoL.g:3057:3: rule__FOClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__FOClass__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalOntoL.g:3066:1: rule__FOClass__Group_4_2__0 : rule__FOClass__Group_4_2__0__Impl rule__FOClass__Group_4_2__1 ;
    public final void rule__FOClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3070:1: ( rule__FOClass__Group_4_2__0__Impl rule__FOClass__Group_4_2__1 )
            // InternalOntoL.g:3071:2: rule__FOClass__Group_4_2__0__Impl rule__FOClass__Group_4_2__1
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
    // InternalOntoL.g:3078:1: rule__FOClass__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__FOClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3082:1: ( ( ',' ) )
            // InternalOntoL.g:3083:1: ( ',' )
            {
            // InternalOntoL.g:3083:1: ( ',' )
            // InternalOntoL.g:3084:2: ','
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
    // InternalOntoL.g:3093:1: rule__FOClass__Group_4_2__1 : rule__FOClass__Group_4_2__1__Impl ;
    public final void rule__FOClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3097:1: ( rule__FOClass__Group_4_2__1__Impl )
            // InternalOntoL.g:3098:2: rule__FOClass__Group_4_2__1__Impl
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
    // InternalOntoL.g:3104:1: rule__FOClass__Group_4_2__1__Impl : ( ( rule__FOClass__SuperClassesAssignment_4_2_1 ) ) ;
    public final void rule__FOClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3108:1: ( ( ( rule__FOClass__SuperClassesAssignment_4_2_1 ) ) )
            // InternalOntoL.g:3109:1: ( ( rule__FOClass__SuperClassesAssignment_4_2_1 ) )
            {
            // InternalOntoL.g:3109:1: ( ( rule__FOClass__SuperClassesAssignment_4_2_1 ) )
            // InternalOntoL.g:3110:2: ( rule__FOClass__SuperClassesAssignment_4_2_1 )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesAssignment_4_2_1()); 
            // InternalOntoL.g:3111:2: ( rule__FOClass__SuperClassesAssignment_4_2_1 )
            // InternalOntoL.g:3111:3: rule__FOClass__SuperClassesAssignment_4_2_1
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
    // InternalOntoL.g:3120:1: rule__HOClass__Group__0 : rule__HOClass__Group__0__Impl rule__HOClass__Group__1 ;
    public final void rule__HOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3124:1: ( rule__HOClass__Group__0__Impl rule__HOClass__Group__1 )
            // InternalOntoL.g:3125:2: rule__HOClass__Group__0__Impl rule__HOClass__Group__1
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
    // InternalOntoL.g:3132:1: rule__HOClass__Group__0__Impl : ( 'order' ) ;
    public final void rule__HOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3136:1: ( ( 'order' ) )
            // InternalOntoL.g:3137:1: ( 'order' )
            {
            // InternalOntoL.g:3137:1: ( 'order' )
            // InternalOntoL.g:3138:2: 'order'
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
    // InternalOntoL.g:3147:1: rule__HOClass__Group__1 : rule__HOClass__Group__1__Impl rule__HOClass__Group__2 ;
    public final void rule__HOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3151:1: ( rule__HOClass__Group__1__Impl rule__HOClass__Group__2 )
            // InternalOntoL.g:3152:2: rule__HOClass__Group__1__Impl rule__HOClass__Group__2
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
    // InternalOntoL.g:3159:1: rule__HOClass__Group__1__Impl : ( ( rule__HOClass__OrderAssignment_1 ) ) ;
    public final void rule__HOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3163:1: ( ( ( rule__HOClass__OrderAssignment_1 ) ) )
            // InternalOntoL.g:3164:1: ( ( rule__HOClass__OrderAssignment_1 ) )
            {
            // InternalOntoL.g:3164:1: ( ( rule__HOClass__OrderAssignment_1 ) )
            // InternalOntoL.g:3165:2: ( rule__HOClass__OrderAssignment_1 )
            {
             before(grammarAccess.getHOClassAccess().getOrderAssignment_1()); 
            // InternalOntoL.g:3166:2: ( rule__HOClass__OrderAssignment_1 )
            // InternalOntoL.g:3166:3: rule__HOClass__OrderAssignment_1
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
    // InternalOntoL.g:3174:1: rule__HOClass__Group__2 : rule__HOClass__Group__2__Impl rule__HOClass__Group__3 ;
    public final void rule__HOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3178:1: ( rule__HOClass__Group__2__Impl rule__HOClass__Group__3 )
            // InternalOntoL.g:3179:2: rule__HOClass__Group__2__Impl rule__HOClass__Group__3
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
    // InternalOntoL.g:3186:1: rule__HOClass__Group__2__Impl : ( 'class' ) ;
    public final void rule__HOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3190:1: ( ( 'class' ) )
            // InternalOntoL.g:3191:1: ( 'class' )
            {
            // InternalOntoL.g:3191:1: ( 'class' )
            // InternalOntoL.g:3192:2: 'class'
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
    // InternalOntoL.g:3201:1: rule__HOClass__Group__3 : rule__HOClass__Group__3__Impl rule__HOClass__Group__4 ;
    public final void rule__HOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3205:1: ( rule__HOClass__Group__3__Impl rule__HOClass__Group__4 )
            // InternalOntoL.g:3206:2: rule__HOClass__Group__3__Impl rule__HOClass__Group__4
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
    // InternalOntoL.g:3213:1: rule__HOClass__Group__3__Impl : ( ( rule__HOClass__NameAssignment_3 ) ) ;
    public final void rule__HOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3217:1: ( ( ( rule__HOClass__NameAssignment_3 ) ) )
            // InternalOntoL.g:3218:1: ( ( rule__HOClass__NameAssignment_3 ) )
            {
            // InternalOntoL.g:3218:1: ( ( rule__HOClass__NameAssignment_3 ) )
            // InternalOntoL.g:3219:2: ( rule__HOClass__NameAssignment_3 )
            {
             before(grammarAccess.getHOClassAccess().getNameAssignment_3()); 
            // InternalOntoL.g:3220:2: ( rule__HOClass__NameAssignment_3 )
            // InternalOntoL.g:3220:3: rule__HOClass__NameAssignment_3
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
    // InternalOntoL.g:3228:1: rule__HOClass__Group__4 : rule__HOClass__Group__4__Impl rule__HOClass__Group__5 ;
    public final void rule__HOClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3232:1: ( rule__HOClass__Group__4__Impl rule__HOClass__Group__5 )
            // InternalOntoL.g:3233:2: rule__HOClass__Group__4__Impl rule__HOClass__Group__5
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
    // InternalOntoL.g:3240:1: rule__HOClass__Group__4__Impl : ( ( rule__HOClass__Group_4__0 )? ) ;
    public final void rule__HOClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3244:1: ( ( ( rule__HOClass__Group_4__0 )? ) )
            // InternalOntoL.g:3245:1: ( ( rule__HOClass__Group_4__0 )? )
            {
            // InternalOntoL.g:3245:1: ( ( rule__HOClass__Group_4__0 )? )
            // InternalOntoL.g:3246:2: ( rule__HOClass__Group_4__0 )?
            {
             before(grammarAccess.getHOClassAccess().getGroup_4()); 
            // InternalOntoL.g:3247:2: ( rule__HOClass__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==27) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOntoL.g:3247:3: rule__HOClass__Group_4__0
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
    // InternalOntoL.g:3255:1: rule__HOClass__Group__5 : rule__HOClass__Group__5__Impl rule__HOClass__Group__6 ;
    public final void rule__HOClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3259:1: ( rule__HOClass__Group__5__Impl rule__HOClass__Group__6 )
            // InternalOntoL.g:3260:2: rule__HOClass__Group__5__Impl rule__HOClass__Group__6
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
    // InternalOntoL.g:3267:1: rule__HOClass__Group__5__Impl : ( ( rule__HOClass__Group_5__0 )? ) ;
    public final void rule__HOClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3271:1: ( ( ( rule__HOClass__Group_5__0 )? ) )
            // InternalOntoL.g:3272:1: ( ( rule__HOClass__Group_5__0 )? )
            {
            // InternalOntoL.g:3272:1: ( ( rule__HOClass__Group_5__0 )? )
            // InternalOntoL.g:3273:2: ( rule__HOClass__Group_5__0 )?
            {
             before(grammarAccess.getHOClassAccess().getGroup_5()); 
            // InternalOntoL.g:3274:2: ( rule__HOClass__Group_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==31) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOntoL.g:3274:3: rule__HOClass__Group_5__0
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
    // InternalOntoL.g:3282:1: rule__HOClass__Group__6 : rule__HOClass__Group__6__Impl rule__HOClass__Group__7 ;
    public final void rule__HOClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3286:1: ( rule__HOClass__Group__6__Impl rule__HOClass__Group__7 )
            // InternalOntoL.g:3287:2: rule__HOClass__Group__6__Impl rule__HOClass__Group__7
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
    // InternalOntoL.g:3294:1: rule__HOClass__Group__6__Impl : ( ( rule__HOClass__Group_6__0 )? ) ;
    public final void rule__HOClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3298:1: ( ( ( rule__HOClass__Group_6__0 )? ) )
            // InternalOntoL.g:3299:1: ( ( rule__HOClass__Group_6__0 )? )
            {
            // InternalOntoL.g:3299:1: ( ( rule__HOClass__Group_6__0 )? )
            // InternalOntoL.g:3300:2: ( rule__HOClass__Group_6__0 )?
            {
             before(grammarAccess.getHOClassAccess().getGroup_6()); 
            // InternalOntoL.g:3301:2: ( rule__HOClass__Group_6__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==32) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOntoL.g:3301:3: rule__HOClass__Group_6__0
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
    // InternalOntoL.g:3309:1: rule__HOClass__Group__7 : rule__HOClass__Group__7__Impl ;
    public final void rule__HOClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3313:1: ( rule__HOClass__Group__7__Impl )
            // InternalOntoL.g:3314:2: rule__HOClass__Group__7__Impl
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
    // InternalOntoL.g:3320:1: rule__HOClass__Group__7__Impl : ( ( rule__HOClass__Alternatives_7 )? ) ;
    public final void rule__HOClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3324:1: ( ( ( rule__HOClass__Alternatives_7 )? ) )
            // InternalOntoL.g:3325:1: ( ( rule__HOClass__Alternatives_7 )? )
            {
            // InternalOntoL.g:3325:1: ( ( rule__HOClass__Alternatives_7 )? )
            // InternalOntoL.g:3326:2: ( rule__HOClass__Alternatives_7 )?
            {
             before(grammarAccess.getHOClassAccess().getAlternatives_7()); 
            // InternalOntoL.g:3327:2: ( rule__HOClass__Alternatives_7 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=14 && LA40_0<=17)||LA40_0==33) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOntoL.g:3327:3: rule__HOClass__Alternatives_7
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
    // InternalOntoL.g:3336:1: rule__HOClass__Group_4__0 : rule__HOClass__Group_4__0__Impl rule__HOClass__Group_4__1 ;
    public final void rule__HOClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3340:1: ( rule__HOClass__Group_4__0__Impl rule__HOClass__Group_4__1 )
            // InternalOntoL.g:3341:2: rule__HOClass__Group_4__0__Impl rule__HOClass__Group_4__1
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
    // InternalOntoL.g:3348:1: rule__HOClass__Group_4__0__Impl : ( ':' ) ;
    public final void rule__HOClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3352:1: ( ( ':' ) )
            // InternalOntoL.g:3353:1: ( ':' )
            {
            // InternalOntoL.g:3353:1: ( ':' )
            // InternalOntoL.g:3354:2: ':'
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
    // InternalOntoL.g:3363:1: rule__HOClass__Group_4__1 : rule__HOClass__Group_4__1__Impl rule__HOClass__Group_4__2 ;
    public final void rule__HOClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3367:1: ( rule__HOClass__Group_4__1__Impl rule__HOClass__Group_4__2 )
            // InternalOntoL.g:3368:2: rule__HOClass__Group_4__1__Impl rule__HOClass__Group_4__2
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
    // InternalOntoL.g:3375:1: rule__HOClass__Group_4__1__Impl : ( ( rule__HOClass__InstantiatedClassesAssignment_4_1 ) ) ;
    public final void rule__HOClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3379:1: ( ( ( rule__HOClass__InstantiatedClassesAssignment_4_1 ) ) )
            // InternalOntoL.g:3380:1: ( ( rule__HOClass__InstantiatedClassesAssignment_4_1 ) )
            {
            // InternalOntoL.g:3380:1: ( ( rule__HOClass__InstantiatedClassesAssignment_4_1 ) )
            // InternalOntoL.g:3381:2: ( rule__HOClass__InstantiatedClassesAssignment_4_1 )
            {
             before(grammarAccess.getHOClassAccess().getInstantiatedClassesAssignment_4_1()); 
            // InternalOntoL.g:3382:2: ( rule__HOClass__InstantiatedClassesAssignment_4_1 )
            // InternalOntoL.g:3382:3: rule__HOClass__InstantiatedClassesAssignment_4_1
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
    // InternalOntoL.g:3390:1: rule__HOClass__Group_4__2 : rule__HOClass__Group_4__2__Impl ;
    public final void rule__HOClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3394:1: ( rule__HOClass__Group_4__2__Impl )
            // InternalOntoL.g:3395:2: rule__HOClass__Group_4__2__Impl
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
    // InternalOntoL.g:3401:1: rule__HOClass__Group_4__2__Impl : ( ( rule__HOClass__Group_4_2__0 )* ) ;
    public final void rule__HOClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3405:1: ( ( ( rule__HOClass__Group_4_2__0 )* ) )
            // InternalOntoL.g:3406:1: ( ( rule__HOClass__Group_4_2__0 )* )
            {
            // InternalOntoL.g:3406:1: ( ( rule__HOClass__Group_4_2__0 )* )
            // InternalOntoL.g:3407:2: ( rule__HOClass__Group_4_2__0 )*
            {
             before(grammarAccess.getHOClassAccess().getGroup_4_2()); 
            // InternalOntoL.g:3408:2: ( rule__HOClass__Group_4_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==28) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalOntoL.g:3408:3: rule__HOClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__HOClass__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalOntoL.g:3417:1: rule__HOClass__Group_4_2__0 : rule__HOClass__Group_4_2__0__Impl rule__HOClass__Group_4_2__1 ;
    public final void rule__HOClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3421:1: ( rule__HOClass__Group_4_2__0__Impl rule__HOClass__Group_4_2__1 )
            // InternalOntoL.g:3422:2: rule__HOClass__Group_4_2__0__Impl rule__HOClass__Group_4_2__1
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
    // InternalOntoL.g:3429:1: rule__HOClass__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__HOClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3433:1: ( ( ',' ) )
            // InternalOntoL.g:3434:1: ( ',' )
            {
            // InternalOntoL.g:3434:1: ( ',' )
            // InternalOntoL.g:3435:2: ','
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
    // InternalOntoL.g:3444:1: rule__HOClass__Group_4_2__1 : rule__HOClass__Group_4_2__1__Impl ;
    public final void rule__HOClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3448:1: ( rule__HOClass__Group_4_2__1__Impl )
            // InternalOntoL.g:3449:2: rule__HOClass__Group_4_2__1__Impl
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
    // InternalOntoL.g:3455:1: rule__HOClass__Group_4_2__1__Impl : ( ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 ) ) ;
    public final void rule__HOClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3459:1: ( ( ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 ) ) )
            // InternalOntoL.g:3460:1: ( ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 ) )
            {
            // InternalOntoL.g:3460:1: ( ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 ) )
            // InternalOntoL.g:3461:2: ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 )
            {
             before(grammarAccess.getHOClassAccess().getInstantiatedClassesAssignment_4_2_1()); 
            // InternalOntoL.g:3462:2: ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 )
            // InternalOntoL.g:3462:3: rule__HOClass__InstantiatedClassesAssignment_4_2_1
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
    // InternalOntoL.g:3471:1: rule__HOClass__Group_5__0 : rule__HOClass__Group_5__0__Impl rule__HOClass__Group_5__1 ;
    public final void rule__HOClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3475:1: ( rule__HOClass__Group_5__0__Impl rule__HOClass__Group_5__1 )
            // InternalOntoL.g:3476:2: rule__HOClass__Group_5__0__Impl rule__HOClass__Group_5__1
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
    // InternalOntoL.g:3483:1: rule__HOClass__Group_5__0__Impl : ( 'specializes' ) ;
    public final void rule__HOClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3487:1: ( ( 'specializes' ) )
            // InternalOntoL.g:3488:1: ( 'specializes' )
            {
            // InternalOntoL.g:3488:1: ( 'specializes' )
            // InternalOntoL.g:3489:2: 'specializes'
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
    // InternalOntoL.g:3498:1: rule__HOClass__Group_5__1 : rule__HOClass__Group_5__1__Impl rule__HOClass__Group_5__2 ;
    public final void rule__HOClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3502:1: ( rule__HOClass__Group_5__1__Impl rule__HOClass__Group_5__2 )
            // InternalOntoL.g:3503:2: rule__HOClass__Group_5__1__Impl rule__HOClass__Group_5__2
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
    // InternalOntoL.g:3510:1: rule__HOClass__Group_5__1__Impl : ( ( rule__HOClass__SuperClassesAssignment_5_1 ) ) ;
    public final void rule__HOClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3514:1: ( ( ( rule__HOClass__SuperClassesAssignment_5_1 ) ) )
            // InternalOntoL.g:3515:1: ( ( rule__HOClass__SuperClassesAssignment_5_1 ) )
            {
            // InternalOntoL.g:3515:1: ( ( rule__HOClass__SuperClassesAssignment_5_1 ) )
            // InternalOntoL.g:3516:2: ( rule__HOClass__SuperClassesAssignment_5_1 )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesAssignment_5_1()); 
            // InternalOntoL.g:3517:2: ( rule__HOClass__SuperClassesAssignment_5_1 )
            // InternalOntoL.g:3517:3: rule__HOClass__SuperClassesAssignment_5_1
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
    // InternalOntoL.g:3525:1: rule__HOClass__Group_5__2 : rule__HOClass__Group_5__2__Impl ;
    public final void rule__HOClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3529:1: ( rule__HOClass__Group_5__2__Impl )
            // InternalOntoL.g:3530:2: rule__HOClass__Group_5__2__Impl
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
    // InternalOntoL.g:3536:1: rule__HOClass__Group_5__2__Impl : ( ( rule__HOClass__Group_5_2__0 )* ) ;
    public final void rule__HOClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3540:1: ( ( ( rule__HOClass__Group_5_2__0 )* ) )
            // InternalOntoL.g:3541:1: ( ( rule__HOClass__Group_5_2__0 )* )
            {
            // InternalOntoL.g:3541:1: ( ( rule__HOClass__Group_5_2__0 )* )
            // InternalOntoL.g:3542:2: ( rule__HOClass__Group_5_2__0 )*
            {
             before(grammarAccess.getHOClassAccess().getGroup_5_2()); 
            // InternalOntoL.g:3543:2: ( rule__HOClass__Group_5_2__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==28) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalOntoL.g:3543:3: rule__HOClass__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__HOClass__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalOntoL.g:3552:1: rule__HOClass__Group_5_2__0 : rule__HOClass__Group_5_2__0__Impl rule__HOClass__Group_5_2__1 ;
    public final void rule__HOClass__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3556:1: ( rule__HOClass__Group_5_2__0__Impl rule__HOClass__Group_5_2__1 )
            // InternalOntoL.g:3557:2: rule__HOClass__Group_5_2__0__Impl rule__HOClass__Group_5_2__1
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
    // InternalOntoL.g:3564:1: rule__HOClass__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__HOClass__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3568:1: ( ( ',' ) )
            // InternalOntoL.g:3569:1: ( ',' )
            {
            // InternalOntoL.g:3569:1: ( ',' )
            // InternalOntoL.g:3570:2: ','
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
    // InternalOntoL.g:3579:1: rule__HOClass__Group_5_2__1 : rule__HOClass__Group_5_2__1__Impl ;
    public final void rule__HOClass__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3583:1: ( rule__HOClass__Group_5_2__1__Impl )
            // InternalOntoL.g:3584:2: rule__HOClass__Group_5_2__1__Impl
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
    // InternalOntoL.g:3590:1: rule__HOClass__Group_5_2__1__Impl : ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) ) ;
    public final void rule__HOClass__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3594:1: ( ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) ) )
            // InternalOntoL.g:3595:1: ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) )
            {
            // InternalOntoL.g:3595:1: ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) )
            // InternalOntoL.g:3596:2: ( rule__HOClass__SuperClassesAssignment_5_2_1 )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesAssignment_5_2_1()); 
            // InternalOntoL.g:3597:2: ( rule__HOClass__SuperClassesAssignment_5_2_1 )
            // InternalOntoL.g:3597:3: rule__HOClass__SuperClassesAssignment_5_2_1
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
    // InternalOntoL.g:3606:1: rule__HOClass__Group_6__0 : rule__HOClass__Group_6__0__Impl rule__HOClass__Group_6__1 ;
    public final void rule__HOClass__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3610:1: ( rule__HOClass__Group_6__0__Impl rule__HOClass__Group_6__1 )
            // InternalOntoL.g:3611:2: rule__HOClass__Group_6__0__Impl rule__HOClass__Group_6__1
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
    // InternalOntoL.g:3618:1: rule__HOClass__Group_6__0__Impl : ( 'subordinatedto' ) ;
    public final void rule__HOClass__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3622:1: ( ( 'subordinatedto' ) )
            // InternalOntoL.g:3623:1: ( 'subordinatedto' )
            {
            // InternalOntoL.g:3623:1: ( 'subordinatedto' )
            // InternalOntoL.g:3624:2: 'subordinatedto'
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
    // InternalOntoL.g:3633:1: rule__HOClass__Group_6__1 : rule__HOClass__Group_6__1__Impl rule__HOClass__Group_6__2 ;
    public final void rule__HOClass__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3637:1: ( rule__HOClass__Group_6__1__Impl rule__HOClass__Group_6__2 )
            // InternalOntoL.g:3638:2: rule__HOClass__Group_6__1__Impl rule__HOClass__Group_6__2
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
    // InternalOntoL.g:3645:1: rule__HOClass__Group_6__1__Impl : ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) ) ;
    public final void rule__HOClass__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3649:1: ( ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) ) )
            // InternalOntoL.g:3650:1: ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) )
            {
            // InternalOntoL.g:3650:1: ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) )
            // InternalOntoL.g:3651:2: ( rule__HOClass__SubordinatorsAssignment_6_1 )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsAssignment_6_1()); 
            // InternalOntoL.g:3652:2: ( rule__HOClass__SubordinatorsAssignment_6_1 )
            // InternalOntoL.g:3652:3: rule__HOClass__SubordinatorsAssignment_6_1
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
    // InternalOntoL.g:3660:1: rule__HOClass__Group_6__2 : rule__HOClass__Group_6__2__Impl ;
    public final void rule__HOClass__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3664:1: ( rule__HOClass__Group_6__2__Impl )
            // InternalOntoL.g:3665:2: rule__HOClass__Group_6__2__Impl
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
    // InternalOntoL.g:3671:1: rule__HOClass__Group_6__2__Impl : ( ( rule__HOClass__Group_6_2__0 )* ) ;
    public final void rule__HOClass__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3675:1: ( ( ( rule__HOClass__Group_6_2__0 )* ) )
            // InternalOntoL.g:3676:1: ( ( rule__HOClass__Group_6_2__0 )* )
            {
            // InternalOntoL.g:3676:1: ( ( rule__HOClass__Group_6_2__0 )* )
            // InternalOntoL.g:3677:2: ( rule__HOClass__Group_6_2__0 )*
            {
             before(grammarAccess.getHOClassAccess().getGroup_6_2()); 
            // InternalOntoL.g:3678:2: ( rule__HOClass__Group_6_2__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==28) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalOntoL.g:3678:3: rule__HOClass__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__HOClass__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalOntoL.g:3687:1: rule__HOClass__Group_6_2__0 : rule__HOClass__Group_6_2__0__Impl rule__HOClass__Group_6_2__1 ;
    public final void rule__HOClass__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3691:1: ( rule__HOClass__Group_6_2__0__Impl rule__HOClass__Group_6_2__1 )
            // InternalOntoL.g:3692:2: rule__HOClass__Group_6_2__0__Impl rule__HOClass__Group_6_2__1
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
    // InternalOntoL.g:3699:1: rule__HOClass__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__HOClass__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3703:1: ( ( ',' ) )
            // InternalOntoL.g:3704:1: ( ',' )
            {
            // InternalOntoL.g:3704:1: ( ',' )
            // InternalOntoL.g:3705:2: ','
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
    // InternalOntoL.g:3714:1: rule__HOClass__Group_6_2__1 : rule__HOClass__Group_6_2__1__Impl ;
    public final void rule__HOClass__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3718:1: ( rule__HOClass__Group_6_2__1__Impl )
            // InternalOntoL.g:3719:2: rule__HOClass__Group_6_2__1__Impl
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
    // InternalOntoL.g:3725:1: rule__HOClass__Group_6_2__1__Impl : ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) ) ;
    public final void rule__HOClass__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3729:1: ( ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) ) )
            // InternalOntoL.g:3730:1: ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) )
            {
            // InternalOntoL.g:3730:1: ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) )
            // InternalOntoL.g:3731:2: ( rule__HOClass__SubordinatorsAssignment_6_2_1 )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsAssignment_6_2_1()); 
            // InternalOntoL.g:3732:2: ( rule__HOClass__SubordinatorsAssignment_6_2_1 )
            // InternalOntoL.g:3732:3: rule__HOClass__SubordinatorsAssignment_6_2_1
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
    // InternalOntoL.g:3741:1: rule__HOClass__Group_7_0__0 : rule__HOClass__Group_7_0__0__Impl rule__HOClass__Group_7_0__1 ;
    public final void rule__HOClass__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3745:1: ( rule__HOClass__Group_7_0__0__Impl rule__HOClass__Group_7_0__1 )
            // InternalOntoL.g:3746:2: rule__HOClass__Group_7_0__0__Impl rule__HOClass__Group_7_0__1
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
    // InternalOntoL.g:3753:1: rule__HOClass__Group_7_0__0__Impl : ( ( rule__HOClass__CategorizationTypeAssignment_7_0_0 ) ) ;
    public final void rule__HOClass__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3757:1: ( ( ( rule__HOClass__CategorizationTypeAssignment_7_0_0 ) ) )
            // InternalOntoL.g:3758:1: ( ( rule__HOClass__CategorizationTypeAssignment_7_0_0 ) )
            {
            // InternalOntoL.g:3758:1: ( ( rule__HOClass__CategorizationTypeAssignment_7_0_0 ) )
            // InternalOntoL.g:3759:2: ( rule__HOClass__CategorizationTypeAssignment_7_0_0 )
            {
             before(grammarAccess.getHOClassAccess().getCategorizationTypeAssignment_7_0_0()); 
            // InternalOntoL.g:3760:2: ( rule__HOClass__CategorizationTypeAssignment_7_0_0 )
            // InternalOntoL.g:3760:3: rule__HOClass__CategorizationTypeAssignment_7_0_0
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
    // InternalOntoL.g:3768:1: rule__HOClass__Group_7_0__1 : rule__HOClass__Group_7_0__1__Impl ;
    public final void rule__HOClass__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3772:1: ( rule__HOClass__Group_7_0__1__Impl )
            // InternalOntoL.g:3773:2: rule__HOClass__Group_7_0__1__Impl
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
    // InternalOntoL.g:3779:1: rule__HOClass__Group_7_0__1__Impl : ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) ) ;
    public final void rule__HOClass__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3783:1: ( ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) ) )
            // InternalOntoL.g:3784:1: ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) )
            {
            // InternalOntoL.g:3784:1: ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) )
            // InternalOntoL.g:3785:2: ( rule__HOClass__BasetypeAssignment_7_0_1 )
            {
             before(grammarAccess.getHOClassAccess().getBasetypeAssignment_7_0_1()); 
            // InternalOntoL.g:3786:2: ( rule__HOClass__BasetypeAssignment_7_0_1 )
            // InternalOntoL.g:3786:3: rule__HOClass__BasetypeAssignment_7_0_1
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
    // InternalOntoL.g:3795:1: rule__HOClass__Group_7_1__0 : rule__HOClass__Group_7_1__0__Impl rule__HOClass__Group_7_1__1 ;
    public final void rule__HOClass__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3799:1: ( rule__HOClass__Group_7_1__0__Impl rule__HOClass__Group_7_1__1 )
            // InternalOntoL.g:3800:2: rule__HOClass__Group_7_1__0__Impl rule__HOClass__Group_7_1__1
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
    // InternalOntoL.g:3807:1: rule__HOClass__Group_7_1__0__Impl : ( 'ispowertypeof' ) ;
    public final void rule__HOClass__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3811:1: ( ( 'ispowertypeof' ) )
            // InternalOntoL.g:3812:1: ( 'ispowertypeof' )
            {
            // InternalOntoL.g:3812:1: ( 'ispowertypeof' )
            // InternalOntoL.g:3813:2: 'ispowertypeof'
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
    // InternalOntoL.g:3822:1: rule__HOClass__Group_7_1__1 : rule__HOClass__Group_7_1__1__Impl ;
    public final void rule__HOClass__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3826:1: ( rule__HOClass__Group_7_1__1__Impl )
            // InternalOntoL.g:3827:2: rule__HOClass__Group_7_1__1__Impl
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
    // InternalOntoL.g:3833:1: rule__HOClass__Group_7_1__1__Impl : ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) ) ;
    public final void rule__HOClass__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3837:1: ( ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) ) )
            // InternalOntoL.g:3838:1: ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) )
            {
            // InternalOntoL.g:3838:1: ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) )
            // InternalOntoL.g:3839:2: ( rule__HOClass__PowertypeOfAssignment_7_1_1 )
            {
             before(grammarAccess.getHOClassAccess().getPowertypeOfAssignment_7_1_1()); 
            // InternalOntoL.g:3840:2: ( rule__HOClass__PowertypeOfAssignment_7_1_1 )
            // InternalOntoL.g:3840:3: rule__HOClass__PowertypeOfAssignment_7_1_1
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
    // InternalOntoL.g:3849:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3853:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalOntoL.g:3854:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalOntoL.g:3861:1: rule__Attribute__Group__0__Impl : ( 'att' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3865:1: ( ( 'att' ) )
            // InternalOntoL.g:3866:1: ( 'att' )
            {
            // InternalOntoL.g:3866:1: ( 'att' )
            // InternalOntoL.g:3867:2: 'att'
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
    // InternalOntoL.g:3876:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3880:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalOntoL.g:3881:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalOntoL.g:3888:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3892:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalOntoL.g:3893:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalOntoL.g:3893:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalOntoL.g:3894:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalOntoL.g:3895:2: ( rule__Attribute__NameAssignment_1 )
            // InternalOntoL.g:3895:3: rule__Attribute__NameAssignment_1
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
    // InternalOntoL.g:3903:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3907:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalOntoL.g:3908:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalOntoL.g:3915:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3919:1: ( ( ':' ) )
            // InternalOntoL.g:3920:1: ( ':' )
            {
            // InternalOntoL.g:3920:1: ( ':' )
            // InternalOntoL.g:3921:2: ':'
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
    // InternalOntoL.g:3930:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3934:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalOntoL.g:3935:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalOntoL.g:3942:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__Group_3__0 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3946:1: ( ( ( rule__Attribute__Group_3__0 )? ) )
            // InternalOntoL.g:3947:1: ( ( rule__Attribute__Group_3__0 )? )
            {
            // InternalOntoL.g:3947:1: ( ( rule__Attribute__Group_3__0 )? )
            // InternalOntoL.g:3948:2: ( rule__Attribute__Group_3__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_3()); 
            // InternalOntoL.g:3949:2: ( rule__Attribute__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==37) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOntoL.g:3949:3: rule__Attribute__Group_3__0
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
    // InternalOntoL.g:3957:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3961:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalOntoL.g:3962:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
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
    // InternalOntoL.g:3969:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__PropertyClassAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3973:1: ( ( ( rule__Attribute__PropertyClassAssignment_4 ) ) )
            // InternalOntoL.g:3974:1: ( ( rule__Attribute__PropertyClassAssignment_4 ) )
            {
            // InternalOntoL.g:3974:1: ( ( rule__Attribute__PropertyClassAssignment_4 ) )
            // InternalOntoL.g:3975:2: ( rule__Attribute__PropertyClassAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getPropertyClassAssignment_4()); 
            // InternalOntoL.g:3976:2: ( rule__Attribute__PropertyClassAssignment_4 )
            // InternalOntoL.g:3976:3: rule__Attribute__PropertyClassAssignment_4
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
    // InternalOntoL.g:3984:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3988:1: ( rule__Attribute__Group__5__Impl )
            // InternalOntoL.g:3989:2: rule__Attribute__Group__5__Impl
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
    // InternalOntoL.g:3995:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3999:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalOntoL.g:4000:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalOntoL.g:4000:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalOntoL.g:4001:2: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // InternalOntoL.g:4002:2: ( rule__Attribute__Group_5__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==40) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOntoL.g:4002:3: rule__Attribute__Group_5__0
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
    // InternalOntoL.g:4011:1: rule__Attribute__Group_3__0 : rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 ;
    public final void rule__Attribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4015:1: ( rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 )
            // InternalOntoL.g:4016:2: rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1
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
    // InternalOntoL.g:4023:1: rule__Attribute__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4027:1: ( ( '[' ) )
            // InternalOntoL.g:4028:1: ( '[' )
            {
            // InternalOntoL.g:4028:1: ( '[' )
            // InternalOntoL.g:4029:2: '['
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
    // InternalOntoL.g:4038:1: rule__Attribute__Group_3__1 : rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2 ;
    public final void rule__Attribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4042:1: ( rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2 )
            // InternalOntoL.g:4043:2: rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2
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
    // InternalOntoL.g:4050:1: rule__Attribute__Group_3__1__Impl : ( ( rule__Attribute__LowerBoundAssignment_3_1 ) ) ;
    public final void rule__Attribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4054:1: ( ( ( rule__Attribute__LowerBoundAssignment_3_1 ) ) )
            // InternalOntoL.g:4055:1: ( ( rule__Attribute__LowerBoundAssignment_3_1 ) )
            {
            // InternalOntoL.g:4055:1: ( ( rule__Attribute__LowerBoundAssignment_3_1 ) )
            // InternalOntoL.g:4056:2: ( rule__Attribute__LowerBoundAssignment_3_1 )
            {
             before(grammarAccess.getAttributeAccess().getLowerBoundAssignment_3_1()); 
            // InternalOntoL.g:4057:2: ( rule__Attribute__LowerBoundAssignment_3_1 )
            // InternalOntoL.g:4057:3: rule__Attribute__LowerBoundAssignment_3_1
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
    // InternalOntoL.g:4065:1: rule__Attribute__Group_3__2 : rule__Attribute__Group_3__2__Impl rule__Attribute__Group_3__3 ;
    public final void rule__Attribute__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4069:1: ( rule__Attribute__Group_3__2__Impl rule__Attribute__Group_3__3 )
            // InternalOntoL.g:4070:2: rule__Attribute__Group_3__2__Impl rule__Attribute__Group_3__3
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
    // InternalOntoL.g:4077:1: rule__Attribute__Group_3__2__Impl : ( '..' ) ;
    public final void rule__Attribute__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4081:1: ( ( '..' ) )
            // InternalOntoL.g:4082:1: ( '..' )
            {
            // InternalOntoL.g:4082:1: ( '..' )
            // InternalOntoL.g:4083:2: '..'
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
    // InternalOntoL.g:4092:1: rule__Attribute__Group_3__3 : rule__Attribute__Group_3__3__Impl rule__Attribute__Group_3__4 ;
    public final void rule__Attribute__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4096:1: ( rule__Attribute__Group_3__3__Impl rule__Attribute__Group_3__4 )
            // InternalOntoL.g:4097:2: rule__Attribute__Group_3__3__Impl rule__Attribute__Group_3__4
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
    // InternalOntoL.g:4104:1: rule__Attribute__Group_3__3__Impl : ( ( rule__Attribute__UpperBoundAssignment_3_3 ) ) ;
    public final void rule__Attribute__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4108:1: ( ( ( rule__Attribute__UpperBoundAssignment_3_3 ) ) )
            // InternalOntoL.g:4109:1: ( ( rule__Attribute__UpperBoundAssignment_3_3 ) )
            {
            // InternalOntoL.g:4109:1: ( ( rule__Attribute__UpperBoundAssignment_3_3 ) )
            // InternalOntoL.g:4110:2: ( rule__Attribute__UpperBoundAssignment_3_3 )
            {
             before(grammarAccess.getAttributeAccess().getUpperBoundAssignment_3_3()); 
            // InternalOntoL.g:4111:2: ( rule__Attribute__UpperBoundAssignment_3_3 )
            // InternalOntoL.g:4111:3: rule__Attribute__UpperBoundAssignment_3_3
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
    // InternalOntoL.g:4119:1: rule__Attribute__Group_3__4 : rule__Attribute__Group_3__4__Impl ;
    public final void rule__Attribute__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4123:1: ( rule__Attribute__Group_3__4__Impl )
            // InternalOntoL.g:4124:2: rule__Attribute__Group_3__4__Impl
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
    // InternalOntoL.g:4130:1: rule__Attribute__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4134:1: ( ( ']' ) )
            // InternalOntoL.g:4135:1: ( ']' )
            {
            // InternalOntoL.g:4135:1: ( ']' )
            // InternalOntoL.g:4136:2: ']'
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
    // InternalOntoL.g:4146:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4150:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalOntoL.g:4151:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
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
    // InternalOntoL.g:4158:1: rule__Attribute__Group_5__0__Impl : ( 'subsets' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4162:1: ( ( 'subsets' ) )
            // InternalOntoL.g:4163:1: ( 'subsets' )
            {
            // InternalOntoL.g:4163:1: ( 'subsets' )
            // InternalOntoL.g:4164:2: 'subsets'
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
    // InternalOntoL.g:4173:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4177:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // InternalOntoL.g:4178:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
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
    // InternalOntoL.g:4185:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__SubsetOfAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4189:1: ( ( ( rule__Attribute__SubsetOfAssignment_5_1 ) ) )
            // InternalOntoL.g:4190:1: ( ( rule__Attribute__SubsetOfAssignment_5_1 ) )
            {
            // InternalOntoL.g:4190:1: ( ( rule__Attribute__SubsetOfAssignment_5_1 ) )
            // InternalOntoL.g:4191:2: ( rule__Attribute__SubsetOfAssignment_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAssignment_5_1()); 
            // InternalOntoL.g:4192:2: ( rule__Attribute__SubsetOfAssignment_5_1 )
            // InternalOntoL.g:4192:3: rule__Attribute__SubsetOfAssignment_5_1
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
    // InternalOntoL.g:4200:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4204:1: ( rule__Attribute__Group_5__2__Impl )
            // InternalOntoL.g:4205:2: rule__Attribute__Group_5__2__Impl
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
    // InternalOntoL.g:4211:1: rule__Attribute__Group_5__2__Impl : ( ( rule__Attribute__Group_5_2__0 )* ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4215:1: ( ( ( rule__Attribute__Group_5_2__0 )* ) )
            // InternalOntoL.g:4216:1: ( ( rule__Attribute__Group_5_2__0 )* )
            {
            // InternalOntoL.g:4216:1: ( ( rule__Attribute__Group_5_2__0 )* )
            // InternalOntoL.g:4217:2: ( rule__Attribute__Group_5_2__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_5_2()); 
            // InternalOntoL.g:4218:2: ( rule__Attribute__Group_5_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==28) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalOntoL.g:4218:3: rule__Attribute__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Attribute__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalOntoL.g:4227:1: rule__Attribute__Group_5_2__0 : rule__Attribute__Group_5_2__0__Impl rule__Attribute__Group_5_2__1 ;
    public final void rule__Attribute__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4231:1: ( rule__Attribute__Group_5_2__0__Impl rule__Attribute__Group_5_2__1 )
            // InternalOntoL.g:4232:2: rule__Attribute__Group_5_2__0__Impl rule__Attribute__Group_5_2__1
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
    // InternalOntoL.g:4239:1: rule__Attribute__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4243:1: ( ( ',' ) )
            // InternalOntoL.g:4244:1: ( ',' )
            {
            // InternalOntoL.g:4244:1: ( ',' )
            // InternalOntoL.g:4245:2: ','
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
    // InternalOntoL.g:4254:1: rule__Attribute__Group_5_2__1 : rule__Attribute__Group_5_2__1__Impl ;
    public final void rule__Attribute__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4258:1: ( rule__Attribute__Group_5_2__1__Impl )
            // InternalOntoL.g:4259:2: rule__Attribute__Group_5_2__1__Impl
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
    // InternalOntoL.g:4265:1: rule__Attribute__Group_5_2__1__Impl : ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) ) ;
    public final void rule__Attribute__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4269:1: ( ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) ) )
            // InternalOntoL.g:4270:1: ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) )
            {
            // InternalOntoL.g:4270:1: ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) )
            // InternalOntoL.g:4271:2: ( rule__Attribute__SubsetOfAssignment_5_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAssignment_5_2_1()); 
            // InternalOntoL.g:4272:2: ( rule__Attribute__SubsetOfAssignment_5_2_1 )
            // InternalOntoL.g:4272:3: rule__Attribute__SubsetOfAssignment_5_2_1
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
    // InternalOntoL.g:4281:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4285:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalOntoL.g:4286:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
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
    // InternalOntoL.g:4293:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4297:1: ( ( 'ref' ) )
            // InternalOntoL.g:4298:1: ( 'ref' )
            {
            // InternalOntoL.g:4298:1: ( 'ref' )
            // InternalOntoL.g:4299:2: 'ref'
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
    // InternalOntoL.g:4308:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4312:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalOntoL.g:4313:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
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
    // InternalOntoL.g:4320:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4324:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // InternalOntoL.g:4325:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // InternalOntoL.g:4325:1: ( ( rule__Reference__NameAssignment_1 ) )
            // InternalOntoL.g:4326:2: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // InternalOntoL.g:4327:2: ( rule__Reference__NameAssignment_1 )
            // InternalOntoL.g:4327:3: rule__Reference__NameAssignment_1
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
    // InternalOntoL.g:4335:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4339:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalOntoL.g:4340:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
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
    // InternalOntoL.g:4347:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4351:1: ( ( ':' ) )
            // InternalOntoL.g:4352:1: ( ':' )
            {
            // InternalOntoL.g:4352:1: ( ':' )
            // InternalOntoL.g:4353:2: ':'
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
    // InternalOntoL.g:4362:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4366:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // InternalOntoL.g:4367:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
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
    // InternalOntoL.g:4374:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__Group_3__0 )? ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4378:1: ( ( ( rule__Reference__Group_3__0 )? ) )
            // InternalOntoL.g:4379:1: ( ( rule__Reference__Group_3__0 )? )
            {
            // InternalOntoL.g:4379:1: ( ( rule__Reference__Group_3__0 )? )
            // InternalOntoL.g:4380:2: ( rule__Reference__Group_3__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_3()); 
            // InternalOntoL.g:4381:2: ( rule__Reference__Group_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==37) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalOntoL.g:4381:3: rule__Reference__Group_3__0
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
    // InternalOntoL.g:4389:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4393:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // InternalOntoL.g:4394:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
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
    // InternalOntoL.g:4401:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__PropertyClassAssignment_4 ) ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4405:1: ( ( ( rule__Reference__PropertyClassAssignment_4 ) ) )
            // InternalOntoL.g:4406:1: ( ( rule__Reference__PropertyClassAssignment_4 ) )
            {
            // InternalOntoL.g:4406:1: ( ( rule__Reference__PropertyClassAssignment_4 ) )
            // InternalOntoL.g:4407:2: ( rule__Reference__PropertyClassAssignment_4 )
            {
             before(grammarAccess.getReferenceAccess().getPropertyClassAssignment_4()); 
            // InternalOntoL.g:4408:2: ( rule__Reference__PropertyClassAssignment_4 )
            // InternalOntoL.g:4408:3: rule__Reference__PropertyClassAssignment_4
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
    // InternalOntoL.g:4416:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl rule__Reference__Group__6 ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4420:1: ( rule__Reference__Group__5__Impl rule__Reference__Group__6 )
            // InternalOntoL.g:4421:2: rule__Reference__Group__5__Impl rule__Reference__Group__6
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
    // InternalOntoL.g:4428:1: rule__Reference__Group__5__Impl : ( ( rule__Reference__Group_5__0 )? ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4432:1: ( ( ( rule__Reference__Group_5__0 )? ) )
            // InternalOntoL.g:4433:1: ( ( rule__Reference__Group_5__0 )? )
            {
            // InternalOntoL.g:4433:1: ( ( rule__Reference__Group_5__0 )? )
            // InternalOntoL.g:4434:2: ( rule__Reference__Group_5__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_5()); 
            // InternalOntoL.g:4435:2: ( rule__Reference__Group_5__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==40) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalOntoL.g:4435:3: rule__Reference__Group_5__0
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
    // InternalOntoL.g:4443:1: rule__Reference__Group__6 : rule__Reference__Group__6__Impl ;
    public final void rule__Reference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4447:1: ( rule__Reference__Group__6__Impl )
            // InternalOntoL.g:4448:2: rule__Reference__Group__6__Impl
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
    // InternalOntoL.g:4454:1: rule__Reference__Group__6__Impl : ( ( rule__Reference__Group_6__0 )? ) ;
    public final void rule__Reference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4458:1: ( ( ( rule__Reference__Group_6__0 )? ) )
            // InternalOntoL.g:4459:1: ( ( rule__Reference__Group_6__0 )? )
            {
            // InternalOntoL.g:4459:1: ( ( rule__Reference__Group_6__0 )? )
            // InternalOntoL.g:4460:2: ( rule__Reference__Group_6__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_6()); 
            // InternalOntoL.g:4461:2: ( rule__Reference__Group_6__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==42) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOntoL.g:4461:3: rule__Reference__Group_6__0
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
    // InternalOntoL.g:4470:1: rule__Reference__Group_3__0 : rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1 ;
    public final void rule__Reference__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4474:1: ( rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1 )
            // InternalOntoL.g:4475:2: rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1
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
    // InternalOntoL.g:4482:1: rule__Reference__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Reference__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4486:1: ( ( '[' ) )
            // InternalOntoL.g:4487:1: ( '[' )
            {
            // InternalOntoL.g:4487:1: ( '[' )
            // InternalOntoL.g:4488:2: '['
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
    // InternalOntoL.g:4497:1: rule__Reference__Group_3__1 : rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2 ;
    public final void rule__Reference__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4501:1: ( rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2 )
            // InternalOntoL.g:4502:2: rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2
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
    // InternalOntoL.g:4509:1: rule__Reference__Group_3__1__Impl : ( ( rule__Reference__LowerBoundAssignment_3_1 ) ) ;
    public final void rule__Reference__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4513:1: ( ( ( rule__Reference__LowerBoundAssignment_3_1 ) ) )
            // InternalOntoL.g:4514:1: ( ( rule__Reference__LowerBoundAssignment_3_1 ) )
            {
            // InternalOntoL.g:4514:1: ( ( rule__Reference__LowerBoundAssignment_3_1 ) )
            // InternalOntoL.g:4515:2: ( rule__Reference__LowerBoundAssignment_3_1 )
            {
             before(grammarAccess.getReferenceAccess().getLowerBoundAssignment_3_1()); 
            // InternalOntoL.g:4516:2: ( rule__Reference__LowerBoundAssignment_3_1 )
            // InternalOntoL.g:4516:3: rule__Reference__LowerBoundAssignment_3_1
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
    // InternalOntoL.g:4524:1: rule__Reference__Group_3__2 : rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3 ;
    public final void rule__Reference__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4528:1: ( rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3 )
            // InternalOntoL.g:4529:2: rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3
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
    // InternalOntoL.g:4536:1: rule__Reference__Group_3__2__Impl : ( '..' ) ;
    public final void rule__Reference__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4540:1: ( ( '..' ) )
            // InternalOntoL.g:4541:1: ( '..' )
            {
            // InternalOntoL.g:4541:1: ( '..' )
            // InternalOntoL.g:4542:2: '..'
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
    // InternalOntoL.g:4551:1: rule__Reference__Group_3__3 : rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4 ;
    public final void rule__Reference__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4555:1: ( rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4 )
            // InternalOntoL.g:4556:2: rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4
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
    // InternalOntoL.g:4563:1: rule__Reference__Group_3__3__Impl : ( ( rule__Reference__UpperBoundAssignment_3_3 ) ) ;
    public final void rule__Reference__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4567:1: ( ( ( rule__Reference__UpperBoundAssignment_3_3 ) ) )
            // InternalOntoL.g:4568:1: ( ( rule__Reference__UpperBoundAssignment_3_3 ) )
            {
            // InternalOntoL.g:4568:1: ( ( rule__Reference__UpperBoundAssignment_3_3 ) )
            // InternalOntoL.g:4569:2: ( rule__Reference__UpperBoundAssignment_3_3 )
            {
             before(grammarAccess.getReferenceAccess().getUpperBoundAssignment_3_3()); 
            // InternalOntoL.g:4570:2: ( rule__Reference__UpperBoundAssignment_3_3 )
            // InternalOntoL.g:4570:3: rule__Reference__UpperBoundAssignment_3_3
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
    // InternalOntoL.g:4578:1: rule__Reference__Group_3__4 : rule__Reference__Group_3__4__Impl ;
    public final void rule__Reference__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4582:1: ( rule__Reference__Group_3__4__Impl )
            // InternalOntoL.g:4583:2: rule__Reference__Group_3__4__Impl
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
    // InternalOntoL.g:4589:1: rule__Reference__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Reference__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4593:1: ( ( ']' ) )
            // InternalOntoL.g:4594:1: ( ']' )
            {
            // InternalOntoL.g:4594:1: ( ']' )
            // InternalOntoL.g:4595:2: ']'
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
    // InternalOntoL.g:4605:1: rule__Reference__Group_5__0 : rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 ;
    public final void rule__Reference__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4609:1: ( rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 )
            // InternalOntoL.g:4610:2: rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1
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
    // InternalOntoL.g:4617:1: rule__Reference__Group_5__0__Impl : ( 'subsets' ) ;
    public final void rule__Reference__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4621:1: ( ( 'subsets' ) )
            // InternalOntoL.g:4622:1: ( 'subsets' )
            {
            // InternalOntoL.g:4622:1: ( 'subsets' )
            // InternalOntoL.g:4623:2: 'subsets'
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
    // InternalOntoL.g:4632:1: rule__Reference__Group_5__1 : rule__Reference__Group_5__1__Impl rule__Reference__Group_5__2 ;
    public final void rule__Reference__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4636:1: ( rule__Reference__Group_5__1__Impl rule__Reference__Group_5__2 )
            // InternalOntoL.g:4637:2: rule__Reference__Group_5__1__Impl rule__Reference__Group_5__2
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
    // InternalOntoL.g:4644:1: rule__Reference__Group_5__1__Impl : ( ( rule__Reference__SubsetOfAssignment_5_1 ) ) ;
    public final void rule__Reference__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4648:1: ( ( ( rule__Reference__SubsetOfAssignment_5_1 ) ) )
            // InternalOntoL.g:4649:1: ( ( rule__Reference__SubsetOfAssignment_5_1 ) )
            {
            // InternalOntoL.g:4649:1: ( ( rule__Reference__SubsetOfAssignment_5_1 ) )
            // InternalOntoL.g:4650:2: ( rule__Reference__SubsetOfAssignment_5_1 )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfAssignment_5_1()); 
            // InternalOntoL.g:4651:2: ( rule__Reference__SubsetOfAssignment_5_1 )
            // InternalOntoL.g:4651:3: rule__Reference__SubsetOfAssignment_5_1
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
    // InternalOntoL.g:4659:1: rule__Reference__Group_5__2 : rule__Reference__Group_5__2__Impl ;
    public final void rule__Reference__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4663:1: ( rule__Reference__Group_5__2__Impl )
            // InternalOntoL.g:4664:2: rule__Reference__Group_5__2__Impl
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
    // InternalOntoL.g:4670:1: rule__Reference__Group_5__2__Impl : ( ( rule__Reference__Group_5_2__0 )* ) ;
    public final void rule__Reference__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4674:1: ( ( ( rule__Reference__Group_5_2__0 )* ) )
            // InternalOntoL.g:4675:1: ( ( rule__Reference__Group_5_2__0 )* )
            {
            // InternalOntoL.g:4675:1: ( ( rule__Reference__Group_5_2__0 )* )
            // InternalOntoL.g:4676:2: ( rule__Reference__Group_5_2__0 )*
            {
             before(grammarAccess.getReferenceAccess().getGroup_5_2()); 
            // InternalOntoL.g:4677:2: ( rule__Reference__Group_5_2__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==28) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalOntoL.g:4677:3: rule__Reference__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Reference__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalOntoL.g:4686:1: rule__Reference__Group_5_2__0 : rule__Reference__Group_5_2__0__Impl rule__Reference__Group_5_2__1 ;
    public final void rule__Reference__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4690:1: ( rule__Reference__Group_5_2__0__Impl rule__Reference__Group_5_2__1 )
            // InternalOntoL.g:4691:2: rule__Reference__Group_5_2__0__Impl rule__Reference__Group_5_2__1
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
    // InternalOntoL.g:4698:1: rule__Reference__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Reference__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4702:1: ( ( ',' ) )
            // InternalOntoL.g:4703:1: ( ',' )
            {
            // InternalOntoL.g:4703:1: ( ',' )
            // InternalOntoL.g:4704:2: ','
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
    // InternalOntoL.g:4713:1: rule__Reference__Group_5_2__1 : rule__Reference__Group_5_2__1__Impl ;
    public final void rule__Reference__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4717:1: ( rule__Reference__Group_5_2__1__Impl )
            // InternalOntoL.g:4718:2: rule__Reference__Group_5_2__1__Impl
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
    // InternalOntoL.g:4724:1: rule__Reference__Group_5_2__1__Impl : ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) ) ;
    public final void rule__Reference__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4728:1: ( ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) ) )
            // InternalOntoL.g:4729:1: ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) )
            {
            // InternalOntoL.g:4729:1: ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) )
            // InternalOntoL.g:4730:2: ( rule__Reference__SubsetOfAssignment_5_2_1 )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfAssignment_5_2_1()); 
            // InternalOntoL.g:4731:2: ( rule__Reference__SubsetOfAssignment_5_2_1 )
            // InternalOntoL.g:4731:3: rule__Reference__SubsetOfAssignment_5_2_1
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
    // InternalOntoL.g:4740:1: rule__Reference__Group_6__0 : rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1 ;
    public final void rule__Reference__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4744:1: ( rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1 )
            // InternalOntoL.g:4745:2: rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1
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
    // InternalOntoL.g:4752:1: rule__Reference__Group_6__0__Impl : ( 'isoppositeto' ) ;
    public final void rule__Reference__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4756:1: ( ( 'isoppositeto' ) )
            // InternalOntoL.g:4757:1: ( 'isoppositeto' )
            {
            // InternalOntoL.g:4757:1: ( 'isoppositeto' )
            // InternalOntoL.g:4758:2: 'isoppositeto'
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
    // InternalOntoL.g:4767:1: rule__Reference__Group_6__1 : rule__Reference__Group_6__1__Impl ;
    public final void rule__Reference__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4771:1: ( rule__Reference__Group_6__1__Impl )
            // InternalOntoL.g:4772:2: rule__Reference__Group_6__1__Impl
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
    // InternalOntoL.g:4778:1: rule__Reference__Group_6__1__Impl : ( ( rule__Reference__OppositeToAssignment_6_1 ) ) ;
    public final void rule__Reference__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4782:1: ( ( ( rule__Reference__OppositeToAssignment_6_1 ) ) )
            // InternalOntoL.g:4783:1: ( ( rule__Reference__OppositeToAssignment_6_1 ) )
            {
            // InternalOntoL.g:4783:1: ( ( rule__Reference__OppositeToAssignment_6_1 ) )
            // InternalOntoL.g:4784:2: ( rule__Reference__OppositeToAssignment_6_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeToAssignment_6_1()); 
            // InternalOntoL.g:4785:2: ( rule__Reference__OppositeToAssignment_6_1 )
            // InternalOntoL.g:4785:3: rule__Reference__OppositeToAssignment_6_1
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
    // InternalOntoL.g:4794:1: rule__AttributeAssignment__Group__0 : rule__AttributeAssignment__Group__0__Impl rule__AttributeAssignment__Group__1 ;
    public final void rule__AttributeAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4798:1: ( rule__AttributeAssignment__Group__0__Impl rule__AttributeAssignment__Group__1 )
            // InternalOntoL.g:4799:2: rule__AttributeAssignment__Group__0__Impl rule__AttributeAssignment__Group__1
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
    // InternalOntoL.g:4806:1: rule__AttributeAssignment__Group__0__Impl : ( 'att' ) ;
    public final void rule__AttributeAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4810:1: ( ( 'att' ) )
            // InternalOntoL.g:4811:1: ( 'att' )
            {
            // InternalOntoL.g:4811:1: ( 'att' )
            // InternalOntoL.g:4812:2: 'att'
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
    // InternalOntoL.g:4821:1: rule__AttributeAssignment__Group__1 : rule__AttributeAssignment__Group__1__Impl rule__AttributeAssignment__Group__2 ;
    public final void rule__AttributeAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4825:1: ( rule__AttributeAssignment__Group__1__Impl rule__AttributeAssignment__Group__2 )
            // InternalOntoL.g:4826:2: rule__AttributeAssignment__Group__1__Impl rule__AttributeAssignment__Group__2
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
    // InternalOntoL.g:4833:1: rule__AttributeAssignment__Group__1__Impl : ( ( rule__AttributeAssignment__AttributeAssignment_1 ) ) ;
    public final void rule__AttributeAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4837:1: ( ( ( rule__AttributeAssignment__AttributeAssignment_1 ) ) )
            // InternalOntoL.g:4838:1: ( ( rule__AttributeAssignment__AttributeAssignment_1 ) )
            {
            // InternalOntoL.g:4838:1: ( ( rule__AttributeAssignment__AttributeAssignment_1 ) )
            // InternalOntoL.g:4839:2: ( rule__AttributeAssignment__AttributeAssignment_1 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAttributeAssignment_1()); 
            // InternalOntoL.g:4840:2: ( rule__AttributeAssignment__AttributeAssignment_1 )
            // InternalOntoL.g:4840:3: rule__AttributeAssignment__AttributeAssignment_1
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
    // InternalOntoL.g:4848:1: rule__AttributeAssignment__Group__2 : rule__AttributeAssignment__Group__2__Impl rule__AttributeAssignment__Group__3 ;
    public final void rule__AttributeAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4852:1: ( rule__AttributeAssignment__Group__2__Impl rule__AttributeAssignment__Group__3 )
            // InternalOntoL.g:4853:2: rule__AttributeAssignment__Group__2__Impl rule__AttributeAssignment__Group__3
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
    // InternalOntoL.g:4860:1: rule__AttributeAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__AttributeAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4864:1: ( ( '=' ) )
            // InternalOntoL.g:4865:1: ( '=' )
            {
            // InternalOntoL.g:4865:1: ( '=' )
            // InternalOntoL.g:4866:2: '='
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
    // InternalOntoL.g:4875:1: rule__AttributeAssignment__Group__3 : rule__AttributeAssignment__Group__3__Impl ;
    public final void rule__AttributeAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4879:1: ( rule__AttributeAssignment__Group__3__Impl )
            // InternalOntoL.g:4880:2: rule__AttributeAssignment__Group__3__Impl
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
    // InternalOntoL.g:4886:1: rule__AttributeAssignment__Group__3__Impl : ( ( rule__AttributeAssignment__Alternatives_3 ) ) ;
    public final void rule__AttributeAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4890:1: ( ( ( rule__AttributeAssignment__Alternatives_3 ) ) )
            // InternalOntoL.g:4891:1: ( ( rule__AttributeAssignment__Alternatives_3 ) )
            {
            // InternalOntoL.g:4891:1: ( ( rule__AttributeAssignment__Alternatives_3 ) )
            // InternalOntoL.g:4892:2: ( rule__AttributeAssignment__Alternatives_3 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAlternatives_3()); 
            // InternalOntoL.g:4893:2: ( rule__AttributeAssignment__Alternatives_3 )
            // InternalOntoL.g:4893:3: rule__AttributeAssignment__Alternatives_3
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
    // InternalOntoL.g:4902:1: rule__AttributeAssignment__Group_3_1__0 : rule__AttributeAssignment__Group_3_1__0__Impl rule__AttributeAssignment__Group_3_1__1 ;
    public final void rule__AttributeAssignment__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4906:1: ( rule__AttributeAssignment__Group_3_1__0__Impl rule__AttributeAssignment__Group_3_1__1 )
            // InternalOntoL.g:4907:2: rule__AttributeAssignment__Group_3_1__0__Impl rule__AttributeAssignment__Group_3_1__1
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
    // InternalOntoL.g:4914:1: rule__AttributeAssignment__Group_3_1__0__Impl : ( '{' ) ;
    public final void rule__AttributeAssignment__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4918:1: ( ( '{' ) )
            // InternalOntoL.g:4919:1: ( '{' )
            {
            // InternalOntoL.g:4919:1: ( '{' )
            // InternalOntoL.g:4920:2: '{'
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
    // InternalOntoL.g:4929:1: rule__AttributeAssignment__Group_3_1__1 : rule__AttributeAssignment__Group_3_1__1__Impl rule__AttributeAssignment__Group_3_1__2 ;
    public final void rule__AttributeAssignment__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4933:1: ( rule__AttributeAssignment__Group_3_1__1__Impl rule__AttributeAssignment__Group_3_1__2 )
            // InternalOntoL.g:4934:2: rule__AttributeAssignment__Group_3_1__1__Impl rule__AttributeAssignment__Group_3_1__2
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
    // InternalOntoL.g:4941:1: rule__AttributeAssignment__Group_3_1__1__Impl : ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 ) ) ;
    public final void rule__AttributeAssignment__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4945:1: ( ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 ) ) )
            // InternalOntoL.g:4946:1: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 ) )
            {
            // InternalOntoL.g:4946:1: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 ) )
            // InternalOntoL.g:4947:2: ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAssignmentsAssignment_3_1_1()); 
            // InternalOntoL.g:4948:2: ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 )
            // InternalOntoL.g:4948:3: rule__AttributeAssignment__AssignmentsAssignment_3_1_1
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
    // InternalOntoL.g:4956:1: rule__AttributeAssignment__Group_3_1__2 : rule__AttributeAssignment__Group_3_1__2__Impl rule__AttributeAssignment__Group_3_1__3 ;
    public final void rule__AttributeAssignment__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4960:1: ( rule__AttributeAssignment__Group_3_1__2__Impl rule__AttributeAssignment__Group_3_1__3 )
            // InternalOntoL.g:4961:2: rule__AttributeAssignment__Group_3_1__2__Impl rule__AttributeAssignment__Group_3_1__3
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
    // InternalOntoL.g:4968:1: rule__AttributeAssignment__Group_3_1__2__Impl : ( ( rule__AttributeAssignment__Group_3_1_2__0 )* ) ;
    public final void rule__AttributeAssignment__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4972:1: ( ( ( rule__AttributeAssignment__Group_3_1_2__0 )* ) )
            // InternalOntoL.g:4973:1: ( ( rule__AttributeAssignment__Group_3_1_2__0 )* )
            {
            // InternalOntoL.g:4973:1: ( ( rule__AttributeAssignment__Group_3_1_2__0 )* )
            // InternalOntoL.g:4974:2: ( rule__AttributeAssignment__Group_3_1_2__0 )*
            {
             before(grammarAccess.getAttributeAssignmentAccess().getGroup_3_1_2()); 
            // InternalOntoL.g:4975:2: ( rule__AttributeAssignment__Group_3_1_2__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==28) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalOntoL.g:4975:3: rule__AttributeAssignment__Group_3_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AttributeAssignment__Group_3_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalOntoL.g:4983:1: rule__AttributeAssignment__Group_3_1__3 : rule__AttributeAssignment__Group_3_1__3__Impl ;
    public final void rule__AttributeAssignment__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4987:1: ( rule__AttributeAssignment__Group_3_1__3__Impl )
            // InternalOntoL.g:4988:2: rule__AttributeAssignment__Group_3_1__3__Impl
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
    // InternalOntoL.g:4994:1: rule__AttributeAssignment__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__AttributeAssignment__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4998:1: ( ( '}' ) )
            // InternalOntoL.g:4999:1: ( '}' )
            {
            // InternalOntoL.g:4999:1: ( '}' )
            // InternalOntoL.g:5000:2: '}'
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
    // InternalOntoL.g:5010:1: rule__AttributeAssignment__Group_3_1_2__0 : rule__AttributeAssignment__Group_3_1_2__0__Impl rule__AttributeAssignment__Group_3_1_2__1 ;
    public final void rule__AttributeAssignment__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5014:1: ( rule__AttributeAssignment__Group_3_1_2__0__Impl rule__AttributeAssignment__Group_3_1_2__1 )
            // InternalOntoL.g:5015:2: rule__AttributeAssignment__Group_3_1_2__0__Impl rule__AttributeAssignment__Group_3_1_2__1
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
    // InternalOntoL.g:5022:1: rule__AttributeAssignment__Group_3_1_2__0__Impl : ( ',' ) ;
    public final void rule__AttributeAssignment__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5026:1: ( ( ',' ) )
            // InternalOntoL.g:5027:1: ( ',' )
            {
            // InternalOntoL.g:5027:1: ( ',' )
            // InternalOntoL.g:5028:2: ','
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
    // InternalOntoL.g:5037:1: rule__AttributeAssignment__Group_3_1_2__1 : rule__AttributeAssignment__Group_3_1_2__1__Impl ;
    public final void rule__AttributeAssignment__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5041:1: ( rule__AttributeAssignment__Group_3_1_2__1__Impl )
            // InternalOntoL.g:5042:2: rule__AttributeAssignment__Group_3_1_2__1__Impl
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
    // InternalOntoL.g:5048:1: rule__AttributeAssignment__Group_3_1_2__1__Impl : ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 ) ) ;
    public final void rule__AttributeAssignment__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5052:1: ( ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 ) ) )
            // InternalOntoL.g:5053:1: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 ) )
            {
            // InternalOntoL.g:5053:1: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 ) )
            // InternalOntoL.g:5054:2: ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAssignmentsAssignment_3_1_2_1()); 
            // InternalOntoL.g:5055:2: ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 )
            // InternalOntoL.g:5055:3: rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1
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


    // $ANTLR start "rule__ReferenceAssignment__Group__0"
    // InternalOntoL.g:5064:1: rule__ReferenceAssignment__Group__0 : rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1 ;
    public final void rule__ReferenceAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5068:1: ( rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1 )
            // InternalOntoL.g:5069:2: rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1
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
    // InternalOntoL.g:5076:1: rule__ReferenceAssignment__Group__0__Impl : ( 'ref' ) ;
    public final void rule__ReferenceAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5080:1: ( ( 'ref' ) )
            // InternalOntoL.g:5081:1: ( 'ref' )
            {
            // InternalOntoL.g:5081:1: ( 'ref' )
            // InternalOntoL.g:5082:2: 'ref'
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
    // InternalOntoL.g:5091:1: rule__ReferenceAssignment__Group__1 : rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2 ;
    public final void rule__ReferenceAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5095:1: ( rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2 )
            // InternalOntoL.g:5096:2: rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2
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
    // InternalOntoL.g:5103:1: rule__ReferenceAssignment__Group__1__Impl : ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) ) ;
    public final void rule__ReferenceAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5107:1: ( ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) ) )
            // InternalOntoL.g:5108:1: ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) )
            {
            // InternalOntoL.g:5108:1: ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) )
            // InternalOntoL.g:5109:2: ( rule__ReferenceAssignment__ReferenceAssignment_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getReferenceAssignment_1()); 
            // InternalOntoL.g:5110:2: ( rule__ReferenceAssignment__ReferenceAssignment_1 )
            // InternalOntoL.g:5110:3: rule__ReferenceAssignment__ReferenceAssignment_1
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
    // InternalOntoL.g:5118:1: rule__ReferenceAssignment__Group__2 : rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3 ;
    public final void rule__ReferenceAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5122:1: ( rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3 )
            // InternalOntoL.g:5123:2: rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3
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
    // InternalOntoL.g:5130:1: rule__ReferenceAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__ReferenceAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5134:1: ( ( '=' ) )
            // InternalOntoL.g:5135:1: ( '=' )
            {
            // InternalOntoL.g:5135:1: ( '=' )
            // InternalOntoL.g:5136:2: '='
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
    // InternalOntoL.g:5145:1: rule__ReferenceAssignment__Group__3 : rule__ReferenceAssignment__Group__3__Impl ;
    public final void rule__ReferenceAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5149:1: ( rule__ReferenceAssignment__Group__3__Impl )
            // InternalOntoL.g:5150:2: rule__ReferenceAssignment__Group__3__Impl
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
    // InternalOntoL.g:5156:1: rule__ReferenceAssignment__Group__3__Impl : ( ( rule__ReferenceAssignment__Alternatives_3 ) ) ;
    public final void rule__ReferenceAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5160:1: ( ( ( rule__ReferenceAssignment__Alternatives_3 ) ) )
            // InternalOntoL.g:5161:1: ( ( rule__ReferenceAssignment__Alternatives_3 ) )
            {
            // InternalOntoL.g:5161:1: ( ( rule__ReferenceAssignment__Alternatives_3 ) )
            // InternalOntoL.g:5162:2: ( rule__ReferenceAssignment__Alternatives_3 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAlternatives_3()); 
            // InternalOntoL.g:5163:2: ( rule__ReferenceAssignment__Alternatives_3 )
            // InternalOntoL.g:5163:3: rule__ReferenceAssignment__Alternatives_3
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
    // InternalOntoL.g:5172:1: rule__ReferenceAssignment__Group_3_1__0 : rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1 ;
    public final void rule__ReferenceAssignment__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5176:1: ( rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1 )
            // InternalOntoL.g:5177:2: rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1
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
    // InternalOntoL.g:5184:1: rule__ReferenceAssignment__Group_3_1__0__Impl : ( '{' ) ;
    public final void rule__ReferenceAssignment__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5188:1: ( ( '{' ) )
            // InternalOntoL.g:5189:1: ( '{' )
            {
            // InternalOntoL.g:5189:1: ( '{' )
            // InternalOntoL.g:5190:2: '{'
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
    // InternalOntoL.g:5199:1: rule__ReferenceAssignment__Group_3_1__1 : rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2 ;
    public final void rule__ReferenceAssignment__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5203:1: ( rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2 )
            // InternalOntoL.g:5204:2: rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2
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
    // InternalOntoL.g:5211:1: rule__ReferenceAssignment__Group_3_1__1__Impl : ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) ) ;
    public final void rule__ReferenceAssignment__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5215:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) ) )
            // InternalOntoL.g:5216:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) )
            {
            // InternalOntoL.g:5216:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) )
            // InternalOntoL.g:5217:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_1_1()); 
            // InternalOntoL.g:5218:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 )
            // InternalOntoL.g:5218:3: rule__ReferenceAssignment__AssignmentsAssignment_3_1_1
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
    // InternalOntoL.g:5226:1: rule__ReferenceAssignment__Group_3_1__2 : rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3 ;
    public final void rule__ReferenceAssignment__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5230:1: ( rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3 )
            // InternalOntoL.g:5231:2: rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3
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
    // InternalOntoL.g:5238:1: rule__ReferenceAssignment__Group_3_1__2__Impl : ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* ) ;
    public final void rule__ReferenceAssignment__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5242:1: ( ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* ) )
            // InternalOntoL.g:5243:1: ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* )
            {
            // InternalOntoL.g:5243:1: ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* )
            // InternalOntoL.g:5244:2: ( rule__ReferenceAssignment__Group_3_1_2__0 )*
            {
             before(grammarAccess.getReferenceAssignmentAccess().getGroup_3_1_2()); 
            // InternalOntoL.g:5245:2: ( rule__ReferenceAssignment__Group_3_1_2__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==28) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalOntoL.g:5245:3: rule__ReferenceAssignment__Group_3_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ReferenceAssignment__Group_3_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalOntoL.g:5253:1: rule__ReferenceAssignment__Group_3_1__3 : rule__ReferenceAssignment__Group_3_1__3__Impl ;
    public final void rule__ReferenceAssignment__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5257:1: ( rule__ReferenceAssignment__Group_3_1__3__Impl )
            // InternalOntoL.g:5258:2: rule__ReferenceAssignment__Group_3_1__3__Impl
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
    // InternalOntoL.g:5264:1: rule__ReferenceAssignment__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__ReferenceAssignment__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5268:1: ( ( '}' ) )
            // InternalOntoL.g:5269:1: ( '}' )
            {
            // InternalOntoL.g:5269:1: ( '}' )
            // InternalOntoL.g:5270:2: '}'
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
    // InternalOntoL.g:5280:1: rule__ReferenceAssignment__Group_3_1_2__0 : rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1 ;
    public final void rule__ReferenceAssignment__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5284:1: ( rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1 )
            // InternalOntoL.g:5285:2: rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1
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
    // InternalOntoL.g:5292:1: rule__ReferenceAssignment__Group_3_1_2__0__Impl : ( ',' ) ;
    public final void rule__ReferenceAssignment__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5296:1: ( ( ',' ) )
            // InternalOntoL.g:5297:1: ( ',' )
            {
            // InternalOntoL.g:5297:1: ( ',' )
            // InternalOntoL.g:5298:2: ','
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
    // InternalOntoL.g:5307:1: rule__ReferenceAssignment__Group_3_1_2__1 : rule__ReferenceAssignment__Group_3_1_2__1__Impl ;
    public final void rule__ReferenceAssignment__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5311:1: ( rule__ReferenceAssignment__Group_3_1_2__1__Impl )
            // InternalOntoL.g:5312:2: rule__ReferenceAssignment__Group_3_1_2__1__Impl
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
    // InternalOntoL.g:5318:1: rule__ReferenceAssignment__Group_3_1_2__1__Impl : ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) ) ;
    public final void rule__ReferenceAssignment__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5322:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) ) )
            // InternalOntoL.g:5323:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) )
            {
            // InternalOntoL.g:5323:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) )
            // InternalOntoL.g:5324:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_1_2_1()); 
            // InternalOntoL.g:5325:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 )
            // InternalOntoL.g:5325:3: rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1
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
    // InternalOntoL.g:5334:1: rule__NUMBER__Group__0 : rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 ;
    public final void rule__NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5338:1: ( rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 )
            // InternalOntoL.g:5339:2: rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1
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
    // InternalOntoL.g:5346:1: rule__NUMBER__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5350:1: ( ( ( '-' )? ) )
            // InternalOntoL.g:5351:1: ( ( '-' )? )
            {
            // InternalOntoL.g:5351:1: ( ( '-' )? )
            // InternalOntoL.g:5352:2: ( '-' )?
            {
             before(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0()); 
            // InternalOntoL.g:5353:2: ( '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==44) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalOntoL.g:5353:3: '-'
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
    // InternalOntoL.g:5361:1: rule__NUMBER__Group__1 : rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2 ;
    public final void rule__NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5365:1: ( rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2 )
            // InternalOntoL.g:5366:2: rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2
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
    // InternalOntoL.g:5373:1: rule__NUMBER__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5377:1: ( ( RULE_INT ) )
            // InternalOntoL.g:5378:1: ( RULE_INT )
            {
            // InternalOntoL.g:5378:1: ( RULE_INT )
            // InternalOntoL.g:5379:2: RULE_INT
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
    // InternalOntoL.g:5388:1: rule__NUMBER__Group__2 : rule__NUMBER__Group__2__Impl ;
    public final void rule__NUMBER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5392:1: ( rule__NUMBER__Group__2__Impl )
            // InternalOntoL.g:5393:2: rule__NUMBER__Group__2__Impl
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
    // InternalOntoL.g:5399:1: rule__NUMBER__Group__2__Impl : ( ( rule__NUMBER__Group_2__0 )? ) ;
    public final void rule__NUMBER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5403:1: ( ( ( rule__NUMBER__Group_2__0 )? ) )
            // InternalOntoL.g:5404:1: ( ( rule__NUMBER__Group_2__0 )? )
            {
            // InternalOntoL.g:5404:1: ( ( rule__NUMBER__Group_2__0 )? )
            // InternalOntoL.g:5405:2: ( rule__NUMBER__Group_2__0 )?
            {
             before(grammarAccess.getNUMBERAccess().getGroup_2()); 
            // InternalOntoL.g:5406:2: ( rule__NUMBER__Group_2__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==23) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalOntoL.g:5406:3: rule__NUMBER__Group_2__0
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
    // InternalOntoL.g:5415:1: rule__NUMBER__Group_2__0 : rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1 ;
    public final void rule__NUMBER__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5419:1: ( rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1 )
            // InternalOntoL.g:5420:2: rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1
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
    // InternalOntoL.g:5427:1: rule__NUMBER__Group_2__0__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5431:1: ( ( '.' ) )
            // InternalOntoL.g:5432:1: ( '.' )
            {
            // InternalOntoL.g:5432:1: ( '.' )
            // InternalOntoL.g:5433:2: '.'
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
    // InternalOntoL.g:5442:1: rule__NUMBER__Group_2__1 : rule__NUMBER__Group_2__1__Impl ;
    public final void rule__NUMBER__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5446:1: ( rule__NUMBER__Group_2__1__Impl )
            // InternalOntoL.g:5447:2: rule__NUMBER__Group_2__1__Impl
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
    // InternalOntoL.g:5453:1: rule__NUMBER__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5457:1: ( ( RULE_INT ) )
            // InternalOntoL.g:5458:1: ( RULE_INT )
            {
            // InternalOntoL.g:5458:1: ( RULE_INT )
            // InternalOntoL.g:5459:2: RULE_INT
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
    // InternalOntoL.g:5469:1: rule__NoneValue__Group__0 : rule__NoneValue__Group__0__Impl rule__NoneValue__Group__1 ;
    public final void rule__NoneValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5473:1: ( rule__NoneValue__Group__0__Impl rule__NoneValue__Group__1 )
            // InternalOntoL.g:5474:2: rule__NoneValue__Group__0__Impl rule__NoneValue__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalOntoL.g:5481:1: rule__NoneValue__Group__0__Impl : ( () ) ;
    public final void rule__NoneValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5485:1: ( ( () ) )
            // InternalOntoL.g:5486:1: ( () )
            {
            // InternalOntoL.g:5486:1: ( () )
            // InternalOntoL.g:5487:2: ()
            {
             before(grammarAccess.getNoneValueAccess().getNoneValueAction_0()); 
            // InternalOntoL.g:5488:2: ()
            // InternalOntoL.g:5488:3: 
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
    // InternalOntoL.g:5496:1: rule__NoneValue__Group__1 : rule__NoneValue__Group__1__Impl ;
    public final void rule__NoneValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5500:1: ( rule__NoneValue__Group__1__Impl )
            // InternalOntoL.g:5501:2: rule__NoneValue__Group__1__Impl
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
    // InternalOntoL.g:5507:1: rule__NoneValue__Group__1__Impl : ( 'none' ) ;
    public final void rule__NoneValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5511:1: ( ( 'none' ) )
            // InternalOntoL.g:5512:1: ( 'none' )
            {
            // InternalOntoL.g:5512:1: ( 'none' )
            // InternalOntoL.g:5513:2: 'none'
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


    // $ANTLR start "rule__GeneralizationSet__Group__0"
    // InternalOntoL.g:5523:1: rule__GeneralizationSet__Group__0 : rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 ;
    public final void rule__GeneralizationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5527:1: ( rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 )
            // InternalOntoL.g:5528:2: rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalOntoL.g:5535:1: rule__GeneralizationSet__Group__0__Impl : ( ( rule__GeneralizationSet__Alternatives_0 )? ) ;
    public final void rule__GeneralizationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5539:1: ( ( ( rule__GeneralizationSet__Alternatives_0 )? ) )
            // InternalOntoL.g:5540:1: ( ( rule__GeneralizationSet__Alternatives_0 )? )
            {
            // InternalOntoL.g:5540:1: ( ( rule__GeneralizationSet__Alternatives_0 )? )
            // InternalOntoL.g:5541:2: ( rule__GeneralizationSet__Alternatives_0 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getAlternatives_0()); 
            // InternalOntoL.g:5542:2: ( rule__GeneralizationSet__Alternatives_0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=50 && LA55_0<=51)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalOntoL.g:5542:3: rule__GeneralizationSet__Alternatives_0
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
    // InternalOntoL.g:5550:1: rule__GeneralizationSet__Group__1 : rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 ;
    public final void rule__GeneralizationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5554:1: ( rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 )
            // InternalOntoL.g:5555:2: rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalOntoL.g:5562:1: rule__GeneralizationSet__Group__1__Impl : ( 'genset' ) ;
    public final void rule__GeneralizationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5566:1: ( ( 'genset' ) )
            // InternalOntoL.g:5567:1: ( 'genset' )
            {
            // InternalOntoL.g:5567:1: ( 'genset' )
            // InternalOntoL.g:5568:2: 'genset'
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
    // InternalOntoL.g:5577:1: rule__GeneralizationSet__Group__2 : rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 ;
    public final void rule__GeneralizationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5581:1: ( rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 )
            // InternalOntoL.g:5582:2: rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalOntoL.g:5589:1: rule__GeneralizationSet__Group__2__Impl : ( ( rule__GeneralizationSet__NameAssignment_2 )? ) ;
    public final void rule__GeneralizationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5593:1: ( ( ( rule__GeneralizationSet__NameAssignment_2 )? ) )
            // InternalOntoL.g:5594:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            {
            // InternalOntoL.g:5594:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            // InternalOntoL.g:5595:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 
            // InternalOntoL.g:5596:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalOntoL.g:5596:3: rule__GeneralizationSet__NameAssignment_2
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
    // InternalOntoL.g:5604:1: rule__GeneralizationSet__Group__3 : rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 ;
    public final void rule__GeneralizationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5608:1: ( rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 )
            // InternalOntoL.g:5609:2: rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4
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
    // InternalOntoL.g:5616:1: rule__GeneralizationSet__Group__3__Impl : ( 'general' ) ;
    public final void rule__GeneralizationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5620:1: ( ( 'general' ) )
            // InternalOntoL.g:5621:1: ( 'general' )
            {
            // InternalOntoL.g:5621:1: ( 'general' )
            // InternalOntoL.g:5622:2: 'general'
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
    // InternalOntoL.g:5631:1: rule__GeneralizationSet__Group__4 : rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 ;
    public final void rule__GeneralizationSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5635:1: ( rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 )
            // InternalOntoL.g:5636:2: rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalOntoL.g:5643:1: rule__GeneralizationSet__Group__4__Impl : ( ( rule__GeneralizationSet__GeneralAssignment_4 ) ) ;
    public final void rule__GeneralizationSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5647:1: ( ( ( rule__GeneralizationSet__GeneralAssignment_4 ) ) )
            // InternalOntoL.g:5648:1: ( ( rule__GeneralizationSet__GeneralAssignment_4 ) )
            {
            // InternalOntoL.g:5648:1: ( ( rule__GeneralizationSet__GeneralAssignment_4 ) )
            // InternalOntoL.g:5649:2: ( rule__GeneralizationSet__GeneralAssignment_4 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralAssignment_4()); 
            // InternalOntoL.g:5650:2: ( rule__GeneralizationSet__GeneralAssignment_4 )
            // InternalOntoL.g:5650:3: rule__GeneralizationSet__GeneralAssignment_4
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
    // InternalOntoL.g:5658:1: rule__GeneralizationSet__Group__5 : rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 ;
    public final void rule__GeneralizationSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5662:1: ( rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 )
            // InternalOntoL.g:5663:2: rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6
            {
            pushFollow(FOLLOW_36);
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
    // InternalOntoL.g:5670:1: rule__GeneralizationSet__Group__5__Impl : ( ( rule__GeneralizationSet__Group_5__0 )? ) ;
    public final void rule__GeneralizationSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5674:1: ( ( ( rule__GeneralizationSet__Group_5__0 )? ) )
            // InternalOntoL.g:5675:1: ( ( rule__GeneralizationSet__Group_5__0 )? )
            {
            // InternalOntoL.g:5675:1: ( ( rule__GeneralizationSet__Group_5__0 )? )
            // InternalOntoL.g:5676:2: ( rule__GeneralizationSet__Group_5__0 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_5()); 
            // InternalOntoL.g:5677:2: ( rule__GeneralizationSet__Group_5__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==49) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalOntoL.g:5677:3: rule__GeneralizationSet__Group_5__0
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
    // InternalOntoL.g:5685:1: rule__GeneralizationSet__Group__6 : rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 ;
    public final void rule__GeneralizationSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5689:1: ( rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 )
            // InternalOntoL.g:5690:2: rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7
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
    // InternalOntoL.g:5697:1: rule__GeneralizationSet__Group__6__Impl : ( 'specifics' ) ;
    public final void rule__GeneralizationSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5701:1: ( ( 'specifics' ) )
            // InternalOntoL.g:5702:1: ( 'specifics' )
            {
            // InternalOntoL.g:5702:1: ( 'specifics' )
            // InternalOntoL.g:5703:2: 'specifics'
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
    // InternalOntoL.g:5712:1: rule__GeneralizationSet__Group__7 : rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8 ;
    public final void rule__GeneralizationSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5716:1: ( rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8 )
            // InternalOntoL.g:5717:2: rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8
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
    // InternalOntoL.g:5724:1: rule__GeneralizationSet__Group__7__Impl : ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) ) ;
    public final void rule__GeneralizationSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5728:1: ( ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) ) )
            // InternalOntoL.g:5729:1: ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) )
            {
            // InternalOntoL.g:5729:1: ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) )
            // InternalOntoL.g:5730:2: ( rule__GeneralizationSet__SpecificsAssignment_7 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_7()); 
            // InternalOntoL.g:5731:2: ( rule__GeneralizationSet__SpecificsAssignment_7 )
            // InternalOntoL.g:5731:3: rule__GeneralizationSet__SpecificsAssignment_7
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
    // InternalOntoL.g:5739:1: rule__GeneralizationSet__Group__8 : rule__GeneralizationSet__Group__8__Impl ;
    public final void rule__GeneralizationSet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5743:1: ( rule__GeneralizationSet__Group__8__Impl )
            // InternalOntoL.g:5744:2: rule__GeneralizationSet__Group__8__Impl
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
    // InternalOntoL.g:5750:1: rule__GeneralizationSet__Group__8__Impl : ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) ) ;
    public final void rule__GeneralizationSet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5754:1: ( ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) ) )
            // InternalOntoL.g:5755:1: ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) )
            {
            // InternalOntoL.g:5755:1: ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) )
            // InternalOntoL.g:5756:2: ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* )
            {
            // InternalOntoL.g:5756:2: ( ( rule__GeneralizationSet__Group_8__0 ) )
            // InternalOntoL.g:5757:3: ( rule__GeneralizationSet__Group_8__0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 
            // InternalOntoL.g:5758:3: ( rule__GeneralizationSet__Group_8__0 )
            // InternalOntoL.g:5758:4: rule__GeneralizationSet__Group_8__0
            {
            pushFollow(FOLLOW_13);
            rule__GeneralizationSet__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 

            }

            // InternalOntoL.g:5761:2: ( ( rule__GeneralizationSet__Group_8__0 )* )
            // InternalOntoL.g:5762:3: ( rule__GeneralizationSet__Group_8__0 )*
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 
            // InternalOntoL.g:5763:3: ( rule__GeneralizationSet__Group_8__0 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==28) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalOntoL.g:5763:4: rule__GeneralizationSet__Group_8__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GeneralizationSet__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // InternalOntoL.g:5773:1: rule__GeneralizationSet__Group_0_2__0 : rule__GeneralizationSet__Group_0_2__0__Impl rule__GeneralizationSet__Group_0_2__1 ;
    public final void rule__GeneralizationSet__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5777:1: ( rule__GeneralizationSet__Group_0_2__0__Impl rule__GeneralizationSet__Group_0_2__1 )
            // InternalOntoL.g:5778:2: rule__GeneralizationSet__Group_0_2__0__Impl rule__GeneralizationSet__Group_0_2__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalOntoL.g:5785:1: rule__GeneralizationSet__Group_0_2__0__Impl : ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_0 ) ) ;
    public final void rule__GeneralizationSet__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5789:1: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_0 ) ) )
            // InternalOntoL.g:5790:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_0 ) )
            {
            // InternalOntoL.g:5790:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_0 ) )
            // InternalOntoL.g:5791:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_2_0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_2_0()); 
            // InternalOntoL.g:5792:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_2_0 )
            // InternalOntoL.g:5792:3: rule__GeneralizationSet__IsDisjointAssignment_0_2_0
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
    // InternalOntoL.g:5800:1: rule__GeneralizationSet__Group_0_2__1 : rule__GeneralizationSet__Group_0_2__1__Impl ;
    public final void rule__GeneralizationSet__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5804:1: ( rule__GeneralizationSet__Group_0_2__1__Impl )
            // InternalOntoL.g:5805:2: rule__GeneralizationSet__Group_0_2__1__Impl
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
    // InternalOntoL.g:5811:1: rule__GeneralizationSet__Group_0_2__1__Impl : ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_1 ) ) ;
    public final void rule__GeneralizationSet__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5815:1: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_1 ) ) )
            // InternalOntoL.g:5816:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_1 ) )
            {
            // InternalOntoL.g:5816:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_1 ) )
            // InternalOntoL.g:5817:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_2_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_2_1()); 
            // InternalOntoL.g:5818:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_2_1 )
            // InternalOntoL.g:5818:3: rule__GeneralizationSet__IsCompleteAssignment_0_2_1
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
    // InternalOntoL.g:5827:1: rule__GeneralizationSet__Group_0_3__0 : rule__GeneralizationSet__Group_0_3__0__Impl rule__GeneralizationSet__Group_0_3__1 ;
    public final void rule__GeneralizationSet__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5831:1: ( rule__GeneralizationSet__Group_0_3__0__Impl rule__GeneralizationSet__Group_0_3__1 )
            // InternalOntoL.g:5832:2: rule__GeneralizationSet__Group_0_3__0__Impl rule__GeneralizationSet__Group_0_3__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalOntoL.g:5839:1: rule__GeneralizationSet__Group_0_3__0__Impl : ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_0 ) ) ;
    public final void rule__GeneralizationSet__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5843:1: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_0 ) ) )
            // InternalOntoL.g:5844:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_0 ) )
            {
            // InternalOntoL.g:5844:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_0 ) )
            // InternalOntoL.g:5845:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_3_0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_3_0()); 
            // InternalOntoL.g:5846:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_3_0 )
            // InternalOntoL.g:5846:3: rule__GeneralizationSet__IsCompleteAssignment_0_3_0
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
    // InternalOntoL.g:5854:1: rule__GeneralizationSet__Group_0_3__1 : rule__GeneralizationSet__Group_0_3__1__Impl ;
    public final void rule__GeneralizationSet__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5858:1: ( rule__GeneralizationSet__Group_0_3__1__Impl )
            // InternalOntoL.g:5859:2: rule__GeneralizationSet__Group_0_3__1__Impl
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
    // InternalOntoL.g:5865:1: rule__GeneralizationSet__Group_0_3__1__Impl : ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_1 ) ) ;
    public final void rule__GeneralizationSet__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5869:1: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_1 ) ) )
            // InternalOntoL.g:5870:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_1 ) )
            {
            // InternalOntoL.g:5870:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_1 ) )
            // InternalOntoL.g:5871:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_3_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_3_1()); 
            // InternalOntoL.g:5872:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_3_1 )
            // InternalOntoL.g:5872:3: rule__GeneralizationSet__IsDisjointAssignment_0_3_1
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
    // InternalOntoL.g:5881:1: rule__GeneralizationSet__Group_5__0 : rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1 ;
    public final void rule__GeneralizationSet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5885:1: ( rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1 )
            // InternalOntoL.g:5886:2: rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1
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
    // InternalOntoL.g:5893:1: rule__GeneralizationSet__Group_5__0__Impl : ( 'categorizer' ) ;
    public final void rule__GeneralizationSet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5897:1: ( ( 'categorizer' ) )
            // InternalOntoL.g:5898:1: ( 'categorizer' )
            {
            // InternalOntoL.g:5898:1: ( 'categorizer' )
            // InternalOntoL.g:5899:2: 'categorizer'
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
    // InternalOntoL.g:5908:1: rule__GeneralizationSet__Group_5__1 : rule__GeneralizationSet__Group_5__1__Impl ;
    public final void rule__GeneralizationSet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5912:1: ( rule__GeneralizationSet__Group_5__1__Impl )
            // InternalOntoL.g:5913:2: rule__GeneralizationSet__Group_5__1__Impl
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
    // InternalOntoL.g:5919:1: rule__GeneralizationSet__Group_5__1__Impl : ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) ) ;
    public final void rule__GeneralizationSet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5923:1: ( ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) ) )
            // InternalOntoL.g:5924:1: ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) )
            {
            // InternalOntoL.g:5924:1: ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) )
            // InternalOntoL.g:5925:2: ( rule__GeneralizationSet__CategorizerAssignment_5_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerAssignment_5_1()); 
            // InternalOntoL.g:5926:2: ( rule__GeneralizationSet__CategorizerAssignment_5_1 )
            // InternalOntoL.g:5926:3: rule__GeneralizationSet__CategorizerAssignment_5_1
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
    // InternalOntoL.g:5935:1: rule__GeneralizationSet__Group_8__0 : rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1 ;
    public final void rule__GeneralizationSet__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5939:1: ( rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1 )
            // InternalOntoL.g:5940:2: rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1
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
    // InternalOntoL.g:5947:1: rule__GeneralizationSet__Group_8__0__Impl : ( ',' ) ;
    public final void rule__GeneralizationSet__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5951:1: ( ( ',' ) )
            // InternalOntoL.g:5952:1: ( ',' )
            {
            // InternalOntoL.g:5952:1: ( ',' )
            // InternalOntoL.g:5953:2: ','
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
    // InternalOntoL.g:5962:1: rule__GeneralizationSet__Group_8__1 : rule__GeneralizationSet__Group_8__1__Impl ;
    public final void rule__GeneralizationSet__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5966:1: ( rule__GeneralizationSet__Group_8__1__Impl )
            // InternalOntoL.g:5967:2: rule__GeneralizationSet__Group_8__1__Impl
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
    // InternalOntoL.g:5973:1: rule__GeneralizationSet__Group_8__1__Impl : ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) ) ;
    public final void rule__GeneralizationSet__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5977:1: ( ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) ) )
            // InternalOntoL.g:5978:1: ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) )
            {
            // InternalOntoL.g:5978:1: ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) )
            // InternalOntoL.g:5979:2: ( rule__GeneralizationSet__SpecificsAssignment_8_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_8_1()); 
            // InternalOntoL.g:5980:2: ( rule__GeneralizationSet__SpecificsAssignment_8_1 )
            // InternalOntoL.g:5980:3: rule__GeneralizationSet__SpecificsAssignment_8_1
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
    // InternalOntoL.g:5989:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5993:1: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:5994:2: ( ruleQualifiedName )
            {
            // InternalOntoL.g:5994:2: ( ruleQualifiedName )
            // InternalOntoL.g:5995:3: ruleQualifiedName
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
    // InternalOntoL.g:6004:1: rule__Model__IncludesAssignment_3_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Model__IncludesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6008:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6009:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6009:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6010:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getModelAccess().getIncludesModelCrossReference_3_0_1_0()); 
            // InternalOntoL.g:6011:3: ( ruleQualifiedName )
            // InternalOntoL.g:6012:4: ruleQualifiedName
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
    // InternalOntoL.g:6023:1: rule__Model__ElementsAssignment_3_1 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6027:1: ( ( ruleModelElement ) )
            // InternalOntoL.g:6028:2: ( ruleModelElement )
            {
            // InternalOntoL.g:6028:2: ( ruleModelElement )
            // InternalOntoL.g:6029:3: ruleModelElement
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
    // InternalOntoL.g:6038:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6042:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalOntoL.g:6043:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalOntoL.g:6043:2: ( ruleQualifiedNameWithWildcard )
            // InternalOntoL.g:6044:3: ruleQualifiedNameWithWildcard
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
    // InternalOntoL.g:6053:1: rule__Individual__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Individual__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6057:1: ( ( RULE_ID ) )
            // InternalOntoL.g:6058:2: ( RULE_ID )
            {
            // InternalOntoL.g:6058:2: ( RULE_ID )
            // InternalOntoL.g:6059:3: RULE_ID
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
    // InternalOntoL.g:6068:1: rule__Individual__InstantiatedClassesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Individual__InstantiatedClassesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6072:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6073:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6073:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6074:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesOntoLClassCrossReference_2_1_0()); 
            // InternalOntoL.g:6075:3: ( ruleQualifiedName )
            // InternalOntoL.g:6076:4: ruleQualifiedName
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
    // InternalOntoL.g:6087:1: rule__Individual__InstantiatedClassesAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Individual__InstantiatedClassesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6091:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6092:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6092:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6093:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesOntoLClassCrossReference_2_2_1_0()); 
            // InternalOntoL.g:6094:3: ( ruleQualifiedName )
            // InternalOntoL.g:6095:4: ruleQualifiedName
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
    // InternalOntoL.g:6106:1: rule__Individual__AttAssignmentsAssignment_3_1_0 : ( ruleAttributeAssignment ) ;
    public final void rule__Individual__AttAssignmentsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6110:1: ( ( ruleAttributeAssignment ) )
            // InternalOntoL.g:6111:2: ( ruleAttributeAssignment )
            {
            // InternalOntoL.g:6111:2: ( ruleAttributeAssignment )
            // InternalOntoL.g:6112:3: ruleAttributeAssignment
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
    // InternalOntoL.g:6121:1: rule__Individual__RefAssignmentsAssignment_3_1_1 : ( ruleReferenceAssignment ) ;
    public final void rule__Individual__RefAssignmentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6125:1: ( ( ruleReferenceAssignment ) )
            // InternalOntoL.g:6126:2: ( ruleReferenceAssignment )
            {
            // InternalOntoL.g:6126:2: ( ruleReferenceAssignment )
            // InternalOntoL.g:6127:3: ruleReferenceAssignment
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
    // InternalOntoL.g:6136:1: rule__OntoLClass__AttributesAssignment_1_1_0 : ( ruleAttribute ) ;
    public final void rule__OntoLClass__AttributesAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6140:1: ( ( ruleAttribute ) )
            // InternalOntoL.g:6141:2: ( ruleAttribute )
            {
            // InternalOntoL.g:6141:2: ( ruleAttribute )
            // InternalOntoL.g:6142:3: ruleAttribute
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
    // InternalOntoL.g:6151:1: rule__OntoLClass__AttAssignmentsAssignment_1_1_1 : ( ruleAttributeAssignment ) ;
    public final void rule__OntoLClass__AttAssignmentsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6155:1: ( ( ruleAttributeAssignment ) )
            // InternalOntoL.g:6156:2: ( ruleAttributeAssignment )
            {
            // InternalOntoL.g:6156:2: ( ruleAttributeAssignment )
            // InternalOntoL.g:6157:3: ruleAttributeAssignment
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
    // InternalOntoL.g:6166:1: rule__OntoLClass__ReferencesAssignment_1_1_2 : ( ruleReference ) ;
    public final void rule__OntoLClass__ReferencesAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6170:1: ( ( ruleReference ) )
            // InternalOntoL.g:6171:2: ( ruleReference )
            {
            // InternalOntoL.g:6171:2: ( ruleReference )
            // InternalOntoL.g:6172:3: ruleReference
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
    // InternalOntoL.g:6181:1: rule__OntoLClass__RefAssignmentsAssignment_1_1_3 : ( ruleReferenceAssignment ) ;
    public final void rule__OntoLClass__RefAssignmentsAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6185:1: ( ( ruleReferenceAssignment ) )
            // InternalOntoL.g:6186:2: ( ruleReferenceAssignment )
            {
            // InternalOntoL.g:6186:2: ( ruleReferenceAssignment )
            // InternalOntoL.g:6187:3: ruleReferenceAssignment
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
    // InternalOntoL.g:6196:1: rule__OrderlessClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OrderlessClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6200:1: ( ( RULE_ID ) )
            // InternalOntoL.g:6201:2: ( RULE_ID )
            {
            // InternalOntoL.g:6201:2: ( RULE_ID )
            // InternalOntoL.g:6202:3: RULE_ID
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
    // InternalOntoL.g:6211:1: rule__OrderlessClass__InstantiatedClassesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__InstantiatedClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6215:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6216:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6216:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6217:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_1_0()); 
            // InternalOntoL.g:6218:3: ( ruleQualifiedName )
            // InternalOntoL.g:6219:4: ruleQualifiedName
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
    // InternalOntoL.g:6230:1: rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6234:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6235:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6235:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6236:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_2_1_0()); 
            // InternalOntoL.g:6237:3: ( ruleQualifiedName )
            // InternalOntoL.g:6238:4: ruleQualifiedName
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
    // InternalOntoL.g:6249:1: rule__OrderlessClass__SuperClassesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__SuperClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6253:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6254:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6254:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6255:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getSuperClassesOntoLClassCrossReference_4_1_0()); 
            // InternalOntoL.g:6256:3: ( ruleQualifiedName )
            // InternalOntoL.g:6257:4: ruleQualifiedName
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
    // InternalOntoL.g:6268:1: rule__OrderlessClass__SuperClassesAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__SuperClassesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6272:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6273:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6273:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6274:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getSuperClassesOntoLClassCrossReference_4_2_1_0()); 
            // InternalOntoL.g:6275:3: ( ruleQualifiedName )
            // InternalOntoL.g:6276:4: ruleQualifiedName
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
    // InternalOntoL.g:6287:1: rule__OrderlessClass__SubordinatorsAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__SubordinatorsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6291:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6292:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6292:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6293:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatorsOntoLClassCrossReference_5_1_0()); 
            // InternalOntoL.g:6294:3: ( ruleQualifiedName )
            // InternalOntoL.g:6295:4: ruleQualifiedName
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
    // InternalOntoL.g:6306:1: rule__OrderlessClass__SubordinatorsAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__SubordinatorsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6310:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6311:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6311:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6312:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatorsOntoLClassCrossReference_5_2_1_0()); 
            // InternalOntoL.g:6313:3: ( ruleQualifiedName )
            // InternalOntoL.g:6314:4: ruleQualifiedName
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
    // InternalOntoL.g:6325:1: rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 : ( ruleCategorizationType ) ;
    public final void rule__OrderlessClass__CategorizationTypeAssignment_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6329:1: ( ( ruleCategorizationType ) )
            // InternalOntoL.g:6330:2: ( ruleCategorizationType )
            {
            // InternalOntoL.g:6330:2: ( ruleCategorizationType )
            // InternalOntoL.g:6331:3: ruleCategorizationType
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
    // InternalOntoL.g:6340:1: rule__OrderlessClass__BasetypeAssignment_6_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__BasetypeAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6344:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6345:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6345:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6346:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getBasetypeOntoLClassCrossReference_6_0_1_0()); 
            // InternalOntoL.g:6347:3: ( ruleQualifiedName )
            // InternalOntoL.g:6348:4: ruleQualifiedName
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
    // InternalOntoL.g:6359:1: rule__OrderlessClass__PowertypeOfAssignment_6_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__PowertypeOfAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6363:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6364:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6364:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6365:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getPowertypeOfOntoLClassCrossReference_6_1_1_0()); 
            // InternalOntoL.g:6366:3: ( ruleQualifiedName )
            // InternalOntoL.g:6367:4: ruleQualifiedName
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
    // InternalOntoL.g:6378:1: rule__FOClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FOClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6382:1: ( ( RULE_ID ) )
            // InternalOntoL.g:6383:2: ( RULE_ID )
            {
            // InternalOntoL.g:6383:2: ( RULE_ID )
            // InternalOntoL.g:6384:3: RULE_ID
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
    // InternalOntoL.g:6393:1: rule__FOClass__InstantiatedClassesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__InstantiatedClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6397:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6398:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6398:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6399:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_1_0()); 
            // InternalOntoL.g:6400:3: ( ruleQualifiedName )
            // InternalOntoL.g:6401:4: ruleQualifiedName
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
    // InternalOntoL.g:6412:1: rule__FOClass__InstantiatedClassesAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__InstantiatedClassesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6416:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6417:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6417:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6418:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_2_1_0()); 
            // InternalOntoL.g:6419:3: ( ruleQualifiedName )
            // InternalOntoL.g:6420:4: ruleQualifiedName
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
    // InternalOntoL.g:6431:1: rule__FOClass__SuperClassesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__SuperClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6435:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6436:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6436:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6437:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesOntoLClassCrossReference_4_1_0()); 
            // InternalOntoL.g:6438:3: ( ruleQualifiedName )
            // InternalOntoL.g:6439:4: ruleQualifiedName
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
    // InternalOntoL.g:6450:1: rule__FOClass__SuperClassesAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__SuperClassesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6454:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6455:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6455:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6456:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesOntoLClassCrossReference_4_2_1_0()); 
            // InternalOntoL.g:6457:3: ( ruleQualifiedName )
            // InternalOntoL.g:6458:4: ruleQualifiedName
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
    // InternalOntoL.g:6469:1: rule__HOClass__OrderAssignment_1 : ( RULE_INT ) ;
    public final void rule__HOClass__OrderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6473:1: ( ( RULE_INT ) )
            // InternalOntoL.g:6474:2: ( RULE_INT )
            {
            // InternalOntoL.g:6474:2: ( RULE_INT )
            // InternalOntoL.g:6475:3: RULE_INT
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
    // InternalOntoL.g:6484:1: rule__HOClass__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__HOClass__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6488:1: ( ( RULE_ID ) )
            // InternalOntoL.g:6489:2: ( RULE_ID )
            {
            // InternalOntoL.g:6489:2: ( RULE_ID )
            // InternalOntoL.g:6490:3: RULE_ID
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
    // InternalOntoL.g:6499:1: rule__HOClass__InstantiatedClassesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__InstantiatedClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6503:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6504:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6504:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6505:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getInstantiatedClassesOntoLClassCrossReference_4_1_0()); 
            // InternalOntoL.g:6506:3: ( ruleQualifiedName )
            // InternalOntoL.g:6507:4: ruleQualifiedName
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
    // InternalOntoL.g:6518:1: rule__HOClass__InstantiatedClassesAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__InstantiatedClassesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6522:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6523:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6523:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6524:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getInstantiatedClassesOntoLClassCrossReference_4_2_1_0()); 
            // InternalOntoL.g:6525:3: ( ruleQualifiedName )
            // InternalOntoL.g:6526:4: ruleQualifiedName
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
    // InternalOntoL.g:6537:1: rule__HOClass__SuperClassesAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SuperClassesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6541:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6542:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6542:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6543:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesOntoLClassCrossReference_5_1_0()); 
            // InternalOntoL.g:6544:3: ( ruleQualifiedName )
            // InternalOntoL.g:6545:4: ruleQualifiedName
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
    // InternalOntoL.g:6556:1: rule__HOClass__SuperClassesAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SuperClassesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6560:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6561:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6561:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6562:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesOntoLClassCrossReference_5_2_1_0()); 
            // InternalOntoL.g:6563:3: ( ruleQualifiedName )
            // InternalOntoL.g:6564:4: ruleQualifiedName
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
    // InternalOntoL.g:6575:1: rule__HOClass__SubordinatorsAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SubordinatorsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6579:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6580:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6580:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6581:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsOntoLClassCrossReference_6_1_0()); 
            // InternalOntoL.g:6582:3: ( ruleQualifiedName )
            // InternalOntoL.g:6583:4: ruleQualifiedName
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
    // InternalOntoL.g:6594:1: rule__HOClass__SubordinatorsAssignment_6_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SubordinatorsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6598:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6599:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6599:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6600:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsOntoLClassCrossReference_6_2_1_0()); 
            // InternalOntoL.g:6601:3: ( ruleQualifiedName )
            // InternalOntoL.g:6602:4: ruleQualifiedName
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
    // InternalOntoL.g:6613:1: rule__HOClass__CategorizationTypeAssignment_7_0_0 : ( ruleCategorizationType ) ;
    public final void rule__HOClass__CategorizationTypeAssignment_7_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6617:1: ( ( ruleCategorizationType ) )
            // InternalOntoL.g:6618:2: ( ruleCategorizationType )
            {
            // InternalOntoL.g:6618:2: ( ruleCategorizationType )
            // InternalOntoL.g:6619:3: ruleCategorizationType
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
    // InternalOntoL.g:6628:1: rule__HOClass__BasetypeAssignment_7_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__BasetypeAssignment_7_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6632:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6633:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6633:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6634:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getBasetypeOntoLClassCrossReference_7_0_1_0()); 
            // InternalOntoL.g:6635:3: ( ruleQualifiedName )
            // InternalOntoL.g:6636:4: ruleQualifiedName
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
    // InternalOntoL.g:6647:1: rule__HOClass__PowertypeOfAssignment_7_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__PowertypeOfAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6651:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6652:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6652:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6653:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getPowertypeOfOntoLClassCrossReference_7_1_1_0()); 
            // InternalOntoL.g:6654:3: ( ruleQualifiedName )
            // InternalOntoL.g:6655:4: ruleQualifiedName
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
    // InternalOntoL.g:6666:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6670:1: ( ( RULE_ID ) )
            // InternalOntoL.g:6671:2: ( RULE_ID )
            {
            // InternalOntoL.g:6671:2: ( RULE_ID )
            // InternalOntoL.g:6672:3: RULE_ID
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
    // InternalOntoL.g:6681:1: rule__Attribute__LowerBoundAssignment_3_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__Attribute__LowerBoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6685:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:6686:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:6686:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:6687:3: ruleELEMENTBOUND
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
    // InternalOntoL.g:6696:1: rule__Attribute__UpperBoundAssignment_3_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__Attribute__UpperBoundAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6700:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:6701:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:6701:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:6702:3: ruleELEMENTBOUND
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
    // InternalOntoL.g:6711:1: rule__Attribute__PropertyClassAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__PropertyClassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6715:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6716:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6716:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6717:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getPropertyClassOntoLClassCrossReference_4_0()); 
            // InternalOntoL.g:6718:3: ( ruleQualifiedName )
            // InternalOntoL.g:6719:4: ruleQualifiedName
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
    // InternalOntoL.g:6730:1: rule__Attribute__SubsetOfAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__SubsetOfAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6734:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6735:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6735:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6736:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_1_0()); 
            // InternalOntoL.g:6737:3: ( ruleQualifiedName )
            // InternalOntoL.g:6738:4: ruleQualifiedName
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
    // InternalOntoL.g:6749:1: rule__Attribute__SubsetOfAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__SubsetOfAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6753:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6754:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6754:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6755:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_2_1_0()); 
            // InternalOntoL.g:6756:3: ( ruleQualifiedName )
            // InternalOntoL.g:6757:4: ruleQualifiedName
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
    // InternalOntoL.g:6768:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6772:1: ( ( RULE_ID ) )
            // InternalOntoL.g:6773:2: ( RULE_ID )
            {
            // InternalOntoL.g:6773:2: ( RULE_ID )
            // InternalOntoL.g:6774:3: RULE_ID
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
    // InternalOntoL.g:6783:1: rule__Reference__LowerBoundAssignment_3_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__Reference__LowerBoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6787:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:6788:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:6788:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:6789:3: ruleELEMENTBOUND
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
    // InternalOntoL.g:6798:1: rule__Reference__UpperBoundAssignment_3_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__Reference__UpperBoundAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6802:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:6803:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:6803:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:6804:3: ruleELEMENTBOUND
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
    // InternalOntoL.g:6813:1: rule__Reference__PropertyClassAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__PropertyClassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6817:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6818:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6818:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6819:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getPropertyClassOntoLClassCrossReference_4_0()); 
            // InternalOntoL.g:6820:3: ( ruleQualifiedName )
            // InternalOntoL.g:6821:4: ruleQualifiedName
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
    // InternalOntoL.g:6832:1: rule__Reference__SubsetOfAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__SubsetOfAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6836:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6837:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6837:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6838:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_1_0()); 
            // InternalOntoL.g:6839:3: ( ruleQualifiedName )
            // InternalOntoL.g:6840:4: ruleQualifiedName
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
    // InternalOntoL.g:6851:1: rule__Reference__SubsetOfAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__SubsetOfAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6855:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6856:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6856:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6857:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_2_1_0()); 
            // InternalOntoL.g:6858:3: ( ruleQualifiedName )
            // InternalOntoL.g:6859:4: ruleQualifiedName
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
    // InternalOntoL.g:6870:1: rule__Reference__OppositeToAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__OppositeToAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6874:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6875:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6875:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6876:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getOppositeToReferenceCrossReference_6_1_0()); 
            // InternalOntoL.g:6877:3: ( ruleQualifiedName )
            // InternalOntoL.g:6878:4: ruleQualifiedName
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
    // InternalOntoL.g:6889:1: rule__AttributeAssignment__AttributeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AttributeAssignment__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6893:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6894:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6894:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6895:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalOntoL.g:6896:3: ( ruleQualifiedName )
            // InternalOntoL.g:6897:4: ruleQualifiedName
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
    // InternalOntoL.g:6908:1: rule__AttributeAssignment__AssignmentsAssignment_3_0 : ( ruleDataValue ) ;
    public final void rule__AttributeAssignment__AssignmentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6912:1: ( ( ruleDataValue ) )
            // InternalOntoL.g:6913:2: ( ruleDataValue )
            {
            // InternalOntoL.g:6913:2: ( ruleDataValue )
            // InternalOntoL.g:6914:3: ruleDataValue
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
    // InternalOntoL.g:6923:1: rule__AttributeAssignment__AssignmentsAssignment_3_1_1 : ( ruleDataValue ) ;
    public final void rule__AttributeAssignment__AssignmentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6927:1: ( ( ruleDataValue ) )
            // InternalOntoL.g:6928:2: ( ruleDataValue )
            {
            // InternalOntoL.g:6928:2: ( ruleDataValue )
            // InternalOntoL.g:6929:3: ruleDataValue
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
    // InternalOntoL.g:6938:1: rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 : ( ruleDataValue ) ;
    public final void rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6942:1: ( ( ruleDataValue ) )
            // InternalOntoL.g:6943:2: ( ruleDataValue )
            {
            // InternalOntoL.g:6943:2: ( ruleDataValue )
            // InternalOntoL.g:6944:3: ruleDataValue
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


    // $ANTLR start "rule__ReferenceAssignment__ReferenceAssignment_1"
    // InternalOntoL.g:6953:1: rule__ReferenceAssignment__ReferenceAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6957:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6958:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6958:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6959:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getReferenceReferenceCrossReference_1_0()); 
            // InternalOntoL.g:6960:3: ( ruleQualifiedName )
            // InternalOntoL.g:6961:4: ruleQualifiedName
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
    // InternalOntoL.g:6972:1: rule__ReferenceAssignment__AssignmentsAssignment_3_0 : ( ruleReferenceValue ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6976:1: ( ( ruleReferenceValue ) )
            // InternalOntoL.g:6977:2: ( ruleReferenceValue )
            {
            // InternalOntoL.g:6977:2: ( ruleReferenceValue )
            // InternalOntoL.g:6978:3: ruleReferenceValue
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
    // InternalOntoL.g:6987:1: rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 : ( ruleReferenceValue ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6991:1: ( ( ruleReferenceValue ) )
            // InternalOntoL.g:6992:2: ( ruleReferenceValue )
            {
            // InternalOntoL.g:6992:2: ( ruleReferenceValue )
            // InternalOntoL.g:6993:3: ruleReferenceValue
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
    // InternalOntoL.g:7002:1: rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 : ( ruleReferenceValue ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7006:1: ( ( ruleReferenceValue ) )
            // InternalOntoL.g:7007:2: ( ruleReferenceValue )
            {
            // InternalOntoL.g:7007:2: ( ruleReferenceValue )
            // InternalOntoL.g:7008:3: ruleReferenceValue
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
    // InternalOntoL.g:7017:1: rule__ReferenceValue__ValueAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7021:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7022:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7022:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7023:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceValueAccess().getValueEntityDeclarationCrossReference_0()); 
            // InternalOntoL.g:7024:3: ( ruleQualifiedName )
            // InternalOntoL.g:7025:4: ruleQualifiedName
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
    // InternalOntoL.g:7036:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7040:1: ( ( RULE_STRING ) )
            // InternalOntoL.g:7041:2: ( RULE_STRING )
            {
            // InternalOntoL.g:7041:2: ( RULE_STRING )
            // InternalOntoL.g:7042:3: RULE_STRING
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
    // InternalOntoL.g:7051:1: rule__NumberValue__ValueAssignment : ( ruleNUMBER ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7055:1: ( ( ruleNUMBER ) )
            // InternalOntoL.g:7056:2: ( ruleNUMBER )
            {
            // InternalOntoL.g:7056:2: ( ruleNUMBER )
            // InternalOntoL.g:7057:3: ruleNUMBER
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
    // InternalOntoL.g:7066:1: rule__BooleanValue__ValueAssignment : ( ruleBOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7070:1: ( ( ruleBOOLEAN ) )
            // InternalOntoL.g:7071:2: ( ruleBOOLEAN )
            {
            // InternalOntoL.g:7071:2: ( ruleBOOLEAN )
            // InternalOntoL.g:7072:3: ruleBOOLEAN
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


    // $ANTLR start "rule__GeneralizationSet__IsDisjointAssignment_0_0"
    // InternalOntoL.g:7081:1: rule__GeneralizationSet__IsDisjointAssignment_0_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7085:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoL.g:7086:2: ( ( 'disjoint' ) )
            {
            // InternalOntoL.g:7086:2: ( ( 'disjoint' ) )
            // InternalOntoL.g:7087:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 
            // InternalOntoL.g:7088:3: ( 'disjoint' )
            // InternalOntoL.g:7089:4: 'disjoint'
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
    // InternalOntoL.g:7100:1: rule__GeneralizationSet__IsCompleteAssignment_0_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7104:1: ( ( ( 'complete' ) ) )
            // InternalOntoL.g:7105:2: ( ( 'complete' ) )
            {
            // InternalOntoL.g:7105:2: ( ( 'complete' ) )
            // InternalOntoL.g:7106:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 
            // InternalOntoL.g:7107:3: ( 'complete' )
            // InternalOntoL.g:7108:4: 'complete'
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
    // InternalOntoL.g:7119:1: rule__GeneralizationSet__IsDisjointAssignment_0_2_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7123:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoL.g:7124:2: ( ( 'disjoint' ) )
            {
            // InternalOntoL.g:7124:2: ( ( 'disjoint' ) )
            // InternalOntoL.g:7125:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_2_0_0()); 
            // InternalOntoL.g:7126:3: ( 'disjoint' )
            // InternalOntoL.g:7127:4: 'disjoint'
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
    // InternalOntoL.g:7138:1: rule__GeneralizationSet__IsCompleteAssignment_0_2_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7142:1: ( ( ( 'complete' ) ) )
            // InternalOntoL.g:7143:2: ( ( 'complete' ) )
            {
            // InternalOntoL.g:7143:2: ( ( 'complete' ) )
            // InternalOntoL.g:7144:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_2_1_0()); 
            // InternalOntoL.g:7145:3: ( 'complete' )
            // InternalOntoL.g:7146:4: 'complete'
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
    // InternalOntoL.g:7157:1: rule__GeneralizationSet__IsCompleteAssignment_0_3_0 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7161:1: ( ( ( 'complete' ) ) )
            // InternalOntoL.g:7162:2: ( ( 'complete' ) )
            {
            // InternalOntoL.g:7162:2: ( ( 'complete' ) )
            // InternalOntoL.g:7163:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_3_0_0()); 
            // InternalOntoL.g:7164:3: ( 'complete' )
            // InternalOntoL.g:7165:4: 'complete'
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
    // InternalOntoL.g:7176:1: rule__GeneralizationSet__IsDisjointAssignment_0_3_1 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7180:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoL.g:7181:2: ( ( 'disjoint' ) )
            {
            // InternalOntoL.g:7181:2: ( ( 'disjoint' ) )
            // InternalOntoL.g:7182:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_3_1_0()); 
            // InternalOntoL.g:7183:3: ( 'disjoint' )
            // InternalOntoL.g:7184:4: 'disjoint'
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
    // InternalOntoL.g:7195:1: rule__GeneralizationSet__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GeneralizationSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7199:1: ( ( RULE_ID ) )
            // InternalOntoL.g:7200:2: ( RULE_ID )
            {
            // InternalOntoL.g:7200:2: ( RULE_ID )
            // InternalOntoL.g:7201:3: RULE_ID
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
    // InternalOntoL.g:7210:1: rule__GeneralizationSet__GeneralAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__GeneralAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7214:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7215:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7215:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7216:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralOntoLClassCrossReference_4_0()); 
            // InternalOntoL.g:7217:3: ( ruleQualifiedName )
            // InternalOntoL.g:7218:4: ruleQualifiedName
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
    // InternalOntoL.g:7229:1: rule__GeneralizationSet__CategorizerAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__CategorizerAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7233:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7234:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7234:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7235:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerOntoLClassCrossReference_5_1_0()); 
            // InternalOntoL.g:7236:3: ( ruleQualifiedName )
            // InternalOntoL.g:7237:4: ruleQualifiedName
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
    // InternalOntoL.g:7248:1: rule__GeneralizationSet__SpecificsAssignment_7 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__SpecificsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7252:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7253:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7253:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7254:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsOntoLClassCrossReference_7_0()); 
            // InternalOntoL.g:7255:3: ( ruleQualifiedName )
            // InternalOntoL.g:7256:4: ruleQualifiedName
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
    // InternalOntoL.g:7267:1: rule__GeneralizationSet__SpecificsAssignment_8_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__SpecificsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7271:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7272:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7272:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7273:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsOntoLClassCrossReference_8_1_0()); 
            // InternalOntoL.g:7274:3: ( ruleQualifiedName )
            // InternalOntoL.g:7275:4: ruleQualifiedName
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
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000300000083050L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000300000003050L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000C400C66200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'true'", "'false'", "'categorizes'", "'completecategorizes'", "'disjointcategorizes'", "'partitions'", "'module'", "'{'", "'}'", "';'", "'.'", "'.*'", "'import'", "'include'", "'individual'", "':'", "','", "'orderless'", "'class'", "'specializes'", "'subordinatedto'", "'ispowertypeof'", "'first-order'", "'order'", "'att'", "'['", "'..'", "']'", "'subsets'", "'isoppositeto'", "'ref'", "'='", "'-'", "'none'", "'genset'", "'general'", "'specifics'", "'('", "')'", "'categorizer'", "'disjoint'", "'complete'"
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
    public static final int T__52=52;
    public static final int T__53=53;
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


    // $ANTLR start "entryRuleInclude"
    // InternalOntoL.g:203:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // InternalOntoL.g:204:1: ( ruleInclude EOF )
            // InternalOntoL.g:205:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalOntoL.g:212:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:216:2: ( ( ( rule__Include__Group__0 ) ) )
            // InternalOntoL.g:217:2: ( ( rule__Include__Group__0 ) )
            {
            // InternalOntoL.g:217:2: ( ( rule__Include__Group__0 ) )
            // InternalOntoL.g:218:3: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // InternalOntoL.g:219:3: ( rule__Include__Group__0 )
            // InternalOntoL.g:219:4: rule__Include__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Include__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleIndividual"
    // InternalOntoL.g:228:1: entryRuleIndividual : ruleIndividual EOF ;
    public final void entryRuleIndividual() throws RecognitionException {
        try {
            // InternalOntoL.g:229:1: ( ruleIndividual EOF )
            // InternalOntoL.g:230:1: ruleIndividual EOF
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
    // InternalOntoL.g:237:1: ruleIndividual : ( ( rule__Individual__Group__0 ) ) ;
    public final void ruleIndividual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:241:2: ( ( ( rule__Individual__Group__0 ) ) )
            // InternalOntoL.g:242:2: ( ( rule__Individual__Group__0 ) )
            {
            // InternalOntoL.g:242:2: ( ( rule__Individual__Group__0 ) )
            // InternalOntoL.g:243:3: ( rule__Individual__Group__0 )
            {
             before(grammarAccess.getIndividualAccess().getGroup()); 
            // InternalOntoL.g:244:3: ( rule__Individual__Group__0 )
            // InternalOntoL.g:244:4: rule__Individual__Group__0
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
    // InternalOntoL.g:253:1: entryRuleOntoLClass : ruleOntoLClass EOF ;
    public final void entryRuleOntoLClass() throws RecognitionException {
        try {
            // InternalOntoL.g:254:1: ( ruleOntoLClass EOF )
            // InternalOntoL.g:255:1: ruleOntoLClass EOF
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
    // InternalOntoL.g:262:1: ruleOntoLClass : ( ( rule__OntoLClass__Group__0 ) ) ;
    public final void ruleOntoLClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:266:2: ( ( ( rule__OntoLClass__Group__0 ) ) )
            // InternalOntoL.g:267:2: ( ( rule__OntoLClass__Group__0 ) )
            {
            // InternalOntoL.g:267:2: ( ( rule__OntoLClass__Group__0 ) )
            // InternalOntoL.g:268:3: ( rule__OntoLClass__Group__0 )
            {
             before(grammarAccess.getOntoLClassAccess().getGroup()); 
            // InternalOntoL.g:269:3: ( rule__OntoLClass__Group__0 )
            // InternalOntoL.g:269:4: rule__OntoLClass__Group__0
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
    // InternalOntoL.g:278:1: entryRuleOrderlessClass : ruleOrderlessClass EOF ;
    public final void entryRuleOrderlessClass() throws RecognitionException {
        try {
            // InternalOntoL.g:279:1: ( ruleOrderlessClass EOF )
            // InternalOntoL.g:280:1: ruleOrderlessClass EOF
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
    // InternalOntoL.g:287:1: ruleOrderlessClass : ( ( rule__OrderlessClass__Group__0 ) ) ;
    public final void ruleOrderlessClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:291:2: ( ( ( rule__OrderlessClass__Group__0 ) ) )
            // InternalOntoL.g:292:2: ( ( rule__OrderlessClass__Group__0 ) )
            {
            // InternalOntoL.g:292:2: ( ( rule__OrderlessClass__Group__0 ) )
            // InternalOntoL.g:293:3: ( rule__OrderlessClass__Group__0 )
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup()); 
            // InternalOntoL.g:294:3: ( rule__OrderlessClass__Group__0 )
            // InternalOntoL.g:294:4: rule__OrderlessClass__Group__0
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
    // InternalOntoL.g:303:1: entryRuleFOClass : ruleFOClass EOF ;
    public final void entryRuleFOClass() throws RecognitionException {
        try {
            // InternalOntoL.g:304:1: ( ruleFOClass EOF )
            // InternalOntoL.g:305:1: ruleFOClass EOF
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
    // InternalOntoL.g:312:1: ruleFOClass : ( ( rule__FOClass__Group__0 ) ) ;
    public final void ruleFOClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:316:2: ( ( ( rule__FOClass__Group__0 ) ) )
            // InternalOntoL.g:317:2: ( ( rule__FOClass__Group__0 ) )
            {
            // InternalOntoL.g:317:2: ( ( rule__FOClass__Group__0 ) )
            // InternalOntoL.g:318:3: ( rule__FOClass__Group__0 )
            {
             before(grammarAccess.getFOClassAccess().getGroup()); 
            // InternalOntoL.g:319:3: ( rule__FOClass__Group__0 )
            // InternalOntoL.g:319:4: rule__FOClass__Group__0
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
    // InternalOntoL.g:328:1: entryRuleHOClass : ruleHOClass EOF ;
    public final void entryRuleHOClass() throws RecognitionException {
        try {
            // InternalOntoL.g:329:1: ( ruleHOClass EOF )
            // InternalOntoL.g:330:1: ruleHOClass EOF
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
    // InternalOntoL.g:337:1: ruleHOClass : ( ( rule__HOClass__Group__0 ) ) ;
    public final void ruleHOClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:341:2: ( ( ( rule__HOClass__Group__0 ) ) )
            // InternalOntoL.g:342:2: ( ( rule__HOClass__Group__0 ) )
            {
            // InternalOntoL.g:342:2: ( ( rule__HOClass__Group__0 ) )
            // InternalOntoL.g:343:3: ( rule__HOClass__Group__0 )
            {
             before(grammarAccess.getHOClassAccess().getGroup()); 
            // InternalOntoL.g:344:3: ( rule__HOClass__Group__0 )
            // InternalOntoL.g:344:4: rule__HOClass__Group__0
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
    // InternalOntoL.g:353:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalOntoL.g:354:1: ( ruleAttribute EOF )
            // InternalOntoL.g:355:1: ruleAttribute EOF
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
    // InternalOntoL.g:362:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:366:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalOntoL.g:367:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalOntoL.g:367:2: ( ( rule__Attribute__Group__0 ) )
            // InternalOntoL.g:368:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalOntoL.g:369:3: ( rule__Attribute__Group__0 )
            // InternalOntoL.g:369:4: rule__Attribute__Group__0
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


    // $ANTLR start "entryRuleELEMENTBOUND"
    // InternalOntoL.g:403:1: entryRuleELEMENTBOUND : ruleELEMENTBOUND EOF ;
    public final void entryRuleELEMENTBOUND() throws RecognitionException {
        try {
            // InternalOntoL.g:404:1: ( ruleELEMENTBOUND EOF )
            // InternalOntoL.g:405:1: ruleELEMENTBOUND EOF
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
    // InternalOntoL.g:412:1: ruleELEMENTBOUND : ( ( rule__ELEMENTBOUND__Alternatives ) ) ;
    public final void ruleELEMENTBOUND() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:416:2: ( ( ( rule__ELEMENTBOUND__Alternatives ) ) )
            // InternalOntoL.g:417:2: ( ( rule__ELEMENTBOUND__Alternatives ) )
            {
            // InternalOntoL.g:417:2: ( ( rule__ELEMENTBOUND__Alternatives ) )
            // InternalOntoL.g:418:3: ( rule__ELEMENTBOUND__Alternatives )
            {
             before(grammarAccess.getELEMENTBOUNDAccess().getAlternatives()); 
            // InternalOntoL.g:419:3: ( rule__ELEMENTBOUND__Alternatives )
            // InternalOntoL.g:419:4: rule__ELEMENTBOUND__Alternatives
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
    // InternalOntoL.g:428:1: entryRuleAttributeAssignment : ruleAttributeAssignment EOF ;
    public final void entryRuleAttributeAssignment() throws RecognitionException {
        try {
            // InternalOntoL.g:429:1: ( ruleAttributeAssignment EOF )
            // InternalOntoL.g:430:1: ruleAttributeAssignment EOF
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
    // InternalOntoL.g:437:1: ruleAttributeAssignment : ( ( rule__AttributeAssignment__Group__0 ) ) ;
    public final void ruleAttributeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:441:2: ( ( ( rule__AttributeAssignment__Group__0 ) ) )
            // InternalOntoL.g:442:2: ( ( rule__AttributeAssignment__Group__0 ) )
            {
            // InternalOntoL.g:442:2: ( ( rule__AttributeAssignment__Group__0 ) )
            // InternalOntoL.g:443:3: ( rule__AttributeAssignment__Group__0 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getGroup()); 
            // InternalOntoL.g:444:3: ( rule__AttributeAssignment__Group__0 )
            // InternalOntoL.g:444:4: rule__AttributeAssignment__Group__0
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


    // $ANTLR start "entryRuleGeneralizationSet"
    // InternalOntoL.g:678:1: entryRuleGeneralizationSet : ruleGeneralizationSet EOF ;
    public final void entryRuleGeneralizationSet() throws RecognitionException {
        try {
            // InternalOntoL.g:679:1: ( ruleGeneralizationSet EOF )
            // InternalOntoL.g:680:1: ruleGeneralizationSet EOF
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
    // InternalOntoL.g:687:1: ruleGeneralizationSet : ( ( rule__GeneralizationSet__Group__0 ) ) ;
    public final void ruleGeneralizationSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:691:2: ( ( ( rule__GeneralizationSet__Group__0 ) ) )
            // InternalOntoL.g:692:2: ( ( rule__GeneralizationSet__Group__0 ) )
            {
            // InternalOntoL.g:692:2: ( ( rule__GeneralizationSet__Group__0 ) )
            // InternalOntoL.g:693:3: ( rule__GeneralizationSet__Group__0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup()); 
            // InternalOntoL.g:694:3: ( rule__GeneralizationSet__Group__0 )
            // InternalOntoL.g:694:4: rule__GeneralizationSet__Group__0
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
    // InternalOntoL.g:703:1: ruleCategorizationType : ( ( rule__CategorizationType__Alternatives ) ) ;
    public final void ruleCategorizationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:707:1: ( ( ( rule__CategorizationType__Alternatives ) ) )
            // InternalOntoL.g:708:2: ( ( rule__CategorizationType__Alternatives ) )
            {
            // InternalOntoL.g:708:2: ( ( rule__CategorizationType__Alternatives ) )
            // InternalOntoL.g:709:3: ( rule__CategorizationType__Alternatives )
            {
             before(grammarAccess.getCategorizationTypeAccess().getAlternatives()); 
            // InternalOntoL.g:710:3: ( rule__CategorizationType__Alternatives )
            // InternalOntoL.g:710:4: rule__CategorizationType__Alternatives
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


    // $ANTLR start "rule__ModelElement__Alternatives_0"
    // InternalOntoL.g:718:1: rule__ModelElement__Alternatives_0 : ( ( ruleImport ) | ( ruleInclude ) | ( ruleEntityDeclaration ) | ( ruleGeneralizationSet ) );
    public final void rule__ModelElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:722:1: ( ( ruleImport ) | ( ruleInclude ) | ( ruleEntityDeclaration ) | ( ruleGeneralizationSet ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 26:
            case 29:
            case 30:
            case 34:
            case 35:
                {
                alt1=3;
                }
                break;
            case 46:
            case 49:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalOntoL.g:723:2: ( ruleImport )
                    {
                    // InternalOntoL.g:723:2: ( ruleImport )
                    // InternalOntoL.g:724:3: ruleImport
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
                    // InternalOntoL.g:729:2: ( ruleInclude )
                    {
                    // InternalOntoL.g:729:2: ( ruleInclude )
                    // InternalOntoL.g:730:3: ruleInclude
                    {
                     before(grammarAccess.getModelElementAccess().getIncludeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInclude();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getIncludeParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:735:2: ( ruleEntityDeclaration )
                    {
                    // InternalOntoL.g:735:2: ( ruleEntityDeclaration )
                    // InternalOntoL.g:736:3: ruleEntityDeclaration
                    {
                     before(grammarAccess.getModelElementAccess().getEntityDeclarationParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEntityDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getEntityDeclarationParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:741:2: ( ruleGeneralizationSet )
                    {
                    // InternalOntoL.g:741:2: ( ruleGeneralizationSet )
                    // InternalOntoL.g:742:3: ruleGeneralizationSet
                    {
                     before(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralizationSet();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_0_3()); 

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
    // InternalOntoL.g:751:1: rule__EntityDeclaration__Alternatives : ( ( ruleOntoLClass ) | ( ruleIndividual ) );
    public final void rule__EntityDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:755:1: ( ( ruleOntoLClass ) | ( ruleIndividual ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=29 && LA2_0<=30)||(LA2_0>=34 && LA2_0<=35)) ) {
                alt2=1;
            }
            else if ( (LA2_0==26) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalOntoL.g:756:2: ( ruleOntoLClass )
                    {
                    // InternalOntoL.g:756:2: ( ruleOntoLClass )
                    // InternalOntoL.g:757:3: ruleOntoLClass
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
                    // InternalOntoL.g:762:2: ( ruleIndividual )
                    {
                    // InternalOntoL.g:762:2: ( ruleIndividual )
                    // InternalOntoL.g:763:3: ruleIndividual
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
    // InternalOntoL.g:772:1: rule__Individual__Alternatives_3_1 : ( ( ( rule__Individual__AttAssignmentsAssignment_3_1_0 ) ) | ( ( rule__Individual__RefAssignmentsAssignment_3_1_1 ) ) );
    public final void rule__Individual__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:776:1: ( ( ( rule__Individual__AttAssignmentsAssignment_3_1_0 ) ) | ( ( rule__Individual__RefAssignmentsAssignment_3_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==36) ) {
                alt3=1;
            }
            else if ( (LA3_0==42) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalOntoL.g:777:2: ( ( rule__Individual__AttAssignmentsAssignment_3_1_0 ) )
                    {
                    // InternalOntoL.g:777:2: ( ( rule__Individual__AttAssignmentsAssignment_3_1_0 ) )
                    // InternalOntoL.g:778:3: ( rule__Individual__AttAssignmentsAssignment_3_1_0 )
                    {
                     before(grammarAccess.getIndividualAccess().getAttAssignmentsAssignment_3_1_0()); 
                    // InternalOntoL.g:779:3: ( rule__Individual__AttAssignmentsAssignment_3_1_0 )
                    // InternalOntoL.g:779:4: rule__Individual__AttAssignmentsAssignment_3_1_0
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
                    // InternalOntoL.g:783:2: ( ( rule__Individual__RefAssignmentsAssignment_3_1_1 ) )
                    {
                    // InternalOntoL.g:783:2: ( ( rule__Individual__RefAssignmentsAssignment_3_1_1 ) )
                    // InternalOntoL.g:784:3: ( rule__Individual__RefAssignmentsAssignment_3_1_1 )
                    {
                     before(grammarAccess.getIndividualAccess().getRefAssignmentsAssignment_3_1_1()); 
                    // InternalOntoL.g:785:3: ( rule__Individual__RefAssignmentsAssignment_3_1_1 )
                    // InternalOntoL.g:785:4: rule__Individual__RefAssignmentsAssignment_3_1_1
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
    // InternalOntoL.g:793:1: rule__OntoLClass__Alternatives_0 : ( ( ruleOrderlessClass ) | ( ruleHOClass ) | ( ruleFOClass ) );
    public final void rule__OntoLClass__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:797:1: ( ( ruleOrderlessClass ) | ( ruleHOClass ) | ( ruleFOClass ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt4=1;
                }
                break;
            case 35:
                {
                alt4=2;
                }
                break;
            case 30:
            case 34:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalOntoL.g:798:2: ( ruleOrderlessClass )
                    {
                    // InternalOntoL.g:798:2: ( ruleOrderlessClass )
                    // InternalOntoL.g:799:3: ruleOrderlessClass
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
                    // InternalOntoL.g:804:2: ( ruleHOClass )
                    {
                    // InternalOntoL.g:804:2: ( ruleHOClass )
                    // InternalOntoL.g:805:3: ruleHOClass
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
                    // InternalOntoL.g:810:2: ( ruleFOClass )
                    {
                    // InternalOntoL.g:810:2: ( ruleFOClass )
                    // InternalOntoL.g:811:3: ruleFOClass
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
    // InternalOntoL.g:820:1: rule__OntoLClass__Alternatives_1_1 : ( ( ( rule__OntoLClass__AttributesAssignment_1_1_0 ) ) | ( ( rule__OntoLClass__AttAssignmentsAssignment_1_1_1 ) ) | ( ( rule__OntoLClass__ReferencesAssignment_1_1_2 ) ) | ( ( rule__OntoLClass__RefAssignmentsAssignment_1_1_3 ) ) );
    public final void rule__OntoLClass__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:824:1: ( ( ( rule__OntoLClass__AttributesAssignment_1_1_0 ) ) | ( ( rule__OntoLClass__AttAssignmentsAssignment_1_1_1 ) ) | ( ( rule__OntoLClass__ReferencesAssignment_1_1_2 ) ) | ( ( rule__OntoLClass__RefAssignmentsAssignment_1_1_3 ) ) )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==22||LA5_3==43) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==27) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==42) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_ID) ) {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4==27) ) {
                        alt5=3;
                    }
                    else if ( (LA5_4==22||LA5_4==43) ) {
                        alt5=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalOntoL.g:825:2: ( ( rule__OntoLClass__AttributesAssignment_1_1_0 ) )
                    {
                    // InternalOntoL.g:825:2: ( ( rule__OntoLClass__AttributesAssignment_1_1_0 ) )
                    // InternalOntoL.g:826:3: ( rule__OntoLClass__AttributesAssignment_1_1_0 )
                    {
                     before(grammarAccess.getOntoLClassAccess().getAttributesAssignment_1_1_0()); 
                    // InternalOntoL.g:827:3: ( rule__OntoLClass__AttributesAssignment_1_1_0 )
                    // InternalOntoL.g:827:4: rule__OntoLClass__AttributesAssignment_1_1_0
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
                    // InternalOntoL.g:831:2: ( ( rule__OntoLClass__AttAssignmentsAssignment_1_1_1 ) )
                    {
                    // InternalOntoL.g:831:2: ( ( rule__OntoLClass__AttAssignmentsAssignment_1_1_1 ) )
                    // InternalOntoL.g:832:3: ( rule__OntoLClass__AttAssignmentsAssignment_1_1_1 )
                    {
                     before(grammarAccess.getOntoLClassAccess().getAttAssignmentsAssignment_1_1_1()); 
                    // InternalOntoL.g:833:3: ( rule__OntoLClass__AttAssignmentsAssignment_1_1_1 )
                    // InternalOntoL.g:833:4: rule__OntoLClass__AttAssignmentsAssignment_1_1_1
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
                    // InternalOntoL.g:837:2: ( ( rule__OntoLClass__ReferencesAssignment_1_1_2 ) )
                    {
                    // InternalOntoL.g:837:2: ( ( rule__OntoLClass__ReferencesAssignment_1_1_2 ) )
                    // InternalOntoL.g:838:3: ( rule__OntoLClass__ReferencesAssignment_1_1_2 )
                    {
                     before(grammarAccess.getOntoLClassAccess().getReferencesAssignment_1_1_2()); 
                    // InternalOntoL.g:839:3: ( rule__OntoLClass__ReferencesAssignment_1_1_2 )
                    // InternalOntoL.g:839:4: rule__OntoLClass__ReferencesAssignment_1_1_2
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
                    // InternalOntoL.g:843:2: ( ( rule__OntoLClass__RefAssignmentsAssignment_1_1_3 ) )
                    {
                    // InternalOntoL.g:843:2: ( ( rule__OntoLClass__RefAssignmentsAssignment_1_1_3 ) )
                    // InternalOntoL.g:844:3: ( rule__OntoLClass__RefAssignmentsAssignment_1_1_3 )
                    {
                     before(grammarAccess.getOntoLClassAccess().getRefAssignmentsAssignment_1_1_3()); 
                    // InternalOntoL.g:845:3: ( rule__OntoLClass__RefAssignmentsAssignment_1_1_3 )
                    // InternalOntoL.g:845:4: rule__OntoLClass__RefAssignmentsAssignment_1_1_3
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
    // InternalOntoL.g:853:1: rule__OrderlessClass__Alternatives_6 : ( ( ( rule__OrderlessClass__Group_6_0__0 ) ) | ( ( rule__OrderlessClass__Group_6_1__0 ) ) );
    public final void rule__OrderlessClass__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:857:1: ( ( ( rule__OrderlessClass__Group_6_0__0 ) ) | ( ( rule__OrderlessClass__Group_6_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=14 && LA6_0<=17)) ) {
                alt6=1;
            }
            else if ( (LA6_0==33) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOntoL.g:858:2: ( ( rule__OrderlessClass__Group_6_0__0 ) )
                    {
                    // InternalOntoL.g:858:2: ( ( rule__OrderlessClass__Group_6_0__0 ) )
                    // InternalOntoL.g:859:3: ( rule__OrderlessClass__Group_6_0__0 )
                    {
                     before(grammarAccess.getOrderlessClassAccess().getGroup_6_0()); 
                    // InternalOntoL.g:860:3: ( rule__OrderlessClass__Group_6_0__0 )
                    // InternalOntoL.g:860:4: rule__OrderlessClass__Group_6_0__0
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
                    // InternalOntoL.g:864:2: ( ( rule__OrderlessClass__Group_6_1__0 ) )
                    {
                    // InternalOntoL.g:864:2: ( ( rule__OrderlessClass__Group_6_1__0 ) )
                    // InternalOntoL.g:865:3: ( rule__OrderlessClass__Group_6_1__0 )
                    {
                     before(grammarAccess.getOrderlessClassAccess().getGroup_6_1()); 
                    // InternalOntoL.g:866:3: ( rule__OrderlessClass__Group_6_1__0 )
                    // InternalOntoL.g:866:4: rule__OrderlessClass__Group_6_1__0
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
    // InternalOntoL.g:874:1: rule__HOClass__Alternatives_7 : ( ( ( rule__HOClass__Group_7_0__0 ) ) | ( ( rule__HOClass__Group_7_1__0 ) ) );
    public final void rule__HOClass__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:878:1: ( ( ( rule__HOClass__Group_7_0__0 ) ) | ( ( rule__HOClass__Group_7_1__0 ) ) )
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
                    // InternalOntoL.g:879:2: ( ( rule__HOClass__Group_7_0__0 ) )
                    {
                    // InternalOntoL.g:879:2: ( ( rule__HOClass__Group_7_0__0 ) )
                    // InternalOntoL.g:880:3: ( rule__HOClass__Group_7_0__0 )
                    {
                     before(grammarAccess.getHOClassAccess().getGroup_7_0()); 
                    // InternalOntoL.g:881:3: ( rule__HOClass__Group_7_0__0 )
                    // InternalOntoL.g:881:4: rule__HOClass__Group_7_0__0
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
                    // InternalOntoL.g:885:2: ( ( rule__HOClass__Group_7_1__0 ) )
                    {
                    // InternalOntoL.g:885:2: ( ( rule__HOClass__Group_7_1__0 ) )
                    // InternalOntoL.g:886:3: ( rule__HOClass__Group_7_1__0 )
                    {
                     before(grammarAccess.getHOClassAccess().getGroup_7_1()); 
                    // InternalOntoL.g:887:3: ( rule__HOClass__Group_7_1__0 )
                    // InternalOntoL.g:887:4: rule__HOClass__Group_7_1__0
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
    // InternalOntoL.g:895:1: rule__ELEMENTBOUND__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__ELEMENTBOUND__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:899:1: ( ( '*' ) | ( RULE_INT ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOntoL.g:900:2: ( '*' )
                    {
                    // InternalOntoL.g:900:2: ( '*' )
                    // InternalOntoL.g:901:3: '*'
                    {
                     before(grammarAccess.getELEMENTBOUNDAccess().getAsteriskKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getELEMENTBOUNDAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:906:2: ( RULE_INT )
                    {
                    // InternalOntoL.g:906:2: ( RULE_INT )
                    // InternalOntoL.g:907:3: RULE_INT
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
    // InternalOntoL.g:916:1: rule__AttributeAssignment__Alternatives_3 : ( ( ( rule__AttributeAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__AttributeAssignment__Group_3_1__0 ) ) );
    public final void rule__AttributeAssignment__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:920:1: ( ( ( rule__AttributeAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__AttributeAssignment__Group_3_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||LA9_0==RULE_STRING||(LA9_0>=12 && LA9_0<=13)||(LA9_0>=44 && LA9_0<=45)) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntoL.g:921:2: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_0 ) )
                    {
                    // InternalOntoL.g:921:2: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_0 ) )
                    // InternalOntoL.g:922:3: ( rule__AttributeAssignment__AssignmentsAssignment_3_0 )
                    {
                     before(grammarAccess.getAttributeAssignmentAccess().getAssignmentsAssignment_3_0()); 
                    // InternalOntoL.g:923:3: ( rule__AttributeAssignment__AssignmentsAssignment_3_0 )
                    // InternalOntoL.g:923:4: rule__AttributeAssignment__AssignmentsAssignment_3_0
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
                    // InternalOntoL.g:927:2: ( ( rule__AttributeAssignment__Group_3_1__0 ) )
                    {
                    // InternalOntoL.g:927:2: ( ( rule__AttributeAssignment__Group_3_1__0 ) )
                    // InternalOntoL.g:928:3: ( rule__AttributeAssignment__Group_3_1__0 )
                    {
                     before(grammarAccess.getAttributeAssignmentAccess().getGroup_3_1()); 
                    // InternalOntoL.g:929:3: ( rule__AttributeAssignment__Group_3_1__0 )
                    // InternalOntoL.g:929:4: rule__AttributeAssignment__Group_3_1__0
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
    // InternalOntoL.g:937:1: rule__ReferenceAssignment__Alternatives_3 : ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__ReferenceAssignment__Group_3_1__0 ) ) );
    public final void rule__ReferenceAssignment__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:941:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__ReferenceAssignment__Group_3_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
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
                    // InternalOntoL.g:942:2: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) )
                    {
                    // InternalOntoL.g:942:2: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) )
                    // InternalOntoL.g:943:3: ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 )
                    {
                     before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_0()); 
                    // InternalOntoL.g:944:3: ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 )
                    // InternalOntoL.g:944:4: rule__ReferenceAssignment__AssignmentsAssignment_3_0
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
                    // InternalOntoL.g:948:2: ( ( rule__ReferenceAssignment__Group_3_1__0 ) )
                    {
                    // InternalOntoL.g:948:2: ( ( rule__ReferenceAssignment__Group_3_1__0 ) )
                    // InternalOntoL.g:949:3: ( rule__ReferenceAssignment__Group_3_1__0 )
                    {
                     before(grammarAccess.getReferenceAssignmentAccess().getGroup_3_1()); 
                    // InternalOntoL.g:950:3: ( rule__ReferenceAssignment__Group_3_1__0 )
                    // InternalOntoL.g:950:4: rule__ReferenceAssignment__Group_3_1__0
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
    // InternalOntoL.g:958:1: rule__DataValue__Alternatives : ( ( ruleStringValue ) | ( ruleNumberValue ) | ( ruleBooleanValue ) | ( ruleNoneValue ) );
    public final void rule__DataValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:962:1: ( ( ruleStringValue ) | ( ruleNumberValue ) | ( ruleBooleanValue ) | ( ruleNoneValue ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case RULE_INT:
            case 44:
                {
                alt11=2;
                }
                break;
            case 12:
            case 13:
                {
                alt11=3;
                }
                break;
            case 45:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalOntoL.g:963:2: ( ruleStringValue )
                    {
                    // InternalOntoL.g:963:2: ( ruleStringValue )
                    // InternalOntoL.g:964:3: ruleStringValue
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
                    // InternalOntoL.g:969:2: ( ruleNumberValue )
                    {
                    // InternalOntoL.g:969:2: ( ruleNumberValue )
                    // InternalOntoL.g:970:3: ruleNumberValue
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
                    // InternalOntoL.g:975:2: ( ruleBooleanValue )
                    {
                    // InternalOntoL.g:975:2: ( ruleBooleanValue )
                    // InternalOntoL.g:976:3: ruleBooleanValue
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
                    // InternalOntoL.g:981:2: ( ruleNoneValue )
                    {
                    // InternalOntoL.g:981:2: ( ruleNoneValue )
                    // InternalOntoL.g:982:3: ruleNoneValue
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
    // InternalOntoL.g:991:1: rule__BOOLEAN__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:995:1: ( ( 'true' ) | ( 'false' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            else if ( (LA12_0==13) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalOntoL.g:996:2: ( 'true' )
                    {
                    // InternalOntoL.g:996:2: ( 'true' )
                    // InternalOntoL.g:997:3: 'true'
                    {
                     before(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1002:2: ( 'false' )
                    {
                    // InternalOntoL.g:1002:2: ( 'false' )
                    // InternalOntoL.g:1003:3: 'false'
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
    // InternalOntoL.g:1012:1: rule__GeneralizationSet__Alternatives_0 : ( ( ( rule__GeneralizationSet__Group_0_0__0 ) ) | ( ( rule__GeneralizationSet__Group_0_1__0 ) ) | ( ( rule__GeneralizationSet__Group_0_2__0 ) ) | ( ( rule__GeneralizationSet__Group_0_3__0 ) ) );
    public final void rule__GeneralizationSet__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1016:1: ( ( ( rule__GeneralizationSet__Group_0_0__0 ) ) | ( ( rule__GeneralizationSet__Group_0_1__0 ) ) | ( ( rule__GeneralizationSet__Group_0_2__0 ) ) | ( ( rule__GeneralizationSet__Group_0_3__0 ) ) )
            int alt13=4;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==49) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==52) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==50) ) {
                        alt13=1;
                    }
                    else if ( (LA13_2==28) ) {
                        alt13=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA13_1==53) ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==28) ) {
                        alt13=4;
                    }
                    else if ( (LA13_3==50) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalOntoL.g:1017:2: ( ( rule__GeneralizationSet__Group_0_0__0 ) )
                    {
                    // InternalOntoL.g:1017:2: ( ( rule__GeneralizationSet__Group_0_0__0 ) )
                    // InternalOntoL.g:1018:3: ( rule__GeneralizationSet__Group_0_0__0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getGroup_0_0()); 
                    // InternalOntoL.g:1019:3: ( rule__GeneralizationSet__Group_0_0__0 )
                    // InternalOntoL.g:1019:4: rule__GeneralizationSet__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGeneralizationSetAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1023:2: ( ( rule__GeneralizationSet__Group_0_1__0 ) )
                    {
                    // InternalOntoL.g:1023:2: ( ( rule__GeneralizationSet__Group_0_1__0 ) )
                    // InternalOntoL.g:1024:3: ( rule__GeneralizationSet__Group_0_1__0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getGroup_0_1()); 
                    // InternalOntoL.g:1025:3: ( rule__GeneralizationSet__Group_0_1__0 )
                    // InternalOntoL.g:1025:4: rule__GeneralizationSet__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGeneralizationSetAccess().getGroup_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:1029:2: ( ( rule__GeneralizationSet__Group_0_2__0 ) )
                    {
                    // InternalOntoL.g:1029:2: ( ( rule__GeneralizationSet__Group_0_2__0 ) )
                    // InternalOntoL.g:1030:3: ( rule__GeneralizationSet__Group_0_2__0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getGroup_0_2()); 
                    // InternalOntoL.g:1031:3: ( rule__GeneralizationSet__Group_0_2__0 )
                    // InternalOntoL.g:1031:4: rule__GeneralizationSet__Group_0_2__0
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
                    // InternalOntoL.g:1035:2: ( ( rule__GeneralizationSet__Group_0_3__0 ) )
                    {
                    // InternalOntoL.g:1035:2: ( ( rule__GeneralizationSet__Group_0_3__0 ) )
                    // InternalOntoL.g:1036:3: ( rule__GeneralizationSet__Group_0_3__0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getGroup_0_3()); 
                    // InternalOntoL.g:1037:3: ( rule__GeneralizationSet__Group_0_3__0 )
                    // InternalOntoL.g:1037:4: rule__GeneralizationSet__Group_0_3__0
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
    // InternalOntoL.g:1045:1: rule__CategorizationType__Alternatives : ( ( ( 'categorizes' ) ) | ( ( 'completecategorizes' ) ) | ( ( 'disjointcategorizes' ) ) | ( ( 'partitions' ) ) );
    public final void rule__CategorizationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1049:1: ( ( ( 'categorizes' ) ) | ( ( 'completecategorizes' ) ) | ( ( 'disjointcategorizes' ) ) | ( ( 'partitions' ) ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt14=1;
                }
                break;
            case 15:
                {
                alt14=2;
                }
                break;
            case 16:
                {
                alt14=3;
                }
                break;
            case 17:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalOntoL.g:1050:2: ( ( 'categorizes' ) )
                    {
                    // InternalOntoL.g:1050:2: ( ( 'categorizes' ) )
                    // InternalOntoL.g:1051:3: ( 'categorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0()); 
                    // InternalOntoL.g:1052:3: ( 'categorizes' )
                    // InternalOntoL.g:1052:4: 'categorizes'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1056:2: ( ( 'completecategorizes' ) )
                    {
                    // InternalOntoL.g:1056:2: ( ( 'completecategorizes' ) )
                    // InternalOntoL.g:1057:3: ( 'completecategorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1()); 
                    // InternalOntoL.g:1058:3: ( 'completecategorizes' )
                    // InternalOntoL.g:1058:4: 'completecategorizes'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:1062:2: ( ( 'disjointcategorizes' ) )
                    {
                    // InternalOntoL.g:1062:2: ( ( 'disjointcategorizes' ) )
                    // InternalOntoL.g:1063:3: ( 'disjointcategorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2()); 
                    // InternalOntoL.g:1064:3: ( 'disjointcategorizes' )
                    // InternalOntoL.g:1064:4: 'disjointcategorizes'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:1068:2: ( ( 'partitions' ) )
                    {
                    // InternalOntoL.g:1068:2: ( ( 'partitions' ) )
                    // InternalOntoL.g:1069:3: ( 'partitions' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getPARTITIONEREnumLiteralDeclaration_3()); 
                    // InternalOntoL.g:1070:3: ( 'partitions' )
                    // InternalOntoL.g:1070:4: 'partitions'
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
    // InternalOntoL.g:1078:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1082:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalOntoL.g:1083:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalOntoL.g:1090:1: rule__Model__Group__0__Impl : ( 'module' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1094:1: ( ( 'module' ) )
            // InternalOntoL.g:1095:1: ( 'module' )
            {
            // InternalOntoL.g:1095:1: ( 'module' )
            // InternalOntoL.g:1096:2: 'module'
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
    // InternalOntoL.g:1105:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1109:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalOntoL.g:1110:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalOntoL.g:1117:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1121:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalOntoL.g:1122:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalOntoL.g:1122:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalOntoL.g:1123:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalOntoL.g:1124:2: ( rule__Model__NameAssignment_1 )
            // InternalOntoL.g:1124:3: rule__Model__NameAssignment_1
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
    // InternalOntoL.g:1132:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1136:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalOntoL.g:1137:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalOntoL.g:1144:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1148:1: ( ( '{' ) )
            // InternalOntoL.g:1149:1: ( '{' )
            {
            // InternalOntoL.g:1149:1: ( '{' )
            // InternalOntoL.g:1150:2: '{'
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
    // InternalOntoL.g:1159:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1163:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalOntoL.g:1164:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalOntoL.g:1171:1: rule__Model__Group__3__Impl : ( ( rule__Model__ElementsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1175:1: ( ( ( rule__Model__ElementsAssignment_3 )* ) )
            // InternalOntoL.g:1176:1: ( ( rule__Model__ElementsAssignment_3 )* )
            {
            // InternalOntoL.g:1176:1: ( ( rule__Model__ElementsAssignment_3 )* )
            // InternalOntoL.g:1177:2: ( rule__Model__ElementsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3()); 
            // InternalOntoL.g:1178:2: ( rule__Model__ElementsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=24 && LA15_0<=26)||(LA15_0>=29 && LA15_0<=30)||(LA15_0>=34 && LA15_0<=35)||LA15_0==46||LA15_0==49) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOntoL.g:1178:3: rule__Model__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment_3()); 

            }


            }

        }
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
    // InternalOntoL.g:1186:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1190:1: ( rule__Model__Group__4__Impl )
            // InternalOntoL.g:1191:2: rule__Model__Group__4__Impl
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
    // InternalOntoL.g:1197:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1201:1: ( ( '}' ) )
            // InternalOntoL.g:1202:1: ( '}' )
            {
            // InternalOntoL.g:1202:1: ( '}' )
            // InternalOntoL.g:1203:2: '}'
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


    // $ANTLR start "rule__ModelElement__Group__0"
    // InternalOntoL.g:1213:1: rule__ModelElement__Group__0 : rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 ;
    public final void rule__ModelElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1217:1: ( rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 )
            // InternalOntoL.g:1218:2: rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1
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
    // InternalOntoL.g:1225:1: rule__ModelElement__Group__0__Impl : ( ( rule__ModelElement__Alternatives_0 ) ) ;
    public final void rule__ModelElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1229:1: ( ( ( rule__ModelElement__Alternatives_0 ) ) )
            // InternalOntoL.g:1230:1: ( ( rule__ModelElement__Alternatives_0 ) )
            {
            // InternalOntoL.g:1230:1: ( ( rule__ModelElement__Alternatives_0 ) )
            // InternalOntoL.g:1231:2: ( rule__ModelElement__Alternatives_0 )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives_0()); 
            // InternalOntoL.g:1232:2: ( rule__ModelElement__Alternatives_0 )
            // InternalOntoL.g:1232:3: rule__ModelElement__Alternatives_0
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
    // InternalOntoL.g:1240:1: rule__ModelElement__Group__1 : rule__ModelElement__Group__1__Impl ;
    public final void rule__ModelElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1244:1: ( rule__ModelElement__Group__1__Impl )
            // InternalOntoL.g:1245:2: rule__ModelElement__Group__1__Impl
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
    // InternalOntoL.g:1251:1: rule__ModelElement__Group__1__Impl : ( ';' ) ;
    public final void rule__ModelElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1255:1: ( ( ';' ) )
            // InternalOntoL.g:1256:1: ( ';' )
            {
            // InternalOntoL.g:1256:1: ( ';' )
            // InternalOntoL.g:1257:2: ';'
            {
             before(grammarAccess.getModelElementAccess().getSemicolonKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalOntoL.g:1267:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1271:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalOntoL.g:1272:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalOntoL.g:1279:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1283:1: ( ( RULE_ID ) )
            // InternalOntoL.g:1284:1: ( RULE_ID )
            {
            // InternalOntoL.g:1284:1: ( RULE_ID )
            // InternalOntoL.g:1285:2: RULE_ID
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
    // InternalOntoL.g:1294:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1298:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalOntoL.g:1299:2: rule__QualifiedName__Group__1__Impl
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
    // InternalOntoL.g:1305:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1309:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalOntoL.g:1310:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalOntoL.g:1310:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalOntoL.g:1311:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalOntoL.g:1312:2: ( rule__QualifiedName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOntoL.g:1312:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalOntoL.g:1321:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1325:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalOntoL.g:1326:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalOntoL.g:1333:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1337:1: ( ( '.' ) )
            // InternalOntoL.g:1338:1: ( '.' )
            {
            // InternalOntoL.g:1338:1: ( '.' )
            // InternalOntoL.g:1339:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalOntoL.g:1348:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1352:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalOntoL.g:1353:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalOntoL.g:1359:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1363:1: ( ( RULE_ID ) )
            // InternalOntoL.g:1364:1: ( RULE_ID )
            {
            // InternalOntoL.g:1364:1: ( RULE_ID )
            // InternalOntoL.g:1365:2: RULE_ID
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
    // InternalOntoL.g:1375:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1379:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalOntoL.g:1380:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalOntoL.g:1387:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1391:1: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:1392:1: ( ruleQualifiedName )
            {
            // InternalOntoL.g:1392:1: ( ruleQualifiedName )
            // InternalOntoL.g:1393:2: ruleQualifiedName
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
    // InternalOntoL.g:1402:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1406:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalOntoL.g:1407:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalOntoL.g:1413:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1417:1: ( ( ( '.*' )? ) )
            // InternalOntoL.g:1418:1: ( ( '.*' )? )
            {
            // InternalOntoL.g:1418:1: ( ( '.*' )? )
            // InternalOntoL.g:1419:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalOntoL.g:1420:2: ( '.*' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOntoL.g:1420:3: '.*'
                    {
                    match(input,23,FOLLOW_2); 

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
    // InternalOntoL.g:1429:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1433:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalOntoL.g:1434:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalOntoL.g:1441:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1445:1: ( ( 'import' ) )
            // InternalOntoL.g:1446:1: ( 'import' )
            {
            // InternalOntoL.g:1446:1: ( 'import' )
            // InternalOntoL.g:1447:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalOntoL.g:1456:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1460:1: ( rule__Import__Group__1__Impl )
            // InternalOntoL.g:1461:2: rule__Import__Group__1__Impl
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
    // InternalOntoL.g:1467:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1471:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalOntoL.g:1472:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalOntoL.g:1472:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalOntoL.g:1473:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalOntoL.g:1474:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalOntoL.g:1474:3: rule__Import__ImportedNamespaceAssignment_1
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


    // $ANTLR start "rule__Include__Group__0"
    // InternalOntoL.g:1483:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1487:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // InternalOntoL.g:1488:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Include__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0"


    // $ANTLR start "rule__Include__Group__0__Impl"
    // InternalOntoL.g:1495:1: rule__Include__Group__0__Impl : ( 'include' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1499:1: ( ( 'include' ) )
            // InternalOntoL.g:1500:1: ( 'include' )
            {
            // InternalOntoL.g:1500:1: ( 'include' )
            // InternalOntoL.g:1501:2: 'include'
            {
             before(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0__Impl"


    // $ANTLR start "rule__Include__Group__1"
    // InternalOntoL.g:1510:1: rule__Include__Group__1 : rule__Include__Group__1__Impl ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1514:1: ( rule__Include__Group__1__Impl )
            // InternalOntoL.g:1515:2: rule__Include__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Include__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1"


    // $ANTLR start "rule__Include__Group__1__Impl"
    // InternalOntoL.g:1521:1: rule__Include__Group__1__Impl : ( ( rule__Include__IncludeAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1525:1: ( ( ( rule__Include__IncludeAssignment_1 ) ) )
            // InternalOntoL.g:1526:1: ( ( rule__Include__IncludeAssignment_1 ) )
            {
            // InternalOntoL.g:1526:1: ( ( rule__Include__IncludeAssignment_1 ) )
            // InternalOntoL.g:1527:2: ( rule__Include__IncludeAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getIncludeAssignment_1()); 
            // InternalOntoL.g:1528:2: ( rule__Include__IncludeAssignment_1 )
            // InternalOntoL.g:1528:3: rule__Include__IncludeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Include__IncludeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getIncludeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1__Impl"


    // $ANTLR start "rule__Individual__Group__0"
    // InternalOntoL.g:1537:1: rule__Individual__Group__0 : rule__Individual__Group__0__Impl rule__Individual__Group__1 ;
    public final void rule__Individual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1541:1: ( rule__Individual__Group__0__Impl rule__Individual__Group__1 )
            // InternalOntoL.g:1542:2: rule__Individual__Group__0__Impl rule__Individual__Group__1
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
    // InternalOntoL.g:1549:1: rule__Individual__Group__0__Impl : ( 'individual' ) ;
    public final void rule__Individual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1553:1: ( ( 'individual' ) )
            // InternalOntoL.g:1554:1: ( 'individual' )
            {
            // InternalOntoL.g:1554:1: ( 'individual' )
            // InternalOntoL.g:1555:2: 'individual'
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
    // InternalOntoL.g:1564:1: rule__Individual__Group__1 : rule__Individual__Group__1__Impl rule__Individual__Group__2 ;
    public final void rule__Individual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1568:1: ( rule__Individual__Group__1__Impl rule__Individual__Group__2 )
            // InternalOntoL.g:1569:2: rule__Individual__Group__1__Impl rule__Individual__Group__2
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
    // InternalOntoL.g:1576:1: rule__Individual__Group__1__Impl : ( ( rule__Individual__NameAssignment_1 ) ) ;
    public final void rule__Individual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1580:1: ( ( ( rule__Individual__NameAssignment_1 ) ) )
            // InternalOntoL.g:1581:1: ( ( rule__Individual__NameAssignment_1 ) )
            {
            // InternalOntoL.g:1581:1: ( ( rule__Individual__NameAssignment_1 ) )
            // InternalOntoL.g:1582:2: ( rule__Individual__NameAssignment_1 )
            {
             before(grammarAccess.getIndividualAccess().getNameAssignment_1()); 
            // InternalOntoL.g:1583:2: ( rule__Individual__NameAssignment_1 )
            // InternalOntoL.g:1583:3: rule__Individual__NameAssignment_1
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
    // InternalOntoL.g:1591:1: rule__Individual__Group__2 : rule__Individual__Group__2__Impl rule__Individual__Group__3 ;
    public final void rule__Individual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1595:1: ( rule__Individual__Group__2__Impl rule__Individual__Group__3 )
            // InternalOntoL.g:1596:2: rule__Individual__Group__2__Impl rule__Individual__Group__3
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
    // InternalOntoL.g:1603:1: rule__Individual__Group__2__Impl : ( ( rule__Individual__Group_2__0 )? ) ;
    public final void rule__Individual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1607:1: ( ( ( rule__Individual__Group_2__0 )? ) )
            // InternalOntoL.g:1608:1: ( ( rule__Individual__Group_2__0 )? )
            {
            // InternalOntoL.g:1608:1: ( ( rule__Individual__Group_2__0 )? )
            // InternalOntoL.g:1609:2: ( rule__Individual__Group_2__0 )?
            {
             before(grammarAccess.getIndividualAccess().getGroup_2()); 
            // InternalOntoL.g:1610:2: ( rule__Individual__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOntoL.g:1610:3: rule__Individual__Group_2__0
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
    // InternalOntoL.g:1618:1: rule__Individual__Group__3 : rule__Individual__Group__3__Impl ;
    public final void rule__Individual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1622:1: ( rule__Individual__Group__3__Impl )
            // InternalOntoL.g:1623:2: rule__Individual__Group__3__Impl
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
    // InternalOntoL.g:1629:1: rule__Individual__Group__3__Impl : ( ( rule__Individual__Group_3__0 )? ) ;
    public final void rule__Individual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1633:1: ( ( ( rule__Individual__Group_3__0 )? ) )
            // InternalOntoL.g:1634:1: ( ( rule__Individual__Group_3__0 )? )
            {
            // InternalOntoL.g:1634:1: ( ( rule__Individual__Group_3__0 )? )
            // InternalOntoL.g:1635:2: ( rule__Individual__Group_3__0 )?
            {
             before(grammarAccess.getIndividualAccess().getGroup_3()); 
            // InternalOntoL.g:1636:2: ( rule__Individual__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOntoL.g:1636:3: rule__Individual__Group_3__0
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
    // InternalOntoL.g:1645:1: rule__Individual__Group_2__0 : rule__Individual__Group_2__0__Impl rule__Individual__Group_2__1 ;
    public final void rule__Individual__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1649:1: ( rule__Individual__Group_2__0__Impl rule__Individual__Group_2__1 )
            // InternalOntoL.g:1650:2: rule__Individual__Group_2__0__Impl rule__Individual__Group_2__1
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
    // InternalOntoL.g:1657:1: rule__Individual__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Individual__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1661:1: ( ( ':' ) )
            // InternalOntoL.g:1662:1: ( ':' )
            {
            // InternalOntoL.g:1662:1: ( ':' )
            // InternalOntoL.g:1663:2: ':'
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
    // InternalOntoL.g:1672:1: rule__Individual__Group_2__1 : rule__Individual__Group_2__1__Impl rule__Individual__Group_2__2 ;
    public final void rule__Individual__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1676:1: ( rule__Individual__Group_2__1__Impl rule__Individual__Group_2__2 )
            // InternalOntoL.g:1677:2: rule__Individual__Group_2__1__Impl rule__Individual__Group_2__2
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
    // InternalOntoL.g:1684:1: rule__Individual__Group_2__1__Impl : ( ( rule__Individual__InstantiatedClassesAssignment_2_1 ) ) ;
    public final void rule__Individual__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1688:1: ( ( ( rule__Individual__InstantiatedClassesAssignment_2_1 ) ) )
            // InternalOntoL.g:1689:1: ( ( rule__Individual__InstantiatedClassesAssignment_2_1 ) )
            {
            // InternalOntoL.g:1689:1: ( ( rule__Individual__InstantiatedClassesAssignment_2_1 ) )
            // InternalOntoL.g:1690:2: ( rule__Individual__InstantiatedClassesAssignment_2_1 )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesAssignment_2_1()); 
            // InternalOntoL.g:1691:2: ( rule__Individual__InstantiatedClassesAssignment_2_1 )
            // InternalOntoL.g:1691:3: rule__Individual__InstantiatedClassesAssignment_2_1
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
    // InternalOntoL.g:1699:1: rule__Individual__Group_2__2 : rule__Individual__Group_2__2__Impl ;
    public final void rule__Individual__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1703:1: ( rule__Individual__Group_2__2__Impl )
            // InternalOntoL.g:1704:2: rule__Individual__Group_2__2__Impl
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
    // InternalOntoL.g:1710:1: rule__Individual__Group_2__2__Impl : ( ( rule__Individual__Group_2_2__0 )* ) ;
    public final void rule__Individual__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1714:1: ( ( ( rule__Individual__Group_2_2__0 )* ) )
            // InternalOntoL.g:1715:1: ( ( rule__Individual__Group_2_2__0 )* )
            {
            // InternalOntoL.g:1715:1: ( ( rule__Individual__Group_2_2__0 )* )
            // InternalOntoL.g:1716:2: ( rule__Individual__Group_2_2__0 )*
            {
             before(grammarAccess.getIndividualAccess().getGroup_2_2()); 
            // InternalOntoL.g:1717:2: ( rule__Individual__Group_2_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOntoL.g:1717:3: rule__Individual__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Individual__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalOntoL.g:1726:1: rule__Individual__Group_2_2__0 : rule__Individual__Group_2_2__0__Impl rule__Individual__Group_2_2__1 ;
    public final void rule__Individual__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1730:1: ( rule__Individual__Group_2_2__0__Impl rule__Individual__Group_2_2__1 )
            // InternalOntoL.g:1731:2: rule__Individual__Group_2_2__0__Impl rule__Individual__Group_2_2__1
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
    // InternalOntoL.g:1738:1: rule__Individual__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Individual__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1742:1: ( ( ',' ) )
            // InternalOntoL.g:1743:1: ( ',' )
            {
            // InternalOntoL.g:1743:1: ( ',' )
            // InternalOntoL.g:1744:2: ','
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
    // InternalOntoL.g:1753:1: rule__Individual__Group_2_2__1 : rule__Individual__Group_2_2__1__Impl ;
    public final void rule__Individual__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1757:1: ( rule__Individual__Group_2_2__1__Impl )
            // InternalOntoL.g:1758:2: rule__Individual__Group_2_2__1__Impl
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
    // InternalOntoL.g:1764:1: rule__Individual__Group_2_2__1__Impl : ( ( rule__Individual__InstantiatedClassesAssignment_2_2_1 ) ) ;
    public final void rule__Individual__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1768:1: ( ( ( rule__Individual__InstantiatedClassesAssignment_2_2_1 ) ) )
            // InternalOntoL.g:1769:1: ( ( rule__Individual__InstantiatedClassesAssignment_2_2_1 ) )
            {
            // InternalOntoL.g:1769:1: ( ( rule__Individual__InstantiatedClassesAssignment_2_2_1 ) )
            // InternalOntoL.g:1770:2: ( rule__Individual__InstantiatedClassesAssignment_2_2_1 )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesAssignment_2_2_1()); 
            // InternalOntoL.g:1771:2: ( rule__Individual__InstantiatedClassesAssignment_2_2_1 )
            // InternalOntoL.g:1771:3: rule__Individual__InstantiatedClassesAssignment_2_2_1
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
    // InternalOntoL.g:1780:1: rule__Individual__Group_3__0 : rule__Individual__Group_3__0__Impl rule__Individual__Group_3__1 ;
    public final void rule__Individual__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1784:1: ( rule__Individual__Group_3__0__Impl rule__Individual__Group_3__1 )
            // InternalOntoL.g:1785:2: rule__Individual__Group_3__0__Impl rule__Individual__Group_3__1
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
    // InternalOntoL.g:1792:1: rule__Individual__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Individual__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1796:1: ( ( '{' ) )
            // InternalOntoL.g:1797:1: ( '{' )
            {
            // InternalOntoL.g:1797:1: ( '{' )
            // InternalOntoL.g:1798:2: '{'
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
    // InternalOntoL.g:1807:1: rule__Individual__Group_3__1 : rule__Individual__Group_3__1__Impl rule__Individual__Group_3__2 ;
    public final void rule__Individual__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1811:1: ( rule__Individual__Group_3__1__Impl rule__Individual__Group_3__2 )
            // InternalOntoL.g:1812:2: rule__Individual__Group_3__1__Impl rule__Individual__Group_3__2
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
    // InternalOntoL.g:1819:1: rule__Individual__Group_3__1__Impl : ( ( rule__Individual__Alternatives_3_1 )* ) ;
    public final void rule__Individual__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1823:1: ( ( ( rule__Individual__Alternatives_3_1 )* ) )
            // InternalOntoL.g:1824:1: ( ( rule__Individual__Alternatives_3_1 )* )
            {
            // InternalOntoL.g:1824:1: ( ( rule__Individual__Alternatives_3_1 )* )
            // InternalOntoL.g:1825:2: ( rule__Individual__Alternatives_3_1 )*
            {
             before(grammarAccess.getIndividualAccess().getAlternatives_3_1()); 
            // InternalOntoL.g:1826:2: ( rule__Individual__Alternatives_3_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==36||LA21_0==42) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOntoL.g:1826:3: rule__Individual__Alternatives_3_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Individual__Alternatives_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalOntoL.g:1834:1: rule__Individual__Group_3__2 : rule__Individual__Group_3__2__Impl ;
    public final void rule__Individual__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1838:1: ( rule__Individual__Group_3__2__Impl )
            // InternalOntoL.g:1839:2: rule__Individual__Group_3__2__Impl
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
    // InternalOntoL.g:1845:1: rule__Individual__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Individual__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1849:1: ( ( '}' ) )
            // InternalOntoL.g:1850:1: ( '}' )
            {
            // InternalOntoL.g:1850:1: ( '}' )
            // InternalOntoL.g:1851:2: '}'
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
    // InternalOntoL.g:1861:1: rule__OntoLClass__Group__0 : rule__OntoLClass__Group__0__Impl rule__OntoLClass__Group__1 ;
    public final void rule__OntoLClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1865:1: ( rule__OntoLClass__Group__0__Impl rule__OntoLClass__Group__1 )
            // InternalOntoL.g:1866:2: rule__OntoLClass__Group__0__Impl rule__OntoLClass__Group__1
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
    // InternalOntoL.g:1873:1: rule__OntoLClass__Group__0__Impl : ( ( rule__OntoLClass__Alternatives_0 ) ) ;
    public final void rule__OntoLClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1877:1: ( ( ( rule__OntoLClass__Alternatives_0 ) ) )
            // InternalOntoL.g:1878:1: ( ( rule__OntoLClass__Alternatives_0 ) )
            {
            // InternalOntoL.g:1878:1: ( ( rule__OntoLClass__Alternatives_0 ) )
            // InternalOntoL.g:1879:2: ( rule__OntoLClass__Alternatives_0 )
            {
             before(grammarAccess.getOntoLClassAccess().getAlternatives_0()); 
            // InternalOntoL.g:1880:2: ( rule__OntoLClass__Alternatives_0 )
            // InternalOntoL.g:1880:3: rule__OntoLClass__Alternatives_0
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
    // InternalOntoL.g:1888:1: rule__OntoLClass__Group__1 : rule__OntoLClass__Group__1__Impl ;
    public final void rule__OntoLClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1892:1: ( rule__OntoLClass__Group__1__Impl )
            // InternalOntoL.g:1893:2: rule__OntoLClass__Group__1__Impl
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
    // InternalOntoL.g:1899:1: rule__OntoLClass__Group__1__Impl : ( ( rule__OntoLClass__Group_1__0 )? ) ;
    public final void rule__OntoLClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1903:1: ( ( ( rule__OntoLClass__Group_1__0 )? ) )
            // InternalOntoL.g:1904:1: ( ( rule__OntoLClass__Group_1__0 )? )
            {
            // InternalOntoL.g:1904:1: ( ( rule__OntoLClass__Group_1__0 )? )
            // InternalOntoL.g:1905:2: ( rule__OntoLClass__Group_1__0 )?
            {
             before(grammarAccess.getOntoLClassAccess().getGroup_1()); 
            // InternalOntoL.g:1906:2: ( rule__OntoLClass__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOntoL.g:1906:3: rule__OntoLClass__Group_1__0
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
    // InternalOntoL.g:1915:1: rule__OntoLClass__Group_1__0 : rule__OntoLClass__Group_1__0__Impl rule__OntoLClass__Group_1__1 ;
    public final void rule__OntoLClass__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1919:1: ( rule__OntoLClass__Group_1__0__Impl rule__OntoLClass__Group_1__1 )
            // InternalOntoL.g:1920:2: rule__OntoLClass__Group_1__0__Impl rule__OntoLClass__Group_1__1
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
    // InternalOntoL.g:1927:1: rule__OntoLClass__Group_1__0__Impl : ( '{' ) ;
    public final void rule__OntoLClass__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1931:1: ( ( '{' ) )
            // InternalOntoL.g:1932:1: ( '{' )
            {
            // InternalOntoL.g:1932:1: ( '{' )
            // InternalOntoL.g:1933:2: '{'
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
    // InternalOntoL.g:1942:1: rule__OntoLClass__Group_1__1 : rule__OntoLClass__Group_1__1__Impl rule__OntoLClass__Group_1__2 ;
    public final void rule__OntoLClass__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1946:1: ( rule__OntoLClass__Group_1__1__Impl rule__OntoLClass__Group_1__2 )
            // InternalOntoL.g:1947:2: rule__OntoLClass__Group_1__1__Impl rule__OntoLClass__Group_1__2
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
    // InternalOntoL.g:1954:1: rule__OntoLClass__Group_1__1__Impl : ( ( rule__OntoLClass__Alternatives_1_1 )* ) ;
    public final void rule__OntoLClass__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1958:1: ( ( ( rule__OntoLClass__Alternatives_1_1 )* ) )
            // InternalOntoL.g:1959:1: ( ( rule__OntoLClass__Alternatives_1_1 )* )
            {
            // InternalOntoL.g:1959:1: ( ( rule__OntoLClass__Alternatives_1_1 )* )
            // InternalOntoL.g:1960:2: ( rule__OntoLClass__Alternatives_1_1 )*
            {
             before(grammarAccess.getOntoLClassAccess().getAlternatives_1_1()); 
            // InternalOntoL.g:1961:2: ( rule__OntoLClass__Alternatives_1_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36||LA23_0==42) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalOntoL.g:1961:3: rule__OntoLClass__Alternatives_1_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__OntoLClass__Alternatives_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalOntoL.g:1969:1: rule__OntoLClass__Group_1__2 : rule__OntoLClass__Group_1__2__Impl ;
    public final void rule__OntoLClass__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1973:1: ( rule__OntoLClass__Group_1__2__Impl )
            // InternalOntoL.g:1974:2: rule__OntoLClass__Group_1__2__Impl
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
    // InternalOntoL.g:1980:1: rule__OntoLClass__Group_1__2__Impl : ( '}' ) ;
    public final void rule__OntoLClass__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1984:1: ( ( '}' ) )
            // InternalOntoL.g:1985:1: ( '}' )
            {
            // InternalOntoL.g:1985:1: ( '}' )
            // InternalOntoL.g:1986:2: '}'
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
    // InternalOntoL.g:1996:1: rule__OrderlessClass__Group__0 : rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1 ;
    public final void rule__OrderlessClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2000:1: ( rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1 )
            // InternalOntoL.g:2001:2: rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1
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
    // InternalOntoL.g:2008:1: rule__OrderlessClass__Group__0__Impl : ( 'orderless' ) ;
    public final void rule__OrderlessClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2012:1: ( ( 'orderless' ) )
            // InternalOntoL.g:2013:1: ( 'orderless' )
            {
            // InternalOntoL.g:2013:1: ( 'orderless' )
            // InternalOntoL.g:2014:2: 'orderless'
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
    // InternalOntoL.g:2023:1: rule__OrderlessClass__Group__1 : rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2 ;
    public final void rule__OrderlessClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2027:1: ( rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2 )
            // InternalOntoL.g:2028:2: rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2
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
    // InternalOntoL.g:2035:1: rule__OrderlessClass__Group__1__Impl : ( 'class' ) ;
    public final void rule__OrderlessClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2039:1: ( ( 'class' ) )
            // InternalOntoL.g:2040:1: ( 'class' )
            {
            // InternalOntoL.g:2040:1: ( 'class' )
            // InternalOntoL.g:2041:2: 'class'
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
    // InternalOntoL.g:2050:1: rule__OrderlessClass__Group__2 : rule__OrderlessClass__Group__2__Impl rule__OrderlessClass__Group__3 ;
    public final void rule__OrderlessClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2054:1: ( rule__OrderlessClass__Group__2__Impl rule__OrderlessClass__Group__3 )
            // InternalOntoL.g:2055:2: rule__OrderlessClass__Group__2__Impl rule__OrderlessClass__Group__3
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
    // InternalOntoL.g:2062:1: rule__OrderlessClass__Group__2__Impl : ( ( rule__OrderlessClass__NameAssignment_2 ) ) ;
    public final void rule__OrderlessClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2066:1: ( ( ( rule__OrderlessClass__NameAssignment_2 ) ) )
            // InternalOntoL.g:2067:1: ( ( rule__OrderlessClass__NameAssignment_2 ) )
            {
            // InternalOntoL.g:2067:1: ( ( rule__OrderlessClass__NameAssignment_2 ) )
            // InternalOntoL.g:2068:2: ( rule__OrderlessClass__NameAssignment_2 )
            {
             before(grammarAccess.getOrderlessClassAccess().getNameAssignment_2()); 
            // InternalOntoL.g:2069:2: ( rule__OrderlessClass__NameAssignment_2 )
            // InternalOntoL.g:2069:3: rule__OrderlessClass__NameAssignment_2
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
    // InternalOntoL.g:2077:1: rule__OrderlessClass__Group__3 : rule__OrderlessClass__Group__3__Impl rule__OrderlessClass__Group__4 ;
    public final void rule__OrderlessClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2081:1: ( rule__OrderlessClass__Group__3__Impl rule__OrderlessClass__Group__4 )
            // InternalOntoL.g:2082:2: rule__OrderlessClass__Group__3__Impl rule__OrderlessClass__Group__4
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
    // InternalOntoL.g:2089:1: rule__OrderlessClass__Group__3__Impl : ( ( rule__OrderlessClass__Group_3__0 )? ) ;
    public final void rule__OrderlessClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2093:1: ( ( ( rule__OrderlessClass__Group_3__0 )? ) )
            // InternalOntoL.g:2094:1: ( ( rule__OrderlessClass__Group_3__0 )? )
            {
            // InternalOntoL.g:2094:1: ( ( rule__OrderlessClass__Group_3__0 )? )
            // InternalOntoL.g:2095:2: ( rule__OrderlessClass__Group_3__0 )?
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_3()); 
            // InternalOntoL.g:2096:2: ( rule__OrderlessClass__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOntoL.g:2096:3: rule__OrderlessClass__Group_3__0
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
    // InternalOntoL.g:2104:1: rule__OrderlessClass__Group__4 : rule__OrderlessClass__Group__4__Impl rule__OrderlessClass__Group__5 ;
    public final void rule__OrderlessClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2108:1: ( rule__OrderlessClass__Group__4__Impl rule__OrderlessClass__Group__5 )
            // InternalOntoL.g:2109:2: rule__OrderlessClass__Group__4__Impl rule__OrderlessClass__Group__5
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
    // InternalOntoL.g:2116:1: rule__OrderlessClass__Group__4__Impl : ( ( rule__OrderlessClass__Group_4__0 )? ) ;
    public final void rule__OrderlessClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2120:1: ( ( ( rule__OrderlessClass__Group_4__0 )? ) )
            // InternalOntoL.g:2121:1: ( ( rule__OrderlessClass__Group_4__0 )? )
            {
            // InternalOntoL.g:2121:1: ( ( rule__OrderlessClass__Group_4__0 )? )
            // InternalOntoL.g:2122:2: ( rule__OrderlessClass__Group_4__0 )?
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_4()); 
            // InternalOntoL.g:2123:2: ( rule__OrderlessClass__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOntoL.g:2123:3: rule__OrderlessClass__Group_4__0
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
    // InternalOntoL.g:2131:1: rule__OrderlessClass__Group__5 : rule__OrderlessClass__Group__5__Impl rule__OrderlessClass__Group__6 ;
    public final void rule__OrderlessClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2135:1: ( rule__OrderlessClass__Group__5__Impl rule__OrderlessClass__Group__6 )
            // InternalOntoL.g:2136:2: rule__OrderlessClass__Group__5__Impl rule__OrderlessClass__Group__6
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
    // InternalOntoL.g:2143:1: rule__OrderlessClass__Group__5__Impl : ( ( rule__OrderlessClass__Group_5__0 )? ) ;
    public final void rule__OrderlessClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2147:1: ( ( ( rule__OrderlessClass__Group_5__0 )? ) )
            // InternalOntoL.g:2148:1: ( ( rule__OrderlessClass__Group_5__0 )? )
            {
            // InternalOntoL.g:2148:1: ( ( rule__OrderlessClass__Group_5__0 )? )
            // InternalOntoL.g:2149:2: ( rule__OrderlessClass__Group_5__0 )?
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_5()); 
            // InternalOntoL.g:2150:2: ( rule__OrderlessClass__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOntoL.g:2150:3: rule__OrderlessClass__Group_5__0
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
    // InternalOntoL.g:2158:1: rule__OrderlessClass__Group__6 : rule__OrderlessClass__Group__6__Impl ;
    public final void rule__OrderlessClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2162:1: ( rule__OrderlessClass__Group__6__Impl )
            // InternalOntoL.g:2163:2: rule__OrderlessClass__Group__6__Impl
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
    // InternalOntoL.g:2169:1: rule__OrderlessClass__Group__6__Impl : ( ( rule__OrderlessClass__Alternatives_6 )? ) ;
    public final void rule__OrderlessClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2173:1: ( ( ( rule__OrderlessClass__Alternatives_6 )? ) )
            // InternalOntoL.g:2174:1: ( ( rule__OrderlessClass__Alternatives_6 )? )
            {
            // InternalOntoL.g:2174:1: ( ( rule__OrderlessClass__Alternatives_6 )? )
            // InternalOntoL.g:2175:2: ( rule__OrderlessClass__Alternatives_6 )?
            {
             before(grammarAccess.getOrderlessClassAccess().getAlternatives_6()); 
            // InternalOntoL.g:2176:2: ( rule__OrderlessClass__Alternatives_6 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=14 && LA27_0<=17)||LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOntoL.g:2176:3: rule__OrderlessClass__Alternatives_6
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
    // InternalOntoL.g:2185:1: rule__OrderlessClass__Group_3__0 : rule__OrderlessClass__Group_3__0__Impl rule__OrderlessClass__Group_3__1 ;
    public final void rule__OrderlessClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2189:1: ( rule__OrderlessClass__Group_3__0__Impl rule__OrderlessClass__Group_3__1 )
            // InternalOntoL.g:2190:2: rule__OrderlessClass__Group_3__0__Impl rule__OrderlessClass__Group_3__1
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
    // InternalOntoL.g:2197:1: rule__OrderlessClass__Group_3__0__Impl : ( ':' ) ;
    public final void rule__OrderlessClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2201:1: ( ( ':' ) )
            // InternalOntoL.g:2202:1: ( ':' )
            {
            // InternalOntoL.g:2202:1: ( ':' )
            // InternalOntoL.g:2203:2: ':'
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
    // InternalOntoL.g:2212:1: rule__OrderlessClass__Group_3__1 : rule__OrderlessClass__Group_3__1__Impl rule__OrderlessClass__Group_3__2 ;
    public final void rule__OrderlessClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2216:1: ( rule__OrderlessClass__Group_3__1__Impl rule__OrderlessClass__Group_3__2 )
            // InternalOntoL.g:2217:2: rule__OrderlessClass__Group_3__1__Impl rule__OrderlessClass__Group_3__2
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
    // InternalOntoL.g:2224:1: rule__OrderlessClass__Group_3__1__Impl : ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 ) ) ;
    public final void rule__OrderlessClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2228:1: ( ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 ) ) )
            // InternalOntoL.g:2229:1: ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 ) )
            {
            // InternalOntoL.g:2229:1: ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 ) )
            // InternalOntoL.g:2230:2: ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesAssignment_3_1()); 
            // InternalOntoL.g:2231:2: ( rule__OrderlessClass__InstantiatedClassesAssignment_3_1 )
            // InternalOntoL.g:2231:3: rule__OrderlessClass__InstantiatedClassesAssignment_3_1
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
    // InternalOntoL.g:2239:1: rule__OrderlessClass__Group_3__2 : rule__OrderlessClass__Group_3__2__Impl ;
    public final void rule__OrderlessClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2243:1: ( rule__OrderlessClass__Group_3__2__Impl )
            // InternalOntoL.g:2244:2: rule__OrderlessClass__Group_3__2__Impl
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
    // InternalOntoL.g:2250:1: rule__OrderlessClass__Group_3__2__Impl : ( ( rule__OrderlessClass__Group_3_2__0 )* ) ;
    public final void rule__OrderlessClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2254:1: ( ( ( rule__OrderlessClass__Group_3_2__0 )* ) )
            // InternalOntoL.g:2255:1: ( ( rule__OrderlessClass__Group_3_2__0 )* )
            {
            // InternalOntoL.g:2255:1: ( ( rule__OrderlessClass__Group_3_2__0 )* )
            // InternalOntoL.g:2256:2: ( rule__OrderlessClass__Group_3_2__0 )*
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_3_2()); 
            // InternalOntoL.g:2257:2: ( rule__OrderlessClass__Group_3_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==28) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalOntoL.g:2257:3: rule__OrderlessClass__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OrderlessClass__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalOntoL.g:2266:1: rule__OrderlessClass__Group_3_2__0 : rule__OrderlessClass__Group_3_2__0__Impl rule__OrderlessClass__Group_3_2__1 ;
    public final void rule__OrderlessClass__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2270:1: ( rule__OrderlessClass__Group_3_2__0__Impl rule__OrderlessClass__Group_3_2__1 )
            // InternalOntoL.g:2271:2: rule__OrderlessClass__Group_3_2__0__Impl rule__OrderlessClass__Group_3_2__1
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
    // InternalOntoL.g:2278:1: rule__OrderlessClass__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__OrderlessClass__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2282:1: ( ( ',' ) )
            // InternalOntoL.g:2283:1: ( ',' )
            {
            // InternalOntoL.g:2283:1: ( ',' )
            // InternalOntoL.g:2284:2: ','
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
    // InternalOntoL.g:2293:1: rule__OrderlessClass__Group_3_2__1 : rule__OrderlessClass__Group_3_2__1__Impl ;
    public final void rule__OrderlessClass__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2297:1: ( rule__OrderlessClass__Group_3_2__1__Impl )
            // InternalOntoL.g:2298:2: rule__OrderlessClass__Group_3_2__1__Impl
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
    // InternalOntoL.g:2304:1: rule__OrderlessClass__Group_3_2__1__Impl : ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 ) ) ;
    public final void rule__OrderlessClass__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2308:1: ( ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 ) ) )
            // InternalOntoL.g:2309:1: ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 ) )
            {
            // InternalOntoL.g:2309:1: ( ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 ) )
            // InternalOntoL.g:2310:2: ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesAssignment_3_2_1()); 
            // InternalOntoL.g:2311:2: ( rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 )
            // InternalOntoL.g:2311:3: rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1
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
    // InternalOntoL.g:2320:1: rule__OrderlessClass__Group_4__0 : rule__OrderlessClass__Group_4__0__Impl rule__OrderlessClass__Group_4__1 ;
    public final void rule__OrderlessClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2324:1: ( rule__OrderlessClass__Group_4__0__Impl rule__OrderlessClass__Group_4__1 )
            // InternalOntoL.g:2325:2: rule__OrderlessClass__Group_4__0__Impl rule__OrderlessClass__Group_4__1
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
    // InternalOntoL.g:2332:1: rule__OrderlessClass__Group_4__0__Impl : ( 'specializes' ) ;
    public final void rule__OrderlessClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2336:1: ( ( 'specializes' ) )
            // InternalOntoL.g:2337:1: ( 'specializes' )
            {
            // InternalOntoL.g:2337:1: ( 'specializes' )
            // InternalOntoL.g:2338:2: 'specializes'
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
    // InternalOntoL.g:2347:1: rule__OrderlessClass__Group_4__1 : rule__OrderlessClass__Group_4__1__Impl rule__OrderlessClass__Group_4__2 ;
    public final void rule__OrderlessClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2351:1: ( rule__OrderlessClass__Group_4__1__Impl rule__OrderlessClass__Group_4__2 )
            // InternalOntoL.g:2352:2: rule__OrderlessClass__Group_4__1__Impl rule__OrderlessClass__Group_4__2
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
    // InternalOntoL.g:2359:1: rule__OrderlessClass__Group_4__1__Impl : ( ( rule__OrderlessClass__SuperClassesAssignment_4_1 ) ) ;
    public final void rule__OrderlessClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2363:1: ( ( ( rule__OrderlessClass__SuperClassesAssignment_4_1 ) ) )
            // InternalOntoL.g:2364:1: ( ( rule__OrderlessClass__SuperClassesAssignment_4_1 ) )
            {
            // InternalOntoL.g:2364:1: ( ( rule__OrderlessClass__SuperClassesAssignment_4_1 ) )
            // InternalOntoL.g:2365:2: ( rule__OrderlessClass__SuperClassesAssignment_4_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getSuperClassesAssignment_4_1()); 
            // InternalOntoL.g:2366:2: ( rule__OrderlessClass__SuperClassesAssignment_4_1 )
            // InternalOntoL.g:2366:3: rule__OrderlessClass__SuperClassesAssignment_4_1
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
    // InternalOntoL.g:2374:1: rule__OrderlessClass__Group_4__2 : rule__OrderlessClass__Group_4__2__Impl ;
    public final void rule__OrderlessClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2378:1: ( rule__OrderlessClass__Group_4__2__Impl )
            // InternalOntoL.g:2379:2: rule__OrderlessClass__Group_4__2__Impl
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
    // InternalOntoL.g:2385:1: rule__OrderlessClass__Group_4__2__Impl : ( ( rule__OrderlessClass__Group_4_2__0 )* ) ;
    public final void rule__OrderlessClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2389:1: ( ( ( rule__OrderlessClass__Group_4_2__0 )* ) )
            // InternalOntoL.g:2390:1: ( ( rule__OrderlessClass__Group_4_2__0 )* )
            {
            // InternalOntoL.g:2390:1: ( ( rule__OrderlessClass__Group_4_2__0 )* )
            // InternalOntoL.g:2391:2: ( rule__OrderlessClass__Group_4_2__0 )*
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_4_2()); 
            // InternalOntoL.g:2392:2: ( rule__OrderlessClass__Group_4_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==28) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalOntoL.g:2392:3: rule__OrderlessClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OrderlessClass__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalOntoL.g:2401:1: rule__OrderlessClass__Group_4_2__0 : rule__OrderlessClass__Group_4_2__0__Impl rule__OrderlessClass__Group_4_2__1 ;
    public final void rule__OrderlessClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2405:1: ( rule__OrderlessClass__Group_4_2__0__Impl rule__OrderlessClass__Group_4_2__1 )
            // InternalOntoL.g:2406:2: rule__OrderlessClass__Group_4_2__0__Impl rule__OrderlessClass__Group_4_2__1
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
    // InternalOntoL.g:2413:1: rule__OrderlessClass__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__OrderlessClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2417:1: ( ( ',' ) )
            // InternalOntoL.g:2418:1: ( ',' )
            {
            // InternalOntoL.g:2418:1: ( ',' )
            // InternalOntoL.g:2419:2: ','
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
    // InternalOntoL.g:2428:1: rule__OrderlessClass__Group_4_2__1 : rule__OrderlessClass__Group_4_2__1__Impl ;
    public final void rule__OrderlessClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2432:1: ( rule__OrderlessClass__Group_4_2__1__Impl )
            // InternalOntoL.g:2433:2: rule__OrderlessClass__Group_4_2__1__Impl
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
    // InternalOntoL.g:2439:1: rule__OrderlessClass__Group_4_2__1__Impl : ( ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 ) ) ;
    public final void rule__OrderlessClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2443:1: ( ( ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 ) ) )
            // InternalOntoL.g:2444:1: ( ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 ) )
            {
            // InternalOntoL.g:2444:1: ( ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 ) )
            // InternalOntoL.g:2445:2: ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getSuperClassesAssignment_4_2_1()); 
            // InternalOntoL.g:2446:2: ( rule__OrderlessClass__SuperClassesAssignment_4_2_1 )
            // InternalOntoL.g:2446:3: rule__OrderlessClass__SuperClassesAssignment_4_2_1
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
    // InternalOntoL.g:2455:1: rule__OrderlessClass__Group_5__0 : rule__OrderlessClass__Group_5__0__Impl rule__OrderlessClass__Group_5__1 ;
    public final void rule__OrderlessClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2459:1: ( rule__OrderlessClass__Group_5__0__Impl rule__OrderlessClass__Group_5__1 )
            // InternalOntoL.g:2460:2: rule__OrderlessClass__Group_5__0__Impl rule__OrderlessClass__Group_5__1
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
    // InternalOntoL.g:2467:1: rule__OrderlessClass__Group_5__0__Impl : ( 'subordinatedto' ) ;
    public final void rule__OrderlessClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2471:1: ( ( 'subordinatedto' ) )
            // InternalOntoL.g:2472:1: ( 'subordinatedto' )
            {
            // InternalOntoL.g:2472:1: ( 'subordinatedto' )
            // InternalOntoL.g:2473:2: 'subordinatedto'
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
    // InternalOntoL.g:2482:1: rule__OrderlessClass__Group_5__1 : rule__OrderlessClass__Group_5__1__Impl rule__OrderlessClass__Group_5__2 ;
    public final void rule__OrderlessClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2486:1: ( rule__OrderlessClass__Group_5__1__Impl rule__OrderlessClass__Group_5__2 )
            // InternalOntoL.g:2487:2: rule__OrderlessClass__Group_5__1__Impl rule__OrderlessClass__Group_5__2
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
    // InternalOntoL.g:2494:1: rule__OrderlessClass__Group_5__1__Impl : ( ( rule__OrderlessClass__SubordinatorsAssignment_5_1 ) ) ;
    public final void rule__OrderlessClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2498:1: ( ( ( rule__OrderlessClass__SubordinatorsAssignment_5_1 ) ) )
            // InternalOntoL.g:2499:1: ( ( rule__OrderlessClass__SubordinatorsAssignment_5_1 ) )
            {
            // InternalOntoL.g:2499:1: ( ( rule__OrderlessClass__SubordinatorsAssignment_5_1 ) )
            // InternalOntoL.g:2500:2: ( rule__OrderlessClass__SubordinatorsAssignment_5_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatorsAssignment_5_1()); 
            // InternalOntoL.g:2501:2: ( rule__OrderlessClass__SubordinatorsAssignment_5_1 )
            // InternalOntoL.g:2501:3: rule__OrderlessClass__SubordinatorsAssignment_5_1
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
    // InternalOntoL.g:2509:1: rule__OrderlessClass__Group_5__2 : rule__OrderlessClass__Group_5__2__Impl ;
    public final void rule__OrderlessClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2513:1: ( rule__OrderlessClass__Group_5__2__Impl )
            // InternalOntoL.g:2514:2: rule__OrderlessClass__Group_5__2__Impl
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
    // InternalOntoL.g:2520:1: rule__OrderlessClass__Group_5__2__Impl : ( ( rule__OrderlessClass__Group_5_2__0 )* ) ;
    public final void rule__OrderlessClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2524:1: ( ( ( rule__OrderlessClass__Group_5_2__0 )* ) )
            // InternalOntoL.g:2525:1: ( ( rule__OrderlessClass__Group_5_2__0 )* )
            {
            // InternalOntoL.g:2525:1: ( ( rule__OrderlessClass__Group_5_2__0 )* )
            // InternalOntoL.g:2526:2: ( rule__OrderlessClass__Group_5_2__0 )*
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup_5_2()); 
            // InternalOntoL.g:2527:2: ( rule__OrderlessClass__Group_5_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==28) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalOntoL.g:2527:3: rule__OrderlessClass__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OrderlessClass__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalOntoL.g:2536:1: rule__OrderlessClass__Group_5_2__0 : rule__OrderlessClass__Group_5_2__0__Impl rule__OrderlessClass__Group_5_2__1 ;
    public final void rule__OrderlessClass__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2540:1: ( rule__OrderlessClass__Group_5_2__0__Impl rule__OrderlessClass__Group_5_2__1 )
            // InternalOntoL.g:2541:2: rule__OrderlessClass__Group_5_2__0__Impl rule__OrderlessClass__Group_5_2__1
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
    // InternalOntoL.g:2548:1: rule__OrderlessClass__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__OrderlessClass__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2552:1: ( ( ',' ) )
            // InternalOntoL.g:2553:1: ( ',' )
            {
            // InternalOntoL.g:2553:1: ( ',' )
            // InternalOntoL.g:2554:2: ','
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
    // InternalOntoL.g:2563:1: rule__OrderlessClass__Group_5_2__1 : rule__OrderlessClass__Group_5_2__1__Impl ;
    public final void rule__OrderlessClass__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2567:1: ( rule__OrderlessClass__Group_5_2__1__Impl )
            // InternalOntoL.g:2568:2: rule__OrderlessClass__Group_5_2__1__Impl
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
    // InternalOntoL.g:2574:1: rule__OrderlessClass__Group_5_2__1__Impl : ( ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 ) ) ;
    public final void rule__OrderlessClass__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2578:1: ( ( ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 ) ) )
            // InternalOntoL.g:2579:1: ( ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 ) )
            {
            // InternalOntoL.g:2579:1: ( ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 ) )
            // InternalOntoL.g:2580:2: ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatorsAssignment_5_2_1()); 
            // InternalOntoL.g:2581:2: ( rule__OrderlessClass__SubordinatorsAssignment_5_2_1 )
            // InternalOntoL.g:2581:3: rule__OrderlessClass__SubordinatorsAssignment_5_2_1
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
    // InternalOntoL.g:2590:1: rule__OrderlessClass__Group_6_0__0 : rule__OrderlessClass__Group_6_0__0__Impl rule__OrderlessClass__Group_6_0__1 ;
    public final void rule__OrderlessClass__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2594:1: ( rule__OrderlessClass__Group_6_0__0__Impl rule__OrderlessClass__Group_6_0__1 )
            // InternalOntoL.g:2595:2: rule__OrderlessClass__Group_6_0__0__Impl rule__OrderlessClass__Group_6_0__1
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
    // InternalOntoL.g:2602:1: rule__OrderlessClass__Group_6_0__0__Impl : ( ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 ) ) ;
    public final void rule__OrderlessClass__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2606:1: ( ( ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 ) ) )
            // InternalOntoL.g:2607:1: ( ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 ) )
            {
            // InternalOntoL.g:2607:1: ( ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 ) )
            // InternalOntoL.g:2608:2: ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 )
            {
             before(grammarAccess.getOrderlessClassAccess().getCategorizationTypeAssignment_6_0_0()); 
            // InternalOntoL.g:2609:2: ( rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 )
            // InternalOntoL.g:2609:3: rule__OrderlessClass__CategorizationTypeAssignment_6_0_0
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
    // InternalOntoL.g:2617:1: rule__OrderlessClass__Group_6_0__1 : rule__OrderlessClass__Group_6_0__1__Impl ;
    public final void rule__OrderlessClass__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2621:1: ( rule__OrderlessClass__Group_6_0__1__Impl )
            // InternalOntoL.g:2622:2: rule__OrderlessClass__Group_6_0__1__Impl
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
    // InternalOntoL.g:2628:1: rule__OrderlessClass__Group_6_0__1__Impl : ( ( rule__OrderlessClass__BasetypeAssignment_6_0_1 ) ) ;
    public final void rule__OrderlessClass__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2632:1: ( ( ( rule__OrderlessClass__BasetypeAssignment_6_0_1 ) ) )
            // InternalOntoL.g:2633:1: ( ( rule__OrderlessClass__BasetypeAssignment_6_0_1 ) )
            {
            // InternalOntoL.g:2633:1: ( ( rule__OrderlessClass__BasetypeAssignment_6_0_1 ) )
            // InternalOntoL.g:2634:2: ( rule__OrderlessClass__BasetypeAssignment_6_0_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getBasetypeAssignment_6_0_1()); 
            // InternalOntoL.g:2635:2: ( rule__OrderlessClass__BasetypeAssignment_6_0_1 )
            // InternalOntoL.g:2635:3: rule__OrderlessClass__BasetypeAssignment_6_0_1
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
    // InternalOntoL.g:2644:1: rule__OrderlessClass__Group_6_1__0 : rule__OrderlessClass__Group_6_1__0__Impl rule__OrderlessClass__Group_6_1__1 ;
    public final void rule__OrderlessClass__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2648:1: ( rule__OrderlessClass__Group_6_1__0__Impl rule__OrderlessClass__Group_6_1__1 )
            // InternalOntoL.g:2649:2: rule__OrderlessClass__Group_6_1__0__Impl rule__OrderlessClass__Group_6_1__1
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
    // InternalOntoL.g:2656:1: rule__OrderlessClass__Group_6_1__0__Impl : ( 'ispowertypeof' ) ;
    public final void rule__OrderlessClass__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2660:1: ( ( 'ispowertypeof' ) )
            // InternalOntoL.g:2661:1: ( 'ispowertypeof' )
            {
            // InternalOntoL.g:2661:1: ( 'ispowertypeof' )
            // InternalOntoL.g:2662:2: 'ispowertypeof'
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
    // InternalOntoL.g:2671:1: rule__OrderlessClass__Group_6_1__1 : rule__OrderlessClass__Group_6_1__1__Impl ;
    public final void rule__OrderlessClass__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2675:1: ( rule__OrderlessClass__Group_6_1__1__Impl )
            // InternalOntoL.g:2676:2: rule__OrderlessClass__Group_6_1__1__Impl
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
    // InternalOntoL.g:2682:1: rule__OrderlessClass__Group_6_1__1__Impl : ( ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 ) ) ;
    public final void rule__OrderlessClass__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2686:1: ( ( ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 ) ) )
            // InternalOntoL.g:2687:1: ( ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 ) )
            {
            // InternalOntoL.g:2687:1: ( ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 ) )
            // InternalOntoL.g:2688:2: ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 )
            {
             before(grammarAccess.getOrderlessClassAccess().getPowertypeOfAssignment_6_1_1()); 
            // InternalOntoL.g:2689:2: ( rule__OrderlessClass__PowertypeOfAssignment_6_1_1 )
            // InternalOntoL.g:2689:3: rule__OrderlessClass__PowertypeOfAssignment_6_1_1
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
    // InternalOntoL.g:2698:1: rule__FOClass__Group__0 : rule__FOClass__Group__0__Impl rule__FOClass__Group__1 ;
    public final void rule__FOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2702:1: ( rule__FOClass__Group__0__Impl rule__FOClass__Group__1 )
            // InternalOntoL.g:2703:2: rule__FOClass__Group__0__Impl rule__FOClass__Group__1
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
    // InternalOntoL.g:2710:1: rule__FOClass__Group__0__Impl : ( ( 'first-order' )? ) ;
    public final void rule__FOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2714:1: ( ( ( 'first-order' )? ) )
            // InternalOntoL.g:2715:1: ( ( 'first-order' )? )
            {
            // InternalOntoL.g:2715:1: ( ( 'first-order' )? )
            // InternalOntoL.g:2716:2: ( 'first-order' )?
            {
             before(grammarAccess.getFOClassAccess().getFirstOrderKeyword_0()); 
            // InternalOntoL.g:2717:2: ( 'first-order' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOntoL.g:2717:3: 'first-order'
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
    // InternalOntoL.g:2725:1: rule__FOClass__Group__1 : rule__FOClass__Group__1__Impl rule__FOClass__Group__2 ;
    public final void rule__FOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2729:1: ( rule__FOClass__Group__1__Impl rule__FOClass__Group__2 )
            // InternalOntoL.g:2730:2: rule__FOClass__Group__1__Impl rule__FOClass__Group__2
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
    // InternalOntoL.g:2737:1: rule__FOClass__Group__1__Impl : ( 'class' ) ;
    public final void rule__FOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2741:1: ( ( 'class' ) )
            // InternalOntoL.g:2742:1: ( 'class' )
            {
            // InternalOntoL.g:2742:1: ( 'class' )
            // InternalOntoL.g:2743:2: 'class'
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
    // InternalOntoL.g:2752:1: rule__FOClass__Group__2 : rule__FOClass__Group__2__Impl rule__FOClass__Group__3 ;
    public final void rule__FOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2756:1: ( rule__FOClass__Group__2__Impl rule__FOClass__Group__3 )
            // InternalOntoL.g:2757:2: rule__FOClass__Group__2__Impl rule__FOClass__Group__3
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
    // InternalOntoL.g:2764:1: rule__FOClass__Group__2__Impl : ( ( rule__FOClass__NameAssignment_2 ) ) ;
    public final void rule__FOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2768:1: ( ( ( rule__FOClass__NameAssignment_2 ) ) )
            // InternalOntoL.g:2769:1: ( ( rule__FOClass__NameAssignment_2 ) )
            {
            // InternalOntoL.g:2769:1: ( ( rule__FOClass__NameAssignment_2 ) )
            // InternalOntoL.g:2770:2: ( rule__FOClass__NameAssignment_2 )
            {
             before(grammarAccess.getFOClassAccess().getNameAssignment_2()); 
            // InternalOntoL.g:2771:2: ( rule__FOClass__NameAssignment_2 )
            // InternalOntoL.g:2771:3: rule__FOClass__NameAssignment_2
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
    // InternalOntoL.g:2779:1: rule__FOClass__Group__3 : rule__FOClass__Group__3__Impl rule__FOClass__Group__4 ;
    public final void rule__FOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2783:1: ( rule__FOClass__Group__3__Impl rule__FOClass__Group__4 )
            // InternalOntoL.g:2784:2: rule__FOClass__Group__3__Impl rule__FOClass__Group__4
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
    // InternalOntoL.g:2791:1: rule__FOClass__Group__3__Impl : ( ( rule__FOClass__Group_3__0 )? ) ;
    public final void rule__FOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2795:1: ( ( ( rule__FOClass__Group_3__0 )? ) )
            // InternalOntoL.g:2796:1: ( ( rule__FOClass__Group_3__0 )? )
            {
            // InternalOntoL.g:2796:1: ( ( rule__FOClass__Group_3__0 )? )
            // InternalOntoL.g:2797:2: ( rule__FOClass__Group_3__0 )?
            {
             before(grammarAccess.getFOClassAccess().getGroup_3()); 
            // InternalOntoL.g:2798:2: ( rule__FOClass__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOntoL.g:2798:3: rule__FOClass__Group_3__0
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
    // InternalOntoL.g:2806:1: rule__FOClass__Group__4 : rule__FOClass__Group__4__Impl ;
    public final void rule__FOClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2810:1: ( rule__FOClass__Group__4__Impl )
            // InternalOntoL.g:2811:2: rule__FOClass__Group__4__Impl
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
    // InternalOntoL.g:2817:1: rule__FOClass__Group__4__Impl : ( ( rule__FOClass__Group_4__0 )? ) ;
    public final void rule__FOClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2821:1: ( ( ( rule__FOClass__Group_4__0 )? ) )
            // InternalOntoL.g:2822:1: ( ( rule__FOClass__Group_4__0 )? )
            {
            // InternalOntoL.g:2822:1: ( ( rule__FOClass__Group_4__0 )? )
            // InternalOntoL.g:2823:2: ( rule__FOClass__Group_4__0 )?
            {
             before(grammarAccess.getFOClassAccess().getGroup_4()); 
            // InternalOntoL.g:2824:2: ( rule__FOClass__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOntoL.g:2824:3: rule__FOClass__Group_4__0
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
    // InternalOntoL.g:2833:1: rule__FOClass__Group_3__0 : rule__FOClass__Group_3__0__Impl rule__FOClass__Group_3__1 ;
    public final void rule__FOClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2837:1: ( rule__FOClass__Group_3__0__Impl rule__FOClass__Group_3__1 )
            // InternalOntoL.g:2838:2: rule__FOClass__Group_3__0__Impl rule__FOClass__Group_3__1
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
    // InternalOntoL.g:2845:1: rule__FOClass__Group_3__0__Impl : ( ':' ) ;
    public final void rule__FOClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2849:1: ( ( ':' ) )
            // InternalOntoL.g:2850:1: ( ':' )
            {
            // InternalOntoL.g:2850:1: ( ':' )
            // InternalOntoL.g:2851:2: ':'
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
    // InternalOntoL.g:2860:1: rule__FOClass__Group_3__1 : rule__FOClass__Group_3__1__Impl rule__FOClass__Group_3__2 ;
    public final void rule__FOClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2864:1: ( rule__FOClass__Group_3__1__Impl rule__FOClass__Group_3__2 )
            // InternalOntoL.g:2865:2: rule__FOClass__Group_3__1__Impl rule__FOClass__Group_3__2
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
    // InternalOntoL.g:2872:1: rule__FOClass__Group_3__1__Impl : ( ( rule__FOClass__InstantiatedClassesAssignment_3_1 ) ) ;
    public final void rule__FOClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2876:1: ( ( ( rule__FOClass__InstantiatedClassesAssignment_3_1 ) ) )
            // InternalOntoL.g:2877:1: ( ( rule__FOClass__InstantiatedClassesAssignment_3_1 ) )
            {
            // InternalOntoL.g:2877:1: ( ( rule__FOClass__InstantiatedClassesAssignment_3_1 ) )
            // InternalOntoL.g:2878:2: ( rule__FOClass__InstantiatedClassesAssignment_3_1 )
            {
             before(grammarAccess.getFOClassAccess().getInstantiatedClassesAssignment_3_1()); 
            // InternalOntoL.g:2879:2: ( rule__FOClass__InstantiatedClassesAssignment_3_1 )
            // InternalOntoL.g:2879:3: rule__FOClass__InstantiatedClassesAssignment_3_1
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
    // InternalOntoL.g:2887:1: rule__FOClass__Group_3__2 : rule__FOClass__Group_3__2__Impl ;
    public final void rule__FOClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2891:1: ( rule__FOClass__Group_3__2__Impl )
            // InternalOntoL.g:2892:2: rule__FOClass__Group_3__2__Impl
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
    // InternalOntoL.g:2898:1: rule__FOClass__Group_3__2__Impl : ( ( rule__FOClass__Group_3_2__0 )* ) ;
    public final void rule__FOClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2902:1: ( ( ( rule__FOClass__Group_3_2__0 )* ) )
            // InternalOntoL.g:2903:1: ( ( rule__FOClass__Group_3_2__0 )* )
            {
            // InternalOntoL.g:2903:1: ( ( rule__FOClass__Group_3_2__0 )* )
            // InternalOntoL.g:2904:2: ( rule__FOClass__Group_3_2__0 )*
            {
             before(grammarAccess.getFOClassAccess().getGroup_3_2()); 
            // InternalOntoL.g:2905:2: ( rule__FOClass__Group_3_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==28) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalOntoL.g:2905:3: rule__FOClass__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__FOClass__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalOntoL.g:2914:1: rule__FOClass__Group_3_2__0 : rule__FOClass__Group_3_2__0__Impl rule__FOClass__Group_3_2__1 ;
    public final void rule__FOClass__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2918:1: ( rule__FOClass__Group_3_2__0__Impl rule__FOClass__Group_3_2__1 )
            // InternalOntoL.g:2919:2: rule__FOClass__Group_3_2__0__Impl rule__FOClass__Group_3_2__1
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
    // InternalOntoL.g:2926:1: rule__FOClass__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__FOClass__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2930:1: ( ( ',' ) )
            // InternalOntoL.g:2931:1: ( ',' )
            {
            // InternalOntoL.g:2931:1: ( ',' )
            // InternalOntoL.g:2932:2: ','
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
    // InternalOntoL.g:2941:1: rule__FOClass__Group_3_2__1 : rule__FOClass__Group_3_2__1__Impl ;
    public final void rule__FOClass__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2945:1: ( rule__FOClass__Group_3_2__1__Impl )
            // InternalOntoL.g:2946:2: rule__FOClass__Group_3_2__1__Impl
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
    // InternalOntoL.g:2952:1: rule__FOClass__Group_3_2__1__Impl : ( ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 ) ) ;
    public final void rule__FOClass__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2956:1: ( ( ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 ) ) )
            // InternalOntoL.g:2957:1: ( ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 ) )
            {
            // InternalOntoL.g:2957:1: ( ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 ) )
            // InternalOntoL.g:2958:2: ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 )
            {
             before(grammarAccess.getFOClassAccess().getInstantiatedClassesAssignment_3_2_1()); 
            // InternalOntoL.g:2959:2: ( rule__FOClass__InstantiatedClassesAssignment_3_2_1 )
            // InternalOntoL.g:2959:3: rule__FOClass__InstantiatedClassesAssignment_3_2_1
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
    // InternalOntoL.g:2968:1: rule__FOClass__Group_4__0 : rule__FOClass__Group_4__0__Impl rule__FOClass__Group_4__1 ;
    public final void rule__FOClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2972:1: ( rule__FOClass__Group_4__0__Impl rule__FOClass__Group_4__1 )
            // InternalOntoL.g:2973:2: rule__FOClass__Group_4__0__Impl rule__FOClass__Group_4__1
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
    // InternalOntoL.g:2980:1: rule__FOClass__Group_4__0__Impl : ( 'specializes' ) ;
    public final void rule__FOClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2984:1: ( ( 'specializes' ) )
            // InternalOntoL.g:2985:1: ( 'specializes' )
            {
            // InternalOntoL.g:2985:1: ( 'specializes' )
            // InternalOntoL.g:2986:2: 'specializes'
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
    // InternalOntoL.g:2995:1: rule__FOClass__Group_4__1 : rule__FOClass__Group_4__1__Impl rule__FOClass__Group_4__2 ;
    public final void rule__FOClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2999:1: ( rule__FOClass__Group_4__1__Impl rule__FOClass__Group_4__2 )
            // InternalOntoL.g:3000:2: rule__FOClass__Group_4__1__Impl rule__FOClass__Group_4__2
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
    // InternalOntoL.g:3007:1: rule__FOClass__Group_4__1__Impl : ( ( rule__FOClass__SuperClassesAssignment_4_1 ) ) ;
    public final void rule__FOClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3011:1: ( ( ( rule__FOClass__SuperClassesAssignment_4_1 ) ) )
            // InternalOntoL.g:3012:1: ( ( rule__FOClass__SuperClassesAssignment_4_1 ) )
            {
            // InternalOntoL.g:3012:1: ( ( rule__FOClass__SuperClassesAssignment_4_1 ) )
            // InternalOntoL.g:3013:2: ( rule__FOClass__SuperClassesAssignment_4_1 )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesAssignment_4_1()); 
            // InternalOntoL.g:3014:2: ( rule__FOClass__SuperClassesAssignment_4_1 )
            // InternalOntoL.g:3014:3: rule__FOClass__SuperClassesAssignment_4_1
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
    // InternalOntoL.g:3022:1: rule__FOClass__Group_4__2 : rule__FOClass__Group_4__2__Impl ;
    public final void rule__FOClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3026:1: ( rule__FOClass__Group_4__2__Impl )
            // InternalOntoL.g:3027:2: rule__FOClass__Group_4__2__Impl
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
    // InternalOntoL.g:3033:1: rule__FOClass__Group_4__2__Impl : ( ( rule__FOClass__Group_4_2__0 )* ) ;
    public final void rule__FOClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3037:1: ( ( ( rule__FOClass__Group_4_2__0 )* ) )
            // InternalOntoL.g:3038:1: ( ( rule__FOClass__Group_4_2__0 )* )
            {
            // InternalOntoL.g:3038:1: ( ( rule__FOClass__Group_4_2__0 )* )
            // InternalOntoL.g:3039:2: ( rule__FOClass__Group_4_2__0 )*
            {
             before(grammarAccess.getFOClassAccess().getGroup_4_2()); 
            // InternalOntoL.g:3040:2: ( rule__FOClass__Group_4_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==28) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalOntoL.g:3040:3: rule__FOClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__FOClass__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalOntoL.g:3049:1: rule__FOClass__Group_4_2__0 : rule__FOClass__Group_4_2__0__Impl rule__FOClass__Group_4_2__1 ;
    public final void rule__FOClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3053:1: ( rule__FOClass__Group_4_2__0__Impl rule__FOClass__Group_4_2__1 )
            // InternalOntoL.g:3054:2: rule__FOClass__Group_4_2__0__Impl rule__FOClass__Group_4_2__1
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
    // InternalOntoL.g:3061:1: rule__FOClass__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__FOClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3065:1: ( ( ',' ) )
            // InternalOntoL.g:3066:1: ( ',' )
            {
            // InternalOntoL.g:3066:1: ( ',' )
            // InternalOntoL.g:3067:2: ','
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
    // InternalOntoL.g:3076:1: rule__FOClass__Group_4_2__1 : rule__FOClass__Group_4_2__1__Impl ;
    public final void rule__FOClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3080:1: ( rule__FOClass__Group_4_2__1__Impl )
            // InternalOntoL.g:3081:2: rule__FOClass__Group_4_2__1__Impl
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
    // InternalOntoL.g:3087:1: rule__FOClass__Group_4_2__1__Impl : ( ( rule__FOClass__SuperClassesAssignment_4_2_1 ) ) ;
    public final void rule__FOClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3091:1: ( ( ( rule__FOClass__SuperClassesAssignment_4_2_1 ) ) )
            // InternalOntoL.g:3092:1: ( ( rule__FOClass__SuperClassesAssignment_4_2_1 ) )
            {
            // InternalOntoL.g:3092:1: ( ( rule__FOClass__SuperClassesAssignment_4_2_1 ) )
            // InternalOntoL.g:3093:2: ( rule__FOClass__SuperClassesAssignment_4_2_1 )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesAssignment_4_2_1()); 
            // InternalOntoL.g:3094:2: ( rule__FOClass__SuperClassesAssignment_4_2_1 )
            // InternalOntoL.g:3094:3: rule__FOClass__SuperClassesAssignment_4_2_1
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
    // InternalOntoL.g:3103:1: rule__HOClass__Group__0 : rule__HOClass__Group__0__Impl rule__HOClass__Group__1 ;
    public final void rule__HOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3107:1: ( rule__HOClass__Group__0__Impl rule__HOClass__Group__1 )
            // InternalOntoL.g:3108:2: rule__HOClass__Group__0__Impl rule__HOClass__Group__1
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
    // InternalOntoL.g:3115:1: rule__HOClass__Group__0__Impl : ( 'order' ) ;
    public final void rule__HOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3119:1: ( ( 'order' ) )
            // InternalOntoL.g:3120:1: ( 'order' )
            {
            // InternalOntoL.g:3120:1: ( 'order' )
            // InternalOntoL.g:3121:2: 'order'
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
    // InternalOntoL.g:3130:1: rule__HOClass__Group__1 : rule__HOClass__Group__1__Impl rule__HOClass__Group__2 ;
    public final void rule__HOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3134:1: ( rule__HOClass__Group__1__Impl rule__HOClass__Group__2 )
            // InternalOntoL.g:3135:2: rule__HOClass__Group__1__Impl rule__HOClass__Group__2
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
    // InternalOntoL.g:3142:1: rule__HOClass__Group__1__Impl : ( ( rule__HOClass__OrderAssignment_1 ) ) ;
    public final void rule__HOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3146:1: ( ( ( rule__HOClass__OrderAssignment_1 ) ) )
            // InternalOntoL.g:3147:1: ( ( rule__HOClass__OrderAssignment_1 ) )
            {
            // InternalOntoL.g:3147:1: ( ( rule__HOClass__OrderAssignment_1 ) )
            // InternalOntoL.g:3148:2: ( rule__HOClass__OrderAssignment_1 )
            {
             before(grammarAccess.getHOClassAccess().getOrderAssignment_1()); 
            // InternalOntoL.g:3149:2: ( rule__HOClass__OrderAssignment_1 )
            // InternalOntoL.g:3149:3: rule__HOClass__OrderAssignment_1
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
    // InternalOntoL.g:3157:1: rule__HOClass__Group__2 : rule__HOClass__Group__2__Impl rule__HOClass__Group__3 ;
    public final void rule__HOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3161:1: ( rule__HOClass__Group__2__Impl rule__HOClass__Group__3 )
            // InternalOntoL.g:3162:2: rule__HOClass__Group__2__Impl rule__HOClass__Group__3
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
    // InternalOntoL.g:3169:1: rule__HOClass__Group__2__Impl : ( 'class' ) ;
    public final void rule__HOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3173:1: ( ( 'class' ) )
            // InternalOntoL.g:3174:1: ( 'class' )
            {
            // InternalOntoL.g:3174:1: ( 'class' )
            // InternalOntoL.g:3175:2: 'class'
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
    // InternalOntoL.g:3184:1: rule__HOClass__Group__3 : rule__HOClass__Group__3__Impl rule__HOClass__Group__4 ;
    public final void rule__HOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3188:1: ( rule__HOClass__Group__3__Impl rule__HOClass__Group__4 )
            // InternalOntoL.g:3189:2: rule__HOClass__Group__3__Impl rule__HOClass__Group__4
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
    // InternalOntoL.g:3196:1: rule__HOClass__Group__3__Impl : ( ( rule__HOClass__NameAssignment_3 ) ) ;
    public final void rule__HOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3200:1: ( ( ( rule__HOClass__NameAssignment_3 ) ) )
            // InternalOntoL.g:3201:1: ( ( rule__HOClass__NameAssignment_3 ) )
            {
            // InternalOntoL.g:3201:1: ( ( rule__HOClass__NameAssignment_3 ) )
            // InternalOntoL.g:3202:2: ( rule__HOClass__NameAssignment_3 )
            {
             before(grammarAccess.getHOClassAccess().getNameAssignment_3()); 
            // InternalOntoL.g:3203:2: ( rule__HOClass__NameAssignment_3 )
            // InternalOntoL.g:3203:3: rule__HOClass__NameAssignment_3
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
    // InternalOntoL.g:3211:1: rule__HOClass__Group__4 : rule__HOClass__Group__4__Impl rule__HOClass__Group__5 ;
    public final void rule__HOClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3215:1: ( rule__HOClass__Group__4__Impl rule__HOClass__Group__5 )
            // InternalOntoL.g:3216:2: rule__HOClass__Group__4__Impl rule__HOClass__Group__5
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
    // InternalOntoL.g:3223:1: rule__HOClass__Group__4__Impl : ( ( rule__HOClass__Group_4__0 )? ) ;
    public final void rule__HOClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3227:1: ( ( ( rule__HOClass__Group_4__0 )? ) )
            // InternalOntoL.g:3228:1: ( ( rule__HOClass__Group_4__0 )? )
            {
            // InternalOntoL.g:3228:1: ( ( rule__HOClass__Group_4__0 )? )
            // InternalOntoL.g:3229:2: ( rule__HOClass__Group_4__0 )?
            {
             before(grammarAccess.getHOClassAccess().getGroup_4()); 
            // InternalOntoL.g:3230:2: ( rule__HOClass__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOntoL.g:3230:3: rule__HOClass__Group_4__0
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
    // InternalOntoL.g:3238:1: rule__HOClass__Group__5 : rule__HOClass__Group__5__Impl rule__HOClass__Group__6 ;
    public final void rule__HOClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3242:1: ( rule__HOClass__Group__5__Impl rule__HOClass__Group__6 )
            // InternalOntoL.g:3243:2: rule__HOClass__Group__5__Impl rule__HOClass__Group__6
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
    // InternalOntoL.g:3250:1: rule__HOClass__Group__5__Impl : ( ( rule__HOClass__Group_5__0 )? ) ;
    public final void rule__HOClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3254:1: ( ( ( rule__HOClass__Group_5__0 )? ) )
            // InternalOntoL.g:3255:1: ( ( rule__HOClass__Group_5__0 )? )
            {
            // InternalOntoL.g:3255:1: ( ( rule__HOClass__Group_5__0 )? )
            // InternalOntoL.g:3256:2: ( rule__HOClass__Group_5__0 )?
            {
             before(grammarAccess.getHOClassAccess().getGroup_5()); 
            // InternalOntoL.g:3257:2: ( rule__HOClass__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOntoL.g:3257:3: rule__HOClass__Group_5__0
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
    // InternalOntoL.g:3265:1: rule__HOClass__Group__6 : rule__HOClass__Group__6__Impl rule__HOClass__Group__7 ;
    public final void rule__HOClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3269:1: ( rule__HOClass__Group__6__Impl rule__HOClass__Group__7 )
            // InternalOntoL.g:3270:2: rule__HOClass__Group__6__Impl rule__HOClass__Group__7
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
    // InternalOntoL.g:3277:1: rule__HOClass__Group__6__Impl : ( ( rule__HOClass__Group_6__0 )? ) ;
    public final void rule__HOClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3281:1: ( ( ( rule__HOClass__Group_6__0 )? ) )
            // InternalOntoL.g:3282:1: ( ( rule__HOClass__Group_6__0 )? )
            {
            // InternalOntoL.g:3282:1: ( ( rule__HOClass__Group_6__0 )? )
            // InternalOntoL.g:3283:2: ( rule__HOClass__Group_6__0 )?
            {
             before(grammarAccess.getHOClassAccess().getGroup_6()); 
            // InternalOntoL.g:3284:2: ( rule__HOClass__Group_6__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOntoL.g:3284:3: rule__HOClass__Group_6__0
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
    // InternalOntoL.g:3292:1: rule__HOClass__Group__7 : rule__HOClass__Group__7__Impl ;
    public final void rule__HOClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3296:1: ( rule__HOClass__Group__7__Impl )
            // InternalOntoL.g:3297:2: rule__HOClass__Group__7__Impl
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
    // InternalOntoL.g:3303:1: rule__HOClass__Group__7__Impl : ( ( rule__HOClass__Alternatives_7 )? ) ;
    public final void rule__HOClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3307:1: ( ( ( rule__HOClass__Alternatives_7 )? ) )
            // InternalOntoL.g:3308:1: ( ( rule__HOClass__Alternatives_7 )? )
            {
            // InternalOntoL.g:3308:1: ( ( rule__HOClass__Alternatives_7 )? )
            // InternalOntoL.g:3309:2: ( rule__HOClass__Alternatives_7 )?
            {
             before(grammarAccess.getHOClassAccess().getAlternatives_7()); 
            // InternalOntoL.g:3310:2: ( rule__HOClass__Alternatives_7 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=14 && LA39_0<=17)||LA39_0==33) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOntoL.g:3310:3: rule__HOClass__Alternatives_7
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
    // InternalOntoL.g:3319:1: rule__HOClass__Group_4__0 : rule__HOClass__Group_4__0__Impl rule__HOClass__Group_4__1 ;
    public final void rule__HOClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3323:1: ( rule__HOClass__Group_4__0__Impl rule__HOClass__Group_4__1 )
            // InternalOntoL.g:3324:2: rule__HOClass__Group_4__0__Impl rule__HOClass__Group_4__1
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
    // InternalOntoL.g:3331:1: rule__HOClass__Group_4__0__Impl : ( ':' ) ;
    public final void rule__HOClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3335:1: ( ( ':' ) )
            // InternalOntoL.g:3336:1: ( ':' )
            {
            // InternalOntoL.g:3336:1: ( ':' )
            // InternalOntoL.g:3337:2: ':'
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
    // InternalOntoL.g:3346:1: rule__HOClass__Group_4__1 : rule__HOClass__Group_4__1__Impl rule__HOClass__Group_4__2 ;
    public final void rule__HOClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3350:1: ( rule__HOClass__Group_4__1__Impl rule__HOClass__Group_4__2 )
            // InternalOntoL.g:3351:2: rule__HOClass__Group_4__1__Impl rule__HOClass__Group_4__2
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
    // InternalOntoL.g:3358:1: rule__HOClass__Group_4__1__Impl : ( ( rule__HOClass__InstantiatedClassesAssignment_4_1 ) ) ;
    public final void rule__HOClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3362:1: ( ( ( rule__HOClass__InstantiatedClassesAssignment_4_1 ) ) )
            // InternalOntoL.g:3363:1: ( ( rule__HOClass__InstantiatedClassesAssignment_4_1 ) )
            {
            // InternalOntoL.g:3363:1: ( ( rule__HOClass__InstantiatedClassesAssignment_4_1 ) )
            // InternalOntoL.g:3364:2: ( rule__HOClass__InstantiatedClassesAssignment_4_1 )
            {
             before(grammarAccess.getHOClassAccess().getInstantiatedClassesAssignment_4_1()); 
            // InternalOntoL.g:3365:2: ( rule__HOClass__InstantiatedClassesAssignment_4_1 )
            // InternalOntoL.g:3365:3: rule__HOClass__InstantiatedClassesAssignment_4_1
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
    // InternalOntoL.g:3373:1: rule__HOClass__Group_4__2 : rule__HOClass__Group_4__2__Impl ;
    public final void rule__HOClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3377:1: ( rule__HOClass__Group_4__2__Impl )
            // InternalOntoL.g:3378:2: rule__HOClass__Group_4__2__Impl
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
    // InternalOntoL.g:3384:1: rule__HOClass__Group_4__2__Impl : ( ( rule__HOClass__Group_4_2__0 )* ) ;
    public final void rule__HOClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3388:1: ( ( ( rule__HOClass__Group_4_2__0 )* ) )
            // InternalOntoL.g:3389:1: ( ( rule__HOClass__Group_4_2__0 )* )
            {
            // InternalOntoL.g:3389:1: ( ( rule__HOClass__Group_4_2__0 )* )
            // InternalOntoL.g:3390:2: ( rule__HOClass__Group_4_2__0 )*
            {
             before(grammarAccess.getHOClassAccess().getGroup_4_2()); 
            // InternalOntoL.g:3391:2: ( rule__HOClass__Group_4_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==28) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalOntoL.g:3391:3: rule__HOClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__HOClass__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalOntoL.g:3400:1: rule__HOClass__Group_4_2__0 : rule__HOClass__Group_4_2__0__Impl rule__HOClass__Group_4_2__1 ;
    public final void rule__HOClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3404:1: ( rule__HOClass__Group_4_2__0__Impl rule__HOClass__Group_4_2__1 )
            // InternalOntoL.g:3405:2: rule__HOClass__Group_4_2__0__Impl rule__HOClass__Group_4_2__1
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
    // InternalOntoL.g:3412:1: rule__HOClass__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__HOClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3416:1: ( ( ',' ) )
            // InternalOntoL.g:3417:1: ( ',' )
            {
            // InternalOntoL.g:3417:1: ( ',' )
            // InternalOntoL.g:3418:2: ','
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
    // InternalOntoL.g:3427:1: rule__HOClass__Group_4_2__1 : rule__HOClass__Group_4_2__1__Impl ;
    public final void rule__HOClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3431:1: ( rule__HOClass__Group_4_2__1__Impl )
            // InternalOntoL.g:3432:2: rule__HOClass__Group_4_2__1__Impl
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
    // InternalOntoL.g:3438:1: rule__HOClass__Group_4_2__1__Impl : ( ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 ) ) ;
    public final void rule__HOClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3442:1: ( ( ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 ) ) )
            // InternalOntoL.g:3443:1: ( ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 ) )
            {
            // InternalOntoL.g:3443:1: ( ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 ) )
            // InternalOntoL.g:3444:2: ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 )
            {
             before(grammarAccess.getHOClassAccess().getInstantiatedClassesAssignment_4_2_1()); 
            // InternalOntoL.g:3445:2: ( rule__HOClass__InstantiatedClassesAssignment_4_2_1 )
            // InternalOntoL.g:3445:3: rule__HOClass__InstantiatedClassesAssignment_4_2_1
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
    // InternalOntoL.g:3454:1: rule__HOClass__Group_5__0 : rule__HOClass__Group_5__0__Impl rule__HOClass__Group_5__1 ;
    public final void rule__HOClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3458:1: ( rule__HOClass__Group_5__0__Impl rule__HOClass__Group_5__1 )
            // InternalOntoL.g:3459:2: rule__HOClass__Group_5__0__Impl rule__HOClass__Group_5__1
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
    // InternalOntoL.g:3466:1: rule__HOClass__Group_5__0__Impl : ( 'specializes' ) ;
    public final void rule__HOClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3470:1: ( ( 'specializes' ) )
            // InternalOntoL.g:3471:1: ( 'specializes' )
            {
            // InternalOntoL.g:3471:1: ( 'specializes' )
            // InternalOntoL.g:3472:2: 'specializes'
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
    // InternalOntoL.g:3481:1: rule__HOClass__Group_5__1 : rule__HOClass__Group_5__1__Impl rule__HOClass__Group_5__2 ;
    public final void rule__HOClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3485:1: ( rule__HOClass__Group_5__1__Impl rule__HOClass__Group_5__2 )
            // InternalOntoL.g:3486:2: rule__HOClass__Group_5__1__Impl rule__HOClass__Group_5__2
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
    // InternalOntoL.g:3493:1: rule__HOClass__Group_5__1__Impl : ( ( rule__HOClass__SuperClassesAssignment_5_1 ) ) ;
    public final void rule__HOClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3497:1: ( ( ( rule__HOClass__SuperClassesAssignment_5_1 ) ) )
            // InternalOntoL.g:3498:1: ( ( rule__HOClass__SuperClassesAssignment_5_1 ) )
            {
            // InternalOntoL.g:3498:1: ( ( rule__HOClass__SuperClassesAssignment_5_1 ) )
            // InternalOntoL.g:3499:2: ( rule__HOClass__SuperClassesAssignment_5_1 )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesAssignment_5_1()); 
            // InternalOntoL.g:3500:2: ( rule__HOClass__SuperClassesAssignment_5_1 )
            // InternalOntoL.g:3500:3: rule__HOClass__SuperClassesAssignment_5_1
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
    // InternalOntoL.g:3508:1: rule__HOClass__Group_5__2 : rule__HOClass__Group_5__2__Impl ;
    public final void rule__HOClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3512:1: ( rule__HOClass__Group_5__2__Impl )
            // InternalOntoL.g:3513:2: rule__HOClass__Group_5__2__Impl
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
    // InternalOntoL.g:3519:1: rule__HOClass__Group_5__2__Impl : ( ( rule__HOClass__Group_5_2__0 )* ) ;
    public final void rule__HOClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3523:1: ( ( ( rule__HOClass__Group_5_2__0 )* ) )
            // InternalOntoL.g:3524:1: ( ( rule__HOClass__Group_5_2__0 )* )
            {
            // InternalOntoL.g:3524:1: ( ( rule__HOClass__Group_5_2__0 )* )
            // InternalOntoL.g:3525:2: ( rule__HOClass__Group_5_2__0 )*
            {
             before(grammarAccess.getHOClassAccess().getGroup_5_2()); 
            // InternalOntoL.g:3526:2: ( rule__HOClass__Group_5_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==28) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalOntoL.g:3526:3: rule__HOClass__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__HOClass__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalOntoL.g:3535:1: rule__HOClass__Group_5_2__0 : rule__HOClass__Group_5_2__0__Impl rule__HOClass__Group_5_2__1 ;
    public final void rule__HOClass__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3539:1: ( rule__HOClass__Group_5_2__0__Impl rule__HOClass__Group_5_2__1 )
            // InternalOntoL.g:3540:2: rule__HOClass__Group_5_2__0__Impl rule__HOClass__Group_5_2__1
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
    // InternalOntoL.g:3547:1: rule__HOClass__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__HOClass__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3551:1: ( ( ',' ) )
            // InternalOntoL.g:3552:1: ( ',' )
            {
            // InternalOntoL.g:3552:1: ( ',' )
            // InternalOntoL.g:3553:2: ','
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
    // InternalOntoL.g:3562:1: rule__HOClass__Group_5_2__1 : rule__HOClass__Group_5_2__1__Impl ;
    public final void rule__HOClass__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3566:1: ( rule__HOClass__Group_5_2__1__Impl )
            // InternalOntoL.g:3567:2: rule__HOClass__Group_5_2__1__Impl
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
    // InternalOntoL.g:3573:1: rule__HOClass__Group_5_2__1__Impl : ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) ) ;
    public final void rule__HOClass__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3577:1: ( ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) ) )
            // InternalOntoL.g:3578:1: ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) )
            {
            // InternalOntoL.g:3578:1: ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) )
            // InternalOntoL.g:3579:2: ( rule__HOClass__SuperClassesAssignment_5_2_1 )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesAssignment_5_2_1()); 
            // InternalOntoL.g:3580:2: ( rule__HOClass__SuperClassesAssignment_5_2_1 )
            // InternalOntoL.g:3580:3: rule__HOClass__SuperClassesAssignment_5_2_1
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
    // InternalOntoL.g:3589:1: rule__HOClass__Group_6__0 : rule__HOClass__Group_6__0__Impl rule__HOClass__Group_6__1 ;
    public final void rule__HOClass__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3593:1: ( rule__HOClass__Group_6__0__Impl rule__HOClass__Group_6__1 )
            // InternalOntoL.g:3594:2: rule__HOClass__Group_6__0__Impl rule__HOClass__Group_6__1
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
    // InternalOntoL.g:3601:1: rule__HOClass__Group_6__0__Impl : ( 'subordinatedto' ) ;
    public final void rule__HOClass__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3605:1: ( ( 'subordinatedto' ) )
            // InternalOntoL.g:3606:1: ( 'subordinatedto' )
            {
            // InternalOntoL.g:3606:1: ( 'subordinatedto' )
            // InternalOntoL.g:3607:2: 'subordinatedto'
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
    // InternalOntoL.g:3616:1: rule__HOClass__Group_6__1 : rule__HOClass__Group_6__1__Impl rule__HOClass__Group_6__2 ;
    public final void rule__HOClass__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3620:1: ( rule__HOClass__Group_6__1__Impl rule__HOClass__Group_6__2 )
            // InternalOntoL.g:3621:2: rule__HOClass__Group_6__1__Impl rule__HOClass__Group_6__2
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
    // InternalOntoL.g:3628:1: rule__HOClass__Group_6__1__Impl : ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) ) ;
    public final void rule__HOClass__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3632:1: ( ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) ) )
            // InternalOntoL.g:3633:1: ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) )
            {
            // InternalOntoL.g:3633:1: ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) )
            // InternalOntoL.g:3634:2: ( rule__HOClass__SubordinatorsAssignment_6_1 )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsAssignment_6_1()); 
            // InternalOntoL.g:3635:2: ( rule__HOClass__SubordinatorsAssignment_6_1 )
            // InternalOntoL.g:3635:3: rule__HOClass__SubordinatorsAssignment_6_1
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
    // InternalOntoL.g:3643:1: rule__HOClass__Group_6__2 : rule__HOClass__Group_6__2__Impl ;
    public final void rule__HOClass__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3647:1: ( rule__HOClass__Group_6__2__Impl )
            // InternalOntoL.g:3648:2: rule__HOClass__Group_6__2__Impl
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
    // InternalOntoL.g:3654:1: rule__HOClass__Group_6__2__Impl : ( ( rule__HOClass__Group_6_2__0 )* ) ;
    public final void rule__HOClass__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3658:1: ( ( ( rule__HOClass__Group_6_2__0 )* ) )
            // InternalOntoL.g:3659:1: ( ( rule__HOClass__Group_6_2__0 )* )
            {
            // InternalOntoL.g:3659:1: ( ( rule__HOClass__Group_6_2__0 )* )
            // InternalOntoL.g:3660:2: ( rule__HOClass__Group_6_2__0 )*
            {
             before(grammarAccess.getHOClassAccess().getGroup_6_2()); 
            // InternalOntoL.g:3661:2: ( rule__HOClass__Group_6_2__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==28) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalOntoL.g:3661:3: rule__HOClass__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__HOClass__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalOntoL.g:3670:1: rule__HOClass__Group_6_2__0 : rule__HOClass__Group_6_2__0__Impl rule__HOClass__Group_6_2__1 ;
    public final void rule__HOClass__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3674:1: ( rule__HOClass__Group_6_2__0__Impl rule__HOClass__Group_6_2__1 )
            // InternalOntoL.g:3675:2: rule__HOClass__Group_6_2__0__Impl rule__HOClass__Group_6_2__1
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
    // InternalOntoL.g:3682:1: rule__HOClass__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__HOClass__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3686:1: ( ( ',' ) )
            // InternalOntoL.g:3687:1: ( ',' )
            {
            // InternalOntoL.g:3687:1: ( ',' )
            // InternalOntoL.g:3688:2: ','
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
    // InternalOntoL.g:3697:1: rule__HOClass__Group_6_2__1 : rule__HOClass__Group_6_2__1__Impl ;
    public final void rule__HOClass__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3701:1: ( rule__HOClass__Group_6_2__1__Impl )
            // InternalOntoL.g:3702:2: rule__HOClass__Group_6_2__1__Impl
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
    // InternalOntoL.g:3708:1: rule__HOClass__Group_6_2__1__Impl : ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) ) ;
    public final void rule__HOClass__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3712:1: ( ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) ) )
            // InternalOntoL.g:3713:1: ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) )
            {
            // InternalOntoL.g:3713:1: ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) )
            // InternalOntoL.g:3714:2: ( rule__HOClass__SubordinatorsAssignment_6_2_1 )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsAssignment_6_2_1()); 
            // InternalOntoL.g:3715:2: ( rule__HOClass__SubordinatorsAssignment_6_2_1 )
            // InternalOntoL.g:3715:3: rule__HOClass__SubordinatorsAssignment_6_2_1
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
    // InternalOntoL.g:3724:1: rule__HOClass__Group_7_0__0 : rule__HOClass__Group_7_0__0__Impl rule__HOClass__Group_7_0__1 ;
    public final void rule__HOClass__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3728:1: ( rule__HOClass__Group_7_0__0__Impl rule__HOClass__Group_7_0__1 )
            // InternalOntoL.g:3729:2: rule__HOClass__Group_7_0__0__Impl rule__HOClass__Group_7_0__1
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
    // InternalOntoL.g:3736:1: rule__HOClass__Group_7_0__0__Impl : ( ( rule__HOClass__CategorizationTypeAssignment_7_0_0 ) ) ;
    public final void rule__HOClass__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3740:1: ( ( ( rule__HOClass__CategorizationTypeAssignment_7_0_0 ) ) )
            // InternalOntoL.g:3741:1: ( ( rule__HOClass__CategorizationTypeAssignment_7_0_0 ) )
            {
            // InternalOntoL.g:3741:1: ( ( rule__HOClass__CategorizationTypeAssignment_7_0_0 ) )
            // InternalOntoL.g:3742:2: ( rule__HOClass__CategorizationTypeAssignment_7_0_0 )
            {
             before(grammarAccess.getHOClassAccess().getCategorizationTypeAssignment_7_0_0()); 
            // InternalOntoL.g:3743:2: ( rule__HOClass__CategorizationTypeAssignment_7_0_0 )
            // InternalOntoL.g:3743:3: rule__HOClass__CategorizationTypeAssignment_7_0_0
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
    // InternalOntoL.g:3751:1: rule__HOClass__Group_7_0__1 : rule__HOClass__Group_7_0__1__Impl ;
    public final void rule__HOClass__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3755:1: ( rule__HOClass__Group_7_0__1__Impl )
            // InternalOntoL.g:3756:2: rule__HOClass__Group_7_0__1__Impl
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
    // InternalOntoL.g:3762:1: rule__HOClass__Group_7_0__1__Impl : ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) ) ;
    public final void rule__HOClass__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3766:1: ( ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) ) )
            // InternalOntoL.g:3767:1: ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) )
            {
            // InternalOntoL.g:3767:1: ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) )
            // InternalOntoL.g:3768:2: ( rule__HOClass__BasetypeAssignment_7_0_1 )
            {
             before(grammarAccess.getHOClassAccess().getBasetypeAssignment_7_0_1()); 
            // InternalOntoL.g:3769:2: ( rule__HOClass__BasetypeAssignment_7_0_1 )
            // InternalOntoL.g:3769:3: rule__HOClass__BasetypeAssignment_7_0_1
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
    // InternalOntoL.g:3778:1: rule__HOClass__Group_7_1__0 : rule__HOClass__Group_7_1__0__Impl rule__HOClass__Group_7_1__1 ;
    public final void rule__HOClass__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3782:1: ( rule__HOClass__Group_7_1__0__Impl rule__HOClass__Group_7_1__1 )
            // InternalOntoL.g:3783:2: rule__HOClass__Group_7_1__0__Impl rule__HOClass__Group_7_1__1
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
    // InternalOntoL.g:3790:1: rule__HOClass__Group_7_1__0__Impl : ( 'ispowertypeof' ) ;
    public final void rule__HOClass__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3794:1: ( ( 'ispowertypeof' ) )
            // InternalOntoL.g:3795:1: ( 'ispowertypeof' )
            {
            // InternalOntoL.g:3795:1: ( 'ispowertypeof' )
            // InternalOntoL.g:3796:2: 'ispowertypeof'
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
    // InternalOntoL.g:3805:1: rule__HOClass__Group_7_1__1 : rule__HOClass__Group_7_1__1__Impl ;
    public final void rule__HOClass__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3809:1: ( rule__HOClass__Group_7_1__1__Impl )
            // InternalOntoL.g:3810:2: rule__HOClass__Group_7_1__1__Impl
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
    // InternalOntoL.g:3816:1: rule__HOClass__Group_7_1__1__Impl : ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) ) ;
    public final void rule__HOClass__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3820:1: ( ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) ) )
            // InternalOntoL.g:3821:1: ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) )
            {
            // InternalOntoL.g:3821:1: ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) )
            // InternalOntoL.g:3822:2: ( rule__HOClass__PowertypeOfAssignment_7_1_1 )
            {
             before(grammarAccess.getHOClassAccess().getPowertypeOfAssignment_7_1_1()); 
            // InternalOntoL.g:3823:2: ( rule__HOClass__PowertypeOfAssignment_7_1_1 )
            // InternalOntoL.g:3823:3: rule__HOClass__PowertypeOfAssignment_7_1_1
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
    // InternalOntoL.g:3832:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3836:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalOntoL.g:3837:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalOntoL.g:3844:1: rule__Attribute__Group__0__Impl : ( 'att' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3848:1: ( ( 'att' ) )
            // InternalOntoL.g:3849:1: ( 'att' )
            {
            // InternalOntoL.g:3849:1: ( 'att' )
            // InternalOntoL.g:3850:2: 'att'
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
    // InternalOntoL.g:3859:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3863:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalOntoL.g:3864:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalOntoL.g:3871:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3875:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalOntoL.g:3876:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalOntoL.g:3876:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalOntoL.g:3877:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalOntoL.g:3878:2: ( rule__Attribute__NameAssignment_1 )
            // InternalOntoL.g:3878:3: rule__Attribute__NameAssignment_1
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
    // InternalOntoL.g:3886:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3890:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalOntoL.g:3891:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalOntoL.g:3898:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3902:1: ( ( ':' ) )
            // InternalOntoL.g:3903:1: ( ':' )
            {
            // InternalOntoL.g:3903:1: ( ':' )
            // InternalOntoL.g:3904:2: ':'
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
    // InternalOntoL.g:3913:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3917:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalOntoL.g:3918:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalOntoL.g:3925:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__Group_3__0 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3929:1: ( ( ( rule__Attribute__Group_3__0 )? ) )
            // InternalOntoL.g:3930:1: ( ( rule__Attribute__Group_3__0 )? )
            {
            // InternalOntoL.g:3930:1: ( ( rule__Attribute__Group_3__0 )? )
            // InternalOntoL.g:3931:2: ( rule__Attribute__Group_3__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_3()); 
            // InternalOntoL.g:3932:2: ( rule__Attribute__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalOntoL.g:3932:3: rule__Attribute__Group_3__0
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
    // InternalOntoL.g:3940:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3944:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalOntoL.g:3945:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
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
    // InternalOntoL.g:3952:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__PropertyClassAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3956:1: ( ( ( rule__Attribute__PropertyClassAssignment_4 ) ) )
            // InternalOntoL.g:3957:1: ( ( rule__Attribute__PropertyClassAssignment_4 ) )
            {
            // InternalOntoL.g:3957:1: ( ( rule__Attribute__PropertyClassAssignment_4 ) )
            // InternalOntoL.g:3958:2: ( rule__Attribute__PropertyClassAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getPropertyClassAssignment_4()); 
            // InternalOntoL.g:3959:2: ( rule__Attribute__PropertyClassAssignment_4 )
            // InternalOntoL.g:3959:3: rule__Attribute__PropertyClassAssignment_4
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
    // InternalOntoL.g:3967:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3971:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalOntoL.g:3972:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Attribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__6();

            state._fsp--;


            }

        }
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
    // InternalOntoL.g:3979:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3983:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalOntoL.g:3984:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalOntoL.g:3984:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalOntoL.g:3985:2: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // InternalOntoL.g:3986:2: ( rule__Attribute__Group_5__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==40) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOntoL.g:3986:3: rule__Attribute__Group_5__0
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


    // $ANTLR start "rule__Attribute__Group__6"
    // InternalOntoL.g:3994:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3998:1: ( rule__Attribute__Group__6__Impl )
            // InternalOntoL.g:3999:2: rule__Attribute__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6"


    // $ANTLR start "rule__Attribute__Group__6__Impl"
    // InternalOntoL.g:4005:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__Group_6__0 )? ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4009:1: ( ( ( rule__Attribute__Group_6__0 )? ) )
            // InternalOntoL.g:4010:1: ( ( rule__Attribute__Group_6__0 )? )
            {
            // InternalOntoL.g:4010:1: ( ( rule__Attribute__Group_6__0 )? )
            // InternalOntoL.g:4011:2: ( rule__Attribute__Group_6__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_6()); 
            // InternalOntoL.g:4012:2: ( rule__Attribute__Group_6__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==41) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOntoL.g:4012:3: rule__Attribute__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6__Impl"


    // $ANTLR start "rule__Attribute__Group_3__0"
    // InternalOntoL.g:4021:1: rule__Attribute__Group_3__0 : rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 ;
    public final void rule__Attribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4025:1: ( rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 )
            // InternalOntoL.g:4026:2: rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1
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
    // InternalOntoL.g:4033:1: rule__Attribute__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4037:1: ( ( '[' ) )
            // InternalOntoL.g:4038:1: ( '[' )
            {
            // InternalOntoL.g:4038:1: ( '[' )
            // InternalOntoL.g:4039:2: '['
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
    // InternalOntoL.g:4048:1: rule__Attribute__Group_3__1 : rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2 ;
    public final void rule__Attribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4052:1: ( rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2 )
            // InternalOntoL.g:4053:2: rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2
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
    // InternalOntoL.g:4060:1: rule__Attribute__Group_3__1__Impl : ( ( rule__Attribute__LowerBoundAssignment_3_1 ) ) ;
    public final void rule__Attribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4064:1: ( ( ( rule__Attribute__LowerBoundAssignment_3_1 ) ) )
            // InternalOntoL.g:4065:1: ( ( rule__Attribute__LowerBoundAssignment_3_1 ) )
            {
            // InternalOntoL.g:4065:1: ( ( rule__Attribute__LowerBoundAssignment_3_1 ) )
            // InternalOntoL.g:4066:2: ( rule__Attribute__LowerBoundAssignment_3_1 )
            {
             before(grammarAccess.getAttributeAccess().getLowerBoundAssignment_3_1()); 
            // InternalOntoL.g:4067:2: ( rule__Attribute__LowerBoundAssignment_3_1 )
            // InternalOntoL.g:4067:3: rule__Attribute__LowerBoundAssignment_3_1
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
    // InternalOntoL.g:4075:1: rule__Attribute__Group_3__2 : rule__Attribute__Group_3__2__Impl rule__Attribute__Group_3__3 ;
    public final void rule__Attribute__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4079:1: ( rule__Attribute__Group_3__2__Impl rule__Attribute__Group_3__3 )
            // InternalOntoL.g:4080:2: rule__Attribute__Group_3__2__Impl rule__Attribute__Group_3__3
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
    // InternalOntoL.g:4087:1: rule__Attribute__Group_3__2__Impl : ( '..' ) ;
    public final void rule__Attribute__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4091:1: ( ( '..' ) )
            // InternalOntoL.g:4092:1: ( '..' )
            {
            // InternalOntoL.g:4092:1: ( '..' )
            // InternalOntoL.g:4093:2: '..'
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
    // InternalOntoL.g:4102:1: rule__Attribute__Group_3__3 : rule__Attribute__Group_3__3__Impl rule__Attribute__Group_3__4 ;
    public final void rule__Attribute__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4106:1: ( rule__Attribute__Group_3__3__Impl rule__Attribute__Group_3__4 )
            // InternalOntoL.g:4107:2: rule__Attribute__Group_3__3__Impl rule__Attribute__Group_3__4
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
    // InternalOntoL.g:4114:1: rule__Attribute__Group_3__3__Impl : ( ( rule__Attribute__UpperBoundAssignment_3_3 ) ) ;
    public final void rule__Attribute__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4118:1: ( ( ( rule__Attribute__UpperBoundAssignment_3_3 ) ) )
            // InternalOntoL.g:4119:1: ( ( rule__Attribute__UpperBoundAssignment_3_3 ) )
            {
            // InternalOntoL.g:4119:1: ( ( rule__Attribute__UpperBoundAssignment_3_3 ) )
            // InternalOntoL.g:4120:2: ( rule__Attribute__UpperBoundAssignment_3_3 )
            {
             before(grammarAccess.getAttributeAccess().getUpperBoundAssignment_3_3()); 
            // InternalOntoL.g:4121:2: ( rule__Attribute__UpperBoundAssignment_3_3 )
            // InternalOntoL.g:4121:3: rule__Attribute__UpperBoundAssignment_3_3
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
    // InternalOntoL.g:4129:1: rule__Attribute__Group_3__4 : rule__Attribute__Group_3__4__Impl ;
    public final void rule__Attribute__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4133:1: ( rule__Attribute__Group_3__4__Impl )
            // InternalOntoL.g:4134:2: rule__Attribute__Group_3__4__Impl
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
    // InternalOntoL.g:4140:1: rule__Attribute__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4144:1: ( ( ']' ) )
            // InternalOntoL.g:4145:1: ( ']' )
            {
            // InternalOntoL.g:4145:1: ( ']' )
            // InternalOntoL.g:4146:2: ']'
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
    // InternalOntoL.g:4156:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4160:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalOntoL.g:4161:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
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
    // InternalOntoL.g:4168:1: rule__Attribute__Group_5__0__Impl : ( 'subsets' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4172:1: ( ( 'subsets' ) )
            // InternalOntoL.g:4173:1: ( 'subsets' )
            {
            // InternalOntoL.g:4173:1: ( 'subsets' )
            // InternalOntoL.g:4174:2: 'subsets'
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
    // InternalOntoL.g:4183:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4187:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // InternalOntoL.g:4188:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
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
    // InternalOntoL.g:4195:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__SubsetOfAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4199:1: ( ( ( rule__Attribute__SubsetOfAssignment_5_1 ) ) )
            // InternalOntoL.g:4200:1: ( ( rule__Attribute__SubsetOfAssignment_5_1 ) )
            {
            // InternalOntoL.g:4200:1: ( ( rule__Attribute__SubsetOfAssignment_5_1 ) )
            // InternalOntoL.g:4201:2: ( rule__Attribute__SubsetOfAssignment_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAssignment_5_1()); 
            // InternalOntoL.g:4202:2: ( rule__Attribute__SubsetOfAssignment_5_1 )
            // InternalOntoL.g:4202:3: rule__Attribute__SubsetOfAssignment_5_1
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
    // InternalOntoL.g:4210:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4214:1: ( rule__Attribute__Group_5__2__Impl )
            // InternalOntoL.g:4215:2: rule__Attribute__Group_5__2__Impl
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
    // InternalOntoL.g:4221:1: rule__Attribute__Group_5__2__Impl : ( ( rule__Attribute__Group_5_2__0 )* ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4225:1: ( ( ( rule__Attribute__Group_5_2__0 )* ) )
            // InternalOntoL.g:4226:1: ( ( rule__Attribute__Group_5_2__0 )* )
            {
            // InternalOntoL.g:4226:1: ( ( rule__Attribute__Group_5_2__0 )* )
            // InternalOntoL.g:4227:2: ( rule__Attribute__Group_5_2__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_5_2()); 
            // InternalOntoL.g:4228:2: ( rule__Attribute__Group_5_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==28) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalOntoL.g:4228:3: rule__Attribute__Group_5_2__0
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
    // InternalOntoL.g:4237:1: rule__Attribute__Group_5_2__0 : rule__Attribute__Group_5_2__0__Impl rule__Attribute__Group_5_2__1 ;
    public final void rule__Attribute__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4241:1: ( rule__Attribute__Group_5_2__0__Impl rule__Attribute__Group_5_2__1 )
            // InternalOntoL.g:4242:2: rule__Attribute__Group_5_2__0__Impl rule__Attribute__Group_5_2__1
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
    // InternalOntoL.g:4249:1: rule__Attribute__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4253:1: ( ( ',' ) )
            // InternalOntoL.g:4254:1: ( ',' )
            {
            // InternalOntoL.g:4254:1: ( ',' )
            // InternalOntoL.g:4255:2: ','
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
    // InternalOntoL.g:4264:1: rule__Attribute__Group_5_2__1 : rule__Attribute__Group_5_2__1__Impl ;
    public final void rule__Attribute__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4268:1: ( rule__Attribute__Group_5_2__1__Impl )
            // InternalOntoL.g:4269:2: rule__Attribute__Group_5_2__1__Impl
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
    // InternalOntoL.g:4275:1: rule__Attribute__Group_5_2__1__Impl : ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) ) ;
    public final void rule__Attribute__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4279:1: ( ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) ) )
            // InternalOntoL.g:4280:1: ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) )
            {
            // InternalOntoL.g:4280:1: ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) )
            // InternalOntoL.g:4281:2: ( rule__Attribute__SubsetOfAssignment_5_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAssignment_5_2_1()); 
            // InternalOntoL.g:4282:2: ( rule__Attribute__SubsetOfAssignment_5_2_1 )
            // InternalOntoL.g:4282:3: rule__Attribute__SubsetOfAssignment_5_2_1
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


    // $ANTLR start "rule__Attribute__Group_6__0"
    // InternalOntoL.g:4291:1: rule__Attribute__Group_6__0 : rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1 ;
    public final void rule__Attribute__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4295:1: ( rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1 )
            // InternalOntoL.g:4296:2: rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_6__0"


    // $ANTLR start "rule__Attribute__Group_6__0__Impl"
    // InternalOntoL.g:4303:1: rule__Attribute__Group_6__0__Impl : ( 'isoppositeto' ) ;
    public final void rule__Attribute__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4307:1: ( ( 'isoppositeto' ) )
            // InternalOntoL.g:4308:1: ( 'isoppositeto' )
            {
            // InternalOntoL.g:4308:1: ( 'isoppositeto' )
            // InternalOntoL.g:4309:2: 'isoppositeto'
            {
             before(grammarAccess.getAttributeAccess().getIsoppositetoKeyword_6_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIsoppositetoKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_6__0__Impl"


    // $ANTLR start "rule__Attribute__Group_6__1"
    // InternalOntoL.g:4318:1: rule__Attribute__Group_6__1 : rule__Attribute__Group_6__1__Impl ;
    public final void rule__Attribute__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4322:1: ( rule__Attribute__Group_6__1__Impl )
            // InternalOntoL.g:4323:2: rule__Attribute__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_6__1"


    // $ANTLR start "rule__Attribute__Group_6__1__Impl"
    // InternalOntoL.g:4329:1: rule__Attribute__Group_6__1__Impl : ( ( rule__Attribute__OppositeToAssignment_6_1 ) ) ;
    public final void rule__Attribute__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4333:1: ( ( ( rule__Attribute__OppositeToAssignment_6_1 ) ) )
            // InternalOntoL.g:4334:1: ( ( rule__Attribute__OppositeToAssignment_6_1 ) )
            {
            // InternalOntoL.g:4334:1: ( ( rule__Attribute__OppositeToAssignment_6_1 ) )
            // InternalOntoL.g:4335:2: ( rule__Attribute__OppositeToAssignment_6_1 )
            {
             before(grammarAccess.getAttributeAccess().getOppositeToAssignment_6_1()); 
            // InternalOntoL.g:4336:2: ( rule__Attribute__OppositeToAssignment_6_1 )
            // InternalOntoL.g:4336:3: rule__Attribute__OppositeToAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__OppositeToAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getOppositeToAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_6__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalOntoL.g:4345:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4349:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalOntoL.g:4350:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
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
    // InternalOntoL.g:4357:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4361:1: ( ( 'ref' ) )
            // InternalOntoL.g:4362:1: ( 'ref' )
            {
            // InternalOntoL.g:4362:1: ( 'ref' )
            // InternalOntoL.g:4363:2: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalOntoL.g:4372:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4376:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalOntoL.g:4377:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
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
    // InternalOntoL.g:4384:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4388:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // InternalOntoL.g:4389:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // InternalOntoL.g:4389:1: ( ( rule__Reference__NameAssignment_1 ) )
            // InternalOntoL.g:4390:2: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // InternalOntoL.g:4391:2: ( rule__Reference__NameAssignment_1 )
            // InternalOntoL.g:4391:3: rule__Reference__NameAssignment_1
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
    // InternalOntoL.g:4399:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4403:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalOntoL.g:4404:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
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
    // InternalOntoL.g:4411:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4415:1: ( ( ':' ) )
            // InternalOntoL.g:4416:1: ( ':' )
            {
            // InternalOntoL.g:4416:1: ( ':' )
            // InternalOntoL.g:4417:2: ':'
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
    // InternalOntoL.g:4426:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4430:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // InternalOntoL.g:4431:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
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
    // InternalOntoL.g:4438:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__Group_3__0 )? ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4442:1: ( ( ( rule__Reference__Group_3__0 )? ) )
            // InternalOntoL.g:4443:1: ( ( rule__Reference__Group_3__0 )? )
            {
            // InternalOntoL.g:4443:1: ( ( rule__Reference__Group_3__0 )? )
            // InternalOntoL.g:4444:2: ( rule__Reference__Group_3__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_3()); 
            // InternalOntoL.g:4445:2: ( rule__Reference__Group_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==37) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalOntoL.g:4445:3: rule__Reference__Group_3__0
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
    // InternalOntoL.g:4453:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4457:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // InternalOntoL.g:4458:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalOntoL.g:4465:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__PropertyClassAssignment_4 ) ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4469:1: ( ( ( rule__Reference__PropertyClassAssignment_4 ) ) )
            // InternalOntoL.g:4470:1: ( ( rule__Reference__PropertyClassAssignment_4 ) )
            {
            // InternalOntoL.g:4470:1: ( ( rule__Reference__PropertyClassAssignment_4 ) )
            // InternalOntoL.g:4471:2: ( rule__Reference__PropertyClassAssignment_4 )
            {
             before(grammarAccess.getReferenceAccess().getPropertyClassAssignment_4()); 
            // InternalOntoL.g:4472:2: ( rule__Reference__PropertyClassAssignment_4 )
            // InternalOntoL.g:4472:3: rule__Reference__PropertyClassAssignment_4
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
    // InternalOntoL.g:4480:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl rule__Reference__Group__6 ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4484:1: ( rule__Reference__Group__5__Impl rule__Reference__Group__6 )
            // InternalOntoL.g:4485:2: rule__Reference__Group__5__Impl rule__Reference__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalOntoL.g:4492:1: rule__Reference__Group__5__Impl : ( ( rule__Reference__Group_5__0 )? ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4496:1: ( ( ( rule__Reference__Group_5__0 )? ) )
            // InternalOntoL.g:4497:1: ( ( rule__Reference__Group_5__0 )? )
            {
            // InternalOntoL.g:4497:1: ( ( rule__Reference__Group_5__0 )? )
            // InternalOntoL.g:4498:2: ( rule__Reference__Group_5__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_5()); 
            // InternalOntoL.g:4499:2: ( rule__Reference__Group_5__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==40) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalOntoL.g:4499:3: rule__Reference__Group_5__0
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
    // InternalOntoL.g:4507:1: rule__Reference__Group__6 : rule__Reference__Group__6__Impl ;
    public final void rule__Reference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4511:1: ( rule__Reference__Group__6__Impl )
            // InternalOntoL.g:4512:2: rule__Reference__Group__6__Impl
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
    // InternalOntoL.g:4518:1: rule__Reference__Group__6__Impl : ( ( rule__Reference__Group_6__0 )? ) ;
    public final void rule__Reference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4522:1: ( ( ( rule__Reference__Group_6__0 )? ) )
            // InternalOntoL.g:4523:1: ( ( rule__Reference__Group_6__0 )? )
            {
            // InternalOntoL.g:4523:1: ( ( rule__Reference__Group_6__0 )? )
            // InternalOntoL.g:4524:2: ( rule__Reference__Group_6__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_6()); 
            // InternalOntoL.g:4525:2: ( rule__Reference__Group_6__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==41) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOntoL.g:4525:3: rule__Reference__Group_6__0
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
    // InternalOntoL.g:4534:1: rule__Reference__Group_3__0 : rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1 ;
    public final void rule__Reference__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4538:1: ( rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1 )
            // InternalOntoL.g:4539:2: rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1
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
    // InternalOntoL.g:4546:1: rule__Reference__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Reference__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4550:1: ( ( '[' ) )
            // InternalOntoL.g:4551:1: ( '[' )
            {
            // InternalOntoL.g:4551:1: ( '[' )
            // InternalOntoL.g:4552:2: '['
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
    // InternalOntoL.g:4561:1: rule__Reference__Group_3__1 : rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2 ;
    public final void rule__Reference__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4565:1: ( rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2 )
            // InternalOntoL.g:4566:2: rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2
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
    // InternalOntoL.g:4573:1: rule__Reference__Group_3__1__Impl : ( ( rule__Reference__LowerBoundAssignment_3_1 ) ) ;
    public final void rule__Reference__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4577:1: ( ( ( rule__Reference__LowerBoundAssignment_3_1 ) ) )
            // InternalOntoL.g:4578:1: ( ( rule__Reference__LowerBoundAssignment_3_1 ) )
            {
            // InternalOntoL.g:4578:1: ( ( rule__Reference__LowerBoundAssignment_3_1 ) )
            // InternalOntoL.g:4579:2: ( rule__Reference__LowerBoundAssignment_3_1 )
            {
             before(grammarAccess.getReferenceAccess().getLowerBoundAssignment_3_1()); 
            // InternalOntoL.g:4580:2: ( rule__Reference__LowerBoundAssignment_3_1 )
            // InternalOntoL.g:4580:3: rule__Reference__LowerBoundAssignment_3_1
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
    // InternalOntoL.g:4588:1: rule__Reference__Group_3__2 : rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3 ;
    public final void rule__Reference__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4592:1: ( rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3 )
            // InternalOntoL.g:4593:2: rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3
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
    // InternalOntoL.g:4600:1: rule__Reference__Group_3__2__Impl : ( '..' ) ;
    public final void rule__Reference__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4604:1: ( ( '..' ) )
            // InternalOntoL.g:4605:1: ( '..' )
            {
            // InternalOntoL.g:4605:1: ( '..' )
            // InternalOntoL.g:4606:2: '..'
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
    // InternalOntoL.g:4615:1: rule__Reference__Group_3__3 : rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4 ;
    public final void rule__Reference__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4619:1: ( rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4 )
            // InternalOntoL.g:4620:2: rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4
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
    // InternalOntoL.g:4627:1: rule__Reference__Group_3__3__Impl : ( ( rule__Reference__UpperBoundAssignment_3_3 ) ) ;
    public final void rule__Reference__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4631:1: ( ( ( rule__Reference__UpperBoundAssignment_3_3 ) ) )
            // InternalOntoL.g:4632:1: ( ( rule__Reference__UpperBoundAssignment_3_3 ) )
            {
            // InternalOntoL.g:4632:1: ( ( rule__Reference__UpperBoundAssignment_3_3 ) )
            // InternalOntoL.g:4633:2: ( rule__Reference__UpperBoundAssignment_3_3 )
            {
             before(grammarAccess.getReferenceAccess().getUpperBoundAssignment_3_3()); 
            // InternalOntoL.g:4634:2: ( rule__Reference__UpperBoundAssignment_3_3 )
            // InternalOntoL.g:4634:3: rule__Reference__UpperBoundAssignment_3_3
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
    // InternalOntoL.g:4642:1: rule__Reference__Group_3__4 : rule__Reference__Group_3__4__Impl ;
    public final void rule__Reference__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4646:1: ( rule__Reference__Group_3__4__Impl )
            // InternalOntoL.g:4647:2: rule__Reference__Group_3__4__Impl
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
    // InternalOntoL.g:4653:1: rule__Reference__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Reference__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4657:1: ( ( ']' ) )
            // InternalOntoL.g:4658:1: ( ']' )
            {
            // InternalOntoL.g:4658:1: ( ']' )
            // InternalOntoL.g:4659:2: ']'
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
    // InternalOntoL.g:4669:1: rule__Reference__Group_5__0 : rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 ;
    public final void rule__Reference__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4673:1: ( rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 )
            // InternalOntoL.g:4674:2: rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1
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
    // InternalOntoL.g:4681:1: rule__Reference__Group_5__0__Impl : ( 'subsets' ) ;
    public final void rule__Reference__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4685:1: ( ( 'subsets' ) )
            // InternalOntoL.g:4686:1: ( 'subsets' )
            {
            // InternalOntoL.g:4686:1: ( 'subsets' )
            // InternalOntoL.g:4687:2: 'subsets'
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
    // InternalOntoL.g:4696:1: rule__Reference__Group_5__1 : rule__Reference__Group_5__1__Impl rule__Reference__Group_5__2 ;
    public final void rule__Reference__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4700:1: ( rule__Reference__Group_5__1__Impl rule__Reference__Group_5__2 )
            // InternalOntoL.g:4701:2: rule__Reference__Group_5__1__Impl rule__Reference__Group_5__2
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
    // InternalOntoL.g:4708:1: rule__Reference__Group_5__1__Impl : ( ( rule__Reference__SubsetOfAssignment_5_1 ) ) ;
    public final void rule__Reference__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4712:1: ( ( ( rule__Reference__SubsetOfAssignment_5_1 ) ) )
            // InternalOntoL.g:4713:1: ( ( rule__Reference__SubsetOfAssignment_5_1 ) )
            {
            // InternalOntoL.g:4713:1: ( ( rule__Reference__SubsetOfAssignment_5_1 ) )
            // InternalOntoL.g:4714:2: ( rule__Reference__SubsetOfAssignment_5_1 )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfAssignment_5_1()); 
            // InternalOntoL.g:4715:2: ( rule__Reference__SubsetOfAssignment_5_1 )
            // InternalOntoL.g:4715:3: rule__Reference__SubsetOfAssignment_5_1
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
    // InternalOntoL.g:4723:1: rule__Reference__Group_5__2 : rule__Reference__Group_5__2__Impl ;
    public final void rule__Reference__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4727:1: ( rule__Reference__Group_5__2__Impl )
            // InternalOntoL.g:4728:2: rule__Reference__Group_5__2__Impl
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
    // InternalOntoL.g:4734:1: rule__Reference__Group_5__2__Impl : ( ( rule__Reference__Group_5_2__0 )* ) ;
    public final void rule__Reference__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4738:1: ( ( ( rule__Reference__Group_5_2__0 )* ) )
            // InternalOntoL.g:4739:1: ( ( rule__Reference__Group_5_2__0 )* )
            {
            // InternalOntoL.g:4739:1: ( ( rule__Reference__Group_5_2__0 )* )
            // InternalOntoL.g:4740:2: ( rule__Reference__Group_5_2__0 )*
            {
             before(grammarAccess.getReferenceAccess().getGroup_5_2()); 
            // InternalOntoL.g:4741:2: ( rule__Reference__Group_5_2__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==28) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalOntoL.g:4741:3: rule__Reference__Group_5_2__0
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
    // InternalOntoL.g:4750:1: rule__Reference__Group_5_2__0 : rule__Reference__Group_5_2__0__Impl rule__Reference__Group_5_2__1 ;
    public final void rule__Reference__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4754:1: ( rule__Reference__Group_5_2__0__Impl rule__Reference__Group_5_2__1 )
            // InternalOntoL.g:4755:2: rule__Reference__Group_5_2__0__Impl rule__Reference__Group_5_2__1
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
    // InternalOntoL.g:4762:1: rule__Reference__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Reference__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4766:1: ( ( ',' ) )
            // InternalOntoL.g:4767:1: ( ',' )
            {
            // InternalOntoL.g:4767:1: ( ',' )
            // InternalOntoL.g:4768:2: ','
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
    // InternalOntoL.g:4777:1: rule__Reference__Group_5_2__1 : rule__Reference__Group_5_2__1__Impl ;
    public final void rule__Reference__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4781:1: ( rule__Reference__Group_5_2__1__Impl )
            // InternalOntoL.g:4782:2: rule__Reference__Group_5_2__1__Impl
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
    // InternalOntoL.g:4788:1: rule__Reference__Group_5_2__1__Impl : ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) ) ;
    public final void rule__Reference__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4792:1: ( ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) ) )
            // InternalOntoL.g:4793:1: ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) )
            {
            // InternalOntoL.g:4793:1: ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) )
            // InternalOntoL.g:4794:2: ( rule__Reference__SubsetOfAssignment_5_2_1 )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfAssignment_5_2_1()); 
            // InternalOntoL.g:4795:2: ( rule__Reference__SubsetOfAssignment_5_2_1 )
            // InternalOntoL.g:4795:3: rule__Reference__SubsetOfAssignment_5_2_1
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
    // InternalOntoL.g:4804:1: rule__Reference__Group_6__0 : rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1 ;
    public final void rule__Reference__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4808:1: ( rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1 )
            // InternalOntoL.g:4809:2: rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1
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
    // InternalOntoL.g:4816:1: rule__Reference__Group_6__0__Impl : ( 'isoppositeto' ) ;
    public final void rule__Reference__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4820:1: ( ( 'isoppositeto' ) )
            // InternalOntoL.g:4821:1: ( 'isoppositeto' )
            {
            // InternalOntoL.g:4821:1: ( 'isoppositeto' )
            // InternalOntoL.g:4822:2: 'isoppositeto'
            {
             before(grammarAccess.getReferenceAccess().getIsoppositetoKeyword_6_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalOntoL.g:4831:1: rule__Reference__Group_6__1 : rule__Reference__Group_6__1__Impl ;
    public final void rule__Reference__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4835:1: ( rule__Reference__Group_6__1__Impl )
            // InternalOntoL.g:4836:2: rule__Reference__Group_6__1__Impl
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
    // InternalOntoL.g:4842:1: rule__Reference__Group_6__1__Impl : ( ( rule__Reference__OppositeToAssignment_6_1 ) ) ;
    public final void rule__Reference__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4846:1: ( ( ( rule__Reference__OppositeToAssignment_6_1 ) ) )
            // InternalOntoL.g:4847:1: ( ( rule__Reference__OppositeToAssignment_6_1 ) )
            {
            // InternalOntoL.g:4847:1: ( ( rule__Reference__OppositeToAssignment_6_1 ) )
            // InternalOntoL.g:4848:2: ( rule__Reference__OppositeToAssignment_6_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeToAssignment_6_1()); 
            // InternalOntoL.g:4849:2: ( rule__Reference__OppositeToAssignment_6_1 )
            // InternalOntoL.g:4849:3: rule__Reference__OppositeToAssignment_6_1
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
    // InternalOntoL.g:4858:1: rule__AttributeAssignment__Group__0 : rule__AttributeAssignment__Group__0__Impl rule__AttributeAssignment__Group__1 ;
    public final void rule__AttributeAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4862:1: ( rule__AttributeAssignment__Group__0__Impl rule__AttributeAssignment__Group__1 )
            // InternalOntoL.g:4863:2: rule__AttributeAssignment__Group__0__Impl rule__AttributeAssignment__Group__1
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
    // InternalOntoL.g:4870:1: rule__AttributeAssignment__Group__0__Impl : ( 'att' ) ;
    public final void rule__AttributeAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4874:1: ( ( 'att' ) )
            // InternalOntoL.g:4875:1: ( 'att' )
            {
            // InternalOntoL.g:4875:1: ( 'att' )
            // InternalOntoL.g:4876:2: 'att'
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
    // InternalOntoL.g:4885:1: rule__AttributeAssignment__Group__1 : rule__AttributeAssignment__Group__1__Impl rule__AttributeAssignment__Group__2 ;
    public final void rule__AttributeAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4889:1: ( rule__AttributeAssignment__Group__1__Impl rule__AttributeAssignment__Group__2 )
            // InternalOntoL.g:4890:2: rule__AttributeAssignment__Group__1__Impl rule__AttributeAssignment__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalOntoL.g:4897:1: rule__AttributeAssignment__Group__1__Impl : ( ( rule__AttributeAssignment__AttributeAssignment_1 ) ) ;
    public final void rule__AttributeAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4901:1: ( ( ( rule__AttributeAssignment__AttributeAssignment_1 ) ) )
            // InternalOntoL.g:4902:1: ( ( rule__AttributeAssignment__AttributeAssignment_1 ) )
            {
            // InternalOntoL.g:4902:1: ( ( rule__AttributeAssignment__AttributeAssignment_1 ) )
            // InternalOntoL.g:4903:2: ( rule__AttributeAssignment__AttributeAssignment_1 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAttributeAssignment_1()); 
            // InternalOntoL.g:4904:2: ( rule__AttributeAssignment__AttributeAssignment_1 )
            // InternalOntoL.g:4904:3: rule__AttributeAssignment__AttributeAssignment_1
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
    // InternalOntoL.g:4912:1: rule__AttributeAssignment__Group__2 : rule__AttributeAssignment__Group__2__Impl rule__AttributeAssignment__Group__3 ;
    public final void rule__AttributeAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4916:1: ( rule__AttributeAssignment__Group__2__Impl rule__AttributeAssignment__Group__3 )
            // InternalOntoL.g:4917:2: rule__AttributeAssignment__Group__2__Impl rule__AttributeAssignment__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalOntoL.g:4924:1: rule__AttributeAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__AttributeAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4928:1: ( ( '=' ) )
            // InternalOntoL.g:4929:1: ( '=' )
            {
            // InternalOntoL.g:4929:1: ( '=' )
            // InternalOntoL.g:4930:2: '='
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
    // InternalOntoL.g:4939:1: rule__AttributeAssignment__Group__3 : rule__AttributeAssignment__Group__3__Impl ;
    public final void rule__AttributeAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4943:1: ( rule__AttributeAssignment__Group__3__Impl )
            // InternalOntoL.g:4944:2: rule__AttributeAssignment__Group__3__Impl
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
    // InternalOntoL.g:4950:1: rule__AttributeAssignment__Group__3__Impl : ( ( rule__AttributeAssignment__Alternatives_3 ) ) ;
    public final void rule__AttributeAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4954:1: ( ( ( rule__AttributeAssignment__Alternatives_3 ) ) )
            // InternalOntoL.g:4955:1: ( ( rule__AttributeAssignment__Alternatives_3 ) )
            {
            // InternalOntoL.g:4955:1: ( ( rule__AttributeAssignment__Alternatives_3 ) )
            // InternalOntoL.g:4956:2: ( rule__AttributeAssignment__Alternatives_3 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAlternatives_3()); 
            // InternalOntoL.g:4957:2: ( rule__AttributeAssignment__Alternatives_3 )
            // InternalOntoL.g:4957:3: rule__AttributeAssignment__Alternatives_3
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
    // InternalOntoL.g:4966:1: rule__AttributeAssignment__Group_3_1__0 : rule__AttributeAssignment__Group_3_1__0__Impl rule__AttributeAssignment__Group_3_1__1 ;
    public final void rule__AttributeAssignment__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4970:1: ( rule__AttributeAssignment__Group_3_1__0__Impl rule__AttributeAssignment__Group_3_1__1 )
            // InternalOntoL.g:4971:2: rule__AttributeAssignment__Group_3_1__0__Impl rule__AttributeAssignment__Group_3_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalOntoL.g:4978:1: rule__AttributeAssignment__Group_3_1__0__Impl : ( '{' ) ;
    public final void rule__AttributeAssignment__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4982:1: ( ( '{' ) )
            // InternalOntoL.g:4983:1: ( '{' )
            {
            // InternalOntoL.g:4983:1: ( '{' )
            // InternalOntoL.g:4984:2: '{'
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
    // InternalOntoL.g:4993:1: rule__AttributeAssignment__Group_3_1__1 : rule__AttributeAssignment__Group_3_1__1__Impl rule__AttributeAssignment__Group_3_1__2 ;
    public final void rule__AttributeAssignment__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4997:1: ( rule__AttributeAssignment__Group_3_1__1__Impl rule__AttributeAssignment__Group_3_1__2 )
            // InternalOntoL.g:4998:2: rule__AttributeAssignment__Group_3_1__1__Impl rule__AttributeAssignment__Group_3_1__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalOntoL.g:5005:1: rule__AttributeAssignment__Group_3_1__1__Impl : ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 ) ) ;
    public final void rule__AttributeAssignment__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5009:1: ( ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 ) ) )
            // InternalOntoL.g:5010:1: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 ) )
            {
            // InternalOntoL.g:5010:1: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 ) )
            // InternalOntoL.g:5011:2: ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAssignmentsAssignment_3_1_1()); 
            // InternalOntoL.g:5012:2: ( rule__AttributeAssignment__AssignmentsAssignment_3_1_1 )
            // InternalOntoL.g:5012:3: rule__AttributeAssignment__AssignmentsAssignment_3_1_1
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
    // InternalOntoL.g:5020:1: rule__AttributeAssignment__Group_3_1__2 : rule__AttributeAssignment__Group_3_1__2__Impl rule__AttributeAssignment__Group_3_1__3 ;
    public final void rule__AttributeAssignment__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5024:1: ( rule__AttributeAssignment__Group_3_1__2__Impl rule__AttributeAssignment__Group_3_1__3 )
            // InternalOntoL.g:5025:2: rule__AttributeAssignment__Group_3_1__2__Impl rule__AttributeAssignment__Group_3_1__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalOntoL.g:5032:1: rule__AttributeAssignment__Group_3_1__2__Impl : ( ( rule__AttributeAssignment__Group_3_1_2__0 )* ) ;
    public final void rule__AttributeAssignment__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5036:1: ( ( ( rule__AttributeAssignment__Group_3_1_2__0 )* ) )
            // InternalOntoL.g:5037:1: ( ( rule__AttributeAssignment__Group_3_1_2__0 )* )
            {
            // InternalOntoL.g:5037:1: ( ( rule__AttributeAssignment__Group_3_1_2__0 )* )
            // InternalOntoL.g:5038:2: ( rule__AttributeAssignment__Group_3_1_2__0 )*
            {
             before(grammarAccess.getAttributeAssignmentAccess().getGroup_3_1_2()); 
            // InternalOntoL.g:5039:2: ( rule__AttributeAssignment__Group_3_1_2__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==28) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalOntoL.g:5039:3: rule__AttributeAssignment__Group_3_1_2__0
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
    // InternalOntoL.g:5047:1: rule__AttributeAssignment__Group_3_1__3 : rule__AttributeAssignment__Group_3_1__3__Impl ;
    public final void rule__AttributeAssignment__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5051:1: ( rule__AttributeAssignment__Group_3_1__3__Impl )
            // InternalOntoL.g:5052:2: rule__AttributeAssignment__Group_3_1__3__Impl
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
    // InternalOntoL.g:5058:1: rule__AttributeAssignment__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__AttributeAssignment__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5062:1: ( ( '}' ) )
            // InternalOntoL.g:5063:1: ( '}' )
            {
            // InternalOntoL.g:5063:1: ( '}' )
            // InternalOntoL.g:5064:2: '}'
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
    // InternalOntoL.g:5074:1: rule__AttributeAssignment__Group_3_1_2__0 : rule__AttributeAssignment__Group_3_1_2__0__Impl rule__AttributeAssignment__Group_3_1_2__1 ;
    public final void rule__AttributeAssignment__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5078:1: ( rule__AttributeAssignment__Group_3_1_2__0__Impl rule__AttributeAssignment__Group_3_1_2__1 )
            // InternalOntoL.g:5079:2: rule__AttributeAssignment__Group_3_1_2__0__Impl rule__AttributeAssignment__Group_3_1_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalOntoL.g:5086:1: rule__AttributeAssignment__Group_3_1_2__0__Impl : ( ',' ) ;
    public final void rule__AttributeAssignment__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5090:1: ( ( ',' ) )
            // InternalOntoL.g:5091:1: ( ',' )
            {
            // InternalOntoL.g:5091:1: ( ',' )
            // InternalOntoL.g:5092:2: ','
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
    // InternalOntoL.g:5101:1: rule__AttributeAssignment__Group_3_1_2__1 : rule__AttributeAssignment__Group_3_1_2__1__Impl ;
    public final void rule__AttributeAssignment__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5105:1: ( rule__AttributeAssignment__Group_3_1_2__1__Impl )
            // InternalOntoL.g:5106:2: rule__AttributeAssignment__Group_3_1_2__1__Impl
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
    // InternalOntoL.g:5112:1: rule__AttributeAssignment__Group_3_1_2__1__Impl : ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 ) ) ;
    public final void rule__AttributeAssignment__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5116:1: ( ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 ) ) )
            // InternalOntoL.g:5117:1: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 ) )
            {
            // InternalOntoL.g:5117:1: ( ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 ) )
            // InternalOntoL.g:5118:2: ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAssignmentsAssignment_3_1_2_1()); 
            // InternalOntoL.g:5119:2: ( rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 )
            // InternalOntoL.g:5119:3: rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1
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
    // InternalOntoL.g:5128:1: rule__ReferenceAssignment__Group__0 : rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1 ;
    public final void rule__ReferenceAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5132:1: ( rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1 )
            // InternalOntoL.g:5133:2: rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1
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
    // InternalOntoL.g:5140:1: rule__ReferenceAssignment__Group__0__Impl : ( 'ref' ) ;
    public final void rule__ReferenceAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5144:1: ( ( 'ref' ) )
            // InternalOntoL.g:5145:1: ( 'ref' )
            {
            // InternalOntoL.g:5145:1: ( 'ref' )
            // InternalOntoL.g:5146:2: 'ref'
            {
             before(grammarAccess.getReferenceAssignmentAccess().getRefKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalOntoL.g:5155:1: rule__ReferenceAssignment__Group__1 : rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2 ;
    public final void rule__ReferenceAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5159:1: ( rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2 )
            // InternalOntoL.g:5160:2: rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalOntoL.g:5167:1: rule__ReferenceAssignment__Group__1__Impl : ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) ) ;
    public final void rule__ReferenceAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5171:1: ( ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) ) )
            // InternalOntoL.g:5172:1: ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) )
            {
            // InternalOntoL.g:5172:1: ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) )
            // InternalOntoL.g:5173:2: ( rule__ReferenceAssignment__ReferenceAssignment_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getReferenceAssignment_1()); 
            // InternalOntoL.g:5174:2: ( rule__ReferenceAssignment__ReferenceAssignment_1 )
            // InternalOntoL.g:5174:3: rule__ReferenceAssignment__ReferenceAssignment_1
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
    // InternalOntoL.g:5182:1: rule__ReferenceAssignment__Group__2 : rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3 ;
    public final void rule__ReferenceAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5186:1: ( rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3 )
            // InternalOntoL.g:5187:2: rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalOntoL.g:5194:1: rule__ReferenceAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__ReferenceAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5198:1: ( ( '=' ) )
            // InternalOntoL.g:5199:1: ( '=' )
            {
            // InternalOntoL.g:5199:1: ( '=' )
            // InternalOntoL.g:5200:2: '='
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
    // InternalOntoL.g:5209:1: rule__ReferenceAssignment__Group__3 : rule__ReferenceAssignment__Group__3__Impl ;
    public final void rule__ReferenceAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5213:1: ( rule__ReferenceAssignment__Group__3__Impl )
            // InternalOntoL.g:5214:2: rule__ReferenceAssignment__Group__3__Impl
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
    // InternalOntoL.g:5220:1: rule__ReferenceAssignment__Group__3__Impl : ( ( rule__ReferenceAssignment__Alternatives_3 ) ) ;
    public final void rule__ReferenceAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5224:1: ( ( ( rule__ReferenceAssignment__Alternatives_3 ) ) )
            // InternalOntoL.g:5225:1: ( ( rule__ReferenceAssignment__Alternatives_3 ) )
            {
            // InternalOntoL.g:5225:1: ( ( rule__ReferenceAssignment__Alternatives_3 ) )
            // InternalOntoL.g:5226:2: ( rule__ReferenceAssignment__Alternatives_3 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAlternatives_3()); 
            // InternalOntoL.g:5227:2: ( rule__ReferenceAssignment__Alternatives_3 )
            // InternalOntoL.g:5227:3: rule__ReferenceAssignment__Alternatives_3
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
    // InternalOntoL.g:5236:1: rule__ReferenceAssignment__Group_3_1__0 : rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1 ;
    public final void rule__ReferenceAssignment__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5240:1: ( rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1 )
            // InternalOntoL.g:5241:2: rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1
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
    // InternalOntoL.g:5248:1: rule__ReferenceAssignment__Group_3_1__0__Impl : ( '{' ) ;
    public final void rule__ReferenceAssignment__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5252:1: ( ( '{' ) )
            // InternalOntoL.g:5253:1: ( '{' )
            {
            // InternalOntoL.g:5253:1: ( '{' )
            // InternalOntoL.g:5254:2: '{'
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
    // InternalOntoL.g:5263:1: rule__ReferenceAssignment__Group_3_1__1 : rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2 ;
    public final void rule__ReferenceAssignment__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5267:1: ( rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2 )
            // InternalOntoL.g:5268:2: rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalOntoL.g:5275:1: rule__ReferenceAssignment__Group_3_1__1__Impl : ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) ) ;
    public final void rule__ReferenceAssignment__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5279:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) ) )
            // InternalOntoL.g:5280:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) )
            {
            // InternalOntoL.g:5280:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) )
            // InternalOntoL.g:5281:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_1_1()); 
            // InternalOntoL.g:5282:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 )
            // InternalOntoL.g:5282:3: rule__ReferenceAssignment__AssignmentsAssignment_3_1_1
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
    // InternalOntoL.g:5290:1: rule__ReferenceAssignment__Group_3_1__2 : rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3 ;
    public final void rule__ReferenceAssignment__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5294:1: ( rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3 )
            // InternalOntoL.g:5295:2: rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalOntoL.g:5302:1: rule__ReferenceAssignment__Group_3_1__2__Impl : ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* ) ;
    public final void rule__ReferenceAssignment__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5306:1: ( ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* ) )
            // InternalOntoL.g:5307:1: ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* )
            {
            // InternalOntoL.g:5307:1: ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* )
            // InternalOntoL.g:5308:2: ( rule__ReferenceAssignment__Group_3_1_2__0 )*
            {
             before(grammarAccess.getReferenceAssignmentAccess().getGroup_3_1_2()); 
            // InternalOntoL.g:5309:2: ( rule__ReferenceAssignment__Group_3_1_2__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==28) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalOntoL.g:5309:3: rule__ReferenceAssignment__Group_3_1_2__0
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
    // InternalOntoL.g:5317:1: rule__ReferenceAssignment__Group_3_1__3 : rule__ReferenceAssignment__Group_3_1__3__Impl ;
    public final void rule__ReferenceAssignment__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5321:1: ( rule__ReferenceAssignment__Group_3_1__3__Impl )
            // InternalOntoL.g:5322:2: rule__ReferenceAssignment__Group_3_1__3__Impl
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
    // InternalOntoL.g:5328:1: rule__ReferenceAssignment__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__ReferenceAssignment__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5332:1: ( ( '}' ) )
            // InternalOntoL.g:5333:1: ( '}' )
            {
            // InternalOntoL.g:5333:1: ( '}' )
            // InternalOntoL.g:5334:2: '}'
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
    // InternalOntoL.g:5344:1: rule__ReferenceAssignment__Group_3_1_2__0 : rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1 ;
    public final void rule__ReferenceAssignment__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5348:1: ( rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1 )
            // InternalOntoL.g:5349:2: rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1
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
    // InternalOntoL.g:5356:1: rule__ReferenceAssignment__Group_3_1_2__0__Impl : ( ',' ) ;
    public final void rule__ReferenceAssignment__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5360:1: ( ( ',' ) )
            // InternalOntoL.g:5361:1: ( ',' )
            {
            // InternalOntoL.g:5361:1: ( ',' )
            // InternalOntoL.g:5362:2: ','
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
    // InternalOntoL.g:5371:1: rule__ReferenceAssignment__Group_3_1_2__1 : rule__ReferenceAssignment__Group_3_1_2__1__Impl ;
    public final void rule__ReferenceAssignment__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5375:1: ( rule__ReferenceAssignment__Group_3_1_2__1__Impl )
            // InternalOntoL.g:5376:2: rule__ReferenceAssignment__Group_3_1_2__1__Impl
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
    // InternalOntoL.g:5382:1: rule__ReferenceAssignment__Group_3_1_2__1__Impl : ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) ) ;
    public final void rule__ReferenceAssignment__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5386:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) ) )
            // InternalOntoL.g:5387:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) )
            {
            // InternalOntoL.g:5387:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) )
            // InternalOntoL.g:5388:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_1_2_1()); 
            // InternalOntoL.g:5389:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 )
            // InternalOntoL.g:5389:3: rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1
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
    // InternalOntoL.g:5398:1: rule__NUMBER__Group__0 : rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 ;
    public final void rule__NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5402:1: ( rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 )
            // InternalOntoL.g:5403:2: rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalOntoL.g:5410:1: rule__NUMBER__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5414:1: ( ( ( '-' )? ) )
            // InternalOntoL.g:5415:1: ( ( '-' )? )
            {
            // InternalOntoL.g:5415:1: ( ( '-' )? )
            // InternalOntoL.g:5416:2: ( '-' )?
            {
             before(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0()); 
            // InternalOntoL.g:5417:2: ( '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==44) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalOntoL.g:5417:3: '-'
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
    // InternalOntoL.g:5425:1: rule__NUMBER__Group__1 : rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2 ;
    public final void rule__NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5429:1: ( rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2 )
            // InternalOntoL.g:5430:2: rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2
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
    // InternalOntoL.g:5437:1: rule__NUMBER__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5441:1: ( ( RULE_INT ) )
            // InternalOntoL.g:5442:1: ( RULE_INT )
            {
            // InternalOntoL.g:5442:1: ( RULE_INT )
            // InternalOntoL.g:5443:2: RULE_INT
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
    // InternalOntoL.g:5452:1: rule__NUMBER__Group__2 : rule__NUMBER__Group__2__Impl ;
    public final void rule__NUMBER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5456:1: ( rule__NUMBER__Group__2__Impl )
            // InternalOntoL.g:5457:2: rule__NUMBER__Group__2__Impl
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
    // InternalOntoL.g:5463:1: rule__NUMBER__Group__2__Impl : ( ( rule__NUMBER__Group_2__0 )? ) ;
    public final void rule__NUMBER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5467:1: ( ( ( rule__NUMBER__Group_2__0 )? ) )
            // InternalOntoL.g:5468:1: ( ( rule__NUMBER__Group_2__0 )? )
            {
            // InternalOntoL.g:5468:1: ( ( rule__NUMBER__Group_2__0 )? )
            // InternalOntoL.g:5469:2: ( rule__NUMBER__Group_2__0 )?
            {
             before(grammarAccess.getNUMBERAccess().getGroup_2()); 
            // InternalOntoL.g:5470:2: ( rule__NUMBER__Group_2__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==22) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalOntoL.g:5470:3: rule__NUMBER__Group_2__0
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
    // InternalOntoL.g:5479:1: rule__NUMBER__Group_2__0 : rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1 ;
    public final void rule__NUMBER__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5483:1: ( rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1 )
            // InternalOntoL.g:5484:2: rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1
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
    // InternalOntoL.g:5491:1: rule__NUMBER__Group_2__0__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5495:1: ( ( '.' ) )
            // InternalOntoL.g:5496:1: ( '.' )
            {
            // InternalOntoL.g:5496:1: ( '.' )
            // InternalOntoL.g:5497:2: '.'
            {
             before(grammarAccess.getNUMBERAccess().getFullStopKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalOntoL.g:5506:1: rule__NUMBER__Group_2__1 : rule__NUMBER__Group_2__1__Impl ;
    public final void rule__NUMBER__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5510:1: ( rule__NUMBER__Group_2__1__Impl )
            // InternalOntoL.g:5511:2: rule__NUMBER__Group_2__1__Impl
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
    // InternalOntoL.g:5517:1: rule__NUMBER__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5521:1: ( ( RULE_INT ) )
            // InternalOntoL.g:5522:1: ( RULE_INT )
            {
            // InternalOntoL.g:5522:1: ( RULE_INT )
            // InternalOntoL.g:5523:2: RULE_INT
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
    // InternalOntoL.g:5533:1: rule__NoneValue__Group__0 : rule__NoneValue__Group__0__Impl rule__NoneValue__Group__1 ;
    public final void rule__NoneValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5537:1: ( rule__NoneValue__Group__0__Impl rule__NoneValue__Group__1 )
            // InternalOntoL.g:5538:2: rule__NoneValue__Group__0__Impl rule__NoneValue__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalOntoL.g:5545:1: rule__NoneValue__Group__0__Impl : ( () ) ;
    public final void rule__NoneValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5549:1: ( ( () ) )
            // InternalOntoL.g:5550:1: ( () )
            {
            // InternalOntoL.g:5550:1: ( () )
            // InternalOntoL.g:5551:2: ()
            {
             before(grammarAccess.getNoneValueAccess().getNoneValueAction_0()); 
            // InternalOntoL.g:5552:2: ()
            // InternalOntoL.g:5552:3: 
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
    // InternalOntoL.g:5560:1: rule__NoneValue__Group__1 : rule__NoneValue__Group__1__Impl ;
    public final void rule__NoneValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5564:1: ( rule__NoneValue__Group__1__Impl )
            // InternalOntoL.g:5565:2: rule__NoneValue__Group__1__Impl
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
    // InternalOntoL.g:5571:1: rule__NoneValue__Group__1__Impl : ( 'none' ) ;
    public final void rule__NoneValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5575:1: ( ( 'none' ) )
            // InternalOntoL.g:5576:1: ( 'none' )
            {
            // InternalOntoL.g:5576:1: ( 'none' )
            // InternalOntoL.g:5577:2: 'none'
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
    // InternalOntoL.g:5587:1: rule__GeneralizationSet__Group__0 : rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 ;
    public final void rule__GeneralizationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5591:1: ( rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 )
            // InternalOntoL.g:5592:2: rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalOntoL.g:5599:1: rule__GeneralizationSet__Group__0__Impl : ( ( rule__GeneralizationSet__Alternatives_0 )? ) ;
    public final void rule__GeneralizationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5603:1: ( ( ( rule__GeneralizationSet__Alternatives_0 )? ) )
            // InternalOntoL.g:5604:1: ( ( rule__GeneralizationSet__Alternatives_0 )? )
            {
            // InternalOntoL.g:5604:1: ( ( rule__GeneralizationSet__Alternatives_0 )? )
            // InternalOntoL.g:5605:2: ( rule__GeneralizationSet__Alternatives_0 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getAlternatives_0()); 
            // InternalOntoL.g:5606:2: ( rule__GeneralizationSet__Alternatives_0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==49) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalOntoL.g:5606:3: rule__GeneralizationSet__Alternatives_0
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
    // InternalOntoL.g:5614:1: rule__GeneralizationSet__Group__1 : rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 ;
    public final void rule__GeneralizationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5618:1: ( rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 )
            // InternalOntoL.g:5619:2: rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalOntoL.g:5626:1: rule__GeneralizationSet__Group__1__Impl : ( 'genset' ) ;
    public final void rule__GeneralizationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5630:1: ( ( 'genset' ) )
            // InternalOntoL.g:5631:1: ( 'genset' )
            {
            // InternalOntoL.g:5631:1: ( 'genset' )
            // InternalOntoL.g:5632:2: 'genset'
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
    // InternalOntoL.g:5641:1: rule__GeneralizationSet__Group__2 : rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 ;
    public final void rule__GeneralizationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5645:1: ( rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 )
            // InternalOntoL.g:5646:2: rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalOntoL.g:5653:1: rule__GeneralizationSet__Group__2__Impl : ( ( rule__GeneralizationSet__NameAssignment_2 )? ) ;
    public final void rule__GeneralizationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5657:1: ( ( ( rule__GeneralizationSet__NameAssignment_2 )? ) )
            // InternalOntoL.g:5658:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            {
            // InternalOntoL.g:5658:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            // InternalOntoL.g:5659:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 
            // InternalOntoL.g:5660:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalOntoL.g:5660:3: rule__GeneralizationSet__NameAssignment_2
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
    // InternalOntoL.g:5668:1: rule__GeneralizationSet__Group__3 : rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 ;
    public final void rule__GeneralizationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5672:1: ( rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 )
            // InternalOntoL.g:5673:2: rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4
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
    // InternalOntoL.g:5680:1: rule__GeneralizationSet__Group__3__Impl : ( 'general' ) ;
    public final void rule__GeneralizationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5684:1: ( ( 'general' ) )
            // InternalOntoL.g:5685:1: ( 'general' )
            {
            // InternalOntoL.g:5685:1: ( 'general' )
            // InternalOntoL.g:5686:2: 'general'
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
    // InternalOntoL.g:5695:1: rule__GeneralizationSet__Group__4 : rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 ;
    public final void rule__GeneralizationSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5699:1: ( rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 )
            // InternalOntoL.g:5700:2: rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalOntoL.g:5707:1: rule__GeneralizationSet__Group__4__Impl : ( ( rule__GeneralizationSet__GeneralAssignment_4 ) ) ;
    public final void rule__GeneralizationSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5711:1: ( ( ( rule__GeneralizationSet__GeneralAssignment_4 ) ) )
            // InternalOntoL.g:5712:1: ( ( rule__GeneralizationSet__GeneralAssignment_4 ) )
            {
            // InternalOntoL.g:5712:1: ( ( rule__GeneralizationSet__GeneralAssignment_4 ) )
            // InternalOntoL.g:5713:2: ( rule__GeneralizationSet__GeneralAssignment_4 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralAssignment_4()); 
            // InternalOntoL.g:5714:2: ( rule__GeneralizationSet__GeneralAssignment_4 )
            // InternalOntoL.g:5714:3: rule__GeneralizationSet__GeneralAssignment_4
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
    // InternalOntoL.g:5722:1: rule__GeneralizationSet__Group__5 : rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 ;
    public final void rule__GeneralizationSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5726:1: ( rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 )
            // InternalOntoL.g:5727:2: rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6
            {
            pushFollow(FOLLOW_35);
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
    // InternalOntoL.g:5734:1: rule__GeneralizationSet__Group__5__Impl : ( ( rule__GeneralizationSet__Group_5__0 )? ) ;
    public final void rule__GeneralizationSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5738:1: ( ( ( rule__GeneralizationSet__Group_5__0 )? ) )
            // InternalOntoL.g:5739:1: ( ( rule__GeneralizationSet__Group_5__0 )? )
            {
            // InternalOntoL.g:5739:1: ( ( rule__GeneralizationSet__Group_5__0 )? )
            // InternalOntoL.g:5740:2: ( rule__GeneralizationSet__Group_5__0 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_5()); 
            // InternalOntoL.g:5741:2: ( rule__GeneralizationSet__Group_5__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==51) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalOntoL.g:5741:3: rule__GeneralizationSet__Group_5__0
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
    // InternalOntoL.g:5749:1: rule__GeneralizationSet__Group__6 : rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 ;
    public final void rule__GeneralizationSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5753:1: ( rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 )
            // InternalOntoL.g:5754:2: rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7
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
    // InternalOntoL.g:5761:1: rule__GeneralizationSet__Group__6__Impl : ( 'specifics' ) ;
    public final void rule__GeneralizationSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5765:1: ( ( 'specifics' ) )
            // InternalOntoL.g:5766:1: ( 'specifics' )
            {
            // InternalOntoL.g:5766:1: ( 'specifics' )
            // InternalOntoL.g:5767:2: 'specifics'
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
    // InternalOntoL.g:5776:1: rule__GeneralizationSet__Group__7 : rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8 ;
    public final void rule__GeneralizationSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5780:1: ( rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8 )
            // InternalOntoL.g:5781:2: rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8
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
    // InternalOntoL.g:5788:1: rule__GeneralizationSet__Group__7__Impl : ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) ) ;
    public final void rule__GeneralizationSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5792:1: ( ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) ) )
            // InternalOntoL.g:5793:1: ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) )
            {
            // InternalOntoL.g:5793:1: ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) )
            // InternalOntoL.g:5794:2: ( rule__GeneralizationSet__SpecificsAssignment_7 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_7()); 
            // InternalOntoL.g:5795:2: ( rule__GeneralizationSet__SpecificsAssignment_7 )
            // InternalOntoL.g:5795:3: rule__GeneralizationSet__SpecificsAssignment_7
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
    // InternalOntoL.g:5803:1: rule__GeneralizationSet__Group__8 : rule__GeneralizationSet__Group__8__Impl ;
    public final void rule__GeneralizationSet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5807:1: ( rule__GeneralizationSet__Group__8__Impl )
            // InternalOntoL.g:5808:2: rule__GeneralizationSet__Group__8__Impl
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
    // InternalOntoL.g:5814:1: rule__GeneralizationSet__Group__8__Impl : ( ( rule__GeneralizationSet__Group_8__0 )* ) ;
    public final void rule__GeneralizationSet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5818:1: ( ( ( rule__GeneralizationSet__Group_8__0 )* ) )
            // InternalOntoL.g:5819:1: ( ( rule__GeneralizationSet__Group_8__0 )* )
            {
            // InternalOntoL.g:5819:1: ( ( rule__GeneralizationSet__Group_8__0 )* )
            // InternalOntoL.g:5820:2: ( rule__GeneralizationSet__Group_8__0 )*
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 
            // InternalOntoL.g:5821:2: ( rule__GeneralizationSet__Group_8__0 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==28) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalOntoL.g:5821:3: rule__GeneralizationSet__Group_8__0
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


    // $ANTLR start "rule__GeneralizationSet__Group_0_0__0"
    // InternalOntoL.g:5830:1: rule__GeneralizationSet__Group_0_0__0 : rule__GeneralizationSet__Group_0_0__0__Impl rule__GeneralizationSet__Group_0_0__1 ;
    public final void rule__GeneralizationSet__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5834:1: ( rule__GeneralizationSet__Group_0_0__0__Impl rule__GeneralizationSet__Group_0_0__1 )
            // InternalOntoL.g:5835:2: rule__GeneralizationSet__Group_0_0__0__Impl rule__GeneralizationSet__Group_0_0__1
            {
            pushFollow(FOLLOW_36);
            rule__GeneralizationSet__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_0__0"


    // $ANTLR start "rule__GeneralizationSet__Group_0_0__0__Impl"
    // InternalOntoL.g:5842:1: rule__GeneralizationSet__Group_0_0__0__Impl : ( '(' ) ;
    public final void rule__GeneralizationSet__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5846:1: ( ( '(' ) )
            // InternalOntoL.g:5847:1: ( '(' )
            {
            // InternalOntoL.g:5847:1: ( '(' )
            // InternalOntoL.g:5848:2: '('
            {
             before(grammarAccess.getGeneralizationSetAccess().getLeftParenthesisKeyword_0_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getLeftParenthesisKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_0__0__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_0_0__1"
    // InternalOntoL.g:5857:1: rule__GeneralizationSet__Group_0_0__1 : rule__GeneralizationSet__Group_0_0__1__Impl rule__GeneralizationSet__Group_0_0__2 ;
    public final void rule__GeneralizationSet__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5861:1: ( rule__GeneralizationSet__Group_0_0__1__Impl rule__GeneralizationSet__Group_0_0__2 )
            // InternalOntoL.g:5862:2: rule__GeneralizationSet__Group_0_0__1__Impl rule__GeneralizationSet__Group_0_0__2
            {
            pushFollow(FOLLOW_37);
            rule__GeneralizationSet__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_0__1"


    // $ANTLR start "rule__GeneralizationSet__Group_0_0__1__Impl"
    // InternalOntoL.g:5869:1: rule__GeneralizationSet__Group_0_0__1__Impl : ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0_1 ) ) ;
    public final void rule__GeneralizationSet__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5873:1: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0_1 ) ) )
            // InternalOntoL.g:5874:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0_1 ) )
            {
            // InternalOntoL.g:5874:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0_1 ) )
            // InternalOntoL.g:5875:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_0_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_0_1()); 
            // InternalOntoL.g:5876:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_0_1 )
            // InternalOntoL.g:5876:3: rule__GeneralizationSet__IsDisjointAssignment_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__IsDisjointAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_0__1__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_0_0__2"
    // InternalOntoL.g:5884:1: rule__GeneralizationSet__Group_0_0__2 : rule__GeneralizationSet__Group_0_0__2__Impl ;
    public final void rule__GeneralizationSet__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5888:1: ( rule__GeneralizationSet__Group_0_0__2__Impl )
            // InternalOntoL.g:5889:2: rule__GeneralizationSet__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_0_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_0__2"


    // $ANTLR start "rule__GeneralizationSet__Group_0_0__2__Impl"
    // InternalOntoL.g:5895:1: rule__GeneralizationSet__Group_0_0__2__Impl : ( ')' ) ;
    public final void rule__GeneralizationSet__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5899:1: ( ( ')' ) )
            // InternalOntoL.g:5900:1: ( ')' )
            {
            // InternalOntoL.g:5900:1: ( ')' )
            // InternalOntoL.g:5901:2: ')'
            {
             before(grammarAccess.getGeneralizationSetAccess().getRightParenthesisKeyword_0_0_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getRightParenthesisKeyword_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_0__2__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_0_1__0"
    // InternalOntoL.g:5911:1: rule__GeneralizationSet__Group_0_1__0 : rule__GeneralizationSet__Group_0_1__0__Impl rule__GeneralizationSet__Group_0_1__1 ;
    public final void rule__GeneralizationSet__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5915:1: ( rule__GeneralizationSet__Group_0_1__0__Impl rule__GeneralizationSet__Group_0_1__1 )
            // InternalOntoL.g:5916:2: rule__GeneralizationSet__Group_0_1__0__Impl rule__GeneralizationSet__Group_0_1__1
            {
            pushFollow(FOLLOW_38);
            rule__GeneralizationSet__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_1__0"


    // $ANTLR start "rule__GeneralizationSet__Group_0_1__0__Impl"
    // InternalOntoL.g:5923:1: rule__GeneralizationSet__Group_0_1__0__Impl : ( '(' ) ;
    public final void rule__GeneralizationSet__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5927:1: ( ( '(' ) )
            // InternalOntoL.g:5928:1: ( '(' )
            {
            // InternalOntoL.g:5928:1: ( '(' )
            // InternalOntoL.g:5929:2: '('
            {
             before(grammarAccess.getGeneralizationSetAccess().getLeftParenthesisKeyword_0_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getLeftParenthesisKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_1__0__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_0_1__1"
    // InternalOntoL.g:5938:1: rule__GeneralizationSet__Group_0_1__1 : rule__GeneralizationSet__Group_0_1__1__Impl rule__GeneralizationSet__Group_0_1__2 ;
    public final void rule__GeneralizationSet__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5942:1: ( rule__GeneralizationSet__Group_0_1__1__Impl rule__GeneralizationSet__Group_0_1__2 )
            // InternalOntoL.g:5943:2: rule__GeneralizationSet__Group_0_1__1__Impl rule__GeneralizationSet__Group_0_1__2
            {
            pushFollow(FOLLOW_37);
            rule__GeneralizationSet__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_1__1"


    // $ANTLR start "rule__GeneralizationSet__Group_0_1__1__Impl"
    // InternalOntoL.g:5950:1: rule__GeneralizationSet__Group_0_1__1__Impl : ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1_1 ) ) ;
    public final void rule__GeneralizationSet__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5954:1: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1_1 ) ) )
            // InternalOntoL.g:5955:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1_1 ) )
            {
            // InternalOntoL.g:5955:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1_1 ) )
            // InternalOntoL.g:5956:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_1_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_1_1()); 
            // InternalOntoL.g:5957:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_1_1 )
            // InternalOntoL.g:5957:3: rule__GeneralizationSet__IsCompleteAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__IsCompleteAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_1__1__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_0_1__2"
    // InternalOntoL.g:5965:1: rule__GeneralizationSet__Group_0_1__2 : rule__GeneralizationSet__Group_0_1__2__Impl ;
    public final void rule__GeneralizationSet__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5969:1: ( rule__GeneralizationSet__Group_0_1__2__Impl )
            // InternalOntoL.g:5970:2: rule__GeneralizationSet__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_1__2"


    // $ANTLR start "rule__GeneralizationSet__Group_0_1__2__Impl"
    // InternalOntoL.g:5976:1: rule__GeneralizationSet__Group_0_1__2__Impl : ( ')' ) ;
    public final void rule__GeneralizationSet__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5980:1: ( ( ')' ) )
            // InternalOntoL.g:5981:1: ( ')' )
            {
            // InternalOntoL.g:5981:1: ( ')' )
            // InternalOntoL.g:5982:2: ')'
            {
             before(grammarAccess.getGeneralizationSetAccess().getRightParenthesisKeyword_0_1_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getRightParenthesisKeyword_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_1__2__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_0_2__0"
    // InternalOntoL.g:5992:1: rule__GeneralizationSet__Group_0_2__0 : rule__GeneralizationSet__Group_0_2__0__Impl rule__GeneralizationSet__Group_0_2__1 ;
    public final void rule__GeneralizationSet__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5996:1: ( rule__GeneralizationSet__Group_0_2__0__Impl rule__GeneralizationSet__Group_0_2__1 )
            // InternalOntoL.g:5997:2: rule__GeneralizationSet__Group_0_2__0__Impl rule__GeneralizationSet__Group_0_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalOntoL.g:6004:1: rule__GeneralizationSet__Group_0_2__0__Impl : ( '(' ) ;
    public final void rule__GeneralizationSet__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6008:1: ( ( '(' ) )
            // InternalOntoL.g:6009:1: ( '(' )
            {
            // InternalOntoL.g:6009:1: ( '(' )
            // InternalOntoL.g:6010:2: '('
            {
             before(grammarAccess.getGeneralizationSetAccess().getLeftParenthesisKeyword_0_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getLeftParenthesisKeyword_0_2_0()); 

            }


            }

        }
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
    // InternalOntoL.g:6019:1: rule__GeneralizationSet__Group_0_2__1 : rule__GeneralizationSet__Group_0_2__1__Impl rule__GeneralizationSet__Group_0_2__2 ;
    public final void rule__GeneralizationSet__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6023:1: ( rule__GeneralizationSet__Group_0_2__1__Impl rule__GeneralizationSet__Group_0_2__2 )
            // InternalOntoL.g:6024:2: rule__GeneralizationSet__Group_0_2__1__Impl rule__GeneralizationSet__Group_0_2__2
            {
            pushFollow(FOLLOW_12);
            rule__GeneralizationSet__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_0_2__2();

            state._fsp--;


            }

        }
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
    // InternalOntoL.g:6031:1: rule__GeneralizationSet__Group_0_2__1__Impl : ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_1 ) ) ;
    public final void rule__GeneralizationSet__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6035:1: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_1 ) ) )
            // InternalOntoL.g:6036:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_1 ) )
            {
            // InternalOntoL.g:6036:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_1 ) )
            // InternalOntoL.g:6037:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_2_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_2_1()); 
            // InternalOntoL.g:6038:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_2_1 )
            // InternalOntoL.g:6038:3: rule__GeneralizationSet__IsDisjointAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__IsDisjointAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__GeneralizationSet__Group_0_2__2"
    // InternalOntoL.g:6046:1: rule__GeneralizationSet__Group_0_2__2 : rule__GeneralizationSet__Group_0_2__2__Impl rule__GeneralizationSet__Group_0_2__3 ;
    public final void rule__GeneralizationSet__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6050:1: ( rule__GeneralizationSet__Group_0_2__2__Impl rule__GeneralizationSet__Group_0_2__3 )
            // InternalOntoL.g:6051:2: rule__GeneralizationSet__Group_0_2__2__Impl rule__GeneralizationSet__Group_0_2__3
            {
            pushFollow(FOLLOW_38);
            rule__GeneralizationSet__Group_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_0_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_2__2"


    // $ANTLR start "rule__GeneralizationSet__Group_0_2__2__Impl"
    // InternalOntoL.g:6058:1: rule__GeneralizationSet__Group_0_2__2__Impl : ( ',' ) ;
    public final void rule__GeneralizationSet__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6062:1: ( ( ',' ) )
            // InternalOntoL.g:6063:1: ( ',' )
            {
            // InternalOntoL.g:6063:1: ( ',' )
            // InternalOntoL.g:6064:2: ','
            {
             before(grammarAccess.getGeneralizationSetAccess().getCommaKeyword_0_2_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getCommaKeyword_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_2__2__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_0_2__3"
    // InternalOntoL.g:6073:1: rule__GeneralizationSet__Group_0_2__3 : rule__GeneralizationSet__Group_0_2__3__Impl rule__GeneralizationSet__Group_0_2__4 ;
    public final void rule__GeneralizationSet__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6077:1: ( rule__GeneralizationSet__Group_0_2__3__Impl rule__GeneralizationSet__Group_0_2__4 )
            // InternalOntoL.g:6078:2: rule__GeneralizationSet__Group_0_2__3__Impl rule__GeneralizationSet__Group_0_2__4
            {
            pushFollow(FOLLOW_37);
            rule__GeneralizationSet__Group_0_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_0_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_2__3"


    // $ANTLR start "rule__GeneralizationSet__Group_0_2__3__Impl"
    // InternalOntoL.g:6085:1: rule__GeneralizationSet__Group_0_2__3__Impl : ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_3 ) ) ;
    public final void rule__GeneralizationSet__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6089:1: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_3 ) ) )
            // InternalOntoL.g:6090:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_3 ) )
            {
            // InternalOntoL.g:6090:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_3 ) )
            // InternalOntoL.g:6091:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_2_3 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_2_3()); 
            // InternalOntoL.g:6092:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_2_3 )
            // InternalOntoL.g:6092:3: rule__GeneralizationSet__IsCompleteAssignment_0_2_3
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__IsCompleteAssignment_0_2_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_2__3__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_0_2__4"
    // InternalOntoL.g:6100:1: rule__GeneralizationSet__Group_0_2__4 : rule__GeneralizationSet__Group_0_2__4__Impl ;
    public final void rule__GeneralizationSet__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6104:1: ( rule__GeneralizationSet__Group_0_2__4__Impl )
            // InternalOntoL.g:6105:2: rule__GeneralizationSet__Group_0_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_0_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_2__4"


    // $ANTLR start "rule__GeneralizationSet__Group_0_2__4__Impl"
    // InternalOntoL.g:6111:1: rule__GeneralizationSet__Group_0_2__4__Impl : ( ')' ) ;
    public final void rule__GeneralizationSet__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6115:1: ( ( ')' ) )
            // InternalOntoL.g:6116:1: ( ')' )
            {
            // InternalOntoL.g:6116:1: ( ')' )
            // InternalOntoL.g:6117:2: ')'
            {
             before(grammarAccess.getGeneralizationSetAccess().getRightParenthesisKeyword_0_2_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getRightParenthesisKeyword_0_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_2__4__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_0_3__0"
    // InternalOntoL.g:6127:1: rule__GeneralizationSet__Group_0_3__0 : rule__GeneralizationSet__Group_0_3__0__Impl rule__GeneralizationSet__Group_0_3__1 ;
    public final void rule__GeneralizationSet__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6131:1: ( rule__GeneralizationSet__Group_0_3__0__Impl rule__GeneralizationSet__Group_0_3__1 )
            // InternalOntoL.g:6132:2: rule__GeneralizationSet__Group_0_3__0__Impl rule__GeneralizationSet__Group_0_3__1
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
    // InternalOntoL.g:6139:1: rule__GeneralizationSet__Group_0_3__0__Impl : ( '(' ) ;
    public final void rule__GeneralizationSet__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6143:1: ( ( '(' ) )
            // InternalOntoL.g:6144:1: ( '(' )
            {
            // InternalOntoL.g:6144:1: ( '(' )
            // InternalOntoL.g:6145:2: '('
            {
             before(grammarAccess.getGeneralizationSetAccess().getLeftParenthesisKeyword_0_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getLeftParenthesisKeyword_0_3_0()); 

            }


            }

        }
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
    // InternalOntoL.g:6154:1: rule__GeneralizationSet__Group_0_3__1 : rule__GeneralizationSet__Group_0_3__1__Impl rule__GeneralizationSet__Group_0_3__2 ;
    public final void rule__GeneralizationSet__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6158:1: ( rule__GeneralizationSet__Group_0_3__1__Impl rule__GeneralizationSet__Group_0_3__2 )
            // InternalOntoL.g:6159:2: rule__GeneralizationSet__Group_0_3__1__Impl rule__GeneralizationSet__Group_0_3__2
            {
            pushFollow(FOLLOW_12);
            rule__GeneralizationSet__Group_0_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_0_3__2();

            state._fsp--;


            }

        }
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
    // InternalOntoL.g:6166:1: rule__GeneralizationSet__Group_0_3__1__Impl : ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_1 ) ) ;
    public final void rule__GeneralizationSet__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6170:1: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_1 ) ) )
            // InternalOntoL.g:6171:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_1 ) )
            {
            // InternalOntoL.g:6171:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_1 ) )
            // InternalOntoL.g:6172:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_3_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_3_1()); 
            // InternalOntoL.g:6173:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_3_1 )
            // InternalOntoL.g:6173:3: rule__GeneralizationSet__IsCompleteAssignment_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__IsCompleteAssignment_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__GeneralizationSet__Group_0_3__2"
    // InternalOntoL.g:6181:1: rule__GeneralizationSet__Group_0_3__2 : rule__GeneralizationSet__Group_0_3__2__Impl rule__GeneralizationSet__Group_0_3__3 ;
    public final void rule__GeneralizationSet__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6185:1: ( rule__GeneralizationSet__Group_0_3__2__Impl rule__GeneralizationSet__Group_0_3__3 )
            // InternalOntoL.g:6186:2: rule__GeneralizationSet__Group_0_3__2__Impl rule__GeneralizationSet__Group_0_3__3
            {
            pushFollow(FOLLOW_36);
            rule__GeneralizationSet__Group_0_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_0_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_3__2"


    // $ANTLR start "rule__GeneralizationSet__Group_0_3__2__Impl"
    // InternalOntoL.g:6193:1: rule__GeneralizationSet__Group_0_3__2__Impl : ( ',' ) ;
    public final void rule__GeneralizationSet__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6197:1: ( ( ',' ) )
            // InternalOntoL.g:6198:1: ( ',' )
            {
            // InternalOntoL.g:6198:1: ( ',' )
            // InternalOntoL.g:6199:2: ','
            {
             before(grammarAccess.getGeneralizationSetAccess().getCommaKeyword_0_3_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getCommaKeyword_0_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_3__2__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_0_3__3"
    // InternalOntoL.g:6208:1: rule__GeneralizationSet__Group_0_3__3 : rule__GeneralizationSet__Group_0_3__3__Impl rule__GeneralizationSet__Group_0_3__4 ;
    public final void rule__GeneralizationSet__Group_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6212:1: ( rule__GeneralizationSet__Group_0_3__3__Impl rule__GeneralizationSet__Group_0_3__4 )
            // InternalOntoL.g:6213:2: rule__GeneralizationSet__Group_0_3__3__Impl rule__GeneralizationSet__Group_0_3__4
            {
            pushFollow(FOLLOW_37);
            rule__GeneralizationSet__Group_0_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_0_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_3__3"


    // $ANTLR start "rule__GeneralizationSet__Group_0_3__3__Impl"
    // InternalOntoL.g:6220:1: rule__GeneralizationSet__Group_0_3__3__Impl : ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_3 ) ) ;
    public final void rule__GeneralizationSet__Group_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6224:1: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_3 ) ) )
            // InternalOntoL.g:6225:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_3 ) )
            {
            // InternalOntoL.g:6225:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_3 ) )
            // InternalOntoL.g:6226:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_3_3 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_3_3()); 
            // InternalOntoL.g:6227:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_3_3 )
            // InternalOntoL.g:6227:3: rule__GeneralizationSet__IsDisjointAssignment_0_3_3
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__IsDisjointAssignment_0_3_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_3__3__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_0_3__4"
    // InternalOntoL.g:6235:1: rule__GeneralizationSet__Group_0_3__4 : rule__GeneralizationSet__Group_0_3__4__Impl ;
    public final void rule__GeneralizationSet__Group_0_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6239:1: ( rule__GeneralizationSet__Group_0_3__4__Impl )
            // InternalOntoL.g:6240:2: rule__GeneralizationSet__Group_0_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_0_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_3__4"


    // $ANTLR start "rule__GeneralizationSet__Group_0_3__4__Impl"
    // InternalOntoL.g:6246:1: rule__GeneralizationSet__Group_0_3__4__Impl : ( ')' ) ;
    public final void rule__GeneralizationSet__Group_0_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6250:1: ( ( ')' ) )
            // InternalOntoL.g:6251:1: ( ')' )
            {
            // InternalOntoL.g:6251:1: ( ')' )
            // InternalOntoL.g:6252:2: ')'
            {
             before(grammarAccess.getGeneralizationSetAccess().getRightParenthesisKeyword_0_3_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getRightParenthesisKeyword_0_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_0_3__4__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_5__0"
    // InternalOntoL.g:6262:1: rule__GeneralizationSet__Group_5__0 : rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1 ;
    public final void rule__GeneralizationSet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6266:1: ( rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1 )
            // InternalOntoL.g:6267:2: rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1
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
    // InternalOntoL.g:6274:1: rule__GeneralizationSet__Group_5__0__Impl : ( 'categorizer' ) ;
    public final void rule__GeneralizationSet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6278:1: ( ( 'categorizer' ) )
            // InternalOntoL.g:6279:1: ( 'categorizer' )
            {
            // InternalOntoL.g:6279:1: ( 'categorizer' )
            // InternalOntoL.g:6280:2: 'categorizer'
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerKeyword_5_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalOntoL.g:6289:1: rule__GeneralizationSet__Group_5__1 : rule__GeneralizationSet__Group_5__1__Impl ;
    public final void rule__GeneralizationSet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6293:1: ( rule__GeneralizationSet__Group_5__1__Impl )
            // InternalOntoL.g:6294:2: rule__GeneralizationSet__Group_5__1__Impl
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
    // InternalOntoL.g:6300:1: rule__GeneralizationSet__Group_5__1__Impl : ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) ) ;
    public final void rule__GeneralizationSet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6304:1: ( ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) ) )
            // InternalOntoL.g:6305:1: ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) )
            {
            // InternalOntoL.g:6305:1: ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) )
            // InternalOntoL.g:6306:2: ( rule__GeneralizationSet__CategorizerAssignment_5_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerAssignment_5_1()); 
            // InternalOntoL.g:6307:2: ( rule__GeneralizationSet__CategorizerAssignment_5_1 )
            // InternalOntoL.g:6307:3: rule__GeneralizationSet__CategorizerAssignment_5_1
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
    // InternalOntoL.g:6316:1: rule__GeneralizationSet__Group_8__0 : rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1 ;
    public final void rule__GeneralizationSet__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6320:1: ( rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1 )
            // InternalOntoL.g:6321:2: rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1
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
    // InternalOntoL.g:6328:1: rule__GeneralizationSet__Group_8__0__Impl : ( ',' ) ;
    public final void rule__GeneralizationSet__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6332:1: ( ( ',' ) )
            // InternalOntoL.g:6333:1: ( ',' )
            {
            // InternalOntoL.g:6333:1: ( ',' )
            // InternalOntoL.g:6334:2: ','
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
    // InternalOntoL.g:6343:1: rule__GeneralizationSet__Group_8__1 : rule__GeneralizationSet__Group_8__1__Impl ;
    public final void rule__GeneralizationSet__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6347:1: ( rule__GeneralizationSet__Group_8__1__Impl )
            // InternalOntoL.g:6348:2: rule__GeneralizationSet__Group_8__1__Impl
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
    // InternalOntoL.g:6354:1: rule__GeneralizationSet__Group_8__1__Impl : ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) ) ;
    public final void rule__GeneralizationSet__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6358:1: ( ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) ) )
            // InternalOntoL.g:6359:1: ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) )
            {
            // InternalOntoL.g:6359:1: ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) )
            // InternalOntoL.g:6360:2: ( rule__GeneralizationSet__SpecificsAssignment_8_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_8_1()); 
            // InternalOntoL.g:6361:2: ( rule__GeneralizationSet__SpecificsAssignment_8_1 )
            // InternalOntoL.g:6361:3: rule__GeneralizationSet__SpecificsAssignment_8_1
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
    // InternalOntoL.g:6370:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6374:1: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6375:2: ( ruleQualifiedName )
            {
            // InternalOntoL.g:6375:2: ( ruleQualifiedName )
            // InternalOntoL.g:6376:3: ruleQualifiedName
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


    // $ANTLR start "rule__Model__ElementsAssignment_3"
    // InternalOntoL.g:6385:1: rule__Model__ElementsAssignment_3 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6389:1: ( ( ruleModelElement ) )
            // InternalOntoL.g:6390:2: ( ruleModelElement )
            {
            // InternalOntoL.g:6390:2: ( ruleModelElement )
            // InternalOntoL.g:6391:3: ruleModelElement
            {
             before(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalOntoL.g:6400:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6404:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalOntoL.g:6405:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalOntoL.g:6405:2: ( ruleQualifiedNameWithWildcard )
            // InternalOntoL.g:6406:3: ruleQualifiedNameWithWildcard
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


    // $ANTLR start "rule__Include__IncludeAssignment_1"
    // InternalOntoL.g:6415:1: rule__Include__IncludeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Include__IncludeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6419:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6420:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6420:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6421:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getIncludeAccess().getIncludeModelCrossReference_1_0()); 
            // InternalOntoL.g:6422:3: ( ruleQualifiedName )
            // InternalOntoL.g:6423:4: ruleQualifiedName
            {
             before(grammarAccess.getIncludeAccess().getIncludeModelQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getIncludeAccess().getIncludeModelQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getIncludeAccess().getIncludeModelCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__IncludeAssignment_1"


    // $ANTLR start "rule__Individual__NameAssignment_1"
    // InternalOntoL.g:6434:1: rule__Individual__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Individual__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6438:1: ( ( RULE_ID ) )
            // InternalOntoL.g:6439:2: ( RULE_ID )
            {
            // InternalOntoL.g:6439:2: ( RULE_ID )
            // InternalOntoL.g:6440:3: RULE_ID
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
    // InternalOntoL.g:6449:1: rule__Individual__InstantiatedClassesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Individual__InstantiatedClassesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6453:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6454:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6454:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6455:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesOntoLClassCrossReference_2_1_0()); 
            // InternalOntoL.g:6456:3: ( ruleQualifiedName )
            // InternalOntoL.g:6457:4: ruleQualifiedName
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
    // InternalOntoL.g:6468:1: rule__Individual__InstantiatedClassesAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Individual__InstantiatedClassesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6472:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6473:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6473:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6474:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesOntoLClassCrossReference_2_2_1_0()); 
            // InternalOntoL.g:6475:3: ( ruleQualifiedName )
            // InternalOntoL.g:6476:4: ruleQualifiedName
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
    // InternalOntoL.g:6487:1: rule__Individual__AttAssignmentsAssignment_3_1_0 : ( ruleAttributeAssignment ) ;
    public final void rule__Individual__AttAssignmentsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6491:1: ( ( ruleAttributeAssignment ) )
            // InternalOntoL.g:6492:2: ( ruleAttributeAssignment )
            {
            // InternalOntoL.g:6492:2: ( ruleAttributeAssignment )
            // InternalOntoL.g:6493:3: ruleAttributeAssignment
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
    // InternalOntoL.g:6502:1: rule__Individual__RefAssignmentsAssignment_3_1_1 : ( ruleReferenceAssignment ) ;
    public final void rule__Individual__RefAssignmentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6506:1: ( ( ruleReferenceAssignment ) )
            // InternalOntoL.g:6507:2: ( ruleReferenceAssignment )
            {
            // InternalOntoL.g:6507:2: ( ruleReferenceAssignment )
            // InternalOntoL.g:6508:3: ruleReferenceAssignment
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
    // InternalOntoL.g:6517:1: rule__OntoLClass__AttributesAssignment_1_1_0 : ( ruleAttribute ) ;
    public final void rule__OntoLClass__AttributesAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6521:1: ( ( ruleAttribute ) )
            // InternalOntoL.g:6522:2: ( ruleAttribute )
            {
            // InternalOntoL.g:6522:2: ( ruleAttribute )
            // InternalOntoL.g:6523:3: ruleAttribute
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
    // InternalOntoL.g:6532:1: rule__OntoLClass__AttAssignmentsAssignment_1_1_1 : ( ruleAttributeAssignment ) ;
    public final void rule__OntoLClass__AttAssignmentsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6536:1: ( ( ruleAttributeAssignment ) )
            // InternalOntoL.g:6537:2: ( ruleAttributeAssignment )
            {
            // InternalOntoL.g:6537:2: ( ruleAttributeAssignment )
            // InternalOntoL.g:6538:3: ruleAttributeAssignment
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
    // InternalOntoL.g:6547:1: rule__OntoLClass__ReferencesAssignment_1_1_2 : ( ruleReference ) ;
    public final void rule__OntoLClass__ReferencesAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6551:1: ( ( ruleReference ) )
            // InternalOntoL.g:6552:2: ( ruleReference )
            {
            // InternalOntoL.g:6552:2: ( ruleReference )
            // InternalOntoL.g:6553:3: ruleReference
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
    // InternalOntoL.g:6562:1: rule__OntoLClass__RefAssignmentsAssignment_1_1_3 : ( ruleReferenceAssignment ) ;
    public final void rule__OntoLClass__RefAssignmentsAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6566:1: ( ( ruleReferenceAssignment ) )
            // InternalOntoL.g:6567:2: ( ruleReferenceAssignment )
            {
            // InternalOntoL.g:6567:2: ( ruleReferenceAssignment )
            // InternalOntoL.g:6568:3: ruleReferenceAssignment
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
    // InternalOntoL.g:6577:1: rule__OrderlessClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OrderlessClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6581:1: ( ( RULE_ID ) )
            // InternalOntoL.g:6582:2: ( RULE_ID )
            {
            // InternalOntoL.g:6582:2: ( RULE_ID )
            // InternalOntoL.g:6583:3: RULE_ID
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
    // InternalOntoL.g:6592:1: rule__OrderlessClass__InstantiatedClassesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__InstantiatedClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6596:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6597:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6597:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6598:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_1_0()); 
            // InternalOntoL.g:6599:3: ( ruleQualifiedName )
            // InternalOntoL.g:6600:4: ruleQualifiedName
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
    // InternalOntoL.g:6611:1: rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__InstantiatedClassesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6615:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6616:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6616:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6617:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_2_1_0()); 
            // InternalOntoL.g:6618:3: ( ruleQualifiedName )
            // InternalOntoL.g:6619:4: ruleQualifiedName
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
    // InternalOntoL.g:6630:1: rule__OrderlessClass__SuperClassesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__SuperClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6634:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6635:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6635:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6636:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getSuperClassesOntoLClassCrossReference_4_1_0()); 
            // InternalOntoL.g:6637:3: ( ruleQualifiedName )
            // InternalOntoL.g:6638:4: ruleQualifiedName
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
    // InternalOntoL.g:6649:1: rule__OrderlessClass__SuperClassesAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__SuperClassesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6653:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6654:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6654:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6655:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getSuperClassesOntoLClassCrossReference_4_2_1_0()); 
            // InternalOntoL.g:6656:3: ( ruleQualifiedName )
            // InternalOntoL.g:6657:4: ruleQualifiedName
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
    // InternalOntoL.g:6668:1: rule__OrderlessClass__SubordinatorsAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__SubordinatorsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6672:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6673:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6673:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6674:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatorsOntoLClassCrossReference_5_1_0()); 
            // InternalOntoL.g:6675:3: ( ruleQualifiedName )
            // InternalOntoL.g:6676:4: ruleQualifiedName
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
    // InternalOntoL.g:6687:1: rule__OrderlessClass__SubordinatorsAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__SubordinatorsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6691:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6692:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6692:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6693:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getSubordinatorsOntoLClassCrossReference_5_2_1_0()); 
            // InternalOntoL.g:6694:3: ( ruleQualifiedName )
            // InternalOntoL.g:6695:4: ruleQualifiedName
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
    // InternalOntoL.g:6706:1: rule__OrderlessClass__CategorizationTypeAssignment_6_0_0 : ( ruleCategorizationType ) ;
    public final void rule__OrderlessClass__CategorizationTypeAssignment_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6710:1: ( ( ruleCategorizationType ) )
            // InternalOntoL.g:6711:2: ( ruleCategorizationType )
            {
            // InternalOntoL.g:6711:2: ( ruleCategorizationType )
            // InternalOntoL.g:6712:3: ruleCategorizationType
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
    // InternalOntoL.g:6721:1: rule__OrderlessClass__BasetypeAssignment_6_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__BasetypeAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6725:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6726:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6726:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6727:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getBasetypeOntoLClassCrossReference_6_0_1_0()); 
            // InternalOntoL.g:6728:3: ( ruleQualifiedName )
            // InternalOntoL.g:6729:4: ruleQualifiedName
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
    // InternalOntoL.g:6740:1: rule__OrderlessClass__PowertypeOfAssignment_6_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__OrderlessClass__PowertypeOfAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6744:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6745:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6745:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6746:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getOrderlessClassAccess().getPowertypeOfOntoLClassCrossReference_6_1_1_0()); 
            // InternalOntoL.g:6747:3: ( ruleQualifiedName )
            // InternalOntoL.g:6748:4: ruleQualifiedName
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
    // InternalOntoL.g:6759:1: rule__FOClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FOClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6763:1: ( ( RULE_ID ) )
            // InternalOntoL.g:6764:2: ( RULE_ID )
            {
            // InternalOntoL.g:6764:2: ( RULE_ID )
            // InternalOntoL.g:6765:3: RULE_ID
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
    // InternalOntoL.g:6774:1: rule__FOClass__InstantiatedClassesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__InstantiatedClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6778:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6779:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6779:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6780:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_1_0()); 
            // InternalOntoL.g:6781:3: ( ruleQualifiedName )
            // InternalOntoL.g:6782:4: ruleQualifiedName
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
    // InternalOntoL.g:6793:1: rule__FOClass__InstantiatedClassesAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__InstantiatedClassesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6797:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6798:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6798:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6799:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_2_1_0()); 
            // InternalOntoL.g:6800:3: ( ruleQualifiedName )
            // InternalOntoL.g:6801:4: ruleQualifiedName
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
    // InternalOntoL.g:6812:1: rule__FOClass__SuperClassesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__SuperClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6816:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6817:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6817:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6818:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesOntoLClassCrossReference_4_1_0()); 
            // InternalOntoL.g:6819:3: ( ruleQualifiedName )
            // InternalOntoL.g:6820:4: ruleQualifiedName
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
    // InternalOntoL.g:6831:1: rule__FOClass__SuperClassesAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__SuperClassesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6835:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6836:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6836:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6837:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesOntoLClassCrossReference_4_2_1_0()); 
            // InternalOntoL.g:6838:3: ( ruleQualifiedName )
            // InternalOntoL.g:6839:4: ruleQualifiedName
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
    // InternalOntoL.g:6850:1: rule__HOClass__OrderAssignment_1 : ( RULE_INT ) ;
    public final void rule__HOClass__OrderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6854:1: ( ( RULE_INT ) )
            // InternalOntoL.g:6855:2: ( RULE_INT )
            {
            // InternalOntoL.g:6855:2: ( RULE_INT )
            // InternalOntoL.g:6856:3: RULE_INT
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
    // InternalOntoL.g:6865:1: rule__HOClass__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__HOClass__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6869:1: ( ( RULE_ID ) )
            // InternalOntoL.g:6870:2: ( RULE_ID )
            {
            // InternalOntoL.g:6870:2: ( RULE_ID )
            // InternalOntoL.g:6871:3: RULE_ID
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
    // InternalOntoL.g:6880:1: rule__HOClass__InstantiatedClassesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__InstantiatedClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6884:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6885:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6885:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6886:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getInstantiatedClassesOntoLClassCrossReference_4_1_0()); 
            // InternalOntoL.g:6887:3: ( ruleQualifiedName )
            // InternalOntoL.g:6888:4: ruleQualifiedName
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
    // InternalOntoL.g:6899:1: rule__HOClass__InstantiatedClassesAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__InstantiatedClassesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6903:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6904:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6904:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6905:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getInstantiatedClassesOntoLClassCrossReference_4_2_1_0()); 
            // InternalOntoL.g:6906:3: ( ruleQualifiedName )
            // InternalOntoL.g:6907:4: ruleQualifiedName
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
    // InternalOntoL.g:6918:1: rule__HOClass__SuperClassesAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SuperClassesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6922:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6923:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6923:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6924:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesOntoLClassCrossReference_5_1_0()); 
            // InternalOntoL.g:6925:3: ( ruleQualifiedName )
            // InternalOntoL.g:6926:4: ruleQualifiedName
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
    // InternalOntoL.g:6937:1: rule__HOClass__SuperClassesAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SuperClassesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6941:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6942:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6942:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6943:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesOntoLClassCrossReference_5_2_1_0()); 
            // InternalOntoL.g:6944:3: ( ruleQualifiedName )
            // InternalOntoL.g:6945:4: ruleQualifiedName
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
    // InternalOntoL.g:6956:1: rule__HOClass__SubordinatorsAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SubordinatorsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6960:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6961:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6961:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6962:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsOntoLClassCrossReference_6_1_0()); 
            // InternalOntoL.g:6963:3: ( ruleQualifiedName )
            // InternalOntoL.g:6964:4: ruleQualifiedName
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
    // InternalOntoL.g:6975:1: rule__HOClass__SubordinatorsAssignment_6_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SubordinatorsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6979:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6980:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6980:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6981:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsOntoLClassCrossReference_6_2_1_0()); 
            // InternalOntoL.g:6982:3: ( ruleQualifiedName )
            // InternalOntoL.g:6983:4: ruleQualifiedName
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
    // InternalOntoL.g:6994:1: rule__HOClass__CategorizationTypeAssignment_7_0_0 : ( ruleCategorizationType ) ;
    public final void rule__HOClass__CategorizationTypeAssignment_7_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6998:1: ( ( ruleCategorizationType ) )
            // InternalOntoL.g:6999:2: ( ruleCategorizationType )
            {
            // InternalOntoL.g:6999:2: ( ruleCategorizationType )
            // InternalOntoL.g:7000:3: ruleCategorizationType
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
    // InternalOntoL.g:7009:1: rule__HOClass__BasetypeAssignment_7_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__BasetypeAssignment_7_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7013:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7014:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7014:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7015:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getBasetypeOntoLClassCrossReference_7_0_1_0()); 
            // InternalOntoL.g:7016:3: ( ruleQualifiedName )
            // InternalOntoL.g:7017:4: ruleQualifiedName
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
    // InternalOntoL.g:7028:1: rule__HOClass__PowertypeOfAssignment_7_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__PowertypeOfAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7032:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7033:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7033:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7034:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getPowertypeOfOntoLClassCrossReference_7_1_1_0()); 
            // InternalOntoL.g:7035:3: ( ruleQualifiedName )
            // InternalOntoL.g:7036:4: ruleQualifiedName
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
    // InternalOntoL.g:7047:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7051:1: ( ( RULE_ID ) )
            // InternalOntoL.g:7052:2: ( RULE_ID )
            {
            // InternalOntoL.g:7052:2: ( RULE_ID )
            // InternalOntoL.g:7053:3: RULE_ID
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
    // InternalOntoL.g:7062:1: rule__Attribute__LowerBoundAssignment_3_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__Attribute__LowerBoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7066:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:7067:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:7067:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:7068:3: ruleELEMENTBOUND
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
    // InternalOntoL.g:7077:1: rule__Attribute__UpperBoundAssignment_3_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__Attribute__UpperBoundAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7081:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:7082:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:7082:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:7083:3: ruleELEMENTBOUND
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
    // InternalOntoL.g:7092:1: rule__Attribute__PropertyClassAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__PropertyClassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7096:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7097:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7097:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7098:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getPropertyClassOntoLClassCrossReference_4_0()); 
            // InternalOntoL.g:7099:3: ( ruleQualifiedName )
            // InternalOntoL.g:7100:4: ruleQualifiedName
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
    // InternalOntoL.g:7111:1: rule__Attribute__SubsetOfAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__SubsetOfAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7115:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7116:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7116:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7117:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_1_0()); 
            // InternalOntoL.g:7118:3: ( ruleQualifiedName )
            // InternalOntoL.g:7119:4: ruleQualifiedName
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
    // InternalOntoL.g:7130:1: rule__Attribute__SubsetOfAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__SubsetOfAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7134:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7135:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7135:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7136:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_2_1_0()); 
            // InternalOntoL.g:7137:3: ( ruleQualifiedName )
            // InternalOntoL.g:7138:4: ruleQualifiedName
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


    // $ANTLR start "rule__Attribute__OppositeToAssignment_6_1"
    // InternalOntoL.g:7149:1: rule__Attribute__OppositeToAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__OppositeToAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7153:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7154:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7154:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7155:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getOppositeToAttributeCrossReference_6_1_0()); 
            // InternalOntoL.g:7156:3: ( ruleQualifiedName )
            // InternalOntoL.g:7157:4: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAccess().getOppositeToAttributeQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getOppositeToAttributeQualifiedNameParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getOppositeToAttributeCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__OppositeToAssignment_6_1"


    // $ANTLR start "rule__Reference__NameAssignment_1"
    // InternalOntoL.g:7168:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7172:1: ( ( RULE_ID ) )
            // InternalOntoL.g:7173:2: ( RULE_ID )
            {
            // InternalOntoL.g:7173:2: ( RULE_ID )
            // InternalOntoL.g:7174:3: RULE_ID
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
    // InternalOntoL.g:7183:1: rule__Reference__LowerBoundAssignment_3_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__Reference__LowerBoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7187:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:7188:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:7188:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:7189:3: ruleELEMENTBOUND
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
    // InternalOntoL.g:7198:1: rule__Reference__UpperBoundAssignment_3_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__Reference__UpperBoundAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7202:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:7203:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:7203:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:7204:3: ruleELEMENTBOUND
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
    // InternalOntoL.g:7213:1: rule__Reference__PropertyClassAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__PropertyClassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7217:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7218:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7218:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7219:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getPropertyClassOntoLClassCrossReference_4_0()); 
            // InternalOntoL.g:7220:3: ( ruleQualifiedName )
            // InternalOntoL.g:7221:4: ruleQualifiedName
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
    // InternalOntoL.g:7232:1: rule__Reference__SubsetOfAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__SubsetOfAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7236:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7237:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7237:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7238:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_1_0()); 
            // InternalOntoL.g:7239:3: ( ruleQualifiedName )
            // InternalOntoL.g:7240:4: ruleQualifiedName
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
    // InternalOntoL.g:7251:1: rule__Reference__SubsetOfAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__SubsetOfAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7255:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7256:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7256:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7257:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_2_1_0()); 
            // InternalOntoL.g:7258:3: ( ruleQualifiedName )
            // InternalOntoL.g:7259:4: ruleQualifiedName
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
    // InternalOntoL.g:7270:1: rule__Reference__OppositeToAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__OppositeToAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7274:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7275:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7275:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7276:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getOppositeToReferenceCrossReference_6_1_0()); 
            // InternalOntoL.g:7277:3: ( ruleQualifiedName )
            // InternalOntoL.g:7278:4: ruleQualifiedName
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
    // InternalOntoL.g:7289:1: rule__AttributeAssignment__AttributeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AttributeAssignment__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7293:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7294:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7294:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7295:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalOntoL.g:7296:3: ( ruleQualifiedName )
            // InternalOntoL.g:7297:4: ruleQualifiedName
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
    // InternalOntoL.g:7308:1: rule__AttributeAssignment__AssignmentsAssignment_3_0 : ( ruleDataValue ) ;
    public final void rule__AttributeAssignment__AssignmentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7312:1: ( ( ruleDataValue ) )
            // InternalOntoL.g:7313:2: ( ruleDataValue )
            {
            // InternalOntoL.g:7313:2: ( ruleDataValue )
            // InternalOntoL.g:7314:3: ruleDataValue
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
    // InternalOntoL.g:7323:1: rule__AttributeAssignment__AssignmentsAssignment_3_1_1 : ( ruleDataValue ) ;
    public final void rule__AttributeAssignment__AssignmentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7327:1: ( ( ruleDataValue ) )
            // InternalOntoL.g:7328:2: ( ruleDataValue )
            {
            // InternalOntoL.g:7328:2: ( ruleDataValue )
            // InternalOntoL.g:7329:3: ruleDataValue
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
    // InternalOntoL.g:7338:1: rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1 : ( ruleDataValue ) ;
    public final void rule__AttributeAssignment__AssignmentsAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7342:1: ( ( ruleDataValue ) )
            // InternalOntoL.g:7343:2: ( ruleDataValue )
            {
            // InternalOntoL.g:7343:2: ( ruleDataValue )
            // InternalOntoL.g:7344:3: ruleDataValue
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
    // InternalOntoL.g:7353:1: rule__ReferenceAssignment__ReferenceAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7357:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7358:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7358:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7359:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getReferenceReferenceCrossReference_1_0()); 
            // InternalOntoL.g:7360:3: ( ruleQualifiedName )
            // InternalOntoL.g:7361:4: ruleQualifiedName
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
    // InternalOntoL.g:7372:1: rule__ReferenceAssignment__AssignmentsAssignment_3_0 : ( ruleReferenceValue ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7376:1: ( ( ruleReferenceValue ) )
            // InternalOntoL.g:7377:2: ( ruleReferenceValue )
            {
            // InternalOntoL.g:7377:2: ( ruleReferenceValue )
            // InternalOntoL.g:7378:3: ruleReferenceValue
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
    // InternalOntoL.g:7387:1: rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 : ( ruleReferenceValue ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7391:1: ( ( ruleReferenceValue ) )
            // InternalOntoL.g:7392:2: ( ruleReferenceValue )
            {
            // InternalOntoL.g:7392:2: ( ruleReferenceValue )
            // InternalOntoL.g:7393:3: ruleReferenceValue
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
    // InternalOntoL.g:7402:1: rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 : ( ruleReferenceValue ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7406:1: ( ( ruleReferenceValue ) )
            // InternalOntoL.g:7407:2: ( ruleReferenceValue )
            {
            // InternalOntoL.g:7407:2: ( ruleReferenceValue )
            // InternalOntoL.g:7408:3: ruleReferenceValue
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
    // InternalOntoL.g:7417:1: rule__ReferenceValue__ValueAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7421:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7422:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7422:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7423:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceValueAccess().getValueEntityDeclarationCrossReference_0()); 
            // InternalOntoL.g:7424:3: ( ruleQualifiedName )
            // InternalOntoL.g:7425:4: ruleQualifiedName
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
    // InternalOntoL.g:7436:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7440:1: ( ( RULE_STRING ) )
            // InternalOntoL.g:7441:2: ( RULE_STRING )
            {
            // InternalOntoL.g:7441:2: ( RULE_STRING )
            // InternalOntoL.g:7442:3: RULE_STRING
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
    // InternalOntoL.g:7451:1: rule__NumberValue__ValueAssignment : ( ruleNUMBER ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7455:1: ( ( ruleNUMBER ) )
            // InternalOntoL.g:7456:2: ( ruleNUMBER )
            {
            // InternalOntoL.g:7456:2: ( ruleNUMBER )
            // InternalOntoL.g:7457:3: ruleNUMBER
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
    // InternalOntoL.g:7466:1: rule__BooleanValue__ValueAssignment : ( ruleBOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7470:1: ( ( ruleBOOLEAN ) )
            // InternalOntoL.g:7471:2: ( ruleBOOLEAN )
            {
            // InternalOntoL.g:7471:2: ( ruleBOOLEAN )
            // InternalOntoL.g:7472:3: ruleBOOLEAN
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


    // $ANTLR start "rule__GeneralizationSet__IsDisjointAssignment_0_0_1"
    // InternalOntoL.g:7481:1: rule__GeneralizationSet__IsDisjointAssignment_0_0_1 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7485:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoL.g:7486:2: ( ( 'disjoint' ) )
            {
            // InternalOntoL.g:7486:2: ( ( 'disjoint' ) )
            // InternalOntoL.g:7487:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_1_0()); 
            // InternalOntoL.g:7488:3: ( 'disjoint' )
            // InternalOntoL.g:7489:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_1_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__IsDisjointAssignment_0_0_1"


    // $ANTLR start "rule__GeneralizationSet__IsCompleteAssignment_0_1_1"
    // InternalOntoL.g:7500:1: rule__GeneralizationSet__IsCompleteAssignment_0_1_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7504:1: ( ( ( 'complete' ) ) )
            // InternalOntoL.g:7505:2: ( ( 'complete' ) )
            {
            // InternalOntoL.g:7505:2: ( ( 'complete' ) )
            // InternalOntoL.g:7506:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_1_0()); 
            // InternalOntoL.g:7507:3: ( 'complete' )
            // InternalOntoL.g:7508:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_1_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__IsCompleteAssignment_0_1_1"


    // $ANTLR start "rule__GeneralizationSet__IsDisjointAssignment_0_2_1"
    // InternalOntoL.g:7519:1: rule__GeneralizationSet__IsDisjointAssignment_0_2_1 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7523:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoL.g:7524:2: ( ( 'disjoint' ) )
            {
            // InternalOntoL.g:7524:2: ( ( 'disjoint' ) )
            // InternalOntoL.g:7525:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_2_1_0()); 
            // InternalOntoL.g:7526:3: ( 'disjoint' )
            // InternalOntoL.g:7527:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_2_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_2_1_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__IsDisjointAssignment_0_2_1"


    // $ANTLR start "rule__GeneralizationSet__IsCompleteAssignment_0_2_3"
    // InternalOntoL.g:7538:1: rule__GeneralizationSet__IsCompleteAssignment_0_2_3 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7542:1: ( ( ( 'complete' ) ) )
            // InternalOntoL.g:7543:2: ( ( 'complete' ) )
            {
            // InternalOntoL.g:7543:2: ( ( 'complete' ) )
            // InternalOntoL.g:7544:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_2_3_0()); 
            // InternalOntoL.g:7545:3: ( 'complete' )
            // InternalOntoL.g:7546:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_2_3_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_2_3_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__IsCompleteAssignment_0_2_3"


    // $ANTLR start "rule__GeneralizationSet__IsCompleteAssignment_0_3_1"
    // InternalOntoL.g:7557:1: rule__GeneralizationSet__IsCompleteAssignment_0_3_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7561:1: ( ( ( 'complete' ) ) )
            // InternalOntoL.g:7562:2: ( ( 'complete' ) )
            {
            // InternalOntoL.g:7562:2: ( ( 'complete' ) )
            // InternalOntoL.g:7563:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_3_1_0()); 
            // InternalOntoL.g:7564:3: ( 'complete' )
            // InternalOntoL.g:7565:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_3_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_3_1_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__IsCompleteAssignment_0_3_1"


    // $ANTLR start "rule__GeneralizationSet__IsDisjointAssignment_0_3_3"
    // InternalOntoL.g:7576:1: rule__GeneralizationSet__IsDisjointAssignment_0_3_3 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7580:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoL.g:7581:2: ( ( 'disjoint' ) )
            {
            // InternalOntoL.g:7581:2: ( ( 'disjoint' ) )
            // InternalOntoL.g:7582:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_3_3_0()); 
            // InternalOntoL.g:7583:3: ( 'disjoint' )
            // InternalOntoL.g:7584:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_3_3_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_3_3_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__IsDisjointAssignment_0_3_3"


    // $ANTLR start "rule__GeneralizationSet__NameAssignment_2"
    // InternalOntoL.g:7595:1: rule__GeneralizationSet__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GeneralizationSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7599:1: ( ( RULE_ID ) )
            // InternalOntoL.g:7600:2: ( RULE_ID )
            {
            // InternalOntoL.g:7600:2: ( RULE_ID )
            // InternalOntoL.g:7601:3: RULE_ID
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
    // InternalOntoL.g:7610:1: rule__GeneralizationSet__GeneralAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__GeneralAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7614:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7615:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7615:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7616:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralOntoLClassCrossReference_4_0()); 
            // InternalOntoL.g:7617:3: ( ruleQualifiedName )
            // InternalOntoL.g:7618:4: ruleQualifiedName
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
    // InternalOntoL.g:7629:1: rule__GeneralizationSet__CategorizerAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__CategorizerAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7633:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7634:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7634:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7635:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerOntoLClassCrossReference_5_1_0()); 
            // InternalOntoL.g:7636:3: ( ruleQualifiedName )
            // InternalOntoL.g:7637:4: ruleQualifiedName
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
    // InternalOntoL.g:7648:1: rule__GeneralizationSet__SpecificsAssignment_7 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__SpecificsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7652:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7653:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7653:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7654:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsOntoLClassCrossReference_7_0()); 
            // InternalOntoL.g:7655:3: ( ruleQualifiedName )
            // InternalOntoL.g:7656:4: ruleQualifiedName
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
    // InternalOntoL.g:7667:1: rule__GeneralizationSet__SpecificsAssignment_8_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__SpecificsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:7671:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:7672:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:7672:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:7673:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsOntoLClassCrossReference_8_1_0()); 
            // InternalOntoL.g:7674:3: ( ruleQualifiedName )
            // InternalOntoL.g:7675:4: ruleQualifiedName
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0002400C67100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0002400C67000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000041000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000041000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000038803C000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000C60000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000300000083050L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000300000003050L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002400C67000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020000000000000L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'true'", "'false'", "'categorizes'", "'completecategorizes'", "'disjointcategorizes'", "'partitions'", "'module'", "'{'", "'}'", "';'", "'.'", "'.*'", "'import'", "'individual'", "':'", "','", "'set'", "'class'", "'specializes'", "'subordinatedto'", "'ispowertypeof'", "'foclass'", "'hoclass'", "'order'", "'['", "'..'", "']'", "'subsets'", "'isoppositeto'", "'='", "'('", "')'", "'-'", "'none'", "'genset'", "'general'", "'specifics'", "'categorizer'", "'disjoint'", "'complete'"
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


    // $ANTLR start "entryRuleSet"
    // InternalOntoL.g:228:1: entryRuleSet : ruleSet EOF ;
    public final void entryRuleSet() throws RecognitionException {
        try {
            // InternalOntoL.g:229:1: ( ruleSet EOF )
            // InternalOntoL.g:230:1: ruleSet EOF
            {
             before(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            ruleSet();

            state._fsp--;

             after(grammarAccess.getSetRule()); 
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
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalOntoL.g:237:1: ruleSet : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:241:2: ( ( ( rule__Set__Group__0 ) ) )
            // InternalOntoL.g:242:2: ( ( rule__Set__Group__0 ) )
            {
            // InternalOntoL.g:242:2: ( ( rule__Set__Group__0 ) )
            // InternalOntoL.g:243:3: ( rule__Set__Group__0 )
            {
             before(grammarAccess.getSetAccess().getGroup()); 
            // InternalOntoL.g:244:3: ( rule__Set__Group__0 )
            // InternalOntoL.g:244:4: rule__Set__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleClass"
    // InternalOntoL.g:253:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalOntoL.g:254:1: ( ruleClass EOF )
            // InternalOntoL.g:255:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalOntoL.g:262:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:266:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalOntoL.g:267:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalOntoL.g:267:2: ( ( rule__Class__Group__0 ) )
            // InternalOntoL.g:268:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalOntoL.g:269:3: ( rule__Class__Group__0 )
            // InternalOntoL.g:269:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleWClass"
    // InternalOntoL.g:278:1: entryRuleWClass : ruleWClass EOF ;
    public final void entryRuleWClass() throws RecognitionException {
        try {
            // InternalOntoL.g:279:1: ( ruleWClass EOF )
            // InternalOntoL.g:280:1: ruleWClass EOF
            {
             before(grammarAccess.getWClassRule()); 
            pushFollow(FOLLOW_1);
            ruleWClass();

            state._fsp--;

             after(grammarAccess.getWClassRule()); 
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
    // $ANTLR end "entryRuleWClass"


    // $ANTLR start "ruleWClass"
    // InternalOntoL.g:287:1: ruleWClass : ( ( rule__WClass__Group__0 ) ) ;
    public final void ruleWClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:291:2: ( ( ( rule__WClass__Group__0 ) ) )
            // InternalOntoL.g:292:2: ( ( rule__WClass__Group__0 ) )
            {
            // InternalOntoL.g:292:2: ( ( rule__WClass__Group__0 ) )
            // InternalOntoL.g:293:3: ( rule__WClass__Group__0 )
            {
             before(grammarAccess.getWClassAccess().getGroup()); 
            // InternalOntoL.g:294:3: ( rule__WClass__Group__0 )
            // InternalOntoL.g:294:4: rule__WClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWClass"


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


    // $ANTLR start "entryRuleProperty"
    // InternalOntoL.g:353:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalOntoL.g:354:1: ( ruleProperty EOF )
            // InternalOntoL.g:355:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalOntoL.g:362:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:366:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalOntoL.g:367:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalOntoL.g:367:2: ( ( rule__Property__Group__0 ) )
            // InternalOntoL.g:368:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalOntoL.g:369:3: ( rule__Property__Group__0 )
            // InternalOntoL.g:369:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


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


    // $ANTLR start "entryRulePropertyAssignment"
    // InternalOntoL.g:403:1: entryRulePropertyAssignment : rulePropertyAssignment EOF ;
    public final void entryRulePropertyAssignment() throws RecognitionException {
        try {
            // InternalOntoL.g:404:1: ( rulePropertyAssignment EOF )
            // InternalOntoL.g:405:1: rulePropertyAssignment EOF
            {
             before(grammarAccess.getPropertyAssignmentRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyAssignment();

            state._fsp--;

             after(grammarAccess.getPropertyAssignmentRule()); 
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
    // $ANTLR end "entryRulePropertyAssignment"


    // $ANTLR start "rulePropertyAssignment"
    // InternalOntoL.g:412:1: rulePropertyAssignment : ( ( rule__PropertyAssignment__Group__0 ) ) ;
    public final void rulePropertyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:416:2: ( ( ( rule__PropertyAssignment__Group__0 ) ) )
            // InternalOntoL.g:417:2: ( ( rule__PropertyAssignment__Group__0 ) )
            {
            // InternalOntoL.g:417:2: ( ( rule__PropertyAssignment__Group__0 ) )
            // InternalOntoL.g:418:3: ( rule__PropertyAssignment__Group__0 )
            {
             before(grammarAccess.getPropertyAssignmentAccess().getGroup()); 
            // InternalOntoL.g:419:3: ( rule__PropertyAssignment__Group__0 )
            // InternalOntoL.g:419:4: rule__PropertyAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyAssignment"


    // $ANTLR start "entryRuleValue"
    // InternalOntoL.g:428:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalOntoL.g:429:1: ( ruleValue EOF )
            // InternalOntoL.g:430:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalOntoL.g:437:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:441:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalOntoL.g:442:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalOntoL.g:442:2: ( ( rule__Value__Alternatives ) )
            // InternalOntoL.g:443:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalOntoL.g:444:3: ( rule__Value__Alternatives )
            // InternalOntoL.g:444:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleReferenceValue"
    // InternalOntoL.g:453:1: entryRuleReferenceValue : ruleReferenceValue EOF ;
    public final void entryRuleReferenceValue() throws RecognitionException {
        try {
            // InternalOntoL.g:454:1: ( ruleReferenceValue EOF )
            // InternalOntoL.g:455:1: ruleReferenceValue EOF
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
    // InternalOntoL.g:462:1: ruleReferenceValue : ( ( rule__ReferenceValue__ValueAssignment ) ) ;
    public final void ruleReferenceValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:466:2: ( ( ( rule__ReferenceValue__ValueAssignment ) ) )
            // InternalOntoL.g:467:2: ( ( rule__ReferenceValue__ValueAssignment ) )
            {
            // InternalOntoL.g:467:2: ( ( rule__ReferenceValue__ValueAssignment ) )
            // InternalOntoL.g:468:3: ( rule__ReferenceValue__ValueAssignment )
            {
             before(grammarAccess.getReferenceValueAccess().getValueAssignment()); 
            // InternalOntoL.g:469:3: ( rule__ReferenceValue__ValueAssignment )
            // InternalOntoL.g:469:4: rule__ReferenceValue__ValueAssignment
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


    // $ANTLR start "entryRuleListValue"
    // InternalOntoL.g:478:1: entryRuleListValue : ruleListValue EOF ;
    public final void entryRuleListValue() throws RecognitionException {
        try {
            // InternalOntoL.g:479:1: ( ruleListValue EOF )
            // InternalOntoL.g:480:1: ruleListValue EOF
            {
             before(grammarAccess.getListValueRule()); 
            pushFollow(FOLLOW_1);
            ruleListValue();

            state._fsp--;

             after(grammarAccess.getListValueRule()); 
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
    // $ANTLR end "entryRuleListValue"


    // $ANTLR start "ruleListValue"
    // InternalOntoL.g:487:1: ruleListValue : ( ( rule__ListValue__Group__0 ) ) ;
    public final void ruleListValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:491:2: ( ( ( rule__ListValue__Group__0 ) ) )
            // InternalOntoL.g:492:2: ( ( rule__ListValue__Group__0 ) )
            {
            // InternalOntoL.g:492:2: ( ( rule__ListValue__Group__0 ) )
            // InternalOntoL.g:493:3: ( rule__ListValue__Group__0 )
            {
             before(grammarAccess.getListValueAccess().getGroup()); 
            // InternalOntoL.g:494:3: ( rule__ListValue__Group__0 )
            // InternalOntoL.g:494:4: rule__ListValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListValue"


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


    // $ANTLR start "rule__ModelElement__Alternatives_0"
    // InternalOntoL.g:693:1: rule__ModelElement__Alternatives_0 : ( ( ruleImport ) | ( ruleEntityDeclaration ) | ( ruleGeneralizationSet ) );
    public final void rule__ModelElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:697:1: ( ( ruleImport ) | ( ruleEntityDeclaration ) | ( ruleGeneralizationSet ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 25:
            case 28:
            case 29:
            case 33:
            case 34:
                {
                alt1=2;
                }
                break;
            case 42:
            case 46:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalOntoL.g:698:2: ( ruleImport )
                    {
                    // InternalOntoL.g:698:2: ( ruleImport )
                    // InternalOntoL.g:699:3: ruleImport
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
                    // InternalOntoL.g:704:2: ( ruleEntityDeclaration )
                    {
                    // InternalOntoL.g:704:2: ( ruleEntityDeclaration )
                    // InternalOntoL.g:705:3: ruleEntityDeclaration
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
                    // InternalOntoL.g:710:2: ( ruleGeneralizationSet )
                    {
                    // InternalOntoL.g:710:2: ( ruleGeneralizationSet )
                    // InternalOntoL.g:711:3: ruleGeneralizationSet
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
    // InternalOntoL.g:720:1: rule__EntityDeclaration__Alternatives : ( ( ruleClass ) | ( ruleIndividual ) | ( ruleSet ) );
    public final void rule__EntityDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:724:1: ( ( ruleClass ) | ( ruleIndividual ) | ( ruleSet ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 29:
            case 33:
            case 34:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 28:
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
                    // InternalOntoL.g:725:2: ( ruleClass )
                    {
                    // InternalOntoL.g:725:2: ( ruleClass )
                    // InternalOntoL.g:726:3: ruleClass
                    {
                     before(grammarAccess.getEntityDeclarationAccess().getClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getEntityDeclarationAccess().getClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:731:2: ( ruleIndividual )
                    {
                    // InternalOntoL.g:731:2: ( ruleIndividual )
                    // InternalOntoL.g:732:3: ruleIndividual
                    {
                     before(grammarAccess.getEntityDeclarationAccess().getIndividualParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIndividual();

                    state._fsp--;

                     after(grammarAccess.getEntityDeclarationAccess().getIndividualParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:737:2: ( ruleSet )
                    {
                    // InternalOntoL.g:737:2: ( ruleSet )
                    // InternalOntoL.g:738:3: ruleSet
                    {
                     before(grammarAccess.getEntityDeclarationAccess().getSetParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSet();

                    state._fsp--;

                     after(grammarAccess.getEntityDeclarationAccess().getSetParserRuleCall_2()); 

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


    // $ANTLR start "rule__Class__Alternatives_0"
    // InternalOntoL.g:747:1: rule__Class__Alternatives_0 : ( ( ruleWClass ) | ( ruleHOClass ) | ( ruleFOClass ) );
    public final void rule__Class__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:751:1: ( ( ruleWClass ) | ( ruleHOClass ) | ( ruleFOClass ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt3=1;
                }
                break;
            case 34:
                {
                alt3=2;
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalOntoL.g:752:2: ( ruleWClass )
                    {
                    // InternalOntoL.g:752:2: ( ruleWClass )
                    // InternalOntoL.g:753:3: ruleWClass
                    {
                     before(grammarAccess.getClassAccess().getWClassParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWClass();

                    state._fsp--;

                     after(grammarAccess.getClassAccess().getWClassParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:758:2: ( ruleHOClass )
                    {
                    // InternalOntoL.g:758:2: ( ruleHOClass )
                    // InternalOntoL.g:759:3: ruleHOClass
                    {
                     before(grammarAccess.getClassAccess().getHOClassParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleHOClass();

                    state._fsp--;

                     after(grammarAccess.getClassAccess().getHOClassParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:764:2: ( ruleFOClass )
                    {
                    // InternalOntoL.g:764:2: ( ruleFOClass )
                    // InternalOntoL.g:765:3: ruleFOClass
                    {
                     before(grammarAccess.getClassAccess().getFOClassParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFOClass();

                    state._fsp--;

                     after(grammarAccess.getClassAccess().getFOClassParserRuleCall_0_2()); 

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
    // $ANTLR end "rule__Class__Alternatives_0"


    // $ANTLR start "rule__Class__Alternatives_1_1"
    // InternalOntoL.g:774:1: rule__Class__Alternatives_1_1 : ( ( ( rule__Class__PropsAssignment_1_1_0 ) ) | ( ( rule__Class__PropAssignsAssignment_1_1_1 ) ) );
    public final void rule__Class__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:778:1: ( ( ( rule__Class__PropsAssignment_1_1_0 ) ) | ( ( rule__Class__PropAssignsAssignment_1_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==22||LA4_1==41) ) {
                    alt4=2;
                }
                else if ( (LA4_1==26) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalOntoL.g:779:2: ( ( rule__Class__PropsAssignment_1_1_0 ) )
                    {
                    // InternalOntoL.g:779:2: ( ( rule__Class__PropsAssignment_1_1_0 ) )
                    // InternalOntoL.g:780:3: ( rule__Class__PropsAssignment_1_1_0 )
                    {
                     before(grammarAccess.getClassAccess().getPropsAssignment_1_1_0()); 
                    // InternalOntoL.g:781:3: ( rule__Class__PropsAssignment_1_1_0 )
                    // InternalOntoL.g:781:4: rule__Class__PropsAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__PropsAssignment_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassAccess().getPropsAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:785:2: ( ( rule__Class__PropAssignsAssignment_1_1_1 ) )
                    {
                    // InternalOntoL.g:785:2: ( ( rule__Class__PropAssignsAssignment_1_1_1 ) )
                    // InternalOntoL.g:786:3: ( rule__Class__PropAssignsAssignment_1_1_1 )
                    {
                     before(grammarAccess.getClassAccess().getPropAssignsAssignment_1_1_1()); 
                    // InternalOntoL.g:787:3: ( rule__Class__PropAssignsAssignment_1_1_1 )
                    // InternalOntoL.g:787:4: rule__Class__PropAssignsAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__PropAssignsAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassAccess().getPropAssignsAssignment_1_1_1()); 

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
    // $ANTLR end "rule__Class__Alternatives_1_1"


    // $ANTLR start "rule__WClass__Alternatives_5"
    // InternalOntoL.g:795:1: rule__WClass__Alternatives_5 : ( ( ( rule__WClass__Group_5_0__0 ) ) | ( ( rule__WClass__Group_5_1__0 ) ) );
    public final void rule__WClass__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:799:1: ( ( ( rule__WClass__Group_5_0__0 ) ) | ( ( rule__WClass__Group_5_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=14 && LA5_0<=17)) ) {
                alt5=1;
            }
            else if ( (LA5_0==32) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalOntoL.g:800:2: ( ( rule__WClass__Group_5_0__0 ) )
                    {
                    // InternalOntoL.g:800:2: ( ( rule__WClass__Group_5_0__0 ) )
                    // InternalOntoL.g:801:3: ( rule__WClass__Group_5_0__0 )
                    {
                     before(grammarAccess.getWClassAccess().getGroup_5_0()); 
                    // InternalOntoL.g:802:3: ( rule__WClass__Group_5_0__0 )
                    // InternalOntoL.g:802:4: rule__WClass__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WClass__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWClassAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:806:2: ( ( rule__WClass__Group_5_1__0 ) )
                    {
                    // InternalOntoL.g:806:2: ( ( rule__WClass__Group_5_1__0 ) )
                    // InternalOntoL.g:807:3: ( rule__WClass__Group_5_1__0 )
                    {
                     before(grammarAccess.getWClassAccess().getGroup_5_1()); 
                    // InternalOntoL.g:808:3: ( rule__WClass__Group_5_1__0 )
                    // InternalOntoL.g:808:4: rule__WClass__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WClass__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWClassAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__WClass__Alternatives_5"


    // $ANTLR start "rule__HOClass__Alternatives_7"
    // InternalOntoL.g:816:1: rule__HOClass__Alternatives_7 : ( ( ( rule__HOClass__Group_7_0__0 ) ) | ( ( rule__HOClass__Group_7_1__0 ) ) );
    public final void rule__HOClass__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:820:1: ( ( ( rule__HOClass__Group_7_0__0 ) ) | ( ( rule__HOClass__Group_7_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=14 && LA6_0<=17)) ) {
                alt6=1;
            }
            else if ( (LA6_0==32) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOntoL.g:821:2: ( ( rule__HOClass__Group_7_0__0 ) )
                    {
                    // InternalOntoL.g:821:2: ( ( rule__HOClass__Group_7_0__0 ) )
                    // InternalOntoL.g:822:3: ( rule__HOClass__Group_7_0__0 )
                    {
                     before(grammarAccess.getHOClassAccess().getGroup_7_0()); 
                    // InternalOntoL.g:823:3: ( rule__HOClass__Group_7_0__0 )
                    // InternalOntoL.g:823:4: rule__HOClass__Group_7_0__0
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
                    // InternalOntoL.g:827:2: ( ( rule__HOClass__Group_7_1__0 ) )
                    {
                    // InternalOntoL.g:827:2: ( ( rule__HOClass__Group_7_1__0 ) )
                    // InternalOntoL.g:828:3: ( rule__HOClass__Group_7_1__0 )
                    {
                     before(grammarAccess.getHOClassAccess().getGroup_7_1()); 
                    // InternalOntoL.g:829:3: ( rule__HOClass__Group_7_1__0 )
                    // InternalOntoL.g:829:4: rule__HOClass__Group_7_1__0
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
    // InternalOntoL.g:837:1: rule__ELEMENTBOUND__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__ELEMENTBOUND__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:841:1: ( ( '*' ) | ( RULE_INT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntoL.g:842:2: ( '*' )
                    {
                    // InternalOntoL.g:842:2: ( '*' )
                    // InternalOntoL.g:843:3: '*'
                    {
                     before(grammarAccess.getELEMENTBOUNDAccess().getAsteriskKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getELEMENTBOUNDAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:848:2: ( RULE_INT )
                    {
                    // InternalOntoL.g:848:2: ( RULE_INT )
                    // InternalOntoL.g:849:3: RULE_INT
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


    // $ANTLR start "rule__Value__Alternatives"
    // InternalOntoL.g:858:1: rule__Value__Alternatives : ( ( ruleReferenceValue ) | ( ruleListValue ) | ( ruleStringValue ) | ( ruleNumberValue ) | ( ruleBooleanValue ) | ( ruleNoneValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:862:1: ( ( ruleReferenceValue ) | ( ruleListValue ) | ( ruleStringValue ) | ( ruleNumberValue ) | ( ruleBooleanValue ) | ( ruleNoneValue ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 42:
                {
                alt8=2;
                }
                break;
            case RULE_STRING:
                {
                alt8=3;
                }
                break;
            case RULE_INT:
            case 44:
                {
                alt8=4;
                }
                break;
            case 12:
            case 13:
                {
                alt8=5;
                }
                break;
            case 45:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalOntoL.g:863:2: ( ruleReferenceValue )
                    {
                    // InternalOntoL.g:863:2: ( ruleReferenceValue )
                    // InternalOntoL.g:864:3: ruleReferenceValue
                    {
                     before(grammarAccess.getValueAccess().getReferenceValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleReferenceValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getReferenceValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:869:2: ( ruleListValue )
                    {
                    // InternalOntoL.g:869:2: ( ruleListValue )
                    // InternalOntoL.g:870:3: ruleListValue
                    {
                     before(grammarAccess.getValueAccess().getListValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleListValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getListValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:875:2: ( ruleStringValue )
                    {
                    // InternalOntoL.g:875:2: ( ruleStringValue )
                    // InternalOntoL.g:876:3: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getStringValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStringValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:881:2: ( ruleNumberValue )
                    {
                    // InternalOntoL.g:881:2: ( ruleNumberValue )
                    // InternalOntoL.g:882:3: ruleNumberValue
                    {
                     before(grammarAccess.getValueAccess().getNumberValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNumberValueParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOntoL.g:887:2: ( ruleBooleanValue )
                    {
                    // InternalOntoL.g:887:2: ( ruleBooleanValue )
                    // InternalOntoL.g:888:3: ruleBooleanValue
                    {
                     before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOntoL.g:893:2: ( ruleNoneValue )
                    {
                    // InternalOntoL.g:893:2: ( ruleNoneValue )
                    // InternalOntoL.g:894:3: ruleNoneValue
                    {
                     before(grammarAccess.getValueAccess().getNoneValueParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleNoneValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNoneValueParserRuleCall_5()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__BOOLEAN__Alternatives"
    // InternalOntoL.g:903:1: rule__BOOLEAN__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:907:1: ( ( 'true' ) | ( 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            else if ( (LA9_0==13) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntoL.g:908:2: ( 'true' )
                    {
                    // InternalOntoL.g:908:2: ( 'true' )
                    // InternalOntoL.g:909:3: 'true'
                    {
                     before(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:914:2: ( 'false' )
                    {
                    // InternalOntoL.g:914:2: ( 'false' )
                    // InternalOntoL.g:915:3: 'false'
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
    // InternalOntoL.g:924:1: rule__GeneralizationSet__Alternatives_0 : ( ( ( rule__GeneralizationSet__Group_0_0__0 ) ) | ( ( rule__GeneralizationSet__Group_0_1__0 ) ) | ( ( rule__GeneralizationSet__Group_0_2__0 ) ) | ( ( rule__GeneralizationSet__Group_0_3__0 ) ) );
    public final void rule__GeneralizationSet__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:928:1: ( ( ( rule__GeneralizationSet__Group_0_0__0 ) ) | ( ( rule__GeneralizationSet__Group_0_1__0 ) ) | ( ( rule__GeneralizationSet__Group_0_2__0 ) ) | ( ( rule__GeneralizationSet__Group_0_3__0 ) ) )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==42) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==50) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==27) ) {
                        alt10=3;
                    }
                    else if ( (LA10_2==43) ) {
                        alt10=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA10_1==51) ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==27) ) {
                        alt10=4;
                    }
                    else if ( (LA10_3==43) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntoL.g:929:2: ( ( rule__GeneralizationSet__Group_0_0__0 ) )
                    {
                    // InternalOntoL.g:929:2: ( ( rule__GeneralizationSet__Group_0_0__0 ) )
                    // InternalOntoL.g:930:3: ( rule__GeneralizationSet__Group_0_0__0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getGroup_0_0()); 
                    // InternalOntoL.g:931:3: ( rule__GeneralizationSet__Group_0_0__0 )
                    // InternalOntoL.g:931:4: rule__GeneralizationSet__Group_0_0__0
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
                    // InternalOntoL.g:935:2: ( ( rule__GeneralizationSet__Group_0_1__0 ) )
                    {
                    // InternalOntoL.g:935:2: ( ( rule__GeneralizationSet__Group_0_1__0 ) )
                    // InternalOntoL.g:936:3: ( rule__GeneralizationSet__Group_0_1__0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getGroup_0_1()); 
                    // InternalOntoL.g:937:3: ( rule__GeneralizationSet__Group_0_1__0 )
                    // InternalOntoL.g:937:4: rule__GeneralizationSet__Group_0_1__0
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
                    // InternalOntoL.g:941:2: ( ( rule__GeneralizationSet__Group_0_2__0 ) )
                    {
                    // InternalOntoL.g:941:2: ( ( rule__GeneralizationSet__Group_0_2__0 ) )
                    // InternalOntoL.g:942:3: ( rule__GeneralizationSet__Group_0_2__0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getGroup_0_2()); 
                    // InternalOntoL.g:943:3: ( rule__GeneralizationSet__Group_0_2__0 )
                    // InternalOntoL.g:943:4: rule__GeneralizationSet__Group_0_2__0
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
                    // InternalOntoL.g:947:2: ( ( rule__GeneralizationSet__Group_0_3__0 ) )
                    {
                    // InternalOntoL.g:947:2: ( ( rule__GeneralizationSet__Group_0_3__0 ) )
                    // InternalOntoL.g:948:3: ( rule__GeneralizationSet__Group_0_3__0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getGroup_0_3()); 
                    // InternalOntoL.g:949:3: ( rule__GeneralizationSet__Group_0_3__0 )
                    // InternalOntoL.g:949:4: rule__GeneralizationSet__Group_0_3__0
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
    // InternalOntoL.g:957:1: rule__CategorizationType__Alternatives : ( ( ( 'categorizes' ) ) | ( ( 'completecategorizes' ) ) | ( ( 'disjointcategorizes' ) ) | ( ( 'partitions' ) ) );
    public final void rule__CategorizationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:961:1: ( ( ( 'categorizes' ) ) | ( ( 'completecategorizes' ) ) | ( ( 'disjointcategorizes' ) ) | ( ( 'partitions' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt11=1;
                }
                break;
            case 15:
                {
                alt11=2;
                }
                break;
            case 16:
                {
                alt11=3;
                }
                break;
            case 17:
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
                    // InternalOntoL.g:962:2: ( ( 'categorizes' ) )
                    {
                    // InternalOntoL.g:962:2: ( ( 'categorizes' ) )
                    // InternalOntoL.g:963:3: ( 'categorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0()); 
                    // InternalOntoL.g:964:3: ( 'categorizes' )
                    // InternalOntoL.g:964:4: 'categorizes'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:968:2: ( ( 'completecategorizes' ) )
                    {
                    // InternalOntoL.g:968:2: ( ( 'completecategorizes' ) )
                    // InternalOntoL.g:969:3: ( 'completecategorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1()); 
                    // InternalOntoL.g:970:3: ( 'completecategorizes' )
                    // InternalOntoL.g:970:4: 'completecategorizes'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:974:2: ( ( 'disjointcategorizes' ) )
                    {
                    // InternalOntoL.g:974:2: ( ( 'disjointcategorizes' ) )
                    // InternalOntoL.g:975:3: ( 'disjointcategorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2()); 
                    // InternalOntoL.g:976:3: ( 'disjointcategorizes' )
                    // InternalOntoL.g:976:4: 'disjointcategorizes'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:980:2: ( ( 'partitions' ) )
                    {
                    // InternalOntoL.g:980:2: ( ( 'partitions' ) )
                    // InternalOntoL.g:981:3: ( 'partitions' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getPARTITIONEREnumLiteralDeclaration_3()); 
                    // InternalOntoL.g:982:3: ( 'partitions' )
                    // InternalOntoL.g:982:4: 'partitions'
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
    // InternalOntoL.g:990:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:994:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalOntoL.g:995:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalOntoL.g:1002:1: rule__Model__Group__0__Impl : ( 'module' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1006:1: ( ( 'module' ) )
            // InternalOntoL.g:1007:1: ( 'module' )
            {
            // InternalOntoL.g:1007:1: ( 'module' )
            // InternalOntoL.g:1008:2: 'module'
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
    // InternalOntoL.g:1017:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1021:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalOntoL.g:1022:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalOntoL.g:1029:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1033:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalOntoL.g:1034:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalOntoL.g:1034:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalOntoL.g:1035:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalOntoL.g:1036:2: ( rule__Model__NameAssignment_1 )
            // InternalOntoL.g:1036:3: rule__Model__NameAssignment_1
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
    // InternalOntoL.g:1044:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1048:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalOntoL.g:1049:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalOntoL.g:1056:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1060:1: ( ( '{' ) )
            // InternalOntoL.g:1061:1: ( '{' )
            {
            // InternalOntoL.g:1061:1: ( '{' )
            // InternalOntoL.g:1062:2: '{'
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
    // InternalOntoL.g:1071:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1075:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalOntoL.g:1076:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalOntoL.g:1083:1: rule__Model__Group__3__Impl : ( ( rule__Model__ElementsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1087:1: ( ( ( rule__Model__ElementsAssignment_3 )* ) )
            // InternalOntoL.g:1088:1: ( ( rule__Model__ElementsAssignment_3 )* )
            {
            // InternalOntoL.g:1088:1: ( ( rule__Model__ElementsAssignment_3 )* )
            // InternalOntoL.g:1089:2: ( rule__Model__ElementsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3()); 
            // InternalOntoL.g:1090:2: ( rule__Model__ElementsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=24 && LA12_0<=25)||(LA12_0>=28 && LA12_0<=29)||(LA12_0>=33 && LA12_0<=34)||LA12_0==42||LA12_0==46) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOntoL.g:1090:3: rule__Model__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalOntoL.g:1098:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1102:1: ( rule__Model__Group__4__Impl )
            // InternalOntoL.g:1103:2: rule__Model__Group__4__Impl
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
    // InternalOntoL.g:1109:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1113:1: ( ( '}' ) )
            // InternalOntoL.g:1114:1: ( '}' )
            {
            // InternalOntoL.g:1114:1: ( '}' )
            // InternalOntoL.g:1115:2: '}'
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
    // InternalOntoL.g:1125:1: rule__ModelElement__Group__0 : rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 ;
    public final void rule__ModelElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1129:1: ( rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 )
            // InternalOntoL.g:1130:2: rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1
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
    // InternalOntoL.g:1137:1: rule__ModelElement__Group__0__Impl : ( ( rule__ModelElement__Alternatives_0 ) ) ;
    public final void rule__ModelElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1141:1: ( ( ( rule__ModelElement__Alternatives_0 ) ) )
            // InternalOntoL.g:1142:1: ( ( rule__ModelElement__Alternatives_0 ) )
            {
            // InternalOntoL.g:1142:1: ( ( rule__ModelElement__Alternatives_0 ) )
            // InternalOntoL.g:1143:2: ( rule__ModelElement__Alternatives_0 )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives_0()); 
            // InternalOntoL.g:1144:2: ( rule__ModelElement__Alternatives_0 )
            // InternalOntoL.g:1144:3: rule__ModelElement__Alternatives_0
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
    // InternalOntoL.g:1152:1: rule__ModelElement__Group__1 : rule__ModelElement__Group__1__Impl ;
    public final void rule__ModelElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1156:1: ( rule__ModelElement__Group__1__Impl )
            // InternalOntoL.g:1157:2: rule__ModelElement__Group__1__Impl
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
    // InternalOntoL.g:1163:1: rule__ModelElement__Group__1__Impl : ( ';' ) ;
    public final void rule__ModelElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1167:1: ( ( ';' ) )
            // InternalOntoL.g:1168:1: ( ';' )
            {
            // InternalOntoL.g:1168:1: ( ';' )
            // InternalOntoL.g:1169:2: ';'
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
    // InternalOntoL.g:1179:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1183:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalOntoL.g:1184:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalOntoL.g:1191:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1195:1: ( ( RULE_ID ) )
            // InternalOntoL.g:1196:1: ( RULE_ID )
            {
            // InternalOntoL.g:1196:1: ( RULE_ID )
            // InternalOntoL.g:1197:2: RULE_ID
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
    // InternalOntoL.g:1206:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1210:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalOntoL.g:1211:2: rule__QualifiedName__Group__1__Impl
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
    // InternalOntoL.g:1217:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1221:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalOntoL.g:1222:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalOntoL.g:1222:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalOntoL.g:1223:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalOntoL.g:1224:2: ( rule__QualifiedName__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOntoL.g:1224:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalOntoL.g:1233:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1237:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalOntoL.g:1238:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalOntoL.g:1245:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1249:1: ( ( '.' ) )
            // InternalOntoL.g:1250:1: ( '.' )
            {
            // InternalOntoL.g:1250:1: ( '.' )
            // InternalOntoL.g:1251:2: '.'
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
    // InternalOntoL.g:1260:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1264:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalOntoL.g:1265:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalOntoL.g:1271:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1275:1: ( ( RULE_ID ) )
            // InternalOntoL.g:1276:1: ( RULE_ID )
            {
            // InternalOntoL.g:1276:1: ( RULE_ID )
            // InternalOntoL.g:1277:2: RULE_ID
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
    // InternalOntoL.g:1287:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1291:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalOntoL.g:1292:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalOntoL.g:1299:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1303:1: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:1304:1: ( ruleQualifiedName )
            {
            // InternalOntoL.g:1304:1: ( ruleQualifiedName )
            // InternalOntoL.g:1305:2: ruleQualifiedName
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
    // InternalOntoL.g:1314:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1318:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalOntoL.g:1319:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalOntoL.g:1325:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1329:1: ( ( ( '.*' )? ) )
            // InternalOntoL.g:1330:1: ( ( '.*' )? )
            {
            // InternalOntoL.g:1330:1: ( ( '.*' )? )
            // InternalOntoL.g:1331:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalOntoL.g:1332:2: ( '.*' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOntoL.g:1332:3: '.*'
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
    // InternalOntoL.g:1341:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1345:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalOntoL.g:1346:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalOntoL.g:1353:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1357:1: ( ( 'import' ) )
            // InternalOntoL.g:1358:1: ( 'import' )
            {
            // InternalOntoL.g:1358:1: ( 'import' )
            // InternalOntoL.g:1359:2: 'import'
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
    // InternalOntoL.g:1368:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1372:1: ( rule__Import__Group__1__Impl )
            // InternalOntoL.g:1373:2: rule__Import__Group__1__Impl
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
    // InternalOntoL.g:1379:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1383:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalOntoL.g:1384:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalOntoL.g:1384:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalOntoL.g:1385:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalOntoL.g:1386:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalOntoL.g:1386:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalOntoL.g:1395:1: rule__Individual__Group__0 : rule__Individual__Group__0__Impl rule__Individual__Group__1 ;
    public final void rule__Individual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1399:1: ( rule__Individual__Group__0__Impl rule__Individual__Group__1 )
            // InternalOntoL.g:1400:2: rule__Individual__Group__0__Impl rule__Individual__Group__1
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
    // InternalOntoL.g:1407:1: rule__Individual__Group__0__Impl : ( 'individual' ) ;
    public final void rule__Individual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1411:1: ( ( 'individual' ) )
            // InternalOntoL.g:1412:1: ( 'individual' )
            {
            // InternalOntoL.g:1412:1: ( 'individual' )
            // InternalOntoL.g:1413:2: 'individual'
            {
             before(grammarAccess.getIndividualAccess().getIndividualKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalOntoL.g:1422:1: rule__Individual__Group__1 : rule__Individual__Group__1__Impl rule__Individual__Group__2 ;
    public final void rule__Individual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1426:1: ( rule__Individual__Group__1__Impl rule__Individual__Group__2 )
            // InternalOntoL.g:1427:2: rule__Individual__Group__1__Impl rule__Individual__Group__2
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
    // InternalOntoL.g:1434:1: rule__Individual__Group__1__Impl : ( ( rule__Individual__NameAssignment_1 ) ) ;
    public final void rule__Individual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1438:1: ( ( ( rule__Individual__NameAssignment_1 ) ) )
            // InternalOntoL.g:1439:1: ( ( rule__Individual__NameAssignment_1 ) )
            {
            // InternalOntoL.g:1439:1: ( ( rule__Individual__NameAssignment_1 ) )
            // InternalOntoL.g:1440:2: ( rule__Individual__NameAssignment_1 )
            {
             before(grammarAccess.getIndividualAccess().getNameAssignment_1()); 
            // InternalOntoL.g:1441:2: ( rule__Individual__NameAssignment_1 )
            // InternalOntoL.g:1441:3: rule__Individual__NameAssignment_1
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
    // InternalOntoL.g:1449:1: rule__Individual__Group__2 : rule__Individual__Group__2__Impl rule__Individual__Group__3 ;
    public final void rule__Individual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1453:1: ( rule__Individual__Group__2__Impl rule__Individual__Group__3 )
            // InternalOntoL.g:1454:2: rule__Individual__Group__2__Impl rule__Individual__Group__3
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
    // InternalOntoL.g:1461:1: rule__Individual__Group__2__Impl : ( ( rule__Individual__Group_2__0 )? ) ;
    public final void rule__Individual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1465:1: ( ( ( rule__Individual__Group_2__0 )? ) )
            // InternalOntoL.g:1466:1: ( ( rule__Individual__Group_2__0 )? )
            {
            // InternalOntoL.g:1466:1: ( ( rule__Individual__Group_2__0 )? )
            // InternalOntoL.g:1467:2: ( rule__Individual__Group_2__0 )?
            {
             before(grammarAccess.getIndividualAccess().getGroup_2()); 
            // InternalOntoL.g:1468:2: ( rule__Individual__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOntoL.g:1468:3: rule__Individual__Group_2__0
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
    // InternalOntoL.g:1476:1: rule__Individual__Group__3 : rule__Individual__Group__3__Impl ;
    public final void rule__Individual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1480:1: ( rule__Individual__Group__3__Impl )
            // InternalOntoL.g:1481:2: rule__Individual__Group__3__Impl
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
    // InternalOntoL.g:1487:1: rule__Individual__Group__3__Impl : ( ( rule__Individual__Group_3__0 )? ) ;
    public final void rule__Individual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1491:1: ( ( ( rule__Individual__Group_3__0 )? ) )
            // InternalOntoL.g:1492:1: ( ( rule__Individual__Group_3__0 )? )
            {
            // InternalOntoL.g:1492:1: ( ( rule__Individual__Group_3__0 )? )
            // InternalOntoL.g:1493:2: ( rule__Individual__Group_3__0 )?
            {
             before(grammarAccess.getIndividualAccess().getGroup_3()); 
            // InternalOntoL.g:1494:2: ( rule__Individual__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOntoL.g:1494:3: rule__Individual__Group_3__0
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
    // InternalOntoL.g:1503:1: rule__Individual__Group_2__0 : rule__Individual__Group_2__0__Impl rule__Individual__Group_2__1 ;
    public final void rule__Individual__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1507:1: ( rule__Individual__Group_2__0__Impl rule__Individual__Group_2__1 )
            // InternalOntoL.g:1508:2: rule__Individual__Group_2__0__Impl rule__Individual__Group_2__1
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
    // InternalOntoL.g:1515:1: rule__Individual__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Individual__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1519:1: ( ( ':' ) )
            // InternalOntoL.g:1520:1: ( ':' )
            {
            // InternalOntoL.g:1520:1: ( ':' )
            // InternalOntoL.g:1521:2: ':'
            {
             before(grammarAccess.getIndividualAccess().getColonKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalOntoL.g:1530:1: rule__Individual__Group_2__1 : rule__Individual__Group_2__1__Impl rule__Individual__Group_2__2 ;
    public final void rule__Individual__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1534:1: ( rule__Individual__Group_2__1__Impl rule__Individual__Group_2__2 )
            // InternalOntoL.g:1535:2: rule__Individual__Group_2__1__Impl rule__Individual__Group_2__2
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
    // InternalOntoL.g:1542:1: rule__Individual__Group_2__1__Impl : ( ( rule__Individual__FixedTypesAssignment_2_1 ) ) ;
    public final void rule__Individual__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1546:1: ( ( ( rule__Individual__FixedTypesAssignment_2_1 ) ) )
            // InternalOntoL.g:1547:1: ( ( rule__Individual__FixedTypesAssignment_2_1 ) )
            {
            // InternalOntoL.g:1547:1: ( ( rule__Individual__FixedTypesAssignment_2_1 ) )
            // InternalOntoL.g:1548:2: ( rule__Individual__FixedTypesAssignment_2_1 )
            {
             before(grammarAccess.getIndividualAccess().getFixedTypesAssignment_2_1()); 
            // InternalOntoL.g:1549:2: ( rule__Individual__FixedTypesAssignment_2_1 )
            // InternalOntoL.g:1549:3: rule__Individual__FixedTypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Individual__FixedTypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIndividualAccess().getFixedTypesAssignment_2_1()); 

            }


            }

        }
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
    // InternalOntoL.g:1557:1: rule__Individual__Group_2__2 : rule__Individual__Group_2__2__Impl ;
    public final void rule__Individual__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1561:1: ( rule__Individual__Group_2__2__Impl )
            // InternalOntoL.g:1562:2: rule__Individual__Group_2__2__Impl
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
    // InternalOntoL.g:1568:1: rule__Individual__Group_2__2__Impl : ( ( rule__Individual__Group_2_2__0 )* ) ;
    public final void rule__Individual__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1572:1: ( ( ( rule__Individual__Group_2_2__0 )* ) )
            // InternalOntoL.g:1573:1: ( ( rule__Individual__Group_2_2__0 )* )
            {
            // InternalOntoL.g:1573:1: ( ( rule__Individual__Group_2_2__0 )* )
            // InternalOntoL.g:1574:2: ( rule__Individual__Group_2_2__0 )*
            {
             before(grammarAccess.getIndividualAccess().getGroup_2_2()); 
            // InternalOntoL.g:1575:2: ( rule__Individual__Group_2_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOntoL.g:1575:3: rule__Individual__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Individual__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalOntoL.g:1584:1: rule__Individual__Group_2_2__0 : rule__Individual__Group_2_2__0__Impl rule__Individual__Group_2_2__1 ;
    public final void rule__Individual__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1588:1: ( rule__Individual__Group_2_2__0__Impl rule__Individual__Group_2_2__1 )
            // InternalOntoL.g:1589:2: rule__Individual__Group_2_2__0__Impl rule__Individual__Group_2_2__1
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
    // InternalOntoL.g:1596:1: rule__Individual__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Individual__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1600:1: ( ( ',' ) )
            // InternalOntoL.g:1601:1: ( ',' )
            {
            // InternalOntoL.g:1601:1: ( ',' )
            // InternalOntoL.g:1602:2: ','
            {
             before(grammarAccess.getIndividualAccess().getCommaKeyword_2_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoL.g:1611:1: rule__Individual__Group_2_2__1 : rule__Individual__Group_2_2__1__Impl ;
    public final void rule__Individual__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1615:1: ( rule__Individual__Group_2_2__1__Impl )
            // InternalOntoL.g:1616:2: rule__Individual__Group_2_2__1__Impl
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
    // InternalOntoL.g:1622:1: rule__Individual__Group_2_2__1__Impl : ( ( rule__Individual__FixedTypesAssignment_2_2_1 ) ) ;
    public final void rule__Individual__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1626:1: ( ( ( rule__Individual__FixedTypesAssignment_2_2_1 ) ) )
            // InternalOntoL.g:1627:1: ( ( rule__Individual__FixedTypesAssignment_2_2_1 ) )
            {
            // InternalOntoL.g:1627:1: ( ( rule__Individual__FixedTypesAssignment_2_2_1 ) )
            // InternalOntoL.g:1628:2: ( rule__Individual__FixedTypesAssignment_2_2_1 )
            {
             before(grammarAccess.getIndividualAccess().getFixedTypesAssignment_2_2_1()); 
            // InternalOntoL.g:1629:2: ( rule__Individual__FixedTypesAssignment_2_2_1 )
            // InternalOntoL.g:1629:3: rule__Individual__FixedTypesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Individual__FixedTypesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIndividualAccess().getFixedTypesAssignment_2_2_1()); 

            }


            }

        }
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
    // InternalOntoL.g:1638:1: rule__Individual__Group_3__0 : rule__Individual__Group_3__0__Impl rule__Individual__Group_3__1 ;
    public final void rule__Individual__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1642:1: ( rule__Individual__Group_3__0__Impl rule__Individual__Group_3__1 )
            // InternalOntoL.g:1643:2: rule__Individual__Group_3__0__Impl rule__Individual__Group_3__1
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
    // InternalOntoL.g:1650:1: rule__Individual__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Individual__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1654:1: ( ( '{' ) )
            // InternalOntoL.g:1655:1: ( '{' )
            {
            // InternalOntoL.g:1655:1: ( '{' )
            // InternalOntoL.g:1656:2: '{'
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
    // InternalOntoL.g:1665:1: rule__Individual__Group_3__1 : rule__Individual__Group_3__1__Impl rule__Individual__Group_3__2 ;
    public final void rule__Individual__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1669:1: ( rule__Individual__Group_3__1__Impl rule__Individual__Group_3__2 )
            // InternalOntoL.g:1670:2: rule__Individual__Group_3__1__Impl rule__Individual__Group_3__2
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
    // InternalOntoL.g:1677:1: rule__Individual__Group_3__1__Impl : ( ( rule__Individual__PropAssignsAssignment_3_1 )* ) ;
    public final void rule__Individual__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1681:1: ( ( ( rule__Individual__PropAssignsAssignment_3_1 )* ) )
            // InternalOntoL.g:1682:1: ( ( rule__Individual__PropAssignsAssignment_3_1 )* )
            {
            // InternalOntoL.g:1682:1: ( ( rule__Individual__PropAssignsAssignment_3_1 )* )
            // InternalOntoL.g:1683:2: ( rule__Individual__PropAssignsAssignment_3_1 )*
            {
             before(grammarAccess.getIndividualAccess().getPropAssignsAssignment_3_1()); 
            // InternalOntoL.g:1684:2: ( rule__Individual__PropAssignsAssignment_3_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalOntoL.g:1684:3: rule__Individual__PropAssignsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Individual__PropAssignsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getIndividualAccess().getPropAssignsAssignment_3_1()); 

            }


            }

        }
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
    // InternalOntoL.g:1692:1: rule__Individual__Group_3__2 : rule__Individual__Group_3__2__Impl ;
    public final void rule__Individual__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1696:1: ( rule__Individual__Group_3__2__Impl )
            // InternalOntoL.g:1697:2: rule__Individual__Group_3__2__Impl
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
    // InternalOntoL.g:1703:1: rule__Individual__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Individual__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1707:1: ( ( '}' ) )
            // InternalOntoL.g:1708:1: ( '}' )
            {
            // InternalOntoL.g:1708:1: ( '}' )
            // InternalOntoL.g:1709:2: '}'
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


    // $ANTLR start "rule__Set__Group__0"
    // InternalOntoL.g:1719:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1723:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // InternalOntoL.g:1724:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Set__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__0"


    // $ANTLR start "rule__Set__Group__0__Impl"
    // InternalOntoL.g:1731:1: rule__Set__Group__0__Impl : ( 'set' ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1735:1: ( ( 'set' ) )
            // InternalOntoL.g:1736:1: ( 'set' )
            {
            // InternalOntoL.g:1736:1: ( 'set' )
            // InternalOntoL.g:1737:2: 'set'
            {
             before(grammarAccess.getSetAccess().getSetKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__0__Impl"


    // $ANTLR start "rule__Set__Group__1"
    // InternalOntoL.g:1746:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1750:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // InternalOntoL.g:1751:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Set__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__1"


    // $ANTLR start "rule__Set__Group__1__Impl"
    // InternalOntoL.g:1758:1: rule__Set__Group__1__Impl : ( ( rule__Set__NameAssignment_1 ) ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1762:1: ( ( ( rule__Set__NameAssignment_1 ) ) )
            // InternalOntoL.g:1763:1: ( ( rule__Set__NameAssignment_1 ) )
            {
            // InternalOntoL.g:1763:1: ( ( rule__Set__NameAssignment_1 ) )
            // InternalOntoL.g:1764:2: ( rule__Set__NameAssignment_1 )
            {
             before(grammarAccess.getSetAccess().getNameAssignment_1()); 
            // InternalOntoL.g:1765:2: ( rule__Set__NameAssignment_1 )
            // InternalOntoL.g:1765:3: rule__Set__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Set__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__1__Impl"


    // $ANTLR start "rule__Set__Group__2"
    // InternalOntoL.g:1773:1: rule__Set__Group__2 : rule__Set__Group__2__Impl rule__Set__Group__3 ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1777:1: ( rule__Set__Group__2__Impl rule__Set__Group__3 )
            // InternalOntoL.g:1778:2: rule__Set__Group__2__Impl rule__Set__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Set__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__2"


    // $ANTLR start "rule__Set__Group__2__Impl"
    // InternalOntoL.g:1785:1: rule__Set__Group__2__Impl : ( ( rule__Set__Group_2__0 )? ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1789:1: ( ( ( rule__Set__Group_2__0 )? ) )
            // InternalOntoL.g:1790:1: ( ( rule__Set__Group_2__0 )? )
            {
            // InternalOntoL.g:1790:1: ( ( rule__Set__Group_2__0 )? )
            // InternalOntoL.g:1791:2: ( rule__Set__Group_2__0 )?
            {
             before(grammarAccess.getSetAccess().getGroup_2()); 
            // InternalOntoL.g:1792:2: ( rule__Set__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOntoL.g:1792:3: rule__Set__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Set__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__2__Impl"


    // $ANTLR start "rule__Set__Group__3"
    // InternalOntoL.g:1800:1: rule__Set__Group__3 : rule__Set__Group__3__Impl ;
    public final void rule__Set__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1804:1: ( rule__Set__Group__3__Impl )
            // InternalOntoL.g:1805:2: rule__Set__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__3"


    // $ANTLR start "rule__Set__Group__3__Impl"
    // InternalOntoL.g:1811:1: rule__Set__Group__3__Impl : ( ( rule__Set__Group_3__0 )? ) ;
    public final void rule__Set__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1815:1: ( ( ( rule__Set__Group_3__0 )? ) )
            // InternalOntoL.g:1816:1: ( ( rule__Set__Group_3__0 )? )
            {
            // InternalOntoL.g:1816:1: ( ( rule__Set__Group_3__0 )? )
            // InternalOntoL.g:1817:2: ( rule__Set__Group_3__0 )?
            {
             before(grammarAccess.getSetAccess().getGroup_3()); 
            // InternalOntoL.g:1818:2: ( rule__Set__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntoL.g:1818:3: rule__Set__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Set__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__3__Impl"


    // $ANTLR start "rule__Set__Group_2__0"
    // InternalOntoL.g:1827:1: rule__Set__Group_2__0 : rule__Set__Group_2__0__Impl rule__Set__Group_2__1 ;
    public final void rule__Set__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1831:1: ( rule__Set__Group_2__0__Impl rule__Set__Group_2__1 )
            // InternalOntoL.g:1832:2: rule__Set__Group_2__0__Impl rule__Set__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Set__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2__0"


    // $ANTLR start "rule__Set__Group_2__0__Impl"
    // InternalOntoL.g:1839:1: rule__Set__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Set__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1843:1: ( ( ':' ) )
            // InternalOntoL.g:1844:1: ( ':' )
            {
            // InternalOntoL.g:1844:1: ( ':' )
            // InternalOntoL.g:1845:2: ':'
            {
             before(grammarAccess.getSetAccess().getColonKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2__0__Impl"


    // $ANTLR start "rule__Set__Group_2__1"
    // InternalOntoL.g:1854:1: rule__Set__Group_2__1 : rule__Set__Group_2__1__Impl rule__Set__Group_2__2 ;
    public final void rule__Set__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1858:1: ( rule__Set__Group_2__1__Impl rule__Set__Group_2__2 )
            // InternalOntoL.g:1859:2: rule__Set__Group_2__1__Impl rule__Set__Group_2__2
            {
            pushFollow(FOLLOW_12);
            rule__Set__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2__1"


    // $ANTLR start "rule__Set__Group_2__1__Impl"
    // InternalOntoL.g:1866:1: rule__Set__Group_2__1__Impl : ( ( rule__Set__FixedTypesAssignment_2_1 ) ) ;
    public final void rule__Set__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1870:1: ( ( ( rule__Set__FixedTypesAssignment_2_1 ) ) )
            // InternalOntoL.g:1871:1: ( ( rule__Set__FixedTypesAssignment_2_1 ) )
            {
            // InternalOntoL.g:1871:1: ( ( rule__Set__FixedTypesAssignment_2_1 ) )
            // InternalOntoL.g:1872:2: ( rule__Set__FixedTypesAssignment_2_1 )
            {
             before(grammarAccess.getSetAccess().getFixedTypesAssignment_2_1()); 
            // InternalOntoL.g:1873:2: ( rule__Set__FixedTypesAssignment_2_1 )
            // InternalOntoL.g:1873:3: rule__Set__FixedTypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Set__FixedTypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getFixedTypesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2__1__Impl"


    // $ANTLR start "rule__Set__Group_2__2"
    // InternalOntoL.g:1881:1: rule__Set__Group_2__2 : rule__Set__Group_2__2__Impl ;
    public final void rule__Set__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1885:1: ( rule__Set__Group_2__2__Impl )
            // InternalOntoL.g:1886:2: rule__Set__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2__2"


    // $ANTLR start "rule__Set__Group_2__2__Impl"
    // InternalOntoL.g:1892:1: rule__Set__Group_2__2__Impl : ( ( rule__Set__Group_2_2__0 )* ) ;
    public final void rule__Set__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1896:1: ( ( ( rule__Set__Group_2_2__0 )* ) )
            // InternalOntoL.g:1897:1: ( ( rule__Set__Group_2_2__0 )* )
            {
            // InternalOntoL.g:1897:1: ( ( rule__Set__Group_2_2__0 )* )
            // InternalOntoL.g:1898:2: ( rule__Set__Group_2_2__0 )*
            {
             before(grammarAccess.getSetAccess().getGroup_2_2()); 
            // InternalOntoL.g:1899:2: ( rule__Set__Group_2_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOntoL.g:1899:3: rule__Set__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Set__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSetAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2__2__Impl"


    // $ANTLR start "rule__Set__Group_2_2__0"
    // InternalOntoL.g:1908:1: rule__Set__Group_2_2__0 : rule__Set__Group_2_2__0__Impl rule__Set__Group_2_2__1 ;
    public final void rule__Set__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1912:1: ( rule__Set__Group_2_2__0__Impl rule__Set__Group_2_2__1 )
            // InternalOntoL.g:1913:2: rule__Set__Group_2_2__0__Impl rule__Set__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Set__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2_2__0"


    // $ANTLR start "rule__Set__Group_2_2__0__Impl"
    // InternalOntoL.g:1920:1: rule__Set__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Set__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1924:1: ( ( ',' ) )
            // InternalOntoL.g:1925:1: ( ',' )
            {
            // InternalOntoL.g:1925:1: ( ',' )
            // InternalOntoL.g:1926:2: ','
            {
             before(grammarAccess.getSetAccess().getCommaKeyword_2_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2_2__0__Impl"


    // $ANTLR start "rule__Set__Group_2_2__1"
    // InternalOntoL.g:1935:1: rule__Set__Group_2_2__1 : rule__Set__Group_2_2__1__Impl ;
    public final void rule__Set__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1939:1: ( rule__Set__Group_2_2__1__Impl )
            // InternalOntoL.g:1940:2: rule__Set__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2_2__1"


    // $ANTLR start "rule__Set__Group_2_2__1__Impl"
    // InternalOntoL.g:1946:1: rule__Set__Group_2_2__1__Impl : ( ( rule__Set__FixedTypesAssignment_2_2_1 ) ) ;
    public final void rule__Set__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1950:1: ( ( ( rule__Set__FixedTypesAssignment_2_2_1 ) ) )
            // InternalOntoL.g:1951:1: ( ( rule__Set__FixedTypesAssignment_2_2_1 ) )
            {
            // InternalOntoL.g:1951:1: ( ( rule__Set__FixedTypesAssignment_2_2_1 ) )
            // InternalOntoL.g:1952:2: ( rule__Set__FixedTypesAssignment_2_2_1 )
            {
             before(grammarAccess.getSetAccess().getFixedTypesAssignment_2_2_1()); 
            // InternalOntoL.g:1953:2: ( rule__Set__FixedTypesAssignment_2_2_1 )
            // InternalOntoL.g:1953:3: rule__Set__FixedTypesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Set__FixedTypesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getFixedTypesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2_2__1__Impl"


    // $ANTLR start "rule__Set__Group_3__0"
    // InternalOntoL.g:1962:1: rule__Set__Group_3__0 : rule__Set__Group_3__0__Impl rule__Set__Group_3__1 ;
    public final void rule__Set__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1966:1: ( rule__Set__Group_3__0__Impl rule__Set__Group_3__1 )
            // InternalOntoL.g:1967:2: rule__Set__Group_3__0__Impl rule__Set__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Set__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_3__0"


    // $ANTLR start "rule__Set__Group_3__0__Impl"
    // InternalOntoL.g:1974:1: rule__Set__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Set__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1978:1: ( ( '{' ) )
            // InternalOntoL.g:1979:1: ( '{' )
            {
            // InternalOntoL.g:1979:1: ( '{' )
            // InternalOntoL.g:1980:2: '{'
            {
             before(grammarAccess.getSetAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_3__0__Impl"


    // $ANTLR start "rule__Set__Group_3__1"
    // InternalOntoL.g:1989:1: rule__Set__Group_3__1 : rule__Set__Group_3__1__Impl rule__Set__Group_3__2 ;
    public final void rule__Set__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:1993:1: ( rule__Set__Group_3__1__Impl rule__Set__Group_3__2 )
            // InternalOntoL.g:1994:2: rule__Set__Group_3__1__Impl rule__Set__Group_3__2
            {
            pushFollow(FOLLOW_14);
            rule__Set__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_3__1"


    // $ANTLR start "rule__Set__Group_3__1__Impl"
    // InternalOntoL.g:2001:1: rule__Set__Group_3__1__Impl : ( ( rule__Set__PropAssignsAssignment_3_1 )* ) ;
    public final void rule__Set__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2005:1: ( ( ( rule__Set__PropAssignsAssignment_3_1 )* ) )
            // InternalOntoL.g:2006:1: ( ( rule__Set__PropAssignsAssignment_3_1 )* )
            {
            // InternalOntoL.g:2006:1: ( ( rule__Set__PropAssignsAssignment_3_1 )* )
            // InternalOntoL.g:2007:2: ( rule__Set__PropAssignsAssignment_3_1 )*
            {
             before(grammarAccess.getSetAccess().getPropAssignsAssignment_3_1()); 
            // InternalOntoL.g:2008:2: ( rule__Set__PropAssignsAssignment_3_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalOntoL.g:2008:3: rule__Set__PropAssignsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Set__PropAssignsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSetAccess().getPropAssignsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_3__1__Impl"


    // $ANTLR start "rule__Set__Group_3__2"
    // InternalOntoL.g:2016:1: rule__Set__Group_3__2 : rule__Set__Group_3__2__Impl ;
    public final void rule__Set__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2020:1: ( rule__Set__Group_3__2__Impl )
            // InternalOntoL.g:2021:2: rule__Set__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_3__2"


    // $ANTLR start "rule__Set__Group_3__2__Impl"
    // InternalOntoL.g:2027:1: rule__Set__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Set__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2031:1: ( ( '}' ) )
            // InternalOntoL.g:2032:1: ( '}' )
            {
            // InternalOntoL.g:2032:1: ( '}' )
            // InternalOntoL.g:2033:2: '}'
            {
             before(grammarAccess.getSetAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_3__2__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalOntoL.g:2043:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2047:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalOntoL.g:2048:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalOntoL.g:2055:1: rule__Class__Group__0__Impl : ( ( rule__Class__Alternatives_0 ) ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2059:1: ( ( ( rule__Class__Alternatives_0 ) ) )
            // InternalOntoL.g:2060:1: ( ( rule__Class__Alternatives_0 ) )
            {
            // InternalOntoL.g:2060:1: ( ( rule__Class__Alternatives_0 ) )
            // InternalOntoL.g:2061:2: ( rule__Class__Alternatives_0 )
            {
             before(grammarAccess.getClassAccess().getAlternatives_0()); 
            // InternalOntoL.g:2062:2: ( rule__Class__Alternatives_0 )
            // InternalOntoL.g:2062:3: rule__Class__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalOntoL.g:2070:1: rule__Class__Group__1 : rule__Class__Group__1__Impl ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2074:1: ( rule__Class__Group__1__Impl )
            // InternalOntoL.g:2075:2: rule__Class__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalOntoL.g:2081:1: rule__Class__Group__1__Impl : ( ( rule__Class__Group_1__0 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2085:1: ( ( ( rule__Class__Group_1__0 )? ) )
            // InternalOntoL.g:2086:1: ( ( rule__Class__Group_1__0 )? )
            {
            // InternalOntoL.g:2086:1: ( ( rule__Class__Group_1__0 )? )
            // InternalOntoL.g:2087:2: ( rule__Class__Group_1__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_1()); 
            // InternalOntoL.g:2088:2: ( rule__Class__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOntoL.g:2088:3: rule__Class__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group_1__0"
    // InternalOntoL.g:2097:1: rule__Class__Group_1__0 : rule__Class__Group_1__0__Impl rule__Class__Group_1__1 ;
    public final void rule__Class__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2101:1: ( rule__Class__Group_1__0__Impl rule__Class__Group_1__1 )
            // InternalOntoL.g:2102:2: rule__Class__Group_1__0__Impl rule__Class__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Class__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__0"


    // $ANTLR start "rule__Class__Group_1__0__Impl"
    // InternalOntoL.g:2109:1: rule__Class__Group_1__0__Impl : ( '{' ) ;
    public final void rule__Class__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2113:1: ( ( '{' ) )
            // InternalOntoL.g:2114:1: ( '{' )
            {
            // InternalOntoL.g:2114:1: ( '{' )
            // InternalOntoL.g:2115:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__0__Impl"


    // $ANTLR start "rule__Class__Group_1__1"
    // InternalOntoL.g:2124:1: rule__Class__Group_1__1 : rule__Class__Group_1__1__Impl rule__Class__Group_1__2 ;
    public final void rule__Class__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2128:1: ( rule__Class__Group_1__1__Impl rule__Class__Group_1__2 )
            // InternalOntoL.g:2129:2: rule__Class__Group_1__1__Impl rule__Class__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Class__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__1"


    // $ANTLR start "rule__Class__Group_1__1__Impl"
    // InternalOntoL.g:2136:1: rule__Class__Group_1__1__Impl : ( ( rule__Class__Alternatives_1_1 )* ) ;
    public final void rule__Class__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2140:1: ( ( ( rule__Class__Alternatives_1_1 )* ) )
            // InternalOntoL.g:2141:1: ( ( rule__Class__Alternatives_1_1 )* )
            {
            // InternalOntoL.g:2141:1: ( ( rule__Class__Alternatives_1_1 )* )
            // InternalOntoL.g:2142:2: ( rule__Class__Alternatives_1_1 )*
            {
             before(grammarAccess.getClassAccess().getAlternatives_1_1()); 
            // InternalOntoL.g:2143:2: ( rule__Class__Alternatives_1_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalOntoL.g:2143:3: rule__Class__Alternatives_1_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Class__Alternatives_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__1__Impl"


    // $ANTLR start "rule__Class__Group_1__2"
    // InternalOntoL.g:2151:1: rule__Class__Group_1__2 : rule__Class__Group_1__2__Impl ;
    public final void rule__Class__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2155:1: ( rule__Class__Group_1__2__Impl )
            // InternalOntoL.g:2156:2: rule__Class__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__2"


    // $ANTLR start "rule__Class__Group_1__2__Impl"
    // InternalOntoL.g:2162:1: rule__Class__Group_1__2__Impl : ( '}' ) ;
    public final void rule__Class__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2166:1: ( ( '}' ) )
            // InternalOntoL.g:2167:1: ( '}' )
            {
            // InternalOntoL.g:2167:1: ( '}' )
            // InternalOntoL.g:2168:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__2__Impl"


    // $ANTLR start "rule__WClass__Group__0"
    // InternalOntoL.g:2178:1: rule__WClass__Group__0 : rule__WClass__Group__0__Impl rule__WClass__Group__1 ;
    public final void rule__WClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2182:1: ( rule__WClass__Group__0__Impl rule__WClass__Group__1 )
            // InternalOntoL.g:2183:2: rule__WClass__Group__0__Impl rule__WClass__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group__0"


    // $ANTLR start "rule__WClass__Group__0__Impl"
    // InternalOntoL.g:2190:1: rule__WClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__WClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2194:1: ( ( 'class' ) )
            // InternalOntoL.g:2195:1: ( 'class' )
            {
            // InternalOntoL.g:2195:1: ( 'class' )
            // InternalOntoL.g:2196:2: 'class'
            {
             before(grammarAccess.getWClassAccess().getClassKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getWClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group__0__Impl"


    // $ANTLR start "rule__WClass__Group__1"
    // InternalOntoL.g:2205:1: rule__WClass__Group__1 : rule__WClass__Group__1__Impl rule__WClass__Group__2 ;
    public final void rule__WClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2209:1: ( rule__WClass__Group__1__Impl rule__WClass__Group__2 )
            // InternalOntoL.g:2210:2: rule__WClass__Group__1__Impl rule__WClass__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__WClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group__1"


    // $ANTLR start "rule__WClass__Group__1__Impl"
    // InternalOntoL.g:2217:1: rule__WClass__Group__1__Impl : ( ( rule__WClass__NameAssignment_1 ) ) ;
    public final void rule__WClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2221:1: ( ( ( rule__WClass__NameAssignment_1 ) ) )
            // InternalOntoL.g:2222:1: ( ( rule__WClass__NameAssignment_1 ) )
            {
            // InternalOntoL.g:2222:1: ( ( rule__WClass__NameAssignment_1 ) )
            // InternalOntoL.g:2223:2: ( rule__WClass__NameAssignment_1 )
            {
             before(grammarAccess.getWClassAccess().getNameAssignment_1()); 
            // InternalOntoL.g:2224:2: ( rule__WClass__NameAssignment_1 )
            // InternalOntoL.g:2224:3: rule__WClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group__1__Impl"


    // $ANTLR start "rule__WClass__Group__2"
    // InternalOntoL.g:2232:1: rule__WClass__Group__2 : rule__WClass__Group__2__Impl rule__WClass__Group__3 ;
    public final void rule__WClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2236:1: ( rule__WClass__Group__2__Impl rule__WClass__Group__3 )
            // InternalOntoL.g:2237:2: rule__WClass__Group__2__Impl rule__WClass__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__WClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group__2"


    // $ANTLR start "rule__WClass__Group__2__Impl"
    // InternalOntoL.g:2244:1: rule__WClass__Group__2__Impl : ( ( rule__WClass__Group_2__0 )? ) ;
    public final void rule__WClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2248:1: ( ( ( rule__WClass__Group_2__0 )? ) )
            // InternalOntoL.g:2249:1: ( ( rule__WClass__Group_2__0 )? )
            {
            // InternalOntoL.g:2249:1: ( ( rule__WClass__Group_2__0 )? )
            // InternalOntoL.g:2250:2: ( rule__WClass__Group_2__0 )?
            {
             before(grammarAccess.getWClassAccess().getGroup_2()); 
            // InternalOntoL.g:2251:2: ( rule__WClass__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOntoL.g:2251:3: rule__WClass__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WClass__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWClassAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group__2__Impl"


    // $ANTLR start "rule__WClass__Group__3"
    // InternalOntoL.g:2259:1: rule__WClass__Group__3 : rule__WClass__Group__3__Impl rule__WClass__Group__4 ;
    public final void rule__WClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2263:1: ( rule__WClass__Group__3__Impl rule__WClass__Group__4 )
            // InternalOntoL.g:2264:2: rule__WClass__Group__3__Impl rule__WClass__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__WClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group__3"


    // $ANTLR start "rule__WClass__Group__3__Impl"
    // InternalOntoL.g:2271:1: rule__WClass__Group__3__Impl : ( ( rule__WClass__Group_3__0 )? ) ;
    public final void rule__WClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2275:1: ( ( ( rule__WClass__Group_3__0 )? ) )
            // InternalOntoL.g:2276:1: ( ( rule__WClass__Group_3__0 )? )
            {
            // InternalOntoL.g:2276:1: ( ( rule__WClass__Group_3__0 )? )
            // InternalOntoL.g:2277:2: ( rule__WClass__Group_3__0 )?
            {
             before(grammarAccess.getWClassAccess().getGroup_3()); 
            // InternalOntoL.g:2278:2: ( rule__WClass__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOntoL.g:2278:3: rule__WClass__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WClass__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group__3__Impl"


    // $ANTLR start "rule__WClass__Group__4"
    // InternalOntoL.g:2286:1: rule__WClass__Group__4 : rule__WClass__Group__4__Impl rule__WClass__Group__5 ;
    public final void rule__WClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2290:1: ( rule__WClass__Group__4__Impl rule__WClass__Group__5 )
            // InternalOntoL.g:2291:2: rule__WClass__Group__4__Impl rule__WClass__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__WClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group__4"


    // $ANTLR start "rule__WClass__Group__4__Impl"
    // InternalOntoL.g:2298:1: rule__WClass__Group__4__Impl : ( ( rule__WClass__Group_4__0 )? ) ;
    public final void rule__WClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2302:1: ( ( ( rule__WClass__Group_4__0 )? ) )
            // InternalOntoL.g:2303:1: ( ( rule__WClass__Group_4__0 )? )
            {
            // InternalOntoL.g:2303:1: ( ( rule__WClass__Group_4__0 )? )
            // InternalOntoL.g:2304:2: ( rule__WClass__Group_4__0 )?
            {
             before(grammarAccess.getWClassAccess().getGroup_4()); 
            // InternalOntoL.g:2305:2: ( rule__WClass__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOntoL.g:2305:3: rule__WClass__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WClass__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group__4__Impl"


    // $ANTLR start "rule__WClass__Group__5"
    // InternalOntoL.g:2313:1: rule__WClass__Group__5 : rule__WClass__Group__5__Impl ;
    public final void rule__WClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2317:1: ( rule__WClass__Group__5__Impl )
            // InternalOntoL.g:2318:2: rule__WClass__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WClass__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group__5"


    // $ANTLR start "rule__WClass__Group__5__Impl"
    // InternalOntoL.g:2324:1: rule__WClass__Group__5__Impl : ( ( rule__WClass__Alternatives_5 )? ) ;
    public final void rule__WClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2328:1: ( ( ( rule__WClass__Alternatives_5 )? ) )
            // InternalOntoL.g:2329:1: ( ( rule__WClass__Alternatives_5 )? )
            {
            // InternalOntoL.g:2329:1: ( ( rule__WClass__Alternatives_5 )? )
            // InternalOntoL.g:2330:2: ( rule__WClass__Alternatives_5 )?
            {
             before(grammarAccess.getWClassAccess().getAlternatives_5()); 
            // InternalOntoL.g:2331:2: ( rule__WClass__Alternatives_5 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=14 && LA28_0<=17)||LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOntoL.g:2331:3: rule__WClass__Alternatives_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__WClass__Alternatives_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWClassAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group__5__Impl"


    // $ANTLR start "rule__WClass__Group_2__0"
    // InternalOntoL.g:2340:1: rule__WClass__Group_2__0 : rule__WClass__Group_2__0__Impl rule__WClass__Group_2__1 ;
    public final void rule__WClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2344:1: ( rule__WClass__Group_2__0__Impl rule__WClass__Group_2__1 )
            // InternalOntoL.g:2345:2: rule__WClass__Group_2__0__Impl rule__WClass__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__WClass__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WClass__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_2__0"


    // $ANTLR start "rule__WClass__Group_2__0__Impl"
    // InternalOntoL.g:2352:1: rule__WClass__Group_2__0__Impl : ( ':' ) ;
    public final void rule__WClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2356:1: ( ( ':' ) )
            // InternalOntoL.g:2357:1: ( ':' )
            {
            // InternalOntoL.g:2357:1: ( ':' )
            // InternalOntoL.g:2358:2: ':'
            {
             before(grammarAccess.getWClassAccess().getColonKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWClassAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_2__0__Impl"


    // $ANTLR start "rule__WClass__Group_2__1"
    // InternalOntoL.g:2367:1: rule__WClass__Group_2__1 : rule__WClass__Group_2__1__Impl rule__WClass__Group_2__2 ;
    public final void rule__WClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2371:1: ( rule__WClass__Group_2__1__Impl rule__WClass__Group_2__2 )
            // InternalOntoL.g:2372:2: rule__WClass__Group_2__1__Impl rule__WClass__Group_2__2
            {
            pushFollow(FOLLOW_12);
            rule__WClass__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WClass__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_2__1"


    // $ANTLR start "rule__WClass__Group_2__1__Impl"
    // InternalOntoL.g:2379:1: rule__WClass__Group_2__1__Impl : ( ( rule__WClass__FixedTypesAssignment_2_1 ) ) ;
    public final void rule__WClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2383:1: ( ( ( rule__WClass__FixedTypesAssignment_2_1 ) ) )
            // InternalOntoL.g:2384:1: ( ( rule__WClass__FixedTypesAssignment_2_1 ) )
            {
            // InternalOntoL.g:2384:1: ( ( rule__WClass__FixedTypesAssignment_2_1 ) )
            // InternalOntoL.g:2385:2: ( rule__WClass__FixedTypesAssignment_2_1 )
            {
             before(grammarAccess.getWClassAccess().getFixedTypesAssignment_2_1()); 
            // InternalOntoL.g:2386:2: ( rule__WClass__FixedTypesAssignment_2_1 )
            // InternalOntoL.g:2386:3: rule__WClass__FixedTypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__WClass__FixedTypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWClassAccess().getFixedTypesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_2__1__Impl"


    // $ANTLR start "rule__WClass__Group_2__2"
    // InternalOntoL.g:2394:1: rule__WClass__Group_2__2 : rule__WClass__Group_2__2__Impl ;
    public final void rule__WClass__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2398:1: ( rule__WClass__Group_2__2__Impl )
            // InternalOntoL.g:2399:2: rule__WClass__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WClass__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_2__2"


    // $ANTLR start "rule__WClass__Group_2__2__Impl"
    // InternalOntoL.g:2405:1: rule__WClass__Group_2__2__Impl : ( ( rule__WClass__Group_2_2__0 )* ) ;
    public final void rule__WClass__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2409:1: ( ( ( rule__WClass__Group_2_2__0 )* ) )
            // InternalOntoL.g:2410:1: ( ( rule__WClass__Group_2_2__0 )* )
            {
            // InternalOntoL.g:2410:1: ( ( rule__WClass__Group_2_2__0 )* )
            // InternalOntoL.g:2411:2: ( rule__WClass__Group_2_2__0 )*
            {
             before(grammarAccess.getWClassAccess().getGroup_2_2()); 
            // InternalOntoL.g:2412:2: ( rule__WClass__Group_2_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==27) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalOntoL.g:2412:3: rule__WClass__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__WClass__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getWClassAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_2__2__Impl"


    // $ANTLR start "rule__WClass__Group_2_2__0"
    // InternalOntoL.g:2421:1: rule__WClass__Group_2_2__0 : rule__WClass__Group_2_2__0__Impl rule__WClass__Group_2_2__1 ;
    public final void rule__WClass__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2425:1: ( rule__WClass__Group_2_2__0__Impl rule__WClass__Group_2_2__1 )
            // InternalOntoL.g:2426:2: rule__WClass__Group_2_2__0__Impl rule__WClass__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__WClass__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WClass__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_2_2__0"


    // $ANTLR start "rule__WClass__Group_2_2__0__Impl"
    // InternalOntoL.g:2433:1: rule__WClass__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__WClass__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2437:1: ( ( ',' ) )
            // InternalOntoL.g:2438:1: ( ',' )
            {
            // InternalOntoL.g:2438:1: ( ',' )
            // InternalOntoL.g:2439:2: ','
            {
             before(grammarAccess.getWClassAccess().getCommaKeyword_2_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWClassAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_2_2__0__Impl"


    // $ANTLR start "rule__WClass__Group_2_2__1"
    // InternalOntoL.g:2448:1: rule__WClass__Group_2_2__1 : rule__WClass__Group_2_2__1__Impl ;
    public final void rule__WClass__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2452:1: ( rule__WClass__Group_2_2__1__Impl )
            // InternalOntoL.g:2453:2: rule__WClass__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WClass__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_2_2__1"


    // $ANTLR start "rule__WClass__Group_2_2__1__Impl"
    // InternalOntoL.g:2459:1: rule__WClass__Group_2_2__1__Impl : ( ( rule__WClass__FixedTypesAssignment_2_2_1 ) ) ;
    public final void rule__WClass__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2463:1: ( ( ( rule__WClass__FixedTypesAssignment_2_2_1 ) ) )
            // InternalOntoL.g:2464:1: ( ( rule__WClass__FixedTypesAssignment_2_2_1 ) )
            {
            // InternalOntoL.g:2464:1: ( ( rule__WClass__FixedTypesAssignment_2_2_1 ) )
            // InternalOntoL.g:2465:2: ( rule__WClass__FixedTypesAssignment_2_2_1 )
            {
             before(grammarAccess.getWClassAccess().getFixedTypesAssignment_2_2_1()); 
            // InternalOntoL.g:2466:2: ( rule__WClass__FixedTypesAssignment_2_2_1 )
            // InternalOntoL.g:2466:3: rule__WClass__FixedTypesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__WClass__FixedTypesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWClassAccess().getFixedTypesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_2_2__1__Impl"


    // $ANTLR start "rule__WClass__Group_3__0"
    // InternalOntoL.g:2475:1: rule__WClass__Group_3__0 : rule__WClass__Group_3__0__Impl rule__WClass__Group_3__1 ;
    public final void rule__WClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2479:1: ( rule__WClass__Group_3__0__Impl rule__WClass__Group_3__1 )
            // InternalOntoL.g:2480:2: rule__WClass__Group_3__0__Impl rule__WClass__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__WClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WClass__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_3__0"


    // $ANTLR start "rule__WClass__Group_3__0__Impl"
    // InternalOntoL.g:2487:1: rule__WClass__Group_3__0__Impl : ( 'specializes' ) ;
    public final void rule__WClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2491:1: ( ( 'specializes' ) )
            // InternalOntoL.g:2492:1: ( 'specializes' )
            {
            // InternalOntoL.g:2492:1: ( 'specializes' )
            // InternalOntoL.g:2493:2: 'specializes'
            {
             before(grammarAccess.getWClassAccess().getSpecializesKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getWClassAccess().getSpecializesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_3__0__Impl"


    // $ANTLR start "rule__WClass__Group_3__1"
    // InternalOntoL.g:2502:1: rule__WClass__Group_3__1 : rule__WClass__Group_3__1__Impl rule__WClass__Group_3__2 ;
    public final void rule__WClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2506:1: ( rule__WClass__Group_3__1__Impl rule__WClass__Group_3__2 )
            // InternalOntoL.g:2507:2: rule__WClass__Group_3__1__Impl rule__WClass__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__WClass__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WClass__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_3__1"


    // $ANTLR start "rule__WClass__Group_3__1__Impl"
    // InternalOntoL.g:2514:1: rule__WClass__Group_3__1__Impl : ( ( rule__WClass__SuperClassesAssignment_3_1 ) ) ;
    public final void rule__WClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2518:1: ( ( ( rule__WClass__SuperClassesAssignment_3_1 ) ) )
            // InternalOntoL.g:2519:1: ( ( rule__WClass__SuperClassesAssignment_3_1 ) )
            {
            // InternalOntoL.g:2519:1: ( ( rule__WClass__SuperClassesAssignment_3_1 ) )
            // InternalOntoL.g:2520:2: ( rule__WClass__SuperClassesAssignment_3_1 )
            {
             before(grammarAccess.getWClassAccess().getSuperClassesAssignment_3_1()); 
            // InternalOntoL.g:2521:2: ( rule__WClass__SuperClassesAssignment_3_1 )
            // InternalOntoL.g:2521:3: rule__WClass__SuperClassesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__WClass__SuperClassesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWClassAccess().getSuperClassesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_3__1__Impl"


    // $ANTLR start "rule__WClass__Group_3__2"
    // InternalOntoL.g:2529:1: rule__WClass__Group_3__2 : rule__WClass__Group_3__2__Impl ;
    public final void rule__WClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2533:1: ( rule__WClass__Group_3__2__Impl )
            // InternalOntoL.g:2534:2: rule__WClass__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WClass__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_3__2"


    // $ANTLR start "rule__WClass__Group_3__2__Impl"
    // InternalOntoL.g:2540:1: rule__WClass__Group_3__2__Impl : ( ( rule__WClass__Group_3_2__0 )* ) ;
    public final void rule__WClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2544:1: ( ( ( rule__WClass__Group_3_2__0 )* ) )
            // InternalOntoL.g:2545:1: ( ( rule__WClass__Group_3_2__0 )* )
            {
            // InternalOntoL.g:2545:1: ( ( rule__WClass__Group_3_2__0 )* )
            // InternalOntoL.g:2546:2: ( rule__WClass__Group_3_2__0 )*
            {
             before(grammarAccess.getWClassAccess().getGroup_3_2()); 
            // InternalOntoL.g:2547:2: ( rule__WClass__Group_3_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==27) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalOntoL.g:2547:3: rule__WClass__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__WClass__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getWClassAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_3__2__Impl"


    // $ANTLR start "rule__WClass__Group_3_2__0"
    // InternalOntoL.g:2556:1: rule__WClass__Group_3_2__0 : rule__WClass__Group_3_2__0__Impl rule__WClass__Group_3_2__1 ;
    public final void rule__WClass__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2560:1: ( rule__WClass__Group_3_2__0__Impl rule__WClass__Group_3_2__1 )
            // InternalOntoL.g:2561:2: rule__WClass__Group_3_2__0__Impl rule__WClass__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__WClass__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WClass__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_3_2__0"


    // $ANTLR start "rule__WClass__Group_3_2__0__Impl"
    // InternalOntoL.g:2568:1: rule__WClass__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__WClass__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2572:1: ( ( ',' ) )
            // InternalOntoL.g:2573:1: ( ',' )
            {
            // InternalOntoL.g:2573:1: ( ',' )
            // InternalOntoL.g:2574:2: ','
            {
             before(grammarAccess.getWClassAccess().getCommaKeyword_3_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWClassAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_3_2__0__Impl"


    // $ANTLR start "rule__WClass__Group_3_2__1"
    // InternalOntoL.g:2583:1: rule__WClass__Group_3_2__1 : rule__WClass__Group_3_2__1__Impl ;
    public final void rule__WClass__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2587:1: ( rule__WClass__Group_3_2__1__Impl )
            // InternalOntoL.g:2588:2: rule__WClass__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WClass__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_3_2__1"


    // $ANTLR start "rule__WClass__Group_3_2__1__Impl"
    // InternalOntoL.g:2594:1: rule__WClass__Group_3_2__1__Impl : ( ( rule__WClass__SuperClassesAssignment_3_2_1 ) ) ;
    public final void rule__WClass__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2598:1: ( ( ( rule__WClass__SuperClassesAssignment_3_2_1 ) ) )
            // InternalOntoL.g:2599:1: ( ( rule__WClass__SuperClassesAssignment_3_2_1 ) )
            {
            // InternalOntoL.g:2599:1: ( ( rule__WClass__SuperClassesAssignment_3_2_1 ) )
            // InternalOntoL.g:2600:2: ( rule__WClass__SuperClassesAssignment_3_2_1 )
            {
             before(grammarAccess.getWClassAccess().getSuperClassesAssignment_3_2_1()); 
            // InternalOntoL.g:2601:2: ( rule__WClass__SuperClassesAssignment_3_2_1 )
            // InternalOntoL.g:2601:3: rule__WClass__SuperClassesAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__WClass__SuperClassesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWClassAccess().getSuperClassesAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_3_2__1__Impl"


    // $ANTLR start "rule__WClass__Group_4__0"
    // InternalOntoL.g:2610:1: rule__WClass__Group_4__0 : rule__WClass__Group_4__0__Impl rule__WClass__Group_4__1 ;
    public final void rule__WClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2614:1: ( rule__WClass__Group_4__0__Impl rule__WClass__Group_4__1 )
            // InternalOntoL.g:2615:2: rule__WClass__Group_4__0__Impl rule__WClass__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__WClass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WClass__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_4__0"


    // $ANTLR start "rule__WClass__Group_4__0__Impl"
    // InternalOntoL.g:2622:1: rule__WClass__Group_4__0__Impl : ( 'subordinatedto' ) ;
    public final void rule__WClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2626:1: ( ( 'subordinatedto' ) )
            // InternalOntoL.g:2627:1: ( 'subordinatedto' )
            {
            // InternalOntoL.g:2627:1: ( 'subordinatedto' )
            // InternalOntoL.g:2628:2: 'subordinatedto'
            {
             before(grammarAccess.getWClassAccess().getSubordinatedtoKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getWClassAccess().getSubordinatedtoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_4__0__Impl"


    // $ANTLR start "rule__WClass__Group_4__1"
    // InternalOntoL.g:2637:1: rule__WClass__Group_4__1 : rule__WClass__Group_4__1__Impl rule__WClass__Group_4__2 ;
    public final void rule__WClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2641:1: ( rule__WClass__Group_4__1__Impl rule__WClass__Group_4__2 )
            // InternalOntoL.g:2642:2: rule__WClass__Group_4__1__Impl rule__WClass__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__WClass__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WClass__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_4__1"


    // $ANTLR start "rule__WClass__Group_4__1__Impl"
    // InternalOntoL.g:2649:1: rule__WClass__Group_4__1__Impl : ( ( rule__WClass__SubordinatorsAssignment_4_1 ) ) ;
    public final void rule__WClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2653:1: ( ( ( rule__WClass__SubordinatorsAssignment_4_1 ) ) )
            // InternalOntoL.g:2654:1: ( ( rule__WClass__SubordinatorsAssignment_4_1 ) )
            {
            // InternalOntoL.g:2654:1: ( ( rule__WClass__SubordinatorsAssignment_4_1 ) )
            // InternalOntoL.g:2655:2: ( rule__WClass__SubordinatorsAssignment_4_1 )
            {
             before(grammarAccess.getWClassAccess().getSubordinatorsAssignment_4_1()); 
            // InternalOntoL.g:2656:2: ( rule__WClass__SubordinatorsAssignment_4_1 )
            // InternalOntoL.g:2656:3: rule__WClass__SubordinatorsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__WClass__SubordinatorsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWClassAccess().getSubordinatorsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_4__1__Impl"


    // $ANTLR start "rule__WClass__Group_4__2"
    // InternalOntoL.g:2664:1: rule__WClass__Group_4__2 : rule__WClass__Group_4__2__Impl ;
    public final void rule__WClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2668:1: ( rule__WClass__Group_4__2__Impl )
            // InternalOntoL.g:2669:2: rule__WClass__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WClass__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_4__2"


    // $ANTLR start "rule__WClass__Group_4__2__Impl"
    // InternalOntoL.g:2675:1: rule__WClass__Group_4__2__Impl : ( ( rule__WClass__Group_4_2__0 )* ) ;
    public final void rule__WClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2679:1: ( ( ( rule__WClass__Group_4_2__0 )* ) )
            // InternalOntoL.g:2680:1: ( ( rule__WClass__Group_4_2__0 )* )
            {
            // InternalOntoL.g:2680:1: ( ( rule__WClass__Group_4_2__0 )* )
            // InternalOntoL.g:2681:2: ( rule__WClass__Group_4_2__0 )*
            {
             before(grammarAccess.getWClassAccess().getGroup_4_2()); 
            // InternalOntoL.g:2682:2: ( rule__WClass__Group_4_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==27) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalOntoL.g:2682:3: rule__WClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__WClass__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getWClassAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_4__2__Impl"


    // $ANTLR start "rule__WClass__Group_4_2__0"
    // InternalOntoL.g:2691:1: rule__WClass__Group_4_2__0 : rule__WClass__Group_4_2__0__Impl rule__WClass__Group_4_2__1 ;
    public final void rule__WClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2695:1: ( rule__WClass__Group_4_2__0__Impl rule__WClass__Group_4_2__1 )
            // InternalOntoL.g:2696:2: rule__WClass__Group_4_2__0__Impl rule__WClass__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__WClass__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WClass__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_4_2__0"


    // $ANTLR start "rule__WClass__Group_4_2__0__Impl"
    // InternalOntoL.g:2703:1: rule__WClass__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__WClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2707:1: ( ( ',' ) )
            // InternalOntoL.g:2708:1: ( ',' )
            {
            // InternalOntoL.g:2708:1: ( ',' )
            // InternalOntoL.g:2709:2: ','
            {
             before(grammarAccess.getWClassAccess().getCommaKeyword_4_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWClassAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_4_2__0__Impl"


    // $ANTLR start "rule__WClass__Group_4_2__1"
    // InternalOntoL.g:2718:1: rule__WClass__Group_4_2__1 : rule__WClass__Group_4_2__1__Impl ;
    public final void rule__WClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2722:1: ( rule__WClass__Group_4_2__1__Impl )
            // InternalOntoL.g:2723:2: rule__WClass__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WClass__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_4_2__1"


    // $ANTLR start "rule__WClass__Group_4_2__1__Impl"
    // InternalOntoL.g:2729:1: rule__WClass__Group_4_2__1__Impl : ( ( rule__WClass__SubordinatorsAssignment_4_2_1 ) ) ;
    public final void rule__WClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2733:1: ( ( ( rule__WClass__SubordinatorsAssignment_4_2_1 ) ) )
            // InternalOntoL.g:2734:1: ( ( rule__WClass__SubordinatorsAssignment_4_2_1 ) )
            {
            // InternalOntoL.g:2734:1: ( ( rule__WClass__SubordinatorsAssignment_4_2_1 ) )
            // InternalOntoL.g:2735:2: ( rule__WClass__SubordinatorsAssignment_4_2_1 )
            {
             before(grammarAccess.getWClassAccess().getSubordinatorsAssignment_4_2_1()); 
            // InternalOntoL.g:2736:2: ( rule__WClass__SubordinatorsAssignment_4_2_1 )
            // InternalOntoL.g:2736:3: rule__WClass__SubordinatorsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__WClass__SubordinatorsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWClassAccess().getSubordinatorsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_4_2__1__Impl"


    // $ANTLR start "rule__WClass__Group_5_0__0"
    // InternalOntoL.g:2745:1: rule__WClass__Group_5_0__0 : rule__WClass__Group_5_0__0__Impl rule__WClass__Group_5_0__1 ;
    public final void rule__WClass__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2749:1: ( rule__WClass__Group_5_0__0__Impl rule__WClass__Group_5_0__1 )
            // InternalOntoL.g:2750:2: rule__WClass__Group_5_0__0__Impl rule__WClass__Group_5_0__1
            {
            pushFollow(FOLLOW_3);
            rule__WClass__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WClass__Group_5_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_5_0__0"


    // $ANTLR start "rule__WClass__Group_5_0__0__Impl"
    // InternalOntoL.g:2757:1: rule__WClass__Group_5_0__0__Impl : ( ( rule__WClass__CatTypeAssignment_5_0_0 ) ) ;
    public final void rule__WClass__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2761:1: ( ( ( rule__WClass__CatTypeAssignment_5_0_0 ) ) )
            // InternalOntoL.g:2762:1: ( ( rule__WClass__CatTypeAssignment_5_0_0 ) )
            {
            // InternalOntoL.g:2762:1: ( ( rule__WClass__CatTypeAssignment_5_0_0 ) )
            // InternalOntoL.g:2763:2: ( rule__WClass__CatTypeAssignment_5_0_0 )
            {
             before(grammarAccess.getWClassAccess().getCatTypeAssignment_5_0_0()); 
            // InternalOntoL.g:2764:2: ( rule__WClass__CatTypeAssignment_5_0_0 )
            // InternalOntoL.g:2764:3: rule__WClass__CatTypeAssignment_5_0_0
            {
            pushFollow(FOLLOW_2);
            rule__WClass__CatTypeAssignment_5_0_0();

            state._fsp--;


            }

             after(grammarAccess.getWClassAccess().getCatTypeAssignment_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_5_0__0__Impl"


    // $ANTLR start "rule__WClass__Group_5_0__1"
    // InternalOntoL.g:2772:1: rule__WClass__Group_5_0__1 : rule__WClass__Group_5_0__1__Impl ;
    public final void rule__WClass__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2776:1: ( rule__WClass__Group_5_0__1__Impl )
            // InternalOntoL.g:2777:2: rule__WClass__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WClass__Group_5_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_5_0__1"


    // $ANTLR start "rule__WClass__Group_5_0__1__Impl"
    // InternalOntoL.g:2783:1: rule__WClass__Group_5_0__1__Impl : ( ( rule__WClass__BasetypeAssignment_5_0_1 ) ) ;
    public final void rule__WClass__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2787:1: ( ( ( rule__WClass__BasetypeAssignment_5_0_1 ) ) )
            // InternalOntoL.g:2788:1: ( ( rule__WClass__BasetypeAssignment_5_0_1 ) )
            {
            // InternalOntoL.g:2788:1: ( ( rule__WClass__BasetypeAssignment_5_0_1 ) )
            // InternalOntoL.g:2789:2: ( rule__WClass__BasetypeAssignment_5_0_1 )
            {
             before(grammarAccess.getWClassAccess().getBasetypeAssignment_5_0_1()); 
            // InternalOntoL.g:2790:2: ( rule__WClass__BasetypeAssignment_5_0_1 )
            // InternalOntoL.g:2790:3: rule__WClass__BasetypeAssignment_5_0_1
            {
            pushFollow(FOLLOW_2);
            rule__WClass__BasetypeAssignment_5_0_1();

            state._fsp--;


            }

             after(grammarAccess.getWClassAccess().getBasetypeAssignment_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_5_0__1__Impl"


    // $ANTLR start "rule__WClass__Group_5_1__0"
    // InternalOntoL.g:2799:1: rule__WClass__Group_5_1__0 : rule__WClass__Group_5_1__0__Impl rule__WClass__Group_5_1__1 ;
    public final void rule__WClass__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2803:1: ( rule__WClass__Group_5_1__0__Impl rule__WClass__Group_5_1__1 )
            // InternalOntoL.g:2804:2: rule__WClass__Group_5_1__0__Impl rule__WClass__Group_5_1__1
            {
            pushFollow(FOLLOW_3);
            rule__WClass__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WClass__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_5_1__0"


    // $ANTLR start "rule__WClass__Group_5_1__0__Impl"
    // InternalOntoL.g:2811:1: rule__WClass__Group_5_1__0__Impl : ( 'ispowertypeof' ) ;
    public final void rule__WClass__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2815:1: ( ( 'ispowertypeof' ) )
            // InternalOntoL.g:2816:1: ( 'ispowertypeof' )
            {
            // InternalOntoL.g:2816:1: ( 'ispowertypeof' )
            // InternalOntoL.g:2817:2: 'ispowertypeof'
            {
             before(grammarAccess.getWClassAccess().getIspowertypeofKeyword_5_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getWClassAccess().getIspowertypeofKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_5_1__0__Impl"


    // $ANTLR start "rule__WClass__Group_5_1__1"
    // InternalOntoL.g:2826:1: rule__WClass__Group_5_1__1 : rule__WClass__Group_5_1__1__Impl ;
    public final void rule__WClass__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2830:1: ( rule__WClass__Group_5_1__1__Impl )
            // InternalOntoL.g:2831:2: rule__WClass__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WClass__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_5_1__1"


    // $ANTLR start "rule__WClass__Group_5_1__1__Impl"
    // InternalOntoL.g:2837:1: rule__WClass__Group_5_1__1__Impl : ( ( rule__WClass__PowertypeOfAssignment_5_1_1 ) ) ;
    public final void rule__WClass__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2841:1: ( ( ( rule__WClass__PowertypeOfAssignment_5_1_1 ) ) )
            // InternalOntoL.g:2842:1: ( ( rule__WClass__PowertypeOfAssignment_5_1_1 ) )
            {
            // InternalOntoL.g:2842:1: ( ( rule__WClass__PowertypeOfAssignment_5_1_1 ) )
            // InternalOntoL.g:2843:2: ( rule__WClass__PowertypeOfAssignment_5_1_1 )
            {
             before(grammarAccess.getWClassAccess().getPowertypeOfAssignment_5_1_1()); 
            // InternalOntoL.g:2844:2: ( rule__WClass__PowertypeOfAssignment_5_1_1 )
            // InternalOntoL.g:2844:3: rule__WClass__PowertypeOfAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__WClass__PowertypeOfAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getWClassAccess().getPowertypeOfAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__Group_5_1__1__Impl"


    // $ANTLR start "rule__FOClass__Group__0"
    // InternalOntoL.g:2853:1: rule__FOClass__Group__0 : rule__FOClass__Group__0__Impl rule__FOClass__Group__1 ;
    public final void rule__FOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2857:1: ( rule__FOClass__Group__0__Impl rule__FOClass__Group__1 )
            // InternalOntoL.g:2858:2: rule__FOClass__Group__0__Impl rule__FOClass__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalOntoL.g:2865:1: rule__FOClass__Group__0__Impl : ( 'foclass' ) ;
    public final void rule__FOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2869:1: ( ( 'foclass' ) )
            // InternalOntoL.g:2870:1: ( 'foclass' )
            {
            // InternalOntoL.g:2870:1: ( 'foclass' )
            // InternalOntoL.g:2871:2: 'foclass'
            {
             before(grammarAccess.getFOClassAccess().getFoclassKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFOClassAccess().getFoclassKeyword_0()); 

            }


            }

        }
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
    // InternalOntoL.g:2880:1: rule__FOClass__Group__1 : rule__FOClass__Group__1__Impl rule__FOClass__Group__2 ;
    public final void rule__FOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2884:1: ( rule__FOClass__Group__1__Impl rule__FOClass__Group__2 )
            // InternalOntoL.g:2885:2: rule__FOClass__Group__1__Impl rule__FOClass__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalOntoL.g:2892:1: rule__FOClass__Group__1__Impl : ( ( rule__FOClass__NameAssignment_1 ) ) ;
    public final void rule__FOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2896:1: ( ( ( rule__FOClass__NameAssignment_1 ) ) )
            // InternalOntoL.g:2897:1: ( ( rule__FOClass__NameAssignment_1 ) )
            {
            // InternalOntoL.g:2897:1: ( ( rule__FOClass__NameAssignment_1 ) )
            // InternalOntoL.g:2898:2: ( rule__FOClass__NameAssignment_1 )
            {
             before(grammarAccess.getFOClassAccess().getNameAssignment_1()); 
            // InternalOntoL.g:2899:2: ( rule__FOClass__NameAssignment_1 )
            // InternalOntoL.g:2899:3: rule__FOClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFOClassAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalOntoL.g:2907:1: rule__FOClass__Group__2 : rule__FOClass__Group__2__Impl rule__FOClass__Group__3 ;
    public final void rule__FOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2911:1: ( rule__FOClass__Group__2__Impl rule__FOClass__Group__3 )
            // InternalOntoL.g:2912:2: rule__FOClass__Group__2__Impl rule__FOClass__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalOntoL.g:2919:1: rule__FOClass__Group__2__Impl : ( ( rule__FOClass__Group_2__0 )? ) ;
    public final void rule__FOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2923:1: ( ( ( rule__FOClass__Group_2__0 )? ) )
            // InternalOntoL.g:2924:1: ( ( rule__FOClass__Group_2__0 )? )
            {
            // InternalOntoL.g:2924:1: ( ( rule__FOClass__Group_2__0 )? )
            // InternalOntoL.g:2925:2: ( rule__FOClass__Group_2__0 )?
            {
             before(grammarAccess.getFOClassAccess().getGroup_2()); 
            // InternalOntoL.g:2926:2: ( rule__FOClass__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOntoL.g:2926:3: rule__FOClass__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FOClass__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFOClassAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalOntoL.g:2934:1: rule__FOClass__Group__3 : rule__FOClass__Group__3__Impl ;
    public final void rule__FOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2938:1: ( rule__FOClass__Group__3__Impl )
            // InternalOntoL.g:2939:2: rule__FOClass__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalOntoL.g:2945:1: rule__FOClass__Group__3__Impl : ( ( rule__FOClass__Group_3__0 )? ) ;
    public final void rule__FOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2949:1: ( ( ( rule__FOClass__Group_3__0 )? ) )
            // InternalOntoL.g:2950:1: ( ( rule__FOClass__Group_3__0 )? )
            {
            // InternalOntoL.g:2950:1: ( ( rule__FOClass__Group_3__0 )? )
            // InternalOntoL.g:2951:2: ( rule__FOClass__Group_3__0 )?
            {
             before(grammarAccess.getFOClassAccess().getGroup_3()); 
            // InternalOntoL.g:2952:2: ( rule__FOClass__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==30) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOntoL.g:2952:3: rule__FOClass__Group_3__0
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


    // $ANTLR start "rule__FOClass__Group_2__0"
    // InternalOntoL.g:2961:1: rule__FOClass__Group_2__0 : rule__FOClass__Group_2__0__Impl rule__FOClass__Group_2__1 ;
    public final void rule__FOClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2965:1: ( rule__FOClass__Group_2__0__Impl rule__FOClass__Group_2__1 )
            // InternalOntoL.g:2966:2: rule__FOClass__Group_2__0__Impl rule__FOClass__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__FOClass__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClass__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_2__0"


    // $ANTLR start "rule__FOClass__Group_2__0__Impl"
    // InternalOntoL.g:2973:1: rule__FOClass__Group_2__0__Impl : ( ':' ) ;
    public final void rule__FOClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2977:1: ( ( ':' ) )
            // InternalOntoL.g:2978:1: ( ':' )
            {
            // InternalOntoL.g:2978:1: ( ':' )
            // InternalOntoL.g:2979:2: ':'
            {
             before(grammarAccess.getFOClassAccess().getColonKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFOClassAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_2__0__Impl"


    // $ANTLR start "rule__FOClass__Group_2__1"
    // InternalOntoL.g:2988:1: rule__FOClass__Group_2__1 : rule__FOClass__Group_2__1__Impl rule__FOClass__Group_2__2 ;
    public final void rule__FOClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:2992:1: ( rule__FOClass__Group_2__1__Impl rule__FOClass__Group_2__2 )
            // InternalOntoL.g:2993:2: rule__FOClass__Group_2__1__Impl rule__FOClass__Group_2__2
            {
            pushFollow(FOLLOW_12);
            rule__FOClass__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClass__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_2__1"


    // $ANTLR start "rule__FOClass__Group_2__1__Impl"
    // InternalOntoL.g:3000:1: rule__FOClass__Group_2__1__Impl : ( ( rule__FOClass__FixedTypesAssignment_2_1 ) ) ;
    public final void rule__FOClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3004:1: ( ( ( rule__FOClass__FixedTypesAssignment_2_1 ) ) )
            // InternalOntoL.g:3005:1: ( ( rule__FOClass__FixedTypesAssignment_2_1 ) )
            {
            // InternalOntoL.g:3005:1: ( ( rule__FOClass__FixedTypesAssignment_2_1 ) )
            // InternalOntoL.g:3006:2: ( rule__FOClass__FixedTypesAssignment_2_1 )
            {
             before(grammarAccess.getFOClassAccess().getFixedTypesAssignment_2_1()); 
            // InternalOntoL.g:3007:2: ( rule__FOClass__FixedTypesAssignment_2_1 )
            // InternalOntoL.g:3007:3: rule__FOClass__FixedTypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__FixedTypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFOClassAccess().getFixedTypesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_2__1__Impl"


    // $ANTLR start "rule__FOClass__Group_2__2"
    // InternalOntoL.g:3015:1: rule__FOClass__Group_2__2 : rule__FOClass__Group_2__2__Impl ;
    public final void rule__FOClass__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3019:1: ( rule__FOClass__Group_2__2__Impl )
            // InternalOntoL.g:3020:2: rule__FOClass__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_2__2"


    // $ANTLR start "rule__FOClass__Group_2__2__Impl"
    // InternalOntoL.g:3026:1: rule__FOClass__Group_2__2__Impl : ( ( rule__FOClass__Group_2_2__0 )* ) ;
    public final void rule__FOClass__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3030:1: ( ( ( rule__FOClass__Group_2_2__0 )* ) )
            // InternalOntoL.g:3031:1: ( ( rule__FOClass__Group_2_2__0 )* )
            {
            // InternalOntoL.g:3031:1: ( ( rule__FOClass__Group_2_2__0 )* )
            // InternalOntoL.g:3032:2: ( rule__FOClass__Group_2_2__0 )*
            {
             before(grammarAccess.getFOClassAccess().getGroup_2_2()); 
            // InternalOntoL.g:3033:2: ( rule__FOClass__Group_2_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==27) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalOntoL.g:3033:3: rule__FOClass__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__FOClass__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getFOClassAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_2__2__Impl"


    // $ANTLR start "rule__FOClass__Group_2_2__0"
    // InternalOntoL.g:3042:1: rule__FOClass__Group_2_2__0 : rule__FOClass__Group_2_2__0__Impl rule__FOClass__Group_2_2__1 ;
    public final void rule__FOClass__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3046:1: ( rule__FOClass__Group_2_2__0__Impl rule__FOClass__Group_2_2__1 )
            // InternalOntoL.g:3047:2: rule__FOClass__Group_2_2__0__Impl rule__FOClass__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__FOClass__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClass__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_2_2__0"


    // $ANTLR start "rule__FOClass__Group_2_2__0__Impl"
    // InternalOntoL.g:3054:1: rule__FOClass__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__FOClass__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3058:1: ( ( ',' ) )
            // InternalOntoL.g:3059:1: ( ',' )
            {
            // InternalOntoL.g:3059:1: ( ',' )
            // InternalOntoL.g:3060:2: ','
            {
             before(grammarAccess.getFOClassAccess().getCommaKeyword_2_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFOClassAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_2_2__0__Impl"


    // $ANTLR start "rule__FOClass__Group_2_2__1"
    // InternalOntoL.g:3069:1: rule__FOClass__Group_2_2__1 : rule__FOClass__Group_2_2__1__Impl ;
    public final void rule__FOClass__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3073:1: ( rule__FOClass__Group_2_2__1__Impl )
            // InternalOntoL.g:3074:2: rule__FOClass__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_2_2__1"


    // $ANTLR start "rule__FOClass__Group_2_2__1__Impl"
    // InternalOntoL.g:3080:1: rule__FOClass__Group_2_2__1__Impl : ( ( rule__FOClass__FixedTypesAssignment_2_2_1 ) ) ;
    public final void rule__FOClass__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3084:1: ( ( ( rule__FOClass__FixedTypesAssignment_2_2_1 ) ) )
            // InternalOntoL.g:3085:1: ( ( rule__FOClass__FixedTypesAssignment_2_2_1 ) )
            {
            // InternalOntoL.g:3085:1: ( ( rule__FOClass__FixedTypesAssignment_2_2_1 ) )
            // InternalOntoL.g:3086:2: ( rule__FOClass__FixedTypesAssignment_2_2_1 )
            {
             before(grammarAccess.getFOClassAccess().getFixedTypesAssignment_2_2_1()); 
            // InternalOntoL.g:3087:2: ( rule__FOClass__FixedTypesAssignment_2_2_1 )
            // InternalOntoL.g:3087:3: rule__FOClass__FixedTypesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__FixedTypesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFOClassAccess().getFixedTypesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group_2_2__1__Impl"


    // $ANTLR start "rule__FOClass__Group_3__0"
    // InternalOntoL.g:3096:1: rule__FOClass__Group_3__0 : rule__FOClass__Group_3__0__Impl rule__FOClass__Group_3__1 ;
    public final void rule__FOClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3100:1: ( rule__FOClass__Group_3__0__Impl rule__FOClass__Group_3__1 )
            // InternalOntoL.g:3101:2: rule__FOClass__Group_3__0__Impl rule__FOClass__Group_3__1
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
    // InternalOntoL.g:3108:1: rule__FOClass__Group_3__0__Impl : ( 'specializes' ) ;
    public final void rule__FOClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3112:1: ( ( 'specializes' ) )
            // InternalOntoL.g:3113:1: ( 'specializes' )
            {
            // InternalOntoL.g:3113:1: ( 'specializes' )
            // InternalOntoL.g:3114:2: 'specializes'
            {
             before(grammarAccess.getFOClassAccess().getSpecializesKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFOClassAccess().getSpecializesKeyword_3_0()); 

            }


            }

        }
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
    // InternalOntoL.g:3123:1: rule__FOClass__Group_3__1 : rule__FOClass__Group_3__1__Impl rule__FOClass__Group_3__2 ;
    public final void rule__FOClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3127:1: ( rule__FOClass__Group_3__1__Impl rule__FOClass__Group_3__2 )
            // InternalOntoL.g:3128:2: rule__FOClass__Group_3__1__Impl rule__FOClass__Group_3__2
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
    // InternalOntoL.g:3135:1: rule__FOClass__Group_3__1__Impl : ( ( rule__FOClass__SuperClassesAssignment_3_1 ) ) ;
    public final void rule__FOClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3139:1: ( ( ( rule__FOClass__SuperClassesAssignment_3_1 ) ) )
            // InternalOntoL.g:3140:1: ( ( rule__FOClass__SuperClassesAssignment_3_1 ) )
            {
            // InternalOntoL.g:3140:1: ( ( rule__FOClass__SuperClassesAssignment_3_1 ) )
            // InternalOntoL.g:3141:2: ( rule__FOClass__SuperClassesAssignment_3_1 )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesAssignment_3_1()); 
            // InternalOntoL.g:3142:2: ( rule__FOClass__SuperClassesAssignment_3_1 )
            // InternalOntoL.g:3142:3: rule__FOClass__SuperClassesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__SuperClassesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFOClassAccess().getSuperClassesAssignment_3_1()); 

            }


            }

        }
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
    // InternalOntoL.g:3150:1: rule__FOClass__Group_3__2 : rule__FOClass__Group_3__2__Impl ;
    public final void rule__FOClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3154:1: ( rule__FOClass__Group_3__2__Impl )
            // InternalOntoL.g:3155:2: rule__FOClass__Group_3__2__Impl
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
    // InternalOntoL.g:3161:1: rule__FOClass__Group_3__2__Impl : ( ( rule__FOClass__Group_3_2__0 )* ) ;
    public final void rule__FOClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3165:1: ( ( ( rule__FOClass__Group_3_2__0 )* ) )
            // InternalOntoL.g:3166:1: ( ( rule__FOClass__Group_3_2__0 )* )
            {
            // InternalOntoL.g:3166:1: ( ( rule__FOClass__Group_3_2__0 )* )
            // InternalOntoL.g:3167:2: ( rule__FOClass__Group_3_2__0 )*
            {
             before(grammarAccess.getFOClassAccess().getGroup_3_2()); 
            // InternalOntoL.g:3168:2: ( rule__FOClass__Group_3_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==27) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalOntoL.g:3168:3: rule__FOClass__Group_3_2__0
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
    // InternalOntoL.g:3177:1: rule__FOClass__Group_3_2__0 : rule__FOClass__Group_3_2__0__Impl rule__FOClass__Group_3_2__1 ;
    public final void rule__FOClass__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3181:1: ( rule__FOClass__Group_3_2__0__Impl rule__FOClass__Group_3_2__1 )
            // InternalOntoL.g:3182:2: rule__FOClass__Group_3_2__0__Impl rule__FOClass__Group_3_2__1
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
    // InternalOntoL.g:3189:1: rule__FOClass__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__FOClass__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3193:1: ( ( ',' ) )
            // InternalOntoL.g:3194:1: ( ',' )
            {
            // InternalOntoL.g:3194:1: ( ',' )
            // InternalOntoL.g:3195:2: ','
            {
             before(grammarAccess.getFOClassAccess().getCommaKeyword_3_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoL.g:3204:1: rule__FOClass__Group_3_2__1 : rule__FOClass__Group_3_2__1__Impl ;
    public final void rule__FOClass__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3208:1: ( rule__FOClass__Group_3_2__1__Impl )
            // InternalOntoL.g:3209:2: rule__FOClass__Group_3_2__1__Impl
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
    // InternalOntoL.g:3215:1: rule__FOClass__Group_3_2__1__Impl : ( ( rule__FOClass__SuperClassesAssignment_3_2_1 ) ) ;
    public final void rule__FOClass__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3219:1: ( ( ( rule__FOClass__SuperClassesAssignment_3_2_1 ) ) )
            // InternalOntoL.g:3220:1: ( ( rule__FOClass__SuperClassesAssignment_3_2_1 ) )
            {
            // InternalOntoL.g:3220:1: ( ( rule__FOClass__SuperClassesAssignment_3_2_1 ) )
            // InternalOntoL.g:3221:2: ( rule__FOClass__SuperClassesAssignment_3_2_1 )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesAssignment_3_2_1()); 
            // InternalOntoL.g:3222:2: ( rule__FOClass__SuperClassesAssignment_3_2_1 )
            // InternalOntoL.g:3222:3: rule__FOClass__SuperClassesAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__SuperClassesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFOClassAccess().getSuperClassesAssignment_3_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__HOClass__Group__0"
    // InternalOntoL.g:3231:1: rule__HOClass__Group__0 : rule__HOClass__Group__0__Impl rule__HOClass__Group__1 ;
    public final void rule__HOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3235:1: ( rule__HOClass__Group__0__Impl rule__HOClass__Group__1 )
            // InternalOntoL.g:3236:2: rule__HOClass__Group__0__Impl rule__HOClass__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalOntoL.g:3243:1: rule__HOClass__Group__0__Impl : ( 'hoclass' ) ;
    public final void rule__HOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3247:1: ( ( 'hoclass' ) )
            // InternalOntoL.g:3248:1: ( 'hoclass' )
            {
            // InternalOntoL.g:3248:1: ( 'hoclass' )
            // InternalOntoL.g:3249:2: 'hoclass'
            {
             before(grammarAccess.getHOClassAccess().getHoclassKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getHoclassKeyword_0()); 

            }


            }

        }
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
    // InternalOntoL.g:3258:1: rule__HOClass__Group__1 : rule__HOClass__Group__1__Impl rule__HOClass__Group__2 ;
    public final void rule__HOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3262:1: ( rule__HOClass__Group__1__Impl rule__HOClass__Group__2 )
            // InternalOntoL.g:3263:2: rule__HOClass__Group__1__Impl rule__HOClass__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalOntoL.g:3270:1: rule__HOClass__Group__1__Impl : ( ( rule__HOClass__NameAssignment_1 ) ) ;
    public final void rule__HOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3274:1: ( ( ( rule__HOClass__NameAssignment_1 ) ) )
            // InternalOntoL.g:3275:1: ( ( rule__HOClass__NameAssignment_1 ) )
            {
            // InternalOntoL.g:3275:1: ( ( rule__HOClass__NameAssignment_1 ) )
            // InternalOntoL.g:3276:2: ( rule__HOClass__NameAssignment_1 )
            {
             before(grammarAccess.getHOClassAccess().getNameAssignment_1()); 
            // InternalOntoL.g:3277:2: ( rule__HOClass__NameAssignment_1 )
            // InternalOntoL.g:3277:3: rule__HOClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalOntoL.g:3285:1: rule__HOClass__Group__2 : rule__HOClass__Group__2__Impl rule__HOClass__Group__3 ;
    public final void rule__HOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3289:1: ( rule__HOClass__Group__2__Impl rule__HOClass__Group__3 )
            // InternalOntoL.g:3290:2: rule__HOClass__Group__2__Impl rule__HOClass__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalOntoL.g:3297:1: rule__HOClass__Group__2__Impl : ( 'order' ) ;
    public final void rule__HOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3301:1: ( ( 'order' ) )
            // InternalOntoL.g:3302:1: ( 'order' )
            {
            // InternalOntoL.g:3302:1: ( 'order' )
            // InternalOntoL.g:3303:2: 'order'
            {
             before(grammarAccess.getHOClassAccess().getOrderKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getOrderKeyword_2()); 

            }


            }

        }
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
    // InternalOntoL.g:3312:1: rule__HOClass__Group__3 : rule__HOClass__Group__3__Impl rule__HOClass__Group__4 ;
    public final void rule__HOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3316:1: ( rule__HOClass__Group__3__Impl rule__HOClass__Group__4 )
            // InternalOntoL.g:3317:2: rule__HOClass__Group__3__Impl rule__HOClass__Group__4
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
    // InternalOntoL.g:3324:1: rule__HOClass__Group__3__Impl : ( ( rule__HOClass__OrderAssignment_3 ) ) ;
    public final void rule__HOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3328:1: ( ( ( rule__HOClass__OrderAssignment_3 ) ) )
            // InternalOntoL.g:3329:1: ( ( rule__HOClass__OrderAssignment_3 ) )
            {
            // InternalOntoL.g:3329:1: ( ( rule__HOClass__OrderAssignment_3 ) )
            // InternalOntoL.g:3330:2: ( rule__HOClass__OrderAssignment_3 )
            {
             before(grammarAccess.getHOClassAccess().getOrderAssignment_3()); 
            // InternalOntoL.g:3331:2: ( rule__HOClass__OrderAssignment_3 )
            // InternalOntoL.g:3331:3: rule__HOClass__OrderAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__OrderAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getOrderAssignment_3()); 

            }


            }

        }
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
    // InternalOntoL.g:3339:1: rule__HOClass__Group__4 : rule__HOClass__Group__4__Impl rule__HOClass__Group__5 ;
    public final void rule__HOClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3343:1: ( rule__HOClass__Group__4__Impl rule__HOClass__Group__5 )
            // InternalOntoL.g:3344:2: rule__HOClass__Group__4__Impl rule__HOClass__Group__5
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
    // InternalOntoL.g:3351:1: rule__HOClass__Group__4__Impl : ( ( rule__HOClass__Group_4__0 )? ) ;
    public final void rule__HOClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3355:1: ( ( ( rule__HOClass__Group_4__0 )? ) )
            // InternalOntoL.g:3356:1: ( ( rule__HOClass__Group_4__0 )? )
            {
            // InternalOntoL.g:3356:1: ( ( rule__HOClass__Group_4__0 )? )
            // InternalOntoL.g:3357:2: ( rule__HOClass__Group_4__0 )?
            {
             before(grammarAccess.getHOClassAccess().getGroup_4()); 
            // InternalOntoL.g:3358:2: ( rule__HOClass__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==26) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOntoL.g:3358:3: rule__HOClass__Group_4__0
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
    // InternalOntoL.g:3366:1: rule__HOClass__Group__5 : rule__HOClass__Group__5__Impl rule__HOClass__Group__6 ;
    public final void rule__HOClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3370:1: ( rule__HOClass__Group__5__Impl rule__HOClass__Group__6 )
            // InternalOntoL.g:3371:2: rule__HOClass__Group__5__Impl rule__HOClass__Group__6
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
    // InternalOntoL.g:3378:1: rule__HOClass__Group__5__Impl : ( ( rule__HOClass__Group_5__0 )? ) ;
    public final void rule__HOClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3382:1: ( ( ( rule__HOClass__Group_5__0 )? ) )
            // InternalOntoL.g:3383:1: ( ( rule__HOClass__Group_5__0 )? )
            {
            // InternalOntoL.g:3383:1: ( ( rule__HOClass__Group_5__0 )? )
            // InternalOntoL.g:3384:2: ( rule__HOClass__Group_5__0 )?
            {
             before(grammarAccess.getHOClassAccess().getGroup_5()); 
            // InternalOntoL.g:3385:2: ( rule__HOClass__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==30) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOntoL.g:3385:3: rule__HOClass__Group_5__0
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
    // InternalOntoL.g:3393:1: rule__HOClass__Group__6 : rule__HOClass__Group__6__Impl rule__HOClass__Group__7 ;
    public final void rule__HOClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3397:1: ( rule__HOClass__Group__6__Impl rule__HOClass__Group__7 )
            // InternalOntoL.g:3398:2: rule__HOClass__Group__6__Impl rule__HOClass__Group__7
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
    // InternalOntoL.g:3405:1: rule__HOClass__Group__6__Impl : ( ( rule__HOClass__Group_6__0 )? ) ;
    public final void rule__HOClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3409:1: ( ( ( rule__HOClass__Group_6__0 )? ) )
            // InternalOntoL.g:3410:1: ( ( rule__HOClass__Group_6__0 )? )
            {
            // InternalOntoL.g:3410:1: ( ( rule__HOClass__Group_6__0 )? )
            // InternalOntoL.g:3411:2: ( rule__HOClass__Group_6__0 )?
            {
             before(grammarAccess.getHOClassAccess().getGroup_6()); 
            // InternalOntoL.g:3412:2: ( rule__HOClass__Group_6__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==31) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOntoL.g:3412:3: rule__HOClass__Group_6__0
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
    // InternalOntoL.g:3420:1: rule__HOClass__Group__7 : rule__HOClass__Group__7__Impl ;
    public final void rule__HOClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3424:1: ( rule__HOClass__Group__7__Impl )
            // InternalOntoL.g:3425:2: rule__HOClass__Group__7__Impl
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
    // InternalOntoL.g:3431:1: rule__HOClass__Group__7__Impl : ( ( rule__HOClass__Alternatives_7 )? ) ;
    public final void rule__HOClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3435:1: ( ( ( rule__HOClass__Alternatives_7 )? ) )
            // InternalOntoL.g:3436:1: ( ( rule__HOClass__Alternatives_7 )? )
            {
            // InternalOntoL.g:3436:1: ( ( rule__HOClass__Alternatives_7 )? )
            // InternalOntoL.g:3437:2: ( rule__HOClass__Alternatives_7 )?
            {
             before(grammarAccess.getHOClassAccess().getAlternatives_7()); 
            // InternalOntoL.g:3438:2: ( rule__HOClass__Alternatives_7 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=14 && LA39_0<=17)||LA39_0==32) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOntoL.g:3438:3: rule__HOClass__Alternatives_7
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
    // InternalOntoL.g:3447:1: rule__HOClass__Group_4__0 : rule__HOClass__Group_4__0__Impl rule__HOClass__Group_4__1 ;
    public final void rule__HOClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3451:1: ( rule__HOClass__Group_4__0__Impl rule__HOClass__Group_4__1 )
            // InternalOntoL.g:3452:2: rule__HOClass__Group_4__0__Impl rule__HOClass__Group_4__1
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
    // InternalOntoL.g:3459:1: rule__HOClass__Group_4__0__Impl : ( ':' ) ;
    public final void rule__HOClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3463:1: ( ( ':' ) )
            // InternalOntoL.g:3464:1: ( ':' )
            {
            // InternalOntoL.g:3464:1: ( ':' )
            // InternalOntoL.g:3465:2: ':'
            {
             before(grammarAccess.getHOClassAccess().getColonKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalOntoL.g:3474:1: rule__HOClass__Group_4__1 : rule__HOClass__Group_4__1__Impl rule__HOClass__Group_4__2 ;
    public final void rule__HOClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3478:1: ( rule__HOClass__Group_4__1__Impl rule__HOClass__Group_4__2 )
            // InternalOntoL.g:3479:2: rule__HOClass__Group_4__1__Impl rule__HOClass__Group_4__2
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
    // InternalOntoL.g:3486:1: rule__HOClass__Group_4__1__Impl : ( ( rule__HOClass__FixedTypesAssignment_4_1 ) ) ;
    public final void rule__HOClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3490:1: ( ( ( rule__HOClass__FixedTypesAssignment_4_1 ) ) )
            // InternalOntoL.g:3491:1: ( ( rule__HOClass__FixedTypesAssignment_4_1 ) )
            {
            // InternalOntoL.g:3491:1: ( ( rule__HOClass__FixedTypesAssignment_4_1 ) )
            // InternalOntoL.g:3492:2: ( rule__HOClass__FixedTypesAssignment_4_1 )
            {
             before(grammarAccess.getHOClassAccess().getFixedTypesAssignment_4_1()); 
            // InternalOntoL.g:3493:2: ( rule__HOClass__FixedTypesAssignment_4_1 )
            // InternalOntoL.g:3493:3: rule__HOClass__FixedTypesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__FixedTypesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getFixedTypesAssignment_4_1()); 

            }


            }

        }
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
    // InternalOntoL.g:3501:1: rule__HOClass__Group_4__2 : rule__HOClass__Group_4__2__Impl ;
    public final void rule__HOClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3505:1: ( rule__HOClass__Group_4__2__Impl )
            // InternalOntoL.g:3506:2: rule__HOClass__Group_4__2__Impl
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
    // InternalOntoL.g:3512:1: rule__HOClass__Group_4__2__Impl : ( ( rule__HOClass__Group_4_2__0 )* ) ;
    public final void rule__HOClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3516:1: ( ( ( rule__HOClass__Group_4_2__0 )* ) )
            // InternalOntoL.g:3517:1: ( ( rule__HOClass__Group_4_2__0 )* )
            {
            // InternalOntoL.g:3517:1: ( ( rule__HOClass__Group_4_2__0 )* )
            // InternalOntoL.g:3518:2: ( rule__HOClass__Group_4_2__0 )*
            {
             before(grammarAccess.getHOClassAccess().getGroup_4_2()); 
            // InternalOntoL.g:3519:2: ( rule__HOClass__Group_4_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==27) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalOntoL.g:3519:3: rule__HOClass__Group_4_2__0
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
    // InternalOntoL.g:3528:1: rule__HOClass__Group_4_2__0 : rule__HOClass__Group_4_2__0__Impl rule__HOClass__Group_4_2__1 ;
    public final void rule__HOClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3532:1: ( rule__HOClass__Group_4_2__0__Impl rule__HOClass__Group_4_2__1 )
            // InternalOntoL.g:3533:2: rule__HOClass__Group_4_2__0__Impl rule__HOClass__Group_4_2__1
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
    // InternalOntoL.g:3540:1: rule__HOClass__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__HOClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3544:1: ( ( ',' ) )
            // InternalOntoL.g:3545:1: ( ',' )
            {
            // InternalOntoL.g:3545:1: ( ',' )
            // InternalOntoL.g:3546:2: ','
            {
             before(grammarAccess.getHOClassAccess().getCommaKeyword_4_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoL.g:3555:1: rule__HOClass__Group_4_2__1 : rule__HOClass__Group_4_2__1__Impl ;
    public final void rule__HOClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3559:1: ( rule__HOClass__Group_4_2__1__Impl )
            // InternalOntoL.g:3560:2: rule__HOClass__Group_4_2__1__Impl
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
    // InternalOntoL.g:3566:1: rule__HOClass__Group_4_2__1__Impl : ( ( rule__HOClass__FixedTypesAssignment_4_2_1 ) ) ;
    public final void rule__HOClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3570:1: ( ( ( rule__HOClass__FixedTypesAssignment_4_2_1 ) ) )
            // InternalOntoL.g:3571:1: ( ( rule__HOClass__FixedTypesAssignment_4_2_1 ) )
            {
            // InternalOntoL.g:3571:1: ( ( rule__HOClass__FixedTypesAssignment_4_2_1 ) )
            // InternalOntoL.g:3572:2: ( rule__HOClass__FixedTypesAssignment_4_2_1 )
            {
             before(grammarAccess.getHOClassAccess().getFixedTypesAssignment_4_2_1()); 
            // InternalOntoL.g:3573:2: ( rule__HOClass__FixedTypesAssignment_4_2_1 )
            // InternalOntoL.g:3573:3: rule__HOClass__FixedTypesAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__FixedTypesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getFixedTypesAssignment_4_2_1()); 

            }


            }

        }
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
    // InternalOntoL.g:3582:1: rule__HOClass__Group_5__0 : rule__HOClass__Group_5__0__Impl rule__HOClass__Group_5__1 ;
    public final void rule__HOClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3586:1: ( rule__HOClass__Group_5__0__Impl rule__HOClass__Group_5__1 )
            // InternalOntoL.g:3587:2: rule__HOClass__Group_5__0__Impl rule__HOClass__Group_5__1
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
    // InternalOntoL.g:3594:1: rule__HOClass__Group_5__0__Impl : ( 'specializes' ) ;
    public final void rule__HOClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3598:1: ( ( 'specializes' ) )
            // InternalOntoL.g:3599:1: ( 'specializes' )
            {
            // InternalOntoL.g:3599:1: ( 'specializes' )
            // InternalOntoL.g:3600:2: 'specializes'
            {
             before(grammarAccess.getHOClassAccess().getSpecializesKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalOntoL.g:3609:1: rule__HOClass__Group_5__1 : rule__HOClass__Group_5__1__Impl rule__HOClass__Group_5__2 ;
    public final void rule__HOClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3613:1: ( rule__HOClass__Group_5__1__Impl rule__HOClass__Group_5__2 )
            // InternalOntoL.g:3614:2: rule__HOClass__Group_5__1__Impl rule__HOClass__Group_5__2
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
    // InternalOntoL.g:3621:1: rule__HOClass__Group_5__1__Impl : ( ( rule__HOClass__SuperClassesAssignment_5_1 ) ) ;
    public final void rule__HOClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3625:1: ( ( ( rule__HOClass__SuperClassesAssignment_5_1 ) ) )
            // InternalOntoL.g:3626:1: ( ( rule__HOClass__SuperClassesAssignment_5_1 ) )
            {
            // InternalOntoL.g:3626:1: ( ( rule__HOClass__SuperClassesAssignment_5_1 ) )
            // InternalOntoL.g:3627:2: ( rule__HOClass__SuperClassesAssignment_5_1 )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesAssignment_5_1()); 
            // InternalOntoL.g:3628:2: ( rule__HOClass__SuperClassesAssignment_5_1 )
            // InternalOntoL.g:3628:3: rule__HOClass__SuperClassesAssignment_5_1
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
    // InternalOntoL.g:3636:1: rule__HOClass__Group_5__2 : rule__HOClass__Group_5__2__Impl ;
    public final void rule__HOClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3640:1: ( rule__HOClass__Group_5__2__Impl )
            // InternalOntoL.g:3641:2: rule__HOClass__Group_5__2__Impl
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
    // InternalOntoL.g:3647:1: rule__HOClass__Group_5__2__Impl : ( ( rule__HOClass__Group_5_2__0 )* ) ;
    public final void rule__HOClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3651:1: ( ( ( rule__HOClass__Group_5_2__0 )* ) )
            // InternalOntoL.g:3652:1: ( ( rule__HOClass__Group_5_2__0 )* )
            {
            // InternalOntoL.g:3652:1: ( ( rule__HOClass__Group_5_2__0 )* )
            // InternalOntoL.g:3653:2: ( rule__HOClass__Group_5_2__0 )*
            {
             before(grammarAccess.getHOClassAccess().getGroup_5_2()); 
            // InternalOntoL.g:3654:2: ( rule__HOClass__Group_5_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==27) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalOntoL.g:3654:3: rule__HOClass__Group_5_2__0
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
    // InternalOntoL.g:3663:1: rule__HOClass__Group_5_2__0 : rule__HOClass__Group_5_2__0__Impl rule__HOClass__Group_5_2__1 ;
    public final void rule__HOClass__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3667:1: ( rule__HOClass__Group_5_2__0__Impl rule__HOClass__Group_5_2__1 )
            // InternalOntoL.g:3668:2: rule__HOClass__Group_5_2__0__Impl rule__HOClass__Group_5_2__1
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
    // InternalOntoL.g:3675:1: rule__HOClass__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__HOClass__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3679:1: ( ( ',' ) )
            // InternalOntoL.g:3680:1: ( ',' )
            {
            // InternalOntoL.g:3680:1: ( ',' )
            // InternalOntoL.g:3681:2: ','
            {
             before(grammarAccess.getHOClassAccess().getCommaKeyword_5_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoL.g:3690:1: rule__HOClass__Group_5_2__1 : rule__HOClass__Group_5_2__1__Impl ;
    public final void rule__HOClass__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3694:1: ( rule__HOClass__Group_5_2__1__Impl )
            // InternalOntoL.g:3695:2: rule__HOClass__Group_5_2__1__Impl
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
    // InternalOntoL.g:3701:1: rule__HOClass__Group_5_2__1__Impl : ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) ) ;
    public final void rule__HOClass__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3705:1: ( ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) ) )
            // InternalOntoL.g:3706:1: ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) )
            {
            // InternalOntoL.g:3706:1: ( ( rule__HOClass__SuperClassesAssignment_5_2_1 ) )
            // InternalOntoL.g:3707:2: ( rule__HOClass__SuperClassesAssignment_5_2_1 )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesAssignment_5_2_1()); 
            // InternalOntoL.g:3708:2: ( rule__HOClass__SuperClassesAssignment_5_2_1 )
            // InternalOntoL.g:3708:3: rule__HOClass__SuperClassesAssignment_5_2_1
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
    // InternalOntoL.g:3717:1: rule__HOClass__Group_6__0 : rule__HOClass__Group_6__0__Impl rule__HOClass__Group_6__1 ;
    public final void rule__HOClass__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3721:1: ( rule__HOClass__Group_6__0__Impl rule__HOClass__Group_6__1 )
            // InternalOntoL.g:3722:2: rule__HOClass__Group_6__0__Impl rule__HOClass__Group_6__1
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
    // InternalOntoL.g:3729:1: rule__HOClass__Group_6__0__Impl : ( 'subordinatedto' ) ;
    public final void rule__HOClass__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3733:1: ( ( 'subordinatedto' ) )
            // InternalOntoL.g:3734:1: ( 'subordinatedto' )
            {
            // InternalOntoL.g:3734:1: ( 'subordinatedto' )
            // InternalOntoL.g:3735:2: 'subordinatedto'
            {
             before(grammarAccess.getHOClassAccess().getSubordinatedtoKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalOntoL.g:3744:1: rule__HOClass__Group_6__1 : rule__HOClass__Group_6__1__Impl rule__HOClass__Group_6__2 ;
    public final void rule__HOClass__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3748:1: ( rule__HOClass__Group_6__1__Impl rule__HOClass__Group_6__2 )
            // InternalOntoL.g:3749:2: rule__HOClass__Group_6__1__Impl rule__HOClass__Group_6__2
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
    // InternalOntoL.g:3756:1: rule__HOClass__Group_6__1__Impl : ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) ) ;
    public final void rule__HOClass__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3760:1: ( ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) ) )
            // InternalOntoL.g:3761:1: ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) )
            {
            // InternalOntoL.g:3761:1: ( ( rule__HOClass__SubordinatorsAssignment_6_1 ) )
            // InternalOntoL.g:3762:2: ( rule__HOClass__SubordinatorsAssignment_6_1 )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsAssignment_6_1()); 
            // InternalOntoL.g:3763:2: ( rule__HOClass__SubordinatorsAssignment_6_1 )
            // InternalOntoL.g:3763:3: rule__HOClass__SubordinatorsAssignment_6_1
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
    // InternalOntoL.g:3771:1: rule__HOClass__Group_6__2 : rule__HOClass__Group_6__2__Impl ;
    public final void rule__HOClass__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3775:1: ( rule__HOClass__Group_6__2__Impl )
            // InternalOntoL.g:3776:2: rule__HOClass__Group_6__2__Impl
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
    // InternalOntoL.g:3782:1: rule__HOClass__Group_6__2__Impl : ( ( rule__HOClass__Group_6_2__0 )* ) ;
    public final void rule__HOClass__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3786:1: ( ( ( rule__HOClass__Group_6_2__0 )* ) )
            // InternalOntoL.g:3787:1: ( ( rule__HOClass__Group_6_2__0 )* )
            {
            // InternalOntoL.g:3787:1: ( ( rule__HOClass__Group_6_2__0 )* )
            // InternalOntoL.g:3788:2: ( rule__HOClass__Group_6_2__0 )*
            {
             before(grammarAccess.getHOClassAccess().getGroup_6_2()); 
            // InternalOntoL.g:3789:2: ( rule__HOClass__Group_6_2__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==27) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalOntoL.g:3789:3: rule__HOClass__Group_6_2__0
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
    // InternalOntoL.g:3798:1: rule__HOClass__Group_6_2__0 : rule__HOClass__Group_6_2__0__Impl rule__HOClass__Group_6_2__1 ;
    public final void rule__HOClass__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3802:1: ( rule__HOClass__Group_6_2__0__Impl rule__HOClass__Group_6_2__1 )
            // InternalOntoL.g:3803:2: rule__HOClass__Group_6_2__0__Impl rule__HOClass__Group_6_2__1
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
    // InternalOntoL.g:3810:1: rule__HOClass__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__HOClass__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3814:1: ( ( ',' ) )
            // InternalOntoL.g:3815:1: ( ',' )
            {
            // InternalOntoL.g:3815:1: ( ',' )
            // InternalOntoL.g:3816:2: ','
            {
             before(grammarAccess.getHOClassAccess().getCommaKeyword_6_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoL.g:3825:1: rule__HOClass__Group_6_2__1 : rule__HOClass__Group_6_2__1__Impl ;
    public final void rule__HOClass__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3829:1: ( rule__HOClass__Group_6_2__1__Impl )
            // InternalOntoL.g:3830:2: rule__HOClass__Group_6_2__1__Impl
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
    // InternalOntoL.g:3836:1: rule__HOClass__Group_6_2__1__Impl : ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) ) ;
    public final void rule__HOClass__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3840:1: ( ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) ) )
            // InternalOntoL.g:3841:1: ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) )
            {
            // InternalOntoL.g:3841:1: ( ( rule__HOClass__SubordinatorsAssignment_6_2_1 ) )
            // InternalOntoL.g:3842:2: ( rule__HOClass__SubordinatorsAssignment_6_2_1 )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsAssignment_6_2_1()); 
            // InternalOntoL.g:3843:2: ( rule__HOClass__SubordinatorsAssignment_6_2_1 )
            // InternalOntoL.g:3843:3: rule__HOClass__SubordinatorsAssignment_6_2_1
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
    // InternalOntoL.g:3852:1: rule__HOClass__Group_7_0__0 : rule__HOClass__Group_7_0__0__Impl rule__HOClass__Group_7_0__1 ;
    public final void rule__HOClass__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3856:1: ( rule__HOClass__Group_7_0__0__Impl rule__HOClass__Group_7_0__1 )
            // InternalOntoL.g:3857:2: rule__HOClass__Group_7_0__0__Impl rule__HOClass__Group_7_0__1
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
    // InternalOntoL.g:3864:1: rule__HOClass__Group_7_0__0__Impl : ( ( rule__HOClass__CatTypeAssignment_7_0_0 ) ) ;
    public final void rule__HOClass__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3868:1: ( ( ( rule__HOClass__CatTypeAssignment_7_0_0 ) ) )
            // InternalOntoL.g:3869:1: ( ( rule__HOClass__CatTypeAssignment_7_0_0 ) )
            {
            // InternalOntoL.g:3869:1: ( ( rule__HOClass__CatTypeAssignment_7_0_0 ) )
            // InternalOntoL.g:3870:2: ( rule__HOClass__CatTypeAssignment_7_0_0 )
            {
             before(grammarAccess.getHOClassAccess().getCatTypeAssignment_7_0_0()); 
            // InternalOntoL.g:3871:2: ( rule__HOClass__CatTypeAssignment_7_0_0 )
            // InternalOntoL.g:3871:3: rule__HOClass__CatTypeAssignment_7_0_0
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__CatTypeAssignment_7_0_0();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getCatTypeAssignment_7_0_0()); 

            }


            }

        }
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
    // InternalOntoL.g:3879:1: rule__HOClass__Group_7_0__1 : rule__HOClass__Group_7_0__1__Impl ;
    public final void rule__HOClass__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3883:1: ( rule__HOClass__Group_7_0__1__Impl )
            // InternalOntoL.g:3884:2: rule__HOClass__Group_7_0__1__Impl
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
    // InternalOntoL.g:3890:1: rule__HOClass__Group_7_0__1__Impl : ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) ) ;
    public final void rule__HOClass__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3894:1: ( ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) ) )
            // InternalOntoL.g:3895:1: ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) )
            {
            // InternalOntoL.g:3895:1: ( ( rule__HOClass__BasetypeAssignment_7_0_1 ) )
            // InternalOntoL.g:3896:2: ( rule__HOClass__BasetypeAssignment_7_0_1 )
            {
             before(grammarAccess.getHOClassAccess().getBasetypeAssignment_7_0_1()); 
            // InternalOntoL.g:3897:2: ( rule__HOClass__BasetypeAssignment_7_0_1 )
            // InternalOntoL.g:3897:3: rule__HOClass__BasetypeAssignment_7_0_1
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
    // InternalOntoL.g:3906:1: rule__HOClass__Group_7_1__0 : rule__HOClass__Group_7_1__0__Impl rule__HOClass__Group_7_1__1 ;
    public final void rule__HOClass__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3910:1: ( rule__HOClass__Group_7_1__0__Impl rule__HOClass__Group_7_1__1 )
            // InternalOntoL.g:3911:2: rule__HOClass__Group_7_1__0__Impl rule__HOClass__Group_7_1__1
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
    // InternalOntoL.g:3918:1: rule__HOClass__Group_7_1__0__Impl : ( 'ispowertypeof' ) ;
    public final void rule__HOClass__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3922:1: ( ( 'ispowertypeof' ) )
            // InternalOntoL.g:3923:1: ( 'ispowertypeof' )
            {
            // InternalOntoL.g:3923:1: ( 'ispowertypeof' )
            // InternalOntoL.g:3924:2: 'ispowertypeof'
            {
             before(grammarAccess.getHOClassAccess().getIspowertypeofKeyword_7_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalOntoL.g:3933:1: rule__HOClass__Group_7_1__1 : rule__HOClass__Group_7_1__1__Impl ;
    public final void rule__HOClass__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3937:1: ( rule__HOClass__Group_7_1__1__Impl )
            // InternalOntoL.g:3938:2: rule__HOClass__Group_7_1__1__Impl
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
    // InternalOntoL.g:3944:1: rule__HOClass__Group_7_1__1__Impl : ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) ) ;
    public final void rule__HOClass__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3948:1: ( ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) ) )
            // InternalOntoL.g:3949:1: ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) )
            {
            // InternalOntoL.g:3949:1: ( ( rule__HOClass__PowertypeOfAssignment_7_1_1 ) )
            // InternalOntoL.g:3950:2: ( rule__HOClass__PowertypeOfAssignment_7_1_1 )
            {
             before(grammarAccess.getHOClassAccess().getPowertypeOfAssignment_7_1_1()); 
            // InternalOntoL.g:3951:2: ( rule__HOClass__PowertypeOfAssignment_7_1_1 )
            // InternalOntoL.g:3951:3: rule__HOClass__PowertypeOfAssignment_7_1_1
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


    // $ANTLR start "rule__Property__Group__0"
    // InternalOntoL.g:3960:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3964:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalOntoL.g:3965:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalOntoL.g:3972:1: rule__Property__Group__0__Impl : ( ( rule__Property__NameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3976:1: ( ( ( rule__Property__NameAssignment_0 ) ) )
            // InternalOntoL.g:3977:1: ( ( rule__Property__NameAssignment_0 ) )
            {
            // InternalOntoL.g:3977:1: ( ( rule__Property__NameAssignment_0 ) )
            // InternalOntoL.g:3978:2: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // InternalOntoL.g:3979:2: ( rule__Property__NameAssignment_0 )
            // InternalOntoL.g:3979:3: rule__Property__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalOntoL.g:3987:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:3991:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalOntoL.g:3992:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalOntoL.g:3999:1: rule__Property__Group__1__Impl : ( ':' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4003:1: ( ( ':' ) )
            // InternalOntoL.g:4004:1: ( ':' )
            {
            // InternalOntoL.g:4004:1: ( ':' )
            // InternalOntoL.g:4005:2: ':'
            {
             before(grammarAccess.getPropertyAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalOntoL.g:4014:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4018:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalOntoL.g:4019:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalOntoL.g:4026:1: rule__Property__Group__2__Impl : ( ( rule__Property__Group_2__0 )? ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4030:1: ( ( ( rule__Property__Group_2__0 )? ) )
            // InternalOntoL.g:4031:1: ( ( rule__Property__Group_2__0 )? )
            {
            // InternalOntoL.g:4031:1: ( ( rule__Property__Group_2__0 )? )
            // InternalOntoL.g:4032:2: ( rule__Property__Group_2__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_2()); 
            // InternalOntoL.g:4033:2: ( rule__Property__Group_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==36) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalOntoL.g:4033:3: rule__Property__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // InternalOntoL.g:4041:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4045:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // InternalOntoL.g:4046:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // InternalOntoL.g:4053:1: rule__Property__Group__3__Impl : ( ( rule__Property__PropertyTypeAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4057:1: ( ( ( rule__Property__PropertyTypeAssignment_3 ) ) )
            // InternalOntoL.g:4058:1: ( ( rule__Property__PropertyTypeAssignment_3 ) )
            {
            // InternalOntoL.g:4058:1: ( ( rule__Property__PropertyTypeAssignment_3 ) )
            // InternalOntoL.g:4059:2: ( rule__Property__PropertyTypeAssignment_3 )
            {
             before(grammarAccess.getPropertyAccess().getPropertyTypeAssignment_3()); 
            // InternalOntoL.g:4060:2: ( rule__Property__PropertyTypeAssignment_3 )
            // InternalOntoL.g:4060:3: rule__Property__PropertyTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Property__PropertyTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getPropertyTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // InternalOntoL.g:4068:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4072:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // InternalOntoL.g:4073:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Property__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // InternalOntoL.g:4080:1: rule__Property__Group__4__Impl : ( ( rule__Property__Group_4__0 )? ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4084:1: ( ( ( rule__Property__Group_4__0 )? ) )
            // InternalOntoL.g:4085:1: ( ( rule__Property__Group_4__0 )? )
            {
            // InternalOntoL.g:4085:1: ( ( rule__Property__Group_4__0 )? )
            // InternalOntoL.g:4086:2: ( rule__Property__Group_4__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_4()); 
            // InternalOntoL.g:4087:2: ( rule__Property__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOntoL.g:4087:3: rule__Property__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__Property__Group__5"
    // InternalOntoL.g:4095:1: rule__Property__Group__5 : rule__Property__Group__5__Impl ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4099:1: ( rule__Property__Group__5__Impl )
            // InternalOntoL.g:4100:2: rule__Property__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5"


    // $ANTLR start "rule__Property__Group__5__Impl"
    // InternalOntoL.g:4106:1: rule__Property__Group__5__Impl : ( ( rule__Property__Group_5__0 )? ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4110:1: ( ( ( rule__Property__Group_5__0 )? ) )
            // InternalOntoL.g:4111:1: ( ( rule__Property__Group_5__0 )? )
            {
            // InternalOntoL.g:4111:1: ( ( rule__Property__Group_5__0 )? )
            // InternalOntoL.g:4112:2: ( rule__Property__Group_5__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_5()); 
            // InternalOntoL.g:4113:2: ( rule__Property__Group_5__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==40) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOntoL.g:4113:3: rule__Property__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5__Impl"


    // $ANTLR start "rule__Property__Group_2__0"
    // InternalOntoL.g:4122:1: rule__Property__Group_2__0 : rule__Property__Group_2__0__Impl rule__Property__Group_2__1 ;
    public final void rule__Property__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4126:1: ( rule__Property__Group_2__0__Impl rule__Property__Group_2__1 )
            // InternalOntoL.g:4127:2: rule__Property__Group_2__0__Impl rule__Property__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__Property__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2__0"


    // $ANTLR start "rule__Property__Group_2__0__Impl"
    // InternalOntoL.g:4134:1: rule__Property__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Property__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4138:1: ( ( '[' ) )
            // InternalOntoL.g:4139:1: ( '[' )
            {
            // InternalOntoL.g:4139:1: ( '[' )
            // InternalOntoL.g:4140:2: '['
            {
             before(grammarAccess.getPropertyAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2__0__Impl"


    // $ANTLR start "rule__Property__Group_2__1"
    // InternalOntoL.g:4149:1: rule__Property__Group_2__1 : rule__Property__Group_2__1__Impl rule__Property__Group_2__2 ;
    public final void rule__Property__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4153:1: ( rule__Property__Group_2__1__Impl rule__Property__Group_2__2 )
            // InternalOntoL.g:4154:2: rule__Property__Group_2__1__Impl rule__Property__Group_2__2
            {
            pushFollow(FOLLOW_25);
            rule__Property__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2__1"


    // $ANTLR start "rule__Property__Group_2__1__Impl"
    // InternalOntoL.g:4161:1: rule__Property__Group_2__1__Impl : ( ( rule__Property__LowerBoundAssignment_2_1 ) ) ;
    public final void rule__Property__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4165:1: ( ( ( rule__Property__LowerBoundAssignment_2_1 ) ) )
            // InternalOntoL.g:4166:1: ( ( rule__Property__LowerBoundAssignment_2_1 ) )
            {
            // InternalOntoL.g:4166:1: ( ( rule__Property__LowerBoundAssignment_2_1 ) )
            // InternalOntoL.g:4167:2: ( rule__Property__LowerBoundAssignment_2_1 )
            {
             before(grammarAccess.getPropertyAccess().getLowerBoundAssignment_2_1()); 
            // InternalOntoL.g:4168:2: ( rule__Property__LowerBoundAssignment_2_1 )
            // InternalOntoL.g:4168:3: rule__Property__LowerBoundAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__LowerBoundAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getLowerBoundAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2__1__Impl"


    // $ANTLR start "rule__Property__Group_2__2"
    // InternalOntoL.g:4176:1: rule__Property__Group_2__2 : rule__Property__Group_2__2__Impl rule__Property__Group_2__3 ;
    public final void rule__Property__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4180:1: ( rule__Property__Group_2__2__Impl rule__Property__Group_2__3 )
            // InternalOntoL.g:4181:2: rule__Property__Group_2__2__Impl rule__Property__Group_2__3
            {
            pushFollow(FOLLOW_24);
            rule__Property__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2__2"


    // $ANTLR start "rule__Property__Group_2__2__Impl"
    // InternalOntoL.g:4188:1: rule__Property__Group_2__2__Impl : ( '..' ) ;
    public final void rule__Property__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4192:1: ( ( '..' ) )
            // InternalOntoL.g:4193:1: ( '..' )
            {
            // InternalOntoL.g:4193:1: ( '..' )
            // InternalOntoL.g:4194:2: '..'
            {
             before(grammarAccess.getPropertyAccess().getFullStopFullStopKeyword_2_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getFullStopFullStopKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2__2__Impl"


    // $ANTLR start "rule__Property__Group_2__3"
    // InternalOntoL.g:4203:1: rule__Property__Group_2__3 : rule__Property__Group_2__3__Impl rule__Property__Group_2__4 ;
    public final void rule__Property__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4207:1: ( rule__Property__Group_2__3__Impl rule__Property__Group_2__4 )
            // InternalOntoL.g:4208:2: rule__Property__Group_2__3__Impl rule__Property__Group_2__4
            {
            pushFollow(FOLLOW_26);
            rule__Property__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2__3"


    // $ANTLR start "rule__Property__Group_2__3__Impl"
    // InternalOntoL.g:4215:1: rule__Property__Group_2__3__Impl : ( ( rule__Property__UpperBoundAssignment_2_3 ) ) ;
    public final void rule__Property__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4219:1: ( ( ( rule__Property__UpperBoundAssignment_2_3 ) ) )
            // InternalOntoL.g:4220:1: ( ( rule__Property__UpperBoundAssignment_2_3 ) )
            {
            // InternalOntoL.g:4220:1: ( ( rule__Property__UpperBoundAssignment_2_3 ) )
            // InternalOntoL.g:4221:2: ( rule__Property__UpperBoundAssignment_2_3 )
            {
             before(grammarAccess.getPropertyAccess().getUpperBoundAssignment_2_3()); 
            // InternalOntoL.g:4222:2: ( rule__Property__UpperBoundAssignment_2_3 )
            // InternalOntoL.g:4222:3: rule__Property__UpperBoundAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Property__UpperBoundAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getUpperBoundAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2__3__Impl"


    // $ANTLR start "rule__Property__Group_2__4"
    // InternalOntoL.g:4230:1: rule__Property__Group_2__4 : rule__Property__Group_2__4__Impl ;
    public final void rule__Property__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4234:1: ( rule__Property__Group_2__4__Impl )
            // InternalOntoL.g:4235:2: rule__Property__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2__4"


    // $ANTLR start "rule__Property__Group_2__4__Impl"
    // InternalOntoL.g:4241:1: rule__Property__Group_2__4__Impl : ( ']' ) ;
    public final void rule__Property__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4245:1: ( ( ']' ) )
            // InternalOntoL.g:4246:1: ( ']' )
            {
            // InternalOntoL.g:4246:1: ( ']' )
            // InternalOntoL.g:4247:2: ']'
            {
             before(grammarAccess.getPropertyAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getRightSquareBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2__4__Impl"


    // $ANTLR start "rule__Property__Group_4__0"
    // InternalOntoL.g:4257:1: rule__Property__Group_4__0 : rule__Property__Group_4__0__Impl rule__Property__Group_4__1 ;
    public final void rule__Property__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4261:1: ( rule__Property__Group_4__0__Impl rule__Property__Group_4__1 )
            // InternalOntoL.g:4262:2: rule__Property__Group_4__0__Impl rule__Property__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Property__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__0"


    // $ANTLR start "rule__Property__Group_4__0__Impl"
    // InternalOntoL.g:4269:1: rule__Property__Group_4__0__Impl : ( 'subsets' ) ;
    public final void rule__Property__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4273:1: ( ( 'subsets' ) )
            // InternalOntoL.g:4274:1: ( 'subsets' )
            {
            // InternalOntoL.g:4274:1: ( 'subsets' )
            // InternalOntoL.g:4275:2: 'subsets'
            {
             before(grammarAccess.getPropertyAccess().getSubsetsKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getSubsetsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__0__Impl"


    // $ANTLR start "rule__Property__Group_4__1"
    // InternalOntoL.g:4284:1: rule__Property__Group_4__1 : rule__Property__Group_4__1__Impl rule__Property__Group_4__2 ;
    public final void rule__Property__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4288:1: ( rule__Property__Group_4__1__Impl rule__Property__Group_4__2 )
            // InternalOntoL.g:4289:2: rule__Property__Group_4__1__Impl rule__Property__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Property__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__1"


    // $ANTLR start "rule__Property__Group_4__1__Impl"
    // InternalOntoL.g:4296:1: rule__Property__Group_4__1__Impl : ( ( rule__Property__SubsetOfAssignment_4_1 ) ) ;
    public final void rule__Property__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4300:1: ( ( ( rule__Property__SubsetOfAssignment_4_1 ) ) )
            // InternalOntoL.g:4301:1: ( ( rule__Property__SubsetOfAssignment_4_1 ) )
            {
            // InternalOntoL.g:4301:1: ( ( rule__Property__SubsetOfAssignment_4_1 ) )
            // InternalOntoL.g:4302:2: ( rule__Property__SubsetOfAssignment_4_1 )
            {
             before(grammarAccess.getPropertyAccess().getSubsetOfAssignment_4_1()); 
            // InternalOntoL.g:4303:2: ( rule__Property__SubsetOfAssignment_4_1 )
            // InternalOntoL.g:4303:3: rule__Property__SubsetOfAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__SubsetOfAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getSubsetOfAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__1__Impl"


    // $ANTLR start "rule__Property__Group_4__2"
    // InternalOntoL.g:4311:1: rule__Property__Group_4__2 : rule__Property__Group_4__2__Impl ;
    public final void rule__Property__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4315:1: ( rule__Property__Group_4__2__Impl )
            // InternalOntoL.g:4316:2: rule__Property__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__2"


    // $ANTLR start "rule__Property__Group_4__2__Impl"
    // InternalOntoL.g:4322:1: rule__Property__Group_4__2__Impl : ( ( rule__Property__Group_4_2__0 )* ) ;
    public final void rule__Property__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4326:1: ( ( ( rule__Property__Group_4_2__0 )* ) )
            // InternalOntoL.g:4327:1: ( ( rule__Property__Group_4_2__0 )* )
            {
            // InternalOntoL.g:4327:1: ( ( rule__Property__Group_4_2__0 )* )
            // InternalOntoL.g:4328:2: ( rule__Property__Group_4_2__0 )*
            {
             before(grammarAccess.getPropertyAccess().getGroup_4_2()); 
            // InternalOntoL.g:4329:2: ( rule__Property__Group_4_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==27) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalOntoL.g:4329:3: rule__Property__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Property__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getPropertyAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__2__Impl"


    // $ANTLR start "rule__Property__Group_4_2__0"
    // InternalOntoL.g:4338:1: rule__Property__Group_4_2__0 : rule__Property__Group_4_2__0__Impl rule__Property__Group_4_2__1 ;
    public final void rule__Property__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4342:1: ( rule__Property__Group_4_2__0__Impl rule__Property__Group_4_2__1 )
            // InternalOntoL.g:4343:2: rule__Property__Group_4_2__0__Impl rule__Property__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Property__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4_2__0"


    // $ANTLR start "rule__Property__Group_4_2__0__Impl"
    // InternalOntoL.g:4350:1: rule__Property__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Property__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4354:1: ( ( ',' ) )
            // InternalOntoL.g:4355:1: ( ',' )
            {
            // InternalOntoL.g:4355:1: ( ',' )
            // InternalOntoL.g:4356:2: ','
            {
             before(grammarAccess.getPropertyAccess().getCommaKeyword_4_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4_2__0__Impl"


    // $ANTLR start "rule__Property__Group_4_2__1"
    // InternalOntoL.g:4365:1: rule__Property__Group_4_2__1 : rule__Property__Group_4_2__1__Impl ;
    public final void rule__Property__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4369:1: ( rule__Property__Group_4_2__1__Impl )
            // InternalOntoL.g:4370:2: rule__Property__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4_2__1"


    // $ANTLR start "rule__Property__Group_4_2__1__Impl"
    // InternalOntoL.g:4376:1: rule__Property__Group_4_2__1__Impl : ( ( rule__Property__SubsetOfAssignment_4_2_1 ) ) ;
    public final void rule__Property__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4380:1: ( ( ( rule__Property__SubsetOfAssignment_4_2_1 ) ) )
            // InternalOntoL.g:4381:1: ( ( rule__Property__SubsetOfAssignment_4_2_1 ) )
            {
            // InternalOntoL.g:4381:1: ( ( rule__Property__SubsetOfAssignment_4_2_1 ) )
            // InternalOntoL.g:4382:2: ( rule__Property__SubsetOfAssignment_4_2_1 )
            {
             before(grammarAccess.getPropertyAccess().getSubsetOfAssignment_4_2_1()); 
            // InternalOntoL.g:4383:2: ( rule__Property__SubsetOfAssignment_4_2_1 )
            // InternalOntoL.g:4383:3: rule__Property__SubsetOfAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__SubsetOfAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getSubsetOfAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4_2__1__Impl"


    // $ANTLR start "rule__Property__Group_5__0"
    // InternalOntoL.g:4392:1: rule__Property__Group_5__0 : rule__Property__Group_5__0__Impl rule__Property__Group_5__1 ;
    public final void rule__Property__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4396:1: ( rule__Property__Group_5__0__Impl rule__Property__Group_5__1 )
            // InternalOntoL.g:4397:2: rule__Property__Group_5__0__Impl rule__Property__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Property__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_5__0"


    // $ANTLR start "rule__Property__Group_5__0__Impl"
    // InternalOntoL.g:4404:1: rule__Property__Group_5__0__Impl : ( 'isoppositeto' ) ;
    public final void rule__Property__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4408:1: ( ( 'isoppositeto' ) )
            // InternalOntoL.g:4409:1: ( 'isoppositeto' )
            {
            // InternalOntoL.g:4409:1: ( 'isoppositeto' )
            // InternalOntoL.g:4410:2: 'isoppositeto'
            {
             before(grammarAccess.getPropertyAccess().getIsoppositetoKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getIsoppositetoKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_5__0__Impl"


    // $ANTLR start "rule__Property__Group_5__1"
    // InternalOntoL.g:4419:1: rule__Property__Group_5__1 : rule__Property__Group_5__1__Impl ;
    public final void rule__Property__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4423:1: ( rule__Property__Group_5__1__Impl )
            // InternalOntoL.g:4424:2: rule__Property__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_5__1"


    // $ANTLR start "rule__Property__Group_5__1__Impl"
    // InternalOntoL.g:4430:1: rule__Property__Group_5__1__Impl : ( ( rule__Property__OppositeToAssignment_5_1 ) ) ;
    public final void rule__Property__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4434:1: ( ( ( rule__Property__OppositeToAssignment_5_1 ) ) )
            // InternalOntoL.g:4435:1: ( ( rule__Property__OppositeToAssignment_5_1 ) )
            {
            // InternalOntoL.g:4435:1: ( ( rule__Property__OppositeToAssignment_5_1 ) )
            // InternalOntoL.g:4436:2: ( rule__Property__OppositeToAssignment_5_1 )
            {
             before(grammarAccess.getPropertyAccess().getOppositeToAssignment_5_1()); 
            // InternalOntoL.g:4437:2: ( rule__Property__OppositeToAssignment_5_1 )
            // InternalOntoL.g:4437:3: rule__Property__OppositeToAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__OppositeToAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getOppositeToAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_5__1__Impl"


    // $ANTLR start "rule__PropertyAssignment__Group__0"
    // InternalOntoL.g:4446:1: rule__PropertyAssignment__Group__0 : rule__PropertyAssignment__Group__0__Impl rule__PropertyAssignment__Group__1 ;
    public final void rule__PropertyAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4450:1: ( rule__PropertyAssignment__Group__0__Impl rule__PropertyAssignment__Group__1 )
            // InternalOntoL.g:4451:2: rule__PropertyAssignment__Group__0__Impl rule__PropertyAssignment__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__PropertyAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAssignment__Group__0"


    // $ANTLR start "rule__PropertyAssignment__Group__0__Impl"
    // InternalOntoL.g:4458:1: rule__PropertyAssignment__Group__0__Impl : ( ( rule__PropertyAssignment__PropertyAssignment_0 ) ) ;
    public final void rule__PropertyAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4462:1: ( ( ( rule__PropertyAssignment__PropertyAssignment_0 ) ) )
            // InternalOntoL.g:4463:1: ( ( rule__PropertyAssignment__PropertyAssignment_0 ) )
            {
            // InternalOntoL.g:4463:1: ( ( rule__PropertyAssignment__PropertyAssignment_0 ) )
            // InternalOntoL.g:4464:2: ( rule__PropertyAssignment__PropertyAssignment_0 )
            {
             before(grammarAccess.getPropertyAssignmentAccess().getPropertyAssignment_0()); 
            // InternalOntoL.g:4465:2: ( rule__PropertyAssignment__PropertyAssignment_0 )
            // InternalOntoL.g:4465:3: rule__PropertyAssignment__PropertyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAssignment__PropertyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAssignmentAccess().getPropertyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAssignment__Group__0__Impl"


    // $ANTLR start "rule__PropertyAssignment__Group__1"
    // InternalOntoL.g:4473:1: rule__PropertyAssignment__Group__1 : rule__PropertyAssignment__Group__1__Impl rule__PropertyAssignment__Group__2 ;
    public final void rule__PropertyAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4477:1: ( rule__PropertyAssignment__Group__1__Impl rule__PropertyAssignment__Group__2 )
            // InternalOntoL.g:4478:2: rule__PropertyAssignment__Group__1__Impl rule__PropertyAssignment__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__PropertyAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAssignment__Group__1"


    // $ANTLR start "rule__PropertyAssignment__Group__1__Impl"
    // InternalOntoL.g:4485:1: rule__PropertyAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__PropertyAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4489:1: ( ( '=' ) )
            // InternalOntoL.g:4490:1: ( '=' )
            {
            // InternalOntoL.g:4490:1: ( '=' )
            // InternalOntoL.g:4491:2: '='
            {
             before(grammarAccess.getPropertyAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPropertyAssignmentAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAssignment__Group__1__Impl"


    // $ANTLR start "rule__PropertyAssignment__Group__2"
    // InternalOntoL.g:4500:1: rule__PropertyAssignment__Group__2 : rule__PropertyAssignment__Group__2__Impl ;
    public final void rule__PropertyAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4504:1: ( rule__PropertyAssignment__Group__2__Impl )
            // InternalOntoL.g:4505:2: rule__PropertyAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAssignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAssignment__Group__2"


    // $ANTLR start "rule__PropertyAssignment__Group__2__Impl"
    // InternalOntoL.g:4511:1: rule__PropertyAssignment__Group__2__Impl : ( ( rule__PropertyAssignment__AssignmentAssignment_2 ) ) ;
    public final void rule__PropertyAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4515:1: ( ( ( rule__PropertyAssignment__AssignmentAssignment_2 ) ) )
            // InternalOntoL.g:4516:1: ( ( rule__PropertyAssignment__AssignmentAssignment_2 ) )
            {
            // InternalOntoL.g:4516:1: ( ( rule__PropertyAssignment__AssignmentAssignment_2 ) )
            // InternalOntoL.g:4517:2: ( rule__PropertyAssignment__AssignmentAssignment_2 )
            {
             before(grammarAccess.getPropertyAssignmentAccess().getAssignmentAssignment_2()); 
            // InternalOntoL.g:4518:2: ( rule__PropertyAssignment__AssignmentAssignment_2 )
            // InternalOntoL.g:4518:3: rule__PropertyAssignment__AssignmentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAssignment__AssignmentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAssignmentAccess().getAssignmentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAssignment__Group__2__Impl"


    // $ANTLR start "rule__ListValue__Group__0"
    // InternalOntoL.g:4527:1: rule__ListValue__Group__0 : rule__ListValue__Group__0__Impl rule__ListValue__Group__1 ;
    public final void rule__ListValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4531:1: ( rule__ListValue__Group__0__Impl rule__ListValue__Group__1 )
            // InternalOntoL.g:4532:2: rule__ListValue__Group__0__Impl rule__ListValue__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ListValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__0"


    // $ANTLR start "rule__ListValue__Group__0__Impl"
    // InternalOntoL.g:4539:1: rule__ListValue__Group__0__Impl : ( '(' ) ;
    public final void rule__ListValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4543:1: ( ( '(' ) )
            // InternalOntoL.g:4544:1: ( '(' )
            {
            // InternalOntoL.g:4544:1: ( '(' )
            // InternalOntoL.g:4545:2: '('
            {
             before(grammarAccess.getListValueAccess().getLeftParenthesisKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getListValueAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__0__Impl"


    // $ANTLR start "rule__ListValue__Group__1"
    // InternalOntoL.g:4554:1: rule__ListValue__Group__1 : rule__ListValue__Group__1__Impl rule__ListValue__Group__2 ;
    public final void rule__ListValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4558:1: ( rule__ListValue__Group__1__Impl rule__ListValue__Group__2 )
            // InternalOntoL.g:4559:2: rule__ListValue__Group__1__Impl rule__ListValue__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__ListValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__1"


    // $ANTLR start "rule__ListValue__Group__1__Impl"
    // InternalOntoL.g:4566:1: rule__ListValue__Group__1__Impl : ( ( rule__ListValue__ValueAssignment_1 ) ) ;
    public final void rule__ListValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4570:1: ( ( ( rule__ListValue__ValueAssignment_1 ) ) )
            // InternalOntoL.g:4571:1: ( ( rule__ListValue__ValueAssignment_1 ) )
            {
            // InternalOntoL.g:4571:1: ( ( rule__ListValue__ValueAssignment_1 ) )
            // InternalOntoL.g:4572:2: ( rule__ListValue__ValueAssignment_1 )
            {
             before(grammarAccess.getListValueAccess().getValueAssignment_1()); 
            // InternalOntoL.g:4573:2: ( rule__ListValue__ValueAssignment_1 )
            // InternalOntoL.g:4573:3: rule__ListValue__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListValueAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__1__Impl"


    // $ANTLR start "rule__ListValue__Group__2"
    // InternalOntoL.g:4581:1: rule__ListValue__Group__2 : rule__ListValue__Group__2__Impl rule__ListValue__Group__3 ;
    public final void rule__ListValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4585:1: ( rule__ListValue__Group__2__Impl rule__ListValue__Group__3 )
            // InternalOntoL.g:4586:2: rule__ListValue__Group__2__Impl rule__ListValue__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__ListValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__2"


    // $ANTLR start "rule__ListValue__Group__2__Impl"
    // InternalOntoL.g:4593:1: rule__ListValue__Group__2__Impl : ( ( rule__ListValue__Group_2__0 )* ) ;
    public final void rule__ListValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4597:1: ( ( ( rule__ListValue__Group_2__0 )* ) )
            // InternalOntoL.g:4598:1: ( ( rule__ListValue__Group_2__0 )* )
            {
            // InternalOntoL.g:4598:1: ( ( rule__ListValue__Group_2__0 )* )
            // InternalOntoL.g:4599:2: ( rule__ListValue__Group_2__0 )*
            {
             before(grammarAccess.getListValueAccess().getGroup_2()); 
            // InternalOntoL.g:4600:2: ( rule__ListValue__Group_2__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==27) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalOntoL.g:4600:3: rule__ListValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ListValue__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getListValueAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__2__Impl"


    // $ANTLR start "rule__ListValue__Group__3"
    // InternalOntoL.g:4608:1: rule__ListValue__Group__3 : rule__ListValue__Group__3__Impl ;
    public final void rule__ListValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4612:1: ( rule__ListValue__Group__3__Impl )
            // InternalOntoL.g:4613:2: rule__ListValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__3"


    // $ANTLR start "rule__ListValue__Group__3__Impl"
    // InternalOntoL.g:4619:1: rule__ListValue__Group__3__Impl : ( ')' ) ;
    public final void rule__ListValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4623:1: ( ( ')' ) )
            // InternalOntoL.g:4624:1: ( ')' )
            {
            // InternalOntoL.g:4624:1: ( ')' )
            // InternalOntoL.g:4625:2: ')'
            {
             before(grammarAccess.getListValueAccess().getRightParenthesisKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getListValueAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__3__Impl"


    // $ANTLR start "rule__ListValue__Group_2__0"
    // InternalOntoL.g:4635:1: rule__ListValue__Group_2__0 : rule__ListValue__Group_2__0__Impl rule__ListValue__Group_2__1 ;
    public final void rule__ListValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4639:1: ( rule__ListValue__Group_2__0__Impl rule__ListValue__Group_2__1 )
            // InternalOntoL.g:4640:2: rule__ListValue__Group_2__0__Impl rule__ListValue__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__ListValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListValue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group_2__0"


    // $ANTLR start "rule__ListValue__Group_2__0__Impl"
    // InternalOntoL.g:4647:1: rule__ListValue__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ListValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4651:1: ( ( ',' ) )
            // InternalOntoL.g:4652:1: ( ',' )
            {
            // InternalOntoL.g:4652:1: ( ',' )
            // InternalOntoL.g:4653:2: ','
            {
             before(grammarAccess.getListValueAccess().getCommaKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getListValueAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group_2__0__Impl"


    // $ANTLR start "rule__ListValue__Group_2__1"
    // InternalOntoL.g:4662:1: rule__ListValue__Group_2__1 : rule__ListValue__Group_2__1__Impl ;
    public final void rule__ListValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4666:1: ( rule__ListValue__Group_2__1__Impl )
            // InternalOntoL.g:4667:2: rule__ListValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group_2__1"


    // $ANTLR start "rule__ListValue__Group_2__1__Impl"
    // InternalOntoL.g:4673:1: rule__ListValue__Group_2__1__Impl : ( ( rule__ListValue__ValueAssignment_2_1 ) ) ;
    public final void rule__ListValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4677:1: ( ( ( rule__ListValue__ValueAssignment_2_1 ) ) )
            // InternalOntoL.g:4678:1: ( ( rule__ListValue__ValueAssignment_2_1 ) )
            {
            // InternalOntoL.g:4678:1: ( ( rule__ListValue__ValueAssignment_2_1 ) )
            // InternalOntoL.g:4679:2: ( rule__ListValue__ValueAssignment_2_1 )
            {
             before(grammarAccess.getListValueAccess().getValueAssignment_2_1()); 
            // InternalOntoL.g:4680:2: ( rule__ListValue__ValueAssignment_2_1 )
            // InternalOntoL.g:4680:3: rule__ListValue__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getListValueAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group_2__1__Impl"


    // $ANTLR start "rule__NUMBER__Group__0"
    // InternalOntoL.g:4689:1: rule__NUMBER__Group__0 : rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 ;
    public final void rule__NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4693:1: ( rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 )
            // InternalOntoL.g:4694:2: rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalOntoL.g:4701:1: rule__NUMBER__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4705:1: ( ( ( '-' )? ) )
            // InternalOntoL.g:4706:1: ( ( '-' )? )
            {
            // InternalOntoL.g:4706:1: ( ( '-' )? )
            // InternalOntoL.g:4707:2: ( '-' )?
            {
             before(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0()); 
            // InternalOntoL.g:4708:2: ( '-' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==44) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalOntoL.g:4708:3: '-'
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
    // InternalOntoL.g:4716:1: rule__NUMBER__Group__1 : rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2 ;
    public final void rule__NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4720:1: ( rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2 )
            // InternalOntoL.g:4721:2: rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2
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
    // InternalOntoL.g:4728:1: rule__NUMBER__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4732:1: ( ( RULE_INT ) )
            // InternalOntoL.g:4733:1: ( RULE_INT )
            {
            // InternalOntoL.g:4733:1: ( RULE_INT )
            // InternalOntoL.g:4734:2: RULE_INT
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
    // InternalOntoL.g:4743:1: rule__NUMBER__Group__2 : rule__NUMBER__Group__2__Impl ;
    public final void rule__NUMBER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4747:1: ( rule__NUMBER__Group__2__Impl )
            // InternalOntoL.g:4748:2: rule__NUMBER__Group__2__Impl
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
    // InternalOntoL.g:4754:1: rule__NUMBER__Group__2__Impl : ( ( rule__NUMBER__Group_2__0 )? ) ;
    public final void rule__NUMBER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4758:1: ( ( ( rule__NUMBER__Group_2__0 )? ) )
            // InternalOntoL.g:4759:1: ( ( rule__NUMBER__Group_2__0 )? )
            {
            // InternalOntoL.g:4759:1: ( ( rule__NUMBER__Group_2__0 )? )
            // InternalOntoL.g:4760:2: ( rule__NUMBER__Group_2__0 )?
            {
             before(grammarAccess.getNUMBERAccess().getGroup_2()); 
            // InternalOntoL.g:4761:2: ( rule__NUMBER__Group_2__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==22) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOntoL.g:4761:3: rule__NUMBER__Group_2__0
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
    // InternalOntoL.g:4770:1: rule__NUMBER__Group_2__0 : rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1 ;
    public final void rule__NUMBER__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4774:1: ( rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1 )
            // InternalOntoL.g:4775:2: rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1
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
    // InternalOntoL.g:4782:1: rule__NUMBER__Group_2__0__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4786:1: ( ( '.' ) )
            // InternalOntoL.g:4787:1: ( '.' )
            {
            // InternalOntoL.g:4787:1: ( '.' )
            // InternalOntoL.g:4788:2: '.'
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
    // InternalOntoL.g:4797:1: rule__NUMBER__Group_2__1 : rule__NUMBER__Group_2__1__Impl ;
    public final void rule__NUMBER__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4801:1: ( rule__NUMBER__Group_2__1__Impl )
            // InternalOntoL.g:4802:2: rule__NUMBER__Group_2__1__Impl
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
    // InternalOntoL.g:4808:1: rule__NUMBER__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4812:1: ( ( RULE_INT ) )
            // InternalOntoL.g:4813:1: ( RULE_INT )
            {
            // InternalOntoL.g:4813:1: ( RULE_INT )
            // InternalOntoL.g:4814:2: RULE_INT
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
    // InternalOntoL.g:4824:1: rule__NoneValue__Group__0 : rule__NoneValue__Group__0__Impl rule__NoneValue__Group__1 ;
    public final void rule__NoneValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4828:1: ( rule__NoneValue__Group__0__Impl rule__NoneValue__Group__1 )
            // InternalOntoL.g:4829:2: rule__NoneValue__Group__0__Impl rule__NoneValue__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalOntoL.g:4836:1: rule__NoneValue__Group__0__Impl : ( () ) ;
    public final void rule__NoneValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4840:1: ( ( () ) )
            // InternalOntoL.g:4841:1: ( () )
            {
            // InternalOntoL.g:4841:1: ( () )
            // InternalOntoL.g:4842:2: ()
            {
             before(grammarAccess.getNoneValueAccess().getNoneValueAction_0()); 
            // InternalOntoL.g:4843:2: ()
            // InternalOntoL.g:4843:3: 
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
    // InternalOntoL.g:4851:1: rule__NoneValue__Group__1 : rule__NoneValue__Group__1__Impl ;
    public final void rule__NoneValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4855:1: ( rule__NoneValue__Group__1__Impl )
            // InternalOntoL.g:4856:2: rule__NoneValue__Group__1__Impl
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
    // InternalOntoL.g:4862:1: rule__NoneValue__Group__1__Impl : ( 'none' ) ;
    public final void rule__NoneValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4866:1: ( ( 'none' ) )
            // InternalOntoL.g:4867:1: ( 'none' )
            {
            // InternalOntoL.g:4867:1: ( 'none' )
            // InternalOntoL.g:4868:2: 'none'
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
    // InternalOntoL.g:4878:1: rule__GeneralizationSet__Group__0 : rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 ;
    public final void rule__GeneralizationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4882:1: ( rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 )
            // InternalOntoL.g:4883:2: rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalOntoL.g:4890:1: rule__GeneralizationSet__Group__0__Impl : ( ( rule__GeneralizationSet__Alternatives_0 )? ) ;
    public final void rule__GeneralizationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4894:1: ( ( ( rule__GeneralizationSet__Alternatives_0 )? ) )
            // InternalOntoL.g:4895:1: ( ( rule__GeneralizationSet__Alternatives_0 )? )
            {
            // InternalOntoL.g:4895:1: ( ( rule__GeneralizationSet__Alternatives_0 )? )
            // InternalOntoL.g:4896:2: ( rule__GeneralizationSet__Alternatives_0 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getAlternatives_0()); 
            // InternalOntoL.g:4897:2: ( rule__GeneralizationSet__Alternatives_0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==42) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalOntoL.g:4897:3: rule__GeneralizationSet__Alternatives_0
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
    // InternalOntoL.g:4905:1: rule__GeneralizationSet__Group__1 : rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 ;
    public final void rule__GeneralizationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4909:1: ( rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 )
            // InternalOntoL.g:4910:2: rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalOntoL.g:4917:1: rule__GeneralizationSet__Group__1__Impl : ( 'genset' ) ;
    public final void rule__GeneralizationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4921:1: ( ( 'genset' ) )
            // InternalOntoL.g:4922:1: ( 'genset' )
            {
            // InternalOntoL.g:4922:1: ( 'genset' )
            // InternalOntoL.g:4923:2: 'genset'
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
    // InternalOntoL.g:4932:1: rule__GeneralizationSet__Group__2 : rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 ;
    public final void rule__GeneralizationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4936:1: ( rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 )
            // InternalOntoL.g:4937:2: rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalOntoL.g:4944:1: rule__GeneralizationSet__Group__2__Impl : ( ( rule__GeneralizationSet__NameAssignment_2 ) ) ;
    public final void rule__GeneralizationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4948:1: ( ( ( rule__GeneralizationSet__NameAssignment_2 ) ) )
            // InternalOntoL.g:4949:1: ( ( rule__GeneralizationSet__NameAssignment_2 ) )
            {
            // InternalOntoL.g:4949:1: ( ( rule__GeneralizationSet__NameAssignment_2 ) )
            // InternalOntoL.g:4950:2: ( rule__GeneralizationSet__NameAssignment_2 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 
            // InternalOntoL.g:4951:2: ( rule__GeneralizationSet__NameAssignment_2 )
            // InternalOntoL.g:4951:3: rule__GeneralizationSet__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__NameAssignment_2();

            state._fsp--;


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
    // InternalOntoL.g:4959:1: rule__GeneralizationSet__Group__3 : rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 ;
    public final void rule__GeneralizationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4963:1: ( rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 )
            // InternalOntoL.g:4964:2: rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4
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
    // InternalOntoL.g:4971:1: rule__GeneralizationSet__Group__3__Impl : ( 'general' ) ;
    public final void rule__GeneralizationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4975:1: ( ( 'general' ) )
            // InternalOntoL.g:4976:1: ( 'general' )
            {
            // InternalOntoL.g:4976:1: ( 'general' )
            // InternalOntoL.g:4977:2: 'general'
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
    // InternalOntoL.g:4986:1: rule__GeneralizationSet__Group__4 : rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 ;
    public final void rule__GeneralizationSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:4990:1: ( rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 )
            // InternalOntoL.g:4991:2: rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalOntoL.g:4998:1: rule__GeneralizationSet__Group__4__Impl : ( ( rule__GeneralizationSet__GeneralAssignment_4 ) ) ;
    public final void rule__GeneralizationSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5002:1: ( ( ( rule__GeneralizationSet__GeneralAssignment_4 ) ) )
            // InternalOntoL.g:5003:1: ( ( rule__GeneralizationSet__GeneralAssignment_4 ) )
            {
            // InternalOntoL.g:5003:1: ( ( rule__GeneralizationSet__GeneralAssignment_4 ) )
            // InternalOntoL.g:5004:2: ( rule__GeneralizationSet__GeneralAssignment_4 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralAssignment_4()); 
            // InternalOntoL.g:5005:2: ( rule__GeneralizationSet__GeneralAssignment_4 )
            // InternalOntoL.g:5005:3: rule__GeneralizationSet__GeneralAssignment_4
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
    // InternalOntoL.g:5013:1: rule__GeneralizationSet__Group__5 : rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 ;
    public final void rule__GeneralizationSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5017:1: ( rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 )
            // InternalOntoL.g:5018:2: rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalOntoL.g:5025:1: rule__GeneralizationSet__Group__5__Impl : ( ( rule__GeneralizationSet__Group_5__0 )? ) ;
    public final void rule__GeneralizationSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5029:1: ( ( ( rule__GeneralizationSet__Group_5__0 )? ) )
            // InternalOntoL.g:5030:1: ( ( rule__GeneralizationSet__Group_5__0 )? )
            {
            // InternalOntoL.g:5030:1: ( ( rule__GeneralizationSet__Group_5__0 )? )
            // InternalOntoL.g:5031:2: ( rule__GeneralizationSet__Group_5__0 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_5()); 
            // InternalOntoL.g:5032:2: ( rule__GeneralizationSet__Group_5__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==49) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOntoL.g:5032:3: rule__GeneralizationSet__Group_5__0
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
    // InternalOntoL.g:5040:1: rule__GeneralizationSet__Group__6 : rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 ;
    public final void rule__GeneralizationSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5044:1: ( rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 )
            // InternalOntoL.g:5045:2: rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7
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
    // InternalOntoL.g:5052:1: rule__GeneralizationSet__Group__6__Impl : ( 'specifics' ) ;
    public final void rule__GeneralizationSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5056:1: ( ( 'specifics' ) )
            // InternalOntoL.g:5057:1: ( 'specifics' )
            {
            // InternalOntoL.g:5057:1: ( 'specifics' )
            // InternalOntoL.g:5058:2: 'specifics'
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
    // InternalOntoL.g:5067:1: rule__GeneralizationSet__Group__7 : rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8 ;
    public final void rule__GeneralizationSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5071:1: ( rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8 )
            // InternalOntoL.g:5072:2: rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8
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
    // InternalOntoL.g:5079:1: rule__GeneralizationSet__Group__7__Impl : ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) ) ;
    public final void rule__GeneralizationSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5083:1: ( ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) ) )
            // InternalOntoL.g:5084:1: ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) )
            {
            // InternalOntoL.g:5084:1: ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) )
            // InternalOntoL.g:5085:2: ( rule__GeneralizationSet__SpecificsAssignment_7 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_7()); 
            // InternalOntoL.g:5086:2: ( rule__GeneralizationSet__SpecificsAssignment_7 )
            // InternalOntoL.g:5086:3: rule__GeneralizationSet__SpecificsAssignment_7
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
    // InternalOntoL.g:5094:1: rule__GeneralizationSet__Group__8 : rule__GeneralizationSet__Group__8__Impl ;
    public final void rule__GeneralizationSet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5098:1: ( rule__GeneralizationSet__Group__8__Impl )
            // InternalOntoL.g:5099:2: rule__GeneralizationSet__Group__8__Impl
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
    // InternalOntoL.g:5105:1: rule__GeneralizationSet__Group__8__Impl : ( ( rule__GeneralizationSet__Group_8__0 )* ) ;
    public final void rule__GeneralizationSet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5109:1: ( ( ( rule__GeneralizationSet__Group_8__0 )* ) )
            // InternalOntoL.g:5110:1: ( ( rule__GeneralizationSet__Group_8__0 )* )
            {
            // InternalOntoL.g:5110:1: ( ( rule__GeneralizationSet__Group_8__0 )* )
            // InternalOntoL.g:5111:2: ( rule__GeneralizationSet__Group_8__0 )*
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 
            // InternalOntoL.g:5112:2: ( rule__GeneralizationSet__Group_8__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==27) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalOntoL.g:5112:3: rule__GeneralizationSet__Group_8__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GeneralizationSet__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalOntoL.g:5121:1: rule__GeneralizationSet__Group_0_0__0 : rule__GeneralizationSet__Group_0_0__0__Impl rule__GeneralizationSet__Group_0_0__1 ;
    public final void rule__GeneralizationSet__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5125:1: ( rule__GeneralizationSet__Group_0_0__0__Impl rule__GeneralizationSet__Group_0_0__1 )
            // InternalOntoL.g:5126:2: rule__GeneralizationSet__Group_0_0__0__Impl rule__GeneralizationSet__Group_0_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalOntoL.g:5133:1: rule__GeneralizationSet__Group_0_0__0__Impl : ( '(' ) ;
    public final void rule__GeneralizationSet__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5137:1: ( ( '(' ) )
            // InternalOntoL.g:5138:1: ( '(' )
            {
            // InternalOntoL.g:5138:1: ( '(' )
            // InternalOntoL.g:5139:2: '('
            {
             before(grammarAccess.getGeneralizationSetAccess().getLeftParenthesisKeyword_0_0_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalOntoL.g:5148:1: rule__GeneralizationSet__Group_0_0__1 : rule__GeneralizationSet__Group_0_0__1__Impl rule__GeneralizationSet__Group_0_0__2 ;
    public final void rule__GeneralizationSet__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5152:1: ( rule__GeneralizationSet__Group_0_0__1__Impl rule__GeneralizationSet__Group_0_0__2 )
            // InternalOntoL.g:5153:2: rule__GeneralizationSet__Group_0_0__1__Impl rule__GeneralizationSet__Group_0_0__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalOntoL.g:5160:1: rule__GeneralizationSet__Group_0_0__1__Impl : ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0_1 ) ) ;
    public final void rule__GeneralizationSet__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5164:1: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0_1 ) ) )
            // InternalOntoL.g:5165:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0_1 ) )
            {
            // InternalOntoL.g:5165:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0_1 ) )
            // InternalOntoL.g:5166:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_0_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_0_1()); 
            // InternalOntoL.g:5167:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_0_1 )
            // InternalOntoL.g:5167:3: rule__GeneralizationSet__IsDisjointAssignment_0_0_1
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
    // InternalOntoL.g:5175:1: rule__GeneralizationSet__Group_0_0__2 : rule__GeneralizationSet__Group_0_0__2__Impl ;
    public final void rule__GeneralizationSet__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5179:1: ( rule__GeneralizationSet__Group_0_0__2__Impl )
            // InternalOntoL.g:5180:2: rule__GeneralizationSet__Group_0_0__2__Impl
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
    // InternalOntoL.g:5186:1: rule__GeneralizationSet__Group_0_0__2__Impl : ( ')' ) ;
    public final void rule__GeneralizationSet__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5190:1: ( ( ')' ) )
            // InternalOntoL.g:5191:1: ( ')' )
            {
            // InternalOntoL.g:5191:1: ( ')' )
            // InternalOntoL.g:5192:2: ')'
            {
             before(grammarAccess.getGeneralizationSetAccess().getRightParenthesisKeyword_0_0_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalOntoL.g:5202:1: rule__GeneralizationSet__Group_0_1__0 : rule__GeneralizationSet__Group_0_1__0__Impl rule__GeneralizationSet__Group_0_1__1 ;
    public final void rule__GeneralizationSet__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5206:1: ( rule__GeneralizationSet__Group_0_1__0__Impl rule__GeneralizationSet__Group_0_1__1 )
            // InternalOntoL.g:5207:2: rule__GeneralizationSet__Group_0_1__0__Impl rule__GeneralizationSet__Group_0_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalOntoL.g:5214:1: rule__GeneralizationSet__Group_0_1__0__Impl : ( '(' ) ;
    public final void rule__GeneralizationSet__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5218:1: ( ( '(' ) )
            // InternalOntoL.g:5219:1: ( '(' )
            {
            // InternalOntoL.g:5219:1: ( '(' )
            // InternalOntoL.g:5220:2: '('
            {
             before(grammarAccess.getGeneralizationSetAccess().getLeftParenthesisKeyword_0_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalOntoL.g:5229:1: rule__GeneralizationSet__Group_0_1__1 : rule__GeneralizationSet__Group_0_1__1__Impl rule__GeneralizationSet__Group_0_1__2 ;
    public final void rule__GeneralizationSet__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5233:1: ( rule__GeneralizationSet__Group_0_1__1__Impl rule__GeneralizationSet__Group_0_1__2 )
            // InternalOntoL.g:5234:2: rule__GeneralizationSet__Group_0_1__1__Impl rule__GeneralizationSet__Group_0_1__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalOntoL.g:5241:1: rule__GeneralizationSet__Group_0_1__1__Impl : ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1_1 ) ) ;
    public final void rule__GeneralizationSet__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5245:1: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1_1 ) ) )
            // InternalOntoL.g:5246:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1_1 ) )
            {
            // InternalOntoL.g:5246:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1_1 ) )
            // InternalOntoL.g:5247:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_1_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_1_1()); 
            // InternalOntoL.g:5248:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_1_1 )
            // InternalOntoL.g:5248:3: rule__GeneralizationSet__IsCompleteAssignment_0_1_1
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
    // InternalOntoL.g:5256:1: rule__GeneralizationSet__Group_0_1__2 : rule__GeneralizationSet__Group_0_1__2__Impl ;
    public final void rule__GeneralizationSet__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5260:1: ( rule__GeneralizationSet__Group_0_1__2__Impl )
            // InternalOntoL.g:5261:2: rule__GeneralizationSet__Group_0_1__2__Impl
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
    // InternalOntoL.g:5267:1: rule__GeneralizationSet__Group_0_1__2__Impl : ( ')' ) ;
    public final void rule__GeneralizationSet__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5271:1: ( ( ')' ) )
            // InternalOntoL.g:5272:1: ( ')' )
            {
            // InternalOntoL.g:5272:1: ( ')' )
            // InternalOntoL.g:5273:2: ')'
            {
             before(grammarAccess.getGeneralizationSetAccess().getRightParenthesisKeyword_0_1_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalOntoL.g:5283:1: rule__GeneralizationSet__Group_0_2__0 : rule__GeneralizationSet__Group_0_2__0__Impl rule__GeneralizationSet__Group_0_2__1 ;
    public final void rule__GeneralizationSet__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5287:1: ( rule__GeneralizationSet__Group_0_2__0__Impl rule__GeneralizationSet__Group_0_2__1 )
            // InternalOntoL.g:5288:2: rule__GeneralizationSet__Group_0_2__0__Impl rule__GeneralizationSet__Group_0_2__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalOntoL.g:5295:1: rule__GeneralizationSet__Group_0_2__0__Impl : ( '(' ) ;
    public final void rule__GeneralizationSet__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5299:1: ( ( '(' ) )
            // InternalOntoL.g:5300:1: ( '(' )
            {
            // InternalOntoL.g:5300:1: ( '(' )
            // InternalOntoL.g:5301:2: '('
            {
             before(grammarAccess.getGeneralizationSetAccess().getLeftParenthesisKeyword_0_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalOntoL.g:5310:1: rule__GeneralizationSet__Group_0_2__1 : rule__GeneralizationSet__Group_0_2__1__Impl rule__GeneralizationSet__Group_0_2__2 ;
    public final void rule__GeneralizationSet__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5314:1: ( rule__GeneralizationSet__Group_0_2__1__Impl rule__GeneralizationSet__Group_0_2__2 )
            // InternalOntoL.g:5315:2: rule__GeneralizationSet__Group_0_2__1__Impl rule__GeneralizationSet__Group_0_2__2
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
    // InternalOntoL.g:5322:1: rule__GeneralizationSet__Group_0_2__1__Impl : ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_1 ) ) ;
    public final void rule__GeneralizationSet__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5326:1: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_1 ) ) )
            // InternalOntoL.g:5327:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_1 ) )
            {
            // InternalOntoL.g:5327:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_2_1 ) )
            // InternalOntoL.g:5328:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_2_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_2_1()); 
            // InternalOntoL.g:5329:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_2_1 )
            // InternalOntoL.g:5329:3: rule__GeneralizationSet__IsDisjointAssignment_0_2_1
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
    // InternalOntoL.g:5337:1: rule__GeneralizationSet__Group_0_2__2 : rule__GeneralizationSet__Group_0_2__2__Impl rule__GeneralizationSet__Group_0_2__3 ;
    public final void rule__GeneralizationSet__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5341:1: ( rule__GeneralizationSet__Group_0_2__2__Impl rule__GeneralizationSet__Group_0_2__3 )
            // InternalOntoL.g:5342:2: rule__GeneralizationSet__Group_0_2__2__Impl rule__GeneralizationSet__Group_0_2__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalOntoL.g:5349:1: rule__GeneralizationSet__Group_0_2__2__Impl : ( ',' ) ;
    public final void rule__GeneralizationSet__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5353:1: ( ( ',' ) )
            // InternalOntoL.g:5354:1: ( ',' )
            {
            // InternalOntoL.g:5354:1: ( ',' )
            // InternalOntoL.g:5355:2: ','
            {
             before(grammarAccess.getGeneralizationSetAccess().getCommaKeyword_0_2_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoL.g:5364:1: rule__GeneralizationSet__Group_0_2__3 : rule__GeneralizationSet__Group_0_2__3__Impl rule__GeneralizationSet__Group_0_2__4 ;
    public final void rule__GeneralizationSet__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5368:1: ( rule__GeneralizationSet__Group_0_2__3__Impl rule__GeneralizationSet__Group_0_2__4 )
            // InternalOntoL.g:5369:2: rule__GeneralizationSet__Group_0_2__3__Impl rule__GeneralizationSet__Group_0_2__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalOntoL.g:5376:1: rule__GeneralizationSet__Group_0_2__3__Impl : ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_3 ) ) ;
    public final void rule__GeneralizationSet__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5380:1: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_3 ) ) )
            // InternalOntoL.g:5381:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_3 ) )
            {
            // InternalOntoL.g:5381:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_2_3 ) )
            // InternalOntoL.g:5382:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_2_3 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_2_3()); 
            // InternalOntoL.g:5383:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_2_3 )
            // InternalOntoL.g:5383:3: rule__GeneralizationSet__IsCompleteAssignment_0_2_3
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
    // InternalOntoL.g:5391:1: rule__GeneralizationSet__Group_0_2__4 : rule__GeneralizationSet__Group_0_2__4__Impl ;
    public final void rule__GeneralizationSet__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5395:1: ( rule__GeneralizationSet__Group_0_2__4__Impl )
            // InternalOntoL.g:5396:2: rule__GeneralizationSet__Group_0_2__4__Impl
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
    // InternalOntoL.g:5402:1: rule__GeneralizationSet__Group_0_2__4__Impl : ( ')' ) ;
    public final void rule__GeneralizationSet__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5406:1: ( ( ')' ) )
            // InternalOntoL.g:5407:1: ( ')' )
            {
            // InternalOntoL.g:5407:1: ( ')' )
            // InternalOntoL.g:5408:2: ')'
            {
             before(grammarAccess.getGeneralizationSetAccess().getRightParenthesisKeyword_0_2_4()); 
            match(input,43,FOLLOW_2); 
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
    // InternalOntoL.g:5418:1: rule__GeneralizationSet__Group_0_3__0 : rule__GeneralizationSet__Group_0_3__0__Impl rule__GeneralizationSet__Group_0_3__1 ;
    public final void rule__GeneralizationSet__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5422:1: ( rule__GeneralizationSet__Group_0_3__0__Impl rule__GeneralizationSet__Group_0_3__1 )
            // InternalOntoL.g:5423:2: rule__GeneralizationSet__Group_0_3__0__Impl rule__GeneralizationSet__Group_0_3__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalOntoL.g:5430:1: rule__GeneralizationSet__Group_0_3__0__Impl : ( '(' ) ;
    public final void rule__GeneralizationSet__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5434:1: ( ( '(' ) )
            // InternalOntoL.g:5435:1: ( '(' )
            {
            // InternalOntoL.g:5435:1: ( '(' )
            // InternalOntoL.g:5436:2: '('
            {
             before(grammarAccess.getGeneralizationSetAccess().getLeftParenthesisKeyword_0_3_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalOntoL.g:5445:1: rule__GeneralizationSet__Group_0_3__1 : rule__GeneralizationSet__Group_0_3__1__Impl rule__GeneralizationSet__Group_0_3__2 ;
    public final void rule__GeneralizationSet__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5449:1: ( rule__GeneralizationSet__Group_0_3__1__Impl rule__GeneralizationSet__Group_0_3__2 )
            // InternalOntoL.g:5450:2: rule__GeneralizationSet__Group_0_3__1__Impl rule__GeneralizationSet__Group_0_3__2
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
    // InternalOntoL.g:5457:1: rule__GeneralizationSet__Group_0_3__1__Impl : ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_1 ) ) ;
    public final void rule__GeneralizationSet__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5461:1: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_1 ) ) )
            // InternalOntoL.g:5462:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_1 ) )
            {
            // InternalOntoL.g:5462:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_3_1 ) )
            // InternalOntoL.g:5463:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_3_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_3_1()); 
            // InternalOntoL.g:5464:2: ( rule__GeneralizationSet__IsCompleteAssignment_0_3_1 )
            // InternalOntoL.g:5464:3: rule__GeneralizationSet__IsCompleteAssignment_0_3_1
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
    // InternalOntoL.g:5472:1: rule__GeneralizationSet__Group_0_3__2 : rule__GeneralizationSet__Group_0_3__2__Impl rule__GeneralizationSet__Group_0_3__3 ;
    public final void rule__GeneralizationSet__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5476:1: ( rule__GeneralizationSet__Group_0_3__2__Impl rule__GeneralizationSet__Group_0_3__3 )
            // InternalOntoL.g:5477:2: rule__GeneralizationSet__Group_0_3__2__Impl rule__GeneralizationSet__Group_0_3__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalOntoL.g:5484:1: rule__GeneralizationSet__Group_0_3__2__Impl : ( ',' ) ;
    public final void rule__GeneralizationSet__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5488:1: ( ( ',' ) )
            // InternalOntoL.g:5489:1: ( ',' )
            {
            // InternalOntoL.g:5489:1: ( ',' )
            // InternalOntoL.g:5490:2: ','
            {
             before(grammarAccess.getGeneralizationSetAccess().getCommaKeyword_0_3_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoL.g:5499:1: rule__GeneralizationSet__Group_0_3__3 : rule__GeneralizationSet__Group_0_3__3__Impl rule__GeneralizationSet__Group_0_3__4 ;
    public final void rule__GeneralizationSet__Group_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5503:1: ( rule__GeneralizationSet__Group_0_3__3__Impl rule__GeneralizationSet__Group_0_3__4 )
            // InternalOntoL.g:5504:2: rule__GeneralizationSet__Group_0_3__3__Impl rule__GeneralizationSet__Group_0_3__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalOntoL.g:5511:1: rule__GeneralizationSet__Group_0_3__3__Impl : ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_3 ) ) ;
    public final void rule__GeneralizationSet__Group_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5515:1: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_3 ) ) )
            // InternalOntoL.g:5516:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_3 ) )
            {
            // InternalOntoL.g:5516:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_3_3 ) )
            // InternalOntoL.g:5517:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_3_3 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_3_3()); 
            // InternalOntoL.g:5518:2: ( rule__GeneralizationSet__IsDisjointAssignment_0_3_3 )
            // InternalOntoL.g:5518:3: rule__GeneralizationSet__IsDisjointAssignment_0_3_3
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
    // InternalOntoL.g:5526:1: rule__GeneralizationSet__Group_0_3__4 : rule__GeneralizationSet__Group_0_3__4__Impl ;
    public final void rule__GeneralizationSet__Group_0_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5530:1: ( rule__GeneralizationSet__Group_0_3__4__Impl )
            // InternalOntoL.g:5531:2: rule__GeneralizationSet__Group_0_3__4__Impl
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
    // InternalOntoL.g:5537:1: rule__GeneralizationSet__Group_0_3__4__Impl : ( ')' ) ;
    public final void rule__GeneralizationSet__Group_0_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5541:1: ( ( ')' ) )
            // InternalOntoL.g:5542:1: ( ')' )
            {
            // InternalOntoL.g:5542:1: ( ')' )
            // InternalOntoL.g:5543:2: ')'
            {
             before(grammarAccess.getGeneralizationSetAccess().getRightParenthesisKeyword_0_3_4()); 
            match(input,43,FOLLOW_2); 
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
    // InternalOntoL.g:5553:1: rule__GeneralizationSet__Group_5__0 : rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1 ;
    public final void rule__GeneralizationSet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5557:1: ( rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1 )
            // InternalOntoL.g:5558:2: rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1
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
    // InternalOntoL.g:5565:1: rule__GeneralizationSet__Group_5__0__Impl : ( 'categorizer' ) ;
    public final void rule__GeneralizationSet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5569:1: ( ( 'categorizer' ) )
            // InternalOntoL.g:5570:1: ( 'categorizer' )
            {
            // InternalOntoL.g:5570:1: ( 'categorizer' )
            // InternalOntoL.g:5571:2: 'categorizer'
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
    // InternalOntoL.g:5580:1: rule__GeneralizationSet__Group_5__1 : rule__GeneralizationSet__Group_5__1__Impl ;
    public final void rule__GeneralizationSet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5584:1: ( rule__GeneralizationSet__Group_5__1__Impl )
            // InternalOntoL.g:5585:2: rule__GeneralizationSet__Group_5__1__Impl
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
    // InternalOntoL.g:5591:1: rule__GeneralizationSet__Group_5__1__Impl : ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) ) ;
    public final void rule__GeneralizationSet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5595:1: ( ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) ) )
            // InternalOntoL.g:5596:1: ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) )
            {
            // InternalOntoL.g:5596:1: ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) )
            // InternalOntoL.g:5597:2: ( rule__GeneralizationSet__CategorizerAssignment_5_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerAssignment_5_1()); 
            // InternalOntoL.g:5598:2: ( rule__GeneralizationSet__CategorizerAssignment_5_1 )
            // InternalOntoL.g:5598:3: rule__GeneralizationSet__CategorizerAssignment_5_1
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
    // InternalOntoL.g:5607:1: rule__GeneralizationSet__Group_8__0 : rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1 ;
    public final void rule__GeneralizationSet__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5611:1: ( rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1 )
            // InternalOntoL.g:5612:2: rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1
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
    // InternalOntoL.g:5619:1: rule__GeneralizationSet__Group_8__0__Impl : ( ',' ) ;
    public final void rule__GeneralizationSet__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5623:1: ( ( ',' ) )
            // InternalOntoL.g:5624:1: ( ',' )
            {
            // InternalOntoL.g:5624:1: ( ',' )
            // InternalOntoL.g:5625:2: ','
            {
             before(grammarAccess.getGeneralizationSetAccess().getCommaKeyword_8_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoL.g:5634:1: rule__GeneralizationSet__Group_8__1 : rule__GeneralizationSet__Group_8__1__Impl ;
    public final void rule__GeneralizationSet__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5638:1: ( rule__GeneralizationSet__Group_8__1__Impl )
            // InternalOntoL.g:5639:2: rule__GeneralizationSet__Group_8__1__Impl
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
    // InternalOntoL.g:5645:1: rule__GeneralizationSet__Group_8__1__Impl : ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) ) ;
    public final void rule__GeneralizationSet__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5649:1: ( ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) ) )
            // InternalOntoL.g:5650:1: ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) )
            {
            // InternalOntoL.g:5650:1: ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) )
            // InternalOntoL.g:5651:2: ( rule__GeneralizationSet__SpecificsAssignment_8_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_8_1()); 
            // InternalOntoL.g:5652:2: ( rule__GeneralizationSet__SpecificsAssignment_8_1 )
            // InternalOntoL.g:5652:3: rule__GeneralizationSet__SpecificsAssignment_8_1
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
    // InternalOntoL.g:5661:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5665:1: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:5666:2: ( ruleQualifiedName )
            {
            // InternalOntoL.g:5666:2: ( ruleQualifiedName )
            // InternalOntoL.g:5667:3: ruleQualifiedName
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
    // InternalOntoL.g:5676:1: rule__Model__ElementsAssignment_3 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5680:1: ( ( ruleModelElement ) )
            // InternalOntoL.g:5681:2: ( ruleModelElement )
            {
            // InternalOntoL.g:5681:2: ( ruleModelElement )
            // InternalOntoL.g:5682:3: ruleModelElement
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
    // InternalOntoL.g:5691:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5695:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalOntoL.g:5696:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalOntoL.g:5696:2: ( ruleQualifiedNameWithWildcard )
            // InternalOntoL.g:5697:3: ruleQualifiedNameWithWildcard
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
    // InternalOntoL.g:5706:1: rule__Individual__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Individual__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5710:1: ( ( RULE_ID ) )
            // InternalOntoL.g:5711:2: ( RULE_ID )
            {
            // InternalOntoL.g:5711:2: ( RULE_ID )
            // InternalOntoL.g:5712:3: RULE_ID
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


    // $ANTLR start "rule__Individual__FixedTypesAssignment_2_1"
    // InternalOntoL.g:5721:1: rule__Individual__FixedTypesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Individual__FixedTypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5725:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:5726:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:5726:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:5727:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getIndividualAccess().getFixedTypesClassCrossReference_2_1_0()); 
            // InternalOntoL.g:5728:3: ( ruleQualifiedName )
            // InternalOntoL.g:5729:4: ruleQualifiedName
            {
             before(grammarAccess.getIndividualAccess().getFixedTypesClassQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getIndividualAccess().getFixedTypesClassQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getIndividualAccess().getFixedTypesClassCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__FixedTypesAssignment_2_1"


    // $ANTLR start "rule__Individual__FixedTypesAssignment_2_2_1"
    // InternalOntoL.g:5740:1: rule__Individual__FixedTypesAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Individual__FixedTypesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5744:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:5745:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:5745:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:5746:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getIndividualAccess().getFixedTypesClassCrossReference_2_2_1_0()); 
            // InternalOntoL.g:5747:3: ( ruleQualifiedName )
            // InternalOntoL.g:5748:4: ruleQualifiedName
            {
             before(grammarAccess.getIndividualAccess().getFixedTypesClassQualifiedNameParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getIndividualAccess().getFixedTypesClassQualifiedNameParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getIndividualAccess().getFixedTypesClassCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__FixedTypesAssignment_2_2_1"


    // $ANTLR start "rule__Individual__PropAssignsAssignment_3_1"
    // InternalOntoL.g:5759:1: rule__Individual__PropAssignsAssignment_3_1 : ( rulePropertyAssignment ) ;
    public final void rule__Individual__PropAssignsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5763:1: ( ( rulePropertyAssignment ) )
            // InternalOntoL.g:5764:2: ( rulePropertyAssignment )
            {
            // InternalOntoL.g:5764:2: ( rulePropertyAssignment )
            // InternalOntoL.g:5765:3: rulePropertyAssignment
            {
             before(grammarAccess.getIndividualAccess().getPropAssignsPropertyAssignmentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyAssignment();

            state._fsp--;

             after(grammarAccess.getIndividualAccess().getPropAssignsPropertyAssignmentParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__PropAssignsAssignment_3_1"


    // $ANTLR start "rule__Set__NameAssignment_1"
    // InternalOntoL.g:5774:1: rule__Set__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Set__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5778:1: ( ( RULE_STRING ) )
            // InternalOntoL.g:5779:2: ( RULE_STRING )
            {
            // InternalOntoL.g:5779:2: ( RULE_STRING )
            // InternalOntoL.g:5780:3: RULE_STRING
            {
             before(grammarAccess.getSetAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__NameAssignment_1"


    // $ANTLR start "rule__Set__FixedTypesAssignment_2_1"
    // InternalOntoL.g:5789:1: rule__Set__FixedTypesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Set__FixedTypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5793:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:5794:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:5794:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:5795:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSetAccess().getFixedTypesClassCrossReference_2_1_0()); 
            // InternalOntoL.g:5796:3: ( ruleQualifiedName )
            // InternalOntoL.g:5797:4: ruleQualifiedName
            {
             before(grammarAccess.getSetAccess().getFixedTypesClassQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSetAccess().getFixedTypesClassQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getSetAccess().getFixedTypesClassCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__FixedTypesAssignment_2_1"


    // $ANTLR start "rule__Set__FixedTypesAssignment_2_2_1"
    // InternalOntoL.g:5808:1: rule__Set__FixedTypesAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Set__FixedTypesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5812:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:5813:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:5813:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:5814:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSetAccess().getFixedTypesClassCrossReference_2_2_1_0()); 
            // InternalOntoL.g:5815:3: ( ruleQualifiedName )
            // InternalOntoL.g:5816:4: ruleQualifiedName
            {
             before(grammarAccess.getSetAccess().getFixedTypesClassQualifiedNameParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSetAccess().getFixedTypesClassQualifiedNameParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getSetAccess().getFixedTypesClassCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__FixedTypesAssignment_2_2_1"


    // $ANTLR start "rule__Set__PropAssignsAssignment_3_1"
    // InternalOntoL.g:5827:1: rule__Set__PropAssignsAssignment_3_1 : ( rulePropertyAssignment ) ;
    public final void rule__Set__PropAssignsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5831:1: ( ( rulePropertyAssignment ) )
            // InternalOntoL.g:5832:2: ( rulePropertyAssignment )
            {
            // InternalOntoL.g:5832:2: ( rulePropertyAssignment )
            // InternalOntoL.g:5833:3: rulePropertyAssignment
            {
             before(grammarAccess.getSetAccess().getPropAssignsPropertyAssignmentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyAssignment();

            state._fsp--;

             after(grammarAccess.getSetAccess().getPropAssignsPropertyAssignmentParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__PropAssignsAssignment_3_1"


    // $ANTLR start "rule__Class__PropsAssignment_1_1_0"
    // InternalOntoL.g:5842:1: rule__Class__PropsAssignment_1_1_0 : ( ruleProperty ) ;
    public final void rule__Class__PropsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5846:1: ( ( ruleProperty ) )
            // InternalOntoL.g:5847:2: ( ruleProperty )
            {
            // InternalOntoL.g:5847:2: ( ruleProperty )
            // InternalOntoL.g:5848:3: ruleProperty
            {
             before(grammarAccess.getClassAccess().getPropsPropertyParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getClassAccess().getPropsPropertyParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__PropsAssignment_1_1_0"


    // $ANTLR start "rule__Class__PropAssignsAssignment_1_1_1"
    // InternalOntoL.g:5857:1: rule__Class__PropAssignsAssignment_1_1_1 : ( rulePropertyAssignment ) ;
    public final void rule__Class__PropAssignsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5861:1: ( ( rulePropertyAssignment ) )
            // InternalOntoL.g:5862:2: ( rulePropertyAssignment )
            {
            // InternalOntoL.g:5862:2: ( rulePropertyAssignment )
            // InternalOntoL.g:5863:3: rulePropertyAssignment
            {
             before(grammarAccess.getClassAccess().getPropAssignsPropertyAssignmentParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyAssignment();

            state._fsp--;

             after(grammarAccess.getClassAccess().getPropAssignsPropertyAssignmentParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__PropAssignsAssignment_1_1_1"


    // $ANTLR start "rule__WClass__NameAssignment_1"
    // InternalOntoL.g:5872:1: rule__WClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5876:1: ( ( RULE_ID ) )
            // InternalOntoL.g:5877:2: ( RULE_ID )
            {
            // InternalOntoL.g:5877:2: ( RULE_ID )
            // InternalOntoL.g:5878:3: RULE_ID
            {
             before(grammarAccess.getWClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__NameAssignment_1"


    // $ANTLR start "rule__WClass__FixedTypesAssignment_2_1"
    // InternalOntoL.g:5887:1: rule__WClass__FixedTypesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__WClass__FixedTypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5891:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:5892:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:5892:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:5893:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getWClassAccess().getFixedTypesClassCrossReference_2_1_0()); 
            // InternalOntoL.g:5894:3: ( ruleQualifiedName )
            // InternalOntoL.g:5895:4: ruleQualifiedName
            {
             before(grammarAccess.getWClassAccess().getFixedTypesClassQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getWClassAccess().getFixedTypesClassQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getWClassAccess().getFixedTypesClassCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__FixedTypesAssignment_2_1"


    // $ANTLR start "rule__WClass__FixedTypesAssignment_2_2_1"
    // InternalOntoL.g:5906:1: rule__WClass__FixedTypesAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__WClass__FixedTypesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5910:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:5911:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:5911:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:5912:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getWClassAccess().getFixedTypesClassCrossReference_2_2_1_0()); 
            // InternalOntoL.g:5913:3: ( ruleQualifiedName )
            // InternalOntoL.g:5914:4: ruleQualifiedName
            {
             before(grammarAccess.getWClassAccess().getFixedTypesClassQualifiedNameParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getWClassAccess().getFixedTypesClassQualifiedNameParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getWClassAccess().getFixedTypesClassCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__FixedTypesAssignment_2_2_1"


    // $ANTLR start "rule__WClass__SuperClassesAssignment_3_1"
    // InternalOntoL.g:5925:1: rule__WClass__SuperClassesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__WClass__SuperClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5929:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:5930:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:5930:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:5931:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getWClassAccess().getSuperClassesClassCrossReference_3_1_0()); 
            // InternalOntoL.g:5932:3: ( ruleQualifiedName )
            // InternalOntoL.g:5933:4: ruleQualifiedName
            {
             before(grammarAccess.getWClassAccess().getSuperClassesClassQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getWClassAccess().getSuperClassesClassQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getWClassAccess().getSuperClassesClassCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__SuperClassesAssignment_3_1"


    // $ANTLR start "rule__WClass__SuperClassesAssignment_3_2_1"
    // InternalOntoL.g:5944:1: rule__WClass__SuperClassesAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__WClass__SuperClassesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5948:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:5949:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:5949:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:5950:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getWClassAccess().getSuperClassesClassCrossReference_3_2_1_0()); 
            // InternalOntoL.g:5951:3: ( ruleQualifiedName )
            // InternalOntoL.g:5952:4: ruleQualifiedName
            {
             before(grammarAccess.getWClassAccess().getSuperClassesClassQualifiedNameParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getWClassAccess().getSuperClassesClassQualifiedNameParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getWClassAccess().getSuperClassesClassCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__SuperClassesAssignment_3_2_1"


    // $ANTLR start "rule__WClass__SubordinatorsAssignment_4_1"
    // InternalOntoL.g:5963:1: rule__WClass__SubordinatorsAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__WClass__SubordinatorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5967:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:5968:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:5968:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:5969:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getWClassAccess().getSubordinatorsClassCrossReference_4_1_0()); 
            // InternalOntoL.g:5970:3: ( ruleQualifiedName )
            // InternalOntoL.g:5971:4: ruleQualifiedName
            {
             before(grammarAccess.getWClassAccess().getSubordinatorsClassQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getWClassAccess().getSubordinatorsClassQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getWClassAccess().getSubordinatorsClassCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__SubordinatorsAssignment_4_1"


    // $ANTLR start "rule__WClass__SubordinatorsAssignment_4_2_1"
    // InternalOntoL.g:5982:1: rule__WClass__SubordinatorsAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__WClass__SubordinatorsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:5986:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:5987:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:5987:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:5988:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getWClassAccess().getSubordinatorsClassCrossReference_4_2_1_0()); 
            // InternalOntoL.g:5989:3: ( ruleQualifiedName )
            // InternalOntoL.g:5990:4: ruleQualifiedName
            {
             before(grammarAccess.getWClassAccess().getSubordinatorsClassQualifiedNameParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getWClassAccess().getSubordinatorsClassQualifiedNameParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getWClassAccess().getSubordinatorsClassCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__SubordinatorsAssignment_4_2_1"


    // $ANTLR start "rule__WClass__CatTypeAssignment_5_0_0"
    // InternalOntoL.g:6001:1: rule__WClass__CatTypeAssignment_5_0_0 : ( ruleCategorizationType ) ;
    public final void rule__WClass__CatTypeAssignment_5_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6005:1: ( ( ruleCategorizationType ) )
            // InternalOntoL.g:6006:2: ( ruleCategorizationType )
            {
            // InternalOntoL.g:6006:2: ( ruleCategorizationType )
            // InternalOntoL.g:6007:3: ruleCategorizationType
            {
             before(grammarAccess.getWClassAccess().getCatTypeCategorizationTypeEnumRuleCall_5_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCategorizationType();

            state._fsp--;

             after(grammarAccess.getWClassAccess().getCatTypeCategorizationTypeEnumRuleCall_5_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__CatTypeAssignment_5_0_0"


    // $ANTLR start "rule__WClass__BasetypeAssignment_5_0_1"
    // InternalOntoL.g:6016:1: rule__WClass__BasetypeAssignment_5_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__WClass__BasetypeAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6020:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6021:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6021:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6022:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getWClassAccess().getBasetypeClassCrossReference_5_0_1_0()); 
            // InternalOntoL.g:6023:3: ( ruleQualifiedName )
            // InternalOntoL.g:6024:4: ruleQualifiedName
            {
             before(grammarAccess.getWClassAccess().getBasetypeClassQualifiedNameParserRuleCall_5_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getWClassAccess().getBasetypeClassQualifiedNameParserRuleCall_5_0_1_0_1()); 

            }

             after(grammarAccess.getWClassAccess().getBasetypeClassCrossReference_5_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__BasetypeAssignment_5_0_1"


    // $ANTLR start "rule__WClass__PowertypeOfAssignment_5_1_1"
    // InternalOntoL.g:6035:1: rule__WClass__PowertypeOfAssignment_5_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__WClass__PowertypeOfAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6039:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6040:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6040:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6041:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getWClassAccess().getPowertypeOfClassCrossReference_5_1_1_0()); 
            // InternalOntoL.g:6042:3: ( ruleQualifiedName )
            // InternalOntoL.g:6043:4: ruleQualifiedName
            {
             before(grammarAccess.getWClassAccess().getPowertypeOfClassQualifiedNameParserRuleCall_5_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getWClassAccess().getPowertypeOfClassQualifiedNameParserRuleCall_5_1_1_0_1()); 

            }

             after(grammarAccess.getWClassAccess().getPowertypeOfClassCrossReference_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WClass__PowertypeOfAssignment_5_1_1"


    // $ANTLR start "rule__FOClass__NameAssignment_1"
    // InternalOntoL.g:6054:1: rule__FOClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FOClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6058:1: ( ( RULE_ID ) )
            // InternalOntoL.g:6059:2: ( RULE_ID )
            {
            // InternalOntoL.g:6059:2: ( RULE_ID )
            // InternalOntoL.g:6060:3: RULE_ID
            {
             before(grammarAccess.getFOClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFOClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__NameAssignment_1"


    // $ANTLR start "rule__FOClass__FixedTypesAssignment_2_1"
    // InternalOntoL.g:6069:1: rule__FOClass__FixedTypesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__FixedTypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6073:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6074:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6074:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6075:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getFixedTypesClassCrossReference_2_1_0()); 
            // InternalOntoL.g:6076:3: ( ruleQualifiedName )
            // InternalOntoL.g:6077:4: ruleQualifiedName
            {
             before(grammarAccess.getFOClassAccess().getFixedTypesClassQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFOClassAccess().getFixedTypesClassQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getFOClassAccess().getFixedTypesClassCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__FixedTypesAssignment_2_1"


    // $ANTLR start "rule__FOClass__FixedTypesAssignment_2_2_1"
    // InternalOntoL.g:6088:1: rule__FOClass__FixedTypesAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__FixedTypesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6092:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6093:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6093:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6094:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getFixedTypesClassCrossReference_2_2_1_0()); 
            // InternalOntoL.g:6095:3: ( ruleQualifiedName )
            // InternalOntoL.g:6096:4: ruleQualifiedName
            {
             before(grammarAccess.getFOClassAccess().getFixedTypesClassQualifiedNameParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFOClassAccess().getFixedTypesClassQualifiedNameParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getFOClassAccess().getFixedTypesClassCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__FixedTypesAssignment_2_2_1"


    // $ANTLR start "rule__FOClass__SuperClassesAssignment_3_1"
    // InternalOntoL.g:6107:1: rule__FOClass__SuperClassesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__SuperClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6111:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6112:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6112:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6113:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesClassCrossReference_3_1_0()); 
            // InternalOntoL.g:6114:3: ( ruleQualifiedName )
            // InternalOntoL.g:6115:4: ruleQualifiedName
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesClassQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFOClassAccess().getSuperClassesClassQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getFOClassAccess().getSuperClassesClassCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__SuperClassesAssignment_3_1"


    // $ANTLR start "rule__FOClass__SuperClassesAssignment_3_2_1"
    // InternalOntoL.g:6126:1: rule__FOClass__SuperClassesAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClass__SuperClassesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6130:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6131:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6131:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6132:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesClassCrossReference_3_2_1_0()); 
            // InternalOntoL.g:6133:3: ( ruleQualifiedName )
            // InternalOntoL.g:6134:4: ruleQualifiedName
            {
             before(grammarAccess.getFOClassAccess().getSuperClassesClassQualifiedNameParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFOClassAccess().getSuperClassesClassQualifiedNameParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getFOClassAccess().getSuperClassesClassCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__SuperClassesAssignment_3_2_1"


    // $ANTLR start "rule__HOClass__NameAssignment_1"
    // InternalOntoL.g:6145:1: rule__HOClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HOClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6149:1: ( ( RULE_ID ) )
            // InternalOntoL.g:6150:2: ( RULE_ID )
            {
            // InternalOntoL.g:6150:2: ( RULE_ID )
            // InternalOntoL.g:6151:3: RULE_ID
            {
             before(grammarAccess.getHOClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__NameAssignment_1"


    // $ANTLR start "rule__HOClass__OrderAssignment_3"
    // InternalOntoL.g:6160:1: rule__HOClass__OrderAssignment_3 : ( RULE_INT ) ;
    public final void rule__HOClass__OrderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6164:1: ( ( RULE_INT ) )
            // InternalOntoL.g:6165:2: ( RULE_INT )
            {
            // InternalOntoL.g:6165:2: ( RULE_INT )
            // InternalOntoL.g:6166:3: RULE_INT
            {
             before(grammarAccess.getHOClassAccess().getOrderINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getOrderINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__OrderAssignment_3"


    // $ANTLR start "rule__HOClass__FixedTypesAssignment_4_1"
    // InternalOntoL.g:6175:1: rule__HOClass__FixedTypesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__FixedTypesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6179:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6180:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6180:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6181:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getFixedTypesClassCrossReference_4_1_0()); 
            // InternalOntoL.g:6182:3: ( ruleQualifiedName )
            // InternalOntoL.g:6183:4: ruleQualifiedName
            {
             before(grammarAccess.getHOClassAccess().getFixedTypesClassQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHOClassAccess().getFixedTypesClassQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getHOClassAccess().getFixedTypesClassCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__FixedTypesAssignment_4_1"


    // $ANTLR start "rule__HOClass__FixedTypesAssignment_4_2_1"
    // InternalOntoL.g:6194:1: rule__HOClass__FixedTypesAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__FixedTypesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6198:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6199:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6199:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6200:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getFixedTypesClassCrossReference_4_2_1_0()); 
            // InternalOntoL.g:6201:3: ( ruleQualifiedName )
            // InternalOntoL.g:6202:4: ruleQualifiedName
            {
             before(grammarAccess.getHOClassAccess().getFixedTypesClassQualifiedNameParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHOClassAccess().getFixedTypesClassQualifiedNameParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getHOClassAccess().getFixedTypesClassCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__FixedTypesAssignment_4_2_1"


    // $ANTLR start "rule__HOClass__SuperClassesAssignment_5_1"
    // InternalOntoL.g:6213:1: rule__HOClass__SuperClassesAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SuperClassesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6217:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6218:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6218:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6219:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesClassCrossReference_5_1_0()); 
            // InternalOntoL.g:6220:3: ( ruleQualifiedName )
            // InternalOntoL.g:6221:4: ruleQualifiedName
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesClassQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHOClassAccess().getSuperClassesClassQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getHOClassAccess().getSuperClassesClassCrossReference_5_1_0()); 

            }


            }

        }
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
    // InternalOntoL.g:6232:1: rule__HOClass__SuperClassesAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SuperClassesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6236:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6237:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6237:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6238:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesClassCrossReference_5_2_1_0()); 
            // InternalOntoL.g:6239:3: ( ruleQualifiedName )
            // InternalOntoL.g:6240:4: ruleQualifiedName
            {
             before(grammarAccess.getHOClassAccess().getSuperClassesClassQualifiedNameParserRuleCall_5_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHOClassAccess().getSuperClassesClassQualifiedNameParserRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getHOClassAccess().getSuperClassesClassCrossReference_5_2_1_0()); 

            }


            }

        }
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
    // InternalOntoL.g:6251:1: rule__HOClass__SubordinatorsAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SubordinatorsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6255:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6256:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6256:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6257:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsClassCrossReference_6_1_0()); 
            // InternalOntoL.g:6258:3: ( ruleQualifiedName )
            // InternalOntoL.g:6259:4: ruleQualifiedName
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsClassQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHOClassAccess().getSubordinatorsClassQualifiedNameParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getHOClassAccess().getSubordinatorsClassCrossReference_6_1_0()); 

            }


            }

        }
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
    // InternalOntoL.g:6270:1: rule__HOClass__SubordinatorsAssignment_6_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__SubordinatorsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6274:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6275:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6275:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6276:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsClassCrossReference_6_2_1_0()); 
            // InternalOntoL.g:6277:3: ( ruleQualifiedName )
            // InternalOntoL.g:6278:4: ruleQualifiedName
            {
             before(grammarAccess.getHOClassAccess().getSubordinatorsClassQualifiedNameParserRuleCall_6_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHOClassAccess().getSubordinatorsClassQualifiedNameParserRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getHOClassAccess().getSubordinatorsClassCrossReference_6_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__HOClass__CatTypeAssignment_7_0_0"
    // InternalOntoL.g:6289:1: rule__HOClass__CatTypeAssignment_7_0_0 : ( ruleCategorizationType ) ;
    public final void rule__HOClass__CatTypeAssignment_7_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6293:1: ( ( ruleCategorizationType ) )
            // InternalOntoL.g:6294:2: ( ruleCategorizationType )
            {
            // InternalOntoL.g:6294:2: ( ruleCategorizationType )
            // InternalOntoL.g:6295:3: ruleCategorizationType
            {
             before(grammarAccess.getHOClassAccess().getCatTypeCategorizationTypeEnumRuleCall_7_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCategorizationType();

            state._fsp--;

             after(grammarAccess.getHOClassAccess().getCatTypeCategorizationTypeEnumRuleCall_7_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__CatTypeAssignment_7_0_0"


    // $ANTLR start "rule__HOClass__BasetypeAssignment_7_0_1"
    // InternalOntoL.g:6304:1: rule__HOClass__BasetypeAssignment_7_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__BasetypeAssignment_7_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6308:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6309:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6309:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6310:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getBasetypeClassCrossReference_7_0_1_0()); 
            // InternalOntoL.g:6311:3: ( ruleQualifiedName )
            // InternalOntoL.g:6312:4: ruleQualifiedName
            {
             before(grammarAccess.getHOClassAccess().getBasetypeClassQualifiedNameParserRuleCall_7_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHOClassAccess().getBasetypeClassQualifiedNameParserRuleCall_7_0_1_0_1()); 

            }

             after(grammarAccess.getHOClassAccess().getBasetypeClassCrossReference_7_0_1_0()); 

            }


            }

        }
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
    // InternalOntoL.g:6323:1: rule__HOClass__PowertypeOfAssignment_7_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HOClass__PowertypeOfAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6327:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6328:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6328:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6329:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHOClassAccess().getPowertypeOfClassCrossReference_7_1_1_0()); 
            // InternalOntoL.g:6330:3: ( ruleQualifiedName )
            // InternalOntoL.g:6331:4: ruleQualifiedName
            {
             before(grammarAccess.getHOClassAccess().getPowertypeOfClassQualifiedNameParserRuleCall_7_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHOClassAccess().getPowertypeOfClassQualifiedNameParserRuleCall_7_1_1_0_1()); 

            }

             after(grammarAccess.getHOClassAccess().getPowertypeOfClassCrossReference_7_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Property__NameAssignment_0"
    // InternalOntoL.g:6342:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6346:1: ( ( RULE_ID ) )
            // InternalOntoL.g:6347:2: ( RULE_ID )
            {
            // InternalOntoL.g:6347:2: ( RULE_ID )
            // InternalOntoL.g:6348:3: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_0"


    // $ANTLR start "rule__Property__LowerBoundAssignment_2_1"
    // InternalOntoL.g:6357:1: rule__Property__LowerBoundAssignment_2_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__Property__LowerBoundAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6361:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:6362:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:6362:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:6363:3: ruleELEMENTBOUND
            {
             before(grammarAccess.getPropertyAccess().getLowerBoundELEMENTBOUNDParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getLowerBoundELEMENTBOUNDParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__LowerBoundAssignment_2_1"


    // $ANTLR start "rule__Property__UpperBoundAssignment_2_3"
    // InternalOntoL.g:6372:1: rule__Property__UpperBoundAssignment_2_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__Property__UpperBoundAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6376:1: ( ( ruleELEMENTBOUND ) )
            // InternalOntoL.g:6377:2: ( ruleELEMENTBOUND )
            {
            // InternalOntoL.g:6377:2: ( ruleELEMENTBOUND )
            // InternalOntoL.g:6378:3: ruleELEMENTBOUND
            {
             before(grammarAccess.getPropertyAccess().getUpperBoundELEMENTBOUNDParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getUpperBoundELEMENTBOUNDParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__UpperBoundAssignment_2_3"


    // $ANTLR start "rule__Property__PropertyTypeAssignment_3"
    // InternalOntoL.g:6387:1: rule__Property__PropertyTypeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Property__PropertyTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6391:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6392:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6392:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6393:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPropertyAccess().getPropertyTypeClassCrossReference_3_0()); 
            // InternalOntoL.g:6394:3: ( ruleQualifiedName )
            // InternalOntoL.g:6395:4: ruleQualifiedName
            {
             before(grammarAccess.getPropertyAccess().getPropertyTypeClassQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getPropertyTypeClassQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getPropertyTypeClassCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__PropertyTypeAssignment_3"


    // $ANTLR start "rule__Property__SubsetOfAssignment_4_1"
    // InternalOntoL.g:6406:1: rule__Property__SubsetOfAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Property__SubsetOfAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6410:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6411:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6411:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6412:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPropertyAccess().getSubsetOfPropertyCrossReference_4_1_0()); 
            // InternalOntoL.g:6413:3: ( ruleQualifiedName )
            // InternalOntoL.g:6414:4: ruleQualifiedName
            {
             before(grammarAccess.getPropertyAccess().getSubsetOfPropertyQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getSubsetOfPropertyQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getSubsetOfPropertyCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__SubsetOfAssignment_4_1"


    // $ANTLR start "rule__Property__SubsetOfAssignment_4_2_1"
    // InternalOntoL.g:6425:1: rule__Property__SubsetOfAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Property__SubsetOfAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6429:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6430:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6430:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6431:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPropertyAccess().getSubsetOfPropertyCrossReference_4_2_1_0()); 
            // InternalOntoL.g:6432:3: ( ruleQualifiedName )
            // InternalOntoL.g:6433:4: ruleQualifiedName
            {
             before(grammarAccess.getPropertyAccess().getSubsetOfPropertyQualifiedNameParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getSubsetOfPropertyQualifiedNameParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getSubsetOfPropertyCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__SubsetOfAssignment_4_2_1"


    // $ANTLR start "rule__Property__OppositeToAssignment_5_1"
    // InternalOntoL.g:6444:1: rule__Property__OppositeToAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Property__OppositeToAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6448:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6449:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6449:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6450:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPropertyAccess().getOppositeToPropertyCrossReference_5_1_0()); 
            // InternalOntoL.g:6451:3: ( ruleQualifiedName )
            // InternalOntoL.g:6452:4: ruleQualifiedName
            {
             before(grammarAccess.getPropertyAccess().getOppositeToPropertyQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getOppositeToPropertyQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getOppositeToPropertyCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__OppositeToAssignment_5_1"


    // $ANTLR start "rule__PropertyAssignment__PropertyAssignment_0"
    // InternalOntoL.g:6463:1: rule__PropertyAssignment__PropertyAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PropertyAssignment__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6467:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6468:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6468:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6469:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPropertyAssignmentAccess().getPropertyPropertyCrossReference_0_0()); 
            // InternalOntoL.g:6470:3: ( ruleQualifiedName )
            // InternalOntoL.g:6471:4: ruleQualifiedName
            {
             before(grammarAccess.getPropertyAssignmentAccess().getPropertyPropertyQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPropertyAssignmentAccess().getPropertyPropertyQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPropertyAssignmentAccess().getPropertyPropertyCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAssignment__PropertyAssignment_0"


    // $ANTLR start "rule__PropertyAssignment__AssignmentAssignment_2"
    // InternalOntoL.g:6482:1: rule__PropertyAssignment__AssignmentAssignment_2 : ( ruleValue ) ;
    public final void rule__PropertyAssignment__AssignmentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6486:1: ( ( ruleValue ) )
            // InternalOntoL.g:6487:2: ( ruleValue )
            {
            // InternalOntoL.g:6487:2: ( ruleValue )
            // InternalOntoL.g:6488:3: ruleValue
            {
             before(grammarAccess.getPropertyAssignmentAccess().getAssignmentValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPropertyAssignmentAccess().getAssignmentValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAssignment__AssignmentAssignment_2"


    // $ANTLR start "rule__ReferenceValue__ValueAssignment"
    // InternalOntoL.g:6497:1: rule__ReferenceValue__ValueAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6501:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6502:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6502:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6503:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceValueAccess().getValueEntityDeclarationCrossReference_0()); 
            // InternalOntoL.g:6504:3: ( ruleQualifiedName )
            // InternalOntoL.g:6505:4: ruleQualifiedName
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


    // $ANTLR start "rule__ListValue__ValueAssignment_1"
    // InternalOntoL.g:6516:1: rule__ListValue__ValueAssignment_1 : ( ruleValue ) ;
    public final void rule__ListValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6520:1: ( ( ruleValue ) )
            // InternalOntoL.g:6521:2: ( ruleValue )
            {
            // InternalOntoL.g:6521:2: ( ruleValue )
            // InternalOntoL.g:6522:3: ruleValue
            {
             before(grammarAccess.getListValueAccess().getValueValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getListValueAccess().getValueValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__ValueAssignment_1"


    // $ANTLR start "rule__ListValue__ValueAssignment_2_1"
    // InternalOntoL.g:6531:1: rule__ListValue__ValueAssignment_2_1 : ( ruleValue ) ;
    public final void rule__ListValue__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6535:1: ( ( ruleValue ) )
            // InternalOntoL.g:6536:2: ( ruleValue )
            {
            // InternalOntoL.g:6536:2: ( ruleValue )
            // InternalOntoL.g:6537:3: ruleValue
            {
             before(grammarAccess.getListValueAccess().getValueValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getListValueAccess().getValueValueParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__ValueAssignment_2_1"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalOntoL.g:6546:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6550:1: ( ( RULE_STRING ) )
            // InternalOntoL.g:6551:2: ( RULE_STRING )
            {
            // InternalOntoL.g:6551:2: ( RULE_STRING )
            // InternalOntoL.g:6552:3: RULE_STRING
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
    // InternalOntoL.g:6561:1: rule__NumberValue__ValueAssignment : ( ruleNUMBER ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6565:1: ( ( ruleNUMBER ) )
            // InternalOntoL.g:6566:2: ( ruleNUMBER )
            {
            // InternalOntoL.g:6566:2: ( ruleNUMBER )
            // InternalOntoL.g:6567:3: ruleNUMBER
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
    // InternalOntoL.g:6576:1: rule__BooleanValue__ValueAssignment : ( ruleBOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6580:1: ( ( ruleBOOLEAN ) )
            // InternalOntoL.g:6581:2: ( ruleBOOLEAN )
            {
            // InternalOntoL.g:6581:2: ( ruleBOOLEAN )
            // InternalOntoL.g:6582:3: ruleBOOLEAN
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
    // InternalOntoL.g:6591:1: rule__GeneralizationSet__IsDisjointAssignment_0_0_1 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6595:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoL.g:6596:2: ( ( 'disjoint' ) )
            {
            // InternalOntoL.g:6596:2: ( ( 'disjoint' ) )
            // InternalOntoL.g:6597:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_1_0()); 
            // InternalOntoL.g:6598:3: ( 'disjoint' )
            // InternalOntoL.g:6599:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_1_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalOntoL.g:6610:1: rule__GeneralizationSet__IsCompleteAssignment_0_1_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6614:1: ( ( ( 'complete' ) ) )
            // InternalOntoL.g:6615:2: ( ( 'complete' ) )
            {
            // InternalOntoL.g:6615:2: ( ( 'complete' ) )
            // InternalOntoL.g:6616:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_1_0()); 
            // InternalOntoL.g:6617:3: ( 'complete' )
            // InternalOntoL.g:6618:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_1_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalOntoL.g:6629:1: rule__GeneralizationSet__IsDisjointAssignment_0_2_1 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6633:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoL.g:6634:2: ( ( 'disjoint' ) )
            {
            // InternalOntoL.g:6634:2: ( ( 'disjoint' ) )
            // InternalOntoL.g:6635:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_2_1_0()); 
            // InternalOntoL.g:6636:3: ( 'disjoint' )
            // InternalOntoL.g:6637:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_2_1_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalOntoL.g:6648:1: rule__GeneralizationSet__IsCompleteAssignment_0_2_3 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6652:1: ( ( ( 'complete' ) ) )
            // InternalOntoL.g:6653:2: ( ( 'complete' ) )
            {
            // InternalOntoL.g:6653:2: ( ( 'complete' ) )
            // InternalOntoL.g:6654:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_2_3_0()); 
            // InternalOntoL.g:6655:3: ( 'complete' )
            // InternalOntoL.g:6656:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_2_3_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalOntoL.g:6667:1: rule__GeneralizationSet__IsCompleteAssignment_0_3_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6671:1: ( ( ( 'complete' ) ) )
            // InternalOntoL.g:6672:2: ( ( 'complete' ) )
            {
            // InternalOntoL.g:6672:2: ( ( 'complete' ) )
            // InternalOntoL.g:6673:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_3_1_0()); 
            // InternalOntoL.g:6674:3: ( 'complete' )
            // InternalOntoL.g:6675:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_3_1_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalOntoL.g:6686:1: rule__GeneralizationSet__IsDisjointAssignment_0_3_3 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6690:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoL.g:6691:2: ( ( 'disjoint' ) )
            {
            // InternalOntoL.g:6691:2: ( ( 'disjoint' ) )
            // InternalOntoL.g:6692:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_3_3_0()); 
            // InternalOntoL.g:6693:3: ( 'disjoint' )
            // InternalOntoL.g:6694:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_3_3_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalOntoL.g:6705:1: rule__GeneralizationSet__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GeneralizationSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6709:1: ( ( RULE_ID ) )
            // InternalOntoL.g:6710:2: ( RULE_ID )
            {
            // InternalOntoL.g:6710:2: ( RULE_ID )
            // InternalOntoL.g:6711:3: RULE_ID
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
    // InternalOntoL.g:6720:1: rule__GeneralizationSet__GeneralAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__GeneralAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6724:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6725:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6725:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6726:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralClassCrossReference_4_0()); 
            // InternalOntoL.g:6727:3: ( ruleQualifiedName )
            // InternalOntoL.g:6728:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralClassQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getGeneralClassQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralClassCrossReference_4_0()); 

            }


            }

        }
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
    // InternalOntoL.g:6739:1: rule__GeneralizationSet__CategorizerAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__CategorizerAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6743:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6744:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6744:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6745:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerClassCrossReference_5_1_0()); 
            // InternalOntoL.g:6746:3: ( ruleQualifiedName )
            // InternalOntoL.g:6747:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerClassQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getCategorizerClassQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getCategorizerClassCrossReference_5_1_0()); 

            }


            }

        }
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
    // InternalOntoL.g:6758:1: rule__GeneralizationSet__SpecificsAssignment_7 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__SpecificsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6762:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6763:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6763:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6764:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsClassCrossReference_7_0()); 
            // InternalOntoL.g:6765:3: ( ruleQualifiedName )
            // InternalOntoL.g:6766:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsClassQualifiedNameParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsClassQualifiedNameParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsClassCrossReference_7_0()); 

            }


            }

        }
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
    // InternalOntoL.g:6777:1: rule__GeneralizationSet__SpecificsAssignment_8_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__SpecificsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoL.g:6781:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:6782:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:6782:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:6783:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsClassCrossReference_8_1_0()); 
            // InternalOntoL.g:6784:3: ( ruleQualifiedName )
            // InternalOntoL.g:6785:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsClassQualifiedNameParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsClassQualifiedNameParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsClassCrossReference_8_1_0()); 

            }


            }

        }
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000440633100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000440633000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000001C403C000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000340000003070L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000440633000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});

}
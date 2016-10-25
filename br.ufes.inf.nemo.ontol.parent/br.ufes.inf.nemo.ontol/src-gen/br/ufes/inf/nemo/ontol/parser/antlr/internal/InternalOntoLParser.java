package br.ufes.inf.nemo.ontol.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.ufes.inf.nemo.ontol.services.OntoLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntoLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'}'", "';'", "'.'", "'.*'", "'import'", "'individual'", "':'", "','", "'set'", "'class'", "'specializes'", "'subordinatedto'", "'ispowertypeof'", "'foclass'", "'hoclass'", "'order'", "'['", "'..'", "']'", "'subsets'", "'isoppositeto'", "'*'", "'='", "'('", "')'", "'-'", "'true'", "'false'", "'none'", "'disjoint'", "'complete'", "'genset'", "'general'", "'categorizer'", "'specifics'", "'categorizes'", "'completecategorizes'", "'disjointcategorizes'", "'partitions'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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

        public InternalOntoLParser(TokenStream input, OntoLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected OntoLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalOntoL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalOntoL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalOntoL.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOntoL.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:78:2: ( (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}' ) )
            // InternalOntoL.g:79:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}' )
            {
            // InternalOntoL.g:79:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}' )
            // InternalOntoL.g:80:3: otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModuleKeyword_0());
            		
            // InternalOntoL.g:84:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalOntoL.g:85:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalOntoL.g:85:4: (lv_name_1_0= ruleQualifiedName )
            // InternalOntoL.g:86:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.ufes.inf.nemo.ontol.OntoL.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOntoL.g:107:3: ( (lv_elements_3_0= ruleModelElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=18)||(LA1_0>=21 && LA1_0<=22)||(LA1_0>=26 && LA1_0<=27)||LA1_0==36||LA1_0==44) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOntoL.g:108:4: (lv_elements_3_0= ruleModelElement )
            	    {
            	    // InternalOntoL.g:108:4: (lv_elements_3_0= ruleModelElement )
            	    // InternalOntoL.g:109:5: lv_elements_3_0= ruleModelElement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elements_3_0=ruleModelElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"br.ufes.inf.nemo.ontol.OntoL.ModelElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModelElement"
    // InternalOntoL.g:134:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // InternalOntoL.g:134:53: (iv_ruleModelElement= ruleModelElement EOF )
            // InternalOntoL.g:135:2: iv_ruleModelElement= ruleModelElement EOF
            {
             newCompositeNode(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelElement=ruleModelElement();

            state._fsp--;

             current =iv_ruleModelElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // InternalOntoL.g:141:1: ruleModelElement returns [EObject current=null] : ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Import_0 = null;

        EObject this_EntityDeclaration_1 = null;

        EObject this_GeneralizationSet_2 = null;



        	enterRule();

        try {
            // InternalOntoL.g:147:2: ( ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' ) )
            // InternalOntoL.g:148:2: ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' )
            {
            // InternalOntoL.g:148:2: ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' )
            // InternalOntoL.g:149:3: (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';'
            {
            // InternalOntoL.g:149:3: (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 18:
            case 21:
            case 22:
            case 26:
            case 27:
                {
                alt2=2;
                }
                break;
            case 36:
            case 44:
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
                    // InternalOntoL.g:150:4: this_Import_0= ruleImport
                    {

                    				newCompositeNode(grammarAccess.getModelElementAccess().getImportParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_6);
                    this_Import_0=ruleImport();

                    state._fsp--;


                    				current = this_Import_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalOntoL.g:159:4: this_EntityDeclaration_1= ruleEntityDeclaration
                    {

                    				newCompositeNode(grammarAccess.getModelElementAccess().getEntityDeclarationParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_6);
                    this_EntityDeclaration_1=ruleEntityDeclaration();

                    state._fsp--;


                    				current = this_EntityDeclaration_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalOntoL.g:168:4: this_GeneralizationSet_2= ruleGeneralizationSet
                    {

                    				newCompositeNode(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_6);
                    this_GeneralizationSet_2=ruleGeneralizationSet();

                    state._fsp--;


                    				current = this_GeneralizationSet_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getModelElementAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalOntoL.g:185:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalOntoL.g:185:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalOntoL.g:186:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalOntoL.g:192:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalOntoL.g:198:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalOntoL.g:199:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalOntoL.g:199:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalOntoL.g:200:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalOntoL.g:207:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOntoL.g:208:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalOntoL.g:225:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalOntoL.g:225:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalOntoL.g:226:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalOntoL.g:232:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:238:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalOntoL.g:239:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalOntoL.g:239:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalOntoL.g:240:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalOntoL.g:250:3: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOntoL.g:251:4: kw= '.*'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleImport"
    // InternalOntoL.g:261:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalOntoL.g:261:47: (iv_ruleImport= ruleImport EOF )
            // InternalOntoL.g:262:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalOntoL.g:268:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:274:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalOntoL.g:275:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalOntoL.g:275:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalOntoL.g:276:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalOntoL.g:280:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalOntoL.g:281:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalOntoL.g:281:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalOntoL.g:282:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"br.ufes.inf.nemo.ontol.OntoL.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleEntityDeclaration"
    // InternalOntoL.g:303:1: entryRuleEntityDeclaration returns [EObject current=null] : iv_ruleEntityDeclaration= ruleEntityDeclaration EOF ;
    public final EObject entryRuleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityDeclaration = null;


        try {
            // InternalOntoL.g:303:58: (iv_ruleEntityDeclaration= ruleEntityDeclaration EOF )
            // InternalOntoL.g:304:2: iv_ruleEntityDeclaration= ruleEntityDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEntityDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityDeclaration=ruleEntityDeclaration();

            state._fsp--;

             current =iv_ruleEntityDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityDeclaration"


    // $ANTLR start "ruleEntityDeclaration"
    // InternalOntoL.g:310:1: ruleEntityDeclaration returns [EObject current=null] : (this_Class_0= ruleClass | this_Individual_1= ruleIndividual | this_Set_2= ruleSet ) ;
    public final EObject ruleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Individual_1 = null;

        EObject this_Set_2 = null;



        	enterRule();

        try {
            // InternalOntoL.g:316:2: ( (this_Class_0= ruleClass | this_Individual_1= ruleIndividual | this_Set_2= ruleSet ) )
            // InternalOntoL.g:317:2: (this_Class_0= ruleClass | this_Individual_1= ruleIndividual | this_Set_2= ruleSet )
            {
            // InternalOntoL.g:317:2: (this_Class_0= ruleClass | this_Individual_1= ruleIndividual | this_Set_2= ruleSet )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 22:
            case 26:
            case 27:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 21:
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
                    // InternalOntoL.g:318:3: this_Class_0= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getEntityDeclarationAccess().getClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_0=ruleClass();

                    state._fsp--;


                    			current = this_Class_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoL.g:327:3: this_Individual_1= ruleIndividual
                    {

                    			newCompositeNode(grammarAccess.getEntityDeclarationAccess().getIndividualParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Individual_1=ruleIndividual();

                    state._fsp--;


                    			current = this_Individual_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntoL.g:336:3: this_Set_2= ruleSet
                    {

                    			newCompositeNode(grammarAccess.getEntityDeclarationAccess().getSetParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Set_2=ruleSet();

                    state._fsp--;


                    			current = this_Set_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityDeclaration"


    // $ANTLR start "entryRuleIndividual"
    // InternalOntoL.g:348:1: entryRuleIndividual returns [EObject current=null] : iv_ruleIndividual= ruleIndividual EOF ;
    public final EObject entryRuleIndividual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndividual = null;


        try {
            // InternalOntoL.g:348:51: (iv_ruleIndividual= ruleIndividual EOF )
            // InternalOntoL.g:349:2: iv_ruleIndividual= ruleIndividual EOF
            {
             newCompositeNode(grammarAccess.getIndividualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndividual=ruleIndividual();

            state._fsp--;

             current =iv_ruleIndividual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndividual"


    // $ANTLR start "ruleIndividual"
    // InternalOntoL.g:355:1: ruleIndividual returns [EObject current=null] : (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( (lv_propAssigns_7_0= rulePropertyAssignment ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleIndividual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_propAssigns_7_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:361:2: ( (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( (lv_propAssigns_7_0= rulePropertyAssignment ) )* otherlv_8= '}' )? ) )
            // InternalOntoL.g:362:2: (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( (lv_propAssigns_7_0= rulePropertyAssignment ) )* otherlv_8= '}' )? )
            {
            // InternalOntoL.g:362:2: (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( (lv_propAssigns_7_0= rulePropertyAssignment ) )* otherlv_8= '}' )? )
            // InternalOntoL.g:363:3: otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( (lv_propAssigns_7_0= rulePropertyAssignment ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIndividualAccess().getIndividualKeyword_0());
            		
            // InternalOntoL.g:367:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntoL.g:368:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntoL.g:368:4: (lv_name_1_0= RULE_ID )
            // InternalOntoL.g:369:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIndividualAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndividualRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOntoL.g:385:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntoL.g:386:4: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getIndividualAccess().getColonKeyword_2_0());
                    			
                    // InternalOntoL.g:390:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:391:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:391:5: ( ruleQualifiedName )
                    // InternalOntoL.g:392:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIndividualRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIndividualAccess().getFixedTypesClassCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:406:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==20) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalOntoL.g:407:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getIndividualAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalOntoL.g:411:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:412:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:412:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:413:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIndividualRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIndividualAccess().getFixedTypesClassCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntoL.g:429:3: (otherlv_6= '{' ( (lv_propAssigns_7_0= rulePropertyAssignment ) )* otherlv_8= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntoL.g:430:4: otherlv_6= '{' ( (lv_propAssigns_7_0= rulePropertyAssignment ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getIndividualAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalOntoL.g:434:4: ( (lv_propAssigns_7_0= rulePropertyAssignment ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalOntoL.g:435:5: (lv_propAssigns_7_0= rulePropertyAssignment )
                    	    {
                    	    // InternalOntoL.g:435:5: (lv_propAssigns_7_0= rulePropertyAssignment )
                    	    // InternalOntoL.g:436:6: lv_propAssigns_7_0= rulePropertyAssignment
                    	    {

                    	    						newCompositeNode(grammarAccess.getIndividualAccess().getPropAssignsPropertyAssignmentParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_propAssigns_7_0=rulePropertyAssignment();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIndividualRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"propAssigns",
                    	    							lv_propAssigns_7_0,
                    	    							"br.ufes.inf.nemo.ontol.OntoL.PropertyAssignment");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getIndividualAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndividual"


    // $ANTLR start "entryRuleSet"
    // InternalOntoL.g:462:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // InternalOntoL.g:462:44: (iv_ruleSet= ruleSet EOF )
            // InternalOntoL.g:463:2: iv_ruleSet= ruleSet EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSet=ruleSet();

            state._fsp--;

             current =iv_ruleSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalOntoL.g:469:1: ruleSet returns [EObject current=null] : (otherlv_0= 'set' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( (lv_propAssigns_7_0= rulePropertyAssignment ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_propAssigns_7_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:475:2: ( (otherlv_0= 'set' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( (lv_propAssigns_7_0= rulePropertyAssignment ) )* otherlv_8= '}' )? ) )
            // InternalOntoL.g:476:2: (otherlv_0= 'set' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( (lv_propAssigns_7_0= rulePropertyAssignment ) )* otherlv_8= '}' )? )
            {
            // InternalOntoL.g:476:2: (otherlv_0= 'set' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( (lv_propAssigns_7_0= rulePropertyAssignment ) )* otherlv_8= '}' )? )
            // InternalOntoL.g:477:3: otherlv_0= 'set' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( (lv_propAssigns_7_0= rulePropertyAssignment ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getSetAccess().getSetKeyword_0());
            		
            // InternalOntoL.g:481:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalOntoL.g:482:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalOntoL.g:482:4: (lv_name_1_0= RULE_STRING )
            // InternalOntoL.g:483:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSetAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOntoL.g:499:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOntoL.g:500:4: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSetAccess().getColonKeyword_2_0());
                    			
                    // InternalOntoL.g:504:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:505:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:505:5: ( ruleQualifiedName )
                    // InternalOntoL.g:506:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSetAccess().getFixedTypesClassCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:520:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==20) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalOntoL.g:521:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSetAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalOntoL.g:525:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:526:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:526:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:527:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSetRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSetAccess().getFixedTypesClassCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntoL.g:543:3: (otherlv_6= '{' ( (lv_propAssigns_7_0= rulePropertyAssignment ) )* otherlv_8= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOntoL.g:544:4: otherlv_6= '{' ( (lv_propAssigns_7_0= rulePropertyAssignment ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getSetAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalOntoL.g:548:4: ( (lv_propAssigns_7_0= rulePropertyAssignment ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalOntoL.g:549:5: (lv_propAssigns_7_0= rulePropertyAssignment )
                    	    {
                    	    // InternalOntoL.g:549:5: (lv_propAssigns_7_0= rulePropertyAssignment )
                    	    // InternalOntoL.g:550:6: lv_propAssigns_7_0= rulePropertyAssignment
                    	    {

                    	    						newCompositeNode(grammarAccess.getSetAccess().getPropAssignsPropertyAssignmentParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_propAssigns_7_0=rulePropertyAssignment();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSetRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"propAssigns",
                    	    							lv_propAssigns_7_0,
                    	    							"br.ufes.inf.nemo.ontol.OntoL.PropertyAssignment");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getSetAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleClass"
    // InternalOntoL.g:576:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalOntoL.g:576:46: (iv_ruleClass= ruleClass EOF )
            // InternalOntoL.g:577:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalOntoL.g:583:1: ruleClass returns [EObject current=null] : ( (this_WClass_0= ruleWClass | this_HOClass_1= ruleHOClass | this_FOClass_2= ruleFOClass ) (otherlv_3= '{' ( ( (lv_props_4_0= ruleProperty ) ) | ( (lv_propAssigns_5_0= rulePropertyAssignment ) ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject this_WClass_0 = null;

        EObject this_HOClass_1 = null;

        EObject this_FOClass_2 = null;

        EObject lv_props_4_0 = null;

        EObject lv_propAssigns_5_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:589:2: ( ( (this_WClass_0= ruleWClass | this_HOClass_1= ruleHOClass | this_FOClass_2= ruleFOClass ) (otherlv_3= '{' ( ( (lv_props_4_0= ruleProperty ) ) | ( (lv_propAssigns_5_0= rulePropertyAssignment ) ) )* otherlv_6= '}' )? ) )
            // InternalOntoL.g:590:2: ( (this_WClass_0= ruleWClass | this_HOClass_1= ruleHOClass | this_FOClass_2= ruleFOClass ) (otherlv_3= '{' ( ( (lv_props_4_0= ruleProperty ) ) | ( (lv_propAssigns_5_0= rulePropertyAssignment ) ) )* otherlv_6= '}' )? )
            {
            // InternalOntoL.g:590:2: ( (this_WClass_0= ruleWClass | this_HOClass_1= ruleHOClass | this_FOClass_2= ruleFOClass ) (otherlv_3= '{' ( ( (lv_props_4_0= ruleProperty ) ) | ( (lv_propAssigns_5_0= rulePropertyAssignment ) ) )* otherlv_6= '}' )? )
            // InternalOntoL.g:591:3: (this_WClass_0= ruleWClass | this_HOClass_1= ruleHOClass | this_FOClass_2= ruleFOClass ) (otherlv_3= '{' ( ( (lv_props_4_0= ruleProperty ) ) | ( (lv_propAssigns_5_0= rulePropertyAssignment ) ) )* otherlv_6= '}' )?
            {
            // InternalOntoL.g:591:3: (this_WClass_0= ruleWClass | this_HOClass_1= ruleHOClass | this_FOClass_2= ruleFOClass )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt14=1;
                }
                break;
            case 27:
                {
                alt14=2;
                }
                break;
            case 26:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalOntoL.g:592:4: this_WClass_0= ruleWClass
                    {

                    				newCompositeNode(grammarAccess.getClassAccess().getWClassParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_13);
                    this_WClass_0=ruleWClass();

                    state._fsp--;


                    				current = this_WClass_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalOntoL.g:601:4: this_HOClass_1= ruleHOClass
                    {

                    				newCompositeNode(grammarAccess.getClassAccess().getHOClassParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_13);
                    this_HOClass_1=ruleHOClass();

                    state._fsp--;


                    				current = this_HOClass_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalOntoL.g:610:4: this_FOClass_2= ruleFOClass
                    {

                    				newCompositeNode(grammarAccess.getClassAccess().getFOClassParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_13);
                    this_FOClass_2=ruleFOClass();

                    state._fsp--;


                    				current = this_FOClass_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalOntoL.g:619:3: (otherlv_3= '{' ( ( (lv_props_4_0= ruleProperty ) ) | ( (lv_propAssigns_5_0= rulePropertyAssignment ) ) )* otherlv_6= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOntoL.g:620:4: otherlv_3= '{' ( ( (lv_props_4_0= ruleProperty ) ) | ( (lv_propAssigns_5_0= rulePropertyAssignment ) ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalOntoL.g:624:4: ( ( (lv_props_4_0= ruleProperty ) ) | ( (lv_propAssigns_5_0= rulePropertyAssignment ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            int LA15_2 = input.LA(2);

                            if ( (LA15_2==15||LA15_2==35) ) {
                                alt15=2;
                            }
                            else if ( (LA15_2==19) ) {
                                alt15=1;
                            }


                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalOntoL.g:625:5: ( (lv_props_4_0= ruleProperty ) )
                    	    {
                    	    // InternalOntoL.g:625:5: ( (lv_props_4_0= ruleProperty ) )
                    	    // InternalOntoL.g:626:6: (lv_props_4_0= ruleProperty )
                    	    {
                    	    // InternalOntoL.g:626:6: (lv_props_4_0= ruleProperty )
                    	    // InternalOntoL.g:627:7: lv_props_4_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getPropsPropertyParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_props_4_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"props",
                    	    								lv_props_4_0,
                    	    								"br.ufes.inf.nemo.ontol.OntoL.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOntoL.g:645:5: ( (lv_propAssigns_5_0= rulePropertyAssignment ) )
                    	    {
                    	    // InternalOntoL.g:645:5: ( (lv_propAssigns_5_0= rulePropertyAssignment ) )
                    	    // InternalOntoL.g:646:6: (lv_propAssigns_5_0= rulePropertyAssignment )
                    	    {
                    	    // InternalOntoL.g:646:6: (lv_propAssigns_5_0= rulePropertyAssignment )
                    	    // InternalOntoL.g:647:7: lv_propAssigns_5_0= rulePropertyAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getPropAssignsPropertyAssignmentParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_propAssigns_5_0=rulePropertyAssignment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"propAssigns",
                    	    								lv_propAssigns_5_0,
                    	    								"br.ufes.inf.nemo.ontol.OntoL.PropertyAssignment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleWClass"
    // InternalOntoL.g:674:1: entryRuleWClass returns [EObject current=null] : iv_ruleWClass= ruleWClass EOF ;
    public final EObject entryRuleWClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWClass = null;


        try {
            // InternalOntoL.g:674:47: (iv_ruleWClass= ruleWClass EOF )
            // InternalOntoL.g:675:2: iv_ruleWClass= ruleWClass EOF
            {
             newCompositeNode(grammarAccess.getWClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWClass=ruleWClass();

            state._fsp--;

             current =iv_ruleWClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWClass"


    // $ANTLR start "ruleWClass"
    // InternalOntoL.g:681:1: ruleWClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_catType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_16= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )? ) ;
    public final EObject ruleWClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        Enumerator lv_catType_14_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:687:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_catType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_16= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )? ) )
            // InternalOntoL.g:688:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_catType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_16= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )? )
            {
            // InternalOntoL.g:688:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_catType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_16= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )? )
            // InternalOntoL.g:689:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_catType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_16= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWClassAccess().getClassKeyword_0());
            		
            // InternalOntoL.g:693:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntoL.g:694:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntoL.g:694:4: (lv_name_1_0= RULE_ID )
            // InternalOntoL.g:695:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOntoL.g:711:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOntoL.g:712:4: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getWClassAccess().getColonKeyword_2_0());
                    			
                    // InternalOntoL.g:716:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:717:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:717:5: ( ruleQualifiedName )
                    // InternalOntoL.g:718:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWClassAccess().getFixedTypesClassCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:732:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==20) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalOntoL.g:733:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getWClassAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalOntoL.g:737:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:738:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:738:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:739:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWClassAccess().getFixedTypesClassCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntoL.g:755:3: (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntoL.g:756:4: otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getWClassAccess().getSpecializesKeyword_3_0());
                    			
                    // InternalOntoL.g:760:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:761:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:761:5: ( ruleQualifiedName )
                    // InternalOntoL.g:762:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWClassAccess().getSuperClassesClassCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:776:4: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==20) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalOntoL.g:777:5: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getWClassAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalOntoL.g:781:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:782:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:782:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:783:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWClassAccess().getSuperClassesClassCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntoL.g:799:3: (otherlv_10= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOntoL.g:800:4: otherlv_10= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_10=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getWClassAccess().getSubordinatedtoKeyword_4_0());
                    			
                    // InternalOntoL.g:804:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:805:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:805:5: ( ruleQualifiedName )
                    // InternalOntoL.g:806:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWClassAccess().getSubordinatorsClassCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:820:4: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==20) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalOntoL.g:821:5: otherlv_12= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_12=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getWClassAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalOntoL.g:825:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:826:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:826:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:827:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWClassAccess().getSubordinatorsClassCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntoL.g:843:3: ( ( ( (lv_catType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_16= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=48 && LA23_0<=51)) ) {
                alt23=1;
            }
            else if ( (LA23_0==25) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // InternalOntoL.g:844:4: ( ( (lv_catType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalOntoL.g:844:4: ( ( (lv_catType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    // InternalOntoL.g:845:5: ( (lv_catType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalOntoL.g:845:5: ( (lv_catType_14_0= ruleCategorizationType ) )
                    // InternalOntoL.g:846:6: (lv_catType_14_0= ruleCategorizationType )
                    {
                    // InternalOntoL.g:846:6: (lv_catType_14_0= ruleCategorizationType )
                    // InternalOntoL.g:847:7: lv_catType_14_0= ruleCategorizationType
                    {

                    							newCompositeNode(grammarAccess.getWClassAccess().getCatTypeCategorizationTypeEnumRuleCall_5_0_0_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_catType_14_0=ruleCategorizationType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getWClassRule());
                    							}
                    							set(
                    								current,
                    								"catType",
                    								lv_catType_14_0,
                    								"br.ufes.inf.nemo.ontol.OntoL.CategorizationType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalOntoL.g:864:5: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:865:6: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:865:6: ( ruleQualifiedName )
                    // InternalOntoL.g:866:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getWClassRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getWClassAccess().getBasetypeClassCrossReference_5_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:882:4: (otherlv_16= 'ispowertypeof' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalOntoL.g:882:4: (otherlv_16= 'ispowertypeof' ( ( ruleQualifiedName ) ) )
                    // InternalOntoL.g:883:5: otherlv_16= 'ispowertypeof' ( ( ruleQualifiedName ) )
                    {
                    otherlv_16=(Token)match(input,25,FOLLOW_3); 

                    					newLeafNode(otherlv_16, grammarAccess.getWClassAccess().getIspowertypeofKeyword_5_1_0());
                    				
                    // InternalOntoL.g:887:5: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:888:6: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:888:6: ( ruleQualifiedName )
                    // InternalOntoL.g:889:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getWClassRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getWClassAccess().getPowertypeOfClassCrossReference_5_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWClass"


    // $ANTLR start "entryRuleFOClass"
    // InternalOntoL.g:909:1: entryRuleFOClass returns [EObject current=null] : iv_ruleFOClass= ruleFOClass EOF ;
    public final EObject entryRuleFOClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFOClass = null;


        try {
            // InternalOntoL.g:909:48: (iv_ruleFOClass= ruleFOClass EOF )
            // InternalOntoL.g:910:2: iv_ruleFOClass= ruleFOClass EOF
            {
             newCompositeNode(grammarAccess.getFOClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFOClass=ruleFOClass();

            state._fsp--;

             current =iv_ruleFOClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFOClass"


    // $ANTLR start "ruleFOClass"
    // InternalOntoL.g:916:1: ruleFOClass returns [EObject current=null] : (otherlv_0= 'foclass' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? ) ;
    public final EObject ruleFOClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalOntoL.g:922:2: ( (otherlv_0= 'foclass' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            // InternalOntoL.g:923:2: (otherlv_0= 'foclass' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? )
            {
            // InternalOntoL.g:923:2: (otherlv_0= 'foclass' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? )
            // InternalOntoL.g:924:3: otherlv_0= 'foclass' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFOClassAccess().getFoclassKeyword_0());
            		
            // InternalOntoL.g:928:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntoL.g:929:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntoL.g:929:4: (lv_name_1_0= RULE_ID )
            // InternalOntoL.g:930:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFOClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFOClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOntoL.g:946:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOntoL.g:947:4: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getFOClassAccess().getColonKeyword_2_0());
                    			
                    // InternalOntoL.g:951:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:952:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:952:5: ( ruleQualifiedName )
                    // InternalOntoL.g:953:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFOClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFOClassAccess().getFixedTypesClassCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:967:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==20) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalOntoL.g:968:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getFOClassAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalOntoL.g:972:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:973:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:973:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:974:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFOClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFOClassAccess().getFixedTypesClassCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntoL.g:990:3: (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOntoL.g:991:4: otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getFOClassAccess().getSpecializesKeyword_3_0());
                    			
                    // InternalOntoL.g:995:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:996:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:996:5: ( ruleQualifiedName )
                    // InternalOntoL.g:997:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFOClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFOClassAccess().getSuperClassesClassCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:1011:4: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==20) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalOntoL.g:1012:5: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getFOClassAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalOntoL.g:1016:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:1017:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:1017:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:1018:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFOClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFOClassAccess().getSuperClassesClassCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFOClass"


    // $ANTLR start "entryRuleHOClass"
    // InternalOntoL.g:1038:1: entryRuleHOClass returns [EObject current=null] : iv_ruleHOClass= ruleHOClass EOF ;
    public final EObject entryRuleHOClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHOClass = null;


        try {
            // InternalOntoL.g:1038:48: (iv_ruleHOClass= ruleHOClass EOF )
            // InternalOntoL.g:1039:2: iv_ruleHOClass= ruleHOClass EOF
            {
             newCompositeNode(grammarAccess.getHOClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHOClass=ruleHOClass();

            state._fsp--;

             current =iv_ruleHOClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHOClass"


    // $ANTLR start "ruleHOClass"
    // InternalOntoL.g:1045:1: ruleHOClass returns [EObject current=null] : (otherlv_0= 'hoclass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'order' ( (lv_order_3_0= RULE_INT ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_catType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )? ) ;
    public final EObject ruleHOClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_order_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_18=null;
        Enumerator lv_catType_16_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:1051:2: ( (otherlv_0= 'hoclass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'order' ( (lv_order_3_0= RULE_INT ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_catType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )? ) )
            // InternalOntoL.g:1052:2: (otherlv_0= 'hoclass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'order' ( (lv_order_3_0= RULE_INT ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_catType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )? )
            {
            // InternalOntoL.g:1052:2: (otherlv_0= 'hoclass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'order' ( (lv_order_3_0= RULE_INT ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_catType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )? )
            // InternalOntoL.g:1053:3: otherlv_0= 'hoclass' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'order' ( (lv_order_3_0= RULE_INT ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_catType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHOClassAccess().getHoclassKeyword_0());
            		
            // InternalOntoL.g:1057:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntoL.g:1058:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntoL.g:1058:4: (lv_name_1_0= RULE_ID )
            // InternalOntoL.g:1059:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getHOClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHOClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getHOClassAccess().getOrderKeyword_2());
            		
            // InternalOntoL.g:1079:3: ( (lv_order_3_0= RULE_INT ) )
            // InternalOntoL.g:1080:4: (lv_order_3_0= RULE_INT )
            {
            // InternalOntoL.g:1080:4: (lv_order_3_0= RULE_INT )
            // InternalOntoL.g:1081:5: lv_order_3_0= RULE_INT
            {
            lv_order_3_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_order_3_0, grammarAccess.getHOClassAccess().getOrderINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHOClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"order",
            						lv_order_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalOntoL.g:1097:3: (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOntoL.g:1098:4: otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getHOClassAccess().getColonKeyword_4_0());
                    			
                    // InternalOntoL.g:1102:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1103:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1103:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1104:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHOClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHOClassAccess().getFixedTypesClassCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:1118:4: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==20) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalOntoL.g:1119:5: otherlv_6= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getHOClassAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalOntoL.g:1123:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:1124:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:1124:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:1125:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHOClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHOClassAccess().getFixedTypesClassCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntoL.g:1141:3: (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOntoL.g:1142:4: otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getHOClassAccess().getSpecializesKeyword_5_0());
                    			
                    // InternalOntoL.g:1146:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1147:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1147:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1148:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHOClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHOClassAccess().getSuperClassesClassCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:1162:4: (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==20) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalOntoL.g:1163:5: otherlv_10= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getHOClassAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalOntoL.g:1167:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:1168:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:1168:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:1169:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHOClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHOClassAccess().getSuperClassesClassCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntoL.g:1185:3: (otherlv_12= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==24) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOntoL.g:1186:4: otherlv_12= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getHOClassAccess().getSubordinatedtoKeyword_6_0());
                    			
                    // InternalOntoL.g:1190:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1191:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1191:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1192:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHOClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHOClassAccess().getSubordinatorsClassCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:1206:4: (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==20) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalOntoL.g:1207:5: otherlv_14= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_14=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getHOClassAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalOntoL.g:1211:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:1212:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:1212:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:1213:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHOClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHOClassAccess().getSubordinatorsClassCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntoL.g:1229:3: ( ( ( (lv_catType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )?
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=48 && LA34_0<=51)) ) {
                alt34=1;
            }
            else if ( (LA34_0==25) ) {
                alt34=2;
            }
            switch (alt34) {
                case 1 :
                    // InternalOntoL.g:1230:4: ( ( (lv_catType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalOntoL.g:1230:4: ( ( (lv_catType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    // InternalOntoL.g:1231:5: ( (lv_catType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalOntoL.g:1231:5: ( (lv_catType_16_0= ruleCategorizationType ) )
                    // InternalOntoL.g:1232:6: (lv_catType_16_0= ruleCategorizationType )
                    {
                    // InternalOntoL.g:1232:6: (lv_catType_16_0= ruleCategorizationType )
                    // InternalOntoL.g:1233:7: lv_catType_16_0= ruleCategorizationType
                    {

                    							newCompositeNode(grammarAccess.getHOClassAccess().getCatTypeCategorizationTypeEnumRuleCall_7_0_0_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_catType_16_0=ruleCategorizationType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getHOClassRule());
                    							}
                    							set(
                    								current,
                    								"catType",
                    								lv_catType_16_0,
                    								"br.ufes.inf.nemo.ontol.OntoL.CategorizationType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalOntoL.g:1250:5: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1251:6: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1251:6: ( ruleQualifiedName )
                    // InternalOntoL.g:1252:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHOClassRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getHOClassAccess().getBasetypeClassCrossReference_7_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1268:4: (otherlv_18= 'ispowertypeof' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalOntoL.g:1268:4: (otherlv_18= 'ispowertypeof' ( ( ruleQualifiedName ) ) )
                    // InternalOntoL.g:1269:5: otherlv_18= 'ispowertypeof' ( ( ruleQualifiedName ) )
                    {
                    otherlv_18=(Token)match(input,25,FOLLOW_3); 

                    					newLeafNode(otherlv_18, grammarAccess.getHOClassAccess().getIspowertypeofKeyword_7_1_0());
                    				
                    // InternalOntoL.g:1273:5: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1274:6: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1274:6: ( ruleQualifiedName )
                    // InternalOntoL.g:1275:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHOClassRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getHOClassAccess().getPowertypeOfClassCrossReference_7_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHOClass"


    // $ANTLR start "entryRuleProperty"
    // InternalOntoL.g:1295:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalOntoL.g:1295:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalOntoL.g:1296:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalOntoL.g:1302:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (otherlv_2= '[' ( (lv_lowerBound_3_0= ruleELEMENTBOUND ) ) otherlv_4= '..' ( (lv_upperBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= ']' )? ( ( ruleQualifiedName ) ) (otherlv_8= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'isoppositeto' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_lowerBound_3_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_5_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:1308:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (otherlv_2= '[' ( (lv_lowerBound_3_0= ruleELEMENTBOUND ) ) otherlv_4= '..' ( (lv_upperBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= ']' )? ( ( ruleQualifiedName ) ) (otherlv_8= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'isoppositeto' ( ( ruleQualifiedName ) ) )? ) )
            // InternalOntoL.g:1309:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (otherlv_2= '[' ( (lv_lowerBound_3_0= ruleELEMENTBOUND ) ) otherlv_4= '..' ( (lv_upperBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= ']' )? ( ( ruleQualifiedName ) ) (otherlv_8= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'isoppositeto' ( ( ruleQualifiedName ) ) )? )
            {
            // InternalOntoL.g:1309:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (otherlv_2= '[' ( (lv_lowerBound_3_0= ruleELEMENTBOUND ) ) otherlv_4= '..' ( (lv_upperBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= ']' )? ( ( ruleQualifiedName ) ) (otherlv_8= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'isoppositeto' ( ( ruleQualifiedName ) ) )? )
            // InternalOntoL.g:1310:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (otherlv_2= '[' ( (lv_lowerBound_3_0= ruleELEMENTBOUND ) ) otherlv_4= '..' ( (lv_upperBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= ']' )? ( ( ruleQualifiedName ) ) (otherlv_8= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'isoppositeto' ( ( ruleQualifiedName ) ) )?
            {
            // InternalOntoL.g:1310:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOntoL.g:1311:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOntoL.g:1311:4: (lv_name_0_0= RULE_ID )
            // InternalOntoL.g:1312:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
            		
            // InternalOntoL.g:1332:3: (otherlv_2= '[' ( (lv_lowerBound_3_0= ruleELEMENTBOUND ) ) otherlv_4= '..' ( (lv_upperBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= ']' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOntoL.g:1333:4: otherlv_2= '[' ( (lv_lowerBound_3_0= ruleELEMENTBOUND ) ) otherlv_4= '..' ( (lv_upperBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalOntoL.g:1337:4: ( (lv_lowerBound_3_0= ruleELEMENTBOUND ) )
                    // InternalOntoL.g:1338:5: (lv_lowerBound_3_0= ruleELEMENTBOUND )
                    {
                    // InternalOntoL.g:1338:5: (lv_lowerBound_3_0= ruleELEMENTBOUND )
                    // InternalOntoL.g:1339:6: lv_lowerBound_3_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getLowerBoundELEMENTBOUNDParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_lowerBound_3_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_3_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,30,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getFullStopFullStopKeyword_2_2());
                    			
                    // InternalOntoL.g:1360:4: ( (lv_upperBound_5_0= ruleELEMENTBOUND ) )
                    // InternalOntoL.g:1361:5: (lv_upperBound_5_0= ruleELEMENTBOUND )
                    {
                    // InternalOntoL.g:1361:5: (lv_upperBound_5_0= ruleELEMENTBOUND )
                    // InternalOntoL.g:1362:6: lv_upperBound_5_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getUpperBoundELEMENTBOUNDParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_upperBound_5_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_5_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalOntoL.g:1384:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:1385:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:1385:4: ( ruleQualifiedName )
            // InternalOntoL.g:1386:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeClassCrossReference_3_0());
            				
            pushFollow(FOLLOW_28);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoL.g:1400:3: (otherlv_8= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOntoL.g:1401:4: otherlv_8= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getSubsetsKeyword_4_0());
                    			
                    // InternalOntoL.g:1405:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1406:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1406:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1407:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPropertyAccess().getSubsetOfPropertyCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:1421:4: (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==20) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalOntoL.g:1422:5: otherlv_10= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getPropertyAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalOntoL.g:1426:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:1427:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:1427:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:1428:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPropertyRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPropertyAccess().getSubsetOfPropertyCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntoL.g:1444:3: (otherlv_12= 'isoppositeto' ( ( ruleQualifiedName ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==33) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOntoL.g:1445:4: otherlv_12= 'isoppositeto' ( ( ruleQualifiedName ) )
                    {
                    otherlv_12=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getPropertyAccess().getIsoppositetoKeyword_5_0());
                    			
                    // InternalOntoL.g:1449:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1450:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1450:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1451:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPropertyAccess().getOppositeToPropertyCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleELEMENTBOUND"
    // InternalOntoL.g:1470:1: entryRuleELEMENTBOUND returns [String current=null] : iv_ruleELEMENTBOUND= ruleELEMENTBOUND EOF ;
    public final String entryRuleELEMENTBOUND() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELEMENTBOUND = null;


        try {
            // InternalOntoL.g:1470:52: (iv_ruleELEMENTBOUND= ruleELEMENTBOUND EOF )
            // InternalOntoL.g:1471:2: iv_ruleELEMENTBOUND= ruleELEMENTBOUND EOF
            {
             newCompositeNode(grammarAccess.getELEMENTBOUNDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELEMENTBOUND=ruleELEMENTBOUND();

            state._fsp--;

             current =iv_ruleELEMENTBOUND.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleELEMENTBOUND"


    // $ANTLR start "ruleELEMENTBOUND"
    // InternalOntoL.g:1477:1: ruleELEMENTBOUND returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELEMENTBOUND() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOntoL.g:1483:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalOntoL.g:1484:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalOntoL.g:1484:2: (kw= '*' | this_INT_1= RULE_INT )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_INT) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalOntoL.g:1485:3: kw= '*'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getELEMENTBOUNDAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1491:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getELEMENTBOUNDAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleELEMENTBOUND"


    // $ANTLR start "entryRulePropertyAssignment"
    // InternalOntoL.g:1502:1: entryRulePropertyAssignment returns [EObject current=null] : iv_rulePropertyAssignment= rulePropertyAssignment EOF ;
    public final EObject entryRulePropertyAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAssignment = null;


        try {
            // InternalOntoL.g:1502:59: (iv_rulePropertyAssignment= rulePropertyAssignment EOF )
            // InternalOntoL.g:1503:2: iv_rulePropertyAssignment= rulePropertyAssignment EOF
            {
             newCompositeNode(grammarAccess.getPropertyAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyAssignment=rulePropertyAssignment();

            state._fsp--;

             current =iv_rulePropertyAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyAssignment"


    // $ANTLR start "rulePropertyAssignment"
    // InternalOntoL.g:1509:1: rulePropertyAssignment returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_assignment_2_0= ruleValue ) ) ) ;
    public final EObject rulePropertyAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_assignment_2_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:1515:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_assignment_2_0= ruleValue ) ) ) )
            // InternalOntoL.g:1516:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_assignment_2_0= ruleValue ) ) )
            {
            // InternalOntoL.g:1516:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_assignment_2_0= ruleValue ) ) )
            // InternalOntoL.g:1517:3: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_assignment_2_0= ruleValue ) )
            {
            // InternalOntoL.g:1517:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:1518:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:1518:4: ( ruleQualifiedName )
            // InternalOntoL.g:1519:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPropertyAssignmentAccess().getPropertyPropertyCrossReference_0_0());
            				
            pushFollow(FOLLOW_30);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalOntoL.g:1537:3: ( (lv_assignment_2_0= ruleValue ) )
            // InternalOntoL.g:1538:4: (lv_assignment_2_0= ruleValue )
            {
            // InternalOntoL.g:1538:4: (lv_assignment_2_0= ruleValue )
            // InternalOntoL.g:1539:5: lv_assignment_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getPropertyAssignmentAccess().getAssignmentValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_assignment_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyAssignmentRule());
            					}
            					set(
            						current,
            						"assignment",
            						lv_assignment_2_0,
            						"br.ufes.inf.nemo.ontol.OntoL.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyAssignment"


    // $ANTLR start "entryRuleValue"
    // InternalOntoL.g:1560:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalOntoL.g:1560:46: (iv_ruleValue= ruleValue EOF )
            // InternalOntoL.g:1561:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalOntoL.g:1567:1: ruleValue returns [EObject current=null] : (this_ReferenceValue_0= ruleReferenceValue | this_ListValue_1= ruleListValue | this_StringValue_2= ruleStringValue | this_NumberValue_3= ruleNumberValue | this_BooleanValue_4= ruleBooleanValue | this_NoneValue_5= ruleNoneValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_ReferenceValue_0 = null;

        EObject this_ListValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_NumberValue_3 = null;

        EObject this_BooleanValue_4 = null;

        EObject this_NoneValue_5 = null;



        	enterRule();

        try {
            // InternalOntoL.g:1573:2: ( (this_ReferenceValue_0= ruleReferenceValue | this_ListValue_1= ruleListValue | this_StringValue_2= ruleStringValue | this_NumberValue_3= ruleNumberValue | this_BooleanValue_4= ruleBooleanValue | this_NoneValue_5= ruleNoneValue ) )
            // InternalOntoL.g:1574:2: (this_ReferenceValue_0= ruleReferenceValue | this_ListValue_1= ruleListValue | this_StringValue_2= ruleStringValue | this_NumberValue_3= ruleNumberValue | this_BooleanValue_4= ruleBooleanValue | this_NoneValue_5= ruleNoneValue )
            {
            // InternalOntoL.g:1574:2: (this_ReferenceValue_0= ruleReferenceValue | this_ListValue_1= ruleListValue | this_StringValue_2= ruleStringValue | this_NumberValue_3= ruleNumberValue | this_BooleanValue_4= ruleBooleanValue | this_NoneValue_5= ruleNoneValue )
            int alt40=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt40=1;
                }
                break;
            case 36:
                {
                alt40=2;
                }
                break;
            case RULE_STRING:
                {
                alt40=3;
                }
                break;
            case RULE_INT:
            case 38:
                {
                alt40=4;
                }
                break;
            case 39:
            case 40:
                {
                alt40=5;
                }
                break;
            case 41:
                {
                alt40=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalOntoL.g:1575:3: this_ReferenceValue_0= ruleReferenceValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getReferenceValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferenceValue_0=ruleReferenceValue();

                    state._fsp--;


                    			current = this_ReferenceValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1584:3: this_ListValue_1= ruleListValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getListValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListValue_1=ruleListValue();

                    state._fsp--;


                    			current = this_ListValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntoL.g:1593:3: this_StringValue_2= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOntoL.g:1602:3: this_NumberValue_3= ruleNumberValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNumberValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberValue_3=ruleNumberValue();

                    state._fsp--;


                    			current = this_NumberValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOntoL.g:1611:3: this_BooleanValue_4= ruleBooleanValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_4=ruleBooleanValue();

                    state._fsp--;


                    			current = this_BooleanValue_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOntoL.g:1620:3: this_NoneValue_5= ruleNoneValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNoneValueParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_NoneValue_5=ruleNoneValue();

                    state._fsp--;


                    			current = this_NoneValue_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleReferenceValue"
    // InternalOntoL.g:1632:1: entryRuleReferenceValue returns [EObject current=null] : iv_ruleReferenceValue= ruleReferenceValue EOF ;
    public final EObject entryRuleReferenceValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceValue = null;


        try {
            // InternalOntoL.g:1632:55: (iv_ruleReferenceValue= ruleReferenceValue EOF )
            // InternalOntoL.g:1633:2: iv_ruleReferenceValue= ruleReferenceValue EOF
            {
             newCompositeNode(grammarAccess.getReferenceValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceValue=ruleReferenceValue();

            state._fsp--;

             current =iv_ruleReferenceValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceValue"


    // $ANTLR start "ruleReferenceValue"
    // InternalOntoL.g:1639:1: ruleReferenceValue returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleReferenceValue() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalOntoL.g:1645:2: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:1646:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:1646:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:1647:3: ( ruleQualifiedName )
            {
            // InternalOntoL.g:1647:3: ( ruleQualifiedName )
            // InternalOntoL.g:1648:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getReferenceValueRule());
            				}
            			

            				newCompositeNode(grammarAccess.getReferenceValueAccess().getValueEntityDeclarationCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceValue"


    // $ANTLR start "entryRuleListValue"
    // InternalOntoL.g:1665:1: entryRuleListValue returns [EObject current=null] : iv_ruleListValue= ruleListValue EOF ;
    public final EObject entryRuleListValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListValue = null;


        try {
            // InternalOntoL.g:1665:50: (iv_ruleListValue= ruleListValue EOF )
            // InternalOntoL.g:1666:2: iv_ruleListValue= ruleListValue EOF
            {
             newCompositeNode(grammarAccess.getListValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListValue=ruleListValue();

            state._fsp--;

             current =iv_ruleListValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListValue"


    // $ANTLR start "ruleListValue"
    // InternalOntoL.g:1672:1: ruleListValue returns [EObject current=null] : (otherlv_0= '(' ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleListValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:1678:2: ( (otherlv_0= '(' ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )* otherlv_4= ')' ) )
            // InternalOntoL.g:1679:2: (otherlv_0= '(' ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )* otherlv_4= ')' )
            {
            // InternalOntoL.g:1679:2: (otherlv_0= '(' ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )* otherlv_4= ')' )
            // InternalOntoL.g:1680:3: otherlv_0= '(' ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getListValueAccess().getLeftParenthesisKeyword_0());
            		
            // InternalOntoL.g:1684:3: ( (lv_value_1_0= ruleValue ) )
            // InternalOntoL.g:1685:4: (lv_value_1_0= ruleValue )
            {
            // InternalOntoL.g:1685:4: (lv_value_1_0= ruleValue )
            // InternalOntoL.g:1686:5: lv_value_1_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getListValueAccess().getValueValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
            lv_value_1_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListValueRule());
            					}
            					add(
            						current,
            						"value",
            						lv_value_1_0,
            						"br.ufes.inf.nemo.ontol.OntoL.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoL.g:1703:3: (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==20) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalOntoL.g:1704:4: otherlv_2= ',' ( (lv_value_3_0= ruleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_31); 

            	    				newLeafNode(otherlv_2, grammarAccess.getListValueAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalOntoL.g:1708:4: ( (lv_value_3_0= ruleValue ) )
            	    // InternalOntoL.g:1709:5: (lv_value_3_0= ruleValue )
            	    {
            	    // InternalOntoL.g:1709:5: (lv_value_3_0= ruleValue )
            	    // InternalOntoL.g:1710:6: lv_value_3_0= ruleValue
            	    {

            	    						newCompositeNode(grammarAccess.getListValueAccess().getValueValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_value_3_0=ruleValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListValueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_3_0,
            	    							"br.ufes.inf.nemo.ontol.OntoL.Value");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_4=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getListValueAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalOntoL.g:1736:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalOntoL.g:1736:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalOntoL.g:1737:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalOntoL.g:1743:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOntoL.g:1749:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalOntoL.g:1750:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalOntoL.g:1750:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalOntoL.g:1751:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalOntoL.g:1751:3: (lv_value_0_0= RULE_STRING )
            // InternalOntoL.g:1752:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleNumberValue"
    // InternalOntoL.g:1771:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalOntoL.g:1771:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalOntoL.g:1772:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
             newCompositeNode(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;

             current =iv_ruleNumberValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalOntoL.g:1778:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:1784:2: ( ( (lv_value_0_0= ruleNUMBER ) ) )
            // InternalOntoL.g:1785:2: ( (lv_value_0_0= ruleNUMBER ) )
            {
            // InternalOntoL.g:1785:2: ( (lv_value_0_0= ruleNUMBER ) )
            // InternalOntoL.g:1786:3: (lv_value_0_0= ruleNUMBER )
            {
            // InternalOntoL.g:1786:3: (lv_value_0_0= ruleNUMBER )
            // InternalOntoL.g:1787:4: lv_value_0_0= ruleNUMBER
            {

            				newCompositeNode(grammarAccess.getNumberValueAccess().getValueNUMBERParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleNUMBER();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumberValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"br.ufes.inf.nemo.ontol.OntoL.NUMBER");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleNUMBER"
    // InternalOntoL.g:1807:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalOntoL.g:1807:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalOntoL.g:1808:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
             newCompositeNode(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;

             current =iv_ruleNUMBER.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalOntoL.g:1814:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalOntoL.g:1820:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalOntoL.g:1821:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalOntoL.g:1821:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalOntoL.g:1822:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalOntoL.g:1822:3: (kw= '-' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==38) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOntoL.g:1823:4: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_7); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1());
            		
            // InternalOntoL.g:1836:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==15) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalOntoL.g:1837:4: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,15,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_2_0());
                    			
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_3);
                    			

                    				newLeafNode(this_INT_3, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_2_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalOntoL.g:1854:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalOntoL.g:1854:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalOntoL.g:1855:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalOntoL.g:1861:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleBOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:1867:2: ( ( (lv_value_0_0= ruleBOOLEAN ) ) )
            // InternalOntoL.g:1868:2: ( (lv_value_0_0= ruleBOOLEAN ) )
            {
            // InternalOntoL.g:1868:2: ( (lv_value_0_0= ruleBOOLEAN ) )
            // InternalOntoL.g:1869:3: (lv_value_0_0= ruleBOOLEAN )
            {
            // InternalOntoL.g:1869:3: (lv_value_0_0= ruleBOOLEAN )
            // InternalOntoL.g:1870:4: lv_value_0_0= ruleBOOLEAN
            {

            				newCompositeNode(grammarAccess.getBooleanValueAccess().getValueBOOLEANParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBOOLEAN();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"br.ufes.inf.nemo.ontol.OntoL.BOOLEAN");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalOntoL.g:1890:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // InternalOntoL.g:1890:47: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalOntoL.g:1891:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;

             current =iv_ruleBOOLEAN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // InternalOntoL.g:1897:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOntoL.g:1903:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalOntoL.g:1904:2: (kw= 'true' | kw= 'false' )
            {
            // InternalOntoL.g:1904:2: (kw= 'true' | kw= 'false' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            else if ( (LA44_0==40) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalOntoL.g:1905:3: kw= 'true'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1911:3: kw= 'false'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleNoneValue"
    // InternalOntoL.g:1920:1: entryRuleNoneValue returns [EObject current=null] : iv_ruleNoneValue= ruleNoneValue EOF ;
    public final EObject entryRuleNoneValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoneValue = null;


        try {
            // InternalOntoL.g:1920:50: (iv_ruleNoneValue= ruleNoneValue EOF )
            // InternalOntoL.g:1921:2: iv_ruleNoneValue= ruleNoneValue EOF
            {
             newCompositeNode(grammarAccess.getNoneValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoneValue=ruleNoneValue();

            state._fsp--;

             current =iv_ruleNoneValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoneValue"


    // $ANTLR start "ruleNoneValue"
    // InternalOntoL.g:1927:1: ruleNoneValue returns [EObject current=null] : ( () otherlv_1= 'none' ) ;
    public final EObject ruleNoneValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOntoL.g:1933:2: ( ( () otherlv_1= 'none' ) )
            // InternalOntoL.g:1934:2: ( () otherlv_1= 'none' )
            {
            // InternalOntoL.g:1934:2: ( () otherlv_1= 'none' )
            // InternalOntoL.g:1935:3: () otherlv_1= 'none'
            {
            // InternalOntoL.g:1935:3: ()
            // InternalOntoL.g:1936:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNoneValueAccess().getNoneValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNoneValueAccess().getNoneKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoneValue"


    // $ANTLR start "entryRuleGeneralizationSet"
    // InternalOntoL.g:1950:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // InternalOntoL.g:1950:58: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // InternalOntoL.g:1951:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralizationSet=ruleGeneralizationSet();

            state._fsp--;

             current =iv_ruleGeneralizationSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralizationSet"


    // $ANTLR start "ruleGeneralizationSet"
    // InternalOntoL.g:1957:1: ruleGeneralizationSet returns [EObject current=null] : ( ( (otherlv_0= '(' ( (lv_isDisjoint_1_0= 'disjoint' ) ) otherlv_2= ')' ) | (otherlv_3= '(' ( (lv_isComplete_4_0= 'complete' ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_isDisjoint_7_0= 'disjoint' ) ) otherlv_8= ',' ( (lv_isComplete_9_0= 'complete' ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_isComplete_12_0= 'complete' ) ) otherlv_13= ',' ( (lv_isDisjoint_14_0= 'disjoint' ) ) otherlv_15= ')' ) )? otherlv_16= 'genset' ( (lv_name_17_0= RULE_ID ) ) otherlv_18= 'general' ( ( ruleQualifiedName ) ) (otherlv_20= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_22= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* ) ;
    public final EObject ruleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isDisjoint_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_isComplete_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_isDisjoint_7_0=null;
        Token otherlv_8=null;
        Token lv_isComplete_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_isComplete_12_0=null;
        Token otherlv_13=null;
        Token lv_isDisjoint_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_name_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;


        	enterRule();

        try {
            // InternalOntoL.g:1963:2: ( ( ( (otherlv_0= '(' ( (lv_isDisjoint_1_0= 'disjoint' ) ) otherlv_2= ')' ) | (otherlv_3= '(' ( (lv_isComplete_4_0= 'complete' ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_isDisjoint_7_0= 'disjoint' ) ) otherlv_8= ',' ( (lv_isComplete_9_0= 'complete' ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_isComplete_12_0= 'complete' ) ) otherlv_13= ',' ( (lv_isDisjoint_14_0= 'disjoint' ) ) otherlv_15= ')' ) )? otherlv_16= 'genset' ( (lv_name_17_0= RULE_ID ) ) otherlv_18= 'general' ( ( ruleQualifiedName ) ) (otherlv_20= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_22= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* ) )
            // InternalOntoL.g:1964:2: ( ( (otherlv_0= '(' ( (lv_isDisjoint_1_0= 'disjoint' ) ) otherlv_2= ')' ) | (otherlv_3= '(' ( (lv_isComplete_4_0= 'complete' ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_isDisjoint_7_0= 'disjoint' ) ) otherlv_8= ',' ( (lv_isComplete_9_0= 'complete' ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_isComplete_12_0= 'complete' ) ) otherlv_13= ',' ( (lv_isDisjoint_14_0= 'disjoint' ) ) otherlv_15= ')' ) )? otherlv_16= 'genset' ( (lv_name_17_0= RULE_ID ) ) otherlv_18= 'general' ( ( ruleQualifiedName ) ) (otherlv_20= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_22= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )
            {
            // InternalOntoL.g:1964:2: ( ( (otherlv_0= '(' ( (lv_isDisjoint_1_0= 'disjoint' ) ) otherlv_2= ')' ) | (otherlv_3= '(' ( (lv_isComplete_4_0= 'complete' ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_isDisjoint_7_0= 'disjoint' ) ) otherlv_8= ',' ( (lv_isComplete_9_0= 'complete' ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_isComplete_12_0= 'complete' ) ) otherlv_13= ',' ( (lv_isDisjoint_14_0= 'disjoint' ) ) otherlv_15= ')' ) )? otherlv_16= 'genset' ( (lv_name_17_0= RULE_ID ) ) otherlv_18= 'general' ( ( ruleQualifiedName ) ) (otherlv_20= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_22= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )
            // InternalOntoL.g:1965:3: ( (otherlv_0= '(' ( (lv_isDisjoint_1_0= 'disjoint' ) ) otherlv_2= ')' ) | (otherlv_3= '(' ( (lv_isComplete_4_0= 'complete' ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_isDisjoint_7_0= 'disjoint' ) ) otherlv_8= ',' ( (lv_isComplete_9_0= 'complete' ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_isComplete_12_0= 'complete' ) ) otherlv_13= ',' ( (lv_isDisjoint_14_0= 'disjoint' ) ) otherlv_15= ')' ) )? otherlv_16= 'genset' ( (lv_name_17_0= RULE_ID ) ) otherlv_18= 'general' ( ( ruleQualifiedName ) ) (otherlv_20= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_22= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )*
            {
            // InternalOntoL.g:1965:3: ( (otherlv_0= '(' ( (lv_isDisjoint_1_0= 'disjoint' ) ) otherlv_2= ')' ) | (otherlv_3= '(' ( (lv_isComplete_4_0= 'complete' ) ) otherlv_5= ')' ) | (otherlv_6= '(' ( (lv_isDisjoint_7_0= 'disjoint' ) ) otherlv_8= ',' ( (lv_isComplete_9_0= 'complete' ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_isComplete_12_0= 'complete' ) ) otherlv_13= ',' ( (lv_isDisjoint_14_0= 'disjoint' ) ) otherlv_15= ')' ) )?
            int alt45=5;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==36) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==42) ) {
                    int LA45_3 = input.LA(3);

                    if ( (LA45_3==37) ) {
                        alt45=1;
                    }
                    else if ( (LA45_3==20) ) {
                        alt45=3;
                    }
                }
                else if ( (LA45_1==43) ) {
                    int LA45_4 = input.LA(3);

                    if ( (LA45_4==37) ) {
                        alt45=2;
                    }
                    else if ( (LA45_4==20) ) {
                        alt45=4;
                    }
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalOntoL.g:1966:4: (otherlv_0= '(' ( (lv_isDisjoint_1_0= 'disjoint' ) ) otherlv_2= ')' )
                    {
                    // InternalOntoL.g:1966:4: (otherlv_0= '(' ( (lv_isDisjoint_1_0= 'disjoint' ) ) otherlv_2= ')' )
                    // InternalOntoL.g:1967:5: otherlv_0= '(' ( (lv_isDisjoint_1_0= 'disjoint' ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,36,FOLLOW_33); 

                    					newLeafNode(otherlv_0, grammarAccess.getGeneralizationSetAccess().getLeftParenthesisKeyword_0_0_0());
                    				
                    // InternalOntoL.g:1971:5: ( (lv_isDisjoint_1_0= 'disjoint' ) )
                    // InternalOntoL.g:1972:6: (lv_isDisjoint_1_0= 'disjoint' )
                    {
                    // InternalOntoL.g:1972:6: (lv_isDisjoint_1_0= 'disjoint' )
                    // InternalOntoL.g:1973:7: lv_isDisjoint_1_0= 'disjoint'
                    {
                    lv_isDisjoint_1_0=(Token)match(input,42,FOLLOW_34); 

                    							newLeafNode(lv_isDisjoint_1_0, grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    							}
                    							setWithLastConsumed(current, "isDisjoint", true, "disjoint");
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,37,FOLLOW_35); 

                    					newLeafNode(otherlv_2, grammarAccess.getGeneralizationSetAccess().getRightParenthesisKeyword_0_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1991:4: (otherlv_3= '(' ( (lv_isComplete_4_0= 'complete' ) ) otherlv_5= ')' )
                    {
                    // InternalOntoL.g:1991:4: (otherlv_3= '(' ( (lv_isComplete_4_0= 'complete' ) ) otherlv_5= ')' )
                    // InternalOntoL.g:1992:5: otherlv_3= '(' ( (lv_isComplete_4_0= 'complete' ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36); 

                    					newLeafNode(otherlv_3, grammarAccess.getGeneralizationSetAccess().getLeftParenthesisKeyword_0_1_0());
                    				
                    // InternalOntoL.g:1996:5: ( (lv_isComplete_4_0= 'complete' ) )
                    // InternalOntoL.g:1997:6: (lv_isComplete_4_0= 'complete' )
                    {
                    // InternalOntoL.g:1997:6: (lv_isComplete_4_0= 'complete' )
                    // InternalOntoL.g:1998:7: lv_isComplete_4_0= 'complete'
                    {
                    lv_isComplete_4_0=(Token)match(input,43,FOLLOW_34); 

                    							newLeafNode(lv_isComplete_4_0, grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    							}
                    							setWithLastConsumed(current, "isComplete", true, "complete");
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,37,FOLLOW_35); 

                    					newLeafNode(otherlv_5, grammarAccess.getGeneralizationSetAccess().getRightParenthesisKeyword_0_1_2());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:2016:4: (otherlv_6= '(' ( (lv_isDisjoint_7_0= 'disjoint' ) ) otherlv_8= ',' ( (lv_isComplete_9_0= 'complete' ) ) otherlv_10= ')' )
                    {
                    // InternalOntoL.g:2016:4: (otherlv_6= '(' ( (lv_isDisjoint_7_0= 'disjoint' ) ) otherlv_8= ',' ( (lv_isComplete_9_0= 'complete' ) ) otherlv_10= ')' )
                    // InternalOntoL.g:2017:5: otherlv_6= '(' ( (lv_isDisjoint_7_0= 'disjoint' ) ) otherlv_8= ',' ( (lv_isComplete_9_0= 'complete' ) ) otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_33); 

                    					newLeafNode(otherlv_6, grammarAccess.getGeneralizationSetAccess().getLeftParenthesisKeyword_0_2_0());
                    				
                    // InternalOntoL.g:2021:5: ( (lv_isDisjoint_7_0= 'disjoint' ) )
                    // InternalOntoL.g:2022:6: (lv_isDisjoint_7_0= 'disjoint' )
                    {
                    // InternalOntoL.g:2022:6: (lv_isDisjoint_7_0= 'disjoint' )
                    // InternalOntoL.g:2023:7: lv_isDisjoint_7_0= 'disjoint'
                    {
                    lv_isDisjoint_7_0=(Token)match(input,42,FOLLOW_37); 

                    							newLeafNode(lv_isDisjoint_7_0, grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_2_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    							}
                    							setWithLastConsumed(current, "isDisjoint", true, "disjoint");
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,20,FOLLOW_36); 

                    					newLeafNode(otherlv_8, grammarAccess.getGeneralizationSetAccess().getCommaKeyword_0_2_2());
                    				
                    // InternalOntoL.g:2039:5: ( (lv_isComplete_9_0= 'complete' ) )
                    // InternalOntoL.g:2040:6: (lv_isComplete_9_0= 'complete' )
                    {
                    // InternalOntoL.g:2040:6: (lv_isComplete_9_0= 'complete' )
                    // InternalOntoL.g:2041:7: lv_isComplete_9_0= 'complete'
                    {
                    lv_isComplete_9_0=(Token)match(input,43,FOLLOW_34); 

                    							newLeafNode(lv_isComplete_9_0, grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_2_3_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    							}
                    							setWithLastConsumed(current, "isComplete", true, "complete");
                    						

                    }


                    }

                    otherlv_10=(Token)match(input,37,FOLLOW_35); 

                    					newLeafNode(otherlv_10, grammarAccess.getGeneralizationSetAccess().getRightParenthesisKeyword_0_2_4());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:2059:4: (otherlv_11= '(' ( (lv_isComplete_12_0= 'complete' ) ) otherlv_13= ',' ( (lv_isDisjoint_14_0= 'disjoint' ) ) otherlv_15= ')' )
                    {
                    // InternalOntoL.g:2059:4: (otherlv_11= '(' ( (lv_isComplete_12_0= 'complete' ) ) otherlv_13= ',' ( (lv_isDisjoint_14_0= 'disjoint' ) ) otherlv_15= ')' )
                    // InternalOntoL.g:2060:5: otherlv_11= '(' ( (lv_isComplete_12_0= 'complete' ) ) otherlv_13= ',' ( (lv_isDisjoint_14_0= 'disjoint' ) ) otherlv_15= ')'
                    {
                    otherlv_11=(Token)match(input,36,FOLLOW_36); 

                    					newLeafNode(otherlv_11, grammarAccess.getGeneralizationSetAccess().getLeftParenthesisKeyword_0_3_0());
                    				
                    // InternalOntoL.g:2064:5: ( (lv_isComplete_12_0= 'complete' ) )
                    // InternalOntoL.g:2065:6: (lv_isComplete_12_0= 'complete' )
                    {
                    // InternalOntoL.g:2065:6: (lv_isComplete_12_0= 'complete' )
                    // InternalOntoL.g:2066:7: lv_isComplete_12_0= 'complete'
                    {
                    lv_isComplete_12_0=(Token)match(input,43,FOLLOW_37); 

                    							newLeafNode(lv_isComplete_12_0, grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_3_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    							}
                    							setWithLastConsumed(current, "isComplete", true, "complete");
                    						

                    }


                    }

                    otherlv_13=(Token)match(input,20,FOLLOW_33); 

                    					newLeafNode(otherlv_13, grammarAccess.getGeneralizationSetAccess().getCommaKeyword_0_3_2());
                    				
                    // InternalOntoL.g:2082:5: ( (lv_isDisjoint_14_0= 'disjoint' ) )
                    // InternalOntoL.g:2083:6: (lv_isDisjoint_14_0= 'disjoint' )
                    {
                    // InternalOntoL.g:2083:6: (lv_isDisjoint_14_0= 'disjoint' )
                    // InternalOntoL.g:2084:7: lv_isDisjoint_14_0= 'disjoint'
                    {
                    lv_isDisjoint_14_0=(Token)match(input,42,FOLLOW_34); 

                    							newLeafNode(lv_isDisjoint_14_0, grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_3_3_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    							}
                    							setWithLastConsumed(current, "isDisjoint", true, "disjoint");
                    						

                    }


                    }

                    otherlv_15=(Token)match(input,37,FOLLOW_35); 

                    					newLeafNode(otherlv_15, grammarAccess.getGeneralizationSetAccess().getRightParenthesisKeyword_0_3_4());
                    				

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getGeneralizationSetAccess().getGensetKeyword_1());
            		
            // InternalOntoL.g:2106:3: ( (lv_name_17_0= RULE_ID ) )
            // InternalOntoL.g:2107:4: (lv_name_17_0= RULE_ID )
            {
            // InternalOntoL.g:2107:4: (lv_name_17_0= RULE_ID )
            // InternalOntoL.g:2108:5: lv_name_17_0= RULE_ID
            {
            lv_name_17_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(lv_name_17_0, grammarAccess.getGeneralizationSetAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_17_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_18=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_18, grammarAccess.getGeneralizationSetAccess().getGeneralKeyword_3());
            		
            // InternalOntoL.g:2128:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:2129:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:2129:4: ( ruleQualifiedName )
            // InternalOntoL.g:2130:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getGeneralClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_39);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoL.g:2144:3: (otherlv_20= 'categorizer' ( ( ruleQualifiedName ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==46) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalOntoL.g:2145:4: otherlv_20= 'categorizer' ( ( ruleQualifiedName ) )
                    {
                    otherlv_20=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getGeneralizationSetAccess().getCategorizerKeyword_5_0());
                    			
                    // InternalOntoL.g:2149:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:2150:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:2150:5: ( ruleQualifiedName )
                    // InternalOntoL.g:2151:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGeneralizationSetAccess().getCategorizerClassCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_22, grammarAccess.getGeneralizationSetAccess().getSpecificsKeyword_6());
            		
            // InternalOntoL.g:2170:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:2171:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:2171:4: ( ruleQualifiedName )
            // InternalOntoL.g:2172:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getSpecificsClassCrossReference_7_0());
            				
            pushFollow(FOLLOW_20);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoL.g:2186:3: (otherlv_24= ',' ( ( ruleQualifiedName ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==20) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalOntoL.g:2187:4: otherlv_24= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_24=(Token)match(input,20,FOLLOW_3); 

            	    				newLeafNode(otherlv_24, grammarAccess.getGeneralizationSetAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalOntoL.g:2191:4: ( ( ruleQualifiedName ) )
            	    // InternalOntoL.g:2192:5: ( ruleQualifiedName )
            	    {
            	    // InternalOntoL.g:2192:5: ( ruleQualifiedName )
            	    // InternalOntoL.g:2193:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getGeneralizationSetAccess().getSpecificsClassCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralizationSet"


    // $ANTLR start "ruleCategorizationType"
    // InternalOntoL.g:2212:1: ruleCategorizationType returns [Enumerator current=null] : ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completecategorizes' ) | (enumLiteral_2= 'disjointcategorizes' ) | (enumLiteral_3= 'partitions' ) ) ;
    public final Enumerator ruleCategorizationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOntoL.g:2218:2: ( ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completecategorizes' ) | (enumLiteral_2= 'disjointcategorizes' ) | (enumLiteral_3= 'partitions' ) ) )
            // InternalOntoL.g:2219:2: ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completecategorizes' ) | (enumLiteral_2= 'disjointcategorizes' ) | (enumLiteral_3= 'partitions' ) )
            {
            // InternalOntoL.g:2219:2: ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completecategorizes' ) | (enumLiteral_2= 'disjointcategorizes' ) | (enumLiteral_3= 'partitions' ) )
            int alt48=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt48=1;
                }
                break;
            case 49:
                {
                alt48=2;
                }
                break;
            case 50:
                {
                alt48=3;
                }
                break;
            case 51:
                {
                alt48=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalOntoL.g:2220:3: (enumLiteral_0= 'categorizes' )
                    {
                    // InternalOntoL.g:2220:3: (enumLiteral_0= 'categorizes' )
                    // InternalOntoL.g:2221:4: enumLiteral_0= 'categorizes'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:2228:3: (enumLiteral_1= 'completecategorizes' )
                    {
                    // InternalOntoL.g:2228:3: (enumLiteral_1= 'completecategorizes' )
                    // InternalOntoL.g:2229:4: enumLiteral_1= 'completecategorizes'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:2236:3: (enumLiteral_2= 'disjointcategorizes' )
                    {
                    // InternalOntoL.g:2236:3: (enumLiteral_2= 'disjointcategorizes' )
                    // InternalOntoL.g:2237:4: enumLiteral_2= 'disjointcategorizes'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:2244:3: (enumLiteral_3= 'partitions' )
                    {
                    // InternalOntoL.g:2244:3: (enumLiteral_3= 'partitions' )
                    // InternalOntoL.g:2245:4: enumLiteral_3= 'partitions'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getPARTITIONEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCategorizationTypeAccess().getPARTITIONEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategorizationType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000010100C662000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000101002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000F000003880002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000F000003900002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000F000003100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000F000002100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000880002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000900002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200100002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000003D000000070L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000000L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'include'", "';'", "'}'", "'.'", "'.*'", "'import'", "'individual'", "':'", "','", "'orderless'", "'class'", "'specializes'", "'subordinatedto'", "'ispowertypeof'", "'first-order'", "'order'", "'regularity'", "'att'", "'['", "'..'", "']'", "'subsets'", "'ref'", "'isoppositeto'", "'*'", "'='", "'-'", "'true'", "'false'", "'none'", "'disjoint'", "'complete'", "'genset'", "'general'", "'categorizer'", "'specifics'", "'categorizes'", "'completecategorizes'", "'disjointcategorizes'", "'partitions'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
    // InternalOntoL.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | ( (lv_elements_6_0= ruleModelElement ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:78:2: ( (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | ( (lv_elements_6_0= ruleModelElement ) ) )* otherlv_7= '}' ) )
            // InternalOntoL.g:79:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | ( (lv_elements_6_0= ruleModelElement ) ) )* otherlv_7= '}' )
            {
            // InternalOntoL.g:79:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | ( (lv_elements_6_0= ruleModelElement ) ) )* otherlv_7= '}' )
            // InternalOntoL.g:80:3: otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | ( (lv_elements_6_0= ruleModelElement ) ) )* otherlv_7= '}'
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
            		
            // InternalOntoL.g:107:3: ( (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | ( (lv_elements_6_0= ruleModelElement ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }
                else if ( ((LA1_0>=18 && LA1_0<=19)||(LA1_0>=22 && LA1_0<=23)||(LA1_0>=27 && LA1_0<=28)||(LA1_0>=43 && LA1_0<=45)) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOntoL.g:108:4: (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            	    {
            	    // InternalOntoL.g:108:4: (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            	    // InternalOntoL.g:109:5: otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_3); 

            	    					newLeafNode(otherlv_3, grammarAccess.getModelAccess().getIncludeKeyword_3_0_0());
            	    				
            	    // InternalOntoL.g:113:5: ( ( ruleQualifiedName ) )
            	    // InternalOntoL.g:114:6: ( ruleQualifiedName )
            	    {
            	    // InternalOntoL.g:114:6: ( ruleQualifiedName )
            	    // InternalOntoL.g:115:7: ruleQualifiedName
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getModelRule());
            	    							}
            	    						

            	    							newCompositeNode(grammarAccess.getModelAccess().getIncludesModelCrossReference_3_0_1_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    					newLeafNode(otherlv_5, grammarAccess.getModelAccess().getSemicolonKeyword_3_0_2());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOntoL.g:135:4: ( (lv_elements_6_0= ruleModelElement ) )
            	    {
            	    // InternalOntoL.g:135:4: ( (lv_elements_6_0= ruleModelElement ) )
            	    // InternalOntoL.g:136:5: (lv_elements_6_0= ruleModelElement )
            	    {
            	    // InternalOntoL.g:136:5: (lv_elements_6_0= ruleModelElement )
            	    // InternalOntoL.g:137:6: lv_elements_6_0= ruleModelElement
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_elements_6_0=ruleModelElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_6_0,
            	    							"br.ufes.inf.nemo.ontol.OntoL.ModelElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalOntoL.g:163:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // InternalOntoL.g:163:53: (iv_ruleModelElement= ruleModelElement EOF )
            // InternalOntoL.g:164:2: iv_ruleModelElement= ruleModelElement EOF
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
    // InternalOntoL.g:170:1: ruleModelElement returns [EObject current=null] : ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Import_0 = null;

        EObject this_EntityDeclaration_1 = null;

        EObject this_GeneralizationSet_2 = null;



        	enterRule();

        try {
            // InternalOntoL.g:176:2: ( ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' ) )
            // InternalOntoL.g:177:2: ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' )
            {
            // InternalOntoL.g:177:2: ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' )
            // InternalOntoL.g:178:3: (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';'
            {
            // InternalOntoL.g:178:3: (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
            case 22:
            case 23:
            case 27:
            case 28:
                {
                alt2=2;
                }
                break;
            case 43:
            case 44:
            case 45:
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
                    // InternalOntoL.g:179:4: this_Import_0= ruleImport
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
                    // InternalOntoL.g:188:4: this_EntityDeclaration_1= ruleEntityDeclaration
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
                    // InternalOntoL.g:197:4: this_GeneralizationSet_2= ruleGeneralizationSet
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
    // InternalOntoL.g:214:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalOntoL.g:214:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalOntoL.g:215:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalOntoL.g:221:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalOntoL.g:227:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalOntoL.g:228:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalOntoL.g:228:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalOntoL.g:229:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalOntoL.g:236:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOntoL.g:237:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_3); 

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
    // InternalOntoL.g:254:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalOntoL.g:254:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalOntoL.g:255:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalOntoL.g:261:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:267:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalOntoL.g:268:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalOntoL.g:268:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalOntoL.g:269:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalOntoL.g:279:3: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOntoL.g:280:4: kw= '.*'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

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
    // InternalOntoL.g:290:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalOntoL.g:290:47: (iv_ruleImport= ruleImport EOF )
            // InternalOntoL.g:291:2: iv_ruleImport= ruleImport EOF
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
    // InternalOntoL.g:297:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:303:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalOntoL.g:304:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalOntoL.g:304:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalOntoL.g:305:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalOntoL.g:309:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalOntoL.g:310:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalOntoL.g:310:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalOntoL.g:311:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // InternalOntoL.g:332:1: entryRuleEntityDeclaration returns [EObject current=null] : iv_ruleEntityDeclaration= ruleEntityDeclaration EOF ;
    public final EObject entryRuleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityDeclaration = null;


        try {
            // InternalOntoL.g:332:58: (iv_ruleEntityDeclaration= ruleEntityDeclaration EOF )
            // InternalOntoL.g:333:2: iv_ruleEntityDeclaration= ruleEntityDeclaration EOF
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
    // InternalOntoL.g:339:1: ruleEntityDeclaration returns [EObject current=null] : (this_OntoLClass_0= ruleOntoLClass | this_Individual_1= ruleIndividual ) ;
    public final EObject ruleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OntoLClass_0 = null;

        EObject this_Individual_1 = null;



        	enterRule();

        try {
            // InternalOntoL.g:345:2: ( (this_OntoLClass_0= ruleOntoLClass | this_Individual_1= ruleIndividual ) )
            // InternalOntoL.g:346:2: (this_OntoLClass_0= ruleOntoLClass | this_Individual_1= ruleIndividual )
            {
            // InternalOntoL.g:346:2: (this_OntoLClass_0= ruleOntoLClass | this_Individual_1= ruleIndividual )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=22 && LA5_0<=23)||(LA5_0>=27 && LA5_0<=28)) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalOntoL.g:347:3: this_OntoLClass_0= ruleOntoLClass
                    {

                    			newCompositeNode(grammarAccess.getEntityDeclarationAccess().getOntoLClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntoLClass_0=ruleOntoLClass();

                    state._fsp--;


                    			current = this_OntoLClass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoL.g:356:3: this_Individual_1= ruleIndividual
                    {

                    			newCompositeNode(grammarAccess.getEntityDeclarationAccess().getIndividualParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Individual_1=ruleIndividual();

                    state._fsp--;


                    			current = this_Individual_1;
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
    // InternalOntoL.g:368:1: entryRuleIndividual returns [EObject current=null] : iv_ruleIndividual= ruleIndividual EOF ;
    public final EObject entryRuleIndividual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndividual = null;


        try {
            // InternalOntoL.g:368:51: (iv_ruleIndividual= ruleIndividual EOF )
            // InternalOntoL.g:369:2: iv_ruleIndividual= ruleIndividual EOF
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
    // InternalOntoL.g:375:1: ruleIndividual returns [EObject current=null] : (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( ( (lv_attAssignments_7_0= ruleAttributeAssignment ) ) | ( (lv_refAssignments_8_0= ruleReferenceAssignment ) ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleIndividual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_attAssignments_7_0 = null;

        EObject lv_refAssignments_8_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:381:2: ( (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( ( (lv_attAssignments_7_0= ruleAttributeAssignment ) ) | ( (lv_refAssignments_8_0= ruleReferenceAssignment ) ) )* otherlv_9= '}' )? ) )
            // InternalOntoL.g:382:2: (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( ( (lv_attAssignments_7_0= ruleAttributeAssignment ) ) | ( (lv_refAssignments_8_0= ruleReferenceAssignment ) ) )* otherlv_9= '}' )? )
            {
            // InternalOntoL.g:382:2: (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( ( (lv_attAssignments_7_0= ruleAttributeAssignment ) ) | ( (lv_refAssignments_8_0= ruleReferenceAssignment ) ) )* otherlv_9= '}' )? )
            // InternalOntoL.g:383:3: otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( ( (lv_attAssignments_7_0= ruleAttributeAssignment ) ) | ( (lv_refAssignments_8_0= ruleReferenceAssignment ) ) )* otherlv_9= '}' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIndividualAccess().getIndividualKeyword_0());
            		
            // InternalOntoL.g:387:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntoL.g:388:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntoL.g:388:4: (lv_name_1_0= RULE_ID )
            // InternalOntoL.g:389:5: lv_name_1_0= RULE_ID
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

            // InternalOntoL.g:405:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntoL.g:406:4: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getIndividualAccess().getColonKeyword_2_0());
                    			
                    // InternalOntoL.g:410:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:411:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:411:5: ( ruleQualifiedName )
                    // InternalOntoL.g:412:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIndividualRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIndividualAccess().getInstantiatedClassesOntoLClassCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:426:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==21) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalOntoL.g:427:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getIndividualAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalOntoL.g:431:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:432:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:432:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:433:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIndividualRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIndividualAccess().getInstantiatedClassesOntoLClassCrossReference_2_2_1_0());
                    	    						
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

            // InternalOntoL.g:449:3: (otherlv_6= '{' ( ( (lv_attAssignments_7_0= ruleAttributeAssignment ) ) | ( (lv_refAssignments_8_0= ruleReferenceAssignment ) ) )* otherlv_9= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntoL.g:450:4: otherlv_6= '{' ( ( (lv_attAssignments_7_0= ruleAttributeAssignment ) ) | ( (lv_refAssignments_8_0= ruleReferenceAssignment ) ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getIndividualAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalOntoL.g:454:4: ( ( (lv_attAssignments_7_0= ruleAttributeAssignment ) ) | ( (lv_refAssignments_8_0= ruleReferenceAssignment ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==30) ) {
                            alt8=1;
                        }
                        else if ( (LA8_0==35) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalOntoL.g:455:5: ( (lv_attAssignments_7_0= ruleAttributeAssignment ) )
                    	    {
                    	    // InternalOntoL.g:455:5: ( (lv_attAssignments_7_0= ruleAttributeAssignment ) )
                    	    // InternalOntoL.g:456:6: (lv_attAssignments_7_0= ruleAttributeAssignment )
                    	    {
                    	    // InternalOntoL.g:456:6: (lv_attAssignments_7_0= ruleAttributeAssignment )
                    	    // InternalOntoL.g:457:7: lv_attAssignments_7_0= ruleAttributeAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getIndividualAccess().getAttAssignmentsAttributeAssignmentParserRuleCall_3_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_attAssignments_7_0=ruleAttributeAssignment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIndividualRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attAssignments",
                    	    								lv_attAssignments_7_0,
                    	    								"br.ufes.inf.nemo.ontol.OntoL.AttributeAssignment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOntoL.g:475:5: ( (lv_refAssignments_8_0= ruleReferenceAssignment ) )
                    	    {
                    	    // InternalOntoL.g:475:5: ( (lv_refAssignments_8_0= ruleReferenceAssignment ) )
                    	    // InternalOntoL.g:476:6: (lv_refAssignments_8_0= ruleReferenceAssignment )
                    	    {
                    	    // InternalOntoL.g:476:6: (lv_refAssignments_8_0= ruleReferenceAssignment )
                    	    // InternalOntoL.g:477:7: lv_refAssignments_8_0= ruleReferenceAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getIndividualAccess().getRefAssignmentsReferenceAssignmentParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_refAssignments_8_0=ruleReferenceAssignment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIndividualRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"refAssignments",
                    	    								lv_refAssignments_8_0,
                    	    								"br.ufes.inf.nemo.ontol.OntoL.ReferenceAssignment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getIndividualAccess().getRightCurlyBracketKeyword_3_2());
                    			

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


    // $ANTLR start "entryRuleOntoLClass"
    // InternalOntoL.g:504:1: entryRuleOntoLClass returns [EObject current=null] : iv_ruleOntoLClass= ruleOntoLClass EOF ;
    public final EObject entryRuleOntoLClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntoLClass = null;


        try {
            // InternalOntoL.g:504:51: (iv_ruleOntoLClass= ruleOntoLClass EOF )
            // InternalOntoL.g:505:2: iv_ruleOntoLClass= ruleOntoLClass EOF
            {
             newCompositeNode(grammarAccess.getOntoLClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntoLClass=ruleOntoLClass();

            state._fsp--;

             current =iv_ruleOntoLClass; 
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
    // $ANTLR end "entryRuleOntoLClass"


    // $ANTLR start "ruleOntoLClass"
    // InternalOntoL.g:511:1: ruleOntoLClass returns [EObject current=null] : ( (this_OrderlessClass_0= ruleOrderlessClass | this_HOClass_1= ruleHOClass | this_FOClass_2= ruleFOClass ) (otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttribute ) ) | ( (lv_attAssignments_5_0= ruleAttributeAssignment ) ) | ( (lv_references_6_0= ruleReference ) ) | ( (lv_refAssignments_7_0= ruleReferenceAssignment ) ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleOntoLClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_8=null;
        EObject this_OrderlessClass_0 = null;

        EObject this_HOClass_1 = null;

        EObject this_FOClass_2 = null;

        EObject lv_attributes_4_0 = null;

        EObject lv_attAssignments_5_0 = null;

        EObject lv_references_6_0 = null;

        EObject lv_refAssignments_7_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:517:2: ( ( (this_OrderlessClass_0= ruleOrderlessClass | this_HOClass_1= ruleHOClass | this_FOClass_2= ruleFOClass ) (otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttribute ) ) | ( (lv_attAssignments_5_0= ruleAttributeAssignment ) ) | ( (lv_references_6_0= ruleReference ) ) | ( (lv_refAssignments_7_0= ruleReferenceAssignment ) ) )* otherlv_8= '}' )? ) )
            // InternalOntoL.g:518:2: ( (this_OrderlessClass_0= ruleOrderlessClass | this_HOClass_1= ruleHOClass | this_FOClass_2= ruleFOClass ) (otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttribute ) ) | ( (lv_attAssignments_5_0= ruleAttributeAssignment ) ) | ( (lv_references_6_0= ruleReference ) ) | ( (lv_refAssignments_7_0= ruleReferenceAssignment ) ) )* otherlv_8= '}' )? )
            {
            // InternalOntoL.g:518:2: ( (this_OrderlessClass_0= ruleOrderlessClass | this_HOClass_1= ruleHOClass | this_FOClass_2= ruleFOClass ) (otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttribute ) ) | ( (lv_attAssignments_5_0= ruleAttributeAssignment ) ) | ( (lv_references_6_0= ruleReference ) ) | ( (lv_refAssignments_7_0= ruleReferenceAssignment ) ) )* otherlv_8= '}' )? )
            // InternalOntoL.g:519:3: (this_OrderlessClass_0= ruleOrderlessClass | this_HOClass_1= ruleHOClass | this_FOClass_2= ruleFOClass ) (otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttribute ) ) | ( (lv_attAssignments_5_0= ruleAttributeAssignment ) ) | ( (lv_references_6_0= ruleReference ) ) | ( (lv_refAssignments_7_0= ruleReferenceAssignment ) ) )* otherlv_8= '}' )?
            {
            // InternalOntoL.g:519:3: (this_OrderlessClass_0= ruleOrderlessClass | this_HOClass_1= ruleHOClass | this_FOClass_2= ruleFOClass )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case 28:
                {
                alt10=2;
                }
                break;
            case 23:
            case 27:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalOntoL.g:520:4: this_OrderlessClass_0= ruleOrderlessClass
                    {

                    				newCompositeNode(grammarAccess.getOntoLClassAccess().getOrderlessClassParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_12);
                    this_OrderlessClass_0=ruleOrderlessClass();

                    state._fsp--;


                    				current = this_OrderlessClass_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalOntoL.g:529:4: this_HOClass_1= ruleHOClass
                    {

                    				newCompositeNode(grammarAccess.getOntoLClassAccess().getHOClassParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_12);
                    this_HOClass_1=ruleHOClass();

                    state._fsp--;


                    				current = this_HOClass_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalOntoL.g:538:4: this_FOClass_2= ruleFOClass
                    {

                    				newCompositeNode(grammarAccess.getOntoLClassAccess().getFOClassParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_12);
                    this_FOClass_2=ruleFOClass();

                    state._fsp--;


                    				current = this_FOClass_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalOntoL.g:547:3: (otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttribute ) ) | ( (lv_attAssignments_5_0= ruleAttributeAssignment ) ) | ( (lv_references_6_0= ruleReference ) ) | ( (lv_refAssignments_7_0= ruleReferenceAssignment ) ) )* otherlv_8= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOntoL.g:548:4: otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttribute ) ) | ( (lv_attAssignments_5_0= ruleAttributeAssignment ) ) | ( (lv_references_6_0= ruleReference ) ) | ( (lv_refAssignments_7_0= ruleReferenceAssignment ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getOntoLClassAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalOntoL.g:552:4: ( ( (lv_attributes_4_0= ruleAttribute ) ) | ( (lv_attAssignments_5_0= ruleAttributeAssignment ) ) | ( (lv_references_6_0= ruleReference ) ) | ( (lv_refAssignments_7_0= ruleReferenceAssignment ) ) )*
                    loop11:
                    do {
                        int alt11=5;
                        alt11 = dfa11.predict(input);
                        switch (alt11) {
                    	case 1 :
                    	    // InternalOntoL.g:553:5: ( (lv_attributes_4_0= ruleAttribute ) )
                    	    {
                    	    // InternalOntoL.g:553:5: ( (lv_attributes_4_0= ruleAttribute ) )
                    	    // InternalOntoL.g:554:6: (lv_attributes_4_0= ruleAttribute )
                    	    {
                    	    // InternalOntoL.g:554:6: (lv_attributes_4_0= ruleAttribute )
                    	    // InternalOntoL.g:555:7: lv_attributes_4_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntoLClassAccess().getAttributesAttributeParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_attributes_4_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntoLClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_4_0,
                    	    								"br.ufes.inf.nemo.ontol.OntoL.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOntoL.g:573:5: ( (lv_attAssignments_5_0= ruleAttributeAssignment ) )
                    	    {
                    	    // InternalOntoL.g:573:5: ( (lv_attAssignments_5_0= ruleAttributeAssignment ) )
                    	    // InternalOntoL.g:574:6: (lv_attAssignments_5_0= ruleAttributeAssignment )
                    	    {
                    	    // InternalOntoL.g:574:6: (lv_attAssignments_5_0= ruleAttributeAssignment )
                    	    // InternalOntoL.g:575:7: lv_attAssignments_5_0= ruleAttributeAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntoLClassAccess().getAttAssignmentsAttributeAssignmentParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_attAssignments_5_0=ruleAttributeAssignment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntoLClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attAssignments",
                    	    								lv_attAssignments_5_0,
                    	    								"br.ufes.inf.nemo.ontol.OntoL.AttributeAssignment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalOntoL.g:593:5: ( (lv_references_6_0= ruleReference ) )
                    	    {
                    	    // InternalOntoL.g:593:5: ( (lv_references_6_0= ruleReference ) )
                    	    // InternalOntoL.g:594:6: (lv_references_6_0= ruleReference )
                    	    {
                    	    // InternalOntoL.g:594:6: (lv_references_6_0= ruleReference )
                    	    // InternalOntoL.g:595:7: lv_references_6_0= ruleReference
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntoLClassAccess().getReferencesReferenceParserRuleCall_1_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_references_6_0=ruleReference();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntoLClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"references",
                    	    								lv_references_6_0,
                    	    								"br.ufes.inf.nemo.ontol.OntoL.Reference");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalOntoL.g:613:5: ( (lv_refAssignments_7_0= ruleReferenceAssignment ) )
                    	    {
                    	    // InternalOntoL.g:613:5: ( (lv_refAssignments_7_0= ruleReferenceAssignment ) )
                    	    // InternalOntoL.g:614:6: (lv_refAssignments_7_0= ruleReferenceAssignment )
                    	    {
                    	    // InternalOntoL.g:614:6: (lv_refAssignments_7_0= ruleReferenceAssignment )
                    	    // InternalOntoL.g:615:7: lv_refAssignments_7_0= ruleReferenceAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntoLClassAccess().getRefAssignmentsReferenceAssignmentParserRuleCall_1_1_3_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_refAssignments_7_0=ruleReferenceAssignment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntoLClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"refAssignments",
                    	    								lv_refAssignments_7_0,
                    	    								"br.ufes.inf.nemo.ontol.OntoL.ReferenceAssignment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getOntoLClassAccess().getRightCurlyBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleOntoLClass"


    // $ANTLR start "entryRuleOrderlessClass"
    // InternalOntoL.g:642:1: entryRuleOrderlessClass returns [EObject current=null] : iv_ruleOrderlessClass= ruleOrderlessClass EOF ;
    public final EObject entryRuleOrderlessClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderlessClass = null;


        try {
            // InternalOntoL.g:642:55: (iv_ruleOrderlessClass= ruleOrderlessClass EOF )
            // InternalOntoL.g:643:2: iv_ruleOrderlessClass= ruleOrderlessClass EOF
            {
             newCompositeNode(grammarAccess.getOrderlessClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderlessClass=ruleOrderlessClass();

            state._fsp--;

             current =iv_ruleOrderlessClass; 
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
    // $ANTLR end "entryRuleOrderlessClass"


    // $ANTLR start "ruleOrderlessClass"
    // InternalOntoL.g:649:1: ruleOrderlessClass returns [EObject current=null] : (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )? ) ;
    public final EObject ruleOrderlessClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_17=null;
        Enumerator lv_categorizationType_15_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:655:2: ( (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )? ) )
            // InternalOntoL.g:656:2: (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )? )
            {
            // InternalOntoL.g:656:2: (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )? )
            // InternalOntoL.g:657:3: otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderlessClassAccess().getOrderlessKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderlessClassAccess().getClassKeyword_1());
            		
            // InternalOntoL.g:665:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOntoL.g:666:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOntoL.g:666:4: (lv_name_2_0= RULE_ID )
            // InternalOntoL.g:667:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getOrderlessClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderlessClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOntoL.g:683:3: (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOntoL.g:684:4: otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getOrderlessClassAccess().getColonKeyword_3_0());
                    			
                    // InternalOntoL.g:688:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:689:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:689:5: ( ruleQualifiedName )
                    // InternalOntoL.g:690:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOrderlessClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:704:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==21) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalOntoL.g:705:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getOrderlessClassAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalOntoL.g:709:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:710:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:710:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:711:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOrderlessClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getOrderlessClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntoL.g:727:3: (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOntoL.g:728:4: otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getOrderlessClassAccess().getSpecializesKeyword_4_0());
                    			
                    // InternalOntoL.g:732:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:733:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:733:5: ( ruleQualifiedName )
                    // InternalOntoL.g:734:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOrderlessClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOrderlessClassAccess().getSuperClassesOntoLClassCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:748:4: (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalOntoL.g:749:5: otherlv_9= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getOrderlessClassAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalOntoL.g:753:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:754:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:754:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:755:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOrderlessClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getOrderlessClassAccess().getSuperClassesOntoLClassCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntoL.g:771:3: (otherlv_11= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOntoL.g:772:4: otherlv_11= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_11=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getOrderlessClassAccess().getSubordinatedtoKeyword_5_0());
                    			
                    // InternalOntoL.g:776:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:777:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:777:5: ( ruleQualifiedName )
                    // InternalOntoL.g:778:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOrderlessClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOrderlessClassAccess().getSubordinatorsOntoLClassCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:792:4: (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==21) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalOntoL.g:793:5: otherlv_13= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getOrderlessClassAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalOntoL.g:797:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:798:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:798:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:799:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOrderlessClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getOrderlessClassAccess().getSubordinatorsOntoLClassCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
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

            // InternalOntoL.g:815:3: ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=49 && LA19_0<=52)) ) {
                alt19=1;
            }
            else if ( (LA19_0==26) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // InternalOntoL.g:816:4: ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalOntoL.g:816:4: ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    // InternalOntoL.g:817:5: ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalOntoL.g:817:5: ( (lv_categorizationType_15_0= ruleCategorizationType ) )
                    // InternalOntoL.g:818:6: (lv_categorizationType_15_0= ruleCategorizationType )
                    {
                    // InternalOntoL.g:818:6: (lv_categorizationType_15_0= ruleCategorizationType )
                    // InternalOntoL.g:819:7: lv_categorizationType_15_0= ruleCategorizationType
                    {

                    							newCompositeNode(grammarAccess.getOrderlessClassAccess().getCategorizationTypeCategorizationTypeEnumRuleCall_6_0_0_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_categorizationType_15_0=ruleCategorizationType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getOrderlessClassRule());
                    							}
                    							set(
                    								current,
                    								"categorizationType",
                    								lv_categorizationType_15_0,
                    								"br.ufes.inf.nemo.ontol.OntoL.CategorizationType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalOntoL.g:836:5: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:837:6: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:837:6: ( ruleQualifiedName )
                    // InternalOntoL.g:838:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getOrderlessClassRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getOrderlessClassAccess().getBasetypeOntoLClassCrossReference_6_0_1_0());
                    						
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
                    // InternalOntoL.g:854:4: (otherlv_17= 'ispowertypeof' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalOntoL.g:854:4: (otherlv_17= 'ispowertypeof' ( ( ruleQualifiedName ) ) )
                    // InternalOntoL.g:855:5: otherlv_17= 'ispowertypeof' ( ( ruleQualifiedName ) )
                    {
                    otherlv_17=(Token)match(input,26,FOLLOW_3); 

                    					newLeafNode(otherlv_17, grammarAccess.getOrderlessClassAccess().getIspowertypeofKeyword_6_1_0());
                    				
                    // InternalOntoL.g:859:5: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:860:6: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:860:6: ( ruleQualifiedName )
                    // InternalOntoL.g:861:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getOrderlessClassRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getOrderlessClassAccess().getPowertypeOfOntoLClassCrossReference_6_1_1_0());
                    						
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
    // $ANTLR end "ruleOrderlessClass"


    // $ANTLR start "entryRuleFOClass"
    // InternalOntoL.g:881:1: entryRuleFOClass returns [EObject current=null] : iv_ruleFOClass= ruleFOClass EOF ;
    public final EObject entryRuleFOClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFOClass = null;


        try {
            // InternalOntoL.g:881:48: (iv_ruleFOClass= ruleFOClass EOF )
            // InternalOntoL.g:882:2: iv_ruleFOClass= ruleFOClass EOF
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
    // InternalOntoL.g:888:1: ruleFOClass returns [EObject current=null] : ( (otherlv_0= 'first-order' )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? ) ;
    public final EObject ruleFOClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalOntoL.g:894:2: ( ( (otherlv_0= 'first-order' )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            // InternalOntoL.g:895:2: ( (otherlv_0= 'first-order' )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? )
            {
            // InternalOntoL.g:895:2: ( (otherlv_0= 'first-order' )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? )
            // InternalOntoL.g:896:3: (otherlv_0= 'first-order' )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )?
            {
            // InternalOntoL.g:896:3: (otherlv_0= 'first-order' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntoL.g:897:4: otherlv_0= 'first-order'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_0, grammarAccess.getFOClassAccess().getFirstOrderKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFOClassAccess().getClassKeyword_1());
            		
            // InternalOntoL.g:906:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOntoL.g:907:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOntoL.g:907:4: (lv_name_2_0= RULE_ID )
            // InternalOntoL.g:908:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFOClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFOClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOntoL.g:924:3: (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOntoL.g:925:4: otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getFOClassAccess().getColonKeyword_3_0());
                    			
                    // InternalOntoL.g:929:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:930:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:930:5: ( ruleQualifiedName )
                    // InternalOntoL.g:931:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFOClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFOClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:945:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==21) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalOntoL.g:946:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFOClassAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalOntoL.g:950:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:951:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:951:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:952:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFOClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFOClassAccess().getInstantiatedClassesOntoLClassCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
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

            // InternalOntoL.g:968:3: (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOntoL.g:969:4: otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getFOClassAccess().getSpecializesKeyword_4_0());
                    			
                    // InternalOntoL.g:973:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:974:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:974:5: ( ruleQualifiedName )
                    // InternalOntoL.g:975:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFOClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFOClassAccess().getSuperClassesOntoLClassCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:989:4: (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==21) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalOntoL.g:990:5: otherlv_9= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getFOClassAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalOntoL.g:994:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:995:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:995:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:996:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFOClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFOClassAccess().getSuperClassesOntoLClassCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
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
    // InternalOntoL.g:1016:1: entryRuleHOClass returns [EObject current=null] : iv_ruleHOClass= ruleHOClass EOF ;
    public final EObject entryRuleHOClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHOClass = null;


        try {
            // InternalOntoL.g:1016:48: (iv_ruleHOClass= ruleHOClass EOF )
            // InternalOntoL.g:1017:2: iv_ruleHOClass= ruleHOClass EOF
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
    // InternalOntoL.g:1023:1: ruleHOClass returns [EObject current=null] : (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )? ) ;
    public final EObject ruleHOClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_order_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_18=null;
        Enumerator lv_categorizationType_16_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:1029:2: ( (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )? ) )
            // InternalOntoL.g:1030:2: (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )? )
            {
            // InternalOntoL.g:1030:2: (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )? )
            // InternalOntoL.g:1031:3: otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getHOClassAccess().getOrderKeyword_0());
            		
            // InternalOntoL.g:1035:3: ( (lv_order_1_0= RULE_INT ) )
            // InternalOntoL.g:1036:4: (lv_order_1_0= RULE_INT )
            {
            // InternalOntoL.g:1036:4: (lv_order_1_0= RULE_INT )
            // InternalOntoL.g:1037:5: lv_order_1_0= RULE_INT
            {
            lv_order_1_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_order_1_0, grammarAccess.getHOClassAccess().getOrderINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHOClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"order",
            						lv_order_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getHOClassAccess().getClassKeyword_2());
            		
            // InternalOntoL.g:1057:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalOntoL.g:1058:4: (lv_name_3_0= RULE_ID )
            {
            // InternalOntoL.g:1058:4: (lv_name_3_0= RULE_ID )
            // InternalOntoL.g:1059:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_3_0, grammarAccess.getHOClassAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHOClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOntoL.g:1075:3: (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOntoL.g:1076:4: otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getHOClassAccess().getColonKeyword_4_0());
                    			
                    // InternalOntoL.g:1080:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1081:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1081:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1082:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHOClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHOClassAccess().getInstantiatedClassesOntoLClassCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:1096:4: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==21) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalOntoL.g:1097:5: otherlv_6= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getHOClassAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalOntoL.g:1101:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:1102:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:1102:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:1103:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHOClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHOClassAccess().getInstantiatedClassesOntoLClassCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntoL.g:1119:3: (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOntoL.g:1120:4: otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getHOClassAccess().getSpecializesKeyword_5_0());
                    			
                    // InternalOntoL.g:1124:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1125:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1125:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1126:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHOClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHOClassAccess().getSuperClassesOntoLClassCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:1140:4: (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==21) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalOntoL.g:1141:5: otherlv_10= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_10=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getHOClassAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalOntoL.g:1145:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:1146:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:1146:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:1147:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHOClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHOClassAccess().getSuperClassesOntoLClassCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntoL.g:1163:3: (otherlv_12= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOntoL.g:1164:4: otherlv_12= 'subordinatedto' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_12=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getHOClassAccess().getSubordinatedtoKeyword_6_0());
                    			
                    // InternalOntoL.g:1168:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1169:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1169:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1170:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHOClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHOClassAccess().getSubordinatorsOntoLClassCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:1184:4: (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==21) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalOntoL.g:1185:5: otherlv_14= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_14=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getHOClassAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalOntoL.g:1189:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:1190:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:1190:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:1191:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHOClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHOClassAccess().getSubordinatorsOntoLClassCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntoL.g:1207:3: ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'ispowertypeof' ( ( ruleQualifiedName ) ) ) )?
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=49 && LA31_0<=52)) ) {
                alt31=1;
            }
            else if ( (LA31_0==26) ) {
                alt31=2;
            }
            switch (alt31) {
                case 1 :
                    // InternalOntoL.g:1208:4: ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalOntoL.g:1208:4: ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    // InternalOntoL.g:1209:5: ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalOntoL.g:1209:5: ( (lv_categorizationType_16_0= ruleCategorizationType ) )
                    // InternalOntoL.g:1210:6: (lv_categorizationType_16_0= ruleCategorizationType )
                    {
                    // InternalOntoL.g:1210:6: (lv_categorizationType_16_0= ruleCategorizationType )
                    // InternalOntoL.g:1211:7: lv_categorizationType_16_0= ruleCategorizationType
                    {

                    							newCompositeNode(grammarAccess.getHOClassAccess().getCategorizationTypeCategorizationTypeEnumRuleCall_7_0_0_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_categorizationType_16_0=ruleCategorizationType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getHOClassRule());
                    							}
                    							set(
                    								current,
                    								"categorizationType",
                    								lv_categorizationType_16_0,
                    								"br.ufes.inf.nemo.ontol.OntoL.CategorizationType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalOntoL.g:1228:5: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1229:6: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1229:6: ( ruleQualifiedName )
                    // InternalOntoL.g:1230:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHOClassRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getHOClassAccess().getBasetypeOntoLClassCrossReference_7_0_1_0());
                    						
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
                    // InternalOntoL.g:1246:4: (otherlv_18= 'ispowertypeof' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalOntoL.g:1246:4: (otherlv_18= 'ispowertypeof' ( ( ruleQualifiedName ) ) )
                    // InternalOntoL.g:1247:5: otherlv_18= 'ispowertypeof' ( ( ruleQualifiedName ) )
                    {
                    otherlv_18=(Token)match(input,26,FOLLOW_3); 

                    					newLeafNode(otherlv_18, grammarAccess.getHOClassAccess().getIspowertypeofKeyword_7_1_0());
                    				
                    // InternalOntoL.g:1251:5: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1252:6: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1252:6: ( ruleQualifiedName )
                    // InternalOntoL.g:1253:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHOClassRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getHOClassAccess().getPowertypeOfOntoLClassCrossReference_7_1_1_0());
                    						
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


    // $ANTLR start "entryRuleAttribute"
    // InternalOntoL.g:1273:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalOntoL.g:1273:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalOntoL.g:1274:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalOntoL.g:1280:1: ruleAttribute returns [EObject current=null] : ( ( (lv_regularity_0_0= 'regularity' ) )? otherlv_1= 'att' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_regularity_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_lowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_7_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:1286:2: ( ( ( (lv_regularity_0_0= 'regularity' ) )? otherlv_1= 'att' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            // InternalOntoL.g:1287:2: ( ( (lv_regularity_0_0= 'regularity' ) )? otherlv_1= 'att' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? )
            {
            // InternalOntoL.g:1287:2: ( ( (lv_regularity_0_0= 'regularity' ) )? otherlv_1= 'att' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? )
            // InternalOntoL.g:1288:3: ( (lv_regularity_0_0= 'regularity' ) )? otherlv_1= 'att' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
            {
            // InternalOntoL.g:1288:3: ( (lv_regularity_0_0= 'regularity' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOntoL.g:1289:4: (lv_regularity_0_0= 'regularity' )
                    {
                    // InternalOntoL.g:1289:4: (lv_regularity_0_0= 'regularity' )
                    // InternalOntoL.g:1290:5: lv_regularity_0_0= 'regularity'
                    {
                    lv_regularity_0_0=(Token)match(input,29,FOLLOW_23); 

                    					newLeafNode(lv_regularity_0_0, grammarAccess.getAttributeAccess().getRegularityRegularityKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "regularity", true, "regularity");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttKeyword_1());
            		
            // InternalOntoL.g:1306:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOntoL.g:1307:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOntoL.g:1307:4: (lv_name_2_0= RULE_ID )
            // InternalOntoL.g:1308:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_3());
            		
            // InternalOntoL.g:1328:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOntoL.g:1329:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalOntoL.g:1333:4: ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) )
                    // InternalOntoL.g:1334:5: (lv_lowerBound_5_0= ruleELEMENTBOUND )
                    {
                    // InternalOntoL.g:1334:5: (lv_lowerBound_5_0= ruleELEMENTBOUND )
                    // InternalOntoL.g:1335:6: lv_lowerBound_5_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getLowerBoundELEMENTBOUNDParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_lowerBound_5_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_5_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,32,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_4_2());
                    			
                    // InternalOntoL.g:1356:4: ( (lv_upperBound_7_0= ruleELEMENTBOUND ) )
                    // InternalOntoL.g:1357:5: (lv_upperBound_7_0= ruleELEMENTBOUND )
                    {
                    // InternalOntoL.g:1357:5: (lv_upperBound_7_0= ruleELEMENTBOUND )
                    // InternalOntoL.g:1358:6: lv_upperBound_7_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getUpperBoundELEMENTBOUNDParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_upperBound_7_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_7_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalOntoL.g:1380:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:1381:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:1381:4: ( ruleQualifiedName )
            // InternalOntoL.g:1382:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getPropertyClassOntoLClassCrossReference_5_0());
            				
            pushFollow(FOLLOW_29);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoL.g:1396:3: (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOntoL.g:1397:4: otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getSubsetsKeyword_6_0());
                    			
                    // InternalOntoL.g:1401:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1402:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1402:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1403:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:1417:4: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==21) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalOntoL.g:1418:5: otherlv_12= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_12=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalOntoL.g:1422:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:1423:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:1423:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:1424:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAttributeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleReference"
    // InternalOntoL.g:1444:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalOntoL.g:1444:50: (iv_ruleReference= ruleReference EOF )
            // InternalOntoL.g:1445:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalOntoL.g:1451:1: ruleReference returns [EObject current=null] : ( ( (lv_regularity_0_0= 'regularity' ) )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isoppositeto' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_regularity_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_lowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_7_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:1457:2: ( ( ( (lv_regularity_0_0= 'regularity' ) )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isoppositeto' ( ( ruleQualifiedName ) ) )? ) )
            // InternalOntoL.g:1458:2: ( ( (lv_regularity_0_0= 'regularity' ) )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isoppositeto' ( ( ruleQualifiedName ) ) )? )
            {
            // InternalOntoL.g:1458:2: ( ( (lv_regularity_0_0= 'regularity' ) )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isoppositeto' ( ( ruleQualifiedName ) ) )? )
            // InternalOntoL.g:1459:3: ( (lv_regularity_0_0= 'regularity' ) )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isoppositeto' ( ( ruleQualifiedName ) ) )?
            {
            // InternalOntoL.g:1459:3: ( (lv_regularity_0_0= 'regularity' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==29) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOntoL.g:1460:4: (lv_regularity_0_0= 'regularity' )
                    {
                    // InternalOntoL.g:1460:4: (lv_regularity_0_0= 'regularity' )
                    // InternalOntoL.g:1461:5: lv_regularity_0_0= 'regularity'
                    {
                    lv_regularity_0_0=(Token)match(input,29,FOLLOW_30); 

                    					newLeafNode(lv_regularity_0_0, grammarAccess.getReferenceAccess().getRegularityRegularityKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReferenceRule());
                    					}
                    					setWithLastConsumed(current, "regularity", true, "regularity");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getRefKeyword_1());
            		
            // InternalOntoL.g:1477:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOntoL.g:1478:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOntoL.g:1478:4: (lv_name_2_0= RULE_ID )
            // InternalOntoL.g:1479:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_2_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getColonKeyword_3());
            		
            // InternalOntoL.g:1499:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOntoL.g:1500:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalOntoL.g:1504:4: ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) )
                    // InternalOntoL.g:1505:5: (lv_lowerBound_5_0= ruleELEMENTBOUND )
                    {
                    // InternalOntoL.g:1505:5: (lv_lowerBound_5_0= ruleELEMENTBOUND )
                    // InternalOntoL.g:1506:6: lv_lowerBound_5_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getLowerBoundELEMENTBOUNDParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_lowerBound_5_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_5_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,32,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getReferenceAccess().getFullStopFullStopKeyword_4_2());
                    			
                    // InternalOntoL.g:1527:4: ( (lv_upperBound_7_0= ruleELEMENTBOUND ) )
                    // InternalOntoL.g:1528:5: (lv_upperBound_7_0= ruleELEMENTBOUND )
                    {
                    // InternalOntoL.g:1528:5: (lv_upperBound_7_0= ruleELEMENTBOUND )
                    // InternalOntoL.g:1529:6: lv_upperBound_7_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getUpperBoundELEMENTBOUNDParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_upperBound_7_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_7_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalOntoL.g:1551:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:1552:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:1552:4: ( ruleQualifiedName )
            // InternalOntoL.g:1553:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReferenceAccess().getPropertyClassOntoLClassCrossReference_5_0());
            				
            pushFollow(FOLLOW_31);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoL.g:1567:3: (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOntoL.g:1568:4: otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getReferenceAccess().getSubsetsKeyword_6_0());
                    			
                    // InternalOntoL.g:1572:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1573:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1573:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1574:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:1588:4: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==21) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalOntoL.g:1589:5: otherlv_12= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_12=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getReferenceAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalOntoL.g:1593:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:1594:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:1594:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:1595:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getReferenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntoL.g:1611:3: (otherlv_14= 'isoppositeto' ( ( ruleQualifiedName ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOntoL.g:1612:4: otherlv_14= 'isoppositeto' ( ( ruleQualifiedName ) )
                    {
                    otherlv_14=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getReferenceAccess().getIsoppositetoKeyword_7_0());
                    			
                    // InternalOntoL.g:1616:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1617:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1617:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1618:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceAccess().getOppositeToReferenceCrossReference_7_1_0());
                    					
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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleELEMENTBOUND"
    // InternalOntoL.g:1637:1: entryRuleELEMENTBOUND returns [String current=null] : iv_ruleELEMENTBOUND= ruleELEMENTBOUND EOF ;
    public final String entryRuleELEMENTBOUND() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELEMENTBOUND = null;


        try {
            // InternalOntoL.g:1637:52: (iv_ruleELEMENTBOUND= ruleELEMENTBOUND EOF )
            // InternalOntoL.g:1638:2: iv_ruleELEMENTBOUND= ruleELEMENTBOUND EOF
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
    // InternalOntoL.g:1644:1: ruleELEMENTBOUND returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELEMENTBOUND() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOntoL.g:1650:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalOntoL.g:1651:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalOntoL.g:1651:2: (kw= '*' | this_INT_1= RULE_INT )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_INT) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalOntoL.g:1652:3: kw= '*'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getELEMENTBOUNDAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1658:3: this_INT_1= RULE_INT
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


    // $ANTLR start "entryRuleAttributeAssignment"
    // InternalOntoL.g:1669:1: entryRuleAttributeAssignment returns [EObject current=null] : iv_ruleAttributeAssignment= ruleAttributeAssignment EOF ;
    public final EObject entryRuleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeAssignment = null;


        try {
            // InternalOntoL.g:1669:60: (iv_ruleAttributeAssignment= ruleAttributeAssignment EOF )
            // InternalOntoL.g:1670:2: iv_ruleAttributeAssignment= ruleAttributeAssignment EOF
            {
             newCompositeNode(grammarAccess.getAttributeAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeAssignment=ruleAttributeAssignment();

            state._fsp--;

             current =iv_ruleAttributeAssignment; 
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
    // $ANTLR end "entryRuleAttributeAssignment"


    // $ANTLR start "ruleAttributeAssignment"
    // InternalOntoL.g:1676:1: ruleAttributeAssignment returns [EObject current=null] : (otherlv_0= 'att' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_assignments_3_0= ruleDataValue ) ) | (otherlv_4= '{' ( (lv_assignments_5_0= ruleDataValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )* otherlv_8= '}' ) ) ) ;
    public final EObject ruleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_assignments_3_0 = null;

        EObject lv_assignments_5_0 = null;

        EObject lv_assignments_7_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:1682:2: ( (otherlv_0= 'att' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_assignments_3_0= ruleDataValue ) ) | (otherlv_4= '{' ( (lv_assignments_5_0= ruleDataValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )* otherlv_8= '}' ) ) ) )
            // InternalOntoL.g:1683:2: (otherlv_0= 'att' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_assignments_3_0= ruleDataValue ) ) | (otherlv_4= '{' ( (lv_assignments_5_0= ruleDataValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )* otherlv_8= '}' ) ) )
            {
            // InternalOntoL.g:1683:2: (otherlv_0= 'att' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_assignments_3_0= ruleDataValue ) ) | (otherlv_4= '{' ( (lv_assignments_5_0= ruleDataValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )* otherlv_8= '}' ) ) )
            // InternalOntoL.g:1684:3: otherlv_0= 'att' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_assignments_3_0= ruleDataValue ) ) | (otherlv_4= '{' ( (lv_assignments_5_0= ruleDataValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )* otherlv_8= '}' ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAssignmentAccess().getAttKeyword_0());
            		
            // InternalOntoL.g:1688:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:1689:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:1689:4: ( ruleQualifiedName )
            // InternalOntoL.g:1690:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0());
            				
            pushFollow(FOLLOW_33);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAssignmentAccess().getEqualsSignKeyword_2());
            		
            // InternalOntoL.g:1708:3: ( ( (lv_assignments_3_0= ruleDataValue ) ) | (otherlv_4= '{' ( (lv_assignments_5_0= ruleDataValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )* otherlv_8= '}' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_INT && LA43_0<=RULE_STRING)||(LA43_0>=39 && LA43_0<=42)) ) {
                alt43=1;
            }
            else if ( (LA43_0==12) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalOntoL.g:1709:4: ( (lv_assignments_3_0= ruleDataValue ) )
                    {
                    // InternalOntoL.g:1709:4: ( (lv_assignments_3_0= ruleDataValue ) )
                    // InternalOntoL.g:1710:5: (lv_assignments_3_0= ruleDataValue )
                    {
                    // InternalOntoL.g:1710:5: (lv_assignments_3_0= ruleDataValue )
                    // InternalOntoL.g:1711:6: lv_assignments_3_0= ruleDataValue
                    {

                    						newCompositeNode(grammarAccess.getAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_assignments_3_0=ruleDataValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeAssignmentRule());
                    						}
                    						add(
                    							current,
                    							"assignments",
                    							lv_assignments_3_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.DataValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1729:4: (otherlv_4= '{' ( (lv_assignments_5_0= ruleDataValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )* otherlv_8= '}' )
                    {
                    // InternalOntoL.g:1729:4: (otherlv_4= '{' ( (lv_assignments_5_0= ruleDataValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )* otherlv_8= '}' )
                    // InternalOntoL.g:1730:5: otherlv_4= '{' ( (lv_assignments_5_0= ruleDataValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_35); 

                    					newLeafNode(otherlv_4, grammarAccess.getAttributeAssignmentAccess().getLeftCurlyBracketKeyword_3_1_0());
                    				
                    // InternalOntoL.g:1734:5: ( (lv_assignments_5_0= ruleDataValue ) )
                    // InternalOntoL.g:1735:6: (lv_assignments_5_0= ruleDataValue )
                    {
                    // InternalOntoL.g:1735:6: (lv_assignments_5_0= ruleDataValue )
                    // InternalOntoL.g:1736:7: lv_assignments_5_0= ruleDataValue
                    {

                    							newCompositeNode(grammarAccess.getAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_3_1_1_0());
                    						
                    pushFollow(FOLLOW_36);
                    lv_assignments_5_0=ruleDataValue();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAttributeAssignmentRule());
                    							}
                    							add(
                    								current,
                    								"assignments",
                    								lv_assignments_5_0,
                    								"br.ufes.inf.nemo.ontol.OntoL.DataValue");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalOntoL.g:1753:5: (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==21) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalOntoL.g:1754:6: otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_35); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getAttributeAssignmentAccess().getCommaKeyword_3_1_2_0());
                    	    					
                    	    // InternalOntoL.g:1758:6: ( (lv_assignments_7_0= ruleDataValue ) )
                    	    // InternalOntoL.g:1759:7: (lv_assignments_7_0= ruleDataValue )
                    	    {
                    	    // InternalOntoL.g:1759:7: (lv_assignments_7_0= ruleDataValue )
                    	    // InternalOntoL.g:1760:8: lv_assignments_7_0= ruleDataValue
                    	    {

                    	    								newCompositeNode(grammarAccess.getAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_3_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_36);
                    	    lv_assignments_7_0=ruleDataValue();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAttributeAssignmentRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"assignments",
                    	    									lv_assignments_7_0,
                    	    									"br.ufes.inf.nemo.ontol.OntoL.DataValue");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getAttributeAssignmentAccess().getRightCurlyBracketKeyword_3_1_3());
                    				

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
    // $ANTLR end "ruleAttributeAssignment"


    // $ANTLR start "entryRuleReferenceAssignment"
    // InternalOntoL.g:1788:1: entryRuleReferenceAssignment returns [EObject current=null] : iv_ruleReferenceAssignment= ruleReferenceAssignment EOF ;
    public final EObject entryRuleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceAssignment = null;


        try {
            // InternalOntoL.g:1788:60: (iv_ruleReferenceAssignment= ruleReferenceAssignment EOF )
            // InternalOntoL.g:1789:2: iv_ruleReferenceAssignment= ruleReferenceAssignment EOF
            {
             newCompositeNode(grammarAccess.getReferenceAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceAssignment=ruleReferenceAssignment();

            state._fsp--;

             current =iv_ruleReferenceAssignment; 
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
    // $ANTLR end "entryRuleReferenceAssignment"


    // $ANTLR start "ruleReferenceAssignment"
    // InternalOntoL.g:1795:1: ruleReferenceAssignment returns [EObject current=null] : (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_assignments_3_0= ruleReferenceValue ) ) | (otherlv_4= '{' ( (lv_assignments_5_0= ruleReferenceValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleReferenceValue ) ) )* otherlv_8= '}' ) ) ) ;
    public final EObject ruleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_assignments_3_0 = null;

        EObject lv_assignments_5_0 = null;

        EObject lv_assignments_7_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:1801:2: ( (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_assignments_3_0= ruleReferenceValue ) ) | (otherlv_4= '{' ( (lv_assignments_5_0= ruleReferenceValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleReferenceValue ) ) )* otherlv_8= '}' ) ) ) )
            // InternalOntoL.g:1802:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_assignments_3_0= ruleReferenceValue ) ) | (otherlv_4= '{' ( (lv_assignments_5_0= ruleReferenceValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleReferenceValue ) ) )* otherlv_8= '}' ) ) )
            {
            // InternalOntoL.g:1802:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_assignments_3_0= ruleReferenceValue ) ) | (otherlv_4= '{' ( (lv_assignments_5_0= ruleReferenceValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleReferenceValue ) ) )* otherlv_8= '}' ) ) )
            // InternalOntoL.g:1803:3: otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_assignments_3_0= ruleReferenceValue ) ) | (otherlv_4= '{' ( (lv_assignments_5_0= ruleReferenceValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleReferenceValue ) ) )* otherlv_8= '}' ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAssignmentAccess().getRefKeyword_0());
            		
            // InternalOntoL.g:1807:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:1808:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:1808:4: ( ruleQualifiedName )
            // InternalOntoL.g:1809:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReferenceAssignmentAccess().getReferenceReferenceCrossReference_1_0());
            				
            pushFollow(FOLLOW_33);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceAssignmentAccess().getEqualsSignKeyword_2());
            		
            // InternalOntoL.g:1827:3: ( ( (lv_assignments_3_0= ruleReferenceValue ) ) | (otherlv_4= '{' ( (lv_assignments_5_0= ruleReferenceValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleReferenceValue ) ) )* otherlv_8= '}' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            else if ( (LA45_0==12) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalOntoL.g:1828:4: ( (lv_assignments_3_0= ruleReferenceValue ) )
                    {
                    // InternalOntoL.g:1828:4: ( (lv_assignments_3_0= ruleReferenceValue ) )
                    // InternalOntoL.g:1829:5: (lv_assignments_3_0= ruleReferenceValue )
                    {
                    // InternalOntoL.g:1829:5: (lv_assignments_3_0= ruleReferenceValue )
                    // InternalOntoL.g:1830:6: lv_assignments_3_0= ruleReferenceValue
                    {

                    						newCompositeNode(grammarAccess.getReferenceAssignmentAccess().getAssignmentsReferenceValueParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_assignments_3_0=ruleReferenceValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceAssignmentRule());
                    						}
                    						add(
                    							current,
                    							"assignments",
                    							lv_assignments_3_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.ReferenceValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1848:4: (otherlv_4= '{' ( (lv_assignments_5_0= ruleReferenceValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleReferenceValue ) ) )* otherlv_8= '}' )
                    {
                    // InternalOntoL.g:1848:4: (otherlv_4= '{' ( (lv_assignments_5_0= ruleReferenceValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleReferenceValue ) ) )* otherlv_8= '}' )
                    // InternalOntoL.g:1849:5: otherlv_4= '{' ( (lv_assignments_5_0= ruleReferenceValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleReferenceValue ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getReferenceAssignmentAccess().getLeftCurlyBracketKeyword_3_1_0());
                    				
                    // InternalOntoL.g:1853:5: ( (lv_assignments_5_0= ruleReferenceValue ) )
                    // InternalOntoL.g:1854:6: (lv_assignments_5_0= ruleReferenceValue )
                    {
                    // InternalOntoL.g:1854:6: (lv_assignments_5_0= ruleReferenceValue )
                    // InternalOntoL.g:1855:7: lv_assignments_5_0= ruleReferenceValue
                    {

                    							newCompositeNode(grammarAccess.getReferenceAssignmentAccess().getAssignmentsReferenceValueParserRuleCall_3_1_1_0());
                    						
                    pushFollow(FOLLOW_36);
                    lv_assignments_5_0=ruleReferenceValue();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getReferenceAssignmentRule());
                    							}
                    							add(
                    								current,
                    								"assignments",
                    								lv_assignments_5_0,
                    								"br.ufes.inf.nemo.ontol.OntoL.ReferenceValue");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalOntoL.g:1872:5: (otherlv_6= ',' ( (lv_assignments_7_0= ruleReferenceValue ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==21) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalOntoL.g:1873:6: otherlv_6= ',' ( (lv_assignments_7_0= ruleReferenceValue ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_3); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getReferenceAssignmentAccess().getCommaKeyword_3_1_2_0());
                    	    					
                    	    // InternalOntoL.g:1877:6: ( (lv_assignments_7_0= ruleReferenceValue ) )
                    	    // InternalOntoL.g:1878:7: (lv_assignments_7_0= ruleReferenceValue )
                    	    {
                    	    // InternalOntoL.g:1878:7: (lv_assignments_7_0= ruleReferenceValue )
                    	    // InternalOntoL.g:1879:8: lv_assignments_7_0= ruleReferenceValue
                    	    {

                    	    								newCompositeNode(grammarAccess.getReferenceAssignmentAccess().getAssignmentsReferenceValueParserRuleCall_3_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_36);
                    	    lv_assignments_7_0=ruleReferenceValue();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getReferenceAssignmentRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"assignments",
                    	    									lv_assignments_7_0,
                    	    									"br.ufes.inf.nemo.ontol.OntoL.ReferenceValue");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getReferenceAssignmentAccess().getRightCurlyBracketKeyword_3_1_3());
                    				

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
    // $ANTLR end "ruleReferenceAssignment"


    // $ANTLR start "entryRuleDataValue"
    // InternalOntoL.g:1907:1: entryRuleDataValue returns [EObject current=null] : iv_ruleDataValue= ruleDataValue EOF ;
    public final EObject entryRuleDataValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataValue = null;


        try {
            // InternalOntoL.g:1907:50: (iv_ruleDataValue= ruleDataValue EOF )
            // InternalOntoL.g:1908:2: iv_ruleDataValue= ruleDataValue EOF
            {
             newCompositeNode(grammarAccess.getDataValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataValue=ruleDataValue();

            state._fsp--;

             current =iv_ruleDataValue; 
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
    // $ANTLR end "entryRuleDataValue"


    // $ANTLR start "ruleDataValue"
    // InternalOntoL.g:1914:1: ruleDataValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_NumberValue_1= ruleNumberValue | this_BooleanValue_2= ruleBooleanValue | this_NoneValue_3= ruleNoneValue ) ;
    public final EObject ruleDataValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_NumberValue_1 = null;

        EObject this_BooleanValue_2 = null;

        EObject this_NoneValue_3 = null;



        	enterRule();

        try {
            // InternalOntoL.g:1920:2: ( (this_StringValue_0= ruleStringValue | this_NumberValue_1= ruleNumberValue | this_BooleanValue_2= ruleBooleanValue | this_NoneValue_3= ruleNoneValue ) )
            // InternalOntoL.g:1921:2: (this_StringValue_0= ruleStringValue | this_NumberValue_1= ruleNumberValue | this_BooleanValue_2= ruleBooleanValue | this_NoneValue_3= ruleNoneValue )
            {
            // InternalOntoL.g:1921:2: (this_StringValue_0= ruleStringValue | this_NumberValue_1= ruleNumberValue | this_BooleanValue_2= ruleBooleanValue | this_NoneValue_3= ruleNoneValue )
            int alt46=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt46=1;
                }
                break;
            case RULE_INT:
            case 39:
                {
                alt46=2;
                }
                break;
            case 40:
            case 41:
                {
                alt46=3;
                }
                break;
            case 42:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalOntoL.g:1922:3: this_StringValue_0= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getDataValueAccess().getStringValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoL.g:1931:3: this_NumberValue_1= ruleNumberValue
                    {

                    			newCompositeNode(grammarAccess.getDataValueAccess().getNumberValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberValue_1=ruleNumberValue();

                    state._fsp--;


                    			current = this_NumberValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntoL.g:1940:3: this_BooleanValue_2= ruleBooleanValue
                    {

                    			newCompositeNode(grammarAccess.getDataValueAccess().getBooleanValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_2=ruleBooleanValue();

                    state._fsp--;


                    			current = this_BooleanValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOntoL.g:1949:3: this_NoneValue_3= ruleNoneValue
                    {

                    			newCompositeNode(grammarAccess.getDataValueAccess().getNoneValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_NoneValue_3=ruleNoneValue();

                    state._fsp--;


                    			current = this_NoneValue_3;
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
    // $ANTLR end "ruleDataValue"


    // $ANTLR start "entryRuleReferenceValue"
    // InternalOntoL.g:1961:1: entryRuleReferenceValue returns [EObject current=null] : iv_ruleReferenceValue= ruleReferenceValue EOF ;
    public final EObject entryRuleReferenceValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceValue = null;


        try {
            // InternalOntoL.g:1961:55: (iv_ruleReferenceValue= ruleReferenceValue EOF )
            // InternalOntoL.g:1962:2: iv_ruleReferenceValue= ruleReferenceValue EOF
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
    // InternalOntoL.g:1968:1: ruleReferenceValue returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleReferenceValue() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalOntoL.g:1974:2: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoL.g:1975:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoL.g:1975:2: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:1976:3: ( ruleQualifiedName )
            {
            // InternalOntoL.g:1976:3: ( ruleQualifiedName )
            // InternalOntoL.g:1977:4: ruleQualifiedName
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


    // $ANTLR start "entryRuleStringValue"
    // InternalOntoL.g:1994:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalOntoL.g:1994:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalOntoL.g:1995:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalOntoL.g:2001:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOntoL.g:2007:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalOntoL.g:2008:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalOntoL.g:2008:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalOntoL.g:2009:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalOntoL.g:2009:3: (lv_value_0_0= RULE_STRING )
            // InternalOntoL.g:2010:4: lv_value_0_0= RULE_STRING
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
    // InternalOntoL.g:2029:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalOntoL.g:2029:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalOntoL.g:2030:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalOntoL.g:2036:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:2042:2: ( ( (lv_value_0_0= ruleNUMBER ) ) )
            // InternalOntoL.g:2043:2: ( (lv_value_0_0= ruleNUMBER ) )
            {
            // InternalOntoL.g:2043:2: ( (lv_value_0_0= ruleNUMBER ) )
            // InternalOntoL.g:2044:3: (lv_value_0_0= ruleNUMBER )
            {
            // InternalOntoL.g:2044:3: (lv_value_0_0= ruleNUMBER )
            // InternalOntoL.g:2045:4: lv_value_0_0= ruleNUMBER
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
    // InternalOntoL.g:2065:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalOntoL.g:2065:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalOntoL.g:2066:2: iv_ruleNUMBER= ruleNUMBER EOF
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
    // InternalOntoL.g:2072:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalOntoL.g:2078:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalOntoL.g:2079:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalOntoL.g:2079:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalOntoL.g:2080:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalOntoL.g:2080:3: (kw= '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==39) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalOntoL.g:2081:4: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_7); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1());
            		
            // InternalOntoL.g:2094:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==16) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalOntoL.g:2095:4: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,16,FOLLOW_22); 

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
    // InternalOntoL.g:2112:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalOntoL.g:2112:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalOntoL.g:2113:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalOntoL.g:2119:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleBOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:2125:2: ( ( (lv_value_0_0= ruleBOOLEAN ) ) )
            // InternalOntoL.g:2126:2: ( (lv_value_0_0= ruleBOOLEAN ) )
            {
            // InternalOntoL.g:2126:2: ( (lv_value_0_0= ruleBOOLEAN ) )
            // InternalOntoL.g:2127:3: (lv_value_0_0= ruleBOOLEAN )
            {
            // InternalOntoL.g:2127:3: (lv_value_0_0= ruleBOOLEAN )
            // InternalOntoL.g:2128:4: lv_value_0_0= ruleBOOLEAN
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
    // InternalOntoL.g:2148:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // InternalOntoL.g:2148:47: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalOntoL.g:2149:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
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
    // InternalOntoL.g:2155:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOntoL.g:2161:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalOntoL.g:2162:2: (kw= 'true' | kw= 'false' )
            {
            // InternalOntoL.g:2162:2: (kw= 'true' | kw= 'false' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==40) ) {
                alt49=1;
            }
            else if ( (LA49_0==41) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalOntoL.g:2163:3: kw= 'true'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoL.g:2169:3: kw= 'false'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

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
    // InternalOntoL.g:2178:1: entryRuleNoneValue returns [EObject current=null] : iv_ruleNoneValue= ruleNoneValue EOF ;
    public final EObject entryRuleNoneValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoneValue = null;


        try {
            // InternalOntoL.g:2178:50: (iv_ruleNoneValue= ruleNoneValue EOF )
            // InternalOntoL.g:2179:2: iv_ruleNoneValue= ruleNoneValue EOF
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
    // InternalOntoL.g:2185:1: ruleNoneValue returns [EObject current=null] : ( () otherlv_1= 'none' ) ;
    public final EObject ruleNoneValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOntoL.g:2191:2: ( ( () otherlv_1= 'none' ) )
            // InternalOntoL.g:2192:2: ( () otherlv_1= 'none' )
            {
            // InternalOntoL.g:2192:2: ( () otherlv_1= 'none' )
            // InternalOntoL.g:2193:3: () otherlv_1= 'none'
            {
            // InternalOntoL.g:2193:3: ()
            // InternalOntoL.g:2194:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNoneValueAccess().getNoneValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_2); 

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
    // InternalOntoL.g:2208:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // InternalOntoL.g:2208:58: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // InternalOntoL.g:2209:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
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
    // InternalOntoL.g:2215:1: ruleGeneralizationSet returns [EObject current=null] : ( ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) | ( (lv_isComplete_1_0= 'complete' ) ) | ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ( (lv_isComplete_3_0= 'complete' ) ) ) | ( ( (lv_isComplete_4_0= 'complete' ) ) ( (lv_isDisjoint_5_0= 'disjoint' ) ) ) )? otherlv_6= 'genset' ( (lv_name_7_0= RULE_ID ) )? otherlv_8= 'general' ( ( ruleQualifiedName ) ) (otherlv_10= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_12= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )+ ) ;
    public final EObject ruleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token lv_isDisjoint_0_0=null;
        Token lv_isComplete_1_0=null;
        Token lv_isDisjoint_2_0=null;
        Token lv_isComplete_3_0=null;
        Token lv_isComplete_4_0=null;
        Token lv_isDisjoint_5_0=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalOntoL.g:2221:2: ( ( ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) | ( (lv_isComplete_1_0= 'complete' ) ) | ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ( (lv_isComplete_3_0= 'complete' ) ) ) | ( ( (lv_isComplete_4_0= 'complete' ) ) ( (lv_isDisjoint_5_0= 'disjoint' ) ) ) )? otherlv_6= 'genset' ( (lv_name_7_0= RULE_ID ) )? otherlv_8= 'general' ( ( ruleQualifiedName ) ) (otherlv_10= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_12= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )+ ) )
            // InternalOntoL.g:2222:2: ( ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) | ( (lv_isComplete_1_0= 'complete' ) ) | ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ( (lv_isComplete_3_0= 'complete' ) ) ) | ( ( (lv_isComplete_4_0= 'complete' ) ) ( (lv_isDisjoint_5_0= 'disjoint' ) ) ) )? otherlv_6= 'genset' ( (lv_name_7_0= RULE_ID ) )? otherlv_8= 'general' ( ( ruleQualifiedName ) ) (otherlv_10= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_12= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )+ )
            {
            // InternalOntoL.g:2222:2: ( ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) | ( (lv_isComplete_1_0= 'complete' ) ) | ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ( (lv_isComplete_3_0= 'complete' ) ) ) | ( ( (lv_isComplete_4_0= 'complete' ) ) ( (lv_isDisjoint_5_0= 'disjoint' ) ) ) )? otherlv_6= 'genset' ( (lv_name_7_0= RULE_ID ) )? otherlv_8= 'general' ( ( ruleQualifiedName ) ) (otherlv_10= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_12= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )+ )
            // InternalOntoL.g:2223:3: ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) | ( (lv_isComplete_1_0= 'complete' ) ) | ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ( (lv_isComplete_3_0= 'complete' ) ) ) | ( ( (lv_isComplete_4_0= 'complete' ) ) ( (lv_isDisjoint_5_0= 'disjoint' ) ) ) )? otherlv_6= 'genset' ( (lv_name_7_0= RULE_ID ) )? otherlv_8= 'general' ( ( ruleQualifiedName ) ) (otherlv_10= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_12= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )+
            {
            // InternalOntoL.g:2223:3: ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) | ( (lv_isComplete_1_0= 'complete' ) ) | ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ( (lv_isComplete_3_0= 'complete' ) ) ) | ( ( (lv_isComplete_4_0= 'complete' ) ) ( (lv_isDisjoint_5_0= 'disjoint' ) ) ) )?
            int alt50=5;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==43) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==45) ) {
                    alt50=1;
                }
                else if ( (LA50_1==44) ) {
                    alt50=3;
                }
            }
            else if ( (LA50_0==44) ) {
                int LA50_2 = input.LA(2);

                if ( (LA50_2==45) ) {
                    alt50=2;
                }
                else if ( (LA50_2==43) ) {
                    alt50=4;
                }
            }
            switch (alt50) {
                case 1 :
                    // InternalOntoL.g:2224:4: ( (lv_isDisjoint_0_0= 'disjoint' ) )
                    {
                    // InternalOntoL.g:2224:4: ( (lv_isDisjoint_0_0= 'disjoint' ) )
                    // InternalOntoL.g:2225:5: (lv_isDisjoint_0_0= 'disjoint' )
                    {
                    // InternalOntoL.g:2225:5: (lv_isDisjoint_0_0= 'disjoint' )
                    // InternalOntoL.g:2226:6: lv_isDisjoint_0_0= 'disjoint'
                    {
                    lv_isDisjoint_0_0=(Token)match(input,43,FOLLOW_38); 

                    						newLeafNode(lv_isDisjoint_0_0, grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    						}
                    						setWithLastConsumed(current, "isDisjoint", true, "disjoint");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:2239:4: ( (lv_isComplete_1_0= 'complete' ) )
                    {
                    // InternalOntoL.g:2239:4: ( (lv_isComplete_1_0= 'complete' ) )
                    // InternalOntoL.g:2240:5: (lv_isComplete_1_0= 'complete' )
                    {
                    // InternalOntoL.g:2240:5: (lv_isComplete_1_0= 'complete' )
                    // InternalOntoL.g:2241:6: lv_isComplete_1_0= 'complete'
                    {
                    lv_isComplete_1_0=(Token)match(input,44,FOLLOW_38); 

                    						newLeafNode(lv_isComplete_1_0, grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    						}
                    						setWithLastConsumed(current, "isComplete", true, "complete");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:2254:4: ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ( (lv_isComplete_3_0= 'complete' ) ) )
                    {
                    // InternalOntoL.g:2254:4: ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ( (lv_isComplete_3_0= 'complete' ) ) )
                    // InternalOntoL.g:2255:5: ( (lv_isDisjoint_2_0= 'disjoint' ) ) ( (lv_isComplete_3_0= 'complete' ) )
                    {
                    // InternalOntoL.g:2255:5: ( (lv_isDisjoint_2_0= 'disjoint' ) )
                    // InternalOntoL.g:2256:6: (lv_isDisjoint_2_0= 'disjoint' )
                    {
                    // InternalOntoL.g:2256:6: (lv_isDisjoint_2_0= 'disjoint' )
                    // InternalOntoL.g:2257:7: lv_isDisjoint_2_0= 'disjoint'
                    {
                    lv_isDisjoint_2_0=(Token)match(input,43,FOLLOW_39); 

                    							newLeafNode(lv_isDisjoint_2_0, grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    							}
                    							setWithLastConsumed(current, "isDisjoint", true, "disjoint");
                    						

                    }


                    }

                    // InternalOntoL.g:2269:5: ( (lv_isComplete_3_0= 'complete' ) )
                    // InternalOntoL.g:2270:6: (lv_isComplete_3_0= 'complete' )
                    {
                    // InternalOntoL.g:2270:6: (lv_isComplete_3_0= 'complete' )
                    // InternalOntoL.g:2271:7: lv_isComplete_3_0= 'complete'
                    {
                    lv_isComplete_3_0=(Token)match(input,44,FOLLOW_38); 

                    							newLeafNode(lv_isComplete_3_0, grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_2_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    							}
                    							setWithLastConsumed(current, "isComplete", true, "complete");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:2285:4: ( ( (lv_isComplete_4_0= 'complete' ) ) ( (lv_isDisjoint_5_0= 'disjoint' ) ) )
                    {
                    // InternalOntoL.g:2285:4: ( ( (lv_isComplete_4_0= 'complete' ) ) ( (lv_isDisjoint_5_0= 'disjoint' ) ) )
                    // InternalOntoL.g:2286:5: ( (lv_isComplete_4_0= 'complete' ) ) ( (lv_isDisjoint_5_0= 'disjoint' ) )
                    {
                    // InternalOntoL.g:2286:5: ( (lv_isComplete_4_0= 'complete' ) )
                    // InternalOntoL.g:2287:6: (lv_isComplete_4_0= 'complete' )
                    {
                    // InternalOntoL.g:2287:6: (lv_isComplete_4_0= 'complete' )
                    // InternalOntoL.g:2288:7: lv_isComplete_4_0= 'complete'
                    {
                    lv_isComplete_4_0=(Token)match(input,44,FOLLOW_40); 

                    							newLeafNode(lv_isComplete_4_0, grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_3_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    							}
                    							setWithLastConsumed(current, "isComplete", true, "complete");
                    						

                    }


                    }

                    // InternalOntoL.g:2300:5: ( (lv_isDisjoint_5_0= 'disjoint' ) )
                    // InternalOntoL.g:2301:6: (lv_isDisjoint_5_0= 'disjoint' )
                    {
                    // InternalOntoL.g:2301:6: (lv_isDisjoint_5_0= 'disjoint' )
                    // InternalOntoL.g:2302:7: lv_isDisjoint_5_0= 'disjoint'
                    {
                    lv_isDisjoint_5_0=(Token)match(input,43,FOLLOW_38); 

                    							newLeafNode(lv_isDisjoint_5_0, grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_3_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    							}
                    							setWithLastConsumed(current, "isDisjoint", true, "disjoint");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,45,FOLLOW_41); 

            			newLeafNode(otherlv_6, grammarAccess.getGeneralizationSetAccess().getGensetKeyword_1());
            		
            // InternalOntoL.g:2320:3: ( (lv_name_7_0= RULE_ID ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOntoL.g:2321:4: (lv_name_7_0= RULE_ID )
                    {
                    // InternalOntoL.g:2321:4: (lv_name_7_0= RULE_ID )
                    // InternalOntoL.g:2322:5: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_42); 

                    					newLeafNode(lv_name_7_0, grammarAccess.getGeneralizationSetAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_7_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getGeneralizationSetAccess().getGeneralKeyword_3());
            		
            // InternalOntoL.g:2342:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:2343:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:2343:4: ( ruleQualifiedName )
            // InternalOntoL.g:2344:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getGeneralOntoLClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_43);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoL.g:2358:3: (otherlv_10= 'categorizer' ( ( ruleQualifiedName ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==47) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalOntoL.g:2359:4: otherlv_10= 'categorizer' ( ( ruleQualifiedName ) )
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getGeneralizationSetAccess().getCategorizerKeyword_5_0());
                    			
                    // InternalOntoL.g:2363:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:2364:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:2364:5: ( ruleQualifiedName )
                    // InternalOntoL.g:2365:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGeneralizationSetAccess().getCategorizerOntoLClassCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getGeneralizationSetAccess().getSpecificsKeyword_6());
            		
            // InternalOntoL.g:2384:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:2385:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:2385:4: ( ruleQualifiedName )
            // InternalOntoL.g:2386:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getSpecificsOntoLClassCrossReference_7_0());
            				
            pushFollow(FOLLOW_45);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoL.g:2400:3: (otherlv_14= ',' ( ( ruleQualifiedName ) ) )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==21) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalOntoL.g:2401:4: otherlv_14= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_14=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_14, grammarAccess.getGeneralizationSetAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalOntoL.g:2405:4: ( ( ruleQualifiedName ) )
            	    // InternalOntoL.g:2406:5: ( ruleQualifiedName )
            	    {
            	    // InternalOntoL.g:2406:5: ( ruleQualifiedName )
            	    // InternalOntoL.g:2407:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getGeneralizationSetAccess().getSpecificsOntoLClassCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
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
    // InternalOntoL.g:2426:1: ruleCategorizationType returns [Enumerator current=null] : ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completecategorizes' ) | (enumLiteral_2= 'disjointcategorizes' ) | (enumLiteral_3= 'partitions' ) ) ;
    public final Enumerator ruleCategorizationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOntoL.g:2432:2: ( ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completecategorizes' ) | (enumLiteral_2= 'disjointcategorizes' ) | (enumLiteral_3= 'partitions' ) ) )
            // InternalOntoL.g:2433:2: ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completecategorizes' ) | (enumLiteral_2= 'disjointcategorizes' ) | (enumLiteral_3= 'partitions' ) )
            {
            // InternalOntoL.g:2433:2: ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completecategorizes' ) | (enumLiteral_2= 'disjointcategorizes' ) | (enumLiteral_3= 'partitions' ) )
            int alt54=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt54=1;
                }
                break;
            case 50:
                {
                alt54=2;
                }
                break;
            case 51:
                {
                alt54=3;
                }
                break;
            case 52:
                {
                alt54=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalOntoL.g:2434:3: (enumLiteral_0= 'categorizes' )
                    {
                    // InternalOntoL.g:2434:3: (enumLiteral_0= 'categorizes' )
                    // InternalOntoL.g:2435:4: enumLiteral_0= 'categorizes'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:2442:3: (enumLiteral_1= 'completecategorizes' )
                    {
                    // InternalOntoL.g:2442:3: (enumLiteral_1= 'completecategorizes' )
                    // InternalOntoL.g:2443:4: enumLiteral_1= 'completecategorizes'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:2450:3: (enumLiteral_2= 'disjointcategorizes' )
                    {
                    // InternalOntoL.g:2450:3: (enumLiteral_2= 'disjointcategorizes' )
                    // InternalOntoL.g:2451:4: enumLiteral_2= 'disjointcategorizes'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:2458:3: (enumLiteral_3= 'partitions' )
                    {
                    // InternalOntoL.g:2458:3: (enumLiteral_3= 'partitions' )
                    // InternalOntoL.g:2459:4: enumLiteral_3= 'partitions'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

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


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\17\1\uffff\1\36\2\4\2\uffff\2\20\2\uffff";
    static final String dfa_3s = "\1\43\1\uffff\1\43\2\4\2\uffff\2\46\2\uffff";
    static final String dfa_4s = "\1\uffff\1\5\3\uffff\1\1\1\3\2\uffff\1\2\1\4";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\15\uffff\1\2\1\3\4\uffff\1\4",
            "",
            "\1\5\4\uffff\1\6",
            "\1\7",
            "\1\10",
            "",
            "",
            "\1\11\3\uffff\1\5\21\uffff\1\11",
            "\1\12\3\uffff\1\6\21\uffff\1\12",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 552:4: ( ( (lv_attributes_4_0= ruleAttribute ) ) | ( (lv_attAssignments_5_0= ruleAttributeAssignment ) ) | ( (lv_references_6_0= ruleReference ) ) | ( (lv_refAssignments_7_0= ruleReferenceAssignment ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000380018CCA000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000101002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000201002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000840008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000860008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x001E000007100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x001E000007200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x001E000006200002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x001E000004200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001400000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000200002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000078000001060L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000078000000060L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000200000L});

}
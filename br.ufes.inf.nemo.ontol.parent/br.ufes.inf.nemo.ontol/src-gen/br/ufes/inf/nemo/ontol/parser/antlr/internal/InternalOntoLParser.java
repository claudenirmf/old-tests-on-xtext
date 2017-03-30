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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'include'", "';'", "'}'", "'.'", "'.*'", "'import'", "'individual'", "':'", "','", "'orderless'", "'class'", "'specializes'", "'subordinatedTo'", "'isPowertypeOf'", "'first-order'", "'order'", "'att'", "'['", "'..'", "']'", "'subsets'", "'regularity'", "'ref'", "'isOppositeTo'", "'*'", "'='", "'-'", "'true'", "'false'", "'none'", "'disjoint'", "'complete'", "'genset'", "'general'", "'categorizer'", "'specifics'", "'categorizes'", "'completeCategorizes'", "'disjointCategorizes'", "'partitions'", "'determinesMaxValue'", "'determinesMinValue'", "'determinesValue'", "'determinesPossibleValues'", "'determinesType'", "'determinesPossibleTypes'"
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

                        if ( (LA8_0==29) ) {
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
    // InternalOntoL.g:511:1: ruleOntoLClass returns [EObject current=null] : ( (this_OrderlessClass_0= ruleOrderlessClass | this_HOClass_1= ruleHOClass | this_FOClass_2= ruleFOClass ) (otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttribute ) ) | ( (lv_attributes_5_0= ruleRegularityAttribute ) ) | ( (lv_attAssignments_6_0= ruleAttributeAssignment ) ) | ( (lv_references_7_0= ruleReference ) ) | ( (lv_references_8_0= ruleRegularityReference ) ) | ( (lv_refAssignments_9_0= ruleReferenceAssignment ) ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleOntoLClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_10=null;
        EObject this_OrderlessClass_0 = null;

        EObject this_HOClass_1 = null;

        EObject this_FOClass_2 = null;

        EObject lv_attributes_4_0 = null;

        EObject lv_attributes_5_0 = null;

        EObject lv_attAssignments_6_0 = null;

        EObject lv_references_7_0 = null;

        EObject lv_references_8_0 = null;

        EObject lv_refAssignments_9_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:517:2: ( ( (this_OrderlessClass_0= ruleOrderlessClass | this_HOClass_1= ruleHOClass | this_FOClass_2= ruleFOClass ) (otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttribute ) ) | ( (lv_attributes_5_0= ruleRegularityAttribute ) ) | ( (lv_attAssignments_6_0= ruleAttributeAssignment ) ) | ( (lv_references_7_0= ruleReference ) ) | ( (lv_references_8_0= ruleRegularityReference ) ) | ( (lv_refAssignments_9_0= ruleReferenceAssignment ) ) )* otherlv_10= '}' )? ) )
            // InternalOntoL.g:518:2: ( (this_OrderlessClass_0= ruleOrderlessClass | this_HOClass_1= ruleHOClass | this_FOClass_2= ruleFOClass ) (otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttribute ) ) | ( (lv_attributes_5_0= ruleRegularityAttribute ) ) | ( (lv_attAssignments_6_0= ruleAttributeAssignment ) ) | ( (lv_references_7_0= ruleReference ) ) | ( (lv_references_8_0= ruleRegularityReference ) ) | ( (lv_refAssignments_9_0= ruleReferenceAssignment ) ) )* otherlv_10= '}' )? )
            {
            // InternalOntoL.g:518:2: ( (this_OrderlessClass_0= ruleOrderlessClass | this_HOClass_1= ruleHOClass | this_FOClass_2= ruleFOClass ) (otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttribute ) ) | ( (lv_attributes_5_0= ruleRegularityAttribute ) ) | ( (lv_attAssignments_6_0= ruleAttributeAssignment ) ) | ( (lv_references_7_0= ruleReference ) ) | ( (lv_references_8_0= ruleRegularityReference ) ) | ( (lv_refAssignments_9_0= ruleReferenceAssignment ) ) )* otherlv_10= '}' )? )
            // InternalOntoL.g:519:3: (this_OrderlessClass_0= ruleOrderlessClass | this_HOClass_1= ruleHOClass | this_FOClass_2= ruleFOClass ) (otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttribute ) ) | ( (lv_attributes_5_0= ruleRegularityAttribute ) ) | ( (lv_attAssignments_6_0= ruleAttributeAssignment ) ) | ( (lv_references_7_0= ruleReference ) ) | ( (lv_references_8_0= ruleRegularityReference ) ) | ( (lv_refAssignments_9_0= ruleReferenceAssignment ) ) )* otherlv_10= '}' )?
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

            // InternalOntoL.g:547:3: (otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttribute ) ) | ( (lv_attributes_5_0= ruleRegularityAttribute ) ) | ( (lv_attAssignments_6_0= ruleAttributeAssignment ) ) | ( (lv_references_7_0= ruleReference ) ) | ( (lv_references_8_0= ruleRegularityReference ) ) | ( (lv_refAssignments_9_0= ruleReferenceAssignment ) ) )* otherlv_10= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOntoL.g:548:4: otherlv_3= '{' ( ( (lv_attributes_4_0= ruleAttribute ) ) | ( (lv_attributes_5_0= ruleRegularityAttribute ) ) | ( (lv_attAssignments_6_0= ruleAttributeAssignment ) ) | ( (lv_references_7_0= ruleReference ) ) | ( (lv_references_8_0= ruleRegularityReference ) ) | ( (lv_refAssignments_9_0= ruleReferenceAssignment ) ) )* otherlv_10= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getOntoLClassAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalOntoL.g:552:4: ( ( (lv_attributes_4_0= ruleAttribute ) ) | ( (lv_attributes_5_0= ruleRegularityAttribute ) ) | ( (lv_attAssignments_6_0= ruleAttributeAssignment ) ) | ( (lv_references_7_0= ruleReference ) ) | ( (lv_references_8_0= ruleRegularityReference ) ) | ( (lv_refAssignments_9_0= ruleReferenceAssignment ) ) )*
                    loop11:
                    do {
                        int alt11=7;
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
                    	    // InternalOntoL.g:573:5: ( (lv_attributes_5_0= ruleRegularityAttribute ) )
                    	    {
                    	    // InternalOntoL.g:573:5: ( (lv_attributes_5_0= ruleRegularityAttribute ) )
                    	    // InternalOntoL.g:574:6: (lv_attributes_5_0= ruleRegularityAttribute )
                    	    {
                    	    // InternalOntoL.g:574:6: (lv_attributes_5_0= ruleRegularityAttribute )
                    	    // InternalOntoL.g:575:7: lv_attributes_5_0= ruleRegularityAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntoLClassAccess().getAttributesRegularityAttributeParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_attributes_5_0=ruleRegularityAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntoLClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_5_0,
                    	    								"br.ufes.inf.nemo.ontol.OntoL.RegularityAttribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalOntoL.g:593:5: ( (lv_attAssignments_6_0= ruleAttributeAssignment ) )
                    	    {
                    	    // InternalOntoL.g:593:5: ( (lv_attAssignments_6_0= ruleAttributeAssignment ) )
                    	    // InternalOntoL.g:594:6: (lv_attAssignments_6_0= ruleAttributeAssignment )
                    	    {
                    	    // InternalOntoL.g:594:6: (lv_attAssignments_6_0= ruleAttributeAssignment )
                    	    // InternalOntoL.g:595:7: lv_attAssignments_6_0= ruleAttributeAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntoLClassAccess().getAttAssignmentsAttributeAssignmentParserRuleCall_1_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_attAssignments_6_0=ruleAttributeAssignment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntoLClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attAssignments",
                    	    								lv_attAssignments_6_0,
                    	    								"br.ufes.inf.nemo.ontol.OntoL.AttributeAssignment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalOntoL.g:613:5: ( (lv_references_7_0= ruleReference ) )
                    	    {
                    	    // InternalOntoL.g:613:5: ( (lv_references_7_0= ruleReference ) )
                    	    // InternalOntoL.g:614:6: (lv_references_7_0= ruleReference )
                    	    {
                    	    // InternalOntoL.g:614:6: (lv_references_7_0= ruleReference )
                    	    // InternalOntoL.g:615:7: lv_references_7_0= ruleReference
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntoLClassAccess().getReferencesReferenceParserRuleCall_1_1_3_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_references_7_0=ruleReference();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntoLClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"references",
                    	    								lv_references_7_0,
                    	    								"br.ufes.inf.nemo.ontol.OntoL.Reference");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalOntoL.g:633:5: ( (lv_references_8_0= ruleRegularityReference ) )
                    	    {
                    	    // InternalOntoL.g:633:5: ( (lv_references_8_0= ruleRegularityReference ) )
                    	    // InternalOntoL.g:634:6: (lv_references_8_0= ruleRegularityReference )
                    	    {
                    	    // InternalOntoL.g:634:6: (lv_references_8_0= ruleRegularityReference )
                    	    // InternalOntoL.g:635:7: lv_references_8_0= ruleRegularityReference
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntoLClassAccess().getReferencesRegularityReferenceParserRuleCall_1_1_4_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_references_8_0=ruleRegularityReference();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntoLClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"references",
                    	    								lv_references_8_0,
                    	    								"br.ufes.inf.nemo.ontol.OntoL.RegularityReference");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalOntoL.g:653:5: ( (lv_refAssignments_9_0= ruleReferenceAssignment ) )
                    	    {
                    	    // InternalOntoL.g:653:5: ( (lv_refAssignments_9_0= ruleReferenceAssignment ) )
                    	    // InternalOntoL.g:654:6: (lv_refAssignments_9_0= ruleReferenceAssignment )
                    	    {
                    	    // InternalOntoL.g:654:6: (lv_refAssignments_9_0= ruleReferenceAssignment )
                    	    // InternalOntoL.g:655:7: lv_refAssignments_9_0= ruleReferenceAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntoLClassAccess().getRefAssignmentsReferenceAssignmentParserRuleCall_1_1_5_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_refAssignments_9_0=ruleReferenceAssignment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntoLClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"refAssignments",
                    	    								lv_refAssignments_9_0,
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

                    otherlv_10=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getOntoLClassAccess().getRightCurlyBracketKeyword_1_2());
                    			

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
    // InternalOntoL.g:682:1: entryRuleOrderlessClass returns [EObject current=null] : iv_ruleOrderlessClass= ruleOrderlessClass EOF ;
    public final EObject entryRuleOrderlessClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderlessClass = null;


        try {
            // InternalOntoL.g:682:55: (iv_ruleOrderlessClass= ruleOrderlessClass EOF )
            // InternalOntoL.g:683:2: iv_ruleOrderlessClass= ruleOrderlessClass EOF
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
    // InternalOntoL.g:689:1: ruleOrderlessClass returns [EObject current=null] : (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? ) ;
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
            // InternalOntoL.g:695:2: ( (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? ) )
            // InternalOntoL.g:696:2: (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? )
            {
            // InternalOntoL.g:696:2: (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? )
            // InternalOntoL.g:697:3: otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderlessClassAccess().getOrderlessKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderlessClassAccess().getClassKeyword_1());
            		
            // InternalOntoL.g:705:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOntoL.g:706:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOntoL.g:706:4: (lv_name_2_0= RULE_ID )
            // InternalOntoL.g:707:5: lv_name_2_0= RULE_ID
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

            // InternalOntoL.g:723:3: (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOntoL.g:724:4: otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getOrderlessClassAccess().getColonKeyword_3_0());
                    			
                    // InternalOntoL.g:728:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:729:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:729:5: ( ruleQualifiedName )
                    // InternalOntoL.g:730:6: ruleQualifiedName
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

                    // InternalOntoL.g:744:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==21) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalOntoL.g:745:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getOrderlessClassAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalOntoL.g:749:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:750:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:750:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:751:7: ruleQualifiedName
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

            // InternalOntoL.g:767:3: (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOntoL.g:768:4: otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getOrderlessClassAccess().getSpecializesKeyword_4_0());
                    			
                    // InternalOntoL.g:772:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:773:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:773:5: ( ruleQualifiedName )
                    // InternalOntoL.g:774:6: ruleQualifiedName
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

                    // InternalOntoL.g:788:4: (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalOntoL.g:789:5: otherlv_9= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getOrderlessClassAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalOntoL.g:793:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:794:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:794:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:795:7: ruleQualifiedName
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

            // InternalOntoL.g:811:3: (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOntoL.g:812:4: otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_11=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getOrderlessClassAccess().getSubordinatedToKeyword_5_0());
                    			
                    // InternalOntoL.g:816:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:817:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:817:5: ( ruleQualifiedName )
                    // InternalOntoL.g:818:6: ruleQualifiedName
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

                    // InternalOntoL.g:832:4: (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==21) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalOntoL.g:833:5: otherlv_13= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getOrderlessClassAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalOntoL.g:837:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:838:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:838:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:839:7: ruleQualifiedName
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

            // InternalOntoL.g:855:3: ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )?
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
                    // InternalOntoL.g:856:4: ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalOntoL.g:856:4: ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    // InternalOntoL.g:857:5: ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalOntoL.g:857:5: ( (lv_categorizationType_15_0= ruleCategorizationType ) )
                    // InternalOntoL.g:858:6: (lv_categorizationType_15_0= ruleCategorizationType )
                    {
                    // InternalOntoL.g:858:6: (lv_categorizationType_15_0= ruleCategorizationType )
                    // InternalOntoL.g:859:7: lv_categorizationType_15_0= ruleCategorizationType
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

                    // InternalOntoL.g:876:5: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:877:6: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:877:6: ( ruleQualifiedName )
                    // InternalOntoL.g:878:7: ruleQualifiedName
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
                    // InternalOntoL.g:894:4: (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalOntoL.g:894:4: (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) )
                    // InternalOntoL.g:895:5: otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) )
                    {
                    otherlv_17=(Token)match(input,26,FOLLOW_3); 

                    					newLeafNode(otherlv_17, grammarAccess.getOrderlessClassAccess().getIsPowertypeOfKeyword_6_1_0());
                    				
                    // InternalOntoL.g:899:5: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:900:6: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:900:6: ( ruleQualifiedName )
                    // InternalOntoL.g:901:7: ruleQualifiedName
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
    // InternalOntoL.g:921:1: entryRuleFOClass returns [EObject current=null] : iv_ruleFOClass= ruleFOClass EOF ;
    public final EObject entryRuleFOClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFOClass = null;


        try {
            // InternalOntoL.g:921:48: (iv_ruleFOClass= ruleFOClass EOF )
            // InternalOntoL.g:922:2: iv_ruleFOClass= ruleFOClass EOF
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
    // InternalOntoL.g:928:1: ruleFOClass returns [EObject current=null] : ( (otherlv_0= 'first-order' )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? ) ;
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
            // InternalOntoL.g:934:2: ( ( (otherlv_0= 'first-order' )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            // InternalOntoL.g:935:2: ( (otherlv_0= 'first-order' )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? )
            {
            // InternalOntoL.g:935:2: ( (otherlv_0= 'first-order' )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? )
            // InternalOntoL.g:936:3: (otherlv_0= 'first-order' )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )?
            {
            // InternalOntoL.g:936:3: (otherlv_0= 'first-order' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntoL.g:937:4: otherlv_0= 'first-order'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_0, grammarAccess.getFOClassAccess().getFirstOrderKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFOClassAccess().getClassKeyword_1());
            		
            // InternalOntoL.g:946:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOntoL.g:947:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOntoL.g:947:4: (lv_name_2_0= RULE_ID )
            // InternalOntoL.g:948:5: lv_name_2_0= RULE_ID
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

            // InternalOntoL.g:964:3: (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOntoL.g:965:4: otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getFOClassAccess().getColonKeyword_3_0());
                    			
                    // InternalOntoL.g:969:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:970:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:970:5: ( ruleQualifiedName )
                    // InternalOntoL.g:971:6: ruleQualifiedName
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

                    // InternalOntoL.g:985:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==21) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalOntoL.g:986:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFOClassAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalOntoL.g:990:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:991:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:991:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:992:7: ruleQualifiedName
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

            // InternalOntoL.g:1008:3: (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOntoL.g:1009:4: otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getFOClassAccess().getSpecializesKeyword_4_0());
                    			
                    // InternalOntoL.g:1013:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1014:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1014:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1015:6: ruleQualifiedName
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

                    // InternalOntoL.g:1029:4: (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==21) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalOntoL.g:1030:5: otherlv_9= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getFOClassAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalOntoL.g:1034:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:1035:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:1035:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:1036:7: ruleQualifiedName
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
    // InternalOntoL.g:1056:1: entryRuleHOClass returns [EObject current=null] : iv_ruleHOClass= ruleHOClass EOF ;
    public final EObject entryRuleHOClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHOClass = null;


        try {
            // InternalOntoL.g:1056:48: (iv_ruleHOClass= ruleHOClass EOF )
            // InternalOntoL.g:1057:2: iv_ruleHOClass= ruleHOClass EOF
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
    // InternalOntoL.g:1063:1: ruleHOClass returns [EObject current=null] : (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? ) ;
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
            // InternalOntoL.g:1069:2: ( (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? ) )
            // InternalOntoL.g:1070:2: (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? )
            {
            // InternalOntoL.g:1070:2: (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? )
            // InternalOntoL.g:1071:3: otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getHOClassAccess().getOrderKeyword_0());
            		
            // InternalOntoL.g:1075:3: ( (lv_order_1_0= RULE_INT ) )
            // InternalOntoL.g:1076:4: (lv_order_1_0= RULE_INT )
            {
            // InternalOntoL.g:1076:4: (lv_order_1_0= RULE_INT )
            // InternalOntoL.g:1077:5: lv_order_1_0= RULE_INT
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
            		
            // InternalOntoL.g:1097:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalOntoL.g:1098:4: (lv_name_3_0= RULE_ID )
            {
            // InternalOntoL.g:1098:4: (lv_name_3_0= RULE_ID )
            // InternalOntoL.g:1099:5: lv_name_3_0= RULE_ID
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

            // InternalOntoL.g:1115:3: (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOntoL.g:1116:4: otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getHOClassAccess().getColonKeyword_4_0());
                    			
                    // InternalOntoL.g:1120:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1121:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1121:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1122:6: ruleQualifiedName
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

                    // InternalOntoL.g:1136:4: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==21) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalOntoL.g:1137:5: otherlv_6= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getHOClassAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalOntoL.g:1141:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:1142:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:1142:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:1143:7: ruleQualifiedName
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

            // InternalOntoL.g:1159:3: (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOntoL.g:1160:4: otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getHOClassAccess().getSpecializesKeyword_5_0());
                    			
                    // InternalOntoL.g:1164:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1165:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1165:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1166:6: ruleQualifiedName
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

                    // InternalOntoL.g:1180:4: (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==21) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalOntoL.g:1181:5: otherlv_10= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_10=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getHOClassAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalOntoL.g:1185:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:1186:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:1186:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:1187:7: ruleQualifiedName
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

            // InternalOntoL.g:1203:3: (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOntoL.g:1204:4: otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_12=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getHOClassAccess().getSubordinatedToKeyword_6_0());
                    			
                    // InternalOntoL.g:1208:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1209:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1209:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1210:6: ruleQualifiedName
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

                    // InternalOntoL.g:1224:4: (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==21) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalOntoL.g:1225:5: otherlv_14= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_14=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getHOClassAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalOntoL.g:1229:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:1230:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:1230:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:1231:7: ruleQualifiedName
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

            // InternalOntoL.g:1247:3: ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )?
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
                    // InternalOntoL.g:1248:4: ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalOntoL.g:1248:4: ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    // InternalOntoL.g:1249:5: ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalOntoL.g:1249:5: ( (lv_categorizationType_16_0= ruleCategorizationType ) )
                    // InternalOntoL.g:1250:6: (lv_categorizationType_16_0= ruleCategorizationType )
                    {
                    // InternalOntoL.g:1250:6: (lv_categorizationType_16_0= ruleCategorizationType )
                    // InternalOntoL.g:1251:7: lv_categorizationType_16_0= ruleCategorizationType
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

                    // InternalOntoL.g:1268:5: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1269:6: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1269:6: ( ruleQualifiedName )
                    // InternalOntoL.g:1270:7: ruleQualifiedName
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
                    // InternalOntoL.g:1286:4: (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalOntoL.g:1286:4: (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) )
                    // InternalOntoL.g:1287:5: otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) )
                    {
                    otherlv_18=(Token)match(input,26,FOLLOW_3); 

                    					newLeafNode(otherlv_18, grammarAccess.getHOClassAccess().getIsPowertypeOfKeyword_7_1_0());
                    				
                    // InternalOntoL.g:1291:5: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1292:6: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1292:6: ( ruleQualifiedName )
                    // InternalOntoL.g:1293:7: ruleQualifiedName
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
    // InternalOntoL.g:1313:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalOntoL.g:1313:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalOntoL.g:1314:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalOntoL.g:1320:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'att' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( ruleQualifiedName ) ) (otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_lowerBound_4_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_6_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:1326:2: ( (otherlv_0= 'att' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( ruleQualifiedName ) ) (otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            // InternalOntoL.g:1327:2: (otherlv_0= 'att' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( ruleQualifiedName ) ) (otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? )
            {
            // InternalOntoL.g:1327:2: (otherlv_0= 'att' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( ruleQualifiedName ) ) (otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? )
            // InternalOntoL.g:1328:3: otherlv_0= 'att' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( ruleQualifiedName ) ) (otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttKeyword_0());
            		
            // InternalOntoL.g:1332:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntoL.g:1333:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntoL.g:1333:4: (lv_name_1_0= RULE_ID )
            // InternalOntoL.g:1334:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalOntoL.g:1354:3: (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOntoL.g:1355:4: otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalOntoL.g:1359:4: ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) )
                    // InternalOntoL.g:1360:5: (lv_lowerBound_4_0= ruleELEMENTBOUND )
                    {
                    // InternalOntoL.g:1360:5: (lv_lowerBound_4_0= ruleELEMENTBOUND )
                    // InternalOntoL.g:1361:6: lv_lowerBound_4_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getLowerBoundELEMENTBOUNDParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_lowerBound_4_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_4_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,31,FOLLOW_25); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_3_2());
                    			
                    // InternalOntoL.g:1382:4: ( (lv_upperBound_6_0= ruleELEMENTBOUND ) )
                    // InternalOntoL.g:1383:5: (lv_upperBound_6_0= ruleELEMENTBOUND )
                    {
                    // InternalOntoL.g:1383:5: (lv_upperBound_6_0= ruleELEMENTBOUND )
                    // InternalOntoL.g:1384:6: lv_upperBound_6_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getUpperBoundELEMENTBOUNDParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_upperBound_6_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_6_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalOntoL.g:1406:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:1407:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:1407:4: ( ruleQualifiedName )
            // InternalOntoL.g:1408:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getPropertyTypeOntoLClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_28);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoL.g:1422:3: (otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOntoL.g:1423:4: otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getSubsetsKeyword_5_0());
                    			
                    // InternalOntoL.g:1427:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1428:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1428:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1429:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:1443:4: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==21) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalOntoL.g:1444:5: otherlv_11= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_11=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalOntoL.g:1448:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:1449:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:1449:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:1450:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAttributeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
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


    // $ANTLR start "entryRuleRegularityAttribute"
    // InternalOntoL.g:1470:1: entryRuleRegularityAttribute returns [EObject current=null] : iv_ruleRegularityAttribute= ruleRegularityAttribute EOF ;
    public final EObject entryRuleRegularityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularityAttribute = null;


        try {
            // InternalOntoL.g:1470:60: (iv_ruleRegularityAttribute= ruleRegularityAttribute EOF )
            // InternalOntoL.g:1471:2: iv_ruleRegularityAttribute= ruleRegularityAttribute EOF
            {
             newCompositeNode(grammarAccess.getRegularityAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegularityAttribute=ruleRegularityAttribute();

            state._fsp--;

             current =iv_ruleRegularityAttribute; 
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
    // $ANTLR end "entryRuleRegularityAttribute"


    // $ANTLR start "ruleRegularityAttribute"
    // InternalOntoL.g:1477:1: ruleRegularityAttribute returns [EObject current=null] : ( ( (lv_regularity_0_0= 'regularity' ) ) otherlv_1= 'att' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ( ( (lv_regularityType_14_0= ruleRegularityAttributeType ) ) ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleRegularityAttribute() throws RecognitionException {
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

        Enumerator lv_regularityType_14_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:1483:2: ( ( ( (lv_regularity_0_0= 'regularity' ) ) otherlv_1= 'att' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ( ( (lv_regularityType_14_0= ruleRegularityAttributeType ) ) ( ( ruleQualifiedName ) ) )? ) )
            // InternalOntoL.g:1484:2: ( ( (lv_regularity_0_0= 'regularity' ) ) otherlv_1= 'att' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ( ( (lv_regularityType_14_0= ruleRegularityAttributeType ) ) ( ( ruleQualifiedName ) ) )? )
            {
            // InternalOntoL.g:1484:2: ( ( (lv_regularity_0_0= 'regularity' ) ) otherlv_1= 'att' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ( ( (lv_regularityType_14_0= ruleRegularityAttributeType ) ) ( ( ruleQualifiedName ) ) )? )
            // InternalOntoL.g:1485:3: ( (lv_regularity_0_0= 'regularity' ) ) otherlv_1= 'att' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ( ( (lv_regularityType_14_0= ruleRegularityAttributeType ) ) ( ( ruleQualifiedName ) ) )?
            {
            // InternalOntoL.g:1485:3: ( (lv_regularity_0_0= 'regularity' ) )
            // InternalOntoL.g:1486:4: (lv_regularity_0_0= 'regularity' )
            {
            // InternalOntoL.g:1486:4: (lv_regularity_0_0= 'regularity' )
            // InternalOntoL.g:1487:5: lv_regularity_0_0= 'regularity'
            {
            lv_regularity_0_0=(Token)match(input,34,FOLLOW_29); 

            					newLeafNode(lv_regularity_0_0, grammarAccess.getRegularityAttributeAccess().getRegularityRegularityKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularityAttributeRule());
            					}
            					setWithLastConsumed(current, "regularity", true, "regularity");
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRegularityAttributeAccess().getAttKeyword_1());
            		
            // InternalOntoL.g:1503:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOntoL.g:1504:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOntoL.g:1504:4: (lv_name_2_0= RULE_ID )
            // InternalOntoL.g:1505:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRegularityAttributeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularityAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getRegularityAttributeAccess().getColonKeyword_3());
            		
            // InternalOntoL.g:1525:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==30) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOntoL.g:1526:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getRegularityAttributeAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalOntoL.g:1530:4: ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) )
                    // InternalOntoL.g:1531:5: (lv_lowerBound_5_0= ruleELEMENTBOUND )
                    {
                    // InternalOntoL.g:1531:5: (lv_lowerBound_5_0= ruleELEMENTBOUND )
                    // InternalOntoL.g:1532:6: lv_lowerBound_5_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getLowerBoundELEMENTBOUNDParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_lowerBound_5_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegularityAttributeRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_5_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,31,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getRegularityAttributeAccess().getFullStopFullStopKeyword_4_2());
                    			
                    // InternalOntoL.g:1553:4: ( (lv_upperBound_7_0= ruleELEMENTBOUND ) )
                    // InternalOntoL.g:1554:5: (lv_upperBound_7_0= ruleELEMENTBOUND )
                    {
                    // InternalOntoL.g:1554:5: (lv_upperBound_7_0= ruleELEMENTBOUND )
                    // InternalOntoL.g:1555:6: lv_upperBound_7_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getUpperBoundELEMENTBOUNDParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_upperBound_7_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegularityAttributeRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_7_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getRegularityAttributeAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalOntoL.g:1577:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:1578:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:1578:4: ( ruleQualifiedName )
            // InternalOntoL.g:1579:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularityAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRegularityAttributeAccess().getPropertyTypeOntoLClassCrossReference_5_0());
            				
            pushFollow(FOLLOW_30);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoL.g:1593:3: (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOntoL.g:1594:4: otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getRegularityAttributeAccess().getSubsetsKeyword_6_0());
                    			
                    // InternalOntoL.g:1598:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1599:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1599:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1600:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularityAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:1614:4: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==21) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalOntoL.g:1615:5: otherlv_12= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_12=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRegularityAttributeAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalOntoL.g:1619:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:1620:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:1620:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:1621:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRegularityAttributeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
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

            // InternalOntoL.g:1637:3: ( ( (lv_regularityType_14_0= ruleRegularityAttributeType ) ) ( ( ruleQualifiedName ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=53 && LA38_0<=58)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOntoL.g:1638:4: ( (lv_regularityType_14_0= ruleRegularityAttributeType ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalOntoL.g:1638:4: ( (lv_regularityType_14_0= ruleRegularityAttributeType ) )
                    // InternalOntoL.g:1639:5: (lv_regularityType_14_0= ruleRegularityAttributeType )
                    {
                    // InternalOntoL.g:1639:5: (lv_regularityType_14_0= ruleRegularityAttributeType )
                    // InternalOntoL.g:1640:6: lv_regularityType_14_0= ruleRegularityAttributeType
                    {

                    						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getRegularityTypeRegularityAttributeTypeEnumRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_regularityType_14_0=ruleRegularityAttributeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegularityAttributeRule());
                    						}
                    						set(
                    							current,
                    							"regularityType",
                    							lv_regularityType_14_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.RegularityAttributeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:1657:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1658:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1658:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1659:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularityAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getRegulatedPropertyAttributeCrossReference_7_1_0());
                    					
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
    // $ANTLR end "ruleRegularityAttribute"


    // $ANTLR start "entryRuleReference"
    // InternalOntoL.g:1678:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalOntoL.g:1678:50: (iv_ruleReference= ruleReference EOF )
            // InternalOntoL.g:1679:2: iv_ruleReference= ruleReference EOF
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
    // InternalOntoL.g:1685:1: ruleReference returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( ruleQualifiedName ) ) (otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_lowerBound_4_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_6_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:1691:2: ( (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( ruleQualifiedName ) ) (otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) )
            // InternalOntoL.g:1692:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( ruleQualifiedName ) ) (otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? )
            {
            // InternalOntoL.g:1692:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( ruleQualifiedName ) ) (otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? )
            // InternalOntoL.g:1693:3: otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( ruleQualifiedName ) ) (otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= 'isOppositeTo' ( ( ruleQualifiedName ) ) )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getRefKeyword_0());
            		
            // InternalOntoL.g:1697:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntoL.g:1698:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntoL.g:1698:4: (lv_name_1_0= RULE_ID )
            // InternalOntoL.g:1699:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getColonKeyword_2());
            		
            // InternalOntoL.g:1719:3: (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==30) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOntoL.g:1720:4: otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalOntoL.g:1724:4: ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) )
                    // InternalOntoL.g:1725:5: (lv_lowerBound_4_0= ruleELEMENTBOUND )
                    {
                    // InternalOntoL.g:1725:5: (lv_lowerBound_4_0= ruleELEMENTBOUND )
                    // InternalOntoL.g:1726:6: lv_lowerBound_4_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getLowerBoundELEMENTBOUNDParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_lowerBound_4_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_4_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,31,FOLLOW_25); 

                    				newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getFullStopFullStopKeyword_3_2());
                    			
                    // InternalOntoL.g:1747:4: ( (lv_upperBound_6_0= ruleELEMENTBOUND ) )
                    // InternalOntoL.g:1748:5: (lv_upperBound_6_0= ruleELEMENTBOUND )
                    {
                    // InternalOntoL.g:1748:5: (lv_upperBound_6_0= ruleELEMENTBOUND )
                    // InternalOntoL.g:1749:6: lv_upperBound_6_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getUpperBoundELEMENTBOUNDParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_upperBound_6_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_6_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalOntoL.g:1771:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:1772:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:1772:4: ( ruleQualifiedName )
            // InternalOntoL.g:1773:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReferenceAccess().getPropertyTypeOntoLClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_32);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoL.g:1787:3: (otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==33) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalOntoL.g:1788:4: otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getReferenceAccess().getSubsetsKeyword_5_0());
                    			
                    // InternalOntoL.g:1792:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1793:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1793:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1794:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:1808:4: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==21) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalOntoL.g:1809:5: otherlv_11= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_11=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getReferenceAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalOntoL.g:1813:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:1814:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:1814:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:1815:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getReferenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntoL.g:1831:3: (otherlv_13= 'isOppositeTo' ( ( ruleQualifiedName ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOntoL.g:1832:4: otherlv_13= 'isOppositeTo' ( ( ruleQualifiedName ) )
                    {
                    otherlv_13=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getReferenceAccess().getIsOppositeToKeyword_6_0());
                    			
                    // InternalOntoL.g:1836:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1837:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1837:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1838:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceAccess().getOppositeToReferenceCrossReference_6_1_0());
                    					
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


    // $ANTLR start "entryRuleRegularityReference"
    // InternalOntoL.g:1857:1: entryRuleRegularityReference returns [EObject current=null] : iv_ruleRegularityReference= ruleRegularityReference EOF ;
    public final EObject entryRuleRegularityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularityReference = null;


        try {
            // InternalOntoL.g:1857:60: (iv_ruleRegularityReference= ruleRegularityReference EOF )
            // InternalOntoL.g:1858:2: iv_ruleRegularityReference= ruleRegularityReference EOF
            {
             newCompositeNode(grammarAccess.getRegularityReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegularityReference=ruleRegularityReference();

            state._fsp--;

             current =iv_ruleRegularityReference; 
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
    // $ANTLR end "entryRuleRegularityReference"


    // $ANTLR start "ruleRegularityReference"
    // InternalOntoL.g:1864:1: ruleRegularityReference returns [EObject current=null] : ( ( (lv_regularity_0_0= 'regularity' ) ) otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( ( (lv_regularityType_16_0= ruleRegularityReferenceType ) ) ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleRegularityReference() throws RecognitionException {
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

        Enumerator lv_regularityType_16_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:1870:2: ( ( ( (lv_regularity_0_0= 'regularity' ) ) otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( ( (lv_regularityType_16_0= ruleRegularityReferenceType ) ) ( ( ruleQualifiedName ) ) )? ) )
            // InternalOntoL.g:1871:2: ( ( (lv_regularity_0_0= 'regularity' ) ) otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( ( (lv_regularityType_16_0= ruleRegularityReferenceType ) ) ( ( ruleQualifiedName ) ) )? )
            {
            // InternalOntoL.g:1871:2: ( ( (lv_regularity_0_0= 'regularity' ) ) otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( ( (lv_regularityType_16_0= ruleRegularityReferenceType ) ) ( ( ruleQualifiedName ) ) )? )
            // InternalOntoL.g:1872:3: ( (lv_regularity_0_0= 'regularity' ) ) otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( ( (lv_regularityType_16_0= ruleRegularityReferenceType ) ) ( ( ruleQualifiedName ) ) )?
            {
            // InternalOntoL.g:1872:3: ( (lv_regularity_0_0= 'regularity' ) )
            // InternalOntoL.g:1873:4: (lv_regularity_0_0= 'regularity' )
            {
            // InternalOntoL.g:1873:4: (lv_regularity_0_0= 'regularity' )
            // InternalOntoL.g:1874:5: lv_regularity_0_0= 'regularity'
            {
            lv_regularity_0_0=(Token)match(input,34,FOLLOW_34); 

            					newLeafNode(lv_regularity_0_0, grammarAccess.getRegularityReferenceAccess().getRegularityRegularityKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularityReferenceRule());
            					}
            					setWithLastConsumed(current, "regularity", true, "regularity");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRegularityReferenceAccess().getRefKeyword_1());
            		
            // InternalOntoL.g:1890:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOntoL.g:1891:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOntoL.g:1891:4: (lv_name_2_0= RULE_ID )
            // InternalOntoL.g:1892:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRegularityReferenceAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularityReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getRegularityReferenceAccess().getColonKeyword_3());
            		
            // InternalOntoL.g:1912:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==30) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalOntoL.g:1913:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getRegularityReferenceAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalOntoL.g:1917:4: ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) )
                    // InternalOntoL.g:1918:5: (lv_lowerBound_5_0= ruleELEMENTBOUND )
                    {
                    // InternalOntoL.g:1918:5: (lv_lowerBound_5_0= ruleELEMENTBOUND )
                    // InternalOntoL.g:1919:6: lv_lowerBound_5_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getLowerBoundELEMENTBOUNDParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_lowerBound_5_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegularityReferenceRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_5_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,31,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getRegularityReferenceAccess().getFullStopFullStopKeyword_4_2());
                    			
                    // InternalOntoL.g:1940:4: ( (lv_upperBound_7_0= ruleELEMENTBOUND ) )
                    // InternalOntoL.g:1941:5: (lv_upperBound_7_0= ruleELEMENTBOUND )
                    {
                    // InternalOntoL.g:1941:5: (lv_upperBound_7_0= ruleELEMENTBOUND )
                    // InternalOntoL.g:1942:6: lv_upperBound_7_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getUpperBoundELEMENTBOUNDParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_upperBound_7_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegularityReferenceRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_7_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getRegularityReferenceAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalOntoL.g:1964:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:1965:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:1965:4: ( ruleQualifiedName )
            // InternalOntoL.g:1966:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularityReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRegularityReferenceAccess().getPropertyTypeOntoLClassCrossReference_5_0());
            				
            pushFollow(FOLLOW_35);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoL.g:1980:3: (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==33) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOntoL.g:1981:4: otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getRegularityReferenceAccess().getSubsetsKeyword_6_0());
                    			
                    // InternalOntoL.g:1985:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:1986:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:1986:5: ( ruleQualifiedName )
                    // InternalOntoL.g:1987:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularityReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:2001:4: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==21) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalOntoL.g:2002:5: otherlv_12= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_12=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRegularityReferenceAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalOntoL.g:2006:5: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:2007:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:2007:6: ( ruleQualifiedName )
                    	    // InternalOntoL.g:2008:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRegularityReferenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOntoL.g:2024:3: (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==36) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalOntoL.g:2025:4: otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) )
                    {
                    otherlv_14=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getRegularityReferenceAccess().getIsOppositeToKeyword_7_0());
                    			
                    // InternalOntoL.g:2029:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:2030:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:2030:5: ( ruleQualifiedName )
                    // InternalOntoL.g:2031:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularityReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getOppositeToReferenceCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntoL.g:2046:3: ( ( (lv_regularityType_16_0= ruleRegularityReferenceType ) ) ( ( ruleQualifiedName ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=55 && LA47_0<=58)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalOntoL.g:2047:4: ( (lv_regularityType_16_0= ruleRegularityReferenceType ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalOntoL.g:2047:4: ( (lv_regularityType_16_0= ruleRegularityReferenceType ) )
                    // InternalOntoL.g:2048:5: (lv_regularityType_16_0= ruleRegularityReferenceType )
                    {
                    // InternalOntoL.g:2048:5: (lv_regularityType_16_0= ruleRegularityReferenceType )
                    // InternalOntoL.g:2049:6: lv_regularityType_16_0= ruleRegularityReferenceType
                    {

                    						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getRegularityTypeRegularityReferenceTypeEnumRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_regularityType_16_0=ruleRegularityReferenceType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegularityReferenceRule());
                    						}
                    						set(
                    							current,
                    							"regularityType",
                    							lv_regularityType_16_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.RegularityReferenceType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoL.g:2066:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:2067:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:2067:5: ( ruleQualifiedName )
                    // InternalOntoL.g:2068:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularityReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getRegulatedPropertyReferenceCrossReference_8_1_0());
                    					
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
    // $ANTLR end "ruleRegularityReference"


    // $ANTLR start "entryRuleELEMENTBOUND"
    // InternalOntoL.g:2087:1: entryRuleELEMENTBOUND returns [String current=null] : iv_ruleELEMENTBOUND= ruleELEMENTBOUND EOF ;
    public final String entryRuleELEMENTBOUND() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELEMENTBOUND = null;


        try {
            // InternalOntoL.g:2087:52: (iv_ruleELEMENTBOUND= ruleELEMENTBOUND EOF )
            // InternalOntoL.g:2088:2: iv_ruleELEMENTBOUND= ruleELEMENTBOUND EOF
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
    // InternalOntoL.g:2094:1: ruleELEMENTBOUND returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELEMENTBOUND() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOntoL.g:2100:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalOntoL.g:2101:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalOntoL.g:2101:2: (kw= '*' | this_INT_1= RULE_INT )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==37) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_INT) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalOntoL.g:2102:3: kw= '*'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getELEMENTBOUNDAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoL.g:2108:3: this_INT_1= RULE_INT
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
    // InternalOntoL.g:2119:1: entryRuleAttributeAssignment returns [EObject current=null] : iv_ruleAttributeAssignment= ruleAttributeAssignment EOF ;
    public final EObject entryRuleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeAssignment = null;


        try {
            // InternalOntoL.g:2119:60: (iv_ruleAttributeAssignment= ruleAttributeAssignment EOF )
            // InternalOntoL.g:2120:2: iv_ruleAttributeAssignment= ruleAttributeAssignment EOF
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
    // InternalOntoL.g:2126:1: ruleAttributeAssignment returns [EObject current=null] : (otherlv_0= 'att' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_assignments_3_0= ruleDataValue ) ) | (otherlv_4= '{' ( (lv_assignments_5_0= ruleDataValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )* otherlv_8= '}' ) ) ) ;
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
            // InternalOntoL.g:2132:2: ( (otherlv_0= 'att' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_assignments_3_0= ruleDataValue ) ) | (otherlv_4= '{' ( (lv_assignments_5_0= ruleDataValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )* otherlv_8= '}' ) ) ) )
            // InternalOntoL.g:2133:2: (otherlv_0= 'att' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_assignments_3_0= ruleDataValue ) ) | (otherlv_4= '{' ( (lv_assignments_5_0= ruleDataValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )* otherlv_8= '}' ) ) )
            {
            // InternalOntoL.g:2133:2: (otherlv_0= 'att' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_assignments_3_0= ruleDataValue ) ) | (otherlv_4= '{' ( (lv_assignments_5_0= ruleDataValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )* otherlv_8= '}' ) ) )
            // InternalOntoL.g:2134:3: otherlv_0= 'att' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_assignments_3_0= ruleDataValue ) ) | (otherlv_4= '{' ( (lv_assignments_5_0= ruleDataValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )* otherlv_8= '}' ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAssignmentAccess().getAttKeyword_0());
            		
            // InternalOntoL.g:2138:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:2139:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:2139:4: ( ruleQualifiedName )
            // InternalOntoL.g:2140:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0());
            				
            pushFollow(FOLLOW_38);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAssignmentAccess().getEqualsSignKeyword_2());
            		
            // InternalOntoL.g:2158:3: ( ( (lv_assignments_3_0= ruleDataValue ) ) | (otherlv_4= '{' ( (lv_assignments_5_0= ruleDataValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )* otherlv_8= '}' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_STRING)||LA50_0==30||(LA50_0>=39 && LA50_0<=42)) ) {
                alt50=1;
            }
            else if ( (LA50_0==12) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalOntoL.g:2159:4: ( (lv_assignments_3_0= ruleDataValue ) )
                    {
                    // InternalOntoL.g:2159:4: ( (lv_assignments_3_0= ruleDataValue ) )
                    // InternalOntoL.g:2160:5: (lv_assignments_3_0= ruleDataValue )
                    {
                    // InternalOntoL.g:2160:5: (lv_assignments_3_0= ruleDataValue )
                    // InternalOntoL.g:2161:6: lv_assignments_3_0= ruleDataValue
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
                    // InternalOntoL.g:2179:4: (otherlv_4= '{' ( (lv_assignments_5_0= ruleDataValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )* otherlv_8= '}' )
                    {
                    // InternalOntoL.g:2179:4: (otherlv_4= '{' ( (lv_assignments_5_0= ruleDataValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )* otherlv_8= '}' )
                    // InternalOntoL.g:2180:5: otherlv_4= '{' ( (lv_assignments_5_0= ruleDataValue ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_40); 

                    					newLeafNode(otherlv_4, grammarAccess.getAttributeAssignmentAccess().getLeftCurlyBracketKeyword_3_1_0());
                    				
                    // InternalOntoL.g:2184:5: ( (lv_assignments_5_0= ruleDataValue ) )
                    // InternalOntoL.g:2185:6: (lv_assignments_5_0= ruleDataValue )
                    {
                    // InternalOntoL.g:2185:6: (lv_assignments_5_0= ruleDataValue )
                    // InternalOntoL.g:2186:7: lv_assignments_5_0= ruleDataValue
                    {

                    							newCompositeNode(grammarAccess.getAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_3_1_1_0());
                    						
                    pushFollow(FOLLOW_41);
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

                    // InternalOntoL.g:2203:5: (otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==21) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalOntoL.g:2204:6: otherlv_6= ',' ( (lv_assignments_7_0= ruleDataValue ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_40); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getAttributeAssignmentAccess().getCommaKeyword_3_1_2_0());
                    	    					
                    	    // InternalOntoL.g:2208:6: ( (lv_assignments_7_0= ruleDataValue ) )
                    	    // InternalOntoL.g:2209:7: (lv_assignments_7_0= ruleDataValue )
                    	    {
                    	    // InternalOntoL.g:2209:7: (lv_assignments_7_0= ruleDataValue )
                    	    // InternalOntoL.g:2210:8: lv_assignments_7_0= ruleDataValue
                    	    {

                    	    								newCompositeNode(grammarAccess.getAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_3_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop49;
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


    // $ANTLR start "entryRuleSimpleAttributeAssignment"
    // InternalOntoL.g:2238:1: entryRuleSimpleAttributeAssignment returns [EObject current=null] : iv_ruleSimpleAttributeAssignment= ruleSimpleAttributeAssignment EOF ;
    public final EObject entryRuleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAttributeAssignment = null;


        try {
            // InternalOntoL.g:2238:66: (iv_ruleSimpleAttributeAssignment= ruleSimpleAttributeAssignment EOF )
            // InternalOntoL.g:2239:2: iv_ruleSimpleAttributeAssignment= ruleSimpleAttributeAssignment EOF
            {
             newCompositeNode(grammarAccess.getSimpleAttributeAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleAttributeAssignment=ruleSimpleAttributeAssignment();

            state._fsp--;

             current =iv_ruleSimpleAttributeAssignment; 
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
    // $ANTLR end "entryRuleSimpleAttributeAssignment"


    // $ANTLR start "ruleSimpleAttributeAssignment"
    // InternalOntoL.g:2245:1: ruleSimpleAttributeAssignment returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_assignments_2_0= ruleDataValue ) ) | (otherlv_3= '{' ( (lv_assignments_4_0= ruleDataValue ) ) (otherlv_5= ',' ( (lv_assignments_6_0= ruleDataValue ) ) )* otherlv_7= '}' ) ) ) ;
    public final EObject ruleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_assignments_2_0 = null;

        EObject lv_assignments_4_0 = null;

        EObject lv_assignments_6_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:2251:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_assignments_2_0= ruleDataValue ) ) | (otherlv_3= '{' ( (lv_assignments_4_0= ruleDataValue ) ) (otherlv_5= ',' ( (lv_assignments_6_0= ruleDataValue ) ) )* otherlv_7= '}' ) ) ) )
            // InternalOntoL.g:2252:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_assignments_2_0= ruleDataValue ) ) | (otherlv_3= '{' ( (lv_assignments_4_0= ruleDataValue ) ) (otherlv_5= ',' ( (lv_assignments_6_0= ruleDataValue ) ) )* otherlv_7= '}' ) ) )
            {
            // InternalOntoL.g:2252:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_assignments_2_0= ruleDataValue ) ) | (otherlv_3= '{' ( (lv_assignments_4_0= ruleDataValue ) ) (otherlv_5= ',' ( (lv_assignments_6_0= ruleDataValue ) ) )* otherlv_7= '}' ) ) )
            // InternalOntoL.g:2253:3: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_assignments_2_0= ruleDataValue ) ) | (otherlv_3= '{' ( (lv_assignments_4_0= ruleDataValue ) ) (otherlv_5= ',' ( (lv_assignments_6_0= ruleDataValue ) ) )* otherlv_7= '}' ) )
            {
            // InternalOntoL.g:2253:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:2254:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:2254:4: ( ruleQualifiedName )
            // InternalOntoL.g:2255:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleAttributeAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSimpleAttributeAssignmentAccess().getAttributeAttributeCrossReference_0_0());
            				
            pushFollow(FOLLOW_38);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleAttributeAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalOntoL.g:2273:3: ( ( (lv_assignments_2_0= ruleDataValue ) ) | (otherlv_3= '{' ( (lv_assignments_4_0= ruleDataValue ) ) (otherlv_5= ',' ( (lv_assignments_6_0= ruleDataValue ) ) )* otherlv_7= '}' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_STRING)||LA52_0==30||(LA52_0>=39 && LA52_0<=42)) ) {
                alt52=1;
            }
            else if ( (LA52_0==12) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalOntoL.g:2274:4: ( (lv_assignments_2_0= ruleDataValue ) )
                    {
                    // InternalOntoL.g:2274:4: ( (lv_assignments_2_0= ruleDataValue ) )
                    // InternalOntoL.g:2275:5: (lv_assignments_2_0= ruleDataValue )
                    {
                    // InternalOntoL.g:2275:5: (lv_assignments_2_0= ruleDataValue )
                    // InternalOntoL.g:2276:6: lv_assignments_2_0= ruleDataValue
                    {

                    						newCompositeNode(grammarAccess.getSimpleAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_assignments_2_0=ruleDataValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleAttributeAssignmentRule());
                    						}
                    						add(
                    							current,
                    							"assignments",
                    							lv_assignments_2_0,
                    							"br.ufes.inf.nemo.ontol.OntoL.DataValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:2294:4: (otherlv_3= '{' ( (lv_assignments_4_0= ruleDataValue ) ) (otherlv_5= ',' ( (lv_assignments_6_0= ruleDataValue ) ) )* otherlv_7= '}' )
                    {
                    // InternalOntoL.g:2294:4: (otherlv_3= '{' ( (lv_assignments_4_0= ruleDataValue ) ) (otherlv_5= ',' ( (lv_assignments_6_0= ruleDataValue ) ) )* otherlv_7= '}' )
                    // InternalOntoL.g:2295:5: otherlv_3= '{' ( (lv_assignments_4_0= ruleDataValue ) ) (otherlv_5= ',' ( (lv_assignments_6_0= ruleDataValue ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_40); 

                    					newLeafNode(otherlv_3, grammarAccess.getSimpleAttributeAssignmentAccess().getLeftCurlyBracketKeyword_2_1_0());
                    				
                    // InternalOntoL.g:2299:5: ( (lv_assignments_4_0= ruleDataValue ) )
                    // InternalOntoL.g:2300:6: (lv_assignments_4_0= ruleDataValue )
                    {
                    // InternalOntoL.g:2300:6: (lv_assignments_4_0= ruleDataValue )
                    // InternalOntoL.g:2301:7: lv_assignments_4_0= ruleDataValue
                    {

                    							newCompositeNode(grammarAccess.getSimpleAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_41);
                    lv_assignments_4_0=ruleDataValue();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSimpleAttributeAssignmentRule());
                    							}
                    							add(
                    								current,
                    								"assignments",
                    								lv_assignments_4_0,
                    								"br.ufes.inf.nemo.ontol.OntoL.DataValue");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalOntoL.g:2318:5: (otherlv_5= ',' ( (lv_assignments_6_0= ruleDataValue ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==21) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalOntoL.g:2319:6: otherlv_5= ',' ( (lv_assignments_6_0= ruleDataValue ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_40); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getSimpleAttributeAssignmentAccess().getCommaKeyword_2_1_2_0());
                    	    					
                    	    // InternalOntoL.g:2323:6: ( (lv_assignments_6_0= ruleDataValue ) )
                    	    // InternalOntoL.g:2324:7: (lv_assignments_6_0= ruleDataValue )
                    	    {
                    	    // InternalOntoL.g:2324:7: (lv_assignments_6_0= ruleDataValue )
                    	    // InternalOntoL.g:2325:8: lv_assignments_6_0= ruleDataValue
                    	    {

                    	    								newCompositeNode(grammarAccess.getSimpleAttributeAssignmentAccess().getAssignmentsDataValueParserRuleCall_2_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_41);
                    	    lv_assignments_6_0=ruleDataValue();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getSimpleAttributeAssignmentRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"assignments",
                    	    									lv_assignments_6_0,
                    	    									"br.ufes.inf.nemo.ontol.OntoL.DataValue");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getSimpleAttributeAssignmentAccess().getRightCurlyBracketKeyword_2_1_3());
                    				

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
    // $ANTLR end "ruleSimpleAttributeAssignment"


    // $ANTLR start "entryRuleReferenceAssignment"
    // InternalOntoL.g:2353:1: entryRuleReferenceAssignment returns [EObject current=null] : iv_ruleReferenceAssignment= ruleReferenceAssignment EOF ;
    public final EObject entryRuleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceAssignment = null;


        try {
            // InternalOntoL.g:2353:60: (iv_ruleReferenceAssignment= ruleReferenceAssignment EOF )
            // InternalOntoL.g:2354:2: iv_ruleReferenceAssignment= ruleReferenceAssignment EOF
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
    // InternalOntoL.g:2360:1: ruleReferenceAssignment returns [EObject current=null] : (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ) ) ) ;
    public final EObject ruleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalOntoL.g:2366:2: ( (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ) ) ) )
            // InternalOntoL.g:2367:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ) ) )
            {
            // InternalOntoL.g:2367:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ) ) )
            // InternalOntoL.g:2368:3: otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAssignmentAccess().getRefKeyword_0());
            		
            // InternalOntoL.g:2372:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:2373:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:2373:4: ( ruleQualifiedName )
            // InternalOntoL.g:2374:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReferenceAssignmentAccess().getReferenceReferenceCrossReference_1_0());
            				
            pushFollow(FOLLOW_38);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceAssignmentAccess().getEqualsSignKeyword_2());
            		
            // InternalOntoL.g:2392:3: ( ( ( ruleQualifiedName ) ) | (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            else if ( (LA54_0==12) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalOntoL.g:2393:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalOntoL.g:2393:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:2394:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:2394:5: ( ruleQualifiedName )
                    // InternalOntoL.g:2395:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceAssignmentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:2410:4: (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' )
                    {
                    // InternalOntoL.g:2410:4: (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' )
                    // InternalOntoL.g:2411:5: otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getReferenceAssignmentAccess().getLeftCurlyBracketKeyword_3_1_0());
                    				
                    // InternalOntoL.g:2415:5: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:2416:6: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:2416:6: ( ruleQualifiedName )
                    // InternalOntoL.g:2417:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getReferenceAssignmentRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_1_1_0());
                    						
                    pushFollow(FOLLOW_41);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalOntoL.g:2431:5: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==21) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalOntoL.g:2432:6: otherlv_6= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_3); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getReferenceAssignmentAccess().getCommaKeyword_3_1_2_0());
                    	    					
                    	    // InternalOntoL.g:2436:6: ( ( ruleQualifiedName ) )
                    	    // InternalOntoL.g:2437:7: ( ruleQualifiedName )
                    	    {
                    	    // InternalOntoL.g:2437:7: ( ruleQualifiedName )
                    	    // InternalOntoL.g:2438:8: ruleQualifiedName
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getReferenceAssignmentRule());
                    	    								}
                    	    							

                    	    								newCompositeNode(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_41);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
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
    // InternalOntoL.g:2463:1: entryRuleDataValue returns [EObject current=null] : iv_ruleDataValue= ruleDataValue EOF ;
    public final EObject entryRuleDataValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataValue = null;


        try {
            // InternalOntoL.g:2463:50: (iv_ruleDataValue= ruleDataValue EOF )
            // InternalOntoL.g:2464:2: iv_ruleDataValue= ruleDataValue EOF
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
    // InternalOntoL.g:2470:1: ruleDataValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_NumberValue_1= ruleNumberValue | this_BooleanValue_2= ruleBooleanValue | this_NoneValue_3= ruleNoneValue | this_ComplexDataValue_4= ruleComplexDataValue ) ;
    public final EObject ruleDataValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_NumberValue_1 = null;

        EObject this_BooleanValue_2 = null;

        EObject this_NoneValue_3 = null;

        EObject this_ComplexDataValue_4 = null;



        	enterRule();

        try {
            // InternalOntoL.g:2476:2: ( (this_StringValue_0= ruleStringValue | this_NumberValue_1= ruleNumberValue | this_BooleanValue_2= ruleBooleanValue | this_NoneValue_3= ruleNoneValue | this_ComplexDataValue_4= ruleComplexDataValue ) )
            // InternalOntoL.g:2477:2: (this_StringValue_0= ruleStringValue | this_NumberValue_1= ruleNumberValue | this_BooleanValue_2= ruleBooleanValue | this_NoneValue_3= ruleNoneValue | this_ComplexDataValue_4= ruleComplexDataValue )
            {
            // InternalOntoL.g:2477:2: (this_StringValue_0= ruleStringValue | this_NumberValue_1= ruleNumberValue | this_BooleanValue_2= ruleBooleanValue | this_NoneValue_3= ruleNoneValue | this_ComplexDataValue_4= ruleComplexDataValue )
            int alt55=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt55=1;
                }
                break;
            case RULE_INT:
            case 39:
                {
                alt55=2;
                }
                break;
            case 40:
            case 41:
                {
                alt55=3;
                }
                break;
            case 42:
                {
                alt55=4;
                }
                break;
            case RULE_ID:
            case 30:
                {
                alt55=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalOntoL.g:2478:3: this_StringValue_0= ruleStringValue
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
                    // InternalOntoL.g:2487:3: this_NumberValue_1= ruleNumberValue
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
                    // InternalOntoL.g:2496:3: this_BooleanValue_2= ruleBooleanValue
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
                    // InternalOntoL.g:2505:3: this_NoneValue_3= ruleNoneValue
                    {

                    			newCompositeNode(grammarAccess.getDataValueAccess().getNoneValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_NoneValue_3=ruleNoneValue();

                    state._fsp--;


                    			current = this_NoneValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOntoL.g:2514:3: this_ComplexDataValue_4= ruleComplexDataValue
                    {

                    			newCompositeNode(grammarAccess.getDataValueAccess().getComplexDataValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexDataValue_4=ruleComplexDataValue();

                    state._fsp--;


                    			current = this_ComplexDataValue_4;
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


    // $ANTLR start "entryRuleStringValue"
    // InternalOntoL.g:2526:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalOntoL.g:2526:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalOntoL.g:2527:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalOntoL.g:2533:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOntoL.g:2539:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalOntoL.g:2540:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalOntoL.g:2540:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalOntoL.g:2541:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalOntoL.g:2541:3: (lv_value_0_0= RULE_STRING )
            // InternalOntoL.g:2542:4: lv_value_0_0= RULE_STRING
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
    // InternalOntoL.g:2561:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalOntoL.g:2561:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalOntoL.g:2562:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalOntoL.g:2568:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:2574:2: ( ( (lv_value_0_0= ruleNUMBER ) ) )
            // InternalOntoL.g:2575:2: ( (lv_value_0_0= ruleNUMBER ) )
            {
            // InternalOntoL.g:2575:2: ( (lv_value_0_0= ruleNUMBER ) )
            // InternalOntoL.g:2576:3: (lv_value_0_0= ruleNUMBER )
            {
            // InternalOntoL.g:2576:3: (lv_value_0_0= ruleNUMBER )
            // InternalOntoL.g:2577:4: lv_value_0_0= ruleNUMBER
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
    // InternalOntoL.g:2597:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalOntoL.g:2597:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalOntoL.g:2598:2: iv_ruleNUMBER= ruleNUMBER EOF
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
    // InternalOntoL.g:2604:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalOntoL.g:2610:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalOntoL.g:2611:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalOntoL.g:2611:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalOntoL.g:2612:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalOntoL.g:2612:3: (kw= '-' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==39) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalOntoL.g:2613:4: kw= '-'
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
            		
            // InternalOntoL.g:2626:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==16) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalOntoL.g:2627:4: kw= '.' this_INT_3= RULE_INT
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
    // InternalOntoL.g:2644:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalOntoL.g:2644:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalOntoL.g:2645:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalOntoL.g:2651:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleBOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:2657:2: ( ( (lv_value_0_0= ruleBOOLEAN ) ) )
            // InternalOntoL.g:2658:2: ( (lv_value_0_0= ruleBOOLEAN ) )
            {
            // InternalOntoL.g:2658:2: ( (lv_value_0_0= ruleBOOLEAN ) )
            // InternalOntoL.g:2659:3: (lv_value_0_0= ruleBOOLEAN )
            {
            // InternalOntoL.g:2659:3: (lv_value_0_0= ruleBOOLEAN )
            // InternalOntoL.g:2660:4: lv_value_0_0= ruleBOOLEAN
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
    // InternalOntoL.g:2680:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // InternalOntoL.g:2680:47: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalOntoL.g:2681:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
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
    // InternalOntoL.g:2687:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOntoL.g:2693:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalOntoL.g:2694:2: (kw= 'true' | kw= 'false' )
            {
            // InternalOntoL.g:2694:2: (kw= 'true' | kw= 'false' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==40) ) {
                alt58=1;
            }
            else if ( (LA58_0==41) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalOntoL.g:2695:3: kw= 'true'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoL.g:2701:3: kw= 'false'
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
    // InternalOntoL.g:2710:1: entryRuleNoneValue returns [EObject current=null] : iv_ruleNoneValue= ruleNoneValue EOF ;
    public final EObject entryRuleNoneValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoneValue = null;


        try {
            // InternalOntoL.g:2710:50: (iv_ruleNoneValue= ruleNoneValue EOF )
            // InternalOntoL.g:2711:2: iv_ruleNoneValue= ruleNoneValue EOF
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
    // InternalOntoL.g:2717:1: ruleNoneValue returns [EObject current=null] : ( () otherlv_1= 'none' ) ;
    public final EObject ruleNoneValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOntoL.g:2723:2: ( ( () otherlv_1= 'none' ) )
            // InternalOntoL.g:2724:2: ( () otherlv_1= 'none' )
            {
            // InternalOntoL.g:2724:2: ( () otherlv_1= 'none' )
            // InternalOntoL.g:2725:3: () otherlv_1= 'none'
            {
            // InternalOntoL.g:2725:3: ()
            // InternalOntoL.g:2726:4: 
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


    // $ANTLR start "entryRuleComplexDataValue"
    // InternalOntoL.g:2740:1: entryRuleComplexDataValue returns [EObject current=null] : iv_ruleComplexDataValue= ruleComplexDataValue EOF ;
    public final EObject entryRuleComplexDataValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexDataValue = null;


        try {
            // InternalOntoL.g:2740:57: (iv_ruleComplexDataValue= ruleComplexDataValue EOF )
            // InternalOntoL.g:2741:2: iv_ruleComplexDataValue= ruleComplexDataValue EOF
            {
             newCompositeNode(grammarAccess.getComplexDataValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexDataValue=ruleComplexDataValue();

            state._fsp--;

             current =iv_ruleComplexDataValue; 
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
    // $ANTLR end "entryRuleComplexDataValue"


    // $ANTLR start "ruleComplexDataValue"
    // InternalOntoL.g:2747:1: ruleComplexDataValue returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedValue_1_0= ruleUnamedIndividual ) ) ) ;
    public final EObject ruleComplexDataValue() throws RecognitionException {
        EObject current = null;

        EObject lv_unnamedValue_1_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:2753:2: ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedValue_1_0= ruleUnamedIndividual ) ) ) )
            // InternalOntoL.g:2754:2: ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedValue_1_0= ruleUnamedIndividual ) ) )
            {
            // InternalOntoL.g:2754:2: ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedValue_1_0= ruleUnamedIndividual ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            else if ( (LA59_0==30) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalOntoL.g:2755:3: ( ( ruleQualifiedName ) )
                    {
                    // InternalOntoL.g:2755:3: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:2756:4: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:2756:4: ( ruleQualifiedName )
                    // InternalOntoL.g:2757:5: ruleQualifiedName
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComplexDataValueRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getComplexDataValueAccess().getValueIndividualCrossReference_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:2772:3: ( (lv_unnamedValue_1_0= ruleUnamedIndividual ) )
                    {
                    // InternalOntoL.g:2772:3: ( (lv_unnamedValue_1_0= ruleUnamedIndividual ) )
                    // InternalOntoL.g:2773:4: (lv_unnamedValue_1_0= ruleUnamedIndividual )
                    {
                    // InternalOntoL.g:2773:4: (lv_unnamedValue_1_0= ruleUnamedIndividual )
                    // InternalOntoL.g:2774:5: lv_unnamedValue_1_0= ruleUnamedIndividual
                    {

                    					newCompositeNode(grammarAccess.getComplexDataValueAccess().getUnnamedValueUnamedIndividualParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unnamedValue_1_0=ruleUnamedIndividual();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComplexDataValueRule());
                    					}
                    					set(
                    						current,
                    						"unnamedValue",
                    						lv_unnamedValue_1_0,
                    						"br.ufes.inf.nemo.ontol.OntoL.UnamedIndividual");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleComplexDataValue"


    // $ANTLR start "entryRuleUnamedIndividual"
    // InternalOntoL.g:2795:1: entryRuleUnamedIndividual returns [EObject current=null] : iv_ruleUnamedIndividual= ruleUnamedIndividual EOF ;
    public final EObject entryRuleUnamedIndividual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnamedIndividual = null;


        try {
            // InternalOntoL.g:2795:57: (iv_ruleUnamedIndividual= ruleUnamedIndividual EOF )
            // InternalOntoL.g:2796:2: iv_ruleUnamedIndividual= ruleUnamedIndividual EOF
            {
             newCompositeNode(grammarAccess.getUnamedIndividualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnamedIndividual=ruleUnamedIndividual();

            state._fsp--;

             current =iv_ruleUnamedIndividual; 
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
    // $ANTLR end "entryRuleUnamedIndividual"


    // $ANTLR start "ruleUnamedIndividual"
    // InternalOntoL.g:2802:1: ruleUnamedIndividual returns [EObject current=null] : (otherlv_0= '[' ( (lv_attAssignments_1_0= ruleSimpleAttributeAssignment ) ) (otherlv_2= ',' ( (lv_attAssignments_3_0= ruleSimpleAttributeAssignment ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleUnamedIndividual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attAssignments_1_0 = null;

        EObject lv_attAssignments_3_0 = null;



        	enterRule();

        try {
            // InternalOntoL.g:2808:2: ( (otherlv_0= '[' ( (lv_attAssignments_1_0= ruleSimpleAttributeAssignment ) ) (otherlv_2= ',' ( (lv_attAssignments_3_0= ruleSimpleAttributeAssignment ) ) )* otherlv_4= ']' ) )
            // InternalOntoL.g:2809:2: (otherlv_0= '[' ( (lv_attAssignments_1_0= ruleSimpleAttributeAssignment ) ) (otherlv_2= ',' ( (lv_attAssignments_3_0= ruleSimpleAttributeAssignment ) ) )* otherlv_4= ']' )
            {
            // InternalOntoL.g:2809:2: (otherlv_0= '[' ( (lv_attAssignments_1_0= ruleSimpleAttributeAssignment ) ) (otherlv_2= ',' ( (lv_attAssignments_3_0= ruleSimpleAttributeAssignment ) ) )* otherlv_4= ']' )
            // InternalOntoL.g:2810:3: otherlv_0= '[' ( (lv_attAssignments_1_0= ruleSimpleAttributeAssignment ) ) (otherlv_2= ',' ( (lv_attAssignments_3_0= ruleSimpleAttributeAssignment ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUnamedIndividualAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalOntoL.g:2814:3: ( (lv_attAssignments_1_0= ruleSimpleAttributeAssignment ) )
            // InternalOntoL.g:2815:4: (lv_attAssignments_1_0= ruleSimpleAttributeAssignment )
            {
            // InternalOntoL.g:2815:4: (lv_attAssignments_1_0= ruleSimpleAttributeAssignment )
            // InternalOntoL.g:2816:5: lv_attAssignments_1_0= ruleSimpleAttributeAssignment
            {

            					newCompositeNode(grammarAccess.getUnamedIndividualAccess().getAttAssignmentsSimpleAttributeAssignmentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_43);
            lv_attAssignments_1_0=ruleSimpleAttributeAssignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnamedIndividualRule());
            					}
            					add(
            						current,
            						"attAssignments",
            						lv_attAssignments_1_0,
            						"br.ufes.inf.nemo.ontol.OntoL.SimpleAttributeAssignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoL.g:2833:3: (otherlv_2= ',' ( (lv_attAssignments_3_0= ruleSimpleAttributeAssignment ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==21) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalOntoL.g:2834:4: otherlv_2= ',' ( (lv_attAssignments_3_0= ruleSimpleAttributeAssignment ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getUnamedIndividualAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalOntoL.g:2838:4: ( (lv_attAssignments_3_0= ruleSimpleAttributeAssignment ) )
            	    // InternalOntoL.g:2839:5: (lv_attAssignments_3_0= ruleSimpleAttributeAssignment )
            	    {
            	    // InternalOntoL.g:2839:5: (lv_attAssignments_3_0= ruleSimpleAttributeAssignment )
            	    // InternalOntoL.g:2840:6: lv_attAssignments_3_0= ruleSimpleAttributeAssignment
            	    {

            	    						newCompositeNode(grammarAccess.getUnamedIndividualAccess().getAttAssignmentsSimpleAttributeAssignmentParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_attAssignments_3_0=ruleSimpleAttributeAssignment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnamedIndividualRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attAssignments",
            	    							lv_attAssignments_3_0,
            	    							"br.ufes.inf.nemo.ontol.OntoL.SimpleAttributeAssignment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_4=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getUnamedIndividualAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleUnamedIndividual"


    // $ANTLR start "entryRuleGeneralizationSet"
    // InternalOntoL.g:2866:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // InternalOntoL.g:2866:58: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // InternalOntoL.g:2867:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
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
    // InternalOntoL.g:2873:1: ruleGeneralizationSet returns [EObject current=null] : ( ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) | ( (lv_isComplete_1_0= 'complete' ) ) | ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ( (lv_isComplete_3_0= 'complete' ) ) ) | ( ( (lv_isComplete_4_0= 'complete' ) ) ( (lv_isDisjoint_5_0= 'disjoint' ) ) ) )? otherlv_6= 'genset' ( (lv_name_7_0= RULE_ID ) )? otherlv_8= 'general' ( ( ruleQualifiedName ) ) (otherlv_10= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_12= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )+ ) ;
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
            // InternalOntoL.g:2879:2: ( ( ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) | ( (lv_isComplete_1_0= 'complete' ) ) | ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ( (lv_isComplete_3_0= 'complete' ) ) ) | ( ( (lv_isComplete_4_0= 'complete' ) ) ( (lv_isDisjoint_5_0= 'disjoint' ) ) ) )? otherlv_6= 'genset' ( (lv_name_7_0= RULE_ID ) )? otherlv_8= 'general' ( ( ruleQualifiedName ) ) (otherlv_10= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_12= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )+ ) )
            // InternalOntoL.g:2880:2: ( ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) | ( (lv_isComplete_1_0= 'complete' ) ) | ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ( (lv_isComplete_3_0= 'complete' ) ) ) | ( ( (lv_isComplete_4_0= 'complete' ) ) ( (lv_isDisjoint_5_0= 'disjoint' ) ) ) )? otherlv_6= 'genset' ( (lv_name_7_0= RULE_ID ) )? otherlv_8= 'general' ( ( ruleQualifiedName ) ) (otherlv_10= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_12= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )+ )
            {
            // InternalOntoL.g:2880:2: ( ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) | ( (lv_isComplete_1_0= 'complete' ) ) | ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ( (lv_isComplete_3_0= 'complete' ) ) ) | ( ( (lv_isComplete_4_0= 'complete' ) ) ( (lv_isDisjoint_5_0= 'disjoint' ) ) ) )? otherlv_6= 'genset' ( (lv_name_7_0= RULE_ID ) )? otherlv_8= 'general' ( ( ruleQualifiedName ) ) (otherlv_10= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_12= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )+ )
            // InternalOntoL.g:2881:3: ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) | ( (lv_isComplete_1_0= 'complete' ) ) | ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ( (lv_isComplete_3_0= 'complete' ) ) ) | ( ( (lv_isComplete_4_0= 'complete' ) ) ( (lv_isDisjoint_5_0= 'disjoint' ) ) ) )? otherlv_6= 'genset' ( (lv_name_7_0= RULE_ID ) )? otherlv_8= 'general' ( ( ruleQualifiedName ) ) (otherlv_10= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_12= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )+
            {
            // InternalOntoL.g:2881:3: ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) | ( (lv_isComplete_1_0= 'complete' ) ) | ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ( (lv_isComplete_3_0= 'complete' ) ) ) | ( ( (lv_isComplete_4_0= 'complete' ) ) ( (lv_isDisjoint_5_0= 'disjoint' ) ) ) )?
            int alt61=5;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==43) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==45) ) {
                    alt61=1;
                }
                else if ( (LA61_1==44) ) {
                    alt61=3;
                }
            }
            else if ( (LA61_0==44) ) {
                int LA61_2 = input.LA(2);

                if ( (LA61_2==43) ) {
                    alt61=4;
                }
                else if ( (LA61_2==45) ) {
                    alt61=2;
                }
            }
            switch (alt61) {
                case 1 :
                    // InternalOntoL.g:2882:4: ( (lv_isDisjoint_0_0= 'disjoint' ) )
                    {
                    // InternalOntoL.g:2882:4: ( (lv_isDisjoint_0_0= 'disjoint' ) )
                    // InternalOntoL.g:2883:5: (lv_isDisjoint_0_0= 'disjoint' )
                    {
                    // InternalOntoL.g:2883:5: (lv_isDisjoint_0_0= 'disjoint' )
                    // InternalOntoL.g:2884:6: lv_isDisjoint_0_0= 'disjoint'
                    {
                    lv_isDisjoint_0_0=(Token)match(input,43,FOLLOW_44); 

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
                    // InternalOntoL.g:2897:4: ( (lv_isComplete_1_0= 'complete' ) )
                    {
                    // InternalOntoL.g:2897:4: ( (lv_isComplete_1_0= 'complete' ) )
                    // InternalOntoL.g:2898:5: (lv_isComplete_1_0= 'complete' )
                    {
                    // InternalOntoL.g:2898:5: (lv_isComplete_1_0= 'complete' )
                    // InternalOntoL.g:2899:6: lv_isComplete_1_0= 'complete'
                    {
                    lv_isComplete_1_0=(Token)match(input,44,FOLLOW_44); 

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
                    // InternalOntoL.g:2912:4: ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ( (lv_isComplete_3_0= 'complete' ) ) )
                    {
                    // InternalOntoL.g:2912:4: ( ( (lv_isDisjoint_2_0= 'disjoint' ) ) ( (lv_isComplete_3_0= 'complete' ) ) )
                    // InternalOntoL.g:2913:5: ( (lv_isDisjoint_2_0= 'disjoint' ) ) ( (lv_isComplete_3_0= 'complete' ) )
                    {
                    // InternalOntoL.g:2913:5: ( (lv_isDisjoint_2_0= 'disjoint' ) )
                    // InternalOntoL.g:2914:6: (lv_isDisjoint_2_0= 'disjoint' )
                    {
                    // InternalOntoL.g:2914:6: (lv_isDisjoint_2_0= 'disjoint' )
                    // InternalOntoL.g:2915:7: lv_isDisjoint_2_0= 'disjoint'
                    {
                    lv_isDisjoint_2_0=(Token)match(input,43,FOLLOW_45); 

                    							newLeafNode(lv_isDisjoint_2_0, grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    							}
                    							setWithLastConsumed(current, "isDisjoint", true, "disjoint");
                    						

                    }


                    }

                    // InternalOntoL.g:2927:5: ( (lv_isComplete_3_0= 'complete' ) )
                    // InternalOntoL.g:2928:6: (lv_isComplete_3_0= 'complete' )
                    {
                    // InternalOntoL.g:2928:6: (lv_isComplete_3_0= 'complete' )
                    // InternalOntoL.g:2929:7: lv_isComplete_3_0= 'complete'
                    {
                    lv_isComplete_3_0=(Token)match(input,44,FOLLOW_44); 

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
                    // InternalOntoL.g:2943:4: ( ( (lv_isComplete_4_0= 'complete' ) ) ( (lv_isDisjoint_5_0= 'disjoint' ) ) )
                    {
                    // InternalOntoL.g:2943:4: ( ( (lv_isComplete_4_0= 'complete' ) ) ( (lv_isDisjoint_5_0= 'disjoint' ) ) )
                    // InternalOntoL.g:2944:5: ( (lv_isComplete_4_0= 'complete' ) ) ( (lv_isDisjoint_5_0= 'disjoint' ) )
                    {
                    // InternalOntoL.g:2944:5: ( (lv_isComplete_4_0= 'complete' ) )
                    // InternalOntoL.g:2945:6: (lv_isComplete_4_0= 'complete' )
                    {
                    // InternalOntoL.g:2945:6: (lv_isComplete_4_0= 'complete' )
                    // InternalOntoL.g:2946:7: lv_isComplete_4_0= 'complete'
                    {
                    lv_isComplete_4_0=(Token)match(input,44,FOLLOW_46); 

                    							newLeafNode(lv_isComplete_4_0, grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_3_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    							}
                    							setWithLastConsumed(current, "isComplete", true, "complete");
                    						

                    }


                    }

                    // InternalOntoL.g:2958:5: ( (lv_isDisjoint_5_0= 'disjoint' ) )
                    // InternalOntoL.g:2959:6: (lv_isDisjoint_5_0= 'disjoint' )
                    {
                    // InternalOntoL.g:2959:6: (lv_isDisjoint_5_0= 'disjoint' )
                    // InternalOntoL.g:2960:7: lv_isDisjoint_5_0= 'disjoint'
                    {
                    lv_isDisjoint_5_0=(Token)match(input,43,FOLLOW_44); 

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

            otherlv_6=(Token)match(input,45,FOLLOW_47); 

            			newLeafNode(otherlv_6, grammarAccess.getGeneralizationSetAccess().getGensetKeyword_1());
            		
            // InternalOntoL.g:2978:3: ( (lv_name_7_0= RULE_ID ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalOntoL.g:2979:4: (lv_name_7_0= RULE_ID )
                    {
                    // InternalOntoL.g:2979:4: (lv_name_7_0= RULE_ID )
                    // InternalOntoL.g:2980:5: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_48); 

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
            		
            // InternalOntoL.g:3000:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:3001:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:3001:4: ( ruleQualifiedName )
            // InternalOntoL.g:3002:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getGeneralOntoLClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_49);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoL.g:3016:3: (otherlv_10= 'categorizer' ( ( ruleQualifiedName ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==47) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalOntoL.g:3017:4: otherlv_10= 'categorizer' ( ( ruleQualifiedName ) )
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getGeneralizationSetAccess().getCategorizerKeyword_5_0());
                    			
                    // InternalOntoL.g:3021:4: ( ( ruleQualifiedName ) )
                    // InternalOntoL.g:3022:5: ( ruleQualifiedName )
                    {
                    // InternalOntoL.g:3022:5: ( ruleQualifiedName )
                    // InternalOntoL.g:3023:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGeneralizationSetAccess().getCategorizerOntoLClassCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_50);
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
            		
            // InternalOntoL.g:3042:3: ( ( ruleQualifiedName ) )
            // InternalOntoL.g:3043:4: ( ruleQualifiedName )
            {
            // InternalOntoL.g:3043:4: ( ruleQualifiedName )
            // InternalOntoL.g:3044:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getSpecificsOntoLClassCrossReference_7_0());
            				
            pushFollow(FOLLOW_51);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoL.g:3058:3: (otherlv_14= ',' ( ( ruleQualifiedName ) ) )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==21) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalOntoL.g:3059:4: otherlv_14= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_14=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_14, grammarAccess.getGeneralizationSetAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalOntoL.g:3063:4: ( ( ruleQualifiedName ) )
            	    // InternalOntoL.g:3064:5: ( ruleQualifiedName )
            	    {
            	    // InternalOntoL.g:3064:5: ( ruleQualifiedName )
            	    // InternalOntoL.g:3065:6: ruleQualifiedName
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
            	    if ( cnt64 >= 1 ) break loop64;
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
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
    // InternalOntoL.g:3084:1: ruleCategorizationType returns [Enumerator current=null] : ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) ) ;
    public final Enumerator ruleCategorizationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOntoL.g:3090:2: ( ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) ) )
            // InternalOntoL.g:3091:2: ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) )
            {
            // InternalOntoL.g:3091:2: ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) )
            int alt65=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt65=1;
                }
                break;
            case 50:
                {
                alt65=2;
                }
                break;
            case 51:
                {
                alt65=3;
                }
                break;
            case 52:
                {
                alt65=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalOntoL.g:3092:3: (enumLiteral_0= 'categorizes' )
                    {
                    // InternalOntoL.g:3092:3: (enumLiteral_0= 'categorizes' )
                    // InternalOntoL.g:3093:4: enumLiteral_0= 'categorizes'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:3100:3: (enumLiteral_1= 'completeCategorizes' )
                    {
                    // InternalOntoL.g:3100:3: (enumLiteral_1= 'completeCategorizes' )
                    // InternalOntoL.g:3101:4: enumLiteral_1= 'completeCategorizes'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:3108:3: (enumLiteral_2= 'disjointCategorizes' )
                    {
                    // InternalOntoL.g:3108:3: (enumLiteral_2= 'disjointCategorizes' )
                    // InternalOntoL.g:3109:4: enumLiteral_2= 'disjointCategorizes'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:3116:3: (enumLiteral_3= 'partitions' )
                    {
                    // InternalOntoL.g:3116:3: (enumLiteral_3= 'partitions' )
                    // InternalOntoL.g:3117:4: enumLiteral_3= 'partitions'
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


    // $ANTLR start "ruleRegularityAttributeType"
    // InternalOntoL.g:3127:1: ruleRegularityAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'determinesMaxValue' ) | (enumLiteral_1= 'determinesMinValue' ) | (enumLiteral_2= 'determinesValue' ) | (enumLiteral_3= 'determinesPossibleValues' ) | (enumLiteral_4= 'determinesType' ) | (enumLiteral_5= 'determinesPossibleTypes' ) ) ;
    public final Enumerator ruleRegularityAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalOntoL.g:3133:2: ( ( (enumLiteral_0= 'determinesMaxValue' ) | (enumLiteral_1= 'determinesMinValue' ) | (enumLiteral_2= 'determinesValue' ) | (enumLiteral_3= 'determinesPossibleValues' ) | (enumLiteral_4= 'determinesType' ) | (enumLiteral_5= 'determinesPossibleTypes' ) ) )
            // InternalOntoL.g:3134:2: ( (enumLiteral_0= 'determinesMaxValue' ) | (enumLiteral_1= 'determinesMinValue' ) | (enumLiteral_2= 'determinesValue' ) | (enumLiteral_3= 'determinesPossibleValues' ) | (enumLiteral_4= 'determinesType' ) | (enumLiteral_5= 'determinesPossibleTypes' ) )
            {
            // InternalOntoL.g:3134:2: ( (enumLiteral_0= 'determinesMaxValue' ) | (enumLiteral_1= 'determinesMinValue' ) | (enumLiteral_2= 'determinesValue' ) | (enumLiteral_3= 'determinesPossibleValues' ) | (enumLiteral_4= 'determinesType' ) | (enumLiteral_5= 'determinesPossibleTypes' ) )
            int alt66=6;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt66=1;
                }
                break;
            case 54:
                {
                alt66=2;
                }
                break;
            case 55:
                {
                alt66=3;
                }
                break;
            case 56:
                {
                alt66=4;
                }
                break;
            case 57:
                {
                alt66=5;
                }
                break;
            case 58:
                {
                alt66=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalOntoL.g:3135:3: (enumLiteral_0= 'determinesMaxValue' )
                    {
                    // InternalOntoL.g:3135:3: (enumLiteral_0= 'determinesMaxValue' )
                    // InternalOntoL.g:3136:4: enumLiteral_0= 'determinesMaxValue'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_MAX_VALUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_MAX_VALUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:3143:3: (enumLiteral_1= 'determinesMinValue' )
                    {
                    // InternalOntoL.g:3143:3: (enumLiteral_1= 'determinesMinValue' )
                    // InternalOntoL.g:3144:4: enumLiteral_1= 'determinesMinValue'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:3151:3: (enumLiteral_2= 'determinesValue' )
                    {
                    // InternalOntoL.g:3151:3: (enumLiteral_2= 'determinesValue' )
                    // InternalOntoL.g:3152:4: enumLiteral_2= 'determinesValue'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:3159:3: (enumLiteral_3= 'determinesPossibleValues' )
                    {
                    // InternalOntoL.g:3159:3: (enumLiteral_3= 'determinesPossibleValues' )
                    // InternalOntoL.g:3160:4: enumLiteral_3= 'determinesPossibleValues'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_POSSIBLE_VALUESEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_POSSIBLE_VALUESEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOntoL.g:3167:3: (enumLiteral_4= 'determinesType' )
                    {
                    // InternalOntoL.g:3167:3: (enumLiteral_4= 'determinesType' )
                    // InternalOntoL.g:3168:4: enumLiteral_4= 'determinesType'
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOntoL.g:3175:3: (enumLiteral_5= 'determinesPossibleTypes' )
                    {
                    // InternalOntoL.g:3175:3: (enumLiteral_5= 'determinesPossibleTypes' )
                    // InternalOntoL.g:3176:4: enumLiteral_5= 'determinesPossibleTypes'
                    {
                    enumLiteral_5=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_POSSIBLE_TYPESEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRegularityAttributeTypeAccess().getDETERMINES_POSSIBLE_TYPESEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleRegularityAttributeType"


    // $ANTLR start "ruleRegularityReferenceType"
    // InternalOntoL.g:3186:1: ruleRegularityReferenceType returns [Enumerator current=null] : ( (enumLiteral_0= 'determinesValue' ) | (enumLiteral_1= 'determinesPossibleValues' ) | (enumLiteral_2= 'determinesType' ) | (enumLiteral_3= 'determinesPossibleTypes' ) ) ;
    public final Enumerator ruleRegularityReferenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOntoL.g:3192:2: ( ( (enumLiteral_0= 'determinesValue' ) | (enumLiteral_1= 'determinesPossibleValues' ) | (enumLiteral_2= 'determinesType' ) | (enumLiteral_3= 'determinesPossibleTypes' ) ) )
            // InternalOntoL.g:3193:2: ( (enumLiteral_0= 'determinesValue' ) | (enumLiteral_1= 'determinesPossibleValues' ) | (enumLiteral_2= 'determinesType' ) | (enumLiteral_3= 'determinesPossibleTypes' ) )
            {
            // InternalOntoL.g:3193:2: ( (enumLiteral_0= 'determinesValue' ) | (enumLiteral_1= 'determinesPossibleValues' ) | (enumLiteral_2= 'determinesType' ) | (enumLiteral_3= 'determinesPossibleTypes' ) )
            int alt67=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt67=1;
                }
                break;
            case 56:
                {
                alt67=2;
                }
                break;
            case 57:
                {
                alt67=3;
                }
                break;
            case 58:
                {
                alt67=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalOntoL.g:3194:3: (enumLiteral_0= 'determinesValue' )
                    {
                    // InternalOntoL.g:3194:3: (enumLiteral_0= 'determinesValue' )
                    // InternalOntoL.g:3195:4: enumLiteral_0= 'determinesValue'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getRegularityReferenceTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRegularityReferenceTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoL.g:3202:3: (enumLiteral_1= 'determinesPossibleValues' )
                    {
                    // InternalOntoL.g:3202:3: (enumLiteral_1= 'determinesPossibleValues' )
                    // InternalOntoL.g:3203:4: enumLiteral_1= 'determinesPossibleValues'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getRegularityReferenceTypeAccess().getDETERMINES_POSSIBLE_VALUESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRegularityReferenceTypeAccess().getDETERMINES_POSSIBLE_VALUESEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoL.g:3210:3: (enumLiteral_2= 'determinesType' )
                    {
                    // InternalOntoL.g:3210:3: (enumLiteral_2= 'determinesType' )
                    // InternalOntoL.g:3211:4: enumLiteral_2= 'determinesType'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getRegularityReferenceTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRegularityReferenceTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoL.g:3218:3: (enumLiteral_3= 'determinesPossibleTypes' )
                    {
                    // InternalOntoL.g:3218:3: (enumLiteral_3= 'determinesPossibleTypes' )
                    // InternalOntoL.g:3219:4: enumLiteral_3= 'determinesPossibleTypes'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getRegularityReferenceTypeAccess().getDETERMINES_POSSIBLE_TYPESEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRegularityReferenceTypeAccess().getDETERMINES_POSSIBLE_TYPESEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleRegularityReferenceType"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\17\1\uffff\1\4\1\35\1\4\1\20\2\uffff\1\20\4\uffff";
    static final String dfa_3s = "\1\43\1\uffff\1\4\1\43\1\4\1\46\2\uffff\1\46\4\uffff";
    static final String dfa_4s = "\1\uffff\1\7\4\uffff\1\2\1\5\1\uffff\1\1\1\3\1\4\1\6";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\15\uffff\1\2\4\uffff\1\3\1\4",
            "",
            "\1\5",
            "\1\6\5\uffff\1\7",
            "\1\10",
            "\1\12\3\uffff\1\11\21\uffff\1\12",
            "",
            "",
            "\1\14\3\uffff\1\13\21\uffff\1\14",
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
            return "()* loopback of 552:4: ( ( (lv_attributes_4_0= ruleAttribute ) ) | ( (lv_attributes_5_0= ruleRegularityAttribute ) ) | ( (lv_attAssignments_6_0= ruleAttributeAssignment ) ) | ( (lv_references_7_0= ruleReference ) ) | ( (lv_references_8_0= ruleRegularityReference ) ) | ( (lv_refAssignments_9_0= ruleReferenceAssignment ) ) )*";
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000820008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000C20008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x001E000007100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x001E000007200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x001E000006200002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x001E000004200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x07E0000200000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x07E0000000200002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001200000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000200002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0780001200000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0780001000200002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0780000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000078040001070L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000078040000070L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000200000L});

}
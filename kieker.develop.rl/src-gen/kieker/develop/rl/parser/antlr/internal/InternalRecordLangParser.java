package kieker.develop.rl.parser.antlr.internal; 

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
import kieker.develop.rl.services.RecordLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalRecordLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'@author'", "'@since'", "'schema'", "'{'", "'}'", "':'", "','", "'templates'", "'root'", "'template'", "'abstract'", "'entity'", "'extends'", "'const'", "'='", "'alias'", "'as'", "'grouped'", "'by'", "'.'", "'['", "']'", "'KIEKER_VERSION'", "'*'", "'transient'", "'auto-increment'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_NUMBER=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_FLOAT=7;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRecordLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRecordLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRecordLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRecordLang.g"; }



     	private RecordLangGrammarAccess grammarAccess;
     	
        public InternalRecordLangParser(TokenStream input, RecordLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected RecordLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // InternalRecordLang.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRecordLang.g:69:2: (iv_ruleModel= ruleModel EOF )
            // InternalRecordLang.g:70:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRecordLang.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_types_3_0= ruleComplexType ) )* ( (lv_schemes_4_0= ruleSchema ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_types_3_0 = null;

        EObject lv_schemes_4_0 = null;


         enterRule(); 
            
        try {
            // InternalRecordLang.g:80:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_types_3_0= ruleComplexType ) )* ( (lv_schemes_4_0= ruleSchema ) )* ) )
            // InternalRecordLang.g:81:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_types_3_0= ruleComplexType ) )* ( (lv_schemes_4_0= ruleSchema ) )* )
            {
            // InternalRecordLang.g:81:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_types_3_0= ruleComplexType ) )* ( (lv_schemes_4_0= ruleSchema ) )* )
            // InternalRecordLang.g:81:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_types_3_0= ruleComplexType ) )* ( (lv_schemes_4_0= ruleSchema ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                  
            }
            // InternalRecordLang.g:85:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalRecordLang.g:86:1: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalRecordLang.g:86:1: (lv_name_1_0= ruleQualifiedName )
            // InternalRecordLang.g:87:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"kieker.develop.rl.RecordLang.QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalRecordLang.g:103:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRecordLang.g:104:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalRecordLang.g:104:1: (lv_imports_2_0= ruleImport )
            	    // InternalRecordLang.g:105:3: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
            	              		"kieker.develop.rl.RecordLang.Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalRecordLang.g:121:3: ( (lv_types_3_0= ruleComplexType ) )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==RULE_STRING) ) {
                        int LA2_5 = input.LA(3);

                        if ( (LA2_5==17) ) {
                            int LA2_2 = input.LA(4);

                            if ( (LA2_2==RULE_STRING) ) {
                                int LA2_6 = input.LA(5);

                                if ( ((LA2_6>=25 && LA2_6<=27)) ) {
                                    alt2=1;
                                }


                            }


                        }
                        else if ( ((LA2_5>=25 && LA2_5<=27)) ) {
                            alt2=1;
                        }


                    }


                    }
                    break;
                case 17:
                    {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==RULE_STRING) ) {
                        int LA2_6 = input.LA(3);

                        if ( ((LA2_6>=25 && LA2_6<=27)) ) {
                            alt2=1;
                        }


                    }


                    }
                    break;
                case 25:
                case 26:
                case 27:
                    {
                    alt2=1;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalRecordLang.g:122:1: (lv_types_3_0= ruleComplexType )
            	    {
            	    // InternalRecordLang.g:122:1: (lv_types_3_0= ruleComplexType )
            	    // InternalRecordLang.g:123:3: lv_types_3_0= ruleComplexType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getTypesComplexTypeParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_types_3_0=ruleComplexType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"types",
            	              		lv_types_3_0, 
            	              		"kieker.develop.rl.RecordLang.ComplexType");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalRecordLang.g:139:3: ( (lv_schemes_4_0= ruleSchema ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=16 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRecordLang.g:140:1: (lv_schemes_4_0= ruleSchema )
            	    {
            	    // InternalRecordLang.g:140:1: (lv_schemes_4_0= ruleSchema )
            	    // InternalRecordLang.g:141:3: lv_schemes_4_0= ruleSchema
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getSchemesSchemaParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_schemes_4_0=ruleSchema();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"schemes",
            	              		lv_schemes_4_0, 
            	              		"kieker.develop.rl.RecordLang.Schema");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // InternalRecordLang.g:165:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalRecordLang.g:166:2: (iv_ruleImport= ruleImport EOF )
            // InternalRecordLang.g:167:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRecordLang.g:174:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // InternalRecordLang.g:177:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalRecordLang.g:178:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalRecordLang.g:178:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalRecordLang.g:178:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // InternalRecordLang.g:182:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalRecordLang.g:183:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalRecordLang.g:183:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalRecordLang.g:184:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"kieker.develop.rl.RecordLang.QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleBaseType"
    // InternalRecordLang.g:210:1: entryRuleBaseType returns [EObject current=null] : iv_ruleBaseType= ruleBaseType EOF ;
    public final EObject entryRuleBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseType = null;


        try {
            // InternalRecordLang.g:211:2: (iv_ruleBaseType= ruleBaseType EOF )
            // InternalRecordLang.g:212:2: iv_ruleBaseType= ruleBaseType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBaseType=ruleBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBaseType"


    // $ANTLR start "ruleBaseType"
    // InternalRecordLang.g:219:1: ruleBaseType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBaseType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // InternalRecordLang.g:222:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRecordLang.g:223:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRecordLang.g:223:1: ( (lv_name_0_0= RULE_ID ) )
            // InternalRecordLang.g:224:1: (lv_name_0_0= RULE_ID )
            {
            // InternalRecordLang.g:224:1: (lv_name_0_0= RULE_ID )
            // InternalRecordLang.g:225:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getBaseTypeAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBaseTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBaseType"


    // $ANTLR start "entryRuleSchema"
    // InternalRecordLang.g:249:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // InternalRecordLang.g:250:2: (iv_ruleSchema= ruleSchema EOF )
            // InternalRecordLang.g:251:2: iv_ruleSchema= ruleSchema EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSchema=ruleSchema();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchema; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalRecordLang.g:258:1: ruleSchema returns [EObject current=null] : ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? otherlv_4= 'schema' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_templates_6_0= ruleTemplates ) ) | ( (lv_root_7_0= ruleRootType ) ) ) ( (otherlv_8= '{' ( ( (lv_properties_9_0= ruleProperty ) ) | ( (lv_constants_10_0= ruleConstant ) ) )* otherlv_11= '}' ) | (otherlv_12= ':' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* ) ) ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_author_1_0=null;
        Token otherlv_2=null;
        Token lv_since_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_templates_6_0 = null;

        EObject lv_root_7_0 = null;

        EObject lv_properties_9_0 = null;

        EObject lv_constants_10_0 = null;


         enterRule(); 
            
        try {
            // InternalRecordLang.g:261:28: ( ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? otherlv_4= 'schema' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_templates_6_0= ruleTemplates ) ) | ( (lv_root_7_0= ruleRootType ) ) ) ( (otherlv_8= '{' ( ( (lv_properties_9_0= ruleProperty ) ) | ( (lv_constants_10_0= ruleConstant ) ) )* otherlv_11= '}' ) | (otherlv_12= ':' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* ) ) ) )
            // InternalRecordLang.g:262:1: ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? otherlv_4= 'schema' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_templates_6_0= ruleTemplates ) ) | ( (lv_root_7_0= ruleRootType ) ) ) ( (otherlv_8= '{' ( ( (lv_properties_9_0= ruleProperty ) ) | ( (lv_constants_10_0= ruleConstant ) ) )* otherlv_11= '}' ) | (otherlv_12= ':' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* ) ) )
            {
            // InternalRecordLang.g:262:1: ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? otherlv_4= 'schema' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_templates_6_0= ruleTemplates ) ) | ( (lv_root_7_0= ruleRootType ) ) ) ( (otherlv_8= '{' ( ( (lv_properties_9_0= ruleProperty ) ) | ( (lv_constants_10_0= ruleConstant ) ) )* otherlv_11= '}' ) | (otherlv_12= ':' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* ) ) )
            // InternalRecordLang.g:262:2: (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? otherlv_4= 'schema' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_templates_6_0= ruleTemplates ) ) | ( (lv_root_7_0= ruleRootType ) ) ) ( (otherlv_8= '{' ( ( (lv_properties_9_0= ruleProperty ) ) | ( (lv_constants_10_0= ruleConstant ) ) )* otherlv_11= '}' ) | (otherlv_12= ':' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* ) )
            {
            // InternalRecordLang.g:262:2: (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRecordLang.g:262:4: otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getSchemaAccess().getAuthorKeyword_0_0());
                          
                    }
                    // InternalRecordLang.g:266:1: ( (lv_author_1_0= RULE_STRING ) )
                    // InternalRecordLang.g:267:1: (lv_author_1_0= RULE_STRING )
                    {
                    // InternalRecordLang.g:267:1: (lv_author_1_0= RULE_STRING )
                    // InternalRecordLang.g:268:3: lv_author_1_0= RULE_STRING
                    {
                    lv_author_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_author_1_0, grammarAccess.getSchemaAccess().getAuthorSTRINGTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSchemaRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"author",
                              		lv_author_1_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalRecordLang.g:284:4: (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRecordLang.g:284:6: otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSchemaAccess().getSinceKeyword_1_0());
                          
                    }
                    // InternalRecordLang.g:288:1: ( (lv_since_3_0= RULE_STRING ) )
                    // InternalRecordLang.g:289:1: (lv_since_3_0= RULE_STRING )
                    {
                    // InternalRecordLang.g:289:1: (lv_since_3_0= RULE_STRING )
                    // InternalRecordLang.g:290:3: lv_since_3_0= RULE_STRING
                    {
                    lv_since_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_since_3_0, grammarAccess.getSchemaAccess().getSinceSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSchemaRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"since",
                              		lv_since_3_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSchemaAccess().getSchemaKeyword_2());
                  
            }
            // InternalRecordLang.g:310:1: ( (lv_name_5_0= RULE_ID ) )
            // InternalRecordLang.g:311:1: (lv_name_5_0= RULE_ID )
            {
            // InternalRecordLang.g:311:1: (lv_name_5_0= RULE_ID )
            // InternalRecordLang.g:312:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSchemaRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalRecordLang.g:328:2: ( ( (lv_templates_6_0= ruleTemplates ) ) | ( (lv_root_7_0= ruleRootType ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRecordLang.g:328:3: ( (lv_templates_6_0= ruleTemplates ) )
                    {
                    // InternalRecordLang.g:328:3: ( (lv_templates_6_0= ruleTemplates ) )
                    // InternalRecordLang.g:329:1: (lv_templates_6_0= ruleTemplates )
                    {
                    // InternalRecordLang.g:329:1: (lv_templates_6_0= ruleTemplates )
                    // InternalRecordLang.g:330:3: lv_templates_6_0= ruleTemplates
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSchemaAccess().getTemplatesTemplatesParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_11);
                    lv_templates_6_0=ruleTemplates();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSchemaRule());
                      	        }
                             		set(
                             			current, 
                             			"templates",
                              		lv_templates_6_0, 
                              		"kieker.develop.rl.RecordLang.Templates");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRecordLang.g:347:6: ( (lv_root_7_0= ruleRootType ) )
                    {
                    // InternalRecordLang.g:347:6: ( (lv_root_7_0= ruleRootType ) )
                    // InternalRecordLang.g:348:1: (lv_root_7_0= ruleRootType )
                    {
                    // InternalRecordLang.g:348:1: (lv_root_7_0= ruleRootType )
                    // InternalRecordLang.g:349:3: lv_root_7_0= ruleRootType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSchemaAccess().getRootRootTypeParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_11);
                    lv_root_7_0=ruleRootType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSchemaRule());
                      	        }
                             		set(
                             			current, 
                             			"root",
                              		lv_root_7_0, 
                              		"kieker.develop.rl.RecordLang.RootType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalRecordLang.g:365:3: ( (otherlv_8= '{' ( ( (lv_properties_9_0= ruleProperty ) ) | ( (lv_constants_10_0= ruleConstant ) ) )* otherlv_11= '}' ) | (otherlv_12= ':' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRecordLang.g:365:4: (otherlv_8= '{' ( ( (lv_properties_9_0= ruleProperty ) ) | ( (lv_constants_10_0= ruleConstant ) ) )* otherlv_11= '}' )
                    {
                    // InternalRecordLang.g:365:4: (otherlv_8= '{' ( ( (lv_properties_9_0= ruleProperty ) ) | ( (lv_constants_10_0= ruleConstant ) ) )* otherlv_11= '}' )
                    // InternalRecordLang.g:365:6: otherlv_8= '{' ( ( (lv_properties_9_0= ruleProperty ) ) | ( (lv_constants_10_0= ruleConstant ) ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_5_0_0());
                          
                    }
                    // InternalRecordLang.g:369:1: ( ( (lv_properties_9_0= ruleProperty ) ) | ( (lv_constants_10_0= ruleConstant ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID||LA7_0==31||LA7_0==33||(LA7_0>=40 && LA7_0<=41)) ) {
                            alt7=1;
                        }
                        else if ( (LA7_0==29) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRecordLang.g:369:2: ( (lv_properties_9_0= ruleProperty ) )
                    	    {
                    	    // InternalRecordLang.g:369:2: ( (lv_properties_9_0= ruleProperty ) )
                    	    // InternalRecordLang.g:370:1: (lv_properties_9_0= ruleProperty )
                    	    {
                    	    // InternalRecordLang.g:370:1: (lv_properties_9_0= ruleProperty )
                    	    // InternalRecordLang.g:371:3: lv_properties_9_0= ruleProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSchemaAccess().getPropertiesPropertyParserRuleCall_5_0_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_properties_9_0=ruleProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSchemaRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"properties",
                    	              		lv_properties_9_0, 
                    	              		"kieker.develop.rl.RecordLang.Property");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRecordLang.g:388:6: ( (lv_constants_10_0= ruleConstant ) )
                    	    {
                    	    // InternalRecordLang.g:388:6: ( (lv_constants_10_0= ruleConstant ) )
                    	    // InternalRecordLang.g:389:1: (lv_constants_10_0= ruleConstant )
                    	    {
                    	    // InternalRecordLang.g:389:1: (lv_constants_10_0= ruleConstant )
                    	    // InternalRecordLang.g:390:3: lv_constants_10_0= ruleConstant
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSchemaAccess().getConstantsConstantParserRuleCall_5_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_constants_10_0=ruleConstant();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSchemaRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"constants",
                    	              		lv_constants_10_0, 
                    	              		"kieker.develop.rl.RecordLang.Constant");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_5_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRecordLang.g:411:6: (otherlv_12= ':' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )
                    {
                    // InternalRecordLang.g:411:6: (otherlv_12= ':' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )
                    // InternalRecordLang.g:411:8: otherlv_12= ':' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_12=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSchemaAccess().getColonKeyword_5_1_0());
                          
                    }
                    // InternalRecordLang.g:415:1: ( ( ruleQualifiedName ) )
                    // InternalRecordLang.g:416:1: ( ruleQualifiedName )
                    {
                    // InternalRecordLang.g:416:1: ( ruleQualifiedName )
                    // InternalRecordLang.g:417:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSchemaRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSchemaAccess().getParentsTemplateTypeCrossReference_5_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalRecordLang.g:430:2: (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==22) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalRecordLang.g:430:4: otherlv_14= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_14=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getSchemaAccess().getCommaKeyword_5_1_2_0());
                    	          
                    	    }
                    	    // InternalRecordLang.g:434:1: ( ( ruleQualifiedName ) )
                    	    // InternalRecordLang.g:435:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalRecordLang.g:435:1: ( ruleQualifiedName )
                    	    // InternalRecordLang.g:436:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getSchemaRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSchemaAccess().getParentsTemplateTypeCrossReference_5_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleTemplates"
    // InternalRecordLang.g:457:1: entryRuleTemplates returns [EObject current=null] : iv_ruleTemplates= ruleTemplates EOF ;
    public final EObject entryRuleTemplates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplates = null;


        try {
            // InternalRecordLang.g:458:2: (iv_ruleTemplates= ruleTemplates EOF )
            // InternalRecordLang.g:459:2: iv_ruleTemplates= ruleTemplates EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplatesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTemplates=ruleTemplates();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplates; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTemplates"


    // $ANTLR start "ruleTemplates"
    // InternalRecordLang.g:466:1: ruleTemplates returns [EObject current=null] : (otherlv_0= 'templates' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* ) ;
    public final EObject ruleTemplates() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalRecordLang.g:469:28: ( (otherlv_0= 'templates' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* ) )
            // InternalRecordLang.g:470:1: (otherlv_0= 'templates' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* )
            {
            // InternalRecordLang.g:470:1: (otherlv_0= 'templates' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* )
            // InternalRecordLang.g:470:3: otherlv_0= 'templates' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTemplatesAccess().getTemplatesKeyword_0());
                  
            }
            // InternalRecordLang.g:474:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:475:1: ( ruleQualifiedName )
            {
            // InternalRecordLang.g:475:1: ( ruleQualifiedName )
            // InternalRecordLang.g:476:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTemplatesRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplatesAccess().getTemplatesTemplateTypeCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_13);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalRecordLang.g:489:2: (otherlv_2= ',' ( ( ruleQualifiedName ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRecordLang.g:489:4: otherlv_2= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTemplatesAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalRecordLang.g:493:1: ( ( ruleQualifiedName ) )
            	    // InternalRecordLang.g:494:1: ( ruleQualifiedName )
            	    {
            	    // InternalRecordLang.g:494:1: ( ruleQualifiedName )
            	    // InternalRecordLang.g:495:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getTemplatesRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemplatesAccess().getTemplatesTemplateTypeCrossReference_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_13);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemplates"


    // $ANTLR start "entryRuleRootType"
    // InternalRecordLang.g:516:1: entryRuleRootType returns [EObject current=null] : iv_ruleRootType= ruleRootType EOF ;
    public final EObject entryRuleRootType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootType = null;


        try {
            // InternalRecordLang.g:517:2: (iv_ruleRootType= ruleRootType EOF )
            // InternalRecordLang.g:518:2: iv_ruleRootType= ruleRootType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRootTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRootType=ruleRootType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRootType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRootType"


    // $ANTLR start "ruleRootType"
    // InternalRecordLang.g:525:1: ruleRootType returns [EObject current=null] : (otherlv_0= 'root' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleRootType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalRecordLang.g:528:28: ( (otherlv_0= 'root' ( ( ruleQualifiedName ) ) ) )
            // InternalRecordLang.g:529:1: (otherlv_0= 'root' ( ( ruleQualifiedName ) ) )
            {
            // InternalRecordLang.g:529:1: (otherlv_0= 'root' ( ( ruleQualifiedName ) ) )
            // InternalRecordLang.g:529:3: otherlv_0= 'root' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRootTypeAccess().getRootKeyword_0());
                  
            }
            // InternalRecordLang.g:533:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:534:1: ( ruleQualifiedName )
            {
            // InternalRecordLang.g:534:1: ( ruleQualifiedName )
            // InternalRecordLang.g:535:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRootTypeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRootTypeAccess().getRecordRecordTypeCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRootType"


    // $ANTLR start "entryRuleComplexType"
    // InternalRecordLang.g:556:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // InternalRecordLang.g:557:2: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalRecordLang.g:558:2: iv_ruleComplexType= ruleComplexType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // InternalRecordLang.g:565:1: ruleComplexType returns [EObject current=null] : (this_RecordType_0= ruleRecordType | this_TemplateType_1= ruleTemplateType ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        EObject this_RecordType_0 = null;

        EObject this_TemplateType_1 = null;


         enterRule(); 
            
        try {
            // InternalRecordLang.g:568:28: ( (this_RecordType_0= ruleRecordType | this_TemplateType_1= ruleTemplateType ) )
            // InternalRecordLang.g:569:1: (this_RecordType_0= ruleRecordType | this_TemplateType_1= ruleTemplateType )
            {
            // InternalRecordLang.g:569:1: (this_RecordType_0= ruleRecordType | this_TemplateType_1= ruleTemplateType )
            int alt11=2;
            switch ( input.LA(1) ) {
            case 16:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 17:
                        {
                        int LA11_2 = input.LA(4);

                        if ( (LA11_2==RULE_STRING) ) {
                            int LA11_6 = input.LA(5);

                            if ( (LA11_6==25) ) {
                                alt11=2;
                            }
                            else if ( ((LA11_6>=26 && LA11_6<=27)) ) {
                                alt11=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 11, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 25:
                        {
                        alt11=2;
                        }
                        break;
                    case 26:
                    case 27:
                        {
                        alt11=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 5, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==RULE_STRING) ) {
                    int LA11_6 = input.LA(3);

                    if ( (LA11_6==25) ) {
                        alt11=2;
                    }
                    else if ( ((LA11_6>=26 && LA11_6<=27)) ) {
                        alt11=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case 26:
            case 27:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRecordLang.g:570:5: this_RecordType_0= ruleRecordType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComplexTypeAccess().getRecordTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_RecordType_0=ruleRecordType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RecordType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRecordLang.g:580:5: this_TemplateType_1= ruleTemplateType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComplexTypeAccess().getTemplateTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_TemplateType_1=ruleTemplateType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TemplateType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleTemplateType"
    // InternalRecordLang.g:596:1: entryRuleTemplateType returns [EObject current=null] : iv_ruleTemplateType= ruleTemplateType EOF ;
    public final EObject entryRuleTemplateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateType = null;


        try {
            // InternalRecordLang.g:597:2: (iv_ruleTemplateType= ruleTemplateType EOF )
            // InternalRecordLang.g:598:2: iv_ruleTemplateType= ruleTemplateType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTemplateType=ruleTemplateType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTemplateType"


    // $ANTLR start "ruleTemplateType"
    // InternalRecordLang.g:605:1: ruleTemplateType returns [EObject current=null] : ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? otherlv_4= 'template' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= ':' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_constants_12_0= ruleConstant ) ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleTemplateType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_author_1_0=null;
        Token otherlv_2=null;
        Token lv_since_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject lv_properties_11_0 = null;

        EObject lv_constants_12_0 = null;


         enterRule(); 
            
        try {
            // InternalRecordLang.g:608:28: ( ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? otherlv_4= 'template' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= ':' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_constants_12_0= ruleConstant ) ) )* otherlv_13= '}' )? ) )
            // InternalRecordLang.g:609:1: ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? otherlv_4= 'template' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= ':' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_constants_12_0= ruleConstant ) ) )* otherlv_13= '}' )? )
            {
            // InternalRecordLang.g:609:1: ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? otherlv_4= 'template' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= ':' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_constants_12_0= ruleConstant ) ) )* otherlv_13= '}' )? )
            // InternalRecordLang.g:609:2: (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? otherlv_4= 'template' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= ':' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_constants_12_0= ruleConstant ) ) )* otherlv_13= '}' )?
            {
            // InternalRecordLang.g:609:2: (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRecordLang.g:609:4: otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getTemplateTypeAccess().getAuthorKeyword_0_0());
                          
                    }
                    // InternalRecordLang.g:613:1: ( (lv_author_1_0= RULE_STRING ) )
                    // InternalRecordLang.g:614:1: (lv_author_1_0= RULE_STRING )
                    {
                    // InternalRecordLang.g:614:1: (lv_author_1_0= RULE_STRING )
                    // InternalRecordLang.g:615:3: lv_author_1_0= RULE_STRING
                    {
                    lv_author_1_0=(Token)match(input,RULE_STRING,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_author_1_0, grammarAccess.getTemplateTypeAccess().getAuthorSTRINGTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemplateTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"author",
                              		lv_author_1_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalRecordLang.g:631:4: (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRecordLang.g:631:6: otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTemplateTypeAccess().getSinceKeyword_1_0());
                          
                    }
                    // InternalRecordLang.g:635:1: ( (lv_since_3_0= RULE_STRING ) )
                    // InternalRecordLang.g:636:1: (lv_since_3_0= RULE_STRING )
                    {
                    // InternalRecordLang.g:636:1: (lv_since_3_0= RULE_STRING )
                    // InternalRecordLang.g:637:3: lv_since_3_0= RULE_STRING
                    {
                    lv_since_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_since_3_0, grammarAccess.getTemplateTypeAccess().getSinceSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemplateTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"since",
                              		lv_since_3_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTemplateTypeAccess().getTemplateKeyword_2());
                  
            }
            // InternalRecordLang.g:657:1: ( (lv_name_5_0= RULE_ID ) )
            // InternalRecordLang.g:658:1: (lv_name_5_0= RULE_ID )
            {
            // InternalRecordLang.g:658:1: (lv_name_5_0= RULE_ID )
            // InternalRecordLang.g:659:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getTemplateTypeAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTemplateTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalRecordLang.g:675:2: (otherlv_6= ':' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRecordLang.g:675:4: otherlv_6= ':' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTemplateTypeAccess().getColonKeyword_4_0());
                          
                    }
                    // InternalRecordLang.g:679:1: ( ( ruleQualifiedName ) )
                    // InternalRecordLang.g:680:1: ( ruleQualifiedName )
                    {
                    // InternalRecordLang.g:680:1: ( ruleQualifiedName )
                    // InternalRecordLang.g:681:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemplateTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateTypeAccess().getParentsTemplateTypeCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalRecordLang.g:694:2: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==22) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRecordLang.g:694:4: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getTemplateTypeAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // InternalRecordLang.g:698:1: ( ( ruleQualifiedName ) )
                    	    // InternalRecordLang.g:699:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalRecordLang.g:699:1: ( ruleQualifiedName )
                    	    // InternalRecordLang.g:700:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTemplateTypeRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTemplateTypeAccess().getParentsTemplateTypeCrossReference_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRecordLang.g:713:6: (otherlv_10= '{' ( ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_constants_12_0= ruleConstant ) ) )* otherlv_13= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRecordLang.g:713:8: otherlv_10= '{' ( ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_constants_12_0= ruleConstant ) ) )* otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getTemplateTypeAccess().getLeftCurlyBracketKeyword_5_0());
                          
                    }
                    // InternalRecordLang.g:717:1: ( ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_constants_12_0= ruleConstant ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID||LA16_0==31||LA16_0==33||(LA16_0>=40 && LA16_0<=41)) ) {
                            alt16=1;
                        }
                        else if ( (LA16_0==29) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalRecordLang.g:717:2: ( (lv_properties_11_0= ruleProperty ) )
                    	    {
                    	    // InternalRecordLang.g:717:2: ( (lv_properties_11_0= ruleProperty ) )
                    	    // InternalRecordLang.g:718:1: (lv_properties_11_0= ruleProperty )
                    	    {
                    	    // InternalRecordLang.g:718:1: (lv_properties_11_0= ruleProperty )
                    	    // InternalRecordLang.g:719:3: lv_properties_11_0= ruleProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTemplateTypeAccess().getPropertiesPropertyParserRuleCall_5_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_properties_11_0=ruleProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTemplateTypeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"properties",
                    	              		lv_properties_11_0, 
                    	              		"kieker.develop.rl.RecordLang.Property");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRecordLang.g:736:6: ( (lv_constants_12_0= ruleConstant ) )
                    	    {
                    	    // InternalRecordLang.g:736:6: ( (lv_constants_12_0= ruleConstant ) )
                    	    // InternalRecordLang.g:737:1: (lv_constants_12_0= ruleConstant )
                    	    {
                    	    // InternalRecordLang.g:737:1: (lv_constants_12_0= ruleConstant )
                    	    // InternalRecordLang.g:738:3: lv_constants_12_0= ruleConstant
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTemplateTypeAccess().getConstantsConstantParserRuleCall_5_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_constants_12_0=ruleConstant();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTemplateTypeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"constants",
                    	              		lv_constants_12_0, 
                    	              		"kieker.develop.rl.RecordLang.Constant");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getTemplateTypeAccess().getRightCurlyBracketKeyword_5_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemplateType"


    // $ANTLR start "entryRuleRecordType"
    // InternalRecordLang.g:766:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // InternalRecordLang.g:767:2: (iv_ruleRecordType= ruleRecordType EOF )
            // InternalRecordLang.g:768:2: iv_ruleRecordType= ruleRecordType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRecordType=ruleRecordType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // InternalRecordLang.g:775:1: ruleRecordType returns [EObject current=null] : ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= '{' ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_constants_15_0= ruleConstant ) ) )* otherlv_16= '}' )? ) ;
    public final EObject ruleRecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_author_1_0=null;
        Token otherlv_2=null;
        Token lv_since_3_0=null;
        Token lv_abstract_4_0=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        EObject lv_properties_14_0 = null;

        EObject lv_constants_15_0 = null;


         enterRule(); 
            
        try {
            // InternalRecordLang.g:778:28: ( ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= '{' ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_constants_15_0= ruleConstant ) ) )* otherlv_16= '}' )? ) )
            // InternalRecordLang.g:779:1: ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= '{' ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_constants_15_0= ruleConstant ) ) )* otherlv_16= '}' )? )
            {
            // InternalRecordLang.g:779:1: ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= '{' ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_constants_15_0= ruleConstant ) ) )* otherlv_16= '}' )? )
            // InternalRecordLang.g:779:2: (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= '{' ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_constants_15_0= ruleConstant ) ) )* otherlv_16= '}' )?
            {
            // InternalRecordLang.g:779:2: (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRecordLang.g:779:4: otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getRecordTypeAccess().getAuthorKeyword_0_0());
                          
                    }
                    // InternalRecordLang.g:783:1: ( (lv_author_1_0= RULE_STRING ) )
                    // InternalRecordLang.g:784:1: (lv_author_1_0= RULE_STRING )
                    {
                    // InternalRecordLang.g:784:1: (lv_author_1_0= RULE_STRING )
                    // InternalRecordLang.g:785:3: lv_author_1_0= RULE_STRING
                    {
                    lv_author_1_0=(Token)match(input,RULE_STRING,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_author_1_0, grammarAccess.getRecordTypeAccess().getAuthorSTRINGTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRecordTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"author",
                              		lv_author_1_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalRecordLang.g:801:4: (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRecordLang.g:801:6: otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getRecordTypeAccess().getSinceKeyword_1_0());
                          
                    }
                    // InternalRecordLang.g:805:1: ( (lv_since_3_0= RULE_STRING ) )
                    // InternalRecordLang.g:806:1: (lv_since_3_0= RULE_STRING )
                    {
                    // InternalRecordLang.g:806:1: (lv_since_3_0= RULE_STRING )
                    // InternalRecordLang.g:807:3: lv_since_3_0= RULE_STRING
                    {
                    lv_since_3_0=(Token)match(input,RULE_STRING,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_since_3_0, grammarAccess.getRecordTypeAccess().getSinceSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRecordTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"since",
                              		lv_since_3_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalRecordLang.g:823:4: ( (lv_abstract_4_0= 'abstract' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRecordLang.g:824:1: (lv_abstract_4_0= 'abstract' )
                    {
                    // InternalRecordLang.g:824:1: (lv_abstract_4_0= 'abstract' )
                    // InternalRecordLang.g:825:3: lv_abstract_4_0= 'abstract'
                    {
                    lv_abstract_4_0=(Token)match(input,26,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_abstract_4_0, grammarAccess.getRecordTypeAccess().getAbstractAbstractKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRecordTypeRule());
                      	        }
                             		setWithLastConsumed(current, "abstract", true, "abstract");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getRecordTypeAccess().getEntityKeyword_3());
                  
            }
            // InternalRecordLang.g:842:1: ( (lv_name_6_0= RULE_ID ) )
            // InternalRecordLang.g:843:1: (lv_name_6_0= RULE_ID )
            {
            // InternalRecordLang.g:843:1: (lv_name_6_0= RULE_ID )
            // InternalRecordLang.g:844:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_6_0, grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRecordTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_6_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalRecordLang.g:860:2: (otherlv_7= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRecordLang.g:860:4: otherlv_7= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getRecordTypeAccess().getExtendsKeyword_5_0());
                          
                    }
                    // InternalRecordLang.g:864:1: ( ( ruleQualifiedName ) )
                    // InternalRecordLang.g:865:1: ( ruleQualifiedName )
                    {
                    // InternalRecordLang.g:865:1: ( ruleQualifiedName )
                    // InternalRecordLang.g:866:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRecordTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getParentRecordTypeCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalRecordLang.g:879:4: (otherlv_9= ':' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRecordLang.g:879:6: otherlv_9= ':' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getRecordTypeAccess().getColonKeyword_6_0());
                          
                    }
                    // InternalRecordLang.g:883:1: ( ( ruleQualifiedName ) )
                    // InternalRecordLang.g:884:1: ( ruleQualifiedName )
                    {
                    // InternalRecordLang.g:884:1: ( ruleQualifiedName )
                    // InternalRecordLang.g:885:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRecordTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getParentsTemplateTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalRecordLang.g:898:2: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==22) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalRecordLang.g:898:4: otherlv_11= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_11=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getRecordTypeAccess().getCommaKeyword_6_2_0());
                    	          
                    	    }
                    	    // InternalRecordLang.g:902:1: ( ( ruleQualifiedName ) )
                    	    // InternalRecordLang.g:903:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalRecordLang.g:903:1: ( ruleQualifiedName )
                    	    // InternalRecordLang.g:904:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getRecordTypeRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getParentsTemplateTypeCrossReference_6_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRecordLang.g:917:6: (otherlv_13= '{' ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_constants_15_0= ruleConstant ) ) )* otherlv_16= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRecordLang.g:917:8: otherlv_13= '{' ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_constants_15_0= ruleConstant ) ) )* otherlv_16= '}'
                    {
                    otherlv_13=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_7_0());
                          
                    }
                    // InternalRecordLang.g:921:1: ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_constants_15_0= ruleConstant ) ) )*
                    loop24:
                    do {
                        int alt24=3;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID||LA24_0==31||LA24_0==33||(LA24_0>=40 && LA24_0<=41)) ) {
                            alt24=1;
                        }
                        else if ( (LA24_0==29) ) {
                            alt24=2;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalRecordLang.g:921:2: ( (lv_properties_14_0= ruleProperty ) )
                    	    {
                    	    // InternalRecordLang.g:921:2: ( (lv_properties_14_0= ruleProperty ) )
                    	    // InternalRecordLang.g:922:1: (lv_properties_14_0= ruleProperty )
                    	    {
                    	    // InternalRecordLang.g:922:1: (lv_properties_14_0= ruleProperty )
                    	    // InternalRecordLang.g:923:3: lv_properties_14_0= ruleProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getPropertiesPropertyParserRuleCall_7_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_properties_14_0=ruleProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRecordTypeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"properties",
                    	              		lv_properties_14_0, 
                    	              		"kieker.develop.rl.RecordLang.Property");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRecordLang.g:940:6: ( (lv_constants_15_0= ruleConstant ) )
                    	    {
                    	    // InternalRecordLang.g:940:6: ( (lv_constants_15_0= ruleConstant ) )
                    	    // InternalRecordLang.g:941:1: (lv_constants_15_0= ruleConstant )
                    	    {
                    	    // InternalRecordLang.g:941:1: (lv_constants_15_0= ruleConstant )
                    	    // InternalRecordLang.g:942:3: lv_constants_15_0= ruleConstant
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getConstantsConstantParserRuleCall_7_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_constants_15_0=ruleConstant();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRecordTypeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"constants",
                    	              		lv_constants_15_0, 
                    	              		"kieker.develop.rl.RecordLang.Constant");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_7_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleConstant"
    // InternalRecordLang.g:970:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalRecordLang.g:971:2: (iv_ruleConstant= ruleConstant EOF )
            // InternalRecordLang.g:972:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalRecordLang.g:979:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // InternalRecordLang.g:982:28: ( (otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) ) ) )
            // InternalRecordLang.g:983:1: (otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) ) )
            {
            // InternalRecordLang.g:983:1: (otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) ) )
            // InternalRecordLang.g:983:3: otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstKeyword_0());
                  
            }
            // InternalRecordLang.g:987:1: ( (lv_type_1_0= ruleClassifier ) )
            // InternalRecordLang.g:988:1: (lv_type_1_0= ruleClassifier )
            {
            // InternalRecordLang.g:988:1: (lv_type_1_0= ruleClassifier )
            // InternalRecordLang.g:989:3: lv_type_1_0= ruleClassifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAccess().getTypeClassifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_3);
            lv_type_1_0=ruleClassifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"kieker.develop.rl.RecordLang.Classifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalRecordLang.g:1005:2: ( (lv_name_2_0= RULE_ID ) )
            // InternalRecordLang.g:1006:1: (lv_name_2_0= RULE_ID )
            {
            // InternalRecordLang.g:1006:1: (lv_name_2_0= RULE_ID )
            // InternalRecordLang.g:1007:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getEqualsSignKeyword_3());
                  
            }
            // InternalRecordLang.g:1027:1: ( (lv_value_4_0= ruleLiteral ) )
            // InternalRecordLang.g:1028:1: (lv_value_4_0= ruleLiteral )
            {
            // InternalRecordLang.g:1028:1: (lv_value_4_0= ruleLiteral )
            // InternalRecordLang.g:1029:3: lv_value_4_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAccess().getValueLiteralParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_4_0, 
                      		"kieker.develop.rl.RecordLang.Literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleProperty"
    // InternalRecordLang.g:1053:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalRecordLang.g:1054:2: (iv_ruleProperty= ruleProperty EOF )
            // InternalRecordLang.g:1055:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRecordLang.g:1062:1: ruleProperty returns [EObject current=null] : ( ( (lv_modifiers_0_0= rulePropertyModifier ) )* ( (lv_foreignKey_1_0= ruleForeignKey ) )? ( ( (lv_type_2_0= ruleClassifier ) ) | (otherlv_3= 'alias' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_value_8_0= ruleLiteral ) ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Enumerator lv_modifiers_0_0 = null;

        EObject lv_foreignKey_1_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_value_8_0 = null;


         enterRule(); 
            
        try {
            // InternalRecordLang.g:1065:28: ( ( ( (lv_modifiers_0_0= rulePropertyModifier ) )* ( (lv_foreignKey_1_0= ruleForeignKey ) )? ( ( (lv_type_2_0= ruleClassifier ) ) | (otherlv_3= 'alias' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_value_8_0= ruleLiteral ) ) )? ) )
            // InternalRecordLang.g:1066:1: ( ( (lv_modifiers_0_0= rulePropertyModifier ) )* ( (lv_foreignKey_1_0= ruleForeignKey ) )? ( ( (lv_type_2_0= ruleClassifier ) ) | (otherlv_3= 'alias' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_value_8_0= ruleLiteral ) ) )? )
            {
            // InternalRecordLang.g:1066:1: ( ( (lv_modifiers_0_0= rulePropertyModifier ) )* ( (lv_foreignKey_1_0= ruleForeignKey ) )? ( ( (lv_type_2_0= ruleClassifier ) ) | (otherlv_3= 'alias' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_value_8_0= ruleLiteral ) ) )? )
            // InternalRecordLang.g:1066:2: ( (lv_modifiers_0_0= rulePropertyModifier ) )* ( (lv_foreignKey_1_0= ruleForeignKey ) )? ( ( (lv_type_2_0= ruleClassifier ) ) | (otherlv_3= 'alias' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ) ) ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_value_8_0= ruleLiteral ) ) )?
            {
            // InternalRecordLang.g:1066:2: ( (lv_modifiers_0_0= rulePropertyModifier ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=40 && LA26_0<=41)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRecordLang.g:1067:1: (lv_modifiers_0_0= rulePropertyModifier )
            	    {
            	    // InternalRecordLang.g:1067:1: (lv_modifiers_0_0= rulePropertyModifier )
            	    // InternalRecordLang.g:1068:3: lv_modifiers_0_0= rulePropertyModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPropertyAccess().getModifiersPropertyModifierEnumRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_modifiers_0_0=rulePropertyModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiers",
            	              		lv_modifiers_0_0, 
            	              		"kieker.develop.rl.RecordLang.PropertyModifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalRecordLang.g:1084:3: ( (lv_foreignKey_1_0= ruleForeignKey ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRecordLang.g:1085:1: (lv_foreignKey_1_0= ruleForeignKey )
                    {
                    // InternalRecordLang.g:1085:1: (lv_foreignKey_1_0= ruleForeignKey )
                    // InternalRecordLang.g:1086:3: lv_foreignKey_1_0= ruleForeignKey
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getForeignKeyForeignKeyParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_25);
                    lv_foreignKey_1_0=ruleForeignKey();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"foreignKey",
                              		lv_foreignKey_1_0, 
                              		"kieker.develop.rl.RecordLang.ForeignKey");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalRecordLang.g:1102:3: ( ( (lv_type_2_0= ruleClassifier ) ) | (otherlv_3= 'alias' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==31) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalRecordLang.g:1102:4: ( (lv_type_2_0= ruleClassifier ) )
                    {
                    // InternalRecordLang.g:1102:4: ( (lv_type_2_0= ruleClassifier ) )
                    // InternalRecordLang.g:1103:1: (lv_type_2_0= ruleClassifier )
                    {
                    // InternalRecordLang.g:1103:1: (lv_type_2_0= ruleClassifier )
                    // InternalRecordLang.g:1104:3: lv_type_2_0= ruleClassifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeClassifierParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_3);
                    lv_type_2_0=ruleClassifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_2_0, 
                              		"kieker.develop.rl.RecordLang.Classifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRecordLang.g:1121:6: (otherlv_3= 'alias' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' )
                    {
                    // InternalRecordLang.g:1121:6: (otherlv_3= 'alias' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' )
                    // InternalRecordLang.g:1121:8: otherlv_3= 'alias' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getAliasKeyword_2_1_0());
                          
                    }
                    // InternalRecordLang.g:1125:1: ( (otherlv_4= RULE_ID ) )
                    // InternalRecordLang.g:1126:1: (otherlv_4= RULE_ID )
                    {
                    // InternalRecordLang.g:1126:1: (otherlv_4= RULE_ID )
                    // InternalRecordLang.g:1127:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getReferToPropertyCrossReference_2_1_1_0()); 
                      	
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getAsKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // InternalRecordLang.g:1142:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalRecordLang.g:1143:1: (lv_name_6_0= RULE_ID )
            {
            // InternalRecordLang.g:1143:1: (lv_name_6_0= RULE_ID )
            // InternalRecordLang.g:1144:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_6_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_6_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalRecordLang.g:1160:2: (otherlv_7= '=' ( (lv_value_8_0= ruleLiteral ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRecordLang.g:1160:4: otherlv_7= '=' ( (lv_value_8_0= ruleLiteral ) )
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getPropertyAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // InternalRecordLang.g:1164:1: ( (lv_value_8_0= ruleLiteral ) )
                    // InternalRecordLang.g:1165:1: (lv_value_8_0= ruleLiteral )
                    {
                    // InternalRecordLang.g:1165:1: (lv_value_8_0= ruleLiteral )
                    // InternalRecordLang.g:1166:3: lv_value_8_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getValueLiteralParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_8_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_8_0, 
                              		"kieker.develop.rl.RecordLang.Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleForeignKey"
    // InternalRecordLang.g:1190:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // InternalRecordLang.g:1191:2: (iv_ruleForeignKey= ruleForeignKey EOF )
            // InternalRecordLang.g:1192:2: iv_ruleForeignKey= ruleForeignKey EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeignKeyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForeignKey=ruleForeignKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeignKey; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForeignKey"


    // $ANTLR start "ruleForeignKey"
    // InternalRecordLang.g:1199:1: ruleForeignKey returns [EObject current=null] : (otherlv_0= 'grouped' otherlv_1= 'by' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleForeignKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // InternalRecordLang.g:1202:28: ( (otherlv_0= 'grouped' otherlv_1= 'by' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalRecordLang.g:1203:1: (otherlv_0= 'grouped' otherlv_1= 'by' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalRecordLang.g:1203:1: (otherlv_0= 'grouped' otherlv_1= 'by' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )
            // InternalRecordLang.g:1203:3: otherlv_0= 'grouped' otherlv_1= 'by' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForeignKeyAccess().getGroupedKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForeignKeyAccess().getByKeyword_1());
                  
            }
            // InternalRecordLang.g:1211:1: ( (otherlv_2= RULE_ID ) )
            // InternalRecordLang.g:1212:1: (otherlv_2= RULE_ID )
            {
            // InternalRecordLang.g:1212:1: (otherlv_2= RULE_ID )
            // InternalRecordLang.g:1213:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getForeignKeyRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getForeignKeyAccess().getRecordTypeRecordTypeCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getForeignKeyAccess().getFullStopKeyword_3());
                  
            }
            // InternalRecordLang.g:1228:1: ( (otherlv_4= RULE_ID ) )
            // InternalRecordLang.g:1229:1: (otherlv_4= RULE_ID )
            {
            // InternalRecordLang.g:1229:1: (otherlv_4= RULE_ID )
            // InternalRecordLang.g:1230:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getForeignKeyRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getForeignKeyAccess().getPropertyRefPropertyCrossReference_4_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleForeignKey"


    // $ANTLR start "entryRuleClassifier"
    // InternalRecordLang.g:1249:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // InternalRecordLang.g:1250:2: (iv_ruleClassifier= ruleClassifier EOF )
            // InternalRecordLang.g:1251:2: iv_ruleClassifier= ruleClassifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassifier"


    // $ANTLR start "ruleClassifier"
    // InternalRecordLang.g:1258:1: ruleClassifier returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_sizes_1_0= ruleArraySize ) )* ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sizes_1_0 = null;


         enterRule(); 
            
        try {
            // InternalRecordLang.g:1261:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_sizes_1_0= ruleArraySize ) )* ) )
            // InternalRecordLang.g:1262:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_sizes_1_0= ruleArraySize ) )* )
            {
            // InternalRecordLang.g:1262:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_sizes_1_0= ruleArraySize ) )* )
            // InternalRecordLang.g:1262:2: ( (otherlv_0= RULE_ID ) ) ( (lv_sizes_1_0= ruleArraySize ) )*
            {
            // InternalRecordLang.g:1262:2: ( (otherlv_0= RULE_ID ) )
            // InternalRecordLang.g:1263:1: (otherlv_0= RULE_ID )
            {
            // InternalRecordLang.g:1263:1: (otherlv_0= RULE_ID )
            // InternalRecordLang.g:1264:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getClassifierRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getClassifierAccess().getTypeBaseTypeCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalRecordLang.g:1275:2: ( (lv_sizes_1_0= ruleArraySize ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==36) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRecordLang.g:1276:1: (lv_sizes_1_0= ruleArraySize )
            	    {
            	    // InternalRecordLang.g:1276:1: (lv_sizes_1_0= ruleArraySize )
            	    // InternalRecordLang.g:1277:3: lv_sizes_1_0= ruleArraySize
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassifierAccess().getSizesArraySizeParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_sizes_1_0=ruleArraySize();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassifierRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sizes",
            	              		lv_sizes_1_0, 
            	              		"kieker.develop.rl.RecordLang.ArraySize");
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClassifier"


    // $ANTLR start "entryRuleArraySize"
    // InternalRecordLang.g:1301:1: entryRuleArraySize returns [EObject current=null] : iv_ruleArraySize= ruleArraySize EOF ;
    public final EObject entryRuleArraySize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySize = null;


        try {
            // InternalRecordLang.g:1302:2: (iv_ruleArraySize= ruleArraySize EOF )
            // InternalRecordLang.g:1303:2: iv_ruleArraySize= ruleArraySize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArraySizeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArraySize=ruleArraySize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArraySize; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArraySize"


    // $ANTLR start "ruleArraySize"
    // InternalRecordLang.g:1310:1: ruleArraySize returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) ;
    public final EObject ruleArraySize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalRecordLang.g:1313:28: ( ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) )
            // InternalRecordLang.g:1314:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            {
            // InternalRecordLang.g:1314:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            // InternalRecordLang.g:1314:2: () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']'
            {
            // InternalRecordLang.g:1314:2: ()
            // InternalRecordLang.g:1315:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArraySizeAccess().getArraySizeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArraySizeAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // InternalRecordLang.g:1324:1: ( (lv_size_2_0= RULE_INT ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRecordLang.g:1325:1: (lv_size_2_0= RULE_INT )
                    {
                    // InternalRecordLang.g:1325:1: (lv_size_2_0= RULE_INT )
                    // InternalRecordLang.g:1326:3: lv_size_2_0= RULE_INT
                    {
                    lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_size_2_0, grammarAccess.getArraySizeAccess().getSizeINTTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArraySizeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"size",
                              		lv_size_2_0, 
                              		"kieker.develop.rl.RecordLang.INT");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getArraySizeAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArraySize"


    // $ANTLR start "entryRuleLiteral"
    // InternalRecordLang.g:1354:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalRecordLang.g:1355:2: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalRecordLang.g:1356:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalRecordLang.g:1363:1: ruleLiteral returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ConstantLiteral_4= ruleConstantLiteral | this_ArrayLiteral_5= ruleArrayLiteral | this_BuiltInValueLiteral_6= ruleBuiltInValueLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_FloatLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;

        EObject this_ConstantLiteral_4 = null;

        EObject this_ArrayLiteral_5 = null;

        EObject this_BuiltInValueLiteral_6 = null;


         enterRule(); 
            
        try {
            // InternalRecordLang.g:1366:28: ( (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ConstantLiteral_4= ruleConstantLiteral | this_ArrayLiteral_5= ruleArrayLiteral | this_BuiltInValueLiteral_6= ruleBuiltInValueLiteral ) )
            // InternalRecordLang.g:1367:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ConstantLiteral_4= ruleConstantLiteral | this_ArrayLiteral_5= ruleArrayLiteral | this_BuiltInValueLiteral_6= ruleBuiltInValueLiteral )
            {
            // InternalRecordLang.g:1367:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ConstantLiteral_4= ruleConstantLiteral | this_ArrayLiteral_5= ruleArrayLiteral | this_BuiltInValueLiteral_6= ruleBuiltInValueLiteral )
            int alt32=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt32=1;
                }
                break;
            case RULE_INT:
                {
                alt32=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt32=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt32=4;
                }
                break;
            case RULE_ID:
                {
                alt32=5;
                }
                break;
            case 19:
                {
                alt32=6;
                }
                break;
            case 38:
                {
                alt32=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalRecordLang.g:1368:5: this_StringLiteral_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRecordLang.g:1378:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_1=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalRecordLang.g:1388:5: this_FloatLiteral_2= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_FloatLiteral_2=ruleFloatLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FloatLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalRecordLang.g:1398:5: this_BooleanLiteral_3= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_3=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalRecordLang.g:1408:5: this_ConstantLiteral_4= ruleConstantLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getConstantLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ConstantLiteral_4=ruleConstantLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalRecordLang.g:1418:5: this_ArrayLiteral_5= ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrayLiteral_5=ruleArrayLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalRecordLang.g:1428:5: this_BuiltInValueLiteral_6= ruleBuiltInValueLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBuiltInValueLiteralParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BuiltInValueLiteral_6=ruleBuiltInValueLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BuiltInValueLiteral_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleArrayLiteral"
    // InternalRecordLang.g:1444:1: entryRuleArrayLiteral returns [EObject current=null] : iv_ruleArrayLiteral= ruleArrayLiteral EOF ;
    public final EObject entryRuleArrayLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLiteral = null;


        try {
            // InternalRecordLang.g:1445:2: (iv_ruleArrayLiteral= ruleArrayLiteral EOF )
            // InternalRecordLang.g:1446:2: iv_ruleArrayLiteral= ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayLiteral=ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayLiteral"


    // $ANTLR start "ruleArrayLiteral"
    // InternalRecordLang.g:1453:1: ruleArrayLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleArrayLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_1_0 = null;

        EObject lv_literals_3_0 = null;


         enterRule(); 
            
        try {
            // InternalRecordLang.g:1456:28: ( (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' ) )
            // InternalRecordLang.g:1457:1: (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' )
            {
            // InternalRecordLang.g:1457:1: (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' )
            // InternalRecordLang.g:1457:3: otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // InternalRecordLang.g:1461:1: ( (lv_literals_1_0= ruleLiteral ) )
            // InternalRecordLang.g:1462:1: (lv_literals_1_0= ruleLiteral )
            {
            // InternalRecordLang.g:1462:1: (lv_literals_1_0= ruleLiteral )
            // InternalRecordLang.g:1463:3: lv_literals_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_33);
            lv_literals_1_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayLiteralRule());
              	        }
                     		add(
                     			current, 
                     			"literals",
                      		lv_literals_1_0, 
                      		"kieker.develop.rl.RecordLang.Literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalRecordLang.g:1479:2: (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==22) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRecordLang.g:1479:4: otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalRecordLang.g:1483:1: ( (lv_literals_3_0= ruleLiteral ) )
            	    // InternalRecordLang.g:1484:1: (lv_literals_3_0= ruleLiteral )
            	    {
            	    // InternalRecordLang.g:1484:1: (lv_literals_3_0= ruleLiteral )
            	    // InternalRecordLang.g:1485:3: lv_literals_3_0= ruleLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_literals_3_0=ruleLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArrayLiteralRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"literals",
            	              		lv_literals_3_0, 
            	              		"kieker.develop.rl.RecordLang.Literal");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayLiteralAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArrayLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalRecordLang.g:1513:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalRecordLang.g:1514:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalRecordLang.g:1515:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalRecordLang.g:1522:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalRecordLang.g:1525:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalRecordLang.g:1526:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalRecordLang.g:1526:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalRecordLang.g:1527:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalRecordLang.g:1527:1: (lv_value_0_0= RULE_STRING )
            // InternalRecordLang.g:1528:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalRecordLang.g:1552:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalRecordLang.g:1553:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalRecordLang.g:1554:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalRecordLang.g:1561:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalRecordLang.g:1564:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalRecordLang.g:1565:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalRecordLang.g:1565:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalRecordLang.g:1566:1: (lv_value_0_0= RULE_INT )
            {
            // InternalRecordLang.g:1566:1: (lv_value_0_0= RULE_INT )
            // InternalRecordLang.g:1567:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"kieker.develop.rl.RecordLang.INT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleFloatLiteral"
    // InternalRecordLang.g:1591:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // InternalRecordLang.g:1592:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // InternalRecordLang.g:1593:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // InternalRecordLang.g:1600:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalRecordLang.g:1603:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalRecordLang.g:1604:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalRecordLang.g:1604:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalRecordLang.g:1605:1: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalRecordLang.g:1605:1: (lv_value_0_0= RULE_FLOAT )
            // InternalRecordLang.g:1606:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFloatLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"kieker.develop.rl.RecordLang.FLOAT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalRecordLang.g:1630:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalRecordLang.g:1631:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalRecordLang.g:1632:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalRecordLang.g:1639:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalRecordLang.g:1642:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalRecordLang.g:1643:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalRecordLang.g:1643:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalRecordLang.g:1644:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalRecordLang.g:1644:1: (lv_value_0_0= RULE_BOOLEAN )
            // InternalRecordLang.g:1645:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"kieker.develop.rl.RecordLang.BOOLEAN");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleConstantLiteral"
    // InternalRecordLang.g:1669:1: entryRuleConstantLiteral returns [EObject current=null] : iv_ruleConstantLiteral= ruleConstantLiteral EOF ;
    public final EObject entryRuleConstantLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantLiteral = null;


        try {
            // InternalRecordLang.g:1670:2: (iv_ruleConstantLiteral= ruleConstantLiteral EOF )
            // InternalRecordLang.g:1671:2: iv_ruleConstantLiteral= ruleConstantLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstantLiteral=ruleConstantLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstantLiteral"


    // $ANTLR start "ruleConstantLiteral"
    // InternalRecordLang.g:1678:1: ruleConstantLiteral returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleConstantLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalRecordLang.g:1681:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRecordLang.g:1682:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRecordLang.g:1682:1: ( (otherlv_0= RULE_ID ) )
            // InternalRecordLang.g:1683:1: (otherlv_0= RULE_ID )
            {
            // InternalRecordLang.g:1683:1: (otherlv_0= RULE_ID )
            // InternalRecordLang.g:1684:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantLiteralRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getConstantLiteralAccess().getValueConstantCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstantLiteral"


    // $ANTLR start "entryRuleBuiltInValueLiteral"
    // InternalRecordLang.g:1703:1: entryRuleBuiltInValueLiteral returns [EObject current=null] : iv_ruleBuiltInValueLiteral= ruleBuiltInValueLiteral EOF ;
    public final EObject entryRuleBuiltInValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInValueLiteral = null;


        try {
            // InternalRecordLang.g:1704:2: (iv_ruleBuiltInValueLiteral= ruleBuiltInValueLiteral EOF )
            // InternalRecordLang.g:1705:2: iv_ruleBuiltInValueLiteral= ruleBuiltInValueLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltInValueLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBuiltInValueLiteral=ruleBuiltInValueLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltInValueLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBuiltInValueLiteral"


    // $ANTLR start "ruleBuiltInValueLiteral"
    // InternalRecordLang.g:1712:1: ruleBuiltInValueLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= 'KIEKER_VERSION' ) ) ) ;
    public final EObject ruleBuiltInValueLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalRecordLang.g:1715:28: ( ( () ( (lv_value_1_0= 'KIEKER_VERSION' ) ) ) )
            // InternalRecordLang.g:1716:1: ( () ( (lv_value_1_0= 'KIEKER_VERSION' ) ) )
            {
            // InternalRecordLang.g:1716:1: ( () ( (lv_value_1_0= 'KIEKER_VERSION' ) ) )
            // InternalRecordLang.g:1716:2: () ( (lv_value_1_0= 'KIEKER_VERSION' ) )
            {
            // InternalRecordLang.g:1716:2: ()
            // InternalRecordLang.g:1717:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBuiltInValueLiteralAccess().getBuiltInValueLiteralAction_0(),
                          current);
                  
            }

            }

            // InternalRecordLang.g:1722:2: ( (lv_value_1_0= 'KIEKER_VERSION' ) )
            // InternalRecordLang.g:1723:1: (lv_value_1_0= 'KIEKER_VERSION' )
            {
            // InternalRecordLang.g:1723:1: (lv_value_1_0= 'KIEKER_VERSION' )
            // InternalRecordLang.g:1724:3: lv_value_1_0= 'KIEKER_VERSION'
            {
            lv_value_1_0=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_value_1_0, grammarAccess.getBuiltInValueLiteralAccess().getValueKIEKER_VERSIONKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBuiltInValueLiteralRule());
              	        }
                     		setWithLastConsumed(current, "value", lv_value_1_0, "KIEKER_VERSION");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBuiltInValueLiteral"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalRecordLang.g:1745:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalRecordLang.g:1746:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalRecordLang.g:1747:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRecordLang.g:1754:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalRecordLang.g:1757:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalRecordLang.g:1758:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalRecordLang.g:1758:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalRecordLang.g:1758:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalRecordLang.g:1765:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==35) ) {
                    int LA34_2 = input.LA(2);

                    if ( (LA34_2==RULE_ID) && (synpred1_InternalRecordLang())) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalRecordLang.g:1765:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalRecordLang.g:1765:2: ( ( '.' )=>kw= '.' )
            	    // InternalRecordLang.g:1765:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalRecordLang.g:1788:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalRecordLang.g:1789:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalRecordLang.g:1790:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRecordLang.g:1797:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalRecordLang.g:1800:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // InternalRecordLang.g:1801:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // InternalRecordLang.g:1801:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // InternalRecordLang.g:1802:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_34);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalRecordLang.g:1812:1: (kw= '.' kw= '*' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==35) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRecordLang.g:1813:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,35,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "rulePropertyModifier"
    // InternalRecordLang.g:1832:1: rulePropertyModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'transient' ) | (enumLiteral_1= 'auto-increment' ) ) ;
    public final Enumerator rulePropertyModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalRecordLang.g:1834:28: ( ( (enumLiteral_0= 'transient' ) | (enumLiteral_1= 'auto-increment' ) ) )
            // InternalRecordLang.g:1835:1: ( (enumLiteral_0= 'transient' ) | (enumLiteral_1= 'auto-increment' ) )
            {
            // InternalRecordLang.g:1835:1: ( (enumLiteral_0= 'transient' ) | (enumLiteral_1= 'auto-increment' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            else if ( (LA36_0==41) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalRecordLang.g:1835:2: (enumLiteral_0= 'transient' )
                    {
                    // InternalRecordLang.g:1835:2: (enumLiteral_0= 'transient' )
                    // InternalRecordLang.g:1835:4: enumLiteral_0= 'transient'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPropertyModifierAccess().getTRANSIENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPropertyModifierAccess().getTRANSIENTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRecordLang.g:1841:6: (enumLiteral_1= 'auto-increment' )
                    {
                    // InternalRecordLang.g:1841:6: (enumLiteral_1= 'auto-increment' )
                    // InternalRecordLang.g:1841:8: enumLiteral_1= 'auto-increment'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPropertyModifierAccess().getINCREMENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getPropertyModifierAccess().getINCREMENTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertyModifier"

    // $ANTLR start synpred1_InternalRecordLang
    public final void synpred1_InternalRecordLang_fragment() throws RecognitionException {   
        // InternalRecordLang.g:1765:3: ( '.' )
        // InternalRecordLang.g:1766:2: '.'
        {
        match(input,35,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalRecordLang

    // Delegated rules

    public final boolean synpred1_InternalRecordLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalRecordLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000E078002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000E070002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000070002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000302A0100010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010280002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000040000801F0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000030280000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});

}
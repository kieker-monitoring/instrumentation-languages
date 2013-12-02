package de.cau.cs.se.instrumentation.rl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.se.instrumentation.rl.services.RecordLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalRecordLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'use'", "'.'", "'*'", "'pattern'", "':'", "','", "'{'", "'}'", "'tag'", "'abstract'", "'struct'", "'extends'", "'const'", "'='", "'['", "']'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=9;
    public static final int T__14=14;
    public static final int RULE_INT=6;
    public static final int RULE_WS=12;

    // delegates
    // delegators


        public InternalRecordLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRecordLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRecordLangParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g"; }



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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_packages_2_0= rulePackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_types_4_0= ruleType ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_packages_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_types_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:79:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_packages_2_0= rulePackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_types_4_0= ruleType ) )* ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_packages_2_0= rulePackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_types_4_0= ruleType ) )* )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_packages_2_0= rulePackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_types_4_0= ruleType ) )* )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:80:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_packages_2_0= rulePackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_types_4_0= ruleType ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleModel122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:85:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:85:1: (lv_name_1_0= ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:86:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModel143);
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
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:102:2: ( (lv_packages_2_0= rulePackage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:103:1: (lv_packages_2_0= rulePackage )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:103:1: (lv_packages_2_0= rulePackage )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:104:3: lv_packages_2_0= rulePackage
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePackage_in_ruleModel164);
            	    lv_packages_2_0=rulePackage();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"packages",
            	              		lv_packages_2_0, 
            	              		"Package");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:120:3: ( (lv_imports_3_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:121:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:121:1: (lv_imports_3_0= ruleImport )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:122:3: lv_imports_3_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel186);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_3_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:138:3: ( (lv_types_4_0= ruleType ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19||(LA3_0>=24 && LA3_0<=26)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:139:1: (lv_types_4_0= ruleType )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:139:1: (lv_types_4_0= ruleType )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:140:3: lv_types_4_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleType_in_ruleModel208);
            	    lv_types_4_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"types",
            	              		lv_types_4_0, 
            	              		"Type");
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:164:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:165:2: (iv_ruleImport= ruleImport EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:166:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport245);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport255); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:173:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:176:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:177:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:177:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:177:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport292); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:181:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:182:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:182:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:183:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport313);
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
                      		"QualifiedNameWithWildcard");
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


    // $ANTLR start "entryRulePackage"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:207:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:208:2: (iv_rulePackage= rulePackage EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:209:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage349);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage359); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:216:1: rulePackage returns [EObject current=null] : (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:219:28: ( (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:220:1: (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:220:1: (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:220:3: otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePackage396); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getUseKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:224:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:225:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:225:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:226:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage413); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPackageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:242:2: ( (otherlv_2= RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:243:1: (otherlv_2= RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:243:1: (otherlv_2= RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:244:3: otherlv_2= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPackageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePackage438); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getPackageEPackageCrossReference_2_0()); 
              	
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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:263:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:264:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:265:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName475);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName486); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:272:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:275:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:276:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:276:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:276:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName526); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:283:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==RULE_ID) && (synpred1_InternalRecordLang())) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:283:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:283:2: ( ( '.' )=>kw= '.' )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:283:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedName554); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName570); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:306:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:307:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:308:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard618);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard629); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:315:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:318:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:319:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:319:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:320:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard676);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:330:1: (kw= '.' kw= '*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:331:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedNameWithWildcard695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleQualifiedNameWithWildcard708); if (state.failed) return current;
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


    // $ANTLR start "entryRuleType"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:350:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:351:2: (iv_ruleType= ruleType EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:352:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType750);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType760); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:359:1: ruleType returns [EObject current=null] : (this_RecordType_0= ruleRecordType | this_PartialType_1= rulePartialType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_RecordType_0 = null;

        EObject this_PartialType_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:362:28: ( (this_RecordType_0= ruleRecordType | this_PartialType_1= rulePartialType ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:363:1: (this_RecordType_0= ruleRecordType | this_PartialType_1= rulePartialType )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:363:1: (this_RecordType_0= ruleRecordType | this_PartialType_1= rulePartialType )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=25 && LA6_0<=26)) ) {
                alt6=1;
            }
            else if ( (LA6_0==19||LA6_0==24) ) {
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:364:5: this_RecordType_0= ruleRecordType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRecordType_in_ruleType807);
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:374:5: this_PartialType_1= rulePartialType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getPartialTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePartialType_in_ruleType834);
                    this_PartialType_1=rulePartialType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PartialType_1; 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePartialType"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:390:1: entryRulePartialType returns [EObject current=null] : iv_rulePartialType= rulePartialType EOF ;
    public final EObject entryRulePartialType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialType = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:391:2: (iv_rulePartialType= rulePartialType EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:392:2: iv_rulePartialType= rulePartialType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPartialTypeRule()); 
            }
            pushFollow(FOLLOW_rulePartialType_in_entryRulePartialType869);
            iv_rulePartialType=rulePartialType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePartialType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePartialType879); if (state.failed) return current;

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
    // $ANTLR end "entryRulePartialType"


    // $ANTLR start "rulePartialType"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:399:1: rulePartialType returns [EObject current=null] : (this_PartialRecordType_0= rulePartialRecordType | this_TagType_1= ruleTagType ) ;
    public final EObject rulePartialType() throws RecognitionException {
        EObject current = null;

        EObject this_PartialRecordType_0 = null;

        EObject this_TagType_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:402:28: ( (this_PartialRecordType_0= rulePartialRecordType | this_TagType_1= ruleTagType ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:403:1: (this_PartialRecordType_0= rulePartialRecordType | this_TagType_1= ruleTagType )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:403:1: (this_PartialRecordType_0= rulePartialRecordType | this_TagType_1= ruleTagType )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:404:5: this_PartialRecordType_0= rulePartialRecordType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPartialTypeAccess().getPartialRecordTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePartialRecordType_in_rulePartialType926);
                    this_PartialRecordType_0=rulePartialRecordType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PartialRecordType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:414:5: this_TagType_1= ruleTagType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPartialTypeAccess().getTagTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTagType_in_rulePartialType953);
                    this_TagType_1=ruleTagType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TagType_1; 
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
    // $ANTLR end "rulePartialType"


    // $ANTLR start "entryRulePartialRecordType"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:430:1: entryRulePartialRecordType returns [EObject current=null] : iv_rulePartialRecordType= rulePartialRecordType EOF ;
    public final EObject entryRulePartialRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialRecordType = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:431:2: (iv_rulePartialRecordType= rulePartialRecordType EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:432:2: iv_rulePartialRecordType= rulePartialRecordType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPartialRecordTypeRule()); 
            }
            pushFollow(FOLLOW_rulePartialRecordType_in_entryRulePartialRecordType988);
            iv_rulePartialRecordType=rulePartialRecordType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePartialRecordType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePartialRecordType998); if (state.failed) return current;

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
    // $ANTLR end "entryRulePartialRecordType"


    // $ANTLR start "rulePartialRecordType"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:439:1: rulePartialRecordType returns [EObject current=null] : (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) | ( (lv_constants_8_0= ruleConstant ) ) )* otherlv_9= '}' ) ;
    public final EObject rulePartialRecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_properties_7_0 = null;

        EObject lv_constants_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:442:28: ( (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) | ( (lv_constants_8_0= ruleConstant ) ) )* otherlv_9= '}' ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:443:1: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) | ( (lv_constants_8_0= ruleConstant ) ) )* otherlv_9= '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:443:1: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) | ( (lv_constants_8_0= ruleConstant ) ) )* otherlv_9= '}' )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:443:3: otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) | ( (lv_constants_8_0= ruleConstant ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulePartialRecordType1035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPartialRecordTypeAccess().getPatternKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:447:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:448:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:448:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:449:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePartialRecordType1052); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getPartialRecordTypeAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPartialRecordTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:465:2: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:465:4: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_rulePartialRecordType1070); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPartialRecordTypeAccess().getColonKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:469:1: ( ( ruleQualifiedName ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:470:1: ( ruleQualifiedName )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:470:1: ( ruleQualifiedName )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:471:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPartialRecordTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPartialRecordTypeAccess().getParentsPartialTypeCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePartialRecordType1093);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:484:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==21) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:484:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_rulePartialRecordType1106); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getPartialRecordTypeAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:488:1: ( ( ruleQualifiedName ) )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:489:1: ( ruleQualifiedName )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:489:1: ( ruleQualifiedName )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:490:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getPartialRecordTypeRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPartialRecordTypeAccess().getParentsPartialTypeCrossReference_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_rulePartialRecordType1129);
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
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_rulePartialRecordType1145); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPartialRecordTypeAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:507:1: ( ( (lv_properties_7_0= ruleProperty ) ) | ( (lv_constants_8_0= ruleConstant ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }
                else if ( (LA10_0==28) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:507:2: ( (lv_properties_7_0= ruleProperty ) )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:507:2: ( (lv_properties_7_0= ruleProperty ) )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:508:1: (lv_properties_7_0= ruleProperty )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:508:1: (lv_properties_7_0= ruleProperty )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:509:3: lv_properties_7_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPartialRecordTypeAccess().getPropertiesPropertyParserRuleCall_4_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_rulePartialRecordType1167);
            	    lv_properties_7_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPartialRecordTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_7_0, 
            	              		"Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:526:6: ( (lv_constants_8_0= ruleConstant ) )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:526:6: ( (lv_constants_8_0= ruleConstant ) )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:527:1: (lv_constants_8_0= ruleConstant )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:527:1: (lv_constants_8_0= ruleConstant )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:528:3: lv_constants_8_0= ruleConstant
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPartialRecordTypeAccess().getConstantsConstantParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConstant_in_rulePartialRecordType1194);
            	    lv_constants_8_0=ruleConstant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPartialRecordTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constants",
            	              		lv_constants_8_0, 
            	              		"Constant");
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

            otherlv_9=(Token)match(input,23,FOLLOW_23_in_rulePartialRecordType1208); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getPartialRecordTypeAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "rulePartialRecordType"


    // $ANTLR start "entryRuleTagType"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:556:1: entryRuleTagType returns [EObject current=null] : iv_ruleTagType= ruleTagType EOF ;
    public final EObject entryRuleTagType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagType = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:557:2: (iv_ruleTagType= ruleTagType EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:558:2: iv_ruleTagType= ruleTagType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagTypeRule()); 
            }
            pushFollow(FOLLOW_ruleTagType_in_entryRuleTagType1244);
            iv_ruleTagType=ruleTagType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagType1254); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTagType"


    // $ANTLR start "ruleTagType"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:565:1: ruleTagType returns [EObject current=null] : (otherlv_0= 'tag' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? ) ;
    public final EObject ruleTagType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:568:28: ( (otherlv_0= 'tag' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:569:1: (otherlv_0= 'tag' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:569:1: (otherlv_0= 'tag' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:569:3: otherlv_0= 'tag' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleTagType1291); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagTypeAccess().getTagKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:573:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:574:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:574:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:575:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTagType1308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getTagTypeAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTagTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:591:2: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:591:4: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleTagType1326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTagTypeAccess().getColonKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:595:1: ( ( ruleQualifiedName ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:596:1: ( ruleQualifiedName )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:596:1: ( ruleQualifiedName )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:597:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTagTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTagTypeAccess().getParentsTagTypeCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTagType1349);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:610:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==21) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:610:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleTagType1362); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getTagTypeAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:614:1: ( ( ruleQualifiedName ) )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:615:1: ( ruleQualifiedName )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:615:1: ( ruleQualifiedName )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:616:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTagTypeRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTagTypeAccess().getParentsTagTypeCrossReference_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTagType1385);
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
                    	    break loop11;
                        }
                    } while (true);


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
    // $ANTLR end "ruleTagType"


    // $ANTLR start "entryRuleRecordType"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:637:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:638:2: (iv_ruleRecordType= ruleRecordType EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:639:2: iv_ruleRecordType= ruleRecordType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordTypeRule()); 
            }
            pushFollow(FOLLOW_ruleRecordType_in_entryRuleRecordType1425);
            iv_ruleRecordType=ruleRecordType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordType1435); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:646:1: ruleRecordType returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= ':' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_9= '{' ( ( (lv_properties_10_0= ruleProperty ) ) | ( (lv_constants_11_0= ruleConstant ) ) )* otherlv_12= '}' ) ;
    public final EObject ruleRecordType() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_properties_10_0 = null;

        EObject lv_constants_11_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:649:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= ':' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_9= '{' ( ( (lv_properties_10_0= ruleProperty ) ) | ( (lv_constants_11_0= ruleConstant ) ) )* otherlv_12= '}' ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:650:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= ':' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_9= '{' ( ( (lv_properties_10_0= ruleProperty ) ) | ( (lv_constants_11_0= ruleConstant ) ) )* otherlv_12= '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:650:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= ':' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_9= '{' ( ( (lv_properties_10_0= ruleProperty ) ) | ( (lv_constants_11_0= ruleConstant ) ) )* otherlv_12= '}' )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:650:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'struct' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= ':' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_9= '{' ( ( (lv_properties_10_0= ruleProperty ) ) | ( (lv_constants_11_0= ruleConstant ) ) )* otherlv_12= '}'
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:650:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:651:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:651:1: (lv_abstract_0_0= 'abstract' )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:652:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,25,FOLLOW_25_in_ruleRecordType1478); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_abstract_0_0, grammarAccess.getRecordTypeAccess().getAbstractAbstractKeyword_0_0());
                          
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

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleRecordType1504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRecordTypeAccess().getStructKeyword_1());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:669:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:670:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:670:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:671:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecordType1521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRecordTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:687:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:687:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleRecordType1539); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getRecordTypeAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:691:1: ( ( ruleQualifiedName ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:692:1: ( ruleQualifiedName )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:692:1: ( ruleQualifiedName )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:693:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRecordTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getParentRecordTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleRecordType1562);
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

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:706:4: (otherlv_5= ':' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:706:6: otherlv_5= ':' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleRecordType1577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getRecordTypeAccess().getColonKeyword_4_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:710:1: ( ( ruleQualifiedName ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:711:1: ( ruleQualifiedName )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:711:1: ( ruleQualifiedName )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:712:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRecordTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getParentsPartialTypeCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleRecordType1600);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:725:2: (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:725:4: otherlv_7= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleRecordType1613); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getRecordTypeAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:729:1: ( ( ruleQualifiedName ) )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:730:1: ( ruleQualifiedName )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:730:1: ( ruleQualifiedName )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:731:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getRecordTypeRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getParentsPartialTypeCrossReference_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleRecordType1636);
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
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleRecordType1652); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:748:1: ( ( (lv_properties_10_0= ruleProperty ) ) | ( (lv_constants_11_0= ruleConstant ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }
                else if ( (LA17_0==28) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:748:2: ( (lv_properties_10_0= ruleProperty ) )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:748:2: ( (lv_properties_10_0= ruleProperty ) )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:749:1: (lv_properties_10_0= ruleProperty )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:749:1: (lv_properties_10_0= ruleProperty )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:750:3: lv_properties_10_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getPropertiesPropertyParserRuleCall_6_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_ruleRecordType1674);
            	    lv_properties_10_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_10_0, 
            	              		"Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:767:6: ( (lv_constants_11_0= ruleConstant ) )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:767:6: ( (lv_constants_11_0= ruleConstant ) )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:768:1: (lv_constants_11_0= ruleConstant )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:768:1: (lv_constants_11_0= ruleConstant )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:769:3: lv_constants_11_0= ruleConstant
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getConstantsConstantParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConstant_in_ruleRecordType1701);
            	    lv_constants_11_0=ruleConstant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constants",
            	              		lv_constants_11_0, 
            	              		"Constant");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleRecordType1715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_7());
                  
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:797:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:798:2: (iv_ruleConstant= ruleConstant EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:799:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant1751);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant1761); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:806:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:809:28: ( (otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:810:1: (otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:810:1: (otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:810:3: otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleConstant1798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:814:1: ( (lv_type_1_0= ruleClassifier ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:815:1: (lv_type_1_0= ruleClassifier )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:815:1: (lv_type_1_0= ruleClassifier )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:816:3: lv_type_1_0= ruleClassifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAccess().getTypeClassifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleClassifier_in_ruleConstant1819);
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
                      		"Classifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:832:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:833:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:833:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:834:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant1836); if (state.failed) return current;
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
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleConstant1853); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getEqualsSignKeyword_3());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:854:1: ( (lv_value_4_0= ruleLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:855:1: (lv_value_4_0= ruleLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:855:1: (lv_value_4_0= ruleLiteral )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:856:3: lv_value_4_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAccess().getValueLiteralParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleConstant1874);
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
                      		"Literal");
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:880:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:881:2: (iv_ruleProperty= ruleProperty EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:882:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1910);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1920); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:889:1: ruleProperty returns [EObject current=null] : ( ( (lv_type_0_0= ruleClassifier ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '{' ( (lv_properties_3_0= ruleReferenceProperty ) )* otherlv_4= '}' ) | (otherlv_5= '=' ( (lv_value_6_0= ruleLiteral ) ) ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_type_0_0 = null;

        EObject lv_properties_3_0 = null;

        EObject lv_value_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:892:28: ( ( ( (lv_type_0_0= ruleClassifier ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '{' ( (lv_properties_3_0= ruleReferenceProperty ) )* otherlv_4= '}' ) | (otherlv_5= '=' ( (lv_value_6_0= ruleLiteral ) ) ) ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:893:1: ( ( (lv_type_0_0= ruleClassifier ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '{' ( (lv_properties_3_0= ruleReferenceProperty ) )* otherlv_4= '}' ) | (otherlv_5= '=' ( (lv_value_6_0= ruleLiteral ) ) ) ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:893:1: ( ( (lv_type_0_0= ruleClassifier ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '{' ( (lv_properties_3_0= ruleReferenceProperty ) )* otherlv_4= '}' ) | (otherlv_5= '=' ( (lv_value_6_0= ruleLiteral ) ) ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:893:2: ( (lv_type_0_0= ruleClassifier ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '{' ( (lv_properties_3_0= ruleReferenceProperty ) )* otherlv_4= '}' ) | (otherlv_5= '=' ( (lv_value_6_0= ruleLiteral ) ) ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:893:2: ( (lv_type_0_0= ruleClassifier ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:894:1: (lv_type_0_0= ruleClassifier )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:894:1: (lv_type_0_0= ruleClassifier )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:895:3: lv_type_0_0= ruleClassifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeClassifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleClassifier_in_ruleProperty1966);
            lv_type_0_0=ruleClassifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"Classifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:911:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:912:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:912:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:913:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty1983); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:929:2: ( (otherlv_2= '{' ( (lv_properties_3_0= ruleReferenceProperty ) )* otherlv_4= '}' ) | (otherlv_5= '=' ( (lv_value_6_0= ruleLiteral ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            else if ( (LA19_0==29) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:929:3: (otherlv_2= '{' ( (lv_properties_3_0= ruleReferenceProperty ) )* otherlv_4= '}' )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:929:3: (otherlv_2= '{' ( (lv_properties_3_0= ruleReferenceProperty ) )* otherlv_4= '}' )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:929:5: otherlv_2= '{' ( (lv_properties_3_0= ruleReferenceProperty ) )* otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleProperty2002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_2_0_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:933:1: ( (lv_properties_3_0= ruleReferenceProperty ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:934:1: (lv_properties_3_0= ruleReferenceProperty )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:934:1: (lv_properties_3_0= ruleReferenceProperty )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:935:3: lv_properties_3_0= ruleReferenceProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPropertyAccess().getPropertiesReferencePropertyParserRuleCall_2_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleReferenceProperty_in_ruleProperty2023);
                    	    lv_properties_3_0=ruleReferenceProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"properties",
                    	              		lv_properties_3_0, 
                    	              		"ReferenceProperty");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleProperty2036); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_2_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:956:6: (otherlv_5= '=' ( (lv_value_6_0= ruleLiteral ) ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:956:6: (otherlv_5= '=' ( (lv_value_6_0= ruleLiteral ) ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:956:8: otherlv_5= '=' ( (lv_value_6_0= ruleLiteral ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleProperty2056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2_1_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:960:1: ( (lv_value_6_0= ruleLiteral ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:961:1: (lv_value_6_0= ruleLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:961:1: (lv_value_6_0= ruleLiteral )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:962:3: lv_value_6_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getValueLiteralParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleProperty2077);
                    lv_value_6_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_6_0, 
                              		"Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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


    // $ANTLR start "entryRuleClassifier"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:986:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:987:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:988:2: iv_ruleClassifier= ruleClassifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierRule()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier2115);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier2125); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:995:1: ruleClassifier returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ( (lv_sizes_3_0= ruleArraySize ) )* ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_sizes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:998:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ( (lv_sizes_3_0= ruleArraySize ) )* ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:999:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ( (lv_sizes_3_0= ruleArraySize ) )* )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:999:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ( (lv_sizes_3_0= ruleArraySize ) )* )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:999:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ( (lv_sizes_3_0= ruleArraySize ) )*
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:999:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==17) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:999:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.'
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:999:3: ( (otherlv_0= RULE_ID ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1000:1: (otherlv_0= RULE_ID )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1000:1: (otherlv_0= RULE_ID )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1001:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassifierRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassifier2171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getClassifierAccess().getPackagePackageCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleClassifier2183); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getClassifierAccess().getFullStopKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1016:3: ( (otherlv_2= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1017:1: (otherlv_2= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1017:1: (otherlv_2= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1018:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getClassifierRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassifier2205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getClassifierAccess().getClassEClassifierCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1029:2: ( (lv_sizes_3_0= ruleArraySize ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1030:1: (lv_sizes_3_0= ruleArraySize )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1030:1: (lv_sizes_3_0= ruleArraySize )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1031:3: lv_sizes_3_0= ruleArraySize
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassifierAccess().getSizesArraySizeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArraySize_in_ruleClassifier2226);
            	    lv_sizes_3_0=ruleArraySize();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassifierRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sizes",
            	              		lv_sizes_3_0, 
            	              		"ArraySize");
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1055:1: entryRuleArraySize returns [EObject current=null] : iv_ruleArraySize= ruleArraySize EOF ;
    public final EObject entryRuleArraySize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySize = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1056:2: (iv_ruleArraySize= ruleArraySize EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1057:2: iv_ruleArraySize= ruleArraySize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArraySizeRule()); 
            }
            pushFollow(FOLLOW_ruleArraySize_in_entryRuleArraySize2263);
            iv_ruleArraySize=ruleArraySize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArraySize; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArraySize2273); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1064:1: ruleArraySize returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) ;
    public final EObject ruleArraySize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1067:28: ( ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1068:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1068:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1068:2: () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']'
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1068:2: ()
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1069:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArraySizeAccess().getArraySizeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleArraySize2319); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArraySizeAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1078:1: ( (lv_size_2_0= RULE_INT ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1079:1: (lv_size_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1079:1: (lv_size_2_0= RULE_INT )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1080:3: lv_size_2_0= RULE_INT
                    {
                    lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArraySize2336); if (state.failed) return current;
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
                              		"INT");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleArraySize2354); if (state.failed) return current;
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


    // $ANTLR start "entryRuleReferenceProperty"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1108:1: entryRuleReferenceProperty returns [EObject current=null] : iv_ruleReferenceProperty= ruleReferenceProperty EOF ;
    public final EObject entryRuleReferenceProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceProperty = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1109:2: (iv_ruleReferenceProperty= ruleReferenceProperty EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1110:2: iv_ruleReferenceProperty= ruleReferenceProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferencePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty2390);
            iv_ruleReferenceProperty=ruleReferenceProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceProperty2400); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceProperty"


    // $ANTLR start "ruleReferenceProperty"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1117:1: ruleReferenceProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}' ) ;
    public final EObject ruleReferenceProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_properties_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1120:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}' ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1121:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1121:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}' )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1121:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}'
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1121:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1122:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1122:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1123:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferencePropertyRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceProperty2445); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getReferencePropertyAccess().getRefEStructuralFeatureCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleReferenceProperty2457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReferencePropertyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1138:1: ( (lv_properties_2_0= ruleReferenceProperty ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1139:1: (lv_properties_2_0= ruleReferenceProperty )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1139:1: (lv_properties_2_0= ruleReferenceProperty )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1140:3: lv_properties_2_0= ruleReferenceProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferencePropertyAccess().getPropertiesReferencePropertyParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleReferenceProperty_in_ruleReferenceProperty2478);
            	    lv_properties_2_0=ruleReferenceProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferencePropertyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_2_0, 
            	              		"ReferenceProperty");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleReferenceProperty2491); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getReferencePropertyAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleReferenceProperty"


    // $ANTLR start "entryRuleLiteral"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1168:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1169:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1170:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2527);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2537); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1177:1: ruleLiteral returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ConstantLiteral_4= ruleConstantLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_FloatLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;

        EObject this_ConstantLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1180:28: ( (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ConstantLiteral_4= ruleConstantLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1181:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ConstantLiteral_4= ruleConstantLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1181:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ConstantLiteral_4= ruleConstantLiteral )
            int alt24=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt24=1;
                }
                break;
            case RULE_INT:
                {
                alt24=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt24=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt24=4;
                }
                break;
            case RULE_ID:
                {
                alt24=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1182:5: this_StringLiteral_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral2584);
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1192:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral2611);
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1202:5: this_FloatLiteral_2= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_ruleLiteral2638);
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1212:5: this_BooleanLiteral_3= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral2665);
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1222:5: this_ConstantLiteral_4= ruleConstantLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getConstantLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantLiteral_in_ruleLiteral2692);
                    this_ConstantLiteral_4=ruleConstantLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantLiteral_4; 
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


    // $ANTLR start "entryRuleStringLiteral"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1238:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1239:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1240:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2727);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2737); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1247:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1250:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1251:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1251:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1252:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1252:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1253:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral2778); if (state.failed) return current;
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
                      		"STRING");
              	    
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1277:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1278:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1279:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral2818);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral2828); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1286:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1289:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1290:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1290:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1291:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1291:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1292:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral2869); if (state.failed) return current;
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
                      		"INT");
              	    
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1316:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1317:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1318:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral2909);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral2919); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1325:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1328:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1329:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1329:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1330:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1330:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1331:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatLiteral2960); if (state.failed) return current;
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
                      		"FLOAT");
              	    
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1355:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1356:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1357:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral3000);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral3010); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1364:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1367:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1368:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1368:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1369:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1369:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1370:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanLiteral3051); if (state.failed) return current;
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
                      		"BOOLEAN");
              	    
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1394:1: entryRuleConstantLiteral returns [EObject current=null] : iv_ruleConstantLiteral= ruleConstantLiteral EOF ;
    public final EObject entryRuleConstantLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1395:2: (iv_ruleConstantLiteral= ruleConstantLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1396:2: iv_ruleConstantLiteral= ruleConstantLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleConstantLiteral_in_entryRuleConstantLiteral3091);
            iv_ruleConstantLiteral=ruleConstantLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantLiteral3101); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1403:1: ruleConstantLiteral returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleConstantLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1406:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1407:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1407:1: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1408:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1408:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1409:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantLiteralRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantLiteral3145); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalRecordLang
    public final void synpred1_InternalRecordLang_fragment() throws RecognitionException {   
        // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:283:3: ( '.' )
        // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:284:2: '.'
        {
        match(input,17,FOLLOW_17_in_synpred1_InternalRecordLang545); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel143 = new BitSet(new long[]{0x0000000007098002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel164 = new BitSet(new long[]{0x0000000007098002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel186 = new BitSet(new long[]{0x0000000007088002L});
    public static final BitSet FOLLOW_ruleType_in_ruleModel208 = new BitSet(new long[]{0x0000000007080002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePackage396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage413 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePackage438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName526 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedName554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName570 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard676 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedNameWithWildcard695 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQualifiedNameWithWildcard708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_ruleType807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialType_in_ruleType834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialType_in_entryRulePartialType869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartialType879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialRecordType_in_rulePartialType926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagType_in_rulePartialType953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialRecordType_in_entryRulePartialRecordType988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartialRecordType998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePartialRecordType1035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePartialRecordType1052 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_20_in_rulePartialRecordType1070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePartialRecordType1093 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_rulePartialRecordType1106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePartialRecordType1129 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_rulePartialRecordType1145 = new BitSet(new long[]{0x0000000010800010L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePartialRecordType1167 = new BitSet(new long[]{0x0000000010800010L});
    public static final BitSet FOLLOW_ruleConstant_in_rulePartialRecordType1194 = new BitSet(new long[]{0x0000000010800010L});
    public static final BitSet FOLLOW_23_in_rulePartialRecordType1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagType_in_entryRuleTagType1244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagType1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTagType1291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTagType1308 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleTagType1326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTagType1349 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleTagType1362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTagType1385 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleRecordType_in_entryRuleRecordType1425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordType1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRecordType1478 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleRecordType1504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecordType1521 = new BitSet(new long[]{0x0000000008500000L});
    public static final BitSet FOLLOW_27_in_ruleRecordType1539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRecordType1562 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_20_in_ruleRecordType1577 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRecordType1600 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleRecordType1613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRecordType1636 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleRecordType1652 = new BitSet(new long[]{0x0000000010800010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleRecordType1674 = new BitSet(new long[]{0x0000000010800010L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleRecordType1701 = new BitSet(new long[]{0x0000000010800010L});
    public static final BitSet FOLLOW_23_in_ruleRecordType1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant1751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleConstant1798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleConstant1819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant1836 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleConstant1853 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleConstant1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleProperty1966 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty1983 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_22_in_ruleProperty2002 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_ruleProperty2023 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleProperty2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleProperty2056 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleProperty2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier2115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifier2171 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleClassifier2183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifier2205 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleArraySize_in_ruleClassifier2226 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleArraySize_in_entryRuleArraySize2263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArraySize2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleArraySize2319 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArraySize2336 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleArraySize2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty2390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceProperty2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceProperty2445 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleReferenceProperty2457 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_ruleReferenceProperty2478 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleReferenceProperty2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_ruleLiteral2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantLiteral_in_ruleLiteral2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral2818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral2909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatLiteral2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral3000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanLiteral3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantLiteral_in_entryRuleConstantLiteral3091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantLiteral3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantLiteral3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred1_InternalRecordLang545 = new BitSet(new long[]{0x0000000000000002L});

}
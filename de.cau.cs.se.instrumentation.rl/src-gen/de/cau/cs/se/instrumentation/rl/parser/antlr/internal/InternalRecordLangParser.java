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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'use'", "'.'", "'*'", "'template'", "':'", "','", "'{'", "'}'", "'abstract'", "'entity'", "'extends'", "'const'", "'='", "'alias'", "'as'", "'['", "']'"
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
    public static final int T__32=32;
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

                if ( (LA3_0==19||(LA3_0>=24 && LA3_0<=25)) ) {
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:359:1: ruleType returns [EObject current=null] : (this_RecordType_0= ruleRecordType | this_PartialRecordType_1= rulePartialRecordType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_RecordType_0 = null;

        EObject this_PartialRecordType_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:362:28: ( (this_RecordType_0= ruleRecordType | this_PartialRecordType_1= rulePartialRecordType ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:363:1: (this_RecordType_0= ruleRecordType | this_PartialRecordType_1= rulePartialRecordType )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:363:1: (this_RecordType_0= ruleRecordType | this_PartialRecordType_1= rulePartialRecordType )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=24 && LA6_0<=25)) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:374:5: this_PartialRecordType_1= rulePartialRecordType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getPartialRecordTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePartialRecordType_in_ruleType834);
                    this_PartialRecordType_1=rulePartialRecordType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PartialRecordType_1; 
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


    // $ANTLR start "entryRulePartialRecordType"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:390:1: entryRulePartialRecordType returns [EObject current=null] : iv_rulePartialRecordType= rulePartialRecordType EOF ;
    public final EObject entryRulePartialRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialRecordType = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:391:2: (iv_rulePartialRecordType= rulePartialRecordType EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:392:2: iv_rulePartialRecordType= rulePartialRecordType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPartialRecordTypeRule()); 
            }
            pushFollow(FOLLOW_rulePartialRecordType_in_entryRulePartialRecordType869);
            iv_rulePartialRecordType=rulePartialRecordType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePartialRecordType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePartialRecordType879); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:399:1: rulePartialRecordType returns [EObject current=null] : (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) | ( (lv_constants_8_0= ruleConstant ) ) )* otherlv_9= '}' )? ) ;
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
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:402:28: ( (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) | ( (lv_constants_8_0= ruleConstant ) ) )* otherlv_9= '}' )? ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:403:1: (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) | ( (lv_constants_8_0= ruleConstant ) ) )* otherlv_9= '}' )? )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:403:1: (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) | ( (lv_constants_8_0= ruleConstant ) ) )* otherlv_9= '}' )? )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:403:3: otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) | ( (lv_constants_8_0= ruleConstant ) ) )* otherlv_9= '}' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulePartialRecordType916); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPartialRecordTypeAccess().getTemplateKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:407:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:408:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:408:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:409:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePartialRecordType933); if (state.failed) return current;
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

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:425:2: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:425:4: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_rulePartialRecordType951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPartialRecordTypeAccess().getColonKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:429:1: ( ( ruleQualifiedName ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:430:1: ( ruleQualifiedName )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:430:1: ( ruleQualifiedName )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:431:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPartialRecordTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPartialRecordTypeAccess().getParentsPartialRecordTypeCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePartialRecordType974);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:444:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:444:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_rulePartialRecordType987); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getPartialRecordTypeAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:448:1: ( ( ruleQualifiedName ) )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:449:1: ( ruleQualifiedName )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:449:1: ( ruleQualifiedName )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:450:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getPartialRecordTypeRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPartialRecordTypeAccess().getParentsPartialRecordTypeCrossReference_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_rulePartialRecordType1010);
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
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:463:6: (otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) | ( (lv_constants_8_0= ruleConstant ) ) )* otherlv_9= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:463:8: otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) | ( (lv_constants_8_0= ruleConstant ) ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_rulePartialRecordType1027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getPartialRecordTypeAccess().getLeftCurlyBracketKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:467:1: ( ( (lv_properties_7_0= ruleProperty ) ) | ( (lv_constants_8_0= ruleConstant ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID||LA9_0==29) ) {
                            alt9=1;
                        }
                        else if ( (LA9_0==27) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:467:2: ( (lv_properties_7_0= ruleProperty ) )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:467:2: ( (lv_properties_7_0= ruleProperty ) )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:468:1: (lv_properties_7_0= ruleProperty )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:468:1: (lv_properties_7_0= ruleProperty )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:469:3: lv_properties_7_0= ruleProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPartialRecordTypeAccess().getPropertiesPropertyParserRuleCall_3_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleProperty_in_rulePartialRecordType1049);
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
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:486:6: ( (lv_constants_8_0= ruleConstant ) )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:486:6: ( (lv_constants_8_0= ruleConstant ) )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:487:1: (lv_constants_8_0= ruleConstant )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:487:1: (lv_constants_8_0= ruleConstant )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:488:3: lv_constants_8_0= ruleConstant
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPartialRecordTypeAccess().getConstantsConstantParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleConstant_in_rulePartialRecordType1076);
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
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_rulePartialRecordType1090); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getPartialRecordTypeAccess().getRightCurlyBracketKeyword_3_2());
                          
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
    // $ANTLR end "rulePartialRecordType"


    // $ANTLR start "entryRuleRecordType"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:516:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:517:2: (iv_ruleRecordType= ruleRecordType EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:518:2: iv_ruleRecordType= ruleRecordType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordTypeRule()); 
            }
            pushFollow(FOLLOW_ruleRecordType_in_entryRuleRecordType1128);
            iv_ruleRecordType=ruleRecordType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordType1138); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:525:1: ruleRecordType returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= ':' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_9= '{' ( ( (lv_properties_10_0= ruleProperty ) ) | ( (lv_constants_11_0= ruleConstant ) ) )* otherlv_12= '}' )? ) ;
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
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:528:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= ':' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_9= '{' ( ( (lv_properties_10_0= ruleProperty ) ) | ( (lv_constants_11_0= ruleConstant ) ) )* otherlv_12= '}' )? ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:529:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= ':' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_9= '{' ( ( (lv_properties_10_0= ruleProperty ) ) | ( (lv_constants_11_0= ruleConstant ) ) )* otherlv_12= '}' )? )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:529:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= ':' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_9= '{' ( ( (lv_properties_10_0= ruleProperty ) ) | ( (lv_constants_11_0= ruleConstant ) ) )* otherlv_12= '}' )? )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:529:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= ':' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_9= '{' ( ( (lv_properties_10_0= ruleProperty ) ) | ( (lv_constants_11_0= ruleConstant ) ) )* otherlv_12= '}' )?
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:529:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:530:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:530:1: (lv_abstract_0_0= 'abstract' )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:531:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,24,FOLLOW_24_in_ruleRecordType1181); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleRecordType1207); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRecordTypeAccess().getEntityKeyword_1());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:548:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:549:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:549:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:550:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecordType1224); if (state.failed) return current;
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

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:566:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:566:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleRecordType1242); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getRecordTypeAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:570:1: ( ( ruleQualifiedName ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:571:1: ( ruleQualifiedName )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:571:1: ( ruleQualifiedName )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:572:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRecordTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getParentRecordTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleRecordType1265);
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

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:585:4: (otherlv_5= ':' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:585:6: otherlv_5= ':' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleRecordType1280); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getRecordTypeAccess().getColonKeyword_4_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:589:1: ( ( ruleQualifiedName ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:590:1: ( ruleQualifiedName )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:590:1: ( ruleQualifiedName )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:591:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRecordTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getParentsPartialRecordTypeCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleRecordType1303);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:604:2: (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==21) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:604:4: otherlv_7= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleRecordType1316); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getRecordTypeAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:608:1: ( ( ruleQualifiedName ) )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:609:1: ( ruleQualifiedName )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:609:1: ( ruleQualifiedName )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:610:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getRecordTypeRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getParentsPartialRecordTypeCrossReference_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleRecordType1339);
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
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:623:6: (otherlv_9= '{' ( ( (lv_properties_10_0= ruleProperty ) ) | ( (lv_constants_11_0= ruleConstant ) ) )* otherlv_12= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:623:8: otherlv_9= '{' ( ( (lv_properties_10_0= ruleProperty ) ) | ( (lv_constants_11_0= ruleConstant ) ) )* otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleRecordType1356); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_5_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:627:1: ( ( (lv_properties_10_0= ruleProperty ) ) | ( (lv_constants_11_0= ruleConstant ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID||LA15_0==29) ) {
                            alt15=1;
                        }
                        else if ( (LA15_0==27) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:627:2: ( (lv_properties_10_0= ruleProperty ) )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:627:2: ( (lv_properties_10_0= ruleProperty ) )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:628:1: (lv_properties_10_0= ruleProperty )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:628:1: (lv_properties_10_0= ruleProperty )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:629:3: lv_properties_10_0= ruleProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getPropertiesPropertyParserRuleCall_5_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleProperty_in_ruleRecordType1378);
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
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:646:6: ( (lv_constants_11_0= ruleConstant ) )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:646:6: ( (lv_constants_11_0= ruleConstant ) )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:647:1: (lv_constants_11_0= ruleConstant )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:647:1: (lv_constants_11_0= ruleConstant )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:648:3: lv_constants_11_0= ruleConstant
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getConstantsConstantParserRuleCall_5_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleConstant_in_ruleRecordType1405);
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
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleRecordType1419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_5_2());
                          
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:676:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:677:2: (iv_ruleConstant= ruleConstant EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:678:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant1457);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant1467); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:685:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:688:28: ( (otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:689:1: (otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:689:1: (otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:689:3: otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleConstant1504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:693:1: ( (lv_type_1_0= ruleClassifier ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:694:1: (lv_type_1_0= ruleClassifier )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:694:1: (lv_type_1_0= ruleClassifier )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:695:3: lv_type_1_0= ruleClassifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAccess().getTypeClassifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleClassifier_in_ruleConstant1525);
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

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:711:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:712:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:712:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:713:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant1542); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleConstant1559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getEqualsSignKeyword_3());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:733:1: ( (lv_value_4_0= ruleLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:734:1: (lv_value_4_0= ruleLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:734:1: (lv_value_4_0= ruleLiteral )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:735:3: lv_value_4_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAccess().getValueLiteralParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleConstant1580);
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:759:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:760:2: (iv_ruleProperty= ruleProperty EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:761:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1616);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1626); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:768:1: ruleProperty returns [EObject current=null] : ( ( ( (lv_type_0_0= ruleClassifier ) ) | (otherlv_1= 'alias' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '{' ( (lv_properties_6_0= ruleReferenceProperty ) )* otherlv_7= '}' ) | (otherlv_8= '=' ( (lv_value_9_0= ruleLiteral ) ) ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_type_0_0 = null;

        EObject lv_properties_6_0 = null;

        EObject lv_value_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:771:28: ( ( ( ( (lv_type_0_0= ruleClassifier ) ) | (otherlv_1= 'alias' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '{' ( (lv_properties_6_0= ruleReferenceProperty ) )* otherlv_7= '}' ) | (otherlv_8= '=' ( (lv_value_9_0= ruleLiteral ) ) ) )? ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:772:1: ( ( ( (lv_type_0_0= ruleClassifier ) ) | (otherlv_1= 'alias' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '{' ( (lv_properties_6_0= ruleReferenceProperty ) )* otherlv_7= '}' ) | (otherlv_8= '=' ( (lv_value_9_0= ruleLiteral ) ) ) )? )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:772:1: ( ( ( (lv_type_0_0= ruleClassifier ) ) | (otherlv_1= 'alias' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '{' ( (lv_properties_6_0= ruleReferenceProperty ) )* otherlv_7= '}' ) | (otherlv_8= '=' ( (lv_value_9_0= ruleLiteral ) ) ) )? )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:772:2: ( ( (lv_type_0_0= ruleClassifier ) ) | (otherlv_1= 'alias' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '{' ( (lv_properties_6_0= ruleReferenceProperty ) )* otherlv_7= '}' ) | (otherlv_8= '=' ( (lv_value_9_0= ruleLiteral ) ) ) )?
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:772:2: ( ( (lv_type_0_0= ruleClassifier ) ) | (otherlv_1= 'alias' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==29) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:772:3: ( (lv_type_0_0= ruleClassifier ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:772:3: ( (lv_type_0_0= ruleClassifier ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:773:1: (lv_type_0_0= ruleClassifier )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:773:1: (lv_type_0_0= ruleClassifier )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:774:3: lv_type_0_0= ruleClassifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeClassifierParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClassifier_in_ruleProperty1673);
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


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:791:6: (otherlv_1= 'alias' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:791:6: (otherlv_1= 'alias' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:791:8: otherlv_1= 'alias' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleProperty1692); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getAliasKeyword_0_1_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:795:1: ( (otherlv_2= RULE_ID ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:796:1: (otherlv_2= RULE_ID )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:796:1: (otherlv_2= RULE_ID )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:797:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty1712); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getReferToPropertyCrossReference_0_1_1_0()); 
                      	
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleProperty1724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getAsKeyword_0_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:812:3: ( (lv_name_4_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:813:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:813:1: (lv_name_4_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:814:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty1743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:830:2: ( (otherlv_5= '{' ( (lv_properties_6_0= ruleReferenceProperty ) )* otherlv_7= '}' ) | (otherlv_8= '=' ( (lv_value_9_0= ruleLiteral ) ) ) )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            else if ( (LA19_0==28) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:830:3: (otherlv_5= '{' ( (lv_properties_6_0= ruleReferenceProperty ) )* otherlv_7= '}' )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:830:3: (otherlv_5= '{' ( (lv_properties_6_0= ruleReferenceProperty ) )* otherlv_7= '}' )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:830:5: otherlv_5= '{' ( (lv_properties_6_0= ruleReferenceProperty ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleProperty1762); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_2_0_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:834:1: ( (lv_properties_6_0= ruleReferenceProperty ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:835:1: (lv_properties_6_0= ruleReferenceProperty )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:835:1: (lv_properties_6_0= ruleReferenceProperty )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:836:3: lv_properties_6_0= ruleReferenceProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPropertyAccess().getPropertiesReferencePropertyParserRuleCall_2_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleReferenceProperty_in_ruleProperty1783);
                    	    lv_properties_6_0=ruleReferenceProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"properties",
                    	              		lv_properties_6_0, 
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

                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleProperty1796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_2_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:857:6: (otherlv_8= '=' ( (lv_value_9_0= ruleLiteral ) ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:857:6: (otherlv_8= '=' ( (lv_value_9_0= ruleLiteral ) ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:857:8: otherlv_8= '=' ( (lv_value_9_0= ruleLiteral ) )
                    {
                    otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleProperty1816); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2_1_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:861:1: ( (lv_value_9_0= ruleLiteral ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:862:1: (lv_value_9_0= ruleLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:862:1: (lv_value_9_0= ruleLiteral )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:863:3: lv_value_9_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getValueLiteralParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleProperty1837);
                    lv_value_9_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_9_0, 
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:887:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:888:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:889:2: iv_ruleClassifier= ruleClassifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierRule()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier1876);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier1886); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:896:1: ruleClassifier returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ( (lv_sizes_3_0= ruleArraySize ) )* ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_sizes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:899:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ( (lv_sizes_3_0= ruleArraySize ) )* ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:900:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ( (lv_sizes_3_0= ruleArraySize ) )* )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:900:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ( (lv_sizes_3_0= ruleArraySize ) )* )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:900:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ( (lv_sizes_3_0= ruleArraySize ) )*
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:900:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )?
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:900:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.'
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:900:3: ( (otherlv_0= RULE_ID ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:901:1: (otherlv_0= RULE_ID )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:901:1: (otherlv_0= RULE_ID )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:902:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassifierRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassifier1932); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getClassifierAccess().getPackagePackageCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleClassifier1944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getClassifierAccess().getFullStopKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:917:3: ( (otherlv_2= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:918:1: (otherlv_2= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:918:1: (otherlv_2= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:919:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getClassifierRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassifier1966); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getClassifierAccess().getClassEClassifierCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:930:2: ( (lv_sizes_3_0= ruleArraySize ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:931:1: (lv_sizes_3_0= ruleArraySize )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:931:1: (lv_sizes_3_0= ruleArraySize )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:932:3: lv_sizes_3_0= ruleArraySize
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassifierAccess().getSizesArraySizeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArraySize_in_ruleClassifier1987);
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:956:1: entryRuleArraySize returns [EObject current=null] : iv_ruleArraySize= ruleArraySize EOF ;
    public final EObject entryRuleArraySize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySize = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:957:2: (iv_ruleArraySize= ruleArraySize EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:958:2: iv_ruleArraySize= ruleArraySize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArraySizeRule()); 
            }
            pushFollow(FOLLOW_ruleArraySize_in_entryRuleArraySize2024);
            iv_ruleArraySize=ruleArraySize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArraySize; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArraySize2034); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:965:1: ruleArraySize returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) ;
    public final EObject ruleArraySize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:968:28: ( ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:969:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:969:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:969:2: () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']'
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:969:2: ()
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:970:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArraySizeAccess().getArraySizeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleArraySize2080); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArraySizeAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:979:1: ( (lv_size_2_0= RULE_INT ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:980:1: (lv_size_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:980:1: (lv_size_2_0= RULE_INT )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:981:3: lv_size_2_0= RULE_INT
                    {
                    lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArraySize2097); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleArraySize2115); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1009:1: entryRuleReferenceProperty returns [EObject current=null] : iv_ruleReferenceProperty= ruleReferenceProperty EOF ;
    public final EObject entryRuleReferenceProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceProperty = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1010:2: (iv_ruleReferenceProperty= ruleReferenceProperty EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1011:2: iv_ruleReferenceProperty= ruleReferenceProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferencePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty2151);
            iv_ruleReferenceProperty=ruleReferenceProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceProperty2161); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1018:1: ruleReferenceProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}' ) ;
    public final EObject ruleReferenceProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_properties_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1021:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}' ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1022:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1022:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}' )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1022:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}'
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1022:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1023:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1023:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1024:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferencePropertyRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceProperty2206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getReferencePropertyAccess().getRefEStructuralFeatureCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleReferenceProperty2218); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReferencePropertyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1039:1: ( (lv_properties_2_0= ruleReferenceProperty ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1040:1: (lv_properties_2_0= ruleReferenceProperty )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1040:1: (lv_properties_2_0= ruleReferenceProperty )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1041:3: lv_properties_2_0= ruleReferenceProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferencePropertyAccess().getPropertiesReferencePropertyParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleReferenceProperty_in_ruleReferenceProperty2239);
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

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleReferenceProperty2252); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1069:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1070:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1071:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2288);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2298); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1078:1: ruleLiteral returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ConstantLiteral_4= ruleConstantLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_FloatLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;

        EObject this_ConstantLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1081:28: ( (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ConstantLiteral_4= ruleConstantLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1082:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ConstantLiteral_4= ruleConstantLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1082:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ConstantLiteral_4= ruleConstantLiteral )
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1083:5: this_StringLiteral_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral2345);
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1093:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral2372);
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1103:5: this_FloatLiteral_2= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_ruleLiteral2399);
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1113:5: this_BooleanLiteral_3= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral2426);
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1123:5: this_ConstantLiteral_4= ruleConstantLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getConstantLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantLiteral_in_ruleLiteral2453);
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1139:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1140:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1141:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2488);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2498); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1148:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1151:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1152:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1152:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1153:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1153:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1154:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral2539); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1178:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1179:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1180:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral2579);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral2589); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1187:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1190:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1191:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1191:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1192:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1192:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1193:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral2630); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1217:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1218:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1219:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral2670);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral2680); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1226:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1229:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1230:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1230:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1231:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1231:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1232:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatLiteral2721); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1256:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1257:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1258:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2761);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral2771); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1265:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1268:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1269:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1269:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1270:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1270:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1271:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanLiteral2812); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1295:1: entryRuleConstantLiteral returns [EObject current=null] : iv_ruleConstantLiteral= ruleConstantLiteral EOF ;
    public final EObject entryRuleConstantLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1296:2: (iv_ruleConstantLiteral= ruleConstantLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1297:2: iv_ruleConstantLiteral= ruleConstantLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleConstantLiteral_in_entryRuleConstantLiteral2852);
            iv_ruleConstantLiteral=ruleConstantLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantLiteral2862); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1304:1: ruleConstantLiteral returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleConstantLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1307:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1308:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1308:1: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1309:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1309:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1310:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantLiteralRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantLiteral2906); if (state.failed) return current;
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
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel143 = new BitSet(new long[]{0x0000000003098002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel164 = new BitSet(new long[]{0x0000000003098002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel186 = new BitSet(new long[]{0x0000000003088002L});
    public static final BitSet FOLLOW_ruleType_in_ruleModel208 = new BitSet(new long[]{0x0000000003080002L});
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
    public static final BitSet FOLLOW_rulePartialRecordType_in_ruleType834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialRecordType_in_entryRulePartialRecordType869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartialRecordType879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePartialRecordType916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePartialRecordType933 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_20_in_rulePartialRecordType951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePartialRecordType974 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_rulePartialRecordType987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePartialRecordType1010 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_22_in_rulePartialRecordType1027 = new BitSet(new long[]{0x0000000028800010L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePartialRecordType1049 = new BitSet(new long[]{0x0000000028800010L});
    public static final BitSet FOLLOW_ruleConstant_in_rulePartialRecordType1076 = new BitSet(new long[]{0x0000000028800010L});
    public static final BitSet FOLLOW_23_in_rulePartialRecordType1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_entryRuleRecordType1128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordType1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleRecordType1181 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleRecordType1207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecordType1224 = new BitSet(new long[]{0x0000000004500002L});
    public static final BitSet FOLLOW_26_in_ruleRecordType1242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRecordType1265 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_20_in_ruleRecordType1280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRecordType1303 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_ruleRecordType1316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRecordType1339 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_22_in_ruleRecordType1356 = new BitSet(new long[]{0x0000000028800010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleRecordType1378 = new BitSet(new long[]{0x0000000028800010L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleRecordType1405 = new BitSet(new long[]{0x0000000028800010L});
    public static final BitSet FOLLOW_23_in_ruleRecordType1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant1457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleConstant1504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleConstant1525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant1542 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleConstant1559 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleConstant1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleProperty1673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_29_in_ruleProperty1692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty1712 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleProperty1724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty1743 = new BitSet(new long[]{0x0000000010400002L});
    public static final BitSet FOLLOW_22_in_ruleProperty1762 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_ruleProperty1783 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleProperty1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleProperty1816 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleProperty1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier1876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifier1932 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleClassifier1944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifier1966 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleArraySize_in_ruleClassifier1987 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleArraySize_in_entryRuleArraySize2024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArraySize2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleArraySize2080 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArraySize2097 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleArraySize2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty2151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceProperty2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceProperty2206 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleReferenceProperty2218 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_ruleReferenceProperty2239 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleReferenceProperty2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_ruleLiteral2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantLiteral_in_ruleLiteral2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral2579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral2670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatLiteral2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanLiteral2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantLiteral_in_entryRuleConstantLiteral2852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantLiteral2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantLiteral2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred1_InternalRecordLang545 = new BitSet(new long[]{0x0000000000000002L});

}
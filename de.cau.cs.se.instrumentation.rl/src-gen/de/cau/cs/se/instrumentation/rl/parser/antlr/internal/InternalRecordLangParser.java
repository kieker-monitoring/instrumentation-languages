package de.cau.cs.se.instrumentation.rl.parser.antlr.internal; 

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'use'", "'@author'", "'@since'", "'template'", "':'", "','", "'{'", "'}'", "'abstract'", "'entity'", "'extends'", "'const'", "'='", "'alias'", "'as'", "'grouped'", "'by'", "'.'", "'['", "']'", "'KIEKER_VERSION'", "'*'", "'transient'", "'auto-increment'"
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:70:2: iv_ruleModel= ruleModel EOF
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_packages_2_0= rulePackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_types_4_0= ruleType ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_packages_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_types_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:80:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_packages_2_0= rulePackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_types_4_0= ruleType ) )* ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:81:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_packages_2_0= rulePackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_types_4_0= ruleType ) )* )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:81:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_packages_2_0= rulePackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_types_4_0= ruleType ) )* )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:81:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_packages_2_0= rulePackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_types_4_0= ruleType ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleModel122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:85:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:86:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:86:1: (lv_name_1_0= ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:87:3: lv_name_1_0= ruleQualifiedName
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

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:103:2: ( (lv_packages_2_0= rulePackage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:104:1: (lv_packages_2_0= rulePackage )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:104:1: (lv_packages_2_0= rulePackage )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:105:3: lv_packages_2_0= rulePackage
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

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:121:3: ( (lv_imports_3_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:122:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:122:1: (lv_imports_3_0= ruleImport )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:123:3: lv_imports_3_0= ruleImport
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

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:139:3: ( (lv_types_4_0= ruleType ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=17 && LA3_0<=19)||(LA3_0>=24 && LA3_0<=25)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:140:1: (lv_types_4_0= ruleType )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:140:1: (lv_types_4_0= ruleType )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:141:3: lv_types_4_0= ruleType
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:165:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:166:2: (iv_ruleImport= ruleImport EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:167:2: iv_ruleImport= ruleImport EOF
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:174:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:177:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:178:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:178:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:178:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport292); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:182:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:183:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:183:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:184:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:208:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:209:2: (iv_rulePackage= rulePackage EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:210:2: iv_rulePackage= rulePackage EOF
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:217:1: rulePackage returns [EObject current=null] : (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:220:28: ( (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:221:1: (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:221:1: (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:221:3: otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePackage396); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getUseKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:225:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:226:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:226:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:227:3: lv_name_1_0= RULE_ID
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

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:243:2: ( (otherlv_2= RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:244:1: (otherlv_2= RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:244:1: (otherlv_2= RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:245:3: otherlv_2= RULE_STRING
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


    // $ANTLR start "entryRuleType"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:264:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:265:2: (iv_ruleType= ruleType EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:266:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType474);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType484); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:273:1: ruleType returns [EObject current=null] : (this_RecordType_0= ruleRecordType | this_TemplateType_1= ruleTemplateType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_RecordType_0 = null;

        EObject this_TemplateType_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:276:28: ( (this_RecordType_0= ruleRecordType | this_TemplateType_1= ruleTemplateType ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:277:1: (this_RecordType_0= ruleRecordType | this_TemplateType_1= ruleTemplateType )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:277:1: (this_RecordType_0= ruleRecordType | this_TemplateType_1= ruleTemplateType )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 17:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 18:
                        {
                        int LA4_2 = input.LA(4);

                        if ( (LA4_2==RULE_STRING) ) {
                            int LA4_6 = input.LA(5);

                            if ( (LA4_6==19) ) {
                                alt4=2;
                            }
                            else if ( ((LA4_6>=24 && LA4_6<=25)) ) {
                                alt4=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 19:
                        {
                        alt4=2;
                        }
                        break;
                    case 24:
                    case 25:
                        {
                        alt4=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_STRING) ) {
                    int LA4_6 = input.LA(3);

                    if ( (LA4_6==19) ) {
                        alt4=2;
                    }
                    else if ( ((LA4_6>=24 && LA4_6<=25)) ) {
                        alt4=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
            case 25:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:278:5: this_RecordType_0= ruleRecordType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRecordType_in_ruleType531);
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:288:5: this_TemplateType_1= ruleTemplateType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getTemplateTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTemplateType_in_ruleType558);
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTemplateType"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:304:1: entryRuleTemplateType returns [EObject current=null] : iv_ruleTemplateType= ruleTemplateType EOF ;
    public final EObject entryRuleTemplateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateType = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:305:2: (iv_ruleTemplateType= ruleTemplateType EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:306:2: iv_ruleTemplateType= ruleTemplateType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateTypeRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateType_in_entryRuleTemplateType593);
            iv_ruleTemplateType=ruleTemplateType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateType603); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:313:1: ruleTemplateType returns [EObject current=null] : ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? otherlv_4= 'template' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= ':' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_constants_12_0= ruleConstant ) ) )* otherlv_13= '}' )? ) ;
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
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:316:28: ( ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? otherlv_4= 'template' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= ':' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_constants_12_0= ruleConstant ) ) )* otherlv_13= '}' )? ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:317:1: ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? otherlv_4= 'template' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= ':' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_constants_12_0= ruleConstant ) ) )* otherlv_13= '}' )? )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:317:1: ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? otherlv_4= 'template' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= ':' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_constants_12_0= ruleConstant ) ) )* otherlv_13= '}' )? )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:317:2: (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? otherlv_4= 'template' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= ':' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_constants_12_0= ruleConstant ) ) )* otherlv_13= '}' )?
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:317:2: (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:317:4: otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTemplateType641); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getTemplateTypeAccess().getAuthorKeyword_0_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:321:1: ( (lv_author_1_0= RULE_STRING ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:322:1: (lv_author_1_0= RULE_STRING )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:322:1: (lv_author_1_0= RULE_STRING )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:323:3: lv_author_1_0= RULE_STRING
                    {
                    lv_author_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTemplateType658); if (state.failed) return current;
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
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:339:4: (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:339:6: otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleTemplateType678); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTemplateTypeAccess().getSinceKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:343:1: ( (lv_since_3_0= RULE_STRING ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:344:1: (lv_since_3_0= RULE_STRING )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:344:1: (lv_since_3_0= RULE_STRING )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:345:3: lv_since_3_0= RULE_STRING
                    {
                    lv_since_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTemplateType695); if (state.failed) return current;
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
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleTemplateType714); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTemplateTypeAccess().getTemplateKeyword_2());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:365:1: ( (lv_name_5_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:366:1: (lv_name_5_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:366:1: (lv_name_5_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:367:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateType731); if (state.failed) return current;
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
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:383:2: (otherlv_6= ':' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:383:4: otherlv_6= ':' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleTemplateType749); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTemplateTypeAccess().getColonKeyword_4_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:387:1: ( ( ruleQualifiedName ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:388:1: ( ruleQualifiedName )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:388:1: ( ruleQualifiedName )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:389:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemplateTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateTypeAccess().getParentsTemplateTypeCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateType772);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:402:2: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:402:4: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleTemplateType785); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getTemplateTypeAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:406:1: ( ( ruleQualifiedName ) )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:407:1: ( ruleQualifiedName )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:407:1: ( ruleQualifiedName )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:408:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTemplateTypeRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTemplateTypeAccess().getParentsTemplateTypeCrossReference_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateType808);
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

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:421:6: (otherlv_10= '{' ( ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_constants_12_0= ruleConstant ) ) )* otherlv_13= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:421:8: otherlv_10= '{' ( ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_constants_12_0= ruleConstant ) ) )* otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleTemplateType825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getTemplateTypeAccess().getLeftCurlyBracketKeyword_5_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:425:1: ( ( (lv_properties_11_0= ruleProperty ) ) | ( (lv_constants_12_0= ruleConstant ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID||LA9_0==29||LA9_0==31||(LA9_0>=38 && LA9_0<=39)) ) {
                            alt9=1;
                        }
                        else if ( (LA9_0==27) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:425:2: ( (lv_properties_11_0= ruleProperty ) )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:425:2: ( (lv_properties_11_0= ruleProperty ) )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:426:1: (lv_properties_11_0= ruleProperty )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:426:1: (lv_properties_11_0= ruleProperty )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:427:3: lv_properties_11_0= ruleProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTemplateTypeAccess().getPropertiesPropertyParserRuleCall_5_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleProperty_in_ruleTemplateType847);
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
                    	              		"Property");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:444:6: ( (lv_constants_12_0= ruleConstant ) )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:444:6: ( (lv_constants_12_0= ruleConstant ) )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:445:1: (lv_constants_12_0= ruleConstant )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:445:1: (lv_constants_12_0= ruleConstant )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:446:3: lv_constants_12_0= ruleConstant
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTemplateTypeAccess().getConstantsConstantParserRuleCall_5_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleConstant_in_ruleTemplateType874);
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

                    otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleTemplateType888); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:474:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:475:2: (iv_ruleRecordType= ruleRecordType EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:476:2: iv_ruleRecordType= ruleRecordType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordTypeRule()); 
            }
            pushFollow(FOLLOW_ruleRecordType_in_entryRuleRecordType926);
            iv_ruleRecordType=ruleRecordType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordType936); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:483:1: ruleRecordType returns [EObject current=null] : ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= '{' ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_constants_15_0= ruleConstant ) ) )* otherlv_16= '}' )? ) ;
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
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:486:28: ( ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= '{' ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_constants_15_0= ruleConstant ) ) )* otherlv_16= '}' )? ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:487:1: ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= '{' ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_constants_15_0= ruleConstant ) ) )* otherlv_16= '}' )? )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:487:1: ( (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= '{' ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_constants_15_0= ruleConstant ) ) )* otherlv_16= '}' )? )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:487:2: (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )? (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )? ( (lv_abstract_4_0= 'abstract' ) )? otherlv_5= 'entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= '{' ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_constants_15_0= ruleConstant ) ) )* otherlv_16= '}' )?
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:487:2: (otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:487:4: otherlv_0= '@author' ( (lv_author_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleRecordType974); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getRecordTypeAccess().getAuthorKeyword_0_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:491:1: ( (lv_author_1_0= RULE_STRING ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:492:1: (lv_author_1_0= RULE_STRING )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:492:1: (lv_author_1_0= RULE_STRING )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:493:3: lv_author_1_0= RULE_STRING
                    {
                    lv_author_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRecordType991); if (state.failed) return current;
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
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:509:4: (otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:509:6: otherlv_2= '@since' ( (lv_since_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleRecordType1011); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getRecordTypeAccess().getSinceKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:513:1: ( (lv_since_3_0= RULE_STRING ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:514:1: (lv_since_3_0= RULE_STRING )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:514:1: (lv_since_3_0= RULE_STRING )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:515:3: lv_since_3_0= RULE_STRING
                    {
                    lv_since_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRecordType1028); if (state.failed) return current;
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
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:531:4: ( (lv_abstract_4_0= 'abstract' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:532:1: (lv_abstract_4_0= 'abstract' )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:532:1: (lv_abstract_4_0= 'abstract' )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:533:3: lv_abstract_4_0= 'abstract'
                    {
                    lv_abstract_4_0=(Token)match(input,24,FOLLOW_24_in_ruleRecordType1053); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleRecordType1079); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getRecordTypeAccess().getEntityKeyword_3());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:550:1: ( (lv_name_6_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:551:1: (lv_name_6_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:551:1: (lv_name_6_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:552:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecordType1096); if (state.failed) return current;
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
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:568:2: (otherlv_7= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:568:4: otherlv_7= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleRecordType1114); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getRecordTypeAccess().getExtendsKeyword_5_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:572:1: ( ( ruleQualifiedName ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:573:1: ( ruleQualifiedName )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:573:1: ( ruleQualifiedName )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:574:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRecordTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getParentRecordTypeCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleRecordType1137);
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

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:587:4: (otherlv_9= ':' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:587:6: otherlv_9= ':' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleRecordType1152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getRecordTypeAccess().getColonKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:591:1: ( ( ruleQualifiedName ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:592:1: ( ruleQualifiedName )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:592:1: ( ruleQualifiedName )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:593:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRecordTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getParentsTemplateTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleRecordType1175);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:606:2: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:606:4: otherlv_11= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleRecordType1188); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getRecordTypeAccess().getCommaKeyword_6_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:610:1: ( ( ruleQualifiedName ) )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:611:1: ( ruleQualifiedName )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:611:1: ( ruleQualifiedName )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:612:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getRecordTypeRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getParentsTemplateTypeCrossReference_6_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleRecordType1211);
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

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:625:6: (otherlv_13= '{' ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_constants_15_0= ruleConstant ) ) )* otherlv_16= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:625:8: otherlv_13= '{' ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_constants_15_0= ruleConstant ) ) )* otherlv_16= '}'
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleRecordType1228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_7_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:629:1: ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_constants_15_0= ruleConstant ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID||LA17_0==29||LA17_0==31||(LA17_0>=38 && LA17_0<=39)) ) {
                            alt17=1;
                        }
                        else if ( (LA17_0==27) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:629:2: ( (lv_properties_14_0= ruleProperty ) )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:629:2: ( (lv_properties_14_0= ruleProperty ) )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:630:1: (lv_properties_14_0= ruleProperty )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:630:1: (lv_properties_14_0= ruleProperty )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:631:3: lv_properties_14_0= ruleProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getPropertiesPropertyParserRuleCall_7_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleProperty_in_ruleRecordType1250);
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
                    	              		"Property");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:648:6: ( (lv_constants_15_0= ruleConstant ) )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:648:6: ( (lv_constants_15_0= ruleConstant ) )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:649:1: (lv_constants_15_0= ruleConstant )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:649:1: (lv_constants_15_0= ruleConstant )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:650:3: lv_constants_15_0= ruleConstant
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getConstantsConstantParserRuleCall_7_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleConstant_in_ruleRecordType1277);
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

                    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleRecordType1291); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:678:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:679:2: (iv_ruleConstant= ruleConstant EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:680:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant1329);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant1339); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:687:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:690:28: ( (otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:691:1: (otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:691:1: (otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:691:3: otherlv_0= 'const' ( (lv_type_1_0= ruleClassifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteral ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleConstant1376); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:695:1: ( (lv_type_1_0= ruleClassifier ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:696:1: (lv_type_1_0= ruleClassifier )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:696:1: (lv_type_1_0= ruleClassifier )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:697:3: lv_type_1_0= ruleClassifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAccess().getTypeClassifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleClassifier_in_ruleConstant1397);
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

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:713:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:714:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:714:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:715:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant1414); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleConstant1431); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getEqualsSignKeyword_3());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:735:1: ( (lv_value_4_0= ruleLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:736:1: (lv_value_4_0= ruleLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:736:1: (lv_value_4_0= ruleLiteral )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:737:3: lv_value_4_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAccess().getValueLiteralParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleConstant1452);
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:761:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:762:2: (iv_ruleProperty= ruleProperty EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:763:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1488);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1498); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:770:1: ruleProperty returns [EObject current=null] : ( ( (lv_modifiers_0_0= rulePropertyModifier ) )* ( (lv_foreignKey_1_0= ruleForeignKey ) )? ( ( (lv_type_2_0= ruleClassifier ) ) | (otherlv_3= 'alias' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ) ) ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= '{' ( (lv_properties_8_0= ruleReferenceProperty ) )* otherlv_9= '}' ) | (otherlv_10= '=' ( (lv_value_11_0= ruleLiteral ) ) ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_modifiers_0_0 = null;

        EObject lv_foreignKey_1_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_value_11_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:773:28: ( ( ( (lv_modifiers_0_0= rulePropertyModifier ) )* ( (lv_foreignKey_1_0= ruleForeignKey ) )? ( ( (lv_type_2_0= ruleClassifier ) ) | (otherlv_3= 'alias' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ) ) ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= '{' ( (lv_properties_8_0= ruleReferenceProperty ) )* otherlv_9= '}' ) | (otherlv_10= '=' ( (lv_value_11_0= ruleLiteral ) ) ) )? ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:774:1: ( ( (lv_modifiers_0_0= rulePropertyModifier ) )* ( (lv_foreignKey_1_0= ruleForeignKey ) )? ( ( (lv_type_2_0= ruleClassifier ) ) | (otherlv_3= 'alias' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ) ) ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= '{' ( (lv_properties_8_0= ruleReferenceProperty ) )* otherlv_9= '}' ) | (otherlv_10= '=' ( (lv_value_11_0= ruleLiteral ) ) ) )? )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:774:1: ( ( (lv_modifiers_0_0= rulePropertyModifier ) )* ( (lv_foreignKey_1_0= ruleForeignKey ) )? ( ( (lv_type_2_0= ruleClassifier ) ) | (otherlv_3= 'alias' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ) ) ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= '{' ( (lv_properties_8_0= ruleReferenceProperty ) )* otherlv_9= '}' ) | (otherlv_10= '=' ( (lv_value_11_0= ruleLiteral ) ) ) )? )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:774:2: ( (lv_modifiers_0_0= rulePropertyModifier ) )* ( (lv_foreignKey_1_0= ruleForeignKey ) )? ( ( (lv_type_2_0= ruleClassifier ) ) | (otherlv_3= 'alias' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ) ) ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= '{' ( (lv_properties_8_0= ruleReferenceProperty ) )* otherlv_9= '}' ) | (otherlv_10= '=' ( (lv_value_11_0= ruleLiteral ) ) ) )?
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:774:2: ( (lv_modifiers_0_0= rulePropertyModifier ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=38 && LA19_0<=39)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:775:1: (lv_modifiers_0_0= rulePropertyModifier )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:775:1: (lv_modifiers_0_0= rulePropertyModifier )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:776:3: lv_modifiers_0_0= rulePropertyModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPropertyAccess().getModifiersPropertyModifierEnumRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyModifier_in_ruleProperty1544);
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
            	              		"PropertyModifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:792:3: ( (lv_foreignKey_1_0= ruleForeignKey ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:793:1: (lv_foreignKey_1_0= ruleForeignKey )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:793:1: (lv_foreignKey_1_0= ruleForeignKey )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:794:3: lv_foreignKey_1_0= ruleForeignKey
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getForeignKeyForeignKeyParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleForeignKey_in_ruleProperty1566);
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
                              		"ForeignKey");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:810:3: ( ( (lv_type_2_0= ruleClassifier ) ) | (otherlv_3= 'alias' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==29) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:810:4: ( (lv_type_2_0= ruleClassifier ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:810:4: ( (lv_type_2_0= ruleClassifier ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:811:1: (lv_type_2_0= ruleClassifier )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:811:1: (lv_type_2_0= ruleClassifier )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:812:3: lv_type_2_0= ruleClassifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeClassifierParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClassifier_in_ruleProperty1589);
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
                              		"Classifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:829:6: (otherlv_3= 'alias' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:829:6: (otherlv_3= 'alias' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:829:8: otherlv_3= 'alias' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleProperty1608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getAliasKeyword_2_1_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:833:1: ( (otherlv_4= RULE_ID ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:834:1: (otherlv_4= RULE_ID )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:834:1: (otherlv_4= RULE_ID )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:835:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty1628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getReferToPropertyCrossReference_2_1_1_0()); 
                      	
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleProperty1640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getAsKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:850:3: ( (lv_name_6_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:851:1: (lv_name_6_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:851:1: (lv_name_6_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:852:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty1659); if (state.failed) return current;
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
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:868:2: ( (otherlv_7= '{' ( (lv_properties_8_0= ruleReferenceProperty ) )* otherlv_9= '}' ) | (otherlv_10= '=' ( (lv_value_11_0= ruleLiteral ) ) ) )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            else if ( (LA23_0==28) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:868:3: (otherlv_7= '{' ( (lv_properties_8_0= ruleReferenceProperty ) )* otherlv_9= '}' )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:868:3: (otherlv_7= '{' ( (lv_properties_8_0= ruleReferenceProperty ) )* otherlv_9= '}' )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:868:5: otherlv_7= '{' ( (lv_properties_8_0= ruleReferenceProperty ) )* otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleProperty1678); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_4_0_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:872:1: ( (lv_properties_8_0= ruleReferenceProperty ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:873:1: (lv_properties_8_0= ruleReferenceProperty )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:873:1: (lv_properties_8_0= ruleReferenceProperty )
                    	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:874:3: lv_properties_8_0= ruleReferenceProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPropertyAccess().getPropertiesReferencePropertyParserRuleCall_4_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleReferenceProperty_in_ruleProperty1699);
                    	    lv_properties_8_0=ruleReferenceProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"properties",
                    	              		lv_properties_8_0, 
                    	              		"ReferenceProperty");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleProperty1712); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_4_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:895:6: (otherlv_10= '=' ( (lv_value_11_0= ruleLiteral ) ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:895:6: (otherlv_10= '=' ( (lv_value_11_0= ruleLiteral ) ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:895:8: otherlv_10= '=' ( (lv_value_11_0= ruleLiteral ) )
                    {
                    otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleProperty1732); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getPropertyAccess().getEqualsSignKeyword_4_1_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:899:1: ( (lv_value_11_0= ruleLiteral ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:900:1: (lv_value_11_0= ruleLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:900:1: (lv_value_11_0= ruleLiteral )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:901:3: lv_value_11_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getValueLiteralParserRuleCall_4_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleProperty1753);
                    lv_value_11_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_11_0, 
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


    // $ANTLR start "entryRuleForeignKey"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:925:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:926:2: (iv_ruleForeignKey= ruleForeignKey EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:927:2: iv_ruleForeignKey= ruleForeignKey EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeignKeyRule()); 
            }
            pushFollow(FOLLOW_ruleForeignKey_in_entryRuleForeignKey1792);
            iv_ruleForeignKey=ruleForeignKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeignKey; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeignKey1802); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:934:1: ruleForeignKey returns [EObject current=null] : (otherlv_0= 'grouped' otherlv_1= 'by' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleForeignKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:937:28: ( (otherlv_0= 'grouped' otherlv_1= 'by' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:938:1: (otherlv_0= 'grouped' otherlv_1= 'by' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:938:1: (otherlv_0= 'grouped' otherlv_1= 'by' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:938:3: otherlv_0= 'grouped' otherlv_1= 'by' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleForeignKey1839); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForeignKeyAccess().getGroupedKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleForeignKey1851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForeignKeyAccess().getByKeyword_1());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:946:1: ( (otherlv_2= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:947:1: (otherlv_2= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:947:1: (otherlv_2= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:948:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getForeignKeyRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForeignKey1871); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getForeignKeyAccess().getRecordTypeRecordTypeCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleForeignKey1883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getForeignKeyAccess().getFullStopKeyword_3());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:963:1: ( (otherlv_4= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:964:1: (otherlv_4= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:964:1: (otherlv_4= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:965:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getForeignKeyRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForeignKey1903); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:984:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:985:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:986:2: iv_ruleClassifier= ruleClassifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierRule()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier1939);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier1949); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:993:1: ruleClassifier returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ( (lv_sizes_3_0= ruleArraySize ) )* ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_sizes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:996:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ( (lv_sizes_3_0= ruleArraySize ) )* ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:997:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ( (lv_sizes_3_0= ruleArraySize ) )* )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:997:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ( (lv_sizes_3_0= ruleArraySize ) )* )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:997:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ( (lv_sizes_3_0= ruleArraySize ) )*
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:997:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==33) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:997:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.'
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:997:3: ( (otherlv_0= RULE_ID ) )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:998:1: (otherlv_0= RULE_ID )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:998:1: (otherlv_0= RULE_ID )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:999:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassifierRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassifier1995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getClassifierAccess().getPackagePackageCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleClassifier2007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getClassifierAccess().getFullStopKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1014:3: ( (otherlv_2= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1015:1: (otherlv_2= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1015:1: (otherlv_2= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1016:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getClassifierRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassifier2029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getClassifierAccess().getClassEClassifierCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1027:2: ( (lv_sizes_3_0= ruleArraySize ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==34) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1028:1: (lv_sizes_3_0= ruleArraySize )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1028:1: (lv_sizes_3_0= ruleArraySize )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1029:3: lv_sizes_3_0= ruleArraySize
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassifierAccess().getSizesArraySizeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArraySize_in_ruleClassifier2050);
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
            	    break loop25;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1053:1: entryRuleArraySize returns [EObject current=null] : iv_ruleArraySize= ruleArraySize EOF ;
    public final EObject entryRuleArraySize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySize = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1054:2: (iv_ruleArraySize= ruleArraySize EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1055:2: iv_ruleArraySize= ruleArraySize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArraySizeRule()); 
            }
            pushFollow(FOLLOW_ruleArraySize_in_entryRuleArraySize2087);
            iv_ruleArraySize=ruleArraySize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArraySize; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArraySize2097); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1062:1: ruleArraySize returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) ;
    public final EObject ruleArraySize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1065:28: ( ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1066:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1066:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1066:2: () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']'
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1066:2: ()
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1067:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArraySizeAccess().getArraySizeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleArraySize2143); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArraySizeAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1076:1: ( (lv_size_2_0= RULE_INT ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1077:1: (lv_size_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1077:1: (lv_size_2_0= RULE_INT )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1078:3: lv_size_2_0= RULE_INT
                    {
                    lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArraySize2160); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleArraySize2178); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1106:1: entryRuleReferenceProperty returns [EObject current=null] : iv_ruleReferenceProperty= ruleReferenceProperty EOF ;
    public final EObject entryRuleReferenceProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceProperty = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1107:2: (iv_ruleReferenceProperty= ruleReferenceProperty EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1108:2: iv_ruleReferenceProperty= ruleReferenceProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferencePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty2214);
            iv_ruleReferenceProperty=ruleReferenceProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceProperty2224); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1115:1: ruleReferenceProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}' ) ;
    public final EObject ruleReferenceProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_properties_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1118:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}' ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1119:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1119:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}' )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1119:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}'
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1119:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1120:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1120:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1121:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferencePropertyRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceProperty2269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getReferencePropertyAccess().getRefEStructuralFeatureCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleReferenceProperty2281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReferencePropertyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1136:1: ( (lv_properties_2_0= ruleReferenceProperty ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1137:1: (lv_properties_2_0= ruleReferenceProperty )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1137:1: (lv_properties_2_0= ruleReferenceProperty )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1138:3: lv_properties_2_0= ruleReferenceProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferencePropertyAccess().getPropertiesReferencePropertyParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleReferenceProperty_in_ruleReferenceProperty2302);
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
            	    break loop27;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleReferenceProperty2315); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1166:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1167:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1168:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2351);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2361); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1175:1: ruleLiteral returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ConstantLiteral_4= ruleConstantLiteral | this_ArrayLiteral_5= ruleArrayLiteral | this_BuiltInValueLiteral_6= ruleBuiltInValueLiteral ) ;
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
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1178:28: ( (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ConstantLiteral_4= ruleConstantLiteral | this_ArrayLiteral_5= ruleArrayLiteral | this_BuiltInValueLiteral_6= ruleBuiltInValueLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1179:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ConstantLiteral_4= ruleConstantLiteral | this_ArrayLiteral_5= ruleArrayLiteral | this_BuiltInValueLiteral_6= ruleBuiltInValueLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1179:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ConstantLiteral_4= ruleConstantLiteral | this_ArrayLiteral_5= ruleArrayLiteral | this_BuiltInValueLiteral_6= ruleBuiltInValueLiteral )
            int alt28=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt28=1;
                }
                break;
            case RULE_INT:
                {
                alt28=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt28=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt28=4;
                }
                break;
            case RULE_ID:
                {
                alt28=5;
                }
                break;
            case 22:
                {
                alt28=6;
                }
                break;
            case 36:
                {
                alt28=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1180:5: this_StringLiteral_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral2408);
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1190:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral2435);
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1200:5: this_FloatLiteral_2= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_ruleLiteral2462);
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1210:5: this_BooleanLiteral_3= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral2489);
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1220:5: this_ConstantLiteral_4= ruleConstantLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getConstantLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantLiteral_in_ruleLiteral2516);
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1230:5: this_ArrayLiteral_5= ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_ruleLiteral2543);
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
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1240:5: this_BuiltInValueLiteral_6= ruleBuiltInValueLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBuiltInValueLiteralParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltInValueLiteral_in_ruleLiteral2570);
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1256:1: entryRuleArrayLiteral returns [EObject current=null] : iv_ruleArrayLiteral= ruleArrayLiteral EOF ;
    public final EObject entryRuleArrayLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1257:2: (iv_ruleArrayLiteral= ruleArrayLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1258:2: iv_ruleArrayLiteral= ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral2605);
            iv_ruleArrayLiteral=ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral2615); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1265:1: ruleArrayLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleArrayLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_1_0 = null;

        EObject lv_literals_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1268:28: ( (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1269:1: (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1269:1: (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1269:3: otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleArrayLiteral2652); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1273:1: ( (lv_literals_1_0= ruleLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1274:1: (lv_literals_1_0= ruleLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1274:1: (lv_literals_1_0= ruleLiteral )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1275:3: lv_literals_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleArrayLiteral2673);
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
                      		"Literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1291:2: (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==21) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1291:4: otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleArrayLiteral2686); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1295:1: ( (lv_literals_3_0= ruleLiteral ) )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1296:1: (lv_literals_3_0= ruleLiteral )
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1296:1: (lv_literals_3_0= ruleLiteral )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1297:3: lv_literals_3_0= ruleLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLiteral_in_ruleArrayLiteral2707);
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
            	              		"Literal");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleArrayLiteral2721); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1325:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1326:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1327:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2757);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2767); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1334:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1337:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1338:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1338:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1339:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1339:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1340:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral2808); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1364:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1365:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1366:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral2848);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral2858); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1373:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1376:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1377:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1377:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1378:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1378:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1379:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral2899); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1403:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1404:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1405:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral2939);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral2949); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1412:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1415:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1416:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1416:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1417:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1417:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1418:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatLiteral2990); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1442:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1443:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1444:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral3030);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral3040); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1451:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1454:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1455:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1455:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1456:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1456:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1457:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanLiteral3081); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1481:1: entryRuleConstantLiteral returns [EObject current=null] : iv_ruleConstantLiteral= ruleConstantLiteral EOF ;
    public final EObject entryRuleConstantLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1482:2: (iv_ruleConstantLiteral= ruleConstantLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1483:2: iv_ruleConstantLiteral= ruleConstantLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleConstantLiteral_in_entryRuleConstantLiteral3121);
            iv_ruleConstantLiteral=ruleConstantLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantLiteral3131); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1490:1: ruleConstantLiteral returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleConstantLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1493:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1494:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1494:1: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1495:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1495:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1496:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantLiteralRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantLiteral3175); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1515:1: entryRuleBuiltInValueLiteral returns [EObject current=null] : iv_ruleBuiltInValueLiteral= ruleBuiltInValueLiteral EOF ;
    public final EObject entryRuleBuiltInValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInValueLiteral = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1516:2: (iv_ruleBuiltInValueLiteral= ruleBuiltInValueLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1517:2: iv_ruleBuiltInValueLiteral= ruleBuiltInValueLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltInValueLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltInValueLiteral_in_entryRuleBuiltInValueLiteral3210);
            iv_ruleBuiltInValueLiteral=ruleBuiltInValueLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltInValueLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInValueLiteral3220); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1524:1: ruleBuiltInValueLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= 'KIEKER_VERSION' ) ) ) ;
    public final EObject ruleBuiltInValueLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1527:28: ( ( () ( (lv_value_1_0= 'KIEKER_VERSION' ) ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1528:1: ( () ( (lv_value_1_0= 'KIEKER_VERSION' ) ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1528:1: ( () ( (lv_value_1_0= 'KIEKER_VERSION' ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1528:2: () ( (lv_value_1_0= 'KIEKER_VERSION' ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1528:2: ()
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1529:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBuiltInValueLiteralAccess().getBuiltInValueLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1534:2: ( (lv_value_1_0= 'KIEKER_VERSION' ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1535:1: (lv_value_1_0= 'KIEKER_VERSION' )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1535:1: (lv_value_1_0= 'KIEKER_VERSION' )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1536:3: lv_value_1_0= 'KIEKER_VERSION'
            {
            lv_value_1_0=(Token)match(input,36,FOLLOW_36_in_ruleBuiltInValueLiteral3272); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1557:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1558:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1559:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3322);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName3333); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1566:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1569:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1570:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1570:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1570:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1577:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==33) ) {
                    int LA30_2 = input.LA(2);

                    if ( (LA30_2==RULE_ID) && (synpred1_InternalRecordLang())) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1577:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1577:2: ( ( '.' )=>kw= '.' )
            	    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1577:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,33,FOLLOW_33_in_ruleQualifiedName3401); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3417); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1600:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1601:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1602:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard3465);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard3476); if (state.failed) return current;

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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1609:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1612:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1613:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1613:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1614:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard3523);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1624:1: (kw= '.' kw= '*' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1625:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleQualifiedNameWithWildcard3542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleQualifiedNameWithWildcard3555); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1644:1: rulePropertyModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'transient' ) | (enumLiteral_1= 'auto-increment' ) ) ;
    public final Enumerator rulePropertyModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1646:28: ( ( (enumLiteral_0= 'transient' ) | (enumLiteral_1= 'auto-increment' ) ) )
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1647:1: ( (enumLiteral_0= 'transient' ) | (enumLiteral_1= 'auto-increment' ) )
            {
            // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1647:1: ( (enumLiteral_0= 'transient' ) | (enumLiteral_1= 'auto-increment' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            else if ( (LA32_0==39) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1647:2: (enumLiteral_0= 'transient' )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1647:2: (enumLiteral_0= 'transient' )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1647:4: enumLiteral_0= 'transient'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_38_in_rulePropertyModifier3611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPropertyModifierAccess().getTRANSIENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPropertyModifierAccess().getTRANSIENTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1653:6: (enumLiteral_1= 'auto-increment' )
                    {
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1653:6: (enumLiteral_1= 'auto-increment' )
                    // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1653:8: enumLiteral_1= 'auto-increment'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_39_in_rulePropertyModifier3628); if (state.failed) return current;
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
        // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1577:3: ( '.' )
        // ../de.cau.cs.se.instrumentation.rl/src-gen/de/cau/cs/se/instrumentation/rl/parser/antlr/internal/InternalRecordLang.g:1578:2: '.'
        {
        match(input,33,FOLLOW_33_in_synpred1_InternalRecordLang3392); if (state.failed) return ;

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
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel143 = new BitSet(new long[]{0x00000000030F8002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel164 = new BitSet(new long[]{0x00000000030F8002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel186 = new BitSet(new long[]{0x00000000030E8002L});
    public static final BitSet FOLLOW_ruleType_in_ruleModel208 = new BitSet(new long[]{0x00000000030E0002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePackage396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage413 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePackage438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_ruleType531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateType_in_ruleType558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateType_in_entryRuleTemplateType593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateType603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTemplateType641 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTemplateType658 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleTemplateType678 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTemplateType695 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTemplateType714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateType731 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_20_in_ruleTemplateType749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateType772 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_ruleTemplateType785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateType808 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_22_in_ruleTemplateType825 = new BitSet(new long[]{0x000000C0A8800010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleTemplateType847 = new BitSet(new long[]{0x000000C0A8800010L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleTemplateType874 = new BitSet(new long[]{0x000000C0A8800010L});
    public static final BitSet FOLLOW_23_in_ruleTemplateType888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_entryRuleRecordType926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordType936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRecordType974 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRecordType991 = new BitSet(new long[]{0x0000000003040000L});
    public static final BitSet FOLLOW_18_in_ruleRecordType1011 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRecordType1028 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleRecordType1053 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleRecordType1079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecordType1096 = new BitSet(new long[]{0x0000000004500002L});
    public static final BitSet FOLLOW_26_in_ruleRecordType1114 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRecordType1137 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_20_in_ruleRecordType1152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRecordType1175 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_ruleRecordType1188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRecordType1211 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_22_in_ruleRecordType1228 = new BitSet(new long[]{0x000000C0A8800010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleRecordType1250 = new BitSet(new long[]{0x000000C0A8800010L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleRecordType1277 = new BitSet(new long[]{0x000000C0A8800010L});
    public static final BitSet FOLLOW_23_in_ruleRecordType1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant1329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleConstant1376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleConstant1397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant1414 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleConstant1431 = new BitSet(new long[]{0x00000010004001F0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleConstant1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyModifier_in_ruleProperty1544 = new BitSet(new long[]{0x000000C0A0000010L});
    public static final BitSet FOLLOW_ruleForeignKey_in_ruleProperty1566 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleProperty1589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_29_in_ruleProperty1608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty1628 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleProperty1640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty1659 = new BitSet(new long[]{0x0000000010400002L});
    public static final BitSet FOLLOW_22_in_ruleProperty1678 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_ruleProperty1699 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleProperty1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleProperty1732 = new BitSet(new long[]{0x00000010004001F0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleProperty1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeignKey_in_entryRuleForeignKey1792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeignKey1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleForeignKey1839 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleForeignKey1851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForeignKey1871 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleForeignKey1883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForeignKey1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier1939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifier1995 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleClassifier2007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifier2029 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleArraySize_in_ruleClassifier2050 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleArraySize_in_entryRuleArraySize2087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArraySize2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleArraySize2143 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArraySize2160 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleArraySize2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty2214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceProperty2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceProperty2269 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleReferenceProperty2281 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_ruleReferenceProperty2302 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleReferenceProperty2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_ruleLiteral2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantLiteral_in_ruleLiteral2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_ruleLiteral2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInValueLiteral_in_ruleLiteral2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral2605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleArrayLiteral2652 = new BitSet(new long[]{0x00000010004001F0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleArrayLiteral2673 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_21_in_ruleArrayLiteral2686 = new BitSet(new long[]{0x00000010004001F0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleArrayLiteral2707 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_23_in_ruleArrayLiteral2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral2848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral2939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatLiteral2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral3030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanLiteral3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantLiteral_in_entryRuleConstantLiteral3121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantLiteral3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantLiteral3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInValueLiteral_in_entryRuleBuiltInValueLiteral3210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInValueLiteral3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBuiltInValueLiteral3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3373 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleQualifiedName3401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3417 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard3465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard3523 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleQualifiedNameWithWildcard3542 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleQualifiedNameWithWildcard3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePropertyModifier3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePropertyModifier3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred1_InternalRecordLang3392 = new BitSet(new long[]{0x0000000000000002L});

}
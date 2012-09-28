package de.cau.se.instrumentation.language.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.se.instrumentation.language.services.ProbeLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalProbeLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'use'", "'.'", "'*'", "'pattern'", "'('", "','", "')'", "'#'", "'probe'", "':'", "'{'", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalProbeLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProbeLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProbeLangParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g"; }



     	private ProbeLangGrammarAccess grammarAccess;
     	
        public InternalProbeLangParser(TokenStream input, ProbeLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ProbeLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_packages_2_0= rulePackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_patterns_4_0= rulePattern ) )* ( (lv_probes_5_0= ruleProbe ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_packages_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_patterns_4_0 = null;

        EObject lv_probes_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:79:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_packages_2_0= rulePackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_patterns_4_0= rulePattern ) )* ( (lv_probes_5_0= ruleProbe ) )* ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_packages_2_0= rulePackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_patterns_4_0= rulePattern ) )* ( (lv_probes_5_0= ruleProbe ) )* )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_packages_2_0= rulePackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_patterns_4_0= rulePattern ) )* ( (lv_probes_5_0= ruleProbe ) )* )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:80:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_packages_2_0= rulePackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_patterns_4_0= rulePattern ) )* ( (lv_probes_5_0= ruleProbe ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                  
            }
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:85:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:85:1: (lv_name_1_0= ruleQualifiedName )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:86:3: lv_name_1_0= ruleQualifiedName
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

            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:102:2: ( (lv_packages_2_0= rulePackage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:103:1: (lv_packages_2_0= rulePackage )
            	    {
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:103:1: (lv_packages_2_0= rulePackage )
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:104:3: lv_packages_2_0= rulePackage
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

            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:120:3: ( (lv_imports_3_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:121:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:121:1: (lv_imports_3_0= ruleImport )
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:122:3: lv_imports_3_0= ruleImport
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

            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:138:3: ( (lv_patterns_4_0= rulePattern ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:139:1: (lv_patterns_4_0= rulePattern )
            	    {
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:139:1: (lv_patterns_4_0= rulePattern )
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:140:3: lv_patterns_4_0= rulePattern
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getPatternsPatternParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePattern_in_ruleModel208);
            	    lv_patterns_4_0=rulePattern();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"patterns",
            	              		lv_patterns_4_0, 
            	              		"Pattern");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:156:3: ( (lv_probes_5_0= ruleProbe ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:157:1: (lv_probes_5_0= ruleProbe )
            	    {
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:157:1: (lv_probes_5_0= ruleProbe )
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:158:3: lv_probes_5_0= ruleProbe
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getProbesProbeParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProbe_in_ruleModel230);
            	    lv_probes_5_0=ruleProbe();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"probes",
            	              		lv_probes_5_0, 
            	              		"Probe");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:182:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:183:2: (iv_ruleImport= ruleImport EOF )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:184:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport267);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport277); if (state.failed) return current;

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
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:191:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:194:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:195:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:195:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:195:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:199:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:200:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:200:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:201:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport335);
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
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:225:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:226:2: (iv_rulePackage= rulePackage EOF )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:227:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage371);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage381); if (state.failed) return current;

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
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:234:1: rulePackage returns [EObject current=null] : (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:237:28: ( (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:238:1: (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:238:1: (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:238:3: otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulePackage418); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getUseKeyword_0());
                  
            }
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:242:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:243:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:243:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:244:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage435); if (state.failed) return current;
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

            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:260:2: ( (otherlv_2= RULE_STRING ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:261:1: (otherlv_2= RULE_STRING )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:261:1: (otherlv_2= RULE_STRING )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:262:3: otherlv_2= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPackageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePackage460); if (state.failed) return current;
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
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:281:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:282:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:283:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName497);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName508); if (state.failed) return current;

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
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:290:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:293:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:294:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:294:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:294:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:301:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==RULE_ID) && (synpred1_InternalProbeLang())) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:301:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:301:2: ( ( '.' )=>kw= '.' )
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:301:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName576); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName592); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:324:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:325:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:326:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard640);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard651); if (state.failed) return current;

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
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:333:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:336:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:337:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:337:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:338:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard698);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:348:1: (kw= '.' kw= '*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:349:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildcard717); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildcard730); if (state.failed) return current;
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


    // $ANTLR start "entryRulePattern"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:368:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:369:2: (iv_rulePattern= rulePattern EOF )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:370:2: iv_rulePattern= rulePattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternRule()); 
            }
            pushFollow(FOLLOW_rulePattern_in_entryRulePattern772);
            iv_rulePattern=rulePattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePattern782); if (state.failed) return current;

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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:377:1: rulePattern returns [EObject current=null] : (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ( (lv_codeSequcene_7_0= ruleCodeElement ) )* ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_codeSequcene_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:380:28: ( (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ( (lv_codeSequcene_7_0= ruleCodeElement ) )* ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:381:1: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ( (lv_codeSequcene_7_0= ruleCodeElement ) )* )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:381:1: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ( (lv_codeSequcene_7_0= ruleCodeElement ) )* )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:381:3: otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ( (lv_codeSequcene_7_0= ruleCodeElement ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePattern819); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getPatternKeyword_0());
                  
            }
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:385:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:386:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:386:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:387:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePattern836); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPatternRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:403:2: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:403:4: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePattern854); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:407:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:408:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:408:1: (lv_parameters_3_0= ruleParameter )
                    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:409:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_rulePattern875);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPatternRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:425:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==18) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:425:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_rulePattern888); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:429:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:430:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:430:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:431:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_rulePattern909);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPatternRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"Parameter");
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

                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_rulePattern923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getPatternAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:451:3: ( (lv_codeSequcene_7_0= ruleCodeElement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:452:1: (lv_codeSequcene_7_0= ruleCodeElement )
            	    {
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:452:1: (lv_codeSequcene_7_0= ruleCodeElement )
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:453:3: lv_codeSequcene_7_0= ruleCodeElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPatternAccess().getCodeSequceneCodeElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCodeElement_in_rulePattern946);
            	    lv_codeSequcene_7_0=ruleCodeElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPatternRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"codeSequcene",
            	              		lv_codeSequcene_7_0, 
            	              		"CodeElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleParameter"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:477:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:478:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:479:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter983);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter993); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:486:1: ruleParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:489:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:490:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:490:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:491:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:491:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:492:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1034); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleCodeElement"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:516:1: entryRuleCodeElement returns [EObject current=null] : iv_ruleCodeElement= ruleCodeElement EOF ;
    public final EObject entryRuleCodeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeElement = null;


        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:517:2: (iv_ruleCodeElement= ruleCodeElement EOF )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:518:2: iv_ruleCodeElement= ruleCodeElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCodeElementRule()); 
            }
            pushFollow(FOLLOW_ruleCodeElement_in_entryRuleCodeElement1074);
            iv_ruleCodeElement=ruleCodeElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCodeElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeElement1084); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCodeElement"


    // $ANTLR start "ruleCodeElement"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:525:1: ruleCodeElement returns [EObject current=null] : ( ( (lv_toUpper_0_0= '#' ) )? ( (lv_value_1_0= ruleSimpleCodeElement ) ) ) ;
    public final EObject ruleCodeElement() throws RecognitionException {
        EObject current = null;

        Token lv_toUpper_0_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:528:28: ( ( ( (lv_toUpper_0_0= '#' ) )? ( (lv_value_1_0= ruleSimpleCodeElement ) ) ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:529:1: ( ( (lv_toUpper_0_0= '#' ) )? ( (lv_value_1_0= ruleSimpleCodeElement ) ) )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:529:1: ( ( (lv_toUpper_0_0= '#' ) )? ( (lv_value_1_0= ruleSimpleCodeElement ) ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:529:2: ( (lv_toUpper_0_0= '#' ) )? ( (lv_value_1_0= ruleSimpleCodeElement ) )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:529:2: ( (lv_toUpper_0_0= '#' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:530:1: (lv_toUpper_0_0= '#' )
                    {
                    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:530:1: (lv_toUpper_0_0= '#' )
                    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:531:3: lv_toUpper_0_0= '#'
                    {
                    lv_toUpper_0_0=(Token)match(input,20,FOLLOW_20_in_ruleCodeElement1127); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_toUpper_0_0, grammarAccess.getCodeElementAccess().getToUpperNumberSignKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCodeElementRule());
                      	        }
                             		setWithLastConsumed(current, "toUpper", true, "#");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:544:3: ( (lv_value_1_0= ruleSimpleCodeElement ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:545:1: (lv_value_1_0= ruleSimpleCodeElement )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:545:1: (lv_value_1_0= ruleSimpleCodeElement )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:546:3: lv_value_1_0= ruleSimpleCodeElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCodeElementAccess().getValueSimpleCodeElementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSimpleCodeElement_in_ruleCodeElement1162);
            lv_value_1_0=ruleSimpleCodeElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCodeElementRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"SimpleCodeElement");
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
    // $ANTLR end "ruleCodeElement"


    // $ANTLR start "entryRuleSimpleCodeElement"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:570:1: entryRuleSimpleCodeElement returns [EObject current=null] : iv_ruleSimpleCodeElement= ruleSimpleCodeElement EOF ;
    public final EObject entryRuleSimpleCodeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleCodeElement = null;


        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:571:2: (iv_ruleSimpleCodeElement= ruleSimpleCodeElement EOF )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:572:2: iv_ruleSimpleCodeElement= ruleSimpleCodeElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleCodeElementRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleCodeElement_in_entryRuleSimpleCodeElement1198);
            iv_ruleSimpleCodeElement=ruleSimpleCodeElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleCodeElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleCodeElement1208); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleCodeElement"


    // $ANTLR start "ruleSimpleCodeElement"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:579:1: ruleSimpleCodeElement returns [EObject current=null] : (this_XStringLiteral_0= ruleXStringLiteral | this_ParameterRef_1= ruleParameterRef ) ;
    public final EObject ruleSimpleCodeElement() throws RecognitionException {
        EObject current = null;

        EObject this_XStringLiteral_0 = null;

        EObject this_ParameterRef_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:582:28: ( (this_XStringLiteral_0= ruleXStringLiteral | this_ParameterRef_1= ruleParameterRef ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:583:1: (this_XStringLiteral_0= ruleXStringLiteral | this_ParameterRef_1= ruleParameterRef )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:583:1: (this_XStringLiteral_0= ruleXStringLiteral | this_ParameterRef_1= ruleParameterRef )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:584:5: this_XStringLiteral_0= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleCodeElementAccess().getXStringLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleSimpleCodeElement1255);
                    this_XStringLiteral_0=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:594:5: this_ParameterRef_1= ruleParameterRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleCodeElementAccess().getParameterRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterRef_in_ruleSimpleCodeElement1282);
                    this_ParameterRef_1=ruleParameterRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParameterRef_1; 
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
    // $ANTLR end "ruleSimpleCodeElement"


    // $ANTLR start "entryRuleParameterRef"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:610:1: entryRuleParameterRef returns [EObject current=null] : iv_ruleParameterRef= ruleParameterRef EOF ;
    public final EObject entryRuleParameterRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterRef = null;


        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:611:2: (iv_ruleParameterRef= ruleParameterRef EOF )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:612:2: iv_ruleParameterRef= ruleParameterRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRefRule()); 
            }
            pushFollow(FOLLOW_ruleParameterRef_in_entryRuleParameterRef1317);
            iv_ruleParameterRef=ruleParameterRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterRef1327); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameterRef"


    // $ANTLR start "ruleParameterRef"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:619:1: ruleParameterRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleParameterRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:622:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:623:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:623:1: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:624:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:624:1: (otherlv_0= RULE_ID )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:625:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRefRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterRef1371); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getParameterRefAccess().getRefParameterCrossReference_0()); 
              	
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
    // $ANTLR end "ruleParameterRef"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:644:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:645:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:646:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral1406);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral1416); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:653:1: ruleXStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:656:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:657:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:657:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:658:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:658:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:659:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral1457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
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
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleProbe"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:683:1: entryRuleProbe returns [EObject current=null] : iv_ruleProbe= ruleProbe EOF ;
    public final EObject entryRuleProbe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbe = null;


        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:684:2: (iv_ruleProbe= ruleProbe EOF )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:685:2: iv_ruleProbe= ruleProbe EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProbeRule()); 
            }
            pushFollow(FOLLOW_ruleProbe_in_entryRuleProbe1497);
            iv_ruleProbe=ruleProbe();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProbe; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProbe1507); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProbe"


    // $ANTLR start "ruleProbe"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:692:1: ruleProbe returns [EObject current=null] : (otherlv_0= 'probe' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleClassifier ) ) otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' ) ;
    public final EObject ruleProbe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:695:28: ( (otherlv_0= 'probe' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleClassifier ) ) otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:696:1: (otherlv_0= 'probe' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleClassifier ) ) otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:696:1: (otherlv_0= 'probe' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleClassifier ) ) otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:696:3: otherlv_0= 'probe' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleClassifier ) ) otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleProbe1544); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getProbeAccess().getProbeKeyword_0());
                  
            }
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:700:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:701:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:701:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:702:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProbe1561); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getProbeAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProbeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleProbe1578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getProbeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:722:1: ( (lv_type_3_0= ruleClassifier ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:723:1: (lv_type_3_0= ruleClassifier )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:723:1: (lv_type_3_0= ruleClassifier )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:724:3: lv_type_3_0= ruleClassifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProbeAccess().getTypeClassifierParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleClassifier_in_ruleProbe1599);
            lv_type_3_0=ruleClassifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProbeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"Classifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleProbe1611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getProbeAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:744:1: ( (lv_properties_5_0= ruleProperty ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:745:1: (lv_properties_5_0= ruleProperty )
            	    {
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:745:1: (lv_properties_5_0= ruleProperty )
            	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:746:3: lv_properties_5_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProbeAccess().getPropertiesPropertyParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_ruleProbe1632);
            	    lv_properties_5_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProbeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_5_0, 
            	              		"Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleProbe1645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getProbeAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleProbe"


    // $ANTLR start "entryRuleClassifier"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:774:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:775:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:776:2: iv_ruleClassifier= ruleClassifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierRule()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier1681);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier1691); if (state.failed) return current;

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
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:783:1: ruleClassifier returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:786:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:787:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:787:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:787:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:787:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:788:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:788:1: (otherlv_0= RULE_ID )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:789:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getClassifierRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassifier1736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getClassifierAccess().getPackagePackageCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleClassifier1748); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassifierAccess().getFullStopKeyword_1());
                  
            }
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:804:1: ( (otherlv_2= RULE_ID ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:805:1: (otherlv_2= RULE_ID )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:805:1: (otherlv_2= RULE_ID )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:806:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getClassifierRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassifier1768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getClassifierAccess().getClassEClassifierCrossReference_2_0()); 
              	
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
    // $ANTLR end "ruleClassifier"


    // $ANTLR start "entryRuleProperty"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:825:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:826:2: (iv_ruleProperty= ruleProperty EOF )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:827:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1804);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1814); if (state.failed) return current;

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
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:834:1: ruleProperty returns [EObject current=null] : ( ( (lv_type_0_0= ruleClassifier ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleReferenceProperty ) )* otherlv_4= '}' )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;

        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:837:28: ( ( ( (lv_type_0_0= ruleClassifier ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleReferenceProperty ) )* otherlv_4= '}' )? ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:838:1: ( ( (lv_type_0_0= ruleClassifier ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleReferenceProperty ) )* otherlv_4= '}' )? )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:838:1: ( ( (lv_type_0_0= ruleClassifier ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleReferenceProperty ) )* otherlv_4= '}' )? )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:838:2: ( (lv_type_0_0= ruleClassifier ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleReferenceProperty ) )* otherlv_4= '}' )?
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:838:2: ( (lv_type_0_0= ruleClassifier ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:839:1: (lv_type_0_0= ruleClassifier )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:839:1: (lv_type_0_0= ruleClassifier )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:840:3: lv_type_0_0= ruleClassifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeClassifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleClassifier_in_ruleProperty1860);
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

            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:856:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:857:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:857:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:858:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty1877); if (state.failed) return current;
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

            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:874:2: (otherlv_2= '{' ( (lv_properties_3_0= ruleReferenceProperty ) )* otherlv_4= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:874:4: otherlv_2= '{' ( (lv_properties_3_0= ruleReferenceProperty ) )* otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleProperty1895); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_2_0());
                          
                    }
                    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:878:1: ( (lv_properties_3_0= ruleReferenceProperty ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:879:1: (lv_properties_3_0= ruleReferenceProperty )
                    	    {
                    	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:879:1: (lv_properties_3_0= ruleReferenceProperty )
                    	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:880:3: lv_properties_3_0= ruleReferenceProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPropertyAccess().getPropertiesReferencePropertyParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleReferenceProperty_in_ruleProperty1916);
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
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleProperty1929); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_2_2());
                          
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


    // $ANTLR start "entryRuleReferenceProperty"
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:908:1: entryRuleReferenceProperty returns [EObject current=null] : iv_ruleReferenceProperty= ruleReferenceProperty EOF ;
    public final EObject entryRuleReferenceProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceProperty = null;


        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:909:2: (iv_ruleReferenceProperty= ruleReferenceProperty EOF )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:910:2: iv_ruleReferenceProperty= ruleReferenceProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferencePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty1967);
            iv_ruleReferenceProperty=ruleReferenceProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceProperty1977); if (state.failed) return current;

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
    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:917:1: ruleReferenceProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}' )? ) ;
    public final EObject ruleReferenceProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_properties_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:920:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}' )? ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:921:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}' )? )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:921:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}' )? )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:921:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}' )?
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:921:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:922:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:922:1: (otherlv_0= RULE_ID )
            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:923:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferencePropertyRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceProperty2022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getReferencePropertyAccess().getRefEStructuralFeatureCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:934:2: (otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:934:4: otherlv_1= '{' ( (lv_properties_2_0= ruleReferenceProperty ) )* otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleReferenceProperty2035); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReferencePropertyAccess().getLeftCurlyBracketKeyword_1_0());
                          
                    }
                    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:938:1: ( (lv_properties_2_0= ruleReferenceProperty ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:939:1: (lv_properties_2_0= ruleReferenceProperty )
                    	    {
                    	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:939:1: (lv_properties_2_0= ruleReferenceProperty )
                    	    // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:940:3: lv_properties_2_0= ruleReferenceProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReferencePropertyAccess().getPropertiesReferencePropertyParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleReferenceProperty_in_ruleReferenceProperty2056);
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
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleReferenceProperty2069); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getReferencePropertyAccess().getRightCurlyBracketKeyword_1_2());
                          
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
    // $ANTLR end "ruleReferenceProperty"

    // $ANTLR start synpred1_InternalProbeLang
    public final void synpred1_InternalProbeLang_fragment() throws RecognitionException {   
        // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:301:3: ( '.' )
        // ../de.cau.se.instrumentation.language/src-gen/de/cau/se/instrumentation/language/parser/antlr/internal/InternalProbeLang.g:302:2: '.'
        {
        match(input,14,FOLLOW_14_in_synpred1_InternalProbeLang567); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalProbeLang

    // Delegated rules

    public final boolean synpred1_InternalProbeLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalProbeLang_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel143 = new BitSet(new long[]{0x0000000000213002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel164 = new BitSet(new long[]{0x0000000000213002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel186 = new BitSet(new long[]{0x0000000000211002L});
    public static final BitSet FOLLOW_rulePattern_in_ruleModel208 = new BitSet(new long[]{0x0000000000210002L});
    public static final BitSet FOLLOW_ruleProbe_in_ruleModel230 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport314 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePackage418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage435 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePackage460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName548 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName592 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard698 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildcard717 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildcard730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePattern_in_entryRulePattern772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePattern782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePattern819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePattern836 = new BitSet(new long[]{0x0000000000120032L});
    public static final BitSet FOLLOW_17_in_rulePattern854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_rulePattern875 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_rulePattern888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_rulePattern909 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_rulePattern923 = new BitSet(new long[]{0x0000000000100032L});
    public static final BitSet FOLLOW_ruleCodeElement_in_rulePattern946 = new BitSet(new long[]{0x0000000000100032L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeElement_in_entryRuleCodeElement1074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeElement1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCodeElement1127 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_ruleSimpleCodeElement_in_ruleCodeElement1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleCodeElement_in_entryRuleSimpleCodeElement1198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleCodeElement1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleSimpleCodeElement1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterRef_in_ruleSimpleCodeElement1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterRef_in_entryRuleParameterRef1317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterRef1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterRef1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral1406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbe_in_entryRuleProbe1497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProbe1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleProbe1544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProbe1561 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleProbe1578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleProbe1599 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleProbe1611 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleProbe1632 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleProbe1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifier1736 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleClassifier1748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifier1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleProperty1860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty1877 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleProperty1895 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_ruleProperty1916 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleProperty1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty1967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceProperty1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceProperty2022 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleReferenceProperty2035 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_ruleReferenceProperty2056 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleReferenceProperty2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred1_InternalProbeLang567 = new BitSet(new long[]{0x0000000000000002L});

}
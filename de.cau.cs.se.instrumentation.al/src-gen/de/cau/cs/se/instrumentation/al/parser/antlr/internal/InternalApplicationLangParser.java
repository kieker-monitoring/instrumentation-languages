package de.cau.cs.se.instrumentation.al.parser.antlr.internal; 

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
import de.cau.cs.se.instrumentation.al.services.ApplicationLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalApplicationLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'register'", "'use'", "','", "'on'", "'.'", "'*'", "'aspect'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'#'", "'$'", "'**'", "'name'", "'signature'", "'class'", "'return-type'", "'='", "'~'", "'!='", "'>'", "'<'", "'>='", "'<='", "'before'", "'after'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalApplicationLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalApplicationLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalApplicationLangParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private ApplicationLangGrammarAccess grammarAccess;
     	
        public InternalApplicationLangParser(TokenStream input, ApplicationLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ApplicationLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:74:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:75:2: (iv_ruleModel= ruleModel EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:76:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel91); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:83:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_metamodels_2_0= ruleRegisteredPackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_sources_4_0= ruleApplicationModel ) )* ( (lv_aspects_5_0= ruleAspect ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_metamodels_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_sources_4_0 = null;

        EObject lv_aspects_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:86:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_metamodels_2_0= ruleRegisteredPackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_sources_4_0= ruleApplicationModel ) )* ( (lv_aspects_5_0= ruleAspect ) )* ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:87:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_metamodels_2_0= ruleRegisteredPackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_sources_4_0= ruleApplicationModel ) )* ( (lv_aspects_5_0= ruleAspect ) )* )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:87:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_metamodels_2_0= ruleRegisteredPackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_sources_4_0= ruleApplicationModel ) )* ( (lv_aspects_5_0= ruleAspect ) )* )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:87:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_metamodels_2_0= ruleRegisteredPackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_sources_4_0= ruleApplicationModel ) )* ( (lv_aspects_5_0= ruleAspect ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:91:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:92:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:92:1: (lv_name_1_0= ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:93:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModel149);
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:109:2: ( (lv_metamodels_2_0= ruleRegisteredPackage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:110:1: (lv_metamodels_2_0= ruleRegisteredPackage )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:110:1: (lv_metamodels_2_0= ruleRegisteredPackage )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:111:3: lv_metamodels_2_0= ruleRegisteredPackage
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getMetamodelsRegisteredPackageParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRegisteredPackage_in_ruleModel170);
            	    lv_metamodels_2_0=ruleRegisteredPackage();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"metamodels",
            	              		lv_metamodels_2_0, 
            	              		"RegisteredPackage");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:127:3: ( (lv_imports_3_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:128:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:128:1: (lv_imports_3_0= ruleImport )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:129:3: lv_imports_3_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel192);
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:145:3: ( (lv_sources_4_0= ruleApplicationModel ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:146:1: (lv_sources_4_0= ruleApplicationModel )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:146:1: (lv_sources_4_0= ruleApplicationModel )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:147:3: lv_sources_4_0= ruleApplicationModel
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getSourcesApplicationModelParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleApplicationModel_in_ruleModel214);
            	    lv_sources_4_0=ruleApplicationModel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sources",
            	              		lv_sources_4_0, 
            	              		"ApplicationModel");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:163:3: ( (lv_aspects_5_0= ruleAspect ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:164:1: (lv_aspects_5_0= ruleAspect )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:164:1: (lv_aspects_5_0= ruleAspect )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:165:3: lv_aspects_5_0= ruleAspect
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getAspectsAspectParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAspect_in_ruleModel236);
            	    lv_aspects_5_0=ruleAspect();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"aspects",
            	              		lv_aspects_5_0, 
            	              		"Aspect");
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:189:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:190:2: (iv_ruleImport= ruleImport EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:191:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport273);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport283); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:198:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:201:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:202:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:202:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:202:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:206:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:207:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:207:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:208:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport341);
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


    // $ANTLR start "entryRuleRegisteredPackage"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:232:1: entryRuleRegisteredPackage returns [EObject current=null] : iv_ruleRegisteredPackage= ruleRegisteredPackage EOF ;
    public final EObject entryRuleRegisteredPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisteredPackage = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:233:2: (iv_ruleRegisteredPackage= ruleRegisteredPackage EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:234:2: iv_ruleRegisteredPackage= ruleRegisteredPackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegisteredPackageRule()); 
            }
            pushFollow(FOLLOW_ruleRegisteredPackage_in_entryRuleRegisteredPackage377);
            iv_ruleRegisteredPackage=ruleRegisteredPackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegisteredPackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegisteredPackage387); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegisteredPackage"


    // $ANTLR start "ruleRegisteredPackage"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:241:1: ruleRegisteredPackage returns [EObject current=null] : (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) ) ;
    public final EObject ruleRegisteredPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:244:28: ( (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:245:1: (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:245:1: (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:245:3: otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleRegisteredPackage424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRegisteredPackageAccess().getRegisterKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:249:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:250:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:250:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:251:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegisteredPackage441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRegisteredPackageAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRegisteredPackageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:267:2: ( (otherlv_2= RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:268:1: (otherlv_2= RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:268:1: (otherlv_2= RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:269:3: otherlv_2= RULE_STRING
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRegisteredPackageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRegisteredPackage470); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getRegisteredPackageAccess().getEPackageEPackageCrossReference_2_0()); 
              	
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
    // $ANTLR end "ruleRegisteredPackage"


    // $ANTLR start "entryRuleApplicationModel"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:291:1: entryRuleApplicationModel returns [EObject current=null] : iv_ruleApplicationModel= ruleApplicationModel EOF ;
    public final EObject entryRuleApplicationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationModel = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:292:2: (iv_ruleApplicationModel= ruleApplicationModel EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:293:2: iv_ruleApplicationModel= ruleApplicationModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationModelRule()); 
            }
            pushFollow(FOLLOW_ruleApplicationModel_in_entryRuleApplicationModel506);
            iv_ruleApplicationModel=ruleApplicationModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplicationModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationModel516); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationModel"


    // $ANTLR start "ruleApplicationModel"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:300:1: ruleApplicationModel returns [EObject current=null] : (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'on' ( (lv_name_5_0= RULE_ID ) ) ( (lv_model_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleApplicationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token lv_model_6_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:303:28: ( (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'on' ( (lv_name_5_0= RULE_ID ) ) ( (lv_model_6_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:304:1: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'on' ( (lv_name_5_0= RULE_ID ) ) ( (lv_model_6_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:304:1: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'on' ( (lv_name_5_0= RULE_ID ) ) ( (lv_model_6_0= RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:304:3: otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'on' ( (lv_name_5_0= RULE_ID ) ) ( (lv_model_6_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleApplicationModel553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getApplicationModelAccess().getUseKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:308:1: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:309:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:309:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:310:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getApplicationModelRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationModel577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:324:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:324:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleApplicationModel590); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getApplicationModelAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:328:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:329:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:329:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:330:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getApplicationModelRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationModel614); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageCrossReference_2_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleApplicationModel628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getApplicationModelAccess().getOnKeyword_3());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:348:1: ( (lv_name_5_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:349:1: (lv_name_5_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:349:1: (lv_name_5_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:350:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationModel645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getApplicationModelAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getApplicationModelRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:366:2: ( (lv_model_6_0= RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:367:1: (lv_model_6_0= RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:367:1: (lv_model_6_0= RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:368:3: lv_model_6_0= RULE_STRING
            {
            lv_model_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplicationModel667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_model_6_0, grammarAccess.getApplicationModelAccess().getModelSTRINGTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getApplicationModelRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"model",
                      		lv_model_6_0, 
                      		"STRING");
              	    
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
    // $ANTLR end "ruleApplicationModel"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:392:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:393:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:394:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName709);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName720); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:401:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:404:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:405:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:405:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:405:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:412:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==RULE_ID) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:412:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:412:2: ( ( '.' )=>kw= '.' )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:412:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedName788); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName804); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:435:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:436:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:437:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard852);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard863); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:444:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:447:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:448:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:448:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:449:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard910);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:459:1: (kw= '.' kw= '*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:460:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedNameWithWildcard929); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleQualifiedNameWithWildcard942); if (state.failed) return current;
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


    // $ANTLR start "entryRuleAspect"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:479:1: entryRuleAspect returns [EObject current=null] : iv_ruleAspect= ruleAspect EOF ;
    public final EObject entryRuleAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspect = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:480:2: (iv_ruleAspect= ruleAspect EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:481:2: iv_ruleAspect= ruleAspect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAspectRule()); 
            }
            pushFollow(FOLLOW_ruleAspect_in_entryRuleAspect984);
            iv_ruleAspect=ruleAspect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAspect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspect994); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAspect"


    // $ANTLR start "ruleAspect"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:488:1: ruleAspect returns [EObject current=null] : (otherlv_0= 'aspect' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '{' ( (lv_collectors_3_0= ruleCollector ) ) otherlv_4= '}' ) ;
    public final EObject ruleAspect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_query_1_0 = null;

        EObject lv_collectors_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:491:28: ( (otherlv_0= 'aspect' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '{' ( (lv_collectors_3_0= ruleCollector ) ) otherlv_4= '}' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:492:1: (otherlv_0= 'aspect' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '{' ( (lv_collectors_3_0= ruleCollector ) ) otherlv_4= '}' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:492:1: (otherlv_0= 'aspect' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '{' ( (lv_collectors_3_0= ruleCollector ) ) otherlv_4= '}' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:492:3: otherlv_0= 'aspect' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '{' ( (lv_collectors_3_0= ruleCollector ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAspect1031); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAspectAccess().getAspectKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:496:1: ( (lv_query_1_0= ruleQuery ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:497:1: (lv_query_1_0= ruleQuery )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:497:1: (lv_query_1_0= ruleQuery )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:498:3: lv_query_1_0= ruleQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAspectAccess().getQueryQueryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQuery_in_ruleAspect1052);
            lv_query_1_0=ruleQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAspectRule());
              	        }
                     		set(
                     			current, 
                     			"query",
                      		lv_query_1_0, 
                      		"Query");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleAspect1064); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:518:1: ( (lv_collectors_3_0= ruleCollector ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:519:1: (lv_collectors_3_0= ruleCollector )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:519:1: (lv_collectors_3_0= ruleCollector )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:520:3: lv_collectors_3_0= ruleCollector
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAspectAccess().getCollectorsCollectorParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCollector_in_ruleAspect1085);
            lv_collectors_3_0=ruleCollector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAspectRule());
              	        }
                     		add(
                     			current, 
                     			"collectors",
                      		lv_collectors_3_0, 
                      		"Collector");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleAspect1097); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleAspect"


    // $ANTLR start "entryRuleQuery"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:548:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:549:2: (iv_ruleQuery= ruleQuery EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:550:2: iv_ruleQuery= ruleQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryRule()); 
            }
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery1133);
            iv_ruleQuery=ruleQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery1143); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:557:1: ruleQuery returns [EObject current=null] : ( ( (lv_location_0_0= ruleLocationQuery ) ) ( ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '*' ) ( ( (otherlv_3= RULE_ID ) ) | otherlv_4= '*' ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameter_7_0= ruleParameterPattern ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameterPattern ) ) )* otherlv_10= ')' )? ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_location_0_0 = null;

        EObject lv_parameter_7_0 = null;

        EObject lv_parameter_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:560:28: ( ( ( (lv_location_0_0= ruleLocationQuery ) ) ( ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '*' ) ( ( (otherlv_3= RULE_ID ) ) | otherlv_4= '*' ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameter_7_0= ruleParameterPattern ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameterPattern ) ) )* otherlv_10= ')' )? ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:561:1: ( ( (lv_location_0_0= ruleLocationQuery ) ) ( ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '*' ) ( ( (otherlv_3= RULE_ID ) ) | otherlv_4= '*' ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameter_7_0= ruleParameterPattern ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameterPattern ) ) )* otherlv_10= ')' )? )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:561:1: ( ( (lv_location_0_0= ruleLocationQuery ) ) ( ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '*' ) ( ( (otherlv_3= RULE_ID ) ) | otherlv_4= '*' ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameter_7_0= ruleParameterPattern ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameterPattern ) ) )* otherlv_10= ')' )? )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:561:2: ( (lv_location_0_0= ruleLocationQuery ) ) ( ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '*' ) ( ( (otherlv_3= RULE_ID ) ) | otherlv_4= '*' ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameter_7_0= ruleParameterPattern ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameterPattern ) ) )* otherlv_10= ')' )?
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:561:2: ( (lv_location_0_0= ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:562:1: (lv_location_0_0= ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:562:1: (lv_location_0_0= ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:563:3: lv_location_0_0= ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQueryAccess().getLocationLocationQueryParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_ruleQuery1189);
            lv_location_0_0=ruleLocationQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQueryRule());
              	        }
                     		set(
                     			current, 
                     			"location",
                      		lv_location_0_0, 
                      		"LocationQuery");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:579:2: ( ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '*' ) ( ( (otherlv_3= RULE_ID ) ) | otherlv_4= '*' ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameter_7_0= ruleParameterPattern ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameterPattern ) ) )* otherlv_10= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:579:3: ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '*' ) ( ( (otherlv_3= RULE_ID ) ) | otherlv_4= '*' ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameter_7_0= ruleParameterPattern ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameterPattern ) ) )* otherlv_10= ')'
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:579:3: ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '*' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==18) ) {
                        alt8=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:579:4: ( (otherlv_1= RULE_ID ) )
                            {
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:579:4: ( (otherlv_1= RULE_ID ) )
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:580:1: (otherlv_1= RULE_ID )
                            {
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:580:1: (otherlv_1= RULE_ID )
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:581:3: otherlv_1= RULE_ID
                            {
                            if ( state.backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getQueryRule());
                              	        }
                                      
                            }
                            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery1215); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_1, grammarAccess.getQueryAccess().getModifierMethodModifierCrossReference_1_0_0_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:596:7: otherlv_2= '*'
                            {
                            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleQuery1233); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getQueryAccess().getAsteriskKeyword_1_0_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:600:2: ( ( (otherlv_3= RULE_ID ) ) | otherlv_4= '*' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==18) ) {
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
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:600:3: ( (otherlv_3= RULE_ID ) )
                            {
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:600:3: ( (otherlv_3= RULE_ID ) )
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:601:1: (otherlv_3= RULE_ID )
                            {
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:601:1: (otherlv_3= RULE_ID )
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:602:3: otherlv_3= RULE_ID
                            {
                            if ( state.backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getQueryRule());
                              	        }
                                      
                            }
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery1259); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_3, grammarAccess.getQueryAccess().getReturnTypeTypeCrossReference_1_1_0_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:617:7: otherlv_4= '*'
                            {
                            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleQuery1277); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getQueryAccess().getAsteriskKeyword_1_1_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:621:2: ( (otherlv_5= RULE_ID ) )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:622:1: (otherlv_5= RULE_ID )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:622:1: (otherlv_5= RULE_ID )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:623:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getQueryRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery1302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getQueryAccess().getMethodMethodCrossReference_1_2_0()); 
                      	
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleQuery1314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getQueryAccess().getLeftParenthesisKeyword_1_3());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:641:1: ( (lv_parameter_7_0= ruleParameterPattern ) )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:642:1: (lv_parameter_7_0= ruleParameterPattern )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:642:1: (lv_parameter_7_0= ruleParameterPattern )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:643:3: lv_parameter_7_0= ruleParameterPattern
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQueryAccess().getParameterParameterPatternParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterPattern_in_ruleQuery1335);
                    lv_parameter_7_0=ruleParameterPattern();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQueryRule());
                      	        }
                             		add(
                             			current, 
                             			"parameter",
                              		lv_parameter_7_0, 
                              		"ParameterPattern");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:659:2: (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameterPattern ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:659:4: otherlv_8= ',' ( (lv_parameter_9_0= ruleParameterPattern ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleQuery1348); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getQueryAccess().getCommaKeyword_1_5_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:663:1: ( (lv_parameter_9_0= ruleParameterPattern ) )
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:664:1: (lv_parameter_9_0= ruleParameterPattern )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:664:1: (lv_parameter_9_0= ruleParameterPattern )
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:665:3: lv_parameter_9_0= ruleParameterPattern
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQueryAccess().getParameterParameterPatternParserRuleCall_1_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameterPattern_in_ruleQuery1369);
                    	    lv_parameter_9_0=ruleParameterPattern();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getQueryRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameter",
                    	              		lv_parameter_9_0, 
                    	              		"ParameterPattern");
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

                    otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleQuery1383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getQueryAccess().getRightParenthesisKeyword_1_6());
                          
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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleParameterPattern"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:693:1: entryRuleParameterPattern returns [EObject current=null] : iv_ruleParameterPattern= ruleParameterPattern EOF ;
    public final EObject entryRuleParameterPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterPattern = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:694:2: (iv_ruleParameterPattern= ruleParameterPattern EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:695:2: iv_ruleParameterPattern= ruleParameterPattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterPatternRule()); 
            }
            pushFollow(FOLLOW_ruleParameterPattern_in_entryRuleParameterPattern1421);
            iv_ruleParameterPattern=ruleParameterPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterPattern1431); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterPattern"


    // $ANTLR start "ruleParameterPattern"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:702:1: ruleParameterPattern returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) | otherlv_1= '*' ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleParameterPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:705:28: ( ( ( ( (otherlv_0= RULE_ID ) ) | otherlv_1= '*' ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:706:1: ( ( ( (otherlv_0= RULE_ID ) ) | otherlv_1= '*' ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:706:1: ( ( ( (otherlv_0= RULE_ID ) ) | otherlv_1= '*' ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:706:2: ( ( (otherlv_0= RULE_ID ) ) | otherlv_1= '*' ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:706:2: ( ( (otherlv_0= RULE_ID ) ) | otherlv_1= '*' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==18) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:706:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:706:3: ( (otherlv_0= RULE_ID ) )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:707:1: (otherlv_0= RULE_ID )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:707:1: (otherlv_0= RULE_ID )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:708:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterPatternRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterPattern1481); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getParameterPatternAccess().getModifierParameterModifierCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:723:7: otherlv_1= '*'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleParameterPattern1499); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getParameterPatternAccess().getAsteriskKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:727:2: ( (otherlv_2= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:728:1: (otherlv_2= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:728:1: (otherlv_2= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:729:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterPatternRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterPattern1524); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getParameterPatternAccess().getTypeTypeCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:743:2: ( (otherlv_3= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:744:1: (otherlv_3= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:744:1: (otherlv_3= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:745:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterPatternRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterPattern1548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getParameterPatternAccess().getParameterParameterCrossReference_2_0()); 
              	
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
    // $ANTLR end "ruleParameterPattern"


    // $ANTLR start "entryRuleLocationQuery"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:767:1: entryRuleLocationQuery returns [EObject current=null] : iv_ruleLocationQuery= ruleLocationQuery EOF ;
    public final EObject entryRuleLocationQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationQuery = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:768:2: (iv_ruleLocationQuery= ruleLocationQuery EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:769:2: iv_ruleLocationQuery= ruleLocationQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocationQueryRule()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_entryRuleLocationQuery1584);
            iv_ruleLocationQuery=ruleLocationQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocationQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocationQuery1594); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocationQuery"


    // $ANTLR start "ruleLocationQuery"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:776:1: ruleLocationQuery returns [EObject current=null] : ( ( (lv_node_0_0= ruleNode ) ) (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )? ) ;
    public final EObject ruleLocationQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_node_0_0 = null;

        EObject lv_specialization_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:779:28: ( ( ( (lv_node_0_0= ruleNode ) ) (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )? ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:780:1: ( ( (lv_node_0_0= ruleNode ) ) (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )? )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:780:1: ( ( (lv_node_0_0= ruleNode ) ) (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )? )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:780:2: ( (lv_node_0_0= ruleNode ) ) (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )?
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:780:2: ( (lv_node_0_0= ruleNode ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:781:1: (lv_node_0_0= ruleNode )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:781:1: (lv_node_0_0= ruleNode )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:782:3: lv_node_0_0= ruleNode
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationQueryAccess().getNodeNodeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNode_in_ruleLocationQuery1640);
            lv_node_0_0=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocationQueryRule());
              	        }
                     		set(
                     			current, 
                     			"node",
                      		lv_node_0_0, 
                      		"Node");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:798:2: (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:798:4: otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleLocationQuery1653); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLocationQueryAccess().getFullStopKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:802:1: ( (lv_specialization_2_0= ruleLocationQuery ) )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:803:1: (lv_specialization_2_0= ruleLocationQuery )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:803:1: (lv_specialization_2_0= ruleLocationQuery )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:804:3: lv_specialization_2_0= ruleLocationQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocationQueryAccess().getSpecializationLocationQueryParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLocationQuery_in_ruleLocationQuery1674);
                    lv_specialization_2_0=ruleLocationQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocationQueryRule());
                      	        }
                             		set(
                             			current, 
                             			"specialization",
                              		lv_specialization_2_0, 
                              		"LocationQuery");
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
    // $ANTLR end "ruleLocationQuery"


    // $ANTLR start "entryRuleNode"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:828:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:829:2: (iv_ruleNode= ruleNode EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:830:2: iv_ruleNode= ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode1712);
            iv_ruleNode=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode1722); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:837:1: ruleNode returns [EObject current=null] : ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ContainerNode_2= ruleContainerNode ) ( (lv_parameter_3_0= ruleParamQuery ) )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_SubPathNode_0 = null;

        EObject this_WildcardNode_1 = null;

        EObject this_ContainerNode_2 = null;

        EObject lv_parameter_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:840:28: ( ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ContainerNode_2= ruleContainerNode ) ( (lv_parameter_3_0= ruleParamQuery ) )? ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:841:1: ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ContainerNode_2= ruleContainerNode ) ( (lv_parameter_3_0= ruleParamQuery ) )? )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:841:1: ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ContainerNode_2= ruleContainerNode ) ( (lv_parameter_3_0= ruleParamQuery ) )? )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:841:2: (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ContainerNode_2= ruleContainerNode ) ( (lv_parameter_3_0= ruleParamQuery ) )?
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:841:2: (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ContainerNode_2= ruleContainerNode )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt14=1;
                }
                break;
            case 18:
                {
                alt14=2;
                }
                break;
            case RULE_ID:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:842:2: this_SubPathNode_0= ruleSubPathNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getSubPathNodeParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubPathNode_in_ruleNode1773);
                    this_SubPathNode_0=ruleSubPathNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SubPathNode_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:855:2: this_WildcardNode_1= ruleWildcardNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getWildcardNodeParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWildcardNode_in_ruleNode1803);
                    this_WildcardNode_1=ruleWildcardNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WildcardNode_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:868:2: this_ContainerNode_2= ruleContainerNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getContainerNodeParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContainerNode_in_ruleNode1833);
                    this_ContainerNode_2=ruleContainerNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ContainerNode_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:879:2: ( (lv_parameter_3_0= ruleParamQuery ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:880:1: (lv_parameter_3_0= ruleParamQuery )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:880:1: (lv_parameter_3_0= ruleParamQuery )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:881:3: lv_parameter_3_0= ruleParamQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeAccess().getParameterParamQueryParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParamQuery_in_ruleNode1854);
                    lv_parameter_3_0=ruleParamQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeRule());
                      	        }
                             		set(
                             			current, 
                             			"parameter",
                              		lv_parameter_3_0, 
                              		"ParamQuery");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleParamQuery"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:905:1: entryRuleParamQuery returns [EObject current=null] : iv_ruleParamQuery= ruleParamQuery EOF ;
    public final EObject entryRuleParamQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamQuery = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:906:2: (iv_ruleParamQuery= ruleParamQuery EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:907:2: iv_ruleParamQuery= ruleParamQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamQueryRule()); 
            }
            pushFollow(FOLLOW_ruleParamQuery_in_entryRuleParamQuery1891);
            iv_ruleParamQuery=ruleParamQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParamQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamQuery1901); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamQuery"


    // $ANTLR start "ruleParamQuery"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:914:1: ruleParamQuery returns [EObject current=null] : (otherlv_0= '[' ( (lv_queries_1_0= ruleParamCompare ) )+ otherlv_2= ']' ) ;
    public final EObject ruleParamQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_queries_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:917:28: ( (otherlv_0= '[' ( (lv_queries_1_0= ruleParamCompare ) )+ otherlv_2= ']' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:918:1: (otherlv_0= '[' ( (lv_queries_1_0= ruleParamCompare ) )+ otherlv_2= ']' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:918:1: (otherlv_0= '[' ( (lv_queries_1_0= ruleParamCompare ) )+ otherlv_2= ']' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:918:3: otherlv_0= '[' ( (lv_queries_1_0= ruleParamCompare ) )+ otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleParamQuery1938); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParamQueryAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:922:1: ( (lv_queries_1_0= ruleParamCompare ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||LA16_0==18||LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:923:1: (lv_queries_1_0= ruleParamCompare )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:923:1: (lv_queries_1_0= ruleParamCompare )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:924:3: lv_queries_1_0= ruleParamCompare
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParamQueryAccess().getQueriesParamCompareParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParamCompare_in_ruleParamQuery1959);
            	    lv_queries_1_0=ruleParamCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParamQueryRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"queries",
            	              		lv_queries_1_0, 
            	              		"ParamCompare");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleParamQuery1972); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParamQueryAccess().getRightSquareBracketKeyword_2());
                  
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
    // $ANTLR end "ruleParamQuery"


    // $ANTLR start "entryRuleParamCompare"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:952:1: entryRuleParamCompare returns [EObject current=null] : iv_ruleParamCompare= ruleParamCompare EOF ;
    public final EObject entryRuleParamCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamCompare = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:953:2: (iv_ruleParamCompare= ruleParamCompare EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:954:2: iv_ruleParamCompare= ruleParamCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamCompareRule()); 
            }
            pushFollow(FOLLOW_ruleParamCompare_in_entryRuleParamCompare2008);
            iv_ruleParamCompare=ruleParamCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParamCompare; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamCompare2018); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamCompare"


    // $ANTLR start "ruleParamCompare"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:961:1: ruleParamCompare returns [EObject current=null] : ( ( (lv_left_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) ) ) ) ;
    public final EObject ruleParamCompare() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:964:28: ( ( ( (lv_left_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:965:1: ( ( (lv_left_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:965:1: ( ( (lv_left_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:965:2: ( (lv_left_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:965:2: ( (lv_left_0_0= ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:966:1: (lv_left_0_0= ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:966:1: (lv_left_0_0= ruleValue )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:967:3: lv_left_0_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParamCompareAccess().getLeftValueParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleParamCompare2064);
            lv_left_0_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParamCompareRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:983:2: ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:983:3: ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:983:3: ( (lv_operator_1_0= ruleOperator ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:984:1: (lv_operator_1_0= ruleOperator )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:984:1: (lv_operator_1_0= ruleOperator )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:985:3: lv_operator_1_0= ruleOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParamCompareAccess().getOperatorOperatorEnumRuleCall_1_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperator_in_ruleParamCompare2086);
            lv_operator_1_0=ruleOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParamCompareRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_1_0, 
                      		"Operator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1001:2: ( (lv_right_2_0= ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1002:1: (lv_right_2_0= ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1002:1: (lv_right_2_0= ruleValue )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1003:3: lv_right_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParamCompareAccess().getRightValueParserRuleCall_1_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleParamCompare2107);
            lv_right_2_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParamCompareRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_2_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
    // $ANTLR end "ruleParamCompare"


    // $ANTLR start "entryRuleValue"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1027:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1028:2: (iv_ruleValue= ruleValue EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1029:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue2144);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue2154); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1036:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_FloatValue_2= ruleFloatValue | this_ReferenceValue_3= ruleReferenceValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntValue_1 = null;

        EObject this_FloatValue_2 = null;

        EObject this_ReferenceValue_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1039:28: ( (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_FloatValue_2= ruleFloatValue | this_ReferenceValue_3= ruleReferenceValue ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1040:1: (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_FloatValue_2= ruleFloatValue | this_ReferenceValue_3= ruleReferenceValue )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1040:1: (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_FloatValue_2= ruleFloatValue | this_ReferenceValue_3= ruleReferenceValue )
            int alt17=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt17=1;
                }
                break;
            case RULE_INT:
                {
                int LA17_2 = input.LA(2);

                if ( (synpred20_InternalApplicationLang()) ) {
                    alt17=2;
                }
                else if ( (synpred21_InternalApplicationLang()) ) {
                    alt17=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 18:
            case 28:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1041:2: this_StringValue_0= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue2204);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1054:2: this_IntValue_1= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValue2234);
                    this_IntValue_1=ruleIntValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntValue_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1067:2: this_FloatValue_2= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getFloatValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleValue2264);
                    this_FloatValue_2=ruleFloatValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FloatValue_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1080:2: this_ReferenceValue_3= ruleReferenceValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getReferenceValueParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceValue_in_ruleValue2294);
                    this_ReferenceValue_3=ruleReferenceValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceValue_3; 
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleFloatValue"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1099:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1100:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1101:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue2329);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue2339); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1108:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1111:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1112:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1112:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1113:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1113:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1114:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloatValue2380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getFloatValueAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFloatValueRule());
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
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleIntValue"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1138:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1139:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1140:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue2420);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue2430); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1147:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1150:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1151:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1151:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1152:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1152:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1153:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue2471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntValueRule());
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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleStringValue"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1177:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1178:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1179:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue2511);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue2521); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1186:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1189:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1190:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1190:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1191:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1191:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1192:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue2562); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringValueRule());
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleReferenceValue"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1216:1: entryRuleReferenceValue returns [EObject current=null] : iv_ruleReferenceValue= ruleReferenceValue EOF ;
    public final EObject entryRuleReferenceValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceValue = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1217:2: (iv_ruleReferenceValue= ruleReferenceValue EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1218:2: iv_ruleReferenceValue= ruleReferenceValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceValueRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceValue_in_entryRuleReferenceValue2602);
            iv_ruleReferenceValue=ruleReferenceValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceValue2612); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1225:1: ruleReferenceValue returns [EObject current=null] : ( ( (lv_query_0_0= ruleLocationQuery ) ) ( (lv_parameter_1_0= ruleParameter ) ) ) ;
    public final EObject ruleReferenceValue() throws RecognitionException {
        EObject current = null;

        EObject lv_query_0_0 = null;

        EObject lv_parameter_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1228:28: ( ( ( (lv_query_0_0= ruleLocationQuery ) ) ( (lv_parameter_1_0= ruleParameter ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1229:1: ( ( (lv_query_0_0= ruleLocationQuery ) ) ( (lv_parameter_1_0= ruleParameter ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1229:1: ( ( (lv_query_0_0= ruleLocationQuery ) ) ( (lv_parameter_1_0= ruleParameter ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1229:2: ( (lv_query_0_0= ruleLocationQuery ) ) ( (lv_parameter_1_0= ruleParameter ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1229:2: ( (lv_query_0_0= ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1230:1: (lv_query_0_0= ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1230:1: (lv_query_0_0= ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1231:3: lv_query_0_0= ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceValueAccess().getQueryLocationQueryParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_ruleReferenceValue2658);
            lv_query_0_0=ruleLocationQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReferenceValueRule());
              	        }
                     		set(
                     			current, 
                     			"query",
                      		lv_query_0_0, 
                      		"LocationQuery");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1247:2: ( (lv_parameter_1_0= ruleParameter ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1248:1: (lv_parameter_1_0= ruleParameter )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1248:1: (lv_parameter_1_0= ruleParameter )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1249:3: lv_parameter_1_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceValueAccess().getParameterParameterParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameter_in_ruleReferenceValue2679);
            lv_parameter_1_0=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReferenceValueRule());
              	        }
                     		set(
                     			current, 
                     			"parameter",
                      		lv_parameter_1_0, 
                      		"Parameter");
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
    // $ANTLR end "ruleReferenceValue"


    // $ANTLR start "entryRuleParameter"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1273:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1274:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1275:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2715);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2725); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1282:1: ruleParameter returns [EObject current=null] : (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_RuntimeProperty_0 = null;

        EObject this_ReflectionProperty_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1285:28: ( (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1286:1: (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1286:1: (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            else if ( (LA18_0==27) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1287:2: this_RuntimeProperty_0= ruleRuntimeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getRuntimePropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRuntimeProperty_in_ruleParameter2775);
                    this_RuntimeProperty_0=ruleRuntimeProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RuntimeProperty_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1300:2: this_ReflectionProperty_1= ruleReflectionProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getReflectionPropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReflectionProperty_in_ruleParameter2805);
                    this_ReflectionProperty_1=ruleReflectionProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReflectionProperty_1; 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleRuntimeProperty"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1319:1: entryRuleRuntimeProperty returns [EObject current=null] : iv_ruleRuntimeProperty= ruleRuntimeProperty EOF ;
    public final EObject entryRuleRuntimeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuntimeProperty = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1320:2: (iv_ruleRuntimeProperty= ruleRuntimeProperty EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1321:2: iv_ruleRuntimeProperty= ruleRuntimeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuntimePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleRuntimeProperty_in_entryRuleRuntimeProperty2840);
            iv_ruleRuntimeProperty=ruleRuntimeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuntimeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuntimeProperty2850); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuntimeProperty"


    // $ANTLR start "ruleRuntimeProperty"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1328:1: ruleRuntimeProperty returns [EObject current=null] : (otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRuntimeProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_reference_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1331:28: ( (otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1332:1: (otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1332:1: (otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1332:3: otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleRuntimeProperty2887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRuntimePropertyAccess().getNumberSignKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1336:1: ( (lv_reference_1_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1337:1: (lv_reference_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1337:1: (lv_reference_1_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1338:3: lv_reference_1_0= RULE_ID
            {
            lv_reference_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuntimeProperty2904); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_reference_1_0, grammarAccess.getRuntimePropertyAccess().getReferenceIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRuntimePropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"reference",
                      		lv_reference_1_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleRuntimeProperty"


    // $ANTLR start "entryRuleReflectionProperty"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1362:1: entryRuleReflectionProperty returns [EObject current=null] : iv_ruleReflectionProperty= ruleReflectionProperty EOF ;
    public final EObject entryRuleReflectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReflectionProperty = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1363:2: (iv_ruleReflectionProperty= ruleReflectionProperty EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1364:2: iv_ruleReflectionProperty= ruleReflectionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReflectionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReflectionProperty_in_entryRuleReflectionProperty2945);
            iv_ruleReflectionProperty=ruleReflectionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReflectionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReflectionProperty2955); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReflectionProperty"


    // $ANTLR start "ruleReflectionProperty"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1371:1: ruleReflectionProperty returns [EObject current=null] : (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) ) ;
    public final EObject ruleReflectionProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_function_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1374:28: ( (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1375:1: (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1375:1: (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1375:3: otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleReflectionProperty2992); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReflectionPropertyAccess().getDollarSignKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1379:1: ( (lv_function_1_0= ruleReflectionFunction ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1380:1: (lv_function_1_0= ruleReflectionFunction )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1380:1: (lv_function_1_0= ruleReflectionFunction )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1381:3: lv_function_1_0= ruleReflectionFunction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReflectionPropertyAccess().getFunctionReflectionFunctionEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReflectionFunction_in_ruleReflectionProperty3013);
            lv_function_1_0=ruleReflectionFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReflectionPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"function",
                      		lv_function_1_0, 
                      		"ReflectionFunction");
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
    // $ANTLR end "ruleReflectionProperty"


    // $ANTLR start "entryRuleContainerNode"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1405:1: entryRuleContainerNode returns [EObject current=null] : iv_ruleContainerNode= ruleContainerNode EOF ;
    public final EObject entryRuleContainerNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerNode = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1406:2: (iv_ruleContainerNode= ruleContainerNode EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1407:2: iv_ruleContainerNode= ruleContainerNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerNodeRule()); 
            }
            pushFollow(FOLLOW_ruleContainerNode_in_entryRuleContainerNode3049);
            iv_ruleContainerNode=ruleContainerNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerNode3059); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerNode"


    // $ANTLR start "ruleContainerNode"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1414:1: ruleContainerNode returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleContainerNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1417:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1418:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1418:1: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1419:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1419:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1420:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getContainerNodeRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContainerNode3107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getContainerNodeAccess().getContainerContainerCrossReference_0()); 
              	
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
    // $ANTLR end "ruleContainerNode"


    // $ANTLR start "entryRuleWildcardNode"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1442:1: entryRuleWildcardNode returns [EObject current=null] : iv_ruleWildcardNode= ruleWildcardNode EOF ;
    public final EObject entryRuleWildcardNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcardNode = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1443:2: (iv_ruleWildcardNode= ruleWildcardNode EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1444:2: iv_ruleWildcardNode= ruleWildcardNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWildcardNodeRule()); 
            }
            pushFollow(FOLLOW_ruleWildcardNode_in_entryRuleWildcardNode3142);
            iv_ruleWildcardNode=ruleWildcardNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWildcardNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcardNode3152); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWildcardNode"


    // $ANTLR start "ruleWildcardNode"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1451:1: ruleWildcardNode returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleWildcardNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1454:28: ( ( () otherlv_1= '*' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1455:1: ( () otherlv_1= '*' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1455:1: ( () otherlv_1= '*' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1455:2: () otherlv_1= '*'
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1455:2: ()
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1456:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getWildcardNodeAccess().getWildcardNodeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleWildcardNode3201); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWildcardNodeAccess().getAsteriskKeyword_1());
                  
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
    // $ANTLR end "ruleWildcardNode"


    // $ANTLR start "entryRuleSubPathNode"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1476:1: entryRuleSubPathNode returns [EObject current=null] : iv_ruleSubPathNode= ruleSubPathNode EOF ;
    public final EObject entryRuleSubPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPathNode = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1477:2: (iv_ruleSubPathNode= ruleSubPathNode EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1478:2: iv_ruleSubPathNode= ruleSubPathNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubPathNodeRule()); 
            }
            pushFollow(FOLLOW_ruleSubPathNode_in_entryRuleSubPathNode3237);
            iv_ruleSubPathNode=ruleSubPathNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubPathNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubPathNode3247); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubPathNode"


    // $ANTLR start "ruleSubPathNode"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1485:1: ruleSubPathNode returns [EObject current=null] : ( () otherlv_1= '**' ) ;
    public final EObject ruleSubPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1488:28: ( ( () otherlv_1= '**' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1489:1: ( () otherlv_1= '**' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1489:1: ( () otherlv_1= '**' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1489:2: () otherlv_1= '**'
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1489:2: ()
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1490:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubPathNodeAccess().getSubPathNodeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleSubPathNode3296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubPathNodeAccess().getAsteriskAsteriskKeyword_1());
                  
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
    // $ANTLR end "ruleSubPathNode"


    // $ANTLR start "entryRuleCollector"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1510:1: entryRuleCollector returns [EObject current=null] : iv_ruleCollector= ruleCollector EOF ;
    public final EObject entryRuleCollector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollector = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1511:2: (iv_ruleCollector= ruleCollector EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1512:2: iv_ruleCollector= ruleCollector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectorRule()); 
            }
            pushFollow(FOLLOW_ruleCollector_in_entryRuleCollector3332);
            iv_ruleCollector=ruleCollector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollector3342); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollector"


    // $ANTLR start "ruleCollector"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1519:1: ruleCollector returns [EObject current=null] : ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleCollector() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_insertionPoint_0_0 = null;

        EObject lv_initializations_3_0 = null;

        EObject lv_initializations_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1522:28: ( ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )* )? otherlv_6= ')' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1523:1: ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )* )? otherlv_6= ')' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1523:1: ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )* )? otherlv_6= ')' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1523:2: ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )* )? otherlv_6= ')'
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1523:2: ( (lv_insertionPoint_0_0= ruleInsertionPoint ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1524:1: (lv_insertionPoint_0_0= ruleInsertionPoint )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1524:1: (lv_insertionPoint_0_0= ruleInsertionPoint )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1525:3: lv_insertionPoint_0_0= ruleInsertionPoint
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectorAccess().getInsertionPointInsertionPointEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInsertionPoint_in_ruleCollector3388);
            lv_insertionPoint_0_0=ruleInsertionPoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectorRule());
              	        }
                     		set(
                     			current, 
                     			"insertionPoint",
                      		lv_insertionPoint_0_0, 
                      		"InsertionPoint");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1541:2: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1542:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1542:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1543:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCollectorRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectorAccess().getTypeRecordTypeCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCollector3415);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleCollector3427); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCollectorAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1563:1: ( ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_INT)||LA20_0==18||LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1563:2: ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )*
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1563:2: ( (lv_initializations_3_0= ruleValue ) )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1564:1: (lv_initializations_3_0= ruleValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1564:1: (lv_initializations_3_0= ruleValue )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1565:3: lv_initializations_3_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectorAccess().getInitializationsValueParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleCollector3449);
                    lv_initializations_3_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectorRule());
                      	        }
                             		add(
                             			current, 
                             			"initializations",
                              		lv_initializations_3_0, 
                              		"Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1581:2: (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==15) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1581:4: otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleCollector3462); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getCollectorAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1585:1: ( (lv_initializations_5_0= ruleValue ) )
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1586:1: (lv_initializations_5_0= ruleValue )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1586:1: (lv_initializations_5_0= ruleValue )
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1587:3: lv_initializations_5_0= ruleValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectorAccess().getInitializationsValueParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleValue_in_ruleCollector3483);
                    	    lv_initializations_5_0=ruleValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCollectorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"initializations",
                    	              		lv_initializations_5_0, 
                    	              		"Value");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

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

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleCollector3499); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCollectorAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleCollector"


    // $ANTLR start "ruleReflectionFunction"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1615:1: ruleReflectionFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'class' ) | (enumLiteral_3= 'return-type' ) ) ;
    public final Enumerator ruleReflectionFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1617:28: ( ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'class' ) | (enumLiteral_3= 'return-type' ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1618:1: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'class' ) | (enumLiteral_3= 'return-type' ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1618:1: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'class' ) | (enumLiteral_3= 'return-type' ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt21=1;
                }
                break;
            case 30:
                {
                alt21=2;
                }
                break;
            case 31:
                {
                alt21=3;
                }
                break;
            case 32:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1618:2: (enumLiteral_0= 'name' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1618:2: (enumLiteral_0= 'name' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1618:4: enumLiteral_0= 'name'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_29_in_ruleReflectionFunction3549); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1624:6: (enumLiteral_1= 'signature' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1624:6: (enumLiteral_1= 'signature' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1624:8: enumLiteral_1= 'signature'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_30_in_ruleReflectionFunction3566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1630:6: (enumLiteral_2= 'class' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1630:6: (enumLiteral_2= 'class' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1630:8: enumLiteral_2= 'class'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_31_in_ruleReflectionFunction3583); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1636:6: (enumLiteral_3= 'return-type' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1636:6: (enumLiteral_3= 'return-type' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1636:8: enumLiteral_3= 'return-type'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_32_in_ruleReflectionFunction3600); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getRETURN_TYPEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getReflectionFunctionAccess().getRETURN_TYPEEnumLiteralDeclaration_3()); 
                          
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
    // $ANTLR end "ruleReflectionFunction"


    // $ANTLR start "ruleOperator"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1646:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1648:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1649:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1649:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) )
            int alt22=7;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt22=1;
                }
                break;
            case 34:
                {
                alt22=2;
                }
                break;
            case 35:
                {
                alt22=3;
                }
                break;
            case 36:
                {
                alt22=4;
                }
                break;
            case 37:
                {
                alt22=5;
                }
                break;
            case 38:
                {
                alt22=6;
                }
                break;
            case 39:
                {
                alt22=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1649:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1649:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1649:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_33_in_ruleOperator3645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1655:6: (enumLiteral_1= '~' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1655:6: (enumLiteral_1= '~' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1655:8: enumLiteral_1= '~'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_34_in_ruleOperator3662); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getLIKEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1661:6: (enumLiteral_2= '!=' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1661:6: (enumLiteral_2= '!=' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1661:8: enumLiteral_2= '!='
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_35_in_ruleOperator3679); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getNEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1667:6: (enumLiteral_3= '>' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1667:6: (enumLiteral_3= '>' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1667:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_36_in_ruleOperator3696); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getGREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getGREnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1673:6: (enumLiteral_4= '<' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1673:6: (enumLiteral_4= '<' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1673:8: enumLiteral_4= '<'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_37_in_ruleOperator3713); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getLWEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1679:6: (enumLiteral_5= '>=' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1679:6: (enumLiteral_5= '>=' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1679:8: enumLiteral_5= '>='
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_38_in_ruleOperator3730); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getGEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1685:6: (enumLiteral_6= '<=' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1685:6: (enumLiteral_6= '<=' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1685:8: enumLiteral_6= '<='
                    {
                    enumLiteral_6=(Token)match(input,39,FOLLOW_39_in_ruleOperator3747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getLEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getOperatorAccess().getLEEnumLiteralDeclaration_6()); 
                          
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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleInsertionPoint"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1695:1: ruleInsertionPoint returns [Enumerator current=null] : ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) ) ;
    public final Enumerator ruleInsertionPoint() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1697:28: ( ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1698:1: ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1698:1: ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            else if ( (LA23_0==41) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1698:2: (enumLiteral_0= 'before' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1698:2: (enumLiteral_0= 'before' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1698:4: enumLiteral_0= 'before'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleInsertionPoint3792); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1704:6: (enumLiteral_1= 'after' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1704:6: (enumLiteral_1= 'after' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1704:8: enumLiteral_1= 'after'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleInsertionPoint3809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getInsertionPointAccess().getAFTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getInsertionPointAccess().getAFTEREnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleInsertionPoint"

    // $ANTLR start synpred20_InternalApplicationLang
    public final void synpred20_InternalApplicationLang_fragment() throws RecognitionException {   
        EObject this_IntValue_1 = null;


        // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1054:2: (this_IntValue_1= ruleIntValue )
        // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1054:2: this_IntValue_1= ruleIntValue
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleIntValue_in_synpred20_InternalApplicationLang2234);
        this_IntValue_1=ruleIntValue();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalApplicationLang

    // $ANTLR start synpred21_InternalApplicationLang
    public final void synpred21_InternalApplicationLang_fragment() throws RecognitionException {   
        EObject this_FloatValue_2 = null;


        // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1067:2: (this_FloatValue_2= ruleFloatValue )
        // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1067:2: this_FloatValue_2= ruleFloatValue
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleFloatValue_in_synpred21_InternalApplicationLang2264);
        this_FloatValue_2=ruleFloatValue();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalApplicationLang

    // Delegated rules

    public final boolean synpred20_InternalApplicationLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalApplicationLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalApplicationLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalApplicationLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel149 = new BitSet(new long[]{0x0000000000087002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_ruleModel170 = new BitSet(new long[]{0x0000000000087002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel192 = new BitSet(new long[]{0x0000000000085002L});
    public static final BitSet FOLLOW_ruleApplicationModel_in_ruleModel214 = new BitSet(new long[]{0x0000000000084002L});
    public static final BitSet FOLLOW_ruleAspect_in_ruleModel236 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_entryRuleRegisteredPackage377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegisteredPackage387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRegisteredPackage424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegisteredPackage441 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRegisteredPackage470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationModel_in_entryRuleApplicationModel506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationModel516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleApplicationModel553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationModel577 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleApplicationModel590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationModel614 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleApplicationModel628 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationModel645 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplicationModel667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName760 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedName788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName804 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard910 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedNameWithWildcard929 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQualifiedNameWithWildcard942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAspect1031 = new BitSet(new long[]{0x0000000010040010L});
    public static final BitSet FOLLOW_ruleQuery_in_ruleAspect1052 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAspect1064 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_ruleCollector_in_ruleAspect1085 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAspect1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery1133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_ruleQuery1189 = new BitSet(new long[]{0x0000000000040012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery1215 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleQuery1233 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery1259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18_in_ruleQuery1277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery1302 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleQuery1314 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_ruleQuery1335 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_15_in_ruleQuery1348 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_ruleQuery1369 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleQuery1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_entryRuleParameterPattern1421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterPattern1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterPattern1481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18_in_ruleParameterPattern1499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterPattern1524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterPattern1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_entryRuleLocationQuery1584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocationQuery1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleLocationQuery1640 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleLocationQuery1653 = new BitSet(new long[]{0x0000000010040010L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_ruleLocationQuery1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode1712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubPathNode_in_ruleNode1773 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleWildcardNode_in_ruleNode1803 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleContainerNode_in_ruleNode1833 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleParamQuery_in_ruleNode1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamQuery_in_entryRuleParamQuery1891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamQuery1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleParamQuery1938 = new BitSet(new long[]{0x0000000010040070L});
    public static final BitSet FOLLOW_ruleParamCompare_in_ruleParamQuery1959 = new BitSet(new long[]{0x0000000012040070L});
    public static final BitSet FOLLOW_25_in_ruleParamQuery1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamCompare_in_entryRuleParamCompare2008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamCompare2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleParamCompare2064 = new BitSet(new long[]{0x000000FE00000000L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleParamCompare2086 = new BitSet(new long[]{0x0000000010040070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleParamCompare2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue2144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValue2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleValue2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValue_in_ruleValue2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue2329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloatValue2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue2420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue2511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValue_in_entryRuleReferenceValue2602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceValue2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_ruleReferenceValue2658 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleReferenceValue2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuntimeProperty_in_ruleParameter2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionProperty_in_ruleParameter2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuntimeProperty_in_entryRuleRuntimeProperty2840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuntimeProperty2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRuntimeProperty2887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuntimeProperty2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionProperty_in_entryRuleReflectionProperty2945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReflectionProperty2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleReflectionProperty2992 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleReflectionFunction_in_ruleReflectionProperty3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerNode_in_entryRuleContainerNode3049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerNode3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContainerNode3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNode_in_entryRuleWildcardNode3142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcardNode3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleWildcardNode3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubPathNode_in_entryRuleSubPathNode3237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubPathNode3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSubPathNode3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollector_in_entryRuleCollector3332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollector3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertionPoint_in_ruleCollector3388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCollector3415 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCollector3427 = new BitSet(new long[]{0x0000000010840070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCollector3449 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_15_in_ruleCollector3462 = new BitSet(new long[]{0x0000000010040070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCollector3483 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleCollector3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleReflectionFunction3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleReflectionFunction3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleReflectionFunction3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleReflectionFunction3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOperator3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOperator3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOperator3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOperator3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOperator3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOperator3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOperator3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleInsertionPoint3792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleInsertionPoint3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_synpred20_InternalApplicationLang2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_synpred21_InternalApplicationLang2264 = new BitSet(new long[]{0x0000000000000002L});

}
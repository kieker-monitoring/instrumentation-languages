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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'register'", "'use'", "','", "'on'", "'.'", "'aspect'", "'{'", "'}'", "'*'", "'('", "')'", "'['", "']'", "'#'", "'$'", "'**'", "'name'", "'signature'", "'class'", "'return-type'", "'='", "'~'", "'!='", "'>'", "'<'", "'>='", "'<='", "'before'", "'after'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:83:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_metamodels_2_0= ruleRegisteredPackage ) )* ( (lv_sources_3_0= ruleApplicationModel ) )* ( (lv_aspects_4_0= ruleAspect ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_metamodels_2_0 = null;

        EObject lv_sources_3_0 = null;

        EObject lv_aspects_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:86:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_metamodels_2_0= ruleRegisteredPackage ) )* ( (lv_sources_3_0= ruleApplicationModel ) )* ( (lv_aspects_4_0= ruleAspect ) )* ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:87:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_metamodels_2_0= ruleRegisteredPackage ) )* ( (lv_sources_3_0= ruleApplicationModel ) )* ( (lv_aspects_4_0= ruleAspect ) )* )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:87:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_metamodels_2_0= ruleRegisteredPackage ) )* ( (lv_sources_3_0= ruleApplicationModel ) )* ( (lv_aspects_4_0= ruleAspect ) )* )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:87:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_metamodels_2_0= ruleRegisteredPackage ) )* ( (lv_sources_3_0= ruleApplicationModel ) )* ( (lv_aspects_4_0= ruleAspect ) )*
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

                if ( (LA1_0==12) ) {
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:127:3: ( (lv_sources_3_0= ruleApplicationModel ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:128:1: (lv_sources_3_0= ruleApplicationModel )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:128:1: (lv_sources_3_0= ruleApplicationModel )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:129:3: lv_sources_3_0= ruleApplicationModel
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getSourcesApplicationModelParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleApplicationModel_in_ruleModel192);
            	    lv_sources_3_0=ruleApplicationModel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sources",
            	              		lv_sources_3_0, 
            	              		"ApplicationModel");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:145:3: ( (lv_aspects_4_0= ruleAspect ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:146:1: (lv_aspects_4_0= ruleAspect )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:146:1: (lv_aspects_4_0= ruleAspect )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:147:3: lv_aspects_4_0= ruleAspect
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getAspectsAspectParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAspect_in_ruleModel214);
            	    lv_aspects_4_0=ruleAspect();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"aspects",
            	              		lv_aspects_4_0, 
            	              		"Aspect");
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


    // $ANTLR start "entryRuleRegisteredPackage"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:171:1: entryRuleRegisteredPackage returns [EObject current=null] : iv_ruleRegisteredPackage= ruleRegisteredPackage EOF ;
    public final EObject entryRuleRegisteredPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisteredPackage = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:172:2: (iv_ruleRegisteredPackage= ruleRegisteredPackage EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:173:2: iv_ruleRegisteredPackage= ruleRegisteredPackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegisteredPackageRule()); 
            }
            pushFollow(FOLLOW_ruleRegisteredPackage_in_entryRuleRegisteredPackage251);
            iv_ruleRegisteredPackage=ruleRegisteredPackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegisteredPackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegisteredPackage261); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:180:1: ruleRegisteredPackage returns [EObject current=null] : (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) ) ;
    public final EObject ruleRegisteredPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:183:28: ( (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:184:1: (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:184:1: (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:184:3: otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleRegisteredPackage298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRegisteredPackageAccess().getRegisterKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:188:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:189:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:189:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:190:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegisteredPackage315); if (state.failed) return current;
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:206:2: ( (otherlv_2= RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:207:1: (otherlv_2= RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:207:1: (otherlv_2= RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:208:3: otherlv_2= RULE_STRING
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRegisteredPackageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRegisteredPackage344); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:230:1: entryRuleApplicationModel returns [EObject current=null] : iv_ruleApplicationModel= ruleApplicationModel EOF ;
    public final EObject entryRuleApplicationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationModel = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:231:2: (iv_ruleApplicationModel= ruleApplicationModel EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:232:2: iv_ruleApplicationModel= ruleApplicationModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationModelRule()); 
            }
            pushFollow(FOLLOW_ruleApplicationModel_in_entryRuleApplicationModel380);
            iv_ruleApplicationModel=ruleApplicationModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplicationModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationModel390); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:239:1: ruleApplicationModel returns [EObject current=null] : (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'on' ( (lv_name_5_0= RULE_ID ) ) ( (lv_model_6_0= RULE_STRING ) ) ) ;
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
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:242:28: ( (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'on' ( (lv_name_5_0= RULE_ID ) ) ( (lv_model_6_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:243:1: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'on' ( (lv_name_5_0= RULE_ID ) ) ( (lv_model_6_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:243:1: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'on' ( (lv_name_5_0= RULE_ID ) ) ( (lv_model_6_0= RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:243:3: otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'on' ( (lv_name_5_0= RULE_ID ) ) ( (lv_model_6_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleApplicationModel427); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getApplicationModelAccess().getUseKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:247:1: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:248:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:248:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:249:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getApplicationModelRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationModel451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:263:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:263:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleApplicationModel464); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getApplicationModelAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:267:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:268:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:268:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:269:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getApplicationModelRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationModel488); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageCrossReference_2_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleApplicationModel502); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getApplicationModelAccess().getOnKeyword_3());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:287:1: ( (lv_name_5_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:288:1: (lv_name_5_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:288:1: (lv_name_5_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:289:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationModel519); if (state.failed) return current;
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:305:2: ( (lv_model_6_0= RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:306:1: (lv_model_6_0= RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:306:1: (lv_model_6_0= RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:307:3: lv_model_6_0= RULE_STRING
            {
            lv_model_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplicationModel541); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:331:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:332:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:333:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName583);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName594); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:340:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:343:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:344:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:344:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:344:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName634); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:351:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:351:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:351:2: ( ( '.' )=>kw= '.' )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:351:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedName662); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName678); if (state.failed) return current;
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


    // $ANTLR start "entryRuleAspect"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:376:1: entryRuleAspect returns [EObject current=null] : iv_ruleAspect= ruleAspect EOF ;
    public final EObject entryRuleAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspect = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:377:2: (iv_ruleAspect= ruleAspect EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:378:2: iv_ruleAspect= ruleAspect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAspectRule()); 
            }
            pushFollow(FOLLOW_ruleAspect_in_entryRuleAspect727);
            iv_ruleAspect=ruleAspect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAspect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspect737); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:385:1: ruleAspect returns [EObject current=null] : (otherlv_0= 'aspect' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '{' ( (lv_collectors_3_0= ruleCollector ) ) otherlv_4= '}' ) ;
    public final EObject ruleAspect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_query_1_0 = null;

        EObject lv_collectors_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:388:28: ( (otherlv_0= 'aspect' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '{' ( (lv_collectors_3_0= ruleCollector ) ) otherlv_4= '}' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:389:1: (otherlv_0= 'aspect' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '{' ( (lv_collectors_3_0= ruleCollector ) ) otherlv_4= '}' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:389:1: (otherlv_0= 'aspect' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '{' ( (lv_collectors_3_0= ruleCollector ) ) otherlv_4= '}' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:389:3: otherlv_0= 'aspect' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '{' ( (lv_collectors_3_0= ruleCollector ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleAspect774); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAspectAccess().getAspectKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:393:1: ( (lv_query_1_0= ruleQuery ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:394:1: (lv_query_1_0= ruleQuery )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:394:1: (lv_query_1_0= ruleQuery )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:395:3: lv_query_1_0= ruleQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAspectAccess().getQueryQueryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQuery_in_ruleAspect795);
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAspect807); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:415:1: ( (lv_collectors_3_0= ruleCollector ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:416:1: (lv_collectors_3_0= ruleCollector )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:416:1: (lv_collectors_3_0= ruleCollector )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:417:3: lv_collectors_3_0= ruleCollector
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAspectAccess().getCollectorsCollectorParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCollector_in_ruleAspect828);
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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleAspect840); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:445:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:446:2: (iv_ruleQuery= ruleQuery EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:447:2: iv_ruleQuery= ruleQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryRule()); 
            }
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery876);
            iv_ruleQuery=ruleQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery886); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:454:1: ruleQuery returns [EObject current=null] : ( ( (lv_location_0_0= ruleLocationQuery ) ) ( ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '*' ) ( ( (otherlv_3= RULE_ID ) ) | otherlv_4= '*' ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameter_7_0= ruleParameterPattern ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameterPattern ) ) )* otherlv_10= ')' )? ) ;
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
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:457:28: ( ( ( (lv_location_0_0= ruleLocationQuery ) ) ( ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '*' ) ( ( (otherlv_3= RULE_ID ) ) | otherlv_4= '*' ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameter_7_0= ruleParameterPattern ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameterPattern ) ) )* otherlv_10= ')' )? ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:458:1: ( ( (lv_location_0_0= ruleLocationQuery ) ) ( ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '*' ) ( ( (otherlv_3= RULE_ID ) ) | otherlv_4= '*' ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameter_7_0= ruleParameterPattern ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameterPattern ) ) )* otherlv_10= ')' )? )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:458:1: ( ( (lv_location_0_0= ruleLocationQuery ) ) ( ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '*' ) ( ( (otherlv_3= RULE_ID ) ) | otherlv_4= '*' ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameter_7_0= ruleParameterPattern ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameterPattern ) ) )* otherlv_10= ')' )? )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:458:2: ( (lv_location_0_0= ruleLocationQuery ) ) ( ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '*' ) ( ( (otherlv_3= RULE_ID ) ) | otherlv_4= '*' ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameter_7_0= ruleParameterPattern ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameterPattern ) ) )* otherlv_10= ')' )?
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:458:2: ( (lv_location_0_0= ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:459:1: (lv_location_0_0= ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:459:1: (lv_location_0_0= ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:460:3: lv_location_0_0= ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQueryAccess().getLocationLocationQueryParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_ruleQuery932);
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:476:2: ( ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '*' ) ( ( (otherlv_3= RULE_ID ) ) | otherlv_4= '*' ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameter_7_0= ruleParameterPattern ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameterPattern ) ) )* otherlv_10= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:476:3: ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '*' ) ( ( (otherlv_3= RULE_ID ) ) | otherlv_4= '*' ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameter_7_0= ruleParameterPattern ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameterPattern ) ) )* otherlv_10= ')'
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:476:3: ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '*' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==20) ) {
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
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:476:4: ( (otherlv_1= RULE_ID ) )
                            {
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:476:4: ( (otherlv_1= RULE_ID ) )
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:477:1: (otherlv_1= RULE_ID )
                            {
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:477:1: (otherlv_1= RULE_ID )
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:478:3: otherlv_1= RULE_ID
                            {
                            if ( state.backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getQueryRule());
                              	        }
                                      
                            }
                            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery958); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_1, grammarAccess.getQueryAccess().getModifierMethodModifierCrossReference_1_0_0_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:493:7: otherlv_2= '*'
                            {
                            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleQuery976); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getQueryAccess().getAsteriskKeyword_1_0_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:497:2: ( ( (otherlv_3= RULE_ID ) ) | otherlv_4= '*' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==20) ) {
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
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:497:3: ( (otherlv_3= RULE_ID ) )
                            {
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:497:3: ( (otherlv_3= RULE_ID ) )
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:498:1: (otherlv_3= RULE_ID )
                            {
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:498:1: (otherlv_3= RULE_ID )
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:499:3: otherlv_3= RULE_ID
                            {
                            if ( state.backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getQueryRule());
                              	        }
                                      
                            }
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery1002); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_3, grammarAccess.getQueryAccess().getReturnTypeTypeCrossReference_1_1_0_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:514:7: otherlv_4= '*'
                            {
                            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleQuery1020); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getQueryAccess().getAsteriskKeyword_1_1_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:518:2: ( (otherlv_5= RULE_ID ) )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:519:1: (otherlv_5= RULE_ID )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:519:1: (otherlv_5= RULE_ID )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:520:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getQueryRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery1045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getQueryAccess().getMethodMethodCrossReference_1_2_0()); 
                      	
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleQuery1057); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getQueryAccess().getLeftParenthesisKeyword_1_3());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:538:1: ( (lv_parameter_7_0= ruleParameterPattern ) )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:539:1: (lv_parameter_7_0= ruleParameterPattern )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:539:1: (lv_parameter_7_0= ruleParameterPattern )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:540:3: lv_parameter_7_0= ruleParameterPattern
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQueryAccess().getParameterParameterPatternParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterPattern_in_ruleQuery1078);
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

                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:556:2: (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameterPattern ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:556:4: otherlv_8= ',' ( (lv_parameter_9_0= ruleParameterPattern ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleQuery1091); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getQueryAccess().getCommaKeyword_1_5_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:560:1: ( (lv_parameter_9_0= ruleParameterPattern ) )
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:561:1: (lv_parameter_9_0= ruleParameterPattern )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:561:1: (lv_parameter_9_0= ruleParameterPattern )
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:562:3: lv_parameter_9_0= ruleParameterPattern
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQueryAccess().getParameterParameterPatternParserRuleCall_1_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameterPattern_in_ruleQuery1112);
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
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleQuery1126); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:590:1: entryRuleParameterPattern returns [EObject current=null] : iv_ruleParameterPattern= ruleParameterPattern EOF ;
    public final EObject entryRuleParameterPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterPattern = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:591:2: (iv_ruleParameterPattern= ruleParameterPattern EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:592:2: iv_ruleParameterPattern= ruleParameterPattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterPatternRule()); 
            }
            pushFollow(FOLLOW_ruleParameterPattern_in_entryRuleParameterPattern1164);
            iv_ruleParameterPattern=ruleParameterPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterPattern1174); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:599:1: ruleParameterPattern returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleParameterPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:602:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:603:1: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:603:1: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:603:2: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:603:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:604:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:604:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:605:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterPatternRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterPattern1223); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getParameterPatternAccess().getModifierParameterModifierCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:619:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:620:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:620:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:621:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterPatternRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterPattern1247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getParameterPatternAccess().getTypeTypeCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:635:2: ( (otherlv_2= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:636:1: (otherlv_2= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:636:1: (otherlv_2= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:637:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterPatternRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterPattern1271); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getParameterPatternAccess().getParameterParameterCrossReference_2_0()); 
              	
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:659:1: entryRuleLocationQuery returns [EObject current=null] : iv_ruleLocationQuery= ruleLocationQuery EOF ;
    public final EObject entryRuleLocationQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationQuery = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:660:2: (iv_ruleLocationQuery= ruleLocationQuery EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:661:2: iv_ruleLocationQuery= ruleLocationQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocationQueryRule()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_entryRuleLocationQuery1307);
            iv_ruleLocationQuery=ruleLocationQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocationQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocationQuery1317); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:668:1: ruleLocationQuery returns [EObject current=null] : ( ( (lv_node_0_0= ruleNode ) ) (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )? ) ;
    public final EObject ruleLocationQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_node_0_0 = null;

        EObject lv_specialization_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:671:28: ( ( ( (lv_node_0_0= ruleNode ) ) (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )? ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:672:1: ( ( (lv_node_0_0= ruleNode ) ) (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )? )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:672:1: ( ( (lv_node_0_0= ruleNode ) ) (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )? )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:672:2: ( (lv_node_0_0= ruleNode ) ) (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )?
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:672:2: ( (lv_node_0_0= ruleNode ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:673:1: (lv_node_0_0= ruleNode )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:673:1: (lv_node_0_0= ruleNode )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:674:3: lv_node_0_0= ruleNode
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationQueryAccess().getNodeNodeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNode_in_ruleLocationQuery1363);
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:690:2: (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:690:4: otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) )
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleLocationQuery1376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLocationQueryAccess().getFullStopKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:694:1: ( (lv_specialization_2_0= ruleLocationQuery ) )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:695:1: (lv_specialization_2_0= ruleLocationQuery )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:695:1: (lv_specialization_2_0= ruleLocationQuery )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:696:3: lv_specialization_2_0= ruleLocationQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocationQueryAccess().getSpecializationLocationQueryParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLocationQuery_in_ruleLocationQuery1397);
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:720:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:721:2: (iv_ruleNode= ruleNode EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:722:2: iv_ruleNode= ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode1435);
            iv_ruleNode=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode1445); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:729:1: ruleNode returns [EObject current=null] : ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ContainerNode_2= ruleContainerNode ) ( (lv_parameter_3_0= ruleParamQuery ) )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_SubPathNode_0 = null;

        EObject this_WildcardNode_1 = null;

        EObject this_ContainerNode_2 = null;

        EObject lv_parameter_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:732:28: ( ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ContainerNode_2= ruleContainerNode ) ( (lv_parameter_3_0= ruleParamQuery ) )? ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:733:1: ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ContainerNode_2= ruleContainerNode ) ( (lv_parameter_3_0= ruleParamQuery ) )? )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:733:1: ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ContainerNode_2= ruleContainerNode ) ( (lv_parameter_3_0= ruleParamQuery ) )? )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:733:2: (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ContainerNode_2= ruleContainerNode ) ( (lv_parameter_3_0= ruleParamQuery ) )?
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:733:2: (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ContainerNode_2= ruleContainerNode )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 20:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                alt11=3;
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
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:734:2: this_SubPathNode_0= ruleSubPathNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getSubPathNodeParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubPathNode_in_ruleNode1496);
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
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:747:2: this_WildcardNode_1= ruleWildcardNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getWildcardNodeParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWildcardNode_in_ruleNode1526);
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
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:760:2: this_ContainerNode_2= ruleContainerNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getContainerNodeParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContainerNode_in_ruleNode1556);
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:771:2: ( (lv_parameter_3_0= ruleParamQuery ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:772:1: (lv_parameter_3_0= ruleParamQuery )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:772:1: (lv_parameter_3_0= ruleParamQuery )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:773:3: lv_parameter_3_0= ruleParamQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeAccess().getParameterParamQueryParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParamQuery_in_ruleNode1577);
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:797:1: entryRuleParamQuery returns [EObject current=null] : iv_ruleParamQuery= ruleParamQuery EOF ;
    public final EObject entryRuleParamQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamQuery = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:798:2: (iv_ruleParamQuery= ruleParamQuery EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:799:2: iv_ruleParamQuery= ruleParamQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamQueryRule()); 
            }
            pushFollow(FOLLOW_ruleParamQuery_in_entryRuleParamQuery1614);
            iv_ruleParamQuery=ruleParamQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParamQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamQuery1624); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:806:1: ruleParamQuery returns [EObject current=null] : (otherlv_0= '[' ( (lv_queries_1_0= ruleParamCompare ) )+ otherlv_2= ']' ) ;
    public final EObject ruleParamQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_queries_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:809:28: ( (otherlv_0= '[' ( (lv_queries_1_0= ruleParamCompare ) )+ otherlv_2= ']' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:810:1: (otherlv_0= '[' ( (lv_queries_1_0= ruleParamCompare ) )+ otherlv_2= ']' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:810:1: (otherlv_0= '[' ( (lv_queries_1_0= ruleParamCompare ) )+ otherlv_2= ']' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:810:3: otherlv_0= '[' ( (lv_queries_1_0= ruleParamCompare ) )+ otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleParamQuery1661); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParamQueryAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:814:1: ( (lv_queries_1_0= ruleParamCompare ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||LA13_0==20||LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:815:1: (lv_queries_1_0= ruleParamCompare )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:815:1: (lv_queries_1_0= ruleParamCompare )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:816:3: lv_queries_1_0= ruleParamCompare
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParamQueryAccess().getQueriesParamCompareParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParamCompare_in_ruleParamQuery1682);
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
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleParamQuery1695); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:844:1: entryRuleParamCompare returns [EObject current=null] : iv_ruleParamCompare= ruleParamCompare EOF ;
    public final EObject entryRuleParamCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamCompare = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:845:2: (iv_ruleParamCompare= ruleParamCompare EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:846:2: iv_ruleParamCompare= ruleParamCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamCompareRule()); 
            }
            pushFollow(FOLLOW_ruleParamCompare_in_entryRuleParamCompare1731);
            iv_ruleParamCompare=ruleParamCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParamCompare; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamCompare1741); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:853:1: ruleParamCompare returns [EObject current=null] : ( ( (lv_left_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) ) ) ) ;
    public final EObject ruleParamCompare() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:856:28: ( ( ( (lv_left_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:857:1: ( ( (lv_left_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:857:1: ( ( (lv_left_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:857:2: ( (lv_left_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:857:2: ( (lv_left_0_0= ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:858:1: (lv_left_0_0= ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:858:1: (lv_left_0_0= ruleValue )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:859:3: lv_left_0_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParamCompareAccess().getLeftValueParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleParamCompare1787);
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:875:2: ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:875:3: ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:875:3: ( (lv_operator_1_0= ruleOperator ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:876:1: (lv_operator_1_0= ruleOperator )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:876:1: (lv_operator_1_0= ruleOperator )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:877:3: lv_operator_1_0= ruleOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParamCompareAccess().getOperatorOperatorEnumRuleCall_1_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperator_in_ruleParamCompare1809);
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:893:2: ( (lv_right_2_0= ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:894:1: (lv_right_2_0= ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:894:1: (lv_right_2_0= ruleValue )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:895:3: lv_right_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParamCompareAccess().getRightValueParserRuleCall_1_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleParamCompare1830);
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:919:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:920:2: (iv_ruleValue= ruleValue EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:921:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1867);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1877); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:928:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_FloatValue_2= ruleFloatValue | this_ReferenceValue_3= ruleReferenceValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntValue_1 = null;

        EObject this_FloatValue_2 = null;

        EObject this_ReferenceValue_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:931:28: ( (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_FloatValue_2= ruleFloatValue | this_ReferenceValue_3= ruleReferenceValue ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:932:1: (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_FloatValue_2= ruleFloatValue | this_ReferenceValue_3= ruleReferenceValue )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:932:1: (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_FloatValue_2= ruleFloatValue | this_ReferenceValue_3= ruleReferenceValue )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt14=1;
                }
                break;
            case RULE_INT:
                {
                int LA14_2 = input.LA(2);

                if ( (synpred17_InternalApplicationLang()) ) {
                    alt14=2;
                }
                else if ( (synpred18_InternalApplicationLang()) ) {
                    alt14=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 20:
            case 27:
                {
                alt14=4;
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
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:933:2: this_StringValue_0= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue1927);
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
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:946:2: this_IntValue_1= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValue1957);
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
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:959:2: this_FloatValue_2= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getFloatValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleValue1987);
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
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:972:2: this_ReferenceValue_3= ruleReferenceValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getReferenceValueParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceValue_in_ruleValue2017);
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:991:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:992:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:993:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue2052);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue2062); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1000:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1003:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1004:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1004:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1005:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1005:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1006:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloatValue2103); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1030:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1031:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1032:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue2143);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue2153); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1039:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1042:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1043:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1043:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1044:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1044:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1045:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue2194); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1069:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1070:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1071:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue2234);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue2244); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1078:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1081:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1082:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1082:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1083:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1083:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1084:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue2285); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1108:1: entryRuleReferenceValue returns [EObject current=null] : iv_ruleReferenceValue= ruleReferenceValue EOF ;
    public final EObject entryRuleReferenceValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceValue = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1109:2: (iv_ruleReferenceValue= ruleReferenceValue EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1110:2: iv_ruleReferenceValue= ruleReferenceValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceValueRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceValue_in_entryRuleReferenceValue2325);
            iv_ruleReferenceValue=ruleReferenceValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceValue2335); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1117:1: ruleReferenceValue returns [EObject current=null] : ( ( (lv_query_0_0= ruleLocationQuery ) ) ( (lv_parameter_1_0= ruleParameter ) ) ) ;
    public final EObject ruleReferenceValue() throws RecognitionException {
        EObject current = null;

        EObject lv_query_0_0 = null;

        EObject lv_parameter_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1120:28: ( ( ( (lv_query_0_0= ruleLocationQuery ) ) ( (lv_parameter_1_0= ruleParameter ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1121:1: ( ( (lv_query_0_0= ruleLocationQuery ) ) ( (lv_parameter_1_0= ruleParameter ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1121:1: ( ( (lv_query_0_0= ruleLocationQuery ) ) ( (lv_parameter_1_0= ruleParameter ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1121:2: ( (lv_query_0_0= ruleLocationQuery ) ) ( (lv_parameter_1_0= ruleParameter ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1121:2: ( (lv_query_0_0= ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1122:1: (lv_query_0_0= ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1122:1: (lv_query_0_0= ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1123:3: lv_query_0_0= ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceValueAccess().getQueryLocationQueryParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_ruleReferenceValue2381);
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1139:2: ( (lv_parameter_1_0= ruleParameter ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1140:1: (lv_parameter_1_0= ruleParameter )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1140:1: (lv_parameter_1_0= ruleParameter )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1141:3: lv_parameter_1_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceValueAccess().getParameterParameterParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameter_in_ruleReferenceValue2402);
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1165:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1166:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1167:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2438);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2448); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1174:1: ruleParameter returns [EObject current=null] : (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_RuntimeProperty_0 = null;

        EObject this_ReflectionProperty_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1177:28: ( (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1178:1: (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1178:1: (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            else if ( (LA15_0==26) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1179:2: this_RuntimeProperty_0= ruleRuntimeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getRuntimePropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRuntimeProperty_in_ruleParameter2498);
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
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1192:2: this_ReflectionProperty_1= ruleReflectionProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getReflectionPropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReflectionProperty_in_ruleParameter2528);
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1211:1: entryRuleRuntimeProperty returns [EObject current=null] : iv_ruleRuntimeProperty= ruleRuntimeProperty EOF ;
    public final EObject entryRuleRuntimeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuntimeProperty = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1212:2: (iv_ruleRuntimeProperty= ruleRuntimeProperty EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1213:2: iv_ruleRuntimeProperty= ruleRuntimeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuntimePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleRuntimeProperty_in_entryRuleRuntimeProperty2563);
            iv_ruleRuntimeProperty=ruleRuntimeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuntimeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuntimeProperty2573); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1220:1: ruleRuntimeProperty returns [EObject current=null] : (otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRuntimeProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_reference_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1223:28: ( (otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1224:1: (otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1224:1: (otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1224:3: otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleRuntimeProperty2610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRuntimePropertyAccess().getNumberSignKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1228:1: ( (lv_reference_1_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1229:1: (lv_reference_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1229:1: (lv_reference_1_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1230:3: lv_reference_1_0= RULE_ID
            {
            lv_reference_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuntimeProperty2627); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1254:1: entryRuleReflectionProperty returns [EObject current=null] : iv_ruleReflectionProperty= ruleReflectionProperty EOF ;
    public final EObject entryRuleReflectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReflectionProperty = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1255:2: (iv_ruleReflectionProperty= ruleReflectionProperty EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1256:2: iv_ruleReflectionProperty= ruleReflectionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReflectionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReflectionProperty_in_entryRuleReflectionProperty2668);
            iv_ruleReflectionProperty=ruleReflectionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReflectionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReflectionProperty2678); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1263:1: ruleReflectionProperty returns [EObject current=null] : (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) ) ;
    public final EObject ruleReflectionProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_function_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1266:28: ( (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1267:1: (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1267:1: (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1267:3: otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleReflectionProperty2715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReflectionPropertyAccess().getDollarSignKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1271:1: ( (lv_function_1_0= ruleReflectionFunction ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1272:1: (lv_function_1_0= ruleReflectionFunction )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1272:1: (lv_function_1_0= ruleReflectionFunction )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1273:3: lv_function_1_0= ruleReflectionFunction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReflectionPropertyAccess().getFunctionReflectionFunctionEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReflectionFunction_in_ruleReflectionProperty2736);
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1297:1: entryRuleContainerNode returns [EObject current=null] : iv_ruleContainerNode= ruleContainerNode EOF ;
    public final EObject entryRuleContainerNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerNode = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1298:2: (iv_ruleContainerNode= ruleContainerNode EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1299:2: iv_ruleContainerNode= ruleContainerNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerNodeRule()); 
            }
            pushFollow(FOLLOW_ruleContainerNode_in_entryRuleContainerNode2772);
            iv_ruleContainerNode=ruleContainerNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerNode2782); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1306:1: ruleContainerNode returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleContainerNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1309:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1310:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1310:1: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1311:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1311:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1312:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getContainerNodeRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContainerNode2830); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1334:1: entryRuleWildcardNode returns [EObject current=null] : iv_ruleWildcardNode= ruleWildcardNode EOF ;
    public final EObject entryRuleWildcardNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcardNode = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1335:2: (iv_ruleWildcardNode= ruleWildcardNode EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1336:2: iv_ruleWildcardNode= ruleWildcardNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWildcardNodeRule()); 
            }
            pushFollow(FOLLOW_ruleWildcardNode_in_entryRuleWildcardNode2865);
            iv_ruleWildcardNode=ruleWildcardNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWildcardNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcardNode2875); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1343:1: ruleWildcardNode returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleWildcardNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1346:28: ( ( () otherlv_1= '*' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1347:1: ( () otherlv_1= '*' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1347:1: ( () otherlv_1= '*' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1347:2: () otherlv_1= '*'
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1347:2: ()
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1348:2: 
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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleWildcardNode2924); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1368:1: entryRuleSubPathNode returns [EObject current=null] : iv_ruleSubPathNode= ruleSubPathNode EOF ;
    public final EObject entryRuleSubPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPathNode = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1369:2: (iv_ruleSubPathNode= ruleSubPathNode EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1370:2: iv_ruleSubPathNode= ruleSubPathNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubPathNodeRule()); 
            }
            pushFollow(FOLLOW_ruleSubPathNode_in_entryRuleSubPathNode2960);
            iv_ruleSubPathNode=ruleSubPathNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubPathNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubPathNode2970); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1377:1: ruleSubPathNode returns [EObject current=null] : ( () otherlv_1= '**' ) ;
    public final EObject ruleSubPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1380:28: ( ( () otherlv_1= '**' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1381:1: ( () otherlv_1= '**' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1381:1: ( () otherlv_1= '**' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1381:2: () otherlv_1= '**'
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1381:2: ()
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1382:2: 
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleSubPathNode3019); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1402:1: entryRuleCollector returns [EObject current=null] : iv_ruleCollector= ruleCollector EOF ;
    public final EObject entryRuleCollector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollector = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1403:2: (iv_ruleCollector= ruleCollector EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1404:2: iv_ruleCollector= ruleCollector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectorRule()); 
            }
            pushFollow(FOLLOW_ruleCollector_in_entryRuleCollector3055);
            iv_ruleCollector=ruleCollector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollector3065); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1411:1: ruleCollector returns [EObject current=null] : ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )* )? otherlv_6= ')' ) ;
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
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1414:28: ( ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )* )? otherlv_6= ')' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1415:1: ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )* )? otherlv_6= ')' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1415:1: ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )* )? otherlv_6= ')' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1415:2: ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )* )? otherlv_6= ')'
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1415:2: ( (lv_insertionPoint_0_0= ruleInsertionPoint ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1416:1: (lv_insertionPoint_0_0= ruleInsertionPoint )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1416:1: (lv_insertionPoint_0_0= ruleInsertionPoint )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1417:3: lv_insertionPoint_0_0= ruleInsertionPoint
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectorAccess().getInsertionPointInsertionPointEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInsertionPoint_in_ruleCollector3111);
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1433:2: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1434:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1434:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1435:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCollector3138);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleCollector3150); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCollectorAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1455:1: ( ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||LA17_0==20||LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1455:2: ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )*
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1455:2: ( (lv_initializations_3_0= ruleValue ) )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1456:1: (lv_initializations_3_0= ruleValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1456:1: (lv_initializations_3_0= ruleValue )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1457:3: lv_initializations_3_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectorAccess().getInitializationsValueParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleCollector3172);
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

                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1473:2: (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1473:4: otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleCollector3185); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getCollectorAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1477:1: ( (lv_initializations_5_0= ruleValue ) )
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1478:1: (lv_initializations_5_0= ruleValue )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1478:1: (lv_initializations_5_0= ruleValue )
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1479:3: lv_initializations_5_0= ruleValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectorAccess().getInitializationsValueParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleValue_in_ruleCollector3206);
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
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleCollector3222); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1507:1: ruleReflectionFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'class' ) | (enumLiteral_3= 'return-type' ) ) ;
    public final Enumerator ruleReflectionFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1509:28: ( ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'class' ) | (enumLiteral_3= 'return-type' ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1510:1: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'class' ) | (enumLiteral_3= 'return-type' ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1510:1: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'class' ) | (enumLiteral_3= 'return-type' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt18=1;
                }
                break;
            case 29:
                {
                alt18=2;
                }
                break;
            case 30:
                {
                alt18=3;
                }
                break;
            case 31:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1510:2: (enumLiteral_0= 'name' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1510:2: (enumLiteral_0= 'name' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1510:4: enumLiteral_0= 'name'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_28_in_ruleReflectionFunction3272); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1516:6: (enumLiteral_1= 'signature' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1516:6: (enumLiteral_1= 'signature' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1516:8: enumLiteral_1= 'signature'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_ruleReflectionFunction3289); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1522:6: (enumLiteral_2= 'class' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1522:6: (enumLiteral_2= 'class' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1522:8: enumLiteral_2= 'class'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_30_in_ruleReflectionFunction3306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1528:6: (enumLiteral_3= 'return-type' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1528:6: (enumLiteral_3= 'return-type' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1528:8: enumLiteral_3= 'return-type'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_31_in_ruleReflectionFunction3323); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1538:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) ) ;
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
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1540:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1541:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1541:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) )
            int alt19=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt19=1;
                }
                break;
            case 33:
                {
                alt19=2;
                }
                break;
            case 34:
                {
                alt19=3;
                }
                break;
            case 35:
                {
                alt19=4;
                }
                break;
            case 36:
                {
                alt19=5;
                }
                break;
            case 37:
                {
                alt19=6;
                }
                break;
            case 38:
                {
                alt19=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1541:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1541:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1541:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_32_in_ruleOperator3368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1547:6: (enumLiteral_1= '~' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1547:6: (enumLiteral_1= '~' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1547:8: enumLiteral_1= '~'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_33_in_ruleOperator3385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getLIKEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1553:6: (enumLiteral_2= '!=' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1553:6: (enumLiteral_2= '!=' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1553:8: enumLiteral_2= '!='
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_34_in_ruleOperator3402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getNEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1559:6: (enumLiteral_3= '>' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1559:6: (enumLiteral_3= '>' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1559:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_35_in_ruleOperator3419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getGREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getGREnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1565:6: (enumLiteral_4= '<' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1565:6: (enumLiteral_4= '<' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1565:8: enumLiteral_4= '<'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_36_in_ruleOperator3436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getLWEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1571:6: (enumLiteral_5= '>=' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1571:6: (enumLiteral_5= '>=' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1571:8: enumLiteral_5= '>='
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_37_in_ruleOperator3453); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getGEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1577:6: (enumLiteral_6= '<=' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1577:6: (enumLiteral_6= '<=' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1577:8: enumLiteral_6= '<='
                    {
                    enumLiteral_6=(Token)match(input,38,FOLLOW_38_in_ruleOperator3470); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1587:1: ruleInsertionPoint returns [Enumerator current=null] : ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) ) ;
    public final Enumerator ruleInsertionPoint() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1589:28: ( ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1590:1: ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1590:1: ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            else if ( (LA20_0==40) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1590:2: (enumLiteral_0= 'before' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1590:2: (enumLiteral_0= 'before' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1590:4: enumLiteral_0= 'before'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleInsertionPoint3515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1596:6: (enumLiteral_1= 'after' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1596:6: (enumLiteral_1= 'after' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:1596:8: enumLiteral_1= 'after'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleInsertionPoint3532); if (state.failed) return current;
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

    // $ANTLR start synpred17_InternalApplicationLang
    public final void synpred17_InternalApplicationLang_fragment() throws RecognitionException {   
        EObject this_IntValue_1 = null;


        // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:946:2: (this_IntValue_1= ruleIntValue )
        // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:946:2: this_IntValue_1= ruleIntValue
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleIntValue_in_synpred17_InternalApplicationLang1957);
        this_IntValue_1=ruleIntValue();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalApplicationLang

    // $ANTLR start synpred18_InternalApplicationLang
    public final void synpred18_InternalApplicationLang_fragment() throws RecognitionException {   
        EObject this_FloatValue_2 = null;


        // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:959:2: (this_FloatValue_2= ruleFloatValue )
        // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalApplicationLang.g:959:2: this_FloatValue_2= ruleFloatValue
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleFloatValue_in_synpred18_InternalApplicationLang1987);
        this_FloatValue_2=ruleFloatValue();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalApplicationLang

    // Delegated rules

    public final boolean synpred18_InternalApplicationLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalApplicationLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalApplicationLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalApplicationLang_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel149 = new BitSet(new long[]{0x0000000000023002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_ruleModel170 = new BitSet(new long[]{0x0000000000023002L});
    public static final BitSet FOLLOW_ruleApplicationModel_in_ruleModel192 = new BitSet(new long[]{0x0000000000022002L});
    public static final BitSet FOLLOW_ruleAspect_in_ruleModel214 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_entryRuleRegisteredPackage251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegisteredPackage261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleRegisteredPackage298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegisteredPackage315 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRegisteredPackage344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationModel_in_entryRuleApplicationModel380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationModel390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleApplicationModel427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationModel451 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleApplicationModel464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationModel488 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleApplicationModel502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationModel519 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplicationModel541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName634 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedName662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName678 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleAspect774 = new BitSet(new long[]{0x0000000008100010L});
    public static final BitSet FOLLOW_ruleQuery_in_ruleAspect795 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAspect807 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleCollector_in_ruleAspect828 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAspect840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_ruleQuery932 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery958 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleQuery976 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery1002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20_in_ruleQuery1020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery1045 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleQuery1057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_ruleQuery1078 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_14_in_ruleQuery1091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_ruleQuery1112 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_22_in_ruleQuery1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_entryRuleParameterPattern1164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterPattern1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterPattern1223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterPattern1247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterPattern1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_entryRuleLocationQuery1307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocationQuery1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleLocationQuery1363 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleLocationQuery1376 = new BitSet(new long[]{0x0000000008100010L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_ruleLocationQuery1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode1435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubPathNode_in_ruleNode1496 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleWildcardNode_in_ruleNode1526 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleContainerNode_in_ruleNode1556 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleParamQuery_in_ruleNode1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamQuery_in_entryRuleParamQuery1614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamQuery1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleParamQuery1661 = new BitSet(new long[]{0x0000000008100070L});
    public static final BitSet FOLLOW_ruleParamCompare_in_ruleParamQuery1682 = new BitSet(new long[]{0x0000000009100070L});
    public static final BitSet FOLLOW_24_in_ruleParamQuery1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamCompare_in_entryRuleParamCompare1731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamCompare1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleParamCompare1787 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleParamCompare1809 = new BitSet(new long[]{0x0000000008100070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleParamCompare1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValue1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleValue1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValue_in_ruleValue2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue2052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloatValue2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue2143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue2234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValue_in_entryRuleReferenceValue2325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceValue2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_ruleReferenceValue2381 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleReferenceValue2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuntimeProperty_in_ruleParameter2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionProperty_in_ruleParameter2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuntimeProperty_in_entryRuleRuntimeProperty2563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuntimeProperty2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRuntimeProperty2610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuntimeProperty2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionProperty_in_entryRuleReflectionProperty2668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReflectionProperty2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleReflectionProperty2715 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleReflectionFunction_in_ruleReflectionProperty2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerNode_in_entryRuleContainerNode2772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerNode2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContainerNode2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNode_in_entryRuleWildcardNode2865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcardNode2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleWildcardNode2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubPathNode_in_entryRuleSubPathNode2960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubPathNode2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSubPathNode3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollector_in_entryRuleCollector3055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollector3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertionPoint_in_ruleCollector3111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCollector3138 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCollector3150 = new BitSet(new long[]{0x0000000008500070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCollector3172 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_14_in_ruleCollector3185 = new BitSet(new long[]{0x0000000008100070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCollector3206 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_22_in_ruleCollector3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleReflectionFunction3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleReflectionFunction3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleReflectionFunction3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleReflectionFunction3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOperator3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOperator3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOperator3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOperator3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOperator3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOperator3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOperator3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleInsertionPoint3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleInsertionPoint3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_synpred17_InternalApplicationLang1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_synpred18_InternalApplicationLang1987 = new BitSet(new long[]{0x0000000000000002L});

}
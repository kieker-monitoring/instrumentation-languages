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
import de.cau.cs.se.instrumentation.al.services.AspectLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAspectLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_FLOAT", "RULE_INT", "RULE_COMMENT_ANNOTATION", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'register'", "'use'", "','", "'on'", "'.'", "'*'", "'aspect'", "':'", "'('", "')'", "'probe'", "'{'", "'}'", "'type'", "'pointcut'", "'['", "']'", "'#'", "'$'", "'**'", "'<<'", "'@'", "'include'", "'exclude'", "'time'", "'traceId'", "'orderIndex'", "'name'", "'signature'", "'class'", "'return-type'", "'='", "'~'", "'!='", "'>'", "'<'", "'>='", "'<='", "'before'", "'after'"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int RULE_NUMBER=11;
    public static final int RULE_INT=7;
    public static final int RULE_COMMENT_ANNOTATION=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_FLOAT=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=13;

    // delegates
    // delegators


        public InternalAspectLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAspectLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAspectLangParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private AspectLangGrammarAccess grammarAccess;
     	
        public InternalAspectLangParser(TokenStream input, AspectLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected AspectLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:74:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:75:2: (iv_ruleModel= ruleModel EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:76:2: iv_ruleModel= ruleModel EOF
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:83:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_metamodels_2_0= ruleRegisteredPackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_sources_4_0= ruleApplicationModel ) )* ( ( (lv_advices_5_0= ruleAdvice ) ) | ( (lv_pointcuts_6_0= rulePointcut ) ) | ( (lv_aspects_7_0= ruleAspect ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_metamodels_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_sources_4_0 = null;

        EObject lv_advices_5_0 = null;

        EObject lv_pointcuts_6_0 = null;

        EObject lv_aspects_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:86:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_metamodels_2_0= ruleRegisteredPackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_sources_4_0= ruleApplicationModel ) )* ( ( (lv_advices_5_0= ruleAdvice ) ) | ( (lv_pointcuts_6_0= rulePointcut ) ) | ( (lv_aspects_7_0= ruleAspect ) ) )* ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:87:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_metamodels_2_0= ruleRegisteredPackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_sources_4_0= ruleApplicationModel ) )* ( ( (lv_advices_5_0= ruleAdvice ) ) | ( (lv_pointcuts_6_0= rulePointcut ) ) | ( (lv_aspects_7_0= ruleAspect ) ) )* )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:87:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_metamodels_2_0= ruleRegisteredPackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_sources_4_0= ruleApplicationModel ) )* ( ( (lv_advices_5_0= ruleAdvice ) ) | ( (lv_pointcuts_6_0= rulePointcut ) ) | ( (lv_aspects_7_0= ruleAspect ) ) )* )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:87:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_metamodels_2_0= ruleRegisteredPackage ) )* ( (lv_imports_3_0= ruleImport ) )* ( (lv_sources_4_0= ruleApplicationModel ) )* ( ( (lv_advices_5_0= ruleAdvice ) ) | ( (lv_pointcuts_6_0= rulePointcut ) ) | ( (lv_aspects_7_0= ruleAspect ) ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleModel128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:91:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:92:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:92:1: (lv_name_1_0= ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:93:3: lv_name_1_0= ruleQualifiedName
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:109:2: ( (lv_metamodels_2_0= ruleRegisteredPackage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:110:1: (lv_metamodels_2_0= ruleRegisteredPackage )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:110:1: (lv_metamodels_2_0= ruleRegisteredPackage )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:111:3: lv_metamodels_2_0= ruleRegisteredPackage
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:127:3: ( (lv_imports_3_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:128:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:128:1: (lv_imports_3_0= ruleImport )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:129:3: lv_imports_3_0= ruleImport
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:145:3: ( (lv_sources_4_0= ruleApplicationModel ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:146:1: (lv_sources_4_0= ruleApplicationModel )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:146:1: (lv_sources_4_0= ruleApplicationModel )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:147:3: lv_sources_4_0= ruleApplicationModel
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:163:3: ( ( (lv_advices_5_0= ruleAdvice ) ) | ( (lv_pointcuts_6_0= rulePointcut ) ) | ( (lv_aspects_7_0= ruleAspect ) ) )*
            loop4:
            do {
                int alt4=4;
                switch ( input.LA(1) ) {
                case 27:
                    {
                    alt4=1;
                    }
                    break;
                case RULE_COMMENT_ANNOTATION:
                case 31:
                case 38:
                    {
                    alt4=2;
                    }
                    break;
                case 23:
                    {
                    alt4=3;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:163:4: ( (lv_advices_5_0= ruleAdvice ) )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:163:4: ( (lv_advices_5_0= ruleAdvice ) )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:164:1: (lv_advices_5_0= ruleAdvice )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:164:1: (lv_advices_5_0= ruleAdvice )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:165:3: lv_advices_5_0= ruleAdvice
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getAdvicesAdviceParserRuleCall_5_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdvice_in_ruleModel237);
            	    lv_advices_5_0=ruleAdvice();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"advices",
            	              		lv_advices_5_0, 
            	              		"Advice");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:182:6: ( (lv_pointcuts_6_0= rulePointcut ) )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:182:6: ( (lv_pointcuts_6_0= rulePointcut ) )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:183:1: (lv_pointcuts_6_0= rulePointcut )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:183:1: (lv_pointcuts_6_0= rulePointcut )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:184:3: lv_pointcuts_6_0= rulePointcut
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getPointcutsPointcutParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePointcut_in_ruleModel264);
            	    lv_pointcuts_6_0=rulePointcut();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"pointcuts",
            	              		lv_pointcuts_6_0, 
            	              		"Pointcut");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:201:6: ( (lv_aspects_7_0= ruleAspect ) )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:201:6: ( (lv_aspects_7_0= ruleAspect ) )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:202:1: (lv_aspects_7_0= ruleAspect )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:202:1: (lv_aspects_7_0= ruleAspect )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:203:3: lv_aspects_7_0= ruleAspect
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getAspectsAspectParserRuleCall_5_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAspect_in_ruleModel291);
            	    lv_aspects_7_0=ruleAspect();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"aspects",
            	              		lv_aspects_7_0, 
            	              		"Aspect");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:227:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:228:2: (iv_ruleImport= ruleImport EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:229:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport329);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport339); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:236:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:239:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:240:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:240:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:240:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleImport376); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:244:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:245:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:245:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:246:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport397);
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:270:1: entryRuleRegisteredPackage returns [EObject current=null] : iv_ruleRegisteredPackage= ruleRegisteredPackage EOF ;
    public final EObject entryRuleRegisteredPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisteredPackage = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:271:2: (iv_ruleRegisteredPackage= ruleRegisteredPackage EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:272:2: iv_ruleRegisteredPackage= ruleRegisteredPackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegisteredPackageRule()); 
            }
            pushFollow(FOLLOW_ruleRegisteredPackage_in_entryRuleRegisteredPackage433);
            iv_ruleRegisteredPackage=ruleRegisteredPackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegisteredPackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegisteredPackage443); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:279:1: ruleRegisteredPackage returns [EObject current=null] : (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) ) ;
    public final EObject ruleRegisteredPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:282:28: ( (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:283:1: (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:283:1: (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:283:3: otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleRegisteredPackage480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRegisteredPackageAccess().getRegisterKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:287:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:288:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:288:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:289:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegisteredPackage497); if (state.failed) return current;
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:305:2: ( (otherlv_2= RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:306:1: (otherlv_2= RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:306:1: (otherlv_2= RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:307:3: otherlv_2= RULE_STRING
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRegisteredPackageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRegisteredPackage526); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:329:1: entryRuleApplicationModel returns [EObject current=null] : iv_ruleApplicationModel= ruleApplicationModel EOF ;
    public final EObject entryRuleApplicationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationModel = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:330:2: (iv_ruleApplicationModel= ruleApplicationModel EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:331:2: iv_ruleApplicationModel= ruleApplicationModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationModelRule()); 
            }
            pushFollow(FOLLOW_ruleApplicationModel_in_entryRuleApplicationModel562);
            iv_ruleApplicationModel=ruleApplicationModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplicationModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationModel572); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:338:1: ruleApplicationModel returns [EObject current=null] : (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'on' ( (lv_name_5_0= RULE_ID ) ) ( (lv_model_6_0= RULE_STRING ) ) ) ;
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
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:341:28: ( (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'on' ( (lv_name_5_0= RULE_ID ) ) ( (lv_model_6_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:342:1: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'on' ( (lv_name_5_0= RULE_ID ) ) ( (lv_model_6_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:342:1: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'on' ( (lv_name_5_0= RULE_ID ) ) ( (lv_model_6_0= RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:342:3: otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'on' ( (lv_name_5_0= RULE_ID ) ) ( (lv_model_6_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleApplicationModel609); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getApplicationModelAccess().getUseKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:346:1: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:347:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:347:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:348:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getApplicationModelRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationModel633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:362:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:362:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleApplicationModel646); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getApplicationModelAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:366:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:367:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:367:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:368:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getApplicationModelRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationModel670); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleApplicationModel684); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getApplicationModelAccess().getOnKeyword_3());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:386:1: ( (lv_name_5_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:387:1: (lv_name_5_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:387:1: (lv_name_5_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:388:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationModel701); if (state.failed) return current;
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:404:2: ( (lv_model_6_0= RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:405:1: (lv_model_6_0= RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:405:1: (lv_model_6_0= RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:406:3: lv_model_6_0= RULE_STRING
            {
            lv_model_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplicationModel723); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:430:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:431:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:432:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName765);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName776); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:439:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:442:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:443:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:443:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:443:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName816); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:450:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==RULE_ID) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:450:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:450:2: ( ( '.' )=>kw= '.' )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:450:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_ruleQualifiedName844); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName860); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:473:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:474:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:475:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard908);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard919); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:482:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:485:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:486:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:486:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:487:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard966);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:497:1: (kw= '.' kw= '*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:498:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleQualifiedNameWithWildcard985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleQualifiedNameWithWildcard998); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:517:1: entryRuleAspect returns [EObject current=null] : iv_ruleAspect= ruleAspect EOF ;
    public final EObject entryRuleAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspect = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:518:2: (iv_ruleAspect= ruleAspect EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:519:2: iv_ruleAspect= ruleAspect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAspectRule()); 
            }
            pushFollow(FOLLOW_ruleAspect_in_entryRuleAspect1040);
            iv_ruleAspect=ruleAspect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAspect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspect1050); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:526:1: ruleAspect returns [EObject current=null] : (otherlv_0= 'aspect' ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (lv_applyProbes_3_0= ruleUtilizeProbe ) ) (otherlv_4= ',' ( (lv_applyProbes_5_0= ruleUtilizeProbe ) ) )* ) ;
    public final EObject ruleAspect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_applyProbes_3_0 = null;

        EObject lv_applyProbes_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:529:28: ( (otherlv_0= 'aspect' ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (lv_applyProbes_3_0= ruleUtilizeProbe ) ) (otherlv_4= ',' ( (lv_applyProbes_5_0= ruleUtilizeProbe ) ) )* ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:530:1: (otherlv_0= 'aspect' ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (lv_applyProbes_3_0= ruleUtilizeProbe ) ) (otherlv_4= ',' ( (lv_applyProbes_5_0= ruleUtilizeProbe ) ) )* )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:530:1: (otherlv_0= 'aspect' ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (lv_applyProbes_3_0= ruleUtilizeProbe ) ) (otherlv_4= ',' ( (lv_applyProbes_5_0= ruleUtilizeProbe ) ) )* )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:530:3: otherlv_0= 'aspect' ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (lv_applyProbes_3_0= ruleUtilizeProbe ) ) (otherlv_4= ',' ( (lv_applyProbes_5_0= ruleUtilizeProbe ) ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleAspect1087); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAspectAccess().getAspectKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:534:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:535:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:535:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:536:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAspectRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAspectAccess().getQueryPointcutCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAspect1114);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleAspect1126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAspectAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:556:1: ( (lv_applyProbes_3_0= ruleUtilizeProbe ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:557:1: (lv_applyProbes_3_0= ruleUtilizeProbe )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:557:1: (lv_applyProbes_3_0= ruleUtilizeProbe )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:558:3: lv_applyProbes_3_0= ruleUtilizeProbe
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAspectAccess().getApplyProbesUtilizeProbeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUtilizeProbe_in_ruleAspect1147);
            lv_applyProbes_3_0=ruleUtilizeProbe();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAspectRule());
              	        }
                     		add(
                     			current, 
                     			"applyProbes",
                      		lv_applyProbes_3_0, 
                      		"UtilizeProbe");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:574:2: (otherlv_4= ',' ( (lv_applyProbes_5_0= ruleUtilizeProbe ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:574:4: otherlv_4= ',' ( (lv_applyProbes_5_0= ruleUtilizeProbe ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleAspect1160); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getAspectAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:578:1: ( (lv_applyProbes_5_0= ruleUtilizeProbe ) )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:579:1: (lv_applyProbes_5_0= ruleUtilizeProbe )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:579:1: (lv_applyProbes_5_0= ruleUtilizeProbe )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:580:3: lv_applyProbes_5_0= ruleUtilizeProbe
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAspectAccess().getApplyProbesUtilizeProbeParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUtilizeProbe_in_ruleAspect1181);
            	    lv_applyProbes_5_0=ruleUtilizeProbe();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAspectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"applyProbes",
            	              		lv_applyProbes_5_0, 
            	              		"UtilizeProbe");
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


    // $ANTLR start "entryRuleUtilizeProbe"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:604:1: entryRuleUtilizeProbe returns [EObject current=null] : iv_ruleUtilizeProbe= ruleUtilizeProbe EOF ;
    public final EObject entryRuleUtilizeProbe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUtilizeProbe = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:605:2: (iv_ruleUtilizeProbe= ruleUtilizeProbe EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:606:2: iv_ruleUtilizeProbe= ruleUtilizeProbe EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUtilizeProbeRule()); 
            }
            pushFollow(FOLLOW_ruleUtilizeProbe_in_entryRuleUtilizeProbe1219);
            iv_ruleUtilizeProbe=ruleUtilizeProbe();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUtilizeProbe; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUtilizeProbe1229); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUtilizeProbe"


    // $ANTLR start "ruleUtilizeProbe"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:613:1: ruleUtilizeProbe returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')' )? ) ;
    public final EObject ruleUtilizeProbe() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameterAssignments_2_0 = null;

        EObject lv_parameterAssignments_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:616:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')' )? ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:617:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')' )? )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:617:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')' )? )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:617:2: ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')' )?
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:617:2: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:618:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:618:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:619:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUtilizeProbeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUtilizeProbeAccess().getProbeAdviceCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleUtilizeProbe1281);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:635:2: (otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:635:4: otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleUtilizeProbe1294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getUtilizeProbeAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:639:1: ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||LA10_0==22||(LA10_0>=34 && LA10_0<=37)||(LA10_0>=41 && LA10_0<=43)) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:639:2: ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )*
                            {
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:639:2: ( (lv_parameterAssignments_2_0= ruleValue ) )
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:640:1: (lv_parameterAssignments_2_0= ruleValue )
                            {
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:640:1: (lv_parameterAssignments_2_0= ruleValue )
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:641:3: lv_parameterAssignments_2_0= ruleValue
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getUtilizeProbeAccess().getParameterAssignmentsValueParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValue_in_ruleUtilizeProbe1316);
                            lv_parameterAssignments_2_0=ruleValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getUtilizeProbeRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameterAssignments",
                                      		lv_parameterAssignments_2_0, 
                                      		"Value");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:657:2: (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==19) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:657:4: otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) )
                            	    {
                            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleUtilizeProbe1329); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getUtilizeProbeAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:661:1: ( (lv_parameterAssignments_4_0= ruleValue ) )
                            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:662:1: (lv_parameterAssignments_4_0= ruleValue )
                            	    {
                            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:662:1: (lv_parameterAssignments_4_0= ruleValue )
                            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:663:3: lv_parameterAssignments_4_0= ruleValue
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getUtilizeProbeAccess().getParameterAssignmentsValueParserRuleCall_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleValue_in_ruleUtilizeProbe1350);
                            	    lv_parameterAssignments_4_0=ruleValue();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getUtilizeProbeRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameterAssignments",
                            	              		lv_parameterAssignments_4_0, 
                            	              		"Value");
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


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleUtilizeProbe1366); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getUtilizeProbeAccess().getRightParenthesisKeyword_1_2());
                          
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
    // $ANTLR end "ruleUtilizeProbe"


    // $ANTLR start "entryRuleAdvice"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:691:1: entryRuleAdvice returns [EObject current=null] : iv_ruleAdvice= ruleAdvice EOF ;
    public final EObject entryRuleAdvice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdvice = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:692:2: (iv_ruleAdvice= ruleAdvice EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:693:2: iv_ruleAdvice= ruleAdvice EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdviceRule()); 
            }
            pushFollow(FOLLOW_ruleAdvice_in_entryRuleAdvice1404);
            iv_ruleAdvice=ruleAdvice();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdvice; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdvice1414); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdvice"


    // $ANTLR start "ruleAdvice"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:700:1: ruleAdvice returns [EObject current=null] : (otherlv_0= 'probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_collectors_8_0= ruleCollector ) )* otherlv_9= '}' ) ;
    public final EObject ruleAdvice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameterDeclarations_3_0 = null;

        EObject lv_parameterDeclarations_5_0 = null;

        EObject lv_collectors_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:703:28: ( (otherlv_0= 'probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_collectors_8_0= ruleCollector ) )* otherlv_9= '}' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:704:1: (otherlv_0= 'probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_collectors_8_0= ruleCollector ) )* otherlv_9= '}' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:704:1: (otherlv_0= 'probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_collectors_8_0= ruleCollector ) )* otherlv_9= '}' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:704:3: otherlv_0= 'probe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_collectors_8_0= ruleCollector ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleAdvice1451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAdviceAccess().getProbeKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:708:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:709:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:709:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:710:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAdvice1468); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getAdviceAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAdviceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:726:2: (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:726:4: otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleAdvice1486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAdviceAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:730:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==30) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:730:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            {
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:730:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:731:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            {
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:731:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:732:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAdviceAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleAdvice1508);
                            lv_parameterDeclarations_3_0=ruleParameterDeclaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAdviceRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameterDeclarations",
                                      		lv_parameterDeclarations_3_0, 
                                      		"ParameterDeclaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:748:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==19) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:748:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    {
                            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleAdvice1521); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getAdviceAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:752:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:753:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    {
                            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:753:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:754:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getAdviceAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleAdvice1542);
                            	    lv_parameterDeclarations_5_0=ruleParameterDeclaration();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getAdviceRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameterDeclarations",
                            	              		lv_parameterDeclarations_5_0, 
                            	              		"ParameterDeclaration");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop12;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleAdvice1558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAdviceAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleAdvice1572); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getAdviceAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:778:1: ( (lv_collectors_8_0= ruleCollector ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=55 && LA15_0<=56)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:779:1: (lv_collectors_8_0= ruleCollector )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:779:1: (lv_collectors_8_0= ruleCollector )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:780:3: lv_collectors_8_0= ruleCollector
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdviceAccess().getCollectorsCollectorParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCollector_in_ruleAdvice1593);
            	    lv_collectors_8_0=ruleCollector();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdviceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"collectors",
            	              		lv_collectors_8_0, 
            	              		"Collector");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleAdvice1606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getAdviceAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleAdvice"


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:808:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:809:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:810:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1642);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration1652); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:817:1: ruleParameterDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= 'type' ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:820:28: ( ( ( (lv_type_0_0= 'type' ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:821:1: ( ( (lv_type_0_0= 'type' ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:821:1: ( ( (lv_type_0_0= 'type' ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:821:2: ( (lv_type_0_0= 'type' ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:821:2: ( (lv_type_0_0= 'type' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:822:1: (lv_type_0_0= 'type' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:822:1: (lv_type_0_0= 'type' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:823:3: lv_type_0_0= 'type'
            {
            lv_type_0_0=(Token)match(input,30,FOLLOW_30_in_ruleParameterDeclaration1695); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_type_0_0, grammarAccess.getParameterDeclarationAccess().getTypeTypeKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
              	        }
                     		setWithLastConsumed(current, "type", lv_type_0_0, "type");
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:836:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:837:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:837:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:838:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterDeclaration1725); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
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
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "entryRulePointcut"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:862:1: entryRulePointcut returns [EObject current=null] : iv_rulePointcut= rulePointcut EOF ;
    public final EObject entryRulePointcut() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointcut = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:863:2: (iv_rulePointcut= rulePointcut EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:864:2: iv_rulePointcut= rulePointcut EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointcutRule()); 
            }
            pushFollow(FOLLOW_rulePointcut_in_entryRulePointcut1766);
            iv_rulePointcut=rulePointcut();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePointcut; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePointcut1776); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePointcut"


    // $ANTLR start "rulePointcut"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:871:1: rulePointcut returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) ( (lv_location_3_0= ruleLocationQuery ) ) ( (lv_method_4_0= ruleMethodQuery ) )? ) ;
    public final EObject rulePointcut() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_location_3_0 = null;

        EObject lv_method_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:874:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) ( (lv_location_3_0= ruleLocationQuery ) ) ( (lv_method_4_0= ruleMethodQuery ) )? ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:875:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) ( (lv_location_3_0= ruleLocationQuery ) ) ( (lv_method_4_0= ruleMethodQuery ) )? )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:875:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) ( (lv_location_3_0= ruleLocationQuery ) ) ( (lv_method_4_0= ruleMethodQuery ) )? )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:875:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) ( (lv_location_3_0= ruleLocationQuery ) ) ( (lv_method_4_0= ruleMethodQuery ) )?
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:875:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_COMMENT_ANNOTATION||LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:876:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:876:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:877:3: lv_annotation_0_0= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPointcutAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_rulePointcut1822);
                    lv_annotation_0_0=ruleAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPointcutRule());
                      	        }
                             		set(
                             			current, 
                             			"annotation",
                              		lv_annotation_0_0, 
                              		"Annotation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_rulePointcut1835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPointcutAccess().getPointcutKeyword_1());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:897:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:898:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:898:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:899:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePointcut1852); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getPointcutAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPointcutRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:915:2: ( (lv_location_3_0= ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:916:1: (lv_location_3_0= ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:916:1: (lv_location_3_0= ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:917:3: lv_location_3_0= ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPointcutAccess().getLocationLocationQueryParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_rulePointcut1878);
            lv_location_3_0=ruleLocationQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPointcutRule());
              	        }
                     		set(
                     			current, 
                     			"location",
                      		lv_location_3_0, 
                      		"LocationQuery");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:933:2: ( (lv_method_4_0= ruleMethodQuery ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:934:1: (lv_method_4_0= ruleMethodQuery )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:934:1: (lv_method_4_0= ruleMethodQuery )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:935:3: lv_method_4_0= ruleMethodQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPointcutAccess().getMethodMethodQueryParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMethodQuery_in_rulePointcut1899);
                    lv_method_4_0=ruleMethodQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPointcutRule());
                      	        }
                             		set(
                             			current, 
                             			"method",
                              		lv_method_4_0, 
                              		"MethodQuery");
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
    // $ANTLR end "rulePointcut"


    // $ANTLR start "entryRuleMethodQuery"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:959:1: entryRuleMethodQuery returns [EObject current=null] : iv_ruleMethodQuery= ruleMethodQuery EOF ;
    public final EObject entryRuleMethodQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodQuery = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:960:2: (iv_ruleMethodQuery= ruleMethodQuery EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:961:2: iv_ruleMethodQuery= ruleMethodQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodQueryRule()); 
            }
            pushFollow(FOLLOW_ruleMethodQuery_in_entryRuleMethodQuery1936);
            iv_ruleMethodQuery=ruleMethodQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodQuery1946); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodQuery"


    // $ANTLR start "ruleMethodQuery"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:968:1: ruleMethodQuery returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) | otherlv_1= '*' ) ( ( (otherlv_2= RULE_ID ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( (lv_parameterQueries_6_0= ruleParameterQuery ) ) (otherlv_7= ',' ( (lv_parameterQueries_8_0= ruleParameterQuery ) ) )* otherlv_9= ')' ) ;
    public final EObject ruleMethodQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameterQueries_6_0 = null;

        EObject lv_parameterQueries_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:971:28: ( ( ( ( (otherlv_0= RULE_ID ) ) | otherlv_1= '*' ) ( ( (otherlv_2= RULE_ID ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( (lv_parameterQueries_6_0= ruleParameterQuery ) ) (otherlv_7= ',' ( (lv_parameterQueries_8_0= ruleParameterQuery ) ) )* otherlv_9= ')' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:972:1: ( ( ( (otherlv_0= RULE_ID ) ) | otherlv_1= '*' ) ( ( (otherlv_2= RULE_ID ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( (lv_parameterQueries_6_0= ruleParameterQuery ) ) (otherlv_7= ',' ( (lv_parameterQueries_8_0= ruleParameterQuery ) ) )* otherlv_9= ')' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:972:1: ( ( ( (otherlv_0= RULE_ID ) ) | otherlv_1= '*' ) ( ( (otherlv_2= RULE_ID ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( (lv_parameterQueries_6_0= ruleParameterQuery ) ) (otherlv_7= ',' ( (lv_parameterQueries_8_0= ruleParameterQuery ) ) )* otherlv_9= ')' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:972:2: ( ( (otherlv_0= RULE_ID ) ) | otherlv_1= '*' ) ( ( (otherlv_2= RULE_ID ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( (lv_parameterQueries_6_0= ruleParameterQuery ) ) (otherlv_7= ',' ( (lv_parameterQueries_8_0= ruleParameterQuery ) ) )* otherlv_9= ')'
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:972:2: ( ( (otherlv_0= RULE_ID ) ) | otherlv_1= '*' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==22) ) {
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
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:972:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:972:3: ( (otherlv_0= RULE_ID ) )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:973:1: (otherlv_0= RULE_ID )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:973:1: (otherlv_0= RULE_ID )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:974:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMethodQueryRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodQuery1996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getMethodQueryAccess().getModifierMethodModifierCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:989:7: otherlv_1= '*'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleMethodQuery2014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMethodQueryAccess().getAsteriskKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:993:2: ( ( (otherlv_2= RULE_ID ) ) | otherlv_3= '*' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==22) ) {
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
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:993:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:993:3: ( (otherlv_2= RULE_ID ) )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:994:1: (otherlv_2= RULE_ID )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:994:1: (otherlv_2= RULE_ID )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:995:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMethodQueryRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodQuery2040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getMethodQueryAccess().getReturnTypeTypeCrossReference_1_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1010:7: otherlv_3= '*'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleMethodQuery2058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMethodQueryAccess().getAsteriskKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1014:2: ( (otherlv_4= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1015:1: (otherlv_4= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1015:1: (otherlv_4= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1016:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMethodQueryRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodQuery2083); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getMethodQueryAccess().getMethodReferenceMethodCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleMethodQuery2095); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMethodQueryAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1034:1: ( (lv_parameterQueries_6_0= ruleParameterQuery ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1035:1: (lv_parameterQueries_6_0= ruleParameterQuery )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1035:1: (lv_parameterQueries_6_0= ruleParameterQuery )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1036:3: lv_parameterQueries_6_0= ruleParameterQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodQueryAccess().getParameterQueriesParameterQueryParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameterQuery_in_ruleMethodQuery2116);
            lv_parameterQueries_6_0=ruleParameterQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodQueryRule());
              	        }
                     		add(
                     			current, 
                     			"parameterQueries",
                      		lv_parameterQueries_6_0, 
                      		"ParameterQuery");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1052:2: (otherlv_7= ',' ( (lv_parameterQueries_8_0= ruleParameterQuery ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1052:4: otherlv_7= ',' ( (lv_parameterQueries_8_0= ruleParameterQuery ) )
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleMethodQuery2129); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMethodQueryAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1056:1: ( (lv_parameterQueries_8_0= ruleParameterQuery ) )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1057:1: (lv_parameterQueries_8_0= ruleParameterQuery )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1057:1: (lv_parameterQueries_8_0= ruleParameterQuery )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1058:3: lv_parameterQueries_8_0= ruleParameterQuery
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethodQueryAccess().getParameterQueriesParameterQueryParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameterQuery_in_ruleMethodQuery2150);
            	    lv_parameterQueries_8_0=ruleParameterQuery();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMethodQueryRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameterQueries",
            	              		lv_parameterQueries_8_0, 
            	              		"ParameterQuery");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleMethodQuery2164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getMethodQueryAccess().getRightParenthesisKeyword_6());
                  
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
    // $ANTLR end "ruleMethodQuery"


    // $ANTLR start "entryRuleParameterQuery"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1086:1: entryRuleParameterQuery returns [EObject current=null] : iv_ruleParameterQuery= ruleParameterQuery EOF ;
    public final EObject entryRuleParameterQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterQuery = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1087:2: (iv_ruleParameterQuery= ruleParameterQuery EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1088:2: iv_ruleParameterQuery= ruleParameterQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterQueryRule()); 
            }
            pushFollow(FOLLOW_ruleParameterQuery_in_entryRuleParameterQuery2200);
            iv_ruleParameterQuery=ruleParameterQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterQuery2210); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterQuery"


    // $ANTLR start "ruleParameterQuery"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1095:1: ruleParameterQuery returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) | otherlv_1= '*' ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleParameterQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1098:28: ( ( ( ( (otherlv_0= RULE_ID ) ) | otherlv_1= '*' ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1099:1: ( ( ( (otherlv_0= RULE_ID ) ) | otherlv_1= '*' ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1099:1: ( ( ( (otherlv_0= RULE_ID ) ) | otherlv_1= '*' ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1099:2: ( ( (otherlv_0= RULE_ID ) ) | otherlv_1= '*' ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1099:2: ( ( (otherlv_0= RULE_ID ) ) | otherlv_1= '*' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==22) ) {
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
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1099:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1099:3: ( (otherlv_0= RULE_ID ) )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1100:1: (otherlv_0= RULE_ID )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1100:1: (otherlv_0= RULE_ID )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1101:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterQueryRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterQuery2260); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getParameterQueryAccess().getModifierParameterModifierCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1116:7: otherlv_1= '*'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleParameterQuery2278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getParameterQueryAccess().getAsteriskKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1120:2: ( (otherlv_2= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1121:1: (otherlv_2= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1121:1: (otherlv_2= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1122:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterQueryRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterQuery2303); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getParameterQueryAccess().getTypeTypeCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1136:2: ( (otherlv_3= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1137:1: (otherlv_3= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1137:1: (otherlv_3= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1138:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterQueryRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterQuery2327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getParameterQueryAccess().getParameterParameterCrossReference_2_0()); 
              	
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
    // $ANTLR end "ruleParameterQuery"


    // $ANTLR start "entryRuleLocationQuery"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1160:1: entryRuleLocationQuery returns [EObject current=null] : iv_ruleLocationQuery= ruleLocationQuery EOF ;
    public final EObject entryRuleLocationQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationQuery = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1161:2: (iv_ruleLocationQuery= ruleLocationQuery EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1162:2: iv_ruleLocationQuery= ruleLocationQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocationQueryRule()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_entryRuleLocationQuery2363);
            iv_ruleLocationQuery=ruleLocationQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocationQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocationQuery2373); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1169:1: ruleLocationQuery returns [EObject current=null] : ( ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )? ) ;
    public final EObject ruleLocationQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_node_0_0 = null;

        EObject lv_specialization_2_0 = null;

        EObject lv_composition_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1172:28: ( ( ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )? ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1173:1: ( ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )? )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1173:1: ( ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )? )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1173:2: ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )?
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1173:2: ( (lv_node_0_0= ruleNode ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1174:1: (lv_node_0_0= ruleNode )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1174:1: (lv_node_0_0= ruleNode )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1175:3: lv_node_0_0= ruleNode
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationQueryAccess().getNodeNodeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNode_in_ruleLocationQuery2419);
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1191:2: ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            else if ( (LA22_0==28||(LA22_0>=39 && LA22_0<=40)) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1191:3: (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1191:3: (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1191:5: otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleLocationQuery2433); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLocationQueryAccess().getFullStopKeyword_1_0_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1195:1: ( (lv_specialization_2_0= ruleLocationQuery ) )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1196:1: (lv_specialization_2_0= ruleLocationQuery )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1196:1: (lv_specialization_2_0= ruleLocationQuery )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1197:3: lv_specialization_2_0= ruleLocationQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocationQueryAccess().getSpecializationLocationQueryParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLocationQuery_in_ruleLocationQuery2454);
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


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1214:6: ( (lv_composition_3_0= ruleCompositionQuery ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1214:6: ( (lv_composition_3_0= ruleCompositionQuery ) )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1215:1: (lv_composition_3_0= ruleCompositionQuery )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1215:1: (lv_composition_3_0= ruleCompositionQuery )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1216:3: lv_composition_3_0= ruleCompositionQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocationQueryAccess().getCompositionCompositionQueryParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositionQuery_in_ruleLocationQuery2482);
                    lv_composition_3_0=ruleCompositionQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocationQueryRule());
                      	        }
                             		set(
                             			current, 
                             			"composition",
                              		lv_composition_3_0, 
                              		"CompositionQuery");
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


    // $ANTLR start "entryRuleCompositionQuery"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1240:1: entryRuleCompositionQuery returns [EObject current=null] : iv_ruleCompositionQuery= ruleCompositionQuery EOF ;
    public final EObject entryRuleCompositionQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionQuery = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1241:2: (iv_ruleCompositionQuery= ruleCompositionQuery EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1242:2: iv_ruleCompositionQuery= ruleCompositionQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositionQueryRule()); 
            }
            pushFollow(FOLLOW_ruleCompositionQuery_in_entryRuleCompositionQuery2520);
            iv_ruleCompositionQuery=ruleCompositionQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositionQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositionQuery2530); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositionQuery"


    // $ANTLR start "ruleCompositionQuery"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1249:1: ruleCompositionQuery returns [EObject current=null] : ( () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}' ) ;
    public final EObject ruleCompositionQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_modifier_1_0 = null;

        EObject lv_subQueries_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1252:28: ( ( () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1253:1: ( () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1253:1: ( () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1253:2: () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}'
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1253:2: ()
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1254:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCompositionQueryAccess().getCompositionQueryAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1262:2: ( (lv_modifier_1_0= ruleQueryModifier ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=39 && LA23_0<=40)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1263:1: (lv_modifier_1_0= ruleQueryModifier )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1263:1: (lv_modifier_1_0= ruleQueryModifier )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1264:3: lv_modifier_1_0= ruleQueryModifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositionQueryAccess().getModifierQueryModifierEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQueryModifier_in_ruleCompositionQuery2588);
                    lv_modifier_1_0=ruleQueryModifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositionQueryRule());
                      	        }
                             		set(
                             			current, 
                             			"modifier",
                              		lv_modifier_1_0, 
                              		"QueryModifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleCompositionQuery2601); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompositionQueryAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1284:1: ( (lv_subQueries_3_0= ruleLocationQuery ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||LA24_0==22||(LA24_0>=36 && LA24_0<=37)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1285:1: (lv_subQueries_3_0= ruleLocationQuery )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1285:1: (lv_subQueries_3_0= ruleLocationQuery )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1286:3: lv_subQueries_3_0= ruleLocationQuery
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompositionQueryAccess().getSubQueriesLocationQueryParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLocationQuery_in_ruleCompositionQuery2622);
            	    lv_subQueries_3_0=ruleLocationQuery();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompositionQueryRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"subQueries",
            	              		lv_subQueries_3_0, 
            	              		"LocationQuery");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleCompositionQuery2635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCompositionQueryAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleCompositionQuery"


    // $ANTLR start "entryRuleNode"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1314:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1315:2: (iv_ruleNode= ruleNode EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1316:2: iv_ruleNode= ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode2671);
            iv_ruleNode=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode2681); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1323:1: ruleNode returns [EObject current=null] : ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) ( (lv_parameter_4_0= ruleParamQuery ) )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_SubPathNode_0 = null;

        EObject this_WildcardNode_1 = null;

        EObject this_ParentNode_2 = null;

        EObject this_ContainerNode_3 = null;

        EObject lv_parameter_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1326:28: ( ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) ( (lv_parameter_4_0= ruleParamQuery ) )? ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1327:1: ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) ( (lv_parameter_4_0= ruleParamQuery ) )? )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1327:1: ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) ( (lv_parameter_4_0= ruleParamQuery ) )? )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1327:2: (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) ( (lv_parameter_4_0= ruleParamQuery ) )?
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1327:2: (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt25=1;
                }
                break;
            case 22:
                {
                alt25=2;
                }
                break;
            case 37:
                {
                alt25=3;
                }
                break;
            case RULE_ID:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1328:2: this_SubPathNode_0= ruleSubPathNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getSubPathNodeParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubPathNode_in_ruleNode2732);
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
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1341:2: this_WildcardNode_1= ruleWildcardNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getWildcardNodeParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWildcardNode_in_ruleNode2762);
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
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1354:2: this_ParentNode_2= ruleParentNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getParentNodeParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParentNode_in_ruleNode2792);
                    this_ParentNode_2=ruleParentNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParentNode_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1367:2: this_ContainerNode_3= ruleContainerNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getContainerNodeParserRuleCall_0_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContainerNode_in_ruleNode2822);
                    this_ContainerNode_3=ruleContainerNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ContainerNode_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1378:2: ( (lv_parameter_4_0= ruleParamQuery ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1379:1: (lv_parameter_4_0= ruleParamQuery )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1379:1: (lv_parameter_4_0= ruleParamQuery )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1380:3: lv_parameter_4_0= ruleParamQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeAccess().getParameterParamQueryParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParamQuery_in_ruleNode2843);
                    lv_parameter_4_0=ruleParamQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeRule());
                      	        }
                             		set(
                             			current, 
                             			"parameter",
                              		lv_parameter_4_0, 
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1404:1: entryRuleParamQuery returns [EObject current=null] : iv_ruleParamQuery= ruleParamQuery EOF ;
    public final EObject entryRuleParamQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamQuery = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1405:2: (iv_ruleParamQuery= ruleParamQuery EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1406:2: iv_ruleParamQuery= ruleParamQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamQueryRule()); 
            }
            pushFollow(FOLLOW_ruleParamQuery_in_entryRuleParamQuery2880);
            iv_ruleParamQuery=ruleParamQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParamQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamQuery2890); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1413:1: ruleParamQuery returns [EObject current=null] : (otherlv_0= '[' ( (lv_queries_1_0= ruleParamCompare ) )+ otherlv_2= ']' ) ;
    public final EObject ruleParamQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_queries_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1416:28: ( (otherlv_0= '[' ( (lv_queries_1_0= ruleParamCompare ) )+ otherlv_2= ']' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1417:1: (otherlv_0= '[' ( (lv_queries_1_0= ruleParamCompare ) )+ otherlv_2= ']' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1417:1: (otherlv_0= '[' ( (lv_queries_1_0= ruleParamCompare ) )+ otherlv_2= ']' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1417:3: otherlv_0= '[' ( (lv_queries_1_0= ruleParamCompare ) )+ otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleParamQuery2927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParamQueryAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1421:1: ( (lv_queries_1_0= ruleParamCompare ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_INT)||LA27_0==22||(LA27_0>=34 && LA27_0<=37)||(LA27_0>=41 && LA27_0<=43)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1422:1: (lv_queries_1_0= ruleParamCompare )
            	    {
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1422:1: (lv_queries_1_0= ruleParamCompare )
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1423:3: lv_queries_1_0= ruleParamCompare
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParamQueryAccess().getQueriesParamCompareParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParamCompare_in_ruleParamQuery2948);
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
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleParamQuery2961); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1451:1: entryRuleParamCompare returns [EObject current=null] : iv_ruleParamCompare= ruleParamCompare EOF ;
    public final EObject entryRuleParamCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamCompare = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1452:2: (iv_ruleParamCompare= ruleParamCompare EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1453:2: iv_ruleParamCompare= ruleParamCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamCompareRule()); 
            }
            pushFollow(FOLLOW_ruleParamCompare_in_entryRuleParamCompare2997);
            iv_ruleParamCompare=ruleParamCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParamCompare; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamCompare3007); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1460:1: ruleParamCompare returns [EObject current=null] : ( ( (lv_left_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) ) ) ) ;
    public final EObject ruleParamCompare() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1463:28: ( ( ( (lv_left_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1464:1: ( ( (lv_left_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1464:1: ( ( (lv_left_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1464:2: ( (lv_left_0_0= ruleValue ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1464:2: ( (lv_left_0_0= ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1465:1: (lv_left_0_0= ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1465:1: (lv_left_0_0= ruleValue )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1466:3: lv_left_0_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParamCompareAccess().getLeftValueParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleParamCompare3053);
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1482:2: ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1482:3: ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleValue ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1482:3: ( (lv_operator_1_0= ruleOperator ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1483:1: (lv_operator_1_0= ruleOperator )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1483:1: (lv_operator_1_0= ruleOperator )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1484:3: lv_operator_1_0= ruleOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParamCompareAccess().getOperatorOperatorEnumRuleCall_1_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperator_in_ruleParamCompare3075);
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1500:2: ( (lv_right_2_0= ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1501:1: (lv_right_2_0= ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1501:1: (lv_right_2_0= ruleValue )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1502:3: lv_right_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParamCompareAccess().getRightValueParserRuleCall_1_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleParamCompare3096);
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1526:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1527:2: (iv_ruleValue= ruleValue EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1528:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue3133);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue3143); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1535:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_FloatValue_2= ruleFloatValue | this_ReferenceValue_3= ruleReferenceValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntValue_1 = null;

        EObject this_FloatValue_2 = null;

        EObject this_ReferenceValue_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1538:28: ( (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_FloatValue_2= ruleFloatValue | this_ReferenceValue_3= ruleReferenceValue ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1539:1: (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_FloatValue_2= ruleFloatValue | this_ReferenceValue_3= ruleReferenceValue )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1539:1: (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_FloatValue_2= ruleFloatValue | this_ReferenceValue_3= ruleReferenceValue )
            int alt28=4;
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
            case RULE_ID:
            case 22:
            case 34:
            case 35:
            case 36:
            case 37:
            case 41:
            case 42:
            case 43:
                {
                alt28=4;
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
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1540:2: this_StringValue_0= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue3193);
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
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1553:2: this_IntValue_1= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValue3223);
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
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1566:2: this_FloatValue_2= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getFloatValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleValue3253);
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
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1579:2: this_ReferenceValue_3= ruleReferenceValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getReferenceValueParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceValue_in_ruleValue3283);
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1598:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1599:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1600:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue3318);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue3328); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1607:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1610:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1611:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1611:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1612:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1612:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1613:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue3369); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFloatValueRule());
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
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleIntValue"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1637:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1638:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1639:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue3409);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue3419); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1646:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1649:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1650:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1650:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1651:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1651:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1652:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue3460); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1676:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1677:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1678:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue3500);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue3510); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1685:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1688:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1689:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1689:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1690:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1690:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1691:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue3551); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1715:1: entryRuleReferenceValue returns [EObject current=null] : iv_ruleReferenceValue= ruleReferenceValue EOF ;
    public final EObject entryRuleReferenceValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceValue = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1716:2: (iv_ruleReferenceValue= ruleReferenceValue EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1717:2: iv_ruleReferenceValue= ruleReferenceValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceValueRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceValue_in_entryRuleReferenceValue3591);
            iv_ruleReferenceValue=ruleReferenceValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceValue3601); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1724:1: ruleReferenceValue returns [EObject current=null] : ( ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_parameter_1_0= ruleParameter ) ) ) ;
    public final EObject ruleReferenceValue() throws RecognitionException {
        EObject current = null;

        EObject lv_query_0_0 = null;

        EObject lv_parameter_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1727:28: ( ( ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_parameter_1_0= ruleParameter ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1728:1: ( ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_parameter_1_0= ruleParameter ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1728:1: ( ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_parameter_1_0= ruleParameter ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1728:2: ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_parameter_1_0= ruleParameter ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1728:2: ( (lv_query_0_0= ruleLocationQuery ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||LA29_0==22||(LA29_0>=36 && LA29_0<=37)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1729:1: (lv_query_0_0= ruleLocationQuery )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1729:1: (lv_query_0_0= ruleLocationQuery )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1730:3: lv_query_0_0= ruleLocationQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceValueAccess().getQueryLocationQueryParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLocationQuery_in_ruleReferenceValue3647);
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
                    break;

            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1746:3: ( (lv_parameter_1_0= ruleParameter ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1747:1: (lv_parameter_1_0= ruleParameter )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1747:1: (lv_parameter_1_0= ruleParameter )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1748:3: lv_parameter_1_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceValueAccess().getParameterParameterParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameter_in_ruleReferenceValue3669);
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1772:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1773:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1774:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3705);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3715); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1781:1: ruleParameter returns [EObject current=null] : (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty | this_InternalFunctionProperty_2= ruleInternalFunctionProperty ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_RuntimeProperty_0 = null;

        EObject this_ReflectionProperty_1 = null;

        EObject this_InternalFunctionProperty_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1784:28: ( (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty | this_InternalFunctionProperty_2= ruleInternalFunctionProperty ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1785:1: (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty | this_InternalFunctionProperty_2= ruleInternalFunctionProperty )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1785:1: (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty | this_InternalFunctionProperty_2= ruleInternalFunctionProperty )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt30=1;
                }
                break;
            case 35:
                {
                alt30=2;
                }
                break;
            case 41:
            case 42:
            case 43:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1786:2: this_RuntimeProperty_0= ruleRuntimeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getRuntimePropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRuntimeProperty_in_ruleParameter3765);
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
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1799:2: this_ReflectionProperty_1= ruleReflectionProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getReflectionPropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReflectionProperty_in_ruleParameter3795);
                    this_ReflectionProperty_1=ruleReflectionProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReflectionProperty_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1812:2: this_InternalFunctionProperty_2= ruleInternalFunctionProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getInternalFunctionPropertyParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalFunctionProperty_in_ruleParameter3825);
                    this_InternalFunctionProperty_2=ruleInternalFunctionProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InternalFunctionProperty_2; 
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


    // $ANTLR start "entryRuleInternalFunctionProperty"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1831:1: entryRuleInternalFunctionProperty returns [EObject current=null] : iv_ruleInternalFunctionProperty= ruleInternalFunctionProperty EOF ;
    public final EObject entryRuleInternalFunctionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalFunctionProperty = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1832:2: (iv_ruleInternalFunctionProperty= ruleInternalFunctionProperty EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1833:2: iv_ruleInternalFunctionProperty= ruleInternalFunctionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalFunctionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleInternalFunctionProperty_in_entryRuleInternalFunctionProperty3860);
            iv_ruleInternalFunctionProperty=ruleInternalFunctionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalFunctionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalFunctionProperty3870); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInternalFunctionProperty"


    // $ANTLR start "ruleInternalFunctionProperty"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1840:1: ruleInternalFunctionProperty returns [EObject current=null] : ( (lv_function_0_0= ruleInternalFunction ) ) ;
    public final EObject ruleInternalFunctionProperty() throws RecognitionException {
        EObject current = null;

        Enumerator lv_function_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1843:28: ( ( (lv_function_0_0= ruleInternalFunction ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1844:1: ( (lv_function_0_0= ruleInternalFunction ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1844:1: ( (lv_function_0_0= ruleInternalFunction ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1845:1: (lv_function_0_0= ruleInternalFunction )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1845:1: (lv_function_0_0= ruleInternalFunction )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1846:3: lv_function_0_0= ruleInternalFunction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInternalFunctionPropertyAccess().getFunctionInternalFunctionEnumRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInternalFunction_in_ruleInternalFunctionProperty3915);
            lv_function_0_0=ruleInternalFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInternalFunctionPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"function",
                      		lv_function_0_0, 
                      		"InternalFunction");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleInternalFunctionProperty"


    // $ANTLR start "entryRuleRuntimeProperty"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1870:1: entryRuleRuntimeProperty returns [EObject current=null] : iv_ruleRuntimeProperty= ruleRuntimeProperty EOF ;
    public final EObject entryRuleRuntimeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuntimeProperty = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1871:2: (iv_ruleRuntimeProperty= ruleRuntimeProperty EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1872:2: iv_ruleRuntimeProperty= ruleRuntimeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuntimePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleRuntimeProperty_in_entryRuleRuntimeProperty3950);
            iv_ruleRuntimeProperty=ruleRuntimeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuntimeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuntimeProperty3960); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1879:1: ruleRuntimeProperty returns [EObject current=null] : (otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRuntimeProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_reference_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1882:28: ( (otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1883:1: (otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1883:1: (otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1883:3: otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleRuntimeProperty3997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRuntimePropertyAccess().getNumberSignKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1887:1: ( (lv_reference_1_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1888:1: (lv_reference_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1888:1: (lv_reference_1_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1889:3: lv_reference_1_0= RULE_ID
            {
            lv_reference_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuntimeProperty4014); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1913:1: entryRuleReflectionProperty returns [EObject current=null] : iv_ruleReflectionProperty= ruleReflectionProperty EOF ;
    public final EObject entryRuleReflectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReflectionProperty = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1914:2: (iv_ruleReflectionProperty= ruleReflectionProperty EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1915:2: iv_ruleReflectionProperty= ruleReflectionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReflectionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReflectionProperty_in_entryRuleReflectionProperty4055);
            iv_ruleReflectionProperty=ruleReflectionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReflectionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReflectionProperty4065); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1922:1: ruleReflectionProperty returns [EObject current=null] : (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) ) ;
    public final EObject ruleReflectionProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_function_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1925:28: ( (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1926:1: (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1926:1: (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1926:3: otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleReflectionProperty4102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReflectionPropertyAccess().getDollarSignKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1930:1: ( (lv_function_1_0= ruleReflectionFunction ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1931:1: (lv_function_1_0= ruleReflectionFunction )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1931:1: (lv_function_1_0= ruleReflectionFunction )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1932:3: lv_function_1_0= ruleReflectionFunction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReflectionPropertyAccess().getFunctionReflectionFunctionEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReflectionFunction_in_ruleReflectionProperty4123);
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1956:1: entryRuleContainerNode returns [EObject current=null] : iv_ruleContainerNode= ruleContainerNode EOF ;
    public final EObject entryRuleContainerNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerNode = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1957:2: (iv_ruleContainerNode= ruleContainerNode EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1958:2: iv_ruleContainerNode= ruleContainerNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerNodeRule()); 
            }
            pushFollow(FOLLOW_ruleContainerNode_in_entryRuleContainerNode4159);
            iv_ruleContainerNode=ruleContainerNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerNode4169); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1965:1: ruleContainerNode returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleContainerNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1968:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1969:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1969:1: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1970:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1970:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1971:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getContainerNodeRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContainerNode4217); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1993:1: entryRuleWildcardNode returns [EObject current=null] : iv_ruleWildcardNode= ruleWildcardNode EOF ;
    public final EObject entryRuleWildcardNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcardNode = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1994:2: (iv_ruleWildcardNode= ruleWildcardNode EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:1995:2: iv_ruleWildcardNode= ruleWildcardNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWildcardNodeRule()); 
            }
            pushFollow(FOLLOW_ruleWildcardNode_in_entryRuleWildcardNode4252);
            iv_ruleWildcardNode=ruleWildcardNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWildcardNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcardNode4262); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2002:1: ruleWildcardNode returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleWildcardNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2005:28: ( ( () otherlv_1= '*' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2006:1: ( () otherlv_1= '*' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2006:1: ( () otherlv_1= '*' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2006:2: () otherlv_1= '*'
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2006:2: ()
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2007:2: 
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

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleWildcardNode4311); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2027:1: entryRuleSubPathNode returns [EObject current=null] : iv_ruleSubPathNode= ruleSubPathNode EOF ;
    public final EObject entryRuleSubPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPathNode = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2028:2: (iv_ruleSubPathNode= ruleSubPathNode EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2029:2: iv_ruleSubPathNode= ruleSubPathNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubPathNodeRule()); 
            }
            pushFollow(FOLLOW_ruleSubPathNode_in_entryRuleSubPathNode4347);
            iv_ruleSubPathNode=ruleSubPathNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubPathNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubPathNode4357); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2036:1: ruleSubPathNode returns [EObject current=null] : ( () otherlv_1= '**' ) ;
    public final EObject ruleSubPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2039:28: ( ( () otherlv_1= '**' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2040:1: ( () otherlv_1= '**' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2040:1: ( () otherlv_1= '**' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2040:2: () otherlv_1= '**'
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2040:2: ()
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2041:2: 
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

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleSubPathNode4406); if (state.failed) return current;
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


    // $ANTLR start "entryRuleParentNode"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2061:1: entryRuleParentNode returns [EObject current=null] : iv_ruleParentNode= ruleParentNode EOF ;
    public final EObject entryRuleParentNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentNode = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2062:2: (iv_ruleParentNode= ruleParentNode EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2063:2: iv_ruleParentNode= ruleParentNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentNodeRule()); 
            }
            pushFollow(FOLLOW_ruleParentNode_in_entryRuleParentNode4442);
            iv_ruleParentNode=ruleParentNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParentNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParentNode4452); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParentNode"


    // $ANTLR start "ruleParentNode"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2070:1: ruleParentNode returns [EObject current=null] : ( () otherlv_1= '<<' ) ;
    public final EObject ruleParentNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2073:28: ( ( () otherlv_1= '<<' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2074:1: ( () otherlv_1= '<<' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2074:1: ( () otherlv_1= '<<' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2074:2: () otherlv_1= '<<'
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2074:2: ()
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2075:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParentNodeAccess().getParentNodeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleParentNode4501); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParentNodeAccess().getLessThanSignLessThanSignKeyword_1());
                  
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
    // $ANTLR end "ruleParentNode"


    // $ANTLR start "entryRuleCollector"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2095:1: entryRuleCollector returns [EObject current=null] : iv_ruleCollector= ruleCollector EOF ;
    public final EObject entryRuleCollector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollector = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2096:2: (iv_ruleCollector= ruleCollector EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2097:2: iv_ruleCollector= ruleCollector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectorRule()); 
            }
            pushFollow(FOLLOW_ruleCollector_in_entryRuleCollector4537);
            iv_ruleCollector=ruleCollector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollector4547); if (state.failed) return current;

            }

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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2104:1: ruleCollector returns [EObject current=null] : ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )* )? otherlv_6= ')' ) ;
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
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2107:28: ( ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )* )? otherlv_6= ')' ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2108:1: ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )* )? otherlv_6= ')' )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2108:1: ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )* )? otherlv_6= ')' )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2108:2: ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )* )? otherlv_6= ')'
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2108:2: ( (lv_insertionPoint_0_0= ruleInsertionPoint ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2109:1: (lv_insertionPoint_0_0= ruleInsertionPoint )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2109:1: (lv_insertionPoint_0_0= ruleInsertionPoint )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2110:3: lv_insertionPoint_0_0= ruleInsertionPoint
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectorAccess().getInsertionPointInsertionPointEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInsertionPoint_in_ruleCollector4593);
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

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2126:2: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2127:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2127:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2128:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCollector4620);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleCollector4632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCollectorAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2148:1: ( ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_INT)||LA32_0==22||(LA32_0>=34 && LA32_0<=37)||(LA32_0>=41 && LA32_0<=43)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2148:2: ( (lv_initializations_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )*
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2148:2: ( (lv_initializations_3_0= ruleValue ) )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2149:1: (lv_initializations_3_0= ruleValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2149:1: (lv_initializations_3_0= ruleValue )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2150:3: lv_initializations_3_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectorAccess().getInitializationsValueParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleCollector4654);
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

                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2166:2: (otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==19) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2166:4: otherlv_4= ',' ( (lv_initializations_5_0= ruleValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleCollector4667); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getCollectorAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2170:1: ( (lv_initializations_5_0= ruleValue ) )
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2171:1: (lv_initializations_5_0= ruleValue )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2171:1: (lv_initializations_5_0= ruleValue )
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2172:3: lv_initializations_5_0= ruleValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectorAccess().getInitializationsValueParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleValue_in_ruleCollector4688);
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
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleCollector4704); if (state.failed) return current;
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


    // $ANTLR start "entryRuleAnnotation"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2200:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2201:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2202:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation4740);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation4750); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2209:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_TagAnnotation_1 = null;

        EObject this_KeyStringValueAnnotation_2 = null;

        EObject this_TypedKeyStringValueAnnotation_3 = null;

        EObject this_KeyBooleanValueAnnotation_4 = null;

        EObject this_KeyIntValueAnnotation_5 = null;

        EObject this_KeyFloatValueAnnotation_6 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2212:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2213:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2213:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            int alt33=7;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2214:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommentAnnotation_in_ruleAnnotation4800);
                    this_CommentAnnotation_0=ruleCommentAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CommentAnnotation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2227:2: this_TagAnnotation_1= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTagAnnotation_in_ruleAnnotation4830);
                    this_TagAnnotation_1=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TagAnnotation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2240:2: this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation4860);
                    this_KeyStringValueAnnotation_2=ruleKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyStringValueAnnotation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2253:2: this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation4890);
                    this_TypedKeyStringValueAnnotation_3=ruleTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypedKeyStringValueAnnotation_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2266:2: this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation4920);
                    this_KeyBooleanValueAnnotation_4=ruleKeyBooleanValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyBooleanValueAnnotation_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2279:2: this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation4950);
                    this_KeyIntValueAnnotation_5=ruleKeyIntValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyIntValueAnnotation_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2292:2: this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation4980);
                    this_KeyFloatValueAnnotation_6=ruleKeyFloatValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyFloatValueAnnotation_6; 
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2313:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2314:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2315:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation5017);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentAnnotation5027); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentAnnotation"


    // $ANTLR start "ruleCommentAnnotation"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2322:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2325:28: ( ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2326:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2326:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2327:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2327:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2328:3: lv_value_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_value_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation5068); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCommentAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"COMMENT_ANNOTATION");
              	    
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
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleTagAnnotation"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2352:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2353:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2354:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation5108);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagAnnotation5118); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTagAnnotation"


    // $ANTLR start "ruleTagAnnotation"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2361:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2364:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2365:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2365:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2365:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleTagAnnotation5155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2369:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2370:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2370:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2371:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTagAnnotation5176);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTagAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2387:2: (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2387:4: otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleTagAnnotation5189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2391:1: ( (lv_annotations_3_0= ruleAnnotation ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_COMMENT_ANNOTATION||LA34_0==38) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2392:1: (lv_annotations_3_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2392:1: (lv_annotations_3_0= ruleAnnotation )
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2393:3: lv_annotations_3_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleTagAnnotation5210);
                    	    lv_annotations_3_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTagAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_3_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleTagAnnotation5223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2());
                          
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
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2421:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2422:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2423:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation5261);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation5271); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyStringValueAnnotation"


    // $ANTLR start "ruleKeyStringValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2430:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2433:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2434:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2434:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2434:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleKeyStringValueAnnotation5308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2438:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2439:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2439:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2440:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation5329);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2456:2: ( (lv_value_2_0= ruleEString ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2457:1: (lv_value_2_0= ruleEString )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2457:1: (lv_value_2_0= ruleEString )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2458:3: lv_value_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation5350);
            lv_value_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2474:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==25) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2474:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleKeyStringValueAnnotation5363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2478:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_COMMENT_ANNOTATION||LA36_0==38) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2479:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2479:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2480:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation5384);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleKeyStringValueAnnotation5397); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
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
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2508:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2509:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2510:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation5435);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation5445); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2517:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? ) ;
    public final EObject ruleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        EObject lv_annotations_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2520:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2521:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2521:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2521:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleTypedKeyStringValueAnnotation5482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2525:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2526:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2526:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2527:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation5503);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleTypedKeyStringValueAnnotation5515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2547:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2548:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2548:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2549:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation5536);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleTypedKeyStringValueAnnotation5548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2569:1: ( (lv_value_5_0= ruleEString ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2570:1: (lv_value_5_0= ruleEString )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2570:1: (lv_value_5_0= ruleEString )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2571:3: lv_value_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation5569);
            lv_value_5_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_5_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2587:2: (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==25) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2587:4: otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleTypedKeyStringValueAnnotation5582); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2591:1: ( (lv_annotations_7_0= ruleAnnotation ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_COMMENT_ANNOTATION||LA38_0==38) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2592:1: (lv_annotations_7_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2592:1: (lv_annotations_7_0= ruleAnnotation )
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2593:3: lv_annotations_7_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleTypedKeyStringValueAnnotation5603);
                    	    lv_annotations_7_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_7_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleTypedKeyStringValueAnnotation5616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2());
                          
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
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2621:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2622:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2623:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation5654);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation5664); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyBooleanValueAnnotation"


    // $ANTLR start "ruleKeyBooleanValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2630:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2633:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2634:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2634:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2634:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleKeyBooleanValueAnnotation5701); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2638:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2639:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2639:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2640:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation5722);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyBooleanValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2656:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2657:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2657:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2658:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation5739); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeyBooleanValueAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"BOOLEAN");
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2674:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==25) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2674:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleKeyBooleanValueAnnotation5757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2678:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==RULE_COMMENT_ANNOTATION||LA40_0==38) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2679:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2679:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2680:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation5778);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyBooleanValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleKeyBooleanValueAnnotation5791); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
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
    // $ANTLR end "ruleKeyBooleanValueAnnotation"


    // $ANTLR start "entryRuleKeyIntValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2708:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2709:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2710:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation5829);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation5839); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyIntValueAnnotation"


    // $ANTLR start "ruleKeyIntValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2717:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2720:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2721:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2721:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2721:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleKeyIntValueAnnotation5876); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2725:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2726:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2726:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2727:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation5897);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyIntValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2743:2: ( (lv_value_2_0= RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2744:1: (lv_value_2_0= RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2744:1: (lv_value_2_0= RULE_INT )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2745:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation5914); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeyIntValueAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"INT");
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2761:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==25) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2761:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleKeyIntValueAnnotation5932); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2765:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_COMMENT_ANNOTATION||LA42_0==38) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2766:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2766:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2767:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation5953);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyIntValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleKeyIntValueAnnotation5966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
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
    // $ANTLR end "ruleKeyIntValueAnnotation"


    // $ANTLR start "entryRuleKeyFloatValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2795:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2796:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2797:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation6004);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation6014); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyFloatValueAnnotation"


    // $ANTLR start "ruleKeyFloatValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2804:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2807:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2808:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2808:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2808:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleKeyFloatValueAnnotation6051); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2812:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2813:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2813:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2814:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation6072);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyFloatValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2830:2: ( (lv_value_2_0= RULE_FLOAT ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2831:1: (lv_value_2_0= RULE_FLOAT )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2831:1: (lv_value_2_0= RULE_FLOAT )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2832:3: lv_value_2_0= RULE_FLOAT
            {
            lv_value_2_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation6089); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getKeyFloatValueAnnotationAccess().getValueFLOATTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeyFloatValueAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"FLOAT");
              	    
            }

            }


            }

            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2848:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==25) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2848:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleKeyFloatValueAnnotation6107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2852:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==RULE_COMMENT_ANNOTATION||LA44_0==38) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2853:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2853:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2854:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation6128);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyFloatValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleKeyFloatValueAnnotation6141); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
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
    // $ANTLR end "ruleKeyFloatValueAnnotation"


    // $ANTLR start "entryRuleEString"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2884:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2885:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2886:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString6182);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString6193); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2893:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2896:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2897:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2897:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_STRING) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_ID) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2897:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString6233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2905:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString6259); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                          
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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2920:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2921:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2922:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID6305);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID6316); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2929:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2932:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2933:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2933:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2933:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID6356); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2940:1: (kw= '.' this_ID_2= RULE_ID )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==21) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2941:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_ruleExtendedID6375); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID6390); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "ruleQueryModifier"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2961:1: ruleQueryModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) ) ;
    public final Enumerator ruleQueryModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2963:28: ( ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2964:1: ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2964:1: ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==39) ) {
                alt48=1;
            }
            else if ( (LA48_0==40) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2964:2: (enumLiteral_0= 'include' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2964:2: (enumLiteral_0= 'include' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2964:4: enumLiteral_0= 'include'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleQueryModifier6451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getQueryModifierAccess().getINCLUDEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getQueryModifierAccess().getINCLUDEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2970:6: (enumLiteral_1= 'exclude' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2970:6: (enumLiteral_1= 'exclude' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2970:8: enumLiteral_1= 'exclude'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleQueryModifier6468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getQueryModifierAccess().getEXCLUDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getQueryModifierAccess().getEXCLUDEEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleQueryModifier"


    // $ANTLR start "ruleInternalFunction"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2980:1: ruleInternalFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) ) ;
    public final Enumerator ruleInternalFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2982:28: ( ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2983:1: ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2983:1: ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt49=1;
                }
                break;
            case 42:
                {
                alt49=2;
                }
                break;
            case 43:
                {
                alt49=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2983:2: (enumLiteral_0= 'time' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2983:2: (enumLiteral_0= 'time' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2983:4: enumLiteral_0= 'time'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_41_in_ruleInternalFunction6513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getInternalFunctionAccess().getTIMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getInternalFunctionAccess().getTIMEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2989:6: (enumLiteral_1= 'traceId' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2989:6: (enumLiteral_1= 'traceId' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2989:8: enumLiteral_1= 'traceId'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_42_in_ruleInternalFunction6530); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getInternalFunctionAccess().getTRACE_IDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getInternalFunctionAccess().getTRACE_IDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2995:6: (enumLiteral_2= 'orderIndex' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2995:6: (enumLiteral_2= 'orderIndex' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:2995:8: enumLiteral_2= 'orderIndex'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_43_in_ruleInternalFunction6547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getInternalFunctionAccess().getORDER_INDEXEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getInternalFunctionAccess().getORDER_INDEXEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleInternalFunction"


    // $ANTLR start "ruleReflectionFunction"
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3005:1: ruleReflectionFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'class' ) | (enumLiteral_3= 'return-type' ) ) ;
    public final Enumerator ruleReflectionFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3007:28: ( ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'class' ) | (enumLiteral_3= 'return-type' ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3008:1: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'class' ) | (enumLiteral_3= 'return-type' ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3008:1: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'class' ) | (enumLiteral_3= 'return-type' ) )
            int alt50=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt50=1;
                }
                break;
            case 45:
                {
                alt50=2;
                }
                break;
            case 46:
                {
                alt50=3;
                }
                break;
            case 47:
                {
                alt50=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3008:2: (enumLiteral_0= 'name' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3008:2: (enumLiteral_0= 'name' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3008:4: enumLiteral_0= 'name'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_44_in_ruleReflectionFunction6592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3014:6: (enumLiteral_1= 'signature' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3014:6: (enumLiteral_1= 'signature' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3014:8: enumLiteral_1= 'signature'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_45_in_ruleReflectionFunction6609); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3020:6: (enumLiteral_2= 'class' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3020:6: (enumLiteral_2= 'class' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3020:8: enumLiteral_2= 'class'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_46_in_ruleReflectionFunction6626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3026:6: (enumLiteral_3= 'return-type' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3026:6: (enumLiteral_3= 'return-type' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3026:8: enumLiteral_3= 'return-type'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_47_in_ruleReflectionFunction6643); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3036:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) ) ;
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
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3038:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3039:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3039:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) )
            int alt51=7;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt51=1;
                }
                break;
            case 49:
                {
                alt51=2;
                }
                break;
            case 50:
                {
                alt51=3;
                }
                break;
            case 51:
                {
                alt51=4;
                }
                break;
            case 52:
                {
                alt51=5;
                }
                break;
            case 53:
                {
                alt51=6;
                }
                break;
            case 54:
                {
                alt51=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3039:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3039:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3039:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleOperator6688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3045:6: (enumLiteral_1= '~' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3045:6: (enumLiteral_1= '~' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3045:8: enumLiteral_1= '~'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_ruleOperator6705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getLIKEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3051:6: (enumLiteral_2= '!=' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3051:6: (enumLiteral_2= '!=' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3051:8: enumLiteral_2= '!='
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_50_in_ruleOperator6722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getNEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3057:6: (enumLiteral_3= '>' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3057:6: (enumLiteral_3= '>' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3057:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_51_in_ruleOperator6739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getGREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getGREnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3063:6: (enumLiteral_4= '<' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3063:6: (enumLiteral_4= '<' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3063:8: enumLiteral_4= '<'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_52_in_ruleOperator6756); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getLWEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3069:6: (enumLiteral_5= '>=' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3069:6: (enumLiteral_5= '>=' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3069:8: enumLiteral_5= '>='
                    {
                    enumLiteral_5=(Token)match(input,53,FOLLOW_53_in_ruleOperator6773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getGEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3075:6: (enumLiteral_6= '<=' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3075:6: (enumLiteral_6= '<=' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3075:8: enumLiteral_6= '<='
                    {
                    enumLiteral_6=(Token)match(input,54,FOLLOW_54_in_ruleOperator6790); if (state.failed) return current;
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
    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3085:1: ruleInsertionPoint returns [Enumerator current=null] : ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) ) ;
    public final Enumerator ruleInsertionPoint() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3087:28: ( ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) ) )
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3088:1: ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) )
            {
            // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3088:1: ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==55) ) {
                alt52=1;
            }
            else if ( (LA52_0==56) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3088:2: (enumLiteral_0= 'before' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3088:2: (enumLiteral_0= 'before' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3088:4: enumLiteral_0= 'before'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleInsertionPoint6835); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3094:6: (enumLiteral_1= 'after' )
                    {
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3094:6: (enumLiteral_1= 'after' )
                    // ../de.cau.cs.se.instrumentation.al/src-gen/de/cau/cs/se/instrumentation/al/parser/antlr/internal/InternalAspectLang.g:3094:8: enumLiteral_1= 'after'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_56_in_ruleInsertionPoint6852); if (state.failed) return current;
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

    // Delegated rules


    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA33_eotS =
        "\14\uffff";
    static final String DFA33_eofS =
        "\3\uffff\1\5\7\uffff\1\5";
    static final String DFA33_minS =
        "\1\10\1\uffff\3\4\6\uffff\1\4";
    static final String DFA33_maxS =
        "\1\46\1\uffff\1\4\1\46\1\4\6\uffff\1\46";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\1\6\1\7\1\5\1\3\1\4\1\uffff";
    static final String DFA33_specialS =
        "\14\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1\35\uffff\1\2",
            "",
            "\1\3",
            "\2\11\1\7\1\6\1\5\1\10\13\uffff\1\4\3\uffff\2\5\4\uffff\1\5\1\12\5\uffff\1\5",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\11\1\7\1\6\1\5\1\10\13\uffff\1\4\3\uffff\2\5\4\uffff\1\5\1\12\5\uffff\1\5"
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "2213:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleModel128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel149 = new BitSet(new long[]{0x0000004088870102L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_ruleModel170 = new BitSet(new long[]{0x0000004088870102L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel192 = new BitSet(new long[]{0x0000004088850102L});
    public static final BitSet FOLLOW_ruleApplicationModel_in_ruleModel214 = new BitSet(new long[]{0x0000004088840102L});
    public static final BitSet FOLLOW_ruleAdvice_in_ruleModel237 = new BitSet(new long[]{0x0000004088800102L});
    public static final BitSet FOLLOW_rulePointcut_in_ruleModel264 = new BitSet(new long[]{0x0000004088800102L});
    public static final BitSet FOLLOW_ruleAspect_in_ruleModel291 = new BitSet(new long[]{0x0000004088800102L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleImport376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_entryRuleRegisteredPackage433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegisteredPackage443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRegisteredPackage480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegisteredPackage497 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRegisteredPackage526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationModel_in_entryRuleApplicationModel562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationModel572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleApplicationModel609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationModel633 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleApplicationModel646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationModel670 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleApplicationModel684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationModel701 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplicationModel723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName816 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleQualifiedName844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName860 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard966 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleQualifiedNameWithWildcard985 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedNameWithWildcard998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect1040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAspect1087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAspect1114 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAspect1126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUtilizeProbe_in_ruleAspect1147 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleAspect1160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUtilizeProbe_in_ruleAspect1181 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleUtilizeProbe_in_entryRuleUtilizeProbe1219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUtilizeProbe1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleUtilizeProbe1281 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleUtilizeProbe1294 = new BitSet(new long[]{0x00000E3C044000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleUtilizeProbe1316 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_19_in_ruleUtilizeProbe1329 = new BitSet(new long[]{0x00000E3C004000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleUtilizeProbe1350 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_26_in_ruleUtilizeProbe1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdvice_in_entryRuleAdvice1404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdvice1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAdvice1451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAdvice1468 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_25_in_ruleAdvice1486 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleAdvice1508 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_19_in_ruleAdvice1521 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleAdvice1542 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_26_in_ruleAdvice1558 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAdvice1572 = new BitSet(new long[]{0x0180000020000000L});
    public static final BitSet FOLLOW_ruleCollector_in_ruleAdvice1593 = new BitSet(new long[]{0x0180000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAdvice1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleParameterDeclaration1695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterDeclaration1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointcut_in_entryRulePointcut1766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointcut1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rulePointcut1822 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePointcut1835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePointcut1852 = new BitSet(new long[]{0x0000003000400010L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_rulePointcut1878 = new BitSet(new long[]{0x0000000000400012L});
    public static final BitSet FOLLOW_ruleMethodQuery_in_rulePointcut1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodQuery_in_entryRuleMethodQuery1936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodQuery1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodQuery1996 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleMethodQuery2014 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodQuery2040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22_in_ruleMethodQuery2058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodQuery2083 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMethodQuery2095 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleParameterQuery_in_ruleMethodQuery2116 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_19_in_ruleMethodQuery2129 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleParameterQuery_in_ruleMethodQuery2150 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_26_in_ruleMethodQuery2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterQuery_in_entryRuleParameterQuery2200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterQuery2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterQuery2260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22_in_ruleParameterQuery2278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterQuery2303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterQuery2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_entryRuleLocationQuery2363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocationQuery2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleLocationQuery2419 = new BitSet(new long[]{0x0000018010200002L});
    public static final BitSet FOLLOW_21_in_ruleLocationQuery2433 = new BitSet(new long[]{0x0000003000400010L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_ruleLocationQuery2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositionQuery_in_ruleLocationQuery2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositionQuery_in_entryRuleCompositionQuery2520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositionQuery2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryModifier_in_ruleCompositionQuery2588 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCompositionQuery2601 = new BitSet(new long[]{0x0000003020400010L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_ruleCompositionQuery2622 = new BitSet(new long[]{0x0000003020400010L});
    public static final BitSet FOLLOW_29_in_ruleCompositionQuery2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode2671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubPathNode_in_ruleNode2732 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleWildcardNode_in_ruleNode2762 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleParentNode_in_ruleNode2792 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleContainerNode_in_ruleNode2822 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleParamQuery_in_ruleNode2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamQuery_in_entryRuleParamQuery2880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamQuery2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleParamQuery2927 = new BitSet(new long[]{0x00000E3C004000F0L});
    public static final BitSet FOLLOW_ruleParamCompare_in_ruleParamQuery2948 = new BitSet(new long[]{0x00000E3E004000F0L});
    public static final BitSet FOLLOW_33_in_ruleParamQuery2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamCompare_in_entryRuleParamCompare2997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamCompare3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleParamCompare3053 = new BitSet(new long[]{0x007F000000000000L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleParamCompare3075 = new BitSet(new long[]{0x00000E3C004000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleParamCompare3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue3133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValue3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleValue3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValue_in_ruleValue3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue3318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue3409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue3500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValue_in_entryRuleReferenceValue3591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceValue3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_ruleReferenceValue3647 = new BitSet(new long[]{0x00000E3C004000F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleReferenceValue3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuntimeProperty_in_ruleParameter3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionProperty_in_ruleParameter3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalFunctionProperty_in_ruleParameter3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalFunctionProperty_in_entryRuleInternalFunctionProperty3860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalFunctionProperty3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalFunction_in_ruleInternalFunctionProperty3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuntimeProperty_in_entryRuleRuntimeProperty3950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuntimeProperty3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRuntimeProperty3997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuntimeProperty4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionProperty_in_entryRuleReflectionProperty4055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReflectionProperty4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleReflectionProperty4102 = new BitSet(new long[]{0x0000F00000000000L});
    public static final BitSet FOLLOW_ruleReflectionFunction_in_ruleReflectionProperty4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerNode_in_entryRuleContainerNode4159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerNode4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContainerNode4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNode_in_entryRuleWildcardNode4252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcardNode4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleWildcardNode4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubPathNode_in_entryRuleSubPathNode4347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubPathNode4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSubPathNode4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParentNode_in_entryRuleParentNode4442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParentNode4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleParentNode4501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollector_in_entryRuleCollector4537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollector4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertionPoint_in_ruleCollector4593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCollector4620 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCollector4632 = new BitSet(new long[]{0x00000E3C044000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCollector4654 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_19_in_ruleCollector4667 = new BitSet(new long[]{0x00000E3C004000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCollector4688 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_26_in_ruleCollector4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation5017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation5108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTagAnnotation5155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation5176 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleTagAnnotation5189 = new BitSet(new long[]{0x0000004004000100L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTagAnnotation5210 = new BitSet(new long[]{0x0000004004000100L});
    public static final BitSet FOLLOW_26_in_ruleTagAnnotation5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation5261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleKeyStringValueAnnotation5308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation5329 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation5350 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleKeyStringValueAnnotation5363 = new BitSet(new long[]{0x0000004004000100L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation5384 = new BitSet(new long[]{0x0000004004000100L});
    public static final BitSet FOLLOW_26_in_ruleKeyStringValueAnnotation5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation5435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation5445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTypedKeyStringValueAnnotation5482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation5503 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleTypedKeyStringValueAnnotation5515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation5536 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleTypedKeyStringValueAnnotation5548 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation5569 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleTypedKeyStringValueAnnotation5582 = new BitSet(new long[]{0x0000004004000100L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTypedKeyStringValueAnnotation5603 = new BitSet(new long[]{0x0000004004000100L});
    public static final BitSet FOLLOW_26_in_ruleTypedKeyStringValueAnnotation5616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation5654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation5664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleKeyBooleanValueAnnotation5701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation5722 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation5739 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleKeyBooleanValueAnnotation5757 = new BitSet(new long[]{0x0000004004000100L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation5778 = new BitSet(new long[]{0x0000004004000100L});
    public static final BitSet FOLLOW_26_in_ruleKeyBooleanValueAnnotation5791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation5829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleKeyIntValueAnnotation5876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation5897 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation5914 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleKeyIntValueAnnotation5932 = new BitSet(new long[]{0x0000004004000100L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation5953 = new BitSet(new long[]{0x0000004004000100L});
    public static final BitSet FOLLOW_26_in_ruleKeyIntValueAnnotation5966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation6004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation6014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleKeyFloatValueAnnotation6051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation6072 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation6089 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleKeyFloatValueAnnotation6107 = new BitSet(new long[]{0x0000004004000100L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation6128 = new BitSet(new long[]{0x0000004004000100L});
    public static final BitSet FOLLOW_26_in_ruleKeyFloatValueAnnotation6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString6182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString6193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString6259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID6305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID6356 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleExtendedID6375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID6390 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_39_in_ruleQueryModifier6451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleQueryModifier6468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleInternalFunction6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleInternalFunction6530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleInternalFunction6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleReflectionFunction6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleReflectionFunction6609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleReflectionFunction6626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleReflectionFunction6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOperator6688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOperator6705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOperator6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOperator6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOperator6756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleOperator6773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOperator6790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleInsertionPoint6835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleInsertionPoint6852 = new BitSet(new long[]{0x0000000000000002L});

}
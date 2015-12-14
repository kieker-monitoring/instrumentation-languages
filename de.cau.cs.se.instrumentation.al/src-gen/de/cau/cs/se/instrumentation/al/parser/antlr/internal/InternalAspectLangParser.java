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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_FLOAT", "RULE_INT", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'use'", "'on'", "'.'", "'*'", "'aspect'", "':'", "','", "'('", "')'", "'advice'", "'{'", "'}'", "'type'", "'pointcut'", "'class'", "'operation'", "'@'", "'['", "']'", "'#'", "'$'", "'**'", "'<<'", "'include'", "'exclude'", "'&&'", "'||'", "'time'", "'traceId'", "'orderIndex'", "'name'", "'signature'", "'classname'", "'return-type'", "'before'", "'after'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NUMBER=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=6;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAspectLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAspectLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAspectLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAspectLang.g"; }



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
        	return "AspectModel";	
       	}
       	
       	@Override
       	protected AspectLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAspectModel"
    // InternalAspectLang.g:74:1: entryRuleAspectModel returns [EObject current=null] : iv_ruleAspectModel= ruleAspectModel EOF ;
    public final EObject entryRuleAspectModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspectModel = null;


        try {
            // InternalAspectLang.g:75:2: (iv_ruleAspectModel= ruleAspectModel EOF )
            // InternalAspectLang.g:76:2: iv_ruleAspectModel= ruleAspectModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAspectModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAspectModel=ruleAspectModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAspectModel; 
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
    // $ANTLR end "entryRuleAspectModel"


    // $ANTLR start "ruleAspectModel"
    // InternalAspectLang.g:83:1: ruleAspectModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_sources_3_0= ruleApplicationModel ) )* ( ( (lv_advices_4_0= ruleAdvice ) ) | ( (lv_pointcuts_5_0= rulePointcut ) ) | ( (lv_aspects_6_0= ruleAspect ) ) )* ) ;
    public final EObject ruleAspectModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_sources_3_0 = null;

        EObject lv_advices_4_0 = null;

        EObject lv_pointcuts_5_0 = null;

        EObject lv_aspects_6_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:86:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_sources_3_0= ruleApplicationModel ) )* ( ( (lv_advices_4_0= ruleAdvice ) ) | ( (lv_pointcuts_5_0= rulePointcut ) ) | ( (lv_aspects_6_0= ruleAspect ) ) )* ) )
            // InternalAspectLang.g:87:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_sources_3_0= ruleApplicationModel ) )* ( ( (lv_advices_4_0= ruleAdvice ) ) | ( (lv_pointcuts_5_0= rulePointcut ) ) | ( (lv_aspects_6_0= ruleAspect ) ) )* )
            {
            // InternalAspectLang.g:87:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_sources_3_0= ruleApplicationModel ) )* ( ( (lv_advices_4_0= ruleAdvice ) ) | ( (lv_pointcuts_5_0= rulePointcut ) ) | ( (lv_aspects_6_0= ruleAspect ) ) )* )
            // InternalAspectLang.g:87:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_sources_3_0= ruleApplicationModel ) )* ( ( (lv_advices_4_0= ruleAdvice ) ) | ( (lv_pointcuts_5_0= rulePointcut ) ) | ( (lv_aspects_6_0= ruleAspect ) ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAspectModelAccess().getPackageKeyword_0());
                  
            }
            // InternalAspectLang.g:91:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAspectLang.g:92:1: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAspectLang.g:92:1: (lv_name_1_0= ruleQualifiedName )
            // InternalAspectLang.g:93:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAspectModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAspectModelRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.se.instrumentation.al.AspectLang.QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAspectLang.g:109:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAspectLang.g:110:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalAspectLang.g:110:1: (lv_imports_2_0= ruleImport )
            	    // InternalAspectLang.g:111:3: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAspectModelAccess().getImportsImportParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAspectModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
            	              		"de.cau.cs.se.instrumentation.al.AspectLang.Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalAspectLang.g:127:3: ( (lv_sources_3_0= ruleApplicationModel ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAspectLang.g:128:1: (lv_sources_3_0= ruleApplicationModel )
            	    {
            	    // InternalAspectLang.g:128:1: (lv_sources_3_0= ruleApplicationModel )
            	    // InternalAspectLang.g:129:3: lv_sources_3_0= ruleApplicationModel
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAspectModelAccess().getSourcesApplicationModelParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_sources_3_0=ruleApplicationModel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAspectModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sources",
            	              		lv_sources_3_0, 
            	              		"de.cau.cs.se.instrumentation.al.AspectLang.ApplicationModel");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalAspectLang.g:145:3: ( ( (lv_advices_4_0= ruleAdvice ) ) | ( (lv_pointcuts_5_0= rulePointcut ) ) | ( (lv_aspects_6_0= ruleAspect ) ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    alt3=1;
                    }
                    break;
                case 28:
                case 31:
                    {
                    alt3=2;
                    }
                    break;
                case 19:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalAspectLang.g:145:4: ( (lv_advices_4_0= ruleAdvice ) )
            	    {
            	    // InternalAspectLang.g:145:4: ( (lv_advices_4_0= ruleAdvice ) )
            	    // InternalAspectLang.g:146:1: (lv_advices_4_0= ruleAdvice )
            	    {
            	    // InternalAspectLang.g:146:1: (lv_advices_4_0= ruleAdvice )
            	    // InternalAspectLang.g:147:3: lv_advices_4_0= ruleAdvice
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAspectModelAccess().getAdvicesAdviceParserRuleCall_4_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_advices_4_0=ruleAdvice();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAspectModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"advices",
            	              		lv_advices_4_0, 
            	              		"de.cau.cs.se.instrumentation.al.AspectLang.Advice");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAspectLang.g:164:6: ( (lv_pointcuts_5_0= rulePointcut ) )
            	    {
            	    // InternalAspectLang.g:164:6: ( (lv_pointcuts_5_0= rulePointcut ) )
            	    // InternalAspectLang.g:165:1: (lv_pointcuts_5_0= rulePointcut )
            	    {
            	    // InternalAspectLang.g:165:1: (lv_pointcuts_5_0= rulePointcut )
            	    // InternalAspectLang.g:166:3: lv_pointcuts_5_0= rulePointcut
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAspectModelAccess().getPointcutsPointcutParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_pointcuts_5_0=rulePointcut();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAspectModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"pointcuts",
            	              		lv_pointcuts_5_0, 
            	              		"de.cau.cs.se.instrumentation.al.AspectLang.Pointcut");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAspectLang.g:183:6: ( (lv_aspects_6_0= ruleAspect ) )
            	    {
            	    // InternalAspectLang.g:183:6: ( (lv_aspects_6_0= ruleAspect ) )
            	    // InternalAspectLang.g:184:1: (lv_aspects_6_0= ruleAspect )
            	    {
            	    // InternalAspectLang.g:184:1: (lv_aspects_6_0= ruleAspect )
            	    // InternalAspectLang.g:185:3: lv_aspects_6_0= ruleAspect
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAspectModelAccess().getAspectsAspectParserRuleCall_4_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_aspects_6_0=ruleAspect();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAspectModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"aspects",
            	              		lv_aspects_6_0, 
            	              		"de.cau.cs.se.instrumentation.al.AspectLang.Aspect");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
    // $ANTLR end "ruleAspectModel"


    // $ANTLR start "entryRuleImport"
    // InternalAspectLang.g:209:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalAspectLang.g:210:2: (iv_ruleImport= ruleImport EOF )
            // InternalAspectLang.g:211:2: iv_ruleImport= ruleImport EOF
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
    // InternalAspectLang.g:218:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:221:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalAspectLang.g:222:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalAspectLang.g:222:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalAspectLang.g:222:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // InternalAspectLang.g:226:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalAspectLang.g:227:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalAspectLang.g:227:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalAspectLang.g:228:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
                      		"de.cau.cs.se.instrumentation.al.AspectLang.QualifiedNameWithWildcard");
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


    // $ANTLR start "entryRuleApplicationModel"
    // InternalAspectLang.g:252:1: entryRuleApplicationModel returns [EObject current=null] : iv_ruleApplicationModel= ruleApplicationModel EOF ;
    public final EObject entryRuleApplicationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationModel = null;


        try {
            // InternalAspectLang.g:253:2: (iv_ruleApplicationModel= ruleApplicationModel EOF )
            // InternalAspectLang.g:254:2: iv_ruleApplicationModel= ruleApplicationModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleApplicationModel=ruleApplicationModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplicationModel; 
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
    // $ANTLR end "entryRuleApplicationModel"


    // $ANTLR start "ruleApplicationModel"
    // InternalAspectLang.g:261:1: ruleApplicationModel returns [EObject current=null] : (otherlv_0= 'use' ( (lv_handler_1_0= RULE_ID ) ) otherlv_2= 'on' ( (lv_name_3_0= RULE_ID ) ) ( (lv_model_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleApplicationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_handler_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_model_4_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:264:28: ( (otherlv_0= 'use' ( (lv_handler_1_0= RULE_ID ) ) otherlv_2= 'on' ( (lv_name_3_0= RULE_ID ) ) ( (lv_model_4_0= RULE_STRING ) ) ) )
            // InternalAspectLang.g:265:1: (otherlv_0= 'use' ( (lv_handler_1_0= RULE_ID ) ) otherlv_2= 'on' ( (lv_name_3_0= RULE_ID ) ) ( (lv_model_4_0= RULE_STRING ) ) )
            {
            // InternalAspectLang.g:265:1: (otherlv_0= 'use' ( (lv_handler_1_0= RULE_ID ) ) otherlv_2= 'on' ( (lv_name_3_0= RULE_ID ) ) ( (lv_model_4_0= RULE_STRING ) ) )
            // InternalAspectLang.g:265:3: otherlv_0= 'use' ( (lv_handler_1_0= RULE_ID ) ) otherlv_2= 'on' ( (lv_name_3_0= RULE_ID ) ) ( (lv_model_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getApplicationModelAccess().getUseKeyword_0());
                  
            }
            // InternalAspectLang.g:269:1: ( (lv_handler_1_0= RULE_ID ) )
            // InternalAspectLang.g:270:1: (lv_handler_1_0= RULE_ID )
            {
            // InternalAspectLang.g:270:1: (lv_handler_1_0= RULE_ID )
            // InternalAspectLang.g:271:3: lv_handler_1_0= RULE_ID
            {
            lv_handler_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_handler_1_0, grammarAccess.getApplicationModelAccess().getHandlerIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getApplicationModelRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"handler",
                      		lv_handler_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getApplicationModelAccess().getOnKeyword_2());
                  
            }
            // InternalAspectLang.g:291:1: ( (lv_name_3_0= RULE_ID ) )
            // InternalAspectLang.g:292:1: (lv_name_3_0= RULE_ID )
            {
            // InternalAspectLang.g:292:1: (lv_name_3_0= RULE_ID )
            // InternalAspectLang.g:293:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getApplicationModelAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getApplicationModelRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalAspectLang.g:309:2: ( (lv_model_4_0= RULE_STRING ) )
            // InternalAspectLang.g:310:1: (lv_model_4_0= RULE_STRING )
            {
            // InternalAspectLang.g:310:1: (lv_model_4_0= RULE_STRING )
            // InternalAspectLang.g:311:3: lv_model_4_0= RULE_STRING
            {
            lv_model_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_model_4_0, grammarAccess.getApplicationModelAccess().getModelSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getApplicationModelRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"model",
                      		lv_model_4_0, 
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
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
    // InternalAspectLang.g:335:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAspectLang.g:336:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAspectLang.g:337:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAspectLang.g:344:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:347:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalAspectLang.g:348:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalAspectLang.g:348:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalAspectLang.g:348:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalAspectLang.g:355:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==RULE_ID) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalAspectLang.g:355:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalAspectLang.g:355:2: ( ( '.' )=>kw= '.' )
            	    // InternalAspectLang.g:355:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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
    // InternalAspectLang.g:378:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAspectLang.g:379:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAspectLang.g:380:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalAspectLang.g:387:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:390:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // InternalAspectLang.g:391:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // InternalAspectLang.g:391:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // InternalAspectLang.g:392:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_9);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAspectLang.g:402:1: (kw= '.' kw= '*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAspectLang.g:403:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:422:1: entryRuleAspect returns [EObject current=null] : iv_ruleAspect= ruleAspect EOF ;
    public final EObject entryRuleAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspect = null;


        try {
            // InternalAspectLang.g:423:2: (iv_ruleAspect= ruleAspect EOF )
            // InternalAspectLang.g:424:2: iv_ruleAspect= ruleAspect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAspectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAspect=ruleAspect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAspect; 
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
    // $ANTLR end "entryRuleAspect"


    // $ANTLR start "ruleAspect"
    // InternalAspectLang.g:431:1: ruleAspect returns [EObject current=null] : (otherlv_0= 'aspect' ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (lv_advices_3_0= ruleUtilizeAdvice ) ) (otherlv_4= ',' ( (lv_advices_5_0= ruleUtilizeAdvice ) ) )* ) ;
    public final EObject ruleAspect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_advices_3_0 = null;

        EObject lv_advices_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:434:28: ( (otherlv_0= 'aspect' ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (lv_advices_3_0= ruleUtilizeAdvice ) ) (otherlv_4= ',' ( (lv_advices_5_0= ruleUtilizeAdvice ) ) )* ) )
            // InternalAspectLang.g:435:1: (otherlv_0= 'aspect' ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (lv_advices_3_0= ruleUtilizeAdvice ) ) (otherlv_4= ',' ( (lv_advices_5_0= ruleUtilizeAdvice ) ) )* )
            {
            // InternalAspectLang.g:435:1: (otherlv_0= 'aspect' ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (lv_advices_3_0= ruleUtilizeAdvice ) ) (otherlv_4= ',' ( (lv_advices_5_0= ruleUtilizeAdvice ) ) )* )
            // InternalAspectLang.g:435:3: otherlv_0= 'aspect' ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (lv_advices_3_0= ruleUtilizeAdvice ) ) (otherlv_4= ',' ( (lv_advices_5_0= ruleUtilizeAdvice ) ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAspectAccess().getAspectKeyword_0());
                  
            }
            // InternalAspectLang.g:439:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:440:1: ( ruleQualifiedName )
            {
            // InternalAspectLang.g:440:1: ( ruleQualifiedName )
            // InternalAspectLang.g:441:3: ruleQualifiedName
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
               
              	        newCompositeNode(grammarAccess.getAspectAccess().getPointcutPointcutCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_11);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAspectAccess().getColonKeyword_2());
                  
            }
            // InternalAspectLang.g:461:1: ( (lv_advices_3_0= ruleUtilizeAdvice ) )
            // InternalAspectLang.g:462:1: (lv_advices_3_0= ruleUtilizeAdvice )
            {
            // InternalAspectLang.g:462:1: (lv_advices_3_0= ruleUtilizeAdvice )
            // InternalAspectLang.g:463:3: lv_advices_3_0= ruleUtilizeAdvice
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAspectAccess().getAdvicesUtilizeAdviceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_12);
            lv_advices_3_0=ruleUtilizeAdvice();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAspectRule());
              	        }
                     		add(
                     			current, 
                     			"advices",
                      		lv_advices_3_0, 
                      		"de.cau.cs.se.instrumentation.al.AspectLang.UtilizeAdvice");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAspectLang.g:479:2: (otherlv_4= ',' ( (lv_advices_5_0= ruleUtilizeAdvice ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAspectLang.g:479:4: otherlv_4= ',' ( (lv_advices_5_0= ruleUtilizeAdvice ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getAspectAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalAspectLang.g:483:1: ( (lv_advices_5_0= ruleUtilizeAdvice ) )
            	    // InternalAspectLang.g:484:1: (lv_advices_5_0= ruleUtilizeAdvice )
            	    {
            	    // InternalAspectLang.g:484:1: (lv_advices_5_0= ruleUtilizeAdvice )
            	    // InternalAspectLang.g:485:3: lv_advices_5_0= ruleUtilizeAdvice
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAspectAccess().getAdvicesUtilizeAdviceParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_advices_5_0=ruleUtilizeAdvice();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAspectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"advices",
            	              		lv_advices_5_0, 
            	              		"de.cau.cs.se.instrumentation.al.AspectLang.UtilizeAdvice");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


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
    // $ANTLR end "ruleAspect"


    // $ANTLR start "entryRuleUtilizeAdvice"
    // InternalAspectLang.g:509:1: entryRuleUtilizeAdvice returns [EObject current=null] : iv_ruleUtilizeAdvice= ruleUtilizeAdvice EOF ;
    public final EObject entryRuleUtilizeAdvice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUtilizeAdvice = null;


        try {
            // InternalAspectLang.g:510:2: (iv_ruleUtilizeAdvice= ruleUtilizeAdvice EOF )
            // InternalAspectLang.g:511:2: iv_ruleUtilizeAdvice= ruleUtilizeAdvice EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUtilizeAdviceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUtilizeAdvice=ruleUtilizeAdvice();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUtilizeAdvice; 
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
    // $ANTLR end "entryRuleUtilizeAdvice"


    // $ANTLR start "ruleUtilizeAdvice"
    // InternalAspectLang.g:518:1: ruleUtilizeAdvice returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')' )? ) ;
    public final EObject ruleUtilizeAdvice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameterAssignments_2_0 = null;

        EObject lv_parameterAssignments_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:521:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')' )? ) )
            // InternalAspectLang.g:522:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')' )? )
            {
            // InternalAspectLang.g:522:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')' )? )
            // InternalAspectLang.g:522:2: ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')' )?
            {
            // InternalAspectLang.g:522:2: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:523:1: ( ruleQualifiedName )
            {
            // InternalAspectLang.g:523:1: ( ruleQualifiedName )
            // InternalAspectLang.g:524:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUtilizeAdviceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUtilizeAdviceAccess().getAdviceAdviceCrossReference_0_0()); 
              	    
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

            // InternalAspectLang.g:540:2: (otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAspectLang.g:540:4: otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getUtilizeAdviceAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // InternalAspectLang.g:544:1: ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)||LA8_0==18||(LA8_0>=34 && LA8_0<=37)||(LA8_0>=42 && LA8_0<=44)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalAspectLang.g:544:2: ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )*
                            {
                            // InternalAspectLang.g:544:2: ( (lv_parameterAssignments_2_0= ruleValue ) )
                            // InternalAspectLang.g:545:1: (lv_parameterAssignments_2_0= ruleValue )
                            {
                            // InternalAspectLang.g:545:1: (lv_parameterAssignments_2_0= ruleValue )
                            // InternalAspectLang.g:546:3: lv_parameterAssignments_2_0= ruleValue
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsValueParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_15);
                            lv_parameterAssignments_2_0=ruleValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getUtilizeAdviceRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameterAssignments",
                                      		lv_parameterAssignments_2_0, 
                                      		"de.cau.cs.se.instrumentation.al.AspectLang.Value");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalAspectLang.g:562:2: (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==21) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalAspectLang.g:562:4: otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) )
                            	    {
                            	    otherlv_3=(Token)match(input,21,FOLLOW_16); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getUtilizeAdviceAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // InternalAspectLang.g:566:1: ( (lv_parameterAssignments_4_0= ruleValue ) )
                            	    // InternalAspectLang.g:567:1: (lv_parameterAssignments_4_0= ruleValue )
                            	    {
                            	    // InternalAspectLang.g:567:1: (lv_parameterAssignments_4_0= ruleValue )
                            	    // InternalAspectLang.g:568:3: lv_parameterAssignments_4_0= ruleValue
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsValueParserRuleCall_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_15);
                            	    lv_parameterAssignments_4_0=ruleValue();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getUtilizeAdviceRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameterAssignments",
                            	              		lv_parameterAssignments_4_0, 
                            	              		"de.cau.cs.se.instrumentation.al.AspectLang.Value");
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

                    otherlv_5=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getUtilizeAdviceAccess().getRightParenthesisKeyword_1_2());
                          
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
    // $ANTLR end "ruleUtilizeAdvice"


    // $ANTLR start "entryRuleAdvice"
    // InternalAspectLang.g:596:1: entryRuleAdvice returns [EObject current=null] : iv_ruleAdvice= ruleAdvice EOF ;
    public final EObject entryRuleAdvice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdvice = null;


        try {
            // InternalAspectLang.g:597:2: (iv_ruleAdvice= ruleAdvice EOF )
            // InternalAspectLang.g:598:2: iv_ruleAdvice= ruleAdvice EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdviceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdvice=ruleAdvice();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdvice; 
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
    // $ANTLR end "entryRuleAdvice"


    // $ANTLR start "ruleAdvice"
    // InternalAspectLang.g:605:1: ruleAdvice returns [EObject current=null] : (otherlv_0= 'advice' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_collectors_8_0= ruleCollector ) )* otherlv_9= '}' ) ;
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
            // InternalAspectLang.g:608:28: ( (otherlv_0= 'advice' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_collectors_8_0= ruleCollector ) )* otherlv_9= '}' ) )
            // InternalAspectLang.g:609:1: (otherlv_0= 'advice' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_collectors_8_0= ruleCollector ) )* otherlv_9= '}' )
            {
            // InternalAspectLang.g:609:1: (otherlv_0= 'advice' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_collectors_8_0= ruleCollector ) )* otherlv_9= '}' )
            // InternalAspectLang.g:609:3: otherlv_0= 'advice' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_collectors_8_0= ruleCollector ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAdviceAccess().getAdviceKeyword_0());
                  
            }
            // InternalAspectLang.g:613:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalAspectLang.g:614:1: (lv_name_1_0= RULE_ID )
            {
            // InternalAspectLang.g:614:1: (lv_name_1_0= RULE_ID )
            // InternalAspectLang.g:615:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalAspectLang.g:631:2: (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAspectLang.g:631:4: otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAdviceAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalAspectLang.g:635:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==27) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalAspectLang.g:635:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            {
                            // InternalAspectLang.g:635:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                            // InternalAspectLang.g:636:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            {
                            // InternalAspectLang.g:636:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            // InternalAspectLang.g:637:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAdviceAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_15);
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
                                      		"de.cau.cs.se.instrumentation.al.AspectLang.ParameterDeclaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalAspectLang.g:653:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==21) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalAspectLang.g:653:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    {
                            	    otherlv_4=(Token)match(input,21,FOLLOW_19); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getAdviceAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // InternalAspectLang.g:657:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    // InternalAspectLang.g:658:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    {
                            	    // InternalAspectLang.g:658:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    // InternalAspectLang.g:659:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getAdviceAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_15);
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
                            	              		"de.cau.cs.se.instrumentation.al.AspectLang.ParameterDeclaration");
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
                            break;

                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAdviceAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getAdviceAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalAspectLang.g:683:1: ( (lv_collectors_8_0= ruleCollector ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=49 && LA13_0<=50)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAspectLang.g:684:1: (lv_collectors_8_0= ruleCollector )
            	    {
            	    // InternalAspectLang.g:684:1: (lv_collectors_8_0= ruleCollector )
            	    // InternalAspectLang.g:685:3: lv_collectors_8_0= ruleCollector
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdviceAccess().getCollectorsCollectorParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_21);
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
            	              		"de.cau.cs.se.instrumentation.al.AspectLang.Collector");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_9=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:713:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // InternalAspectLang.g:714:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // InternalAspectLang.g:715:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclaration; 
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
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // InternalAspectLang.g:722:1: ruleParameterDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= 'type' ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:725:28: ( ( ( (lv_type_0_0= 'type' ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAspectLang.g:726:1: ( ( (lv_type_0_0= 'type' ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAspectLang.g:726:1: ( ( (lv_type_0_0= 'type' ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAspectLang.g:726:2: ( (lv_type_0_0= 'type' ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalAspectLang.g:726:2: ( (lv_type_0_0= 'type' ) )
            // InternalAspectLang.g:727:1: (lv_type_0_0= 'type' )
            {
            // InternalAspectLang.g:727:1: (lv_type_0_0= 'type' )
            // InternalAspectLang.g:728:3: lv_type_0_0= 'type'
            {
            lv_type_0_0=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
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

            // InternalAspectLang.g:741:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalAspectLang.g:742:1: (lv_name_1_0= RULE_ID )
            {
            // InternalAspectLang.g:742:1: (lv_name_1_0= RULE_ID )
            // InternalAspectLang.g:743:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
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
    // InternalAspectLang.g:767:1: entryRulePointcut returns [EObject current=null] : iv_rulePointcut= rulePointcut EOF ;
    public final EObject entryRulePointcut() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointcut = null;


        try {
            // InternalAspectLang.g:768:2: (iv_rulePointcut= rulePointcut EOF )
            // InternalAspectLang.g:769:2: iv_rulePointcut= rulePointcut EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointcutRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePointcut=rulePointcut();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePointcut; 
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
    // $ANTLR end "entryRulePointcut"


    // $ANTLR start "rulePointcut"
    // InternalAspectLang.g:776:1: rulePointcut returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'class' ( (lv_location_4_0= ruleLocationQuery ) ) (otherlv_5= 'operation' ( (lv_method_6_0= ruleMethodQuery ) ) )? ) ;
    public final EObject rulePointcut() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_location_4_0 = null;

        EObject lv_method_6_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:779:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'class' ( (lv_location_4_0= ruleLocationQuery ) ) (otherlv_5= 'operation' ( (lv_method_6_0= ruleMethodQuery ) ) )? ) )
            // InternalAspectLang.g:780:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'class' ( (lv_location_4_0= ruleLocationQuery ) ) (otherlv_5= 'operation' ( (lv_method_6_0= ruleMethodQuery ) ) )? )
            {
            // InternalAspectLang.g:780:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'class' ( (lv_location_4_0= ruleLocationQuery ) ) (otherlv_5= 'operation' ( (lv_method_6_0= ruleMethodQuery ) ) )? )
            // InternalAspectLang.g:780:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'class' ( (lv_location_4_0= ruleLocationQuery ) ) (otherlv_5= 'operation' ( (lv_method_6_0= ruleMethodQuery ) ) )?
            {
            // InternalAspectLang.g:780:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAspectLang.g:781:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // InternalAspectLang.g:781:1: (lv_annotation_0_0= ruleAnnotation )
                    // InternalAspectLang.g:782:3: lv_annotation_0_0= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPointcutAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_22);
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
                              		"de.cau.cs.se.instrumentation.al.AspectLang.Annotation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPointcutAccess().getPointcutKeyword_1());
                  
            }
            // InternalAspectLang.g:802:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalAspectLang.g:803:1: (lv_name_2_0= RULE_ID )
            {
            // InternalAspectLang.g:803:1: (lv_name_2_0= RULE_ID )
            // InternalAspectLang.g:804:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPointcutAccess().getClassKeyword_3());
                  
            }
            // InternalAspectLang.g:824:1: ( (lv_location_4_0= ruleLocationQuery ) )
            // InternalAspectLang.g:825:1: (lv_location_4_0= ruleLocationQuery )
            {
            // InternalAspectLang.g:825:1: (lv_location_4_0= ruleLocationQuery )
            // InternalAspectLang.g:826:3: lv_location_4_0= ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPointcutAccess().getLocationLocationQueryParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_25);
            lv_location_4_0=ruleLocationQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPointcutRule());
              	        }
                     		set(
                     			current, 
                     			"location",
                      		lv_location_4_0, 
                      		"de.cau.cs.se.instrumentation.al.AspectLang.LocationQuery");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAspectLang.g:842:2: (otherlv_5= 'operation' ( (lv_method_6_0= ruleMethodQuery ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAspectLang.g:842:4: otherlv_5= 'operation' ( (lv_method_6_0= ruleMethodQuery ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPointcutAccess().getOperationKeyword_5_0());
                          
                    }
                    // InternalAspectLang.g:846:1: ( (lv_method_6_0= ruleMethodQuery ) )
                    // InternalAspectLang.g:847:1: (lv_method_6_0= ruleMethodQuery )
                    {
                    // InternalAspectLang.g:847:1: (lv_method_6_0= ruleMethodQuery )
                    // InternalAspectLang.g:848:3: lv_method_6_0= ruleMethodQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPointcutAccess().getMethodMethodQueryParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_method_6_0=ruleMethodQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPointcutRule());
                      	        }
                             		set(
                             			current, 
                             			"method",
                              		lv_method_6_0, 
                              		"de.cau.cs.se.instrumentation.al.AspectLang.MethodQuery");
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
    // $ANTLR end "rulePointcut"


    // $ANTLR start "entryRuleAnnotation"
    // InternalAspectLang.g:872:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalAspectLang.g:873:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalAspectLang.g:874:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalAspectLang.g:881:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:884:28: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalAspectLang.g:885:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalAspectLang.g:885:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalAspectLang.g:885:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalAspectLang.g:889:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalAspectLang.g:890:1: (lv_name_1_0= RULE_ID )
            {
            // InternalAspectLang.g:890:1: (lv_name_1_0= RULE_ID )
            // InternalAspectLang.g:891:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalAspectLang.g:907:2: ( (lv_value_2_0= RULE_STRING ) )
            // InternalAspectLang.g:908:1: (lv_value_2_0= RULE_STRING )
            {
            // InternalAspectLang.g:908:1: (lv_value_2_0= RULE_STRING )
            // InternalAspectLang.g:909:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleMethodQuery"
    // InternalAspectLang.g:933:1: entryRuleMethodQuery returns [EObject current=null] : iv_ruleMethodQuery= ruleMethodQuery EOF ;
    public final EObject entryRuleMethodQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodQuery = null;


        try {
            // InternalAspectLang.g:934:2: (iv_ruleMethodQuery= ruleMethodQuery EOF )
            // InternalAspectLang.g:935:2: iv_ruleMethodQuery= ruleMethodQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodQuery=ruleMethodQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodQuery; 
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
    // $ANTLR end "entryRuleMethodQuery"


    // $ANTLR start "ruleMethodQuery"
    // InternalAspectLang.g:942:1: ruleMethodQuery returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) )? ( (otherlv_2= RULE_ID ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' ) ) ;
    public final EObject ruleMethodQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_parameterQueries_5_0 = null;

        EObject lv_parameterQueries_7_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:945:28: ( ( () ( (otherlv_1= RULE_ID ) )? ( (otherlv_2= RULE_ID ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' ) ) )
            // InternalAspectLang.g:946:1: ( () ( (otherlv_1= RULE_ID ) )? ( (otherlv_2= RULE_ID ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' ) )
            {
            // InternalAspectLang.g:946:1: ( () ( (otherlv_1= RULE_ID ) )? ( (otherlv_2= RULE_ID ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' ) )
            // InternalAspectLang.g:946:2: () ( (otherlv_1= RULE_ID ) )? ( (otherlv_2= RULE_ID ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' )
            {
            // InternalAspectLang.g:946:2: ()
            // InternalAspectLang.g:947:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMethodQueryAccess().getMethodQueryAction_0(),
                          current);
                  
            }

            }

            // InternalAspectLang.g:955:2: ( (otherlv_1= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred19_InternalAspectLang()) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalAspectLang.g:956:1: (otherlv_1= RULE_ID )
                    {
                    // InternalAspectLang.g:956:1: (otherlv_1= RULE_ID )
                    // InternalAspectLang.g:957:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMethodQueryRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getMethodQueryAccess().getModifierMethodModifierCrossReference_1_0()); 
                      	
                    }

                    }


                    }
                    break;

            }

            // InternalAspectLang.g:971:3: ( (otherlv_2= RULE_ID ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_ID||LA17_1==18) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalAspectLang.g:972:1: (otherlv_2= RULE_ID )
                    {
                    // InternalAspectLang.g:972:1: (otherlv_2= RULE_ID )
                    // InternalAspectLang.g:973:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMethodQueryRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getMethodQueryAccess().getReturnTypeTypeCrossReference_2_0()); 
                      	
                    }

                    }


                    }
                    break;

            }

            // InternalAspectLang.g:987:3: ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==18) ) {
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
                    // InternalAspectLang.g:987:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? )
                    {
                    // InternalAspectLang.g:987:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? )
                    // InternalAspectLang.g:987:5: ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )?
                    {
                    // InternalAspectLang.g:987:5: ( (otherlv_3= RULE_ID ) )
                    // InternalAspectLang.g:988:1: (otherlv_3= RULE_ID )
                    {
                    // InternalAspectLang.g:988:1: (otherlv_3= RULE_ID )
                    // InternalAspectLang.g:989:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMethodQueryRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getMethodQueryAccess().getMethodReferenceMethodCrossReference_3_0_0_0()); 
                      	
                    }

                    }


                    }

                    // InternalAspectLang.g:1003:2: (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==22) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalAspectLang.g:1003:4: otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')'
                            {
                            otherlv_4=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getMethodQueryAccess().getLeftParenthesisKeyword_3_0_1_0());
                                  
                            }
                            // InternalAspectLang.g:1007:1: ( (lv_parameterQueries_5_0= ruleParameterQuery ) )
                            // InternalAspectLang.g:1008:1: (lv_parameterQueries_5_0= ruleParameterQuery )
                            {
                            // InternalAspectLang.g:1008:1: (lv_parameterQueries_5_0= ruleParameterQuery )
                            // InternalAspectLang.g:1009:3: lv_parameterQueries_5_0= ruleParameterQuery
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMethodQueryAccess().getParameterQueriesParameterQueryParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_15);
                            lv_parameterQueries_5_0=ruleParameterQuery();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getMethodQueryRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameterQueries",
                                      		lv_parameterQueries_5_0, 
                                      		"de.cau.cs.se.instrumentation.al.AspectLang.ParameterQuery");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalAspectLang.g:1025:2: (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==21) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // InternalAspectLang.g:1025:4: otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) )
                            	    {
                            	    otherlv_6=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_6, grammarAccess.getMethodQueryAccess().getCommaKeyword_3_0_1_2_0());
                            	          
                            	    }
                            	    // InternalAspectLang.g:1029:1: ( (lv_parameterQueries_7_0= ruleParameterQuery ) )
                            	    // InternalAspectLang.g:1030:1: (lv_parameterQueries_7_0= ruleParameterQuery )
                            	    {
                            	    // InternalAspectLang.g:1030:1: (lv_parameterQueries_7_0= ruleParameterQuery )
                            	    // InternalAspectLang.g:1031:3: lv_parameterQueries_7_0= ruleParameterQuery
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getMethodQueryAccess().getParameterQueriesParameterQueryParserRuleCall_3_0_1_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_15);
                            	    lv_parameterQueries_7_0=ruleParameterQuery();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getMethodQueryRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameterQueries",
                            	              		lv_parameterQueries_7_0, 
                            	              		"de.cau.cs.se.instrumentation.al.AspectLang.ParameterQuery");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);

                            otherlv_8=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getMethodQueryAccess().getRightParenthesisKeyword_3_0_1_3());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1052:7: otherlv_9= '*'
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getMethodQueryAccess().getAsteriskKeyword_3_1());
                          
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
    // $ANTLR end "ruleMethodQuery"


    // $ANTLR start "entryRuleParameterQuery"
    // InternalAspectLang.g:1064:1: entryRuleParameterQuery returns [EObject current=null] : iv_ruleParameterQuery= ruleParameterQuery EOF ;
    public final EObject entryRuleParameterQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterQuery = null;


        try {
            // InternalAspectLang.g:1065:2: (iv_ruleParameterQuery= ruleParameterQuery EOF )
            // InternalAspectLang.g:1066:2: iv_ruleParameterQuery= ruleParameterQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterQuery=ruleParameterQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterQuery; 
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
    // $ANTLR end "entryRuleParameterQuery"


    // $ANTLR start "ruleParameterQuery"
    // InternalAspectLang.g:1073:1: ruleParameterQuery returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) )? ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ) ;
    public final EObject ruleParameterQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1076:28: ( ( ( (otherlv_0= RULE_ID ) )? ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ) )
            // InternalAspectLang.g:1077:1: ( ( (otherlv_0= RULE_ID ) )? ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? )
            {
            // InternalAspectLang.g:1077:1: ( ( (otherlv_0= RULE_ID ) )? ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? )
            // InternalAspectLang.g:1077:2: ( (otherlv_0= RULE_ID ) )? ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )?
            {
            // InternalAspectLang.g:1077:2: ( (otherlv_0= RULE_ID ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RULE_ID) ) {
                    int LA21_2 = input.LA(3);

                    if ( (synpred24_InternalAspectLang()) ) {
                        alt21=1;
                    }
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalAspectLang.g:1078:1: (otherlv_0= RULE_ID )
                    {
                    // InternalAspectLang.g:1078:1: (otherlv_0= RULE_ID )
                    // InternalAspectLang.g:1079:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterQueryRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getParameterQueryAccess().getModifierParameterModifierCrossReference_0_0()); 
                      	
                    }

                    }


                    }
                    break;

            }

            // InternalAspectLang.g:1093:3: ( (otherlv_1= RULE_ID ) )
            // InternalAspectLang.g:1094:1: (otherlv_1= RULE_ID )
            {
            // InternalAspectLang.g:1094:1: (otherlv_1= RULE_ID )
            // InternalAspectLang.g:1095:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterQueryRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getParameterQueryAccess().getTypeTypeCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalAspectLang.g:1109:2: ( (otherlv_2= RULE_ID ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAspectLang.g:1110:1: (otherlv_2= RULE_ID )
                    {
                    // InternalAspectLang.g:1110:1: (otherlv_2= RULE_ID )
                    // InternalAspectLang.g:1111:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterQueryRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getParameterQueryAccess().getParameterParameterCrossReference_2_0()); 
                      	
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
    // $ANTLR end "ruleParameterQuery"


    // $ANTLR start "entryRuleLocationQuery"
    // InternalAspectLang.g:1133:1: entryRuleLocationQuery returns [EObject current=null] : iv_ruleLocationQuery= ruleLocationQuery EOF ;
    public final EObject entryRuleLocationQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationQuery = null;


        try {
            // InternalAspectLang.g:1134:2: (iv_ruleLocationQuery= ruleLocationQuery EOF )
            // InternalAspectLang.g:1135:2: iv_ruleLocationQuery= ruleLocationQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocationQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocationQuery=ruleLocationQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocationQuery; 
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
    // $ANTLR end "entryRuleLocationQuery"


    // $ANTLR start "ruleLocationQuery"
    // InternalAspectLang.g:1142:1: ruleLocationQuery returns [EObject current=null] : ( ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )? ) ;
    public final EObject ruleLocationQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_node_0_0 = null;

        EObject lv_specialization_2_0 = null;

        EObject lv_composition_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1145:28: ( ( ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )? ) )
            // InternalAspectLang.g:1146:1: ( ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )? )
            {
            // InternalAspectLang.g:1146:1: ( ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )? )
            // InternalAspectLang.g:1146:2: ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )?
            {
            // InternalAspectLang.g:1146:2: ( (lv_node_0_0= ruleNode ) )
            // InternalAspectLang.g:1147:1: (lv_node_0_0= ruleNode )
            {
            // InternalAspectLang.g:1147:1: (lv_node_0_0= ruleNode )
            // InternalAspectLang.g:1148:3: lv_node_0_0= ruleNode
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationQueryAccess().getNodeNodeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_28);
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
                      		"de.cau.cs.se.instrumentation.al.AspectLang.Node");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAspectLang.g:1164:2: ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            else if ( (LA23_0==25||(LA23_0>=38 && LA23_0<=39)) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // InternalAspectLang.g:1164:3: (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )
                    {
                    // InternalAspectLang.g:1164:3: (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )
                    // InternalAspectLang.g:1164:5: otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLocationQueryAccess().getFullStopKeyword_1_0_0());
                          
                    }
                    // InternalAspectLang.g:1168:1: ( (lv_specialization_2_0= ruleLocationQuery ) )
                    // InternalAspectLang.g:1169:1: (lv_specialization_2_0= ruleLocationQuery )
                    {
                    // InternalAspectLang.g:1169:1: (lv_specialization_2_0= ruleLocationQuery )
                    // InternalAspectLang.g:1170:3: lv_specialization_2_0= ruleLocationQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocationQueryAccess().getSpecializationLocationQueryParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"de.cau.cs.se.instrumentation.al.AspectLang.LocationQuery");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1187:6: ( (lv_composition_3_0= ruleCompositionQuery ) )
                    {
                    // InternalAspectLang.g:1187:6: ( (lv_composition_3_0= ruleCompositionQuery ) )
                    // InternalAspectLang.g:1188:1: (lv_composition_3_0= ruleCompositionQuery )
                    {
                    // InternalAspectLang.g:1188:1: (lv_composition_3_0= ruleCompositionQuery )
                    // InternalAspectLang.g:1189:3: lv_composition_3_0= ruleCompositionQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocationQueryAccess().getCompositionCompositionQueryParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"de.cau.cs.se.instrumentation.al.AspectLang.CompositionQuery");
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
    // InternalAspectLang.g:1213:1: entryRuleCompositionQuery returns [EObject current=null] : iv_ruleCompositionQuery= ruleCompositionQuery EOF ;
    public final EObject entryRuleCompositionQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionQuery = null;


        try {
            // InternalAspectLang.g:1214:2: (iv_ruleCompositionQuery= ruleCompositionQuery EOF )
            // InternalAspectLang.g:1215:2: iv_ruleCompositionQuery= ruleCompositionQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositionQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompositionQuery=ruleCompositionQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositionQuery; 
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
    // $ANTLR end "entryRuleCompositionQuery"


    // $ANTLR start "ruleCompositionQuery"
    // InternalAspectLang.g:1222:1: ruleCompositionQuery returns [EObject current=null] : ( () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}' ) ;
    public final EObject ruleCompositionQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_modifier_1_0 = null;

        EObject lv_subQueries_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1225:28: ( ( () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}' ) )
            // InternalAspectLang.g:1226:1: ( () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}' )
            {
            // InternalAspectLang.g:1226:1: ( () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}' )
            // InternalAspectLang.g:1226:2: () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}'
            {
            // InternalAspectLang.g:1226:2: ()
            // InternalAspectLang.g:1227:2: 
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

            // InternalAspectLang.g:1235:2: ( (lv_modifier_1_0= ruleQueryModifier ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=38 && LA24_0<=39)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAspectLang.g:1236:1: (lv_modifier_1_0= ruleQueryModifier )
                    {
                    // InternalAspectLang.g:1236:1: (lv_modifier_1_0= ruleQueryModifier )
                    // InternalAspectLang.g:1237:3: lv_modifier_1_0= ruleQueryModifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositionQueryAccess().getModifierQueryModifierEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_20);
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
                              		"de.cau.cs.se.instrumentation.al.AspectLang.QueryModifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,25,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompositionQueryAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalAspectLang.g:1257:1: ( (lv_subQueries_3_0= ruleLocationQuery ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==18||(LA25_0>=36 && LA25_0<=37)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAspectLang.g:1258:1: (lv_subQueries_3_0= ruleLocationQuery )
            	    {
            	    // InternalAspectLang.g:1258:1: (lv_subQueries_3_0= ruleLocationQuery )
            	    // InternalAspectLang.g:1259:3: lv_subQueries_3_0= ruleLocationQuery
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompositionQueryAccess().getSubQueriesLocationQueryParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_29);
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
            	              		"de.cau.cs.se.instrumentation.al.AspectLang.LocationQuery");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:1287:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalAspectLang.g:1288:2: (iv_ruleNode= ruleNode EOF )
            // InternalAspectLang.g:1289:2: iv_ruleNode= ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalAspectLang.g:1296:1: ruleNode returns [EObject current=null] : ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) ( (lv_parameter_4_0= ruleParamQuery ) )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_SubPathNode_0 = null;

        EObject this_WildcardNode_1 = null;

        EObject this_ParentNode_2 = null;

        EObject this_ContainerNode_3 = null;

        EObject lv_parameter_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1299:28: ( ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) ( (lv_parameter_4_0= ruleParamQuery ) )? ) )
            // InternalAspectLang.g:1300:1: ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) ( (lv_parameter_4_0= ruleParamQuery ) )? )
            {
            // InternalAspectLang.g:1300:1: ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) ( (lv_parameter_4_0= ruleParamQuery ) )? )
            // InternalAspectLang.g:1300:2: (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) ( (lv_parameter_4_0= ruleParamQuery ) )?
            {
            // InternalAspectLang.g:1300:2: (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt26=1;
                }
                break;
            case 18:
                {
                alt26=2;
                }
                break;
            case 37:
                {
                alt26=3;
                }
                break;
            case RULE_ID:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalAspectLang.g:1301:2: this_SubPathNode_0= ruleSubPathNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getSubPathNodeParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_30);
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
                    // InternalAspectLang.g:1314:2: this_WildcardNode_1= ruleWildcardNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getWildcardNodeParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_30);
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
                    // InternalAspectLang.g:1327:2: this_ParentNode_2= ruleParentNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getParentNodeParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_30);
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
                    // InternalAspectLang.g:1340:2: this_ContainerNode_3= ruleContainerNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getContainerNodeParserRuleCall_0_3()); 
                          
                    }
                    pushFollow(FOLLOW_30);
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

            // InternalAspectLang.g:1351:2: ( (lv_parameter_4_0= ruleParamQuery ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAspectLang.g:1352:1: (lv_parameter_4_0= ruleParamQuery )
                    {
                    // InternalAspectLang.g:1352:1: (lv_parameter_4_0= ruleParamQuery )
                    // InternalAspectLang.g:1353:3: lv_parameter_4_0= ruleParamQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeAccess().getParameterParamQueryParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"de.cau.cs.se.instrumentation.al.AspectLang.ParamQuery");
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
    // InternalAspectLang.g:1377:1: entryRuleParamQuery returns [EObject current=null] : iv_ruleParamQuery= ruleParamQuery EOF ;
    public final EObject entryRuleParamQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamQuery = null;


        try {
            // InternalAspectLang.g:1378:2: (iv_ruleParamQuery= ruleParamQuery EOF )
            // InternalAspectLang.g:1379:2: iv_ruleParamQuery= ruleParamQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParamQuery=ruleParamQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParamQuery; 
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
    // $ANTLR end "entryRuleParamQuery"


    // $ANTLR start "ruleParamQuery"
    // InternalAspectLang.g:1386:1: ruleParamQuery returns [EObject current=null] : (otherlv_0= '[' ( (lv_queries_1_0= ruleParamOperator ) )+ otherlv_2= ']' ) ;
    public final EObject ruleParamQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_queries_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1389:28: ( (otherlv_0= '[' ( (lv_queries_1_0= ruleParamOperator ) )+ otherlv_2= ']' ) )
            // InternalAspectLang.g:1390:1: (otherlv_0= '[' ( (lv_queries_1_0= ruleParamOperator ) )+ otherlv_2= ']' )
            {
            // InternalAspectLang.g:1390:1: (otherlv_0= '[' ( (lv_queries_1_0= ruleParamOperator ) )+ otherlv_2= ']' )
            // InternalAspectLang.g:1390:3: otherlv_0= '[' ( (lv_queries_1_0= ruleParamOperator ) )+ otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParamQueryAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // InternalAspectLang.g:1394:1: ( (lv_queries_1_0= ruleParamOperator ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_INT)||LA28_0==18||(LA28_0>=34 && LA28_0<=37)||(LA28_0>=42 && LA28_0<=44)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAspectLang.g:1395:1: (lv_queries_1_0= ruleParamOperator )
            	    {
            	    // InternalAspectLang.g:1395:1: (lv_queries_1_0= ruleParamOperator )
            	    // InternalAspectLang.g:1396:3: lv_queries_1_0= ruleParamOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParamQueryAccess().getQueriesParamOperatorParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_queries_1_0=ruleParamOperator();

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
            	              		"de.cau.cs.se.instrumentation.al.AspectLang.ParamOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            otherlv_2=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleParamOperator"
    // InternalAspectLang.g:1424:1: entryRuleParamOperator returns [EObject current=null] : iv_ruleParamOperator= ruleParamOperator EOF ;
    public final EObject entryRuleParamOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamOperator = null;


        try {
            // InternalAspectLang.g:1425:2: (iv_ruleParamOperator= ruleParamOperator EOF )
            // InternalAspectLang.g:1426:2: iv_ruleParamOperator= ruleParamOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParamOperator=ruleParamOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParamOperator; 
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
    // $ANTLR end "entryRuleParamOperator"


    // $ANTLR start "ruleParamOperator"
    // InternalAspectLang.g:1433:1: ruleParamOperator returns [EObject current=null] : (this_ParamCompare_0= ruleParamCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleParamCompare ) ) )? ) ;
    public final EObject ruleParamOperator() throws RecognitionException {
        EObject current = null;

        EObject this_ParamCompare_0 = null;

        Enumerator lv_logic_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1436:28: ( (this_ParamCompare_0= ruleParamCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleParamCompare ) ) )? ) )
            // InternalAspectLang.g:1437:1: (this_ParamCompare_0= ruleParamCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleParamCompare ) ) )? )
            {
            // InternalAspectLang.g:1437:1: (this_ParamCompare_0= ruleParamCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleParamCompare ) ) )? )
            // InternalAspectLang.g:1438:2: this_ParamCompare_0= ruleParamCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleParamCompare ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParamOperatorAccess().getParamCompareParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_32);
            this_ParamCompare_0=ruleParamCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ParamCompare_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAspectLang.g:1449:1: ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleParamCompare ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=40 && LA29_0<=41)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAspectLang.g:1449:2: () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleParamCompare ) )
                    {
                    // InternalAspectLang.g:1449:2: ()
                    // InternalAspectLang.g:1450:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getParamOperatorAccess().getParamExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalAspectLang.g:1458:2: ( (lv_logic_2_0= ruleLogicOperator ) )
                    // InternalAspectLang.g:1459:1: (lv_logic_2_0= ruleLogicOperator )
                    {
                    // InternalAspectLang.g:1459:1: (lv_logic_2_0= ruleLogicOperator )
                    // InternalAspectLang.g:1460:3: lv_logic_2_0= ruleLogicOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParamOperatorAccess().getLogicLogicOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
                    lv_logic_2_0=ruleLogicOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParamOperatorRule());
                      	        }
                             		set(
                             			current, 
                             			"logic",
                              		lv_logic_2_0, 
                              		"de.cau.cs.se.instrumentation.al.AspectLang.LogicOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAspectLang.g:1476:2: ( (lv_right_3_0= ruleParamCompare ) )
                    // InternalAspectLang.g:1477:1: (lv_right_3_0= ruleParamCompare )
                    {
                    // InternalAspectLang.g:1477:1: (lv_right_3_0= ruleParamCompare )
                    // InternalAspectLang.g:1478:3: lv_right_3_0= ruleParamCompare
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParamOperatorAccess().getRightParamCompareParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleParamCompare();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParamOperatorRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"de.cau.cs.se.instrumentation.al.AspectLang.ParamCompare");
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
    // $ANTLR end "ruleParamOperator"


    // $ANTLR start "entryRuleParamCompare"
    // InternalAspectLang.g:1502:1: entryRuleParamCompare returns [EObject current=null] : iv_ruleParamCompare= ruleParamCompare EOF ;
    public final EObject entryRuleParamCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamCompare = null;


        try {
            // InternalAspectLang.g:1503:2: (iv_ruleParamCompare= ruleParamCompare EOF )
            // InternalAspectLang.g:1504:2: iv_ruleParamCompare= ruleParamCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamCompareRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParamCompare=ruleParamCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParamCompare; 
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
    // $ANTLR end "entryRuleParamCompare"


    // $ANTLR start "ruleParamCompare"
    // InternalAspectLang.g:1511:1: ruleParamCompare returns [EObject current=null] : (this_Value_0= ruleValue ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleValue ) ) )? ) ;
    public final EObject ruleParamCompare() throws RecognitionException {
        EObject current = null;

        EObject this_Value_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1514:28: ( (this_Value_0= ruleValue ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleValue ) ) )? ) )
            // InternalAspectLang.g:1515:1: (this_Value_0= ruleValue ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleValue ) ) )? )
            {
            // InternalAspectLang.g:1515:1: (this_Value_0= ruleValue ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleValue ) ) )? )
            // InternalAspectLang.g:1516:2: this_Value_0= ruleValue ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleValue ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParamCompareAccess().getValueParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_32);
            this_Value_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Value_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAspectLang.g:1527:1: ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleValue ) ) )?
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalAspectLang.g:1527:2: () ( (lv_operator_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleValue ) )
                    {
                    // InternalAspectLang.g:1527:2: ()
                    // InternalAspectLang.g:1528:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getParamCompareAccess().getParamExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalAspectLang.g:1536:2: ( (lv_operator_2_0= ruleLogicOperator ) )
                    // InternalAspectLang.g:1537:1: (lv_operator_2_0= ruleLogicOperator )
                    {
                    // InternalAspectLang.g:1537:1: (lv_operator_2_0= ruleLogicOperator )
                    // InternalAspectLang.g:1538:3: lv_operator_2_0= ruleLogicOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParamCompareAccess().getOperatorLogicOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
                    lv_operator_2_0=ruleLogicOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParamCompareRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.se.instrumentation.al.AspectLang.LogicOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAspectLang.g:1554:2: ( (lv_right_3_0= ruleValue ) )
                    // InternalAspectLang.g:1555:1: (lv_right_3_0= ruleValue )
                    {
                    // InternalAspectLang.g:1555:1: (lv_right_3_0= ruleValue )
                    // InternalAspectLang.g:1556:3: lv_right_3_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParamCompareAccess().getRightValueParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParamCompareRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"de.cau.cs.se.instrumentation.al.AspectLang.Value");
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
    // $ANTLR end "ruleParamCompare"


    // $ANTLR start "entryRuleValue"
    // InternalAspectLang.g:1580:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalAspectLang.g:1581:2: (iv_ruleValue= ruleValue EOF )
            // InternalAspectLang.g:1582:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalAspectLang.g:1589:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_FloatValue_2= ruleFloatValue | this_ReferenceValue_3= ruleReferenceValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntValue_1 = null;

        EObject this_FloatValue_2 = null;

        EObject this_ReferenceValue_3 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1592:28: ( (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_FloatValue_2= ruleFloatValue | this_ReferenceValue_3= ruleReferenceValue ) )
            // InternalAspectLang.g:1593:1: (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_FloatValue_2= ruleFloatValue | this_ReferenceValue_3= ruleReferenceValue )
            {
            // InternalAspectLang.g:1593:1: (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_FloatValue_2= ruleFloatValue | this_ReferenceValue_3= ruleReferenceValue )
            int alt31=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt31=1;
                }
                break;
            case RULE_INT:
                {
                alt31=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt31=3;
                }
                break;
            case RULE_ID:
            case 18:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 44:
                {
                alt31=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalAspectLang.g:1594:2: this_StringValue_0= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAspectLang.g:1607:2: this_IntValue_1= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAspectLang.g:1620:2: this_FloatValue_2= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getFloatValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAspectLang.g:1633:2: this_ReferenceValue_3= ruleReferenceValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getReferenceValueParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1652:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalAspectLang.g:1653:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalAspectLang.g:1654:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
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
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalAspectLang.g:1661:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1664:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalAspectLang.g:1665:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalAspectLang.g:1665:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalAspectLang.g:1666:1: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalAspectLang.g:1666:1: (lv_value_0_0= RULE_FLOAT )
            // InternalAspectLang.g:1667:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return current;
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
                      		"de.cau.cs.se.instrumentation.al.AspectLang.FLOAT");
              	    
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
    // InternalAspectLang.g:1691:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalAspectLang.g:1692:2: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalAspectLang.g:1693:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalAspectLang.g:1700:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1703:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAspectLang.g:1704:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAspectLang.g:1704:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalAspectLang.g:1705:1: (lv_value_0_0= RULE_INT )
            {
            // InternalAspectLang.g:1705:1: (lv_value_0_0= RULE_INT )
            // InternalAspectLang.g:1706:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
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
                      		"de.cau.cs.se.instrumentation.al.AspectLang.INT");
              	    
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
    // InternalAspectLang.g:1730:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalAspectLang.g:1731:2: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalAspectLang.g:1732:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalAspectLang.g:1739:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1742:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalAspectLang.g:1743:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalAspectLang.g:1743:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalAspectLang.g:1744:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalAspectLang.g:1744:1: (lv_value_0_0= RULE_STRING )
            // InternalAspectLang.g:1745:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleReferenceValue"
    // InternalAspectLang.g:1769:1: entryRuleReferenceValue returns [EObject current=null] : iv_ruleReferenceValue= ruleReferenceValue EOF ;
    public final EObject entryRuleReferenceValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceValue = null;


        try {
            // InternalAspectLang.g:1770:2: (iv_ruleReferenceValue= ruleReferenceValue EOF )
            // InternalAspectLang.g:1771:2: iv_ruleReferenceValue= ruleReferenceValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReferenceValue=ruleReferenceValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceValue; 
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
    // $ANTLR end "entryRuleReferenceValue"


    // $ANTLR start "ruleReferenceValue"
    // InternalAspectLang.g:1778:1: ruleReferenceValue returns [EObject current=null] : ( ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_parameter_1_0= ruleParameter ) ) ) ;
    public final EObject ruleReferenceValue() throws RecognitionException {
        EObject current = null;

        EObject lv_query_0_0 = null;

        EObject lv_parameter_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1781:28: ( ( ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_parameter_1_0= ruleParameter ) ) ) )
            // InternalAspectLang.g:1782:1: ( ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_parameter_1_0= ruleParameter ) ) )
            {
            // InternalAspectLang.g:1782:1: ( ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_parameter_1_0= ruleParameter ) ) )
            // InternalAspectLang.g:1782:2: ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_parameter_1_0= ruleParameter ) )
            {
            // InternalAspectLang.g:1782:2: ( (lv_query_0_0= ruleLocationQuery ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||LA32_0==18||(LA32_0>=36 && LA32_0<=37)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAspectLang.g:1783:1: (lv_query_0_0= ruleLocationQuery )
                    {
                    // InternalAspectLang.g:1783:1: (lv_query_0_0= ruleLocationQuery )
                    // InternalAspectLang.g:1784:3: lv_query_0_0= ruleLocationQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceValueAccess().getQueryLocationQueryParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
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
                              		"de.cau.cs.se.instrumentation.al.AspectLang.LocationQuery");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalAspectLang.g:1800:3: ( (lv_parameter_1_0= ruleParameter ) )
            // InternalAspectLang.g:1801:1: (lv_parameter_1_0= ruleParameter )
            {
            // InternalAspectLang.g:1801:1: (lv_parameter_1_0= ruleParameter )
            // InternalAspectLang.g:1802:3: lv_parameter_1_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceValueAccess().getParameterParameterParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"de.cau.cs.se.instrumentation.al.AspectLang.Parameter");
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
    // InternalAspectLang.g:1826:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalAspectLang.g:1827:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalAspectLang.g:1828:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalAspectLang.g:1835:1: ruleParameter returns [EObject current=null] : (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty | this_InternalFunctionProperty_2= ruleInternalFunctionProperty ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_RuntimeProperty_0 = null;

        EObject this_ReflectionProperty_1 = null;

        EObject this_InternalFunctionProperty_2 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1838:28: ( (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty | this_InternalFunctionProperty_2= ruleInternalFunctionProperty ) )
            // InternalAspectLang.g:1839:1: (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty | this_InternalFunctionProperty_2= ruleInternalFunctionProperty )
            {
            // InternalAspectLang.g:1839:1: (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty | this_InternalFunctionProperty_2= ruleInternalFunctionProperty )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt33=1;
                }
                break;
            case 35:
                {
                alt33=2;
                }
                break;
            case 42:
            case 43:
            case 44:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalAspectLang.g:1840:2: this_RuntimeProperty_0= ruleRuntimeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getRuntimePropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAspectLang.g:1853:2: this_ReflectionProperty_1= ruleReflectionProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getReflectionPropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAspectLang.g:1866:2: this_InternalFunctionProperty_2= ruleInternalFunctionProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getInternalFunctionPropertyParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1885:1: entryRuleInternalFunctionProperty returns [EObject current=null] : iv_ruleInternalFunctionProperty= ruleInternalFunctionProperty EOF ;
    public final EObject entryRuleInternalFunctionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalFunctionProperty = null;


        try {
            // InternalAspectLang.g:1886:2: (iv_ruleInternalFunctionProperty= ruleInternalFunctionProperty EOF )
            // InternalAspectLang.g:1887:2: iv_ruleInternalFunctionProperty= ruleInternalFunctionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalFunctionPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInternalFunctionProperty=ruleInternalFunctionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalFunctionProperty; 
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
    // $ANTLR end "entryRuleInternalFunctionProperty"


    // $ANTLR start "ruleInternalFunctionProperty"
    // InternalAspectLang.g:1894:1: ruleInternalFunctionProperty returns [EObject current=null] : ( (lv_function_0_0= ruleInternalFunction ) ) ;
    public final EObject ruleInternalFunctionProperty() throws RecognitionException {
        EObject current = null;

        Enumerator lv_function_0_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1897:28: ( ( (lv_function_0_0= ruleInternalFunction ) ) )
            // InternalAspectLang.g:1898:1: ( (lv_function_0_0= ruleInternalFunction ) )
            {
            // InternalAspectLang.g:1898:1: ( (lv_function_0_0= ruleInternalFunction ) )
            // InternalAspectLang.g:1899:1: (lv_function_0_0= ruleInternalFunction )
            {
            // InternalAspectLang.g:1899:1: (lv_function_0_0= ruleInternalFunction )
            // InternalAspectLang.g:1900:3: lv_function_0_0= ruleInternalFunction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInternalFunctionPropertyAccess().getFunctionInternalFunctionEnumRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"de.cau.cs.se.instrumentation.al.AspectLang.InternalFunction");
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
    // InternalAspectLang.g:1924:1: entryRuleRuntimeProperty returns [EObject current=null] : iv_ruleRuntimeProperty= ruleRuntimeProperty EOF ;
    public final EObject entryRuleRuntimeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuntimeProperty = null;


        try {
            // InternalAspectLang.g:1925:2: (iv_ruleRuntimeProperty= ruleRuntimeProperty EOF )
            // InternalAspectLang.g:1926:2: iv_ruleRuntimeProperty= ruleRuntimeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuntimePropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRuntimeProperty=ruleRuntimeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuntimeProperty; 
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
    // $ANTLR end "entryRuleRuntimeProperty"


    // $ANTLR start "ruleRuntimeProperty"
    // InternalAspectLang.g:1933:1: ruleRuntimeProperty returns [EObject current=null] : (otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRuntimeProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_reference_1_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1936:28: ( (otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) ) ) )
            // InternalAspectLang.g:1937:1: (otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) ) )
            {
            // InternalAspectLang.g:1937:1: (otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) ) )
            // InternalAspectLang.g:1937:3: otherlv_0= '#' ( (lv_reference_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRuntimePropertyAccess().getNumberSignKeyword_0());
                  
            }
            // InternalAspectLang.g:1941:1: ( (lv_reference_1_0= RULE_ID ) )
            // InternalAspectLang.g:1942:1: (lv_reference_1_0= RULE_ID )
            {
            // InternalAspectLang.g:1942:1: (lv_reference_1_0= RULE_ID )
            // InternalAspectLang.g:1943:3: lv_reference_1_0= RULE_ID
            {
            lv_reference_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
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
    // InternalAspectLang.g:1967:1: entryRuleReflectionProperty returns [EObject current=null] : iv_ruleReflectionProperty= ruleReflectionProperty EOF ;
    public final EObject entryRuleReflectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReflectionProperty = null;


        try {
            // InternalAspectLang.g:1968:2: (iv_ruleReflectionProperty= ruleReflectionProperty EOF )
            // InternalAspectLang.g:1969:2: iv_ruleReflectionProperty= ruleReflectionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReflectionPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReflectionProperty=ruleReflectionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReflectionProperty; 
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
    // $ANTLR end "entryRuleReflectionProperty"


    // $ANTLR start "ruleReflectionProperty"
    // InternalAspectLang.g:1976:1: ruleReflectionProperty returns [EObject current=null] : (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) ) ;
    public final EObject ruleReflectionProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_function_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1979:28: ( (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) ) )
            // InternalAspectLang.g:1980:1: (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) )
            {
            // InternalAspectLang.g:1980:1: (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) )
            // InternalAspectLang.g:1980:3: otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReflectionPropertyAccess().getDollarSignKeyword_0());
                  
            }
            // InternalAspectLang.g:1984:1: ( (lv_function_1_0= ruleReflectionFunction ) )
            // InternalAspectLang.g:1985:1: (lv_function_1_0= ruleReflectionFunction )
            {
            // InternalAspectLang.g:1985:1: (lv_function_1_0= ruleReflectionFunction )
            // InternalAspectLang.g:1986:3: lv_function_1_0= ruleReflectionFunction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReflectionPropertyAccess().getFunctionReflectionFunctionEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"de.cau.cs.se.instrumentation.al.AspectLang.ReflectionFunction");
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
    // InternalAspectLang.g:2010:1: entryRuleContainerNode returns [EObject current=null] : iv_ruleContainerNode= ruleContainerNode EOF ;
    public final EObject entryRuleContainerNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerNode = null;


        try {
            // InternalAspectLang.g:2011:2: (iv_ruleContainerNode= ruleContainerNode EOF )
            // InternalAspectLang.g:2012:2: iv_ruleContainerNode= ruleContainerNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerNode=ruleContainerNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerNode; 
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
    // $ANTLR end "entryRuleContainerNode"


    // $ANTLR start "ruleContainerNode"
    // InternalAspectLang.g:2019:1: ruleContainerNode returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleContainerNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2022:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAspectLang.g:2023:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAspectLang.g:2023:1: ( (otherlv_0= RULE_ID ) )
            // InternalAspectLang.g:2024:1: (otherlv_0= RULE_ID )
            {
            // InternalAspectLang.g:2024:1: (otherlv_0= RULE_ID )
            // InternalAspectLang.g:2025:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getContainerNodeRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:2047:1: entryRuleWildcardNode returns [EObject current=null] : iv_ruleWildcardNode= ruleWildcardNode EOF ;
    public final EObject entryRuleWildcardNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcardNode = null;


        try {
            // InternalAspectLang.g:2048:2: (iv_ruleWildcardNode= ruleWildcardNode EOF )
            // InternalAspectLang.g:2049:2: iv_ruleWildcardNode= ruleWildcardNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWildcardNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWildcardNode=ruleWildcardNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWildcardNode; 
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
    // $ANTLR end "entryRuleWildcardNode"


    // $ANTLR start "ruleWildcardNode"
    // InternalAspectLang.g:2056:1: ruleWildcardNode returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleWildcardNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2059:28: ( ( () otherlv_1= '*' ) )
            // InternalAspectLang.g:2060:1: ( () otherlv_1= '*' )
            {
            // InternalAspectLang.g:2060:1: ( () otherlv_1= '*' )
            // InternalAspectLang.g:2060:2: () otherlv_1= '*'
            {
            // InternalAspectLang.g:2060:2: ()
            // InternalAspectLang.g:2061:2: 
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

            otherlv_1=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:2081:1: entryRuleSubPathNode returns [EObject current=null] : iv_ruleSubPathNode= ruleSubPathNode EOF ;
    public final EObject entryRuleSubPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPathNode = null;


        try {
            // InternalAspectLang.g:2082:2: (iv_ruleSubPathNode= ruleSubPathNode EOF )
            // InternalAspectLang.g:2083:2: iv_ruleSubPathNode= ruleSubPathNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubPathNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubPathNode=ruleSubPathNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubPathNode; 
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
    // $ANTLR end "entryRuleSubPathNode"


    // $ANTLR start "ruleSubPathNode"
    // InternalAspectLang.g:2090:1: ruleSubPathNode returns [EObject current=null] : ( () otherlv_1= '**' ) ;
    public final EObject ruleSubPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2093:28: ( ( () otherlv_1= '**' ) )
            // InternalAspectLang.g:2094:1: ( () otherlv_1= '**' )
            {
            // InternalAspectLang.g:2094:1: ( () otherlv_1= '**' )
            // InternalAspectLang.g:2094:2: () otherlv_1= '**'
            {
            // InternalAspectLang.g:2094:2: ()
            // InternalAspectLang.g:2095:2: 
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

            otherlv_1=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:2115:1: entryRuleParentNode returns [EObject current=null] : iv_ruleParentNode= ruleParentNode EOF ;
    public final EObject entryRuleParentNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentNode = null;


        try {
            // InternalAspectLang.g:2116:2: (iv_ruleParentNode= ruleParentNode EOF )
            // InternalAspectLang.g:2117:2: iv_ruleParentNode= ruleParentNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParentNode=ruleParentNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParentNode; 
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
    // $ANTLR end "entryRuleParentNode"


    // $ANTLR start "ruleParentNode"
    // InternalAspectLang.g:2124:1: ruleParentNode returns [EObject current=null] : ( () otherlv_1= '<<' ) ;
    public final EObject ruleParentNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2127:28: ( ( () otherlv_1= '<<' ) )
            // InternalAspectLang.g:2128:1: ( () otherlv_1= '<<' )
            {
            // InternalAspectLang.g:2128:1: ( () otherlv_1= '<<' )
            // InternalAspectLang.g:2128:2: () otherlv_1= '<<'
            {
            // InternalAspectLang.g:2128:2: ()
            // InternalAspectLang.g:2129:2: 
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

            otherlv_1=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:2149:1: entryRuleCollector returns [EObject current=null] : iv_ruleCollector= ruleCollector EOF ;
    public final EObject entryRuleCollector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollector = null;


        try {
            // InternalAspectLang.g:2150:2: (iv_ruleCollector= ruleCollector EOF )
            // InternalAspectLang.g:2151:2: iv_ruleCollector= ruleCollector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollector=ruleCollector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollector; 
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
    // $ANTLR end "entryRuleCollector"


    // $ANTLR start "ruleCollector"
    // InternalAspectLang.g:2158:1: ruleCollector returns [EObject current=null] : ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( (lv_events_1_0= ruleEvent ) )+ ) ;
    public final EObject ruleCollector() throws RecognitionException {
        EObject current = null;

        Enumerator lv_insertionPoint_0_0 = null;

        EObject lv_events_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2161:28: ( ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( (lv_events_1_0= ruleEvent ) )+ ) )
            // InternalAspectLang.g:2162:1: ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( (lv_events_1_0= ruleEvent ) )+ )
            {
            // InternalAspectLang.g:2162:1: ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( (lv_events_1_0= ruleEvent ) )+ )
            // InternalAspectLang.g:2162:2: ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( (lv_events_1_0= ruleEvent ) )+
            {
            // InternalAspectLang.g:2162:2: ( (lv_insertionPoint_0_0= ruleInsertionPoint ) )
            // InternalAspectLang.g:2163:1: (lv_insertionPoint_0_0= ruleInsertionPoint )
            {
            // InternalAspectLang.g:2163:1: (lv_insertionPoint_0_0= ruleInsertionPoint )
            // InternalAspectLang.g:2164:3: lv_insertionPoint_0_0= ruleInsertionPoint
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectorAccess().getInsertionPointInsertionPointEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_3);
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
                      		"de.cau.cs.se.instrumentation.al.AspectLang.InsertionPoint");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAspectLang.g:2180:2: ( (lv_events_1_0= ruleEvent ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAspectLang.g:2181:1: (lv_events_1_0= ruleEvent )
            	    {
            	    // InternalAspectLang.g:2181:1: (lv_events_1_0= ruleEvent )
            	    // InternalAspectLang.g:2182:3: lv_events_1_0= ruleEvent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCollectorAccess().getEventsEventParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_events_1_0=ruleEvent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCollectorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"events",
            	              		lv_events_1_0, 
            	              		"de.cau.cs.se.instrumentation.al.AspectLang.Event");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
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
    // $ANTLR end "ruleCollector"


    // $ANTLR start "entryRuleEvent"
    // InternalAspectLang.g:2206:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalAspectLang.g:2207:2: (iv_ruleEvent= ruleEvent EOF )
            // InternalAspectLang.g:2208:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalAspectLang.g:2215:1: ruleEvent returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_initializations_2_0 = null;

        EObject lv_initializations_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2218:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )* )? otherlv_5= ')' ) )
            // InternalAspectLang.g:2219:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )* )? otherlv_5= ')' )
            {
            // InternalAspectLang.g:2219:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )* )? otherlv_5= ')' )
            // InternalAspectLang.g:2219:2: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )* )? otherlv_5= ')'
            {
            // InternalAspectLang.g:2219:2: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:2220:1: ( ruleQualifiedName )
            {
            // InternalAspectLang.g:2220:1: ( ruleQualifiedName )
            // InternalAspectLang.g:2221:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEventRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventAccess().getTypeRecordTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_34);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalAspectLang.g:2241:1: ( ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_INT)||LA36_0==18||(LA36_0>=34 && LA36_0<=37)||(LA36_0>=42 && LA36_0<=44)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAspectLang.g:2241:2: ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )*
                    {
                    // InternalAspectLang.g:2241:2: ( (lv_initializations_2_0= ruleValue ) )
                    // InternalAspectLang.g:2242:1: (lv_initializations_2_0= ruleValue )
                    {
                    // InternalAspectLang.g:2242:1: (lv_initializations_2_0= ruleValue )
                    // InternalAspectLang.g:2243:3: lv_initializations_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventAccess().getInitializationsValueParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_15);
                    lv_initializations_2_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEventRule());
                      	        }
                             		add(
                             			current, 
                             			"initializations",
                              		lv_initializations_2_0, 
                              		"de.cau.cs.se.instrumentation.al.AspectLang.Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAspectLang.g:2259:2: (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==21) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalAspectLang.g:2259:4: otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getEventAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // InternalAspectLang.g:2263:1: ( (lv_initializations_4_0= ruleValue ) )
                    	    // InternalAspectLang.g:2264:1: (lv_initializations_4_0= ruleValue )
                    	    {
                    	    // InternalAspectLang.g:2264:1: (lv_initializations_4_0= ruleValue )
                    	    // InternalAspectLang.g:2265:3: lv_initializations_4_0= ruleValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEventAccess().getInitializationsValueParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_15);
                    	    lv_initializations_4_0=ruleValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"initializations",
                    	              		lv_initializations_4_0, 
                    	              		"de.cau.cs.se.instrumentation.al.AspectLang.Value");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEventAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "ruleQueryModifier"
    // InternalAspectLang.g:2293:1: ruleQueryModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) ) ;
    public final Enumerator ruleQueryModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2295:28: ( ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) ) )
            // InternalAspectLang.g:2296:1: ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) )
            {
            // InternalAspectLang.g:2296:1: ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==38) ) {
                alt37=1;
            }
            else if ( (LA37_0==39) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalAspectLang.g:2296:2: (enumLiteral_0= 'include' )
                    {
                    // InternalAspectLang.g:2296:2: (enumLiteral_0= 'include' )
                    // InternalAspectLang.g:2296:4: enumLiteral_0= 'include'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getQueryModifierAccess().getINCLUDEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getQueryModifierAccess().getINCLUDEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2302:6: (enumLiteral_1= 'exclude' )
                    {
                    // InternalAspectLang.g:2302:6: (enumLiteral_1= 'exclude' )
                    // InternalAspectLang.g:2302:8: enumLiteral_1= 'exclude'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleLogicOperator"
    // InternalAspectLang.g:2312:1: ruleLogicOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) ;
    public final Enumerator ruleLogicOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2314:28: ( ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) )
            // InternalAspectLang.g:2315:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            {
            // InternalAspectLang.g:2315:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            else if ( (LA38_0==41) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalAspectLang.g:2315:2: (enumLiteral_0= '&&' )
                    {
                    // InternalAspectLang.g:2315:2: (enumLiteral_0= '&&' )
                    // InternalAspectLang.g:2315:4: enumLiteral_0= '&&'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2321:6: (enumLiteral_1= '||' )
                    {
                    // InternalAspectLang.g:2321:6: (enumLiteral_1= '||' )
                    // InternalAspectLang.g:2321:8: enumLiteral_1= '||'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleLogicOperator"


    // $ANTLR start "ruleInternalFunction"
    // InternalAspectLang.g:2331:1: ruleInternalFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) ) ;
    public final Enumerator ruleInternalFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2333:28: ( ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) ) )
            // InternalAspectLang.g:2334:1: ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) )
            {
            // InternalAspectLang.g:2334:1: ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt39=1;
                }
                break;
            case 43:
                {
                alt39=2;
                }
                break;
            case 44:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalAspectLang.g:2334:2: (enumLiteral_0= 'time' )
                    {
                    // InternalAspectLang.g:2334:2: (enumLiteral_0= 'time' )
                    // InternalAspectLang.g:2334:4: enumLiteral_0= 'time'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getInternalFunctionAccess().getTIMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getInternalFunctionAccess().getTIMEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2340:6: (enumLiteral_1= 'traceId' )
                    {
                    // InternalAspectLang.g:2340:6: (enumLiteral_1= 'traceId' )
                    // InternalAspectLang.g:2340:8: enumLiteral_1= 'traceId'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getInternalFunctionAccess().getTRACE_IDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getInternalFunctionAccess().getTRACE_IDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:2346:6: (enumLiteral_2= 'orderIndex' )
                    {
                    // InternalAspectLang.g:2346:6: (enumLiteral_2= 'orderIndex' )
                    // InternalAspectLang.g:2346:8: enumLiteral_2= 'orderIndex'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:2356:1: ruleReflectionFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'classname' ) | (enumLiteral_3= 'return-type' ) ) ;
    public final Enumerator ruleReflectionFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2358:28: ( ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'classname' ) | (enumLiteral_3= 'return-type' ) ) )
            // InternalAspectLang.g:2359:1: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'classname' ) | (enumLiteral_3= 'return-type' ) )
            {
            // InternalAspectLang.g:2359:1: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'classname' ) | (enumLiteral_3= 'return-type' ) )
            int alt40=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt40=1;
                }
                break;
            case 46:
                {
                alt40=2;
                }
                break;
            case 47:
                {
                alt40=3;
                }
                break;
            case 48:
                {
                alt40=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalAspectLang.g:2359:2: (enumLiteral_0= 'name' )
                    {
                    // InternalAspectLang.g:2359:2: (enumLiteral_0= 'name' )
                    // InternalAspectLang.g:2359:4: enumLiteral_0= 'name'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2365:6: (enumLiteral_1= 'signature' )
                    {
                    // InternalAspectLang.g:2365:6: (enumLiteral_1= 'signature' )
                    // InternalAspectLang.g:2365:8: enumLiteral_1= 'signature'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:2371:6: (enumLiteral_2= 'classname' )
                    {
                    // InternalAspectLang.g:2371:6: (enumLiteral_2= 'classname' )
                    // InternalAspectLang.g:2371:8: enumLiteral_2= 'classname'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAspectLang.g:2377:6: (enumLiteral_3= 'return-type' )
                    {
                    // InternalAspectLang.g:2377:6: (enumLiteral_3= 'return-type' )
                    // InternalAspectLang.g:2377:8: enumLiteral_3= 'return-type'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleInsertionPoint"
    // InternalAspectLang.g:2389:1: ruleInsertionPoint returns [Enumerator current=null] : ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) ) ;
    public final Enumerator ruleInsertionPoint() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2391:28: ( ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) ) )
            // InternalAspectLang.g:2392:1: ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) )
            {
            // InternalAspectLang.g:2392:1: ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==49) ) {
                alt41=1;
            }
            else if ( (LA41_0==50) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalAspectLang.g:2392:2: (enumLiteral_0= 'before' )
                    {
                    // InternalAspectLang.g:2392:2: (enumLiteral_0= 'before' )
                    // InternalAspectLang.g:2392:4: enumLiteral_0= 'before'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2398:6: (enumLiteral_1= 'after' )
                    {
                    // InternalAspectLang.g:2398:6: (enumLiteral_1= 'after' )
                    // InternalAspectLang.g:2398:8: enumLiteral_1= 'after'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred19_InternalAspectLang
    public final void synpred19_InternalAspectLang_fragment() throws RecognitionException {   
        Token otherlv_1=null;

        // InternalAspectLang.g:956:1: ( (otherlv_1= RULE_ID ) )
        // InternalAspectLang.g:956:1: (otherlv_1= RULE_ID )
        {
        // InternalAspectLang.g:956:1: (otherlv_1= RULE_ID )
        // InternalAspectLang.g:957:3: otherlv_1= RULE_ID
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalAspectLang

    // $ANTLR start synpred24_InternalAspectLang
    public final void synpred24_InternalAspectLang_fragment() throws RecognitionException {   
        Token otherlv_0=null;

        // InternalAspectLang.g:1078:1: ( (otherlv_0= RULE_ID ) )
        // InternalAspectLang.g:1078:1: (otherlv_0= RULE_ID )
        {
        // InternalAspectLang.g:1078:1: (otherlv_0= RULE_ID )
        // InternalAspectLang.g:1079:3: otherlv_0= RULE_ID
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalAspectLang

    // $ANTLR start synpred36_InternalAspectLang
    public final void synpred36_InternalAspectLang_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


        // InternalAspectLang.g:1527:2: ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleValue ) ) )
        // InternalAspectLang.g:1527:2: () ( (lv_operator_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleValue ) )
        {
        // InternalAspectLang.g:1527:2: ()
        // InternalAspectLang.g:1528:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // InternalAspectLang.g:1536:2: ( (lv_operator_2_0= ruleLogicOperator ) )
        // InternalAspectLang.g:1537:1: (lv_operator_2_0= ruleLogicOperator )
        {
        // InternalAspectLang.g:1537:1: (lv_operator_2_0= ruleLogicOperator )
        // InternalAspectLang.g:1538:3: lv_operator_2_0= ruleLogicOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getParamCompareAccess().getOperatorLogicOperatorEnumRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_16);
        lv_operator_2_0=ruleLogicOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalAspectLang.g:1554:2: ( (lv_right_3_0= ruleValue ) )
        // InternalAspectLang.g:1555:1: (lv_right_3_0= ruleValue )
        {
        // InternalAspectLang.g:1555:1: (lv_right_3_0= ruleValue )
        // InternalAspectLang.g:1556:3: lv_right_3_0= ruleValue
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getParamCompareAccess().getRightValueParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred36_InternalAspectLang

    // Delegated rules

    public final boolean synpred19_InternalAspectLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalAspectLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalAspectLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalAspectLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalAspectLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalAspectLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA30 dfa30 = new DFA30(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\3\21\uffff";
    static final String dfa_3s = "\1\4\2\0\17\uffff";
    static final String dfa_4s = "\1\54\2\0\17\uffff";
    static final String dfa_5s = "\3\uffff\1\2\15\uffff\1\1";
    static final String dfa_6s = "\1\uffff\1\0\1\1\17\uffff}>";
    static final String[] dfa_7s = {
            "\4\3\12\uffff\1\3\16\uffff\5\3\2\uffff\1\1\1\2\3\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1527:1: ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleValue ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalAspectLang()) ) {s = 17;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_2 = input.LA(1);

                         
                        int index30_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalAspectLang()) ) {s = 17;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index30_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000009108C002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000091088002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000091080002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00001C3C008400F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00001C3C000400F0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0006000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000003000040010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000C002020002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003004040010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00001C3E000400F0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001E00000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000400000L});

}